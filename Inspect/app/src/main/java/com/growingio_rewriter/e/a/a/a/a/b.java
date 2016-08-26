/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.a;

import com.growingio.e.a.a.a.a.a;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class b
extends a
implements Serializable {
    private static final long a = -2224170307287243428L;
    private static final Comparator<?>[] b = new Comparator[0];
    private final Comparator<File>[] c;

    public /* varargs */ b(Comparator<File> ... arrcomparator) {
        if (arrcomparator == null) {
            this.c = b;
        } else {
            this.c = new Comparator[arrcomparator.length];
            System.arraycopy(arrcomparator, 0, this.c, 0, arrcomparator.length);
        }
    }

    public b(Iterable<Comparator<File>> iterable) {
        if (iterable == null) {
            this.c = b;
        } else {
            ArrayList<Comparator<File>> arrayList = new ArrayList<Comparator<File>>();
            for (Comparator<File> comparator : iterable) {
                arrayList.add(comparator);
            }
            this.c = arrayList.toArray(new Comparator[arrayList.size()]);
        }
    }

    public int a(File file, File file2) {
        Comparator<File> comparator;
        int n2 = 0;
        Comparator<File>[] arrcomparator = this.c;
        int n3 = arrcomparator.length;
        for (int i2 = 0; i2 < n3 && (n2 = (comparator = arrcomparator[i2]).compare(file, file2)) == 0; ++i2) {
        }
        return n2;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append('{');
        for (int i2 = 0; i2 < this.c.length; ++i2) {
            if (i2 > 0) {
                stringBuilder.append(',');
            }
            stringBuilder.append(this.c[i2]);
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((File)object, (File)object2);
    }
}

