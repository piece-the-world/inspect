/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a;

class y
implements Runnable {
    private final Thread a;
    private final long b;

    public static Thread a(long l2) {
        return y.a(Thread.currentThread(), l2);
    }

    public static Thread a(Thread thread, long l2) {
        Thread thread2 = null;
        if (l2 > 0) {
            y y2 = new y(thread, l2);
            thread2 = new Thread((Runnable)y2, y.class.getSimpleName());
            thread2.setDaemon(true);
            thread2.start();
        }
        return thread2;
    }

    public static void a(Thread thread) {
        if (thread != null) {
            thread.interrupt();
        }
    }

    private y(Thread thread, long l2) {
        this.a = thread;
        this.b = l2;
    }

    @Override
    public void run() {
        try {
            y.b(this.b);
            this.a.interrupt();
        }
        catch (InterruptedException var1_1) {
            // empty catch block
        }
    }

    private static void b(long l2) throws InterruptedException {
        long l3 = System.currentTimeMillis() + l2;
        long l4 = l2;
        do {
            Thread.sleep(l4);
        } while ((l4 = l3 - System.currentTimeMillis()) > 0);
    }
}

