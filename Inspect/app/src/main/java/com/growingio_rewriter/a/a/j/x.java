/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aP;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.e;
import com.growingio.a.a.h.H;
import com.growingio.a.a.h.L;
import com.growingio.a.a.j.b;
import com.growingio.a.a.j.r;
import com.growingio.a.a.j.v;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

class x
extends v {
    final byte[] a;
    final int b;
    final int c;

    x(byte[] arrby) {
        this(arrby, 0, arrby.length);
    }

    x(byte[] arrby, int n2, int n3) {
        this.a = arrby;
        this.b = n2;
        this.c = n3;
    }

    @Override
    public InputStream a() {
        return new ByteArrayInputStream(this.a, this.b, this.c);
    }

    @Override
    public InputStream b() throws IOException {
        return this.a();
    }

    @Override
    public boolean c() {
        return this.c == 0;
    }

    @Override
    public long e() {
        return this.c;
    }

    @Override
    public aP<Long> d() {
        return aP.b(Long.valueOf(this.c));
    }

    @Override
    public byte[] f() {
        return Arrays.copyOfRange(this.a, this.b, this.b + this.c);
    }

    @Override
    public long a(OutputStream outputStream) throws IOException {
        outputStream.write(this.a, this.b, this.c);
        return this.c;
    }

    @Override
    public <T> T a(r<T> r2) throws IOException {
        r2.a(this.a, this.b, this.c);
        return r2.a();
    }

    @Override
    public H a(L l2) throws IOException {
        return l2.a(this.a, this.b, this.c);
    }

    @Override
    public v a(long l2, long l3) {
        aU.a(l2 >= 0, "offset (%s) may not be negative", l2);
        aU.a(l3 >= 0, "length (%s) may not be negative", l3);
        l2 = Math.min(l2, (long)this.c);
        l3 = Math.min(l3, (long)this.c - l2);
        int n2 = this.b + (int)l2;
        return new x(this.a, n2, (int)l3);
    }

    public String toString() {
        return "ByteSource.wrap(" + e.a(b.i().a(this.a, this.b, this.c), 30, "...") + ")";
    }
}

