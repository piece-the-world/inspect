/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.b;

import com.growingio.e.a.a.a.b.n;
import java.io.File;

public abstract class a
implements n {
    @Override
    public boolean accept(File file) {
        return this.accept(file.getParentFile(), file.getName());
    }

    @Override
    public boolean accept(File file, String string) {
        return this.accept(new File(file, string));
    }

    public String toString() {
        return this.getClass().getSimpleName();
    }
}

