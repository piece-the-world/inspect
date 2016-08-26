/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile.a;

import com.growingio.agent.compile.a.f;
import com.growingio.agent.compile.a.g;
import com.growingio.d.a.a.j;
import com.growingio.d.a.a.o;
import com.growingio.d.a.r;
import com.growingio.d.a.u;

class h
extends j {
    final /* synthetic */ boolean a;
    final /* synthetic */ o b;
    final /* synthetic */ g c;

    h(g g2, int n2, o o2, r r2, boolean bl2, o o3) {
        this.c = g2;
        this.a = bl2;
        this.b = o3;
        super(n2, o2, r2);
    }

    @Override
    public void a_() {
        int n2;
        super.a_();
        if (this.a) {
            this.d();
            for (n2 = 0; n2 < this.b.d().length; ++n2) {
                this.c(n2);
            }
            this.a(183, this.c.b.e, this.b.a(), this.b.b(), false);
        }
        this.d();
        for (n2 = 0; n2 < this.b.d().length; ++n2) {
            this.c(n2);
        }
        this.c.b.a(this, this.b, this.c.a);
    }
}

