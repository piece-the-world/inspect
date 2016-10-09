/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Environment
 */
package com.growingio.android.sdk.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Environment;
import com.growingio.android.sdk.utils.LogUtil;
import com.growingio.android.sdk.utils.g;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class b {
    private static final File a = new File(Environment.getExternalStorageDirectory(), "GrowingIO" + File.separator);
    private String b;
    private String c;
    private DateFormat d = new SimpleDateFormat("HH:mm:ss.SSS", Locale.US);
    private DateFormat e = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    private File f;

    public b(Context context, String string) {
        PackageManager packageManager = context.getPackageManager();
        ApplicationInfo applicationInfo = null;
        try {
            applicationInfo = packageManager.getApplicationInfo(context.getApplicationInfo().packageName, 0);
        }
        catch (PackageManager.NameNotFoundException var5_5) {
            // empty catch block
        }
        this.b = applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo) : "Unknown";
        this.c = string;
        this.f = new File(a, string + File.separator);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(String string) {
        if (!g.c()) {
            return false;
        }
        BufferedWriter bufferedWriter = null;
        FileLock fileLock = null;
        try {
            if (this.f.mkdirs() || this.f.isDirectory()) {
                FileOutputStream fileOutputStream = new FileOutputStream(String.format("%s%s%s_%s.log", this.f.getAbsolutePath(), File.separator, this.b, this.e.format(Calendar.getInstance().getTimeInMillis())), true);
                fileLock = fileOutputStream.getChannel().lock();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter((OutputStream)fileOutputStream, "UTF-8"));
                bufferedWriter.write(String.format("%s,%s\n", this.d.format(Calendar.getInstance().getTimeInMillis()), string));
                LogUtil.d("GIO.util.FileOutUtil", string);
                bufferedWriter.close();
                boolean bl2 = true;
                return bl2;
            }
            boolean bl3 = false;
            return bl3;
        }
        catch (IOException var4_6) {
            LogUtil.d("GIO.util.FileOutUtil", "write msg to file error", var4_6);
            boolean bl4 = false;
            return bl4;
        }
        finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                }
                catch (IOException var6_13) {}
            }
            if (fileLock != null) {
                try {
                    fileLock.release();
                }
                catch (IOException var6_14) {}
            }
        }
    }
}

