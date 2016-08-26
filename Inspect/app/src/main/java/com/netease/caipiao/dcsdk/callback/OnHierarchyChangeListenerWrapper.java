package com.netease.caipiao.dcsdk.callback;

import android.view.View;
import android.view.ViewGroup.OnHierarchyChangeListener;

public class OnHierarchyChangeListenerWrapper<U extends CallbackImpl<OnHierarchyChangeListener> & OnHierarchyChangeListener> implements OnHierarchyChangeListener {
    private U f552u;

    public OnHierarchyChangeListenerWrapper(U u) {
        this.f552u = u;
    }

    public void onChildViewAdded(View view, View view1) {
        if (this.f552u != null) {
            ((OnHierarchyChangeListener) this.f552u).onChildViewAdded(view, view1);
        }
    }

    public void onChildViewRemoved(View view, View view1) {
        if (this.f552u != null) {
            ((OnHierarchyChangeListener) this.f552u).onChildViewRemoved(view, view1);
        }
    }

    public OnHierarchyChangeListener getOnHierarchyChangeListener() {
        return this.f552u != null ? (OnHierarchyChangeListener) this.f552u.callback : null;
    }
}
