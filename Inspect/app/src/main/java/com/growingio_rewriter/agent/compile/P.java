/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile;

import com.growingio.agent.compile.N;
import com.growingio.agent.compile.VdsRewriterAgent;
import com.growingio.agent.compile.h;
import com.growingio.agent.compile.m;
import com.growingio.d.a.f;

class P
extends h {
    final /* synthetic */ N a;

    P(N n2, boolean bl2) {
        this.a = n2;
        super(bl2);
    }

    @Override
    public f a(f f2) {
        return VdsRewriterAgent.b(f2, this.a.a);
    }
}

