/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.aA;
import com.growingio.b.a.aB;
import com.growingio.b.a.i;

class aG {
    int a = 0;

    private aG() {
    }

    int a(String string, int n2) throws i {
        int n3 = string.indexOf(n2, this.a);
        if (n3 < 0) {
            throw aA.f(string);
        }
        this.a = n3 + 1;
        return n3;
    }

    /* synthetic */ aG(aB aB2) {
        this();
    }
}

