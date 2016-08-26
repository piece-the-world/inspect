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

final class j
extends m {
    j(String string, String string2, Character c2) {
        this(new h(string, string2.toCharArray()), c2);
    }

    private j(h h2, Character c2) {
        super(h2, c2);
        aU.a(h.a(h2).length == 64);
    }

    @Override
    void a(Appendable appendable, byte[] arrby, int n2, int n3) throws IOException {
        aU.a(appendable);
        aU.a(n2, n2 + n3, arrby.length);
        int n4 = n2;
        for (int i2 = n3; i2 >= 3; i2 -= 3) {
            int n5 = (arrby[n4++] & 255) << 16 | (arrby[n4++] & 255) << 8 | arrby[n4++] & 255;
            appendable.append(this.b.a(n5 >>> 18));
            appendable.append(this.b.a(n5 >>> 12 & 63));
            appendable.append(this.b.a(n5 >>> 6 & 63));
            appendable.append(this.b.a(n5 & 63));
        }
        if (n4 < n2 + n3) {
            this.b(appendable, arrby, n4, n2 + n3 - n4);
        }
    }

    @Override
    int a(byte[] arrby, CharSequence charSequence) throws k {
        aU.a(arrby);
        charSequence = this.a().m(charSequence);
        if (!this.b.b(charSequence.length())) {
            throw new k("Invalid input length " + charSequence.length());
        }
        int n2 = 0;
        int n3 = 0;
        while (n3 < charSequence.length()) {
            int n4 = this.b.f(charSequence.charAt(n3++)) << 18;
            arrby[n2++] = (byte)((n4 |= this.b.f(charSequence.charAt(n3++)) << 12) >>> 16);
            if (n3 >= charSequence.length()) continue;
            arrby[n2++] = (byte)((n4 |= this.b.f(charSequence.charAt(n3++)) << 6) >>> 8 & 255);
            if (n3 >= charSequence.length()) continue;
            arrby[n2++] = (byte)((n4 |= this.b.f(charSequence.charAt(n3++))) & 255);
        }
        return n2;
    }

    @Override
    b a(h h2, Character c2) {
        return new j(h2, c2);
    }
}

