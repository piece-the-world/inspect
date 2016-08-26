/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.c;

import com.growingio.b.a.B;
import com.growingio.b.a.F;
import com.growingio.b.a.Q;
import com.growingio.b.a.T;
import com.growingio.b.a.a.m;
import com.growingio.b.a.a.v;
import com.growingio.b.a.as;
import com.growingio.b.a.i;
import com.growingio.b.a.y;
import com.growingio.b.ae;
import com.growingio.b.b;
import com.growingio.b.c.j;
import com.growingio.b.k;
import com.growingio.b.o;

public final class a
extends j {
    private final String a;
    private final k b;
    private m[] c;
    private int d;

    public a(j j2, String string, k k2) throws ae {
        super(j2);
        this.a = string;
        this.b = k2;
    }

    @Override
    public void a(Q q2, o o2, as as2) throws b {
        B b2 = as2.j().k();
        while (b2.e()) {
            try {
                int n2 = b2.f();
                int n3 = b2.c(n2);
                if (n3 == 50) {
                    this.a(o2, as2);
                }
                if (n3 == 50 || n3 == 51 || n3 == 52 || n3 == 49 || n3 == 48 || n3 == 46 || n3 == 47 || n3 == 53) {
                    n2 = this.a(q2, b2, n2, n3, this.d(n3));
                    continue;
                }
                if (n3 != 83 && n3 != 84 && n3 != 85 && n3 != 82 && n3 != 81 && n3 != 79 && n3 != 80 && n3 != 86) continue;
                n2 = this.a(q2, b2, n2, n3, this.e(n3));
                continue;
            }
            catch (Exception var5_6) {
                throw new b(var5_6);
            }
        }
    }

    @Override
    public void a() {
        this.c = null;
        this.d = -1;
    }

    @Override
    public int a(o o2, int n2, B b2, Q q2) throws i {
        return n2;
    }

    private m a(int n2) throws i {
        return this.c[n2 - this.d];
    }

    private void a(o o2, as as2) throws i {
        if (this.c == null) {
            this.c = new com.growingio.b.a.a.a().a(o2, as2);
            this.d = 0;
        }
    }

    private int a(int n2, int n3) {
        if (this.d > -1) {
            this.d += n3;
        }
        return n2 + n3;
    }

    private String b(int n2) throws i {
        m m2 = this.a(n2);
        if (m2 == null) {
            return null;
        }
        o o2 = m2.d().a();
        return o2 != null ? T.a(o2) : null;
    }

    private int a(Q q2, B b2, int n2, int n3, String string) throws i {
        String string2 = null;
        String string3 = this.c(n3);
        if (string3 != null) {
            if (n3 == 50) {
                string2 = this.b(b2.g());
                if (string2 == null) {
                    return n2;
                }
                if ("java/lang/Object".equals(string2)) {
                    string2 = null;
                }
            }
            b2.a(0, n2);
            F f2 = b2.a(n2, string2 != null ? 5 : 2, false);
            n2 = f2.a;
            int n4 = q2.a(this.a);
            int n5 = q2.b(n4, string3, string);
            b2.a(184, n2);
            b2.b(n5, n2 + 1);
            if (string2 != null) {
                int n6 = q2.a(string2);
                b2.a(192, n2 + 3);
                b2.b(n6, n2 + 4);
            }
            n2 = this.a(n2, f2.b);
        }
        return n2;
    }

    private String c(int n2) {
        String string = null;
        switch (n2) {
            case 50: {
                string = this.b.m();
                break;
            }
            case 51: {
                string = this.b.a();
                break;
            }
            case 52: {
                string = this.b.c();
                break;
            }
            case 49: {
                string = this.b.e();
                break;
            }
            case 48: {
                string = this.b.g();
                break;
            }
            case 46: {
                string = this.b.i();
                break;
            }
            case 53: {
                string = this.b.o();
                break;
            }
            case 47: {
                string = this.b.k();
                break;
            }
            case 83: {
                string = this.b.n();
                break;
            }
            case 84: {
                string = this.b.b();
                break;
            }
            case 85: {
                string = this.b.d();
                break;
            }
            case 82: {
                string = this.b.f();
                break;
            }
            case 81: {
                string = this.b.h();
                break;
            }
            case 79: {
                string = this.b.j();
                break;
            }
            case 86: {
                string = this.b.p();
                break;
            }
            case 80: {
                string = this.b.l();
            }
        }
        if (string.equals("")) {
            string = null;
        }
        return string;
    }

    private String d(int n2) throws i {
        switch (n2) {
            case 50: {
                return "(Ljava/lang/Object;I)Ljava/lang/Object;";
            }
            case 51: {
                return "(Ljava/lang/Object;I)B";
            }
            case 52: {
                return "(Ljava/lang/Object;I)C";
            }
            case 49: {
                return "(Ljava/lang/Object;I)D";
            }
            case 48: {
                return "(Ljava/lang/Object;I)F";
            }
            case 46: {
                return "(Ljava/lang/Object;I)I";
            }
            case 53: {
                return "(Ljava/lang/Object;I)S";
            }
            case 47: {
                return "(Ljava/lang/Object;I)J";
            }
        }
        throw new i(n2);
    }

    private String e(int n2) throws i {
        switch (n2) {
            case 83: {
                return "(Ljava/lang/Object;ILjava/lang/Object;)V";
            }
            case 84: {
                return "(Ljava/lang/Object;IB)V";
            }
            case 85: {
                return "(Ljava/lang/Object;IC)V";
            }
            case 82: {
                return "(Ljava/lang/Object;ID)V";
            }
            case 81: {
                return "(Ljava/lang/Object;IF)V";
            }
            case 79: {
                return "(Ljava/lang/Object;II)V";
            }
            case 86: {
                return "(Ljava/lang/Object;IS)V";
            }
            case 80: {
                return "(Ljava/lang/Object;IJ)V";
            }
        }
        throw new i(n2);
    }
}

