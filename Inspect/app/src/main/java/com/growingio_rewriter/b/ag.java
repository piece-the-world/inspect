/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.t;
import java.util.Comparator;

final class ag
implements Comparator {
    ag() {
    }

    public int compare(Object object, Object object2) {
        t t2 = (t)object;
        t t3 = (t)object2;
        return t2.q().compareTo(t3.q());
    }
}

