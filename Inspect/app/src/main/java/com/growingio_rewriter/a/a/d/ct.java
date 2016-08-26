/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.co;
import com.growingio.a.a.d.cr;
import com.growingio.a.a.d.cs;
import com.growingio.a.a.d.lI;
import java.util.Map;
import java.util.Set;

class ct
extends co<K, V>
implements Set<Map.Entry<K, V>> {
    final /* synthetic */ cs b;

    ct(cs cs2) {
        this.b = cs2;
        super(cs2);
    }

    @Override
    public int hashCode() {
        return lI.b(this);
    }

    @Override
    public boolean equals(Object object) {
        return lI.a(this, object);
    }
}

