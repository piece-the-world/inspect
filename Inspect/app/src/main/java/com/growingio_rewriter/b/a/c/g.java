/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.c;

import com.growingio.b.a.Q;
import com.growingio.b.a.T;
import com.growingio.b.a.ay;
import com.growingio.b.a.c.h;
import com.growingio.b.a.c.j;
import com.growingio.b.a.c.m;
import com.growingio.b.a.c.n;
import com.growingio.b.a.c.p;
import com.growingio.b.a.c.r;
import com.growingio.b.a.c.s;
import com.growingio.b.a.i;
import com.growingio.b.a.l;

public abstract class g
implements s {
    protected com.growingio.b.g a;
    protected Q b;
    protected String c;
    protected int d;
    protected h[] e;
    protected h[] f;

    public g(com.growingio.b.g g2, Q q2, int n2, int n3, String string) {
        this.a = g2;
        this.b = q2;
        this.c = string;
        this.d = 0;
        this.e = h.a(n2);
        this.f = h.a(n3);
    }

    public g(g g2) {
        this.a = g2.a;
        this.b = g2.b;
        this.c = g2.c;
        this.d = g2.d;
        this.e = h.a(g2.e.length);
        this.f = h.a(g2.f.length);
    }

    protected int a(int n2, byte[] arrby) throws i {
        try {
            int n3 = arrby[n2] & 255;
            if (n3 < 96) {
                if (n3 < 54) {
                    return this.c(n2, arrby, n3);
                }
                return this.d(n2, arrby, n3);
            }
            if (n3 < 148) {
                return this.e(n2, arrby, n3);
            }
            return this.f(n2, arrby, n3);
        }
        catch (ArrayIndexOutOfBoundsException var3_4) {
            throw new i("inconsistent stack height " + var3_4.getMessage(), (Throwable)var3_4);
        }
    }

    protected void a(int n2, byte[] arrby, int n3) throws i {
    }

    protected void b(int n2, byte[] arrby, int n3) throws i {
    }

    protected void b(int n2, byte[] arrby) throws i {
    }

    protected void c(int n2, byte[] arrby) throws i {
    }

    protected void a(int n2, byte[] arrby, int n3, int n4, int n5) throws i {
    }

    protected void b(int n2, byte[] arrby, int n3, int n4, int n5) throws i {
    }

    protected void d(int n2, byte[] arrby) throws i {
    }

    protected void e(int n2, byte[] arrby) throws i {
    }

    private int c(int n2, byte[] arrby, int n3) throws i {
        h[] arrh = this.e;
        switch (n3) {
            case 0: {
                break;
            }
            case 1: {
                arrh[this.d++] = new n();
                break;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: {
                arrh[this.d++] = i;
                break;
            }
            case 9: 
            case 10: {
                arrh[this.d++] = l;
                arrh[this.d++] = h;
                break;
            }
            case 11: 
            case 12: 
            case 13: {
                arrh[this.d++] = j;
                break;
            }
            case 14: 
            case 15: {
                arrh[this.d++] = k;
                arrh[this.d++] = h;
                break;
            }
            case 16: 
            case 17: {
                arrh[this.d++] = i;
                return n3 == 17 ? 3 : 2;
            }
            case 18: {
                this.a(arrby[n2 + 1] & 255);
                return 2;
            }
            case 19: 
            case 20: {
                this.a(l.a(arrby, n2 + 1));
                return 3;
            }
            case 21: {
                return this.a(i, arrby, n2);
            }
            case 22: {
                return this.a(l, arrby, n2);
            }
            case 23: {
                return this.a(j, arrby, n2);
            }
            case 24: {
                return this.a(k, arrby, n2);
            }
            case 25: {
                return this.b(arrby[n2 + 1] & 255);
            }
            case 26: 
            case 27: 
            case 28: 
            case 29: {
                arrh[this.d++] = i;
                break;
            }
            case 30: 
            case 31: 
            case 32: 
            case 33: {
                arrh[this.d++] = l;
                arrh[this.d++] = h;
                break;
            }
            case 34: 
            case 35: 
            case 36: 
            case 37: {
                arrh[this.d++] = j;
                break;
            }
            case 38: 
            case 39: 
            case 40: 
            case 41: {
                arrh[this.d++] = k;
                arrh[this.d++] = h;
                break;
            }
            case 42: 
            case 43: 
            case 44: 
            case 45: {
                int n4 = n3 - 42;
                arrh[this.d++] = this.f[n4];
                break;
            }
            case 46: {
                arrh[--this.d - 1] = i;
                break;
            }
            case 47: {
                arrh[this.d - 2] = l;
                arrh[this.d - 1] = h;
                break;
            }
            case 48: {
                arrh[--this.d - 1] = j;
                break;
            }
            case 49: {
                arrh[this.d - 2] = k;
                arrh[this.d - 1] = h;
                break;
            }
            case 50: {
                int n5 = --this.d - 1;
                h h2 = arrh[n5];
                arrh[n5] = j.c(h2);
                break;
            }
            case 51: 
            case 52: 
            case 53: {
                arrh[--this.d - 1] = i;
                break;
            }
            default: {
                throw new RuntimeException("fatal");
            }
        }
        return 1;
    }

    private void a(int n2) {
        h[] arrh = this.e;
        int n3 = this.b.c(n2);
        if (n3 == 8) {
            arrh[this.d++] = new m("java.lang.String");
        } else if (n3 == 3) {
            arrh[this.d++] = i;
        } else if (n3 == 4) {
            arrh[this.d++] = j;
        } else if (n3 == 5) {
            arrh[this.d++] = l;
            arrh[this.d++] = h;
        } else if (n3 == 6) {
            arrh[this.d++] = k;
            arrh[this.d++] = h;
        } else if (n3 == 7) {
            arrh[this.d++] = new m("java.lang.Class");
        } else {
            throw new RuntimeException("bad LDC: " + n3);
        }
    }

    private int a(h h2, byte[] arrby, int n2) {
        int n3 = arrby[n2 + 1] & 255;
        return this.a(n3, h2);
    }

    private int a(int n2, h h2) {
        this.e[this.d++] = h2;
        if (h2.d()) {
            this.e[this.d++] = h;
        }
        return 2;
    }

    private int b(int n2) {
        this.e[this.d++] = this.f[n2];
        return 2;
    }

    private int d(int n2, byte[] arrby, int n3) throws i {
        switch (n3) {
            case 54: {
                return this.a(n2, arrby, i);
            }
            case 55: {
                return this.a(n2, arrby, l);
            }
            case 56: {
                return this.a(n2, arrby, j);
            }
            case 57: {
                return this.a(n2, arrby, k);
            }
            case 58: {
                return this.c(arrby[n2 + 1] & 255);
            }
            case 59: 
            case 60: 
            case 61: 
            case 62: {
                int n4 = n3 - 59;
                this.f[n4] = i;
                --this.d;
                break;
            }
            case 63: 
            case 64: 
            case 65: 
            case 66: {
                int n5 = n3 - 63;
                this.f[n5] = l;
                this.f[n5 + 1] = h;
                this.d -= 2;
                break;
            }
            case 67: 
            case 68: 
            case 69: 
            case 70: {
                int n6 = n3 - 67;
                this.f[n6] = j;
                --this.d;
                break;
            }
            case 71: 
            case 72: 
            case 73: 
            case 74: {
                int n7 = n3 - 71;
                this.f[n7] = k;
                this.f[n7 + 1] = h;
                this.d -= 2;
                break;
            }
            case 75: 
            case 76: 
            case 77: 
            case 78: {
                int n8 = n3 - 75;
                this.c(n8);
                break;
            }
            case 79: 
            case 80: 
            case 81: 
            case 82: {
                this.d -= n3 == 80 || n3 == 82 ? 4 : 3;
                break;
            }
            case 83: {
                j.a(this.e[this.d - 3], this.e[this.d - 1], this.a);
                this.d -= 3;
                break;
            }
            case 84: 
            case 85: 
            case 86: {
                this.d -= 3;
                break;
            }
            case 87: {
                --this.d;
                break;
            }
            case 88: {
                this.d -= 2;
                break;
            }
            case 89: {
                int n9 = this.d;
                this.e[n9] = this.e[n9 - 1];
                this.d = n9 + 1;
                break;
            }
            case 90: 
            case 91: {
                int n10 = n3 - 90 + 2;
                this.a(1, n10);
                int n11 = this.d;
                this.e[n11 - n10] = this.e[n11];
                this.d = n11 + 1;
                break;
            }
            case 92: {
                this.a(2, 2);
                this.d += 2;
                break;
            }
            case 93: 
            case 94: {
                int n12 = n3 - 93 + 3;
                this.a(2, n12);
                int n13 = this.d;
                this.e[n13 - n12] = this.e[n13];
                this.e[n13 - n12 + 1] = this.e[n13 + 1];
                this.d = n13 + 2;
                break;
            }
            case 95: {
                int n14 = this.d - 1;
                h h2 = this.e[n14];
                this.e[n14] = this.e[n14 - 1];
                this.e[n14 - 1] = h2;
                break;
            }
            default: {
                throw new RuntimeException("fatal");
            }
        }
        return 1;
    }

    private int a(int n2, byte[] arrby, h h2) {
        int n3 = arrby[n2 + 1] & 255;
        return this.b(n3, h2);
    }

    private int b(int n2, h h2) {
        --this.d;
        this.f[n2] = h2;
        if (h2.d()) {
            --this.d;
            this.f[n2 + 1] = h;
        }
        return 2;
    }

    private int c(int n2) {
        --this.d;
        this.f[n2] = this.e[this.d];
        return 2;
    }

    private void a(int n2, int n3) {
        int n4;
        h[] arrh = this.e;
        int n5 = n4 - n3;
        for (n4 = this.d - 1; n4 > n5; --n4) {
            arrh[n4 + n2] = arrh[n4];
        }
    }

    private int e(int n2, byte[] arrby, int n3) {
        if (n3 <= 131) {
            this.d += ay.dh[n3];
            return 1;
        }
        switch (n3) {
            case 132: {
                return 3;
            }
            case 133: {
                this.e[this.d - 1] = l;
                this.e[this.d] = h;
                ++this.d;
                break;
            }
            case 134: {
                this.e[this.d - 1] = j;
                break;
            }
            case 135: {
                this.e[this.d - 1] = k;
                this.e[this.d] = h;
                ++this.d;
                break;
            }
            case 136: {
                this.e[--this.d - 1] = i;
                break;
            }
            case 137: {
                this.e[--this.d - 1] = j;
                break;
            }
            case 138: {
                this.e[this.d - 2] = k;
                break;
            }
            case 139: {
                this.e[this.d - 1] = i;
                break;
            }
            case 140: {
                this.e[this.d - 1] = l;
                this.e[this.d] = h;
                ++this.d;
                break;
            }
            case 141: {
                this.e[this.d - 1] = k;
                this.e[this.d] = h;
                ++this.d;
                break;
            }
            case 142: {
                this.e[--this.d - 1] = i;
                break;
            }
            case 143: {
                this.e[this.d - 2] = l;
                break;
            }
            case 144: {
                this.e[--this.d - 1] = j;
                break;
            }
            case 145: 
            case 146: 
            case 147: {
                break;
            }
            default: {
                throw new RuntimeException("fatal");
            }
        }
        return 1;
    }

    private int f(int n2, byte[] arrby, int n3) throws i {
        switch (n3) {
            case 148: {
                this.e[this.d - 4] = i;
                this.d -= 3;
                break;
            }
            case 149: 
            case 150: {
                this.e[--this.d - 1] = i;
                break;
            }
            case 151: 
            case 152: {
                this.e[this.d - 4] = i;
                this.d -= 3;
                break;
            }
            case 153: 
            case 154: 
            case 155: 
            case 156: 
            case 157: 
            case 158: {
                --this.d;
                this.a(n2, arrby, l.b(arrby, n2 + 1));
                return 3;
            }
            case 159: 
            case 160: 
            case 161: 
            case 162: 
            case 163: 
            case 164: 
            case 165: 
            case 166: {
                this.d -= 2;
                this.a(n2, arrby, l.b(arrby, n2 + 1));
                return 3;
            }
            case 167: {
                this.b(n2, arrby, l.b(arrby, n2 + 1));
                return 3;
            }
            case 168: {
                this.d(n2, arrby);
                return 3;
            }
            case 169: {
                this.e(n2, arrby);
                return 2;
            }
            case 170: {
                --this.d;
                int n4 = (n2 & -4) + 8;
                int n5 = l.c(arrby, n4);
                int n6 = l.c(arrby, n4 + 4);
                int n7 = n6 - n5 + 1;
                this.a(n2, arrby, n7, n4 + 8, l.c(arrby, n4 - 4));
                return n7 * 4 + 16 - (n2 & 3);
            }
            case 171: {
                --this.d;
                int n8 = (n2 & -4) + 8;
                int n9 = l.c(arrby, n8);
                this.b(n2, arrby, n9, n8 + 4, l.c(arrby, n8 - 4));
                return n9 * 8 + 12 - (n2 & 3);
            }
            case 172: {
                --this.d;
                this.b(n2, arrby);
                break;
            }
            case 173: {
                this.d -= 2;
                this.b(n2, arrby);
                break;
            }
            case 174: {
                --this.d;
                this.b(n2, arrby);
                break;
            }
            case 175: {
                this.d -= 2;
                this.b(n2, arrby);
                break;
            }
            case 176: {
                this.e[--this.d].a(this.c, this.a);
                this.b(n2, arrby);
                break;
            }
            case 177: {
                this.b(n2, arrby);
                break;
            }
            case 178: {
                return this.b(n2, arrby, false);
            }
            case 179: {
                return this.a(n2, arrby, false);
            }
            case 180: {
                return this.b(n2, arrby, true);
            }
            case 181: {
                return this.a(n2, arrby, true);
            }
            case 182: 
            case 183: {
                return this.c(n2, arrby, true);
            }
            case 184: {
                return this.c(n2, arrby, false);
            }
            case 185: {
                return this.i(n2, arrby);
            }
            case 186: {
                return this.j(n2, arrby);
            }
            case 187: {
                int n10 = l.a(arrby, n2 + 1);
                this.e[this.d++] = new p(n2, this.b.d(n10));
                return 3;
            }
            case 188: {
                return this.g(n2, arrby);
            }
            case 189: {
                int n11 = l.a(arrby, n2 + 1);
                String string = this.b.d(n11).replace('.', '/');
                string = string.charAt(0) == '[' ? "[" + string : "[L" + string + ";";
                this.e[this.d - 1] = new m(string);
                return 3;
            }
            case 190: {
                this.e[this.d - 1].a("[Ljava.lang.Object;", this.a);
                this.e[this.d - 1] = i;
                break;
            }
            case 191: {
                this.e[--this.d].a("java.lang.Throwable", this.a);
                this.c(n2, arrby);
                break;
            }
            case 192: {
                int n12 = l.a(arrby, n2 + 1);
                String string = this.b.d(n12);
                if (string.charAt(0) == '[') {
                    string = string.replace('.', '/');
                }
                this.e[this.d - 1] = new m(string);
                return 3;
            }
            case 193: {
                this.e[this.d - 1] = i;
                return 3;
            }
            case 194: 
            case 195: {
                --this.d;
                break;
            }
            case 196: {
                return this.f(n2, arrby);
            }
            case 197: {
                return this.h(n2, arrby);
            }
            case 198: 
            case 199: {
                --this.d;
                this.a(n2, arrby, l.b(arrby, n2 + 1));
                return 3;
            }
            case 200: {
                this.b(n2, arrby, l.c(arrby, n2 + 1));
                return 5;
            }
            case 201: {
                this.d(n2, arrby);
                return 5;
            }
        }
        return 1;
    }

    private int f(int n2, byte[] arrby) throws i {
        int n3 = arrby[n2 + 1] & 255;
        switch (n3) {
            case 21: {
                this.b(n2, arrby, i);
                break;
            }
            case 22: {
                this.b(n2, arrby, l);
                break;
            }
            case 23: {
                this.b(n2, arrby, j);
                break;
            }
            case 24: {
                this.b(n2, arrby, k);
                break;
            }
            case 25: {
                int n4 = l.a(arrby, n2 + 2);
                this.b(n4);
                break;
            }
            case 54: {
                this.c(n2, arrby, i);
                break;
            }
            case 55: {
                this.c(n2, arrby, l);
                break;
            }
            case 56: {
                this.c(n2, arrby, j);
                break;
            }
            case 57: {
                this.c(n2, arrby, k);
                break;
            }
            case 58: {
                int n5 = l.a(arrby, n2 + 2);
                this.c(n5);
                break;
            }
            case 132: {
                return 6;
            }
            case 169: {
                this.e(n2, arrby);
                break;
            }
            default: {
                throw new RuntimeException("bad WIDE instruction: " + n3);
            }
        }
        return 4;
    }

    private void b(int n2, byte[] arrby, h h2) {
        int n3 = l.a(arrby, n2 + 2);
        this.a(n3, h2);
    }

    private void c(int n2, byte[] arrby, h h2) {
        int n3 = l.a(arrby, n2 + 2);
        this.b(n3, h2);
    }

    private int a(int n2, byte[] arrby, boolean bl2) throws i {
        int n3 = l.a(arrby, n2 + 1);
        String string = this.b.n(n3);
        this.d -= T.h(string);
        char c2 = string.charAt(0);
        if (c2 == 'L') {
            this.e[this.d].a(g.a(string, 0), this.a);
        } else if (c2 == '[') {
            this.e[this.d].a(string, this.a);
        }
        this.a(bl2, n3);
        return 3;
    }

    private int b(int n2, byte[] arrby, boolean bl2) throws i {
        int n3 = l.a(arrby, n2 + 1);
        this.a(bl2, n3);
        String string = this.b.n(n3);
        this.a(string);
        return 3;
    }

    private void a(boolean bl2, int n2) throws i {
        if (bl2) {
            String string = this.b.k(n2);
            this.e[--this.d].a(string, this.a);
        }
    }

    private int g(int n2, byte[] arrby) {
        String string;
        int n3 = this.d - 1;
        switch (arrby[n2 + 1] & 255) {
            case 4: {
                string = "[Z";
                break;
            }
            case 5: {
                string = "[C";
                break;
            }
            case 6: {
                string = "[F";
                break;
            }
            case 7: {
                string = "[D";
                break;
            }
            case 8: {
                string = "[B";
                break;
            }
            case 9: {
                string = "[S";
                break;
            }
            case 10: {
                string = "[I";
                break;
            }
            case 11: {
                string = "[J";
                break;
            }
            default: {
                throw new RuntimeException("bad newarray");
            }
        }
        this.e[n3] = new m(string);
        return 2;
    }

    private int h(int n2, byte[] arrby) {
        int n3 = l.a(arrby, n2 + 1);
        int n4 = arrby[n2 + 3] & 255;
        this.d -= n4 - 1;
        String string = this.b.d(n3).replace('.', '/');
        this.e[this.d - 1] = new m(string);
        return 4;
    }

    private int c(int n2, byte[] arrby, boolean bl2) throws i {
        int n3 = l.a(arrby, n2 + 1);
        String string = this.b.s(n3);
        this.b(string, 1);
        if (bl2) {
            h h2;
            String string2 = this.b.p(n3);
            if ((h2 = this.e[--this.d]) instanceof r && h2.f()) {
                this.a(h2, ((r)h2).i());
            } else if (h2 instanceof p) {
                this.a(h2, ((p)h2).j());
            }
            h2.a(string2, this.a);
        }
        this.a(string);
        return 3;
    }

    private void a(h h2, int n2) {
        int n3;
        h2.b(n2);
        for (n3 = 0; n3 < this.d; ++n3) {
            this.e[n3].b(n2);
        }
        for (n3 = 0; n3 < this.f.length; ++n3) {
            this.f[n3].b(n2);
        }
    }

    private int i(int n2, byte[] arrby) throws i {
        int n3 = l.a(arrby, n2 + 1);
        String string = this.b.x(n3);
        this.b(string, 1);
        String string2 = this.b.u(n3);
        this.e[--this.d].a(string2, this.a);
        this.a(string);
        return 5;
    }

    private int j(int n2, byte[] arrby) throws i {
        int n3 = l.a(arrby, n2 + 1);
        String string = this.b.K(n3);
        this.b(string, 1);
        this.a(string);
        return 5;
    }

    private void a(String string) {
        int n2 = 0;
        if (string.charAt(0) == '(' && (n2 = string.indexOf(41) + 1) < 1) {
            throw new IndexOutOfBoundsException("bad descriptor: " + string);
        }
        h[] arrh = this.e;
        int n3 = this.d;
        switch (string.charAt(n2)) {
            case '[': {
                arrh[n3] = new m(string.substring(n2));
                break;
            }
            case 'L': {
                arrh[n3] = new m(g.a(string, n2));
                break;
            }
            case 'J': {
                arrh[n3] = l;
                arrh[n3 + 1] = h;
                this.d += 2;
                return;
            }
            case 'F': {
                arrh[n3] = j;
                break;
            }
            case 'D': {
                arrh[n3] = k;
                arrh[n3 + 1] = h;
                this.d += 2;
                return;
            }
            case 'V': {
                return;
            }
            default: {
                arrh[n3] = i;
            }
        }
        ++this.d;
    }

    private static String a(String string, int n2) {
        return string.substring(n2 + 1, string.length() - 1).replace('/', '.');
    }

    private void b(String string, int n2) throws i {
        char c2 = string.charAt(n2);
        if (c2 == ')') {
            return;
        }
        int n3 = n2;
        boolean bl2 = false;
        while (c2 == '[') {
            bl2 = true;
            c2 = string.charAt(++n3);
        }
        if (c2 == 'L') {
            if ((n3 = string.indexOf(59, n3) + 1) <= 0) {
                throw new IndexOutOfBoundsException("bad descriptor");
            }
        } else {
            ++n3;
        }
        this.b(string, n3);
        this.d = !(bl2 || c2 != 'J' && c2 != 'D') ? (this.d -= 2) : --this.d;
        if (bl2) {
            this.e[this.d].a(string.substring(n2, n3), this.a);
        } else if (c2 == 'L') {
            this.e[this.d].a(string.substring(n2 + 1, n3 - 1).replace('/', '.'), this.a);
        }
    }
}

