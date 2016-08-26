/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.h.H;
import com.growingio.a.a.h.L;
import com.growingio.a.a.h.M;
import com.growingio.a.a.h.f;
import com.growingio.a.a.h.x;
import java.nio.charset.Charset;

abstract class e
implements L {
    e() {
    }

    @Override
    public M a() {
        return new f(this, 32);
    }

    @Override
    public M a(int n2) {
        aU.a(n2 >= 0);
        return new f(this, n2);
    }

    @Override
    public <T> H a(T t2, x<? super T> x2) {
        return this.a().a(t2, x2).a();
    }

    @Override
    public H a(CharSequence charSequence) {
        int n2 = charSequence.length();
        M m2 = this.a(n2 * 2);
        for (int i2 = 0; i2 < n2; ++i2) {
            m2.a(charSequence.charAt(i2));
        }
        return m2.a();
    }

    @Override
    public H a(CharSequence charSequence, Charset charset) {
        return this.a(charSequence.toString().getBytes(charset));
    }

    @Override
    public H b(int n2) {
        return this.a(4).a(n2).a();
    }

    @Override
    public H a(long l2) {
        return this.a(8).a(l2).a();
    }

    @Override
    public H a(byte[] arrby) {
        return this.a(arrby, 0, arrby.length);
    }
}

