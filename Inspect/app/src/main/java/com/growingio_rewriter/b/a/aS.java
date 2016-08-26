/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.aP;
import com.growingio.b.a.aV;
import com.growingio.b.a.aY;
import com.growingio.b.a.l;

class aS
extends aV {
    int a;

    aS(aP aP2, int n2) {
        super(aP2);
        this.a = n2;
    }

    @Override
    public int b(int n2, int n3, int n4) {
        return this.c(n2, n3, n4);
    }

    private int c(int n2, int n3, int n4) {
        int n5;
        byte by2;
        int n6;
        int n7 = n2;
        int n8 = 0;
        for (n6 = 0; n6 < n4; ++n6) {
            by2 = this.e[n7];
            if (by2 == 7) {
                n7 += 3;
                continue;
            }
            if (by2 == 8) {
                n5 = l.a(this.e, n7 + 1);
                if (n5 == this.a) {
                    ++n8;
                }
                n7 += 3;
                continue;
            }
            ++n7;
        }
        this.b.a(n4 - n8);
        for (n6 = 0; n6 < n4; ++n6) {
            by2 = this.e[n2];
            if (by2 == 7) {
                n5 = l.a(this.e, n2 + 1);
                this.a(n2, n5);
                n2 += 3;
                continue;
            }
            if (by2 == 8) {
                n5 = l.a(this.e, n2 + 1);
                if (n5 != this.a) {
                    this.b(n2, n5);
                }
                n2 += 3;
                continue;
            }
            this.a(n2, by2);
            ++n2;
        }
        return n2;
    }
}

