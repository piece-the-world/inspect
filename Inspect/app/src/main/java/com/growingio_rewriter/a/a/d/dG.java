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
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class dG<E>
extends I<E> {
    private static final long a = 0;

    public static <E> dG<E> g() {
        return new dG<E>();
    }

    public static <E> dG<E> a(int n2) {
        return new dG<E>(n2);
    }

    public static <E> dG<E> a(Iterable<? extends E> iterable) {
        dG<E> dG2 = dG.a(kn.a(iterable));
        fL.a(dG2, iterable);
        return dG2;
    }

    private dG() {
        super(new HashMap());
    }

    private dG(int n2) {
        super(ii.a(n2));
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        lE.a(this, objectOutputStream);
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int n2 = lE.a(objectInputStream);
        this.a(ii.c());
        lE.a(this, objectInputStream, n2);
    }
}

