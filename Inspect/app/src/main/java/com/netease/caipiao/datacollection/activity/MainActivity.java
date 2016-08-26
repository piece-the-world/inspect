package com.netease.caipiao.datacollection.activity;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat.Builder;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RemoteViews;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.growingio.android.sdk.agent.VdsAgent;
import com.growingio.android.sdk.instrumentation.Instrumented;
import com.netease.caipiao.datacollection.C0268R;
import com.netease.caipiao.datacollection.DemoHelper;
import com.netease.caipiao.datacollection.adapter.DemoExpandableListAdapter;
import com.netease.caipiao.datacollection.adapter.ListAndFilterableAdapter;
import com.netease.caipiao.datacollection.log.AppLog;
import com.netease.caipiao.dcsdk.event.Event;
import com.netease.caipiao.dcsdk.log.Tags;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    private AutoCompleteTextView actv;
    private ExpandableListView elv;
    LinearLayout ll;
    private ListView lv;
    private int notificationId;
    private TextView tv;

    /* renamed from: com.netease.caipiao.datacollection.activity.MainActivity.1 */
    class C02701 implements OnClickListener {
        C02701() {
        }

        @Instrumented
        public void onClick(View view) {
            VdsAgent.onClick(this, view);
        }
    }

    /* renamed from: com.netease.caipiao.datacollection.activity.MainActivity.2 */
    class C02712 implements OnItemClickListener {
        C02712() {
        }

        @Instrumented
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            VdsAgent.onItemClick(this, adapterView, view, i, j);
        }
    }

    /* renamed from: com.netease.caipiao.datacollection.activity.MainActivity.3 */
    class C02723 implements OnEditorActionListener {
        C02723() {
        }

        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
            return false;
        }
    }

    /* renamed from: com.netease.caipiao.datacollection.activity.MainActivity.4 */
    class C02734 implements OnItemClickListener {
        C02734() {
        }

        @Instrumented
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            VdsAgent.onItemClick(this, adapterView, view, i, j);
        }
    }

    /* renamed from: com.netease.caipiao.datacollection.activity.MainActivity.5 */
    class C02745 implements OnItemLongClickListener {
        C02745() {
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int position, long id) {
            return false;
        }
    }

    /* renamed from: com.netease.caipiao.datacollection.activity.MainActivity.6 */
    class C02756 implements OnGroupClickListener {
        C02756() {
        }

        @Instrumented
        public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
            VdsAgent.onGroupClick(this, expandableListView, view, i, j);
            return false;
        }
    }

    /* renamed from: com.netease.caipiao.datacollection.activity.MainActivity.7 */
    class C02767 implements OnChildClickListener {
        C02767() {
        }

        @Instrumented
        public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
            VdsAgent.onChildClick(this, expandableListView, view, i, i2, j);
            return false;
        }
    }

    public MainActivity() {
        this.notificationId = 0;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        setContentView((int) C0268R.layout.activity_main);
        findViewById(C0268R.id.bt1).setOnClickListener(this);
        findViewById(C0268R.id.bt2).setOnClickListener(this);
        findViewById(C0268R.id.bt3).setOnClickListener(this);
        findViewById(C0268R.id.bt4).setOnClickListener(this);
        findViewById(C0268R.id.bt5).setOnClickListener(this);
        this.tv = (TextView) findViewById(C0268R.id.tv);
        this.actv = (AutoCompleteTextView) findViewById(C0268R.id.actv);
        this.lv = (ListView) findViewById(C0268R.id.lv);
        this.elv = (ExpandableListView) findViewById(C0268R.id.elv);
        this.ll = (LinearLayout) findViewById(C0268R.id.root_layout);
        this.tv.setOnClickListener(new C02701());
        this.actv.setAdapter(new ListAndFilterableAdapter());
        this.actv.setOnItemClickListener(new C02712());
        this.actv.setOnEditorActionListener(new C02723());
        this.lv.setAdapter(new SimpleAdapter(this, DemoHelper.INSTANCE.getSimpleAdapterData(), C0268R.layout.list_item, new String[]{"info"}, new int[]{C0268R.id.tv}));
        this.lv.setOnItemClickListener(new C02734());
        this.lv.setOnItemLongClickListener(new C02745());
        this.elv.setAdapter(new DemoExpandableListAdapter(this));
        this.elv.setOnGroupClickListener(new C02756());
        this.elv.setOnChildClickListener(new C02767());
        List<Event> eventList = new ArrayList();
        Event event = Event.fromClick(this.tv);
        Event event1 = Event.fromActivityCreated(this, getIntent().getExtras());
        eventList.add(event);
        eventList.add(event1);
        if (getIntent().getData() != null) {
            AppLog.debug(Tags.HOOK, "onCreate:%s", getIntent().getData().toString());
        }
    }

    @Instrumented
    protected void onNewIntent(Intent intent) {
        VdsAgent.onNewIntent(this, intent);
        super.onNewIntent(intent);
        AppLog.debug(Tags.HOOK, "onNewIntent:%s", intent.getData());
    }

    protected void onDestroy() {
        super.onDestroy();
    }

    @Instrumented
    public void onClick(View view) {
        VdsAgent.onClick(this, view);
        switch (view.getId()) {
            case C0268R.id.bt1 /*2131492945*/:
                startActivity(new Intent(this, DemoFragmentActivity.class));
            case C0268R.id.bt2 /*2131492946*/:
                startActivity(new Intent(this, DemoPageChangeActivity.class));
            case C0268R.id.bt3 /*2131492947*/:
                startActivity(new Intent(this, DemoWebviewActivity.class));
            case C0268R.id.bt4 /*2131492948*/:
                generateNotification();
            case C0268R.id.bt5 /*2131492949*/:
                generateCustomNotification();
            default:
        }
    }

    private void generateNotification() {
        NotificationManager mNotificationManager = (NotificationManager) getSystemService(Tags.NOTIFICATION);
        Builder mBuilder = new Builder(this);
        Intent intent = new Intent(this, MainActivity.class);
        intent.setData(Uri.parse("http://www.baidu.com"));
        mBuilder.setContentTitle("\u6d4b\u8bd5\u6807\u9898").setContentText("\u6d4b\u8bd5\u5185\u5bb9").setContentIntent(PendingIntent.getActivity(this, 0, intent, 0)).setTicker("\u6d4b\u8bd5\u901a\u77e5\u6765\u5566").setWhen(System.currentTimeMillis()).setPriority(0).setAutoCancel(true).setOngoing(false).setDefaults(2).setSmallIcon(C0268R.mipmap.ic_launcher);
        this.notificationId++;
        mNotificationManager.notify(this.notificationId, mBuilder.build());
    }

    private void generateCustomNotification() {
        NotificationManager mNotificationManager = (NotificationManager) getSystemService(Tags.NOTIFICATION);
        Intent intent = new Intent(this, MainActivity.class);
        intent.setData(Uri.parse("http://www.163.com"));
        Builder mBuilder = new Builder(this);
        mBuilder.setContentTitle("\u6d4b\u8bd5\u6807\u9898custom").setContentIntent(PendingIntent.getActivity(this, 0, intent, 0)).setTicker("\u6d4b\u8bd5\u901a\u77e5\u6765\u5566custom").setWhen(System.currentTimeMillis()).setPriority(0).setAutoCancel(true).setOngoing(false).setDefaults(2).setSmallIcon(C0268R.mipmap.ic_launcher);
        Notification notification = mBuilder.build();
        RemoteViews remoteViews = new RemoteViews(getPackageName(), C0268R.layout.notification_container_normal);
        remoteViews.setTextViewText(C0268R.id.title, "\u6d4b\u8bd5\u5185\u5bb9custom");
        notification.contentView = remoteViews;
        this.notificationId++;
        mNotificationManager.notify(this.notificationId, notification);
    }
}
