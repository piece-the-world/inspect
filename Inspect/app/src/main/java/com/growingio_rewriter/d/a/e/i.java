/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.e;

import com.growingio.d.a.c;
import com.growingio.d.a.m;
import com.growingio.d.a.p;
import com.growingio.d.a.v;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public abstract class i {
    public static final String[] d;
    public static final String[] e;
    public static final String[] f;
    protected final int g;
    protected final StringBuffer h;
    public final List<Object> i;

    protected i(int n2) {
        this.g = n2;
        this.h = new StringBuffer();
        this.i = new ArrayList<Object>();
    }

    public abstract void a(int var1, int var2, String var3, String var4, String var5, String[] var6);

    public abstract void a(String var1, String var2);

    public abstract void a(String var1, String var2, String var3);

    public abstract i g(String var1, boolean var2);

    public i k(int n2, v v2, String string, boolean bl2) {
        throw new RuntimeException("Must be overriden");
    }

    public abstract void a(c var1);

    public abstract void a(String var1, String var2, String var3, int var4);

    public abstract i b(int var1, String var2, String var3, String var4, Object var5);

    public abstract i b(int var1, String var2, String var3, String var4, String[] var5);

    public abstract void a();

    public abstract void a(String var1, Object var2);

    public abstract void b(String var1, String var2, String var3);

    public abstract i c(String var1, String var2);

    public abstract i b(String var1);

    public abstract void b();

    public abstract i f(String var1, boolean var2);

    public i j(int n2, v v2, String string, boolean bl2) {
        throw new RuntimeException("Must be overriden");
    }

    public abstract void b(c var1);

    public abstract void c();

    public void a(String string, int n2) {
        throw new RuntimeException("Must be overriden");
    }

    public abstract i g();

    public abstract i e(String var1, boolean var2);

    public i i(int n2, v v2, String string, boolean bl2) {
        throw new RuntimeException("Must be overriden");
    }

    public abstract i b(int var1, String var2, boolean var3);

    public abstract void c(c var1);

    public abstract void e();

    public abstract void a(int var1, int var2, Object[] var3, int var4, Object[] var5);

    public abstract void a(int var1);

    public abstract void a(int var1, int var2);

    public abstract void b(int var1, int var2);

    public abstract void a(int var1, String var2);

    public abstract void a(int var1, String var2, String var3, String var4);

    public void b(int n2, String string, String string2, String string3) {
        if (this.g >= 327680) {
            boolean bl2 = n2 == 185;
            this.a(n2, string, string2, string3, bl2);
            return;
        }
        throw new RuntimeException("Must be overriden");
    }

    public void a(int n2, String string, String string2, String string3, boolean bl2) {
        if (this.g < 327680) {
            if (bl2 != (n2 == 185)) {
                throw new IllegalArgumentException("INVOKESPECIAL/STATIC on interfaces require ASM 5");
            }
            this.b(n2, string, string2, string3);
            return;
        }
        throw new RuntimeException("Must be overriden");
    }

    public /* varargs */ abstract void a(String var1, String var2, m var3, Object ... var4);

    public abstract void a(int var1, p var2);

    public abstract void a(p var1);

    public abstract void a(Object var1);

    public abstract void c(int var1, int var2);

    public /* varargs */ abstract void a(int var1, int var2, p var3, p ... var4);

    public abstract void a(p var1, int[] var2, p[] var3);

    public abstract void b(String var1, int var2);

    public i h(int n2, v v2, String string, boolean bl2) {
        throw new RuntimeException("Must be overriden");
    }

    public abstract void a(p var1, p var2, p var3, String var4);

    public i g(int n2, v v2, String string, boolean bl2) {
        throw new RuntimeException("Must be overriden");
    }

    public abstract void a(String var1, String var2, String var3, p var4, p var5, int var6);

    public i a(int n2, v v2, p[] arrp, p[] arrp2, int[] arrn, String string, boolean bl2) {
        throw new RuntimeException("Must be overriden");
    }

    public abstract void b(int var1, p var2);

    public abstract void d(int var1, int var2);

    public abstract void f();

    public List<Object> h() {
        return this.i;
    }

    public void a(PrintWriter printWriter) {
        i.a(printWriter, this.i);
    }

    public static void a(StringBuffer stringBuffer, String string) {
        stringBuffer.append('\"');
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (c2 == '\n') {
                stringBuffer.append("\\n");
                continue;
            }
            if (c2 == '\r') {
                stringBuffer.append("\\r");
                continue;
            }
            if (c2 == '\\') {
                stringBuffer.append("\\\\");
                continue;
            }
            if (c2 == '\"') {
                stringBuffer.append("\\\"");
                continue;
            }
            if (c2 < ' ' || c2 > '') {
                stringBuffer.append("\\u");
                if (c2 < '\u0010') {
                    stringBuffer.append("000");
                } else if (c2 < '\u0100') {
                    stringBuffer.append("00");
                } else if (c2 < '\u1000') {
                    stringBuffer.append('0');
                }
                stringBuffer.append(Integer.toString(c2, 16));
                continue;
            }
            stringBuffer.append(c2);
        }
        stringBuffer.append('\"');
    }

    static void a(PrintWriter printWriter, List<?> list) {
        for (int i2 = 0; i2 < list.size(); ++i2) {
            ? obj = list.get(i2);
            if (obj instanceof List) {
                i.a(printWriter, (List)obj);
                continue;
            }
            printWriter.print(obj.toString());
        }
    }

    static {
        int n2;
        String string = "NOP,ACONST_NULL,ICONST_M1,ICONST_0,ICONST_1,ICONST_2,ICONST_3,ICONST_4,ICONST_5,LCONST_0,LCONST_1,FCONST_0,FCONST_1,FCONST_2,DCONST_0,DCONST_1,BIPUSH,SIPUSH,LDC,,,ILOAD,LLOAD,FLOAD,DLOAD,ALOAD,,,,,,,,,,,,,,,,,,,,,IALOAD,LALOAD,FALOAD,DALOAD,AALOAD,BALOAD,CALOAD,SALOAD,ISTORE,LSTORE,FSTORE,DSTORE,ASTORE,,,,,,,,,,,,,,,,,,,,,IASTORE,LASTORE,FASTORE,DASTORE,AASTORE,BASTORE,CASTORE,SASTORE,POP,POP2,DUP,DUP_X1,DUP_X2,DUP2,DUP2_X1,DUP2_X2,SWAP,IADD,LADD,FADD,DADD,ISUB,LSUB,FSUB,DSUB,IMUL,LMUL,FMUL,DMUL,IDIV,LDIV,FDIV,DDIV,IREM,LREM,FREM,DREM,INEG,LNEG,FNEG,DNEG,ISHL,LSHL,ISHR,LSHR,IUSHR,LUSHR,IAND,LAND,IOR,LOR,IXOR,LXOR,IINC,I2L,I2F,I2D,L2I,L2F,L2D,F2I,F2L,F2D,D2I,D2L,D2F,I2B,I2C,I2S,LCMP,FCMPL,FCMPG,DCMPL,DCMPG,IFEQ,IFNE,IFLT,IFGE,IFGT,IFLE,IF_ICMPEQ,IF_ICMPNE,IF_ICMPLT,IF_ICMPGE,IF_ICMPGT,IF_ICMPLE,IF_ACMPEQ,IF_ACMPNE,GOTO,JSR,RET,TABLESWITCH,LOOKUPSWITCH,IRETURN,LRETURN,FRETURN,DRETURN,ARETURN,RETURN,GETSTATIC,PUTSTATIC,GETFIELD,PUTFIELD,INVOKEVIRTUAL,INVOKESPECIAL,INVOKESTATIC,INVOKEINTERFACE,INVOKEDYNAMIC,NEW,NEWARRAY,ANEWARRAY,ARRAYLENGTH,ATHROW,CHECKCAST,INSTANCEOF,MONITORENTER,MONITOREXIT,,MULTIANEWARRAY,IFNULL,IFNONNULL,";
        d = new String[200];
        int n3 = 0;
        int n4 = 0;
        while ((n2 = string.indexOf(44, n4)) > 0) {
            i.d[n3++] = n4 + 1 == n2 ? null : string.substring(n4, n2);
            n4 = n2 + 1;
        }
        string = "T_BOOLEAN,T_CHAR,T_FLOAT,T_DOUBLE,T_BYTE,T_SHORT,T_INT,T_LONG,";
        e = new String[12];
        n4 = 0;
        n3 = 4;
        while ((n2 = string.indexOf(44, n4)) > 0) {
            i.e[n3++] = string.substring(n4, n2);
            n4 = n2 + 1;
        }
        string = "H_GETFIELD,H_GETSTATIC,H_PUTFIELD,H_PUTSTATIC,H_INVOKEVIRTUAL,H_INVOKESTATIC,H_INVOKESPECIAL,H_NEWINVOKESPECIAL,H_INVOKEINTERFACE,";
        f = new String[10];
        n4 = 0;
        n3 = 1;
        while ((n2 = string.indexOf(44, n4)) > 0) {
            i.f[n3++] = string.substring(n4, n2);
            n4 = n2 + 1;
        }
    }
}

