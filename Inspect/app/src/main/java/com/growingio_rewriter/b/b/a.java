/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.b;

import com.growingio.b.a.Q;
import com.growingio.b.a.T;
import com.growingio.b.a.ab;
import com.growingio.b.a.ac;
import com.growingio.b.a.as;
import com.growingio.b.a.bm;
import com.growingio.b.a.h;
import com.growingio.b.a.p;
import com.growingio.b.a.y;
import com.growingio.b.ae;
import com.growingio.b.b;
import com.growingio.b.b.e;
import com.growingio.b.g;
import com.growingio.b.o;
import java.util.HashMap;
import java.util.Map;

public class a {
    private o b;
    private int c;
    private HashMap d;
    static final String a = "Inner";

    public a(o o2) {
        this.b = o2;
        this.c = 1;
        this.d = new HashMap();
    }

    public String a(o o2, String string, as as2) throws e {
        String string2 = "<init>:" + string;
        String string3 = (String)this.d.get(string2);
        if (string3 != null) {
            return string3;
        }
        string3 = T.a("Inner", string);
        p p2 = this.b.i();
        try {
            Q q2 = p2.c();
            g g2 = this.b.a();
            as as3 = new as(q2, "<init>", string3);
            as3.a(0);
            as3.a(new bm(q2));
            ab ab2 = as2.i();
            if (ab2 != null) {
                as3.a(ab2.a(q2, null));
            }
            o[] arro = T.a(string, g2);
            com.growingio.b.a.o o3 = new com.growingio.b.a.o(q2);
            o3.n(0);
            int n2 = 1;
            for (int i2 = 0; i2 < arro.length; ++i2) {
                n2 += o3.a(n2, arro[i2]);
            }
            o3.e(n2 + 1);
            o3.c(this.b, "<init>", string);
            o3.d((o)null);
            as3.a(o3.e());
            p2.a(as3);
        }
        catch (b var7_8) {
            throw new e(var7_8);
        }
        catch (ae var7_9) {
            throw new e(var7_9);
        }
        this.d.put(string2, string3);
        return string3;
    }

    public String a(String string, String string2, String string3, as as2) throws e {
        String string4 = string + ":" + string2;
        String string5 = (String)this.d.get(string4);
        if (string5 != null) {
            return string5;
        }
        p p2 = this.b.i();
        string5 = this.a(p2);
        try {
            Q q2 = p2.c();
            g g2 = this.b.a();
            as as3 = new as(q2, string5, string3);
            as3.a(8);
            as3.a(new bm(q2));
            ab ab2 = as2.i();
            if (ab2 != null) {
                as3.a(ab2.a(q2, null));
            }
            o[] arro = T.a(string3, g2);
            int n2 = 0;
            com.growingio.b.a.o o2 = new com.growingio.b.a.o(q2);
            for (int i2 = 0; i2 < arro.length; ++i2) {
                n2 += o2.a(n2, arro[i2]);
            }
            o2.e(n2);
            if (string2 == string3) {
                o2.d(this.b, string, string2);
            } else {
                o2.e(this.b, string, string2);
            }
            o2.d(T.b(string2, g2));
            as3.a(o2.e());
            p2.a(as3);
        }
        catch (b var8_9) {
            throw new e(var8_9);
        }
        catch (ae var8_10) {
            throw new e(var8_10);
        }
        this.d.put(string4, string5);
        return string5;
    }

    public as a(ac ac2, boolean bl2) throws e {
        String string = ac2.b();
        String string2 = string + ":getter";
        Object v2 = this.d.get(string2);
        if (v2 != null) {
            return (as)v2;
        }
        p p2 = this.b.i();
        String string3 = this.a(p2);
        try {
            Q q2 = p2.c();
            g g2 = this.b.a();
            String string4 = ac2.d();
            String string5 = bl2 ? "()" + string4 : "(" + T.b(this.b) + ")" + string4;
            as as2 = new as(q2, string3, string5);
            as2.a(8);
            as2.a(new bm(q2));
            com.growingio.b.a.o o2 = new com.growingio.b.a.o(q2);
            if (bl2) {
                o2.b(com.growingio.b.a.o.a, string, string4);
            } else {
                o2.n(0);
                o2.a(com.growingio.b.a.o.a, string, string4);
                o2.e(1);
            }
            o2.d(T.c(string4, g2));
            as2.a(o2.e());
            p2.a(as2);
            this.d.put(string2, as2);
            return as2;
        }
        catch (b var8_9) {
            throw new e(var8_9);
        }
        catch (ae var8_10) {
            throw new e(var8_10);
        }
    }

    public as b(ac ac2, boolean bl2) throws e {
        String string = ac2.b();
        String string2 = string + ":setter";
        Object v2 = this.d.get(string2);
        if (v2 != null) {
            return (as)v2;
        }
        p p2 = this.b.i();
        String string3 = this.a(p2);
        try {
            int n2;
            Q q2 = p2.c();
            g g2 = this.b.a();
            String string4 = ac2.d();
            String string5 = bl2 ? "(" + string4 + ")V" : "(" + T.b(this.b) + string4 + ")V";
            as as2 = new as(q2, string3, string5);
            as2.a(8);
            as2.a(new bm(q2));
            com.growingio.b.a.o o2 = new com.growingio.b.a.o(q2);
            if (bl2) {
                n2 = o2.a(0, T.c(string4, g2));
                o2.g(com.growingio.b.a.o.a, string, string4);
            } else {
                o2.n(0);
                n2 = o2.a(1, T.c(string4, g2)) + 1;
                o2.f(com.growingio.b.a.o.a, string, string4);
            }
            o2.d((o)null);
            o2.e(n2);
            as2.a(o2.e());
            p2.a(as2);
            this.d.put(string2, as2);
            return as2;
        }
        catch (b var8_9) {
            throw new e(var8_9);
        }
        catch (ae var8_10) {
            throw new e(var8_10);
        }
    }

    private String a(p p2) {
        String string;
        while (p2.d(string = "access$" + this.c++) != null) {
        }
        return string;
    }
}

