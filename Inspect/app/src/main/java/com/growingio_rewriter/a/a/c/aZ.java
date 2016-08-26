/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.aU;
import com.growingio.a.a.c.bl;
import com.growingio.a.a.c.bn;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

final class aZ
extends bl
implements aU,
Serializable {
    private static final long g = 7249069246863182397L;

    @Override
    final long a(long l2, long l3) {
        return l2 + l3;
    }

    @Override
    public void a(long l2) {
        long l3;
        bn[] arrbn = this.d;
        if (arrbn != null || !this.b(l3 = this.e, l3 + l2)) {
            bn bn2;
            long l4;
            int n2;
            boolean bl2 = true;
            int[] arrn = (int[])a.get();
            if (arrn == null || arrbn == null || (n2 = arrbn.length) < 1 || (bn2 = arrbn[n2 - 1 & arrn[0]]) == null || !(bl2 = bn2.a(l4 = bn2.h, l4 + l2))) {
                this.a(l2, arrn, bl2);
            }
        }
    }

    @Override
    public void a() {
        this.a(1);
    }

    public void c() {
        this.a(-1);
    }

    @Override
    public long b() {
        long l2 = this.e;
        bn[] arrbn = this.d;
        if (arrbn != null) {
            for (bn bn2 : arrbn) {
                if (bn2 == null) continue;
                l2 += bn2.h;
            }
        }
        return l2;
    }

    public void d() {
        this.b(0);
    }

    public long e() {
        long l2 = this.e;
        bn[] arrbn = this.d;
        this.e = 0;
        if (arrbn != null) {
            for (bn bn2 : arrbn) {
                if (bn2 == null) continue;
                l2 += bn2.h;
                bn2.h = 0;
            }
        }
        return l2;
    }

    public String toString() {
        return Long.toString(this.b());
    }

    @Override
    public long longValue() {
        return this.b();
    }

    @Override
    public int intValue() {
        return (int)this.b();
    }

    @Override
    public float floatValue() {
        return this.b();
    }

    @Override
    public double doubleValue() {
        return this.b();
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(this.b());
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f = 0;
        this.d = null;
        this.e = objectInputStream.readLong();
    }
}

