/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.m;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.m.a;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

class b
extends AbstractList<Boolean>
implements Serializable,
RandomAccess {
    final boolean[] a;
    final int b;
    final int c;
    private static final long d = 0;

    b(boolean[] arrbl) {
        this(arrbl, 0, arrbl.length);
    }

    b(boolean[] arrbl, int n2, int n3) {
        this.a = arrbl;
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

    public Boolean a(int n2) {
        aU.a(n2, this.size());
        return this.a[this.b + n2];
    }

    @Override
    public boolean contains(Object object) {
        return object instanceof Boolean && a.a(this.a, (boolean)((Boolean)object), this.b, this.c) != -1;
    }

    @Override
    public int indexOf(Object object) {
        int n2;
        if (object instanceof Boolean && (n2 = a.a(this.a, (boolean)((Boolean)object), this.b, this.c)) >= 0) {
            return n2 - this.b;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        int n2;
        if (object instanceof Boolean && (n2 = a.b(this.a, (boolean)((Boolean)object), this.b, this.c)) >= 0) {
            return n2 - this.b;
        }
        return -1;
    }

    public Boolean a(int n2, Boolean bl2) {
        aU.a(n2, this.size());
        boolean bl3 = this.a[this.b + n2];
        this.a[this.b + n2] = aU.a(bl2);
        return bl3;
    }

    @Override
    public List<Boolean> subList(int n2, int n3) {
        int n4 = this.size();
        aU.a(n2, n3, n4);
        if (n2 == n3) {
            return Collections.emptyList();
        }
        return new b(this.a, this.b + n2, this.b + n3);
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof b) {
            b b2 = (b)object;
            int n2 = this.size();
            if (b2.size() != n2) {
                return false;
            }
            for (int i2 = 0; i2 < n2; ++i2) {
                if (this.a[this.b + i2] == b2.a[b2.b + i2]) continue;
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
            n2 = 31 * n2 + a.a(this.a[i2]);
        }
        return n2;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(this.size() * 7);
        stringBuilder.append(this.a[this.b] ? "[true" : "[false");
        for (int i2 = this.b + 1; i2 < this.c; ++i2) {
            stringBuilder.append(this.a[i2] ? ", true" : ", false");
        }
        return stringBuilder.append(']').toString();
    }

    boolean[] a() {
        int n2 = this.size();
        boolean[] arrbl = new boolean[n2];
        System.arraycopy(this.a, this.b, arrbl, 0, n2);
        return arrbl;
    }

    @Override
    public /* synthetic */ Object set(int n2, Object object) {
        return this.a(n2, (Boolean)object);
    }

    @Override
    public /* synthetic */ Object get(int n2) {
        return this.a(n2);
    }
}

