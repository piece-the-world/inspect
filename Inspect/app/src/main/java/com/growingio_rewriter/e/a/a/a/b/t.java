/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.b;

import com.growingio.e.a.a.a.b.a;
import com.growingio.e.a.a.a.s;
import java.io.File;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class t
extends a
implements Serializable {
    private static final long a = 4269646126155225062L;
    private final Pattern b;

    public t(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Pattern is missing");
        }
        this.b = Pattern.compile(string);
    }

    public t(String string, s s2) {
        if (string == null) {
            throw new IllegalArgumentException("Pattern is missing");
        }
        int n2 = 0;
        if (s2 != null && !s2.c()) {
            n2 = 2;
        }
        this.b = Pattern.compile(string, n2);
    }

    public t(String string, int n2) {
        if (string == null) {
            throw new IllegalArgumentException("Pattern is missing");
        }
        this.b = Pattern.compile(string, n2);
    }

    public t(Pattern pattern) {
        if (pattern == null) {
            throw new IllegalArgumentException("Pattern is missing");
        }
        this.b = pattern;
    }

    @Override
    public boolean accept(File file, String string) {
        return this.b.matcher(string).matches();
    }
}

