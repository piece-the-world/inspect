/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.eu;
import java.util.HashMap;

class dw {
    dw() {
    }

    static String a(String string, String string2) {
        String string3 = string2;
        if (eu.b.a().f.size() != 0 && eu.b.a().f.containsKey(string)) {
            string3 = (String)eu.b.a().f.get(string);
        }
        return string3;
    }

    static HashMap a() {
        return eu.b.a().f;
    }
}

