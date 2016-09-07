/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.util.Log
 */
package com.tendcloud.tenddata;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.tendcloud.tenddata.TalkingDataSMSApplyCallback;
import com.tendcloud.tenddata.TalkingDataSMSVerifyCallback;
import com.tendcloud.tenddata.fl;
import com.tendcloud.tenddata.fo;
import com.tendcloud.tenddata.fp;
import java.util.HashMap;

public final class TalkingDataSMS {
    static final String a = "TalkingDataSDK";
    static Context b = null;
    static Handler c = null;

    public static void init(Context context, String string, String string2) {
        Log.d((String)"TalkingDataSDK", (String)"TalkingData SMS SDK version:1.0.0");
        if (string == null || string.equals("")) {
            Log.e((String)"TalkingDataSDK", (String)"The parameter of appId should not be null.");
            return;
        }
        Log.d((String)"TalkingDataSDK", (String)("init appId:" + string));
        if (string2 == null || string2.equals("")) {
            Log.e((String)"TalkingDataSDK", (String)"The parameter of secretId should not be null");
            return;
        }
        try {
            fo.i = string;
            fo.j = string2;
            b = context;
            c = new Handler(context.getMainLooper());
            fl fl2 = new fl();
            fl2.a.put("action", "init");
            fl2.a.put("category", "SMS");
            Message message = Message.obtain();
            message.what = 101;
            message.obj = fl2;
            fp.a().sendMessage(message);
        }
        catch (Throwable var3_4) {
            // empty catch block
        }
    }

    public static final void applyAuthCode(String string, String string2, TalkingDataSMSApplyCallback talkingDataSMSApplyCallback) {
        TalkingDataSMS.reapplyAuthCode(string, string2, null, talkingDataSMSApplyCallback);
    }

    public static final void reapplyAuthCode(String string, String string2, String string3, TalkingDataSMSApplyCallback talkingDataSMSApplyCallback) {
        if (string == null || string.equals("")) {
            Log.e((String)"TalkingDataSDK", (String)"The parameter of countryCode should not be null.");
            return;
        }
        if (string2 == null || string2.equals("")) {
            Log.e((String)"TalkingDataSDK", (String)"The parameter of mobile should not be null");
            return;
        }
        try {
            fl fl2 = new fl();
            fl2.a.put("countryCode", string);
            fl2.a.put("mobile", string2);
            fl2.a.put("action", "apply");
            fl2.a.put("transactionId", string3);
            fl2.a.put("callback", talkingDataSMSApplyCallback);
            Message message = Message.obtain();
            message.what = 102;
            message.obj = fl2;
            fp.a().sendMessage(message);
        }
        catch (Throwable var4_5) {
            // empty catch block
        }
    }

    public static final void verifyAuthCode(String string, String string2, String string3, TalkingDataSMSVerifyCallback talkingDataSMSVerifyCallback) {
        if (string == null || string.equals("")) {
            Log.e((String)"TalkingDataSDK", (String)"The parameter of countryCode should not be null.");
            return;
        }
        if (string2 == null || string2.equals("")) {
            Log.e((String)"TalkingDataSDK", (String)"The parameter of mobile should not be null");
            return;
        }
        if (string3 == null || string3.equals("")) {
            Log.e((String)"TalkingDataSDK", (String)"The parameter of securityCode should not be null");
            return;
        }
        try {
            fl fl2 = new fl();
            fl2.a.put("countryCode", string);
            fl2.a.put("mobile", string2);
            fl2.a.put("securityCode", string3);
            fl2.a.put("action", "verify");
            fl2.a.put("callback", talkingDataSMSVerifyCallback);
            Message message = Message.obtain();
            message.what = 102;
            message.obj = fl2;
            fp.a().sendMessage(message);
        }
        catch (Throwable var4_5) {
            // empty catch block
        }
    }
}

