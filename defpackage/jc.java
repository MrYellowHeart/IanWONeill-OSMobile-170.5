package p000;

import java.io.File;

public class jc {
    static final int ab = 2;
    public static final boolean[] ad = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
    public static final int af = 25;
    static int am;
    public static int[] an = new int[99];
    public static File az;
    static short[] pf;

    static {
        int i = 0;
        int i2 = 0;
        while (i < 99) {
            int i3 = i + 1;
            i2 += (int) ((Math.pow(2.0d, ((double) i3) / 7.0d) * 300.0d) + ((double) i3));
            an[i] = i2 / 4;
            i++;
        }
    }

    jc() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ba.ad(e, "jc.<init>(" + ')');
        }
    }
}
