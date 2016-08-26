/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.os.AsyncTask
 *  android.util.Log
 *  android.util.Pair
 *  dalvik.system.DexClassLoader
 */
package com.growingio.android.sdk.circle;

import android.os.AsyncTask;
import android.util.Log;
import android.util.Pair;
import com.growingio.android.sdk.circle.cg;
import com.growingio.android.sdk.circle.ci;
import com.growingio.android.sdk.circle.cj;
import com.growingio.android.sdk.circle.ck;
import com.growingio.android.sdk.circle.cl;
import com.growingio.android.sdk.circle.cm;
import com.growingio.android.sdk.circle.cn;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.utils.c;
import com.growingio.android.sdk.utils.e;
import com.growingio.android.sdk.utils.h;
import com.growingio.android.sdk.utils.i;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.IOException;

class ch
extends AsyncTask {
    final /* synthetic */ cg a;

    ch(cg cg2) {
        this.a = cg2;
    }

    protected /* varargs */ Void a(Void ... arrvoid) {
        File file = new File(cg.a(this.a) + "/" + "vds_circle_plugin.zip");
        this.a();
        if (file.exists()) {
            this.b(file, true);
        } else {
            h.a(new ci(this));
            this.a(file, false);
        }
        cg.a(this.a, null);
        return null;
    }

    private void a() {
        File file = new File(cg.a(this.a) + "/" + "hybrid_circle_plugin.js");
        if (!file.exists()) {
            c c2 = new e().a("https://assets.growingio.com/javascripts/hybrid-circle-plugin.min.js").a();
            Pair pair = c2.b();
            if ((Integer)pair.first == 200) {
                h.a(new cj(this, pair));
            }
        }
    }

    void a(File file, boolean bl2) {
        long l2 = GConfig.o().w();
        e e2 = new e().a("https://assets.growingio.com/android/sdk/vds-plugin-v2.zip");
        if (bl2) {
            e2.a(l2);
        }
        c c2 = e2.a();
        Pair pair = c2.b();
        int n2 = (Integer)pair.first;
        if (n2 == 200) {
            String string = file + ".download";
            try {
                i.a((byte[])pair.second, string);
                if (new File(string).renameTo(file)) {
                    GConfig.o().a(c2.c());
                    if (!bl2) {
                        this.b(file, false);
                    }
                }
            }
            catch (IOException var10_9) {
                var10_9.printStackTrace();
            }
        }
    }

    protected /* varargs */ void a(Integer ... arrinteger) {
        if (cg.c(this.a)) {
            cg.a(this.a, null);
            h.a(new ck(this));
        }
    }

    protected void a(Void void_) {
        if (!cg.c(this.a)) {
            h.a(new cl(this));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void b(File file, boolean bl2) {
        String string = "com.growingio.android.sdk.charting.charts.GrowingLineChart";
        String string2 = "com.growingio.android.sdk.java_websocket.WebCircleSocket";
        DexClassLoader dexClassLoader = new DexClassLoader(file.toString(), cg.a(this.a), null, Object.class.getClassLoader());
        try {
            cm.a(dexClassLoader.loadClass("com.growingio.android.sdk.charting.charts.GrowingLineChart"));
            cn.a(dexClassLoader.loadClass("com.growingio.android.sdk.java_websocket.WebCircleSocket"));
            cg.a(this.a, true);
            this.a(100);
        }
        catch (ClassNotFoundException var6_6) {
            try {
                Log.i((String)"ClassLoadTask", (String)"loadPluginClasses: try to load built-in plugins");
                ClassLoader classLoader = cg.b(this.a).getClassLoader();
                cm.a(classLoader.loadClass("com.growingio.android.sdk.charting.charts.GrowingLineChart"));
                cn.a(classLoader.loadClass("com.growingio.android.sdk.java_websocket.WebCircleSocket"));
                cg.a(this.a, true);
                this.a(100);
                return;
            }
            catch (Exception var7_9) {
                Log.i((String)"ClassLoadTask", (String)"loadPluginClasses: still failing");
                var7_9.printStackTrace();
            }
        }
        catch (NoSuchMethodException var6_7) {}
        finally {
            if (bl2) {
                this.a(file, true);
            }
        }
    }

    protected /* synthetic */ void onProgressUpdate(Object[] arrobject) {
        this.a((Integer[])arrobject);
    }

    protected /* synthetic */ void onPostExecute(Object object) {
        this.a((Void)object);
    }

    protected /* synthetic */ Object doInBackground(Object[] arrobject) {
        return this.a((Void[])arrobject);
    }
}

