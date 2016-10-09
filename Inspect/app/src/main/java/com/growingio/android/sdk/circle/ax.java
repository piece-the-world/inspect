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
import com.growingio.android.sdk.circle.aw;
import com.growingio.android.sdk.circle.ay;
import com.growingio.android.sdk.circle.az;
import com.growingio.android.sdk.circle.ba;
import com.growingio.android.sdk.circle.bb;
import com.growingio.android.sdk.circle.bc;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.utils.c;
import com.growingio.android.sdk.utils.e;
import com.growingio.android.sdk.utils.i;
import com.growingio.android.sdk.utils.j;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.IOException;

class ax
extends AsyncTask {
    final /* synthetic */ aw a;

    ax(aw aw2) {
        this.a = aw2;
    }

    protected /* varargs */ Void a(Void ... arrvoid) {
        File file = new File(aw.a(this.a) + "/" + "vds_circle_plugin.zip");
        this.a();
        if (file.exists()) {
            this.b(file, true);
        } else {
            i.a(new ay(this));
            this.a(file, false);
        }
        aw.a(this.a, null);
        return null;
    }

    private void a() {
        File file = new File(aw.a(this.a) + "/" + "hybrid_circle_plugin.js");
        if (!file.exists()) {
            c c2 = new e().a("https://assets.growingio.com/javascripts/hybrid-circle-plugin.min.js").a();
            Pair pair = c2.b();
            if ((Integer)pair.first == 200) {
                i.a(new az(this, pair));
            }
        }
    }

    void a(File file, boolean bl2) {
        long l2 = GConfig.q().x();
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
                j.a((byte[])pair.second, string);
                if (new File(string).renameTo(file)) {
                    GConfig.q().a(c2.c());
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
        if (aw.c(this.a)) {
            aw.a(this.a, null);
            i.a(new ba(this));
        }
    }

    protected void a(Void void_) {
        if (!aw.c(this.a)) {
            i.a(new bb(this));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void b(File file, boolean bl2) {
        String string = "com.growingio.android.sdk.java_websocket.WebCircleSocket";
        DexClassLoader dexClassLoader = new DexClassLoader(file.toString(), aw.a(this.a), null, Object.class.getClassLoader());
        try {
            bc.a(dexClassLoader.loadClass("com.growingio.android.sdk.java_websocket.WebCircleSocket"));
            aw.a(this.a, true);
            this.a(100);
        }
        catch (ClassNotFoundException var5_5) {
            try {
                Log.i((String)"ClassLoadTask", (String)"loadPluginClasses: try to load built-in plugins");
                ClassLoader classLoader = aw.b(this.a).getClassLoader();
                bc.a(classLoader.loadClass("com.growingio.android.sdk.java_websocket.WebCircleSocket"));
                aw.a(this.a, true);
                this.a(100);
                return;
            }
            catch (Exception var6_8) {
                Log.i((String)"ClassLoadTask", (String)"loadPluginClasses: still failing");
                var6_8.printStackTrace();
            }
        }
        catch (NoSuchMethodException var5_6) {}
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

