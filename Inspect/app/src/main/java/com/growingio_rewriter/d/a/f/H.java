/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.f.a;
import com.growingio.d.a.m;
import com.growingio.d.a.p;
import com.growingio.d.a.r;
import com.growingio.d.a.u;
import java.util.Map;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

public abstract class H {
    final /* synthetic */ a b;

    protected H(a a2) {
        this.b = a2;
    }

    public void a(String string, Attributes attributes) throws SAXException {
    }

    public void a(String string) {
    }

    protected final Object a(String string, String string2) throws SAXException {
        Object object = null;
        if (string2 != null) {
            if ("Ljava/lang/String;".equals(string)) {
                object = this.d(string2);
            } else if ("Ljava/lang/Integer;".equals(string) || "I".equals(string) || "S".equals(string) || "B".equals(string) || "C".equals(string) || "Z".equals(string)) {
                object = new Integer(string2);
            } else if ("Ljava/lang/Short;".equals(string)) {
                object = new Short(string2);
            } else if ("Ljava/lang/Byte;".equals(string)) {
                object = new Byte(string2);
            } else if ("Ljava/lang/Character;".equals(string)) {
                object = new Character(this.d(string2).charAt(0));
            } else if ("Ljava/lang/Boolean;".equals(string)) {
                object = Boolean.valueOf(string2);
            } else if ("Ljava/lang/Long;".equals(string) || "J".equals(string)) {
                object = new Long(string2);
            } else if ("Ljava/lang/Float;".equals(string) || "F".equals(string)) {
                object = new Float(string2);
            } else if ("Ljava/lang/Double;".equals(string) || "D".equals(string)) {
                object = new Double(string2);
            } else if (u.c(u.class).equals(string)) {
                object = u.a(string2);
            } else if (u.c(m.class).equals(string)) {
                object = this.b(string2);
            } else {
                throw new SAXException("Invalid value:" + string2 + " desc:" + string + " ctx:" + this);
            }
        }
        return object;
    }

    m b(String string) throws SAXException {
        try {
            int n2 = string.indexOf(46);
            int n3 = string.indexOf(40, n2 + 1);
            int n4 = string.lastIndexOf(40);
            int n5 = string.indexOf(32, n4 + 1);
            boolean bl2 = n5 != -1;
            int n6 = Integer.parseInt(string.substring(n4 + 1, bl2 ? string.length() - 1 : n5));
            String string2 = string.substring(0, n2);
            String string3 = string.substring(n2 + 1, n3);
            String string4 = string.substring(n3, n4 - 1);
            return new m(n6, string2, string3, string4, bl2);
        }
        catch (RuntimeException var2_3) {
            throw new SAXException("Malformed handle " + string, var2_3);
        }
    }

    private final String d(String string) throws SAXException {
        StringBuilder stringBuilder = new StringBuilder(string.length());
        try {
            for (int i2 = 0; i2 < string.length(); ++i2) {
                char c2 = string.charAt(i2);
                if (c2 == '\\') {
                    if ((c2 = string.charAt(++i2)) == '\\') {
                        stringBuilder.append('\\');
                        continue;
                    }
                    stringBuilder.append((char)Integer.parseInt(string.substring(i2, ++i2 + 4), 16));
                    i2 += 3;
                    continue;
                }
                stringBuilder.append(c2);
            }
        }
        catch (RuntimeException var3_4) {
            throw new SAXException(var3_4);
        }
        return stringBuilder.toString();
    }

    protected final p a(Object object) {
        p p2 = this.b.c.get(object);
        if (p2 == null) {
            p2 = new p();
            this.b.c.put(object, p2);
        }
        return p2;
    }

    protected final r a() {
        return (r)this.b.a();
    }

    protected final int c(String string) {
        int n2 = 0;
        if (string.indexOf("public") != -1) {
            n2 |= true;
        }
        if (string.indexOf("private") != -1) {
            n2 |= 2;
        }
        if (string.indexOf("protected") != -1) {
            n2 |= 4;
        }
        if (string.indexOf("static") != -1) {
            n2 |= 8;
        }
        if (string.indexOf("final") != -1) {
            n2 |= 16;
        }
        if (string.indexOf("super") != -1) {
            n2 |= 32;
        }
        if (string.indexOf("synchronized") != -1) {
            n2 |= 32;
        }
        if (string.indexOf("volatile") != -1) {
            n2 |= 64;
        }
        if (string.indexOf("bridge") != -1) {
            n2 |= 64;
        }
        if (string.indexOf("varargs") != -1) {
            n2 |= 128;
        }
        if (string.indexOf("transient") != -1) {
            n2 |= 128;
        }
        if (string.indexOf("native") != -1) {
            n2 |= 256;
        }
        if (string.indexOf("interface") != -1) {
            n2 |= 512;
        }
        if (string.indexOf("abstract") != -1) {
            n2 |= 1024;
        }
        if (string.indexOf("strict") != -1) {
            n2 |= 2048;
        }
        if (string.indexOf("synthetic") != -1) {
            n2 |= 4096;
        }
        if (string.indexOf("annotation") != -1) {
            n2 |= 8192;
        }
        if (string.indexOf("enum") != -1) {
            n2 |= 16384;
        }
        if (string.indexOf("deprecated") != -1) {
            n2 |= 131072;
        }
        if (string.indexOf("mandated") != -1) {
            n2 |= 32768;
        }
        return n2;
    }
}

