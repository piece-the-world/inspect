/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.tendcloud.tenddata;

import android.content.Context;
import com.tendcloud.tenddata.ab;
import com.tendcloud.tenddata.ej;
import com.tendcloud.tenddata.et;
import com.tendcloud.tenddata.ey;
import com.tendcloud.tenddata.ft;
import com.tendcloud.tenddata.fu;
import com.tendcloud.tenddata.gg;
import java.nio.channels.FileChannel;

static final class fx
implements Runnable {
    final /* synthetic */ Context a;

    fx(Context context) {
        this.a = context;
    }

    @Override
    public void run() {
        ft.a();
        et.a();
        gg.a().register(ej.a());
        ey.a();
        ab.f = fu.c();
        fu.d();
        fu.e();
        fu.f();
        if (ab.j) {
            fu.b(this.a);
        }
    }
}

