/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.bM;
import com.growingio.a.a.o.a.bN;
import com.growingio.a.a.o.a.bO;

final class bQ
extends bO {
    private bQ() {
        super(null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    boolean a(bM bM2, Thread thread, Thread thread2) {
        bM bM3 = bM2;
        synchronized (bM3) {
            if (bM.a(bM2) == thread) {
                bM.a(bM2, thread2);
            }
        }
        return true;
    }

    /* synthetic */ bQ(bN bN2) {
        this();
    }
}

