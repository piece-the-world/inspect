/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.a;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

abstract class a
implements Comparator<File> {
    a() {
    }

    public /* varargs */ File[] a(File ... arrfile) {
        if (arrfile != null) {
            Arrays.sort(arrfile, this);
        }
        return arrfile;
    }

    public List<File> a(List<File> list) {
        if (list != null) {
            Collections.sort(list, this);
        }
        return list;
    }

    public String toString() {
        return this.getClass().getSimpleName();
    }
}

