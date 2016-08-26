/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.h.H;
import com.growingio.a.a.h.a;
import com.growingio.a.a.h.r;
import com.growingio.a.a.h.s;
import java.util.zip.Checksum;

final class t
extends a {
    private final Checksum b;
    final /* synthetic */ r a;

    private t(r r2, Checksum checksum) {
        this.a = r2;
        this.b = aU.a(checksum);
    }

    @Override
    protected void a(byte by2) {
        this.b.update(by2);
    }

    @Override
    protected void a(byte[] arrby, int n2, int n3) {
        this.b.update(arrby, n2, n3);
    }

    @Override
    public H a() {
        long l2 = this.b.getValue();
        if (r.a(this.a) == 32) {
            return H.a((int)l2);
        }
        return H.a(l2);
    }

    /* synthetic */ t(r r2, Checksum checksum, s s2) {
        this(r2, checksum);
    }
}

