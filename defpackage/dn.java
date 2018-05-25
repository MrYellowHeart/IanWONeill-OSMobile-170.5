package p000;

public class dn {
    static boolean af = false;
    static final int ai = 585;
    static final int al = 1;
    static final int ay = 36;
    static int[] bc;
    static fx ma;

    dn() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ba.ad(e, "dn.<init>(" + ')');
        }
    }

    public static final int aa(double d, double d2, double d3) {
        double d4;
        double d5;
        if (d2 != 0.0d) {
            double d6;
            if (d3 < 0.5d) {
                d4 = (1.0d + d2) * d3;
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
            if (6.0d * d < 1.0d) {
                d5 = ((6.0d * (d4 - d3)) * d) + d3;
            } else if (2.0d * d < 1.0d) {
                d5 = d4;
            } else if (3.0d * d < 2.0d) {
                d5 = (((0.6666666666666666d - d) * (d4 - d3)) * 6.0d) + d3;
            } else {
                d5 = d3;
            }
            if (6.0d * d6 < 1.0d) {
                d4 = (((d4 - d3) * 6.0d) * d6) + d3;
                d3 = d5;
                d5 = d7;
            } else if (2.0d * d6 < 1.0d) {
                d3 = d5;
                d5 = d7;
            } else if (3.0d * d6 < 2.0d) {
                d4 = (((d4 - d3) * (0.6666666666666666d - d6)) * 6.0d) + d3;
                d3 = d5;
                d5 = d7;
            } else {
                d4 = d3;
                d3 = d5;
                d5 = d7;
            }
        } else {
            d4 = d3;
            d5 = d3;
        }
        return ((int) (d4 * 256.0d)) + ((((int) (256.0d * d3)) << 8) + (((int) (d5 * 256.0d)) << 16));
    }

    public static final int ad(double d, double d2, double d3) {
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
            d7 = 6.0d * d5 < 1.0d ? (d5 * (6.0d * (d4 - d3))) + d3 : 2.0d * d5 < 1.0d ? d4 : 3.0d * d5 < 2.0d ? (((0.6666666666666666d - d5) * (d4 - d3)) * 6.0d) + d3 : d3;
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

    public static final int ag(double d, double d2, double d3) {
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
            d7 = 6.0d * d5 < 1.0d ? (d5 * (6.0d * (d4 - d3))) + d3 : 2.0d * d5 < 1.0d ? d4 : 3.0d * d5 < 2.0d ? (((0.6666666666666666d - d5) * (d4 - d3)) * 6.0d) + d3 : d3;
            if (6.0d * d < 1.0d) {
                d5 = ((6.0d * (d4 - d3)) * d) + d3;
            } else if (2.0d * d < 1.0d) {
                d5 = d4;
            } else if (3.0d * d < 2.0d) {
                d5 = (((0.6666666666666666d - d) * (d4 - d3)) * 6.0d) + d3;
            } else {
                d5 = d3;
            }
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

    public static final int an(double d, double d2, double d3) {
        double d4;
        double d5;
        if (d2 != 0.0d) {
            double d6;
            if (d3 < 0.5d) {
                d4 = (1.0d + d2) * d3;
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
            d7 = 6.0d * d5 < 1.0d ? (d5 * (6.0d * (d4 - d3))) + d3 : 2.0d * d5 < 1.0d ? d4 : 3.0d * d5 < 2.0d ? (((0.6666666666666666d - d5) * (d4 - d3)) * 6.0d) + d3 : d3;
            if (6.0d * d < 1.0d) {
                d5 = ((6.0d * (d4 - d3)) * d) + d3;
            } else if (2.0d * d < 1.0d) {
                d5 = d4;
            } else if (3.0d * d < 2.0d) {
                d5 = (((0.6666666666666666d - d) * (d4 - d3)) * 6.0d) + d3;
            } else {
                d5 = d3;
            }
            if (6.0d * d6 < 1.0d) {
                d4 = (((d4 - d3) * 6.0d) * d6) + d3;
                d3 = d5;
                d5 = d7;
            } else if (2.0d * d6 < 1.0d) {
                d3 = d5;
                d5 = d7;
            } else if (3.0d * d6 < 2.0d) {
                d4 = (((d4 - d3) * (0.6666666666666666d - d6)) * 6.0d) + d3;
                d3 = d5;
                d5 = d7;
            } else {
                d4 = d3;
                d3 = d5;
                d5 = d7;
            }
        } else {
            d4 = d3;
            d5 = d3;
        }
        return ((int) (d4 * 256.0d)) + ((((int) (256.0d * d3)) << 8) + (((int) (d5 * 256.0d)) << 16));
    }

    static final void an(int i, int i2, int i3, int i4, int i5) {
        int i6 = i2;
        while (i6 <= i4 + i2) {
            int i7 = i;
            while (i7 <= i + i3) {
                if (i7 >= 0 && i7 < li.cu && i6 >= 0 && i6 < li.cu) {
                    try {
                        ch.ar[0][i7][i6] = Byte.MAX_VALUE;
                        if (i7 == i && i7 > 0) {
                            gu.af[0][i7][i6] = gu.af[0][i7 - 1][i6];
                        }
                        if (i7 == i3 + i && i7 < 103) {
                            gu.af[0][i7][i6] = gu.af[0][i7 + 1][i6];
                        }
                        if (i6 == i2 && i6 > 0) {
                            gu.af[0][i7][i6] = gu.af[0][i7][i6 - 1];
                        }
                        if (i2 + i4 == i6 && i6 < 103) {
                            gu.af[0][i7][i6] = gu.af[0][i7][i6 + 1];
                        }
                    } catch (Throwable e) {
                        throw ba.ad(e, "dn.an(" + ')');
                    }
                }
                i7++;
            }
            i6++;
        }
    }
}
