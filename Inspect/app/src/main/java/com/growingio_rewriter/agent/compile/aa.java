/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile;

import com.growingio.agent.compile.S;
import com.growingio.agent.compile.ab;
import com.growingio.agent.compile.s;
import com.growingio.d.a.u;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;
import java.util.HashSet;

final class aa
implements S {
    private static HashSet<String> a = new ab();

    private aa() {
    }

    @Override
    public byte[] transform(ClassLoader classLoader, String string, Class<?> class_, ProtectionDomain protectionDomain, byte[] arrby) throws IllegalClassFormatException {
        return null;
    }

    @Override
    public boolean a(Class<?> class_) {
        u u2 = u.a(class_);
        return a.contains(u2.e());
    }

    /* synthetic */ aa(s s2) {
        this();
    }
}

