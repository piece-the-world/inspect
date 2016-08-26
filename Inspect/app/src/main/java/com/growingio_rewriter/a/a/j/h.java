/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.e;
import com.growingio.a.a.b.m;
import com.growingio.a.a.j.k;
import com.growingio.a.a.k.f;
import java.math.RoundingMode;
import java.util.Arrays;

final class h
extends m {
    private final String s;
    private final char[] t;
    final int o;
    final int p;
    final int q;
    final int r;
    private final byte[] u;
    private final boolean[] v;

    h(String string, char[] arrc) {
        int n2;
        this.s = aU.a(string);
        this.t = aU.a(arrc);
        try {
            this.p = f.a(arrc.length, RoundingMode.UNNECESSARY);
        }
        catch (ArithmeticException var3_3) {
            throw new IllegalArgumentException("Illegal alphabet length " + arrc.length, var3_3);
        }
        int n3 = Math.min(8, Integer.lowestOneBit(this.p));
        try {
            this.q = 8 / n3;
            this.r = this.p / n3;
        }
        catch (ArithmeticException var4_5) {
            throw new IllegalArgumentException("Illegal alphabet " + new String(arrc), var4_5);
        }
        this.o = arrc.length - 1;
        byte[] arrby = new byte[128];
        Arrays.fill(arrby, -1);
        for (int i2 = 0; i2 < arrc.length; ++i2) {
            n2 = arrc[i2];
            aU.a(m.e().c((char)n2), "Non-ASCII character: %s", (char)n2);
            aU.a(arrby[n2] == -1, "Duplicate character: %s", (char)n2);
            arrby[n2] = (byte)i2;
        }
        this.u = arrby;
        boolean[] arrbl = new boolean[this.q];
        for (n2 = 0; n2 < this.r; ++n2) {
            arrbl[f.a((int)(n2 * 8), (int)this.p, (RoundingMode)RoundingMode.CEILING)] = true;
        }
        this.v = arrbl;
    }

    char a(int n2) {
        return this.t[n2];
    }

    boolean b(int n2) {
        return this.v[n2 % this.q];
    }

    boolean e(char c2) {
        return c2 <= '' && this.u[c2] != -1;
    }

    int f(char c2) throws k {
        if (c2 > '' || this.u[c2] == -1) {
            throw new k("Unrecognized character: " + (m.m().c(c2) ? new StringBuilder().append("0x").append(Integer.toHexString(c2)).toString() : Character.valueOf(c2)));
        }
        return this.u[c2];
    }

    private boolean t() {
        for (char c2 : this.t) {
            if (!e.c(c2)) continue;
            return true;
        }
        return false;
    }

    private boolean u() {
        for (char c2 : this.t) {
            if (!e.d(c2)) continue;
            return true;
        }
        return false;
    }

    h r() {
        if (!this.t()) {
            return this;
        }
        aU.b(!this.u(), "Cannot call upperCase() on a mixed-case alphabet");
        char[] arrc = new char[this.t.length];
        for (int i2 = 0; i2 < this.t.length; ++i2) {
            arrc[i2] = e.b(this.t[i2]);
        }
        return new h(this.s + ".upperCase()", arrc);
    }

    h s() {
        if (!this.u()) {
            return this;
        }
        aU.b(!this.t(), "Cannot call lowerCase() on a mixed-case alphabet");
        char[] arrc = new char[this.t.length];
        for (int i2 = 0; i2 < this.t.length; ++i2) {
            arrc[i2] = e.a(this.t[i2]);
        }
        return new h(this.s + ".lowerCase()", arrc);
    }

    @Override
    public boolean c(char c2) {
        return m.e().c(c2) && this.u[c2] != -1;
    }

    @Override
    public String toString() {
        return this.s;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof h) {
            h h2 = (h)object;
            return Arrays.equals(this.t, h2.t);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.t);
    }

    static /* synthetic */ char[] a(h h2) {
        return h2.t;
    }
}

