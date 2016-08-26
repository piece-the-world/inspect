/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.kV;
import com.growingio.a.a.o.a.bY;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

final class bX<L>
implements Runnable {
    private static final Logger a = Logger.getLogger(bX.class.getName());
    private final L b;
    private final Executor c;
    private final Queue<bY<L>> d = kV.a();
    private boolean e;

    bX(L l2, Executor executor) {
        this.b = aU.a(l2);
        this.c = aU.a(executor);
    }

    synchronized void a(bY<L> bY2) {
        this.d.add(bY2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void a() {
        boolean bl2 = false;
        bX bX2 = this;
        synchronized (bX2) {
            if (!this.e) {
                this.e = true;
                bl2 = true;
            }
        }
        if (bl2) {
            try {
                this.c.execute(this);
            }
            catch (RuntimeException var2_3) {
                bX bX3 = this;
                synchronized (bX3) {
                    this.e = false;
                }
                a.log(Level.SEVERE, "Exception while running callbacks for " + this.b + " on " + this.c, var2_3);
                throw var2_3;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        block18 : {
            Object object;
            boolean bl2 = true;
            block14 : do {
                do {
                    bX bX2 = this;
                    synchronized (bX2) {
                        aU.b(this.e);
                        object = this.d.poll();
                        if (object == null) {
                            this.e = false;
                            bl2 = false;
                            break block18;
                        }
                    }
                    try {
                        object.a(this.b);
                        continue block14;
                    }
                    catch (RuntimeException var3_4) {
                        a.log(Level.SEVERE, "Exception while executing callback: " + this.b + "." + bY.a((bY)object), var3_4);
                        continue;
                    }
                    break;
                } while (true);
            } while (true);
            finally {
                if (bl2) {
                    object = this;
                    synchronized (object) {
                        this.e = false;
                    }
                }
            }
        }
    }
}

