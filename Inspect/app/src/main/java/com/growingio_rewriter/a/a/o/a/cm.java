/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import java.util.concurrent.Executor;

final class cm
extends Enum<cm>
implements Executor {
    public static final /* enum */ cm a = new cm();
    private static final /* synthetic */ cm[] b;

    public static cm[] a() {
        return (cm[])b.clone();
    }

    public static cm a(String string) {
        return (cm)Enum.valueOf(cm.class, string);
    }

    private cm() {
        super(string, n2);
    }

    @Override
    public void execute(Runnable runnable) {
        runnable.run();
    }

    public String toString() {
        return "MoreExecutors.directExecutor()";
    }

    static {
        b = new cm[]{a};
    }
}

