/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.c.a;

import com.growingio.c.a.b.g;
import com.growingio.c.a.e;
import java.lang.annotation.Annotation;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class f
implements com.growingio.c.a.b.f<e> {
    @Override
    public g a(e e2, Object object) {
        Pattern pattern = Pattern.compile(e2.a(), e2.b());
        if (pattern.matcher((String)object).matches()) {
            return g.a;
        }
        return g.d;
    }
}

