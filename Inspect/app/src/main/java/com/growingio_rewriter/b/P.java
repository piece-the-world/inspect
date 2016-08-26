/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.Q;
import com.growingio.b.a.p;
import com.growingio.b.ad;
import com.growingio.b.ae;
import com.growingio.b.b;
import com.growingio.b.g;
import com.growingio.b.o;
import com.growingio.b.r;
import com.growingio.b.s;
import java.io.DataOutputStream;
import java.io.IOException;

class P
extends r {
    protected boolean u;

    P(String string, g g2, boolean bl2, o o2) {
        super(string, g2);
        this.p = true;
        String string2 = bl2 || o2 == null ? null : o2.s();
        this.s = new p(bl2, string, string2);
        if (bl2 && o2 != null) {
            this.s.a(new String[]{o2.s()});
        }
        this.a(ad.p(this.c()));
        this.u = bl2;
    }

    @Override
    protected void a(StringBuffer stringBuffer) {
        if (this.u) {
            stringBuffer.append("hasConstructor ");
        }
        super.a(stringBuffer);
    }

    @Override
    public void a(s s2) throws b {
        this.u = true;
        super.a(s2);
    }

    @Override
    public void a(DataOutputStream dataOutputStream) throws b, IOException {
        if (!this.u) {
            try {
                this.ab();
                this.u = true;
            }
            catch (ae var2_2) {
                throw new b(var2_2);
            }
        }
        super.a(dataOutputStream);
    }

    public void ab() throws b, ae {
        o o2 = this.f();
        s[] arrs = o2.K();
        int n2 = 0;
        for (int i2 = 0; i2 < arrs.length; ++i2) {
            s s2 = arrs[i2];
            int n3 = s2.d();
            if (!this.a(n3, o2)) continue;
            s s3 = Q.b(s2.i(), s2.m(), this);
            s3.a(n3 & 7);
            this.a(s3);
            ++n2;
        }
        if (n2 < 1) {
            throw new b("no inheritable constructor in " + o2.s());
        }
    }

    private boolean a(int n2, o o2) {
        if (ad.b(n2)) {
            return false;
        }
        if (ad.d(n2)) {
            String string = this.u();
            String string2 = o2.u();
            if (string == null) {
                return string2 == null;
            }
            return string.equals(string2);
        }
        return true;
    }
}

