/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aA;
import com.growingio.a.a.d.aw;
import com.growingio.a.a.d.cx;
import com.growingio.a.a.d.oP;
import java.util.Iterator;

class az
extends cx<T> {
    final /* synthetic */ Object a;
    final /* synthetic */ aw b;

    az(aw aw2, Object object) {
        this.b = aw2;
        this.a = object;
    }

    public oP<T> a() {
        return new aA(this.b, this.a);
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.a();
    }
}

