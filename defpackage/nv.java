package p000;

public class nv {
    static final nv aa = new nv(3, 3, "", "");
    static final nv ad = new nv(2, 1, "", "");
    public static final nv af = new nv(4, 0, "", "");
    static final nv ag = new nv(5, 4, "", "");
    public static final nv aj = new nv(8, -1, "", "", true, new nv[]{af, ad, an, ag, aa});
    static final nv an = new nv(6, 2, "", "");
    static final nv ar = new nv(0, 7, "", "");
    static final nv as = new nv(7, 6, "", "");
    static final nv ay = new nv(1, 5, "", "");
    static final int br = 49;
    public final int ae;
    final String aq;

    nv(int i, int i2, String str, String str2) {
        try {
            this.ae = 771474005 * i;
            this.aq = str2;
        } catch (Throwable e) {
            throw ba.ad(e, "nv.<init>(" + ')');
        }
    }

    nv(int i, int i2, String str, String str2, boolean z, nv[] nvVarArr) {
        try {
            this.ae = 771474005 * i;
            this.aq = str2;
        } catch (Throwable e) {
            throw ba.ad(e, "nv.<init>(" + ')');
        }
    }

    public String ca() {
        return this.aq;
    }

    public String cw() {
        return this.aq;
    }

    public String cx() {
        return this.aq;
    }

    public String toString() {
        try {
            return this.aq;
        } catch (Throwable e) {
            throw ba.ad(e, "nv.toString(" + ')');
        }
    }

    static void eu(int i, String str, byte b) {
        Object obj = 1;
        try {
            int i2 = -1675758365 * gw.ay;
            int[] iArr = gw.as;
            ey eyVar = new ey(str, hn.ar);
            int i3 = 0;
            while (i3 < i2) {
                ga gaVar = client.hb[iArr[i3]];
                if (gaVar == null || gf.ho == gaVar || gaVar.af == null || !gaVar.af.equals(eyVar)) {
                    i3++;
                } else {
                    no ad;
                    if (1 == i) {
                        ad = ik.ad(nr.am, client.dv.ag, (byte) 42);
                        ad.an.co(iArr[i3], 1974943270);
                        ad.an.bd(0, 1703184995);
                        client.dv.an(ad, (short) 255);
                    } else if (i == 4) {
                        ad = ik.ad(nr.al, client.dv.ag, (byte) -29);
                        ad.an.an(0, (byte) 31);
                        ad.an.cc(iArr[i3], (byte) 1);
                        client.dv.an(ad, (short) 255);
                    } else if (6 == i) {
                        ad = ik.ad(nr.as, client.dv.ag, (byte) -19);
                        ad.an.ci(iArr[i3], 1239940751);
                        ad.an.bd(0, 1703184995);
                        client.dv.an(ad, (short) 255);
                    } else if (7 == i) {
                        ad = ik.ad(nr.av, client.dv.ag, (byte) -93);
                        ad.an.cc(iArr[i3], (byte) 1);
                        ad.an.bd(0, 1703184995);
                        client.dv.an(ad, (short) 255);
                    }
                    if (obj == null) {
                        ax.af(4, "", jv.fj + str, 1651337348);
                    }
                }
            }
            obj = null;
            if (obj == null) {
                ax.af(4, "", jv.fj + str, 1651337348);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "nv.eu(" + ')');
        }
    }
}
