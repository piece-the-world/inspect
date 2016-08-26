/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.e;

import com.growingio.d.a.a;
import com.growingio.d.a.e.f;
import com.growingio.d.a.u;

public class c
extends a {
    private final boolean a;
    private boolean b;

    public c(a a2) {
        this(a2, true);
    }

    c(a a2, boolean bl2) {
        super(327680, a2);
        this.a = bl2;
    }

    @Override
    public void a(String string, Object object) {
        int n2;
        this.b();
        this.b(string);
        if (!(object instanceof Byte || object instanceof Boolean || object instanceof Character || object instanceof Short || object instanceof Integer || object instanceof Long || object instanceof Float || object instanceof Double || object instanceof String || object instanceof u || object instanceof byte[] || object instanceof boolean[] || object instanceof char[] || object instanceof short[] || object instanceof int[] || object instanceof long[] || object instanceof float[] || object instanceof double[])) {
            throw new IllegalArgumentException("Invalid annotation value");
        }
        if (object instanceof u && (n2 = ((u)object).a()) == 11) {
            throw new IllegalArgumentException("Invalid annotation value");
        }
        if (this.d != null) {
            this.d.a(string, object);
        }
    }

    @Override
    public void a(String string, String string2, String string3) {
        this.b();
        this.b(string);
        f.b(string2, false);
        if (string3 == null) {
            throw new IllegalArgumentException("Invalid enum value");
        }
        if (this.d != null) {
            this.d.a(string, string2, string3);
        }
    }

    @Override
    public a a(String string, String string2) {
        this.b();
        this.b(string);
        f.b(string2, false);
        return new c(this.d == null ? null : this.d.a(string, string2));
    }

    @Override
    public a a(String string) {
        this.b();
        this.b(string);
        return new c(this.d == null ? null : this.d.a(string), false);
    }

    @Override
    public void b_() {
        this.b();
        this.b = true;
        if (this.d != null) {
            this.d.b_();
        }
    }

    private void b() {
        if (this.b) {
            throw new IllegalStateException("Cannot call a visit method after visitEnd has been called");
        }
    }

    private void b(String string) {
        if (this.a && string == null) {
            throw new IllegalArgumentException("Annotation value name must not be null");
        }
    }
}

