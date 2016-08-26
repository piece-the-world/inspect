/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile;

import com.growingio.d.a.a.o;

public final class c {
    private final String a;
    private final String b;
    private final String c;

    public c(String string, String string2, String string3) {
        this.a = string;
        this.c = string2;
        this.b = string3;
    }

    static c a(String string) {
        try {
            String string2;
            int n2 = string.lastIndexOf(40);
            if (n2 == -1) {
                n2 = string.length();
                string2 = "";
            } else {
                string2 = string.substring(n2);
            }
            int n3 = string.substring(0, n2).lastIndexOf(46);
            return new c(string.substring(0, n3), string.substring(n3 + 1, n2), string2);
        }
        catch (Exception var1_3) {
            throw new RuntimeException("Error parsing " + string, var1_3);
        }
    }

    o a() {
        return new o(this.c, this.b);
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.b;
    }

    public int hashCode() {
        int n2 = 0;
        int n3 = (((this.a == null ? 0 : this.a.hashCode()) + 31) * 31 + (this.b == null ? 0 : this.b.hashCode())) * 31;
        if (this.c != null) {
            n2 = this.c.hashCode();
        }
        return n3 + n2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        c c2 = (c)object;
        if (this.a == null ? c2.a != null : !this.a.equals(c2.a)) {
            return false;
        }
        if (this.b == null ? c2.b != null : !this.b.equals(c2.b)) {
            return false;
        }
        if (this.c == null) {
            if (c2.c != null) {
                return false;
            }
            return true;
        }
        if (this.c.equals(c2.c)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.a + '.' + this.c + this.b;
    }
}

