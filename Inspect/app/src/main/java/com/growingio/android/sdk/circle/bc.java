/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
package com.growingio.android.sdk.circle;

import android.util.Log;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.c;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class bc {
    static Constructor a;
    private static Method b;
    private static Method c;
    private static Method d;
    private static Method e;
    private static Method f;
    private static Method g;
    private Object h;

    static void a(Class class_) {
        a = class_.getDeclaredConstructor(String.class, String.class, String.class, Runnable.class, Runnable.class, Runnable.class);
        a.setAccessible(true);
        b = class_.getDeclaredMethod("isInEditMode", new Class[0]);
        c = class_.getDeclaredMethod("isOpen", new Class[0]);
        d = class_.getDeclaredMethod("sendMessage", String.class);
        f = class_.getDeclaredMethod("start", new Class[0]);
        g = class_.getDeclaredMethod("stop", new Class[0]);
        e = class_.getDeclaredMethod("setVersionInfo", String.class, String.class);
    }

    public bc(String string, Runnable runnable, Runnable runnable2, Runnable runnable3) {
        c c2 = c.k();
        try {
            this.h = a.newInstance(c2.b(), c2.c(), string, runnable, runnable2, runnable3);
            e.invoke(this.h, "0.9.98_355b84e", GConfig.sAppVersion);
        }
        catch (InstantiationException var6_6) {
        }
        catch (IllegalAccessException var6_7) {
        }
        catch (InvocationTargetException var6_8) {
            // empty catch block
        }
    }

    public void a(String string) {
        try {
            if (GConfig.DEBUG) {
                Log.i((String)"WebSocketProxy", (String)("sendMessage: " + string));
            }
            d.invoke(this.h, string);
        }
        catch (IllegalAccessException var2_2) {
        }
        catch (InvocationTargetException var2_3) {
            // empty catch block
        }
    }

    public boolean a() {
        try {
            return (Boolean)c.invoke(this.h, new Object[0]);
        }
        catch (IllegalAccessException var1_1) {
        }
        catch (InvocationTargetException var1_2) {
            // empty catch block
        }
        return false;
    }

    public boolean b() {
        try {
            return (Boolean)b.invoke(this.h, new Object[0]);
        }
        catch (IllegalAccessException var1_1) {
        }
        catch (InvocationTargetException var1_2) {
            // empty catch block
        }
        return false;
    }

    public void c() {
        try {
            f.invoke(this.h, new Object[0]);
        }
        catch (IllegalAccessException var1_1) {
        }
        catch (InvocationTargetException var1_2) {
            // empty catch block
        }
    }

    public void d() {
        try {
            g.invoke(this.h, new Object[0]);
        }
        catch (IllegalAccessException var1_1) {
        }
        catch (InvocationTargetException var1_2) {
            // empty catch block
        }
    }
}

