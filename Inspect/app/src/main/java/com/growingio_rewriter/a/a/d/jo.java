/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.jl;
import com.growingio.a.a.d.jp;
import com.growingio.a.a.d.kO;

class jo {
    final kO<E> a;
    jl<E> b;
    final /* synthetic */ jl c;

    jo(kO<E> var1_1) {
        this.c = var1_1;
        this.a = kO2;
    }

    int a(int n2, int n3) {
        return this.a.compare(this.c.c(n2), this.c.c(n3));
    }

    jp<E> a(int n2, int n3, E e2) {
        int n4 = this.d(n3, e2);
        if (n4 == n3) {
            return null;
        }
        Object e3 = n4 < n2 ? this.c.c(n2) : this.c.c(this.g(n2));
        if (this.b.b(n4, e2) < n2) {
            return new jp<E>(e2, e3);
        }
        return null;
    }

    void a(int n2, E e2) {
        Object object;
        int n3 = this.c(n2, e2);
        if (n3 == n2) {
            object = this;
        } else {
            n2 = n3;
            object = this.b;
        }
        object.b(n2, e2);
    }

    int b(int n2, E e2) {
        int n3;
        Object e3;
        while (n2 > 2 && this.a.compare(e3 = this.c.c(n3 = this.h(n2)), e2) > 0) {
            jl.a((jl)this.c)[n2] = e3;
            n2 = n3;
        }
        jl.a((jl)this.c)[n2] = e2;
        return n2;
    }

    int b(int n2, int n3) {
        if (n2 >= jl.b(this.c)) {
            return -1;
        }
        aU.b(n2 > 0);
        int n4 = Math.min(n2, jl.b(this.c) - n3) + n3;
        int n5 = n2;
        for (int i2 = n2 + 1; i2 < n4; ++i2) {
            if (this.a(i2, n5) >= 0) continue;
            n5 = i2;
        }
        return n5;
    }

    int a(int n2) {
        return this.b(this.e(n2), 2);
    }

    int b(int n2) {
        int n3 = this.e(n2);
        if (n3 < 0) {
            return -1;
        }
        return this.b(this.e(n3), 4);
    }

    int c(int n2, E e2) {
        int n3;
        int n4;
        Object e3;
        if (n2 == 0) {
            jl.a((jl)this.c)[0] = e2;
            return 0;
        }
        int n5 = this.g(n2);
        Object e4 = this.c.c(n5);
        if (n5 != 0 && (n4 = this.f(n3 = this.g(n5))) != n5 && this.e(n4) >= jl.b(this.c) && this.a.compare(e3 = this.c.c(n4), e4) < 0) {
            n5 = n4;
            e4 = e3;
        }
        if (this.a.compare(e4, e2) < 0) {
            jl.a((jl)this.c)[n2] = e4;
            jl.a((jl)this.c)[n5] = e2;
            return n5;
        }
        jl.a((jl)this.c)[n2] = e2;
        return n2;
    }

    int a(E e2) {
        int n2;
        int n3;
        Object e3;
        int n4 = this.g(jl.b(this.c));
        if (n4 != 0 && (n2 = this.f(n3 = this.g(n4))) != n4 && this.e(n2) >= jl.b(this.c) && this.a.compare(e3 = this.c.c(n2), e2) < 0) {
            jl.a((jl)this.c)[n2] = e2;
            jl.a((jl)this.c)[jl.b((jl)this.c)] = e3;
            return n2;
        }
        return jl.b(this.c);
    }

    int d(int n2, E e2) {
        int n3 = this.a(n2);
        if (n3 > 0 && this.a.compare(this.c.c(n3), e2) < 0) {
            jl.a((jl)this.c)[n2] = this.c.c(n3);
            jl.a((jl)this.c)[n3] = e2;
            return n3;
        }
        return this.c(n2, e2);
    }

    int c(int n2) {
        int n3;
        while ((n3 = this.b(n2)) > 0) {
            jl.a((jl)this.c)[n2] = this.c.c(n3);
            n2 = n3;
        }
        return n2;
    }

    private boolean d(int n2) {
        if (this.e(n2) < jl.b(this.c) && this.a(n2, this.e(n2)) > 0) {
            return false;
        }
        if (this.f(n2) < jl.b(this.c) && this.a(n2, this.f(n2)) > 0) {
            return false;
        }
        if (n2 > 0 && this.a(n2, this.g(n2)) > 0) {
            return false;
        }
        if (n2 > 2 && this.a(this.h(n2), n2) > 0) {
            return false;
        }
        return true;
    }

    private int e(int n2) {
        return n2 * 2 + 1;
    }

    private int f(int n2) {
        return n2 * 2 + 2;
    }

    private int g(int n2) {
        return (n2 - 1) / 2;
    }

    private int h(int n2) {
        return this.g(this.g(n2));
    }

    static /* synthetic */ boolean a(jo jo2, int n2) {
        return jo2.d(n2);
    }
}

