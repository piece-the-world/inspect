/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.I;
import com.growingio.a.a.d.bv;
import com.growingio.a.a.d.fL;
import com.growingio.a.a.d.km;
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

public final class bZ<E extends Enum<E>>
extends I<E> {
    private transient Class<E> a;
    private static final long b = 0;

    public static <E extends Enum<E>> bZ<E> a(Class<E> class_) {
        return new bZ<E>(class_);
    }

    public static <E extends Enum<E>> bZ<E> a(Iterable<E> iterable) {
        Iterator<E> iterator = iterable.iterator();
        aU.a(iterator.hasNext(), (Object)"EnumMultiset constructor passed empty Iterable");
        bZ bZ2 = new bZ(((Enum)iterator.next()).getDeclaringClass());
        fL.a(bZ2, iterable);
        return bZ2;
    }

    public static <E extends Enum<E>> bZ<E> a(Iterable<E> iterable, Class<E> class_) {
        bZ<E> bZ2 = bZ.a(class_);
        fL.a(bZ2, iterable);
        return bZ2;
    }

    private bZ(Class<E> class_) {
        super(oT.a(new EnumMap(class_)));
        this.a = class_;
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.a);
        lE.a(this, objectOutputStream);
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        Class class_;
        objectInputStream.defaultReadObject();
        this.a = class_ = (Class)objectInputStream.readObject();
        this.a(oT.a(new EnumMap(this.a)));
        lE.a(this, objectInputStream);
    }
}

