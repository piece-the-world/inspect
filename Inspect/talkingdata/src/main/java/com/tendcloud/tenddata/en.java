/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.el;
import com.tendcloud.tenddata.em;
import com.tendcloud.tenddata.eo;
import com.tendcloud.tenddata.ep;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class en {
    en() {
    }

    static class j
    implements el,
    eo {
        String a = "";
        long b = 0;
        int c = 0;
        static final int d = 1;
        static final int e = 2;
        static final int f = 3;
        int g = 0;
        List h = new ArrayList();
        List i = new ArrayList();
        int j = 0;
        int k = 0;
        long l = 0;

        j() {
        }

        @Override
        public int a() {
            int n2 = ep.c(8) + ep.c(this.a) + ep.c(this.b) + ep.c(this.c) + ep.c(this.g) + ep.c(this.k) + ep.c(this.h.size());
            for (a a22 : this.h) {
                n2 += a22.a();
            }
            n2 += ep.c(this.i.size());
            for (b b2 : this.i) {
                n2 += b2.a();
            }
            return n2 += ep.c(this.l);
        }

        @Override
        public void messagePack(ep ep2) {
            ep2.b(8);
            ep2.a(this.a);
            ep2.a(this.b);
            ep2.a(this.c);
            ep2.a(this.g);
            ep2.b(this.h.size());
            for (a a22 : this.h) {
                ep2.a(a22);
            }
            ep2.b(this.i.size());
            for (b b2 : this.i) {
                ep2.a(b2);
            }
            ep2.a(this.k);
            ep2.a(this.l);
        }

        public String toString() {
            return "Session{" + "id:" + this.a + ",start:" + this.b + ",status:" + this.c + ",duration:" + this.g + ",connected:" + this.k + ",time_gap:" + this.l + '}';
        }
    }

    static class i
    implements eo {
        int a = -1;
        j b;
        g c;
        c d;

        i() {
        }

        @Override
        public void messagePack(ep ep2) {
            ep2.b(2);
            ep2.a(this.a);
            switch (this.a) {
                case 1: {
                    ep2.a(this.c);
                    break;
                }
                case 2: {
                    ep2.a(this.b);
                    break;
                }
                case 3: {
                    ep2.a(this.d);
                    break;
                }
                default: {
                    throw new IOException("unknown TMessageType");
                }
            }
        }
    }

    static class h
    implements el,
    eo {
        double a = 0.0;
        double b = 0.0;

        h() {
        }

        @Override
        public int a() {
            return ep.c(2) + ep.b(this.a) + ep.b(this.b);
        }

        @Override
        public void messagePack(ep ep2) {
            ep2.b(2);
            ep2.a(this.a);
            ep2.a(this.b);
        }
    }

    static class g
    implements el,
    eo {
        String a = "";
        int b = 0;
        float c = 0.0f;
        String d = "";
        String e = "";
        String f = "";
        int g = 0;
        int h = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;
        float n = 0.0f;
        float o = 0.0f;
        int p = 0;
        String q = "";
        String r = "";
        String s = "";
        String t = "";
        String u = "";
        String v = "";
        String w = "";
        boolean x = false;
        String y = "";
        String z = "";
        String A = "";
        String B = "";
        String C = "";

        g() {
        }

        @Override
        public void messagePack(ep ep2) {
            ep2.b(29);
            ep2.a(this.a);
            ep2.a(this.b);
            ep2.a(this.c);
            ep2.a(this.d);
            ep2.a(this.e);
            ep2.a(this.f);
            ep2.a(this.g);
            ep2.a(this.h);
            ep2.a(this.i);
            ep2.a(this.j);
            ep2.a(this.k);
            ep2.a(this.l);
            ep2.a(this.m);
            ep2.a(this.n);
            ep2.a(this.o);
            ep2.a(this.p);
            ep2.a(this.q);
            ep2.a(this.r);
            ep2.a(this.s);
            ep2.a(this.t);
            ep2.a(this.u);
            ep2.a(this.v);
            ep2.a(this.w);
            ep2.a(this.x);
            ep2.a(this.y);
            ep2.a(this.z);
            ep2.a(this.A);
            ep2.a(this.B);
            ep2.a(this.C);
        }

        @Override
        public int a() {
            return ep.c(29) + ep.c(this.a) + ep.c(this.b) + ep.b(this.c) + ep.c(this.d) + ep.c(this.e) + ep.c(this.f) + ep.c(this.g) + ep.c(this.h) + ep.c(this.i) + ep.c(this.j) + ep.c(this.k) + ep.c(this.l) + ep.c(this.m) + ep.b(this.n) + ep.b(this.o) + ep.c(this.p) + ep.c(this.q) + ep.c(this.r) + ep.c(this.s) + ep.c(this.t) + ep.c(this.u) + ep.c(this.v) + ep.c(this.w) + ep.b(this.x) + ep.c(this.y) + ep.c(this.z) + ep.c(this.A) + ep.c(this.B) + ep.c(this.C);
        }
    }

    static class f
    implements em,
    eo {
        String a = "";
        String b = "";
        d c = new d();
        e d = new e();
        List e = new ArrayList();
        long f = 0;
        long g = 0;
        long h = 0;
        Long[][] i;

        f() {
        }

        @Override
        public int a() {
            return ep.c(5) + ep.c(this.a) + ep.c(this.b) + this.c.a() + this.d.a();
        }

        @Override
        public void messagePack(ep ep2) {
            ep2.b(6);
            ep2.a(this.a);
            ep2.a(this.b);
            ep2.a(this.c);
            ep2.a(this.d);
            ep2.b(this.e.size());
            for (i i2 : this.e) {
                ep2.a(i2);
            }
            if (this.i == null) {
                ep2.b();
            } else {
                ep2.b(this.i.length);
                for (Long[] arrlong : this.i) {
                    ep2.a(arrlong);
                }
            }
        }
    }

    static class e
    implements el,
    eo {
        String a = "";
        String b = "";
        h c = new h();
        String d = "";
        String e = "";
        String f = "";
        String g = "";
        String h = "";
        int i = 8;
        String j = "";
        int k = -1;
        String l = "";
        boolean m = false;
        String n = "";
        String o = "";
        String p = "";
        String q = "";
        long r = 0;
        String s = "";
        String t = "";
        String u = "";
        int v;
        int w;
        String x = "";

        e() {
        }

        @Override
        public int a() {
            return ep.c(24) + ep.c(this.a) + ep.c(this.b) + this.c.a() + ep.c(this.d) + ep.c(this.e) + ep.c(this.f) + ep.c(this.g) + ep.c(this.h) + ep.c(this.i) + ep.c(this.j) + ep.c(this.k) + ep.c(this.l) + ep.b(this.m) + ep.c(this.n) + ep.c(this.o) + ep.c(this.p) + ep.c(this.q) + ep.c(this.r) + ep.c(this.s) + ep.c(this.t) + ep.c(this.u) + ep.c(this.v) + ep.c(this.w) + ep.c(this.x);
        }

        @Override
        public void messagePack(ep ep2) {
            ep2.b(24);
            ep2.a(this.a);
            ep2.a(this.b);
            ep2.a(this.c);
            ep2.a(this.d);
            ep2.a(this.e);
            ep2.a(this.f);
            ep2.a(this.g);
            ep2.a(this.h);
            ep2.a(this.i);
            ep2.a(this.j);
            ep2.a(this.k);
            ep2.a(this.l);
            ep2.a(this.m);
            ep2.a(this.n);
            ep2.a(this.o);
            ep2.a(this.p);
            ep2.a(this.q);
            ep2.a(this.r).a(this.s).a(this.t).a(this.u).a(this.v).a(this.w).a(this.x);
        }
    }

    static class d
    implements el,
    eo {
        String a = "";
        String b = "";
        String c = "";
        long d = 0;
        String e = "";
        String f = "";
        boolean g = false;
        long h = 0;
        long i = 0;

        d() {
        }

        @Override
        public int a() {
            return ep.c(9) + ep.c(this.a) + ep.c(this.b) + ep.c(this.c) + ep.c(this.d) + ep.c(this.e) + ep.c(this.f) + ep.b(this.g) + ep.c(this.h) + ep.c(this.i);
        }

        @Override
        public void messagePack(ep ep2) {
            ep2.b(9);
            ep2.a(this.a);
            ep2.a(this.b);
            ep2.a(this.c);
            ep2.a(this.d);
            ep2.a(this.e);
            ep2.a(this.f);
            ep2.a(this.g);
            ep2.a(this.h);
            ep2.a(this.i);
        }
    }

    static class c
    implements el,
    eo {
        long a = 0;
        int b = 1;
        String c = "";
        byte[] d = new byte[0];
        String e = "";

        c() {
        }

        @Override
        public int a() {
            return ep.c(5) + ep.c(this.a) + ep.c(this.b) + ep.c(this.c) + ep.b(this.d) + ep.c(this.e);
        }

        @Override
        public void messagePack(ep ep2) {
            ep2.b(5);
            ep2.a(this.a);
            ep2.a(this.b);
            ep2.a(this.c);
            ep2.a(this.d);
            ep2.a(this.e);
        }
    }

    static class b
    implements el,
    eo {
        String a = "";
        String b = "";
        int c = 0;
        long d;
        Map e;

        b() {
        }

        @Override
        public void messagePack(ep ep2) {
            ep2.b(5);
            ep2.a(this.a);
            ep2.a(this.b);
            ep2.a(this.c);
            ep2.a(this.d);
            ep2.a(this.e);
        }

        @Override
        public int a() {
            return ep.c(3) + ep.c(this.a) + ep.c(this.b) + ep.c(this.c);
        }

        public String toString() {
            return "AppEvent{" + "id:" + this.a + ",label:" + this.b + ",count:" + this.c + ",ts:" + this.d + ",kv:" + this.e + '}';
        }
    }

    static class a
    implements el,
    eo {
        String a = "";
        long b = 0;
        int c = 0;
        String d = "";

        a() {
        }

        @Override
        public int a() {
            return ep.c(4) + ep.c(this.a) + ep.c(this.b) + ep.c(this.c) + ep.c(this.d);
        }

        @Override
        public void messagePack(ep ep2) {
            ep2.b(4);
            ep2.a(this.a);
            ep2.a(this.b);
            ep2.a(this.c);
            ep2.a(this.d);
        }

        public String toString() {
            return "Activity{" + "name:" + this.a + ",start:" + this.b + ",duration:" + this.c + ",refer:" + this.d;
        }
    }

}

