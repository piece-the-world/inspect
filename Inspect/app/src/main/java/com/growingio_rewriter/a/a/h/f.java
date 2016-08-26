/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.h.H;
import com.growingio.a.a.h.M;
import com.growingio.a.a.h.aC;
import com.growingio.a.a.h.d;
import com.growingio.a.a.h.e;
import com.growingio.a.a.h.g;
import com.growingio.a.a.h.x;
import java.io.IOException;

final class f
extends d {
    final g a;
    static final int b = 255;
    final /* synthetic */ e c;

    f(e e2, int n2) {
        this.c = e2;
        this.a = new g(n2);
    }

    @Override
    public M b(byte by2) {
        this.a.write(by2);
        return this;
    }

    @Override
    public M b(byte[] arrby) {
        try {
            this.a.write(arrby);
        }
        catch (IOException var2_2) {
            throw new RuntimeException(var2_2);
        }
        return this;
    }

    @Override
    public M b(byte[] arrby, int n2, int n3) {
        this.a.write(arrby, n2, n3);
        return this;
    }

    @Override
    public M a(short s2) {
        this.a.write(s2 & 255);
        this.a.write(s2 >>> 8 & 255);
        return this;
    }

    @Override
    public M a(int n2) {
        this.a.write(n2 & 255);
        this.a.write(n2 >>> 8 & 255);
        this.a.write(n2 >>> 16 & 255);
        this.a.write(n2 >>> 24 & 255);
        return this;
    }

    @Override
    public M a(long l2) {
        for (int i2 = 0; i2 < 64; i2 += 8) {
            this.a.write((byte)(l2 >>> i2 & 255));
        }
        return this;
    }

    @Override
    public M a(char c2) {
        this.a.write(c2 & 255);
        this.a.write(c2 >>> 8 & 255);
        return this;
    }

    @Override
    public <T> M a(T t2, x<? super T> x2) {
        x2.a(t2, this);
        return this;
    }

    @Override
    public H a() {
        return this.c.a(this.a.a(), 0, this.a.b());
    }

    @Override
    public /* synthetic */ aC b(char c2) {
        return this.a(c2);
    }

    @Override
    public /* synthetic */ aC b(long l2) {
        return this.a(l2);
    }

    @Override
    public /* synthetic */ aC b(int n2) {
        return this.a(n2);
    }

    @Override
    public /* synthetic */ aC b(short s2) {
        return this.a(s2);
    }

    @Override
    public /* synthetic */ aC c(byte[] arrby, int n2, int n3) {
        return this.b(arrby, n2, n3);
    }

    @Override
    public /* synthetic */ aC c(byte[] arrby) {
        return this.b(arrby);
    }

    @Override
    public /* synthetic */ aC c(byte by2) {
        return this.b(by2);
    }
}

