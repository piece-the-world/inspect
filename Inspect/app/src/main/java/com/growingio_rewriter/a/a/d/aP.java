/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.gO;
import com.growingio.a.a.d.j;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

final class aP<E>
extends j<List<E>> {
    List<E> a;
    final Comparator<? super E> b;

    aP(List<E> list, Comparator<? super E> comparator) {
        this.a = gO.a(list);
        this.b = comparator;
    }

    protected List<E> d() {
        if (this.a == null) {
            return (List)this.b();
        }
        ea<E> ea2 = ea.a(this.a);
        this.e();
        return ea2;
    }

    void e() {
        int n2 = this.f();
        if (n2 == -1) {
            this.a = null;
            return;
        }
        int n3 = this.a(n2);
        Collections.swap(this.a, n2, n3);
        int n4 = this.a.size();
        Collections.reverse(this.a.subList(n2 + 1, n4));
    }

    int f() {
        for (int i2 = this.a.size() - 2; i2 >= 0; --i2) {
            if (this.b.compare(this.a.get(i2), this.a.get(i2 + 1)) >= 0) continue;
            return i2;
        }
        return -1;
    }

    int a(int n2) {
        E e2 = this.a.get(n2);
        for (int i2 = this.a.size() - 1; i2 > n2; --i2) {
            if (this.b.compare(e2, this.a.get(i2)) >= 0) continue;
            return i2;
        }
        throw new AssertionError((Object)"this statement should be unreachable");
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.d();
    }
}

