/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.a;

import com.growingio.d.a.a.C;
import com.growingio.d.a.d.A;
import com.growingio.d.a.d.a;
import com.growingio.d.a.d.i;
import com.growingio.d.a.d.o;
import java.util.Comparator;

class D
implements Comparator<A> {
    final /* synthetic */ C a;

    D(C c2) {
        this.a = c2;
    }

    public int a(A a2, A a3) {
        int n2 = this.a(a2);
        int n3 = this.a(a3);
        return n2 - n3;
    }

    private int a(A a2) {
        int n2 = this.a.bm_.b(a2.a);
        int n3 = this.a.bm_.b(a2.b);
        return n3 - n2;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((A)object, (A)object2);
    }
}

