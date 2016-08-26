/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class t {
    private List a = new ArrayList();
    private Set b = new HashSet();
    private int c;

    public t(int n2, int n3) {
        this.c = n2;
        this.a.add(new Integer(n3));
    }

    public void a(int n2) {
        this.a.add(new Integer(n2));
    }

    public int a() {
        return this.c;
    }

    public void b(int n2) {
        this.b.add(new Integer(n2));
    }

    public boolean c(int n2) {
        return this.b.contains(new Integer(n2));
    }

    public Collection b() {
        return this.b;
    }

    public Collection c() {
        return this.a;
    }

    public String toString() {
        return "start = " + this.c + " callers = " + this.a.toString();
    }
}

