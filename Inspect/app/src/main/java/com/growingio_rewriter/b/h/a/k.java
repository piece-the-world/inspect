/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.h.a;

import java.lang.ref.WeakReference;

class k {
    byte[] a;
    WeakReference b;
    boolean c;

    k(byte[] arrby, Class class_, boolean bl2) {
        this.a = arrby;
        this.b = new WeakReference<Class>(class_);
        this.c = bl2;
    }
}

