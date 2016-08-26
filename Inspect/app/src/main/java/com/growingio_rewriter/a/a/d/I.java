/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.J;
import com.growingio.a.a.d.L;
import com.growingio.a.a.d.S;
import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.bv;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.km;
import com.growingio.a.a.m.q;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class I<E>
extends S<E>
implements Serializable {
    private transient Map<E, bv> a;
    private transient long b;
    private static final long c = -2250766705698539974L;

    protected I(Map<E, bv> map) {
        this.a = aU.a(map);
        this.b = super.size();
    }

    void a(Map<E, bv> map) {
        this.a = map;
    }

    @Override
    public Set<km<E>> a() {
        return super.a();
    }

    @Override
    Iterator<km<E>> b() {
        Iterator<Map.Entry<E, bv>> iterator = this.a.entrySet().iterator();
        return new J(this, iterator);
    }

    @Override
    public void clear() {
        for (bv bv2 : this.a.values()) {
            bv2.c(0);
        }
        this.a.clear();
        this.b = 0;
    }

    @Override
    int c() {
        return this.a.size();
    }

    @Override
    public int size() {
        return q.b(this.b);
    }

    @Override
    public Iterator<E> iterator() {
        return new L(this);
    }

    @Override
    public int a(Object object) {
        bv bv2 = ii.a(this.a, object);
        return bv2 == null ? 0 : bv2.a();
    }

    @Override
    public int a(E e2, int n2) {
        int n3;
        if (n2 == 0) {
            return this.a(e2);
        }
        aU.a(n2 > 0, "occurrences cannot be negative: %s", n2);
        bv bv2 = this.a.get(e2);
        if (bv2 == null) {
            n3 = 0;
            this.a.put(e2, new bv(n2));
        } else {
            n3 = bv2.a();
            long l2 = (long)n3 + (long)n2;
            aU.a(l2 <= Integer.MAX_VALUE, "too many occurrences: %s", l2);
            bv2.a(n2);
        }
        this.b += (long)n2;
        return n3;
    }

    @Override
    public int b(Object object, int n2) {
        int n3;
        if (n2 == 0) {
            return this.a(object);
        }
        aU.a(n2 > 0, "occurrences cannot be negative: %s", n2);
        bv bv2 = this.a.get(object);
        if (bv2 == null) {
            return 0;
        }
        int n4 = bv2.a();
        if (n4 > n2) {
            n3 = n2;
        } else {
            n3 = n4;
            this.a.remove(object);
        }
        bv2.a(- n3);
        this.b -= (long)n3;
        return n4;
    }

    @Override
    public int c(E e2, int n2) {
        int n3;
        aK.a(n2, "count");
        if (n2 == 0) {
            bv bv2 = this.a.remove(e2);
            n3 = I.a(bv2, n2);
        } else {
            bv bv3 = this.a.get(e2);
            n3 = I.a(bv3, n2);
            if (bv3 == null) {
                this.a.put(e2, new bv(n2));
            }
        }
        this.b += (long)(n2 - n3);
        return n3;
    }

    private static int a(bv bv2, int n2) {
        if (bv2 == null) {
            return 0;
        }
        return bv2.d(n2);
    }

    private void g() throws ObjectStreamException {
        throw new InvalidObjectException("Stream data required");
    }

    static /* synthetic */ Map a(I i2) {
        return i2.a;
    }

    static /* synthetic */ long b(I i2) {
        return i2.b;
    }

    static /* synthetic */ long a(I i2, long l2) {
        i2.b = l2;
        return i2.b;
    }

    static /* synthetic */ long c(I i2) {
        return i2.b--;
    }
}

