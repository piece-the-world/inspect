/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.aa;
import com.growingio.a.a.d.gA;
import com.growingio.a.a.d.gw;
import com.growingio.a.a.d.gx;
import com.growingio.a.a.d.gy;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.kl;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public final class gv<K, V>
extends aa<K, V> {
    private static final int c = 16;
    private static final int d = 2;
    static final double a = 1.0;
    transient int b = 2;
    private transient gx<K, V> e;
    private static final long f = 1;

    public static <K, V> gv<K, V> v() {
        return new gv<K, V>(16, 2);
    }

    public static <K, V> gv<K, V> a(int n2, int n3) {
        return new gv<K, V>(ii.b(n2), ii.b(n3));
    }

    public static <K, V> gv<K, V> b(jr<? extends K, ? extends V> jr2) {
        gv<K, V> gv2 = gv.a(jr2.q().size(), 2);
        gv2.a(jr2);
        return gv2;
    }

    private static <K, V> void b(gA<K, V> gA2, gA<K, V> gA3) {
        gA2.b(gA3);
        gA3.a(gA2);
    }

    private static <K, V> void b(gx<K, V> gx2, gx<K, V> gx3) {
        gx2.a(gx3);
        gx3.b(gx2);
    }

    private static <K, V> void b(gA<K, V> gA2) {
        gv.b(gA2.a(), gA2.b());
    }

    private static <K, V> void b(gx<K, V> gx2) {
        gv.b(gx2.c(), gx2.d());
    }

    private gv(int n2, int n3) {
        super(new LinkedHashMap(n2));
        aK.a(n3, "expectedValuesPerKey");
        this.b = n3;
        this.e = new gx<Object, Object>(null, null, 0, null);
        gv.b(this.e, this.e);
    }

    @Override
    Set<V> a() {
        return new LinkedHashSet(this.b);
    }

    @Override
    Collection<V> e(K k2) {
        return new gy(this, k2, this.b);
    }

    @Override
    public Set<V> a(K k2, Iterable<? extends V> iterable) {
        return super.a(k2, iterable);
    }

    @Override
    public Set<Map.Entry<K, V>> u() {
        return super.u();
    }

    @Override
    public Collection<V> j() {
        return super.j();
    }

    @Override
    Iterator<Map.Entry<K, V>> m() {
        return new gw(this);
    }

    @Override
    Iterator<V> k() {
        return ii.b(this.m());
    }

    @Override
    public void h() {
        super.h();
        gv.b(this.e, this.e);
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.q().size());
        for (Object object2 : this.q()) {
            objectOutputStream.writeObject(object2);
        }
        objectOutputStream.writeInt(this.l_());
        for (Map.Entry entry : this.u()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        int n2;
        objectInputStream.defaultReadObject();
        this.e = new gx<Object, Object>(null, null, 0, null);
        gv.b(this.e, this.e);
        this.b = 2;
        int n3 = objectInputStream.readInt();
        LinkedHashMap<Object, Collection<V>> linkedHashMap = new LinkedHashMap<Object, Collection<V>>();
        for (n2 = 0; n2 < n3; ++n2) {
            Object object = objectInputStream.readObject();
            linkedHashMap.put(object, this.e(object));
        }
        n2 = objectInputStream.readInt();
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = objectInputStream.readObject();
            Object object2 = objectInputStream.readObject();
            ((Collection)linkedHashMap.get(object)).add(object2);
        }
        this.a(linkedHashMap);
    }

    @Override
    public /* synthetic */ Collection l() {
        return this.u();
    }

    @Override
    public /* synthetic */ Collection b(Object object, Iterable iterable) {
        return this.a(object, iterable);
    }

    @Override
    /* synthetic */ Collection d() {
        return this.a();
    }

    static /* synthetic */ void a(gA gA2, gA gA3) {
        gv.b(gA2, gA3);
    }

    static /* synthetic */ gx a(gv gv2) {
        return gv2.e;
    }

    static /* synthetic */ void a(gx gx2, gx gx3) {
        gv.b(gx2, gx3);
    }

    static /* synthetic */ void a(gA gA2) {
        gv.b(gA2);
    }

    static /* synthetic */ void a(gx gx2) {
        gv.b(gx2);
    }
}

