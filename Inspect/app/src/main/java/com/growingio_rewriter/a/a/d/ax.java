/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aw;
import com.growingio.a.a.d.ay;
import com.growingio.a.a.d.cx;
import java.util.Iterator;

class ax
extends cx<T> {
    final /* synthetic */ Object a;
    final /* synthetic */ aw b;

    ax(aw aw2, Object object) {
        this.b = aw2;
        this.a = object;
    }

    @Override
    public Iterator<T> iterator() {
        return new ay(this);
    }
}

