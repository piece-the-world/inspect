/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.j.I;
import com.growingio.a.a.j.J;
import com.growingio.a.a.j.c;
import com.growingio.a.a.j.d;
import com.growingio.a.a.j.e;
import com.growingio.a.a.j.f;
import com.growingio.a.a.j.g;
import com.growingio.a.a.j.i;
import com.growingio.a.a.j.j;
import com.growingio.a.a.j.k;
import com.growingio.a.a.j.m;
import com.growingio.a.a.j.s;
import com.growingio.a.a.j.v;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public abstract class b {
    private static final b a = new j("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", Character.valueOf('='));
    private static final b b = new j("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", Character.valueOf('='));
    private static final b c = new m("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", Character.valueOf('='));
    private static final b d = new m("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", Character.valueOf('='));
    private static final b e = new i("base16()", "0123456789ABCDEF");

    b() {
    }

    public String a(byte[] arrby) {
        return this.a(arrby, 0, arrby.length);
    }

    public final String a(byte[] arrby, int n2, int n3) {
        aU.a(n2, n2 + n3, arrby.length);
        StringBuilder stringBuilder = new StringBuilder(this.a(n3));
        try {
            this.a(stringBuilder, arrby, n2, n3);
        }
        catch (IOException var5_5) {
            throw new AssertionError(var5_5);
        }
        return stringBuilder.toString();
    }

    public abstract OutputStream a(Writer var1);

    public final s a(I i2) {
        aU.a(i2);
        return new c(this, i2);
    }

    private static byte[] a(byte[] arrby, int n2) {
        if (n2 == arrby.length) {
            return arrby;
        }
        byte[] arrby2 = new byte[n2];
        System.arraycopy(arrby, 0, arrby2, 0, n2);
        return arrby2;
    }

    public abstract boolean a(CharSequence var1);

    public final byte[] b(CharSequence charSequence) {
        try {
            return this.c(charSequence);
        }
        catch (k var2_2) {
            throw new IllegalArgumentException(var2_2);
        }
    }

    final byte[] c(CharSequence charSequence) throws k {
        charSequence = this.a().m(charSequence);
        byte[] arrby = new byte[this.b(charSequence.length())];
        int n2 = this.a(arrby, charSequence);
        return b.a(arrby, n2);
    }

    public abstract InputStream a(Reader var1);

    public final v a(J j2) {
        aU.a(j2);
        return new d(this, j2);
    }

    abstract int a(int var1);

    abstract void a(Appendable var1, byte[] var2, int var3, int var4) throws IOException;

    abstract int b(int var1);

    abstract int a(byte[] var1, CharSequence var2) throws k;

    abstract com.growingio.a.a.b.m a();

    public abstract b b();

    public abstract b a(char var1);

    public abstract b a(String var1, int var2);

    public abstract b c();

    public abstract b d();

    public static b e() {
        return a;
    }

    public static b f() {
        return b;
    }

    public static b g() {
        return c;
    }

    public static b h() {
        return d;
    }

    public static b i() {
        return e;
    }

    static Reader a(Reader reader, com.growingio.a.a.b.m m2) {
        aU.a(reader);
        aU.a(m2);
        return new e(reader, m2);
    }

    static Appendable a(Appendable appendable, String string, int n2) {
        aU.a(appendable);
        aU.a(string);
        aU.a(n2 > 0);
        return new f(n2, appendable, string);
    }

    static Writer a(Writer writer, String string, int n2) {
        Appendable appendable = b.a((Appendable)writer, string, n2);
        return new g(appendable, writer);
    }
}

