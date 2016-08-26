package com.netease.caipiao.dcsdk;

import android.content.Context;
import java.util.List;

public class Configuration {
    private String appKey;
    private List<String> appPackageNames;
    private String channel;
    private Context context;
    private boolean debugMode;
    private String deviceId;
    private boolean disableViewTracking;
    private boolean enableSnapshot;

    public Configuration(Context context, String appKey, String deviceId, String channel) {
        this.enableSnapshot = false;
        this.debugMode = false;
        this.disableViewTracking = false;
        this.appPackageNames = null;
        this.context = context;
        this.appKey = appKey;
        this.deviceId = deviceId;
        this.channel = channel;
    }

    public Configuration setDisableViewTracking(boolean disableViewTracking) {
        this.disableViewTracking = disableViewTracking;
        return this;
    }

    public Configuration setAppPackageNames(List<String> appPackageNames) {
        this.appPackageNames = appPackageNames;
        return this;
    }

    public Configuration setEnableSnapshot(boolean enableSnapshot) {
        this.enableSnapshot = enableSnapshot;
        return this;
    }

    public Configuration setDebugMode(boolean debugMode) {
        this.debugMode = debugMode;
        return this;
    }

    public Context getContext() {
        return this.context;
    }

    public String getAppKey() {
        return this.appKey;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getChannel() {
        return this.channel;
    }

    public boolean isDisableViewTracking() {
        return this.disableViewTracking;
    }

    public List<String> getAppPackageNames() {
        return this.appPackageNames;
    }

    public boolean isEnableSnapshot() {
        return this.enableSnapshot;
    }

    public boolean isDebugMode() {
        return this.debugMode;
    }
}
