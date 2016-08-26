/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.h.M;
import com.growingio.a.a.h.aC;
import com.growingio.a.a.h.d;
import com.growingio.a.a.h.x;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

abstract class a
extends d {
    private final ByteBuffer a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    a() {
    }

    protected abstract void a(byte var1);

    protected void a(byte[] arrby) {
        this.a(arrby, 0, arrby.length);
    }

    protected void a(byte[] arrby, int n2, int n3) {
        for (int i2 = n2; i2 < n2 + n3; ++i2) {
            this.a(arrby[i2]);
        }
    }

    @Override
    public M b(byte by2) {
        this.a(by2);
        return this;
    }

    @Override
    public M b(byte[] arrby) {
        aU.a(arrby);
        this.a(arrby);
        return this;
    }

    @Override
    public M b(byte[] arrby, int n2, int n3) {
        aU.a(n2, n2 + n3, arrby.length);
        this.a(arrby, n2, n3);
        return this;
    }

    private M c(int n2) {
        try {
            this.a(this.a.array(), 0, n2);
        }
        finally {
            this.a.clear();
        }
        return this;
    }

    @Override
    public M a(short s2) {
        this.a.putShort(s2);
        return this.c(2);
    }

    @Override
    public M a(int n2) {
        this.a.putInt(n2);
        return this.c(4);
    }

    @Override
    public M a(long l2) {
        this.a.putLong(l2);
        return this.c(8);
    }

    @Override
    public M a(char c2) {
        this.a.putChar(c2);
        return this.c(2);
    }

    @Override
    public <T> M a(T t2, x<? super T> x2) {
        x2.a(t2, this);
        return this;
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

