package p000;

import java.io.IOException;

public class in {
    static long ad = 0;
    static long af = 0;
    static final int am = 3500;
    static final int aq = 50;

    in() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ba.ad(e, "in.<init>(" + ')');
        }
    }

    public static byte[] an(short s) {
        int i = 0;
        try {
            byte[] bArr = new byte[24];
            try {
                mo.ae.ad(0);
                mo.ae.aa(bArr, (byte) 14);
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
        } catch (Throwable e2) {
            throw ba.ad(e2, "in.an(" + ')');
        }
    }
}
