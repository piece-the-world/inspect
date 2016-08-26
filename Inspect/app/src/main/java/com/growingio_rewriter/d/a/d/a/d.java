/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.d.a;

import com.growingio.d.a.d.a.m;
import com.growingio.d.a.u;

public class d
implements m {
    public static final d a = new d(null);
    public static final d b = new d(u.r);
    public static final d c = new d(u.s);
    public static final d d = new d(u.t);
    public static final d e = new d(u.u);
    public static final d f = new d(u.b("java/lang/Object"));
    public static final d g = new d(u.m);
    private final u h;

    public d(u u2) {
        this.h = u2;
    }

    public u a() {
        return this.h;
    }

    @Override
    public int b() {
        return this.h == u.t || this.h == u.u ? 2 : 1;
    }

    public boolean c() {
        return this.h != null && (this.h.a() == 10 || this.h.a() == 9);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof d) {
            if (this.h == null) {
                return ((d)object).h == null;
            }
            return this.h.equals(((d)object).h);
        }
        return false;
    }

    public int hashCode() {
        return this.h == null ? 0 : this.h.hashCode();
    }

    public String toString() {
        if (this == a) {
            return ".";
        }
        if (this == g) {
            return "A";
        }
        if (this == f) {
            return "R";
        }
        return this.h.i();
    }
}

