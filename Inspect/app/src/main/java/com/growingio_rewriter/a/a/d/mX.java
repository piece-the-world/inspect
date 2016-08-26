/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  com.growingio.a.a.d.mE.com.growingio.a.a.d.mZ
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aL;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.mE;
import com.growingio.a.a.d.mE.com.growingio.a.a.d.mZ;
import com.growingio.a.a.d.mF;
import com.growingio.a.a.d.mW;
import com.growingio.a.a.d.mY;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class mX
extends mZ<Map.Entry<R, Map<C, V>>> {
    final /* synthetic */ mW a;

    mX(mW mW2) {
        this.a = mW2;
        super(mW2.b, null);
    }

    public Iterator<Map.Entry<R, Map<C, V>>> iterator() {
        return ii.b(this.a.b.a.keySet(), new mY(this));
    }

    public int size() {
        return this.a.b.a.size();
    }

    public boolean contains(Object object) {
        if (object instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry)object;
            return entry.getKey() != null && entry.getValue() instanceof Map && aL.a(this.a.b.a.entrySet(), entry);
        }
        return false;
    }

    public boolean remove(Object object) {
        if (object instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry)object;
            return entry.getKey() != null && entry.getValue() instanceof Map && this.a.b.a.entrySet().remove(entry);
        }
        return false;
    }
}

