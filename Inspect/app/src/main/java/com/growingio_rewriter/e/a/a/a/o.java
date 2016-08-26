/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a;

import com.growingio.e.a.a.a.b;
import com.growingio.e.a.a.a.b.h;
import com.growingio.e.a.a.a.b.j;
import com.growingio.e.a.a.a.b.l;
import com.growingio.e.a.a.a.b.n;
import com.growingio.e.a.a.a.b.v;
import com.growingio.e.a.a.a.b.w;
import com.growingio.e.a.a.a.m;
import com.growingio.e.a.a.a.p;
import com.growingio.e.a.a.a.q;
import com.growingio.e.a.a.a.u;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;

public class o {
    public static final long a = 1024;
    public static final BigInteger b = BigInteger.valueOf(1024);
    public static final long c = 0x100000;
    public static final BigInteger d = b.multiply(b);
    private static final long p = 31457280;
    public static final long e = 0x40000000;
    public static final BigInteger f = b.multiply(d);
    public static final long g = 0x10000000000L;
    public static final BigInteger h = b.multiply(f);
    public static final long i = 0x4000000000000L;
    public static final BigInteger j = b.multiply(h);
    public static final long k = 0x1000000000000000L;
    public static final BigInteger l = b.multiply(j);
    public static final BigInteger m = BigInteger.valueOf(1024).multiply(BigInteger.valueOf(0x1000000000000000L));
    public static final BigInteger n = b.multiply(m);
    public static final File[] o = new File[0];

    public static /* varargs */ File a(File file, String ... arrstring) {
        if (file == null) {
            throw new NullPointerException("directory must not be null");
        }
        if (arrstring == null) {
            throw new NullPointerException("names must not be null");
        }
        File file2 = file;
        for (String string : arrstring) {
            file2 = new File(file2, string);
        }
        return file2;
    }

    public static /* varargs */ File a(String ... arrstring) {
        if (arrstring == null) {
            throw new NullPointerException("names must not be null");
        }
        File file = null;
        for (String string : arrstring) {
            file = file == null ? new File(string) : new File(file, string);
        }
        return file;
    }

    public static String a() {
        return System.getProperty("java.io.tmpdir");
    }

    public static File b() {
        return new File(o.a());
    }

    public static String c() {
        return System.getProperty("user.home");
    }

    public static File d() {
        return new File(o.c());
    }

    public static FileInputStream a(File file) throws IOException {
        if (file.exists()) {
            if (file.isDirectory()) {
                throw new IOException("File '" + file + "' exists but is a directory");
            }
            if (!file.canRead()) {
                throw new IOException("File '" + file + "' cannot be read");
            }
        } else {
            throw new FileNotFoundException("File '" + file + "' does not exist");
        }
        return new FileInputStream(file);
    }

    public static FileOutputStream b(File file) throws IOException {
        return o.a(file, false);
    }

    public static FileOutputStream a(File file, boolean bl2) throws IOException {
        if (file.exists()) {
            if (file.isDirectory()) {
                throw new IOException("File '" + file + "' exists but is a directory");
            }
            if (!file.canWrite()) {
                throw new IOException("File '" + file + "' cannot be written to");
            }
        } else {
            File file2 = file.getParentFile();
            if (file2 != null && !file2.mkdirs() && !file2.isDirectory()) {
                throw new IOException("Directory '" + file2 + "' could not be created");
            }
        }
        return new FileOutputStream(file, bl2);
    }

    public static String a(BigInteger bigInteger) {
        String string = bigInteger.divide(l).compareTo(BigInteger.ZERO) > 0 ? String.valueOf(bigInteger.divide(l)) + " EB" : (bigInteger.divide(j).compareTo(BigInteger.ZERO) > 0 ? String.valueOf(bigInteger.divide(j)) + " PB" : (bigInteger.divide(h).compareTo(BigInteger.ZERO) > 0 ? String.valueOf(bigInteger.divide(h)) + " TB" : (bigInteger.divide(f).compareTo(BigInteger.ZERO) > 0 ? String.valueOf(bigInteger.divide(f)) + " GB" : (bigInteger.divide(d).compareTo(BigInteger.ZERO) > 0 ? String.valueOf(bigInteger.divide(d)) + " MB" : (bigInteger.divide(b).compareTo(BigInteger.ZERO) > 0 ? String.valueOf(bigInteger.divide(b)) + " KB" : String.valueOf(bigInteger) + " bytes")))));
        return string;
    }

    public static String a(long l2) {
        return o.a(BigInteger.valueOf(l2));
    }

    public static void c(File file) throws IOException {
        boolean bl2;
        if (!file.exists()) {
            FileOutputStream fileOutputStream = o.b(file);
            u.a(fileOutputStream);
        }
        if (!(bl2 = file.setLastModified(System.currentTimeMillis()))) {
            throw new IOException("Unable to set the last modification time for " + file);
        }
    }

    public static File[] a(Collection<File> collection) {
        return collection.toArray(new File[collection.size()]);
    }

    private static void a(Collection<File> collection, File file, n n2, boolean bl2) {
        File[] arrfile = file.listFiles(n2);
        if (arrfile != null) {
            for (File file2 : arrfile) {
                if (file2.isDirectory()) {
                    if (bl2) {
                        collection.add(file2);
                    }
                    o.a(collection, file2, n2, bl2);
                    continue;
                }
                collection.add(file2);
            }
        }
    }

    public static Collection<File> a(File file, n n2, n n3) {
        o.a(file, n2);
        n n4 = o.a(n2);
        n n5 = o.b(n3);
        LinkedList<File> linkedList = new LinkedList<File>();
        o.a(linkedList, file, l.b(new n[]{n4, n5}), false);
        return linkedList;
    }

    private static void a(File file, n n2) {
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("Parameter 'directory' is not a directory: " + file);
        }
        if (n2 == null) {
            throw new NullPointerException("Parameter 'fileFilter' is null");
        }
    }

    private static n a(n n2) {
        return l.a(new n[]{n2, l.a(h.b)});
    }

    private static n b(n n2) {
        return n2 == null ? j.b : l.a(new n[]{n2, h.b});
    }

    public static Collection<File> b(File file, n n2, n n3) {
        o.a(file, n2);
        n n4 = o.a(n2);
        n n5 = o.b(n3);
        LinkedList<File> linkedList = new LinkedList<File>();
        if (file.isDirectory()) {
            linkedList.add(file);
        }
        o.a(linkedList, file, l.b(new n[]{n4, n5}), true);
        return linkedList;
    }

    public static Iterator<File> c(File file, n n2, n n3) {
        return o.a(file, n2, n3).iterator();
    }

    public static Iterator<File> d(File file, n n2, n n3) {
        return o.b(file, n2, n3).iterator();
    }

    private static String[] b(String[] arrstring) {
        String[] arrstring2 = new String[arrstring.length];
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            arrstring2[i2] = "." + arrstring[i2];
        }
        return arrstring2;
    }

    public static Collection<File> a(File file, String[] arrstring, boolean bl2) {
        n n2;
        if (arrstring == null) {
            n2 = w.b;
        } else {
            String[] arrstring2 = o.b(arrstring);
            n2 = new v(arrstring2);
        }
        return o.a(file, n2, bl2 ? w.b : j.b);
    }

    public static Iterator<File> b(File file, String[] arrstring, boolean bl2) {
        return o.a(file, arrstring, bl2).iterator();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean a(File file, File file2) throws IOException {
        boolean bl2 = file.exists();
        if (bl2 != file2.exists()) {
            return false;
        }
        if (!bl2) {
            return true;
        }
        if (file.isDirectory() || file2.isDirectory()) {
            throw new IOException("Can't compare directories, only files");
        }
        if (file.length() != file2.length()) {
            return false;
        }
        if (file.getCanonicalFile().equals(file2.getCanonicalFile())) {
            return true;
        }
        FileInputStream fileInputStream = null;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            fileInputStream2 = new FileInputStream(file2);
            boolean bl3 = u.a((InputStream)fileInputStream, fileInputStream2);
            return bl3;
        }
        finally {
            u.a(fileInputStream);
            u.a(fileInputStream2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean a(File file, File file2, String string) throws IOException {
        boolean bl2 = file.exists();
        if (bl2 != file2.exists()) {
            return false;
        }
        if (!bl2) {
            return true;
        }
        if (file.isDirectory() || file2.isDirectory()) {
            throw new IOException("Can't compare directories, only files");
        }
        if (file.getCanonicalFile().equals(file2.getCanonicalFile())) {
            return true;
        }
        InputStreamReader inputStreamReader = null;
        InputStreamReader inputStreamReader2 = null;
        try {
            if (string == null) {
                inputStreamReader = new InputStreamReader((InputStream)new FileInputStream(file), Charset.defaultCharset());
                inputStreamReader2 = new InputStreamReader((InputStream)new FileInputStream(file2), Charset.defaultCharset());
            } else {
                inputStreamReader = new InputStreamReader((InputStream)new FileInputStream(file), string);
                inputStreamReader2 = new InputStreamReader((InputStream)new FileInputStream(file2), string);
            }
            boolean bl3 = u.b((Reader)inputStreamReader, inputStreamReader2);
            return bl3;
        }
        finally {
            u.a(inputStreamReader);
            u.a(inputStreamReader2);
        }
    }

    public static File a(URL uRL) {
        if (uRL == null || !"file".equalsIgnoreCase(uRL.getProtocol())) {
            return null;
        }
        String string = uRL.getFile().replace('/', File.separatorChar);
        string = o.a(string);
        return new File(string);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static String a(String string) {
        String string2 = string;
        if (string != null && string.indexOf(37) >= 0) {
            int n2 = string.length();
            StringBuilder stringBuilder = new StringBuilder();
            ByteBuffer byteBuffer = ByteBuffer.allocate(n2);
            int n3 = 0;
            while (n3 < n2) {
                if (string.charAt(n3) == '%') {
                    try {
                        do {
                            byte by2 = (byte)Integer.parseInt(string.substring(n3 + 1, n3 + 3), 16);
                            byteBuffer.put(by2);
                        } while ((n3 += 3) < n2 && string.charAt(n3) == '%');
                        continue;
                    }
                    catch (RuntimeException var6_7) {}
                    finally {
                        if (byteBuffer.position() > 0) {
                            byteBuffer.flip();
                            stringBuilder.append(b.f.decode(byteBuffer).toString());
                            byteBuffer.clear();
                        }
                        continue;
                    }
                }
                stringBuilder.append(string.charAt(n3++));
            }
            string2 = stringBuilder.toString();
        }
        return string2;
    }

    public static File[] a(URL[] arruRL) {
        if (arruRL == null || arruRL.length == 0) {
            return o;
        }
        File[] arrfile = new File[arruRL.length];
        for (int i2 = 0; i2 < arruRL.length; ++i2) {
            URL uRL = arruRL[i2];
            if (uRL == null) continue;
            if (!uRL.getProtocol().equals("file")) {
                throw new IllegalArgumentException("URL could not be converted to a File: " + uRL);
            }
            arrfile[i2] = o.a(uRL);
        }
        return arrfile;
    }

    public static URL[] a(File[] arrfile) throws IOException {
        URL[] arruRL = new URL[arrfile.length];
        for (int i2 = 0; i2 < arruRL.length; ++i2) {
            arruRL[i2] = arrfile[i2].toURI().toURL();
        }
        return arruRL;
    }

    public static void b(File file, File file2) throws IOException {
        o.a(file, file2, true);
    }

    public static void a(File file, File file2, boolean bl2) throws IOException {
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (file2.exists() && !file2.isDirectory()) {
            throw new IllegalArgumentException("Destination '" + file2 + "' is not a directory");
        }
        File file3 = new File(file2, file.getName());
        o.b(file, file3, bl2);
    }

    public static void c(File file, File file2) throws IOException {
        o.b(file, file2, true);
    }

    public static void b(File file, File file2, boolean bl2) throws IOException {
        o.k(file, file2);
        if (file.isDirectory()) {
            throw new IOException("Source '" + file + "' exists but is a directory");
        }
        if (file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            throw new IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
        }
        File file3 = file2.getParentFile();
        if (file3 != null && !file3.mkdirs() && !file3.isDirectory()) {
            throw new IOException("Destination '" + file3 + "' directory cannot be created");
        }
        if (file2.exists() && !file2.canWrite()) {
            throw new IOException("Destination '" + file2 + "' exists but is read-only");
        }
        o.g(file, file2, bl2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static long a(File file, OutputStream outputStream) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long l2 = u.b((InputStream)fileInputStream, outputStream);
            return l2;
        }
        finally {
            fileInputStream.close();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void g(File file, File file2, boolean bl2) throws IOException {
        long l2;
        long l3;
        if (file2.exists() && file2.isDirectory()) {
            throw new IOException("Destination '" + file2 + "' exists but is a directory");
        }
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        FileChannel fileChannel = null;
        FileChannel fileChannel2 = null;
        try {
            long l4;
            long l5;
            fileInputStream = new FileInputStream(file);
            fileOutputStream = new FileOutputStream(file2);
            fileChannel = fileInputStream.getChannel();
            fileChannel2 = fileOutputStream.getChannel();
            l2 = fileChannel.size();
            long l6 = 0;
            for (l3 = 0; l3 < l2 && (l4 = fileChannel2.transferFrom(fileChannel, l3, l6 = (l5 = l2 - l3) > 31457280 ? 31457280 : l5)) != 0; l3 += l4) {
            }
        }
        catch (Throwable var17_12) {
            u.a(fileChannel2, fileOutputStream, fileChannel, fileInputStream);
            throw var17_12;
        }
        u.a(fileChannel2, fileOutputStream, fileChannel, fileInputStream);
        l2 = file.length();
        l3 = file2.length();
        if (l2 != l3) {
            throw new IOException("Failed to copy full contents from '" + file + "' to '" + file2 + "' Expected length: " + l2 + " Actual: " + l3);
        }
        if (bl2) {
            file2.setLastModified(file.lastModified());
        }
    }

    public static void d(File file, File file2) throws IOException {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file.exists() && !file.isDirectory()) {
            throw new IllegalArgumentException("Source '" + file2 + "' is not a directory");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (file2.exists() && !file2.isDirectory()) {
            throw new IllegalArgumentException("Destination '" + file2 + "' is not a directory");
        }
        o.c(file, new File(file2, file.getName()), true);
    }

    public static void e(File file, File file2) throws IOException {
        o.c(file, file2, true);
    }

    public static void c(File file, File file2, boolean bl2) throws IOException {
        o.a(file, file2, null, bl2);
    }

    public static void a(File file, File file2, FileFilter fileFilter) throws IOException {
        o.a(file, file2, fileFilter, true);
    }

    public static void a(File file, File file2, FileFilter fileFilter, boolean bl2) throws IOException {
        o.k(file, file2);
        if (!file.isDirectory()) {
            throw new IOException("Source '" + file + "' exists but is not a directory");
        }
        if (file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            throw new IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
        }
        ArrayList<String> arrayList = null;
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            File[] arrfile;
            File[] arrfile2 = arrfile = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
            if (arrfile != null && arrfile.length > 0) {
                arrayList = new ArrayList<String>(arrfile.length);
                for (File file3 : arrfile) {
                    File file4 = new File(file2, file3.getName());
                    arrayList.add(file4.getCanonicalPath());
                }
            }
        }
        o.a(file, file2, fileFilter, bl2, arrayList);
    }

    private static void k(File file, File file2) throws FileNotFoundException {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (!file.exists()) {
            throw new FileNotFoundException("Source '" + file + "' does not exist");
        }
    }

    private static void a(File file, File file2, FileFilter fileFilter, boolean bl2, List<String> list) throws IOException {
        File[] arrfile;
        File[] arrfile2 = arrfile = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        if (arrfile == null) {
            throw new IOException("Failed to list contents of " + file);
        }
        if (file2.exists()) {
            if (!file2.isDirectory()) {
                throw new IOException("Destination '" + file2 + "' exists but is not a directory");
            }
        } else if (!file2.mkdirs() && !file2.isDirectory()) {
            throw new IOException("Destination '" + file2 + "' directory cannot be created");
        }
        if (!file2.canWrite()) {
            throw new IOException("Destination '" + file2 + "' cannot be written to");
        }
        for (File file3 : arrfile) {
            File file4 = new File(file2, file3.getName());
            if (list != null && list.contains(file3.getCanonicalPath())) continue;
            if (file3.isDirectory()) {
                o.a(file3, file4, fileFilter, bl2, list);
                continue;
            }
            o.g(file3, file4, bl2);
        }
        if (bl2) {
            file2.setLastModified(file.lastModified());
        }
    }

    public static void a(URL uRL, File file) throws IOException {
        o.a(uRL.openStream(), file);
    }

    public static void a(URL uRL, File file, int n2, int n3) throws IOException {
        URLConnection uRLConnection = uRL.openConnection();
        uRLConnection.setConnectTimeout(n2);
        uRLConnection.setReadTimeout(n3);
        o.a(uRLConnection.getInputStream(), file);
    }

    public static void a(InputStream inputStream, File file) throws IOException {
        try {
            o.b(inputStream, file);
        }
        finally {
            u.a(inputStream);
        }
    }

    public static void b(InputStream inputStream, File file) throws IOException {
        FileOutputStream fileOutputStream = o.b(file);
        try {
            u.a(inputStream, (OutputStream)fileOutputStream);
            fileOutputStream.close();
        }
        finally {
            u.a(fileOutputStream);
        }
    }

    public static void d(File file) throws IOException {
        if (!file.exists()) {
            return;
        }
        if (!o.t(file)) {
            o.f(file);
        }
        if (!file.delete()) {
            String string = "Unable to delete directory " + file + ".";
            throw new IOException(string);
        }
    }

    public static boolean e(File file) {
        if (file == null) {
            return false;
        }
        try {
            if (file.isDirectory()) {
                o.f(file);
            }
        }
        catch (Exception var1_1) {
            // empty catch block
        }
        try {
            return file.delete();
        }
        catch (Exception var1_2) {
            return false;
        }
    }

    public static boolean f(File file, File file2) throws IOException {
        if (file == null) {
            throw new IllegalArgumentException("Directory must not be null");
        }
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("Not a directory: " + file);
        }
        if (file2 == null) {
            return false;
        }
        if (!file.exists() || !file2.exists()) {
            return false;
        }
        String string = file.getCanonicalPath();
        String string2 = file2.getCanonicalPath();
        return q.b(string, string2);
    }

    public static void f(File file) throws IOException {
        File[] arrfile = o.u(file);
        IOException iOException = null;
        for (File file2 : arrfile) {
            try {
                o.k(file2);
                continue;
            }
            catch (IOException var7_7) {
                iOException = var7_7;
            }
        }
        if (null != iOException) {
            throw iOException;
        }
    }

    private static File[] u(File file) throws IOException {
        if (!file.exists()) {
            String string = file + " does not exist";
            throw new IllegalArgumentException(string);
        }
        if (!file.isDirectory()) {
            String string = file + " is not a directory";
            throw new IllegalArgumentException(string);
        }
        File[] arrfile = file.listFiles();
        if (arrfile == null) {
            throw new IOException("Failed to list contents of " + file);
        }
        return arrfile;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static boolean a(File file, int n2) {
        long l2 = System.currentTimeMillis() + (long)n2 * 1000;
        boolean bl2 = false;
        try {
            while (!file.exists()) {
                long l3 = l2 - System.currentTimeMillis();
                if (l3 < 0) {
                    boolean bl3 = false;
                    return bl3;
                }
                try {
                    Thread.sleep(Math.min(100, l3));
                    continue;
                }
                catch (InterruptedException var7_5) {
                    bl2 = true;
                    continue;
                }
            }
            return true;
            catch (Exception exception) {
                return true;
            }
        }
        finally {
            if (bl2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String a(File file, Charset charset) throws IOException {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = o.a(file);
            String string = u.b((InputStream)fileInputStream, b.a(charset));
            return string;
        }
        finally {
            u.a(fileInputStream);
        }
    }

    public static String a(File file, String string) throws IOException {
        return o.a(file, b.a(string));
    }

    public static String g(File file) throws IOException {
        return o.a(file, Charset.defaultCharset());
    }

    public static byte[] h(File file) throws IOException {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = o.a(file);
            byte[] arrby = u.d(fileInputStream);
            return arrby;
        }
        finally {
            u.a(fileInputStream);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static List<String> b(File file, Charset charset) throws IOException {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = o.a(file);
            List<String> list = u.c((InputStream)fileInputStream, b.a(charset));
            return list;
        }
        finally {
            u.a(fileInputStream);
        }
    }

    public static List<String> b(File file, String string) throws IOException {
        return o.b(file, b.a(string));
    }

    public static List<String> i(File file) throws IOException {
        return o.b(file, Charset.defaultCharset());
    }

    public static com.growingio.e.a.a.a.w c(File file, String string) throws IOException {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = o.a(file);
            return u.d((InputStream)fileInputStream, string);
        }
        catch (IOException var3_3) {
            u.a(fileInputStream);
            throw var3_3;
        }
        catch (RuntimeException var3_4) {
            u.a(fileInputStream);
            throw var3_4;
        }
    }

    public static com.growingio.e.a.a.a.w j(File file) throws IOException {
        return o.c(file, null);
    }

    public static void a(File file, String string, Charset charset) throws IOException {
        o.a(file, string, charset, false);
    }

    public static void a(File file, String string, String string2) throws IOException {
        o.a(file, string, string2, false);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(File file, String string, Charset charset, boolean bl2) throws IOException {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = o.a(file, bl2);
            u.a(string, (OutputStream)fileOutputStream, charset);
            fileOutputStream.close();
        }
        finally {
            u.a(fileOutputStream);
        }
    }

    public static void a(File file, String string, String string2, boolean bl2) throws IOException {
        o.a(file, string, b.a(string2), bl2);
    }

    public static void d(File file, String string) throws IOException {
        o.a(file, string, Charset.defaultCharset(), false);
    }

    public static void a(File file, String string, boolean bl2) throws IOException {
        o.a(file, string, Charset.defaultCharset(), bl2);
    }

    public static void a(File file, CharSequence charSequence) throws IOException {
        o.a(file, charSequence, Charset.defaultCharset(), false);
    }

    public static void a(File file, CharSequence charSequence, boolean bl2) throws IOException {
        o.a(file, charSequence, Charset.defaultCharset(), bl2);
    }

    public static void a(File file, CharSequence charSequence, Charset charset) throws IOException {
        o.a(file, charSequence, charset, false);
    }

    public static void a(File file, CharSequence charSequence, String string) throws IOException {
        o.a(file, charSequence, string, false);
    }

    public static void a(File file, CharSequence charSequence, Charset charset, boolean bl2) throws IOException {
        String string = charSequence == null ? null : charSequence.toString();
        o.a(file, string, charset, bl2);
    }

    public static void a(File file, CharSequence charSequence, String string, boolean bl2) throws IOException {
        o.a(file, charSequence, b.a(string), bl2);
    }

    public static void a(File file, byte[] arrby) throws IOException {
        o.a(file, arrby, false);
    }

    public static void a(File file, byte[] arrby, boolean bl2) throws IOException {
        o.a(file, arrby, 0, arrby.length, bl2);
    }

    public static void a(File file, byte[] arrby, int n2, int n3) throws IOException {
        o.a(file, arrby, n2, n3, false);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(File file, byte[] arrby, int n2, int n3, boolean bl2) throws IOException {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = o.a(file, bl2);
            fileOutputStream.write(arrby, n2, n3);
            fileOutputStream.close();
        }
        finally {
            u.a(fileOutputStream);
        }
    }

    public static void a(File file, String string, Collection<?> collection) throws IOException {
        o.a(file, string, collection, null, false);
    }

    public static void a(File file, String string, Collection<?> collection, boolean bl2) throws IOException {
        o.a(file, string, collection, null, bl2);
    }

    public static void a(File file, Collection<?> collection) throws IOException {
        o.a(file, null, collection, null, false);
    }

    public static void a(File file, Collection<?> collection, boolean bl2) throws IOException {
        o.a(file, null, collection, null, bl2);
    }

    public static void a(File file, String string, Collection<?> collection, String string2) throws IOException {
        o.a(file, string, collection, string2, false);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(File file, String string, Collection<?> collection, String string2, boolean bl2) throws IOException {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = o.a(file, bl2);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            u.a(collection, string2, (OutputStream)bufferedOutputStream, string);
            bufferedOutputStream.flush();
            fileOutputStream.close();
        }
        finally {
            u.a(fileOutputStream);
        }
    }

    public static void a(File file, Collection<?> collection, String string) throws IOException {
        o.a(file, null, collection, string, false);
    }

    public static void a(File file, Collection<?> collection, String string, boolean bl2) throws IOException {
        o.a(file, null, collection, string, bl2);
    }

    public static void k(File file) throws IOException {
        if (file.isDirectory()) {
            o.d(file);
        } else {
            boolean bl2 = file.exists();
            if (!file.delete()) {
                if (!bl2) {
                    throw new FileNotFoundException("File does not exist: " + file);
                }
                String string = "Unable to delete file: " + file;
                throw new IOException(string);
            }
        }
    }

    public static void l(File file) throws IOException {
        if (file.isDirectory()) {
            o.v(file);
        } else {
            file.deleteOnExit();
        }
    }

    private static void v(File file) throws IOException {
        if (!file.exists()) {
            return;
        }
        file.deleteOnExit();
        if (!o.t(file)) {
            o.w(file);
        }
    }

    private static void w(File file) throws IOException {
        File[] arrfile = o.u(file);
        IOException iOException = null;
        for (File file2 : arrfile) {
            try {
                o.l(file2);
                continue;
            }
            catch (IOException var7_7) {
                iOException = var7_7;
            }
        }
        if (null != iOException) {
            throw iOException;
        }
    }

    public static void m(File file) throws IOException {
        if (file.exists()) {
            if (!file.isDirectory()) {
                String string = "File " + file + " exists and is " + "not a directory. Unable to create directory.";
                throw new IOException(string);
            }
        } else if (!file.mkdirs() && !file.isDirectory()) {
            String string = "Unable to create directory " + file;
            throw new IOException(string);
        }
    }

    public static void n(File file) throws IOException {
        File file2 = file.getParentFile();
        if (file2 == null) {
            return;
        }
        o.m(file2);
    }

    public static long o(File file) {
        if (!file.exists()) {
            String string = file + " does not exist";
            throw new IllegalArgumentException(string);
        }
        if (file.isDirectory()) {
            return o.x(file);
        }
        return file.length();
    }

    public static BigInteger p(File file) {
        if (!file.exists()) {
            String string = file + " does not exist";
            throw new IllegalArgumentException(string);
        }
        if (file.isDirectory()) {
            return o.z(file);
        }
        return BigInteger.valueOf(file.length());
    }

    public static long q(File file) {
        o.B(file);
        return o.x(file);
    }

    private static long x(File file) {
        File[] arrfile = file.listFiles();
        if (arrfile == null) {
            return 0;
        }
        long l2 = 0;
        for (File file2 : arrfile) {
            try {
                if (o.t(file2) || (l2 += o.y(file2)) >= 0) continue;
                break;
            }
            catch (IOException var8_7) {
                // empty catch block
            }
        }
        return l2;
    }

    private static long y(File file) {
        if (file.isDirectory()) {
            return o.x(file);
        }
        return file.length();
    }

    public static BigInteger r(File file) {
        o.B(file);
        return o.z(file);
    }

    private static BigInteger z(File file) {
        File[] arrfile = file.listFiles();
        if (arrfile == null) {
            return BigInteger.ZERO;
        }
        BigInteger bigInteger = BigInteger.ZERO;
        for (File file2 : arrfile) {
            try {
                if (o.t(file2)) continue;
                bigInteger = bigInteger.add(o.A(file2));
                continue;
            }
            catch (IOException var7_7) {
                // empty catch block
            }
        }
        return bigInteger;
    }

    private static BigInteger A(File file) {
        if (file.isDirectory()) {
            return o.z(file);
        }
        return BigInteger.valueOf(file.length());
    }

    private static void B(File file) {
        if (!file.exists()) {
            throw new IllegalArgumentException(file + " does not exist");
        }
        if (!file.isDirectory()) {
            throw new IllegalArgumentException(file + " is not a directory");
        }
    }

    public static boolean g(File file, File file2) {
        if (file2 == null) {
            throw new IllegalArgumentException("No specified reference file");
        }
        if (!file2.exists()) {
            throw new IllegalArgumentException("The reference file '" + file2 + "' doesn't exist");
        }
        return o.a(file, file2.lastModified());
    }

    public static boolean a(File file, Date date) {
        if (date == null) {
            throw new IllegalArgumentException("No specified date");
        }
        return o.a(file, date.getTime());
    }

    public static boolean a(File file, long l2) {
        if (file == null) {
            throw new IllegalArgumentException("No specified file");
        }
        if (!file.exists()) {
            return false;
        }
        return file.lastModified() > l2;
    }

    public static boolean h(File file, File file2) {
        if (file2 == null) {
            throw new IllegalArgumentException("No specified reference file");
        }
        if (!file2.exists()) {
            throw new IllegalArgumentException("The reference file '" + file2 + "' doesn't exist");
        }
        return o.b(file, file2.lastModified());
    }

    public static boolean b(File file, Date date) {
        if (date == null) {
            throw new IllegalArgumentException("No specified date");
        }
        return o.b(file, date.getTime());
    }

    public static boolean b(File file, long l2) {
        if (file == null) {
            throw new IllegalArgumentException("No specified file");
        }
        if (!file.exists()) {
            return false;
        }
        return file.lastModified() < l2;
    }

    public static long s(File file) throws IOException {
        CRC32 cRC32 = new CRC32();
        o.a(file, cRC32);
        return cRC32.getValue();
    }

    public static Checksum a(File file, Checksum checksum) throws IOException {
        if (file.isDirectory()) {
            throw new IllegalArgumentException("Checksums can't be computed on directories");
        }
        CheckedInputStream checkedInputStream = null;
        try {
            checkedInputStream = new CheckedInputStream(new FileInputStream(file), checksum);
            u.a((InputStream)checkedInputStream, (OutputStream)new com.growingio.e.a.a.a.e.m());
        }
        finally {
            u.a(checkedInputStream);
        }
        return checksum;
    }

    public static void i(File file, File file2) throws IOException {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (!file.exists()) {
            throw new FileNotFoundException("Source '" + file + "' does not exist");
        }
        if (!file.isDirectory()) {
            throw new IOException("Source '" + file + "' is not a directory");
        }
        if (file2.exists()) {
            throw new m("Destination '" + file2 + "' already exists");
        }
        boolean bl2 = file.renameTo(file2);
        if (!bl2) {
            if (file2.getCanonicalPath().startsWith(file.getCanonicalPath() + File.separator)) {
                throw new IOException("Cannot move directory: " + file + " to a subdirectory of itself: " + file2);
            }
            o.e(file, file2);
            o.d(file);
            if (file.exists()) {
                throw new IOException("Failed to delete original directory '" + file + "' after copy to '" + file2 + "'");
            }
        }
    }

    public static void d(File file, File file2, boolean bl2) throws IOException {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination directory must not be null");
        }
        if (!file2.exists() && bl2) {
            file2.mkdirs();
        }
        if (!file2.exists()) {
            throw new FileNotFoundException("Destination directory '" + file2 + "' does not exist [createDestDir=" + bl2 + "]");
        }
        if (!file2.isDirectory()) {
            throw new IOException("Destination '" + file2 + "' is not a directory");
        }
        o.i(file, new File(file2, file.getName()));
    }

    public static void j(File file, File file2) throws IOException {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (!file.exists()) {
            throw new FileNotFoundException("Source '" + file + "' does not exist");
        }
        if (file.isDirectory()) {
            throw new IOException("Source '" + file + "' is a directory");
        }
        if (file2.exists()) {
            throw new m("Destination '" + file2 + "' already exists");
        }
        if (file2.isDirectory()) {
            throw new IOException("Destination '" + file2 + "' is a directory");
        }
        boolean bl2 = file.renameTo(file2);
        if (!bl2) {
            o.c(file, file2);
            if (!file.delete()) {
                o.e(file2);
                throw new IOException("Failed to delete original file '" + file + "' after copy to '" + file2 + "'");
            }
        }
    }

    public static void e(File file, File file2, boolean bl2) throws IOException {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination directory must not be null");
        }
        if (!file2.exists() && bl2) {
            file2.mkdirs();
        }
        if (!file2.exists()) {
            throw new FileNotFoundException("Destination directory '" + file2 + "' does not exist [createDestDir=" + bl2 + "]");
        }
        if (!file2.isDirectory()) {
            throw new IOException("Destination '" + file2 + "' is not a directory");
        }
        o.j(file, new File(file2, file.getName()));
    }

    public static void f(File file, File file2, boolean bl2) throws IOException {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (!file.exists()) {
            throw new FileNotFoundException("Source '" + file + "' does not exist");
        }
        if (file.isDirectory()) {
            o.d(file, file2, bl2);
        } else {
            o.e(file, file2, bl2);
        }
    }

    public static boolean t(File file) throws IOException {
        if (com.growingio.e.a.a.a.v.a()) {
            return com.growingio.e.a.a.a.v.a(file);
        }
        if (file == null) {
            throw new NullPointerException("File must not be null");
        }
        if (q.a()) {
            return false;
        }
        File file2 = null;
        if (file.getParent() == null) {
            file2 = file;
        } else {
            File file3 = file.getParentFile().getCanonicalFile();
            file2 = new File(file3, file.getName());
        }
        if (file2.getCanonicalFile().equals(file2.getAbsoluteFile())) {
            return o.C(file);
        }
        return true;
    }

    private static boolean C(File file) throws IOException {
        if (file.exists()) {
            return false;
        }
        File file2 = file.getCanonicalFile();
        File file3 = file2.getParentFile();
        if (file3 == null || !file3.exists()) {
            return false;
        }
        File[] arrfile = file3.listFiles(new p(file2));
        return arrfile != null && arrfile.length > 0;
    }
}

