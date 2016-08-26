/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.e;

import com.growingio.d.a.c;
import com.growingio.d.a.c.a;
import com.growingio.d.a.c.b;
import com.growingio.d.a.e;
import com.growingio.d.a.e.i;
import com.growingio.d.a.e.j;
import com.growingio.d.a.f;
import com.growingio.d.a.m;
import com.growingio.d.a.p;
import com.growingio.d.a.u;
import com.growingio.d.a.v;
import com.growingio.d.a.w;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class k
extends i {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int j = 3;
    public static final int k = 4;
    public static final int l = 5;
    public static final int m = 6;
    public static final int n = 7;
    public static final int o = 8;
    public static final int p = 9;
    protected String q = "  ";
    protected String r = "    ";
    protected String s = "      ";
    protected String t = "   ";
    protected Map<p, String> u;
    private int v;
    private int w = 0;

    public k() {
        this(327680);
        if (this.getClass() != k.class) {
            throw new IllegalStateException();
        }
    }

    protected k(int n2) {
        super(n2);
    }

    public static void a(String[] arrstring) throws Exception {
        int n2 = 0;
        int n3 = 2;
        boolean bl2 = true;
        if (arrstring.length < 1 || arrstring.length > 2) {
            bl2 = false;
        }
        if (bl2 && "-debug".equals(arrstring[0])) {
            n2 = 1;
            n3 = 0;
            if (arrstring.length != 2) {
                bl2 = false;
            }
        }
        if (!bl2) {
            System.err.println("Prints a disassembled view of the given class.");
            System.err.println("Usage: Textifier [-debug] <fully qualified class name or class file name>");
            return;
        }
        e e2 = arrstring[n2].endsWith(".class") || arrstring[n2].indexOf(92) > -1 || arrstring[n2].indexOf(47) > -1 ? new e(new FileInputStream(arrstring[n2])) : new e(arrstring[n2]);
        e2.a(new com.growingio.d.a.e.m(new PrintWriter(System.out)), n3);
    }

    @Override
    public void a(int n2, int n3, String string, String string2, String string3, String[] arrstring) {
        this.v = n3;
        int n4 = n2 & 65535;
        int n5 = n2 >>> 16;
        this.h.setLength(0);
        this.h.append("// class version ").append(n4).append('.').append(n5).append(" (").append(n2).append(")\n");
        if ((n3 & 131072) != 0) {
            this.h.append("// DEPRECATED\n");
        }
        this.h.append("// access flags 0x").append(Integer.toHexString(n3).toUpperCase()).append('\n');
        this.b(5, string2);
        if (string2 != null) {
            com.growingio.d.a.e.p p2 = new com.growingio.d.a.e.p(n3);
            a a2 = new a(string2);
            a2.a(p2);
            this.h.append("// declaration: ").append(string).append(p2.k()).append('\n');
        }
        this.c(n3 & -33);
        if ((n3 & 8192) != 0) {
            this.h.append("@interface ");
        } else if ((n3 & 512) != 0) {
            this.h.append("interface ");
        } else if ((n3 & 16384) == 0) {
            this.h.append("class ");
        }
        this.b(0, string);
        if (string3 != null && !"java/lang/Object".equals(string3)) {
            this.h.append(" extends ");
            this.b(0, string3);
            this.h.append(' ');
        }
        if (arrstring != null && arrstring.length > 0) {
            this.h.append(" implements ");
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                this.b(0, arrstring[i2]);
                this.h.append(' ');
            }
        }
        this.h.append(" {\n\n");
        this.i.add(this.h.toString());
    }

    @Override
    public void a(String string, String string2) {
        this.h.setLength(0);
        if (string != null) {
            this.h.append(this.q).append("// compiled from: ").append(string).append('\n');
        }
        if (string2 != null) {
            this.h.append(this.q).append("// debug info: ").append(string2).append('\n');
        }
        if (this.h.length() > 0) {
            this.i.add(this.h.toString());
        }
    }

    @Override
    public void a(String string, String string2, String string3) {
        this.h.setLength(0);
        this.h.append(this.q).append("OUTERCLASS ");
        this.b(0, string);
        this.h.append(' ');
        if (string2 != null) {
            this.h.append(string2).append(' ');
        }
        this.b(3, string3);
        this.h.append('\n');
        this.i.add(this.h.toString());
    }

    public k a(String string, boolean bl2) {
        this.i.add("\n");
        return this.d(string, bl2);
    }

    @Override
    public i k(int n2, v v2, String string, boolean bl2) {
        this.i.add("\n");
        return this.a(n2, v2, string, bl2);
    }

    @Override
    public void a(c c2) {
        this.i.add("\n");
        this.d(c2);
    }

    @Override
    public void a(String string, String string2, String string3, int n2) {
        this.h.setLength(0);
        this.h.append(this.q).append("// access flags 0x");
        this.h.append(Integer.toHexString(n2 & -33).toUpperCase()).append('\n');
        this.h.append(this.q);
        this.c(n2);
        this.h.append("INNERCLASS ");
        this.b(0, string);
        this.h.append(' ');
        this.b(0, string2);
        this.h.append(' ');
        this.b(0, string3);
        this.h.append('\n');
        this.i.add(this.h.toString());
    }

    public k a(int n2, String string, String string2, String string3, Object object) {
        Object object2;
        this.h.setLength(0);
        this.h.append('\n');
        if ((n2 & 131072) != 0) {
            this.h.append(this.q).append("// DEPRECATED\n");
        }
        this.h.append(this.q).append("// access flags 0x").append(Integer.toHexString(n2).toUpperCase()).append('\n');
        if (string3 != null) {
            this.h.append(this.q);
            this.b(2, string3);
            object2 = new com.growingio.d.a.e.p(0);
            a a2 = new a(string3);
            a2.b((b)object2);
            this.h.append(this.q).append("// declaration: ").append(object2.k()).append('\n');
        }
        this.h.append(this.q);
        this.c(n2);
        this.b(1, string2);
        this.h.append(' ').append(string);
        if (object != null) {
            this.h.append(" = ");
            if (object instanceof String) {
                this.h.append('\"').append(object).append('\"');
            } else {
                this.h.append(object);
            }
        }
        this.h.append('\n');
        this.i.add(this.h.toString());
        object2 = this.i();
        this.i.add(object2.h());
        return object2;
    }

    public k a(int n2, String string, String string2, String string3, String[] arrstring) {
        Object object;
        this.h.setLength(0);
        this.h.append('\n');
        if ((n2 & 131072) != 0) {
            this.h.append(this.q).append("// DEPRECATED\n");
        }
        this.h.append(this.q).append("// access flags 0x").append(Integer.toHexString(n2).toUpperCase()).append('\n');
        if (string3 != null) {
            this.h.append(this.q);
            this.b(4, string3);
            object = new com.growingio.d.a.e.p(0);
            a a2 = new a(string3);
            a2.a((b)object);
            String string4 = object.k();
            String string5 = object.l();
            String string6 = object.m();
            this.h.append(this.q).append("// declaration: ").append(string5).append(' ').append(string).append(string4);
            if (string6 != null) {
                this.h.append(" throws ").append(string6);
            }
            this.h.append('\n');
        }
        this.h.append(this.q);
        this.c(n2 & -65);
        if ((n2 & 256) != 0) {
            this.h.append("native ");
        }
        if ((n2 & 128) != 0) {
            this.h.append("varargs ");
        }
        if ((n2 & 64) != 0) {
            this.h.append("bridge ");
        }
        if ((this.v & 512) != 0 && (n2 & 1024) == 0 && (n2 & 8) == 0) {
            this.h.append("default ");
        }
        this.h.append(string);
        this.b(3, string2);
        if (arrstring != null && arrstring.length > 0) {
            this.h.append(" throws ");
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                this.b(0, arrstring[i2]);
                this.h.append(' ');
            }
        }
        this.h.append('\n');
        this.i.add(this.h.toString());
        object = this.i();
        this.i.add(object.h());
        return object;
    }

    @Override
    public void a() {
        this.i.add("}\n");
    }

    @Override
    public void a(String string, Object object) {
        this.h.setLength(0);
        this.d(this.w++);
        if (string != null) {
            this.h.append(string).append('=');
        }
        if (object instanceof String) {
            this.c((String)object);
        } else if (object instanceof u) {
            this.a((u)object);
        } else if (object instanceof Byte) {
            this.a(((Byte)object).byteValue());
        } else if (object instanceof Boolean) {
            this.a((Boolean)object);
        } else if (object instanceof Short) {
            this.a((Short)object);
        } else if (object instanceof Character) {
            this.a(((Character)object).charValue());
        } else if (object instanceof Integer) {
            this.b((Integer)object);
        } else if (object instanceof Float) {
            this.a(((Float)object).floatValue());
        } else if (object instanceof Long) {
            this.a((Long)object);
        } else if (object instanceof Double) {
            this.a((Double)object);
        } else if (object.getClass().isArray()) {
            this.h.append('{');
            if (object instanceof byte[]) {
                byte[] arrby = (byte[])object;
                for (int i2 = 0; i2 < arrby.length; ++i2) {
                    this.d(i2);
                    this.a(arrby[i2]);
                }
            } else if (object instanceof boolean[]) {
                boolean[] arrbl = (boolean[])object;
                for (int i3 = 0; i3 < arrbl.length; ++i3) {
                    this.d(i3);
                    this.a(arrbl[i3]);
                }
            } else if (object instanceof short[]) {
                short[] arrs = (short[])object;
                for (int i4 = 0; i4 < arrs.length; ++i4) {
                    this.d(i4);
                    this.a(arrs[i4]);
                }
            } else if (object instanceof char[]) {
                char[] arrc = (char[])object;
                for (int i5 = 0; i5 < arrc.length; ++i5) {
                    this.d(i5);
                    this.a(arrc[i5]);
                }
            } else if (object instanceof int[]) {
                int[] arrn = (int[])object;
                for (int i6 = 0; i6 < arrn.length; ++i6) {
                    this.d(i6);
                    this.b(arrn[i6]);
                }
            } else if (object instanceof long[]) {
                long[] arrl = (long[])object;
                for (int i7 = 0; i7 < arrl.length; ++i7) {
                    this.d(i7);
                    this.a(arrl[i7]);
                }
            } else if (object instanceof float[]) {
                float[] arrf = (float[])object;
                for (int i8 = 0; i8 < arrf.length; ++i8) {
                    this.d(i8);
                    this.a(arrf[i8]);
                }
            } else if (object instanceof double[]) {
                double[] arrd = (double[])object;
                for (int i9 = 0; i9 < arrd.length; ++i9) {
                    this.d(i9);
                    this.a(arrd[i9]);
                }
            }
            this.h.append('}');
        }
        this.i.add(this.h.toString());
    }

    private void b(int n2) {
        this.h.append(n2);
    }

    private void a(long l2) {
        this.h.append(l2).append('L');
    }

    private void a(float f2) {
        this.h.append(f2).append('F');
    }

    private void a(double d2) {
        this.h.append(d2).append('D');
    }

    private void a(char c2) {
        this.h.append("(char)").append((int)c2);
    }

    private void a(short s2) {
        this.h.append("(short)").append(s2);
    }

    private void a(byte by2) {
        this.h.append("(byte)").append(by2);
    }

    private void a(boolean bl2) {
        this.h.append(bl2);
    }

    private void c(String string) {
        k.a(this.h, string);
    }

    private void a(u u2) {
        this.h.append(u2.d()).append(".class");
    }

    @Override
    public void b(String string, String string2, String string3) {
        this.h.setLength(0);
        this.d(this.w++);
        if (string != null) {
            this.h.append(string).append('=');
        }
        this.b(1, string2);
        this.h.append('.').append(string3);
        this.i.add(this.h.toString());
    }

    public k b(String string, String string2) {
        this.h.setLength(0);
        this.d(this.w++);
        if (string != null) {
            this.h.append(string).append('=');
        }
        this.h.append('@');
        this.b(1, string2);
        this.h.append('(');
        this.i.add(this.h.toString());
        k k2 = this.i();
        this.i.add(k2.h());
        this.i.add(")");
        return k2;
    }

    public k a(String string) {
        this.h.setLength(0);
        this.d(this.w++);
        if (string != null) {
            this.h.append(string).append('=');
        }
        this.h.append('{');
        this.i.add(this.h.toString());
        k k2 = this.i();
        this.i.add(k2.h());
        this.i.add("}");
        return k2;
    }

    @Override
    public void b() {
    }

    public k b(String string, boolean bl2) {
        return this.d(string, bl2);
    }

    @Override
    public i j(int n2, v v2, String string, boolean bl2) {
        return this.a(n2, v2, string, bl2);
    }

    @Override
    public void b(c c2) {
        this.d(c2);
    }

    @Override
    public void c() {
    }

    @Override
    public void a(String string, int n2) {
        this.h.setLength(0);
        this.h.append(this.r).append("// parameter ");
        this.c(n2);
        this.h.append(' ').append(string == null ? "<no name>" : string).append('\n');
        this.i.add(this.h.toString());
    }

    public k d() {
        this.i.add(this.r + "default=");
        k k2 = this.i();
        this.i.add(k2.h());
        this.i.add("\n");
        return k2;
    }

    public k c(String string, boolean bl2) {
        return this.d(string, bl2);
    }

    @Override
    public i i(int n2, v v2, String string, boolean bl2) {
        return this.a(n2, v2, string, bl2);
    }

    public k a(int n2, String string, boolean bl2) {
        this.h.setLength(0);
        this.h.append(this.r).append('@');
        this.b(1, string);
        this.h.append('(');
        this.i.add(this.h.toString());
        k k2 = this.i();
        this.i.add(k2.h());
        this.i.add(bl2 ? ") // parameter " : ") // invisible, parameter ");
        this.i.add(n2);
        this.i.add("\n");
        return k2;
    }

    @Override
    public void c(c c2) {
        this.h.setLength(0);
        this.h.append(this.q).append("ATTRIBUTE ");
        this.b(-1, c2.a);
        if (c2 instanceof j) {
            ((j)((Object)c2)).a(this.h, this.u);
        } else {
            this.h.append(" : unknown\n");
        }
        this.i.add(this.h.toString());
    }

    @Override
    public void e() {
    }

    @Override
    public void a(int n2, int n3, Object[] arrobject, int n4, Object[] arrobject2) {
        this.h.setLength(0);
        this.h.append(this.t);
        this.h.append("FRAME ");
        switch (n2) {
            case -1: 
            case 0: {
                this.h.append("FULL [");
                this.a(n3, arrobject);
                this.h.append("] [");
                this.a(n4, arrobject2);
                this.h.append(']');
                break;
            }
            case 1: {
                this.h.append("APPEND [");
                this.a(n3, arrobject);
                this.h.append(']');
                break;
            }
            case 2: {
                this.h.append("CHOP ").append(n3);
                break;
            }
            case 3: {
                this.h.append("SAME");
                break;
            }
            case 4: {
                this.h.append("SAME1 ");
                this.a(1, arrobject2);
            }
        }
        this.h.append('\n');
        this.i.add(this.h.toString());
    }

    @Override
    public void a(int n2) {
        this.h.setLength(0);
        this.h.append(this.r).append(d[n2]).append('\n');
        this.i.add(this.h.toString());
    }

    @Override
    public void a(int n2, int n3) {
        this.h.setLength(0);
        this.h.append(this.r).append(d[n2]).append(' ').append(n2 == 188 ? e[n3] : Integer.toString(n3)).append('\n');
        this.i.add(this.h.toString());
    }

    @Override
    public void b(int n2, int n3) {
        this.h.setLength(0);
        this.h.append(this.r).append(d[n2]).append(' ').append(n3).append('\n');
        this.i.add(this.h.toString());
    }

    @Override
    public void a(int n2, String string) {
        this.h.setLength(0);
        this.h.append(this.r).append(d[n2]).append(' ');
        this.b(0, string);
        this.h.append('\n');
        this.i.add(this.h.toString());
    }

    @Override
    public void a(int n2, String string, String string2, String string3) {
        this.h.setLength(0);
        this.h.append(this.r).append(d[n2]).append(' ');
        this.b(0, string);
        this.h.append('.').append(string2).append(" : ");
        this.b(1, string3);
        this.h.append('\n');
        this.i.add(this.h.toString());
    }

    @Override
    public void b(int n2, String string, String string2, String string3) {
        if (this.g >= 327680) {
            super.b(n2, string, string2, string3);
            return;
        }
        this.b(n2, string, string2, string3, n2 == 185);
    }

    @Override
    public void a(int n2, String string, String string2, String string3, boolean bl2) {
        if (this.g < 327680) {
            super.a(n2, string, string2, string3, bl2);
            return;
        }
        this.b(n2, string, string2, string3, bl2);
    }

    private void b(int n2, String string, String string2, String string3, boolean bl2) {
        this.h.setLength(0);
        this.h.append(this.r).append(d[n2]).append(' ');
        this.b(0, string);
        this.h.append('.').append(string2).append(' ');
        this.b(3, string3);
        this.h.append('\n');
        this.i.add(this.h.toString());
    }

    @Override
    public /* varargs */ void a(String string, String string2, m m2, Object ... arrobject) {
        this.h.setLength(0);
        this.h.append(this.r).append("INVOKEDYNAMIC").append(' ');
        this.h.append(string);
        this.b(3, string2);
        this.h.append(" [");
        this.h.append('\n');
        this.h.append(this.s);
        this.a(m2);
        this.h.append('\n');
        this.h.append(this.s).append("// arguments:");
        if (arrobject.length == 0) {
            this.h.append(" none");
        } else {
            this.h.append('\n');
            for (int i2 = 0; i2 < arrobject.length; ++i2) {
                this.h.append(this.s);
                Object object = arrobject[i2];
                if (object instanceof String) {
                    k.a(this.h, (String)object);
                } else if (object instanceof u) {
                    u u2 = (u)object;
                    if (u2.a() == 11) {
                        this.b(3, u2.i());
                    } else {
                        this.h.append(u2.i()).append(".class");
                    }
                } else if (object instanceof m) {
                    this.a((m)object);
                } else {
                    this.h.append(object);
                }
                this.h.append(", \n");
            }
            this.h.setLength(this.h.length() - 3);
        }
        this.h.append('\n');
        this.h.append(this.r).append("]\n");
        this.i.add(this.h.toString());
    }

    @Override
    public void a(int n2, p p2) {
        this.h.setLength(0);
        this.h.append(this.r).append(d[n2]).append(' ');
        this.b(p2);
        this.h.append('\n');
        this.i.add(this.h.toString());
    }

    @Override
    public void a(p p2) {
        this.h.setLength(0);
        this.h.append(this.t);
        this.b(p2);
        this.h.append('\n');
        this.i.add(this.h.toString());
    }

    @Override
    public void a(Object object) {
        this.h.setLength(0);
        this.h.append(this.r).append("LDC ");
        if (object instanceof String) {
            k.a(this.h, (String)object);
        } else if (object instanceof u) {
            this.h.append(((u)object).i()).append(".class");
        } else {
            this.h.append(object);
        }
        this.h.append('\n');
        this.i.add(this.h.toString());
    }

    @Override
    public void c(int n2, int n3) {
        this.h.setLength(0);
        this.h.append(this.r).append("IINC ").append(n2).append(' ').append(n3).append('\n');
        this.i.add(this.h.toString());
    }

    @Override
    public /* varargs */ void a(int n2, int n3, p p2, p ... arrp) {
        this.h.setLength(0);
        this.h.append(this.r).append("TABLESWITCH\n");
        for (int i2 = 0; i2 < arrp.length; ++i2) {
            this.h.append(this.s).append(n2 + i2).append(": ");
            this.b(arrp[i2]);
            this.h.append('\n');
        }
        this.h.append(this.s).append("default: ");
        this.b(p2);
        this.h.append('\n');
        this.i.add(this.h.toString());
    }

    @Override
    public void a(p p2, int[] arrn, p[] arrp) {
        this.h.setLength(0);
        this.h.append(this.r).append("LOOKUPSWITCH\n");
        for (int i2 = 0; i2 < arrp.length; ++i2) {
            this.h.append(this.s).append(arrn[i2]).append(": ");
            this.b(arrp[i2]);
            this.h.append('\n');
        }
        this.h.append(this.s).append("default: ");
        this.b(p2);
        this.h.append('\n');
        this.i.add(this.h.toString());
    }

    @Override
    public void b(String string, int n2) {
        this.h.setLength(0);
        this.h.append(this.r).append("MULTIANEWARRAY ");
        this.b(1, string);
        this.h.append(' ').append(n2).append('\n');
        this.i.add(this.h.toString());
    }

    @Override
    public i h(int n2, v v2, String string, boolean bl2) {
        return this.a(n2, v2, string, bl2);
    }

    @Override
    public void a(p p2, p p3, p p4, String string) {
        this.h.setLength(0);
        this.h.append(this.r).append("TRYCATCHBLOCK ");
        this.b(p2);
        this.h.append(' ');
        this.b(p3);
        this.h.append(' ');
        this.b(p4);
        this.h.append(' ');
        this.b(0, string);
        this.h.append('\n');
        this.i.add(this.h.toString());
    }

    @Override
    public i g(int n2, v v2, String string, boolean bl2) {
        this.h.setLength(0);
        this.h.append(this.r).append("TRYCATCHBLOCK @");
        this.b(1, string);
        this.h.append('(');
        this.i.add(this.h.toString());
        k k2 = this.i();
        this.i.add(k2.h());
        this.h.setLength(0);
        this.h.append(") : ");
        this.e(n2);
        this.h.append(", ").append(v2);
        this.h.append(bl2 ? "\n" : " // invisible\n");
        this.i.add(this.h.toString());
        return k2;
    }

    @Override
    public void a(String string, String string2, String string3, p p2, p p3, int n2) {
        this.h.setLength(0);
        this.h.append(this.r).append("LOCALVARIABLE ").append(string).append(' ');
        this.b(1, string2);
        this.h.append(' ');
        this.b(p2);
        this.h.append(' ');
        this.b(p3);
        this.h.append(' ').append(n2).append('\n');
        if (string3 != null) {
            this.h.append(this.r);
            this.b(2, string3);
            com.growingio.d.a.e.p p4 = new com.growingio.d.a.e.p(0);
            a a2 = new a(string3);
            a2.b(p4);
            this.h.append(this.r).append("// declaration: ").append(p4.k()).append('\n');
        }
        this.i.add(this.h.toString());
    }

    @Override
    public i a(int n2, v v2, p[] arrp, p[] arrp2, int[] arrn, String string, boolean bl2) {
        this.h.setLength(0);
        this.h.append(this.r).append("LOCALVARIABLE @");
        this.b(1, string);
        this.h.append('(');
        this.i.add(this.h.toString());
        k k2 = this.i();
        this.i.add(k2.h());
        this.h.setLength(0);
        this.h.append(") : ");
        this.e(n2);
        this.h.append(", ").append(v2);
        for (int i2 = 0; i2 < arrp.length; ++i2) {
            this.h.append(" [ ");
            this.b(arrp[i2]);
            this.h.append(" - ");
            this.b(arrp2[i2]);
            this.h.append(" - ").append(arrn[i2]).append(" ]");
        }
        this.h.append(bl2 ? "\n" : " // invisible\n");
        this.i.add(this.h.toString());
        return k2;
    }

    @Override
    public void b(int n2, p p2) {
        this.h.setLength(0);
        this.h.append(this.r).append("LINENUMBER ").append(n2).append(' ');
        this.b(p2);
        this.h.append('\n');
        this.i.add(this.h.toString());
    }

    @Override
    public void d(int n2, int n3) {
        this.h.setLength(0);
        this.h.append(this.r).append("MAXSTACK = ").append(n2).append('\n');
        this.i.add(this.h.toString());
        this.h.setLength(0);
        this.h.append(this.r).append("MAXLOCALS = ").append(n3).append('\n');
        this.i.add(this.h.toString());
    }

    @Override
    public void f() {
    }

    public k d(String string, boolean bl2) {
        this.h.setLength(0);
        this.h.append(this.q).append('@');
        this.b(1, string);
        this.h.append('(');
        this.i.add(this.h.toString());
        k k2 = this.i();
        this.i.add(k2.h());
        this.i.add(bl2 ? ")\n" : ") // invisible\n");
        return k2;
    }

    public k a(int n2, v v2, String string, boolean bl2) {
        this.h.setLength(0);
        this.h.append(this.q).append('@');
        this.b(1, string);
        this.h.append('(');
        this.i.add(this.h.toString());
        k k2 = this.i();
        this.i.add(k2.h());
        this.h.setLength(0);
        this.h.append(") : ");
        this.e(n2);
        this.h.append(", ").append(v2);
        this.h.append(bl2 ? "\n" : " // invisible\n");
        this.i.add(this.h.toString());
        return k2;
    }

    public void d(c c2) {
        this.h.setLength(0);
        this.h.append(this.q).append("ATTRIBUTE ");
        this.b(-1, c2.a);
        if (c2 instanceof j) {
            ((j)((Object)c2)).a(this.h, null);
        } else {
            this.h.append(" : unknown\n");
        }
        this.i.add(this.h.toString());
    }

    protected k i() {
        return new k();
    }

    protected void b(int n2, String string) {
        if (n2 == 5 || n2 == 2 || n2 == 4) {
            if (string != null) {
                this.h.append("// signature ").append(string).append('\n');
            }
        } else {
            this.h.append(string);
        }
    }

    protected void b(p p2) {
        String string;
        if (this.u == null) {
            this.u = new HashMap<p, String>();
        }
        if ((string = this.u.get(p2)) == null) {
            string = "L" + this.u.size();
            this.u.put(p2, string);
        }
        this.h.append(string);
    }

    protected void a(m m2) {
        int n2 = m2.a();
        this.h.append("// handle kind 0x").append(Integer.toHexString(n2)).append(" : ");
        boolean bl2 = false;
        switch (n2) {
            case 1: {
                this.h.append("GETFIELD");
                break;
            }
            case 2: {
                this.h.append("GETSTATIC");
                break;
            }
            case 3: {
                this.h.append("PUTFIELD");
                break;
            }
            case 4: {
                this.h.append("PUTSTATIC");
                break;
            }
            case 9: {
                this.h.append("INVOKEINTERFACE");
                bl2 = true;
                break;
            }
            case 7: {
                this.h.append("INVOKESPECIAL");
                bl2 = true;
                break;
            }
            case 6: {
                this.h.append("INVOKESTATIC");
                bl2 = true;
                break;
            }
            case 5: {
                this.h.append("INVOKEVIRTUAL");
                bl2 = true;
                break;
            }
            case 8: {
                this.h.append("NEWINVOKESPECIAL");
                bl2 = true;
            }
        }
        this.h.append('\n');
        this.h.append(this.s);
        this.b(0, m2.b());
        this.h.append('.');
        this.h.append(m2.c());
        if (!bl2) {
            this.h.append('(');
        }
        this.b(9, m2.d());
        if (!bl2) {
            this.h.append(')');
        }
    }

    private void c(int n2) {
        if ((n2 & 1) != 0) {
            this.h.append("public ");
        }
        if ((n2 & 2) != 0) {
            this.h.append("private ");
        }
        if ((n2 & 4) != 0) {
            this.h.append("protected ");
        }
        if ((n2 & 16) != 0) {
            this.h.append("final ");
        }
        if ((n2 & 8) != 0) {
            this.h.append("static ");
        }
        if ((n2 & 32) != 0) {
            this.h.append("synchronized ");
        }
        if ((n2 & 64) != 0) {
            this.h.append("volatile ");
        }
        if ((n2 & 128) != 0) {
            this.h.append("transient ");
        }
        if ((n2 & 1024) != 0) {
            this.h.append("abstract ");
        }
        if ((n2 & 2048) != 0) {
            this.h.append("strictfp ");
        }
        if ((n2 & 4096) != 0) {
            this.h.append("synthetic ");
        }
        if ((n2 & 32768) != 0) {
            this.h.append("mandated ");
        }
        if ((n2 & 16384) != 0) {
            this.h.append("enum ");
        }
    }

    private void d(int n2) {
        if (n2 != 0) {
            this.h.append(", ");
        }
    }

    private void e(int n2) {
        w w2 = new w(n2);
        switch (w2.a()) {
            case 0: {
                this.h.append("CLASS_TYPE_PARAMETER ").append(w2.b());
                break;
            }
            case 1: {
                this.h.append("METHOD_TYPE_PARAMETER ").append(w2.b());
                break;
            }
            case 16: {
                this.h.append("CLASS_EXTENDS ").append(w2.d());
                break;
            }
            case 17: {
                this.h.append("CLASS_TYPE_PARAMETER_BOUND ").append(w2.b()).append(", ").append(w2.c());
                break;
            }
            case 18: {
                this.h.append("METHOD_TYPE_PARAMETER_BOUND ").append(w2.b()).append(", ").append(w2.c());
                break;
            }
            case 19: {
                this.h.append("FIELD");
                break;
            }
            case 20: {
                this.h.append("METHOD_RETURN");
                break;
            }
            case 21: {
                this.h.append("METHOD_RECEIVER");
                break;
            }
            case 22: {
                this.h.append("METHOD_FORMAL_PARAMETER ").append(w2.e());
                break;
            }
            case 23: {
                this.h.append("THROWS ").append(w2.f());
                break;
            }
            case 64: {
                this.h.append("LOCAL_VARIABLE");
                break;
            }
            case 65: {
                this.h.append("RESOURCE_VARIABLE");
                break;
            }
            case 66: {
                this.h.append("EXCEPTION_PARAMETER ").append(w2.g());
                break;
            }
            case 67: {
                this.h.append("INSTANCEOF");
                break;
            }
            case 68: {
                this.h.append("NEW");
                break;
            }
            case 69: {
                this.h.append("CONSTRUCTOR_REFERENCE");
                break;
            }
            case 70: {
                this.h.append("METHOD_REFERENCE");
                break;
            }
            case 71: {
                this.h.append("CAST ").append(w2.h());
                break;
            }
            case 72: {
                this.h.append("CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT ").append(w2.h());
                break;
            }
            case 73: {
                this.h.append("METHOD_INVOCATION_TYPE_ARGUMENT ").append(w2.h());
                break;
            }
            case 74: {
                this.h.append("CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT ").append(w2.h());
                break;
            }
            case 75: {
                this.h.append("METHOD_REFERENCE_TYPE_ARGUMENT ").append(w2.h());
            }
        }
    }

    private void a(int n2, Object[] arrobject) {
        for (int i2 = 0; i2 < n2; ++i2) {
            if (i2 > 0) {
                this.h.append(' ');
            }
            if (arrobject[i2] instanceof String) {
                String string = (String)arrobject[i2];
                if (string.startsWith("[")) {
                    this.b(1, string);
                    continue;
                }
                this.b(0, string);
                continue;
            }
            if (arrobject[i2] instanceof Integer) {
                switch ((Integer)arrobject[i2]) {
                    case 0: {
                        this.b(1, "T");
                        break;
                    }
                    case 1: {
                        this.b(1, "I");
                        break;
                    }
                    case 2: {
                        this.b(1, "F");
                        break;
                    }
                    case 3: {
                        this.b(1, "D");
                        break;
                    }
                    case 4: {
                        this.b(1, "J");
                        break;
                    }
                    case 5: {
                        this.b(1, "N");
                        break;
                    }
                    case 6: {
                        this.b(1, "U");
                    }
                }
                continue;
            }
            this.b((p)arrobject[i2]);
        }
    }

    @Override
    public /* synthetic */ i b(int n2, String string, boolean bl2) {
        return this.a(n2, string, bl2);
    }

    @Override
    public /* synthetic */ i e(String string, boolean bl2) {
        return this.c(string, bl2);
    }

    @Override
    public /* synthetic */ i g() {
        return this.d();
    }

    @Override
    public /* synthetic */ i f(String string, boolean bl2) {
        return this.b(string, bl2);
    }

    @Override
    public /* synthetic */ i b(String string) {
        return this.a(string);
    }

    @Override
    public /* synthetic */ i c(String string, String string2) {
        return this.b(string, string2);
    }

    @Override
    public /* synthetic */ i b(int n2, String string, String string2, String string3, String[] arrstring) {
        return this.a(n2, string, string2, string3, arrstring);
    }

    @Override
    public /* synthetic */ i b(int n2, String string, String string2, String string3, Object object) {
        return this.a(n2, string, string2, string3, object);
    }

    @Override
    public /* synthetic */ i g(String string, boolean bl2) {
        return this.a(string, bl2);
    }
}

