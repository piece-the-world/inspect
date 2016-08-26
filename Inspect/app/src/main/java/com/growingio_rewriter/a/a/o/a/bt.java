/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.bU;
import com.growingio.a.a.o.a.bo;
import com.growingio.a.a.o.a.bp;
import java.util.concurrent.ExecutionException;

final class bt
implements Runnable {
    final /* synthetic */ bU a;
    final /* synthetic */ bo b;

    bt(bU bU2, bo bo2) {
        this.a = bU2;
        this.b = bo2;
    }

    @Override
    public void run() {
        Object v2;
        try {
            v2 = bp.a(this.a);
        }
        catch (ExecutionException var2_2) {
            this.b.a(var2_2.getCause());
            return;
        }
        catch (RuntimeException var2_3) {
            this.b.a(var2_3);
            return;
        }
        catch (Error var2_4) {
            this.b.a(var2_4);
            return;
        }
        this.b.a(v2);
    }
}

