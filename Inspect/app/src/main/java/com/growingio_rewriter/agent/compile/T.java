/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile;

import com.growingio.agent.compile.U;
import com.growingio.agent.compile.VdsRewriterAgent;
import com.growingio.agent.compile.a.a;
import com.growingio.agent.compile.a.c;
import com.growingio.agent.compile.a.e;
import com.growingio.agent.compile.a.i;
import com.growingio.agent.compile.a.l;
import com.growingio.agent.compile.a.o;
import com.growingio.agent.compile.b;
import com.growingio.agent.compile.g;
import com.growingio.agent.compile.j;
import com.growingio.agent.compile.k;
import com.growingio.agent.compile.m;
import com.growingio.agent.compile.p;
import com.growingio.d.a.f;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.net.URISyntaxException;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

class T
implements InvocationHandler {
    private final m a;
    private final g b;
    private final k c;
    private final Map<String, InvocationHandler> d;
    private boolean e = true;
    private final String f;
    private boolean g = false;

    public T(m m2) throws FileNotFoundException, IOException, ClassNotFoundException, URISyntaxException {
        this.a = m2;
        this.b = new g(m2);
        this.c = new k(this.b, m2);
        this.f = VdsRewriterAgent.b();
        this.d = Collections.unmodifiableMap(new U(this, m2));
    }

    private boolean a() {
        return this.g || System.getProperty("growingio.instrumentation.disabled") != null || VdsRewriterAgent.instrumentationDisabled;
    }

    private boolean a(String string) {
        for (String string2 : VdsRewriterAgent.e()) {
            if (!string.contains(string2)) continue;
            return true;
        }
        return false;
    }

    @Override
    public Object invoke(Object object, Method method, Object[] arrobject) throws Throwable {
        InvocationHandler invocationHandler = this.d.get(object.toString());
        if (invocationHandler == null) {
            this.a.c("Unknown invocation type: " + object + ".  Arguments: " + Arrays.asList(arrobject));
            return null;
        }
        try {
            return invocationHandler.invoke(object, method, arrobject);
        }
        catch (Throwable var5_5) {
            this.a.b("Error:" + var5_5.getMessage(), var5_5);
            return null;
        }
    }

    private b a(byte[] arrby) {
        String string = "bad class";
        try {
            com.growingio.d.a.e e2 = new com.growingio.d.a.e(arrby);
            com.growingio.d.a.g g2 = new com.growingio.d.a.g(e2, 1);
            this.c.b();
            e2.a(new l(this.c, this.a), 7);
            string = this.c.h();
            if (!this.c.d("Lcom/growingio/android/sdk/instrumentation/Instrumented;")) {
                f f22;
                f f22;
                if (this.c.h().startsWith("com/growingio/android/sdk")) {
                    f22 = new com.growingio.agent.compile.a.j(g2, this.c, this.a);
                } else {
                    if (this.a(this.c.h())) {
                        return null;
                    }
                    f22 = new c(new o(new i(new a(g2, this.c, this.a), this.c, this.a), this.c, this.a), this.c, this.a);
                }
                e2.a(new e(f22, this.c), 12);
            } else {
                this.a.b(MessageFormat.format("[{0}] class is already instrumented! skipping ...", this.c.i()));
            }
            return this.c.a(g2.b());
        }
        catch (p var3_4) {
            return null;
        }
        catch (j var3_5) {
            throw new RuntimeException(var3_5);
        }
        catch (Throwable var3_6) {
            this.a.b("Unfortunately, an error has occurred while processing " + string + ". Please copy your build logs and the jar containing this class and visit https://www.growingio.com, thanks!\n" + var3_6.getMessage(), var3_6);
            return new b(arrby, false);
        }
    }

    static /* synthetic */ boolean a(T t2) {
        return t2.a();
    }

    static /* synthetic */ boolean b(T t2) {
        return t2.e;
    }

    static /* synthetic */ boolean a(T t2, boolean bl2) {
        t2.e = bl2;
        return t2.e;
    }

    static /* synthetic */ k c(T t2) {
        return t2.c;
    }

    static /* synthetic */ b a(T t2, byte[] arrby) {
        return t2.a(arrby);
    }

    static /* synthetic */ boolean b(T t2, boolean bl2) {
        t2.g = bl2;
        return t2.g;
    }

    static /* synthetic */ boolean d(T t2) {
        return t2.g;
    }

    static /* synthetic */ String e(T t2) {
        return t2.f;
    }
}

