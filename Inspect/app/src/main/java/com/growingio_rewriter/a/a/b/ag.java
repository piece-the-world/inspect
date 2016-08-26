/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.ab;
import com.growingio.a.a.b.ac;
import java.io.Serializable;

public final class ag<T>
implements Serializable {
    private final ab<? super T> a;
    private final T b;
    private static final long c = 0;

    private ag(ab<? super T> ab2, T t2) {
        this.a = aU.a(ab2);
        this.b = t2;
    }

    public T a() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof ag) {
            ag ag2 = (ag)object;
            if (this.a.equals(ag2.a)) {
                ab<T> ab2 = this.a;
                return ab2.a(this.b, ag2.b);
            }
        }
        return false;
    }

    public int hashCode() {
        return this.a.a(this.b);
    }

    public String toString() {
        return this.a + ".wrap(" + this.b + ")";
    }

    /* synthetic */ ag(ab ab2, Object object, ac ac2) {
        this(ab2, object);
    }
}

