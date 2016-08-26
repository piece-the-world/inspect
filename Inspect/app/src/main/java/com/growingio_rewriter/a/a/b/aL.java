/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aH;
import com.growingio.a.a.b.aM;
import com.growingio.a.a.b.aN;
import java.util.Arrays;

public final class aL {
    private aL() {
    }

    public static boolean a(Object object, Object object2) {
        return object == object2 || object != null && object.equals(object2);
    }

    public static /* varargs */ int a(Object ... arrobject) {
        return Arrays.hashCode(arrobject);
    }

    public static aN a(Object object) {
        return new aN(object.getClass().getSimpleName(), null);
    }

    public static aN a(Class<?> class_) {
        return new aN(class_.getSimpleName(), null);
    }

    public static aN a(String string) {
        return new aN(string, null);
    }

    public static <T> T b(T t2, T t3) {
        return aH.a(t2, t3);
    }
}

