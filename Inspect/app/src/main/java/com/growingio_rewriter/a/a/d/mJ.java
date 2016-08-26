/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.j;
import com.growingio.a.a.d.mE;
import com.growingio.a.a.d.mF;
import com.growingio.a.a.d.mH;
import com.growingio.a.a.d.mK;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class mJ
extends j<Map.Entry<R, V>> {
    final Iterator<Map.Entry<R, Map<C, V>>> a;
    final /* synthetic */ mH b;

    private mJ(mH mH2) {
        this.b = mH2;
        this.a = this.b.b.a.entrySet().iterator();
    }

    protected Map.Entry<R, V> d() {
        while (this.a.hasNext()) {
            Map.Entry<R, Map<C, V>> entry = this.a.next();
            if (!entry.getValue().containsKey(this.b.a)) continue;
            return new mK(this, entry);
        }
        return (Map.Entry)this.b();
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.d();
    }

    /* synthetic */ mJ(mH mH2, mF mF2) {
        this(mH2);
    }
}

