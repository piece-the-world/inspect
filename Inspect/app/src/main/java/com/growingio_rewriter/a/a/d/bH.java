/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.bG;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.j;
import java.util.Map;

class bH
extends j<Map.Entry<K, V>> {
    private int b;
    private final int c;
    final /* synthetic */ bG a;

    bH(bG bG2) {
        this.a = bG2;
        this.b = -1;
        this.c = this.a.h_().size();
    }

    protected Map.Entry<K, V> d() {
        ++this.b;
        while (this.b < this.c) {
            Object v2 = this.a.a(this.b);
            if (v2 != null) {
                return ii.a(this.a.c(this.b), v2);
            }
            ++this.b;
        }
        return (Map.Entry)this.b();
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.d();
    }
}

