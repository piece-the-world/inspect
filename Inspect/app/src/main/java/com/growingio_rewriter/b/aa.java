/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.Z;
import java.io.File;
import java.io.FilenameFilter;

class aa
implements FilenameFilter {
    final /* synthetic */ Z a;

    aa(Z z2) {
        this.a = z2;
    }

    @Override
    public boolean accept(File file, String string) {
        return (string = string.toLowerCase()).endsWith(".jar") || string.endsWith(".zip");
    }
}

