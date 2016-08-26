/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.g;

import com.growingio.a.a.g.L;

public interface D<N, E>
extends L<N, E> {
    @Override
    public N i(Object var1);

    @Override
    public N j(Object var1);

    public /* varargs */ boolean a(E var1, N ... var2);

    public boolean a(E var1, Iterable<N> var2);
}

