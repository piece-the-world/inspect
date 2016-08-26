/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.B;
import com.growingio.a.a.d.lI;
import com.growingio.a.a.d.n;
import java.util.Collection;
import java.util.Set;

class G
extends n<K, V>
implements Set<V> {
    final /* synthetic */ n a;

    G(K var1_1, Set<V> k2) {
        this.a = var1_1;
        super((n)var1_1, k2, set, null);
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int n2 = this.size();
        boolean bl2 = lI.a((Set)this.c, collection);
        if (bl2) {
            int n3 = this.c.size();
            n.a(this.a, n.d(this.a) + (n3 - n2));
            this.b();
        }
        return bl2;
    }
}

