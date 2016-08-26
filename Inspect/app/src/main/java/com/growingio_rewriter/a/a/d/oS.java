/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.kO;
import java.io.Serializable;

final class oS
extends kO<Object>
implements Serializable {
    static final oS a = new oS();
    private static final long b = 0;

    @Override
    public int compare(Object object, Object object2) {
        return object.toString().compareTo(object2.toString());
    }

    private Object j() {
        return a;
    }

    public String toString() {
        return "Ordering.usingToString()";
    }

    private oS() {
    }
}

