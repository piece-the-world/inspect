/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.ai;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class am
implements ai {
    private byte[] a;
    private TreeMap b = new TreeMap(String.CASE_INSENSITIVE_ORDER);

    @Override
    public Iterator c() {
        return Collections.unmodifiableSet(this.b.keySet()).iterator();
    }

    @Override
    public String a(String string) {
        String string2 = (String)this.b.get(string);
        if (string2 == null) {
            return "";
        }
        return string2;
    }

    @Override
    public byte[] d() {
        return this.a;
    }

    @Override
    public void setContent(byte[] arrby) {
        this.a = arrby;
    }

    @Override
    public void a(String string, String string2) {
        this.b.put(string, string2);
    }

    @Override
    public boolean b(String string) {
        return this.b.containsKey(string);
    }
}

