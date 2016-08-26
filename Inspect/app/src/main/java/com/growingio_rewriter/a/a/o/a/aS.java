/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.d.fg;
import com.growingio.a.a.o.a.aL;
import com.growingio.a.a.o.a.aT;
import com.growingio.a.a.o.a.ba;
import java.util.Arrays;
import java.util.Set;

class aS
extends IllegalStateException {
    static final StackTraceElement[] a = new StackTraceElement[0];
    static final Set<String> b = fg.a(aL.class.getName(), aS.class.getName(), aT.class.getName());

    aS(aT aT2, aT aT3) {
        super(aT2.a() + " -> " + aT3.a());
        StackTraceElement[] arrstackTraceElement = this.getStackTrace();
        int n2 = arrstackTraceElement.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (ba.class.getName().equals(arrstackTraceElement[i2].getClassName())) {
                this.setStackTrace(a);
                break;
            }
            if (b.contains(arrstackTraceElement[i2].getClassName())) continue;
            this.setStackTrace(Arrays.copyOfRange(arrstackTraceElement, i2, n2));
            break;
        }
    }
}

