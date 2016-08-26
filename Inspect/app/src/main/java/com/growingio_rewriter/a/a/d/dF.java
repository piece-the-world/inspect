/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.aa;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.lE;
import com.growingio.a.a.d.lI;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class dF<K, V>
extends aa<K, V> {
    private static final int b = 2;
    transient int a = 2;
    private static final long c = 0;

    public static <K, V> dF<K, V> v() {
        return new dF<K, V>();
    }

    public static <K, V> dF<K, V> a(int n2, int n3) {
        return new dF<K, V>(n2, n3);
    }

    public static <K, V> dF<K, V> b(jr<? extends K, ? extends V> jr2) {
        return new dF<K, V>(jr2);
    }

    private dF() {
        super(new HashMap());
    }

    private dF(int n2, int n3) {
        super(ii.a(n2));
        aU.a(n3 >= 0);
        this.a = n3;
    }

    private dF(jr<? extends K, ? extends V> jr2) {
        super(ii.a(jr2.q().size()));
        this.a(jr2);
    }

    @Override
    Set<V> a() {
        return lI.a(this.a);
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        lE.a(this, objectOutputStream);
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.a = 2;
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

