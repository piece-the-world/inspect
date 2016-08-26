/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.b;

import com.growingio.d.a.a;
import com.growingio.d.a.b.e;
import com.growingio.d.a.b.f;
import com.growingio.d.a.c;
import com.growingio.d.a.j;
import com.growingio.d.a.v;

public class g
extends j {
    private final f c;

    public g(j j2, f f2) {
        super(327680, j2);
        this.c = f2;
    }

    @Override
    public a a(String string, boolean bl2) {
        this.c.a(string);
        if (bl2) {
            this.c.a("RuntimeVisibleAnnotations");
        } else {
            this.c.a("RuntimeInvisibleAnnotations");
        }
        return new com.growingio.d.a.b.a(this.b.a(string, bl2), this.c);
    }

    @Override
    public a a(int n2, v v2, String string, boolean bl2) {
        this.c.a(string);
        if (bl2) {
            this.c.a("RuntimeVisibleTypeAnnotations");
        } else {
            this.c.a("RuntimeInvisibleTypeAnnotations");
        }
        return new com.growingio.d.a.b.a(this.b.a(string, bl2), this.c);
    }

    @Override
    public void a(c c2) {
        this.b.a(c2);
    }

    @Override
    public void a() {
        this.b.a();
    }
}

