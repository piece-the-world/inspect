/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.h.au;
import com.growingio.a.a.h.av;
import java.io.Serializable;

final class ax
implements Serializable {
    private final String a;
    private final int b;
    private final String c;
    private static final long d = 0;

    private ax(String string, int n2, String string2) {
        this.a = string;
        this.b = n2;
        this.c = string2;
    }

    private Object a() {
        return new au(this.a, this.b, this.c);
    }

    /* synthetic */ ax(String string, int n2, String string2, av av2) {
        this(string, n2, string2);
    }
}

