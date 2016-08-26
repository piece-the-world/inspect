/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.K;
import com.growingio.b.a.as;
import java.util.Comparator;

final class ai
implements Comparator {
    ai() {
    }

    public int compare(Object object, Object object2) {
        K k2 = (K)object;
        K k3 = (K)object2;
        int n2 = k2.q().compareTo(k3.q());
        if (n2 == 0) {
            n2 = k2.c().g().compareTo(k3.c().g());
        }
        return n2;
    }
}

