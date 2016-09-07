/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.af;
import com.tendcloud.tenddata.ah;
import com.tendcloud.tenddata.l;
import com.tendcloud.tenddata.m;

public class n
extends m {
    @Override
    public l.b a(af af2) {
        int n2 = n.b(af2);
        if (n2 == 13) {
            return l.b.a;
        }
        return l.b.b;
    }

    @Override
    public ah a(ah ah2) {
        super.a(ah2);
        ah2.a("Sec-WebSocket-Version", "13");
        return ah2;
    }

    @Override
    public l c() {
        return new n();
    }
}

