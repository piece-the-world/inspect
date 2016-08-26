/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.c.B;
import com.growingio.a.a.c.N;
import com.growingio.a.a.c.O;
import com.growingio.a.a.c.P;
import com.growingio.a.a.c.ak;
import com.growingio.a.a.c.ao;
import com.growingio.a.a.c.f;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.o.a.dD;
import java.util.concurrent.ExecutionException;

class an<K, V>
extends ao<K, V>
implements N<K, V> {
    private static final long b = 1;

    an(f<? super K, ? super V> f2, B<? super K, V> b2) {
        super(new O<K, V>(f2, aU.a(b2)), null);
    }

    @Override
    public V e(K k2) throws ExecutionException {
        return this.a.c(k2);
    }

    @Override
    public V b(K k2) {
        try {
            return this.e(k2);
        }
        catch (ExecutionException var2_2) {
            throw new dD(var2_2.getCause());
        }
    }

    @Override
    public ei<K, V> c(Iterable<? extends K> iterable) throws ExecutionException {
        return this.a.b(iterable);
    }

    @Override
    public void c(K k2) {
        this.a.e(k2);
    }

    @Override
    public final V f(K k2) {
        return this.b(k2);
    }

    @Override
    Object f() {
        return new ak(this.a);
    }
}

