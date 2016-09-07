/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.gg;
import java.util.concurrent.ConcurrentLinkedQueue;

class gh
extends ThreadLocal {
    final /* synthetic */ gg a;

    gh(gg gg2) {
        this.a = gg2;
    }

    protected ConcurrentLinkedQueue a() {
        return new ConcurrentLinkedQueue();
    }

    protected /* synthetic */ Object initialValue() {
        return this.a();
    }
}

