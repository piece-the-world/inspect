/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.cx;
import com.growingio.a.a.d.oH;
import com.growingio.a.a.d.oP;
import java.util.Iterator;

class oJ
extends cx<T> {
    final /* synthetic */ Object a;
    final /* synthetic */ oH b;

    oJ(oH oH2, Object object) {
        this.b = oH2;
        this.a = object;
    }

    public oP<T> a() {
        return this.b.e(this.a);
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.a();
    }
}

