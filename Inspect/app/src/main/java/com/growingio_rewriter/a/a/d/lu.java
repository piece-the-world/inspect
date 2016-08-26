/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.dH;
import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.kN;
import com.growingio.a.a.d.lh;
import com.growingio.a.a.d.oP;
import java.util.Iterator;

final class lu<E>
extends fg<E> {
    static final lu<Object> a = new lu<E>(kN.a, 0, null, 0);
    private final transient Object[] d;
    final transient Object[] c;
    private final transient int e;
    private final transient int f;

    lu(Object[] arrobject, int n2, Object[] arrobject2, int n3) {
        this.d = arrobject;
        this.c = arrobject2;
        this.e = n3;
        this.f = n2;
    }

    @Override
    public boolean contains(Object object) {
        Object[] arrobject = this.c;
        if (object == null || arrobject == null) {
            return false;
        }
        int n2 = dH.a(object);
        Object object2;
        while ((object2 = arrobject[n2 &= this.e]) != null) {
            if (object2.equals(object)) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    @Override
    public int size() {
        return this.d.length;
    }

    @Override
    public oP<E> k_() {
        return gb.b(this.d);
    }

    @Override
    int a(Object[] arrobject, int n2) {
        System.arraycopy(this.d, 0, arrobject, n2, this.d.length);
        return n2 + this.d.length;
    }

    @Override
    ea<E> m() {
        return this.c == null ? ea.d() : new lh(this, this.d);
    }

    @Override
    boolean i_() {
        return false;
    }

    @Override
    public int hashCode() {
        return this.f;
    }

    @Override
    boolean i() {
        return true;
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.k_();
    }
}

