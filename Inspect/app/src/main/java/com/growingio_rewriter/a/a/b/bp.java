/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.bB;
import com.growingio.a.a.b.bq;
import com.growingio.a.a.b.bs;
import com.growingio.a.a.b.bu;
import com.growingio.a.a.b.bw;
import com.growingio.a.a.b.by;
import com.growingio.a.a.b.bz;
import com.growingio.a.a.b.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class bp {
    private final m a;
    private final boolean b;
    private final bB c;
    private final int d;

    private bp(bB bB2) {
        this(bB2, false, m.b(), Integer.MAX_VALUE);
    }

    private bp(bB bB2, boolean bl2, m m2, int n2) {
        this.c = bB2;
        this.b = bl2;
        this.a = m2;
        this.d = n2;
    }

    public static bp a(char c2) {
        return bp.a(m.a(c2));
    }

    public static bp a(m m2) {
        aU.a(m2);
        return new bp(new bq(m2));
    }

    public static bp a(String string) {
        aU.a(string.length() != 0, (Object)"The separator may not be the empty string.");
        if (string.length() == 1) {
            return bp.a(string.charAt(0));
        }
        return new bp(new bs(string));
    }

    public static bp a(Pattern pattern) {
        aU.a(pattern);
        aU.a(!pattern.matcher("").matches(), "The pattern may not match the empty string: %s", (Object)pattern);
        return new bp(new bu(pattern));
    }

    public static bp b(String string) {
        return bp.a(Pattern.compile(string));
    }

    public static bp a(int n2) {
        aU.a(n2 > 0, (Object)"The length may not be less than 1");
        return new bp(new bw(n2));
    }

    public bp a() {
        return new bp(this.c, true, this.a, this.d);
    }

    public bp b(int n2) {
        aU.a(n2 > 0, "must be greater than zero: %s", n2);
        return new bp(this.c, this.b, this.a, n2);
    }

    public bp b() {
        return this.b(m.c());
    }

    public bp b(m m2) {
        aU.a(m2);
        return new bp(this.c, this.b, m2, this.d);
    }

    public Iterable<String> a(CharSequence charSequence) {
        aU.a(charSequence);
        return new by(this, charSequence);
    }

    private Iterator<String> c(CharSequence charSequence) {
        return this.c.b(this, charSequence);
    }

    public List<String> b(CharSequence charSequence) {
        aU.a(charSequence);
        Iterator<String> iterator = this.c(charSequence);
        ArrayList<String> arrayList = new ArrayList<String>();
        while (iterator.hasNext()) {
            arrayList.add(iterator.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public bz c(String string) {
        return this.a(bp.a(string));
    }

    public bz b(char c2) {
        return this.a(bp.a(c2));
    }

    public bz a(bp bp2) {
        return new bz(this, bp2, null);
    }

    static /* synthetic */ Iterator a(bp bp2, CharSequence charSequence) {
        return bp2.c(charSequence);
    }

    static /* synthetic */ m b(bp bp2) {
        return bp2.a;
    }

    static /* synthetic */ boolean c(bp bp2) {
        return bp2.b;
    }

    static /* synthetic */ int d(bp bp2) {
        return bp2.d;
    }
}

