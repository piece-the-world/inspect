/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.K;
import com.growingio.b.a.B;
import com.growingio.b.a.Q;
import com.growingio.b.a.as;
import com.growingio.b.a.aw;
import com.growingio.b.a.ay;
import com.growingio.b.a.i;
import com.growingio.b.a.y;
import java.io.PrintStream;

public class ag
implements ay {
    private static final String[] a = aw.a;
    private final PrintStream b;

    public ag(PrintStream printStream) {
        this.b = printStream;
    }

    public static void a(K k2, PrintStream printStream) {
        new ag(printStream).a(k2);
    }

    public void a(K k2) {
        as as2 = k2.c();
        Q q2 = as2.c();
        y y2 = as2.j();
        if (y2 == null) {
            return;
        }
        B b2 = y2.k();
        while (b2.e()) {
            int n2;
            try {
                n2 = b2.f();
            }
            catch (i var7_7) {
                throw new RuntimeException(var7_7);
            }
            this.b.println("" + n2 + ": " + ag.a(b2, n2, q2));
        }
    }

    public static String a(B b2, int n2, Q q2) {
        int n3 = b2.c(n2);
        if (n3 > a.length || n3 < 0) {
            throw new IllegalArgumentException("Invalid opcode, opcode: " + n3 + " pos: " + n2);
        }
        String string = a[n3];
        switch (n3) {
            case 16: {
                return string + " " + b2.c(n2 + 1);
            }
            case 17: {
                return string + " " + b2.f(n2 + 1);
            }
            case 18: {
                return string + " " + ag.e(q2, b2.c(n2 + 1));
            }
            case 19: 
            case 20: {
                return string + " " + ag.e(q2, b2.e(n2 + 1));
            }
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: 
            case 54: 
            case 55: 
            case 56: 
            case 57: 
            case 58: {
                return string + " " + b2.c(n2 + 1);
            }
            case 153: 
            case 154: 
            case 155: 
            case 156: 
            case 157: 
            case 158: 
            case 159: 
            case 160: 
            case 161: 
            case 162: 
            case 163: 
            case 164: 
            case 165: 
            case 166: 
            case 198: 
            case 199: {
                return string + " " + (b2.f(n2 + 1) + n2);
            }
            case 132: {
                return string + " " + b2.c(n2 + 1) + ", " + b2.d(n2 + 2);
            }
            case 167: 
            case 168: {
                return string + " " + (b2.f(n2 + 1) + n2);
            }
            case 169: {
                return string + " " + b2.c(n2 + 1);
            }
            case 170: {
                return ag.c(b2, n2);
            }
            case 171: {
                return ag.b(b2, n2);
            }
            case 178: 
            case 179: 
            case 180: 
            case 181: {
                return string + " " + ag.d(q2, b2.e(n2 + 1));
            }
            case 182: 
            case 183: 
            case 184: {
                return string + " " + ag.c(q2, b2.e(n2 + 1));
            }
            case 185: {
                return string + " " + ag.b(q2, b2.e(n2 + 1));
            }
            case 186: {
                return string + " " + b2.e(n2 + 1);
            }
            case 187: {
                return string + " " + ag.a(q2, b2.e(n2 + 1));
            }
            case 188: {
                return string + " " + ag.a(b2.c(n2 + 1));
            }
            case 189: 
            case 192: {
                return string + " " + ag.a(q2, b2.e(n2 + 1));
            }
            case 196: {
                return ag.a(b2, n2);
            }
            case 197: {
                return string + " " + ag.a(q2, b2.e(n2 + 1));
            }
            case 200: 
            case 201: {
                return string + " " + (b2.g(n2 + 1) + n2);
            }
        }
        return string;
    }

    private static String a(B b2, int n2) {
        int n3 = b2.c(n2 + 1);
        int n4 = b2.e(n2 + 2);
        switch (n3) {
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: 
            case 54: 
            case 55: 
            case 56: 
            case 57: 
            case 58: 
            case 132: 
            case 169: {
                return a[n3] + " " + n4;
            }
        }
        throw new RuntimeException("Invalid WIDE operand");
    }

    private static String a(int n2) {
        switch (n2) {
            case 4: {
                return "boolean";
            }
            case 5: {
                return "char";
            }
            case 8: {
                return "byte";
            }
            case 9: {
                return "short";
            }
            case 10: {
                return "int";
            }
            case 11: {
                return "long";
            }
            case 6: {
                return "float";
            }
            case 7: {
                return "double";
            }
        }
        throw new RuntimeException("Invalid array type");
    }

    private static String a(Q q2, int n2) {
        return "#" + n2 + " = Class " + q2.d(n2);
    }

    private static String b(Q q2, int n2) {
        return "#" + n2 + " = Method " + q2.u(n2) + "." + q2.w(n2) + "(" + q2.x(n2) + ")";
    }

    private static String c(Q q2, int n2) {
        return "#" + n2 + " = Method " + q2.p(n2) + "." + q2.r(n2) + "(" + q2.s(n2) + ")";
    }

    private static String d(Q q2, int n2) {
        return "#" + n2 + " = Field " + q2.k(n2) + "." + q2.m(n2) + "(" + q2.n(n2) + ")";
    }

    private static String b(B b2, int n2) {
        StringBuffer stringBuffer = new StringBuffer("lookupswitch {\n");
        int n3 = (n2 & -4) + 4;
        stringBuffer.append("\t\tdefault: ").append(n2 + b2.g(n3)).append("\n");
        int n4 = b2.g(n3 += 4);
        int n5 = n4 * 8 + (n3 += 4);
        while (n3 < n5) {
            int n6 = b2.g(n3);
            int n7 = b2.g(n3 + 4) + n2;
            stringBuffer.append("\t\t").append(n6).append(": ").append(n7).append("\n");
            n3 += 8;
        }
        stringBuffer.setCharAt(stringBuffer.length() - 1, '}');
        return stringBuffer.toString();
    }

    private static String c(B b2, int n2) {
        StringBuffer stringBuffer = new StringBuffer("tableswitch {\n");
        int n3 = (n2 & -4) + 4;
        stringBuffer.append("\t\tdefault: ").append(n2 + b2.g(n3)).append("\n");
        int n4 = b2.g(n3 += 4);
        int n5 = b2.g(n3 += 4);
        int n6 = (n5 - n4 + 1) * 4 + (n3 += 4);
        int n7 = n4;
        while (n3 < n6) {
            int n8 = b2.g(n3) + n2;
            stringBuffer.append("\t\t").append(n7).append(": ").append(n8).append("\n");
            n3 += 4;
            ++n7;
        }
        stringBuffer.setCharAt(stringBuffer.length() - 1, '}');
        return stringBuffer.toString();
    }

    private static String e(Q q2, int n2) {
        int n3 = q2.c(n2);
        switch (n3) {
            case 8: {
                return "#" + n2 + " = \"" + q2.D(n2) + "\"";
            }
            case 3: {
                return "#" + n2 + " = int " + q2.z(n2);
            }
            case 4: {
                return "#" + n2 + " = float " + q2.A(n2);
            }
            case 5: {
                return "#" + n2 + " = long " + q2.B(n2);
            }
            case 6: {
                return "#" + n2 + " = int " + q2.C(n2);
            }
            case 7: {
                return ag.a(q2, n2);
            }
        }
        throw new RuntimeException("bad LDC: " + n3);
    }
}

