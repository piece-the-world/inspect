/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.a;

import com.growingio.d.a.a.q;
import java.util.Collections;
import java.util.Map;

public class z
extends q {
    private final Map<String, String> a;

    public z(Map<String, String> map) {
        this.a = map;
    }

    public z(String string, String string2) {
        this.a = Collections.singletonMap(string, string2);
    }

    @Override
    public String a(String string, String string2, String string3) {
        String string4 = this.d(string + '.' + string2 + string3);
        return string4 == null ? string2 : string4;
    }

    @Override
    public String a(String string, String string2) {
        String string3 = this.d("" + '.' + string + string2);
        return string3 == null ? string : string3;
    }

    @Override
    public String b(String string, String string2, String string3) {
        String string4 = this.d(string + '.' + string2);
        return string4 == null ? string2 : string4;
    }

    @Override
    public String d(String string) {
        return this.a.get(string);
    }
}

