/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.a;

import com.growingio.agent.a.d;
import java.io.File;
import java.io.FileFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class e
implements FileFilter {
    final /* synthetic */ Pattern a;
    final /* synthetic */ d b;

    e(d d2, Pattern pattern) {
        this.b = d2;
        this.a = pattern;
    }

    @Override
    public boolean accept(File file) {
        boolean bl2;
        if (file.isDirectory()) {
            file.listFiles(this);
        }
        if (bl2 = this.a.matcher(file.getAbsolutePath()).matches()) {
            d.a(this.b).add(file);
        }
        return bl2;
    }
}

