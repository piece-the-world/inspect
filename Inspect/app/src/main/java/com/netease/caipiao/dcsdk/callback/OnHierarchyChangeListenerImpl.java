package com.netease.caipiao.dcsdk.callback;

import android.view.View;
import android.view.ViewGroup.OnHierarchyChangeListener;
import com.netease.caipiao.dcsdk.DataCollection;
import com.netease.caipiao.dcsdk.MyDataCollection;
import com.netease.caipiao.dcsdk.callback.agent.ViewInfoAgent;
import com.netease.caipiao.dcsdk.event.Event;

public class OnHierarchyChangeListenerImpl extends CallbackImpl<OnHierarchyChangeListener> implements OnHierarchyChangeListener {
    private DataCollection collection;

    public OnHierarchyChangeListenerImpl(OnHierarchyChangeListener onHierarchyChangeListener) {
        super(onHierarchyChangeListener);
        this.collection = new MyDataCollection();
    }

    protected Event buildEvent(View view) {
        return null;
    }

    public void onChildViewAdded(View view, View view1) {
        ViewInfoAgent.signChildren(view);
        this.collection.collectCallbacks(view1);
        if (this.callback != null) {
            ((OnHierarchyChangeListener) this.callback).onChildViewAdded(view, view1);
        }
    }

    public void onChildViewRemoved(View view, View view1) {
        this.collection.restoreCallbacks(view1);
        if (this.callback != null) {
            ((OnHierarchyChangeListener) this.callback).onChildViewRemoved(view, view1);
        }
    }
}
