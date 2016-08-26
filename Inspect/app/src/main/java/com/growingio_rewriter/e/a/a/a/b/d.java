/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.b;

import com.growingio.e.a.a.a.b.a;
import com.growingio.e.a.a.a.b.c;
import com.growingio.e.a.a.a.b.e;
import com.growingio.e.a.a.a.b.n;
import com.growingio.e.a.a.a.b.q;
import java.io.File;
import java.io.Serializable;

public class d
extends a
implements Serializable {
    private static final long d = 3179904805251622989L;
    public static final n a = new d();
    public static final n b = new q(a);
    public static final n c = new c(a, e.b);

    protected d() {
    }

    @Override
    public boolean accept(File file) {
        return file.canRead();
    }
}

