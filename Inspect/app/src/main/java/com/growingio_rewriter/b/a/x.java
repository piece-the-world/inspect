/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.B;
import com.growingio.b.a.Q;
import com.growingio.b.a.T;
import com.growingio.b.a.Z;
import com.growingio.b.a.ay;
import com.growingio.b.a.i;
import com.growingio.b.a.y;

class x
implements ay {
    private Q a;
    private y b;

    public x(y y2) {
        this.b = y2;
        this.a = y2.d();
    }

    public int a() throws i {
        int n2;
        boolean bl2;
        B b2 = this.b.k();
        int n3 = b2.d();
        int[] arrn = new int[n3];
        this.a = this.b.d();
        this.a(arrn, this.b);
        do {
            bl2 = false;
            for (n2 = 0; n2 < n3; ++n2) {
                if (arrn[n2] >= 0) continue;
                bl2 = true;
                this.a(b2, arrn, n2);
            }
        } while (bl2);
        n2 = 1;
        for (int i2 = 0; i2 < n3; ++i2) {
            if (arrn[i2] <= n2) continue;
            n2 = arrn[i2];
        }
        return n2 - 1;
    }

    private void a(int[] arrn, y y2) {
        arrn[0] = -1;
        Z z2 = y2.l();
        if (z2 != null) {
            int n2 = z2.a();
            for (int i2 = 0; i2 < n2; ++i2) {
                arrn[z2.c((int)i2)] = -2;
            }
        }
    }

    private void a(B b2, int[] arrn, int n2) throws i {
        int n3 = arrn.length;
        b2.a(n2);
        int n4 = - arrn[n2];
        int[] arrn2 = new int[]{-1};
        while (b2.e()) {
            n2 = b2.f();
            arrn[n2] = n4;
            int n5 = b2.c(n2);
            n4 = this.a(n5, b2, n2, n4);
            if (n4 < 1) {
                throw new i("stack underflow at " + n2);
            }
            if (this.a(n5, b2, n2, n3, arrn, n4, arrn2) || x.a(n5)) break;
            if (n5 != 168 && n5 != 201) continue;
            --n4;
        }
    }

    private boolean a(int n2, B b2, int n3, int n4, int[] arrn, int n5, int[] arrn2) throws i {
        if (153 <= n2 && n2 <= 166 || n2 == 198 || n2 == 199) {
            int n6 = n3 + b2.f(n3 + 1);
            this.a(n3, n6, n4, arrn, n5);
        } else {
            switch (n2) {
                case 167: {
                    int n7 = n3 + b2.f(n3 + 1);
                    this.a(n3, n7, n4, arrn, n5);
                    return true;
                }
                case 200: {
                    int n8 = n3 + b2.g(n3 + 1);
                    this.a(n3, n8, n4, arrn, n5);
                    return true;
                }
                case 168: 
                case 201: {
                    int n9 = n2 == 168 ? n3 + b2.f(n3 + 1) : n3 + b2.g(n3 + 1);
                    this.a(n3, n9, n4, arrn, n5);
                    if (arrn2[0] < 0) {
                        arrn2[0] = n5;
                        return false;
                    }
                    if (n5 == arrn2[0]) {
                        return false;
                    }
                    throw new i("sorry, cannot compute this data flow due to JSR: " + n5 + "," + arrn2[0]);
                }
                case 169: {
                    if (arrn2[0] < 0) {
                        arrn2[0] = n5 + 1;
                        return false;
                    }
                    if (n5 + 1 == arrn2[0]) {
                        return true;
                    }
                    throw new i("sorry, cannot compute this data flow due to RET: " + n5 + "," + arrn2[0]);
                }
                case 170: 
                case 171: {
                    int n10 = (n3 & -4) + 4;
                    int n11 = n3 + b2.g(n10);
                    this.a(n3, n11, n4, arrn, n5);
                    if (n2 == 171) {
                        int n12 = b2.g(n10 + 4);
                        n10 += 12;
                        for (int i2 = 0; i2 < n12; ++i2) {
                            n11 = n3 + b2.g(n10);
                            this.a(n3, n11, n4, arrn, n5);
                            n10 += 8;
                        }
                    } else {
                        int n13 = b2.g(n10 + 4);
                        int n14 = b2.g(n10 + 8);
                        int n15 = n14 - n13 + 1;
                        n10 += 12;
                        for (int i3 = 0; i3 < n15; ++i3) {
                            n11 = n3 + b2.g(n10);
                            this.a(n3, n11, n4, arrn, n5);
                            n10 += 4;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private void a(int n2, int n3, int n4, int[] arrn, int n5) throws i {
        if (n3 < 0 || n4 <= n3) {
            throw new i("bad branch offset at " + n2);
        }
        int n6 = arrn[n3];
        if (n6 == 0) {
            arrn[n3] = - n5;
        } else if (n6 != n5 && n6 != - n5) {
            throw new i("verification error (" + n5 + "," + n6 + ") at " + n2);
        }
    }

    private static boolean a(int n2) {
        return 172 <= n2 && n2 <= 177 || n2 == 191;
    }

    private int a(int n2, B b2, int n3, int n4) throws i {
        switch (n2) {
            case 180: {
                n4 += this.a(b2, n3) - 1;
                break;
            }
            case 181: {
                n4 -= this.a(b2, n3) + 1;
                break;
            }
            case 178: {
                n4 += this.a(b2, n3);
                break;
            }
            case 179: {
                n4 -= this.a(b2, n3);
                break;
            }
            case 182: 
            case 183: {
                String string = this.a.s(b2.e(n3 + 1));
                n4 += T.h(string) - 1;
                break;
            }
            case 184: {
                String string = this.a.s(b2.e(n3 + 1));
                n4 += T.h(string);
                break;
            }
            case 185: {
                String string = this.a.x(b2.e(n3 + 1));
                n4 += T.h(string) - 1;
                break;
            }
            case 186: {
                String string = this.a.K(b2.e(n3 + 1));
                n4 += T.h(string);
                break;
            }
            case 191: {
                n4 = 1;
                break;
            }
            case 197: {
                n4 += 1 - b2.c(n3 + 3);
                break;
            }
            case 196: {
                n2 = b2.c(n3 + 1);
            }
            default: {
                n4 += dh[n2];
            }
        }
        return n4;
    }

    private int a(B b2, int n2) {
        String string = this.a.n(b2.e(n2 + 1));
        return T.h(string);
    }
}

