/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile;

import com.growingio.agent.compile.T;
import com.growingio.agent.compile.V;
import com.growingio.agent.compile.VdsRewriterAgent;
import com.growingio.agent.compile.W;
import com.growingio.agent.compile.X;
import com.growingio.agent.compile.Y;
import com.growingio.agent.compile.Z;
import com.growingio.agent.compile.m;
import java.lang.reflect.InvocationHandler;
import java.util.HashMap;

class U
extends HashMap<String, InvocationHandler> {
    final /* synthetic */ m a;
    final /* synthetic */ T b;

    U(T t2, m m2) {
        this.b = t2;
        this.a = m2;
        this.put(VdsRewriterAgent.a("com/android/dx/command/dexer/Main", "processClass"), new V(this));
        this.put(VdsRewriterAgent.a("com/android/ant/DexExecTask", "preDexLibraries"), new W(this));
        this.put("SET_INSTRUMENTATION_DISABLED_FLAG", new X(this));
        this.put("PRINT_TO_INFO_LOG", new Y(this));
        this.put(VdsRewriterAgent.a("java/lang/ProcessBuilder", "start"), new Z(this));
    }
}

