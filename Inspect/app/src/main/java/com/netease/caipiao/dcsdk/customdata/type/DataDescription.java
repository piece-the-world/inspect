package com.netease.caipiao.dcsdk.customdata.type;

import android.text.TextUtils;
import android.view.View;
import com.netease.caipiao.dcsdk.callback.type.ViewInfo;
import com.netease.caipiao.dcsdk.callback.type.ViewPath;
import com.netease.caipiao.dcsdk.constants.Constants;
import com.netease.caipiao.dcsdk.event.EventType;

public class DataDescription {
    private DataPath dataPath;
    private String eventType;
    private String pageName;
    private ViewPath viewPath;

    public boolean fit(View view, EventType type) {
        if (view == null || TextUtils.isEmpty(this.eventType) || this.viewPath == null || !(view.getTag(Constants.TAG_ID_VIEWINFO) instanceof ViewInfo) || !this.eventType.equals(type.getEventName()) || !this.viewPath.equals(ViewPath.getPath(view))) {
            return false;
        }
        return true;
    }

    public String getPageName() {
        return this.pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getEventType() {
        return this.eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public ViewPath getViewPath() {
        return this.viewPath;
    }

    public void setViewPath(ViewPath viewPath) {
        this.viewPath = viewPath;
    }

    public DataPath getDataPath() {
        return this.dataPath;
    }

    public void setDataPath(DataPath dataPath) {
        this.dataPath = dataPath;
    }
}
