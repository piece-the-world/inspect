/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile.a;

import com.growingio.agent.compile.k;
import com.growingio.agent.compile.m;
import com.growingio.d.a.f;
import java.text.MessageFormat;

public class a
extends f {
    private final k a;
    private final m b;

    public a(f f2, k k2, m m2) {
        super(327680, f2);
        this.a = k2;
        this.b = m2;
    }

    @Override
    public void a() {
        if (this.a.f()) {
            this.a.b("Lcom/growingio/android/sdk/instrumentation/Instrumented;");
            super.a("Lcom/growingio/android/sdk/instrumentation/Instrumented;", false);
            this.b.d(MessageFormat.format("annotating modified class [{0}]", this.a.i()));
        }
        super.a();
    }
}

