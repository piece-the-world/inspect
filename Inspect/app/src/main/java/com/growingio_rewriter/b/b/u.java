/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.b;

import com.growingio.b.b.a.a;
import com.growingio.b.b.a.b;
import com.growingio.b.b.a.c;
import com.growingio.b.b.a.d;
import com.growingio.b.b.a.e;
import com.growingio.b.b.a.f;
import com.growingio.b.b.a.g;
import com.growingio.b.b.a.h;
import com.growingio.b.b.a.i;
import com.growingio.b.b.a.j;
import com.growingio.b.b.a.k;
import com.growingio.b.b.a.l;
import com.growingio.b.b.a.m;
import com.growingio.b.b.a.o;
import com.growingio.b.b.a.p;
import com.growingio.b.b.a.q;
import com.growingio.b.b.a.r;
import com.growingio.b.b.a.s;
import com.growingio.b.b.a.t;
import com.growingio.b.b.a.v;
import com.growingio.b.b.n;
import com.growingio.b.b.w;
import com.growingio.b.b.x;
import com.growingio.b.b.z;

public final class u
implements z {
    private n a;
    private static final int[] b = new int[]{0, 0, 0, 0, 1, 6, 0, 0, 0, 1, 2, 0, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 4, 0};

    public u(n n2) {
        this.a = n2;
    }

    public boolean a() {
        return this.a.b() >= 0;
    }

    public a a(w w2) throws com.growingio.b.b.e {
        a a2 = this.b(w2);
        if (a2 instanceof q) {
            return this.a(w2, (q)a2);
        }
        return a2;
    }

    public a b(w w2) throws com.growingio.b.b.e {
        i i2;
        a a2 = this.b();
        boolean bl2 = false;
        if (this.a.b() == 400 && this.a.a(1) == 40) {
            i2 = new i(344, 0);
            bl2 = true;
        } else {
            i2 = this.e(w2);
        }
        if (this.a.a() != 400) {
            throw new x(this.a);
        }
        String string = bl2 ? "<init>" : this.a.c();
        i2.a(new v(string));
        if (bl2 || this.a.b() == 40) {
            return this.a(w2, bl2, a2, i2);
        }
        return this.a(w2, a2, i2);
    }

    private l a(w w2, a a2, i i2) throws com.growingio.b.b.e {
        int n2;
        b b2 = null;
        if (this.a.b() == 61) {
            this.a.a();
            b2 = this.d(w2);
        }
        if ((n2 = this.a.a()) == 59) {
            return new l(a2, new a(i2, new a(b2)));
        }
        if (n2 == 44) {
            throw new com.growingio.b.b.e("only one field can be declared in one declaration", this.a);
        }
        throw new x(this.a);
    }

    private q a(w w2, boolean bl2, a a2, i i2) throws com.growingio.b.b.e {
        if (this.a.a() != 40) {
            throw new x(this.a);
        }
        a a3 = null;
        if (this.a.b() != 41) {
            do {
                a3 = a.a(a3, (b)this.f(w2));
                int n2 = this.a.b();
                if (n2 == 44) {
                    this.a.a();
                    continue;
                }
                if (n2 == 41) break;
            } while (true);
        }
        this.a.a();
        i2.b(this.e());
        if (bl2 && i2.h() > 0) {
            throw new x(this.a);
        }
        a a4 = null;
        if (this.a.b() == 341) {
            this.a.a();
            do {
                a4 = a.a(a4, (b)this.C(w2));
                if (this.a.b() != 44) break;
                this.a.a();
            } while (true);
        }
        return new q(a2, new a(i2, a.a(a3, a4, null)));
    }

    public q a(w w2, q q2) throws com.growingio.b.b.e {
        t t2 = null;
        if (this.a.b() == 59) {
            this.a.a();
        } else {
            t2 = this.g(w2);
            if (t2 == null) {
                t2 = new t(66);
            }
        }
        q2.a(4).c(t2);
        return q2;
    }

    private a b() {
        int n2;
        a a2 = null;
        while ((n2 = this.a.b()) == 300 || n2 == 315 || n2 == 332 || n2 == 331 || n2 == 330 || n2 == 338 || n2 == 335 || n2 == 345 || n2 == 342 || n2 == 347) {
            a2 = new a(new o(this.a.a()), a2);
        }
        return a2;
    }

    private i e(w w2) throws com.growingio.b.b.e {
        int n2 = this.a.b();
        if (u.a(n2) || n2 == 344) {
            this.a.a();
            int n3 = this.e();
            return new i(n2, n3);
        }
        a a2 = this.C(w2);
        int n4 = this.e();
        return new i(a2, n4);
    }

    private static boolean a(int n2) {
        return n2 == 301 || n2 == 303 || n2 == 306 || n2 == 334 || n2 == 324 || n2 == 326 || n2 == 317 || n2 == 312;
    }

    private i f(w w2) throws com.growingio.b.b.e {
        i i2 = this.e(w2);
        if (this.a.a() != 400) {
            throw new x(this.a);
        }
        String string = this.a.c();
        i2.a(new v(string));
        i2.b(this.e());
        w2.a(string, i2);
        return i2;
    }

    public t c(w w2) throws com.growingio.b.b.e {
        int n2 = this.a.b();
        if (n2 == 123) {
            return this.g(w2);
        }
        if (n2 == 59) {
            this.a.a();
            return new t(66);
        }
        if (n2 == 400 && this.a.a(1) == 58) {
            this.a.a();
            String string = this.a.c();
            this.a.a();
            return t.a(76, new v(string), this.c(w2));
        }
        if (n2 == 320) {
            return this.h(w2);
        }
        if (n2 == 346) {
            return this.i(w2);
        }
        if (n2 == 311) {
            return this.j(w2);
        }
        if (n2 == 318) {
            return this.k(w2);
        }
        if (n2 == 343) {
            return this.p(w2);
        }
        if (n2 == 337) {
            return this.l(w2);
        }
        if (n2 == 338) {
            return this.o(w2);
        }
        if (n2 == 333) {
            return this.q(w2);
        }
        if (n2 == 340) {
            return this.r(w2);
        }
        if (n2 == 302) {
            return this.s(w2);
        }
        if (n2 == 309) {
            return this.t(w2);
        }
        return this.a(w2, false);
    }

    private t g(w w2) throws com.growingio.b.b.e {
        if (this.a.a() != 123) {
            throw new x(this.a);
        }
        t t2 = null;
        w w3 = new w(w2);
        while (this.a.b() != 125) {
            t t3 = this.c(w3);
            if (t3 == null) continue;
            t2 = (t)a.a((a)t2, new t(66, t3));
        }
        this.a.a();
        if (t2 == null) {
            return new t(66);
        }
        return t2;
    }

    private t h(w w2) throws com.growingio.b.b.e {
        t t2;
        int n2 = this.a.a();
        b b2 = this.x(w2);
        t t3 = this.c(w2);
        if (this.a.b() == 313) {
            this.a.a();
            t2 = this.c(w2);
        } else {
            t2 = null;
        }
        return new t(n2, b2, new a(t3, new a(t2)));
    }

    private t i(w w2) throws com.growingio.b.b.e {
        int n2 = this.a.a();
        b b2 = this.x(w2);
        t t2 = this.c(w2);
        return new t(n2, b2, t2);
    }

    private t j(w w2) throws com.growingio.b.b.e {
        int n2 = this.a.a();
        t t2 = this.c(w2);
        if (this.a.a() != 346 || this.a.a() != 40) {
            throw new x(this.a);
        }
        b b2 = this.d(w2);
        if (this.a.a() != 41 || this.a.a() != 59) {
            throw new x(this.a);
        }
        return new t(n2, b2, t2);
    }

    private t k(w w2) throws com.growingio.b.b.e {
        t t2;
        int n2 = this.a.a();
        w w3 = new w(w2);
        if (this.a.a() != 40) {
            throw new x(this.a);
        }
        if (this.a.b() == 59) {
            this.a.a();
            t2 = null;
        } else {
            t2 = this.a(w3, true);
        }
        b b2 = this.a.b() == 59 ? null : this.d(w3);
        if (this.a.a() != 59) {
            throw new com.growingio.b.b.e("; is missing", this.a);
        }
        t t3 = this.a.b() == 41 ? null : this.u(w3);
        if (this.a.a() != 41) {
            throw new com.growingio.b.b.e(") is missing", this.a);
        }
        t t4 = this.c(w3);
        return new t(n2, t2, new a(b2, new a(t3, t4)));
    }

    private t l(w w2) throws com.growingio.b.b.e {
        int n2 = this.a.a();
        b b2 = this.x(w2);
        t t2 = this.m(w2);
        return new t(n2, b2, t2);
    }

    private t m(w w2) throws com.growingio.b.b.e {
        if (this.a.a() != 123) {
            throw new x(this.a);
        }
        w w3 = new w(w2);
        t t2 = this.n(w3);
        if (t2 == null) {
            throw new com.growingio.b.b.e("empty switch block", this.a);
        }
        int n2 = t2.g();
        if (n2 != 304 && n2 != 310) {
            throw new com.growingio.b.b.e("no case or default in a switch block", this.a);
        }
        t t3 = new t(66, t2);
        while (this.a.b() != 125) {
            t t4 = this.n(w3);
            if (t4 == null) continue;
            int n3 = t4.g();
            if (n3 == 304 || n3 == 310) {
                t3 = (t)a.a((a)t3, new t(66, t4));
                t2 = t4;
                continue;
            }
            t2 = (t)a.a((a)t2, new t(66, t4));
        }
        this.a.a();
        return t3;
    }

    private t n(w w2) throws com.growingio.b.b.e {
        int n2 = this.a.b();
        if (n2 != 304 && n2 != 310) {
            return this.c(w2);
        }
        this.a.a();
        t t2 = n2 == 304 ? new t(n2, this.d(w2)) : new t(310);
        if (this.a.a() != 58) {
            throw new com.growingio.b.b.e(": is missing", this.a);
        }
        return t2;
    }

    private t o(w w2) throws com.growingio.b.b.e {
        int n2 = this.a.a();
        if (this.a.a() != 40) {
            throw new x(this.a);
        }
        b b2 = this.d(w2);
        if (this.a.a() != 41) {
            throw new x(this.a);
        }
        t t2 = this.g(w2);
        return new t(n2, b2, t2);
    }

    private t p(w w2) throws com.growingio.b.b.e {
        void var4_7;
        this.a.a();
        t t2 = this.g(w2);
        a a2 = null;
        while (this.a.b() == 305) {
            this.a.a();
            if (this.a.a() != 40) {
                throw new x(this.a);
            }
            w w3 = new w(w2);
            i i2 = this.f(w3);
            if (i2.h() > 0 || i2.g() != 307) {
                throw new x(this.a);
            }
            if (this.a.a() != 41) {
                throw new x(this.a);
            }
            t t3 = this.g(w3);
            a2 = a.a(a2, new s(i2, t3));
        }
        Object var4_5 = null;
        if (this.a.b() == 316) {
            this.a.a();
            t t4 = this.g(w2);
        }
        return t.a(343, t2, a2, (b)var4_7);
    }

    private t q(w w2) throws com.growingio.b.b.e {
        int n2 = this.a.a();
        t t2 = new t(n2);
        if (this.a.b() != 59) {
            t2.a(this.d(w2));
        }
        if (this.a.a() != 59) {
            throw new com.growingio.b.b.e("; is missing", this.a);
        }
        return t2;
    }

    private t r(w w2) throws com.growingio.b.b.e {
        int n2 = this.a.a();
        b b2 = this.d(w2);
        if (this.a.a() != 59) {
            throw new com.growingio.b.b.e("; is missing", this.a);
        }
        return new t(n2, b2);
    }

    private t s(w w2) throws com.growingio.b.b.e {
        return this.t(w2);
    }

    private t t(w w2) throws com.growingio.b.b.e {
        int n2 = this.a.a();
        t t2 = new t(n2);
        int n3 = this.a.a();
        if (n3 == 400) {
            t2.a(new v(this.a.c()));
            n3 = this.a.a();
        }
        if (n3 != 59) {
            throw new com.growingio.b.b.e("; is missing", this.a);
        }
        return t2;
    }

    private t a(w w2, boolean bl2) throws com.growingio.b.b.e {
        int n2;
        int n3 = this.a.b();
        while (n3 == 315) {
            this.a.a();
            n3 = this.a.b();
        }
        if (u.a(n3)) {
            n3 = this.a.a();
            int n4 = this.e();
            return this.a(w2, new i(n3, n4));
        }
        if (n3 == 400 && (n2 = this.d(0)) >= 0 && this.a.a(n2) == 400) {
            a a2 = this.C(w2);
            int n5 = this.e();
            return this.a(w2, new i(a2, n5));
        }
        t t2 = bl2 ? this.u(w2) : new t(69, this.d(w2));
        if (this.a.a() != 59) {
            throw new com.growingio.b.b.e("; is missing", this.a);
        }
        return t2;
    }

    private t u(w w2) throws com.growingio.b.b.e {
        t t2 = null;
        do {
            t t3 = new t(69, this.d(w2));
            t2 = (t)a.a((a)t2, new t(66, t3));
            if (this.a.b() != 44) break;
            this.a.a();
        } while (true);
        return t2;
    }

    private t a(w w2, i i2) throws com.growingio.b.b.e {
        int n2;
        t t2 = null;
        do {
            t2 = (t)a.a((a)t2, new t(68, this.b(w2, i2)));
            n2 = this.a.a();
            if (n2 != 59) continue;
            return t2;
        } while (n2 == 44);
        throw new com.growingio.b.b.e("; is missing", this.a);
    }

    private i b(w w2, i i2) throws com.growingio.b.b.e {
        if (this.a.a() != 400 || i2.g() == 344) {
            throw new x(this.a);
        }
        String string = this.a.c();
        v v2 = new v(string);
        int n2 = this.e();
        b b2 = null;
        if (this.a.b() == 61) {
            this.a.a();
            b2 = this.v(w2);
        }
        i i3 = i2.a(v2, n2, b2);
        w2.a(string, i3);
        return i3;
    }

    private b v(w w2) throws com.growingio.b.b.e {
        if (this.a.b() == 123) {
            return this.w(w2);
        }
        return this.d(w2);
    }

    private c w(w w2) throws com.growingio.b.b.e {
        this.a.a();
        b b2 = this.d(w2);
        c c2 = new c(b2);
        while (this.a.b() == 44) {
            this.a.a();
            b2 = this.d(w2);
            a.a((a)c2, b2);
        }
        if (this.a.a() != 125) {
            throw new x(this.a);
        }
        return c2;
    }

    private b x(w w2) throws com.growingio.b.b.e {
        if (this.a.a() != 40) {
            throw new x(this.a);
        }
        b b2 = this.d(w2);
        if (this.a.a() != 41) {
            throw new x(this.a);
        }
        return b2;
    }

    public b d(w w2) throws com.growingio.b.b.e {
        b b2 = this.y(w2);
        if (!u.b(this.a.b())) {
            return b2;
        }
        int n2 = this.a.a();
        b b3 = this.d(w2);
        return d.a(n2, b2, b3);
    }

    private static boolean b(int n2) {
        return n2 == 61 || n2 == 351 || n2 == 352 || n2 == 353 || n2 == 354 || n2 == 355 || n2 == 356 || n2 == 360 || n2 == 361 || n2 == 365 || n2 == 367 || n2 == 371;
    }

    private b y(w w2) throws com.growingio.b.b.e {
        b b2 = this.z(w2);
        if (this.a.b() == 63) {
            this.a.a();
            b b3 = this.d(w2);
            if (this.a.a() != 58) {
                throw new com.growingio.b.b.e(": is missing", this.a);
            }
            b b4 = this.d(w2);
            return new h(b2, b3, b4);
        }
        return b2;
    }

    private b z(w w2) throws com.growingio.b.b.e {
        b b2 = this.A(w2);
        int n2;
        int n3;
        while ((n2 = this.c(n3 = this.a.b())) != 0) {
            b2 = this.a(w2, b2, n2);
        }
        return b2;
    }

    private b a(w w2, b b2) throws com.growingio.b.b.e {
        int n2 = this.a.b();
        if (u.a(n2)) {
            this.a.a();
            int n3 = this.e();
            return new m(n2, n3, b2);
        }
        a a2 = this.C(w2);
        int n4 = this.e();
        return new m(a2, n4, b2);
    }

    private b a(w w2, b b2, int n2) throws com.growingio.b.b.e {
        int n3;
        int n4;
        int n5 = this.a.a();
        if (n5 == 323) {
            return this.a(w2, b2);
        }
        b b3 = this.A(w2);
        while ((n4 = this.c(n3 = this.a.b())) != 0 && n2 > n4) {
            b3 = this.a(w2, b3, n4);
        }
        return e.a(n5, b2, b3);
    }

    private int c(int n2) {
        if (33 <= n2 && n2 <= 63) {
            return b[n2 - 33];
        }
        if (n2 == 94) {
            return 7;
        }
        if (n2 == 124) {
            return 8;
        }
        if (n2 == 369) {
            return 9;
        }
        if (n2 == 368) {
            return 10;
        }
        if (n2 == 358 || n2 == 350) {
            return 5;
        }
        if (n2 == 357 || n2 == 359 || n2 == 323) {
            return 4;
        }
        if (n2 == 364 || n2 == 366 || n2 == 370) {
            return 3;
        }
        return 0;
    }

    private b A(w w2) throws com.growingio.b.b.e {
        switch (this.a.b()) {
            case 33: 
            case 43: 
            case 45: 
            case 126: 
            case 362: 
            case 363: {
                int n2 = this.a.a();
                if (n2 == 45) {
                    int n3 = this.a.b();
                    switch (n3) {
                        case 401: 
                        case 402: 
                        case 403: {
                            this.a.a();
                            return new com.growingio.b.b.a.n(- this.a.d(), n3);
                        }
                        case 404: 
                        case 405: {
                            this.a.a();
                            return new j(- this.a.e(), n3);
                        }
                    }
                }
                return k.a(n2, this.A(w2));
            }
            case 40: {
                return this.B(w2);
            }
        }
        return this.D(w2);
    }

    private b B(w w2) throws com.growingio.b.b.e {
        int n2 = this.a.a(1);
        if (u.a(n2) && this.c()) {
            this.a.a();
            this.a.a();
            int n3 = this.e();
            if (this.a.a() != 41) {
                throw new com.growingio.b.b.e(") is missing", this.a);
            }
            return new g(n2, n3, this.A(w2));
        }
        if (n2 == 400 && this.d()) {
            this.a.a();
            a a2 = this.C(w2);
            int n4 = this.e();
            if (this.a.a() != 41) {
                throw new com.growingio.b.b.e(") is missing", this.a);
            }
            return new g(a2, n4, this.A(w2));
        }
        return this.D(w2);
    }

    private boolean c() {
        int n2;
        int n3 = 2;
        while ((n2 = this.a.a(n3++)) == 91) {
            if (this.a.a(n3++) == 93) continue;
            return false;
        }
        return this.a.a(n3 - 1) == 41;
    }

    private boolean d() {
        int n2 = this.d(1);
        if (n2 < 0) {
            return false;
        }
        int n3 = this.a.a(n2);
        if (n3 != 41) {
            return false;
        }
        n3 = this.a.a(n2 + 1);
        return n3 == 40 || n3 == 412 || n3 == 406 || n3 == 400 || n3 == 339 || n3 == 336 || n3 == 328 || n3 == 410 || n3 == 411 || n3 == 403 || n3 == 402 || n3 == 401 || n3 == 405 || n3 == 404;
    }

    private int d(int n2) {
        int n3;
        while (this.a.a(++n2) == 46) {
            if (this.a.a(++n2) == 400) continue;
            return -1;
        }
        while ((n3 = this.a.a(n2++)) == 91) {
            if (this.a.a(n2++) == 93) continue;
            return -1;
        }
        return n2 - 1;
    }

    private int e() throws com.growingio.b.b.e {
        int n2 = 0;
        while (this.a.b() == 91) {
            ++n2;
            this.a.a();
            if (this.a.a() == 93) continue;
            throw new com.growingio.b.b.e("] is missing", this.a);
        }
        return n2;
    }

    private a C(w w2) throws com.growingio.b.b.e {
        a a2 = null;
        do {
            if (this.a.a() != 400) {
                throw new x(this.a);
            }
            a2 = a.a(a2, new v(this.a.c()));
            if (this.a.b() != 46) break;
            this.a.a();
        } while (true);
        return a2;
    }

    private b D(w w2) throws com.growingio.b.b.e {
        int n2 = this.a.b();
        switch (n2) {
            case 401: 
            case 402: 
            case 403: {
                this.a.a();
                return new com.growingio.b.b.a.n(this.a.d(), n2);
            }
            case 404: 
            case 405: {
                this.a.a();
                return new j(this.a.e(), n2);
            }
        }
        b b2 = this.E(w2);
        block11 : do {
            switch (this.a.b()) {
                String string;
                int n3;
                case 40: {
                    b2 = this.b(w2, b2);
                    continue block11;
                }
                case 91: {
                    if (this.a.a(1) == 93) {
                        int n4 = this.e();
                        if (this.a.a() != 46 || this.a.a() != 307) {
                            throw new x(this.a);
                        }
                        b2 = this.a(b2, n4);
                        continue block11;
                    }
                    b b3 = this.H(w2);
                    if (b3 == null) {
                        throw new x(this.a);
                    }
                    b2 = k.b(65, b2, b3);
                    continue block11;
                }
                case 362: 
                case 363: {
                    n3 = this.a.a();
                    b2 = k.b(n3, null, b2);
                    continue block11;
                }
                case 46: {
                    this.a.a();
                    n3 = this.a.a();
                    if (n3 == 307) {
                        b2 = this.a(b2, 0);
                        continue block11;
                    }
                    if (n3 == 336) {
                        b2 = k.b(46, new v(this.a(b2)), new o(n3));
                        continue block11;
                    }
                    if (n3 == 400) {
                        string = this.a.c();
                        b2 = k.b(46, b2, new p(string));
                        continue block11;
                    }
                    throw new com.growingio.b.b.e("missing member name", this.a);
                }
                case 35: {
                    this.a.a();
                    n3 = this.a.a();
                    if (n3 != 400) {
                        throw new com.growingio.b.b.e("missing static member name", this.a);
                    }
                    string = this.a.c();
                    b2 = k.b(35, new v(this.a(b2)), new p(string));
                    continue block11;
                }
            }
            break;
        } while (true);
        return b2;
    }

    private b a(b b2, int n2) throws com.growingio.b.b.e {
        String string = this.a(b2);
        if (n2 > 0) {
            StringBuffer stringBuffer = new StringBuffer();
            while (n2-- > 0) {
                stringBuffer.append('[');
            }
            stringBuffer.append('L').append(string.replace('.', '/')).append(';');
            string = stringBuffer.toString();
        }
        return k.b(46, new v(string), new p("class"));
    }

    private b a(int n2, int n3) throws com.growingio.b.b.e {
        String string;
        if (n3 > 0) {
            String string2 = com.growingio.b.b.b.b(n2, n3);
            return k.b(46, new v(string2), new p("class"));
        }
        switch (n2) {
            case 301: {
                string = "java.lang.Boolean";
                break;
            }
            case 303: {
                string = "java.lang.Byte";
                break;
            }
            case 306: {
                string = "java.lang.Character";
                break;
            }
            case 334: {
                string = "java.lang.Short";
                break;
            }
            case 324: {
                string = "java.lang.Integer";
                break;
            }
            case 326: {
                string = "java.lang.Long";
                break;
            }
            case 317: {
                string = "java.lang.Float";
                break;
            }
            case 312: {
                string = "java.lang.Double";
                break;
            }
            case 344: {
                string = "java.lang.Void";
                break;
            }
            default: {
                throw new com.growingio.b.b.e("invalid builtin type: " + n2);
            }
        }
        return k.b(35, new v(string), new p("TYPE"));
    }

    private b b(w w2, b b2) throws com.growingio.b.b.e {
        int n2;
        int n3;
        if (b2 instanceof o ? (n3 = ((o)b2).c()) != 339 && n3 != 336 : !(b2 instanceof v) && b2 instanceof k && (n2 = ((k)b2).h()) != 46 && n2 != 35) {
            throw new x(this.a);
        }
        return f.b(b2, this.I(w2));
    }

    private String a(b b2) throws com.growingio.b.b.e {
        StringBuffer stringBuffer = new StringBuffer();
        this.a(b2, stringBuffer);
        return stringBuffer.toString();
    }

    private void a(b b2, StringBuffer stringBuffer) throws com.growingio.b.b.e {
        k k2;
        if (b2 instanceof v) {
            stringBuffer.append(((v)b2).d());
            return;
        }
        if (b2 instanceof k && (k2 = (k)b2).h() == 46) {
            this.a(k2.i(), stringBuffer);
            stringBuffer.append('.');
            this.a(k2.j(), stringBuffer);
            return;
        }
        throw new com.growingio.b.b.e("bad static member access", this.a);
    }

    private b E(w w2) throws com.growingio.b.b.e {
        int n2 = this.a.a();
        switch (n2) {
            case 336: 
            case 339: 
            case 410: 
            case 411: 
            case 412: {
                return new o(n2);
            }
            case 400: {
                String string = this.a.c();
                i i2 = w2.a(string);
                if (i2 == null) {
                    return new p(string);
                }
                return new com.growingio.b.b.a.w(string, i2);
            }
            case 406: {
                return new com.growingio.b.b.a.u(this.a.c());
            }
            case 328: {
                return this.F(w2);
            }
            case 40: {
                b b2 = this.d(w2);
                if (this.a.a() == 41) {
                    return b2;
                }
                throw new com.growingio.b.b.e(") is missing", this.a);
            }
        }
        if (u.a(n2) || n2 == 344) {
            int n3 = this.e();
            if (this.a.a() == 46 && this.a.a() == 307) {
                return this.a(n2, n3);
            }
        }
        throw new x(this.a);
    }

    private r F(w w2) throws com.growingio.b.b.e {
        c c2 = null;
        int n2 = this.a.b();
        if (u.a(n2)) {
            this.a.a();
            a a2 = this.G(w2);
            if (this.a.b() == 123) {
                c2 = this.w(w2);
            }
            return new r(n2, a2, c2);
        }
        if (n2 == 400) {
            a a3 = this.C(w2);
            n2 = this.a.b();
            if (n2 == 40) {
                a a4 = this.I(w2);
                return new r(a3, a4);
            }
            if (n2 == 91) {
                a a5 = this.G(w2);
                if (this.a.b() == 123) {
                    c2 = this.w(w2);
                }
                return r.a(a3, a5, c2);
            }
        }
        throw new x(this.a);
    }

    private a G(w w2) throws com.growingio.b.b.e {
        a a2 = null;
        while (this.a.b() == 91) {
            a2 = a.a(a2, this.H(w2));
        }
        return a2;
    }

    private b H(w w2) throws com.growingio.b.b.e {
        this.a.a();
        if (this.a.b() == 93) {
            this.a.a();
            return null;
        }
        b b2 = this.d(w2);
        if (this.a.a() != 93) {
            throw new com.growingio.b.b.e("] is missing", this.a);
        }
        return b2;
    }

    private a I(w w2) throws com.growingio.b.b.e {
        if (this.a.a() != 40) {
            throw new com.growingio.b.b.e("( is missing", this.a);
        }
        a a2 = null;
        if (this.a.b() != 41) {
            do {
                a2 = a.a(a2, this.d(w2));
                if (this.a.b() != 44) break;
                this.a.a();
            } while (true);
        }
        if (this.a.a() != 41) {
            throw new com.growingio.b.b.e(") is missing", this.a);
        }
        return a2;
    }
}

