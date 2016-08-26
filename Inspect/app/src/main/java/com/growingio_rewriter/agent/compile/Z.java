/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile;

import com.growingio.agent.compile.T;
import com.growingio.agent.compile.U;
import com.growingio.agent.compile.VdsRewriterAgent;
import com.growingio.agent.compile.m;
import java.io.File;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

class Z
implements InvocationHandler {
    final /* synthetic */ U a;

    Z(U u2) {
        this.a = u2;
    }

    @Override
    public Object invoke(Object object, Method method, Object[] arrobject) throws Throwable {
        List list = (List)arrobject[0];
        String string = (String)list.get(0);
        File file = new File(string);
        if (T.a(this.a.b)) {
            this.a.a.a("Instrumentation disabled, no agent present.  Command: " + file.getName());
            this.a.a.d("Execute: " + list.toString());
            return null;
        }
        String string2 = null;
        if (VdsRewriterAgent.c().contains(file.getName().toLowerCase())) {
            string2 = "-Jjavaagent:" + T.e(this.a.b);
        } else if (VdsRewriterAgent.d().contains(file.getName().toLowerCase())) {
            string2 = "-javaagent:" + T.e(this.a.b);
        }
        if (string2 != null) {
            list.add(1, this.a(string2));
        }
        this.a.a.d("Execute: " + list.toString());
        return null;
    }

    private String a(String string) {
        return System.getProperty("os.name").toLowerCase().contains("win") ? "\"" + string + "\"" : string;
    }
}

