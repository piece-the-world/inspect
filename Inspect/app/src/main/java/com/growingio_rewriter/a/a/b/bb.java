/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aH;
import com.growingio.a.a.b.aJ;
import com.growingio.a.a.b.aL;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aV;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class bb
implements aV<CharSequence>,
Serializable {
    final Pattern a;
    private static final long b = 0;

    bb(Pattern pattern) {
        this.a = aU.a(pattern);
    }

    @Override
    public boolean a(CharSequence charSequence) {
        return this.a.matcher(charSequence).find();
    }

    public int hashCode() {
        return aL.a(new Object[]{this.a.pattern(), this.a.flags()});
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof bb) {
            bb bb2 = (bb)object;
            return aL.a((Object)this.a.pattern(), (Object)bb2.a.pattern()) && this.a.flags() == bb2.a.flags();
        }
        return false;
    }

    public String toString() {
        String string = aH.a(this.a).a("pattern", this.a.pattern()).a("pattern.flags", this.a.flags()).toString();
        return "Predicates.contains(" + string + ")";
    }
}

