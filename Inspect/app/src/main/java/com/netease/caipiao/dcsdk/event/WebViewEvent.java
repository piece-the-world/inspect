package com.netease.caipiao.dcsdk.event;

import android.text.TextUtils;
import android.view.View;
import com.google.protobuf.MessageLite;
import com.netease.caipiao.dcsdk.BuildConfig;
import com.netease.caipiao.dcsdk.Sprite;
import com.netease.caipiao.dcsdk.event.ProtoEvent.WebViewMsg;
import com.netease.caipiao.dcsdk.event.utils.EventUtils;
import com.netease.caipiao.dcsdk.proxy.WebViewClientProxy;

public class WebViewEvent extends Event {
    private String error;
    private String url;

    public WebViewEvent() {
        this.url = BuildConfig.FLAVOR;
        this.error = BuildConfig.FLAVOR;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("  url:");
        sb.append(this.url);
        sb.append("  error:");
        sb.append(this.error);
        return sb.toString();
    }

    public short getType() {
        return (short) 8;
    }

    public MessageLite toMessage() {
        return WebViewMsg.newBuilder().setEventName(getEventName()).setEventTime(getTime() + BuildConfig.FLAVOR).setSessionId(Sprite.getInstance().getSessionId()).setAppKey(Sprite.getInstance().getAppKey()).setDeviceId(Sprite.getInstance().getDeviceId()).setPage(getPageName()).setUrl(this.url).setError(this.error).build();
    }

    public static Event fromWebView(WebViewClientProxy webViewClientProxy) {
        WebViewEvent event = new WebViewEvent();
        if (TextUtils.isEmpty(webViewClientProxy.getError())) {
            event.setEventName(EventType.WEB_VIEW.getEventName());
        } else {
            event.setEventName("WebLoadFailed");
            event.setError(webViewClientProxy.getError());
        }
        event.setTime(System.currentTimeMillis());
        if (webViewClientProxy.getWebViewRef() != null) {
            event.setPageName(EventUtils.getPageName((View) webViewClientProxy.getWebViewRef().get()));
        }
        if (webViewClientProxy.getUrl() != null) {
            event.setUrl(webViewClientProxy.getUrl());
        }
        return event;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getError() {
        return this.error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
