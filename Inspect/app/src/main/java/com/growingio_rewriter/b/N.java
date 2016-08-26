/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.L;
import com.growingio.b.a.o;
import com.growingio.b.b;

class N
extends L {
    long a;

    N(long l2) {
        this.a = l2;
    }

    @Override
    int a(o o2) throws b {
        o2.a(this.a);
        return 2;
    }

    @Override
    String a() {
        return "([Ljava/lang/Object;J)Ljava/lang/Object;";
    }

    @Override
    String c() {
        return "([Ljava/lang/Object;J)V";
    }
}

