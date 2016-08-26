/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a;

import com.growingio.d.a.g;
import com.growingio.d.a.o;
import com.growingio.d.a.p;
import com.growingio.d.a.u;

final class l {
    static final int a = -268435456;
    static final int b = 268435456;
    static final int c = -268435456;
    static final int d = 251658240;
    static final int e = 8388608;
    static final int f = 8388607;
    static final int g = 267386880;
    static final int h = 1048575;
    static final int i = 16777216;
    static final int j = 24117248;
    static final int k = 25165824;
    private static final int A = 33554432;
    private static final int B = 50331648;
    static final int l = 16777216;
    static final int m = 16777225;
    static final int n = 16777226;
    static final int o = 16777227;
    static final int p = 16777228;
    static final int q = 16777217;
    static final int r = 16777218;
    static final int s = 16777219;
    static final int t = 16777220;
    static final int u = 16777221;
    static final int v = 16777222;
    static final int[] w;
    p x;
    int[] y;
    int[] z;
    private int[] C;
    private int[] D;
    private int E;
    private int F;
    private int[] G;

    l() {
    }

    private int a(int n2) {
        if (this.C == null || n2 >= this.C.length) {
            return 33554432 | n2;
        }
        int n3 = this.C[n2];
        if (n3 == 0) {
            n3 = this.C[n2] = 33554432 | n2;
        }
        return n3;
    }

    private void a(int n2, int n3) {
        int n4;
        if (this.C == null) {
            this.C = new int[10];
        }
        if (n2 >= (n4 = this.C.length)) {
            int[] arrn = new int[Math.max(n2 + 1, 2 * n4)];
            System.arraycopy(this.C, 0, arrn, 0, n4);
            this.C = arrn;
        }
        this.C[n2] = n3;
    }

    private void b(int n2) {
        int n3;
        if (this.D == null) {
            this.D = new int[10];
        }
        if (this.E >= (n3 = this.D.length)) {
            int[] arrn = new int[Math.max(this.E + 1, 2 * n3)];
            System.arraycopy(this.D, 0, arrn, 0, n3);
            this.D = arrn;
        }
        this.D[this.E++] = n2;
        int n4 = this.x.q + this.E;
        if (n4 > this.x.r) {
            this.x.r = n4;
        }
    }

    private void a(g g2, String string) {
        int n2 = l.b(g2, string);
        if (n2 != 0) {
            this.b(n2);
            if (n2 == 16777220 || n2 == 16777219) {
                this.b(16777216);
            }
        }
    }

    private static int b(g g2, String string) {
        int n2;
        int n3 = string.charAt(0) == '(' ? string.indexOf(41) + 1 : 0;
        switch (string.charAt(n3)) {
            case 'V': {
                return 0;
            }
            case 'B': 
            case 'C': 
            case 'I': 
            case 'S': 
            case 'Z': {
                return 16777217;
            }
            case 'F': {
                return 16777218;
            }
            case 'J': {
                return 16777220;
            }
            case 'D': {
                return 16777219;
            }
            case 'L': {
                String string2 = string.substring(n3 + 1, string.length() - 1);
                return 24117248 | g2.f(string2);
            }
        }
        int n4 = n3 + 1;
        while (string.charAt(n4) == '[') {
            ++n4;
        }
        switch (string.charAt(n4)) {
            case 'Z': {
                n2 = 16777225;
                break;
            }
            case 'C': {
                n2 = 16777227;
                break;
            }
            case 'B': {
                n2 = 16777226;
                break;
            }
            case 'S': {
                n2 = 16777228;
                break;
            }
            case 'I': {
                n2 = 16777217;
                break;
            }
            case 'F': {
                n2 = 16777218;
                break;
            }
            case 'J': {
                n2 = 16777220;
                break;
            }
            case 'D': {
                n2 = 16777219;
                break;
            }
            default: {
                String string3 = string.substring(n4 + 1, string.length() - 1);
                n2 = 24117248 | g2.f(string3);
            }
        }
        return n4 - n3 << 28 | n2;
    }

    private int a() {
        if (this.E > 0) {
            return this.D[--this.E];
        }
        return 50331648 | - --this.x.q;
    }

    private void c(int n2) {
        if (this.E >= n2) {
            this.E -= n2;
        } else {
            this.x.q -= n2 - this.E;
            this.E = 0;
        }
    }

    private void a(String string) {
        char c2 = string.charAt(0);
        if (c2 == '(') {
            this.c((u.f(string) >> 2) - 1);
        } else if (c2 == 'J' || c2 == 'D') {
            this.c(2);
        } else {
            this.c(1);
        }
    }

    private void d(int n2) {
        int n3;
        if (this.G == null) {
            this.G = new int[2];
        }
        if (this.F >= (n3 = this.G.length)) {
            int[] arrn = new int[Math.max(this.F + 1, 2 * n3)];
            System.arraycopy(this.G, 0, arrn, 0, n3);
            this.G = arrn;
        }
        this.G[this.F++] = n2;
    }

    private int a(g g2, int n2) {
        int n3;
        if (n2 == 16777222) {
            n3 = 24117248 | g2.f(g2.ad);
        } else if ((n2 & -1048576) == 25165824) {
            String string = g2.ac[n2 & 1048575].e;
            n3 = 24117248 | g2.f(string);
        } else {
            return n2;
        }
        for (int i2 = 0; i2 < this.F; ++i2) {
            int n4 = this.G[i2];
            int n5 = n4 & -268435456;
            int n6 = n4 & 251658240;
            if (n6 == 33554432) {
                n4 = n5 + this.y[n4 & 8388607];
            } else if (n6 == 50331648) {
                n4 = n5 + this.z[this.z.length - (n4 & 8388607)];
            }
            if (n2 != n4) continue;
            return n3;
        }
        return n2;
    }

    void a(g g2, int n2, u[] arru, int n3) {
        this.y = new int[n3];
        this.z = new int[0];
        int n4 = 0;
        if ((n2 & 8) == 0) {
            this.y[n4++] = (n2 & 524288) == 0 ? 24117248 | g2.f(g2.ad) : 16777222;
        }
        for (int i2 = 0; i2 < arru.length; ++i2) {
            int n5 = l.b(g2, arru[i2].i());
            this.y[n4++] = n5;
            if (n5 != 16777220 && n5 != 16777219) continue;
            this.y[n4++] = 16777216;
        }
        while (n4 < n3) {
            this.y[n4++] = 16777216;
        }
    }

    void a(int n2, int n3, g g2, o o2) {
        block0 : switch (n2) {
            case 0: 
            case 116: 
            case 117: 
            case 118: 
            case 119: 
            case 145: 
            case 146: 
            case 147: 
            case 167: 
            case 177: {
                break;
            }
            case 1: {
                this.b(16777221);
                break;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 16: 
            case 17: 
            case 21: {
                this.b(16777217);
                break;
            }
            case 9: 
            case 10: 
            case 22: {
                this.b(16777220);
                this.b(16777216);
                break;
            }
            case 11: 
            case 12: 
            case 13: 
            case 23: {
                this.b(16777218);
                break;
            }
            case 14: 
            case 15: 
            case 24: {
                this.b(16777219);
                this.b(16777216);
                break;
            }
            case 18: {
                switch (o2.b) {
                    case 3: {
                        this.b(16777217);
                        break block0;
                    }
                    case 5: {
                        this.b(16777220);
                        this.b(16777216);
                        break block0;
                    }
                    case 4: {
                        this.b(16777218);
                        break block0;
                    }
                    case 6: {
                        this.b(16777219);
                        this.b(16777216);
                        break block0;
                    }
                    case 7: {
                        this.b(24117248 | g2.f("java/lang/Class"));
                        break block0;
                    }
                    case 8: {
                        this.b(24117248 | g2.f("java/lang/String"));
                        break block0;
                    }
                    case 16: {
                        this.b(24117248 | g2.f("java/lang/invoke/MethodType"));
                        break block0;
                    }
                }
                this.b(24117248 | g2.f("java/lang/invoke/MethodHandle"));
                break;
            }
            case 25: {
                this.b(this.a(n3));
                break;
            }
            case 46: 
            case 51: 
            case 52: 
            case 53: {
                this.c(2);
                this.b(16777217);
                break;
            }
            case 47: 
            case 143: {
                this.c(2);
                this.b(16777220);
                this.b(16777216);
                break;
            }
            case 48: {
                this.c(2);
                this.b(16777218);
                break;
            }
            case 49: 
            case 138: {
                this.c(2);
                this.b(16777219);
                this.b(16777216);
                break;
            }
            case 50: {
                this.c(1);
                int n4 = this.a();
                this.b(-268435456 + n4);
                break;
            }
            case 54: 
            case 56: 
            case 58: {
                int n5 = this.a();
                this.a(n3, n5);
                if (n3 <= 0) break;
                int n6 = this.a(n3 - 1);
                if (n6 == 16777220 || n6 == 16777219) {
                    this.a(n3 - 1, 16777216);
                    break;
                }
                if ((n6 & 251658240) == 16777216) break;
                this.a(n3 - 1, n6 | 8388608);
                break;
            }
            case 55: 
            case 57: {
                this.c(1);
                int n7 = this.a();
                this.a(n3, n7);
                this.a(n3 + 1, 16777216);
                if (n3 <= 0) break;
                int n8 = this.a(n3 - 1);
                if (n8 == 16777220 || n8 == 16777219) {
                    this.a(n3 - 1, 16777216);
                    break;
                }
                if ((n8 & 251658240) == 16777216) break;
                this.a(n3 - 1, n8 | 8388608);
                break;
            }
            case 79: 
            case 81: 
            case 83: 
            case 84: 
            case 85: 
            case 86: {
                this.c(3);
                break;
            }
            case 80: 
            case 82: {
                this.c(4);
                break;
            }
            case 87: 
            case 153: 
            case 154: 
            case 155: 
            case 156: 
            case 157: 
            case 158: 
            case 170: 
            case 171: 
            case 172: 
            case 174: 
            case 176: 
            case 191: 
            case 194: 
            case 195: 
            case 198: 
            case 199: {
                this.c(1);
                break;
            }
            case 88: 
            case 159: 
            case 160: 
            case 161: 
            case 162: 
            case 163: 
            case 164: 
            case 165: 
            case 166: 
            case 173: 
            case 175: {
                this.c(2);
                break;
            }
            case 89: {
                int n9 = this.a();
                this.b(n9);
                this.b(n9);
                break;
            }
            case 90: {
                int n10 = this.a();
                int n11 = this.a();
                this.b(n10);
                this.b(n11);
                this.b(n10);
                break;
            }
            case 91: {
                int n12 = this.a();
                int n13 = this.a();
                int n14 = this.a();
                this.b(n12);
                this.b(n14);
                this.b(n13);
                this.b(n12);
                break;
            }
            case 92: {
                int n15 = this.a();
                int n16 = this.a();
                this.b(n16);
                this.b(n15);
                this.b(n16);
                this.b(n15);
                break;
            }
            case 93: {
                int n17 = this.a();
                int n18 = this.a();
                int n19 = this.a();
                this.b(n18);
                this.b(n17);
                this.b(n19);
                this.b(n18);
                this.b(n17);
                break;
            }
            case 94: {
                int n20 = this.a();
                int n21 = this.a();
                int n22 = this.a();
                int n23 = this.a();
                this.b(n21);
                this.b(n20);
                this.b(n23);
                this.b(n22);
                this.b(n21);
                this.b(n20);
                break;
            }
            case 95: {
                int n24 = this.a();
                int n25 = this.a();
                this.b(n24);
                this.b(n25);
                break;
            }
            case 96: 
            case 100: 
            case 104: 
            case 108: 
            case 112: 
            case 120: 
            case 122: 
            case 124: 
            case 126: 
            case 128: 
            case 130: 
            case 136: 
            case 142: 
            case 149: 
            case 150: {
                this.c(2);
                this.b(16777217);
                break;
            }
            case 97: 
            case 101: 
            case 105: 
            case 109: 
            case 113: 
            case 127: 
            case 129: 
            case 131: {
                this.c(4);
                this.b(16777220);
                this.b(16777216);
                break;
            }
            case 98: 
            case 102: 
            case 106: 
            case 110: 
            case 114: 
            case 137: 
            case 144: {
                this.c(2);
                this.b(16777218);
                break;
            }
            case 99: 
            case 103: 
            case 107: 
            case 111: 
            case 115: {
                this.c(4);
                this.b(16777219);
                this.b(16777216);
                break;
            }
            case 121: 
            case 123: 
            case 125: {
                this.c(3);
                this.b(16777220);
                this.b(16777216);
                break;
            }
            case 132: {
                this.a(n3, 16777217);
                break;
            }
            case 133: 
            case 140: {
                this.c(1);
                this.b(16777220);
                this.b(16777216);
                break;
            }
            case 134: {
                this.c(1);
                this.b(16777218);
                break;
            }
            case 135: 
            case 141: {
                this.c(1);
                this.b(16777219);
                this.b(16777216);
                break;
            }
            case 139: 
            case 190: 
            case 193: {
                this.c(1);
                this.b(16777217);
                break;
            }
            case 148: 
            case 151: 
            case 152: {
                this.c(4);
                this.b(16777217);
                break;
            }
            case 168: 
            case 169: {
                throw new RuntimeException("JSR/RET are not supported with computeFrames option");
            }
            case 178: {
                this.a(g2, o2.g);
                break;
            }
            case 179: {
                this.a(o2.g);
                break;
            }
            case 180: {
                this.c(1);
                this.a(g2, o2.g);
                break;
            }
            case 181: {
                this.a(o2.g);
                this.a();
                break;
            }
            case 182: 
            case 183: 
            case 184: 
            case 185: {
                this.a(o2.g);
                if (n2 != 184) {
                    int n26 = this.a();
                    if (n2 == 183 && o2.f.charAt(0) == '<') {
                        this.d(n26);
                    }
                }
                this.a(g2, o2.g);
                break;
            }
            case 186: {
                this.a(o2.f);
                this.a(g2, o2.f);
                break;
            }
            case 187: {
                this.b(25165824 | g2.a(o2.e, n3));
                break;
            }
            case 188: {
                this.a();
                switch (n3) {
                    case 4: {
                        this.b(285212681);
                        break block0;
                    }
                    case 5: {
                        this.b(285212683);
                        break block0;
                    }
                    case 8: {
                        this.b(285212682);
                        break block0;
                    }
                    case 9: {
                        this.b(285212684);
                        break block0;
                    }
                    case 10: {
                        this.b(285212673);
                        break block0;
                    }
                    case 6: {
                        this.b(285212674);
                        break block0;
                    }
                    case 7: {
                        this.b(285212675);
                        break block0;
                    }
                }
                this.b(285212676);
                break;
            }
            case 189: {
                String string = o2.e;
                this.a();
                if (string.charAt(0) == '[') {
                    this.a(g2, "" + '[' + string);
                    break;
                }
                this.b(292552704 | g2.f(string));
                break;
            }
            case 192: {
                String string = o2.e;
                this.a();
                if (string.charAt(0) == '[') {
                    this.a(g2, string);
                    break;
                }
                this.b(24117248 | g2.f(string));
                break;
            }
            default: {
                this.c(n3);
                this.a(g2, o2.e);
            }
        }
    }

    boolean a(g g2, l l2, int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        boolean bl2 = false;
        int n8 = this.y.length;
        int n9 = this.z.length;
        if (l2.y == null) {
            l2.y = new int[n8];
            bl2 = true;
        }
        for (n5 = 0; n5 < n8; ++n5) {
            if (this.C != null && n5 < this.C.length) {
                n7 = this.C[n5];
                if (n7 == 0) {
                    n4 = this.y[n5];
                } else {
                    n6 = n7 & -268435456;
                    n3 = n7 & 251658240;
                    if (n3 == 16777216) {
                        n4 = n7;
                    } else {
                        n4 = n3 == 33554432 ? n6 + this.y[n7 & 8388607] : n6 + this.z[n9 - (n7 & 8388607)];
                        if ((n7 & 8388608) != 0 && (n4 == 16777220 || n4 == 16777219)) {
                            n4 = 16777216;
                        }
                    }
                }
            } else {
                n4 = this.y[n5];
            }
            if (this.G != null) {
                n4 = this.a(g2, n4);
            }
            bl2 |= l.a(g2, n4, l2.y, n5);
        }
        if (n2 > 0) {
            for (n5 = 0; n5 < n8; ++n5) {
                n4 = this.y[n5];
                bl2 |= l.a(g2, n4, l2.y, n5);
            }
            if (l2.z == null) {
                l2.z = new int[1];
                bl2 = true;
            }
            return bl2 |= l.a(g2, n2, l2.z, 0);
        }
        int n10 = this.z.length + this.x.q;
        if (l2.z == null) {
            l2.z = new int[n10 + this.E];
            bl2 = true;
        }
        for (n5 = 0; n5 < n10; ++n5) {
            n4 = this.z[n5];
            if (this.G != null) {
                n4 = this.a(g2, n4);
            }
            bl2 |= l.a(g2, n4, l2.z, n5);
        }
        for (n5 = 0; n5 < this.E; ++n5) {
            n7 = this.D[n5];
            n6 = n7 & -268435456;
            n3 = n7 & 251658240;
            if (n3 == 16777216) {
                n4 = n7;
            } else {
                n4 = n3 == 33554432 ? n6 + this.y[n7 & 8388607] : n6 + this.z[n9 - (n7 & 8388607)];
                if ((n7 & 8388608) != 0 && (n4 == 16777220 || n4 == 16777219)) {
                    n4 = 16777216;
                }
            }
            if (this.G != null) {
                n4 = this.a(g2, n4);
            }
            bl2 |= l.a(g2, n4, l2.z, n10 + n5);
        }
        return bl2;
    }

    private static boolean a(g g2, int n2, int[] arrn, int n3) {
        int n4;
        int n5 = arrn[n3];
        if (n5 == n2) {
            return false;
        }
        if ((n2 & 268435455) == 16777221) {
            if (n5 == 16777221) {
                return false;
            }
            n2 = 16777221;
        }
        if (n5 == 0) {
            arrn[n3] = n2;
            return true;
        }
        if ((n5 & 267386880) == 24117248 || (n5 & -268435456) != 0) {
            if (n2 == 16777221) {
                return false;
            }
            if ((n2 & -1048576) == (n5 & -1048576)) {
                if ((n5 & 267386880) == 24117248) {
                    n4 = n2 & -268435456 | 24117248 | g2.a(n2 & 1048575, n5 & 1048575);
                } else {
                    int n6 = -268435456 + (n5 & -268435456);
                    n4 = n6 | 24117248 | g2.f("java/lang/Object");
                }
            } else if ((n2 & 267386880) == 24117248 || (n2 & -268435456) != 0) {
                int n7 = ((n2 & -268435456) == 0 || (n2 & 267386880) == 24117248 ? 0 : -268435456) + (n2 & -268435456);
                int n8 = ((n5 & -268435456) == 0 || (n5 & 267386880) == 24117248 ? 0 : -268435456) + (n5 & -268435456);
                n4 = Math.min(n7, n8) | 24117248 | g2.f("java/lang/Object");
            } else {
                n4 = 16777216;
            }
        } else {
            n4 = n5 == 16777221 ? ((n2 & 267386880) == 24117248 || (n2 & -268435456) != 0 ? n2 : 16777216) : 16777216;
        }
        if (n5 != n4) {
            arrn[n3] = n4;
            return true;
        }
        return false;
    }

    static {
        int[] arrn = new int[202];
        String string = "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE";
        for (int i2 = 0; i2 < arrn.length; ++i2) {
            arrn[i2] = string.charAt(i2) - 69;
        }
        w = arrn;
    }
}

