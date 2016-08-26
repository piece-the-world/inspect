/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.Q;
import com.growingio.b.a.R;
import com.growingio.b.a.S;
import com.growingio.b.a.Y;
import com.growingio.b.a.aA;
import com.growingio.b.a.aO;
import com.growingio.b.a.aP;
import com.growingio.b.a.aZ;
import com.growingio.b.a.ab;
import com.growingio.b.a.af;
import com.growingio.b.a.ak;
import com.growingio.b.a.am;
import com.growingio.b.a.an;
import com.growingio.b.a.at;
import com.growingio.b.a.az;
import com.growingio.b.a.b;
import com.growingio.b.a.bm;
import com.growingio.b.a.bn;
import com.growingio.b.a.c;
import com.growingio.b.a.j;
import com.growingio.b.a.y;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class h {
    protected Q c;
    int d;
    byte[] e;

    protected h(Q q2, int n2, byte[] arrby) {
        this.c = q2;
        this.d = n2;
        this.e = arrby;
    }

    protected h(Q q2, String string) {
        this(q2, string, (byte[])null);
    }

    public h(Q q2, String string, byte[] arrby) {
        this(q2, q2.c(string), arrby);
    }

    protected h(Q q2, int n2, DataInputStream dataInputStream) throws IOException {
        this.c = q2;
        this.d = n2;
        int n3 = dataInputStream.readInt();
        this.e = new byte[n3];
        if (n3 > 0) {
            dataInputStream.readFully(this.e);
        }
    }

    static h a(Q q2, DataInputStream dataInputStream) throws IOException {
        int n2 = dataInputStream.readUnsignedShort();
        String string = q2.E(n2);
        char c2 = string.charAt(0);
        if (c2 < 'M') {
            if (c2 < 'E') {
                if (string.equals("AnnotationDefault")) {
                    return new b(q2, n2, dataInputStream);
                }
                if (string.equals("BootstrapMethods")) {
                    return new j(q2, n2, dataInputStream);
                }
                if (string.equals("Code")) {
                    return new y(q2, n2, dataInputStream);
                }
                if (string.equals("ConstantValue")) {
                    return new R(q2, n2, dataInputStream);
                }
                if (string.equals("Deprecated")) {
                    return new S(q2, n2, dataInputStream);
                }
            } else {
                if (string.equals("EnclosingMethod")) {
                    return new Y(q2, n2, dataInputStream);
                }
                if (string.equals("Exceptions")) {
                    return new ab(q2, n2, dataInputStream);
                }
                if (string.equals("InnerClasses")) {
                    return new af(q2, n2, dataInputStream);
                }
                if (string.equals("LineNumberTable")) {
                    return new ak(q2, n2, dataInputStream);
                }
                if (string.equals("LocalVariableTable")) {
                    return new am(q2, n2, dataInputStream);
                }
                if (string.equals("LocalVariableTypeTable")) {
                    return new an(q2, n2, dataInputStream);
                }
            }
        } else if (c2 < 'S') {
            if (string.equals("MethodParameters")) {
                return new at(q2, n2, dataInputStream);
            }
            if (string.equals("RuntimeVisibleAnnotations") || string.equals("RuntimeInvisibleAnnotations")) {
                return new c(q2, n2, dataInputStream);
            }
            if (string.equals("RuntimeVisibleParameterAnnotations") || string.equals("RuntimeInvisibleParameterAnnotations")) {
                return new az(q2, n2, dataInputStream);
            }
            if (string.equals("RuntimeVisibleTypeAnnotations") || string.equals("RuntimeInvisibleTypeAnnotations")) {
                return new bn(q2, n2, dataInputStream);
            }
        } else {
            if (string.equals("Signature")) {
                return new aA(q2, n2, dataInputStream);
            }
            if (string.equals("SourceFile")) {
                return new aO(q2, n2, dataInputStream);
            }
            if (string.equals("Synthetic")) {
                return new bm(q2, n2, dataInputStream);
            }
            if (string.equals("StackMap")) {
                return new aP(q2, n2, dataInputStream);
            }
            if (string.equals("StackMapTable")) {
                return new aZ(q2, n2, dataInputStream);
            }
        }
        return new h(q2, n2, dataInputStream);
    }

    public String c() {
        return this.c.E(this.d);
    }

    public Q d() {
        return this.c;
    }

    public int e() {
        return this.e.length + 6;
    }

    public byte[] f() {
        return this.e;
    }

    public void a(byte[] arrby) {
        this.e = arrby;
    }

    public h a(Q q2, Map map) {
        int n2 = this.e.length;
        byte[] arrby = this.e;
        byte[] arrby2 = new byte[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            arrby2[i2] = arrby[i2];
        }
        return new h(q2, this.c(), arrby2);
    }

    void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.d);
        dataOutputStream.writeInt(this.e.length);
        if (this.e.length > 0) {
            dataOutputStream.write(this.e);
        }
    }

    static int a(ArrayList arrayList) {
        int n2 = 0;
        int n3 = arrayList.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            h h2 = (h)arrayList.get(i2);
            n2 += h2.e();
        }
        return n2;
    }

    static h a(ArrayList arrayList, String string) {
        if (arrayList == null) {
            return null;
        }
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            h h2 = (h)listIterator.next();
            if (!h2.c().equals(string)) continue;
            return h2;
        }
        return null;
    }

    static synchronized void b(ArrayList arrayList, String string) {
        if (arrayList == null) {
            return;
        }
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            h h2 = (h)listIterator.next();
            if (!h2.c().equals(string)) continue;
            listIterator.remove();
        }
    }

    static void a(ArrayList arrayList, DataOutputStream dataOutputStream) throws IOException {
        if (arrayList == null) {
            return;
        }
        int n2 = arrayList.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            h h2 = (h)arrayList.get(i2);
            h2.a(dataOutputStream);
        }
    }

    static ArrayList a(ArrayList arrayList, Q q2) {
        if (arrayList == null) {
            return null;
        }
        ArrayList<h> arrayList2 = new ArrayList<h>();
        int n2 = arrayList.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            h h2 = (h)arrayList.get(i2);
            arrayList2.add(h2.a(q2, null));
        }
        return arrayList2;
    }

    void a(String string, String string2) {
    }

    void a(Map map) {
    }

    static void a(List list, String string, String string2) {
        for (h h2 : list) {
            h2.a(string, string2);
        }
    }

    static void a(List list, Map map) {
        for (h h2 : list) {
            h2.a(map);
        }
    }

    void b(Map map) {
    }

    static void b(List list, Map map) {
        for (h h2 : list) {
            h2.b(map);
        }
    }
}

