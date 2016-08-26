/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aP;
import com.growingio.a.a.d.aw;
import com.growingio.a.a.d.ax;
import com.growingio.a.a.d.j;

class ay
extends j<T> {
    boolean a;
    boolean b;
    final /* synthetic */ ax c;

    ay(ax ax2) {
        this.c = ax2;
    }

    @Override
    protected T a() {
        aP<Object> aP2;
        if (!this.a) {
            this.a = true;
            aP2 = this.c.b.a(this.c.a);
            if (aP2.b()) {
                return (T)aP2.c();
            }
        }
        if (!this.b) {
            this.b = true;
            aP2 = this.c.b.b(this.c.a);
            if (aP2.b()) {
                return (T)aP2.c();
            }
        }
        return this.b();
    }
}

