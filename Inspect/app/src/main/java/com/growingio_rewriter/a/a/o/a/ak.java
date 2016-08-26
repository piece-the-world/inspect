/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.d.lI;
import com.growingio.a.a.o.a.al;
import com.growingio.a.a.o.a.am;
import com.growingio.a.a.o.a.an;
import com.growingio.a.a.o.a.ao;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class ak {
    private volatile Set<Throwable> a = null;
    private volatile int b;
    private static final am c;
    private static final Logger d;

    ak(int n2) {
        this.b = n2;
    }

    final Set<Throwable> d() {
        Set set = this.a;
        if (set == null) {
            set = lI.b();
            this.a(set);
            c.a(this, null, set);
            set = this.a;
        }
        return set;
    }

    abstract void a(Set<Throwable> var1);

    final int e() {
        return c.a(this);
    }

    static /* synthetic */ Set a(ak ak2) {
        return ak2.a;
    }

    static /* synthetic */ Set a(ak ak2, Set set) {
        ak2.a = set;
        return ak2.a;
    }

    static /* synthetic */ int b(ak ak2) {
        return ak2.b--;
    }

    static /* synthetic */ int c(ak ak2) {
        return ak2.b;
    }

    static {
        am am22;
        am am22;
        d = Logger.getLogger(ak.class.getName());
        try {
            am22 = new an(AtomicReferenceFieldUpdater.newUpdater(ak.class, Set.class, "a"), AtomicIntegerFieldUpdater.newUpdater(ak.class, "b"));
        }
        catch (Throwable var1_1) {
            d.log(Level.SEVERE, "SafeAtomicHelper is broken!", var1_1);
            am22 = new ao(null);
        }
        c = am22;
    }
}

