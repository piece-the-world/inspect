/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.d.a;

import com.growingio.a.a.b.aC;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.ek;
import com.growingio.a.a.d.gO;
import com.growingio.a.d.a.b;
import java.util.List;

final class c {
    private static final aC a = aC.a("");

    c() {
    }

    static ei<String, b> a(CharSequence charSequence) {
        ek<String, b> ek2 = ei.j();
        int n2 = charSequence.length();
        for (int i2 = 0; i2 < n2; i2 += c.a(gO.<CharSequence>b(), (CharSequence)charSequence.subSequence((int)i2, (int)n2), ek2)) {
        }
        return ek2.b();
    }

    private static int a(List<CharSequence> list, CharSequence charSequence, ek<String, b> ek2) {
        String string;
        int n2;
        int n3 = charSequence.length();
        char c2 = '\u0000';
        for (n2 = 0; n2 < n3 && (c2 = charSequence.charAt(n2)) != '&' && c2 != '?' && c2 != '!' && c2 != ':' && c2 != ','; ++n2) {
        }
        list.add(0, c.b(charSequence.subSequence(0, n2)));
        if ((c2 == '!' || c2 == '?' || c2 == ':' || c2 == ',') && (string = a.a(list)).length() > 0) {
            ek2.b(string, b.a(c2));
        }
        ++n2;
        if (c2 != '?' && c2 != ',') {
            while (n2 < n3) {
                if (charSequence.charAt(n2 += c.a(list, charSequence.subSequence(n2, n3), ek2)) != '?' && charSequence.charAt(n2) != ',') continue;
                ++n2;
                break;
            }
        }
        list.remove(0);
        return n2;
    }

    private static CharSequence b(CharSequence charSequence) {
        return new StringBuilder(charSequence).reverse();
    }
}

