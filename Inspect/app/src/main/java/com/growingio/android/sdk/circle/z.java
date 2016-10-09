/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.android.sdk.circle;

import com.growingio.android.sdk.circle.k;
import com.growingio.android.sdk.circle.y;

class z
implements Runnable {
    final /* synthetic */ y a;

    z(y y2) {
        this.a = y2;
    }

    @Override
    public void run() {
        k.b(this.a.a).setContent("Web\u7aef\u5708\u9009\u4e2d");
    }
}

