/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.o.a.T;
import com.growingio.a.a.o.a.U;
import com.growingio.a.a.o.a.V;
import com.growingio.a.a.o.a.W;
import com.growingio.a.a.o.a.X;
import com.growingio.a.a.o.a.Y;
import com.growingio.a.a.o.a.Z;
import com.growingio.a.a.o.a.aa;
import com.growingio.a.a.o.a.ab;
import com.growingio.a.a.o.a.ac;
import com.growingio.a.a.o.a.ad;
import com.growingio.a.a.o.a.bX;
import com.growingio.a.a.o.a.bY;
import com.growingio.a.a.o.a.cD;
import com.growingio.a.a.o.a.cF;
import com.growingio.a.a.o.a.cG;
import com.growingio.a.a.o.a.cb;
import com.growingio.a.a.o.a.cc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class S
implements cD {
    private static final bY<cF> a = new T("starting()");
    private static final bY<cF> b = new U("running()");
    private static final bY<cF> c = S.b(cG.b);
    private static final bY<cF> d = S.b(cG.c);
    private static final bY<cF> e = S.a(cG.a);
    private static final bY<cF> f = S.a(cG.c);
    private static final bY<cF> g = S.a(cG.d);
    private final cb h = new cb();
    private final cc i;
    private final cc j;
    private final cc k;
    private final cc l;
    private final List<bX<cF>> m;
    private volatile ad n;

    private static bY<cF> a(cG cG2) {
        return new V("terminated({from = " + (Object)((Object)cG2) + "})", cG2);
    }

    private static bY<cF> b(cG cG2) {
        return new W("stopping({from = " + (Object)((Object)cG2) + "})", cG2);
    }

    protected S() {
        this.i = new aa(this);
        this.j = new ab(this);
        this.k = new Z(this);
        this.l = new ac(this);
        this.m = Collections.synchronizedList(new ArrayList());
        this.n = new ad(cG.a);
    }

    protected abstract void a();

    protected abstract void b();

    @Override
    public final cD i() {
        if (this.h.c(this.i)) {
            try {
                this.n = new ad(cG.b);
                this.m();
                this.a();
            }
            catch (Throwable var1_1) {
                this.a(var1_1);
            }
            finally {
                this.h.d();
                this.e();
            }
        }
        throw new IllegalStateException("Service " + this + " has already been started");
        return this;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final cD j() {
        if (!this.h.c(this.j)) return this;
        try {
            cG cG2 = this.g();
            switch (Y.a[cG2.ordinal()]) {
                case 1: {
                    this.n = new ad(cG.e);
                    this.e(cG.a);
                    return this;
                }
                case 2: {
                    this.n = new ad(cG.b, true, null);
                    this.d(cG.b);
                    return this;
                }
                case 3: {
                    this.n = new ad(cG.d);
                    this.d(cG.c);
                    this.b();
                    return this;
                }
                case 4: 
                case 5: 
                case 6: {
                    throw new AssertionError((Object)("isStoppable is incorrectly implemented, saw: " + (Object)((Object)cG2)));
                }
                default: {
                    throw new AssertionError((Object)("Unexpected state: " + (Object)((Object)cG2)));
                }
            }
        }
        catch (Throwable var1_2) {
            this.a(var1_2);
        }
        finally {
            this.h.d();
            this.e();
        }
        return this;
    }

    @Override
    public final void k() {
        this.h.b(this.k);
        try {
            this.c(cG.c);
        }
        finally {
            this.h.d();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final void a(long l2, TimeUnit timeUnit) throws TimeoutException {
        if (this.h.b(this.k, l2, timeUnit)) {
            try {
                this.c(cG.c);
            }
            finally {
                this.h.d();
            }
        }
        throw new TimeoutException("Timed out waiting for " + this + " to reach the RUNNING state.");
    }

    @Override
    public final void l() {
        this.h.b(this.l);
        try {
            this.c(cG.e);
        }
        finally {
            this.h.d();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final void b(long l2, TimeUnit timeUnit) throws TimeoutException {
        if (this.h.b(this.l, l2, timeUnit)) {
            try {
                this.c(cG.e);
            }
            finally {
                this.h.d();
            }
        }
        throw new TimeoutException("Timed out waiting for " + this + " to reach a terminal state. " + "Current state: " + (Object)((Object)this.g()));
    }

    private void c(cG cG2) {
        cG cG3 = this.g();
        if (cG3 != cG2) {
            if (cG3 == cG.f) {
                throw new IllegalStateException("Expected the service " + this + " to be " + (Object)((Object)cG2) + ", but the service has FAILED", this.h());
            }
            throw new IllegalStateException("Expected the service " + this + " to be " + (Object)((Object)cG2) + ", but was " + (Object)((Object)cG3));
        }
    }

    protected final void c() {
        block5 : {
            this.h.a();
            try {
                if (this.n.a != cG.b) {
                    IllegalStateException illegalStateException = new IllegalStateException("Cannot notifyStarted() when the service is " + (Object)((Object)this.n.a));
                    this.a(illegalStateException);
                    throw illegalStateException;
                }
                if (this.n.b) {
                    this.n = new ad(cG.d);
                    this.b();
                    break block5;
                }
                this.n = new ad(cG.c);
                this.n();
            }
            finally {
                this.h.d();
                this.e();
            }
        }
    }

    protected final void d() {
        this.h.a();
        try {
            cG cG2 = this.n.a;
            if (cG2 != cG.d && cG2 != cG.c) {
                IllegalStateException illegalStateException = new IllegalStateException("Cannot notifyStopped() when the service is " + (Object)((Object)cG2));
                this.a(illegalStateException);
                throw illegalStateException;
            }
            this.n = new ad(cG.e);
            this.e(cG2);
        }
        finally {
            this.h.d();
            this.e();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected final void a(Throwable throwable) {
        aU.a(throwable);
        this.h.a();
        try {
            cG cG2 = this.g();
            switch (Y.a[cG2.ordinal()]) {
                case 1: 
                case 5: {
                    throw new IllegalStateException("Failed while in state:" + (Object)((Object)cG2), throwable);
                }
                case 2: 
                case 3: 
                case 4: {
                    this.n = new ad(cG.f, false, throwable);
                    this.a(cG2, throwable);
                    return;
                }
                case 6: {
                    return;
                }
                default: {
                    throw new AssertionError((Object)("Unexpected state: " + (Object)((Object)cG2)));
                }
            }
        }
        finally {
            this.h.d();
            this.e();
        }
    }

    @Override
    public final boolean f() {
        return this.g() == cG.c;
    }

    @Override
    public final cG g() {
        return this.n.a();
    }

    @Override
    public final Throwable h() {
        return this.n.b();
    }

    @Override
    public final void a(cF cF2, Executor executor) {
        aU.a(cF2, (Object)"listener");
        aU.a(executor, (Object)"executor");
        this.h.a();
        try {
            if (!this.g().b()) {
                this.m.add(new bX<cF>(cF2, executor));
            }
        }
        finally {
            this.h.d();
        }
    }

    public String toString() {
        return this.getClass().getSimpleName() + " [" + (Object)((Object)this.g()) + "]";
    }

    private void e() {
        if (!this.h.g()) {
            for (int i2 = 0; i2 < this.m.size(); ++i2) {
                this.m.get(i2).a();
            }
        }
    }

    private void m() {
        a.a(this.m);
    }

    private void n() {
        b.a(this.m);
    }

    private void d(cG cG2) {
        if (cG2 == cG.b) {
            c.a(this.m);
        } else if (cG2 == cG.c) {
            d.a(this.m);
        } else {
            throw new AssertionError();
        }
    }

    private void e(cG cG2) {
        switch (Y.a[cG2.ordinal()]) {
            case 1: {
                e.a(this.m);
                break;
            }
            case 3: {
                f.a(this.m);
                break;
            }
            case 4: {
                g.a(this.m);
                break;
            }
            default: {
                throw new AssertionError();
            }
        }
    }

    private void a(cG cG2, Throwable throwable) {
        new X(this, "failed({from = " + (Object)((Object)cG2) + ", cause = " + throwable + "})", cG2, throwable).a(this.m);
    }

    static /* synthetic */ cb a(S s2) {
        return s2.h;
    }
}

