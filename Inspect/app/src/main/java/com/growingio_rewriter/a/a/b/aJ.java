/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aI;
import com.growingio.a.a.b.aK;
import com.growingio.a.a.b.aU;
import java.util.Arrays;

public final class aJ {
    private final String a;
    private final aK b;
    private aK c;
    private boolean d;

    private aJ(String string) {
        this.c = this.b = new aK(null);
        this.d = false;
        this.a = aU.a(string);
    }

    public aJ a() {
        this.d = true;
        return this;
    }

    public aJ a(String string, Object object) {
        return this.b(string, object);
    }

    public aJ a(String string, boolean bl2) {
        return this.b(string, String.valueOf(bl2));
    }

    public aJ a(String string, char c2) {
        return this.b(string, String.valueOf(c2));
    }

    public aJ a(String string, double d2) {
        return this.b(string, String.valueOf(d2));
    }

    public aJ a(String string, float f2) {
        return this.b(string, String.valueOf(f2));
    }

    public aJ a(String string, int n2) {
        return this.b(string, String.valueOf(n2));
    }

    public aJ a(String string, long l2) {
        return this.b(string, String.valueOf(l2));
    }

    public aJ a(Object object) {
        return this.b(object);
    }

    public aJ a(boolean bl2) {
        return this.b(String.valueOf(bl2));
    }

    public aJ a(char c2) {
        return this.b(String.valueOf(c2));
    }

    public aJ a(double d2) {
        return this.b(String.valueOf(d2));
    }

    public aJ a(float f2) {
        return this.b(String.valueOf(f2));
    }

    public aJ a(int n2) {
        return this.b(String.valueOf(n2));
    }

    public aJ a(long l2) {
        return this.b(String.valueOf(l2));
    }

    public String toString() {
        boolean bl2 = this.d;
        String string = "";
        StringBuilder stringBuilder = new StringBuilder(32).append(this.a).append('{');
        aK aK2 = this.b.c;
        while (aK2 != null) {
            Object object = aK2.b;
            if (!bl2 || object != null) {
                stringBuilder.append(string);
                string = ", ";
                if (aK2.a != null) {
                    stringBuilder.append(aK2.a).append('=');
                }
                if (object != null && object.getClass().isArray()) {
                    Object[] arrobject = new Object[]{object};
                    String string2 = Arrays.deepToString(arrobject);
                    stringBuilder.append(string2, 1, string2.length() - 1);
                } else {
                    stringBuilder.append(object);
                }
            }
            aK2 = aK2.c;
        }
        return stringBuilder.append('}').toString();
    }

    private aK b() {
        aK aK2;
        this.c = this.c.c = (aK2 = new aK(null));
        return aK2;
    }

    private aJ b(Object object) {
        aK aK2 = this.b();
        aK2.b = object;
        return this;
    }

    private aJ b(String string, Object object) {
        aK aK2 = this.b();
        aK2.b = object;
        aK2.a = aU.a(string);
        return this;
    }

    /* synthetic */ aJ(String string, aI aI2) {
        this(string);
    }
}

