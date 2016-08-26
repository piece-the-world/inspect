/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.f;
import com.growingio.d.a.f.R;
import com.growingio.d.a.f.S;
import com.growingio.d.a.g;
import java.io.OutputStream;
import org.xml.sax.ContentHandler;

final class Q
implements S {
    final OutputStream a;

    Q(OutputStream outputStream) {
        this.a = outputStream;
    }

    @Override
    public final ContentHandler a() {
        g g2 = new g(1);
        return new R(this, g2, g2);
    }
}

