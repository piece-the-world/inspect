/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.h.H;
import com.growingio.a.a.h.L;
import com.growingio.a.a.h.M;
import com.growingio.a.a.h.x;
import java.nio.charset.Charset;

abstract class h
implements L {
    h() {
    }

    @Override
    public <T> H a(T t2, x<? super T> x2) {
        return this.a().a(t2, x2).a();
    }

    @Override
    public H a(CharSequence charSequence) {
        return this.a().a(charSequence).a();
    }

    @Override
    public H a(CharSequence charSequence, Charset charset) {
        return this.a().a(charSequence, charset).a();
    }

    @Override
    public H b(int n2) {
        return this.a().a(n2).a();
    }

    @Override
    public H a(long l2) {
        return this.a().a(l2).a();
    }

    @Override
    public H a(byte[] arrby) {
        return this.a().b(arrby).a();
    }

    @Override
    public H a(byte[] arrby, int n2, int n3) {
        return this.a().b(arrby, n2, n3).a();
    }

    @Override
    public M a(int n2) {
        aU.a(n2 >= 0);
        return this.a();
    }
}

