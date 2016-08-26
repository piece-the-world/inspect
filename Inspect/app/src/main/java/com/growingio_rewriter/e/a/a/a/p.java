/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a;

import java.io.File;
import java.io.FileFilter;

final class p
implements FileFilter {
    final /* synthetic */ File a;

    p(File file) {
        this.a = file;
    }

    @Override
    public boolean accept(File file) {
        return file.equals(this.a);
    }
}

