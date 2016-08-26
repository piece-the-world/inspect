/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.bO;
import com.growingio.a.a.d.bu;
import com.growingio.a.a.d.eX;
import com.growingio.a.a.d.eZ;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.j;
import com.growingio.a.a.d.kW;
import com.growingio.a.a.d.oP;
import java.util.Iterator;

class fa
extends j<C> {
    final Iterator<kW<C>> a;
    Iterator<C> b;
    final /* synthetic */ eZ c;

    fa(eZ eZ2) {
        this.c = eZ2;
        this.a = eX.a(this.c.a).k_();
        this.b = gb.a();
    }

    protected C d() {
        while (!this.b.hasNext()) {
            if (this.a.hasNext()) {
                this.b = bu.a(this.a.next(), eZ.a(this.c)).k_();
                continue;
            }
            return (C)((Comparable)this.b());
        }
        return (C)((Comparable)this.b.next());
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.d();
    }
}

