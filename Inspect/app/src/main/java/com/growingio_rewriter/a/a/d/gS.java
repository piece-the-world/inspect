/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import java.util.AbstractList;

final class gS
extends AbstractList<Character> {
    private final CharSequence a;

    gS(CharSequence charSequence) {
        this.a = charSequence;
    }

    public Character a(int n2) {
        aU.a(n2, this.size());
        return Character.valueOf(this.a.charAt(n2));
    }

    @Override
    public int size() {
        return this.a.length();
    }

    @Override
    public /* synthetic */ Object get(int n2) {
        return this.a(n2);
    }
}

