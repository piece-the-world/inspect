/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.B;
import com.growingio.a.a.d.F;
import com.growingio.a.a.d.ab;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.kO;
import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.lE;
import com.growingio.a.a.d.lI;
import com.growingio.a.a.d.n;
import com.growingio.a.a.d.w;
import com.growingio.a.a.d.x;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class nW<K, V>
extends ab<K, V> {
    private transient Comparator<? super K> a;
    private transient Comparator<? super V> b;
    private static final long c = 0;

    public static <K extends Comparable, V extends Comparable> nW<K, V> A() {
        return new nW(kO.d(), kO.d());
    }

    public static <K, V> nW<K, V> a(Comparator<? super K> comparator, Comparator<? super V> comparator2) {
        return new nW<K, V>(aU.a(comparator), aU.a(comparator2));
    }

    public static <K extends Comparable, V extends Comparable> nW<K, V> b(jr<? extends K, ? extends V> jr2) {
        return new nW<K, V>(kO.d(), kO.d(), jr2);
    }

    nW(Comparator<? super K> comparator, Comparator<? super V> comparator2) {
        super(new TreeMap(comparator));
        this.a = comparator;
        this.b = comparator2;
    }

    private nW(Comparator<? super K> comparator, Comparator<? super V> comparator2, jr<? extends K, ? extends V> jr2) {
        this(comparator, comparator2);
        this.a(jr2);
    }

    @Override
    SortedSet<V> y() {
        return new TreeSet<V>(this.b);
    }

    @Override
    Collection<V> e(K k2) {
        if (k2 == null) {
            this.B().compare(k2, k2);
        }
        return super.e(k2);
    }

    public Comparator<? super K> B() {
        return this.a;
    }

    @Override
    public Comparator<? super V> d_() {
        return this.b;
    }

    NavigableMap<K, Collection<V>> C() {
        return (NavigableMap)super.w();
    }

    public NavigableSet<V> j(K k2) {
        return (NavigableSet)super.h(k2);
    }

    @Override
    Collection<V> a(Collection<V> collection) {
        return lI.a((NavigableSet)collection);
    }

    @Override
    Collection<V> a(K k2, Collection<V> collection) {
        return new F((n)this, k2, (NavigableSet)collection, null);
    }

    public NavigableSet<K> D() {
        return (NavigableSet)super.x();
    }

    NavigableSet<K> E() {
        return new x((n)this, this.C());
    }

    public NavigableMap<K, Collection<V>> F() {
        return (NavigableMap)super.v();
    }

    NavigableMap<K, Collection<V>> G() {
        return new w((n)this, this.C());
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.B());
        objectOutputStream.writeObject(this.d_());
        lE.a(this, objectOutputStream);
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.a = aU.a((Comparator)objectInputStream.readObject());
        this.b = aU.a((Comparator)objectInputStream.readObject());
        this.a(new TreeMap(this.a));
        lE.a(this, objectInputStream);
    }

    @Override
    public /* synthetic */ SortedSet x() {
        return this.D();
    }

    @Override
    /* synthetic */ SortedMap w() {
        return this.C();
    }

    @Override
    public /* synthetic */ SortedMap v() {
        return this.F();
    }

    @Override
    public /* synthetic */ Map c() {
        return this.F();
    }

    @Override
    public /* synthetic */ SortedSet h(Object object) {
        return this.j(object);
    }

    @Override
    public /* synthetic */ Set a(Object object) {
        return this.j(object);
    }

    @Override
    public /* synthetic */ Set q() {
        return this.D();
    }

    @Override
    public /* synthetic */ Collection c(Object object) {
        return this.j(object);
    }

    @Override
    /* synthetic */ Set a() {
        return this.y();
    }

    @Override
    /* synthetic */ Map n() {
        return this.G();
    }

    @Override
    /* synthetic */ Set i() {
        return this.E();
    }

    @Override
    /* synthetic */ Map f() {
        return this.C();
    }

    @Override
    /* synthetic */ Collection d() {
        return this.y();
    }
}

