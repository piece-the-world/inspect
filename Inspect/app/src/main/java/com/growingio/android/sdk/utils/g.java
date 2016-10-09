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

public class g {
    private static boolean a;
    private static boolean b;
    private static boolean c;
    private static boolean d;
    private static boolean e;
    private static boolean f;

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

    public static boolean e() {
        return f;
    }

    public static void a(Context context) {
        if (e) {
            return;
        }
        a = g.a(context, "android.permission.INTERNET");
        b = g.a(context, "android.permission.ACCESS_NETWORK_STATE");
        c = g.a(context, "android.permission.WRITE_EXTERNAL_STORAGE");
        d = g.a(context, "android.permission.SYSTEM_ALERT_WINDOW");
        f = g.a(context, "android.permission.READ_PHONE_STATE");
        e = true;
    }

    public static boolean a(Context context, String string) {
        PackageManager packageManager = context.getPackageManager();
        return 0 == packageManager.checkPermission(string, context.getPackageName());
    }

    static {
        e = false;
        f = false;
    }
}

