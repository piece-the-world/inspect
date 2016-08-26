/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.f;

import com.growingio.a.a.f.m;
import com.growingio.a.a.f.s;
import com.growingio.a.a.f.t;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

final class n
implements t {
    static final n a = new n();

    n() {
    }

    @Override
    public void a(Throwable throwable, s s2) {
        Logger logger = n.a(s2);
        if (logger.isLoggable(Level.SEVERE)) {
            logger.log(Level.SEVERE, n.b(s2), throwable);
        }
    }

    private static Logger a(s s2) {
        return Logger.getLogger(m.class.getName() + "." + s2.a().a());
    }

    private static String b(s s2) {
        Method method = s2.d();
        return "Exception thrown by subscriber method " + method.getName() + '(' + method.getParameterTypes()[0].getName() + ')' + " on subscriber " + s2.c() + " when dispatching event: " + s2.b();
    }
}

