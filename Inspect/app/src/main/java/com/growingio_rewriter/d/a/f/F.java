/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.f.D;
import com.growingio.d.a.f.H;
import com.growingio.d.a.f.a;
import com.growingio.d.a.p;
import com.growingio.d.a.r;
import java.util.HashMap;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

final class F
extends H {
    final /* synthetic */ a a;

    F(a a2) {
        this.a = a2;
        super(a2);
    }

    @Override
    public final void a(String string, Attributes attributes) throws SAXException {
        D d2 = a.dm.get(string);
        if (d2 == null) {
            throw new SAXException("Invalid element: " + string + " at " + this.a.a);
        }
        switch (d2.b) {
            case 0: {
                this.a().a_(d2.a);
                break;
            }
            case 4: {
                this.a().b(d2.a, attributes.getValue("owner"), attributes.getValue("name"), attributes.getValue("desc"));
                break;
            }
            case 1: {
                this.a().a(d2.a, Integer.parseInt(attributes.getValue("value")));
                break;
            }
            case 6: {
                this.a().a(d2.a, this.a((Object)attributes.getValue("label")));
                break;
            }
            case 5: {
                this.a().a(d2.a, attributes.getValue("owner"), attributes.getValue("name"), attributes.getValue("desc"), attributes.getValue("itf").equals("true"));
                break;
            }
            case 3: {
                this.a().a(d2.a, attributes.getValue("desc"));
                break;
            }
            case 2: {
                this.a().b(d2.a, Integer.parseInt(attributes.getValue("var")));
                break;
            }
            case 8: {
                this.a().c(Integer.parseInt(attributes.getValue("var")), Integer.parseInt(attributes.getValue("inc")));
                break;
            }
            case 7: {
                this.a().a(this.a(attributes.getValue("desc"), attributes.getValue("cst")));
                break;
            }
            case 9: {
                this.a().b(attributes.getValue("desc"), Integer.parseInt(attributes.getValue("dims")));
                break;
            }
            default: {
                throw new Error("Internal error");
            }
        }
    }
}

