/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.f.H;
import com.growingio.d.a.f.a;
import java.util.ArrayList;
import java.util.HashMap;
import org.xml.sax.Attributes;

final class q
extends H {
    final /* synthetic */ a a;

    q(a a2) {
        this.a = a2;
        super(a2);
    }

    @Override
    public final void a(String string, Attributes attributes) {
        ((ArrayList)((HashMap)this.a.a()).get("interfaces")).add(attributes.getValue("name"));
    }
}

