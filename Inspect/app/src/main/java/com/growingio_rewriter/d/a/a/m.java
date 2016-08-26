/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.a;

import com.growingio.d.a.a.l;
import com.growingio.d.a.d.a;
import com.growingio.d.a.d.i;
import com.growingio.d.a.d.o;
import java.util.AbstractMap;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class m
extends AbstractMap<o, o> {
    final m a;
    public final BitSet b;
    public final Map<o, o> c;
    public final o d;
    final /* synthetic */ l e;

    m(l l2, m m2, BitSet bitSet) {
        this.e = l2;
        this.c = new HashMap<o, o>();
        this.a = m2;
        this.b = bitSet;
        Object object = m2;
        while (object != null) {
            if (object.b == bitSet) {
                throw new RuntimeException("Recursive invocation of " + bitSet);
            }
            object = object.a;
        }
        this.d = m2 != null ? new o() : null;
        object = null;
        int n2 = l2.bm_.a();
        for (int i2 = 0; i2 < n2; ++i2) {
            a a2 = l2.bm_.a(i2);
            if (a2.b() == 8) {
                o o2 = (o)a2;
                if (object == null) {
                    object = new o();
                }
                this.c.put(o2, (o)object);
                continue;
            }
            if (this.a(i2) != this) continue;
            object = null;
        }
    }

    public m a(int n2) {
        if (!this.b.get(n2)) {
            return null;
        }
        if (!this.e.a.get(n2)) {
            return this;
        }
        m m2 = this;
        m m3 = this.a;
        while (m3 != null) {
            if (m3.b.get(n2)) {
                m2 = m3;
            }
            m3 = m3.a;
        }
        return m2;
    }

    public o a(o o2) {
        m m2 = this.a(this.e.bm_.b(o2));
        return m2.c.get(o2);
    }

    public o b(o o2) {
        return this.c.get(o2);
    }

    @Override
    public Set<Map.Entry<o, o>> entrySet() {
        return null;
    }

    public o a(Object object) {
        return this.a((o)object);
    }

    @Override
    public /* synthetic */ Object get(Object object) {
        return this.a(object);
    }
}

