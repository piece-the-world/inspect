/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.Activity
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 */
package com.growingio.android.sdk.utils;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.growingio.android.sdk.collection.c;
import com.growingio.android.sdk.utils.LogUtil;
import com.growingio.android.sdk.utils.p;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class o {
    static Object a;
    static Field b;
    static Class c;
    static Class d;
    private static Class h;
    private static Method i;
    private static Class j;
    private static Method k;
    private static boolean l;
    static boolean e;
    static boolean f;
    public static Comparator g;

    public static void a() {
        Object object;
        if (l) {
            return;
        }
        String string = Build.VERSION.SDK_INT >= 17 ? "android.view.WindowManagerGlobal" : "android.view.WindowManagerImpl";
        Class class_ = null;
        try {
            class_ = Class.forName(string);
            object = Build.VERSION.SDK_INT >= 17 ? "sDefaultWindowManager" : (Build.VERSION.SDK_INT >= 13 ? "sWindowManager" : "mWindowManager");
            b = class_.getDeclaredField("mViews");
            Field field = class_.getDeclaredField((String)object);
            b.setAccessible(true);
            if (b.getType() == ArrayList.class) {
                e = true;
            } else if (b.getType() == View[].class) {
                f = true;
            }
            field.setAccessible(true);
            a = field.get(null);
        }
        catch (NoSuchFieldException var2_3) {
            LogUtil.d(var2_3);
        }
        catch (IllegalAccessException var2_4) {
            LogUtil.d(var2_4);
        }
        catch (ClassNotFoundException var2_5) {
            LogUtil.d(var2_5);
        }
        try {
            h = Class.forName("com.android.internal.view.menu.ListMenuItemView");
            object = Class.forName("com.android.internal.view.menu.MenuView$ItemView");
            i = object.getDeclaredMethod("getItemData", new Class[0]);
        }
        catch (ClassNotFoundException var2_6) {
            LogUtil.d(var2_6);
        }
        catch (NoSuchMethodException var2_7) {
            LogUtil.d(var2_7);
        }
        try {
            j = Class.forName("android.support.v7.view.menu.ListMenuItemView");
            object = Class.forName("android.support.v7.view.menu.MenuView$ItemView");
            k = object.getDeclaredMethod("getItemData", new Class[0]);
        }
        catch (ClassNotFoundException var2_8) {
            LogUtil.d(var2_8);
        }
        catch (NoSuchMethodException var2_9) {
            LogUtil.d(var2_9);
        }
        try {
            if (Build.VERSION.SDK_INT == 23) {
                try {
                    c = Class.forName("com.android.internal.policy.PhoneWindow$DecorView");
                }
                catch (ClassNotFoundException var2_10) {
                    c = Class.forName("com.android.internal.policy.DecorView");
                }
            } else {
                c = Class.forName("com.android.internal.policy.impl.PhoneWindow$DecorView");
            }
        }
        catch (ClassNotFoundException var2_11) {
            LogUtil.d(var2_11);
        }
        try {
            d = Build.VERSION.SDK_INT == 23 ? Class.forName("android.widget.PopupWindow$PopupDecorView") : Class.forName("android.widget.PopupWindow$PopupViewContainer");
        }
        catch (ClassNotFoundException var2_12) {
            LogUtil.d(var2_12);
        }
        l = true;
    }

    public static View[] b() {
        View[] arrview = new View[]{};
        if (a == null) {
            Activity activity = c.h().f();
            if (activity != null) {
                return new View[]{activity.getWindow().getDecorView()};
            }
            return arrview;
        }
        try {
            if (e) {
                arrview = ((ArrayList)b.get(a)).toArray((T[])arrview);
            } else if (f) {
                arrview = (View[])b.get(a);
            }
        }
        catch (Exception var1_2) {
            LogUtil.d(var1_2);
        }
        return o.a(arrview);
    }

    public static View[] a(View[] arrview) {
        int n2 = 0;
        for (View view : arrview) {
            if (view != null) continue;
            ++n2;
        }
        if (n2 > 0) {
            View[] arrview2 = new View[arrview.length - n2];
            int n3 = 0;
            for (int i2 = 0; i2 < arrview.length && n3 < arrview2.length; ++i2) {
                if (arrview[i2] == null) continue;
                arrview2[n3++] = arrview[i2];
            }
            arrview = arrview2;
        }
        return arrview;
    }

    @TargetApi(value=9)
    public static View[] c() {
        View[] arrview = o.b();
        if (arrview.length > 1) {
            arrview = Arrays.copyOf(arrview, arrview.length);
            Arrays.sort(arrview, g);
        }
        return arrview;
    }

    public static String d() {
        return "/MainWindow";
    }

    public static String a(View view) {
        WindowManager.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 != null && layoutParams2 instanceof WindowManager.LayoutParams) {
            layoutParams = (WindowManager.LayoutParams)layoutParams2;
            int n2 = layoutParams.type;
            if (n2 == 1) {
                return "/MainWindow";
            }
            if (n2 < 99 && view.getClass() == c) {
                return "/DialogWindow";
            }
            if (n2 < 1999 && view.getClass() == d) {
                return "/PopupWindow";
            }
            if (n2 < 2999) {
                return "/CustomWindow";
            }
        }
        if ((layoutParams = view.getClass()) == c) {
            return "/DialogWindow";
        }
        if (layoutParams == d) {
            return "/PopupWindow";
        }
        return "/CustomWindow";
    }

    public static boolean b(View view) {
        Class class_ = view.getClass();
        return class_ == c || class_ == d;
    }

    public static Object c(View view) {
        if (view.getClass() == h) {
            return i.invoke((Object)view, new Object[0]);
        }
        if (view.getClass() == j) {
            return k.invoke((Object)view, new Object[0]);
        }
        return null;
    }

    static {
        l = false;
        e = false;
        f = false;
        g = new p();
    }
}

