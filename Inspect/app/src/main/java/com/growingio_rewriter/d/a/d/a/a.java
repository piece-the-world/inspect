/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.d.a;

import com.growingio.d.a.d.A;
import com.growingio.d.a.d.D;
import com.growingio.d.a.d.a.b;
import com.growingio.d.a.d.a.f;
import com.growingio.d.a.d.a.g;
import com.growingio.d.a.d.a.l;
import com.growingio.d.a.d.a.m;
import com.growingio.d.a.d.i;
import com.growingio.d.a.d.n;
import com.growingio.d.a.d.o;
import com.growingio.d.a.d.v;
import com.growingio.d.a.d.z;
import com.growingio.d.a.t;
import com.growingio.d.a.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class a<V extends m>
implements t {
    private final g<V> a;
    private int b;
    private i c;
    private List<A>[] dm;
    private f<V>[] dn;
    private l[] do;
    private boolean[] dp;
    private int[] dq;
    private int dr;

    public a(g<V> g2) {
        this.a = g2;
    }

    public f<V>[] a(String string, v v2) throws b {
        int n2;
        u[] arru;
        int n3;
        Object object;
        if ((v2.b & 1280) != 0) {
            this.dn = new f[0];
            return this.dn;
        }
        this.b = v2.bm_.a();
        this.c = v2.bm_;
        this.dm = new List[this.b];
        this.dn = new f[this.b];
        this.do = new l[this.b];
        this.dp = new boolean[this.b];
        this.dq = new int[this.b];
        this.dr = 0;
        for (int i2 = 0; i2 < v2.bn_.size(); ++i2) {
            object = v2.bn_.get(i2);
            int n4 = this.c.b(object.a);
            n2 = this.c.b(object.b);
            for (int i3 = n4; i3 < n2; ++i3) {
                arru = this.dm[i3];
                if (arru == null) {
                    this.dm[i3] = arru = new ArrayList<A>();
                }
                arru.add((Object)object);
            }
        }
        l l2 = new l(null, v2.bp_, null);
        object = new ArrayList();
        HashMap<o, l> hashMap = new HashMap<o, l>();
        this.a(0, l2, (List<com.growingio.d.a.d.a>)object);
        while (!object.isEmpty()) {
            n n5 = (n)object.remove(0);
            l l3 = (l)hashMap.get(n5.w);
            if (l3 == null) {
                l3 = new l(n5.w, v2.bp_, n5);
                hashMap.put(n5.w, l3);
                this.a(this.c.b(n5.w), l3, (List<com.growingio.d.a.d.a>)object);
                continue;
            }
            l3.c.add(n5);
        }
        for (n2 = 0; n2 < this.b; ++n2) {
            if (this.do[n2] == null || this.do[n2].a != null) continue;
            this.do[n2] = null;
        }
        f<V> f2 = this.a(v2.bp_, v2.bo_);
        f<V> f3 = this.a(v2.bp_, v2.bo_);
        f2.a(this.a.b(u.e(v2.f)));
        arru = u.d(v2.f);
        int n6 = 0;
        if ((v2.b & 8) == 0) {
            u u2 = u.b(string);
            f2.a(n6++, this.a.b(u2));
        }
        for (n3 = 0; n3 < arru.length; ++n3) {
            f2.a(n6++, this.a.b(arru[n3]));
            if (arru[n3].j() != 2) continue;
            f2.a(n6++, this.a.b((u)null));
        }
        while (n6 < v2.bp_) {
            f2.a(n6++, this.a.b((u)null));
        }
        this.a(0, f2, null);
        this.b(string, v2);
        while (this.dr > 0) {
            n3 = this.dq[--this.dr];
            f<V> f4 = this.dn[n3];
            l l4 = this.do[n3];
            this.dp[n3] = false;
            com.growingio.d.a.d.a a2 = null;
            try {
                Object object2;
                Object object3;
                Object object4;
                a2 = v2.bm_.a(n3);
                int n7 = a2.a();
                int n8 = a2.b();
                if (n8 == 8 || n8 == 15 || n8 == 14) {
                    this.a(n3 + 1, f4, l4);
                    this.b(n3, n3 + 1);
                } else {
                    int n9;
                    f2.a(f4).a(a2, this.a);
                    l l5 = l4 = l4 == null ? null : l4.a();
                    if (a2 instanceof n) {
                        object4 = (n)a2;
                        if (n7 != 167 && n7 != 168) {
                            this.a(n3 + 1, f2, l4);
                            this.b(n3, n3 + 1);
                        }
                        object2 = this.c.b(object4.w);
                        if (n7 == 168) {
                            this.a((int)object2, f2, new l(object4.w, v2.bp_, (n)object4));
                        } else {
                            this.a((int)object2, f2, l4);
                        }
                        this.b(n3, (int)object2);
                    } else if (a2 instanceof com.growingio.d.a.d.t) {
                        object4 = (com.growingio.d.a.d.t)a2;
                        object2 = this.c.b(object4.w);
                        this.a((int)object2, f2, l4);
                        this.b(n3, (int)object2);
                        for (n9 = 0; n9 < object4.y.size(); ++n9) {
                            object3 = object4.y.get(n9);
                            object2 = this.c.b((com.growingio.d.a.d.a)object3);
                            this.a((int)object2, f2, l4);
                            this.b(n3, (int)object2);
                        }
                    } else if (a2 instanceof z) {
                        object4 = (z)a2;
                        object2 = this.c.b(object4.y);
                        this.a((int)object2, f2, l4);
                        this.b(n3, (int)object2);
                        for (n9 = 0; n9 < object4.z.size(); ++n9) {
                            object3 = object4.z.get(n9);
                            object2 = this.c.b((com.growingio.d.a.d.a)object3);
                            this.a((int)object2, f2, l4);
                            this.b(n3, (int)object2);
                        }
                    } else if (n7 == 169) {
                        if (l4 == null) {
                            throw new b(a2, "RET instruction outside of a sub routine");
                        }
                        for (int i4 = 0; i4 < l4.c.size(); ++i4) {
                            object2 = l4.c.get(i4);
                            n9 = this.c.b((com.growingio.d.a.d.a)object2);
                            if (this.dn[n9] == null) continue;
                            this.a(n9 + 1, this.dn[n9], f2, this.do[n9], l4.b);
                            this.b(n3, n9 + 1);
                        }
                    } else if (n7 != 191 && (n7 < 172 || n7 > 177)) {
                        if (l4 != null) {
                            if (a2 instanceof D) {
                                int n10 = ((D)a2).w;
                                l4.b[n10] = true;
                                if (n7 == 22 || n7 == 24 || n7 == 55 || n7 == 57) {
                                    l4.b[n10 + 1] = true;
                                }
                            } else if (a2 instanceof com.growingio.d.a.d.g) {
                                int n11 = ((com.growingio.d.a.d.g)a2).w;
                                l4.b[n11] = true;
                            }
                        }
                        this.a(n3 + 1, f2, l4);
                        this.b(n3, n3 + 1);
                    }
                }
                if ((object4 = this.dm[n3]) == null) continue;
                for (object2 = 0; object2 < object4.size(); ++object2) {
                    A a3 = (A)object4.get((int)object2);
                    object3 = a3.d == null ? u.b("java/lang/Throwable") : u.b(a3.d);
                    int n12 = this.c.b(a3.c);
                    if (!this.a(n3, a3)) continue;
                    f3.a(f4);
                    f3.d();
                    f3.b(this.a.b((u)object3));
                    this.a(n12, f3, l4);
                }
                continue;
            }
            catch (b var14_23) {
                throw new b(var14_23.a, "Error at instruction " + n3 + ": " + var14_23.getMessage(), var14_23);
            }
            catch (Exception var14_24) {
                throw new b(a2, "Error at instruction " + n3 + ": " + var14_24.getMessage(), var14_24);
            }
        }
        return this.dn;
    }

    private void a(int n2, l l2, List<com.growingio.d.a.d.a> list) throws b {
        do {
            Object object;
            int n3;
            Object object2;
            if (n2 < 0 || n2 >= this.b) {
                throw new b(null, "Execution can fall off end of the code");
            }
            if (this.do[n2] != null) {
                return;
            }
            this.do[n2] = l2.a();
            com.growingio.d.a.d.a a2 = this.c.a(n2);
            if (a2 instanceof n) {
                if (a2.a() == 168) {
                    list.add(a2);
                } else {
                    object2 = (n)a2;
                    this.a(this.c.b(object2.w), l2, list);
                }
            } else if (a2 instanceof z) {
                object2 = (z)a2;
                this.a(this.c.b(object2.y), l2, list);
                for (n3 = object2.z.size() - 1; n3 >= 0; --n3) {
                    object = object2.z.get(n3);
                    this.a(this.c.b((com.growingio.d.a.d.a)object), l2, list);
                }
            } else if (a2 instanceof com.growingio.d.a.d.t) {
                object2 = (com.growingio.d.a.d.t)a2;
                this.a(this.c.b(object2.w), l2, list);
                for (n3 = object2.y.size() - 1; n3 >= 0; --n3) {
                    object = object2.y.get(n3);
                    this.a(this.c.b((com.growingio.d.a.d.a)object), l2, list);
                }
            }
            object2 = this.dm[n2];
            if (object2 != null) {
                for (n3 = 0; n3 < object2.size(); ++n3) {
                    object = (A)object2.get(n3);
                    this.a(this.c.b(object.c), l2, list);
                }
            }
            switch (a2.a()) {
                case 167: 
                case 169: 
                case 170: 
                case 171: 
                case 172: 
                case 173: 
                case 174: 
                case 175: 
                case 176: 
                case 177: 
                case 191: {
                    return;
                }
            }
            ++n2;
        } while (true);
    }

    public f<V>[] a() {
        return this.dn;
    }

    public List<A> a(int n2) {
        return this.dm[n2];
    }

    protected void b(String string, v v2) throws b {
    }

    protected f<V> a(int n2, int n3) {
        return new f(n2, n3);
    }

    protected f<V> a(f<? extends V> f2) {
        return new f<V>(f2);
    }

    protected void b(int n2, int n3) {
    }

    protected boolean c(int n2, int n3) {
        return true;
    }

    protected boolean a(int n2, A a2) {
        return this.c(n2, this.c.b(a2.c));
    }

    private void a(int n2, f<V> f2, l l2) throws b {
        boolean bl2;
        f<V> f3 = this.dn[n2];
        l l3 = this.do[n2];
        if (f3 == null) {
            this.dn[n2] = this.a(f2);
            bl2 = true;
        } else {
            bl2 = f3.a(f2, this.a);
        }
        if (l3 == null) {
            if (l2 != null) {
                this.do[n2] = l2.a();
                bl2 = true;
            }
        } else if (l2 != null) {
            bl2 |= l3.a(l2);
        }
        if (bl2 && !this.dp[n2]) {
            this.dp[n2] = true;
            this.dq[this.dr++] = n2;
        }
    }

    private void a(int n2, f<V> f2, f<V> f3, l l2, boolean[] arrbl) throws b {
        boolean bl2;
        f<V> f4 = this.dn[n2];
        l l3 = this.do[n2];
        f3.a(f2, arrbl);
        if (f4 == null) {
            this.dn[n2] = this.a(f3);
            bl2 = true;
        } else {
            bl2 = f4.a(f3, this.a);
        }
        if (l3 != null && l2 != null) {
            bl2 |= l3.a(l2);
        }
        if (bl2 && !this.dp[n2]) {
            this.dp[n2] = true;
            this.dq[this.dr++] = n2;
        }
    }
}

