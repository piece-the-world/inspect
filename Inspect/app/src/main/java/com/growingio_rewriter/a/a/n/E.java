/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.n.F;
import java.util.Map;

public interface E<B>
extends Map<F<? extends B>, B> {
    public <T extends B> T a(Class<T> var1);

    public <T extends B> T a(Class<T> var1, T var2);

    public <T extends B> T a(F<T> var1);

    public <T extends B> T a(F<T> var1, T var2);
}

