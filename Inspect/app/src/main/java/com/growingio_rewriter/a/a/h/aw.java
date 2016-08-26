/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.h.H;
import com.growingio.a.a.h.a;
import com.growingio.a.a.h.av;
import java.security.MessageDigest;
import java.util.Arrays;

final class aw
extends a {
    private final MessageDigest a;
    private final int b;
    private boolean c;

    private aw(MessageDigest messageDigest, int n2) {
        this.a = messageDigest;
        this.b = n2;
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
        aU.b(!this.c, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override
    public H a() {
        this.b();
        this.c = true;
        return this.b == this.a.getDigestLength() ? H.b(this.a.digest()) : H.b(Arrays.copyOf(this.a.digest(), this.b));
    }

    /* synthetic */ aw(MessageDigest messageDigest, int n2, av av2) {
        this(messageDigest, n2);
    }
}

