/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.d.oH;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;

final class ag
extends oH<File> {
    ag() {
    }

    public Iterable<File> a(File file) {
        File[] arrfile;
        if (file.isDirectory() && (arrfile = file.listFiles()) != null) {
            return Collections.unmodifiableList(Arrays.asList(arrfile));
        }
        return Collections.emptyList();
    }

    public String toString() {
        return "Files.fileTreeTraverser()";
    }

    @Override
    public /* synthetic */ Iterable c(Object object) {
        return this.a((File)object);
    }
}

