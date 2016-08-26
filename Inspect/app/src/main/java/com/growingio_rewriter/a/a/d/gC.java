/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.N;
import com.growingio.a.a.d.gD;
import com.growingio.a.a.d.gE;
import com.growingio.a.a.d.gF;
import com.growingio.a.a.d.gG;
import com.growingio.a.a.d.gJ;
import com.growingio.a.a.d.gK;
import com.growingio.a.a.d.gM;
import com.growingio.a.a.d.gN;
import com.growingio.a.a.d.gO;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.jO;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.kl;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class gC<K, V>
extends N<K, V>
implements gN<K, V>,
Serializable {
    private transient gK<K, V> a;
    private transient gK<K, V> b;
    private transient Map<K, gJ<K, V>> c;
    private transient int d;
    private transient int e;
    private static final long f = 0;

    public static <K, V> gC<K, V> a() {
        return new gC<K, V>();
    }

    public static <K, V> gC<K, V> a(int n2) {
        return new gC<K, V>(n2);
    }

    public static <K, V> gC<K, V> b(jr<? extends K, ? extends V> jr2) {
        return new gC<K, V>(jr2);
    }

    gC() {
        this.c = ii.c();
    }

    private gC(int n2) {
        this.c = new HashMap<K, gJ<K, V>>(n2);
    }

    private gC(jr<? extends K, ? extends V> jr2) {
        this(jr2.q().size());
        this.a(jr2);
    }

    private gK<K, V> a(K k2, V v2, gK<K, V> gK2) {
        gK<K, V> gK3 = new gK<K, V>(k2, v2);
        if (this.a == null) {
            this.a = this.b = gK3;
            this.c.put(k2, new gJ<K, V>(gK3));
            ++this.e;
        } else if (gK2 == null) {
            this.b.c = gK3;
            gK3.d = this.b;
            this.b = gK3;
            gJ<K, V> gJ2 = this.c.get(k2);
            if (gJ2 == null) {
                gJ2 = new gJ<K, V>(gK3);
                this.c.put(k2, gJ2);
                ++this.e;
            } else {
                ++gJ2.c;
                gK gK4 = gJ2.b;
                gK4.e = gK3;
                gK3.f = gK4;
                gJ2.b = gK3;
            }
        } else {
            gJ<K, V> gJ3 = this.c.get(k2);
            ++gJ3.c;
            gK3.d = gK2.d;
            gK3.f = gK2.f;
            gK3.c = gK2;
            gK3.e = gK2;
            if (gK2.f == null) {
                this.c.get(k2).a = gK3;
            } else {
                gK2.f.e = gK3;
            }
            if (gK2.d == null) {
                this.a = gK3;
            } else {
                gK2.d.c = gK3;
            }
            gK2.d = gK3;
            gK2.f = gK3;
        }
        ++this.d;
        return gK3;
    }

    private void a(gK<K, V> gK2) {
        if (gK2.d != null) {
            gK2.d.c = gK2.c;
        } else {
            this.a = gK2.c;
        }
        if (gK2.c != null) {
            gK2.c.d = gK2.d;
        } else {
            this.b = gK2.d;
        }
        if (gK2.f == null && gK2.e == null) {
            gJ<K, V> gJ2 = this.c.remove(gK2.a);
            gJ2.c = 0;
            ++this.e;
        } else {
            gJ<K, V> gJ3 = this.c.get(gK2.a);
            --gJ3.c;
            if (gK2.f == null) {
                gJ3.a = gK2.e;
            } else {
                gK2.f.e = gK2.e;
            }
            if (gK2.e == null) {
                gJ3.b = gK2.f;
            } else {
                gK2.e.f = gK2.f;
            }
        }
        --this.d;
    }

    private void h(Object object) {
        gb.i(new gM(this, object));
    }

    private static void i(Object object) {
        if (object == null) {
            throw new NoSuchElementException();
        }
    }

    @Override
    public int l_() {
        return this.d;
    }

    @Override
    public boolean o() {
        return this.a == null;
    }

    @Override
    public boolean f(Object object) {
        return this.c.containsKey(object);
    }

    @Override
    public boolean g(Object object) {
        return this.b().contains(object);
    }

    @Override
    public boolean a(K k2, V v2) {
        this.a(k2, v2, null);
        return true;
    }

    @Override
    public List<V> a(K k2, Iterable<? extends V> iterable) {
        List<V> list = this.j(k2);
        gM gM2 = new gM(this, k2);
        Iterator<V> iterator = iterable.iterator();
        while (gM2.hasNext() && iterator.hasNext()) {
            gM2.next();
            gM2.set(iterator.next());
        }
        while (gM2.hasNext()) {
            gM2.next();
            gM2.remove();
        }
        while (iterator.hasNext()) {
            gM2.add(iterator.next());
        }
        return list;
    }

    private List<V> j(Object object) {
        return Collections.unmodifiableList(gO.a(new gM(this, object)));
    }

    @Override
    public List<V> b(Object object) {
        List<V> list = this.j(object);
        this.h(object);
        return list;
    }

    @Override
    public void h() {
        this.a = null;
        this.b = null;
        this.c.clear();
        this.d = 0;
        ++this.e;
    }

    @Override
    public List<V> a(K k2) {
        return new gD(this, k2);
    }

    @Override
    Set<K> i() {
        return new gF(this);
    }

    public List<V> b() {
        return (List)super.j();
    }

    List<V> d() {
        return new gG(this);
    }

    public List<Map.Entry<K, V>> e() {
        return (List)super.l();
    }

    List<Map.Entry<K, V>> f() {
        return new gE(this);
    }

    @Override
    Iterator<Map.Entry<K, V>> m() {
        throw new AssertionError((Object)"should never be called");
    }

    @Override
    Map<K, Collection<V>> n() {
        return new jO(this);
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.l_());
        for (Map.Entry<K, V> entry : this.e()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.c = ii.d();
        int n2 = objectInputStream.readInt();
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = objectInputStream.readObject();
            Object object2 = objectInputStream.readObject();
            this.a(object, object2);
        }
    }

    @Override
    /* synthetic */ Collection t() {
        return this.d();
    }

    @Override
    public /* synthetic */ Collection j() {
        return this.b();
    }

    @Override
    /* synthetic */ Collection p() {
        return this.f();
    }

    @Override
    public /* synthetic */ Collection l() {
        return this.e();
    }

    @Override
    public /* synthetic */ Collection b(Object object, Iterable iterable) {
        return this.a((K)object, iterable);
    }

    @Override
    public /* synthetic */ Collection c(Object object) {
        return this.a(object);
    }

    @Override
    public /* synthetic */ Collection d(Object object) {
        return this.b(object);
    }

    static /* synthetic */ int a(gC gC2) {
        return gC2.e;
    }

    static /* synthetic */ gK b(gC gC2) {
        return gC2.b;
    }

    static /* synthetic */ gK c(gC gC2) {
        return gC2.a;
    }

    static /* synthetic */ void e(Object object) {
        gC.i(object);
    }

    static /* synthetic */ void a(gC gC2, gK gK2) {
        gC2.a(gK2);
    }

    static /* synthetic */ void a(gC gC2, Object object) {
        gC2.h(object);
    }

    static /* synthetic */ Map d(gC gC2) {
        return gC2.c;
    }

    static /* synthetic */ gK a(gC gC2, Object object, Object object2, gK gK2) {
        return gC2.a(object, object2, gK2);
    }

    static /* synthetic */ int e(gC gC2) {
        return gC2.d;
    }
}

