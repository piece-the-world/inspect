/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.ab;
import com.tendcloud.tenddata.ad;
import com.tendcloud.tenddata.an;
import com.tendcloud.tenddata.k;
import com.tendcloud.tenddata.l;
import com.tendcloud.tenddata.n;
import com.tendcloud.tenddata.w;
import com.tendcloud.tenddata.x;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URI;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

class dl {
    private final a a;
    private final b b;
    private final URI c;
    private static final int d = 30000;
    private static final ByteBuffer e = ByteBuffer.allocate(0);

    dl(URI uRI, a a2, Socket socket) {
        this.a = a2;
        this.c = uRI;
        try {
            this.b = new b(uRI, 30000, socket);
            this.b.o();
        }
        catch (InterruptedException var4_4) {
            throw new Exception(var4_4);
        }
    }

    boolean a() {
        return !this.b.i() && !this.b.g() && !this.b.h();
    }

    BufferedOutputStream b() {
        return new BufferedOutputStream(new c());
    }

    private static String a(ByteBuffer byteBuffer) {
        CharBuffer charBuffer = null;
        try {
            Charset charset = Charset.forName("UTF-8");
            CharsetDecoder charsetDecoder = charset.newDecoder();
            charBuffer = charsetDecoder.decode(byteBuffer);
            byteBuffer.flip();
            return charBuffer.toString();
        }
        catch (Exception var2_3) {
            var2_3.printStackTrace();
            return null;
        }
    }

    class c
    extends OutputStream {
        private c() {
        }

        @Override
        public void write(int n2) {
            byte[] arrby = new byte[]{(byte)n2};
            this.write(arrby, 0, 1);
        }

        @Override
        public void write(byte[] arrby) {
            this.write(arrby, 0, arrby.length);
        }

        @Override
        public void write(byte[] arrby, int n2, int n3) {
            ByteBuffer byteBuffer = ByteBuffer.wrap(arrby, n2, n3);
            try {
                dl.this.b.a(ad.a.b, byteBuffer, false);
            }
            catch (x var5_5) {
                var5_5.printStackTrace();
            }
            catch (w var5_6) {
                var5_6.printStackTrace();
            }
        }

        @Override
        public void close() {
            try {
                dl.this.b.a(ad.a.b, e, true);
            }
            catch (x var1_1) {
                var1_1.printStackTrace();
            }
            catch (w var1_2) {
                var1_2.printStackTrace();
            }
        }
    }

    class b
    extends k {
        b(URI uRI, int n2, Socket socket) {
            super(uRI, new n(), null, n2);
            this.setSocket(socket);
        }

        @Override
        public void onOpen(an an2) {
            ab.a(true);
        }

        @Override
        public void onMessage(String string) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                String string2 = jSONObject.getString("type");
                if (string2.equals("device_info_request")) {
                    dl.this.a.a();
                } else if (string2.equals("snapshot_request")) {
                    dl.this.a.sendSnapshot(jSONObject);
                } else if (string2.equals("change_request")) {
                    dl.this.a.performEdit(jSONObject);
                } else if (string2.equals("dynamic_event_request")) {
                    dl.this.a.bindEvents(jSONObject);
                } else if (string2.equals("clear_request")) {
                    dl.this.a.clearEdits(jSONObject);
                } else if (string2.equals("tweak_request")) {
                    dl.this.a.setTweaks(jSONObject);
                }
            }
            catch (JSONException var2_3) {
                // empty catch block
            }
        }

        @Override
        public void b(int n2, String string, boolean bl2) {
            dl.this.a.b();
        }

        @Override
        public void onError(Exception exception) {
            if (exception == null || exception.getMessage() != null) {
                // empty if block
            }
        }
    }

    static interface a {
        public void sendSnapshot(JSONObject var1);

        public void performEdit(JSONObject var1);

        public void clearEdits(JSONObject var1);

        public void bindEvents(JSONObject var1);

        public void setTweaks(JSONObject var1);

        public void a();

        public void b();
    }

}

