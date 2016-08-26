/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.h.a;

import java.util.Comparator;
import java.util.Map;

final class h
implements Comparator {
    h() {
    }

    public int compare(Object object, Object object2) {
        Map.Entry entry = (Map.Entry)object;
        Map.Entry entry2 = (Map.Entry)object2;
        String string = (String)entry.getKey();
        String string2 = (String)entry2.getKey();
        return string.compareTo(string2);
    }
}

