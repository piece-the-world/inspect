/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 *  android.os.Message
 *  android.os.SystemClock
 */
package com.tendcloud.tenddata;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.tendcloud.tenddata.ab;
import com.tendcloud.tenddata.cc;
import com.tendcloud.tenddata.ed;
import com.tendcloud.tenddata.ef;
import com.tendcloud.tenddata.eg;
import com.tendcloud.tenddata.ek;
import com.tendcloud.tenddata.gg;
import java.io.ByteArrayOutputStream;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

final class ej {
    private static volatile ej a = null;
    private final CRC32 b = new CRC32();
    private Handler c = null;
    private final HandlerThread d = new HandlerThread("NetWorkThread");
    private static ef e = null;

    ej() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static ej a() {
        if (a != null) return a;
        reference var0 = ej.class;
        synchronized (ej.class) {
            if (a != null) return a;
            {
                a = new ej();
            }
            // ** MonitorExit[var0] (shouldn't be in output)
            return a;
        }
    }

    public void onTDEBEventSubmitRequest(ef ef2) {
        Message message = new Message();
        message.obj = ef2;
        this.c.sendMessage(message);
    }

    private final void c() {
        eg eg2 = new eg();
        eg2.a = null;
        eg2.b = null;
        try {
            gg.a().post(eg2);
        }
        catch (Throwable var2_2) {
            // empty catch block
        }
    }

    private final synchronized void a(String string, String string2, String string3, String string4, byte[] arrby, Object object, int n2, boolean bl2) {
        try {
            byte[] arrby2 = null;
            arrby2 = bl2 ? arrby : this.a(arrby);
            this.b.reset();
            this.b.update(arrby2);
            String string5 = n2 == 0 ? string + "?crc=" + Long.toHexString(this.b.getValue()) : string + "?crc=" + Long.toHexString(this.b.getValue());
            cc.d d2 = cc.a(ab.mContext, string3, string2, string5, string4, arrby2);
            ab.g = SystemClock.elapsedRealtime();
            eg eg2 = new eg();
            eg2.a.putInt("statusCode", d2.a);
            eg2.a.putString("responseMsg", d2.b);
            eg2.a.putString("action", ej.e.d);
            eg2.b = object;
            eg2.c = n2;
            try {
                gg.a().post(eg2);
            }
            catch (Throwable var13_14) {}
        }
        catch (Throwable var9_10) {
            // empty catch block
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final byte[] a(byte[] arrby) {
        byte[] arrby2;
        ByteArrayOutputStream byteArrayOutputStream;
        Deflater deflater = new Deflater(9);
        deflater.setInput(arrby);
        byteArrayOutputStream = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream(arrby.length);
            deflater.finish();
            arrby2 = new byte[1024];
            while (!deflater.finished()) {
                int n2 = deflater.deflate(arrby2);
                byteArrayOutputStream.write(arrby2, 0, n2);
            }
        }
        finally {
            try {
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
            }
            catch (Exception var4_5) {}
        }
        byteArrayOutputStream.close();
        arrby2 = byteArrayOutputStream.toByteArray();
        ed.a("Original: " + arrby.length);
        ed.a("Compressed: " + arrby2.length);
        return arrby2;
    }

    static /* synthetic */ ef a(ef ef2) {
        e = ef2;
        return e;
    }

    static /* synthetic */ ef b() {
        return e;
    }

    static /* synthetic */ void a(ej ej2) {
        ej2.c();
    }

    static /* synthetic */ void a(ej ej2, String string, String string2, String string3, String string4, byte[] arrby, Object object, int n2, boolean bl2) {
        ej2.a(string, string2, string3, string4, arrby, object, n2, bl2);
    }

    static {
        ej.a().d.start();
        ej.a().c = new ek(ej.a().d.getLooper());
    }
}

