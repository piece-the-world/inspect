/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.j.b;
import com.growingio.a.a.j.h;
import com.growingio.a.a.j.k;
import com.growingio.a.a.j.m;
import java.io.IOException;

final class i
extends m {
    final char[] a = new char[512];

    i(String string, String string2) {
        this(new h(string, string2.toCharArray()));
    }

    private i(h h2) {
        super(h2, null);
        aU.a(h.a(h2).length == 16);
        for (int i2 = 0; i2 < 256; ++i2) {
            this.a[i2] = h2.a(i2 >>> 4);
            this.a[i2 | 256] = h2.a(i2 & 15);
        }
    }

    @Override
    void a(Appendable appendable, byte[] arrby, int n2, int n3) throws IOException {
        aU.a(appendable);
        aU.a(n2, n2 + n3, arrby.length);
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4 = arrby[n2 + i2] & 255;
            appendable.append(this.a[n4]);
            appendable.append(this.a[n4 | 256]);
        }
    }

    @Override
    int a(byte[] arrby, CharSequence charSequence) throws k {
        aU.a(arrby);
        if (charSequence.length() % 2 == 1) {
            throw new k("Invalid input length " + charSequence.length());
        }
        int n2 = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2 += 2) {
            int n3 = this.b.f(charSequence.charAt(i2)) << 4 | this.b.f(charSequence.charAt(i2 + 1));
            arrby[n2++] = (byte)n3;
        }
        return n2;
    }

    @Override
    b a(h h2, Character c2) {
        return new i(h2);
    }
}

