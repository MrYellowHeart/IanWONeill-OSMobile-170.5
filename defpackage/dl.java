package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class dl {
    public static final int at = 15;
    static mb by;
    static int pm;
    static Collection po;
    fx aa;
    boolean ad;
    int ae;
    boolean af;
    HashMap ag;
    final HashMap aj;
    public int am;
    dt an;
    int aq;
    gd[] ar;
    HashMap as;
    dh[][] ay;

    public dl(gd[] gdVarArr, HashMap hashMap) {
        try {
            this.af = false;
            this.ad = false;
            this.as = new HashMap();
            this.am = 0;
            this.ar = gdVarArr;
            this.aj = hashMap;
        } catch (Throwable e) {
            throw ba.ad(e, "dl.<init>(" + ')');
        }
    }

    public void ab(kf kfVar, String str, boolean z) {
        if (!this.ad) {
            this.af = false;
            this.ad = true;
            System.nanoTime();
            int au = kfVar.au(kfVar.ax(du.af.ay, -520859676), str, 1759470973);
            ik ikVar = new ik(kfVar.ac(du.af.ay, str, 286016249));
            ik ikVar2 = new ik(kfVar.ac(du.ad.ay, str, 286016249));
            ik ikVar3 = new ik(kfVar.ac(str, du.aa.ay, 286016249));
            System.nanoTime();
            System.nanoTime();
            this.an = new dt();
            try {
                this.an.af(ikVar, ikVar3, ikVar2, au, z, (byte) -68);
                this.an.ap(-246663931);
                this.an.bw(48219208);
                this.an.bb((byte) -63);
                this.ae = this.an.au(-2113924132) * 756225600;
                this.aq = this.an.ac(-292852186) * -1705903611;
                this.an.av(1970374412);
                this.an.au(-2113924132);
                this.an.al((byte) -108);
                this.an.ac(1369602625);
                int av = (this.an.av(-364821695) - this.an.au(-2113924132)) + 1;
                int al = (this.an.al((byte) -119) - this.an.ac(523596287)) + 1;
                System.nanoTime();
                System.nanoTime();
                dh.aj.as();
                dh.ae.as();
                this.ay = (dh[][]) Array.newInstance(dh.class, new int[]{av, al});
                Iterator it = this.an.af.iterator();
                while (it.hasNext()) {
                    dy dyVar = (dy) it.next();
                    au = -1138547490 * dyVar.af;
                    int i = dyVar.ad * -1559390354;
                    int au2 = au - this.an.au(-2113924132);
                    int ac = i - this.an.ac(-1617986268);
                    this.ay[au2][ac] = new dh(au, i, this.an.ao(-1809731426), this.aj);
                    this.ay[au2][ac].ay(dyVar, this.an.an, -529908476);
                }
                for (int i2 = 0; i2 < av; i2++) {
                    for (int i3 = 0; i3 < al; i3++) {
                        if (this.ay[i2][i3] == null) {
                            this.ay[i2][i3] = new dh(this.an.au(-2113924132) + i2, this.an.ac(-576493321) + i3, this.an.ao(328825735), this.aj);
                            this.ay[i2][i3].as(this.an.ad, this.an.an, (byte) 8);
                        }
                    }
                }
                System.nanoTime();
                System.nanoTime();
                if (kfVar.av(du.an.ay, str, -1162083463)) {
                    this.aa = hu.rd.ag(kfVar.ac(du.an.ay, str, 286016249), 317718879);
                }
                System.nanoTime();
                kfVar.az(1917252199);
                kfVar.ak((byte) 0);
                this.af = true;
            } catch (IllegalStateException e) {
            }
        }
    }

    public void af(kf kfVar, String str, boolean z, int i) {
        try {
            if (!this.ad) {
                this.af = false;
                this.ad = true;
                System.nanoTime();
                int au = kfVar.au(kfVar.ax(du.af.ay, 278510455), str, 1076424566);
                ik ikVar = new ik(kfVar.ac(du.af.ay, str, 286016249));
                ik ikVar2 = new ik(kfVar.ac(du.ad.ay, str, 286016249));
                ik ikVar3 = new ik(kfVar.ac(str, du.aa.ay, 286016249));
                System.nanoTime();
                System.nanoTime();
                this.an = new dt();
                try {
                    this.an.af(ikVar, ikVar3, ikVar2, au, z, (byte) -95);
                    this.an.ap(226528963);
                    this.an.bw(48219208);
                    this.an.bb((byte) 5);
                    this.ae = this.an.au(-2113924132) * 756225600;
                    this.aq = this.an.ac(-1504215730) * 663936576;
                    this.an.av(605532915);
                    this.an.au(-2113924132);
                    this.an.al((byte) 11);
                    this.an.ac(999337346);
                    int av = (this.an.av(1218601358) - this.an.au(-2113924132)) + 1;
                    int al = (this.an.al((byte) -84) - this.an.ac(1837555135)) + 1;
                    System.nanoTime();
                    System.nanoTime();
                    dh.aj.as();
                    dh.ae.as();
                    this.ay = (dh[][]) Array.newInstance(dh.class, new int[]{av, al});
                    Iterator it = this.an.af.iterator();
                    while (it.hasNext()) {
                        dy dyVar = (dy) it.next();
                        au = -2028510309 * dyVar.af;
                        int i2 = dyVar.ad * 876369313;
                        int au2 = au - this.an.au(-2113924132);
                        int ac = i2 - this.an.ac(-842381897);
                        this.ay[au2][ac] = new dh(au, i2, this.an.ao(949185102), this.aj);
                        this.ay[au2][ac].ay(dyVar, this.an.an, -1746427172);
                    }
                    for (int i3 = 0; i3 < av; i3++) {
                        for (int i4 = 0; i4 < al; i4++) {
                            if (this.ay[i3][i4] == null) {
                                this.ay[i3][i4] = new dh(this.an.au(-2113924132) + i3, this.an.ac(-1571915021) + i4, this.an.ao(957638655), this.aj);
                                this.ay[i3][i4].as(this.an.ad, this.an.an, (byte) 8);
                            }
                        }
                    }
                    System.nanoTime();
                    System.nanoTime();
                    if (kfVar.av(du.an.ay, str, -1162083463)) {
                        this.aa = hu.rd.ag(kfVar.ac(du.an.ay, str, 286016249), 317718879);
                    }
                    System.nanoTime();
                    kfVar.az(1917252199);
                    kfVar.ak((byte) 0);
                    this.af = true;
                } catch (IllegalStateException e) {
                }
            }
        } catch (Throwable e2) {
            throw ba.ad(e2, "dl.af(" + ')');
        }
    }

    public void at(kf kfVar, String str, boolean z) {
        if (!this.ad) {
            this.af = false;
            this.ad = true;
            System.nanoTime();
            int au = kfVar.au(kfVar.ax(du.af.ay, 288714055), str, -1136225665);
            ik ikVar = new ik(kfVar.ac(du.af.ay, str, 286016249));
            ik ikVar2 = new ik(kfVar.ac(du.ad.ay, str, 286016249));
            ik ikVar3 = new ik(kfVar.ac(str, du.aa.ay, 286016249));
            System.nanoTime();
            System.nanoTime();
            this.an = new dt();
            try {
                this.an.af(ikVar, ikVar3, ikVar2, au, z, (byte) -36);
                this.an.ap(-932868039);
                this.an.bw(48219208);
                this.an.bb((byte) -8);
                this.ae = this.an.au(-2113924132) * 756225600;
                this.aq = this.an.ac(1515182593) * 614858986;
                this.an.av(1210823994);
                this.an.au(-2113924132);
                this.an.al((byte) -60);
                this.an.ac(303349990);
                int av = (this.an.av(1126801070) - this.an.au(-2113924132)) + 1;
                int al = (this.an.al((byte) -70) - this.an.ac(1041178722)) + 1;
                System.nanoTime();
                System.nanoTime();
                dh.aj.as();
                dh.ae.as();
                this.ay = (dh[][]) Array.newInstance(dh.class, new int[]{av, al});
                Iterator it = this.an.af.iterator();
                while (it.hasNext()) {
                    dy dyVar = (dy) it.next();
                    au = -2028510309 * dyVar.af;
                    int i = dyVar.ad * 876369313;
                    int au2 = au - this.an.au(-2113924132);
                    int ac = i - this.an.ac(-764530732);
                    this.ay[au2][ac] = new dh(au, i, this.an.ao(-1890658860), this.aj);
                    this.ay[au2][ac].ay(dyVar, this.an.an, 50763643);
                }
                for (int i2 = 0; i2 < av; i2++) {
                    for (int i3 = 0; i3 < al; i3++) {
                        if (this.ay[i2][i3] == null) {
                            this.ay[i2][i3] = new dh(this.an.au(-2113924132) + i2, this.an.ac(2018318591) + i3, this.an.ao(240017022), this.aj);
                            this.ay[i2][i3].as(this.an.ad, this.an.an, (byte) 8);
                        }
                    }
                }
                System.nanoTime();
                System.nanoTime();
                if (kfVar.av(du.an.ay, str, -1162083463)) {
                    this.aa = hu.rd.ag(kfVar.ac(du.an.ay, str, 286016249), 317718879);
                }
                System.nanoTime();
                kfVar.az(1917252199);
                kfVar.ak((byte) 0);
                this.af = true;
            } catch (IllegalStateException e) {
            }
        }
    }

    public final void ad(int i) {
        try {
            this.ag = null;
        } catch (Throwable e) {
            throw ba.ad(e, "dl.ad(" + ')');
        }
    }

    public final void ai() {
        this.ag = null;
    }

    public final void aw() {
        this.ag = null;
    }

    public final void az() {
        this.ag = null;
    }

    public final void an(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, gf gfVar, byte b) {
        try {
            int i9;
            int i10;
            er ar = ar(i, i2, i3, i4, (byte) -125);
            float am = am(i7 - i5, i3 - i, -661816710);
            int ceil = (int) Math.ceil((double) am);
            this.am = -1433734947 * ceil;
            if (!this.as.containsKey(Integer.valueOf(ceil))) {
                ec ecVar = new ec(ceil);
                ecVar.aa((short) 16256);
                this.as.put(Integer.valueOf(ceil), ecVar);
            }
            dh[] dhVarArr = new dh[8];
            for (i9 = 443130687 * ar.an; i9 < (443130687 * ar.an) + (-303787613 * ar.af); i9++) {
                for (i10 = ar.aa * 1456234931; i10 < (1177263657 * ar.ad) + (ar.aa * 1456234931); i10++) {
                    ag(i9, i10, dhVarArr, 471424442);
                    this.ay[i9][i10].ae(ceil, (ec) this.as.get(Integer.valueOf(ceil)), dhVarArr, this.ar, (byte) -91);
                }
            }
            int i11 = (int) (64.0f * am);
            int i12 = i + (this.ae * 1727937513);
            int i13 = (this.aq * -1096864055) + i2;
            for (i9 = 443130687 * ar.an; i9 < (443130687 * ar.an) + (-303787613 * ar.af); i9++) {
                for (i10 = ar.aa * 1456234931; i10 < (1456234931 * ar.aa) + (ar.ad * 1177263657); i10++) {
                    this.ay[i9][i10].ag(((((1044791104 * this.ay[i9][i10].aq) - i12) * i11) / 64) + i5, i8 - (((((this.ay[i9][i10].am * 1666216384) - i13) + 64) * i11) / 64), i11, gfVar, -1179157993);
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "dl.an(" + ')');
        }
    }

    public final void aa(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, HashSet hashSet, HashSet hashSet2, int i9, int i10, boolean z, gf gfVar, byte b) {
        try {
            int i11;
            er ar = ar(i, i2, i3, i4, (byte) -66);
            int am = (int) (am(i7 - i5, i3 - i, 190200952) * 64.0f);
            int i12 = (1727937513 * this.ae) + i;
            int i13 = (-1096864055 * this.aq) + i2;
            for (int i14 = ar.an * 443130687; i14 < (443130687 * ar.an) + (ar.af * -303787613); i14++) {
                for (i11 = ar.aa * 1456234931; i11 < (ar.ad * 1177263657) + (1456234931 * ar.aa); i11++) {
                    if (z) {
                        this.ay[i14][i11].bf(1115723476);
                    }
                    this.ay[i14][i11].aq(((((this.ay[i14][i11].aq * 1044791104) - i12) * am) / 64) + i5, i8 - (((((1666216384 * this.ay[i14][i11].am) - i13) + 64) * am) / 64), am, hashSet, gfVar, 1637607371);
                }
            }
            if (hashSet2 != null && i9 > 0) {
                for (i11 = 443130687 * ar.an; i11 < (443130687 * ar.an) + (-303787613 * ar.af); i11++) {
                    for (int i15 = 1456234931 * ar.aa; i15 < (ar.aa * 1456234931) + (1177263657 * ar.ad); i15++) {
                        this.ay[i11][i15].am(hashSet2, i9, i10, gfVar, 298160754);
                    }
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "dl.aa(" + ')');
        }
    }

    public final void ah(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, HashSet hashSet, HashSet hashSet2, int i9, int i10, boolean z, gf gfVar) {
        int i11;
        er ar = ar(i, i2, i3, i4, (byte) -51);
        int am = (int) (am(i7 - i5, i3 - i, 482564978) * 64.0f);
        int i12 = (1048893330 * this.ae) + i;
        int i13 = (-1096864055 * this.aq) + i2;
        for (i11 = ar.an * 1005906632; i11 < (443130687 * ar.an) + (ar.af * -303787613); i11++) {
            for (int i14 = ar.aa * 2055593007; i14 < (ar.ad * -1083628023) + (-1171871381 * ar.aa); i14++) {
                if (z) {
                    this.ay[i11][i14].bf(1115723476);
                }
                this.ay[i11][i14].aq(((((this.ay[i11][i14].aq * -549810996) - i12) * am) / -1819468153) + i5, i8 - (((((201941876 * this.ay[i11][i14].am) - i13) + 64) * am) / 64), am, hashSet, gfVar, 1939280166);
            }
        }
        if (hashSet2 != null && i9 > 0) {
            for (int i15 = -719302495 * ar.an; i15 < (2096081049 * ar.an) + (450726021 * ar.af); i15++) {
                for (i11 = 1456234931 * ar.aa; i11 < (ar.aa * 1456234931) + (1177263657 * ar.ad); i11++) {
                    this.ay[i15][i11].am(hashSet2, i9, i10, gfVar, 1944311494);
                }
            }
        }
    }

    public final void ak(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, HashSet hashSet, HashSet hashSet2, int i9, int i10, boolean z, gf gfVar) {
        int i11;
        er ar = ar(i, i2, i3, i4, (byte) -27);
        int am = (int) (am(i7 - i5, i3 - i, 1054165129) * 64.0f);
        int i12 = (1727937513 * this.ae) + i;
        int i13 = (-1096864055 * this.aq) + i2;
        for (i11 = ar.an * 2131172898; i11 < (443130687 * ar.an) + (ar.af * -1515533324); i11++) {
            for (int i14 = ar.aa * 1456234931; i14 < (ar.ad * 1177263657) + (759858869 * ar.aa); i14++) {
                if (z) {
                    this.ay[i11][i14].bf(1115723476);
                }
                this.ay[i11][i14].aq(((((this.ay[i11][i14].aq * 2144489502) - i12) * am) / 64) + i5, i8 - (((((1666216384 * this.ay[i11][i14].am) - i13) + 64) * am) / 64), am, hashSet, gfVar, 1391258595);
            }
        }
        if (hashSet2 != null && i9 > 0) {
            for (int i15 = 443130687 * ar.an; i15 < (443130687 * ar.an) + (-303787613 * ar.af); i15++) {
                for (i11 = -1451412482 * ar.aa; i11 < (ar.aa * 1456234931) + (-611528144 * ar.ad); i11++) {
                    this.ay[i15][i11].am(hashSet2, i9, i10, gfVar, 558201306);
                }
            }
        }
    }

    public final void ao(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, HashSet hashSet, HashSet hashSet2, int i9, int i10, boolean z, gf gfVar) {
        int i11;
        er ar = ar(i, i2, i3, i4, (byte) -88);
        int am = (int) (am(i7 - i5, i3 - i, -755422224) * 64.0f);
        int i12 = (-1923348199 * this.ae) + i;
        int i13 = (-1096864055 * this.aq) + i2;
        for (i11 = ar.an * 443130687; i11 < (-1501198823 * ar.an) + (ar.af * -303787613); i11++) {
            for (int i14 = ar.aa * 608745721; i14 < (ar.ad * 1177263657) + (-79228789 * ar.aa); i14++) {
                if (z) {
                    this.ay[i11][i14].bf(1115723476);
                }
                this.ay[i11][i14].aq(((((this.ay[i11][i14].aq * -1675898901) - i12) * am) / 64) + i5, i8 - (((((822401106 * this.ay[i11][i14].am) - i13) + 64) * am) / 64), am, hashSet, gfVar, -2076811662);
            }
        }
        if (hashSet2 != null && i9 > 0) {
            for (int i15 = -1067592758 * ar.an; i15 < (78989673 * ar.an) + (-1750038074 * ar.af); i15++) {
                for (i11 = 1456234931 * ar.aa; i11 < (ar.aa * 1456234931) + (1177263657 * ar.ad); i11++) {
                    this.ay[i15][i11].am(hashSet2, i9, i10, gfVar, -1330509743);
                }
            }
        }
    }

    void ac(int i, int i2, dh[] dhVarArr) {
        int i3;
        int i4;
        dh dhVar;
        int i5 = 0;
        dh dhVar2 = null;
        int i6 = i <= 0 ? 1 : 0;
        if (i >= this.ay.length - 1) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (i2 <= 0) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i2 >= this.ay[0].length - 1) {
            i5 = 1;
        }
        if (i5 != 0) {
            dhVarArr[jx.af.af(1344903718)] = null;
        } else {
            dhVarArr[jx.af.af(1476522224)] = this.ay[i][i2 + 1];
        }
        int af = jx.ad.af(1713348625);
        if (i5 == 0 && i3 == 0) {
            dhVar = this.ay[i + 1][i2 + 1];
        } else {
            dhVar = null;
        }
        dhVarArr[af] = dhVar;
        af = jx.ar.af(1590054711);
        dhVar = (i5 == 0 && i6 == 0) ? this.ay[i - 1][i2 + 1] : null;
        dhVarArr[af] = dhVar;
        dhVarArr[jx.an.af(1882207099)] = i3 != 0 ? null : this.ay[i + 1][i2];
        i5 = jx.as.af(2026418254);
        if (i6 != 0) {
            dhVar = null;
        } else {
            dhVar = this.ay[i - 1][i2];
        }
        dhVarArr[i5] = dhVar;
        i5 = jx.ag.af(722706340);
        if (i4 != 0) {
            dhVar = null;
        } else {
            dhVar = this.ay[i][i2 - 1];
        }
        dhVarArr[i5] = dhVar;
        i5 = jx.aa.af(1592989595);
        if (i4 == 0 && i3 == 0) {
            dhVar = this.ay[i + 1][i2 - 1];
        } else {
            dhVar = null;
        }
        dhVarArr[i5] = dhVar;
        int af2 = jx.ay.af(1736980006);
        if (i4 == 0 && i6 == 0) {
            dhVar2 = this.ay[i - 1][i2 - 1];
        }
        dhVarArr[af2] = dhVar2;
    }

    void ag(int i, int i2, dh[] dhVarArr, int i3) {
        Object obj;
        Object obj2 = null;
        dh dhVar = null;
        if (i <= 0) {
            obj = 1;
        } else {
            obj = null;
        }
        try {
            Object obj3;
            Object obj4;
            dh dhVar2;
            if (i >= this.ay.length - 1) {
                obj3 = 1;
            } else {
                obj3 = null;
            }
            if (i2 <= 0) {
                obj4 = 1;
            } else {
                obj4 = null;
            }
            if (i2 >= this.ay[0].length - 1) {
                obj2 = 1;
            }
            if (obj2 != null) {
                dhVarArr[jx.af.af(656883894)] = null;
            } else {
                dhVarArr[jx.af.af(2108384672)] = this.ay[i][i2 + 1];
            }
            int af = jx.ad.af(989940848);
            if (obj2 == null && obj3 == null) {
                dhVar2 = this.ay[i + 1][i2 + 1];
            } else {
                dhVar2 = null;
            }
            dhVarArr[af] = dhVar2;
            af = jx.ar.af(1675443770);
            if (obj2 == null && obj == null) {
                dhVar2 = this.ay[i - 1][i2 + 1];
            } else {
                dhVar2 = null;
            }
            dhVarArr[af] = dhVar2;
            int af2 = jx.an.af(1671980938);
            if (obj3 != null) {
                dhVar2 = null;
            } else {
                dhVar2 = this.ay[i + 1][i2];
            }
            dhVarArr[af2] = dhVar2;
            af2 = jx.as.af(901625580);
            if (obj != null) {
                dhVar2 = null;
            } else {
                dhVar2 = this.ay[i - 1][i2];
            }
            dhVarArr[af2] = dhVar2;
            af2 = jx.ag.af(642889480);
            if (obj4 != null) {
                dhVar2 = null;
            } else {
                dhVar2 = this.ay[i][i2 - 1];
            }
            dhVarArr[af2] = dhVar2;
            af2 = jx.aa.af(961123299);
            dhVar2 = (obj4 == null && obj3 == null) ? this.ay[i + 1][i2 - 1] : null;
            dhVarArr[af2] = dhVar2;
            int af3 = jx.ay.af(1277990569);
            if (obj4 == null && obj == null) {
                dhVar = this.ay[i - 1][i2 - 1];
            }
            dhVarArr[af3] = dhVar;
        } catch (Throwable e) {
            throw ba.ad(e, "dl.ag(" + ')');
        }
    }

    void au(int i, int i2, dh[] dhVarArr) {
        int i3;
        int i4;
        int i5 = 0;
        dh dhVar = null;
        int i6 = i <= 0 ? 1 : 0;
        if (i >= this.ay.length - 1) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (i2 <= 0) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i2 >= this.ay[0].length - 1) {
            i5 = 1;
        }
        if (i5 != 0) {
            dhVarArr[jx.af.af(1503467932)] = null;
        } else {
            dhVarArr[jx.af.af(1590086383)] = this.ay[i][i2 + 1];
        }
        int af = jx.ad.af(1129239861);
        dh dhVar2 = (i5 == 0 && i3 == 0) ? this.ay[i + 1][i2 + 1] : null;
        dhVarArr[af] = dhVar2;
        af = jx.ar.af(762695785);
        if (i5 == 0 && i6 == 0) {
            dhVar2 = this.ay[i - 1][i2 + 1];
        } else {
            dhVar2 = null;
        }
        dhVarArr[af] = dhVar2;
        dhVarArr[jx.an.af(2125696437)] = i3 != 0 ? null : this.ay[i + 1][i2];
        i5 = jx.as.af(875992032);
        if (i6 != 0) {
            dhVar2 = null;
        } else {
            dhVar2 = this.ay[i - 1][i2];
        }
        dhVarArr[i5] = dhVar2;
        i5 = jx.ag.af(1320640263);
        if (i4 != 0) {
            dhVar2 = null;
        } else {
            dhVar2 = this.ay[i][i2 - 1];
        }
        dhVarArr[i5] = dhVar2;
        i5 = jx.aa.af(1019206888);
        if (i4 == 0 && i3 == 0) {
            dhVar2 = this.ay[i + 1][i2 - 1];
        } else {
            dhVar2 = null;
        }
        dhVarArr[i5] = dhVar2;
        int af2 = jx.ay.af(1647707830);
        if (i4 == 0 && i6 == 0) {
            dhVar = this.ay[i - 1][i2 - 1];
        }
        dhVarArr[af2] = dhVar;
    }

    void av(int i, int i2, dh[] dhVarArr) {
        int i3;
        int i4;
        dh dhVar;
        dh dhVar2;
        int i5 = 1;
        dh dhVar3 = null;
        int i6 = i <= 0 ? 1 : 0;
        if (i >= this.ay.length - 1) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (i2 <= 0) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i2 < this.ay[0].length - 1) {
            i5 = 0;
        }
        if (i5 != 0) {
            dhVarArr[jx.af.af(1879453837)] = null;
        } else {
            dhVarArr[jx.af.af(2134082704)] = this.ay[i][i2 + 1];
        }
        int af = jx.ad.af(1776983687);
        if (i5 == 0 && i3 == 0) {
            dhVar = this.ay[i + 1][i2 + 1];
        } else {
            dhVar = null;
        }
        dhVarArr[af] = dhVar;
        int af2 = jx.ar.af(1196480731);
        if (i5 == 0 && i6 == 0) {
            dhVar2 = this.ay[i - 1][i2 + 1];
        } else {
            dhVar2 = null;
        }
        dhVarArr[af2] = dhVar2;
        af2 = jx.an.af(1114292132);
        if (i3 != 0) {
            dhVar2 = null;
        } else {
            dhVar2 = this.ay[i + 1][i2];
        }
        dhVarArr[af2] = dhVar2;
        af2 = jx.as.af(1003958960);
        if (i6 != 0) {
            dhVar2 = null;
        } else {
            dhVar2 = this.ay[i - 1][i2];
        }
        dhVarArr[af2] = dhVar2;
        dhVarArr[jx.ag.af(2009104880)] = i4 != 0 ? null : this.ay[i][i2 - 1];
        af2 = jx.aa.af(606979243);
        if (i4 == 0 && i3 == 0) {
            dhVar2 = this.ay[i + 1][i2 - 1];
        } else {
            dhVar2 = null;
        }
        dhVarArr[af2] = dhVar2;
        i5 = jx.ay.af(1360085399);
        if (i4 == 0 && i6 == 0) {
            dhVar3 = this.ay[i - 1][i2 - 1];
        }
        dhVarArr[i5] = dhVar3;
    }

    void ax(int i, int i2, dh[] dhVarArr) {
        int i3;
        int i4;
        int i5 = 0;
        dh dhVar = null;
        if (i <= 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i6 = i >= this.ay.length + -1 ? 1 : 0;
        if (i2 <= 0) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i2 >= this.ay[0].length - 1) {
            i5 = 1;
        }
        if (i5 != 0) {
            dhVarArr[jx.af.af(1832639599)] = null;
        } else {
            dhVarArr[jx.af.af(1319838927)] = this.ay[i][i2 + 1];
        }
        int af = jx.ad.af(2019307263);
        dh dhVar2 = (i5 == 0 && i6 == 0) ? this.ay[i + 1][i2 + 1] : null;
        dhVarArr[af] = dhVar2;
        af = jx.ar.af(1313835681);
        dhVar2 = (i5 == 0 && i3 == 0) ? this.ay[i - 1][i2 + 1] : null;
        dhVarArr[af] = dhVar2;
        dhVarArr[jx.an.af(1421749409)] = i6 != 0 ? null : this.ay[i + 1][i2];
        i5 = jx.as.af(944627183);
        if (i3 != 0) {
            dhVar2 = null;
        } else {
            dhVar2 = this.ay[i - 1][i2];
        }
        dhVarArr[i5] = dhVar2;
        i5 = jx.ag.af(1315389624);
        if (i4 != 0) {
            dhVar2 = null;
        } else {
            dhVar2 = this.ay[i][i2 - 1];
        }
        dhVarArr[i5] = dhVar2;
        i5 = jx.aa.af(1072315974);
        if (i4 == 0 && i6 == 0) {
            dhVar2 = this.ay[i + 1][i2 - 1];
        } else {
            dhVar2 = null;
        }
        dhVarArr[i5] = dhVar2;
        int af2 = jx.ay.af(1983117202);
        if (i4 == 0 && i3 == 0) {
            dhVar = this.ay[i - 1][i2 - 1];
        }
        dhVarArr[af2] = dhVar;
    }

    public void al(int i, int i2, int i3, int i4, HashSet hashSet, int i5, int i6, gf gfVar) {
        if (this.aa != null) {
            gfVar.ax(this.aa, i, i2, i3, i4, 1411930085);
            if (i5 > 0 && i5 % i6 < i6 / 2) {
                if (this.ag == null) {
                    aq(-501345373);
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    List<dx> list = (List) this.ag.get(Integer.valueOf(((Integer) it.next()).intValue()));
                    if (list != null) {
                        for (dx dxVar : list) {
                        }
                    }
                }
            }
        }
    }

    public void ay(int i, int i2, int i3, int i4, HashSet hashSet, int i5, int i6, gf gfVar, byte b) {
        try {
            if (this.aa != null) {
                gfVar.ax(this.aa, i, i2, i3, i4, 1411930085);
                if (i5 <= 0) {
                    return;
                }
                if (i5 % i6 < i6 / 2) {
                    if (this.ag == null) {
                        aq(-2026753609);
                    }
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        List<dx> list = (List) this.ag.get(Integer.valueOf(((Integer) it.next()).intValue()));
                        if (list != null) {
                            for (dx dxVar : list) {
                            }
                        }
                    }
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "dl.ay(" + ')');
        }
    }

    public List ap(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        LinkedList linkedList = new LinkedList();
        if (!this.af) {
            return linkedList;
        }
        er ar = ar(i, i2, i3, i4, (byte) -110);
        int am = (int) (am(i7, i3 - i, -651157328) * 64.0f);
        int i11 = i + (this.ae * 1727937513);
        int i12 = i2 + (1899725061 * this.aq);
        for (int i13 = ar.an * 443130687; i13 < (ar.af * 2005360605) + (ar.an * 443130687); i13++) {
            for (int i14 = ar.aa * 1456234931; i14 < (1456234931 * ar.aa) + (-687221369 * ar.ad); i14++) {
                Collection bk = this.ay[i13][i14].bk(((((245378749 * this.ay[i13][i14].aq) - i11) * am) / -69464234) + i5, (i8 + i6) - (((((this.ay[i13][i14].am * -1935035842) - i12) + 64) * am) / 1920141463), am, i9, i10, 1808545605);
                if (!bk.isEmpty()) {
                    linkedList.addAll(bk);
                }
            }
        }
        return linkedList;
    }

    public List as(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        try {
            LinkedList linkedList = new LinkedList();
            if (!this.af) {
                return linkedList;
            }
            er ar = ar(i, i2, i3, i4, (byte) -47);
            int am = (int) (am(i7, i3 - i, 760708121) * 64.0f);
            int i12 = i + (this.ae * 1727937513);
            int i13 = i2 + (-1096864055 * this.aq);
            for (int i14 = ar.an * 443130687; i14 < (ar.af * -303787613) + (ar.an * 443130687); i14++) {
                for (int i15 = ar.aa * 1456234931; i15 < (1456234931 * ar.aa) + (1177263657 * ar.ad); i15++) {
                    Collection bk = this.ay[i14][i15].bk(((((1044791104 * this.ay[i14][i15].aq) - i12) * am) / 64) + i5, (i8 + i6) - (((((this.ay[i14][i15].am * 1666216384) - i13) + 64) * am) / 64), am, i9, i10, 2071667657);
                    if (!bk.isEmpty()) {
                        linkedList.addAll(bk);
                    }
                }
            }
            return linkedList;
        } catch (Throwable e) {
            throw ba.ad(e, "dl.as(" + ')');
        }
    }

    public List bw(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        LinkedList linkedList = new LinkedList();
        if (!this.af) {
            return linkedList;
        }
        er ar = ar(i, i2, i3, i4, (byte) -107);
        int am = (int) (am(i7, i3 - i, 1018733626) * 64.0f);
        int i11 = i + (this.ae * 1727937513);
        int i12 = i2 + (-1096864055 * this.aq);
        for (int i13 = ar.an * 443130687; i13 < (ar.af * -303787613) + (ar.an * 443130687); i13++) {
            for (int i14 = ar.aa * 1456234931; i14 < (1456234931 * ar.aa) + (1177263657 * ar.ad); i14++) {
                Collection bk = this.ay[i13][i14].bk(((((1044791104 * this.ay[i13][i14].aq) - i11) * am) / 64) + i5, (i8 + i6) - (((((this.ay[i13][i14].am * 1666216384) - i12) + 64) * am) / 64), am, i9, i10, -683473375);
                if (!bk.isEmpty()) {
                    linkedList.addAll(bk);
                }
            }
        }
        return linkedList;
    }

    er ar(int i, int i2, int i3, int i4, byte b) {
        try {
            er erVar = new er(this);
            int i5 = ((1727937513 * this.ae) + i) / 64;
            int i6 = ((-1096864055 * this.aq) + i2) / 64;
            int i7 = ((-1096864055 * this.aq) + i4) / 64;
            erVar.af = (((((this.ae * 1727937513) + i3) / 64) - i5) + 1) * 170076683;
            erVar.ad = ((i7 - i6) + 1) * 614915609;
            erVar.an = (i5 - this.an.au(-2113924132)) * -1582838593;
            erVar.aa = (i6 - this.an.ac(-1512518361)) * 1319187835;
            if (erVar.an * 443130687 < 0) {
                erVar.af += 1055873461 * erVar.an;
                erVar.an = 0;
            }
            if (erVar.an * 443130687 > this.ay.length - (-303787613 * erVar.af)) {
                erVar.af = (this.ay.length - (erVar.an * 443130687)) * 170076683;
            }
            if (erVar.aa * 1456234931 < 0) {
                erVar.ad += erVar.aa * 1019266171;
                erVar.aa = 0;
            }
            if (erVar.aa * 1456234931 > this.ay[0].length - (erVar.ad * 1177263657)) {
                erVar.ad = (this.ay[0].length - (erVar.aa * 1456234931)) * 614915609;
            }
            erVar.af = Math.min(-303787613 * erVar.af, this.ay.length) * 170076683;
            erVar.ad = Math.min(erVar.ad * 1177263657, this.ay[0].length) * 614915609;
            return erVar;
        } catch (Throwable e) {
            throw ba.ad(e, "dl.ar(" + ')');
        }
    }

    er bb(int i, int i2, int i3, int i4) {
        er erVar = new er(this);
        int i5 = ((1727937513 * this.ae) + i) / 1851831853;
        int i6 = ((-1096864055 * this.aq) + i2) / -1130829094;
        int i7 = ((-5963001 * this.aq) + i4) / 1990505925;
        erVar.af = (((((this.ae * -1804018884) + i3) / 64) - i5) + 1) * 170076683;
        erVar.ad = ((i7 - i6) + 1) * 614915609;
        erVar.an = (i5 - this.an.au(-2113924132)) * -965579462;
        erVar.aa = (i6 - this.an.ac(1414780229)) * 228818273;
        if (erVar.an * 443130687 < 0) {
            erVar.af += 1055873461 * erVar.an;
            erVar.an = 0;
        }
        if (erVar.an * 443130687 > this.ay.length - (-495625484 * erVar.af)) {
            erVar.af = (this.ay.length - (-552019971 * erVar.an)) * -498857;
        }
        if (erVar.aa * -1873331020 < 0) {
            erVar.ad += erVar.aa * -1897580152;
            erVar.aa = 0;
        }
        if (erVar.aa * 1456234931 > this.ay[0].length - (erVar.ad * -139555370)) {
            erVar.ad = 916739100 * (this.ay[0].length - (erVar.aa * 1533161038));
        }
        erVar.af = Math.min(965669014 * erVar.af, this.ay.length) * -1318640877;
        erVar.ad = Math.min(erVar.ad * 1177263657, this.ay[0].length) * -554380248;
        return erVar;
    }

    er bc(int i, int i2, int i3, int i4) {
        er erVar = new er(this);
        int i5 = ((1727937513 * this.ae) + i) / 64;
        int i6 = ((-1096864055 * this.aq) + i2) / 64;
        int i7 = ((-1096864055 * this.aq) + i4) / 64;
        erVar.af = (((((this.ae * 1727937513) + i3) / 64) - i5) + 1) * 170076683;
        erVar.ad = ((i7 - i6) + 1) * 614915609;
        erVar.an = (i5 - this.an.au(-2113924132)) * -1582838593;
        erVar.aa = (i6 - this.an.ac(415241906)) * 1319187835;
        if (erVar.an * 443130687 < 0) {
            erVar.af += 1055873461 * erVar.an;
            erVar.an = 0;
        }
        if (erVar.an * 443130687 > this.ay.length - (-303787613 * erVar.af)) {
            erVar.af = (this.ay.length - (erVar.an * 443130687)) * 170076683;
        }
        if (erVar.aa * 1456234931 < 0) {
            erVar.ad += erVar.aa * 1019266171;
            erVar.aa = 0;
        }
        if (erVar.aa * 1456234931 > this.ay[0].length - (erVar.ad * 1177263657)) {
            erVar.ad = (this.ay[0].length - (erVar.aa * 1456234931)) * 614915609;
        }
        erVar.af = Math.min(-303787613 * erVar.af, this.ay.length) * 170076683;
        erVar.ad = Math.min(erVar.ad * 1177263657, this.ay[0].length) * 614915609;
        return erVar;
    }

    er bz(int i, int i2, int i3, int i4) {
        er erVar = new er(this);
        int i5 = ((1727937513 * this.ae) + i) / 64;
        int i6 = ((-1096864055 * this.aq) + i2) / 64;
        int i7 = ((-1096864055 * this.aq) + i4) / 64;
        erVar.af = (((((this.ae * 1727937513) + i3) / 64) - i5) + 1) * 170076683;
        erVar.ad = ((i7 - i6) + 1) * 614915609;
        erVar.an = (i5 - this.an.au(-2113924132)) * -1582838593;
        erVar.aa = (i6 - this.an.ac(1142168048)) * 1319187835;
        if (erVar.an * 443130687 < 0) {
            erVar.af += 1055873461 * erVar.an;
            erVar.an = 0;
        }
        if (erVar.an * 443130687 > this.ay.length - (-303787613 * erVar.af)) {
            erVar.af = (this.ay.length - (erVar.an * 443130687)) * 170076683;
        }
        if (erVar.aa * 1456234931 < 0) {
            erVar.ad += erVar.aa * 1019266171;
            erVar.aa = 0;
        }
        if (erVar.aa * 1456234931 > this.ay[0].length - (erVar.ad * 1177263657)) {
            erVar.ad = (this.ay[0].length - (erVar.aa * 1456234931)) * 614915609;
        }
        erVar.af = Math.min(-303787613 * erVar.af, this.ay.length) * 170076683;
        erVar.ad = Math.min(erVar.ad * 1177263657, this.ay[0].length) * 614915609;
        return erVar;
    }

    public boolean aj(int i) {
        try {
            return this.af;
        } catch (Throwable e) {
            throw ba.ad(e, "dl.aj(" + ')');
        }
    }

    public boolean bg() {
        return this.af;
    }

    public HashMap ae(byte b) {
        try {
            aq(-1513543251);
            return this.ag;
        } catch (Throwable e) {
            throw ba.ad(e, "dl.ae(" + ')');
        }
    }

    public HashMap bf() {
        aq(-1339321442);
        return this.ag;
    }

    public HashMap bh() {
        aq(-1186734264);
        return this.ag;
    }

    void aq(int i) {
        try {
            if (this.ag == null) {
                this.ag = new HashMap();
            }
            this.ag.clear();
            for (int i2 = 0; i2 < this.ay.length; i2++) {
                for (dh by : this.ay[i2]) {
                    for (dx dxVar : by.by(264416299)) {
                        if (this.ag.containsKey(Integer.valueOf(dxVar.af * -459008153))) {
                            ((List) this.ag.get(Integer.valueOf(dxVar.af * -459008153))).add(dxVar);
                        } else {
                            LinkedList linkedList = new LinkedList();
                            linkedList.add(dxVar);
                            this.ag.put(Integer.valueOf(dxVar.af * -459008153), linkedList);
                        }
                    }
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "dl.aq(" + ')');
        }
    }

    void bp() {
        if (this.ag == null) {
            this.ag = new HashMap();
        }
        this.ag.clear();
        for (int i = 0; i < this.ay.length; i++) {
            for (dh by : this.ay[i]) {
                for (dx dxVar : by.by(1858354231)) {
                    if (this.ag.containsKey(Integer.valueOf(dxVar.af * -459008153))) {
                        ((List) this.ag.get(Integer.valueOf(dxVar.af * -459008153))).add(dxVar);
                    } else {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(dxVar);
                        this.ag.put(Integer.valueOf(dxVar.af * -1090542255), linkedList);
                    }
                }
            }
        }
    }

    void bv() {
        if (this.ag == null) {
            this.ag = new HashMap();
        }
        this.ag.clear();
        for (int i = 0; i < this.ay.length; i++) {
            for (dh by : this.ay[i]) {
                for (dx dxVar : by.by(-816750081)) {
                    if (this.ag.containsKey(Integer.valueOf(-1517677908 * dxVar.af))) {
                        ((List) this.ag.get(Integer.valueOf(dxVar.af * 456864418))).add(dxVar);
                    } else {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(dxVar);
                        this.ag.put(Integer.valueOf(dxVar.af * -459008153), linkedList);
                    }
                }
            }
        }
    }

    float am(int i, int i2, int i3) {
        float f = ((float) i) / ((float) i2);
        if (f > 8.0f) {
            return 8.0f;
        }
        if (f < 1.0f) {
            return 1.0f;
        }
        try {
            int round = Math.round(f);
            return Math.abs(((float) round) - f) < 0.05f ? (float) round : f;
        } catch (Throwable e) {
            throw ba.ad(e, "dl.am(" + ')');
        }
    }

    float bt(int i, int i2) {
        float f = ((float) i) / ((float) i2);
        if (f > 8.0f) {
            return 8.0f;
        }
        if (f < 1.0f) {
            return 1.0f;
        }
        int round = Math.round(f);
        return Math.abs(((float) round) - f) < 0.05f ? (float) round : f;
    }

    float bu(int i, int i2) {
        float f = ((float) i) / ((float) i2);
        if (f > 8.0f) {
            return 8.0f;
        }
        if (f < 1.0f) {
            return 1.0f;
        }
        int round = Math.round(f);
        if (Math.abs(((float) round) - f) < 0.05f) {
            return (float) round;
        }
        return f;
    }

    float bx(int i, int i2) {
        float f = ((float) i) / ((float) i2);
        if (f > 8.0f) {
            return 8.0f;
        }
        if (f < 1.0f) {
            return 1.0f;
        }
        int round = Math.round(f);
        if (Math.abs(((float) round) - f) < 0.05f) {
            return (float) round;
        }
        return f;
    }
}
