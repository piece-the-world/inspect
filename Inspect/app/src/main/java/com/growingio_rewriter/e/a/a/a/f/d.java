/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.f;

import com.growingio.e.a.a.a.f.a;
import com.growingio.e.a.a.a.f.b;
import com.growingio.e.a.a.a.f.c;
import com.growingio.e.a.a.a.f.e;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class d
extends ObjectInputStream {
    private final List<a> a = new ArrayList<a>();
    private final List<a> b = new ArrayList<a>();

    public d(InputStream inputStream) throws IOException {
        super(inputStream);
    }

    private void b(String string) throws InvalidClassException {
        for (a object : this.b) {
            if (!object.a(string)) continue;
            this.a(string);
        }
        boolean bl2 = false;
        for (a a2 : this.a) {
            if (!a2.a(string)) continue;
            bl2 = true;
            break;
        }
        if (!bl2) {
            this.a(string);
        }
    }

    protected void a(String string) throws InvalidClassException {
        throw new InvalidClassException("Class name not accepted: " + string);
    }

    @Override
    protected Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
        this.b(objectStreamClass.getName());
        return super.resolveClass(objectStreamClass);
    }

    public /* varargs */ d a(Class<?> ... arrclass) {
        for (Class class_ : arrclass) {
            this.a.add(new b(class_.getName()));
        }
        return this;
    }

    public /* varargs */ d b(Class<?> ... arrclass) {
        for (Class class_ : arrclass) {
            this.b.add(new b(class_.getName()));
        }
        return this;
    }

    public /* varargs */ d a(String ... arrstring) {
        for (String string : arrstring) {
            this.a.add(new e(string));
        }
        return this;
    }

    public /* varargs */ d b(String ... arrstring) {
        for (String string : arrstring) {
            this.b.add(new e(string));
        }
        return this;
    }

    public d a(Pattern pattern) {
        this.a.add(new c(pattern));
        return this;
    }

    public d b(Pattern pattern) {
        this.b.add(new c(pattern));
        return this;
    }

    public d a(a a2) {
        this.a.add(a2);
        return this;
    }

    public d b(a a2) {
        this.b.add(a2);
        return this;
    }
}

