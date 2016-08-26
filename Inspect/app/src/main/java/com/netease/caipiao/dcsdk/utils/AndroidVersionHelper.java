package com.netease.caipiao.dcsdk.utils;

import android.content.Context;
import android.support.v4.media.TransportMediator;
import com.netease.caipiao.dcsdk.BuildConfig;

public class AndroidVersionHelper {
    public static boolean versionGreaterThan(int version) {
        return true;
    }

    public static int getVersionCode(Context context) {
        int code = 0;
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Exception e) {
            e.printStackTrace();
            return code;
        }
    }

    public static String getMetaVersion(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), TransportMediator.FLAG_KEY_MEDIA_NEXT).metaData.get("VERSION").toString();
        } catch (Exception e) {
            e.printStackTrace();
            return BuildConfig.FLAVOR;
        }
    }
}
