/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.ab;
import java.io.Serializable;

final class ad
extends ab<Object>
implements Serializable {
    static final ad a = new ad();
    private static final long b = 1;

    ad() {
    }

    @Override
    protected boolean b(Object object, Object object2) {
        return object.equals(object2);
    }

    @Override
    protected int b(Object object) {
        return object.hashCode();
    }

    private Object d() {
        return a;
    }
}

