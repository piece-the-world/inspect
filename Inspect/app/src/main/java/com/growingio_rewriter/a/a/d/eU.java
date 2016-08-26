/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.eS;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.kW;
import com.growingio.a.a.d.lb;
import java.util.Map;

class eU
extends eS<K, V> {
    final /* synthetic */ kW a;
    final /* synthetic */ eS b;
    final /* synthetic */ eS c;

    eU(eS eS2, ea ea2, ea ea3, kW kW2, eS eS3) {
        this.c = eS2;
        this.a = kW2;
        this.b = eS3;
        super(ea2, ea3);
    }

    @Override
    public eS<K, V> b(kW<K> kW2) {
        if (this.a.b(kW2)) {
            return this.b.b(kW2.c(this.a));
        }
        return eS.a();
    }

    @Override
    public /* synthetic */ lb c(kW kW2) {
        return this.b(kW2);
    }

    @Override
    public /* synthetic */ Map h() {
        return super.f();
    }

    @Override
    public /* synthetic */ Map i() {
        return super.e();
    }
}

