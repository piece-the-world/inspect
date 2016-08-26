package com.netease.caipiao.dcsdk.report.strategy;

import android.os.Handler;
import com.netease.caipiao.dcsdk.log.Logger;
import com.netease.caipiao.dcsdk.log.Tags;

class ScheduleReportStrategy extends ReportStrategy {
    private static final long TIEM_INTERVAL = 30000;
    private static volatile boolean stop;
    private Handler handler;
    private Runnable reportRunable;

    /* renamed from: com.netease.caipiao.dcsdk.report.strategy.ScheduleReportStrategy.1 */
    class C02841 implements Runnable {
        C02841() {
        }

        public void run() {
            ScheduleReportStrategy.this.report();
            if (ScheduleReportStrategy.this.handler != null && !ScheduleReportStrategy.stop) {
                Logger.debug(Tags.SCHEDULE_STRATEGY, "polling !", new Object[0]);
                ScheduleReportStrategy.this.handler.postDelayed(this, ScheduleReportStrategy.TIEM_INTERVAL);
            }
        }
    }

    ScheduleReportStrategy() {
        this.reportRunable = new C02841();
    }

    static {
        stop = false;
    }

    public void stub(StubType type, Object... args) {
    }

    public void invoke() {
        if (getReporter() != null && getReporter().getHandlerThread() != null) {
            this.handler = new Handler(getReporter().getHandlerThread().getLooper());
            Logger.debug(Tags.SCHEDULE_STRATEGY, "ScheduleReportStrategy invoked !", new Object[0]);
            this.handler.postDelayed(this.reportRunable, TIEM_INTERVAL);
        }
    }

    public void stop() {
        stop = true;
    }
}
