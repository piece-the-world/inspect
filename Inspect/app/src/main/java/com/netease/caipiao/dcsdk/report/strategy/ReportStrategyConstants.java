package com.netease.caipiao.dcsdk.report.strategy;

enum ReportStrategyConstants {
    SCHEDULE_REPORT_STRATEGY(new ScheduleReportStrategy()),
    TIMES_REPORT_STRATEGY(new TimesReportStrategy()),
    FORE_BACKGROUND_STRATEGY(new ForeBackgroundReportStrategy());
    
    private ReportStrategy strategy;

    private ReportStrategyConstants(ReportStrategy reportStrategy) {
        this.strategy = reportStrategy;
    }

    public ReportStrategy getStrategy() {
        return this.strategy;
    }
}
