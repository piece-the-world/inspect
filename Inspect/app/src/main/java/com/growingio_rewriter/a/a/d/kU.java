/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.hE;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Deque;

final class kU {
    static <T> T[] a(T[] arrT, int n2) {
        Class class_ = arrT.getClass().getComponentType();
        Object[] arrobject = (Object[])Array.newInstance(class_, n2);
        return arrobject;
    }

    static hE a(hE hE2) {
        return hE2.d();
    }

    static <E> Deque<E> a(int n2) {
        return new ArrayDeque(n2);
    }

    private kU() {
    }
}

