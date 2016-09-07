/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
package com.tendcloud.tenddata;

import android.os.SystemClock;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

class ei {
    private static final String a = "SntpClient";
    private static final int b = 16;
    private static final int c = 24;
    private static final int d = 32;
    private static final int e = 40;
    private static final int f = 48;
    private static final int g = 123;
    private static final int h = 3;
    private static final int i = 3;
    private static final long j = 2208988800L;
    private long k;
    private long l;
    private long m;

    ei() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(String string, int n2) {
        DatagramSocket datagramSocket = null;
        try {
            datagramSocket = new DatagramSocket();
            datagramSocket.setSoTimeout(n2);
            InetAddress inetAddress = InetAddress.getByName(string);
            byte[] arrby = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(arrby, arrby.length, inetAddress, 123);
            arrby[0] = 27;
            long l2 = System.currentTimeMillis();
            long l3 = SystemClock.elapsedRealtime();
            this.a(arrby, 40, l2);
            datagramSocket.send(datagramPacket);
            DatagramPacket datagramPacket2 = new DatagramPacket(arrby, arrby.length);
            datagramSocket.receive(datagramPacket2);
            long l4 = SystemClock.elapsedRealtime();
            long l5 = l2 + (l4 - l3);
            long l6 = this.b(arrby, 24);
            long l7 = this.b(arrby, 32);
            long l8 = this.b(arrby, 40);
            long l9 = l4 - l3 - (l8 - l7);
            long l10 = (l7 - l6 + (l8 - l5)) / 2;
            this.k = l5 + l10;
            this.l = l4;
            this.m = l9;
        }
        catch (Exception var4_5) {
            boolean bl2 = false;
            return bl2;
        }
        finally {
            if (datagramSocket != null) {
                datagramSocket.close();
            }
        }
        return true;
    }

    public long a() {
        return this.k;
    }

    public long b() {
        return this.l;
    }

    public long c() {
        return this.m;
    }

    private long a(byte[] arrby, int n2) {
        int n3 = arrby[n2];
        int n4 = arrby[n2 + 1];
        int n5 = arrby[n2 + 2];
        int n6 = arrby[n2 + 3];
        int n7 = (n3 & 128) == 128 ? (n3 & 127) + 128 : n3;
        int n8 = (n4 & 128) == 128 ? (n4 & 127) + 128 : n4;
        int n9 = (n5 & 128) == 128 ? (n5 & 127) + 128 : n5;
        int n10 = (n6 & 128) == 128 ? (n6 & 127) + 128 : n6;
        return ((long)n7 << 24) + ((long)n8 << 16) + ((long)n9 << 8) + (long)n10;
    }

    private long b(byte[] arrby, int n2) {
        long l2 = this.a(arrby, n2);
        long l3 = this.a(arrby, n2 + 4);
        return (l2 - 2208988800L) * 1000 + l3 * 1000 / 0x100000000L;
    }

    private void a(byte[] arrby, int n2, long l2) {
        long l3 = l2 / 1000;
        long l4 = l2 - l3 * 1000;
        arrby[n2++] = (byte)((l3 += 2208988800L) >> 24);
        arrby[n2++] = (byte)(l3 >> 16);
        arrby[n2++] = (byte)(l3 >> 8);
        arrby[n2++] = (byte)(l3 >> 0);
        long l5 = l4 * 0x100000000L / 1000;
        arrby[n2++] = (byte)(l5 >> 24);
        arrby[n2++] = (byte)(l5 >> 16);
        arrby[n2++] = (byte)(l5 >> 8);
        arrby[n2++] = (byte)(Math.random() * 255.0);
    }
}

