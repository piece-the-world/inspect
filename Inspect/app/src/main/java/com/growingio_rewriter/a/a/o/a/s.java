/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.j;
import com.growingio.a.a.o.a.k;
import com.growingio.a.a.o.a.l;
import com.growingio.a.a.o.a.p;
import com.growingio.a.a.o.a.w;

final class s
extends l {
    private s() {
        super(null);
    }

    @Override
    void a(w w2, Thread thread) {
        w2.b = thread;
    }

    @Override
    void a(w w2, w w3) {
        w2.c = w3;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    boolean a(j<?> j2, w w2, w w3) {
        j j3 = j2;
        synchronized (j3) {
            if (j.b(j2) == w2) {
                j.a(j2, w3);
                return true;
            }
            return false;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    boolean a(j<?> j2, p p2, p p3) {
        j j3 = j2;
        synchronized (j3) {
            if (j.c(j2) == p2) {
                j.a(j2, p3);
                return true;
            }
            return false;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    boolean a(j<?> j2, Object object, Object object2) {
        j j3 = j2;
        synchronized (j3) {
            if (j.a(j2) == object) {
                j.a(j2, object2);
                return true;
            }
            return false;
        }
    }

    /* synthetic */ s(k k2) {
        this();
    }
}

