/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.b;

import com.growingio.d.a.b.e;
import com.growingio.d.a.b.f;
import com.growingio.d.a.u;

public class a
extends com.growingio.d.a.a {
    private final f a;

    public a(com.growingio.d.a.a a2, f f2) {
        super(327680, a2);
        this.a = f2;
    }

    @Override
    public void a(String string, Object object) {
        if (string != null) {
            this.a.a(string);
        }
        if (object instanceof Byte) {
            this.a.a(((Byte)object).byteValue());
        } else if (object instanceof Boolean) {
            this.a.a((Boolean)object != false ? 1 : 0);
        } else if (object instanceof Character) {
            this.a.a(((Character)object).charValue());
        } else if (object instanceof Short) {
            this.a.a(((Short)object).shortValue());
        } else if (object instanceof u) {
            this.a.a(((u)object).i());
        } else if (object instanceof byte[]) {
            byte[] arrby = (byte[])object;
            for (int i2 = 0; i2 < arrby.length; ++i2) {
                this.a.a(arrby[i2]);
            }
        } else if (object instanceof boolean[]) {
            boolean[] arrbl = (boolean[])object;
            for (int i3 = 0; i3 < arrbl.length; ++i3) {
                this.a.a(arrbl[i3] ? 1 : 0);
            }
        } else if (object instanceof short[]) {
            short[] arrs = (short[])object;
            for (int i4 = 0; i4 < arrs.length; ++i4) {
                this.a.a(arrs[i4]);
            }
        } else if (object instanceof char[]) {
            char[] arrc = (char[])object;
            for (int i5 = 0; i5 < arrc.length; ++i5) {
                this.a.a(arrc[i5]);
            }
        } else if (object instanceof int[]) {
            int[] arrn = (int[])object;
            for (int i6 = 0; i6 < arrn.length; ++i6) {
                this.a.a(arrn[i6]);
            }
        } else if (object instanceof long[]) {
            long[] arrl = (long[])object;
            for (int i7 = 0; i7 < arrl.length; ++i7) {
                this.a.a(arrl[i7]);
            }
        } else if (object instanceof float[]) {
            float[] arrf = (float[])object;
            for (int i8 = 0; i8 < arrf.length; ++i8) {
                this.a.a(arrf[i8]);
            }
        } else if (object instanceof double[]) {
            double[] arrd = (double[])object;
            for (int i9 = 0; i9 < arrd.length; ++i9) {
                this.a.a(arrd[i9]);
            }
        } else {
            this.a.a(object);
        }
        this.d.a(string, object);
    }

    @Override
    public void a(String string, String string2, String string3) {
        if (string != null) {
            this.a.a(string);
        }
        this.a.a(string2);
        this.a.a(string3);
        this.d.a(string, string2, string3);
    }

    @Override
    public com.growingio.d.a.a a(String string, String string2) {
        if (string != null) {
            this.a.a(string);
        }
        this.a.a(string2);
        return new a(this.d.a(string, string2), this.a);
    }

    @Override
    public com.growingio.d.a.a a(String string) {
        if (string != null) {
            this.a.a(string);
        }
        return new a(this.d.a(string), this.a);
    }

    @Override
    public void b_() {
        this.d.b_();
    }
}

