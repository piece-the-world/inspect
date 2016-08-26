/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.a;

import com.growingio.agent.a.e;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

class d {
    private final FileFilter a;
    private final List<File> b = new ArrayList<File>();

    public static List<File> a(File file, Pattern pattern) {
        d d2 = new d(pattern);
        file.listFiles(d2.a);
        return d2.b;
    }

    private d(Pattern pattern) {
        this.a = new e(this, pattern);
    }

    static /* synthetic */ List a(d d2) {
        return d2.b;
    }
}

