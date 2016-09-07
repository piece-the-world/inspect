/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.Signature
 */
package com.tendcloud.tenddata;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.tendcloud.tenddata.cs;
import java.io.File;

public class cb {
    private static volatile cb a = null;
    private PackageInfo b = null;

    private cb() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static cb a() {
        if (a != null) return a;
        reference var0 = cb.class;
        synchronized (cb.class) {
            if (a != null) return a;
            {
                a = new cb();
            }
            // ** MonitorExit[var0] (shouldn't be in output)
            return a;
        }
    }

    private synchronized boolean i(Context context) {
        try {
            if (this.b == null) {
                this.b = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
            }
            return true;
        }
        catch (Throwable var2_2) {
            return false;
        }
    }

    public String a(Context context) {
        if (context == null) {
            return null;
        }
        this.i(context);
        return context.getPackageName();
    }

    public int b(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            if (!this.i(context)) {
                return -1;
            }
            return this.b.versionCode;
        }
        catch (Throwable var2_2) {
            return -1;
        }
    }

    public String c(Context context) {
        if (context == null) {
            return "unknown";
        }
        try {
            if (!this.i(context)) {
                return "unknown";
            }
            return this.b.versionName;
        }
        catch (Throwable var2_2) {
            return "unknown";
        }
    }

    public long d(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            if (!this.i(context)) {
                return -1;
            }
            if (cs.a(9)) {
                return this.b.firstInstallTime;
            }
        }
        catch (Throwable var2_2) {
            // empty catch block
        }
        return -1;
    }

    public long e(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            if (!this.i(context)) {
                return -1;
            }
            if (cs.a(9)) {
                return this.b.lastUpdateTime;
            }
        }
        catch (Throwable var2_2) {
            // empty catch block
        }
        return -1;
    }

    public long f(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            this.i(context);
            String string = context.getApplicationInfo().sourceDir;
            return new File(string).length();
        }
        catch (Throwable var2_3) {
            return -1;
        }
    }

    public String g(Context context) {
        if (context == null) {
            return null;
        }
        try {
            if (!this.i(context)) {
                return null;
            }
            Signature[] arrsignature = this.b.signatures;
            if (arrsignature.length < 1) {
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(arrsignature[0].toCharsString());
            return stringBuffer.toString();
        }
        catch (Throwable var2_3) {
            return null;
        }
    }

    public String h(Context context) {
        if (context == null) {
            return null;
        }
        try {
            this.i(context);
            return context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
        }
        catch (Throwable var2_2) {
            return null;
        }
    }
}

