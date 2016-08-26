/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.bA;
import com.growingio.a.a.o.a.by;

class bB {
    static final String a = bB.class.getName() + "$ClassValueValidator";
    static final bA b = bB.a();

    bB() {
    }

    static bA a() {
        try {
            Class class_ = Class.forName(a);
            return (bA)class_.getEnumConstants()[0];
        }
        catch (Throwable var0_1) {
            return by.a();
        }
    }
}

