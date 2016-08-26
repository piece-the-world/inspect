/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.a.T;
import com.growingio.b.o;
import java.util.HashMap;

public class d
extends HashMap {
    private d a;

    public d() {
        this.a = null;
    }

    d(d d2) {
        this.a = d2;
    }

    public void a(o o2, o o3) {
        this.a(o2.s(), o3.s());
    }

    public void a(String string, String string2) {
        if (string == string2) {
            return;
        }
        String string3 = d.b(string);
        String string4 = (String)this.get(string3);
        if (string4 == null || !string4.equals(string3)) {
            super.put(string3, d.b(string2));
        }
    }

    public void b(String string, String string2) {
        if (string == string2) {
            return;
        }
        String string3 = d.b(string);
        String string4 = (String)this.get(string3);
        if (string4 == null) {
            super.put(string3, d.b(string2));
        }
    }

    protected final void a(Object object, Object object2) {
        super.put(object, object2);
    }

    @Override
    public Object get(Object object) {
        Object v2 = super.get(object);
        if (v2 == null && this.a != null) {
            return this.a.get(object);
        }
        return v2;
    }

    public void a(o o2) {
        this.a(o2.s());
    }

    public void a(String string) {
        String string2 = d.b(string);
        super.put(string2, string2);
    }

    public static String b(String string) {
        return T.a(string);
    }

    public static String c(String string) {
        return T.b(string);
    }
}

