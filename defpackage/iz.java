package p000;

public class iz {
    static kf af = null;
    static final int ba = 25;

    iz() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ba.ad(e, "iz.<init>(" + ')');
        }
    }

    public static int aa(int i, int i2) {
        int i3 = 1;
        while (i2 > 1) {
            if ((i2 & 1) != 0) {
                i3 *= i;
            }
            i *= i;
            i2 >>= 1;
        }
        if (i2 == 1) {
            return i3 * i;
        }
        return i3;
    }

    public static int ag(int i, int i2) {
        int i3 = 1;
        while (i2 > 1) {
            if ((i2 & 1) != 0) {
                i3 *= i;
            }
            i *= i;
            i2 >>= 1;
        }
        if (i2 == 1) {
            return i3 * i;
        }
        return i3;
    }

    public static int ay(int i, int i2) {
        int i3 = 1;
        while (i2 > 1) {
            if ((i2 & 1) != 0) {
                i3 *= i;
            }
            i *= i;
            i2 >>= 1;
        }
        if (i2 == 1) {
            return i3 * i;
        }
        return i3;
    }

    public static int ar(int i) {
        int i2;
        int i3 = 0;
        if (i < 0 || i >= ic.ad) {
            i2 = i >>> 16;
            i3 = 16;
        } else {
            i2 = i;
        }
        if (i2 >= 256) {
            i2 >>>= 8;
            i3 += 8;
        }
        if (i2 >= 16) {
            i2 >>>= 4;
            i3 += 4;
        }
        if (i2 >= 4) {
            i2 >>>= 2;
            i3 += 2;
        }
        if (i2 >= 1) {
            i2 >>>= 1;
            i3++;
        }
        return i3 + i2;
    }

    public static int as(int i) {
        int i2;
        int i3 = 0;
        if (i < 0 || i >= ic.ad) {
            i2 = i >>> 16;
            i3 = 16;
        } else {
            i2 = i;
        }
        if (i2 >= -503836615) {
            i2 >>>= 8;
            i3 += 8;
        }
        if (i2 >= 16) {
            i2 >>>= 4;
            i3 += 4;
        }
        if (i2 >= 4) {
            i2 >>>= 2;
            i3 += 2;
        }
        if (i2 >= 1) {
            i2 >>>= 1;
            i3++;
        }
        return i3 + i2;
    }

    public static int ae(int i, int i2) {
        int i3 = i >>> 31;
        return ((i3 + i) / i2) - i3;
    }

    public static int aj(int i, int i2) {
        int i3 = i >>> 31;
        return ((i3 + i) / i2) - i3;
    }

    public static int aq(int i, int i2) {
        int i3 = i >>> -1443531541;
        return ((i3 + i) / i2) - i3;
    }

    static final int de(int i, int i2, int i3, int i4) {
        int i5 = i >> 7;
        int i6 = i2 >> 7;
        if (i5 < 0 || i6 < 0 || i5 > 103 || i6 > 103) {
            return 0;
        }
        if (i3 < 3) {
            try {
                if (2 == (gu.ad[1][i5][i6] & 2)) {
                    i3++;
                }
            } catch (Throwable e) {
                throw ba.ad(e, "iz.de(" + ')');
            }
        }
        int i7 = i & 127;
        int i8 = i2 & 127;
        int i9 = (((128 - i7) * gu.af[i3][i5][i6]) + (gu.af[i3][i5 + 1][i6] * i7)) >> 7;
        return (((((gu.af[i3][i5][i6 + 1] * (128 - i7)) + (gu.af[i3][i5 + 1][i6 + 1] * i7)) >> 7) * i8) + ((128 - i8) * i9)) >> 7;
    }
}
