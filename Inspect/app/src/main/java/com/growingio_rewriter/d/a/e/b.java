/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.e;

import com.growingio.d.a.c;
import com.growingio.d.a.e;
import com.growingio.d.a.e.a;
import com.growingio.d.a.e.i;
import com.growingio.d.a.f;
import com.growingio.d.a.m;
import com.growingio.d.a.p;
import com.growingio.d.a.u;
import com.growingio.d.a.v;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class b
extends i {
    protected final String a;
    protected final int b;
    protected Map<p, String> c;
    private static final int j = 262144;
    private static final int k = 524288;
    private static final int l = 1048576;

    public b() {
        this(327680, "cw", 0);
        if (this.getClass() != b.class) {
            throw new IllegalStateException();
        }
    }

    protected b(int n2, String string, int n3) {
        super(n2);
        this.a = string;
        this.b = n3;
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
            System.err.println("Prints the ASM code to generate the given class.");
            System.err.println("Usage: ASMifier [-debug] <fully qualified class name or class file name>");
            return;
        }
        e e2 = arrstring[n2].endsWith(".class") || arrstring[n2].indexOf(92) > -1 || arrstring[n2].indexOf(47) > -1 ? new e(new FileInputStream(arrstring[n2])) : new e(arrstring[n2]);
        e2.a(new com.growingio.d.a.e.m(null, new b(), new PrintWriter(System.out)), n3);
    }

    @Override
    public void a(int n2, int n3, String string, String string2, String string3, String[] arrstring) {
        String string4;
        int n4 = string.lastIndexOf(47);
        if (n4 == -1) {
            string4 = string;
        } else {
            this.i.add("package asm." + string.substring(0, n4).replace('/', '.') + ";\n");
            string4 = string.substring(n4 + 1);
        }
        this.i.add("import java.util.*;\n");
        this.i.add("import org.objectweb.asm.*;\n");
        this.i.add("public class " + string4 + "Dump implements Opcodes {\n\n");
        this.i.add("public static byte[] dump () throws Exception {\n\n");
        this.i.add("ClassWriter cw = new ClassWriter(0);\n");
        this.i.add("FieldVisitor fv;\n");
        this.i.add("MethodVisitor mv;\n");
        this.i.add("AnnotationVisitor av0;\n\n");
        this.h.setLength(0);
        this.h.append("cw.visit(");
        switch (n2) {
            case 196653: {
                this.h.append("V1_1");
                break;
            }
            case 46: {
                this.h.append("V1_2");
                break;
            }
            case 47: {
                this.h.append("V1_3");
                break;
            }
            case 48: {
                this.h.append("V1_4");
                break;
            }
            case 49: {
                this.h.append("V1_5");
                break;
            }
            case 50: {
                this.h.append("V1_6");
                break;
            }
            case 51: {
                this.h.append("V1_7");
                break;
            }
            default: {
                this.h.append(n2);
            }
        }
        this.h.append(", ");
        this.b(n3 | 262144);
        this.h.append(", ");
        this.b((Object)string);
        this.h.append(", ");
        this.b((Object)string2);
        this.h.append(", ");
        this.b((Object)string3);
        this.h.append(", ");
        if (arrstring != null && arrstring.length > 0) {
            this.h.append("new String[] {");
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                this.h.append(i2 == 0 ? " " : ", ");
                this.b((Object)arrstring[i2]);
            }
            this.h.append(" }");
        } else {
            this.h.append("null");
        }
        this.h.append(");\n\n");
        this.i.add(this.h.toString());
    }

    @Override
    public void a(String string, String string2) {
        this.h.setLength(0);
        this.h.append("cw.visitSource(");
        this.b((Object)string);
        this.h.append(", ");
        this.b((Object)string2);
        this.h.append(");\n\n");
        this.i.add(this.h.toString());
    }

    @Override
    public void a(String string, String string2, String string3) {
        this.h.setLength(0);
        this.h.append("cw.visitOuterClass(");
        this.b((Object)string);
        this.h.append(", ");
        this.b((Object)string2);
        this.h.append(", ");
        this.b((Object)string3);
        this.h.append(");\n\n");
        this.i.add(this.h.toString());
    }

    public b a(String string, boolean bl2) {
        return this.d(string, bl2);
    }

    public b a(int n2, v v2, String string, boolean bl2) {
        return this.f(n2, v2, string, bl2);
    }

    @Override
    public void a(c c2) {
        this.d(c2);
    }

    @Override
    public void a(String string, String string2, String string3, int n2) {
        this.h.setLength(0);
        this.h.append("cw.visitInnerClass(");
        this.b((Object)string);
        this.h.append(", ");
        this.b((Object)string2);
        this.h.append(", ");
        this.b((Object)string3);
        this.h.append(", ");
        this.b(n2 | 1048576);
        this.h.append(");\n\n");
        this.i.add(this.h.toString());
    }

    public b a(int n2, String string, String string2, String string3, Object object) {
        this.h.setLength(0);
        this.h.append("{\n");
        this.h.append("fv = cw.visitField(");
        this.b(n2 | 524288);
        this.h.append(", ");
        this.b((Object)string);
        this.h.append(", ");
        this.b((Object)string2);
        this.h.append(", ");
        this.b((Object)string3);
        this.h.append(", ");
        this.b(object);
        this.h.append(");\n");
        this.i.add(this.h.toString());
        b b2 = this.c("fv", 0);
        this.i.add(b2.h());
        this.i.add("}\n");
        return b2;
    }

    public b a(int n2, String string, String string2, String string3, String[] arrstring) {
        this.h.setLength(0);
        this.h.append("{\n");
        this.h.append("mv = cw.visitMethod(");
        this.b(n2);
        this.h.append(", ");
        this.b((Object)string);
        this.h.append(", ");
        this.b((Object)string2);
        this.h.append(", ");
        this.b((Object)string3);
        this.h.append(", ");
        if (arrstring != null && arrstring.length > 0) {
            this.h.append("new String[] {");
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                this.h.append(i2 == 0 ? " " : ", ");
                this.b((Object)arrstring[i2]);
            }
            this.h.append(" }");
        } else {
            this.h.append("null");
        }
        this.h.append(");\n");
        this.i.add(this.h.toString());
        b b2 = this.c("mv", 0);
        this.i.add(b2.h());
        this.i.add("}\n");
        return b2;
    }

    @Override
    public void a() {
        this.i.add("cw.visitEnd();\n\n");
        this.i.add("return cw.toByteArray();\n");
        this.i.add("}\n");
        this.i.add("}\n");
    }

    @Override
    public void a(String string, Object object) {
        this.h.setLength(0);
        this.h.append("av").append(this.b).append(".visit(");
        b.a(this.h, string);
        this.h.append(", ");
        b.a(this.h, object);
        this.h.append(");\n");
        this.i.add(this.h.toString());
    }

    @Override
    public void b(String string, String string2, String string3) {
        this.h.setLength(0);
        this.h.append("av").append(this.b).append(".visitEnum(");
        b.a(this.h, string);
        this.h.append(", ");
        b.a(this.h, string2);
        this.h.append(", ");
        b.a(this.h, string3);
        this.h.append(");\n");
        this.i.add(this.h.toString());
    }

    public b b(String string, String string2) {
        this.h.setLength(0);
        this.h.append("{\n");
        this.h.append("AnnotationVisitor av").append(this.b + 1).append(" = av");
        this.h.append(this.b).append(".visitAnnotation(");
        b.a(this.h, string);
        this.h.append(", ");
        b.a(this.h, string2);
        this.h.append(");\n");
        this.i.add(this.h.toString());
        b b2 = this.c("av", this.b + 1);
        this.i.add(b2.h());
        this.i.add("}\n");
        return b2;
    }

    public b a(String string) {
        this.h.setLength(0);
        this.h.append("{\n");
        this.h.append("AnnotationVisitor av").append(this.b + 1).append(" = av");
        this.h.append(this.b).append(".visitArray(");
        b.a(this.h, string);
        this.h.append(");\n");
        this.i.add(this.h.toString());
        b b2 = this.c("av", this.b + 1);
        this.i.add(b2.h());
        this.i.add("}\n");
        return b2;
    }

    @Override
    public void b() {
        this.h.setLength(0);
        this.h.append("av").append(this.b).append(".visitEnd();\n");
        this.i.add(this.h.toString());
    }

    public b b(String string, boolean bl2) {
        return this.d(string, bl2);
    }

    public b b(int n2, v v2, String string, boolean bl2) {
        return this.f(n2, v2, string, bl2);
    }

    @Override
    public void b(c c2) {
        this.d(c2);
    }

    @Override
    public void c() {
        this.h.setLength(0);
        this.h.append(this.a).append(".visitEnd();\n");
        this.i.add(this.h.toString());
    }

    @Override
    public void a(String string, int n2) {
        this.h.setLength(0);
        this.h.append(this.a).append(".visitParameter(");
        b.a(this.h, string);
        this.h.append(", ");
        this.b(n2);
        this.i.add(this.h.append(");\n").toString());
    }

    public b d() {
        this.h.setLength(0);
        this.h.append("{\n").append("av0 = ").append(this.a).append(".visitAnnotationDefault();\n");
        this.i.add(this.h.toString());
        b b2 = this.c("av", 0);
        this.i.add(b2.h());
        this.i.add("}\n");
        return b2;
    }

    public b c(String string, boolean bl2) {
        return this.d(string, bl2);
    }

    public b c(int n2, v v2, String string, boolean bl2) {
        return this.f(n2, v2, string, bl2);
    }

    public b a(int n2, String string, boolean bl2) {
        this.h.setLength(0);
        this.h.append("{\n").append("av0 = ").append(this.a).append(".visitParameterAnnotation(").append(n2).append(", ");
        this.b((Object)string);
        this.h.append(", ").append(bl2).append(");\n");
        this.i.add(this.h.toString());
        b b2 = this.c("av", 0);
        this.i.add(b2.h());
        this.i.add("}\n");
        return b2;
    }

    @Override
    public void c(c c2) {
        this.d(c2);
    }

    @Override
    public void e() {
        this.i.add(this.a + ".visitCode();\n");
    }

    @Override
    public void a(int n2, int n3, Object[] arrobject, int n4, Object[] arrobject2) {
        this.h.setLength(0);
        switch (n2) {
            case -1: 
            case 0: {
                this.a(n3, arrobject);
                this.a(n4, arrobject2);
                if (n2 == -1) {
                    this.h.append(this.a).append(".visitFrame(Opcodes.F_NEW, ");
                } else {
                    this.h.append(this.a).append(".visitFrame(Opcodes.F_FULL, ");
                }
                this.h.append(n3).append(", new Object[] {");
                this.b(n3, arrobject);
                this.h.append("}, ").append(n4).append(", new Object[] {");
                this.b(n4, arrobject2);
                this.h.append('}');
                break;
            }
            case 1: {
                this.a(n3, arrobject);
                this.h.append(this.a).append(".visitFrame(Opcodes.F_APPEND,").append(n3).append(", new Object[] {");
                this.b(n3, arrobject);
                this.h.append("}, 0, null");
                break;
            }
            case 2: {
                this.h.append(this.a).append(".visitFrame(Opcodes.F_CHOP,").append(n3).append(", null, 0, null");
                break;
            }
            case 3: {
                this.h.append(this.a).append(".visitFrame(Opcodes.F_SAME, 0, null, 0, null");
                break;
            }
            case 4: {
                this.a(1, arrobject2);
                this.h.append(this.a).append(".visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {");
                this.b(1, arrobject2);
                this.h.append('}');
            }
        }
        this.h.append(");\n");
        this.i.add(this.h.toString());
    }

    @Override
    public void a(int n2) {
        this.h.setLength(0);
        this.h.append(this.a).append(".visitInsn(").append(d[n2]).append(");\n");
        this.i.add(this.h.toString());
    }

    @Override
    public void a(int n2, int n3) {
        this.h.setLength(0);
        this.h.append(this.a).append(".visitIntInsn(").append(d[n2]).append(", ").append(n2 == 188 ? e[n3] : Integer.toString(n3)).append(");\n");
        this.i.add(this.h.toString());
    }

    @Override
    public void b(int n2, int n3) {
        this.h.setLength(0);
        this.h.append(this.a).append(".visitVarInsn(").append(d[n2]).append(", ").append(n3).append(");\n");
        this.i.add(this.h.toString());
    }

    @Override
    public void a(int n2, String string) {
        this.h.setLength(0);
        this.h.append(this.a).append(".visitTypeInsn(").append(d[n2]).append(", ");
        this.b((Object)string);
        this.h.append(");\n");
        this.i.add(this.h.toString());
    }

    @Override
    public void a(int n2, String string, String string2, String string3) {
        this.h.setLength(0);
        this.h.append(this.a).append(".visitFieldInsn(").append(d[n2]).append(", ");
        this.b((Object)string);
        this.h.append(", ");
        this.b((Object)string2);
        this.h.append(", ");
        this.b((Object)string3);
        this.h.append(");\n");
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
        this.h.append(this.a).append(".visitMethodInsn(").append(d[n2]).append(", ");
        this.b((Object)string);
        this.h.append(", ");
        this.b((Object)string2);
        this.h.append(", ");
        this.b((Object)string3);
        this.h.append(", ");
        this.h.append(bl2 ? "true" : "false");
        this.h.append(");\n");
        this.i.add(this.h.toString());
    }

    @Override
    public /* varargs */ void a(String string, String string2, m m2, Object ... arrobject) {
        this.h.setLength(0);
        this.h.append(this.a).append(".visitInvokeDynamicInsn(");
        this.b((Object)string);
        this.h.append(", ");
        this.b((Object)string2);
        this.h.append(", ");
        this.b(m2);
        this.h.append(", new Object[]{");
        for (int i2 = 0; i2 < arrobject.length; ++i2) {
            this.b(arrobject[i2]);
            if (i2 == arrobject.length - 1) continue;
            this.h.append(", ");
        }
        this.h.append("});\n");
        this.i.add(this.h.toString());
    }

    @Override
    public void a(int n2, p p2) {
        this.h.setLength(0);
        this.b(p2);
        this.h.append(this.a).append(".visitJumpInsn(").append(d[n2]).append(", ");
        this.c(p2);
        this.h.append(");\n");
        this.i.add(this.h.toString());
    }

    @Override
    public void a(p p2) {
        this.h.setLength(0);
        this.b(p2);
        this.h.append(this.a).append(".visitLabel(");
        this.c(p2);
        this.h.append(");\n");
        this.i.add(this.h.toString());
    }

    @Override
    public void a(Object object) {
        this.h.setLength(0);
        this.h.append(this.a).append(".visitLdcInsn(");
        this.b(object);
        this.h.append(");\n");
        this.i.add(this.h.toString());
    }

    @Override
    public void c(int n2, int n3) {
        this.h.setLength(0);
        this.h.append(this.a).append(".visitIincInsn(").append(n2).append(", ").append(n3).append(");\n");
        this.i.add(this.h.toString());
    }

    @Override
    public /* varargs */ void a(int n2, int n3, p p2, p ... arrp) {
        int n4;
        this.h.setLength(0);
        for (n4 = 0; n4 < arrp.length; ++n4) {
            this.b(arrp[n4]);
        }
        this.b(p2);
        this.h.append(this.a).append(".visitTableSwitchInsn(").append(n2).append(", ").append(n3).append(", ");
        this.c(p2);
        this.h.append(", new Label[] {");
        for (n4 = 0; n4 < arrp.length; ++n4) {
            this.h.append(n4 == 0 ? " " : ", ");
            this.c(arrp[n4]);
        }
        this.h.append(" });\n");
        this.i.add(this.h.toString());
    }

    @Override
    public void a(p p2, int[] arrn, p[] arrp) {
        int n2;
        this.h.setLength(0);
        for (n2 = 0; n2 < arrp.length; ++n2) {
            this.b(arrp[n2]);
        }
        this.b(p2);
        this.h.append(this.a).append(".visitLookupSwitchInsn(");
        this.c(p2);
        this.h.append(", new int[] {");
        for (n2 = 0; n2 < arrn.length; ++n2) {
            this.h.append(n2 == 0 ? " " : ", ").append(arrn[n2]);
        }
        this.h.append(" }, new Label[] {");
        for (n2 = 0; n2 < arrp.length; ++n2) {
            this.h.append(n2 == 0 ? " " : ", ");
            this.c(arrp[n2]);
        }
        this.h.append(" });\n");
        this.i.add(this.h.toString());
    }

    @Override
    public void b(String string, int n2) {
        this.h.setLength(0);
        this.h.append(this.a).append(".visitMultiANewArrayInsn(");
        this.b((Object)string);
        this.h.append(", ").append(n2).append(");\n");
        this.i.add(this.h.toString());
    }

    public b d(int n2, v v2, String string, boolean bl2) {
        return this.a("visitInsnAnnotation", n2, v2, string, bl2);
    }

    @Override
    public void a(p p2, p p3, p p4, String string) {
        this.h.setLength(0);
        this.b(p2);
        this.b(p3);
        this.b(p4);
        this.h.append(this.a).append(".visitTryCatchBlock(");
        this.c(p2);
        this.h.append(", ");
        this.c(p3);
        this.h.append(", ");
        this.c(p4);
        this.h.append(", ");
        this.b((Object)string);
        this.h.append(");\n");
        this.i.add(this.h.toString());
    }

    public b e(int n2, v v2, String string, boolean bl2) {
        return this.a("visitTryCatchAnnotation", n2, v2, string, bl2);
    }

    @Override
    public void a(String string, String string2, String string3, p p2, p p3, int n2) {
        this.h.setLength(0);
        this.h.append(this.a).append(".visitLocalVariable(");
        this.b((Object)string);
        this.h.append(", ");
        this.b((Object)string2);
        this.h.append(", ");
        this.b((Object)string3);
        this.h.append(", ");
        this.c(p2);
        this.h.append(", ");
        this.c(p3);
        this.h.append(", ").append(n2).append(");\n");
        this.i.add(this.h.toString());
    }

    @Override
    public i a(int n2, v v2, p[] arrp, p[] arrp2, int[] arrn, String string, boolean bl2) {
        int n3;
        this.h.setLength(0);
        this.h.append("{\n").append("av0 = ").append(this.a).append(".visitLocalVariableAnnotation(");
        this.h.append(n2);
        if (v2 == null) {
            this.h.append(", null, ");
        } else {
            this.h.append(", TypePath.fromString(\"").append(v2).append("\"), ");
        }
        this.h.append("new Label[] {");
        for (n3 = 0; n3 < arrp.length; ++n3) {
            this.h.append(n3 == 0 ? " " : ", ");
            this.c(arrp[n3]);
        }
        this.h.append(" }, new Label[] {");
        for (n3 = 0; n3 < arrp2.length; ++n3) {
            this.h.append(n3 == 0 ? " " : ", ");
            this.c(arrp2[n3]);
        }
        this.h.append(" }, new int[] {");
        for (n3 = 0; n3 < arrn.length; ++n3) {
            this.h.append(n3 == 0 ? " " : ", ").append(arrn[n3]);
        }
        this.h.append(" }, ");
        this.b((Object)string);
        this.h.append(", ").append(bl2).append(");\n");
        this.i.add(this.h.toString());
        b b2 = this.c("av", 0);
        this.i.add(b2.h());
        this.i.add("}\n");
        return b2;
    }

    @Override
    public void b(int n2, p p2) {
        this.h.setLength(0);
        this.h.append(this.a).append(".visitLineNumber(").append(n2).append(", ");
        this.c(p2);
        this.h.append(");\n");
        this.i.add(this.h.toString());
    }

    @Override
    public void d(int n2, int n3) {
        this.h.setLength(0);
        this.h.append(this.a).append(".visitMaxs(").append(n2).append(", ").append(n3).append(");\n");
        this.i.add(this.h.toString());
    }

    @Override
    public void f() {
        this.h.setLength(0);
        this.h.append(this.a).append(".visitEnd();\n");
        this.i.add(this.h.toString());
    }

    public b d(String string, boolean bl2) {
        this.h.setLength(0);
        this.h.append("{\n").append("av0 = ").append(this.a).append(".visitAnnotation(");
        this.b((Object)string);
        this.h.append(", ").append(bl2).append(");\n");
        this.i.add(this.h.toString());
        b b2 = this.c("av", 0);
        this.i.add(b2.h());
        this.i.add("}\n");
        return b2;
    }

    public b f(int n2, v v2, String string, boolean bl2) {
        return this.a("visitTypeAnnotation", n2, v2, string, bl2);
    }

    public b a(String string, int n2, v v2, String string2, boolean bl2) {
        this.h.setLength(0);
        this.h.append("{\n").append("av0 = ").append(this.a).append(".").append(string).append("(");
        this.h.append(n2);
        if (v2 == null) {
            this.h.append(", null, ");
        } else {
            this.h.append(", TypePath.fromString(\"").append(v2).append("\"), ");
        }
        this.b((Object)string2);
        this.h.append(", ").append(bl2).append(");\n");
        this.i.add(this.h.toString());
        b b2 = this.c("av", 0);
        this.i.add(b2.h());
        this.i.add("}\n");
        return b2;
    }

    public void d(c c2) {
        this.h.setLength(0);
        this.h.append("// ATTRIBUTE ").append(c2.a).append('\n');
        if (c2 instanceof a) {
            if (this.c == null) {
                this.c = new HashMap<p, String>();
            }
            this.h.append("{\n");
            ((a)((Object)c2)).a(this.h, "attr", this.c);
            this.h.append(this.a).append(".visitAttribute(attr);\n");
            this.h.append("}\n");
        }
        this.i.add(this.h.toString());
    }

    protected b c(String string, int n2) {
        return new b(327680, string, n2);
    }

    void b(int n2) {
        boolean bl2 = true;
        if ((n2 & 1) != 0) {
            this.h.append("ACC_PUBLIC");
            bl2 = false;
        }
        if ((n2 & 2) != 0) {
            this.h.append("ACC_PRIVATE");
            bl2 = false;
        }
        if ((n2 & 4) != 0) {
            this.h.append("ACC_PROTECTED");
            bl2 = false;
        }
        if ((n2 & 16) != 0) {
            if (!bl2) {
                this.h.append(" + ");
            }
            this.h.append("ACC_FINAL");
            bl2 = false;
        }
        if ((n2 & 8) != 0) {
            if (!bl2) {
                this.h.append(" + ");
            }
            this.h.append("ACC_STATIC");
            bl2 = false;
        }
        if ((n2 & 32) != 0) {
            if (!bl2) {
                this.h.append(" + ");
            }
            if ((n2 & 262144) == 0) {
                this.h.append("ACC_SYNCHRONIZED");
            } else {
                this.h.append("ACC_SUPER");
            }
            bl2 = false;
        }
        if ((n2 & 64) != 0 && (n2 & 524288) != 0) {
            if (!bl2) {
                this.h.append(" + ");
            }
            this.h.append("ACC_VOLATILE");
            bl2 = false;
        }
        if ((n2 & 64) != 0 && (n2 & 262144) == 0 && (n2 & 524288) == 0) {
            if (!bl2) {
                this.h.append(" + ");
            }
            this.h.append("ACC_BRIDGE");
            bl2 = false;
        }
        if ((n2 & 128) != 0 && (n2 & 262144) == 0 && (n2 & 524288) == 0) {
            if (!bl2) {
                this.h.append(" + ");
            }
            this.h.append("ACC_VARARGS");
            bl2 = false;
        }
        if ((n2 & 128) != 0 && (n2 & 524288) != 0) {
            if (!bl2) {
                this.h.append(" + ");
            }
            this.h.append("ACC_TRANSIENT");
            bl2 = false;
        }
        if ((n2 & 256) != 0 && (n2 & 262144) == 0 && (n2 & 524288) == 0) {
            if (!bl2) {
                this.h.append(" + ");
            }
            this.h.append("ACC_NATIVE");
            bl2 = false;
        }
        if ((n2 & 16384) != 0 && ((n2 & 262144) != 0 || (n2 & 524288) != 0 || (n2 & 1048576) != 0)) {
            if (!bl2) {
                this.h.append(" + ");
            }
            this.h.append("ACC_ENUM");
            bl2 = false;
        }
        if ((n2 & 8192) != 0 && ((n2 & 262144) != 0 || (n2 & 1048576) != 0)) {
            if (!bl2) {
                this.h.append(" + ");
            }
            this.h.append("ACC_ANNOTATION");
            bl2 = false;
        }
        if ((n2 & 1024) != 0) {
            if (!bl2) {
                this.h.append(" + ");
            }
            this.h.append("ACC_ABSTRACT");
            bl2 = false;
        }
        if ((n2 & 512) != 0) {
            if (!bl2) {
                this.h.append(" + ");
            }
            this.h.append("ACC_INTERFACE");
            bl2 = false;
        }
        if ((n2 & 2048) != 0) {
            if (!bl2) {
                this.h.append(" + ");
            }
            this.h.append("ACC_STRICT");
            bl2 = false;
        }
        if ((n2 & 4096) != 0) {
            if (!bl2) {
                this.h.append(" + ");
            }
            this.h.append("ACC_SYNTHETIC");
            bl2 = false;
        }
        if ((n2 & 131072) != 0) {
            if (!bl2) {
                this.h.append(" + ");
            }
            this.h.append("ACC_DEPRECATED");
            bl2 = false;
        }
        if ((n2 & 32768) != 0) {
            if (!bl2) {
                this.h.append(" + ");
            }
            this.h.append("ACC_MANDATED");
            bl2 = false;
        }
        if (bl2) {
            this.h.append('0');
        }
    }

    protected void b(Object object) {
        b.a(this.h, object);
    }

    static void a(StringBuffer stringBuffer, Object object) {
        if (object == null) {
            stringBuffer.append("null");
        } else if (object instanceof String) {
            b.a(stringBuffer, (String)object);
        } else if (object instanceof u) {
            stringBuffer.append("Type.getType(\"");
            stringBuffer.append(((u)object).i());
            stringBuffer.append("\")");
        } else if (object instanceof m) {
            stringBuffer.append("new Handle(");
            m m2 = (m)object;
            stringBuffer.append("Opcodes.").append(f[m2.a()]).append(", \"");
            stringBuffer.append(m2.b()).append("\", \"");
            stringBuffer.append(m2.c()).append("\", \"");
            stringBuffer.append(m2.d()).append("\")");
        } else if (object instanceof Byte) {
            stringBuffer.append("new Byte((byte)").append(object).append(')');
        } else if (object instanceof Boolean) {
            stringBuffer.append((Boolean)object != false ? "Boolean.TRUE" : "Boolean.FALSE");
        } else if (object instanceof Short) {
            stringBuffer.append("new Short((short)").append(object).append(')');
        } else if (object instanceof Character) {
            char c2 = ((Character)object).charValue();
            stringBuffer.append("new Character((char)").append((int)c2).append(')');
        } else if (object instanceof Integer) {
            stringBuffer.append("new Integer(").append(object).append(')');
        } else if (object instanceof Float) {
            stringBuffer.append("new Float(\"").append(object).append("\")");
        } else if (object instanceof Long) {
            stringBuffer.append("new Long(").append(object).append("L)");
        } else if (object instanceof Double) {
            stringBuffer.append("new Double(\"").append(object).append("\")");
        } else if (object instanceof byte[]) {
            byte[] arrby = (byte[])object;
            stringBuffer.append("new byte[] {");
            for (int i2 = 0; i2 < arrby.length; ++i2) {
                stringBuffer.append(i2 == 0 ? "" : ",").append(arrby[i2]);
            }
            stringBuffer.append('}');
        } else if (object instanceof boolean[]) {
            boolean[] arrbl = (boolean[])object;
            stringBuffer.append("new boolean[] {");
            for (int i3 = 0; i3 < arrbl.length; ++i3) {
                stringBuffer.append(i3 == 0 ? "" : ",").append(arrbl[i3]);
            }
            stringBuffer.append('}');
        } else if (object instanceof short[]) {
            short[] arrs = (short[])object;
            stringBuffer.append("new short[] {");
            for (int i4 = 0; i4 < arrs.length; ++i4) {
                stringBuffer.append(i4 == 0 ? "" : ",").append("(short)").append(arrs[i4]);
            }
            stringBuffer.append('}');
        } else if (object instanceof char[]) {
            char[] arrc = (char[])object;
            stringBuffer.append("new char[] {");
            for (int i5 = 0; i5 < arrc.length; ++i5) {
                stringBuffer.append(i5 == 0 ? "" : ",").append("(char)").append((int)arrc[i5]);
            }
            stringBuffer.append('}');
        } else if (object instanceof int[]) {
            int[] arrn = (int[])object;
            stringBuffer.append("new int[] {");
            for (int i6 = 0; i6 < arrn.length; ++i6) {
                stringBuffer.append(i6 == 0 ? "" : ",").append(arrn[i6]);
            }
            stringBuffer.append('}');
        } else if (object instanceof long[]) {
            long[] arrl = (long[])object;
            stringBuffer.append("new long[] {");
            for (int i7 = 0; i7 < arrl.length; ++i7) {
                stringBuffer.append(i7 == 0 ? "" : ",").append(arrl[i7]).append('L');
            }
            stringBuffer.append('}');
        } else if (object instanceof float[]) {
            float[] arrf = (float[])object;
            stringBuffer.append("new float[] {");
            for (int i8 = 0; i8 < arrf.length; ++i8) {
                stringBuffer.append(i8 == 0 ? "" : ",").append(arrf[i8]).append('f');
            }
            stringBuffer.append('}');
        } else if (object instanceof double[]) {
            double[] arrd = (double[])object;
            stringBuffer.append("new double[] {");
            for (int i9 = 0; i9 < arrd.length; ++i9) {
                stringBuffer.append(i9 == 0 ? "" : ",").append(arrd[i9]).append('d');
            }
            stringBuffer.append('}');
        }
    }

    private void a(int n2, Object[] arrobject) {
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!(arrobject[i2] instanceof p)) continue;
            this.b((p)arrobject[i2]);
        }
    }

    private void b(int n2, Object[] arrobject) {
        for (int i2 = 0; i2 < n2; ++i2) {
            if (i2 > 0) {
                this.h.append(", ");
            }
            if (arrobject[i2] instanceof String) {
                this.b(arrobject[i2]);
                continue;
            }
            if (arrobject[i2] instanceof Integer) {
                switch ((Integer)arrobject[i2]) {
                    case 0: {
                        this.h.append("Opcodes.TOP");
                        break;
                    }
                    case 1: {
                        this.h.append("Opcodes.INTEGER");
                        break;
                    }
                    case 2: {
                        this.h.append("Opcodes.FLOAT");
                        break;
                    }
                    case 3: {
                        this.h.append("Opcodes.DOUBLE");
                        break;
                    }
                    case 4: {
                        this.h.append("Opcodes.LONG");
                        break;
                    }
                    case 5: {
                        this.h.append("Opcodes.NULL");
                        break;
                    }
                    case 6: {
                        this.h.append("Opcodes.UNINITIALIZED_THIS");
                    }
                }
                continue;
            }
            this.c((p)arrobject[i2]);
        }
    }

    protected void b(p p2) {
        String string;
        if (this.c == null) {
            this.c = new HashMap<p, String>();
        }
        if ((string = this.c.get(p2)) == null) {
            string = "l" + this.c.size();
            this.c.put(p2, string);
            this.h.append("Label ").append(string).append(" = new Label();\n");
        }
    }

    protected void c(p p2) {
        this.h.append(this.c.get(p2));
    }

    @Override
    public /* synthetic */ i g(int n2, v v2, String string, boolean bl2) {
        return this.e(n2, v2, string, bl2);
    }

    @Override
    public /* synthetic */ i h(int n2, v v2, String string, boolean bl2) {
        return this.d(n2, v2, string, bl2);
    }

    @Override
    public /* synthetic */ i b(int n2, String string, boolean bl2) {
        return this.a(n2, string, bl2);
    }

    @Override
    public /* synthetic */ i i(int n2, v v2, String string, boolean bl2) {
        return this.c(n2, v2, string, bl2);
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
    public /* synthetic */ i j(int n2, v v2, String string, boolean bl2) {
        return this.b(n2, v2, string, bl2);
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
    public /* synthetic */ i k(int n2, v v2, String string, boolean bl2) {
        return this.a(n2, v2, string, bl2);
    }

    @Override
    public /* synthetic */ i g(String string, boolean bl2) {
        return this.a(string, bl2);
    }
}

