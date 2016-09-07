/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$RunningAppProcessInfo
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Message
 *  android.os.Process
 *  org.json.JSONArray
 */
package com.tendcloud.tenddata;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import com.tendcloud.tenddata.TCAgent;
import com.tendcloud.tenddata.ab;
import com.tendcloud.tenddata.cm;
import com.tendcloud.tenddata.co;
import com.tendcloud.tenddata.do;
import com.tendcloud.tenddata.du;
import com.tendcloud.tenddata.dx;
import com.tendcloud.tenddata.ex;
import com.tendcloud.tenddata.fu;
import com.tendcloud.tenddata.gg;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;

class ew {
    private static volatile ew d = null;
    private boolean e = false;
    private do f;
    private final int g = 5000;
    private a h = new a();
    private Handler i;
    public static final String a = "events";
    public static final String b = "TalingDataConfig";
    public static final String c = "config.";

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static ew a() {
        if (d != null) return d;
        reference var0 = ew.class;
        synchronized (ew.class) {
            if (d != null) return d;
            {
                d = new ew();
            }
            // ** MonitorExit[var0] (shouldn't be in output)
            return d;
        }
    }

    private ew() {
    }

    void b() {
        if (this.e) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 16 && fu.e != null && ew.a(ab.mContext)) {
                this.f = do.a(ab.mContext, ab.n, fu.e);
            }
            new Thread(new b()).start();
            this.e = true;
        }
        catch (Throwable var1_1) {
            // empty catch block
        }
    }

    public final void onTDEBEventCodelessEvent(dx dx2) {
        try {
            Object v2;
            Object v3 = dx2.a.get("cloudSettingsType");
            if (v3 != null && v3.toString().equals("codeless") && (v2 = dx2.a.get("data")) != null && v2 instanceof JSONArray) {
                cm.a(ab.mContext, "TalingDataConfig" + ab.a(ab.mContext), "config.events", v2.toString());
                if (this.f != null) {
                    this.f.setEventBindings((JSONArray)v2);
                }
            }
        }
        catch (Throwable var2_3) {
            // empty catch block
        }
    }

    private static boolean a(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager)context.getSystemService("activity");
            PackageManager packageManager = context.getPackageManager();
            String string = packageManager.getApplicationInfo((String)context.getPackageName(), (int)0).processName;
            List list = activityManager.getRunningAppProcesses();
            if (list != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : list) {
                    if (Process.myPid() != runningAppProcessInfo.pid || !runningAppProcessInfo.processName.equals(string)) continue;
                    return true;
                }
            }
        }
        catch (Throwable var1_2) {
            // empty catch block
        }
        if (TCAgent.ENABLE_MULTI_PROCESS_POST) {
            return true;
        }
        return false;
    }

    void c() {
        if (this.e()) {
            this.h.a();
        }
    }

    void d() {
        if (this.e()) {
            this.h.b();
        }
    }

    private boolean e() {
        if (!Build.HARDWARE.equals("goldfish") && !Build.HARDWARE.equals("vbox86")) {
            return false;
        }
        if (!Build.BRAND.startsWith("generic") && !Build.BRAND.startsWith("Android")) {
            return false;
        }
        if (!Build.DEVICE.startsWith("generic") && !Build.DEVICE.startsWith("vbox86")) {
            return false;
        }
        if (!(Build.PRODUCT.contains("sdk") || Build.PRODUCT.contains("Genymotion") || Build.PRODUCT.contains("vbox86"))) {
            return false;
        }
        if (!Build.MODEL.toLowerCase(Locale.US).contains("sdk") && !Build.MODEL.toLowerCase(Locale.US).contains("api")) {
            return false;
        }
        return true;
    }

    void a(Handler handler) {
        this.i = handler;
    }

    static {
        try {
            gg.a().register(ew.a());
        }
        catch (Throwable var0) {
            // empty catch block
        }
    }

    static class b
    implements Runnable {
        private b() {
        }

        @Override
        public void run() {
            co.a(ab.mContext).registerTestDeviceListener(new ex(this));
        }
    }

    static class a
    implements Runnable {
        private volatile boolean a = true;

        @Override
        public void run() {
            if (ew.a().i != null) {
                if (!this.a) {
                    Message message = ew.a().i.obtainMessage(1);
                    ew.a().i.sendMessage(message);
                }
                ew.a().i.postDelayed((Runnable)this, 5000);
            }
        }

        public void a() {
            if (ew.a().i != null) {
                this.a = false;
                ew.a().i.post((Runnable)this);
            }
        }

        public void b() {
            if (ew.a().i != null) {
                this.a = true;
                ew.a().i.removeCallbacks((Runnable)this);
            }
        }
    }

}

