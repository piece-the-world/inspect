/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.f;
import com.growingio.d.a.f.H;
import com.growingio.d.a.f.a;
import org.xml.sax.Attributes;

final class J
extends H {
    final /* synthetic */ a a;

    J(a a2) {
        this.a = a2;
        super(a2);
    }

    @Override
    public void a(String string, Attributes attributes) {
        String string2 = attributes.getValue("file");
        String string3 = attributes.getValue("debug");
        this.a.b.a_(string2, string3);
    }
}

