/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aH;
import com.growingio.a.a.d.gO;
import com.growingio.a.a.d.hE;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.o.a.aM;
import com.growingio.a.a.o.a.aN;
import com.growingio.a.a.o.a.aO;
import com.growingio.a.a.o.a.aQ;
import com.growingio.a.a.o.a.aT;
import com.growingio.a.a.o.a.aU;
import com.growingio.a.a.o.a.aY;
import com.growingio.a.a.o.a.ba;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Logger;

public class aL {
    private static final ConcurrentMap<Class<? extends Enum>, Map<? extends Enum, aT>> b = new hE().d().h();
    private static final Logger c = Logger.getLogger(aL.class.getName());
    final aY a;
    private static final ThreadLocal<ArrayList<aT>> d = new aM();

    public static aL a(aY aY2) {
        return new aL(aY2);
    }

    public ReentrantLock a(String string) {
        return this.a(string, false);
    }

    public ReentrantLock a(String string, boolean bl2) {
        return this.a == aU.c ? new ReentrantLock(bl2) : new aO(this, new aT(string), bl2, null);
    }

    public ReentrantReadWriteLock b(String string) {
        return this.b(string, false);
    }

    public ReentrantReadWriteLock b(String string, boolean bl2) {
        return this.a == aU.c ? new ReentrantReadWriteLock(bl2) : new aQ(this, new aT(string), bl2, null);
    }

    public static <E extends Enum<E>> ba<E> a(Class<E> class_, aY aY2) {
        com.growingio.a.a.b.aU.a(class_);
        com.growingio.a.a.b.aU.a(aY2);
        Map<? extends Enum, aT> map = aL.b(class_);
        return new ba<Enum>(aY2, map);
    }

    private static Map<? extends Enum, aT> b(Class<? extends Enum> class_) {
        Map<? extends Enum, aT> map = b.get(class_);
        if (map != null) {
            return map;
        }
        Map<? extends Enum, aT> map2 = aL.a(class_);
        map = b.putIfAbsent(class_, map2);
        return aH.a(map, map2);
    }

    static <E extends Enum<E>> Map<E, aT> a(Class<E> class_) {
        int n2;
        EnumMap<E, aT> enumMap = ii.a(class_);
        Enum[] arrenum = (Enum[])class_.getEnumConstants();
        int n3 = arrenum.length;
        ArrayList<aT> arrayList = gO.b(n3);
        for (Enum enum_ : arrenum) {
            aT aT2 = new aT(aL.a(enum_));
            arrayList.add(aT2);
            enumMap.put((Enum)enum_, aT2);
        }
        for (n2 = 1; n2 < n3; ++n2) {
            ((aT)arrayList.get(n2)).a((aY)aU.a, arrayList.subList(0, n2));
        }
        for (n2 = 0; n2 < n3 - 1; ++n2) {
            ((aT)arrayList.get(n2)).a((aY)aU.c, arrayList.subList(n2 + 1, n3));
        }
        return Collections.unmodifiableMap(enumMap);
    }

    private static String a(Enum<?> enum_) {
        return enum_.getDeclaringClass().getSimpleName() + "." + enum_.name();
    }

    private aL(aY aY2) {
        this.a = com.growingio.a.a.b.aU.a(aY2);
    }

    private void b(aN aN2) {
        if (!aN2.b()) {
            ArrayList<aT> arrayList = d.get();
            aT aT2 = aN2.a();
            aT2.a(this.a, arrayList);
            arrayList.add(aT2);
        }
    }

    private static void c(aN aN2) {
        if (!aN2.b()) {
            ArrayList<aT> arrayList = d.get();
            aT aT2 = aN2.a();
            for (int i2 = arrayList.size() - 1; i2 >= 0; --i2) {
                if (arrayList.get(i2) != aT2) continue;
                arrayList.remove(i2);
                break;
            }
        }
    }

    static /* synthetic */ Logger a() {
        return c;
    }

    /* synthetic */ aL(aY aY2, aM aM2) {
        this(aY2);
    }

    static /* synthetic */ void a(aL aL2, aN aN2) {
        aL2.b(aN2);
    }

    static /* synthetic */ void a(aN aN2) {
        aL.c(aN2);
    }
}

