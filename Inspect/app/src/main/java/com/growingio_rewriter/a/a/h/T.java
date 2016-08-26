/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.h.H;
import com.growingio.a.a.h.L;
import com.growingio.a.a.h.M;
import com.growingio.a.a.h.O;
import com.growingio.a.a.h.b;
import java.util.Arrays;

final class T
extends b {
    private final int b;

    private /* varargs */ T(L ... arrl) {
        super(arrl);
        int n2 = 0;
        for (L l2 : arrl) {
            n2 += l2.b();
            aU.a(l2.b() % 8 == 0, "the number of bits (%s) in hashFunction (%s) must be divisible by 8", l2.b(), (Object)l2);
        }
        this.b = n2;
    }

    @Override
    H a(M[] arrm) {
        byte[] arrby = new byte[this.b / 8];
        int n2 = 0;
        for (M m2 : arrm) {
            H h2 = m2.a();
            n2 += h2.a(arrby, n2, h2.a() / 8);
        }
        return H.b(arrby);
    }

    @Override
    public int b() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object instanceof T) {
            T t2 = (T)object;
            return Arrays.equals(this.a, t2.a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.a) * 31 + this.b;
    }

    /* synthetic */ T(L[] arrl, O o2) {
        this(arrl);
    }
}

