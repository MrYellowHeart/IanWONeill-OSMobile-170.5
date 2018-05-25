package p000;

import java.util.zip.CRC32;

public class jw {
    public static kb aa = new kb(jf.aq);
    public static int ac = 0;
    public static int ad = 0;
    public static int ae = 0;
    public static md af;
    public static int ag = 0;
    public static kb aj = new kb(jf.aq);
    public static CRC32 ak = new CRC32();
    public static int am = 0;
    public static long an;
    public static kb aq = new kb(jf.aq);
    public static kw ar = new kw();
    public static int as = 0;
    public static byte au = (byte) 0;
    public static int av = 0;
    public static ik aw = new ik(8);
    public static kh[] ax = new kh[256];
    public static kb ay = new kb(32);
    public static int az = 0;

    jw() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ba.ad(e, "jw.<init>(" + ')');
        }
    }

    static void ar(kh khVar, int i, int i2, int i3, byte b, boolean z) {
        long j = (long) ((i << 16) + i2);
        if (((ks) aa.af(j)) == null) {
            if (((ks) ay.af(j)) == null) {
                ks ksVar = (ks) aj.af(j);
                if (ksVar != null) {
                    if (z) {
                        ksVar.dm();
                        aa.ad(ksVar, j);
                        ae -= 1417772105;
                        ag -= 65385844;
                    }
                } else if (z || ((ks) aq.af(j)) == null) {
                    kd ksVar2 = new ks();
                    ksVar2.af = khVar;
                    ksVar2.ad = -1204241898 * i3;
                    ksVar2.an = b;
                    if (z) {
                        aa.ad(ksVar2, j);
                        ag -= 916264481;
                        return;
                    }
                    ar.af(ksVar2);
                    aj.ad(ksVar2, j);
                    ae += 702735533;
                }
            }
        }
    }

    static void as(kh khVar, int i, int i2, int i3, byte b, boolean z) {
        long j = (long) ((i << 16) + i2);
        if (((ks) aa.af(j)) == null) {
            if (((ks) ay.af(j)) == null) {
                ks ksVar = (ks) aj.af(j);
                if (ksVar != null) {
                    if (z) {
                        ksVar.dm();
                        aa.ad(ksVar, j);
                        ae -= 1417772105;
                        ag -= 916264481;
                    }
                } else if (z || ((ks) aq.af(j)) == null) {
                    kd ksVar2 = new ks();
                    ksVar2.af = khVar;
                    ksVar2.ad = 1351238033 * i3;
                    ksVar2.an = b;
                    if (z) {
                        aa.ad(ksVar2, j);
                        ag -= 916264481;
                        return;
                    }
                    ar.af(ksVar2);
                    aj.ad(ksVar2, j);
                    ae += 852910101;
                }
            }
        }
    }

    static void ay(kh khVar, int i, int i2, int i3, byte b, boolean z) {
        long j = (long) ((i << 16) + i2);
        if (((ks) aa.af(j)) == null) {
            if (((ks) ay.af(j)) == null) {
                ks ksVar = (ks) aj.af(j);
                if (ksVar != null) {
                    if (z) {
                        ksVar.dm();
                        aa.ad(ksVar, j);
                        ae -= 1417772105;
                        ag -= 916264481;
                    }
                } else if (z || ((ks) aq.af(j)) == null) {
                    kd ksVar2 = new ks();
                    ksVar2.af = khVar;
                    ksVar2.ad = 1351238033 * i3;
                    ksVar2.an = b;
                    if (z) {
                        aa.ad(ksVar2, j);
                        ag -= 916264481;
                        return;
                    }
                    ar.af(ksVar2);
                    aj.ad(ksVar2, j);
                    ae += 1417772105;
                }
            }
        }
    }

    static int ae(int i, int i2) {
        long j = (long) ((i << 16) + i2);
        if (ff.ab == null || j != ff.ab.fy) {
            return 0;
        }
        return ((1442462621 * bc.ai.ad) / (bc.ai.af.length - ff.ab.an)) + 1;
    }

    static int aj(int i, int i2) {
        long j = (long) ((i << 16) + i2);
        if (ff.ab == null || j != ff.ab.fy) {
            return 0;
        }
        return ((1981724264 * bc.ai.ad) / (bc.ai.af.length - ff.ab.an)) + 1;
    }

    public static int am(boolean z, boolean z2) {
        int i = 0;
        if (z) {
            i = 0 + ((1993129475 * ag) + (-620493534 * as));
        }
        if (z2) {
            return i + ((-2034551303 * ae) + (-920885363 * am));
        }
        return i;
    }

    public static int aq(boolean z, boolean z2) {
        int i = 0;
        if (z) {
            i = 0 + ((-773058017 * ag) + (-33214903 * as));
        }
        return z2 ? i + ((-2034551303 * ae) + (-920885363 * am)) : i;
    }

    public static int at(boolean z, boolean z2) {
        int i = 0;
        if (z) {
            i = 0 + ((-773058017 * ag) + (1707497590 * as));
        }
        if (z2) {
            return i + ((-1775218268 * ae) + (-920885363 * am));
        }
        return i;
    }

    public static void ab() {
        if (af != null) {
            af.af((byte) -34);
        }
    }

    public static void aw() {
        if (af != null) {
            af.af((byte) -92);
        }
    }

    static final void dn(nm nmVar, int i) {
        try {
            ia iaVar = client.dv.ay;
            int bj;
            int i2;
            int i3;
            int cn;
            int i4;
            int i5;
            int i6;
            int as;
            int i7;
            if (nmVar == nm.aa) {
                bj = iaVar.bj(-169544585);
                i2 = ((bj >> 4) & 7) + (889841655 * ct.et);
                i3 = (bj & 7) + (ec.eg * 915762569);
                cn = iaVar.cn(888828514);
                bj = iaVar.bj(-1784626264);
                i4 = bj >> 2;
                i5 = bj & 3;
                i6 = client.el[i4];
                if (i2 >= 0 && i3 >= 0 && i2 < 103 && i3 < 103) {
                    if (i6 == 0) {
                        bs av = gp.en.av(-1674539149 * dq.hf, i2, i3);
                        if (av != null) {
                            as = bb.as(2560327866738495599L * av.ar);
                            if (2 == i4) {
                                av.ay = new hg(as, 2, i5 + 4, dq.hf * -1674539149, i2, i3, cn, false, av.ay);
                                av.as = new hg(as, 2, (i5 + 1) & 3, dq.hf * -1674539149, i2, i3, cn, false, av.as);
                            } else {
                                av.ay = new hg(as, i4, i5, -1674539149 * dq.hf, i2, i3, cn, false, av.ay);
                            }
                        }
                    }
                    if (i6 == 1) {
                        bm ac = gp.en.ac(dq.hf * -1674539149, i2, i3);
                        if (ac != null) {
                            as = bb.as(ac.ae * 6162409934167472955L);
                            if (i4 == 4 || 5 == i4) {
                                ac.ar = new hg(as, 4, i5, dq.hf * -1674539149, i2, i3, cn, false, ac.ar);
                            } else if (i4 == 6) {
                                ac.ar = new hg(as, 4, i5 + 4, dq.hf * -1674539149, i2, i3, cn, false, ac.ar);
                            } else if (7 == i4) {
                                ac.ar = new hg(as, 4, ((i5 + 2) & 3) + 4, dq.hf * -1674539149, i2, i3, cn, false, ac.ar);
                            } else if (i4 == 8) {
                                ac.ar = new hg(as, 4, i5 + 4, dq.hf * -1674539149, i2, i3, cn, false, ac.ar);
                                ac.aj = new hg(as, 4, ((i5 + 2) & 3) + 4, dq.hf * -1674539149, i2, i3, cn, false, ac.aj);
                            }
                        }
                    }
                    if (2 == i6) {
                        cm al = gp.en.al(-1674539149 * dq.hf, i2, i3);
                        if (11 == i4) {
                            i7 = 10;
                        } else {
                            i7 = i4;
                        }
                        if (al != null) {
                            al.ay = new hg(bb.as(-966509501471514439L * al.at), i7, i5, dq.hf * -1674539149, i2, i3, cn, false, al.ay);
                        }
                    }
                    if (3 == i6) {
                        bx ap = gp.en.ap(dq.hf * -1674539149, i2, i3);
                        if (ap != null) {
                            ap.aa = new hg(bb.as(ap.ag * -7401358002501475335L), 22, i5, dq.hf * -1674539149, i2, i3, cn, false, ap.aa);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            int au;
            int bi;
            int i8;
            int i9;
            if (nmVar == nm.ay) {
                bj = iaVar.br(621523212);
                as = iaVar.br(541176769);
                i7 = (as >> 4) & 15;
                as &= 7;
                au = iaVar.au(998064398);
                bi = iaVar.bi(-1180003394);
                i2 = ((bi >> 4) & 7) + (889841655 * ct.et);
                bi = (bi & 7) + (915762569 * ec.eg);
                if (i2 >= 0 && bi >= 0 && i2 < li.cu && bi < li.cu) {
                    i3 = i7 + 1;
                    if (gf.ho.di[0] >= i2 - i3 && gf.ho.di[0] <= i2 + i3 && gf.ho.da[0] >= bi - i3 && gf.ho.da[0] <= i3 + bi && client.ns * 1137688059 != 0 && as > 0 && client.nd * 2118073853 < 50) {
                        client.nv[client.nd * 2118073853] = au;
                        client.na[client.nd * 2118073853] = as;
                        client.nw[client.nd * 2118073853] = bj;
                        client.ny[client.nd * 2118073853] = null;
                        client.nn[client.nd * 2118073853] = i7 + ((i2 << 16) + (bi << 8));
                        client.nd += 1636861781;
                    }
                }
            }
            if (nm.af == nmVar) {
                ga gaVar;
                byte bo = iaVar.bo((byte) 0);
                int au2 = iaVar.au(-1187975198);
                int ax = iaVar.ax(1247983979);
                bj = iaVar.bi(-2128114970);
                int i10 = (889841655 * ct.et) + ((bj >> 4) & 7);
                i8 = (bj & 7) + (ec.eg * 915762569);
                au = iaVar.cn(755438907);
                bj = iaVar.ck(-790492867);
                byte cv = iaVar.cv(1888708892);
                int au3 = iaVar.au(-1075102152);
                int bq = iaVar.bq((byte) -51);
                i7 = iaVar.ao((byte) 0);
                as = i7 >> 2;
                i7 &= 3;
                i9 = client.el[as];
                if (client.hz * -1522892003 == bj) {
                    gaVar = gf.ho;
                } else {
                    gaVar = client.hb[bj];
                }
                if (gaVar != null) {
                    int i11;
                    int i12;
                    ae ad = gi.ad(au, 1765296136);
                    if (1 == i7 || i7 == 3) {
                        i11 = -265754695 * ad.az;
                        i12 = -344743753 * ad.ah;
                    } else {
                        i11 = ad.ah * -344743753;
                        i12 = ad.az * -265754695;
                    }
                    bi = i10 + (i12 >> 1);
                    i2 = i10 + ((i12 + 1) >> 1);
                    i3 = i8 + (i11 >> 1);
                    cn = i8 + ((i11 + 1) >> 1);
                    int[][] iArr = gu.af[dq.hf * -1674539149];
                    i2 = (((iArr[bi][i3] + iArr[i2][i3]) + iArr[bi][cn]) + iArr[i2][cn]) >> 2;
                    cl aj = ad.aj(as, i7, iArr, (i12 << 6) + (i10 << 7), i2, (i11 << 6) + (i8 << 7), 1698798723);
                    if (aj != null) {
                        ge.dm(-1674539149 * dq.hf, i10, i8, i9, -1, 0, 0, au3 + 1, au2 + 1, -2097215415);
                        gaVar.aq = -451425859 * ((1581849891 * client.ak) + au3);
                        gaVar.am = ((client.ak * 1581849891) + au2) * -1452389121;
                        gaVar.ai = aj;
                        gaVar.at = (-1544979584 * i10) + (1374993856 * i12);
                        gaVar.aw = (-116203840 * i11) + (-232407680 * i8);
                        gaVar.ab = -1010006159 * i2;
                        if (cv > bq) {
                            as = cv;
                        } else {
                            as = bq;
                            byte b = cv;
                        }
                        if (bo > ax) {
                            bj = bo;
                        } else {
                            bj = ax;
                            byte b2 = bo;
                        }
                        gaVar.az = -1723441319 * (bq + i10);
                        gaVar.ak = (as + i10) * -1577193561;
                        gaVar.ah = (ax + i8) * 300270939;
                        gaVar.ao = (bj + i8) * 1865169791;
                    }
                }
            }
            if (nmVar == nm.ag) {
                byte cv2 = iaVar.cv(1781660396);
                i9 = iaVar.ao((byte) 0);
                i4 = iaVar.cl(1990827408);
                cn = iaVar.cy(-1005835619);
                i5 = iaVar.ao((byte) 0) * 4;
                i6 = iaVar.cy(-1005835619);
                i2 = iaVar.bi(115239435) * 4;
                as = iaVar.br(939425529);
                i7 = (ct.et * 889841655) + ((as >> 4) & 7);
                bi = (as & 7) + (ec.eg * 915762569);
                i8 = iaVar.bi(-854108014);
                byte cv3 = iaVar.cv(1908230195);
                as = iaVar.au(-1428590876);
                i3 = cv3 + i7;
                bj = cv2 + bi;
                if (i7 >= 0 && bi >= 0 && i7 < li.cu && bi < li.cu && i3 >= 0 && bj >= 0 && i3 < li.cu && bj < li.cu && 65535 != as) {
                    au = (i7 * mn.an) + 64;
                    bi = (bi * mn.an) + 64;
                    int i13 = (i3 * mn.an) + 64;
                    int i14 = (bj * mn.an) + 64;
                    kd hxVar = new hx(as, -1674539149 * dq.hf, au, bi, iz.de(au, bi, dq.hf * -1674539149, 1931065161) - i2, (client.ak * 1581849891) + i6, cn + (client.ak * 1581849891), i8, i9, i4, i5);
                    hxVar.af(i13, i14, iz.de(i13, i14, -1674539149 * dq.hf, 1727508699) - i5, i6 + (client.ak * 1581849891), -684621192);
                    client.ia.ad(hxVar);
                }
            } else if (nmVar == nm.ae) {
                as = iaVar.cn(1786961593);
                bj = iaVar.br(1494741666);
                i7 = ((bj >> 4) & 7) + (889841655 * ct.et);
                au = (ec.eg * 915762569) + (bj & 7);
                if (i7 >= 0 && au >= 0 && i7 < li.cu && au < li.cu) {
                    kg kgVar = client.ik[-1674539149 * dq.hf][i7][au];
                    if (kgVar != null) {
                        for (r2 = (hb) kgVar.as(); r2 != null; r2 = (hb) kgVar.aj()) {
                            if (r2.af * -15746003 == (as & 32767)) {
                                r2.ki();
                                break;
                            }
                        }
                        if (kgVar.as() == null) {
                            client.ik[dq.hf * -1674539149][i7][au] = null;
                        }
                        ah.dg(i7, au, (byte) -3);
                    }
                }
            } else if (nmVar == nm.ar) {
                bj = iaVar.br(1444759314);
                i7 = (889841655 * ct.et) + ((bj >> 4) & 7);
                bj = (bj & 7) + (915762569 * ec.eg);
                as = iaVar.cy(-1005835619);
                i3 = iaVar.au(-64756827);
                i2 = iaVar.bj(-381626981);
                if (i7 >= 0 && bj >= 0 && i7 < li.cu && bj < li.cu) {
                    au = (i7 * mn.an) + 64;
                    bi = (bj * mn.an) + 64;
                    client.ib.ad(new hu(as, dq.hf * -1674539149, au, bi, iz.de(au, bi, dq.hf * -1674539149, 1756427816) - i2, i3, client.ak * 1581849891));
                }
            } else if (nmVar == nm.as) {
                as = iaVar.cn(2093682491);
                i7 = iaVar.ck(-917971933);
                bj = iaVar.ao((byte) 0);
                au = (889841655 * ct.et) + ((bj >> 4) & 7);
                bi = (ec.eg * 915762569) + (bj & 7);
                i2 = iaVar.au(-1779571287);
                if (au >= 0 && bi >= 0 && au < li.cu && bi < li.cu) {
                    kg kgVar2 = client.ik[dq.hf * -1674539149][au][bi];
                    if (kgVar2 != null) {
                        r2 = (hb) kgVar2.as();
                        while (r2 != null) {
                            if ((i7 & 32767) == -15746003 * r2.af && i2 == 1071269889 * r2.ad) {
                                r2.ad = as * 1952823297;
                                break;
                            }
                            r2 = (hb) kgVar2.aj();
                        }
                        ah.dg(au, bi, (byte) -43);
                    }
                }
            } else if (nmVar == nm.ad) {
                bj = iaVar.au(-578542142);
                as = iaVar.bj(-6210703);
                i7 = ((as >> 4) & 7) + (ct.et * 889841655);
                as = (as & 7) + (915762569 * ec.eg);
                au = iaVar.au(-329189687);
                if (i7 >= 0 && as >= 0 && i7 < li.cu && as < li.cu) {
                    kd hbVar = new hb();
                    hbVar.af = bj * 1162998693;
                    hbVar.ad = 1952823297 * au;
                    if (client.ik[dq.hf * -1674539149][i7][as] == null) {
                        client.ik[dq.hf * -1674539149][i7][as] = new kg();
                    }
                    client.ik[dq.hf * -1674539149][i7][as].ad(hbVar);
                    ah.dg(i7, as, (byte) -70);
                }
            } else if (nm.aj == nmVar) {
                bj = iaVar.ao((byte) 0);
                as = (889841655 * ct.et) + ((bj >> 4) & 7);
                i7 = (915762569 * ec.eg) + (bj & 7);
                bi = iaVar.au(1889572339);
                bj = iaVar.bi(415137868);
                i2 = bj >> 2;
                i3 = bj & 3;
                au = client.el[i2];
                if (as >= 0 && i7 >= 0 && as < li.cu && i7 < li.cu) {
                    ge.dm(dq.hf * -1674539149, as, i7, au, bi, i2, i3, 0, -1, -1412019443);
                }
            } else if (nm.an == nmVar) {
                bj = iaVar.ao((byte) 0);
                as = (ct.et * 889841655) + ((bj >> 4) & 7);
                i7 = (ec.eg * 915762569) + (bj & 7);
                bj = iaVar.bi(-728165286);
                i2 = bj >> 2;
                i3 = bj & 3;
                au = client.el[i2];
                if (as >= 0 && i7 >= 0 && as < li.cu && i7 < li.cu) {
                    ge.dm(dq.hf * -1674539149, as, i7, au, -1, i2, i3, 0, -1, -1379064943);
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "jw.dn(" + ')');
        }
    }
}
