package p000;

public class mf {
    public static nx aa = null;
    public static kf ad = null;
    public static kf af = null;
    public static int ag = 0;
    static final int ai = 32768;
    public static kf an;
    public static int ar;

    mf() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ba.ad(e, "mf.<init>(" + ')');
        }
    }

    public static boolean ar(kf kfVar, kf kfVar2, kf kfVar3, nx nxVar) {
        af = kfVar;
        ad = kfVar2;
        an = kfVar3;
        aa = nxVar;
        return true;
    }

    public static boolean as(kf kfVar, kf kfVar2, kf kfVar3, nx nxVar) {
        af = kfVar;
        ad = kfVar2;
        an = kfVar3;
        aa = nxVar;
        return true;
    }

    public static void ae(kf kfVar, int i, int i2, int i3, boolean z) {
        ag = 63807465;
        ex.ay = kfVar;
        ml.as = -1919717083 * i;
        ar = -2021257265 * i2;
        ci.aj = 1891212107 * i3;
        gm.aq = z;
        cb.ae = 37492880;
    }

    public static void aj(kf kfVar, int i, int i2, int i3, boolean z) {
        ag = 63807465;
        ex.ay = kfVar;
        ml.as = 1579188871 * i;
        ar = 683620456 * i2;
        ci.aj = 1157076141 * i3;
        gm.aq = z;
        cb.ae = 656342154;
    }

    public static void am() {
        aa.am(-2050232874);
        ag = 63807465;
        ex.ay = null;
    }

    public static void aq() {
        aa.am(-1699545795);
        ag = 63807465;
        ex.ay = null;
    }

    public static void at() {
        aa.am(-1364242175);
        ag = 63807465;
        ex.ay = null;
    }

    public static void ab(int i, kf kfVar, String str, String str2, int i2, boolean z) {
        int ax = kfVar.ax(str, 1710583586);
        int au = kfVar.au(ax, str2, 2019821647);
        ag = 1456756545;
        ex.ay = kfVar;
        ml.as = ax * -1919717083;
        ar = -2021257265 * au;
        ci.aj = -1734207119 * i2;
        gm.aq = z;
        cb.ae = 1758792857 * i;
    }

    public static void ai(int i) {
        ag = 63807465;
        ex.ay = null;
        ml.as = 1919717083;
        ar = 2021257265;
        ci.aj = 0;
        gm.aq = false;
        cb.ae = 1758792857 * i;
    }

    public static void aw(int i) {
        ag = -1886561380;
        ex.ay = null;
        ml.as = -364563073;
        ar = 2021257265;
        ci.aj = 0;
        gm.aq = false;
        cb.ae = -1720706710 * i;
    }

    public static void az(int i) {
        ag = 63807465;
        ex.ay = null;
        ml.as = 1980223073;
        ar = -478603149;
        ci.aj = 0;
        gm.aq = false;
        cb.ae = 1758792857 * i;
    }

    public static void ah() {
        try {
            if (-219207591 * ag == 1) {
                int ad = aa.ad(-1279327527);
                if (ad <= 0 || !aa.at(1809919242)) {
                    aa.am(-1686415269);
                    aa.ag(2141847191);
                    if (ex.ay != null) {
                        ag = 127614930;
                    } else {
                        ag = 0;
                    }
                    ez.am = null;
                    ag.at = null;
                    return;
                }
                ad -= 187074473 * cb.ae;
                if (ad < 0) {
                    ad = 0;
                }
                aa.af(ad, 1868131861);
            }
        } catch (Exception e) {
            e.printStackTrace();
            aa.am(-900740764);
            ag = 0;
            ez.am = null;
            ag.at = null;
            ex.ay = null;
        }
    }

    public static void ak() {
        try {
            if (1988454940 * ag == 1) {
                int ad = aa.ad(-544969185);
                if (ad <= 0 || !aa.at(-25053610)) {
                    aa.am(-1028841199);
                    aa.ag(876140417);
                    if (ex.ay != null) {
                        ag = 127614930;
                    } else {
                        ag = 0;
                    }
                    ez.am = null;
                    ag.at = null;
                    return;
                }
                ad -= 187074473 * cb.ae;
                if (ad < 0) {
                    ad = 0;
                }
                aa.af(ad, -1240670658);
            }
        } catch (Exception e) {
            e.printStackTrace();
            aa.am(-1412604777);
            ag = 0;
            ez.am = null;
            ag.at = null;
            ex.ay = null;
        }
    }

    static final void cp(int i, int i2, int i3, int i4, boolean z, int i5) {
        try {
            int i6;
            int i7;
            int i8;
            int i9;
            gf af = client.ad.ry.af(-1764990504);
            if (i3 < 1) {
                i6 = 1;
            } else {
                i6 = i3;
            }
            if (i4 < 1) {
                i7 = 1;
            } else {
                i7 = i4;
            }
            int i10 = i7 - 334;
            if (i10 < 0) {
                i8 = 0;
            } else if (i10 > 100) {
                i8 = 100;
            } else {
                i8 = i10;
            }
            i10 = (((client.oy - client.oh) * i8) / 100) + client.oh;
            short s = ((i7 * i10) * 512) / (i6 * 334);
            if (s < client.of) {
                s = client.of;
                i10 = ((s * i6) * 334) / (i7 * 512);
                if (i10 > client.ov) {
                    short s2 = client.ov;
                    int i11 = (i6 - (((s2 * i7) * 512) / (s * 334))) / 2;
                    if (z) {
                        af.fs(1936327021);
                        af.aa(i, i2, i11, i7, 0, (byte) -26);
                        af.aa((i6 + i) - i11, i2, i11, i7, 0, (byte) -18);
                    }
                    i += i11;
                    i6 -= i11 * 2;
                    i9 = s2;
                }
                i9 = i10;
            } else {
                if (s > client.os) {
                    s = client.os;
                    i10 = ((s * i6) * 334) / (i7 * 512);
                    if (i10 < client.ox) {
                        short s3 = client.ox;
                        int i12 = (i7 - (((s * i6) * 334) / (s3 * 512))) / 2;
                        if (z) {
                            af.fs(1332593365);
                            af.aa(i, i2, i6, i12, 0, (byte) 45);
                            af.aa(i, (i7 + i2) - i12, i6, i12, 0, (byte) -29);
                        }
                        i2 += i12;
                        i7 -= i12 * 2;
                        short s4 = s3;
                    }
                }
                i9 = i10;
            }
            client.ou = ((((i9 * i7) * (client.oa + (((client.oi - client.oa) * i8) / 100))) / 85504) << 1) * 149399939;
            if (!(i6 == 2140963035 * client.oc && i7 == client.ot * -1949120505)) {
                int[] iArr = new int[9];
                for (i9 = 0; i9 < 9; i9++) {
                    int i13 = ((i9 * 32) + mn.an) + 15;
                    iArr[i9] = (bi.az[i13] * ((i13 * 3) + 600)) >> 16;
                }
                cc.bx(iArr, 500, 800, i6, i7);
            }
            client.om = -1499570369 * i;
            client.op = 2053056623 * i2;
            client.oc = -1982104749 * i6;
            client.ot = 549856695 * i7;
        } catch (Throwable e) {
            throw ba.ad(e, "mf.cp(" + ')');
        }
    }
}
