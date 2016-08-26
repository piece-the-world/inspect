/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a;

import com.growingio.d.a.a;
import com.growingio.d.a.c;
import com.growingio.d.a.m;
import com.growingio.d.a.p;
import com.growingio.d.a.v;

public abstract class r {
    protected final int m_;
    protected r n_;

    public r(int n2) {
        this(n2, null);
    }

    public r(int n2, r r2) {
        if (n2 != 262144 && n2 != 327680) {
            throw new IllegalArgumentException();
        }
        this.m_ = n2;
        this.n_ = r2;
    }

    public r() {
        this(327680);
    }

    public void a(String string, int n2) {
        if (this.m_ < 327680) {
            throw new RuntimeException();
        }
        if (this.n_ != null) {
            this.n_.a(string, n2);
        }
    }

    public a c() {
        if (this.n_ != null) {
            return this.n_.c();
        }
        return null;
    }

    public a a(String string, boolean bl2) {
        if (this.n_ != null) {
            return this.n_.a(string, bl2);
        }
        return null;
    }

    public a a(int n2, v v2, String string, boolean bl2) {
        if (this.m_ < 327680) {
            throw new RuntimeException();
        }
        if (this.n_ != null) {
            return this.n_.a(n2, v2, string, bl2);
        }
        return null;
    }

    public a a(int n2, String string, boolean bl2) {
        if (this.n_ != null) {
            return this.n_.a(n2, string, bl2);
        }
        return null;
    }

    public void a(c c2) {
        if (this.n_ != null) {
            this.n_.a(c2);
        }
    }

    public void a_() {
        if (this.n_ != null) {
            this.n_.a_();
        }
    }

    public void a(int n2, int n3, Object[] arrobject, int n4, Object[] arrobject2) {
        if (this.n_ != null) {
            this.n_.a(n2, n3, arrobject, n4, arrobject2);
        }
    }

    public void a_(int n2) {
        if (this.n_ != null) {
            this.n_.a_(n2);
        }
    }

    public void a(int n2, int n3) {
        if (this.n_ != null) {
            this.n_.a(n2, n3);
        }
    }

    public void b(int n2, int n3) {
        if (this.n_ != null) {
            this.n_.b(n2, n3);
        }
    }

    public void a(int n2, String string) {
        if (this.n_ != null) {
            this.n_.a(n2, string);
        }
    }

    public void b(int n2, String string, String string2, String string3) {
        if (this.n_ != null) {
            this.n_.b(n2, string, string2, string3);
        }
    }

    public void a(int n2, String string, String string2, String string3) {
        if (this.m_ >= 327680) {
            boolean bl2 = n2 == 185;
            this.a(n2, string, string2, string3, bl2);
            return;
        }
        if (this.n_ != null) {
            this.n_.a(n2, string, string2, string3);
        }
    }

    public void a(int n2, String string, String string2, String string3, boolean bl2) {
        if (this.m_ < 327680) {
            if (bl2 != (n2 == 185)) {
                throw new IllegalArgumentException("INVOKESPECIAL/STATIC on interfaces require ASM 5");
            }
            this.a(n2, string, string2, string3);
            return;
        }
        if (this.n_ != null) {
            this.n_.a(n2, string, string2, string3, bl2);
        }
    }

    public /* varargs */ void a(String string, String string2, m m2, Object ... arrobject) {
        if (this.n_ != null) {
            this.n_.a(string, string2, m2, arrobject);
        }
    }

    public void a(int n2, p p2) {
        if (this.n_ != null) {
            this.n_.a(n2, p2);
        }
    }

    public void a(p p2) {
        if (this.n_ != null) {
            this.n_.a(p2);
        }
    }

    public void a(Object object) {
        if (this.n_ != null) {
            this.n_.a(object);
        }
    }

    public void c(int n2, int n3) {
        if (this.n_ != null) {
            this.n_.c(n2, n3);
        }
    }

    public /* varargs */ void a(int n2, int n3, p p2, p ... arrp) {
        if (this.n_ != null) {
            this.n_.a(n2, n3, p2, arrp);
        }
    }

    public void a(p p2, int[] arrn, p[] arrp) {
        if (this.n_ != null) {
            this.n_.a(p2, arrn, arrp);
        }
    }

    public void b(String string, int n2) {
        if (this.n_ != null) {
            this.n_.b(string, n2);
        }
    }

    public a b(int n2, v v2, String string, boolean bl2) {
        if (this.m_ < 327680) {
            throw new RuntimeException();
        }
        if (this.n_ != null) {
            return this.n_.b(n2, v2, string, bl2);
        }
        return null;
    }

    public void a(p p2, p p3, p p4, String string) {
        if (this.n_ != null) {
            this.n_.a(p2, p3, p4, string);
        }
    }

    public a c(int n2, v v2, String string, boolean bl2) {
        if (this.m_ < 327680) {
            throw new RuntimeException();
        }
        if (this.n_ != null) {
            return this.n_.c(n2, v2, string, bl2);
        }
        return null;
    }

    public void a(String string, String string2, String string3, p p2, p p3, int n2) {
        if (this.n_ != null) {
            this.n_.a(string, string2, string3, p2, p3, n2);
        }
    }

    public a a(int n2, v v2, p[] arrp, p[] arrp2, int[] arrn, String string, boolean bl2) {
        if (this.m_ < 327680) {
            throw new RuntimeException();
        }
        if (this.n_ != null) {
            return this.n_.a(n2, v2, arrp, arrp2, arrn, string, bl2);
        }
        return null;
    }

    public void b(int n2, p p2) {
        if (this.n_ != null) {
            this.n_.b(n2, p2);
        }
    }

    public void d(int n2, int n3) {
        if (this.n_ != null) {
            this.n_.d(n2, n3);
        }
    }

    public void b() {
        if (this.n_ != null) {
            this.n_.b();
        }
    }
}

