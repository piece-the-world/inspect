/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.bA;
import com.growingio.a.a.b.bp;
import com.growingio.a.a.b.bs;

class bt
extends bA {
    final /* synthetic */ bs a;

    bt(bs bs2, bp bp2, CharSequence charSequence) {
        this.a = bs2;
        super(bp2, charSequence);
    }

    @Override
    public int a(int n2) {
        int n3 = this.a.a.length();
        int n4 = this.c.length() - n3;
        block0 : for (int i2 = n2; i2 <= n4; ++i2) {
            for (int i3 = 0; i3 < n3; ++i3) {
                if (this.c.charAt(i3 + i2) != this.a.a.charAt(i3)) continue block0;
            }
            return i2;
        }
        return -1;
    }

    @Override
    public int b(int n2) {
        return n2 + this.a.a.length();
    }
}

