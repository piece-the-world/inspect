/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.I;
import com.growingio.a.a.d.bv;
import com.growingio.a.a.d.fL;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.km;
import com.growingio.a.a.d.kn;
import com.growingio.a.a.d.lE;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class gB<E>
extends I<E> {
    private static final long a = 0;

    public static <E> gB<E> g() {
        return new gB<E>();
    }

    public static <E> gB<E> a(int n2) {
        return new gB<E>(n2);
    }

    public static <E> gB<E> a(Iterable<? extends E> iterable) {
        gB<E> gB2 = gB.a(kn.a(iterable));
        fL.a(gB2, iterable);
        return gB2;
    }

    private gB() {
        super(new LinkedHashMap());
    }

    private gB(int n2) {
        super(ii.c(n2));
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        lE.a(this, objectOutputStream);
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int n2 = lE.a(objectInputStream);
        this.a(new LinkedHashMap());
        lE.a(this, objectInputStream, n2);
    }
}

