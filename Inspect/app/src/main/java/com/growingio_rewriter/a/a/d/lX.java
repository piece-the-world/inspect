/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.lJ;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Set;

public abstract class lX<E>
extends AbstractSet<E> {
    private lX() {
    }

    public fg<E> a() {
        return fg.a(this);
    }

    public <S extends Set<E>> S a(S s2) {
        s2.addAll(this);
        return s2;
    }

    /* synthetic */ lX(lJ lJ2) {
        this();
    }
}

