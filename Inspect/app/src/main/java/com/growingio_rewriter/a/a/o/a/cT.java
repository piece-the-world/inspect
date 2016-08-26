/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.cD;
import com.growingio.a.a.o.a.cF;
import com.growingio.a.a.o.a.cG;
import com.growingio.a.a.o.a.cN;
import com.growingio.a.a.o.a.cS;
import com.growingio.a.a.o.a.cU;
import java.lang.ref.WeakReference;
import java.util.logging.Level;

final class cT
extends cF {
    final cD a;
    final WeakReference<cU> b;

    cT(cD cD2, WeakReference<cU> weakReference) {
        this.a = cD2;
        this.b = weakReference;
    }

    @Override
    public void a() {
        cU cU2 = this.b.get();
        if (cU2 != null) {
            cU2.a(this.a, cG.a, cG.b);
            if (!(this.a instanceof cS)) {
                cN.h().log(Level.FINE, "Starting {0}.", this.a);
            }
        }
    }

    @Override
    public void b() {
        cU cU2 = this.b.get();
        if (cU2 != null) {
            cU2.a(this.a, cG.b, cG.c);
        }
    }

    @Override
    public void b(cG cG2) {
        cU cU2 = this.b.get();
        if (cU2 != null) {
            cU2.a(this.a, cG2, cG.d);
        }
    }

    @Override
    public void a(cG cG2) {
        cU cU2 = this.b.get();
        if (cU2 != null) {
            if (!(this.a instanceof cS)) {
                cN.h().log(Level.FINE, "Service {0} has terminated. Previous state was: {1}", new Object[]{this.a, cG2});
            }
            cU2.a(this.a, cG2, cG.e);
        }
    }

    @Override
    public void a(cG cG2, Throwable throwable) {
        cU cU2 = this.b.get();
        if (cU2 != null) {
            boolean bl2;
            boolean bl3 = bl2 = !(this.a instanceof cS);
            if (bl2) {
                cN.h().log(Level.SEVERE, "Service " + this.a + " has failed in the " + (Object)((Object)cG2) + " state.", throwable);
            }
            cU2.a(this.a, cG2, cG.f);
        }
    }
}

