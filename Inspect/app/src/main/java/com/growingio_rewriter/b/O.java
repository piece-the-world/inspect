/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.L;
import com.growingio.b.a.o;
import com.growingio.b.b;

class O
extends L {
    String a;

    O(String string) {
        this.a = string;
    }

    @Override
    int a(o o2) throws b {
        o2.c(this.a);
        return 1;
    }

    @Override
    String a() {
        return "([Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;";
    }

    @Override
    String c() {
        return "([Ljava/lang/Object;Ljava/lang/String;)V";
    }
}

