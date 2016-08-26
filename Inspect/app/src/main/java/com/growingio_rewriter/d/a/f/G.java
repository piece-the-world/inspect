/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.f;
import com.growingio.d.a.f.H;
import com.growingio.d.a.f.a;
import org.xml.sax.Attributes;

final class G
extends H {
    final /* synthetic */ a a;

    G(a a2) {
        this.a = a2;
        super(a2);
    }

    @Override
    public final void a(String string, Attributes attributes) {
        String string2 = attributes.getValue("owner");
        String string3 = attributes.getValue("name");
        String string4 = attributes.getValue("desc");
        this.a.b.a(string2, string3, string4);
    }
}

