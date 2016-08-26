/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.gq;
import com.growingio.a.a.d.kG;
import java.util.Iterator;

class gp<T>
extends kG<Iterator<? extends T>, T> {
    public gp(Iterator<? extends Iterator<? extends T>> iterator) {
        super(gp.c(iterator));
    }

    @Override
    Iterator<? extends T> a(Iterator<? extends T> iterator) {
        return iterator;
    }

    private static <T> Iterator<Iterator<? extends T>> c(Iterator<? extends Iterator<? extends T>> iterator) {
        return new gq(iterator);
    }

    static /* synthetic */ Iterator b(Iterator iterator) {
        return gp.c(iterator);
    }
}

