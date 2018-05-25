package p000;

import java.net.URL;

public class dq {
    public static final dq ad = new dq("MEDIUM", 2, 1, 2);
    public static final dq af = new dq("SMALL", 0, 0, 4);
    public static final dq an = new dq("LARGE", 1, 2, 0);
    public static int hf;
    final String aa;
    final int ag;
    final int as;
    final int ay;

    static dq[] m25af(int i) {
        try {
            return new dq[]{af, an, ad};
        } catch (Throwable e) {
            throw ba.ad(e, "dq.af(" + ')');
        }
    }

    static dq[] an() {
        return new dq[]{af, an, ad};
    }

    dq(String str, int i, int i2, int i3) {
        try {
            this.aa = str;
            this.ag = 1480974585 * i;
            this.ay = -1029874131 * i2;
            this.as = 957844047 * i3;
        } catch (Throwable e) {
            throw ba.ad(e, "dq.<init>(" + ')');
        }
    }

    boolean aa(float f) {
        return f >= ((float) (-1789440849 * this.as));
    }

    boolean ad(float f, int i) {
        try {
            return f >= ((float) (-1789440849 * this.as));
        } catch (Throwable e) {
            throw ba.ad(e, "dq.ad(" + ')');
        }
    }

    static boolean af(int i) {
        try {
            if (gu.ae == null) {
                gu.ae = dy.de.af(new URL(bv.am), -615329840);
            } else if (gu.ae.ad(1135559204)) {
                ik ikVar = new ik(gu.ae.an(-1307040200));
                ikVar.al(1157740290);
                hq.ay = ikVar.au(-1686233487) * 1274669679;
                C0001do.ag = new hq[(hq.ay * 443593871)];
                for (int i2 = 0; i2 < hq.ay * 443593871; i2++) {
                    hq[] hqVarArr = C0001do.ag;
                    hq hqVar = new hq();
                    hqVarArr[i2] = hqVar;
                    hqVar.aq = ikVar.au(1020692194) * -71831023;
                    hqVar.am = ikVar.al(-437493362) * -2031175081;
                    hqVar.ab = ikVar.bc(1508042908);
                    hqVar.aw = ikVar.bc(1536262798);
                    hqVar.ai = ikVar.ao((byte) 0) * 67655425;
                    hqVar.at = ikVar.av(1289432744) * -1042109309;
                    hqVar.az = -985792981 * i2;
                }
                ac.an(C0001do.ag, 0, C0001do.ag.length - 1, hq.aj, hq.ar, 1838607637);
                gu.ae = null;
                return true;
            }
        } catch (Exception e) {
            try {
                e.printStackTrace();
                gu.ae = null;
            } catch (Throwable e2) {
                throw ba.ad(e2, "dq.af(" + ')');
            }
        }
        return false;
    }

    static int ao(int i, gk gkVar, boolean z, int i2) {
        int[] iArr;
        int i3;
        if (5000 == i) {
            try {
                iArr = hr.as;
                i3 = hr.ar - 1194553915;
                hr.ar = i3;
                iArr[(i3 * 537618701) - 1] = client.lj * 321761329;
                return 1;
            } catch (Throwable e) {
                throw ba.ad(e, "dq.ao(" + ')');
            }
        } else if (5001 == i) {
            hr.ar -= 711305551;
            client.lj = hr.as[hr.ar * 537618701] * -1551652655;
            r2 = hr.as[(hr.ar * 537618701) + 1];
            ol[] af = cg.af(1428275654);
            for (ol olVar : af) {
                if (olVar.aa * 677600269 == r2) {
                    break;
                }
            }
            ol olVar2 = null;
            ay.lz = olVar2;
            if (ay.lz == null) {
                ay.lz = ol.ad;
            }
            client.ls = -26121995 * hr.as[(hr.ar * 537618701) + 2];
            no ad = ik.ad(nr.cd, client.dv.ag, (byte) 77);
            ad.an.an(321761329 * client.lj, (byte) 31);
            ad.an.an(677600269 * ay.lz.aa, (byte) 31);
            ad.an.an(-1224080547 * client.ls, (byte) 31);
            client.dv.an(ad, (short) 255);
            return 1;
        } else if (i == 5002) {
            r0 = hr.aj;
            i3 = hr.ae - -1246602361;
            hr.ae = i3;
            r0 = r0[i3 * -1267697097];
            hr.ar -= 1905859466;
            i3 = hr.as[hr.ar * 537618701];
            r2 = hr.as[(hr.ar * 537618701) + 1];
            no ad2 = ik.ad(nr.de, client.dv.ag, (byte) 66);
            ad2.an.an(hz.ae(r0, 1444515839) + 2, (byte) 31);
            ad2.an.aq(r0, (byte) -108);
            ad2.an.an(i3 - 1, (byte) 31);
            ad2.an.an(r2, (byte) 31);
            client.dv.an(ad2, (short) 255);
            return 1;
        } else if (5003 == i) {
            hr.ar -= 1905859466;
            r1 = ((hz) hi.af.get(Integer.valueOf(hr.as[hr.ar * 537618701]))).ad(hr.as[(hr.ar * 537618701) + 1], 1935222174);
            if (r1 != null) {
                iArr = hr.as;
                r2 = hr.ar - 1194553915;
                hr.ar = r2;
                iArr[(r2 * 537618701) - 1] = 1687932353 * r1.af;
                iArr = hr.as;
                r2 = hr.ar - 1194553915;
                hr.ar = r2;
                iArr[(r2 * 537618701) - 1] = r1.ad * -1939883689;
                r2 = hr.aj;
                r0 = hr.ae - 1246602361;
                hr.ae = r0;
                r3 = (r0 * -1267697097) - 1;
                if (r1.aa != null) {
                    r0 = r1.aa;
                } else {
                    r0 = "";
                }
                r2[r3] = r0;
                r2 = hr.aj;
                r0 = hr.ae - 1246602361;
                hr.ae = r0;
                r3 = (r0 * -1267697097) - 1;
                if (r1.ar != null) {
                    r0 = r1.ar;
                } else {
                    r0 = "";
                }
                r2[r3] = r0;
                r2 = hr.aj;
                r0 = hr.ae - 1246602361;
                hr.ae = r0;
                r3 = (r0 * -1267697097) - 1;
                if (r1.aj != null) {
                    r0 = r1.aj;
                } else {
                    r0 = "";
                }
                r2[r3] = r0;
                r2 = hr.as;
                r0 = hr.ar - 1194553915;
                hr.ar = r0;
                r3 = (r0 * 537618701) - 1;
                if (r1.an(-1116170756)) {
                    r0 = 1;
                } else if (r1.ay(559139842)) {
                    r0 = 2;
                } else {
                    r0 = 0;
                }
                r2[r3] = r0;
            } else {
                iArr = hr.as;
                i3 = hr.ar - 1194553915;
                hr.ar = i3;
                iArr[(i3 * 537618701) - 1] = -1;
                iArr = hr.as;
                i3 = hr.ar - 1194553915;
                hr.ar = i3;
                iArr[(i3 * 537618701) - 1] = 0;
                r0 = hr.aj;
                i3 = hr.ae - 1246602361;
                hr.ae = i3;
                r0[(i3 * -1267697097) - 1] = "";
                r0 = hr.aj;
                i3 = hr.ae - 1246602361;
                hr.ae = i3;
                r0[(i3 * -1267697097) - 1] = "";
                r0 = hr.aj;
                i3 = hr.ae - 1246602361;
                hr.ae = i3;
                r0[(i3 * -1267697097) - 1] = "";
                iArr = hr.as;
                i3 = hr.ar - 1194553915;
                hr.ar = i3;
                iArr[(i3 * 537618701) - 1] = 0;
            }
            return 1;
        } else if (5004 == i) {
            iArr = hr.as;
            i3 = hr.ar - -1194553915;
            hr.ar = i3;
            r1 = dc.an(iArr[i3 * 537618701], -1396621184);
            if (r1 != null) {
                iArr = hr.as;
                r2 = hr.ar - 1194553915;
                hr.ar = r2;
                iArr[(r2 * 537618701) - 1] = r1.an * 977542055;
                iArr = hr.as;
                r2 = hr.ar - 1194553915;
                hr.ar = r2;
                iArr[(r2 * 537618701) - 1] = -1939883689 * r1.ad;
                r2 = hr.aj;
                r0 = hr.ae - 1246602361;
                hr.ae = r0;
                r3 = (r0 * -1267697097) - 1;
                if (r1.aa != null) {
                    r0 = r1.aa;
                } else {
                    r0 = "";
                }
                r2[r3] = r0;
                r2 = hr.aj;
                r0 = hr.ae - 1246602361;
                hr.ae = r0;
                r3 = (r0 * -1267697097) - 1;
                if (r1.ar != null) {
                    r0 = r1.ar;
                } else {
                    r0 = "";
                }
                r2[r3] = r0;
                r2 = hr.aj;
                r0 = hr.ae - 1246602361;
                hr.ae = r0;
                r3 = (r0 * -1267697097) - 1;
                if (r1.aj != null) {
                    r0 = r1.aj;
                } else {
                    r0 = "";
                }
                r2[r3] = r0;
                r2 = hr.as;
                r0 = hr.ar - 1194553915;
                hr.ar = r0;
                r3 = (r0 * 537618701) - 1;
                if (r1.an(-1116170756)) {
                    r0 = 1;
                } else if (r1.ay(891634236)) {
                    r0 = 2;
                } else {
                    r0 = 0;
                }
                r2[r3] = r0;
            } else {
                iArr = hr.as;
                i3 = hr.ar - 1194553915;
                hr.ar = i3;
                iArr[(i3 * 537618701) - 1] = -1;
                iArr = hr.as;
                i3 = hr.ar - 1194553915;
                hr.ar = i3;
                iArr[(i3 * 537618701) - 1] = 0;
                r0 = hr.aj;
                i3 = hr.ae - 1246602361;
                hr.ae = i3;
                r0[(i3 * -1267697097) - 1] = "";
                r0 = hr.aj;
                i3 = hr.ae - 1246602361;
                hr.ae = i3;
                r0[(i3 * -1267697097) - 1] = "";
                r0 = hr.aj;
                i3 = hr.ae - 1246602361;
                hr.ae = i3;
                r0[(i3 * -1267697097) - 1] = "";
                iArr = hr.as;
                i3 = hr.ar - 1194553915;
                hr.ar = i3;
                iArr[(i3 * 537618701) - 1] = 0;
            }
            return 1;
        } else if (5005 == i) {
            if (ay.lz == null) {
                iArr = hr.as;
                i3 = hr.ar - 1194553915;
                hr.ar = i3;
                iArr[(i3 * 537618701) - 1] = -1;
            } else {
                iArr = hr.as;
                i3 = hr.ar - 1194553915;
                hr.ar = i3;
                iArr[(i3 * 537618701) - 1] = ay.lz.aa * 677600269;
            }
            return 1;
        } else if (5008 == i) {
            r0 = hr.aj;
            i3 = hr.ae - -1246602361;
            hr.ae = i3;
            r1 = r0[i3 * -1267697097];
            iArr = hr.as;
            r2 = hr.ar - -1194553915;
            hr.ar = r2;
            r3 = iArr[r2 * 537618701];
            String toLowerCase = r1.toLowerCase();
            if (toLowerCase.startsWith(jv.gu)) {
                r1 = r1.substring(jv.gu.length());
                r2 = 0;
            } else if (toLowerCase.startsWith(jv.gk)) {
                r1 = r1.substring(jv.gk.length());
                r2 = 1;
            } else if (toLowerCase.startsWith(jv.gx)) {
                r1 = r1.substring(jv.gx.length());
                r2 = 2;
            } else if (toLowerCase.startsWith(jv.hx)) {
                r1 = r1.substring(jv.hx.length());
                r2 = 3;
            } else if (toLowerCase.startsWith(jv.hj)) {
                r1 = r1.substring(jv.hj.length());
                r2 = 4;
            } else if (toLowerCase.startsWith(jv.hg)) {
                r1 = r1.substring(jv.hg.length());
                r2 = 5;
            } else if (toLowerCase.startsWith(jv.hr)) {
                r1 = r1.substring(jv.hr.length());
                r2 = 6;
            } else if (toLowerCase.startsWith(jv.he)) {
                r1 = r1.substring(jv.he.length());
                r2 = 7;
            } else if (toLowerCase.startsWith(jv.hs)) {
                r1 = r1.substring(jv.hs.length());
                r2 = 8;
            } else if (toLowerCase.startsWith(jv.hi)) {
                r1 = r1.substring(jv.hi.length());
                r2 = 9;
            } else if (toLowerCase.startsWith(jv.ha)) {
                r1 = r1.substring(jv.ha.length());
                r2 = 10;
            } else if (toLowerCase.startsWith(jv.hu)) {
                r1 = r1.substring(jv.hu.length());
                r2 = 11;
            } else {
                if (client.aq * -1387037251 != 0) {
                    if (toLowerCase.startsWith(jv.gz)) {
                        r1 = r1.substring(jv.gz.length());
                        r2 = 0;
                    } else if (toLowerCase.startsWith(jv.gr)) {
                        r1 = r1.substring(jv.gr.length());
                        r2 = 1;
                    } else if (toLowerCase.startsWith(jv.hd)) {
                        r1 = r1.substring(jv.hd.length());
                        r2 = 2;
                    } else if (toLowerCase.startsWith(jv.hy)) {
                        r1 = r1.substring(jv.hy.length());
                        r2 = 3;
                    } else if (toLowerCase.startsWith(jv.hk)) {
                        r1 = r1.substring(jv.hk.length());
                        r2 = 4;
                    } else if (toLowerCase.startsWith(jv.hq)) {
                        r1 = r1.substring(jv.hq.length());
                        r2 = 5;
                    } else if (toLowerCase.startsWith(jv.hn)) {
                        r1 = r1.substring(jv.hn.length());
                        r2 = 6;
                    } else if (toLowerCase.startsWith(jv.hl)) {
                        r1 = r1.substring(jv.hl.length());
                        r2 = 7;
                    } else if (toLowerCase.startsWith(jv.hv)) {
                        r1 = r1.substring(jv.hv.length());
                        r2 = 8;
                    } else if (toLowerCase.startsWith(jv.hm)) {
                        r1 = r1.substring(jv.hm.length());
                        r2 = 9;
                    } else if (toLowerCase.startsWith(jv.hw)) {
                        r1 = r1.substring(jv.hw.length());
                        r2 = 10;
                    } else if (toLowerCase.startsWith(jv.hp)) {
                        r1 = r1.substring(jv.hp.length());
                        r2 = 11;
                    }
                }
                r2 = 0;
            }
            String toLowerCase2 = r1.toLowerCase();
            r0 = 0;
            Object substring;
            if (toLowerCase2.startsWith(jv.ht)) {
                substring = r1.substring(jv.ht.length());
                r0 = 1;
            } else if (toLowerCase2.startsWith(jv.hf)) {
                r0 = 2;
                r1 = r1.substring(jv.hf.length());
            } else if (toLowerCase2.startsWith(jv.hc)) {
                r0 = 3;
                r1 = r1.substring(jv.hc.length());
            } else if (toLowerCase2.startsWith(jv.hh)) {
                r0 = 4;
                r1 = r1.substring(jv.hh.length());
            } else if (toLowerCase2.startsWith(jv.iv)) {
                r0 = 5;
                r1 = r1.substring(jv.iv.length());
            } else if (-1387037251 * client.aq != 0) {
                if (toLowerCase2.startsWith(jv.hb)) {
                    substring = r1.substring(jv.hb.length());
                    r0 = 1;
                } else if (toLowerCase2.startsWith(jv.hz)) {
                    r0 = 2;
                    r1 = r1.substring(jv.hz.length());
                } else if (toLowerCase2.startsWith(jv.ho)) {
                    r0 = 3;
                    r1 = r1.substring(jv.ho.length());
                } else if (toLowerCase2.startsWith(jv.io)) {
                    r0 = 4;
                    r1 = r1.substring(jv.io.length());
                } else if (toLowerCase2.startsWith(jv.iq)) {
                    r0 = 5;
                    r1 = r1.substring(jv.iq.length());
                }
            }
            r8 = ik.ad(nr.dy, client.dv.ag, (byte) 46);
            r8.an.an(0, (byte) 31);
            r9 = r8.an.ad * 1978945739;
            r8.an.an(r3, (byte) 31);
            r8.an.an(r2, (byte) 31);
            r8.an.an(r0, (byte) 31);
            r10 = r8.an;
            r0 = r10.ad * 1978945739;
            r1 = gt.ad(r1, 650144592);
            r10.ah(r1.length, 1779617961);
            r10.ad = (lh.af.af(r1, 0, r1.length, r10.af, 1978945739 * r10.ad, 1363166700) * 2065011939) + r10.ad;
            r8.an.az((1978945739 * r8.an.ad) - r9, 684381889);
            client.dv.an(r8, (short) 255);
            return 1;
        } else if (i == 5009) {
            hr.ae -= 1801762574;
            r0 = hr.aj[hr.ae * -1267697097];
            r1 = hr.aj[(hr.ae * -1267697097) + 1];
            r8 = ik.ad(nr.bk, client.dv.ag, (byte) -42);
            r8.an.aa(0, -1752508204);
            r9 = 1978945739 * r8.an.ad;
            r8.an.aq(r0, (byte) -15);
            r10 = r8.an;
            r0 = r10.ad * 1978945739;
            r1 = gt.ad(r1, 1874768173);
            r10.ah(r1.length, 1779617961);
            r10.ad = (lh.af.af(r1, 0, r1.length, r10.af, r10.ad * 1978945739, 1363166700) * 2065011939) + r10.ad;
            r8.an.ai((1978945739 * r8.an.ad) - r9, (byte) 32);
            client.dv.an(r8, (short) 255);
            return 1;
        } else if (i == 5015) {
            if (gf.ho == null || gf.ho.af == null) {
                r0 = "";
            } else {
                r0 = gf.ho.af.af(168057418);
            }
            String[] strArr = hr.aj;
            r2 = hr.ae - 1246602361;
            hr.ae = r2;
            strArr[(r2 * -1267697097) - 1] = r0;
            return 1;
        } else if (i == 5016) {
            iArr = hr.as;
            i3 = hr.ar - 1194553915;
            hr.ar = i3;
            iArr[(i3 * 537618701) - 1] = -1224080547 * client.ls;
            return 1;
        } else if (5017 == i) {
            iArr = hr.as;
            i3 = hr.ar - -1194553915;
            hr.ar = i3;
            r0 = iArr[i3 * 537618701];
            r1 = hr.as;
            r2 = hr.ar - 1194553915;
            hr.ar = r2;
            r2 = (r2 * 537618701) - 1;
            hz hzVar = (hz) hi.af.get(Integer.valueOf(r0));
            if (hzVar == null) {
                r0 = 0;
            } else {
                r0 = hzVar.an(178751624);
            }
            r1[r2] = r0;
            return 1;
        } else if (5018 == i) {
            iArr = hr.as;
            i3 = hr.ar - -1194553915;
            hr.ar = i3;
            r0 = iArr[i3 * 537618701];
            r1 = hr.as;
            r2 = hr.ar - 1194553915;
            hr.ar = r2;
            r1[(r2 * 537618701) - 1] = bx.ay(r0, (byte) 42);
            return 1;
        } else if (i == 5019) {
            iArr = hr.as;
            i3 = hr.ar - -1194553915;
            hr.ar = i3;
            r0 = iArr[i3 * 537618701];
            r1 = hr.as;
            r2 = hr.ar - 1194553915;
            hr.ar = r2;
            r2 = (r2 * 537618701) - 1;
            hl hlVar = (hl) hi.ad.af((long) r0);
            if (hlVar == null) {
                r0 = -1;
            } else if (hi.an.af == hlVar.dh) {
                r0 = -1;
            } else {
                r0 = ((hl) hlVar.dh).af * 1687932353;
            }
            r1[r2] = r0;
            return 1;
        } else if (i == 5020) {
            r0 = hr.aj;
            i3 = hr.ae - -1246602361;
            hr.ae = i3;
            cb.bl(r0[i3 * -1267697097], 2092333717);
            return 1;
        } else if (5021 == i) {
            r0 = hr.aj;
            i3 = hr.ae - -1246602361;
            hr.ae = i3;
            client.li = r0[i3 * -1267697097].toLowerCase().trim();
            return 1;
        } else if (i != 5022) {
            return 2;
        } else {
            r0 = hr.aj;
            i3 = hr.ae - 1246602361;
            hr.ae = i3;
            r0[(i3 * -1267697097) - 1] = client.li;
            return 1;
        }
    }

    static ac fa(ac acVar, int i) {
        ac acVar2 = null;
        try {
            int af = gj.af(ah.fy(acVar, -1290016285), 1773673955);
            if (af != 0) {
                int i2 = 0;
                ac acVar3 = acVar;
                while (i2 < af) {
                    ac ad = hv.ad(acVar3.bt * -1008623461, 541822623);
                    if (ad == null) {
                        break;
                    }
                    i2++;
                    acVar3 = ad;
                }
                acVar2 = acVar3;
            }
            if (acVar2 == null) {
                return acVar.dx;
            }
            return acVar2;
        } catch (Throwable e) {
            throw ba.ad(e, "dq.fa(" + ')');
        }
    }
}
