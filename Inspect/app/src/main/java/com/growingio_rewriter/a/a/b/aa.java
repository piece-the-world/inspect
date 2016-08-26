/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.R;
import com.growingio.a.a.b.aU;
import java.io.Serializable;

final class aa<T extends Enum<T>>
extends R<String, T>
implements Serializable {
    private final Class<T> a;
    private static final long b = 0;

    aa(Class<T> class_) {
        this.a = aU.a(class_);
    }

    @Override
    protected T a(String string) {
        return Enum.valueOf(this.a, string);
    }

    @Override
    protected String a(T t2) {
        return t2.name();
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof aa) {
            aa aa2 = (aa)object;
            return this.a.equals(aa2.a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "Enums.stringConverter(" + this.a.getName() + ".class)";
    }

    @Override
    protected /* synthetic */ Object b(Object object) {
        return this.a((String)object);
    }
}

