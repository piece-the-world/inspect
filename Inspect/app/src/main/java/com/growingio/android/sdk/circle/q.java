/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.os.Process
 */
package com.growingio.android.sdk.circle;

import android.os.Process;
import com.growingio.android.sdk.circle.k;

class q
implements Runnable {
    final /* synthetic */ k a;

    q(k k2) {
        this.a = k2;
    }

    @Override
    public void run() {
        Process.killProcess((int)Process.myPid());
    }
}

