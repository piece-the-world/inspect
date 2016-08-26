/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.h.H;
import com.growingio.a.a.h.M;
import com.growingio.a.a.h.aC;
import com.growingio.a.a.h.b;
import com.growingio.a.a.h.x;
import java.nio.charset.Charset;

class c
implements M {
    final /* synthetic */ M[] a;
    final /* synthetic */ b b;

    c(b b2, M[] arrm) {
        this.b = b2;
        this.a = arrm;
    }

    @Override
    public M b(byte by2) {
        for (M m2 : this.a) {
            m2.b(by2);
        }
        return this;
    }

    @Override
    public M b(byte[] arrby) {
        for (M m2 : this.a) {
            m2.b(arrby);
        }
        return this;
    }

    @Override
    public M b(byte[] arrby, int n2, int n3) {
        for (M m2 : this.a) {
            m2.b(arrby, n2, n3);
        }
        return this;
    }

    @Override
    public M a(short s2) {
        for (M m2 : this.a) {
            m2.a(s2);
        }
        return this;
    }

    @Override
    public M a(int n2) {
        for (M m2 : this.a) {
            m2.a(n2);
        }
        return this;
    }

    @Override
    public M a(long l2) {
        for (M m2 : this.a) {
            m2.a(l2);
        }
        return this;
    }

    @Override
    public M a(float f2) {
        for (M m2 : this.a) {
            m2.a(f2);
        }
        return this;
    }

    @Override
    public M a(double d2) {
        for (M m2 : this.a) {
            m2.a(d2);
        }
        return this;
    }

    @Override
    public M a(boolean bl2) {
        for (M m2 : this.a) {
            m2.a(bl2);
        }
        return this;
    }

    @Override
    public M a(char c2) {
        for (M m2 : this.a) {
            m2.a(c2);
        }
        return this;
    }

    @Override
    public M a(CharSequence charSequence) {
        for (M m2 : this.a) {
            m2.a(charSequence);
        }
        return this;
    }

    @Override
    public M a(CharSequence charSequence, Charset charset) {
        for (M m2 : this.a) {
            m2.a(charSequence, charset);
        }
        return this;
    }

    @Override
    public <T> M a(T t2, x<? super T> x2) {
        for (M m2 : this.a) {
            m2.a(t2, x2);
        }
        return this;
    }

    @Override
    public H a() {
        return this.b.a(this.a);
    }

    @Override
    public /* synthetic */ aC b(CharSequence charSequence, Charset charset) {
        return this.a(charSequence, charset);
    }

    @Override
    public /* synthetic */ aC b(CharSequence charSequence) {
        return this.a(charSequence);
    }

    @Override
    public /* synthetic */ aC b(char c2) {
        return this.a(c2);
    }

    @Override
    public /* synthetic */ aC b(boolean bl2) {
        return this.a(bl2);
    }

    @Override
    public /* synthetic */ aC b(double d2) {
        return this.a(d2);
    }

    @Override
    public /* synthetic */ aC b(float f2) {
        return this.a(f2);
    }

    @Override
    public /* synthetic */ aC b(long l2) {
        return this.a(l2);
    }

    @Override
    public /* synthetic */ aC b(int n2) {
        return this.a(n2);
    }

    @Override
    public /* synthetic */ aC b(short s2) {
        return this.a(s2);
    }

    @Override
    public /* synthetic */ aC c(byte[] arrby, int n2, int n3) {
        return this.b(arrby, n2, n3);
    }

    @Override
    public /* synthetic */ aC c(byte[] arrby) {
        return this.b(arrby);
    }

    @Override
    public /* synthetic */ aC c(byte by2) {
        return this.b(by2);
    }
}

