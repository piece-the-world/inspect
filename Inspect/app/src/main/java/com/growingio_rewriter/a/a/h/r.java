/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.bG;
import com.growingio.a.a.h.M;
import com.growingio.a.a.h.h;
import com.growingio.a.a.h.s;
import com.growingio.a.a.h.t;
import java.io.Serializable;
import java.util.zip.Checksum;

final class r
extends h
implements Serializable {
    private final bG<? extends Checksum> a;
    private final int b;
    private final String c;
    private static final long d = 0;

    r(bG<? extends Checksum> bG2, int n2, String string) {
        this.a = aU.a(bG2);
        aU.a(n2 == 32 || n2 == 64, "bits (%s) must be either 32 or 64", n2);
        this.b = n2;
        this.c = aU.a(string);
    }

    @Override
    public int b() {
        return this.b;
    }

    @Override
    public M a() {
        return new t(this, this.a.a(), null);
    }

    public String toString() {
        return this.c;
    }

    static /* synthetic */ int a(r r2) {
        return r2.b;
    }
}

