package com.netease.caipiao.datacollection.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.growingio.android.sdk.agent.VdsAgent;
import com.growingio.android.sdk.instrumentation.Instrumented;
import com.netease.caipiao.datacollection.C0268R;

@Instrumented
public class DemoFragment2 extends Fragment implements OnClickListener {
    private JumpListener listener;
    private View view;

    public void onPause() {
        super.onPause();
        VdsAgent.onFragmentPause(this);
    }

    public void onResume() {
        super.onResume();
        VdsAgent.onFragmentResume(this);
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        VdsAgent.setFragmentUserVisibleHint(this, z);
    }

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        this.view = inflater.inflate(C0268R.layout.demo_fragment2, null);
        this.view.findViewById(C0268R.id.bt1).setOnClickListener(this);
        this.view.findViewById(C0268R.id.tv1).setOnClickListener(this);
        this.listener = (JumpListener) this.view.getContext();
        return this.view;
    }

    @Instrumented
    public void onClick(View view) {
        VdsAgent.onClick(this, view);
        switch (view.getId()) {
            case C0268R.id.bt1 /*2131492945*/:
                this.listener.jumpTo(1);
            default:
        }
    }
}
