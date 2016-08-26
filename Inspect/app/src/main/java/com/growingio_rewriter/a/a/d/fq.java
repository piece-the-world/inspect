/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.eu;
import com.growingio.a.a.d.fp;
import com.growingio.a.a.d.fr;
import com.growingio.a.a.d.oP;
import java.util.Iterator;
import java.util.Map;

class fq
extends eu<K, V> {
    final /* synthetic */ fp a;

    fq(fp fp2) {
        this.a = fp2;
    }

    @Override
    public oP<Map.Entry<K, V>> k_() {
        return this.h().k_();
    }

    @Override
    ea<Map.Entry<K, V>> m() {
        return new fr(this);
    }

    @Override
    ei<K, V> c() {
        return this.a;
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.k_();
    }
}

