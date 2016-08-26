/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.gp;
import com.growingio.a.a.d.kG;
import java.util.Iterator;

final class gq
extends kG<Iterator<? extends T>, Iterator<? extends T>> {
    gq(Iterator iterator) {
        super(iterator);
    }

    @Override
    Iterator<? extends Iterator<? extends T>> a(Iterator<? extends T> iterator) {
        if (iterator instanceof gp) {
            gp gp2 = (gp)iterator;
            return gp.b(gp2.a);
        }
        return gb.a(iterator);
    }
}

