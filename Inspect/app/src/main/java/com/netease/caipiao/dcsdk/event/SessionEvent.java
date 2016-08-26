package com.netease.caipiao.dcsdk.event;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import com.google.protobuf.MessageLite;
import com.netease.caipiao.dcsdk.BuildConfig;
import com.netease.caipiao.dcsdk.Sprite;
import com.netease.caipiao.dcsdk.event.ProtoEvent.AppEnterForeBackgroundMsg;
import com.netease.caipiao.dcsdk.event.utils.EventUtils;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class SessionEvent extends Event {
    private static final double MEGA = 1028576.0d;
    private static final String MEGA_UNIT = "M";
    private String appMemory;
    private String avalibleDisk;
    private String avalibleMemory;

    public SessionEvent() {
        this.appMemory = BuildConfig.FLAVOR;
        this.avalibleMemory = BuildConfig.FLAVOR;
        this.avalibleDisk = BuildConfig.FLAVOR;
    }

    public MessageLite toMessage() {
        return AppEnterForeBackgroundMsg.newBuilder().setEventName(getEventName()).setEventTime(getTime() + BuildConfig.FLAVOR).setAppKey(Sprite.getInstance().getAppKey()).setDeviceId(Sprite.getInstance().getDeviceId()).setSessionId(Sprite.getInstance().getSessionId()).setChannel(Sprite.getInstance().getChannel()).setAppMemory(getAppMemory()).setAvalibleMemory(getAvalibleMemory()).setAvalibleDisk(getAvalibleDisk()).build();
    }

    public short getType() {
        return (short) 2;
    }

    public static Event fromForground(Context context) {
        SessionEvent event = new SessionEvent();
        event.setTime(System.currentTimeMillis());
        event.setEventName(EventType.APP_FORGROUND.getEventName());
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        event.appMemory = decimalFormat.format(((double) Runtime.getRuntime().totalMemory()) / MEGA) + MEGA_UNIT;
        event.avalibleMemory = decimalFormat.format(((double) EventUtils.getMemoryInfo(context).getAvalibleMemory()) / MEGA) + MEGA_UNIT;
        if (VERSION.SDK_INT >= 18) {
            event.avalibleDisk = decimalFormat.format(((double) new StatFs(Environment.getExternalStorageDirectory().getPath()).getAvailableBytes()) / MEGA) + MEGA_UNIT;
        }
        return event;
    }

    public static Event fromBackground(Context context) {
        SessionEvent event = new SessionEvent();
        event.setTime(System.currentTimeMillis());
        event.setEventName(EventType.APP_BACKGROUND.getEventName());
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        event.appMemory = decimalFormat.format(((double) Runtime.getRuntime().totalMemory()) / MEGA) + MEGA_UNIT;
        event.avalibleMemory = decimalFormat.format(((double) EventUtils.getMemoryInfo(context).getAvalibleMemory()) / MEGA) + MEGA_UNIT;
        if (VERSION.SDK_INT >= 18) {
            event.avalibleDisk = decimalFormat.format(((double) new StatFs(Environment.getExternalStorageDirectory().getPath()).getAvailableBytes()) / MEGA) + MEGA_UNIT;
        }
        return event;
    }

    public String getAppMemory() {
        return this.appMemory;
    }

    public String getAvalibleDisk() {
        return this.avalibleDisk;
    }

    public String getAvalibleMemory() {
        return this.avalibleMemory;
    }
}
