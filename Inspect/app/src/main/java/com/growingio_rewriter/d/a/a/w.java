/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.a;

import com.growingio.d.a.a.x;
import com.growingio.d.a.f;
import com.growingio.d.a.j;
import com.growingio.d.a.r;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class w
extends f {
    private boolean a;
    private boolean b;
    private int c;
    private String d;
    private String[] e;
    private Collection<x> h = new ArrayList<x>();
    private boolean i;
    private Collection<x> j = new ArrayList<x>();
    private Collection<x> k = new ArrayList<x>();

    public w(f f2) {
        this(327680, f2);
        if (this.getClass() != w.class) {
            throw new IllegalStateException();
        }
    }

    protected w(int n2, f f2) {
        super(n2, f2);
    }

    @Override
    public void a(int n2, int n3, String string, String string2, String string3, String[] arrstring) {
        boolean bl2 = this.a = (n3 & 16384) == 0;
        if (this.a) {
            this.d = string;
            this.c = n3;
            this.e = new String[arrstring.length];
            System.arraycopy(arrstring, 0, this.e, 0, arrstring.length);
        }
        super.a(n2, n3, string, string2, string3, arrstring);
    }

    @Override
    public r a(int n2, String string, String string2, String string3, String[] arrstring) {
        if (this.a) {
            if ("<clinit>".equals(string)) {
                this.i = true;
            }
            int n3 = n2 & 3391;
            if ((n2 & 2) == 0) {
                if ("<init>".equals(string)) {
                    this.j.add(new x(string, n3, string2));
                } else if (!"<clinit>".equals(string)) {
                    this.k.add(new x(string, n3, string2));
                }
            }
        }
        return super.a(n2, string, string2, string3, arrstring);
    }

    @Override
    public j a(int n2, String string, String string2, String string3, Object object) {
        if (this.a) {
            if ("serialVersionUID".equals(string)) {
                this.a = false;
                this.b = true;
            }
            if ((n2 & 2) == 0 || (n2 & 136) == 0) {
                int n3 = n2 & 223;
                this.h.add(new x(string, n3, string2));
            }
        }
        return super.a(n2, string, string2, string3, object);
    }

    @Override
    public void a(String string, String string2, String string3, int n2) {
        if (this.d != null && this.d.equals(string)) {
            this.c = n2;
        }
        super.a(string, string2, string3, n2);
    }

    @Override
    public void a() {
        if (this.a && !this.b) {
            try {
                this.a(this.c());
            }
            catch (Throwable var1_1) {
                throw new RuntimeException("Error while computing SVUID for " + this.d, var1_1);
            }
        }
        super.a();
    }

    public boolean b() {
        return this.b;
    }

    protected void a(long l2) {
        j j2 = super.a(24, "serialVersionUID", "J", null, l2);
        if (j2 != null) {
            j2.a();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected long c() throws IOException {
        long l2;
        FilterOutputStream filterOutputStream = null;
        l2 = 0;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            filterOutputStream = new DataOutputStream(byteArrayOutputStream);
            filterOutputStream.writeUTF(this.d.replace('/', '.'));
            int n2 = this.c;
            if ((n2 & 512) != 0) {
                n2 = this.k.size() > 0 ? n2 | 1024 : n2 & -1025;
            }
            filterOutputStream.writeInt(n2 & 1553);
            Arrays.sort(this.e);
            for (int i2 = 0; i2 < this.e.length; ++i2) {
                filterOutputStream.writeUTF(this.e[i2].replace('/', '.'));
            }
            w.a(this.h, (DataOutput)((Object)filterOutputStream), false);
            if (this.i) {
                filterOutputStream.writeUTF("<clinit>");
                filterOutputStream.writeInt(8);
                filterOutputStream.writeUTF("()V");
            }
            w.a(this.j, (DataOutput)((Object)filterOutputStream), true);
            w.a(this.k, (DataOutput)((Object)filterOutputStream), true);
            filterOutputStream.flush();
            byte[] arrby = this.a(byteArrayOutputStream.toByteArray());
            for (int i3 = java.lang.Math.min((int)arrby.length, (int)8) - 1; i3 >= 0; --i3) {
                l2 = l2 << 8 | (long)(arrby[i3] & 255);
            }
        }
        finally {
            if (filterOutputStream != null) {
                filterOutputStream.close();
            }
        }
        return l2;
    }

    protected byte[] a(byte[] arrby) {
        try {
            return MessageDigest.getInstance("SHA").digest(arrby);
        }
        catch (Exception var2_2) {
            throw new UnsupportedOperationException(var2_2.toString());
        }
    }

    private static void a(Collection<x> collection, DataOutput dataOutput, boolean bl2) throws IOException {
        int n2 = collection.size();
        Object[] arrobject = collection.toArray(new x[n2]);
        Arrays.sort(arrobject);
        for (int i2 = 0; i2 < n2; ++i2) {
            dataOutput.writeUTF(arrobject[i2].a);
            dataOutput.writeInt(arrobject[i2].b);
            dataOutput.writeUTF(bl2 ? arrobject[i2].c.replace('/', '.') : arrobject[i2].c);
        }
    }
}

