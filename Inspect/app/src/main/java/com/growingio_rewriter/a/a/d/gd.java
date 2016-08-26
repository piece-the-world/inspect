/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.i;

final class gd
extends i<T> {
    final /* synthetic */ Object[] a;
    final /* synthetic */ int b;

    gd(int n2, int n3, Object[] arrobject, int n4) {
        this.a = arrobject;
        this.b = n4;
        super(n2, n3);
    }

    @Override
    protected T a(int n2) {
        return (T)this.a[this.b + n2];
    }
}

