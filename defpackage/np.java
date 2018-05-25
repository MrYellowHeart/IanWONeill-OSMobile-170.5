package p000;

public class np extends kd {
    byte[] ad;
    kb af;

    public static np aa(kf kfVar, int i, int i2) {
        byte[] an = kfVar.an(i, i2, -999930741);
        if (an == null) {
            return null;
        }
        return new np(new ik(an));
    }

    public static np af(kf kfVar, int i, int i2) {
        byte[] an = kfVar.an(i, i2, -403276123);
        if (an == null) {
            return null;
        }
        return new np(new ik(an));
    }

    public static np ag(kf kfVar, int i, int i2) {
        byte[] an = kfVar.an(i, i2, -401199294);
        if (an == null) {
            return null;
        }
        return new np(new ik(an));
    }

    np(ik ikVar) {
        int i;
        int i2;
        int ao;
        int i3;
        ikVar.ad = (ikVar.af.length - 3) * 2065011939;
        int ao2 = ikVar.ao((byte) 0);
        int au = ikVar.au(1148745703);
        int i4 = (ao2 * 10) + 14;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (i = 0; i < ao2; i++) {
            i2 = -1;
            while (true) {
                ao = ikVar.ao((byte) 0);
                if (ao != i2) {
                    i4++;
                }
                i2 = ao & 15;
                if (ao == 7) {
                    break;
                } else if (ao == 23) {
                    i5++;
                } else if (i2 == 0) {
                    i7++;
                } else if (i2 == 1) {
                    i8++;
                } else if (i2 == 2) {
                    i6++;
                } else if (i2 == 3) {
                    i9++;
                } else if (i2 == 4) {
                    i10++;
                } else if (i2 == 5) {
                    i11++;
                } else if (i2 == 6) {
                    i12++;
                } else {
                    throw new RuntimeException();
                }
            }
        }
        i4 = (i10 + i12) + (((i5 * 5) + i4) + (((((i7 + i8) + i6) + i9) + i11) * 2));
        int i13 = ikVar.ad * 1978945739;
        i = (((((((ao2 + i5) + i6) + i7) + i8) + i9) + i10) + i11) + i12;
        for (i2 = 0; i2 < i; i2++) {
            ikVar.bt(-1736520733);
        }
        int i14 = i4 + ((ikVar.ad * 1978945739) - i13);
        int i15 = ikVar.ad * 1978945739;
        i2 = 0;
        i = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = i12;
        i12 = 0;
        ao = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        i4 = 0;
        int i23 = 0;
        int i24 = 0;
        for (i3 = 0; i3 < i6; i3++) {
            i22 = (i22 + ikVar.ao((byte) 0)) & 127;
            if (i22 == 0 || i22 == 32) {
                i18++;
            } else if (i22 == 1) {
                i21++;
            } else if (i22 == 33) {
                i20++;
            } else if (i22 == 7) {
                i17++;
            } else if (i22 == 39) {
                i24++;
            } else if (i22 == 10) {
                i19++;
            } else if (i22 == 42) {
                i16++;
            } else if (i22 == 99) {
                i23++;
            } else if (i22 == 98) {
                ao++;
            } else if (i22 == 101) {
                i++;
            } else if (i22 == 100) {
                i4++;
            } else if (i22 == 64 || i22 == 65 || i22 == 120 || i22 == 121 || i22 == 123) {
                i12++;
            } else {
                i2++;
            }
        }
        int i25 = ikVar.ad * 1978945739;
        ikVar.ad = (i12 * 2065011939) + ikVar.ad;
        int i26 = ikVar.ad * 1978945739;
        ikVar.ad += 2065011939 * i11;
        int i27 = ikVar.ad * 1978945739;
        ikVar.ad += i10 * 2065011939;
        int i28 = ikVar.ad * 1978945739;
        ikVar.ad += 2065011939 * i9;
        int i29 = ikVar.ad * 1978945739;
        ikVar.ad += 2065011939 * i21;
        int i30 = ikVar.ad * 1978945739;
        ikVar.ad += 2065011939 * i17;
        int i31 = ikVar.ad * 1978945739;
        ikVar.ad += 2065011939 * i19;
        int i32 = ikVar.ad * 1978945739;
        ikVar.ad += (i11 + (i7 + i8)) * 2065011939;
        int i33 = ikVar.ad * 1978945739;
        ikVar.ad += 2065011939 * i7;
        i22 = ikVar.ad * 1978945739;
        ikVar.ad = (i2 * 2065011939) + ikVar.ad;
        i3 = ikVar.ad * 1978945739;
        ikVar.ad += 2065011939 * i8;
        i21 = ikVar.ad * 1978945739;
        ikVar.ad += 2065011939 * i20;
        i20 = ikVar.ad * 1978945739;
        ikVar.ad += 2065011939 * i24;
        i17 = ikVar.ad * 1978945739;
        ikVar.ad += 2065011939 * i16;
        i24 = ikVar.ad * 1978945739;
        ikVar.ad += 2065011939 * i18;
        i19 = ikVar.ad * 1978945739;
        ikVar.ad += 2065011939 * i9;
        i16 = ikVar.ad * 1978945739;
        ikVar.ad += 2065011939 * i23;
        i23 = ikVar.ad * 1978945739;
        ikVar.ad += 2065011939 * ao;
        ao = ikVar.ad * 1978945739;
        ikVar.ad += 2065011939 * i;
        i = ikVar.ad * 1978945739;
        ikVar.ad += 2065011939 * i4;
        i4 = ikVar.ad * 1978945739;
        ikVar.ad += 1900068521 * i5;
        this.ad = new byte[i14];
        ik ikVar2 = new ik(this.ad);
        ikVar2.ay(1297377380, (short) 128);
        ikVar2.ay(6, (short) 128);
        if (ao2 > 1) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        ikVar2.aa(i2, -1752508204);
        ikVar2.aa(ao2, -1752508204);
        ikVar2.aa(au, -1752508204);
        ikVar.ad = 2065011939 * i13;
        i6 = 0;
        i7 = 0;
        i8 = 0;
        i9 = 0;
        i10 = 0;
        i11 = 0;
        i12 = 0;
        int[] iArr = new int[mn.an];
        i14 = 0;
        i5 = i4;
        i18 = i22;
        i4 = i;
        i22 = i32;
        i = ao;
        i32 = i30;
        ao = i23;
        i30 = i28;
        i23 = i16;
        i28 = i26;
        i16 = i19;
        i26 = 0;
        i19 = i24;
        int i34 = i15;
        i24 = i17;
        i17 = i20;
        i20 = i21;
        i21 = i3;
        i3 = i33;
        i33 = i31;
        i31 = i29;
        i29 = i27;
        i27 = i25;
        i25 = 0;
        while (i14 < ao2) {
            ikVar2.ay(1297379947, (short) 128);
            ikVar2.ad -= 329886836;
            int i35 = ikVar2.ad * 1978945739;
            i2 = -1;
            au = i25;
            i15 = i34;
            i25 = i27;
            i27 = i29;
            i29 = i31;
            i31 = i33;
            i33 = i22;
            i22 = i3;
            i3 = i18;
            i18 = i21;
            i21 = i20;
            i20 = i17;
            i17 = i24;
            i24 = i19;
            i19 = i26;
            i26 = i28;
            i28 = i30;
            i30 = i32;
            while (true) {
                Object obj;
                ikVar2.ak(ikVar.bt(-2117409126), 2107384333);
                i34 = i19 + 1;
                i32 = ikVar.af[i19] & 255;
                if (i32 != i2) {
                    obj = 1;
                } else {
                    obj = null;
                }
                i2 = i32 & 15;
                if (i32 == 7) {
                    break;
                } else if (i32 == 23) {
                    if (obj != null) {
                        ikVar2.an(255, (byte) 31);
                    }
                    ikVar2.an(81, (byte) 31);
                    ikVar2.an(3, (byte) 31);
                    i32 = i5 + 1;
                    ikVar2.an(ikVar.af[i5], (byte) 31);
                    i19 = i32 + 1;
                    ikVar2.an(ikVar.af[i32], (byte) 31);
                    i5 = i19 + 1;
                    ikVar2.an(ikVar.af[i19], (byte) 31);
                    i19 = i34;
                } else {
                    i6 ^= i32 >> 4;
                    if (i2 == 0) {
                        if (obj != null) {
                            ikVar2.an(i6 + 144, (byte) 31);
                        }
                        i32 = i33 + 1;
                        i7 += ikVar.af[i33];
                        i19 = i22 + 1;
                        i8 += ikVar.af[i22];
                        ikVar2.an(i7 & 127, (byte) 31);
                        ikVar2.an(i8 & 127, (byte) 31);
                        i22 = i19;
                        i33 = i32;
                        i19 = i34;
                    } else if (i2 == 1) {
                        if (obj != null) {
                            ikVar2.an(i6 + mn.an, (byte) 31);
                        }
                        i32 = i33 + 1;
                        i7 += ikVar.af[i33];
                        i19 = i18 + 1;
                        i9 += ikVar.af[i18];
                        ikVar2.an(i7 & 127, (byte) 31);
                        ikVar2.an(i9 & 127, (byte) 31);
                        i18 = i19;
                        i33 = i32;
                        i19 = i34;
                    } else if (i2 == 2) {
                        if (obj != null) {
                            ikVar2.an(i6 + 176, (byte) 31);
                        }
                        i13 = i15 + 1;
                        au = (ikVar.af[i15] + au) & 127;
                        ikVar2.an(au, (byte) 31);
                        byte b;
                        if (au == 0 || au == 32) {
                            i32 = i24 + 1;
                            b = ikVar.af[i24];
                            i24 = i17;
                            i17 = i20;
                            i20 = i21;
                            i21 = i3;
                            i3 = i31;
                            i31 = i29;
                            i29 = b;
                            i19 = i32;
                            i32 = i30;
                            i30 = i25;
                        } else if (au == 1) {
                            i32 = i29 + 1;
                            r29 = ikVar.af[i29];
                            i19 = i24;
                            i24 = i17;
                            i17 = i20;
                            i20 = i21;
                            i21 = i3;
                            i3 = i31;
                            i31 = i32;
                            i32 = i30;
                            i30 = i25;
                        } else if (au == 33) {
                            i32 = i21 + 1;
                            b = ikVar.af[i21];
                            i21 = i3;
                            i3 = i31;
                            i31 = i29;
                            r29 = b;
                            i19 = i24;
                            i24 = i17;
                            i17 = i20;
                            i20 = i32;
                            i32 = i30;
                            i30 = i25;
                        } else if (au == 7) {
                            i32 = i30 + 1;
                            b = ikVar.af[i30];
                            i30 = i25;
                            r43 = i24;
                            i24 = i17;
                            i17 = i20;
                            i20 = i21;
                            i21 = i3;
                            i3 = i31;
                            i31 = i29;
                            r29 = b;
                            i19 = r43;
                        } else if (au == 39) {
                            i32 = i20 + 1;
                            b = ikVar.af[i20];
                            i20 = i21;
                            i21 = i3;
                            i3 = i31;
                            i31 = i29;
                            r29 = b;
                            i19 = i24;
                            i24 = i17;
                            i17 = i32;
                            i32 = i30;
                            i30 = i25;
                        } else if (au == 10) {
                            i32 = i31 + 1;
                            b = ikVar.af[i31];
                            i31 = i29;
                            r29 = b;
                            i19 = i24;
                            i24 = i17;
                            i17 = i20;
                            i20 = i21;
                            i21 = i3;
                            i3 = i32;
                            i32 = i30;
                            i30 = i25;
                        } else if (au == 42) {
                            i32 = i17 + 1;
                            b = ikVar.af[i17];
                            i17 = i20;
                            i20 = i21;
                            i21 = i3;
                            i3 = i31;
                            i31 = i29;
                            r29 = b;
                            i19 = i24;
                            i24 = i32;
                            i32 = i30;
                            i30 = i25;
                        } else if (au == 99) {
                            i19 = i23 + 1;
                            i32 = i30;
                            i30 = i25;
                            r43 = i24;
                            i24 = i17;
                            i17 = i20;
                            i20 = i21;
                            i21 = i3;
                            i3 = i31;
                            i31 = i29;
                            r29 = ikVar.af[i23];
                            i23 = i19;
                            i19 = r43;
                        } else if (au == 98) {
                            i19 = ao + 1;
                            i32 = i30;
                            i30 = i25;
                            r43 = i24;
                            i24 = i17;
                            i17 = i20;
                            i20 = i21;
                            i21 = i3;
                            i3 = i31;
                            i31 = i29;
                            r29 = ikVar.af[ao];
                            ao = i19;
                            i19 = r43;
                        } else if (au == 101) {
                            i19 = i + 1;
                            i32 = i30;
                            i30 = i25;
                            r43 = i24;
                            i24 = i17;
                            i17 = i20;
                            i20 = i21;
                            i21 = i3;
                            i3 = i31;
                            i31 = i29;
                            r29 = ikVar.af[i];
                            i = i19;
                            i19 = r43;
                        } else if (au == 100) {
                            i19 = i4 + 1;
                            i32 = i30;
                            i30 = i25;
                            r43 = i24;
                            i24 = i17;
                            i17 = i20;
                            i20 = i21;
                            i21 = i3;
                            i3 = i31;
                            i31 = i29;
                            r29 = ikVar.af[i4];
                            i4 = i19;
                            i19 = r43;
                        } else if (au == 64 || au == 65 || au == 120 || au == 121 || au == 123) {
                            i32 = i25 + 1;
                            i19 = i24;
                            i24 = i17;
                            i17 = i20;
                            i20 = i21;
                            i21 = i3;
                            i3 = i31;
                            i31 = i29;
                            r29 = ikVar.af[i25];
                            int i36 = i30;
                            i30 = i32;
                            i32 = i36;
                        } else {
                            i32 = i3 + 1;
                            b = ikVar.af[i3];
                            i3 = i31;
                            i31 = i29;
                            r29 = b;
                            i19 = i24;
                            i24 = i17;
                            i17 = i20;
                            i20 = i21;
                            i21 = i32;
                            i32 = i30;
                            i30 = i25;
                        }
                        i29 += iArr[au];
                        iArr[au] = i29;
                        ikVar2.an(i29 & 127, (byte) 31);
                        i29 = i31;
                        i25 = i30;
                        i15 = i13;
                        i31 = i3;
                        i30 = i32;
                        i3 = i21;
                        i21 = i20;
                        i20 = i17;
                        i17 = i24;
                        i24 = i19;
                        i19 = i34;
                    } else if (i2 == 3) {
                        if (obj != null) {
                            ikVar2.an(i6 + 224, (byte) 31);
                        }
                        i19 = i16 + 1;
                        i10 += ikVar.af[i16];
                        i16 = i28 + 1;
                        i10 += ikVar.af[i28] << 7;
                        ikVar2.an(i10 & 127, (byte) 31);
                        ikVar2.an((i10 >> 7) & 127, (byte) 31);
                        i28 = i16;
                        i16 = i19;
                        i19 = i34;
                    } else if (i2 == 4) {
                        if (obj != null) {
                            ikVar2.an(i6 + 208, (byte) 31);
                        }
                        i19 = i27 + 1;
                        i11 += ikVar.af[i27];
                        ikVar2.an(i11 & 127, (byte) 31);
                        i27 = i19;
                        i19 = i34;
                    } else if (i2 == 5) {
                        if (obj != null) {
                            ikVar2.an(i6 + 160, (byte) 31);
                        }
                        i19 = i33 + 1;
                        i7 += ikVar.af[i33];
                        i33 = i26 + 1;
                        i12 += ikVar.af[i26];
                        ikVar2.an(i7 & 127, (byte) 31);
                        ikVar2.an(i12 & 127, (byte) 31);
                        i26 = i33;
                        i33 = i19;
                        i19 = i34;
                    } else if (i2 == 6) {
                        if (obj != null) {
                            ikVar2.an(i6 + 192, (byte) 31);
                        }
                        i19 = i24 + 1;
                        ikVar2.an(ikVar.af[i24], (byte) 31);
                        i24 = i19;
                        i19 = i34;
                    } else {
                        throw new RuntimeException();
                    }
                }
            }
            if (obj != null) {
                ikVar2.an(255, (byte) 31);
            }
            ikVar2.an(47, (byte) 31);
            ikVar2.an(0, (byte) 31);
            ikVar2.aw((ikVar2.ad * 1978945739) - i35, (byte) 119);
            i14++;
            i19 = i24;
            i32 = i30;
            i24 = i17;
            i30 = i28;
            i17 = i20;
            i28 = i26;
            i20 = i21;
            i26 = i34;
            i21 = i18;
            i34 = i15;
            i18 = i3;
            i3 = i22;
            i22 = i33;
            i33 = i31;
            i31 = i29;
            i29 = i27;
            i27 = i25;
            i25 = au;
        }
    }

    void ad() {
        if (this.af == null) {
            int i;
            this.af = new kb(16);
            int[] iArr = new int[16];
            int[] iArr2 = new int[16];
            iArr2[9] = mn.an;
            iArr[9] = mn.an;
            mu muVar = new mu(this.ad);
            int aa = muVar.aa();
            for (i = 0; i < aa; i++) {
                muVar.ag(i);
                muVar.ar(i);
                muVar.ay(i);
            }
            while (true) {
                aa = muVar.at();
                int i2 = muVar.ag[aa];
                while (muVar.ag[aa] == i2) {
                    muVar.ag(aa);
                    i = muVar.aj(aa);
                    if (i == 1) {
                        muVar.as();
                        muVar.ay(aa);
                        if (muVar.ab()) {
                            return;
                        }
                    } else {
                        int i3;
                        int i4 = i & 240;
                        if (i4 == 176) {
                            i3 = i & 15;
                            int i5 = (i >> 8) & 127;
                            int i6 = (i >> 16) & 127;
                            if (i5 == 0) {
                                iArr[i3] = (iArr[i3] & -2080769) + (i6 << 14);
                            }
                            if (i5 == 32) {
                                iArr[i3] = (iArr[i3] & -16257) + (i6 << 7);
                            }
                        }
                        if (i4 == 192) {
                            i3 = i & 15;
                            iArr2[i3] = ((i >> 8) & 127) + iArr[i3];
                        }
                        if (i4 == 144) {
                            i4 = i & 15;
                            i3 = (i >> 8) & 127;
                            if (((i >> 16) & 127) > 0) {
                                i4 = iArr2[i4];
                                kt ktVar = (kt) this.af.af((long) i4);
                                if (ktVar == null) {
                                    ktVar = new kt(new byte[mn.an]);
                                    this.af.ad(ktVar, (long) i4);
                                }
                                ktVar.af[i3] = (byte) 1;
                            }
                        }
                        muVar.ar(aa);
                        muVar.ay(aa);
                    }
                }
            }
        }
    }

    void ay() {
        if (this.af == null) {
            int i;
            this.af = new kb(16);
            int[] iArr = new int[16];
            int[] iArr2 = new int[16];
            iArr2[9] = mn.an;
            iArr[9] = mn.an;
            mu muVar = new mu(this.ad);
            int aa = muVar.aa();
            for (i = 0; i < aa; i++) {
                muVar.ag(i);
                muVar.ar(i);
                muVar.ay(i);
            }
            while (true) {
                aa = muVar.at();
                int i2 = muVar.ag[aa];
                while (muVar.ag[aa] == i2) {
                    muVar.ag(aa);
                    i = muVar.aj(aa);
                    if (i == 1) {
                        muVar.as();
                        muVar.ay(aa);
                        if (muVar.ab()) {
                            return;
                        }
                    } else {
                        int i3;
                        int i4 = i & 240;
                        if (i4 == 176) {
                            i3 = i & 15;
                            int i5 = (i >> 8) & 127;
                            int i6 = (i >> 16) & 127;
                            if (i5 == 0) {
                                iArr[i3] = (iArr[i3] & -2080769) + (i6 << 14);
                            }
                            if (i5 == 32) {
                                iArr[i3] = (iArr[i3] & -16257) + (i6 << 7);
                            }
                        }
                        if (i4 == 192) {
                            i3 = i & 15;
                            iArr2[i3] = ((i >> 8) & 127) + iArr[i3];
                        }
                        if (i4 == 144) {
                            i4 = i & 15;
                            i3 = (i >> 8) & 127;
                            if (((i >> 16) & 127) > 0) {
                                i4 = iArr2[i4];
                                kt ktVar = (kt) this.af.af((long) i4);
                                if (ktVar == null) {
                                    ktVar = new kt(new byte[mn.an]);
                                    this.af.ad(ktVar, (long) i4);
                                }
                                ktVar.af[i3] = (byte) 1;
                            }
                        }
                        muVar.ar(aa);
                        muVar.ay(aa);
                    }
                }
            }
        }
    }

    void ae() {
        this.af = null;
    }

    void aj() {
        this.af = null;
    }

    void an() {
        this.af = null;
    }

    void aq() {
        this.af = null;
    }

    void ar() {
        this.af = null;
    }

    void as() {
        this.af = null;
    }
}
