/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.jD;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.jt;
import com.growingio.a.a.d.ju;
import com.growingio.a.a.d.jv;
import com.growingio.a.a.d.jw;
import com.growingio.a.a.d.kO;
import java.util.Comparator;

public abstract class js<K0, V0> {
    private static final int a = 8;

    private js() {
    }

    public static jD<Object> a() {
        return js.a(8);
    }

    public static jD<Object> a(int n2) {
        aK.a(n2, "expectedKeys");
        return new jt(n2);
    }

    public static jD<Object> b() {
        return js.b(8);
    }

    public static jD<Object> b(int n2) {
        aK.a(n2, "expectedKeys");
        return new ju(n2);
    }

    public static jD<Comparable> c() {
        return js.a(kO.d());
    }

    public static <K0> jD<K0> a(Comparator<K0> comparator) {
        aU.a(comparator);
        return new jv(comparator);
    }

    public static <K0 extends Enum<K0>> jD<K0> a(Class<K0> class_) {
        aU.a(class_);
        return new jw(class_);
    }

    public abstract <K extends K0, V extends V0> jr<K, V> d();

    public <K extends K0, V extends V0> jr<K, V> a(jr<? extends K, ? extends V> jr2) {
        jr<? extends K, ? extends V> jr3 = this.d();
        jr3.a(jr2);
        return jr3;
    }

    /* synthetic */ js(jt jt2) {
        this();
    }
}

