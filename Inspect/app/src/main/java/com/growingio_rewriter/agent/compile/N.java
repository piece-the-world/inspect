/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile;

import com.growingio.agent.compile.M;
import com.growingio.agent.compile.O;
import com.growingio.agent.compile.P;
import com.growingio.agent.compile.Q;
import com.growingio.agent.compile.R;
import com.growingio.agent.compile.h;
import com.growingio.agent.compile.m;
import java.util.HashMap;

class N
extends HashMap<String, h> {
    final /* synthetic */ m a;
    final /* synthetic */ String b;
    final /* synthetic */ M c;

    N(M m2, m m3, String string) {
        this.c = m2;
        this.a = m3;
        this.b = string;
        this.put("com/android/dx/command/dexer/Main", new O(this, true));
        this.put("com/android/ant/DexExecTask", new P(this, false));
        this.put("com/jayway/maven/plugins/android/phase08preparepackage/DexMojo", new Q(this, true));
        this.put("java/lang/ProcessBuilder", new R(this, true));
    }
}

