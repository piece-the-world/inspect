/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.bU;
import com.growingio.a.a.o.a.dx;
import java.util.concurrent.TimeoutException;

final class dy<V>
implements Runnable {
    dx<V> a;

    dy(dx<V> dx2) {
        this.a = dx2;
    }

    @Override
    public void run() {
        dx<V> dx2 = this.a;
        if (dx2 == null) {
            return;
        }
        bU bU2 = dx.a(dx2);
        if (bU2 == null) {
            return;
        }
        this.a = null;
        if (bU2.isDone()) {
            dx2.b(bU2);
        } else {
            try {
                dx2.a(new TimeoutException("Future timed out: " + bU2));
            }
            finally {
                bU2.cancel(true);
            }
        }
    }
}

