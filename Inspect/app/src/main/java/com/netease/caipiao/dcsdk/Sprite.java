package com.netease.caipiao.dcsdk;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.netease.caipiao.dcsdk.binderhook.Hook;
import com.netease.caipiao.dcsdk.binderhook.notification.BinderProxy;
import com.netease.caipiao.dcsdk.constants.Constants;
import com.netease.caipiao.dcsdk.event.Event;
import com.netease.caipiao.dcsdk.event.EventAmendDescription;
import com.netease.caipiao.dcsdk.event.EventAmendListenerManager;
import com.netease.caipiao.dcsdk.event.EventCache;
import com.netease.caipiao.dcsdk.event.OnEventAmendListener;
import com.netease.caipiao.dcsdk.log.Logger;
import com.netease.caipiao.dcsdk.receiver.NotificationEventReceiver;
import com.netease.caipiao.dcsdk.report.EventReporter;
import com.netease.caipiao.dcsdk.report.ReportRequest;
import com.netease.caipiao.dcsdk.report.strategy.ReportStrategyUtils;
import com.netease.caipiao.dcsdk.utils.AndroidVersionHelper;
import com.netease.caipiao.dcsdk.utils.DigestHelper;
import java.util.List;

public class Sprite {
    private static Sprite instance;
    private String appKey;
    private Application applicationContext;
    private String channel;
    private String deviceId;
    private boolean enableSnapshot;
    private EventAmendListenerManager eventAmendListenerManager;
    private EventReporter eventReporter;
    private ActivityLifeMonitor monitor;
    private BinderProxy notificationBinderProxy;
    private BroadcastReceiver notificationReceiver;
    private List<String> packageNames;
    private ReportRequest reportRequest;
    private String sessionId;
    private String version;

    private Sprite() {
        this.eventAmendListenerManager = new EventAmendListenerManager();
        this.reportRequest = new ReportRequest();
        this.appKey = BuildConfig.FLAVOR;
        this.deviceId = BuildConfig.FLAVOR;
        this.sessionId = BuildConfig.FLAVOR;
        this.channel = BuildConfig.FLAVOR;
        this.version = BuildConfig.FLAVOR;
        this.packageNames = null;
    }

    public static Sprite getInstance() {
        if (instance == null) {
            instance = new Sprite();
        }
        return instance;
    }

    public void setEnableSnapshot(boolean enableSnapshot) {
        this.enableSnapshot = enableSnapshot;
    }

    public boolean isEnableSnapshot() {
        return this.enableSnapshot;
    }

    @Deprecated
    public void init(Context context, String appKey, String deviceId, String channel) {
        if (context != null && !TextUtils.isEmpty(appKey) && !TextUtils.isEmpty(deviceId)) {
            this.appKey = appKey;
            this.deviceId = deviceId;
            this.channel = channel;
            String sessionId = DigestHelper.MD5(getInstance().getDeviceId() + "_" + System.currentTimeMillis());
            if (!TextUtils.isEmpty(sessionId)) {
                this.sessionId = sessionId;
            }
            this.applicationContext = (Application) context.getApplicationContext();
            this.version = AndroidVersionHelper.getMetaVersion(this.applicationContext);
            this.eventReporter = new EventReporter(this.applicationContext);
            EventCache.getInstance().add(Event.fromAppColdStart(this.applicationContext));
            if (this.packageNames != null) {
                EventCache.getInstance().add(Event.detectAppInstallation(this.applicationContext, this.packageNames));
            }
            this.monitor = new ActivityLifeMonitor();
            this.applicationContext.registerActivityLifecycleCallbacks(this.monitor);
            this.notificationReceiver = new NotificationEventReceiver();
            this.applicationContext.registerReceiver(this.notificationReceiver, new IntentFilter(Constants.ACTION_NOTIFICATION));
            this.notificationBinderProxy = new BinderProxy();
            Hook.hookBinder(this.notificationBinderProxy);
            ReportStrategyUtils.invoke(this.eventReporter);
        }
    }

    public void startWithConfiguration(Configuration configuration) {
        if (configuration != null && configuration.getContext() != null && (configuration.getContext().getApplicationContext() instanceof Application)) {
            String str;
            setDebug(configuration.isDebugMode());
            this.applicationContext = (Application) configuration.getContext().getApplicationContext();
            if (configuration.getAppKey() == null) {
                str = BuildConfig.FLAVOR;
            } else {
                str = configuration.getAppKey();
            }
            this.appKey = str;
            if (configuration.getDeviceId() == null) {
                str = BuildConfig.FLAVOR;
            } else {
                str = configuration.getDeviceId();
            }
            this.deviceId = str;
            if (configuration.getChannel() == null) {
                str = BuildConfig.FLAVOR;
            } else {
                str = configuration.getChannel();
            }
            this.channel = str;
            String sessionId = DigestHelper.MD5(getInstance().getDeviceId() + "_" + System.currentTimeMillis());
            if (sessionId == null) {
                sessionId = BuildConfig.FLAVOR;
            }
            this.sessionId = sessionId;
            this.version = AndroidVersionHelper.getMetaVersion(this.applicationContext);
            this.eventReporter = new EventReporter(this.applicationContext);
            ReportStrategyUtils.invoke(this.eventReporter);
            setEnableSnapshot(configuration.isEnableSnapshot());
            EventCache.getInstance().add(Event.fromAppColdStart(this.applicationContext));
            EventCache.getInstance().add(Event.detectAppInstallation(this.applicationContext, this.packageNames));
            if (!configuration.isDisableViewTracking()) {
                this.monitor = new ActivityLifeMonitor();
                this.applicationContext.registerActivityLifecycleCallbacks(this.monitor);
            }
            this.notificationReceiver = new NotificationEventReceiver();
            this.applicationContext.registerReceiver(this.notificationReceiver, new IntentFilter(Constants.ACTION_NOTIFICATION));
            this.notificationBinderProxy = new BinderProxy();
            Hook.hookBinder(this.notificationBinderProxy);
        }
    }

    public void addEventAmendListener(EventAmendDescription description, OnEventAmendListener listener) {
        this.eventAmendListenerManager.addEventAmendListener(description, listener);
    }

    public void removeEventAmendListener(EventAmendDescription description) {
        this.eventAmendListenerManager.removeEventAmendListener(description);
    }

    public EventAmendListenerManager getEventAmendListenerManager() {
        return this.eventAmendListenerManager;
    }

    public void addEvent(Event event) {
        EventCache.getInstance().add(event);
    }

    public void report() {
        this.eventReporter.reportEvents(EventCache.getInstance().getEvents());
    }

    public EventReporter getEventReporter() {
        return this.eventReporter;
    }

    public void stop() {
        this.monitor.stopCollect();
        if (this.applicationContext != null) {
            this.applicationContext.unregisterReceiver(this.notificationReceiver);
            this.applicationContext.unregisterActivityLifecycleCallbacks(this.monitor);
        }
        ReportStrategyUtils.stop();
        Hook.unhookBinder(this.notificationBinderProxy);
    }

    public String getAppKey() {
        return this.appKey;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getVersion() {
        return this.version;
    }

    public void setDebug(boolean debug) {
        Logger.setDebugSwitchOn(debug);
    }

    public List<String> getPackageNames() {
        return this.packageNames;
    }

    public Application getApplicationContext() {
        return this.applicationContext;
    }

    public void setPackageNames(List<String> packageNames) {
        this.packageNames = packageNames;
    }
}
