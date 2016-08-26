/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.f.S;
import org.xml.sax.ContentHandler;

final class aa
implements S {
    private final ContentHandler a;

    aa(ContentHandler contentHandler) {
        this.a = contentHandler;
    }

    @Override
    public final ContentHandler a() {
        return this.a;
    }
}

