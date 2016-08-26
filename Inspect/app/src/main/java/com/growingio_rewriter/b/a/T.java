/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.V;
import com.growingio.b.ae;
import com.growingio.b.g;
import com.growingio.b.o;
import java.util.Map;

public class T {
    public static String a(String string) {
        return string.replace('.', '/');
    }

    public static String b(String string) {
        return string.replace('/', '.');
    }

    public static String a(o o2) {
        if (o2.b()) {
            return T.b(o2);
        }
        return T.a(o2.s());
    }

    public static String c(String string) {
        String string2;
        int n2 = 0;
        int n3 = 0;
        char c2 = string.charAt(0);
        while (c2 == '[') {
            ++n2;
            c2 = string.charAt(++n3);
        }
        if (c2 == 'L') {
            int n4 = string.indexOf(59, n3++);
            string2 = string.substring(n3, n4).replace('/', '.');
            n3 = n4;
        } else if (c2 == 'V') {
            string2 = "void";
        } else if (c2 == 'I') {
            string2 = "int";
        } else if (c2 == 'B') {
            string2 = "byte";
        } else if (c2 == 'J') {
            string2 = "long";
        } else if (c2 == 'D') {
            string2 = "double";
        } else if (c2 == 'F') {
            string2 = "float";
        } else if (c2 == 'C') {
            string2 = "char";
        } else if (c2 == 'S') {
            string2 = "short";
        } else if (c2 == 'Z') {
            string2 = "boolean";
        } else {
            throw new RuntimeException("bad descriptor: " + string);
        }
        if (n3 + 1 != string.length()) {
            throw new RuntimeException("multiple descriptors?: " + string);
        }
        if (n2 == 0) {
            return string2;
        }
        StringBuffer stringBuffer = new StringBuffer(string2);
        do {
            stringBuffer.append("[]");
        } while (--n2 > 0);
        return stringBuffer.toString();
    }

    public static String d(String string) {
        if (string.equals("void")) {
            return "V";
        }
        if (string.equals("int")) {
            return "I";
        }
        if (string.equals("byte")) {
            return "B";
        }
        if (string.equals("long")) {
            return "J";
        }
        if (string.equals("double")) {
            return "D";
        }
        if (string.equals("float")) {
            return "F";
        }
        if (string.equals("char")) {
            return "C";
        }
        if (string.equals("short")) {
            return "S";
        }
        if (string.equals("boolean")) {
            return "Z";
        }
        return "L" + T.a(string) + ";";
    }

    public static String a(String string, String string2, String string3) {
        int n2;
        if (string.indexOf(string2) < 0) {
            return string;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int n3 = 0;
        int n4 = 0;
        while ((n2 = string.indexOf(76, n4)) >= 0) {
            if (string.startsWith(string2, n2 + 1) && string.charAt(n2 + string2.length() + 1) == ';') {
                stringBuffer.append(string.substring(n3, n2));
                stringBuffer.append('L');
                stringBuffer.append(string3);
                stringBuffer.append(';');
                n3 = n4 = n2 + string2.length() + 2;
                continue;
            }
            n4 = string.indexOf(59, n2) + 1;
            if (n4 >= 1) continue;
            break;
        }
        if (n3 == 0) {
            return string;
        }
        n2 = string.length();
        if (n3 < n2) {
            stringBuffer.append(string.substring(n3, n2));
        }
        return stringBuffer.toString();
    }

    public static String a(String string, Map map) {
        int n2;
        int n3;
        if (map == null) {
            return string;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int n4 = 0;
        int n5 = 0;
        while ((n2 = string.indexOf(76, n5)) >= 0 && (n3 = string.indexOf(59, n2)) >= 0) {
            n5 = n3 + 1;
            String string2 = string.substring(n2 + 1, n3);
            String string3 = (String)map.get(string2);
            if (string3 == null) continue;
            stringBuffer.append(string.substring(n4, n2));
            stringBuffer.append('L');
            stringBuffer.append(string3);
            stringBuffer.append(';');
            n4 = n5;
        }
        if (n4 == 0) {
            return string;
        }
        n2 = string.length();
        if (n4 < n2) {
            stringBuffer.append(string.substring(n4, n2));
        }
        return stringBuffer.toString();
    }

    public static String b(o o2) {
        StringBuffer stringBuffer = new StringBuffer();
        T.a(stringBuffer, o2);
        return stringBuffer.toString();
    }

    private static void a(StringBuffer stringBuffer, o o2) {
        if (o2.b()) {
            stringBuffer.append('[');
            try {
                T.a(stringBuffer, o2.e());
            }
            catch (ae var2_2) {
                stringBuffer.append('L');
                String string = o2.s();
                stringBuffer.append(T.a(string.substring(0, string.length() - 2)));
                stringBuffer.append(';');
            }
        } else if (o2.r()) {
            V v2 = (V)o2;
            stringBuffer.append(v2.X());
        } else {
            stringBuffer.append('L');
            stringBuffer.append(o2.s().replace('.', '/'));
            stringBuffer.append(';');
        }
    }

    public static String a(o[] arro) {
        return T.a(o.n, arro);
    }

    public static String a(o o2, o[] arro) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        if (arro != null) {
            int n2 = arro.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                T.a(stringBuffer, arro[i2]);
            }
        }
        stringBuffer.append(')');
        if (o2 != null) {
            T.a(stringBuffer, o2);
        }
        return stringBuffer.toString();
    }

    public static String b(o[] arro) {
        return T.a(null, arro);
    }

    public static String a(String string, String string2) {
        int n2 = string2.indexOf(41);
        if (n2 < 0) {
            return string2;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(string2.substring(0, n2));
        stringBuffer.append('L');
        stringBuffer.append(string.replace('.', '/'));
        stringBuffer.append(';');
        stringBuffer.append(string2.substring(n2));
        return stringBuffer.toString();
    }

    public static String b(String string, String string2) {
        if (string2.charAt(0) != '(') {
            return string2;
        }
        return "(L" + string.replace('.', '/') + ';' + string2.substring(1);
    }

    public static String a(o o2, String string) {
        int n2 = string.indexOf(41);
        if (n2 < 0) {
            return string;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(string.substring(0, n2));
        T.a(stringBuffer, o2);
        stringBuffer.append(string.substring(n2));
        return stringBuffer.toString();
    }

    public static String b(o o2, String string) {
        if (string.charAt(0) != '(') {
            return string;
        }
        return "(" + T.b(o2) + string.substring(1);
    }

    public static String c(String string, String string2) {
        int n2 = string2.indexOf(41);
        if (n2 < 0) {
            return string2;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(string2.substring(0, n2 + 1));
        stringBuffer.append('L');
        stringBuffer.append(string.replace('.', '/'));
        stringBuffer.append(';');
        return stringBuffer.toString();
    }

    public static o[] a(String string, g g2) throws ae {
        if (string.charAt(0) != '(') {
            return null;
        }
        int n2 = T.f(string);
        o[] arro = new o[n2];
        int n3 = 0;
        int n4 = 1;
        while ((n4 = T.a(g2, string, n4, arro, n3++)) > 0) {
        }
        return arro;
    }

    public static boolean d(String string, String string2) {
        if (string.charAt(0) != '(') {
            return false;
        }
        int n2 = 0;
        char c2;
        while ((c2 = string.charAt(n2)) == string2.charAt(n2)) {
            if (c2 == ')') {
                return true;
            }
            ++n2;
        }
        return false;
    }

    public static String e(String string) {
        return string.substring(0, string.indexOf(41) + 1);
    }

    public static o b(String string, g g2) throws ae {
        int n2 = string.indexOf(41);
        if (n2 < 0) {
            return null;
        }
        o[] arro = new o[1];
        T.a(g2, string, n2 + 1, arro, 0);
        return arro[0];
    }

    public static int f(String string) {
        char c2;
        int n2 = 0;
        int n3 = 1;
        while ((c2 = string.charAt(n3)) != ')') {
            while (c2 == '[') {
                c2 = string.charAt(++n3);
            }
            if (c2 == 'L') {
                if ((n3 = string.indexOf(59, n3) + 1) <= 0) {
                    throw new IndexOutOfBoundsException("bad descriptor");
                }
            } else {
                ++n3;
            }
            ++n2;
        }
        return n2;
    }

    public static o c(String string, g g2) throws ae {
        o[] arro = new o[1];
        int n2 = T.a(g2, string, 0, arro, 0);
        if (n2 >= 0) {
            return arro[0];
        }
        return g2.f(string.replace('/', '.'));
    }

    private static int a(g g2, String string, int n2, o[] arro, int n3) throws ae {
        String string2;
        Object object;
        int n4;
        int n5 = 0;
        char c2 = string.charAt(n2);
        while (c2 == '[') {
            ++n5;
            c2 = string.charAt(++n2);
        }
        if (c2 == 'L') {
            n4 = string.indexOf(59, ++n2);
            string2 = string.substring(n2, n4++).replace('/', '.');
        } else {
            object = T.a(c2);
            if (object == null) {
                return -1;
            }
            n4 = n2 + 1;
            if (n5 == 0) {
                arro[n3] = object;
                return n4;
            }
            string2 = object.s();
        }
        if (n5 > 0) {
            object = new StringBuffer(string2);
            while (n5-- > 0) {
                object.append("[]");
            }
            string2 = object.toString();
        }
        arro[n3] = g2.f(string2);
        return n4;
    }

    static o a(char c2) {
        o o2 = null;
        switch (c2) {
            case 'Z': {
                o2 = o.f;
                break;
            }
            case 'C': {
                o2 = o.g;
                break;
            }
            case 'B': {
                o2 = o.h;
                break;
            }
            case 'S': {
                o2 = o.i;
                break;
            }
            case 'I': {
                o2 = o.j;
                break;
            }
            case 'J': {
                o2 = o.k;
                break;
            }
            case 'F': {
                o2 = o.l;
                break;
            }
            case 'D': {
                o2 = o.m;
                break;
            }
            case 'V': {
                o2 = o.n;
            }
        }
        return o2;
    }

    public static int g(String string) {
        int n2 = 0;
        while (string.charAt(n2) == '[') {
            ++n2;
        }
        return n2;
    }

    public static String a(String string, int n2) {
        return string.substring(n2);
    }

    public static int h(String string) {
        return T.a(string, true);
    }

    public static int i(String string) {
        return - T.a(string, false);
    }

    private static int a(String string, boolean bl2) {
        int n2 = 0;
        char c2 = string.charAt(0);
        if (c2 == '(') {
            int n3 = 1;
            do {
                if ((c2 = string.charAt(n3)) == ')') {
                    c2 = string.charAt(n3 + 1);
                    break;
                }
                boolean bl3 = false;
                while (c2 == '[') {
                    bl3 = true;
                    c2 = string.charAt(++n3);
                }
                if (c2 == 'L') {
                    if ((n3 = string.indexOf(59, n3) + 1) <= 0) {
                        throw new IndexOutOfBoundsException("bad descriptor");
                    }
                } else {
                    ++n3;
                }
                if (!(bl3 || c2 != 'J' && c2 != 'D')) {
                    n2 -= 2;
                    continue;
                }
                --n2;
            } while (true);
        }
        if (bl2) {
            if (c2 == 'J' || c2 == 'D') {
                n2 += 2;
            } else if (c2 != 'V') {
                ++n2;
            }
        }
        return n2;
    }

    public static String j(String string) {
        return com.growingio.b.a.V.a(string);
    }
}

