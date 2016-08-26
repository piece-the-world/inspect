/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.a;
import com.growingio.a.a.d.av;
import com.growingio.a.a.d.bY;
import com.growingio.a.a.d.lE;
import com.growingio.a.a.d.oT;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class bX<K extends Enum<K>, V extends Enum<V>>
extends a<K, V> {
    private transient Class<K> b;
    private transient Class<V> c;
    private static final long d = 0;

    public static <K extends Enum<K>, V extends Enum<V>> bX<K, V> a(Class<K> class_, Class<V> class_2) {
        return new bX<K, V>(class_, class_2);
    }

    public static <K extends Enum<K>, V extends Enum<V>> bX<K, V> a(Map<K, V> map) {
        bX<K, V> bX2 = bX.a(bX.b(map), bX.d(map));
        bX2.putAll(map);
        return bX2;
    }

    private bX(Class<K> class_, Class<V> class_2) {
        super(oT.a(new EnumMap(class_)), oT.a(new EnumMap(class_2)));
        this.b = class_;
        this.c = class_2;
    }

    static <K extends Enum<K>> Class<K> b(Map<K, ?> map) {
        if (map instanceof bX) {
            return ((bX)map).d();
        }
        if (map instanceof bY) {
            return ((bY)map).d();
        }
        aU.a(!map.isEmpty());
        return ((Enum)map.keySet().iterator().next()).getDeclaringClass();
    }

    private static <V extends Enum<V>> Class<V> d(Map<?, V> map) {
        if (map instanceof bX) {
            return ((bX)map).c;
        }
        aU.a(!map.isEmpty());
        return ((Enum)map.values().iterator().next()).getDeclaringClass();
    }

    public Class<K> d() {
        return this.b;
    }

    public Class<V> e() {
        return this.c;
    }

    @Override
    K a(K k2) {
        return (K)((Enum)aU.a(k2));
    }

    @Override
    V b(V v2) {
        return (V)((Enum)aU.a(v2));
    }

    @Override
    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.b);
        objectOutputStream.writeObject(this.c);
        lE.a(this, objectOutputStream);
    }

    @Override
    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.b = (Class)objectInputStream.readObject();
        this.c = (Class)objectInputStream.readObject();
        this.a(oT.a(new EnumMap(this.b)), oT.a(new EnumMap(this.c)));
        lE.a(this, objectInputStream);
    }
}

