/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.bg;
import com.growingio.a.a.c.bj;
import com.growingio.a.a.c.bk;
import java.util.concurrent.Executor;

final class bi
implements bg<K, V> {
    final /* synthetic */ Executor a;
    final /* synthetic */ bg b;

    bi(Executor executor, bg bg2) {
        this.a = executor;
        this.b = bg2;
    }

    @Override
    public void a(bk<K, V> bk2) {
        this.a.execute(new bj(this, bk2));
    }
}

