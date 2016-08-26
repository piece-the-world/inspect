/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.j.af;
import com.growingio.a.a.j.aj;
import java.io.File;

final class ak
extends aj {
    ak(String string2, int n3) {
        super(string, n2, null);
    }

    @Override
    public boolean a(File file) {
        return file.isDirectory();
    }

    public String toString() {
        return "Files.isDirectory()";
    }
}

