/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.c;

import com.growingio.b.a.B;
import com.growingio.b.a.Z;
import com.growingio.b.a.as;
import com.growingio.b.a.c.a;
import com.growingio.b.a.c.b;
import com.growingio.b.a.c.c;
import com.growingio.b.a.c.e;
import com.growingio.b.a.i;
import com.growingio.b.a.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

public class d {
    protected a a(int n2) {
        return new a(n2);
    }

    protected a[] b(int n2) {
        return new a[n2];
    }

    private a[] a(a a2) {
        a[] arra = this.b(1);
        arra[0] = a2;
        return arra;
    }

    private a[] a(a a2, a a3) {
        a[] arra = this.b(2);
        arra[0] = a2;
        arra[1] = a3;
        return arra;
    }

    public a[] a(as as2) throws i {
        y y2 = as2.j();
        if (y2 == null) {
            return null;
        }
        B b2 = y2.k();
        return this.a(b2, 0, b2.d(), y2.l());
    }

    public a[] a(B b2, int n2, int n3, Z z2) throws i {
        HashMap hashMap = this.b(b2, n2, n3, z2);
        a[] arra = this.a(hashMap);
        this.a(arra, z2);
        return arra;
    }

    private e a(HashMap hashMap, int n2) {
        return this.a(hashMap, n2, true, true);
    }

    private e a(HashMap hashMap, int n2, a[] arra, int n3, boolean bl2) {
        e e2 = this.a(hashMap, n2, false, false);
        e2.a(arra, n3, bl2);
        return e2;
    }

    private e a(HashMap hashMap, int n2, boolean bl2, boolean bl3) {
        Integer n3 = new Integer(n2);
        e e2 = (e)hashMap.get(n3);
        if (e2 == null) {
            e2 = new e(n2);
            hashMap.put(n3, e2);
        }
        if (bl2) {
            if (e2.b == null) {
                e2.b = this.a(n2);
            }
            if (bl3) {
                ++e2.b.g;
            }
        }
        return e2;
    }

    private HashMap b(B b2, int n2, int n3, Z z2) throws i {
        int n4;
        b2.a();
        b2.a(n2);
        HashMap hashMap = new HashMap();
        while (b2.e() && (n4 = b2.f()) < n3) {
            int n5 = b2.c(n4);
            if (153 <= n5 && n5 <= 166 || n5 == 198 || n5 == 199) {
                e e2 = this.a(hashMap, n4 + b2.f(n4 + 1));
                e e3 = this.a(hashMap, n4 + 3);
                this.a(hashMap, n4, this.a(e2.b, e3.b), 3, false);
                continue;
            }
            if (167 <= n5 && n5 <= 171) {
                switch (n5) {
                    int n6;
                    int n7;
                    case 167: {
                        this.b(hashMap, n4, n4 + b2.f(n4 + 1), 3);
                        break;
                    }
                    case 168: {
                        this.a(hashMap, n4, n4 + b2.f(n4 + 1), 3);
                        break;
                    }
                    case 169: {
                        this.a(hashMap, n4, null, 2, true);
                        break;
                    }
                    case 170: {
                        int n8 = (n4 & -4) + 4;
                        int n9 = b2.g(n8 + 4);
                        int n10 = b2.g(n8 + 8);
                        n7 = n10 - n9 + 1;
                        a[] arra = this.b(n7 + 1);
                        arra[0] = this.a(hashMap, (int)(n4 + b2.g((int)n8))).b;
                        int n11 = n6 + n7 * 4;
                        int n12 = 1;
                        for (n6 = n8 + 12; n6 < n11; n6 += 4) {
                            arra[n12++] = this.a(hashMap, (int)(n4 + b2.g((int)n6))).b;
                        }
                        this.a(hashMap, n4, arra, n11 - n4, true);
                        break;
                    }
                    case 171: {
                        int n13 = (n4 & -4) + 4;
                        int n14 = b2.g(n13 + 4);
                        a[] arra = this.b(n14 + 1);
                        arra[0] = this.a(hashMap, (int)(n4 + b2.g((int)n13))).b;
                        int n15 = n7 + n14 * 8 - 4;
                        n6 = 1;
                        for (n7 = n13 + 8 + 4; n7 < n15; n7 += 8) {
                            arra[n6++] = this.a(hashMap, (int)(n4 + b2.g((int)n7))).b;
                        }
                        this.a(hashMap, n4, arra, n15 - n4, true);
                        break;
                    }
                }
                continue;
            }
            if (172 <= n5 && n5 <= 177 || n5 == 191) {
                this.a(hashMap, n4, null, 1, true);
                continue;
            }
            if (n5 == 200) {
                this.b(hashMap, n4, n4 + b2.g(n4 + 1), 5);
                continue;
            }
            if (n5 == 201) {
                this.a(hashMap, n4, n4 + b2.g(n4 + 1), 5);
                continue;
            }
            if (n5 != 196 || b2.c(n4 + 1) != 169) continue;
            this.a(hashMap, n4, null, 4, true);
        }
        if (z2 != null) {
            n4 = z2.a();
            while (--n4 >= 0) {
                this.a(hashMap, z2.a(n4), true, false);
                this.a(hashMap, z2.c(n4));
            }
        }
        return hashMap;
    }

    private void b(HashMap hashMap, int n2, int n3, int n4) {
        e e2 = this.a(hashMap, n3);
        a[] arra = this.a(e2.b);
        this.a(hashMap, n2, arra, n4, true);
    }

    protected void a(HashMap hashMap, int n2, int n3, int n4) throws i {
        throw new c();
    }

    private a[] a(HashMap hashMap) {
        Object[] arrobject = hashMap.values().toArray(new e[hashMap.size()]);
        Arrays.sort(arrobject);
        ArrayList<a> arrayList = new ArrayList<a>();
        int n2 = 0;
        a a2 = arrobject.length > 0 && arrobject[0].a == 0 && arrobject[0].b != null ? d.a((e)arrobject[n2++]) : this.a(0);
        arrayList.add(a2);
        while (n2 < arrobject.length) {
            Object object;
            a a3;
            if ((a3 = d.a((e)(object = arrobject[n2++]))) == null) {
                if (a2.f > 0) {
                    a2 = this.a(a2.e + a2.f);
                    arrayList.add(a2);
                }
                a2.f = object.a + object.e - a2.e;
                a2.h = object.c;
                a2.i = object.d;
                continue;
            }
            if (a2.f == 0) {
                a2.f = object.a - a2.e;
                ++a3.g;
                a2.h = this.a(a3);
            } else if (a2.e + a2.f < object.a) {
                a2 = this.a(a2.e + a2.f);
                arrayList.add(a2);
                a2.f = object.a - a2.e;
                a2.i = true;
                a2.h = this.a(a3);
            }
            arrayList.add(a3);
            a2 = a3;
        }
        return arrayList.toArray(this.b(arrayList.size()));
    }

    private static a a(e e2) {
        a a2 = e2.b;
        if (a2 != null && e2.e > 0) {
            a2.h = e2.c;
            a2.f = e2.e;
            a2.i = e2.d;
        }
        return a2;
    }

    private void a(a[] arra, Z z2) throws i {
        if (z2 == null) {
            return;
        }
        int n2 = z2.a();
        while (--n2 >= 0) {
            a a2 = a.a(arra, z2.c(n2));
            int n3 = z2.a(n2);
            int n4 = z2.b(n2);
            int n5 = z2.d(n2);
            --a2.g;
            for (int i2 = 0; i2 < arra.length; ++i2) {
                a a3 = arra[i2];
                int n6 = a3.e;
                if (n3 > n6 || n6 >= n4) continue;
                a3.j = new b(a2, n5, a3.j);
                ++a2.g;
            }
        }
    }
}

