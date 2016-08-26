package com.netease.caipiao.dcsdk.event;

import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import com.netease.caipiao.dcsdk.BuildConfig;
import com.netease.caipiao.dcsdk.Sprite;
import com.netease.caipiao.dcsdk.log.Logger;
import com.netease.caipiao.dcsdk.log.Tags;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class EventRamCache<T extends Event> {
    private static int DEFAULT_SIZE;
    private List<T> events;
    private int size;

    static {
        DEFAULT_SIZE = 10;
    }

    public EventRamCache() {
        this(DEFAULT_SIZE);
    }

    public EventRamCache(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("the size of this cache should be greater than 0");
        }
        this.size = size;
        this.events = new ArrayList(size);
    }

    public synchronized void add(T event) {
        Logger.debug(Tags.EVENT, "event add", (Event) event);
        if (this.events.size() == this.size) {
            Sprite.getInstance().getEventReporter().reportEvents(new ArrayList(this.events));
            this.events.clear();
        }
        this.events.add(event);
    }

    private String findPath() {
        String path = BuildConfig.FLAVOR;
        if (Environment.getExternalStorageState().equals("mounted")) {
            path = Environment.getExternalStorageDirectory() + File.separator + "netease_dc" + File.separator;
        }
        if (TextUtils.isEmpty(path)) {
            Log.e("zyyin", "\u672a\u627e\u5230sd\u5361");
        } else {
            File f = new File(path);
            if (!f.exists()) {
                f.mkdirs();
            }
        }
        return path;
    }

    public synchronized List<Event> getEvents() {
        List<Event> res;
        res = new ArrayList(this.events);
        this.events.clear();
        return res;
    }
}
