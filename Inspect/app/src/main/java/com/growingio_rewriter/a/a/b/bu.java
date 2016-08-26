/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.bA;
import com.growingio.a.a.b.bB;
import com.growingio.a.a.b.bp;
import com.growingio.a.a.b.bv;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class bu
implements bB {
    final /* synthetic */ Pattern a;

    bu(Pattern pattern) {
        this.a = pattern;
    }

    public bA a(bp bp2, CharSequence charSequence) {
        Matcher matcher = this.a.matcher(charSequence);
        return new bv(this, bp2, charSequence, matcher);
    }

    public /* synthetic */ Iterator b(bp bp2, CharSequence charSequence) {
        return this.a(bp2, charSequence);
    }
}

