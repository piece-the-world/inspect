/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.eS;
import com.growingio.a.a.d.eV;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.kW;
import com.growingio.a.a.d.oP;
import java.io.Serializable;
import java.util.Map;

class eW<K extends Comparable<?>, V>
implements Serializable {
    private final ei<kW<K>, V> a;
    private static final long b = 0;

    eW(ei<kW<K>, V> ei2) {
        this.a = ei2;
    }

    Object a() {
        if (this.a.isEmpty()) {
            return eS.a();
        }
        return this.b();
    }

    Object b() {
        eV eV2 = new eV();
        oP<Map.Entry<kW<K>, V>> oP2 = this.a.k().k_();
        while (oP2.hasNext()) {
            Map.Entry<kW<K>, V> entry = oP2.next();
            eV2.a(entry.getKey(), entry.getValue());
        }
        return eV2.a();
    }
}

