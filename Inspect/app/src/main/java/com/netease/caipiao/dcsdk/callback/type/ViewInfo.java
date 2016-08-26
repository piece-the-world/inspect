package com.netease.caipiao.dcsdk.callback.type;

import java.util.Set;

public class ViewInfo {
    private Set callbackTypes;
    private int index;
    private String pageName;

    public ViewInfo() {
        this.index = -1;
    }

    public int getIndex() {
        return this.index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Set getCallbackTypes() {
        return this.callbackTypes;
    }

    public void setCallbackTypes(Set callbackTypes) {
        this.callbackTypes = callbackTypes;
    }

    public String getPageName() {
        return this.pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }
}
