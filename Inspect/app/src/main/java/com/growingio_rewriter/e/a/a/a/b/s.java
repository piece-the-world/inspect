/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.b;

import com.growingio.e.a.a.a.b.a;
import java.io.File;
import java.io.Serializable;
import java.util.List;

public class s
extends a
implements Serializable {
    private static final long a = 8533897440809599867L;
    private final String[] b;
    private final com.growingio.e.a.a.a.s c;

    public s(String string) {
        this(string, com.growingio.e.a.a.a.s.a);
    }

    public s(String string, com.growingio.e.a.a.a.s s2) {
        if (string == null) {
            throw new IllegalArgumentException("The prefix must not be null");
        }
        this.b = new String[]{string};
        this.c = s2 == null ? com.growingio.e.a.a.a.s.a : s2;
    }

    public s(String[] arrstring) {
        this(arrstring, com.growingio.e.a.a.a.s.a);
    }

    public s(String[] arrstring, com.growingio.e.a.a.a.s s2) {
        if (arrstring == null) {
            throw new IllegalArgumentException("The array of prefixes must not be null");
        }
        this.b = new String[arrstring.length];
        System.arraycopy(arrstring, 0, this.b, 0, arrstring.length);
        this.c = s2 == null ? com.growingio.e.a.a.a.s.a : s2;
    }

    public s(List<String> list) {
        this(list, com.growingio.e.a.a.a.s.a);
    }

    public s(List<String> list, com.growingio.e.a.a.a.s s2) {
        if (list == null) {
            throw new IllegalArgumentException("The list of prefixes must not be null");
        }
        this.b = list.toArray(new String[list.size()]);
        this.c = s2 == null ? com.growingio.e.a.a.a.s.a : s2;
    }

    @Override
    public boolean accept(File file) {
        String string = file.getName();
        for (String string2 : this.b) {
            if (!this.c.c(string, string2)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean accept(File file, String string) {
        for (String string2 : this.b) {
            if (!this.c.c(string, string2)) continue;
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

