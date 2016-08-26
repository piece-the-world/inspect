/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.b;

import com.growingio.e.a.a.a.b.n;
import java.io.File;
import java.io.Serializable;

public class w
implements n,
Serializable {
    private static final long c = 8782512160909720199L;
    public static final n a;
    public static final n b;

    protected w() {
    }

    @Override
    public boolean accept(File file) {
        return true;
    }

    @Override
    public boolean accept(File file, String string) {
        return true;
    }

    static {
        b = w.a = new w();
    }
}

