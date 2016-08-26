/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.bV;
import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.eD;
import com.growingio.a.a.d.eI;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.ec;
import com.growingio.a.a.d.eh;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.ek;
import com.growingio.a.a.d.gN;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.lE;
import com.growingio.a.a.d.lG;
import com.growingio.a.a.d.oP;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class eg<K, V>
extends eD<K, V>
implements gN<K, V> {
    private transient eg<V, K> a;
    private static final long d = 0;

    public static <K, V> eg<K, V> a() {
        return bV.a;
    }

    public static <K, V> eg<K, V> d(K k2, V v2) {
        eh<K, V> eh2 = eg.b();
        eh2.a(k2, v2);
        return eh2.a();
    }

    public static <K, V> eg<K, V> a(K k2, V v2, K k3, V v3) {
        eh<K, V> eh2 = eg.b();
        eh2.a(k2, v2);
        eh2.a(k3, v3);
        return eh2.a();
    }

    public static <K, V> eg<K, V> a(K k2, V v2, K k3, V v3, K k4, V v4) {
        eh<K, V> eh2 = eg.b();
        eh2.a(k2, v2);
        eh2.a(k3, v3);
        eh2.a(k4, v4);
        return eh2.a();
    }

    public static <K, V> eg<K, V> a(K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        eh<K, V> eh2 = eg.b();
        eh2.a(k2, v2);
        eh2.a(k3, v3);
        eh2.a(k4, v4);
        eh2.a(k5, v5);
        return eh2.a();
    }

    public static <K, V> eg<K, V> a(K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        eh<K, V> eh2 = eg.b();
        eh2.a(k2, v2);
        eh2.a(k3, v3);
        eh2.a(k4, v4);
        eh2.a(k5, v5);
        eh2.a(k6, v6);
        return eh2.a();
    }

    public static <K, V> eh<K, V> b() {
        return new eh();
    }

    public static <K, V> eg<K, V> b(jr<? extends K, ? extends V> jr2) {
        Object object;
        if (jr2.o()) {
            return eg.a();
        }
        if (jr2 instanceof eg && !(object = (eg)jr2).w()) {
            return object;
        }
        object = new ek(jr2.c().size());
        int n2 = 0;
        for (Map.Entry<K, Collection<V>> entry : jr2.c().entrySet()) {
            ea<V> ea2 = ea.a(entry.getValue());
            if (ea2.isEmpty()) continue;
            object.b(entry.getKey(), ea2);
            n2 += ea2.size();
        }
        return new eg(object.b(), n2);
    }

    public static <K, V> eg<K, V> a(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new eh().a(iterable).a();
    }

    eg(ei<K, ea<V>> ei2, int n2) {
        super(ei2, n2);
    }

    public ea<V> e(K k2) {
        ea ea2 = (ea)this.b.get(k2);
        return ea2 == null ? ea.d() : ea2;
    }

    public eg<V, K> d() {
        eg<K, V> eg2 = this.a;
        eg<K, V> eg3 = eg2 == null ? (this.a = this.u()) : eg2;
        return eg3;
    }

    private eg<V, K> u() {
        eh eh2 = eg.b();
        Object object = this.z().k_();
        while (object.hasNext()) {
            Map.Entry entry = object.next();
            eh2.a(entry.getValue(), entry.getKey());
        }
        object = eh2.a();
        object.a = this;
        return object;
    }

    public ea<V> h(Object object) {
        throw new UnsupportedOperationException();
    }

    public ea<V> d(K k2, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        lE.a(this, objectOutputStream);
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        ei ei2;
        objectInputStream.defaultReadObject();
        int n2 = objectInputStream.readInt();
        if (n2 < 0) {
            throw new InvalidObjectException("Invalid key count " + n2);
        }
        ek ek2 = ei.j();
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = objectInputStream.readObject();
            int n4 = objectInputStream.readInt();
            if (n4 <= 0) {
                throw new InvalidObjectException("Invalid value count " + n4);
            }
            ec<Object> ec2 = ea.g();
            for (int i3 = 0; i3 < n4; ++i3) {
                ec2.c(objectInputStream.readObject());
            }
            ek2.b(object, ec2.b());
            n3 += n4;
        }
        try {
            ei2 = ek2.b();
        }
        catch (IllegalArgumentException var6_8) {
            throw (InvalidObjectException)new InvalidObjectException(var6_8.getMessage()).initCause(var6_8);
        }
        eI.a.a((eg)this, ei2);
        eI.b.a((eD)this, n3);
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
    public /* synthetic */ List a(Object object, Iterable iterable) {
        return this.d(object, iterable);
    }

    @Override
    public /* synthetic */ List b(Object object) {
        return this.h(object);
    }

    @Override
    public /* synthetic */ List a(Object object) {
        return this.e(object);
    }
}

