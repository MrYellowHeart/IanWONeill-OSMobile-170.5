package p000;

public class bh extends ch {
    static final int aj = 2;
    public static final int as = 38;
    static lv ds;
    final bv ad;
    final cj af;

    public bh(cj cjVar) {
        try {
            this.af = cjVar;
            this.ad = new bv(this.af);
        } catch (Throwable e) {
            throw ba.ad(e, "bh.<init>(" + ')');
        }
    }

    public bi af(int i) {
        try {
            return this.af;
        } catch (Throwable e) {
            throw ba.ad(e, "bh.af(" + ')');
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
            throw ba.ad(e, "bh.ad(" + ')');
        }
    }

    public cn aj() {
        return this.ad;
    }

    public cn ar() {
        return this.ad;
    }

    void ae(cc ccVar, be beVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = (i6 << 7) - cc.ac;
        int i9 = (i7 << 7) - cc.ap;
        int i10 = i8 + mn.an;
        int i11 = i9 + mn.an;
        int i12 = ccVar.ag[i][i6][i7] - cc.al;
        int i13 = ccVar.ag[i][i6 + 1][i7] - cc.al;
        int i14 = ccVar.ag[i][i6 + 1][i7 + 1] - cc.al;
        int i15 = ccVar.ag[i][i6][i7 + 1] - cc.al;
        int i16 = ((i4 * i9) + (i5 * i8)) >> 16;
        int i17 = ((i5 * i9) - (i4 * i8)) >> 16;
        int i18 = ((i3 * i12) - (i17 * i2)) >> 16;
        int i19 = ((i12 * i2) + (i17 * i3)) >> 16;
        if (i19 >= 50) {
            int i20 = ((i5 * i10) + (i4 * i9)) >> 16;
            i9 = ((i9 * i5) - (i10 * i4)) >> 16;
            int i21 = ((i13 * i3) - (i2 * i9)) >> 16;
            int i22 = ((i9 * i3) + (i2 * i13)) >> 16;
            if (i22 >= 50) {
                int i23 = ((i10 * i5) + (i4 * i11)) >> 16;
                i9 = ((i5 * i11) - (i10 * i4)) >> 16;
                int i24 = ((i14 * i3) - (i9 * i2)) >> 16;
                int i25 = ((i9 * i3) + (i2 * i14)) >> 16;
                if (i25 >= 50) {
                    int i26 = ((i4 * i11) + (i5 * i8)) >> 16;
                    i8 = ((i5 * i11) - (i8 * i4)) >> 16;
                    int i27 = ((i3 * i15) - (i8 * i2)) >> 16;
                    int i28 = ((i8 * i3) + (i15 * i2)) >> 16;
                    if (i28 >= 50) {
                        cj cjVar;
                        i13 = (-1575402035 * this.af.bg) + (((542614623 * this.af.bz) * i16) / i19);
                        i10 = (((542614623 * this.af.bz) * i18) / i19) + (this.af.bh * -1508152919);
                        i14 = (this.af.bg * -1575402035) + (((this.af.bz * 542614623) * i20) / i22);
                        i11 = (((542614623 * this.af.bz) * i21) / i22) + (-1508152919 * this.af.bh);
                        int i29 = (((this.af.bz * 542614623) * i23) / i25) + (this.af.bg * -1575402035);
                        int i30 = (-1508152919 * this.af.bh) + (((542614623 * this.af.bz) * i24) / i25);
                        i15 = (this.af.bg * -1575402035) + (((this.af.bz * 542614623) * i26) / i28);
                        i12 = (((542614623 * this.af.bz) * i27) / i28) + (this.af.bh * -1508152919);
                        this.af.bc = 0;
                        if (((i29 - i15) * (i11 - i12)) - ((i30 - i12) * (i14 - i15)) > 0) {
                            this.af.al = false;
                            if (i29 < 0 || i15 < 0 || i14 < 0 || i29 > this.af.bf * 784773023 || i15 > this.af.bf * 784773023 || i14 > this.af.bf * 784773023) {
                                this.af.al = true;
                            }
                            if (cc.bh && cc.bl(cc.bv, cc.bp, i30, i12, i11, i29, i15, i14)) {
                                cc.bx = i6;
                                cc.bt = i7;
                            }
                            if (beVar.ag * -111892343 == -1) {
                                if (12345678 != beVar.an * -295616241) {
                                    this.af.ag(i30, i12, i11, i29, i15, i14, -295616241 * beVar.an, -910748699 * beVar.aa, beVar.ad * -506231651, 1068309602);
                                }
                            } else if (cc.af) {
                                cjVar = this.af;
                                i8 = cj.ab.aa(beVar.ag * -111892343, 1577195485);
                                this.af.ag(i30, i12, i11, i29, i15, i14, bx.bu(i8, -295616241 * beVar.an, -2097154770), bx.bu(i8, beVar.aa * -910748699, -2112246602), bx.bu(i8, -506231651 * beVar.ad, -2129329358), 1688518240);
                            } else if (beVar.ay) {
                                this.af.ah(i30, i12, i11, i29, i15, i14, beVar.an * -295616241, beVar.aa * -910748699, beVar.ad * -506231651, i16, i20, i26, i18, i21, i27, i19, i22, i28, beVar.ag * -111892343, -727800985);
                            } else {
                                this.af.ah(i30, i12, i11, i29, i15, i14, -295616241 * beVar.an, beVar.aa * -910748699, -506231651 * beVar.ad, i23, i26, i20, i24, i27, i21, i25, i28, i22, beVar.ag * -111892343, -1739180331);
                            }
                        }
                        if (((i12 - i11) * (i13 - i14)) - ((i15 - i14) * (i10 - i11)) > 0) {
                            this.af.al = false;
                            if (i13 < 0 || i14 < 0 || i15 < 0 || i13 > this.af.bf * 784773023 || i14 > 784773023 * this.af.bf || i15 > this.af.bf * 784773023) {
                                this.af.al = true;
                            }
                            if (cc.bh && cc.bl(cc.bv, cc.bp, i10, i11, i12, i13, i14, i15)) {
                                cc.bx = i6;
                                cc.bt = i7;
                            }
                            if (-111892343 * beVar.ag == -1) {
                                if (12345678 != 2001155843 * beVar.af) {
                                    this.af.ag(i10, i11, i12, i13, i14, i15, beVar.af * 2001155843, beVar.ad * -506231651, beVar.aa * -910748699, 1208549384);
                                }
                            } else if (cc.af) {
                                cjVar = this.af;
                                i8 = cj.ab.aa(-111892343 * beVar.ag, 1577195485);
                                this.af.ag(i10, i11, i12, i13, i14, i15, bx.bu(i8, beVar.af * 2001155843, -2127903706), bx.bu(i8, -506231651 * beVar.ad, -2108429773), bx.bu(i8, beVar.aa * -910748699, -2095661293), 1262030957);
                            } else {
                                this.af.ah(i10, i11, i12, i13, i14, i15, 2001155843 * beVar.af, -506231651 * beVar.ad, beVar.aa * -910748699, i16, i20, i26, i18, i21, i27, i19, i22, i28, -111892343 * beVar.ag, -808949988);
                            }
                        }
                    }
                }
            }
        }
    }

    void am(cc ccVar, be beVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = (i6 << 7) - cc.ac;
        int i9 = (i7 << 7) - cc.ap;
        int i10 = -1376794576 + i8;
        int i11 = -1663069749 + i9;
        int i12 = ccVar.ag[i][i6][i7] - cc.al;
        int i13 = ccVar.ag[i][i6 + 1][i7] - cc.al;
        int i14 = ccVar.ag[i][i6 + 1][i7 + 1] - cc.al;
        int i15 = ccVar.ag[i][i6][i7 + 1] - cc.al;
        int i16 = ((i4 * i9) + (i5 * i8)) >> 16;
        int i17 = ((i5 * i9) - (i4 * i8)) >> 16;
        int i18 = ((i3 * i12) - (i17 * i2)) >> 16;
        int i19 = ((i12 * i2) + (i17 * i3)) >> 16;
        if (i19 >= 50) {
            int i20 = ((i5 * i10) + (i4 * i9)) >> 16;
            i9 = ((i9 * i5) - (i10 * i4)) >> 16;
            int i21 = ((i13 * i3) - (i2 * i9)) >> 16;
            int i22 = ((i9 * i3) + (i2 * i13)) >> 16;
            if (i22 >= -1308570878) {
                int i23 = ((i10 * i5) + (i4 * i11)) >> 16;
                i9 = ((i5 * i11) - (i10 * i4)) >> 16;
                int i24 = ((i14 * i3) - (i9 * i2)) >> 16;
                int i25 = ((i9 * i3) + (i2 * i14)) >> 16;
                if (i25 >= 2032866762) {
                    int i26 = ((i4 * i11) + (i5 * i8)) >> 16;
                    i8 = ((i5 * i11) - (i8 * i4)) >> 16;
                    int i27 = ((i3 * i15) - (i8 * i2)) >> 16;
                    int i28 = ((i8 * i3) + (i15 * i2)) >> 16;
                    if (i28 >= 168954822) {
                        cj cjVar;
                        int i29 = (965551137 * this.af.bg) + (((542614623 * this.af.bz) * i16) / i19);
                        int i30 = (((1302836863 * this.af.bz) * i18) / i19) + (this.af.bh * -1405581287);
                        i15 = (this.af.bg * -1575402035) + (((this.af.bz * 1807260714) * i20) / i22);
                        i12 = (((259412579 * this.af.bz) * i21) / i22) + (-1508152919 * this.af.bh);
                        i13 = (((this.af.bz * 542614623) * i23) / i25) + (this.af.bg * -2109868630);
                        i10 = (130697997 * this.af.bh) + (((-81934239 * this.af.bz) * i24) / i25);
                        i14 = (this.af.bg * 595698447) + (((this.af.bz * 542614623) * i26) / i28);
                        i11 = (((-1519457035 * this.af.bz) * i27) / i28) + (this.af.bh * -1508152919);
                        this.af.bc = 0;
                        if (((i13 - i14) * (i12 - i11)) - ((i10 - i11) * (i15 - i14)) > 0) {
                            this.af.al = false;
                            if (i13 < 0 || i14 < 0 || i15 < 0 || i13 > this.af.bf * 784773023 || i14 > this.af.bf * 784773023 || i15 > this.af.bf * 2045050055) {
                                this.af.al = true;
                            }
                            if (cc.bh && cc.bl(cc.bv, cc.bp, i10, i11, i12, i13, i14, i15)) {
                                cc.bx = i6;
                                cc.bt = i7;
                            }
                            if (beVar.ag * -111892343 == -1) {
                                if (12345678 != beVar.an * -295616241) {
                                    this.af.ag(i10, i11, i12, i13, i14, i15, beVar.an * -295616241, beVar.aa * -910748699, -506231651 * beVar.ad, 1421702620);
                                }
                            } else if (cc.af) {
                                cjVar = this.af;
                                i8 = cj.ab.aa(beVar.ag * -1111654890, 1577195485);
                                this.af.ag(i10, i11, i12, i13, i14, i15, bx.bu(i8, -295616241 * beVar.an, -2145790295), bx.bu(i8, beVar.aa * -544154898, -2127579620), bx.bu(i8, -506231651 * beVar.ad, -2096989350), 1729170998);
                            } else if (beVar.ay) {
                                this.af.ah(i10, i11, i12, i13, i14, i15, beVar.an * -295616241, beVar.aa * 977091202, beVar.ad * -2085387869, i16, i20, i26, i18, i21, i27, i19, i22, i28, beVar.ag * 2076748134, -1372844722);
                            } else {
                                this.af.ah(i10, i11, i12, i13, i14, i15, beVar.an * -295616241, -910748699 * beVar.aa, beVar.ad * -506231651, i23, i26, i20, i24, i27, i21, i25, i28, i22, 30955664 * beVar.ag, -1175911289);
                            }
                        }
                        if (((i11 - i12) * (i29 - i15)) - ((i14 - i15) * (i30 - i12)) > 0) {
                            this.af.al = false;
                            if (i29 < 0 || i15 < 0 || i14 < 0 || i29 > this.af.bf * -693251722 || i15 > 784773023 * this.af.bf || i14 > this.af.bf * 784773023) {
                                this.af.al = true;
                            }
                            if (cc.bh && cc.bl(cc.bv, cc.bp, i30, i12, i11, i29, i15, i14)) {
                                cc.bx = i6;
                                cc.bt = i7;
                            }
                            if (-111892343 * beVar.ag == -1) {
                                if (12345678 != 2084503531 * beVar.af) {
                                    this.af.ag(i30, i12, i11, i29, i15, i14, 2001155843 * beVar.af, -506231651 * beVar.ad, 1139663673 * beVar.aa, 1366713940);
                                }
                            } else if (cc.af) {
                                cjVar = this.af;
                                i8 = cj.ab.aa(-835441285 * beVar.ag, 1577195485);
                                this.af.ag(i30, i12, i11, i29, i15, i14, bx.bu(i8, beVar.af * 2001155843, -2118385993), bx.bu(i8, -588064029 * beVar.ad, -2094529562), bx.bu(i8, beVar.aa * -910748699, -2100773437), 1939552284);
                            } else {
                                this.af.ah(i30, i12, i11, i29, i15, i14, 2001155843 * beVar.af, -506231651 * beVar.ad, beVar.aa * -819083705, i16, i20, i26, i18, i21, i27, i19, i22, i28, -86651604 * beVar.ag, -1892221897);
                            }
                        }
                    }
                }
            }
        }
    }

    void an(cc ccVar, be beVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        try {
            int i9 = (i6 << 7) - cc.ac;
            int i10 = (i7 << 7) - cc.ap;
            int i11 = i9 + mn.an;
            int i12 = i10 + mn.an;
            int i13 = ccVar.ag[i][i6][i7] - cc.al;
            int i14 = ccVar.ag[i][i6 + 1][i7] - cc.al;
            int i15 = ccVar.ag[i][i6 + 1][i7 + 1] - cc.al;
            int i16 = ccVar.ag[i][i6][i7 + 1] - cc.al;
            int i17 = ((i4 * i10) + (i5 * i9)) >> 16;
            int i18 = ((i5 * i10) - (i4 * i9)) >> 16;
            int i19 = ((i3 * i13) - (i18 * i2)) >> 16;
            int i20 = ((i13 * i2) + (i18 * i3)) >> 16;
            if (i20 >= 50) {
                int i21 = ((i5 * i11) + (i4 * i10)) >> 16;
                i10 = ((i10 * i5) - (i11 * i4)) >> 16;
                int i22 = ((i14 * i3) - (i2 * i10)) >> 16;
                int i23 = ((i10 * i3) + (i2 * i14)) >> 16;
                if (i23 >= 50) {
                    int i24 = ((i11 * i5) + (i4 * i12)) >> 16;
                    i10 = ((i5 * i12) - (i11 * i4)) >> 16;
                    int i25 = ((i15 * i3) - (i10 * i2)) >> 16;
                    int i26 = ((i10 * i3) + (i2 * i15)) >> 16;
                    if (i26 >= 50) {
                        int i27 = ((i4 * i12) + (i5 * i9)) >> 16;
                        i9 = ((i5 * i12) - (i9 * i4)) >> 16;
                        int i28 = ((i3 * i16) - (i9 * i2)) >> 16;
                        int i29 = ((i9 * i3) + (i16 * i2)) >> 16;
                        if (i29 >= 50) {
                            cj cjVar;
                            int i30 = (-1575402035 * this.af.bg) + (((542614623 * this.af.bz) * i17) / i20);
                            int i31 = (((542614623 * this.af.bz) * i19) / i20) + (this.af.bh * -1508152919);
                            i15 = (this.af.bg * -1575402035) + (((this.af.bz * 542614623) * i21) / i23);
                            i12 = (((542614623 * this.af.bz) * i22) / i23) + (-1508152919 * this.af.bh);
                            i13 = (((this.af.bz * 542614623) * i24) / i26) + (this.af.bg * -1575402035);
                            i10 = (((542614623 * this.af.bz) * i25) / i26) + (-1508152919 * this.af.bh);
                            i14 = (this.af.bg * -1575402035) + (((this.af.bz * 542614623) * i27) / i29);
                            i11 = (this.af.bh * -1508152919) + (((542614623 * this.af.bz) * i28) / i29);
                            this.af.bc = 0;
                            if (((i13 - i14) * (i12 - i11)) - ((i10 - i11) * (i15 - i14)) > 0) {
                                this.af.al = false;
                                if (i13 < 0 || i14 < 0 || i15 < 0 || i13 > this.af.bf * 784773023 || i14 > this.af.bf * 784773023 || i15 > this.af.bf * 784773023) {
                                    this.af.al = true;
                                }
                                if (cc.bh && cc.bl(cc.bv, cc.bp, i10, i11, i12, i13, i14, i15)) {
                                    cc.bx = i6;
                                    cc.bt = i7;
                                }
                                if (beVar.ag * -111892343 == -1) {
                                    if (12345678 != beVar.an * -295616241) {
                                        this.af.ag(i10, i11, i12, i13, i14, i15, -295616241 * beVar.an, -910748699 * beVar.aa, beVar.ad * -506231651, 1130336107);
                                    }
                                } else if (cc.af) {
                                    cjVar = this.af;
                                    int aa = cj.ab.aa(beVar.ag * -111892343, 1577195485);
                                    this.af.ag(i10, i11, i12, i13, i14, i15, bx.bu(aa, -295616241 * beVar.an, -2109822726), bx.bu(aa, beVar.aa * -910748699, -2095849933), bx.bu(aa, -506231651 * beVar.ad, -2146745350), 1660868134);
                                } else if (beVar.ay) {
                                    this.af.ah(i10, i11, i12, i13, i14, i15, beVar.an * -295616241, beVar.aa * -910748699, beVar.ad * -506231651, i17, i21, i27, i19, i22, i28, i20, i23, i29, -111892343 * beVar.ag, -773556747);
                                } else {
                                    this.af.ah(i10, i11, i12, i13, i14, i15, -295616241 * beVar.an, beVar.aa * -910748699, -506231651 * beVar.ad, i24, i27, i21, i25, i28, i22, i26, i29, i23, beVar.ag * -111892343, -1178521004);
                                }
                            }
                            if (((i11 - i12) * (i30 - i15)) - ((i14 - i15) * (i31 - i12)) > 0) {
                                this.af.al = false;
                                if (i30 < 0 || i15 < 0 || i14 < 0 || i30 > this.af.bf * 784773023 || i15 > 784773023 * this.af.bf || i14 > this.af.bf * 784773023) {
                                    this.af.al = true;
                                }
                                if (cc.bh && cc.bl(cc.bv, cc.bp, i31, i12, i11, i30, i15, i14)) {
                                    cc.bx = i6;
                                    cc.bt = i7;
                                }
                                if (-111892343 * beVar.ag == -1) {
                                    if (12345678 != 2001155843 * beVar.af) {
                                        this.af.ag(i31, i12, i11, i30, i15, i14, 2001155843 * beVar.af, -506231651 * beVar.ad, -910748699 * beVar.aa, 1455564815);
                                    }
                                } else if (cc.af) {
                                    cjVar = this.af;
                                    i9 = cj.ab.aa(-111892343 * beVar.ag, 1577195485);
                                    this.af.ag(i31, i12, i11, i30, i15, i14, bx.bu(i9, beVar.af * 2001155843, -2105335863), bx.bu(i9, -506231651 * beVar.ad, -2126265766), bx.bu(i9, beVar.aa * -910748699, -2121472631), 1786216492);
                                } else {
                                    this.af.ah(i31, i12, i11, i30, i15, i14, 2001155843 * beVar.af, -506231651 * beVar.ad, beVar.aa * -910748699, i17, i21, i27, i19, i22, i28, i20, i23, i29, -111892343 * beVar.ag, -649564764);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "bh.an(" + ')');
        }
    }

    void aq(cc ccVar, be beVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = (i6 << 7) - cc.ac;
        int i9 = (i7 << 7) - cc.ap;
        int i10 = -1910237364 + i8;
        int i11 = i9 + mn.an;
        int i12 = ccVar.ag[i][i6][i7] - cc.al;
        int i13 = ccVar.ag[i][i6 + 1][i7] - cc.al;
        int i14 = ccVar.ag[i][i6 + 1][i7 + 1] - cc.al;
        int i15 = ccVar.ag[i][i6][i7 + 1] - cc.al;
        int i16 = ((i4 * i9) + (i5 * i8)) >> 16;
        int i17 = ((i5 * i9) - (i4 * i8)) >> 16;
        int i18 = ((i3 * i12) - (i17 * i2)) >> 16;
        int i19 = ((i12 * i2) + (i17 * i3)) >> 16;
        if (i19 >= -1693848901) {
            int i20 = ((i5 * i10) + (i4 * i9)) >> 16;
            i9 = ((i9 * i5) - (i10 * i4)) >> 16;
            int i21 = ((i13 * i3) - (i2 * i9)) >> 16;
            int i22 = ((i9 * i3) + (i2 * i13)) >> 16;
            if (i22 >= 50) {
                int i23 = ((i10 * i5) + (i4 * i11)) >> 16;
                i9 = ((i5 * i11) - (i10 * i4)) >> 16;
                int i24 = ((i14 * i3) - (i9 * i2)) >> 16;
                int i25 = ((i9 * i3) + (i2 * i14)) >> 16;
                if (i25 >= -1361525339) {
                    int i26 = ((i4 * i11) + (i5 * i8)) >> 16;
                    i8 = ((i5 * i11) - (i8 * i4)) >> 16;
                    int i27 = ((i3 * i15) - (i8 * i2)) >> 16;
                    int i28 = ((i8 * i3) + (i15 * i2)) >> 16;
                    if (i28 >= -1676824016) {
                        cj cjVar;
                        i12 = (-827616044 * this.af.bg) + (((542614623 * this.af.bz) * i16) / i19);
                        i9 = (this.af.bh * -1435151636) + (((542614623 * this.af.bz) * i18) / i19);
                        i13 = (this.af.bg * -943462033) + (((this.af.bz * 334200515) * i20) / i22);
                        i10 = (-1508152919 * this.af.bh) + (((-242628935 * this.af.bz) * i21) / i22);
                        int i29 = (((this.af.bz * 542614623) * i23) / i25) + (this.af.bg * -1575402035);
                        int i30 = (-1508152919 * this.af.bh) + (((542614623 * this.af.bz) * i24) / i25);
                        i14 = (this.af.bg * -1119696704) + (((this.af.bz * 542614623) * i26) / i28);
                        i11 = (this.af.bh * 862727998) + (((542614623 * this.af.bz) * i27) / i28);
                        this.af.bc = 0;
                        if (((i29 - i14) * (i10 - i11)) - ((i30 - i11) * (i13 - i14)) > 0) {
                            this.af.al = false;
                            if (i29 < 0 || i14 < 0 || i13 < 0 || i29 > this.af.bf * -68368117 || i14 > this.af.bf * 795862460 || i13 > this.af.bf * 784773023) {
                                this.af.al = true;
                            }
                            if (cc.bh && cc.bl(cc.bv, cc.bp, i30, i11, i10, i29, i14, i13)) {
                                cc.bx = i6;
                                cc.bt = i7;
                            }
                            if (beVar.ag * 1120604388 == -1) {
                                if (12345678 != beVar.an * -2001463732) {
                                    this.af.ag(i30, i11, i10, i29, i14, i13, -295616241 * beVar.an, -910748699 * beVar.aa, beVar.ad * -1615678728, 2103846004);
                                }
                            } else if (cc.af) {
                                cjVar = this.af;
                                i8 = cj.ab.aa(beVar.ag * -556867637, 1577195485);
                                this.af.ag(i30, i11, i10, i29, i14, i13, bx.bu(i8, 280784672 * beVar.an, -2090124642), bx.bu(i8, beVar.aa * 1090707501, -2141387568), bx.bu(i8, -179330669 * beVar.ad, -2140840327), 1608526419);
                            } else if (beVar.ay) {
                                this.af.ah(i30, i11, i10, i29, i14, i13, beVar.an * -295616241, beVar.aa * -1648782824, beVar.ad * -506231651, i16, i20, i26, i18, i21, i27, i19, i22, i28, beVar.ag * 1364463258, -1859554148);
                            } else {
                                this.af.ah(i30, i11, i10, i29, i14, i13, 806461163 * beVar.an, beVar.aa * -910748699, 665584482 * beVar.ad, i23, i26, i20, i24, i27, i21, i25, i28, i22, beVar.ag * 853552209, -2100050821);
                            }
                        }
                        if (((i11 - i10) * (i12 - i13)) - ((i14 - i13) * (i9 - i10)) > 0) {
                            this.af.al = false;
                            if (i12 < 0 || i13 < 0 || i14 < 0 || i12 > this.af.bf * 784773023 || i13 > -79612529 * this.af.bf || i14 > this.af.bf * -1994571217) {
                                this.af.al = true;
                            }
                            if (cc.bh && cc.bl(cc.bv, cc.bp, i9, i10, i11, i12, i13, i14)) {
                                cc.bx = i6;
                                cc.bt = i7;
                            }
                            if (1519430617 * beVar.ag == -1) {
                                if (12345678 != -1341801106 * beVar.af) {
                                    this.af.ag(i9, i10, i11, i12, i13, i14, -776721012 * beVar.af, -1726876266 * beVar.ad, 635978436 * beVar.aa, 1677791180);
                                }
                            } else if (cc.af) {
                                cjVar = this.af;
                                int aa = cj.ab.aa(-987372713 * beVar.ag, 1577195485);
                                this.af.ag(i9, i10, i11, i12, i13, i14, bx.bu(aa, beVar.af * -976974030, -2136268587), bx.bu(aa, -506231651 * beVar.ad, -2108792300), bx.bu(aa, beVar.aa * -910748699, -2121934813), 2067965304);
                            } else {
                                this.af.ah(i9, i10, i11, i12, i13, i14, 2001155843 * beVar.af, 2027665738 * beVar.ad, beVar.aa * -910748699, i16, i20, i26, i18, i21, i27, i19, i22, i28, 1391482806 * beVar.ag, -1631091270);
                            }
                        }
                    }
                }
            }
        }
    }

    void at(cc ccVar, be beVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = (i6 << 7) - cc.ac;
        int i9 = (i7 << 7) - cc.ap;
        int i10 = i8 + mn.an;
        int i11 = i9 + mn.an;
        int i12 = ccVar.ag[i][i6][i7] - cc.al;
        int i13 = ccVar.ag[i][i6 + 1][i7] - cc.al;
        int i14 = ccVar.ag[i][i6 + 1][i7 + 1] - cc.al;
        int i15 = ccVar.ag[i][i6][i7 + 1] - cc.al;
        int i16 = ((i4 * i9) + (i5 * i8)) >> 16;
        int i17 = ((i5 * i9) - (i4 * i8)) >> 16;
        int i18 = ((i3 * i12) - (i17 * i2)) >> 16;
        int i19 = ((i12 * i2) + (i17 * i3)) >> 16;
        if (i19 >= 50) {
            int i20 = ((i5 * i10) + (i4 * i9)) >> 16;
            i9 = ((i9 * i5) - (i10 * i4)) >> 16;
            int i21 = ((i13 * i3) - (i2 * i9)) >> 16;
            int i22 = ((i9 * i3) + (i2 * i13)) >> 16;
            if (i22 >= 50) {
                int i23 = ((i10 * i5) + (i4 * i11)) >> 16;
                i9 = ((i5 * i11) - (i10 * i4)) >> 16;
                int i24 = ((i14 * i3) - (i9 * i2)) >> 16;
                int i25 = ((i9 * i3) + (i2 * i14)) >> 16;
                if (i25 >= 50) {
                    int i26 = ((i4 * i11) + (i5 * i8)) >> 16;
                    i8 = ((i5 * i11) - (i8 * i4)) >> 16;
                    int i27 = ((i3 * i15) - (i8 * i2)) >> 16;
                    int i28 = ((i8 * i3) + (i15 * i2)) >> 16;
                    if (i28 >= 50) {
                        cj cjVar;
                        int i29 = (-1575402035 * this.af.bg) + (((542614623 * this.af.bz) * i16) / i19);
                        int i30 = (((542614623 * this.af.bz) * i18) / i19) + (this.af.bh * -1508152919);
                        i15 = (this.af.bg * -1575402035) + (((this.af.bz * 542614623) * i20) / i22);
                        i12 = (((542614623 * this.af.bz) * i21) / i22) + (-1508152919 * this.af.bh);
                        i13 = (((this.af.bz * 542614623) * i23) / i25) + (this.af.bg * -1575402035);
                        i10 = (-1508152919 * this.af.bh) + (((542614623 * this.af.bz) * i24) / i25);
                        i14 = (this.af.bg * -1575402035) + (((this.af.bz * 542614623) * i26) / i28);
                        i11 = (((542614623 * this.af.bz) * i27) / i28) + (this.af.bh * -1508152919);
                        this.af.bc = 0;
                        if (((i13 - i14) * (i12 - i11)) - ((i10 - i11) * (i15 - i14)) > 0) {
                            this.af.al = false;
                            if (i13 < 0 || i14 < 0 || i15 < 0 || i13 > this.af.bf * 784773023 || i14 > this.af.bf * 784773023 || i15 > this.af.bf * 784773023) {
                                this.af.al = true;
                            }
                            if (cc.bh && cc.bl(cc.bv, cc.bp, i10, i11, i12, i13, i14, i15)) {
                                cc.bx = i6;
                                cc.bt = i7;
                            }
                            if (beVar.ag * -111892343 == -1) {
                                if (12345678 != beVar.an * -295616241) {
                                    this.af.ag(i10, i11, i12, i13, i14, i15, beVar.an * -295616241, beVar.aa * -910748699, -506231651 * beVar.ad, 2012959004);
                                }
                            } else if (cc.af) {
                                cjVar = this.af;
                                i8 = cj.ab.aa(beVar.ag * -111892343, 1577195485);
                                this.af.ag(i10, i11, i12, i13, i14, i15, bx.bu(i8, -295616241 * beVar.an, -2125765499), bx.bu(i8, beVar.aa * -910748699, -2128686098), bx.bu(i8, -506231651 * beVar.ad, -2136974633), 1216067133);
                            } else if (beVar.ay) {
                                this.af.ah(i10, i11, i12, i13, i14, i15, beVar.an * -295616241, beVar.aa * -910748699, beVar.ad * -506231651, i16, i20, i26, i18, i21, i27, i19, i22, i28, beVar.ag * -111892343, -1535909891);
                            } else {
                                this.af.ah(i10, i11, i12, i13, i14, i15, -295616241 * beVar.an, beVar.aa * -910748699, -506231651 * beVar.ad, i23, i26, i20, i24, i27, i21, i25, i28, i22, beVar.ag * -111892343, -928732186);
                            }
                        }
                        if (((i11 - i12) * (i29 - i15)) - ((i14 - i15) * (i30 - i12)) > 0) {
                            this.af.al = false;
                            if (i29 < 0 || i15 < 0 || i14 < 0 || i29 > this.af.bf * 784773023 || i15 > 784773023 * this.af.bf || i14 > this.af.bf * 784773023) {
                                this.af.al = true;
                            }
                            if (cc.bh && cc.bl(cc.bv, cc.bp, i30, i12, i11, i29, i15, i14)) {
                                cc.bx = i6;
                                cc.bt = i7;
                            }
                            if (-111892343 * beVar.ag == -1) {
                                if (12345678 != 2001155843 * beVar.af) {
                                    this.af.ag(i30, i12, i11, i29, i15, i14, 2001155843 * beVar.af, -506231651 * beVar.ad, -910748699 * beVar.aa, 1263184877);
                                }
                            } else if (cc.af) {
                                cjVar = this.af;
                                i8 = cj.ab.aa(-111892343 * beVar.ag, 1577195485);
                                this.af.ag(i30, i12, i11, i29, i15, i14, bx.bu(i8, beVar.af * 2001155843, -2089912435), bx.bu(i8, -506231651 * beVar.ad, -2095407730), bx.bu(i8, beVar.aa * -910748699, -2137784774), 1764524917);
                            } else {
                                this.af.ah(i30, i12, i11, i29, i15, i14, 2001155843 * beVar.af, -506231651 * beVar.ad, beVar.aa * -910748699, i16, i20, i26, i18, i21, i27, i19, i22, i28, -111892343 * beVar.ag, -1352186354);
                            }
                        }
                    }
                }
            }
        }
    }

    static boolean af(int i, int i2, byte b) {
        if (i != 4 || i2 < 8) {
            return true;
        }
        return false;
    }

    public static int aa(long j) {
        return (int) ((j >>> 7) & 127);
    }

    public static String ag(int i, boolean z, int i2) {
        if (z && i >= 0) {
            return ec.ay(i, 10, z, 1892479348);
        }
        try {
            return Integer.toString(i);
        } catch (Throwable e) {
            throw ba.ad(e, "bh.ag(" + ')');
        }
    }

    void aa(cc ccVar, bl blVar, int i, int i2, int i3, int i4, int i5, int i6, byte b) {
        try {
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
                i10 = ((i4 * i7) + (i9 * i3)) >> 16;
                i7 = ((i9 * i4) - (i7 * i3)) >> 16;
                i9 = ((i2 * i8) - (i * i7)) >> 16;
                i7 = ((i7 * i2) + (i8 * i)) >> 16;
                if (i7 >= 50) {
                    if (blVar.ae != null) {
                        bl.ah[i11] = i10;
                        bl.ak[i11] = i9;
                        bl.ao[i11] = i7;
                    }
                    bl.ai[i11] = ((i10 * (542614623 * this.af.bz)) / i7) + (this.af.bg * -1575402035);
                    bl.az[i11] = ((i9 * (542614623 * this.af.bz)) / i7) + (this.af.bh * -1508152919);
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
                i9 = bl.ai[i13];
                i10 = bl.ai[i14];
                int i16 = bl.ai[i15];
                length = bl.az[i13];
                i7 = bl.az[i14];
                i8 = bl.az[i15];
                if (((i8 - i7) * (i9 - i10)) - ((i16 - i10) * (length - i7)) > 0) {
                    this.af.al = false;
                    if (i9 < 0 || i10 < 0 || i16 < 0 || i9 > this.af.bf * 784773023 || i10 > 784773023 * this.af.bf || i16 > this.af.bf * 784773023) {
                        this.af.al = true;
                    }
                    if (cc.bh && cc.bl(cc.bv, cc.bp, length, i7, i8, i9, i10, i16)) {
                        cc.bx = i5;
                        cc.bt = i6;
                    }
                    if (blVar.ae == null || blVar.ae[i12] == -1) {
                        if (12345678 != blVar.aa[i12]) {
                            this.af.ag(length, i7, i8, i9, i10, i16, blVar.aa[i12], blVar.ag[i12], blVar.ay[i12], 1871266007);
                        }
                    } else if (cc.af) {
                        cj cjVar = this.af;
                        int aa = cj.ab.aa(blVar.ae[i12], 1577195485);
                        this.af.ag(length, i7, i8, i9, i10, i16, bx.bu(aa, blVar.aa[i12], -2093744964), bx.bu(aa, blVar.ag[i12], -2104352148), bx.bu(aa, blVar.ay[i12], -2143138073), 2062556237);
                    } else if (blVar.aq) {
                        this.af.ah(length, i7, i8, i9, i10, i16, blVar.aa[i12], blVar.ag[i12], blVar.ay[i12], bl.ah[0], bl.ah[1], bl.ah[3], bl.ak[0], bl.ak[1], bl.ak[3], bl.ao[0], bl.ao[1], bl.ao[3], blVar.ae[i12], -2121515825);
                    } else {
                        this.af.ah(length, i7, i8, i9, i10, i16, blVar.aa[i12], blVar.ag[i12], blVar.ay[i12], bl.ah[i13], bl.ah[i14], bl.ah[i15], bl.ak[i13], bl.ak[i14], bl.ak[i15], bl.ao[i13], bl.ao[i14], bl.ao[i15], blVar.ae[i12], -1081247988);
                    }
                }
                i12++;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "bh.aa(" + ')');
        }
    }

    void ab(cc ccVar, bl blVar, int i, int i2, int i3, int i4, int i5, int i6) {
        int length = blVar.af.length;
        int i7 = 0;
        while (i7 < length) {
            int i8 = blVar.af[i7] - cc.ac;
            int i9 = blVar.ad[i7] - cc.al;
            int i10 = blVar.an[i7] - cc.ap;
            int i11 = ((i4 * i8) + (i10 * i3)) >> 16;
            i8 = ((i10 * i4) - (i8 * i3)) >> 16;
            i10 = ((i2 * i9) - (i * i8)) >> 16;
            i8 = ((i8 * i2) + (i9 * i)) >> 16;
            if (i8 >= 50) {
                if (blVar.ae != null) {
                    bl.ah[i7] = i11;
                    bl.ak[i7] = i10;
                    bl.ao[i7] = i8;
                }
                bl.ai[i7] = ((i11 * (542614623 * this.af.bz)) / i8) + (this.af.bg * -1575402035);
                bl.az[i7] = ((i10 * (542614623 * this.af.bz)) / i8) + (this.af.bh * -1508152919);
                i7++;
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
            i11 = bl.ai[i13];
            int i16 = bl.ai[i14];
            int i17 = bl.ai[i15];
            i8 = bl.az[i13];
            i9 = bl.az[i14];
            i10 = bl.az[i15];
            if (((i10 - i9) * (i11 - i16)) - ((i17 - i16) * (i8 - i9)) > 0) {
                this.af.al = false;
                if (i11 < 0 || i16 < 0 || i17 < 0 || i11 > this.af.bf * 784773023 || i16 > 784773023 * this.af.bf || i17 > this.af.bf * 784773023) {
                    this.af.al = true;
                }
                if (cc.bh && cc.bl(cc.bv, cc.bp, i8, i9, i10, i11, i16, i17)) {
                    cc.bx = i5;
                    cc.bt = i6;
                }
                if (blVar.ae == null || blVar.ae[i12] == -1) {
                    if (12345678 != blVar.aa[i12]) {
                        this.af.ag(i8, i9, i10, i11, i16, i17, blVar.aa[i12], blVar.ag[i12], blVar.ay[i12], 1581886689);
                    }
                } else if (cc.af) {
                    cj cjVar = this.af;
                    i7 = cj.ab.aa(blVar.ae[i12], 1577195485);
                    this.af.ag(i8, i9, i10, i11, i16, i17, bx.bu(i7, blVar.aa[i12], -2127712543), bx.bu(i7, blVar.ag[i12], -2129993533), bx.bu(i7, blVar.ay[i12], -2124497915), 1563837083);
                } else if (blVar.aq) {
                    this.af.ah(i8, i9, i10, i11, i16, i17, blVar.aa[i12], blVar.ag[i12], blVar.ay[i12], bl.ah[0], bl.ah[1], bl.ah[3], bl.ak[0], bl.ak[1], bl.ak[3], bl.ao[0], bl.ao[1], bl.ao[3], blVar.ae[i12], -1076704641);
                } else {
                    this.af.ah(i8, i9, i10, i11, i16, i17, blVar.aa[i12], blVar.ag[i12], blVar.ay[i12], bl.ah[i13], bl.ah[i14], bl.ah[i15], bl.ak[i13], bl.ak[i14], bl.ak[i15], bl.ao[i13], bl.ao[i14], bl.ao[i15], blVar.ae[i12], -2054104865);
                }
            }
            i12++;
        }
    }

    void aw(cc ccVar, bl blVar, int i, int i2, int i3, int i4, int i5, int i6) {
        int length = blVar.af.length;
        int i7 = 0;
        while (i7 < length) {
            int i8 = blVar.af[i7] - cc.ac;
            int i9 = blVar.ad[i7] - cc.al;
            int i10 = blVar.an[i7] - cc.ap;
            int i11 = ((i4 * i8) + (i10 * i3)) >> 16;
            i8 = ((i10 * i4) - (i8 * i3)) >> 16;
            i10 = ((i2 * i9) - (i * i8)) >> 16;
            i8 = ((i8 * i2) + (i9 * i)) >> 16;
            if (i8 >= 50) {
                if (blVar.ae != null) {
                    bl.ah[i7] = i11;
                    bl.ak[i7] = i10;
                    bl.ao[i7] = i8;
                }
                bl.ai[i7] = ((i11 * (-798461265 * this.af.bz)) / i8) + (this.af.bg * -1575402035);
                bl.az[i7] = ((i10 * (246257722 * this.af.bz)) / i8) + (this.af.bh * 285875944);
                i7++;
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
            i11 = bl.ai[i13];
            int i16 = bl.ai[i14];
            int i17 = bl.ai[i15];
            i8 = bl.az[i13];
            i9 = bl.az[i14];
            i10 = bl.az[i15];
            if (((i10 - i9) * (i11 - i16)) - ((i17 - i16) * (i8 - i9)) > 0) {
                this.af.al = false;
                if (i11 < 0 || i16 < 0 || i17 < 0 || i11 > this.af.bf * 784773023 || i16 > 190341810 * this.af.bf || i17 > this.af.bf * 784773023) {
                    this.af.al = true;
                }
                if (cc.bh && cc.bl(cc.bv, cc.bp, i8, i9, i10, i11, i16, i17)) {
                    cc.bx = i5;
                    cc.bt = i6;
                }
                if (blVar.ae == null || blVar.ae[i12] == -1) {
                    if (-228422097 != blVar.aa[i12]) {
                        this.af.ag(i8, i9, i10, i11, i16, i17, blVar.aa[i12], blVar.ag[i12], blVar.ay[i12], 1531000215);
                    }
                } else if (cc.af) {
                    cj cjVar = this.af;
                    i7 = cj.ab.aa(blVar.ae[i12], 1577195485);
                    this.af.ag(i8, i9, i10, i11, i16, i17, bx.bu(i7, blVar.aa[i12], -2126414151), bx.bu(i7, blVar.ag[i12], -2119852794), bx.bu(i7, blVar.ay[i12], -2129092787), 1514400182);
                } else if (blVar.aq) {
                    this.af.ah(i8, i9, i10, i11, i16, i17, blVar.aa[i12], blVar.ag[i12], blVar.ay[i12], bl.ah[0], bl.ah[1], bl.ah[3], bl.ak[0], bl.ak[1], bl.ak[3], bl.ao[0], bl.ao[1], bl.ao[3], blVar.ae[i12], -1156490933);
                } else {
                    this.af.ah(i8, i9, i10, i11, i16, i17, blVar.aa[i12], blVar.ag[i12], blVar.ay[i12], bl.ah[i13], bl.ah[i14], bl.ah[i15], bl.ak[i13], bl.ak[i14], bl.ak[i15], bl.ao[i13], bl.ao[i14], bl.ao[i15], blVar.ae[i12], -1985057867);
                }
            }
            i12++;
        }
    }

    static int af(kf kfVar, kf kfVar2, short s) {
        int i = 0;
        try {
            if (kfVar.al("title.jpg", "", (byte) 74)) {
                i = 1;
            }
            if (kfVar2.al("logo", "", (byte) 120)) {
                i++;
            }
            if (kfVar2.al("logo_deadman_mode", "", (byte) 59)) {
                i++;
            }
            if (kfVar2.al("titlebox", "", (byte) 93)) {
                i++;
            }
            if (kfVar2.al("titlebutton", "", (byte) 13)) {
                i++;
            }
            if (kfVar2.al("runes", "", (byte) 103)) {
                i++;
            }
            if (kfVar2.al("title_mute", "", (byte) 84)) {
                i++;
            }
            if (kfVar2.al("options_radio_buttons,0", "", (byte) 77)) {
                i++;
            }
            if (kfVar2.al("options_radio_buttons,2", "", (byte) 81)) {
                i++;
            }
            if (kfVar2.al("options_radio_buttons,4", "", (byte) 101)) {
                i++;
            }
            if (kfVar2.al("options_radio_buttons,6", "", (byte) 92)) {
                i++;
            }
            kfVar2.al("sl_back", "", (byte) 60);
            kfVar2.al("sl_flags", "", (byte) 86);
            kfVar2.al("sl_arrows", "", (byte) 93);
            kfVar2.al("sl_stars", "", (byte) 113);
            kfVar2.al("sl_button", "", (byte) 24);
            return i;
        } catch (Throwable e) {
            throw ba.ad(e, "bh.af(" + ')');
        }
    }

    static int ab(int i, gk gkVar, boolean z, int i2) {
        if (3200 == i) {
            try {
                hr.ar -= 711305551;
                em.bu(hr.as[hr.ar * 537618701], hr.as[(hr.ar * 537618701) + 1], hr.as[(hr.ar * 537618701) + 2], 772472360);
                return 1;
            } catch (Throwable e) {
                throw ba.ad(e, "bh.ab(" + ')');
            }
        } else if (3201 == i) {
            int[] iArr = hr.as;
            r1 = hr.ar - -1194553915;
            hr.ar = r1;
            r0 = iArr[r1 * 537618701];
            if (-1 == r0 && !client.me) {
                mx.an((byte) 84);
            } else if (!(r0 == -1 || 1387447661 * client.mx == r0 || client.mk * -1819605895 == 0 || client.me)) {
                kf kfVar = client.bo;
                int i3 = client.mk * -1819605895;
                mf.ag = 63807465;
                ex.ay = kfVar;
                ml.as = -1919717083 * r0;
                mf.ar = 0;
                ci.aj = -1734207119 * i3;
                gm.aq = false;
                cb.ae = -777381582;
            }
            client.mx = r0 * -541914011;
            return 1;
        } else if (i != 3202) {
            return 2;
        } else {
            hr.ar -= 1905859466;
            r1 = hr.as[hr.ar * 537618701];
            r0 = hr.as[(hr.ar * 537618701) + 1];
            if (!(client.mk * -1819605895 == 0 || r1 == -1)) {
                ao.ad(ds.cy, r1, 0, client.mk * -1819605895, false, -817384034);
                client.me = true;
            }
            return 1;
        }
    }
}
