/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.bp;
import com.growingio.a.a.b.bq;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class bz {
    private static final String a = "Chunk [%s] is not a valid entry";
    private final bp b;
    private final bp c;

    private bz(bp bp2, bp bp3) {
        this.b = bp2;
        this.c = aU.a(bp3);
    }

    public Map<String, String> a(CharSequence charSequence) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        for (String string : this.b.a(charSequence)) {
            Iterator iterator = bp.a(this.c, string);
            aU.a(iterator.hasNext(), "Chunk [%s] is not a valid entry", (Object)string);
            String string2 = (String)iterator.next();
            aU.a(!linkedHashMap.containsKey(string2), "Duplicate key [%s] found.", (Object)string2);
            aU.a(iterator.hasNext(), "Chunk [%s] is not a valid entry", (Object)string);
            String string3 = (String)iterator.next();
            linkedHashMap.put(string2, string3);
            aU.a(!iterator.hasNext(), "Chunk [%s] is not a valid entry", (Object)string);
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    /* synthetic */ bz(bp bp2, bp bp3, bq bq2) {
        this(bp2, bp3);
    }
}

