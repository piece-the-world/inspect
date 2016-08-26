/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.a;

import com.growingio.e.a.a.a.a.a;
import com.growingio.e.a.a.a.a.i;
import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

public class c
extends a
implements Serializable {
    private static final long c = 3260141861365313518L;
    public static final Comparator<File> a = new c();
    public static final Comparator<File> b = new i(a);

    public int a(File file, File file2) {
        return file.compareTo(file2);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((File)object, (File)object2);
    }
}

