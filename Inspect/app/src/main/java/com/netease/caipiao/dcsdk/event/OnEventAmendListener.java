package com.netease.caipiao.dcsdk.event;

import android.view.View;
import com.netease.caipiao.dcsdk.event.ProtoEvent.MapItem;
import java.util.List;

public interface OnEventAmendListener {
    Event onEventAmend(View view, Event event, EventAmendDescription eventAmendDescription, List<MapItem> list);
}
