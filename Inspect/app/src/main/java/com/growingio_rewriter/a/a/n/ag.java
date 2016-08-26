/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.n.ab;
import com.growingio.a.a.n.ad;

final class ag
extends ad {
    ag(String string2, int n3) {
        super(string, n2, null);
    }

    @Override
    Class<?> a(Class<?> class_) {
        if (class_.isLocalClass()) {
            return null;
        }
        return class_.getEnclosingClass();
    }
}

