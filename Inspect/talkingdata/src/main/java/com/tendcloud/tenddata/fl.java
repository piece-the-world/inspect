/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Message
 *  android.util.Log
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.tendcloud.tenddata;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.tendcloud.tenddata.TalkingDataSMS;
import com.tendcloud.tenddata.TalkingDataSMSApplyCallback;
import com.tendcloud.tenddata.TalkingDataSMSVerifyCallback;
import com.tendcloud.tenddata.fm;
import com.tendcloud.tenddata.fn;
import com.tendcloud.tenddata.fo;
import com.tendcloud.tenddata.fr;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

final class fl {
    HashMap a = new HashMap();
    static final String b = "eauth.xdrig.com";
    static final String c = null;
    static final String d = "v1";
    static final String e = "https";
    static final String f = "https://eauth.xdrig.com/smsauth/v1/";
    private static final int g = 20000;
    private static long h = 0;
    private static TalkingDataSMSApplyCallback i = null;
    private static TalkingDataSMSVerifyCallback j = null;
    private static String k = "";
    private static volatile fl l = null;

    fl() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static fl a() {
        if (l != null) return l;
        reference var0 = fl.class;
        synchronized (fl.class) {
            if (l != null) return l;
            {
                l = new fl();
            }
            // ** MonitorExit[var0] (shouldn't be in output)
            return l;
        }
    }

    void a(Bundle bundle) {
        fo.a();
        fo.b();
        fo.c();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appKey", (Object)fo.i);
            jSONObject.put("service", (Object)"sms");
            fo.e.put("appKey", (Object)new JSONArray().put((Object)jSONObject));
        }
        catch (Throwable var2_3) {
            // empty catch block
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public synchronized void onResponse(Bundle bundle) {
        block11 : {
            try {
                if (!bundle.getString("action").equals("SMS")) break block11;
                int n2 = bundle.getInt("status");
                if (n2 != 200 && k.equals("apply") || k.equals("verify") && n2 == 200) {
                    h = 0;
                }
                String string = bundle.getString("message");
                JSONObject jSONObject = null;
                try {
                    jSONObject = new JSONObject(string);
                }
                catch (Exception var5_6) {
                    this.a(k, n2, "SMS SDK inner error.");
                }
                if (n2 != 200 && jSONObject.has("errorMessage")) {
                    if (n2 == 600) {
                        this.a(k, n2, "SMS SDK inner error.");
                    } else {
                        this.a(k, n2, jSONObject.getString("errorMessage"));
                    }
                    return;
                }
                if (n2 == 200 && jSONObject.has("transactionId")) {
                    this.a(k, n2, jSONObject.getString("transactionId"));
                    return;
                }
            }
            catch (Throwable var2_3) {
            }
        }
    }

    public void b() {
        try {
            if (!this.c()) {
                Log.d((String)"TalkingDataSDK", (String)"The parameter should be number.");
                return;
            }
            TalkingDataSMSApplyCallback talkingDataSMSApplyCallback = null;
            TalkingDataSMSVerifyCallback talkingDataSMSVerifyCallback = null;
            k = this.a.get("action").toString();
            if (k.equals("apply")) {
                talkingDataSMSApplyCallback = (TalkingDataSMSApplyCallback)this.a.get("callback");
            } else if (k.equals("verify")) {
                talkingDataSMSVerifyCallback = (TalkingDataSMSVerifyCallback)this.a.get("callback");
            }
            if (k.equals("apply") && System.currentTimeMillis() - h <= 60000) {
                this.a(k, 611, "Only one apply request can be handled in 60s.", talkingDataSMSApplyCallback);
                return;
            }
            if (k.equals("verify") && j != null) {
                this.a(k, 612, "The verification request is too frequent, please try again later.", talkingDataSMSVerifyCallback);
                return;
            }
            if (k.equals("apply")) {
                i = talkingDataSMSApplyCallback;
            } else if (k.equals("verify")) {
                j = talkingDataSMSVerifyCallback;
            }
            byte[] arrby = this.d();
            if (arrby == null) {
                throw new Exception("SMS SDK inner error.");
            }
            if (k.equals("apply")) {
                h = System.currentTimeMillis();
            }
            Message message = new Message();
            Bundle bundle = new Bundle();
            bundle.putString("action", k);
            if (k.equals("verify")) {
                bundle.putInt("timeout", 20000);
            }
            message.setData(bundle);
            message.obj = arrby;
            fr.a.sendMessage(message);
        }
        catch (Throwable var1_2) {
            this.a(k, 614, "SMS SDK inner error.");
        }
    }

    private boolean c() {
        String string = this.a.get("mobile").toString();
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher matcher = pattern.matcher(string);
        boolean bl2 = matcher.matches();
        String string2 = this.a.get("countryCode").toString();
        Pattern pattern2 = Pattern.compile("[0-9]*");
        Matcher matcher2 = pattern2.matcher(string2);
        boolean bl3 = matcher2.matches();
        return bl2 && bl3;
    }

    private byte[] d() {
        JSONObject jSONObject = null;
        try {
            jSONObject = new JSONObject(fo.a("JSON"));
            JSONObject jSONObject2 = jSONObject.getJSONObject("action");
            jSONObject2.put("domain", (Object)"sms");
            jSONObject2.put("name", (Object)k);
            HashMap<String, String> hashMap = new HashMap<String, String>();
            hashMap.put("mobile", this.a.get("mobile").toString());
            hashMap.put("secretId", fo.j);
            hashMap.put("countryCode", this.a.get("countryCode").toString());
            if (k.equals("verify")) {
                hashMap.put("securityCode", this.a.get("securityCode").toString());
            }
            if (k.equals("apply") && this.a.get("transactionId") != null) {
                hashMap.put("transactionId", this.a.get("transactionId").toString());
            }
            jSONObject2.put("data", (Object)new JSONObject(hashMap));
        }
        catch (Throwable var2_3) {
            this.a(k, 614, "SMS SDK inner error");
        }
        return jSONObject == null ? null : jSONObject.toString().getBytes();
    }

    private void a(String string, int n2, String string2) {
        if (string.equals("verify") && j != null) {
            this.a(string, n2, string2, j);
            j = null;
        } else if (string.equals("apply") && i != null) {
            this.a(string, n2, string2, i);
            i = null;
        }
    }

    private void a(String string, int n2, String string2, TalkingDataSMSApplyCallback talkingDataSMSApplyCallback) {
        try {
            if (TalkingDataSMS.c != null) {
                TalkingDataSMS.c.post((Runnable)new fm(this, string, talkingDataSMSApplyCallback, n2, string2));
            } else {
                Log.e((String)"TalkingDataSDK", (String)"The method of initSMS has not be called or init failed.");
            }
        }
        catch (Throwable var5_5) {
            // empty catch block
        }
    }

    private void a(String string, int n2, String string2, TalkingDataSMSVerifyCallback talkingDataSMSVerifyCallback) {
        try {
            if (TalkingDataSMS.c != null) {
                TalkingDataSMS.c.post((Runnable)new fn(this, string, talkingDataSMSVerifyCallback, n2, string2));
            } else {
                Log.e((String)"TalkingDataSDK", (String)"The method of initSMS has not be called or init failed.");
            }
        }
        catch (Throwable var5_5) {
            // empty catch block
        }
    }
}

