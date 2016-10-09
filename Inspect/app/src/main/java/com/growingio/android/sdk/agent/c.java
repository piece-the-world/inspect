/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.android.sdk.agent;

import com.growingio.android.sdk.agent.VdsAgent;

final class c
implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ boolean b;

    c(Object object, boolean bl2) {
        this.a = object;
        this.b = bl2;
    }

    @Override
    public void run() {
        VdsAgent.a(this.a, this.b);
    }
}

