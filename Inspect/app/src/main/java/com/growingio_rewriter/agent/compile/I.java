/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile;

import com.growingio.agent.compile.G;
import com.growingio.agent.compile.H;
import com.growingio.agent.compile.K;
import com.growingio.d.a.a.j;
import com.growingio.d.a.a.o;
import com.growingio.d.a.r;
import com.growingio.d.a.u;
import java.io.File;
import java.util.List;

class I
extends j {
    final /* synthetic */ H a;

    I(H h2, int n2, r r2, int n3, String string, String string2) {
        this.a = h2;
        super(n2, r2, n3, string, string2);
    }

    @Override
    public void a(int n2, String string, String string2, String string3) {
        if ("executeCommand".equals(string2) && "(Ljava/lang/String;Ljava/util/List;Ljava/io/File;Z)V".equals(string3)) {
            int n3 = this.k(u.n);
            this.g(n3);
            int n4 = this.k(u.a(File.class));
            this.g(n4);
            this.i();
            this.b(0);
            String string4 = "-javaagent:" + this.a.a.a;
            new K(this).b("Maven agent jar: " + string4);
            this.a(string4);
            this.d(u.a(List.class), new o("add", "(ILjava/lang/Object;)V"));
            this.f(n4);
            this.f(n3);
        }
        super.a(n2, string, string2, string3);
    }
}

