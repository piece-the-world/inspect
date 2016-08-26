package com.netease.caipiao.dcsdk.report;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.google.protobuf.InvalidProtocolBufferException;
import com.netease.caipiao.dcsdk.BuildConfig;
import com.netease.caipiao.dcsdk.event.Event;
import com.netease.caipiao.dcsdk.event.ProtoEvent.ButtonViewMsg;
import com.netease.caipiao.dcsdk.log.Logger;
import com.netease.caipiao.dcsdk.log.Tags;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;

public class EventReporter {
    private static final String EVENT_FILE = "com_netease_tech_event_data_collection_new";
    private static final long MAX_FILE_BYTES = 262144;
    private static final String TEST_FILE_NAME = "test_file";
    private Context context;
    private Handler handler;
    private HandlerThread handlerThread;
    private ReportRequest reportRequest;
    int testFileIndex;

    /* renamed from: com.netease.caipiao.dcsdk.report.EventReporter.1 */
    class C02821 implements Runnable {
        C02821() {
        }

        public void run() {
            byte[] eventBytes = EventReporter.this.readEvent(EventReporter.EVENT_FILE);
            if (eventBytes != null && 200 == EventReporter.this.reportRequest.reportEventsSync(eventBytes)) {
                EventReporter.this.clearEvents();
            }
        }
    }

    /* renamed from: com.netease.caipiao.dcsdk.report.EventReporter.2 */
    class C02832 implements Runnable {
        final /* synthetic */ List val$events;

        C02832(List list) {
            this.val$events = list;
        }

        public void run() {
            EventReporter.this.saveEventsWithHeader(this.val$events);
            byte[] eventBytes = EventReporter.this.readEvent(EventReporter.EVENT_FILE);
            if (Logger.isDebugSwitchOn()) {
                EventReporter.this.parseEventsFromBytes(eventBytes);
            }
            if (eventBytes != null && 200 == EventReporter.this.reportRequest.reportEventsSync(eventBytes)) {
                EventReporter.this.clearEvents();
            }
        }
    }

    public HandlerThread getHandlerThread() {
        return this.handlerThread;
    }

    public EventReporter(Context context) {
        this.reportRequest = new ReportRequest();
        this.testFileIndex = 0;
        this.context = context;
        this.handlerThread = new HandlerThread(EventReporter.class.getSimpleName());
        this.handlerThread.start();
        this.handler = new Handler(this.handlerThread.getLooper());
    }

    public void reportEvents() {
        Logger.debug(Tags.REPORT, "try to report file data", new Object[0]);
        this.handler.post(new C02821());
    }

    private void parseEventsFromBytes(byte[] eventBytes) {
        if (eventBytes == null) {
            Logger.debug(Tags.REPORT, "parseEventsFromBytes:eventBytes null!", new Object[0]);
            return;
        }
        int offset = 0;
        while (offset < eventBytes.length) {
            int size = ByteBuffer.wrap(eventBytes, offset, 4).getInt();
            if (size > 6) {
                int itemSize = size - 6;
                int itemOffset = offset + 4;
                int type = ByteBuffer.wrap(eventBytes, itemOffset, 2).getShort();
                itemOffset += 2;
                Logger.debug(Tags.REPORT, "parseEventsFromBytes:size=%d,type=%d", Integer.valueOf(size), Integer.valueOf(type));
                if (type == 3) {
                    try {
                        ButtonViewMsg msg = ButtonViewMsg.parseFrom(Arrays.copyOfRange(eventBytes, itemOffset, itemOffset + itemSize));
                        String str = Tags.REPORT;
                        String str2 = "parseEventsFromBytes success, eventName =%s,eventTime =%s,page =%s,frame=%s";
                        Object[] objArr = new Object[4];
                        objArr[0] = msg.getEventName();
                        objArr[1] = msg.getEventTime();
                        objArr[2] = msg.getPage();
                        objArr[3] = msg.getView() == null ? BuildConfig.FLAVOR : msg.getView().getFrame();
                        Logger.debug(str, str2, objArr);
                    } catch (InvalidProtocolBufferException e) {
                        Logger.debug(Tags.REPORT, "parseEventsFromBytes failed", new Object[0]);
                        e.printStackTrace();
                    }
                }
            }
            offset += size;
        }
    }

    private void writeTestDate(byte[] itemData) {
        if (itemData != null) {
            try {
                FileOutputStream outputStream = this.context.openFileOutput(TEST_FILE_NAME + this.testFileIndex, 0);
                outputStream.write(itemData);
                outputStream.flush();
                outputStream.close();
                this.testFileIndex++;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    public void reportEvents(List<Event> events) {
        Logger.debug(Tags.REPORT, "report events", new Object[0]);
        this.handler.post(new C02832(events));
    }

    public void saveEventsWithHeader(List<Event> events) {
        try {
            File file = this.context.getFileStreamPath(EVENT_FILE);
            if (file.length() > MAX_FILE_BYTES) {
                clearEvents();
            }
            FileOutputStream output = new FileOutputStream(file, true);
            for (Event event : events) {
                output.write(event.toByteArray());
            }
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public byte[] readEvent(String fileName) {
        if (TextUtils.isEmpty(fileName)) {
            return null;
        }
        File file = this.context.getFileStreamPath(fileName);
        int size = (int) file.length();
        if (size <= 0) {
            return null;
        }
        byte[] bytes = new byte[size];
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            bufferedInputStream.read(bytes, 0, size);
            bufferedInputStream.close();
            return bytes;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void clearEvents() {
        this.context.deleteFile(EVENT_FILE);
    }
}
