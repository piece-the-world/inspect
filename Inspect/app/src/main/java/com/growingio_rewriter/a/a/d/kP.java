/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.hE;
import com.growingio.a.a.d.kO;
import com.growingio.a.a.d.kQ;
import com.growingio.a.a.d.kU;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

class kP
extends kO<Object> {
    private final Map<Object, Integer> a;

    kP() {
        this.a = kU.a(new hE()).a(new kQ(this));
    }

    @Override
    public int compare(Object object, Object object2) {
        int n2;
        if (object == object2) {
            return 0;
        }
        if (object == null) {
            return -1;
        }
        if (object2 == null) {
            return 1;
        }
        int n3 = this.a(object);
        if (n3 != (n2 = this.a(object2))) {
            return n3 < n2 ? -1 : 1;
        }
        int n4 = this.a.get(object).compareTo(this.a.get(object2));
        if (n4 == 0) {
            throw new AssertionError();
        }
        return n4;
    }

    public String toString() {
        return "Ordering.arbitrary()";
    }

    int a(Object object) {
        return System.identityHashCode(object);
    }
}

