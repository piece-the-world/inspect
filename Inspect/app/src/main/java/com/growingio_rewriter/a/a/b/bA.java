/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.b;
import com.growingio.a.a.b.bp;
import com.growingio.a.a.b.m;

abstract class bA
extends b<String> {
    final CharSequence c;
    final m d;
    final boolean e;
    int f = 0;
    int g;

    abstract int a(int var1);

    abstract int b(int var1);

    protected bA(bp bp2, CharSequence charSequence) {
        this.d = bp.b(bp2);
        this.e = bp.c(bp2);
        this.g = bp.d(bp2);
        this.c = charSequence;
    }

    protected String c() {
        int n2 = this.f;
        while (this.f != -1) {
            int n3;
            int n4 = n2;
            int n5 = this.a(this.f);
            if (n5 == -1) {
                n3 = this.c.length();
                this.f = -1;
            } else {
                n3 = n5;
                this.f = this.b(n5);
            }
            if (this.f == n2) {
                ++this.f;
                if (this.f < this.c.length()) continue;
                this.f = -1;
                continue;
            }
            while (n4 < n3 && this.d.c(this.c.charAt(n4))) {
                ++n4;
            }
            while (n3 > n4 && this.d.c(this.c.charAt(n3 - 1))) {
                --n3;
            }
            if (this.e && n4 == n3) {
                n2 = this.f;
                continue;
            }
            if (this.g == 1) {
                this.f = -1;
                for (n3 = this.c.length(); n3 > n4 && this.d.c(this.c.charAt(n3 - 1)); --n3) {
                }
            } else {
                --this.g;
            }
            return this.c.subSequence(n4, n3).toString();
        }
        return (String)this.b();
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.c();
    }
}

