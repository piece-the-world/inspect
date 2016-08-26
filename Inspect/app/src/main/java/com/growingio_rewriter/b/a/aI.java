/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.aF;
import com.growingio.b.a.aL;

public class aI
extends aF {
    aF d;

    aI(String string, int n2, int n3, aL[] arraL, aF aF2) {
        super(string, n2, n3, arraL);
        this.d = aF2;
    }

    public aI(aF aF2, String string, aL[] arraL) {
        super(string, arraL);
        this.d = aF2;
    }

    @Override
    public aF c() {
        return this.d;
    }
}

