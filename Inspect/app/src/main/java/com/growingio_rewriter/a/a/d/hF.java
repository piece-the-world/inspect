/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aq;
import com.growingio.a.a.b.bP;
import com.growingio.a.a.d.aY;
import com.growingio.a.a.d.aZ;
import com.growingio.a.a.d.hE;
import java.io.Serializable;
import java.util.concurrent.ExecutionException;

final class hF<K, V>
extends aZ<K, V>
implements Serializable {
    private static final long u = 0;

    hF(hE hE2, aq<? super K, ? extends V> aq2) {
        super(hE2, aq2);
    }

    @Override
    public V get(Object object) {
        Object v2;
        try {
            v2 = this.a(object);
        }
        catch (ExecutionException var3_3) {
            Throwable throwable = var3_3.getCause();
            bP.b(throwable, aY.class);
            throw new aY(throwable);
        }
        if (v2 == null) {
            throw new NullPointerException(this.a + " returned null for key " + object + ".");
        }
        return v2;
    }
}

