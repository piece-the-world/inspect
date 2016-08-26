/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.kU;
import java.lang.reflect.Array;
import java.util.Collection;

public final class kN {
    static final Object[] a = new Object[0];

    private kN() {
    }

    public static <T> T[] a(Class<T> class_, int n2) {
        return (Object[])Array.newInstance(class_, n2);
    }

    public static <T> T[] a(T[] arrT, int n2) {
        return kU.a(arrT, n2);
    }

    public static <T> T[] a(T[] arrT, T[] arrT2, Class<T> class_) {
        T[] arrT3 = kN.a(class_, arrT.length + arrT2.length);
        System.arraycopy(arrT, 0, arrT3, 0, arrT.length);
        System.arraycopy(arrT2, 0, arrT3, arrT.length, arrT2.length);
        return arrT3;
    }

    public static <T> T[] a(T t2, T[] arrT) {
        int[] arrn = kN.a(arrT, arrT.length + 1);
        arrn[0] = t2;
        System.arraycopy(arrT, 0, arrn, 1, arrT.length);
        return arrn;
    }

    public static <T> T[] a(T[] arrT, T t2) {
        T[] arrT2 = kN.b(arrT, arrT.length + 1);
        arrT2[arrT.length] = t2;
        return arrT2;
    }

    static <T> T[] b(T[] arrT, int n2) {
        int[] arrn = kN.a(arrT, n2);
        System.arraycopy(arrT, 0, arrn, 0, Math.min(arrT.length, n2));
        return arrn;
    }

    static <T> T[] a(Collection<?> collection, T[] arrT) {
        int n2 = collection.size();
        if (arrT.length < n2) {
            arrT = kN.a(arrT, n2);
        }
        kN.a(collection, (Object[])arrT);
        if (arrT.length > n2) {
            arrT[n2] = null;
        }
        return arrT;
    }

    static <T> T[] a(Object[] arrobject, int n2, int n3, T[] arrT) {
        aU.a(n2, n2 + n3, arrobject.length);
        if (arrT.length < n3) {
            arrT = kN.a(arrT, n3);
        } else if (arrT.length > n3) {
            arrT[n3] = null;
        }
        System.arraycopy(arrobject, n2, arrT, 0, n3);
        return arrT;
    }

    static Object[] a(Collection<?> collection) {
        return kN.a(collection, new Object[collection.size()]);
    }

    static Object[] a(Object[] arrobject, int n2, int n3) {
        aU.a(n2, n2 + n3, arrobject.length);
        if (n3 == 0) {
            return a;
        }
        Object[] arrobject2 = new Object[n3];
        System.arraycopy(arrobject, n2, arrobject2, 0, n3);
        return arrobject2;
    }

    private static Object[] a(Iterable<?> iterable, Object[] arrobject) {
        int n2 = 0;
        for (Object obj : iterable) {
            arrobject[n2++] = obj;
        }
        return arrobject;
    }

    static void b(Object[] arrobject, int n2, int n3) {
        Object object = arrobject[n2];
        arrobject[n2] = arrobject[n3];
        arrobject[n3] = object;
    }

    static /* varargs */ Object[] a(Object ... arrobject) {
        return kN.c(arrobject, arrobject.length);
    }

    static Object[] c(Object[] arrobject, int n2) {
        for (int i2 = 0; i2 < n2; ++i2) {
            kN.a(arrobject[i2], i2);
        }
        return arrobject;
    }

    static Object a(Object object, int n2) {
        if (object == null) {
            throw new NullPointerException("at index " + n2);
        }
        return object;
    }
}

