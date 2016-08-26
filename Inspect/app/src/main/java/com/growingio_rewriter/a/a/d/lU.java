/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.lI;
import java.util.AbstractSet;
import java.util.Collection;

abstract class lU<E>
extends AbstractSet<E> {
    lU() {
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return lI.a(this, collection);
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return super.retainAll(aU.a(collection));
    }
}

