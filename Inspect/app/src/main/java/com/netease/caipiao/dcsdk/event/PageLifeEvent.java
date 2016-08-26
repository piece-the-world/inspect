package com.netease.caipiao.dcsdk.event;

import android.app.Activity;
import android.os.Bundle;
import com.google.protobuf.MessageLite;
import com.netease.caipiao.dcsdk.BuildConfig;
import com.netease.caipiao.dcsdk.Sprite;
import com.netease.caipiao.dcsdk.event.ProtoEvent.PageMsg;
import com.netease.caipiao.dcsdk.event.ProtoEvent.PageMsg.Builder;
import java.util.Set;

public class PageLifeEvent extends Event {
    private String bundle;

    public MessageLite toMessage() {
        Builder builder = PageMsg.newBuilder().setPage(getPageName()).setEventName(getEventName()).setEventTime(getTime() + BuildConfig.FLAVOR).setAppKey(Sprite.getInstance().getAppKey()).setDeviceId(Sprite.getInstance().getDeviceId()).setSessionId(Sprite.getInstance().getSessionId());
        if (getInfo() != null && getInfo().size() > 0) {
            builder.addAllItem(getInfo());
        }
        return builder.build();
    }

    public short getType() {
        return (short) 7;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("  Bundle:");
        sb.append(this.bundle);
        return sb.toString();
    }

    public static Event fromActivityCreated(Activity activity, Bundle bundle) {
        PageLifeEvent event = new PageLifeEvent();
        event.setTime(System.currentTimeMillis());
        event.setPageName(activity.getClass().getSimpleName());
        event.setEventName(EventType.PAGE_CREATED.getEventName());
        if (bundle != null) {
            Set<String> keys = bundle.keySet();
            StringBuilder sb = new StringBuilder();
            for (String key : keys) {
                Object value = bundle.get(key);
                if (value != null) {
                    String strValue = value.toString();
                    if (strValue.length() < 64) {
                        if (sb.length() > 0) {
                            sb.append("&&");
                        }
                        sb.append(key);
                        sb.append("=");
                        sb.append(strValue);
                    }
                }
            }
            event.setBundle(sb.toString());
        }
        return event;
    }

    public static Event fromActivityResumed(Activity activity) {
        PageLifeEvent event = new PageLifeEvent();
        event.setTime(System.currentTimeMillis());
        event.setPageName(activity.getClass().getSimpleName());
        event.setEventName(EventType.PAGE_RESUMED.getEventName());
        return event;
    }

    public static Event fromActivityPaused(Activity activity) {
        PageLifeEvent event = new PageLifeEvent();
        event.setTime(System.currentTimeMillis());
        event.setPageName(activity.getClass().getSimpleName());
        event.setEventName(EventType.PAGE_PAUSED.getEventName());
        return event;
    }

    public static Event fromActivityDestroyed(Activity activity) {
        PageLifeEvent event = new PageLifeEvent();
        event.setTime(System.currentTimeMillis());
        event.setPageName(activity.getClass().getSimpleName());
        event.setEventName(EventType.PAGE_DESTROYED.getEventName());
        return event;
    }

    public String getBundle() {
        return this.bundle;
    }

    public void setBundle(String bundle) {
        this.bundle = bundle;
    }
}
