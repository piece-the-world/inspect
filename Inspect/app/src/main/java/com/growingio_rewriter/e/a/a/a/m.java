/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a;

import java.io.File;
import java.io.IOException;

public class m
extends IOException {
    private static final long a = 1;

    public m() {
    }

    public m(String string) {
        super(string);
    }

    public m(File file) {
        super("File " + file + " exists");
    }
}

