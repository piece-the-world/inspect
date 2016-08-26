/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aV;
import com.growingio.a.a.d.aN;
import com.growingio.a.a.d.lI;
import java.util.Collection;
import java.util.Set;

class lS<E>
extends aN<E>
implements Set<E> {
    lS(Set<E> set, aV<? super E> aV2) {
        super(set, aV2);
    }

    @Override
    public boolean equals(Object object) {
        return lI.a(this, object);
    }

    @Override
    public int hashCode() {
        return lI.b(this);
    }
}

