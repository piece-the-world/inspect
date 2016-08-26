/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.Q;
import com.growingio.b.a.aA;
import com.growingio.b.a.am;
import com.growingio.b.a.l;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;

public class an
extends am {
    public static final String f = "LocalVariableTypeTable";

    public an(Q q2) {
        super(q2, "LocalVariableTypeTable", new byte[2]);
        l.a(0, this.e, 0);
    }

    an(Q q2, int n2, DataInputStream dataInputStream) throws IOException {
        super(q2, n2, dataInputStream);
    }

    private an(Q q2, byte[] arrby) {
        super(q2, "LocalVariableTypeTable", arrby);
    }

    @Override
    String a(String string, String string2, String string3) {
        return aA.a(string, string2, string3);
    }

    @Override
    String a(String string, Map map) {
        return aA.a(string, map);
    }

    @Override
    am a(Q q2, byte[] arrby) {
        return new an(q2, arrby);
    }
}

