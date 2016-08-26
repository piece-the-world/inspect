/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.bG;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.j;
import com.growingio.a.a.d.mE;
import com.growingio.a.a.d.mF;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class mN
extends j<C> {
    final Map<C, V> a;
    final Iterator<Map<C, V>> b;
    Iterator<Map.Entry<C, V>> c;
    final /* synthetic */ mE d;

    private mN(mE mE2) {
        this.d = mE2;
        this.a = this.d.b.a();
        this.b = this.d.a.values().iterator();
        this.c = gb.a();
    }

    @Override
    protected C a() {
        do {
            if (this.c.hasNext()) {
                Map.Entry<C, V> entry = this.c.next();
                if (this.a.containsKey(entry.getKey())) continue;
                this.a.put(entry.getKey(), entry.getValue());
                return entry.getKey();
            }
            if (!this.b.hasNext()) break;
            this.c = this.b.next().entrySet().iterator();
        } while (true);
        return (C)this.b();
    }

    /* synthetic */ mN(mE mE2, mF mF2) {
        this(mE2);
    }
}

