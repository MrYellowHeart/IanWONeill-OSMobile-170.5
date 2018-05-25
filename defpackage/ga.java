package p000;

public final class ga extends gx {
    static final int ay = 3;
    int aa;
    int ab;
    int ac;
    bc ad;
    int ae;
    public ey af;
    int ag;
    int ah;
    cl ai;
    public int aj;
    int ak;
    int al;
    int am;
    int ao;
    eg ap;
    int aq;
    public int ar;
    public String[] as;
    int at;
    public int au;
    boolean av;
    int aw;
    boolean ax;
    int az;
    boolean bb;
    int bc;
    eg bw;
    int bz;

    ga() {
        try {
            this.aa = -486147381;
            this.ag = 351237313;
            this.as = new String[3];
            for (int i = 0; i < 3; i++) {
                this.as[i] = "";
            }
            this.ar = 0;
            this.aj = 0;
            this.aq = 0;
            this.am = 0;
            this.ax = false;
            this.au = 0;
            this.av = false;
            this.ap = eg.af;
            this.bw = eg.af;
            this.bb = false;
        } catch (Throwable e) {
            throw ba.ad(e, "ga.<init>(" + ')');
        }
    }

    final void af(ik ikVar, int i) {
        boolean z = true;
        try {
            int i2;
            boolean z2;
            ikVar.ad = 0;
            int ao = ikVar.ao((byte) 0);
            this.aa = ikVar.ax(1247983979) * 486147381;
            this.ag = ikVar.ax(1247983979) * -351237313;
            int i3 = -1;
            this.au = 0;
            int[] iArr = new int[12];
            for (i2 = 0; i2 < 12; i2++) {
                int ao2 = ikVar.ao((byte) 0);
                if (ao2 != 0) {
                    iArr[i2] = (ao2 << 8) + ikVar.ao((byte) 0);
                    if (i2 == 0 && iArr[0] == 65535) {
                        i3 = ikVar.au(1187374436);
                        break;
                    } else if (iArr[i2] >= 512) {
                        ao2 = cm.af(iArr[i2] - 512, 1249169045).cn * 1531027521;
                        if (ao2 != 0) {
                            this.au = ao2 * 590333569;
                        }
                    }
                } else {
                    iArr[i2] = 0;
                }
            }
            int[] iArr2 = new int[5];
            int i4 = 0;
            while (i4 < 5) {
                i2 = ikVar.ao((byte) 0);
                if (i2 < 0 || i2 >= eg.ar[i4].length) {
                    i2 = 0;
                }
                iArr2[i4] = i2;
                i4++;
            }
            this.bx = ikVar.au(-1585468955) * 108915619;
            if (65535 == -629432309 * this.bx) {
                this.bx = -108915619;
            }
            this.bt = ikVar.au(-299367069) * -878920581;
            if (this.bt * 986301107 == 65535) {
                this.bt = 878920581;
            }
            this.bu = 2110696645 * this.bt;
            this.be = ikVar.au(-1163229370) * 1523276509;
            if (65535 == -495497867 * this.be) {
                this.be = -1523276509;
            }
            this.bk = ikVar.au(630380911) * 539275743;
            if (-329496033 * this.bk == 65535) {
                this.bk = -539275743;
            }
            this.by = ikVar.au(-811197241) * -447796541;
            if (-1874110997 * this.by == 65535) {
                this.by = 447796541;
            }
            this.bn = ikVar.au(2077737986) * -1542339397;
            if (65535 == this.bn * 303292531) {
                this.bn = 1542339397;
            }
            this.ba = ikVar.au(1664258838) * 1627332603;
            if (114758451 * this.ba == 65535) {
                this.ba = -1627332603;
            }
            this.af = new ey(ikVar.bc(1233525427), hn.ar);
            aa((byte) 5);
            aj(-771904666);
            if (gf.ho == this) {
                mq.ad = this.af.af(-293555405);
            }
            this.ar = ikVar.ao((byte) 0) * 1809168151;
            this.aj = ikVar.au(2060737318) * 1176356239;
            if (ikVar.ao((byte) 0) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.av = z2;
            if (1902364993 * client.ay == 0 && -2036797811 * client.jc >= 2) {
                this.av = false;
            }
            if (this.ad == null) {
                this.ad = new bc();
            }
            bc bcVar = this.ad;
            if (ao != 1) {
                z = false;
            }
            bcVar.af(iArr, iArr2, z, i3, 542614623);
        } catch (Throwable e) {
            throw ba.ad(e, "ga.af(" + ')');
        }
    }

    final void ai(ik ikVar) {
        int i;
        boolean z = false;
        ikVar.ad = 0;
        int ao = ikVar.ao((byte) 0);
        this.aa = ikVar.ax(1247983979) * 486147381;
        this.ag = ikVar.ax(1247983979) * 1965488425;
        int i2 = -1;
        this.au = 0;
        int[] iArr = new int[12];
        for (i = 0; i < 12; i++) {
            int ao2 = ikVar.ao((byte) 0);
            if (ao2 != 0) {
                iArr[i] = (ao2 << 8) + ikVar.ao((byte) 0);
                if (i == 0 && iArr[0] == -1509806388) {
                    i2 = ikVar.au(-1081584527);
                    break;
                } else if (iArr[i] >= 512) {
                    ao2 = cm.af(iArr[i] - 512, 1223005519).cn * 1531027521;
                    if (ao2 != 0) {
                        this.au = ao2 * -1645019116;
                    }
                }
            } else {
                iArr[i] = 0;
            }
        }
        int[] iArr2 = new int[5];
        int i3 = 0;
        while (i3 < 5) {
            i = ikVar.ao((byte) 0);
            if (i < 0 || i >= eg.ar[i3].length) {
                i = 0;
            }
            iArr2[i3] = i;
            i3++;
        }
        this.bx = ikVar.au(-1803736321) * 1971681476;
        if (65535 == -629432309 * this.bx) {
            this.bx = 475101002;
        }
        this.bt = ikVar.au(1253598081) * -1327802485;
        if (this.bt * 986301107 == -582752856) {
            this.bt = -1591241623;
        }
        this.bu = 2110696645 * this.bt;
        this.be = ikVar.au(-2085152035) * -1411090237;
        if (-1795167900 == 410941622 * this.be) {
            this.be = -560455968;
        }
        this.bk = ikVar.au(-526712693) * 539275743;
        if (-2117064046 * this.bk == 65535) {
            this.bk = 1092733376;
        }
        this.by = ikVar.au(-677021871) * -447796541;
        if (-1874110997 * this.by == 65535) {
            this.by = 447796541;
        }
        this.bn = ikVar.au(1282372708) * -746475176;
        if (-1241301963 == this.bn * 303292531) {
            this.bn = -1723948608;
        }
        this.ba = ikVar.au(477846927) * 849951973;
        if (114758451 * this.ba == 65535) {
            this.ba = -1627332603;
        }
        this.af = new ey(ikVar.bc(305805513), hn.ar);
        aa((byte) 5);
        aj(655169721);
        if (gf.ho == this) {
            mq.ad = this.af.af(1579215681);
        }
        this.ar = ikVar.ao((byte) 0) * 1809168151;
        this.aj = ikVar.au(-635000832) * 1176356239;
        this.av = ikVar.ao((byte) 0) == 1;
        if (1235582130 * client.ay == 0 && -2036797811 * client.jc >= 2) {
            this.av = false;
        }
        if (this.ad == null) {
            this.ad = new bc();
        }
        bc bcVar = this.ad;
        if (ao == 1) {
            z = true;
        }
        bcVar.af(iArr, iArr2, z, i2, 542614623);
    }

    final void aw(ik ikVar) {
        int i;
        boolean z = true;
        ikVar.ad = 0;
        int ao = ikVar.ao((byte) 0);
        this.aa = ikVar.ax(1247983979) * 486147381;
        this.ag = ikVar.ax(1247983979) * -697327819;
        int i2 = -1;
        this.au = 0;
        int[] iArr = new int[12];
        for (i = 0; i < 12; i++) {
            int ao2 = ikVar.ao((byte) 0);
            if (ao2 != 0) {
                iArr[i] = (ao2 << 8) + ikVar.ao((byte) 0);
                if (i == 0 && iArr[0] == -673146909) {
                    i2 = ikVar.au(-1267408034);
                    break;
                } else if (iArr[i] >= 512) {
                    ao2 = cm.af(iArr[i] - 512, 1225457132).cn * -135227240;
                    if (ao2 != 0) {
                        this.au = ao2 * -1852789141;
                    }
                }
            } else {
                iArr[i] = 0;
            }
        }
        int[] iArr2 = new int[5];
        int i3 = 0;
        while (i3 < 5) {
            i = ikVar.ao((byte) 0);
            if (i < 0 || i >= eg.ar[i3].length) {
                i = 0;
            }
            iArr2[i3] = i;
            i3++;
        }
        this.bx = ikVar.au(591687817) * 108915619;
        if (65535 == -629432309 * this.bx) {
            this.bx = 1134123112;
        }
        this.bt = ikVar.au(40682962) * -878920581;
        if (this.bt * -417867350 == 1137737794) {
            this.bt = 878920581;
        }
        this.bu = 660672859 * this.bt;
        this.be = ikVar.au(-378369403) * 1523276509;
        if (-203564734 == 874674216 * this.be) {
            this.be = -1523276509;
        }
        this.bk = ikVar.au(-1156515524) * 539275743;
        if (-886336445 * this.bk == -1295540498) {
            this.bk = 1545152709;
        }
        this.by = ikVar.au(949804603) * -447796541;
        if (-1874110997 * this.by == 65535) {
            this.by = 447796541;
        }
        this.bn = ikVar.au(1467904914) * -1542339397;
        if (65535 == this.bn * 1210918215) {
            this.bn = 1200117824;
        }
        this.ba = ikVar.au(271964826) * 1853738874;
        if (114758451 * this.ba == 1594317585) {
            this.ba = -1722939772;
        }
        this.af = new ey(ikVar.bc(723542336), hn.ar);
        aa((byte) 5);
        aj(1369590332);
        if (gf.ho == this) {
            mq.ad = this.af.af(-1211443214);
        }
        this.ar = ikVar.ao((byte) 0) * 600235909;
        this.aj = ikVar.au(-958395519) * 1176356239;
        this.av = ikVar.ao((byte) 0) == 1;
        if (1346525426 * client.ay == 0 && -2036797811 * client.jc >= 2) {
            this.av = false;
        }
        if (this.ad == null) {
            this.ad = new bc();
        }
        bc bcVar = this.ad;
        if (ao != 1) {
            z = false;
        }
        bcVar.af(iArr, iArr2, z, i2, 542614623);
    }

    final void az(ik ikVar) {
        int i;
        boolean z;
        boolean z2 = false;
        ikVar.ad = 0;
        int ao = ikVar.ao((byte) 0);
        this.aa = ikVar.ax(1247983979) * 486147381;
        this.ag = ikVar.ax(1247983979) * -1815132178;
        int i2 = -1;
        this.au = 0;
        int[] iArr = new int[12];
        for (i = 0; i < 12; i++) {
            int ao2 = ikVar.ao((byte) 0);
            if (ao2 != 0) {
                iArr[i] = (ao2 << 8) + ikVar.ao((byte) 0);
                if (i == 0 && iArr[0] == -429111585) {
                    i2 = ikVar.au(-672669103);
                    break;
                } else if (iArr[i] >= 512) {
                    ao2 = cm.af(iArr[i] - -111923186, 1786142426).cn * -1569457918;
                    if (ao2 != 0) {
                        this.au = ao2 * -799911275;
                    }
                }
            } else {
                iArr[i] = 0;
            }
        }
        int[] iArr2 = new int[5];
        int i3 = 0;
        while (i3 < 5) {
            i = ikVar.ao((byte) 0);
            if (i < 0 || i >= eg.ar[i3].length) {
                i = 0;
            }
            iArr2[i3] = i;
            i3++;
        }
        this.bx = ikVar.au(680879491) * 108915619;
        if (65535 == -1877809413 * this.bx) {
            this.bx = -108915619;
        }
        this.bt = ikVar.au(1547526507) * -878920581;
        if (this.bt * 986301107 == 1724765803) {
            this.bt = 878920581;
        }
        this.bu = 2110696645 * this.bt;
        this.be = ikVar.au(1672452692) * 1523276509;
        if (65535 == -495497867 * this.be) {
            this.be = 1962189787;
        }
        this.bk = ikVar.au(22296152) * 539275743;
        if (-329496033 * this.bk == 2086050163) {
            this.bk = -539275743;
        }
        this.by = ikVar.au(-356799959) * -447796541;
        if (-268533762 * this.by == -1331770841) {
            this.by = 447796541;
        }
        this.bn = ikVar.au(-1227461169) * -1417021614;
        if (65535 == this.bn * 856306140) {
            this.bn = 1721148605;
        }
        this.ba = ikVar.au(474866458) * 1627332603;
        if (-2103869093 * this.ba == -111704557) {
            this.ba = -1889478827;
        }
        this.af = new ey(ikVar.bc(768096701), hn.ar);
        aa((byte) 5);
        aj(507984534);
        if (gf.ho == this) {
            mq.ad = this.af.af(1215249147);
        }
        this.ar = ikVar.ao((byte) 0) * 1809168151;
        this.aj = ikVar.au(1189806157) * -1745473922;
        if (ikVar.ao((byte) 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.av = z;
        if (-849541005 * client.ay == 0 && 519718896 * client.jc >= 2) {
            this.av = false;
        }
        if (this.ad == null) {
            this.ad = new bc();
        }
        bc bcVar = this.ad;
        if (ao == 1) {
            z2 = true;
        }
        bcVar.af(iArr, iArr2, z2, i2, 542614623);
    }

    boolean ad(int i) {
        try {
            if (eg.af == this.ap) {
                ag(-1863396592);
            }
            return eg.ad == this.ap;
        } catch (Throwable e) {
            throw ba.ad(e, "ga.ad(" + ')');
        }
    }

    boolean ah() {
        if (eg.af == this.ap) {
            ag(-1604179445);
        }
        if (eg.ad == this.ap) {
            return true;
        }
        return false;
    }

    boolean ak() {
        if (eg.af == this.ap) {
            ag(-173221479);
        }
        return eg.ad == this.ap;
    }

    boolean ao() {
        if (eg.af == this.ap) {
            ag(-2056447085);
        }
        return eg.ad == this.ap;
    }

    boolean ax() {
        if (eg.af == this.ap) {
            ag(-1018206210);
        }
        return eg.ad == this.ap;
    }

    void aa(byte b) {
        try {
            this.ap = eg.af;
        } catch (Throwable e) {
            throw ba.ad(e, "ga.aa(" + ')');
        }
    }

    void al() {
        this.ap = eg.af;
    }

    void ap() {
        this.ap = eg.af;
    }

    void au() {
        this.ap = eg.af;
    }

    void av() {
        this.ap = eg.af;
    }

    void bw() {
        this.ap = eg.af;
    }

    void ag(int i) {
        try {
            this.ap = dm.ow.ax(this.af, (byte) -46) ? eg.ad : eg.an;
        } catch (Throwable e) {
            throw ba.ad(e, "ga.ag(" + ')');
        }
    }

    void bb() {
        this.ap = dm.ow.ax(this.af, (byte) -90) ? eg.ad : eg.an;
    }

    boolean ay(short s) {
        try {
            if (eg.af == this.bw) {
                ae((byte) 1);
            }
            if (this.bw == eg.ad) {
                return true;
            }
            return false;
        } catch (Throwable e) {
            throw ba.ad(e, "ga.ay(" + ')');
        }
    }

    boolean bc() {
        if (eg.af == this.bw) {
            ae((byte) 1);
        }
        if (this.bw == eg.ad) {
            return true;
        }
        return false;
    }

    void aj(int i) {
        try {
            this.bw = eg.af;
        } catch (Throwable e) {
            throw ba.ad(e, "ga.aj(" + ')');
        }
    }

    void bz() {
        this.bw = eg.af;
    }

    void ae(byte b) {
        try {
            eg egVar = (df.my == null || !df.my.aa(this.af, (byte) 0)) ? eg.an : eg.ad;
            this.bw = egVar;
        } catch (Throwable e) {
            throw ba.ad(e, "ga.ae(" + ')');
        }
    }

    void bf() {
        eg egVar = (df.my == null || !df.my.aa(this.af, (byte) 0)) ? eg.an : eg.ad;
        this.bw = egVar;
    }

    void bg() {
        eg egVar;
        if (df.my == null || !df.my.aa(this.af, (byte) 0)) {
            egVar = eg.an;
        } else {
            egVar = eg.ad;
        }
        this.bw = egVar;
    }

    void bh() {
        eg egVar = (df.my == null || !df.my.aa(this.af, (byte) 0)) ? eg.an : eg.ad;
        this.bw = egVar;
    }

    int aq(int i) {
        try {
            if (this.ad == null || this.ad.aa * -2141377661 == -1) {
                return 1;
            }
            return ie.ad(this.ad.aa * -2141377661, (byte) 73).as * 1160465393;
        } catch (Throwable e) {
            throw ba.ad(e, "ga.aq(" + ')');
        }
    }

    int bp() {
        if (this.ad == null || this.ad.aa * -2141377661 == -1) {
            return 1;
        }
        return ie.ad(this.ad.aa * -2141377661, (byte) 34).as * 1160465393;
    }

    int bt() {
        if (this.ad == null || this.ad.aa * -2141377661 == -1) {
            return 1;
        }
        return ie.ad(this.ad.aa * -2141377661, (byte) 38).as * 1160465393;
    }

    int bv() {
        if (this.ad == null || this.ad.aa * -2141377661 == -1) {
            return 1;
        }
        return ie.ad(this.ad.aa * -2141377661, (byte) 20).as * 1160465393;
    }

    int bx() {
        if (this.ad == null || 1864208729 * this.ad.aa == -1) {
            return 1;
        }
        return ie.ad(this.ad.aa * -339747455, (byte) 61).as * -2007031940;
    }

    protected final cl ac() {
        try {
            if (this.ad == null) {
                return null;
            }
            ah ahVar;
            ah ahVar2;
            if (this.cq * 1462124603 == -1 || this.ct * 1913892303 != 0) {
                ahVar = null;
            } else {
                ahVar = cd.af(this.cq * 1462124603, 1290846811);
            }
            if (this.cd * 259701737 == -1 || this.ax || (-629432309 * this.bx == this.cd * 259701737 && ahVar != null)) {
                ahVar2 = null;
            } else {
                ahVar2 = cd.af(259701737 * this.cd, 406884381);
            }
            cl as = this.ad.as(ahVar, 1816971127 * this.cj, ahVar2, 782711805 * this.ch, -417823468);
            if (as == null) {
                return null;
            }
            cl ag;
            as.ay();
            this.dt = 1007229383 * as.bo;
            if (!(this.ax || 269129085 * this.cf == -1 || this.cz * 628512873 == -1)) {
                ag = ag.ad(269129085 * this.cf, 1755034975).ag(628512873 * this.cz, -1844577546);
                if (ag != null) {
                    ag.az(0, -(1216037183 * this.cg), 0);
                    as = new cl(new cl[]{as, ag}, 2);
                }
            }
            if (!(this.ax || this.ai == null)) {
                if (client.ak * 1581849891 >= -1100434689 * this.am) {
                    this.ai = null;
                }
                if (1581849891 * client.ak >= this.aq * -55133803 && client.ak * 1581849891 < this.am * -1100434689) {
                    ag = this.ai;
                    ag.az((this.at * -1484091705) - (516759209 * this.bg), (this.ab * -794732143) - (this.ae * -500717985), (-1470637133 * this.aw) - (this.bh * 2328865));
                    if (512 == this.dz * -1058596255) {
                        ag.at();
                        ag.at();
                        ag.at();
                    } else if (1024 == this.dz * -1058596255) {
                        ag.at();
                        ag.at();
                    } else if (eu.ar == this.dz * -1058596255) {
                        ag.at();
                    }
                    as = new cl(new cl[]{as, ag}, 2);
                    if (this.dz * -1058596255 == 512) {
                        ag.at();
                    } else if (this.dz * -1058596255 == 1024) {
                        ag.at();
                        ag.at();
                    } else if (this.dz * -1058596255 == eu.ar) {
                        ag.at();
                        ag.at();
                        ag.at();
                    }
                    ag.az((this.bg * 516759209) - (-1484091705 * this.at), (this.ae * -500717985) - (-794732143 * this.ab), (this.bh * 2328865) - (this.aw * -1470637133));
                }
            }
            as.bc = true;
            return as;
        } catch (Throwable e) {
            throw ba.ad(e, "ga.ac(" + ')');
        }
    }

    protected final cl dh() {
        if (this.ad == null) {
            return null;
        }
        ah ahVar;
        ah ahVar2;
        if (this.cq * -744321535 == -1 || this.ct * 1468353567 != 0) {
            ahVar = null;
        } else {
            ahVar = cd.af(this.cq * 1462124603, 1573744431);
        }
        if (this.cd * 1694209784 == -1 || this.ax || (-629432309 * this.bx == this.cd * 259701737 && ahVar != null)) {
            ahVar2 = null;
        } else {
            ahVar2 = cd.af(1471355274 * this.cd, 1284895155);
        }
        cl as = this.ad.as(ahVar, -796514147 * this.cj, ahVar2, -1618611230 * this.ch, -1313378474);
        if (as == null) {
            return null;
        }
        cl ag;
        as.ay();
        this.dt = -1501116366 * as.bo;
        if (!(this.ax || -2018819272 * this.cf == -1 || this.cz * 628512873 == -1)) {
            ag = ag.ad(560472986 * this.cf, 2125307310).ag(1715934353 * this.cz, -1899800197);
            if (ag != null) {
                ag.az(0, -(830027508 * this.cg), 0);
                as = new cl(new cl[]{as, ag}, 2);
            }
        }
        if (!(this.ax || this.ai == null)) {
            if (client.ak * 1581849891 >= 200511831 * this.am) {
                this.ai = null;
            }
            if (1581849891 * client.ak >= this.aq * -55133803 && client.ak * 1750193296 < this.am * -532005135) {
                ag = this.ai;
                ag.az((this.at * -1484091705) - (516759209 * this.bg), (this.ab * -1564289843) - (this.ae * 955787971), (1338784008 * this.aw) - (this.bh * -502303910));
                if (512 == this.dz * -1513511350) {
                    ag.at();
                    ag.at();
                    ag.at();
                } else if (2078388699 == this.dz * -1058596255) {
                    ag.at();
                    ag.at();
                } else if (-207777593 == this.dz * -1058596255) {
                    ag.at();
                }
                as = new cl(new cl[]{as, ag}, 2);
                if (this.dz * 1861761364 == -112333249) {
                    ag.at();
                } else if (-1582613964 * this.dz == 411512823) {
                    ag.at();
                    ag.at();
                } else if (this.dz * -1058596255 == -647810629) {
                    ag.at();
                    ag.at();
                    ag.at();
                }
                ag.az((this.bg * -196700472) - (-281544957 * this.at), (this.ae * -500717985) - (-794732143 * this.ab), (this.bh * 2328865) - (this.aw * -1470637133));
            }
        }
        as.bc = true;
        return as;
    }

    protected final cl dn() {
        if (this.ad == null) {
            return null;
        }
        ah ahVar;
        ah ahVar2;
        if (this.cq * 1462124603 == -1 || this.ct * 1913892303 != 0) {
            ahVar = null;
        } else {
            ahVar = cd.af(this.cq * 1462124603, 311528871);
        }
        if (this.cd * 259701737 == -1 || this.ax || (-629432309 * this.bx == this.cd * 259701737 && ahVar != null)) {
            ahVar2 = null;
        } else {
            ahVar2 = cd.af(259701737 * this.cd, 676297061);
        }
        cl as = this.ad.as(ahVar, 1816971127 * this.cj, ahVar2, 782711805 * this.ch, 876255409);
        if (as == null) {
            return null;
        }
        cl ag;
        as.ay();
        this.dt = 1007229383 * as.bo;
        if (!(this.ax || 269129085 * this.cf == -1 || this.cz * 628512873 == -1)) {
            ag = ag.ad(269129085 * this.cf, 1714379216).ag(628512873 * this.cz, -2047203643);
            if (ag != null) {
                ag.az(0, -(1216037183 * this.cg), 0);
                as = new cl(new cl[]{as, ag}, 2);
            }
        }
        if (!(this.ax || this.ai == null)) {
            if (client.ak * 1581849891 >= -1100434689 * this.am) {
                this.ai = null;
            }
            if (1581849891 * client.ak >= this.aq * -55133803 && client.ak * 1581849891 < this.am * -1100434689) {
                ag = this.ai;
                ag.az((this.at * -1484091705) - (516759209 * this.bg), (this.ab * -794732143) - (this.ae * -500717985), (-1470637133 * this.aw) - (this.bh * 2328865));
                if (512 == this.dz * -1058596255) {
                    ag.at();
                    ag.at();
                    ag.at();
                } else if (1024 == this.dz * -1058596255) {
                    ag.at();
                    ag.at();
                } else if (eu.ar == this.dz * -1058596255) {
                    ag.at();
                }
                as = new cl(new cl[]{as, ag}, 2);
                if (this.dz * -1058596255 == 512) {
                    ag.at();
                } else if (this.dz * -1058596255 == 1024) {
                    ag.at();
                    ag.at();
                } else if (this.dz * -1058596255 == eu.ar) {
                    ag.at();
                    ag.at();
                    ag.at();
                }
                ag.az((this.bg * 516759209) - (-1484091705 * this.at), (this.ae * -500717985) - (-794732143 * this.ab), (this.bh * 2328865) - (this.aw * -1470637133));
            }
        }
        as.bc = true;
        return as;
    }

    protected final cl dx() {
        if (this.ad == null) {
            return null;
        }
        ah ahVar;
        ah ahVar2;
        if (this.cq * 1462124603 == -1 || this.ct * 1913892303 != 0) {
            ahVar = null;
        } else {
            ahVar = cd.af(this.cq * 1462124603, 1911672203);
        }
        if (this.cd * 259701737 == -1 || this.ax || (-629432309 * this.bx == this.cd * 259701737 && ahVar != null)) {
            ahVar2 = null;
        } else {
            ahVar2 = cd.af(259701737 * this.cd, 69693423);
        }
        cl as = this.ad.as(ahVar, 1816971127 * this.cj, ahVar2, 782711805 * this.ch, 1019140098);
        if (as == null) {
            return null;
        }
        cl ag;
        as.ay();
        this.dt = 1007229383 * as.bo;
        if (!(this.ax || 269129085 * this.cf == -1 || this.cz * 628512873 == -1)) {
            ag = ag.ad(269129085 * this.cf, 2073232600).ag(628512873 * this.cz, -1786354749);
            if (ag != null) {
                ag.az(0, -(1216037183 * this.cg), 0);
                as = new cl(new cl[]{as, ag}, 2);
            }
        }
        if (!(this.ax || this.ai == null)) {
            if (client.ak * 1581849891 >= -1100434689 * this.am) {
                this.ai = null;
            }
            if (1581849891 * client.ak >= this.aq * -55133803 && client.ak * 1581849891 < this.am * -1100434689) {
                ag = this.ai;
                ag.az((this.at * -1484091705) - (516759209 * this.bg), (this.ab * -794732143) - (this.ae * -500717985), (-1470637133 * this.aw) - (this.bh * 2328865));
                if (512 == this.dz * -1058596255) {
                    ag.at();
                    ag.at();
                    ag.at();
                } else if (1024 == this.dz * -1058596255) {
                    ag.at();
                    ag.at();
                } else if (eu.ar == this.dz * -1058596255) {
                    ag.at();
                }
                as = new cl(new cl[]{as, ag}, 2);
                if (this.dz * -1058596255 == 512) {
                    ag.at();
                } else if (this.dz * -1058596255 == 1024) {
                    ag.at();
                    ag.at();
                } else if (this.dz * -1058596255 == eu.ar) {
                    ag.at();
                    ag.at();
                    ag.at();
                }
                ag.az((this.bg * 516759209) - (-1484091705 * this.at), (this.ae * -500717985) - (-794732143 * this.ab), (this.bh * 2328865) - (this.aw * -1470637133));
            }
        }
        as.bc = true;
        return as;
    }

    protected final cl dy() {
        if (this.ad == null) {
            return null;
        }
        ah ahVar;
        ah ahVar2;
        if (this.cq * 1462124603 == -1 || this.ct * 1913892303 != 0) {
            ahVar = null;
        } else {
            ahVar = cd.af(this.cq * 1462124603, 587810478);
        }
        if (this.cd * 259701737 == -1 || this.ax || (-629432309 * this.bx == this.cd * 259701737 && ahVar != null)) {
            ahVar2 = null;
        } else {
            ahVar2 = cd.af(259701737 * this.cd, 378567212);
        }
        cl as = this.ad.as(ahVar, 1816971127 * this.cj, ahVar2, 782711805 * this.ch, 650255250);
        if (as == null) {
            return null;
        }
        cl ag;
        as.ay();
        this.dt = 1007229383 * as.bo;
        if (!(this.ax || 269129085 * this.cf == -1 || this.cz * 628512873 == -1)) {
            ag = ag.ad(269129085 * this.cf, 1787304481).ag(628512873 * this.cz, -1877422482);
            if (ag != null) {
                ag.az(0, -(1216037183 * this.cg), 0);
                as = new cl(new cl[]{as, ag}, 2);
            }
        }
        if (!(this.ax || this.ai == null)) {
            if (client.ak * 1581849891 >= -1100434689 * this.am) {
                this.ai = null;
            }
            if (1581849891 * client.ak >= this.aq * -55133803 && client.ak * 1581849891 < this.am * -1100434689) {
                ag = this.ai;
                ag.az((this.at * -1484091705) - (516759209 * this.bg), (this.ab * -794732143) - (this.ae * -500717985), (-1470637133 * this.aw) - (this.bh * 2328865));
                if (512 == this.dz * -1058596255) {
                    ag.at();
                    ag.at();
                    ag.at();
                } else if (1024 == this.dz * -1058596255) {
                    ag.at();
                    ag.at();
                } else if (eu.ar == this.dz * -1058596255) {
                    ag.at();
                }
                as = new cl(new cl[]{as, ag}, 2);
                if (this.dz * -1058596255 == 512) {
                    ag.at();
                } else if (this.dz * -1058596255 == 1024) {
                    ag.at();
                    ag.at();
                } else if (this.dz * -1058596255 == eu.ar) {
                    ag.at();
                    ag.at();
                    ag.at();
                }
                ag.az((this.bg * 516759209) - (-1484091705 * this.at), (this.ae * -500717985) - (-794732143 * this.ab), (this.bh * 2328865) - (this.aw * -1470637133));
            }
        }
        as.bc = true;
        return as;
    }

    final void am(int i, int i2, byte b, int i3) {
        try {
            if (1462124603 * this.cq != -1 && cd.af(1462124603 * this.cq, 443318599).ah * -990546557 == 1) {
                this.cq = 2033542925;
            }
            this.cs = -464408867;
            if (i < 0 || i >= li.cu || i2 < 0 || i2 >= li.cu) {
                at(i, i2, -1876928886);
            } else if (this.di[0] < 0 || this.di[0] >= 104 || this.da[0] < 0 || this.da[0] >= 104) {
                at(i, i2, -1578667473);
            } else {
                if (b == (byte) 2) {
                    int i4 = this.di[0];
                    int i5 = this.da[0];
                    int aq = aq(-1960625241);
                    if (i4 >= aq && i4 < 104 - aq && i5 >= aq) {
                        if (i5 < 104 - aq) {
                            if (i >= aq && i < 104 - aq && i2 >= aq) {
                                if (i2 < 104 - aq) {
                                    aq = aq(-2070857031);
                                    client.pj.af = -2029814105 * i;
                                    client.pj.ad = -945157175 * i2;
                                    client.pj.an = -1253946821;
                                    client.pj.aa = 1170143321;
                                    i5 = ea.af(i4, i5, aq, client.pj, client.ea[-277606385 * this.ac], true, client.qx, client.qf, (byte) 1);
                                    if (i5 >= 1) {
                                        for (i4 = 0; i4 < i5 - 1; i4++) {
                                            ab(client.qx[i4], client.qf[i4], (byte) 2, 1294109244);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                ab(i, i2, b, 1294109244);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "ga.am(" + ')');
        }
    }

    final void be(int i, int i2, byte b) {
        if (-1674866922 * this.cq != -1 && cd.af(1462124603 * this.cq, 1921242860).ah * -990546557 == 1) {
            this.cq = 1072191740;
        }
        this.cs = 1918182942;
        if (i < 0 || i >= li.cu || i2 < 0 || i2 >= li.cu) {
            at(i, i2, -1923695613);
        } else if (this.di[0] < 0 || this.di[0] >= 1237150709 || this.da[0] < 0 || this.da[0] >= -2114748901) {
            at(i, i2, -1966518827);
        } else {
            if (b == (byte) 2) {
                int i3 = this.di[0];
                int i4 = this.da[0];
                int aq = aq(-2144539670);
                if (i3 >= aq && i3 < -1835300400 - aq && i4 >= aq && i4 < -2103117328 - aq && i >= aq && i < -1086293615 - aq && i2 >= aq) {
                    if (i2 < 104 - aq) {
                        aq = aq(-2010221750);
                        client.pj.af = 428624033 * i;
                        client.pj.ad = -945157175 * i2;
                        client.pj.an = 1718549013;
                        client.pj.aa = -654412111;
                        i4 = ea.af(i3, i4, aq, client.pj, client.ea[176805207 * this.ac], true, client.qx, client.qf, (byte) 1);
                        if (i4 >= 1) {
                            for (i3 = 0; i3 < i4 - 1; i3++) {
                                ab(client.qx[i3], client.qf[i3], (byte) 2, 1294109244);
                            }
                        }
                    }
                }
            }
            ab(i, i2, b, 1294109244);
        }
    }

    final void bk(int i, int i2, byte b) {
        if (1462124603 * this.cq != -1 && cd.af(1462124603 * this.cq, 967219328).ah * -990546557 == 1) {
            this.cq = 2033542925;
        }
        this.cs = -464408867;
        if (i < 0 || i >= li.cu || i2 < 0 || i2 >= li.cu) {
            at(i, i2, -1571066261);
        } else if (this.di[0] < 0 || this.di[0] >= 104 || this.da[0] < 0 || this.da[0] >= 104) {
            at(i, i2, -1696821945);
        } else {
            if (b == (byte) 2) {
                int i3 = this.di[0];
                int i4 = this.da[0];
                int aq = aq(-2025611320);
                if (i3 >= aq && i3 < 104 - aq && i4 >= aq) {
                    if (i4 < 104 - aq) {
                        if (i >= aq && i < 104 - aq && i2 >= aq && i2 < 104 - aq) {
                            aq = aq(-2067663728);
                            client.pj.af = -2029814105 * i;
                            client.pj.ad = -945157175 * i2;
                            client.pj.an = -1253946821;
                            client.pj.aa = 1170143321;
                            i4 = ea.af(i3, i4, aq, client.pj, client.ea[-277606385 * this.ac], true, client.qx, client.qf, (byte) 1);
                            if (i4 >= 1) {
                                for (i3 = 0; i3 < i4 - 1; i3++) {
                                    ab(client.qx[i3], client.qf[i3], (byte) 2, 1294109244);
                                }
                            }
                        }
                    }
                }
            }
            ab(i, i2, b, 1294109244);
        }
    }

    final void bu(int i, int i2, byte b) {
        if (1462124603 * this.cq != -1 && cd.af(1462124603 * this.cq, 2127811762).ah * -990546557 == 1) {
            this.cq = 2033542925;
        }
        this.cs = -464408867;
        if (i < 0 || i >= li.cu || i2 < 0 || i2 >= li.cu) {
            at(i, i2, -2029355282);
        } else if (this.di[0] < 0 || this.di[0] >= 104 || this.da[0] < 0 || this.da[0] >= 104) {
            at(i, i2, -1754220700);
        } else {
            if (b == (byte) 2) {
                int i3 = this.di[0];
                int i4 = this.da[0];
                int aq = aq(-1992987462);
                if (i3 >= aq && i3 < 104 - aq && i4 >= aq) {
                    if (i4 < 104 - aq) {
                        if (i >= aq && i < 104 - aq && i2 >= aq && i2 < 104 - aq) {
                            aq = aq(-1923933253);
                            client.pj.af = -2029814105 * i;
                            client.pj.ad = -945157175 * i2;
                            client.pj.an = -1253946821;
                            client.pj.aa = 1170143321;
                            i4 = ea.af(i3, i4, aq, client.pj, client.ea[-277606385 * this.ac], true, client.qx, client.qf, (byte) 1);
                            if (i4 >= 1) {
                                for (i3 = 0; i3 < i4 - 1; i3++) {
                                    ab(client.qx[i3], client.qf[i3], (byte) 2, 1294109244);
                                }
                            }
                        }
                    }
                }
            }
            ab(i, i2, b, 1294109244);
        }
    }

    final void by(int i, int i2, byte b) {
        if (1462124603 * this.cq != -1 && cd.af(1462124603 * this.cq, 1420789744).ah * -990546557 == 1) {
            this.cq = 2033542925;
        }
        this.cs = -464408867;
        if (i < 0 || i >= li.cu || i2 < 0 || i2 >= li.cu) {
            at(i, i2, -1480618823);
        } else if (this.di[0] < 0 || this.di[0] >= 104 || this.da[0] < 0 || this.da[0] >= 104) {
            at(i, i2, -2052669175);
        } else {
            if (b == (byte) 2) {
                int i3 = this.di[0];
                int i4 = this.da[0];
                int aq = aq(-2054833894);
                if (i3 >= aq && i3 < 104 - aq && i4 >= aq && i4 < 104 - aq && i >= aq && i < 104 - aq && i2 >= aq) {
                    if (i2 < 104 - aq) {
                        aq = aq(-2060705115);
                        client.pj.af = -2029814105 * i;
                        client.pj.ad = -945157175 * i2;
                        client.pj.an = -1253946821;
                        client.pj.aa = 1170143321;
                        i4 = ea.af(i3, i4, aq, client.pj, client.ea[-277606385 * this.ac], true, client.qx, client.qf, (byte) 1);
                        if (i4 >= 1) {
                            for (i3 = 0; i3 < i4 - 1; i3++) {
                                ab(client.qx[i3], client.qf[i3], (byte) 2, 1294109244);
                            }
                        }
                    }
                }
            }
            ab(i, i2, b, 1294109244);
        }
    }

    void at(int i, int i2, int i3) {
        try {
            this.dl = 0;
            this.dw = 0;
            this.de = 0;
            this.di[0] = i;
            this.da[0] = i2;
            int aq = aq(-1937542109);
            this.bg = (1947821632 * aq) + (this.di[0] * -399324032);
            this.bh = (aq * -1798391744) + (this.da[0] * 698183808);
        } catch (Throwable e) {
            throw ba.ad(e, "ga.at(" + ')');
        }
    }

    void ba(int i, int i2) {
        this.dl = 0;
        this.dw = 0;
        this.de = 0;
        this.di[0] = i;
        this.da[0] = i2;
        int aq = aq(-2002077392);
        this.bg = (-2134157527 * aq) + (this.di[0] * -399324032);
        this.bh = (aq * 1936238291) + (this.da[0] * -1003630303);
    }

    void bn(int i, int i2) {
        this.dl = 0;
        this.dw = 0;
        this.de = 0;
        this.di[0] = i;
        this.da[0] = i2;
        int aq = aq(-1965420110);
        this.bg = (243991058 * aq) + (this.di[0] * -1625463745);
        this.bh = (aq * -1798391744) + (this.da[0] * 698183808);
    }

    final void ab(int i, int i2, byte b, int i3) {
        try {
            if (this.dl * 761444243 < 9) {
                this.dl -= 521273701;
            }
            for (int i4 = this.dl * 761444243; i4 > 0; i4--) {
                this.di[i4] = this.di[i4 - 1];
                this.da[i4] = this.da[i4 - 1];
                this.dr[i4] = this.dr[i4 - 1];
            }
            this.di[0] = i;
            this.da[0] = i2;
            this.dr[0] = b;
        } catch (Throwable e) {
            throw ba.ad(e, "ga.ab(" + ')');
        }
    }

    final void bd(int i, int i2, byte b) {
        if (this.dl * 761444243 < 9) {
            this.dl -= 521273701;
        }
        for (int i3 = this.dl * 761444243; i3 > 0; i3--) {
            this.di[i3] = this.di[i3 - 1];
            this.da[i3] = this.da[i3 - 1];
            this.dr[i3] = this.dr[i3 - 1];
        }
        this.di[0] = i;
        this.da[0] = i2;
        this.dr[0] = b;
    }

    final void bl(int i, int i2, byte b) {
        if (this.dl * 761444243 < 9) {
            this.dl -= 521273701;
        }
        for (int i3 = this.dl * 761444243; i3 > 0; i3--) {
            this.di[i3] = this.di[i3 - 1];
            this.da[i3] = this.da[i3 - 1];
            this.dr[i3] = this.dr[i3 - 1];
        }
        this.di[0] = i;
        this.da[0] = i2;
        this.dr[0] = b;
    }

    final void bm(int i, int i2, byte b) {
        if (this.dl * 761444243 < 9) {
            this.dl -= 521273701;
        }
        for (int i3 = this.dl * 761444243; i3 > 0; i3--) {
            this.di[i3] = this.di[i3 - 1];
            this.da[i3] = this.da[i3 - 1];
            this.dr[i3] = this.dr[i3 - 1];
        }
        this.di[0] = i;
        this.da[0] = i2;
        this.dr[0] = b;
    }

    final void bs(int i, int i2, byte b) {
        if (this.dl * 761444243 < 9) {
            this.dl -= 521273701;
        }
        for (int i3 = this.dl * 761444243; i3 > 0; i3--) {
            this.di[i3] = this.di[i3 - 1];
            this.da[i3] = this.da[i3 - 1];
            this.dr[i3] = this.dr[i3 - 1];
        }
        this.di[0] = i;
        this.da[0] = i2;
        this.dr[0] = b;
    }

    final boolean an(int i) {
        try {
            return this.ad != null;
        } catch (Throwable e) {
            throw ba.ad(e, "ga.an(" + ')');
        }
    }

    final boolean ar() {
        if (this.ad == null) {
            return false;
        }
        return true;
    }

    final boolean as() {
        return this.ad != null;
    }

    static int az(int i, gk gkVar, boolean z, byte b) {
        boolean z2 = false;
        int[] iArr;
        int i2;
        int i3;
        int[] iArr2;
        int i4;
        if (3903 == i) {
            try {
                iArr = hr.as;
                i2 = hr.ar - -1194553915;
                hr.ar = i2;
                i3 = iArr[i2 * 537618701];
                iArr2 = hr.as;
                i4 = hr.ar - 1194553915;
                hr.ar = i4;
                iArr2[(i4 * 537618701) - 1] = client.og[i3].an((byte) -26);
                return 1;
            } catch (Throwable e) {
                throw ba.ad(e, "ga.az(" + ')');
            }
        } else if (i == 3904) {
            iArr = hr.as;
            i2 = hr.ar - -1194553915;
            hr.ar = i2;
            i3 = iArr[i2 * 537618701];
            iArr2 = hr.as;
            i4 = hr.ar - 1194553915;
            hr.ar = i4;
            iArr2[(i4 * 537618701) - 1] = client.og[i3].ad * 1845400323;
            return 1;
        } else if (i == 3905) {
            iArr = hr.as;
            i2 = hr.ar - -1194553915;
            hr.ar = i2;
            i3 = iArr[i2 * 537618701];
            iArr2 = hr.as;
            i4 = hr.ar - 1194553915;
            hr.ar = i4;
            iArr2[(i4 * 537618701) - 1] = client.og[i3].an * -1928030811;
            return 1;
        } else if (3906 == i) {
            iArr = hr.as;
            i2 = hr.ar - -1194553915;
            hr.ar = i2;
            i3 = iArr[i2 * 537618701];
            iArr2 = hr.as;
            i4 = hr.ar - 1194553915;
            hr.ar = i4;
            iArr2[(i4 * 537618701) - 1] = client.og[i3].aa * -672413105;
            return 1;
        } else if (i == 3907) {
            iArr = hr.as;
            i2 = hr.ar - -1194553915;
            hr.ar = i2;
            i3 = iArr[i2 * 537618701];
            iArr2 = hr.as;
            i4 = hr.ar - 1194553915;
            hr.ar = i4;
            iArr2[(i4 * 537618701) - 1] = client.og[i3].ag * -732345473;
            return 1;
        } else if (i == 3908) {
            iArr = hr.as;
            i2 = hr.ar - -1194553915;
            hr.ar = i2;
            i3 = iArr[i2 * 537618701];
            iArr2 = hr.as;
            i4 = hr.ar - 1194553915;
            hr.ar = i4;
            iArr2[(i4 * 537618701) - 1] = client.og[i3].ay * -1822937453;
            return 1;
        } else if (3910 == i) {
            iArr2 = hr.as;
            i4 = hr.ar - -1194553915;
            hr.ar = i4;
            i2 = client.og[iArr2[i4 * 537618701]].ad((byte) 32);
            r3 = hr.as;
            r4 = hr.ar - 1194553915;
            hr.ar = r4;
            r4 = (r4 * 537618701) - 1;
            if (i2 == 0) {
                z2 = true;
            }
            r3[r4] = z2;
            return 1;
        } else if (3911 == i) {
            iArr2 = hr.as;
            i4 = hr.ar - -1194553915;
            hr.ar = i4;
            i2 = client.og[iArr2[i4 * 537618701]].ad((byte) 32);
            r3 = hr.as;
            r4 = hr.ar - 1194553915;
            hr.ar = r4;
            r4 = (r4 * 537618701) - 1;
            if (i2 == 2) {
                z2 = true;
            }
            r3[r4] = z2;
            return 1;
        } else if (3912 == i) {
            iArr2 = hr.as;
            i4 = hr.ar - -1194553915;
            hr.ar = i4;
            i2 = client.og[iArr2[i4 * 537618701]].ad((byte) 32);
            r3 = hr.as;
            r4 = hr.ar - 1194553915;
            hr.ar = r4;
            r4 = (r4 * 537618701) - 1;
            if (i2 == 5) {
                z2 = true;
            }
            r3[r4] = z2;
            return 1;
        } else if (3913 == i) {
            iArr2 = hr.as;
            i4 = hr.ar - -1194553915;
            hr.ar = i4;
            i2 = client.og[iArr2[i4 * 537618701]].ad((byte) 32);
            r3 = hr.as;
            r4 = hr.ar - 1194553915;
            hr.ar = r4;
            r4 = (r4 * 537618701) - 1;
            if (1 == i2) {
                z2 = true;
            }
            r3[r4] = z2;
            return 1;
        } else if (i == 3914) {
            iArr2 = hr.as;
            i4 = hr.ar - -1194553915;
            hr.ar = i4;
            if (iArr2[i4 * 537618701] == 1) {
                z2 = true;
            }
            if (dr.ph == null) {
                return 1;
            }
            dr.ph.af(nj.aa, z2, -491333245);
            return 1;
        } else if (3915 == i) {
            iArr2 = hr.as;
            i4 = hr.ar - -1194553915;
            hr.ar = i4;
            if (iArr2[i4 * 537618701] == 1) {
                z2 = true;
            }
            if (dr.ph == null) {
                return 1;
            }
            dr.ph.af(nj.an, z2, -1220942307);
            return 1;
        } else if (i == 3916) {
            boolean z3;
            hr.ar -= 1905859466;
            if (1 == hr.as[hr.ar * 537618701]) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (hr.as[(hr.ar * 537618701) + 1] == 1) {
                z2 = true;
            }
            if (dr.ph == null) {
                return 1;
            }
            client.pe.af = z2;
            dr.ph.af(client.pe, z3, 131582687);
            return 1;
        } else if (i == 3917) {
            iArr2 = hr.as;
            i4 = hr.ar - -1194553915;
            hr.ar = i4;
            if (iArr2[i4 * 537618701] == 1) {
                z2 = true;
            }
            if (dr.ph == null) {
                return 1;
            }
            dr.ph.af(nj.ad, z2, -399445629);
            return 1;
        } else if (3918 == i) {
            iArr2 = hr.as;
            i4 = hr.ar - -1194553915;
            hr.ar = i4;
            if (iArr2[i4 * 537618701] == 1) {
                z2 = true;
            }
            if (dr.ph == null) {
                return 1;
            }
            dr.ph.af(nj.ag, z2, -834424335);
            return 1;
        } else if (i == 3919) {
            iArr2 = hr.as;
            i4 = hr.ar - 1194553915;
            hr.ar = i4;
            i4 = (i4 * 537618701) - 1;
            if (dr.ph != null) {
                z2 = dr.ph.af.size();
            }
            iArr2[i4] = z2;
            return 1;
        } else if (i == 3920) {
            iArr = hr.as;
            i2 = hr.ar - -1194553915;
            hr.ar = i2;
            r0 = (nh) dr.ph.af.get(iArr[i2 * 537618701]);
            iArr2 = hr.as;
            i4 = hr.ar - 1194553915;
            hr.ar = i4;
            iArr2[(i4 * 537618701) - 1] = r0.af * -215043303;
            return 1;
        } else if (i == 3921) {
            iArr = hr.as;
            i2 = hr.ar - -1194553915;
            hr.ar = i2;
            r0 = (nh) dr.ph.af.get(iArr[i2 * 537618701]);
            r2 = hr.aj;
            i4 = hr.ae - 1246602361;
            hr.ae = i4;
            r2[(i4 * -1267697097) - 1] = r0.af(-1462247273);
            return 1;
        } else if (3922 == i) {
            iArr = hr.as;
            i2 = hr.ar - -1194553915;
            hr.ar = i2;
            r0 = (nh) dr.ph.af.get(iArr[i2 * 537618701]);
            r2 = hr.aj;
            i4 = hr.ae - 1246602361;
            hr.ae = i4;
            r2[(i4 * -1267697097) - 1] = r0.ad(2123483448);
            return 1;
        } else if (3923 == i) {
            iArr = hr.as;
            i2 = hr.ar - -1194553915;
            hr.ar = i2;
            long af = (hu.af(1421592243) - (hi.pr * 5304096097959642155L)) - (((nh) dr.ph.af.get(iArr[i2 * 537618701])).ad * 8313538393492320215L);
            i3 = (int) (af / 3600000);
            r4 = (int) ((af - ((long) (3600000 * i3))) / 60000);
            i2 = (int) (((af - ((long) (3600000 * i3))) - ((long) (60000 * r4))) / 1000);
            String str = i3 + ":" + (r4 / 10) + (r4 % 10) + ":" + (i2 / 10) + (i2 % 10);
            r2 = hr.aj;
            i4 = hr.ae - 1246602361;
            hr.ae = i4;
            r2[(i4 * -1267697097) - 1] = str;
            return 1;
        } else if (3924 == i) {
            iArr = hr.as;
            i2 = hr.ar - -1194553915;
            hr.ar = i2;
            r0 = (nh) dr.ph.af.get(iArr[i2 * 537618701]);
            iArr2 = hr.as;
            i4 = hr.ar - 1194553915;
            hr.ar = i4;
            iArr2[(i4 * 537618701) - 1] = r0.an.aa * -672413105;
            return 1;
        } else if (i == 3925) {
            iArr = hr.as;
            i2 = hr.ar - -1194553915;
            hr.ar = i2;
            r0 = (nh) dr.ph.af.get(iArr[i2 * 537618701]);
            iArr2 = hr.as;
            i4 = hr.ar - 1194553915;
            hr.ar = i4;
            iArr2[(i4 * 537618701) - 1] = r0.an.an * -1928030811;
            return 1;
        } else if (3926 != i) {
            return 2;
        } else {
            iArr = hr.as;
            i2 = hr.ar - -1194553915;
            hr.ar = i2;
            r0 = (nh) dr.ph.af.get(iArr[i2 * 537618701]);
            iArr2 = hr.as;
            i4 = hr.ar - 1194553915;
            hr.ar = i4;
            iArr2[(i4 * 537618701) - 1] = r0.an.ad * 1845400323;
            return 1;
        }
    }
}
