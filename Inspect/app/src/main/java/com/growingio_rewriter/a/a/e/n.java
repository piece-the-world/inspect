/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.e;

import com.growingio.a.a.e.o;

final class n {
    private static final ThreadLocal<char[]> a = new o();

    private n() {
    }

    static char[] a() {
        return a.get();
    }
}

