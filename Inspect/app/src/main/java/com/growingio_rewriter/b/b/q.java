/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.b;

import com.growingio.b.a.o;
import com.growingio.b.b.b;
import com.growingio.b.b.d;

class q
extends d {
    int a;
    int b;

    q(b b2, int[] arrn) {
        super(b2);
        this.b = arrn[0];
        this.a = arrn[1];
    }

    @Override
    protected boolean a(o o2, int n2) {
        switch (n2) {
            case 177: {
                break;
            }
            case 176: {
                o2.o(this.a);
                break;
            }
            case 172: {
                o2.r(this.a);
                break;
            }
            case 173: {
                o2.t(this.a);
                break;
            }
            case 175: {
                o2.v(this.a);
                break;
            }
            case 174: {
                o2.x(this.a);
                break;
            }
            default: {
                throw new RuntimeException("fatal");
            }
        }
        o2.j(167);
        o2.m(this.b - o2.j() + 3);
        return true;
    }
}

