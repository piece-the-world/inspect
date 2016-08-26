/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;

final class aK {
    aK() {
    }

    static void a(Object object, Object object2) {
        if (object == null) {
            throw new NullPointerException("null key in entry: null=" + object2);
        }
        if (object2 == null) {
            throw new NullPointerException("null value in entry: " + object + "=null");
        }
    }

    static int a(int n2, String string) {
        if (n2 < 0) {
            throw new IllegalArgumentException(string + " cannot be negative but was: " + n2);
        }
        return n2;
    }

    static void b(int n2, String string) {
        if (n2 <= 0) {
            throw new IllegalArgumentException(string + " must be positive but was: " + n2);
        }
    }

    static void a(boolean bl2) {
        aU.b(bl2, "no calls to next() since the last call to remove()");
    }
}

