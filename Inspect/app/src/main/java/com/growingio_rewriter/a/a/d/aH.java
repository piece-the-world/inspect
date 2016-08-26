/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.aI;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.ec;
import com.growingio.a.a.k.f;
import java.util.AbstractList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

final class aH<E>
extends AbstractList<List<E>>
implements RandomAccess {
    private final transient ea<List<E>> a;
    private final transient int[] b;

    static <E> List<List<E>> a(List<? extends List<? extends E>> list) {
        ec<ea<E>> ec2 = new ec<ea<E>>(list.size());
        for (List<E> list2 : list) {
            ea<E> ea2 = ea.a(list2);
            if (ea2.isEmpty()) {
                return ea.d();
            }
            ec2.c(ea2);
        }
        return new aH<E>(ec2.b());
    }

    aH(ea<List<E>> ea2) {
        this.a = ea2;
        int[] arrn = new int[ea2.size() + 1];
        arrn[ea2.size()] = 1;
        try {
            for (int i2 = ea2.size() - 1; i2 >= 0; --i2) {
                arrn[i2] = f.g(arrn[i2 + 1], ea2.get(i2).size());
            }
        }
        catch (ArithmeticException var3_4) {
            throw new IllegalArgumentException("Cartesian product too large; must have size at most Integer.MAX_VALUE");
        }
        this.b = arrn;
    }

    private int a(int n2, int n3) {
        return n2 / this.b[n3 + 1] % this.a.get(n3).size();
    }

    public ea<E> a(int n2) {
        aU.a(n2, this.size());
        return new aI(this, n2);
    }

    @Override
    public int size() {
        return this.b[0];
    }

    @Override
    public boolean contains(Object object) {
        if (!(object instanceof List)) {
            return false;
        }
        List list = (List)object;
        if (list.size() != this.a.size()) {
            return false;
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            int n2 = listIterator.nextIndex();
            if (this.a.get(n2).contains(listIterator.next())) continue;
            return false;
        }
        return true;
    }

    @Override
    public /* synthetic */ Object get(int n2) {
        return this.a(n2);
    }

    static /* synthetic */ ea a(aH aH2) {
        return aH2.a;
    }

    static /* synthetic */ int a(aH aH2, int n2, int n3) {
        return aH2.a(n2, n3);
    }
}

