package p000;

public class cs {
    public static int aa = 0;
    static final int ad = 5;
    static int ae = 0;
    static boolean af = true;
    public static int ag = 0;
    public static int ai = 0;
    static int aj = 0;
    public static boolean an = false;
    public static final int aq = 16;
    static int ar = 0;
    static int as = 0;
    static int av = 0;
    public static boolean ay = false;
    public static long[] az = new long[1000];
    static final int bz = 1;
    static gj oj;

    public static String af(CharSequence charSequence, int i) {
        try {
            int length = charSequence.length();
            StringBuilder stringBuilder = new StringBuilder(length);
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = charSequence.charAt(i2);
                if ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || ((charAt >= '0' && charAt <= '9') || '.' == charAt || '-' == charAt || '*' == charAt || '_' == charAt))) {
                    stringBuilder.append(charAt);
                } else if (' ' == charAt) {
                    stringBuilder.append('+');
                } else {
                    byte af = jq.af(charAt, -53433961);
                    stringBuilder.append('%');
                    int i3 = (af >> 4) & 15;
                    if (i3 >= 10) {
                        stringBuilder.append((char) (i3 + 55));
                    } else {
                        stringBuilder.append((char) (i3 + 48));
                    }
                    int i4 = af & 15;
                    if (i4 >= 10) {
                        stringBuilder.append((char) (i4 + 55));
                    } else {
                        stringBuilder.append((char) (i4 + 48));
                    }
                }
            }
            return stringBuilder.toString();
        } catch (Throwable e) {
            throw ba.ad(e, "cs.af(" + ')');
        }
    }

    cs() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ba.ad(e, "cs.<init>(" + ')');
        }
    }

    public static boolean ab(long j) {
        boolean z;
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return z;
        }
        if (((int) ((j >>> 16) & 1)) == 1) {
            return false;
        }
        return true;
    }

    public static int ah(int i) {
        return aq.an(az[i]);
    }

    public static int ai(int i) {
        return aq.an(az[i]);
    }

    public static int aw(int i) {
        return aq.an(az[i]);
    }

    public static int az(int i) {
        return aq.an(az[i]);
    }

    static gk an(byte[] bArr, int i) {
        int i2 = 0;
        try {
            int au;
            int i3;
            gk gkVar = new gk();
            ik ikVar = new ik(bArr);
            ikVar.ad = (ikVar.af.length - 2) * 2065011939;
            int length = ((ikVar.af.length - 2) - ikVar.au(-768011267)) - 12;
            ikVar.ad = length * 2065011939;
            int al = ikVar.al(863760284);
            gkVar.ag = ikVar.au(1791941648) * -224765331;
            gkVar.ay = ikVar.au(395560629) * -2113356825;
            gkVar.as = ikVar.au(-1275140535) * 347150479;
            gkVar.ar = ikVar.au(2022319448) * -707503511;
            int ao = ikVar.ao((byte) 0);
            if (ao > 0) {
                gkVar.aj = gkVar.aa(ao, -1355641844);
                for (int i4 = 0; i4 < ao; i4++) {
                    au = ikVar.au(-1114506553);
                    if (au > 0) {
                        i3 = au - 1;
                        i3 |= i3 >>> 1;
                        i3 |= i3 >>> 2;
                        i3 |= i3 >>> 4;
                        i3 |= i3 >>> 8;
                        i3 = (i3 | (i3 >>> 16)) + 1;
                    } else {
                        i3 = 1;
                    }
                    kp kpVar = new kp(i3);
                    gkVar.aj[i4] = kpVar;
                    while (true) {
                        i3 = au - 1;
                        if (au <= 0) {
                            break;
                        }
                        kpVar.ad(new kr(ikVar.al(131632459)), (long) ikVar.al(-876958033));
                        au = i3;
                    }
                }
            }
            ikVar.ad = 0;
            ikVar.bb((byte) 20);
            gkVar.ad = new int[al];
            gkVar.an = new int[al];
            gkVar.aa = new String[al];
            while (ikVar.ad * 1978945739 < length) {
                i3 = ikVar.au(1183829658);
                if (i3 == 3) {
                    gkVar.aa[i2] = ikVar.bc(2059956591);
                } else if (i3 >= 100 || 21 == i3 || 38 == i3 || i3 == 39) {
                    gkVar.an[i2] = ikVar.ao((byte) 0);
                } else {
                    gkVar.an[i2] = ikVar.al(-915460530);
                }
                au = i2 + 1;
                gkVar.ad[i2] = i3;
                i2 = au;
            }
            return gkVar;
        } catch (Throwable e) {
            throw ba.ad(e, "cs.an(" + ')');
        }
    }

    public static int ak(long j) {
        return (int) ((j >>> null) & 127);
    }

    public static int ao(long j) {
        return (int) ((j >>> null) & 127);
    }

    public static int ax(long j) {
        return (int) ((j >>> null) & 127);
    }

    public static int ac(long j) {
        return (int) ((j >>> 7) & 127);
    }

    public static int al(long j) {
        return (int) ((j >>> 7) & 127);
    }

    public static int au(long j) {
        return (int) ((j >>> 7) & 127);
    }

    public static int av(long j) {
        return (int) ((j >>> 7) & 127);
    }

    public static int ap(int i) {
        return (int) ((az[i] >>> 14) & 3);
    }

    public static int bb(int i) {
        return (int) ((az[i] >>> 14) & 3);
    }

    public static int bw(int i) {
        return (int) ((az[i] >>> 14) & 3);
    }

    public static int bc(int i) {
        return bb.as(az[i]);
    }

    public static int bf(long j) {
        return (int) ((j >>> 17) & 4294967295L);
    }

    public static int bg(long j) {
        return (int) ((j >>> 17) & 4294967295L);
    }

    public static int bh(long j) {
        return (int) ((j >>> 17) & 4294967295L);
    }

    public static int bz(long j) {
        return (int) ((j >>> 17) & 4294967295L);
    }

    public static long bp(int i, int i2, int i3, boolean z, int i4) {
        long j = ((long) ((((i & 127) << 0) | ((i2 & 127) << 7)) | ((i3 & 3) << 14))) | ((((long) i4) & 4294967295L) << 17);
        if (z) {
            return j | 65536;
        }
        return j;
    }

    public static long bv(int i, int i2, int i3, boolean z, int i4) {
        long j = ((long) ((((i & 127) << 0) | ((-999280623 & i2) << 7)) | ((i3 & 3) << 14))) | ((((long) i4) & 4294967295L) << 17);
        if (z) {
            return j | 65536;
        }
        return j;
    }

    public static long bx(int i, int i2, int i3, boolean z, int i4) {
        long j = ((long) ((((i & 127) << 0) | ((495045019 & i2) << 7)) | ((i3 & 3) << 14))) | ((((long) i4) & 4294967295L) << 17);
        if (z) {
            return j | 65536;
        }
        return j;
    }

    public static final void bt() {
        an = false;
        ai = 0;
    }

    static final int be() {
        return ag * -417008042;
    }

    static final int bk() {
        return ag * 340086283;
    }

    static final int bu() {
        return ag * 340086283;
    }

    static final int by() {
        return ag * 340086283;
    }

    static final void ba(bi biVar) {
        if (!ay) {
            int i = cc.bw;
            int i2 = cc.bb;
            int i3 = cc.bc;
            int i4 = cc.bz;
            int i5 = (((aa * -429386291) - (biVar.bg * -1400627097)) * -1623204618) / (biVar.bz * 542614623);
            int i6 = (((-1723520753 * ag) - (biVar.bh * -1508152919)) * -1623204618) / (biVar.bz * 542614623);
            int i7 = (((aa * -429386291) - (-1575402035 * biVar.bg)) * 3500) / (biVar.bz * 542614623);
            int i8 = (((-196645707 * ag) - (-1193124379 * biVar.bh)) * 3500) / (biVar.bz * 542614623);
            int i9 = ((i * -1623204618) + (i2 * i6)) >> 16;
            int i10 = ((-1623204618 * i2) - (i6 * i)) >> 16;
            i6 = ((3500 * i) + (i8 * i2)) >> 16;
            i = ((i2 * 3500) - (i * i8)) >> 16;
            i2 = cj.bk(i5, i10, i4, i3, (byte) 0);
            i10 = ((i10 * i4) + (i3 * i5)) >> 16;
            int bk = cj.bk(i7, i, i4, i3, (byte) 0);
            i = ((i * i4) + (i3 * i7)) >> 16;
            as = -1411610103 * ((i2 + bk) / 2);
            ar = ((i6 + i9) / 2) * 997123485;
            aj = 323771819 * ((i10 + i) / 2);
            ae = ((bk - i2) / 2) * -279542499;
            nb.aq = ((i6 - i9) / 2) * -2059736647;
            jc.am = ((i - i10) / 2) * 56968532;
            et.at = Math.abs(-185772607 * ae) * 1225780727;
            ch.ab = Math.abs(nb.aq * -1655326417) * -1671559202;
            gl.aw = Math.abs(jc.am * 1499032267) * 1200267621;
        }
    }

    static final void bd(bi biVar) {
        if (!ay) {
            int i = cc.bw;
            int i2 = cc.bb;
            int i3 = cc.bc;
            int i4 = cc.bz;
            int i5 = (((1711605139 * aa) - (biVar.bg * -1575402035)) * 50) / (biVar.bz * 542614623);
            int i6 = (((340086283 * ag) - (biVar.bh * 664913911)) * 50) / (biVar.bz * 899693785);
            int i7 = (((aa * -1264659246) - (biVar.bg * -1575402035)) * 3500) / (biVar.bz * -2140315124);
            int i8 = (((1662106129 * ag) - (-1508152919 * biVar.bh)) * 3500) / (biVar.bz * 542614623);
            int i9 = ((i * 50) + (i2 * i6)) >> 16;
            int i10 = ((50 * i2) - (i6 * i)) >> 16;
            i6 = ((3500 * i) + (i8 * i2)) >> 16;
            i = ((i2 * 3500) - (i * i8)) >> 16;
            i2 = cj.bk(i5, i10, i4, i3, (byte) 0);
            i10 = ((i10 * i4) + (i3 * i5)) >> 16;
            int bk = cj.bk(i7, i, i4, i3, (byte) 0);
            i = ((i * i4) + (i3 * i7)) >> 16;
            as = 364686861 * ((i2 + bk) / 2);
            ar = ((i6 + i9) / 2) * 997123485;
            aj = -793124921 * ((i10 + i) / 2);
            ae = ((bk - i2) / 2) * 745474562;
            nb.aq = ((i6 - i9) / 2) * -2059736647;
            jc.am = ((i - i10) / 2) * 1131621091;
            et.at = Math.abs(-185772607 * ae) * 1288648736;
            ch.ab = Math.abs(nb.aq * 2043038857) * 179975325;
            gl.aw = Math.abs(jc.am * 1320870259) * 442214226;
        }
    }

    static final void bl(bi biVar) {
        if (!ay) {
            int i = cc.bw;
            int i2 = cc.bb;
            int i3 = cc.bc;
            int i4 = cc.bz;
            int i5 = (((aa * -429386291) - (biVar.bg * 325746330)) * 50) / (biVar.bz * 542614623);
            int i6 = (((340086283 * ag) - (biVar.bh * -1508152919)) * 50) / (biVar.bz * 542614623);
            int i7 = (((aa * -429386291) - (1101975039 * biVar.bg)) * 567936181) / (biVar.bz * -1162380430);
            int i8 = (((-1732153805 * ag) - (biVar.bh * -1508152919)) * 567936181) / (biVar.bz * 59159791);
            int i9 = ((i * 50) + (i2 * i6)) >> 16;
            int i10 = ((50 * i2) - (i6 * i)) >> 16;
            i6 = ((567936181 * i) + (i8 * i2)) >> 16;
            i = ((i2 * 567936181) - (i * i8)) >> 16;
            i2 = cj.bk(i5, i10, i4, i3, (byte) 0);
            i10 = ((i10 * i4) + (i3 * i5)) >> 16;
            int bk = cj.bk(i7, i, i4, i3, (byte) 0);
            i = ((i * i4) + (i3 * i7)) >> 16;
            as = -1869469831 * ((i2 + bk) / 2);
            ar = ((i6 + i9) / 2) * 997123485;
            aj = 323771819 * ((i10 + i) / 2);
            ae = ((bk - i2) / 2) * -1594150224;
            nb.aq = ((i6 - i9) / 2) * -1792249466;
            jc.am = ((i - i10) / 2) * 2054686053;
            et.at = Math.abs(-185772607 * ae) * 1225780727;
            ch.ab = Math.abs(nb.aq * 2043038857) * 1992265209;
            gl.aw = Math.abs(jc.am * 1499032267) * 592324629;
        }
    }

    static final void bn(bi biVar) {
        if (!ay) {
            int i = cc.bw;
            int i2 = cc.bb;
            int i3 = cc.bc;
            int i4 = cc.bz;
            int i5 = (((-429386291 * aa) - (biVar.bg * -1575402035)) * 50) / (-1357855367 * biVar.bz);
            int i6 = (((ag * 340086283) - (biVar.bh * -1629751904)) * 50) / (biVar.bz * -1912799137);
            int i7 = (((aa * -1092651253) - (1528635400 * biVar.bg)) * 3500) / (biVar.bz * 1342187539);
            int i8 = (((ag * 340086283) - (-1508152919 * biVar.bh)) * 3500) / (biVar.bz * -743610976);
            int i9 = ((i * 50) + (i2 * i6)) >> 16;
            int i10 = ((50 * i2) - (i6 * i)) >> 16;
            i6 = ((3500 * i) + (i8 * i2)) >> 16;
            i = ((i2 * 3500) - (i * i8)) >> 16;
            i2 = cj.bk(i5, i10, i4, i3, (byte) 0);
            i10 = ((i10 * i4) + (i3 * i5)) >> 16;
            int bk = cj.bk(i7, i, i4, i3, (byte) 0);
            i = ((i * i4) + (i3 * i7)) >> 16;
            as = -1411610103 * ((i2 + bk) / 2);
            ar = ((i6 + i9) / 2) * 538204334;
            aj = 323771819 * ((i10 + i) / 2);
            ae = ((bk - i2) / 2) * -516965823;
            nb.aq = ((i6 - i9) / 2) * -2059736647;
            jc.am = ((i - i10) / 2) * 1874378326;
            et.at = Math.abs(-185772607 * ae) * 455777963;
            ch.ab = Math.abs(nb.aq * 2043038857) * 179975325;
            gl.aw = Math.abs(jc.am * 1570526057) * -1673626853;
        }
    }

    static final boolean bm(cl clVar, int i, int i2, int i3, cn cnVar) {
        if (!an) {
            return false;
        }
        bc.aq(cnVar.bf, 143420760);
        int i4 = clVar.bk + i;
        int i5 = clVar.by + i2;
        int i6 = clVar.bn + i3;
        int i7 = clVar.ba;
        int i8 = clVar.bl;
        int i9 = clVar.bd;
        i4 = (-1860397235 * as) - i4;
        i5 = (343041604 * ar) - i5;
        i6 = (1822668035 * aj) - i6;
        if (Math.abs(i4) > (et.at * 1497686983) + i7) {
            return false;
        }
        if (Math.abs(i5) > (-1966739019 * ch.ab) + i8) {
            return false;
        }
        if (Math.abs(i6) > (2101877851 * gl.aw) + i9) {
            return false;
        }
        if (Math.abs(((nb.aq * 2043038857) * i6) - ((1499032267 * jc.am) * i5)) > ((ch.ab * -1966739019) * i9) + ((gl.aw * 772467910) * i8)) {
            return false;
        }
        if (Math.abs(((-1090871127 * jc.am) * i4) - (i6 * (-185772607 * ae))) > (i9 * (1497686983 * et.at)) + ((gl.aw * 1367273011) * i7)) {
            return false;
        }
        if (Math.abs((i5 * (-185772607 * ae)) - (i4 * (nb.aq * -1951369948))) > ((1497686983 * et.at) * i8) + ((ch.ab * -32641290) * i7)) {
            return false;
        }
        return true;
    }

    static final boolean bs(cl clVar, int i, int i2, int i3, cn cnVar) {
        if (!an) {
            return false;
        }
        bc.aq(cnVar.bf, 263745733);
        int i4 = clVar.bk + i;
        int i5 = clVar.by + i2;
        int i6 = clVar.bn + i3;
        int i7 = clVar.ba;
        int i8 = clVar.bl;
        int i9 = clVar.bd;
        i4 = (-2086919111 * as) - i4;
        i5 = (276416693 * ar) - i5;
        i6 = (1822668035 * aj) - i6;
        if (Math.abs(i4) > (et.at * 1497686983) + i7) {
            return false;
        }
        if (Math.abs(i5) > (-1966739019 * ch.ab) + i8) {
            return false;
        }
        if (Math.abs(i6) > (2101877851 * gl.aw) + i9) {
            return false;
        }
        if (Math.abs(((nb.aq * 2043038857) * i6) - ((1499032267 * jc.am) * i5)) > ((ch.ab * -1966739019) * i9) + ((gl.aw * 2101877851) * i8)) {
            return false;
        }
        if (Math.abs(((1499032267 * jc.am) * i4) - (i6 * (-185772607 * ae))) > (i9 * (1497686983 * et.at)) + ((gl.aw * 2101877851) * i7)) {
            return false;
        }
        if (Math.abs((i5 * (-185772607 * ae)) - (i4 * (nb.aq * 2043038857))) > ((1497686983 * et.at) * i8) + ((ch.ab * -1966739019) * i7)) {
            return false;
        }
        return true;
    }

    static final boolean br(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = (ag * 340086283) + i7;
        if (i8 < i && i8 < i2 && i8 < i3) {
            return false;
        }
        i8 = (-1312301177 * ag) - i7;
        if (i8 > i && i8 > i2 && i8 > i3) {
            return false;
        }
        i8 = (-429386291 * aa) + i7;
        if (i8 < i4 && i8 < i5 && i8 < i6) {
            return false;
        }
        i8 = (-758794784 * aa) - i7;
        if (i8 <= i4 || i8 <= i5 || i8 <= i6) {
            return true;
        }
        return false;
    }

    static final boolean ez(ac acVar, short s) {
        try {
            if (acVar.fv == null) {
                return false;
            }
            for (int i = 0; i < acVar.fv.length; i++) {
                int ee = cj.ee(acVar, i, -1274375699);
                int i2 = acVar.fk[i];
                if (acVar.fv[i] == 2) {
                    if (ee >= i2) {
                        return false;
                    }
                } else if (acVar.fv[i] == 3) {
                    if (ee <= i2) {
                        return false;
                    }
                } else if (4 == acVar.fv[i]) {
                    if (ee == i2) {
                        return false;
                    }
                } else if (i2 != ee) {
                    return false;
                }
            }
            return true;
        } catch (Throwable e) {
            throw ba.ad(e, "cs.ez(" + ')');
        }
    }
}
