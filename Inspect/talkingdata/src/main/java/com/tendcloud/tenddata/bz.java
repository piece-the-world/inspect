/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  org.json.JSONObject
 */
package com.tendcloud.tenddata;

import android.content.Context;
import android.content.Intent;
import com.apptalkingdata.push.service.Msg;
import com.apptalkingdata.push.service.Pb;
import com.tendcloud.tenddata.ax;
import com.tendcloud.tenddata.bb;
import com.tendcloud.tenddata.bd;
import com.tendcloud.tenddata.bg;
import com.tendcloud.tenddata.bh;
import com.tendcloud.tenddata.bw;
import com.tendcloud.tenddata.ca;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.List;
import org.json.JSONObject;

public class bz {
    private final String b = bz.class.getName();
    public static long a = 270000;
    private static bz c;
    private InputStream d;
    private OutputStream e;
    private long f;
    private final String g;
    private final a h;
    private final Context i;

    public static synchronized bz a(String string, Context context, a a2) {
        if (c == null) {
            c = new bz(string, a2, context);
        }
        return c;
    }

    private bz(String string, a a2, Context context) {
        this.g = string;
        this.h = a2;
        this.i = context;
    }

    public void connect(bd.a a2) {
        this.c();
        this.f = 0;
        bh.a(this.b, " init ip: " + a2.a + " port: " + a2.b);
        Socket socket = new Socket();
        socket.setSoTimeout(600000);
        socket.connect(new InetSocketAddress(a2.a, a2.b), 8000);
        this.d = socket.getInputStream();
        this.e = socket.getOutputStream();
        bh.a(this.b, " connected");
        this.d();
    }

    private void d() {
        String string = "aes,ack|||" + this.g;
        byte[] arrby = bw.a(string.getBytes());
        this.e.write(arrby);
        this.e.flush();
    }

    public void a() {
        try {
            if (this.e != null) {
                Pb.Ping ping = new Pb.Ping();
                ping.seq = ++this.f;
                byte[] arrby = bw.a(ping);
                this.e.write(bw.a(ax.a(this.g, arrby)));
                this.e.flush();
                bh.a(this.b, " done: ping");
            } else {
                this.c();
                bh.a(this.b, "not connected, skip: ping");
            }
        }
        catch (Throwable var1_2) {
            this.c();
            bh.b(this.b, var1_2.getMessage());
        }
    }

    private void a(String string) {
        try {
            if (this.e != null) {
                Pb.Ack ack = new Pb.Ack();
                ack.id = string;
                byte[] arrby = bw.a(ack);
                this.e.write(bw.a(ax.a(this.g, arrby)));
                this.e.flush();
                bh.a(this.b, " done: uploadData");
            } else {
                bh.b(this.b, "not connected, skip: uploadData");
            }
        }
        catch (Throwable var2_3) {
            bh.b(this.b, var2_3.getMessage());
        }
    }

    private boolean b(String string) {
        boolean bl2 = bg.g(string);
        if (bl2) {
            bh.e(this.b, "msgId: " + string + " exists");
        } else {
            bg.f(string);
        }
        return !bl2;
    }

    private void a(byte[] arrby) {
        if (arrby.length > 1) {
            switch (arrby[0]) {
                case 1: {
                    Pb.Ping ping = (Pb.Ping)bw.a(arrby, Pb.Ping.class);
                    this.f = ping.seq;
                    this.a();
                    break;
                }
                case 0: {
                    Pb.Msg msg = (Pb.Msg)bw.a(arrby, Pb.Msg.class);
                    if (msg == null) break;
                    this.a(msg);
                }
            }
        }
    }

    private void a(Pb.Msg msg) {
        Msg msg2 = bw.a(msg);
        try {
            int n2 = 0;
            JSONObject jSONObject = new JSONObject(msg2.d);
            JSONObject jSONObject2 = new JSONObject();
            String string = jSONObject.optString("id");
            bb.submitExecutor(new ca(this, string));
            if (!this.b(string)) {
                return;
            }
            jSONObject2.put("id", (Object)string);
            jSONObject2.put("app", (Object)jSONObject.optString("app"));
            jSONObject2.put("title", (Object)jSONObject.optString("title"));
            jSONObject2.put("content", (Object)jSONObject.optString("content"));
            if (!jSONObject.isNull("action")) {
                jSONObject2.put("action", (Object)jSONObject.getJSONObject("action"));
                n2 = jSONObject.getJSONObject("action").getInt("tp");
            }
            if (!jSONObject.isNull("ex")) {
                jSONObject2.put("ex", (Object)jSONObject.getJSONObject("ex"));
            }
            bh.d(this.b, jSONObject.toString());
            Intent intent = new Intent();
            if (n2 == 0) {
                intent.setAction("android.talkingdata.action.media.MESSAGE");
                intent.putExtra("mpush_message", jSONObject2.toString());
            } else {
                intent.setAction("android.talkingdata.action.notification.SHOW");
                intent.putExtra("push_show_msg", jSONObject2.toString());
            }
            String string2 = msg.app;
            String string3 = jSONObject.optString("app");
            if (string2.equals("com.mrocker.talkingdata.mpush")) {
                List list = bw.e(this.i);
                for (String string4 : list) {
                    intent.setPackage(string4);
                    this.h.onMsg(intent);
                }
            } else {
                intent.setPackage(string2);
                this.h.onMsg(intent);
            }
        }
        catch (Throwable var3_4) {
            bh.e(this.b, var3_4.getMessage());
        }
    }

    void b() {
        DataInputStream dataInputStream = new DataInputStream(this.d);
        bh.a(this.b, "read: " + dataInputStream);
        int n2 = dataInputStream.readInt();
        byte[] arrby = new byte[n2];
        dataInputStream.readFully(arrby);
        byte[] arrby2 = ax.b(this.g, arrby);
        bh.a(this.b, "onData: " + new String(arrby2));
        this.a(arrby2);
    }

    public void c() {
        bh.d(this.b, "close: " + this.d);
        try {
            this.d.close();
            this.e.close();
        }
        catch (Throwable var1_1) {
            // empty catch block
        }
        this.d = null;
        this.e = null;
    }

    static /* synthetic */ void a(bz bz2, String string) {
        bz2.a(string);
    }

    public static interface a {
        public void onMsg(Intent var1);
    }

}

