/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aC;
import com.growingio.a.a.b.aD;
import com.growingio.a.a.b.aU;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class aG {
    private final aC a;
    private final String b;

    private aG(aC aC2, String string) {
        this.a = aC2;
        this.b = aU.a(string);
    }

    public <A extends Appendable> A a(A a2, Map<?, ?> map) throws IOException {
        return this.a(a2, map.entrySet());
    }

    public StringBuilder a(StringBuilder stringBuilder, Map<?, ?> map) {
        return this.a(stringBuilder, map.entrySet());
    }

    public String a(Map<?, ?> map) {
        return this.a(map.entrySet());
    }

    public <A extends Appendable> A a(A a2, Iterable<? extends Map.Entry<?, ?>> iterable) throws IOException {
        return this.a(a2, iterable.iterator());
    }

    public <A extends Appendable> A a(A a2, Iterator<? extends Map.Entry<?, ?>> iterator) throws IOException {
        aU.a(a2);
        if (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            a2.append(this.a.a(entry.getKey()));
            a2.append(this.b);
            a2.append(this.a.a(entry.getValue()));
            while (iterator.hasNext()) {
                a2.append(aC.a(this.a));
                Map.Entry entry2 = iterator.next();
                a2.append(this.a.a(entry2.getKey()));
                a2.append(this.b);
                a2.append(this.a.a(entry2.getValue()));
            }
        }
        return a2;
    }

    public StringBuilder a(StringBuilder stringBuilder, Iterable<? extends Map.Entry<?, ?>> iterable) {
        return this.a(stringBuilder, iterable.iterator());
    }

    public StringBuilder a(StringBuilder stringBuilder, Iterator<? extends Map.Entry<?, ?>> iterator) {
        try {
            this.a((A)stringBuilder, iterator);
        }
        catch (IOException var3_3) {
            throw new AssertionError(var3_3);
        }
        return stringBuilder;
    }

    public String a(Iterable<? extends Map.Entry<?, ?>> iterable) {
        return this.a(iterable.iterator());
    }

    public String a(Iterator<? extends Map.Entry<?, ?>> iterator) {
        return this.a(new StringBuilder(), iterator).toString();
    }

    public aG a(String string) {
        return new aG(this.a.b(string), this.b);
    }

    /* synthetic */ aG(aC aC2, String string, aD aD2) {
        this(aC2, string);
    }
}

