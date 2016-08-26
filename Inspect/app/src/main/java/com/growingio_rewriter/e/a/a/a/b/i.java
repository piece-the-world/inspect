/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.b;

import com.growingio.e.a.a.a.b.a;
import com.growingio.e.a.a.a.b.n;
import com.growingio.e.a.a.a.b.q;
import java.io.File;
import java.io.Serializable;

public class i
extends a
implements Serializable {
    private static final long c = 3631422087512832211L;
    public static final n a = new i();
    public static final n b = new q(a);

    protected i() {
    }

    @Override
    public boolean accept(File file) {
        if (file.isDirectory()) {
            File[] arrfile = file.listFiles();
            return arrfile == null || arrfile.length == 0;
        }
        return file.length() == 0;
    }
}

