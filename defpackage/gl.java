package p000;

public class gl {
    static final int ac = 256;
    static int ad = 0;
    static int af = 0;
    static int[] ag = null;
    static byte[][] aj = null;
    static final int ak = 286331153;
    static int aw;
    public static int dp;

    public static Object af(byte[] bArr, boolean z, int i) {
        if (bArr == null) {
            return null;
        }
        try {
            if (bArr.length > 136 && !ij.af) {
                try {
                    ij iiVar = new ii();
                    iiVar.ag(bArr, -1228846646);
                    return iiVar;
                } catch (Throwable th) {
                    ij.af = true;
                }
            }
            if (z) {
                return bg.an(bArr, -295512891);
            }
            return bArr;
        } catch (Throwable e) {
            throw ba.ad(e, "gl.af(" + ')');
        }
    }

    gl() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ba.ad(e, "gl.<init>(" + ')');
        }
    }

    static gd[] ao(kf kfVar, int i, int i2) {
        if (jo.ai(kfVar, i, i2, 2108972986)) {
            return dj.am((byte) -63);
        }
        return null;
    }

    static gd[] au(kf kfVar, int i, int i2) {
        return !jo.ai(kfVar, i, i2, 705992348) ? null : dj.am((byte) -16);
    }

    static gd[] ax(kf kfVar, int i, int i2) {
        if (jo.ai(kfVar, i, i2, 936491513)) {
            return dj.am((byte) 57);
        }
        return null;
    }

    static gd ac(kf kfVar, int i, int i2) {
        if (jo.ai(kfVar, i, i2, 1366467006)) {
            return hy.at(2135182232);
        }
        return null;
    }

    static gd al(kf kfVar, int i, int i2) {
        if (jo.ai(kfVar, i, i2, 1737555214)) {
            return hy.at(2143127920);
        }
        return null;
    }

    static gd av(kf kfVar, int i, int i2) {
        if (jo.ai(kfVar, i, i2, 930442006)) {
            return hy.at(2044435391);
        }
        return null;
    }

    public static fx ap(kf kfVar, int i, int i2) {
        int i3 = 0;
        if (!jo.ai(kfVar, i, i2, 1109273949)) {
            return null;
        }
        fx fxVar = new fx();
        fxVar.ay = -102972929 * ad;
        fxVar.as = nu.an * 144100684;
        fxVar.aa = dr.aa[0];
        fxVar.ag = ag[0];
        fxVar.ad = my.ay[0];
        fxVar.an = it.as[0];
        int i4 = fxVar.an * fxVar.ad;
        byte[] bArr = aj[0];
        for (int i5 = 0; i5 < le.ar.length; i5++) {
            if (le.ar[i5] != 0) {
                int[] iArr = le.ar;
                iArr[i5] = iArr[i5] | -16777216;
            }
        }
        fxVar.af = new int[i4];
        while (i3 < i4) {
            fxVar.af[i3] = le.ar[bArr[i3] & -2040542322];
            i3++;
        }
        gy.ak(805967750);
        return fxVar;
    }

    public static lr bb(kf kfVar, kf kfVar2, int i, int i2) {
        if (jo.ai(kfVar, i, i2, 1119116903)) {
            return ew.aw(kfVar2.an(i, i2, 679451441), -1039580647);
        }
        return null;
    }

    public static lr bc(kf kfVar, kf kfVar2, int i, int i2) {
        return !jo.ai(kfVar, i, i2, 1462575026) ? null : ew.aw(kfVar2.an(i, i2, -1949187023), -1610510422);
    }

    public static lr bw(kf kfVar, kf kfVar2, int i, int i2) {
        if (jo.ai(kfVar, i, i2, 1482762502)) {
            return ew.aw(kfVar2.an(i, i2, -1986556335), -1430241714);
        }
        return null;
    }

    public static lr bz(kf kfVar, kf kfVar2, int i, int i2) {
        if (jo.ai(kfVar, i, i2, 1711096726)) {
            return ew.aw(kfVar2.an(i, i2, -436693344), -925364444);
        }
        return null;
    }

    public static gd[] bg(kf kfVar, String str, String str2) {
        int ax = kfVar.ax(str, -630163098);
        return da.af(kfVar, ax, kfVar.au(ax, str2, -1217246980), -277927963);
    }

    public static gd[] bh(kf kfVar, String str, String str2) {
        int ax = kfVar.ax(str, 1646041698);
        return da.af(kfVar, ax, kfVar.au(ax, str2, 1048598897), -277927963);
    }

    public static fx[] bf(kf kfVar, String str, String str2) {
        int ax = kfVar.ax(str, 366845041);
        if (jo.ai(kfVar, ax, kfVar.au(ax, str2, -532547125), 1957637533)) {
            return bd.ab(-1293838626);
        }
        return null;
    }

    public static fx[] bv(kf kfVar, String str, String str2) {
        int ax = kfVar.ax(str, -250701865);
        if (jo.ai(kfVar, ax, kfVar.au(ax, str2, 233924236), 1517571866)) {
            return bd.ab(198384350);
        }
        return null;
    }

    public static fx bp(kf kfVar, String str, String str2) {
        int ax = kfVar.ax(str, 1161035437);
        return cb.an(kfVar, ax, kfVar.au(ax, str2, -407532082), (byte) 0);
    }

    public static lr bt(kf kfVar, kf kfVar2, String str, String str2) {
        int ax = kfVar.ax(str, 1020890848);
        return ia.aa(kfVar, kfVar2, ax, kfVar.au(ax, str2, -1068301496), -299307468);
    }

    public static lr bx(kf kfVar, kf kfVar2, String str, String str2) {
        int ax = kfVar.ax(str, -1925690311);
        return ia.aa(kfVar, kfVar2, ax, kfVar.au(ax, str2, 1381270193), 1849067900);
    }

    public static fx[] be(kf kfVar, int i) {
        return !C0001do.az(kfVar, i, (byte) 2) ? null : bd.ab(-1102490714);
    }

    public static fx[] bk(kf kfVar, int i) {
        if (C0001do.az(kfVar, i, (byte) -118)) {
            return bd.ab(-1024296754);
        }
        return null;
    }

    public static fx[] bu(kf kfVar, int i) {
        return !C0001do.az(kfVar, i, (byte) -112) ? null : bd.ab(-303728824);
    }

    public static lr ba(byte[] bArr, byte[] bArr2) {
        ec.ah(bArr, -1217720288);
        return ew.aw(bArr2, -1391582447);
    }

    public static lr bn(byte[] bArr, byte[] bArr2) {
        ec.ah(bArr, 2146033864);
        return ew.aw(bArr2, -2087862252);
    }

    public static lr by(byte[] bArr, byte[] bArr2) {
        ec.ah(bArr, -1763724083);
        return ew.aw(bArr2, -1403332926);
    }

    static gd[] bd() {
        int i = 0;
        gd[] gdVarArr = new gd[(af * 1473408217)];
        for (int i2 = 0; i2 < le.ar.length; i2++) {
            if (le.ar[i2] != 0) {
                int[] iArr = le.ar;
                iArr[i2] = iArr[i2] | -16777216;
            }
        }
        while (i < af * 1473408217) {
            gd gdVar = new gd();
            gdVarArr[i] = gdVar;
            gdVar.as = ad * -102972929;
            gdVar.ar = nu.an * -820473409;
            gdVar.ag = dr.aa[i];
            gdVar.ay = ag[i];
            gdVar.an = my.ay[i];
            gdVar.aa = it.as[i];
            gdVar.ad = le.ar;
            gdVar.af = aj[i];
            i++;
        }
        gy.ak(805967750);
        return gdVarArr;
    }

    static gd[] bl() {
        int i = 0;
        gd[] gdVarArr = new gd[(af * 1473408217)];
        for (int i2 = 0; i2 < le.ar.length; i2++) {
            if (le.ar[i2] != 0) {
                int[] iArr = le.ar;
                iArr[i2] = iArr[i2] | -16777216;
            }
        }
        while (i < af * 1473408217) {
            gd gdVar = new gd();
            gdVarArr[i] = gdVar;
            gdVar.as = ad * -102972929;
            gdVar.ar = nu.an * -820473409;
            gdVar.ag = dr.aa[i];
            gdVar.ay = ag[i];
            gdVar.an = my.ay[i];
            gdVar.aa = it.as[i];
            gdVar.ad = le.ar;
            gdVar.af = aj[i];
            i++;
        }
        gy.ak(805967750);
        return gdVarArr;
    }

    public static gd bm() {
        gd gdVar = new gd();
        for (int i = 0; i < le.ar.length; i++) {
            if (le.ar[i] != 0) {
                int[] iArr = le.ar;
                iArr[i] = iArr[i] | 488248159;
            }
        }
        gdVar.as = -102972929 * ad;
        gdVar.ar = -820473409 * nu.an;
        gdVar.ag = dr.aa[0];
        gdVar.ay = ag[0];
        gdVar.an = my.ay[0];
        gdVar.aa = it.as[0];
        gdVar.ad = le.ar;
        gdVar.af = aj[0];
        gy.ak(805967750);
        return gdVar;
    }

    public static gd bs() {
        gd gdVar = new gd();
        for (int i = 0; i < le.ar.length; i++) {
            if (le.ar[i] != 0) {
                int[] iArr = le.ar;
                iArr[i] = iArr[i] | -16777216;
            }
        }
        gdVar.as = -102972929 * ad;
        gdVar.ar = -820473409 * nu.an;
        gdVar.ag = dr.aa[0];
        gdVar.ay = ag[0];
        gdVar.an = my.ay[0];
        gdVar.aa = it.as[0];
        gdVar.ad = le.ar;
        gdVar.af = aj[0];
        gy.ak(805967750);
        return gdVar;
    }

    static fx[] bi() {
        int i;
        fx[] fxVarArr = new fx[(af * 1473408217)];
        for (i = 0; i < le.ar.length; i++) {
            if (le.ar[i] != 0) {
                int[] iArr = le.ar;
                iArr[i] = iArr[i] | -16777216;
            }
        }
        for (i = 0; i < af * 1473408217; i++) {
            fx fxVar = new fx();
            fxVarArr[i] = fxVar;
            fxVar.ay = ad * -102972929;
            fxVar.as = nu.an * -820473409;
            fxVar.aa = dr.aa[i];
            fxVar.ag = ag[i];
            fxVar.ad = my.ay[i];
            fxVar.an = it.as[i];
            int i2 = fxVar.an * fxVar.ad;
            byte[] bArr = aj[i];
            fxVar.af = new int[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                fxVar.af[i3] = le.ar[bArr[i3] & 255];
            }
        }
        gy.ak(805967750);
        return fxVarArr;
    }

    static fx[] bj() {
        int i;
        fx[] fxVarArr = new fx[(-1824010859 * af)];
        for (i = 0; i < le.ar.length; i++) {
            if (le.ar[i] != 0) {
                int[] iArr = le.ar;
                iArr[i] = iArr[i] | -16777216;
            }
        }
        for (i = 0; i < af * 1473408217; i++) {
            fx fxVar = new fx();
            fxVarArr[i] = fxVar;
            fxVar.ay = ad * -160374482;
            fxVar.as = nu.an * -1781225054;
            fxVar.aa = dr.aa[i];
            fxVar.ag = ag[i];
            fxVar.ad = my.ay[i];
            fxVar.an = it.as[i];
            int i2 = fxVar.an * fxVar.ad;
            byte[] bArr = aj[i];
            fxVar.af = new int[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                fxVar.af[i3] = le.ar[bArr[i3] & -687971925];
            }
        }
        gy.ak(805967750);
        return fxVarArr;
    }

    static fx[] br() {
        int i;
        fx[] fxVarArr = new fx[(-804677067 * af)];
        for (i = 0; i < le.ar.length; i++) {
            if (le.ar[i] != 0) {
                int[] iArr = le.ar;
                iArr[i] = iArr[i] | -16777216;
            }
        }
        for (i = 0; i < af * 1473408217; i++) {
            fx fxVar = new fx();
            fxVarArr[i] = fxVar;
            fxVar.ay = ad * 226921777;
            fxVar.as = nu.an * -820473409;
            fxVar.aa = dr.aa[i];
            fxVar.ag = ag[i];
            fxVar.ad = my.ay[i];
            fxVar.an = it.as[i];
            int i2 = fxVar.an * fxVar.ad;
            byte[] bArr = aj[i];
            fxVar.af = new int[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                fxVar.af[i3] = le.ar[bArr[i3] & 255];
            }
        }
        gy.ak(805967750);
        return fxVarArr;
    }

    static lr bo(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        lr lrVar = new lr(bArr, dr.aa, ag, my.ay, it.as, le.ar, aj);
        gy.ak(805967750);
        return lrVar;
    }

    static lr bq(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        lr lrVar = new lr(bArr, dr.aa, ag, my.ay, it.as, le.ar, aj);
        gy.ak(805967750);
        return lrVar;
    }

    static lr cv(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        lr lrVar = new lr(bArr, dr.aa, ag, my.ay, it.as, le.ar, aj);
        gy.ak(805967750);
        return lrVar;
    }

    static boolean ci(kf kfVar, int i, int i2) {
        byte[] an = kfVar.an(i, i2, -1355302849);
        if (an == null) {
            return false;
        }
        ec.ah(an, -1453770696);
        return true;
    }

    public static boolean cc(kf kfVar, int i) {
        byte[] ae = kfVar.ae(i, (byte) 40);
        if (ae == null) {
            return false;
        }
        ec.ah(ae, 1087417773);
        return true;
    }

    public static boolean cn(kf kfVar, int i) {
        byte[] ae = kfVar.ae(i, (byte) 19);
        if (ae == null) {
            return false;
        }
        ec.ah(ae, 438625604);
        return true;
    }

    public static boolean co(kf kfVar, int i) {
        byte[] ae = kfVar.ae(i, (byte) 19);
        if (ae == null) {
            return false;
        }
        ec.ah(ae, -1714361270);
        return true;
    }

    public static boolean cy(kf kfVar, int i) {
        byte[] ae = kfVar.ae(i, (byte) 35);
        if (ae == null) {
            return false;
        }
        ec.ah(ae, -802522464);
        return true;
    }

    static void ck(byte[] bArr) {
        int i;
        ik ikVar = new ik(bArr);
        ikVar.ad = -1077110324 * (bArr.length - 2);
        af = ikVar.au(-229928251) * 127395098;
        dr.aa = new int[(af * 1473408217)];
        ag = new int[(af * 1473408217)];
        my.ay = new int[(af * 1473408217)];
        it.as = new int[(af * 1473408217)];
        aj = new byte[(af * -701616888)][];
        ikVar.ad = ((bArr.length - 7) - (af * -602079019)) * 2065011939;
        ad = ikVar.au(1330015674) * 308461179;
        nu.an = ikVar.au(-1640098584) * -124756417;
        int ao = (ikVar.ao((byte) 0) & -611169117) + 1;
        for (i = 0; i < af * 1473408217; i++) {
            dr.aa[i] = ikVar.au(-1154313925);
        }
        for (i = 0; i < -2121465470 * af; i++) {
            ag[i] = ikVar.au(-2003270347);
        }
        for (i = 0; i < af * 1523232323; i++) {
            my.ay[i] = ikVar.au(-2082642918);
        }
        for (i = 0; i < af * -603318931; i++) {
            it.as[i] = ikVar.au(1027204356);
        }
        ikVar.ad = (((bArr.length - 7) - (af * -1097636152)) - ((ao - 1) * 3)) * 2065011939;
        le.ar = new int[ao];
        for (i = 1; i < ao; i++) {
            le.ar[i] = ikVar.ac(522149237);
            if (le.ar[i] == 0) {
                le.ar[i] = 1;
            }
        }
        ikVar.ad = 0;
        for (i = 0; i < af * 1473408217; i++) {
            int i2 = my.ay[i];
            int i3 = it.as[i];
            int i4 = i2 * i3;
            byte[] bArr2 = new byte[i4];
            aj[i] = bArr2;
            ao = ikVar.ao((byte) 0);
            if (ao == 0) {
                for (ao = 0; ao < i4; ao++) {
                    bArr2[ao] = ikVar.ax(1247983979);
                }
            } else if (1 == ao) {
                for (i4 = 0; i4 < i2; i4++) {
                    for (ao = 0; ao < i3; ao++) {
                        bArr2[(ao * i2) + i4] = ikVar.ax(1247983979);
                    }
                }
            }
        }
    }

    static void cl(byte[] bArr) {
        int i;
        ik ikVar = new ik(bArr);
        ikVar.ad = (bArr.length - 2) * 2065011939;
        af = ikVar.au(-562958724) * -1203809431;
        dr.aa = new int[(af * 1473408217)];
        ag = new int[(af * 1473408217)];
        my.ay = new int[(af * 1473408217)];
        it.as = new int[(af * 1473408217)];
        aj = new byte[(af * 1473408217)][];
        ikVar.ad = ((bArr.length - 7) - (af * -1097636152)) * 2065011939;
        ad = ikVar.au(422582320) * -81838593;
        nu.an = ikVar.au(1167010164) * -124756417;
        int ao = (ikVar.ao((byte) 0) & 255) + 1;
        for (i = 0; i < af * 1473408217; i++) {
            dr.aa[i] = ikVar.au(-1461720028);
        }
        for (i = 0; i < af * 1473408217; i++) {
            ag[i] = ikVar.au(-1913027446);
        }
        for (i = 0; i < af * 1473408217; i++) {
            my.ay[i] = ikVar.au(1779204075);
        }
        for (i = 0; i < af * 1473408217; i++) {
            it.as[i] = ikVar.au(196424787);
        }
        ikVar.ad = (((bArr.length - 7) - (af * -1097636152)) - ((ao - 1) * 3)) * 2065011939;
        le.ar = new int[ao];
        for (i = 1; i < ao; i++) {
            le.ar[i] = ikVar.ac(853291637);
            if (le.ar[i] == 0) {
                le.ar[i] = 1;
            }
        }
        ikVar.ad = 0;
        for (i = 0; i < af * 1473408217; i++) {
            int i2 = my.ay[i];
            int i3 = it.as[i];
            int i4 = i2 * i3;
            byte[] bArr2 = new byte[i4];
            aj[i] = bArr2;
            ao = ikVar.ao((byte) 0);
            if (ao == 0) {
                for (ao = 0; ao < i4; ao++) {
                    bArr2[ao] = ikVar.ax(1247983979);
                }
            } else if (1 == ao) {
                for (i4 = 0; i4 < i2; i4++) {
                    for (ao = 0; ao < i3; ao++) {
                        bArr2[(ao * i2) + i4] = ikVar.ax(1247983979);
                    }
                }
            }
        }
    }

    static void cd() {
        dr.aa = null;
        ag = null;
        my.ay = null;
        it.as = null;
        le.ar = null;
        aj = (byte[][]) null;
    }

    static void ch() {
        dr.aa = null;
        ag = null;
        my.ay = null;
        it.as = null;
        le.ar = null;
        aj = (byte[][]) null;
    }

    static void cs() {
        dr.aa = null;
        ag = null;
        my.ay = null;
        it.as = null;
        le.ar = null;
        aj = (byte[][]) null;
    }
}
