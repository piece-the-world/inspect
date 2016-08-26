/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.bA;
import com.growingio.a.a.b.bp;
import com.growingio.a.a.b.bw;

class bx
extends bA {
    final /* synthetic */ bw a;

    bx(bw bw2, bp bp2, CharSequence charSequence) {
        this.a = bw2;
        super(bp2, charSequence);
    }

    @Override
    public int a(int n2) {
        int n3 = n2 + this.a.a;
        return n3 < this.c.length() ? n3 : -1;
    }

    @Override
    public int b(int n2) {
        return n2;
    }
}

