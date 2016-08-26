/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.o.a.bS;
import com.growingio.a.a.o.a.bU;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public final class bR {
    public static <V> bU<V> a(Future<V> future) {
        if (future instanceof bU) {
            return (bU)future;
        }
        return new bS<V>(future);
    }

    public static <V> bU<V> a(Future<V> future, Executor executor) {
        aU.a(executor);
        if (future instanceof bU) {
            return (bU)future;
        }
        return new bS<V>(future, executor);
    }

    private bR() {
    }
}

