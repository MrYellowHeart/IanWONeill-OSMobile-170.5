package p000;

public class cg extends el {
    public static final int as = 9;
    static final int bf = 19137016;
    static final int ff = 383;
    static final int pd = 5;
    static int qd;
    final boolean af;

    public cg(boolean z) {
        try {
            this.af = z;
        } catch (Throwable e) {
            throw ba.ad(e, "cg.<init>(" + ')');
        }
    }

    public static ol[] af(int i) {
        try {
            return new ol[]{ol.an, ol.af, ol.ad};
        } catch (Throwable e) {
            throw ba.ad(e, "cg.af(" + ')');
        }
    }

    int af(ez ezVar, ez ezVar2, int i) {
        try {
            if (client.an * -1304916389 == ezVar.ag * -1161455169) {
                if (ezVar2.ag * -1161455169 != client.an * -1304916389) {
                    if (this.af) {
                        return -1;
                    }
                    return 1;
                }
            } else if (client.an * -1304916389 == ezVar2.ag * -1161455169) {
                return !this.af ? -1 : 1;
            }
            return am(ezVar, ezVar2, 295795568);
        } catch (Throwable e) {
            throw ba.ad(e, "cg.af(" + ')');
        }
    }

    public int aa(Object obj, Object obj2) {
        return af((ez) obj, (ez) obj2, 1465579313);
    }

    public int ag(Object obj, Object obj2) {
        return af((ez) obj, (ez) obj2, 1465579313);
    }

    public int an(Object obj, Object obj2) {
        return af((ez) obj, (ez) obj2, 1465579313);
    }

    public int compare(Object obj, Object obj2) {
        try {
            return af((ez) obj, (ez) obj2, 1465579313);
        } catch (Throwable e) {
            throw ba.ad(e, "cg.compare(" + ')');
        }
    }

    public static long ar(int i, int i2, int i3, boolean z, int i4, int i5) {
        long j = ((long) ((((i & 127) << 0) | ((i2 & 127) << 7)) | ((i3 & 3) << 14))) | ((((long) i4) & 4294967295L) << 17);
        if (z) {
            return j | 65536;
        }
        return j;
    }

    public static void af(hv hvVar, int i) {
        try {
            bw.ad(hvVar, 500000, 2130702558);
        } catch (Throwable e) {
            throw ba.ad(e, "cg.af(" + ')');
        }
    }

    static final void ai(String str, int i) {
        try {
            cz.aj(jv.gw + str + jv.gh, (byte) 4);
        } catch (Throwable e) {
            throw ba.ad(e, "cg.ai(" + ')');
        }
    }

    public static void ag(int i, int i2) {
        if (-1 != i) {
            if (ek.as[i]) {
                gn.ar.ah(i, 357657231);
                if (en.ay[i] != null) {
                    Object obj = 1;
                    int i3 = 0;
                    while (i3 < en.ay[i].length) {
                        try {
                            if (en.ay[i][i3] != null) {
                                if (-128421835 * en.ay[i][i3].ao != 2) {
                                    en.ay[i][i3] = null;
                                } else {
                                    obj = null;
                                }
                            }
                            i3++;
                        } catch (Throwable e) {
                            throw ba.ad(e, "cg.ag(" + ')');
                        }
                    }
                    if (obj != null) {
                        en.ay[i] = null;
                    }
                    ek.as[i] = false;
                }
            }
        }
    }

    static void fm(short s) {
        try {
            for (hy hyVar = (hy) client.jk.aa(); hyVar != null; hyVar = (hy) client.jk.ag()) {
                int i = 669823817 * hyVar.af;
                if (ao.aa(i, (byte) -22)) {
                    boolean z = true;
                    ac[] acVarArr = en.ay[i];
                    for (i = 0; i < acVarArr.length; i++) {
                        if (acVarArr[i] != null) {
                            z = acVarArr[i].az;
                            break;
                        }
                    }
                    if (!z) {
                        ac ad = hv.ad((int) hyVar.fy, 1426036027);
                        if (ad != null) {
                            client.fk(ad, (byte) 79);
                        }
                    }
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "cg.fm(" + ')');
        }
    }
}
