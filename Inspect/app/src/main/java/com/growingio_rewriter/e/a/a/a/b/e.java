/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.b;

import com.growingio.e.a.a.a.b.a;
import com.growingio.e.a.a.a.b.n;
import com.growingio.e.a.a.a.b.q;
import java.io.File;
import java.io.Serializable;

public class e
extends a
implements Serializable {
    private static final long c = 5132005214688990379L;
    public static final n a = new e();
    public static final n b = new q(a);

    protected e() {
    }

    @Override
    public boolean accept(File file) {
        return file.canWrite();
    }
}

