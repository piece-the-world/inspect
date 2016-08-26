/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aq;
import java.util.Collection;

final class aM
implements aq<Object, Object> {
    final /* synthetic */ Collection a;

    aM(Collection collection) {
        this.a = collection;
    }

    @Override
    public Object f(Object object) {
        return object == this.a ? "(this Collection)" : object;
    }
}

