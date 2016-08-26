/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a;

public final class m {
    final int a;
    final String b;
    final String c;
    final String d;
    final boolean e;

    public m(int n2, String string, String string2, String string3) {
        this(n2, string, string2, string3, n2 == 9);
    }

    public m(int n2, String string, String string2, String string3, boolean bl2) {
        this.a = n2;
        this.b = string;
        this.c = string2;
        this.d = string3;
        this.e = bl2;
    }

    public int a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }

    public boolean e() {
        return this.e;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof m)) {
            return false;
        }
        m m2 = (m)object;
        return this.a == m2.a && this.e == m2.e && this.b.equals(m2.b) && this.c.equals(m2.c) && this.d.equals(m2.d);
    }

    public int hashCode() {
        return this.a + (this.e ? 64 : 0) + this.b.hashCode() * this.c.hashCode() * this.d.hashCode();
    }

    public String toString() {
        return this.b + '.' + this.c + this.d + " (" + this.a + (this.e ? " itf" : "") + ')';
    }
}

