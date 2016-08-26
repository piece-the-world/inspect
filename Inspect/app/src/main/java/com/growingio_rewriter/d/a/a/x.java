/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.a;

class x
implements Comparable<x> {
    final String a;
    final int b;
    final String c;

    x(String string, int n2, String string2) {
        this.a = string;
        this.b = n2;
        this.c = string2;
    }

    public int a(x x2) {
        int n2 = this.a.compareTo(x2.a);
        if (n2 == 0) {
            n2 = this.c.compareTo(x2.c);
        }
        return n2;
    }

    public boolean equals(Object object) {
        if (object instanceof x) {
            return this.a((x)object) == 0;
        }
        return false;
    }

    public int hashCode() {
        return (this.a + this.c).hashCode();
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.a((x)object);
    }
}

