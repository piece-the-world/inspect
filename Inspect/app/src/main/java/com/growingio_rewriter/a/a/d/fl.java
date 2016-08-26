/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aH;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.bW;
import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.eD;
import com.growingio.a.a.d.eI;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.ek;
import com.growingio.a.a.d.fA;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.fh;
import com.growingio.a.a.d.fm;
import com.growingio.a.a.d.fn;
import com.growingio.a.a.d.fz;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.lE;
import com.growingio.a.a.d.lG;
import com.growingio.a.a.d.lH;
import com.growingio.a.a.d.oP;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;

public class fl<K, V>
extends eD<K, V>
implements lH<K, V> {
    private final transient fg<V> a;
    private transient fl<V, K> d;
    private transient fg<Map.Entry<K, V>> e;
    private static final long f = 0;

    public static <K, V> fl<K, V> a() {
        return bW.a;
    }

    public static <K, V> fl<K, V> d(K k2, V v2) {
        fm<K, V> fm2 = fl.b();
        fm2.a(k2, v2);
        return fm2.a();
    }

    public static <K, V> fl<K, V> a(K k2, V v2, K k3, V v3) {
        fm<K, V> fm2 = fl.b();
        fm2.a(k2, v2);
        fm2.a(k3, v3);
        return fm2.a();
    }

    public static <K, V> fl<K, V> a(K k2, V v2, K k3, V v3, K k4, V v4) {
        fm<K, V> fm2 = fl.b();
        fm2.a(k2, v2);
        fm2.a(k3, v3);
        fm2.a(k4, v4);
        return fm2.a();
    }

    public static <K, V> fl<K, V> a(K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        fm<K, V> fm2 = fl.b();
        fm2.a(k2, v2);
        fm2.a(k3, v3);
        fm2.a(k4, v4);
        fm2.a(k5, v5);
        return fm2.a();
    }

    public static <K, V> fl<K, V> a(K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        fm<K, V> fm2 = fl.b();
        fm2.a(k2, v2);
        fm2.a(k3, v3);
        fm2.a(k4, v4);
        fm2.a(k5, v5);
        fm2.a(k6, v6);
        return fm2.a();
    }

    public static <K, V> fm<K, V> b() {
        return new fm();
    }

    public static <K, V> fl<K, V> b(jr<? extends K, ? extends V> jr2) {
        return fl.b(jr2, null);
    }

    private static <K, V> fl<K, V> b(jr<? extends K, ? extends V> jr2, Comparator<? super V> comparator) {
        Object object;
        aU.a(jr2);
        if (jr2.o() && comparator == null) {
            return fl.a();
        }
        if (jr2 instanceof fl && !(object = (fl)jr2).w()) {
            return object;
        }
        object = new ek(jr2.c().size());
        int n2 = 0;
        for (Map.Entry<K, Collection<V>> entry : jr2.c().entrySet()) {
            K k2 = entry.getKey();
            Collection<? extends V> collection = entry.getValue();
            fg<V> fg2 = fl.a(comparator, collection);
            if (fg2.isEmpty()) continue;
            object.b(k2, fg2);
            n2 += fg2.size();
        }
        return new fl(object.b(), n2, comparator);
    }

    public static <K, V> fl<K, V> a(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new fm().a(iterable).a();
    }

    fl(ei<K, fg<V>> ei2, int n2, Comparator<? super V> comparator) {
        super(ei2, n2);
        this.a = fl.a(comparator);
    }

    public fg<V> e(K k2) {
        fg fg2 = (fg)this.b.get(k2);
        return aH.a(fg2, this.a);
    }

    public fl<V, K> d() {
        fl<K, V> fl2 = this.d;
        fl<K, V> fl3 = fl2 == null ? (this.d = this.J()) : fl2;
        return fl3;
    }

    private fl<V, K> J() {
        fm<V, K> fm2 = fl.b();
        Object object = this.H().k_();
        while (object.hasNext()) {
            Map.Entry<K, V> entry = object.next();
            fm2.a(entry.getValue(), entry.getKey());
        }
        object = fm2.a();
        object.d = this;
        return object;
    }

    public fg<V> h(Object object) {
        throw new UnsupportedOperationException();
    }

    public fg<V> d(K k2, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    public fg<Map.Entry<K, V>> H() {
        fg<Map.Entry<K, V>> fg2 = this.e;
        fg<Map.Entry<K, V>> fg3 = fg2 == null ? (this.e = new fn(this)) : fg2;
        return fg3;
    }

    private static <V> fg<V> a(Comparator<? super V> comparator, Collection<? extends V> collection) {
        return comparator == null ? fg.a(collection) : fz.a(comparator, collection);
    }

    private static <V> fg<V> a(Comparator<? super V> comparator) {
        return comparator == null ? fg.k() : fz.a(comparator);
    }

    private static <V> fh<V> b(Comparator<? super V> comparator) {
        return comparator == null ? new fh() : new fA<V>(comparator);
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.I());
        lE.a(this, objectOutputStream);
    }

    Comparator<? super V> I() {
        return this.a instanceof fz ? ((fz)this.a).comparator() : null;
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        ei ei2;
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator)objectInputStream.readObject();
        int n2 = objectInputStream.readInt();
        if (n2 < 0) {
            throw new InvalidObjectException("Invalid key count " + n2);
        }
        ek<Object, fg<V>> ek2 = ei.j();
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = objectInputStream.readObject();
            int n4 = objectInputStream.readInt();
            if (n4 <= 0) {
                throw new InvalidObjectException("Invalid value count " + n4);
            }
            fh<V> fh2 = fl.b(comparator);
            for (int i3 = 0; i3 < n4; ++i3) {
                fh2.c((Object)objectInputStream.readObject());
            }
            fg<V> fg2 = fh2.b();
            if (fg2.size() != n4) {
                throw new InvalidObjectException("Duplicate key-value pairs exist for key " + object);
            }
            ek2.b(object, fg2);
            n3 += n4;
        }
        try {
            ei2 = ek2.b();
        }
        catch (IllegalArgumentException var7_9) {
            throw (InvalidObjectException)new InvalidObjectException(var7_9.getMessage()).initCause(var7_9);
        }
        eI.a.a((fl)this, ei2);
        eI.b.a((eD)this, n3);
        eI.c.a(this, fl.a(comparator));
    }

    @Override
    public /* synthetic */ dQ z() {
        return this.H();
    }

    @Override
    public /* synthetic */ eD e() {
        return this.d();
    }

    @Override
    public /* synthetic */ dQ i(Object object) {
        return this.e(object);
    }

    @Override
    public /* synthetic */ dQ e(Object object, Iterable iterable) {
        return this.d(object, iterable);
    }

    @Override
    public /* synthetic */ dQ j(Object object) {
        return this.h(object);
    }

    @Override
    public /* synthetic */ Collection l() {
        return this.H();
    }

    @Override
    public /* synthetic */ Collection b(Object object, Iterable iterable) {
        return this.d(object, iterable);
    }

    @Override
    public /* synthetic */ Collection c(Object object) {
        return this.e(object);
    }

    @Override
    public /* synthetic */ Collection d(Object object) {
        return this.h(object);
    }

    @Override
    public /* synthetic */ Set u() {
        return this.H();
    }

    @Override
    public /* synthetic */ Set a(Object object, Iterable iterable) {
        return this.d(object, iterable);
    }

    @Override
    public /* synthetic */ Set b(Object object) {
        return this.h(object);
    }

    @Override
    public /* synthetic */ Set a(Object object) {
        return this.e(object);
    }

    static /* synthetic */ fl a(jr jr2, Comparator comparator) {
        return fl.b(jr2, comparator);
    }
}

