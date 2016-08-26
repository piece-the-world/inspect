/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.g.b;

import com.growingio.b.g.b.d;
import com.growingio.b.g.b.e;
import com.growingio.b.g.b.f;
import com.growingio.b.g.b.g;
import java.applet.Applet;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.net.Socket;
import java.net.URL;

public class c
implements Serializable {
    private final byte[] c = new byte[]{13, 10};
    private String d;
    private String e;
    private int f;
    private int g;
    protected byte[] a = "POST /lookup HTTP/1.0".getBytes();
    protected byte[] b = "POST /rmi HTTP/1.0".getBytes();
    private static final Class[] h = new Class[]{c.class, Integer.TYPE};

    public c(Applet applet) {
        URL uRL = applet.getCodeBase();
        this.e = this.d = uRL.getHost();
        this.g = this.f = uRL.getPort();
    }

    public c(String string, int n2) {
        this.e = this.d = string;
        this.g = this.f = n2;
    }

    public Object a(String string) {
        try {
            return this.b(string);
        }
        catch (d var2_2) {
            return null;
        }
    }

    public void a(String string, int n2) {
        String string2 = "POST http://" + this.e + ":" + this.g;
        String string3 = string2 + "/lookup HTTP/1.0";
        this.a = string3.getBytes();
        string3 = string2 + "/rmi HTTP/1.0";
        this.b = string3.getBytes();
        this.d = string;
        this.f = n2;
    }

    public Object b(String string) throws d {
        try {
            Socket socket = new Socket(this.d, this.f);
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(this.a);
            outputStream.write(this.c);
            outputStream.write(this.c);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeUTF(string);
            objectOutputStream.flush();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
            this.a(bufferedInputStream);
            ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);
            int n2 = objectInputStream.readInt();
            String string2 = objectInputStream.readUTF();
            objectInputStream.close();
            objectOutputStream.close();
            socket.close();
            if (n2 >= 0) {
                return this.a(n2, string2);
            }
        }
        catch (Exception var2_3) {
            var2_3.printStackTrace();
            throw new d(string, var2_3);
        }
        throw new d(string);
    }

    private Object a(int n2, String string) throws Exception {
        Class class_ = Class.forName(string);
        Constructor constructor = class_.getConstructor(h);
        return constructor.newInstance(this, new Integer(n2));
    }

    public Object a(int n2, int n3, Object[] arrobject) throws f {
        String string;
        Object object;
        boolean bl2;
        try {
            Socket socket = new Socket(this.d, this.f);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
            bufferedOutputStream.write(this.b);
            bufferedOutputStream.write(this.c);
            bufferedOutputStream.write(this.c);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);
            objectOutputStream.writeInt(n2);
            objectOutputStream.writeInt(n3);
            this.a(objectOutputStream, arrobject);
            objectOutputStream.flush();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
            this.a(bufferedInputStream);
            ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);
            bl2 = objectInputStream.readBoolean();
            object = null;
            string = null;
            if (bl2) {
                object = objectInputStream.readObject();
            } else {
                string = objectInputStream.readUTF();
            }
            objectInputStream.close();
            objectOutputStream.close();
            socket.close();
            if (object instanceof g) {
                g g2 = (g)object;
                object = this.a(g2.a, g2.b);
            }
        }
        catch (ClassNotFoundException var7_5) {
            throw new f(var7_5);
        }
        catch (IOException var7_6) {
            throw new f(var7_6);
        }
        catch (Exception var7_7) {
            throw new f(var7_7);
        }
        if (bl2) {
            return object;
        }
        throw new f(string);
    }

    private void a(InputStream inputStream) throws IOException {
        int n2;
        do {
            int n3;
            n2 = 0;
            while ((n3 = inputStream.read()) >= 0 && n3 != 13) {
                ++n2;
            }
            inputStream.read();
        } while (n2 > 0);
    }

    private void a(ObjectOutputStream objectOutputStream, Object[] arrobject) throws IOException {
        int n2 = arrobject.length;
        objectOutputStream.writeInt(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            if (arrobject[i2] instanceof e) {
                e e2 = (e)arrobject[i2];
                objectOutputStream.writeObject(new g(e2.a()));
                continue;
            }
            objectOutputStream.writeObject(arrobject[i2]);
        }
    }
}

