/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.f;
import com.growingio.d.a.f.A;
import com.growingio.d.a.f.B;
import com.growingio.d.a.f.C;
import com.growingio.d.a.f.D;
import com.growingio.d.a.f.F;
import com.growingio.d.a.f.G;
import com.growingio.d.a.f.H;
import com.growingio.d.a.f.I;
import com.growingio.d.a.f.J;
import com.growingio.d.a.f.K;
import com.growingio.d.a.f.L;
import com.growingio.d.a.f.M;
import com.growingio.d.a.f.N;
import com.growingio.d.a.f.O;
import com.growingio.d.a.f.ag;
import com.growingio.d.a.f.b;
import com.growingio.d.a.f.c;
import com.growingio.d.a.f.d;
import com.growingio.d.a.f.e;
import com.growingio.d.a.f.g;
import com.growingio.d.a.f.h;
import com.growingio.d.a.f.i;
import com.growingio.d.a.f.j;
import com.growingio.d.a.f.k;
import com.growingio.d.a.f.l;
import com.growingio.d.a.f.m;
import com.growingio.d.a.f.n;
import com.growingio.d.a.f.o;
import com.growingio.d.a.f.q;
import com.growingio.d.a.f.r;
import com.growingio.d.a.f.s;
import com.growingio.d.a.f.u;
import com.growingio.d.a.f.v;
import com.growingio.d.a.f.w;
import com.growingio.d.a.f.x;
import com.growingio.d.a.f.y;
import com.growingio.d.a.f.z;
import com.growingio.d.a.p;
import com.growingio.d.a.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class a
extends DefaultHandler
implements t {
    private final ArrayList<Object> do = new ArrayList();
    String a = "";
    protected f b;
    protected Map<Object, p> c;
    private static final String dp = "class";
    private final I dq = new I();
    static final HashMap<String, D> dm = new HashMap();
    static final HashMap<String, Integer> dn;

    private static void a(String string, int n2, int n3) {
        dm.put(string, new D(n2, n3));
    }

    public a(f f2) {
        this.dq.a("class", new i(this));
        this.dq.a("class/interfaces/interface", new q(this));
        this.dq.a("class/interfaces", new r(this));
        this.dq.a("class/outerclass", new G(this));
        this.dq.a("class/innerclass", new o(this));
        this.dq.a("class/source", new J(this));
        this.dq.a("class/field", new l(this));
        this.dq.a("class/method", new C(this));
        this.dq.a("class/method/exceptions/exception", new j(this));
        this.dq.a("class/method/exceptions", new k(this));
        this.dq.a("class/method/parameter", new B(this));
        this.dq.a("class/method/annotationDefault", new b(this));
        this.dq.a("class/method/code/*", new F(this));
        this.dq.a("class/method/code/frame", new m(this));
        this.dq.a("class/method/code/frame/local", new n(this));
        this.dq.a("class/method/code/frame/stack", new n(this));
        this.dq.a("class/method/code/TABLESWITCH", new L(this));
        this.dq.a("class/method/code/TABLESWITCH/label", new K(this));
        this.dq.a("class/method/code/LOOKUPSWITCH", new z(this));
        this.dq.a("class/method/code/LOOKUPSWITCH/label", new y(this));
        this.dq.a("class/method/code/INVOKEDYNAMIC", new com.growingio.d.a.f.t(this));
        this.dq.a("class/method/code/INVOKEDYNAMIC/bsmArg", new s(this));
        this.dq.a("class/method/code/Label", new u(this));
        this.dq.a("class/method/code/TryCatch", new N(this));
        this.dq.a("class/method/code/LineNumber", new v(this));
        this.dq.a("class/method/code/LocalVar", new w(this));
        this.dq.a("class/method/code/Max", new A(this));
        this.dq.a("*/annotation", new d(this));
        this.dq.a("*/typeAnnotation", new O(this));
        this.dq.a("*/parameterAnnotation", new c(this));
        this.dq.a("*/insnAnnotation", new com.growingio.d.a.f.p(this));
        this.dq.a("*/tryCatchAnnotation", new M(this));
        this.dq.a("*/localVariableAnnotation", new x(this));
        this.dq.a("*/annotationValue", new h(this));
        this.dq.a("*/annotationValueAnnotation", new e(this));
        this.dq.a("*/annotationValueEnum", new g(this));
        this.dq.a("*/annotationValueArray", new com.growingio.d.a.f.f(this));
        this.b = f2;
    }

    @Override
    public final void startElement(String string, String string2, String string3, Attributes attributes) throws SAXException {
        String string4 = string2 == null || string2.length() == 0 ? string3 : string2;
        StringBuilder stringBuilder = new StringBuilder(this.a);
        if (this.a.length() > 0) {
            stringBuilder.append('/');
        }
        stringBuilder.append(string4);
        this.a = stringBuilder.toString();
        H h2 = (H)this.dq.a(this.a);
        if (h2 != null) {
            h2.a(string4, attributes);
        }
    }

    @Override
    public final void endElement(String string, String string2, String string3) throws SAXException {
        int n2;
        String string4 = string2 == null || string2.length() == 0 ? string3 : string2;
        H h2 = (H)this.dq.a(this.a);
        if (h2 != null) {
            h2.a(string4);
        }
        this.a = (n2 = this.a.lastIndexOf(47)) >= 0 ? this.a.substring(0, n2) : "";
    }

    final Object a() {
        int n2 = this.do.size();
        return n2 == 0 ? null : this.do.get(n2 - 1);
    }

    final Object b() {
        int n2 = this.do.size();
        return n2 == 0 ? null : this.do.remove(n2 - 1);
    }

    final void a(Object object) {
        this.do.add(object);
    }

    static {
        a.a("NOP", 0, 0);
        a.a("ACONST_NULL", 1, 0);
        a.a("ICONST_M1", 2, 0);
        a.a("ICONST_0", 3, 0);
        a.a("ICONST_1", 4, 0);
        a.a("ICONST_2", 5, 0);
        a.a("ICONST_3", 6, 0);
        a.a("ICONST_4", 7, 0);
        a.a("ICONST_5", 8, 0);
        a.a("LCONST_0", 9, 0);
        a.a("LCONST_1", 10, 0);
        a.a("FCONST_0", 11, 0);
        a.a("FCONST_1", 12, 0);
        a.a("FCONST_2", 13, 0);
        a.a("DCONST_0", 14, 0);
        a.a("DCONST_1", 15, 0);
        a.a("BIPUSH", 16, 1);
        a.a("SIPUSH", 17, 1);
        a.a("LDC", 18, 7);
        a.a("ILOAD", 21, 2);
        a.a("LLOAD", 22, 2);
        a.a("FLOAD", 23, 2);
        a.a("DLOAD", 24, 2);
        a.a("ALOAD", 25, 2);
        a.a("IALOAD", 46, 0);
        a.a("LALOAD", 47, 0);
        a.a("FALOAD", 48, 0);
        a.a("DALOAD", 49, 0);
        a.a("AALOAD", 50, 0);
        a.a("BALOAD", 51, 0);
        a.a("CALOAD", 52, 0);
        a.a("SALOAD", 53, 0);
        a.a("ISTORE", 54, 2);
        a.a("LSTORE", 55, 2);
        a.a("FSTORE", 56, 2);
        a.a("DSTORE", 57, 2);
        a.a("ASTORE", 58, 2);
        a.a("IASTORE", 79, 0);
        a.a("LASTORE", 80, 0);
        a.a("FASTORE", 81, 0);
        a.a("DASTORE", 82, 0);
        a.a("AASTORE", 83, 0);
        a.a("BASTORE", 84, 0);
        a.a("CASTORE", 85, 0);
        a.a("SASTORE", 86, 0);
        a.a("POP", 87, 0);
        a.a("POP2", 88, 0);
        a.a("DUP", 89, 0);
        a.a("DUP_X1", 90, 0);
        a.a("DUP_X2", 91, 0);
        a.a("DUP2", 92, 0);
        a.a("DUP2_X1", 93, 0);
        a.a("DUP2_X2", 94, 0);
        a.a("SWAP", 95, 0);
        a.a("IADD", 96, 0);
        a.a("LADD", 97, 0);
        a.a("FADD", 98, 0);
        a.a("DADD", 99, 0);
        a.a("ISUB", 100, 0);
        a.a("LSUB", 101, 0);
        a.a("FSUB", 102, 0);
        a.a("DSUB", 103, 0);
        a.a("IMUL", 104, 0);
        a.a("LMUL", 105, 0);
        a.a("FMUL", 106, 0);
        a.a("DMUL", 107, 0);
        a.a("IDIV", 108, 0);
        a.a("LDIV", 109, 0);
        a.a("FDIV", 110, 0);
        a.a("DDIV", 111, 0);
        a.a("IREM", 112, 0);
        a.a("LREM", 113, 0);
        a.a("FREM", 114, 0);
        a.a("DREM", 115, 0);
        a.a("INEG", 116, 0);
        a.a("LNEG", 117, 0);
        a.a("FNEG", 118, 0);
        a.a("DNEG", 119, 0);
        a.a("ISHL", 120, 0);
        a.a("LSHL", 121, 0);
        a.a("ISHR", 122, 0);
        a.a("LSHR", 123, 0);
        a.a("IUSHR", 124, 0);
        a.a("LUSHR", 125, 0);
        a.a("IAND", 126, 0);
        a.a("LAND", 127, 0);
        a.a("IOR", 128, 0);
        a.a("LOR", 129, 0);
        a.a("IXOR", 130, 0);
        a.a("LXOR", 131, 0);
        a.a("IINC", 132, 8);
        a.a("I2L", 133, 0);
        a.a("I2F", 134, 0);
        a.a("I2D", 135, 0);
        a.a("L2I", 136, 0);
        a.a("L2F", 137, 0);
        a.a("L2D", 138, 0);
        a.a("F2I", 139, 0);
        a.a("F2L", 140, 0);
        a.a("F2D", 141, 0);
        a.a("D2I", 142, 0);
        a.a("D2L", 143, 0);
        a.a("D2F", 144, 0);
        a.a("I2B", 145, 0);
        a.a("I2C", 146, 0);
        a.a("I2S", 147, 0);
        a.a("LCMP", 148, 0);
        a.a("FCMPL", 149, 0);
        a.a("FCMPG", 150, 0);
        a.a("DCMPL", 151, 0);
        a.a("DCMPG", 152, 0);
        a.a("IFEQ", 153, 6);
        a.a("IFNE", 154, 6);
        a.a("IFLT", 155, 6);
        a.a("IFGE", 156, 6);
        a.a("IFGT", 157, 6);
        a.a("IFLE", 158, 6);
        a.a("IF_ICMPEQ", 159, 6);
        a.a("IF_ICMPNE", 160, 6);
        a.a("IF_ICMPLT", 161, 6);
        a.a("IF_ICMPGE", 162, 6);
        a.a("IF_ICMPGT", 163, 6);
        a.a("IF_ICMPLE", 164, 6);
        a.a("IF_ACMPEQ", 165, 6);
        a.a("IF_ACMPNE", 166, 6);
        a.a("GOTO", 167, 6);
        a.a("JSR", 168, 6);
        a.a("RET", 169, 2);
        a.a("IRETURN", 172, 0);
        a.a("LRETURN", 173, 0);
        a.a("FRETURN", 174, 0);
        a.a("DRETURN", 175, 0);
        a.a("ARETURN", 176, 0);
        a.a("RETURN", 177, 0);
        a.a("GETSTATIC", 178, 4);
        a.a("PUTSTATIC", 179, 4);
        a.a("GETFIELD", 180, 4);
        a.a("PUTFIELD", 181, 4);
        a.a("INVOKEVIRTUAL", 182, 5);
        a.a("INVOKESPECIAL", 183, 5);
        a.a("INVOKESTATIC", 184, 5);
        a.a("INVOKEINTERFACE", 185, 5);
        a.a("NEW", 187, 3);
        a.a("NEWARRAY", 188, 1);
        a.a("ANEWARRAY", 189, 3);
        a.a("ARRAYLENGTH", 190, 0);
        a.a("ATHROW", 191, 0);
        a.a("CHECKCAST", 192, 3);
        a.a("INSTANCEOF", 193, 3);
        a.a("MONITORENTER", 194, 0);
        a.a("MONITOREXIT", 195, 0);
        a.a("MULTIANEWARRAY", 197, 9);
        a.a("IFNULL", 198, 6);
        a.a("IFNONNULL", 199, 6);
        dn = new HashMap();
        String[] arrstring = ag.a;
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            dn.put(arrstring[i2], i2);
        }
    }
}

