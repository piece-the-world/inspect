/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
package com.tendcloud.tenddata;

import android.app.Activity;
import android.content.Context;
import com.tendcloud.tenddata.TCAgent;
import com.tendcloud.tenddata.ab;
import com.tendcloud.tenddata.ao;
import com.tendcloud.tenddata.cb;
import com.tendcloud.tenddata.cm;
import com.tendcloud.tenddata.cs;
import com.tendcloud.tenddata.dv;
import com.tendcloud.tenddata.ed;
import com.tendcloud.tenddata.ew;
import com.tendcloud.tenddata.fb;
import com.tendcloud.tenddata.fu;
import java.util.Map;
import java.util.Random;

public final class zz
implements ao {
    private final String a = "u.talkingdata.net";
    private final String b = "https";
    private final String c = "https://u.talkingdata.net/ota/a/TD/android/ver";
    private final String d = "https://u.talkingdata.net/ota/a/TD/android/sdk.zip";
    private static volatile zz e = null;

    public zz() {
        e = this;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static synchronized zz f() {
        if (e != null) return e;
        reference var0 = zz.class;
        synchronized (zz.class) {
            if (e != null) return e;
            {
                e = new zz();
            }
            // ** MonitorExit[var0] (shouldn't be in output)
            return e;
        }
    }

    @Override
    public void a(Context context) {
        try {
            this.a(context, null, null);
        }
        catch (Throwable var2_2) {
            var2_2.printStackTrace();
        }
    }

    @Override
    public void a(Context context, String string, String string2) {
        try {
            fu.a(context, string, string2);
            fb.a();
            ew.a();
            cs.execute(new dv(this));
        }
        catch (Throwable var4_4) {
            var4_4.printStackTrace();
        }
    }

    @Override
    public String b(Context context) {
        try {
            return fu.a(context);
        }
        catch (Throwable var2_2) {
            var2_2.printStackTrace();
            return null;
        }
    }

    @Override
    public void a(Activity activity) {
        try {
            fu.a(activity);
        }
        catch (Throwable var2_2) {
            var2_2.printStackTrace();
        }
    }

    @Override
    public void onResume(Activity activity, String string, String string2) {
        try {
            fu.a(activity, string, string2);
        }
        catch (Throwable var4_4) {
            var4_4.printStackTrace();
        }
    }

    @Override
    public void b(Activity activity) {
        try {
            fu.b(activity);
        }
        catch (Throwable var2_2) {
            var2_2.printStackTrace();
        }
    }

    @Override
    public void onPageStart(Context context, String string) {
        try {
            fu.a(context, string);
        }
        catch (Throwable var3_3) {
            var3_3.printStackTrace();
        }
    }

    @Override
    public void onPageEnd(Context context, String string) {
        try {
            fu.b(context, string);
        }
        catch (Throwable var3_3) {
            var3_3.printStackTrace();
        }
    }

    @Override
    public void a(Context context, String string, String string2, Map map) {
        try {
            fu.a(context, string, string2, map);
        }
        catch (Throwable var5_5) {
            var5_5.printStackTrace();
        }
    }

    @Override
    public void setLocation(double d2, double d3, String string) {
        try {
            fu.a(d2, d3, string);
        }
        catch (Throwable var6_4) {
            var6_4.printStackTrace();
        }
    }

    @Override
    public void initialize(Context context, String string) {
        if (context != null) {
            ab.mContext = context;
        }
    }

    @Override
    public String a() {
        return "+V2.2.37 gp";
    }

    @Override
    public boolean b() {
        long l2 = cm.b(ab.mContext, "TDpref_longtime", "TDpref.last.sdk.check", cb.a().e(ab.mContext));
        long l3 = Math.abs((System.currentTimeMillis() - l2) / 86400000);
        return l3 > 7 || new Random().nextFloat() * (float)l3 > 2.0f;
    }

    @Override
    public String c() {
        return "https://u.talkingdata.net/ota/a/TD/android/ver";
    }

    @Override
    public String d() {
        return "https://u.talkingdata.net/ota/a/TD/android/sdk.zip";
    }

    @Override
    public void a(String string) {
        cm.a(ab.mContext, "TDpref_longtime", "TDpref.last.sdk.check", System.currentTimeMillis());
    }

    @Override
    public void e() {
    }

    @Override
    public void c(boolean bl2) {
        try {
            ab.b = bl2;
            if (TCAgent.LOG_ON) {
                ed.a("[PreSettings] setReportUncaughtExceptions: " + bl2);
            }
        }
        catch (Throwable var2_2) {
            var2_2.printStackTrace();
        }
    }

    @Override
    public void a(Context context, Throwable throwable) {
        try {
            fu.a(context, throwable);
        }
        catch (Throwable var3_3) {
            var3_3.printStackTrace();
        }
    }
}

