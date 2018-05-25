package p000;

import java.util.ArrayList;
import java.util.Collection;

public class gn implements go {
    static final int ad = 1000;
    static kf ar = null;
    static final int cd = 5;
    go af;
    Collection ag;
    final kk an;
    Collection ay;

    public gn() {
        try {
            this.an = new kk(gb.class, ad);
            this.ag = new ArrayList(100);
            this.ay = new ArrayList(100);
        } catch (Throwable e) {
            throw ba.ad(e, "gn.<init>(" + ')');
        }
    }

    public final void ab(go goVar) {
        this.af = goVar;
    }

    public final void af(go goVar, byte b) {
        try {
            this.af = goVar;
        } catch (Throwable e) {
            throw ba.ad(e, "gn.af(" + ')');
        }
    }

    public final void ai(go goVar) {
        this.af = goVar;
    }

    public final void aw(go goVar) {
        this.af = goVar;
    }

    synchronized void ad(byte b) {
        try {
            Collection collection = this.ay;
            this.ay = this.ag;
            this.ag = collection;
        } catch (Throwable e) {
            throw ba.ad(e, "gn.ad(" + ')');
        }
    }

    synchronized void ah() {
        Collection collection = this.ay;
        this.ay = this.ag;
        this.ag = collection;
    }

    synchronized void az() {
        Collection collection = this.ay;
        this.ay = this.ag;
        this.ag = collection;
    }

    synchronized void ak(gb gbVar) {
        this.ag.add(gbVar);
    }

    synchronized void an(gb gbVar, int i) {
        try {
            this.ag.add(gbVar);
        } catch (Throwable e) {
            throw ba.ad(e, "gn.an(" + ')');
        }
    }

    synchronized void ao(gb gbVar) {
        this.ag.add(gbVar);
    }

    synchronized void au(gb gbVar) {
        this.ag.add(gbVar);
    }

    synchronized void ax(gb gbVar) {
        this.ag.add(gbVar);
    }

    public final boolean aa(int i) {
        try {
            boolean z;
            ad((byte) 62);
            if (this.ay.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            for (gb gbVar : this.ay) {
                if (this.af != null) {
                    gbVar.af(this.af, 1970381089);
                }
                this.an.aa(gbVar);
            }
            this.ay.clear();
            return z;
        } catch (Throwable e) {
            throw ba.ad(e, "gn.aa(" + ')');
        }
    }

    public final boolean ac() {
        ad((byte) -27);
        boolean z = !this.ay.isEmpty();
        for (gb gbVar : this.ay) {
            if (this.af != null) {
                gbVar.af(this.af, 1879028885);
            }
            this.an.aa(gbVar);
        }
        this.ay.clear();
        return z;
    }

    public final boolean av() {
        ad((byte) -75);
        boolean z = !this.ay.isEmpty();
        for (gb gbVar : this.ay) {
            if (this.af != null) {
                gbVar.af(this.af, 1294091337);
            }
            this.an.aa(gbVar);
        }
        this.ay.clear();
        return z;
    }

    gb ag(byte b) {
        try {
            return (gb) this.an.an();
        } catch (Throwable e) {
            throw ba.ad(e, "gn.ag(" + ')');
        }
    }

    gb al() {
        return (gb) this.an.an();
    }

    gb ap() {
        return (gb) this.an.an();
    }

    static void ad(int i, int i2, int i3, ae aeVar, int i4, int i5) {
        try {
            kd hdVar = new hd();
            hdVar.ad = -12792093 * i;
            hdVar.an = -1630641792 * i2;
            hdVar.aa = -999125376 * i3;
            int i6 = -265754695 * aeVar.az;
            int i7 = aeVar.ah * -344743753;
            if (1 == i4 || i4 == 3) {
                i6 = aeVar.ah * -344743753;
                i7 = aeVar.az * -265754695;
            }
            hdVar.ag = (i6 + i2) * 1225247872;
            hdVar.ay = (i7 + i3) * 1460844672;
            hdVar.ar = aeVar.bs * 509223885;
            hdVar.as = aeVar.bm * -1635036288;
            hdVar.ae = 2030809137 * aeVar.br;
            hdVar.aq = 218481647 * aeVar.bj;
            hdVar.am = aeVar.bi;
            if (aeVar.ba != null) {
                hdVar.aw = aeVar;
                hdVar.af((byte) 116);
            }
            hd.af.ad(hdVar);
            if (hdVar.am != null) {
                hdVar.at = ((hdVar.ae * 151983619) + ((int) (Math.random() * ((double) ((-1399958125 * hdVar.aq) - (hdVar.ae * 151983619)))))) * 1237697707;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "gn.ad(" + ')');
        }
    }

    public boolean ay(int i, long j) {
        try {
            gb ag = ag((byte) 30);
            ag.af = gy.ay;
            ag.ad = 1808091883 * i;
            ag.ay = -6320541700807398221L * j;
            an(ag, 585880032);
            return true;
        } catch (Throwable e) {
            throw ba.ad(e, "gn.ay(" + ')');
        }
    }

    public boolean bb(int i, long j) {
        gb ag = ag((byte) 125);
        ag.af = gy.ay;
        ag.ad = 1808091883 * i;
        ag.ay = -6320541700807398221L * j;
        an(ag, 628885861);
        return true;
    }

    public boolean bc(int i, long j) {
        gb ag = ag((byte) 121);
        ag.af = gy.ay;
        ag.ad = 1808091883 * i;
        ag.ay = -6320541700807398221L * j;
        an(ag, 1227309683);
        return true;
    }

    public boolean bw(int i, long j) {
        gb ag = ag((byte) 52);
        ag.af = gy.ay;
        ag.ad = 1808091883 * i;
        ag.ay = -6320541700807398221L * j;
        an(ag, -1288131328);
        return true;
    }

    public boolean bz(int i, long j) {
        gb ag = ag((byte) 79);
        ag.af = gy.ay;
        ag.ad = 1808091883 * i;
        ag.ay = -6320541700807398221L * j;
        an(ag, -73978613);
        return true;
    }

    public boolean as(int i, long j) {
        try {
            gb ag = ag((byte) 9);
            ag.af = gy.as;
            ag.ad = 1808091883 * i;
            ag.ay = -6320541700807398221L * j;
            an(ag, 824398854);
            return true;
        } catch (Throwable e) {
            throw ba.ad(e, "gn.as(" + ')');
        }
    }

    public boolean bf(int i, long j) {
        gb ag = ag((byte) 30);
        ag.af = gy.as;
        ag.ad = 1808091883 * i;
        ag.ay = -6320541700807398221L * j;
        an(ag, 1579242607);
        return true;
    }

    public boolean bg(int i, long j) {
        gb ag = ag((byte) 58);
        ag.af = gy.as;
        ag.ad = 1808091883 * i;
        ag.ay = -6320541700807398221L * j;
        an(ag, -1086480228);
        return true;
    }

    public boolean bh(int i, long j) {
        gb ag = ag((byte) 120);
        ag.af = gy.as;
        ag.ad = -1201619308 * i;
        ag.ay = -6320541700807398221L * j;
        an(ag, -2057691878);
        return true;
    }

    public boolean bv(int i, long j) {
        gb ag = ag((byte) 94);
        ag.af = gy.as;
        ag.ad = 1808091883 * i;
        ag.ay = -6320541700807398221L * j;
        an(ag, 583216409);
        return true;
    }

    public boolean ar(char c, long j) {
        try {
            gb ag = ag((byte) 60);
            ag.af = gy.ar;
            ag.ad = 1808091883 * c;
            ag.ay = -6320541700807398221L * j;
            an(ag, 1980093308);
            return true;
        } catch (Throwable e) {
            throw ba.ad(e, "gn.ar(" + ')');
        }
    }

    public boolean be(char c, long j) {
        gb ag = ag((byte) 35);
        ag.af = gy.ar;
        ag.ad = 1808091883 * c;
        ag.ay = -6320541700807398221L * j;
        an(ag, -809136471);
        return true;
    }

    public boolean bp(char c, long j) {
        gb ag = ag((byte) 62);
        ag.af = gy.ar;
        ag.ad = 1808091883 * c;
        ag.ay = -6320541700807398221L * j;
        an(ag, 166452359);
        return true;
    }

    public boolean bt(char c, long j) {
        gb ag = ag((byte) 26);
        ag.af = gy.ar;
        ag.ad = 1808091883 * c;
        ag.ay = -6320541700807398221L * j;
        an(ag, 404978363);
        return true;
    }

    public boolean bu(char c, long j) {
        gb ag = ag((byte) 8);
        ag.af = gy.ar;
        ag.ad = -274916651 * c;
        ag.ay = -6320541700807398221L * j;
        an(ag, 479733922);
        return true;
    }

    public boolean bx(char c, long j) {
        gb ag = ag((byte) 15);
        ag.af = gy.ar;
        ag.ad = 1808091883 * c;
        ag.ay = -6320541700807398221L * j;
        an(ag, -248551202);
        return true;
    }

    public boolean aj(int i, int i2, int i3, int i4, long j) {
        try {
            gb ag = ag((byte) 45);
            ag.af = gy.an;
            ag.ad = 1808091883 * i;
            ag.an = 1391211053 * i2;
            ag.aa = 76672773 * i3;
            ag.ag = 1069530045 * i4;
            ag.ay = -6320541700807398221L * j;
            an(ag, -693769953);
            return true;
        } catch (Throwable e) {
            throw ba.ad(e, "gn.aj(" + ')');
        }
    }

    public boolean bk(int i, int i2, int i3, int i4, long j) {
        gb ag = ag((byte) 58);
        ag.af = gy.an;
        ag.ad = 1808091883 * i;
        ag.an = 1391211053 * i2;
        ag.aa = 344075311 * i3;
        ag.ag = 1069530045 * i4;
        ag.ay = -6320541700807398221L * j;
        an(ag, 22795789);
        return true;
    }

    public boolean bn(int i, int i2, int i3, int i4, long j) {
        gb ag = ag((byte) 100);
        ag.af = gy.an;
        ag.ad = 1808091883 * i;
        ag.an = 876132247 * i2;
        ag.aa = 485827260 * i3;
        ag.ag = 2099706826 * i4;
        ag.ay = -6320541700807398221L * j;
        an(ag, 980677194);
        return true;
    }

    public boolean by(int i, int i2, int i3, int i4, long j) {
        gb ag = ag((byte) 47);
        ag.af = gy.an;
        ag.ad = 1808091883 * i;
        ag.an = 1391211053 * i2;
        ag.aa = 76672773 * i3;
        ag.ag = 1069530045 * i4;
        ag.ay = -6320541700807398221L * j;
        an(ag, 1112672584);
        return true;
    }

    public boolean ae(int i, int i2, int i3, int i4, long j) {
        try {
            gb ag = ag((byte) 106);
            ag.af = gy.aa;
            ag.ad = 1808091883 * i;
            ag.an = 1391211053 * i2;
            ag.aa = 76672773 * i3;
            ag.ag = 1069530045 * i4;
            ag.ay = -6320541700807398221L * j;
            an(ag, -709183911);
            return true;
        } catch (Throwable e) {
            throw ba.ad(e, "gn.ae(" + ')');
        }
    }

    public boolean ba(int i, int i2, int i3, int i4, long j) {
        gb ag = ag((byte) 41);
        ag.af = gy.aa;
        ag.ad = 693816556 * i;
        ag.an = -836821724 * i2;
        ag.aa = 76672773 * i3;
        ag.ag = 1069530045 * i4;
        ag.ay = -6320541700807398221L * j;
        an(ag, -1037006470);
        return true;
    }

    public boolean aq(int i, int i2, int i3, long j) {
        try {
            gb ag = ag((byte) 30);
            ag.af = gy.ag;
            ag.ad = 1808091883 * i;
            ag.aa = 76672773 * i2;
            ag.ag = 1069530045 * i3;
            ag.ay = -6320541700807398221L * j;
            an(ag, 1633866098);
            return true;
        } catch (Throwable e) {
            throw ba.ad(e, "gn.aq(" + ')');
        }
    }

    public boolean bl(int i, int i2, int i3, long j) {
        gb ag = ag((byte) 33);
        ag.af = gy.ag;
        ag.ad = -930271463 * i;
        ag.aa = 615131263 * i2;
        ag.ag = -1303340222 * i3;
        ag.ay = -6320541700807398221L * j;
        an(ag, 436956436);
        return true;
    }

    public boolean am(int i, int i2, long j) {
        try {
            gb ag = ag((byte) 89);
            ag.af = gy.af;
            ag.aa = 76672773 * i;
            ag.ag = 1069530045 * i2;
            ag.ay = -6320541700807398221L * j;
            an(ag, 1984064616);
            return true;
        } catch (Throwable e) {
            throw ba.ad(e, "gn.am(" + ')');
        }
    }

    public boolean bd(int i, int i2, long j) {
        gb ag = ag((byte) 15);
        ag.af = gy.af;
        ag.aa = 76672773 * i;
        ag.ag = 126542031 * i2;
        ag.ay = -6320541700807398221L * j;
        an(ag, 499167640);
        return true;
    }

    public boolean at(int i, long j) {
        try {
            gb ag = ag((byte) 120);
            ag.af = gy.ad;
            ag.ad = 1808091883 * i;
            ag.ay = -6320541700807398221L * j;
            an(ag, -1764383772);
            return true;
        } catch (Throwable e) {
            throw ba.ad(e, "gn.at(" + ')');
        }
    }

    public boolean bm(int i, long j) {
        gb ag = ag((byte) 59);
        ag.af = gy.ad;
        ag.ad = 672552065 * i;
        ag.ay = -6320541700807398221L * j;
        an(ag, 1072711171);
        return true;
    }

    public boolean bs(int i, long j) {
        gb ag = ag((byte) 116);
        ag.af = gy.ad;
        ag.ad = -1966512198 * i;
        ag.ay = -6320541700807398221L * j;
        an(ag, -594977592);
        return true;
    }

    static final void as(int i, int i2, int i3, int i4, int i5, int i6, cc ccVar, eq eqVar, int i7) {
        try {
            if (!client.ae || (gu.ad[0][i2][i3] & 2) != 0 || (gu.ad[i][i2][i3] & 16) == 0) {
                int i8;
                int i9;
                int i10;
                int i11;
                int i12;
                int i13;
                boolean z;
                if (i < gu.an * 2025245167) {
                    gu.an = -726694641 * i;
                }
                ae ad = gi.ad(i4, 2135436577);
                if (i5 == 1 || i5 == 3) {
                    i8 = ad.az * -265754695;
                    i9 = ad.ah * -344743753;
                } else {
                    i8 = -344743753 * ad.ah;
                    i9 = -265754695 * ad.az;
                }
                if (i9 + i2 <= li.cu) {
                    i10 = ((i9 + 1) >> 1) + i2;
                    i11 = (i9 >> 1) + i2;
                } else {
                    i10 = i2 + 1;
                    i11 = i2;
                }
                if (i8 + i3 <= li.cu) {
                    i12 = i3 + (i8 >> 1);
                    i13 = ((i8 + 1) >> 1) + i3;
                } else {
                    i13 = i3 + 1;
                    i12 = i3;
                }
                int[][] iArr = gu.af[i];
                int i14 = ((iArr[i11][i13] + (iArr[i11][i12] + iArr[i10][i12])) + iArr[i10][i13]) >> 2;
                int i15 = (i9 << 6) + (i2 << 7);
                int i16 = (i3 << 7) + (i8 << 6);
                if (ad.ax * -1193025245 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                long ar = cg.ar(i2, i3, 2, z, i4, -450177673);
                int i17 = i6 + (i5 << 6);
                if (1 == 29042685 * ad.bn) {
                    i17 += 256;
                }
                if (ad.ai((byte) 52)) {
                    gn.ad(i, i2, i3, ad, i5, 739889224);
                }
                cq ar2;
                if (22 == i6) {
                    if (!client.ae || -1193025245 * ad.ax != 0 || 1 == -1655214851 * ad.ak || ad.bk) {
                        if (-1 == ad.al * -229827367 && ad.ba == null) {
                            ar2 = ad.ar(22, i5, iArr, i15, i14, i16, (short) -12829);
                        } else {
                            ar2 = new hg(i4, 22, i5, i, i2, i3, -229827367 * ad.al, true, null);
                        }
                        ccVar.as(i, i2, i3, i14, ar2, ar, i17);
                        if (1 == -1655214851 * ad.ak && eqVar != null) {
                            eqVar.ag(i2, i3, (byte) 56);
                        }
                    }
                } else if (i6 == 10 || 11 == i6) {
                    if (-1 == ad.al * -229827367 && ad.ba == null) {
                        r16 = ad.ar(10, i5, iArr, i15, i14, i16, (short) 21730);
                    } else {
                        r16 = new hg(i4, 10, i5, i, i2, i3, ad.al * -229827367, true, null);
                    }
                    if (r16 != null) {
                        if (i6 == 11) {
                            r17 = 256;
                        } else {
                            r17 = 0;
                        }
                        if (ccVar.aq(i, i2, i3, i14, i9, i8, r16, r17, ar, i17) && ad.bf) {
                            byte b = (byte) 15;
                            if (r16 instanceof cl) {
                                b = ((cl) r16).ar() / 4;
                                if (b > (byte) 30) {
                                    b = (byte) 30;
                                }
                            }
                            for (i10 = 0; i10 <= i9; i10++) {
                                for (i12 = 0; i12 <= i8; i12++) {
                                    if (b > ch.ar[i][i10 + i2][i12 + i3]) {
                                        ch.ar[i][i10 + i2][i12 + i3] = (byte) b;
                                    }
                                }
                            }
                        }
                    }
                    if (ad.ak * -1655214851 != 0 && eqVar != null) {
                        eqVar.an(i2, i3, i9, i8, ad.ao, 1945495320);
                    }
                } else if (i6 >= 12) {
                    if (-1 == -229827367 * ad.al && ad.ba == null) {
                        r16 = ad.ar(i6, i5, iArr, i15, i14, i16, (short) 1634);
                    } else {
                        r16 = new hg(i4, i6, i5, i, i2, i3, ad.al * -229827367, true, null);
                    }
                    ccVar.aq(i, i2, i3, i14, 1, 1, r16, 0, ar, i17);
                    if (i6 >= 12 && i6 <= 17 && i6 != 13 && i > 0) {
                        r4 = nh.aw[i][i2];
                        r4[i3] = r4[i3] | 2340;
                    }
                    if (-1655214851 * ad.ak != 0 && eqVar != null) {
                        eqVar.an(i2, i3, i9, i8, ad.ao, 1844597545);
                    }
                } else if (i6 == 0) {
                    if (ad.al * -229827367 == -1 && ad.ba == null) {
                        r14 = ad.ar(0, i5, iArr, i15, i14, i16, (short) -369);
                    } else {
                        r14 = new hg(i4, 0, i5, i, i2, i3, -229827367 * ad.al, true, null);
                    }
                    ccVar.aj(i, i2, i3, i14, r14, null, gu.ak[i5], 0, ar, i17);
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
                            i12 = i3 + 1;
                            r4[i12] = r4[i12] | 1170;
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
                        eqVar.ad(i2, i3, i6, i5, ad.ao, 2067945217);
                    }
                    if (ad.ap * 1681090481 != 16) {
                        ccVar.az(i, i2, i3, ad.ap * 1681090481);
                    }
                } else if (i6 == 1) {
                    if (-1 == ad.al * -229827367 && ad.ba == null) {
                        r14 = ad.ar(1, i5, iArr, i15, i14, i16, (short) -20253);
                    } else {
                        r14 = new hg(i4, 1, i5, i, i2, i3, -229827367 * ad.al, true, null);
                    }
                    ccVar.aj(i, i2, i3, i14, r14, null, gu.ao[i5], 0, ar, i17);
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
                        eqVar.ad(i2, i3, i6, i5, ad.ao, 1786442398);
                    }
                } else if (i6 == 2) {
                    cq ar3;
                    int i18 = (i5 + 1) & 3;
                    if (-1 == -229827367 * ad.al && ad.ba == null) {
                        cq ar4 = ad.ar(2, i5 + 4, iArr, i15, i14, i16, (short) -2702);
                        ar3 = ad.ar(2, i18, iArr, i15, i14, i16, (short) -18458);
                        r14 = ar4;
                    } else {
                        r8 = new hg(i4, 2, i5 + 4, i, i2, i3, -229827367 * ad.al, true, null);
                        ar3 = new hg(i4, 2, i18, i, i2, i3, -229827367 * ad.al, true, null);
                        r14 = r8;
                    }
                    ccVar.aj(i, i2, i3, i14, r14, ar3, gu.ak[i5], gu.ak[i18], ar, i17);
                    if (ad.ac) {
                        if (i5 == 0) {
                            r4 = nh.aw[i][i2];
                            r4[i3] = r4[i3] | 585;
                            r4 = nh.aw[i][i2];
                            i12 = i3 + 1;
                            r4[i12] = r4[i12] | 1170;
                        } else if (1 == i5) {
                            r4 = nh.aw[i][i2];
                            i12 = i3 + 1;
                            r4[i12] = r4[i12] | 1170;
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
                        eqVar.ad(i2, i3, i6, i5, ad.ao, 1373693483);
                    }
                    if (ad.ap * 1681090481 != 16) {
                        ccVar.az(i, i2, i3, ad.ap * 1681090481);
                    }
                } else if (3 == i6) {
                    if (-1 == -229827367 * ad.al && ad.ba == null) {
                        r14 = ad.ar(3, i5, iArr, i15, i14, i16, (short) -9246);
                    } else {
                        r14 = new hg(i4, 3, i5, i, i2, i3, -229827367 * ad.al, true, null);
                    }
                    ccVar.aj(i, i2, i3, i14, r14, null, gu.ao[i5], 0, ar, i17);
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
                        eqVar.ad(i2, i3, i6, i5, ad.ao, 1720480808);
                    }
                } else if (9 == i6) {
                    if (-1 == ad.al * -229827367 && ad.ba == null) {
                        r16 = ad.ar(i6, i5, iArr, i15, i14, i16, (short) 1505);
                    } else {
                        r16 = new hg(i4, i6, i5, i, i2, i3, -229827367 * ad.al, true, null);
                    }
                    ccVar.aq(i, i2, i3, i14, 1, 1, r16, 0, ar, i17);
                    if (!(-1655214851 * ad.ak == 0 || eqVar == null)) {
                        eqVar.an(i2, i3, i9, i8, ad.ao, 1764141742);
                    }
                    if (ad.ap * 1681090481 != 16) {
                        ccVar.az(i, i2, i3, 1681090481 * ad.ap);
                    }
                } else if (i6 == 4) {
                    if (-1 == -229827367 * ad.al && ad.ba == null) {
                        r12 = ad.ar(4, i5, iArr, i15, i14, i16, (short) 12546);
                    } else {
                        r12 = new hg(i4, 4, i5, i, i2, i3, -229827367 * ad.al, true, null);
                    }
                    ccVar.ae(i, i2, i3, i14, r12, null, gu.ak[i5], 0, 0, 0, ar, i17);
                } else if (5 == i6) {
                    r8 = ccVar.bw(i, i2, i3);
                    if (0 != r8) {
                        r17 = gi.ad(bb.as(r8), 1874603665).ap * 1681090481;
                    } else {
                        r17 = 16;
                    }
                    if (-1 == ad.al * -229827367 && ad.ba == null) {
                        r12 = ad.ar(4, i5, iArr, i15, i14, i16, (short) 15747);
                    } else {
                        r12 = new hg(i4, 4, i5, i, i2, i3, -229827367 * ad.al, true, null);
                    }
                    ccVar.ae(i, i2, i3, i14, r12, null, gu.ak[i5], 0, gu.ax[i5] * r17, r17 * gu.au[i5], ar, i17);
                } else if (i6 == 6) {
                    r8 = ccVar.bw(i, i2, i3);
                    if (0 != r8) {
                        r15 = (gi.ad(bb.as(r8), 2133361655).ap * 1681090481) / 2;
                    } else {
                        r15 = 8;
                    }
                    if (ad.al * -229827367 == -1 && ad.ba == null) {
                        r12 = ad.ar(4, i5 + 4, iArr, i15, i14, i16, (short) 12480);
                    } else {
                        r12 = new hg(i4, 4, i5 + 4, i, i2, i3, ad.al * -229827367, true, null);
                    }
                    ccVar.ae(i, i2, i3, i14, r12, null, 256, i5, gu.av[i5] * r15, r15 * gu.ac[i5], ar, i17);
                } else if (7 == i6) {
                    r15 = (i5 + 2) & 3;
                    if (-1 == ad.al * -229827367 && ad.ba == null) {
                        r12 = ad.ar(4, r15 + 4, iArr, i15, i14, i16, (short) -4144);
                    } else {
                        r12 = new hg(i4, 4, r15 + 4, i, i2, i3, ad.al * -229827367, true, null);
                    }
                    ccVar.ae(i, i2, i3, i14, r12, null, 256, r15, 0, 0, ar, i17);
                } else if (i6 == 8) {
                    i13 = 8;
                    r8 = ccVar.bw(i, i2, i3);
                    if (r8 != 0) {
                        i13 = (gi.ad(bb.as(r8), 1378968366).ap * 1681090481) / 2;
                    }
                    i10 = (i5 + 2) & 3;
                    if (ad.al * -229827367 == -1 && ad.ba == null) {
                        cq ar5 = ad.ar(4, i5 + 4, iArr, i15, i14, i16, (short) -9879);
                        ar2 = ad.ar(4, i10 + 4, iArr, i15, i14, i16, (short) -8231);
                        r12 = ar5;
                    } else {
                        r8 = new hg(i4, 4, i5 + 4, i, i2, i3, ad.al * -229827367, true, null);
                        ar2 = new hg(i4, 4, i10 + 4, i, i2, i3, ad.al * -229827367, true, null);
                        r12 = r8;
                    }
                    ccVar.ae(i, i2, i3, i14, r12, ar2, 256, i5, gu.av[i5] * i13, i13 * gu.ac[i5], ar, i17);
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "gn.as(" + ')');
        }
    }
}
