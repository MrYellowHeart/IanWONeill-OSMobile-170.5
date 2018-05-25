package p000;

public class am extends kq {
    static kf af = null;
    static am an = new am();
    static final int bz = 3;
    static final int cw = 15;
    static int ne;
    int aa;
    public int ag;
    public int ar;
    public int as;
    public int ay;

    am() {
        try {
            this.aa = 0;
        } catch (Throwable e) {
            throw ba.ad(e, "am.<init>(" + ')');
        }
    }

    public static void aj(kf kfVar) {
        af = kfVar;
        lh.ad = new am[kfVar.aw(1, 1539013826)];
        for (int i = 0; i < lh.ad.length; i++) {
            byte[] an = af.an(1, i, 114315398);
            lh.ad[i] = new am();
            if (an != null) {
                lh.ad[i].aa(new ik(an), i, (byte) 89);
            }
            lh.ad[i].an(-2034068341);
        }
    }

    public static void ar(kf kfVar) {
        af = kfVar;
        lh.ad = new am[kfVar.aw(1, -250160431)];
        for (int i = 0; i < lh.ad.length; i++) {
            byte[] an = af.an(1, i, -1392532109);
            lh.ad[i] = new am();
            if (an != null) {
                lh.ad[i].aa(new ik(an), i, (byte) 70);
            }
            lh.ad[i].an(-2081474698);
        }
    }

    public static void as(kf kfVar) {
        af = kfVar;
        lh.ad = new am[kfVar.aw(1, 1380396537)];
        for (int i = 0; i < lh.ad.length; i++) {
            byte[] an = af.an(1, i, -403451481);
            lh.ad[i] = new am();
            if (an != null) {
                lh.ad[i].aa(new ik(an), i, (byte) 18);
            }
            lh.ad[i].an(-1953432959);
        }
    }

    public static am ae(int i) {
        return (i < 0 || i >= lh.ad.length) ? an : lh.ad[i];
    }

    public static am am(int i) {
        return (i < 0 || i >= lh.ad.length) ? an : lh.ad[i];
    }

    public static am aq(int i) {
        if (i < 0 || i >= lh.ad.length) {
            return an;
        }
        return lh.ad[i];
    }

    public static am at(int i) {
        if (i < 0 || i >= lh.ad.length) {
            return an;
        }
        return lh.ad[i];
    }

    void ab() {
        ay(724285705 * this.aa, -2091399806);
    }

    void ai() {
        ay(724285705 * this.aa, 843648342);
    }

    void an(int i) {
        try {
            ay(724285705 * this.aa, 128094075);
        } catch (Throwable e) {
            throw ba.ad(e, "am.an(" + ')');
        }
    }

    void aw() {
        ay(724285705 * this.aa, 1073479120);
    }

    void aa(ik ikVar, int i, byte b) {
        while (true) {
            try {
                int ao = ikVar.ao((byte) 0);
                if (ao != 0) {
                    ag(ikVar, ao, i, -2089076771);
                } else {
                    return;
                }
            } catch (Throwable e) {
                throw ba.ad(e, "am.aa(" + ')');
            }
        }
    }

    void ah(ik ikVar, int i) {
        while (true) {
            int ao = ikVar.ao((byte) 0);
            if (ao != 0) {
                ag(ikVar, ao, i, -2089076771);
            } else {
                return;
            }
        }
    }

    void ak(ik ikVar, int i) {
        while (true) {
            int ao = ikVar.ao((byte) 0);
            if (ao != 0) {
                ag(ikVar, ao, i, -2089076771);
            } else {
                return;
            }
        }
    }

    void ao(ik ikVar, int i) {
        while (true) {
            int ao = ikVar.ao((byte) 0);
            if (ao != 0) {
                ag(ikVar, ao, i, -2089076771);
            } else {
                return;
            }
        }
    }

    void ax(ik ikVar, int i) {
        while (true) {
            int ao = ikVar.ao((byte) 0);
            if (ao != 0) {
                ag(ikVar, ao, i, -2089076771);
            } else {
                return;
            }
        }
    }

    void az(ik ikVar, int i) {
        while (true) {
            int ao = ikVar.ao((byte) 0);
            if (ao != 0) {
                ag(ikVar, ao, i, -2089076771);
            } else {
                return;
            }
        }
    }

    void ag(ik ikVar, int i, int i2, int i3) {
        if (i == 1) {
            try {
                this.aa = ikVar.ac(-1300241258) * 1916380473;
            } catch (Throwable e) {
                throw ba.ad(e, "am.ag(" + ')');
            }
        }
    }

    void au(ik ikVar, int i, int i2) {
        if (i == 1) {
            this.aa = ikVar.ac(1408847339) * -1533809911;
        }
    }

    void ac(int i) {
        double d;
        double d2;
        double d3 = ((double) ((i >> 16) & 255)) / 256.0d;
        double d4 = ((double) ((i >> 8) & 255)) / 256.0d;
        double d5 = ((double) (i & 255)) / 256.0d;
        if (d4 < d3) {
            d = d4;
        } else {
            d = d3;
        }
        if (d5 < d) {
            d = d5;
        }
        if (d4 > d3) {
            d2 = d4;
        } else {
            d2 = d3;
        }
        if (d5 > d2) {
            d2 = d5;
        }
        double d6 = 0.0d;
        double d7 = (d + d2) / 2.0d;
        if (d2 != d) {
            if (d7 < 0.5d) {
                d6 = (d2 - d) / (d2 + d);
            }
            if (d7 >= 0.5d) {
                d6 = (d2 - d) / ((2.0d - d2) - d);
            }
            if (d2 == d3) {
                d5 = (d4 - d5) / (d2 - d);
                d = d6;
            } else if (d2 == d4) {
                d5 = ((d5 - d3) / (d2 - d)) + 2.0d;
                d = d6;
            } else if (d2 == d5) {
                d5 = ((d3 - d4) / (d2 - d)) + 4.0d;
                d = d6;
            }
            d5 /= 6.0d;
            this.ay = 562902111 * ((int) (256.0d * d));
            this.as = ((int) (256.0d * d7)) * -1434216303;
            if (this.ay * -890361953 < 0) {
                this.ay = 0;
            } else if (-890361953 * this.ay > 255) {
                this.ay = 1806117537;
            }
            if (1818437745 * this.as < 0) {
                this.as = 0;
            } else if (1818437745 * this.as > 255) {
                this.as = -652937105;
            }
            if (d7 <= 0.5d) {
                this.ar = ((int) ((d * (1.0d - d7)) * 512.0d)) * 1001815629;
            } else {
                this.ar = ((int) ((d * d7) * 512.0d)) * 1001815629;
            }
            if (this.ar * -524883323 < 1) {
                this.ar = 1001815629;
            }
            this.ag = ((int) (((double) (-524883323 * this.ar)) * d5)) * 426735677;
        }
        d = d6;
        d5 = 0.0d;
        d5 /= 6.0d;
        this.ay = 562902111 * ((int) (256.0d * d));
        this.as = ((int) (256.0d * d7)) * -1434216303;
        if (this.ay * -890361953 < 0) {
            this.ay = 0;
        } else if (-890361953 * this.ay > 255) {
            this.ay = 1806117537;
        }
        if (1818437745 * this.as < 0) {
            this.as = 0;
        } else if (1818437745 * this.as > 255) {
            this.as = -652937105;
        }
        if (d7 <= 0.5d) {
            this.ar = ((int) ((d * d7) * 512.0d)) * 1001815629;
        } else {
            this.ar = ((int) ((d * (1.0d - d7)) * 512.0d)) * 1001815629;
        }
        if (this.ar * -524883323 < 1) {
            this.ar = 1001815629;
        }
        this.ag = ((int) (((double) (-524883323 * this.ar)) * d5)) * 426735677;
    }

    void al(int i) {
        double d;
        double d2;
        double d3 = ((double) ((i >> 16) & 255)) / 256.0d;
        double d4 = ((double) ((i >> 8) & 255)) / 256.0d;
        double d5 = ((double) (i & 255)) / 256.0d;
        if (d4 < d3) {
            d = d4;
        } else {
            d = d3;
        }
        if (d5 < d) {
            d2 = d5;
        } else {
            d2 = d;
        }
        if (d4 > d3) {
            d = d4;
        } else {
            d = d3;
        }
        if (d5 > d) {
            d = d5;
        }
        double d6 = 0.0d;
        double d7 = (d2 + d) / 2.0d;
        if (d != d2) {
            if (d7 < 0.5d) {
                d6 = (d - d2) / (d + d2);
            }
            if (d7 >= 0.5d) {
                d6 = (d - d2) / ((2.0d - d) - d2);
            }
            if (d == d3) {
                d5 = (d4 - d5) / (d - d2);
                d = d6;
            } else if (d == d4) {
                d5 = ((d5 - d3) / (d - d2)) + 2.0d;
                d = d6;
            } else if (d == d5) {
                d5 = ((d3 - d4) / (d - d2)) + 4.0d;
                d = d6;
            }
            d5 /= 6.0d;
            this.ay = 562902111 * ((int) (256.0d * d));
            this.as = ((int) (256.0d * d7)) * -1434216303;
            if (this.ay * -890361953 < 0) {
                this.ay = 0;
            } else if (-890361953 * this.ay > 255) {
                this.ay = 1806117537;
            }
            if (1818437745 * this.as < 0) {
                this.as = 0;
            } else if (1818437745 * this.as > 255) {
                this.as = -652937105;
            }
            if (d7 <= 0.5d) {
                this.ar = ((int) ((d * (1.0d - d7)) * 512.0d)) * 1001815629;
            } else {
                this.ar = ((int) ((d * d7) * 512.0d)) * 1001815629;
            }
            if (this.ar * -524883323 < 1) {
                this.ar = 1001815629;
            }
            this.ag = ((int) (((double) (-524883323 * this.ar)) * d5)) * 426735677;
        }
        d = d6;
        d5 = 0.0d;
        d5 /= 6.0d;
        this.ay = 562902111 * ((int) (256.0d * d));
        this.as = ((int) (256.0d * d7)) * -1434216303;
        if (this.ay * -890361953 < 0) {
            this.ay = 0;
        } else if (-890361953 * this.ay > 255) {
            this.ay = 1806117537;
        }
        if (1818437745 * this.as < 0) {
            this.as = 0;
        } else if (1818437745 * this.as > 255) {
            this.as = -652937105;
        }
        if (d7 <= 0.5d) {
            this.ar = ((int) ((d * d7) * 512.0d)) * 1001815629;
        } else {
            this.ar = ((int) ((d * (1.0d - d7)) * 512.0d)) * 1001815629;
        }
        if (this.ar * -524883323 < 1) {
            this.ar = 1001815629;
        }
        this.ag = ((int) (((double) (-524883323 * this.ar)) * d5)) * 426735677;
    }

    void ap(int i) {
        double d;
        double d2;
        double d3;
        double d4 = ((double) ((i >> 16) & 255)) / 256.0d;
        double d5 = ((double) ((i >> 8) & 255)) / 256.0d;
        double d6 = ((double) (i & 255)) / 256.0d;
        if (d5 < d4) {
            d = d5;
        } else {
            d = d4;
        }
        if (d6 < d) {
            d = d6;
        }
        if (d5 > d4) {
            d2 = d5;
        } else {
            d2 = d4;
        }
        if (d6 > d2) {
            d3 = d6;
        } else {
            d3 = d2;
        }
        d2 = 0.0d;
        double d7 = (d + d3) / 2.0d;
        if (d3 != d) {
            if (d7 < 0.5d) {
                d2 = (d3 - d) / (d3 + d);
            }
            if (d7 >= 0.5d) {
                d2 = (d3 - d) / ((2.0d - d3) - d);
            }
            if (d3 == d4) {
                d6 = (d5 - d6) / (d3 - d);
                d = d2;
            } else if (d3 == d5) {
                d6 = ((d6 - d4) / (d3 - d)) + 2.0d;
                d = d2;
            } else if (d3 == d6) {
                d6 = ((d4 - d5) / (d3 - d)) + 4.0d;
                d = d2;
            }
            d6 /= 6.0d;
            this.ay = 562902111 * ((int) (256.0d * d));
            this.as = ((int) (256.0d * d7)) * -1434216303;
            if (this.ay * -890361953 < 0) {
                this.ay = 0;
            } else if (-890361953 * this.ay > 255) {
                this.ay = 1806117537;
            }
            if (1818437745 * this.as < 0) {
                this.as = 0;
            } else if (1818437745 * this.as > 255) {
                this.as = -652937105;
            }
            if (d7 <= 0.5d) {
                this.ar = ((int) ((d * (1.0d - d7)) * 512.0d)) * 1001815629;
            } else {
                this.ar = ((int) ((d * d7) * 512.0d)) * 1001815629;
            }
            if (this.ar * -524883323 < 1) {
                this.ar = 1001815629;
            }
            this.ag = ((int) (((double) (-524883323 * this.ar)) * d6)) * 426735677;
        }
        d = d2;
        d6 = 0.0d;
        d6 /= 6.0d;
        this.ay = 562902111 * ((int) (256.0d * d));
        this.as = ((int) (256.0d * d7)) * -1434216303;
        if (this.ay * -890361953 < 0) {
            this.ay = 0;
        } else if (-890361953 * this.ay > 255) {
            this.ay = 1806117537;
        }
        if (1818437745 * this.as < 0) {
            this.as = 0;
        } else if (1818437745 * this.as > 255) {
            this.as = -652937105;
        }
        if (d7 <= 0.5d) {
            this.ar = ((int) ((d * d7) * 512.0d)) * 1001815629;
        } else {
            this.ar = ((int) ((d * (1.0d - d7)) * 512.0d)) * 1001815629;
        }
        if (this.ar * -524883323 < 1) {
            this.ar = 1001815629;
        }
        this.ag = ((int) (((double) (-524883323 * this.ar)) * d6)) * 426735677;
    }

    void av(int i) {
        double d;
        double d2;
        double d3 = ((double) ((i >> 16) & 255)) / 256.0d;
        double d4 = ((double) ((i >> 8) & 255)) / 256.0d;
        double d5 = ((double) (i & 255)) / 256.0d;
        if (d4 < d3) {
            d = d4;
        } else {
            d = d3;
        }
        if (d5 < d) {
            d = d5;
        }
        if (d4 > d3) {
            d2 = d4;
        } else {
            d2 = d3;
        }
        if (d5 > d2) {
            d2 = d5;
        }
        double d6 = 0.0d;
        double d7 = (d + d2) / 2.0d;
        if (d2 != d) {
            if (d7 < 0.5d) {
                d6 = (d2 - d) / (d2 + d);
            }
            if (d7 >= 0.5d) {
                d6 = (d2 - d) / ((2.0d - d2) - d);
            }
            if (d2 == d3) {
                d5 = (d4 - d5) / (d2 - d);
                d = d6;
            } else if (d2 == d4) {
                d5 = ((d5 - d3) / (d2 - d)) + 2.0d;
                d = d6;
            } else if (d2 == d5) {
                d5 = ((d3 - d4) / (d2 - d)) + 4.0d;
                d = d6;
            }
            d5 /= 6.0d;
            this.ay = 562902111 * ((int) (256.0d * d));
            this.as = ((int) (256.0d * d7)) * -1434216303;
            if (this.ay * -890361953 < 0) {
                this.ay = 0;
            } else if (-890361953 * this.ay > 255) {
                this.ay = 1806117537;
            }
            if (1818437745 * this.as < 0) {
                this.as = 0;
            } else if (1818437745 * this.as > 255) {
                this.as = -652937105;
            }
            if (d7 <= 0.5d) {
                this.ar = ((int) ((d * (1.0d - d7)) * 512.0d)) * 1001815629;
            } else {
                this.ar = ((int) ((d * d7) * 512.0d)) * 1001815629;
            }
            if (this.ar * -524883323 < 1) {
                this.ar = 1001815629;
            }
            this.ag = ((int) (((double) (-524883323 * this.ar)) * d5)) * 426735677;
        }
        d = d6;
        d5 = 0.0d;
        d5 /= 6.0d;
        this.ay = 562902111 * ((int) (256.0d * d));
        this.as = ((int) (256.0d * d7)) * -1434216303;
        if (this.ay * -890361953 < 0) {
            this.ay = 0;
        } else if (-890361953 * this.ay > 255) {
            this.ay = 1806117537;
        }
        if (1818437745 * this.as < 0) {
            this.as = 0;
        } else if (1818437745 * this.as > 255) {
            this.as = -652937105;
        }
        if (d7 <= 0.5d) {
            this.ar = ((int) ((d * d7) * 512.0d)) * 1001815629;
        } else {
            this.ar = ((int) ((d * (1.0d - d7)) * 512.0d)) * 1001815629;
        }
        if (this.ar * -524883323 < 1) {
            this.ar = 1001815629;
        }
        this.ag = ((int) (((double) (-524883323 * this.ar)) * d5)) * 426735677;
    }

    void m26ay(int i, int i2) {
        double d;
        double d2;
        double d3 = ((double) ((i >> 16) & 255)) / 256.0d;
        double d4 = ((double) ((i >> 8) & 255)) / 256.0d;
        double d5 = ((double) (i & 255)) / 256.0d;
        if (d4 < d3) {
            d = d4;
        } else {
            d = d3;
        }
        if (d5 < d) {
            d2 = d5;
        } else {
            d2 = d;
        }
        if (d4 > d3) {
            d = d4;
        } else {
            d = d3;
        }
        if (d5 > d) {
            d = d5;
        }
        double d6 = 0.0d;
        double d7 = (d2 + d) / 2.0d;
        if (d != d2) {
            if (d7 < 0.5d) {
                d6 = (d - d2) / (d + d2);
            }
            if (d7 >= 0.5d) {
                d6 = (d - d2) / ((2.0d - d) - d2);
            }
            if (d == d3) {
                d5 = (d4 - d5) / (d - d2);
                d = d6;
            } else if (d == d4) {
                d5 = ((d5 - d3) / (d - d2)) + 2.0d;
                d = d6;
            } else if (d == d5) {
                d5 = ((d3 - d4) / (d - d2)) + 4.0d;
                d = d6;
            }
            d5 /= 6.0d;
            this.ay = 562902111 * ((int) (256.0d * d));
            this.as = ((int) (256.0d * d7)) * -1434216303;
            if (this.ay * -890361953 < 0) {
                this.ay = 0;
            } else if (-890361953 * this.ay > 255) {
                this.ay = 1806117537;
            }
            if (1818437745 * this.as < 0) {
                this.as = 0;
            } else if (1818437745 * this.as > 255) {
                this.as = -652937105;
            }
            if (d7 <= 0.5d) {
                this.ar = ((int) ((d * (1.0d - d7)) * 512.0d)) * 1001815629;
            } else {
                this.ar = ((int) ((d * d7) * 512.0d)) * 1001815629;
            }
            if (this.ar * -524883323 < 1) {
                this.ar = 1001815629;
            }
            this.ag = ((int) (((double) (-524883323 * this.ar)) * d5)) * 426735677;
        }
        d = d6;
        d5 = 0.0d;
        d5 /= 6.0d;
        try {
            this.ay = 562902111 * ((int) (256.0d * d));
            this.as = ((int) (256.0d * d7)) * -1434216303;
            if (this.ay * -890361953 < 0) {
                this.ay = 0;
            } else if (-890361953 * this.ay > 255) {
                this.ay = 1806117537;
            }
            if (1818437745 * this.as < 0) {
                this.as = 0;
            } else if (1818437745 * this.as > 255) {
                this.as = -652937105;
            }
            if (d7 <= 0.5d) {
                this.ar = ((int) ((d * d7) * 512.0d)) * 1001815629;
            } else {
                this.ar = ((int) ((d * (1.0d - d7)) * 512.0d)) * 1001815629;
            }
            if (this.ar * -524883323 < 1) {
                this.ar = 1001815629;
            }
            this.ag = ((int) (((double) (-524883323 * this.ar)) * d5)) * 426735677;
        } catch (Throwable e) {
            throw ba.ad(e, "am.ay(" + ')');
        }
    }

    public static int ay(int i, int i2) {
        try {
            return bb.as(cs.az[i]);
        } catch (Throwable e) {
            throw ba.ad(e, "am.ay(" + ')');
        }
    }

    static final void an(ia iaVar, short s) {
        int i = 0;
        try {
            int i2;
            int i3;
            byte[] bArr;
            iaVar.jw(1565299499);
            int i4 = 0;
            for (i2 = 0; i2 < gw.ay * -1675758365; i2++) {
                i3 = gw.as[i2];
                if ((gw.an[i3] & 1) == 0) {
                    if (i4 > 0) {
                        i4--;
                        bArr = gw.an;
                        bArr[i3] = (byte) (bArr[i3] | 2);
                    } else if (iaVar.kf(1, (byte) -39) == 0) {
                        i4 = hy.aa(iaVar, -1798257477);
                        bArr = gw.an;
                        bArr[i3] = (byte) (bArr[i3] | 2);
                    } else {
                        mq.ag(iaVar, i3, 1452776650);
                    }
                }
            }
            iaVar.kh(1885733558);
            if (i4 != 0) {
                throw new RuntimeException();
            }
            iaVar.jw(1565299499);
            for (i2 = 0; i2 < gw.ay * -1675758365; i2++) {
                i3 = gw.as[i2];
                if ((gw.an[i3] & 1) != 0) {
                    if (i4 > 0) {
                        i4--;
                        bArr = gw.an;
                        bArr[i3] = (byte) (bArr[i3] | 2);
                    } else if (iaVar.kf(1, (byte) -11) == 0) {
                        i4 = hy.aa(iaVar, -2025671722);
                        bArr = gw.an;
                        bArr[i3] = (byte) (bArr[i3] | 2);
                    } else {
                        mq.ag(iaVar, i3, 1452776650);
                    }
                }
            }
            iaVar.kh(1885733558);
            if (i4 != 0) {
                throw new RuntimeException();
            }
            iaVar.jw(1565299499);
            for (i2 = 0; i2 < gw.ar * -844313837; i2++) {
                i3 = gw.aj[i2];
                if ((gw.an[i3] & 1) != 0) {
                    if (i4 > 0) {
                        i4--;
                        bArr = gw.an;
                        bArr[i3] = (byte) (bArr[i3] | 2);
                    } else if (iaVar.kf(1, (byte) -31) == 0) {
                        i4 = hy.aa(iaVar, -1879687682);
                        bArr = gw.an;
                        bArr[i3] = (byte) (bArr[i3] | 2);
                    } else if (bt.ay(iaVar, i3, 212560054)) {
                        bArr = gw.an;
                        bArr[i3] = (byte) (bArr[i3] | 2);
                    }
                }
            }
            iaVar.kh(1885733558);
            if (i4 != 0) {
                throw new RuntimeException();
            }
            iaVar.jw(1565299499);
            while (i < -844313837 * gw.ar) {
                i2 = gw.aj[i];
                if ((gw.an[i2] & 1) == 0) {
                    byte[] bArr2;
                    if (i4 > 0) {
                        i4--;
                        bArr2 = gw.an;
                        bArr2[i2] = (byte) (bArr2[i2] | 2);
                    } else if (iaVar.kf(1, (byte) -99) == 0) {
                        i4 = hy.aa(iaVar, -1799136884);
                        bArr2 = gw.an;
                        bArr2[i2] = (byte) (bArr2[i2] | 2);
                    } else if (bt.ay(iaVar, i2, 690863437)) {
                        bArr2 = gw.an;
                        bArr2[i2] = (byte) (bArr2[i2] | 2);
                    }
                }
                i++;
            }
            iaVar.kh(1885733558);
            if (i4 != 0) {
                throw new RuntimeException();
            }
            gw.ay = 0;
            gw.ar = 0;
            for (i4 = 1; i4 < mn.ae; i4++) {
                byte[] bArr3 = gw.an;
                bArr3[i4] = (byte) (bArr3[i4] >> 1);
                int[] iArr;
                if (client.hb[i4] != null) {
                    iArr = gw.as;
                    i = gw.ay - 1328615221;
                    gw.ay = i;
                    iArr[(i * -1675758365) - 1] = i4;
                } else {
                    iArr = gw.aj;
                    i = gw.ar - 948652261;
                    gw.ar = i;
                    iArr[(i * -844313837) - 1] = i4;
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "am.an(" + ')');
        }
    }

    public static final int dq(int i) {
        try {
            return 453104899 * client.dj;
        } catch (Throwable e) {
            throw ba.ad(e, "am.dq(" + ')');
        }
    }
}
