/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.O;
import com.growingio.b.a.P;
import com.growingio.b.a.T;
import com.growingio.b.a.W;
import com.growingio.b.a.ad;
import com.growingio.b.a.ae;
import com.growingio.b.a.ah;
import com.growingio.b.a.ai;
import com.growingio.b.a.aj;
import com.growingio.b.a.ao;
import com.growingio.b.a.ap;
import com.growingio.b.a.aq;
import com.growingio.b.a.ar;
import com.growingio.b.a.au;
import com.growingio.b.a.av;
import com.growingio.b.a.ax;
import com.growingio.b.a.bl;
import com.growingio.b.a.bt;
import com.growingio.b.a.w;
import com.growingio.b.o;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class Q {
    ap a;
    int b;
    int c;
    HashMap d;
    public static final int e = 7;
    public static final int f = 9;
    public static final int g = 10;
    public static final int h = 11;
    public static final int i = 8;
    public static final int j = 3;
    public static final int k = 4;
    public static final int l = 5;
    public static final int m = 6;
    public static final int n = 12;
    public static final int o = 1;
    public static final int p = 15;
    public static final int q = 16;
    public static final int r = 18;
    public static final o s = null;
    public static final int t = 1;
    public static final int u = 2;
    public static final int v = 3;
    public static final int w = 4;
    public static final int x = 5;
    public static final int y = 6;
    public static final int z = 7;
    public static final int A = 8;
    public static final int B = 9;

    public Q(String string) {
        this.a = new ap();
        this.d = null;
        this.b = 0;
        this.a((O)null);
        this.c = this.a(string);
    }

    public Q(DataInputStream dataInputStream) throws IOException {
        this.d = null;
        this.c = 0;
        this.a(dataInputStream);
    }

    void a() {
        this.d = null;
    }

    public int b() {
        return this.b;
    }

    public String c() {
        return this.d(this.c);
    }

    public int d() {
        return this.c;
    }

    void a(int n2) {
        this.c = n2;
    }

    O b(int n2) {
        return this.a.a(n2);
    }

    public int c(int n2) {
        return this.b(n2).a();
    }

    public String d(int n2) {
        w w2 = (w)this.b(n2);
        if (w2 == null) {
            return null;
        }
        return T.b(this.E(w2.b));
    }

    public String e(int n2) {
        w w2 = (w)this.b(n2);
        if (w2 == null) {
            return null;
        }
        String string = this.E(w2.b);
        if (string.charAt(0) == '[') {
            return string;
        }
        return T.d(string);
    }

    public int f(int n2) {
        ax ax2 = (ax)this.b(n2);
        return ax2.b;
    }

    public int g(int n2) {
        ax ax2 = (ax)this.b(n2);
        return ax2.d;
    }

    public int h(int n2) {
        aq aq2 = (aq)this.b(n2);
        return aq2.b;
    }

    public int i(int n2) {
        aq aq2 = (aq)this.b(n2);
        return aq2.d;
    }

    public int j(int n2) {
        ad ad2 = (ad)this.b(n2);
        return ad2.b;
    }

    public String k(int n2) {
        ad ad2 = (ad)this.b(n2);
        if (ad2 == null) {
            return null;
        }
        return this.d(ad2.b);
    }

    public int l(int n2) {
        ad ad2 = (ad)this.b(n2);
        return ad2.d;
    }

    public String m(int n2) {
        ad ad2 = (ad)this.b(n2);
        if (ad2 == null) {
            return null;
        }
        ax ax2 = (ax)this.b(ad2.d);
        if (ax2 == null) {
            return null;
        }
        return this.E(ax2.b);
    }

    public String n(int n2) {
        ad ad2 = (ad)this.b(n2);
        if (ad2 == null) {
            return null;
        }
        ax ax2 = (ax)this.b(ad2.d);
        if (ax2 == null) {
            return null;
        }
        return this.E(ax2.d);
    }

    public int o(int n2) {
        aq aq2 = (aq)this.b(n2);
        return aq2.b;
    }

    public String p(int n2) {
        aq aq2 = (aq)this.b(n2);
        if (aq2 == null) {
            return null;
        }
        return this.d(aq2.b);
    }

    public int q(int n2) {
        aq aq2 = (aq)this.b(n2);
        return aq2.d;
    }

    public String r(int n2) {
        aq aq2 = (aq)this.b(n2);
        if (aq2 == null) {
            return null;
        }
        ax ax2 = (ax)this.b(aq2.d);
        if (ax2 == null) {
            return null;
        }
        return this.E(ax2.b);
    }

    public String s(int n2) {
        aq aq2 = (aq)this.b(n2);
        if (aq2 == null) {
            return null;
        }
        ax ax2 = (ax)this.b(aq2.d);
        if (ax2 == null) {
            return null;
        }
        return this.E(ax2.d);
    }

    public int t(int n2) {
        aq aq2 = (aq)this.b(n2);
        return aq2.b;
    }

    public String u(int n2) {
        aq aq2 = (aq)this.b(n2);
        return this.d(aq2.b);
    }

    public int v(int n2) {
        aq aq2 = (aq)this.b(n2);
        return aq2.d;
    }

    public String w(int n2) {
        aq aq2 = (aq)this.b(n2);
        if (aq2 == null) {
            return null;
        }
        ax ax2 = (ax)this.b(aq2.d);
        if (ax2 == null) {
            return null;
        }
        return this.E(ax2.b);
    }

    public String x(int n2) {
        aq aq2 = (aq)this.b(n2);
        if (aq2 == null) {
            return null;
        }
        ax ax2 = (ax)this.b(aq2.d);
        if (ax2 == null) {
            return null;
        }
        return this.E(ax2.d);
    }

    public Object y(int n2) {
        O o2 = this.b(n2);
        Object object = null;
        object = o2 instanceof bl ? this.D(n2) : (o2 instanceof ae ? new Object(this.A(n2)) : (o2 instanceof ah ? new Integer(this.z(n2)) : (o2 instanceof ao ? new Long(this.B(n2)) : (o2 instanceof W ? new Double(this.C(n2)) : null))));
        return object;
    }

    public int z(int n2) {
        ah ah2 = (ah)this.b(n2);
        return ah2.b;
    }

    public float A(int n2) {
        ae ae2 = (ae)this.b(n2);
        return ae2.b;
    }

    public long B(int n2) {
        ao ao2 = (ao)this.b(n2);
        return ao2.b;
    }

    public double C(int n2) {
        W w2 = (W)this.b(n2);
        return w2.b;
    }

    public String D(int n2) {
        bl bl2 = (bl)this.b(n2);
        return this.E(bl2.b);
    }

    public String E(int n2) {
        bt bt2 = (bt)this.b(n2);
        return bt2.b;
    }

    public int F(int n2) {
        ar ar2 = (ar)this.b(n2);
        return ar2.b;
    }

    public int G(int n2) {
        ar ar2 = (ar)this.b(n2);
        return ar2.d;
    }

    public int H(int n2) {
        au au2 = (au)this.b(n2);
        return au2.b;
    }

    public int I(int n2) {
        aj aj2 = (aj)this.b(n2);
        return aj2.b;
    }

    public int J(int n2) {
        aj aj2 = (aj)this.b(n2);
        return aj2.d;
    }

    public String K(int n2) {
        aj aj2 = (aj)this.b(n2);
        if (aj2 == null) {
            return null;
        }
        ax ax2 = (ax)this.b(aj2.d);
        if (ax2 == null) {
            return null;
        }
        return this.E(ax2.d);
    }

    public int a(String string, int n2) {
        return this.a(string, "<init>", n2);
    }

    public int a(String string, String string2, int n2) {
        aq aq2 = (aq)this.b(n2);
        if (this.d(aq2.b).equals(string)) {
            ax ax2 = (ax)this.b(aq2.d);
            if (this.E(ax2.b).equals(string2)) {
                return ax2.d;
            }
        }
        return 0;
    }

    public String b(String string, String string2, int n2) {
        aq aq2 = (aq)this.b(n2);
        ax ax2 = (ax)this.b(aq2.d);
        if (this.E(ax2.b).equals(string) && this.E(ax2.d).equals(string2)) {
            return this.d(aq2.b);
        }
        return null;
    }

    private int a(O o2) {
        this.a.a(o2);
        return this.b++;
    }

    private int b(O o2) {
        O o3;
        if (this.d == null) {
            this.d = Q.a(this.a);
        }
        if ((o3 = (O)this.d.get(o2)) != null) {
            return o3.c;
        }
        this.a.a(o2);
        this.d.put(o2, o2);
        return this.b++;
    }

    public int a(int n2, Q q2, Map map) {
        if (n2 == 0) {
            return 0;
        }
        O o2 = this.b(n2);
        return o2.a(this, q2, map);
    }

    int e() {
        return this.a(new P(this.b));
    }

    public int a(o o2) {
        if (o2 == s) {
            return this.c;
        }
        if (!o2.b()) {
            return this.a(o2.s());
        }
        return this.a(T.a(o2));
    }

    public int a(String string) {
        int n2 = this.c(T.a(string));
        return this.b(new w(n2, this.b));
    }

    public int a(String string, String string2) {
        return this.a(this.c(string), this.c(string2));
    }

    public int a(int n2, int n3) {
        return this.b(new ax(n2, n3, this.b));
    }

    public int a(int n2, String string, String string2) {
        int n3 = this.a(string, string2);
        return this.b(n2, n3);
    }

    public int b(int n2, int n3) {
        return this.b(new ad(n2, n3, this.b));
    }

    public int b(int n2, String string, String string2) {
        int n3 = this.a(string, string2);
        return this.c(n2, n3);
    }

    public int c(int n2, int n3) {
        return this.b(new av(n2, n3, this.b));
    }

    public int c(int n2, String string, String string2) {
        int n3 = this.a(string, string2);
        return this.d(n2, n3);
    }

    public int d(int n2, int n3) {
        return this.b(new ai(n2, n3, this.b));
    }

    public int b(String string) {
        int n2 = this.c(string);
        return this.b(new bl(n2, this.b));
    }

    public int L(int n2) {
        return this.b(new ah(n2, this.b));
    }

    public int a(float f2) {
        return this.b(new ae(f2, this.b));
    }

    public int a(long l2) {
        int n2 = this.b(new ao(l2, this.b));
        if (n2 == this.b - 1) {
            this.e();
        }
        return n2;
    }

    public int a(double d2) {
        int n2 = this.b(new W(d2, this.b));
        if (n2 == this.b - 1) {
            this.e();
        }
        return n2;
    }

    public int c(String string) {
        return this.b(new bt(string, this.b));
    }

    public int e(int n2, int n3) {
        return this.b(new ar(n2, n3, this.b));
    }

    public int M(int n2) {
        return this.b(new au(n2, this.b));
    }

    public int f(int n2, int n3) {
        return this.b(new aj(n2, n3, this.b));
    }

    public Set f() {
        HashSet<String> hashSet = new HashSet<String>();
        ap ap2 = this.a;
        int n2 = this.b;
        for (int i2 = 1; i2 < n2; ++i2) {
            String string = ap2.a(i2).a(this);
            if (string == null) continue;
            hashSet.add(string);
        }
        return hashSet;
    }

    public void b(String string, String string2) {
        ap ap2 = this.a;
        int n2 = this.b;
        for (int i2 = 1; i2 < n2; ++i2) {
            O o2 = ap2.a(i2);
            o2.a(this, string, string2, this.d);
        }
    }

    public void a(Map map) {
        ap ap2 = this.a;
        int n2 = this.b;
        for (int i2 = 1; i2 < n2; ++i2) {
            O o2 = ap2.a(i2);
            o2.a(this, map, this.d);
        }
    }

    private void a(DataInputStream dataInputStream) throws IOException {
        int n2 = dataInputStream.readUnsignedShort();
        this.a = new ap(n2);
        this.b = 0;
        this.a((O)null);
        while (--n2 > 0) {
            int n3 = this.b(dataInputStream);
            if (n3 != 5 && n3 != 6) continue;
            this.e();
            --n2;
        }
    }

    private static HashMap a(ap ap2) {
        O o2;
        HashMap<O, O> hashMap = new HashMap<O, O>();
        int n2 = 1;
        while ((o2 = ap2.a(n2++)) != null) {
            hashMap.put(o2, o2);
        }
        return hashMap;
    }

    private int b(DataInputStream dataInputStream) throws IOException {
        O o22;
        int n2 = dataInputStream.readUnsignedByte();
        switch (n2) {
            O o22;
            case 1: {
                o22 = new bt(dataInputStream, this.b);
                break;
            }
            case 3: {
                o22 = new ah(dataInputStream, this.b);
                break;
            }
            case 4: {
                o22 = new ae(dataInputStream, this.b);
                break;
            }
            case 5: {
                o22 = new ao(dataInputStream, this.b);
                break;
            }
            case 6: {
                o22 = new W(dataInputStream, this.b);
                break;
            }
            case 7: {
                o22 = new w(dataInputStream, this.b);
                break;
            }
            case 8: {
                o22 = new bl(dataInputStream, this.b);
                break;
            }
            case 9: {
                o22 = new ad(dataInputStream, this.b);
                break;
            }
            case 10: {
                o22 = new av(dataInputStream, this.b);
                break;
            }
            case 11: {
                o22 = new ai(dataInputStream, this.b);
                break;
            }
            case 12: {
                o22 = new ax(dataInputStream, this.b);
                break;
            }
            case 15: {
                o22 = new ar(dataInputStream, this.b);
                break;
            }
            case 16: {
                o22 = new au(dataInputStream, this.b);
                break;
            }
            case 18: {
                o22 = new aj(dataInputStream, this.b);
                break;
            }
            default: {
                throw new IOException("invalid constant type: " + n2 + " at " + this.b);
            }
        }
        this.a(o22);
        return n2;
    }

    public void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.b);
        ap ap2 = this.a;
        int n2 = this.b;
        for (int i2 = 1; i2 < n2; ++i2) {
            ap2.a(i2).a(dataOutputStream);
        }
    }

    public void g() {
        this.a(new PrintWriter(System.out, true));
    }

    public void a(PrintWriter printWriter) {
        int n2 = this.b;
        for (int i2 = 1; i2 < n2; ++i2) {
            printWriter.print(i2);
            printWriter.print(" ");
            this.a.a(i2).a(printWriter);
        }
    }
}

