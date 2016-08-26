/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.bP;
import java.util.AbstractList;

final class bQ
extends AbstractList<StackTraceElement> {
    final /* synthetic */ Throwable a;

    bQ(Throwable throwable) {
        this.a = throwable;
    }

    public StackTraceElement a(int n2) {
        return (StackTraceElement)bP.a(bP.b(), bP.c(), new Object[]{this.a, n2});
    }

    @Override
    public int size() {
        return (Integer)bP.a(bP.d(), bP.c(), new Object[]{this.a});
    }

    @Override
    public /* synthetic */ Object get(int n2) {
        return this.a(n2);
    }
}

