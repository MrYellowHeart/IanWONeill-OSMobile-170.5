package p000;

import java.util.Collection;

public class af extends kq {
    static ky ad = new ky(64, null);
    static kf af = null;
    public static final int ar = 0;
    static final int as = 32;
    static final int ay = 256;
    public static int ru;
    kp an;

    public static void af(kf kfVar, int i) {
        try {
            aq.af = kfVar;
        } catch (Throwable e) {
            throw ba.ad(e, "af.af(" + ')');
        }
    }

    af() {
        try {
        } catch (Throwable e) {
            throw ba.ad(e, "af.<init>(" + ')');
        }
    }

    public static void ae(kf kfVar) {
        af = kfVar;
    }

    public static void aj(kf kfVar) {
        af = kfVar;
    }

    public static void am(kf kfVar) {
        af = kfVar;
    }

    public static void aq(kf kfVar) {
        af = kfVar;
    }

    public static af ab(int i) {
        af afVar = (af) ad.af((long) i);
        if (afVar == null) {
            byte[] an = af.an(34, i, -1335590769);
            afVar = new af();
            if (an != null) {
                afVar.aa(new ik(an), (byte) 12);
            }
            afVar.an(-843123423);
            ad.an(afVar, (long) i);
        }
        return afVar;
    }

    public static af at(int i) {
        af afVar = (af) ad.af((long) i);
        if (afVar == null) {
            byte[] an = af.an(34, i, -768287271);
            afVar = new af();
            if (an != null) {
                afVar.aa(new ik(an), (byte) 12);
            }
            afVar.an(-843123423);
            ad.an(afVar, (long) i);
        }
        return afVar;
    }

    void ai() {
    }

    void an(int i) {
    }

    void aw() {
    }

    void az() {
    }

    void aa(ik ikVar, byte b) {
        while (true) {
            try {
                int ao = ikVar.ao((byte) 0);
                if (ao != 0) {
                    ag(ikVar, ao, 2098900089);
                } else {
                    return;
                }
            } catch (Throwable e) {
                throw ba.ad(e, "af.aa(" + ')');
            }
        }
    }

    void ah(ik ikVar) {
        while (true) {
            int ao = ikVar.ao((byte) 0);
            if (ao != 0) {
                ag(ikVar, ao, 1509027211);
            } else {
                return;
            }
        }
    }

    void ag(ik ikVar, int i, int i2) {
        if (i == 249) {
            try {
                this.an = ad.af(ikVar, this.an, (byte) -54);
            } catch (Throwable e) {
                throw ba.ad(e, "af.ag(" + ')');
            }
        }
    }

    void ak(ik ikVar, int i) {
        if (i == -1762857881) {
            this.an = ad.af(ikVar, this.an, (byte) -64);
        }
    }

    void ao(ik ikVar, int i) {
        if (i == 249) {
            this.an = ad.af(ikVar, this.an, (byte) -120);
        }
    }

    void ax(ik ikVar, int i) {
        if (i == 249) {
            this.an = ad.af(ikVar, this.an, (byte) -7);
        }
    }

    public int au(int i, int i2) {
        return ip.ad(this.an, i, i2, 2080222652);
    }

    public int av(int i, int i2) {
        return ip.ad(this.an, i, i2, -1087033416);
    }

    public int ay(int i, int i2, int i3) {
        try {
            return ip.ad(this.an, i, i2, -729180540);
        } catch (Throwable e) {
            throw ba.ad(e, "af.ay(" + ')');
        }
    }

    public String as(int i, String str, int i2) {
        try {
            return iy.an(this.an, i, str, (byte) 12);
        } catch (Throwable e) {
            throw ba.ad(e, "af.as(" + ')');
        }
    }

    public static void ac(Collection collection) {
        collection.add(ad);
    }

    static void et(ac[] acVarArr, ac acVar, boolean z, byte b) {
        try {
            int i;
            if (acVar.by * 1151268625 != 0) {
                i = acVar.by * 1151268625;
            } else {
                i = acVar.bf * 256177861;
            }
            int i2 = acVar.bn * -1243953689 != 0 ? -1243953689 * acVar.bn : 57307023 * acVar.bv;
            gs.eg(acVarArr, 1172750087 * acVar.ah, i, i2, z, 1760437802);
            if (acVar.fo != null) {
                gs.eg(acVar.fo, acVar.ah * 1172750087, i, i2, z, 1760437802);
            }
            hy hyVar = (hy) client.jk.af((long) (acVar.ah * 1172750087));
            if (hyVar != null) {
                int i3 = hyVar.af * 669823817;
                if (ao.aa(i3, (byte) -95)) {
                    gs.eg(en.ay[i3], -1, i, i2, z, 1760437802);
                }
            }
            if (-586529633 * acVar.au != ac.af) {
            }
        } catch (Throwable e) {
            throw ba.ad(e, "af.et(" + ')');
        }
    }
}
