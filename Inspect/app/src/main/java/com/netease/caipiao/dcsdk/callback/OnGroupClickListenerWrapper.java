package com.netease.caipiao.dcsdk.callback;

import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnGroupClickListener;
import com.growingio.android.sdk.agent.VdsAgent;
import com.growingio.android.sdk.instrumentation.Instrumented;

public class OnGroupClickListenerWrapper<U extends CallbackImpl<OnGroupClickListener> & OnGroupClickListener> implements OnGroupClickListener {
    private U f551u;

    public OnGroupClickListenerWrapper(U u) {
        this.f551u = u;
    }

    @Instrumented
    public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
        VdsAgent.onGroupClick(this, expandableListView, view, i, j);
        if (this.f551u != null) {
            return ((OnGroupClickListener) this.f551u).onGroupClick(expandableListView, view, i, j);
        }
        return false;
    }

    public OnGroupClickListener getOnGroupClickListener() {
        return this.f551u != null ? (OnGroupClickListener) this.f551u.callback : null;
    }
}
