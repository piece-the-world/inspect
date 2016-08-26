/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.R;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.f;
import java.io.Serializable;

final class l
extends R<String, String>
implements Serializable {
    private final f a;
    private final f b;
    private static final long c = 0;

    l(f f2, f f3) {
        this.a = aU.a(f2);
        this.b = aU.a(f3);
    }

    @Override
    protected String a(String string) {
        return this.a.a(this.b, string);
    }

    @Override
    protected String b(String string) {
        return this.b.a(this.a, string);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof l) {
            l l2 = (l)object;
            return this.a.equals((Object)l2.a) && this.b.equals((Object)l2.b);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public String toString() {
        return (Object)((Object)this.a) + ".converterTo(" + (Object)((Object)this.b) + ")";
    }

    @Override
    protected /* synthetic */ Object a(Object object) {
        return this.b((String)object);
    }

    @Override
    protected /* synthetic */ Object b(Object object) {
        return this.a((String)object);
    }
}

