/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.util.Log
 */
package com.tendcloud.tenddata;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.tendcloud.tenddata.AgentOption;
import com.tendcloud.tenddata.ab;
import com.tendcloud.tenddata.ag;
import com.tendcloud.tenddata.ao;
import com.tendcloud.tenddata.eh;
import com.tendcloud.tenddata.fc;
import com.tendcloud.tenddata.fu;
import com.tendcloud.tenddata.u;
import com.tendcloud.tenddata.zz;
import java.util.Map;

public final class TCAgent {
    private static ao a;
    public static boolean LOG_ON;
    public static boolean ENABLE_MULTI_PROCESS_POST;

    public static synchronized void init(Context context) {
        try {
            TCAgent.a(context);
            a.a(context);
        }
        catch (Throwable var1_1) {
            var1_1.printStackTrace();
        }
    }

    public static synchronized void init(Context context, String string, String string2) {
        try {
            TCAgent.a(context);
            a.a(context, string, string2);
        }
        catch (Throwable var3_3) {
            var3_3.printStackTrace();
        }
    }

    public static String getAppId(Context context) {
        return ab.a(context);
    }

    public static String getPartnerId(Context context) {
        return ab.getPartnerId(context);
    }

    public static boolean getSDKInitialized() {
        return fu.b;
    }

    public static void setPushDisabled() {
        fc.a = true;
    }

    public static synchronized String getDeviceId(Context context) {
        try {
            TCAgent.a(context);
            return a.b(context);
        }
        catch (Throwable var1_1) {
            var1_1.printStackTrace();
            return null;
        }
    }

    @Deprecated
    public static void onResume(Activity activity, String string, String string2) {
        try {
            TCAgent.a((Context)activity);
            a.onResume(activity, string, string2);
        }
        catch (Throwable var3_3) {
            var3_3.printStackTrace();
        }
    }

    @Deprecated
    public static void onResume(Activity activity) {
        try {
            TCAgent.a((Context)activity);
            a.a(activity);
        }
        catch (Throwable var1_1) {
            var1_1.printStackTrace();
        }
    }

    @Deprecated
    public static void onPause(Activity activity) {
        try {
            TCAgent.a((Context)activity);
            a.b(activity);
        }
        catch (Throwable var1_1) {
            var1_1.printStackTrace();
        }
    }

    public static void onPageStart(Context context, String string) {
        try {
            TCAgent.a(context);
            a.onPageStart(context, string);
        }
        catch (Throwable var2_2) {
            var2_2.printStackTrace();
        }
    }

    public static void onPageEnd(Context context, String string) {
        try {
            TCAgent.a(context);
            a.onPageEnd(context, string);
        }
        catch (Throwable var2_2) {
            var2_2.printStackTrace();
        }
    }

    public static void setGlobalKV(String string, Object object) {
        if (LOG_ON && string != null && object != null) {
            Log.i((String)"TDLog", (String)("setGlobalKV# key:" + string + " value:" + object.toString()));
        }
        ab.a.put(string, object);
    }

    public static void removeGlobalKV(String string) {
        if (LOG_ON && string != null) {
            Log.i((String)"TDLog", (String)("removeGlobalKV# key:" + string));
        }
        ab.a.remove(string);
    }

    public static void onEvent(Context context, String string) {
        TCAgent.onEvent(context, string, "");
    }

    public static void onEvent(Context context, String string, String string2) {
        TCAgent.onEvent(context, string, string2, null);
    }

    public static void onEvent(Context context, String string, String string2, Map map) {
        try {
            TCAgent.a(context);
            a.a(context, string, string2, map);
        }
        catch (Throwable var4_4) {
            var4_4.printStackTrace();
        }
    }

    public static void setReportUncaughtExceptions(boolean bl2) {
        try {
            ab.b = bl2;
            if (LOG_ON) {
                Log.i((String)"TDLog", (String)("[PreSettings] setReportUncaughtExceptions: " + bl2));
            }
        }
        catch (Throwable var1_1) {
            var1_1.printStackTrace();
        }
    }

    public static void onError(Context context, Throwable throwable) {
        try {
            TCAgent.a(context);
            a.a(context, throwable);
        }
        catch (Throwable var2_2) {
            var2_2.printStackTrace();
        }
    }

    public static void setLocation(Context context, double d2, double d3, String string) {
        try {
            TCAgent.a(context);
            a.setLocation(d2, d3, string);
        }
        catch (Throwable var6_4) {
            var6_4.printStackTrace();
        }
    }

    public static void setAdditionalVersionNameAndCode(String string, long l2) {
        try {
            fu.a(string, l2);
        }
        catch (Throwable var3_2) {
            var3_2.printStackTrace();
        }
    }

    public static void setAgentOption(int n2) {
        if (LOG_ON) {
            Log.i((String)"TDLog", (String)("AgentOption.AO_Current = " + n2));
        }
        AgentOption.a = n2;
        if (n2 == 3) {
            eh.f().h();
            if (LOG_ON) {
                Log.i((String)"TDLog", (String)"Cleared local cache.");
            }
        }
    }

    private static synchronized void a(Context context) {
        ab.mContext = context.getApplicationContext();
        if (a == null) {
            long l2 = System.currentTimeMillis();
            a = zz.f();
            ag ag2 = new ag();
            try {
                a = (ao)ag2.a(context, "analytics", "TD", ao.class, zz.class, "com.tendcloud.tenddata.zz");
            }
            catch (Exception var4_3) {
                var4_3.printStackTrace();
            }
        }
    }

    static {
        LOG_ON = true;
        ENABLE_MULTI_PROCESS_POST = false;
    }
}

