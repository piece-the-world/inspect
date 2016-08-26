/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.gO;
import java.util.List;

final class ha
extends ea<Character> {
    private final String a;

    ha(String string) {
        this.a = string;
    }

    @Override
    public int indexOf(Object object) {
        return object instanceof Character ? this.a.indexOf(((Character)object).charValue()) : -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        return object instanceof Character ? this.a.lastIndexOf(((Character)object).charValue()) : -1;
    }

    @Override
    public ea<Character> a(int n2, int n3) {
        aU.a(n2, n3, this.size());
        return gO.a(this.a.substring(n2, n3));
    }

    @Override
    boolean i_() {
        return false;
    }

    public Character b(int n2) {
        aU.a(n2, this.size());
        return Character.valueOf(this.a.charAt(n2));
    }

    @Override
    public int size() {
        return this.a.length();
    }

    @Override
    public /* synthetic */ List subList(int n2, int n3) {
        return this.a(n2, n3);
    }

    @Override
    public /* synthetic */ Object get(int n2) {
        return this.b(n2);
    }
}

