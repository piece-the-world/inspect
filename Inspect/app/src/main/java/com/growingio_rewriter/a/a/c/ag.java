/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  com.growingio.a.a.c.O.com.growingio.a.a.c.R
 */
package com.growingio.a.a.c;

import com.growingio.a.a.b.ab;
import com.growingio.a.a.c.O;
import com.growingio.a.a.c.R;
import com.growingio.a.a.c.af;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

final class ag
extends com.growingio.a.a.c.O.com.growingio.a.a.c.R<Map.Entry<K, V>> {
    final /* synthetic */ O c;

    ag(ConcurrentMap<?, ?> var1_1) {
        this.c = var1_1;
        super((O)var1_1, concurrentMap);
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new af(this.c);
    }

    public boolean contains(Object object) {
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry)object;
        Object k2 = entry.getKey();
        if (k2 == null) {
            return false;
        }
        Object v2 = this.c.get(k2);
        return v2 != null && this.c.l.a(entry.getValue(), v2);
    }

    public boolean remove(Object object) {
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry)object;
        Object k2 = entry.getKey();
        return k2 != null && this.c.remove(k2, entry.getValue());
    }
}

