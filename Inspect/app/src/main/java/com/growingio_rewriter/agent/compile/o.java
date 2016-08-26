/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile;

import com.growingio.d.a.g;

class o
extends g {
    private final ClassLoader al;

    public o(int n2, ClassLoader classLoader) {
        super(n2);
        this.al = classLoader;
    }

    @Override
    protected String a(String string, String string2) {
        try {
            Class class_ = Class.forName(string.replace('/', '.'), true, this.al);
            Class class_2 = Class.forName(string2.replace('/', '.'), true, this.al);
            if (class_.isAssignableFrom(class_2)) {
                return string;
            }
            if (class_2.isAssignableFrom(class_)) {
                return string2;
            }
            if (class_.isInterface() || class_2.isInterface()) {
                return "java/lang/Object";
            }
            while (!(class_ = class_.getSuperclass()).isAssignableFrom(class_2)) {
            }
            return class_.getName().replace('.', '/');
        }
        catch (Exception var3_4) {
            throw new RuntimeException(var3_4.toString());
        }
    }
}

