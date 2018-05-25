package p000;

public class bg {
    public static final short[][] aa = new short[][]{new short[]{(short) 6554, (short) 115, (short) 10304, (short) 28, (short) 5702, (short) 7756, (short) 5681, (short) 4510, (short) -31835, (short) 22437, (short) 2859, (short) -11339, (short) 16, (short) 5157, (short) 10446, (short) 3658, (short) -27314, (short) -21965, (short) 472, (short) 580, (short) 784, (short) 21966, (short) 28950, (short) -15697, (short) -14002}, new short[]{(short) 9104, (short) 10275, (short) 7595, (short) 3610, (short) 7975, (short) 8526, (short) 918, (short) -26734, (short) 24466, (short) 10145, (short) -6882, (short) 5027, (short) 1457, (short) 16565, (short) -30545, (short) 25486, (short) 24, (short) 5392, (short) 10429, (short) 3673, (short) -27335, (short) -21957, (short) 192, (short) 687, (short) 412, (short) 21821, (short) 28835, (short) -15460, (short) -14019}, new short[0], new short[0], new short[0]};
    public static final short[][] ad = new short[][]{new short[]{(short) 6798, (short) 107, (short) 10283, (short) 16, (short) 4797, (short) 7744, (short) 5799, (short) 4634, (short) -31839, (short) 22433, (short) 2983, (short) -11343, (short) 8, (short) 5281, (short) 10438, (short) 3650, (short) -27322, (short) -21845, (short) 200, (short) 571, (short) 908, (short) 21830, (short) 28946, (short) -15701, (short) -14010}, new short[]{(short) 8741, (short) 12, (short) -1506, (short) -22374, (short) 7735, (short) 8404, (short) 1701, (short) -27106, (short) 24094, (short) 10153, (short) -8915, (short) 4783, (short) 1341, (short) 16578, (short) -30533, (short) 25239, (short) 8, (short) 5281, (short) 10438, (short) 3650, (short) -27322, (short) -21845, (short) 200, (short) 571, (short) 908, (short) 21830, (short) 28946, (short) -15701, (short) -14010}, new short[]{(short) 25238, (short) 8742, (short) 12, (short) -1506, (short) -22374, (short) 7735, (short) 8404, (short) 1701, (short) -27106, (short) 24094, (short) 10153, (short) -8915, (short) 4783, (short) 1341, (short) 16578, (short) -30533, (short) 8, (short) 5281, (short) 10438, (short) 3650, (short) -27322, (short) -21845, (short) 200, (short) 571, (short) 908, (short) 21830, (short) 28946, (short) -15701, (short) -14010}, new short[]{(short) 4626, (short) 11146, (short) 6439, (short) 12, (short) 4758, (short) 10270}, new short[]{(short) 4550, (short) 4537, (short) 5681, (short) 5673, (short) 5790, (short) 6806, (short) 8076, (short) 4574, (short) 17050, (short) 0, (short) 127, (short) -31821}};
    public static final short[] af = new short[]{(short) 6798, (short) 8741, (short) 25238, (short) 4626, (short) 4550};
    public static final short[] an = new short[]{(short) -10304, (short) 9104, (short) -1, (short) -1, (short) -1};
    static final int bh = 0;
    static final int by = 0;
    static final int ht = 2048;

    bg() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ba.ad(e, "bg.<init>(" + ')');
        }
    }

    static boolean aa(int i, int i2) {
        return i != 4 || i2 < 8;
    }

    static boolean ad(int i, int i2) {
        if (i != 4 || i2 < 8) {
            return true;
        }
        return false;
    }

    static boolean ag(int i, int i2) {
        if (i != 4 || i2 < 8) {
            return true;
        }
        return false;
    }

    static boolean an(int i, int i2) {
        if (i != 4 || i2 < 8) {
            return true;
        }
        return false;
    }

    static byte[] an(byte[] bArr, int i) {
        try {
            int length = bArr.length;
            Object obj = new byte[length];
            System.arraycopy(bArr, 0, obj, 0, length);
            return obj;
        } catch (Throwable e) {
            throw ba.ad(e, "bg.an(" + ')');
        }
    }

    static void ar(byte b) {
        try {
            gw.ay = 0;
            for (int i = 0; i < 2048; i++) {
                gw.ag[i] = null;
                gw.aa[i] = (byte) 1;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "bg.ar(" + ')');
        }
    }

    static void bb(int i, int i2, int i3, int[] iArr, int[] iArr2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        int i14 = -i9;
        int i15 = i4;
        int i16 = i6;
        while (i14 < 0) {
            int i17 = i16;
            i16 = i15;
            i15 = -i8;
            int i18 = i17;
            while (i15 < 0) {
                int i19 = i16 + 1;
                try {
                    i16 = iArr2[i16];
                    if (i16 != 0) {
                        int i20 = (16711935 & i16) * i12;
                        i16 = ((((i16 * i12) - i20) & 16711680) + (i20 & -16711936)) >>> 8;
                        i20 = iArr[i18];
                        int i21 = i16 + i20;
                        i16 = (i16 & 16711935) + (i20 & 16711935);
                        i20 = ((i21 - i16) & ic.ad) + (i16 & 16777472);
                        i16 = i18 + 1;
                        iArr[i18] = (i20 - (i20 >>> 8)) | (i21 - i20);
                    } else {
                        i16 = i18 + 1;
                    }
                    i15++;
                    i18 = i16;
                    i16 = i19;
                } catch (Throwable e) {
                    throw ba.ad(e, "bg.bb(" + ')');
                }
            }
            i15 = i16 + i11;
            i14++;
            i16 = i18 + i10;
        }
    }

    static void ao(hq hqVar, int i) {
        try {
            int i2;
            if (hqVar.ae(-155742930) != client.aj) {
                client.aj = hqVar.ae(-742564815);
                an.au(hqVar.ae(842511121), (byte) -17);
            }
            hk.cb = hqVar.ab;
            client.an = 900776355 * hqVar.aq;
            client.aa = 1885480123 * hqVar.am;
            if (client.ay * 1902364993 == 0) {
                i2 = 43594;
            } else {
                i2 = 40000 + (hqVar.aq * -756728079);
            }
            hy.cf = i2 * 246734963;
            gu.cz = (client.ay * 1902364993 == 0 ? 443 : 50000 + (hqVar.aq * -756728079)) * -294315831;
            bt.cr = 1876323531 * hy.cf;
        } catch (Throwable e) {
            throw ba.ad(e, "bg.ao(" + ')');
        }
    }

    static void ej(ac acVar, int i, int i2, boolean z, int i3) {
        try {
            int i4 = 256177861 * acVar.bf;
            int i5 = acVar.bv * 57307023;
            if (acVar.al * 1514052731 == 0) {
                acVar.bf = 1684437759 * acVar.bc;
            } else if (1 == acVar.al * 1514052731) {
                acVar.bf = (i - (acVar.bc * 1506390075)) * -1766254579;
            } else if (acVar.al * 1514052731 == 2) {
                acVar.bf = (((acVar.bc * 1506390075) * i) >> 14) * -1766254579;
            }
            if (acVar.ap * 1658471413 == 0) {
                acVar.bv = acVar.bz * 4587323;
            } else if (acVar.ap * 1658471413 == 1) {
                acVar.bv = (i2 - (acVar.bz * -533584139)) * -24391825;
            } else if (acVar.ap * 1658471413 == 2) {
                acVar.bv = (((acVar.bz * -533584139) * i2) >> 14) * -24391825;
            }
            if (4 == acVar.al * 1514052731) {
                acVar.bf = (((309302415 * acVar.bp) * (acVar.bv * 57307023)) / (acVar.bx * -1111787169)) * -1766254579;
            }
            if (4 == acVar.ap * 1658471413) {
                acVar.bv = (((acVar.bf * 256177861) * (-1111787169 * acVar.bx)) / (acVar.bp * 309302415)) * -24391825;
            }
            if (-586529633 * acVar.au == ac.af) {
                client.ju = acVar;
            }
            if (z && acVar.ei != null) {
                if (i4 != acVar.bf * 256177861 || acVar.bv * 57307023 != i5) {
                    kd hvVar = new hv();
                    hvVar.an = acVar;
                    hvVar.af = acVar.ei;
                    client.kz.ad(hvVar);
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "bg.ej(" + ')');
        }
    }
}
