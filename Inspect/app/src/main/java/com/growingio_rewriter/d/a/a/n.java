/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.a;

import com.growingio.d.a.a;
import com.growingio.d.a.p;
import com.growingio.d.a.r;
import com.growingio.d.a.t;
import com.growingio.d.a.u;
import com.growingio.d.a.v;

public class n
extends r {
    private static final u a = u.b("java/lang/Object");
    private int[] b = new int[40];
    private Object[] c = new Object[20];
    protected final int k_;
    protected int l_;

    public n(int n2, String string, r r2) {
        this(327680, n2, string, r2);
        if (this.getClass() != n.class) {
            throw new IllegalStateException();
        }
    }

    protected n(int n2, int n3, String string, r r2) {
        super(n2, r2);
        u[] arru = u.d(string);
        this.l_ = (8 & n3) == 0 ? 1 : 0;
        for (int i2 = 0; i2 < arru.length; ++i2) {
            this.l_ += arru[i2].j();
        }
        this.k_ = this.l_;
    }

    @Override
    public void b(int n2, int n3) {
        u u2;
        switch (n2) {
            case 22: 
            case 55: {
                u2 = u.t;
                break;
            }
            case 24: 
            case 57: {
                u2 = u.u;
                break;
            }
            case 23: 
            case 56: {
                u2 = u.s;
                break;
            }
            case 21: 
            case 54: {
                u2 = u.r;
                break;
            }
            default: {
                u2 = a;
            }
        }
        this.n_.b(n2, this.b(n3, u2));
    }

    @Override
    public void c(int n2, int n3) {
        this.n_.c(this.b(n2, u.r), n3);
    }

    @Override
    public void d(int n2, int n3) {
        this.n_.d(n2, this.l_);
    }

    @Override
    public void a(String string, String string2, String string3, p p2, p p3, int n2) {
        int n3 = this.b(n2, u.a(string2));
        this.n_.a(string, string2, string3, p2, p3, n3);
    }

    @Override
    public a a(int n2, v v2, p[] arrp, p[] arrp2, int[] arrn, String string, boolean bl2) {
        u u2 = u.a(string);
        int[] arrn2 = new int[arrn.length];
        for (int i2 = 0; i2 < arrn2.length; ++i2) {
            arrn2[i2] = this.b(arrn[i2], u2);
        }
        return this.n_.a(n2, v2, arrp, arrp2, arrn2, string, bl2);
    }

    @Override
    public void a(int n2, int n3, Object[] arrobject, int n4, Object[] arrobject2) {
        int n5;
        if (n2 != -1) {
            throw new IllegalStateException("ClassReader.accept() should be called with EXPAND_FRAMES flag");
        }
        Object[] arrobject3 = new Object[this.c.length];
        System.arraycopy(this.c, 0, arrobject3, 0, arrobject3.length);
        this.a(this.c);
        int n6 = 0;
        for (n5 = 0; n5 < n3; ++n5) {
            int n7;
            Object object = arrobject[n5];
            int n8 = n7 = object == t.ai || object == t.ah ? 2 : 1;
            if (object != t.ae) {
                u u2 = a;
                if (object == t.af) {
                    u2 = u.r;
                } else if (object == t.ag) {
                    u2 = u.s;
                } else if (object == t.ai) {
                    u2 = u.t;
                } else if (object == t.ah) {
                    u2 = u.u;
                } else if (object instanceof String) {
                    u2 = u.b((String)object);
                }
                this.a(this.b(n6, u2), object);
            }
            n6 += n7;
        }
        n6 = 0;
        n5 = 0;
        int n9 = 0;
        while (n6 < this.c.length) {
            Object object;
            if ((object = this.c[n6++]) != null && object != t.ae) {
                this.c[n9] = object;
                n5 = n9 + 1;
                if (object == t.ai || object == t.ah) {
                    ++n6;
                }
            } else {
                this.c[n9] = t.ae;
            }
            ++n9;
        }
        this.n_.a(n2, n5, this.c, n4, arrobject2);
        this.c = arrobject3;
    }

    public int k(u u2) {
        Object object;
        switch (u2.a()) {
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                object = t.af;
                break;
            }
            case 6: {
                object = t.ag;
                break;
            }
            case 7: {
                object = t.ai;
                break;
            }
            case 8: {
                object = t.ah;
                break;
            }
            case 9: {
                object = u2.i();
                break;
            }
            default: {
                object = u2.e();
            }
        }
        int n2 = this.l(u2);
        this.a(n2, u2);
        this.a(n2, object);
        return n2;
    }

    protected void a(Object[] arrobject) {
    }

    protected void a(int n2, u u2) {
    }

    private void a(int n2, Object object) {
        int n3 = this.c.length;
        if (n2 >= n3) {
            Object[] arrobject = new Object[Math.max(2 * n3, n2 + 1)];
            System.arraycopy(this.c, 0, arrobject, 0, n3);
            this.c = arrobject;
        }
        this.c[n2] = object;
    }

    private int b(int n2, u u2) {
        int n3;
        int n4;
        if (n2 + u2.j() <= this.k_) {
            return n2;
        }
        int n5 = 2 * n2 + u2.j() - 1;
        if (n5 >= (n4 = this.b.length)) {
            int[] arrn = new int[Math.max(2 * n4, n5 + 1)];
            System.arraycopy(this.b, 0, arrn, 0, n4);
            this.b = arrn;
        }
        if ((n3 = this.b[n5]) == 0) {
            n3 = this.l(u2);
            this.a(n3, u2);
            this.b[n5] = n3 + 1;
        } else {
            --n3;
        }
        return n3;
    }

    protected int l(u u2) {
        int n2 = this.l_;
        this.l_ += u2.j();
        return n2;
    }
}

