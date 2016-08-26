/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.aJ;

public class aN
extends aJ {
    String a;

    aN(String string, int n2, int n3) {
        this.a = string.substring(n2, n3);
    }

    public aN(String string) {
        this.a = string;
    }

    public String a() {
        return this.a;
    }

    public String toString() {
        return this.a;
    }

    @Override
    void a(StringBuffer stringBuffer) {
        stringBuffer.append('T').append(this.a).append(';');
    }
}

