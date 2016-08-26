/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.text.TextUtils
 *  android.util.Log
 *  org.json.JSONObject
 */
package com.growingio.android.sdk.circle;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import com.growingio.android.sdk.b.g;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.b.n;
import com.growingio.android.sdk.circle.cu;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.c;
import com.growingio.android.sdk.utils.LogUtil;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import org.json.JSONObject;

class cn {
    static Constructor a;
    private static Method b;
    private static Method c;
    private static Method d;
    private static Method e;
    private static Method f;
    private static Method g;
    private Object h;
    private String i = "";
    private String j = "";
    private String k = "";

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

    public cn(String string, Runnable runnable, Runnable runnable2, Runnable runnable3) {
        c c2 = c.h();
        try {
            this.h = a.newInstance(c2.b(), c2.d(), string, runnable, runnable2, runnable3);
            e.invoke(this.h, "0.9.90_6a708c0", GConfig.e);
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
            if (GConfig.a) {
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

    public void a(String string, String string2, List list, i i2, g g2) {
        Object object;
        if (!this.b() || !this.a()) {
            return;
        }
        Activity activity = this.e().f();
        if (activity == null) {
            return;
        }
        if (string.equals("page")) {
            object = "";
            if (g2 instanceof com.growingio.android.sdk.b.c) {
                object = ((com.growingio.android.sdk.b.c)g2).b;
                if (TextUtils.isEmpty((CharSequence)object)) {
                    object = g2.g;
                }
            } else if (g2 instanceof n) {
                try {
                    object = g2.b().getString("v");
                    if (TextUtils.isEmpty((CharSequence)object)) {
                        object = g2.b().getString("p");
                    }
                }
                catch (Exception var8_8) {
                    var8_8.printStackTrace();
                }
            }
            string2 = "\u8fdb\u5165\u4e86" + (String)object;
        }
        object = new cu(activity, list, i2);
        JSONObject jSONObject = object.b();
        try {
            jSONObject.put("msgId", (Object)"user_action");
            jSONObject.put("userAction", (Object)string);
            jSONObject.put("actionDesc", (Object)string2);
            jSONObject.put("sdkVersion", (Object)"0.9.90_6a708c0");
            jSONObject.put("appVersion", (Object)GConfig.e);
            if (string.equals("page")) {
                if (g2 instanceof com.growingio.android.sdk.b.c) {
                    jSONObject.put("domain", (Object)c.h().b());
                    jSONObject.put("page", (Object)g2.g);
                } else if (g2 instanceof n) {
                    jSONObject.put("domain", (Object)g2.b().getString("d"));
                    jSONObject.put("page", (Object)g2.b().getString("p"));
                    jSONObject.put("query", (Object)g2.b().optString("q"));
                }
            } else {
                jSONObject.put("domain", (Object)c.h().b());
                jSONObject.put("page", (Object)this.e().a(activity));
            }
            this.a(jSONObject.toString());
        }
        catch (Exception var9_10) {
            LogUtil.d("WebSocketProxy", "send screenshot info message error", var9_10);
        }
        this.i = string;
        this.j = string2;
        this.k = object.a();
    }

    private c e() {
        return c.h();
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

