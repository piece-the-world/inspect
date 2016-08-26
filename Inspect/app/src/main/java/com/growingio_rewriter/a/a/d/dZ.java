/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.dX;
import com.growingio.a.a.d.dY;
import java.io.Serializable;
import java.util.EnumSet;

class dZ<E extends Enum<E>>
implements Serializable {
    final EnumSet<E> a;
    private static final long b = 0;

    dZ(EnumSet<E> enumSet) {
        this.a = enumSet;
    }

    Object a() {
        return new dX((EnumSet)this.a.clone(), null);
    }
}

