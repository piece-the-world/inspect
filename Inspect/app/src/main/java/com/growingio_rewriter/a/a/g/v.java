/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.g;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.fh;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.g.r;
import com.growingio.a.a.g.w;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class v {
    private v() {
    }

    public static boolean a(r<?> r2) {
        aU.a(r2.b(), (Object)"isCyclic() currently only works on directed graphs");
        HashMap<Object, w> hashMap = ii.c();
        for (Object obj : r2.a()) {
            if (hashMap.get(obj) != null || !v.a(r2, hashMap, obj)) continue;
            return true;
        }
        return false;
    }

    private static boolean a(r<?> r2, Map<Object, w> map, Object object) {
        map.put(object, w.a);
        for (Object obj : r2.c(object)) {
            w w2 = map.get(obj);
            if (w2 == w.a) {
                return true;
            }
            if (w2 != null || !v.a(r2, map, obj)) continue;
            return true;
        }
        map.put(object, w.b);
        return false;
    }

    public static <N> fg<N> b(r<N> r2) {
        fh<N> fh2 = fg.l();
        for (N n2 : r2.a()) {
            if (!r2.b(n2).isEmpty()) continue;
            fh2.c(n2);
        }
        return fh2.b();
    }
}

