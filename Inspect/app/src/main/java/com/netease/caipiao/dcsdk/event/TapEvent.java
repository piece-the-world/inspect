package com.netease.caipiao.dcsdk.event;

import android.view.MotionEvent;

public class TapEvent extends Event {
    private float f708x;
    private float f709y;

    public short getType() {
        return (short) 5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("  X:");
        sb.append(this.f708x);
        sb.append("  Y:");
        sb.append(this.f709y);
        return sb.toString();
    }

    public static Event fromSingleUpTap(MotionEvent lastUpEvent, String pageName) {
        TapEvent event = new TapEvent();
        event.setTime(System.currentTimeMillis());
        event.setPageName(pageName);
        event.setEventName(EventType.SINGLE_TAP.getEventName());
        event.setX(lastUpEvent.getRawX());
        event.setY(lastUpEvent.getRawY());
        return event;
    }

    public float getX() {
        return this.f708x;
    }

    public void setX(float x) {
        this.f708x = x;
    }

    public float getY() {
        return this.f709y;
    }

    public void setY(float y) {
        this.f709y = y;
    }
}
