package com.netease.caipiao.dcsdk.callback;

import android.view.View;
import android.view.View.OnClickListener;
import com.growingio.android.sdk.agent.VdsAgent;
import com.growingio.android.sdk.instrumentation.Instrumented;

public class OnClickListenerWrapper<U extends CallbackImpl<OnClickListener> & OnClickListener> implements OnClickListener {
    private U f550u;

    public OnClickListenerWrapper(U u) {
        this.f550u = u;
    }

    @Instrumented
    public void onClick(View view) {
        VdsAgent.onClick(this, view);
        if (this.f550u != null) {
            ((OnClickListener) this.f550u).onClick(view);
        }
    }

    public OnClickListener getOnClickListener() {
        return this.f550u != null ? (OnClickListener) this.f550u.callback : null;
    }
}
