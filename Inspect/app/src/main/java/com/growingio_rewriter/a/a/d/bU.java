/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.bO;
import com.growingio.a.a.d.bS;
import com.growingio.a.a.d.bT;
import java.io.Serializable;

final class bU<C extends Comparable>
implements Serializable {
    private final bO<C> a;
    private static final long b = 0;

    private bU(bO<C> bO2) {
        this.a = bO2;
    }

    private Object a() {
        return new bS<C>(this.a);
    }

    /* synthetic */ bU(bO bO2, bT bT2) {
        this(bO2);
    }
}

