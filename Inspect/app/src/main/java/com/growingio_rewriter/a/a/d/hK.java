/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.hG;
import com.growingio.a.a.d.hV;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;

final class hK
implements Runnable {
    final WeakReference<hG<?, ?>> a;

    public hK(hG<?, ?> hG2) {
        this.a = new WeakReference(hG2);
    }

    @Override
    public void run() {
        hG hG2 = this.a.get();
        if (hG2 == null) {
            throw new CancellationException();
        }
        for (hV hV2 : hG2.j) {
            hV2.l();
        }
    }
}

