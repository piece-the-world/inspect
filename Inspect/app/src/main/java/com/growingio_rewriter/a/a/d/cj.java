/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aV;
import com.growingio.a.a.b.aW;
import com.growingio.a.a.d.cc;
import com.growingio.a.a.d.ci;
import com.growingio.a.a.d.ck;
import com.growingio.a.a.d.kA;
import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.km;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class cj
extends kA<K> {
    final /* synthetic */ ci a;

    cj(ci ci2) {
        this.a = ci2;
    }

    @Override
    kl<K> a() {
        return this.a;
    }

    @Override
    public Iterator<km<K>> iterator() {
        return this.a.b();
    }

    @Override
    public int size() {
        return this.a.a.q().size();
    }

    private boolean a(aV<? super km<K>> aV2) {
        return this.a.a.a(new ck(this, aV2));
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return this.a(aW.a(collection));
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return this.a(aW.a(aW.a(collection)));
    }
}

