/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.e;
import com.growingio.d.a.f;
import com.growingio.d.a.f.Q;
import com.growingio.d.a.f.S;
import com.growingio.d.a.f.T;
import com.growingio.d.a.f.U;
import com.growingio.d.a.f.V;
import com.growingio.d.a.f.W;
import com.growingio.d.a.f.X;
import com.growingio.d.a.f.Y;
import com.growingio.d.a.f.Z;
import com.growingio.d.a.f.aa;
import com.growingio.d.a.f.ab;
import com.growingio.d.a.f.ac;
import com.growingio.d.a.f.af;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import javax.xml.transform.Source;
import javax.xml.transform.Templates;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.stream.StreamSource;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.XMLReaderFactory;

public class P {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    private static final String d = "classes.xml";
    private final int e;
    private final int f;
    private final InputStream g;
    private final OutputStream h;
    private final Source i;
    private int j = 0;

    public P(int n2, int n3, InputStream inputStream, OutputStream outputStream, Source source) {
        this.e = n2;
        this.f = n3;
        this.g = inputStream;
        this.h = outputStream;
        this.i = source;
    }

    public int a() throws TransformerException, IOException, SAXException {
        Object object;
        ZipEntry zipEntry;
        ZipInputStream zipInputStream = new ZipInputStream(this.g);
        ZipOutputStream zipOutputStream = new ZipOutputStream(this.h);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(zipOutputStream);
        Thread.currentThread().setContextClassLoader(this.getClass().getClassLoader());
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        if (!transformerFactory.getFeature("http://javax.xml.transform.sax.SAXSource/feature") || !transformerFactory.getFeature("http://javax.xml.transform.sax.SAXResult/feature")) {
            return 0;
        }
        SAXTransformerFactory sAXTransformerFactory = (SAXTransformerFactory)transformerFactory;
        Templates templates = null;
        if (this.i != null) {
            templates = sAXTransformerFactory.newTemplates(this.i);
        }
        T t2 = this.a(zipOutputStream);
        Object object2 = null;
        switch (this.f) {
            case 1: {
                object2 = new V(new Q(zipOutputStream), t2, false);
                break;
            }
            case 2: {
                object2 = new V(new Y(outputStreamWriter, true), t2, true);
                break;
            }
            case 3: {
                object = new ZipEntry("classes.xml");
                zipOutputStream.putNextEntry((ZipEntry)object);
                object2 = new X(outputStreamWriter, false);
            }
        }
        object = templates == null ? object2 : new Object("class", (ContentHandler)object2, new ab(sAXTransformerFactory, templates, (ContentHandler)object2));
        aa aa2 = new aa((ContentHandler)object);
        if (object != null && this.e != 3) {
            object.startDocument();
            object.startElement("", "classes", "classes", new AttributesImpl());
        }
        int n2 = 0;
        while ((zipEntry = zipInputStream.getNextEntry()) != null) {
            this.a(zipEntry.getName(), this.j++);
            if (this.a(zipEntry)) {
                this.a(zipInputStream, zipEntry, aa2);
            } else {
                OutputStream outputStream = t2.a(this.b(zipEntry));
                this.a(zipInputStream, outputStream);
                t2.a();
            }
            ++n2;
        }
        if (object != null && this.e != 3) {
            object.endElement("", "classes", "classes");
            object.endDocument();
        }
        if (this.f == 3) {
            zipOutputStream.closeEntry();
        }
        zipOutputStream.flush();
        zipOutputStream.close();
        return n2;
    }

    private void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        int n2;
        if (this.f == 3) {
            return;
        }
        byte[] arrby = new byte[2048];
        while ((n2 = inputStream.read(arrby)) != -1) {
            outputStream.write(arrby, 0, n2);
        }
    }

    private boolean a(ZipEntry zipEntry) {
        String string = zipEntry.getName();
        return this.e == 3 && string.equals("classes.xml") || string.endsWith(".class") || string.endsWith(".class.xml");
    }

    private void a(ZipInputStream zipInputStream, ZipEntry zipEntry, S s2) {
        ContentHandler contentHandler = s2.a();
        try {
            boolean bl2;
            boolean bl3 = bl2 = this.e == 3;
            if (this.e == 1) {
                e e2 = new e(P.a(zipInputStream, zipEntry));
                e2.a(new af(contentHandler, bl2), 0);
            } else {
                XMLReader xMLReader = XMLReaderFactory.createXMLReader();
                xMLReader.setContentHandler(contentHandler);
                xMLReader.parse(new InputSource(bl2 ? new W(zipInputStream) : new ByteArrayInputStream(P.a(zipInputStream, zipEntry))));
            }
        }
        catch (Exception var5_6) {
            this.a(zipEntry.getName(), 0);
            this.a(var5_6, 0);
        }
    }

    private T a(ZipOutputStream zipOutputStream) {
        if (this.f == 3) {
            return new Z(zipOutputStream);
        }
        return new ac(zipOutputStream);
    }

    private String b(ZipEntry zipEntry) {
        String string = zipEntry.getName();
        if (this.a(zipEntry)) {
            if (this.e != 1 && this.f == 1) {
                string = string.substring(0, string.length() - 4);
            } else if (this.e == 1 && this.f != 1) {
                string = string + ".xml";
            }
        }
        return string;
    }

    private static byte[] a(InputStream inputStream, ZipEntry zipEntry) throws IOException {
        int n2;
        long l2 = zipEntry.getSize();
        if (l2 > -1) {
            int n3;
            byte[] arrby = new byte[(int)l2];
            int n4 = 0;
            while ((n3 = inputStream.read(arrby, n4, arrby.length - n4)) > 0) {
                n4 += n3;
            }
            return arrby;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] arrby = new byte[4096];
        while ((n2 = inputStream.read(arrby)) != -1) {
            byteArrayOutputStream.write(arrby, 0, n2);
        }
        return byteArrayOutputStream.toByteArray();
    }

    protected void a(Object object, int n2) {
        if (object instanceof Throwable) {
            ((Throwable)object).printStackTrace();
        } else if (n2 % 100 == 0) {
            System.err.println("" + n2 + " " + object);
        }
    }

    public static void a(String[] arrstring) throws Exception {
        if (arrstring.length < 2) {
            P.b();
            return;
        }
        int n2 = P.a(arrstring[0]);
        int n3 = P.a(arrstring[1]);
        InputStream inputStream = System.in;
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(System.out);
        StreamSource streamSource = null;
        for (int i2 = 2; i2 < arrstring.length; ++i2) {
            if ("-in".equals(arrstring[i2])) {
                inputStream = new FileInputStream(arrstring[++i2]);
                continue;
            }
            if ("-out".equals(arrstring[i2])) {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(arrstring[++i2]));
                continue;
            }
            if ("-xslt".equals(arrstring[i2])) {
                streamSource = new StreamSource(new FileInputStream(arrstring[++i2]));
                continue;
            }
            P.b();
            return;
        }
        if (n2 == 0 || n3 == 0) {
            P.b();
            return;
        }
        P p2 = new P(n2, n3, inputStream, bufferedOutputStream, streamSource);
        long l2 = System.currentTimeMillis();
        int n4 = p2.a();
        long l3 = System.currentTimeMillis();
        System.err.println(n4);
        System.err.println("" + (l3 - l2) + "ms  " + 1000.0f * (float)n4 / (float)(l3 - l2) + " resources/sec");
    }

    private static int a(String string) {
        if ("code".equals(string)) {
            return 1;
        }
        if ("xml".equals(string)) {
            return 2;
        }
        if ("singlexml".equals(string)) {
            return 3;
        }
        return 0;
    }

    private static void b() {
        System.err.println("Usage: Main <in format> <out format> [-in <input jar>] [-out <output jar>] [-xslt <xslt fiel>]");
        System.err.println("  when -in or -out is omitted sysin and sysout would be used");
        System.err.println("  <in format> and <out format> - code | xml | singlexml");
    }
}

