/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aC;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aV;
import com.growingio.a.a.b.aX;
import com.growingio.a.a.b.aY;
import com.growingio.a.a.b.aZ;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.b.ba;
import com.growingio.a.a.b.bb;
import com.growingio.a.a.b.bc;
import com.growingio.a.a.b.bd;
import com.growingio.a.a.b.be;
import com.growingio.a.a.b.bf;
import com.growingio.a.a.b.bg;
import com.growingio.a.a.b.bl;
import com.growingio.a.a.b.bm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;

public final class aW {
    private static final aC a = aC.a(',');

    private aW() {
    }

    public static <T> aV<T> a() {
        return bg.a.b();
    }

    public static <T> aV<T> b() {
        return bg.b.b();
    }

    public static <T> aV<T> c() {
        return bg.c.b();
    }

    public static <T> aV<T> d() {
        return bg.d.b();
    }

    public static <T> aV<T> a(aV<T> aV2) {
        return new bf<T>(aV2);
    }

    public static <T> aV<T> a(Iterable<? extends aV<? super T>> iterable) {
        return new aY(aW.c(iterable), null);
    }

    public static /* varargs */ <T> aV<T> a(aV<? super T> ... arraV) {
        return new aY(aW.a(arraV), null);
    }

    public static <T> aV<T> a(aV<? super T> aV2, aV<? super T> aV3) {
        return new aY(aW.c(aU.a(aV2), aU.a(aV3)), null);
    }

    public static <T> aV<T> b(Iterable<? extends aV<? super T>> iterable) {
        return new bl(aW.c(iterable), null);
    }

    public static /* varargs */ <T> aV<T> b(aV<? super T> ... arraV) {
        return new bl(aW.a(arraV), null);
    }

    public static <T> aV<T> b(aV<? super T> aV2, aV<? super T> aV3) {
        return new bl(aW.c(aU.a(aV2), aU.a(aV3)), null);
    }

    public static <T> aV<T> a(T t2) {
        return t2 == null ? aW.c() : new be(t2, null);
    }

    public static aV<Object> a(Class<?> class_) {
        return new bd(class_, null);
    }

    public static aV<Class<?>> b(Class<?> class_) {
        return aW.c(class_);
    }

    public static aV<Class<?>> c(Class<?> class_) {
        return new bm(class_, null);
    }

    public static <T> aV<T> a(Collection<? extends T> collection) {
        return new bc(collection, null);
    }

    public static <A, B> aV<A> a(aV<B> aV2, aq<A, ? extends B> aq2) {
        return new aZ(aV2, aq2, null);
    }

    public static aV<CharSequence> a(String string) {
        return new ba(string);
    }

    public static aV<CharSequence> a(Pattern pattern) {
        return new bb(pattern);
    }

    private static <T> List<aV<? super T>> c(aV<? super T> aV2, aV<? super T> aV3) {
        return Arrays.asList(aV2, aV3);
    }

    private static /* varargs */ <T> List<T> a(T ... arrT) {
        return aW.c(Arrays.asList(arrT));
    }

    static <T> List<T> c(Iterable<T> iterable) {
        ArrayList<T> arrayList = new ArrayList<T>();
        for (T t2 : iterable) {
            arrayList.add(aU.a(t2));
        }
        return arrayList;
    }

    static /* synthetic */ aC e() {
        return a;
    }
}

