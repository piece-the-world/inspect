/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aH;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.kn;
import com.growingio.a.a.d.kx;
import com.growingio.a.a.d.nX;
import java.util.Comparator;

final class of<E>
extends kx<E> {
    private final E a;
    private int b;
    private int c;
    private long d;
    private int e;
    private of<E> f;
    private of<E> g;
    private of<E> h;
    private of<E> i;

    of(E e2, int n2) {
        aU.a(n2 > 0);
        this.a = e2;
        this.b = n2;
        this.d = n2;
        this.c = 1;
        this.e = 1;
        this.f = null;
        this.g = null;
    }

    public int a(Comparator<? super E> comparator, E e2) {
        int n2 = comparator.compare(e2, this.a);
        if (n2 < 0) {
            return this.f == null ? 0 : this.f.a(comparator, e2);
        }
        if (n2 > 0) {
            return this.g == null ? 0 : this.g.a(comparator, e2);
        }
        return this.b;
    }

    private of<E> a(E e2, int n2) {
        this.g = new of<E>(e2, n2);
        nX.a(this, this.g, this.i);
        this.e = Math.max(2, this.e);
        ++this.c;
        this.d += (long)n2;
        return this;
    }

    private of<E> b(E e2, int n2) {
        this.f = new of<E>(e2, n2);
        nX.a(this.h, this.f, this);
        this.e = Math.max(2, this.e);
        ++this.c;
        this.d += (long)n2;
        return this;
    }

    of<E> a(Comparator<? super E> comparator, E e2, int n2, int[] arrn) {
        int n3 = comparator.compare(e2, this.a);
        if (n3 < 0) {
            of<E> of2 = this.f;
            if (of2 == null) {
                arrn[0] = 0;
                return this.b(e2, n2);
            }
            int n4 = of2.e;
            this.f = of2.a(comparator, e2, n2, arrn);
            if (arrn[0] == 0) {
                ++this.c;
            }
            this.d += (long)n2;
            return this.f.e == n4 ? this : this.g();
        }
        if (n3 > 0) {
            of<E> of3 = this.g;
            if (of3 == null) {
                arrn[0] = 0;
                return this.a(e2, n2);
            }
            int n5 = of3.e;
            this.g = of3.a(comparator, e2, n2, arrn);
            if (arrn[0] == 0) {
                ++this.c;
            }
            this.d += (long)n2;
            return this.g.e == n5 ? this : super.g();
        }
        arrn[0] = this.b;
        long l2 = (long)this.b + (long)n2;
        aU.a(l2 <= Integer.MAX_VALUE);
        this.b += n2;
        this.d += (long)n2;
        return this;
    }

    of<E> b(Comparator<? super E> comparator, E e2, int n2, int[] arrn) {
        int n3 = comparator.compare(e2, this.a);
        if (n3 < 0) {
            of<E> of2 = this.f;
            if (of2 == null) {
                arrn[0] = 0;
                return this;
            }
            this.f = of2.b(comparator, e2, n2, arrn);
            if (arrn[0] > 0) {
                if (n2 >= arrn[0]) {
                    --this.c;
                    this.d -= (long)arrn[0];
                } else {
                    this.d -= (long)n2;
                }
            }
            return arrn[0] == 0 ? this : this.g();
        }
        if (n3 > 0) {
            of<E> of3 = this.g;
            if (of3 == null) {
                arrn[0] = 0;
                return this;
            }
            this.g = of3.b(comparator, e2, n2, arrn);
            if (arrn[0] > 0) {
                if (n2 >= arrn[0]) {
                    --this.c;
                    this.d -= (long)arrn[0];
                } else {
                    this.d -= (long)n2;
                }
            }
            return this.g();
        }
        arrn[0] = this.b;
        if (n2 >= this.b) {
            return this.c();
        }
        this.b -= n2;
        this.d -= (long)n2;
        return this;
    }

    of<E> c(Comparator<? super E> comparator, E e2, int n2, int[] arrn) {
        int n3 = comparator.compare(e2, this.a);
        if (n3 < 0) {
            of<E> of2 = this.f;
            if (of2 == null) {
                arrn[0] = 0;
                return n2 > 0 ? this.b(e2, n2) : this;
            }
            this.f = of2.c(comparator, e2, n2, arrn);
            if (n2 == 0 && arrn[0] != 0) {
                --this.c;
            } else if (n2 > 0 && arrn[0] == 0) {
                ++this.c;
            }
            this.d += (long)(n2 - arrn[0]);
            return super.g();
        }
        if (n3 > 0) {
            of<E> of3 = this.g;
            if (of3 == null) {
                arrn[0] = 0;
                return n2 > 0 ? super.a(e2, n2) : this;
            }
            this.g = of3.c(comparator, e2, n2, arrn);
            if (n2 == 0 && arrn[0] != 0) {
                --this.c;
            } else if (n2 > 0 && arrn[0] == 0) {
                ++this.c;
            }
            this.d += (long)(n2 - arrn[0]);
            return super.g();
        }
        arrn[0] = this.b;
        if (n2 == 0) {
            return this.c();
        }
        this.d += (long)(n2 - this.b);
        this.b = n2;
        return this;
    }

    of<E> a(Comparator<? super E> comparator, E e2, int n2, int n3, int[] arrn) {
        int n4 = comparator.compare(e2, this.a);
        if (n4 < 0) {
            of<E> of2 = this.f;
            if (of2 == null) {
                arrn[0] = 0;
                if (n2 == 0 && n3 > 0) {
                    return this.b(e2, n3);
                }
                return this;
            }
            this.f = of2.a(comparator, e2, n2, n3, arrn);
            if (arrn[0] == n2) {
                if (n3 == 0 && arrn[0] != 0) {
                    --this.c;
                } else if (n3 > 0 && arrn[0] == 0) {
                    ++this.c;
                }
                this.d += (long)(n3 - arrn[0]);
            }
            return this.g();
        }
        if (n4 > 0) {
            of<E> of3 = this.g;
            if (of3 == null) {
                arrn[0] = 0;
                if (n2 == 0 && n3 > 0) {
                    return this.a(e2, n3);
                }
                return this;
            }
            this.g = of3.a(comparator, e2, n2, n3, arrn);
            if (arrn[0] == n2) {
                if (n3 == 0 && arrn[0] != 0) {
                    --this.c;
                } else if (n3 > 0 && arrn[0] == 0) {
                    ++this.c;
                }
                this.d += (long)(n3 - arrn[0]);
            }
            return this.g();
        }
        arrn[0] = this.b;
        if (n2 == this.b) {
            if (n3 == 0) {
                return this.c();
            }
            this.d += (long)(n3 - this.b);
            this.b = n3;
        }
        return this;
    }

    private of<E> c() {
        int n2 = this.b;
        this.b = 0;
        nX.a(this.h, this.i);
        if (this.f == null) {
            return this.g;
        }
        if (this.g == null) {
            return this.f;
        }
        if (this.f.e >= this.g.e) {
            of<E> of2 = this.h;
            of2.f = super.j(of2);
            of2.g = this.g;
            of2.c = this.c - 1;
            of2.d = this.d - (long)n2;
            return super.g();
        }
        of<E> of3 = this.i;
        of3.g = super.i(of3);
        of3.f = this.f;
        of3.c = this.c - 1;
        of3.d = this.d - (long)n2;
        return super.g();
    }

    private of<E> i(of<E> of2) {
        if (this.f == null) {
            return this.g;
        }
        this.f = super.i(of2);
        --this.c;
        this.d -= (long)of2.b;
        return this.g();
    }

    private of<E> j(of<E> of2) {
        if (this.g == null) {
            return this.f;
        }
        this.g = super.j(of2);
        --this.c;
        this.d -= (long)of2.b;
        return this.g();
    }

    private void d() {
        this.c = 1 + nX.a(this.f) + nX.a(this.g);
        this.d = (long)this.b + of.k(this.f) + of.k(this.g);
    }

    private void e() {
        this.e = 1 + Math.max(of.l(this.f), of.l(this.g));
    }

    private void f() {
        this.d();
        this.e();
    }

    private of<E> g() {
        switch (this.h()) {
            case -2: {
                if (super.h() > 0) {
                    this.g = super.j();
                }
                return this.i();
            }
            case 2: {
                if (super.h() < 0) {
                    this.f = super.i();
                }
                return this.j();
            }
        }
        this.e();
        return this;
    }

    private int h() {
        return of.l(this.f) - of.l(this.g);
    }

    private of<E> i() {
        aU.b(this.g != null);
        of<E> of2 = this.g;
        this.g = of2.f;
        of2.f = this;
        of2.d = this.d;
        of2.c = this.c;
        this.f();
        super.e();
        return of2;
    }

    private of<E> j() {
        aU.b(this.f != null);
        of<E> of2 = this.f;
        this.f = of2.g;
        of2.g = this;
        of2.d = this.d;
        of2.c = this.c;
        this.f();
        super.e();
        return of2;
    }

    private static long k(of<?> of2) {
        return of2 == null ? 0 : of2.d;
    }

    private static int l(of<?> of2) {
        return of2 == null ? 0 : of2.e;
    }

    private of<E> b(Comparator<? super E> comparator, E e2) {
        int n2 = comparator.compare(e2, this.a);
        if (n2 < 0) {
            return this.f == null ? this : aH.a(super.b(comparator, e2), this);
        }
        if (n2 == 0) {
            return this;
        }
        return this.g == null ? null : super.b(comparator, e2);
    }

    private of<E> c(Comparator<? super E> comparator, E e2) {
        int n2 = comparator.compare(e2, this.a);
        if (n2 > 0) {
            return this.g == null ? this : aH.a(super.c(comparator, e2), this);
        }
        if (n2 == 0) {
            return this;
        }
        return this.f == null ? null : super.c(comparator, e2);
    }

    @Override
    public E a() {
        return this.a;
    }

    @Override
    public int b() {
        return this.b;
    }

    @Override
    public String toString() {
        return kn.a(this.a(), this.b()).toString();
    }

    static /* synthetic */ int a(of of2) {
        return of2.b;
    }

    static /* synthetic */ long b(of of2) {
        return of2.d;
    }

    static /* synthetic */ int c(of of2) {
        return of2.c;
    }

    static /* synthetic */ Object d(of of2) {
        return of2.a;
    }

    static /* synthetic */ of e(of of2) {
        return of2.f;
    }

    static /* synthetic */ of f(of of2) {
        return of2.g;
    }

    static /* synthetic */ of a(of of2, Comparator comparator, Object object) {
        return of2.b(comparator, object);
    }

    static /* synthetic */ of g(of of2) {
        return of2.i;
    }

    static /* synthetic */ of b(of of2, Comparator comparator, Object object) {
        return of2.c(comparator, object);
    }

    static /* synthetic */ of h(of of2) {
        return of2.h;
    }

    static /* synthetic */ of a(of of2, of of3) {
        of2.i = of3;
        return of2.i;
    }

    static /* synthetic */ of b(of of2, of of3) {
        of2.h = of3;
        return of2.h;
    }
}

