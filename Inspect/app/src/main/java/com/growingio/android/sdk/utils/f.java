/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 */
package com.growingio.android.sdk.utils;

import android.content.Context;
import android.content.pm.PackageManager;

public class f {
    private static boolean a;
    private static boolean b;
    private static boolean c;
    private static boolean d;
    private static boolean e;

    public static boolean a() {
        return a;
    }

    public static boolean b() {
        return b;
    }

    public static boolean c() {
        return c;
    }

    public static boolean d() {
        return d;
    }

    public static void a(Context context) {
        if (e) {
            return;
        }
        a = f.a(context, "android.permission.INTERNET");
        b = f.a(context, "android.permission.ACCESS_NETWORK_STATE");
        c = f.a(context, "android.permission.WRITE_EXTERNAL_STORAGE");
        d = f.a(context, "android.permission.SYSTEM_ALERT_WINDOW");
        e = true;
    }

    public static boolean a(Context context, String string) {
        PackageManager packageManager = context.getPackageManager();
        return 0 == packageManager.checkPermission(string, context.getPackageName());
    }

    static {
        e = false;
    }
}

