/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.j.L;
import com.growingio.a.a.j.N;
import java.util.Iterator;

class M
implements Iterable<String> {
    final /* synthetic */ L a;

    M(L l2) {
        this.a = l2;
    }

    @Override
    public Iterator<String> iterator() {
        return new N(this);
    }
}

