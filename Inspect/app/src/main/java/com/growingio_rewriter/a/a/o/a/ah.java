/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.oP;
import com.growingio.a.a.o.a.ai;
import com.growingio.a.a.o.a.bU;
import com.growingio.a.a.o.a.t;
import java.util.Set;
import java.util.logging.Logger;

abstract class ah<InputT, OutputT>
extends t<OutputT> {
    private static final Logger a = Logger.getLogger(ah.class.getName());
    private ah<InputT, OutputT> b;

    ah() {
    }

    @Override
    protected final void a() {
        super.a();
        this.b = null;
    }

    @Override
    public final boolean cancel(boolean bl2) {
        ah<InputT, OutputT> ah2 = this.b;
        dQ dQ2 = ah2 != null ? ai.a(ah2) : null;
        boolean bl3 = super.cancel(bl2);
        if (bl3 & dQ2 != null) {
            oP oP2 = dQ2.k_();
            while (oP2.hasNext()) {
                bU bU2 = (bU)oP2.next();
                bU2.cancel(bl2);
            }
        }
        return bl3;
    }

    @Override
    protected final void b() {
        ah<InputT, OutputT> ah2 = this.b;
        if (ah2 != null) {
            ah2.c();
        }
    }

    final void a(ah<InputT, OutputT> ah2) {
        this.b = ah2;
        ai.b(ah2);
    }

    private static boolean b(Set<Throwable> set, Throwable throwable) {
        while (throwable != null) {
            boolean bl2 = set.add(throwable);
            if (!bl2) {
                return false;
            }
            throwable = throwable.getCause();
        }
        return true;
    }

    static /* synthetic */ boolean a(Set set, Throwable throwable) {
        return ah.b(set, throwable);
    }

    static /* synthetic */ Logger f() {
        return a;
    }

    static /* synthetic */ boolean a(ah ah2, boolean bl2) {
        return ah2.cancel(bl2);
    }
}

