/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.T;
import com.growingio.b.a.aK;
import com.growingio.b.o;

public class aD
extends aK {
    char a;

    aD(char c2) {
        this.a = c2;
    }

    public aD(String string) {
        this(T.d(string).charAt(0));
    }

    public char a() {
        return this.a;
    }

    public o b() {
        return T.a(this.a);
    }

    public String toString() {
        return T.c(Character.toString(this.a));
    }

    @Override
    void a(StringBuffer stringBuffer) {
        stringBuffer.append(this.a);
    }
}

