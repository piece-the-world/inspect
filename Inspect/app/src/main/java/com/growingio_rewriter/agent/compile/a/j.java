/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile.a;

import com.growingio.agent.compile.VdsRewriterAgent;
import com.growingio.agent.compile.k;
import com.growingio.agent.compile.m;
import com.growingio.d.a.f;
import com.growingio.d.a.r;
import java.util.UUID;

public class j
extends f {
    private static String a;
    private final k b;
    private final m c;

    public j(f f2, k k2, m m2) {
        super(327680, f2);
        this.b = k2;
        this.c = m2;
    }

    public static String b() {
        if (a == null) {
            a = UUID.randomUUID().toString();
        }
        return a;
    }

    @Override
    public r a(int n2, String string, String string2, String string3, String[] arrstring) {
        if (this.b.h().equals("com/growingio/android/sdk/collection/GConfig") && string.equals("isInstrumented")) {
            return new com.growingio.agent.compile.a.k(this, super.a(n2, string, string2, string3, arrstring), n2, string, string2);
        }
        return super.a(n2, string, string2, string3, arrstring);
    }

    @Override
    public com.growingio.d.a.j a(int n2, String string, String string2, String string3, Object object) {
        if (!this.b.h().equals("com/growingio/android/sdk/collection/GConfig") || !string.equals("AGENT_VERSION") || object.equals(VdsRewriterAgent.getVersion())) {
            return super.a(n2, string, string2, string3, object);
        }
        throw new com.growingio.agent.compile.j("VDS Error: Your agent and class rewriter versions do not match: agent = " + object + " class rewriter = " + VdsRewriterAgent.getVersion() + ".  You probably need to update one of these components.  If you're using gradle and just updated, run gradle -stop to restart the daemon.");
    }

    static /* synthetic */ m a(j j2) {
        return j2.c;
    }

    static /* synthetic */ k b(j j2) {
        return j2.b;
    }
}

