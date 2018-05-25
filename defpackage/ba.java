package p000;

public class ba extends kq {
    public static final int ad = 3;
    static final int an = 1020;
    public static final int as = 1280;
    static final int at = 13;
    static kh co;
    static lr dy;
    static mr pg;
    bn[] af;

    public static ba aa(kf kfVar, kf kfVar2, int i, boolean z) {
        int[] ab = kfVar.ab(i, 404736423);
        int i2 = 1;
        for (int aq : ab) {
            int aq2;
            byte[] aq3 = kfVar.aq(i, aq2, -1606660199);
            if (aq3 == null) {
                i2 = 0;
            } else {
                aq2 = (aq3[1] & -1842743163) | ((aq3[0] & 193620583) << 8);
                if (z) {
                    aq3 = kfVar2.aq(0, aq2, -1292225819);
                } else {
                    aq3 = kfVar2.aq(aq2, 0, 1722847281);
                }
                if (aq3 == null) {
                    i2 = 0;
                }
            }
        }
        if (i2 == 0) {
            return null;
        }
        try {
            return new ba(kfVar, kfVar2, i, z);
        } catch (Exception e) {
            return null;
        }
    }

    public static ba an(kf kfVar, kf kfVar2, int i, boolean z) {
        int[] ab = kfVar.ab(i, 698977882);
        int i2 = 1;
        for (int aq : ab) {
            int aq2;
            byte[] aq3 = kfVar.aq(i, aq2, 149941467);
            if (aq3 == null) {
                i2 = 0;
            } else {
                aq2 = (aq3[1] & 255) | ((aq3[0] & 255) << 8);
                if (z) {
                    aq3 = kfVar2.aq(0, aq2, -1922015631);
                } else {
                    aq3 = kfVar2.aq(aq2, 0, 67825600);
                }
                if (aq3 == null) {
                    i2 = 0;
                }
            }
        }
        if (i2 == 0) {
            return null;
        }
        try {
            return new ba(kfVar, kfVar2, i, z);
        } catch (Exception e) {
            return null;
        }
    }

    ba(kf kfVar, kf kfVar2, int i, boolean z) {
        try {
            kg kgVar = new kg();
            this.af = new bn[kfVar.aw(i, 263009488)];
            int[] ab = kfVar.ab(i, -1179433539);
            for (int i2 = 0; i2 < ab.length; i2++) {
                byte[] an = kfVar.an(i, ab[i2], -94701410);
                int i3 = (an[1] & 255) | ((an[0] & 255) << 8);
                bf bfVar = (bf) kgVar.as();
                while (bfVar != null) {
                    if (i3 == -1591590409 * bfVar.af) {
                        break;
                    }
                    bfVar = (bf) kgVar.aj();
                }
                bfVar = null;
                if (bfVar == null) {
                    byte[] aq;
                    if (z) {
                        aq = kfVar2.aq(0, i3, 39825946);
                    } else {
                        aq = kfVar2.aq(i3, 0, 1371752079);
                    }
                    bfVar = new bf(i3, aq);
                    kgVar.ad(bfVar);
                }
                this.af[ab[i2]] = new bn(an, bfVar);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "ba.<init>(" + ')');
        }
    }

    public static boolean ag(int i, int i2) {
        try {
            return (i >= ji.af.ac * -1010613707 && i <= ji.aa.ac * -1010613707) || i == ji.ag.ac * -1010613707;
        } catch (Throwable e) {
            throw ba.ad(e, "ba.ag(" + ')');
        }
    }

    public static mq ad(Throwable th, String str) {
        try {
            if (!(th instanceof mq)) {
                return new mq(th, str);
            }
            mq mqVar = (mq) th;
            mqVar.ag += ' ' + str;
            return mqVar;
        } catch (Throwable e) {
            throw ba.ad(e, "ba.ad(" + ')');
        }
    }

    public boolean ad(int i, byte b) {
        try {
            return this.af[i].aq;
        } catch (Throwable e) {
            throw ba.ad(e, "ba.ad(" + ')');
        }
    }

    public boolean ag(int i) {
        return this.af[i].aq;
    }

    public boolean as(int i) {
        return this.af[i].aq;
    }

    public boolean ay(int i) {
        return this.af[i].aq;
    }

    static void cb(int i) {
        try {
            int i2 = gw.ay * -1675758365;
            int[] iArr = gw.as;
            int i3 = 0;
            while (i3 < i2) {
                if (!(1640838373 * client.im == iArr[i3] || iArr[i3] == client.hz * -1522892003)) {
                    kf.cu(client.hb[iArr[i3]], true, 1104315898);
                }
                i3++;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "ba.cb(" + ')');
        }
    }
}
