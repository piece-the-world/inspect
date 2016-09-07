/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.app.NotificationManager
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.os.Bundle
 *  android.os.Message
 *  android.util.Log
 *  org.json.JSONObject
 */
package com.tendcloud.tenddata;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import com.tendcloud.tenddata.ab;
import com.tendcloud.tenddata.cm;
import com.tendcloud.tenddata.cs;
import com.tendcloud.tenddata.fc;
import com.tendcloud.tenddata.ff;
import com.tendcloud.tenddata.fg;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

public class TalkingDataAppMessageReceiver
extends BroadcastReceiver {
    public static final String TALKINGDATA_NOTIFICATION_CLICK = "com.talkingdata.notification.click";
    public static final String TALKINGDATA_NOTIFICATION_CANCEL = "com.talkingdata.notification.cancel";
    public static final String TALKINGDATA_MESSAGE_CLICK = "com.talkingdata.message.click";
    static String a = TalkingDataAppMessageReceiver.class.getSimpleName();
    static final String b = "TalkingData_Push_SharedPreferences";

    public void onReceive(Context context, Intent intent) {
        block24 : {
            try {
                String string;
                String string2 = cm.b(context, "TD_app_pefercen_profile", "TD_appId", null);
                String string3 = intent.getStringExtra("appkey");
                if (string2 == null || string3 != null && !string3.equals(string2)) {
                    return;
                }
                if (ab.mContext == null) {
                    ab.mContext = context;
                }
                if ((string = intent.getAction()).equals("com.baidu.android.pushservice.action.MESSAGE")) {
                    String string4 = intent.getExtras().getString("message_string");
                    this.a(context, string4);
                    break block24;
                }
                if (string.equals("com.baidu.android.pushservice.action.notification.CLICK")) break block24;
                if (string.equals("com.baidu.android.pushservice.action.RECEIVE")) {
                    if (intent.getByteArrayExtra("content") != null) {
                        String string5 = new String(intent.getByteArrayExtra("content"));
                        TalkingDataAppMessageReceiver.a(context, string5, a.a);
                    } else {
                        Log.e((String)a, (String)"BAIDU push id is null");
                    }
                    break block24;
                }
                if (string.equals("cn.jpush.android.intent.REGISTRATION")) {
                    Bundle bundle = intent.getExtras();
                    String string6 = bundle.getString("cn.jpush.android.REGISTRATION_ID");
                    TalkingDataAppMessageReceiver.a(context, string6, a.c);
                    break block24;
                }
                if (string.equals("cn.jpush.android.intent.MESSAGE_RECEIVED")) {
                    Bundle bundle = intent.getExtras();
                    String string7 = bundle.getString("cn.jpush.android.MESSAGE");
                    this.a(context, string7);
                    break block24;
                }
                if (string.equals("com.talkingdata.notification.click")) {
                    Bundle bundle = intent.getExtras();
                    int n2 = bundle.getInt("id", 0);
                    NotificationManager notificationManager = (NotificationManager)context.getSystemService("notification");
                    if (n2 != 0) {
                        notificationManager.cancel(n2);
                    }
                    this.a(context, intent);
                    break block24;
                }
                if (string.equals("com.talkingdata.notification.cancel")) {
                    String string8 = intent.getStringExtra("sign");
                    Message message = Message.obtain();
                    message.what = 103;
                    message.obj = new ff(string8, null, ff.a.e, 0);
                    fg.a().sendMessage(message);
                    break block24;
                }
                if (string.equals("com.talkingdata.message.click")) break block24;
                if (string.startsWith("com.igexin.sdk.action")) {
                    Bundle bundle = intent.getExtras();
                    switch (bundle.getInt("action")) {
                        case 10001: {
                            byte[] arrby = bundle.getByteArray("payload");
                            if (arrby == null) break;
                            String string9 = new String(arrby);
                            this.a(context, string9);
                            break;
                        }
                        case 10002: {
                            String string10 = bundle.getString("clientid");
                            TalkingDataAppMessageReceiver.a(context, string10, a.b);
                            break;
                        }
                    }
                    break block24;
                }
                if (string.equals("android.talkingdata.action.media.SILENT")) {
                    String string11 = intent.getStringExtra("mpush_message_string");
                    try {
                        JSONObject jSONObject = new JSONObject(string11);
                        String string12 = jSONObject.getString("app");
                        String string13 = "app-" + ab.a(context);
                        if (!string12.equals(string13)) {
                            return;
                        }
                        if (!fc.a) {
                            this.a(context, jSONObject.getString("content"));
                        }
                        break block24;
                    }
                    catch (Throwable var7_22) {}
                    break block24;
                }
                if (string.equals("android.talkingdata.action.media.TD.TOKEN")) {
                    String string14 = intent.getStringExtra("mpush_token");
                    TalkingDataAppMessageReceiver.a(context, string14, a.d);
                }
            }
            catch (Throwable var3_4) {
                // empty catch block
            }
        }
    }

    private void a(Context context, Intent intent) {
        block9 : {
            try {
                String string = intent.getStringExtra("custom");
                String string2 = intent.getStringExtra("sign");
                String string3 = intent.getStringExtra("appkey");
                String string4 = intent.getStringExtra("ex");
                HashMap hashMap = null;
                if (!string3.equals(ab.a(context))) {
                    return;
                }
                if (string4 != null) {
                    hashMap = TalkingDataAppMessageReceiver.getMapFromJsonString(string4);
                }
                Message message = Message.obtain();
                message.what = 103;
                message.obj = new ff(string2, null, ff.a.b, 0);
                fg.a().sendMessage(message);
                if (string != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        if (jSONObject.isNull("activity")) {
                            String string5 = context.getPackageName();
                            Intent intent2 = context.getPackageManager().getLaunchIntentForPackage(string5);
                            intent2.putExtra("custom", string);
                            context.startActivity(intent2);
                            break block9;
                        }
                        String string6 = jSONObject.getString("activity");
                        Intent intent3 = new Intent();
                        intent3.setClassName(context, string6);
                        intent3.addFlags(268435456);
                        intent3.putExtra("custom", string);
                        context.startActivity(intent3);
                    }
                    catch (Throwable var9_11) {}
                    break block9;
                }
                String string7 = context.getPackageName();
                Intent intent4 = context.getPackageManager().getLaunchIntentForPackage(string7);
                if (hashMap != null) {
                    intent4.putExtra("ex", (Serializable)hashMap);
                }
                intent4.addFlags(536870912);
                context.startActivity(intent4);
            }
            catch (Throwable var3_4) {
                // empty catch block
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void a(Context context, String string) {
        try {
            int n2;
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject == null) return;
            if (jSONObject.has("sign")) {
                String string2 = jSONObject.getString("sign");
                Message message = Message.obtain();
                message.what = 103;
                message.obj = new ff(string2, null, ff.a.a, 0);
                fg.a().sendMessage(message);
            }
            if ((n2 = jSONObject.getInt("type")) == 1) {
                fc.a(context, jSONObject);
                return;
            }
            if (n2 != 2 && n2 != 3 && n2 != 4) return;
        }
        catch (Throwable var3_4) {
            // empty catch block
        }
    }

    static synchronized void a(Context context, String string, a a2) {
        String string2;
        String string3 = cs.c(context, TalkingDataAppMessageReceiver.a(a2));
        if (a2 == a.d && string3 == null) {
            string3 = cm.b(context, "TD_app_pefercen_profile", "TD_appId", null);
        }
        if (string3 != null && ((string2 = cm.b(context, "TalkingData_Push_SharedPreferences", (Object)((Object)a2) + string3, null)) == null || string2 != null && !string2.equalsIgnoreCase(string))) {
            Message message = Message.obtain();
            message.what = 102;
            message.obj = new ff(string3, string, a2.name());
            fg.a().sendMessage(message);
            cm.a(ab.mContext, "TalkingData_Push_SharedPreferences", a2.name() + string3, string);
        }
    }

    static String a(a a2) {
        String string = "PUSH_APPID";
        switch (a2) {
            case a: {
                string = "api_key";
                break;
            }
            case b: {
                break;
            }
            case c: {
                string = "JPUSH_APPKEY";
                break;
            }
            case d: {
                string = "TD_APP_ID";
                break;
            }
        }
        return string;
    }

    public static HashMap getMapFromJsonString(String string) {
        try {
            JSONObject jSONObject = new JSONObject(string);
            Iterator iterator = jSONObject.keys();
            HashMap<String, String> hashMap = new HashMap<String, String>();
            while (iterator.hasNext()) {
                String string2 = (String)iterator.next();
                String string3 = jSONObject.get(string2).toString();
                hashMap.put(string2, string3);
            }
            return hashMap;
        }
        catch (Exception var2_3) {
            return null;
        }
    }

    static enum a {
        a,
        b,
        c,
        d;
        

        private a() {
        }
    }

}

