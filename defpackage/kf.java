package p000;

public abstract class kf {
    static ib ab = new ib();
    static final String af = ",";
    static int ah = 0;
    static final int lr = 100;
    int[] aa;
    int ad;
    int[][] ae;
    lk ag;
    boolean ai;
    int[][] aj;
    Object[] am;
    int[] an;
    lk[] aq;
    int[] ar;
    int[] as;
    Object[][] at;
    public int aw;
    int[] ay;
    boolean az;

    kf(boolean z, boolean z2) {
        try {
            this.ai = z;
            this.az = z2;
        } catch (Throwable e) {
            throw ba.ad(e, "kf.<init>(" + ')');
        }
    }

    void af(byte[] bArr, int i) {
        try {
            this.aw = hm.af(bArr, bArr.length, (byte) 2) * -1968198093;
            ik ikVar = new ik(lm.bc(bArr, (byte) 97));
            int ao = ikVar.ao((byte) 0);
            if (ao < 5 || ao > 7) {
                throw new RuntimeException("");
            }
            int i2;
            int i3;
            int i4;
            if (ao >= 6) {
                ikVar.al(-357634893);
            }
            int ao2 = ikVar.ao((byte) 0);
            if (ao >= 7) {
                this.ad = ikVar.bp((byte) 0) * 1641978221;
            } else {
                this.ad = ikVar.au(-1627888275) * 1641978221;
            }
            int i5 = 0;
            this.an = new int[(1110464613 * this.ad)];
            if (ao >= 7) {
                i2 = -1;
                for (i3 = 0; i3 < 1110464613 * this.ad; i3++) {
                    i5 += ikVar.bp((byte) 0);
                    this.an[i3] = i5;
                    if (this.an[i3] > i2) {
                        i2 = this.an[i3];
                    }
                }
                i4 = i2;
            } else {
                i2 = -1;
                for (i3 = 0; i3 < 1110464613 * this.ad; i3++) {
                    i5 += ikVar.au(1016503742);
                    this.an[i3] = i5;
                    if (this.an[i3] > i2) {
                        i2 = this.an[i3];
                    }
                }
                i4 = i2;
            }
            this.ay = new int[(i4 + 1)];
            this.as = new int[(i4 + 1)];
            this.ar = new int[(i4 + 1)];
            this.aj = new int[(i4 + 1)][];
            this.am = new Object[(i4 + 1)];
            this.at = new Object[(i4 + 1)][];
            if (ao2 != 0) {
                this.aa = new int[(i4 + 1)];
                for (i2 = 0; i2 < 1110464613 * this.ad; i2++) {
                    this.aa[this.an[i2]] = ikVar.al(507103575);
                }
                this.ag = new lk(this.aa);
            }
            for (i2 = 0; i2 < this.ad * 1110464613; i2++) {
                this.ay[this.an[i2]] = ikVar.al(83659099);
            }
            for (i2 = 0; i2 < 1110464613 * this.ad; i2++) {
                this.as[this.an[i2]] = ikVar.al(1277496428);
            }
            for (i2 = 0; i2 < 1110464613 * this.ad; i2++) {
                this.ar[this.an[i2]] = ikVar.au(355722031);
            }
            int i6;
            int i7;
            if (ao >= 7) {
                for (ao = 0; ao < 1110464613 * this.ad; ao++) {
                    i6 = this.an[ao];
                    i7 = this.ar[i6];
                    this.aj[i6] = new int[i7];
                    i2 = -1;
                    i3 = 0;
                    for (i5 = 0; i5 < i7; i5++) {
                        i3 += ikVar.bp((byte) 0);
                        this.aj[i6][i5] = i3;
                        if (i3 > i2) {
                            i2 = i3;
                        }
                    }
                    this.at[i6] = new Object[(i2 + 1)];
                }
            } else {
                for (ao = 0; ao < 1110464613 * this.ad; ao++) {
                    i6 = this.an[ao];
                    i7 = this.ar[i6];
                    this.aj[i6] = new int[i7];
                    i2 = -1;
                    i3 = 0;
                    for (i5 = 0; i5 < i7; i5++) {
                        i3 += ikVar.au(-1086216764);
                        this.aj[i6][i5] = i3;
                        if (i3 > i2) {
                            i2 = i3;
                        }
                    }
                    this.at[i6] = new Object[(i2 + 1)];
                }
            }
            if (ao2 != 0) {
                this.ae = new int[(i4 + 1)][];
                this.aq = new lk[(i4 + 1)];
                for (i3 = 0; i3 < 1110464613 * this.ad; i3++) {
                    i5 = this.an[i3];
                    ao = this.ar[i5];
                    this.ae[i5] = new int[this.at[i5].length];
                    for (i2 = 0; i2 < ao; i2++) {
                        this.ae[i5][this.aj[i5][i2]] = ikVar.al(-1117248933);
                    }
                    this.aq[i5] = new lk(this.ae[i5]);
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "kf.af(" + ')');
        }
    }

    void bg(byte[] bArr) {
        this.aw = hm.af(bArr, bArr.length, (byte) 2) * 1054629742;
        ik ikVar = new ik(lm.bc(bArr, (byte) 18));
        int ao = ikVar.ao((byte) 0);
        if (ao < 5 || ao > 7) {
            throw new RuntimeException("");
        }
        int i;
        int i2;
        int i3;
        if (ao >= 6) {
            ikVar.al(1745731048);
        }
        int ao2 = ikVar.ao((byte) 0);
        if (ao >= 7) {
            this.ad = ikVar.bp((byte) 0) * 1566209516;
        } else {
            this.ad = ikVar.au(-1348780523) * 1641978221;
        }
        this.an = new int[(this.ad * 1110464613)];
        if (ao >= 7) {
            i = -1;
            i2 = 0;
            for (i3 = 0; i3 < this.ad * 1110464613; i3++) {
                i2 += ikVar.bp((byte) 0);
                this.an[i3] = i2;
                if (this.an[i3] > i) {
                    i = this.an[i3];
                }
            }
        } else {
            i = -1;
            i2 = 0;
            for (i3 = 0; i3 < this.ad * 1110464613; i3++) {
                i2 += ikVar.au(-730996034);
                this.an[i3] = i2;
                if (this.an[i3] > i) {
                    i = this.an[i3];
                }
            }
        }
        this.ay = new int[(i + 1)];
        this.as = new int[(i + 1)];
        this.ar = new int[(i + 1)];
        this.aj = new int[(i + 1)][];
        this.am = new Object[(i + 1)];
        this.at = new Object[(i + 1)][];
        if (ao2 != 0) {
            this.aa = new int[(i + 1)];
            for (i3 = 0; i3 < -515961999 * this.ad; i3++) {
                this.aa[this.an[i3]] = ikVar.al(-1001216243);
            }
            this.ag = new lk(this.aa);
        }
        for (i3 = 0; i3 < this.ad * -1349696117; i3++) {
            this.ay[this.an[i3]] = ikVar.al(298434558);
        }
        for (i3 = 0; i3 < this.ad * 1110464613; i3++) {
            this.as[this.an[i3]] = ikVar.al(314174411);
        }
        for (i3 = 0; i3 < this.ad * 1110464613; i3++) {
            this.ar[this.an[i3]] = ikVar.au(-2062106068);
        }
        int i4;
        int i5;
        int i6;
        if (ao >= 7) {
            for (i3 = 0; i3 < 1808154865 * this.ad; i3++) {
                i4 = this.an[i3];
                i5 = this.ar[i4];
                this.aj[i4] = new int[i5];
                i2 = -1;
                ao = 0;
                for (i6 = 0; i6 < i5; i6++) {
                    ao += ikVar.bp((byte) 0);
                    this.aj[i4][i6] = ao;
                    if (ao > i2) {
                        i2 = ao;
                    }
                }
                this.at[i4] = new Object[(i2 + 1)];
            }
        } else {
            for (i3 = 0; i3 < this.ad * 1110464613; i3++) {
                i4 = this.an[i3];
                i5 = this.ar[i4];
                this.aj[i4] = new int[i5];
                i2 = -1;
                ao = 0;
                for (i6 = 0; i6 < i5; i6++) {
                    ao += ikVar.au(757096167);
                    this.aj[i4][i6] = ao;
                    if (ao > i2) {
                        i2 = ao;
                    }
                }
                this.at[i4] = new Object[(i2 + 1)];
            }
        }
        if (ao2 != 0) {
            this.ae = new int[(i + 1)][];
            this.aq = new lk[(i + 1)];
            for (i3 = 0; i3 < this.ad * 1110464613; i3++) {
                int i7 = this.an[i3];
                i2 = this.ar[i7];
                this.ae[i7] = new int[this.at[i7].length];
                for (i = 0; i < i2; i++) {
                    this.ae[i7][this.aj[i7][i]] = ikVar.al(1144022478);
                }
                this.aq[i7] = new lk(this.ae[i7]);
            }
        }
    }

    void bz(byte[] bArr) {
        this.aw = hm.af(bArr, bArr.length, (byte) 2) * -1968198093;
        ik ikVar = new ik(lm.bc(bArr, (byte) 77));
        int ao = ikVar.ao((byte) 0);
        if (ao < 5 || ao > 7) {
            throw new RuntimeException("");
        }
        int i;
        int i2;
        int i3;
        if (ao >= 6) {
            ikVar.al(1364444965);
        }
        int ao2 = ikVar.ao((byte) 0);
        if (ao >= 7) {
            this.ad = ikVar.bp((byte) 0) * 1641978221;
        } else {
            this.ad = ikVar.au(-420559347) * 1641978221;
        }
        this.an = new int[(this.ad * 1110464613)];
        if (ao >= 7) {
            i = -1;
            i2 = 0;
            for (i3 = 0; i3 < this.ad * 1110464613; i3++) {
                i2 += ikVar.bp((byte) 0);
                this.an[i3] = i2;
                if (this.an[i3] > i) {
                    i = this.an[i3];
                }
            }
        } else {
            i = -1;
            i2 = 0;
            for (i3 = 0; i3 < this.ad * 1110464613; i3++) {
                i2 += ikVar.au(472426349);
                this.an[i3] = i2;
                if (this.an[i3] > i) {
                    i = this.an[i3];
                }
            }
        }
        this.ay = new int[(i + 1)];
        this.as = new int[(i + 1)];
        this.ar = new int[(i + 1)];
        this.aj = new int[(i + 1)][];
        this.am = new Object[(i + 1)];
        this.at = new Object[(i + 1)][];
        if (ao2 != 0) {
            this.aa = new int[(i + 1)];
            for (i3 = 0; i3 < this.ad * 1110464613; i3++) {
                this.aa[this.an[i3]] = ikVar.al(231751411);
            }
            this.ag = new lk(this.aa);
        }
        for (i3 = 0; i3 < this.ad * 1110464613; i3++) {
            this.ay[this.an[i3]] = ikVar.al(-594948215);
        }
        for (i3 = 0; i3 < this.ad * 1110464613; i3++) {
            this.as[this.an[i3]] = ikVar.al(2051211034);
        }
        for (i3 = 0; i3 < this.ad * 1110464613; i3++) {
            this.ar[this.an[i3]] = ikVar.au(1798488917);
        }
        int i4;
        int i5;
        int i6;
        if (ao >= 7) {
            for (i3 = 0; i3 < this.ad * 1110464613; i3++) {
                i4 = this.an[i3];
                i5 = this.ar[i4];
                this.aj[i4] = new int[i5];
                i2 = -1;
                ao = 0;
                for (i6 = 0; i6 < i5; i6++) {
                    ao += ikVar.bp((byte) 0);
                    this.aj[i4][i6] = ao;
                    if (ao > i2) {
                        i2 = ao;
                    }
                }
                this.at[i4] = new Object[(i2 + 1)];
            }
        } else {
            for (i3 = 0; i3 < this.ad * 1110464613; i3++) {
                i4 = this.an[i3];
                i5 = this.ar[i4];
                this.aj[i4] = new int[i5];
                i2 = -1;
                ao = 0;
                for (i6 = 0; i6 < i5; i6++) {
                    ao += ikVar.au(-1820196364);
                    this.aj[i4][i6] = ao;
                    if (ao > i2) {
                        i2 = ao;
                    }
                }
                this.at[i4] = new Object[(i2 + 1)];
            }
        }
        if (ao2 != 0) {
            this.ae = new int[(i + 1)][];
            this.aq = new lk[(i + 1)];
            for (i3 = 0; i3 < this.ad * 1110464613; i3++) {
                int i7 = this.an[i3];
                i2 = this.ar[i7];
                this.ae[i7] = new int[this.at[i7].length];
                for (i = 0; i < i2; i++) {
                    this.ae[i7][this.aj[i7][i]] = ikVar.al(-311826180);
                }
                this.aq[i7] = new lk(this.ae[i7]);
            }
        }
    }

    void ad(int i, int i2) {
    }

    void bf(int i) {
    }

    void bh(int i) {
    }

    void bv(int i) {
    }

    public static String aa(byte[] bArr, int i, int i2, int i3) {
        try {
            char[] cArr = new char[i2];
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                int i6 = bArr[i + i4] & 255;
                if (i6 == 0) {
                    i6 = i5;
                } else {
                    int i7;
                    if (i6 < mn.an || i6 >= 160) {
                        i7 = i6;
                    } else {
                        char c = ml.af[i6 - 128];
                        if (c == '\u0000') {
                            c = '?';
                        }
                        i7 = c;
                    }
                    i6 = i5 + 1;
                    cArr[i5] = (char) i7;
                }
                i4++;
                i5 = i6;
            }
            return new String(cArr, 0, i5);
        } catch (Throwable e) {
            throw ba.ad(e, "kf.aa(" + ')');
        }
    }

    public byte[] an(int i, int i2, int i3) {
        try {
            return aa(i, i2, null, 1894061078);
        } catch (Throwable e) {
            throw ba.ad(e, "kf.an(" + ')');
        }
    }

    public byte[] bp(int i, int i2) {
        return aa(i, i2, null, 761692413);
    }

    public byte[] bx(int i, int i2) {
        return aa(i, i2, null, 1740835727);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] aa(int r4, int r5, int[] r6, int r7) {
        /*
        r3 = this;
        r0 = 0;
        if (r4 < 0) goto L_0x0017;
    L_0x0003:
        r1 = r3.at;	 Catch:{ RuntimeException -> 0x0052 }
        r1 = r1.length;	 Catch:{ RuntimeException -> 0x0052 }
        if (r4 >= r1) goto L_0x0017;
    L_0x0008:
        r1 = r3.at;	 Catch:{ RuntimeException -> 0x0052 }
        r1 = r1[r4];	 Catch:{ RuntimeException -> 0x0052 }
        if (r1 == 0) goto L_0x0017;
    L_0x000e:
        if (r5 < 0) goto L_0x0017;
    L_0x0010:
        r1 = r3.at;	 Catch:{ RuntimeException -> 0x0052 }
        r1 = r1[r4];	 Catch:{ RuntimeException -> 0x0052 }
        r1 = r1.length;	 Catch:{ RuntimeException -> 0x0052 }
        if (r5 < r1) goto L_0x0018;
    L_0x0017:
        return r0;
    L_0x0018:
        r1 = r3.at;	 Catch:{ RuntimeException -> 0x0052 }
        r1 = r1[r4];	 Catch:{ RuntimeException -> 0x0052 }
        r1 = r1[r5];	 Catch:{ RuntimeException -> 0x0052 }
        if (r1 != 0) goto L_0x0038;
    L_0x0020:
        r1 = -1981607406; // 0xffffffff89e31212 float:-5.4665255E-33 double:NaN;
        r1 = r3.ao(r4, r6, r1);	 Catch:{ RuntimeException -> 0x0052 }
        if (r1 != 0) goto L_0x0038;
    L_0x0029:
        r1 = -667451793; // 0xffffffffd8377e6f float:-8.0701462E14 double:NaN;
        r3.at(r4, r1);	 Catch:{ RuntimeException -> 0x0052 }
        r1 = -1611379376; // 0xffffffff9ff44d50 float:-1.0346592E-19 double:NaN;
        r1 = r3.ao(r4, r6, r1);	 Catch:{ RuntimeException -> 0x0052 }
        if (r1 == 0) goto L_0x0017;
    L_0x0038:
        r0 = r3.at;	 Catch:{ RuntimeException -> 0x0052 }
        r0 = r0[r4];	 Catch:{ RuntimeException -> 0x0052 }
        r0 = r0[r5];	 Catch:{ RuntimeException -> 0x0052 }
        r1 = 0;
        r2 = 1428581124; // 0x55266b04 float:1.14361599E13 double:7.058128557E-315;
        r0 = p000.hl.ad(r0, r1, r2);	 Catch:{ RuntimeException -> 0x0052 }
        r1 = r3.az;	 Catch:{ RuntimeException -> 0x0052 }
        if (r1 == 0) goto L_0x0017;
    L_0x004a:
        r1 = r3.at;	 Catch:{ RuntimeException -> 0x0052 }
        r1 = r1[r4];	 Catch:{ RuntimeException -> 0x0052 }
        r2 = 0;
        r1[r5] = r2;	 Catch:{ RuntimeException -> 0x0052 }
        goto L_0x0017;
    L_0x0052:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "kf.aa(";
        r1 = r1.append(r2);
        r2 = 41;
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0 = p000.ba.ad(r0, r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.aa(int, int, int[], int):byte[]");
    }

    public byte[] be(int i, int i2, int[] iArr) {
        if (i < 0 || i >= this.at.length || this.at[i] == null || i2 < 0 || i2 >= this.at[i].length) {
            return null;
        }
        if (this.at[i][i2] == null && !ao(i, iArr, -1237198800)) {
            at(i, -256580936);
            if (!ao(i, iArr, -276535788)) {
                return null;
            }
        }
        byte[] ad = hl.ad(this.at[i][i2], false, -908481401);
        if (this.az) {
            this.at[i][i2] = null;
        }
        return ad;
    }

    public byte[] bk(int i, int i2, int[] iArr) {
        if (i < 0 || i >= this.at.length || this.at[i] == null || i2 < 0 || i2 >= this.at[i].length) {
            return null;
        }
        if (this.at[i][i2] == null && !ao(i, iArr, -1263909693)) {
            at(i, -327685082);
            if (!ao(i, iArr, -1042623191)) {
                return null;
            }
        }
        byte[] ad = hl.ad(this.at[i][i2], false, -1395248268);
        if (this.az) {
            this.at[i][i2] = null;
        }
        return ad;
    }

    public byte[] bt(int i, int i2, int[] iArr) {
        if (i < 0 || i >= this.at.length || this.at[i] == null || i2 < 0 || i2 >= this.at[i].length) {
            return null;
        }
        if (this.at[i][i2] == null && !ao(i, iArr, -2142800702)) {
            at(i, -975620265);
            if (!ao(i, iArr, -666210824)) {
                return null;
            }
        }
        byte[] ad = hl.ad(this.at[i][i2], false, -1712449072);
        if (this.az) {
            this.at[i][i2] = null;
        }
        return ad;
    }

    public byte[] bu(int i, int i2, int[] iArr) {
        if (i < 0 || i >= this.at.length || this.at[i] == null || i2 < 0 || i2 >= this.at[i].length) {
            return null;
        }
        if (this.at[i][i2] == null && !ao(i, iArr, -145519375)) {
            at(i, -613579775);
            if (!ao(i, iArr, -1975607623)) {
                return null;
            }
        }
        byte[] ad = hl.ad(this.at[i][i2], false, -1422411887);
        if (this.az) {
            this.at[i][i2] = null;
        }
        return ad;
    }

    public byte[] by(int i, int i2, int[] iArr) {
        if (i < 0 || i >= this.at.length || this.at[i] == null || i2 < 0 || i2 >= this.at[i].length) {
            return null;
        }
        if (this.at[i][i2] == null && !ao(i, iArr, -745916704)) {
            at(i, -618836390);
            if (!ao(i, iArr, -95921526)) {
                return null;
            }
        }
        byte[] ad = hl.ad(this.at[i][i2], false, 1070443604);
        if (this.az) {
            this.at[i][i2] = null;
        }
        return ad;
    }

    public boolean ag(int i, int i2, int i3) {
        if (i >= 0) {
            try {
                if (i < this.at.length && this.at[i] != null && i2 >= 0 && i2 < this.at[i].length) {
                    if (this.at[i][i2] != null) {
                        return true;
                    }
                    if (this.am[i] != null) {
                        return true;
                    }
                    at(i, 726817223);
                    if (this.am[i] == null) {
                        return false;
                    }
                    return true;
                }
            } catch (Throwable e) {
                throw ba.ad(e, "kf.ag(" + ')');
            }
        }
        return false;
    }

    public boolean ba(int i, int i2) {
        if (i < 0 || i >= this.at.length || this.at[i] == null || i2 < 0 || i2 >= this.at[i].length) {
            return false;
        }
        if (this.at[i][i2] != null) {
            return true;
        }
        if (this.am[i] != null) {
            return true;
        }
        at(i, -2141093244);
        if (this.am[i] == null) {
            return false;
        }
        return true;
    }

    public boolean bl(int i, int i2) {
        if (i < 0 || i >= this.at.length || this.at[i] == null || i2 < 0 || i2 >= this.at[i].length) {
            return false;
        }
        if (this.at[i][i2] != null || this.am[i] != null) {
            return true;
        }
        at(i, -140419190);
        if (this.am[i] == null) {
            return false;
        }
        return true;
    }

    public boolean bn(int i, int i2) {
        if (i < 0 || i >= this.at.length || this.at[i] == null || i2 < 0 || i2 >= this.at[i].length) {
            return false;
        }
        if (this.at[i][i2] != null || this.am[i] != null) {
            return true;
        }
        at(i, -2007022160);
        if (this.am[i] == null) {
            return false;
        }
        return true;
    }

    public boolean ay(int i, int i2) {
        try {
            if (1 == this.at.length) {
                return ag(0, i, 1697187301);
            }
            if (1 == this.at[i].length) {
                return ag(i, 0, 2139144633);
            }
            throw new RuntimeException();
        } catch (Throwable e) {
            throw ba.ad(e, "kf.ay(" + ')');
        }
    }

    public boolean bd(int i) {
        if (1 == this.at.length) {
            return ag(0, i, 1934713521);
        }
        if (1 == this.at[i].length) {
            return ag(i, 0, 1798795364);
        }
        throw new RuntimeException();
    }

    public boolean as(int i, int i2) {
        try {
            if (this.am[i] != null) {
                return true;
            }
            at(i, -42348076);
            if (this.am[i] == null) {
                return false;
            }
            return true;
        } catch (Throwable e) {
            throw ba.ad(e, "kf.as(" + ')');
        }
    }

    public boolean bj(int i) {
        if (this.am[i] != null) {
            return true;
        }
        at(i, 812040364);
        if (this.am[i] == null) {
            return false;
        }
        return true;
    }

    public boolean bm(int i) {
        if (this.am[i] != null) {
            return true;
        }
        at(i, 181354452);
        if (this.am[i] == null) {
            return false;
        }
        return true;
    }

    public boolean br(int i) {
        if (this.am[i] != null) {
            return true;
        }
        at(i, -306305206);
        if (this.am[i] == null) {
            return false;
        }
        return true;
    }

    public boolean bs(int i) {
        if (this.am[i] != null) {
            return true;
        }
        at(i, -820680292);
        if (this.am[i] == null) {
            return false;
        }
        return true;
    }

    public boolean ar(int i) {
        boolean z = true;
        int i2 = 0;
        while (i2 < this.an.length) {
            try {
                int i3 = this.an[i2];
                if (this.am[i3] == null) {
                    at(i3, -1254547241);
                    if (this.am[i3] == null) {
                        z = false;
                    }
                }
                i2++;
            } catch (Throwable e) {
                throw ba.ad(e, "kf.ar(" + ')');
            }
        }
        return z;
    }

    public boolean bi() {
        boolean z = true;
        for (int i : this.an) {
            if (this.am[i] == null) {
                at(i, -1198188052);
                if (this.am[i] == null) {
                    z = false;
                }
            }
        }
        return z;
    }

    public boolean bo() {
        boolean z = true;
        for (int i : this.an) {
            if (this.am[i] == null) {
                at(i, -412657325);
                if (this.am[i] == null) {
                    z = false;
                }
            }
        }
        return z;
    }

    public boolean bq() {
        boolean z = true;
        for (int i : this.an) {
            if (this.am[i] == null) {
                at(i, -1460526737);
                if (this.am[i] == null) {
                    z = false;
                }
            }
        }
        return z;
    }

    int aj(int i, int i2) {
        try {
            if (this.am[i] != null) {
                return 100;
            }
            return 0;
        } catch (Throwable e) {
            throw ba.ad(e, "kf.aj(" + ')');
        }
    }

    int cv(int i) {
        if (this.am[i] != null) {
            return 100;
        }
        return 0;
    }

    public byte[] ae(int i, byte b) {
        try {
            if (1 == this.at.length) {
                return an(0, i, 459990835);
            }
            if (1 == this.at[i].length) {
                return an(i, 0, -771702375);
            }
            throw new RuntimeException();
        } catch (Throwable e) {
            throw ba.ad(e, "kf.ae(" + ')');
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] aq(int r4, int r5, int r6) {
        /*
        r3 = this;
        r0 = 0;
        if (r4 < 0) goto L_0x0017;
    L_0x0003:
        r1 = r3.at;	 Catch:{ RuntimeException -> 0x0049 }
        r1 = r1.length;	 Catch:{ RuntimeException -> 0x0049 }
        if (r4 >= r1) goto L_0x0017;
    L_0x0008:
        r1 = r3.at;	 Catch:{ RuntimeException -> 0x0049 }
        r1 = r1[r4];	 Catch:{ RuntimeException -> 0x0049 }
        if (r1 == 0) goto L_0x0017;
    L_0x000e:
        if (r5 < 0) goto L_0x0017;
    L_0x0010:
        r1 = r3.at;	 Catch:{ RuntimeException -> 0x0049 }
        r1 = r1[r4];	 Catch:{ RuntimeException -> 0x0049 }
        r1 = r1.length;	 Catch:{ RuntimeException -> 0x0049 }
        if (r5 < r1) goto L_0x0018;
    L_0x0017:
        return r0;
    L_0x0018:
        r1 = r3.at;	 Catch:{ RuntimeException -> 0x0049 }
        r1 = r1[r4];	 Catch:{ RuntimeException -> 0x0049 }
        r1 = r1[r5];	 Catch:{ RuntimeException -> 0x0049 }
        if (r1 != 0) goto L_0x003a;
    L_0x0020:
        r1 = 0;
        r2 = -1558795411; // 0xffffffffa316ab6d float:-8.167817E-18 double:NaN;
        r1 = r3.ao(r4, r1, r2);	 Catch:{ RuntimeException -> 0x0049 }
        if (r1 != 0) goto L_0x003a;
    L_0x002a:
        r1 = -100166690; // 0xfffffffffa0793de float:-1.759898E35 double:NaN;
        r3.at(r4, r1);	 Catch:{ RuntimeException -> 0x0049 }
        r1 = 0;
        r2 = 233838394; // 0xdf0173a float:1.4796734E-30 double:1.15531517E-315;
        r1 = r3.ao(r4, r1, r2);	 Catch:{ RuntimeException -> 0x0049 }
        if (r1 == 0) goto L_0x0017;
    L_0x003a:
        r0 = r3.at;	 Catch:{ RuntimeException -> 0x0049 }
        r0 = r0[r4];	 Catch:{ RuntimeException -> 0x0049 }
        r0 = r0[r5];	 Catch:{ RuntimeException -> 0x0049 }
        r1 = 0;
        r2 = -1878492973; // 0xffffffff900878d3 float:-2.691435E-29 double:NaN;
        r0 = p000.hl.ad(r0, r1, r2);	 Catch:{ RuntimeException -> 0x0049 }
        goto L_0x0017;
    L_0x0049:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "kf.aq(";
        r1 = r1.append(r2);
        r2 = 41;
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0 = p000.ba.ad(r0, r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.aq(int, int, int):byte[]");
    }

    public byte[] cc(int i, int i2) {
        if (i < 0 || i >= this.at.length || this.at[i] == null || i2 < 0 || i2 >= this.at[i].length) {
            return null;
        }
        if (this.at[i][i2] == null && !ao(i, null, -1402234752)) {
            at(i, -1941674749);
            if (!ao(i, null, 173598936)) {
                return null;
            }
        }
        return hl.ad(this.at[i][i2], false, -1228074492);
    }

    public byte[] ci(int i, int i2) {
        if (i < 0 || i >= this.at.length || this.at[i] == null || i2 < 0 || i2 >= this.at[i].length) {
            return null;
        }
        if (this.at[i][i2] == null && !ao(i, null, -131710789)) {
            at(i, -642641112);
            if (!ao(i, null, 531420852)) {
                return null;
            }
        }
        return hl.ad(this.at[i][i2], false, -1886382080);
    }

    public byte[] cn(int i, int i2) {
        if (i < 0 || i >= this.at.length || this.at[i] == null || i2 < 0 || i2 >= this.at[i].length) {
            return null;
        }
        if (this.at[i][i2] == null && !ao(i, null, -1216497482)) {
            at(i, -2093287899);
            if (!ao(i, null, -515817540)) {
                return null;
            }
        }
        return hl.ad(this.at[i][i2], false, 2081121171);
    }

    public byte[] co(int i, int i2) {
        if (i < 0 || i >= this.at.length || this.at[i] == null || i2 < 0 || i2 >= this.at[i].length) {
            return null;
        }
        if (this.at[i][i2] == null && !ao(i, null, 114890050)) {
            at(i, -236831040);
            if (!ao(i, null, -1300262505)) {
                return null;
            }
        }
        return hl.ad(this.at[i][i2], false, -340552250);
    }

    public byte[] cy(int i, int i2) {
        if (i < 0 || i >= this.at.length || this.at[i] == null || i2 < 0 || i2 >= this.at[i].length) {
            return null;
        }
        if (this.at[i][i2] == null && !ao(i, null, 365923120)) {
            at(i, -811671277);
            if (!ao(i, null, -1314851012)) {
                return null;
            }
        }
        return hl.ad(this.at[i][i2], false, -1117949664);
    }

    public byte[] am(int i, int i2) {
        try {
            if (this.at.length == 1) {
                return aq(0, i, -496726829);
            }
            if (1 == this.at[i].length) {
                return aq(i, 0, -1960059982);
            }
            throw new RuntimeException();
        } catch (Throwable e) {
            throw ba.ad(e, "kf.am(" + ')');
        }
    }

    public byte[] ck(int i) {
        if (this.at.length == 1) {
            return aq(0, i, 2031327251);
        }
        if (1 == this.at[i].length) {
            return aq(i, 0, -367975999);
        }
        throw new RuntimeException();
    }

    public byte[] cl(int i) {
        if (this.at.length == 1) {
            return aq(0, i, -994672712);
        }
        if (1 == this.at[i].length) {
            return aq(i, 0, -12312095);
        }
        throw new RuntimeException();
    }

    public byte[] cs(int i) {
        if (this.at.length == 1) {
            return aq(0, i, 821217590);
        }
        if (1 == this.at[i].length) {
            return aq(i, 0, 1531254501);
        }
        throw new RuntimeException();
    }

    void at(int i, int i2) {
    }

    void cd(int i) {
    }

    void ch(int i) {
    }

    public int[] ab(int i, int i2) {
        try {
            return this.aj[i];
        } catch (Throwable e) {
            throw ba.ad(e, "kf.ab(" + ')');
        }
    }

    public int[] cm(int i) {
        return this.aj[i];
    }

    public int[] cq(int i) {
        return this.aj[i];
    }

    public int aw(int i, int i2) {
        try {
            return this.at[i].length;
        } catch (Throwable e) {
            throw ba.ad(e, "kf.aw(" + ')');
        }
    }

    public int cj(int i) {
        return this.at[i].length;
    }

    public int cp(int i) {
        return this.at[i].length;
    }

    public int ct(int i) {
        return this.at[i].length;
    }

    public int ai(int i) {
        try {
            return this.at.length;
        } catch (Throwable e) {
            throw ba.ad(e, "kf.ai(" + ')');
        }
    }

    public int cb() {
        return this.at.length;
    }

    public void az(int i) {
        int i2 = 0;
        while (i2 < this.am.length) {
            try {
                this.am[i2] = null;
                i2++;
            } catch (Throwable e) {
                throw ba.ad(e, "kf.az(" + ')');
            }
        }
    }

    public void cu() {
        for (int i = 0; i < this.am.length; i++) {
            this.am[i] = null;
        }
    }

    public void dc() {
        for (int i = 0; i < this.am.length; i++) {
            this.am[i] = null;
        }
    }

    public void dj() {
        for (int i = 0; i < this.am.length; i++) {
            this.am[i] = null;
        }
    }

    public void dk() {
        for (int i = 0; i < this.am.length; i++) {
            this.am[i] = null;
        }
    }

    public void m20do() {
        for (int i = 0; i < this.am.length; i++) {
            this.am[i] = null;
        }
    }

    public void ah(int i, int i2) {
        int i3 = 0;
        while (i3 < this.at[i].length) {
            try {
                this.at[i][i3] = null;
                i3++;
            } catch (Throwable e) {
                throw ba.ad(e, "kf.ah(" + ')');
            }
        }
    }

    public void ak(byte b) {
        int i = 0;
        while (i < this.at.length) {
            try {
                if (this.at[i] != null) {
                    for (int i2 = 0; i2 < this.at[i].length; i2++) {
                        this.at[i][i2] = null;
                    }
                }
                i++;
            } catch (Throwable e) {
                throw ba.ad(e, "kf.ak(" + ')');
            }
        }
    }

    public void dt() {
        for (int i = 0; i < this.at.length; i++) {
            if (this.at[i] != null) {
                for (int i2 = 0; i2 < this.at[i].length; i2++) {
                    this.at[i][i2] = null;
                }
            }
        }
    }

    public void dv() {
        for (int i = 0; i < this.at.length; i++) {
            if (this.at[i] != null) {
                for (int i2 = 0; i2 < this.at[i].length; i2++) {
                    this.at[i][i2] = null;
                }
            }
        }
    }

    public void dz() {
        for (int i = 0; i < this.at.length; i++) {
            if (this.at[i] != null) {
                for (int i2 = 0; i2 < this.at[i].length; i2++) {
                    this.at[i][i2] = null;
                }
            }
        }
    }

    boolean ao(int i, int[] iArr, int i2) {
        byte[] ad;
        try {
            if (this.am[i] == null) {
                return false;
            }
            int i3;
            int i4 = this.ar[i];
            int[] iArr2 = this.aj[i];
            Object[] objArr = this.at[i];
            Object obj = 1;
            for (i3 = 0; i3 < i4; i3++) {
                if (objArr[iArr2[i3]] == null) {
                    obj = null;
                    break;
                }
            }
            if (obj != null) {
                return true;
            }
            if (iArr == null || (iArr[0] == 0 && iArr[1] == 0 && iArr[2] == 0 && iArr[3] == 0)) {
                ad = hl.ad(this.am[i], false, -220872654);
            } else {
                byte[] ad2 = hl.ad(this.am[i], true, -1256618816);
                ik ikVar = new ik(ad2);
                ikVar.by(iArr, 5, ikVar.af.length, 674565804);
                ad = ad2;
            }
            byte[] bc = lm.bc(ad, (byte) 91);
            if (this.ai) {
                this.am[i] = null;
            }
            if (i4 > 1) {
                int i5;
                int length = bc.length - 1;
                int i6 = bc[length] & 255;
                int i7 = length - ((i6 * i4) * 4);
                ik ikVar2 = new ik(bc);
                int[] iArr3 = new int[i4];
                ikVar2.ad = 2065011939 * i7;
                for (i5 = 0; i5 < i6; i5++) {
                    i3 = 0;
                    for (length = 0; length < i4; length++) {
                        i3 += ikVar2.al(2064101039);
                        iArr3[length] = iArr3[length] + i3;
                    }
                }
                byte[][] bArr = new byte[i4][];
                for (length = 0; length < i4; length++) {
                    bArr[length] = new byte[iArr3[length]];
                    iArr3[length] = 0;
                }
                ikVar2.ad = 2065011939 * i7;
                i5 = 0;
                for (i7 = 0; i7 < i6; i7++) {
                    i3 = 0;
                    for (length = 0; length < i4; length++) {
                        i3 += ikVar2.al(-448868976);
                        System.arraycopy(bc, i5, bArr[length], iArr3[length], i3);
                        iArr3[length] = iArr3[length] + i3;
                        i5 += i3;
                    }
                }
                for (length = 0; length < i4; length++) {
                    if (this.az) {
                        objArr[iArr2[length]] = bArr[length];
                    } else {
                        objArr[iArr2[length]] = gl.af(bArr[length], false, 2108879713);
                    }
                }
            } else if (this.az) {
                objArr[iArr2[0]] = bc;
            } else {
                objArr[iArr2[0]] = gl.af(bc, false, 2022438802);
            }
            return true;
        } catch (Throwable e) {
            boolean z;
            StringBuilder append = new StringBuilder().append("");
            if (iArr != null) {
                z = true;
            } else {
                z = false;
            }
            throw ba.ad(e, append.append(z).append(af).append(i).append(af).append(ad.length).append(af).append(hm.af(ad, ad.length, (byte) 2)).append(af).append(hm.af(ad, ad.length - 2, (byte) 2)).append(af).append(this.ay[i]).append(af).append(this.aw * -1096614661).toString());
        } catch (Throwable e2) {
            throw ba.ad(e2, "kf.ao(" + ')');
        }
    }

    boolean dd(int i, int[] iArr) {
        if (this.am[i] == null) {
            return false;
        }
        int i2;
        int i3 = this.ar[i];
        int[] iArr2 = this.aj[i];
        Object[] objArr = this.at[i];
        Object obj = 1;
        for (i2 = 0; i2 < i3; i2++) {
            if (objArr[iArr2[i2]] == null) {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        byte[] ad;
        if (iArr == null || (iArr[0] == 0 && iArr[1] == 0 && iArr[2] == 0 && iArr[3] == 0)) {
            ad = hl.ad(this.am[i], false, -386677437);
        } else {
            byte[] ad2 = hl.ad(this.am[i], true, 523619887);
            ik ikVar = new ik(ad2);
            ikVar.by(iArr, 5, ikVar.af.length, 1789832700);
            ad = ad2;
        }
        try {
            byte[] bc = lm.bc(ad, (byte) 102);
            if (this.ai) {
                this.am[i] = null;
            }
            if (i3 > 1) {
                int i4;
                int length = bc.length - 1;
                int i5 = bc[length] & 255;
                int i6 = length - ((i5 * i3) * 4);
                ik ikVar2 = new ik(bc);
                int[] iArr3 = new int[i3];
                ikVar2.ad = 2065011939 * i6;
                for (i4 = 0; i4 < i5; i4++) {
                    i2 = 0;
                    for (length = 0; length < i3; length++) {
                        i2 += ikVar2.al(-659762178);
                        iArr3[length] = iArr3[length] + i2;
                    }
                }
                byte[][] bArr = new byte[i3][];
                for (length = 0; length < i3; length++) {
                    bArr[length] = new byte[iArr3[length]];
                    iArr3[length] = 0;
                }
                ikVar2.ad = 2065011939 * i6;
                i4 = 0;
                for (i6 = 0; i6 < i5; i6++) {
                    i2 = 0;
                    for (length = 0; length < i3; length++) {
                        i2 += ikVar2.al(1552882822);
                        System.arraycopy(bc, i4, bArr[length], iArr3[length], i2);
                        iArr3[length] = iArr3[length] + i2;
                        i4 += i2;
                    }
                }
                for (length = 0; length < i3; length++) {
                    if (this.az) {
                        objArr[iArr2[length]] = bArr[length];
                    } else {
                        objArr[iArr2[length]] = gl.af(bArr[length], false, 2033568132);
                    }
                }
            } else if (this.az) {
                objArr[iArr2[0]] = bc;
            } else {
                objArr[iArr2[0]] = gl.af(bc, false, 2135878751);
            }
            return true;
        } catch (Throwable e) {
            throw ba.ad(e, "" + (iArr != null) + af + i + af + ad.length + af + hm.af(ad, ad.length, (byte) 2) + af + hm.af(ad, ad.length - 2, (byte) 2) + af + this.ay[i] + af + (this.aw * -1096614661));
        }
    }

    boolean dl(int i, int[] iArr) {
        byte[] ad;
        if (this.am[i] == null) {
            return false;
        }
        int i2;
        int i3 = this.ar[i];
        int[] iArr2 = this.aj[i];
        Object[] objArr = this.at[i];
        Object obj = 1;
        for (i2 = 0; i2 < i3; i2++) {
            if (objArr[iArr2[i2]] == null) {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        if (iArr == null || (iArr[0] == 0 && iArr[1] == 0 && iArr[2] == 0 && iArr[3] == 0)) {
            ad = hl.ad(this.am[i], false, -301518963);
        } else {
            byte[] ad2 = hl.ad(this.am[i], true, -786265582);
            ik ikVar = new ik(ad2);
            ikVar.by(iArr, 5, ikVar.af.length, 1916070449);
            ad = ad2;
        }
        try {
            byte[] bc = lm.bc(ad, (byte) 86);
            if (this.ai) {
                this.am[i] = null;
            }
            if (i3 > 1) {
                int i4;
                int length = bc.length - 1;
                int i5 = bc[length] & -283812500;
                int i6 = length - ((i5 * i3) * 4);
                ik ikVar2 = new ik(bc);
                int[] iArr3 = new int[i3];
                ikVar2.ad = 1845262344 * i6;
                for (i4 = 0; i4 < i5; i4++) {
                    i2 = 0;
                    for (length = 0; length < i3; length++) {
                        i2 += ikVar2.al(1010177315);
                        iArr3[length] = iArr3[length] + i2;
                    }
                }
                byte[][] bArr = new byte[i3][];
                for (length = 0; length < i3; length++) {
                    bArr[length] = new byte[iArr3[length]];
                    iArr3[length] = 0;
                }
                ikVar2.ad = -2106664144 * i6;
                i4 = 0;
                for (i6 = 0; i6 < i5; i6++) {
                    i2 = 0;
                    for (length = 0; length < i3; length++) {
                        i2 += ikVar2.al(-48425107);
                        System.arraycopy(bc, i4, bArr[length], iArr3[length], i2);
                        iArr3[length] = iArr3[length] + i2;
                        i4 += i2;
                    }
                }
                for (length = 0; length < i3; length++) {
                    if (this.az) {
                        objArr[iArr2[length]] = bArr[length];
                    } else {
                        objArr[iArr2[length]] = gl.af(bArr[length], false, 2128526619);
                    }
                }
            } else if (this.az) {
                objArr[iArr2[0]] = bc;
            } else {
                objArr[iArr2[0]] = gl.af(bc, false, 2147178948);
            }
            return true;
        } catch (Throwable e) {
            throw ba.ad(e, "" + (iArr != null) + af + i + af + ad.length + af + hm.af(ad, ad.length, (byte) 2) + af + hm.af(ad, ad.length - 2, (byte) 2) + af + this.ay[i] + af + (this.aw * 410956414));
        }
    }

    public int ax(String str, int i) {
        try {
            return this.ag.af(hk.as(str.toLowerCase(), -1460510113));
        } catch (Throwable e) {
            throw ba.ad(e, "kf.ax(" + ')');
        }
    }

    public int da(String str) {
        return this.ag.af(hk.as(str.toLowerCase(), -1183491720));
    }

    public int di(String str) {
        return this.ag.af(hk.as(str.toLowerCase(), -1040062148));
    }

    public int au(int i, String str, int i2) {
        try {
            return this.aq[i].af(hk.as(str.toLowerCase(), -1662204132));
        } catch (Throwable e) {
            throw ba.ad(e, "kf.au(" + ')');
        }
    }

    public int de(int i, String str) {
        return this.aq[i].af(hk.as(str.toLowerCase(), -1498278137));
    }

    public int dr(int i, String str) {
        return this.aq[i].af(hk.as(str.toLowerCase(), -1161399514));
    }

    public boolean av(String str, String str2, int i) {
        try {
            CharSequence toLowerCase = str.toLowerCase();
            CharSequence toLowerCase2 = str2.toLowerCase();
            int af = this.ag.af(hk.as(toLowerCase, -952513908));
            if (af >= 0 && this.aq[af].af(hk.as(toLowerCase2, -475634757)) >= 0) {
                return true;
            }
            return false;
        } catch (Throwable e) {
            throw ba.ad(e, "kf.av(" + ')');
        }
    }

    public byte[] ac(String str, String str2, int i) {
        try {
            CharSequence toLowerCase = str.toLowerCase();
            CharSequence toLowerCase2 = str2.toLowerCase();
            int af = this.ag.af(hk.as(toLowerCase, -807310165));
            return an(af, this.aq[af].af(hk.as(toLowerCase2, -418649316)), -995565013);
        } catch (Throwable e) {
            throw ba.ad(e, "kf.ac(" + ')');
        }
    }

    public byte[] dh(String str, String str2) {
        CharSequence toLowerCase = str.toLowerCase();
        CharSequence toLowerCase2 = str2.toLowerCase();
        int af = this.ag.af(hk.as(toLowerCase, -688444060));
        return an(af, this.aq[af].af(hk.as(toLowerCase2, -2011094011)), -1884362720);
    }

    public byte[] ds(String str, String str2) {
        CharSequence toLowerCase = str.toLowerCase();
        CharSequence toLowerCase2 = str2.toLowerCase();
        int af = this.ag.af(hk.as(toLowerCase, -543929044));
        return an(af, this.aq[af].af(hk.as(toLowerCase2, -506627761)), -502576011);
    }

    public byte[] dw(String str, String str2) {
        CharSequence toLowerCase = str.toLowerCase();
        CharSequence toLowerCase2 = str2.toLowerCase();
        int af = this.ag.af(hk.as(toLowerCase, -584212339));
        return an(af, this.aq[af].af(hk.as(toLowerCase2, -957735081)), -1085608852);
    }

    public byte[] dx(String str, String str2) {
        CharSequence toLowerCase = str.toLowerCase();
        CharSequence toLowerCase2 = str2.toLowerCase();
        int af = this.ag.af(hk.as(toLowerCase, -2008130703));
        return an(af, this.aq[af].af(hk.as(toLowerCase2, -1410332585)), -1588731916);
    }

    public boolean al(String str, String str2, byte b) {
        try {
            CharSequence toLowerCase = str.toLowerCase();
            CharSequence toLowerCase2 = str2.toLowerCase();
            int af = this.ag.af(hk.as(toLowerCase, -696624658));
            return ag(af, this.aq[af].af(hk.as(toLowerCase2, -600146835)), 1665187577);
        } catch (Throwable e) {
            throw ba.ad(e, "kf.al(" + ')');
        }
    }

    public boolean dy(String str, String str2) {
        CharSequence toLowerCase = str.toLowerCase();
        CharSequence toLowerCase2 = str2.toLowerCase();
        int af = this.ag.af(hk.as(toLowerCase, -2019978678));
        return ag(af, this.aq[af].af(hk.as(toLowerCase2, -434305086)), 1842232789);
    }

    public boolean ap(String str, int i) {
        try {
            return as(this.ag.af(hk.as(str.toLowerCase(), -1177805423)), 2328865);
        } catch (Throwable e) {
            throw ba.ad(e, "kf.ap(" + ')');
        }
    }

    public boolean db(String str) {
        return as(this.ag.af(hk.as(str.toLowerCase(), -414127967)), 2328865);
    }

    public boolean dm(String str) {
        return as(this.ag.af(hk.as(str.toLowerCase(), -1326436461)), 2328865);
    }

    public boolean dn(String str) {
        return as(this.ag.af(hk.as(str.toLowerCase(), -994522924)), 2328865);
    }

    public boolean du(String str) {
        return as(this.ag.af(hk.as(str.toLowerCase(), -1946069525)), 2328865);
    }

    public void bw(String str, int i) {
        try {
            int af = this.ag.af(hk.as(str.toLowerCase(), -826393083));
            if (af >= 0) {
                ad(af, -1331363370);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "kf.bw(" + ')');
        }
    }

    public void df(String str) {
        int af = this.ag.af(hk.as(str.toLowerCase(), -2081680071));
        if (af >= 0) {
            ad(af, 264157047);
        }
    }

    public void dg(String str) {
        int af = this.ag.af(hk.as(str.toLowerCase(), -1126157890));
        if (af >= 0) {
            ad(af, 2025986518);
        }
    }

    public void dp(String str) {
        int af = this.ag.af(hk.as(str.toLowerCase(), -1260090603));
        if (af >= 0) {
            ad(af, 1331125966);
        }
    }

    public int bb(String str, int i) {
        try {
            return aj(this.ag.af(hk.as(str.toLowerCase(), -1554062348)), -1115559217);
        } catch (Throwable e) {
            throw ba.ad(e, "kf.bb(" + ')');
        }
    }

    public int dq(String str) {
        return aj(this.ag.af(hk.as(str.toLowerCase(), -2045384210)), 1998432018);
    }

    public int ek(String str) {
        return aj(this.ag.af(hk.as(str.toLowerCase(), -1610296463)), -1395525957);
    }

    public int er(String str) {
        return aj(this.ag.af(hk.as(str.toLowerCase(), -503513097)), -1612845342);
    }

    public int ew(String str) {
        return aj(this.ag.af(hk.as(str.toLowerCase(), -508199697)), -1463572073);
    }

    static final byte[] es(byte[] bArr) {
        ik ikVar = new ik(bArr);
        int ao = ikVar.ao((byte) 0);
        int al = ikVar.al(409742183);
        if (al < 0 || (ah * 1621223447 != 0 && al > ah * 1621223447)) {
            throw new RuntimeException();
        } else if (ao == 0) {
            r0 = new byte[al];
            ikVar.bg(r0, 0, al, 725190012);
            return r0;
        } else {
            int al2 = ikVar.al(728523580);
            if (al2 < 0 || (941031566 * ah != 0 && al2 > ah * 1621223447)) {
                throw new RuntimeException();
            }
            r0 = new byte[al2];
            if (1 == ao) {
                im.af(r0, al2, bArr, al, 9);
                return r0;
            }
            ab.af(ikVar, r0, 91258545);
            return r0;
        }
    }

    static final byte[] ex(byte[] bArr) {
        ik ikVar = new ik(bArr);
        int ao = ikVar.ao((byte) 0);
        int al = ikVar.al(954243933);
        if (al < 0 || (ah * 1621223447 != 0 && al > ah * 1621223447)) {
            throw new RuntimeException();
        } else if (ao == 0) {
            r0 = new byte[al];
            ikVar.bg(r0, 0, al, -128016551);
            return r0;
        } else {
            int al2 = ikVar.al(1180605947);
            if (al2 < 0 || (ah * 1621223447 != 0 && al2 > ah * -1422793019)) {
                throw new RuntimeException();
            }
            r0 = new byte[al2];
            if (1 == ao) {
                im.af(r0, al2, bArr, al, 9);
                return r0;
            }
            ab.af(ikVar, r0, 91258545);
            return r0;
        }
    }

    static void cu(ga gaVar, boolean z, int i) {
        if (gaVar != null) {
            try {
                if (gaVar.an(-274436643) && !gaVar.av) {
                    gaVar.ax = false;
                    if (((client.ae && -1675758365 * gw.ay > 50) || -1675758365 * gw.ay > 200) && z && -629432309 * gaVar.bx == 259701737 * gaVar.cd) {
                        gaVar.ax = true;
                    }
                    int i2 = (gaVar.bg * 516759209) >> 7;
                    int i3 = (2328865 * gaVar.bh) >> 7;
                    if (i2 >= 0 && i2 < li.cu && i3 >= 0 && i3 < li.cu) {
                        long ar = cg.ar(0, 0, 0, false, 437122101 * gaVar.al, -575776873);
                        if (gaVar.ai == null || 1581849891 * client.ak < -55133803 * gaVar.aq || client.ak * 1581849891 >= gaVar.am * -1100434689) {
                            if (64 == ((516759209 * gaVar.bg) & 127) && 64 == ((2328865 * gaVar.bh) & 127)) {
                                if (-1793689995 * client.gx != client.gr[i2][i3]) {
                                    client.gr[i2][i3] = -1793689995 * client.gx;
                                } else {
                                    return;
                                }
                            }
                            gaVar.ae = iz.de(516759209 * gaVar.bg, 2328865 * gaVar.bh, -1674539149 * dq.hf, 1878177684) * 1725052319;
                            gaVar.bp = client.ak * -1541697971;
                            gp.en.am(dq.hf * -1674539149, 516759209 * gaVar.bg, gaVar.bh * 2328865, -500717985 * gaVar.ae, 60, gaVar, -626668509 * gaVar.bf, ar, gaVar.an);
                            return;
                        }
                        gaVar.ax = false;
                        gaVar.ae = iz.de(516759209 * gaVar.bg, gaVar.bh * 2328865, dq.hf * -1674539149, 1873320547) * 1725052319;
                        gaVar.bp = client.ak * -1541697971;
                        gp.en.at(-1674539149 * dq.hf, 516759209 * gaVar.bg, 2328865 * gaVar.bh, gaVar.ae * -500717985, 60, gaVar, -626668509 * gaVar.bf, ar, -2120353559 * gaVar.az, 2137842387 * gaVar.ah, -1073493993 * gaVar.ak, gaVar.ao * 706708607);
                    }
                }
            } catch (Throwable e) {
                throw ba.ad(e, "kf.cu(" + ')');
            }
        }
    }
}
