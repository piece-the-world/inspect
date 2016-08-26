/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import java.util.Comparator;
import java.util.Iterator;

interface mf<T>
extends Iterable<T> {
    public Comparator<? super T> comparator();

    @Override
    public Iterator<T> iterator();
}

