package com.netease.caipiao.dcsdk.event;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.google.protobuf.MessageLite;
import com.netease.caipiao.dcsdk.BuildConfig;
import com.netease.caipiao.dcsdk.event.ProtoEvent.MapItem;
import com.netease.caipiao.dcsdk.proxy.WebViewClientProxy;
import java.nio.ByteBuffer;
import java.util.List;

public class Event {
    public static final int EVENT_APPINFO = 1;
    public static final int EVENT_APP_INSTALLATION = 11;
    public static final int EVENT_CLICK = 3;
    public static final int EVENT_LISTITEM_CLICK = 4;
    public static final int EVENT_PAGELIFE = 7;
    public static final int EVENT_PUSH = 12;
    public static final int EVENT_SCROLL = 5;
    public static final int EVENT_SESSION = 2;
    public static final int EVENT_TAP = 5;
    public static final int EVENT_USER_OPTIONAL = 10;
    public static final int EVENT_WEBVIEW = 8;
    private String eventName;
    private List<MapItem> info;
    private String pageName;
    private long time;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EventName:");
        sb.append(this.eventName);
        sb.append("  PageName:");
        sb.append(this.pageName);
        sb.append("  Time:");
        sb.append(this.time);
        return sb.toString();
    }

    public byte[] toByteArray() {
        MessageLite msg = toMessage();
        if (msg == null) {
            return null;
        }
        int size = msg.getSerializedSize() + 6;
        return ByteBuffer.allocate(size).putInt(size).putShort(getType()).put(msg.toByteArray()).array();
    }

    public short getType() {
        return (short) 0;
    }

    public MessageLite toMessage() {
        return null;
    }

    public String getEventName() {
        return this.eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setInfo(List<MapItem> info) {
        this.info = info;
    }

    public long getTime() {
        return this.time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getPageName() {
        return this.pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public List<MapItem> getInfo() {
        return this.info;
    }

    public static Event fromAppColdStart(Context context) {
        return AppInfoEvent.fromAppColdStart(context);
    }

    public static Event detectAppInstallation(Context context, List<String> packageNames) {
        return AppInstallationEvent.detectAppInstallation(context, packageNames);
    }

    public static Event fromClick(View view) {
        return ClickEvent.fromClick(view);
    }

    public static Event fromItemClick(View view, int section, long position) {
        return ListItemClickEvent.fromItemClick(view, section, position);
    }

    public static Event fromLongClick(View view) {
        return ClickEvent.fromLongClick(view);
    }

    public static Event fromItemLongClick(View view, int positon, long id) {
        return ListItemClickEvent.fromItemLongClick(view, positon, id);
    }

    public static Event fromSingleUpTap(MotionEvent lastUpEvent, String pageName) {
        return TapEvent.fromSingleUpTap(lastUpEvent, pageName);
    }

    public static Event fromScroll(MotionEvent initialDownEvent, MotionEvent lastUpEvent, float distanceX, float distanceY, String pageName) {
        return ScrollEvent.fromScroll(initialDownEvent, lastUpEvent, distanceX, distanceY, pageName);
    }

    public static Event fromActivityCreated(Activity activity, Bundle bundle) {
        return PageLifeEvent.fromActivityCreated(activity, bundle);
    }

    public static Event fromActivityResumed(Activity activity) {
        return PageLifeEvent.fromActivityResumed(activity);
    }

    public static Event fromActivityPaused(Activity activity) {
        return PageLifeEvent.fromActivityPaused(activity);
    }

    public static Event fromActivityDestroyed(Activity activity) {
        return PageLifeEvent.fromActivityDestroyed(activity);
    }

    public static Event fromAppForground(Context context) {
        return SessionEvent.fromForground(context);
    }

    public static Event fromAppBackground(Context context) {
        return SessionEvent.fromBackground(context);
    }

    public static PushEvent fromPush(String message) {
        return PushEvent.fromPush(message);
    }

    protected static String getViewName(@NonNull View view) {
        if (view instanceof TextView) {
            return ((TextView) view).getText().toString();
        }
        return view.getClass().getSimpleName();
    }

    protected static String trim(String text) {
        if (TextUtils.isEmpty(text)) {
            return BuildConfig.FLAVOR;
        }
        if (text.length() > EVENT_WEBVIEW) {
            return text.substring(0, EVENT_WEBVIEW);
        }
        return text;
    }

    public static Event fromWebView(WebViewClientProxy webViewClientProxy) {
        return WebViewEvent.fromWebView(webViewClientProxy);
    }
}
