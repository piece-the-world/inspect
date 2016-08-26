/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.h.H;
import com.growingio.a.a.h.aC;
import com.growingio.a.a.h.x;
import java.nio.charset.Charset;

public interface M
extends aC {
    public M b(byte var1);

    public M b(byte[] var1);

    public M b(byte[] var1, int var2, int var3);

    public M a(short var1);

    public M a(int var1);

    public M a(long var1);

    public M a(float var1);

    public M a(double var1);

    public M a(boolean var1);

    public M a(char var1);

    public M a(CharSequence var1);

    public M a(CharSequence var1, Charset var2);

    public <T> M a(T var1, x<? super T> var2);

    public H a();

    public int hashCode();
}

