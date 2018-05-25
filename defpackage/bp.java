package p000;

public final class bp {
    int aa;
    int ab;
    int ad;
    int ae;
    int af;
    int ag;
    int ah;
    int ai;
    int aj;
    int am;
    int an;
    int aq;
    int ar;
    int as;
    int at;
    int aw;
    int ay;
    int az;

    static int ad(int i, int i2, int i3) {
        int i4 = 0;
        try {
            ho hoVar = (ho) ho.af.af((long) i);
            if (hoVar != null) {
                if (-1 != i2) {
                    for (int i5 = 0; i5 < hoVar.an.length; i5++) {
                        if (hoVar.ad[i5] == i2) {
                            i4 += hoVar.an[i5];
                        }
                    }
                }
            }
            return i4;
        } catch (Throwable e) {
            throw ba.ad(e, "bp.ad(" + ')');
        }
    }

    bp() {
        try {
        } catch (Throwable e) {
            throw ba.ad(e, "bp.<init>(" + ')');
        }
    }

    public static fx ar(kf kfVar, String str, String str2, byte b) {
        try {
            int ax = kfVar.ax(str, -471188350);
            return cb.an(kfVar, ax, kfVar.au(ax, str2, 138188633), (byte) 0);
        } catch (Throwable e) {
            throw ba.ad(e, "bp.ar(" + ')');
        }
    }

    static int an(int i, int i2, int i3) {
        long j = (long) ((i << 16) + i2);
        try {
            if (ff.ab == null || j != ff.ab.fy) {
                return 0;
            }
            return ((-1652867455 * bc.ai.ad) / (bc.ai.af.length - ff.ab.an)) + 1;
        } catch (Throwable e) {
            throw ba.ad(e, "bp.an(" + ')');
        }
    }

    static final int be(int i, int i2, int i3, int i4, int i5) {
        return ((i3 * i) + (i4 * i2)) >> 16;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final void as(p000.ia r21, int r22) {
        /*
        r2 = 0;
        r14 = r2;
    L_0x0002:
        r2 = p000.gw.at;	 Catch:{ RuntimeException -> 0x0198 }
        r3 = 482038467; // 0x1cbb52c3 float:1.2396015E-21 double:2.381586465E-315;
        r2 = r2 * r3;
        if (r14 >= r2) goto L_0x0541;
    L_0x000a:
        r2 = p000.gw.ab;	 Catch:{ RuntimeException -> 0x0198 }
        r15 = r2[r14];	 Catch:{ RuntimeException -> 0x0198 }
        r2 = p000.client.hb;	 Catch:{ RuntimeException -> 0x0198 }
        r2 = r2[r15];	 Catch:{ RuntimeException -> 0x0198 }
        r3 = 0;
        r0 = r21;
        r3 = r0.ao(r3);	 Catch:{ RuntimeException -> 0x0198 }
        r4 = r3 & 1;
        if (r4 == 0) goto L_0x0542;
    L_0x001d:
        r4 = 0;
        r0 = r21;
        r4 = r0.ao(r4);	 Catch:{ RuntimeException -> 0x0198 }
        r4 = r4 << 8;
        r3 = r3 + r4;
        r13 = r3;
    L_0x0028:
        r11 = -1;
        r3 = r13 & 512;
        if (r3 == 0) goto L_0x0087;
    L_0x002d:
        r3 = -1005835619; // 0xffffffffc40c2a9d float:-560.66583 double:NaN;
        r0 = r21;
        r3 = r0.cy(r3);	 Catch:{ RuntimeException -> 0x0198 }
        r4 = -2015474731; // 0xffffffff87de4bd5 float:-3.3447418E-34 double:NaN;
        r3 = r3 * r4;
        r2.cf = r3;	 Catch:{ RuntimeException -> 0x0198 }
        r3 = 1411925854; // 0x5428475e float:2.89100739E12 double:6.97584059E-315;
        r0 = r21;
        r3 = r0.al(r3);	 Catch:{ RuntimeException -> 0x0198 }
        r4 = r3 >> 16;
        r5 = -2073088321; // 0xffffffff846f2ebf float:-2.811578E-36 double:NaN;
        r4 = r4 * r5;
        r2.cg = r4;	 Catch:{ RuntimeException -> 0x0198 }
        r4 = 243104753; // 0xe7d7bf1 float:3.1244333E-30 double:1.20109707E-315;
        r5 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        r3 = r3 & r5;
        r5 = 1581849891; // 0x5e491d23 float:3.62294441E18 double:7.81537688E-315;
        r6 = p000.client.ak;	 Catch:{ RuntimeException -> 0x0198 }
        r5 = r5 * r6;
        r3 = r3 + r5;
        r3 = r3 * r4;
        r2.ce = r3;	 Catch:{ RuntimeException -> 0x0198 }
        r3 = 0;
        r2.cz = r3;	 Catch:{ RuntimeException -> 0x0198 }
        r3 = 0;
        r2.cr = r3;	 Catch:{ RuntimeException -> 0x0198 }
        r3 = r2.ce;	 Catch:{ RuntimeException -> 0x0198 }
        r4 = 645928209; // 0x26801511 float:8.887494E-16 double:3.191309377E-315;
        r3 = r3 * r4;
        r4 = p000.client.ak;	 Catch:{ RuntimeException -> 0x0198 }
        r5 = 1581849891; // 0x5e491d23 float:3.62294441E18 double:7.81537688E-315;
        r4 = r4 * r5;
        if (r3 <= r4) goto L_0x0077;
    L_0x0072:
        r3 = 367216679; // 0x15e34827 float:9.1798406E-26 double:1.814291457E-315;
        r2.cz = r3;	 Catch:{ RuntimeException -> 0x0198 }
    L_0x0077:
        r3 = r2.cf;	 Catch:{ RuntimeException -> 0x0198 }
        r4 = 269129085; // 0x100a957d float:2.7330863E-29 double:1.32967435E-315;
        r3 = r3 * r4;
        r4 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r3 != r4) goto L_0x0087;
    L_0x0082:
        r3 = 2015474731; // 0x7821b42b float:1.3118969E34 double:9.957768246E-315;
        r2.cf = r3;	 Catch:{ RuntimeException -> 0x0198 }
    L_0x0087:
        r3 = r13 & 256;
        if (r3 == 0) goto L_0x0093;
    L_0x008b:
        r3 = -70;
        r0 = r21;
        r11 = r0.bq(r3);	 Catch:{ RuntimeException -> 0x0198 }
    L_0x0093:
        r3 = r13 & 128;
        if (r3 == 0) goto L_0x00b6;
    L_0x0097:
        r3 = -867819452; // 0xffffffffcc462044 float:-5.1937552E7 double:NaN;
        r0 = r21;
        r3 = r0.ck(r3);	 Catch:{ RuntimeException -> 0x0198 }
        r4 = 1968525927; // 0x75555267 float:2.7041761E32 double:9.725810335E-315;
        r3 = r3 * r4;
        r2.ck = r3;	 Catch:{ RuntimeException -> 0x0198 }
        r3 = r2.ck;	 Catch:{ RuntimeException -> 0x0198 }
        r4 = -609375913; // 0xffffffffdbada957 float:-9.7762724E16 double:NaN;
        r3 = r3 * r4;
        r4 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r3 != r4) goto L_0x00b6;
    L_0x00b1:
        r3 = -1968525927; // 0xffffffff8aaaad99 float:-1.6435705E-32 double:NaN;
        r2.ck = r3;	 Catch:{ RuntimeException -> 0x0198 }
    L_0x00b6:
        r3 = r13 & 64;
        if (r3 == 0) goto L_0x00db;
    L_0x00ba:
        r3 = 0;
        r0 = r21;
        r3 = r0.ao(r3);	 Catch:{ RuntimeException -> 0x0198 }
        r4 = new byte[r3];	 Catch:{ RuntimeException -> 0x0198 }
        r5 = new ik;	 Catch:{ RuntimeException -> 0x0198 }
        r5.<init>(r4);	 Catch:{ RuntimeException -> 0x0198 }
        r6 = 0;
        r7 = -1562068619; // 0xffffffffa2e4b975 float:-6.1995884E-18 double:NaN;
        r0 = r21;
        r0.dj(r4, r6, r3, r7);	 Catch:{ RuntimeException -> 0x0198 }
        r3 = p000.gw.ag;	 Catch:{ RuntimeException -> 0x0198 }
        r3[r15] = r5;	 Catch:{ RuntimeException -> 0x0198 }
        r3 = -2134558627; // 0xffffffff80c5385d float:-1.8111812E-38 double:NaN;
        r2.af(r5, r3);	 Catch:{ RuntimeException -> 0x0198 }
    L_0x00db:
        r3 = r13 & 32;
        if (r3 == 0) goto L_0x01b3;
    L_0x00df:
        r3 = 1576393144; // 0x5df5d9b8 float:2.21442411E18 double:7.78841697E-315;
        r0 = r21;
        r12 = r0.br(r3);	 Catch:{ RuntimeException -> 0x0198 }
        if (r12 <= 0) goto L_0x0144;
    L_0x00ea:
        r3 = 0;
        r10 = r3;
    L_0x00ec:
        if (r10 >= r12) goto L_0x0144;
    L_0x00ee:
        r5 = -1;
        r4 = -1;
        r6 = -1;
        r3 = 47;
        r0 = r21;
        r3 = r0.bf(r3);	 Catch:{ RuntimeException -> 0x0198 }
        r7 = 32767; // 0x7fff float:4.5916E-41 double:1.6189E-319;
        if (r7 != r3) goto L_0x0135;
    L_0x00fd:
        r3 = 100;
        r0 = r21;
        r3 = r0.bf(r3);	 Catch:{ RuntimeException -> 0x0198 }
        r4 = 67;
        r0 = r21;
        r4 = r0.bf(r4);	 Catch:{ RuntimeException -> 0x0198 }
        r5 = 61;
        r0 = r21;
        r5 = r0.bf(r5);	 Catch:{ RuntimeException -> 0x0198 }
        r6 = 23;
        r0 = r21;
        r6 = r0.bf(r6);	 Catch:{ RuntimeException -> 0x0198 }
    L_0x011d:
        r7 = 36;
        r0 = r21;
        r8 = r0.bf(r7);	 Catch:{ RuntimeException -> 0x0198 }
        r7 = 1581849891; // 0x5e491d23 float:3.62294441E18 double:7.81537688E-315;
        r9 = p000.client.ak;	 Catch:{ RuntimeException -> 0x0198 }
        r7 = r7 * r9;
        r9 = -1638817307; // 0xffffffff9e51a1e5 float:-1.1097847E-20 double:NaN;
        r2.bj(r3, r4, r5, r6, r7, r8, r9);	 Catch:{ RuntimeException -> 0x0198 }
        r3 = r10 + 1;
        r10 = r3;
        goto L_0x00ec;
    L_0x0135:
        r7 = 32766; // 0x7ffe float:4.5915E-41 double:1.61886E-319;
        if (r3 == r7) goto L_0x0142;
    L_0x0139:
        r4 = 12;
        r0 = r21;
        r4 = r0.bf(r4);	 Catch:{ RuntimeException -> 0x0198 }
        goto L_0x011d;
    L_0x0142:
        r3 = -1;
        goto L_0x011d;
    L_0x0144:
        r3 = 0;
        r0 = r21;
        r12 = r0.ao(r3);	 Catch:{ RuntimeException -> 0x0198 }
        if (r12 <= 0) goto L_0x01b3;
    L_0x014d:
        r3 = 0;
        r10 = r3;
    L_0x014f:
        if (r10 >= r12) goto L_0x01b3;
    L_0x0151:
        r3 = 24;
        r0 = r21;
        r3 = r0.bf(r3);	 Catch:{ RuntimeException -> 0x0198 }
        r4 = 59;
        r0 = r21;
        r5 = r0.bf(r4);	 Catch:{ RuntimeException -> 0x0198 }
        r4 = 32767; // 0x7fff float:4.5916E-41 double:1.6189E-319;
        if (r4 == r5) goto L_0x0191;
    L_0x0165:
        r4 = 51;
        r0 = r21;
        r6 = r0.bf(r4);	 Catch:{ RuntimeException -> 0x0198 }
        r4 = 736990482; // 0x2bed9512 float:1.6881238E-12 double:3.641216785E-315;
        r0 = r21;
        r7 = r0.br(r4);	 Catch:{ RuntimeException -> 0x0198 }
        if (r5 <= 0) goto L_0x018f;
    L_0x0178:
        r4 = -1575896008; // 0xffffffffa211bc38 float:-1.9750807E-18 double:NaN;
        r0 = r21;
        r8 = r0.bi(r4);	 Catch:{ RuntimeException -> 0x0198 }
    L_0x0181:
        r4 = 1581849891; // 0x5e491d23 float:3.62294441E18 double:7.81537688E-315;
        r9 = p000.client.ak;	 Catch:{ RuntimeException -> 0x0198 }
        r4 = r4 * r9;
        r9 = 0;
        r2.bi(r3, r4, r5, r6, r7, r8, r9);	 Catch:{ RuntimeException -> 0x0198 }
    L_0x018b:
        r3 = r10 + 1;
        r10 = r3;
        goto L_0x014f;
    L_0x018f:
        r8 = r7;
        goto L_0x0181;
    L_0x0191:
        r4 = 1723956826; // 0x66c17e5a float:4.5687375E23 double:8.517478426E-315;
        r2.bq(r3, r4);	 Catch:{ RuntimeException -> 0x0198 }
        goto L_0x018b;
    L_0x0198:
        r2 = move-exception;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "bp.as(";
        r3 = r3.append(r4);
        r4 = 41;
        r3 = r3.append(r4);
        r3 = r3.toString();
        r2 = p000.ba.ad(r2, r3);
        throw r2;
    L_0x01b3:
        r3 = r13 & 4;
        if (r3 == 0) goto L_0x01db;
    L_0x01b7:
        r3 = -1062003388; // 0xffffffffc0b31d44 float:-5.5973225 double:NaN;
        r0 = r21;
        r3 = r0.au(r3);	 Catch:{ RuntimeException -> 0x0198 }
        r4 = 464408867; // 0x1bae5123 float:2.8838319E-22 double:2.29448467E-315;
        r3 = r3 * r4;
        r2.cs = r3;	 Catch:{ RuntimeException -> 0x0198 }
        r3 = r2.dl;	 Catch:{ RuntimeException -> 0x0198 }
        r4 = 761444243; // 0x2d62b793 float:1.2887374E-11 double:3.762034417E-315;
        r3 = r3 * r4;
        if (r3 != 0) goto L_0x01db;
    L_0x01ce:
        r3 = r2.cs;	 Catch:{ RuntimeException -> 0x0198 }
        r4 = 981885035; // 0x3a86606b float:0.0010252123 double:4.85115664E-315;
        r3 = r3 * r4;
        r2.dz = r3;	 Catch:{ RuntimeException -> 0x0198 }
        r3 = -464408867; // 0xffffffffe451aedd float:-1.5471879E22 double:NaN;
        r2.cs = r3;	 Catch:{ RuntimeException -> 0x0198 }
    L_0x01db:
        r3 = r13 & 4096;
        if (r3 == 0) goto L_0x01eb;
    L_0x01df:
        r3 = p000.gw.aa;	 Catch:{ RuntimeException -> 0x0198 }
        r4 = -29;
        r0 = r21;
        r4 = r0.bq(r4);	 Catch:{ RuntimeException -> 0x0198 }
        r3[r15] = r4;	 Catch:{ RuntimeException -> 0x0198 }
    L_0x01eb:
        r3 = r13 & 2048;
        if (r3 == 0) goto L_0x029b;
    L_0x01ef:
        r3 = 1247983979; // 0x4a62b96b float:3714650.8 double:6.165860106E-315;
        r0 = r21;
        r3 = r0.ax(r3);	 Catch:{ RuntimeException -> 0x0198 }
        r4 = 1177469221; // 0x462ec125 float:11184.286 double:5.81747091E-315;
        r3 = r3 * r4;
        r2.cw = r3;	 Catch:{ RuntimeException -> 0x0198 }
        r3 = 79;
        r0 = r21;
        r3 = r0.bq(r3);	 Catch:{ RuntimeException -> 0x0198 }
        r4 = -153025727; // 0xfffffffff6e10341 float:-2.2819E33 double:NaN;
        r3 = r3 * r4;
        r2.cu = r3;	 Catch:{ RuntimeException -> 0x0198 }
        r3 = 1247983979; // 0x4a62b96b float:3714650.8 double:6.165860106E-315;
        r0 = r21;
        r3 = r0.ax(r3);	 Catch:{ RuntimeException -> 0x0198 }
        r4 = 533146735; // 0x1fc72c6f float:8.435329E-20 double:2.63409486E-315;
        r3 = r3 * r4;
        r2.cx = r3;	 Catch:{ RuntimeException -> 0x0198 }
        r3 = 1247983979; // 0x4a62b96b float:3714650.8 double:6.165860106E-315;
        r0 = r21;
        r3 = r0.ax(r3);	 Catch:{ RuntimeException -> 0x0198 }
        r4 = -1865694973; // 0xffffffff90cbc103 float:-8.0366764E-29 double:NaN;
        r3 = r3 * r4;
        r2.ca = r3;	 Catch:{ RuntimeException -> 0x0198 }
        r3 = 1017960951; // 0x3cacd9f7 float:0.021100027 double:5.029395347E-315;
        r0 = r21;
        r3 = r0.au(r3);	 Catch:{ RuntimeException -> 0x0198 }
        r4 = p000.client.ak;	 Catch:{ RuntimeException -> 0x0198 }
        r5 = 1581849891; // 0x5e491d23 float:3.62294441E18 double:7.81537688E-315;
        r4 = r4 * r5;
        r3 = r3 + r4;
        r4 = 1386585013; // 0x52a59bb5 float:3.55640967E11 double:6.8506402E-315;
        r3 = r3 * r4;
        r2.dj = r3;	 Catch:{ RuntimeException -> 0x0198 }
        r3 = -924561298; // 0xffffffffc8e4506e float:-467587.44 double:NaN;
        r0 = r21;
        r3 = r0.ck(r3);	 Catch:{ RuntimeException -> 0x0198 }
        r4 = p000.client.ak;	 Catch:{ RuntimeException -> 0x0198 }
        r5 = 1581849891; // 0x5e491d23 float:3.62294441E18 double:7.81537688E-315;
        r4 = r4 * r5;
        r3 = r3 + r4;
        r4 = -511796865; // 0xffffffffe17e997f float:-2.9353335E20 double:NaN;
        r3 = r3 * r4;
        r2.dc = r3;	 Catch:{ RuntimeException -> 0x0198 }
        r3 = -1478756997; // 0xffffffffa7dbf57b float:-6.105086E-15 double:NaN;
        r0 = r21;
        r3 = r0.ck(r3);	 Catch:{ RuntimeException -> 0x0198 }
        r4 = 814763455; // 0x30904dbf float:1.0499476E-9 double:4.025466326E-315;
        r3 = r3 * r4;
        r2.dk = r3;	 Catch:{ RuntimeException -> 0x0198 }
        r3 = r2.bb;	 Catch:{ RuntimeException -> 0x0198 }
        if (r3 == 0) goto L_0x0486;
    L_0x0269:
        r3 = r2.cw;	 Catch:{ RuntimeException -> 0x0198 }
        r4 = r2.bc;	 Catch:{ RuntimeException -> 0x0198 }
        r5 = 1226261927; // 0x491745a7 float:619610.44 double:6.05853891E-315;
        r4 = r4 * r5;
        r3 = r3 + r4;
        r2.cw = r3;	 Catch:{ RuntimeException -> 0x0198 }
        r3 = r2.cu;	 Catch:{ RuntimeException -> 0x0198 }
        r4 = r2.bz;	 Catch:{ RuntimeException -> 0x0198 }
        r5 = -1172262661; // 0xffffffffba20b0fb float:-6.129888E-4 double:NaN;
        r4 = r4 * r5;
        r3 = r3 + r4;
        r2.cu = r3;	 Catch:{ RuntimeException -> 0x0198 }
        r3 = r2.cx;	 Catch:{ RuntimeException -> 0x0198 }
        r4 = r2.bc;	 Catch:{ RuntimeException -> 0x0198 }
        r5 = 615654389; // 0x24b223f5 float:7.725611E-17 double:3.041736833E-315;
        r4 = r4 * r5;
        r3 = r3 + r4;
        r2.cx = r3;	 Catch:{ RuntimeException -> 0x0198 }
        r3 = r2.ca;	 Catch:{ RuntimeException -> 0x0198 }
        r4 = r2.bz;	 Catch:{ RuntimeException -> 0x0198 }
        r5 = 112692913; // 0x6b78eb1 float:6.9046615E-35 double:5.5677697E-316;
        r4 = r4 * r5;
        r3 = r3 + r4;
        r2.ca = r3;	 Catch:{ RuntimeException -> 0x0198 }
        r3 = 0;
        r2.dl = r3;	 Catch:{ RuntimeException -> 0x0198 }
    L_0x0298:
        r3 = 0;
        r2.dw = r3;	 Catch:{ RuntimeException -> 0x0198 }
    L_0x029b:
        r3 = r13 & 16;
        if (r3 == 0) goto L_0x040a;
    L_0x029f:
        r3 = -820369669; // 0xffffffffcf1a26fb float:-2.58624589E9 double:NaN;
        r0 = r21;
        r16 = r0.ck(r3);	 Catch:{ RuntimeException -> 0x0198 }
        r3 = 6;
        r3 = new p000.ju[r3];	 Catch:{ RuntimeException -> 0x0198 }
        r4 = 0;
        r5 = p000.ju.ad;	 Catch:{ RuntimeException -> 0x0198 }
        r3[r4] = r5;	 Catch:{ RuntimeException -> 0x0198 }
        r4 = 1;
        r5 = p000.ju.af;	 Catch:{ RuntimeException -> 0x0198 }
        r3[r4] = r5;	 Catch:{ RuntimeException -> 0x0198 }
        r4 = 2;
        r5 = p000.ju.an;	 Catch:{ RuntimeException -> 0x0198 }
        r3[r4] = r5;	 Catch:{ RuntimeException -> 0x0198 }
        r4 = 3;
        r5 = p000.ju.aa;	 Catch:{ RuntimeException -> 0x0198 }
        r3[r4] = r5;	 Catch:{ RuntimeException -> 0x0198 }
        r4 = 4;
        r5 = p000.ju.ag;	 Catch:{ RuntimeException -> 0x0198 }
        r3[r4] = r5;	 Catch:{ RuntimeException -> 0x0198 }
        r4 = 5;
        r5 = p000.ju.ay;	 Catch:{ RuntimeException -> 0x0198 }
        r3[r4] = r5;	 Catch:{ RuntimeException -> 0x0198 }
        r4 = -1345818157; // 0xffffffffafc871d3 float:-3.6460665E-10 double:NaN;
        r0 = r21;
        r4 = r0.bi(r4);	 Catch:{ RuntimeException -> 0x0198 }
        r5 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        r3 = p000.bx.af(r3, r4, r5);	 Catch:{ RuntimeException -> 0x0198 }
        r0 = r3;
        r0 = (p000.ju) r0;	 Catch:{ RuntimeException -> 0x0198 }
        r10 = r0;
        r3 = 257556920; // 0xf5a01b8 float:1.0748561E-29 double:1.27250026E-315;
        r0 = r21;
        r3 = r0.bi(r3);	 Catch:{ RuntimeException -> 0x0198 }
        r4 = 1;
        if (r3 != r4) goto L_0x04c5;
    L_0x02e8:
        r3 = 1;
        r12 = r3;
    L_0x02ea:
        r3 = -855829634; // 0xffffffffccfd137e float:-1.32684784E8 double:NaN;
        r0 = r21;
        r17 = r0.bi(r3);	 Catch:{ RuntimeException -> 0x0198 }
        r3 = 1978945739; // 0x75f450cb float:6.1941363E32 double:9.777291046E-315;
        r0 = r21;
        r4 = r0.ad;	 Catch:{ RuntimeException -> 0x0198 }
        r18 = r3 * r4;
        r3 = r2.af;	 Catch:{ RuntimeException -> 0x0198 }
        if (r3 == 0) goto L_0x0400;
    L_0x0300:
        r3 = r2.ad;	 Catch:{ RuntimeException -> 0x0198 }
        if (r3 == 0) goto L_0x0400;
    L_0x0304:
        r3 = 0;
        r4 = r10.ae;	 Catch:{ RuntimeException -> 0x0198 }
        if (r4 == 0) goto L_0x0316;
    L_0x0309:
        r4 = p000.dm.ow;	 Catch:{ RuntimeException -> 0x0198 }
        r5 = r2.af;	 Catch:{ RuntimeException -> 0x0198 }
        r6 = -126; // 0xffffffffffffff82 float:NaN double:NaN;
        r4 = r4.as(r5, r6);	 Catch:{ RuntimeException -> 0x0198 }
        if (r4 == 0) goto L_0x0316;
    L_0x0315:
        r3 = 1;
    L_0x0316:
        if (r3 != 0) goto L_0x0400;
    L_0x0318:
        r3 = p000.client.hm;	 Catch:{ RuntimeException -> 0x0198 }
        r4 = 783729645; // 0x2eb6c3ed float:8.311205E-11 double:3.87213893E-315;
        r3 = r3 * r4;
        if (r3 != 0) goto L_0x0400;
    L_0x0320:
        r3 = r2.av;	 Catch:{ RuntimeException -> 0x0198 }
        if (r3 != 0) goto L_0x0400;
    L_0x0324:
        r3 = p000.gw.aw;	 Catch:{ RuntimeException -> 0x0198 }
        r4 = 0;
        r3.ad = r4;	 Catch:{ RuntimeException -> 0x0198 }
        r3 = p000.gw.aw;	 Catch:{ RuntimeException -> 0x0198 }
        r3 = r3.af;	 Catch:{ RuntimeException -> 0x0198 }
        r4 = 0;
        r5 = -72;
        r0 = r21;
        r1 = r17;
        r0.cu(r3, r4, r1, r5);	 Catch:{ RuntimeException -> 0x0198 }
        r3 = p000.gw.aw;	 Catch:{ RuntimeException -> 0x0198 }
        r4 = 0;
        r3.ad = r4;	 Catch:{ RuntimeException -> 0x0198 }
        r19 = p000.gw.aw;	 Catch:{ RuntimeException -> 0x0198 }
        r3 = 8;
        r0 = r19;
        r8 = r0.bf(r3);	 Catch:{ Exception -> 0x04c9 }
        r3 = 32767; // 0x7fff float:4.5916E-41 double:1.6189E-319;
        if (r8 <= r3) goto L_0x034c;
    L_0x034a:
        r8 = 32767; // 0x7fff float:4.5916E-41 double:1.6189E-319;
    L_0x034c:
        r6 = new byte[r8];	 Catch:{ Exception -> 0x04c9 }
        r0 = r19;
        r0 = r0.ad;	 Catch:{ Exception -> 0x04c9 }
        r20 = r0;
        r3 = p000.lh.af;	 Catch:{ Exception -> 0x04c9 }
        r0 = r19;
        r4 = r0.af;	 Catch:{ Exception -> 0x04c9 }
        r0 = r19;
        r5 = r0.ad;	 Catch:{ Exception -> 0x04c9 }
        r7 = 1978945739; // 0x75f450cb float:6.1941363E32 double:9.777291046E-315;
        r5 = r5 * r7;
        r7 = 0;
        r9 = 1810093772; // 0x6be3d6cc float:5.5088102E26 double:8.943051485E-315;
        r3 = r3.ad(r4, r5, r6, r7, r8, r9);	 Catch:{ Exception -> 0x04c9 }
        r4 = 2065011939; // 0x7b1594e3 float:7.76672E35 double:1.0202514573E-314;
        r3 = r3 * r4;
        r3 = r3 + r20;
        r0 = r19;
        r0.ad = r3;	 Catch:{ Exception -> 0x04c9 }
        r3 = 0;
        r4 = -1880242583; // 0xffffffff8fedc669 float:-2.3446429E-29 double:NaN;
        r3 = p000.kf.aa(r6, r3, r8, r4);	 Catch:{ Exception -> 0x04c9 }
    L_0x037c:
        r4 = 678093770; // 0x286ae3ca float:1.3039003E-14 double:3.350228364E-315;
        r3 = p000.lx.am(r3, r4);	 Catch:{ RuntimeException -> 0x0198 }
        r4 = p000.lr.ar(r3);	 Catch:{ RuntimeException -> 0x0198 }
        r3 = r4.trim();	 Catch:{ RuntimeException -> 0x0198 }
        r2.bl = r3;	 Catch:{ RuntimeException -> 0x0198 }
        r3 = r16 >> 8;
        r5 = 169672723; // 0xa1d0013 float:7.559289E-33 double:8.38294635E-316;
        r3 = r3 * r5;
        r2.br = r3;	 Catch:{ RuntimeException -> 0x0198 }
        r0 = r16;
        r3 = r0 & 255;
        r5 = -2058240637; // 0xffffffff8551bd83 float:-9.8619406E-36 double:NaN;
        r3 = r3 * r5;
        r2.bj = r3;	 Catch:{ RuntimeException -> 0x0198 }
        r3 = -309974418; // 0xffffffffed862a6e float:-5.190286E27 double:NaN;
        r2.bm = r3;	 Catch:{ RuntimeException -> 0x0198 }
        r2.bd = r12;	 Catch:{ RuntimeException -> 0x0198 }
        r3 = p000.gf.ho;	 Catch:{ RuntimeException -> 0x0198 }
        if (r3 == r2) goto L_0x04ce;
    L_0x03aa:
        r3 = r10.ae;	 Catch:{ RuntimeException -> 0x0198 }
        if (r3 == 0) goto L_0x04ce;
    L_0x03ae:
        r3 = p000.client.li;	 Catch:{ RuntimeException -> 0x0198 }
        r5 = "";
        if (r3 == r5) goto L_0x04ce;
    L_0x03b4:
        r3 = r4.toLowerCase();	 Catch:{ RuntimeException -> 0x0198 }
        r5 = p000.client.li;	 Catch:{ RuntimeException -> 0x0198 }
        r3 = r3.indexOf(r5);	 Catch:{ RuntimeException -> 0x0198 }
        r5 = -1;
        if (r3 != r5) goto L_0x04ce;
    L_0x03c1:
        r3 = 1;
    L_0x03c2:
        r2.bs = r3;	 Catch:{ RuntimeException -> 0x0198 }
        r3 = r10.aj;	 Catch:{ RuntimeException -> 0x0198 }
        if (r3 == 0) goto L_0x04d4;
    L_0x03c8:
        if (r12 == 0) goto L_0x04d1;
    L_0x03ca:
        r3 = 91;
    L_0x03cc:
        r5 = 1675619249; // 0x63dfebb1 float:8.2612146E21 double:8.278659064E-315;
        r6 = r10.ar;	 Catch:{ RuntimeException -> 0x0198 }
        r5 = r5 * r6;
        r6 = -1;
        if (r5 == r6) goto L_0x04dd;
    L_0x03d5:
        r5 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x0198 }
        r5.<init>();	 Catch:{ RuntimeException -> 0x0198 }
        r6 = 1675619249; // 0x63dfebb1 float:8.2612146E21 double:8.278659064E-315;
        r7 = r10.ar;	 Catch:{ RuntimeException -> 0x0198 }
        r6 = r6 * r7;
        r7 = -4;
        r6 = p000.bo.af(r6, r7);	 Catch:{ RuntimeException -> 0x0198 }
        r5 = r5.append(r6);	 Catch:{ RuntimeException -> 0x0198 }
        r6 = r2.af;	 Catch:{ RuntimeException -> 0x0198 }
        r7 = -1105652119; // 0xffffffffbe191669 float:-0.14949955 double:NaN;
        r6 = r6.af(r7);	 Catch:{ RuntimeException -> 0x0198 }
        r5 = r5.append(r6);	 Catch:{ RuntimeException -> 0x0198 }
        r5 = r5.toString();	 Catch:{ RuntimeException -> 0x0198 }
        r6 = 999846153; // 0x3b987109 float:0.0046521467 double:4.939896353E-315;
        p000.ax.af(r3, r5, r4, r6);	 Catch:{ RuntimeException -> 0x0198 }
    L_0x0400:
        r3 = 2065011939; // 0x7b1594e3 float:7.76672E35 double:1.0202514573E-314;
        r4 = r17 + r18;
        r3 = r3 * r4;
        r0 = r21;
        r0.ad = r3;	 Catch:{ RuntimeException -> 0x0198 }
    L_0x040a:
        r3 = r13 & 2;
        if (r3 == 0) goto L_0x044d;
    L_0x040e:
        r3 = 902754203; // 0x35ceef9b float:1.541793E-6 double:4.460198383E-315;
        r0 = r21;
        r3 = r0.bc(r3);	 Catch:{ RuntimeException -> 0x0198 }
        r2.bl = r3;	 Catch:{ RuntimeException -> 0x0198 }
        r3 = r2.bl;	 Catch:{ RuntimeException -> 0x0198 }
        r4 = 0;
        r3 = r3.charAt(r4);	 Catch:{ RuntimeException -> 0x0198 }
        r4 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        if (r3 != r4) goto L_0x04ee;
    L_0x0424:
        r3 = r2.bl;	 Catch:{ RuntimeException -> 0x0198 }
        r4 = 1;
        r3 = r3.substring(r4);	 Catch:{ RuntimeException -> 0x0198 }
        r2.bl = r3;	 Catch:{ RuntimeException -> 0x0198 }
        r3 = 2;
        r4 = r2.af;	 Catch:{ RuntimeException -> 0x0198 }
        r5 = 1687894680; // 0x649b3a98 float:2.290774E22 double:8.33930775E-315;
        r4 = r4.af(r5);	 Catch:{ RuntimeException -> 0x0198 }
        r5 = r2.bl;	 Catch:{ RuntimeException -> 0x0198 }
        r6 = 1296003480; // 0x4d3f7198 float:2.00743296E8 double:6.403107964E-315;
        p000.ax.af(r3, r4, r5, r6);	 Catch:{ RuntimeException -> 0x0198 }
    L_0x043f:
        r3 = 0;
        r2.bd = r3;	 Catch:{ RuntimeException -> 0x0198 }
        r3 = 0;
        r2.br = r3;	 Catch:{ RuntimeException -> 0x0198 }
        r3 = 0;
        r2.bj = r3;	 Catch:{ RuntimeException -> 0x0198 }
        r3 = -309974418; // 0xffffffffed862a6e float:-5.190286E27 double:NaN;
        r2.bm = r3;	 Catch:{ RuntimeException -> 0x0198 }
    L_0x044d:
        r3 = r13 & 8;
        if (r3 == 0) goto L_0x046e;
    L_0x0451:
        r3 = -1852429445; // 0xffffffff91962b7b float:-2.3692624E-28 double:NaN;
        r0 = r21;
        r3 = r0.ck(r3);	 Catch:{ RuntimeException -> 0x0198 }
        r4 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r4 != r3) goto L_0x0460;
    L_0x045f:
        r3 = -1;
    L_0x0460:
        r4 = -921002307; // 0xffffffffc91a9ebd float:-633323.8 double:NaN;
        r0 = r21;
        r4 = r0.bj(r4);	 Catch:{ RuntimeException -> 0x0198 }
        r5 = 41;
        p000.hb.cn(r2, r3, r4, r5);	 Catch:{ RuntimeException -> 0x0198 }
    L_0x046e:
        r3 = r13 & 1024;
        if (r3 == 0) goto L_0x0506;
    L_0x0472:
        r3 = 0;
    L_0x0473:
        r4 = 3;
        if (r3 >= r4) goto L_0x0506;
    L_0x0476:
        r4 = r2.as;	 Catch:{ RuntimeException -> 0x0198 }
        r5 = 665944217; // 0x27b18099 float:4.9266795E-15 double:3.290201597E-315;
        r0 = r21;
        r5 = r0.bc(r5);	 Catch:{ RuntimeException -> 0x0198 }
        r4[r3] = r5;	 Catch:{ RuntimeException -> 0x0198 }
        r3 = r3 + 1;
        goto L_0x0473;
    L_0x0486:
        r3 = r2.cw;	 Catch:{ RuntimeException -> 0x0198 }
        r4 = 1177469221; // 0x462ec125 float:11184.286 double:5.81747091E-315;
        r5 = r2.di;	 Catch:{ RuntimeException -> 0x0198 }
        r6 = 0;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x0198 }
        r4 = r4 * r5;
        r3 = r3 + r4;
        r2.cw = r3;	 Catch:{ RuntimeException -> 0x0198 }
        r3 = r2.cu;	 Catch:{ RuntimeException -> 0x0198 }
        r4 = r2.da;	 Catch:{ RuntimeException -> 0x0198 }
        r5 = 0;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x0198 }
        r5 = -153025727; // 0xfffffffff6e10341 float:-2.2819E33 double:NaN;
        r4 = r4 * r5;
        r3 = r3 + r4;
        r2.cu = r3;	 Catch:{ RuntimeException -> 0x0198 }
        r3 = r2.cx;	 Catch:{ RuntimeException -> 0x0198 }
        r4 = r2.di;	 Catch:{ RuntimeException -> 0x0198 }
        r5 = 0;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x0198 }
        r5 = 533146735; // 0x1fc72c6f float:8.435329E-20 double:2.63409486E-315;
        r4 = r4 * r5;
        r3 = r3 + r4;
        r2.cx = r3;	 Catch:{ RuntimeException -> 0x0198 }
        r3 = r2.ca;	 Catch:{ RuntimeException -> 0x0198 }
        r4 = r2.da;	 Catch:{ RuntimeException -> 0x0198 }
        r5 = 0;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x0198 }
        r5 = -1865694973; // 0xffffffff90cbc103 float:-8.0366764E-29 double:NaN;
        r4 = r4 * r5;
        r3 = r3 + r4;
        r2.ca = r3;	 Catch:{ RuntimeException -> 0x0198 }
        r3 = -521273701; // 0xffffffffe0edfe9b float:-1.3719452E20 double:NaN;
        r2.dl = r3;	 Catch:{ RuntimeException -> 0x0198 }
        goto L_0x0298;
    L_0x04c5:
        r3 = 0;
        r12 = r3;
        goto L_0x02ea;
    L_0x04c9:
        r3 = move-exception;
        r3 = "Cabbage";
        goto L_0x037c;
    L_0x04ce:
        r3 = 0;
        goto L_0x03c2;
    L_0x04d1:
        r3 = 1;
        goto L_0x03cc;
    L_0x04d4:
        if (r12 == 0) goto L_0x04da;
    L_0x04d6:
        r3 = 90;
        goto L_0x03cc;
    L_0x04da:
        r3 = 2;
        goto L_0x03cc;
    L_0x04dd:
        r5 = r2.af;	 Catch:{ RuntimeException -> 0x0198 }
        r6 = -48184690; // 0xfffffffffd20c28e float:-1.3355417E37 double:NaN;
        r5 = r5.af(r6);	 Catch:{ RuntimeException -> 0x0198 }
        r6 = 933702572; // 0x37a72bac float:1.9928288E-5 double:4.613103643E-315;
        p000.ax.af(r3, r5, r4, r6);	 Catch:{ RuntimeException -> 0x0198 }
        goto L_0x0400;
    L_0x04ee:
        r3 = p000.gf.ho;	 Catch:{ RuntimeException -> 0x0198 }
        if (r3 != r2) goto L_0x043f;
    L_0x04f2:
        r3 = 2;
        r4 = r2.af;	 Catch:{ RuntimeException -> 0x0198 }
        r5 = 1349766460; // 0x5073cd3c float:1.63612549E10 double:6.66873238E-315;
        r4 = r4.af(r5);	 Catch:{ RuntimeException -> 0x0198 }
        r5 = r2.bl;	 Catch:{ RuntimeException -> 0x0198 }
        r6 = 1050589564; // 0x3e9eb97c float:0.31000888 double:5.190602115E-315;
        p000.ax.af(r3, r4, r5, r6);	 Catch:{ RuntimeException -> 0x0198 }
        goto L_0x043f;
    L_0x0506:
        r3 = r2.bb;	 Catch:{ RuntimeException -> 0x0198 }
        if (r3 == 0) goto L_0x0520;
    L_0x050a:
        r3 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        if (r11 != r3) goto L_0x0525;
    L_0x050e:
        r3 = r2.bc;	 Catch:{ RuntimeException -> 0x0198 }
        r4 = 589656027; // 0x23256fdb float:8.968354E-18 double:2.91328786E-315;
        r3 = r3 * r4;
        r4 = r2.bz;	 Catch:{ RuntimeException -> 0x0198 }
        r5 = -1060785861; // 0xffffffffc0c5b13b float:-6.1778846 double:NaN;
        r4 = r4 * r5;
        r5 = -2063937617; // 0xffffffff84facfaf float:-5.8965445E-36 double:NaN;
        r2.at(r3, r4, r5);	 Catch:{ RuntimeException -> 0x0198 }
    L_0x0520:
        r2 = r14 + 1;
        r14 = r2;
        goto L_0x0002;
    L_0x0525:
        r3 = -1;
        if (r11 == r3) goto L_0x053c;
    L_0x0528:
        r3 = r11;
    L_0x0529:
        r4 = r2.bc;	 Catch:{ RuntimeException -> 0x0198 }
        r5 = 589656027; // 0x23256fdb float:8.968354E-18 double:2.91328786E-315;
        r4 = r4 * r5;
        r5 = r2.bz;	 Catch:{ RuntimeException -> 0x0198 }
        r6 = -1060785861; // 0xffffffffc0c5b13b float:-6.1778846 double:NaN;
        r5 = r5 * r6;
        r6 = -834829682; // 0xffffffffce3d828e float:-7.9486246E8 double:NaN;
        r2.am(r4, r5, r3, r6);	 Catch:{ RuntimeException -> 0x0198 }
        goto L_0x0520;
    L_0x053c:
        r3 = p000.gw.aa;	 Catch:{ RuntimeException -> 0x0198 }
        r3 = r3[r15];	 Catch:{ RuntimeException -> 0x0198 }
        goto L_0x0529;
    L_0x0541:
        return;
    L_0x0542:
        r13 = r3;
        goto L_0x0028;
        */
        throw new UnsupportedOperationException("Method not decompiled: bp.as(ia, int):void");
    }
}
