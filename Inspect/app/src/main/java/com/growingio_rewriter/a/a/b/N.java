/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.m;
import java.util.Arrays;

class N
extends m {
    private final String o;
    private final char[] p;
    private final char[] q;

    N(String string, char[] arrc, char[] arrc2) {
        this.o = string;
        this.p = arrc;
        this.q = arrc2;
        aU.a(arrc.length == arrc2.length);
        for (int i2 = 0; i2 < arrc.length; ++i2) {
            aU.a(arrc[i2] <= arrc2[i2]);
            if (i2 + 1 >= arrc.length) continue;
            aU.a(arrc2[i2] < arrc[i2 + 1]);
        }
    }

    @Override
    public boolean c(char c2) {
        int n2 = Arrays.binarySearch(this.p, c2);
        if (n2 >= 0) {
            return true;
        }
        return (n2 = ~ n2 - 1) >= 0 && c2 <= this.q[n2];
    }

    @Override
    public String toString() {
        return this.o;
    }
}

