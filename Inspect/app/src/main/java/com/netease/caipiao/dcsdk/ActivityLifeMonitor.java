package com.netease.caipiao.dcsdk;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import com.netease.caipiao.dcsdk.event.Event;
import com.netease.caipiao.dcsdk.event.EventCache;
import com.netease.caipiao.dcsdk.log.Logger;
import com.netease.caipiao.dcsdk.log.Tags;
import com.netease.caipiao.dcsdk.report.strategy.ReportStrategyUtils;
import com.netease.caipiao.dcsdk.report.strategy.StubType;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;

public class ActivityLifeMonitor implements ActivityLifecycleCallbacks {
    private int activePageCount;
    private List<Integer> activityCountList;
    private WeakReference<Activity> curActivity;
    private MyDataCollection dataCollection;

    public ActivityLifeMonitor() {
        this.dataCollection = new MyDataCollection();
        this.activePageCount = 0;
        this.activityCountList = new LinkedList();
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        Logger.debug(Tags.LIFE_CYCLE, "onActivityCreated", new Object[0]);
        EventCache.getInstance().add(Event.fromActivityCreated(activity, bundle));
    }

    public void onActivityStarted(Activity activity) {
        Logger.debug(Tags.LIFE_CYCLE, "onActivityStarted", new Object[0]);
        this.dataCollection.collectCallbacks(activity.getWindow().getDecorView());
        this.curActivity = new WeakReference(activity);
        if (!isForground()) {
            EventCache.getInstance().add(Event.fromAppForground(activity.getApplicationContext()));
            ReportStrategyUtils.stub(StubType.FORE_BACK_GROUND, new Object[0]);
        }
        this.activityCountList.add(Integer.valueOf(activity.hashCode()));
        this.activePageCount++;
    }

    public void onActivityResumed(Activity activity) {
        Logger.debug(Tags.LIFE_CYCLE, "onActivityResumed", new Object[0]);
        Logger.printViewTree(activity.getWindow().getDecorView(), 1, true);
        EventCache.getInstance().add(Event.fromActivityResumed(activity));
    }

    public void onActivityPaused(Activity activity) {
        Logger.debug(Tags.LIFE_CYCLE, "onActivityPaused", new Object[0]);
        EventCache.getInstance().add(Event.fromActivityPaused(activity));
        if (Sprite.getInstance().isEnableSnapshot()) {
            SnapshotManager.getInstance().takeSnapAndReport(activity);
        }
    }

    public void onActivityStopped(Activity activity) {
        Logger.debug(Tags.LIFE_CYCLE, "onActivityStopped", new Object[0]);
        this.dataCollection.restoreCallbacks(activity.getWindow().getDecorView());
        if (this.activityCountList.contains(Integer.valueOf(activity.hashCode()))) {
            this.activityCountList.remove(this.activityCountList.indexOf(Integer.valueOf(activity.hashCode())));
            this.activePageCount--;
        }
        if (!isForground()) {
            EventCache.getInstance().add(Event.fromAppBackground(activity.getApplicationContext()));
            ReportStrategyUtils.stub(StubType.FORE_BACK_GROUND, new Object[0]);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Logger.debug(Tags.LIFE_CYCLE, "onActivitySaveInstanceState", new Object[0]);
    }

    public void onActivityDestroyed(Activity activity) {
        Logger.debug(Tags.LIFE_CYCLE, "onActivityDestroyed", new Object[0]);
        EventCache.getInstance().add(Event.fromActivityDestroyed(activity));
    }

    public boolean isForground() {
        return this.activePageCount > 0;
    }

    public void stopCollect() {
        if (this.curActivity != null && this.curActivity.get() != null) {
            this.dataCollection.restoreCallbacks(((Activity) this.curActivity.get()).getWindow().getDecorView());
            this.curActivity = null;
        }
    }
}
