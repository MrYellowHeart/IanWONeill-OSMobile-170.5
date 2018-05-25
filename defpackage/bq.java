package p000;

import com.jagex.oldscape.osrenderer.af;

public class bq extends ch {
    static int[] ap = null;
    static gd aq = null;
    public static final int bk = 52;
    public static int du;
    static ls kw;
    final bk ad;
    final by af;

    public bq(by byVar) {
        try {
            this.af = byVar;
            this.ad = new bk(this.af);
        } catch (Throwable e) {
            throw ba.ad(e, "bq.<init>(" + ')');
        }
    }

    public bi af(int i) {
        try {
            return this.af;
        } catch (Throwable e) {
            throw ba.ad(e, "bq.af(" + ')');
        }
    }

    public bi ag() {
        return this.af;
    }

    public bi as() {
        return this.af;
    }

    public bi ay() {
        return this.af;
    }

    public cn ad(byte b) {
        try {
            return this.ad;
        } catch (Throwable e) {
            throw ba.ad(e, "bq.ad(" + ')');
        }
    }

    public cn aj() {
        return this.ad;
    }

    public cn ar() {
        return this.ad;
    }

    public void ah(int i) {
        if (cs.an) {
            af.ar((-429386291 * cs.aa) - (this.af.bg * -1693191667), ht.ae(-414970391) - (-76732087 * this.af.bh), (byte) 101);
        }
        this.ad.aa(i, 1443195913);
    }

    public void ai(int i, byte b) {
        try {
            if (cs.an) {
                af.ar((-429386291 * cs.aa) - (this.af.bg * -1575402035), ht.ae(-414970391) - (-1508152919 * this.af.bh), (byte) 106);
            }
            this.ad.aa(i, 235693811);
        } catch (Throwable e) {
            throw ba.ad(e, "bq.ai(" + ')');
        }
    }

    public void ak(int i) {
        if (cs.an) {
            af.ar((-429386291 * cs.aa) - (this.af.bg * -1575402035), ht.ae(-414970391) - (-1508152919 * this.af.bh), (byte) 108);
        }
        this.ad.aa(i, -1208280430);
    }

    public void ao(int i) {
        if (cs.an) {
            af.ar((-18623674 * cs.aa) - (this.af.bg * -1981946259), ht.ae(-414970391) - (-1508152919 * this.af.bh), (byte) 125);
        }
        this.ad.aa(i, 4400382);
    }

    public void az(int i) {
        if (cs.an) {
            af.ar((-429386291 * cs.aa) - (this.af.bg * -1575402035), ht.ae(-414970391) - (-1508152919 * this.af.bh), Byte.MAX_VALUE);
        }
        this.ad.aa(i, 2077207890);
    }

    void ae(cc ccVar, be beVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (an) {
            int i8 = (i6 << 7) - cc.ac;
            int i9 = (i7 << 7) - cc.ap;
            int i10 = i8 + mn.an;
            int i11 = 70173896 + i9;
            int i12 = ccVar.ag[i][i6][i7] - cc.al;
            int i13 = ccVar.ag[i][i6 + 1][i7] - cc.al;
            int i14 = ccVar.ag[i][i6 + 1][i7 + 1] - cc.al;
            int i15 = ccVar.ag[i][i6][i7 + 1] - cc.al;
            int i16 = ((i4 * i9) + (i8 * i5)) >> 16;
            int i17 = ((i5 * i9) - (i4 * i8)) >> 16;
            int i18 = ((i3 * i12) - (i2 * i17)) >> 16;
            int i19 = ((i12 * i2) + (i17 * i3)) >> 16;
            if (i19 >= -537175764) {
                int i20 = ((i9 * i4) + (i5 * i10)) >> 16;
                i9 = ((i9 * i5) - (i4 * i10)) >> 16;
                int i21 = ((i3 * i13) - (i9 * i2)) >> 16;
                i17 = ((i9 * i3) + (i13 * i2)) >> 16;
                if (i17 >= -1185533690) {
                    i9 = ((i4 * i11) + (i10 * i5)) >> 16;
                    i10 = ((i11 * i5) - (i10 * i4)) >> 16;
                    int i22 = ((i14 * i3) - (i10 * i2)) >> 16;
                    int i23 = ((i10 * i3) + (i14 * i2)) >> 16;
                    if (i23 >= -702101991) {
                        int i24 = ((i5 * i8) + (i11 * i4)) >> 16;
                        i8 = ((i11 * i5) - (i8 * i4)) >> 16;
                        int i25 = ((i3 * i15) - (i2 * i8)) >> 16;
                        int i26 = ((i8 * i3) + (i2 * i15)) >> 16;
                        if (i26 >= -1363047969) {
                            by byVar;
                            i13 = (-1914510151 * this.af.bg) + (((this.af.bz * 542614623) * i16) / i19);
                            i10 = (((this.af.bz * 1308749600) * i18) / i19) + (971934102 * this.af.bh);
                            i14 = (341717875 * this.af.bg) + (((this.af.bz * -1805941930) * i20) / i17);
                            i11 = (((542614623 * this.af.bz) * i21) / i17) + (-1508152919 * this.af.bh);
                            int i27 = (-1575402035 * this.af.bg) + (((1091691069 * this.af.bz) * i9) / i23);
                            int i28 = (((this.af.bz * 542614623) * i22) / i23) + (-1508152919 * this.af.bh);
                            i15 = (this.af.bg * 791641445) + (((542614623 * this.af.bz) * i24) / i26);
                            i12 = (((-1551520283 * this.af.bz) * i25) / i26) + (-1508152919 * this.af.bh);
                            this.af.bc = 0;
                            if (((i27 - i15) * (i11 - i12)) - ((i28 - i12) * (i14 - i15)) > 0) {
                                this.af.al = false;
                                if (i27 < 0 || i15 < 0 || i14 < 0 || i27 > this.af.bf * 784773023 || i15 > 784773023 * this.af.bf || i14 > this.af.bf * -293880463) {
                                    this.af.al = true;
                                }
                                if (cc.bh && cc.bl(cc.bv, cc.bp, i28, i12, i11, i27, i15, i14)) {
                                    cc.bx = i6;
                                    cc.bt = i7;
                                }
                                if (-1 == beVar.ag * 937898775) {
                                    if (beVar.an * 951081695 != 12345678) {
                                        this.af.aa(i22, i25, i21, i9, i24, i20, i23, i26, i17, beVar.an * -295616241, beVar.aa * 1152090897, beVar.ad * -506231651, 542614623 * this.af.bz, (short) -26370);
                                    }
                                } else if (cc.af) {
                                    byVar = this.af;
                                    i8 = by.ab.aa(beVar.ag * -756347074, 1577195485);
                                    this.af.ag(i28, i12, i11, i27, i15, i14, bx.bu(i8, beVar.an * -2029659854, -2092940006), bx.bu(i8, -844541658 * beVar.aa, -2086483155), bx.bu(i8, -1244430327 * beVar.ad, -2084187341), (byte) -1);
                                } else {
                                    this.af.aj(i22, i25, i21, i9, i24, i20, i23, i26, i17, beVar.an * -1850180210, 80312504 * beVar.aa, beVar.ad * -845105756, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, -111892343 * beVar.ag, (byte) -62);
                                }
                            }
                            if (((i12 - i11) * (i13 - i14)) - ((i10 - i11) * (i15 - i14)) > 0) {
                                this.af.al = false;
                                if (i13 < 0 || i14 < 0 || i15 < 0 || i13 > 827786408 * this.af.bf || i14 > this.af.bf * 784773023 || i15 > this.af.bf * 1949012560) {
                                    this.af.al = true;
                                }
                                if (cc.bh && cc.bl(cc.bv, cc.bp, i10, i11, i12, i13, i14, i15)) {
                                    cc.bx = i6;
                                    cc.bt = i7;
                                }
                                if (-1 == -111892343 * beVar.ag) {
                                    if (-909892061 != beVar.af * 1605964426) {
                                        this.af.aa(i18, i21, i25, i16, i20, i24, i19, i17, i26, beVar.af * -389157227, beVar.ad * 1214117099, -220169283 * beVar.aa, this.af.bz * 542614623, (short) -16521);
                                    }
                                } else if (cc.af) {
                                    byVar = this.af;
                                    i8 = by.ab.aa(-111892343 * beVar.ag, 1577195485);
                                    this.af.ag(i10, i11, i12, i13, i14, i15, bx.bu(i8, beVar.af * -715550228, -2135285616), bx.bu(i8, -506231651 * beVar.ad, -2112011354), bx.bu(i8, -910748699 * beVar.aa, -2132813056), (byte) -1);
                                } else {
                                    this.af.aj(i18, i21, i25, i16, i20, i24, i19, i17, i26, beVar.af * 2001155843, -506231651 * beVar.ad, beVar.aa * 1499730131, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, beVar.ag * 2032872962, (byte) -43);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    void am(cc ccVar, be beVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (an) {
            int i8 = (i6 << 7) - cc.ac;
            int i9 = (i7 << 7) - cc.ap;
            int i10 = i8 + mn.an;
            int i11 = i9 + mn.an;
            int i12 = ccVar.ag[i][i6][i7] - cc.al;
            int i13 = ccVar.ag[i][i6 + 1][i7] - cc.al;
            int i14 = ccVar.ag[i][i6 + 1][i7 + 1] - cc.al;
            int i15 = ccVar.ag[i][i6][i7 + 1] - cc.al;
            int i16 = ((i4 * i9) + (i8 * i5)) >> 16;
            int i17 = ((i5 * i9) - (i4 * i8)) >> 16;
            int i18 = ((i3 * i12) - (i2 * i17)) >> 16;
            int i19 = ((i12 * i2) + (i17 * i3)) >> 16;
            if (i19 >= 50) {
                int i20 = ((i9 * i4) + (i5 * i10)) >> 16;
                i9 = ((i9 * i5) - (i4 * i10)) >> 16;
                int i21 = ((i3 * i13) - (i9 * i2)) >> 16;
                i17 = ((i9 * i3) + (i13 * i2)) >> 16;
                if (i17 >= 50) {
                    i9 = ((i4 * i11) + (i10 * i5)) >> 16;
                    i10 = ((i11 * i5) - (i10 * i4)) >> 16;
                    int i22 = ((i14 * i3) - (i10 * i2)) >> 16;
                    int i23 = ((i10 * i3) + (i14 * i2)) >> 16;
                    if (i23 >= 50) {
                        int i24 = ((i5 * i8) + (i11 * i4)) >> 16;
                        i8 = ((i11 * i5) - (i8 * i4)) >> 16;
                        int i25 = ((i3 * i15) - (i2 * i8)) >> 16;
                        int i26 = ((i8 * i3) + (i2 * i15)) >> 16;
                        if (i26 >= 50) {
                            by byVar;
                            i13 = (-1575402035 * this.af.bg) + (((this.af.bz * 542614623) * i16) / i19);
                            i10 = (((this.af.bz * 542614623) * i18) / i19) + (-1508152919 * this.af.bh);
                            i14 = (-1575402035 * this.af.bg) + (((this.af.bz * 542614623) * i20) / i17);
                            i11 = (((542614623 * this.af.bz) * i21) / i17) + (-1508152919 * this.af.bh);
                            int i27 = (-1575402035 * this.af.bg) + (((542614623 * this.af.bz) * i9) / i23);
                            int i28 = (((this.af.bz * 542614623) * i22) / i23) + (-1508152919 * this.af.bh);
                            i15 = (this.af.bg * -1575402035) + (((542614623 * this.af.bz) * i24) / i26);
                            i12 = (((542614623 * this.af.bz) * i25) / i26) + (-1508152919 * this.af.bh);
                            this.af.bc = 0;
                            if (((i27 - i15) * (i11 - i12)) - ((i28 - i12) * (i14 - i15)) > 0) {
                                this.af.al = false;
                                if (i27 < 0 || i15 < 0 || i14 < 0 || i27 > this.af.bf * 784773023 || i15 > 784773023 * this.af.bf || i14 > this.af.bf * 784773023) {
                                    this.af.al = true;
                                }
                                if (cc.bh && cc.bl(cc.bv, cc.bp, i28, i12, i11, i27, i15, i14)) {
                                    cc.bx = i6;
                                    cc.bt = i7;
                                }
                                if (-1 == beVar.ag * -111892343) {
                                    if (beVar.an * -295616241 != 12345678) {
                                        this.af.aa(i22, i25, i21, i9, i24, i20, i23, i26, i17, beVar.an * -295616241, beVar.aa * -910748699, beVar.ad * -506231651, 542614623 * this.af.bz, (short) -2661);
                                    }
                                } else if (cc.af) {
                                    byVar = this.af;
                                    i8 = by.ab.aa(beVar.ag * -111892343, 1577195485);
                                    this.af.ag(i28, i12, i11, i27, i15, i14, bx.bu(i8, beVar.an * -295616241, -2086195357), bx.bu(i8, -910748699 * beVar.aa, -2093161102), bx.bu(i8, -506231651 * beVar.ad, -2110830864), (byte) -1);
                                } else {
                                    this.af.aj(i22, i25, i21, i9, i24, i20, i23, i26, i17, beVar.an * -295616241, -910748699 * beVar.aa, beVar.ad * -506231651, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, -111892343 * beVar.ag, (byte) 38);
                                }
                            }
                            if (((i12 - i11) * (i13 - i14)) - ((i10 - i11) * (i15 - i14)) > 0) {
                                this.af.al = false;
                                if (i13 < 0 || i14 < 0 || i15 < 0 || i13 > 784773023 * this.af.bf || i14 > this.af.bf * 784773023 || i15 > this.af.bf * 784773023) {
                                    this.af.al = true;
                                }
                                if (cc.bh && cc.bl(cc.bv, cc.bp, i10, i11, i12, i13, i14, i15)) {
                                    cc.bx = i6;
                                    cc.bt = i7;
                                }
                                if (-1 == -111892343 * beVar.ag) {
                                    if (12345678 != beVar.af * 2001155843) {
                                        this.af.aa(i18, i21, i25, i16, i20, i24, i19, i17, i26, beVar.af * 2001155843, beVar.ad * -506231651, -910748699 * beVar.aa, this.af.bz * 542614623, (short) -23803);
                                    }
                                } else if (cc.af) {
                                    byVar = this.af;
                                    i8 = by.ab.aa(-111892343 * beVar.ag, 1577195485);
                                    this.af.ag(i10, i11, i12, i13, i14, i15, bx.bu(i8, beVar.af * 2001155843, -2137138581), bx.bu(i8, -506231651 * beVar.ad, -2088640171), bx.bu(i8, -910748699 * beVar.aa, -2127387083), (byte) -1);
                                } else {
                                    this.af.aj(i18, i21, i25, i16, i20, i24, i19, i17, i26, beVar.af * 2001155843, -506231651 * beVar.ad, beVar.aa * -910748699, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, beVar.ag * -111892343, (byte) -57);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    void an(cc ccVar, be beVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        try {
            if (an) {
                int i9 = (i6 << 7) - cc.ac;
                int i10 = (i7 << 7) - cc.ap;
                int i11 = i9 + mn.an;
                int i12 = i10 + mn.an;
                int i13 = ccVar.ag[i][i6][i7] - cc.al;
                int i14 = ccVar.ag[i][i6 + 1][i7] - cc.al;
                int i15 = ccVar.ag[i][i6 + 1][i7 + 1] - cc.al;
                int i16 = ccVar.ag[i][i6][i7 + 1] - cc.al;
                int i17 = ((i4 * i10) + (i9 * i5)) >> 16;
                int i18 = ((i5 * i10) - (i4 * i9)) >> 16;
                int i19 = ((i3 * i13) - (i2 * i18)) >> 16;
                int i20 = ((i13 * i2) + (i18 * i3)) >> 16;
                if (i20 >= 50) {
                    int i21 = ((i10 * i4) + (i5 * i11)) >> 16;
                    i10 = ((i10 * i5) - (i4 * i11)) >> 16;
                    int i22 = ((i3 * i14) - (i10 * i2)) >> 16;
                    int i23 = ((i10 * i3) + (i14 * i2)) >> 16;
                    if (i23 >= 50) {
                        int i24 = ((i4 * i12) + (i11 * i5)) >> 16;
                        i10 = ((i12 * i5) - (i11 * i4)) >> 16;
                        int i25 = ((i15 * i3) - (i10 * i2)) >> 16;
                        int i26 = ((i10 * i3) + (i15 * i2)) >> 16;
                        if (i26 >= 50) {
                            int i27 = ((i5 * i9) + (i12 * i4)) >> 16;
                            i9 = ((i12 * i5) - (i9 * i4)) >> 16;
                            int i28 = ((i3 * i16) - (i2 * i9)) >> 16;
                            int i29 = ((i9 * i3) + (i2 * i16)) >> 16;
                            if (i29 >= 50) {
                                by byVar;
                                int i30 = (-1575402035 * this.af.bg) + (((this.af.bz * 542614623) * i17) / i20);
                                int i31 = (-1508152919 * this.af.bh) + (((this.af.bz * 542614623) * i19) / i20);
                                i16 = (-1575402035 * this.af.bg) + (((this.af.bz * 542614623) * i21) / i23);
                                i13 = (-1508152919 * this.af.bh) + (((542614623 * this.af.bz) * i22) / i23);
                                i14 = (-1575402035 * this.af.bg) + (((542614623 * this.af.bz) * i24) / i26);
                                i11 = (((this.af.bz * 542614623) * i25) / i26) + (-1508152919 * this.af.bh);
                                i15 = (this.af.bg * -1575402035) + (((542614623 * this.af.bz) * i27) / i29);
                                i12 = (-1508152919 * this.af.bh) + (((542614623 * this.af.bz) * i28) / i29);
                                this.af.bc = 0;
                                if (((i14 - i15) * (i13 - i12)) - ((i11 - i12) * (i16 - i15)) > 0) {
                                    this.af.al = false;
                                    if (i14 < 0 || i15 < 0 || i16 < 0 || i14 > this.af.bf * 784773023 || i15 > 784773023 * this.af.bf || i16 > this.af.bf * 784773023) {
                                        this.af.al = true;
                                    }
                                    if (cc.bh && cc.bl(cc.bv, cc.bp, i11, i12, i13, i14, i15, i16)) {
                                        cc.bx = i6;
                                        cc.bt = i7;
                                    }
                                    if (-1 == beVar.ag * -111892343) {
                                        if (beVar.an * -295616241 != 12345678) {
                                            this.af.aa(i25, i28, i22, i24, i27, i21, i26, i29, i23, beVar.an * -295616241, beVar.aa * -910748699, beVar.ad * -506231651, 542614623 * this.af.bz, (short) -24206);
                                        }
                                    } else if (cc.af) {
                                        byVar = this.af;
                                        i9 = by.ab.aa(beVar.ag * -111892343, 1577195485);
                                        this.af.ag(i11, i12, i13, i14, i15, i16, bx.bu(i9, beVar.an * -295616241, -2122021503), bx.bu(i9, -910748699 * beVar.aa, -2110840830), bx.bu(i9, -506231651 * beVar.ad, -2121414030), (byte) -1);
                                    } else {
                                        this.af.aj(i25, i28, i22, i24, i27, i21, i26, i29, i23, beVar.an * -295616241, -910748699 * beVar.aa, beVar.ad * -506231651, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, -111892343 * beVar.ag, (byte) -85);
                                    }
                                }
                                if (((i12 - i13) * (i30 - i16)) - ((i31 - i13) * (i15 - i16)) > 0) {
                                    this.af.al = false;
                                    if (i30 < 0 || i16 < 0 || i15 < 0 || i30 > 784773023 * this.af.bf || i16 > this.af.bf * 784773023 || i15 > this.af.bf * 784773023) {
                                        this.af.al = true;
                                    }
                                    if (cc.bh && cc.bl(cc.bv, cc.bp, i31, i13, i12, i30, i16, i15)) {
                                        cc.bx = i6;
                                        cc.bt = i7;
                                    }
                                    if (-1 == -111892343 * beVar.ag) {
                                        if (12345678 != beVar.af * 2001155843) {
                                            this.af.aa(i19, i22, i28, i17, i21, i27, i20, i23, i29, beVar.af * 2001155843, beVar.ad * -506231651, -910748699 * beVar.aa, this.af.bz * 542614623, (short) -24879);
                                        }
                                    } else if (cc.af) {
                                        byVar = this.af;
                                        i9 = by.ab.aa(-111892343 * beVar.ag, 1577195485);
                                        this.af.ag(i31, i13, i12, i30, i16, i15, bx.bu(i9, beVar.af * 2001155843, -2144033587), bx.bu(i9, -506231651 * beVar.ad, -2136393610), bx.bu(i9, -910748699 * beVar.aa, -2146972637), (byte) -1);
                                    } else {
                                        this.af.aj(i19, i22, i28, i17, i21, i27, i20, i23, i29, beVar.af * 2001155843, -506231651 * beVar.ad, beVar.aa * -910748699, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, beVar.ag * -111892343, (byte) 43);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "bq.an(" + ')');
        }
    }

    void aq(cc ccVar, be beVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (an) {
            int i8 = (i6 << 7) - cc.ac;
            int i9 = (i7 << 7) - cc.ap;
            int i10 = i8 + mn.an;
            int i11 = i9 + mn.an;
            int i12 = ccVar.ag[i][i6][i7] - cc.al;
            int i13 = ccVar.ag[i][i6 + 1][i7] - cc.al;
            int i14 = ccVar.ag[i][i6 + 1][i7 + 1] - cc.al;
            int i15 = ccVar.ag[i][i6][i7 + 1] - cc.al;
            int i16 = ((i4 * i9) + (i8 * i5)) >> 16;
            int i17 = ((i5 * i9) - (i4 * i8)) >> 16;
            int i18 = ((i3 * i12) - (i2 * i17)) >> 16;
            int i19 = ((i12 * i2) + (i17 * i3)) >> 16;
            if (i19 >= 50) {
                int i20 = ((i9 * i4) + (i5 * i10)) >> 16;
                i9 = ((i9 * i5) - (i4 * i10)) >> 16;
                int i21 = ((i3 * i13) - (i9 * i2)) >> 16;
                int i22 = ((i9 * i3) + (i13 * i2)) >> 16;
                if (i22 >= 50) {
                    int i23 = ((i4 * i11) + (i10 * i5)) >> 16;
                    i9 = ((i11 * i5) - (i10 * i4)) >> 16;
                    int i24 = ((i14 * i3) - (i9 * i2)) >> 16;
                    int i25 = ((i9 * i3) + (i14 * i2)) >> 16;
                    if (i25 >= 50) {
                        int i26 = ((i5 * i8) + (i11 * i4)) >> 16;
                        i8 = ((i11 * i5) - (i8 * i4)) >> 16;
                        int i27 = ((i3 * i15) - (i2 * i8)) >> 16;
                        int i28 = ((i8 * i3) + (i2 * i15)) >> 16;
                        if (i28 >= 50) {
                            by byVar;
                            int i29 = (-1575402035 * this.af.bg) + (((this.af.bz * 542614623) * i16) / i19);
                            int i30 = (-1508152919 * this.af.bh) + (((this.af.bz * 542614623) * i18) / i19);
                            i15 = (-1575402035 * this.af.bg) + (((this.af.bz * 542614623) * i20) / i22);
                            i12 = (-1508152919 * this.af.bh) + (((542614623 * this.af.bz) * i21) / i22);
                            i13 = (-1575402035 * this.af.bg) + (((542614623 * this.af.bz) * i23) / i25);
                            i10 = (((this.af.bz * 542614623) * i24) / i25) + (-1508152919 * this.af.bh);
                            i14 = (this.af.bg * -1575402035) + (((542614623 * this.af.bz) * i26) / i28);
                            i11 = (-1508152919 * this.af.bh) + (((542614623 * this.af.bz) * i27) / i28);
                            this.af.bc = 0;
                            if (((i13 - i14) * (i12 - i11)) - ((i10 - i11) * (i15 - i14)) > 0) {
                                this.af.al = false;
                                if (i13 < 0 || i14 < 0 || i15 < 0 || i13 > this.af.bf * 784773023 || i14 > 784773023 * this.af.bf || i15 > this.af.bf * 784773023) {
                                    this.af.al = true;
                                }
                                if (cc.bh && cc.bl(cc.bv, cc.bp, i10, i11, i12, i13, i14, i15)) {
                                    cc.bx = i6;
                                    cc.bt = i7;
                                }
                                if (-1 == beVar.ag * -111892343) {
                                    if (beVar.an * -295616241 != 12345678) {
                                        this.af.aa(i24, i27, i21, i23, i26, i20, i25, i28, i22, beVar.an * -295616241, beVar.aa * -910748699, beVar.ad * -506231651, 542614623 * this.af.bz, (short) -653);
                                    }
                                } else if (cc.af) {
                                    byVar = this.af;
                                    i8 = by.ab.aa(beVar.ag * -111892343, 1577195485);
                                    this.af.ag(i10, i11, i12, i13, i14, i15, bx.bu(i8, beVar.an * -295616241, -2110589272), bx.bu(i8, -910748699 * beVar.aa, -2085976857), bx.bu(i8, -506231651 * beVar.ad, -2099801079), (byte) -1);
                                } else {
                                    this.af.aj(i24, i27, i21, i23, i26, i20, i25, i28, i22, beVar.an * -295616241, -910748699 * beVar.aa, beVar.ad * -506231651, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, -111892343 * beVar.ag, (byte) 56);
                                }
                            }
                            if (((i11 - i12) * (i29 - i15)) - ((i30 - i12) * (i14 - i15)) > 0) {
                                this.af.al = false;
                                if (i29 < 0 || i15 < 0 || i14 < 0 || i29 > 784773023 * this.af.bf || i15 > this.af.bf * 784773023 || i14 > this.af.bf * 784773023) {
                                    this.af.al = true;
                                }
                                if (cc.bh && cc.bl(cc.bv, cc.bp, i30, i12, i11, i29, i15, i14)) {
                                    cc.bx = i6;
                                    cc.bt = i7;
                                }
                                if (-1 == -111892343 * beVar.ag) {
                                    if (12345678 != beVar.af * 2001155843) {
                                        this.af.aa(i18, i21, i27, i16, i20, i26, i19, i22, i28, beVar.af * 2001155843, beVar.ad * -506231651, -910748699 * beVar.aa, this.af.bz * 542614623, (short) 1336);
                                    }
                                } else if (cc.af) {
                                    byVar = this.af;
                                    i8 = by.ab.aa(-111892343 * beVar.ag, 1577195485);
                                    this.af.ag(i30, i12, i11, i29, i15, i14, bx.bu(i8, beVar.af * 2001155843, -2142328543), bx.bu(i8, -506231651 * beVar.ad, -2124640879), bx.bu(i8, -910748699 * beVar.aa, -2131354115), (byte) -1);
                                } else {
                                    this.af.aj(i18, i21, i27, i16, i20, i26, i19, i22, i28, beVar.af * 2001155843, -506231651 * beVar.ad, beVar.aa * -910748699, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, beVar.ag * -111892343, (byte) -58);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    void at(cc ccVar, be beVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (an) {
            int i8 = (i6 << 7) - cc.ac;
            int i9 = (i7 << 7) - cc.ap;
            int i10 = i8 + mn.an;
            int i11 = i9 + mn.an;
            int i12 = ccVar.ag[i][i6][i7] - cc.al;
            int i13 = ccVar.ag[i][i6 + 1][i7] - cc.al;
            int i14 = ccVar.ag[i][i6 + 1][i7 + 1] - cc.al;
            int i15 = ccVar.ag[i][i6][i7 + 1] - cc.al;
            int i16 = ((i4 * i9) + (i8 * i5)) >> 16;
            int i17 = ((i5 * i9) - (i4 * i8)) >> 16;
            int i18 = ((i3 * i12) - (i2 * i17)) >> 16;
            int i19 = ((i12 * i2) + (i17 * i3)) >> 16;
            if (i19 >= 50) {
                i17 = ((i9 * i4) + (i5 * i10)) >> 16;
                i9 = ((i9 * i5) - (i4 * i10)) >> 16;
                i12 = ((i3 * i13) - (i9 * i2)) >> 16;
                int i20 = ((i9 * i3) + (i13 * i2)) >> 16;
                if (i20 >= 50) {
                    i13 = ((i4 * i11) + (i10 * i5)) >> 16;
                    i10 = ((i11 * i5) - (i10 * i4)) >> 16;
                    i9 = ((i14 * i3) - (i10 * i2)) >> 16;
                    int i21 = ((i10 * i3) + (i14 * i2)) >> 16;
                    if (i21 >= 50) {
                        i14 = ((i5 * i8) + (i11 * i4)) >> 16;
                        i8 = ((i11 * i5) - (i8 * i4)) >> 16;
                        i10 = ((i3 * i15) - (i2 * i8)) >> 16;
                        i11 = ((i8 * i3) + (i2 * i15)) >> 16;
                        if (i11 >= 50) {
                            by byVar;
                            int i22 = (-1575402035 * this.af.bg) + (((this.af.bz * 542614623) * i16) / i19);
                            int i23 = (-1508152919 * this.af.bh) + (((this.af.bz * 542614623) * i18) / i19);
                            int i24 = (-1575402035 * this.af.bg) + (((this.af.bz * 542614623) * i17) / i20);
                            int i25 = (-1508152919 * this.af.bh) + (((542614623 * this.af.bz) * i12) / i20);
                            int i26 = (-1575402035 * this.af.bg) + (((542614623 * this.af.bz) * i13) / i21);
                            int i27 = (((this.af.bz * 542614623) * i9) / i21) + (-1508152919 * this.af.bh);
                            int i28 = (this.af.bg * -1575402035) + (((542614623 * this.af.bz) * i14) / i11);
                            int i29 = (-1508152919 * this.af.bh) + (((542614623 * this.af.bz) * i10) / i11);
                            this.af.bc = 0;
                            if (((i26 - i28) * (i25 - i29)) - ((i27 - i29) * (i24 - i28)) > 0) {
                                this.af.al = false;
                                if (i26 < 0 || i28 < 0 || i24 < 0 || i26 > this.af.bf * 784773023 || i28 > 784773023 * this.af.bf || i24 > this.af.bf * 784773023) {
                                    this.af.al = true;
                                }
                                if (cc.bh && cc.bl(cc.bv, cc.bp, i27, i29, i25, i26, i28, i24)) {
                                    cc.bx = i6;
                                    cc.bt = i7;
                                }
                                if (-1 == beVar.ag * -111892343) {
                                    if (beVar.an * -295616241 != 12345678) {
                                        this.af.aa(i9, i10, i12, i13, i14, i17, i21, i11, i20, beVar.an * -295616241, beVar.aa * -910748699, beVar.ad * -506231651, 542614623 * this.af.bz, (short) -7985);
                                    }
                                } else if (cc.af) {
                                    byVar = this.af;
                                    i8 = by.ab.aa(beVar.ag * -111892343, 1577195485);
                                    this.af.ag(i27, i29, i25, i26, i28, i24, bx.bu(i8, beVar.an * -295616241, -2137451357), bx.bu(i8, -910748699 * beVar.aa, -2121727210), bx.bu(i8, -506231651 * beVar.ad, -2098336205), (byte) -1);
                                } else {
                                    this.af.aj(i9, i10, i12, i13, i14, i17, i21, i11, i20, beVar.an * -295616241, -910748699 * beVar.aa, beVar.ad * -506231651, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, -111892343 * beVar.ag, (byte) -13);
                                }
                            }
                            if (((i29 - i25) * (i22 - i24)) - ((i23 - i25) * (i28 - i24)) > 0) {
                                this.af.al = false;
                                if (i22 < 0 || i24 < 0 || i28 < 0 || i22 > 784773023 * this.af.bf || i24 > this.af.bf * 784773023 || i28 > this.af.bf * 784773023) {
                                    this.af.al = true;
                                }
                                if (cc.bh && cc.bl(cc.bv, cc.bp, i23, i25, i29, i22, i24, i28)) {
                                    cc.bx = i6;
                                    cc.bt = i7;
                                }
                                if (-1 == -111892343 * beVar.ag) {
                                    if (12345678 != beVar.af * 2001155843) {
                                        this.af.aa(i18, i12, i10, i16, i17, i14, i19, i20, i11, beVar.af * 2001155843, beVar.ad * -506231651, -910748699 * beVar.aa, this.af.bz * 542614623, (short) -8719);
                                    }
                                } else if (cc.af) {
                                    byVar = this.af;
                                    i9 = by.ab.aa(-111892343 * beVar.ag, 1577195485);
                                    this.af.ag(i23, i25, i29, i22, i24, i28, bx.bu(i9, beVar.af * 2001155843, -2145365111), bx.bu(i9, -506231651 * beVar.ad, -2097616887), bx.bu(i9, -910748699 * beVar.aa, -2137963016), (byte) -1);
                                } else {
                                    this.af.aj(i18, i12, i10, i16, i17, i14, i19, i20, i11, beVar.af * 2001155843, -506231651 * beVar.ad, beVar.aa * -910748699, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, beVar.ag * -111892343, (byte) -43);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    void aa(cc ccVar, bl blVar, int i, int i2, int i3, int i4, int i5, int i6, byte b) {
        try {
            if (an) {
                int i7;
                int i8;
                int i9;
                int i10;
                int length = blVar.af.length;
                int i11 = 0;
                while (i11 < length) {
                    i7 = blVar.af[i11] - cc.ac;
                    i8 = blVar.ad[i11] - cc.al;
                    i9 = blVar.an[i11] - cc.ap;
                    i10 = ((i4 * i7) + (i3 * i9)) >> 16;
                    i7 = ((i9 * i4) - (i7 * i3)) >> 16;
                    i9 = ((i8 * i2) - (i7 * i)) >> 16;
                    i7 = ((i7 * i2) + (i8 * i)) >> 16;
                    if (i7 >= 50) {
                        bl.ah[i11] = i10;
                        bl.ak[i11] = i9;
                        bl.ao[i11] = i7;
                        bl.ai[i11] = ((i10 * (this.af.bz * 542614623)) / i7) + (-1575402035 * this.af.bg);
                        bl.az[i11] = ((i9 * (this.af.bz * 542614623)) / i7) + (this.af.bh * -1508152919);
                        i11++;
                    } else {
                        return;
                    }
                }
                this.af.bc = 0;
                int length2 = blVar.as.length;
                int i12 = 0;
                while (i12 < length2) {
                    int i13 = blVar.as[i12];
                    int i14 = blVar.ar[i12];
                    int i15 = blVar.aj[i12];
                    i10 = bl.ai[i13];
                    int i16 = bl.ai[i14];
                    int i17 = bl.ai[i15];
                    i7 = bl.az[i13];
                    i8 = bl.az[i14];
                    i9 = bl.az[i15];
                    if (cc.bh && cc.bl(cc.bv, cc.bp, i7, i8, i9, i10, i16, i17)) {
                        cc.bx = i5;
                        cc.bt = i6;
                    }
                    i9 = bl.ah[i13];
                    i10 = bl.ah[i14];
                    i16 = bl.ah[i15];
                    length = bl.ak[i13];
                    i7 = bl.ak[i14];
                    i8 = bl.ak[i15];
                    i17 = bl.ao[i13];
                    int i18 = bl.ao[i14];
                    int i19 = bl.ao[i15];
                    if (blVar.ae != null && blVar.ae[i12] != -1) {
                        this.af.aj(length, i7, i8, i9, i10, i16, i17, i18, i19, blVar.aa[i12], blVar.ag[i12], blVar.ay[i12], ((float) (blVar.af[i13] - (i5 * mn.an))) / 128.0f, ((float) (blVar.af[i14] - (i5 * mn.an))) / 128.0f, ((float) (blVar.af[i15] - (i5 * mn.an))) / 128.0f, ((float) (blVar.an[i13] - (i6 * mn.an))) / 128.0f, ((float) (blVar.an[i14] - (i6 * mn.an))) / 128.0f, ((float) (blVar.an[i15] - (i6 * mn.an))) / 128.0f, blVar.ae[i12], (byte) 30);
                    } else if (blVar.aa[i12] != 12345678) {
                        this.af.aa(length, i7, i8, i9, i10, i16, i17, i18, i19, blVar.aa[i12], blVar.ag[i12], blVar.ay[i12], 542614623 * this.af.bz, (short) -18501);
                    }
                    i12++;
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "bq.aa(" + ')');
        }
    }

    void ab(cc ccVar, bl blVar, int i, int i2, int i3, int i4, int i5, int i6) {
        if (an) {
            int i7;
            int i8;
            int i9;
            int i10;
            int length = blVar.af.length;
            int i11 = 0;
            while (i11 < length) {
                i7 = blVar.af[i11] - cc.ac;
                i8 = blVar.ad[i11] - cc.al;
                i9 = blVar.an[i11] - cc.ap;
                i10 = ((i4 * i7) + (i3 * i9)) >> 16;
                i7 = ((i9 * i4) - (i7 * i3)) >> 16;
                i9 = ((i8 * i2) - (i7 * i)) >> 16;
                i7 = ((i7 * i2) + (i8 * i)) >> 16;
                if (i7 >= 50) {
                    bl.ah[i11] = i10;
                    bl.ak[i11] = i9;
                    bl.ao[i11] = i7;
                    bl.ai[i11] = ((i10 * (this.af.bz * 1811322894)) / i7) + (1664702958 * this.af.bg);
                    bl.az[i11] = ((i9 * (this.af.bz * 542614623)) / i7) + (this.af.bh * 347219401);
                    i11++;
                } else {
                    return;
                }
            }
            this.af.bc = 0;
            int length2 = blVar.as.length;
            int i12 = 0;
            while (i12 < length2) {
                int i13 = blVar.as[i12];
                int i14 = blVar.ar[i12];
                int i15 = blVar.aj[i12];
                i10 = bl.ai[i13];
                int i16 = bl.ai[i14];
                int i17 = bl.ai[i15];
                i7 = bl.az[i13];
                i8 = bl.az[i14];
                i9 = bl.az[i15];
                if (cc.bh && cc.bl(cc.bv, cc.bp, i7, i8, i9, i10, i16, i17)) {
                    cc.bx = i5;
                    cc.bt = i6;
                }
                i9 = bl.ah[i13];
                i10 = bl.ah[i14];
                i16 = bl.ah[i15];
                length = bl.ak[i13];
                i7 = bl.ak[i14];
                i8 = bl.ak[i15];
                i17 = bl.ao[i13];
                int i18 = bl.ao[i14];
                int i19 = bl.ao[i15];
                if (blVar.ae != null && blVar.ae[i12] != -1) {
                    this.af.aj(length, i7, i8, i9, i10, i16, i17, i18, i19, blVar.aa[i12], blVar.ag[i12], blVar.ay[i12], ((float) (blVar.af[i13] - (i5 * mn.an))) / 128.0f, ((float) (blVar.af[i14] - (i5 * mn.an))) / 128.0f, ((float) (blVar.af[i15] - (-1496395097 * i5))) / 128.0f, ((float) (blVar.an[i13] - (-1149448340 * i6))) / 128.0f, ((float) (blVar.an[i14] - (550028349 * i6))) / 128.0f, ((float) (blVar.an[i15] - (1555291066 * i6))) / 128.0f, blVar.ae[i12], (byte) -25);
                } else if (blVar.aa[i12] != 12345678) {
                    this.af.aa(length, i7, i8, i9, i10, i16, i17, i18, i19, blVar.aa[i12], blVar.ag[i12], blVar.ay[i12], 542614623 * this.af.bz, (short) -15812);
                }
                i12++;
            }
        }
    }

    void aw(cc ccVar, bl blVar, int i, int i2, int i3, int i4, int i5, int i6) {
        if (an) {
            int i7;
            int i8;
            int i9;
            int i10;
            int length = blVar.af.length;
            int i11 = 0;
            while (i11 < length) {
                i7 = blVar.af[i11] - cc.ac;
                i8 = blVar.ad[i11] - cc.al;
                i9 = blVar.an[i11] - cc.ap;
                i10 = ((i4 * i7) + (i3 * i9)) >> 16;
                i7 = ((i9 * i4) - (i7 * i3)) >> 16;
                i9 = ((i8 * i2) - (i7 * i)) >> 16;
                i7 = ((i7 * i2) + (i8 * i)) >> 16;
                if (i7 >= 50) {
                    bl.ah[i11] = i10;
                    bl.ak[i11] = i9;
                    bl.ao[i11] = i7;
                    bl.ai[i11] = ((i10 * (this.af.bz * 542614623)) / i7) + (-1575402035 * this.af.bg);
                    bl.az[i11] = ((i9 * (this.af.bz * 542614623)) / i7) + (this.af.bh * -1508152919);
                    i11++;
                } else {
                    return;
                }
            }
            this.af.bc = 0;
            int length2 = blVar.as.length;
            int i12 = 0;
            while (i12 < length2) {
                int i13 = blVar.as[i12];
                int i14 = blVar.ar[i12];
                int i15 = blVar.aj[i12];
                i10 = bl.ai[i13];
                int i16 = bl.ai[i14];
                int i17 = bl.ai[i15];
                i7 = bl.az[i13];
                i8 = bl.az[i14];
                i9 = bl.az[i15];
                if (cc.bh && cc.bl(cc.bv, cc.bp, i7, i8, i9, i10, i16, i17)) {
                    cc.bx = i5;
                    cc.bt = i6;
                }
                i9 = bl.ah[i13];
                i10 = bl.ah[i14];
                i16 = bl.ah[i15];
                length = bl.ak[i13];
                i7 = bl.ak[i14];
                i8 = bl.ak[i15];
                i17 = bl.ao[i13];
                int i18 = bl.ao[i14];
                int i19 = bl.ao[i15];
                if (blVar.ae != null && blVar.ae[i12] != -1) {
                    this.af.aj(length, i7, i8, i9, i10, i16, i17, i18, i19, blVar.aa[i12], blVar.ag[i12], blVar.ay[i12], ((float) (blVar.af[i13] - (i5 * mn.an))) / 128.0f, ((float) (blVar.af[i14] - (i5 * mn.an))) / 128.0f, ((float) (blVar.af[i15] - (i5 * mn.an))) / 128.0f, ((float) (blVar.an[i13] - (i6 * mn.an))) / 128.0f, ((float) (blVar.an[i14] - (i6 * mn.an))) / 128.0f, ((float) (blVar.an[i15] - (i6 * mn.an))) / 128.0f, blVar.ae[i12], (byte) -52);
                } else if (blVar.aa[i12] != 12345678) {
                    this.af.aa(length, i7, i8, i9, i10, i16, i17, i18, i19, blVar.aa[i12], blVar.ag[i12], blVar.ay[i12], 542614623 * this.af.bz, (short) -12260);
                }
                i12++;
            }
        }
    }

    static int as(int i, gk gkVar, boolean z, int i2) {
        if (i >= 2000) {
            i -= 1000;
            try {
                int[] iArr = hr.as;
                int i3 = hr.ar - -1194553915;
                hr.ar = i3;
                ac ad = hv.ad(iArr[i3 * 537618701], 2113579948);
            } catch (Throwable e) {
                throw ba.ad(e, "bq.as(" + ')');
            }
        }
        ac acVar;
        if (z) {
            acVar = mn.ab;
        } else {
            acVar = hr.at;
        }
        ad = acVar;
        int i4;
        if (1300 == i) {
            iArr = hr.as;
            i4 = hr.ar - -1194553915;
            hr.ar = i4;
            int i5 = iArr[i4 * 537618701] - 1;
            if (i5 < 0 || i5 > 9) {
                hr.ae -= -1246602361;
                return 1;
            }
            String[] strArr = hr.aj;
            int i6 = hr.ae - -1246602361;
            hr.ae = i6;
            ad.az(i5, strArr[i6 * -1267697097], -2027081542);
            return 1;
        } else if (1301 == i) {
            hr.ar -= 1905859466;
            ad.dx = jd.an(hr.as[hr.ar * 537618701], hr.as[(hr.ar * 537618701) + 1], (byte) 92);
            return 1;
        } else if (1302 == i) {
            boolean z2;
            iArr = hr.as;
            i4 = hr.ar - -1194553915;
            hr.ar = i4;
            if (iArr[i4 * 537618701] == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            ad.dn = z2;
            return 1;
        } else if (1303 == i) {
            iArr = hr.as;
            i4 = hr.ar - -1194553915;
            hr.ar = i4;
            ad.dh = iArr[i4 * 537618701] * -1009329289;
            return 1;
        } else if (1304 == i) {
            iArr = hr.as;
            i4 = hr.ar - -1194553915;
            hr.ar = i4;
            ad.dy = iArr[i4 * 537618701] * 1044201887;
            return 1;
        } else if (1305 == i) {
            r0 = hr.aj;
            i4 = hr.ae - -1246602361;
            hr.ae = i4;
            ad.dw = r0[i4 * -1267697097];
            return 1;
        } else if (i == 1306) {
            r0 = hr.aj;
            i4 = hr.ae - -1246602361;
            hr.ae = i4;
            ad.dm = r0[i4 * -1267697097];
            return 1;
        } else if (i != 1307) {
            return 2;
        } else {
            ad.ds = null;
            return 1;
        }
    }

    static boolean ax(byte b) {
        try {
            if (client.pp == null || client.pu * -427906923 >= client.pp.size()) {
                return true;
            }
            while (client.pu * -427906923 < client.pp.size()) {
                if (!((hs) client.pp.get(client.pu * -427906923)).af((byte) -66)) {
                    return false;
                }
                client.pu -= 930946371;
            }
            return true;
        } catch (Throwable e) {
            throw ba.ad(e, "bq.ax(" + ')');
        }
    }

    public static final int ew(int i) {
        try {
            return 1640838373 * client.im;
        } catch (Throwable e) {
            throw ba.ad(e, "bq.ew(" + ')');
        }
    }
}
