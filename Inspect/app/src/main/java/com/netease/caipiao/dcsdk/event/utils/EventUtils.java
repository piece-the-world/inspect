package com.netease.caipiao.dcsdk.event.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.view.View;
import com.netease.caipiao.dcsdk.BuildConfig;
import com.netease.caipiao.dcsdk.log.Logger;
import com.netease.caipiao.dcsdk.log.Tags;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EventUtils {

    public static class MyMemoryInfo {
        private long avalibleMemory;
        private long totalMemory;

        public long getTotalMemory() {
            return this.totalMemory;
        }

        public void setTotalMemory(long totalMemory) {
            this.totalMemory = totalMemory;
        }

        public long getAvalibleMemory() {
            return this.avalibleMemory;
        }

        public void setAvalibleMemory(long avalibleMemory) {
            this.avalibleMemory = avalibleMemory;
        }
    }

    private EventUtils() {
    }

    public static String getPageName(View view) {
        if (view == null) {
            return BuildConfig.FLAVOR;
        }
        Logger.debug(Tags.PAGE_NAME, "getPageName:view=%s,context is activity", view.toString());
        return getPageName(view.getContext());
    }

    public static String getPageName(Context context) {
        if (context == null) {
            return BuildConfig.FLAVOR;
        }
        if (!(context instanceof ContextWrapper)) {
            Logger.debug(Tags.PAGE_NAME, "getPageName:context is not ContextWrapper,rst", new Object[0]);
            return BuildConfig.FLAVOR;
        } else if (context instanceof Activity) {
            String s = getFragmentName(context);
            if (s != null) {
                return s;
            }
            rst = context.getClass().getSimpleName();
            Logger.debug(Tags.PAGE_NAME, "getPageName:context is activity,rst=%s", rst);
            if (rst == null) {
                return BuildConfig.FLAVOR;
            }
            return rst;
        } else {
            rst = ((ContextWrapper) context).getBaseContext().getClass().getSimpleName();
            Logger.debug(Tags.PAGE_NAME, "getPageName:context is not activity,rst=%s", rst);
            if (rst == null) {
                return BuildConfig.FLAVOR;
            }
            return rst;
        }
    }

    public static String getFragmentName(Context context) {
        String fragmentName = null;
        if (context instanceof FragmentActivity) {
            List<Fragment> fragments = ((FragmentActivity) context).getSupportFragmentManager().getFragments();
            if (fragments != null && fragments.size() > 0) {
                for (Fragment fragment : fragments) {
                    if (fragment != null && fragment.isVisible()) {
                        fragmentName = fragment.getClass().getSimpleName();
                        Logger.debug(Tags.PAGE_NAME, "getFragmentName:%s", fragmentName);
                    }
                }
            }
        }
        return fragmentName;
    }

    public static float getBatteryLevel(Context context) {
        Intent batteryIntent = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int level = batteryIntent.getIntExtra("level", -1);
        int scale = batteryIntent.getIntExtra("scale", -1);
        if (level == -1 || scale == -1) {
            return 50.0f;
        }
        return (((float) level) / ((float) scale)) * 100.0f;
    }

    public static String getCarrier(Context context) {
        String carrier = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
        return carrier == null ? BuildConfig.FLAVOR : carrier;
    }

    public static MyMemoryInfo getMemoryInfo(Context context) {
        MyMemoryInfo memoryInfo = new MyMemoryInfo();
        if (VERSION.SDK_INT >= 16) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            MemoryInfo info = new MemoryInfo();
            activityManager.getMemoryInfo(info);
            memoryInfo.setTotalMemory(info.totalMem);
            memoryInfo.setAvalibleMemory(info.availMem);
        } else {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile("/proc/meminfo", "r");
                Pattern p = Pattern.compile("[0-9]+");
                Matcher matcher = p.matcher(randomAccessFile.readLine());
                if (matcher.find()) {
                    memoryInfo.setTotalMemory(Long.parseLong(matcher.group()) * PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
                }
                Matcher matcher1 = p.matcher(randomAccessFile.readLine());
                Matcher matcher2 = p.matcher(randomAccessFile.readLine());
                Matcher matcher3 = p.matcher(randomAccessFile.readLine());
                if (matcher1.find() && matcher2.find() && matcher3.find()) {
                    memoryInfo.setAvalibleMemory(((Long.parseLong(matcher1.group()) + Long.parseLong(matcher2.group())) + Long.parseLong(matcher3.group())) * PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
                }
                randomAccessFile.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        return memoryInfo;
    }
}
