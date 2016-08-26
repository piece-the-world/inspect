/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.fg;
import java.io.Serializable;

class fk
implements Serializable {
    final Object[] a;
    private static final long b = 0;

    fk(Object[] arrobject) {
        this.a = arrobject;
    }

    Object a() {
        return fg.a(this.a);
    }
}

