/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.b;

import com.growingio.b.a.o;
import com.growingio.b.b.b;
import com.growingio.b.b.d;
import java.util.ArrayList;

class p
extends d {
    ArrayList a = new ArrayList();
    b b;
    int d;

    p(b b2) {
        super(b2);
        this.b = b2;
        this.d = -1;
    }

    private int a(int n2) {
        if (this.d < 0) {
            this.d = this.b.b();
            this.b.b(n2);
        }
        return this.d;
    }

    private void a(o o2) {
        o2.j(167);
        this.a.add(new int[]{o2.j(), this.d});
        o2.m(0);
    }

    @Override
    protected boolean a(o o2, int n2) {
        switch (n2) {
            case 177: {
                this.a(o2);
                break;
            }
            case 176: {
                o2.o(this.a(1));
                this.a(o2);
                o2.n(this.d);
                break;
            }
            case 172: {
                o2.r(this.a(1));
                this.a(o2);
                o2.q(this.d);
                break;
            }
            case 173: {
                o2.t(this.a(2));
                this.a(o2);
                o2.s(this.d);
                break;
            }
            case 175: {
                o2.v(this.a(2));
                this.a(o2);
                o2.u(this.d);
                break;
            }
            case 174: {
                o2.x(this.a(1));
                this.a(o2);
                o2.w(this.d);
                break;
            }
            default: {
                throw new RuntimeException("fatal");
            }
        }
        return false;
    }
}

