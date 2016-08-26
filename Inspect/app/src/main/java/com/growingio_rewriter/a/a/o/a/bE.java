/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.bA;
import com.growingio.a.a.o.a.by;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

final class bE
extends Enum<bE>
implements bA {
    public static final /* enum */ bE a = new bE();
    private static final Set<WeakReference<Class<? extends Exception>>> b;
    private static final /* synthetic */ bE[] c;

    public static bE[] a() {
        return (bE[])c.clone();
    }

    public static bE a(String string) {
        return (bE)Enum.valueOf(bE.class, string);
    }

    private bE() {
        super(string, n2);
    }

    @Override
    public void a(Class<? extends Exception> class_) {
        for (WeakReference<Class<? extends Exception>> weakReference : b) {
            if (!class_.equals(weakReference.get())) continue;
            return;
        }
        by.b(class_);
        if (b.size() > 1000) {
            b.clear();
        }
        b.add(new WeakReference<Class<? extends Exception>>(class_));
    }

    static {
        c = new bE[]{a};
        b = new CopyOnWriteArraySet<WeakReference<Class<? extends Exception>>>();
    }
}

