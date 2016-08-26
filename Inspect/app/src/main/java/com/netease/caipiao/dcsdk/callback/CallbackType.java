package com.netease.caipiao.dcsdk.callback;

public enum CallbackType {
    ON_CLICK("mOnClickListener"),
    ON_LONG_CLICK("mOnLongClickListener"),
    ON_TOUCH("mOnTouchListener"),
    ON_ITEM_CLICK("mOnItemClickListener"),
    ON_ITEM_LONG_CLICK("mOnItemLongClickListener"),
    ON_SCROLL("mOnScrollListener"),
    ON_CHILD_CLICK("mOnChildClickListener"),
    ON_GROUP_CLICK("mOnGroupClickListener"),
    ON_HIERARCHY_CHANGE("mOnHierarchyChangeListener");
    
    private String callbackName;

    private CallbackType(String callbackName) {
        this.callbackName = callbackName;
    }

    public String getCallbackName() {
        return this.callbackName;
    }
}
