package com.netease.caipiao.dcsdk.event;

import android.util.Log;
import android.view.MotionEvent;
import com.google.protobuf.MessageLite;
import com.netease.caipiao.dcsdk.BuildConfig;
import com.netease.caipiao.dcsdk.Sprite;
import com.netease.caipiao.dcsdk.event.ProtoEvent.ScrollViewMsg;
import com.netease.caipiao.dcsdk.event.ProtoEvent.ViewItem;

public class ScrollEvent extends Event {
    private String direction;
    private float downX;
    private float downY;
    private float upX;
    private float upY;

    public static class Direction {
        public static final String DOWN = "down";
        public static final String LEFT = "left";
        public static final String RIGHT = "right";
        public static final String UP = "up";
    }

    public short getType() {
        return (short) 5;
    }

    public MessageLite toMessage() {
        return ScrollViewMsg.newBuilder().setEventName(getEventName()).setView(ViewItem.newBuilder().setFrame("{" + this.downX + "," + this.downY + "," + this.upX + "," + this.upY + "}").build()).setAppKey(Sprite.getInstance().getAppKey()).setDeviceId(Sprite.getInstance().getDeviceId()).setSessionId(Sprite.getInstance().getSessionId()).setPage(getPageName()).setDirection(this.direction).setEventTime(getTime() + BuildConfig.FLAVOR).build();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("  Direction:");
        sb.append(this.direction);
        sb.append("  DownX:");
        sb.append(this.downX);
        sb.append("  DownY:");
        sb.append(this.downY);
        sb.append("  UpX:");
        sb.append(this.upX);
        sb.append("  UpY:");
        sb.append(this.upY);
        return sb.toString();
    }

    public static Event fromScroll(MotionEvent initialDownEvent, MotionEvent lastUpEvent, float distanceX, float distanceY, String pageName) {
        ScrollEvent event = new ScrollEvent();
        event.setTime(System.currentTimeMillis());
        event.setPageName(pageName);
        event.setEventName(EventType.VIEW_SCROLL.getEventName());
        event.setDownX(initialDownEvent.getRawX());
        event.setDownY(initialDownEvent.getRawY());
        event.setUpX(lastUpEvent.getRawX());
        event.setUpY(lastUpEvent.getRawY());
        if (Math.abs(distanceX) > Math.abs(distanceY)) {
            if (distanceX > 0.0f) {
                event.setDirection(Direction.LEFT);
                Log.e("zyyin", "SCROLL_LEFT");
            } else {
                event.setDirection(Direction.RIGHT);
                Log.e("zyyin", "SCROLL_RIGHT");
            }
        } else if (distanceY > 0.0f) {
            event.setDirection(Direction.UP);
            Log.e("zyyin", "SCROLL_UP");
        } else {
            event.setDirection(Direction.DOWN);
            Log.e("zyyin", "SCROLL_DOWN");
        }
        return event;
    }

    public String getDirection() {
        return this.direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public float getDownX() {
        return this.downX;
    }

    public void setDownX(float downX) {
        this.downX = downX;
    }

    public float getDownY() {
        return this.downY;
    }

    public void setDownY(float downY) {
        this.downY = downY;
    }

    public float getUpX() {
        return this.upX;
    }

    public void setUpX(float upX) {
        this.upX = upX;
    }

    public float getUpY() {
        return this.upY;
    }

    public void setUpY(float upY) {
        this.upY = upY;
    }
}
