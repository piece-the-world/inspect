/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.L;
import com.growingio.b.a.o;
import com.growingio.b.b;

class M
extends L {
    int a;

    M(int n2) {
        this.a = n2;
    }

    @Override
    int a(o o2) throws b {
        o2.p(this.a);
        return 1;
    }

    @Override
    String a() {
        return "([Ljava/lang/Object;I)Ljava/lang/Object;";
    }

    @Override
    String c() {
        return "([Ljava/lang/Object;I)V";
    }
}

