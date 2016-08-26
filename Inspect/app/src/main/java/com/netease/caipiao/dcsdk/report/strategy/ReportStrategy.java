package com.netease.caipiao.dcsdk.report.strategy;

import com.netease.caipiao.dcsdk.event.Event;
import com.netease.caipiao.dcsdk.report.EventReporter;
import java.util.List;

abstract class ReportStrategy {
    private EventReporter reporter;

    public abstract void invoke();

    public abstract void stop();

    public abstract void stub(StubType stubType, Object... objArr);

    ReportStrategy() {
    }

    public EventReporter getReporter() {
        return this.reporter;
    }

    protected void setReporter(EventReporter eventReporter) {
        this.reporter = eventReporter;
    }

    protected final void report() {
        if (this.reporter != null) {
            this.reporter.reportEvents();
        }
    }

    protected final void report(List<Event> events) {
        if (this.reporter != null) {
            this.reporter.reportEvents(events);
        }
    }
}
