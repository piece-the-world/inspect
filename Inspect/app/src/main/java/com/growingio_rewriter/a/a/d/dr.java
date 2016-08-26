/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aL;
import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.av;
import com.growingio.a.a.d.dD;
import com.growingio.a.a.d.dH;
import com.growingio.a.a.d.ds;
import com.growingio.a.a.d.du;
import com.growingio.a.a.d.dv;
import com.growingio.a.a.d.iS;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.lE;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class dr<K, V>
extends iS<K, V>
implements av<K, V>,
Serializable {
    private static final double a = 1.0;
    private transient du<K, V>[] b;
    private transient du<K, V>[] c;
    private transient du<K, V> d;
    private transient du<K, V> e;
    private transient int f;
    private transient int g;
    private transient int h;
    private transient av<V, K> i;
    private static final long j = 0;

    public static <K, V> dr<K, V> a() {
        return dr.a(16);
    }

    public static <K, V> dr<K, V> a(int n2) {
        return new dr<K, V>(n2);
    }

    public static <K, V> dr<K, V> a(Map<? extends K, ? extends V> map) {
        dr<K, V> dr2 = dr.a(map.size());
        dr2.putAll(map);
        return dr2;
    }

    private dr(int n2) {
        this.b(n2);
    }

    private void b(int n2) {
        aK.a(n2, "expectedSize");
        int n3 = dH.a(n2, 1.0);
        this.b = this.c(n3);
        this.c = this.c(n3);
        this.d = null;
        this.e = null;
        this.f = 0;
        this.g = n3 - 1;
        this.h = 0;
    }

    private void a(du<K, V> du2) {
        int n2 = du2.a & this.g;
        du<K, V> du3 = null;
        du<K, V> du4 = this.b[n2];
        do {
            if (du4 == du2) {
                if (du3 == null) {
                    this.b[n2] = du2.c;
                    break;
                }
                du3.c = du2.c;
                break;
            }
            du3 = du4;
            du4 = du4.c;
        } while (true);
        int n3 = du2.b & this.g;
        du3 = null;
        du<K, V> du5 = this.c[n3];
        do {
            if (du5 == du2) {
                if (du3 == null) {
                    this.c[n3] = du2.d;
                    break;
                }
                du3.d = du2.d;
                break;
            }
            du3 = du5;
            du5 = du5.d;
        } while (true);
        if (du2.f == null) {
            this.d = du2.e;
        } else {
            du2.f.e = du2.e;
        }
        if (du2.e == null) {
            this.e = du2.f;
        } else {
            du2.e.f = du2.f;
        }
        --this.f;
        ++this.h;
    }

    @Override
    private void a(du<K, V> du2, du<K, V> du3) {
        int n2 = du2.a & this.g;
        du2.c = this.b[n2];
        this.b[n2] = du2;
        int n3 = du2.b & this.g;
        du2.d = this.c[n3];
        this.c[n3] = du2;
        if (du3 == null) {
            du2.f = this.e;
            du2.e = null;
            if (this.e == null) {
                this.d = du2;
            } else {
                this.e.e = du2;
            }
            this.e = du2;
        } else {
            du2.f = du3.f;
            if (du2.f == null) {
                this.d = du2;
            } else {
                du2.f.e = du2;
            }
            du2.e = du3.e;
            if (du2.e == null) {
                this.e = du2;
            } else {
                du2.e.f = du2;
            }
        }
        ++this.f;
        ++this.h;
    }

    @Override
    private du<K, V> a(Object object, int n2) {
        du<K, V> du2 = this.b[n2 & this.g];
        while (du2 != null) {
            if (n2 == du2.a && aL.a(object, du2.g)) {
                return du2;
            }
            du2 = du2.c;
        }
        return null;
    }

    private du<K, V> b(Object object, int n2) {
        du<K, V> du2 = this.c[n2 & this.g];
        while (du2 != null) {
            if (n2 == du2.b && aL.a(object, du2.h)) {
                return du2;
            }
            du2 = du2.d;
        }
        return null;
    }

    @Override
    public boolean containsKey(Object object) {
        return this.a((K)object, (V)dH.a(object)) != null;
    }

    @Override
    public boolean containsValue(Object object) {
        return this.b(object, dH.a(object)) != null;
    }

    @Override
    public V get(Object object) {
        return ii.c(this.a((K)object, (V)dH.a(object)));
    }

    @Override
    public V put(K k2, V v2) {
        return this.a(k2, v2, false);
    }

    @Override
    public V a(K k2, V v2) {
        return this.a(k2, v2, true);
    }

    private V a(K k2, V v2, boolean bl2) {
        int n2 = dH.a(k2);
        int n3 = dH.a(v2);
        int n4 = this.a(k2, (V)n2);
        if (n4 != null && n3 == n4.b && aL.a(v2, n4.h)) {
            return v2;
        }
        du<K, V> du2 = this.b(v2, n3);
        if (du2 != null) {
            if (bl2) {
                this.a(du2);
            } else {
                throw new IllegalArgumentException("value already present: " + v2);
            }
        }
        du<K, V> du3 = new du<K, V>(k2, n2, v2, n3);
        if (n4 != null) {
            this.a((du<K, V>)n4);
            this.a((K)du3, (V)n4);
            n4.f = null;
            n4.e = null;
            this.d();
            return (V)n4.h;
        }
        this.a((K)du3, null);
        this.d();
        return null;
    }

    private K b(V v2, K k2, boolean bl2) {
        int n2 = dH.a(v2);
        int n3 = dH.a(k2);
        du<K, V> du2 = this.b(v2, n2);
        if (du2 != null && n3 == du2.a && aL.a(k2, du2.g)) {
            return k2;
        }
        int n4 = this.a(k2, (V)n3);
        if (n4 != null) {
            if (bl2) {
                this.a((du<K, V>)n4);
            } else {
                throw new IllegalArgumentException("value already present: " + k2);
            }
        }
        if (du2 != null) {
            this.a(du2);
        }
        du<K, V> du3 = new du<K, V>(k2, n3, v2, n2);
        this.a((K)du3, (V)n4);
        if (n4 != null) {
            n4.f = null;
            n4.e = null;
        }
        this.d();
        return ii.b(du2);
    }

    private void d() {
        du<K, V>[] arrdu = this.b;
        if (dH.a(this.f, arrdu.length, 1.0)) {
            int n2 = arrdu.length * 2;
            this.b = this.c(n2);
            this.c = this.c(n2);
            this.g = n2 - 1;
            this.f = 0;
            du<K, V> du2 = this.d;
            while (du2 != null) {
                this.a((K)du2, (V)du2);
                du2 = du2.e;
            }
            ++this.h;
        }
    }

    private du<K, V>[] c(int n2) {
        return new du[n2];
    }

    @Override
    public V remove(Object object) {
        int n2 = this.a((K)object, (V)dH.a(object));
        if (n2 == null) {
            return null;
        }
        this.a((du<K, V>)n2);
        n2.f = null;
        n2.e = null;
        return (V)n2.h;
    }

    @Override
    public void clear() {
        this.f = 0;
        Arrays.fill(this.b, null);
        Arrays.fill(this.c, null);
        this.d = null;
        this.e = null;
        ++this.h;
    }

    @Override
    public int size() {
        return this.f;
    }

    @Override
    public Set<K> keySet() {
        return new dD(this);
    }

    @Override
    public Set<V> o_() {
        return this.m_().keySet();
    }

    @Override
    Iterator<Map.Entry<K, V>> b() {
        return new ds(this);
    }

    @Override
    public av<V, K> m_() {
        dv dv2 = this.i == null ? (this.i = new dv(this, null)) : this.i;
        return dv2;
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        lE.a(this, objectOutputStream);
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.b(16);
        int n2 = lE.a(objectInputStream);
        lE.a(this, objectInputStream, n2);
    }

    @Override
    public /* synthetic */ Collection values() {
        return this.o_();
    }

    static /* synthetic */ du a(dr dr2) {
        return dr2.d;
    }

    static /* synthetic */ int b(dr dr2) {
        return dr2.h;
    }

    static /* synthetic */ void a(dr dr2, du du2) {
        dr2.a(du2);
    }

    static /* synthetic */ du a(dr dr2, Object object, int n2) {
        return dr2.a((K)object, (V)n2);
    }

    static /* synthetic */ du b(dr dr2, Object object, int n2) {
        return dr2.b(object, n2);
    }

    static /* synthetic */ void a(dr dr2, du du2, du du3) {
        dr2.a((K)du2, (V)du3);
    }

    static /* synthetic */ int c(dr dr2) {
        return dr2.f;
    }

    static /* synthetic */ Object a(dr dr2, Object object, Object object2, boolean bl2) {
        return dr2.b(object, object2, bl2);
    }
}

