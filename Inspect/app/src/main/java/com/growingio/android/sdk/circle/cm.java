/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  org.json.JSONArray
 */
package com.growingio.android.sdk.circle;

import android.content.Context;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.json.JSONArray;

class cm {
    static Constructor a;
    private static Method c;
    private static Method d;
    View b;

    static void a(Class class_) {
        a = class_.getDeclaredConstructor(Context.class, Integer.TYPE, Integer.TYPE);
        c = class_.getDeclaredMethod("clear", new Class[0]);
        d = class_.getDeclaredMethod("setData", JSONArray.class);
    }

    public cm(Context context, int n2, int n3) {
        try {
            this.b = (View)a.newInstance(new Object[]{context, n2, n3});
        }
        catch (InstantiationException var4_4) {
        }
        catch (IllegalAccessException var4_5) {
        }
        catch (InvocationTargetException var4_6) {
            // empty catch block
        }
    }

    public void a(JSONArray jSONArray) {
        try {
            d.invoke((Object)this.b, new Object[]{jSONArray});
        }
        catch (IllegalAccessException var2_2) {
        }
        catch (InvocationTargetException var2_3) {
            // empty catch block
        }
    }

    public void a(int n2) {
        this.b.setVisibility(n2);
    }

    public View a() {
        return this.b;
    }
}

