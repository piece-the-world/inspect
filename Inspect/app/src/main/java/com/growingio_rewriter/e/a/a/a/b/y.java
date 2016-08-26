/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.b;

import com.growingio.e.a.a.a.b.a;
import com.growingio.e.a.a.a.q;
import java.io.File;
import java.io.Serializable;
import java.util.List;

public class y
extends a
implements Serializable {
    private static final long a = -5037645902506953517L;
    private final String[] b;

    public y(String string) {
        if (string == null) {
            throw new IllegalArgumentException("The wildcard must not be null");
        }
        this.b = new String[]{string};
    }

    public y(String[] arrstring) {
        if (arrstring == null) {
            throw new IllegalArgumentException("The wildcard array must not be null");
        }
        this.b = new String[arrstring.length];
        System.arraycopy(arrstring, 0, this.b, 0, arrstring.length);
    }

    public y(List<String> list) {
        if (list == null) {
            throw new IllegalArgumentException("The wildcard list must not be null");
        }
        this.b = list.toArray(new String[list.size()]);
    }

    @Override
    public boolean accept(File file, String string) {
        if (file != null && new File(file, string).isDirectory()) {
            return false;
        }
        for (String string2 : this.b) {
            if (!q.h(string, string2)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean accept(File file) {
        if (file.isDirectory()) {
            return false;
        }
        for (String string : this.b) {
            if (!q.h(file.getName(), string)) continue;
            return true;
        }
        return false;
    }
}

