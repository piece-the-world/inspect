/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.nb;
import com.growingio.a.a.d.nh;
import com.growingio.a.a.d.nj;
import java.util.Collection;
import java.util.Iterator;

class ng<V>
extends nj<Collection<V>> {
    private static final long a = 0;

    ng(Collection<Collection<V>> collection, Object object) {
        super(collection, object, null);
    }

    @Override
    public Iterator<Collection<V>> iterator() {
        return new nh(this, super.iterator());
    }
}

