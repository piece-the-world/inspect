/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.h.H;
import com.growingio.a.a.h.a;
import com.growingio.a.a.h.as;
import javax.crypto.Mac;

final class at
extends a {
    private final Mac a;
    private boolean b;

    private at(Mac mac) {
        this.a = mac;
    }

    @Override
    protected void a(byte by2) {
        this.b();
        this.a.update(by2);
    }

    @Override
    protected void a(byte[] arrby) {
        this.b();
        this.a.update(arrby);
    }

    @Override
    protected void a(byte[] arrby, int n2, int n3) {
        this.b();
        this.a.update(arrby, n2, n3);
    }

    private void b() {
        aU.b(!this.b, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override
    public H a() {
        this.b();
        this.b = true;
        return H.b(this.a.doFinal());
    }

    /* synthetic */ at(Mac mac, as as2) {
        this(mac);
    }
}

