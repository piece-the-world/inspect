/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.android.sdk.agent;

import com.growingio.android.sdk.agent.VdsAgent;

final class a
implements Runnable {
    final /* synthetic */ Object a;

    a(Object object) {
        this.a = object;
    }

    @Override
    public void run() {
        VdsAgent.a(this.a);
    }
}

