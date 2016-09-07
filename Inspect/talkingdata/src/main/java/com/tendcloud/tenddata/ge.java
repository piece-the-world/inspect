/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.tendcloud.tenddata;

import android.content.Context;
import com.tendcloud.tenddata.ab;
import com.tendcloud.tenddata.cc;
import com.tendcloud.tenddata.ce;
import com.tendcloud.tenddata.cj;

static final class ge
implements Runnable {
    ge() {
    }

    @Override
    public void run() {
        try {
            if (!cj.c(ab.mContext)) {
                return;
            }
            String string = "http://id1.cn/a/" + ce.a(ab.mContext);
            cc.a(string, false);
        }
        catch (Throwable var1_2) {
            // empty catch block
        }
    }
}

