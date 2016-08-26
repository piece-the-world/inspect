/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.am;

class al
implements am {
    al() {
    }

    @Override
    public Class<?> a() {
        try {
            return Class.forName("Finalizer");
        }
        catch (ClassNotFoundException var1_1) {
            throw new AssertionError(var1_1);
        }
    }
}

