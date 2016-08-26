/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.f;
import com.growingio.d.a.f.Q;
import com.growingio.d.a.f.a;
import com.growingio.d.a.g;
import java.io.IOException;
import java.io.OutputStream;
import org.xml.sax.SAXException;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class R
extends a {
    final /* synthetic */ g do;
    final /* synthetic */ Q dp;

    R(Q q2, f f2, g g2) {
        this.dp = q2;
        this.do = g2;
        super(f2);
    }

    @Override
    public void endDocument() throws SAXException {
        try {
            this.dp.a.write(this.do.b());
        }
        catch (IOException var1_1) {
            throw new SAXException(var1_1);
        }
    }
}

