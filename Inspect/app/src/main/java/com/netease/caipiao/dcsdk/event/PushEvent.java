package com.netease.caipiao.dcsdk.event;

import com.google.protobuf.MessageLite;
import com.netease.caipiao.dcsdk.BuildConfig;
import com.netease.caipiao.dcsdk.Sprite;
import com.netease.caipiao.dcsdk.event.ProtoEvent.PushMsg;

public class PushEvent extends Event {
    private String message;

    public PushEvent() {
        this.message = BuildConfig.FLAVOR;
    }

    public short getType() {
        return (short) 12;
    }

    public MessageLite toMessage() {
        return PushMsg.newBuilder().setEventName(getEventName()).setEventTime(getTime() + BuildConfig.FLAVOR).setSessionId(Sprite.getInstance().getSessionId()).setAppKey(Sprite.getInstance().getAppKey()).setDeviceId(Sprite.getInstance().getDeviceId()).setContent(this.message).build();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" pushmessage: ");
        sb.append(this.message);
        return sb.toString();
    }

    public static PushEvent fromPush(String message) {
        PushEvent event = new PushEvent();
        event.setEventName(EventType.PUSH.getEventName());
        event.setTime(System.currentTimeMillis());
        if (message != null) {
            event.setMessage(message);
        }
        return event;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
