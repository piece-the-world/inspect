/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.bc;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class bb {
    private static final ExecutorService a = Executors.newCachedThreadPool();

    public static void submitExecutor(Runnable runnable) {
        a.execute(new bc(runnable));
    }
}

