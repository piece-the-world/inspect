/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a;

import com.growingio.e.a.a.a.h;
import com.growingio.e.a.a.a.j;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Collection;
import java.util.List;

final class i
extends Thread {
    final /* synthetic */ h a;

    i(h h2) {
        this.a = h2;
        super("File Reaper");
        this.setPriority(10);
        this.setDaemon(true);
    }

    @Override
    public void run() {
        while (!this.a.d || this.a.b.size() > 0) {
            try {
                j j2 = (j)this.a.a.remove();
                this.a.b.remove(j2);
                if (!j2.b()) {
                    this.a.c.add(j2.a());
                }
                j2.clear();
            }
            catch (InterruptedException var1_2) {}
        }
    }
}

