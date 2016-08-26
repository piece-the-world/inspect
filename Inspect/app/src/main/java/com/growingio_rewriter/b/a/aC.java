/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.aJ;
import com.growingio.b.a.aK;

public class aC
extends aJ {
    int a;
    aK b;

    public aC(int n2, aK aK2) {
        this.a = n2;
        this.b = aK2;
    }

    public int a() {
        return this.a;
    }

    public aK b() {
        return this.b;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(this.b.toString());
        for (int i2 = 0; i2 < this.a; ++i2) {
            stringBuffer.append("[]");
        }
        return stringBuffer.toString();
    }

    @Override
    void a(StringBuffer stringBuffer) {
        for (int i2 = 0; i2 < this.a; ++i2) {
            stringBuffer.append('[');
        }
        this.b.a(stringBuffer);
    }
}

