/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile;

import com.growingio.agent.compile.m;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Map;

final class i
implements m {
    private final Map<String, String> a;
    private final PrintWriter b;

    public i(Map<String, String> map, String string) {
        this.a = map;
        try {
            this.b = new PrintWriter(new FileOutputStream(string));
        }
        catch (FileNotFoundException var3_3) {
            throw new RuntimeException(var3_3);
        }
    }

    private void a(String string, String string2) {
        this.b.write("[" + string + "] " + string2 + "\n");
        this.b.flush();
    }

    @Override
    public void a(String string) {
        this.a("info", string);
    }

    @Override
    public void d(String string) {
        this.a("debug", string);
    }

    @Override
    public void b(String string) {
        this.a("warn", string);
    }

    @Override
    public void a(String string, Throwable throwable) {
        this.a("warn", string);
        throwable.printStackTrace(this.b);
        this.b.flush();
    }

    @Override
    public void c(String string) {
        this.a("error", string);
    }

    @Override
    public void b(String string, Throwable throwable) {
        this.a("error", string);
        throwable.printStackTrace(this.b);
        this.b.flush();
    }
}

