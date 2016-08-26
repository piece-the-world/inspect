/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.km;
import com.growingio.a.a.d.lF;
import com.growingio.a.a.d.lG;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

final class lE {
    private lE() {
    }

    static int a(ObjectInputStream objectInputStream) throws IOException {
        return objectInputStream.readInt();
    }

    static <K, V> void a(Map<K, V> map, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(map.size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    static <K, V> void a(Map<K, V> map, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        int n2 = objectInputStream.readInt();
        lE.a(map, objectInputStream, n2);
    }

    static <K, V> void a(Map<K, V> map, ObjectInputStream objectInputStream, int n2) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = objectInputStream.readObject();
            Object object2 = objectInputStream.readObject();
            map.put(object, object2);
        }
    }

    static <E> void a(kl<E> kl2, ObjectOutputStream objectOutputStream) throws IOException {
        int n2 = kl2.a().size();
        objectOutputStream.writeInt(n2);
        for (km<E> km2 : kl2.a()) {
            objectOutputStream.writeObject(km2.a());
            objectOutputStream.writeInt(km2.b());
        }
    }

    static <E> void a(kl<E> kl2, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        int n2 = objectInputStream.readInt();
        lE.a(kl2, objectInputStream, n2);
    }

    static <E> void a(kl<E> kl2, ObjectInputStream objectInputStream, int n2) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = objectInputStream.readObject();
            int n3 = objectInputStream.readInt();
            kl2.a(object, n3);
        }
    }

    static <K, V> void a(jr<K, V> jr2, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(jr2.c().size());
        for (Map.Entry<K, Collection<V>> entry : jr2.c().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().size());
            for (V v2 : entry.getValue()) {
                objectOutputStream.writeObject(v2);
            }
        }
    }

    static <K, V> void a(jr<K, V> jr2, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        int n2 = objectInputStream.readInt();
        lE.a(jr2, objectInputStream, n2);
    }

    static <K, V> void a(jr<K, V> jr2, ObjectInputStream objectInputStream, int n2) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = objectInputStream.readObject();
            Collection<V> collection = jr2.c(object);
            int n3 = objectInputStream.readInt();
            for (int i3 = 0; i3 < n3; ++i3) {
                Object object2 = objectInputStream.readObject();
                collection.add((Object)object2);
            }
        }
    }

    static <T> lG<T> a(Class<T> class_, String string) {
        try {
            Field field = class_.getDeclaredField(string);
            return new lG(field, null);
        }
        catch (NoSuchFieldException var2_3) {
            throw new AssertionError(var2_3);
        }
    }
}

