/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.h.M;
import com.growingio.a.a.h.aE;
import com.growingio.a.a.h.h;
import java.io.Serializable;

final class aD
extends h
implements Serializable {
    private final int a;
    private final int b;
    private final long c;
    private final long d;
    private static final long e = 0;

    aD(int n2, int n3, long l2, long l3) {
        aU.a(n2 > 0, "The number of SipRound iterations (c=%s) during Compression must be positive.", n2);
        aU.a(n3 > 0, "The number of SipRound iterations (d=%s) during Finalization must be positive.", n3);
        this.a = n2;
        this.b = n3;
        this.c = l2;
        this.d = l3;
    }

    @Override
    public int b() {
        return 64;
    }

    @Override
    public M a() {
        return new aE(this.a, this.b, this.c, this.d);
    }

    public String toString() {
        return "Hashing.sipHash" + this.a + "" + this.b + "(" + this.c + ", " + this.d + ")";
    }

    public boolean equals(Object object) {
        if (object instanceof aD) {
            aD aD2 = (aD)object;
            return this.a == aD2.a && this.b == aD2.b && this.c == aD2.c && this.d == aD2.d;
        }
        return false;
    }

    public int hashCode() {
        return (int)((long)(this.getClass().hashCode() ^ this.a ^ this.b) ^ this.c ^ this.d);
    }
}

