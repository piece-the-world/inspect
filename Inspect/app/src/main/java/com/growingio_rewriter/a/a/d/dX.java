/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.dY;
import com.growingio.a.a.d.dZ;
import com.growingio.a.a.d.fL;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.oP;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

final class dX<E extends Enum<E>>
extends fg<E> {
    private final transient EnumSet<E> a;
    private transient int c;

    static fg a(EnumSet enumSet) {
        switch (enumSet.size()) {
            case 0: {
                return dX.k();
            }
            case 1: {
                return dX.d(fL.d(enumSet));
            }
        }
        return new dX<E>(enumSet);
    }

    private dX(EnumSet<E> enumSet) {
        this.a = enumSet;
    }

    @Override
    boolean i_() {
        return false;
    }

    @Override
    public oP<E> k_() {
        return gb.a(this.a.iterator());
    }

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    public boolean contains(Object object) {
        return this.a.contains(object);
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof dX) {
            collection = ((dX)collection).a;
        }
        return this.a.containsAll(collection);
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public boolean equals(Object enumSet) {
        if (enumSet == this) {
            return true;
        }
        if (enumSet instanceof dX) {
            enumSet = ((dX)enumSet).a;
        }
        return this.a.equals(enumSet);
    }

    @Override
    boolean i() {
        return true;
    }

    @Override
    public int hashCode() {
        int n2 = this.c;
        int n3 = n2 == 0 ? (this.c = this.a.hashCode()) : n2;
        return n3;
    }

    @Override
    public String toString() {
        return this.a.toString();
    }

    @Override
    Object j_() {
        return new dZ<E>(this.a);
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.k_();
    }

    /* synthetic */ dX(EnumSet enumSet, dY dY2) {
        this(enumSet);
    }
}

