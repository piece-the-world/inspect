/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.g.b;

import com.growingio.b.ae;
import com.growingio.b.aj;
import com.growingio.b.b;
import com.growingio.b.g;
import com.growingio.b.g.b.i;
import com.growingio.b.g.c.d;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.Hashtable;
import java.util.Vector;

public class a
extends d {
    private i d;
    private Hashtable e = new Hashtable();
    private Vector f = new Vector();
    private static final byte[] g = "HTTP/1.0 200 OK\r\n\r\n".getBytes();

    public a(String string) throws IOException, ae, b {
        this(Integer.parseInt(string));
    }

    public a(int n2) throws IOException, ae, b {
        this(g.a(), new i(), n2);
    }

    public a(int n2, g g2) throws IOException, ae, b {
        this(new g(g2), new i(), n2);
    }

    private a(g g2, i i2, int n2) throws IOException, ae, b {
        super(n2);
        this.d = i2;
        this.a(g2, i2);
    }

    @Override
    public void a() {
        super.a();
    }

    public synchronized int a(String string, Object object) throws b {
        Class class_ = object.getClass();
        com.growingio.b.g.b.b b2 = new com.growingio.b.g.b.b();
        b2.b = object;
        b2.c = class_.getMethods();
        this.f.addElement(b2);
        b2.a = this.f.size() - 1;
        if (string != null) {
            this.e.put(string, b2);
        }
        try {
            this.d.a(class_);
        }
        catch (ae var5_5) {
            throw new b(var5_5);
        }
        return b2.a;
    }

    @Override
    public void a(InputStream inputStream, OutputStream outputStream, String string) throws IOException, com.growingio.b.g.c.a {
        if (string.startsWith("POST /rmi ")) {
            this.a(inputStream, outputStream);
        } else if (string.startsWith("POST /lookup ")) {
            this.a(string, inputStream, outputStream);
        } else {
            super.a(inputStream, outputStream, string);
        }
    }

    private void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        Object object;
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        int n2 = objectInputStream.readInt();
        int n3 = objectInputStream.readInt();
        Exception exception = null;
        Object object2 = null;
        try {
            object = (com.growingio.b.g.b.b)this.f.elementAt(n2);
            Object[] arrobject = this.a(objectInputStream);
            object2 = this.a(object.c[n3].invoke(object.b, arrobject));
        }
        catch (Exception var8_9) {
            exception = var8_9;
            this.b(var8_9.toString());
        }
        outputStream.write(g);
        object = new ObjectOutputStream(outputStream);
        if (exception != null) {
            object.writeBoolean(false);
            object.writeUTF(exception.toString());
        } else {
            try {
                object.writeBoolean(true);
                object.writeObject(object2);
            }
            catch (NotSerializableException var9_11) {
                this.b(var9_11.toString());
            }
            catch (InvalidClassException var9_12) {
                this.b(var9_12.toString());
            }
        }
        object.flush();
        object.close();
        objectInputStream.close();
    }

    private Object[] a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        int n2 = objectInputStream.readInt();
        Object[] arrobject = new Object[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = objectInputStream.readObject();
            if (object instanceof com.growingio.b.g.b.g) {
                com.growingio.b.g.b.g g2 = (com.growingio.b.g.b.g)object;
                com.growingio.b.g.b.b b2 = (com.growingio.b.g.b.b)this.f.elementAt(g2.a);
                object = b2.b;
            }
            arrobject[i2] = object;
        }
        return arrobject;
    }

    private Object a(Object object) throws b {
        if (object == null) {
            return null;
        }
        String string = object.getClass().getName();
        if (this.d.a(string)) {
            return new com.growingio.b.g.b.g(this.a(null, object), string);
        }
        return object;
    }

    private void a(String string, InputStream inputStream, OutputStream outputStream) throws IOException {
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        String string2 = DataInputStream.readUTF(objectInputStream);
        com.growingio.b.g.b.b b2 = (com.growingio.b.g.b.b)this.e.get(string2);
        outputStream.write(g);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        if (b2 == null) {
            this.b(string2 + "not found.");
            objectOutputStream.writeInt(-1);
            objectOutputStream.writeUTF("error");
        } else {
            this.b(string2);
            objectOutputStream.writeInt(b2.a);
            objectOutputStream.writeUTF(b2.b.getClass().getName());
        }
        objectOutputStream.flush();
        objectOutputStream.close();
        objectInputStream.close();
    }
}

