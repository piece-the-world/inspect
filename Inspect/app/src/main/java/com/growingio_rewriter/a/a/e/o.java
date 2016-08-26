/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.e;

final class o
extends ThreadLocal<char[]> {
    o() {
    }

    protected char[] a() {
        return new char[1024];
    }

    @Override
    protected /* synthetic */ Object initialValue() {
        return this.a();
    }
}

