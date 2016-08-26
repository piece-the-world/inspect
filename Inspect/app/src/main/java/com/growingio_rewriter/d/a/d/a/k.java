/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.d.a;

import com.growingio.d.a.d.a;
import com.growingio.d.a.d.a.i;
import com.growingio.d.a.d.a.m;
import java.util.Set;

public class k
implements m {
    public final int a;
    public final Set<a> b;

    public k(int n2) {
        this(n2, i.a());
    }

    public k(int n2, a a2) {
        this.a = n2;
        this.b = new i<Object>(a2, null);
    }

    public k(int n2, Set<a> set) {
        this.a = n2;
        this.b = set;
    }

    @Override
    public int b() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (!(object instanceof k)) {
            return false;
        }
        k k2 = (k)object;
        return this.a == k2.a && this.b.equals(k2.b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }
}

