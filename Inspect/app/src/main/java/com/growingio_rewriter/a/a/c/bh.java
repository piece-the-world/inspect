/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.c.bg;
import com.growingio.a.a.c.bi;
import java.util.concurrent.Executor;

public final class bh {
    private bh() {
    }

    public static <K, V> bg<K, V> a(bg<K, V> bg2, Executor executor) {
        aU.a(bg2);
        aU.a(executor);
        return new bi(executor, bg2);
    }
}

