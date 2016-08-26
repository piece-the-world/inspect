/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile;

import com.growingio.agent.compile.N;
import com.growingio.agent.compile.S;
import com.growingio.agent.compile.VdsRewriterAgent;
import com.growingio.agent.compile.h;
import com.growingio.agent.compile.m;
import com.growingio.agent.compile.o;
import com.growingio.agent.compile.p;
import com.growingio.d.a.e;
import com.growingio.d.a.f;
import com.growingio.d.a.u;
import java.lang.instrument.IllegalClassFormatException;
import java.net.URISyntaxException;
import java.security.ProtectionDomain;
import java.util.Map;

final class M
implements S {
    private m a;
    private final Map<String, h> b;

    public M(m m2) throws URISyntaxException {
        String string;
        try {
            string = VdsRewriterAgent.b();
        }
        catch (URISyntaxException var3_3) {
            m2.b("Unable to get the path to the VDS class rewriter jar", var3_3);
            throw var3_3;
        }
        this.a = m2;
        this.b = new N(this, m2, string);
    }

    @Override
    public boolean a(Class<?> class_) {
        u u2 = u.a(class_);
        return this.b.containsKey(u2.e());
    }

    @Override
    public byte[] transform(ClassLoader classLoader, String string, Class<?> class_, ProtectionDomain protectionDomain, byte[] arrby) throws IllegalClassFormatException {
        h h2 = this.b.get(string);
        if (h2 != null) {
            if (class_ != null && !h2.a()) {
                this.a.c("Cannot instrument " + string);
                return null;
            }
            try {
                e e2 = new e(arrby);
                o o2 = new o(3, classLoader);
                f f2 = h2.a(o2);
                e2.a(f2, 4);
                return o2.b();
            }
            catch (p var7_8) {
            }
            catch (Exception var7_9) {
                this.a.b("Error transforming class " + string, var7_9);
            }
        }
        return null;
    }
}

