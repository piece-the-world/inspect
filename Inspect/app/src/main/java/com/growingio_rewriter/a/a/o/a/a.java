/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.o.a.aq;
import com.growingio.a.a.o.a.b;
import com.growingio.a.a.o.a.bU;
import com.growingio.a.a.o.a.bp;
import com.growingio.a.a.o.a.c;
import com.growingio.a.a.o.a.cd;
import com.growingio.a.a.o.a.cu;
import com.growingio.a.a.o.a.t;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

abstract class a<V, X extends Throwable, F, T>
extends t<V>
implements Runnable {
    bU<? extends V> a;
    Class<X> b;
    F c;

    static <X extends Throwable, V> bU<V> a(bU<? extends V> bU2, Class<X> class_, com.growingio.a.a.b.aq<? super X, ? extends V> aq2) {
        c<? extends V, ? super X> c2 = new c<V, X>(bU2, class_, aq2);
        bU2.a(c2, cd.c());
        return c2;
    }

    static <V, X extends Throwable> bU<V> a(bU<? extends V> bU2, Class<X> class_, com.growingio.a.a.b.aq<? super X, ? extends V> aq2, Executor executor) {
        c<? extends V, ? super X> c2 = new c<V, X>(bU2, class_, aq2);
        bU2.a(c2, cd.a(executor, c2));
        return c2;
    }

    static <X extends Throwable, V> bU<V> a(bU<? extends V> bU2, Class<X> class_, aq<? super X, ? extends V> aq2) {
        b<? extends V, ? super X> b2 = new b<V, X>(bU2, class_, aq2);
        bU2.a(b2, cd.c());
        return b2;
    }

    static <X extends Throwable, V> bU<V> a(bU<? extends V> bU2, Class<X> class_, aq<? super X, ? extends V> aq2, Executor executor) {
        b<? extends V, ? super X> b2 = new b<V, X>(bU2, class_, aq2);
        bU2.a(b2, cd.a(executor, b2));
        return b2;
    }

    a(bU<? extends V> bU2, Class<X> class_, F f2) {
        this.a = aU.a(bU2);
        this.b = aU.a(class_);
        this.c = aU.a(f2);
    }

    @Override
    public final void run() {
        T t2;
        F f2;
        Class<X> class_;
        bU<? extends V> bU2 = this.a;
        if (bU2 == null | (class_ = this.b) == null | (f2 = this.c) == null | this.isCancelled()) {
            return;
        }
        this.a = null;
        this.b = null;
        this.c = null;
        Object v2 = null;
        Throwable throwable = null;
        try {
            v2 = bp.a(bU2);
        }
        catch (ExecutionException var6_6) {
            throwable = aU.a(var6_6.getCause());
        }
        catch (Throwable var6_7) {
            throwable = var6_7;
        }
        if (throwable == null) {
            this.b(v2);
            return;
        }
        if (!cu.a(throwable, class_)) {
            this.a(throwable);
            return;
        }
        Throwable throwable2 = throwable;
        try {
            t2 = this.a(f2, throwable2);
        }
        catch (Throwable var8_10) {
            this.a(var8_10);
            return;
        }
        this.a(t2);
    }

    abstract T a(F var1, X var2) throws Exception;

    abstract void a(T var1);

    @Override
    protected final void a() {
        this.a(this.a);
        this.a = null;
        this.b = null;
        this.c = null;
    }
}

