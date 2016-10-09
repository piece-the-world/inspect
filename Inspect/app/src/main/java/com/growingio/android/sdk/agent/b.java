/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.android.sdk.agent;

import com.growingio.android.sdk.agent.VdsAgent;

final class b
implements Runnable {
    final /* synthetic */ Object a;

    b(Object object) {
        this.a = object;
    }

    @Override
    public void run() {
        VdsAgent.b(this.a);
    }
}

