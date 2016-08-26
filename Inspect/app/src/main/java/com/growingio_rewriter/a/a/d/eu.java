/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.ev;
import com.growingio.a.a.d.fg;
import java.util.Map;

abstract class eu<K, V>
extends fg<Map.Entry<K, V>> {
    eu() {
    }

    abstract ei<K, V> c();

    @Override
    public int size() {
        return this.c().size();
    }

    @Override
    public boolean contains(Object object) {
        if (object instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry)object;
            V v2 = this.c().get(entry.getKey());
            return v2 != null && v2.equals(entry.getValue());
        }
        return false;
    }

    @Override
    boolean i_() {
        return this.c().b();
    }

    @Override
    boolean i() {
        return this.c().o();
    }

    @Override
    public int hashCode() {
        return this.c().hashCode();
    }

    @Override
    Object j_() {
        return new ev<K, V>(this.c());
    }
}

