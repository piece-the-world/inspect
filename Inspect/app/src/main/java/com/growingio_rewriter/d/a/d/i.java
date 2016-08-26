/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.d;

import com.growingio.d.a.d.a;
import com.growingio.d.a.d.j;
import com.growingio.d.a.d.o;
import com.growingio.d.a.r;
import java.util.ListIterator;

public class i {
    private int b;
    private a c;
    private a d;
    a[] a;

    public int a() {
        return this.b;
    }

    public a b() {
        return this.c;
    }

    public a c() {
        return this.d;
    }

    public a a(int n2) {
        if (n2 < 0 || n2 >= this.b) {
            throw new IndexOutOfBoundsException();
        }
        if (this.a == null) {
            this.a = this.e();
        }
        return this.a[n2];
    }

    public boolean a(a a2) {
        a a3 = this.c;
        while (a3 != null && a3 != a2) {
            a3 = a3.u;
        }
        return a3 != null;
    }

    public int b(a a2) {
        if (this.a == null) {
            this.a = this.e();
        }
        return a2.v;
    }

    public void a(r r2) {
        a a2 = this.c;
        while (a2 != null) {
            a2.a(r2);
            a2 = a2.u;
        }
    }

    public ListIterator<a> d() {
        return this.b(0);
    }

    public ListIterator<a> b(int n2) {
        return new j(this, n2);
    }

    public a[] e() {
        int n2 = 0;
        a a2 = this.c;
        a[] arra = new a[this.b];
        while (a2 != null) {
            arra[n2] = a2;
            a2.v = n2++;
            a2 = a2.u;
        }
        return arra;
    }

    public void a(a a2, a a3) {
        a a4;
        a a5;
        a3.u = a5 = a2.u;
        if (a5 != null) {
            a5.t = a3;
        } else {
            this.d = a3;
        }
        a3.t = a4 = a2.t;
        if (a4 != null) {
            a4.u = a3;
        } else {
            this.c = a3;
        }
        if (this.a != null) {
            int n2 = a2.v;
            this.a[n2] = a3;
            a3.v = n2;
        } else {
            a3.v = 0;
        }
        a2.v = -1;
        a2.t = null;
        a2.u = null;
    }

    public void c(a a2) {
        ++this.b;
        if (this.d == null) {
            this.c = a2;
            this.d = a2;
        } else {
            this.d.u = a2;
            a2.t = this.d;
        }
        this.d = a2;
        this.a = null;
        a2.v = 0;
    }

    public void a(i i2) {
        if (i2.b == 0) {
            return;
        }
        this.b += i2.b;
        if (this.d == null) {
            this.c = i2.c;
            this.d = i2.d;
        } else {
            a a2;
            this.d.u = a2 = i2.c;
            a2.t = this.d;
            this.d = i2.d;
        }
        this.a = null;
        i2.a(false);
    }

    public void d(a a2) {
        ++this.b;
        if (this.c == null) {
            this.c = a2;
            this.d = a2;
        } else {
            this.c.t = a2;
            a2.u = this.c;
        }
        this.c = a2;
        this.a = null;
        a2.v = 0;
    }

    public void b(i i2) {
        if (i2.b == 0) {
            return;
        }
        this.b += i2.b;
        if (this.c == null) {
            this.c = i2.c;
            this.d = i2.d;
        } else {
            a a2;
            this.c.t = a2 = i2.d;
            a2.u = this.c;
            this.c = i2.c;
        }
        this.a = null;
        i2.a(false);
    }

    public void b(a a2, a a3) {
        ++this.b;
        a a4 = a2.u;
        if (a4 == null) {
            this.d = a3;
        } else {
            a4.t = a3;
        }
        a2.u = a3;
        a3.u = a4;
        a3.t = a2;
        this.a = null;
        a3.v = 0;
    }

    public void a(a a2, i i2) {
        if (i2.b == 0) {
            return;
        }
        this.b += i2.b;
        a a3 = i2.c;
        a a4 = i2.d;
        a a5 = a2.u;
        if (a5 == null) {
            this.d = a4;
        } else {
            a5.t = a4;
        }
        a2.u = a3;
        a4.u = a5;
        a3.t = a2;
        this.a = null;
        i2.a(false);
    }

    public void c(a a2, a a3) {
        ++this.b;
        a a4 = a2.t;
        if (a4 == null) {
            this.c = a3;
        } else {
            a4.u = a3;
        }
        a2.t = a3;
        a3.u = a2;
        a3.t = a4;
        this.a = null;
        a3.v = 0;
    }

    public void b(a a2, i i2) {
        if (i2.b == 0) {
            return;
        }
        this.b += i2.b;
        a a3 = i2.c;
        a a4 = i2.d;
        a a5 = a2.t;
        if (a5 == null) {
            this.c = a3;
        } else {
            a5.u = a3;
        }
        a2.t = a4;
        a4.u = a2;
        a3.t = a5;
        this.a = null;
        i2.a(false);
    }

    public void e(a a2) {
        --this.b;
        a a3 = a2.u;
        a a4 = a2.t;
        if (a3 == null) {
            if (a4 == null) {
                this.c = null;
                this.d = null;
            } else {
                a4.u = null;
                this.d = a4;
            }
        } else if (a4 == null) {
            this.c = a3;
            a3.t = null;
        } else {
            a4.u = a3;
            a3.t = a4;
        }
        this.a = null;
        a2.v = -1;
        a2.t = null;
        a2.u = null;
    }

    void a(boolean bl2) {
        if (bl2) {
            a a2 = this.c;
            while (a2 != null) {
                a a3 = a2.u;
                a2.v = -1;
                a2.t = null;
                a2.u = null;
                a2 = a3;
            }
        }
        this.b = 0;
        this.c = null;
        this.d = null;
        this.a = null;
    }

    public void f() {
        this.a(false);
    }

    public void g() {
        a a2 = this.c;
        while (a2 != null) {
            if (a2 instanceof o) {
                ((o)a2).f();
            }
            a2 = a2.u;
        }
    }
}

