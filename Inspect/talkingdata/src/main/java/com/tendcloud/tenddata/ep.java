/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.eo;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

class ep {
    protected byte[] a = new byte[9];
    protected OutputStream b;

    ep(OutputStream outputStream) {
        this.b = outputStream;
    }

    ep a(BigInteger bigInteger) {
        if (bigInteger == null) {
            return this.b();
        }
        return this.b(bigInteger);
    }

    ep a(boolean bl2) {
        if (bl2) {
            return this.c();
        }
        return this.a();
    }

    static int b(boolean bl2) {
        return 1;
    }

    ep a(Boolean bl2) {
        if (bl2 == null) {
            return this.b();
        }
        if (bl2.booleanValue()) {
            return this.c();
        }
        return this.a();
    }

    ep a(byte by2) {
        return this.b(by2);
    }

    ep a(Byte by2) {
        if (by2 == null) {
            return this.b();
        }
        return this.b(by2.byteValue());
    }

    ep a(byte[] arrby) {
        if (arrby == null) {
            return this.b();
        }
        this.f(arrby.length);
        return this.d(arrby);
    }

    ep a(Long[] arrlong) {
        if (arrlong == null || arrlong.length == 0) {
            return this.b();
        }
        this.b(arrlong.length);
        Long[] arrlong2 = arrlong;
        int n2 = arrlong2.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            long l2 = arrlong2[i2];
            this.a(l2);
        }
        return this;
    }

    static int b(byte[] arrby) {
        if (null == arrby) {
            return 1;
        }
        return ep.c(arrby.length) + arrby.length;
    }

    ep a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return this.b();
        }
        this.f(byteBuffer.remaining());
        return this.b(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    ep a(double d2) {
        return this.c(d2);
    }

    static int b(double d2) {
        return 9;
    }

    ep a(Double d2) {
        if (d2 == null) {
            return this.b();
        }
        return this.c(d2);
    }

    ep a(float f2) {
        return this.c(f2);
    }

    static int b(float f2) {
        return 5;
    }

    ep a(Float f2) {
        if (f2 == null) {
            return this.b();
        }
        return this.c(f2.floatValue());
    }

    ep a(int n2) {
        return this.d(n2);
    }

    ep a(Integer n2) {
        if (n2 == null) {
            return this.b();
        }
        return this.d(n2);
    }

    ep a(List list) {
        if (list == null) {
            return this.b();
        }
        this.b(list.size());
        for (String string : list) {
            this.a(string);
        }
        return this;
    }

    ep a(long l2) {
        return this.b(l2);
    }

    ep a(Long l2) {
        if (l2 == null) {
            return this.b();
        }
        return this.b(l2);
    }

    ep a(Map map) {
        if (map == null) {
            return this.b();
        }
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        for (Object object : map.keySet()) {
            Object object2 = map.get(object);
            if (object2 instanceof String) {
                hashMap.put(object, object2.toString());
                continue;
            }
            if (!(object2 instanceof Number)) continue;
            hashMap.put(object, ((Number)object2).doubleValue());
        }
        this.e(hashMap.size());
        for (Map.Entry entry : hashMap.entrySet()) {
            this.a((String)entry.getKey());
            Object v2 = entry.getValue();
            if (v2 instanceof Number) {
                this.a(((Number)v2).doubleValue());
                continue;
            }
            if (!(v2 instanceof String)) continue;
            this.a(v2.toString());
        }
        return this;
    }

    ep a(eo eo2) {
        if (eo2 == null) {
            return this.b();
        }
        eo2.messagePack(this);
        return this;
    }

    ep a(short s2) {
        return this.b(s2);
    }

    ep a(Short s2) {
        if (s2 == null) {
            return this.b();
        }
        return this.b(s2);
    }

    ep a(String string) {
        if (string == null) {
            return this.b("");
        }
        return this.b(string);
    }

    ep b(int n2) {
        if (n2 < 16) {
            int n3 = 144 | n2;
            this.b.write((byte)n3);
        } else if (n2 < 65536) {
            this.a[0] = -36;
            this.a[1] = (byte)(n2 >> 8);
            this.a[2] = (byte)(n2 >> 0);
            this.b.write(this.a, 0, 3);
        } else {
            this.a[0] = -35;
            this.a[1] = (byte)(n2 >> 24);
            this.a[2] = (byte)(n2 >> 16);
            this.a[3] = (byte)(n2 >> 8);
            this.a[4] = (byte)(n2 >> 0);
            this.b.write(this.a, 0, 5);
        }
        return this;
    }

    static int c(int n2) {
        if (n2 < 16) {
            return 1;
        }
        if (n2 < 65536) {
            return 3;
        }
        return 5;
    }

    ep b(BigInteger bigInteger) {
        if (bigInteger.bitLength() <= 63) {
            return this.b(bigInteger.longValue());
        }
        if (bigInteger.bitLength() <= 64 && bigInteger.signum() >= 0) {
            this.a[0] = -49;
            byte[] arrby = bigInteger.toByteArray();
            this.a[1] = arrby[arrby.length - 8];
            this.a[2] = arrby[arrby.length - 7];
            this.a[3] = arrby[arrby.length - 6];
            this.a[4] = arrby[arrby.length - 5];
            this.a[5] = arrby[arrby.length - 4];
            this.a[6] = arrby[arrby.length - 3];
            this.a[7] = arrby[arrby.length - 2];
            this.a[8] = arrby[arrby.length - 1];
            this.b.write(this.a, 0, 9);
            return this;
        }
        throw new IOException("can't pack BigInteger larger than 0xffffffffffffffff");
    }

    ep c(boolean bl2) {
        return bl2 ? this.c() : this.a();
    }

    ep b(byte by2) {
        if (by2 < -32) {
            this.a[0] = -48;
            this.a[1] = by2;
            this.b.write(this.a, 0, 2);
        } else {
            this.b.write(by2);
        }
        return this;
    }

    ep c(byte[] arrby) {
        this.f(arrby.length);
        return this.b(arrby, 0, arrby.length);
    }

    ep a(byte[] arrby, int n2, int n3) {
        this.f(n3);
        return this.b(arrby, n2, n3);
    }

    ep b(ByteBuffer byteBuffer) {
        this.f(byteBuffer.remaining());
        return this.b(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    ep c(double d2) {
        this.a[0] = -53;
        long l2 = Double.doubleToRawLongBits(d2);
        this.a[1] = (byte)(l2 >> 56);
        this.a[2] = (byte)(l2 >> 48);
        this.a[3] = (byte)(l2 >> 40);
        this.a[4] = (byte)(l2 >> 32);
        this.a[5] = (byte)(l2 >> 24);
        this.a[6] = (byte)(l2 >> 16);
        this.a[7] = (byte)(l2 >> 8);
        this.a[8] = (byte)(l2 >> 0);
        this.b.write(this.a, 0, 9);
        return this;
    }

    ep a() {
        this.b.write(-62);
        return this;
    }

    ep c(float f2) {
        this.a[0] = -54;
        int n2 = Float.floatToRawIntBits(f2);
        this.a[1] = (byte)(n2 >> 24);
        this.a[2] = (byte)(n2 >> 16);
        this.a[3] = (byte)(n2 >> 8);
        this.a[4] = (byte)(n2 >> 0);
        this.b.write(this.a, 0, 5);
        return this;
    }

    ep d(int n2) {
        if (n2 < -32) {
            if (n2 < -32768) {
                this.a[0] = -46;
                this.a[1] = (byte)(n2 >> 24);
                this.a[2] = (byte)(n2 >> 16);
                this.a[3] = (byte)(n2 >> 8);
                this.a[4] = (byte)(n2 >> 0);
                this.b.write(this.a, 0, 5);
            } else if (n2 < -128) {
                this.a[0] = -47;
                this.a[1] = (byte)(n2 >> 8);
                this.a[2] = (byte)(n2 >> 0);
                this.b.write(this.a, 0, 3);
            } else {
                this.a[0] = -48;
                this.a[1] = (byte)n2;
                this.b.write(this.a, 0, 2);
            }
        } else if (n2 < 128) {
            this.b.write((byte)n2);
        } else if (n2 < 256) {
            this.a[0] = -52;
            this.a[1] = (byte)n2;
            this.b.write(this.a, 0, 2);
        } else if (n2 < 65536) {
            this.a[0] = -51;
            this.a[1] = (byte)(n2 >> 8);
            this.a[2] = (byte)(n2 >> 0);
            this.b.write(this.a, 0, 3);
        } else {
            this.a[0] = -50;
            this.a[1] = (byte)(n2 >> 24);
            this.a[2] = (byte)(n2 >> 16);
            this.a[3] = (byte)(n2 >> 8);
            this.a[4] = (byte)(n2 >> 0);
            this.b.write(this.a, 0, 5);
        }
        return this;
    }

    ep b(long l2) {
        if (l2 < -32) {
            if (l2 < -32768) {
                if (l2 < Integer.MIN_VALUE) {
                    this.a[0] = -45;
                    this.a[1] = (byte)(l2 >> 56);
                    this.a[2] = (byte)(l2 >> 48);
                    this.a[3] = (byte)(l2 >> 40);
                    this.a[4] = (byte)(l2 >> 32);
                    this.a[5] = (byte)(l2 >> 24);
                    this.a[6] = (byte)(l2 >> 16);
                    this.a[7] = (byte)(l2 >> 8);
                    this.a[8] = (byte)(l2 >> 0);
                    this.b.write(this.a, 0, 9);
                } else {
                    this.a[0] = -46;
                    this.a[1] = (byte)(l2 >> 24);
                    this.a[2] = (byte)(l2 >> 16);
                    this.a[3] = (byte)(l2 >> 8);
                    this.a[4] = (byte)(l2 >> 0);
                    this.b.write(this.a, 0, 5);
                }
            } else if (l2 < -128) {
                this.a[0] = -47;
                this.a[1] = (byte)(l2 >> 8);
                this.a[2] = (byte)(l2 >> 0);
                this.b.write(this.a, 0, 3);
            } else {
                this.a[0] = -48;
                this.a[1] = (byte)l2;
                this.b.write(this.a, 0, 2);
            }
        } else if (l2 < 128) {
            this.b.write((byte)l2);
        } else if (l2 < 65536) {
            if (l2 < 256) {
                this.a[0] = -52;
                this.a[1] = (byte)l2;
                this.b.write(this.a, 0, 2);
            } else {
                this.a[0] = -51;
                this.a[1] = (byte)((l2 & 65280) >> 8);
                this.a[2] = (byte)((l2 & 255) >> 0);
                this.b.write(this.a, 0, 3);
            }
        } else if (l2 < 0x100000000L) {
            this.a[0] = -50;
            this.a[1] = (byte)((l2 & -16777216) >> 24);
            this.a[2] = (byte)((l2 & 0xFF0000) >> 16);
            this.a[3] = (byte)((l2 & 65280) >> 8);
            this.a[4] = (byte)((l2 & 255) >> 0);
            this.b.write(this.a, 0, 5);
        } else {
            this.a[0] = -49;
            this.a[1] = (byte)(l2 >> 56);
            this.a[2] = (byte)(l2 >> 48);
            this.a[3] = (byte)(l2 >> 40);
            this.a[4] = (byte)(l2 >> 32);
            this.a[5] = (byte)(l2 >> 24);
            this.a[6] = (byte)(l2 >> 16);
            this.a[7] = (byte)(l2 >> 8);
            this.a[8] = (byte)(l2 >> 0);
            this.b.write(this.a, 0, 9);
        }
        return this;
    }

    static int c(long l2) {
        if (l2 < -32) {
            if (l2 < -32768) {
                if (l2 < Integer.MIN_VALUE) {
                    return 9;
                }
                return 5;
            }
            if (l2 < -128) {
                return 3;
            }
            return 2;
        }
        if (l2 < 128) {
            return 1;
        }
        if (l2 < 65536) {
            if (l2 < 256) {
                return 2;
            }
            return 3;
        }
        if (l2 < 0x100000000L) {
            return 5;
        }
        return 9;
    }

    ep e(int n2) {
        if (n2 < 16) {
            int n3 = 128 | n2;
            this.b.write((byte)n3);
        } else if (n2 < 65536) {
            this.a[0] = -34;
            this.a[1] = (byte)(n2 >> 8);
            this.a[2] = (byte)(n2 >> 0);
            this.b.write(this.a, 0, 3);
        } else {
            this.a[0] = -33;
            this.a[1] = (byte)(n2 >> 24);
            this.a[2] = (byte)(n2 >> 16);
            this.a[3] = (byte)(n2 >> 8);
            this.a[4] = (byte)(n2 >> 0);
            this.b.write(this.a, 0, 5);
        }
        return this;
    }

    ep b() {
        this.b.write(-64);
        return this;
    }

    ep f(int n2) {
        if (n2 < 32) {
            int n3 = 160 | n2;
            this.b.write((byte)n3);
        } else if (n2 < 65536) {
            this.a[0] = -38;
            this.a[1] = (byte)(n2 >> 8);
            this.a[2] = (byte)(n2 >> 0);
            this.b.write(this.a, 0, 3);
        } else {
            this.a[0] = -37;
            this.a[1] = (byte)(n2 >> 24);
            this.a[2] = (byte)(n2 >> 16);
            this.a[3] = (byte)(n2 >> 8);
            this.a[4] = (byte)(n2 >> 0);
            this.b.write(this.a, 0, 5);
        }
        return this;
    }

    ep d(byte[] arrby) {
        this.b.write(arrby);
        return this;
    }

    ep b(byte[] arrby, int n2, int n3) {
        this.b.write(arrby, n2, n3);
        return this;
    }

    ep b(short s2) {
        if (s2 < -32) {
            if (s2 < -128) {
                this.a[0] = -47;
                this.a[1] = (byte)(s2 >> 8);
                this.a[2] = (byte)(s2 >> 0);
                this.b.write(this.a, 0, 3);
            } else {
                this.a[0] = -48;
                this.a[1] = (byte)s2;
                this.b.write(this.a, 0, 2);
            }
        } else if (s2 < 128) {
            this.b.write((byte)s2);
        } else if (s2 < 256) {
            this.a[0] = -52;
            this.a[1] = (byte)s2;
            this.b.write(this.a, 0, 2);
        } else {
            this.a[0] = -51;
            this.a[1] = (byte)(s2 >> 8);
            this.a[2] = (byte)(s2 >> 0);
            this.b.write(this.a, 0, 3);
        }
        return this;
    }

    ep b(String string) {
        byte[] arrby = string.getBytes("UTF-8");
        this.f(arrby.length);
        return this.d(arrby);
    }

    static int c(String string) {
        try {
            byte[] arrby = string.getBytes("UTF-8");
            return ep.c(arrby.length) + arrby.length;
        }
        catch (Exception var1_2) {
            return 0;
        }
    }

    ep c() {
        this.b.write(-61);
        return this;
    }
}

