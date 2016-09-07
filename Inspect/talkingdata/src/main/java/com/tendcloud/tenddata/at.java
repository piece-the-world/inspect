/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.as;

class at
implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ as a;
    final /* synthetic */ as.b b;

    at(as.b b2, as as2) {
        this.b = b2;
        this.a = as2;
    }

    @Override
    public void uncaughtException(Thread thread, Throwable throwable) {
        Thread.getDefaultUncaughtExceptionHandler().uncaughtException(thread, throwable);
    }
}

