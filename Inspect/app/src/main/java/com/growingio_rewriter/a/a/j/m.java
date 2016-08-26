/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aL;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.j.b;
import com.growingio.a.a.j.h;
import com.growingio.a.a.j.k;
import com.growingio.a.a.j.l;
import com.growingio.a.a.j.n;
import com.growingio.a.a.j.o;
import com.growingio.a.a.k.f;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.RoundingMode;

class m
extends b {
    final h b;
    final Character c;
    private transient b a;
    private transient b d;

    m(String string, String string2, Character c2) {
        this(new h(string, string2.toCharArray()), c2);
    }

    m(h h2, Character c2) {
        this.b = aU.a(h2);
        aU.a(c2 == null || !h2.c(c2.charValue()), "Padding character %s was already in alphabet", (Object)c2);
        this.c = c2;
    }

    @Override
    com.growingio.a.a.b.m a() {
        return this.c == null ? com.growingio.a.a.b.m.b() : com.growingio.a.a.b.m.a(this.c.charValue());
    }

    @Override
    int a(int n2) {
        return this.b.q * f.a(n2, this.b.r, RoundingMode.CEILING);
    }

    @Override
    public OutputStream a(Writer writer) {
        aU.a(writer);
        return new n(this, writer);
    }

    @Override
    void a(Appendable appendable, byte[] arrby, int n2, int n3) throws IOException {
        aU.a(appendable);
        aU.a(n2, n2 + n3, arrby.length);
        for (int i2 = 0; i2 < n3; i2 += this.b.r) {
            this.b(appendable, arrby, n2 + i2, Math.min(this.b.r, n3 - i2));
        }
    }

    void b(Appendable appendable, byte[] arrby, int n2, int n3) throws IOException {
        int n4;
        int n5;
        aU.a(appendable);
        aU.a(n2, n2 + n3, arrby.length);
        aU.a(n3 <= this.b.r);
        long l2 = 0;
        for (n5 = 0; n5 < n3; ++n5) {
            l2 |= (long)(arrby[n2 + n5] & 255);
            l2 <<= 8;
        }
        n5 = (n3 + 1) * 8 - this.b.p;
        for (n4 = 0; n4 < n3 * 8; n4 += this.b.p) {
            int n6 = (int)(l2 >>> n5 - n4) & this.b.o;
            appendable.append(this.b.a(n6));
        }
        if (this.c != null) {
            while (n4 < this.b.r * 8) {
                appendable.append(this.c.charValue());
                n4 += this.b.p;
            }
        }
    }

    @Override
    int b(int n2) {
        return (int)(((long)this.b.p * (long)n2 + 7) / 8);
    }

    @Override
    public boolean a(CharSequence charSequence) {
        charSequence = this.a().m(charSequence);
        if (!this.b.b(charSequence.length())) {
            return false;
        }
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            if (this.b.e(charSequence.charAt(i2))) continue;
            return false;
        }
        return true;
    }

    @Override
    int a(byte[] arrby, CharSequence charSequence) throws k {
        aU.a(arrby);
        charSequence = this.a().m(charSequence);
        if (!this.b.b(charSequence.length())) {
            throw new k("Invalid input length " + charSequence.length());
        }
        int n2 = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2 += this.b.q) {
            int n3;
            long l2 = 0;
            int n4 = 0;
            for (n3 = 0; n3 < this.b.q; ++n3) {
                l2 <<= this.b.p;
                if (i2 + n3 >= charSequence.length()) continue;
                l2 |= (long)this.b.f(charSequence.charAt(i2 + n4++));
            }
            n3 = this.b.r * 8 - n4 * this.b.p;
            for (int i3 = (this.b.r - 1) * 8; i3 >= n3; i3 -= 8) {
                arrby[n2++] = (byte)(l2 >>> i3 & 255);
            }
        }
        return n2;
    }

    @Override
    public InputStream a(Reader reader) {
        aU.a(reader);
        return new o(this, reader);
    }

    @Override
    public b b() {
        return this.c == null ? this : this.a(this.b, null);
    }

    @Override
    public b a(char c2) {
        if (8 % this.b.p == 0 || this.c != null && this.c.charValue() == c2) {
            return this;
        }
        return this.a(this.b, Character.valueOf(c2));
    }

    @Override
    public b a(String string, int n2) {
        aU.a(this.a().b(this.b).e(string), "Separator (%s) cannot contain alphabet or padding characters", (Object)string);
        return new l(this, string, n2);
    }

    @Override
    public b c() {
        b b2 = this.a;
        if (b2 == null) {
            h h2 = this.b.r();
            this.a = h2 == this.b ? this : this.a(h2, this.c);
            b2 = this.a;
        }
        return b2;
    }

    @Override
    public b d() {
        b b2 = this.d;
        if (b2 == null) {
            h h2 = this.b.s();
            this.d = h2 == this.b ? this : this.a(h2, this.c);
            b2 = this.d;
        }
        return b2;
    }

    b a(h h2, Character c2) {
        return new m(h2, c2);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("BaseEncoding.");
        stringBuilder.append(this.b.toString());
        if (8 % this.b.p != 0) {
            if (this.c == null) {
                stringBuilder.append(".omitPadding()");
            } else {
                stringBuilder.append(".withPadChar('").append(this.c).append("')");
            }
        }
        return stringBuilder.toString();
    }

    public boolean equals(Object object) {
        if (object instanceof m) {
            m m2 = (m)object;
            return this.b.equals(m2.b) && aL.a((Object)this.c, (Object)m2.c);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode() ^ aL.a(new Object[]{this.c});
    }
}

