/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.a;

import com.growingio.e.a.a.a.a.a;
import java.io.File;
import java.io.Serializable;
import java.util.Comparator;

class i
extends a
implements Serializable {
    private static final long a = -4808255005272229056L;
    private final Comparator<File> b;

    public i(Comparator<File> comparator) {
        if (comparator == null) {
            throw new IllegalArgumentException("Delegate comparator is missing");
        }
        this.b = comparator;
    }

    public int a(File file, File file2) {
        return this.b.compare(file2, file);
    }

    @Override
    public String toString() {
        return super.toString() + "[" + this.b.toString() + "]";
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((File)object, (File)object2);
    }
}

