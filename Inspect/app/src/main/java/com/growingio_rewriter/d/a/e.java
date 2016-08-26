/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a;

import com.growingio.d.a.a;
import com.growingio.d.a.c;
import com.growingio.d.a.d;
import com.growingio.d.a.f;
import com.growingio.d.a.g;
import com.growingio.d.a.h;
import com.growingio.d.a.j;
import com.growingio.d.a.m;
import com.growingio.d.a.o;
import com.growingio.d.a.p;
import com.growingio.d.a.r;
import com.growingio.d.a.s;
import com.growingio.d.a.t;
import com.growingio.d.a.u;
import com.growingio.d.a.v;
import java.io.IOException;
import java.io.InputStream;

public class e {
    static final boolean a = true;
    static final boolean b = true;
    static final boolean c = true;
    static final boolean d = true;
    static final boolean e = true;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 4;
    public static final int i = 8;
    public final byte[] j;
    private final int[] l;
    private final String[] m;
    private final int n;
    public final int k;

    public e(byte[] arrby) {
        this(arrby, 0, arrby.length);
    }

    public e(byte[] arrby, int n2, int n3) {
        this.j = arrby;
        if (this.d(n2 + 6) > 52) {
            throw new IllegalArgumentException();
        }
        this.l = new int[this.c(n2 + 8)];
        int n4 = this.l.length;
        this.m = new String[n4];
        int n5 = 0;
        int n6 = n2 + 10;
        for (int i2 = 1; i2 < n4; ++i2) {
            int n7;
            this.l[i2] = n6 + 1;
            switch (arrby[n6]) {
                case 3: 
                case 4: 
                case 9: 
                case 10: 
                case 11: 
                case 12: 
                case 18: {
                    n7 = 5;
                    break;
                }
                case 5: 
                case 6: {
                    n7 = 9;
                    ++i2;
                    break;
                }
                case 1: {
                    n7 = 3 + this.c(n6 + 1);
                    if (n7 <= n5) break;
                    n5 = n7;
                    break;
                }
                case 15: {
                    n7 = 4;
                    break;
                }
                default: {
                    n7 = 3;
                }
            }
            n6 += n7;
        }
        this.n = n5;
        this.k = n6;
    }

    public int a() {
        return this.c(this.k);
    }

    public String b() {
        return this.b(this.k + 2, new char[this.n]);
    }

    public String c() {
        return this.b(this.k + 4, new char[this.n]);
    }

    public String[] d() {
        int n2 = this.k + 6;
        int n3 = this.c(n2);
        String[] arrstring = new String[n3];
        if (n3 > 0) {
            char[] arrc = new char[this.n];
            for (int i2 = 0; i2 < n3; ++i2) {
                arrstring[i2] = this.b(n2 += 2, arrc);
            }
        }
        return arrstring;
    }

    void a(g g2) {
        int n2;
        char[] arrc = new char[this.n];
        int n3 = this.l.length;
        o[] arro = new o[n3];
        for (n2 = 1; n2 < n3; ++n2) {
            int n4;
            int n5 = this.l[n2];
            byte by2 = this.j[n5 - 1];
            o o2 = new o(n2);
            switch (by2) {
                int n6;
                case 9: 
                case 10: 
                case 11: {
                    n6 = this.l[this.c(n5 + 2)];
                    o2.a(by2, this.b(n5, arrc), this.a(n6, arrc), this.a(n6 + 2, arrc));
                    break;
                }
                case 3: {
                    o2.a(this.e(n5));
                    break;
                }
                case 4: {
                    o2.a(Float.intBitsToFloat(this.e(n5)));
                    break;
                }
                case 12: {
                    o2.a(by2, this.a(n5, arrc), this.a(n5 + 2, arrc), null);
                    break;
                }
                case 5: {
                    o2.a(this.f(n5));
                    ++n2;
                    break;
                }
                case 6: {
                    o2.a(Double.longBitsToDouble(this.f(n5)));
                    ++n2;
                    break;
                }
                case 1: {
                    String string = this.m[n2];
                    if (string == null) {
                        n5 = this.l[n2];
                        string = this.m[n2] = this.a(n5 + 2, this.c(n5), arrc);
                    }
                    o2.a(by2, string, null, null);
                    break;
                }
                case 15: {
                    n4 = this.l[this.c(n5 + 1)];
                    n6 = this.l[this.c(n4 + 2)];
                    o2.a(20 + this.b(n5), this.b(n4, arrc), this.a(n6, arrc), this.a(n6 + 2, arrc));
                    break;
                }
                case 18: {
                    if (g2.af == null) {
                        this.a(g2, arro, arrc);
                    }
                    n6 = this.l[this.c(n5 + 2)];
                    o2.a(this.a(n6, arrc), this.a(n6 + 2, arrc), this.c(n5));
                    break;
                }
                default: {
                    o2.a(by2, this.a(n5, arrc), null, null);
                }
            }
            n4 = o2.h % arro.length;
            o2.i = arro[n4];
            arro[n4] = o2;
        }
        n2 = this.l[1] - 1;
        g2.V.a(this.j, n2, this.k - n2);
        g2.W = arro;
        g2.X = (int)(0.75 * (double)n3);
        g2.U = n3;
    }

    private void a(g g2, o[] arro, char[] arrc) {
        int n2;
        int n3;
        int n4 = this.g();
        boolean bl2 = false;
        for (n2 = this.c((int)n4); n2 > 0; --n2) {
            String string = this.a(n4 + 2, arrc);
            if ("BootstrapMethods".equals(string)) {
                bl2 = true;
                break;
            }
            n4 += 6 + this.e(n4 + 4);
        }
        if (!bl2) {
            return;
        }
        n2 = this.c(n4 + 8);
        int n5 = n4 + 10;
        for (n3 = 0; n3 < n2; ++n3) {
            int n6 = n5 - n4 - 10;
            int n7 = this.c(this.c(n5), arrc).hashCode();
            for (int i2 = this.c((int)(n5 + 2)); i2 > 0; --i2) {
                n7 ^= this.c(this.c(n5 + 4), arrc).hashCode();
                n5 += 2;
            }
            n5 += 4;
            o o2 = new o(n3);
            o2.a(n6, n7 & Integer.MAX_VALUE);
            int n8 = o2.h % arro.length;
            o2.i = arro[n8];
            arro[n8] = o2;
        }
        n3 = this.e(n4 + 4);
        d d2 = new d(n3 + 62);
        d2.a(this.j, n4 + 10, n3 - 2);
        g2.ae = n2;
        g2.af = d2;
    }

    public e(InputStream inputStream) throws IOException {
        this(e.a(inputStream, false));
    }

    public e(String string) throws IOException {
        this(e.a(ClassLoader.getSystemResourceAsStream(string.replace('.', '/') + ".class"), true));
    }

    private static byte[] a(InputStream inputStream, boolean bl2) throws IOException {
        if (inputStream == null) {
            throw new IOException("Class not found");
        }
        try {
            byte[] arrby = new byte[inputStream.available()];
            int n2 = 0;
            do {
                int n3;
                byte[] arrby2;
                if ((n3 = inputStream.read(arrby, n2, arrby.length - n2)) == -1) {
                    byte[] arrby3;
                    if (n2 < arrby.length) {
                        arrby3 = new byte[n2];
                        System.arraycopy(arrby, 0, arrby3, 0, n2);
                        arrby = arrby3;
                    }
                    arrby3 = arrby;
                    return arrby3;
                }
                if ((n2 += n3) != arrby.length) continue;
                int n4 = inputStream.read();
                if (n4 < 0) {
                    arrby2 = arrby;
                    return arrby2;
                }
                arrby2 = new byte[arrby.length + 1000];
                System.arraycopy(arrby, 0, arrby2, 0, n2);
                arrby2[n2++] = (byte)n4;
                arrby = arrby2;
            } while (true);
        }
        finally {
            if (bl2) {
                inputStream.close();
            }
        }
    }

    public void a(f f2, int n2) {
        this.a(f2, new c[0], n2);
    }

    public void a(f f2, c[] arrc, int n2) {
        int n3;
        String string;
        int n4 = this.k;
        char[] arrc2 = new char[this.n];
        h h2 = new h();
        h2.a = arrc;
        h2.b = n2;
        h2.c = arrc2;
        int n5 = this.c(n4);
        String string2 = this.b(n4 + 2, arrc2);
        String string3 = this.b(n4 + 4, arrc2);
        String[] arrstring = new String[this.c(n4 + 6)];
        n4 += 8;
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            arrstring[i2] = this.b(n4, arrc2);
            n4 += 2;
        }
        String string4 = null;
        String string5 = null;
        String string6 = null;
        String string7 = null;
        String string8 = null;
        String string9 = null;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        c c2 = null;
        n4 = this.g();
        for (n3 = this.c((int)n4); n3 > 0; --n3) {
            int n11;
            string = this.a(n4 + 2, arrc2);
            if ("SourceFile".equals(string)) {
                string5 = this.a(n4 + 8, arrc2);
            } else if ("InnerClasses".equals(string)) {
                n10 = n4 + 8;
            } else if ("EnclosingMethod".equals(string)) {
                string7 = this.b(n4 + 8, arrc2);
                n11 = this.c(n4 + 10);
                if (n11 != 0) {
                    string8 = this.a(this.l[n11], arrc2);
                    string9 = this.a(this.l[n11] + 2, arrc2);
                }
            } else if ("Signature".equals(string)) {
                string4 = this.a(n4 + 8, arrc2);
            } else if ("RuntimeVisibleAnnotations".equals(string)) {
                n6 = n4 + 8;
            } else if ("RuntimeVisibleTypeAnnotations".equals(string)) {
                n8 = n4 + 8;
            } else if ("Deprecated".equals(string)) {
                n5 |= 131072;
            } else if ("Synthetic".equals(string)) {
                n5 |= 266240;
            } else if ("SourceDebugExtension".equals(string)) {
                n11 = this.e(n4 + 4);
                string6 = this.a(n4 + 8, n11, new char[n11]);
            } else if ("RuntimeInvisibleAnnotations".equals(string)) {
                n7 = n4 + 8;
            } else if ("RuntimeInvisibleTypeAnnotations".equals(string)) {
                n9 = n4 + 8;
            } else if ("BootstrapMethods".equals(string)) {
                int[] arrn = new int[this.c(n4 + 8)];
                int n12 = n4 + 10;
                for (int i3 = 0; i3 < arrn.length; ++i3) {
                    arrn[i3] = n12;
                    n12 += 2 + this.c(n12 + 2) << 1;
                }
                h2.d = arrn;
            } else {
                c c3 = this.a(arrc, string, n4 + 8, this.e(n4 + 4), arrc2, -1, null);
                if (c3 != null) {
                    c3.c = c2;
                    c2 = c3;
                }
            }
            n4 += 6 + this.e(n4 + 4);
        }
        f2.a(this.e(this.l[1] - 7), n5, string2, string4, string3, arrstring);
        if ((n2 & 2) == 0 && (string5 != null || string6 != null)) {
            f2.a_(string5, string6);
        }
        if (string7 != null) {
            f2.a(string7, string8, string9);
        }
        if (n6 != 0) {
            int n13 = n6 + 2;
            for (n3 = this.c((int)n6); n3 > 0; --n3) {
                n13 = this.a(n13 + 2, arrc2, true, f2.a(this.a(n13, arrc2), true));
            }
        }
        if (n7 != 0) {
            string = (String)(n7 + 2);
            for (n3 = this.c((int)n7); n3 > 0; --n3) {
                string = (String)this.a((int)(string + 2), arrc2, true, f2.a(this.a((int)string, arrc2), false));
            }
        }
        if (n8 != 0) {
            string = (String)(n8 + 2);
            for (n3 = this.c((int)n8); n3 > 0; --n3) {
                string = (String)this.a(h2, (int)string);
                string = (String)this.a((int)(string + 2), arrc2, true, f2.a(h2.i, h2.j, this.a((int)string, arrc2), true));
            }
        }
        if (n9 != 0) {
            string = (String)(n9 + 2);
            for (n3 = this.c((int)n9); n3 > 0; --n3) {
                string = (String)this.a(h2, (int)string);
                string = (String)this.a((int)(string + 2), arrc2, true, f2.a(h2.i, h2.j, this.a((int)string, arrc2), false));
            }
        }
        while (c2 != null) {
            c c4 = c2.c;
            c2.c = null;
            f2.a(c2);
            c2 = c4;
        }
        if (n10 != 0) {
            n3 = n10 + 2;
            for (string = (String)this.c((int)n10); string > 0; --string) {
                f2.a(this.b(n3, arrc2), this.b(n3 + 2, arrc2), this.a(n3 + 4, arrc2), this.c(n3 + 6));
                n3 += 8;
            }
        }
        n4 = this.k + 10 + 2 * arrstring.length;
        for (n3 = this.c((int)(n4 - 2)); n3 > 0; --n3) {
            n4 = this.a(f2, h2, n4);
        }
        for (n3 = this.c((int)((n4 += 2) - 2)); n3 > 0; --n3) {
            n4 = this.b(f2, h2, n4);
        }
        f2.a();
    }

    private int a(f f2, h h2, int n2) {
        int n3;
        String string;
        char[] arrc = h2.c;
        int n4 = this.c(n2);
        String string2 = this.a(n2 + 2, arrc);
        String string3 = this.a(n2 + 4, arrc);
        String string4 = null;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        Object object = null;
        c c2 = null;
        for (int i2 = this.c((int)(n2 += 6)); i2 > 0; --i2) {
            string = this.a(n2 + 2, arrc);
            if ("ConstantValue".equals(string)) {
                n3 = this.c(n2 + 8);
                object = n3 == 0 ? null : this.c(n3, arrc);
            } else if ("Signature".equals(string)) {
                string4 = this.a(n2 + 8, arrc);
            } else if ("Deprecated".equals(string)) {
                n4 |= 131072;
            } else if ("Synthetic".equals(string)) {
                n4 |= 266240;
            } else if ("RuntimeVisibleAnnotations".equals(string)) {
                n5 = n2 + 8;
            } else if ("RuntimeVisibleTypeAnnotations".equals(string)) {
                n7 = n2 + 8;
            } else if ("RuntimeInvisibleAnnotations".equals(string)) {
                n6 = n2 + 8;
            } else if ("RuntimeInvisibleTypeAnnotations".equals(string)) {
                n8 = n2 + 8;
            } else {
                c c3 = this.a(h2.a, string, n2 + 8, this.e(n2 + 4), arrc, -1, null);
                if (c3 != null) {
                    c3.c = c2;
                    c2 = c3;
                }
            }
            n2 += 6 + this.e(n2 + 4);
        }
        n2 += 2;
        j j2 = f2.a(n4, string2, string3, string4, object);
        if (j2 == null) {
            return n2;
        }
        if (n5 != 0) {
            n3 = n5 + 2;
            for (int i3 = this.c((int)n5); i3 > 0; --i3) {
                n3 = this.a(n3 + 2, arrc, true, j2.a(this.a(n3, arrc), true));
            }
        }
        if (n6 != 0) {
            n3 = n6 + 2;
            for (string = (String)this.c((int)n6); string > 0; --string) {
                n3 = this.a(n3 + 2, arrc, true, j2.a(this.a(n3, arrc), false));
            }
        }
        if (n7 != 0) {
            n3 = n7 + 2;
            for (string = (String)this.c((int)n7); string > 0; --string) {
                n3 = this.a(h2, n3);
                n3 = this.a(n3 + 2, arrc, true, j2.a(h2.i, h2.j, this.a(n3, arrc), true));
            }
        }
        if (n8 != 0) {
            n3 = n8 + 2;
            for (string = (String)this.c((int)n8); string > 0; --string) {
                n3 = this.a(h2, n3);
                n3 = this.a(n3 + 2, arrc, true, j2.a(h2.i, h2.j, this.a(n3, arrc), false));
            }
        }
        while (c2 != null) {
            c c4 = c2.c;
            c2.c = null;
            j2.a(c2);
            c2 = c4;
        }
        j2.a();
        return n2;
    }

    private int b(f f2, h h2, int n2) {
        int n3;
        Object object;
        char[] arrc = h2.c;
        h2.e = this.c(n2);
        h2.f = this.a(n2 + 2, arrc);
        h2.g = this.a(n2 + 4, arrc);
        int n4 = 0;
        int n5 = 0;
        String[] arrstring = null;
        String string = null;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        int n13 = 0;
        int n14 = n2 += 6;
        Object object2 = null;
        for (int i2 = this.c((int)n2); i2 > 0; --i2) {
            object = this.a(n2 + 2, arrc);
            if ("Code".equals(object)) {
                if ((h2.b & 1) == 0) {
                    n4 = n2 + 8;
                }
            } else if ("Exceptions".equals(object)) {
                arrstring = new String[this.c(n2 + 8)];
                n5 = n2 + 10;
                for (n3 = 0; n3 < arrstring.length; ++n3) {
                    arrstring[n3] = this.b(n5, arrc);
                    n5 += 2;
                }
            } else if ("Signature".equals(object)) {
                string = this.a(n2 + 8, arrc);
            } else if ("Deprecated".equals(object)) {
                h2.e |= 131072;
            } else if ("RuntimeVisibleAnnotations".equals(object)) {
                n7 = n2 + 8;
            } else if ("RuntimeVisibleTypeAnnotations".equals(object)) {
                n9 = n2 + 8;
            } else if ("AnnotationDefault".equals(object)) {
                n11 = n2 + 8;
            } else if ("Synthetic".equals(object)) {
                h2.e |= 266240;
            } else if ("RuntimeInvisibleAnnotations".equals(object)) {
                n8 = n2 + 8;
            } else if ("RuntimeInvisibleTypeAnnotations".equals(object)) {
                n10 = n2 + 8;
            } else if ("RuntimeVisibleParameterAnnotations".equals(object)) {
                n12 = n2 + 8;
            } else if ("RuntimeInvisibleParameterAnnotations".equals(object)) {
                n13 = n2 + 8;
            } else if ("MethodParameters".equals(object)) {
                n6 = n2 + 8;
            } else {
                c c2 = this.a(h2.a, (String)object, n2 + 8, this.e(n2 + 4), arrc, -1, null);
                if (c2 != null) {
                    c2.c = object2;
                    object2 = c2;
                }
            }
            n2 += 6 + this.e(n2 + 4);
        }
        n2 += 2;
        r r2 = f2.a(h2.e, h2.f, h2.g, string, arrstring);
        if (r2 == null) {
            return n2;
        }
        if (r2 instanceof s) {
            object = (s)r2;
            if (object.l.S == this && string == object.m) {
                n3 = 0;
                if (arrstring == null) {
                    n3 = object.p == 0 ? 1 : 0;
                } else if (arrstring.length == object.p) {
                    n3 = 1;
                    for (int i3 = arrstring.length - 1; i3 >= 0; --i3) {
                        if (object.q[i3] == this.c(n5 -= 2)) continue;
                        n3 = 0;
                        break;
                    }
                }
                if (n3 != 0) {
                    object.n = n14;
                    object.o = n2 - n14;
                    return n2;
                }
            }
        }
        if (n6 != 0) {
            int n15 = this.j[n6] & 255;
            n3 = n6 + 1;
            while (n15 > 0) {
                r2.a(this.a(n3, arrc), this.c(n3 + 2));
                --n15;
                n3 += 4;
            }
        }
        if (n11 != 0) {
            object = r2.c();
            this.a(n11, arrc, null, (a)object);
            if (object != null) {
                object.b_();
            }
        }
        if (n7 != 0) {
            n3 = n7 + 2;
            for (int i4 = this.c((int)n7); i4 > 0; --i4) {
                n3 = this.a(n3 + 2, arrc, true, r2.a(this.a(n3, arrc), true));
            }
        }
        if (n8 != 0) {
            n3 = n8 + 2;
            for (int i5 = this.c((int)n8); i5 > 0; --i5) {
                n3 = this.a(n3 + 2, arrc, true, r2.a(this.a(n3, arrc), false));
            }
        }
        if (n9 != 0) {
            n3 = n9 + 2;
            for (int i6 = this.c((int)n9); i6 > 0; --i6) {
                n3 = this.a(h2, n3);
                n3 = this.a(n3 + 2, arrc, true, r2.a(h2.i, h2.j, this.a(n3, arrc), true));
            }
        }
        if (n10 != 0) {
            n3 = n10 + 2;
            for (int i7 = this.c((int)n10); i7 > 0; --i7) {
                n3 = this.a(h2, n3);
                n3 = this.a(n3 + 2, arrc, true, r2.a(h2.i, h2.j, this.a(n3, arrc), false));
            }
        }
        if (n12 != 0) {
            this.b(r2, h2, n12, true);
        }
        if (n13 != 0) {
            this.b(r2, h2, n13, false);
        }
        while (object2 != null) {
            object = object2.c;
            object2.c = null;
            r2.a((c)object2);
            object2 = object;
        }
        if (n4 != 0) {
            r2.a_();
            this.a(r2, h2, n4);
        }
        r2.b();
        return n2;
    }

    private void a(r r2, h h2, int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        Object object;
        int n7;
        byte[] arrby = this.j;
        char[] arrc = h2.c;
        int n8 = this.c(n2);
        int n9 = this.c(n2 + 2);
        int n10 = this.e(n2 + 4);
        int n11 = n2 += 8;
        int n12 = n2 + n10;
        p[] arrp = h2.h = new p[n10 + 2];
        this.a(n10 + 1, arrp);
        block29 : while (n2 < n12) {
            n7 = n2 - n11;
            int n13 = arrby[n2] & 255;
            switch (g.y[n13]) {
                int n14;
                case 0: 
                case 4: {
                    ++n2;
                    continue block29;
                }
                case 9: {
                    this.a(n7 + this.d(n2 + 1), arrp);
                    n2 += 3;
                    continue block29;
                }
                case 10: {
                    this.a(n7 + this.e(n2 + 1), arrp);
                    n2 += 5;
                    continue block29;
                }
                case 17: {
                    n13 = arrby[n2 + 1] & 255;
                    if (n13 == 132) {
                        n2 += 6;
                        continue block29;
                    }
                    n2 += 4;
                    continue block29;
                }
                case 14: {
                    n2 = n2 + 4 - (n7 & 3);
                    this.a(n7 + this.e(n2), arrp);
                    for (n14 = this.e((int)(n2 + 8)) - this.e((int)(n2 + 4)) + 1; n14 > 0; --n14) {
                        this.a(n7 + this.e(n2 + 12), arrp);
                        n2 += 4;
                    }
                    n2 += 12;
                    continue block29;
                }
                case 15: {
                    n2 = n2 + 4 - (n7 & 3);
                    this.a(n7 + this.e(n2), arrp);
                    for (n14 = this.e((int)(n2 + 4)); n14 > 0; --n14) {
                        this.a(n7 + this.e(n2 + 12), arrp);
                        n2 += 8;
                    }
                    n2 += 8;
                    continue block29;
                }
                case 1: 
                case 3: 
                case 11: {
                    n2 += 2;
                    continue block29;
                }
                case 2: 
                case 5: 
                case 6: 
                case 12: 
                case 13: {
                    n2 += 3;
                    continue block29;
                }
                case 7: 
                case 8: {
                    n2 += 5;
                    continue block29;
                }
            }
            n2 += 4;
        }
        for (n7 = this.c((int)n2); n7 > 0; --n7) {
            p p2 = this.a(this.c(n2 + 2), arrp);
            p p3 = this.a(this.c(n2 + 4), arrp);
            p p4 = this.a(this.c(n2 + 6), arrp);
            String string = this.a(this.l[this.c(n2 + 8)], arrc);
            r2.a(p2, p3, p4, string);
            n2 += 8;
        }
        int[] arrn = null;
        int[] arrn2 = null;
        int n15 = 0;
        int n16 = 0;
        int n17 = -1;
        int n18 = -1;
        int n19 = 0;
        int n20 = 0;
        boolean bl2 = true;
        boolean bl3 = (h2.b & 8) != 0;
        int n21 = 0;
        int n22 = 0;
        int n23 = 0;
        h h3 = null;
        c c2 = null;
        for (n4 = this.c((int)(n2 += 2)); n4 > 0; --n4) {
            object = this.a(n2 + 2, arrc);
            if ("LocalVariableTable".equals(object)) {
                if ((h2.b & 2) == 0) {
                    n19 = n2 + 8;
                    n6 = n2;
                    for (n3 = this.c((int)(n2 + 8)); n3 > 0; --n3) {
                        n5 = this.c(n6 + 10);
                        if (arrp[n5] == null) {
                            this.a((int)n5, (p[])arrp).n |= 1;
                        }
                        if (arrp[n5 += this.c(n6 + 12)] == null) {
                            this.a((int)n5, (p[])arrp).n |= 1;
                        }
                        n6 += 10;
                    }
                }
            } else if ("LocalVariableTypeTable".equals(object)) {
                n20 = n2 + 8;
            } else if ("LineNumberTable".equals(object)) {
                if ((h2.b & 2) == 0) {
                    n6 = n2;
                    for (n3 = this.c((int)(n2 + 8)); n3 > 0; --n3) {
                        n5 = this.c(n6 + 10);
                        if (arrp[n5] == null) {
                            this.a((int)n5, (p[])arrp).n |= 1;
                        }
                        p p5 = arrp[n5];
                        while (p5.o > 0) {
                            if (p5.v == null) {
                                p5.v = new p();
                            }
                            p5 = p5.v;
                        }
                        p5.o = this.c(n6 + 12);
                        n6 += 4;
                    }
                }
            } else if ("RuntimeVisibleTypeAnnotations".equals(object)) {
                arrn = this.a(r2, h2, n2 + 8, true);
                n17 = arrn.length == 0 || this.b(arrn[0]) < 67 ? -1 : this.c(arrn[0] + 1);
            } else if ("RuntimeInvisibleTypeAnnotations".equals(object)) {
                arrn2 = this.a(r2, h2, n2 + 8, false);
                n18 = arrn2.length == 0 || this.b(arrn2[0]) < 67 ? -1 : this.c(arrn2[0] + 1);
            } else if ("StackMapTable".equals(object)) {
                if ((h2.b & 4) == 0) {
                    n21 = n2 + 10;
                    n22 = this.e(n2 + 4);
                    n23 = this.c(n2 + 8);
                }
            } else if ("StackMap".equals(object)) {
                if ((h2.b & 4) == 0) {
                    bl2 = false;
                    n21 = n2 + 10;
                    n22 = this.e(n2 + 4);
                    n23 = this.c(n2 + 8);
                }
            } else {
                for (n3 = 0; n3 < h2.a.length; ++n3) {
                    c c3;
                    if (!h2.a[n3].a.equals(object) || (c3 = h2.a[n3].a(this, n2 + 8, this.e(n2 + 4), arrc, n11 - 8, arrp)) == null) continue;
                    c3.c = c2;
                    c2 = c3;
                }
            }
            n2 += 6 + this.e(n2 + 4);
        }
        n2 += 2;
        if (n21 != 0) {
            h3 = h2;
            h3.k = -1;
            h3.o = 0;
            h3.p = 0;
            h3.q = 0;
            h3.s = 0;
            h3.r = new Object[n9];
            h3.t = new Object[n8];
            if (bl3) {
                this.a(h2);
            }
            for (n4 = n21; n4 < n21 + n22 - 2; ++n4) {
                int n24;
                if (arrby[n4] != 8 || (n24 = this.c(n4 + 1)) < 0 || n24 >= n10 || (arrby[n11 + n24] & 255) != 187) continue;
                this.a(n24, arrp);
            }
        }
        n2 = n11;
        while (n2 < n12) {
            n4 = n2 - n11;
            object = arrp[n4];
            if (object != null) {
                p p6 = object.v;
                object.v = null;
                r2.a((p)object);
                if ((h2.b & 2) == 0 && object.o > 0) {
                    r2.b(object.o, (p)object);
                    while (p6 != null) {
                        r2.b(p6.o, (p)object);
                        p6 = p6.v;
                    }
                }
            }
            while (h3 != null && (h3.k == n4 || h3.k == -1)) {
                if (h3.k != -1) {
                    if (!bl2 || bl3) {
                        r2.a(-1, h3.p, h3.r, h3.s, h3.t);
                    } else {
                        r2.a(h3.o, h3.q, h3.r, h3.s, h3.t);
                    }
                }
                if (n23 > 0) {
                    n21 = this.a(n21, bl2, bl3, h3);
                    --n23;
                    continue;
                }
                h3 = null;
            }
            n3 = arrby[n2] & 255;
            switch (g.y[n3]) {
                Object object2;
                int n25;
                case 0: {
                    r2.a_(n3);
                    ++n2;
                    break;
                }
                case 4: {
                    if (n3 > 54) {
                        r2.b(54 + (n3 >> 2), (n3 -= 59) & 3);
                    } else {
                        r2.b(21 + (n3 >> 2), (n3 -= 26) & 3);
                    }
                    ++n2;
                    break;
                }
                case 9: {
                    r2.a(n3, arrp[n4 + this.d(n2 + 1)]);
                    n2 += 3;
                    break;
                }
                case 10: {
                    r2.a(n3 - 33, arrp[n4 + this.e(n2 + 1)]);
                    n2 += 5;
                    break;
                }
                case 17: {
                    n3 = arrby[n2 + 1] & 255;
                    if (n3 == 132) {
                        r2.c(this.c(n2 + 2), this.d(n2 + 4));
                        n2 += 6;
                        break;
                    }
                    r2.b(n3, this.c(n2 + 2));
                    n2 += 4;
                    break;
                }
                case 14: {
                    n2 = n2 + 4 - (n4 & 3);
                    n6 = n4 + this.e(n2);
                    n5 = this.e(n2 + 4);
                    int n26 = this.e(n2 + 8);
                    object2 = new p[n26 - n5 + 1];
                    n2 += 12;
                    for (n25 = 0; n25 < object2.length; n25 += 1) {
                        object2[n25] = arrp[n4 + this.e(n2)];
                        n2 += 4;
                    }
                    r2.a(n5, n26, arrp[n6], (p[])object2);
                    break;
                }
                case 15: {
                    n2 = n2 + 4 - (n4 & 3);
                    n6 = n4 + this.e(n2);
                    n5 = this.e(n2 + 4);
                    int[] arrn3 = new int[n5];
                    object2 = new p[n5];
                    n2 += 8;
                    for (n25 = 0; n25 < n5; n25 += 1) {
                        arrn3[n25] = this.e(n2);
                        object2[n25] = arrp[n4 + this.e(n2 + 4)];
                        n2 += 8;
                    }
                    r2.a(arrp[n6], arrn3, (p[])object2);
                    break;
                }
                case 3: {
                    r2.b(n3, arrby[n2 + 1] & 255);
                    n2 += 2;
                    break;
                }
                case 1: {
                    r2.a(n3, (int)arrby[n2 + 1]);
                    n2 += 2;
                    break;
                }
                case 2: {
                    r2.a(n3, (int)this.d(n2 + 1));
                    n2 += 3;
                    break;
                }
                case 11: {
                    r2.a(this.c(arrby[n2 + 1] & 255, arrc));
                    n2 += 2;
                    break;
                }
                case 12: {
                    r2.a(this.c(this.c(n2 + 1), arrc));
                    n2 += 3;
                    break;
                }
                case 6: 
                case 7: {
                    n6 = this.l[this.c(n2 + 1)];
                    n5 = arrby[n6 - 1] == 11 ? 1 : 0;
                    String string = this.b(n6, arrc);
                    n6 = this.l[this.c(n6 + 2)];
                    object2 = this.a(n6, arrc);
                    String string2 = this.a(n6 + 2, arrc);
                    if (n3 < 182) {
                        r2.b(n3, string, (String)object2, string2);
                    } else {
                        r2.a(n3, string, (String)object2, string2, (boolean)n5);
                    }
                    if (n3 == 185) {
                        n2 += 5;
                        break;
                    }
                    n2 += 3;
                    break;
                }
                case 8: {
                    n6 = this.l[this.c(n2 + 1)];
                    n5 = h2.d[this.c(n6)];
                    m m2 = (m)this.c(this.c(n5), arrc);
                    int n27 = this.c(n5 + 2);
                    Object[] arrobject = new Object[n27];
                    n5 += 4;
                    for (int i2 = 0; i2 < n27; ++i2) {
                        arrobject[i2] = this.c(this.c(n5), arrc);
                        n5 += 2;
                    }
                    n6 = this.l[this.c(n6 + 2)];
                    String string = this.a(n6, arrc);
                    String string3 = this.a(n6 + 2, arrc);
                    r2.a(string, string3, m2, arrobject);
                    n2 += 5;
                    break;
                }
                case 5: {
                    r2.a(n3, this.b(n2 + 1, arrc));
                    n2 += 3;
                    break;
                }
                case 13: {
                    r2.c(arrby[n2 + 1] & 255, arrby[n2 + 2]);
                    n2 += 3;
                    break;
                }
                default: {
                    r2.b(this.b(n2 + 1, arrc), arrby[n2 + 3] & 255);
                    n2 += 4;
                }
            }
            while (arrn != null && n15 < arrn.length && n17 <= n4) {
                if (n17 == n4) {
                    n6 = this.a(h2, arrn[n15]);
                    this.a(n6 + 2, arrc, true, r2.b(h2.i, h2.j, this.a(n6, arrc), true));
                }
                n17 = ++n15 >= arrn.length || this.b(arrn[n15]) < 67 ? -1 : this.c(arrn[n15] + 1);
            }
            while (arrn2 != null && n16 < arrn2.length && n18 <= n4) {
                if (n18 == n4) {
                    n6 = this.a(h2, arrn2[n16]);
                    this.a(n6 + 2, arrc, true, r2.b(h2.i, h2.j, this.a(n6, arrc), false));
                }
                n18 = ++n16 >= arrn2.length || this.b(arrn2[n16]) < 67 ? -1 : this.c(arrn2[n16] + 1);
            }
        }
        if (arrp[n10] != null) {
            r2.a(arrp[n10]);
        }
        if ((h2.b & 2) == 0 && n19 != 0) {
            int[] arrn4 = null;
            if (n20 != 0) {
                n2 = n20 + 2;
                arrn4 = new int[this.c(n20) * 3];
                int n28 = arrn4.length;
                while (n28 > 0) {
                    arrn4[--n28] = n2 + 6;
                    arrn4[--n28] = this.c(n2 + 8);
                    arrn4[--n28] = this.c(n2);
                    n2 += 10;
                }
            }
            n2 = n19 + 2;
            for (object = (Object)this.c((int)n19); object > 0; --object) {
                n3 = this.c(n2);
                n6 = this.c(n2 + 2);
                n5 = this.c(n2 + 8);
                String string = null;
                if (arrn4 != null) {
                    for (int i3 = 0; i3 < arrn4.length; i3 += 3) {
                        if (arrn4[i3] != n3 || arrn4[i3 + 1] != n5) continue;
                        string = this.a(arrn4[i3 + 2], arrc);
                        break;
                    }
                }
                r2.a(this.a(n2 + 4, arrc), this.a(n2 + 6, arrc), string, arrp[n3], arrp[n3 + n6], n5);
                n2 += 10;
            }
        }
        if (arrn != null) {
            for (n4 = 0; n4 < arrn.length; ++n4) {
                if (this.b((int)arrn[n4]) >> 1 != 32) continue;
                object = this.a(h2, arrn[n4]);
                object = this.a((int)(object + 2), arrc, true, r2.a(h2.i, h2.j, h2.l, h2.m, h2.n, this.a((int)object, arrc), true));
            }
        }
        if (arrn2 != null) {
            for (n4 = 0; n4 < arrn2.length; ++n4) {
                if (this.b((int)arrn2[n4]) >> 1 != 32) continue;
                object = this.a(h2, arrn2[n4]);
                object = this.a((int)(object + 2), arrc, true, r2.a(h2.i, h2.j, h2.l, h2.m, h2.n, this.a((int)object, arrc), false));
            }
        }
        while (c2 != null) {
            c c4 = c2.c;
            c2.c = null;
            r2.a(c2);
            c2 = c4;
        }
        r2.d(n8, n9);
    }

    private int[] a(r r2, h h2, int n2, boolean bl2) {
        char[] arrc = h2.c;
        int[] arrn = new int[this.c(n2)];
        n2 += 2;
        for (int i2 = 0; i2 < arrn.length; ++i2) {
            Object object;
            int n3;
            arrn[i2] = n2;
            int n4 = this.e(n2);
            switch (n4 >>> 24) {
                case 0: 
                case 1: 
                case 22: {
                    n2 += 2;
                    break;
                }
                case 19: 
                case 20: 
                case 21: {
                    ++n2;
                    break;
                }
                case 64: 
                case 65: {
                    for (n3 = this.c((int)(n2 + 1)); n3 > 0; --n3) {
                        object = this.c(n2 + 3);
                        int n5 = this.c(n2 + 5);
                        this.a((int)object, h2.h);
                        this.a((int)(object + n5), h2.h);
                        n2 += 6;
                    }
                    n2 += 3;
                    break;
                }
                case 71: 
                case 72: 
                case 73: 
                case 74: 
                case 75: {
                    n2 += 4;
                    break;
                }
                default: {
                    n2 += 3;
                }
            }
            n3 = this.b(n2);
            if (n4 >>> 24 == 66) {
                object = n3 == 0 ? null : new v(this.j, n2);
                n2 += 1 + 2 * n3;
                n2 = this.a(n2 + 2, arrc, true, r2.c(n4, (v)object, this.a(n2, arrc), bl2));
                continue;
            }
            n2 = this.a(n2 + 3 + 2 * n3, arrc, true, null);
        }
        return arrn;
    }

    private int a(h h2, int n2) {
        int n3;
        int n4 = this.e(n2);
        switch (n4 >>> 24) {
            case 0: 
            case 1: 
            case 22: {
                n4 &= -65536;
                n2 += 2;
                break;
            }
            case 19: 
            case 20: 
            case 21: {
                n4 &= -16777216;
                ++n2;
                break;
            }
            case 64: 
            case 65: {
                n4 &= -16777216;
                n3 = this.c(n2 + 1);
                h2.l = new p[n3];
                h2.m = new p[n3];
                h2.n = new int[n3];
                n2 += 3;
                for (int i2 = 0; i2 < n3; ++i2) {
                    int n5 = this.c(n2);
                    int n6 = this.c(n2 + 2);
                    h2.l[i2] = this.a(n5, h2.h);
                    h2.m[i2] = this.a(n5 + n6, h2.h);
                    h2.n[i2] = this.c(n2 + 4);
                    n2 += 6;
                }
                break;
            }
            case 71: 
            case 72: 
            case 73: 
            case 74: 
            case 75: {
                n4 &= -16776961;
                n2 += 4;
                break;
            }
            default: {
                n4 &= n4 >>> 24 < 67 ? -256 : -16777216;
                n2 += 3;
            }
        }
        n3 = this.b(n2);
        h2.i = n4;
        h2.j = n3 == 0 ? null : new v(this.j, n2);
        return n2 + 1 + 2 * n3;
    }

    private void b(r r2, h h2, int n2, boolean bl2) {
        a a2;
        int n3;
        int n4 = this.j[n2++] & 255;
        int n5 = u.d(h2.g).length - n4;
        for (n3 = 0; n3 < n5; ++n3) {
            a2 = r2.a(n3, "Ljava/lang/Synthetic;", false);
            if (a2 == null) continue;
            a2.b_();
        }
        char[] arrc = h2.c;
        while (n3 < n4 + n5) {
            int n6 = this.c(n2);
            n2 += 2;
            while (n6 > 0) {
                a2 = r2.a(n3, this.a(n2, arrc), bl2);
                n2 = this.a(n2 + 2, arrc, true, a2);
                --n6;
            }
            ++n3;
        }
    }

    private int a(int n2, char[] arrc, boolean bl2, a a2) {
        int n3 = this.c(n2);
        n2 += 2;
        if (bl2) {
            while (n3 > 0) {
                n2 = this.a(n2 + 2, arrc, this.a(n2, arrc), a2);
                --n3;
            }
        } else {
            while (n3 > 0) {
                n2 = this.a(n2, arrc, null, a2);
                --n3;
            }
        }
        if (a2 != null) {
            a2.b_();
        }
        return n2;
    }

    private int a(int n2, char[] arrc, String string, a a2) {
        if (a2 == null) {
            switch (this.j[n2] & 255) {
                case 101: {
                    return n2 + 5;
                }
                case 64: {
                    return this.a(n2 + 3, arrc, true, null);
                }
                case 91: {
                    return this.a(n2 + 1, arrc, false, null);
                }
            }
            return n2 + 3;
        }
        block5 : switch (this.j[n2++] & 255) {
            case 68: 
            case 70: 
            case 73: 
            case 74: {
                a2.a(string, this.c(this.c(n2), arrc));
                n2 += 2;
                break;
            }
            case 66: {
                a2.a(string, Byte.valueOf((byte)this.e(this.l[this.c(n2)])));
                n2 += 2;
                break;
            }
            case 90: {
                a2.a(string, this.e(this.l[this.c(n2)]) == 0 ? Boolean.FALSE : Boolean.TRUE);
                n2 += 2;
                break;
            }
            case 83: {
                a2.a(string, (short)this.e(this.l[this.c(n2)]));
                n2 += 2;
                break;
            }
            case 67: {
                a2.a(string, Character.valueOf((char)this.e(this.l[this.c(n2)])));
                n2 += 2;
                break;
            }
            case 115: {
                a2.a(string, (Object)this.a(n2, arrc));
                n2 += 2;
                break;
            }
            case 101: {
                a2.a(string, this.a(n2, arrc), this.a(n2 + 2, arrc));
                n2 += 4;
                break;
            }
            case 99: {
                a2.a(string, u.a(this.a(n2, arrc)));
                n2 += 2;
                break;
            }
            case 64: {
                n2 = this.a(n2 + 2, arrc, true, a2.a(string, this.a(n2, arrc)));
                break;
            }
            case 91: {
                int n3 = this.c(n2);
                n2 += 2;
                if (n3 == 0) {
                    return this.a(n2 - 2, arrc, false, a2.a(string));
                }
                switch (this.j[n2++] & 255) {
                    case 66: {
                        byte[] arrby = new byte[n3];
                        for (int i2 = 0; i2 < n3; ++i2) {
                            arrby[i2] = (byte)this.e(this.l[this.c(n2)]);
                            n2 += 3;
                        }
                        a2.a(string, arrby);
                        --n2;
                        break block5;
                    }
                    case 90: {
                        boolean[] arrbl = new boolean[n3];
                        for (int i3 = 0; i3 < n3; ++i3) {
                            arrbl[i3] = this.e(this.l[this.c(n2)]) != 0;
                            n2 += 3;
                        }
                        a2.a(string, arrbl);
                        --n2;
                        break block5;
                    }
                    case 83: {
                        short[] arrs = new short[n3];
                        for (int i4 = 0; i4 < n3; ++i4) {
                            arrs[i4] = (short)this.e(this.l[this.c(n2)]);
                            n2 += 3;
                        }
                        a2.a(string, arrs);
                        --n2;
                        break block5;
                    }
                    case 67: {
                        char[] arrc2 = new char[n3];
                        for (int i5 = 0; i5 < n3; ++i5) {
                            arrc2[i5] = (char)this.e(this.l[this.c(n2)]);
                            n2 += 3;
                        }
                        a2.a(string, arrc2);
                        --n2;
                        break block5;
                    }
                    case 73: {
                        int[] arrn = new int[n3];
                        for (int i6 = 0; i6 < n3; ++i6) {
                            arrn[i6] = this.e(this.l[this.c(n2)]);
                            n2 += 3;
                        }
                        a2.a(string, arrn);
                        --n2;
                        break block5;
                    }
                    case 74: {
                        long[] arrl = new long[n3];
                        for (int i7 = 0; i7 < n3; ++i7) {
                            arrl[i7] = this.f(this.l[this.c(n2)]);
                            n2 += 3;
                        }
                        a2.a(string, arrl);
                        --n2;
                        break block5;
                    }
                    case 70: {
                        float[] arrf = new float[n3];
                        for (int i8 = 0; i8 < n3; ++i8) {
                            arrf[i8] = Float.intBitsToFloat(this.e(this.l[this.c(n2)]));
                            n2 += 3;
                        }
                        a2.a(string, arrf);
                        --n2;
                        break block5;
                    }
                    case 68: {
                        double[] arrd = new double[n3];
                        for (int i9 = 0; i9 < n3; ++i9) {
                            arrd[i9] = Double.longBitsToDouble(this.f(this.l[this.c(n2)]));
                            n2 += 3;
                        }
                        a2.a(string, arrd);
                        --n2;
                        break block5;
                    }
                }
                n2 = this.a(n2 - 3, arrc, false, a2.a(string));
            }
        }
        return n2;
    }

    private void a(h h2) {
        String string = h2.g;
        Object[] arrobject = h2.r;
        int n2 = 0;
        if ((h2.e & 8) == 0) {
            arrobject[n2++] = "<init>".equals(h2.f) ? t.ak : this.b(this.k + 2, h2.c);
        }
        int n3 = 1;
        block8 : do {
            int n4 = n3;
            switch (string.charAt(n3++)) {
                case 'B': 
                case 'C': 
                case 'I': 
                case 'S': 
                case 'Z': {
                    arrobject[n2++] = t.af;
                    continue block8;
                }
                case 'F': {
                    arrobject[n2++] = t.ag;
                    continue block8;
                }
                case 'J': {
                    arrobject[n2++] = t.ai;
                    continue block8;
                }
                case 'D': {
                    arrobject[n2++] = t.ah;
                    continue block8;
                }
                case '[': {
                    while (string.charAt(n3) == '[') {
                        ++n3;
                    }
                    if (string.charAt(n3) == 'L') {
                        ++n3;
                        while (string.charAt(n3) != ';') {
                            ++n3;
                        }
                    }
                    arrobject[n2++] = string.substring(n4, ++n3);
                    continue block8;
                }
                case 'L': {
                    while (string.charAt(n3) != ';') {
                        ++n3;
                    }
                    arrobject[n2++] = string.substring(n4 + 1, n3++);
                    continue block8;
                }
            }
            break;
        } while (true);
        h2.p = n2;
    }

    private int a(int n2, boolean bl2, boolean bl3, h h2) {
        int n3;
        int n4;
        char[] arrc = h2.c;
        p[] arrp = h2.h;
        if (bl2) {
            n4 = this.j[n2++] & 255;
        } else {
            n4 = 255;
            h2.k = -1;
        }
        h2.q = 0;
        if (n4 < 64) {
            n3 = n4;
            h2.o = 3;
            h2.s = 0;
        } else if (n4 < 128) {
            n3 = n4 - 64;
            n2 = this.a(h2.t, 0, n2, arrc, arrp);
            h2.o = 4;
            h2.s = 1;
        } else {
            n3 = this.c(n2);
            n2 += 2;
            if (n4 == 247) {
                n2 = this.a(h2.t, 0, n2, arrc, arrp);
                h2.o = 4;
                h2.s = 1;
            } else if (n4 >= 248 && n4 < 251) {
                h2.o = 2;
                h2.q = 251 - n4;
                h2.p -= h2.q;
                h2.s = 0;
            } else if (n4 == 251) {
                h2.o = 3;
                h2.s = 0;
            } else if (n4 < 255) {
                int n5 = bl3 ? h2.p : 0;
                for (int i2 = n4 - 251; i2 > 0; --i2) {
                    n2 = this.a(h2.r, n5++, n2, arrc, arrp);
                }
                h2.o = 1;
                h2.q = n4 - 251;
                h2.p += h2.q;
                h2.s = 0;
            } else {
                h2.o = 0;
                int n6 = this.c(n2);
                n2 += 2;
                h2.q = n6;
                h2.p = n6;
                int n7 = 0;
                while (n6 > 0) {
                    n2 = this.a(h2.r, n7++, n2, arrc, arrp);
                    --n6;
                }
                n6 = this.c(n2);
                n2 += 2;
                h2.s = n6;
                n7 = 0;
                while (n6 > 0) {
                    n2 = this.a(h2.t, n7++, n2, arrc, arrp);
                    --n6;
                }
            }
        }
        h2.k += n3 + 1;
        this.a(h2.k, arrp);
        return n2;
    }

    private int a(Object[] arrobject, int n2, int n3, char[] arrc, p[] arrp) {
        int n4 = this.j[n3++] & 255;
        switch (n4) {
            case 0: {
                arrobject[n2] = t.ae;
                break;
            }
            case 1: {
                arrobject[n2] = t.af;
                break;
            }
            case 2: {
                arrobject[n2] = t.ag;
                break;
            }
            case 3: {
                arrobject[n2] = t.ah;
                break;
            }
            case 4: {
                arrobject[n2] = t.ai;
                break;
            }
            case 5: {
                arrobject[n2] = t.aj;
                break;
            }
            case 6: {
                arrobject[n2] = t.ak;
                break;
            }
            case 7: {
                arrobject[n2] = this.b(n3, arrc);
                n3 += 2;
                break;
            }
            default: {
                arrobject[n2] = this.a(this.c(n3), arrp);
                n3 += 2;
            }
        }
        return n3;
    }

    protected p a(int n2, p[] arrp) {
        if (arrp[n2] == null) {
            arrp[n2] = new p();
        }
        return arrp[n2];
    }

    private int g() {
        int n2;
        int n3;
        int n4 = this.k + 8 + this.c(this.k + 6) * 2;
        for (n3 = this.c((int)n4); n3 > 0; --n3) {
            for (n2 = this.c((int)(n4 + 8)); n2 > 0; --n2) {
                n4 += 6 + this.e(n4 + 12);
            }
            n4 += 8;
        }
        for (n3 = this.c((int)(n4 += 2)); n3 > 0; --n3) {
            for (n2 = this.c((int)(n4 + 8)); n2 > 0; --n2) {
                n4 += 6 + this.e(n4 + 12);
            }
            n4 += 8;
        }
        return n4 + 2;
    }

    private c a(c[] arrc, String string, int n2, int n3, char[] arrc2, int n4, p[] arrp) {
        for (int i2 = 0; i2 < arrc.length; ++i2) {
            if (!arrc[i2].a.equals(string)) continue;
            return arrc[i2].a(this, n2, n3, arrc2, n4, arrp);
        }
        return new c(string).a(this, n2, n3, null, -1, null);
    }

    public int e() {
        return this.l.length;
    }

    public int a(int n2) {
        return this.l[n2];
    }

    public int f() {
        return this.n;
    }

    public int b(int n2) {
        return this.j[n2] & 255;
    }

    public int c(int n2) {
        byte[] arrby = this.j;
        return (arrby[n2] & 255) << 8 | arrby[n2 + 1] & 255;
    }

    public short d(int n2) {
        byte[] arrby = this.j;
        return (short)((arrby[n2] & 255) << 8 | arrby[n2 + 1] & 255);
    }

    public int e(int n2) {
        byte[] arrby = this.j;
        return (arrby[n2] & 255) << 24 | (arrby[n2 + 1] & 255) << 16 | (arrby[n2 + 2] & 255) << 8 | arrby[n2 + 3] & 255;
    }

    public long f(int n2) {
        long l2 = this.e(n2);
        long l3 = (long)this.e(n2 + 4) & 0xFFFFFFFFL;
        return l2 << 32 | l3;
    }

    public String a(int n2, char[] arrc) {
        int n3 = this.c(n2);
        if (n2 == 0 || n3 == 0) {
            return null;
        }
        String string = this.m[n3];
        if (string != null) {
            return string;
        }
        n2 = this.l[n3];
        this.m[n3] = this.a(n2 + 2, this.c(n2), arrc);
        return this.m[n3];
    }

    private String a(int n2, int n3, char[] arrc) {
        int n4 = n2 + n3;
        byte[] arrby = this.j;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        while (n2 < n4) {
            int n8 = arrby[n2++];
            switch (n6) {
                case 0: {
                    if ((n8 &= 255) < 128) {
                        arrc[n5++] = (char)n8;
                        break;
                    }
                    if (n8 < 224 && n8 > 191) {
                        n7 = (char)(n8 & 31);
                        n6 = 1;
                        break;
                    }
                    n7 = (char)(n8 & 15);
                    n6 = 2;
                    break;
                }
                case 1: {
                    arrc[n5++] = (char)(n7 << 6 | n8 & 63);
                    n6 = 0;
                    break;
                }
                case 2: {
                    n7 = (char)(n7 << 6 | n8 & 63);
                    n6 = 1;
                }
            }
        }
        return new String(arrc, 0, n5);
    }

    public String b(int n2, char[] arrc) {
        return this.a(this.l[this.c(n2)], arrc);
    }

    public Object c(int n2, char[] arrc) {
        int n3 = this.l[n2];
        switch (this.j[n3 - 1]) {
            case 3: {
                return this.e(n3);
            }
            case 4: {
                return Float.valueOf(Float.intBitsToFloat(this.e(n3)));
            }
            case 5: {
                return this.f(n3);
            }
            case 6: {
                return Double.longBitsToDouble(this.f(n3));
            }
            case 7: {
                return u.b(this.a(n3, arrc));
            }
            case 8: {
                return this.a(n3, arrc);
            }
            case 16: {
                return u.c(this.a(n3, arrc));
            }
        }
        int n4 = this.b(n3);
        int[] arrn = this.l;
        int n5 = arrn[this.c(n3 + 1)];
        boolean bl2 = this.j[n5 - 1] == 11;
        String string = this.b(n5, arrc);
        n5 = arrn[this.c(n5 + 2)];
        String string2 = this.a(n5, arrc);
        String string3 = this.a(n5 + 2, arrc);
        return new m(n4, string, string2, string3, bl2);
    }
}

