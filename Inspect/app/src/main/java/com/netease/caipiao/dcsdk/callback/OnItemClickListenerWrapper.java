package com.netease.caipiao.dcsdk.callback;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.growingio.android.sdk.agent.VdsAgent;
import com.growingio.android.sdk.instrumentation.Instrumented;

public class OnItemClickListenerWrapper<U extends CallbackImpl<OnItemClickListener> & OnItemClickListener> implements OnItemClickListener {
    private U f553u;

    public OnItemClickListenerWrapper(U u) {
        this.f553u = u;
    }

    @Instrumented
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        VdsAgent.onItemClick(this, adapterView, view, i, j);
        if (this.f553u != null) {
            ((OnItemClickListener) this.f553u).onItemClick(adapterView, view, i, j);
        }
    }

    public OnItemClickListener getOnItemClickListener() {
        return this.f553u != null ? (OnItemClickListener) this.f553u.callback : null;
    }
}
