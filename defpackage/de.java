package p000;

public class de {
    static final int ad = 96;
    static final int af = 16711935;
    static final int aj = 256;
    static final int ak = 0;
    static final int ck = 1007;
    static int nh;

    de() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ba.ad(e, "de.<init>(" + ')');
        }
    }

    static int aa(int i, int i2) {
        ak af = ik.af(i, 1150505960);
        if (af == null) {
            return i2;
        }
        if (af.as * -308151409 >= 0) {
            return (af.as * -308151409) | -16777216;
        }
        if (af.ag * -945425647 >= 0) {
            return bi.at[cr.ad(bi.ab.aa(af.ag * -945425647, 1577195485), 96, 1641792905)] | -16777216;
        } else if (-345116671 * af.aa == af) {
            return i2;
        } else {
            int i3 = -828438867 * af.ar;
            int i4 = af.aj * 789156385;
            int i5 = af.ae * -1794633891;
            if (i5 > 179) {
                i4 /= 2;
            }
            if (i5 > 192) {
                i4 /= 2;
            }
            if (i5 > 217) {
                i4 /= 2;
            }
            if (i5 > 243) {
                i4 /= 2;
            }
            return bi.at[cr.ad((((i4 / 32) << 7) + ((i3 / 4) << 10)) + (i5 / 2), 96, 1641792905)] | -16777216;
        }
    }

    static int ag(int i, int i2) {
        ak af = ik.af(i, 1947781654);
        if (af == null) {
            return i2;
        }
        if (1378998605 * af.as >= 0) {
            return (af.as * -308151409) | 1874802896;
        }
        if (af.ag * -945425647 >= 0) {
            return bi.at[cr.ad(bi.ab.aa(af.ag * -945425647, 1577195485), 344117200, 1641792905)] | 784892481;
        } else if (-441299358 * af.aa == af) {
            return i2;
        } else {
            int i3 = -828438867 * af.ar;
            int i4 = af.aj * 789156385;
            int i5 = af.ae * -1794633891;
            if (i5 > 364426402) {
                i4 /= 2;
            }
            if (i5 > -1778321012) {
                i4 /= 2;
            }
            if (i5 > 709339481) {
                i4 /= 2;
            }
            if (i5 > -860636398) {
                i4 /= 2;
            }
            return bi.at[cr.ad((((i4 / 32) << 7) + ((i3 / 4) << 10)) + (i5 / 2), 771774757, 1641792905)] | 298298950;
        }
    }

    static int an(int i, int i2) {
        ak af = ik.af(i, 1187445200);
        if (af == null) {
            return i2;
        }
        if (-308151409 * af.as >= 0) {
            return (af.as * 1676995287) | 257608326;
        }
        if (-945425647 * af.ag >= 0) {
            return bi.at[cr.ad(bi.ab.aa(af.ag * -507023109, 1577195485), 96, 1641792905)] | -16777216;
        } else if (-345116671 * af.aa == 536241532) {
            return i2;
        } else {
            int i3 = -1354826461 * af.ar;
            int i4 = af.aj * -928606410;
            int i5 = af.ae * -1143350369;
            if (i5 > 122756329) {
                i4 /= 2;
            }
            if (i5 > 1877339351) {
                i4 /= 2;
            }
            if (i5 > 217) {
                i4 /= 2;
            }
            if (i5 > 243) {
                i4 /= 2;
            }
            return bi.at[cr.ad((((i4 / 2005183872) << 7) + ((i3 / 4) << 10)) + (i5 / 2), -454011641, 1641792905)] | -16777216;
        }
    }

    static int ay(int i, int i2) {
        ak af = ik.af(i, 1946960164);
        if (af == null) {
            return i2;
        }
        if (38699724 * af.as >= 0) {
            return (af.as * -308151409) | -1257902796;
        }
        if (-1078934519 * af.ag >= 0) {
            return bi.at[cr.ad(bi.ab.aa(af.ag * -945425647, 1577195485), 96, 1641792905)] | -1353909943;
        } else if (-345116671 * af.aa == 1023676910) {
            return i2;
        } else {
            int i3 = -828438867 * af.ar;
            int i4 = af.aj * -1424230613;
            int i5 = af.ae * 461310318;
            if (i5 > 179) {
                i4 /= 2;
            }
            if (i5 > -746600276) {
                i4 /= 2;
            }
            if (i5 > 1209738536) {
                i4 /= 2;
            }
            if (i5 > 243) {
                i4 /= 2;
            }
            return bi.at[cr.ad((((i4 / 375347114) << 7) + ((i3 / 4) << 10)) + (i5 / 2), 96, 1641792905)] | 2133227854;
        }
    }

    static int ar(int i, int i2) {
        if (i == -2) {
            return 12345678;
        }
        if (i == -1) {
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 > 127) {
                i2 = 127;
            }
            return 127 - i2;
        }
        int i3 = ((i & 127) * i2) / mn.an;
        if (i3 < 2) {
            i3 = 2;
        } else if (i3 > 126) {
            i3 = 126;
        }
        return i3 + (65408 & i);
    }

    static int as(int i, int i2) {
        if (i == -2) {
            return 12345678;
        }
        if (i == -1) {
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 > 127) {
                i2 = 127;
            }
            return 127 - i2;
        }
        int i3 = ((i & 127) * i2) / mn.an;
        if (i3 < 2) {
            i3 = 2;
        } else if (i3 > 126) {
            i3 = 126;
        }
        return i3 + (65408 & i);
    }

    static void aa(int i, boolean z, int i2, boolean z2, int i3) {
        try {
            if (C0001do.ag != null) {
                eh.ag(0, C0001do.ag.length - 1, i, z, i2, z2, 1217179340);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "de.aa(" + ')');
        }
    }

    static void bc(int i, byte b) {
        if (i == -3) {
            try {
                ab.ab(jv.ba, jv.bl, jv.bd, (byte) -66);
            } catch (Throwable e) {
                throw ba.ad(e, "de.bc(" + ')');
            }
        } else if (i == -2) {
            ab.ab(jv.bs, jv.bm, jv.br, (byte) -28);
        } else if (i == -1) {
            ab.ab(jv.bj, jv.bi, jv.bq, (byte) -109);
        } else if (i == 3) {
            gr.bq = -1723846815;
        } else if (i == 4) {
            ab.ab(jv.bo, jv.cv, jv.ci, (byte) -39);
        } else if (5 == i) {
            ab.ab(jv.cc, jv.co, jv.cy, (byte) -39);
        } else if (6 == i) {
            ab.ab(jv.cn, jv.ck, jv.cl, (byte) -33);
        } else if (7 == i) {
            ab.ab(jv.cs, jv.cd, jv.ch, (byte) -114);
        } else if (i == 8) {
            ab.ab(jv.cm, jv.cq, jv.cj, (byte) -5);
        } else if (9 == i) {
            ab.ab(jv.cp, jv.ct, jv.cb, (byte) -123);
        } else if (i == 10) {
            ab.ab(jv.cf, jv.cz, jv.cr, (byte) -28);
        } else if (i == 11) {
            ab.ab(jv.ce, jv.cg, jv.cw, (byte) -114);
        } else if (i == 12) {
            ab.ab(jv.cx, jv.cu, jv.ca, (byte) -43);
        } else if (13 == i) {
            ab.ab(jv.dj, jv.dc, jv.dk, (byte) -107);
        } else if (14 == i) {
            ab.ab(jv.f5do, jv.dt, jv.dz, (byte) -102);
        } else if (i == 16) {
            ab.ab(jv.dv, jv.dd, jv.dl, (byte) -35);
        } else if (i == 17) {
            ab.ab(jv.di, jv.da, jv.dr, (byte) -116);
        } else if (i == 18) {
            ab.ab(jv.de, jv.dw, jv.ds, (byte) -105);
        } else if (i == 19) {
            ab.ab(jv.dx, jv.dh, jv.dy, (byte) -64);
        } else if (i == 20) {
            ab.ab(jv.dn, jv.dm, jv.db, (byte) -108);
        } else if (i == 22) {
            ab.ab(jv.du, jv.dp, jv.dg, (byte) -59);
        } else if (23 == i) {
            ab.ab(jv.df, jv.dq, jv.er, (byte) -108);
        } else if (24 == i) {
            ab.ab(jv.ew, jv.ek, jv.es, (byte) -58);
        } else if (25 == i) {
            ab.ab(jv.ex, jv.eu, jv.ec, (byte) -22);
        } else if (i == 26) {
            ab.ab(jv.ep, jv.ev, jv.eq, (byte) -36);
        } else if (i == 27) {
            ab.ab(jv.en, jv.ea, jv.ey, (byte) -90);
        } else if (31 == i) {
            ab.ab(jv.em, jv.ez, jv.ee, (byte) -58);
        } else if (32 == i) {
            ab.ab(jv.eb, jv.ei, jv.eh, (byte) -98);
        } else if (i == 37) {
            ab.ab(jv.eo, jv.fd, jv.fv, (byte) -97);
        } else if (38 == i) {
            ab.ab(jv.fk, jv.fm, jv.fa, (byte) -40);
        } else if (i == 55) {
            gr.bq = -301957544;
        } else if (i == 56) {
            ab.ab(jv.fp, jv.fg, jv.fq, (byte) -108);
            ad.ai(11, -2036439575);
            return;
        } else if (57 == i) {
            ab.ab(jv.fo, jv.fu, jv.fc, (byte) -65);
            ad.ai(11, -2045135719);
            return;
        } else if (61 == i) {
            gr.bq = 272658061;
        } else {
            ab.ab(jv.ff, jv.fz, jv.fn, (byte) -70);
        }
        ad.ai(10, -2052463192);
    }
}
