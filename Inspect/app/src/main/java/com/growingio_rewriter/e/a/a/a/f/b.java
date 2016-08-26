/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.f;

import com.growingio.e.a.a.a.f.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class b
implements a {
    private final Set<String> a;

    public /* varargs */ b(String ... arrstring) {
        this.a = Collections.unmodifiableSet(new HashSet<String>(Arrays.asList(arrstring)));
    }

    @Override
    public boolean a(String string) {
        return this.a.contains(string);
    }
}

