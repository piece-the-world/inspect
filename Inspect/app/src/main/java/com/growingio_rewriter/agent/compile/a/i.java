/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile.a;

import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.fg;
import com.growingio.agent.compile.VdsRewriterAgent;
import com.growingio.agent.compile.a.f;
import com.growingio.agent.compile.k;
import com.growingio.agent.compile.m;
import com.growingio.d.a.a.j;
import com.growingio.d.a.a.o;
import com.growingio.d.a.u;
import java.util.Map;
import java.util.Set;

public class i
extends f {
    private static final fg<String> h = fg.a("android/support/v4/app/Fragment", "android/app/Fragment", "android/webkit/WebViewFragment", "android/preference/PreferenceFragment", "android/app/ListFragment", "android/support/v4/app/Fragment", "android/support/v4/app/ListFragment");

    public i(com.growingio.d.a.f f2, k k2, m m2) {
        super(f2, k2, m2, h, ei.b(new o("onResume", "()V"), new o("onFragmentResume", "(Ljava/lang/Object;)V"), new o("onPause", "()V"), new o("onFragmentPause", "(Ljava/lang/Object;)V"), new o("setUserVisibleHint", "(Z)V"), new o("setFragmentUserVisibleHint", "(Ljava/lang/Object;Z)V")));
    }

    @Override
    protected boolean b() {
        if (this.b.d()) {
            this.d.a(this.b.h() + " already tagged as instrumented, skipping");
            return false;
        }
        return super.b() && !this.b.h().startsWith("android/support");
    }

    @Override
    protected void a(j j2, o o2, o o3) {
        j2.c(VdsRewriterAgent.CollectorClassType, o3);
    }
}

