/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.a;

import com.growingio.d.a.m;
import com.growingio.d.a.p;
import com.growingio.d.a.r;
import com.growingio.d.a.t;

public class e
extends r
implements t {
    private int a;
    private int b;

    public e(r r2) {
        this(327680, r2);
    }

    protected e(int n2, r r2) {
        super(n2, r2);
    }

    public int d() {
        return this.a;
    }

    public int e() {
        return this.b;
    }

    @Override
    public void a_(int n2) {
        ++this.a;
        ++this.b;
        if (this.n_ != null) {
            this.n_.a_(n2);
        }
    }

    @Override
    public void a(int n2, int n3) {
        if (n2 == 17) {
            this.a += 3;
            this.b += 3;
        } else {
            this.a += 2;
            this.b += 2;
        }
        if (this.n_ != null) {
            this.n_.a(n2, n3);
        }
    }

    @Override
    public void b(int n2, int n3) {
        if (n3 < 4 && n2 != 169) {
            ++this.a;
            ++this.b;
        } else if (n3 >= 256) {
            this.a += 4;
            this.b += 4;
        } else {
            this.a += 2;
            this.b += 2;
        }
        if (this.n_ != null) {
            this.n_.b(n2, n3);
        }
    }

    @Override
    public void a(int n2, String string) {
        this.a += 3;
        this.b += 3;
        if (this.n_ != null) {
            this.n_.a(n2, string);
        }
    }

    @Override
    public void b(int n2, String string, String string2, String string3) {
        this.a += 3;
        this.b += 3;
        if (this.n_ != null) {
            this.n_.b(n2, string, string2, string3);
        }
    }

    @Override
    public void a(int n2, String string, String string2, String string3) {
        if (this.m_ >= 327680) {
            super.a(n2, string, string2, string3);
            return;
        }
        this.b(n2, string, string2, string3, n2 == 185);
    }

    @Override
    public void a(int n2, String string, String string2, String string3, boolean bl2) {
        if (this.m_ < 327680) {
            super.a(n2, string, string2, string3, bl2);
            return;
        }
        this.b(n2, string, string2, string3, bl2);
    }

    private void b(int n2, String string, String string2, String string3, boolean bl2) {
        if (n2 == 185) {
            this.a += 5;
            this.b += 5;
        } else {
            this.a += 3;
            this.b += 3;
        }
        if (this.n_ != null) {
            this.n_.a(n2, string, string2, string3, bl2);
        }
    }

    @Override
    public /* varargs */ void a(String string, String string2, m m2, Object ... arrobject) {
        this.a += 5;
        this.b += 5;
        if (this.n_ != null) {
            this.n_.a(string, string2, m2, arrobject);
        }
    }

    @Override
    public void a(int n2, p p2) {
        this.a += 3;
        this.b = n2 == 167 || n2 == 168 ? (this.b += 5) : (this.b += 8);
        if (this.n_ != null) {
            this.n_.a(n2, p2);
        }
    }

    @Override
    public void a(Object object) {
        if (object instanceof Long || object instanceof Double) {
            this.a += 3;
            this.b += 3;
        } else {
            this.a += 2;
            this.b += 3;
        }
        if (this.n_ != null) {
            this.n_.a(object);
        }
    }

    @Override
    public void c(int n2, int n3) {
        if (n2 > 255 || n3 > 127 || n3 < -128) {
            this.a += 6;
            this.b += 6;
        } else {
            this.a += 3;
            this.b += 3;
        }
        if (this.n_ != null) {
            this.n_.c(n2, n3);
        }
    }

    @Override
    public /* varargs */ void a(int n2, int n3, p p2, p ... arrp) {
        this.a += 13 + arrp.length * 4;
        this.b += 16 + arrp.length * 4;
        if (this.n_ != null) {
            this.n_.a(n2, n3, p2, arrp);
        }
    }

    @Override
    public void a(p p2, int[] arrn, p[] arrp) {
        this.a += 9 + arrn.length * 8;
        this.b += 12 + arrn.length * 8;
        if (this.n_ != null) {
            this.n_.a(p2, arrn, arrp);
        }
    }

    @Override
    public void b(String string, int n2) {
        this.a += 4;
        this.b += 4;
        if (this.n_ != null) {
            this.n_.b(string, n2);
        }
    }
}

