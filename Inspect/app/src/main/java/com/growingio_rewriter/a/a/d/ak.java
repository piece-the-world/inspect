/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.lE;
import com.growingio.a.a.d.m;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ak<K, V>
extends m<K, V> {
    private static final int b = 3;
    transient int a;
    private static final long c = 0;

    public static <K, V> ak<K, V> u() {
        return new ak<K, V>();
    }

    public static <K, V> ak<K, V> a(int n2, int n3) {
        return new ak<K, V>(n2, n3);
    }

    public static <K, V> ak<K, V> b(jr<? extends K, ? extends V> jr2) {
        return new ak<K, V>(jr2);
    }

    private ak() {
        super(new HashMap());
        this.a = 3;
    }

    private ak(int n2, int n3) {
        super(ii.a(n2));
        aK.a(n3, "expectedValuesPerKey");
        this.a = n3;
    }

    private ak(jr<? extends K, ? extends V> jr2) {
        this(jr2.q().size(), jr2 instanceof ak ? ((ak)jr2).a : 3);
        this.a(jr2);
    }

    @Override
    List<V> a() {
        return new ArrayList(this.a);
    }

    public void v() {
        for (Collection collection : this.f().values()) {
            ArrayList arrayList = (ArrayList)collection;
            arrayList.trimToSize();
        }
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        lE.a(this, objectOutputStream);
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.a = 3;
        int n2 = lE.a(objectInputStream);
        HashMap hashMap = ii.c();
        this.a(hashMap);
        lE.a(this, objectInputStream, n2);
    }

    @Override
    /* synthetic */ Collection d() {
        return this.a();
    }
}

