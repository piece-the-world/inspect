/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.widget.ImageView
 */
package com.growingio.android.sdk.circle;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.ImageView;
import com.growingio.android.sdk.circle.ao;

class ap
extends ImageView {
    Paint a;
    final /* synthetic */ ao b;

    ap(ao ao2, Context context) {
        this.b = ao2;
        super(context);
        this.a = new Paint();
        this.a.setColor(-1);
        this.a.setStyle(Paint.Style.FILL);
    }

    public void draw(Canvas canvas) {
        Path path = new Path();
        path.moveTo((float)this.getWidth() * 0.4f, 0.0f);
        path.lineTo((float)this.getWidth() * 0.6f, 0.0f);
        path.lineTo((float)this.getWidth() * 0.6f, (float)this.getHeight() * 0.7f);
        path.lineTo((float)this.getWidth(), (float)this.getHeight() * 0.7f);
        path.lineTo((float)this.getWidth() * 0.5f, (float)this.getHeight());
        path.lineTo(0.0f, (float)this.getHeight() * 0.7f);
        path.lineTo((float)this.getWidth() * 0.4f, (float)this.getHeight() * 0.7f);
        path.close();
        canvas.drawPath(path, this.a);
    }
}

