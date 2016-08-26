/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import java.io.Serializable;

final class bv
implements Serializable {
    private int a;

    bv(int n2) {
        this.a = n2;
    }

    public int a() {
        return this.a;
    }

    public void a(int n2) {
        this.a += n2;
    }

    public int b(int n2) {
        return this.a += n2;
    }

    public void c(int n2) {
        this.a = n2;
    }

    public int d(int n2) {
        int n3 = this.a;
        this.a = n2;
        return n3;
    }

    public int hashCode() {
        return this.a;
    }

    public boolean equals(Object object) {
        return object instanceof bv && ((bv)object).a == this.a;
    }

    public String toString() {
        return Integer.toString(this.a);
    }
}

