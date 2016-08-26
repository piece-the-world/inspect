/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.cx;
import com.growingio.a.a.d.oH;
import com.growingio.a.a.d.oL;
import com.growingio.a.a.d.oP;
import java.util.Iterator;

class oK
extends cx<T> {
    final /* synthetic */ Object a;
    final /* synthetic */ oH b;

    oK(oH oH2, Object object) {
        this.b = oH2;
        this.a = object;
    }

    public oP<T> a() {
        return new oL(this.b, this.a);
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.a();
    }
}

