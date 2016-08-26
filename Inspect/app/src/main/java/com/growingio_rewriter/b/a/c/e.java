/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.c;

import com.growingio.b.a.c.a;
import com.growingio.b.a.c.b;

class e
implements Comparable {
    int a;
    a b;
    a[] c;
    boolean d;
    int e;
    b f;

    e(int n2) {
        this.a = n2;
        this.b = null;
        this.c = null;
        this.d = false;
        this.e = 0;
        this.f = null;
    }

    public int compareTo(Object object) {
        if (object instanceof e) {
            int n2 = ((e)object).a;
            return this.a - n2;
        }
        return -1;
    }

    void a(a[] arra, int n2, boolean bl2) {
        this.c = arra;
        this.e = n2;
        this.d = bl2;
    }
}

