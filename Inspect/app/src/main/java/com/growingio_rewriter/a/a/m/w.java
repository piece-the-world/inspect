/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.m;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.m.u;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

class w
extends AbstractList<Long>
implements Serializable,
RandomAccess {
    final long[] a;
    final int b;
    final int c;
    private static final long d = 0;

    w(long[] arrl) {
        this(arrl, 0, arrl.length);
    }

    w(long[] arrl, int n2, int n3) {
        this.a = arrl;
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

    public Long a(int n2) {
        aU.a(n2, this.size());
        return this.a[this.b + n2];
    }

    @Override
    public boolean contains(Object object) {
        return object instanceof Long && u.a(this.a, (long)((Long)object), this.b, this.c) != -1;
    }

    @Override
    public int indexOf(Object object) {
        int n2;
        if (object instanceof Long && (n2 = u.a(this.a, (long)((Long)object), this.b, this.c)) >= 0) {
            return n2 - this.b;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        int n2;
        if (object instanceof Long && (n2 = u.b(this.a, (long)((Long)object), this.b, this.c)) >= 0) {
            return n2 - this.b;
        }
        return -1;
    }

    public Long a(int n2, Long l2) {
        aU.a(n2, this.size());
        long l3 = this.a[this.b + n2];
        this.a[this.b + n2] = aU.a(l2);
        return l3;
    }

    @Override
    public List<Long> subList(int n2, int n3) {
        int n4 = this.size();
        aU.a(n2, n3, n4);
        if (n2 == n3) {
            return Collections.emptyList();
        }
        return new w(this.a, this.b + n2, this.b + n3);
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof w) {
            w w2 = (w)object;
            int n2 = this.size();
            if (w2.size() != n2) {
                return false;
            }
            for (int i2 = 0; i2 < n2; ++i2) {
                if (this.a[this.b + i2] == w2.a[w2.b + i2]) continue;
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
            n2 = 31 * n2 + u.a(this.a[i2]);
        }
        return n2;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(this.size() * 10);
        stringBuilder.append('[').append(this.a[this.b]);
        for (int i2 = this.b + 1; i2 < this.c; ++i2) {
            stringBuilder.append(", ").append(this.a[i2]);
        }
        return stringBuilder.append(']').toString();
    }

    long[] a() {
        int n2 = this.size();
        long[] arrl = new long[n2];
        System.arraycopy(this.a, this.b, arrl, 0, n2);
        return arrl;
    }

    @Override
    public /* synthetic */ Object set(int n2, Object object) {
        return this.a(n2, (Long)object);
    }

    @Override
    public /* synthetic */ Object get(int n2) {
        return this.a(n2);
    }
}

