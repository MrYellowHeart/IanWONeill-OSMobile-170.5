package p000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

public class jz {
    static final int ad = 8;
    static final int af = 8;
    public static final int an = 64;

    jz() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ba.ad(e, "jz.<init>(" + ')');
        }
    }

    static String an(Throwable th, int i) throws IOException {
        try {
            String str;
            if (th instanceof mq) {
                mq mqVar = (mq) th;
                str = mqVar.ag + " | ";
                th = mqVar.ay;
            } else {
                str = "";
            }
            Writer stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            printWriter.close();
            BufferedReader bufferedReader = new BufferedReader(new StringReader(stringWriter.toString()));
            String readLine = bufferedReader.readLine();
            String str2 = str;
            while (true) {
                str = bufferedReader.readLine();
                if (str == null) {
                    return str2 + "| " + readLine;
                }
                int indexOf = str.indexOf(40);
                int indexOf2 = str.indexOf(41, indexOf + 1);
                if (indexOf >= 0 && indexOf2 >= 0) {
                    String substring = str.substring(indexOf + 1, indexOf2);
                    int indexOf3 = substring.indexOf(".java:");
                    if (indexOf3 >= 0) {
                        str2 = str2 + (substring.substring(0, indexOf3) + substring.substring(indexOf3 + 5)) + ' ';
                    } else {
                        str = str.substring(0, indexOf);
                    }
                }
                str = str.trim();
                str = str.substring(str.lastIndexOf(32) + 1);
                str2 = str2 + str.substring(str.lastIndexOf(9) + 1) + ' ';
            }
        } catch (Throwable e) {
            throw ba.ad(e, "jz.an(" + ')');
        }
    }
}
