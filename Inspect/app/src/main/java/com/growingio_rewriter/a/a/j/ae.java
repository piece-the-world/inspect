/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aC;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aV;
import com.growingio.a.a.b.bp;
import com.growingio.a.a.d.oH;
import com.growingio.a.a.h.H;
import com.growingio.a.a.h.L;
import com.growingio.a.a.j.B;
import com.growingio.a.a.j.I;
import com.growingio.a.a.j.J;
import com.growingio.a.a.j.T;
import com.growingio.a.a.j.ad;
import com.growingio.a.a.j.af;
import com.growingio.a.a.j.ag;
import com.growingio.a.a.j.ah;
import com.growingio.a.a.j.ai;
import com.growingio.a.a.j.aj;
import com.growingio.a.a.j.ao;
import com.growingio.a.a.j.r;
import com.growingio.a.a.j.s;
import com.growingio.a.a.j.v;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.io.Writer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public final class ae {
    private static final int a = 10000;
    private static final oH<File> b = new ag();

    private ae() {
    }

    public static BufferedReader a(File file, Charset charset) throws FileNotFoundException {
        aU.a(file);
        aU.a(charset);
        return new BufferedReader(new InputStreamReader((InputStream)new FileInputStream(file), charset));
    }

    public static BufferedWriter b(File file, Charset charset) throws FileNotFoundException {
        aU.a(file);
        aU.a(charset);
        return new BufferedWriter(new OutputStreamWriter((OutputStream)new FileOutputStream(file), charset));
    }

    public static v a(File file) {
        return new ai(file, null);
    }

    static byte[] a(InputStream inputStream, long l2) throws IOException {
        if (l2 > Integer.MAX_VALUE) {
            throw new OutOfMemoryError("file is too large to fit in a byte array: " + l2 + " bytes");
        }
        return l2 == 0 ? B.a(inputStream) : B.a(inputStream, (int)l2);
    }

    public static /* varargs */ s a(File file, ad ... arrad) {
        return new ah(file, arrad, null);
    }

    public static J c(File file, Charset charset) {
        return ae.a(file).a(charset);
    }

    public static /* varargs */ I a(File file, Charset charset, ad ... arrad) {
        return ae.a(file, arrad).a(charset);
    }

    private static ad[] a(boolean bl2) {
        ad[] arrad;
        if (bl2) {
            ad[] arrad2 = new ad[1];
            arrad = arrad2;
            arrad2[0] = ad.a;
        } else {
            arrad = new ad[]{};
        }
        return arrad;
    }

    public static byte[] b(File file) throws IOException {
        return ae.a(file).f();
    }

    public static String d(File file, Charset charset) throws IOException {
        return ae.c(file, charset).e();
    }

    public static void a(byte[] arrby, File file) throws IOException {
        ae.a(file, new ad[0]).a(arrby);
    }

    public static void a(File file, OutputStream outputStream) throws IOException {
        ae.a(file).a(outputStream);
    }

    public static void a(File file, File file2) throws IOException {
        aU.a(!file.equals(file2), "Source %s and destination %s must be different", (Object)file, (Object)file2);
        ae.a(file).a(ae.a(file2, new ad[0]));
    }

    public static void a(CharSequence charSequence, File file, Charset charset) throws IOException {
        ae.a(file, charset, new ad[0]).a(charSequence);
    }

    public static void b(CharSequence charSequence, File file, Charset charset) throws IOException {
        ae.a(charSequence, file, charset, true);
    }

    private static void a(CharSequence charSequence, File file, Charset charset, boolean bl2) throws IOException {
        ae.a(file, charset, ae.a(bl2)).a(charSequence);
    }

    public static void a(File file, Charset charset, Appendable appendable) throws IOException {
        ae.c(file, charset).a(appendable);
    }

    public static boolean b(File file, File file2) throws IOException {
        aU.a(file);
        aU.a(file2);
        if (file == file2 || file.equals(file2)) {
            return true;
        }
        long l2 = file.length();
        long l3 = file2.length();
        if (l2 != 0 && l3 != 0 && l2 != l3) {
            return false;
        }
        return ae.a(file).a(ae.a(file2));
    }

    public static File a() {
        File file = new File(System.getProperty("java.io.tmpdir"));
        String string = "" + System.currentTimeMillis() + "-";
        for (int i2 = 0; i2 < 10000; ++i2) {
            File file2 = new File(file, string + i2);
            if (!file2.mkdir()) continue;
            return file2;
        }
        throw new IllegalStateException("Failed to create directory within 10000 attempts (tried " + string + "0 to " + string + 9999 + ')');
    }

    public static void c(File file) throws IOException {
        aU.a(file);
        if (!file.createNewFile() && !file.setLastModified(System.currentTimeMillis())) {
            throw new IOException("Unable to update modification time of " + file);
        }
    }

    public static void d(File file) throws IOException {
        aU.a(file);
        File file2 = file.getCanonicalFile().getParentFile();
        if (file2 == null) {
            return;
        }
        file2.mkdirs();
        if (!file2.isDirectory()) {
            throw new IOException("Unable to create parent directories of " + file);
        }
    }

    public static void c(File file, File file2) throws IOException {
        aU.a(file);
        aU.a(file2);
        aU.a(!file.equals(file2), "Source %s and destination %s must be different", (Object)file, (Object)file2);
        if (!file.renameTo(file2)) {
            ae.a(file, file2);
            if (!file.delete()) {
                if (!file2.delete()) {
                    throw new IOException("Unable to delete " + file2);
                }
                throw new IOException("Unable to delete " + file);
            }
        }
    }

    public static String e(File file, Charset charset) throws IOException {
        return ae.c(file, charset).f();
    }

    public static List<String> f(File file, Charset charset) throws IOException {
        return (List)ae.a(file, charset, new af());
    }

    public static <T> T a(File file, Charset charset, ao<T> ao2) throws IOException {
        return ae.c(file, charset).a(ao2);
    }

    public static <T> T a(File file, r<T> r2) throws IOException {
        return ae.a(file).a(r2);
    }

    public static H a(File file, L l2) throws IOException {
        return ae.a(file).a(l2);
    }

    public static MappedByteBuffer e(File file) throws IOException {
        aU.a(file);
        return ae.a(file, FileChannel.MapMode.READ_ONLY);
    }

    public static MappedByteBuffer a(File file, FileChannel.MapMode mapMode) throws IOException {
        aU.a(file);
        aU.a(mapMode);
        if (!file.exists()) {
            throw new FileNotFoundException(file.toString());
        }
        return ae.a(file, mapMode, file.length());
    }

    public static MappedByteBuffer a(File file, FileChannel.MapMode mapMode, long l2) throws FileNotFoundException, IOException {
        aU.a(file);
        aU.a(mapMode);
        T t2 = T.a();
        try {
            RandomAccessFile randomAccessFile = t2.a(new RandomAccessFile(file, mapMode == FileChannel.MapMode.READ_ONLY ? "r" : "rw"));
            MappedByteBuffer mappedByteBuffer = ae.a(randomAccessFile, mapMode, l2);
            return mappedByteBuffer;
        }
        catch (Throwable var5_5) {
            throw t2.a(var5_5);
        }
        finally {
            t2.close();
        }
    }

    private static MappedByteBuffer a(RandomAccessFile randomAccessFile, FileChannel.MapMode mapMode, long l2) throws IOException {
        T t2 = T.a();
        try {
            FileChannel fileChannel = t2.a(randomAccessFile.getChannel());
            MappedByteBuffer mappedByteBuffer = fileChannel.map(mapMode, 0, l2);
            return mappedByteBuffer;
        }
        catch (Throwable var5_5) {
            throw t2.a(var5_5);
        }
        finally {
            t2.close();
        }
    }

    public static String a(String string) {
        aU.a(string);
        if (string.length() == 0) {
            return ".";
        }
        Iterable<String> iterable = bp.a('/').a().a(string);
        ArrayList<String> arrayList = new ArrayList<String>();
        for (String string2 : iterable) {
            if (string2.equals(".")) continue;
            if (string2.equals("..")) {
                if (arrayList.size() > 0 && !((String)arrayList.get(arrayList.size() - 1)).equals("..")) {
                    arrayList.remove(arrayList.size() - 1);
                    continue;
                }
                arrayList.add("..");
                continue;
            }
            arrayList.add(string2);
        }
        Object object = aC.a('/').a(arrayList);
        if (string.charAt(0) == '/') {
            object = "/" + (String)object;
        }
        while (object.startsWith("/../")) {
            object = object.substring(3);
        }
        if (object.equals("/..")) {
            object = "/";
        } else if ("".equals(object)) {
            object = ".";
        }
        return object;
    }

    public static String b(String string) {
        aU.a(string);
        String string2 = new File(string).getName();
        int n2 = string2.lastIndexOf(46);
        return n2 == -1 ? "" : string2.substring(n2 + 1);
    }

    public static String c(String string) {
        aU.a(string);
        String string2 = new File(string).getName();
        int n2 = string2.lastIndexOf(46);
        return n2 == -1 ? string2 : string2.substring(0, n2);
    }

    public static oH<File> b() {
        return b;
    }

    public static aV<File> c() {
        return aj.a;
    }

    public static aV<File> d() {
        return aj.b;
    }
}

