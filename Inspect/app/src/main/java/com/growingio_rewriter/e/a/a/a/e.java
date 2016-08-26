/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a;

import java.io.File;
import java.io.IOException;

public class e
extends IOException {
    private static final long a = 1347339620135041008L;
    private final File b;
    private final int c;

    public e(File file, int n2) {
        this("Operation Cancelled", file, n2);
    }

    public e(String string, File file, int n2) {
        super(string);
        this.b = file;
        this.c = n2;
    }

    public File a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }
}

