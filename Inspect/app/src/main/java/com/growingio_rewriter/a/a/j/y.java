/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aP;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.j.at;
import com.growingio.a.a.j.v;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

final class y
extends v {
    final Iterable<? extends v> a;

    y(Iterable<? extends v> iterable) {
        this.a = aU.a(iterable);
    }

    @Override
    public InputStream a() throws IOException {
        return new at(this.a.iterator());
    }

    @Override
    public boolean c() throws IOException {
        for (v v2 : this.a) {
            if (v2.c()) continue;
            return false;
        }
        return true;
    }

    @Override
    public aP<Long> d() {
        long l2 = 0;
        for (v v2 : this.a) {
            aP<Long> aP2 = v2.d();
            if (!aP2.b()) {
                return aP.f();
            }
            l2 += aP2.c().longValue();
        }
        return aP.b(l2);
    }

    @Override
    public long e() throws IOException {
        long l2 = 0;
        for (v v2 : this.a) {
            l2 += v2.e();
        }
        return l2;
    }

    public String toString() {
        return "ByteSource.concat(" + this.a + ")";
    }
}

