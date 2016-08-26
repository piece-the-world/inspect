/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.f.H;
import com.growingio.d.a.f.a;
import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

final class s
extends H {
    final /* synthetic */ a a;

    s(a a2) {
        this.a = a2;
        super(a2);
    }

    @Override
    public final void a(String string, Attributes attributes) throws SAXException {
        ArrayList arrayList = (ArrayList)this.a.a();
        arrayList.add(this.a(attributes.getValue("desc"), attributes.getValue("cst")));
    }
}

