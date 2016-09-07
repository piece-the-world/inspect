/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.LocalServerSocket
 *  android.os.Handler
 */
package com.tendcloud.tenddata;

import android.content.Context;
import android.content.Intent;
import android.net.LocalServerSocket;
import android.os.Handler;
import com.tendcloud.tenddata.bd;
import com.tendcloud.tenddata.bh;
import com.tendcloud.tenddata.bj;
import com.tendcloud.tenddata.bk;
import com.tendcloud.tenddata.bs;
import com.tendcloud.tenddata.bt;
import com.tendcloud.tenddata.bu;
import com.tendcloud.tenddata.bv;
import com.tendcloud.tenddata.bw;
import com.tendcloud.tenddata.bz;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class br {
    private static String a = "PushSDK";
    private static br b = null;
    private static int c = 0;
    private static long d = 2000;
    private Context e;
    private LocalServerSocket f;
    private bz g;
    private BlockingQueue h;
    private Handler i = new Handler();
    private boolean j;

    private br(Context context) {
        this.e = context;
        this.g = bz.a(bw.a(context), context, new bs(this, context));
        this.h = new LinkedBlockingQueue(1);
        new Thread(new bt(this)).start();
    }

    public static synchronized br a(Context context) {
        if (b == null) {
            b = new br(context);
        }
        return b;
    }

    public synchronized void initPushSDK(Intent intent) {
        String string;
        bh.a(a, "Create PushSDK from : " + this.e.getPackageName());
        if (intent != null) {
            string = intent.getStringExtra("service-cmd");
            if (string != null && string.equals("service-ping")) {
                if (c < 3) {
                    bw.a(this.e, d);
                    ++c;
                } else if (c == 3) {
                    this.h.offer(string);
                    ++c;
                } else {
                    this.h.offer(string);
                    bw.a(this.e, bz.a);
                }
            } else if (string != null && string.equals("service-start")) {
                if (c < 4) {
                    bw.a(this.e, d);
                    ++c;
                } else {
                    bw.a(this.e, bz.a);
                }
            }
        }
        string = "";
        try {
            string = bw.d(this.e);
            this.f = new LocalServerSocket(string);
            this.j = true;
            Thread thread = new Thread(new a(null));
            thread.setName("t-read");
            thread.start();
        }
        catch (Exception var3_4) {
            bh.d(a, String.format("fail to get global lock, %s, retry later", string));
        }
    }

    public synchronized boolean a() {
        String string3;
        List list = bw.e(this.e);
        int n2 = bk.a(this.e, "");
        String string2 = null;
        for (String string3 : list) {
            int n3 = bk.a(this.e, string3);
            if (n3 <= n2) continue;
            string2 = string3;
            n2 = n3;
        }
        if (this.f != null && string2 != null) {
            try {
                this.f.close();
                this.f = null;
                this.j = false;
            }
            catch (IOException var4_5) {
                bh.b(a, "release global lock err: " + var4_5.toString());
                var4_5.printStackTrace();
            }
        }
        boolean bl2 = false;
        if (string2 != null) {
            bl2 = true;
            bw.d(this.e, string2);
        }
        string3 = string2;
        this.i.postDelayed((Runnable)new bu(this, list, string3), 200);
        return bl2;
    }

    public synchronized void b() {
        List list = bw.f(this.e);
        this.i.postDelayed((Runnable)new bv(this, list), 200);
    }

    public synchronized void c() {
        try {
            if (this.f != null) {
                this.f.close();
                this.f = null;
            }
            this.g.c();
            this.j = false;
        }
        catch (Throwable var1_1) {
            bh.a(a, "stop global lock err: ", var1_1);
            var1_1.printStackTrace();
        }
    }

    static /* synthetic */ BlockingQueue a(br br2) {
        return br2.h;
    }

    class a
    implements Runnable {
        private a() {
        }

        @Override
        public void run() {
            bh.a(a, "start read");
            while (br.this.j) {
                block9 : {
                    if (bj.d(br.this.e)) {
                        try {
                            bd.a a2 = bd.a(br.this.e);
                            if (a2.a()) {
                                br.this.g.connect(a2);
                                while (br.this.j) {
                                    br.this.g.b();
                                }
                                break block9;
                            }
                            bh.e(a, "loc failed");
                        }
                        catch (Throwable var1_2) {
                            int n2 = (Integer)bk.b("mpush_shared_line_error", 0);
                            bk.a("mpush_shared_line_error", n2 + 1);
                            bh.b(a, "read err :" + var1_2.getMessage());
                        }
                    } else {
                        bh.e(a, "Network is not connected");
                    }
                }
                if (!br.this.j) continue;
                try {
                    Thread.sleep(100000);
                }
                catch (InterruptedException var1_3) {
                    var1_3.printStackTrace();
                }
            }
            br.this.g.c();
        }

        /* synthetic */ a(bs bs2) {
            this();
        }
    }

}

