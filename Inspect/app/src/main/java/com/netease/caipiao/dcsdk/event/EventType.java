package com.netease.caipiao.dcsdk.event;

import com.netease.caipiao.dcsdk.callback.CallbackType;
import com.netease.caipiao.dcsdk.event.ProtoEvent.WebViewMsg;

public enum EventType {
    VIEW_CLICK("ViewClick"),
    LIST_ITEM_CLICK("ListItemClick"),
    LIST_ITEM_LONG_CLICK("ListItemLongClick"),
    VIEW_LONG_CLICK("ViewLongClick"),
    SINGLE_TAP("ViewSingleTap"),
    VIEW_SCROLL("ViewScroll"),
    PAGE_CREATED("PageCreate"),
    PAGE_RESUMED("PageShow"),
    PAGE_PAUSED("PageHide"),
    PAGE_DESTROYED("PageDestroy"),
    APP_FORGROUND("AppForground"),
    APP_BACKGROUND("AppBackground"),
    APP_COLD_START("AppColdStart"),
    APP_INSTALLATION("AppInstallation"),
    WEB_VIEW("WebLoad"),
    PUSH("PushMsgClicked");
    
    private String eventName;

    /* renamed from: com.netease.caipiao.dcsdk.event.EventType.1 */
    static /* synthetic */ class C02801 {
        static final /* synthetic */ int[] $SwitchMap$com$netease$caipiao$dcsdk$callback$CallbackType;

        static {
            $SwitchMap$com$netease$caipiao$dcsdk$callback$CallbackType = new int[CallbackType.values().length];
            try {
                $SwitchMap$com$netease$caipiao$dcsdk$callback$CallbackType[CallbackType.ON_CLICK.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$netease$caipiao$dcsdk$callback$CallbackType[CallbackType.ON_ITEM_CLICK.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$netease$caipiao$dcsdk$callback$CallbackType[CallbackType.ON_LONG_CLICK.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$com$netease$caipiao$dcsdk$callback$CallbackType[CallbackType.ON_ITEM_LONG_CLICK.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    private EventType(String eventName) {
        this.eventName = eventName;
    }

    public String getEventName() {
        return this.eventName;
    }

    public static EventType valueOf(CallbackType callbackType) {
        switch (C02801.$SwitchMap$com$netease$caipiao$dcsdk$callback$CallbackType[callbackType.ordinal()]) {
            case WebViewMsg.EVENTNAME_FIELD_NUMBER /*1*/:
            case WebViewMsg.EVENTTIME_FIELD_NUMBER /*2*/:
                return VIEW_CLICK;
            case WebViewMsg.SESSIONID_FIELD_NUMBER /*3*/:
            case WebViewMsg.APPKEY_FIELD_NUMBER /*4*/:
                return VIEW_LONG_CLICK;
            default:
                return VIEW_CLICK;
        }
    }
}
