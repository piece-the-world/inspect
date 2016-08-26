/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.ad;
import com.growingio.b.o;

public abstract class I {
    I c;
    protected o d;

    protected I(o o2) {
        this.d = o2;
        this.c = null;
    }

    final I s() {
        return this.c;
    }

    void t() {
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(this.getClass().getName());
        stringBuffer.append("@");
        stringBuffer.append(Integer.toHexString(this.hashCode()));
        stringBuffer.append("[");
        stringBuffer.append(ad.t(this.d()));
        this.a(stringBuffer);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    protected abstract void a(StringBuffer var1);

    public o r_() {
        return this.d;
    }

    public boolean c(o o2) {
        int n2 = this.d();
        if (ad.a(n2)) {
            return true;
        }
        if (ad.b(n2)) {
            return o2 == this.d;
        }
        String string = this.d.u();
        String string2 = o2.u();
        boolean bl2 = string == null ? string2 == null : string.equals(string2);
        if (!bl2 && ad.c(n2)) {
            return o2.b(this.d);
        }
        return bl2;
    }

    public abstract int d();

    public abstract void a(int var1);

    public boolean b(Class class_) {
        return this.a(class_.getName());
    }

    public abstract boolean a(String var1);

    public abstract Object a(Class var1) throws ClassNotFoundException;

    public abstract Object[] e() throws ClassNotFoundException;

    public abstract Object[] f();

    public abstract String q();

    public abstract String k();

    public abstract String l();

    public abstract void b(String var1);

    public abstract byte[] d(String var1);

    public abstract void a(String var1, byte[] var2);
}

