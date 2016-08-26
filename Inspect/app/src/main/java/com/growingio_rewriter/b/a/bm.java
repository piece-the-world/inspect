/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.Q;
import com.growingio.b.a.h;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;

public class bm
extends h {
    public static final String a = "Synthetic";

    bm(Q q2, int n2, DataInputStream dataInputStream) throws IOException {
        super(q2, n2, dataInputStream);
    }

    public bm(Q q2) {
        super(q2, "Synthetic", new byte[0]);
    }

    @Override
    public h a(Q q2, Map map) {
        return new bm(q2);
    }
}

