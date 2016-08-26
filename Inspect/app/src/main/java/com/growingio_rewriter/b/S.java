/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.P;
import com.growingio.b.a.af;
import com.growingio.b.a.h;
import com.growingio.b.a.p;
import com.growingio.b.ae;
import com.growingio.b.g;
import com.growingio.b.o;

class S
extends P {
    S(String string, g g2, boolean bl2, o o2) {
        super(string, g2, bl2, o2);
    }

    @Override
    public void a(int n2) {
        super.a(n2 &= -9);
        S.a(n2, this.s(), this, true);
    }

    private static void a(int n2, String string, o o2, boolean bl2) {
        p p2 = o2.j();
        af af2 = (af)p2.e("InnerClasses");
        if (af2 == null) {
            return;
        }
        int n3 = af2.a();
        for (int i2 = 0; i2 < n3; ++i2) {
            if (!string.equals(af2.b(i2))) continue;
            int n4 = af2.g(i2) & 8;
            af2.d(i2, n2 | n4);
            String string2 = af2.d(i2);
            if (string2 == null || !bl2) break;
            try {
                o o3 = o2.a().f(string2);
                S.a(n2, string, o3, false);
                break;
            }
            catch (ae var10_11) {
                throw new RuntimeException("cannot find the declaring class: " + string2);
            }
        }
    }
}

