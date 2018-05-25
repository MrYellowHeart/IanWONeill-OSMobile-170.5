package p000;

public final class be {
    static int gs;
    int aa;
    int ad;
    int af;
    int ag;
    int an;
    int as;
    boolean ay;

    be(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        try {
            this.ay = true;
            this.af = -1613730901 * i;
            this.ad = 5710261 * i2;
            this.an = -1447981585 * i3;
            this.aa = -601296403 * i4;
            this.ag = -942060103 * i5;
            this.as = -162728129 * i6;
            this.ay = z;
        } catch (Throwable e) {
            throw ba.ad(e, "be.<init>(" + ')');
        }
    }

    static int af(int i, int i2, int i3) {
        try {
            ak af = ik.af(i, 2128791917);
            if (af == null) {
                return i2;
            }
            if (af.as * -308151409 >= 0) {
                return (af.as * -308151409) | -16777216;
            }
            if (af.ag * -945425647 >= 0) {
                return bi.at[cr.ad(bi.ab.aa(af.ag * -945425647, 1577195485), 96, 1641792905)] | -16777216;
            } else if (-345116671 * af.aa == 16711935) {
                return i2;
            } else {
                int i4 = -828438867 * af.ar;
                int i5 = af.aj * 789156385;
                int i6 = af.ae * -1794633891;
                if (i6 > 179) {
                    i5 /= 2;
                }
                if (i6 > 192) {
                    i5 /= 2;
                }
                if (i6 > 217) {
                    i5 /= 2;
                }
                if (i6 > 243) {
                    i5 /= 2;
                }
                return bi.at[cr.ad((((i5 / 32) << 7) + ((i4 / 4) << 10)) + (i6 / 2), 96, 1641792905)] | -16777216;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "be.af(" + ')');
        }
    }

    static final void ai(int i, int i2) {
        try {
            int i3;
            int i4;
            gr.bx += 1146258560 * i;
            if (gr.bx * -343770823 > gr.bh.length) {
                gr.bx -= 176727305 * gr.bh.length;
                ac.aw(bo.ay[(int) (Math.random() * 12.0d)], 488305351);
            }
            int i5 = i * mn.an;
            int i6 = (256 - i) * mn.an;
            int i7 = 0;
            int i8 = 0;
            while (i8 < i6) {
                i3 = gr.bv[i7 + i5] - ((gr.bh[((gr.bx * -343770823) + i7) & (gr.bh.length - 1)] * i) / 6);
                if (i3 < 0) {
                    i3 = 0;
                }
                i4 = i7 + 1;
                gr.bv[i7] = i3;
                i8++;
                i7 = i4;
            }
            for (i8 = 256 - i; i8 < 256; i8++) {
                i7 = i8 * mn.an;
                i3 = 0;
                while (i3 < mn.an) {
                    if (((int) (Math.random() * 100.0d)) >= 50 || i3 <= 10 || i3 >= 118) {
                        gr.bv[i7 + i3] = 0;
                    } else {
                        gr.bv[i7 + i3] = 255;
                    }
                    i3++;
                }
            }
            if (-521591013 * gr.bz > 0) {
                gr.bz -= -227840948 * i;
            }
            if (-868909347 * gr.bg > 0) {
                gr.bg -= -142531116 * i;
            }
            if (-521591013 * gr.bz == 0 && -868909347 * gr.bg == 0) {
                i3 = (int) (Math.random() * ((double) (2000 / i)));
                if (i3 == 0) {
                    gr.bz = 1802259456;
                }
                if (1 == i3) {
                    gr.bg = -2128227328;
                }
            }
            for (i3 = 0; i3 < 256 - i; i3++) {
                gr.al[i3] = gr.al[i3 + i];
            }
            for (i3 = 256 - i; i3 < 256; i3++) {
                gr.al[i3] = (int) (((Math.sin(((double) (-181680073 * gr.be)) / 14.0d) * 16.0d) + (Math.sin(((double) (-181680073 * gr.be)) / 15.0d) * 14.0d)) + (Math.sin(((double) (gr.be * -181680073)) / 16.0d) * 12.0d));
                gr.be -= 1297715833;
            }
            gr.bt += -1866808155 * i;
            i4 = (((1581849891 * client.ak) & 1) + i) / 2;
            if (i4 > 0) {
                for (i3 = 0; i3 < gr.bt * 529481108; i3++) {
                    gr.bv[(((int) (Math.random() * 124.0d)) + 2) + ((((int) (Math.random() * 128.0d)) + mn.an) << 7)] = 192;
                }
                gr.bt = 0;
                for (i7 = 0; i7 < 256; i7++) {
                    i5 = i7 * mn.an;
                    i3 = 0;
                    for (i8 = -i4; i8 < mn.an; i8++) {
                        if (i8 + i4 < mn.an) {
                            i3 += gr.bv[(i8 + i5) + i4];
                        }
                        if (i8 - (i4 + 1) >= 0) {
                            i3 -= gr.bv[(i8 + i5) - (i4 + 1)];
                        }
                        if (i8 >= 0) {
                            dc.bp[i5 + i8] = i3 / ((i4 * 2) + 1);
                        }
                    }
                }
                for (i7 = 0; i7 < mn.an; i7++) {
                    i3 = 0;
                    for (i8 = -i4; i8 < 256; i8++) {
                        i5 = i8 * mn.an;
                        if (i8 + i4 < 256) {
                            i3 += dc.bp[(i7 + i5) + (i4 * mn.an)];
                        }
                        if (i8 - (i4 + 1) >= 0) {
                            i3 -= dc.bp[(i7 + i5) - ((i4 + 1) * mn.an)];
                        }
                        if (i8 >= 0) {
                            gr.bv[i5 + i7] = i3 / ((i4 * 2) + 1);
                        }
                    }
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "be.ai(" + ')');
        }
    }

    static boolean dt(int i) {
        try {
            return ((1424263497 * client.ir) & 2) != 0;
        } catch (Throwable e) {
            throw ba.ad(e, "be.dt(" + ')');
        }
    }
}
