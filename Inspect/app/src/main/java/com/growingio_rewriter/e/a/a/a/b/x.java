/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.b;

import com.growingio.e.a.a.a.b.a;
import com.growingio.e.a.a.a.q;
import com.growingio.e.a.a.a.s;
import java.io.File;
import java.io.Serializable;
import java.util.List;

public class x
extends a
implements Serializable {
    private static final long a = -7426486598995782105L;
    private final String[] b;
    private final s c;

    public x(String string) {
        this(string, s.a);
    }

    public x(String string, s s2) {
        if (string == null) {
            throw new IllegalArgumentException("The wildcard must not be null");
        }
        this.b = new String[]{string};
        this.c = s2 == null ? s.a : s2;
    }

    public x(String[] arrstring) {
        this(arrstring, s.a);
    }

    public x(String[] arrstring, s s2) {
        if (arrstring == null) {
            throw new IllegalArgumentException("The wildcard array must not be null");
        }
        this.b = new String[arrstring.length];
        System.arraycopy(arrstring, 0, this.b, 0, arrstring.length);
        this.c = s2 == null ? s.a : s2;
    }

    public x(List<String> list) {
        this(list, s.a);
    }

    public x(List<String> list, s s2) {
        if (list == null) {
            throw new IllegalArgumentException("The wildcard list must not be null");
        }
        this.b = list.toArray(new String[list.size()]);
        this.c = s2 == null ? s.a : s2;
    }

    @Override
    public boolean accept(File file, String string) {
        for (String string2 : this.b) {
            if (!q.a(string, string2, this.c)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean accept(File file) {
        String string = file.getName();
        for (String string2 : this.b) {
            if (!q.a(string, string2, this.c)) continue;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("(");
        if (this.b != null) {
            for (int i2 = 0; i2 < this.b.length; ++i2) {
                if (i2 > 0) {
                    stringBuilder.append(",");
                }
                stringBuilder.append(this.b[i2]);
            }
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

