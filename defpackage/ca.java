package p000;

public class ca {
    public static final int af = 170;
    static final int ag = 16;
    public static final int lq = 503;

    ca() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ba.ad(e, "ca.<init>(" + ')');
        }
    }

    public static int af(int i, int i2, int i3) {
        int i4 = 1;
        while (i2 > 1) {
            if ((i2 & 1) != 0) {
                i4 *= i;
            }
            i *= i;
            i2 >>= 1;
        }
        if (i2 == 1) {
            return i4 * i;
        }
        return i4;
    }

    public static final int af(double d, double d2, double d3) {
        double d4;
        double d5;
        if (d2 != 0.0d) {
            double d6;
            if (d3 < 0.5d) {
                d4 = d3 * (1.0d + d2);
            } else {
                d4 = (d2 + d3) - (d2 * d3);
            }
            d3 = (2.0d * d3) - d4;
            d5 = 0.3333333333333333d + d;
            if (d5 > 1.0d) {
                d5 -= 1.0d;
            }
            double d7 = d - 0.3333333333333333d;
            if (d7 < 0.0d) {
                d6 = d7 + 1.0d;
            } else {
                d6 = d7;
            }
            if (6.0d * d5 < 1.0d) {
                d7 = (d5 * (6.0d * (d4 - d3))) + d3;
            } else if (2.0d * d5 < 1.0d) {
                d7 = d4;
            } else if (3.0d * d5 < 2.0d) {
                d7 = (((0.6666666666666666d - d5) * (d4 - d3)) * 6.0d) + d3;
            } else {
                d7 = d3;
            }
            d5 = 6.0d * d < 1.0d ? ((6.0d * (d4 - d3)) * d) + d3 : 2.0d * d < 1.0d ? d4 : 3.0d * d < 2.0d ? (((0.6666666666666666d - d) * (d4 - d3)) * 6.0d) + d3 : d3;
            if (6.0d * d6 < 1.0d) {
                d3 += ((d4 - d3) * 6.0d) * d6;
                d4 = d7;
            } else if (2.0d * d6 < 1.0d) {
                d3 = d4;
                d4 = d7;
            } else if (3.0d * d6 < 2.0d) {
                d3 += ((d4 - d3) * (0.6666666666666666d - d6)) * 6.0d;
                d4 = d7;
            } else {
                d4 = d7;
            }
        } else {
            d5 = d3;
            d4 = d3;
        }
        return ((((int) (d5 * 256.0d)) << 8) + (((int) (d4 * 256.0d)) << 16)) + ((int) (256.0d * d3));
    }
}
