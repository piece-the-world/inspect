/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.growingio.android.sdk.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

@TargetApi(value=14)
public class g {
    private static Context a;
    private static int b;

    public static boolean a() {
        return a != null;
    }

    public static boolean b() {
        return 70 <= b;
    }

    public static boolean c() {
        return g.a() && g.b();
    }

    public static boolean a(Context context) {
        if (a != null) {
            return true;
        }
        try {
            a = context.createPackageContext("com.growingio.android.growingio.app", 2);
            PackageInfo packageInfo = a.getPackageManager().getPackageInfo("com.growingio.android.growingio.app", 0);
            b = packageInfo.versionCode;
        }
        catch (PackageManager.NameNotFoundException var1_2) {
            // empty catch block
        }
        return a != null;
    }

    public static /* varargs */ String a(String string, Object ... arrobject) {
        try {
            int n2 = a.getResources().getIdentifier(string, "string", "com.growingio.android.growingio.app");
            return a.getString(n2, arrobject);
        }
        catch (Exception var2_3) {
            return "";
        }
    }

    public static int a(String string) {
        return a.getResources().getColor(g.d(string));
    }

    public static Drawable b(String string) {
        return a.getResources().getDrawable(g.f(string));
    }

    public static View a(String string, ViewGroup viewGroup, boolean bl2) {
        return a == null ? null : LayoutInflater.from((Context)a).inflate(g.e(string), viewGroup, bl2);
    }

    public static int c(String string) {
        return a.getResources().getIdentifier(string, "id", "com.growingio.android.growingio.app");
    }

    private static int d(String string) {
        return a.getResources().getIdentifier(string, "color", "com.growingio.android.growingio.app");
    }

    private static int e(String string) {
        return a.getResources().getIdentifier(string, "layout", "com.growingio.android.growingio.app");
    }

    private static int f(String string) {
        return a.getResources().getIdentifier(string, "drawable", "com.growingio.android.growingio.app");
    }
}

