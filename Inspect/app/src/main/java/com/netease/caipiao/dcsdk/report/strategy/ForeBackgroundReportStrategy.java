package com.netease.caipiao.dcsdk.report.strategy;

import com.netease.caipiao.dcsdk.log.Logger;
import com.netease.caipiao.dcsdk.log.Tags;

class ForeBackgroundReportStrategy extends ReportStrategy {
    ForeBackgroundReportStrategy() {
    }

    public void stub(StubType type, Object... args) {
        if (type == StubType.FORE_BACK_GROUND) {
            Logger.debug(Tags.FORE_BACK_GROUND_STRATEGY, "fore or background stub!", new Object[0]);
            report();
        }
    }

    public void invoke() {
    }

    public void stop() {
    }
}
