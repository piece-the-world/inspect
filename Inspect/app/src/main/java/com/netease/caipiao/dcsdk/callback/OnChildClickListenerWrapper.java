package com.netease.caipiao.dcsdk.callback;

import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import com.growingio.android.sdk.agent.VdsAgent;
import com.growingio.android.sdk.instrumentation.Instrumented;

public class OnChildClickListenerWrapper<U extends CallbackImpl<OnChildClickListener> & OnChildClickListener> implements OnChildClickListener {
    private U f549u;

    public OnChildClickListenerWrapper(U u) {
        this.f549u = u;
    }

    @Instrumented
    public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
        VdsAgent.onChildClick(this, expandableListView, view, i, i2, j);
        if (this.f549u != null) {
            return ((OnChildClickListener) this.f549u).onChildClick(expandableListView, view, i, i2, j);
        }
        return false;
    }

    public OnChildClickListener getOnChildClickListener() {
        return this.f549u != null ? (OnChildClickListener) this.f549u.callback : null;
    }
}
