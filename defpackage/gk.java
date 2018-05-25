package p000;

public class gk extends kq {
    static ky af = new ky(mn.an, null);
    public static final int ax = 3;
    static final int dl = 3261415;
    static final int kv = 32;
    String[] aa;
    int[] ad;
    int ag;
    kp[] aj;
    int[] an;
    int ar;
    int as;
    int ay;

    public static void af(kf kfVar, int i) {
        try {
            ag.af = kfVar;
        } catch (Throwable e) {
            throw ba.ad(e, "gk.af(" + ')');
        }
    }

    gk() {
        try {
        } catch (Throwable e) {
            throw ba.ad(e, "gk.<init>(" + ')');
        }
    }

    static gk ag(int i) {
        gk gkVar = (gk) af.af((long) i);
        if (gkVar != null) {
            return gkVar;
        }
        byte[] an = dt.cn.an(i, 0, -42920725);
        if (an == null) {
            return null;
        }
        gkVar = cs.an(an, -889824203);
        af.an(gkVar, (long) i);
        return gkVar;
    }

    static gk ay(int i) {
        gk gkVar = (gk) af.af((long) i);
        if (gkVar != null) {
            return gkVar;
        }
        byte[] an = dt.cn.an(i, 0, -448038387);
        if (an == null) {
            return null;
        }
        gkVar = cs.an(an, 1523827279);
        af.an(gkVar, (long) i);
        return gkVar;
    }

    static gk aj(int i, int i2) {
        gk gkVar = (gk) af.af((long) (i << 16));
        if (gkVar != null) {
            return gkVar;
        }
        int ax = dt.cn.ax(String.valueOf(i), 1907128669);
        if (-1 == ax) {
            return null;
        }
        byte[] ae = dt.cn.ae(ax, (byte) 65);
        if (ae != null) {
            if (ae.length <= 1) {
                return null;
            }
            gkVar = cs.an(ae, 1850513260);
            if (gkVar != null) {
                af.an(gkVar, (long) (i << 16));
                return gkVar;
            }
        }
        return null;
    }

    static gk ar(int i, int i2) {
        gk gkVar = (gk) af.af((long) (i << 16));
        if (gkVar != null) {
            return gkVar;
        }
        int ax = dt.cn.ax(String.valueOf(i), 946147943);
        if (-1 == ax) {
            return null;
        }
        byte[] ae = dt.cn.ae(ax, (byte) 91);
        if (ae != null) {
            if (ae.length <= 1) {
                return null;
            }
            gkVar = cs.an(ae, 909534484);
            if (gkVar != null) {
                af.an(gkVar, (long) (i << 16));
                return gkVar;
            }
        }
        return null;
    }

    static gk as(int i, int i2) {
        gk gkVar = (gk) af.af((long) (i << 16));
        if (gkVar != null) {
            return gkVar;
        }
        int ax = dt.cn.ax(String.valueOf(i), -656438427);
        if (-1 == ax) {
            return null;
        }
        byte[] ae = dt.cn.ae(ax, (byte) 30);
        if (ae != null) {
            if (ae.length <= 1) {
                return null;
            }
            gkVar = cs.an(ae, -1285893158);
            if (gkVar != null) {
                af.an(gkVar, (long) (i << 16));
                return gkVar;
            }
        }
        return null;
    }

    static gk ae(byte[] bArr) {
        int i;
        int au;
        int i2;
        gk gkVar = new gk();
        ik ikVar = new ik(bArr);
        ikVar.ad = (ikVar.af.length - 2) * 2065011939;
        int length = ((ikVar.af.length - 2) - ikVar.au(-1829946875)) - 12;
        ikVar.ad = length * 2065011939;
        int al = ikVar.al(-560342529);
        gkVar.ag = ikVar.au(2090458719) * 422013801;
        gkVar.ay = ikVar.au(987105174) * -746799925;
        gkVar.as = ikVar.au(-1340608563) * -951648646;
        gkVar.ar = ikVar.au(1302889142) * -707503511;
        int ao = ikVar.ao((byte) 0);
        if (ao > 0) {
            gkVar.aj = gkVar.aa(ao, 1629716391);
            for (i = 0; i < ao; i++) {
                au = ikVar.au(1140928604);
                if (au > 0) {
                    i2 = au - 1;
                    i2 |= i2 >>> 1;
                    i2 |= i2 >>> 2;
                    i2 |= i2 >>> 4;
                    i2 |= i2 >>> 8;
                    i2 = (i2 | (i2 >>> 16)) + 1;
                } else {
                    i2 = 1;
                }
                kp kpVar = new kp(i2);
                gkVar.aj[i] = kpVar;
                i2 = au;
                while (true) {
                    au = i2 - 1;
                    if (i2 <= 0) {
                        break;
                    }
                    kpVar.ad(new kr(ikVar.al(146874081)), (long) ikVar.al(1523183144));
                    i2 = au;
                }
            }
        }
        ikVar.ad = 0;
        ikVar.bb((byte) 31);
        gkVar.ad = new int[al];
        gkVar.an = new int[al];
        gkVar.aa = new String[al];
        i2 = 0;
        while (ikVar.ad * 493907701 < length) {
            i = ikVar.au(-831326243);
            if (i == 3) {
                gkVar.aa[i2] = ikVar.bc(1627993649);
            } else if (i >= 100 || 21 == i || 654244764 == i || i == 39) {
                gkVar.an[i2] = ikVar.ao((byte) 0);
            } else {
                gkVar.an[i2] = ikVar.al(408586937);
            }
            au = i2 + 1;
            gkVar.ad[i2] = i;
            i2 = au;
        }
        return gkVar;
    }

    static gk am(byte[] bArr) {
        int i;
        int au;
        int i2;
        gk gkVar = new gk();
        ik ikVar = new ik(bArr);
        ikVar.ad = (ikVar.af.length - 2) * 2065011939;
        int length = ((ikVar.af.length - 2) - ikVar.au(-163462104)) - 12;
        ikVar.ad = length * 2065011939;
        int al = ikVar.al(741843337);
        gkVar.ag = ikVar.au(-820812964) * -224765331;
        gkVar.ay = ikVar.au(-501972872) * -2113356825;
        gkVar.as = ikVar.au(-711624438) * 347150479;
        gkVar.ar = ikVar.au(1404951740) * -707503511;
        int ao = ikVar.ao((byte) 0);
        if (ao > 0) {
            gkVar.aj = gkVar.aa(ao, 332936913);
            for (i = 0; i < ao; i++) {
                au = ikVar.au(-1285287882);
                if (au > 0) {
                    i2 = au - 1;
                    i2 |= i2 >>> 1;
                    i2 |= i2 >>> 2;
                    i2 |= i2 >>> 4;
                    i2 |= i2 >>> 8;
                    i2 = (i2 | (i2 >>> 16)) + 1;
                } else {
                    i2 = 1;
                }
                kp kpVar = new kp(i2);
                gkVar.aj[i] = kpVar;
                i2 = au;
                while (true) {
                    au = i2 - 1;
                    if (i2 <= 0) {
                        break;
                    }
                    kpVar.ad(new kr(ikVar.al(842679833)), (long) ikVar.al(402018117));
                    i2 = au;
                }
            }
        }
        ikVar.ad = 0;
        ikVar.bb((byte) 47);
        gkVar.ad = new int[al];
        gkVar.an = new int[al];
        gkVar.aa = new String[al];
        i2 = 0;
        while (ikVar.ad * 1978945739 < length) {
            i = ikVar.au(1489740217);
            if (i == 3) {
                gkVar.aa[i2] = ikVar.bc(519862068);
            } else if (i >= 100 || 21 == i || 38 == i || i == 39) {
                gkVar.an[i2] = ikVar.ao((byte) 0);
            } else {
                gkVar.an[i2] = ikVar.al(178547462);
            }
            au = i2 + 1;
            gkVar.ad[i2] = i;
            i2 = au;
        }
        return gkVar;
    }

    static gk aq(byte[] bArr) {
        int i;
        int au;
        int i2;
        gk gkVar = new gk();
        ik ikVar = new ik(bArr);
        ikVar.ad = -229429711 * (ikVar.af.length - 2);
        int length = ((ikVar.af.length - 2) - ikVar.au(1569035236)) - 12;
        ikVar.ad = 2065011939 * length;
        int al = ikVar.al(578697454);
        gkVar.ag = ikVar.au(967629640) * -224765331;
        gkVar.ay = ikVar.au(1222916524) * 785240203;
        gkVar.as = ikVar.au(1729682574) * 1128967848;
        gkVar.ar = ikVar.au(-1981214079) * 386793751;
        int ao = ikVar.ao((byte) 0);
        if (ao > 0) {
            gkVar.aj = gkVar.aa(ao, 1330475150);
            for (i = 0; i < ao; i++) {
                au = ikVar.au(-1144347856);
                if (au > 0) {
                    i2 = au - 1;
                    i2 |= i2 >>> 1;
                    i2 |= i2 >>> 2;
                    i2 |= i2 >>> 4;
                    i2 |= i2 >>> 8;
                    i2 = (i2 | (i2 >>> 16)) + 1;
                } else {
                    i2 = 1;
                }
                kp kpVar = new kp(i2);
                gkVar.aj[i] = kpVar;
                i2 = au;
                while (true) {
                    au = i2 - 1;
                    if (i2 <= 0) {
                        break;
                    }
                    kpVar.ad(new kr(ikVar.al(1811016098)), (long) ikVar.al(1848497363));
                    i2 = au;
                }
            }
        }
        ikVar.ad = 0;
        ikVar.bb((byte) 126);
        gkVar.ad = new int[al];
        gkVar.an = new int[al];
        gkVar.aa = new String[al];
        i2 = 0;
        while (ikVar.ad * 1375726334 < length) {
            i = ikVar.au(-1885022275);
            if (i == 3) {
                gkVar.aa[i2] = ikVar.bc(1581748804);
            } else if (i >= 100 || 21 == i || 38 == i || i == 39) {
                gkVar.an[i2] = ikVar.ao((byte) 0);
            } else {
                gkVar.an[i2] = ikVar.al(1230707824);
            }
            au = i2 + 1;
            gkVar.ad[i2] = i;
            i2 = au;
        }
        return gkVar;
    }

    static final void aa(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, eq[] eqVarArr, int i8) {
        int i9 = 0;
        while (i9 < 8) {
            int i10 = 0;
            while (i10 < 8) {
                if (i2 + i9 > 0 && i2 + i9 < 103 && i10 + i3 > 0 && i10 + i3 < 103) {
                    try {
                        int[] iArr = eqVarArr[i].bu[i9 + i2];
                        int i11 = i10 + i3;
                        iArr[i11] = iArr[i11] & -16777217;
                    } catch (Throwable e) {
                        throw ba.ad(e, "gk.aa(" + ')');
                    }
                }
                i10++;
            }
            i9++;
        }
        ik ikVar = new ik(bArr);
        for (int i12 = 0; i12 < 4; i12++) {
            int i13 = 0;
            while (i13 < 64) {
                int i14 = 0;
                while (i14 < 64) {
                    if (i4 != i12 || i13 < i5 || i13 >= i5 + 8 || i14 < i6 || i14 >= i6 + 8) {
                        em.ag(ikVar, 0, -1, -1, 0, 0, 0, (byte) 4);
                    } else {
                        int af = i2 + gc.af(i13 & 7, i14 & 7, i7, -1288784099);
                        i9 = i13 & 7;
                        i11 = i14 & 7;
                        int i15 = i7 & 3;
                        if (i15 == 0) {
                            i9 = i11;
                        } else if (i15 == 1) {
                            i9 = 7 - i9;
                        } else if (i15 == 2) {
                            i9 = 7 - i11;
                        }
                        em.ag(ikVar, i, af, i9 + i3, 0, 0, i7, (byte) 66);
                    }
                    i14++;
                }
                i13++;
            }
        }
    }

    kp[] aa(int i, int i2) {
        try {
            return new kp[i];
        } catch (Throwable e) {
            throw ba.ad(e, "gk.aa(" + ')');
        }
    }

    kp[] ab(int i) {
        return new kp[i];
    }

    kp[] at(int i) {
        return new kp[i];
    }

    kp[] aw(int i) {
        return new kp[i];
    }

    public static void gp(int i, int i2, int i3, boolean z, byte b) {
        try {
            no ad = ik.ad(nr.aa, client.dv.ag, (byte) 43);
            ad.an.bs(i3, 537618701);
            ad.an.co(i, -1562397802);
            ad.an.co(i2, 1097173809);
            ad.an.cq(z ? 764635467 * client.gy : 0, 1242192116);
            client.dv.an(ad, (short) 255);
        } catch (Throwable e) {
            throw ba.ad(e, "gk.gp(" + ')');
        }
    }
}
