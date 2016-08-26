package com.netease.caipiao.dcsdk.event;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import android.util.DisplayMetrics;
import com.google.protobuf.MessageLite;
import com.netease.caipiao.dcsdk.BuildConfig;
import com.netease.caipiao.dcsdk.Sprite;
import com.netease.caipiao.dcsdk.event.ProtoEvent.AppColdStartMsg;
import com.netease.caipiao.dcsdk.event.utils.EventUtils;
import com.netease.caipiao.dcsdk.event.utils.EventUtils.MyMemoryInfo;
import com.netease.caipiao.dcsdk.utils.AndroidVersionHelper;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class AppInfoEvent extends Event {
    private static final double MEGA = 1028576.0d;
    private static final String MEGA_UNIT = "M";
    private String appBuildVersion;
    private String appMemory;
    private String appVersion;
    private String avalibleDisk;
    private String avalibleMemory;
    private String batteryLevel;
    private String carrier;
    private String deviceModel;
    private String screenResolution;
    private String systemName;
    private String systemVersion;
    private String totalDisk;
    private String totalMemory;

    public AppInfoEvent() {
        this.screenResolution = BuildConfig.FLAVOR;
        this.systemName = BuildConfig.FLAVOR;
        this.systemVersion = BuildConfig.FLAVOR;
        this.appVersion = BuildConfig.FLAVOR;
        this.appBuildVersion = BuildConfig.FLAVOR;
        this.deviceModel = BuildConfig.FLAVOR;
        this.avalibleDisk = BuildConfig.FLAVOR;
        this.totalDisk = BuildConfig.FLAVOR;
        this.appMemory = BuildConfig.FLAVOR;
        this.avalibleMemory = BuildConfig.FLAVOR;
        this.totalMemory = BuildConfig.FLAVOR;
        this.batteryLevel = BuildConfig.FLAVOR;
        this.carrier = BuildConfig.FLAVOR;
    }

    public static Event fromAppColdStart(Context context) {
        AppInfoEvent event = new AppInfoEvent();
        event.setTime(System.currentTimeMillis());
        event.setEventName(EventType.APP_COLD_START.getEventName());
        if (context != null) {
            DisplayMetrics dm = context.getResources().getDisplayMetrics();
            if (dm != null) {
                event.screenResolution = dm.widthPixels + "*" + dm.heightPixels;
            }
            event.appVersion = Sprite.getInstance().getVersion();
            event.appBuildVersion = String.valueOf(AndroidVersionHelper.getVersionCode(context));
        }
        event.systemName = "android";
        event.systemVersion = String.valueOf(VERSION.SDK_INT);
        event.deviceModel = Build.MODEL == null ? BuildConfig.FLAVOR : Build.MODEL;
        event.carrier = EventUtils.getCarrier(context);
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        MyMemoryInfo memoryInfo = EventUtils.getMemoryInfo(context);
        event.totalMemory = decimalFormat.format(((double) memoryInfo.getTotalMemory()) / MEGA) + MEGA_UNIT;
        event.avalibleMemory = decimalFormat.format(((double) memoryInfo.getAvalibleMemory()) / MEGA) + MEGA_UNIT;
        event.appMemory = decimalFormat.format(((double) Runtime.getRuntime().totalMemory()) / MEGA) + MEGA_UNIT;
        if (VERSION.SDK_INT >= 18) {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            event.avalibleDisk = decimalFormat.format(((double) statFs.getAvailableBytes()) / MEGA) + MEGA_UNIT;
            event.totalDisk = decimalFormat.format(((double) statFs.getTotalBytes()) / MEGA) + MEGA_UNIT;
        }
        event.batteryLevel = Math.round(EventUtils.getBatteryLevel(context)) + "%";
        return event;
    }

    public short getType() {
        return (short) 1;
    }

    public MessageLite toMessage() {
        return AppColdStartMsg.newBuilder().setEventName(getEventName()).setEventTime(getTime() + BuildConfig.FLAVOR).setDeviceId(Sprite.getInstance().getDeviceId()).setAppKey(Sprite.getInstance().getAppKey()).setChannel(Sprite.getInstance().getChannel()).setSessionId(Sprite.getInstance().getSessionId()).setAppBuildVersion(this.appBuildVersion).setAppVersion(this.appVersion).setScreenResolution(this.screenResolution).setSystemName(this.systemName).setSystemVersion(this.systemVersion).setDeviceModel(this.deviceModel).setCarrier(this.carrier).setTotalMemory(this.totalMemory).setAvalibleMemory(this.avalibleMemory).setAppMemory(this.appMemory).setTotalDisk(this.totalDisk).setAvalibleDisk(this.avalibleDisk).setBatteryLevel(this.batteryLevel).build();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("  appBuildVersion:");
        sb.append(this.appBuildVersion);
        sb.append("  appVersion:");
        sb.append(this.appVersion);
        sb.append("  screenResolution:");
        sb.append(this.screenResolution);
        sb.append("  systemName:");
        sb.append(this.systemName);
        sb.append("  systemVersion:");
        sb.append(this.systemVersion);
        sb.append("  deviceModel:");
        sb.append(this.deviceModel);
        sb.append("  carrier:");
        sb.append(this.carrier);
        sb.append("  totalMemory:");
        sb.append(this.totalMemory);
        sb.append("  avalibleMemory:");
        sb.append(this.avalibleMemory);
        sb.append("  appMemory:");
        sb.append(this.appMemory);
        sb.append("  totalDisk:");
        sb.append(this.totalDisk);
        sb.append("  avalibleDisk:");
        sb.append(this.avalibleDisk);
        sb.append("  batteryLevel:");
        sb.append(this.batteryLevel);
        return sb.toString();
    }
}
