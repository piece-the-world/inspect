/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.m;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.m.q;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

class r
extends AbstractList<Integer>
implements Serializable,
RandomAccess {
    final int[] a;
    final int b;
    final int c;
    private static final long d = 0;

    r(int[] arrn) {
        this(arrn, 0, arrn.length);
    }

    r(int[] arrn, int n2, int n3) {
        this.a = arrn;
        this.b = n2;
        this.c = n3;
    }

    @Override
    public int size() {
        return this.c - this.b;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public Integer a(int n2) {
        aU.a(n2, this.size());
        return this.a[this.b + n2];
    }

    @Override
    public boolean contains(Object object) {
        return object instanceof Integer && q.a(this.a, (int)((Integer)object), this.b, this.c) != -1;
    }

    @Override
    public int indexOf(Object object) {
        int n2;
        if (object instanceof Integer && (n2 = q.a(this.a, (int)((Integer)object), this.b, this.c)) >= 0) {
            return n2 - this.b;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        int n2;
        if (object instanceof Integer && (n2 = q.b(this.a, (int)((Integer)object), this.b, this.c)) >= 0) {
            return n2 - this.b;
        }
        return -1;
    }

    public Integer a(int n2, Integer n3) {
        aU.a(n2, this.size());
        int n4 = this.a[this.b + n2];
        this.a[this.b + n2] = aU.a(n3);
        return n4;
    }

    @Override
    public List<Integer> subList(int n2, int n3) {
        int n4 = this.size();
        aU.a(n2, n3, n4);
        if (n2 == n3) {
            return Collections.emptyList();
        }
        return new r(this.a, this.b + n2, this.b + n3);
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof r) {
            r r2 = (r)object;
            int n2 = this.size();
            if (r2.size() != n2) {
                return false;
            }
            for (int i2 = 0; i2 < n2; ++i2) {
                if (this.a[this.b + i2] == r2.a[r2.b + i2]) continue;
                return false;
            }
            return true;
        }
        return super.equals(object);
    }

    @Override
    public int hashCode() {
        int n2 = 1;
        for (int i2 = this.b; i2 < this.c; ++i2) {
            n2 = 31 * n2 + q.a(this.a[i2]);
        }
        return n2;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(this.size() * 5);
        stringBuilder.append('[').append(this.a[this.b]);
        for (int i2 = this.b + 1; i2 < this.c; ++i2) {
            stringBuilder.append(", ").append(this.a[i2]);
        }
        return stringBuilder.append(']').toString();
    }

    int[] a() {
        int n2 = this.size();
        int[] arrn = new int[n2];
        System.arraycopy(this.a, this.b, arrn, 0, n2);
        return arrn;
    }

    @Override
    public /* synthetic */ Object set(int n2, Object object) {
        return this.a(n2, (Integer)object);
    }

    @Override
    public /* synthetic */ Object get(int n2) {
        return this.a(n2);
    }
}

