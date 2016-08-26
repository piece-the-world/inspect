package com.netease.caipiao.dcsdk;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.View;
import com.netease.caipiao.dcsdk.report.ReportRequest;
import java.io.File;
import java.io.FileOutputStream;

public class SnapshotManager {
    private static SnapshotManager instance;
    Handler asyncHanlder;
    ReportRequest reportRequest;
    HandlerThread thread;

    /* renamed from: com.netease.caipiao.dcsdk.SnapshotManager.1 */
    class C02781 implements Runnable {
        final /* synthetic */ Bitmap val$bitmap;
        final /* synthetic */ String val$name;

        C02781(String str, Bitmap bitmap) {
            this.val$name = str;
            this.val$bitmap = bitmap;
        }

        public void run() {
            String path = SnapshotManager.this.findPath();
            File file = new File(path + "/" + this.val$name + ".png");
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
                FileOutputStream fos = new FileOutputStream(file);
                if (fos != null) {
                    this.val$bitmap.compress(CompressFormat.PNG, 100, fos);
                    fos.flush();
                    fos.close();
                }
                SnapshotManager.this.reportRequest.reportImageSync(file);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    static {
        instance = new SnapshotManager();
    }

    private SnapshotManager() {
        this.thread = new HandlerThread("SnapshotManager");
        this.thread.start();
        this.asyncHanlder = new Handler(this.thread.getLooper());
        this.reportRequest = new ReportRequest();
    }

    public static SnapshotManager getInstance() {
        return instance;
    }

    public void takeSnapAndReport(Activity activity) {
        if (activity != null) {
            Display display = activity.getWindowManager().getDefaultDisplay();
            int w = display.getWidth();
            int h = display.getHeight();
            View decorview = activity.getWindow().getDecorView();
            decorview.setDrawingCacheEnabled(true);
            Bitmap bitmap = decorview.getDrawingCache();
            if (bitmap != null) {
                saveFile(activity.getClass().getSimpleName(), bitmap);
            }
        }
    }

    private void saveFile(String name, Bitmap bitmap) {
        this.asyncHanlder.post(new C02781(name, bitmap));
    }

    private String findPath() {
        String path = BuildConfig.FLAVOR;
        if (Environment.getExternalStorageState().equals("mounted")) {
            path = Environment.getExternalStorageDirectory() + File.separator + "netease_dc_snapshot" + File.separator;
        }
        if (TextUtils.isEmpty(path)) {
            Log.e("zyyin", "\u672a\u627e\u5230sd\u5361");
        } else {
            File f = new File(path);
            if (!f.exists()) {
                f.mkdirs();
            }
        }
        return path;
    }
}
