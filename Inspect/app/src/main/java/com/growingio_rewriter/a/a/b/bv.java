/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.bA;
import com.growingio.a.a.b.bp;
import com.growingio.a.a.b.bu;
import java.util.regex.Matcher;

class bv
extends bA {
    final /* synthetic */ Matcher a;
    final /* synthetic */ bu b;

    bv(bu bu2, bp bp2, CharSequence charSequence, Matcher matcher) {
        this.b = bu2;
        this.a = matcher;
        super(bp2, charSequence);
    }

    @Override
    public int a(int n2) {
        return this.a.find(n2) ? this.a.start() : -1;
    }

    @Override
    public int b(int n2) {
        return this.a.end();
    }
}

