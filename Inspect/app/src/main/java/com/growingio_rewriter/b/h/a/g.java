/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.h.a;

import com.growingio.b.h.a.l;

final class g
implements l {
    private final String a;
    private int b;

    g() {
        this.a = "_$$_jvst" + Integer.toHexString(this.hashCode() & 4095) + "_";
        this.b = 0;
    }

    @Override
    public String a(String string) {
        return string + this.a + Integer.toHexString(this.b++);
    }
}

