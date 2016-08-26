/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aC;
import com.growingio.a.a.b.aD;
import com.growingio.a.a.b.aG;
import com.growingio.a.a.b.aU;
import java.io.IOException;
import java.util.Iterator;

class aE
extends aC {
    final /* synthetic */ aC a;

    aE(aC aC2, aC aC3) {
        this.a = aC2;
        super(aC3, null);
    }

    @Override
    public <A extends Appendable> A a(A a2, Iterator<?> iterator) throws IOException {
        Object obj;
        aU.a(a2, (Object)"appendable");
        aU.a(iterator, (Object)"parts");
        while (iterator.hasNext()) {
            obj = iterator.next();
            if (obj == null) continue;
            a2.append(this.a.a(obj));
            break;
        }
        while (iterator.hasNext()) {
            obj = iterator.next();
            if (obj == null) continue;
            a2.append(aC.a(this.a));
            a2.append(this.a.a(obj));
        }
        return a2;
    }

    @Override
    public aC b(String string) {
        throw new UnsupportedOperationException("already specified skipNulls");
    }

    @Override
    public aG c(String string) {
        throw new UnsupportedOperationException("can't use .skipNulls() with maps");
    }
}

