/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aP;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.j.B;
import com.growingio.a.a.j.T;
import com.growingio.a.a.j.v;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

final class A
extends v {
    final long a;
    final long b;
    final /* synthetic */ v c;

    A(v v2, long l2, long l3) {
        this.c = v2;
        aU.a(l2 >= 0, "offset (%s) may not be negative", l2);
        aU.a(l3 >= 0, "length (%s) may not be negative", l3);
        this.a = l2;
        this.b = l3;
    }

    @Override
    public InputStream a() throws IOException {
        return this.a(this.c.a());
    }

    @Override
    public InputStream b() throws IOException {
        return this.a(this.c.b());
    }

    private InputStream a(InputStream inputStream) throws IOException {
        if (this.a > 0) {
            long l2;
            try {
                l2 = B.c(inputStream, this.a);
            }
            catch (Throwable var4_3) {
                T t2 = T.a();
                t2.a(inputStream);
                try {
                    throw t2.a(var4_3);
                }
                catch (Throwable var6_5) {
                    t2.close();
                    throw var6_5;
                }
            }
            if (l2 < this.a) {
                inputStream.close();
                return new ByteArrayInputStream(new byte[0]);
            }
        }
        return B.a(inputStream, this.b);
    }

    @Override
    public v a(long l2, long l3) {
        aU.a(l2 >= 0, "offset (%s) may not be negative", l2);
        aU.a(l3 >= 0, "length (%s) may not be negative", l3);
        long l4 = this.b - l2;
        return this.c.a(this.a + l2, Math.min(l3, l4));
    }

    @Override
    public boolean c() throws IOException {
        return this.b == 0 || super.c();
    }

    @Override
    public aP<Long> d() {
        aP<Long> aP2 = this.c.d();
        if (aP2.b()) {
            long l2 = aP2.c();
            long l3 = Math.min(this.a, l2);
            return aP.b(Math.min(this.b, l2 - l3));
        }
        return aP.f();
    }

    public String toString() {
        return this.c.toString() + ".slice(" + this.a + ", " + this.b + ")";
    }
}

