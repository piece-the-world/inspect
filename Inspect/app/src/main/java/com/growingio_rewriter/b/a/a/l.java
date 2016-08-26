/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.a;

import com.growingio.b.a.B;
import com.growingio.b.a.Q;
import com.growingio.b.a.T;
import com.growingio.b.a.a.m;
import com.growingio.b.a.a.t;
import com.growingio.b.a.a.v;
import com.growingio.b.a.as;
import com.growingio.b.a.ay;
import com.growingio.b.a.i;
import com.growingio.b.ae;
import com.growingio.b.g;
import com.growingio.b.o;

public class l
implements ay {
    private final Q a;
    private final g b;
    private final v c;
    private final v d;
    private final v e;
    private int di;

    public l(g g2, Q q2) {
        this.a = q2;
        this.b = g2;
        try {
            this.c = this.a("java.lang.String");
            this.d = this.a("java.lang.Class");
            this.e = this.a("java.lang.Throwable");
        }
        catch (Exception var3_3) {
            throw new RuntimeException(var3_3);
        }
    }

    public void a(as as2, int n2, B b2, m m2, t t2) throws i {
        this.di = n2;
        int n3 = b2.c(n2);
        switch (n3) {
            case 0: {
                break;
            }
            case 1: {
                m2.a(v.j);
                break;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: {
                m2.a(v.g);
                break;
            }
            case 9: 
            case 10: {
                m2.a(v.c);
                m2.a(v.l);
                break;
            }
            case 11: 
            case 12: 
            case 13: {
                m2.a(v.h);
                break;
            }
            case 14: 
            case 15: {
                m2.a(v.a);
                m2.a(v.l);
                break;
            }
            case 16: 
            case 17: {
                m2.a(v.g);
                break;
            }
            case 18: {
                this.a(b2.c(n2 + 1), m2);
                break;
            }
            case 19: 
            case 20: {
                this.a(b2.e(n2 + 1), m2);
                break;
            }
            case 21: {
                this.a(v.g, b2.c(n2 + 1), m2, t2);
                break;
            }
            case 22: {
                this.a(v.c, b2.c(n2 + 1), m2, t2);
                break;
            }
            case 23: {
                this.a(v.h, b2.c(n2 + 1), m2, t2);
                break;
            }
            case 24: {
                this.a(v.a, b2.c(n2 + 1), m2, t2);
                break;
            }
            case 25: {
                this.a(v.n, b2.c(n2 + 1), m2, t2);
                break;
            }
            case 26: 
            case 27: 
            case 28: 
            case 29: {
                this.a(v.g, n3 - 26, m2, t2);
                break;
            }
            case 30: 
            case 31: 
            case 32: 
            case 33: {
                this.a(v.c, n3 - 30, m2, t2);
                break;
            }
            case 34: 
            case 35: 
            case 36: 
            case 37: {
                this.a(v.h, n3 - 34, m2, t2);
                break;
            }
            case 38: 
            case 39: 
            case 40: 
            case 41: {
                this.a(v.a, n3 - 38, m2, t2);
                break;
            }
            case 42: 
            case 43: 
            case 44: 
            case 45: {
                this.a(v.n, n3 - 42, m2, t2);
                break;
            }
            case 46: {
                this.a(v.g, m2);
                break;
            }
            case 47: {
                this.a(v.c, m2);
                break;
            }
            case 48: {
                this.a(v.h, m2);
                break;
            }
            case 49: {
                this.a(v.a, m2);
                break;
            }
            case 50: {
                this.a(v.n, m2);
                break;
            }
            case 51: 
            case 52: 
            case 53: {
                this.a(v.g, m2);
                break;
            }
            case 54: {
                this.b(v.g, b2.c(n2 + 1), m2, t2);
                break;
            }
            case 55: {
                this.b(v.c, b2.c(n2 + 1), m2, t2);
                break;
            }
            case 56: {
                this.b(v.h, b2.c(n2 + 1), m2, t2);
                break;
            }
            case 57: {
                this.b(v.a, b2.c(n2 + 1), m2, t2);
                break;
            }
            case 58: {
                this.b(v.n, b2.c(n2 + 1), m2, t2);
                break;
            }
            case 59: 
            case 60: 
            case 61: 
            case 62: {
                this.b(v.g, n3 - 59, m2, t2);
                break;
            }
            case 63: 
            case 64: 
            case 65: 
            case 66: {
                this.b(v.c, n3 - 63, m2, t2);
                break;
            }
            case 67: 
            case 68: 
            case 69: 
            case 70: {
                this.b(v.h, n3 - 67, m2, t2);
                break;
            }
            case 71: 
            case 72: 
            case 73: 
            case 74: {
                this.b(v.a, n3 - 71, m2, t2);
                break;
            }
            case 75: 
            case 76: 
            case 77: 
            case 78: {
                this.b(v.n, n3 - 75, m2, t2);
                break;
            }
            case 79: {
                this.b(v.g, m2);
                break;
            }
            case 80: {
                this.b(v.c, m2);
                break;
            }
            case 81: {
                this.b(v.h, m2);
                break;
            }
            case 82: {
                this.b(v.a, m2);
                break;
            }
            case 83: {
                this.b(v.n, m2);
                break;
            }
            case 84: 
            case 85: 
            case 86: {
                this.b(v.g, m2);
                break;
            }
            case 87: {
                if (m2.e() != v.l) break;
                throw new i("POP can not be used with a category 2 value, pos = " + n2);
            }
            case 88: {
                m2.e();
                m2.e();
                break;
            }
            case 89: {
                v v2 = m2.d();
                if (v2 == v.l) {
                    throw new i("DUP can not be used with a category 2 value, pos = " + n2);
                }
                m2.a(m2.d());
                break;
            }
            case 90: 
            case 91: {
                int n4;
                v v3 = m2.d();
                if (v3 == v.l) {
                    throw new i("DUP can not be used with a category 2 value, pos = " + n2);
                }
                int n5 = n4 - (n3 - 90) - 1;
                m2.a(v3);
                for (n4 = m2.b(); n4 > n5; --n4) {
                    m2.b(n4, m2.b(n4 - 1));
                }
                m2.b(n5, v3);
                break;
            }
            case 92: {
                m2.a(m2.b(m2.b() - 1));
                m2.a(m2.b(m2.b() - 1));
                break;
            }
            case 93: 
            case 94: {
                int n6;
                int n7 = n6 - (n3 - 93) - 1;
                v v4 = m2.b(m2.b() - 1);
                v v5 = m2.d();
                m2.a(v4);
                m2.a(v5);
                for (n6 = m2.b(); n6 > n7; --n6) {
                    m2.b(n6, m2.b(n6 - 2));
                }
                m2.b(n7, v5);
                m2.b(n7 - 1, v4);
                break;
            }
            case 95: {
                v v6 = m2.e();
                v v7 = m2.e();
                if (v6.e() == 2 || v7.e() == 2) {
                    throw new i("Swap can not be used with category 2 values, pos = " + n2);
                }
                m2.a(v6);
                m2.a(v7);
                break;
            }
            case 96: {
                this.c(v.g, m2);
                break;
            }
            case 97: {
                this.c(v.c, m2);
                break;
            }
            case 98: {
                this.c(v.h, m2);
                break;
            }
            case 99: {
                this.c(v.a, m2);
                break;
            }
            case 100: {
                this.c(v.g, m2);
                break;
            }
            case 101: {
                this.c(v.c, m2);
                break;
            }
            case 102: {
                this.c(v.h, m2);
                break;
            }
            case 103: {
                this.c(v.a, m2);
                break;
            }
            case 104: {
                this.c(v.g, m2);
                break;
            }
            case 105: {
                this.c(v.c, m2);
                break;
            }
            case 106: {
                this.c(v.h, m2);
                break;
            }
            case 107: {
                this.c(v.a, m2);
                break;
            }
            case 108: {
                this.c(v.g, m2);
                break;
            }
            case 109: {
                this.c(v.c, m2);
                break;
            }
            case 110: {
                this.c(v.h, m2);
                break;
            }
            case 111: {
                this.c(v.a, m2);
                break;
            }
            case 112: {
                this.c(v.g, m2);
                break;
            }
            case 113: {
                this.c(v.c, m2);
                break;
            }
            case 114: {
                this.c(v.h, m2);
                break;
            }
            case 115: {
                this.c(v.a, m2);
                break;
            }
            case 116: {
                this.a(v.g, this.a(m2));
                break;
            }
            case 117: {
                this.a(v.c, this.a(m2));
                break;
            }
            case 118: {
                this.a(v.h, this.a(m2));
                break;
            }
            case 119: {
                this.a(v.a, this.a(m2));
                break;
            }
            case 120: {
                this.d(v.g, m2);
                break;
            }
            case 121: {
                this.d(v.c, m2);
                break;
            }
            case 122: {
                this.d(v.g, m2);
                break;
            }
            case 123: {
                this.d(v.c, m2);
                break;
            }
            case 124: {
                this.d(v.g, m2);
                break;
            }
            case 125: {
                this.d(v.c, m2);
                break;
            }
            case 126: {
                this.c(v.g, m2);
                break;
            }
            case 127: {
                this.c(v.c, m2);
                break;
            }
            case 128: {
                this.c(v.g, m2);
                break;
            }
            case 129: {
                this.c(v.c, m2);
                break;
            }
            case 130: {
                this.c(v.g, m2);
                break;
            }
            case 131: {
                this.c(v.c, m2);
                break;
            }
            case 132: {
                int n8 = b2.c(n2 + 1);
                this.a(v.g, m2.a(n8));
                this.a(n8, v.g, t2);
                break;
            }
            case 133: {
                this.a(v.g, this.b(m2));
                this.e(v.c, m2);
                break;
            }
            case 134: {
                this.a(v.g, this.b(m2));
                this.e(v.h, m2);
                break;
            }
            case 135: {
                this.a(v.g, this.b(m2));
                this.e(v.a, m2);
                break;
            }
            case 136: {
                this.a(v.c, this.b(m2));
                this.e(v.g, m2);
                break;
            }
            case 137: {
                this.a(v.c, this.b(m2));
                this.e(v.h, m2);
                break;
            }
            case 138: {
                this.a(v.c, this.b(m2));
                this.e(v.a, m2);
                break;
            }
            case 139: {
                this.a(v.h, this.b(m2));
                this.e(v.g, m2);
                break;
            }
            case 140: {
                this.a(v.h, this.b(m2));
                this.e(v.c, m2);
                break;
            }
            case 141: {
                this.a(v.h, this.b(m2));
                this.e(v.a, m2);
                break;
            }
            case 142: {
                this.a(v.a, this.b(m2));
                this.e(v.g, m2);
                break;
            }
            case 143: {
                this.a(v.a, this.b(m2));
                this.e(v.c, m2);
                break;
            }
            case 144: {
                this.a(v.a, this.b(m2));
                this.e(v.h, m2);
                break;
            }
            case 145: 
            case 146: 
            case 147: {
                this.a(v.g, m2.d());
                break;
            }
            case 148: {
                this.a(v.c, this.b(m2));
                this.a(v.c, this.b(m2));
                m2.a(v.g);
                break;
            }
            case 149: 
            case 150: {
                this.a(v.h, this.b(m2));
                this.a(v.h, this.b(m2));
                m2.a(v.g);
                break;
            }
            case 151: 
            case 152: {
                this.a(v.a, this.b(m2));
                this.a(v.a, this.b(m2));
                m2.a(v.g);
                break;
            }
            case 153: 
            case 154: 
            case 155: 
            case 156: 
            case 157: 
            case 158: {
                this.a(v.g, this.b(m2));
                break;
            }
            case 159: 
            case 160: 
            case 161: 
            case 162: 
            case 163: 
            case 164: {
                this.a(v.g, this.b(m2));
                this.a(v.g, this.b(m2));
                break;
            }
            case 165: 
            case 166: {
                this.a(v.n, this.b(m2));
                this.a(v.n, this.b(m2));
                break;
            }
            case 167: {
                break;
            }
            case 168: {
                m2.a(v.k);
                break;
            }
            case 169: {
                this.a(v.k, m2.a(b2.c(n2 + 1)));
                break;
            }
            case 170: 
            case 171: 
            case 172: {
                this.a(v.g, this.b(m2));
                break;
            }
            case 173: {
                this.a(v.c, this.b(m2));
                break;
            }
            case 174: {
                this.a(v.h, this.b(m2));
                break;
            }
            case 175: {
                this.a(v.a, this.b(m2));
                break;
            }
            case 176: {
                try {
                    o o2 = T.b(as2.g(), this.b);
                    this.a(v.a(o2), this.b(m2));
                    break;
                }
                catch (ae var7_13) {
                    throw new RuntimeException(var7_13);
                }
            }
            case 177: {
                break;
            }
            case 178: {
                this.a(n3, b2.e(n2 + 1), m2);
                break;
            }
            case 179: {
                this.e(n3, b2.e(n2 + 1), m2);
                break;
            }
            case 180: {
                this.a(n3, b2.e(n2 + 1), m2);
                break;
            }
            case 181: {
                this.e(n3, b2.e(n2 + 1), m2);
                break;
            }
            case 182: 
            case 183: 
            case 184: {
                this.c(n3, b2.e(n2 + 1), m2);
                break;
            }
            case 185: {
                this.b(n3, b2.e(n2 + 1), m2);
                break;
            }
            case 186: {
                this.d(n3, b2.e(n2 + 1), m2);
                break;
            }
            case 187: {
                m2.a(this.d(this.a.d(b2.e(n2 + 1))));
                break;
            }
            case 188: {
                this.a(n2, b2, m2);
                break;
            }
            case 189: {
                this.b(n2, b2, m2);
                break;
            }
            case 190: {
                v v8 = this.b(m2);
                if (!v8.f() && v8 != v.j) {
                    throw new i("Array length passed a non-array [pos = " + n2 + "]: " + v8);
                }
                m2.a(v.g);
                break;
            }
            case 191: {
                this.a(this.e, this.b(m2));
                break;
            }
            case 192: {
                this.a(v.n, this.b(m2));
                m2.a(this.e(this.a.e(b2.e(n2 + 1))));
                break;
            }
            case 193: {
                this.a(v.n, this.b(m2));
                m2.a(v.g);
                break;
            }
            case 194: 
            case 195: {
                this.a(v.n, this.b(m2));
                break;
            }
            case 196: {
                this.a(n2, b2, m2, t2);
                break;
            }
            case 197: {
                this.b(n2, b2, m2);
                break;
            }
            case 198: 
            case 199: {
                this.a(v.n, this.b(m2));
                break;
            }
            case 200: {
                break;
            }
            case 201: {
                m2.a(v.k);
            }
        }
    }

    private v a(v v2) {
        if (v2 == v.f || v2 == v.e || v2 == v.d || v2 == v.b) {
            return v.g;
        }
        return v2;
    }

    private void a(v v2, m m2) throws i {
        v v3 = m2.e();
        v v4 = m2.e();
        if (v4 == v.j) {
            this.a(v.g, v3);
            if (v2 == v.n) {
                this.e(v.j, m2);
            } else {
                this.e(v2, m2);
            }
            return;
        }
        v v5 = v4.d();
        if (v5 == null) {
            throw new i("Not an array! [pos = " + this.di + "]: " + v5);
        }
        v5 = this.a(v5);
        this.a(v2, v5);
        this.a(v.g, v3);
        this.e(v5, m2);
    }

    private void b(v v2, m m2) throws i {
        v v3 = this.b(m2);
        v v4 = m2.e();
        v v5 = m2.e();
        if (v5 == v.j) {
            this.a(v.g, v4);
            return;
        }
        v v6 = v5.d();
        if (v6 == null) {
            throw new i("Not an array! [pos = " + this.di + "]: " + v6);
        }
        v6 = this.a(v6);
        this.a(v2, v6);
        this.a(v.g, v4);
        if (v2 == v.n) {
            this.a(v2, v3);
        } else {
            this.a(v6, v3);
        }
    }

    private void c(v v2, m m2) throws i {
        v v3 = this.b(m2);
        v v4 = this.b(m2);
        this.a(v2, v3);
        this.a(v2, v4);
        this.e(v4, m2);
    }

    private void a(int n2, int n3, m m2) throws i {
        String string = this.a.n(n3);
        v v2 = this.a(this.e(string));
        if (n2 == 180) {
            v v3 = this.d(this.a.k(n3));
            this.a(v3, this.b(m2));
        }
        this.e(v2, m2);
    }

    private void b(int n2, int n3, m m2) throws i {
        String string = this.a.x(n3);
        v[] arrv = this.b(string);
        int n4 = arrv.length;
        while (n4 > 0) {
            this.a(this.a(arrv[--n4]), this.b(m2));
        }
        String string2 = this.a.u(n3);
        v v2 = this.d(string2);
        this.a(v2, this.b(m2));
        v v3 = this.c(string);
        if (v3 != v.i) {
            this.e(this.a(v3), m2);
        }
    }

    private void c(int n2, int n3, m m2) throws i {
        v v2;
        String string = this.a.s(n3);
        v[] arrv = this.b(string);
        int n4 = arrv.length;
        while (n4 > 0) {
            this.a(this.a(arrv[--n4]), this.b(m2));
        }
        if (n2 != 184) {
            v2 = this.d(this.a.p(n3));
            this.a(v2, this.b(m2));
        }
        if ((v2 = this.c(string)) != v.i) {
            this.e(this.a(v2), m2);
        }
    }

    private void d(int n2, int n3, m m2) throws i {
        String string = this.a.K(n3);
        v[] arrv = this.b(string);
        int n4 = arrv.length;
        while (n4 > 0) {
            this.a(this.a(arrv[--n4]), this.b(m2));
        }
        v v2 = this.c(string);
        if (v2 != v.i) {
            this.e(this.a(v2), m2);
        }
    }

    private void a(int n2, m m2) throws i {
        v v2;
        int n3 = this.a.c(n2);
        switch (n3) {
            case 8: {
                v2 = this.c;
                break;
            }
            case 3: {
                v2 = v.g;
                break;
            }
            case 4: {
                v2 = v.h;
                break;
            }
            case 5: {
                v2 = v.c;
                break;
            }
            case 6: {
                v2 = v.a;
                break;
            }
            case 7: {
                v2 = this.d;
                break;
            }
            default: {
                throw new i("bad LDC [pos = " + this.di + "]: " + n3);
            }
        }
        this.e(v2, m2);
    }

    private void a(v v2, int n2, m m2, t t2) throws i {
        v v3 = m2.a(n2);
        this.a(v2, v3);
        this.e(v3, m2);
        this.a(n2, v3, t2);
    }

    private void a(int n2, B b2, m m2) throws i {
        this.a(v.g, this.b(m2));
        v v2 = null;
        int n3 = b2.c(n2 + 1);
        switch (n3) {
            case 4: {
                v2 = this.a("boolean[]");
                break;
            }
            case 5: {
                v2 = this.a("char[]");
                break;
            }
            case 8: {
                v2 = this.a("byte[]");
                break;
            }
            case 9: {
                v2 = this.a("short[]");
                break;
            }
            case 10: {
                v2 = this.a("int[]");
                break;
            }
            case 11: {
                v2 = this.a("long[]");
                break;
            }
            case 6: {
                v2 = this.a("float[]");
                break;
            }
            case 7: {
                v2 = this.a("double[]");
                break;
            }
            default: {
                throw new i("Invalid array type [pos = " + n2 + "]: " + n3);
            }
        }
        m2.a(v2);
    }

    private void b(int n2, B b2, m m2) throws i {
        int n3;
        v v2 = this.d(this.a.d(b2.e(n2 + 1)));
        String string = v2.a().s();
        int n4 = b2.c(n2);
        if (n4 == 197) {
            n3 = b2.c(n2 + 3);
        } else {
            string = string + "[]";
            n3 = 1;
        }
        while (n3-- > 0) {
            this.a(v.g, this.b(m2));
        }
        this.e(this.a(string), m2);
    }

    private void e(int n2, int n3, m m2) throws i {
        String string = this.a.n(n3);
        v v2 = this.a(this.e(string));
        this.a(v2, this.b(m2));
        if (n2 == 181) {
            v v3 = this.d(this.a.k(n3));
            this.a(v3, this.b(m2));
        }
    }

    private void d(v v2, m m2) throws i {
        v v3 = this.b(m2);
        v v4 = this.b(m2);
        this.a(v.g, v3);
        this.a(v2, v4);
        this.e(v4, m2);
    }

    private void b(v v2, int n2, m m2, t t2) throws i {
        v v3 = this.b(m2);
        if (v2 != v.n || v3 != v.k) {
            this.a(v2, v3);
        }
        this.a(n2, v3, m2);
        this.a(n2, v3, t2);
    }

    private void a(int n2, B b2, m m2, t t2) throws i {
        int n3 = b2.c(n2 + 1);
        int n4 = b2.e(n2 + 2);
        switch (n3) {
            case 21: {
                this.a(v.g, n4, m2, t2);
                break;
            }
            case 22: {
                this.a(v.c, n4, m2, t2);
                break;
            }
            case 23: {
                this.a(v.h, n4, m2, t2);
                break;
            }
            case 24: {
                this.a(v.a, n4, m2, t2);
                break;
            }
            case 25: {
                this.a(v.n, n4, m2, t2);
                break;
            }
            case 54: {
                this.b(v.g, n4, m2, t2);
                break;
            }
            case 55: {
                this.b(v.c, n4, m2, t2);
                break;
            }
            case 56: {
                this.b(v.h, n4, m2, t2);
                break;
            }
            case 57: {
                this.b(v.a, n4, m2, t2);
                break;
            }
            case 58: {
                this.b(v.n, n4, m2, t2);
                break;
            }
            case 132: {
                this.a(v.g, m2.a(n4));
                break;
            }
            case 169: {
                this.a(v.k, m2.a(n4));
                break;
            }
            default: {
                throw new i("Invalid WIDE operand [pos = " + n2 + "]: " + n3);
            }
        }
    }

    private v a(String string) throws i {
        try {
            return v.a(this.b.f(string));
        }
        catch (ae var2_2) {
            throw new i("Could not find class [pos = " + this.di + "]: " + string);
        }
    }

    private v[] b(String string) throws i {
        o[] arro = null;
        try {
            arro = T.a(string, this.b);
        }
        catch (ae var3_3) {
            throw new i("Could not find class in descriptor [pos = " + this.di + "]: " + var3_3.getMessage());
        }
        if (arro == null) {
            throw new i("Could not obtain parameters for descriptor [pos = " + this.di + "]: " + string);
        }
        v[] arrv = new v[arro.length];
        for (int i2 = 0; i2 < arrv.length; ++i2) {
            arrv[i2] = v.a(arro[i2]);
        }
        return arrv;
    }

    private v c(String string) throws i {
        o o2 = null;
        try {
            o2 = T.b(string, this.b);
        }
        catch (ae var3_3) {
            throw new i("Could not find class in descriptor [pos = " + this.di + "]: " + var3_3.getMessage());
        }
        if (o2 == null) {
            throw new i("Could not obtain return type for descriptor [pos = " + this.di + "]: " + string);
        }
        return v.a(o2);
    }

    private v a(m m2) {
        v v2 = m2.d();
        return v2 == v.l ? m2.b(m2.b() - 1) : v2;
    }

    private v b(m m2) {
        v v2 = m2.e();
        return v2 == v.l ? m2.e() : v2;
    }

    private void e(v v2, m m2) {
        m2.a(v2);
        if (v2.e() == 2) {
            m2.a(v.l);
        }
    }

    private void a(int n2, v v2, t t2) {
        if (t2 == null) {
            return;
        }
        t2.b(n2);
        if (v2.e() == 2) {
            t2.b(n2 + 1);
        }
    }

    private void a(int n2, v v2, m m2) {
        m2.a(n2, v2);
        if (v2.e() == 2) {
            m2.a(n2 + 1, v.l);
        }
    }

    private v d(String string) throws i {
        o o2 = null;
        try {
            o2 = string.charAt(0) == '[' ? T.c(string, this.b) : this.b.f(string);
        }
        catch (ae var3_3) {
            throw new i("Could not find class in descriptor [pos = " + this.di + "]: " + var3_3.getMessage());
        }
        if (o2 == null) {
            throw new i("Could not obtain type for descriptor [pos = " + this.di + "]: " + string);
        }
        return v.a(o2);
    }

    private v e(String string) throws i {
        o o2 = null;
        try {
            o2 = T.c(string, this.b);
        }
        catch (ae var3_3) {
            throw new i("Could not find class in descriptor [pos = " + this.di + "]: " + var3_3.getMessage());
        }
        if (o2 == null) {
            throw new i("Could not obtain type for descriptor [pos = " + this.di + "]: " + string);
        }
        return v.a(o2);
    }

    private void a(v v2, v v3) throws i {
        if (!v2.a(v3)) {
            throw new i("Expected type: " + v2 + " Got: " + v3 + " [pos = " + this.di + "]");
        }
    }
}

