/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Environment
 */
package com.growingio.android.sdk.collection;

import android.content.Context;
import android.os.Environment;
import com.growingio.android.sdk.collection.q;
import com.growingio.android.sdk.utils.f;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

class t
implements Runnable {
    final /* synthetic */ q a;

    t(q q2) {
        this.a = q2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        if (f.c()) {
            FilterInputStream filterInputStream = null;
            FilterOutputStream filterOutputStream = null;
            try {
                String string = Environment.getExternalStorageDirectory().toString();
                String string2 = string + File.separatorChar + ".growingio";
                File file = new File(string2);
                if (file.exists() && file.isDirectory() || file.mkdirs()) {
                    long l2;
                    File file2 = new File(file, q.b(this.a).g().getPackageName() + ".install");
                    if (file2.exists() && (l2 = (filterInputStream = new DataInputStream(new FileInputStream(file2))).readLong()) > 0 && l2 <= q.c(this.a).A()) {
                        q.c(this.a).c(l2);
                        return;
                    }
                    if (q.c(this.a).A() > 0) {
                        filterOutputStream = new DataOutputStream(new FileOutputStream(file2));
                        filterOutputStream.writeLong(q.c(this.a).A());
                    }
                }
            }
            catch (Exception var3_6) {
                var3_6.printStackTrace();
            }
            finally {
                if (filterInputStream != null) {
                    try {
                        filterInputStream.close();
                    }
                    catch (Exception var3_7) {
                        var3_7.printStackTrace();
                    }
                }
                if (filterOutputStream != null) {
                    try {
                        filterOutputStream.close();
                    }
                    catch (Exception var3_9) {
                        var3_9.printStackTrace();
                    }
                }
            }
        }
    }
}

