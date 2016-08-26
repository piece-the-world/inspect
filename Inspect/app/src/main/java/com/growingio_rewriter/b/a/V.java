/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.T;
import com.growingio.b.o;

class V {
    V() {
    }

    static String a(String string) {
        StringBuffer stringBuffer = new StringBuffer();
        if (string.charAt(0) == '(') {
            int n2 = 1;
            stringBuffer.append('(');
            while (string.charAt(n2) != ')') {
                if (n2 > 1) {
                    stringBuffer.append(',');
                }
                n2 = V.a(stringBuffer, n2, string);
            }
            stringBuffer.append(')');
        } else {
            V.a(stringBuffer, 0, string);
        }
        return stringBuffer.toString();
    }

    static int a(StringBuffer stringBuffer, int n2, String string) {
        char c2 = string.charAt(n2);
        int n3 = 0;
        while (c2 == '[') {
            ++n3;
            c2 = string.charAt(++n2);
        }
        if (c2 == 'L') {
            while ((c2 = string.charAt(++n2)) != ';') {
                if (c2 == '/') {
                    c2 = '.';
                }
                stringBuffer.append(c2);
            }
        } else {
            o o2 = T.a(c2);
            stringBuffer.append(o2.s());
        }
        while (n3-- > 0) {
            stringBuffer.append("[]");
        }
        return n2 + 1;
    }
}

