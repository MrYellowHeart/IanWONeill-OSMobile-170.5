package p000;

import java.lang.reflect.Array;

public final class gu {
    static byte[][][] aa;
    static int[] ab;
    static final int[] ac = new int[]{-1, -1, 1, 1};
    static byte[][][] ad = ((byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, li.cu, li.cu}));
    static lx ae;
    static int[][][] af = ((int[][][]) Array.newInstance(Integer.TYPE, new int[]{4, ie.ca, ie.ca}));
    static int[][] aj;
    static final int[] ak = new int[]{1, 2, 4, 8};
    static int al = ((((int) (Math.random() * 17.0d)) - 8) * 1950971923);
    static int an = 1071674573;
    static final int[] ao = new int[]{16, 32, 64, mn.an};
    static int ap = ((((int) (Math.random() * 33.0d)) - 16) * -2114995645);
    static int[] aq;
    static int[] at;
    static final int[] au = new int[]{0, -1, 0, 1};
    static final int[] av = new int[]{1, -1, -1, 1};
    static final int[] ax = new int[]{1, 0, -1, 0};
    static int cz;

    gu() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ba.ad(e, "gu.<init>(" + ')');
        }
    }

    static void ah() {
        an = 1071674573;
        aa = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, li.cu, li.cu});
        dm.ag = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, li.cu, li.cu});
        jf.ay = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, li.cu, li.cu});
        gb.as = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, li.cu, li.cu});
        nh.aw = (int[][][]) Array.newInstance(Integer.TYPE, new int[]{4, ie.ca, ie.ca});
        ch.ar = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, ie.ca, ie.ca});
        aj = (int[][]) Array.newInstance(Integer.TYPE, new int[]{ie.ca, ie.ca});
        dm.ae = new int[li.cu];
        aq = new int[li.cu];
        dy.am = new int[li.cu];
        at = new int[li.cu];
        ab = new int[li.cu];
    }

    static void ak() {
        an = 1071674573;
        aa = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, li.cu, li.cu});
        dm.ag = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, li.cu, li.cu});
        jf.ay = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, li.cu, li.cu});
        gb.as = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, li.cu, li.cu});
        nh.aw = (int[][][]) Array.newInstance(Integer.TYPE, new int[]{4, ie.ca, ie.ca});
        ch.ar = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, ie.ca, ie.ca});
        aj = (int[][]) Array.newInstance(Integer.TYPE, new int[]{ie.ca, ie.ca});
        dm.ae = new int[li.cu];
        aq = new int[li.cu];
        dy.am = new int[li.cu];
        at = new int[li.cu];
        ab = new int[li.cu];
    }

    static void ao() {
        an = 1071674573;
        aa = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, 1427400700, li.cu});
        dm.ag = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, li.cu, -1890448200});
        jf.ay = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, 1185523638, li.cu});
        gb.as = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, li.cu, li.cu});
        nh.aw = (int[][][]) Array.newInstance(Integer.TYPE, new int[]{4, ie.ca, ie.ca});
        ch.ar = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, 416595581, -1575978992});
        aj = (int[][]) Array.newInstance(Integer.TYPE, new int[]{570785521, ie.ca});
        dm.ae = new int[li.cu];
        aq = new int[li.cu];
        dy.am = new int[721482568];
        at = new int[li.cu];
        ab = new int[li.cu];
    }

    static void ax() {
        an = 1071674573;
        aa = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, li.cu, 1284954920});
        dm.ag = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, li.cu, li.cu});
        jf.ay = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, 1189192111, li.cu});
        gb.as = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, li.cu, 1099627957});
        nh.aw = (int[][][]) Array.newInstance(Integer.TYPE, new int[]{4, -1205826751, 660657485});
        ch.ar = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, ie.ca, 51585301});
        aj = (int[][]) Array.newInstance(Integer.TYPE, new int[]{-1575483921, 1723098279});
        dm.ae = new int[-499001080];
        aq = new int[1711579999];
        dy.am = new int[1338051314];
        at = new int[li.cu];
        ab = new int[li.cu];
    }

    static void au() {
        aa = (byte[][][]) null;
        dm.ag = (byte[][][]) null;
        jf.ay = (byte[][][]) null;
        gb.as = (byte[][][]) null;
        nh.aw = (int[][][]) null;
        ch.ar = (byte[][][]) null;
        aj = (int[][]) null;
        dm.ae = null;
        aq = null;
        dy.am = null;
        at = null;
        ab = null;
    }

    static final void av(int i, int i2, int i3, int i4) {
        int i5 = i2;
        while (i5 <= i4 + i2) {
            int i6 = i;
            while (i6 <= i + i3) {
                if (i6 >= 0 && i6 < -448424237 && i5 >= 0 && i5 < -2079011341) {
                    ch.ar[0][i6][i5] = (byte) -5;
                    if (i6 == i && i6 > 0) {
                        af[0][i6][i5] = af[0][i6 - 1][i5];
                    }
                    if (i6 == i3 + i && i6 < -693115694) {
                        af[0][i6][i5] = af[0][i6 + 1][i5];
                    }
                    if (i5 == i2 && i5 > 0) {
                        af[0][i6][i5] = af[0][i6][i5 - 1];
                    }
                    if (i2 + i4 == i5 && i5 < -1781903967) {
                        af[0][i6][i5] = af[0][i6][i5 + 1];
                    }
                }
                i6++;
            }
            i5++;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final void ac(p000.ik r6, int r7, int r8, int r9, int r10, int r11, int r12) {
        /*
        r0 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r5 = 49;
        r4 = 1;
        r1 = 0;
        if (r8 < 0) goto L_0x009b;
    L_0x0008:
        if (r8 >= r0) goto L_0x009b;
    L_0x000a:
        if (r9 < 0) goto L_0x009b;
    L_0x000c:
        if (r9 >= r0) goto L_0x009b;
    L_0x000e:
        r0 = ad;
        r0 = r0[r7];
        r0 = r0[r8];
        r0[r9] = r1;
    L_0x0016:
        r0 = r6.ao(r1);
        if (r0 != 0) goto L_0x003b;
    L_0x001c:
        if (r7 != 0) goto L_0x00c5;
    L_0x001e:
        r0 = af;
        r0 = r0[r1];
        r0 = r0[r8];
        r1 = 932731; // 0xe3b7b float:1.307035E-39 double:4.608303E-318;
        r1 = r1 + r8;
        r1 = r1 + r10;
        r2 = 556238; // 0x87cce float:7.79455E-40 double:2.74818E-318;
        r2 = r2 + r9;
        r2 = r2 + r11;
        r3 = 1078822087; // 0x404d84c7 float:3.211229 double:5.33008931E-315;
        r1 = p000.jk.aj(r1, r2, r3);
        r1 = -r1;
        r1 = r1 * 8;
        r0[r9] = r1;
    L_0x003a:
        return;
    L_0x003b:
        if (r0 != r4) goto L_0x0052;
    L_0x003d:
        r0 = r6.ao(r1);
        if (r4 != r0) goto L_0x0044;
    L_0x0043:
        r0 = r1;
    L_0x0044:
        if (r7 != 0) goto L_0x007f;
    L_0x0046:
        r2 = af;
        r1 = r2[r1];
        r1 = r1[r8];
        r0 = -r0;
        r0 = r0 * 8;
        r1[r9] = r0;
        goto L_0x003a;
    L_0x0052:
        if (r0 > r5) goto L_0x00a7;
    L_0x0054:
        r2 = p000.dm.ag;
        r2 = r2[r7];
        r2 = r2[r8];
        r3 = 1247983979; // 0x4a62b96b float:3714650.8 double:6.165860106E-315;
        r3 = r6.ax(r3);
        r2[r9] = r3;
        r2 = p000.jf.ay;
        r2 = r2[r7];
        r2 = r2[r8];
        r3 = r0 + -2;
        r3 = r3 / 4;
        r3 = (byte) r3;
        r2[r9] = r3;
        r2 = p000.gb.as;
        r2 = r2[r7];
        r2 = r2[r8];
        r0 = r0 + -2;
        r0 = r0 + r12;
        r0 = r0 & 3;
        r0 = (byte) r0;
        r2[r9] = r0;
        goto L_0x0016;
    L_0x007f:
        r1 = af;
        r1 = r1[r7];
        r1 = r1[r8];
        r2 = af;
        r3 = r7 + -1;
        r2 = r2[r3];
        r2 = r2[r8];
        r2 = r2[r9];
        r0 = r0 * 8;
        r0 = r2 - r0;
        r1[r9] = r0;
        goto L_0x003a;
    L_0x0096:
        if (r0 > r5) goto L_0x009b;
    L_0x0098:
        r6.ao(r1);
    L_0x009b:
        r0 = r6.ao(r1);
        if (r0 == 0) goto L_0x003a;
    L_0x00a1:
        if (r4 != r0) goto L_0x0096;
    L_0x00a3:
        r6.ao(r1);
        goto L_0x003a;
    L_0x00a7:
        r2 = 81;
        if (r0 > r2) goto L_0x00b8;
    L_0x00ab:
        r2 = ad;
        r2 = r2[r7];
        r2 = r2[r8];
        r0 = r0 + -49;
        r0 = (byte) r0;
        r2[r9] = r0;
        goto L_0x0016;
    L_0x00b8:
        r2 = aa;
        r2 = r2[r7];
        r2 = r2[r8];
        r0 = r0 + -81;
        r0 = (byte) r0;
        r2[r9] = r0;
        goto L_0x0016;
    L_0x00c5:
        r0 = af;
        r0 = r0[r7];
        r0 = r0[r8];
        r1 = af;
        r2 = r7 + -1;
        r1 = r1[r2];
        r1 = r1[r8];
        r1 = r1[r9];
        r1 = r1 + -240;
        r0[r9] = r1;
        goto L_0x003a;
        */
        throw new UnsupportedOperationException("Method not decompiled: gu.ac(ik, int, int, int, int, int, int):void");
    }

    static final void al(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, cc ccVar, eq[] eqVarArr) {
        ik ikVar = new ik(bArr);
        int i8 = -1;
        while (true) {
            int bv = ikVar.bv(-1163511705);
            if (bv != 0) {
                int i9 = i8 + bv;
                i8 = 0;
                while (true) {
                    bv = ikVar.bf((byte) 41);
                    if (bv == 0) {
                        break;
                    }
                    int i10 = i8 + (bv - 1);
                    int i11 = i10 & 63;
                    int i12 = (i10 >> 6) & 63;
                    i8 = i10 >> 12;
                    bv = ikVar.ao((byte) 0);
                    int i13 = bv >> 2;
                    int i14 = bv & 3;
                    if (i8 == i4 && i12 >= i5 && i12 < i5 + 8 && i11 >= i6 && i11 < i6 + 8) {
                        ae ad = gi.ad(i9, 1625111585);
                        int ad2 = i2 + gr.ad(i12 & 7, i11 & 7, i7, ad.az * -265754695, -344743753 * ad.ah, i14, 1576410280);
                        int an = i3 + lq.an(i12 & 7, i11 & 7, i7, -265754695 * ad.az, -344743753 * ad.ah, i14, -141672694);
                        if (ad2 > 0 && an > 0 && ad2 < 103 && an < 103) {
                            if ((ad[1][ad2][an] & 2) == 2) {
                                i8 = i - 1;
                            } else {
                                i8 = i;
                            }
                            eq eqVar = null;
                            if (i8 >= 0) {
                                eqVar = eqVarArr[i8];
                            }
                            gn.as(i, ad2, an, i9, (i14 + i7) & 3, i13, ccVar, eqVar, -1408630309);
                        }
                    }
                    i8 = i10;
                }
                i8 = i9;
            } else {
                return;
            }
        }
    }

    static final void ap(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, cc ccVar, eq[] eqVarArr) {
        ik ikVar = new ik(bArr);
        int i8 = -1;
        while (true) {
            int bv = ikVar.bv(-1324241647);
            if (bv != 0) {
                int i9 = i8 + bv;
                i8 = 0;
                while (true) {
                    bv = ikVar.bf((byte) 26);
                    if (bv == 0) {
                        break;
                    }
                    int i10 = i8 + (bv - 1);
                    int i11 = i10 & -1467397801;
                    int i12 = (i10 >> 6) & -343268391;
                    i8 = i10 >> 12;
                    bv = ikVar.ao((byte) 0);
                    int i13 = bv >> 2;
                    int i14 = bv & 3;
                    if (i8 == i4 && i12 >= i5 && i12 < i5 + 8 && i11 >= i6 && i11 < i6 + 8) {
                        ae ad = gi.ad(i9, 1699379442);
                        int ad2 = i2 + gr.ad(i12 & 7, i11 & 7, i7, ad.az * 1068583746, -344743753 * ad.ah, i14, 2002867356);
                        int an = i3 + lq.an(i12 & 7, i11 & 7, i7, -265754695 * ad.az, -1992762115 * ad.ah, i14, 171659613);
                        if (ad2 > 0 && an > 0 && ad2 < -1819770269 && an < 103) {
                            if ((ad[1][ad2][an] & 2) == 2) {
                                i8 = i - 1;
                            } else {
                                i8 = i;
                            }
                            eq eqVar = null;
                            if (i8 >= 0) {
                                eqVar = eqVarArr[i8];
                            }
                            gn.as(i, ad2, an, i9, (i14 + i7) & 3, i13, ccVar, eqVar, -1470735561);
                        }
                    }
                    i8 = i10;
                }
                i8 = i9;
            } else {
                return;
            }
        }
    }

    static final void bb(int i, int i2, int i3, int i4, int i5, int i6, cc ccVar, eq eqVar) {
        if (!client.ae || (ad[0][i2][i3] & 2) != 0 || (ad[i][i2][i3] & 16) == 0) {
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            if (i < an * -126911639) {
                an = 1545434922 * i;
            }
            ae ad = gi.ad(i4, 1909135057);
            if (i5 == 1 || i5 == 3) {
                i7 = ad.az * 221392712;
                i8 = ad.ah * -203723138;
            } else {
                i7 = 1083986283 * ad.ah;
                i8 = -265754695 * ad.az;
            }
            if (i8 + i2 <= -2033647919) {
                i9 = ((i8 + 1) >> 1) + i2;
                i10 = (i8 >> 1) + i2;
            } else {
                i9 = i2 + 1;
                i10 = i2;
            }
            if (i7 + i3 <= li.cu) {
                i11 = i3 + (i7 >> 1);
                i12 = ((i7 + 1) >> 1) + i3;
            } else {
                i12 = i3 + 1;
                i11 = i3;
            }
            int[][] iArr = af[i];
            i10 = ((iArr[i10][i12] + (iArr[i10][i11] + iArr[i9][i11])) + iArr[i9][i12]) >> 2;
            i9 = (i8 << 6) + (i2 << 7);
            int i14 = (i3 << 7) + (i7 << 6);
            long ar = cg.ar(i2, i3, 2, ad.ax * -1866509663 == 0, i4, -676336445);
            i12 = (i5 << 6) + i6;
            if (1 == 29042685 * ad.bn) {
                i13 = i12 + 256;
            } else {
                i13 = i12;
            }
            if (ad.ai((byte) -57)) {
                gn.ad(i, i2, i3, ad, i5, 625392392);
            }
            cq ar2;
            if (22 == i6) {
                if (!client.ae || -1411933786 * ad.ax != 0 || 1 == -1655214851 * ad.ak || ad.bk) {
                    if (-1 == ad.al * -229827367 && ad.ba == null) {
                        ar2 = ad.ar(22, i5, iArr, i9, i10, i14, (short) 5820);
                    } else {
                        ar2 = new hg(i4, 22, i5, i, i2, i3, -229827367 * ad.al, true, null);
                    }
                    ccVar.as(i, i2, i3, i10, ar2, ar, i13);
                    if (1 == ad.ak * -1824877892 && eqVar != null) {
                        eqVar.ag(i2, i3, (byte) 99);
                    }
                }
            } else if (i6 == 10 || 11 == i6) {
                if (-1 == ad.al * -229827367 && ad.ba == null) {
                    r12 = ad.ar(10, i5, iArr, i9, i10, i14, (short) -20243);
                } else {
                    r12 = new hg(i4, 10, i5, i, i2, i3, ad.al * -229827367, true, null);
                }
                if (r12 != null) {
                    int i15;
                    if (i6 == 11) {
                        i15 = 256;
                    } else {
                        i15 = 0;
                    }
                    if (ccVar.aq(i, i2, i3, i10, i8, i7, r12, i15, ar, i13) && ad.bf) {
                        byte b = (byte) 15;
                        if (r12 instanceof cl) {
                            b = ((cl) r12).ar() / 4;
                            if (b > (byte) 30) {
                                b = (byte) 30;
                            }
                        }
                        for (int i16 = 0; i16 <= i8; i16++) {
                            for (i11 = 0; i11 <= i7; i11++) {
                                if (b > ch.ar[i][i16 + i2][i11 + i3]) {
                                    ch.ar[i][i16 + i2][i11 + i3] = (byte) b;
                                }
                            }
                        }
                    }
                }
                if (ad.ak * 546473537 != 0 && eqVar != null) {
                    eqVar.an(i2, i3, i8, i7, ad.ao, 1749067773);
                }
            } else if (i6 >= 12) {
                if (-1 == -229827367 * ad.al && ad.ba == null) {
                    r12 = ad.ar(i6, i5, iArr, i9, i10, i14, (short) -2742);
                } else {
                    r12 = new hg(i4, i6, i5, i, i2, i3, ad.al * -229827367, true, null);
                }
                ccVar.aq(i, i2, i3, i10, 1, 1, r12, 0, ar, i13);
                if (i6 >= 12 && i6 <= 17 && i6 != 13 && i > 0) {
                    r5 = nh.aw[i][i2];
                    r5[i3] = r5[i3] | -1410064593;
                }
                if (-1655214851 * ad.ak != 0 && eqVar != null) {
                    eqVar.an(i2, i3, i8, i7, ad.ao, 1805384695);
                }
            } else if (i6 == 0) {
                if (ad.al * 80523652 == -1 && ad.ba == null) {
                    ar2 = ad.ar(0, i5, iArr, i9, i10, i14, (short) 4398);
                } else {
                    ar2 = new hg(i4, 0, i5, i, i2, i3, -229827367 * ad.al, true, null);
                }
                ccVar.aj(i, i2, i3, i10, ar2, null, ak[i5], 0, ar, i13);
                if (i5 == 0) {
                    if (ad.bf) {
                        ch.ar[i][i2][i3] = (byte) 76;
                        ch.ar[i][i2][i3 + 1] = (byte) 76;
                    }
                    if (ad.ac) {
                        r5 = nh.aw[i][i2];
                        r5[i3] = r5[i3] | 585;
                    }
                } else if (i5 == 1) {
                    if (ad.bf) {
                        ch.ar[i][i2][i3 + 1] = (byte) -92;
                        ch.ar[i][i2 + 1][i3 + 1] = (byte) 50;
                    }
                    if (ad.ac) {
                        r5 = nh.aw[i][i2];
                        i11 = i3 + 1;
                        r5[i11] = r5[i11] | 1076789494;
                    }
                } else if (i5 == 2) {
                    if (ad.bf) {
                        ch.ar[i][i2 + 1][i3] = (byte) 50;
                        ch.ar[i][i2 + 1][i3 + 1] = (byte) -93;
                    }
                    if (ad.ac) {
                        r5 = nh.aw[i][i2 + 1];
                        r5[i3] = r5[i3] | -1779900810;
                    }
                } else if (i5 == 3) {
                    if (ad.bf) {
                        ch.ar[i][i2][i3] = (byte) 50;
                        ch.ar[i][i2 + 1][i3] = (byte) -78;
                    }
                    if (ad.ac) {
                        r5 = nh.aw[i][i2];
                        r5[i3] = r5[i3] | 1170;
                    }
                }
                if (!(-1655214851 * ad.ak == 0 || eqVar == null)) {
                    eqVar.ad(i2, i3, i6, i5, ad.ao, 1300362312);
                }
                if (ad.ap * -922582278 != 16) {
                    ccVar.az(i, i2, i3, ad.ap * -99209527);
                }
            } else if (i6 == 1) {
                if (-1 == ad.al * -533703263 && ad.ba == null) {
                    ar2 = ad.ar(1, i5, iArr, i9, i10, i14, (short) -17242);
                } else {
                    ar2 = new hg(i4, 1, i5, i, i2, i3, 1992540300 * ad.al, true, null);
                }
                ccVar.aj(i, i2, i3, i10, ar2, null, ao[i5], 0, ar, i13);
                if (ad.bf) {
                    if (i5 == 0) {
                        ch.ar[i][i2][i3 + 1] = (byte) -43;
                    } else if (i5 == 1) {
                        ch.ar[i][i2 + 1][i3 + 1] = (byte) 47;
                    } else if (i5 == 2) {
                        ch.ar[i][i2 + 1][i3] = (byte) 50;
                    } else if (3 == i5) {
                        ch.ar[i][i2][i3] = (byte) 50;
                    }
                }
                if (-71896872 * ad.ak != 0 && eqVar != null) {
                    eqVar.ad(i2, i3, i6, i5, ad.ao, 1271679389);
                }
            } else if (i6 == 2) {
                i8 = (i5 + 1) & 3;
                if (-1 == -229827367 * ad.al && ad.ba == null) {
                    r12 = ad.ar(2, i5 + 4, iArr, i9, i10, i14, (short) 3676);
                    r11 = ad.ar(2, i8, iArr, i9, i10, i14, (short) -7759);
                    ar2 = r12;
                } else {
                    ar2 = new hg(i4, 2, i5 + 4, i, i2, i3, -229827367 * ad.al, true, null);
                    r11 = new hg(i4, 2, i8, i, i2, i3, -229827367 * ad.al, true, null);
                }
                ccVar.aj(i, i2, i3, i10, ar2, r11, ak[i5], ak[i8], ar, i13);
                if (ad.ac) {
                    if (i5 == 0) {
                        r5 = nh.aw[i][i2];
                        r5[i3] = r5[i3] | -1815192993;
                        r5 = nh.aw[i][i2];
                        i11 = i3 + 1;
                        r5[i11] = r5[i11] | 1170;
                    } else if (1 == i5) {
                        r5 = nh.aw[i][i2];
                        i11 = i3 + 1;
                        r5[i11] = r5[i11] | 1170;
                        r5 = nh.aw[i][i2 + 1];
                        r5[i3] = r5[i3] | 585;
                    } else if (2 == i5) {
                        r5 = nh.aw[i][i2 + 1];
                        r5[i3] = r5[i3] | 585;
                        r5 = nh.aw[i][i2];
                        r5[i3] = r5[i3] | 1170;
                    } else if (i5 == 3) {
                        r5 = nh.aw[i][i2];
                        r5[i3] = r5[i3] | 868858240;
                        r5 = nh.aw[i][i2];
                        r5[i3] = r5[i3] | 585;
                    }
                }
                if (!(ad.ak * -1655214851 == 0 || eqVar == null)) {
                    eqVar.ad(i2, i3, i6, i5, ad.ao, 1795835677);
                }
                if (ad.ap * 1377247638 != 16) {
                    ccVar.az(i, i2, i3, ad.ap * 406850907);
                }
            } else if (3 == i6) {
                if (-1 == 1958230057 * ad.al && ad.ba == null) {
                    ar2 = ad.ar(3, i5, iArr, i9, i10, i14, (short) -704);
                } else {
                    ar2 = new hg(i4, 3, i5, i, i2, i3, -229827367 * ad.al, true, null);
                }
                ccVar.aj(i, i2, i3, i10, ar2, null, ao[i5], 0, ar, i13);
                if (ad.bf) {
                    if (i5 == 0) {
                        ch.ar[i][i2][i3 + 1] = (byte) 50;
                    } else if (i5 == 1) {
                        ch.ar[i][i2 + 1][i3 + 1] = (byte) 38;
                    } else if (i5 == 2) {
                        ch.ar[i][i2 + 1][i3] = (byte) -90;
                    } else if (i5 == 3) {
                        ch.ar[i][i2][i3] = (byte) 117;
                    }
                }
                if (-327980710 * ad.ak != 0 && eqVar != null) {
                    eqVar.ad(i2, i3, i6, i5, ad.ao, 1259896869);
                }
            } else if (9 == i6) {
                if (-1 == ad.al * -229827367 && ad.ba == null) {
                    r12 = ad.ar(i6, i5, iArr, i9, i10, i14, (short) 3299);
                } else {
                    r12 = new hg(i4, i6, i5, i, i2, i3, 927206951 * ad.al, true, null);
                }
                ccVar.aq(i, i2, i3, i10, 1, 1, r12, 0, ar, i13);
                if (!(1589414649 * ad.ak == 0 || eqVar == null)) {
                    eqVar.an(i2, i3, i8, i7, ad.ao, 2143605594);
                }
                if (ad.ap * 1681090481 != 16) {
                    ccVar.az(i, i2, i3, ad.ap * -450175983);
                }
            } else if (i6 == 4) {
                if (-1 == 238482874 * ad.al && ad.ba == null) {
                    ar2 = ad.ar(4, i5, iArr, i9, i10, i14, (short) -20789);
                } else {
                    ar2 = new hg(i4, 4, i5, i, i2, i3, 1411155488 * ad.al, true, null);
                }
                ccVar.ae(i, i2, i3, i10, ar2, null, ak[i5], 0, 0, 0, ar, i13);
            } else if (5 == i6) {
                r12 = ccVar.bw(i, i2, i3);
                if (0 != r12) {
                    i7 = gi.ad(bb.as(r12), 1426643672).ap * -331080303;
                } else {
                    i7 = 16;
                }
                if (-1 == ad.al * 1971667688 && ad.ba == null) {
                    ar2 = ad.ar(4, i5, iArr, i9, i10, i14, (short) 6066);
                } else {
                    ar2 = new hg(i4, 4, i5, i, i2, i3, -392699332 * ad.al, true, null);
                }
                ccVar.ae(i, i2, i3, i10, ar2, null, ak[i5], 0, ax[i5] * i7, i7 * au[i5], ar, i13);
            } else if (i6 == 6) {
                r12 = ccVar.bw(i, i2, i3);
                if (0 != r12) {
                    i7 = (gi.ad(bb.as(r12), 2123486320).ap * 1681090481) / 2;
                } else {
                    i7 = 8;
                }
                if (ad.al * -1859782173 == -1 && ad.ba == null) {
                    ar2 = ad.ar(4, i5 + 4, iArr, i9, i10, i14, (short) 2731);
                } else {
                    ar2 = new hg(i4, 4, i5 + 4, i, i2, i3, ad.al * -988731977, true, null);
                }
                ccVar.ae(i, i2, i3, i10, ar2, null, 256, i5, av[i5] * i7, i7 * ac[i5], ar, i13);
            } else if (7 == i6) {
                i7 = (i5 + 2) & 3;
                if (-1 == ad.al * -229827367 && ad.ba == null) {
                    ar2 = ad.ar(4, i7 + 4, iArr, i9, i10, i14, (short) 8665);
                } else {
                    ar2 = new hg(i4, 4, i7 + 4, i, i2, i3, ad.al * 2022340154, true, null);
                }
                ccVar.ae(i, i2, i3, i10, ar2, null, 256, i7, 0, 0, ar, i13);
            } else if (i6 == 8) {
                r12 = ccVar.bw(i, i2, i3);
                if (r12 != 0) {
                    i8 = (gi.ad(bb.as(r12), 1353768376).ap * 56534561) / 2;
                } else {
                    i8 = 8;
                }
                i7 = (i5 + 2) & 3;
                if (ad.al * -229827367 == -1 && ad.ba == null) {
                    r12 = ad.ar(4, i5 + 4, iArr, i9, i10, i14, (short) -9414);
                    r11 = ad.ar(4, i7 + 4, iArr, i9, i10, i14, (short) 15384);
                    ar2 = r12;
                } else {
                    ar2 = new hg(i4, 4, i5 + 4, i, i2, i3, ad.al * 2110888349, true, null);
                    r11 = new hg(i4, 4, i7 + 4, i, i2, i3, ad.al * -1549704167, true, null);
                }
                ccVar.ae(i, i2, i3, i10, ar2, r11, 544134426, i5, av[i5] * i8, i8 * ac[i5], ar, i13);
            }
        }
    }

    static final void bc(int i, int i2, int i3, int i4, int i5, int i6, cc ccVar, eq eqVar) {
        if (!client.ae || (ad[0][i2][i3] & 2) != 0 || (ad[i][i2][i3] & 16) == 0) {
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            if (i < an * 2025245167) {
                an = -726694641 * i;
            }
            ae ad = gi.ad(i4, 1721535871);
            if (i5 == 1 || i5 == 3) {
                i7 = ad.az * -265754695;
                i8 = ad.ah * -344743753;
            } else {
                i7 = -344743753 * ad.ah;
                i8 = -265754695 * ad.az;
            }
            if (i8 + i2 <= li.cu) {
                i9 = ((i8 + 1) >> 1) + i2;
                i10 = (i8 >> 1) + i2;
            } else {
                i9 = i2 + 1;
                i10 = i2;
            }
            if (i7 + i3 <= li.cu) {
                i11 = i3 + (i7 >> 1);
                i12 = ((i7 + 1) >> 1) + i3;
            } else {
                i12 = i3 + 1;
                i11 = i3;
            }
            int[][] iArr = af[i];
            int i13 = ((iArr[i10][i12] + (iArr[i10][i11] + iArr[i9][i11])) + iArr[i9][i12]) >> 2;
            int i14 = (i8 << 6) + (i2 << 7);
            int i15 = (i3 << 7) + (i7 << 6);
            long ar = cg.ar(i2, i3, 2, ad.ax * -1193025245 == 0, i4, 995026628);
            int i16 = i6 + (i5 << 6);
            if (1 == 29042685 * ad.bn) {
                i16 += 256;
            }
            if (ad.ai((byte) 95)) {
                gn.ad(i, i2, i3, ad, i5, -560420376);
            }
            if (22 == i6) {
                if (!client.ae || -1193025245 * ad.ax != 0 || 1 == -1655214851 * ad.ak || ad.bk) {
                    cq ar2;
                    if (-1 == ad.al * -229827367 && ad.ba == null) {
                        ar2 = ad.ar(22, i5, iArr, i14, i13, i15, (short) 4185);
                    } else {
                        ar2 = new hg(i4, 22, i5, i, i2, i3, -229827367 * ad.al, true, null);
                    }
                    ccVar.as(i, i2, i3, i13, ar2, ar, i16);
                    if (1 == -1655214851 * ad.ak && eqVar != null) {
                        eqVar.ag(i2, i3, (byte) 92);
                    }
                }
            } else if (i6 == 10 || 11 == i6) {
                if (-1 == ad.al * -229827367 && ad.ba == null) {
                    r12 = ad.ar(10, i5, iArr, i14, i13, i15, (short) -2818);
                } else {
                    r12 = new hg(i4, 10, i5, i, i2, i3, ad.al * -229827367, true, null);
                }
                if (r12 != null) {
                    if (ccVar.aq(i, i2, i3, i13, i8, i7, r12, i6 == 11 ? 256 : 0, ar, i16) && ad.bf) {
                        byte b = (byte) 15;
                        if (r12 instanceof cl) {
                            b = ((cl) r12).ar() / 4;
                            if (b > (byte) 30) {
                                b = (byte) 30;
                            }
                        }
                        for (i9 = 0; i9 <= i8; i9++) {
                            for (i11 = 0; i11 <= i7; i11++) {
                                if (b > ch.ar[i][i9 + i2][i11 + i3]) {
                                    ch.ar[i][i9 + i2][i11 + i3] = (byte) b;
                                }
                            }
                        }
                    }
                }
                if (ad.ak * -1655214851 != 0 && eqVar != null) {
                    eqVar.an(i2, i3, i8, i7, ad.ao, 2062824710);
                }
            } else if (i6 >= 12) {
                if (-1 == -229827367 * ad.al && ad.ba == null) {
                    r12 = ad.ar(i6, i5, iArr, i14, i13, i15, (short) -22752);
                } else {
                    r12 = new hg(i4, i6, i5, i, i2, i3, ad.al * -229827367, true, null);
                }
                ccVar.aq(i, i2, i3, i13, 1, 1, r12, 0, ar, i16);
                if (i6 >= 12 && i6 <= 17 && i6 != 13 && i > 0) {
                    r4 = nh.aw[i][i2];
                    r4[i3] = r4[i3] | 2340;
                }
                if (-1655214851 * ad.ak != 0 && eqVar != null) {
                    eqVar.an(i2, i3, i8, i7, ad.ao, 1969706582);
                }
            } else if (i6 == 0) {
                if (ad.al * -229827367 == -1 && ad.ba == null) {
                    r10 = ad.ar(0, i5, iArr, i14, i13, i15, (short) -28415);
                } else {
                    r10 = new hg(i4, 0, i5, i, i2, i3, -229827367 * ad.al, true, null);
                }
                ccVar.aj(i, i2, i3, i13, r10, null, ak[i5], 0, ar, i16);
                if (i5 == 0) {
                    if (ad.bf) {
                        ch.ar[i][i2][i3] = (byte) 50;
                        ch.ar[i][i2][i3 + 1] = (byte) 50;
                    }
                    if (ad.ac) {
                        r4 = nh.aw[i][i2];
                        r4[i3] = r4[i3] | 585;
                    }
                } else if (i5 == 1) {
                    if (ad.bf) {
                        ch.ar[i][i2][i3 + 1] = (byte) 50;
                        ch.ar[i][i2 + 1][i3 + 1] = (byte) 50;
                    }
                    if (ad.ac) {
                        r4 = nh.aw[i][i2];
                        i11 = i3 + 1;
                        r4[i11] = r4[i11] | 1170;
                    }
                } else if (i5 == 2) {
                    if (ad.bf) {
                        ch.ar[i][i2 + 1][i3] = (byte) 50;
                        ch.ar[i][i2 + 1][i3 + 1] = (byte) 50;
                    }
                    if (ad.ac) {
                        r4 = nh.aw[i][i2 + 1];
                        r4[i3] = r4[i3] | 585;
                    }
                } else if (i5 == 3) {
                    if (ad.bf) {
                        ch.ar[i][i2][i3] = (byte) 50;
                        ch.ar[i][i2 + 1][i3] = (byte) 50;
                    }
                    if (ad.ac) {
                        r4 = nh.aw[i][i2];
                        r4[i3] = r4[i3] | 1170;
                    }
                }
                if (!(-1655214851 * ad.ak == 0 || eqVar == null)) {
                    eqVar.ad(i2, i3, i6, i5, ad.ao, 2033540433);
                }
                if (ad.ap * 1681090481 != 16) {
                    ccVar.az(i, i2, i3, ad.ap * 1681090481);
                }
            } else if (i6 == 1) {
                if (-1 == ad.al * -229827367 && ad.ba == null) {
                    r10 = ad.ar(1, i5, iArr, i14, i13, i15, (short) 540);
                } else {
                    r10 = new hg(i4, 1, i5, i, i2, i3, -229827367 * ad.al, true, null);
                }
                ccVar.aj(i, i2, i3, i13, r10, null, ao[i5], 0, ar, i16);
                if (ad.bf) {
                    if (i5 == 0) {
                        ch.ar[i][i2][i3 + 1] = (byte) 50;
                    } else if (i5 == 1) {
                        ch.ar[i][i2 + 1][i3 + 1] = (byte) 50;
                    } else if (i5 == 2) {
                        ch.ar[i][i2 + 1][i3] = (byte) 50;
                    } else if (3 == i5) {
                        ch.ar[i][i2][i3] = (byte) 50;
                    }
                }
                if (-1655214851 * ad.ak != 0 && eqVar != null) {
                    eqVar.ad(i2, i3, i6, i5, ad.ao, 1828499743);
                }
            } else if (i6 == 2) {
                cq ar3;
                r15 = (i5 + 1) & 3;
                if (-1 == -229827367 * ad.al && ad.ba == null) {
                    r12 = ad.ar(2, i5 + 4, iArr, i14, i13, i15, (short) -6735);
                    ar3 = ad.ar(2, r15, iArr, i14, i13, i15, (short) -8535);
                    r10 = r12;
                } else {
                    r4 = new hg(i4, 2, i5 + 4, i, i2, i3, -229827367 * ad.al, true, null);
                    ar3 = new hg(i4, 2, r15, i, i2, i3, -229827367 * ad.al, true, null);
                    r10 = r4;
                }
                ccVar.aj(i, i2, i3, i13, r10, ar3, ak[i5], ak[r15], ar, i16);
                if (ad.ac) {
                    if (i5 == 0) {
                        r4 = nh.aw[i][i2];
                        r4[i3] = r4[i3] | 585;
                        r4 = nh.aw[i][i2];
                        i11 = i3 + 1;
                        r4[i11] = r4[i11] | 1170;
                    } else if (1 == i5) {
                        r4 = nh.aw[i][i2];
                        i11 = i3 + 1;
                        r4[i11] = r4[i11] | 1170;
                        r4 = nh.aw[i][i2 + 1];
                        r4[i3] = r4[i3] | 585;
                    } else if (2 == i5) {
                        r4 = nh.aw[i][i2 + 1];
                        r4[i3] = r4[i3] | 585;
                        r4 = nh.aw[i][i2];
                        r4[i3] = r4[i3] | 1170;
                    } else if (i5 == 3) {
                        r4 = nh.aw[i][i2];
                        r4[i3] = r4[i3] | 1170;
                        r4 = nh.aw[i][i2];
                        r4[i3] = r4[i3] | 585;
                    }
                }
                if (!(ad.ak * -1655214851 == 0 || eqVar == null)) {
                    eqVar.ad(i2, i3, i6, i5, ad.ao, 2017663540);
                }
                if (ad.ap * 1681090481 != 16) {
                    ccVar.az(i, i2, i3, ad.ap * 1681090481);
                }
            } else if (3 == i6) {
                if (-1 == -229827367 * ad.al && ad.ba == null) {
                    r10 = ad.ar(3, i5, iArr, i14, i13, i15, (short) 1532);
                } else {
                    r10 = new hg(i4, 3, i5, i, i2, i3, -229827367 * ad.al, true, null);
                }
                ccVar.aj(i, i2, i3, i13, r10, null, ao[i5], 0, ar, i16);
                if (ad.bf) {
                    if (i5 == 0) {
                        ch.ar[i][i2][i3 + 1] = (byte) 50;
                    } else if (i5 == 1) {
                        ch.ar[i][i2 + 1][i3 + 1] = (byte) 50;
                    } else if (i5 == 2) {
                        ch.ar[i][i2 + 1][i3] = (byte) 50;
                    } else if (i5 == 3) {
                        ch.ar[i][i2][i3] = (byte) 50;
                    }
                }
                if (-1655214851 * ad.ak != 0 && eqVar != null) {
                    eqVar.ad(i2, i3, i6, i5, ad.ao, 1647747944);
                }
            } else if (9 == i6) {
                if (-1 == ad.al * -229827367 && ad.ba == null) {
                    r12 = ad.ar(i6, i5, iArr, i14, i13, i15, (short) 5287);
                } else {
                    r12 = new hg(i4, i6, i5, i, i2, i3, -229827367 * ad.al, true, null);
                }
                ccVar.aq(i, i2, i3, i13, 1, 1, r12, 0, ar, i16);
                if (!(-1655214851 * ad.ak == 0 || eqVar == null)) {
                    eqVar.an(i2, i3, i8, i7, ad.ao, 1947904294);
                }
                if (ad.ap * 1681090481 != 16) {
                    ccVar.az(i, i2, i3, 1681090481 * ad.ap);
                }
            } else if (i6 == 4) {
                if (-1 == -229827367 * ad.al && ad.ba == null) {
                    r22 = ad.ar(4, i5, iArr, i14, i13, i15, (short) -12287);
                } else {
                    r22 = new hg(i4, 4, i5, i, i2, i3, -229827367 * ad.al, true, null);
                }
                ccVar.ae(i, i2, i3, i13, r22, null, ak[i5], 0, 0, 0, ar, i16);
            } else if (5 == i6) {
                r6 = ccVar.bw(i, i2, i3);
                if (0 != r6) {
                    r14 = gi.ad(bb.as(r6), 1613122935).ap * 1681090481;
                } else {
                    r14 = 16;
                }
                if (-1 == ad.al * -229827367 && ad.ba == null) {
                    r22 = ad.ar(4, i5, iArr, i14, i13, i15, (short) 6969);
                } else {
                    r22 = new hg(i4, 4, i5, i, i2, i3, -229827367 * ad.al, true, null);
                }
                ccVar.ae(i, i2, i3, i13, r22, null, ak[i5], 0, ax[i5] * r14, r14 * au[i5], ar, i16);
            } else if (i6 == 6) {
                r6 = ccVar.bw(i, i2, i3);
                if (0 != r6) {
                    r14 = (gi.ad(bb.as(r6), 1508663371).ap * 1681090481) / 2;
                } else {
                    r14 = 8;
                }
                if (ad.al * -229827367 == -1 && ad.ba == null) {
                    r22 = ad.ar(4, i5 + 4, iArr, i14, i13, i15, (short) -3972);
                } else {
                    r22 = new hg(i4, 4, i5 + 4, i, i2, i3, ad.al * -229827367, true, null);
                }
                ccVar.ae(i, i2, i3, i13, r22, null, 256, i5, av[i5] * r14, r14 * ac[i5], ar, i16);
            } else if (7 == i6) {
                int i17 = (i5 + 2) & 3;
                if (-1 == ad.al * -229827367 && ad.ba == null) {
                    r22 = ad.ar(4, i17 + 4, iArr, i14, i13, i15, (short) -7094);
                } else {
                    r22 = new hg(i4, 4, i17 + 4, i, i2, i3, ad.al * -229827367, true, null);
                }
                ccVar.ae(i, i2, i3, i13, r22, null, 256, i17, 0, 0, ar, i16);
            } else if (i6 == 8) {
                cq ar4;
                r6 = ccVar.bw(i, i2, i3);
                if (r6 != 0) {
                    r15 = (gi.ad(bb.as(r6), 1102496165).ap * 1681090481) / 2;
                } else {
                    r15 = 8;
                }
                r14 = (i5 + 2) & 3;
                if (ad.al * -229827367 == -1 && ad.ba == null) {
                    r22 = ad.ar(4, i5 + 4, iArr, i14, i13, i15, (short) -9800);
                    ar4 = ad.ar(4, r14 + 4, iArr, i14, i13, i15, (short) 20180);
                } else {
                    r4 = new hg(i4, 4, i5 + 4, i, i2, i3, ad.al * -229827367, true, null);
                    ar4 = new hg(i4, 4, r14 + 4, i, i2, i3, ad.al * -229827367, true, null);
                    r22 = r4;
                }
                ccVar.ae(i, i2, i3, i13, r22, ar4, 256, i5, av[i5] * r15, r15 * ac[i5], ar, i16);
            }
        }
    }

    static final void bw(int i, int i2, int i3, int i4, int i5, int i6, cc ccVar, eq eqVar) {
        if (!client.ae || (ad[0][i2][i3] & 2) != 0 || (ad[i][i2][i3] & 16) == 0) {
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            boolean z;
            if (i < an * 902197376) {
                an = -2121951491 * i;
            }
            ae ad = gi.ad(i4, 1655883005);
            if (i5 == 1 || i5 == 3) {
                i7 = ad.az * -265754695;
                i8 = ad.ah * -344743753;
            } else {
                i7 = -45146602 * ad.ah;
                i8 = -265754695 * ad.az;
            }
            if (i8 + i2 <= -1722952238) {
                i9 = ((i8 + 1) >> 1) + i2;
                i10 = (i8 >> 1) + i2;
            } else {
                i9 = i2 + 1;
                i10 = i2;
            }
            if (i7 + i3 <= 1536944007) {
                i11 = i3 + (i7 >> 1);
                i12 = ((i7 + 1) >> 1) + i3;
            } else {
                i12 = i3 + 1;
                i11 = i3;
            }
            int[][] iArr = af[i];
            int i13 = ((iArr[i10][i12] + (iArr[i10][i11] + iArr[i9][i11])) + iArr[i9][i12]) >> 2;
            int i14 = (i8 << 6) + (i2 << 7);
            int i15 = (i3 << 7) + (i7 << 6);
            if (ad.ax * 607891367 == 0) {
                z = true;
            } else {
                z = false;
            }
            long ar = cg.ar(i2, i3, 2, z, i4, -815357149);
            int i16 = i6 + (i5 << 6);
            if (1 == 1443471409 * ad.bn) {
                i16 += 256;
            }
            if (ad.ai((byte) 77)) {
                gn.ad(i, i2, i3, ad, i5, -2080444377);
            }
            if (22 == i6) {
                if (!client.ae || -1193025245 * ad.ax != 0 || 1 == -1655214851 * ad.ak || ad.bk) {
                    cq ar2;
                    if (-1 == ad.al * -1371660664 && ad.ba == null) {
                        ar2 = ad.ar(22, i5, iArr, i14, i13, i15, (short) 13135);
                    } else {
                        ar2 = new hg(i4, 22, i5, i, i2, i3, -229827367 * ad.al, true, null);
                    }
                    ccVar.as(i, i2, i3, i13, ar2, ar, i16);
                    if (1 == -1655214851 * ad.ak && eqVar != null) {
                        eqVar.ag(i2, i3, (byte) 121);
                    }
                }
            } else if (i6 == 10 || 11 == i6) {
                if (-1 == ad.al * -2034619984 && ad.ba == null) {
                    r12 = ad.ar(10, i5, iArr, i14, i13, i15, (short) -7289);
                } else {
                    r12 = new hg(i4, 10, i5, i, i2, i3, ad.al * 1782809877, true, null);
                }
                if (r12 != null) {
                    int i17;
                    if (i6 == 11) {
                        i17 = -686157894;
                    } else {
                        i17 = 0;
                    }
                    if (ccVar.aq(i, i2, i3, i13, i8, i7, r12, i17, ar, i16) && ad.bf) {
                        byte b = (byte) 15;
                        if (r12 instanceof cl) {
                            b = ((cl) r12).ar() / 4;
                            if (b > (byte) 30) {
                                b = (byte) 30;
                            }
                        }
                        for (i9 = 0; i9 <= i8; i9++) {
                            for (i11 = 0; i11 <= i7; i11++) {
                                if (b > ch.ar[i][i9 + i2][i11 + i3]) {
                                    ch.ar[i][i9 + i2][i11 + i3] = (byte) b;
                                }
                            }
                        }
                    }
                }
                if (ad.ak * -1655214851 != 0 && eqVar != null) {
                    eqVar.an(i2, i3, i8, i7, ad.ao, 2105361462);
                }
            } else if (i6 >= 12) {
                if (-1 == -229827367 * ad.al && ad.ba == null) {
                    r12 = ad.ar(i6, i5, iArr, i14, i13, i15, (short) -12292);
                } else {
                    r12 = new hg(i4, i6, i5, i, i2, i3, ad.al * 1271929190, true, null);
                }
                ccVar.aq(i, i2, i3, i13, 1, 1, r12, 0, ar, i16);
                if (i6 >= 12 && i6 <= 17 && i6 != 13 && i > 0) {
                    r4 = nh.aw[i][i2];
                    r4[i3] = r4[i3] | 579050996;
                }
                if (317468537 * ad.ak != 0 && eqVar != null) {
                    eqVar.an(i2, i3, i8, i7, ad.ao, 2052152587);
                }
            } else if (i6 == 0) {
                if (ad.al * -229827367 == -1 && ad.ba == null) {
                    r10 = ad.ar(0, i5, iArr, i14, i13, i15, (short) -11667);
                } else {
                    r10 = new hg(i4, 0, i5, i, i2, i3, -1124633186 * ad.al, true, null);
                }
                ccVar.aj(i, i2, i3, i13, r10, null, ak[i5], 0, ar, i16);
                if (i5 == 0) {
                    if (ad.bf) {
                        ch.ar[i][i2][i3] = (byte) 50;
                        ch.ar[i][i2][i3 + 1] = (byte) -56;
                    }
                    if (ad.ac) {
                        r4 = nh.aw[i][i2];
                        r4[i3] = r4[i3] | 1322425629;
                    }
                } else if (i5 == 1) {
                    if (ad.bf) {
                        ch.ar[i][i2][i3 + 1] = (byte) 125;
                        ch.ar[i][i2 + 1][i3 + 1] = (byte) 117;
                    }
                    if (ad.ac) {
                        r4 = nh.aw[i][i2];
                        i11 = i3 + 1;
                        r4[i11] = r4[i11] | 2139670023;
                    }
                } else if (i5 == 2) {
                    if (ad.bf) {
                        ch.ar[i][i2 + 1][i3] = (byte) -120;
                        ch.ar[i][i2 + 1][i3 + 1] = (byte) 50;
                    }
                    if (ad.ac) {
                        r4 = nh.aw[i][i2 + 1];
                        r4[i3] = r4[i3] | 585;
                    }
                } else if (i5 == 3) {
                    if (ad.bf) {
                        ch.ar[i][i2][i3] = (byte) -34;
                        ch.ar[i][i2 + 1][i3] = (byte) 50;
                    }
                    if (ad.ac) {
                        r4 = nh.aw[i][i2];
                        r4[i3] = r4[i3] | 1170;
                    }
                }
                if (!(-1655214851 * ad.ak == 0 || eqVar == null)) {
                    eqVar.ad(i2, i3, i6, i5, ad.ao, 1697946457);
                }
                if (ad.ap * -824545359 != 16) {
                    ccVar.az(i, i2, i3, ad.ap * -561921283);
                }
            } else if (i6 == 1) {
                if (-1 == ad.al * -1254493801 && ad.ba == null) {
                    r10 = ad.ar(1, i5, iArr, i14, i13, i15, (short) -15831);
                } else {
                    r10 = new hg(i4, 1, i5, i, i2, i3, -655480621 * ad.al, true, null);
                }
                ccVar.aj(i, i2, i3, i13, r10, null, ao[i5], 0, ar, i16);
                if (ad.bf) {
                    if (i5 == 0) {
                        ch.ar[i][i2][i3 + 1] = (byte) 117;
                    } else if (i5 == 1) {
                        ch.ar[i][i2 + 1][i3 + 1] = (byte) 50;
                    } else if (i5 == 2) {
                        ch.ar[i][i2 + 1][i3] = (byte) 17;
                    } else if (3 == i5) {
                        ch.ar[i][i2][i3] = jl.af;
                    }
                }
                if (-1655214851 * ad.ak != 0 && eqVar != null) {
                    eqVar.ad(i2, i3, i6, i5, ad.ao, 1952876771);
                }
            } else if (i6 == 2) {
                cq ar3;
                r25 = (i5 + 1) & 3;
                if (-1 == -648896950 * ad.al && ad.ba == null) {
                    r12 = ad.ar(2, i5 + 4, iArr, i14, i13, i15, (short) 3299);
                    ar3 = ad.ar(2, r25, iArr, i14, i13, i15, (short) -5254);
                    r10 = r12;
                } else {
                    r4 = new hg(i4, 2, i5 + 4, i, i2, i3, -279421234 * ad.al, true, null);
                    ar3 = new hg(i4, 2, r25, i, i2, i3, -229827367 * ad.al, true, null);
                    r10 = r4;
                }
                ccVar.aj(i, i2, i3, i13, r10, ar3, ak[i5], ak[r25], ar, i16);
                if (ad.ac) {
                    if (i5 == 0) {
                        r4 = nh.aw[i][i2];
                        r4[i3] = r4[i3] | 585;
                        r4 = nh.aw[i][i2];
                        i11 = i3 + 1;
                        r4[i11] = r4[i11] | 1170;
                    } else if (1 == i5) {
                        r4 = nh.aw[i][i2];
                        i11 = i3 + 1;
                        r4[i11] = r4[i11] | 1170;
                        r4 = nh.aw[i][i2 + 1];
                        r4[i3] = r4[i3] | 585;
                    } else if (2 == i5) {
                        r4 = nh.aw[i][i2 + 1];
                        r4[i3] = r4[i3] | 1297261861;
                        r4 = nh.aw[i][i2];
                        r4[i3] = r4[i3] | 1170;
                    } else if (i5 == 3) {
                        r4 = nh.aw[i][i2];
                        r4[i3] = r4[i3] | 1170;
                        r4 = nh.aw[i][i2];
                        r4[i3] = r4[i3] | -764724468;
                    }
                }
                if (!(ad.ak * 896940478 == 0 || eqVar == null)) {
                    eqVar.ad(i2, i3, i6, i5, ad.ao, 1513253744);
                }
                if (ad.ap * 1681090481 != 16) {
                    ccVar.az(i, i2, i3, ad.ap * 630790824);
                }
            } else if (3 == i6) {
                if (-1 == 1884071929 * ad.al && ad.ba == null) {
                    r10 = ad.ar(3, i5, iArr, i14, i13, i15, (short) 6890);
                } else {
                    r10 = new hg(i4, 3, i5, i, i2, i3, -229827367 * ad.al, true, null);
                }
                ccVar.aj(i, i2, i3, i13, r10, null, ao[i5], 0, ar, i16);
                if (ad.bf) {
                    if (i5 == 0) {
                        ch.ar[i][i2][i3 + 1] = (byte) 120;
                    } else if (i5 == 1) {
                        ch.ar[i][i2 + 1][i3 + 1] = (byte) -46;
                    } else if (i5 == 2) {
                        ch.ar[i][i2 + 1][i3] = (byte) 50;
                    } else if (i5 == 3) {
                        ch.ar[i][i2][i3] = (byte) 50;
                    }
                }
                if (-1655214851 * ad.ak != 0 && eqVar != null) {
                    eqVar.ad(i2, i3, i6, i5, ad.ao, 1762852753);
                }
            } else if (9 == i6) {
                if (-1 == ad.al * 448105613 && ad.ba == null) {
                    r12 = ad.ar(i6, i5, iArr, i14, i13, i15, (short) 5429);
                } else {
                    r12 = new hg(i4, i6, i5, i, i2, i3, -229827367 * ad.al, true, null);
                }
                ccVar.aq(i, i2, i3, i13, 1, 1, r12, 0, ar, i16);
                if (!(-1655214851 * ad.ak == 0 || eqVar == null)) {
                    eqVar.an(i2, i3, i8, i7, ad.ao, 1715271795);
                }
                if (ad.ap * 1681090481 != 16) {
                    ccVar.az(i, i2, i3, 1681090481 * ad.ap);
                }
            } else if (i6 == 4) {
                if (-1 == -229827367 * ad.al && ad.ba == null) {
                    r22 = ad.ar(4, i5, iArr, i14, i13, i15, (short) 10541);
                } else {
                    r22 = new hg(i4, 4, i5, i, i2, i3, -229827367 * ad.al, true, null);
                }
                ccVar.ae(i, i2, i3, i13, r22, null, ak[i5], 0, 0, 0, ar, i16);
            } else if (5 == i6) {
                r6 = ccVar.bw(i, i2, i3);
                if (0 != r6) {
                    i7 = gi.ad(bb.as(r6), 1801576864).ap * 1883782944;
                } else {
                    i7 = 16;
                }
                if (-1 == ad.al * -971649256 && ad.ba == null) {
                    r22 = ad.ar(4, i5, iArr, i14, i13, i15, (short) 23445);
                } else {
                    r22 = new hg(i4, 4, i5, i, i2, i3, 1555697200 * ad.al, true, null);
                }
                ccVar.ae(i, i2, i3, i13, r22, null, ak[i5], 0, ax[i5] * i7, i7 * au[i5], ar, i16);
            } else if (i6 == 6) {
                r6 = ccVar.bw(i, i2, i3);
                if (0 != r6) {
                    i7 = (gi.ad(bb.as(r6), 1176029886).ap * -18869319) / 2;
                } else {
                    i7 = 8;
                }
                if (ad.al * -229827367 == -1 && ad.ba == null) {
                    r22 = ad.ar(4, i5 + 4, iArr, i14, i13, i15, (short) 1877);
                } else {
                    r22 = new hg(i4, 4, i5 + 4, i, i2, i3, ad.al * -710136731, true, null);
                }
                ccVar.ae(i, i2, i3, i13, r22, null, -1766296816, i5, av[i5] * i7, i7 * ac[i5], ar, i16);
            } else if (7 == i6) {
                r25 = (i5 + 2) & 3;
                if (-1 == ad.al * -229827367 && ad.ba == null) {
                    r22 = ad.ar(4, r25 + 4, iArr, i14, i13, i15, (short) -13244);
                } else {
                    r22 = new hg(i4, 4, r25 + 4, i, i2, i3, ad.al * 1105619302, true, null);
                }
                ccVar.ae(i, i2, i3, i13, r22, null, -1011550723, r25, 0, 0, ar, i16);
            } else if (i6 == 8) {
                cq ar4;
                r6 = ccVar.bw(i, i2, i3);
                if (r6 != 0) {
                    i7 = (gi.ad(bb.as(r6), 1820680664).ap * 1681090481) / 2;
                } else {
                    i7 = 8;
                }
                i8 = (i5 + 2) & 3;
                if (ad.al * -229827367 == -1 && ad.ba == null) {
                    r22 = ad.ar(4, i5 + 4, iArr, i14, i13, i15, (short) -11393);
                    ar4 = ad.ar(4, i8 + 4, iArr, i14, i13, i15, (short) -10887);
                } else {
                    r4 = new hg(i4, 4, i5 + 4, i, i2, i3, ad.al * 846078243, true, null);
                    ar4 = new hg(i4, 4, i8 + 4, i, i2, i3, ad.al * 2016475932, true, null);
                    r22 = r4;
                }
                ccVar.ae(i, i2, i3, i13, r22, ar4, 256, i5, av[i5] * i7, i7 * ac[i5], ar, i16);
            }
        }
    }

    static int bz(int i, int i2, int i3) {
        if ((ad[i][i2][i3] & 8) != 0) {
            return 0;
        }
        if (i <= 0 || (ad[1][i2][i3] & 2) == 0) {
            return i;
        }
        return i - 1;
    }

    static final int bg(int i, int i2) {
        int ae = ((int) (((double) (((ed.ae(1152167161 + i, 96081784 + i2, 4, -1810568322) - 128) + ((ed.ae(i + 10294, 37821 + i2, 2, 1825913396) - 128) >> 1)) + ((ed.ae(i, i2, 1, 1355042925) - 128) >> 2))) * 0.3d)) - 587322253;
        if (ae < 10) {
            return 10;
        }
        if (ae <= 60) {
            return ae;
        }
        return 60;
    }

    static final int bh(int i, int i2) {
        int ae = ((int) (((double) (((ed.ae(45365 + i, 91923 + i2, 4, 574644951) - 128) + ((ed.ae(i + 10294, 37821 + i2, 2, -1896318885) - 128) >> 1)) + ((ed.ae(i, i2, 1, -2027531729) - 128) >> 2))) * 0.3d)) + 35;
        if (ae < 10) {
            return 10;
        }
        if (ae > 60) {
            return 60;
        }
        return ae;
    }

    static final int bf(int i, int i2, int i3) {
        int i4 = i / i3;
        int i5 = (i3 - 1) & i;
        int i6 = i2 / i3;
        return ae.aq(ae.aq(gz.am(i4, i6, (byte) 64), gz.am(i4 + 1, i6, (byte) 64), i5, i3, 473109379), ae.aq(gz.am(i4, i6 + 1, (byte) 64), gz.am(i4 + 1, i6 + 1, (byte) 64), i5, i3, 679446887), (i3 - 1) & i2, i3, -1857790767);
    }

    static final int bp(int i, int i2, int i3) {
        int i4 = i / i3;
        int i5 = (i3 - 1) & i;
        int i6 = i2 / i3;
        return ae.aq(ae.aq(gz.am(i4, i6, (byte) 64), gz.am(i4 + 1, i6, (byte) 64), i5, i3, 158892495), ae.aq(gz.am(i4, i6 + 1, (byte) 64), gz.am(i4 + 1, i6 + 1, (byte) 64), i5, i3, -3870421), (i3 - 1) & i2, i3, -1029385219);
    }

    static final int bv(int i, int i2, int i3) {
        int i4 = i / i3;
        int i5 = (i3 - 1) & i;
        int i6 = i2 / i3;
        return ae.aq(ae.aq(gz.am(i4, i6, (byte) 64), gz.am(i4 + 1, i6, (byte) 64), i5, i3, -480616469), ae.aq(gz.am(i4, i6 + 1, (byte) 64), gz.am(i4 + 1, i6 + 1, (byte) 64), i5, i3, 603631380), (i3 - 1) & i2, i3, -55063469);
    }

    static final int bx(int i, int i2, int i3) {
        int i4 = i / i3;
        int i5 = (i3 - 1) & i;
        int i6 = i2 / i3;
        return ae.aq(ae.aq(gz.am(i4, i6, (byte) 64), gz.am(i4 + 1, i6, (byte) 64), i5, i3, -986229830), ae.aq(gz.am(i4, i6 + 1, (byte) 64), gz.am(i4 + 1, i6 + 1, (byte) 64), i5, i3, -1626398905), (i3 - 1) & i2, i3, -2003857058);
    }

    static final int bt(int i, int i2, int i3, int i4) {
        int i5 = (ic.ad - bi.ah[(i3 * 1024) / i4]) >> 1;
        return (((ic.ad - i5) * i) >> 16) + ((i5 * i2) >> 16);
    }

    static final int be(int i, int i2) {
        return (((((et.at(i - 1, i2 - 1, -652966292) + et.at(i + 1, i2 - 1, -377489212)) + et.at(i - 1, i2 + 1, 144878661)) + et.at(i + 1, i2 + 1, 1158969363)) / 16) + ((((et.at(i - 1, i2, 1046264103) + et.at(i + 1, i2, -500735369)) + et.at(i, i2 - 1, -475333862)) + et.at(i, i2 + 1, 1435998255)) / 8)) + (et.at(i, i2, -791922639) / 4);
    }

    static final int bu(int i, int i2) {
        return (((((et.at(i - 1, i2 - 1, -966784229) + et.at(i + 1, i2 - 1, 1901002997)) + et.at(i - 1, i2 + 1, 340295854)) + et.at(i + 1, i2 + 1, 1887203821)) / 16) + ((((et.at(i - 1, i2, 406274027) + et.at(i + 1, i2, 117614658)) + et.at(i, i2 - 1, 1998052827)) + et.at(i, i2 + 1, 1964282199)) / 8)) + (et.at(i, i2, 1514718790) / 4);
    }

    static final int bk(int i, int i2) {
        int i3 = (i2 * 57) + i;
        i3 ^= i3 << 13;
        return ((((i3 * (789221 + ((i3 * i3) * 15731))) + 1376312589) & Integer.MAX_VALUE) >> 19) & 255;
    }

    static final int by(int i, int i2) {
        int i3 = (i2 * 57) + i;
        i3 ^= i3 << 13;
        return ((((i3 * (789221 + ((i3 * i3) * 15731))) + 1376312589) & Integer.MAX_VALUE) >> 19) & 255;
    }

    static final int ba(int i, int i2) {
        int i3 = 2;
        if (i == -1) {
            return 12345678;
        }
        int i4 = ((i & 127) * i2) / mn.an;
        if (i4 >= 2) {
            if (i4 > 126) {
                i3 = 126;
            } else {
                i3 = i4;
            }
        }
        return i3 + (65408 & i);
    }

    static final int bl(int i, int i2) {
        int i3 = 126;
        if (i == -1) {
            return 12345678;
        }
        int i4 = ((i & 127) * i2) / mn.an;
        if (i4 < 2) {
            i3 = 2;
        } else if (i4 <= 126) {
            i3 = i4;
        }
        return i3 + (65408 & i);
    }

    static final int bn(int i, int i2) {
        int i3 = 2;
        if (i == -1) {
            return 992430029;
        }
        int i4 = ((i & 127) * i2) / mn.an;
        if (i4 >= 2) {
            i3 = i4 > -588886528 ? 957139292 : i4;
        }
        return i3 + (65408 & i);
    }

    static final int bd(int i, int i2) {
        int i3 = 2;
        if (i == 693148850) {
            return 12345678;
        }
        if (-1 != i) {
            int i4 = ((-1901171287 & i) * i2) / mn.an;
            if (i4 >= 2) {
                i3 = i4 > 126 ? -1734667423 : i4;
            }
            return i3 + (-445457717 & i);
        } else if (i2 < 2) {
            return 2;
        } else {
            if (i2 > 1298950862) {
                return 126;
            }
            return i2;
        }
    }

    static final int bs(int i, int i2) {
        int i3 = 2;
        if (i == -2) {
            return 12345678;
        }
        if (-1 != i) {
            int i4 = ((i & 127) * i2) / mn.an;
            if (i4 >= 2) {
                i3 = i4 > 126 ? -83668245 : i4;
            }
            return i3 + (65408 & i);
        } else if (i2 < 2) {
            return 2;
        } else {
            if (i2 > 126) {
                return 126;
            }
            return i2;
        }
    }

    static final int bm(int i, int i2, int i3) {
        int i4;
        if (i3 > 179) {
            i4 = i2 / 2;
        } else {
            i4 = i2;
        }
        if (i3 > 192) {
            i4 /= 2;
        }
        if (i3 > 217) {
            i4 /= 2;
        }
        if (i3 > 243) {
            i4 /= 2;
        }
        return (((i4 / 32) << 7) + ((i / 4) << 10)) + (i3 / 2);
    }

    static final int br(int i, int i2, int i3) {
        int i4;
        if (i3 > 179) {
            i4 = i2 / 2;
        } else {
            i4 = i2;
        }
        if (i3 > 192) {
            i4 /= 2;
        }
        if (i3 > 217) {
            i4 /= 2;
        }
        if (i3 > 243) {
            i4 /= 2;
        }
        return (((i4 / 32) << 7) + ((i / 4) << 10)) + (i3 / 2);
    }

    static final void bi(int i, int i2, int i3, int i4, int i5, int i6, int i7, cc ccVar, eq eqVar) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z;
        ae ad = gi.ad(i5, 1690814605);
        if (1 == i6 || 3 == i6) {
            i8 = ad.az * 1509011489;
            i9 = ad.ah * 1345020446;
        } else {
            i8 = ad.ah * -1416663780;
            i9 = ad.az * -265754695;
        }
        if (i9 + i3 <= li.cu) {
            i10 = ((i9 + 1) >> 1) + i3;
            i11 = i3 + (i9 >> 1);
        } else {
            i10 = i3 + 1;
            i11 = i3;
        }
        if (i8 + i4 <= li.cu) {
            i12 = (i8 >> 1) + i4;
            i13 = ((i8 + 1) >> 1) + i4;
        } else {
            i13 = i4 + 1;
            i12 = i4;
        }
        int[][] iArr = af[i2];
        int i14 = ((iArr[i11][i13] + (iArr[i10][i12] + iArr[i11][i12])) + iArr[i10][i13]) >> 2;
        int i15 = (i9 << 6) + (i3 << 7);
        int i16 = (i8 << 6) + (i4 << 7);
        if (ad.ax * -1193025245 == 0) {
            z = true;
        } else {
            z = false;
        }
        long ar = cg.ar(i3, i4, 2, z, i5, 474309517);
        int i17 = (i6 << 6) + i7;
        if (-1397635736 * ad.bn == 1) {
            i17 += 256;
        }
        if (i7 == 22) {
            cq aj;
            if (-1 == -229827367 * ad.al && ad.ba == null) {
                aj = ad.aj(22, i6, iArr, i15, i14, i16, 2002218439);
            } else {
                aj = new hg(i5, 22, i6, i2, i3, i4, -229827367 * ad.al, true, null);
            }
            ccVar.as(i, i3, i4, i14, aj, ar, i17);
            if (ad.ak * -1655214851 == 1) {
                eqVar.ag(i3, i4, (byte) 100);
            }
        } else if (i7 == 10 || i7 == 11) {
            if (ad.al * 1361940890 == -1 && ad.ba == null) {
                r12 = ad.aj(10, i6, iArr, i15, i14, i16, 207078761);
            } else {
                r12 = new hg(i5, 10, i6, i2, i3, i4, ad.al * -229827367, true, null);
            }
            if (r12 != null) {
                int i18;
                if (11 == i7) {
                    i18 = 1091087294;
                } else {
                    i18 = 0;
                }
                ccVar.aq(i, i3, i4, i14, i9, i8, r12, i18, ar, i17);
            }
            if (-1655214851 * ad.ak != 0) {
                eqVar.an(i3, i4, i9, i8, ad.ao, 1768441984);
            }
        } else if (i7 >= 12) {
            if (-229827367 * ad.al == -1 && ad.ba == null) {
                r12 = ad.aj(i7, i6, iArr, i15, i14, i16, 173554424);
            } else {
                r12 = new hg(i5, i7, i6, i2, i3, i4, ad.al * -229827367, true, null);
            }
            ccVar.aq(i, i3, i4, i14, 1, 1, r12, 0, ar, i17);
            if (ad.ak * 1292285931 != 0) {
                eqVar.an(i3, i4, i9, i8, ad.ao, 1924336998);
            }
        } else if (i7 == 0) {
            if (-1 == ad.al * 284118939 && ad.ba == null) {
                r10 = ad.aj(0, i6, iArr, i15, i14, i16, 428975085);
            } else {
                r10 = new hg(i5, 0, i6, i2, i3, i4, ad.al * -229827367, true, null);
            }
            ccVar.aj(i, i3, i4, i14, r10, null, ak[i6], 0, ar, i17);
            if (ad.ak * -1655214851 != 0) {
                eqVar.ad(i3, i4, i7, i6, ad.ao, 1167891228);
            }
        } else if (i7 == 1) {
            if (ad.al * -229827367 == -1 && ad.ba == null) {
                r10 = ad.aj(1, i6, iArr, i15, i14, i16, 600244621);
            } else {
                r10 = new hg(i5, 1, i6, i2, i3, i4, 252911260 * ad.al, true, null);
            }
            ccVar.aj(i, i3, i4, i14, r10, null, ao[i6], 0, ar, i17);
            if (ad.ak * -369801199 != 0) {
                eqVar.ad(i3, i4, i7, i6, ad.ao, 1171538984);
            }
        } else if (2 == i7) {
            cq aj2;
            int i19 = (i6 + 1) & 3;
            if (-1 == ad.al * 624728598 && ad.ba == null) {
                r12 = ad.aj(2, i6 + 4, iArr, i15, i14, i16, 1720800980);
                aj2 = ad.aj(2, i19, iArr, i15, i14, i16, 945313337);
                r10 = r12;
            } else {
                r4 = new hg(i5, 2, i6 + 4, i2, i3, i4, -229827367 * ad.al, true, null);
                aj2 = new hg(i5, 2, i19, i2, i3, i4, -229827367 * ad.al, true, null);
                r10 = r4;
            }
            ccVar.aj(i, i3, i4, i14, r10, aj2, ak[i6], ak[i19], ar, i17);
            if (-545916197 * ad.ak != 0) {
                eqVar.ad(i3, i4, i7, i6, ad.ao, 1814005802);
            }
        } else if (i7 == 3) {
            if (ad.al * -229827367 == -1 && ad.ba == null) {
                r10 = ad.aj(3, i6, iArr, i15, i14, i16, 1510122550);
            } else {
                r10 = new hg(i5, 3, i6, i2, i3, i4, ad.al * -80757257, true, null);
            }
            ccVar.aj(i, i3, i4, i14, r10, null, ao[i6], 0, ar, i17);
            if (ad.ak * -1655214851 != 0) {
                eqVar.ad(i3, i4, i7, i6, ad.ao, 1620216848);
            }
        } else if (i7 == 9) {
            if (-1 == ad.al * -310691050 && ad.ba == null) {
                r12 = ad.aj(i7, i6, iArr, i15, i14, i16, 1365848323);
            } else {
                r12 = new hg(i5, i7, i6, i2, i3, i4, -229827367 * ad.al, true, null);
            }
            ccVar.aq(i, i3, i4, i14, 1, 1, r12, 0, ar, i17);
            if (ad.ak * -279530045 != 0) {
                eqVar.an(i3, i4, i9, i8, ad.ao, 1764151223);
            }
        } else if (i7 == 4) {
            if (ad.al * -1022674983 == -1 && ad.ba == null) {
                r22 = ad.aj(4, i6, iArr, i15, i14, i16, 688543335);
            } else {
                r22 = new hg(i5, 4, i6, i2, i3, i4, -229827367 * ad.al, true, null);
            }
            ccVar.ae(i, i3, i4, i14, r22, null, ak[i6], 0, 0, 0, ar, i17);
        } else if (i7 == 5) {
            r6 = ccVar.bw(i, i3, i4);
            if (0 != r6) {
                i8 = gi.ad(bb.as(r6), 1590863929).ap * 1681090481;
            } else {
                i8 = 16;
            }
            if (-229827367 * ad.al == -1 && ad.ba == null) {
                r22 = ad.aj(4, i6, iArr, i15, i14, i16, 985539626);
            } else {
                r22 = new hg(i5, 4, i6, i2, i3, i4, -2138601133 * ad.al, true, null);
            }
            ccVar.ae(i, i3, i4, i14, r22, null, ak[i6], 0, ax[i6] * i8, au[i6] * i8, ar, i17);
        } else if (6 == i7) {
            r6 = ccVar.bw(i, i3, i4);
            if (0 != r6) {
                i8 = (gi.ad(bb.as(r6), 1757633920).ap * -1101374621) / 2;
            } else {
                i8 = 8;
            }
            if (ad.al * -824157906 == -1 && ad.ba == null) {
                r22 = ad.aj(4, i6 + 4, iArr, i15, i14, i16, 1569461934);
            } else {
                r22 = new hg(i5, 4, i6 + 4, i2, i3, i4, 814981842 * ad.al, true, null);
            }
            ccVar.ae(i, i3, i4, i14, r22, null, 256, i6, av[i6] * i8, ac[i6] * i8, ar, i17);
        } else if (7 == i7) {
            int i20 = (i6 + 2) & 3;
            if (-1 == -229827367 * ad.al && ad.ba == null) {
                r22 = ad.aj(4, i20 + 4, iArr, i15, i14, i16, 1737528679);
            } else {
                r22 = new hg(i5, 4, i20 + 4, i2, i3, i4, -229827367 * ad.al, true, null);
            }
            ccVar.ae(i, i3, i4, i14, r22, null, 1831583520, i20, 0, 0, ar, i17);
        } else if (i7 == 8) {
            int i21;
            cq aj3;
            r6 = ccVar.bw(i, i3, i4);
            if (0 != r6) {
                i21 = (gi.ad(bb.as(r6), 1786023011).ap * 170280286) / 2;
            } else {
                i21 = 8;
            }
            i9 = (i6 + 2) & 3;
            if (ad.al * -229827367 == -1 && ad.ba == null) {
                r22 = ad.aj(4, i6 + 4, iArr, i15, i14, i16, 925576970);
                aj3 = ad.aj(4, i9 + 4, iArr, i15, i14, i16, 529996566);
            } else {
                r4 = new hg(i5, 4, i6 + 4, i2, i3, i4, ad.al * -1464955644, true, null);
                aj3 = new hg(i5, 4, i9 + 4, i2, i3, i4, ad.al * -229827367, true, null);
                r22 = r4;
            }
            ccVar.ae(i, i3, i4, i14, r22, aj3, -1050063140, i6, av[i6] * i21, i21 * ac[i6], ar, i17);
        }
    }

    static final void bj(int i, int i2, int i3, int i4, int i5, int i6, int i7, cc ccVar, eq eqVar) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        ae ad = gi.ad(i5, 1793750264);
        if (1 == i6 || 3 == i6) {
            i8 = ad.az * -265754695;
            i9 = ad.ah * -344743753;
        } else {
            i8 = ad.ah * -344743753;
            i9 = ad.az * -265754695;
        }
        if (i9 + i3 <= 1030494989) {
            i10 = ((i9 + 1) >> 1) + i3;
            i11 = i3 + (i9 >> 1);
        } else {
            i10 = i3 + 1;
            i11 = i3;
        }
        if (i8 + i4 <= -928302747) {
            i12 = (i8 >> 1) + i4;
            i13 = ((i8 + 1) >> 1) + i4;
        } else {
            i13 = i4 + 1;
            i12 = i4;
        }
        int[][] iArr = af[i2];
        int i14 = ((iArr[i11][i13] + (iArr[i10][i12] + iArr[i11][i12])) + iArr[i10][i13]) >> 2;
        int i15 = (i9 << 6) + (i3 << 7);
        int i16 = (i8 << 6) + (i4 << 7);
        long ar = cg.ar(i3, i4, 2, ad.ax * -7661206 == 0, i5, -42276503);
        int i17 = (i6 << 6) + i7;
        if (2114235682 * ad.bn == 1) {
            i17 += 256;
        }
        if (i7 == 22) {
            cq aj;
            if (-1 == -92301031 * ad.al && ad.ba == null) {
                aj = ad.aj(22, i6, iArr, i15, i14, i16, 1784243188);
            } else {
                aj = new hg(i5, 22, i6, i2, i3, i4, -229827367 * ad.al, true, null);
            }
            ccVar.as(i, i3, i4, i14, aj, ar, i17);
            if (ad.ak * -1655214851 == 1) {
                eqVar.ag(i3, i4, (byte) 3);
            }
        } else if (i7 == 10 || i7 == 11) {
            if (ad.al * -229827367 == -1 && ad.ba == null) {
                r14 = ad.aj(10, i6, iArr, i15, i14, i16, 1608987223);
            } else {
                r14 = new hg(i5, 10, i6, i2, i3, i4, ad.al * -229827367, true, null);
            }
            if (r14 != null) {
                ccVar.aq(i, i3, i4, i14, i9, i8, r14, 11 == i7 ? 256 : 0, ar, i17);
            }
            if (-1655214851 * ad.ak != 0) {
                eqVar.an(i3, i4, i9, i8, ad.ao, 1976478650);
            }
        } else if (i7 >= 12) {
            if (-229827367 * ad.al == -1 && ad.ba == null) {
                r14 = ad.aj(i7, i6, iArr, i15, i14, i16, 1037040848);
            } else {
                r14 = new hg(i5, i7, i6, i2, i3, i4, ad.al * -1379795485, true, null);
            }
            ccVar.aq(i, i3, i4, i14, 1, 1, r14, 0, ar, i17);
            if (ad.ak * 1074005935 != 0) {
                eqVar.an(i3, i4, i9, i8, ad.ao, 1978812488);
            }
        } else if (i7 == 0) {
            if (-1 == ad.al * -229827367 && ad.ba == null) {
                r12 = ad.aj(0, i6, iArr, i15, i14, i16, 983326174);
            } else {
                r12 = new hg(i5, 0, i6, i2, i3, i4, ad.al * -229827367, true, null);
            }
            ccVar.aj(i, i3, i4, i14, r12, null, ak[i6], 0, ar, i17);
            if (ad.ak * -1655214851 != 0) {
                eqVar.ad(i3, i4, i7, i6, ad.ao, 2013770266);
            }
        } else if (i7 == 1) {
            if (ad.al * -229827367 == -1 && ad.ba == null) {
                r12 = ad.aj(1, i6, iArr, i15, i14, i16, 1950171865);
            } else {
                r12 = new hg(i5, 1, i6, i2, i3, i4, -229827367 * ad.al, true, null);
            }
            ccVar.aj(i, i3, i4, i14, r12, null, ao[i6], 0, ar, i17);
            if (ad.ak * -1655214851 != 0) {
                eqVar.ad(i3, i4, i7, i6, ad.ao, 2117486687);
            }
        } else if (2 == i7) {
            cq aj2;
            r15 = (i6 + 1) & 3;
            if (-1 == ad.al * 1245534646 && ad.ba == null) {
                r12 = ad.aj(2, i6 + 4, iArr, i15, i14, i16, 787444038);
                aj2 = ad.aj(2, r15, iArr, i15, i14, i16, 1805570103);
            } else {
                r4 = new hg(i5, 2, i6 + 4, i2, i3, i4, 123215941 * ad.al, true, null);
                aj2 = new hg(i5, 2, r15, i2, i3, i4, -1264029455 * ad.al, true, null);
                r12 = r4;
            }
            ccVar.aj(i, i3, i4, i14, r12, aj2, ak[i6], ak[r15], ar, i17);
            if (-1655214851 * ad.ak != 0) {
                eqVar.ad(i3, i4, i7, i6, ad.ao, 2100285950);
            }
        } else if (i7 == 3) {
            if (ad.al * -229827367 == -1 && ad.ba == null) {
                r12 = ad.aj(3, i6, iArr, i15, i14, i16, 1216662905);
            } else {
                r12 = new hg(i5, 3, i6, i2, i3, i4, ad.al * -229827367, true, null);
            }
            ccVar.aj(i, i3, i4, i14, r12, null, ao[i6], 0, ar, i17);
            if (ad.ak * -1655214851 != 0) {
                eqVar.ad(i3, i4, i7, i6, ad.ao, 1273818809);
            }
        } else if (i7 == 9) {
            if (-1 == ad.al * -1476232658 && ad.ba == null) {
                r14 = ad.aj(i7, i6, iArr, i15, i14, i16, 1070377626);
            } else {
                r14 = new hg(i5, i7, i6, i2, i3, i4, -1569776004 * ad.al, true, null);
            }
            ccVar.aq(i, i3, i4, i14, 1, 1, r14, 0, ar, i17);
            if (ad.ak * -1740393668 != 0) {
                eqVar.an(i3, i4, i9, i8, ad.ao, 1722802814);
            }
        } else if (i7 == 4) {
            if (ad.al * -229827367 == -1 && ad.ba == null) {
                r10 = ad.aj(4, i6, iArr, i15, i14, i16, 856106831);
            } else {
                r10 = new hg(i5, 4, i6, i2, i3, i4, -229827367 * ad.al, true, null);
            }
            ccVar.ae(i, i3, i4, i14, r10, null, ak[i6], 0, 0, 0, ar, i17);
        } else if (i7 == 5) {
            r6 = ccVar.bw(i, i3, i4);
            if (0 != r6) {
                r15 = gi.ad(bb.as(r6), 1190571442).ap * 974961319;
            } else {
                r15 = 16;
            }
            if (1164079550 * ad.al == -1 && ad.ba == null) {
                r10 = ad.aj(4, i6, iArr, i15, i14, i16, 703600017);
            } else {
                r10 = new hg(i5, 4, i6, i2, i3, i4, -229827367 * ad.al, true, null);
            }
            ccVar.ae(i, i3, i4, i14, r10, null, ak[i6], 0, ax[i6] * r15, r15 * au[i6], ar, i17);
        } else if (6 == i7) {
            r6 = ccVar.bw(i, i3, i4);
            if (0 != r6) {
                r15 = (gi.ad(bb.as(r6), 1945604415).ap * 1681090481) / 2;
            } else {
                r15 = 8;
            }
            if (ad.al * 160914471 == -1 && ad.ba == null) {
                r10 = ad.aj(4, i6 + 4, iArr, i15, i14, i16, 987278498);
            } else {
                r10 = new hg(i5, 4, i6 + 4, i2, i3, i4, -1735196019 * ad.al, true, null);
            }
            ccVar.ae(i, i3, i4, i14, r10, null, 256, i6, av[i6] * r15, r15 * ac[i6], ar, i17);
        } else if (7 == i7) {
            i8 = (i6 + 2) & 3;
            if (-1 == -229827367 * ad.al && ad.ba == null) {
                r10 = ad.aj(4, i8 + 4, iArr, i15, i14, i16, 1093792406);
            } else {
                r10 = new hg(i5, 4, i8 + 4, i2, i3, i4, -744313892 * ad.al, true, null);
            }
            ccVar.ae(i, i3, i4, i14, r10, null, -604171157, i8, 0, 0, ar, i17);
        } else if (i7 == 8) {
            cq aj3;
            r6 = ccVar.bw(i, i3, i4);
            if (0 != r6) {
                r15 = (gi.ad(bb.as(r6), 1117753168).ap * 565688634) / 2;
            } else {
                r15 = 8;
            }
            i8 = (i6 + 2) & 3;
            if (ad.al * -229827367 == -1 && ad.ba == null) {
                r12 = ad.aj(4, i6 + 4, iArr, i15, i14, i16, 1023226078);
                aj3 = ad.aj(4, i8 + 4, iArr, i15, i14, i16, 624097294);
                r10 = r12;
            } else {
                r4 = new hg(i5, 4, i6 + 4, i2, i3, i4, ad.al * -1153280511, true, null);
                aj3 = new hg(i5, 4, i8 + 4, i2, i3, i4, ad.al * -229827367, true, null);
                r10 = r4;
            }
            ccVar.ae(i, i3, i4, i14, r10, aj3, 256, i6, av[i6] * r15, r15 * ac[i6], ar, i17);
        }
    }

    static final int az(int i, int i2, int i3, int i4) {
        int i5 = 256 - i3;
        return ((((i5 * (65280 & i)) + ((i2 & 65280) * i3)) & 16711680) + ((((i & 16711935) * i5) + ((16711935 & i2) * i3)) & -16711936)) >> 8;
    }

    static int ax(int i, gk gkVar, boolean z, int i2) {
        int[] iArr;
        int i3;
        int i4;
        if (i == 6500) {
            try {
                iArr = hr.as;
                i3 = hr.ar - 1194553915;
                hr.ar = i3;
                i4 = (i3 * 537618701) - 1;
                if (dq.af(-1679128282)) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                iArr[i4] = i3;
                return 1;
            } catch (Throwable e) {
                throw ba.ad(e, "gu.ax(" + ')');
            }
        } else if (i == 6501) {
            r0 = cd.ar(-466310398);
            if (r0 != null) {
                iArr = hr.as;
                i4 = hr.ar - 1194553915;
                hr.ar = i4;
                iArr[(i4 * 537618701) - 1] = -756728079 * r0.aq;
                iArr = hr.as;
                i4 = hr.ar - 1194553915;
                hr.ar = i4;
                iArr[(i4 * 537618701) - 1] = 259969383 * r0.am;
                r2 = hr.aj;
                i4 = hr.ae - 1246602361;
                hr.ae = i4;
                r2[(i4 * -1267697097) - 1] = r0.aw;
                iArr = hr.as;
                i4 = hr.ar - 1194553915;
                hr.ar = i4;
                iArr[(i4 * 537618701) - 1] = r0.ai * 1116252417;
                iArr = hr.as;
                i4 = hr.ar - 1194553915;
                hr.ar = i4;
                iArr[(i4 * 537618701) - 1] = r0.at * -1545862613;
                r2 = hr.aj;
                i4 = hr.ae - 1246602361;
                hr.ae = i4;
                r2[(i4 * -1267697097) - 1] = r0.ab;
                return 1;
            }
            r0 = hr.as;
            r2 = hr.ar - 1194553915;
            hr.ar = r2;
            r0[(r2 * 537618701) - 1] = -1;
            r0 = hr.as;
            r2 = hr.ar - 1194553915;
            hr.ar = r2;
            r0[(r2 * 537618701) - 1] = 0;
            r0 = hr.aj;
            r2 = hr.ae - 1246602361;
            hr.ae = r2;
            r0[(r2 * -1267697097) - 1] = "";
            r0 = hr.as;
            r2 = hr.ar - 1194553915;
            hr.ar = r2;
            r0[(r2 * 537618701) - 1] = 0;
            r0 = hr.as;
            r2 = hr.ar - 1194553915;
            hr.ar = r2;
            r0[(r2 * 537618701) - 1] = 0;
            r0 = hr.aj;
            r2 = hr.ae - 1246602361;
            hr.ae = r2;
            r0[(r2 * -1267697097) - 1] = "";
            return 1;
        } else if (6502 == i) {
            r0 = ek.aj(2140310928);
            if (r0 != null) {
                iArr = hr.as;
                i4 = hr.ar - 1194553915;
                hr.ar = i4;
                iArr[(i4 * 537618701) - 1] = -756728079 * r0.aq;
                iArr = hr.as;
                i4 = hr.ar - 1194553915;
                hr.ar = i4;
                iArr[(i4 * 537618701) - 1] = r0.am * 259969383;
                r2 = hr.aj;
                i4 = hr.ae - 1246602361;
                hr.ae = i4;
                r2[(i4 * -1267697097) - 1] = r0.aw;
                iArr = hr.as;
                i4 = hr.ar - 1194553915;
                hr.ar = i4;
                iArr[(i4 * 537618701) - 1] = r0.ai * 1116252417;
                iArr = hr.as;
                i4 = hr.ar - 1194553915;
                hr.ar = i4;
                iArr[(i4 * 537618701) - 1] = r0.at * -1545862613;
                r2 = hr.aj;
                i4 = hr.ae - 1246602361;
                hr.ae = i4;
                r2[(i4 * -1267697097) - 1] = r0.ab;
                return 1;
            }
            r0 = hr.as;
            r2 = hr.ar - 1194553915;
            hr.ar = r2;
            r0[(r2 * 537618701) - 1] = -1;
            r0 = hr.as;
            r2 = hr.ar - 1194553915;
            hr.ar = r2;
            r0[(r2 * 537618701) - 1] = 0;
            r0 = hr.aj;
            r2 = hr.ae - 1246602361;
            hr.ae = r2;
            r0[(r2 * -1267697097) - 1] = "";
            r0 = hr.as;
            r2 = hr.ar - 1194553915;
            hr.ar = r2;
            r0[(r2 * 537618701) - 1] = 0;
            r0 = hr.as;
            r2 = hr.ar - 1194553915;
            hr.ar = r2;
            r0[(r2 * 537618701) - 1] = 0;
            r0 = hr.aj;
            r2 = hr.ae - 1246602361;
            hr.ae = r2;
            r0[(r2 * -1267697097) - 1] = "";
            return 1;
        } else if (6506 == i) {
            r0 = hr.as;
            r2 = hr.ar - -1194553915;
            hr.ar = r2;
            i4 = r0[r2 * 537618701];
            r0 = null;
            for (r2 = 0; r2 < hq.ay * 443593871; r2++) {
                if (i4 == -756728079 * C0001do.ag[r2].aq) {
                    r0 = C0001do.ag[r2];
                    break;
                }
            }
            if (r0 != null) {
                iArr = hr.as;
                i4 = hr.ar - 1194553915;
                hr.ar = i4;
                iArr[(i4 * 537618701) - 1] = -756728079 * r0.aq;
                iArr = hr.as;
                i4 = hr.ar - 1194553915;
                hr.ar = i4;
                iArr[(i4 * 537618701) - 1] = 259969383 * r0.am;
                r2 = hr.aj;
                i4 = hr.ae - 1246602361;
                hr.ae = i4;
                r2[(i4 * -1267697097) - 1] = r0.aw;
                iArr = hr.as;
                i4 = hr.ar - 1194553915;
                hr.ar = i4;
                iArr[(i4 * 537618701) - 1] = 1116252417 * r0.ai;
                iArr = hr.as;
                i4 = hr.ar - 1194553915;
                hr.ar = i4;
                iArr[(i4 * 537618701) - 1] = -1545862613 * r0.at;
                r2 = hr.aj;
                i4 = hr.ae - 1246602361;
                hr.ae = i4;
                r2[(i4 * -1267697097) - 1] = r0.ab;
                return 1;
            }
            r0 = hr.as;
            r2 = hr.ar - 1194553915;
            hr.ar = r2;
            r0[(r2 * 537618701) - 1] = -1;
            r0 = hr.as;
            r2 = hr.ar - 1194553915;
            hr.ar = r2;
            r0[(r2 * 537618701) - 1] = 0;
            r0 = hr.aj;
            r2 = hr.ae - 1246602361;
            hr.ae = r2;
            r0[(r2 * -1267697097) - 1] = "";
            r0 = hr.as;
            r2 = hr.ar - 1194553915;
            hr.ar = r2;
            r0[(r2 * 537618701) - 1] = 0;
            r0 = hr.as;
            r2 = hr.ar - 1194553915;
            hr.ar = r2;
            r0[(r2 * 537618701) - 1] = 0;
            r0 = hr.aj;
            r2 = hr.ae - 1246602361;
            hr.ae = r2;
            r0[(r2 * -1267697097) - 1] = "";
            return 1;
        } else if (i == 6507) {
            boolean z2;
            hr.ar -= -483248364;
            i4 = hr.as[hr.ar * 537618701];
            r0 = 1 == hr.as[(hr.ar * 537618701) + 1];
            r4 = hr.as[(hr.ar * 537618701) + 2];
            if (1 == hr.as[(hr.ar * 537618701) + 3]) {
                z2 = true;
            } else {
                z2 = false;
            }
            de.aa(i4, r0, r4, z2, 1191637273);
            return 1;
        } else if (6511 == i) {
            r0 = hr.as;
            r2 = hr.ar - -1194553915;
            hr.ar = r2;
            i3 = r0[r2 * 537618701];
            if (i3 < 0 || i3 >= hq.ay * 443593871) {
                r0 = hr.as;
                r2 = hr.ar - 1194553915;
                hr.ar = r2;
                r0[(r2 * 537618701) - 1] = -1;
                r0 = hr.as;
                r2 = hr.ar - 1194553915;
                hr.ar = r2;
                r0[(r2 * 537618701) - 1] = 0;
                r0 = hr.aj;
                r2 = hr.ae - 1246602361;
                hr.ae = r2;
                r0[(r2 * -1267697097) - 1] = "";
                r0 = hr.as;
                r2 = hr.ar - 1194553915;
                hr.ar = r2;
                r0[(r2 * 537618701) - 1] = 0;
                r0 = hr.as;
                r2 = hr.ar - 1194553915;
                hr.ar = r2;
                r0[(r2 * 537618701) - 1] = 0;
                r0 = hr.aj;
                r2 = hr.ae - 1246602361;
                hr.ae = r2;
                r0[(r2 * -1267697097) - 1] = "";
                return 1;
            }
            r0 = C0001do.ag[i3];
            iArr = hr.as;
            i4 = hr.ar - 1194553915;
            hr.ar = i4;
            iArr[(i4 * 537618701) - 1] = r0.aq * -756728079;
            iArr = hr.as;
            i4 = hr.ar - 1194553915;
            hr.ar = i4;
            iArr[(i4 * 537618701) - 1] = 259969383 * r0.am;
            r2 = hr.aj;
            i4 = hr.ae - 1246602361;
            hr.ae = i4;
            r2[(i4 * -1267697097) - 1] = r0.aw;
            iArr = hr.as;
            i4 = hr.ar - 1194553915;
            hr.ar = i4;
            iArr[(i4 * 537618701) - 1] = r0.ai * 1116252417;
            iArr = hr.as;
            i4 = hr.ar - 1194553915;
            hr.ar = i4;
            iArr[(i4 * 537618701) - 1] = -1545862613 * r0.at;
            r2 = hr.aj;
            i4 = hr.ae - 1246602361;
            hr.ae = i4;
            r2[(i4 * -1267697097) - 1] = r0.ab;
            return 1;
        } else if (6512 == i) {
            il ilVar = nq.ii;
            r0 = hr.as;
            i4 = hr.ar - -1194553915;
            hr.ar = i4;
            if (r0[i4 * 537618701] == 1) {
                r0 = true;
            } else {
                r0 = false;
            }
            ilVar.co(r0, 900634172);
            return 1;
        } else if (i == 6513) {
            hr.ar -= 1905859466;
            i3 = hr.as[hr.ar * 537618701];
            r2 = hr.as[(hr.ar * 537618701) + 1];
            r3 = ff.ad(r2, (byte) 100);
            if (r3.ay(2084805987)) {
                r4 = hr.aj;
                r5 = hr.ae - 1246602361;
                hr.ae = r5;
                r4[(r5 * -1267697097) - 1] = ie.ad(i3, (byte) 18).aq(r2, r3.ag, -2135449806);
                return 1;
            }
            r4 = hr.as;
            r5 = hr.ar - 1194553915;
            hr.ar = r5;
            r4[(r5 * 537618701) - 1] = ie.ad(i3, (byte) 91).ae(r2, r3.aa * -54312713, (byte) -52);
            return 1;
        } else if (i == 6514) {
            hr.ar -= 1905859466;
            i3 = hr.as[hr.ar * 537618701];
            r2 = hr.as[(hr.ar * 537618701) + 1];
            r3 = ff.ad(r2, (byte) 107);
            if (r3.ay(2067424475)) {
                r4 = hr.aj;
                r5 = hr.ae - 1246602361;
                hr.ae = r5;
                r4[(r5 * -1267697097) - 1] = gi.ad(i3, 1713755953).ab(r2, r3.ag, (byte) -107);
                return 1;
            }
            r4 = hr.as;
            r5 = hr.ar - 1194553915;
            hr.ar = r5;
            r4[(r5 * 537618701) - 1] = gi.ad(i3, 1342623986).at(r2, r3.aa * -54312713, (byte) 21);
            return 1;
        } else if (i == 6515) {
            hr.ar -= 1905859466;
            i3 = hr.as[hr.ar * 537618701];
            r2 = hr.as[(hr.ar * 537618701) + 1];
            r3 = ff.ad(r2, (byte) 47);
            if (r3.ay(2114696735)) {
                r4 = hr.aj;
                r5 = hr.ae - 1246602361;
                hr.ae = r5;
                r4[(r5 * -1267697097) - 1] = cm.af(i3, 1324527805).ah(r2, r3.ag, 603027064);
                return 1;
            }
            r4 = hr.as;
            r5 = hr.ar - 1194553915;
            hr.ar = r5;
            r4[(r5 * 537618701) - 1] = cm.af(i3, 1624271199).az(r2, r3.aa * -54312713, 481295699);
            return 1;
        } else if (i == 6516) {
            hr.ar -= 1905859466;
            i3 = hr.as[hr.ar * 537618701];
            r2 = hr.as[(hr.ar * 537618701) + 1];
            r3 = ff.ad(r2, (byte) 17);
            if (r3.ay(2063730353)) {
                r4 = hr.aj;
                r5 = hr.ae - 1246602361;
                hr.ae = r5;
                r4[(r5 * -1267697097) - 1] = ok.ad(i3, (byte) 7).as(r2, r3.ag, 232518493);
                return 1;
            }
            r4 = hr.as;
            r5 = hr.ar - 1194553915;
            hr.ar = r5;
            r4[(r5 * 537618701) - 1] = ok.ad(i3, (byte) -5).ay(r2, r3.aa * -54312713, 405823657);
            return 1;
        } else if (i == 6518) {
            iArr = hr.as;
            i3 = hr.ar - 1194553915;
            hr.ar = i3;
            i4 = (i3 * 537618701) - 1;
            if (client.ad.ai) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            iArr[i4] = i3;
            return 1;
        } else if (i == 6520 || i == 6522) {
            je aa = client.ad.ty(-1290553606).aa(2, -1509700007);
            r2 = hr.aj;
            i4 = hr.ae - -1246602361;
            hr.ae = i4;
            aa.au(r2[i4 * -1267697097], (byte) -44);
            iArr = hr.as;
            i4 = hr.ar - -1194553915;
            hr.ar = i4;
            aa.ac(iArr[i4 * 537618701], (byte) 121);
            aa.ak((byte) 2);
            return 1;
        } else if (i == 6521) {
            client.ad.ty(-1290553606).cs(2088641433);
            return 1;
        } else if (i != 6523) {
            return 2;
        } else {
            je aa2 = client.ad.ty(-1290553606).aa(1, 355236637);
            r0 = hr.aj;
            i4 = hr.ae - -1246602361;
            hr.ae = i4;
            String str = r0[i4 * -1267697097];
            r4 = str.length();
            for (i3 = 0; i3 < r4; i3++) {
                if (!ha.ae(str.charAt(i3), (byte) 5)) {
                    i3 = 0;
                    break;
                }
            }
            i3 = 1;
            if (i3 == 0) {
                throw new IllegalArgumentException();
            }
            aa2.au(str, (byte) -114);
            r0 = hr.as;
            i4 = hr.ar - -1194553915;
            hr.ar = i4;
            aa2.ac(r0[i4 * 537618701], (byte) 4);
            aa2.ak((byte) 2);
            return 1;
        }
    }
}
