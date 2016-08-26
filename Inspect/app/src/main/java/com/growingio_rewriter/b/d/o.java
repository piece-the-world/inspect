/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.d;

import com.growingio.b.V;
import com.growingio.b.a.B;
import com.growingio.b.a.Q;
import com.growingio.b.a.T;
import com.growingio.b.a.as;
import com.growingio.b.a.i;
import com.growingio.b.a.y;
import com.growingio.b.ae;
import com.growingio.b.b;
import com.growingio.b.b.e;
import com.growingio.b.b.f;
import com.growingio.b.b.v;
import com.growingio.b.d.d;
import com.growingio.b.d.p;
import com.growingio.b.g;
import com.growingio.b.n;

public class o
extends d {
    int dl;

    protected o(int n2, B b2, com.growingio.b.o o2, as as2, int n3) {
        super(n2, b2, o2, as2);
        this.dl = n3;
    }

    @Override
    public n a() {
        return super.a();
    }

    @Override
    public int b() {
        return super.b();
    }

    @Override
    public String c() {
        return super.c();
    }

    @Override
    public com.growingio.b.o[] e() {
        return super.e();
    }

    public com.growingio.b.o d() throws ae {
        if (this.dl == 188) {
            int n2 = this.b.c(this.a + 1);
            return this.a(n2);
        }
        if (this.dl == 189 || this.dl == 197) {
            int n3 = this.b.e(this.a + 1);
            String string = this.j().d(n3);
            int n4 = T.g(string);
            string = T.a(string, n4);
            return T.c(string, this.c.a());
        }
        throw new RuntimeException("bad opcode: " + this.dl);
    }

    com.growingio.b.o a(int n2) {
        switch (n2) {
            case 4: {
                return com.growingio.b.o.f;
            }
            case 5: {
                return com.growingio.b.o.g;
            }
            case 6: {
                return com.growingio.b.o.l;
            }
            case 7: {
                return com.growingio.b.o.m;
            }
            case 8: {
                return com.growingio.b.o.h;
            }
            case 9: {
                return com.growingio.b.o.i;
            }
            case 10: {
                return com.growingio.b.o.j;
            }
            case 11: {
                return com.growingio.b.o.k;
            }
        }
        throw new RuntimeException("bad atype: " + n2);
    }

    public int f() {
        if (this.dl == 188) {
            return 1;
        }
        if (this.dl == 189 || this.dl == 197) {
            int n2 = this.b.e(this.a + 1);
            String string = this.j().d(n2);
            return T.g(string) + (this.dl == 189 ? 1 : 0);
        }
        throw new RuntimeException("bad opcode: " + this.dl);
    }

    public int g() {
        if (this.dl == 197) {
            return this.b.c(this.a + 3);
        }
        return 1;
    }

    @Override
    public void a(String string) throws b {
        try {
            this.b(string);
        }
        catch (e var2_2) {
            throw new b(var2_2);
        }
        catch (ae var2_3) {
            throw new b(var2_3);
        }
        catch (i var2_4) {
            throw new b("broken method");
        }
    }

    private void b(String string) throws e, ae, i, b {
        Object object;
        int n2;
        int n3;
        String string2;
        this.c.i();
        Q q2 = this.j();
        int n4 = this.a;
        int n5 = 0;
        int n6 = 1;
        if (this.dl == 188) {
            n5 = this.b.c(this.a + 1);
            object = (V)this.a(n5);
            string2 = "[" + object.X();
            n3 = 2;
        } else if (this.dl == 189) {
            n5 = this.b.e(n4 + 1);
            string2 = q2.d(n5);
            string2 = string2.startsWith("[") ? "[" + string2 : "[L" + string2 + ";";
            n3 = 3;
        } else if (this.dl == 197) {
            n5 = this.b.e(this.a + 1);
            string2 = q2.d(n5);
            n6 = this.b.c(this.a + 3);
            n3 = 4;
        } else {
            throw new RuntimeException("bad opcode: " + this.dl);
        }
        com.growingio.b.o o2 = T.c(string2, this.c.a());
        object = new f(this.c);
        y y2 = this.b.c();
        com.growingio.b.o[] arro = new com.growingio.b.o[n6];
        for (n2 = 0; n2 < n6; ++n2) {
            arro[n2] = com.growingio.b.o.j;
        }
        n2 = y2.h();
        object.a("java.lang.Object", arro, true, n2, this.n());
        o.a(o2, string);
        int n7 = object.a(o2, true);
        object.a(new p(o2, this.dl, n5, n6));
        com.growingio.b.a.o o3 = object.a();
        o.a(arro, true, n2, o3);
        object.a(y2, n4);
        o3.j(1);
        o3.o(n7);
        object.b(string);
        o3.n(n7);
        this.a(n4, o3, n3);
    }
}

