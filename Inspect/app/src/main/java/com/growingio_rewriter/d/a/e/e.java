/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.e;

import com.growingio.d.a.a;
import com.growingio.d.a.c;
import com.growingio.d.a.e.d;
import com.growingio.d.a.e.f;
import com.growingio.d.a.j;
import com.growingio.d.a.v;

public class e
extends j {
    private boolean c;

    public e(j j2) {
        this(327680, j2);
        if (this.getClass() != e.class) {
            throw new IllegalStateException();
        }
    }

    protected e(int n2, j j2) {
        super(n2, j2);
    }

    @Override
    public a a(String string, boolean bl2) {
        this.b();
        f.b(string, false);
        return new com.growingio.d.a.e.c(super.a(string, bl2));
    }

    @Override
    public a a(int n2, v v2, String string, boolean bl2) {
        this.b();
        int n3 = n2 >>> 24;
        if (n3 != 19) {
            throw new IllegalArgumentException("Invalid type reference sort 0x" + Integer.toHexString(n3));
        }
        d.a(n2, v2);
        f.b(string, false);
        return new com.growingio.d.a.e.c(super.a(n2, v2, string, bl2));
    }

    @Override
    public void a(c c2) {
        this.b();
        if (c2 == null) {
            throw new IllegalArgumentException("Invalid attribute (must not be null)");
        }
        super.a(c2);
    }

    @Override
    public void a() {
        this.b();
        this.c = true;
        super.a();
    }

    private void b() {
        if (this.c) {
            throw new IllegalStateException("Cannot call a visit method after visitEnd has been called");
        }
    }
}

