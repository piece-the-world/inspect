/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.b;

import com.growingio.e.a.a.a.b.a;
import com.growingio.e.a.a.a.b.n;
import java.io.File;
import java.io.Serializable;

public class k
extends a
implements Serializable {
    private static final long b = 5345244090827540862L;
    public static final n a = new k();

    protected k() {
    }

    @Override
    public boolean accept(File file) {
        return file.isFile();
    }
}

