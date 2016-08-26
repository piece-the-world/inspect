/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.d;

import com.growingio.d.a.d.v;
import java.util.ArrayList;

class w
extends ArrayList<Object> {
    final /* synthetic */ v a;

    w(v v2, int n2) {
        this.a = v2;
        super(n2);
    }

    @Override
    public boolean add(Object object) {
        this.a.bj_ = object;
        return super.add(object);
    }
}

