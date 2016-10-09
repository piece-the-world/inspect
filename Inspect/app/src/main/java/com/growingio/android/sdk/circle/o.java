/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.android.sdk.circle;

import com.growingio.android.sdk.circle.k;
import com.growingio.android.sdk.collection.an;
import com.growingio.android.sdk.utils.i;
import java.util.Collection;
import java.util.List;

class o
implements an {
    final /* synthetic */ k a;

    o(k k2) {
        this.a = k2;
    }

    @Override
    public void a(List list) {
        if (k.e(this.a) != null && k.e(this.a).b() && k.e(this.a).a()) {
            if (k.f(this.a) != null) {
                k.f(this.a).addAll(list);
            } else {
                k.a(this.a, list);
            }
            if (k.g(this.a) == 0) {
                i.b(k.h(this.a));
                i.a(k.h(this.a));
            }
        }
    }
}

