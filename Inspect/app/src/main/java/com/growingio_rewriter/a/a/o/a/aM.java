/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.d.gO;
import com.growingio.a.a.o.a.aT;
import java.util.ArrayList;

final class aM
extends ThreadLocal<ArrayList<aT>> {
    aM() {
    }

    protected ArrayList<aT> a() {
        return gO.b(3);
    }

    @Override
    protected /* synthetic */ Object initialValue() {
        return this.a();
    }
}

