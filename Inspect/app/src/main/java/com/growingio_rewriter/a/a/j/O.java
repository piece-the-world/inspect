/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aP;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.j.J;
import com.growingio.a.a.j.au;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

final class O
extends J {
    private final Iterable<? extends J> a;

    O(Iterable<? extends J> iterable) {
        this.a = aU.a(iterable);
    }

    @Override
    public Reader a() throws IOException {
        return new au(this.a.iterator());
    }

    @Override
    public boolean h() throws IOException {
        for (J j2 : this.a) {
            if (j2.h()) continue;
            return false;
        }
        return true;
    }

    @Override
    public aP<Long> c() {
        long l2 = 0;
        for (J j2 : this.a) {
            aP<Long> aP2 = j2.c();
            if (!aP2.b()) {
                return aP.f();
            }
            l2 += aP2.c().longValue();
        }
        return aP.b(l2);
    }

    @Override
    public long d() throws IOException {
        long l2 = 0;
        for (J j2 : this.a) {
            l2 += j2.d();
        }
        return l2;
    }

    public String toString() {
        return "CharSource.concat(" + this.a + ")";
    }
}

