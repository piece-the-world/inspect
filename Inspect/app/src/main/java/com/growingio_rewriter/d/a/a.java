/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a;

public abstract class a {
    protected final int c;
    protected a d;

    public a(int n2) {
        this(n2, null);
    }

    public a(int n2, a a2) {
        if (n2 != 262144 && n2 != 327680) {
            throw new IllegalArgumentException();
        }
        this.c = n2;
        this.d = a2;
    }

    public void a(String string, Object object) {
        if (this.d != null) {
            this.d.a(string, object);
        }
    }

    public void a(String string, String string2, String string3) {
        if (this.d != null) {
            this.d.a(string, string2, string3);
        }
    }

    public a a(String string, String string2) {
        if (this.d != null) {
            return this.d.a(string, string2);
        }
        return null;
    }

    public a a(String string) {
        if (this.d != null) {
            return this.d.a(string);
        }
        return null;
    }

    public void b_() {
        if (this.d != null) {
            this.d.b_();
        }
    }
}

