/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.f;

import com.growingio.a.a.b.aH;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.bP;
import com.growingio.a.a.c.B;
import com.growingio.a.a.c.N;
import com.growingio.a.a.c.f;
import com.growingio.a.a.d.dF;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.gO;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.oP;
import com.growingio.a.a.f.m;
import com.growingio.a.a.f.o;
import com.growingio.a.a.f.p;
import com.growingio.a.a.f.v;
import com.growingio.a.a.f.w;
import com.growingio.a.a.f.x;
import com.growingio.a.a.n.F;
import com.growingio.a.a.n.Y;
import com.growingio.a.a.o.a.dD;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

final class u {
    private final ConcurrentMap<Class<?>, CopyOnWriteArraySet<p>> a = ii.e();
    private final m b;
    private static final N<Class<?>, ea<Method>> c = f.a().i().a(new v());
    private static final N<Class<?>, fg<Class<?>>> d = f.a().i().a(new w());

    u(m m2) {
        this.b = aU.a(m2);
    }

    void a(Object object) {
        jr jr2 = this.d(object);
        for (Map.Entry entry : jr2.c().entrySet()) {
            Class class_ = entry.getKey();
            Collection<p> collection = entry.getValue();
            CopyOnWriteArraySet copyOnWriteArraySet = this.a.get(class_);
            if (copyOnWriteArraySet == null) {
                CopyOnWriteArraySet copyOnWriteArraySet2 = new CopyOnWriteArraySet();
                copyOnWriteArraySet = aH.a(this.a.putIfAbsent(class_, copyOnWriteArraySet2), copyOnWriteArraySet2);
            }
            copyOnWriteArraySet.addAll(collection);
        }
    }

    void b(Object object) {
        jr jr2 = this.d(object);
        for (Map.Entry entry : jr2.c().entrySet()) {
            Class class_ = entry.getKey();
            Collection<p> collection = entry.getValue();
            CopyOnWriteArraySet<p> copyOnWriteArraySet = this.a.get(class_);
            if (copyOnWriteArraySet != null && copyOnWriteArraySet.removeAll(collection)) continue;
            throw new IllegalArgumentException("missing event subscriber for an annotated method. Is " + object + " registered?");
        }
    }

    Set<p> a(Class<?> class_) {
        return aH.a(this.a.get(class_), fg.k());
    }

    Iterator<p> c(Object object) {
        fg fg2 = u.b(object.getClass());
        ArrayList<Iterator<p>> arrayList = gO.b(fg2.size());
        oP oP2 = fg2.k_();
        while (oP2.hasNext()) {
            Class class_ = oP2.next();
            CopyOnWriteArraySet<p> copyOnWriteArraySet = this.a.get(class_);
            if (copyOnWriteArraySet == null) continue;
            arrayList.add(copyOnWriteArraySet.iterator());
        }
        return gb.e(arrayList.iterator());
    }

    private jr<Class<?>, p> d(Object object) {
        dF dF2 = dF.v();
        Class class_ = object.getClass();
        oP<Method> oP2 = u.d(class_).k_();
        while (oP2.hasNext()) {
            Method method = oP2.next();
            Class<?>[] arrclass = method.getParameterTypes();
            Class class_2 = arrclass[0];
            dF2.a(class_2, p.a(this.b, object, method));
        }
        return dF2;
    }

    private static ea<Method> d(Class<?> class_) {
        return c.b(class_);
    }

    private static ea<Method> e(Class<?> class_) {
        Set set = F.a(class_).f().d();
        HashMap<x, Method> hashMap = ii.c();
        for (Class class_2 : set) {
            for (Method method : class_2.getDeclaredMethods()) {
                if (!method.isAnnotationPresent(o.class) || method.isSynthetic()) continue;
                Class<?>[] arrclass = method.getParameterTypes();
                aU.a(arrclass.length == 1, "Method %s has @Subscribe annotation but has %s parameters.Subscriber methods must have exactly 1 parameter.", (Object)method, arrclass.length);
                x x2 = new x(method);
                if (hashMap.containsKey(x2)) continue;
                hashMap.put(x2, method);
            }
        }
        return ea.a(hashMap.values());
    }

    static fg<Class<?>> b(Class<?> class_) {
        try {
            return d.b(class_);
        }
        catch (dD var1_1) {
            throw bP.c(var1_1.getCause());
        }
    }

    static /* synthetic */ ea c(Class class_) {
        return u.e(class_);
    }
}

