/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.bA;
import com.growingio.a.a.b.bB;
import com.growingio.a.a.b.bp;
import com.growingio.a.a.b.bt;
import java.util.Iterator;

final class bs
implements bB {
    final /* synthetic */ String a;

    bs(String string) {
        this.a = string;
    }

    public bA a(bp bp2, CharSequence charSequence) {
        return new bt(this, bp2, charSequence);
    }

    public /* synthetic */ Iterator b(bp bp2, CharSequence charSequence) {
        return this.a(bp2, charSequence);
    }
}

