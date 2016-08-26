/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.c.a;

import com.growingio.c.a.b.f;
import com.growingio.c.a.b.g;
import com.growingio.c.a.p;
import java.lang.annotation.Annotation;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class q
implements f<p> {
    @Override
    public g a(p p2, Object object) {
        if (!(object instanceof String)) {
            return g.d;
        }
        try {
            Pattern.compile((String)object);
        }
        catch (PatternSyntaxException var3_3) {
            return g.d;
        }
        return g.a;
    }
}

