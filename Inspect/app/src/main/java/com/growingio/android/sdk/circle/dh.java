/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.android.sdk.circle;

import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.circle.dg;
import java.util.Comparator;
import java.util.Map;

class dh
implements Comparator {
    final /* synthetic */ Map a;
    final /* synthetic */ dg b;

    dh(dg dg2, Map map) {
        this.b = dg2;
        this.a = map;
    }

    public int a(i i2, i i3) {
        if (!this.a.containsKey(i2.j)) {
            return 1;
        }
        if (!this.a.containsKey(i3.j)) {
            return -1;
        }
        return (Integer)this.a.get(i3.j) - (Integer)this.a.get(i2.j);
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((i)object, (i)object2);
    }
}

