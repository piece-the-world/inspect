/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.e;

import com.growingio.d.a.d.a.a;
import com.growingio.d.a.d.a.e;
import com.growingio.d.a.d.a.f;
import com.growingio.d.a.d.v;
import com.growingio.d.a.e.d;
import com.growingio.d.a.r;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

class g
extends v {
    final /* synthetic */ r a;

    g(int n2, int n3, String string, String string2, String string3, String[] arrstring, r r2) {
        this.a = r2;
        super(n2, n3, string, string2, string3, arrstring);
    }

    @Override
    public void b() {
        a<com.growingio.d.a.d.a.d> a2 = new a<com.growingio.d.a.d.a.d>(new e());
        try {
            a2.a("dummy", this);
        }
        catch (Exception var2_2) {
            if (var2_2 instanceof IndexOutOfBoundsException && this.bp_ == 0 && this.bo_ == 0) {
                throw new RuntimeException("Data flow checking option requires valid, non zero maxLocals and maxStack values.");
            }
            var2_2.printStackTrace();
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter, true);
            d.a(this, a2, printWriter);
            printWriter.close();
            throw new RuntimeException(var2_2.getMessage() + ' ' + stringWriter.toString());
        }
        this.a(this.a);
    }
}

