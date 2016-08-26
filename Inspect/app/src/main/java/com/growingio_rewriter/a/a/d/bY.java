/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.a;
import com.growingio.a.a.d.av;
import com.growingio.a.a.d.bX;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.lE;
import com.growingio.a.a.d.oT;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class bY<K extends Enum<K>, V>
extends a<K, V> {
    private transient Class<K> b;
    private static final long c = 0;

    public static <K extends Enum<K>, V> bY<K, V> a(Class<K> class_) {
        return new bY<K, V>(class_);
    }

    public static <K extends Enum<K>, V> bY<K, V> a(Map<K, ? extends V> map) {
        Map<K, V> map2 = bY.a(bX.b(map));
        map2.putAll(map);
        return map2;
    }

    private bY(Class<K> class_) {
        super(oT.a(new EnumMap(class_)), ii.a(((Enum[])class_.getEnumConstants()).length));
        this.b = class_;
    }

    @Override
    K a(K k2) {
        return (K)((Enum)aU.a(k2));
    }

    @Override
    public V a(K k2, V v2) {
        return super.put(k2, v2);
    }

    public V b(K k2, V v2) {
        return super.a(k2, v2);
    }

    public Class<K> d() {
        return this.b;
    }

    @Override
    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.b);
        lE.a(this, objectOutputStream);
    }

    @Override
    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.b = (Class)objectInputStream.readObject();
        this.a((K)oT.a(new EnumMap(this.b)), (V)new HashMap(((Enum[])this.b.getEnumConstants()).length * 3 / 2));
        lE.a(this, objectInputStream);
    }

    @Override
    public /* synthetic */ Object a(Object object, Object object2) {
        return this.b((Enum)object, object2);
    }

    @Override
    public /* synthetic */ Object put(Object object, Object object2) {
        return this.a((K)((Enum)object), (V)object2);
    }
}

