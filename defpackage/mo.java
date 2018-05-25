package p000;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class mo {
    public static nn ae = null;
    public static final int af = 1048576000;
    public static int ag = 0;
    public static String ai = null;
    public static final int aj = 24;
    public static nn am = null;
    public static nn aq = null;
    public static final String ar = "main_file_cache.idx255";
    public static final String as = "main_file_cache.idx";

    mo() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ba.ad(e, "mo.<init>(" + ')');
        }
    }

    public static nw ag(String str, String str2, boolean z) {
        File file = new File(oa.aa, "preferences" + str + ".dat");
        if (file.exists()) {
            try {
                return new nw(file, cw.an, 10000);
            } catch (IOException e) {
            }
        }
        String str3 = "";
        if (-1064806823 * at.ab == 33) {
            str3 = "_rc";
        } else if (-747361258 * at.ab == -912729223) {
            str3 = "_wip";
        }
        File file2 = new File(jc.az, "jagex_" + str2 + "_preferences" + str + str3 + ".dat");
        if (!z && file2.exists()) {
            try {
                return new nw(file2, cw.an, 10000);
            } catch (IOException e2) {
            }
        }
        try {
            return new nw(file, cw.an, 10000);
        } catch (IOException e3) {
            throw new RuntimeException();
        }
    }

    public static nw ay(String str, String str2, boolean z) {
        File file = new File(oa.aa, "preferences" + str + ".dat");
        if (file.exists()) {
            try {
                return new nw(file, cw.an, 10000);
            } catch (IOException e) {
            }
        }
        String str3 = "";
        if (at.ab * -1064806823 == 33) {
            str3 = "_rc";
        } else if (at.ab * -1064806823 == 34) {
            str3 = "_wip";
        }
        File file2 = new File(jc.az, "jagex_" + str2 + "_preferences" + str + str3 + ".dat");
        if (!z && file2.exists()) {
            try {
                return new nw(file2, cw.an, 10000);
            } catch (IOException e2) {
            }
        }
        try {
            return new nw(file, cw.an, 10000);
        } catch (IOException e3) {
            throw new RuntimeException();
        }
    }

    public static void ae(File file) {
        try {
            if (file.exists()) {
                ae = new nn(new nw(file, cw.an, 25), 24, 0);
                return;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, cw.an);
            int read = randomAccessFile.read();
            randomAccessFile.seek(0);
            randomAccessFile.write(read);
            randomAccessFile.seek(0);
            randomAccessFile.close();
            ae = new nn(new nw(file, cw.an, 25), 24, 0);
        } catch (IOException e) {
        }
    }

    public static void aj(File file) {
        try {
            if (file.exists()) {
                ae = new nn(new nw(file, cw.an, 25), 24, 0);
                return;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, cw.an);
            int read = randomAccessFile.read();
            randomAccessFile.seek(0);
            randomAccessFile.write(read);
            randomAccessFile.seek(0);
            randomAccessFile.close();
            ae = new nn(new nw(file, cw.an, 25), 24, 0);
        } catch (IOException e) {
        }
    }

    public static void ar(File file) {
        try {
            if (file.exists()) {
                ae = new nn(new nw(file, cw.an, 25), 24, 0);
                return;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, cw.an);
            int read = randomAccessFile.read();
            randomAccessFile.seek(0);
            randomAccessFile.write(read);
            randomAccessFile.seek(0);
            randomAccessFile.close();
            ae = new nn(new nw(file, cw.an, 25), 24, 0);
        } catch (IOException e) {
        }
    }

    public static void as(File file) {
        try {
            if (file.exists()) {
                ae = new nn(new nw(file, cw.an, 25), 24, 0);
                return;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, cw.an);
            int read = randomAccessFile.read();
            randomAccessFile.seek(0);
            randomAccessFile.write(read);
            randomAccessFile.seek(0);
            randomAccessFile.close();
            ae = new nn(new nw(file, cw.an, 25), 24, 0);
        } catch (IOException e) {
        }
    }

    public static byte[] am() {
        int i = 0;
        byte[] bArr = new byte[24];
        try {
            ae.ad(0);
            ae.aa(bArr, (byte) 14);
            int i2 = 0;
            while (i2 < 24 && bArr[i2] == (byte) 0) {
                i2++;
            }
            if (i2 >= 24) {
                throw new IOException();
            }
        } catch (Exception e) {
            while (i < 24) {
                bArr[i] = (byte) -1;
                i++;
            }
        }
        return bArr;
    }

    public static byte[] aq() {
        int i = 0;
        byte[] bArr = new byte[24];
        try {
            ae.ad(0);
            ae.aa(bArr, (byte) 14);
            int i2 = 0;
            while (i2 < 24 && bArr[i2] == (byte) 0) {
                i2++;
            }
            if (i2 >= 24) {
                throw new IOException();
            }
        } catch (Exception e) {
            while (i < 24) {
                bArr[i] = (byte) -1;
                i++;
            }
        }
        return bArr;
    }

    public static byte[] at() {
        int i = 0;
        byte[] bArr = new byte[24];
        try {
            ae.ad(0);
            ae.aa(bArr, (byte) 14);
            int i2 = 0;
            while (i2 < 24 && bArr[i2] == (byte) 0) {
                i2++;
            }
            if (i2 >= 24) {
                throw new IOException();
            }
        } catch (Exception e) {
            while (i < 24) {
                bArr[i] = (byte) -1;
                i++;
            }
        }
        return bArr;
    }

    public static void ab(ik ikVar, int i) {
        if (ae != null) {
            try {
                ae.ad(0);
                ae.as(ikVar.af, i, 24, 1437893668);
            } catch (Exception e) {
            }
        }
    }

    static final void ae(int i) {
        try {
            cz.aj(jv.gv, (byte) 4);
        } catch (Throwable e) {
            throw ba.ad(e, "mo.ae(" + ')');
        }
    }
}
