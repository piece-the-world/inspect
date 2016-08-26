package com.netease.caipiao.dcsdk.event;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.protobuf.MessageLite;
import com.netease.caipiao.dcsdk.BuildConfig;
import com.netease.caipiao.dcsdk.Sprite;
import com.netease.caipiao.dcsdk.event.ProtoEvent.AppInstallationMsg;
import com.netease.caipiao.dcsdk.event.ProtoEvent.AppInstallationMsg.Builder;
import com.netease.caipiao.dcsdk.event.ProtoEvent.MapItem;
import java.util.ArrayList;
import java.util.List;

public class AppInstallationEvent extends Event {
    private static final String INSTALLED = "1";
    private static final String NOT_INSTALLED = "0";

    public static Event detectAppInstallation(Context context, List<String> packageNames) {
        AppInstallationEvent event = new AppInstallationEvent();
        event.setTime(System.currentTimeMillis());
        event.setEventName(EventType.APP_INSTALLATION.getEventName());
        if (!(context == null || packageNames == null || packageNames.size() <= 0)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                List<MapItem> list = new ArrayList();
                for (String s : packageNames) {
                    try {
                        if (packageManager.getPackageInfo(s, 1) != null) {
                            list.add(MapItem.newBuilder().setKey(s).setValue(INSTALLED).build());
                        } else {
                            list.add(MapItem.newBuilder().setKey(s).setValue(NOT_INSTALLED).build());
                        }
                    } catch (NameNotFoundException e) {
                        list.add(MapItem.newBuilder().setKey(s).setValue(NOT_INSTALLED).build());
                    }
                }
                event.setInfo(list);
            }
        }
        return event;
    }

    public short getType() {
        return (short) 11;
    }

    public MessageLite toMessage() {
        Builder builder = AppInstallationMsg.newBuilder().setEventName(getEventName()).setEventTime(getTime() + BuildConfig.FLAVOR).setDeviceId(Sprite.getInstance().getDeviceId()).setAppKey(Sprite.getInstance().getAppKey()).setSessionId(Sprite.getInstance().getSessionId());
        if (getInfo() != null && getInfo().size() > 0) {
            builder.addAllItem(getInfo());
        }
        return builder.build();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (getInfo() != null) {
            for (MapItem info : getInfo()) {
                sb.append(info.getKey() + ":" + info.getValue() + ";");
            }
        }
        return sb.toString();
    }
}
