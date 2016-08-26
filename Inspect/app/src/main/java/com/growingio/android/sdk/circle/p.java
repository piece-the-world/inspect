/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.os.Process
 */
package com.growingio.android.sdk.circle;

import android.os.Process;
import com.growingio.android.sdk.circle.j;

class p
implements Runnable {
    final /* synthetic */ j a;

    p(j j2) {
        this.a = j2;
    }

    @Override
    public void run() {
        Process.killProcess((int)Process.myPid());
    }
}

