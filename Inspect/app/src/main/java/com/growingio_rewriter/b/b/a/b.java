/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.b.a;

import com.growingio.b.b.a.x;
import com.growingio.b.b.e;
import java.io.Serializable;

public abstract class b
implements Serializable {
    public b a() {
        return null;
    }

    public b b() {
        return null;
    }

    public void a(b b2) {
    }

    public void b(b b2) {
    }

    public abstract void a(x var1) throws e;

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('<');
        stringBuffer.append(this.f());
        stringBuffer.append('>');
        return stringBuffer.toString();
    }

    protected String f() {
        String string = this.getClass().getName();
        return string.substring(string.lastIndexOf(46) + 1);
    }
}

