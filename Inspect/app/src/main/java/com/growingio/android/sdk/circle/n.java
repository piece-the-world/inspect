/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.android.sdk.circle;

import com.growingio.android.sdk.circle.j;
import com.growingio.android.sdk.collection.aj;
import com.growingio.android.sdk.utils.h;
import java.util.Collection;
import java.util.List;

class n
implements aj {
    final /* synthetic */ j a;

    n(j j2) {
        this.a = j2;
    }

    @Override
    public void a(List list) {
        if (j.e(this.a) != null && j.e(this.a).b() && j.e(this.a).a()) {
            if (j.f(this.a) != null) {
                j.f(this.a).addAll(list);
            } else {
                j.a(this.a, list);
            }
            if (j.g(this.a) == 0) {
                h.b(j.h(this.a));
                h.a(j.h(this.a));
            }
        }
    }
}

