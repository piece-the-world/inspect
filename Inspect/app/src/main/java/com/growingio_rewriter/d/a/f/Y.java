/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.f.S;
import com.growingio.d.a.f.X;
import java.io.Writer;
import org.xml.sax.ContentHandler;

final class Y
implements S {
    private final Writer a;
    private final boolean b;

    Y(Writer writer, boolean bl2) {
        this.a = writer;
        this.b = bl2;
    }

    @Override
    public final ContentHandler a() {
        return new X(this.a, this.b);
    }
}

