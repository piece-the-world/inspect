/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aC;
import com.growingio.a.a.b.bp;
import java.util.Iterator;

class by
implements Iterable<String> {
    final /* synthetic */ CharSequence a;
    final /* synthetic */ bp b;

    by(bp bp2, CharSequence charSequence) {
        this.b = bp2;
        this.a = charSequence;
    }

    @Override
    public Iterator<String> iterator() {
        return bp.a(this.b, this.a);
    }

    public String toString() {
        return aC.a(", ").a(new StringBuilder().append('['), this).append(']').toString();
    }
}

