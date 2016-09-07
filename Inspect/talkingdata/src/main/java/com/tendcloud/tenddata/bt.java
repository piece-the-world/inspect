/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.bh;
import com.tendcloud.tenddata.br;

class bt
implements Runnable {
    final /* synthetic */ br a;

    bt(br br2) {
        this.a = br2;
    }

    @Override
    public void run() {
        do {
            try {
                do {
                    String string;
                    if (!"service-ping".equals(string = (String)br.a(this.a).take())) {
                        continue;
                    }
                    br.b(this.a).a();
                } while (true);
            }
            catch (Throwable var1_2) {
                bh.b(br.d(), var1_2.getMessage());
                continue;
            }
            break;
        } while (true);
    }
}

