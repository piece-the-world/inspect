/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a;

import com.growingio.d.a.a;
import com.growingio.d.a.d;
import com.growingio.d.a.g;
import com.growingio.d.a.o;
import com.growingio.d.a.u;
import com.growingio.d.a.v;

final class b
extends a {
    private final g e;
    private int f;
    private final boolean g;
    private final d h;
    private final d i;
    private final int j;
    b a;
    b b;

    b(g g2, boolean bl2, d d2, d d3, int n2) {
        super(327680);
        this.e = g2;
        this.g = bl2;
        this.h = d2;
        this.i = d3;
        this.j = n2;
    }

    @Override
    public void a(String string, Object object) {
        ++this.f;
        if (this.g) {
            this.h.b(this.e.a(string));
        }
        if (object instanceof String) {
            this.h.b(115, this.e.a((String)object));
        } else if (object instanceof Byte) {
            this.h.b(66, this.e.a((int)((Byte)object).byteValue()).a);
        } else if (object instanceof Boolean) {
            int n2 = (Boolean)object != false ? 1 : 0;
            this.h.b(90, this.e.a((int)n2).a);
        } else if (object instanceof Character) {
            this.h.b(67, this.e.a((int)((Character)object).charValue()).a);
        } else if (object instanceof Short) {
            this.h.b(83, this.e.a((int)((Short)object).shortValue()).a);
        } else if (object instanceof u) {
            this.h.b(99, this.e.a(((u)object).i()));
        } else if (object instanceof byte[]) {
            byte[] arrby = (byte[])object;
            this.h.b(91, arrby.length);
            for (int i2 = 0; i2 < arrby.length; ++i2) {
                this.h.b(66, this.e.a((int)arrby[i2]).a);
            }
        } else if (object instanceof boolean[]) {
            boolean[] arrbl = (boolean[])object;
            this.h.b(91, arrbl.length);
            for (int i3 = 0; i3 < arrbl.length; ++i3) {
                this.h.b(90, this.e.a((int)(arrbl[i3] != false ? 1 : 0)).a);
            }
        } else if (object instanceof short[]) {
            short[] arrs = (short[])object;
            this.h.b(91, arrs.length);
            for (int i4 = 0; i4 < arrs.length; ++i4) {
                this.h.b(83, this.e.a((int)arrs[i4]).a);
            }
        } else if (object instanceof char[]) {
            char[] arrc = (char[])object;
            this.h.b(91, arrc.length);
            for (int i5 = 0; i5 < arrc.length; ++i5) {
                this.h.b(67, this.e.a((int)arrc[i5]).a);
            }
        } else if (object instanceof int[]) {
            int[] arrn = (int[])object;
            this.h.b(91, arrn.length);
            for (int i6 = 0; i6 < arrn.length; ++i6) {
                this.h.b(73, this.e.a((int)arrn[i6]).a);
            }
        } else if (object instanceof long[]) {
            long[] arrl = (long[])object;
            this.h.b(91, arrl.length);
            for (int i7 = 0; i7 < arrl.length; ++i7) {
                this.h.b(74, this.e.a((long)arrl[i7]).a);
            }
        } else if (object instanceof float[]) {
            float[] arrf = (float[])object;
            this.h.b(91, arrf.length);
            for (int i8 = 0; i8 < arrf.length; ++i8) {
                this.h.b(70, this.e.a((float)arrf[i8]).a);
            }
        } else if (object instanceof double[]) {
            double[] arrd = (double[])object;
            this.h.b(91, arrd.length);
            for (int i9 = 0; i9 < arrd.length; ++i9) {
                this.h.b(68, this.e.a((double)arrd[i9]).a);
            }
        } else {
            o o2 = this.e.a(object);
            this.h.b(".s.IFJDCS".charAt(o2.b), o2.a);
        }
    }

    @Override
    public void a(String string, String string2, String string3) {
        ++this.f;
        if (this.g) {
            this.h.b(this.e.a(string));
        }
        this.h.b(101, this.e.a(string2)).b(this.e.a(string3));
    }

    @Override
    public a a(String string, String string2) {
        ++this.f;
        if (this.g) {
            this.h.b(this.e.a(string));
        }
        this.h.b(64, this.e.a(string2)).b(0);
        return new b(this.e, true, this.h, this.h, this.h.b - 2);
    }

    @Override
    public a a(String string) {
        ++this.f;
        if (this.g) {
            this.h.b(this.e.a(string));
        }
        this.h.b(91, 0);
        return new b(this.e, false, this.h, this.h, this.h.b - 2);
    }

    @Override
    public void b_() {
        if (this.i != null) {
            byte[] arrby = this.i.a;
            arrby[this.j] = (byte)(this.f >>> 8);
            arrby[this.j + 1] = (byte)this.f;
        }
    }

    int b() {
        int n2 = 0;
        b b2 = this;
        while (b2 != null) {
            n2 += b2.h.b;
            b2 = b2.a;
        }
        return n2;
    }

    void a(d d2) {
        int n2 = 0;
        int n3 = 2;
        b b2 = this;
        b b3 = null;
        while (b2 != null) {
            ++n2;
            n3 += b2.h.b;
            b2.b_();
            b2.b = b3;
            b3 = b2;
            b2 = b2.a;
        }
        d2.c(n3);
        d2.b(n2);
        b2 = b3;
        while (b2 != null) {
            d2.a(b2.h.a, 0, b2.h.b);
            b2 = b2.b;
        }
    }

    static void a(b[] arrb, int n2, d d2) {
        int n3;
        int n4 = 1 + 2 * (arrb.length - n2);
        for (n3 = n2; n3 < arrb.length; ++n3) {
            n4 += arrb[n3] == null ? 0 : arrb[n3].b();
        }
        d2.c(n4).a(arrb.length - n2);
        for (n3 = n2; n3 < arrb.length; ++n3) {
            b b2 = arrb[n3];
            b b3 = null;
            int n5 = 0;
            while (b2 != null) {
                ++n5;
                b2.b_();
                b2.b = b3;
                b3 = b2;
                b2 = b2.a;
            }
            d2.b(n5);
            b2 = b3;
            while (b2 != null) {
                d2.a(b2.h.a, 0, b2.h.b);
                b2 = b2.b;
            }
        }
    }

    static void a(int n2, v v2, d d2) {
        switch (n2 >>> 24) {
            case 0: 
            case 1: 
            case 22: {
                d2.b(n2 >>> 16);
                break;
            }
            case 19: 
            case 20: 
            case 21: {
                d2.a(n2 >>> 24);
                break;
            }
            case 71: 
            case 72: 
            case 73: 
            case 74: 
            case 75: {
                d2.c(n2);
                break;
            }
            default: {
                d2.b(n2 >>> 24, (n2 & 16776960) >> 8);
            }
        }
        if (v2 == null) {
            d2.a(0);
        } else {
            int n3 = v2.e[v2.f] * 2 + 1;
            d2.a(v2.e, v2.f, n3);
        }
    }
}

