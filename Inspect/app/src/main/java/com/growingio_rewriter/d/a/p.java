/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a;

import com.growingio.d.a.d;
import com.growingio.d.a.i;
import com.growingio.d.a.l;
import com.growingio.d.a.s;

public class p {
    static final int a = 1;
    static final int b = 2;
    static final int c = 4;
    static final int d = 8;
    static final int e = 16;
    static final int f = 32;
    static final int g = 64;
    static final int h = 128;
    static final int i = 256;
    static final int j = 512;
    static final int k = 1024;
    static final int l = 2048;
    public Object m;
    int n;
    int o;
    int p;
    private int w;
    private int[] x;
    int q;
    int r;
    l s;
    p t;
    i u;
    p v;

    public int a() {
        if ((this.n & 2) == 0) {
            throw new IllegalStateException("Label offset position has not been resolved yet");
        }
        return this.p;
    }

    void a(s s2, d d2, int n2, boolean bl2) {
        if ((this.n & 2) == 0) {
            if (bl2) {
                this.a(-1 - n2, d2.b);
                d2.c(-1);
            } else {
                this.a(n2, d2.b);
                d2.b(-1);
            }
        } else if (bl2) {
            d2.c(this.p - n2);
        } else {
            d2.b(this.p - n2);
        }
    }

    private void a(int n2, int n3) {
        if (this.x == null) {
            this.x = new int[6];
        }
        if (this.w >= this.x.length) {
            int[] arrn = new int[this.x.length + 6];
            System.arraycopy(this.x, 0, arrn, 0, this.x.length);
            this.x = arrn;
        }
        this.x[this.w++] = n2;
        this.x[this.w++] = n3;
    }

    boolean a(s s2, int n2, byte[] arrby) {
        boolean bl2 = false;
        this.n |= 2;
        this.p = n2;
        int n3 = 0;
        while (n3 < this.w) {
            int n4;
            int n5 = this.x[n3++];
            int n6 = this.x[n3++];
            if (n5 >= 0) {
                n4 = n2 - n5;
                if (n4 < -32768 || n4 > 32767) {
                    int n7 = arrby[n6 - 1] & 255;
                    arrby[n6 - 1] = n7 <= 168 ? (byte)(n7 + 49) : (byte)(n7 + 20);
                    bl2 = true;
                }
                arrby[n6++] = (byte)(n4 >>> 8);
                arrby[n6] = (byte)n4;
                continue;
            }
            n4 = n2 + n5 + 1;
            arrby[n6++] = (byte)(n4 >>> 24);
            arrby[n6++] = (byte)(n4 >>> 16);
            arrby[n6++] = (byte)(n4 >>> 8);
            arrby[n6] = (byte)n4;
        }
        return bl2;
    }

    p b() {
        return this.s == null ? this : this.s.x;
    }

    boolean a(long l2) {
        if ((this.n & 1024) != 0) {
            return (this.x[(int)(l2 >>> 32)] & (int)l2) != 0;
        }
        return false;
    }

    boolean a(p p2) {
        if ((this.n & 1024) == 0 || (p2.n & 1024) == 0) {
            return false;
        }
        for (int i2 = 0; i2 < this.x.length; ++i2) {
            if ((this.x[i2] & p2.x[i2]) == 0) continue;
            return true;
        }
        return false;
    }

    void a(long l2, int n2) {
        if ((this.n & 1024) == 0) {
            this.n |= 1024;
            this.x = new int[n2 / 32 + 1];
        }
        int[] arrn = this.x;
        int n3 = (int)(l2 >>> 32);
        arrn[n3] = arrn[n3] | (int)l2;
    }

    void a(p p2, long l2, int n2) {
        p p3 = this;
        while (p3 != null) {
            i i2;
            p p4 = p3;
            p3 = p4.v;
            p4.v = null;
            if (p2 != null) {
                if ((p4.n & 2048) != 0) continue;
                p4.n |= 2048;
                if ((p4.n & 256) != 0 && !p4.a(p2)) {
                    i2 = new i();
                    i2.c = p4.q;
                    i2.d = p2.u.d;
                    i2.e = p4.u;
                    p4.u = i2;
                }
            } else {
                if (p4.a(l2)) continue;
                p4.a(l2, n2);
            }
            i2 = p4.u;
            while (i2 != null) {
                if (((p4.n & 128) == 0 || i2 != p4.u.e) && i2.d.v == null) {
                    i2.d.v = p3;
                    p3 = i2.d;
                }
                i2 = i2.e;
            }
        }
    }

    public String toString() {
        return "L" + System.identityHashCode(this);
    }
}

