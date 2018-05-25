package p000;

public class bj extends cq {
    static final int[] be = bi.az;
    static final int[] bk = bi.ah;
    static int[] bt = new int[lm.ar];
    static int bu = 0;
    static int[] bx = new int[lm.ar];
    int[] aa;
    short[] ab;
    int[][] ac;
    int[] ad;
    byte[] ae;
    int af;
    int ag;
    short[] ah;
    int ai;
    byte[] aj;
    short[] ak;
    co[] al;
    byte[] am;
    int[] an;
    short[] ao;
    ci[] ap;
    byte[] aq;
    int[] ar;
    int[] as;
    short[] at;
    int[] au;
    int[][] av;
    byte aw;
    int[] ax;
    int[] ay;
    byte[] az;
    public short bb;
    public short bc;
    int bf;
    int bg;
    int bh;
    int bp;
    int bv;
    ci[] bw;
    boolean bz;

    bj() {
        this.af = 0;
        this.ag = 0;
        this.aw = (byte) 0;
        this.bz = false;
    }

    public static bj af(kf kfVar, int i, int i2) {
        byte[] an = kfVar.an(i, i2, -1409180301);
        if (an == null) {
            return null;
        }
        return new bj(an);
    }

    public static bj al(kf kfVar, int i, int i2) {
        byte[] an = kfVar.an(i, i2, 77571671);
        if (an == null) {
            return null;
        }
        return new bj(an);
    }

    public static bj ap(kf kfVar, int i, int i2) {
        byte[] an = kfVar.an(i, i2, 489934852);
        return an == null ? null : new bj(an);
    }

    public static bj bb(kf kfVar, int i, int i2) {
        byte[] an = kfVar.an(i, i2, 102341287);
        if (an == null) {
            return null;
        }
        return new bj(an);
    }

    public static bj bw(kf kfVar, int i, int i2) {
        byte[] an = kfVar.an(i, i2, -968843180);
        return an == null ? null : new bj(an);
    }

    bj(byte[] bArr) {
        this.af = 0;
        this.ag = 0;
        this.aw = (byte) 0;
        this.bz = false;
        if (bArr[bArr.length - 1] == (byte) -1 && bArr[bArr.length - 2] == (byte) -1) {
            ad(bArr);
        } else {
            an(bArr);
        }
    }

    void ad(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        ik ikVar = new ik(bArr);
        ikVar = new ik(bArr);
        ikVar = new ik(bArr);
        ikVar = new ik(bArr);
        ikVar = new ik(bArr);
        ikVar = new ik(bArr);
        ikVar = new ik(bArr);
        ikVar.ad = (bArr.length - 23) * 2065011939;
        int au = ikVar.au(7614240);
        int au2 = ikVar.au(-2048797205);
        int ao = ikVar.ao((byte) 0);
        int ao2 = ikVar.ao((byte) 0);
        int ao3 = ikVar.ao((byte) 0);
        int ao4 = ikVar.ao((byte) 0);
        int ao5 = ikVar.ao((byte) 0);
        int ao6 = ikVar.ao((byte) 0);
        int ao7 = ikVar.ao((byte) 0);
        int au3 = ikVar.au(-727488793);
        int au4 = ikVar.au(1137852443);
        int au5 = ikVar.au(-2022309732);
        int au6 = ikVar.au(140477158);
        int au7 = ikVar.au(758180690);
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        if (ao > 0) {
            this.az = new byte[ao];
            ikVar.ad = 0;
            for (i = 0; i < ao; i++) {
                byte[] bArr2 = this.az;
                byte ax = ikVar.ax(1247983979);
                bArr2[i] = ax;
                if (ax == (byte) 0) {
                    i7++;
                }
                if (ax >= (byte) 1 && ax <= (byte) 3) {
                    i8++;
                }
                if (ax == (byte) 2) {
                    i9++;
                }
            }
        }
        int i10 = ao + au;
        if (ao2 == 1) {
            i = i10 + au2;
        } else {
            i = i10;
        }
        int i11 = i + au2;
        if (ao3 == 255) {
            i2 = i11 + au2;
        } else {
            i2 = i11;
        }
        if (ao5 == 1) {
            i3 = i2 + au2;
        } else {
            i3 = i2;
        }
        if (ao7 == 1) {
            i4 = i3 + au;
        } else {
            i4 = i3;
        }
        if (ao4 == 1) {
            i5 = i4 + au2;
        } else {
            i5 = i4;
        }
        au6 += i5;
        if (ao6 == 1) {
            i6 = (au2 * 2) + au6;
        } else {
            i6 = au6;
        }
        au7 += i6;
        int i12 = (au2 * 2) + au7;
        au3 += i12;
        au4 += au3;
        int i13 = au4 + au5;
        int i14 = i13 + (i7 * 6);
        int i15 = i14 + (i8 * 6);
        int i16 = i15 + (i8 * 6);
        int i17 = i16 + (i8 * 2);
        int i18 = i17 + i8;
        int i19 = i18 + ((i9 * 2) + (i8 * 2));
        this.af = au;
        this.ag = au2;
        this.ai = ao;
        this.ad = new int[au];
        this.an = new int[au];
        this.aa = new int[au];
        this.ay = new int[au2];
        this.as = new int[au2];
        this.ar = new int[au2];
        if (ao7 == 1) {
            this.ax = new int[au];
        }
        if (ao2 == 1) {
            this.aj = new byte[au2];
        }
        if (ao3 == 255) {
            this.ae = new byte[au2];
        } else {
            this.aw = (byte) ao3;
        }
        if (ao4 == 1) {
            this.aq = new byte[au2];
        }
        if (ao5 == 1) {
            this.au = new int[au2];
        }
        if (ao6 == 1) {
            this.ab = new short[au2];
        }
        if (ao6 == 1 && ao > 0) {
            this.am = new byte[au2];
        }
        this.at = new short[au2];
        if (ao > 0) {
            this.ah = new short[ao];
            this.ak = new short[ao];
            this.ao = new short[ao];
        }
        ikVar.ad = 2065011939 * ao;
        ikVar.ad = 2065011939 * i12;
        ikVar.ad = 2065011939 * au3;
        ikVar.ad = 2065011939 * au4;
        ikVar.ad = 2065011939 * i3;
        au3 = 0;
        au4 = 0;
        au5 = 0;
        i3 = 0;
        while (i3 < au) {
            i12 = ikVar.ao((byte) 0);
            if ((i12 & 1) != 0) {
                i7 = ikVar.bh(-2068857047);
            } else {
                i7 = 0;
            }
            i9 = 0;
            if ((i12 & 2) != 0) {
                i9 = ikVar.bh(-1804623246);
            }
            i8 = 0;
            if ((i12 & 4) != 0) {
                i8 = ikVar.bh(-1565699513);
            }
            this.ad[i3] = i7 + au5;
            this.an[i3] = i9 + au4;
            this.aa[i3] = i8 + au3;
            au3 = this.ad[i3];
            i7 = this.an[i3];
            i8 = this.aa[i3];
            if (ao7 == 1) {
                this.ax[i3] = ikVar.ao((byte) 0);
            }
            i3++;
            au4 = i7;
            au5 = au3;
            au3 = i8;
        }
        ikVar.ad = 2065011939 * au7;
        ikVar.ad = 2065011939 * i10;
        ikVar.ad = 2065011939 * i11;
        ikVar.ad = 2065011939 * i4;
        ikVar.ad = 2065011939 * i2;
        ikVar.ad = 2065011939 * au6;
        ikVar.ad = 2065011939 * i6;
        i9 = 0;
        while (i9 < au2) {
            this.at[i9] = (short) ikVar.au(791437654);
            if (ao2 == 1) {
                this.aj[i9] = ikVar.ax(1247983979);
            }
            if (ao3 == 255) {
                this.ae[i9] = ikVar.ax(1247983979);
            }
            if (ao4 == 1) {
                this.aq[i9] = ikVar.ax(1247983979);
            }
            if (ao5 == 1) {
                this.au[i9] = ikVar.ao((byte) 0);
            }
            if (ao6 == 1) {
                this.ab[i9] = (short) (ikVar.au(-542475478) - 1);
            }
            if (!(this.am == null || this.ab[i9] == (short) -1)) {
                this.am[i9] = (byte) (ikVar.ao((byte) 0) - 1);
            }
            i9++;
        }
        ikVar.ad = 2065011939 * i5;
        ikVar.ad = 2065011939 * i;
        i = 0;
        i9 = 0;
        i8 = 0;
        i7 = 0;
        i10 = 0;
        while (i10 < au2) {
            int i20;
            i3 = ikVar.ao((byte) 0);
            if (i3 == 1) {
                i7 = ikVar.bh(-2075466815) + i9;
                i = ikVar.bh(-1365285896) + i7;
                i9 = ikVar.bh(-1717510933) + i;
                this.ay[i10] = i7;
                this.as[i10] = i;
                this.ar[i10] = i9;
                i8 = i9;
            }
            if (i3 == 2) {
                i9 += ikVar.bh(-1670654506);
                this.ay[i10] = i7;
                this.as[i10] = i8;
                this.ar[i10] = i9;
                i = i8;
                i8 = i9;
            }
            if (i3 == 3) {
                i9 += ikVar.bh(-1978528549);
                this.ay[i10] = i8;
                this.as[i10] = i;
                this.ar[i10] = i9;
                i7 = i8;
                i8 = i9;
            }
            if (i3 == 4) {
                i9 += ikVar.bh(-2065961351);
                this.ay[i10] = i;
                this.as[i10] = i7;
                this.ar[i10] = i9;
                i8 = i9;
            } else {
                i20 = i;
                i = i7;
                i7 = i20;
            }
            i10++;
            i20 = i7;
            i7 = i;
            i = i20;
        }
        ikVar.ad = 2065011939 * i13;
        ikVar.ad = 2065011939 * i14;
        ikVar.ad = 2065011939 * i15;
        ikVar.ad = 2065011939 * i16;
        ikVar.ad = 2065011939 * i17;
        ikVar.ad = 2065011939 * i18;
        for (i9 = 0; i9 < ao; i9++) {
            if ((this.az[i9] & 255) == 0) {
                this.ah[i9] = (short) ikVar.au(-456082324);
                this.ak[i9] = (short) ikVar.au(1372457322);
                this.ao[i9] = (short) ikVar.au(303487410);
            }
        }
        ikVar.ad = 2065011939 * i19;
        if (ikVar.ao((byte) 0) != 0) {
            bo boVar = new bo();
            ikVar.au(1719633286);
            ikVar.au(-922975538);
            ikVar.au(122488629);
            ikVar.al(1887791406);
        }
    }

    void bc(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        ik ikVar = new ik(bArr);
        ikVar = new ik(bArr);
        ikVar = new ik(bArr);
        ikVar = new ik(bArr);
        ikVar = new ik(bArr);
        ikVar = new ik(bArr);
        ikVar = new ik(bArr);
        ikVar.ad = (bArr.length - 23) * 2065011939;
        int au = ikVar.au(1450525106);
        int au2 = ikVar.au(-440820764);
        int ao = ikVar.ao((byte) 0);
        int ao2 = ikVar.ao((byte) 0);
        int ao3 = ikVar.ao((byte) 0);
        int ao4 = ikVar.ao((byte) 0);
        int ao5 = ikVar.ao((byte) 0);
        int ao6 = ikVar.ao((byte) 0);
        int ao7 = ikVar.ao((byte) 0);
        int au3 = ikVar.au(-33659437);
        int au4 = ikVar.au(-138383117);
        int au5 = ikVar.au(1302985705);
        int au6 = ikVar.au(1556149223);
        int au7 = ikVar.au(702368712);
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        if (ao > 0) {
            this.az = new byte[ao];
            ikVar.ad = 0;
            for (i = 0; i < ao; i++) {
                byte[] bArr2 = this.az;
                byte ax = ikVar.ax(1247983979);
                bArr2[i] = ax;
                if (ax == (byte) 0) {
                    i7++;
                }
                if (ax >= (byte) 1 && ax <= (byte) 3) {
                    i8++;
                }
                if (ax == (byte) 2) {
                    i9++;
                }
            }
        }
        int i10 = ao + au;
        if (ao2 == 1) {
            i = i10 + au2;
        } else {
            i = i10;
        }
        int i11 = i + au2;
        if (ao3 == 1271600733) {
            i2 = i11 + au2;
        } else {
            i2 = i11;
        }
        if (ao5 == 1) {
            i3 = i2 + au2;
        } else {
            i3 = i2;
        }
        if (ao7 == 1) {
            i4 = i3 + au;
        } else {
            i4 = i3;
        }
        if (ao4 == 1) {
            i5 = i4 + au2;
        } else {
            i5 = i4;
        }
        au6 += i5;
        if (ao6 == 1) {
            i6 = (au2 * 2) + au6;
        } else {
            i6 = au6;
        }
        au7 += i6;
        int i12 = (au2 * 2) + au7;
        au3 += i12;
        au4 += au3;
        int i13 = au4 + au5;
        int i14 = i13 + (i7 * 6);
        int i15 = i14 + (i8 * 6);
        int i16 = i15 + (i8 * 6);
        int i17 = i16 + (i8 * 2);
        int i18 = i17 + i8;
        int i19 = i18 + ((i9 * 2) + (i8 * 2));
        this.af = au;
        this.ag = au2;
        this.ai = ao;
        this.ad = new int[au];
        this.an = new int[au];
        this.aa = new int[au];
        this.ay = new int[au2];
        this.as = new int[au2];
        this.ar = new int[au2];
        if (ao7 == 1) {
            this.ax = new int[au];
        }
        if (ao2 == 1) {
            this.aj = new byte[au2];
        }
        if (ao3 == 255) {
            this.ae = new byte[au2];
        } else {
            this.aw = (byte) ao3;
        }
        if (ao4 == 1) {
            this.aq = new byte[au2];
        }
        if (ao5 == 1) {
            this.au = new int[au2];
        }
        if (ao6 == 1) {
            this.ab = new short[au2];
        }
        if (ao6 == 1 && ao > 0) {
            this.am = new byte[au2];
        }
        this.at = new short[au2];
        if (ao > 0) {
            this.ah = new short[ao];
            this.ak = new short[ao];
            this.ao = new short[ao];
        }
        ikVar.ad = 2065011939 * ao;
        ikVar.ad = 2065011939 * i12;
        ikVar.ad = -1014690600 * au3;
        ikVar.ad = -1868765438 * au4;
        ikVar.ad = 1788701470 * i3;
        au3 = 0;
        au4 = 0;
        au5 = 0;
        i3 = 0;
        while (i3 < au) {
            i12 = ikVar.ao((byte) 0);
            i9 = 0;
            if ((i12 & 1) != 0) {
                i9 = ikVar.bh(-1544374973);
            }
            i8 = 0;
            if ((i12 & 2) != 0) {
                i8 = ikVar.bh(-2134482834);
            }
            i7 = 0;
            if ((i12 & 4) != 0) {
                i7 = ikVar.bh(-2119561937);
            }
            this.ad[i3] = i9 + au5;
            this.an[i3] = i8 + au4;
            this.aa[i3] = au3 + i7;
            au3 = this.ad[i3];
            i7 = this.an[i3];
            i8 = this.aa[i3];
            if (ao7 == 1) {
                this.ax[i3] = ikVar.ao((byte) 0);
            }
            i3++;
            au4 = i7;
            au5 = au3;
            au3 = i8;
        }
        ikVar.ad = 2065011939 * au7;
        ikVar.ad = 2065011939 * i10;
        ikVar.ad = 2065011939 * i11;
        ikVar.ad = 7615473 * i4;
        ikVar.ad = 164055249 * i2;
        ikVar.ad = 2065011939 * au6;
        ikVar.ad = 2065011939 * i6;
        i9 = 0;
        while (i9 < au2) {
            this.at[i9] = (short) ikVar.au(470411410);
            if (ao2 == 1) {
                this.aj[i9] = ikVar.ax(1247983979);
            }
            if (ao3 == 255) {
                this.ae[i9] = ikVar.ax(1247983979);
            }
            if (ao4 == 1) {
                this.aq[i9] = ikVar.ax(1247983979);
            }
            if (ao5 == 1) {
                this.au[i9] = ikVar.ao((byte) 0);
            }
            if (ao6 == 1) {
                this.ab[i9] = (short) (ikVar.au(-1435321345) - 1);
            }
            if (!(this.am == null || this.ab[i9] == (short) -1)) {
                this.am[i9] = (byte) (ikVar.ao((byte) 0) - 1);
            }
            i9++;
        }
        ikVar.ad = 385805839 * i5;
        ikVar.ad = 2065011939 * i;
        i = 0;
        i9 = 0;
        i8 = 0;
        i7 = 0;
        i10 = 0;
        while (i10 < au2) {
            int i20;
            i2 = ikVar.ao((byte) 0);
            if (i2 == 1) {
                i7 = ikVar.bh(-2054018369) + i9;
                i = ikVar.bh(-1617101447) + i7;
                i9 = ikVar.bh(-2013874821) + i;
                this.ay[i10] = i7;
                this.as[i10] = i;
                this.ar[i10] = i9;
                i8 = i9;
            }
            if (i2 == 2) {
                i9 += ikVar.bh(-1537856262);
                this.ay[i10] = i7;
                this.as[i10] = i8;
                this.ar[i10] = i9;
                i = i8;
                i8 = i9;
            }
            if (i2 == 3) {
                i9 += ikVar.bh(-1454073681);
                this.ay[i10] = i8;
                this.as[i10] = i;
                this.ar[i10] = i9;
                i7 = i8;
                i8 = i9;
            }
            if (i2 == 4) {
                i9 += ikVar.bh(-1909416518);
                this.ay[i10] = i;
                this.as[i10] = i7;
                this.ar[i10] = i9;
                i8 = i9;
            } else {
                i20 = i;
                i = i7;
                i7 = i20;
            }
            i10++;
            i20 = i7;
            i7 = i;
            i = i20;
        }
        ikVar.ad = 801578728 * i13;
        ikVar.ad = 2065011939 * i14;
        ikVar.ad = 2065011939 * i15;
        ikVar.ad = -171774987 * i16;
        ikVar.ad = -472367423 * i17;
        ikVar.ad = 2080572246 * i18;
        for (i9 = 0; i9 < ao; i9++) {
            if ((this.az[i9] & 255) == 0) {
                this.ah[i9] = (short) ikVar.au(-2071533916);
                this.ak[i9] = (short) ikVar.au(255747171);
                this.ao[i9] = (short) ikVar.au(-623241540);
            }
        }
        ikVar.ad = -2011337104 * i19;
        if (ikVar.ao((byte) 0) != 0) {
            bo boVar = new bo();
            ikVar.au(1342126500);
            ikVar.au(1694150782);
            ikVar.au(-1756536357);
            ikVar.al(487544409);
        }
    }

    void bg(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        ik ikVar = new ik(bArr);
        ikVar = new ik(bArr);
        ikVar = new ik(bArr);
        ikVar = new ik(bArr);
        ikVar = new ik(bArr);
        ikVar = new ik(bArr);
        ikVar = new ik(bArr);
        ikVar.ad = (bArr.length - 23) * 2065011939;
        int au = ikVar.au(1763429499);
        int au2 = ikVar.au(1637906146);
        int ao = ikVar.ao((byte) 0);
        int ao2 = ikVar.ao((byte) 0);
        int ao3 = ikVar.ao((byte) 0);
        int ao4 = ikVar.ao((byte) 0);
        int ao5 = ikVar.ao((byte) 0);
        int ao6 = ikVar.ao((byte) 0);
        int ao7 = ikVar.ao((byte) 0);
        int au3 = ikVar.au(-760202301);
        int au4 = ikVar.au(-844152162);
        int au5 = ikVar.au(-735418554);
        int au6 = ikVar.au(830597404);
        int au7 = ikVar.au(-1582088258);
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        if (ao > 0) {
            this.az = new byte[ao];
            ikVar.ad = 0;
            for (i = 0; i < ao; i++) {
                byte[] bArr2 = this.az;
                byte ax = ikVar.ax(1247983979);
                bArr2[i] = ax;
                if (ax == (byte) 0) {
                    i6++;
                }
                if (ax >= (byte) 1 && ax <= (byte) 3) {
                    i7++;
                }
                if (ax == (byte) 2) {
                    i8++;
                }
            }
        }
        int i9 = ao + au;
        if (ao2 == 1) {
            i = i9 + au2;
        } else {
            i = i9;
        }
        int i10 = i + au2;
        if (ao3 == 255) {
            i2 = i10 + au2;
        } else {
            i2 = i10;
        }
        if (ao5 == 1) {
            i3 = i2 + au2;
        } else {
            i3 = i2;
        }
        if (ao7 == 1) {
            i4 = i3 + au;
        } else {
            i4 = i3;
        }
        if (ao4 == 1) {
            i5 = i4 + au2;
        } else {
            i5 = i4;
        }
        int i11 = i5 + au6;
        if (ao6 == 1) {
            au6 = (au2 * 2) + i11;
        } else {
            au6 = i11;
        }
        au7 += au6;
        int i12 = (au2 * 2) + au7;
        au3 += i12;
        au4 += au3;
        int i13 = au4 + au5;
        int i14 = i13 + (i6 * 6);
        int i15 = i14 + (i7 * 6);
        int i16 = i15 + (i7 * 6);
        int i17 = i16 + (i7 * 2);
        int i18 = i17 + i7;
        int i19 = i18 + ((i8 * 2) + (i7 * 2));
        this.af = au;
        this.ag = au2;
        this.ai = ao;
        this.ad = new int[au];
        this.an = new int[au];
        this.aa = new int[au];
        this.ay = new int[au2];
        this.as = new int[au2];
        this.ar = new int[au2];
        if (ao7 == 1) {
            this.ax = new int[au];
        }
        if (ao2 == 1) {
            this.aj = new byte[au2];
        }
        if (ao3 == 255) {
            this.ae = new byte[au2];
        } else {
            this.aw = (byte) ao3;
        }
        if (ao4 == 1) {
            this.aq = new byte[au2];
        }
        if (ao5 == 1) {
            this.au = new int[au2];
        }
        if (ao6 == 1) {
            this.ab = new short[au2];
        }
        if (ao6 == 1 && ao > 0) {
            this.am = new byte[au2];
        }
        this.at = new short[au2];
        if (ao > 0) {
            this.ah = new short[ao];
            this.ak = new short[ao];
            this.ao = new short[ao];
        }
        ikVar.ad = 2065011939 * ao;
        ikVar.ad = 2065011939 * i12;
        ikVar.ad = 2065011939 * au3;
        ikVar.ad = 2065011939 * au4;
        ikVar.ad = 2065011939 * i3;
        au3 = 0;
        au4 = 0;
        au5 = 0;
        i3 = 0;
        while (i3 < au) {
            i12 = ikVar.ao((byte) 0);
            i8 = 0;
            if ((i12 & 1) != 0) {
                i8 = ikVar.bh(-2139178865);
            }
            i7 = 0;
            if ((i12 & 2) != 0) {
                i7 = ikVar.bh(-2026759659);
            }
            i6 = 0;
            if ((i12 & 4) != 0) {
                i6 = ikVar.bh(-1926541597);
            }
            this.ad[i3] = i8 + au5;
            this.an[i3] = i7 + au4;
            this.aa[i3] = au3 + i6;
            au3 = this.ad[i3];
            i6 = this.an[i3];
            i7 = this.aa[i3];
            if (ao7 == 1) {
                this.ax[i3] = ikVar.ao((byte) 0);
            }
            i3++;
            au4 = i6;
            au5 = au3;
            au3 = i7;
        }
        ikVar.ad = 2065011939 * au7;
        ikVar.ad = 2065011939 * i9;
        ikVar.ad = 2065011939 * i10;
        ikVar.ad = 2065011939 * i4;
        ikVar.ad = 2065011939 * i2;
        ikVar.ad = 2065011939 * i11;
        ikVar.ad = 2065011939 * au6;
        i8 = 0;
        while (i8 < au2) {
            this.at[i8] = (short) ikVar.au(-1293911319);
            if (ao2 == 1) {
                this.aj[i8] = ikVar.ax(1247983979);
            }
            if (ao3 == 255) {
                this.ae[i8] = ikVar.ax(1247983979);
            }
            if (ao4 == 1) {
                this.aq[i8] = ikVar.ax(1247983979);
            }
            if (ao5 == 1) {
                this.au[i8] = ikVar.ao((byte) 0);
            }
            if (ao6 == 1) {
                this.ab[i8] = (short) (ikVar.au(-1551557615) - 1);
            }
            if (!(this.am == null || this.ab[i8] == (short) -1)) {
                this.am[i8] = (byte) (ikVar.ao((byte) 0) - 1);
            }
            i8++;
        }
        ikVar.ad = 2065011939 * i5;
        ikVar.ad = 2065011939 * i;
        i = 0;
        i8 = 0;
        i7 = 0;
        i6 = 0;
        i9 = 0;
        while (i9 < au2) {
            int i20;
            i3 = ikVar.ao((byte) 0);
            if (i3 == 1) {
                i6 = ikVar.bh(-1499034880) + i8;
                i = ikVar.bh(-2053962786) + i6;
                i8 = ikVar.bh(-1857007922) + i;
                this.ay[i9] = i6;
                this.as[i9] = i;
                this.ar[i9] = i8;
                i7 = i8;
            }
            if (i3 == 2) {
                i8 += ikVar.bh(-2140776068);
                this.ay[i9] = i6;
                this.as[i9] = i7;
                this.ar[i9] = i8;
                i = i7;
                i7 = i8;
            }
            if (i3 == 3) {
                i8 += ikVar.bh(-2086993718);
                this.ay[i9] = i7;
                this.as[i9] = i;
                this.ar[i9] = i8;
                i6 = i7;
                i7 = i8;
            }
            if (i3 == 4) {
                i8 += ikVar.bh(-1313348078);
                this.ay[i9] = i;
                this.as[i9] = i6;
                this.ar[i9] = i8;
                i7 = i8;
            } else {
                i20 = i;
                i = i6;
                i6 = i20;
            }
            i9++;
            i20 = i6;
            i6 = i;
            i = i20;
        }
        ikVar.ad = 2065011939 * i13;
        ikVar.ad = 2065011939 * i14;
        ikVar.ad = 2065011939 * i15;
        ikVar.ad = 2065011939 * i16;
        ikVar.ad = 2065011939 * i17;
        ikVar.ad = 2065011939 * i18;
        for (i8 = 0; i8 < ao; i8++) {
            if ((this.az[i8] & 255) == 0) {
                this.ah[i8] = (short) ikVar.au(-1542223514);
                this.ak[i8] = (short) ikVar.au(-906538277);
                this.ao[i8] = (short) ikVar.au(1185268434);
            }
        }
        ikVar.ad = 2065011939 * i19;
        if (ikVar.ao((byte) 0) != 0) {
            bo boVar = new bo();
            ikVar.au(-989864699);
            ikVar.au(-706134178);
            ikVar.au(-1344106164);
            ikVar.al(351591731);
        }
    }

    void bz(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        ik ikVar = new ik(bArr);
        ikVar = new ik(bArr);
        ikVar = new ik(bArr);
        ikVar = new ik(bArr);
        ikVar = new ik(bArr);
        ikVar = new ik(bArr);
        ikVar = new ik(bArr);
        ikVar.ad = (bArr.length - 23) * 2065011939;
        int au = ikVar.au(457394588);
        int au2 = ikVar.au(1452229145);
        int ao = ikVar.ao((byte) 0);
        int ao2 = ikVar.ao((byte) 0);
        int ao3 = ikVar.ao((byte) 0);
        int ao4 = ikVar.ao((byte) 0);
        int ao5 = ikVar.ao((byte) 0);
        int ao6 = ikVar.ao((byte) 0);
        int ao7 = ikVar.ao((byte) 0);
        int au3 = ikVar.au(-1065613845);
        int au4 = ikVar.au(-838347526);
        int au5 = ikVar.au(-182601617);
        int au6 = ikVar.au(950655534);
        int au7 = ikVar.au(-2033449618);
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        if (ao > 0) {
            this.az = new byte[ao];
            ikVar.ad = 0;
            for (i = 0; i < ao; i++) {
                byte[] bArr2 = this.az;
                byte ax = ikVar.ax(1247983979);
                bArr2[i] = ax;
                if (ax == (byte) 0) {
                    i6++;
                }
                if (ax >= (byte) 1 && ax <= (byte) 3) {
                    i7++;
                }
                if (ax == (byte) 2) {
                    i8++;
                }
            }
        }
        int i9 = ao + au;
        if (ao2 == 1) {
            i = i9 + au2;
        } else {
            i = i9;
        }
        int i10 = i + au2;
        if (ao3 == 255) {
            i2 = i10 + au2;
        } else {
            i2 = i10;
        }
        if (ao5 == 1) {
            i3 = i2 + au2;
        } else {
            i3 = i2;
        }
        if (ao7 == 1) {
            i4 = i3 + au;
        } else {
            i4 = i3;
        }
        if (ao4 == 1) {
            i5 = i4 + au2;
        } else {
            i5 = i4;
        }
        int i11 = i5 + au6;
        if (ao6 == 1) {
            au6 = (au2 * 2) + i11;
        } else {
            au6 = i11;
        }
        au7 += au6;
        int i12 = (au2 * 2) + au7;
        au3 += i12;
        au4 += au3;
        int i13 = au4 + au5;
        int i14 = i13 + (i6 * 6);
        int i15 = i14 + (i7 * 6);
        int i16 = i15 + (i7 * 6);
        int i17 = i16 + (i7 * 2);
        int i18 = i17 + i7;
        int i19 = i18 + ((i8 * 2) + (i7 * 2));
        this.af = au;
        this.ag = au2;
        this.ai = ao;
        this.ad = new int[au];
        this.an = new int[au];
        this.aa = new int[au];
        this.ay = new int[au2];
        this.as = new int[au2];
        this.ar = new int[au2];
        if (ao7 == 1) {
            this.ax = new int[au];
        }
        if (ao2 == 1) {
            this.aj = new byte[au2];
        }
        if (ao3 == 255) {
            this.ae = new byte[au2];
        } else {
            this.aw = (byte) ao3;
        }
        if (ao4 == 1) {
            this.aq = new byte[au2];
        }
        if (ao5 == 1) {
            this.au = new int[au2];
        }
        if (ao6 == 1) {
            this.ab = new short[au2];
        }
        if (ao6 == 1 && ao > 0) {
            this.am = new byte[au2];
        }
        this.at = new short[au2];
        if (ao > 0) {
            this.ah = new short[ao];
            this.ak = new short[ao];
            this.ao = new short[ao];
        }
        ikVar.ad = 2065011939 * ao;
        ikVar.ad = 2065011939 * i12;
        ikVar.ad = 2065011939 * au3;
        ikVar.ad = 2065011939 * au4;
        ikVar.ad = 2065011939 * i3;
        au3 = 0;
        au4 = 0;
        au5 = 0;
        i3 = 0;
        while (i3 < au) {
            i12 = ikVar.ao((byte) 0);
            if ((i12 & 1) != 0) {
                i6 = ikVar.bh(-1475183914);
            } else {
                i6 = 0;
            }
            i8 = 0;
            if ((i12 & 2) != 0) {
                i8 = ikVar.bh(-1804957225);
            }
            i7 = 0;
            if ((i12 & 4) != 0) {
                i7 = ikVar.bh(-1949540295);
            }
            this.ad[i3] = i6 + au5;
            this.an[i3] = i8 + au4;
            this.aa[i3] = i7 + au3;
            au3 = this.ad[i3];
            i6 = this.an[i3];
            i7 = this.aa[i3];
            if (ao7 == 1) {
                this.ax[i3] = ikVar.ao((byte) 0);
            }
            i3++;
            au4 = i6;
            au5 = au3;
            au3 = i7;
        }
        ikVar.ad = 2065011939 * au7;
        ikVar.ad = 2065011939 * i9;
        ikVar.ad = 2065011939 * i10;
        ikVar.ad = 2065011939 * i4;
        ikVar.ad = 2065011939 * i2;
        ikVar.ad = 2065011939 * i11;
        ikVar.ad = 2065011939 * au6;
        i8 = 0;
        while (i8 < au2) {
            this.at[i8] = (short) ikVar.au(813985558);
            if (ao2 == 1) {
                this.aj[i8] = ikVar.ax(1247983979);
            }
            if (ao3 == 255) {
                this.ae[i8] = ikVar.ax(1247983979);
            }
            if (ao4 == 1) {
                this.aq[i8] = ikVar.ax(1247983979);
            }
            if (ao5 == 1) {
                this.au[i8] = ikVar.ao((byte) 0);
            }
            if (ao6 == 1) {
                this.ab[i8] = (short) (ikVar.au(1423283584) - 1);
            }
            if (!(this.am == null || this.ab[i8] == (short) -1)) {
                this.am[i8] = (byte) (ikVar.ao((byte) 0) - 1);
            }
            i8++;
        }
        ikVar.ad = 2065011939 * i5;
        ikVar.ad = 2065011939 * i;
        i = 0;
        i8 = 0;
        i7 = 0;
        i6 = 0;
        i9 = 0;
        while (i9 < au2) {
            int i20;
            i2 = ikVar.ao((byte) 0);
            if (i2 == 1) {
                i6 = ikVar.bh(-1587201426) + i8;
                i = ikVar.bh(-1370203758) + i6;
                i8 = ikVar.bh(-1346980960) + i;
                this.ay[i9] = i6;
                this.as[i9] = i;
                this.ar[i9] = i8;
                i7 = i8;
            }
            if (i2 == 2) {
                i8 += ikVar.bh(-1527717207);
                this.ay[i9] = i6;
                this.as[i9] = i7;
                this.ar[i9] = i8;
                i = i7;
                i7 = i8;
            }
            if (i2 == 3) {
                i8 += ikVar.bh(-1429360847);
                this.ay[i9] = i7;
                this.as[i9] = i;
                this.ar[i9] = i8;
                i6 = i7;
                i7 = i8;
            }
            if (i2 == 4) {
                i8 += ikVar.bh(-1814838631);
                this.ay[i9] = i;
                this.as[i9] = i6;
                this.ar[i9] = i8;
                i7 = i8;
            } else {
                i20 = i;
                i = i6;
                i6 = i20;
            }
            i9++;
            i20 = i6;
            i6 = i;
            i = i20;
        }
        ikVar.ad = 2065011939 * i13;
        ikVar.ad = 2065011939 * i14;
        ikVar.ad = 2065011939 * i15;
        ikVar.ad = 2065011939 * i16;
        ikVar.ad = 2065011939 * i17;
        ikVar.ad = 2065011939 * i18;
        for (i8 = 0; i8 < ao; i8++) {
            if ((this.az[i8] & 255) == 0) {
                this.ah[i8] = (short) ikVar.au(-816406459);
                this.ak[i8] = (short) ikVar.au(1181378973);
                this.ao[i8] = (short) ikVar.au(-1876917223);
            }
        }
        ikVar.ad = 2065011939 * i19;
        if (ikVar.ao((byte) 0) != 0) {
            bo boVar = new bo();
            ikVar.au(-1339465683);
            ikVar.au(-1553895861);
            ikVar.au(-442041573);
            ikVar.al(546988992);
        }
    }

    void an(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        ik ikVar = new ik(bArr);
        ikVar = new ik(bArr);
        ikVar = new ik(bArr);
        ikVar = new ik(bArr);
        ikVar = new ik(bArr);
        ikVar.ad = (bArr.length - 18) * 2065011939;
        int au = ikVar.au(1228705290);
        int au2 = ikVar.au(-701664899);
        int ao = ikVar.ao((byte) 0);
        int ao2 = ikVar.ao((byte) 0);
        int ao3 = ikVar.ao((byte) 0);
        int ao4 = ikVar.ao((byte) 0);
        int ao5 = ikVar.ao((byte) 0);
        int ao6 = ikVar.ao((byte) 0);
        int au3 = ikVar.au(-1075945492);
        int au4 = ikVar.au(812398279);
        int au5 = ikVar.au(1972499908);
        int au6 = ikVar.au(13848044);
        int i6 = 0 + au;
        int i7 = i6 + au2;
        if (ao3 == 255) {
            i = i7 + au2;
        } else {
            i = i7;
        }
        if (ao5 == 1) {
            i2 = i + au2;
        } else {
            i2 = i;
        }
        if (ao2 == 1) {
            i3 = i2 + au2;
        } else {
            i3 = i2;
        }
        if (ao6 == 1) {
            i4 = i3 + au;
        } else {
            i4 = i3;
        }
        if (ao4 == 1) {
            i5 = i4 + au2;
        } else {
            i5 = i4;
        }
        int i8 = i5 + au6;
        int i9 = i8 + (au2 * 2);
        au6 = (ao * 6) + i9;
        au3 += au6;
        au4 += au3;
        au5 += au4;
        this.af = au;
        this.ag = au2;
        this.ai = ao;
        this.ad = new int[au];
        this.an = new int[au];
        this.aa = new int[au];
        this.ay = new int[au2];
        this.as = new int[au2];
        this.ar = new int[au2];
        if (ao > 0) {
            this.az = new byte[ao];
            this.ah = new short[ao];
            this.ak = new short[ao];
            this.ao = new short[ao];
        }
        if (ao6 == 1) {
            this.ax = new int[au];
        }
        if (ao2 == 1) {
            this.aj = new byte[au2];
            this.am = new byte[au2];
            this.ab = new short[au2];
        }
        if (ao3 == 255) {
            this.ae = new byte[au2];
        } else {
            this.aw = (byte) ao3;
        }
        if (ao4 == 1) {
            this.aq = new byte[au2];
        }
        if (ao5 == 1) {
            this.au = new int[au2];
        }
        this.at = new short[au2];
        ikVar.ad = 0;
        ikVar.ad = 2065011939 * au6;
        ikVar.ad = au3 * 2065011939;
        ikVar.ad = 2065011939 * au4;
        ikVar.ad = i3 * 2065011939;
        au6 = 0;
        int i10 = 0;
        int i11 = 0;
        au5 = 0;
        while (au5 < au) {
            int ao7 = ikVar.ao((byte) 0);
            i3 = 0;
            if ((ao7 & 1) != 0) {
                i3 = ikVar.bh(-2043020499);
            }
            if ((ao7 & 2) != 0) {
                au4 = ikVar.bh(-1331497806);
            } else {
                au4 = 0;
            }
            au3 = 0;
            if ((ao7 & 4) != 0) {
                au3 = ikVar.bh(-1463575120);
            }
            this.ad[au5] = i3 + i11;
            this.an[au5] = au4 + i10;
            this.aa[au5] = au3 + au6;
            au6 = this.ad[au5];
            au4 = this.an[au5];
            au3 = this.aa[au5];
            if (ao6 == 1) {
                this.ax[au5] = ikVar.ao((byte) 0);
            }
            au5++;
            i10 = au4;
            i11 = au6;
            au6 = au3;
        }
        ikVar.ad = 2065011939 * i8;
        ikVar.ad = 2065011939 * i2;
        ikVar.ad = i7 * 2065011939;
        ikVar.ad = 2065011939 * i4;
        ikVar.ad = i * 2065011939;
        i4 = 0;
        Object obj = null;
        Object obj2 = null;
        while (i4 < au2) {
            Object obj3;
            Object obj4;
            this.at[i4] = (short) ikVar.au(-881325767);
            if (ao2 == 1) {
                i = ikVar.ao((byte) 0);
                if ((i & 1) == 1) {
                    this.aj[i4] = (byte) 1;
                    obj3 = 1;
                } else {
                    this.aj[i4] = (byte) 0;
                    obj3 = obj2;
                }
                if ((i & 2) == 2) {
                    this.am[i4] = (byte) (i >> 2);
                    this.ab[i4] = this.at[i4];
                    this.at[i4] = (short) 127;
                    obj4 = this.ab[i4] != (short) -1 ? 1 : obj;
                } else {
                    this.am[i4] = (byte) -1;
                    this.ab[i4] = (short) -1;
                    obj4 = obj;
                }
            } else {
                obj4 = obj;
                obj3 = obj2;
            }
            if (ao3 == 255) {
                this.ae[i4] = ikVar.ax(1247983979);
            }
            if (ao4 == 1) {
                this.aq[i4] = ikVar.ax(1247983979);
            }
            if (ao5 == 1) {
                this.au[i4] = ikVar.ao((byte) 0);
            }
            i4++;
            obj = obj4;
            obj2 = obj3;
        }
        ikVar.ad = 2065011939 * i5;
        ikVar.ad = 2065011939 * i6;
        i3 = 0;
        i = 0;
        i7 = 0;
        i4 = 0;
        i5 = 0;
        while (i5 < au2) {
            int i12;
            int ao8 = ikVar.ao((byte) 0);
            if (ao8 == 1) {
                i4 = ikVar.bh(-1624411858) + i;
                i3 = ikVar.bh(-1438228156) + i4;
                i = ikVar.bh(-1876444550) + i3;
                this.ay[i5] = i4;
                this.as[i5] = i3;
                this.ar[i5] = i;
                i7 = i;
            }
            if (ao8 == 2) {
                i += ikVar.bh(-1418977308);
                this.ay[i5] = i4;
                this.as[i5] = i7;
                this.ar[i5] = i;
                i3 = i7;
                i7 = i;
            }
            if (ao8 == 3) {
                i += ikVar.bh(-1317572677);
                this.ay[i5] = i7;
                this.as[i5] = i3;
                this.ar[i5] = i;
                i4 = i7;
                i7 = i;
            }
            if (ao8 == 4) {
                i += ikVar.bh(-2146396324);
                this.ay[i5] = i3;
                this.as[i5] = i4;
                this.ar[i5] = i;
                i7 = i;
            } else {
                i12 = i3;
                i3 = i4;
                i4 = i12;
            }
            i5++;
            i12 = i4;
            i4 = i3;
            i3 = i12;
        }
        ikVar.ad = 2065011939 * i9;
        for (i = 0; i < ao; i++) {
            this.az[i] = (byte) 0;
            this.ah[i] = (short) ikVar.au(-718968762);
            this.ak[i] = (short) ikVar.au(1449057497);
            this.ao[i] = (short) ikVar.au(1611364543);
        }
        if (this.am != null) {
            obj4 = null;
            i7 = 0;
            while (i7 < au2) {
                i4 = this.am[i7] & 255;
                if (i4 != 255) {
                    if ((this.ah[i4] & 65535) == this.ay[i7] && (this.ak[i4] & 65535) == this.as[i7] && (this.ao[i4] & 65535) == this.ar[i7]) {
                        this.am[i7] = (byte) -1;
                    } else {
                        obj4 = 1;
                    }
                }
                i7++;
            }
            if (obj4 == null) {
                this.am = null;
            }
        }
        if (obj == null) {
            this.ab = null;
        }
        if (obj2 == null) {
            this.aj = null;
        }
    }

    void bh(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        ik ikVar = new ik(bArr);
        ikVar = new ik(bArr);
        ikVar = new ik(bArr);
        ikVar = new ik(bArr);
        ikVar = new ik(bArr);
        ikVar.ad = (bArr.length - 18) * 2065011939;
        int au = ikVar.au(1613401916);
        int au2 = ikVar.au(-1414625062);
        int ao = ikVar.ao((byte) 0);
        int ao2 = ikVar.ao((byte) 0);
        int ao3 = ikVar.ao((byte) 0);
        int ao4 = ikVar.ao((byte) 0);
        int ao5 = ikVar.ao((byte) 0);
        int ao6 = ikVar.ao((byte) 0);
        int au3 = ikVar.au(825776);
        int au4 = ikVar.au(-492618544);
        int au5 = ikVar.au(-1977000675);
        int au6 = ikVar.au(1285549273);
        int i6 = 0 + au;
        int i7 = i6 + au2;
        if (ao3 == 255) {
            i = i7 + au2;
        } else {
            i = i7;
        }
        if (ao5 == 1) {
            i2 = i + au2;
        } else {
            i2 = i;
        }
        if (ao2 == 1) {
            i3 = i2 + au2;
        } else {
            i3 = i2;
        }
        if (ao6 == 1) {
            i4 = i3 + au;
        } else {
            i4 = i3;
        }
        if (ao4 == 1) {
            i5 = i4 + au2;
        } else {
            i5 = i4;
        }
        int i8 = i5 + au6;
        int i9 = i8 + (au2 * 2);
        au6 = (ao * 6) + i9;
        au3 += au6;
        au4 += au3;
        au5 += au4;
        this.af = au;
        this.ag = au2;
        this.ai = ao;
        this.ad = new int[au];
        this.an = new int[au];
        this.aa = new int[au];
        this.ay = new int[au2];
        this.as = new int[au2];
        this.ar = new int[au2];
        if (ao > 0) {
            this.az = new byte[ao];
            this.ah = new short[ao];
            this.ak = new short[ao];
            this.ao = new short[ao];
        }
        if (ao6 == 1) {
            this.ax = new int[au];
        }
        if (ao2 == 1) {
            this.aj = new byte[au2];
            this.am = new byte[au2];
            this.ab = new short[au2];
        }
        if (ao3 == 255) {
            this.ae = new byte[au2];
        } else {
            this.aw = (byte) ao3;
        }
        if (ao4 == 1) {
            this.aq = new byte[au2];
        }
        if (ao5 == 1) {
            this.au = new int[au2];
        }
        this.at = new short[au2];
        ikVar.ad = 0;
        ikVar.ad = 2065011939 * au6;
        ikVar.ad = au3 * 2065011939;
        ikVar.ad = 2065011939 * au4;
        ikVar.ad = i3 * 2065011939;
        au6 = 0;
        int i10 = 0;
        int i11 = 0;
        au5 = 0;
        while (au5 < au) {
            int ao7 = ikVar.ao((byte) 0);
            i3 = 0;
            if ((ao7 & 1) != 0) {
                i3 = ikVar.bh(-1591509271);
            }
            au3 = 0;
            if ((ao7 & 2) != 0) {
                au3 = ikVar.bh(-1845148953);
            }
            au4 = 0;
            if ((ao7 & 4) != 0) {
                au4 = ikVar.bh(-1958733268);
            }
            this.ad[au5] = i3 + i11;
            this.an[au5] = au3 + i10;
            this.aa[au5] = au6 + au4;
            au6 = this.ad[au5];
            au4 = this.an[au5];
            au3 = this.aa[au5];
            if (ao6 == 1) {
                this.ax[au5] = ikVar.ao((byte) 0);
            }
            au5++;
            i10 = au4;
            i11 = au6;
            au6 = au3;
        }
        ikVar.ad = 2065011939 * i8;
        ikVar.ad = 2065011939 * i2;
        ikVar.ad = i7 * 2065011939;
        ikVar.ad = 2065011939 * i4;
        ikVar.ad = i * 2065011939;
        i3 = 0;
        Object obj = null;
        Object obj2 = null;
        while (i3 < au2) {
            Object obj3;
            this.at[i3] = (short) ikVar.au(784637976);
            if (ao2 == 1) {
                i7 = ikVar.ao((byte) 0);
                if ((i7 & 1) == 1) {
                    this.aj[i3] = (byte) 1;
                    obj3 = 1;
                } else {
                    this.aj[i3] = (byte) 0;
                    obj3 = obj2;
                }
                if ((i7 & 2) == 2) {
                    this.am[i3] = (byte) (i7 >> 2);
                    this.ab[i3] = this.at[i3];
                    this.at[i3] = (short) 127;
                    if (this.ab[i3] != (short) -1) {
                        obj2 = obj3;
                        obj3 = 1;
                    }
                } else {
                    this.am[i3] = (byte) -1;
                    this.ab[i3] = (short) -1;
                }
                obj2 = obj3;
                obj3 = obj;
            } else {
                obj3 = obj;
            }
            if (ao3 == 255) {
                this.ae[i3] = ikVar.ax(1247983979);
            }
            if (ao4 == 1) {
                this.aq[i3] = ikVar.ax(1247983979);
            }
            if (ao5 == 1) {
                this.au[i3] = ikVar.ao((byte) 0);
            }
            i3++;
            obj = obj3;
        }
        ikVar.ad = 2065011939 * i5;
        ikVar.ad = 2065011939 * i6;
        i2 = 0;
        i = 0;
        i7 = 0;
        i3 = 0;
        i4 = 0;
        while (i4 < au2) {
            int i12;
            i5 = ikVar.ao((byte) 0);
            if (i5 == 1) {
                i3 = ikVar.bh(-1405840210) + i;
                i2 = ikVar.bh(-1380868993) + i3;
                i = ikVar.bh(-1678382600) + i2;
                this.ay[i4] = i3;
                this.as[i4] = i2;
                this.ar[i4] = i;
                i7 = i;
            }
            if (i5 == 2) {
                i += ikVar.bh(-1410569054);
                this.ay[i4] = i3;
                this.as[i4] = i7;
                this.ar[i4] = i;
                i2 = i7;
                i7 = i;
            }
            if (i5 == 3) {
                i += ikVar.bh(-1404615264);
                this.ay[i4] = i7;
                this.as[i4] = i2;
                this.ar[i4] = i;
                i3 = i7;
                i7 = i;
            }
            if (i5 == 4) {
                i += ikVar.bh(-1805467565);
                this.ay[i4] = i2;
                this.as[i4] = i3;
                this.ar[i4] = i;
                i7 = i;
            } else {
                i12 = i2;
                i2 = i3;
                i3 = i12;
            }
            i4++;
            i12 = i3;
            i3 = i2;
            i2 = i12;
        }
        ikVar.ad = 2065011939 * i9;
        for (i = 0; i < ao; i++) {
            this.az[i] = (byte) 0;
            this.ah[i] = (short) ikVar.au(-1571234120);
            this.ak[i] = (short) ikVar.au(1696506745);
            this.ao[i] = (short) ikVar.au(590808795);
        }
        if (this.am != null) {
            obj3 = null;
            i7 = 0;
            while (i7 < au2) {
                i3 = this.am[i7] & 255;
                if (i3 != 255) {
                    if ((this.ah[i3] & 65535) == this.ay[i7] && (this.ak[i3] & 65535) == this.as[i7] && (this.ao[i3] & 65535) == this.ar[i7]) {
                        this.am[i7] = (byte) -1;
                    } else {
                        obj3 = 1;
                    }
                }
                i7++;
            }
            if (obj3 == null) {
                this.am = null;
            }
        }
        if (obj == null) {
            this.ab = null;
        }
        if (obj2 == null) {
            this.aj = null;
        }
    }

    public bj(bj[] bjVarArr, int i) {
        int i2;
        int i3;
        this.af = 0;
        this.ag = 0;
        this.aw = (byte) 0;
        this.bz = false;
        this.af = 0;
        this.ag = 0;
        this.ai = 0;
        this.aw = (byte) -1;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        Object obj = null;
        int i8 = 0;
        for (i2 = 0; i2 < i; i2++) {
            bj bjVar = bjVarArr[i2];
            if (bjVar != null) {
                this.af += bjVar.af;
                this.ag += bjVar.ag;
                this.ai += bjVar.ai;
                if (bjVar.ae != null) {
                    obj = 1;
                } else {
                    if (this.aw == (byte) -1) {
                        this.aw = bjVar.aw;
                    }
                    if (this.aw != bjVar.aw) {
                        obj = 1;
                    }
                }
                if (bjVar.aj != null) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                i8 |= i3;
                if (bjVar.aq != null) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                i7 |= i3;
                if (bjVar.au != null) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                i6 |= i3;
                i5 |= bjVar.ab != null ? 1 : 0;
                if (bjVar.am != null) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                i4 |= i3;
            }
        }
        this.ad = new int[this.af];
        this.an = new int[this.af];
        this.aa = new int[this.af];
        this.ax = new int[this.af];
        this.ay = new int[this.ag];
        this.as = new int[this.ag];
        this.ar = new int[this.ag];
        if (i8 != 0) {
            this.aj = new byte[this.ag];
        }
        if (obj != null) {
            this.ae = new byte[this.ag];
        }
        if (i7 != 0) {
            this.aq = new byte[this.ag];
        }
        if (i6 != 0) {
            this.au = new int[this.ag];
        }
        if (i5 != 0) {
            this.ab = new short[this.ag];
        }
        if (i4 != 0) {
            this.am = new byte[this.ag];
        }
        this.at = new short[this.ag];
        if (this.ai > 0) {
            this.az = new byte[this.ai];
            this.ah = new short[this.ai];
            this.ak = new short[this.ai];
            this.ao = new short[this.ai];
        }
        this.af = 0;
        this.ag = 0;
        this.ai = 0;
        for (i2 = 0; i2 < i; i2++) {
            bjVar = bjVarArr[i2];
            if (bjVar != null) {
                i3 = 0;
                while (i3 < bjVar.ag) {
                    if (!(i8 == 0 || bjVar.aj == null)) {
                        this.aj[this.ag] = bjVar.aj[i3];
                    }
                    if (obj != null) {
                        if (bjVar.ae != null) {
                            this.ae[this.ag] = bjVar.ae[i3];
                        } else {
                            this.ae[this.ag] = bjVar.aw;
                        }
                    }
                    if (!(i7 == 0 || bjVar.aq == null)) {
                        this.aq[this.ag] = bjVar.aq[i3];
                    }
                    if (!(i6 == 0 || bjVar.au == null)) {
                        this.au[this.ag] = bjVar.au[i3];
                    }
                    if (i5 != 0) {
                        if (bjVar.ab != null) {
                            this.ab[this.ag] = bjVar.ab[i3];
                        } else {
                            this.ab[this.ag] = (short) -1;
                        }
                    }
                    if (i4 != 0) {
                        if (bjVar.am == null || bjVar.am[i3] == (byte) -1) {
                            this.am[this.ag] = (byte) -1;
                        } else {
                            this.am[this.ag] = (byte) (bjVar.am[i3] + this.ai);
                        }
                    }
                    this.at[this.ag] = bjVar.at[i3];
                    this.ay[this.ag] = aa(bjVar, bjVar.ay[i3]);
                    this.as[this.ag] = aa(bjVar, bjVar.as[i3]);
                    this.ar[this.ag] = aa(bjVar, bjVar.ar[i3]);
                    this.ag++;
                    i3++;
                }
                for (i3 = 0; i3 < bjVar.ai; i3++) {
                    byte[] bArr = this.az;
                    int i9 = this.ai;
                    byte b = bjVar.az[i3];
                    bArr[i9] = b;
                    if (b == (byte) 0) {
                        this.ah[this.ai] = (short) aa(bjVar, bjVar.ah[i3]);
                        this.ak[this.ai] = (short) aa(bjVar, bjVar.ak[i3]);
                        this.ao[this.ai] = (short) aa(bjVar, bjVar.ao[i3]);
                    }
                    this.ai++;
                }
            }
        }
    }

    final int aa(bj bjVar, int i) {
        int i2 = bjVar.ad[i];
        int i3 = bjVar.an[i];
        int i4 = bjVar.aa[i];
        int i5 = 0;
        while (i5 < this.af) {
            if (i2 == this.ad[i5] && i3 == this.an[i5] && i4 == this.aa[i5]) {
                break;
            }
            i5++;
        }
        i5 = -1;
        if (i5 != -1) {
            return i5;
        }
        this.ad[this.af] = i2;
        this.an[this.af] = i3;
        this.aa[this.af] = i4;
        if (bjVar.ax != null) {
            this.ax[this.af] = bjVar.ax[i];
        }
        i5 = this.af;
        this.af = i5 + 1;
        return i5;
    }

    final int bf(bj bjVar, int i) {
        int i2 = bjVar.ad[i];
        int i3 = bjVar.an[i];
        int i4 = bjVar.aa[i];
        int i5 = 0;
        while (i5 < this.af) {
            if (i2 == this.ad[i5] && i3 == this.an[i5] && i4 == this.aa[i5]) {
                break;
            }
            i5++;
        }
        i5 = -1;
        if (i5 != -1) {
            return i5;
        }
        this.ad[this.af] = i2;
        this.an[this.af] = i3;
        this.aa[this.af] = i4;
        if (bjVar.ax != null) {
            this.ax[this.af] = bjVar.ax[i];
        }
        i5 = this.af;
        this.af = i5 + 1;
        return i5;
    }

    final int bp(bj bjVar, int i) {
        int i2 = bjVar.ad[i];
        int i3 = bjVar.an[i];
        int i4 = bjVar.aa[i];
        int i5 = 0;
        while (i5 < this.af) {
            if (i2 == this.ad[i5] && i3 == this.an[i5] && i4 == this.aa[i5]) {
                break;
            }
            i5++;
        }
        i5 = -1;
        if (i5 != -1) {
            return i5;
        }
        this.ad[this.af] = i2;
        this.an[this.af] = i3;
        this.aa[this.af] = i4;
        if (bjVar.ax != null) {
            this.ax[this.af] = bjVar.ax[i];
        }
        i5 = this.af;
        this.af = i5 + 1;
        return i5;
    }

    final int bv(bj bjVar, int i) {
        int i2 = bjVar.ad[i];
        int i3 = bjVar.an[i];
        int i4 = bjVar.aa[i];
        int i5 = 0;
        while (i5 < this.af) {
            if (i2 == this.ad[i5] && i3 == this.an[i5] && i4 == this.aa[i5]) {
                break;
            }
            i5++;
        }
        i5 = -1;
        if (i5 != -1) {
            return i5;
        }
        this.ad[this.af] = i2;
        this.an[this.af] = i3;
        this.aa[this.af] = i4;
        if (bjVar.ax != null) {
            this.ax[this.af] = bjVar.ax[i];
        }
        i5 = this.af;
        this.af = i5 + 1;
        return i5;
    }

    public bj(bj bjVar, boolean z, boolean z2, boolean z3, boolean z4) {
        int i;
        int i2 = 0;
        this.af = 0;
        this.ag = 0;
        this.aw = (byte) 0;
        this.bz = false;
        this.af = bjVar.af;
        this.ag = bjVar.ag;
        this.ai = bjVar.ai;
        if (z) {
            this.ad = bjVar.ad;
            this.an = bjVar.an;
            this.aa = bjVar.aa;
        } else {
            this.ad = new int[this.af];
            this.an = new int[this.af];
            this.aa = new int[this.af];
            for (i = 0; i < this.af; i++) {
                this.ad[i] = bjVar.ad[i];
                this.an[i] = bjVar.an[i];
                this.aa[i] = bjVar.aa[i];
            }
        }
        if (z2) {
            this.at = bjVar.at;
        } else {
            this.at = new short[this.ag];
            for (i = 0; i < this.ag; i++) {
                this.at[i] = bjVar.at[i];
            }
        }
        if (z3 || bjVar.ab == null) {
            this.ab = bjVar.ab;
        } else {
            this.ab = new short[this.ag];
            for (i = 0; i < this.ag; i++) {
                this.ab[i] = bjVar.ab[i];
            }
        }
        if (z4) {
            this.aq = bjVar.aq;
        } else {
            this.aq = new byte[this.ag];
            if (bjVar.aq == null) {
                for (i = 0; i < this.ag; i++) {
                    this.aq[i] = (byte) 0;
                }
            } else {
                while (i2 < this.ag) {
                    this.aq[i2] = bjVar.aq[i2];
                    i2++;
                }
            }
        }
        this.ay = bjVar.ay;
        this.as = bjVar.as;
        this.ar = bjVar.ar;
        this.aj = bjVar.aj;
        this.ae = bjVar.ae;
        this.am = bjVar.am;
        this.aw = bjVar.aw;
        this.az = bjVar.az;
        this.ah = bjVar.ah;
        this.ak = bjVar.ak;
        this.ao = bjVar.ao;
        this.ax = bjVar.ax;
        this.au = bjVar.au;
        this.av = bjVar.av;
        this.ac = bjVar.ac;
        this.ap = bjVar.ap;
        this.al = bjVar.al;
        this.bw = bjVar.bw;
        this.bb = bjVar.bb;
        this.bc = bjVar.bc;
    }

    public bj ag() {
        bj bjVar = new bj();
        if (this.aj != null) {
            bjVar.aj = new byte[this.ag];
            for (int i = 0; i < this.ag; i++) {
                bjVar.aj[i] = this.aj[i];
            }
        }
        bjVar.af = this.af;
        bjVar.ag = this.ag;
        bjVar.ai = this.ai;
        bjVar.ad = this.ad;
        bjVar.an = this.an;
        bjVar.aa = this.aa;
        bjVar.ay = this.ay;
        bjVar.as = this.as;
        bjVar.ar = this.ar;
        bjVar.ae = this.ae;
        bjVar.aq = this.aq;
        bjVar.am = this.am;
        bjVar.at = this.at;
        bjVar.ab = this.ab;
        bjVar.aw = this.aw;
        bjVar.az = this.az;
        bjVar.ah = this.ah;
        bjVar.ak = this.ak;
        bjVar.ao = this.ao;
        bjVar.ax = this.ax;
        bjVar.au = this.au;
        bjVar.av = this.av;
        bjVar.ac = this.ac;
        bjVar.ap = this.ap;
        bjVar.al = this.al;
        bjVar.bb = this.bb;
        bjVar.bc = this.bc;
        return bjVar;
    }

    public bj bx() {
        bj bjVar = new bj();
        if (this.aj != null) {
            bjVar.aj = new byte[this.ag];
            for (int i = 0; i < this.ag; i++) {
                bjVar.aj[i] = this.aj[i];
            }
        }
        bjVar.af = this.af;
        bjVar.ag = this.ag;
        bjVar.ai = this.ai;
        bjVar.ad = this.ad;
        bjVar.an = this.an;
        bjVar.aa = this.aa;
        bjVar.ay = this.ay;
        bjVar.as = this.as;
        bjVar.ar = this.ar;
        bjVar.ae = this.ae;
        bjVar.aq = this.aq;
        bjVar.am = this.am;
        bjVar.at = this.at;
        bjVar.ab = this.ab;
        bjVar.aw = this.aw;
        bjVar.az = this.az;
        bjVar.ah = this.ah;
        bjVar.ak = this.ak;
        bjVar.ao = this.ao;
        bjVar.ax = this.ax;
        bjVar.au = this.au;
        bjVar.av = this.av;
        bjVar.ac = this.ac;
        bjVar.ap = this.ap;
        bjVar.al = this.al;
        bjVar.bb = this.bb;
        bjVar.bc = this.bc;
        return bjVar;
    }

    public bj ay(int[][] iArr, int i, int i2, int i3, boolean z, int i4) {
        ak();
        int i5 = this.bh + i;
        int i6 = this.bf + i;
        int i7 = this.bp + i3;
        int i8 = this.bv + i3;
        if (i5 < 0 || ((i6 + mn.an) >> 7) >= iArr.length || i7 < 0 || ((i8 + mn.an) >> 7) >= iArr[0].length) {
            return this;
        }
        i5 >>= 7;
        i6 = (i6 + 127) >> 7;
        i7 >>= 7;
        i8 = (i8 + 127) >> 7;
        if (iArr[i5][i7] == i2 && iArr[i6][i7] == i2 && iArr[i5][i8] == i2 && iArr[i6][i8] == i2) {
            return this;
        }
        bj bjVar;
        if (z) {
            bjVar = new bj();
            bjVar.af = this.af;
            bjVar.ag = this.ag;
            bjVar.ai = this.ai;
            bjVar.ad = this.ad;
            bjVar.aa = this.aa;
            bjVar.ay = this.ay;
            bjVar.as = this.as;
            bjVar.ar = this.ar;
            bjVar.aj = this.aj;
            bjVar.ae = this.ae;
            bjVar.aq = this.aq;
            bjVar.am = this.am;
            bjVar.at = this.at;
            bjVar.ab = this.ab;
            bjVar.aw = this.aw;
            bjVar.az = this.az;
            bjVar.ah = this.ah;
            bjVar.ak = this.ak;
            bjVar.ao = this.ao;
            bjVar.ax = this.ax;
            bjVar.au = this.au;
            bjVar.av = this.av;
            bjVar.ac = this.ac;
            bjVar.bb = this.bb;
            bjVar.bc = this.bc;
            bjVar.an = new int[bjVar.af];
        } else {
            bjVar = this;
        }
        int i9;
        int i10;
        int i11;
        if (i4 == 0) {
            for (i5 = 0; i5 < bjVar.af; i5++) {
                i7 = this.ad[i5] + i;
                i8 = this.aa[i5] + i3;
                i9 = i7 & 127;
                i10 = i8 & 127;
                i7 >>= 7;
                i8 >>= 7;
                i11 = ((iArr[i7][i8] * (128 - i9)) + (iArr[i7 + 1][i8] * i9)) >> 7;
                bjVar.an[i5] = (((((((iArr[i7 + 1][i8 + 1] * i9) + (iArr[i7][i8 + 1] * (128 - i9))) >> 7) * i10) + ((128 - i10) * i11)) >> 7) + this.an[i5]) - i2;
            }
        } else {
            for (i5 = 0; i5 < bjVar.af; i5++) {
                i7 = ((-this.an[i5]) << 16) / (this.bo * 1500767459);
                if (i7 < i4) {
                    i8 = this.ad[i5] + i;
                    i9 = this.aa[i5] + i3;
                    i10 = i8 & 127;
                    i11 = i9 & 127;
                    i8 >>= 7;
                    i9 >>= 7;
                    int i12 = ((iArr[i8][i9] * (128 - i10)) + (iArr[i8 + 1][i9] * i10)) >> 7;
                    i7 = i4 - i7;
                    bjVar.an[i5] = ((i7 * (((((((iArr[i8 + 1][i9 + 1] * i10) + (iArr[i8][i9 + 1] * (128 - i10))) >> 7) * i11) + ((128 - i11) * i12)) >> 7) - i2)) / i4) + this.an[i5];
                }
            }
        }
        bjVar.ah();
        return bjVar;
    }

    public bj bt(int[][] iArr, int i, int i2, int i3, boolean z, int i4) {
        ak();
        int i5 = this.bh + i;
        int i6 = this.bf + i;
        int i7 = this.bp + i3;
        int i8 = this.bv + i3;
        if (i5 < 0 || ((i6 + mn.an) >> 7) >= iArr.length || i7 < 0 || ((-1709645197 + i8) >> 7) >= iArr[0].length) {
            return this;
        }
        i5 >>= 7;
        i6 = (i6 + 127) >> 7;
        i7 >>= 7;
        i8 = (i8 + 127) >> 7;
        if (iArr[i5][i7] == i2 && iArr[i6][i7] == i2 && iArr[i5][i8] == i2 && iArr[i6][i8] == i2) {
            return this;
        }
        bj bjVar;
        if (z) {
            bjVar = new bj();
            bjVar.af = this.af;
            bjVar.ag = this.ag;
            bjVar.ai = this.ai;
            bjVar.ad = this.ad;
            bjVar.aa = this.aa;
            bjVar.ay = this.ay;
            bjVar.as = this.as;
            bjVar.ar = this.ar;
            bjVar.aj = this.aj;
            bjVar.ae = this.ae;
            bjVar.aq = this.aq;
            bjVar.am = this.am;
            bjVar.at = this.at;
            bjVar.ab = this.ab;
            bjVar.aw = this.aw;
            bjVar.az = this.az;
            bjVar.ah = this.ah;
            bjVar.ak = this.ak;
            bjVar.ao = this.ao;
            bjVar.ax = this.ax;
            bjVar.au = this.au;
            bjVar.av = this.av;
            bjVar.ac = this.ac;
            bjVar.bb = this.bb;
            bjVar.bc = this.bc;
            bjVar.an = new int[bjVar.af];
        } else {
            bjVar = this;
        }
        int i9;
        int i10;
        int i11;
        if (i4 == 0) {
            for (i5 = 0; i5 < bjVar.af; i5++) {
                i7 = this.ad[i5] + i;
                i8 = this.aa[i5] + i3;
                i9 = i7 & 127;
                i10 = i8 & 127;
                i7 >>= 7;
                i8 >>= 7;
                i11 = ((iArr[i7][i8] * (128 - i9)) + (iArr[i7 + 1][i8] * i9)) >> 7;
                bjVar.an[i5] = (((((((iArr[i7 + 1][i8 + 1] * i9) + (iArr[i7][i8 + 1] * (-328768952 - i9))) >> 7) * i10) + ((128 - i10) * i11)) >> 7) + this.an[i5]) - i2;
            }
        } else {
            for (i5 = 0; i5 < bjVar.af; i5++) {
                i7 = ((-this.an[i5]) << 16) / (this.bo * -1232474727);
                if (i7 < i4) {
                    i8 = this.ad[i5] + i;
                    i9 = this.aa[i5] + i3;
                    i10 = 1766721258 & i8;
                    i11 = 1319599651 & i9;
                    i8 >>= 7;
                    i9 >>= 7;
                    int i12 = ((iArr[i8][i9] * (-1562704625 - i10)) + (iArr[i8 + 1][i9] * i10)) >> 7;
                    i7 = i4 - i7;
                    bjVar.an[i5] = ((i7 * (((((((iArr[i8 + 1][i9 + 1] * i10) + (iArr[i8][i9 + 1] * (128 - i10))) >> 7) * i11) + ((128 - i11) * i12)) >> 7) - i2)) / i4) + this.an[i5];
                }
            }
        }
        bjVar.ah();
        return bjVar;
    }

    void as() {
        int[] iArr;
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (this.ax != null) {
            iArr = new int[256];
            i = 0;
            for (i2 = 0; i2 < this.af; i2++) {
                i3 = this.ax[i2];
                iArr[i3] = iArr[i3] + 1;
                if (i3 > i) {
                    i = i3;
                }
            }
            this.av = new int[(i + 1)][];
            for (i2 = 0; i2 <= i; i2++) {
                this.av[i2] = new int[iArr[i2]];
                iArr[i2] = 0;
            }
            for (i2 = 0; i2 < this.af; i2++) {
                i = this.ax[i2];
                int[] iArr2 = this.av[i];
                int i5 = iArr[i];
                iArr[i] = i5 + 1;
                iArr2[i5] = i2;
            }
        }
        if (this.au != null) {
            iArr = new int[256];
            i = 0;
            for (i2 = 0; i2 < this.ag; i2++) {
                i3 = this.au[i2];
                iArr[i3] = iArr[i3] + 1;
                if (i3 > i) {
                    i = i3;
                }
            }
            this.ac = new int[(i + 1)][];
            for (i2 = 0; i2 <= i; i2++) {
                this.ac[i2] = new int[iArr[i2]];
                iArr[i2] = 0;
            }
            while (i4 < this.ag) {
                i2 = this.au[i4];
                int[] iArr3 = this.ac[i2];
                i3 = iArr[i2];
                iArr[i2] = i3 + 1;
                iArr3[i3] = i4;
                i4++;
            }
        }
    }

    void be() {
        int[] iArr;
        int i;
        int i2;
        int i3 = 0;
        if (this.ax != null) {
            iArr = new int[256];
            i = 0;
            for (i2 = 0; i2 < this.af; i2++) {
                int i4;
                i4 = this.ax[i2];
                iArr[i4] = iArr[i4] + 1;
                if (i4 > i) {
                    i = i4;
                }
            }
            this.av = new int[(i + 1)][];
            for (i2 = 0; i2 <= i; i2++) {
                this.av[i2] = new int[iArr[i2]];
                iArr[i2] = 0;
            }
            for (i2 = 0; i2 < this.af; i2++) {
                i = this.ax[i2];
                int[] iArr2 = this.av[i];
                int i5 = iArr[i];
                iArr[i] = i5 + 1;
                iArr2[i5] = i2;
            }
        }
        if (this.au != null) {
            iArr = new int[256];
            i = 0;
            for (i2 = 0; i2 < this.ag; i2++) {
                i4 = this.au[i2];
                iArr[i4] = iArr[i4] + 1;
                if (i4 > i) {
                    i = i4;
                }
            }
            this.ac = new int[(i + 1)][];
            for (i2 = 0; i2 <= i; i2++) {
                this.ac[i2] = new int[iArr[i2]];
                iArr[i2] = 0;
            }
            while (i3 < this.ag) {
                i2 = this.au[i3];
                int[] iArr3 = this.ac[i2];
                i4 = iArr[i2];
                iArr[i2] = i4 + 1;
                iArr3[i4] = i3;
                i3++;
            }
        }
    }

    void bk() {
        int[] iArr;
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (this.ax != null) {
            iArr = new int[256];
            i = 0;
            for (i2 = 0; i2 < this.af; i2++) {
                i3 = this.ax[i2];
                iArr[i3] = iArr[i3] + 1;
                if (i3 > i) {
                    i = i3;
                }
            }
            this.av = new int[(i + 1)][];
            for (i2 = 0; i2 <= i; i2++) {
                this.av[i2] = new int[iArr[i2]];
                iArr[i2] = 0;
            }
            for (i2 = 0; i2 < this.af; i2++) {
                i = this.ax[i2];
                int[] iArr2 = this.av[i];
                int i5 = iArr[i];
                iArr[i] = i5 + 1;
                iArr2[i5] = i2;
            }
        }
        if (this.au != null) {
            iArr = new int[256];
            i = 0;
            for (i2 = 0; i2 < this.ag; i2++) {
                i3 = this.au[i2];
                iArr[i3] = iArr[i3] + 1;
                if (i3 > i) {
                    i = i3;
                }
            }
            this.ac = new int[(i + 1)][];
            for (i2 = 0; i2 <= i; i2++) {
                this.ac[i2] = new int[iArr[i2]];
                iArr[i2] = 0;
            }
            while (i4 < this.ag) {
                i2 = this.au[i4];
                int[] iArr3 = this.ac[i2];
                i3 = iArr[i2];
                iArr[i2] = i3 + 1;
                iArr3[i3] = i4;
                i4++;
            }
        }
    }

    void bn() {
        int[] iArr;
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (this.ax != null) {
            iArr = new int[256];
            i = 0;
            for (i2 = 0; i2 < this.af; i2++) {
                i3 = this.ax[i2];
                iArr[i3] = iArr[i3] + 1;
                if (i3 > i) {
                    i = i3;
                }
            }
            this.av = new int[(i + 1)][];
            for (i2 = 0; i2 <= i; i2++) {
                this.av[i2] = new int[iArr[i2]];
                iArr[i2] = 0;
            }
            for (i2 = 0; i2 < this.af; i2++) {
                i = this.ax[i2];
                int[] iArr2 = this.av[i];
                int i5 = iArr[i];
                iArr[i] = i5 + 1;
                iArr2[i5] = i2;
            }
        }
        if (this.au != null) {
            iArr = new int[-1776266836];
            i = 0;
            for (i2 = 0; i2 < this.ag; i2++) {
                i3 = this.au[i2];
                iArr[i3] = iArr[i3] + 1;
                if (i3 > i) {
                    i = i3;
                }
            }
            this.ac = new int[(i + 1)][];
            for (i2 = 0; i2 <= i; i2++) {
                this.ac[i2] = new int[iArr[i2]];
                iArr[i2] = 0;
            }
            while (i4 < this.ag) {
                i2 = this.au[i4];
                int[] iArr3 = this.ac[i2];
                i3 = iArr[i2];
                iArr[i2] = i3 + 1;
                iArr3[i3] = i4;
                i4++;
            }
        }
    }

    void bu() {
        int[] iArr;
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (this.ax != null) {
            iArr = new int[-438497178];
            i = 0;
            for (i2 = 0; i2 < this.af; i2++) {
                i3 = this.ax[i2];
                iArr[i3] = iArr[i3] + 1;
                if (i3 > i) {
                    i = i3;
                }
            }
            this.av = new int[(i + 1)][];
            for (i2 = 0; i2 <= i; i2++) {
                this.av[i2] = new int[iArr[i2]];
                iArr[i2] = 0;
            }
            for (i2 = 0; i2 < this.af; i2++) {
                i = this.ax[i2];
                int[] iArr2 = this.av[i];
                int i5 = iArr[i];
                iArr[i] = i5 + 1;
                iArr2[i5] = i2;
            }
        }
        if (this.au != null) {
            iArr = new int[256];
            i = 0;
            for (i2 = 0; i2 < this.ag; i2++) {
                i3 = this.au[i2];
                iArr[i3] = iArr[i3] + 1;
                if (i3 > i) {
                    i = i3;
                }
            }
            this.ac = new int[(i + 1)][];
            for (i2 = 0; i2 <= i; i2++) {
                this.ac[i2] = new int[iArr[i2]];
                iArr[i2] = 0;
            }
            while (i4 < this.ag) {
                i2 = this.au[i4];
                int[] iArr3 = this.ac[i2];
                i3 = iArr[i2];
                iArr[i2] = i3 + 1;
                iArr3[i3] = i4;
                i4++;
            }
        }
    }

    void by() {
        int[] iArr;
        int i;
        int i2;
        int i3 = 0;
        if (this.ax != null) {
            iArr = new int[256];
            i = 0;
            for (i2 = 0; i2 < this.af; i2++) {
                int i4;
                i4 = this.ax[i2];
                iArr[i4] = iArr[i4] + 1;
                if (i4 > i) {
                    i = i4;
                }
            }
            this.av = new int[(i + 1)][];
            for (i2 = 0; i2 <= i; i2++) {
                this.av[i2] = new int[iArr[i2]];
                iArr[i2] = 0;
            }
            for (i2 = 0; i2 < this.af; i2++) {
                i = this.ax[i2];
                int[] iArr2 = this.av[i];
                int i5 = iArr[i];
                iArr[i] = i5 + 1;
                iArr2[i5] = i2;
            }
        }
        if (this.au != null) {
            iArr = new int[256];
            i = 0;
            for (i2 = 0; i2 < this.ag; i2++) {
                i4 = this.au[i2];
                iArr[i4] = iArr[i4] + 1;
                if (i4 > i) {
                    i = i4;
                }
            }
            this.ac = new int[(i + 1)][];
            for (i2 = 0; i2 <= i; i2++) {
                this.ac[i2] = new int[iArr[i2]];
                iArr[i2] = 0;
            }
            while (i3 < this.ag) {
                i2 = this.au[i3];
                int[] iArr3 = this.ac[i2];
                i4 = iArr[i2];
                iArr[i2] = i4 + 1;
                iArr3[i4] = i3;
                i3++;
            }
        }
    }

    public void ar() {
        for (int i = 0; i < this.af; i++) {
            int i2 = this.ad[i];
            this.ad[i] = this.aa[i];
            this.aa[i] = -i2;
        }
        ah();
    }

    public void ba() {
        for (int i = 0; i < this.af; i++) {
            int i2 = this.ad[i];
            this.ad[i] = this.aa[i];
            this.aa[i] = -i2;
        }
        ah();
    }

    public void bd() {
        for (int i = 0; i < this.af; i++) {
            int i2 = this.ad[i];
            this.ad[i] = this.aa[i];
            this.aa[i] = -i2;
        }
        ah();
    }

    public void bl() {
        for (int i = 0; i < this.af; i++) {
            int i2 = this.ad[i];
            this.ad[i] = this.aa[i];
            this.aa[i] = -i2;
        }
        ah();
    }

    public void aj() {
        for (int i = 0; i < this.af; i++) {
            this.ad[i] = -this.ad[i];
            this.aa[i] = -this.aa[i];
        }
        ah();
    }

    public void bj() {
        for (int i = 0; i < this.af; i++) {
            this.ad[i] = -this.ad[i];
            this.aa[i] = -this.aa[i];
        }
        ah();
    }

    public void bm() {
        for (int i = 0; i < this.af; i++) {
            this.ad[i] = -this.ad[i];
            this.aa[i] = -this.aa[i];
        }
        ah();
    }

    public void br() {
        for (int i = 0; i < this.af; i++) {
            this.ad[i] = -this.ad[i];
            this.aa[i] = -this.aa[i];
        }
        ah();
    }

    public void bs() {
        for (int i = 0; i < this.af; i++) {
            this.ad[i] = -this.ad[i];
            this.aa[i] = -this.aa[i];
        }
        ah();
    }

    public void ae() {
        for (int i = 0; i < this.af; i++) {
            int i2 = this.aa[i];
            this.aa[i] = this.ad[i];
            this.ad[i] = -i2;
        }
        ah();
    }

    public void bi() {
        for (int i = 0; i < this.af; i++) {
            int i2 = this.aa[i];
            this.aa[i] = this.ad[i];
            this.ad[i] = -i2;
        }
        ah();
    }

    public void bo() {
        for (int i = 0; i < this.af; i++) {
            int i2 = this.aa[i];
            this.aa[i] = this.ad[i];
            this.ad[i] = -i2;
        }
        ah();
    }

    public void bq() {
        for (int i = 0; i < this.af; i++) {
            int i2 = this.aa[i];
            this.aa[i] = this.ad[i];
            this.ad[i] = -i2;
        }
        ah();
    }

    public void cv() {
        for (int i = 0; i < this.af; i++) {
            int i2 = this.aa[i];
            this.aa[i] = this.ad[i];
            this.ad[i] = -i2;
        }
        ah();
    }

    public void aq(int i) {
        int i2 = be[i];
        int i3 = bk[i];
        for (int i4 = 0; i4 < this.af; i4++) {
            int i5 = ((this.aa[i4] * i2) + (this.ad[i4] * i3)) >> 16;
            this.aa[i4] = ((this.aa[i4] * i3) - (this.ad[i4] * i2)) >> 16;
            this.ad[i4] = i5;
        }
        ah();
    }

    public void cc(int i) {
        int i2 = be[i];
        int i3 = bk[i];
        for (int i4 = 0; i4 < this.af; i4++) {
            int i5 = ((this.aa[i4] * i2) + (this.ad[i4] * i3)) >> 16;
            this.aa[i4] = ((this.aa[i4] * i3) - (this.ad[i4] * i2)) >> 16;
            this.ad[i4] = i5;
        }
        ah();
    }

    public void ci(int i) {
        int i2 = be[i];
        int i3 = bk[i];
        for (int i4 = 0; i4 < this.af; i4++) {
            int i5 = ((this.aa[i4] * i2) + (this.ad[i4] * i3)) >> 16;
            this.aa[i4] = ((this.aa[i4] * i3) - (this.ad[i4] * i2)) >> 16;
            this.ad[i4] = i5;
        }
        ah();
    }

    public void co(int i) {
        int i2 = be[i];
        int i3 = bk[i];
        for (int i4 = 0; i4 < this.af; i4++) {
            int i5 = ((this.aa[i4] * i2) + (this.ad[i4] * i3)) >> 16;
            this.aa[i4] = ((this.aa[i4] * i3) - (this.ad[i4] * i2)) >> 16;
            this.ad[i4] = i5;
        }
        ah();
    }

    public void am(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.af; i4++) {
            int[] iArr = this.ad;
            iArr[i4] = iArr[i4] + i;
            iArr = this.an;
            iArr[i4] = iArr[i4] + i2;
            iArr = this.aa;
            iArr[i4] = iArr[i4] + i3;
        }
        ah();
    }

    public void at(short s, short s2) {
        for (int i = 0; i < this.ag; i++) {
            if (this.at[i] == s) {
                this.at[i] = s2;
            }
        }
    }

    public void cy(short s, short s2) {
        for (int i = 0; i < this.ag; i++) {
            if (this.at[i] == s) {
                this.at[i] = s2;
            }
        }
    }

    public void ab(short s, short s2) {
        if (this.ab != null) {
            for (int i = 0; i < this.ag; i++) {
                if (this.ab[i] == s) {
                    this.ab[i] = s2;
                }
            }
        }
    }

    public void ck(short s, short s2) {
        if (this.ab != null) {
            for (int i = 0; i < this.ag; i++) {
                if (this.ab[i] == s) {
                    this.ab[i] = s2;
                }
            }
        }
    }

    public void cl(short s, short s2) {
        if (this.ab != null) {
            for (int i = 0; i < this.ag; i++) {
                if (this.ab[i] == s) {
                    this.ab[i] = s2;
                }
            }
        }
    }

    public void cn(short s, short s2) {
        if (this.ab != null) {
            for (int i = 0; i < this.ag; i++) {
                if (this.ab[i] == s) {
                    this.ab[i] = s2;
                }
            }
        }
    }

    public void cs(short s, short s2) {
        if (this.ab != null) {
            for (int i = 0; i < this.ag; i++) {
                if (this.ab[i] == s) {
                    this.ab[i] = s2;
                }
            }
        }
    }

    public void aw() {
        int i;
        int i2 = 0;
        for (i = 0; i < this.af; i++) {
            this.aa[i] = -this.aa[i];
        }
        while (i2 < this.ag) {
            i = this.ay[i2];
            this.ay[i2] = this.ar[i2];
            this.ar[i2] = i;
            i2++;
        }
        ah();
    }

    public void cd() {
        int i;
        int i2 = 0;
        for (i = 0; i < this.af; i++) {
            this.aa[i] = -this.aa[i];
        }
        while (i2 < this.ag) {
            i = this.ay[i2];
            this.ay[i2] = this.ar[i2];
            this.ar[i2] = i;
            i2++;
        }
        ah();
    }

    public void ch() {
        int i;
        int i2 = 0;
        for (i = 0; i < this.af; i++) {
            this.aa[i] = -this.aa[i];
        }
        while (i2 < this.ag) {
            i = this.ay[i2];
            this.ay[i2] = this.ar[i2];
            this.ar[i2] = i;
            i2++;
        }
        ah();
    }

    public void cm() {
        int i;
        int i2 = 0;
        for (i = 0; i < this.af; i++) {
            this.aa[i] = -this.aa[i];
        }
        while (i2 < this.ag) {
            i = this.ay[i2];
            this.ay[i2] = this.ar[i2];
            this.ar[i2] = i;
            i2++;
        }
        ah();
    }

    public void ai(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.af; i4++) {
            this.ad[i4] = (this.ad[i4] * i) / mn.an;
            this.an[i4] = (this.an[i4] * i2) / mn.an;
            this.aa[i4] = (this.aa[i4] * i3) / mn.an;
        }
        ah();
    }

    public void cj(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.af; i4++) {
            this.ad[i4] = (this.ad[i4] * i) / mn.an;
            this.an[i4] = (this.an[i4] * i2) / mn.an;
            this.aa[i4] = (this.aa[i4] * i3) / mn.an;
        }
        ah();
    }

    public void cp(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.af; i4++) {
            this.ad[i4] = (this.ad[i4] * i) / 1977485485;
            this.an[i4] = (this.an[i4] * i2) / 650826507;
            this.aa[i4] = (this.aa[i4] * i3) / 328228912;
        }
        ah();
    }

    public void cq(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.af; i4++) {
            this.ad[i4] = (this.ad[i4] * i) / mn.an;
            this.an[i4] = (this.an[i4] * i2) / mn.an;
            this.aa[i4] = (this.aa[i4] * i3) / mn.an;
        }
        ah();
    }

    public void ct(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.af; i4++) {
            this.ad[i4] = (this.ad[i4] * i) / mn.an;
            this.an[i4] = (this.an[i4] * i2) / mn.an;
            this.aa[i4] = (this.aa[i4] * i3) / mn.an;
        }
        ah();
    }

    public void az() {
        if (this.ap == null) {
            int i;
            this.ap = new ci[this.af];
            for (i = 0; i < this.af; i++) {
                this.ap[i] = new ci();
            }
            for (i = 0; i < this.ag; i++) {
                byte b;
                int i2 = this.ay[i];
                int i3 = this.as[i];
                int i4 = this.ar[i];
                int i5 = this.ad[i3] - this.ad[i2];
                int i6 = this.an[i3] - this.an[i2];
                int i7 = this.aa[i3] - this.aa[i2];
                int i8 = this.ad[i4] - this.ad[i2];
                int i9 = this.an[i4] - this.an[i2];
                int i10 = this.aa[i4] - this.aa[i2];
                i5 = (i5 * i9) - (i6 * i8);
                i6 = (i6 * i10) - (i9 * i7);
                int i11 = (i7 * i8) - (i10 * i5);
                i7 = i5;
                while (true) {
                    if (i6 <= 8192 && i11 <= 8192 && i7 <= 8192 && i6 >= -8192 && i11 >= -8192 && i7 >= -8192) {
                        break;
                    }
                    i6 >>= 1;
                    i11 >>= 1;
                    i7 >>= 1;
                }
                i5 = (int) Math.sqrt((double) (((i6 * i6) + (i11 * i11)) + (i7 * i7)));
                if (i5 <= 0) {
                    i5 = 1;
                }
                i6 = (i6 * 256) / i5;
                i11 = (i11 * 256) / i5;
                i7 = (i7 * 256) / i5;
                if (this.aj == null) {
                    b = (byte) 0;
                } else {
                    b = this.aj[i];
                }
                if (b == (byte) 0) {
                    ci ciVar = this.ap[i2];
                    ciVar.af += -1902240919 * i6;
                    ciVar.ad += 350773987 * i11;
                    ciVar.an += 1852648383 * i7;
                    ciVar.aa += 35481147;
                    ciVar = this.ap[i3];
                    ciVar.af += -1902240919 * i6;
                    ciVar.ad += 350773987 * i11;
                    ciVar.an += 1852648383 * i7;
                    ciVar.aa += 35481147;
                    ciVar = this.ap[i4];
                    ciVar.af = (i6 * -1902240919) + ciVar.af;
                    ciVar.ad = (i11 * 350773987) + ciVar.ad;
                    ciVar.an = (i7 * 1852648383) + ciVar.an;
                    ciVar.aa += 35481147;
                } else if (b == (byte) 1) {
                    if (this.al == null) {
                        this.al = new co[this.ag];
                    }
                    co[] coVarArr = this.al;
                    co coVar = new co();
                    coVarArr[i] = coVar;
                    coVar.af = 546327713 * i6;
                    coVar.ad = -1894193981 * i11;
                    coVar.an = -285743361 * i7;
                }
            }
        }
    }

    public void cb() {
        if (this.ap == null) {
            int i;
            this.ap = new ci[this.af];
            for (i = 0; i < this.af; i++) {
                this.ap[i] = new ci();
            }
            for (i = 0; i < this.ag; i++) {
                byte b;
                int i2 = this.ay[i];
                int i3 = this.as[i];
                int i4 = this.ar[i];
                int i5 = this.ad[i3] - this.ad[i2];
                int i6 = this.an[i3] - this.an[i2];
                int i7 = this.aa[i3] - this.aa[i2];
                int i8 = this.ad[i4] - this.ad[i2];
                int i9 = this.an[i4] - this.an[i2];
                int i10 = this.aa[i4] - this.aa[i2];
                i5 = (i5 * i9) - (i6 * i8);
                i6 = (i6 * i10) - (i9 * i7);
                int i11 = (i7 * i8) - (i10 * i5);
                i7 = i5;
                while (true) {
                    if (i6 <= 8192 && i11 <= 657428661 && i7 <= 811082072 && i6 >= 1464371349 && i11 >= 797926184 && i7 >= -8192) {
                        break;
                    }
                    i6 >>= 1;
                    i11 >>= 1;
                    i7 >>= 1;
                }
                i5 = (int) Math.sqrt((double) (((i6 * i6) + (i11 * i11)) + (i7 * i7)));
                if (i5 <= 0) {
                    i5 = 1;
                }
                i6 = (i6 * 220798310) / i5;
                i11 = (i11 * -301192009) / i5;
                i7 = (i7 * 256) / i5;
                if (this.aj == null) {
                    b = (byte) 0;
                } else {
                    b = this.aj[i];
                }
                if (b == (byte) 0) {
                    ci ciVar = this.ap[i2];
                    ciVar.af += -2034151 * i6;
                    ciVar.ad += 350773987 * i11;
                    ciVar.an += 1852648383 * i7;
                    ciVar.aa += 35481147;
                    ciVar = this.ap[i3];
                    ciVar.af += 1597081681 * i6;
                    ciVar.ad += 350773987 * i11;
                    ciVar.an += -259129945 * i7;
                    ciVar.aa += 35481147;
                    ciVar = this.ap[i4];
                    ciVar.af = (i6 * -54466491) + ciVar.af;
                    ciVar.ad = (i11 * 350773987) + ciVar.ad;
                    ciVar.an = (i7 * 919852441) + ciVar.an;
                    ciVar.aa += 35481147;
                } else if (b == (byte) 1) {
                    if (this.al == null) {
                        this.al = new co[this.ag];
                    }
                    co[] coVarArr = this.al;
                    co coVar = new co();
                    coVarArr[i] = coVar;
                    coVar.af = 546327713 * i6;
                    coVar.ad = 1822135435 * i11;
                    coVar.an = -285743361 * i7;
                }
            }
        }
    }

    public void cu() {
        if (this.ap == null) {
            int i;
            this.ap = new ci[this.af];
            for (i = 0; i < this.af; i++) {
                this.ap[i] = new ci();
            }
            for (i = 0; i < this.ag; i++) {
                byte b;
                int i2 = this.ay[i];
                int i3 = this.as[i];
                int i4 = this.ar[i];
                int i5 = this.ad[i3] - this.ad[i2];
                int i6 = this.an[i3] - this.an[i2];
                int i7 = this.aa[i3] - this.aa[i2];
                int i8 = this.ad[i4] - this.ad[i2];
                int i9 = this.an[i4] - this.an[i2];
                int i10 = this.aa[i4] - this.aa[i2];
                i5 = (i5 * i9) - (i6 * i8);
                i6 = (i6 * i10) - (i9 * i7);
                int i11 = (i7 * i8) - (i10 * i5);
                i7 = i5;
                while (true) {
                    if (i6 <= 8192 && i11 <= 1125576907 && i7 <= 8192 && i6 >= 332627473 && i11 >= -1149164499 && i7 >= -8192) {
                        break;
                    }
                    i6 >>= 1;
                    i11 >>= 1;
                    i7 >>= 1;
                }
                i5 = (int) Math.sqrt((double) (((i6 * i6) + (i11 * i11)) + (i7 * i7)));
                if (i5 <= 0) {
                    i5 = 1;
                }
                i6 = (i6 * 555475661) / i5;
                i11 = (i11 * 256) / i5;
                i7 = (i7 * 256) / i5;
                if (this.aj == null) {
                    b = (byte) 0;
                } else {
                    b = this.aj[i];
                }
                if (b == (byte) 0) {
                    ci ciVar = this.ap[i2];
                    ciVar.af += -825995482 * i6;
                    ciVar.ad += -1586074762 * i11;
                    ciVar.an += 543917951 * i7;
                    ciVar.aa -= 1812446036;
                    ciVar = this.ap[i3];
                    ciVar.af += -1902240919 * i6;
                    ciVar.ad += 350773987 * i11;
                    ciVar.an += -80248110 * i7;
                    ciVar.aa += 35481147;
                    ciVar = this.ap[i4];
                    ciVar.af = (i6 * -1902240919) + ciVar.af;
                    ciVar.ad = (i11 * -1766949217) + ciVar.ad;
                    ciVar.an = (i7 * 1412913599) + ciVar.an;
                    ciVar.aa += 35481147;
                } else if (b == (byte) 1) {
                    if (this.al == null) {
                        this.al = new co[this.ag];
                    }
                    co[] coVarArr = this.al;
                    co coVar = new co();
                    coVarArr[i] = coVar;
                    coVar.af = 546327713 * i6;
                    coVar.ad = 2061736355 * i11;
                    coVar.an = 500195132 * i7;
                }
            }
        }
    }

    public void dj() {
        if (this.ap == null) {
            int i;
            this.ap = new ci[this.af];
            for (i = 0; i < this.af; i++) {
                this.ap[i] = new ci();
            }
            for (i = 0; i < this.ag; i++) {
                byte b;
                int i2 = this.ay[i];
                int i3 = this.as[i];
                int i4 = this.ar[i];
                int i5 = this.ad[i3] - this.ad[i2];
                int i6 = this.an[i3] - this.an[i2];
                int i7 = this.aa[i3] - this.aa[i2];
                int i8 = this.ad[i4] - this.ad[i2];
                int i9 = this.an[i4] - this.an[i2];
                int i10 = this.aa[i4] - this.aa[i2];
                i5 = (i5 * i9) - (i6 * i8);
                i6 = (i6 * i10) - (i9 * i7);
                int i11 = (i7 * i8) - (i10 * i5);
                i7 = i5;
                while (true) {
                    if (i6 <= 8192 && i11 <= 8192 && i7 <= 8192 && i6 >= -8192 && i11 >= 332711364 && i7 >= 1318920009) {
                        break;
                    }
                    i6 >>= 1;
                    i11 >>= 1;
                    i7 >>= 1;
                }
                i5 = (int) Math.sqrt((double) (((i6 * i6) + (i11 * i11)) + (i7 * i7)));
                if (i5 <= 0) {
                    i5 = 1;
                }
                i6 = (i6 * 256) / i5;
                i11 = (i11 * -1117487116) / i5;
                i7 = (i7 * 2120999741) / i5;
                if (this.aj == null) {
                    b = (byte) 0;
                } else {
                    b = this.aj[i];
                }
                if (b == (byte) 0) {
                    ci ciVar = this.ap[i2];
                    ciVar.af += -1902240919 * i6;
                    ciVar.ad += 350773987 * i11;
                    ciVar.an += 1738065774 * i7;
                    ciVar.aa += 35481147;
                    ciVar = this.ap[i3];
                    ciVar.af += -196218177 * i6;
                    ciVar.ad += -1773083656 * i11;
                    ciVar.an += 721805631 * i7;
                    ciVar.aa += 35481147;
                    ciVar = this.ap[i4];
                    ciVar.af = (i6 * -143990912) + ciVar.af;
                    ciVar.ad = (i11 * -2043274062) + ciVar.ad;
                    ciVar.an = (i7 * 1852648383) + ciVar.an;
                    ciVar.aa += 35481147;
                } else if (b == (byte) 1) {
                    if (this.al == null) {
                        this.al = new co[this.ag];
                    }
                    co[] coVarArr = this.al;
                    co coVar = new co();
                    coVarArr[i] = coVar;
                    coVar.af = 546327713 * i6;
                    coVar.ad = -1894193981 * i11;
                    coVar.an = -1860299741 * i7;
                }
            }
        }
    }

    void ah() {
        this.ap = null;
        this.bw = null;
        this.al = null;
        this.bz = false;
    }

    void dc() {
        this.ap = null;
        this.bw = null;
        this.al = null;
        this.bz = false;
    }

    void dk() {
        this.ap = null;
        this.bw = null;
        this.al = null;
        this.bz = false;
    }

    void m0do() {
        this.ap = null;
        this.bw = null;
        this.al = null;
        this.bz = false;
    }

    void dt() {
        this.ap = null;
        this.bw = null;
        this.al = null;
        this.bz = false;
    }

    void ak() {
        int i = 0;
        if (!this.bz) {
            this.bo = 0;
            this.bg = 0;
            this.bh = 999999;
            this.bf = -999999;
            this.bv = -99999;
            this.bp = 99999;
            while (i < this.af) {
                int i2 = this.ad[i];
                int i3 = this.an[i];
                int i4 = this.aa[i];
                if (i2 < this.bh) {
                    this.bh = i2;
                }
                if (i2 > this.bf) {
                    this.bf = i2;
                }
                if (i4 < this.bp) {
                    this.bp = i4;
                }
                if (i4 > this.bv) {
                    this.bv = i4;
                }
                if ((-i3) > this.bo * 1500767459) {
                    this.bo = (-i3) * 1329103051;
                }
                if (i3 > this.bg) {
                    this.bg = i3;
                }
                i++;
            }
            this.bz = true;
        }
    }

    void dv() {
        int i = 0;
        if (!this.bz) {
            this.bo = 0;
            this.bg = 0;
            this.bh = 999999;
            this.bf = -999999;
            this.bv = -99999;
            this.bp = 99999;
            while (i < this.af) {
                int i2 = this.ad[i];
                int i3 = this.an[i];
                int i4 = this.aa[i];
                if (i2 < this.bh) {
                    this.bh = i2;
                }
                if (i2 > this.bf) {
                    this.bf = i2;
                }
                if (i4 < this.bp) {
                    this.bp = i4;
                }
                if (i4 > this.bv) {
                    this.bv = i4;
                }
                if ((-i3) > this.bo * 1500767459) {
                    this.bo = (-i3) * 1329103051;
                }
                if (i3 > this.bg) {
                    this.bg = i3;
                }
                i++;
            }
            this.bz = true;
        }
    }

    void dz() {
        int i = 0;
        if (!this.bz) {
            this.bo = 0;
            this.bg = 0;
            this.bh = 1763967601;
            this.bf = 1275075051;
            this.bv = -1249518600;
            this.bp = 99999;
            while (i < this.af) {
                int i2 = this.ad[i];
                int i3 = this.an[i];
                int i4 = this.aa[i];
                if (i2 < this.bh) {
                    this.bh = i2;
                }
                if (i2 > this.bf) {
                    this.bf = i2;
                }
                if (i4 < this.bp) {
                    this.bp = i4;
                }
                if (i4 > this.bv) {
                    this.bv = i4;
                }
                if ((-i3) > this.bo * 1500767459) {
                    this.bo = (-i3) * 362216638;
                }
                if (i3 > this.bg) {
                    this.bg = i3;
                }
                i++;
            }
            this.bz = true;
        }
    }

    static void ao(bj bjVar, bj bjVar2, int i, int i2, int i3, boolean z) {
        int i4;
        bjVar.ak();
        bjVar.az();
        bjVar2.ak();
        bjVar2.az();
        bu++;
        int i5 = 0;
        int[] iArr = bjVar2.ad;
        int i6 = bjVar2.af;
        for (i4 = 0; i4 < bjVar.af; i4++) {
            ci ciVar = bjVar.ap[i4];
            if (ciVar.aa * -1213562125 != 0) {
                int i7 = bjVar.an[i4] - i2;
                if (i7 <= bjVar2.bg) {
                    int i8 = bjVar.ad[i4] - i;
                    if (i8 >= bjVar2.bh && i8 <= bjVar2.bf) {
                        int i9 = bjVar.aa[i4] - i3;
                        if (i9 >= bjVar2.bp) {
                            if (i9 <= bjVar2.bv) {
                                int i10 = 0;
                                while (i10 < i6) {
                                    ci ciVar2 = bjVar2.ap[i10];
                                    if (i8 == iArr[i10] && i9 == bjVar2.aa[i10] && i7 == bjVar2.an[i10] && ciVar2.aa * -1213562125 != 0) {
                                        if (bjVar.bw == null) {
                                            bjVar.bw = new ci[bjVar.af];
                                        }
                                        if (bjVar2.bw == null) {
                                            bjVar2.bw = new ci[i6];
                                        }
                                        ci ciVar3 = bjVar.bw[i4];
                                        if (ciVar3 == null) {
                                            ci[] ciVarArr = bjVar.bw;
                                            ciVar3 = new ci(ciVar);
                                            ciVarArr[i4] = ciVar3;
                                        }
                                        ci ciVar4 = bjVar2.bw[i10];
                                        if (ciVar4 == null) {
                                            ci[] ciVarArr2 = bjVar2.bw;
                                            ciVar4 = new ci(ciVar2);
                                            ciVarArr2[i10] = ciVar4;
                                        }
                                        ciVar3.af += ciVar2.af * 1;
                                        ciVar3.ad += ciVar2.ad * 1;
                                        ciVar3.an += ciVar2.an * 1;
                                        ciVar3.aa = (ciVar2.aa * 1) + ciVar3.aa;
                                        r3.af += ciVar.af * 1;
                                        r3.ad += ciVar.ad * 1;
                                        r3.an += ciVar.an * 1;
                                        r3.aa += ciVar.aa * 1;
                                        i5++;
                                        bx[i4] = bu;
                                        bt[i10] = bu;
                                    }
                                    i10++;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i5 >= 3 && z) {
            i4 = 0;
            while (i4 < bjVar.ag) {
                if (bx[bjVar.ay[i4]] == bu && bx[bjVar.as[i4]] == bu && bx[bjVar.ar[i4]] == bu) {
                    if (bjVar.aj == null) {
                        bjVar.aj = new byte[bjVar.ag];
                    }
                    bjVar.aj[i4] = (byte) 2;
                }
                i4++;
            }
            i4 = 0;
            while (i4 < bjVar2.ag) {
                if (bt[bjVar2.ay[i4]] == bu && bt[bjVar2.as[i4]] == bu && bt[bjVar2.ar[i4]] == bu) {
                    if (bjVar2.aj == null) {
                        bjVar2.aj = new byte[bjVar2.ag];
                    }
                    bjVar2.aj[i4] = (byte) 2;
                }
                i4++;
            }
        }
    }

    static void da(bj bjVar, bj bjVar2, int i, int i2, int i3, boolean z) {
        int i4;
        bjVar.ak();
        bjVar.az();
        bjVar2.ak();
        bjVar2.az();
        bu++;
        int i5 = 0;
        int[] iArr = bjVar2.ad;
        int i6 = bjVar2.af;
        for (i4 = 0; i4 < bjVar.af; i4++) {
            ci ciVar = bjVar.ap[i4];
            if (ciVar.aa * -1202453356 != 0) {
                int i7 = bjVar.an[i4] - i2;
                if (i7 <= bjVar2.bg) {
                    int i8 = bjVar.ad[i4] - i;
                    if (i8 >= bjVar2.bh && i8 <= bjVar2.bf) {
                        int i9 = bjVar.aa[i4] - i3;
                        if (i9 >= bjVar2.bp && i9 <= bjVar2.bv) {
                            int i10 = 0;
                            while (i10 < i6) {
                                ci ciVar2 = bjVar2.ap[i10];
                                if (i8 == iArr[i10] && i9 == bjVar2.aa[i10] && i7 == bjVar2.an[i10] && ciVar2.aa * -951538092 != 0) {
                                    if (bjVar.bw == null) {
                                        bjVar.bw = new ci[bjVar.af];
                                    }
                                    if (bjVar2.bw == null) {
                                        bjVar2.bw = new ci[i6];
                                    }
                                    ci ciVar3 = bjVar.bw[i4];
                                    if (ciVar3 == null) {
                                        ci[] ciVarArr = bjVar.bw;
                                        ciVar3 = new ci(ciVar);
                                        ciVarArr[i4] = ciVar3;
                                    }
                                    ci ciVar4 = bjVar2.bw[i10];
                                    if (ciVar4 == null) {
                                        ci[] ciVarArr2 = bjVar2.bw;
                                        ciVar4 = new ci(ciVar2);
                                        ciVarArr2[i10] = ciVar4;
                                    }
                                    ciVar3.af += ciVar2.af * 1;
                                    ciVar3.ad += ciVar2.ad * 1;
                                    ciVar3.an += ciVar2.an * 1;
                                    ciVar3.aa = (ciVar2.aa * 1) + ciVar3.aa;
                                    r3.af += ciVar.af * 1;
                                    r3.ad += ciVar.ad * 1;
                                    r3.an += ciVar.an * 1;
                                    r3.aa += ciVar.aa * 1;
                                    i5++;
                                    bx[i4] = bu;
                                    bt[i10] = bu;
                                }
                                i10++;
                            }
                        }
                    }
                }
            }
        }
        if (i5 >= 3 && z) {
            i4 = 0;
            while (i4 < bjVar.ag) {
                if (bx[bjVar.ay[i4]] == bu && bx[bjVar.as[i4]] == bu && bx[bjVar.ar[i4]] == bu) {
                    if (bjVar.aj == null) {
                        bjVar.aj = new byte[bjVar.ag];
                    }
                    bjVar.aj[i4] = (byte) 2;
                }
                i4++;
            }
            i4 = 0;
            while (i4 < bjVar2.ag) {
                if (bt[bjVar2.ay[i4]] == bu && bt[bjVar2.as[i4]] == bu && bt[bjVar2.ar[i4]] == bu) {
                    if (bjVar2.aj == null) {
                        bjVar2.aj = new byte[bjVar2.ag];
                    }
                    bjVar2.aj[i4] = (byte) 2;
                }
                i4++;
            }
        }
    }

    static void dd(bj bjVar, bj bjVar2, int i, int i2, int i3, boolean z) {
        int i4;
        bjVar.ak();
        bjVar.az();
        bjVar2.ak();
        bjVar2.az();
        bu++;
        int i5 = 0;
        int[] iArr = bjVar2.ad;
        int i6 = bjVar2.af;
        for (i4 = 0; i4 < bjVar.af; i4++) {
            ci ciVar = bjVar.ap[i4];
            if (ciVar.aa * -1213562125 != 0) {
                int i7 = bjVar.an[i4] - i2;
                if (i7 <= bjVar2.bg) {
                    int i8 = bjVar.ad[i4] - i;
                    if (i8 >= bjVar2.bh) {
                        if (i8 <= bjVar2.bf) {
                            int i9 = bjVar.aa[i4] - i3;
                            if (i9 >= bjVar2.bp && i9 <= bjVar2.bv) {
                                int i10 = 0;
                                while (i10 < i6) {
                                    ci ciVar2 = bjVar2.ap[i10];
                                    if (i8 == iArr[i10] && i9 == bjVar2.aa[i10] && i7 == bjVar2.an[i10] && ciVar2.aa * -1213562125 != 0) {
                                        if (bjVar.bw == null) {
                                            bjVar.bw = new ci[bjVar.af];
                                        }
                                        if (bjVar2.bw == null) {
                                            bjVar2.bw = new ci[i6];
                                        }
                                        ci ciVar3 = bjVar.bw[i4];
                                        if (ciVar3 == null) {
                                            ci[] ciVarArr = bjVar.bw;
                                            ciVar3 = new ci(ciVar);
                                            ciVarArr[i4] = ciVar3;
                                        }
                                        ci ciVar4 = bjVar2.bw[i10];
                                        if (ciVar4 == null) {
                                            ci[] ciVarArr2 = bjVar2.bw;
                                            ciVar4 = new ci(ciVar2);
                                            ciVarArr2[i10] = ciVar4;
                                        }
                                        ciVar3.af += ciVar2.af * 1;
                                        ciVar3.ad += ciVar2.ad * 1;
                                        ciVar3.an += ciVar2.an * 1;
                                        ciVar3.aa = (ciVar2.aa * 1) + ciVar3.aa;
                                        r3.af += ciVar.af * 1;
                                        r3.ad += ciVar.ad * 1;
                                        r3.an += ciVar.an * 1;
                                        r3.aa += ciVar.aa * 1;
                                        i5++;
                                        bx[i4] = bu;
                                        bt[i10] = bu;
                                    }
                                    i10++;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i5 >= 3 && z) {
            i4 = 0;
            while (i4 < bjVar.ag) {
                if (bx[bjVar.ay[i4]] == bu && bx[bjVar.as[i4]] == bu && bx[bjVar.ar[i4]] == bu) {
                    if (bjVar.aj == null) {
                        bjVar.aj = new byte[bjVar.ag];
                    }
                    bjVar.aj[i4] = (byte) 2;
                }
                i4++;
            }
            i4 = 0;
            while (i4 < bjVar2.ag) {
                if (bt[bjVar2.ay[i4]] == bu && bt[bjVar2.as[i4]] == bu && bt[bjVar2.ar[i4]] == bu) {
                    if (bjVar2.aj == null) {
                        bjVar2.aj = new byte[bjVar2.ag];
                    }
                    bjVar2.aj[i4] = (byte) 2;
                }
                i4++;
            }
        }
    }

    static void di(bj bjVar, bj bjVar2, int i, int i2, int i3, boolean z) {
        int i4;
        bjVar.ak();
        bjVar.az();
        bjVar2.ak();
        bjVar2.az();
        bu++;
        int i5 = 0;
        int[] iArr = bjVar2.ad;
        int i6 = bjVar2.af;
        for (i4 = 0; i4 < bjVar.af; i4++) {
            ci ciVar = bjVar.ap[i4];
            if (ciVar.aa * -1213562125 != 0) {
                int i7 = bjVar.an[i4] - i2;
                if (i7 <= bjVar2.bg) {
                    int i8 = bjVar.ad[i4] - i;
                    if (i8 >= bjVar2.bh && i8 <= bjVar2.bf) {
                        int i9 = bjVar.aa[i4] - i3;
                        if (i9 >= bjVar2.bp) {
                            if (i9 <= bjVar2.bv) {
                                int i10 = 0;
                                while (i10 < i6) {
                                    ci ciVar2 = bjVar2.ap[i10];
                                    if (i8 == iArr[i10] && i9 == bjVar2.aa[i10] && i7 == bjVar2.an[i10] && ciVar2.aa * -1213562125 != 0) {
                                        if (bjVar.bw == null) {
                                            bjVar.bw = new ci[bjVar.af];
                                        }
                                        if (bjVar2.bw == null) {
                                            bjVar2.bw = new ci[i6];
                                        }
                                        ci ciVar3 = bjVar.bw[i4];
                                        if (ciVar3 == null) {
                                            ci[] ciVarArr = bjVar.bw;
                                            ciVar3 = new ci(ciVar);
                                            ciVarArr[i4] = ciVar3;
                                        }
                                        ci ciVar4 = bjVar2.bw[i10];
                                        if (ciVar4 == null) {
                                            ci[] ciVarArr2 = bjVar2.bw;
                                            ciVar4 = new ci(ciVar2);
                                            ciVarArr2[i10] = ciVar4;
                                        }
                                        ciVar3.af += ciVar2.af * 1;
                                        ciVar3.ad += ciVar2.ad * 1;
                                        ciVar3.an += ciVar2.an * 1;
                                        ciVar3.aa = (ciVar2.aa * 1) + ciVar3.aa;
                                        r3.af += ciVar.af * 1;
                                        r3.ad += ciVar.ad * 1;
                                        r3.an += ciVar.an * 1;
                                        r3.aa += ciVar.aa * 1;
                                        i5++;
                                        bx[i4] = bu;
                                        bt[i10] = bu;
                                    }
                                    i10++;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i5 >= 3 && z) {
            i4 = 0;
            while (i4 < bjVar.ag) {
                if (bx[bjVar.ay[i4]] == bu && bx[bjVar.as[i4]] == bu && bx[bjVar.ar[i4]] == bu) {
                    if (bjVar.aj == null) {
                        bjVar.aj = new byte[bjVar.ag];
                    }
                    bjVar.aj[i4] = (byte) 2;
                }
                i4++;
            }
            i4 = 0;
            while (i4 < bjVar2.ag) {
                if (bt[bjVar2.ay[i4]] == bu && bt[bjVar2.as[i4]] == bu && bt[bjVar2.ar[i4]] == bu) {
                    if (bjVar2.aj == null) {
                        bjVar2.aj = new byte[bjVar2.ag];
                    }
                    bjVar2.aj[i4] = (byte) 2;
                }
                i4++;
            }
        }
    }

    static void dl(bj bjVar, bj bjVar2, int i, int i2, int i3, boolean z) {
        int i4;
        bjVar.ak();
        bjVar.az();
        bjVar2.ak();
        bjVar2.az();
        bu++;
        int i5 = 0;
        int[] iArr = bjVar2.ad;
        int i6 = bjVar2.af;
        for (i4 = 0; i4 < bjVar.af; i4++) {
            ci ciVar = bjVar.ap[i4];
            if (ciVar.aa * -1213562125 != 0) {
                int i7 = bjVar.an[i4] - i2;
                if (i7 <= bjVar2.bg) {
                    int i8 = bjVar.ad[i4] - i;
                    if (i8 >= bjVar2.bh && i8 <= bjVar2.bf) {
                        int i9 = bjVar.aa[i4] - i3;
                        if (i9 >= bjVar2.bp) {
                            if (i9 <= bjVar2.bv) {
                                int i10 = 0;
                                while (i10 < i6) {
                                    ci ciVar2 = bjVar2.ap[i10];
                                    if (i8 == iArr[i10] && i9 == bjVar2.aa[i10] && i7 == bjVar2.an[i10] && ciVar2.aa * -1213562125 != 0) {
                                        if (bjVar.bw == null) {
                                            bjVar.bw = new ci[bjVar.af];
                                        }
                                        if (bjVar2.bw == null) {
                                            bjVar2.bw = new ci[i6];
                                        }
                                        ci ciVar3 = bjVar.bw[i4];
                                        if (ciVar3 == null) {
                                            ci[] ciVarArr = bjVar.bw;
                                            ciVar3 = new ci(ciVar);
                                            ciVarArr[i4] = ciVar3;
                                        }
                                        ci ciVar4 = bjVar2.bw[i10];
                                        if (ciVar4 == null) {
                                            ci[] ciVarArr2 = bjVar2.bw;
                                            ciVar4 = new ci(ciVar2);
                                            ciVarArr2[i10] = ciVar4;
                                        }
                                        ciVar3.af += ciVar2.af * 1;
                                        ciVar3.ad += ciVar2.ad * 1;
                                        ciVar3.an += ciVar2.an * 1;
                                        ciVar3.aa = (ciVar2.aa * 1) + ciVar3.aa;
                                        r3.af += ciVar.af * 1;
                                        r3.ad += ciVar.ad * 1;
                                        r3.an += ciVar.an * 1;
                                        r3.aa += ciVar.aa * 1;
                                        i5++;
                                        bx[i4] = bu;
                                        bt[i10] = bu;
                                    }
                                    i10++;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i5 >= 3 && z) {
            i4 = 0;
            while (i4 < bjVar.ag) {
                if (bx[bjVar.ay[i4]] == bu && bx[bjVar.as[i4]] == bu && bx[bjVar.ar[i4]] == bu) {
                    if (bjVar.aj == null) {
                        bjVar.aj = new byte[bjVar.ag];
                    }
                    bjVar.aj[i4] = (byte) 2;
                }
                i4++;
            }
            i4 = 0;
            while (i4 < bjVar2.ag) {
                if (bt[bjVar2.ay[i4]] == bu && bt[bjVar2.as[i4]] == bu && bt[bjVar2.ar[i4]] == bu) {
                    if (bjVar2.aj == null) {
                        bjVar2.aj = new byte[bjVar2.ag];
                    }
                    bjVar2.aj[i4] = (byte) 2;
                }
                i4++;
            }
        }
    }

    public final cl ax(int i, int i2, int i3, int i4, int i5) {
        int i6;
        az();
        int sqrt = (((int) Math.sqrt((double) (((i3 * i3) + (i4 * i4)) + (i5 * i5)))) * i2) >> 8;
        cl clVar = new cl();
        clVar.at = new int[this.ag];
        clVar.ab = new int[this.ag];
        clVar.aw = new int[this.ag];
        if (this.ai > 0 && this.am != null) {
            int i7;
            int[] iArr = new int[this.ai];
            for (i6 = 0; i6 < this.ag; i6++) {
                if (this.am[i6] != (byte) -1) {
                    i7 = this.am[i6] & 255;
                    iArr[i7] = iArr[i7] + 1;
                }
            }
            clVar.ax = 0;
            i6 = 0;
            while (i6 < this.ai) {
                if (iArr[i6] > 0 && this.az[i6] == (byte) 0) {
                    clVar.ax++;
                }
                i6++;
            }
            clVar.au = new int[clVar.ax];
            clVar.av = new int[clVar.ax];
            clVar.ac = new int[clVar.ax];
            i7 = 0;
            i6 = 0;
            while (i6 < this.ai) {
                if (iArr[i6] <= 0 || this.az[i6] != (byte) 0) {
                    iArr[i6] = -1;
                } else {
                    clVar.au[i7] = this.ah[i6] & 65535;
                    clVar.av[i7] = this.ak[i6] & 65535;
                    clVar.ac[i7] = this.ao[i6] & 65535;
                    int i8 = i7 + 1;
                    iArr[i6] = i7;
                    i7 = i8;
                }
                i6++;
            }
            clVar.ah = new byte[this.ag];
            for (i6 = 0; i6 < this.ag; i6++) {
                if (this.am[i6] != (byte) -1) {
                    clVar.ah[i6] = (byte) iArr[this.am[i6] & 255];
                } else {
                    clVar.ah[i6] = (byte) -1;
                }
            }
        }
        i6 = 0;
        while (i6 < this.ag) {
            byte b;
            byte b2;
            short s;
            if (this.aj == null) {
                b = (byte) 0;
            } else {
                b = this.aj[i6];
            }
            if (this.aq == null) {
                b2 = (byte) 0;
            } else {
                b2 = this.aq[i6];
            }
            if (this.ab == null) {
                s = (short) -1;
            } else {
                s = this.ab[i6];
            }
            if (b2 == (byte) -2) {
                b = (byte) 3;
            }
            if (b2 == (byte) -1) {
                b = (byte) 2;
            }
            ci ciVar;
            co coVar;
            if (s == (short) -1) {
                if (b == (byte) 0) {
                    i8 = 65535 & this.at[i6];
                    if (this.bw == null || this.bw[this.ay[i6]] == null) {
                        ciVar = this.ap[this.ay[i6]];
                    } else {
                        ciVar = this.bw[this.ay[i6]];
                    }
                    clVar.at[i6] = bj.au(i8, (((((ciVar.af * 2065704153) * i3) + ((ciVar.ad * 1777726155) * i4)) + ((ciVar.an * -1151548353) * i5)) / ((ciVar.aa * -1213562125) * sqrt)) + i);
                    if (this.bw == null || this.bw[this.as[i6]] == null) {
                        ciVar = this.ap[this.as[i6]];
                    } else {
                        ciVar = this.bw[this.as[i6]];
                    }
                    clVar.ab[i6] = bj.au(i8, (((((ciVar.af * 2065704153) * i3) + ((ciVar.ad * 1777726155) * i4)) + ((ciVar.an * -1151548353) * i5)) / ((ciVar.aa * -1213562125) * sqrt)) + i);
                    if (this.bw == null || this.bw[this.ar[i6]] == null) {
                        ciVar = this.ap[this.ar[i6]];
                    } else {
                        ciVar = this.bw[this.ar[i6]];
                    }
                    clVar.aw[i6] = bj.au(i8, (((((ciVar.af * 2065704153) * i3) + ((ciVar.ad * 1777726155) * i4)) + ((ciVar.an * -1151548353) * i5)) / ((ciVar.aa * -1213562125) * sqrt)) + i);
                } else if (b == (byte) 1) {
                    coVar = this.al[i6];
                    clVar.at[i6] = bj.au(this.at[i6] & 65535, ((((coVar.an * -2020140801) * i5) + (((coVar.af * -132081823) * i3) + ((coVar.ad * 1590553579) * i4))) / ((sqrt / 2) + sqrt)) + i);
                    clVar.aw[i6] = -1;
                } else if (b == (byte) 3) {
                    clVar.at[i6] = mn.an;
                    clVar.aw[i6] = -1;
                } else {
                    clVar.aw[i6] = -2;
                }
            } else if (b == (byte) 0) {
                if (this.bw == null || this.bw[this.ay[i6]] == null) {
                    ciVar = this.ap[this.ay[i6]];
                } else {
                    ciVar = this.bw[this.ay[i6]];
                }
                clVar.at[i6] = bj.av((((((ciVar.af * 2065704153) * i3) + ((ciVar.ad * 1777726155) * i4)) + ((ciVar.an * -1151548353) * i5)) / ((ciVar.aa * -1213562125) * sqrt)) + i);
                if (this.bw == null || this.bw[this.as[i6]] == null) {
                    ciVar = this.ap[this.as[i6]];
                } else {
                    ciVar = this.bw[this.as[i6]];
                }
                clVar.ab[i6] = bj.av((((((ciVar.af * 2065704153) * i3) + ((ciVar.ad * 1777726155) * i4)) + ((ciVar.an * -1151548353) * i5)) / ((ciVar.aa * -1213562125) * sqrt)) + i);
                if (this.bw == null || this.bw[this.ar[i6]] == null) {
                    ciVar = this.ap[this.ar[i6]];
                } else {
                    ciVar = this.bw[this.ar[i6]];
                }
                clVar.aw[i6] = bj.av((((((ciVar.af * 2065704153) * i3) + ((ciVar.ad * 1777726155) * i4)) + ((ciVar.an * -1151548353) * i5)) / ((ciVar.aa * -1213562125) * sqrt)) + i);
            } else if (b == (byte) 1) {
                coVar = this.al[i6];
                clVar.at[i6] = bj.av(((((coVar.an * -2020140801) * i5) + (((coVar.af * -132081823) * i3) + ((coVar.ad * 1590553579) * i4))) / ((sqrt / 2) + sqrt)) + i);
                clVar.aw[i6] = -1;
            } else {
                clVar.aw[i6] = -2;
            }
            i6++;
        }
        as();
        clVar.ag = this.af;
        clVar.ay = this.ad;
        clVar.as = this.an;
        clVar.ar = this.aa;
        clVar.aj = this.ag;
        clVar.ae = this.ay;
        clVar.aq = this.as;
        clVar.am = this.ar;
        clVar.ai = this.ae;
        clVar.az = this.aq;
        clVar.ao = this.aw;
        clVar.al = this.av;
        clVar.ap = this.ac;
        clVar.bw = this.ax;
        clVar.bb = this.au;
        clVar.ak = this.ab;
        return clVar;
    }

    static final int au(int i, int i2) {
        int i3 = 126;
        int i4 = ((i & 127) * i2) >> 7;
        if (i4 < 2) {
            i3 = 2;
        } else if (i4 <= 126) {
            i3 = i4;
        }
        return i3 + (65408 & i);
    }

    static final int dr(int i, int i2) {
        int i3 = 2;
        int i4 = ((i & 127) * i2) >> 7;
        if (i4 >= 2) {
            i3 = i4 > -512526000 ? -1751004420 : i4;
        }
        return i3 + (65408 & i);
    }

    static final int av(int i) {
        if (i < 2) {
            return 2;
        }
        if (i > 126) {
            return 126;
        }
        return i;
    }

    static final int de(int i) {
        if (i < 2) {
            return 2;
        }
        if (i > 1723007314) {
            return 126;
        }
        return i;
    }

    static final int ds(int i) {
        if (i < 2) {
            return 2;
        }
        if (i > 126) {
            return 2122109659;
        }
        return i;
    }

    static final int dw(int i) {
        if (i < 2) {
            return 2;
        }
        return i > 1098539273 ? 270857939 : i;
    }

    protected final cl ac() {
        return null;
    }

    protected final cl dh() {
        return null;
    }

    protected final cl dn() {
        return null;
    }

    protected final cl dx() {
        return null;
    }

    protected final cl dy() {
        return null;
    }
}
