/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.f;

import com.growingio.e.a.a.a.f.a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class c
implements a {
    private final Pattern a;

    public c(String string) {
        this(Pattern.compile(string));
    }

    public c(Pattern pattern) {
        if (pattern == null) {
            throw new IllegalArgumentException("Null pattern");
        }
        this.a = pattern;
    }

    @Override
    public boolean a(String string) {
        return this.a.matcher(string).matches();
    }
}

