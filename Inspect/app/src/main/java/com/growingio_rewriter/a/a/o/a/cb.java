/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.bP;
import com.growingio.a.a.o.a.cc;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public final class cb {
    private final boolean a;
    private final ReentrantLock b;
    private cc c = null;

    public cb() {
        this(false);
    }

    public cb(boolean bl2) {
        this.a = bl2;
        this.b = new ReentrantLock(bl2);
    }

    public void a() {
        this.b.lock();
    }

    public void b() throws InterruptedException {
        this.b.lockInterruptibly();
    }

    public boolean a(long l2, TimeUnit timeUnit) {
        long l3 = cb.c(l2, timeUnit);
        ReentrantLock reentrantLock = this.b;
        if (!this.a && reentrantLock.tryLock()) {
            return true;
        }
        boolean bl2 = Thread.interrupted();
        try {
            long l4 = System.nanoTime();
            long l5 = l3;
            do {
                try {
                    boolean bl3 = reentrantLock.tryLock(l5, TimeUnit.NANOSECONDS);
                    return bl3;
                }
                catch (InterruptedException var12_8) {
                    bl2 = true;
                    l5 = cb.a(l4, l3);
                    continue;
                }
                break;
            } while (true);
        }
        finally {
            if (bl2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public boolean b(long l2, TimeUnit timeUnit) throws InterruptedException {
        return this.b.tryLock(l2, timeUnit);
    }

    public boolean c() {
        return this.b.tryLock();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(cc cc2) throws InterruptedException {
        if (cc2.b != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.b;
        boolean bl2 = reentrantLock.isHeldByCurrentThread();
        reentrantLock.lockInterruptibly();
        boolean bl3 = false;
        try {
            if (!cc2.a()) {
                this.a(cc2, bl2);
            }
            bl3 = true;
        }
        finally {
            if (!bl3) {
                this.d();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(cc cc2) {
        if (cc2.b != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.b;
        boolean bl2 = reentrantLock.isHeldByCurrentThread();
        reentrantLock.lock();
        boolean bl3 = false;
        try {
            if (!cc2.a()) {
                this.b(cc2, bl2);
            }
            bl3 = true;
        }
        finally {
            if (!bl3) {
                this.d();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public boolean a(cc var1_1, long var2_2, TimeUnit var4_3) throws InterruptedException {
        var5_4 = cb.c(var2_2, var4_3);
        if (var1_1.b != this) {
            throw new IllegalMonitorStateException();
        }
        var7_5 = this.b;
        var8_6 = var7_5.isHeldByCurrentThread();
        var9_7 = 0;
        if (this.a) ** GOTO lbl-1000
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (!var7_5.tryLock()) lbl-1000: // 2 sources:
        {
            var9_7 = cb.a(var5_4);
            if (!var7_5.tryLock(var2_2, var4_3)) {
                return false;
            }
        }
        var11_8 = false;
        var12_9 = true;
        try {
            var11_8 = var1_1.a() != false || this.a(var1_1, var9_7 == 0 ? var5_4 : cb.a(var9_7, var5_4), var8_6) != false;
            var12_9 = false;
            var13_10 = var11_8;
            return var13_10;
        }
        finally {
            if (!var11_8) {
                try {
                    if (var12_9 && !var8_6) {
                        this.k();
                    }
                }
                finally {
                    var7_5.unlock();
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean b(cc cc2, long l2, TimeUnit timeUnit) {
        ReentrantLock reentrantLock;
        boolean bl5;
        long l4;
        boolean bl3;
        boolean bl2;
        long l3;
        l3 = cb.c(l2, timeUnit);
        if (cc2.b != this) {
            throw new IllegalMonitorStateException();
        }
        reentrantLock = this.b;
        l4 = 0;
        bl2 = reentrantLock.isHeldByCurrentThread();
        bl3 = Thread.interrupted();
        try {
            if (this.a || !reentrantLock.tryLock()) {
                l4 = cb.a(l3);
                long l5 = l3;
                do {
                    try {
                        if (reentrantLock.tryLock(l5, TimeUnit.NANOSECONDS)) break;
                        boolean bl4 = false;
                        return bl4;
                    }
                    catch (InterruptedException var14_11) {
                        bl3 = true;
                        l5 = cb.a(l4, l3);
                        continue;
                    }
                    break;
                } while (true);
            }
            bl5 = false;
        }
        finally {
            if (bl3) {
                Thread.currentThread().interrupt();
            }
        }
        do {
            try {
                if (cc2.a()) {
                    bl5 = true;
                } else {
                    long l6;
                    if (l4 == 0) {
                        l4 = cb.a(l3);
                        l6 = l3;
                    } else {
                        l6 = cb.a(l4, l3);
                    }
                    bl5 = this.a(cc2, l6, bl2);
                }
                boolean bl6 = bl5;
                return bl6;
            }
            catch (InterruptedException var13_13) {
                try {
                    bl3 = true;
                    bl2 = false;
                    continue;
                }
                catch (Throwable throwable) {
                    throw throwable;
                }
                finally {
                    if (!bl5) {
                        reentrantLock.unlock();
                    }
                }
            }
            break;
        } while (true);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean c(cc cc2) {
        if (cc2.b != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        boolean bl2 = false;
        try {
            boolean bl3 = bl2 = cc2.a();
            return bl3;
        }
        finally {
            if (!bl2) {
                reentrantLock.unlock();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean d(cc cc2) throws InterruptedException {
        if (cc2.b != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lockInterruptibly();
        boolean bl2 = false;
        try {
            boolean bl3 = bl2 = cc2.a();
            return bl3;
        }
        finally {
            if (!bl2) {
                reentrantLock.unlock();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean c(cc cc2, long l2, TimeUnit timeUnit) {
        if (cc2.b != this) {
            throw new IllegalMonitorStateException();
        }
        if (!this.a(l2, timeUnit)) {
            return false;
        }
        boolean bl2 = false;
        try {
            boolean bl3 = bl2 = cc2.a();
            return bl3;
        }
        finally {
            if (!bl2) {
                this.b.unlock();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean d(cc cc2, long l2, TimeUnit timeUnit) throws InterruptedException {
        if (cc2.b != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.b;
        if (!reentrantLock.tryLock(l2, timeUnit)) {
            return false;
        }
        boolean bl2 = false;
        try {
            boolean bl3 = bl2 = cc2.a();
            return bl3;
        }
        finally {
            if (!bl2) {
                reentrantLock.unlock();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean e(cc cc2) {
        if (cc2.b != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.b;
        if (!reentrantLock.tryLock()) {
            return false;
        }
        boolean bl2 = false;
        try {
            boolean bl3 = bl2 = cc2.a();
            return bl3;
        }
        finally {
            if (!bl2) {
                reentrantLock.unlock();
            }
        }
    }

    public void f(cc cc2) throws InterruptedException {
        if (!(cc2.b == this & this.b.isHeldByCurrentThread())) {
            throw new IllegalMonitorStateException();
        }
        if (!cc2.a()) {
            this.a(cc2, true);
        }
    }

    public void g(cc cc2) {
        if (!(cc2.b == this & this.b.isHeldByCurrentThread())) {
            throw new IllegalMonitorStateException();
        }
        if (!cc2.a()) {
            this.b(cc2, true);
        }
    }

    public boolean e(cc cc2, long l2, TimeUnit timeUnit) throws InterruptedException {
        long l3 = cb.c(l2, timeUnit);
        if (!(cc2.b == this & this.b.isHeldByCurrentThread())) {
            throw new IllegalMonitorStateException();
        }
        if (cc2.a()) {
            return true;
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        return this.a(cc2, l3, true);
    }

    public boolean f(cc cc2, long l2, TimeUnit timeUnit) {
        long l3 = cb.c(l2, timeUnit);
        if (!(cc2.b == this & this.b.isHeldByCurrentThread())) {
            throw new IllegalMonitorStateException();
        }
        if (cc2.a()) {
            return true;
        }
        boolean bl2 = true;
        long l4 = cb.a(l3);
        boolean bl3 = Thread.interrupted();
        try {
            long l5 = l3;
            do {
                try {
                    boolean bl4 = this.a(cc2, l5, bl2);
                    return bl4;
                }
                catch (InterruptedException var13_9) {
                    block12 : {
                        bl3 = true;
                        if (!cc2.a()) break block12;
                        boolean bl5 = true;
                        if (bl3) {
                            Thread.currentThread().interrupt();
                        }
                        return bl5;
                    }
                    bl2 = false;
                    l5 = cb.a(l4, l3);
                    continue;
                }
                break;
            } while (true);
        }
        finally {
            if (bl3) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void d() {
        ReentrantLock reentrantLock = this.b;
        try {
            if (reentrantLock.getHoldCount() == 1) {
                this.k();
            }
        }
        finally {
            reentrantLock.unlock();
        }
    }

    public boolean e() {
        return this.a;
    }

    public boolean f() {
        return this.b.isLocked();
    }

    public boolean g() {
        return this.b.isHeldByCurrentThread();
    }

    public int h() {
        return this.b.getHoldCount();
    }

    public int i() {
        return this.b.getQueueLength();
    }

    public boolean j() {
        return this.b.hasQueuedThreads();
    }

    public boolean a(Thread thread) {
        return this.b.hasQueuedThread(thread);
    }

    public boolean h(cc cc2) {
        return this.i(cc2) > 0;
    }

    public int i(cc cc2) {
        if (cc2.b != this) {
            throw new IllegalMonitorStateException();
        }
        this.b.lock();
        try {
            int n2 = cc2.d;
            return n2;
        }
        finally {
            this.b.unlock();
        }
    }

    private static long c(long l2, TimeUnit timeUnit) {
        long l3 = timeUnit.toNanos(l2);
        return l3 <= 0 ? 0 : (l3 > 6917529027641081853L ? 6917529027641081853L : l3);
    }

    private static long a(long l2) {
        if (l2 <= 0) {
            return 0;
        }
        long l3 = System.nanoTime();
        return l3 == 0 ? 1 : l3;
    }

    private static long a(long l2, long l3) {
        return l3 <= 0 ? 0 : l3 - (System.nanoTime() - l2);
    }

    private void k() {
        cc cc2 = this.c;
        while (cc2 != null) {
            if (this.j(cc2)) {
                cc2.c.signal();
                break;
            }
            cc2 = cc2.e;
        }
    }

    private boolean j(cc cc2) {
        try {
            return cc2.a();
        }
        catch (Throwable var2_2) {
            this.l();
            throw bP.c(var2_2);
        }
    }

    private void l() {
        cc cc2 = this.c;
        while (cc2 != null) {
            cc2.c.signalAll();
            cc2 = cc2.e;
        }
    }

    private void k(cc cc2) {
        int n2;
        if ((n2 = cc2.d++) == 0) {
            cc2.e = this.c;
            this.c = cc2;
        }
    }

    private void l(cc cc2) {
        int n2;
        if ((n2 = --cc2.d) == 0) {
            cc cc3 = this.c;
            cc cc4 = null;
            do {
                if (cc3 == cc2) {
                    if (cc4 == null) {
                        this.c = cc3.e;
                    } else {
                        cc4.e = cc3.e;
                    }
                    cc3.e = null;
                    break;
                }
                cc4 = cc3;
                cc3 = cc3.e;
            } while (true);
        }
    }

    private void a(cc cc2, boolean bl2) throws InterruptedException {
        if (bl2) {
            this.k();
        }
        this.k(cc2);
        try {
            do {
                cc2.c.await();
            } while (!cc2.a());
        }
        finally {
            this.l(cc2);
        }
    }

    private void b(cc cc2, boolean bl2) {
        if (bl2) {
            this.k();
        }
        this.k(cc2);
        try {
            do {
                cc2.c.awaitUninterruptibly();
            } while (!cc2.a());
        }
        finally {
            this.l(cc2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean a(cc cc2, long l2, boolean bl2) throws InterruptedException {
        boolean bl3 = true;
        try {
            do {
                if (l2 <= 0) {
                    boolean bl4 = false;
                    return bl4;
                }
                if (bl3) {
                    if (bl2) {
                        this.k();
                    }
                    this.k(cc2);
                    bl3 = false;
                }
                l2 = cc2.c.awaitNanos(l2);
            } while (!cc2.a());
            boolean bl5 = true;
            return bl5;
        }
        finally {
            if (!bl3) {
                this.l(cc2);
            }
        }
    }

    static /* synthetic */ ReentrantLock a(cb cb2) {
        return cb2.b;
    }
}

