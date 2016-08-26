/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.h.M;
import com.growingio.a.a.h.aC;
import java.nio.charset.Charset;

abstract class d
implements M {
    d() {
    }

    @Override
    public final M a(boolean bl2) {
        return this.b(bl2 ? 1 : 0);
    }

    @Override
    public final M a(double d2) {
        return this.a(Double.doubleToRawLongBits(d2));
    }

    @Override
    public final M a(float f2) {
        return this.a(Float.floatToRawIntBits(f2));
    }

    @Override
    public M a(CharSequence charSequence) {
        int n2 = charSequence.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            this.a(charSequence.charAt(i2));
        }
        return this;
    }

    @Override
    public M a(CharSequence charSequence, Charset charset) {
        return this.b(charSequence.toString().getBytes(charset));
    }

    @Override
    public /* synthetic */ aC b(CharSequence charSequence, Charset charset) {
        return this.a(charSequence, charset);
    }

    @Override
    public /* synthetic */ aC b(CharSequence charSequence) {
        return this.a(charSequence);
    }

    @Override
    public /* synthetic */ aC b(boolean bl2) {
        return this.a(bl2);
    }

    @Override
    public /* synthetic */ aC b(double d2) {
        return this.a(d2);
    }

    @Override
    public /* synthetic */ aC b(float f2) {
        return this.a(f2);
    }
}

