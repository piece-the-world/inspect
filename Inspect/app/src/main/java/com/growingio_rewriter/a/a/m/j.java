/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.m;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.m.i;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

class j
extends AbstractList<Double>
implements Serializable,
RandomAccess {
    final double[] a;
    final int b;
    final int c;
    private static final long d = 0;

    j(double[] arrd) {
        this(arrd, 0, arrd.length);
    }

    j(double[] arrd, int n2, int n3) {
        this.a = arrd;
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

    public Double a(int n2) {
        aU.a(n2, this.size());
        return this.a[this.b + n2];
    }

    @Override
    public boolean contains(Object object) {
        return object instanceof Double && i.a(this.a, (double)((Double)object), this.b, this.c) != -1;
    }

    @Override
    public int indexOf(Object object) {
        int n2;
        if (object instanceof Double && (n2 = i.a(this.a, (double)((Double)object), this.b, this.c)) >= 0) {
            return n2 - this.b;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        int n2;
        if (object instanceof Double && (n2 = i.b(this.a, (double)((Double)object), this.b, this.c)) >= 0) {
            return n2 - this.b;
        }
        return -1;
    }

    public Double a(int n2, Double d2) {
        aU.a(n2, this.size());
        double d3 = this.a[this.b + n2];
        this.a[this.b + n2] = aU.a(d2);
        return d3;
    }

    @Override
    public List<Double> subList(int n2, int n3) {
        int n4 = this.size();
        aU.a(n2, n3, n4);
        if (n2 == n3) {
            return Collections.emptyList();
        }
        return new j(this.a, this.b + n2, this.b + n3);
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof j) {
            j j2 = (j)object;
            int n2 = this.size();
            if (j2.size() != n2) {
                return false;
            }
            for (int i2 = 0; i2 < n2; ++i2) {
                if (this.a[this.b + i2] == j2.a[j2.b + i2]) continue;
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
            n2 = 31 * n2 + i.a(this.a[i2]);
        }
        return n2;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(this.size() * 12);
        stringBuilder.append('[').append(this.a[this.b]);
        for (int i2 = this.b + 1; i2 < this.c; ++i2) {
            stringBuilder.append(", ").append(this.a[i2]);
        }
        return stringBuilder.append(']').toString();
    }

    double[] a() {
        int n2 = this.size();
        double[] arrd = new double[n2];
        System.arraycopy(this.a, this.b, arrd, 0, n2);
        return arrd;
    }

    @Override
    public /* synthetic */ Object set(int n2, Object object) {
        return this.a(n2, (Double)object);
    }

    @Override
    public /* synthetic */ Object get(int n2) {
        return this.a(n2);
    }
}

