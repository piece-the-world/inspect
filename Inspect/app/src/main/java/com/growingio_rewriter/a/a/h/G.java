/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.h.aC;
import com.growingio.a.a.h.x;

final class G
extends Enum<G>
implements x<CharSequence> {
    public static final /* enum */ G a = new G();
    private static final /* synthetic */ G[] b;

    public static G[] a() {
        return (G[])b.clone();
    }

    public static G a(String string) {
        return (G)Enum.valueOf(G.class, string);
    }

    private G() {
        super(string, n2);
    }

    @Override
    public void a(CharSequence charSequence, aC aC2) {
        aC2.b(charSequence);
    }

    public String toString() {
        return "Funnels.unencodedCharsFunnel()";
    }

    static {
        b = new G[]{a};
    }
}

