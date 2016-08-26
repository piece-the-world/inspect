/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

public abstract class aK {
    abstract void a(StringBuffer var1);

    static void a(StringBuffer stringBuffer, aK[] arraK) {
        for (int i2 = 0; i2 < arraK.length; ++i2) {
            if (i2 > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(arraK[i2]);
        }
    }

    public String d() {
        return this.toString();
    }
}

