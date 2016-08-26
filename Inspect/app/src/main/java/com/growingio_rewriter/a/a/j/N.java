/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.d.j;
import com.growingio.a.a.j.L;
import com.growingio.a.a.j.M;
import java.util.Iterator;

class N
extends j<String> {
    Iterator<String> a;
    final /* synthetic */ M b;

    N(M m2) {
        this.b = m2;
        this.a = L.j().a(L.a(this.b.a)).iterator();
    }

    protected String d() {
        if (this.a.hasNext()) {
            String string = this.a.next();
            if (this.a.hasNext() || !string.isEmpty()) {
                return string;
            }
        }
        return (String)this.b();
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.d();
    }
}

