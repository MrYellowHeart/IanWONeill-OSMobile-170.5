package p000;

public class jr {
    public static final int aa = 31;
    public static final int ad = 15;
    public static final int ae = 57;
    public static final int af = 2;
    public static final int ag = 32;
    public static final int an = 29;
    public static final int ar = 55;
    public static final int ay = 37;
    static final int cd = 512;
    public static final int cx = 101;

    jr() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ba.ad(e, "jr.<init>(" + ')');
        }
    }

    static void af(int i) {
        try {
            ok.aj = new int[2000];
            int i2 = 0;
            int i3 = 240;
            while (i2 < 16) {
                ok.aj[i2] = ca.af((double) (((float) i3) / 360.0f), 0.9998999834060669d, (double) (0.075f + ((((float) i2) * 0.425f) / 16.0f)));
                i2++;
                i3 -= 12;
            }
            i3 = 48;
            while (i2 < ok.aj.length) {
                int i4 = i2 * 2;
                int af = ca.af((double) (((float) i3) / 360.0f), 0.9998999834060669d, 0.5d);
                int i5 = i2;
                while (i5 < i4 && i5 < ok.aj.length) {
                    ok.aj[i5] = af;
                    i5++;
                }
                i3 -= 8;
                i2 = i5;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "jr.af(" + ')');
        }
    }
}
