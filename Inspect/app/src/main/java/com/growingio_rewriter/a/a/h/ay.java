/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.h.M;
import com.growingio.a.a.h.az;
import com.growingio.a.a.h.h;
import java.io.Serializable;

final class ay
extends h
implements Serializable {
    private final int a;
    private static final long b = 0;

    ay(int n2) {
        this.a = n2;
    }

    @Override
    public int b() {
        return 128;
    }

    @Override
    public M a() {
        return new az(this.a);
    }

    public String toString() {
        return "Hashing.murmur3_128(" + this.a + ")";
    }

    public boolean equals(Object object) {
        if (object instanceof ay) {
            ay ay2 = (ay)object;
            return this.a == ay2.a;
        }
        return false;
    }

    public int hashCode() {
        return this.getClass().hashCode() ^ this.a;
    }
}

