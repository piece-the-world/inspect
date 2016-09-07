/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  dalvik.system.DexClassLoader
 */
package com.tendcloud.tenddata;

import android.content.Context;
import com.tendcloud.tenddata.cc;
import com.tendcloud.tenddata.cl;
import com.tendcloud.tenddata.cm;
import com.tendcloud.tenddata.cs;
import com.tendcloud.tenddata.u;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.security.MessageDigest;

public class ag {
    private static final String c = "td-cache";
    private static final String d = "td-%.zip";
    private static final String e = "td.tmp-";
    private static final String f = "pref_longtime";
    private static final String g = "td.sdk.digest.";
    u a;
    Context b;
    String h;
    String i;
    String j;
    String k;
    volatile boolean l = false;
    private static final byte[] m = new byte[]{-28, 9, -58, 3, -27, -5, 116, 68, -91, -13, -54, -53, -38, -51, 101, 30, -75, -67, -2, 32, -80, -13, -122, 37, -20, -58, 73, -71, 76, 2, 39, 78, 3, -119, -72, 47, 30, -42, -89, 69, -112, 30, -50, 117, -107, 120, 22, 3, -103, 39, -55, -118, 16, -95, 22, 85, -68, 54, 45, 39, -58, 20, 57, -122, -64, 44, 13, 121, 126, -45, -54, 102, 50, 21, -121, 30, 25, -70, 27, -12, 17, -10, 81, -35, -1, 98, -60, -108, 94, 60, 49, -105, 82, 23, 82, 118, 86, -105, 10, 107, -74, -45, 31, 0, -118, -18, 12, -18, 17, -50, 16, -61, -108, 104, 107, 115, -112, 41, 61, -103, -124, -58, -86, -89, -34, 74, 45, -20, 92, 43, 109, -69, 52, -105, -61, 90, 0, -60, -128, -24, -123, -119, -97, -35, -83, 17, -24, -28, 46, -20, 7, -15, -25, 54, -87, 78, -10, -108, 20, 99, -122, -66, -76, -60, -7, 124, 114, 27, -81, 119, -47, -91, -127, -94, 119, 82, 108, -112, 80, -109, 104, 81, 19, -3, -59, 127, -6, 5, 67, 27, 26, -94, 19, 18, 3, 119, -95, -26, 73, 95, 97, 53, -54, 85, -106, -10, -15, 121, 56, 46, -118, -4, -6, 32, 12, -26, 17, -40, -76, -98, -80, 67, -11, 0, -116, 62, -62, -85, -15, 48, -110, 63, 35, 54, 85, 11, 82, -58, 74, -65, 68, -58, -106, -46, -70, -9, -76, 58, 111, -94, 124, 59, 124, 78, 92, -17, 5, -107, 95, -66, -81, 51, -56, -98, -83, 75, 120, 56, 80, 32, -39, 111, -91, -88, -68, -29, -123, 92, -88, -71, 121, 55, 49, -98, 88, 57, 95, 8, 95, 59, 16, 55, -101, 90, -29, -51, 117, -45, -55, 45, 37, 12, -49, -69, 16, 89, -51, 16, -97, 85, 120, 109, 23, -36, 45, 32, -83, 30, 95, -9, -92, 82, 96, -27, 49, -75, -120, 83, -23, 2, 13, -83, 67, 20, -16, 116, 28, -33, 61, -32, 31, -53, 110, 47, -56, -90, 33, -62, -6, -51, -105, -93, 52, -47, -19, -118, -114, -125, 75, 9, -125, 11, -93, 34, -5, -7, 8, 74, -19, 81, -91, 39, -53, 119, -12, -30, -30, 62, 13, 126, 19, 53, 120, -10, 41, 80, -12, -48, -4, 59, 7, 26, -17, 115, -31, 29, 54, 101, 72, -98, -39, -96, 88, -27, 57, 9, -118, 8, 98, -17, 26, -84, 0, 66, -38, -33, 72, -120, -79, 26, -109, -40, 61, 3, 84, 19, 74, 87, 47, 69, 68, -100, 86, -11, 94, 37, -20, -73, 18, 55, -25, 45, -125, -82, -39, 97, -88, 50, 82, 121, -13, -124, -17, 48, 95, 82, 65, 125, -61, 118, -25, -90, -5, -57, 82, 21, -112, 59, 63, 107, -73, 19, 93, -44, 64, -22, -92, 69, -94, -75, 121, -77, 6, -28, -47, 124, -15, -14, 34, 113, -72, -49, -119, -10, -32, -106, -1, -46, -90, -28, -69, -48, -108, -92, -122, 110, 88, -23, 68, 68, 115, -16, 8, -92, 57, -33, -89, 12, 90, -123, 41, -8, -100, -117, -87, 119, -25, 6, 124, 4, 62, -53, 36, -40, 68, 63, 61, -42, 53, 14, -5, -23, -56, -4, -18, -78, 80, -3, 17, 90, 74, 46, 22, 98, 72, 57, 8, -85, -115, -44, 36, 78, -87, 116, 24, 51, -80, 48, -98, 14, 5, 25, 49, -100, -93, -110, 6, 73, 47, 28, 26, -16, 118, -84, -16, -49, 63, -68, -98, -43, -51, -26, 103, -58, -113, 65, -88, 10, 89, 23, 39, 93, -57, -95, -61, -32, 49, 79, 61, -90, -16, -119, -110, 0, -68, -125, -65, -115, 106, -52, -103, -31, -72, 46, 31, -68, -12, -45, 26, 19, -115, -49, 56, 104, 9, -39, 64, 113, -35, -48, 89, 124, 107, -82, -61, 86, 8, -40, 15, -37, -87, 113, 15, -22, -5, -22, 35, -59, 79, 57, 41, 10, -1, 102, 105, -122, 102, -122, -117, 124, 92, 33, -60, 66, 93, -15, -115, -73, 96, -22, 75, -52, -59, -72, -7, 41, -48, -108, -25, 104, 93, -6, 72, -50, -122, -109, 3, 32, -26, -109, -43, 79, -63, -119, 9, -50, -122, 103, -62, 71, 29, -120, 68, 49, 81, 35, -62, 121, 26, -25, 49, 84, -20, -56, -74, 69, 70, -36, 76, 51, -89, -61, 91, 90, -95, 63, 47, -45, 31, 31, 120, -7, -86, -64, 94, -77, 36, 53, 120, 31, -15, -125, 105, -97, 72, 122, 119, 123, 36, 23, -91, -123, 104, -91, 2, -56, -109, 47, 117, -97, 74, 14, 1, -5, -55, 17, -12, -93, 108, -35, 73, -46, -80, -125, -46, -28, 41, 66, 16, 19, -88, -106, 25, -65, 59, 48, 54, 99, -56, 112, 80, -88, -43, -17, 19, -49, -62, 117, 92, 33, -118, 116, 13, 112, -123, 119, -115, -112, -109, 98, 21, -66, 72, -33, -102, -63, 1, 92, -63, -34, -62, 74, 50, 83, 7, 49, 111, 120, -4, -31, 94, -9, -101, 34, 5, -79, -118, 32, 63, -1, 28, 80, -117, 110, 30, 12, 65, -19, 80, -106, -72, -119, 41, 38, 70, -112, -38, -95, -87, 117, -62, 60, 78, -46, -124, -40, -120, 53, -83, 71, -3, 56, -45, 116, 29, 74, 124, -120, 81, 5, -13, -99, 76, -112, 85, -72};
    private static final int[] n = new int[]{48, 174, 179, 57, 117, 158, 111, 77, 5, 190, 185, 241, 57, 21, 216, 178, 37, 2, 95, 166};
    private static final int[] o = new int[]{104, 169, 91, 102, 66, 239, 22, 20, 116, 6, 95, 8, 9, 28, 206, 160, 123, 152, 33, 126};

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public synchronized u a(Context context, String string, String string2, Class class_, Class class_2, String string3) {
        if (this.a == null) {
            this.b = context.getApplicationContext();
            this.h = string2;
            this.i = "td-%.zip".replace("%", string2);
            this.j = "td.tmp-" + string2;
            this.k = "td.sdk.digest." + string2;
            ag ag2 = this;
            synchronized (ag2) {
                try {
                    new Thread(new cl(this, string3)).start();
                    this.wait(500);
                }
                catch (InterruptedException var8_8) {
                    // empty catch block
                }
            }
            if (this.a == null) {
                this.l = true;
                this.a = (u)class_2.newInstance();
            }
            this.a.initialize(context, string);
        }
        return this.a;
    }

    private u a(String string) {
        try {
            File file = this.b.getDir("td-cache", 0);
            File file2 = new File(file, this.i);
            if (this.a(file2)) {
                DexClassLoader dexClassLoader = new DexClassLoader(file2.getAbsolutePath(), file.getAbsolutePath(), null, ag.class.getClassLoader());
                Class class_ = dexClassLoader.loadClass(string);
                return (u)class_.newInstance();
            }
        }
        catch (Throwable var2_3) {
            // empty catch block
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private boolean a(File file) {
        int n2;
        FileInputStream fileInputStream = null;
        fileInputStream = new FileInputStream(file);
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] arrby = new byte[1024];
        while ((n2 = fileInputStream.read(arrby)) != -1) {
            messageDigest.update(arrby, 0, n2);
        }
        String string = cs.a(messageDigest.digest());
        String string2 = cm.b(this.b, "pref_longtime", this.k, "");
        boolean bl2 = string2.equals(string);
        try {
            fileInputStream.close();
            return bl2;
        }
        catch (Throwable var9_11) {
            // empty catch block
        }
        return bl2;
        catch (Exception exception) {
            try {
                fileInputStream.close();
                return false;
            }
            catch (Throwable var3_5) {
                return false;
            }
            catch (Throwable throwable) {
                try {
                    fileInputStream.close();
                    throw throwable;
                }
                catch (Throwable var11_13) {
                    // empty catch block
                }
                throw throwable;
            }
        }
    }

    private void a(u u2) {
        u2.a("");
        String string = u2.c();
        URL uRL = new URL(string);
        String string2 = uRL.getHost();
        int n2 = uRL.getPort();
        if (n2 == -1) {
            n2 = uRL.getDefaultPort();
        }
        String string3 = new String(cs.a(cs.a(n, o), m));
        String string4 = cc.a(u2.c(), string3, false);
        if (!cs.b(string4) && !(string4 = string4.trim()).equalsIgnoreCase(u2.a())) {
            File file = this.b.getDir("td-cache", 0);
            File file2 = new File(file, this.j);
            String string5 = cc.a(u2.d(), string3, file2);
            if (string5 != null) {
                try {
                    File file3 = new File(file, this.i);
                    file3.delete();
                    file2.renameTo(file3);
                    cm.a(this.b, "pref_longtime", this.k, string5);
                    u2.e();
                }
                catch (Throwable var11_12) {
                    // empty catch block
                }
            }
        }
    }

    static /* synthetic */ u a(ag ag2, String string) {
        return ag2.a(string);
    }

    static /* synthetic */ void a(ag ag2, u u2) {
        ag2.a(u2);
    }
}

