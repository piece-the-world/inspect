/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a;

import com.growingio.d.a.a;
import com.growingio.d.a.c;
import com.growingio.d.a.j;
import com.growingio.d.a.r;
import com.growingio.d.a.v;

public abstract class f {
    protected final int f;
    public f g;

    public f(int n2) {
        this(n2, null);
    }

    public f(int n2, f f2) {
        if (n2 != 262144 && n2 != 327680) {
            throw new IllegalArgumentException();
        }
        this.f = n2;
        this.g = f2;
    }

    public void a(int n2, int n3, String string, String string2, String string3, String[] arrstring) {
        if (this.g != null) {
            this.g.a(n2, n3, string, string2, string3, arrstring);
        }
    }

    public void a_(String string, String string2) {
        if (this.g != null) {
            this.g.a_(string, string2);
        }
    }

    public void a(String string, String string2, String string3) {
        if (this.g != null) {
            this.g.a(string, string2, string3);
        }
    }

    public a a(String string, boolean bl2) {
        if (this.g != null) {
            return this.g.a(string, bl2);
        }
        return null;
    }

    public a a(int n2, v v2, String string, boolean bl2) {
        if (this.f < 327680) {
            throw new RuntimeException();
        }
        if (this.g != null) {
            return this.g.a(n2, v2, string, bl2);
        }
        return null;
    }

    public void a(c c2) {
        if (this.g != null) {
            this.g.a(c2);
        }
    }

    public void a(String string, String string2, String string3, int n2) {
        if (this.g != null) {
            this.g.a(string, string2, string3, n2);
        }
    }

    public j a(int n2, String string, String string2, String string3, Object object) {
        if (this.g != null) {
            return this.g.a(n2, string, string2, string3, object);
        }
        return null;
    }

    public r a(int n2, String string, String string2, String string3, String[] arrstring) {
        if (this.g != null) {
            return this.g.a(n2, string, string2, string3, arrstring);
        }
        return null;
    }

    public void a() {
        if (this.g != null) {
            this.g.a();
        }
    }
}

