/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.ao;
import com.growingio.a.a.d.aq;
import com.growingio.a.a.d.i;
import java.util.Map;

class ap
extends i<Map.Entry<K, V>> {
    final /* synthetic */ ao a;

    ap(ao ao2, int n2) {
        this.a = ao2;
        super(n2);
    }

    protected Map.Entry<K, V> b(int n2) {
        return new aq(this, n2);
    }

    @Override
    protected /* synthetic */ Object a(int n2) {
        return this.b(n2);
    }
}

