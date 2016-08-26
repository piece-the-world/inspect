/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.b;

import com.growingio.e.a.a.a.b.a;
import com.growingio.e.a.a.a.b.n;
import java.io.File;
import java.io.Serializable;

public class h
extends a
implements Serializable {
    private static final long c = -5148237843784525732L;
    public static final n a;
    public static final n b;

    protected h() {
    }

    @Override
    public boolean accept(File file) {
        return file.isDirectory();
    }

    static {
        b = h.a = new h();
    }
}

