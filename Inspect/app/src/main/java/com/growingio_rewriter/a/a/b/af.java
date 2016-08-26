/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.ab;
import java.io.Serializable;

final class af
extends ab<Object>
implements Serializable {
    static final af a = new af();
    private static final long b = 1;

    af() {
    }

    @Override
    protected boolean b(Object object, Object object2) {
        return false;
    }

    @Override
    protected int b(Object object) {
        return System.identityHashCode(object);
    }

    private Object d() {
        return a;
    }
}

