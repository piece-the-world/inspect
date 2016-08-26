/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import java.io.IOException;

final class f
implements Appendable {
    int a;
    final /* synthetic */ int b;
    final /* synthetic */ Appendable c;
    final /* synthetic */ String d;

    f(int n2, Appendable appendable, String string) {
        this.b = n2;
        this.c = appendable;
        this.d = string;
        this.a = this.b;
    }

    @Override
    public Appendable append(char c2) throws IOException {
        if (this.a == 0) {
            this.c.append(this.d);
            this.a = this.b;
        }
        this.c.append(c2);
        --this.a;
        return this;
    }

    @Override
    public Appendable append(CharSequence charSequence, int n2, int n3) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override
    public Appendable append(CharSequence charSequence) throws IOException {
        throw new UnsupportedOperationException();
    }
}

