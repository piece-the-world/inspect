/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile;

import com.growingio.agent.compile.m;
import java.io.PrintStream;
import java.util.Map;

final class r
implements m {
    private final Map<String, String> a;

    public r(Map<String, String> map) {
        this.a = map;
    }

    @Override
    public void a(String string) {
        System.out.println("[vds.info] " + string);
    }

    @Override
    public void d(String string) {
        if (this.a.get("debug") != null) {
            System.out.println("[vds.debug] " + string);
        }
    }

    @Override
    public void b(String string) {
        System.err.println("[vds.warn] " + string);
    }

    @Override
    public void a(String string, Throwable throwable) {
        System.err.println("[vds.warn] " + string);
        throwable.printStackTrace(System.err);
    }

    @Override
    public void c(String string) {
        System.err.println("[vds.error] " + string);
    }

    @Override
    public void b(String string, Throwable throwable) {
        System.err.println("[vds.error] " + string);
        throwable.printStackTrace(System.err);
    }
}

