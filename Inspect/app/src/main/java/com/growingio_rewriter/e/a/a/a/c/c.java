/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.c;

import com.growingio.e.a.a.a.a;
import java.util.Comparator;

final class c
implements Comparator<a> {
    c() {
    }

    public int a(a a2, a a3) {
        int n2;
        int n3 = a2.b();
        if (n3 > (n2 = a3.b())) {
            return -1;
        }
        if (n2 > n3) {
            return 1;
        }
        return 0;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((a)object, (a)object2);
    }
}

