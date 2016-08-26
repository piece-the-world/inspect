/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.bV;

public final class bU {
    public static void a(boolean bl2) {
        if (!bl2) {
            throw new bV();
        }
    }

    public static /* varargs */ void a(boolean bl2, String string, Object ... arrobject) {
        if (!bl2) {
            throw new bV(aU.a(string, arrobject));
        }
    }

    public static <T> T a(T t2) {
        return bU.a(t2, "expected a non-null reference", new Object[0]);
    }

    public static /* varargs */ <T> T a(T t2, String string, Object ... arrobject) {
        bU.a(t2 != null, string, arrobject);
        return t2;
    }

    private bU() {
    }
}

