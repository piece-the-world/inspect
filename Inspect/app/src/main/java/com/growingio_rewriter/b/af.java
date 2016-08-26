/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.K;
import com.growingio.b.a.T;
import com.growingio.b.a.ac;
import com.growingio.b.a.as;
import com.growingio.b.a.p;
import com.growingio.b.ae;
import com.growingio.b.ag;
import com.growingio.b.ah;
import com.growingio.b.ai;
import com.growingio.b.b;
import com.growingio.b.g;
import com.growingio.b.o;
import com.growingio.b.s;
import com.growingio.b.t;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class af {
    public static void a(o o2) throws b, ae {
        try {
            o2.e("serialVersionUID");
            return;
        }
        catch (ae var1_1) {
            if (!af.c(o2)) {
                return;
            }
            t t2 = new t(o.k, "serialVersionUID", o2);
            t2.a(26);
            o2.a(t2, "" + af.b(o2) + "L");
            return;
        }
    }

    private static boolean c(o o2) throws ae {
        g g2 = o2.a();
        return o2.a(g2.f("java.io.Serializable"));
    }

    public static long b(o o2) throws b {
        try {
            int n2;
            int n3;
            int n4;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            p p2 = o2.i();
            String string = af.d(o2);
            dataOutputStream.writeUTF(string);
            K[] arrk = o2.M();
            int n5 = o2.c();
            if ((n5 & 512) != 0) {
                n5 = arrk.length > 0 ? (n5 |= 1024) : (n5 &= -1025);
            }
            dataOutputStream.writeInt(n5);
            Object[] arrobject = p2.l();
            for (n3 = 0; n3 < arrobject.length; ++n3) {
                arrobject[n3] = af.a((String)arrobject[n3]);
            }
            Arrays.sort(arrobject);
            for (n3 = 0; n3 < arrobject.length; ++n3) {
                dataOutputStream.writeUTF((String)arrobject[n3]);
            }
            t[] arrt = o2.I();
            Arrays.sort(arrt, new ag());
            for (int i2 = 0; i2 < arrt.length; ++i2) {
                t t2 = arrt[i2];
                int n6 = t2.d();
                if ((n6 & 2) != 0 && (n6 & 136) != 0) continue;
                dataOutputStream.writeUTF(t2.q());
                dataOutputStream.writeInt(n6);
                dataOutputStream.writeUTF(t2.g().d());
            }
            if (p2.o() != null) {
                dataOutputStream.writeUTF("<clinit>");
                dataOutputStream.writeInt(8);
                dataOutputStream.writeUTF("()V");
            }
            s[] arrs = o2.K();
            Arrays.sort(arrs, new ah());
            for (n4 = 0; n4 < arrs.length; ++n4) {
                s s2 = arrs[n4];
                n2 = s2.d();
                if ((n2 & 2) != 0) continue;
                dataOutputStream.writeUTF("<init>");
                dataOutputStream.writeInt(n2);
                dataOutputStream.writeUTF(s2.c().g().replace('/', '.'));
            }
            Arrays.sort(arrk, new ai());
            for (n4 = 0; n4 < arrk.length; ++n4) {
                K k2 = arrk[n4];
                n2 = k2.d() & 3391;
                if ((n2 & 2) != 0) continue;
                dataOutputStream.writeUTF(k2.q());
                dataOutputStream.writeInt(n2);
                dataOutputStream.writeUTF(k2.c().g().replace('/', '.'));
            }
            dataOutputStream.flush();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
            byte[] arrby = messageDigest.digest(byteArrayOutputStream.toByteArray());
            long l2 = 0;
            for (int i3 = java.lang.Math.min((int)arrby.length, (int)8) - 1; i3 >= 0; --i3) {
                l2 = l2 << 8 | (long)(arrby[i3] & 255);
            }
            return l2;
        }
        catch (IOException var1_2) {
            throw new b(var1_2);
        }
        catch (NoSuchAlgorithmException var1_3) {
            throw new b(var1_3);
        }
    }

    private static String d(o o2) {
        return T.b(T.a(o2));
    }

    private static String a(String string) {
        return T.b(T.a(string));
    }
}

