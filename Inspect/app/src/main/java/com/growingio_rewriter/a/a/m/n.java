/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.m;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.m.m;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

class n
extends AbstractList<Float>
implements Serializable,
RandomAccess {
    final float[] a;
    final int b;
    final int c;
    private static final long d = 0;

    n(float[] arrf) {
        this(arrf, 0, arrf.length);
    }

    n(float[] arrf, int n2, int n3) {
        this.a = arrf;
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

    public Float a(int n2) {
        aU.a(n2, this.size());
        return Float.valueOf(this.a[this.b + n2]);
    }

    @Override
    public boolean contains(Object object) {
        return object instanceof Float && m.a(this.a, ((Float)object).floatValue(), this.b, this.c) != -1;
    }

    @Override
    public int indexOf(Object object) {
        int n2;
        if (object instanceof Float && (n2 = m.a(this.a, ((Float)object).floatValue(), this.b, this.c)) >= 0) {
            return n2 - this.b;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        int n2;
        if (object instanceof Float && (n2 = m.b(this.a, ((Float)object).floatValue(), this.b, this.c)) >= 0) {
            return n2 - this.b;
        }
        return -1;
    }

    public Float a(int n2, Float f2) {
        aU.a(n2, this.size());
        float f3 = this.a[this.b + n2];
        this.a[this.b + n2] = aU.a(f2).floatValue();
        return Float.valueOf(f3);
    }

    @Override
    public List<Float> subList(int n2, int n3) {
        int n4 = this.size();
        aU.a(n2, n3, n4);
        if (n2 == n3) {
            return Collections.emptyList();
        }
        return new n(this.a, this.b + n2, this.b + n3);
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof n) {
            n n2 = (n)object;
            int n3 = this.size();
            if (n2.size() != n3) {
                return false;
            }
            for (int i2 = 0; i2 < n3; ++i2) {
                if (this.a[this.b + i2] == n2.a[n2.b + i2]) continue;
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
            n2 = 31 * n2 + m.a(this.a[i2]);
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

    float[] a() {
        int n2 = this.size();
        float[] arrf = new float[n2];
        System.arraycopy(this.a, this.b, arrf, 0, n2);
        return arrf;
    }

    @Override
    public /* synthetic */ Object set(int n2, Object object) {
        return this.a(n2, (Float)object);
    }

    @Override
    public /* synthetic */ Object get(int n2) {
        return this.a(n2);
    }
}

