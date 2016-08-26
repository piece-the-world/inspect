package com.netease.caipiao.dcsdk.report;

import com.netease.caipiao.dcsdk.Sprite;
import java.io.File;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request.Builder;
import okhttp3.RequestBody;

public class ReportRequest {
    public static final MediaType STREAM;
    private OkHttpClient client;

    public ReportRequest() {
        this.client = new OkHttpClient();
    }

    static {
        STREAM = MediaType.parse("application/x-google-protobuf");
    }

    public int reportEventsSync(byte[] eventBytes) {
        int i = -1;
        if (!(eventBytes == null || eventBytes.length == 0)) {
            try {
                i = this.client.newCall(new Builder().url(Urls.REPORT_EVENT).post(RequestBody.create(STREAM, eventBytes)).build()).execute().code();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return i;
    }

    public void reportImageSync(File file) {
        try {
            this.client.newCall(new Builder().url(Urls.REPORT_IMAGE).post(new MultipartBody.Builder().setType(MultipartBody.FORM).addFormDataPart("file", file.getName(), RequestBody.create(MediaType.parse("image/png"), file)).addFormDataPart("app", Sprite.getInstance().getAppKey()).addFormDataPart("os", "android").addFormDataPart("version", Sprite.getInstance().getVersion()).build()).build()).execute().body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
