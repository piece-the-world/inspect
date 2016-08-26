/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a;

import com.growingio.e.a.a.a.q;
import com.growingio.e.a.a.a.u;
import com.growingio.e.a.a.a.y;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;

public class n {
    private static final n a = new n();
    private static final int b = -1;
    private static final int c = 0;
    private static final int d = 1;
    private static final int e = 2;
    private static final int f = 3;
    private static final int g;
    private static final String h;

    public static long a(String string) throws IOException {
        return a.a(string, g, false, -1);
    }

    public static long b(String string) throws IOException {
        return n.a(string, -1);
    }

    public static long a(String string, long l2) throws IOException {
        return a.a(string, g, true, l2);
    }

    public static long a() throws IOException {
        return n.a(-1);
    }

    public static long a(long l2) throws IOException {
        return n.a(new File(".").getAbsolutePath(), l2);
    }

    long a(String string, int n2, boolean bl2, long l2) throws IOException {
        if (string == null) {
            throw new IllegalArgumentException("Path must not be null");
        }
        switch (n2) {
            case 1: {
                return bl2 ? this.b(string, l2) / 1024 : this.b(string, l2);
            }
            case 2: {
                return this.a(string, bl2, false, l2);
            }
            case 3: {
                return this.a(string, bl2, true, l2);
            }
            case 0: {
                throw new IllegalStateException("Unsupported operating system");
            }
        }
        throw new IllegalStateException("Exception caught when determining operating system");
    }

    long b(String string, long l2) throws IOException {
        if ((string = q.a(string, false)).length() > 0 && string.charAt(0) != '\"') {
            string = "\"" + string + "\"";
        }
        String[] arrstring = new String[]{"cmd.exe", "/C", "dir /a /-c " + string};
        List<String> list = this.a(arrstring, Integer.MAX_VALUE, l2);
        for (int i2 = list.size() - 1; i2 >= 0; --i2) {
            String string2 = list.get(i2);
            if (string2.length() <= 0) continue;
            return this.a(string2, string);
        }
        throw new IOException("Command line 'dir /-c' did not return any info for path '" + string + "'");
    }

    long a(String string, String string2) throws IOException {
        int n2;
        char c2;
        int n3 = 0;
        int n4 = 0;
        for (n2 = string.length() - 1; n2 >= 0; --n2) {
            c2 = string.charAt(n2);
            if (!Character.isDigit(c2)) continue;
            n4 = n2 + 1;
            break;
        }
        while (n2 >= 0) {
            c2 = string.charAt(n2);
            if (!Character.isDigit(c2) && c2 != ',' && c2 != '.') {
                n3 = n2 + 1;
                break;
            }
            --n2;
        }
        if (n2 < 0) {
            throw new IOException("Command line 'dir /-c' did not return valid info for path '" + string2 + "'");
        }
        StringBuilder stringBuilder = new StringBuilder(string.substring(n3, n4));
        for (int i2 = 0; i2 < stringBuilder.length(); ++i2) {
            if (stringBuilder.charAt(i2) != ',' && stringBuilder.charAt(i2) != '.') continue;
            stringBuilder.deleteCharAt(i2--);
        }
        return this.b(stringBuilder.toString(), string2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    long a(String string, boolean bl2, boolean bl3, long l2) throws IOException {
        String string2;
        String[] arrstring;
        if (string.isEmpty()) {
            throw new IllegalArgumentException("Path must not be empty");
        }
        String string3 = "-";
        if (bl2) {
            string3 = string3 + "k";
        }
        if (bl3) {
            string3 = string3 + "P";
        }
        if (string3.length() > 1) {
            String[] arrstring2 = new String[3];
            arrstring2[0] = h;
            arrstring2[1] = string3;
            arrstring = arrstring2;
            arrstring2[2] = string;
        } else {
            String[] arrstring3 = new String[2];
            arrstring3[0] = h;
            arrstring = arrstring3;
            arrstring3[1] = string;
        }
        String[] arrstring4 = arrstring;
        List<String> list = this.a(arrstring4, 3, l2);
        if (list.size() < 2) {
            throw new IOException("Command line '" + h + "' did not return info as expected " + "for path '" + string + "'- response was " + list);
        }
        String string4 = list.get(1);
        StringTokenizer stringTokenizer = new StringTokenizer(string4, " ");
        if (stringTokenizer.countTokens() < 4) {
            if (stringTokenizer.countTokens() != 1 || list.size() < 3) throw new IOException("Command line '" + h + "' did not return data as expected " + "for path '" + string + "'- check path is valid");
            string2 = list.get(2);
            stringTokenizer = new StringTokenizer(string2, " ");
        } else {
            stringTokenizer.nextToken();
        }
        stringTokenizer.nextToken();
        stringTokenizer.nextToken();
        string2 = stringTokenizer.nextToken();
        return this.b(string2, string);
    }

    long b(String string, String string2) throws IOException {
        try {
            long l2 = Long.parseLong(string);
            if (l2 < 0) {
                throw new IOException("Command line '" + h + "' did not find free space in response " + "for path '" + string2 + "'- check path is valid");
            }
            return l2;
        }
        catch (NumberFormatException var3_4) {
            throw new IOException("Command line '" + h + "' did not return numeric data as expected " + "for path '" + string2 + "'- check path is valid", var3_4);
        }
    }

    List<String> a(String[] arrstring, int n2, long l2) throws IOException {
        ArrayList<String> arrayList = new ArrayList<String>(20);
        Process process = null;
        InputStream inputStream = null;
        OutputStream outputStream = null;
        InputStream inputStream2 = null;
        BufferedReader bufferedReader = null;
        try {
            Thread thread = y.a(l2);
            process = this.a(arrstring);
            inputStream = process.getInputStream();
            outputStream = process.getOutputStream();
            inputStream2 = process.getErrorStream();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charset.defaultCharset()));
            String string = bufferedReader.readLine();
            while (string != null && arrayList.size() < n2) {
                string = string.toLowerCase(Locale.ENGLISH).trim();
                arrayList.add(string);
                string = bufferedReader.readLine();
            }
            process.waitFor();
            y.a(thread);
            if (process.exitValue() != 0) {
                throw new IOException("Command line returned OS error code '" + process.exitValue() + "' for command " + Arrays.asList(arrstring));
            }
            if (arrayList.isEmpty()) {
                throw new IOException("Command line did not return any info for command " + Arrays.asList(arrstring));
            }
            ArrayList<String> arrayList2 = arrayList;
            return arrayList2;
        }
        catch (InterruptedException var11_11) {
            throw new IOException("Command line threw an InterruptedException for command " + Arrays.asList(arrstring) + " timeout=" + l2, var11_11);
        }
        finally {
            u.a(inputStream);
            u.a(outputStream);
            u.a(inputStream2);
            u.a(bufferedReader);
            if (process != null) {
                process.destroy();
            }
        }
    }

    Process a(String[] arrstring) throws IOException {
        return Runtime.getRuntime().exec(arrstring);
    }

    static {
        int n2 = 0;
        String string = "df";
        try {
            String string2 = System.getProperty("os.name");
            if (string2 == null) {
                throw new IOException("os.name not found");
            }
            if ((string2 = string2.toLowerCase(Locale.ENGLISH)).contains("windows")) {
                n2 = 1;
            } else if (string2.contains("linux") || string2.contains("mpe/ix") || string2.contains("freebsd") || string2.contains("irix") || string2.contains("digital unix") || string2.contains("unix") || string2.contains("mac os x")) {
                n2 = 2;
            } else if (string2.contains("sun os") || string2.contains("sunos") || string2.contains("solaris")) {
                n2 = 3;
                string = "/usr/xpg4/bin/df";
            } else {
                n2 = string2.contains("hp-ux") || string2.contains("aix") ? 3 : 0;
            }
        }
        catch (Exception var2_3) {
            n2 = -1;
        }
        g = n2;
        h = string;
    }
}

