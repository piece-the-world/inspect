/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.A;
import com.growingio.a.a.b.B;
import com.growingio.a.a.b.C;
import com.growingio.a.a.b.D;
import com.growingio.a.a.b.E;
import com.growingio.a.a.b.F;
import com.growingio.a.a.b.G;
import com.growingio.a.a.b.H;
import com.growingio.a.a.b.J;
import com.growingio.a.a.b.L;
import com.growingio.a.a.b.M;
import com.growingio.a.a.b.O;
import com.growingio.a.a.b.P;
import com.growingio.a.a.b.aT;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aV;
import com.growingio.a.a.b.bo;
import com.growingio.a.a.b.n;
import com.growingio.a.a.b.o;
import com.growingio.a.a.b.p;
import com.growingio.a.a.b.q;
import com.growingio.a.a.b.r;
import com.growingio.a.a.b.s;
import com.growingio.a.a.b.t;
import com.growingio.a.a.b.u;
import com.growingio.a.a.b.w;
import com.growingio.a.a.b.x;
import com.growingio.a.a.b.y;
import com.growingio.a.a.b.z;
import java.util.BitSet;

public abstract class m
implements aV<Character> {
    public static final m a = m.c();
    public static final m b = m.d();
    public static final m c = m.e();
    public static final m d = m.f();
    public static final m e = m.g();
    public static final m f = m.h();
    public static final m g = m.i();
    public static final m h = m.j();
    public static final m i = m.k();
    public static final m j = m.l();
    public static final m k = m.m();
    public static final m l = m.n();
    public static final m m = m.a();
    public static final m n = m.b();
    private static final int o = 65536;

    public static m a() {
        return p.o;
    }

    public static m b() {
        return L.o;
    }

    public static m c() {
        return P.r;
    }

    public static m d() {
        return t.o;
    }

    public static m e() {
        return r.o;
    }

    public static m f() {
        return u.o;
    }

    public static m g() {
        return C.o;
    }

    public static m h() {
        return E.o;
    }

    public static m i() {
        return F.o;
    }

    public static m j() {
        return H.o;
    }

    public static m k() {
        return G.o;
    }

    public static m l() {
        return D.o;
    }

    public static m m() {
        return y.o;
    }

    public static m n() {
        return O.o;
    }

    public static m a(char c2) {
        return new z(c2);
    }

    public static m b(char c2) {
        return new B(c2);
    }

    public static m a(CharSequence charSequence) {
        switch (charSequence.length()) {
            case 0: {
                return m.b();
            }
            case 1: {
                return m.a(charSequence.charAt(0));
            }
            case 2: {
                return m.b(charSequence.charAt(0), charSequence.charAt(1));
            }
        }
        return new q(charSequence);
    }

    public static m b(CharSequence charSequence) {
        return m.a(charSequence).o();
    }

    public static m a(char c2, char c3) {
        return new x(c2, c3);
    }

    public static m a(aV<? super Character> aV2) {
        return aV2 instanceof m ? (m)aV2 : new w(aV2);
    }

    protected m() {
    }

    public abstract boolean c(char var1);

    public m o() {
        return new J(this);
    }

    public m a(m m2) {
        return new o(this, m2);
    }

    public m b(m m2) {
        return new M(this, m2);
    }

    public m p() {
        return aT.a(this);
    }

    m q() {
        BitSet bitSet = new BitSet();
        this.a(bitSet);
        int n2 = bitSet.cardinality();
        if (n2 * 2 <= 65536) {
            return m.a(n2, bitSet, this.toString());
        }
        bitSet.flip(0, 65536);
        int n3 = 65536 - n2;
        String string = ".negate()";
        String string2 = this.toString();
        String string3 = string2.endsWith(string) ? string2.substring(0, string2.length() - string.length()) : string2 + string;
        return new n(this, m.a(n3, bitSet, string3), string2);
    }

    private static m a(int n2, BitSet bitSet, String string) {
        switch (n2) {
            case 0: {
                return m.b();
            }
            case 1: {
                return m.a((char)bitSet.nextSetBit(0));
            }
            case 2: {
                char c2 = (char)bitSet.nextSetBit(0);
                char c3 = (char)bitSet.nextSetBit(c2 + '\u0001');
                return m.b(c2, c3);
            }
        }
        return m.a(n2, bitSet.length()) ? bo.a(bitSet, string) : new s(bitSet, string, null);
    }

    private static boolean a(int n2, int n3) {
        return n2 <= 1023 && n3 > n2 * 4 * 16;
    }

    void a(BitSet bitSet) {
        for (int i2 = 65535; i2 >= 0; --i2) {
            if (!this.c((char)i2)) continue;
            bitSet.set(i2);
        }
    }

    public boolean c(CharSequence charSequence) {
        return !this.e(charSequence);
    }

    public boolean d(CharSequence charSequence) {
        for (int i2 = charSequence.length() - 1; i2 >= 0; --i2) {
            if (this.c(charSequence.charAt(i2))) continue;
            return false;
        }
        return true;
    }

    public boolean e(CharSequence charSequence) {
        return this.f(charSequence) == -1;
    }

    public int f(CharSequence charSequence) {
        return this.a(charSequence, 0);
    }

    public int a(CharSequence charSequence, int n2) {
        int n3 = charSequence.length();
        aU.b(n2, n3);
        for (int i2 = n2; i2 < n3; ++i2) {
            if (!this.c(charSequence.charAt(i2))) continue;
            return i2;
        }
        return -1;
    }

    public int g(CharSequence charSequence) {
        for (int i2 = charSequence.length() - 1; i2 >= 0; --i2) {
            if (!this.c(charSequence.charAt(i2))) continue;
            return i2;
        }
        return -1;
    }

    public int h(CharSequence charSequence) {
        int n2 = 0;
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            if (!this.c(charSequence.charAt(i2))) continue;
            ++n2;
        }
        return n2;
    }

    public String i(CharSequence charSequence) {
        String string = charSequence.toString();
        int n2 = this.f(string);
        if (n2 == -1) {
            return string;
        }
        char[] arrc = string.toCharArray();
        int n3 = 1;
        block0 : do {
            ++n2;
            while (n2 != arrc.length) {
                if (!this.c(arrc[n2])) {
                    arrc[n2 - n3] = arrc[n2];
                    ++n2;
                    continue;
                }
                ++n3;
                continue block0;
                continue block0;
            }
            break block0;
            break;
        } while (true);
        return new String(arrc, 0, n2 - n3);
    }

    public String j(CharSequence charSequence) {
        return this.o().i(charSequence);
    }

    public String a(CharSequence charSequence, char c2) {
        String string = charSequence.toString();
        int n2 = this.f(string);
        if (n2 == -1) {
            return string;
        }
        char[] arrc = string.toCharArray();
        arrc[n2] = c2;
        for (int i2 = n2 + 1; i2 < arrc.length; ++i2) {
            if (!this.c(arrc[i2])) continue;
            arrc[i2] = c2;
        }
        return new String(arrc);
    }

    public String a(CharSequence charSequence, CharSequence charSequence2) {
        int n2 = charSequence2.length();
        if (n2 == 0) {
            return this.i(charSequence);
        }
        if (n2 == 1) {
            return this.a(charSequence, charSequence2.charAt(0));
        }
        String string = charSequence.toString();
        int n3 = this.f(string);
        if (n3 == -1) {
            return string;
        }
        int n4 = string.length();
        StringBuilder stringBuilder = new StringBuilder(n4 * 3 / 2 + 16);
        int n5 = 0;
        do {
            stringBuilder.append(string, n5, n3);
            stringBuilder.append(charSequence2);
            n5 = n3 + 1;
        } while ((n3 = this.a((CharSequence)string, n5)) != -1);
        stringBuilder.append(string, n5, n4);
        return stringBuilder.toString();
    }

    public String k(CharSequence charSequence) {
        int n2;
        int n3;
        int n4 = charSequence.length();
        for (n3 = 0; n3 < n4 && this.c(charSequence.charAt(n3)); ++n3) {
        }
        for (n2 = n4 - 1; n2 > n3 && this.c(charSequence.charAt(n2)); --n2) {
        }
        return charSequence.subSequence(n3, n2 + 1).toString();
    }

    public String l(CharSequence charSequence) {
        int n2 = charSequence.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.c(charSequence.charAt(i2))) continue;
            return charSequence.subSequence(i2, n2).toString();
        }
        return "";
    }

    public String m(CharSequence charSequence) {
        int n2 = charSequence.length();
        for (int i2 = n2 - 1; i2 >= 0; --i2) {
            if (this.c(charSequence.charAt(i2))) continue;
            return charSequence.subSequence(0, i2 + 1).toString();
        }
        return "";
    }

    public String b(CharSequence charSequence, char c2) {
        int n2 = charSequence.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            char c3 = charSequence.charAt(i2);
            if (!this.c(c3)) continue;
            if (!(c3 != c2 || i2 != n2 - 1 && this.c(charSequence.charAt(i2 + 1)))) {
                ++i2;
                continue;
            }
            StringBuilder stringBuilder = new StringBuilder(n2).append(charSequence, 0, i2).append(c2);
            return this.a(charSequence, i2 + 1, n2, c2, stringBuilder, true);
        }
        return charSequence.toString();
    }

    public String c(CharSequence charSequence, char c2) {
        int n2;
        int n3 = charSequence.length();
        int n4 = n3 - 1;
        for (n2 = 0; n2 < n3 && this.c(charSequence.charAt(n2)); ++n2) {
        }
        while (n4 > n2 && this.c(charSequence.charAt(n4))) {
            --n4;
        }
        return n2 == 0 && n4 == n3 - 1 ? this.b(charSequence, c2) : this.a(charSequence, n2, n4 + 1, c2, new StringBuilder(n4 + 1 - n2), false);
    }

    private String a(CharSequence charSequence, int n2, int n3, char c2, StringBuilder stringBuilder, boolean bl2) {
        for (int i2 = n2; i2 < n3; ++i2) {
            char c3 = charSequence.charAt(i2);
            if (this.c(c3)) {
                if (bl2) continue;
                stringBuilder.append(c2);
                bl2 = true;
                continue;
            }
            stringBuilder.append(c3);
            bl2 = false;
        }
        return stringBuilder.toString();
    }

    @Override
    public boolean a(Character c2) {
        return this.c(c2.charValue());
    }

    public String toString() {
        return super.toString();
    }

    private static String e(char c2) {
        String string = "0123456789ABCDEF";
        char[] arrc = new char[]{'\\', 'u', '\u0000', '\u0000', '\u0000', '\u0000'};
        for (int i2 = 0; i2 < 4; ++i2) {
            arrc[5 - i2] = string.charAt(c2 & 15);
            c2 = (char)(c2 >> 4);
        }
        return String.copyValueOf(arrc);
    }

    private static A b(char c2, char c3) {
        return new A(c2, c3);
    }

    static /* synthetic */ String d(char c2) {
        return m.e(c2);
    }
}

