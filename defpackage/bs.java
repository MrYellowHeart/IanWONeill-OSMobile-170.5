package p000;

public final class bs {
    static final int ac = 19136782;
    static final int ae = 512;
    public static final int ah = 34;
    int aa;
    int ad;
    int af;
    int ag;
    int aj;
    int an;
    public long ar;
    public cq as;
    public cq ay;

    bs() {
        try {
            this.ar = 0;
            this.aj = 0;
        } catch (Throwable e) {
            throw ba.ad(e, "bs.<init>(" + ')');
        }
    }

    public static final void bw(double d) {
        try {
            double random = d + ((Math.random() * 0.03d) - 0.015d);
            int i = 0;
            int i2 = 0;
            while (i2 < 512) {
                double d2 = (((double) (i2 >> 3)) / 64.0d) + 0.0078125d;
                double d3 = (((double) (i2 & 7)) / 8.0d) + 0.0625d;
                int i3 = 0;
                int i4 = i;
                while (i3 < mn.an) {
                    double d4;
                    double d5;
                    double d6 = ((double) i3) / 128.0d;
                    if (0.0d != d3) {
                        double d7;
                        double d8;
                        if (d6 < 0.5d) {
                            d4 = (1.0d + d3) * d6;
                        } else {
                            d4 = (d3 + d6) - (d6 * d3);
                        }
                        d5 = (d6 * 2.0d) - d4;
                        d6 = 0.3333333333333333d + d2;
                        if (d6 > 1.0d) {
                            d6 -= 1.0d;
                        }
                        double d9 = d2 - 0.3333333333333333d;
                        if (d9 < 0.0d) {
                            d7 = d9 + 1.0d;
                        } else {
                            d7 = d9;
                        }
                        if (6.0d * d6 < 1.0d) {
                            d8 = d5 + (d6 * (6.0d * (d4 - d5)));
                        } else if (2.0d * d6 < 1.0d) {
                            d8 = d4;
                        } else if (3.0d * d6 < 2.0d) {
                            d8 = d5 + (((0.6666666666666666d - d6) * (d4 - d5)) * 6.0d);
                        } else {
                            d8 = d5;
                        }
                        if (6.0d * d2 < 1.0d) {
                            d9 = d5 + (((d4 - d5) * 6.0d) * d2);
                        } else if (2.0d * d2 < 1.0d) {
                            d9 = d4;
                        } else if (3.0d * d2 < 2.0d) {
                            d9 = d5 + (6.0d * ((d4 - d5) * (0.6666666666666666d - d2)));
                        } else {
                            d9 = d5;
                        }
                        if (6.0d * d7 < 1.0d) {
                            d6 = ((6.0d * (d4 - d5)) * d7) + d5;
                            d4 = d9;
                            d5 = d8;
                        } else if (2.0d * d7 < 1.0d) {
                            d6 = d4;
                            d5 = d8;
                            d4 = d9;
                        } else if (3.0d * d7 < 2.0d) {
                            d6 = (6.0d * ((d4 - d5) * (0.6666666666666666d - d7))) + d5;
                            d4 = d9;
                            d5 = d8;
                        } else {
                            d6 = d5;
                            d4 = d9;
                            d5 = d8;
                        }
                    } else {
                        d4 = d6;
                        d5 = d6;
                    }
                    int bb = ao.bb(((int) (d6 * 256.0d)) + ((((int) (d4 * 256.0d)) << 8) + (((int) (d5 * 256.0d)) << 16)), random);
                    if (bb == 0) {
                        bb = 1;
                    }
                    i = i4 + 1;
                    bi.at[i4] = bb;
                    i3++;
                    i4 = i;
                }
                i2++;
                i = i4;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "bs.bw(" + ')');
        }
    }

    static boolean dv(ga gaVar, byte b) {
        try {
            if (client.ir * 1424263497 == 0) {
                return false;
            }
            if (gf.ho == gaVar) {
                return lq.dz(1905334525);
            }
            boolean z;
            if (((client.ir * 1424263497) & 4) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (((client.ir * 1424263497) & 1) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && gaVar.ad(1309371446)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z || (be.dt(-1998857572) && gaVar.ay((short) 20009))) {
                return true;
            }
            return false;
        } catch (Throwable e) {
            throw ba.ad(e, "bs.dv(" + ')');
        }
    }
}
