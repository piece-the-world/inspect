/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.tendcloud.tenddata;

import android.content.Context;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.zip.CRC32;

public class ci {
    private static final long j = 0x300000;
    private static final String k = "td-cache";
    Context a;
    File b;
    RandomAccessFile c;
    String d;
    CRC32 e = new CRC32();
    Lock f = new ReentrantLock();
    long g = 0;
    long h = 0;
    long i = -1;

    public ci(Context context, String string) {
        try {
            this.a = context;
            this.d = string;
            this.b = context.getDir("td-cache", 0);
            this.e();
            try {
                this.f();
            }
            catch (IOException var3_3) {
                // empty catch block
            }
            if (this.c.length() > 0x300000) {
                this.d();
            }
        }
        catch (Throwable var3_4) {
            // empty catch block
        }
    }

    public List a(int n2) {
        LinkedList<byte[]> linkedList;
        linkedList = new LinkedList<byte[]>();
        try {
            this.h = this.g;
            this.c.seek(this.h);
            while (this.h < this.c.length()) {
                byte[] arrby = this.a(this.h, false);
                if (arrby != null) {
                    linkedList.add(arrby);
                }
                if (linkedList.size() < n2) continue;
                break;
            }
        }
        catch (IOException var3_4) {
            // empty catch block
        }
        if (linkedList.size() == 0) {
            this.g = this.h;
        }
        return linkedList;
    }

    public void a() {
        this.b(this.h);
        this.g = this.h;
    }

    public void write(byte[] arrby) {
        this.a(arrby);
    }

    public void b() {
        this.c.getFD().sync();
    }

    public void c() {
        this.b();
        this.c.close();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void d() {
        byte[] arrby;
        File file;
        this.h = this.g < this.i ? this.i : this.g;
        file = new File(this.b, this.d + ".tmp");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            while (this.h < this.c.length()) {
                arrby = this.a(this.h, false);
                if (arrby == null) continue;
                fileOutputStream.write(arrby);
            }
        }
        finally {
            fileOutputStream.flush();
            fileOutputStream.close();
            this.c.close();
        }
        arrby = new File(this.b, this.d);
        arrby.delete();
        file.renameTo((File)arrby);
        this.e();
        this.g = 0;
        this.h = 0;
    }

    private void e() {
        File file = new File(this.b, this.d);
        this.c = new RandomAccessFile(file, "rw");
    }

    private void f() {
        boolean bl2 = false;
        while (this.h < this.c.length()) {
            long l2;
            if (this.i == -1 && this.c.length() - this.h < 0x300000) {
                this.i = this.h;
            }
            if (!this.a(l2 = this.h) || bl2) continue;
            bl2 = true;
            if (this.g != 0) continue;
            this.g = l2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean a(long l2) {
        byte by2;
        block12 : {
            this.f.lock();
            try {
                this.c.seek(l2);
                by2 = this.c.readByte();
                if (by2 != 31) break block12;
                int n2 = this.c.readInt();
                int n3 = this.c.readShort();
                if (n3 >= 0 && this.c.getFilePointer() + (long)n3 <= this.c.length()) {
                    int n4;
                    this.e.reset();
                    for (n4 = 0; n4 < n3; n4 += 1) {
                        this.e.update(this.c.read());
                    }
                    by2 = this.c.readByte();
                    if (by2 == 31 && n2 == (int)this.e.getValue()) {
                        this.h = this.c.getFilePointer();
                        n4 = 1;
                        this.f.unlock();
                        return (boolean)n4;
                    }
                }
            }
            catch (Exception var3_3) {
                // empty catch block
            }
        }
        if (by2 == 46) {
            int n5 = this.c.readInt();
            by2 = this.c.readByte();
            if (n5 >= 0 && (long)n5 < this.c.length() && by2 == 46) {
                this.h = this.c.getFilePointer();
                this.g = n5;
                boolean bl2 = false;
                this.f.unlock();
                return bl2;
            }
        }
        this.h = l2 + 1;
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private byte[] a(long l2, boolean bl2) {
        Object object;
        block13 : {
            this.f.lock();
            try {
                this.c.seek(l2);
                object = this.c.readByte();
                if (object != 31) break block13;
                int n2 = this.c.readInt();
                short s2 = this.c.readShort();
                if (s2 >= 0 && this.c.getFilePointer() + (long)s2 <= this.c.length()) {
                    byte[] arrby = new byte[s2];
                    this.c.readFully(arrby);
                    object = this.c.readByte();
                    if (object == 31) {
                        this.e.reset();
                        this.e.update(arrby);
                        if (n2 == (int)this.e.getValue()) {
                            this.h = this.c.getFilePointer();
                            byte[] arrby2 = arrby;
                            this.f.unlock();
                            return arrby2;
                        }
                    }
                }
            }
            catch (Exception var4_4) {
                // empty catch block
            }
        }
        if (object == 46) {
            int n3 = this.c.readInt();
            object = this.c.readByte();
            if (n3 >= 0 && (long)n3 < this.c.length() && object == 46) {
                this.h = this.c.getFilePointer();
                if (bl2) {
                    this.g = n3;
                }
                byte[] arrby = null;
                this.f.unlock();
                return arrby;
            }
        }
        this.h = l2 + 1;
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(byte[] arrby) {
        try {
            this.f.lock();
            this.c.seek(this.c.length());
            this.c.writeByte(31);
            this.e.reset();
            this.e.update(arrby);
            this.c.writeInt((int)this.e.getValue());
            this.c.writeShort(arrby.length);
            this.c.write(arrby);
            this.c.writeByte(31);
        }
        finally {
            this.f.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void b(long l2) {
        try {
            this.f.lock();
            this.c.seek(this.c.length());
            this.c.writeByte(46);
            this.c.writeInt((int)l2);
            this.c.writeByte(46);
        }
        finally {
            this.f.unlock();
        }
    }
}

