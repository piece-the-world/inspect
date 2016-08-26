/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.h.F;
import com.growingio.a.a.h.aC;
import com.growingio.a.a.h.x;
import java.io.Serializable;
import java.nio.charset.Charset;

class E
implements x<CharSequence>,
Serializable {
    private final Charset a;

    E(Charset charset) {
        this.a = aU.a(charset);
    }

    @Override
    public void a(CharSequence charSequence, aC aC2) {
        aC2.b(charSequence, this.a);
    }

    public String toString() {
        return "Funnels.stringFunnel(" + this.a.name() + ")";
    }

    public boolean equals(Object object) {
        if (object instanceof E) {
            E e2 = (E)object;
            return this.a.equals(e2.a);
        }
        return false;
    }

    public int hashCode() {
        return E.class.hashCode() ^ this.a.hashCode();
    }

    Object a() {
        return new F(this.a);
    }
}

