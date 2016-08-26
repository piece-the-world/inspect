/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a;

import com.growingio.d.a.a;
import com.growingio.d.a.c;
import com.growingio.d.a.v;

public abstract class j {
    protected final int a;
    protected j b;

    public j(int n2) {
        this(n2, null);
    }

    public j(int n2, j j2) {
        if (n2 != 262144 && n2 != 327680) {
            throw new IllegalArgumentException();
        }
        this.a = n2;
        this.b = j2;
    }

    public a a(String string, boolean bl2) {
        if (this.b != null) {
            return this.b.a(string, bl2);
        }
        return null;
    }

    public a a(int n2, v v2, String string, boolean bl2) {
        if (this.a < 327680) {
            throw new RuntimeException();
        }
        if (this.b != null) {
            return this.b.a(n2, v2, string, bl2);
        }
        return null;
    }

    public void a(c c2) {
        if (this.b != null) {
            this.b.a(c2);
        }
    }

    public void a() {
        if (this.b != null) {
            this.b.a();
        }
    }
}

