package com.netease.caipiao.dcsdk.event.business;

import com.google.protobuf.MessageLite;
import com.netease.caipiao.dcsdk.BuildConfig;
import com.netease.caipiao.dcsdk.Sprite;
import com.netease.caipiao.dcsdk.event.Event;
import com.netease.caipiao.dcsdk.event.ProtoEvent.UserOptionalMsg;
import com.netease.caipiao.dcsdk.event.ProtoEvent.UserOptionalMsg.Builder;

public class UserOptionalEvent extends Event {
    public short getType() {
        return (short) 10;
    }

    public MessageLite toMessage() {
        Builder builder = UserOptionalMsg.newBuilder();
        builder.setEventName(getEventName()).setAppKey(Sprite.getInstance().getAppKey()).setDeviceId(Sprite.getInstance().getDeviceId()).setSessionId(Sprite.getInstance().getSessionId()).setEventTime(getTime() + BuildConfig.FLAVOR);
        if (getInfo() != null && getInfo().size() > 0) {
            builder.addAllItem(getInfo());
        }
        return builder.build();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        return sb.toString();
    }
}
