/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aD;
import com.growingio.a.a.b.aE;
import com.growingio.a.a.b.aF;
import com.growingio.a.a.b.aG;
import com.growingio.a.a.b.aU;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

public class aC {
    private final String a;

    public static aC a(String string) {
        return new aC(string);
    }

    public static aC a(char c2) {
        return new aC(String.valueOf(c2));
    }

    private aC(String string) {
        this.a = aU.a(string);
    }

    private aC(aC aC2) {
        this.a = aC2.a;
    }

    public <A extends Appendable> A a(A a2, Iterable<?> iterable) throws IOException {
        return this.a(a2, iterable.iterator());
    }

    public <A extends Appendable> A a(A a2, Iterator<?> iterator) throws IOException {
        aU.a(a2);
        if (iterator.hasNext()) {
            a2.append(this.a(iterator.next()));
            while (iterator.hasNext()) {
                a2.append(this.a);
                a2.append(this.a(iterator.next()));
            }
        }
        return a2;
    }

    public final <A extends Appendable> A a(A a2, Object[] arrobject) throws IOException {
        return this.a(a2, Arrays.asList(arrobject));
    }

    public final /* varargs */ <A extends Appendable> A a(A a2, Object object, Object object2, Object ... arrobject) throws IOException {
        return this.a(a2, aC.b(object, object2, arrobject));
    }

    public final StringBuilder a(StringBuilder stringBuilder, Iterable<?> iterable) {
        return this.a(stringBuilder, iterable.iterator());
    }

    public final StringBuilder a(StringBuilder stringBuilder, Iterator<?> iterator) {
        try {
            this.a((A)stringBuilder, iterator);
        }
        catch (IOException var3_3) {
            throw new AssertionError(var3_3);
        }
        return stringBuilder;
    }

    public final StringBuilder a(StringBuilder stringBuilder, Object[] arrobject) {
        return this.a(stringBuilder, Arrays.asList(arrobject));
    }

    public final /* varargs */ StringBuilder a(StringBuilder stringBuilder, Object object, Object object2, Object ... arrobject) {
        return this.a(stringBuilder, aC.b(object, object2, arrobject));
    }

    public final String a(Iterable<?> iterable) {
        return this.a(iterable.iterator());
    }

    public final String a(Iterator<?> iterator) {
        return this.a(new StringBuilder(), iterator).toString();
    }

    public final String a(Object[] arrobject) {
        return this.a(Arrays.asList(arrobject));
    }

    public final /* varargs */ String a(Object object, Object object2, Object ... arrobject) {
        return this.a(aC.b(object, object2, arrobject));
    }

    public aC b(String string) {
        aU.a(string);
        return new aD(this, this, string);
    }

    public aC a() {
        return new aE(this, this);
    }

    public aG b(char c2) {
        return this.c(String.valueOf(c2));
    }

    public aG c(String string) {
        return new aG(this, string, null);
    }

    CharSequence a(Object object) {
        aU.a(object);
        return object instanceof CharSequence ? (CharSequence)object : object.toString();
    }

    private static Iterable<Object> b(Object object, Object object2, Object[] arrobject) {
        aU.a(arrobject);
        return new aF(arrobject, object, object2);
    }

    /* synthetic */ aC(aC aC2, aD aD2) {
        this(aC2);
    }

    static /* synthetic */ String a(aC aC2) {
        return aC2.a;
    }
}

