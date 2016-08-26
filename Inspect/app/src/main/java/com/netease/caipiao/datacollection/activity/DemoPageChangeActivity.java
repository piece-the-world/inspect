package com.netease.caipiao.datacollection.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.growingio.android.sdk.agent.VdsAgent;
import com.growingio.android.sdk.instrumentation.Instrumented;
import com.netease.caipiao.datacollection.C0268R;
import com.netease.caipiao.dcsdk.Sprite;

public class DemoPageChangeActivity extends Activity {

    /* renamed from: com.netease.caipiao.datacollection.activity.DemoPageChangeActivity.1 */
    class C02691 implements OnClickListener {
        C02691() {
        }

        @Instrumented
        public void onClick(View view) {
            VdsAgent.onClick(this, view);
            Sprite.getInstance().stop();
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0268R.layout.demo_pagechange_activity);
        findViewById(C0268R.id.tv1).setOnClickListener(new C02691());
    }
}
