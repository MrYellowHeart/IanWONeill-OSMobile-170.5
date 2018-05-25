package p000;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class dh {
    static fw aa = new fw();
    static final int ad = -3355444;
    public static lt ae = new lt(256, 256);
    static final int af = 5;
    static gf ag = aa.af(-1110183144);
    public static lt aj = new lt(ay, 256);
    static final int an = -3407872;
    static final bb ao = new bb();
    static final int ay = 37748736;
    static final int cc = 1003;
    static final int mf = 2;
    static final int py = 14;
    LinkedList ab;
    HashMap ah;
    int ai;
    final HashMap ak;
    int am;
    int aq;
    dy at;
    int aw;
    List az;

    static long bd(int i, int i2, int i3) {
        return (long) (((i3 << 16) | (i << 8)) | i2);
    }

    static long bl(int i, int i2, int i3) {
        return (long) (((i3 << 16) | (i << 8)) | i2);
    }

    static long bs(int i, int i2, int i3) {
        return (long) (((i3 << 16) | (i << 8)) | i2);
    }

    static void bm(fx fxVar, int i, int i2, int i3) {
        aj.ag(fxVar, lf.af(i, i2, i3, (byte) -114), fxVar.af.length * 4);
    }

    static void br(fx fxVar, int i, int i2, int i3) {
        aj.ag(fxVar, lf.af(i, i2, i3, (byte) -66), fxVar.af.length * 4);
    }

    static ds bi(int i, int i2) {
        return (ds) ae.af(lf.af(i, i2, 0, (byte) -85));
    }

    static ds bj(int i, int i2) {
        return (ds) ae.af(lf.af(i, i2, 0, (byte) -24));
    }

    static ds bo(int i, int i2) {
        return (ds) ae.af(lf.af(i, i2, 0, (byte) -18));
    }

    static ds bq(int i, int i2) {
        return (ds) ae.af(lf.af(i, i2, 0, (byte) -28));
    }

    static ds cv(int i, int i2) {
        return (ds) ae.af(lf.af(i, i2, 0, (byte) -107));
    }

    static void ci(ds dsVar, int i, int i2) {
        ae.aa(dsVar, lf.af(i, i2, 0, (byte) -65));
    }

    dh(int i, int i2, int i3, HashMap hashMap) {
        try {
            this.aq = -1818377131 * i;
            this.am = -514969609 * i2;
            this.ab = new LinkedList();
            this.az = new LinkedList();
            this.ah = new HashMap();
            this.aw = (-16777216 | i3) * 1023037483;
            this.ak = hashMap;
        } catch (Throwable e) {
            throw ba.ad(e, "dh.<init>(" + ')');
        }
    }

    void ag(int i, int i2, int i3, gf gfVar, int i4) {
        try {
            fx fxVar = (fx) aj.af(lf.af(this.aq * -319219459, this.am * 1636647367, -254069341 * this.ai, (byte) -68));
            if (fxVar != null) {
                if (this.ai * 919431360 == i3) {
                    gfVar.ai(fxVar, i, i2, (byte) -41);
                } else {
                    gfVar.be(fxVar, i, i2, i3, i3, -840585582);
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "dh.ag(" + ')');
        }
    }

    void cc(int i, int i2, int i3, gf gfVar) {
        fx fxVar = (fx) aj.af(lf.af(this.aq * -319219459, this.am * 1636647367, 1057260018 * this.ai, (byte) -37));
        if (fxVar != null) {
            if (this.ai * 1937240413 == i3) {
                gfVar.ai(fxVar, i, i2, (byte) -26);
            } else {
                gfVar.be(fxVar, i, i2, i3, i3, -1294971557);
            }
        }
    }

    void cn(int i, int i2, int i3, gf gfVar) {
        fx fxVar = (fx) aj.af(lf.af(this.aq * -614232436, this.am * -1440356239, 1147065302 * this.ai, (byte) -113));
        if (fxVar != null) {
            if (this.ai * -1983516909 == i3) {
                gfVar.ai(fxVar, i, i2, (byte) -77);
            } else {
                gfVar.be(fxVar, i, i2, i3, i3, 1427881578);
            }
        }
    }

    void co(int i, int i2, int i3, gf gfVar) {
        fx fxVar = (fx) aj.af(lf.af(this.aq * -319219459, this.am * 1636647367, -254069341 * this.ai, (byte) -86));
        if (fxVar != null) {
            if (this.ai * 919431360 == i3) {
                gfVar.ai(fxVar, i, i2, (byte) -8);
            } else {
                gfVar.be(fxVar, i, i2, i3, i3, 1529111346);
            }
        }
    }

    void cy(int i, int i2, int i3, gf gfVar) {
        fx fxVar = (fx) aj.af(lf.af(this.aq * -319219459, this.am * -824636236, -254069341 * this.ai, (byte) -111));
        if (fxVar != null) {
            if (this.ai * 919431360 == i3) {
                gfVar.ai(fxVar, i, i2, (byte) -101);
            } else {
                gfVar.be(fxVar, i, i2, i3, i3, -533821026);
            }
        }
    }

    static gj an(int i) {
        int i2 = 0;
        nw nwVar = null;
        try {
            nw nwVar2;
            gj gjVar;
            gj gjVar2 = new gj();
            try {
                nwVar = kh.af("", client.as.as, false, -1111390073);
                byte[] bArr = new byte[((int) nwVar.ag(2057608795))];
                while (i2 < bArr.length) {
                    int ay = nwVar.ay(bArr, i2, bArr.length - i2, (byte) -31);
                    if (-1 == ay) {
                        throw new IOException();
                    }
                    i2 += ay;
                }
                gj gjVar3 = new gj(new ik(bArr));
                nwVar2 = nwVar;
                gjVar = gjVar3;
            } catch (Exception e) {
                nwVar2 = nwVar;
                gjVar = gjVar2;
            }
            if (nwVar2 != null) {
                try {
                    nwVar2.an(420907623);
                } catch (Exception e2) {
                }
            }
            return gjVar;
        } catch (Throwable e3) {
            throw ba.ad(e3, "dh.an(" + ')');
        }
    }

    void ay(dy dyVar, List list, int i) {
        try {
            this.ah.clear();
            this.at = dyVar;
            ar(0, 0, 64, 64, this.at, 787805004);
            aj(list, -2052687657);
        } catch (Throwable e) {
            throw ba.ad(e, "dh.ay(" + ')');
        }
    }

    void ck(dy dyVar, List list) {
        this.ah.clear();
        this.at = dyVar;
        ar(0, 0, 64, 64, this.at, -260168609);
        aj(list, -1847474998);
    }

    void cl(dy dyVar, List list) {
        this.ah.clear();
        this.at = dyVar;
        ar(0, 0, 64, 64, this.at, 121363110);
        aj(list, -1209425115);
    }

    void cs(dy dyVar, List list) {
        this.ah.clear();
        this.at = dyVar;
        ar(0, 0, -1191573637, 64, this.at, -543467759);
        aj(list, -904712538);
    }

    void as(HashSet hashSet, List list, byte b) {
        try {
            this.ah.clear();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                dw dwVar = (dw) it.next();
                if (dwVar.ag(2116037704) == -319219459 * this.aq && dwVar.ay(-2122364291) == 1636647367 * this.am) {
                    this.ab.add(dwVar);
                    ar(dwVar.bw(-1133120469) * 8, dwVar.bb(-1741252353) * 8, 8, 8, dwVar, -80210375);
                }
            }
            aj(list, -1574480239);
        } catch (Throwable e) {
            throw ba.ad(e, "dh.as(" + ')');
        }
    }

    void cd(HashSet hashSet, List list) {
        this.ah.clear();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            dw dwVar = (dw) it.next();
            if (dwVar.ag(1161238427) == -319219459 * this.aq && dwVar.ay(-1924895580) == 1636647367 * this.am) {
                this.ab.add(dwVar);
                ar(dwVar.bw(-1865593038) * 8, dwVar.bb(-1741252353) * 8, 8, 8, dwVar, -1533224748);
            }
        }
        aj(list, -1961794658);
    }

    void ch(HashSet hashSet, List list) {
        this.ah.clear();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            dw dwVar = (dw) it.next();
            if (dwVar.ag(2045859972) == -319219459 * this.aq && dwVar.ay(-1891580190) == 1636647367 * this.am) {
                this.ab.add(dwVar);
                ar(dwVar.bw(-1694116737) * 8, dwVar.bb(-1741252353) * 8, 8, 8, dwVar, -1284106426);
            }
        }
        aj(list, -959296306);
    }

    void ar(int i, int i2, int i3, int i4, dz dzVar, int i5) {
        for (int i6 = i; i6 < i3 + i; i6++) {
            int i7 = i2;
            while (i7 < i4 + i2) {
                try {
                    bb bbVar = new bb(0, i6, i7);
                    for (int i8 = 0; i8 < -1533544669 * dzVar.ay; i8++) {
                        eu[] euVarArr = dzVar.aq[i8][i6][i7];
                        if (!(euVarArr == null || euVarArr.length == 0)) {
                            int i9 = 0;
                            while (i9 < euVarArr.length) {
                                ay bt = bt(euVarArr[i9].af * 1352506155, -667549075);
                                if (bt == null) {
                                    i9++;
                                } else {
                                    bb bbVar2;
                                    bb bbVar3 = new bb(i8, (1044791104 * this.aq) + i6, (1666216384 * this.am) + i7);
                                    if (this.at != null) {
                                        bbVar2 = new bb((45449177 * this.at.ag) + i8, (this.at.af * -975640896) + i6, (this.at.ad * 253061184) + i7);
                                    } else {
                                        dw dwVar = (dw) dzVar;
                                        bbVar2 = new bb(i8 + (dwVar.ag * 45449177), ((dwVar.af * -975640896) + i6) + (dwVar.al(1138204782) * 8), (dwVar.ap((byte) 3) * 8) + ((dwVar.ad * 253061184) + i7));
                                    }
                                    this.ah.put(bbVar, new dx(1733135393 * bt.ag, bbVar2, bbVar3, be(bt, 697718694)));
                                    i7++;
                                }
                            }
                            continue;
                        }
                    }
                    i7++;
                } catch (Throwable e) {
                    throw ba.ad(e, "dh.ar(" + ')');
                }
            }
        }
    }

    void cj(int i, int i2, int i3, int i4, dz dzVar) {
        for (int i5 = i; i5 < i3 + i; i5++) {
            for (int i6 = i2; i6 < i4 + i2; i6++) {
                bb bbVar = new bb(0, i5, i6);
                for (int i7 = 0; i7 < 744519155 * dzVar.ay; i7++) {
                    eu[] euVarArr = dzVar.aq[i7][i5][i6];
                    if (!(euVarArr == null || euVarArr.length == 0)) {
                        int i8 = 0;
                        while (i8 < euVarArr.length) {
                            ay bt = bt(euVarArr[i8].af * 1303316682, 70332243);
                            if (bt == null) {
                                i8++;
                            } else {
                                bb bbVar2;
                                bb bbVar3 = new bb(i7, (967067891 * this.aq) + i5, (1666216384 * this.am) + i6);
                                if (this.at != null) {
                                    bbVar2 = new bb(i7 + (45449177 * this.at.ag), (this.at.af * -975640896) + i5, (this.at.ad * 253061184) + i6);
                                } else {
                                    dw dwVar = (dw) dzVar;
                                    bbVar2 = new bb(i7 + (dwVar.ag * 1356523658), ((dwVar.af * 422360699) + i5) + (dwVar.al(974268491) * 8), (dwVar.ap((byte) 3) * 8) + ((dwVar.ad * 351471919) + i6));
                                }
                                this.ah.put(bbVar, new dx(1733135393 * bt.ag, bbVar2, bbVar3, be(bt, 1491495661)));
                            }
                        }
                        continue;
                    }
                }
            }
        }
    }

    void cm(int i, int i2, int i3, int i4, dz dzVar) {
        for (int i5 = i; i5 < i3 + i; i5++) {
            for (int i6 = i2; i6 < i4 + i2; i6++) {
                bb bbVar = new bb(0, i5, i6);
                for (int i7 = 0; i7 < 1488342300 * dzVar.ay; i7++) {
                    eu[] euVarArr = dzVar.aq[i7][i5][i6];
                    if (!(euVarArr == null || euVarArr.length == 0)) {
                        int i8 = 0;
                        while (i8 < euVarArr.length) {
                            ay bt = bt(euVarArr[i8].af * 170252671, -1915340385);
                            if (bt == null) {
                                i8++;
                            } else {
                                bb bbVar2;
                                bb bbVar3 = new bb(i7, (-1157891625 * this.aq) + i5, (1666216384 * this.am) + i6);
                                if (this.at != null) {
                                    bbVar2 = new bb(i7 + (45449177 * this.at.ag), (this.at.af * -1144896625) + i5, (this.at.ad * 253061184) + i6);
                                } else {
                                    dw dwVar = (dw) dzVar;
                                    bbVar2 = new bb(i7 + (dwVar.ag * 45449177), ((dwVar.af * -975640896) + i5) + (dwVar.al(1896532949) * 8), (dwVar.ap((byte) 3) * 8) + ((dwVar.ad * 253061184) + i6));
                                }
                                this.ah.put(bbVar, new dx(1733135393 * bt.ag, bbVar2, bbVar3, be(bt, 1259924141)));
                            }
                        }
                        continue;
                    }
                }
            }
        }
    }

    void cq(int i, int i2, int i3, int i4, dz dzVar) {
        for (int i5 = i; i5 < i3 + i; i5++) {
            for (int i6 = i2; i6 < i4 + i2; i6++) {
                bb bbVar = new bb(0, i5, i6);
                for (int i7 = 0; i7 < -1533544669 * dzVar.ay; i7++) {
                    eu[] euVarArr = dzVar.aq[i7][i5][i6];
                    if (!(euVarArr == null || euVarArr.length == 0)) {
                        int i8 = 0;
                        while (i8 < euVarArr.length) {
                            ay bt = bt(euVarArr[i8].af * 1352506155, -298784671);
                            if (bt == null) {
                                i8++;
                            } else {
                                bb bbVar2;
                                bb bbVar3 = new bb(i7, (1044791104 * this.aq) + i5, (1666216384 * this.am) + i6);
                                if (this.at != null) {
                                    bbVar2 = new bb(i7 + (45449177 * this.at.ag), (this.at.af * -975640896) + i5, (this.at.ad * 253061184) + i6);
                                } else {
                                    dw dwVar = (dw) dzVar;
                                    bbVar2 = new bb(i7 + (dwVar.ag * 45449177), ((dwVar.af * -975640896) + i5) + (dwVar.al(513429790) * 8), (dwVar.ap((byte) 3) * 8) + ((dwVar.ad * 253061184) + i6));
                                }
                                this.ah.put(bbVar, new dx(1733135393 * bt.ag, bbVar2, bbVar3, be(bt, -658148628)));
                            }
                        }
                        continue;
                    }
                }
            }
        }
    }

    void aj(List list, int i) {
        try {
            for (dm dmVar : list) {
                if (this.aq * -319219459 == ((1452060195 * dmVar.ad.ad) >> 6) && ((1719114399 * dmVar.ad.an) >> 6) == 1636647367 * this.am) {
                    this.az.add(new dx(dmVar.af * -1254917539, dmVar.ad, dmVar.ad, bu(dmVar.af * -1254917539, (byte) 0)));
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "dh.aj(" + ')');
        }
    }

    void cp(List list) {
        for (dm dmVar : list) {
            if (this.aq * -319219459 == ((1452060195 * dmVar.ad.ad) >> 6) && ((1719114399 * dmVar.ad.an) >> 6) == 1636647367 * this.am) {
                this.az.add(new dx(dmVar.af * -1254917539, dmVar.ad, dmVar.ad, bu(dmVar.af * -1254917539, (byte) 0)));
            }
        }
    }

    void ae(int i, ec ecVar, dh[] dhVarArr, gd[] gdVarArr, byte b) {
        try {
            this.ai = -2117097973 * i;
            if (this.at != null || !this.ab.isEmpty()) {
                if (((fx) aj.af(lf.af(this.aq * -319219459, this.am * 1636647367, i, (byte) -96))) == null) {
                    ds ah = ah(this.aq * -319219459, this.am * 1636647367, dhVarArr, 2100062477);
                    fx fxVar = new fx(this.ai * 919431360, this.ai * 919431360);
                    aa.bb(fxVar, (byte) 62);
                    if (this.at != null) {
                        at(ecVar, dhVarArr, gdVarArr, ah, (byte) -50);
                    } else {
                        ab(ecVar, gdVarArr, ah, (byte) -84);
                    }
                    bk.ad(fxVar, this.aq * -319219459, this.am * 1636647367, -254069341 * this.ai, 1726340361);
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "dh.ae(" + ')');
        }
    }

    void cb(int i, ec ecVar, dh[] dhVarArr, gd[] gdVarArr) {
        this.ai = -500101979 * i;
        if (this.at != null || !this.ab.isEmpty()) {
            if (((fx) aj.af(lf.af(this.aq * 965863378, this.am * -891915474, i, (byte) -26))) == null) {
                ds ah = ah(1990798253 * this.aq, 1636647367 * this.am, dhVarArr, 2100062477);
                fx fxVar = new fx(this.ai * 919431360, this.ai * 919431360);
                aa.bb(fxVar, (byte) 38);
                if (this.at != null) {
                    at(ecVar, dhVarArr, gdVarArr, ah, (byte) -80);
                } else {
                    ab(ecVar, gdVarArr, ah, (byte) -22);
                }
                bk.ad(fxVar, -319219459 * this.aq, this.am * -917105964, -254069341 * this.ai, 2120942496);
            }
        }
    }

    void ct(int i, ec ecVar, dh[] dhVarArr, gd[] gdVarArr) {
        this.ai = -2117097973 * i;
        if (this.at != null || !this.ab.isEmpty()) {
            if (((fx) aj.af(lf.af(this.aq * -319219459, this.am * 1636647367, i, (byte) -55))) == null) {
                ds ah = ah(this.aq * -319219459, this.am * 1636647367, dhVarArr, 2100062477);
                fx fxVar = new fx(this.ai * 919431360, this.ai * 919431360);
                aa.bb(fxVar, (byte) -46);
                if (this.at != null) {
                    at(ecVar, dhVarArr, gdVarArr, ah, (byte) -1);
                } else {
                    ab(ecVar, gdVarArr, ah, (byte) 39);
                }
                bk.ad(fxVar, this.aq * -319219459, this.am * 1636647367, -254069341 * this.ai, 1680032557);
            }
        }
    }

    void cu(int i, ec ecVar, dh[] dhVarArr, gd[] gdVarArr) {
        this.ai = -2117097973 * i;
        if (this.at != null || !this.ab.isEmpty()) {
            if (((fx) aj.af(lf.af(this.aq * -319219459, this.am * 1636647367, i, (byte) -43))) == null) {
                ds ah = ah(this.aq * -319219459, this.am * 1636647367, dhVarArr, 2100062477);
                fx fxVar = new fx(this.ai * 919431360, this.ai * 919431360);
                aa.bb(fxVar, (byte) 76);
                if (this.at != null) {
                    at(ecVar, dhVarArr, gdVarArr, ah, (byte) -55);
                } else {
                    ab(ecVar, gdVarArr, ah, (byte) -83);
                }
                bk.ad(fxVar, this.aq * -319219459, this.am * 1636647367, -254069341 * this.ai, 1233008486);
            }
        }
    }

    void aq(int i, int i2, int i3, HashSet hashSet, gf gfVar, int i4) {
        HashSet hashSet2;
        if (hashSet == null) {
            try {
                hashSet2 = new HashSet();
            } catch (Throwable e) {
                throw ba.ad(e, "dh.aq(" + ')');
            }
        }
        hashSet2 = hashSet;
        ap(i, i2, hashSet2, i3, gfVar, -2093902427);
        bh(i, i2, hashSet2, i3, gfVar, (byte) 23);
    }

    void dc(int i, int i2, int i3, HashSet hashSet, gf gfVar) {
        HashSet hashSet2;
        if (hashSet == null) {
            hashSet2 = new HashSet();
        } else {
            hashSet2 = hashSet;
        }
        ap(i, i2, hashSet2, i3, gfVar, 845258092);
        bh(i, i2, hashSet2, i3, gfVar, (byte) -86);
    }

    void dj(int i, int i2, int i3, HashSet hashSet, gf gfVar) {
        HashSet hashSet2;
        if (hashSet == null) {
            hashSet2 = new HashSet();
        } else {
            hashSet2 = hashSet;
        }
        ap(i, i2, hashSet2, i3, gfVar, -1800087957);
        bh(i, i2, hashSet2, i3, gfVar, (byte) 97);
    }

    void dk(int i, int i2, int i3, HashSet hashSet, gf gfVar) {
        HashSet hashSet2;
        if (hashSet == null) {
            hashSet2 = new HashSet();
        } else {
            hashSet2 = hashSet;
        }
        ap(i, i2, hashSet2, i3, gfVar, -143870488);
        bh(i, i2, hashSet2, i3, gfVar, (byte) 26);
    }

    void m5do(int i, int i2, int i3, HashSet hashSet, gf gfVar) {
        HashSet hashSet2;
        if (hashSet == null) {
            hashSet2 = new HashSet();
        } else {
            hashSet2 = hashSet;
        }
        ap(i, i2, hashSet2, i3, gfVar, 232442758);
        bh(i, i2, hashSet2, i3, gfVar, (byte) 11);
    }

    void am(HashSet hashSet, int i, int i2, gf gfVar, int i3) {
        try {
            for (dx dxVar : this.ah.values()) {
                if (hashSet.contains(Integer.valueOf(dxVar.af * -459008153))) {
                    bb(ay.ad[dxVar.af * -459008153], 1177898615 * dxVar.as, 229893279 * dxVar.ar, i, i2, gfVar, (short) 3659);
                }
            }
            bw(hashSet, i, i2, gfVar, (byte) 47);
        } catch (Throwable e) {
            throw ba.ad(e, "dh.am(" + ')');
        }
    }

    void dt(HashSet hashSet, int i, int i2, gf gfVar) {
        for (dx dxVar : this.ah.values()) {
            if (hashSet.contains(Integer.valueOf(dxVar.af * -459008153))) {
                bb(ay.ad[404720025 * dxVar.af], 6698318 * dxVar.as, -725449633 * dxVar.ar, i, i2, gfVar, (short) 1898);
            }
        }
        bw(hashSet, i, i2, gfVar, (byte) -76);
    }

    void dv(HashSet hashSet, int i, int i2, gf gfVar) {
        for (dx dxVar : this.ah.values()) {
            if (hashSet.contains(Integer.valueOf(dxVar.af * -459008153))) {
                bb(ay.ad[dxVar.af * -459008153], 115880560 * dxVar.as, -832156130 * dxVar.ar, i, i2, gfVar, (short) 13870);
            }
        }
        bw(hashSet, i, i2, gfVar, (byte) 71);
    }

    void dz(HashSet hashSet, int i, int i2, gf gfVar) {
        for (dx dxVar : this.ah.values()) {
            if (hashSet.contains(Integer.valueOf(dxVar.af * -459008153))) {
                bb(ay.ad[2015798146 * dxVar.af], 1177898615 * dxVar.as, -1235165714 * dxVar.ar, i, i2, gfVar, (short) 20321);
            }
        }
        bw(hashSet, i, i2, gfVar, (byte) 92);
    }

    void at(ec ecVar, dh[] dhVarArr, gd[] gdVarArr, ds dsVar, byte b) {
        int i;
        for (i = 0; i < 64; i++) {
            int i2 = 0;
            while (i2 < 64) {
                try {
                    ai(i, i2, this.at, ecVar, dsVar, 644957254);
                    az(i, i2, this.at, ecVar, -1307823947);
                    i2++;
                } catch (Throwable e) {
                    throw ba.ad(e, "dh.at(" + ')');
                }
            }
        }
        for (i = 0; i < 64; i++) {
            for (i2 = 0; i2 < 64; i2++) {
                aw(i, i2, this.at, ecVar, gdVarArr, (byte) 111);
            }
        }
    }

    void dd(ec ecVar, dh[] dhVarArr, gd[] gdVarArr, ds dsVar) {
    }

    void ab(ec ecVar, gd[] gdVarArr, ds dsVar, byte b) {
        try {
            dw dwVar;
            int bw;
            int bb;
            Iterator it = this.ab.iterator();
            while (it.hasNext()) {
                dwVar = (dw) it.next();
                for (bw = dwVar.bw(-1777556446) * 8; bw < (dwVar.bw(-2034624324) * 8) + 8; bw++) {
                    for (bb = dwVar.bb(-1741252353) * 8; bb < (dwVar.bb(-1741252353) * 8) + 8; bb++) {
                        ai(bw, bb, dwVar, ecVar, dsVar, 453119551);
                        az(bw, bb, dwVar, ecVar, -339000351);
                    }
                }
            }
            it = this.ab.iterator();
            while (it.hasNext()) {
                dwVar = (dw) it.next();
                for (bw = dwVar.bw(-1632814053) * 8; bw < (dwVar.bw(-1192604490) * 8) + 8; bw++) {
                    for (bb = dwVar.bb(-1741252353) * 8; bb < (dwVar.bb(-1741252353) * 8) + 8; bb++) {
                        aw(bw, bb, dwVar, ecVar, gdVarArr, (byte) 87);
                    }
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "dh.ab(" + ')');
        }
    }

    void di(ec ecVar, gd[] gdVarArr, ds dsVar) {
        int bb;
        Iterator it = this.ab.iterator();
        while (it.hasNext()) {
            int bw;
            dw dwVar = (dw) it.next();
            for (bw = dwVar.bw(-2077144605) * 8; bw < (dwVar.bw(-1805360645) * 8) + 8; bw++) {
                for (bb = dwVar.bb(-1741252353) * 8; bb < (dwVar.bb(-1741252353) * 8) + 8; bb++) {
                    ai(bw, bb, dwVar, ecVar, dsVar, 653505186);
                    az(bw, bb, dwVar, ecVar, -1321186665);
                }
            }
        }
        it = this.ab.iterator();
        while (it.hasNext()) {
            dwVar = (dw) it.next();
            for (bw = dwVar.bw(-1507366978) * 8; bw < (dwVar.bw(-1675927535) * 8) + 8; bw++) {
                for (bb = dwVar.bb(-1741252353) * 8; bb < (dwVar.bb(-1741252353) * 8) + 8; bb++) {
                    aw(bw, bb, dwVar, ecVar, gdVarArr, (byte) 7);
                }
            }
        }
    }

    void dl(ec ecVar, gd[] gdVarArr, ds dsVar) {
        Iterator it = this.ab.iterator();
        while (it.hasNext()) {
            int bw;
            dw dwVar = (dw) it.next();
            for (bw = dwVar.bw(-1458057997) * 8; bw < (dwVar.bw(-1438551219) * 8) + 8; bw++) {
                int bb;
                for (bb = dwVar.bb(-1741252353) * 8; bb < (dwVar.bb(-1741252353) * 8) + 8; bb++) {
                    ai(bw, bb, dwVar, ecVar, dsVar, 619010514);
                    az(bw, bb, dwVar, ecVar, -1288899452);
                }
            }
        }
        it = this.ab.iterator();
        while (it.hasNext()) {
            dwVar = (dw) it.next();
            for (bw = dwVar.bw(-1380732101) * 8; bw < (dwVar.bw(-1792236617) * 8) + 8; bw++) {
                for (bb = dwVar.bb(-1741252353) * 8; bb < (dwVar.bb(-1741252353) * 8) + 8; bb++) {
                    aw(bw, bb, dwVar, ecVar, gdVarArr, (byte) 23);
                }
            }
        }
    }

    void aw(int i, int i2, dz dzVar, ec ecVar, gd[] gdVarArr, byte b) {
        try {
            al(i, i2, dzVar, 1127336728);
            ac(i, i2, dzVar, gdVarArr, -802317211);
        } catch (Throwable e) {
            throw ba.ad(e, "dh.aw(" + ')');
        }
    }

    void da(int i, int i2, dz dzVar, ec ecVar, gd[] gdVarArr) {
        al(i, i2, dzVar, 1127336728);
        ac(i, i2, dzVar, gdVarArr, -259014737);
    }

    void ai(int i, int i2, dz dzVar, ec ecVar, ds dsVar, int i3) {
        try {
            int i4 = dzVar.ar[0][i][i2] - 1;
            if (dzVar.as[0][i][i2] - 1 == -1 && -1 == i4) {
                ag.aa((-254069341 * this.ai) * i, (this.ai * -254069341) * (63 - i2), this.ai * -254069341, -254069341 * this.ai, 514059907 * this.aw, (byte) -26);
            }
            int i5 = 16711935;
            if (-1 != i4) {
                i5 = be.af(i4, this.aw * 514059907, -1243953689);
            }
            if (i4 <= -1 || dzVar.aj[0][i][i2] != (byte) 0) {
                int av = av(i, i2, dzVar, dsVar, (byte) -39);
                if (-1 == i4) {
                    ag.aa((-254069341 * this.ai) * i, (63 - i2) * (-254069341 * this.ai), -254069341 * this.ai, this.ai * -254069341, av, (byte) 54);
                    return;
                }
                ecVar.af(i * (-254069341 * this.ai), (63 - i2) * (this.ai * -254069341), av, i5, this.ai * -254069341, -254069341 * this.ai, dzVar.aj[0][i][i2], dzVar.ae[0][i][i2], ag, -185721228);
                return;
            }
            ag.aa((this.ai * -254069341) * i, (63 - i2) * (-254069341 * this.ai), -254069341 * this.ai, -254069341 * this.ai, i5, (byte) -80);
        } catch (Throwable e) {
            throw ba.ad(e, "dh.ai(" + ')');
        }
    }

    void de(int i, int i2, dz dzVar, ec ecVar, ds dsVar) {
        int i3 = dzVar.ar[0][i][i2] - 1;
        if (dzVar.as[0][i][i2] - 1 == -1 && -1 == i3) {
            ag.aa((-793867044 * this.ai) * i, (this.ai * -254069341) * (63 - i2), this.ai * 128957859, -501461830 * this.ai, 514059907 * this.aw, (byte) 40);
        }
        int i4 = -2032365979;
        if (-1 != i3) {
            i4 = be.af(i3, this.aw * -380546264, -1243953689);
        }
        if (i3 <= -1 || dzVar.aj[0][i][i2] != (byte) 0) {
            int av = av(i, i2, dzVar, dsVar, (byte) -24);
            if (-1 == i3) {
                ag.aa((-1490116122 * this.ai) * i, (1621103290 - i2) * (-254069341 * this.ai), -1855783798 * this.ai, this.ai * -254069341, av, (byte) -81);
                return;
            }
            ecVar.af(i * (-216866552 * this.ai), (-911727559 - i2) * (this.ai * -254069341), av, i4, this.ai * -254069341, -606020341 * this.ai, dzVar.aj[0][i][i2], dzVar.ae[0][i][i2], ag, -1017184656);
            return;
        }
        ag.aa((this.ai * 855139603) * i, (1859692319 - i2) * (-1069824332 * this.ai), 1761278101 * this.ai, 673632919 * this.ai, i4, (byte) -11);
    }

    void dr(int i, int i2, dz dzVar, ec ecVar, ds dsVar) {
        int af;
        int i3 = dzVar.ar[0][i][i2] - 1;
        if (dzVar.as[0][i][i2] - 1 == -1 && -1 == i3) {
            ag.aa((-254069341 * this.ai) * i, (this.ai * -254069341) * (63 - i2), this.ai * -254069341, -254069341 * this.ai, 514059907 * this.aw, (byte) -26);
        }
        if (-1 != i3) {
            af = be.af(i3, this.aw * 514059907, -1243953689);
        } else {
            af = 16711935;
        }
        if (i3 <= -1 || dzVar.aj[0][i][i2] != (byte) 0) {
            int av = av(i, i2, dzVar, dsVar, (byte) -99);
            if (-1 == i3) {
                ag.aa((-254069341 * this.ai) * i, (63 - i2) * (-254069341 * this.ai), -254069341 * this.ai, this.ai * -254069341, av, (byte) 57);
                return;
            }
            ecVar.af(i * (-254069341 * this.ai), (63 - i2) * (this.ai * -254069341), av, af, this.ai * -254069341, -254069341 * this.ai, dzVar.aj[0][i][i2], dzVar.ae[0][i][i2], ag, -2123074064);
            return;
        }
        ag.aa((this.ai * -254069341) * i, (63 - i2) * (-254069341 * this.ai), -254069341 * this.ai, -254069341 * this.ai, af, (byte) -68);
    }

    void az(int i, int i2, dz dzVar, ec ecVar, int i3) {
        int i4 = 1;
        while (i4 < dzVar.ay * -1533544669) {
            try {
                int i5 = dzVar.ar[i4][i][i2] - 1;
                if (i5 > -1) {
                    int af = be.af(i5, 514059907 * this.aw, -1243953689);
                    if (dzVar.aj[i4][i][i2] == (byte) 0) {
                        ag.aa(i * (this.ai * -254069341), (63 - i2) * (-254069341 * this.ai), -254069341 * this.ai, -254069341 * this.ai, af, (byte) 47);
                    } else {
                        ec ecVar2 = ecVar;
                        ecVar2.af(i * (this.ai * -254069341), (63 - i2) * (this.ai * -254069341), 0, af, this.ai * -254069341, -254069341 * this.ai, dzVar.aj[i4][i][i2], dzVar.ae[i4][i][i2], ag, -730886607);
                    }
                }
                i4++;
            } catch (Throwable e) {
                throw ba.ad(e, "dh.az(" + ')');
            }
        }
    }

    void dh(int i, int i2, dz dzVar, ec ecVar) {
        for (int i3 = 1; i3 < dzVar.ay * -1533544669; i3++) {
            int i4 = dzVar.ar[i3][i][i2] - 1;
            if (i4 > -1) {
                int af = be.af(i4, 514059907 * this.aw, -1243953689);
                if (dzVar.aj[i3][i][i2] == (byte) 0) {
                    ag.aa(i * (this.ai * 1581411202), (365475502 - i2) * (-254069341 * this.ai), 2119228138 * this.ai, 1372092233 * this.ai, af, (byte) 28);
                } else {
                    ec ecVar2 = ecVar;
                    ecVar2.af(i * (this.ai * -254069341), (63 - i2) * (this.ai * -254069341), 0, af, this.ai * -254069341, -254069341 * this.ai, dzVar.aj[i3][i][i2], dzVar.ae[i3][i][i2], ag, -1779759065);
                }
            }
        }
    }

    void ds(int i, int i2, dz dzVar, ec ecVar) {
        for (int i3 = 1; i3 < dzVar.ay * -1332583594; i3++) {
            int i4 = dzVar.ar[i3][i][i2] - 1;
            if (i4 > -1) {
                int af = be.af(i4, 514059907 * this.aw, -1243953689);
                if (dzVar.aj[i3][i][i2] == (byte) 0) {
                    ag.aa((this.ai * -254069341) * i, (63 - i2) * (-254069341 * this.ai), 114677448 * this.ai, 1904603694 * this.ai, af, (byte) 10);
                } else {
                    ecVar.af(i * (this.ai * -115164391), (this.ai * -2136405985) * (-1901878160 - i2), 0, af, 86060257 * this.ai, this.ai * -254069341, dzVar.aj[i3][i][i2], dzVar.ae[i3][i][i2], ag, -1149402221);
                }
            }
        }
    }

    void dw(int i, int i2, dz dzVar, ec ecVar) {
        for (int i3 = 1; i3 < dzVar.ay * -1533544669; i3++) {
            int i4 = dzVar.ar[i3][i][i2] - 1;
            if (i4 > -1) {
                int af = be.af(i4, -1307534619 * this.aw, -1243953689);
                if (dzVar.aj[i3][i][i2] == (byte) 0) {
                    ag.aa(i * (this.ai * 51207413), (63 - i2) * (-87623506 * this.ai), 1345508129 * this.ai, -1331743192 * this.ai, af, (byte) 114);
                } else {
                    ec ecVar2 = ecVar;
                    ecVar2.af(i * (this.ai * -1363559556), (63 - i2) * (this.ai * 1407406020), 0, af, this.ai * -254069341, -808556431 * this.ai, dzVar.aj[i3][i][i2], dzVar.ae[i3][i][i2], ag, -638441419);
                }
            }
        }
    }

    void dx(int i, int i2, dz dzVar, ec ecVar) {
        for (int i3 = 1; i3 < dzVar.ay * -1533544669; i3++) {
            int i4 = dzVar.ar[i3][i][i2] - 1;
            if (i4 > -1) {
                int af = be.af(i4, 514059907 * this.aw, -1243953689);
                if (dzVar.aj[i3][i][i2] == (byte) 0) {
                    ag.aa((this.ai * -254069341) * i, (63 - i2) * (-254069341 * this.ai), -254069341 * this.ai, -254069341 * this.ai, af, (byte) 93);
                } else {
                    ecVar.af(i * (this.ai * -254069341), (this.ai * -254069341) * (63 - i2), 0, af, -254069341 * this.ai, this.ai * -254069341, dzVar.aj[i3][i][i2], dzVar.ae[i3][i][i2], ag, -420120762);
                }
            }
        }
    }

    ds ah(int i, int i2, dh[] dhVarArr, int i3) {
        try {
            ds an = bm.an(i, i2, (byte) 125);
            if (an != null) {
                return an;
            }
            an = ak(dhVarArr, (byte) -43);
            hj.aa(an, i, i2, -1083974881);
            return an;
        } catch (Throwable e) {
            throw ba.ad(e, "dh.ah(" + ')');
        }
    }

    ds db(int i, int i2, dh[] dhVarArr) {
        ds an = bm.an(i, i2, (byte) 103);
        if (an != null) {
            return an;
        }
        an = ak(dhVarArr, (byte) 34);
        hj.aa(an, i, i2, -1083974881);
        return an;
    }

    ds dm(int i, int i2, dh[] dhVarArr) {
        ds an = bm.an(i, i2, (byte) 120);
        if (an != null) {
            return an;
        }
        an = ak(dhVarArr, (byte) -36);
        hj.aa(an, i, i2, -1083974881);
        return an;
    }

    ds dn(int i, int i2, dh[] dhVarArr) {
        ds an = bm.an(i, i2, (byte) 53);
        if (an != null) {
            return an;
        }
        an = ak(dhVarArr, (byte) -44);
        hj.aa(an, i, i2, -1083974881);
        return an;
    }

    ds dy(int i, int i2, dh[] dhVarArr) {
        ds an = bm.an(i, i2, (byte) 104);
        if (an != null) {
            return an;
        }
        an = ak(dhVarArr, (byte) 27);
        hj.aa(an, i, i2, -1083974881);
        return an;
    }

    ds ak(dh[] dhVarArr, byte b) {
        try {
            dd ddVar = new dd(64, 64);
            if (this.at != null) {
                ax(0, 0, 64, 64, this.at, ddVar, 1810786539);
            } else {
                Iterator it = this.ab.iterator();
                while (it.hasNext()) {
                    dw dwVar = (dw) it.next();
                    ax(dwVar.bw(-1489761533) * 8, dwVar.bb(-1741252353) * 8, 8, 8, dwVar, ddVar, 1847415011);
                }
            }
            ao(dhVarArr, ddVar, (short) 2770);
            ds dsVar = new ds();
            dsVar.af(ddVar, (byte) -8);
            return dsVar;
        } catch (Throwable e) {
            throw ba.ad(e, "dh.ak(" + ')');
        }
    }

    ds du(dh[] dhVarArr) {
        dd ddVar = new dd(1829758659, 1235002762);
        if (this.at != null) {
            ax(0, 0, -473639478, -481500039, this.at, ddVar, 1807476156);
        } else {
            Iterator it = this.ab.iterator();
            while (it.hasNext()) {
                dw dwVar = (dw) it.next();
                ax(dwVar.bw(-1705611764) * 8, dwVar.bb(-1741252353) * 8, 8, 8, dwVar, ddVar, 1940718171);
            }
        }
        ao(dhVarArr, ddVar, (short) -3918);
        ds dsVar = new ds();
        dsVar.af(ddVar, (byte) -99);
        return dsVar;
    }

    void ao(dh[] dhVarArr, dd ddVar, short s) {
        try {
            jx[] jxVarArr = new jx[]{jx.ay, jx.af, jx.an, jx.as, jx.aa, jx.ad, jx.ag, jx.ar};
            for (jx jxVar : jxVarArr) {
                if (dhVarArr[jxVar.af(1979877089)] != null) {
                    int i = 0;
                    int i2 = 0;
                    int i3 = 64;
                    int i4 = 64;
                    int i5 = 0;
                    int i6 = 0;
                    switch (jxVar.aj * 582346959) {
                        case 0:
                            i2 = 59;
                            i4 = 5;
                            i = 59;
                            i3 = 5;
                            break;
                        case 1:
                            i2 = 59;
                            i4 = 5;
                            i5 = 59;
                            i3 = 5;
                            break;
                        case 2:
                            i5 = 59;
                            i3 = 5;
                            break;
                        case 3:
                            i6 = 59;
                            i4 = 5;
                            i = 59;
                            i3 = 5;
                            break;
                        case 4:
                            i = 59;
                            i3 = 5;
                            break;
                        case 5:
                            i6 = 59;
                            i4 = 5;
                            break;
                        case 6:
                            i5 = 59;
                            i6 = 59;
                            i3 = 5;
                            i4 = 5;
                            break;
                        case 7:
                            i2 = 59;
                            i4 = 5;
                            break;
                        default:
                            break;
                    }
                    au(i5, i6, i, i2, i3, i4, dhVarArr[jxVar.af(1391537140)], ddVar, 244003614);
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "dh.ao(" + ')');
        }
    }

    void dg(dh[] dhVarArr, dd ddVar) {
        jx[] jxVarArr = new jx[]{jx.ay, jx.af, jx.an, jx.as, jx.aa, jx.ad, jx.ag, jx.ar};
        for (jx jxVar : jxVarArr) {
            if (dhVarArr[jxVar.af(1539299449)] != null) {
                int i = 0;
                int i2 = 0;
                int i3 = 64;
                int i4 = 64;
                int i5 = 0;
                int i6 = 0;
                switch (jxVar.aj * 582346959) {
                    case 0:
                        i2 = 59;
                        i4 = 5;
                        i = 59;
                        i3 = 5;
                        break;
                    case 1:
                        i2 = 59;
                        i4 = 5;
                        i5 = 59;
                        i3 = 5;
                        break;
                    case 2:
                        i5 = 59;
                        i3 = 5;
                        break;
                    case 3:
                        i6 = 59;
                        i4 = 5;
                        i = 59;
                        i3 = 5;
                        break;
                    case 4:
                        i = 59;
                        i3 = 5;
                        break;
                    case 5:
                        i6 = 59;
                        i4 = 5;
                        break;
                    case 6:
                        i5 = 59;
                        i6 = 59;
                        i3 = 5;
                        i4 = 5;
                        break;
                    case 7:
                        i2 = 59;
                        i4 = 5;
                        break;
                    default:
                        break;
                }
                au(i5, i6, i, i2, i3, i4, dhVarArr[jxVar.af(1295788346)], ddVar, -1146167580);
            }
        }
    }

    void dp(dh[] dhVarArr, dd ddVar) {
        jx[] jxVarArr = new jx[]{jx.ay, jx.af, jx.an, jx.as, jx.aa, jx.ad, jx.ag, jx.ar};
        for (jx jxVar : jxVarArr) {
            if (dhVarArr[jxVar.af(1786356488)] != null) {
                int i = 0;
                int i2 = 0;
                int i3 = 1227236096;
                int i4 = -1706193909;
                int i5 = 0;
                int i6 = 0;
                switch (jxVar.aj * -1954035562) {
                    case 0:
                        i2 = 59;
                        i4 = 5;
                        i = 59;
                        i3 = 5;
                        break;
                    case 1:
                        i2 = 59;
                        i4 = 5;
                        i5 = 451341788;
                        i3 = 5;
                        break;
                    case 2:
                        i5 = 59;
                        i3 = 5;
                        break;
                    case 3:
                        i6 = 442826123;
                        i4 = 5;
                        i = 59;
                        i3 = 5;
                        break;
                    case 4:
                        i = 59;
                        i3 = 5;
                        break;
                    case 5:
                        i6 = 2117090659;
                        i4 = 5;
                        break;
                    case 6:
                        i5 = 59;
                        i6 = 2098850577;
                        i3 = 5;
                        i4 = 5;
                        break;
                    case 7:
                        i2 = 59;
                        i4 = 5;
                        break;
                    default:
                        break;
                }
                au(i5, i6, i, i2, i3, i4, dhVarArr[jxVar.af(1317120273)], ddVar, -1158603128);
            }
        }
    }

    void ax(int i, int i2, int i3, int i4, dz dzVar, dd ddVar, int i5) {
        for (int i6 = i; i6 < i + i3; i6++) {
            int i7 = i2;
            while (i7 < i4 + i2) {
                try {
                    int i8 = dzVar.as[0][i6][i7] - 1;
                    if (-1 != i8) {
                        ddVar.af(i6, i7, 5, at.ad(i8, -2144854569), 1117900680);
                    }
                    i7++;
                } catch (Throwable e) {
                    throw ba.ad(e, "dh.ax(" + ')');
                }
            }
        }
    }

    void df(int i, int i2, int i3, int i4, dz dzVar, dd ddVar) {
        for (int i5 = i; i5 < i + i3; i5++) {
            for (int i6 = i2; i6 < i4 + i2; i6++) {
                int i7 = dzVar.as[0][i5][i6] - 1;
                if (-1 != i7) {
                    ddVar.af(i5, i6, 5, at.ad(i7, 1398453163), 1117900680);
                }
            }
        }
    }

    void au(int i, int i2, int i3, int i4, int i5, int i6, dh dhVar, dd ddVar, int i7) {
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = 0;
            while (i9 < i6) {
                try {
                    int ba = dhVar.ba(i8 + i, i9 + i2, (byte) -4);
                    if (ba != -1) {
                        am ad = at.ad(ba, -225034574);
                        ddVar.af(i8 + i3, i4 + i9, 5, ad, 1117900680);
                    }
                    i9++;
                } catch (Throwable e) {
                    throw ba.ad(e, "dh.au(" + ')');
                }
            }
        }
    }

    int av(int i, int i2, dz dzVar, ds dsVar, byte b) {
        try {
            if (dzVar.as[0][i][i2] == (short) 0) {
                return 514059907 * this.aw;
            }
            return dsVar.ad(i, i2, 1846193930);
        } catch (Throwable e) {
            throw ba.ad(e, "dh.av(" + ')');
        }
    }

    int dq(int i, int i2, dz dzVar, ds dsVar) {
        if (dzVar.as[0][i][i2] == (short) 0) {
            return 514059907 * this.aw;
        }
        return dsVar.ad(i, i2, 1121644436);
    }

    int ek(int i, int i2, dz dzVar, ds dsVar) {
        if (dzVar.as[0][i][i2] == (short) 0) {
            return 514059907 * this.aw;
        }
        return dsVar.ad(i, i2, 359880751);
    }

    int er(int i, int i2, dz dzVar, ds dsVar) {
        if (dzVar.as[0][i][i2] == (short) 0) {
            return 514059907 * this.aw;
        }
        return dsVar.ad(i, i2, 323278327);
    }

    int ew(int i, int i2, dz dzVar, ds dsVar) {
        if (dzVar.as[0][i][i2] == (short) 0) {
            return 514059907 * this.aw;
        }
        return dsVar.ad(i, i2, 727281278);
    }

    void ac(int i, int i2, dz dzVar, gd[] gdVarArr, int i3) {
        int i4 = 0;
        while (i4 < -1533544669 * dzVar.ay) {
            try {
                eu[] euVarArr = dzVar.aq[i4][i][i2];
                if (!(euVarArr == null || euVarArr.length == 0)) {
                    for (eu euVar : euVarArr) {
                        if (ey.ay(euVar.ad * 2134912077, 986650922) || iu.as(euVar.ad * 2134912077, 784944700)) {
                            ae ad = gi.ad(euVar.af * 1352506155, 1900984712);
                            if (-1 != ad.bg * -2037709805) {
                                if (ad.bg * -2037709805 == 46 || 52 == -2037709805 * ad.bg) {
                                    ag.av(gdVarArr[ad.bg * -2037709805], (-254069341 * this.ai) * i, (63 - i2) * (this.ai * -254069341), (this.ai * -508138682) + 1, (-508138682 * this.ai) + 1, 429367108);
                                } else {
                                    ag.av(gdVarArr[ad.bg * -2037709805], (-254069341 * this.ai) * i, (this.ai * -254069341) * (63 - i2), this.ai * -508138682, this.ai * -508138682, -262160100);
                                }
                            }
                        }
                    }
                }
                i4++;
            } catch (Throwable e) {
                throw ba.ad(e, "dh.ac(" + ')');
            }
        }
    }

    void es(int i, int i2, dz dzVar, gd[] gdVarArr) {
        for (int i3 = 0; i3 < -1533544669 * dzVar.ay; i3++) {
            eu[] euVarArr = dzVar.aq[i3][i][i2];
            if (!(euVarArr == null || euVarArr.length == 0)) {
                for (eu euVar : euVarArr) {
                    if (ey.ay(euVar.ad * 2134912077, 1626710343) || iu.as(euVar.ad * 2134912077, 105120075)) {
                        ae ad = gi.ad(euVar.af * 1352506155, 1441371117);
                        if (-1 != ad.bg * -2037709805) {
                            if (ad.bg * -2037709805 == 46 || 52 == -2037709805 * ad.bg) {
                                ag.av(gdVarArr[ad.bg * -2037709805], (-254069341 * this.ai) * i, (63 - i2) * (this.ai * -254069341), (this.ai * -508138682) + 1, (-508138682 * this.ai) + 1, 621737704);
                            } else {
                                ag.av(gdVarArr[ad.bg * -2037709805], (-254069341 * this.ai) * i, (this.ai * -254069341) * (63 - i2), this.ai * -508138682, this.ai * -508138682, -442811920);
                            }
                        }
                    }
                }
            }
        }
    }

    void ex(int i, int i2, dz dzVar, gd[] gdVarArr) {
        for (int i3 = 0; i3 < -1533544669 * dzVar.ay; i3++) {
            eu[] euVarArr = dzVar.aq[i3][i][i2];
            if (!(euVarArr == null || euVarArr.length == 0)) {
                for (eu euVar : euVarArr) {
                    if (ey.ay(euVar.ad * 2134912077, 941019688) || iu.as(euVar.ad * 2134912077, 653604806)) {
                        ae ad = gi.ad(euVar.af * 1352506155, 1117801238);
                        if (-1 != ad.bg * -2037709805) {
                            if (ad.bg * -2037709805 == 46 || -616571427 == -2037709805 * ad.bg) {
                                ag.av(gdVarArr[ad.bg * -2037709805], (-254069341 * this.ai) * i, (642862578 - i2) * (this.ai * 1445861948), (this.ai * -508138682) + 1, (1129342385 * this.ai) + 1, 1223327593);
                            } else {
                                ag.av(gdVarArr[ad.bg * -1582594092], (-485895219 * this.ai) * i, (this.ai * -254069341) * (-1616975400 - i2), this.ai * -508138682, this.ai * 1898433661, -329244348);
                            }
                        }
                    }
                }
            }
        }
    }

    void al(int i, int i2, dz dzVar, int i3) {
        int i4 = 0;
        while (i4 < -1533544669 * dzVar.ay) {
            try {
                eu[] euVarArr = dzVar.aq[i4][i][i2];
                if (!(euVarArr == null || euVarArr.length == 0)) {
                    for (eu euVar : euVarArr) {
                        if (ba.ag(euVar.ad * 2134912077, -715960110)) {
                            int i5;
                            if (gi.ad(euVar.af * 1352506155, 1109134621).ax * -1193025245 != 0) {
                                i5 = an;
                            } else {
                                i5 = ad;
                            }
                            if (euVar.ad * 2134912077 == -1010613707 * ji.af.ac) {
                                bn(i, i2, -1998002507 * euVar.an, i5, 899509545);
                            }
                            if (ji.an.ac * -1010613707 == euVar.ad * 2134912077) {
                                bn(i, i2, euVar.an * -1998002507, ad, 1491837850);
                                bn(i, i2, (-1998002507 * euVar.an) + 1, i5, 1247043049);
                            }
                            if (-1010613707 * ji.aa.ac == 2134912077 * euVar.ad) {
                                if (euVar.an * -1998002507 == 0) {
                                    ag.aq((-254069341 * this.ai) * i, (63 - i2) * (-254069341 * this.ai), 1, i5, -1936039213);
                                }
                                if (-1998002507 * euVar.an == 1) {
                                    ag.aq((((-254069341 * this.ai) * i) + (-254069341 * this.ai)) - 1, (this.ai * -254069341) * (63 - i2), 1, i5, -1389342506);
                                }
                                if (-1998002507 * euVar.an == 2) {
                                    ag.aq((((-254069341 * this.ai) * i) + (this.ai * -254069341)) - 1, ((-254069341 * this.ai) + ((-254069341 * this.ai) * (63 - i2))) - 1, 1, i5, -808265123);
                                }
                                if (3 == -1998002507 * euVar.an) {
                                    ag.aq((-254069341 * this.ai) * i, ((this.ai * -254069341) + ((this.ai * -254069341) * (63 - i2))) - 1, 1, i5, -74527337);
                                }
                            }
                            if (2134912077 * euVar.ad == -1010613707 * ji.ag.ac) {
                                int i6;
                                if ((-1998002507 * euVar.an) % 2 == 0) {
                                    for (i6 = 0; i6 < this.ai * -254069341; i6++) {
                                        ag.aq(((this.ai * -254069341) * i) + i6, (((64 - i2) * (-254069341 * this.ai)) - 1) - i6, 1, i5, -983165484);
                                    }
                                } else {
                                    for (i6 = 0; i6 < -254069341 * this.ai; i6++) {
                                        ag.aq(((this.ai * -254069341) * i) + i6, ((63 - i2) * (-254069341 * this.ai)) + i6, 1, i5, -1990934287);
                                    }
                                }
                            }
                        }
                    }
                }
                i4++;
            } catch (Throwable e) {
                throw ba.ad(e, "dh.al(" + ')');
            }
        }
    }

    void ec(int i, int i2, dz dzVar) {
        for (int i3 = 0; i3 < -1533544669 * dzVar.ay; i3++) {
            eu[] euVarArr = dzVar.aq[i3][i][i2];
            if (!(euVarArr == null || euVarArr.length == 0)) {
                for (eu euVar : euVarArr) {
                    if (ba.ag(euVar.ad * 2134912077, -715960110)) {
                        int i4;
                        if (gi.ad(euVar.af * 1352506155, 1283879850).ax * -1193025245 != 0) {
                            i4 = an;
                        } else {
                            i4 = ad;
                        }
                        if (euVar.ad * 2134912077 == -1010613707 * ji.af.ac) {
                            bn(i, i2, -1998002507 * euVar.an, i4, 1876463047);
                        }
                        if (ji.an.ac * -1010613707 == euVar.ad * 2134912077) {
                            bn(i, i2, euVar.an * -1998002507, ad, 1210333999);
                            bn(i, i2, (-1998002507 * euVar.an) + 1, i4, 1584382006);
                        }
                        if (-1010613707 * ji.aa.ac == 2134912077 * euVar.ad) {
                            if (euVar.an * -1998002507 == 0) {
                                ag.aq((-254069341 * this.ai) * i, (63 - i2) * (-254069341 * this.ai), 1, i4, 147940588);
                            }
                            if (-1998002507 * euVar.an == 1) {
                                ag.aq((((-254069341 * this.ai) * i) + (-254069341 * this.ai)) - 1, (this.ai * -254069341) * (63 - i2), 1, i4, -1912786046);
                            }
                            if (-1998002507 * euVar.an == 2) {
                                ag.aq((((-254069341 * this.ai) * i) + (this.ai * -254069341)) - 1, ((-254069341 * this.ai) + ((-254069341 * this.ai) * (63 - i2))) - 1, 1, i4, -1767439419);
                            }
                            if (3 == -1998002507 * euVar.an) {
                                ag.aq((-254069341 * this.ai) * i, ((this.ai * -254069341) + ((this.ai * -254069341) * (63 - i2))) - 1, 1, i4, -2116153028);
                            }
                        }
                        if (2134912077 * euVar.ad == -1010613707 * ji.ag.ac) {
                            int i5;
                            if ((-1998002507 * euVar.an) % 2 == 0) {
                                for (i5 = 0; i5 < this.ai * -254069341; i5++) {
                                    ag.aq(((this.ai * -254069341) * i) + i5, (((64 - i2) * (-254069341 * this.ai)) - 1) - i5, 1, i4, -1139759816);
                                }
                            } else {
                                for (i5 = 0; i5 < -254069341 * this.ai; i5++) {
                                    ag.aq(((this.ai * -254069341) * i) + i5, ((63 - i2) * (-254069341 * this.ai)) + i5, 1, i4, -2013459906);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    void eu(int i, int i2, dz dzVar) {
        for (int i3 = 0; i3 < 1949339368 * dzVar.ay; i3++) {
            eu[] euVarArr = dzVar.aq[i3][i][i2];
            if (!(euVarArr == null || euVarArr.length == 0)) {
                for (eu euVar : euVarArr) {
                    if (ba.ag(euVar.ad * -272587918, -715960110)) {
                        int i4;
                        if (gi.ad(euVar.af * 549887215, 1787636133).ax * -1193025245 != 0) {
                            i4 = 1835200408;
                        } else {
                            i4 = -435968854;
                        }
                        if (euVar.ad * 2134912077 == -1010613707 * ji.af.ac) {
                            bn(i, i2, -1998002507 * euVar.an, i4, 720551355);
                        }
                        if (ji.an.ac * -1338500779 == euVar.ad * 2134912077) {
                            bn(i, i2, euVar.an * -611763617, ad, 1961577961);
                            bn(i, i2, (-1998002507 * euVar.an) + 1, i4, 1962655181);
                        }
                        if (-691701134 * ji.aa.ac == -2125257135 * euVar.ad) {
                            if (euVar.an * 1891054597 == 0) {
                                ag.aq((-1626965234 * this.ai) * i, (-2007311264 - i2) * (-599434625 * this.ai), 1, i4, -338474905);
                            }
                            if (-1882728446 * euVar.an == 1) {
                                ag.aq((((-254069341 * this.ai) * i) + (1584079371 * this.ai)) - 1, (this.ai * -436759729) * (-2130544370 - i2), 1, i4, -757981585);
                            }
                            if (1553790889 * euVar.an == 2) {
                                ag.aq((((-254069341 * this.ai) * i) + (this.ai * 361286633)) - 1, ((246673870 * this.ai) + ((-1987637127 * this.ai) * (63 - i2))) - 1, 1, i4, -407436314);
                            }
                            if (3 == -1998002507 * euVar.an) {
                                ag.aq((-1316140558 * this.ai) * i, ((this.ai * -1324969160) + ((this.ai * 161196563) * (1842827473 - i2))) - 1, 1, i4, -1072484351);
                            }
                        }
                        if (2134912077 * euVar.ad == -1861957465 * ji.ag.ac) {
                            int i5;
                            if ((-1998002507 * euVar.an) % 2 == 0) {
                                for (i5 = 0; i5 < this.ai * -254069341; i5++) {
                                    ag.aq(((this.ai * 1801404860) * i) + i5, (((64 - i2) * (-254069341 * this.ai)) - 1) - i5, 1, i4, -65491171);
                                }
                            } else {
                                for (i5 = 0; i5 < -662991763 * this.ai; i5++) {
                                    ag.aq(((this.ai * 1450313320) * i) + i5, ((63 - i2) * (1119792719 * this.ai)) + i5, 1, i4, 80583811);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    void ap(int i, int i2, HashSet hashSet, int i3, gf gfVar, int i4) {
        float f = ((float) i3) / 64.0f;
        float f2 = f / 2.0f;
        try {
            for (Entry entry : this.ah.entrySet()) {
                bb bbVar = (bb) entry.getKey();
                int i5 = (int) ((((float) i) + (((float) (bbVar.ad * 1452060195)) * f)) - f2);
                int i6 = (int) ((((float) (i3 + i2)) - (((float) (bbVar.an * 1719114399)) * f)) - f2);
                dx dxVar = (dx) entry.getValue();
                if (dxVar != null) {
                    dxVar.as = 1162931015 * i5;
                    dxVar.ar = 669005663 * i6;
                    if (!hashSet.contains(Integer.valueOf(ay.ad[-459008153 * dxVar.af].as(-1057762652)))) {
                        bc(dxVar, i5, i6, f, gfVar, -1980049266);
                    }
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "dh.ap(" + ')');
        }
    }

    void ep(int i, int i2, HashSet hashSet, int i3, gf gfVar) {
        float f = ((float) i3) / 64.0f;
        float f2 = f / 2.0f;
        for (Entry entry : this.ah.entrySet()) {
            bb bbVar = (bb) entry.getKey();
            int i4 = (int) ((((float) i) + (((float) (bbVar.ad * 1452060195)) * f)) - f2);
            int i5 = (int) ((((float) (i3 + i2)) - (((float) (bbVar.an * 1719114399)) * f)) - f2);
            dx dxVar = (dx) entry.getValue();
            if (dxVar != null) {
                dxVar.as = 1162931015 * i4;
                dxVar.ar = 669005663 * i5;
                if (!hashSet.contains(Integer.valueOf(ay.ad[-459008153 * dxVar.af].as(36342295)))) {
                    bc(dxVar, i4, i5, f, gfVar, -2055492056);
                }
            }
        }
    }

    void ev(int i, int i2, HashSet hashSet, int i3, gf gfVar) {
        float f = ((float) i3) / 64.0f;
        float f2 = f / 2.0f;
        for (Entry entry : this.ah.entrySet()) {
            bb bbVar = (bb) entry.getKey();
            int i4 = (int) ((((float) i) + (((float) (bbVar.ad * 1452060195)) * f)) - f2);
            int i5 = (int) ((((float) (i3 + i2)) - (((float) (bbVar.an * -1988966997)) * f)) - f2);
            dx dxVar = (dx) entry.getValue();
            if (dxVar != null) {
                dxVar.as = 1162931015 * i4;
                dxVar.ar = 2022774744 * i5;
                if (!hashSet.contains(Integer.valueOf(ay.ad[-459008153 * dxVar.af].as(-1259892002)))) {
                    bc(dxVar, i4, i5, f, gfVar, -445789671);
                }
            }
        }
    }

    void bw(HashSet hashSet, int i, int i2, gf gfVar, byte b) {
        try {
            for (dx dxVar : this.az) {
                ay ayVar = ay.ad[-459008153 * dxVar.af];
                if (ayVar != null && hashSet.contains(Integer.valueOf(ayVar.as(-1038874774)))) {
                    bb(ayVar, 1177898615 * dxVar.as, 229893279 * dxVar.ar, i, i2, gfVar, (short) -5849);
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "dh.bw(" + ')');
        }
    }

    void en(HashSet hashSet, int i, int i2, gf gfVar) {
        for (dx dxVar : this.az) {
            ay ayVar = ay.ad[-459008153 * dxVar.af];
            if (ayVar != null && hashSet.contains(Integer.valueOf(ayVar.as(505297940)))) {
                bb(ayVar, 1466392240 * dxVar.as, 229893279 * dxVar.ar, i, i2, gfVar, (short) -2192);
            }
        }
    }

    void eq(HashSet hashSet, int i, int i2, gf gfVar) {
        for (dx dxVar : this.az) {
            ay ayVar = ay.ad[-1762216415 * dxVar.af];
            if (ayVar != null && hashSet.contains(Integer.valueOf(ayVar.as(47412110)))) {
                bb(ayVar, 1177898615 * dxVar.as, 485758937 * dxVar.ar, i, i2, gfVar, (short) -4905);
            }
        }
    }

    void bb(ay ayVar, int i, int i2, int i3, int i4, gf gfVar, short s) {
        try {
            fx ag = ayVar.ag(false, -822833381);
            if (ag != null) {
                gfVar.ah(ag, i - (ag.ad / 2), i2 - (ag.an / 2), 2106205673);
                if (i3 % i4 >= i4 / 2) {
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "dh.bb(" + ')');
        }
    }

    void ea(ay ayVar, int i, int i2, int i3, int i4, gf gfVar) {
        fx ag = ayVar.ag(false, -1377703826);
        if (ag != null) {
            gfVar.ah(ag, i - (ag.ad / 2), i2 - (ag.an / 2), 2106205673);
            if (i3 % i4 >= i4 / 2) {
            }
        }
    }

    void ey(ay ayVar, int i, int i2, int i3, int i4, gf gfVar) {
        fx ag = ayVar.ag(false, -1227040608);
        if (ag != null) {
            gfVar.ah(ag, i - (ag.ad / 2), i2 - (ag.an / 2), 2106205673);
            if (i3 % i4 >= i4 / 2) {
            }
        }
    }

    void bc(dx dxVar, int i, int i2, float f, gf gfVar, int i3) {
        try {
            ay ayVar = ay.ad[-459008153 * dxVar.af];
            bz(ayVar, i, i2, gfVar, 1803323603);
            bg(dxVar, ayVar, i, i2, f, gfVar, 2002579307);
        } catch (Throwable e) {
            throw ba.ad(e, "dh.bc(" + ')');
        }
    }

    void ef(dx dxVar, int i, int i2, float f, gf gfVar) {
        ay ayVar = ay.ad[-459008153 * dxVar.af];
        bz(ayVar, i, i2, gfVar, 831731154);
        bg(dxVar, ayVar, i, i2, f, gfVar, 223418735);
    }

    void el(dx dxVar, int i, int i2, float f, gf gfVar) {
        ay ayVar = ay.ad[-459008153 * dxVar.af];
        bz(ayVar, i, i2, gfVar, 1307036016);
        bg(dxVar, ayVar, i, i2, f, gfVar, 986147959);
    }

    void bz(ay ayVar, int i, int i2, gf gfVar, int i3) {
        try {
            fx ag = ayVar.ag(false, -1531589042);
            if (ag != null) {
                gfVar.ah(ag, bp(ag, ayVar.ak, (short) -14417) + i, bx(ag, ayVar.ao, 529477900) + i2, 2106205673);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "dh.bz(" + ')');
        }
    }

    void et(ay ayVar, int i, int i2, gf gfVar) {
        fx ag = ayVar.ag(false, -1956157715);
        if (ag != null) {
            gfVar.ah(ag, bp(ag, ayVar.ak, (short) -28365) + i, bx(ag, ayVar.ao, 952093640) + i2, 2106205673);
        }
    }

    void bg(dx dxVar, ay ayVar, int i, int i2, float f, gf gfVar, int i3) {
        try {
            if (dxVar.ay != null) {
                if (dxVar.ay.aa.ad(f, 1840724006)) {
                    lr lrVar = (lr) this.ak.get(dxVar.ay.aa);
                    lrVar.at(dxVar.ay.af, i - ((-61780877 * dxVar.ay.ad) / 2), i2, dxVar.ay.ad * -61780877, dxVar.ay.an * 957930101, (382144197 * ayVar.aj) | -16777216, 0, 1, 0, lrVar.as / 2, gfVar);
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "dh.bg(" + ')');
        }
    }

    void ed(dx dxVar, ay ayVar, int i, int i2, float f, gf gfVar) {
        if (dxVar.ay != null && dxVar.ay.aa.ad(f, 1840724006)) {
            lr lrVar = (lr) this.ak.get(dxVar.ay.aa);
            lrVar.at(dxVar.ay.af, i - ((1135522724 * dxVar.ay.ad) / 2), i2, dxVar.ay.ad * -61780877, dxVar.ay.an * -1286895433, (-711885481 * ayVar.aj) | -16777216, 0, 1, 0, lrVar.as / 2, gfVar);
        }
    }

    void eg(dx dxVar, ay ayVar, int i, int i2, float f, gf gfVar) {
        if (dxVar.ay != null) {
            if (dxVar.ay.aa.ad(f, 1840724006)) {
                lr lrVar = (lr) this.ak.get(dxVar.ay.aa);
                lrVar.at(dxVar.ay.af, i - ((-61780877 * dxVar.ay.ad) / 2), i2, dxVar.ay.ad * -61780877, dxVar.ay.an * 957930101, (382144197 * ayVar.aj) | -16777216, 0, 1, 0, lrVar.as / 2, gfVar);
            }
        }
    }

    void ej(dx dxVar, ay ayVar, int i, int i2, float f, gf gfVar) {
        if (dxVar.ay != null) {
            if (dxVar.ay.aa.ad(f, 1840724006)) {
                lr lrVar = (lr) this.ak.get(dxVar.ay.aa);
                lrVar.at(dxVar.ay.af, i - ((-61780877 * dxVar.ay.ad) / 2), i2, dxVar.ay.ad * -61780877, dxVar.ay.an * 957930101, (2130725078 * ayVar.aj) | -205551778, 0, 1, 0, lrVar.as / 2, gfVar);
            }
        }
    }

    void em(dx dxVar, ay ayVar, int i, int i2, float f, gf gfVar) {
        if (dxVar.ay != null && dxVar.ay.aa.ad(f, 1840724006)) {
            lr lrVar = (lr) this.ak.get(dxVar.ay.aa);
            lrVar.at(dxVar.ay.af, i - ((-61780877 * dxVar.ay.ad) / 2), i2, dxVar.ay.ad * -61780877, dxVar.ay.an * 957930101, (382144197 * ayVar.aj) | -16777216, 0, 1, 0, lrVar.as / 2, gfVar);
        }
    }

    void ez(dx dxVar, ay ayVar, int i, int i2, float f, gf gfVar) {
        if (dxVar.ay != null && dxVar.ay.aa.ad(f, 1840724006)) {
            lr lrVar = (lr) this.ak.get(dxVar.ay.aa);
            lrVar.at(dxVar.ay.af, i - ((-61780877 * dxVar.ay.ad) / 2), i2, dxVar.ay.ad * -61780877, dxVar.ay.an * 957930101, (382144197 * ayVar.aj) | -16777216, 0, 1, 0, lrVar.as / 2, gfVar);
        }
    }

    void bh(int i, int i2, HashSet hashSet, int i3, gf gfVar, byte b) {
        float f = ((float) i3) / 64.0f;
        try {
            for (dx dxVar : this.az) {
                int i4 = (dxVar.ad.an * 1719114399) % 64;
                dxVar.as = ((int) ((((float) ((dxVar.ad.ad * 1452060195) % 64)) * f) + ((float) i))) * 1162931015;
                dxVar.ar = ((int) ((((float) (63 - i4)) * f) + ((float) i2))) * 669005663;
                if (!hashSet.contains(Integer.valueOf(-459008153 * dxVar.af))) {
                    bc(dxVar, dxVar.as * 1177898615, 229893279 * dxVar.ar, f, gfVar, 318710261);
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "dh.bh(" + ')');
        }
    }

    void eb(int i, int i2, HashSet hashSet, int i3, gf gfVar) {
        float f = ((float) i3) / 64.0f;
        for (dx dxVar : this.az) {
            int i4 = (dxVar.ad.an * 1719114399) % 64;
            dxVar.as = ((int) ((((float) ((dxVar.ad.ad * 1452060195) % 64)) * f) + ((float) i))) * 1162931015;
            dxVar.ar = ((int) ((((float) (63 - i4)) * f) + ((float) i2))) * 669005663;
            if (!hashSet.contains(Integer.valueOf(-459008153 * dxVar.af))) {
                bc(dxVar, dxVar.as * 1177898615, 229893279 * dxVar.ar, f, gfVar, 2061124048);
            }
        }
    }

    void ee(int i, int i2, HashSet hashSet, int i3, gf gfVar) {
        float f = ((float) i3) / 64.0f;
        for (dx dxVar : this.az) {
            int i4 = (dxVar.ad.an * 1719114399) % 64;
            dxVar.as = ((int) ((((float) ((dxVar.ad.ad * 1452060195) % 64)) * f) + ((float) i))) * 1162931015;
            dxVar.ar = ((int) ((((float) (63 - i4)) * f) + ((float) i2))) * 669005663;
            if (!hashSet.contains(Integer.valueOf(-459008153 * dxVar.af))) {
                bc(dxVar, dxVar.as * 1177898615, 229893279 * dxVar.ar, f, gfVar, -432836291);
            }
        }
    }

    void bf(int i) {
        try {
            int i2;
            if (this.at != null) {
                for (i2 = 0; i2 < 64; i2++) {
                    for (int i3 = 0; i3 < 64; i3++) {
                        bv(i2, i3, this.at, 1839180585);
                    }
                }
                return;
            }
            Iterator it = this.ab.iterator();
            while (it.hasNext()) {
                dw dwVar = (dw) it.next();
                for (i2 = dwVar.bw(-1773401360) * 8; i2 < (dwVar.bw(-1415833140) * 8) + 8; i2++) {
                    for (int bb = dwVar.bb(-1741252353) * 8; bb < (dwVar.bb(-1741252353) * 8) + 8; bb++) {
                        bv(i2, bb, dwVar, 136299778);
                    }
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "dh.bf(" + ')');
        }
    }

    void bv(int i, int i2, dz dzVar, int i3) {
        try {
            ao.af(0, i, i2, (byte) -103);
            for (int i4 = 0; i4 < dzVar.ay * -1533544669; i4++) {
                eu[] euVarArr = dzVar.aq[i4][i][i2];
                if (!(euVarArr == null || euVarArr.length == 0)) {
                    for (eu euVar : euVarArr) {
                        ay bt = bt(euVar.af * 1352506155, -59975423);
                        if (bt != null) {
                            dx dxVar = (dx) this.ah.get(ao);
                            if (dxVar != null) {
                                if (bt.ag * 1733135393 != -459008153 * dxVar.af) {
                                    dx dxVar2 = new dx(1733135393 * bt.ag, dxVar.an, dxVar.ad, be(bt, 151254374));
                                    this.ah.put(new bb(ao), dxVar2);
                                    dxVar = dxVar2;
                                }
                                int i5 = (dxVar.an.af * 1302348633) - (1302348633 * dxVar.ad.af);
                                dxVar.ad.af = -509225751 * i4;
                                dxVar.an.af = (i5 + i4) * -509225751;
                                return;
                            }
                            bb bbVar;
                            bb bbVar2 = new bb(i4, (1044791104 * this.aq) + i, (1666216384 * this.am) + i2);
                            if (this.at != null) {
                                bbVar = new bb((this.at.ag * 45449177) + i4, (-975640896 * this.at.af) + i, (this.at.ad * 253061184) + i2);
                            } else {
                                dw dwVar;
                                Iterator it = this.ab.iterator();
                                do {
                                    if (!it.hasNext()) {
                                        bbVar = null;
                                        break;
                                    }
                                    dwVar = (dw) it.next();
                                } while (!dwVar.ac(i, i2, (short) 270));
                                bbVar = new bb((45449177 * dwVar.ag) + i4, ((dwVar.af * -975640896) + i) + (dwVar.al(1044328740) * 8), (dwVar.ap((byte) 3) * 8) + ((dwVar.ad * 253061184) + i2));
                            }
                            if (bbVar != null) {
                                this.ah.put(new bb(ao), new dx(1733135393 * bt.ag, bbVar, bbVar2, be(bt, 2146181675)));
                                return;
                            }
                        }
                    }
                    continue;
                }
            }
            this.ah.remove(ao);
        } catch (Throwable e) {
            throw ba.ad(e, "dh.bv(" + ')');
        }
    }

    void ei(int i, int i2, dz dzVar) {
        ao.af(0, i, i2, Byte.MIN_VALUE);
        for (int i3 = 0; i3 < dzVar.ay * -1533544669; i3++) {
            eu[] euVarArr = dzVar.aq[i3][i][i2];
            if (!(euVarArr == null || euVarArr.length == 0)) {
                int i4;
                for (eu euVar : euVarArr) {
                    ay bt = bt(euVar.af * 1352506155, -1695630142);
                    if (bt != null) {
                        dx dxVar = (dx) this.ah.get(ao);
                        if (dxVar != null) {
                            if (bt.ag * 1733135393 != -459008153 * dxVar.af) {
                                dx dxVar2 = new dx(1733135393 * bt.ag, dxVar.an, dxVar.ad, be(bt, 659510932));
                                this.ah.put(new bb(ao), dxVar2);
                                dxVar = dxVar2;
                            }
                            i4 = (dxVar.an.af * 1302348633) - (1302348633 * dxVar.ad.af);
                            dxVar.ad.af = -509225751 * i3;
                            dxVar.an.af = (i3 + i4) * -509225751;
                            return;
                        }
                        bb bbVar;
                        bb bbVar2 = new bb(i3, (1044791104 * this.aq) + i, (1666216384 * this.am) + i2);
                        if (this.at != null) {
                            bbVar = new bb((this.at.ag * 45449177) + i3, (-975640896 * this.at.af) + i, (this.at.ad * 253061184) + i2);
                        } else {
                            Iterator it = this.ab.iterator();
                            while (it.hasNext()) {
                                dw dwVar = (dw) it.next();
                                if (dwVar.ac(i, i2, (short) 270)) {
                                    bbVar = new bb((45449177 * dwVar.ag) + i3, ((dwVar.af * -975640896) + i) + (dwVar.al(1606474503) * 8), (dwVar.ap((byte) 3) * 8) + ((dwVar.ad * 253061184) + i2));
                                    break;
                                }
                            }
                            bbVar = null;
                        }
                        if (bbVar != null) {
                            this.ah.put(new bb(ao), new dx(1733135393 * bt.ag, bbVar, bbVar2, be(bt, 1101737254)));
                            return;
                        }
                    }
                }
                continue;
            }
        }
        this.ah.remove(ao);
    }

    int bp(fx fxVar, ao aoVar, short s) {
        try {
            switch (870311939 * aoVar.aa) {
                case 0:
                    return 0;
                case 2:
                    return (-fxVar.ad) / 2;
                default:
                    return -fxVar.ad;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "dh.bp(" + ')');
        }
    }

    int eh(fx fxVar, ao aoVar) {
        switch (870311939 * aoVar.aa) {
            case 0:
                return 0;
            case 2:
                return (-fxVar.ad) / 2;
            default:
                return -fxVar.ad;
        }
    }

    int eo(fx fxVar, ao aoVar) {
        switch (-318433239 * aoVar.aa) {
            case 0:
                return 0;
            case 2:
                return (-fxVar.ad) / 2;
            default:
                return -fxVar.ad;
        }
    }

    int fd(fx fxVar, ao aoVar) {
        switch (1975153051 * aoVar.aa) {
            case 0:
                return 0;
            case 2:
                return (-fxVar.ad) / 2;
            default:
                return -fxVar.ad;
        }
    }

    int fv(fx fxVar, ao aoVar) {
        switch (870311939 * aoVar.aa) {
            case 0:
                return 0;
            case 2:
                return (-fxVar.ad) / 2;
            default:
                return -fxVar.ad;
        }
    }

    int bx(fx fxVar, as asVar, int i) {
        try {
            switch (-101861059 * asVar.aa) {
                case 1:
                    return 0;
                case 2:
                    return (-fxVar.an) / 2;
                default:
                    return -fxVar.an;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "dh.bx(" + ')');
        }
    }

    int fa(fx fxVar, as asVar) {
        switch (-101861059 * asVar.aa) {
            case 1:
                return 0;
            case 2:
                return (-fxVar.an) / 2;
            default:
                return -fxVar.an;
        }
    }

    int fk(fx fxVar, as asVar) {
        switch (-101861059 * asVar.aa) {
            case 1:
                return 0;
            case 2:
                return (-fxVar.an) / 2;
            default:
                return -fxVar.an;
        }
    }

    int fm(fx fxVar, as asVar) {
        switch (-101861059 * asVar.aa) {
            case 1:
                return 0;
            case 2:
                return (-fxVar.an) / 2;
            default:
                return -fxVar.an;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    p000.ay bt(int r6, int r7) {
        /*
        r5 = this;
        r0 = 0;
        r4 = -515416689; // 0xffffffffe1475d8f float:-2.2985273E20 double:NaN;
        r1 = 1215270861; // 0x486f8fcd float:245311.2 double:6.00423583E-315;
        r1 = p000.gi.ad(r6, r1);	 Catch:{ RuntimeException -> 0x0026 }
        r2 = r1.ba;	 Catch:{ RuntimeException -> 0x0026 }
        if (r2 == 0) goto L_0x0018;
    L_0x000f:
        r2 = 31;
        r1 = r1.am(r2);	 Catch:{ RuntimeException -> 0x0026 }
        if (r1 != 0) goto L_0x0018;
    L_0x0017:
        return r0;
    L_0x0018:
        r2 = r1.bz;	 Catch:{ RuntimeException -> 0x0026 }
        r2 = r2 * r4;
        r3 = -1;
        if (r2 == r3) goto L_0x0017;
    L_0x001e:
        r0 = p000.ay.ad;	 Catch:{ RuntimeException -> 0x0026 }
        r1 = r1.bz;	 Catch:{ RuntimeException -> 0x0026 }
        r1 = r1 * r4;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x0026 }
        goto L_0x0017;
    L_0x0026:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "dh.bt(";
        r1 = r1.append(r2);
        r2 = 41;
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0 = p000.ba.ad(r0, r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: dh.bt(int, int):ay");
    }

    ay fh(int i) {
        ae ad = gi.ad(i, 1574060458);
        if (ad.ba != null) {
            ad = ad.am((byte) 76);
            if (ad == null) {
                return null;
            }
        }
        return ad.bz * 335015664 != -1 ? ay.ad[ad.bz * -515416689] : null;
    }

    ay fl(int i) {
        ae ad = gi.ad(i, 1362767082);
        if (ad.ba != null) {
            ad = ad.am((byte) 124);
            if (ad == null) {
                return null;
            }
        }
        if (ad.bz * -515416689 != -1) {
            return ay.ad[ad.bz * -515416689];
        }
        return null;
    }

    ek bu(int i, byte b) {
        try {
            return be(ay.ad[i], 1393648028);
        } catch (Throwable e) {
            throw ba.ad(e, "dh.bu(" + ')');
        }
    }

    ek fb(int i) {
        return be(ay.ad[i], 302479548);
    }

    ek fr(int i) {
        return be(ay.ad[i], 1993359359);
    }

    ek be(ay ayVar, int i) {
        int i2 = 0;
        try {
            if (ayVar.ar == null || this.ak == null || this.ak.get(dq.af) == null) {
                return null;
            }
            int i3;
            dq dqVar;
            int i4 = 253714037 * ayVar.ae;
            dq[] af = dq.af(-229827367);
            for (dq dqVar2 : af) {
                if (i4 == dqVar2.ay * -2001165915) {
                    dqVar = dqVar2;
                    break;
                }
            }
            dqVar = null;
            if (dqVar == null) {
                return null;
            }
            lr lrVar = (lr) this.ak.get(dqVar);
            if (lrVar == null) {
                return null;
            }
            String[] strArr = new String[lrVar.as(ayVar.ar, 1000000)];
            lrVar.ag(ayVar.ar, null, strArr);
            int length = (lrVar.as * strArr.length) / 2;
            i3 = 0;
            while (i3 < strArr.length) {
                int aa = lrVar.aa(strArr[i3]);
                if (aa <= i2) {
                    aa = i2;
                }
                i3++;
                i2 = aa;
            }
            return new ek(ayVar.ar, i2, length, dqVar);
        } catch (Throwable e) {
            throw ba.ad(e, "dh.be(" + ')');
        }
    }

    ek fg(ay ayVar) {
        int i = 0;
        if (ayVar.ar == null || this.ak == null || this.ak.get(dq.af) == null) {
            return null;
        }
        int i2 = 990509389 * ayVar.ae;
        dq[] af = dq.af(-229827367);
        for (dq dqVar : af) {
            if (i2 == dqVar.ay * -1317326055) {
                break;
            }
        }
        dq dqVar2 = null;
        if (dqVar2 == null) {
            return null;
        }
        lr lrVar = (lr) this.ak.get(dqVar2);
        if (lrVar == null) {
            return null;
        }
        String[] strArr = new String[lrVar.as(ayVar.ar, 1000000)];
        lrVar.ag(ayVar.ar, null, strArr);
        int length = (lrVar.as * strArr.length) / 2;
        int i3 = 0;
        while (i < strArr.length) {
            i2 = lrVar.aa(strArr[i]);
            if (i2 > i3) {
                i3 = i2;
            }
            i++;
        }
        return new ek(ayVar.ar, i3, length, dqVar2);
    }

    ek fp(ay ayVar) {
        int i = 0;
        if (ayVar.ar == null || this.ak == null || this.ak.get(dq.af) == null) {
            return null;
        }
        int i2 = 253714037 * ayVar.ae;
        dq[] af = dq.af(-229827367);
        for (dq dqVar : af) {
            if (i2 == dqVar.ay * -2001165915) {
                break;
            }
        }
        dq dqVar2 = null;
        if (dqVar2 == null) {
            return null;
        }
        lr lrVar = (lr) this.ak.get(dqVar2);
        if (lrVar == null) {
            return null;
        }
        String[] strArr = new String[lrVar.as(ayVar.ar, 1000000)];
        lrVar.ag(ayVar.ar, null, strArr);
        int length = (lrVar.as * strArr.length) / 2;
        int i3 = 0;
        while (i < strArr.length) {
            i2 = lrVar.aa(strArr[i]);
            if (i2 > i3) {
                i3 = i2;
            }
            i++;
        }
        return new ek(ayVar.ar, i3, length, dqVar2);
    }

    List bk(int i, int i2, int i3, int i4, int i5, int i6) {
        try {
            LinkedList linkedList = new LinkedList();
            if (i4 < i || i5 < i2) {
                return linkedList;
            }
            if (i4 >= i3 + i || i5 >= i3 + i2) {
                return linkedList;
            }
            for (dx dxVar : this.ah.values()) {
                if (dxVar.af(i4, i5, 1655908087)) {
                    linkedList.add(dxVar);
                }
            }
            for (dx dxVar2 : this.az) {
                if (dxVar2.af(i4, i5, 37802189)) {
                    linkedList.add(dxVar2);
                }
            }
            return linkedList;
        } catch (Throwable e) {
            throw ba.ad(e, "dh.bk(" + ')');
        }
    }

    List fc(int i, int i2, int i3, int i4, int i5) {
        LinkedList linkedList = new LinkedList();
        if (i4 < i || i5 < i2) {
            return linkedList;
        }
        if (i4 >= i3 + i || i5 >= i3 + i2) {
            return linkedList;
        }
        for (dx dxVar : this.ah.values()) {
            if (dxVar.af(i4, i5, 2048476279)) {
                linkedList.add(dxVar);
            }
        }
        for (dx dxVar2 : this.az) {
            if (dxVar2.af(i4, i5, 1383936253)) {
                linkedList.add(dxVar2);
            }
        }
        return linkedList;
    }

    List fo(int i, int i2, int i3, int i4, int i5) {
        LinkedList linkedList = new LinkedList();
        if (i4 < i || i5 < i2) {
            return linkedList;
        }
        if (i4 >= i3 + i || i5 >= i3 + i2) {
            return linkedList;
        }
        for (dx dxVar : this.ah.values()) {
            if (dxVar.af(i4, i5, 581305353)) {
                linkedList.add(dxVar);
            }
        }
        for (dx dxVar2 : this.az) {
            if (dxVar2.af(i4, i5, 1365980693)) {
                linkedList.add(dxVar2);
            }
        }
        return linkedList;
    }

    List fq(int i, int i2, int i3, int i4, int i5) {
        LinkedList linkedList = new LinkedList();
        if (i4 < i || i5 < i2) {
            return linkedList;
        }
        if (i4 >= i3 + i || i5 >= i3 + i2) {
            return linkedList;
        }
        for (dx dxVar : this.ah.values()) {
            if (dxVar.af(i4, i5, 33498870)) {
                linkedList.add(dxVar);
            }
        }
        for (dx dxVar2 : this.az) {
            if (dxVar2.af(i4, i5, 724317782)) {
                linkedList.add(dxVar2);
            }
        }
        return linkedList;
    }

    List fu(int i, int i2, int i3, int i4, int i5) {
        LinkedList linkedList = new LinkedList();
        if (i4 < i || i5 < i2) {
            return linkedList;
        }
        if (i4 >= i3 + i || i5 >= i3 + i2) {
            return linkedList;
        }
        for (dx dxVar : this.ah.values()) {
            if (dxVar.af(i4, i5, 1769658798)) {
                linkedList.add(dxVar);
            }
        }
        for (dx dxVar2 : this.az) {
            if (dxVar2.af(i4, i5, 898666641)) {
                linkedList.add(dxVar2);
            }
        }
        return linkedList;
    }

    List by(int i) {
        try {
            List linkedList = new LinkedList();
            linkedList.addAll(this.az);
            linkedList.addAll(this.ah.values());
            return linkedList;
        } catch (Throwable e) {
            throw ba.ad(e, "dh.by(" + ')');
        }
    }

    List ff() {
        List linkedList = new LinkedList();
        linkedList.addAll(this.az);
        linkedList.addAll(this.ah.values());
        return linkedList;
    }

    List fz() {
        List linkedList = new LinkedList();
        linkedList.addAll(this.az);
        linkedList.addAll(this.ah.values());
        return linkedList;
    }

    void bn(int i, int i2, int i3, int i4, int i5) {
        try {
            int i6 = i3 % 4;
            if (i6 == 0) {
                ag.at((this.ai * -254069341) * i, (this.ai * -254069341) * (63 - i2), this.ai * -254069341, i4, (byte) 1);
            }
            if (1 == i6) {
                ag.aq((this.ai * -254069341) * i, (this.ai * -254069341) * (63 - i2), this.ai * -254069341, i4, -955875818);
            }
            if (2 == i6) {
                ag.at((((this.ai * -254069341) * i) + (this.ai * -254069341)) - 1, (63 - i2) * (this.ai * -254069341), this.ai * -254069341, i4, (byte) 1);
            }
            if (i6 == 3) {
                ag.aq((this.ai * -254069341) * i, ((this.ai * -254069341) + ((63 - i2) * (this.ai * -254069341))) - 1, this.ai * -254069341, i4, -1524800953);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "dh.bn(" + ')');
        }
    }

    void fn(int i, int i2, int i3, int i4) {
        int i5 = i3 % 4;
        if (i5 == 0) {
            ag.at((this.ai * 1724739381) * i, (this.ai * -1450992696) * (1350801894 - i2), -460793569 * this.ai, i4, (byte) 1);
        }
        if (1 == i5) {
            ag.aq((-722395533 * this.ai) * i, (this.ai * -254069341) * (-1363849157 - i2), this.ai * -254069341, i4, -1596624153);
        }
        if (2 == i5) {
            ag.at((((this.ai * -59553146) * i) + (this.ai * -254069341)) - 1, (-223351169 - i2) * (this.ai * -254069341), this.ai * -254069341, i4, (byte) 1);
        }
        if (i5 == 3) {
            ag.aq((75525205 * this.ai) * i, ((1050922366 * this.ai) + ((63 - i2) * (this.ai * -254069341))) - 1, this.ai * -254069341, i4, -2116831254);
        }
    }

    int ba(int i, int i2, byte b) {
        try {
            if (this.at != null) {
                return this.at.aa(i, i2, (short) 3);
            }
            if (!this.ab.isEmpty()) {
                Iterator it = this.ab.iterator();
                while (it.hasNext()) {
                    dw dwVar = (dw) it.next();
                    if (dwVar.ac(i, i2, (short) 270)) {
                        return dwVar.aa(i, i2, (short) -6953);
                    }
                }
            }
            return -1;
        } catch (Throwable e) {
            throw ba.ad(e, "dh.ba(" + ')');
        }
    }

    int fe(int i, int i2) {
        if (this.at != null) {
            return this.at.aa(i, i2, (short) -10899);
        }
        if (!this.ab.isEmpty()) {
            Iterator it = this.ab.iterator();
            while (it.hasNext()) {
                dw dwVar = (dw) it.next();
                if (dwVar.ac(i, i2, (short) 270)) {
                    return dwVar.aa(i, i2, (short) 13882);
                }
            }
        }
        return -1;
    }

    int fj(int i, int i2) {
        if (this.at != null) {
            return this.at.aa(i, i2, (short) -15388);
        }
        if (!this.ab.isEmpty()) {
            Iterator it = this.ab.iterator();
            while (it.hasNext()) {
                dw dwVar = (dw) it.next();
                if (dwVar.ac(i, i2, (short) 270)) {
                    return dwVar.aa(i, i2, (short) 10210);
                }
            }
        }
        return -1;
    }

    int fs(int i, int i2) {
        if (this.at != null) {
            return this.at.aa(i, i2, (short) 12811);
        }
        if (!this.ab.isEmpty()) {
            Iterator it = this.ab.iterator();
            while (it.hasNext()) {
                dw dwVar = (dw) it.next();
                if (dwVar.ac(i, i2, (short) 270)) {
                    return dwVar.aa(i, i2, (short) -385);
                }
            }
        }
        return -1;
    }

    int ft(int i, int i2) {
        if (this.at != null) {
            return this.at.aa(i, i2, (short) 19931);
        }
        if (!this.ab.isEmpty()) {
            Iterator it = this.ab.iterator();
            while (it.hasNext()) {
                dw dwVar = (dw) it.next();
                if (dwVar.ac(i, i2, (short) 270)) {
                    return dwVar.aa(i, i2, (short) -11366);
                }
            }
        }
        return -1;
    }

    int fx(int i, int i2) {
        if (this.at != null) {
            return this.at.aa(i, i2, (short) 11848);
        }
        if (!this.ab.isEmpty()) {
            Iterator it = this.ab.iterator();
            while (it.hasNext()) {
                dw dwVar = (dw) it.next();
                if (dwVar.ac(i, i2, (short) 270)) {
                    return dwVar.aa(i, i2, (short) 16807);
                }
            }
        }
        return -1;
    }

    static final void bx(int i) {
        int i2 = 0;
        while (i2 < client.nd * 2118073853) {
            try {
                int i3;
                int[] iArr = client.nw;
                iArr[i2] = iArr[i2] - 1;
                if (client.nw[i2] < -10) {
                    client.nd -= 1636861781;
                    for (i3 = i2; i3 < client.nd * 2118073853; i3++) {
                        client.nv[i3] = client.nv[i3 + 1];
                        client.ny[i3] = client.ny[i3 + 1];
                        client.na[i3] = client.na[i3 + 1];
                        client.nw[i3] = client.nw[i3 + 1];
                        client.nn[i3] = client.nn[i3 + 1];
                    }
                    i3 = i2 - 1;
                } else {
                    fu fuVar = client.ny[i2];
                    if (fuVar == null) {
                        fuVar = (fu) null;
                        fuVar = fu.af(ez.bi, client.nv[i2], 0);
                        if (fuVar != null) {
                            int[] iArr2 = client.nw;
                            iArr2[i2] = iArr2[i2] + fuVar.an();
                            client.ny[i2] = fuVar;
                        }
                        i3 = i2;
                    }
                    fu fuVar2 = fuVar;
                    if (client.nw[i2] < 0) {
                        if (client.nn[i2] != 0) {
                            int i4;
                            int i5 = (client.nn[i2] & 255) * mn.an;
                            i3 = ((((client.nn[i2] >> 16) & 255) * mn.an) + 64) - (516759209 * gf.ho.bg);
                            if (i3 < 0) {
                                i4 = -i3;
                            } else {
                                i4 = i3;
                            }
                            i3 = ((((client.nn[i2] >> 8) & 255) * mn.an) + 64) - (2328865 * gf.ho.bh);
                            if (i3 < 0) {
                                i3 = -i3;
                            }
                            i3 = (i3 + i4) - 128;
                            if (i3 > i5) {
                                client.nw[i2] = -100;
                                i3 = i2;
                            } else {
                                if (i3 < 0) {
                                    i3 = 0;
                                }
                                i3 = ((i5 - i3) * (1137688059 * client.ns)) / i5;
                            }
                        } else {
                            i3 = 1745056855 * client.mu;
                        }
                        if (i3 > 0) {
                            fb an = fh.an(fuVar2.ad().af(je.nt), 100, i3);
                            an.ae(client.na[i2] - 1);
                            fa.nz.af(an);
                        }
                        client.nw[i2] = -100;
                        i3 = i2;
                    }
                    i3 = i2;
                }
                i2 = i3 + 1;
            } catch (Throwable e) {
                throw ba.ad(e, "dh.bx(" + ')');
            }
        }
        if (client.me) {
            boolean z;
            if (-219207591 * mf.ag != 0) {
                z = true;
            } else {
                z = mf.aa.at(2066477413);
            }
            if (!z) {
                if (!(client.mk * -1819605895 == 0 || client.mx * 1387447661 == -1)) {
                    ao.ad(client.bo, client.mx * 1387447661, 0, client.mk * -1819605895, false, -397377188);
                }
                client.me = false;
            }
        }
    }

    static final void co(gx gxVar, byte b) {
        try {
            ah af;
            gxVar.an = false;
            if (gxVar.cd * 259701737 != -1) {
                af = cd.af(gxVar.cd * 259701737, 633258181);
                if (af == null || af.ay == null) {
                    gxVar.cd = 662713255;
                } else {
                    gxVar.cm += 2135145953;
                    if (gxVar.ch * 782711805 < af.ay.length && -1283897823 * gxVar.cm > af.ar[782711805 * gxVar.ch]) {
                        gxVar.cm = 2135145953;
                        gxVar.ch += 933296469;
                        dz.bt(af, 782711805 * gxVar.ch, gxVar.bg * 516759209, gxVar.bh * 2328865, (byte) -36);
                    }
                    if (gxVar.ch * 782711805 >= af.ay.length) {
                        gxVar.cm = 0;
                        gxVar.ch = 0;
                        dz.bt(af, gxVar.ch * 782711805, gxVar.bg * 516759209, gxVar.bh * 2328865, (byte) -20);
                    }
                }
            }
            if (-1 != gxVar.cf * 269129085 && client.ak * 1581849891 >= 645928209 * gxVar.ce) {
                if (gxVar.cz * 628512873 < 0) {
                    gxVar.cz = 0;
                }
                int i = ag.ad(269129085 * gxVar.cf, 1886636504).as * 1690052581;
                if (i != -1) {
                    af = cd.af(i, 799343456);
                    if (af == null || af.ay == null) {
                        gxVar.cf = 2015474731;
                    } else {
                        gxVar.cr += 1417511579;
                        if (gxVar.cz * 628512873 < af.ay.length && 289248147 * gxVar.cr > af.ar[gxVar.cz * 628512873]) {
                            gxVar.cr = 1417511579;
                            gxVar.cz -= 367216679;
                            dz.bt(af, gxVar.cz * 628512873, gxVar.bg * 516759209, gxVar.bh * 2328865, (byte) -70);
                        }
                        if (gxVar.cz * 628512873 >= af.ay.length && (gxVar.cz * 628512873 < 0 || gxVar.cz * 628512873 >= af.ay.length)) {
                            gxVar.cf = 2015474731;
                        }
                    }
                } else {
                    gxVar.cf = 2015474731;
                }
            }
            if (-1 == gxVar.cq * 1462124603 || 1913892303 * gxVar.ct > 1 || 1 != cd.af(gxVar.cq * 1462124603, 893501376).az * -920725183 || gxVar.dw * -1210627617 <= 0 || 81181341 * gxVar.dj > client.ak * 1581849891 || -216586625 * gxVar.dc >= client.ak * 1581849891) {
                if (-1 != gxVar.cq * 1462124603 && gxVar.ct * 1913892303 == 0) {
                    af = cd.af(1462124603 * gxVar.cq, 1227645796);
                    if (af == null || af.ay == null) {
                        gxVar.cq = 2033542925;
                    } else {
                        gxVar.cp += 745521897;
                        if (gxVar.cj * 1816971127 < af.ay.length && -829213351 * gxVar.cp > af.ar[gxVar.cj * 1816971127]) {
                            gxVar.cp = 745521897;
                            gxVar.cj -= 1862778297;
                            dz.bt(af, gxVar.cj * 1816971127, gxVar.bg * 516759209, gxVar.bh * 2328865, (byte) -104);
                        }
                        if (gxVar.cj * 1816971127 >= af.ay.length) {
                            gxVar.cj -= -1654163021 * af.ae;
                            gxVar.cb += 2084308175;
                            if (-1755938257 * gxVar.cb >= 397534483 * af.ai) {
                                gxVar.cq = 2033542925;
                            } else if (gxVar.cj * 1816971127 < 0 || gxVar.cj * 1816971127 >= af.ay.length) {
                                gxVar.cq = 2033542925;
                            } else {
                                dz.bt(af, gxVar.cj * 1816971127, gxVar.bg * 516759209, gxVar.bh * 2328865, (byte) -63);
                            }
                        }
                        gxVar.an = af.am;
                    }
                }
                if (1913892303 * gxVar.ct > 0) {
                    gxVar.ct -= -464504529;
                    return;
                }
                return;
            }
            gxVar.ct = -464504529;
        } catch (Throwable e) {
            throw ba.ad(e, "dh.co(" + ')');
        }
    }
}
