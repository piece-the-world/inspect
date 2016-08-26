/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.b;

import com.growingio.e.a.a.a.b.n;
import java.io.File;
import java.io.Serializable;

public class j
implements n,
Serializable {
    private static final long c = 6210271677940926200L;
    public static final n a;
    public static final n b;

    protected j() {
    }

    @Override
    public boolean accept(File file) {
        return false;
    }

    @Override
    public boolean accept(File file, String string) {
        return false;
    }

    static {
        b = j.a = new j();
    }
}

