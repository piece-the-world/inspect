/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.bP;
import com.growingio.a.a.j.U;
import com.growingio.a.a.j.V;
import com.growingio.a.a.j.W;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public final class T
implements Closeable {
    private static final W b = V.a() ? V.a : U.a;
    final W a;
    private final Deque<Closeable> c = new ArrayDeque<Closeable>(4);
    private Throwable d;

    public static T a() {
        return new T(b);
    }

    T(W w2) {
        this.a = aU.a(w2);
    }

    public <C extends Closeable> C a(C c2) {
        if (c2 != null) {
            this.c.addFirst((Closeable)c2);
        }
        return c2;
    }

    public RuntimeException a(Throwable throwable) throws IOException {
        aU.a(throwable);
        this.d = throwable;
        bP.c(throwable, IOException.class);
        throw new RuntimeException(throwable);
    }

    public <X extends Exception> RuntimeException a(Throwable throwable, Class<X> class_) throws IOException, Exception {
        aU.a(throwable);
        this.d = throwable;
        bP.c(throwable, IOException.class);
        bP.c(throwable, class_);
        throw new RuntimeException(throwable);
    }

    public <X1 extends Exception, X2 extends Exception> RuntimeException a(Throwable throwable, Class<X1> class_, Class<X2> class_2) throws IOException, Exception {
        aU.a(throwable);
        this.d = throwable;
        bP.c(throwable, IOException.class);
        bP.a(throwable, class_, class_2);
        throw new RuntimeException(throwable);
    }

    @Override
    public void close() throws IOException {
        Throwable throwable = this.d;
        while (!this.c.isEmpty()) {
            Closeable closeable = this.c.removeFirst();
            try {
                closeable.close();
            }
            catch (Throwable var3_3) {
                if (throwable == null) {
                    throwable = var3_3;
                    continue;
                }
                this.a.a(closeable, throwable, var3_3);
            }
        }
        if (this.d == null && throwable != null) {
            bP.c(throwable, IOException.class);
            throw new AssertionError(throwable);
        }
    }
}

