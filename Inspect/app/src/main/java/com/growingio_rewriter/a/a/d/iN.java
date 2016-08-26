/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aW;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.iM;
import com.growingio.a.a.d.iX;
import com.growingio.a.a.d.ii;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;

class iN
extends iX<K, V> {
    final /* synthetic */ iM a;

    iN(iM iM2, NavigableMap navigableMap) {
        this.a = iM2;
        super(navigableMap);
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return gb.a(iM.b(this.a).entrySet().iterator(), aW.a(iM.a(this.a), ii.a(aW.a(collection))));
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return gb.a(iM.b(this.a).entrySet().iterator(), aW.a(iM.a(this.a), ii.a(aW.a(aW.a(collection)))));
    }
}

