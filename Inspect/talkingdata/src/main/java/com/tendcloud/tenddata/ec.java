/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.eb;
import java.util.Comparator;

class ec
implements Comparator {
    final /* synthetic */ eb a;

    ec(eb eb2) {
        this.a = eb2;
    }

    public int a(eb.d d2, eb.d d3) {
        if (d2.c == d3.c) {
            return 0;
        }
        return d2.c < d3.c ? 1 : -1;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((eb.d)object, (eb.d)object2);
    }
}

