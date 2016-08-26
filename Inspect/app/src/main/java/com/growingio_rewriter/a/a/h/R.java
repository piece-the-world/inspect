/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.h.O;
import com.growingio.a.a.h.Q;
import java.util.zip.CRC32;
import java.util.zip.Checksum;

final class R
extends Q {
    R(String string2, int n3, int n4) {
        super(string, n2, (int)string2, null);
    }

    @Override
    public Checksum c() {
        return new CRC32();
    }

    @Override
    public /* synthetic */ Object a() {
        return this.c();
    }
}

