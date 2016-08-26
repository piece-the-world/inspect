/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.ak;
import com.growingio.a.a.o.a.al;
import com.growingio.a.a.o.a.am;
import java.util.Set;

final class ao
extends am {
    private ao() {
        super(null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    void a(ak ak2, Set<Throwable> set, Set<Throwable> set2) {
        ak ak3 = ak2;
        synchronized (ak3) {
            if (ak.a(ak2) == set) {
                ak.a(ak2, set2);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    int a(ak ak2) {
        ak ak3 = ak2;
        synchronized (ak3) {
            ak.b(ak2);
            return ak.c(ak2);
        }
    }

    /* synthetic */ ao(al al2) {
        this();
    }
}

