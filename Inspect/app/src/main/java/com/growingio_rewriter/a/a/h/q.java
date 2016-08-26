/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.k.n;
import java.math.RoundingMode;
import java.util.Arrays;

final class q {
    final long[] a;
    long b;

    q(long l2) {
        this(new long[com.growingio.a.a.m.q.a(n.a(l2, 64, RoundingMode.CEILING))]);
    }

    q(long[] arrl) {
        aU.a(arrl.length > 0, (Object)"data length is zero!");
        this.a = arrl;
        long l2 = 0;
        for (long l3 : arrl) {
            l2 += (long)Long.bitCount(l3);
        }
        this.b = l2;
    }

    boolean a(long l2) {
        if (!this.b(l2)) {
            long[] arrl = this.a;
            int n2 = (int)(l2 >>> 6);
            arrl[n2] = arrl[n2] | 1 << (int)l2;
            ++this.b;
            return true;
        }
        return false;
    }

    boolean b(long l2) {
        return (this.a[(int)(l2 >>> 6)] & 1 << (int)l2) != 0;
    }

    long a() {
        return (long)this.a.length * 64;
    }

    long b() {
        return this.b;
    }

    q c() {
        return new q((long[])this.a.clone());
    }

    void a(q q2) {
        aU.a(this.a.length == q2.a.length, "BitArrays must be of equal length (%s != %s)", this.a.length, q2.a.length);
        this.b = 0;
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            long[] arrl = this.a;
            int n2 = i2;
            arrl[n2] = arrl[n2] | q2.a[i2];
            this.b += (long)Long.bitCount(this.a[i2]);
        }
    }

    public boolean equals(Object object) {
        if (object instanceof q) {
            q q2 = (q)object;
            return Arrays.equals(this.a, q2.a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }
}

