/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.l;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.m;

final class j {
    final String a;
    int b = 0;

    j(String string) {
        this.a = string;
    }

    String a(m m2) {
        aU.b(this.b());
        int n2 = this.b;
        this.b = m2.o().a((CharSequence)this.a, n2);
        return this.b() ? this.a.substring(n2, this.b) : this.a.substring(n2);
    }

    String b(m m2) {
        int n2 = this.b;
        String string = this.a(m2);
        aU.b(this.b != n2);
        return string;
    }

    char c(m m2) {
        aU.b(this.b());
        char c2 = this.a();
        aU.b(m2.c(c2));
        ++this.b;
        return c2;
    }

    char a(char c2) {
        aU.b(this.b());
        aU.b(this.a() == c2);
        ++this.b;
        return c2;
    }

    char a() {
        aU.b(this.b());
        return this.a.charAt(this.b);
    }

    boolean b() {
        return this.b >= 0 && this.b < this.a.length();
    }
}

