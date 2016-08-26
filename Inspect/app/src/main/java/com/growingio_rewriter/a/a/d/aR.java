/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class aR<E>
extends j<List<E>> {
    final List<E> a;
    final int[] b;
    final int[] c;
    int d;

    aR(List<E> list) {
        this.a = new ArrayList<E>(list);
        int n2 = list.size();
        this.b = new int[n2];
        this.c = new int[n2];
        Arrays.fill(this.b, 0);
        Arrays.fill(this.c, 1);
        this.d = Integer.MAX_VALUE;
    }

    protected List<E> d() {
        if (this.d <= 0) {
            return (List)this.b();
        }
        ea<E> ea2 = ea.a(this.a);
        this.e();
        return ea2;
    }

    void e() {
        block4 : {
            int n2;
            this.d = this.a.size() - 1;
            int n3 = 0;
            if (this.d == -1) {
                return;
            }
            do {
                if ((n2 = this.b[this.d] + this.c[this.d]) < 0) {
                    this.f();
                    continue;
                }
                if (n2 != this.d + 1) break;
                if (this.d != 0) {
                    ++n3;
                    this.f();
                    continue;
                }
                break block4;
                break;
            } while (true);
            Collections.swap(this.a, this.d - this.b[this.d] + n3, this.d - n2 + n3);
            this.b[this.d] = n2;
        }
    }

    void f() {
        this.c[this.d] = - this.c[this.d];
        --this.d;
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.d();
    }
}

