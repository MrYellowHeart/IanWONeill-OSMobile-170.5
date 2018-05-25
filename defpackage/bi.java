package p000;

public abstract class bi {
    public static cy ab = null;
    public static final int[] ah = new int[mn.ae];
    static final int[] ai = new int[mn.ae];
    static final int aj = 14;
    static final int as = 50;
    public static final int[] at = new int[ic.ad];
    static final int[] aw = new int[512];
    public static final int[] az = new int[mn.ae];
    static kh br;
    int ac;
    int ak;
    boolean al;
    int ao;
    boolean ap;
    int au;
    int av;
    int ax;
    boolean bb;
    int bc;
    int[] be;
    int bf;
    int bg;
    int bh;
    int bp;
    int bt;
    int bu;
    int bv;
    boolean bw;
    int bx;
    int bz;

    public abstract void ae();

    public abstract void af(int i);

    public abstract void aq();

    bi() {
        int i = 1;
        try {
            this.ax = 0;
            this.au = 0;
            this.av = 0;
            this.ac = 0;
            this.al = false;
            this.ap = false;
            this.bw = false;
            this.bb = true;
            this.bc = 0;
            this.bz = 527384064;
            this.be = new int[1024];
            for (int i2 = 1; i2 < 512; i2++) {
                aw[i2] = 32768 / i2;
            }
            while (i < mn.ae) {
                ai[i] = ic.ad / i;
                i++;
            }
            for (int i3 = 0; i3 < mn.ae; i3++) {
                az[i3] = (int) (Math.sin(((double) i3) * 0.0030679615d) * 65536.0d);
                ah[i3] = (int) (Math.cos(((double) i3) * 0.0030679615d) * 65536.0d);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "bi.<init>(" + ')');
        }
    }

    public static final void by(double d) {
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
                    d4 = d6 < 0.5d ? (1.0d + d3) * d6 : (d3 + d6) - (d6 * d3);
                    d6 = (d6 * 2.0d) - d4;
                    d5 = 0.3333333333333333d + d2;
                    if (d5 > 1.0d) {
                        d7 = d5 - 1.0d;
                    } else {
                        d7 = d5;
                    }
                    d5 = d2 - 0.3333333333333333d;
                    if (d5 < 0.0d) {
                        d8 = d5 + 1.0d;
                    } else {
                        d8 = d5;
                    }
                    d7 = 6.0d * d7 < 1.0d ? d6 + ((6.0d * (d4 - d6)) * d7) : 2.0d * d7 < 1.0d ? d4 : 3.0d * d7 < 2.0d ? d6 + (((d4 - d6) * (0.6666666666666666d - d7)) * 6.0d) : d6;
                    if (6.0d * d2 < 1.0d) {
                        d5 = (((d4 - d6) * 6.0d) * d2) + d6;
                    } else if (2.0d * d2 < 1.0d) {
                        d5 = d4;
                    } else if (3.0d * d2 < 2.0d) {
                        d5 = (6.0d * ((d4 - d6) * (0.6666666666666666d - d2))) + d6;
                    } else {
                        d5 = d6;
                    }
                    if (6.0d * d8 < 1.0d) {
                        d6 += ((d4 - d6) * 6.0d) * d8;
                        d4 = d5;
                        d5 = d7;
                    } else if (2.0d * d8 < 1.0d) {
                        d6 = d4;
                        d4 = d5;
                        d5 = d7;
                    } else if (3.0d * d8 < 2.0d) {
                        d6 += ((d4 - d6) * (0.6666666666666666d - d8)) * 6.0d;
                        d4 = d5;
                        d5 = d7;
                    } else {
                        d4 = d5;
                        d5 = d7;
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
                at[i4] = bb;
                i3++;
                i4 = i;
            }
            i2++;
            i = i4;
        }
    }

    public static final int ba(int i, double d) {
        double d2 = ((double) ((i >> 8) & 255)) / 256.0d;
        double d3 = ((double) (i & 255)) / 256.0d;
        return (((((int) (Math.pow(((double) ((i >> 16) & 255)) / 256.0d, d) * 256.0d)) << 16) + (((int) (Math.pow(d2, d) * 256.0d)) << 8)) + ((int) (256.0d * Math.pow(d3, d)))) | (-16777216 & i);
    }

    public static final int bd(int i, double d) {
        double d2 = ((double) ((i >> 8) & 255)) / 256.0d;
        double d3 = ((double) (i & 255)) / 256.0d;
        return (((((int) (Math.pow(((double) ((i >> 16) & 255)) / 256.0d, d) * 256.0d)) << 16) + (((int) (Math.pow(d2, d) * 256.0d)) << 8)) + ((int) (256.0d * Math.pow(d3, d)))) | (1877689999 & i);
    }

    public static final int bl(int i, double d) {
        double d2 = ((double) ((i >> 8) & 854314870)) / 256.0d;
        double d3 = ((double) (-1081416802 & i)) / 256.0d;
        return (((((int) (Math.pow(((double) ((i >> 16) & -1446682249)) / 256.0d, d) * 256.0d)) << 16) + (((int) (Math.pow(d2, d) * 256.0d)) << 8)) + ((int) (256.0d * Math.pow(d3, d)))) | (-16777216 & i);
    }

    public static final int bn(int i, double d) {
        double d2 = ((double) ((i >> 8) & 255)) / 256.0d;
        double d3 = ((double) (145300189 & i)) / 256.0d;
        return (((((int) (Math.pow(((double) ((i >> 16) & 255)) / 256.0d, d) * 256.0d)) << 16) + (((int) (Math.pow(d2, d) * 256.0d)) << 8)) + ((int) (256.0d * Math.pow(d3, d)))) | (980901593 & i);
    }

    public static final int bs(int i, double d) {
        double d2 = ((double) ((i >> 8) & 255)) / 256.0d;
        double d3 = ((double) (-2066063016 & i)) / 256.0d;
        return (((((int) (Math.pow(((double) ((i >> 16) & -2038232085)) / 256.0d, d) * 256.0d)) << 16) + (((int) (Math.pow(d2, d) * 256.0d)) << 8)) + ((int) (256.0d * Math.pow(d3, d)))) | (-16777216 & i);
    }

    public static final void bm(cy cyVar) {
        ab = cyVar;
    }

    public static final void br(cy cyVar) {
        ab = cyVar;
    }

    public final void bj(int i) {
        this.bz = 2070207686 * i;
    }

    public final void bz(int i, int i2) {
        try {
            this.bz = -829442145 * i;
        } catch (Throwable e) {
            throw ba.ad(e, "bi.bz(" + ')');
        }
    }

    public void ai(int i) {
        bz(i, -531112868);
    }

    public void an(int i, int i2) {
        try {
            bz(i, -2012494136);
        } catch (Throwable e) {
            throw ba.ad(e, "bi.an(" + ')');
        }
    }

    public void aw(int i) {
        bz(i, 1233093029);
    }

    public final int bg(int i) {
        try {
            return 542614623 * this.bz;
        } catch (Throwable e) {
            throw ba.ad(e, "bi.bg(" + ')');
        }
    }

    public final int bi() {
        return 542614623 * this.bz;
    }

    public final int bq() {
        return 1351300758 * this.bz;
    }

    public final void bh(boolean z, int i) {
        try {
            this.bb = z;
        } catch (Throwable e) {
            throw ba.ad(e, "bi.bh(" + ')');
        }
    }

    public final void bo(boolean z) {
        this.bb = z;
    }

    public final void ci(boolean z) {
        this.bb = z;
    }

    public final void cv(boolean z) {
        this.bb = z;
    }

    public final void bf(int i, int i2, int i3, int i4, byte b) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        try {
            if (i3 > this.ak * -1741252353) {
                i3 = -1741252353 * this.ak;
            }
            if (i4 > this.ao * -163842587) {
                i4 = -163842587 * this.ao;
            }
            this.av = -1579568447 * i;
            this.ax = 714299273 * i2;
            this.ac = -851208251 * i3;
            this.au = 1644395011 * i4;
        } catch (Throwable e) {
            throw ba.ad(e, "bi.bf(" + ')');
        }
    }

    public final void cc(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 > this.ak * -1741252353) {
            i3 = -1741252353 * this.ak;
        }
        if (i4 > -163842587 * this.ao) {
            i4 = -493271067 * this.ao;
        }
        this.av = 413658996 * i;
        this.ax = 714299273 * i2;
        this.ac = -851208251 * i3;
        this.au = -2097957343 * i4;
    }

    public final void co(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 > this.ak * -1741252353) {
            i3 = 1998956076 * this.ak;
        }
        if (i4 > -163842587 * this.ao) {
            i4 = -84530768 * this.ao;
        }
        this.av = -1579568447 * i;
        this.ax = 714299273 * i2;
        this.ac = -851208251 * i3;
        this.au = 1644395011 * i4;
    }

    public final void cy(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 > this.ak * -1741252353) {
            i3 = -1715784827 * this.ak;
        }
        if (i4 > this.ao * -163842587) {
            i4 = -163842587 * this.ao;
        }
        this.av = -1579568447 * i;
        this.ax = 714299273 * i2;
        this.ac = -1152874927 * i3;
        this.au = 1427382878 * i4;
    }

    public final void bv(int i) {
        try {
            ad(-1213604543 * this.av, this.ax * 797593273, 1896206093 * this.ac, 1625587883 * this.au, (byte) 108);
        } catch (Throwable e) {
            throw ba.ad(e, "bi.bv(" + ')');
        }
    }

    public final void cn() {
        ad(-1916381655 * this.av, this.ax * 797593273, 1896206093 * this.ac, 77705503 * this.au, (byte) 58);
    }

    void ab(int i, int i2, int i3, int i4) {
        this.bf = 1006283871 * (i3 - i);
        this.bv = -1589321638 * (i4 - i2);
        bp((byte) 19);
        if (this.be.length < -1376519472 * this.bv) {
            int i5 = (this.bv * -1759402563) - 1;
            i5 |= i5 >>> 1;
            i5 |= i5 >>> 2;
            i5 |= i5 >>> 4;
            i5 |= i5 >>> 8;
            this.be = new int[((i5 | (i5 >>> 16)) + 1)];
        }
        int i6 = i + ((this.ak * -1741252353) * i2);
        for (i5 = 0; i5 < this.bv * -813714580; i5++) {
            this.be[i5] = i6;
            i6 += this.ak * -1741252353;
        }
    }

    void ad(int i, int i2, int i3, int i4, byte b) {
        try {
            int i5;
            this.bf = 1006283871 * (i3 - i);
            this.bv = 2015804821 * (i4 - i2);
            bp((byte) 46);
            if (this.be.length < this.bv * -1759402563) {
                i5 = (this.bv * -1759402563) - 1;
                i5 |= i5 >>> 1;
                i5 |= i5 >>> 2;
                i5 |= i5 >>> 4;
                i5 |= i5 >>> 8;
                this.be = new int[((i5 | (i5 >>> 16)) + 1)];
            }
            int i6 = i + ((this.ak * -1741252353) * i2);
            for (i5 = 0; i5 < this.bv * -1759402563; i5++) {
                this.be[i5] = i6;
                i6 += this.ak * -1741252353;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "bi.ad(" + ')');
        }
    }

    void am(int i, int i2, int i3, int i4) {
        this.bf = 1006283871 * (i3 - i);
        this.bv = 2015804821 * (i4 - i2);
        bp((byte) 49);
        if (this.be.length < this.bv * -1759402563) {
            int i5 = (this.bv * -1759402563) - 1;
            i5 |= i5 >>> 1;
            i5 |= i5 >>> 2;
            i5 |= i5 >>> 4;
            i5 |= i5 >>> 8;
            this.be = new int[((i5 | (i5 >>> 16)) + 1)];
        }
        int i6 = i + ((this.ak * -1741252353) * i2);
        for (i5 = 0; i5 < this.bv * -1759402563; i5++) {
            this.be[i5] = i6;
            i6 += this.ak * -1741252353;
        }
    }

    void at(int i, int i2, int i3, int i4) {
        this.bf = -993272143 * (i3 - i);
        this.bv = -249093371 * (i4 - i2);
        bp((byte) -16);
        if (this.be.length < this.bv * -1759402563) {
            int i5 = (this.bv * 823525845) - 1;
            i5 |= i5 >>> 1;
            i5 |= i5 >>> 2;
            i5 |= i5 >>> 4;
            i5 |= i5 >>> 8;
            this.be = new int[((i5 | (i5 >>> 16)) + 1)];
        }
        int i6 = i + ((this.ak * -1473647897) * i2);
        for (i5 = 0; i5 < this.bv * -1759402563; i5++) {
            this.be[i5] = i6;
            i6 += this.ak * -91504289;
        }
    }

    public final void bp(byte b) {
        try {
            this.bg = ((784773023 * this.bf) / 2) * 2004168453;
            this.bh = 240863897 * ((this.bv * -1759402563) / 2);
            this.bp = -(this.bg * 222871323);
            this.bx = (this.bf * -252416693) - (2011356561 * this.bg);
            this.bt = -(501170457 * this.bh);
            this.bu = (-523764989 * this.bv) - (24574999 * this.bh);
        } catch (Throwable e) {
            throw ba.ad(e, "bi.bp(" + ')');
        }
    }

    public final void ck() {
        this.bg = ((784773023 * this.bf) / 2) * 2004168453;
        this.bh = 240863897 * ((this.bv * -1759402563) / 2);
        this.bp = -(this.bg * 222871323);
        this.bx = (this.bf * -252416693) - (2011356561 * this.bg);
        this.bt = -(501170457 * this.bh);
        this.bu = (-1994895642 * this.bv) - (24574999 * this.bh);
    }

    public final void bx(int i, int i2, byte b) {
        try {
            int i3 = this.be[0];
            int i4 = i3 / (this.ak * -1741252353);
            this.bg = (i - (i3 - ((this.ak * -1741252353) * i4))) * 2004168453;
            this.bh = (i2 - i4) * 240863897;
            this.bp = -(this.bg * 222871323);
            this.bx = (this.bf * -252416693) - (2011356561 * this.bg);
            this.bt = -(this.bh * 501170457);
            this.bu = (-523764989 * this.bv) - (24574999 * this.bh);
        } catch (Throwable e) {
            throw ba.ad(e, "bi.bx(" + ')');
        }
    }

    public final void cd(int i, int i2) {
        int i3 = this.be[0];
        int i4 = i3 / (this.ak * -1741252353);
        this.bg = (i - (i3 - ((-1910069581 * this.ak) * i4))) * 1971172540;
        this.bh = (i2 - i4) * 240863897;
        this.bp = -(this.bg * -999761740);
        this.bx = (this.bf * -252416693) - (-1435708826 * this.bg);
        this.bt = -(this.bh * 501170457);
        this.bu = (-523764989 * this.bv) - (24574999 * this.bh);
    }

    public final void cl(int i, int i2) {
        int i3 = this.be[0];
        int i4 = i3 / (this.ak * -1741252353);
        this.bg = (i - (i3 - ((this.ak * -1741252353) * i4))) * 2004168453;
        this.bh = (i2 - i4) * 240863897;
        this.bp = -(this.bg * 222871323);
        this.bx = (this.bf * -252416693) - (2011356561 * this.bg);
        this.bt = -(this.bh * 501170457);
        this.bu = (-523764989 * this.bv) - (24574999 * this.bh);
    }

    public final void cs(int i, int i2) {
        int i3 = this.be[0];
        int i4 = i3 / (this.ak * -1741252353);
        this.bg = (i - (i3 - ((this.ak * -1741252353) * i4))) * 2004168453;
        this.bh = (i2 - i4) * 240863897;
        this.bp = -(this.bg * 222871323);
        this.bx = (this.bf * -252416693) - (2011356561 * this.bg);
        this.bt = -(this.bh * 501170457);
        this.bu = (-523764989 * this.bv) - (24574999 * this.bh);
    }

    public void bt(int i, int i2, int i3, int i4) {
        boolean z;
        if (i >= 0) {
            try {
                if (i <= this.bf * 784773023 && i2 >= 0 && i2 <= this.bf * 784773023 && i3 >= 0 && i3 <= this.bf * 784773023) {
                    z = false;
                    this.al = z;
                }
            } catch (Throwable e) {
                throw ba.ad(e, "bi.bt(" + ')');
            }
        }
        z = true;
        this.al = z;
    }

    public void ch(int i, int i2, int i3) {
        boolean z = i < 0 || i > this.bf * 784773023 || i2 < 0 || i2 > this.bf * 784773023 || i3 < 0 || i3 > this.bf * 784773023;
        this.al = z;
    }

    public void cm(int i, int i2, int i3) {
        boolean z;
        if (i < 0 || i > 595856860 * this.bf || i2 < 0 || i2 > -2115352327 * this.bf || i3 < 0 || i3 > this.bf * 784773023) {
            z = true;
        } else {
            z = false;
        }
        this.al = z;
    }

    static final int cq(int i, int i2) {
        int i3 = 126;
        int i4 = ((-734173598 & i) * i2) >> 7;
        if (i4 < 2) {
            i3 = 2;
        } else if (i4 <= 126) {
            i3 = i4;
        }
        return i3 + (65408 & i);
    }

    static final int cj(int i, int i2, int i3, int i4) {
        return ((i3 * i) + (i4 * i2)) >> 16;
    }

    static final int cp(int i, int i2, int i3, int i4) {
        return ((i3 * i) + (i4 * i2)) >> 16;
    }

    static final int cb(int i, int i2, int i3, int i4) {
        return ((i * i3) - (i4 * i2)) >> 16;
    }

    static final int ct(int i, int i2, int i3, int i4) {
        return ((i * i3) - (i4 * i2)) >> 16;
    }

    static final void dp(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 >= 1 && i4 >= 1 && i3 <= 102 && i4 <= 102) {
            try {
                if (!client.ae || i == dq.hf * -1674539149) {
                    long j = 0;
                    if (i2 == 0) {
                        j = gp.en.bw(i, i3, i4);
                    }
                    if (1 == i2) {
                        j = gp.en.bb(i, i3, i4);
                    }
                    if (i2 == 2) {
                        j = gp.en.bc(i, i3, i4);
                    }
                    if (3 == i2) {
                        j = gp.en.bz(i, i3, i4);
                    }
                    if (0 != j) {
                        int bg = gp.en.bg(i, i3, i4, j);
                        int as = bb.as(j);
                        int i9 = bg & 31;
                        int i10 = (bg >> 6) & 3;
                        if (i2 == 0) {
                            gp.en.ah(i, i3, i4);
                            ae ad = gi.ad(as, 2034210210);
                            if (-1655214851 * ad.ak != 0) {
                                client.ea[i].as(i3, i4, i9, i10, ad.ao, 1224014431);
                            }
                        }
                        if (1 == i2) {
                            gp.en.ak(i, i3, i4);
                        }
                        if (i2 == 2) {
                            gp.en.ao(i, i3, i4);
                            ae ad2 = gi.ad(as, 1490000479);
                            if ((ad2.az * -265754695) + i3 <= 103 && (ad2.az * -265754695) + i4 <= 103 && (ad2.ah * -344743753) + i3 <= 103 && (ad2.ah * -344743753) + i4 <= 103) {
                                if (ad2.ak * -1655214851 != 0) {
                                    client.ea[i].ar(i3, i4, -265754695 * ad2.az, -344743753 * ad2.ah, i10, ad2.ao, -290516790);
                                }
                            } else {
                                return;
                            }
                        }
                        if (i2 == 3) {
                            gp.en.ax(i, i3, i4);
                            if (1 == gi.ad(as, 1679687885).ak * -1655214851) {
                                client.ea[i].ae(i3, i4, (byte) -1);
                            }
                        }
                    }
                    if (i5 >= 0) {
                        int i11;
                        if (i >= 3 || 2 != (gu.ad[1][i3][i4] & 2)) {
                            i11 = i;
                        } else {
                            i11 = i + 1;
                        }
                        C0001do.az(i, i11, i3, i4, i5, i6, i7, gp.en, client.ea[i], -852998796);
                    }
                }
            } catch (Throwable e) {
                throw ba.ad(e, "bi.dp(" + ')');
            }
        }
    }
}
