package p000;

public class bv extends cn {
    static String am;

    bv(cj cjVar) {
        try {
            super(cjVar);
        } catch (Throwable e) {
            throw ba.ad(e, "bv.<init>(" + ')');
        }
    }

    public final void af(cl clVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        try {
            this.av[0] = -1;
            if (!(clVar.bp == 2 || 1 == clVar.bp)) {
                clVar.as();
            }
            int i9 = this.bf.bg * -1575402035;
            int i10 = -1508152919 * this.bf.bh;
            int i11 = as[i];
            int i12 = ar[i];
            int i13 = as[i2];
            int i14 = ar[i2];
            int i15 = as[i3];
            int i16 = ar[i3];
            int i17 = as[i4];
            int i18 = ar[i4];
            int i19 = ((i17 * i6) + (i7 * i18)) >> 16;
            for (int i20 = 0; i20 < clVar.ag; i20++) {
                int i21;
                int i22 = clVar.ay[i20];
                int i23 = clVar.as[i20];
                int i24 = clVar.ar[i20];
                if (i3 != 0) {
                    i21 = ((i22 * i16) + (i15 * i23)) >> 16;
                    i23 = ((i23 * i16) - (i22 * i15)) >> 16;
                } else {
                    i21 = i22;
                }
                if (i != 0) {
                    i24 = ((i24 * i12) + (i23 * i11)) >> 16;
                    i23 = ((i23 * i12) - (i11 * i24)) >> 16;
                }
                if (i2 != 0) {
                    i22 = ((i24 * i13) + (i21 * i14)) >> 16;
                    i24 = ((i24 * i14) - (i21 * i13)) >> 16;
                } else {
                    i22 = i21;
                }
                i22 += i5;
                i21 = i23 + i6;
                i24 += i7;
                i23 = ((i18 * i21) - (i24 * i17)) >> 16;
                i24 = ((i24 * i18) + (i21 * i17)) >> 16;
                this.ah[i20] = i24 - i19;
                this.ai[i20] = (((this.bf.bz * 542614623) * i22) / i24) + i9;
                this.az[i20] = (((542614623 * this.bf.bz) * i23) / i24) + i10;
                if (clVar.ax > 0) {
                    this.ak[i20] = i22;
                    this.ao[i20] = i23;
                    this.ax[i20] = i24;
                }
            }
            try {
                aa(clVar, false, false, 0);
            } catch (Exception e) {
            }
        } catch (Throwable e2) {
            throw ba.ad(e2, "bv.af(" + ')');
        }
    }

    public final void ar(cl clVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.av[0] = -1;
        if (!(clVar.bp == 2 || 1 == clVar.bp)) {
            clVar.as();
        }
        int i8 = this.bf.bg * -1575402035;
        int i9 = -1508152919 * this.bf.bh;
        int i10 = as[i];
        int i11 = ar[i];
        int i12 = as[i2];
        int i13 = ar[i2];
        int i14 = as[i3];
        int i15 = ar[i3];
        int i16 = as[i4];
        int i17 = ar[i4];
        int i18 = ((i16 * i6) + (i7 * i17)) >> 16;
        for (int i19 = 0; i19 < clVar.ag; i19++) {
            int i20;
            int i21 = clVar.ay[i19];
            int i22 = clVar.as[i19];
            int i23 = clVar.ar[i19];
            if (i3 != 0) {
                i20 = ((i21 * i15) + (i14 * i22)) >> 16;
                i22 = ((i22 * i15) - (i21 * i14)) >> 16;
            } else {
                i20 = i21;
            }
            if (i != 0) {
                i23 = ((i23 * i11) + (i22 * i10)) >> 16;
                i22 = ((i22 * i11) - (i10 * i23)) >> 16;
            }
            if (i2 != 0) {
                i21 = ((i23 * i12) + (i20 * i13)) >> 16;
                i23 = ((i23 * i13) - (i20 * i12)) >> 16;
            } else {
                i21 = i20;
            }
            i21 += i5;
            i20 = i22 + i6;
            i23 += i7;
            i22 = ((i17 * i20) - (i23 * i16)) >> 16;
            i23 = ((i23 * i17) + (i20 * i16)) >> 16;
            this.ah[i19] = i23 - i18;
            this.ai[i19] = (((this.bf.bz * -337002440) * i21) / i23) + i8;
            this.az[i19] = (((542614623 * this.bf.bz) * i22) / i23) + i9;
            if (clVar.ax > 0) {
                this.ak[i19] = i21;
                this.ao[i19] = i22;
                this.ax[i19] = i23;
            }
        }
        try {
            aa(clVar, false, false, 0);
        } catch (Exception e) {
        }
    }

    public final void as(cl clVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.av[0] = -1;
        if (!(clVar.bp == 2 || 1 == clVar.bp)) {
            clVar.as();
        }
        int i8 = this.bf.bg * -1575402035;
        int i9 = -1508152919 * this.bf.bh;
        int i10 = as[i];
        int i11 = ar[i];
        int i12 = as[i2];
        int i13 = ar[i2];
        int i14 = as[i3];
        int i15 = ar[i3];
        int i16 = as[i4];
        int i17 = ar[i4];
        int i18 = ((i16 * i6) + (i7 * i17)) >> 16;
        for (int i19 = 0; i19 < clVar.ag; i19++) {
            int i20;
            int i21 = clVar.ay[i19];
            int i22 = clVar.as[i19];
            int i23 = clVar.ar[i19];
            if (i3 != 0) {
                i20 = ((i21 * i15) + (i14 * i22)) >> 16;
                i22 = ((i22 * i15) - (i21 * i14)) >> 16;
            } else {
                i20 = i21;
            }
            if (i != 0) {
                i23 = ((i23 * i11) + (i22 * i10)) >> 16;
                i22 = ((i22 * i11) - (i10 * i23)) >> 16;
            }
            if (i2 != 0) {
                i21 = ((i23 * i12) + (i20 * i13)) >> 16;
                i23 = ((i23 * i13) - (i20 * i12)) >> 16;
            } else {
                i21 = i20;
            }
            i21 += i5;
            i20 = i22 + i6;
            i23 += i7;
            i22 = ((i17 * i20) - (i23 * i16)) >> 16;
            i23 = ((i23 * i17) + (i20 * i16)) >> 16;
            this.ah[i19] = i23 - i18;
            this.ai[i19] = (((this.bf.bz * 542614623) * i21) / i23) + i8;
            this.az[i19] = (((542614623 * this.bf.bz) * i22) / i23) + i9;
            if (clVar.ax > 0) {
                this.ak[i19] = i21;
                this.ao[i19] = i22;
                this.ax[i19] = i23;
            }
        }
        try {
            aa(clVar, false, false, 0);
        } catch (Exception e) {
        }
    }

    public static int ad(int i, int i2) {
        try {
            return aq.an(cs.az[i]);
        } catch (Throwable e) {
            throw ba.ad(e, "bv.ad(" + ')');
        }
    }

    public final void ad(cl clVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        try {
            this.av[0] = -1;
            if (!(2 == clVar.bp || 1 == clVar.bp)) {
                clVar.as();
            }
            int i10 = -1575402035 * this.bf.bg;
            int i11 = -1508152919 * this.bf.bh;
            int i12 = as[i];
            int i13 = ar[i];
            int i14 = as[i2];
            int i15 = ar[i2];
            int i16 = as[i3];
            int i17 = ar[i3];
            int i18 = as[i4];
            int i19 = ar[i4];
            int i20 = ((i19 * i7) + (i6 * i18)) >> 16;
            for (int i21 = 0; i21 < clVar.ag; i21++) {
                int i22;
                int i23 = clVar.ay[i21];
                int i24 = clVar.as[i21];
                int i25 = clVar.ar[i21];
                if (i3 != 0) {
                    i22 = ((i24 * i16) + (i17 * i23)) >> 16;
                    i24 = ((i24 * i17) - (i23 * i16)) >> 16;
                } else {
                    i22 = i23;
                }
                if (i != 0) {
                    i25 = ((i25 * i13) + (i24 * i12)) >> 16;
                    i24 = ((i13 * i24) - (i25 * i12)) >> 16;
                }
                if (i2 != 0) {
                    i23 = ((i14 * i25) + (i15 * i22)) >> 16;
                    i25 = ((i25 * i15) - (i22 * i14)) >> 16;
                } else {
                    i23 = i22;
                }
                i23 += i5;
                i22 = i24 + i6;
                i25 += i7;
                i24 = ((i19 * i22) - (i25 * i18)) >> 16;
                i25 = ((i25 * i19) + (i22 * i18)) >> 16;
                this.ah[i21] = i25 - i20;
                this.ai[i21] = (((this.bf.bz * 542614623) * i23) / i8) + i10;
                this.az[i21] = (((this.bf.bz * 542614623) * i24) / i8) + i11;
                if (clVar.ax > 0) {
                    this.ak[i21] = i23;
                    this.ao[i21] = i24;
                    this.ax[i21] = i25;
                }
            }
            try {
                aa(clVar, false, false, 0);
            } catch (Exception e) {
            }
        } catch (Throwable e2) {
            throw ba.ad(e2, "bv.ad(" + ')');
        }
    }

    public final void ae(cl clVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.av[0] = -1;
        if (!(2 == clVar.bp || 1 == clVar.bp)) {
            clVar.as();
        }
        int i9 = -1575402035 * this.bf.bg;
        int i10 = -1508152919 * this.bf.bh;
        int i11 = as[i];
        int i12 = ar[i];
        int i13 = as[i2];
        int i14 = ar[i2];
        int i15 = as[i3];
        int i16 = ar[i3];
        int i17 = as[i4];
        int i18 = ar[i4];
        int i19 = ((i18 * i7) + (i6 * i17)) >> 16;
        for (int i20 = 0; i20 < clVar.ag; i20++) {
            int i21;
            int i22 = clVar.ay[i20];
            int i23 = clVar.as[i20];
            int i24 = clVar.ar[i20];
            if (i3 != 0) {
                i21 = ((i23 * i15) + (i16 * i22)) >> 16;
                i23 = ((i23 * i16) - (i22 * i15)) >> 16;
            } else {
                i21 = i22;
            }
            if (i != 0) {
                i24 = ((i24 * i12) + (i23 * i11)) >> 16;
                i23 = ((i12 * i23) - (i24 * i11)) >> 16;
            }
            if (i2 != 0) {
                i22 = ((i13 * i24) + (i14 * i21)) >> 16;
                i24 = ((i24 * i14) - (i21 * i13)) >> 16;
            } else {
                i22 = i21;
            }
            i22 += i5;
            i21 = i23 + i6;
            i24 += i7;
            i23 = ((i18 * i21) - (i24 * i17)) >> 16;
            i24 = ((i24 * i18) + (i21 * i17)) >> 16;
            this.ah[i20] = i24 - i19;
            this.ai[i20] = (((this.bf.bz * 542614623) * i22) / i8) + i9;
            this.az[i20] = (((this.bf.bz * 542614623) * i23) / i8) + i10;
            if (clVar.ax > 0) {
                this.ak[i20] = i22;
                this.ao[i20] = i23;
                this.ax[i20] = i24;
            }
        }
        try {
            aa(clVar, false, false, 0);
        } catch (Exception e) {
        }
    }

    public final void aj(cl clVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.av[0] = -1;
        if (!(2 == clVar.bp || 1 == clVar.bp)) {
            clVar.as();
        }
        int i9 = -1575402035 * this.bf.bg;
        int i10 = -1508152919 * this.bf.bh;
        int i11 = as[i];
        int i12 = ar[i];
        int i13 = as[i2];
        int i14 = ar[i2];
        int i15 = as[i3];
        int i16 = ar[i3];
        int i17 = as[i4];
        int i18 = ar[i4];
        int i19 = ((i18 * i7) + (i6 * i17)) >> 16;
        for (int i20 = 0; i20 < clVar.ag; i20++) {
            int i21;
            int i22 = clVar.ay[i20];
            int i23 = clVar.as[i20];
            int i24 = clVar.ar[i20];
            if (i3 != 0) {
                i21 = ((i23 * i15) + (i16 * i22)) >> 16;
                i23 = ((i23 * i16) - (i22 * i15)) >> 16;
            } else {
                i21 = i22;
            }
            if (i != 0) {
                i24 = ((i24 * i12) + (i23 * i11)) >> 16;
                i23 = ((i12 * i23) - (i24 * i11)) >> 16;
            }
            if (i2 != 0) {
                i22 = ((i13 * i24) + (i14 * i21)) >> 16;
                i24 = ((i24 * i14) - (i21 * i13)) >> 16;
            } else {
                i22 = i21;
            }
            i22 += i5;
            i21 = i23 + i6;
            i24 += i7;
            i23 = ((i18 * i21) - (i24 * i17)) >> 16;
            i24 = ((i24 * i18) + (i21 * i17)) >> 16;
            this.ah[i20] = i24 - i19;
            this.ai[i20] = (((this.bf.bz * 542614623) * i22) / i8) + i9;
            this.az[i20] = (((this.bf.bz * -1617954175) * i23) / i8) + i10;
            if (clVar.ax > 0) {
                this.ak[i20] = i22;
                this.ao[i20] = i23;
                this.ax[i20] = i24;
            }
        }
        try {
            aa(clVar, false, false, 0);
        } catch (Exception e) {
        }
    }

    public final void aq(cl clVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.av[0] = -1;
        if (!(2 == clVar.bp || 1 == clVar.bp)) {
            clVar.as();
        }
        int i9 = -1575402035 * this.bf.bg;
        int i10 = -1581674473 * this.bf.bh;
        int i11 = as[i];
        int i12 = ar[i];
        int i13 = as[i2];
        int i14 = ar[i2];
        int i15 = as[i3];
        int i16 = ar[i3];
        int i17 = as[i4];
        int i18 = ar[i4];
        int i19 = ((i18 * i7) + (i6 * i17)) >> 16;
        for (int i20 = 0; i20 < clVar.ag; i20++) {
            int i21;
            int i22 = clVar.ay[i20];
            int i23 = clVar.as[i20];
            int i24 = clVar.ar[i20];
            if (i3 != 0) {
                i21 = ((i23 * i15) + (i16 * i22)) >> 16;
                i23 = ((i23 * i16) - (i22 * i15)) >> 16;
            } else {
                i21 = i22;
            }
            if (i != 0) {
                i24 = ((i24 * i12) + (i23 * i11)) >> 16;
                i23 = ((i12 * i23) - (i24 * i11)) >> 16;
            }
            if (i2 != 0) {
                i22 = ((i13 * i24) + (i14 * i21)) >> 16;
                i24 = ((i24 * i14) - (i21 * i13)) >> 16;
            } else {
                i22 = i21;
            }
            i22 += i5;
            i21 = i23 + i6;
            i24 += i7;
            i23 = ((i18 * i21) - (i24 * i17)) >> 16;
            i24 = ((i24 * i18) + (i21 * i17)) >> 16;
            this.ah[i20] = i24 - i19;
            this.ai[i20] = (((this.bf.bz * 542614623) * i22) / i8) + i9;
            this.az[i20] = (((this.bf.bz * 109369913) * i23) / i8) + i10;
            if (clVar.ax > 0) {
                this.ak[i20] = i22;
                this.ao[i20] = i23;
                this.ax[i20] = i24;
            }
        }
        try {
            aa(clVar, false, false, 0);
        } catch (Exception e) {
        }
    }

    public void ab(cq cqVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j) {
        cl ac = cqVar.ac();
        if (ac != null) {
            this.av[0] = -1;
            if (ac.bp != 1) {
                ac.ay();
            }
            ac.ag(i);
            int i9 = ((i5 * i8) - (i4 * i6)) >> 16;
            int i10 = ((i3 * i9) + (i7 * i2)) >> 16;
            int i11 = (ac.bt * i3) >> 16;
            int i12 = i11 + i10;
            if (i12 > 50 && i10 < 3500) {
                int i13 = ((i5 * i6) + (i4 * i8)) >> 16;
                int i14 = (i13 - ac.bt) * (this.bf.bz * 542614623);
                if (i14 / i12 < -1292978563 * this.bf.bx) {
                    int i15 = (ac.bt + i13) * (-1020562405 * this.bf.bz);
                    if (i15 / i12 > 1292965175 * this.bf.bp) {
                        int i16 = ((i3 * i7) - (i9 * i2)) >> 16;
                        i9 = (ac.bt * i2) >> 16;
                        int i17 = (i16 + i9) * (688407073 * this.bf.bz);
                        if (i17 / i12 > -1542934767 * this.bf.bt) {
                            int i18 = (542614623 * this.bf.bz) * (i16 - (i9 + (((1500767459 * ac.bo) * i3) >> 16)));
                            if (i18 / i12 < -2137901443 * this.bf.bu) {
                                Object obj;
                                int i19;
                                boolean z;
                                boolean z2;
                                int i20;
                                int i21;
                                int i22;
                                Object obj2 = null;
                                if (i10 - (i11 + (((ac.bo * 21136580) * i2) >> 16)) <= 952390484) {
                                    obj2 = 1;
                                }
                                if (obj2 != null || ac.ax > 0) {
                                    obj = 1;
                                } else {
                                    obj = null;
                                }
                                int i23 = -2057548173 * cs.aa;
                                int ae = ht.ae(-414970391);
                                boolean z3 = cs.an;
                                if (ev.af(j) && z3) {
                                    if (cs.af) {
                                        z3 = js.am(ac, i6, i7, i8, this, -1516380580);
                                    } else {
                                        i9 = i10 - i11;
                                        if (i9 <= 1858365290) {
                                            i19 = -1208292321;
                                        } else {
                                            i19 = i9;
                                        }
                                        if (i13 > 0) {
                                            i13 = i15 / i19;
                                            i14 /= i12;
                                        } else {
                                            i13 = i15 / i12;
                                            i14 /= i19;
                                        }
                                        if (i16 > 0) {
                                            i9 = i18 / i12;
                                            i11 = i17 / i19;
                                        } else {
                                            i11 = i17 / i12;
                                            i9 = i18 / i19;
                                        }
                                        i19 = i23 - (-1575402035 * this.bf.bg);
                                        i12 = ae - (-1508152919 * this.bf.bh);
                                        if (i19 <= i14 || i19 >= r6 || i12 <= r3 || i12 >= r4) {
                                            z3 = false;
                                        } else {
                                            z3 = true;
                                        }
                                    }
                                    if (z3) {
                                        if (ac.bc) {
                                            long[] jArr = cs.az;
                                            i11 = cs.ai + 1506005823;
                                            cs.ai = i11;
                                            jArr[(i11 * 963961457) - 1] = j;
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                        i12 = this.bf.bg * -313222147;
                                        i15 = -917266385 * this.bf.bh;
                                        i11 = 0;
                                        i9 = 0;
                                        if (i != 0) {
                                            i11 = as[i];
                                            i9 = ar[i];
                                        }
                                        z2 = false;
                                        for (i20 = 0; i20 < ac.ag; i20++) {
                                            i19 = ac.ay[i20];
                                            i16 = ac.as[i20];
                                            i21 = ac.ar[i20];
                                            if (i == 0) {
                                                i22 = ((i11 * i21) + (i19 * i9)) >> 16;
                                                i21 = ((i21 * i9) - (i19 * i11)) >> 16;
                                            } else {
                                                i22 = i19;
                                            }
                                            i22 += i6;
                                            i19 = i16 + i7;
                                            i21 += i8;
                                            i16 = ((i5 * i22) + (i4 * i21)) >> 16;
                                            i21 = ((i21 * i5) - (i22 * i4)) >> 16;
                                            i22 = ((i19 * i3) - (i2 * i21)) >> 16;
                                            i21 = ((i21 * i3) + (i19 * i2)) >> 16;
                                            this.ah[i20] = i21 - i10;
                                            if (i21 < 50) {
                                                this.ai[i20] = (((542614623 * this.bf.bz) * i16) / i21) + i12;
                                                this.az[i20] = (((this.bf.bz * 542614623) * i22) / i21) + i15;
                                            } else {
                                                this.ai[i20] = -5000;
                                                z2 = true;
                                            }
                                            if (obj != null) {
                                                this.ak[i20] = i16;
                                                this.ao[i20] = i22;
                                                this.ax[i20] = i21;
                                            }
                                        }
                                        aa(ac, z2, z, j);
                                    }
                                }
                                z = false;
                                i12 = this.bf.bg * -313222147;
                                i15 = -917266385 * this.bf.bh;
                                i11 = 0;
                                i9 = 0;
                                if (i != 0) {
                                    i11 = as[i];
                                    i9 = ar[i];
                                }
                                z2 = false;
                                for (i20 = 0; i20 < ac.ag; i20++) {
                                    i19 = ac.ay[i20];
                                    i16 = ac.as[i20];
                                    i21 = ac.ar[i20];
                                    if (i == 0) {
                                        i22 = i19;
                                    } else {
                                        i22 = ((i11 * i21) + (i19 * i9)) >> 16;
                                        i21 = ((i21 * i9) - (i19 * i11)) >> 16;
                                    }
                                    i22 += i6;
                                    i19 = i16 + i7;
                                    i21 += i8;
                                    i16 = ((i5 * i22) + (i4 * i21)) >> 16;
                                    i21 = ((i21 * i5) - (i22 * i4)) >> 16;
                                    i22 = ((i19 * i3) - (i2 * i21)) >> 16;
                                    i21 = ((i21 * i3) + (i19 * i2)) >> 16;
                                    this.ah[i20] = i21 - i10;
                                    if (i21 < 50) {
                                        this.ai[i20] = -5000;
                                        z2 = true;
                                    } else {
                                        this.ai[i20] = (((542614623 * this.bf.bz) * i16) / i21) + i12;
                                        this.az[i20] = (((this.bf.bz * 542614623) * i22) / i21) + i15;
                                    }
                                    if (obj != null) {
                                        this.ak[i20] = i16;
                                        this.ao[i20] = i22;
                                        this.ax[i20] = i21;
                                    }
                                }
                                try {
                                    aa(ac, z2, z, j);
                                } catch (Exception e) {
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void am(cq cqVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j) {
        cl ac = cqVar.ac();
        if (ac != null) {
            this.av[0] = -1;
            if (ac.bp != 1) {
                ac.ay();
            }
            ac.ag(i);
            int i9 = ((i5 * i8) - (i4 * i6)) >> 16;
            int i10 = ((i3 * i9) + (i7 * i2)) >> 16;
            int i11 = (ac.bt * i3) >> 16;
            int i12 = i11 + i10;
            if (i12 > 50 && i10 < 3500) {
                int i13 = ((i5 * i6) + (i4 * i8)) >> 16;
                int i14 = (i13 - ac.bt) * (this.bf.bz * 542614623);
                if (i14 / i12 < -1292978563 * this.bf.bx) {
                    int i15 = (ac.bt + i13) * (542614623 * this.bf.bz);
                    if (i15 / i12 > 1292965175 * this.bf.bp) {
                        int i16 = ((i3 * i7) - (i9 * i2)) >> 16;
                        i9 = (ac.bt * i2) >> 16;
                        int i17 = (i16 + i9) * (542614623 * this.bf.bz);
                        if (i17 / i12 > -1542934767 * this.bf.bt) {
                            int i18 = (542614623 * this.bf.bz) * (i16 - (i9 + (((1500767459 * ac.bo) * i3) >> 16)));
                            if (i18 / i12 < -939286465 * this.bf.bu) {
                                Object obj;
                                int i19;
                                boolean z;
                                boolean z2;
                                int i20;
                                int i21;
                                int i22;
                                Object obj2 = null;
                                if (i10 - (i11 + (((ac.bo * 1500767459) * i2) >> 16)) <= 50) {
                                    obj2 = 1;
                                }
                                if (obj2 != null || ac.ax > 0) {
                                    obj = 1;
                                } else {
                                    obj = null;
                                }
                                int i23 = -429386291 * cs.aa;
                                int ae = ht.ae(-414970391);
                                boolean z3 = cs.an;
                                if (ev.af(j) && z3) {
                                    if (cs.af) {
                                        z3 = js.am(ac, i6, i7, i8, this, -1148907301);
                                    } else {
                                        i9 = i10 - i11;
                                        if (i9 <= 50) {
                                            i19 = 50;
                                        } else {
                                            i19 = i9;
                                        }
                                        if (i13 > 0) {
                                            i13 = i15 / i19;
                                            i14 /= i12;
                                        } else {
                                            i13 = i15 / i12;
                                            i14 /= i19;
                                        }
                                        if (i16 > 0) {
                                            i9 = i18 / i12;
                                            i11 = i17 / i19;
                                        } else {
                                            i11 = i17 / i12;
                                            i9 = i18 / i19;
                                        }
                                        i19 = i23 - (-1575402035 * this.bf.bg);
                                        i12 = ae - (-1508152919 * this.bf.bh);
                                        if (i19 <= i14 || i19 >= r6 || i12 <= r3 || i12 >= r4) {
                                            z3 = false;
                                        } else {
                                            z3 = true;
                                        }
                                    }
                                    if (z3) {
                                        if (ac.bc) {
                                            long[] jArr = cs.az;
                                            i11 = cs.ai + 313171601;
                                            cs.ai = i11;
                                            jArr[(i11 * 963961457) - 1] = j;
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                        i12 = this.bf.bg * -1575402035;
                                        i15 = -1508152919 * this.bf.bh;
                                        i11 = 0;
                                        i9 = 0;
                                        if (i != 0) {
                                            i11 = as[i];
                                            i9 = ar[i];
                                        }
                                        z2 = false;
                                        for (i20 = 0; i20 < ac.ag; i20++) {
                                            i19 = ac.ay[i20];
                                            i16 = ac.as[i20];
                                            i21 = ac.ar[i20];
                                            if (i == 0) {
                                                i22 = ((i11 * i21) + (i19 * i9)) >> 16;
                                                i21 = ((i21 * i9) - (i19 * i11)) >> 16;
                                            } else {
                                                i22 = i19;
                                            }
                                            i22 += i6;
                                            i19 = i16 + i7;
                                            i21 += i8;
                                            i16 = ((i5 * i22) + (i4 * i21)) >> 16;
                                            i21 = ((i21 * i5) - (i22 * i4)) >> 16;
                                            i22 = ((i19 * i3) - (i2 * i21)) >> 16;
                                            i21 = ((i21 * i3) + (i19 * i2)) >> 16;
                                            this.ah[i20] = i21 - i10;
                                            if (i21 < 50) {
                                                this.ai[i20] = (((542614623 * this.bf.bz) * i16) / i21) + i12;
                                                this.az[i20] = (((this.bf.bz * 542614623) * i22) / i21) + i15;
                                            } else {
                                                this.ai[i20] = -5000;
                                                z2 = true;
                                            }
                                            if (obj != null) {
                                                this.ak[i20] = i16;
                                                this.ao[i20] = i22;
                                                this.ax[i20] = i21;
                                            }
                                        }
                                        aa(ac, z2, z, j);
                                    }
                                }
                                z = false;
                                i12 = this.bf.bg * -1575402035;
                                i15 = -1508152919 * this.bf.bh;
                                i11 = 0;
                                i9 = 0;
                                if (i != 0) {
                                    i11 = as[i];
                                    i9 = ar[i];
                                }
                                z2 = false;
                                for (i20 = 0; i20 < ac.ag; i20++) {
                                    i19 = ac.ay[i20];
                                    i16 = ac.as[i20];
                                    i21 = ac.ar[i20];
                                    if (i == 0) {
                                        i22 = i19;
                                    } else {
                                        i22 = ((i11 * i21) + (i19 * i9)) >> 16;
                                        i21 = ((i21 * i9) - (i19 * i11)) >> 16;
                                    }
                                    i22 += i6;
                                    i19 = i16 + i7;
                                    i21 += i8;
                                    i16 = ((i5 * i22) + (i4 * i21)) >> 16;
                                    i21 = ((i21 * i5) - (i22 * i4)) >> 16;
                                    i22 = ((i19 * i3) - (i2 * i21)) >> 16;
                                    i21 = ((i21 * i3) + (i19 * i2)) >> 16;
                                    this.ah[i20] = i21 - i10;
                                    if (i21 < 50) {
                                        this.ai[i20] = -5000;
                                        z2 = true;
                                    } else {
                                        this.ai[i20] = (((542614623 * this.bf.bz) * i16) / i21) + i12;
                                        this.az[i20] = (((this.bf.bz * 542614623) * i22) / i21) + i15;
                                    }
                                    if (obj != null) {
                                        this.ak[i20] = i16;
                                        this.ao[i20] = i22;
                                        this.ax[i20] = i21;
                                    }
                                }
                                try {
                                    aa(ac, z2, z, j);
                                } catch (Exception e) {
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void an(cq cqVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j) {
        try {
            cl ac = cqVar.ac();
            if (ac != null) {
                this.av[0] = -1;
                if (ac.bp != 1) {
                    ac.ay();
                }
                ac.ag(i);
                int i9 = ((i5 * i8) - (i4 * i6)) >> 16;
                int i10 = ((i3 * i9) + (i7 * i2)) >> 16;
                int i11 = (ac.bt * i3) >> 16;
                int i12 = i11 + i10;
                if (i12 > 50 && i10 < 3500) {
                    int i13 = ((i5 * i6) + (i4 * i8)) >> 16;
                    int i14 = (this.bf.bz * 542614623) * (i13 - ac.bt);
                    if (i14 / i12 < -1292978563 * this.bf.bx) {
                        int i15 = (ac.bt + i13) * (542614623 * this.bf.bz);
                        if (i15 / i12 > 1292965175 * this.bf.bp) {
                            int i16 = ((i3 * i7) - (i9 * i2)) >> 16;
                            i9 = (ac.bt * i2) >> 16;
                            int i17 = (i16 + i9) * (542614623 * this.bf.bz);
                            if (i17 / i12 > -1542934767 * this.bf.bt) {
                                int i18 = (542614623 * this.bf.bz) * (i16 - (i9 + (((1500767459 * ac.bo) * i3) >> 16)));
                                if (i18 / i12 < -939286465 * this.bf.bu) {
                                    Object obj;
                                    int i19;
                                    boolean z;
                                    boolean z2;
                                    int i20;
                                    int i21;
                                    Object obj2 = null;
                                    if (i10 - (i11 + (((ac.bo * 1500767459) * i2) >> 16)) <= 50) {
                                        obj2 = 1;
                                    }
                                    if (obj2 != null || ac.ax > 0) {
                                        obj = 1;
                                    } else {
                                        obj = null;
                                    }
                                    int i22 = -429386291 * cs.aa;
                                    int ae = ht.ae(-414970391);
                                    boolean z3 = cs.an;
                                    if (ev.af(j) && z3) {
                                        z3 = false;
                                        if (cs.af) {
                                            z3 = js.am(ac, i6, i7, i8, this, -1958541240);
                                        } else {
                                            i11 = i10 - i11;
                                            if (i11 <= 50) {
                                                i19 = 50;
                                            } else {
                                                i19 = i11;
                                            }
                                            if (i13 > 0) {
                                                i13 = i14 / i12;
                                                i14 = i15 / i19;
                                                i15 = i13;
                                            } else {
                                                i13 = i14 / i19;
                                                i14 = i15 / i12;
                                                i15 = i13;
                                            }
                                            if (i16 > 0) {
                                                i11 = i18 / i12;
                                                i13 = i17 / i19;
                                            } else {
                                                i13 = i17 / i12;
                                                i11 = i18 / i19;
                                            }
                                            i19 = i22 - (-1575402035 * this.bf.bg);
                                            i12 = ae - (-1508152919 * this.bf.bh);
                                            if (i19 > i15 && i19 < r6 && i12 > r4 && i12 < r5) {
                                                z3 = true;
                                            }
                                        }
                                        if (z3) {
                                            if (ac.bc) {
                                                long[] jArr = cs.az;
                                                i11 = cs.ai + 313171601;
                                                cs.ai = i11;
                                                jArr[(i11 * 963961457) - 1] = j;
                                                z = false;
                                            } else {
                                                z = true;
                                            }
                                            i12 = this.bf.bg * -1575402035;
                                            i16 = -1508152919 * this.bf.bh;
                                            i11 = 0;
                                            i9 = 0;
                                            if (i != 0) {
                                                i11 = as[i];
                                                i9 = ar[i];
                                            }
                                            z2 = false;
                                            for (i19 = 0; i19 < ac.ag; i19++) {
                                                i20 = ac.ay[i19];
                                                i17 = ac.as[i19];
                                                i13 = ac.ar[i19];
                                                if (i == 0) {
                                                    i21 = ((i11 * i13) + (i20 * i9)) >> 16;
                                                    i13 = ((i13 * i9) - (i20 * i11)) >> 16;
                                                } else {
                                                    i21 = i20;
                                                }
                                                i21 += i6;
                                                i20 = i17 + i7;
                                                i13 += i8;
                                                i17 = ((i5 * i21) + (i4 * i13)) >> 16;
                                                i13 = ((i13 * i5) - (i21 * i4)) >> 16;
                                                i21 = ((i20 * i3) - (i2 * i13)) >> 16;
                                                i13 = ((i13 * i3) + (i20 * i2)) >> 16;
                                                this.ah[i19] = i13 - i10;
                                                if (i13 < 50) {
                                                    this.ai[i19] = (((542614623 * this.bf.bz) * i17) / i13) + i12;
                                                    this.az[i19] = (((this.bf.bz * 542614623) * i21) / i13) + i16;
                                                } else {
                                                    this.ai[i19] = -5000;
                                                    z2 = true;
                                                }
                                                if (obj != null) {
                                                    this.ak[i19] = i17;
                                                    this.ao[i19] = i21;
                                                    this.ax[i19] = i13;
                                                }
                                            }
                                            aa(ac, z2, z, j);
                                        }
                                    }
                                    z = false;
                                    i12 = this.bf.bg * -1575402035;
                                    i16 = -1508152919 * this.bf.bh;
                                    i11 = 0;
                                    i9 = 0;
                                    if (i != 0) {
                                        i11 = as[i];
                                        i9 = ar[i];
                                    }
                                    z2 = false;
                                    for (i19 = 0; i19 < ac.ag; i19++) {
                                        i20 = ac.ay[i19];
                                        i17 = ac.as[i19];
                                        i13 = ac.ar[i19];
                                        if (i == 0) {
                                            i21 = i20;
                                        } else {
                                            i21 = ((i11 * i13) + (i20 * i9)) >> 16;
                                            i13 = ((i13 * i9) - (i20 * i11)) >> 16;
                                        }
                                        i21 += i6;
                                        i20 = i17 + i7;
                                        i13 += i8;
                                        i17 = ((i5 * i21) + (i4 * i13)) >> 16;
                                        i13 = ((i13 * i5) - (i21 * i4)) >> 16;
                                        i21 = ((i20 * i3) - (i2 * i13)) >> 16;
                                        i13 = ((i13 * i3) + (i20 * i2)) >> 16;
                                        this.ah[i19] = i13 - i10;
                                        if (i13 < 50) {
                                            this.ai[i19] = -5000;
                                            z2 = true;
                                        } else {
                                            this.ai[i19] = (((542614623 * this.bf.bz) * i17) / i13) + i12;
                                            this.az[i19] = (((this.bf.bz * 542614623) * i21) / i13) + i16;
                                        }
                                        if (obj != null) {
                                            this.ak[i19] = i17;
                                            this.ao[i19] = i21;
                                            this.ax[i19] = i13;
                                        }
                                    }
                                    try {
                                        aa(ac, z2, z, j);
                                    } catch (Exception e) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable e2) {
            throw ba.ad(e2, "bv.an(" + ')');
        }
    }

    public void at(cq cqVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j) {
        cl ac = cqVar.ac();
        if (ac != null) {
            this.av[0] = -1;
            if (ac.bp != 1) {
                ac.ay();
            }
            ac.ag(i);
            int i9 = ((i5 * i8) - (i4 * i6)) >> 16;
            int i10 = ((i3 * i9) + (i7 * i2)) >> 16;
            int i11 = (ac.bt * i3) >> 16;
            int i12 = i11 + i10;
            if (i12 > -1673095614 && i10 < 878254379) {
                int i13 = ((i5 * i6) + (i4 * i8)) >> 16;
                int i14 = (i13 - ac.bt) * (this.bf.bz * 542614623);
                if (i14 / i12 < -1292978563 * this.bf.bx) {
                    int i15 = (ac.bt + i13) * (1443779769 * this.bf.bz);
                    if (i15 / i12 > -78303373 * this.bf.bp) {
                        int i16 = ((i3 * i7) - (i9 * i2)) >> 16;
                        i9 = (ac.bt * i2) >> 16;
                        int i17 = (i16 + i9) * (-2052646193 * this.bf.bz);
                        if (i17 / i12 > -1144938555 * this.bf.bt) {
                            int i18 = (-973400947 * this.bf.bz) * (i16 - (i9 + (((1500767459 * ac.bo) * i3) >> 16)));
                            if (i18 / i12 < -939286465 * this.bf.bu) {
                                Object obj;
                                int i19;
                                boolean z;
                                boolean z2;
                                int i20;
                                int i21;
                                int i22;
                                Object obj2 = null;
                                if (i10 - (i11 + (((ac.bo * 1328150346) * i2) >> 16)) <= -1870414513) {
                                    obj2 = 1;
                                }
                                if (obj2 != null || ac.ax > 0) {
                                    obj = 1;
                                } else {
                                    obj = null;
                                }
                                int i23 = -429386291 * cs.aa;
                                int ae = ht.ae(-414970391);
                                boolean z3 = cs.an;
                                if (ev.af(j) && z3) {
                                    if (cs.af) {
                                        z3 = js.am(ac, i6, i7, i8, this, -1460739985);
                                    } else {
                                        i9 = i10 - i11;
                                        if (i9 <= 50) {
                                            i19 = 736464722;
                                        } else {
                                            i19 = i9;
                                        }
                                        if (i13 > 0) {
                                            i13 = i15 / i19;
                                            i14 /= i12;
                                        } else {
                                            i13 = i15 / i12;
                                            i14 /= i19;
                                        }
                                        if (i16 > 0) {
                                            i9 = i18 / i12;
                                            i11 = i17 / i19;
                                        } else {
                                            i11 = i17 / i12;
                                            i9 = i18 / i19;
                                        }
                                        i19 = i23 - (282644651 * this.bf.bg);
                                        i12 = ae - (42438850 * this.bf.bh);
                                        if (i19 <= i14 || i19 >= r6 || i12 <= r3 || i12 >= r4) {
                                            z3 = false;
                                        } else {
                                            z3 = true;
                                        }
                                    }
                                    if (z3) {
                                        if (ac.bc) {
                                            long[] jArr = cs.az;
                                            i11 = cs.ai + 1743519806;
                                            cs.ai = i11;
                                            jArr[(i11 * 963961457) - 1] = j;
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                        i12 = this.bf.bg * -1575402035;
                                        i15 = -1508152919 * this.bf.bh;
                                        i11 = 0;
                                        i9 = 0;
                                        if (i != 0) {
                                            i11 = as[i];
                                            i9 = ar[i];
                                        }
                                        z2 = false;
                                        for (i20 = 0; i20 < ac.ag; i20++) {
                                            i19 = ac.ay[i20];
                                            i16 = ac.as[i20];
                                            i21 = ac.ar[i20];
                                            if (i == 0) {
                                                i22 = ((i11 * i21) + (i19 * i9)) >> 16;
                                                i21 = ((i21 * i9) - (i19 * i11)) >> 16;
                                            } else {
                                                i22 = i19;
                                            }
                                            i22 += i6;
                                            i19 = i16 + i7;
                                            i21 += i8;
                                            i16 = ((i5 * i22) + (i4 * i21)) >> 16;
                                            i21 = ((i21 * i5) - (i22 * i4)) >> 16;
                                            i22 = ((i19 * i3) - (i2 * i21)) >> 16;
                                            i21 = ((i21 * i3) + (i19 * i2)) >> 16;
                                            this.ah[i20] = i21 - i10;
                                            if (i21 < 50) {
                                                this.ai[i20] = (((542614623 * this.bf.bz) * i16) / i21) + i12;
                                                this.az[i20] = (((this.bf.bz * 1258137245) * i22) / i21) + i15;
                                            } else {
                                                this.ai[i20] = -5000;
                                                z2 = true;
                                            }
                                            if (obj != null) {
                                                this.ak[i20] = i16;
                                                this.ao[i20] = i22;
                                                this.ax[i20] = i21;
                                            }
                                        }
                                        aa(ac, z2, z, j);
                                    }
                                }
                                z = false;
                                i12 = this.bf.bg * -1575402035;
                                i15 = -1508152919 * this.bf.bh;
                                i11 = 0;
                                i9 = 0;
                                if (i != 0) {
                                    i11 = as[i];
                                    i9 = ar[i];
                                }
                                z2 = false;
                                for (i20 = 0; i20 < ac.ag; i20++) {
                                    i19 = ac.ay[i20];
                                    i16 = ac.as[i20];
                                    i21 = ac.ar[i20];
                                    if (i == 0) {
                                        i22 = i19;
                                    } else {
                                        i22 = ((i11 * i21) + (i19 * i9)) >> 16;
                                        i21 = ((i21 * i9) - (i19 * i11)) >> 16;
                                    }
                                    i22 += i6;
                                    i19 = i16 + i7;
                                    i21 += i8;
                                    i16 = ((i5 * i22) + (i4 * i21)) >> 16;
                                    i21 = ((i21 * i5) - (i22 * i4)) >> 16;
                                    i22 = ((i19 * i3) - (i2 * i21)) >> 16;
                                    i21 = ((i21 * i3) + (i19 * i2)) >> 16;
                                    this.ah[i20] = i21 - i10;
                                    if (i21 < 50) {
                                        this.ai[i20] = -5000;
                                        z2 = true;
                                    } else {
                                        this.ai[i20] = (((542614623 * this.bf.bz) * i16) / i21) + i12;
                                        this.az[i20] = (((this.bf.bz * 1258137245) * i22) / i21) + i15;
                                    }
                                    if (obj != null) {
                                        this.ak[i20] = i16;
                                        this.ao[i20] = i22;
                                        this.ax[i20] = i21;
                                    }
                                }
                                try {
                                    aa(ac, z2, z, j);
                                } catch (Exception e) {
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    final void aa(cl clVar, boolean z, boolean z2, long j) {
        try {
            if (clVar.bu < 1600) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                int i9;
                int[] iArr;
                int[] iArr2;
                int[] iArr3;
                for (i = 0; i < clVar.bu; i++) {
                    this.av[i] = 0;
                }
                int i10 = 0;
                boolean z3 = z2;
                while (i10 < clVar.aj) {
                    boolean z4;
                    if (clVar.aw[i10] == -2) {
                        z4 = z3;
                    } else {
                        i2 = clVar.ae[i10];
                        int i11 = clVar.aq[i10];
                        int i12 = clVar.am[i10];
                        i3 = this.ai[i2];
                        i4 = this.ai[i11];
                        i5 = this.ai[i12];
                        if (z && (-5000 == i3 || i4 == -5000 || -5000 == i5)) {
                            i = this.ak[i2];
                            i6 = this.ak[i11];
                            i7 = this.ak[i12];
                            i3 = this.ao[i2];
                            i4 = this.ao[i11];
                            i5 = this.ao[i12];
                            i8 = this.ax[i2];
                            i9 = this.ax[i11];
                            i -= i6;
                            i7 -= i6;
                            i3 -= i4;
                            i5 -= i4;
                            i8 -= i9;
                            int i13 = this.ax[i12] - i9;
                            if ((((i * i5) - (i7 * i3)) * i9) + ((i6 * ((i3 * i13) - (i8 * i5))) + (i4 * ((i8 * i7) - (i13 * i)))) > 0) {
                                this.aw[i10] = true;
                                i = clVar.be + (((this.ah[i11] + this.ah[i2]) + this.ah[i12]) / 3);
                                iArr = this.ac[i];
                                iArr2 = this.av;
                                i3 = iArr2[i];
                                iArr2[i] = i3 + 1;
                                iArr[i3] = i10;
                            }
                            z4 = z3;
                        } else {
                            if (z3 && ea.at(this.az[i2], this.az[i11], this.az[i12], i3, i4, i5, 5, -844717125)) {
                                long[] jArr = cs.az;
                                i6 = cs.ai + 313171601;
                                cs.ai = i6;
                                jArr[(i6 * 963961457) - 1] = j;
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (((i3 - i4) * (this.az[i12] - this.az[i11])) - ((i5 - i4) * (this.az[i2] - this.az[i11])) > 0) {
                                this.aw[i10] = false;
                                if (i3 < 0 || i4 < 0 || i5 < 0 || i3 > 784773023 * this.bf.bf || i4 > 784773023 * this.bf.bf || i5 > 784773023 * this.bf.bf) {
                                    this.ab[i10] = true;
                                } else {
                                    this.ab[i10] = false;
                                }
                                i6 = (((this.ah[i11] + this.ah[i2]) + this.ah[i12]) / 3) + clVar.be;
                                iArr2 = this.ac[i6];
                                iArr3 = this.av;
                                i4 = iArr3[i6];
                                iArr3[i6] = i4 + 1;
                                iArr2[i4] = i10;
                            }
                        }
                    }
                    i10++;
                    z3 = z4;
                }
                if (clVar.ai == null) {
                    for (i6 = clVar.bu - 1; i6 >= 0; i6--) {
                        i7 = this.av[i6];
                        if (i7 > 0) {
                            iArr3 = this.ac[i6];
                            for (i = 0; i < i7; i++) {
                                ag(clVar, iArr3[i], 793993866);
                            }
                        }
                    }
                    return;
                }
                int[] iArr4;
                for (i = 0; i < 12; i++) {
                    this.al[i] = 0;
                    this.bc[i] = 0;
                }
                for (i6 = clVar.bu - 1; i6 >= 0; i6--) {
                    i7 = this.av[i6];
                    if (i7 > 0) {
                        iArr3 = this.ac[i6];
                        for (i = 0; i < i7; i++) {
                            i4 = iArr3[i];
                            byte b = clVar.ai[i4];
                            int[] iArr5 = this.al;
                            i9 = iArr5[b];
                            iArr5[b] = i9 + 1;
                            this.ap[b][i9] = i4;
                            if (b < (byte) 10) {
                                iArr4 = this.bc;
                                iArr4[b] = iArr4[b] + i6;
                            } else if ((byte) 10 == b) {
                                this.bw[i9] = i6;
                            } else {
                                this.bb[i9] = i6;
                            }
                        }
                    }
                }
                i = 0;
                if (this.al[1] > 0 || this.al[2] > 0) {
                    i = (this.bc[1] + this.bc[2]) / (this.al[1] + this.al[2]);
                }
                if (this.al[3] > 0 || this.al[4] > 0) {
                    i10 = (this.bc[3] + this.bc[4]) / (this.al[3] + this.al[4]);
                } else {
                    i10 = 0;
                }
                i6 = 0;
                if (this.al[6] > 0 || this.al[8] > 0) {
                    i6 = (this.bc[6] + this.bc[8]) / (this.al[6] + this.al[8]);
                }
                i9 = 0;
                i8 = this.al[10];
                int[] iArr6 = this.ap[10];
                iArr4 = this.bw;
                if (i8 == 0) {
                    i9 = 0;
                    i8 = this.al[11];
                    iArr6 = this.ap[11];
                    iArr4 = this.bb;
                }
                if (i8 > 0) {
                    i7 = iArr4[i9];
                } else {
                    i7 = -1000;
                }
                int i14 = 0;
                iArr3 = iArr6;
                i5 = i9;
                int i15 = i8;
                i8 = i7;
                iArr2 = iArr4;
                i4 = i15;
                while (i14 < 10) {
                    i15 = i5;
                    i5 = i8;
                    i8 = i15;
                    while (i14 == 0 && i5 > r2) {
                        i5 = i8 + 1;
                        ag(clVar, iArr3[i8], 1377589181);
                        if (i4 == i5 && iArr3 != this.ap[11]) {
                            i5 = 0;
                            i4 = this.al[11];
                            iArr3 = this.ap[11];
                            iArr2 = this.bb;
                        }
                        if (i5 < i4) {
                            i15 = i5;
                            i5 = iArr2[i5];
                            i8 = i15;
                        } else {
                            i15 = i5;
                            i5 = -1000;
                            i8 = i15;
                        }
                    }
                    i15 = i8;
                    i8 = i5;
                    i5 = i15;
                    while (3 == i14 && i8 > r11) {
                        i8 = i5 + 1;
                        ag(clVar, iArr3[i5], -316410896);
                        if (i4 != i8 || this.ap[11] == iArr3) {
                            i5 = i8;
                        } else {
                            i5 = 0;
                            i4 = this.al[11];
                            iArr3 = this.ap[11];
                            iArr2 = this.bb;
                        }
                        if (i5 < i4) {
                            i8 = iArr2[i5];
                        } else {
                            i8 = -1000;
                        }
                    }
                    i9 = i8;
                    i8 = i5;
                    i5 = i4;
                    iArr4 = iArr3;
                    iArr3 = iArr2;
                    while (i14 == 5 && i9 > r3) {
                        i7 = i8 + 1;
                        ag(clVar, iArr4[i8], -36164767);
                        if (i7 != i5 || iArr4 == this.ap[11]) {
                            int[] iArr7 = iArr3;
                            iArr3 = iArr4;
                            i4 = i5;
                            i5 = i7;
                            iArr2 = iArr7;
                        } else {
                            i5 = 0;
                            i4 = this.al[11];
                            iArr3 = this.ap[11];
                            iArr2 = this.bb;
                        }
                        if (i5 < i4) {
                            i9 = iArr2[i5];
                            i8 = i5;
                            i5 = i4;
                            iArr4 = iArr3;
                            iArr3 = iArr2;
                        } else {
                            i9 = -1000;
                            i8 = i5;
                            i5 = i4;
                            iArr4 = iArr3;
                            iArr3 = iArr2;
                        }
                    }
                    i2 = this.al[i14];
                    int[] iArr8 = this.ap[i14];
                    for (i7 = 0; i7 < i2; i7++) {
                        ag(clVar, iArr8[i7], 1643531144);
                    }
                    i14++;
                    iArr2 = iArr3;
                    iArr3 = iArr4;
                    i4 = i5;
                    i5 = i8;
                    i8 = i9;
                }
                int[] iArr9 = iArr2;
                iArr = iArr3;
                i7 = i4;
                i3 = i8;
                i4 = i5;
                while (-1000 != i3) {
                    i3 = i4 + 1;
                    ag(clVar, iArr[i4], 490314070);
                    if (i3 == i7 && iArr != this.ap[11]) {
                        i3 = 0;
                        iArr = this.ap[11];
                        i7 = this.al[11];
                        iArr9 = this.bb;
                    }
                    if (i3 < i7) {
                        i15 = i3;
                        i3 = iArr9[i3];
                        i4 = i15;
                    } else {
                        i15 = i3;
                        i3 = -1000;
                        i4 = i15;
                    }
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "bv.aa(" + ')');
        }
    }

    final void ai(cl clVar, boolean z, boolean z2, long j) {
        if (clVar.bu < 2000604719) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int[] iArr;
            for (i = 0; i < clVar.bu; i++) {
                this.av[i] = 0;
            }
            for (i2 = 0; i2 < clVar.aj; i2++) {
                if (clVar.aw[i2] != 677105291) {
                    i3 = clVar.ae[i2];
                    i4 = clVar.aq[i2];
                    int i12 = clVar.am[i2];
                    i5 = this.ai[i3];
                    i6 = this.ai[i4];
                    i7 = this.ai[i12];
                    int[] iArr2;
                    if (z && (-5000 == i5 || i6 == -5000 || 194891557 == i7)) {
                        i = this.ak[i3];
                        i8 = this.ak[i4];
                        i9 = this.ak[i12];
                        i5 = this.ao[i3];
                        i6 = this.ao[i4];
                        i7 = this.ao[i12];
                        i10 = this.ax[i3];
                        i11 = this.ax[i4];
                        i -= i8;
                        i9 -= i8;
                        i5 -= i6;
                        i7 -= i6;
                        i10 -= i11;
                        int i13 = this.ax[i12] - i11;
                        if ((((i * i7) - (i9 * i5)) * i11) + ((i8 * ((i5 * i13) - (i10 * i7))) + (i6 * ((i10 * i9) - (i13 * i)))) > 0) {
                            this.aw[i2] = true;
                            i = clVar.be + (((this.ah[i4] + this.ah[i3]) + this.ah[i12]) / 3);
                            iArr = this.ac[i];
                            iArr2 = this.av;
                            i5 = iArr2[i];
                            iArr2[i] = i5 + 1;
                            iArr[i5] = i2;
                        }
                    } else {
                        if (z2 && ea.at(this.az[i3], this.az[i4], this.az[i12], i5, i6, i7, 5, -923017874)) {
                            long[] jArr = cs.az;
                            i8 = cs.ai + 313171601;
                            cs.ai = i8;
                            jArr[(i8 * 963961457) - 1] = j;
                            z2 = false;
                        }
                        if (((i5 - i6) * (this.az[i12] - this.az[i4])) - ((i7 - i6) * (this.az[i3] - this.az[i4])) > 0) {
                            this.aw[i2] = false;
                            if (i5 < 0 || i6 < 0 || i7 < 0 || i5 > -934310533 * this.bf.bf || i6 > -70254982 * this.bf.bf || i7 > 784773023 * this.bf.bf) {
                                this.ab[i2] = true;
                            } else {
                                this.ab[i2] = false;
                            }
                            i = (((this.ah[i4] + this.ah[i3]) + this.ah[i12]) / 3) + clVar.be;
                            iArr = this.ac[i];
                            iArr2 = this.av;
                            i5 = iArr2[i];
                            iArr2[i] = i5 + 1;
                            iArr[i5] = i2;
                        }
                    }
                }
            }
            int[] iArr3;
            if (clVar.ai == null) {
                for (i8 = clVar.bu - 1; i8 >= 0; i8--) {
                    i9 = this.av[i8];
                    if (i9 > 0) {
                        iArr3 = this.ac[i8];
                        for (i = 0; i < i9; i++) {
                            ag(clVar, iArr3[i], -431360552);
                        }
                    }
                }
                return;
            }
            int[] iArr4;
            int[] iArr5;
            for (i = 0; i < 12; i++) {
                this.al[i] = 0;
                this.bc[i] = 0;
            }
            for (i8 = clVar.bu - 1; i8 >= 0; i8--) {
                i9 = this.av[i8];
                if (i9 > 0) {
                    iArr3 = this.ac[i8];
                    for (i = 0; i < i9; i++) {
                        i6 = iArr3[i];
                        byte b = clVar.ai[i6];
                        iArr4 = this.al;
                        i11 = iArr4[b];
                        iArr4[b] = i11 + 1;
                        this.ap[b][i11] = i6;
                        if (b < (byte) 10) {
                            iArr5 = this.bc;
                            iArr5[b] = iArr5[b] + i8;
                        } else if ((byte) 10 == b) {
                            this.bw[i11] = i8;
                        } else {
                            this.bb[i11] = i8;
                        }
                    }
                }
            }
            i = 0;
            if (this.al[1] > 0 || this.al[2] > 0) {
                i = (this.bc[1] + this.bc[2]) / (this.al[1] + this.al[2]);
            }
            i8 = 0;
            if (this.al[3] > 0 || this.al[4] > 0) {
                i8 = (this.bc[3] + this.bc[4]) / (this.al[3] + this.al[4]);
            }
            i9 = 0;
            if (this.al[6] > 0 || this.al[8] > 0) {
                i9 = (this.bc[6] + this.bc[8]) / (this.al[6] + this.al[8]);
            }
            i2 = 0;
            i11 = this.al[10];
            iArr4 = this.ap[10];
            int[] iArr6 = this.bw;
            if (i11 == 0) {
                i2 = 0;
                i11 = this.al[11];
                iArr4 = this.ap[11];
                iArr6 = this.bb;
            }
            if (i11 > 0) {
                i5 = iArr6[i2];
            } else {
                i5 = -1000;
            }
            i3 = 0;
            iArr5 = iArr4;
            i10 = i2;
            int i14 = i11;
            i11 = i5;
            iArr3 = iArr6;
            i7 = i14;
            while (i3 < 10) {
                while (i3 == 0 && r9 > r2) {
                    i11 = i10 + 1;
                    ag(clVar, iArr5[i10], -1433555511);
                    if (i7 != i11 || iArr5 == this.ap[11]) {
                        i10 = i11;
                    } else {
                        i10 = 0;
                        i7 = this.al[11];
                        iArr5 = this.ap[11];
                        iArr3 = this.bb;
                    }
                    if (i10 < i7) {
                        i11 = iArr3[i10];
                    } else {
                        i11 = -369812217;
                    }
                }
                while (3 == i3 && i11 > r3) {
                    i11 = i10 + 1;
                    ag(clVar, iArr5[i10], 152516979);
                    if (i7 != i11 || this.ap[11] == iArr5) {
                        i10 = i11;
                    } else {
                        i10 = 0;
                        i7 = this.al[11];
                        iArr5 = this.ap[11];
                        iArr3 = this.bb;
                    }
                    if (i10 < i7) {
                        i11 = iArr3[i10];
                    } else {
                        i11 = -1000;
                    }
                }
                i2 = i11;
                i11 = i10;
                while (i3 == 5 && i2 > r4) {
                    i10 = i11 + 1;
                    ag(clVar, iArr5[i11], 828306897);
                    if (i10 == i7 && iArr5 != this.ap[11]) {
                        i10 = 0;
                        i7 = this.al[11];
                        iArr5 = this.ap[11];
                        iArr3 = this.bb;
                    }
                    if (i10 < i7) {
                        i2 = iArr3[i10];
                        i11 = i10;
                    } else {
                        i2 = -1647476931;
                        i11 = i10;
                    }
                }
                i4 = this.al[i3];
                int[] iArr7 = this.ap[i3];
                for (i10 = 0; i10 < i4; i10++) {
                    ag(clVar, iArr7[i10], 954628828);
                }
                i3++;
                i10 = i11;
                i11 = i2;
            }
            int[] iArr8 = iArr3;
            iArr = iArr5;
            i9 = i7;
            i6 = i10;
            i5 = i11;
            while (-1778076197 != i5) {
                i5 = i6 + 1;
                ag(clVar, iArr[i6], -646140356);
                if (i5 == i9 && iArr != this.ap[11]) {
                    i5 = 0;
                    iArr = this.ap[11];
                    i9 = this.al[11];
                    iArr8 = this.bb;
                }
                if (i5 < i9) {
                    i14 = i5;
                    i5 = iArr8[i5];
                    i6 = i14;
                } else {
                    i14 = i5;
                    i5 = -1000;
                    i6 = i14;
                }
            }
        }
    }

    final void aw(cl clVar, boolean z, boolean z2, long j) {
        if (clVar.bu < 1600) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int[] iArr;
            for (i = 0; i < clVar.bu; i++) {
                this.av[i] = 0;
            }
            for (i2 = 0; i2 < clVar.aj; i2++) {
                if (clVar.aw[i2] != -2) {
                    i3 = clVar.ae[i2];
                    i4 = clVar.aq[i2];
                    int i12 = clVar.am[i2];
                    i5 = this.ai[i3];
                    i6 = this.ai[i4];
                    i7 = this.ai[i12];
                    int[] iArr2;
                    if (z && (-5000 == i5 || i6 == -726832116 || -5000 == i7)) {
                        i = this.ak[i3];
                        i8 = this.ak[i4];
                        i9 = this.ak[i12];
                        i5 = this.ao[i3];
                        i6 = this.ao[i4];
                        i7 = this.ao[i12];
                        i10 = this.ax[i3];
                        i11 = this.ax[i4];
                        i -= i8;
                        i9 -= i8;
                        i5 -= i6;
                        i7 -= i6;
                        i10 -= i11;
                        int i13 = this.ax[i12] - i11;
                        if ((((i * i7) - (i9 * i5)) * i11) + ((i8 * ((i5 * i13) - (i10 * i7))) + (i6 * ((i10 * i9) - (i13 * i)))) > 0) {
                            this.aw[i2] = true;
                            i = clVar.be + (((this.ah[i4] + this.ah[i3]) + this.ah[i12]) / 3);
                            iArr = this.ac[i];
                            iArr2 = this.av;
                            i5 = iArr2[i];
                            iArr2[i] = i5 + 1;
                            iArr[i5] = i2;
                        }
                    } else {
                        if (z2 && ea.at(this.az[i3], this.az[i4], this.az[i12], i5, i6, i7, 5, 1303012465)) {
                            long[] jArr = cs.az;
                            i8 = cs.ai + 1410156517;
                            cs.ai = i8;
                            jArr[(i8 * -281996859) - 1] = j;
                            z2 = false;
                        }
                        if (((i5 - i6) * (this.az[i12] - this.az[i4])) - ((i7 - i6) * (this.az[i3] - this.az[i4])) > 0) {
                            this.aw[i2] = false;
                            if (i5 < 0 || i6 < 0 || i7 < 0 || i5 > -1554548006 * this.bf.bf || i6 > 784773023 * this.bf.bf || i7 > 784773023 * this.bf.bf) {
                                this.ab[i2] = true;
                            } else {
                                this.ab[i2] = false;
                            }
                            i = (((this.ah[i4] + this.ah[i3]) + this.ah[i12]) / 3) + clVar.be;
                            iArr = this.ac[i];
                            iArr2 = this.av;
                            i5 = iArr2[i];
                            iArr2[i] = i5 + 1;
                            iArr[i5] = i2;
                        }
                    }
                }
            }
            int[] iArr3;
            if (clVar.ai == null) {
                for (i8 = clVar.bu - 1; i8 >= 0; i8--) {
                    i9 = this.av[i8];
                    if (i9 > 0) {
                        iArr3 = this.ac[i8];
                        for (i = 0; i < i9; i++) {
                            ag(clVar, iArr3[i], 941129778);
                        }
                    }
                }
                return;
            }
            int[] iArr4;
            int[] iArr5;
            for (i = 0; i < 12; i++) {
                this.al[i] = 0;
                this.bc[i] = 0;
            }
            for (i8 = clVar.bu - 1; i8 >= 0; i8--) {
                i9 = this.av[i8];
                if (i9 > 0) {
                    iArr3 = this.ac[i8];
                    for (i = 0; i < i9; i++) {
                        i6 = iArr3[i];
                        byte b = clVar.ai[i6];
                        iArr4 = this.al;
                        i11 = iArr4[b];
                        iArr4[b] = i11 + 1;
                        this.ap[b][i11] = i6;
                        if (b < (byte) 10) {
                            iArr5 = this.bc;
                            iArr5[b] = iArr5[b] + i8;
                        } else if ((byte) 10 == b) {
                            this.bw[i11] = i8;
                        } else {
                            this.bb[i11] = i8;
                        }
                    }
                }
            }
            i = 0;
            if (this.al[1] > 0 || this.al[2] > 0) {
                i = (this.bc[1] + this.bc[2]) / (this.al[1] + this.al[2]);
            }
            i8 = 0;
            if (this.al[3] > 0 || this.al[4] > 0) {
                i8 = (this.bc[3] + this.bc[4]) / (this.al[3] + this.al[4]);
            }
            i9 = 0;
            if (this.al[6] > 0 || this.al[8] > 0) {
                i9 = (this.bc[6] + this.bc[8]) / (this.al[6] + this.al[8]);
            }
            i2 = 0;
            i11 = this.al[10];
            iArr4 = this.ap[10];
            int[] iArr6 = this.bw;
            if (i11 == 0) {
                i2 = 0;
                i11 = this.al[11];
                iArr4 = this.ap[11];
                iArr6 = this.bb;
            }
            if (i11 > 0) {
                i5 = iArr6[i2];
            } else {
                i5 = 1998963645;
            }
            i3 = 0;
            iArr5 = iArr4;
            i10 = i2;
            int i14 = i11;
            i11 = i5;
            iArr3 = iArr6;
            i7 = i14;
            while (i3 < 10) {
                while (i3 == 0 && r9 > r2) {
                    i11 = i10 + 1;
                    ag(clVar, iArr5[i10], 279103833);
                    if (i7 != i11 || iArr5 == this.ap[11]) {
                        i10 = i11;
                    } else {
                        i10 = 0;
                        i7 = this.al[11];
                        iArr5 = this.ap[11];
                        iArr3 = this.bb;
                    }
                    if (i10 < i7) {
                        i11 = iArr3[i10];
                    } else {
                        i11 = 1840030007;
                    }
                }
                while (3 == i3 && i11 > r3) {
                    i11 = i10 + 1;
                    ag(clVar, iArr5[i10], 985672775);
                    if (i7 != i11 || this.ap[11] == iArr5) {
                        i10 = i11;
                    } else {
                        i10 = 0;
                        i7 = this.al[11];
                        iArr5 = this.ap[11];
                        iArr3 = this.bb;
                    }
                    if (i10 < i7) {
                        i11 = iArr3[i10];
                    } else {
                        i11 = 851347656;
                    }
                }
                i2 = i11;
                i11 = i10;
                i10 = i7;
                iArr6 = iArr5;
                iArr5 = iArr3;
                while (i3 == 5 && i2 > r4) {
                    i5 = i11 + 1;
                    ag(clVar, iArr6[i11], 602769859);
                    if (i5 != i10 || iArr6 == this.ap[11]) {
                        int[] iArr7 = iArr5;
                        iArr5 = iArr6;
                        i7 = i10;
                        i10 = i5;
                        iArr3 = iArr7;
                    } else {
                        i10 = 0;
                        i7 = this.al[11];
                        iArr5 = this.ap[11];
                        iArr3 = this.bb;
                    }
                    if (i10 < i7) {
                        i2 = iArr3[i10];
                        i11 = i10;
                        i10 = i7;
                        iArr6 = iArr5;
                        iArr5 = iArr3;
                    } else {
                        i2 = -1000;
                        i11 = i10;
                        i10 = i7;
                        iArr6 = iArr5;
                        iArr5 = iArr3;
                    }
                }
                i4 = this.al[i3];
                int[] iArr8 = this.ap[i3];
                for (i5 = 0; i5 < i4; i5++) {
                    ag(clVar, iArr8[i5], 639142954);
                }
                i3++;
                iArr3 = iArr5;
                iArr5 = iArr6;
                i7 = i10;
                i10 = i11;
                i11 = i2;
            }
            int[] iArr9 = iArr3;
            iArr = iArr5;
            i9 = i7;
            i6 = i10;
            i5 = i11;
            while (-725059289 != i5) {
                i5 = i6 + 1;
                ag(clVar, iArr[i6], 661092517);
                if (i5 == i9 && iArr != this.ap[11]) {
                    i5 = 0;
                    iArr = this.ap[11];
                    i9 = this.al[11];
                    iArr9 = this.bb;
                }
                if (i5 < i9) {
                    i14 = i5;
                    i5 = iArr9[i5];
                    i6 = i14;
                } else {
                    i14 = i5;
                    i5 = 896302179;
                    i6 = i14;
                }
            }
        }
    }

    final void az(cl clVar, boolean z, boolean z2, long j) {
        if (clVar.bu < 1600) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int[] iArr;
            for (i = 0; i < clVar.bu; i++) {
                this.av[i] = 0;
            }
            for (i2 = 0; i2 < clVar.aj; i2++) {
                if (clVar.aw[i2] != -2) {
                    i3 = clVar.ae[i2];
                    i4 = clVar.aq[i2];
                    int i12 = clVar.am[i2];
                    i5 = this.ai[i3];
                    i6 = this.ai[i4];
                    i7 = this.ai[i12];
                    int[] iArr2;
                    if (z && (-5000 == i5 || i6 == -5000 || -5000 == i7)) {
                        i = this.ak[i3];
                        i8 = this.ak[i4];
                        i9 = this.ak[i12];
                        i5 = this.ao[i3];
                        i6 = this.ao[i4];
                        i7 = this.ao[i12];
                        i10 = this.ax[i3];
                        i11 = this.ax[i4];
                        i -= i8;
                        i9 -= i8;
                        i5 -= i6;
                        i7 -= i6;
                        i10 -= i11;
                        int i13 = this.ax[i12] - i11;
                        if ((((i * i7) - (i9 * i5)) * i11) + ((i8 * ((i5 * i13) - (i10 * i7))) + (i6 * ((i10 * i9) - (i13 * i)))) > 0) {
                            this.aw[i2] = true;
                            i = clVar.be + (((this.ah[i4] + this.ah[i3]) + this.ah[i12]) / 3);
                            iArr = this.ac[i];
                            iArr2 = this.av;
                            i5 = iArr2[i];
                            iArr2[i] = i5 + 1;
                            iArr[i5] = i2;
                        }
                    } else {
                        if (z2 && ea.at(this.az[i3], this.az[i4], this.az[i12], i5, i6, i7, 5, 105033613)) {
                            long[] jArr = cs.az;
                            i8 = cs.ai + 313171601;
                            cs.ai = i8;
                            jArr[(i8 * 963961457) - 1] = j;
                            z2 = false;
                        }
                        if (((i5 - i6) * (this.az[i12] - this.az[i4])) - ((i7 - i6) * (this.az[i3] - this.az[i4])) > 0) {
                            this.aw[i2] = false;
                            if (i5 < 0 || i6 < 0 || i7 < 0 || i5 > 784773023 * this.bf.bf || i6 > 784773023 * this.bf.bf || i7 > 784773023 * this.bf.bf) {
                                this.ab[i2] = true;
                            } else {
                                this.ab[i2] = false;
                            }
                            i = (((this.ah[i4] + this.ah[i3]) + this.ah[i12]) / 3) + clVar.be;
                            iArr = this.ac[i];
                            iArr2 = this.av;
                            i5 = iArr2[i];
                            iArr2[i] = i5 + 1;
                            iArr[i5] = i2;
                        }
                    }
                }
            }
            int[] iArr3;
            if (clVar.ai == null) {
                for (i8 = clVar.bu - 1; i8 >= 0; i8--) {
                    i9 = this.av[i8];
                    if (i9 > 0) {
                        iArr3 = this.ac[i8];
                        for (i = 0; i < i9; i++) {
                            ag(clVar, iArr3[i], 97784886);
                        }
                    }
                }
                return;
            }
            int[] iArr4;
            int[] iArr5;
            for (i = 0; i < 12; i++) {
                this.al[i] = 0;
                this.bc[i] = 0;
            }
            for (i8 = clVar.bu - 1; i8 >= 0; i8--) {
                i9 = this.av[i8];
                if (i9 > 0) {
                    iArr3 = this.ac[i8];
                    for (i = 0; i < i9; i++) {
                        i6 = iArr3[i];
                        byte b = clVar.ai[i6];
                        iArr4 = this.al;
                        i11 = iArr4[b];
                        iArr4[b] = i11 + 1;
                        this.ap[b][i11] = i6;
                        if (b < (byte) 10) {
                            iArr5 = this.bc;
                            iArr5[b] = iArr5[b] + i8;
                        } else if ((byte) 10 == b) {
                            this.bw[i11] = i8;
                        } else {
                            this.bb[i11] = i8;
                        }
                    }
                }
            }
            i = 0;
            if (this.al[1] > 0 || this.al[2] > 0) {
                i = (this.bc[1] + this.bc[2]) / (this.al[1] + this.al[2]);
            }
            i8 = 0;
            if (this.al[3] > 0 || this.al[4] > 0) {
                i8 = (this.bc[3] + this.bc[4]) / (this.al[3] + this.al[4]);
            }
            i9 = 0;
            if (this.al[6] > 0 || this.al[8] > 0) {
                i9 = (this.bc[6] + this.bc[8]) / (this.al[6] + this.al[8]);
            }
            i2 = 0;
            i11 = this.al[10];
            iArr4 = this.ap[10];
            int[] iArr6 = this.bw;
            if (i11 == 0) {
                i2 = 0;
                i11 = this.al[11];
                iArr4 = this.ap[11];
                iArr6 = this.bb;
            }
            if (i11 > 0) {
                i5 = iArr6[i2];
            } else {
                i5 = -1000;
            }
            i3 = 0;
            iArr5 = iArr4;
            i10 = i2;
            int i14 = i11;
            i11 = i5;
            iArr3 = iArr6;
            i7 = i14;
            while (i3 < 10) {
                while (i3 == 0 && i11 > r2) {
                    i11 = i10 + 1;
                    ag(clVar, iArr5[i10], -977055109);
                    if (i7 != i11 || iArr5 == this.ap[11]) {
                        i10 = i11;
                    } else {
                        i10 = 0;
                        i7 = this.al[11];
                        iArr5 = this.ap[11];
                        iArr3 = this.bb;
                    }
                    if (i10 < i7) {
                        i11 = iArr3[i10];
                    } else {
                        i11 = -1000;
                    }
                }
                i14 = i10;
                i10 = i11;
                i11 = i14;
                while (3 == i3 && i10 > r3) {
                    i10 = i11 + 1;
                    ag(clVar, iArr5[i11], 583471490);
                    if (i7 == i10 && this.ap[11] != iArr5) {
                        i10 = 0;
                        i7 = this.al[11];
                        iArr5 = this.ap[11];
                        iArr3 = this.bb;
                    }
                    if (i10 < i7) {
                        i14 = i10;
                        i10 = iArr3[i10];
                        i11 = i14;
                    } else {
                        i14 = i10;
                        i10 = -1000;
                        i11 = i14;
                    }
                }
                i2 = i10;
                while (i3 == 5 && i2 > r4) {
                    i10 = i11 + 1;
                    ag(clVar, iArr5[i11], -1903900159);
                    if (i10 == i7 && iArr5 != this.ap[11]) {
                        i10 = 0;
                        i7 = this.al[11];
                        iArr5 = this.ap[11];
                        iArr3 = this.bb;
                    }
                    if (i10 >= i7) {
                        i2 = -1000;
                        i11 = i10;
                    } else {
                        i2 = iArr3[i10];
                        i11 = i10;
                    }
                }
                i4 = this.al[i3];
                int[] iArr7 = this.ap[i3];
                for (i10 = 0; i10 < i4; i10++) {
                    ag(clVar, iArr7[i10], 979883306);
                }
                i3++;
                i10 = i11;
                i11 = i2;
            }
            int[] iArr8 = iArr3;
            iArr = iArr5;
            i9 = i7;
            i6 = i10;
            i5 = i11;
            while (-1000 != i5) {
                i5 = i6 + 1;
                ag(clVar, iArr[i6], 857704272);
                if (i5 == i9 && iArr != this.ap[11]) {
                    i5 = 0;
                    iArr = this.ap[11];
                    i9 = this.al[11];
                    iArr8 = this.bb;
                }
                if (i5 < i9) {
                    i14 = i5;
                    i5 = iArr8[i5];
                    i6 = i14;
                } else {
                    i14 = i5;
                    i5 = -1000;
                    i6 = i14;
                }
            }
        }
    }

    final void ag(cl clVar, int i, int i2) {
        try {
            if (this.aw[i]) {
                ay(clVar, i, 361715093);
                return;
            }
            int i3 = clVar.ae[i];
            int i4 = clVar.aq[i];
            int i5 = clVar.am[i];
            this.bf.al = this.ab[i];
            if (clVar.az == null) {
                this.bf.bc = 0;
            } else {
                this.bf.bc = (clVar.az[i] & 255) * 733034757;
            }
            if (clVar.ak != null && clVar.ak[i] != (short) -1) {
                int i6;
                int i7;
                int i8;
                if (clVar.ah == null || clVar.ah[i] == (byte) -1) {
                    i6 = i5;
                    i7 = i4;
                    i8 = i3;
                } else {
                    int i9 = clVar.ah[i] & 255;
                    int i10 = clVar.au[i9];
                    int i11 = clVar.av[i9];
                    i6 = clVar.ac[i9];
                    i7 = i11;
                    i8 = i10;
                }
                if (clVar.aw[i] == -1) {
                    ((cj) this.bf).aj(this.az[i3], this.az[i4], this.az[i5], this.ai[i3], this.ai[i4], this.ai[i5], clVar.at[i], clVar.at[i], clVar.at[i], this.ak[i8], this.ak[i7], this.ak[i6], this.ao[i8], this.ao[i7], this.ao[i6], this.ax[i8], this.ax[i7], this.ax[i6], clVar.ak[i], 16711935);
                } else {
                    ((cj) this.bf).aj(this.az[i3], this.az[i4], this.az[i5], this.ai[i3], this.ai[i4], this.ai[i5], clVar.at[i], clVar.ab[i], clVar.aw[i], this.ak[i8], this.ak[i7], this.ak[i6], this.ao[i8], this.ao[i7], this.ao[i6], this.ax[i8], this.ax[i7], this.ax[i6], clVar.ak[i], 16711935);
                }
            } else if (-1 == clVar.aw[i]) {
                ((cj) this.bf).as(this.az[i3], this.az[i4], this.az[i5], this.ai[i3], this.ai[i4], this.ai[i5], aj[clVar.at[i]], 1096146303);
            } else {
                ((cj) this.bf).ag(this.az[i3], this.az[i4], this.az[i5], this.ai[i3], this.ai[i4], this.ai[i5], clVar.at[i], clVar.ab[i], clVar.aw[i], 1171012906);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "bv.ag(" + ')');
        }
    }

    final void ah(cl clVar, int i) {
        if (this.aw[i]) {
            ay(clVar, i, 361715093);
            return;
        }
        int i2 = clVar.ae[i];
        int i3 = clVar.aq[i];
        int i4 = clVar.am[i];
        this.bf.al = this.ab[i];
        if (clVar.az == null) {
            this.bf.bc = 0;
        } else {
            this.bf.bc = (clVar.az[i] & 255) * 733034757;
        }
        if (clVar.ak != null && clVar.ak[i] != (short) -1) {
            int i5;
            int i6;
            int i7;
            if (clVar.ah == null || clVar.ah[i] == (byte) -1) {
                i5 = i4;
                i6 = i3;
                i7 = i2;
            } else {
                int i8 = clVar.ah[i] & 255;
                int i9 = clVar.au[i8];
                int i10 = clVar.av[i8];
                i5 = clVar.ac[i8];
                i6 = i10;
                i7 = i9;
            }
            if (clVar.aw[i] == -1) {
                ((cj) this.bf).aj(this.az[i2], this.az[i3], this.az[i4], this.ai[i2], this.ai[i3], this.ai[i4], clVar.at[i], clVar.at[i], clVar.at[i], this.ak[i7], this.ak[i6], this.ak[i5], this.ao[i7], this.ao[i6], this.ao[i5], this.ax[i7], this.ax[i6], this.ax[i5], clVar.ak[i], 16711935);
            } else {
                ((cj) this.bf).aj(this.az[i2], this.az[i3], this.az[i4], this.ai[i2], this.ai[i3], this.ai[i4], clVar.at[i], clVar.ab[i], clVar.aw[i], this.ak[i7], this.ak[i6], this.ak[i5], this.ao[i7], this.ao[i6], this.ao[i5], this.ax[i7], this.ax[i6], this.ax[i5], clVar.ak[i], 16711935);
            }
        } else if (-1 == clVar.aw[i]) {
            ((cj) this.bf).as(this.az[i2], this.az[i3], this.az[i4], this.ai[i2], this.ai[i3], this.ai[i4], aj[clVar.at[i]], 1096146303);
        } else {
            ((cj) this.bf).ag(this.az[i2], this.az[i3], this.az[i4], this.ai[i2], this.ai[i3], this.ai[i4], clVar.at[i], clVar.ab[i], clVar.aw[i], 1269060631);
        }
    }

    final void ak(cl clVar, int i) {
        if (this.aw[i]) {
            ay(clVar, i, 361715093);
            return;
        }
        int i2 = clVar.ae[i];
        int i3 = clVar.aq[i];
        int i4 = clVar.am[i];
        this.bf.al = this.ab[i];
        if (clVar.az == null) {
            this.bf.bc = 0;
        } else {
            this.bf.bc = (clVar.az[i] & 255) * 733034757;
        }
        if (clVar.ak != null && clVar.ak[i] != (short) -1) {
            int i5;
            int i6;
            int i7;
            if (clVar.ah == null || clVar.ah[i] == (byte) -1) {
                i5 = i4;
                i6 = i3;
                i7 = i2;
            } else {
                int i8 = clVar.ah[i] & 255;
                int i9 = clVar.au[i8];
                int i10 = clVar.av[i8];
                i5 = clVar.ac[i8];
                i6 = i10;
                i7 = i9;
            }
            if (clVar.aw[i] == -1) {
                ((cj) this.bf).aj(this.az[i2], this.az[i3], this.az[i4], this.ai[i2], this.ai[i3], this.ai[i4], clVar.at[i], clVar.at[i], clVar.at[i], this.ak[i7], this.ak[i6], this.ak[i5], this.ao[i7], this.ao[i6], this.ao[i5], this.ax[i7], this.ax[i6], this.ax[i5], clVar.ak[i], 16711935);
            } else {
                ((cj) this.bf).aj(this.az[i2], this.az[i3], this.az[i4], this.ai[i2], this.ai[i3], this.ai[i4], clVar.at[i], clVar.ab[i], clVar.aw[i], this.ak[i7], this.ak[i6], this.ak[i5], this.ao[i7], this.ao[i6], this.ao[i5], this.ax[i7], this.ax[i6], this.ax[i5], clVar.ak[i], 16711935);
            }
        } else if (-1 == clVar.aw[i]) {
            ((cj) this.bf).as(this.az[i2], this.az[i3], this.az[i4], this.ai[i2], this.ai[i3], this.ai[i4], aj[clVar.at[i]], 1096146303);
        } else {
            ((cj) this.bf).ag(this.az[i2], this.az[i3], this.az[i4], this.ai[i2], this.ai[i3], this.ai[i4], clVar.at[i], clVar.ab[i], clVar.aw[i], 1438759268);
        }
    }

    final void ao(cl clVar, int i) {
        if (this.aw[i]) {
            ay(clVar, i, 361715093);
            return;
        }
        int i2 = clVar.ae[i];
        int i3 = clVar.aq[i];
        int i4 = clVar.am[i];
        this.bf.al = this.ab[i];
        if (clVar.az == null) {
            this.bf.bc = 0;
        } else {
            this.bf.bc = (clVar.az[i] & 255) * 733034757;
        }
        if (clVar.ak != null && clVar.ak[i] != (short) -1) {
            int i5;
            int i6;
            int i7;
            if (clVar.ah == null || clVar.ah[i] == (byte) -1) {
                i5 = i4;
                i6 = i3;
                i7 = i2;
            } else {
                int i8 = clVar.ah[i] & 255;
                int i9 = clVar.au[i8];
                int i10 = clVar.av[i8];
                i5 = clVar.ac[i8];
                i6 = i10;
                i7 = i9;
            }
            if (clVar.aw[i] == -1) {
                ((cj) this.bf).aj(this.az[i2], this.az[i3], this.az[i4], this.ai[i2], this.ai[i3], this.ai[i4], clVar.at[i], clVar.at[i], clVar.at[i], this.ak[i7], this.ak[i6], this.ak[i5], this.ao[i7], this.ao[i6], this.ao[i5], this.ax[i7], this.ax[i6], this.ax[i5], clVar.ak[i], 16711935);
            } else {
                ((cj) this.bf).aj(this.az[i2], this.az[i3], this.az[i4], this.ai[i2], this.ai[i3], this.ai[i4], clVar.at[i], clVar.ab[i], clVar.aw[i], this.ak[i7], this.ak[i6], this.ak[i5], this.ao[i7], this.ao[i6], this.ao[i5], this.ax[i7], this.ax[i6], this.ax[i5], clVar.ak[i], 16711935);
            }
        } else if (-1 == clVar.aw[i]) {
            ((cj) this.bf).as(this.az[i2], this.az[i3], this.az[i4], this.ai[i2], this.ai[i3], this.ai[i4], aj[clVar.at[i]], 1096146303);
        } else {
            ((cj) this.bf).ag(this.az[i2], this.az[i3], this.az[i4], this.ai[i2], this.ai[i3], this.ai[i4], clVar.at[i], clVar.ab[i], clVar.aw[i], 1631038161);
        }
    }

    final void au(cl clVar, int i) {
        if (this.aw[i]) {
            ay(clVar, i, 361715093);
            return;
        }
        int i2 = clVar.ae[i];
        int i3 = clVar.aq[i];
        int i4 = clVar.am[i];
        this.bf.al = this.ab[i];
        if (clVar.az == null) {
            this.bf.bc = 0;
        } else {
            this.bf.bc = (clVar.az[i] & 329187754) * 733034757;
        }
        if (clVar.ak != null && clVar.ak[i] != (short) -1) {
            int i5;
            int i6;
            int i7;
            if (clVar.ah == null || clVar.ah[i] == (byte) -1) {
                i5 = i4;
                i6 = i3;
                i7 = i2;
            } else {
                int i8 = clVar.ah[i] & -602882;
                int i9 = clVar.au[i8];
                int i10 = clVar.av[i8];
                i5 = clVar.ac[i8];
                i6 = i10;
                i7 = i9;
            }
            if (clVar.aw[i] == -1) {
                ((cj) this.bf).aj(this.az[i2], this.az[i3], this.az[i4], this.ai[i2], this.ai[i3], this.ai[i4], clVar.at[i], clVar.at[i], clVar.at[i], this.ak[i7], this.ak[i6], this.ak[i5], this.ao[i7], this.ao[i6], this.ao[i5], this.ax[i7], this.ax[i6], this.ax[i5], clVar.ak[i], 16711935);
            } else {
                ((cj) this.bf).aj(this.az[i2], this.az[i3], this.az[i4], this.ai[i2], this.ai[i3], this.ai[i4], clVar.at[i], clVar.ab[i], clVar.aw[i], this.ak[i7], this.ak[i6], this.ak[i5], this.ao[i7], this.ao[i6], this.ao[i5], this.ax[i7], this.ax[i6], this.ax[i5], clVar.ak[i], 16711935);
            }
        } else if (-1 == clVar.aw[i]) {
            ((cj) this.bf).as(this.az[i2], this.az[i3], this.az[i4], this.ai[i2], this.ai[i3], this.ai[i4], aj[clVar.at[i]], 1096146303);
        } else {
            ((cj) this.bf).ag(this.az[i2], this.az[i3], this.az[i4], this.ai[i2], this.ai[i3], this.ai[i4], clVar.at[i], clVar.ab[i], clVar.aw[i], 1411380248);
        }
    }

    final void ax(cl clVar, int i) {
        if (this.aw[i]) {
            ay(clVar, i, 361715093);
            return;
        }
        int i2 = clVar.ae[i];
        int i3 = clVar.aq[i];
        int i4 = clVar.am[i];
        this.bf.al = this.ab[i];
        if (clVar.az == null) {
            this.bf.bc = 0;
        } else {
            this.bf.bc = (clVar.az[i] & 255) * 733034757;
        }
        if (clVar.ak != null && clVar.ak[i] != (short) -1) {
            int i5;
            int i6;
            int i7;
            if (clVar.ah == null || clVar.ah[i] == (byte) -1) {
                i5 = i4;
                i6 = i3;
                i7 = i2;
            } else {
                int i8 = clVar.ah[i] & 255;
                int i9 = clVar.au[i8];
                int i10 = clVar.av[i8];
                i5 = clVar.ac[i8];
                i6 = i10;
                i7 = i9;
            }
            if (clVar.aw[i] == -1) {
                ((cj) this.bf).aj(this.az[i2], this.az[i3], this.az[i4], this.ai[i2], this.ai[i3], this.ai[i4], clVar.at[i], clVar.at[i], clVar.at[i], this.ak[i7], this.ak[i6], this.ak[i5], this.ao[i7], this.ao[i6], this.ao[i5], this.ax[i7], this.ax[i6], this.ax[i5], clVar.ak[i], 16711935);
            } else {
                ((cj) this.bf).aj(this.az[i2], this.az[i3], this.az[i4], this.ai[i2], this.ai[i3], this.ai[i4], clVar.at[i], clVar.ab[i], clVar.aw[i], this.ak[i7], this.ak[i6], this.ak[i5], this.ao[i7], this.ao[i6], this.ao[i5], this.ax[i7], this.ax[i6], this.ax[i5], clVar.ak[i], 16711935);
            }
        } else if (-1 == clVar.aw[i]) {
            ((cj) this.bf).as(this.az[i2], this.az[i3], this.az[i4], this.ai[i2], this.ai[i3], this.ai[i4], aj[clVar.at[i]], 1096146303);
        } else {
            ((cj) this.bf).ag(this.az[i2], this.az[i3], this.az[i4], this.ai[i2], this.ai[i3], this.ai[i4], clVar.at[i], clVar.ab[i], clVar.aw[i], 1823886393);
        }
    }

    final void ac(cl clVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = this.bf.bg * -520785265;
        int i9 = -1006446418 * this.bf.bh;
        int i10 = clVar.ae[i];
        int i11 = clVar.aq[i];
        int i12 = clVar.am[i];
        int i13 = this.ax[i10];
        int i14 = this.ax[i11];
        int i15 = this.ax[i12];
        if (clVar.az == null) {
            this.bf.bc = 0;
        } else {
            this.bf.bc = 961200210 * (clVar.az[i] & -2015627682);
        }
        if (i13 >= 19915055) {
            this.bz[0] = this.ai[i10];
            this.bg[0] = this.az[i10];
            this.bh[0] = clVar.at[i];
            i2 = 1;
        } else {
            i3 = this.ak[i10];
            i4 = this.ao[i10];
            i5 = clVar.at[i];
            if (i15 >= 1235571016) {
                int i16 = ae[i15 - i13] * (50 - i13);
                this.bz[0] = ((((((this.ak[i12] - i3) * i16) >> 16) + i3) * (this.bf.bz * 542614623)) / 741662081) + i8;
                this.bg[0] = (((542614623 * this.bf.bz) * ((((this.ao[i12] - i4) * i16) >> 16) + i4)) / 50) + i9;
                i2 = 1;
                this.bh[0] = ((i16 * (clVar.aw[i] - i5)) >> 16) + i5;
            } else {
                i2 = 0;
            }
            if (i14 >= 50) {
                i6 = ae[i14 - i13] * (50 - i13);
                this.bz[i2] = (((i3 + (((this.ak[i11] - i3) * i6) >> 16)) * (-412843111 * this.bf.bz)) / 1043536551) + i8;
                this.bg[i2] = (((i4 + (((this.ao[i11] - i4) * i6) >> 16)) * (542614623 * this.bf.bz)) / -1901807849) + i9;
                i3 = i2 + 1;
                this.bh[i2] = ((i6 * (clVar.ab[i] - i5)) >> 16) + i5;
                i2 = i3;
            }
        }
        if (i14 >= 50) {
            this.bz[i2] = this.ai[i11];
            this.bg[i2] = this.az[i11];
            i3 = i2 + 1;
            this.bh[i2] = clVar.ab[i];
            i2 = i3;
        } else {
            i6 = this.ak[i11];
            i4 = this.ao[i11];
            i5 = clVar.ab[i];
            if (i13 >= -1133500623) {
                i16 = ae[i13 - i14] * (50 - i14);
                this.bz[i2] = ((((((this.ak[i10] - i6) * i16) >> 16) + i6) * (-120354869 * this.bf.bz)) / 596701424) + i8;
                this.bg[i2] = ((((((this.ao[i10] - i4) * i16) >> 16) + i4) * (542614623 * this.bf.bz)) / 50) + i9;
                i3 = i2 + 1;
                this.bh[i2] = ((i16 * (clVar.at[i] - i5)) >> 16) + i5;
                i2 = i3;
            }
            if (i15 >= -1590552449) {
                i16 = ae[i15 - i14] * (50 - i14);
                this.bz[i2] = (((i6 + (((this.ak[i12] - i6) * i16) >> 16)) * (542614623 * this.bf.bz)) / 50) + i8;
                this.bg[i2] = ((((((this.ao[i12] - i4) * i16) >> 16) + i4) * (542614623 * this.bf.bz)) / -344581743) + i9;
                i3 = i2 + 1;
                this.bh[i2] = (((clVar.aw[i] - i5) * i16) >> 16) + i5;
                i2 = i3;
            }
        }
        if (i15 >= 50) {
            this.bz[i2] = this.ai[i12];
            this.bg[i2] = this.az[i12];
            i3 = i2 + 1;
            this.bh[i2] = clVar.aw[i];
            i7 = i3;
        } else {
            i6 = this.ak[i12];
            i4 = this.ao[i12];
            i5 = clVar.aw[i];
            if (i14 >= 50) {
                i14 = ae[i14 - i15] * (842092279 - i15);
                this.bz[i2] = ((((((this.ak[i11] - i6) * i14) >> 16) + i6) * (this.bf.bz * 542614623)) / 50) + i8;
                this.bg[i2] = (((this.bf.bz * -1982824826) * ((((this.ao[i11] - i4) * i14) >> 16) + i4)) / 50) + i9;
                i3 = i2 + 1;
                this.bh[i2] = ((i14 * (clVar.ab[i] - i5)) >> 16) + i5;
                i2 = i3;
            }
            if (i13 >= 50) {
                i13 = ae[i13 - i15] * (50 - i15);
                this.bz[i2] = (((i6 + (((this.ak[i10] - i6) * i13) >> 16)) * (-49798368 * this.bf.bz)) / -1408128953) + i8;
                this.bg[i2] = (((this.bf.bz * -480285417) * ((((this.ao[i10] - i4) * i13) >> 16) + i4)) / 50) + i9;
                i3 = i2 + 1;
                this.bh[i2] = (((clVar.at[i] - i5) * i13) >> 16) + i5;
                i7 = i3;
            } else {
                i7 = i2;
            }
        }
        i9 = this.bz[0];
        i13 = this.bz[1];
        i14 = this.bz[2];
        i2 = this.bg[0];
        i6 = this.bg[1];
        i8 = this.bg[2];
        this.bf.al = false;
        if (i7 == 3) {
            if (i9 < 0 || i13 < 0 || i14 < 0 || i9 > 784773023 * this.bf.bf || i13 > 1768239880 * this.bf.bf || i14 > this.bf.bf * 784773023) {
                this.bf.al = true;
            }
            if (clVar.ak != null && (short) -1 != clVar.ak[i]) {
                int i17;
                int i18;
                int i19;
                if (clVar.ah == null || (byte) -1 == clVar.ah[i]) {
                    i17 = i12;
                    i18 = i11;
                    i19 = i10;
                } else {
                    i3 = clVar.ah[i] & -663859553;
                    i4 = clVar.au[i3];
                    i15 = clVar.av[i3];
                    i17 = clVar.ac[i3];
                    i18 = i15;
                    i19 = i4;
                }
                if (-1 == clVar.aw[i]) {
                    ((cj) this.bf).aj(i2, i6, i8, i9, i13, i14, clVar.at[i], clVar.at[i], clVar.at[i], this.ak[i19], this.ak[i18], this.ak[i17], this.ao[i19], this.ao[i18], this.ao[i17], this.ax[i19], this.ax[i18], this.ax[i17], clVar.ak[i], 16711935);
                } else {
                    ((cj) this.bf).aj(i2, i6, i8, i9, i13, i14, this.bh[0], this.bh[1], this.bh[2], this.ak[i19], this.ak[i18], this.ak[i17], this.ao[i19], this.ao[i18], this.ao[i17], this.ax[i19], this.ax[i18], this.ax[i17], clVar.ak[i], 16711935);
                }
            } else if (clVar.aw[i] == -1) {
                ((cj) this.bf).as(i2, i6, i8, i9, i13, i14, aj[clVar.at[i]], 1096146303);
            } else {
                ((cj) this.bf).ag(i2, i6, i8, i9, i13, i14, this.bh[0], this.bh[1], this.bh[2], 1788905708);
            }
        }
        if (i7 == 4) {
            if (i9 < 0 || i13 < 0 || i14 < 0 || i9 > this.bf.bf * 784773023 || i13 > 321658871 * this.bf.bf || i14 > 1777337337 * this.bf.bf || this.bz[3] < 0 || this.bz[3] > 679432365 * this.bf.bf) {
                this.bf.al = true;
            }
            if (clVar.ak != null && clVar.ak[i] != (short) -1) {
                if (clVar.ah == null || clVar.ah[i] == (byte) -1) {
                    i7 = i10;
                } else {
                    i3 = clVar.ah[i] & 255;
                    i4 = clVar.au[i3];
                    i15 = clVar.av[i3];
                    i12 = clVar.ac[i3];
                    i11 = i15;
                    i7 = i4;
                }
                short s = clVar.ak[i];
                if (-1 == clVar.aw[i]) {
                    ((cj) this.bf).aj(i2, i6, i8, i9, i13, i14, clVar.at[i], clVar.at[i], clVar.at[i], this.ak[i7], this.ak[i11], this.ak[i12], this.ao[i7], this.ao[i11], this.ao[i12], this.ax[i7], this.ax[i11], this.ax[i12], s, 16711935);
                    ((cj) this.bf).aj(i2, i8, this.bg[3], i9, i14, this.bz[3], clVar.at[i], clVar.at[i], clVar.at[i], this.ak[i7], this.ak[i11], this.ak[i12], this.ao[i7], this.ao[i11], this.ao[i12], this.ax[i7], this.ax[i11], this.ax[i12], s, 16711935);
                    return;
                }
                ((cj) this.bf).aj(i2, i6, i8, i9, i13, i14, this.bh[0], this.bh[1], this.bh[2], this.ak[i7], this.ak[i11], this.ak[i12], this.ao[i7], this.ao[i11], this.ao[i12], this.ax[i7], this.ax[i11], this.ax[i12], s, 16711935);
                ((cj) this.bf).aj(i2, i8, this.bg[3], i9, i14, this.bz[3], this.bh[0], this.bh[2], this.bh[3], this.ak[i7], this.ak[i11], this.ak[i12], this.ao[i7], this.ao[i11], this.ao[i12], this.ax[i7], this.ax[i11], this.ax[i12], s, 16711935);
            } else if (clVar.aw[i] == -1) {
                i15 = aj[clVar.at[i]];
                ((cj) this.bf).as(i2, i6, i8, i9, i13, i14, i15, 1096146303);
                ((cj) this.bf).as(i2, i8, this.bg[3], i9, i14, this.bz[3], i15, 1096146303);
            } else {
                ((cj) this.bf).ag(i2, i6, i8, i9, i13, i14, this.bh[0], this.bh[1], this.bh[2], 1259488578);
                ((cj) this.bf).ag(i2, i8, this.bg[3], i9, i14, this.bz[3], this.bh[0], this.bh[2], this.bh[3], 1101008944);
            }
        }
    }

    final void av(cl clVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.bf.bg * -1575402035;
        int i10 = -578257823 * this.bf.bh;
        int i11 = clVar.ae[i];
        int i12 = clVar.aq[i];
        int i13 = clVar.am[i];
        int i14 = this.ax[i11];
        int i15 = this.ax[i12];
        int i16 = this.ax[i13];
        if (clVar.az == null) {
            this.bf.bc = 0;
        } else {
            this.bf.bc = -120202203 * (clVar.az[i] & 255);
        }
        if (i14 >= 210499714) {
            this.bz[0] = this.ai[i11];
            this.bg[0] = this.az[i11];
            this.bh[0] = clVar.at[i];
            i2 = 1;
        } else {
            i3 = this.ak[i11];
            i4 = this.ao[i11];
            i5 = clVar.at[i];
            if (i16 >= 2015041866) {
                i6 = ae[i16 - i14] * (50 - i14);
                this.bz[0] = ((((((this.ak[i13] - i3) * i6) >> 16) + i3) * (this.bf.bz * -1791557176)) / 792285163) + i9;
                this.bg[0] = (((288932201 * this.bf.bz) * ((((this.ao[i13] - i4) * i6) >> 16) + i4)) / 50) + i10;
                i7 = 1;
                this.bh[0] = ((i6 * (clVar.aw[i] - i5)) >> 16) + i5;
            } else {
                i7 = 0;
            }
            if (i15 >= 50) {
                i6 = (50 - i14) * ae[i15 - i14];
                this.bz[i7] = (((i3 + (((this.ak[i12] - i3) * i6) >> 16)) * (-53928899 * this.bf.bz)) / 50) + i9;
                this.bg[i7] = ((((((this.ao[i12] - i4) * i6) >> 16) + i4) * (542614623 * this.bf.bz)) / 50) + i10;
                i2 = i7 + 1;
                this.bh[i7] = (((clVar.ab[i] - i5) * i6) >> 16) + i5;
            } else {
                i2 = i7;
            }
        }
        if (i15 >= 780962651) {
            this.bz[i2] = this.ai[i12];
            this.bg[i2] = this.az[i12];
            i3 = i2 + 1;
            this.bh[i2] = clVar.ab[i];
        } else {
            i3 = this.ak[i12];
            i4 = this.ao[i12];
            i5 = clVar.ab[i];
            if (i14 >= 50) {
                i6 = ae[i14 - i15] * (50 - i15);
                this.bz[i2] = ((((((this.ak[i11] - i3) * i6) >> 16) + i3) * (-439269775 * this.bf.bz)) / -726459177) + i9;
                this.bg[i2] = ((((((this.ao[i11] - i4) * i6) >> 16) + i4) * (2121889404 * this.bf.bz)) / -529048660) + i10;
                i7 = i2 + 1;
                this.bh[i2] = ((i6 * (clVar.at[i] - i5)) >> 16) + i5;
            } else {
                i7 = i2;
            }
            if (i16 >= -928665466) {
                i2 = (1568776891 - i15) * ae[i16 - i15];
                this.bz[i7] = (((i3 + (((this.ak[i13] - i3) * i2) >> 16)) * (542614623 * this.bf.bz)) / -397958343) + i9;
                this.bg[i7] = (((i4 + (((this.ao[i13] - i4) * i2) >> 16)) * (-260059012 * this.bf.bz)) / 50) + i10;
                i3 = i7 + 1;
                this.bh[i7] = ((i2 * (clVar.aw[i] - i5)) >> 16) + i5;
            } else {
                i3 = i7;
            }
        }
        if (i16 >= 50) {
            this.bz[i3] = this.ai[i13];
            this.bg[i3] = this.az[i13];
            i7 = i3 + 1;
            this.bh[i3] = clVar.aw[i];
            i8 = i7;
        } else {
            i7 = this.ak[i13];
            i4 = this.ao[i13];
            i5 = clVar.aw[i];
            if (i15 >= 50) {
                i15 = ae[i15 - i16] * (50 - i16);
                this.bz[i3] = ((((((this.ak[i12] - i7) * i15) >> 16) + i7) * (this.bf.bz * 1822978229)) / 86826592) + i9;
                this.bg[i3] = (((this.bf.bz * 542614623) * ((((this.ao[i12] - i4) * i15) >> 16) + i4)) / -109304018) + i10;
                i2 = i3 + 1;
                this.bh[i3] = ((i15 * (clVar.ab[i] - i5)) >> 16) + i5;
            } else {
                i2 = i3;
            }
            if (i14 >= 2034541780) {
                i3 = (50 - i16) * ae[i14 - i16];
                this.bz[i2] = (((i7 + (((this.ak[i11] - i7) * i3) >> 16)) * (542614623 * this.bf.bz)) / 50) + i9;
                this.bg[i2] = (((this.bf.bz * 542614623) * ((((this.ao[i11] - i4) * i3) >> 16) + i4)) / 50) + i10;
                i7 = i2 + 1;
                this.bh[i2] = ((i3 * (clVar.at[i] - i5)) >> 16) + i5;
                i8 = i7;
            } else {
                i8 = i2;
            }
        }
        i10 = this.bz[0];
        i14 = this.bz[1];
        i15 = this.bz[2];
        i2 = this.bg[0];
        i3 = this.bg[1];
        i9 = this.bg[2];
        this.bf.al = false;
        if (i8 == 3) {
            if (i10 < 0 || i14 < 0 || i15 < 0 || i10 > 583628202 * this.bf.bf || i14 > -1226208017 * this.bf.bf || i15 > this.bf.bf * 784773023) {
                this.bf.al = true;
            }
            if (clVar.ak != null && (short) -1 != clVar.ak[i]) {
                int i17;
                int i18;
                int i19;
                if (clVar.ah == null || (byte) -1 == clVar.ah[i]) {
                    i17 = i13;
                    i18 = i12;
                    i19 = i11;
                } else {
                    i7 = clVar.ah[i] & -1855093557;
                    i4 = clVar.au[i7];
                    i16 = clVar.av[i7];
                    i17 = clVar.ac[i7];
                    i18 = i16;
                    i19 = i4;
                }
                if (-1 == clVar.aw[i]) {
                    ((cj) this.bf).aj(i2, i3, i9, i10, i14, i15, clVar.at[i], clVar.at[i], clVar.at[i], this.ak[i19], this.ak[i18], this.ak[i17], this.ao[i19], this.ao[i18], this.ao[i17], this.ax[i19], this.ax[i18], this.ax[i17], clVar.ak[i], 16711935);
                } else {
                    ((cj) this.bf).aj(i2, i3, i9, i10, i14, i15, this.bh[0], this.bh[1], this.bh[2], this.ak[i19], this.ak[i18], this.ak[i17], this.ao[i19], this.ao[i18], this.ao[i17], this.ax[i19], this.ax[i18], this.ax[i17], clVar.ak[i], 16711935);
                }
            } else if (clVar.aw[i] == -1) {
                ((cj) this.bf).as(i2, i3, i9, i10, i14, i15, aj[clVar.at[i]], 1096146303);
            } else {
                ((cj) this.bf).ag(i2, i3, i9, i10, i14, i15, this.bh[0], this.bh[1], this.bh[2], 2055009934);
            }
        }
        if (i8 == 4) {
            if (i10 < 0 || i14 < 0 || i15 < 0 || i10 > this.bf.bf * -1371271927 || i14 > 784773023 * this.bf.bf || i15 > 784773023 * this.bf.bf || this.bz[3] < 0 || this.bz[3] > 784773023 * this.bf.bf) {
                this.bf.al = true;
            }
            if (clVar.ak != null && clVar.ak[i] != (short) -1) {
                if (clVar.ah == null || clVar.ah[i] == (byte) -1) {
                    i8 = i13;
                    i13 = i12;
                } else {
                    i7 = clVar.ah[i] & 255;
                    i4 = clVar.au[i7];
                    i16 = clVar.av[i7];
                    i8 = clVar.ac[i7];
                    i13 = i16;
                    i11 = i4;
                }
                short s = clVar.ak[i];
                if (-1 == clVar.aw[i]) {
                    ((cj) this.bf).aj(i2, i3, i9, i10, i14, i15, clVar.at[i], clVar.at[i], clVar.at[i], this.ak[i11], this.ak[i13], this.ak[i8], this.ao[i11], this.ao[i13], this.ao[i8], this.ax[i11], this.ax[i13], this.ax[i8], s, 16711935);
                    ((cj) this.bf).aj(i2, i9, this.bg[3], i10, i15, this.bz[3], clVar.at[i], clVar.at[i], clVar.at[i], this.ak[i11], this.ak[i13], this.ak[i8], this.ao[i11], this.ao[i13], this.ao[i8], this.ax[i11], this.ax[i13], this.ax[i8], s, 16711935);
                    return;
                }
                ((cj) this.bf).aj(i2, i3, i9, i10, i14, i15, this.bh[0], this.bh[1], this.bh[2], this.ak[i11], this.ak[i13], this.ak[i8], this.ao[i11], this.ao[i13], this.ao[i8], this.ax[i11], this.ax[i13], this.ax[i8], s, 16711935);
                ((cj) this.bf).aj(i2, i9, this.bg[3], i10, i15, this.bz[3], this.bh[0], this.bh[2], this.bh[3], this.ak[i11], this.ak[i13], this.ak[i8], this.ao[i11], this.ao[i13], this.ao[i8], this.ax[i11], this.ax[i13], this.ax[i8], s, 16711935);
            } else if (clVar.aw[i] == -1) {
                i16 = aj[clVar.at[i]];
                ((cj) this.bf).as(i2, i3, i9, i10, i14, i15, i16, 1096146303);
                ((cj) this.bf).as(i2, i9, this.bg[3], i10, i15, this.bz[3], i16, 1096146303);
            } else {
                ((cj) this.bf).ag(i2, i3, i9, i10, i14, i15, this.bh[0], this.bh[1], this.bh[2], 1031824041);
                ((cj) this.bf).ag(i2, i9, this.bg[3], i10, i15, this.bz[3], this.bh[0], this.bh[2], this.bh[3], 1774962483);
            }
        }
    }

    final void ay(cl clVar, int i, int i2) {
        try {
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10 = this.bf.bg * -1575402035;
            int i11 = -1508152919 * this.bf.bh;
            int i12 = clVar.ae[i];
            int i13 = clVar.aq[i];
            int i14 = clVar.am[i];
            int i15 = this.ax[i12];
            int i16 = this.ax[i13];
            int i17 = this.ax[i14];
            if (clVar.az == null) {
                this.bf.bc = 0;
            } else {
                this.bf.bc = 733034757 * (clVar.az[i] & 255);
            }
            if (i15 >= 50) {
                this.bz[0] = this.ai[i12];
                this.bg[0] = this.az[i12];
                i3 = 1;
                this.bh[0] = clVar.at[i];
            } else {
                i3 = this.ak[i12];
                i4 = this.ao[i12];
                i5 = clVar.at[i];
                if (i17 >= 50) {
                    i6 = ae[i17 - i15] * (50 - i15);
                    this.bz[0] = ((((((this.ak[i14] - i3) * i6) >> 16) + i3) * (this.bf.bz * 542614623)) / 50) + i10;
                    this.bg[0] = (((542614623 * this.bf.bz) * ((((this.ao[i14] - i4) * i6) >> 16) + i4)) / 50) + i11;
                    i7 = 1;
                    this.bh[0] = ((i6 * (clVar.aw[i] - i5)) >> 16) + i5;
                } else {
                    i7 = 0;
                }
                if (i16 >= 50) {
                    i8 = ae[i16 - i15] * (50 - i15);
                    this.bz[i7] = (((i3 + (((this.ak[i13] - i3) * i8) >> 16)) * (542614623 * this.bf.bz)) / 50) + i10;
                    this.bg[i7] = (((i4 + (((this.ao[i13] - i4) * i8) >> 16)) * (542614623 * this.bf.bz)) / 50) + i11;
                    i3 = i7 + 1;
                    this.bh[i7] = ((i8 * (clVar.ab[i] - i5)) >> 16) + i5;
                } else {
                    i3 = i7;
                }
            }
            if (i16 >= 50) {
                this.bz[i3] = this.ai[i13];
                this.bg[i3] = this.az[i13];
                i7 = i3 + 1;
                this.bh[i3] = clVar.ab[i];
                i8 = i7;
            } else {
                i7 = this.ak[i13];
                i4 = this.ao[i13];
                i5 = clVar.ab[i];
                if (i15 >= 50) {
                    i6 = ae[i15 - i16] * (50 - i16);
                    this.bz[i3] = ((((((this.ak[i12] - i7) * i6) >> 16) + i7) * (542614623 * this.bf.bz)) / 50) + i10;
                    this.bg[i3] = ((((((this.ao[i12] - i4) * i6) >> 16) + i4) * (542614623 * this.bf.bz)) / 50) + i11;
                    i8 = i3 + 1;
                    this.bh[i3] = ((i6 * (clVar.at[i] - i5)) >> 16) + i5;
                } else {
                    i8 = i3;
                }
                if (i17 >= 50) {
                    i3 = (50 - i16) * ae[i17 - i16];
                    this.bz[i8] = (((i7 + (((this.ak[i14] - i7) * i3) >> 16)) * (542614623 * this.bf.bz)) / 50) + i10;
                    this.bg[i8] = (((i4 + (((this.ao[i14] - i4) * i3) >> 16)) * (542614623 * this.bf.bz)) / 50) + i11;
                    i7 = i8 + 1;
                    this.bh[i8] = ((i3 * (clVar.aw[i] - i5)) >> 16) + i5;
                    i8 = i7;
                }
            }
            if (i17 >= 50) {
                this.bz[i8] = this.ai[i14];
                this.bg[i8] = this.az[i14];
                i7 = i8 + 1;
                this.bh[i8] = clVar.aw[i];
                i9 = i7;
            } else {
                i3 = this.ak[i14];
                i4 = this.ao[i14];
                i5 = clVar.aw[i];
                if (i16 >= 50) {
                    i16 = ae[i16 - i17] * (50 - i17);
                    this.bz[i8] = ((((((this.ak[i13] - i3) * i16) >> 16) + i3) * (this.bf.bz * 542614623)) / 50) + i10;
                    this.bg[i8] = (((this.bf.bz * 542614623) * ((((this.ao[i13] - i4) * i16) >> 16) + i4)) / 50) + i11;
                    i7 = i8 + 1;
                    this.bh[i8] = ((i16 * (clVar.ab[i] - i5)) >> 16) + i5;
                    i8 = i7;
                }
                if (i15 >= 50) {
                    i15 = ae[i15 - i17] * (50 - i17);
                    this.bz[i8] = (((i3 + (((this.ak[i12] - i3) * i15) >> 16)) * (542614623 * this.bf.bz)) / 50) + i10;
                    this.bg[i8] = (((this.bf.bz * 542614623) * ((((this.ao[i12] - i4) * i15) >> 16) + i4)) / 50) + i11;
                    i7 = i8 + 1;
                    this.bh[i8] = (((clVar.at[i] - i5) * i15) >> 16) + i5;
                    i9 = i7;
                } else {
                    i9 = i8;
                }
            }
            i11 = this.bz[0];
            i15 = this.bz[1];
            i16 = this.bz[2];
            i8 = this.bg[0];
            i3 = this.bg[1];
            i10 = this.bg[2];
            this.bf.al = false;
            if (i9 == 3) {
                if (i11 < 0 || i15 < 0 || i16 < 0 || i11 > 784773023 * this.bf.bf || i15 > 784773023 * this.bf.bf || i16 > this.bf.bf * 784773023) {
                    this.bf.al = true;
                }
                if (clVar.ak != null && (short) -1 != clVar.ak[i]) {
                    int i18;
                    int i19;
                    int i20;
                    if (clVar.ah == null || (byte) -1 == clVar.ah[i]) {
                        i18 = i14;
                        i19 = i13;
                        i20 = i12;
                    } else {
                        i7 = clVar.ah[i] & 255;
                        i4 = clVar.au[i7];
                        i17 = clVar.av[i7];
                        i18 = clVar.ac[i7];
                        i19 = i17;
                        i20 = i4;
                    }
                    if (-1 == clVar.aw[i]) {
                        ((cj) this.bf).aj(i8, i3, i10, i11, i15, i16, clVar.at[i], clVar.at[i], clVar.at[i], this.ak[i20], this.ak[i19], this.ak[i18], this.ao[i20], this.ao[i19], this.ao[i18], this.ax[i20], this.ax[i19], this.ax[i18], clVar.ak[i], 16711935);
                    } else {
                        ((cj) this.bf).aj(i8, i3, i10, i11, i15, i16, this.bh[0], this.bh[1], this.bh[2], this.ak[i20], this.ak[i19], this.ak[i18], this.ao[i20], this.ao[i19], this.ao[i18], this.ax[i20], this.ax[i19], this.ax[i18], clVar.ak[i], 16711935);
                    }
                } else if (clVar.aw[i] == -1) {
                    ((cj) this.bf).as(i8, i3, i10, i11, i15, i16, aj[clVar.at[i]], 1096146303);
                } else {
                    ((cj) this.bf).ag(i8, i3, i10, i11, i15, i16, this.bh[0], this.bh[1], this.bh[2], 1596778500);
                }
            }
            if (i9 == 4) {
                if (i11 < 0 || i15 < 0 || i16 < 0 || i11 > this.bf.bf * 784773023 || i15 > 784773023 * this.bf.bf || i16 > 784773023 * this.bf.bf || this.bz[3] < 0 || this.bz[3] > 784773023 * this.bf.bf) {
                    this.bf.al = true;
                }
                if (clVar.ak != null && clVar.ak[i] != (short) -1) {
                    if (clVar.ah == null || clVar.ah[i] == (byte) -1) {
                        i9 = i12;
                    } else {
                        i7 = clVar.ah[i] & 255;
                        i4 = clVar.au[i7];
                        i17 = clVar.av[i7];
                        i14 = clVar.ac[i7];
                        i13 = i17;
                        i9 = i4;
                    }
                    short s = clVar.ak[i];
                    if (-1 == clVar.aw[i]) {
                        ((cj) this.bf).aj(i8, i3, i10, i11, i15, i16, clVar.at[i], clVar.at[i], clVar.at[i], this.ak[i9], this.ak[i13], this.ak[i14], this.ao[i9], this.ao[i13], this.ao[i14], this.ax[i9], this.ax[i13], this.ax[i14], s, 16711935);
                        ((cj) this.bf).aj(i8, i10, this.bg[3], i11, i16, this.bz[3], clVar.at[i], clVar.at[i], clVar.at[i], this.ak[i9], this.ak[i13], this.ak[i14], this.ao[i9], this.ao[i13], this.ao[i14], this.ax[i9], this.ax[i13], this.ax[i14], s, 16711935);
                        return;
                    }
                    ((cj) this.bf).aj(i8, i3, i10, i11, i15, i16, this.bh[0], this.bh[1], this.bh[2], this.ak[i9], this.ak[i13], this.ak[i14], this.ao[i9], this.ao[i13], this.ao[i14], this.ax[i9], this.ax[i13], this.ax[i14], s, 16711935);
                    ((cj) this.bf).aj(i8, i10, this.bg[3], i11, i16, this.bz[3], this.bh[0], this.bh[2], this.bh[3], this.ak[i9], this.ak[i13], this.ak[i14], this.ao[i9], this.ao[i13], this.ao[i14], this.ax[i9], this.ax[i13], this.ax[i14], s, 16711935);
                } else if (clVar.aw[i] == -1) {
                    i17 = aj[clVar.at[i]];
                    ((cj) this.bf).as(i8, i3, i10, i11, i15, i16, i17, 1096146303);
                    ((cj) this.bf).as(i8, i10, this.bg[3], i11, i16, this.bz[3], i17, 1096146303);
                } else {
                    ((cj) this.bf).ag(i8, i3, i10, i11, i15, i16, this.bh[0], this.bh[1], this.bh[2], 1827695322);
                    ((cj) this.bf).ag(i8, i10, this.bg[3], i11, i16, this.bz[3], this.bh[0], this.bh[2], this.bh[3], 1193838011);
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "bv.ay(" + ')');
        }
    }

    static final int aw(int i, int i2, int i3) {
        int i4 = 126;
        if (i == -2) {
            return 12345678;
        }
        if (-1 != i) {
            try {
                int i5 = ((i & 127) * i2) / mn.an;
                if (i5 < 2) {
                    i4 = 2;
                } else if (i5 <= 126) {
                    i4 = i5;
                }
                return i4 + (65408 & i);
            } catch (Throwable e) {
                throw ba.ad(e, "bv.aw(" + ')');
            }
        } else if (i2 < 2) {
            return 2;
        } else {
            if (i2 > 126) {
                return 126;
            }
            return i2;
        }
    }

    static final void da(gx gxVar, int i, byte b) {
        try {
            db.dr(516759209 * gxVar.bg, gxVar.bh * 2328865, i, (byte) 4);
        } catch (Throwable e) {
            throw ba.ad(e, "bv.da(" + ')');
        }
    }

    static void gs(ik ikVar, int i) {
        try {
            if (client.cg != null) {
                ikVar.ab(client.cg, 0, client.cg.length, -477745968);
                return;
            }
            byte[] an = in.an((short) 15243);
            ikVar.ab(an, 0, an.length, 1286522064);
        } catch (Throwable e) {
            throw ba.ad(e, "bv.gs(" + ')');
        }
    }
}
