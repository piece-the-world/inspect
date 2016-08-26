/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.cV;
import com.growingio.a.a.d.cX;
import com.growingio.a.a.d.iy;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;

public class cW
extends iy<K, V> {
    final /* synthetic */ cV a;

    public cW(cV cV2) {
        this.a = cV2;
    }

    @Override
    NavigableMap<K, V> b() {
        return this.a;
    }

    @Override
    protected Iterator<Map.Entry<K, V>> c() {
        return new cX(this);
    }
}

