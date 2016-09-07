/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.PowerManager
 *  android.os.PowerManager$WakeLock
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.tendcloud.tenddata;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.tendcloud.tenddata.az;
import com.tendcloud.tenddata.bh;
import com.tendcloud.tenddata.bw;
import com.tendcloud.tenddata.by;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class bo {
    private static String a = bo.class.getName();

    public static void a(Context context) {
        by.a(context, "service-ping");
    }

    public static void a(Context context, Intent intent) {
        String string = intent.getStringExtra("service-cmd");
        if ("service-relive".equals(string)) {
            bh.a(context.getPackageName(), "relive at " + new Date());
            by.a(context, "service-start");
        } else if ("service-ping".equals(string)) {
            bh.a(context.getPackageName(), "ping at " + new Date());
        } else if ("service-wake-up".equals(string)) {
            try {
                PowerManager powerManager = (PowerManager)context.getSystemService("power");
                PowerManager.WakeLock wakeLock = powerManager.newWakeLock(268435482, "Gank");
                wakeLock.acquire(30000);
            }
            catch (Exception var3_4) {
                bh.c(a, var3_4.getMessage());
            }
        }
    }

    public static void b(Context context, Intent intent) {
        String string = intent.getStringExtra("mpush_message");
        if (az.a(string)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (!bo.a(context, jSONObject.optString("app"))) {
                return;
            }
            String string2 = jSONObject.optString("id");
            String string3 = jSONObject.optString("title");
            String string4 = jSONObject.optString("content");
            HashMap hashMap = bo.a(jSONObject);
            Intent intent2 = bo.b(jSONObject);
            intent2.setPackage(context.getPackageName());
            intent2.setAction("android.talkingdata.action.media.SILENT");
            context.sendBroadcast(intent2);
            if (hashMap != null && hashMap.size() > 0) {
                bh.a(a, "silent title->" + string3 + " content->" + string4 + " extention->" + hashMap.toString());
            } else {
                bh.a(a, "silent title->" + string3 + " content->" + string4);
            }
        }
        catch (JSONException var3_4) {
            bh.b(a, var3_4.getMessage());
        }
    }

    private static boolean a(Context context, String string) {
        return bw.c(context).equals(string);
    }

    private static HashMap a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (!jSONObject.isNull("ex")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("ex");
            hashMap = bw.c(jSONObject2.toString());
        }
        return hashMap;
    }

    private static Intent b(JSONObject jSONObject) {
        Intent intent = new Intent();
        try {
            String string = jSONObject.optString("title");
            String string2 = jSONObject.optString("content");
            HashMap hashMap = bo.a(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("title", (Object)string);
            jSONObject2.put("content", (Object)string2);
            jSONObject2.put("ex", (Object)jSONObject.optJSONObject("ex"));
            intent.putExtra("title", string);
            intent.putExtra("content", string2);
            intent.putExtra("ex", (Serializable)hashMap);
            intent.putExtra("message_string", jSONObject2.toString());
            intent.putExtra("mpush_message_string", jSONObject.toString());
        }
        catch (Throwable var2_3) {
            bh.a(a, "get msg error", var2_3);
        }
        return intent;
    }
}

