/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aU;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class av
implements FilenameFilter {
    private final Pattern a;

    public av(String string) {
        this(Pattern.compile(string));
    }

    public av(Pattern pattern) {
        this.a = aU.a(pattern);
    }

    @Override
    public boolean accept(File file, String string) {
        return this.a.matcher(string).matches();
    }
}

