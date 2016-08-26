/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile;

import com.growingio.agent.compile.e;
import com.growingio.agent.compile.m;
import java.io.PrintStream;

final class f
implements m {
    private f() {
    }

    @Override
    public void a(String string) {
        System.out.println("[info] " + string);
    }

    @Override
    public void b(String string) {
        System.err.println("[warn] " + string);
    }

    @Override
    public void a(String string, Throwable throwable) {
        System.err.println("[warn] " + string);
        throwable.printStackTrace(System.err);
    }

    @Override
    public void c(String string) {
        System.err.println("[error] " + string);
    }

    @Override
    public void b(String string, Throwable throwable) {
        System.err.println("[error] " + string);
        throwable.printStackTrace(System.err);
    }

    @Override
    public void d(String string) {
        System.out.println("[debug] " + string);
    }

    /* synthetic */ f(e e2) {
        this();
    }
}

