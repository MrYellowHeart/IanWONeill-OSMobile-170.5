package p000;

public class ed extends ez {
    static final int aj = 10;
    static final int bn = 43;
    static int gf;
    eg aa;
    eg af;

    ed() {
        try {
            this.af = eg.af;
            this.aa = eg.af;
        } catch (Throwable e) {
            throw ba.ad(e, "ed.<init>(" + ')');
        }
    }

    void af(int i) {
        try {
            this.af = eg.af;
        } catch (Throwable e) {
            throw ba.ad(e, "ed.af(" + ')');
        }
    }

    void bc() {
        this.af = eg.af;
    }

    void bz() {
        this.af = eg.af;
    }

    public final boolean an(byte b) {
        try {
            if (this.af == eg.af) {
                aa(1873700604);
            }
            if (eg.ad == this.af) {
                return true;
            }
            return false;
        } catch (Throwable e) {
            throw ba.ad(e, "ed.an(" + ')');
        }
    }

    public final boolean bg() {
        if (this.af == eg.af) {
            aa(1873700604);
        }
        if (eg.ad == this.af) {
            return true;
        }
        return false;
    }

    public final boolean bh() {
        if (this.af == eg.af) {
            aa(1873700604);
        }
        if (eg.ad == this.af) {
            return true;
        }
        return false;
    }

    void aa(int i) {
        try {
            this.af = dm.ow.ag.aa(this.ad, (byte) 0) ? eg.ad : eg.an;
        } catch (Throwable e) {
            throw ba.ad(e, "ed.aa(" + ')');
        }
    }

    void bf() {
        eg egVar;
        if (dm.ow.ag.aa(this.ad, (byte) 0)) {
            egVar = eg.ad;
        } else {
            egVar = eg.an;
        }
        this.af = egVar;
    }

    void bp() {
        this.af = dm.ow.ag.aa(this.ad, (byte) 0) ? eg.ad : eg.an;
    }

    void bv() {
        this.af = dm.ow.ag.aa(this.ad, (byte) 0) ? eg.ad : eg.an;
    }

    void ag(int i) {
        try {
            this.aa = eg.af;
        } catch (Throwable e) {
            throw ba.ad(e, "ed.ag(" + ')');
        }
    }

    void bt() {
        this.aa = eg.af;
    }

    void bu() {
        this.aa = eg.af;
    }

    void bx() {
        this.aa = eg.af;
    }

    public final boolean be() {
        if (this.aa == eg.af) {
            bb((byte) -26);
        }
        return this.aa == eg.ad;
    }

    public final boolean bw(int i) {
        try {
            if (this.aa == eg.af) {
                bb((byte) -68);
            }
            if (this.aa == eg.ad) {
                return true;
            }
            return false;
        } catch (Throwable e) {
            throw ba.ad(e, "ed.bw(" + ')');
        }
    }

    void bb(byte b) {
        try {
            this.aa = dm.ow.ay.aa(this.ad, (byte) 0) ? eg.ad : eg.an;
        } catch (Throwable e) {
            throw ba.ad(e, "ed.bb(" + ')');
        }
    }

    static final int ae(int i, int i2, int i3, int i4) {
        try {
            int i5 = i / i3;
            int i6 = (i3 - 1) & i;
            int i7 = i2 / i3;
            return ae.aq(ae.aq(gz.am(i5, i7, (byte) 64), gz.am(i5 + 1, i7, (byte) 64), i6, i3, 706362585), ae.aq(gz.am(i5, i7 + 1, (byte) 64), gz.am(i5 + 1, i7 + 1, (byte) 64), i6, i3, 351501968), (i3 - 1) & i2, i3, -1784009818);
        } catch (Throwable e) {
            throw ba.ad(e, "ed.ae(" + ')');
        }
    }

    static int aq(int i, gk gkVar, boolean z, int i2) {
        if (z) {
            try {
                ac acVar = mn.ab;
            } catch (Throwable e) {
                throw ba.ad(e, "ed.aq(" + ')');
            }
        }
        acVar = hr.at;
        int[] iArr;
        int i3;
        if (i == 1800) {
            iArr = hr.as;
            i3 = hr.ar - 1194553915;
            hr.ar = i3;
            iArr[(i3 * 537618701) - 1] = (ah.fy(acVar, -1096997840) >> 11) & 63;
            return 1;
        } else if (i == 1801) {
            iArr = hr.as;
            i3 = hr.ar - -1194553915;
            hr.ar = i3;
            r2 = iArr[i3 * 537618701] - 1;
            if (acVar.ds == null || r2 >= acVar.ds.length || acVar.ds[r2] == null) {
                r0 = hr.aj;
                r2 = hr.ae - 1246602361;
                hr.ae = r2;
                r0[(r2 * -1267697097) - 1] = "";
            } else {
                String[] strArr = hr.aj;
                int i4 = hr.ae - 1246602361;
                hr.ae = i4;
                strArr[(i4 * -1267697097) - 1] = acVar.ds[r2];
            }
            return 1;
        } else if (1802 != i) {
            return 2;
        } else {
            if (acVar.dw == null) {
                r0 = hr.aj;
                r2 = hr.ae - 1246602361;
                hr.ae = r2;
                r0[(r2 * -1267697097) - 1] = "";
            } else {
                String[] strArr2 = hr.aj;
                i3 = hr.ae - 1246602361;
                hr.ae = i3;
                strArr2[(i3 * -1267697097) - 1] = acVar.dw;
            }
            return 1;
        }
    }

    static int am(int i, gk gkVar, boolean z, int i2) {
        ac ad;
        if (i >= 2000) {
            i -= 1000;
            try {
                int[] iArr = hr.as;
                int i3 = hr.ar - -1194553915;
                hr.ar = i3;
                ad = hv.ad(iArr[i3 * 537618701], 55056764);
            } catch (Throwable e) {
                throw ba.ad(e, "ed.am(" + ')');
            }
        } else if (z) {
            ad = mn.ab;
        } else {
            ad = hr.at;
        }
        if (i != 1927) {
            return 2;
        }
        if (-1622399821 * hr.ah >= 10) {
            throw new RuntimeException();
        } else if (ad.ei == null) {
            return 0;
        } else {
            kd hvVar = new hv();
            hvVar.an = ad;
            hvVar.af = ad.ei;
            hvVar.aq = (hr.ah * 352769343) + 1132317509;
            client.kz.ad(hvVar);
            return 1;
        }
    }

    static kh al(int i, boolean z, boolean z2, boolean z3, int i2) {
        mr mrVar = null;
        try {
            if (mo.aq != null) {
                mrVar = new mr(i, mo.aq, nu.at[i], 1000000);
            }
            return new kh(mrVar, ba.pg, i, z, z2, z3);
        } catch (Throwable e) {
            throw ba.ad(e, "ed.al(" + ')');
        }
    }
}
