/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.bG;
import com.growingio.a.a.c.B;
import java.io.Serializable;

final class G<V>
extends B<Object, V>
implements Serializable {
    private final bG<V> a;
    private static final long b = 0;

    public G(bG<V> bG2) {
        this.a = aU.a(bG2);
    }

    @Override
    public V a(Object object) {
        aU.a(object);
        return this.a.a();
    }
}

