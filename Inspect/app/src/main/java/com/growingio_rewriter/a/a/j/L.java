/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aP;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.bp;
import com.growingio.a.a.b.e;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.j.H;
import com.growingio.a.a.j.J;
import com.growingio.a.a.j.M;
import com.growingio.a.a.j.ao;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

class L
extends J {
    private static final bp a = bp.b("\r\n|\n|\r");
    private final CharSequence b;

    protected L(CharSequence charSequence) {
        this.b = aU.a(charSequence);
    }

    @Override
    public Reader a() {
        return new H(this.b);
    }

    @Override
    public String e() {
        return this.b.toString();
    }

    @Override
    public boolean h() {
        return this.b.length() == 0;
    }

    @Override
    public long d() {
        return this.b.length();
    }

    @Override
    public aP<Long> c() {
        return aP.b(Long.valueOf(this.b.length()));
    }

    private Iterable<String> k() {
        return new M(this);
    }

    @Override
    public String f() {
        Iterator<String> iterator = this.k().iterator();
        return iterator.hasNext() ? iterator.next() : null;
    }

    @Override
    public ea<String> g() {
        return ea.a(this.k());
    }

    @Override
    public <T> T a(ao<T> ao2) throws IOException {
        for (String string : this.k()) {
            if (!ao2.a(string)) break;
        }
        return ao2.b();
    }

    public String toString() {
        return "CharSource.wrap(" + e.a(this.b, 30, "...") + ")";
    }

    static /* synthetic */ CharSequence a(L l2) {
        return l2.b;
    }

    static /* synthetic */ bp j() {
        return a;
    }
}

