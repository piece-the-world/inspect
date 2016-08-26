package com.netease.caipiao.dcsdk.report.strategy;

import com.netease.caipiao.dcsdk.report.EventReporter;

public class ReportStrategyUtils {
    private ReportStrategyUtils() {
    }

    public static void stub(StubType type, Object... args) {
        for (ReportStrategyConstants reportStrategy : ReportStrategyConstants.values()) {
            reportStrategy.getStrategy().stub(type, args);
        }
    }

    public static void invoke(EventReporter eventReporter) {
        for (ReportStrategyConstants reportStrategy : ReportStrategyConstants.values()) {
            reportStrategy.getStrategy().setReporter(eventReporter);
            reportStrategy.getStrategy().invoke();
        }
    }

    public static void stop() {
        for (ReportStrategyConstants reportStrategy : ReportStrategyConstants.values()) {
            reportStrategy.getStrategy().stop();
        }
    }
}
