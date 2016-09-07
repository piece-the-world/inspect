/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.br;
import com.tendcloud.tenddata.bw;
import java.util.List;

class bv
implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ br b;

    bv(br br2, List list) {
        this.b = br2;
        this.a = list;
    }

    @Override
    public void run() {
        for (String string : this.a) {
            if (string.equals(br.c(this.b).getPackageName())) continue;
            bw.e(br.c(this.b), string);
        }
    }
}

