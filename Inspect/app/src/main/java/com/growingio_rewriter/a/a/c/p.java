/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.c.l;
import com.growingio.a.a.c.y;
import java.util.concurrent.TimeUnit;

abstract class p
implements y {
    p() {
    }

    protected abstract void a(l var1, long var2, TimeUnit var4);

    @Override
    public void a(l l2, String string, String string2) {
        aU.a(string2 != null && !string2.isEmpty(), "value of key %s omitted", (Object)string);
        try {
            TimeUnit timeUnit;
            char c2 = string2.charAt(string2.length() - 1);
            switch (c2) {
                case 'd': {
                    timeUnit = TimeUnit.DAYS;
                    break;
                }
                case 'h': {
                    timeUnit = TimeUnit.HOURS;
                    break;
                }
                case 'm': {
                    timeUnit = TimeUnit.MINUTES;
                    break;
                }
                case 's': {
                    timeUnit = TimeUnit.SECONDS;
                    break;
                }
                default: {
                    throw new IllegalArgumentException(l.a("key %s invalid format.  was %s, must end with one of [dDhHmMsS]", new Object[]{string, string2}));
                }
            }
            long l3 = Long.parseLong(string2.substring(0, string2.length() - 1));
            this.a(l2, l3, timeUnit);
        }
        catch (NumberFormatException var4_5) {
            throw new IllegalArgumentException(l.a("key %s value set to %s, must be integer", new Object[]{string, string2}));
        }
    }
}

