/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.oP;
import com.growingio.a.a.o.a.ah;
import com.growingio.a.a.o.a.aj;
import com.growingio.a.a.o.a.ak;
import com.growingio.a.a.o.a.bU;
import com.growingio.a.a.o.a.bp;
import com.growingio.a.a.o.a.cd;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.logging.Level;

abstract class ai
extends ak
implements Runnable {
    private dQ<? extends bU<? extends InputT>> b;
    private final boolean c;
    private final boolean d;
    final /* synthetic */ ah a;

    /*
     * WARNING - Possible parameter corruption
     */
    ai(dQ<? extends bU<? extends InputT>> n2, boolean dQ2, boolean bl2) {
        this.a = (ah)n2;
        super(dQ2.size());
        this.b = aU.a(dQ2);
        this.c = bl2;
        this.d = bl3;
    }

    @Override
    public final void run() {
        this.g();
    }

    private void f() {
        if (this.b.isEmpty()) {
            this.b();
            return;
        }
        if (this.c) {
            int n2 = 0;
            oP<bU<InputT>> oP2 = this.b.k_();
            while (oP2.hasNext()) {
                bU<InputT> bU2 = oP2.next();
                int n3 = n2++;
                bU2.a(new aj(this, n3, bU2), cd.c());
            }
        } else {
            oP<bU<InputT>> oP3 = this.b.k_();
            while (oP3.hasNext()) {
                bU<InputT> bU3 = oP3.next();
                bU3.a(this, cd.c());
            }
        }
    }

    private void a(Throwable throwable) {
        aU.a(throwable);
        boolean bl2 = false;
        boolean bl3 = true;
        if (this.c) {
            bl2 = this.a.a(throwable);
            if (bl2) {
                this.a();
            } else {
                bl3 = ah.a(this.d(), throwable);
            }
        }
        if (throwable instanceof Error | this.c & !bl2 & bl3) {
            String string = throwable instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first";
            ah.f().log(Level.SEVERE, string, throwable);
        }
    }

    @Override
    final void a(Set<Throwable> set) {
        if (!this.a.isCancelled()) {
            boolean bl2 = ah.a(set, this.a.d());
        }
    }

    private void a(int n2, Future<? extends InputT> future) {
        aU.b(this.c || !this.a.isDone() || this.a.isCancelled(), "Future was done before all dependencies completed");
        try {
            aU.b(future.isDone(), "Tried to set value from future which is not done");
            if (this.c) {
                if (future.isCancelled()) {
                    ah.a(this.a, false);
                } else {
                    InputT InputT = bp.a(future);
                    if (this.d) {
                        this.a(this.c, n2, InputT);
                    }
                }
            } else if (this.d && !future.isCancelled()) {
                this.a(this.c, n2, bp.a(future));
            }
        }
        catch (ExecutionException var3_4) {
            this.a(var3_4.getCause());
        }
        catch (Throwable var3_5) {
            this.a(var3_5);
        }
    }

    private void g() {
        int n2 = this.e();
        aU.b(n2 >= 0, "Less than 0 remaining futures");
        if (n2 == 0) {
            this.h();
        }
    }

    private void h() {
        if (this.d & !this.c) {
            int n2 = 0;
            oP<bU<InputT>> oP2 = this.b.k_();
            while (oP2.hasNext()) {
                bU<? extends InputT> bU2 = oP2.next();
                this.a(n2++, bU2);
            }
        }
        this.b();
    }

    void a() {
        this.b = null;
    }

    abstract void a(boolean var1, int var2, InputT var3);

    abstract void b();

    void c() {
    }

    static /* synthetic */ dQ a(ai ai2) {
        return ai2.b;
    }

    static /* synthetic */ void b(ai ai2) {
        ai2.f();
    }

    static /* synthetic */ void a(ai ai2, int n2, Future future) {
        ai2.a(n2, future);
    }

    static /* synthetic */ void c(ai ai2) {
        ai2.g();
    }
}

