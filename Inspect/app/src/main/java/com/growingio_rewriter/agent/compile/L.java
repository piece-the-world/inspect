/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile;

import com.growingio.agent.compile.K;

class L
implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ K b;

    L(K k2, String string) {
        this.b = k2;
        this.a = string;
    }

    @Override
    public void run() {
        K.a(this.b).a(this.a);
    }
}

