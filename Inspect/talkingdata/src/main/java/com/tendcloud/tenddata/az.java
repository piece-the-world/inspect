/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import java.util.List;
import java.util.Map;

public class az {
    public static boolean a(String string) {
        if (string == null || string.length() == 0) {
            return true;
        }
        return false;
    }

    public static boolean a(List list) {
        if (list == null || list.size() == 0) {
            return true;
        }
        return false;
    }

    public static boolean a(Map map) {
        if (map == null) {
            return true;
        }
        return false;
    }

    public static boolean a(Object object) {
        if (object == null) {
            return true;
        }
        return false;
    }
}

