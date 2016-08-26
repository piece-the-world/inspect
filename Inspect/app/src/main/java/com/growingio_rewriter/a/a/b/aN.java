/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aM;
import com.growingio.a.a.b.aO;
import com.growingio.a.a.b.aU;

public final class aN {
    private final String a;
    private final aO b;
    private aO c;
    private boolean d;

    private aN(String string) {
        this.c = this.b = new aO(null);
        this.d = false;
        this.a = aU.a(string);
    }

    public aN a() {
        this.d = true;
        return this;
    }

    public aN a(String string, Object object) {
        return this.b(string, object);
    }

    public aN a(String string, boolean bl2) {
        return this.b(string, String.valueOf(bl2));
    }

    public aN a(String string, char c2) {
        return this.b(string, String.valueOf(c2));
    }

    public aN a(String string, double d2) {
        return this.b(string, String.valueOf(d2));
    }

    public aN a(String string, float f2) {
        return this.b(string, String.valueOf(f2));
    }

    public aN a(String string, int n2) {
        return this.b(string, String.valueOf(n2));
    }

    public aN a(String string, long l2) {
        return this.b(string, String.valueOf(l2));
    }

    public aN a(Object object) {
        return this.b(object);
    }

    public aN a(boolean bl2) {
        return this.b(String.valueOf(bl2));
    }

    public aN a(char c2) {
        return this.b(String.valueOf(c2));
    }

    public aN a(double d2) {
        return this.b(String.valueOf(d2));
    }

    public aN a(float f2) {
        return this.b(String.valueOf(f2));
    }

    public aN a(int n2) {
        return this.b(String.valueOf(n2));
    }

    public aN a(long l2) {
        return this.b(String.valueOf(l2));
    }

    public String toString() {
        boolean bl2 = this.d;
        String string = "";
        StringBuilder stringBuilder = new StringBuilder(32).append(this.a).append('{');
        aO aO2 = this.b.c;
        while (aO2 != null) {
            if (!bl2 || aO2.b != null) {
                stringBuilder.append(string);
                string = ", ";
                if (aO2.a != null) {
                    stringBuilder.append(aO2.a).append('=');
                }
                stringBuilder.append(aO2.b);
            }
            aO2 = aO2.c;
        }
        return stringBuilder.append('}').toString();
    }

    private aO b() {
        aO aO2;
        this.c = this.c.c = (aO2 = new aO(null));
        return aO2;
    }

    private aN b(Object object) {
        aO aO2 = this.b();
        aO2.b = object;
        return this;
    }

    private aN b(String string, Object object) {
        aO aO2 = this.b();
        aO2.b = object;
        aO2.a = aU.a(string);
        return this;
    }

    /* synthetic */ aN(String string, aM aM2) {
        this(string);
    }
}

