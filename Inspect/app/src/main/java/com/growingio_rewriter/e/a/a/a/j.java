/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a;

import com.growingio.e.a.a.a.k;
import java.io.File;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

final class j
extends PhantomReference<Object> {
    private final String a;
    private final k b;

    j(String string, k k2, Object object, ReferenceQueue<? super Object> referenceQueue) {
        super(object, referenceQueue);
        this.a = string;
        this.b = k2 == null ? k.a : k2;
    }

    public String a() {
        return this.a;
    }

    public boolean b() {
        return this.b.a(new File(this.a));
    }
}

