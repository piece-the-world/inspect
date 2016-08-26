/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.m;
import com.growingio.a.a.j.b;
import com.growingio.a.a.j.k;
import com.growingio.a.a.k.f;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.RoundingMode;

final class l
extends b {
    private final b a;
    private final String b;
    private final int c;
    private final m d;

    l(b b2, String string, int n2) {
        this.a = aU.a(b2);
        this.b = aU.a(string);
        this.c = n2;
        aU.a(n2 > 0, "Cannot add a separator after every %s chars", n2);
        this.d = m.a(string).p();
    }

    @Override
    m a() {
        return this.a.a();
    }

    @Override
    int a(int n2) {
        int n3 = this.a.a(n2);
        return n3 + this.b.length() * f.a(Math.max(0, n3 - 1), this.c, RoundingMode.FLOOR);
    }

    @Override
    public OutputStream a(Writer writer) {
        return this.a.a(l.a(writer, this.b, this.c));
    }

    @Override
    void a(Appendable appendable, byte[] arrby, int n2, int n3) throws IOException {
        this.a.a(l.a(appendable, this.b, this.c), arrby, n2, n3);
    }

    @Override
    int b(int n2) {
        return this.a.b(n2);
    }

    @Override
    public boolean a(CharSequence charSequence) {
        return this.a.a(this.d.i(charSequence));
    }

    @Override
    int a(byte[] arrby, CharSequence charSequence) throws k {
        return this.a.a(arrby, this.d.i(charSequence));
    }

    @Override
    public InputStream a(Reader reader) {
        return this.a.a(l.a(reader, this.d));
    }

    @Override
    public b b() {
        return this.a.b().a(this.b, this.c);
    }

    @Override
    public b a(char c2) {
        return this.a.a(c2).a(this.b, this.c);
    }

    @Override
    public b a(String string, int n2) {
        throw new UnsupportedOperationException("Already have a separator");
    }

    @Override
    public b c() {
        return this.a.c().a(this.b, this.c);
    }

    @Override
    public b d() {
        return this.a.d().a(this.b, this.c);
    }

    public String toString() {
        return this.a + ".withSeparator(\"" + this.b + "\", " + this.c + ")";
    }
}

