/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.aL;
import com.growingio.a.a.o.a.aM;
import com.growingio.a.a.o.a.aU;
import com.growingio.a.a.o.a.aZ;
import java.util.logging.Level;

final class aW
extends aU {
    aW(String string2, int n3) {
        super(string, n2, null);
    }

    @Override
    public void a(aZ aZ2) {
        aL.a().log(Level.SEVERE, "Detected potential deadlock", aZ2);
    }
}

