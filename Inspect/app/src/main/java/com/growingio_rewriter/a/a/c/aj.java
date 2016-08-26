/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  com.growingio.a.a.c.O.com.growingio.a.a.c.R
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.O;
import com.growingio.a.a.c.R;
import com.growingio.a.a.c.ai;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;

final class aj
extends com.growingio.a.a.c.O.com.growingio.a.a.c.R<K> {
    final /* synthetic */ O c;

    aj(ConcurrentMap<?, ?> var1_1) {
        this.c = var1_1;
        super((O)var1_1, concurrentMap);
    }

    public Iterator<K> iterator() {
        return new ai(this.c);
    }

    public boolean contains(Object object) {
        return this.a.containsKey(object);
    }

    public boolean remove(Object object) {
        return this.a.remove(object) != null;
    }
}

