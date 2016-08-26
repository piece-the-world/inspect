package com.netease.caipiao.datacollection;

import android.app.Application;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import com.growingio.android.sdk.collection.Configuration;
import com.growingio.android.sdk.collection.GrowingIO;
import com.netease.caipiao.dcsdk.Sprite;
import com.netease.caipiao.dcsdk.event.Event;
import com.netease.caipiao.dcsdk.event.EventAmendDescription;
import com.netease.caipiao.dcsdk.event.EventAmendDescription.Builder;
import com.netease.caipiao.dcsdk.event.EventType;
import com.netease.caipiao.dcsdk.event.OnEventAmendListener;
import com.netease.caipiao.dcsdk.event.ProtoEvent.MapItem;
import java.util.List;

public class DemoApplication extends Application {
    private EventHandler handler;
    private Runnable reportEventRunnable;

    /* renamed from: com.netease.caipiao.datacollection.DemoApplication.2 */
    class C02672 implements Runnable {
        C02672() {
        }

        public void run() {
            Sprite.getInstance().report();
            DemoApplication.this.handler.postDelayed(this, 5000);
        }
    }

    private static class EventHandler extends Handler {
        private EventHandler() {
        }

        public void handleMessage(Message msg) {
            super.handleMessage(msg);
        }
    }

    /* renamed from: com.netease.caipiao.datacollection.DemoApplication.1 */
    class C03751 implements OnEventAmendListener {
        C03751() {
        }

        public Event onEventAmend(View view, Event event, EventAmendDescription description, List<MapItem> list) {
            Log.e("test", "onEventAmend");
            return event;
        }
    }

    public DemoApplication() {
        this.handler = new EventHandler();
        this.reportEventRunnable = new C02672();
    }

    public void onCreate() {
        super.onCreate();
        GrowingIO.startWithConfiguration(this, new Configuration().useID().trackAllFragments().setChannel("\u5c0f\u7c73\u5e94\u7528\u5546\u5e97").setDebugMode(true).setTestMode(true));
        DemoHelper.INSTANCE.testViewTree();
        Sprite.getInstance().setDebug(true);
        Builder builder1 = new Builder();
        builder1.eventType(EventType.VIEW_CLICK);
        Sprite.getInstance().addEventAmendListener(builder1.build(), new C03751());
        Sprite.getInstance().setPackageNames(DemoHelper.INSTANCE.getPackageNames());
        Sprite.getInstance().init(this, "appkey", "deviceid", "netease");
        Sprite.getInstance().setEnableSnapshot(true);
    }

    public void onTerminate() {
        this.handler.removeCallbacks(this.reportEventRunnable);
        super.onTerminate();
    }
}
