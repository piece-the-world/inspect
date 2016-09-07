/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.br;
import com.tendcloud.tenddata.bw;
import java.util.List;

class bu
implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ String b;
    final /* synthetic */ br c;

    bu(br br2, List list, String string) {
        this.c = br2;
        this.a = list;
        this.b = string;
    }

    @Override
    public void run() {
        for (String string : this.a) {
            if (string.equals(br.c(this.c).getPackageName()) || string.equals(this.b)) continue;
            bw.b(br.c(this.c), string);
        }
    }
}

