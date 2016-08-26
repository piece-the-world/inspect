/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.support.v4.app.Fragment
 *  android.support.v4.app.FragmentActivity
 *  android.support.v4.view.ViewPager
 *  android.support.v4.widget.SwipeRefreshLayout
 *  android.support.v7.widget.RecyclerView
 *  android.view.View
 *  android.view.ViewGroup
 *  com.tencent.smtt.sdk.WebChromeClient
 *  com.tencent.smtt.sdk.WebView
 */
package com.growingio.android.sdk.utils;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.growingio.android.sdk.utils.LogUtil;
import com.tencent.smtt.sdk.WebChromeClient;
import com.tencent.smtt.sdk.WebView;
import java.lang.reflect.Method;

public class a {
    public static boolean a = true;
    public static boolean b = true;
    public static boolean c = true;
    public static boolean d = false;
    public static boolean e = false;
    public static boolean f = true;
    public static boolean g = true;
    public static boolean h = true;
    public static boolean i = true;
    public static Class j;
    public static Class k;
    public static Method l;
    public static Method m;
    public static Method n;
    public static Method o;

    public static void a(Class class_, String string) {
        if (!a || !class_.equals(RecyclerView.class) && !d && string.contains("RecyclerView")) {
            try {
                Class class_2 = a.a(class_);
                if (class_2 != null && l != null) {
                    m = class_2.getDeclaredMethod("getLayoutManager", new Class[0]);
                    Class class_3 = class_2.getClassLoader().loadClass(class_2.getName() + "$LayoutManager");
                    o = class_3.getMethod("canScrollHorizontally", new Class[0]);
                    n = class_3.getMethod("canScrollVertically", new Class[0]);
                    k = class_;
                    d = true;
                }
            }
            catch (NoSuchMethodException var2_3) {
                var2_3.printStackTrace();
            }
            catch (NullPointerException var2_4) {
            }
            catch (ClassNotFoundException var2_5) {
                var2_5.printStackTrace();
            }
        }
    }

    private static Class a(Class class_) {
        while (class_ != null && !class_.equals(ViewGroup.class)) {
            try {
                l = class_.getDeclaredMethod("getChildAdapterPosition", View.class);
            }
            catch (NoSuchMethodException var1_2) {
                // empty catch block
            }
            if (l == null) {
                try {
                    l = class_.getDeclaredMethod("getChildPosition", View.class);
                }
                catch (NoSuchMethodException var1_3) {
                    // empty catch block
                }
            }
            if (l != null) {
                return class_;
            }
            class_ = class_.getSuperclass();
        }
        return null;
    }

    public static boolean a(Object object) {
        return c && object instanceof ViewPager;
    }

    public static boolean b(Object object) {
        return e && object instanceof SwipeRefreshLayout;
    }

    public static boolean c(Object object) {
        return f && object instanceof WebView;
    }

    public static boolean d(Object object) {
        return f && object instanceof WebChromeClient;
    }

    public static boolean e(Object object) {
        return h && object instanceof FragmentActivity;
    }

    public static boolean f(Object object) {
        return i && object instanceof Fragment;
    }

    static {
        try {
            Class class_ = Class.forName("android.support.v7.widget.RecyclerView");
            class_.getDeclaredMethod("getChildAdapterPosition", View.class);
        }
        catch (ClassNotFoundException var0_1) {
            a = false;
            b = false;
        }
        catch (NoSuchMethodException var0_2) {
            b = false;
        }
        try {
            j = Class.forName("android.support.v4.widget.SwipeRefreshLayout");
            e = true;
        }
        catch (ClassNotFoundException var0_3) {
            var0_3.printStackTrace();
        }
        try {
            Class.forName("android.support.v4.view.ViewPager");
        }
        catch (ClassNotFoundException var0_4) {
            c = false;
        }
        try {
            Class.forName("com.tencent.smtt.sdk.WebView");
        }
        catch (ClassNotFoundException var0_5) {
            f = false;
        }
        try {
            Class.forName("android.support.v7.app.AlertDialog");
        }
        catch (ClassNotFoundException var0_6) {
            g = false;
            LogUtil.d(var0_6);
        }
        try {
            Class.forName("android.support.v4.app.FragmentActivity");
        }
        catch (ClassNotFoundException var0_7) {
            h = false;
            LogUtil.d(var0_7);
        }
        try {
            Class.forName("android.support.v4.app.Fragment");
        }
        catch (ClassNotFoundException var0_8) {
            i = false;
            LogUtil.d(var0_8);
        }
    }
}

