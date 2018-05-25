package p000;

import java.util.Collection;

public class il {
    static final js ae = new js(jv.jd, "", -1, -1, 1006, -1, false);
    static final int af = 500;
    static final int ag = 9274487;
    static final int an = 6116423;
    static final int ar = 20;
    static final int as = 16776960;
    int ab;
    int ac;
    int ah;
    lr ai;
    boolean ak;
    int al;
    int am;
    boolean ao;
    String ap;
    int aq;
    int at;
    int au;
    int av;
    int aw;
    boolean ax;
    int az;
    jp ba;
    final int[] bc;
    int bd;
    js[] be;
    int bf;
    boolean[] bg;
    public boolean bh;
    boolean bi;
    int bj;
    boolean bk;
    int bl;
    String bm;
    jp bn;
    boolean bo;
    int bp;
    fx[] bq;
    int br;
    String bs;
    boolean bt;
    int bu;
    int bv;
    String bw;
    int bx;
    boolean by;
    String[] bz;
    kf cc;
    boolean ci;
    public boolean co;
    int cv;

    public il(lr lrVar, fx[] fxVarArr, boolean z, kf kfVar) {
        int i = 0;
        try {
            this.ak = false;
            this.ao = false;
            this.ax = false;
            this.av = -1943398585;
            this.ac = -178565931;
            this.ap = null;
            this.bw = null;
            this.bc = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
            this.bz = new String[8];
            this.bg = new boolean[8];
            this.bh = false;
            this.bu = 0;
            this.be = new js[af];
            this.bk = false;
            this.by = false;
            this.bn = jp.aa;
            this.ba = jp.aa;
            this.cv = -1449421731;
            this.ci = false;
            this.co = true;
            this.ai = lrVar;
            this.ak = z;
            this.bq = fxVarArr;
            this.cc = kfVar;
            this.ah = -1217537125 * lrVar.aj;
            this.aq = 1458171275;
            this.am = 1702473807;
            this.at = -545831593;
            this.ab = 96099347;
            this.aw = 715513088;
            this.bj = Math.max(this.bq.length, 20) * -1438893439;
            this.br = 102358765 * this.bj;
            if (z) {
                this.az = lrVar.ar * 597044610;
            } else {
                this.az = 298522305 * ((lrVar.ar + lrVar.aj) - 1);
            }
            while (i < this.be.length) {
                this.be[i] = new js();
                i++;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "il.<init>(" + ')');
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void af(int r8) {
        /*
        r7 = this;
        r6 = 41;
        r2 = 1;
        r1 = 0;
        r0 = -2033946630; // 0xffffffff86c46ffa float:-7.389154E-35 double:NaN;
        r7.ar(r0);	 Catch:{ RuntimeException -> 0x009d }
        r0 = p000.gt.af;	 Catch:{ RuntimeException -> 0x009d }
        r3 = p000.client.ao;	 Catch:{ RuntimeException -> 0x009d }
        r3 = r3.af;	 Catch:{ RuntimeException -> 0x009d }
        if (r0 == r3) goto L_0x0101;
    L_0x0012:
        r0 = r7.bh;	 Catch:{ RuntimeException -> 0x009d }
        if (r0 == 0) goto L_0x00f9;
    L_0x0016:
        return;
    L_0x0017:
        r0 = 1314001909; // 0x4e5213f5 float:8.8113082E8 double:6.49203202E-315;
        r0 = r7.ba(r0);	 Catch:{ RuntimeException -> 0x009d }
        r3 = p000.client.ao;	 Catch:{ RuntimeException -> 0x009d }
        r3 = r3.af;	 Catch:{ RuntimeException -> 0x009d }
        r4 = p000.gt.as;	 Catch:{ RuntimeException -> 0x009d }
        if (r3 != r4) goto L_0x0093;
    L_0x0026:
        if (r0 < 0) goto L_0x0093;
    L_0x0028:
        r3 = r7.be;	 Catch:{ RuntimeException -> 0x009d }
        r0 = r3[r0];	 Catch:{ RuntimeException -> 0x009d }
        r3 = r0.an;	 Catch:{ RuntimeException -> 0x009d }
        r4 = 1263979533; // 0x4b56cc0d float:1.4076941E7 double:6.244888643E-315;
        r3 = r3 * r4;
        r4 = 39;
        if (r4 == r3) goto L_0x0060;
    L_0x0036:
        r4 = 40;
        if (r3 == r4) goto L_0x0060;
    L_0x003a:
        if (r3 == r6) goto L_0x0060;
    L_0x003c:
        r4 = 42;
        if (r3 == r4) goto L_0x0060;
    L_0x0040:
        r4 = 43;
        if (r4 == r3) goto L_0x0060;
    L_0x0044:
        r4 = 33;
        if (r4 == r3) goto L_0x0060;
    L_0x0048:
        r4 = 34;
        if (r3 == r4) goto L_0x0060;
    L_0x004c:
        r4 = 35;
        if (r4 == r3) goto L_0x0060;
    L_0x0050:
        r4 = 36;
        if (r3 == r4) goto L_0x0060;
    L_0x0054:
        r4 = 37;
        if (r3 == r4) goto L_0x0060;
    L_0x0058:
        r4 = 38;
        if (r3 == r4) goto L_0x0060;
    L_0x005c:
        r4 = 1005; // 0x3ed float:1.408E-42 double:4.965E-321;
        if (r3 != r4) goto L_0x0093;
    L_0x0060:
        r3 = -1767236695; // 0xffffffff96aa1ba9 float:-2.7482437E-25 double:NaN;
        r4 = r0.af;	 Catch:{ RuntimeException -> 0x009d }
        r3 = r3 * r4;
        r4 = -788254985; // 0xffffffffd1042ef7 float:-3.5482726E10 double:NaN;
        r0 = r0.ad;	 Catch:{ RuntimeException -> 0x009d }
        r4 = r4 * r0;
        r0 = 296896217; // 0x11b246d9 float:2.8127111E-28 double:1.46686221E-315;
        r5 = p000.hv.ad(r4, r0);	 Catch:{ RuntimeException -> 0x009d }
        r0 = -641677764; // 0xffffffffd9c0c63c float:-6.7826446E15 double:NaN;
        r0 = p000.ah.fy(r5, r0);	 Catch:{ RuntimeException -> 0x009d }
        r0 = r0 >> 28;
        r0 = r0 & 1;
        if (r0 == 0) goto L_0x0126;
    L_0x0080:
        r0 = r2;
    L_0x0081:
        if (r0 != 0) goto L_0x00b6;
    L_0x0083:
        r0 = -359010293; // 0xffffffffea99f00b float:-9.304961E25 double:NaN;
        r0 = p000.ah.fy(r5, r0);	 Catch:{ RuntimeException -> 0x009d }
        r0 = r0 >> 29;
        r0 = r0 & 1;
        if (r0 == 0) goto L_0x0123;
    L_0x0090:
        r0 = r2;
    L_0x0091:
        if (r0 != 0) goto L_0x00b6;
    L_0x0093:
        if (r1 != 0) goto L_0x0016;
    L_0x0095:
        r0 = 1174630738; // 0x46037152 float:8412.33 double:5.80344694E-315;
        r7.an(r0);	 Catch:{ RuntimeException -> 0x009d }
        goto L_0x0016;
    L_0x009d:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "il.af(";
        r1 = r1.append(r2);
        r1 = r1.append(r6);
        r1 = r1.toString();
        r0 = p000.ba.ad(r0, r1);
        throw r0;
    L_0x00b6:
        r0 = 0;
        p000.client.hv = r0;	 Catch:{ RuntimeException -> 0x009d }
        r0 = 0;
        p000.client.hi = r0;	 Catch:{ RuntimeException -> 0x009d }
        r0 = p000.hw.hq;	 Catch:{ RuntimeException -> 0x009d }
        if (r0 == 0) goto L_0x00c7;
    L_0x00c0:
        r0 = p000.hw.hq;	 Catch:{ RuntimeException -> 0x009d }
        r1 = 91;
        p000.client.fk(r0, r1);	 Catch:{ RuntimeException -> 0x009d }
    L_0x00c7:
        r0 = 1420664085; // 0x54ad9d15 float:5.9653179E12 double:7.019013187E-315;
        r0 = p000.hv.ad(r4, r0);	 Catch:{ RuntimeException -> 0x009d }
        p000.hw.hq = r0;	 Catch:{ RuntimeException -> 0x009d }
        r0 = -89716727; // 0xfffffffffaa70809 float:-4.3363827E35 double:NaN;
        r0 = r0 * r3;
        p000.client.hn = r0;	 Catch:{ RuntimeException -> 0x009d }
        r0 = p000.client.ao;	 Catch:{ RuntimeException -> 0x009d }
        r0 = r0.ay;	 Catch:{ RuntimeException -> 0x009d }
        r1 = 0;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x009d }
        r1 = 93235139; // 0x58ea7c3 float:1.3415242E-35 double:4.6064279E-316;
        r0 = r0 * r1;
        p000.client.he = r0;	 Catch:{ RuntimeException -> 0x009d }
        r0 = 2073084983; // 0x7b90c437 float:1.5033409E36 double:1.024240071E-314;
        r1 = p000.client.ao;	 Catch:{ RuntimeException -> 0x009d }
        r1 = r1.as;	 Catch:{ RuntimeException -> 0x009d }
        r3 = 0;
        r1 = r1[r3];	 Catch:{ RuntimeException -> 0x009d }
        r0 = r0 * r1;
        p000.client.hl = r0;	 Catch:{ RuntimeException -> 0x009d }
        r0 = p000.hw.hq;	 Catch:{ RuntimeException -> 0x009d }
        r1 = 80;
        p000.client.fk(r0, r1);	 Catch:{ RuntimeException -> 0x009d }
        r1 = r2;
        goto L_0x0093;
    L_0x00f9:
        r0 = p000.client.ao;	 Catch:{ RuntimeException -> 0x009d }
        r3 = 995562051; // 0x3b571243 float:0.0032817281 double:4.918730077E-315;
        r0.ax(r3);	 Catch:{ RuntimeException -> 0x009d }
    L_0x0101:
        r0 = -1238372643; // 0xffffffffb62feedd float:-2.6216069E-6 double:NaN;
        r7.bd(r0);	 Catch:{ RuntimeException -> 0x009d }
        r0 = -18;
        r0 = p000.ey.fl(r0);	 Catch:{ RuntimeException -> 0x009d }
        if (r0 != 0) goto L_0x0016;
    L_0x010f:
        r0 = 77;
        r0 = p000.au.fh(r0);	 Catch:{ RuntimeException -> 0x009d }
        if (r0 != 0) goto L_0x0016;
    L_0x0117:
        r0 = r7.bt;	 Catch:{ RuntimeException -> 0x009d }
        if (r0 == 0) goto L_0x0017;
    L_0x011b:
        r0 = 1699246627; // 0x65487223 float:5.916117E22 double:8.39539382E-315;
        r7.ad(r0);	 Catch:{ RuntimeException -> 0x009d }
        goto L_0x0016;
    L_0x0123:
        r0 = r1;
        goto L_0x0091;
    L_0x0126:
        r0 = r1;
        goto L_0x0081;
        */
        throw new UnsupportedOperationException("Method not decompiled: il.af(int):void");
    }

    public final void cm() {
        boolean z = false;
        ar(-2033946630);
        if (gt.af != client.ao.af) {
            if (!this.bh) {
                client.ao.ax(1789450605);
            } else {
                return;
            }
        }
        bd(-1718975485);
        if (!ey.fl(Byte.MIN_VALUE) && !au.fh((byte) 14)) {
            if (this.bt) {
                ad(1568299037);
                return;
            }
            int ba = ba(1113799801);
            if (client.ao.af == gt.as && ba >= 0) {
                js jsVar = this.be[ba];
                int i = jsVar.an * 1263979533;
                if (39 == i || i == 40 || i == 41 || i == 42 || 43 == i || 33 == i || i == 34 || 35 == i || i == 36 || i == 37 || i == 38 || i == 1005) {
                    boolean z2;
                    i = -1767236695 * jsVar.af;
                    int i2 = -788254985 * jsVar.ad;
                    ac ad = hv.ad(i2, 655325396);
                    if (((ah.fy(ad, -2136649119) >> 28) & 1) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        if (((ah.fy(ad, 169405808) >> 29) & 1) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                        }
                    }
                    client.hv = false;
                    client.hi = 0;
                    if (hw.hq != null) {
                        client.fk(hw.hq, (byte) 55);
                    }
                    hw.hq = hv.ad(i2, 2135042565);
                    client.hn = -89716727 * i;
                    client.he = client.ao.ay[0] * 93235139;
                    client.hl = 2073084983 * client.ao.as[0];
                    client.fk(hw.hq, (byte) 87);
                    z = true;
                }
            }
            if (!z) {
                an(1271553897);
            }
        }
    }

    void ad(int i) {
        try {
            if (client.ao.af == gt.an) {
                as(client.ao.ar[0], client.ao.aj[0], 1423336072);
            } else if (at(client.ao.ar[0], client.ao.aj[0], -143585847)) {
                bo((byte) -98);
                bw(588292992);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "il.ad(" + ')');
        }
    }

    void cq() {
        if (client.ao.af == gt.an) {
            as(client.ao.ar[0], client.ao.aj[0], 1423336072);
        } else if (at(client.ao.ar[0], client.ao.aj[0], -651597306)) {
            bo((byte) -8);
            bw(-647494307);
        }
    }

    void an(int i) {
        try {
            if (client.ao.af == gt.an && ((gi.eo(1832392767) && this.bu * 49382109 > 2 && !bl((byte) 1)) || am(ba(1285440320), 819377703))) {
                client.ao.ao(gt.aa, 1548604085);
            }
            if (this.bu * 49382109 <= 0) {
                return;
            }
            if (client.ao.af == gt.an) {
                ae(ba(-1662331780), -1337050522);
                client.ao.ao(gt.at, 1674895643);
            } else if (client.ao.af == gt.aa || client.ao.af == gt.ag) {
                aa(client.ao.ar[0], client.ao.aj[0], (byte) -27);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "il.an(" + ')');
        }
    }

    void cj() {
        if (client.ao.af == gt.an && ((gi.eo(1894496564) && this.bu * 49382109 > 2 && !bl((byte) 1)) || am(ba(-1640786783), -1873524097))) {
            client.ao.ao(gt.aa, 1499656457);
        }
        if (this.bu * 49382109 <= 0) {
            return;
        }
        if (client.ao.af == gt.an) {
            ae(ba(-1295744084), -1020579380);
            client.ao.ao(gt.at, 1602786529);
        } else if (client.ao.af == gt.aa || client.ao.af == gt.ag) {
            aa(client.ao.ar[0], client.ao.aj[0], (byte) 76);
        }
    }

    public static void aq(Collection collection, int i) {
        try {
            collection.add(ah.aa);
            collection.add(ah.ag);
        } catch (Throwable e) {
            throw ba.ad(e, "il.aq(" + ')');
        }
    }

    void aa(int i, int i2, byte b) {
        try {
            ay(i, i2, -1265880859);
            gp.en.bu(dq.hf * -1674539149, i, i2, false);
            this.bt = true;
            client.ao.ao(gt.aa, 1645226345);
        } catch (Throwable e) {
            throw ba.ad(e, "il.aa(" + ')');
        }
    }

    void cb(int i, int i2) {
        ay(i, i2, 711978760);
        gp.en.bu(dq.hf * -1674539149, i, i2, false);
        this.bt = true;
        client.ao.ao(gt.aa, 1571152312);
    }

    void cp(int i, int i2) {
        ay(i, i2, -1649656361);
        gp.en.bu(dq.hf * -1674539149, i, i2, false);
        this.bt = true;
        client.ao.ao(gt.aa, 1583326016);
    }

    void ct(int i, int i2) {
        ay(i, i2, 1408911596);
        gp.en.bu(dq.hf * -1674539149, i, i2, false);
        this.bt = true;
        client.ao.ao(gt.aa, 1375590229);
    }

    void cu(int i, int i2) {
        ay(i, i2, -1450469903);
        gp.en.bu(dq.hf * -1674539149, i, i2, false);
        this.bt = true;
        client.ao.ao(gt.aa, 1613184956);
    }

    void ag(int i) {
        try {
            ay((this.bf * 540597955) - ((this.bp * -388771065) / 2), (this.bv * 2056087335) - ((this.bx * -1806555973) / 2), 1215407331);
        } catch (Throwable e) {
            throw ba.ad(e, "il.ag(" + ')');
        }
    }

    void dc() {
        ay((this.bf * 908670465) - ((this.bp * -388771065) / 2), (this.bv * 1046555975) - ((this.bx * 643247873) / 2), -776344819);
    }

    void dj() {
        ay((this.bf * 540597955) - ((this.bp * -388771065) / 2), (this.bv * 2056087335) - ((this.bx * -1806555973) / 2), 1032692287);
    }

    void dk() {
        ay((this.bf * 565361205) - ((this.bp * -388771065) / 2), (this.bv * -700023980) - ((this.bx * 1014587620) / 2), 736454048);
    }

    void ay(int i, int i2, int i3) {
        try {
            int aa;
            int aa2 = this.ai.aa(jv.fi);
            int i4 = 0;
            while (i4 < this.bu * 49382109) {
                aa = this.ai.aa(ap(i4, (byte) 0));
                if (aa <= aa2) {
                    aa = aa2;
                }
                i4++;
                aa2 = aa;
            }
            i4 = aa2 + (this.ah * -1608768218);
            int i5 = ((this.az * 657357121) * ((this.bu * 49382109) + 1)) + 7;
            aa = i - (i4 / 2);
            if (aa + i4 > ds.rg * -1946576867) {
                aa = (ds.rg * -1946576867) - i4;
            }
            aa2 = aa < 0 ? 0 : aa;
            if (i5 + i2 > af.ru * 1616559063) {
                aa = (af.ru * 1616559063) - i5;
            } else {
                aa = i2;
            }
            if (aa < 0) {
                aa = 0;
            }
            this.bf = aa2 * -602652181;
            this.bv = aa * -478177129;
            this.bp = -635229513 * i4;
            this.bx = 2020900979 * i5;
        } catch (Throwable e) {
            throw ba.ad(e, "il.ay(" + ')');
        }
    }

    void m18do(int i, int i2) {
        int i3;
        int aa;
        int i4 = 0;
        int aa2 = this.ai.aa(jv.fi);
        for (i3 = 0; i3 < this.bu * -301589671; i3++) {
            aa = this.ai.aa(ap(i3, (byte) -98));
            if (aa > aa2) {
                aa2 = aa;
            }
        }
        aa = aa2 + (this.ah * -862041071);
        int i5 = ((this.az * 2018078165) * ((this.bu * 49382109) + 1)) + 7;
        i3 = i - (aa / 2);
        if (i3 + aa > ds.rg * -1046743572) {
            i3 = (ds.rg * -1946576867) - aa;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i5 + i2 > 1239367010 * af.ru) {
            aa2 = (1616559063 * af.ru) - i5;
        } else {
            aa2 = i2;
        }
        if (aa2 >= 0) {
            i4 = aa2;
        }
        this.bf = i3 * -602652181;
        this.bv = -478177129 * i4;
        this.bp = -1428721380 * aa;
        this.bx = 2020900979 * i5;
    }

    void dt(int i, int i2) {
        int i3;
        int aa;
        int i4 = 0;
        int aa2 = this.ai.aa(jv.fi);
        for (i3 = 0; i3 < this.bu * 49382109; i3++) {
            aa = this.ai.aa(ap(i3, (byte) -30));
            if (aa > aa2) {
                aa2 = aa;
            }
        }
        aa = aa2 + (this.ah * -1608768218);
        int i5 = ((this.az * 1861503825) * ((this.bu * 1871600603) + 1)) + 7;
        i3 = i - (aa / 2);
        if (i3 + aa > ds.rg * 2129698936) {
            i3 = (ds.rg * -139711739) - aa;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i5 + i2 > 1616559063 * af.ru) {
            aa2 = (-1401429197 * af.ru) - i5;
        } else {
            aa2 = i2;
        }
        if (aa2 >= 0) {
            i4 = aa2;
        }
        this.bf = i3 * -602652181;
        this.bv = -478177129 * i4;
        this.bp = -635229513 * aa;
        this.bx = -1675883299 * i5;
    }

    void as(int i, int i2, int i3) {
        try {
            if (this.bt) {
                int i4 = 0;
                while (i4 < this.bu * 49382109) {
                    if (aj(i, i2, (((this.az * 657357121) + (this.bv * 2056087335)) + 3) + ((this.az * 657357121) * (((this.bu * 49382109) - 1) - i4)), -1034753999)) {
                        break;
                    }
                    i4++;
                }
                i4 = -1;
                if (-1 != i4) {
                    ae(i4, 316645458);
                }
                bo((byte) -86);
                bw(-1493012930);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "il.as(" + ')');
        }
    }

    void dd(int i, int i2) {
        if (this.bt) {
            int i3 = 0;
            while (i3 < this.bu * 49382109) {
                if (aj(i, i2, (((this.az * 657357121) + (this.bv * 2056087335)) + 3) + ((this.az * 657357121) * (((this.bu * 49382109) - 1) - i3)), -1955898088)) {
                    break;
                }
                i3++;
            }
            i3 = -1;
            if (-1 != i3) {
                ae(i3, 311650173);
            }
            bo((byte) -42);
            bw(1100916607);
        }
    }

    void dl(int i, int i2) {
        if (this.bt) {
            int i3 = 0;
            while (i3 < 261445251 * this.bu) {
                if (aj(i, i2, (((this.az * 56916955) + (this.bv * 1189868849)) + 3) + ((657357121 * this.az) * (((49382109 * this.bu) - 1) - i3)), -617528558)) {
                    break;
                }
                i3++;
            }
            i3 = -1;
            if (-1 != i3) {
                ae(i3, -874063362);
            }
            bo((byte) -87);
            bw(-1264313576);
        }
    }

    void dv(int i, int i2) {
        if (this.bt) {
            int i3 = 0;
            while (i3 < 49382109 * this.bu) {
                if (aj(i, i2, (((this.az * 657357121) + (this.bv * 528433511)) + 3) + ((this.az * 657357121) * (((1814166162 * this.bu) - 1) - i3)), 674349953)) {
                    break;
                }
                i3++;
            }
            i3 = -1;
            if (-1 != i3) {
                ae(i3, -740430836);
            }
            bo((byte) -79);
            bw(-939480026);
        }
    }

    void dz(int i, int i2) {
        if (this.bt) {
            int i3 = 0;
            while (i3 < 49382109 * this.bu) {
                if (aj(i, i2, (((this.az * 1573233624) + (this.bv * -1334930311)) + 3) + ((694146850 * this.az) * (((-659614238 * this.bu) - 1) - i3)), -1988386715)) {
                    break;
                }
                i3++;
            }
            i3 = -1;
            if (-1 != i3) {
                ae(i3, -688417250);
            }
            bo((byte) -43);
            bw(-1153360615);
        }
    }

    void ar(int i) {
        try {
            this.br -= 1860761747;
        } catch (Throwable e) {
            throw ba.ad(e, "il.ar(" + ')');
        }
    }

    void da() {
        this.br -= 1860761747;
    }

    void de() {
        this.br -= 1860761747;
    }

    void di() {
        this.br -= 1860761747;
    }

    void dr() {
        this.br += 1558403620;
    }

    void ds() {
        this.br += 851728481;
    }

    void dw() {
        this.br += 322620496;
    }

    boolean aj(int i, int i2, int i3, int i4) {
        try {
            if (client.ao.af == gt.aa || i <= this.bf * 540597955 || i >= (this.bp * -388771065) + (this.bf * 540597955) || i2 < i3) {
                return false;
            }
            if (i2 > ((this.az * 657357121) + i3) - 1) {
                return false;
            }
            return true;
        } catch (Throwable e) {
            throw ba.ad(e, "il.aj(" + ')');
        }
    }

    boolean dh(int i, int i2, int i3) {
        if (client.ao.af == gt.aa || i <= this.bf * 540597955) {
            return false;
        }
        if (i >= (this.bp * -388771065) + (this.bf * 540597955)) {
            return false;
        }
        if (i2 < i3 || i2 > ((this.az * 657357121) + i3) - 1) {
            return false;
        }
        return true;
    }

    boolean dx(int i, int i2, int i3) {
        if (client.ao.af == gt.aa || i <= -272319477 * this.bf) {
            return false;
        }
        if (i >= (this.bp * 935963454) + (540597955 * this.bf)) {
            return false;
        }
        if (i2 < i3 || i2 > ((this.az * 657357121) + i3) - 1) {
            return false;
        }
        return true;
    }

    final void ae(int i, int i2) {
        if (i >= 0) {
            try {
                aq(this.be[i], client.ao.ay[0], client.ao.as[0], -2015984486);
            } catch (Throwable e) {
                throw ba.ad(e, "il.ae(" + ')');
            }
        }
    }

    final void dn(int i) {
        if (i >= 0) {
            aq(this.be[i], client.ao.ay[0], client.ao.as[0], -1984671439);
        }
    }

    final void dy(int i) {
        if (i >= 0) {
            aq(this.be[i], client.ao.ay[0], client.ao.as[0], -2014742351);
        }
    }

    final void aq(js jsVar, int i, int i2, int i3) {
        try {
            int i4;
            no ad;
            ia iaVar;
            int i5;
            no ad2;
            ac ad3;
            String str = jsVar.ag;
            String str2 = jsVar.ay;
            int i6 = -1767236695 * jsVar.af;
            int i7 = -788254985 * jsVar.ad;
            int i8 = jsVar.an * 1263979533;
            int i9 = -639129367 * jsVar.aa;
            if (i8 >= 2000) {
                i4 = i8 - 2000;
            } else {
                i4 = i8;
            }
            if (i4 == 18) {
                client.mj = -751012115 * i6;
                client.mw = 637696707 * i7;
                ad = ik.ad(nr.cw, client.dv.ag, (byte) 60);
                ad.an.aa(i9, -1752508204);
                iaVar = ad.an;
                if (client.ao.ac(82, (byte) -81)) {
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                iaVar.an(i5, (byte) 31);
                ad.an.aa((gl.dp * 1289967967) + i7, -1752508204);
                ad.an.ci((bq.du * 1407993063) + i6, 1239940751);
                client.dv.an(ad, (short) 255);
            }
            if (29 == i4) {
                ad2 = ik.ad(nr.cg, client.dv.ag, (byte) 54);
                ad2.an.ay(i7, (short) 128);
                client.dv.an(ad2, (short) 255);
                ad3 = hv.ad(i7, 1780611244);
                if (ad3.fd != null && 5 == ad3.fd[0][0]) {
                    int i10 = ad3.fd[0][1];
                    if (ad3.fk[0] != al.an[i10]) {
                        al.an[i10] = ad3.fk[0];
                        em.fp(i10, 1506325001);
                    }
                }
            }
            if (i4 == bb.cl || gs.cs == i4 || i4 == ij.cd || i4 == ge.ch || i4 == ek.cm) {
                et.pz.cn(i4, i9, new bb(i6), new bb(i7), 542013313);
            }
            if (47 == i4 && client.hb[i9] != null) {
                client.mj = -751012115 * i6;
                client.mw = 637696707 * i7;
                ad = ik.ad(nr.al, client.dv.ag, (byte) 81);
                iaVar = ad.an;
                if (client.ao.ac(82, (byte) -63)) {
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                iaVar.an(i5, (byte) 31);
                ad.an.cc(i9, (byte) 1);
                client.dv.an(ad, (short) 255);
            }
            if (i4 == 22) {
                client.mj = -751012115 * i6;
                client.mw = 637696707 * i7;
                ad = ik.ad(nr.bu, client.dv.ag, (byte) 28);
                ad.an.cc((gl.dp * 1289967967) + i7, (byte) 1);
                ad.an.co(i9, -1125056560);
                iaVar = ad.an;
                if (client.ao.ac(82, (byte) -67)) {
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                iaVar.bd(i5, 1703184995);
                ad.an.co((1407993063 * bq.du) + i6, 737620875);
                client.dv.an(ad, (short) 255);
            }
            if (12 == i4 && client.ca[i9] != null) {
                client.mj = -751012115 * i6;
                client.mw = 637696707 * i7;
                ad = ik.ad(nr.bp, client.dv.ag, (byte) 15);
                iaVar = ad.an;
                if (client.ao.ac(82, (byte) -79)) {
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                iaVar.bd(i5, 1703184995);
                ad.an.co(i9, -304911074);
                client.dv.an(ad, (short) 255);
            }
            if (i4 == 1) {
                client.mj = -751012115 * i6;
                client.mw = 637696707 * i7;
                ad = ik.ad(nr.bd, client.dv.ag, (byte) 54);
                ad.an.ci((1407993063 * bq.du) + i6, 1239940751);
                ad.an.co(gw.ja * -276269945, -915327768);
                iaVar = ad.an;
                if (client.ao.ac(82, (byte) -11)) {
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                iaVar.bs(i5, 537618701);
                ad.an.cc((1289967967 * gl.dp) + i7, (byte) 1);
                ad.an.aa(fw.iz * -1350374213, -1752508204);
                ad.an.cc(i9, (byte) 1);
                ad.an.cj(-553333807 * fy.ix, -2078477497);
                client.dv.an(ad, (short) 255);
            }
            if (1001 == i4) {
                client.mj = -751012115 * i6;
                client.mw = 637696707 * i7;
                ad = ik.ad(nr.ah, client.dv.ag, (byte) 42);
                ad.an.co((gl.dp * 1289967967) + i7, -2123764556);
                iaVar = ad.an;
                if (client.ao.ac(82, (byte) -7)) {
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                iaVar.bs(i5, 537618701);
                ad.an.cc((bq.du * 1407993063) + i6, (byte) 1);
                ad.an.cc(i9, (byte) 1);
                client.dv.an(ad, (short) 255);
            }
            if (1002 == i4) {
                ad2 = ik.ad(nr.dz, client.dv.ag, (byte) -5);
                ad2.an.co(i9, -1912512808);
                client.dv.an(ad2, (short) 255);
            }
            if (51 == i4 && client.hb[i9] != null) {
                client.mj = -751012115 * i6;
                client.mw = 637696707 * i7;
                ad = ik.ad(nr.ad, client.dv.ag, (byte) -53);
                iaVar = ad.an;
                if (client.ao.ac(82, (byte) -29)) {
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                iaVar.bs(i5, 537618701);
                ad.an.aa(i9, -1752508204);
                client.dv.an(ad, (short) 255);
            }
            if (i4 == 38) {
                nq.ii.az(1100011086);
                ad3 = hv.ad(i7, 875529582);
                client.jb = 386301539;
                gw.ja = 1157501239 * i6;
                fy.ix = 213740849 * i7;
                fw.iz = -1540851597 * i9;
                client.fk(ad3, (byte) 21);
                client.it = gg.ad(16748608, (short) 300) + cm.af(i9, 1133439166).ak + gg.ad(16777215, (short) 300);
                if (client.it == null) {
                    client.it = jv.aj;
                }
            } else {
                if (i4 == 1005) {
                    ad3 = hv.ad(i7, 1056640217);
                    if (ad3 == null || ad3.fb[i6] < 100000) {
                        ad2 = ik.ad(nr.dh, client.dv.ag, (byte) 30);
                        ad2.an.ci(i9, 1239940751);
                        client.dv.an(ad2, (short) 255);
                    } else {
                        ax.af(27, "", ad3.fb[i6] + " x " + cm.af(i9, 2069454125).ak, 1716799776);
                    }
                    client.hk = 0;
                    ae.hj = hv.ad(i7, 150499357);
                    client.hg = 1781011561 * i6;
                }
                if (42 == i4) {
                    ad2 = ik.ad(nr.bo, client.dv.ag, (byte) -70);
                    ad2.an.co(i9, -914114671);
                    ad2.an.cc(i6, (byte) 1);
                    ad2.an.cq(i7, 1242192116);
                    client.dv.an(ad2, (short) 255);
                    client.hk = 0;
                    ae.hj = hv.ad(i7, 846386175);
                    client.hg = 1781011561 * i6;
                }
                if (7 == i4 && client.ca[i9] != null) {
                    client.mj = -751012115 * i6;
                    client.mw = 637696707 * i7;
                    ad = ik.ad(nr.ac, client.dv.ag, (byte) 22);
                    iaVar = ad.an;
                    if (client.ao.ac(82, (byte) -39)) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    iaVar.bd(i5, 1703184995);
                    ad.an.cq(-553333807 * fy.ix, 1242192116);
                    ad.an.ci(gw.ja * -276269945, 1239940751);
                    ad.an.co(-1350374213 * fw.iz, -1203890785);
                    ad.an.aa(i9, -1752508204);
                    client.dv.an(ad, (short) 255);
                }
                if (i4 == 57 || 1007 == i4) {
                    ad3 = jd.an(i7, i6, (byte) 74);
                    if (ad3 != null) {
                        gp.ep(i9, i7, i6, -868539721 * ad3.fr, str2, 1292975959);
                    }
                }
                if (i4 == 43) {
                    ad2 = ik.ad(nr.ch, client.dv.ag, (byte) 4);
                    ad2.an.aa(i9, -1752508204);
                    ad2.an.ci(i6, 1239940751);
                    ad2.an.ay(i7, (short) 128);
                    client.dv.an(ad2, (short) 255);
                    client.hk = 0;
                    ae.hj = hv.ad(i7, 1219052589);
                    client.hg = 1781011561 * i6;
                }
                if (4 == i4) {
                    client.mj = -751012115 * i6;
                    client.mw = 637696707 * i7;
                    ad = ik.ad(nr.bf, client.dv.ag, (byte) -36);
                    ad.an.ci((1407993063 * bq.du) + i6, 1239940751);
                    iaVar = ad.an;
                    if (client.ao.ac(82, (byte) -8)) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    iaVar.bs(i5, 537618701);
                    ad.an.aa((gl.dp * 1289967967) + i7, -1752508204);
                    ad.an.co(i9, 2085123178);
                    client.dv.an(ad, (short) 255);
                }
                if (39 == i4) {
                    ad2 = ik.ad(nr.bt, client.dv.ag, (byte) 8);
                    ad2.an.ci(i9, 1239940751);
                    ad2.an.aa(i6, -1752508204);
                    ad2.an.cj(i7, -2095988772);
                    client.dv.an(ad2, (short) 255);
                    client.hk = 0;
                    ae.hj = hv.ad(i7, 1356425772);
                    client.hg = 1781011561 * i6;
                }
                if (28 == i4) {
                    ad2 = ik.ad(nr.cg, client.dv.ag, (byte) -23);
                    ad2.an.ay(i7, (short) 128);
                    client.dv.an(ad2, (short) 255);
                    ad3 = hv.ad(i7, 1761753090);
                    if (ad3.fd != null && 5 == ad3.fd[0][0]) {
                        i5 = ad3.fd[0][1];
                        al.an[i5] = 1 - al.an[i5];
                        em.fp(i5, 1406343882);
                    }
                }
                if (i4 == 40) {
                    ad2 = ik.ad(nr.aw, client.dv.ag, (byte) 89);
                    ad2.an.aa(i6, -1752508204);
                    ad2.an.cj(i7, -2145730007);
                    ad2.an.ci(i9, 1239940751);
                    client.dv.an(ad2, (short) 255);
                    client.hk = 0;
                    ae.hj = hv.ad(i7, 1489654485);
                    client.hg = 1781011561 * i6;
                }
                if (i4 == 3) {
                    client.mj = -751012115 * i6;
                    client.mw = 637696707 * i7;
                    ad = ik.ad(nr.bv, client.dv.ag, (byte) 68);
                    ad.an.cc(i9, (byte) 1);
                    ad.an.co((1289967967 * gl.dp) + i7, -1960063306);
                    ad.an.co((1407993063 * bq.du) + i6, -930005508);
                    iaVar = ad.an;
                    if (client.ao.ac(82, (byte) -63)) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    iaVar.bm(i5, -1578846474);
                    client.dv.an(ad, (short) 255);
                }
                if (16 == i4) {
                    client.mj = -751012115 * i6;
                    client.mw = 637696707 * i7;
                    ad = ik.ad(nr.dv, client.dv.ag, (byte) -70);
                    ad.an.co(i9, -1090533460);
                    ad.an.co((bq.du * 1407993063) + i6, -18235819);
                    ad.an.cj(fy.ix * -553333807, -2133253020);
                    iaVar = ad.an;
                    if (client.ao.ac(82, (byte) -125)) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    iaVar.bd(i5, 1703184995);
                    ad.an.aa(-276269945 * gw.ja, -1752508204);
                    ad.an.cc((1289967967 * gl.dp) + i7, (byte) 1);
                    ad.an.aa(fw.iz * -1350374213, -1752508204);
                    client.dv.an(ad, (short) 255);
                }
                if (i4 == 11 && client.ca[i9] != null) {
                    client.mj = -751012115 * i6;
                    client.mw = 637696707 * i7;
                    ad = ik.ad(nr.cc, client.dv.ag, (byte) -78);
                    iaVar = ad.an;
                    if (client.ao.ac(82, (byte) -78)) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    iaVar.bs(i5, 537618701);
                    ad.an.ci(i9, 1239940751);
                    client.dv.an(ad, (short) 255);
                }
                if (i4 == 2) {
                    client.mj = -751012115 * i6;
                    client.mw = 637696707 * i7;
                    ad = ik.ad(nr.cq, client.dv.ag, (byte) -14);
                    ad.an.bs(client.ao.ac(82, (byte) -21) ? 1 : 0, 537618701);
                    ad.an.cc((bq.du * 1407993063) + i6, (byte) 1);
                    ad.an.co(i9, 1537563110);
                    ad.an.aa(nq.ii.au(-2088941506), -1752508204);
                    ad.an.ay(nq.ii.ax(-427674744), (short) 128);
                    ad.an.co((gl.dp * 1289967967) + i7, 361082664);
                    client.dv.an(ad, (short) 255);
                }
                if (i4 == 41) {
                    ad2 = ik.ad(nr.cm, client.dv.ag, (byte) -15);
                    ad2.an.ay(i7, (short) 128);
                    ad2.an.aa(i9, -1752508204);
                    ad2.an.ci(i6, 1239940751);
                    client.dv.an(ad2, (short) 255);
                    client.hk = 0;
                    ae.hj = hv.ad(i7, 28245569);
                    client.hg = 1781011561 * i6;
                }
                if (9 == i4 && client.ca[i9] != null) {
                    client.mj = -751012115 * i6;
                    client.mw = 637696707 * i7;
                    ad = ik.ad(nr.f7do, client.dv.ag, (byte) 19);
                    ad.an.cc(i9, (byte) 1);
                    iaVar = ad.an;
                    if (client.ao.ac(82, (byte) -72)) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    iaVar.bm(i5, -513895889);
                    client.dv.an(ad, (short) 255);
                }
                if (i4 == 50 && client.hb[i9] != null) {
                    client.mj = -751012115 * i6;
                    client.mw = 637696707 * i7;
                    ad = ik.ad(nr.av, client.dv.ag, (byte) 9);
                    ad.an.cc(i9, (byte) 1);
                    iaVar = ad.an;
                    if (client.ao.ac(82, (byte) -39)) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    iaVar.bd(i5, 1703184995);
                    client.dv.an(ad, (short) 255);
                }
                if (i4 == 17) {
                    client.mj = -751012115 * i6;
                    client.mw = 637696707 * i7;
                    ad = ik.ad(nr.dn, client.dv.ag, (byte) -60);
                    ad.an.ci((1289967967 * gl.dp) + i7, 1239940751);
                    ad.an.co(nq.ii.au(1443596444), -848118917);
                    ad.an.cc((1407993063 * bq.du) + i6, (byte) 1);
                    iaVar = ad.an;
                    if (client.ao.ac(82, (byte) -93)) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    iaVar.bm(i5, -158246229);
                    ad.an.cj(nq.ii.ax(-1012919451), -2074196658);
                    ad.an.co(i9, -1007939809);
                    client.dv.an(ad, (short) 255);
                }
                if (23 == i4) {
                    if (nq.ii.bq(1519600835)) {
                        gp.en.be();
                    } else {
                        gp.en.bu(-1674539149 * dq.hf, i6, i7, true);
                    }
                }
                if (45 == i4 && client.hb[i9] != null) {
                    client.mj = -751012115 * i6;
                    client.mw = 637696707 * i7;
                    ad = ik.ad(nr.ai, client.dv.ag, (byte) 28);
                    iaVar = ad.an;
                    if (client.ao.ac(82, (byte) -64)) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    iaVar.bs(i5, 537618701);
                    ad.an.co(i9, 745995515);
                    client.dv.an(ad, (short) 255);
                }
                if (i4 == 26) {
                    gw.fg(-1265034995);
                }
                if (i4 == 8 && client.ca[i9] != null) {
                    client.mj = -751012115 * i6;
                    client.mw = 637696707 * i7;
                    ad = ik.ad(nr.dt, client.dv.ag, (byte) 50);
                    ad.an.cj(nq.ii.ax(-1053849862), -2082391368);
                    ad.an.aa(i9, -1752508204);
                    ad.an.bm(client.ao.ac(82, (byte) -19) ? 1 : 0, 114768861);
                    ad.an.cc(nq.ii.au(2091008113), (byte) 1);
                    client.dv.an(ad, (short) 255);
                }
                if (i4 == 48 && client.hb[i9] != null) {
                    client.mj = -751012115 * i6;
                    client.mw = 637696707 * i7;
                    ad = ik.ad(nr.cx, client.dv.ag, (byte) -57);
                    iaVar = ad.an;
                    if (client.ao.ac(82, (byte) -16)) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    iaVar.bm(i5, -1604309768);
                    ad.an.ci(i9, 1239940751);
                    client.dv.an(ad, (short) 255);
                }
                if (37 == i4) {
                    ad2 = ik.ad(nr.ct, client.dv.ag, (byte) -60);
                    ad2.an.co(i6, 1004428328);
                    ad2.an.aa(i9, -1752508204);
                    ad2.an.cq(i7, 1242192116);
                    client.dv.an(ad2, (short) 255);
                    client.hk = 0;
                    ae.hj = hv.ad(i7, 1807674608);
                    client.hg = 1781011561 * i6;
                }
                if (46 == i4 && client.hb[i9] != null) {
                    client.mj = -751012115 * i6;
                    client.mw = 637696707 * i7;
                    ad = ik.ad(nr.an, client.dv.ag, (byte) 18);
                    iaVar = ad.an;
                    if (client.ao.ac(82, (byte) -62)) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    iaVar.an(i5, (byte) 31);
                    ad.an.ci(i9, 1239940751);
                    client.dv.an(ad, (short) 255);
                }
                if (13 == i4 && client.ca[i9] != null) {
                    client.mj = -751012115 * i6;
                    client.mw = 637696707 * i7;
                    ad = ik.ad(nr.bh, client.dv.ag, (byte) -59);
                    ad.an.ci(i9, 1239940751);
                    iaVar = ad.an;
                    if (client.ao.ac(82, Byte.MIN_VALUE)) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    iaVar.an(i5, (byte) 31);
                    client.dv.an(ad, (short) 255);
                }
                if (33 == i4) {
                    ad2 = ik.ad(nr.bz, client.dv.ag, (byte) -84);
                    ad2.an.co(i9, 966267974);
                    ad2.an.aa(i6, -1752508204);
                    ad2.an.cj(i7, -2137309248);
                    client.dv.an(ad2, (short) 255);
                    client.hk = 0;
                    ae.hj = hv.ad(i7, 1511803923);
                    client.hg = 1781011561 * i6;
                }
                if (15 == i4 && client.hb[i9] != null) {
                    client.mj = -751012115 * i6;
                    client.mw = 637696707 * i7;
                    ad = ik.ad(nr.cu, client.dv.ag, (byte) 23);
                    ad.an.cc(nq.ii.au(495769309), (byte) 1);
                    ad.an.cj(nq.ii.ax(1608689937), -2143824360);
                    iaVar = ad.an;
                    if (client.ao.ac(82, (byte) -64)) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    iaVar.bd(i5, 1703184995);
                    ad.an.ci(i9, 1239940751);
                    client.dv.an(ad, (short) 255);
                }
                if (19 == i4) {
                    client.mj = -751012115 * i6;
                    client.mw = 637696707 * i7;
                    ad = ik.ad(nr.af, client.dv.ag, (byte) -27);
                    ad.an.ci((bq.du * 1407993063) + i6, 1239940751);
                    ad.an.aa((gl.dp * 1289967967) + i7, -1752508204);
                    ad.an.ci(i9, 1239940751);
                    iaVar = ad.an;
                    if (client.ao.ac(82, (byte) -109)) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    iaVar.bs(i5, 537618701);
                    client.dv.an(ad, (short) 255);
                }
                if (31 == i4) {
                    ad2 = ik.ad(nr.dw, client.dv.ag, (byte) -55);
                    ad2.an.aa(gw.ja * -276269945, -1752508204);
                    ad2.an.ay(-553333807 * fy.ix, (short) 128);
                    ad2.an.cc(i9, (byte) 1);
                    ad2.an.cc(i6, (byte) 1);
                    ad2.an.cj(i7, -2071253310);
                    ad2.an.cc(fw.iz * -1350374213, (byte) 1);
                    client.dv.an(ad2, (short) 255);
                    client.hk = 0;
                    ae.hj = hv.ad(i7, 32235108);
                    client.hg = 1781011561 * i6;
                }
                if (i4 == 1004) {
                    ad2 = ik.ad(nr.dh, client.dv.ag, (byte) -36);
                    ad2.an.ci(i9, 1239940751);
                    client.dv.an(ad2, (short) 255);
                }
                if (6 == i4) {
                    client.mj = -751012115 * i6;
                    client.mw = 637696707 * i7;
                    ad = ik.ad(nr.bg, client.dv.ag, (byte) -49);
                    iaVar = ad.an;
                    if (client.ao.ac(82, (byte) -73)) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    iaVar.bm(i5, -516402789);
                    ad.an.ci((1407993063 * bq.du) + i6, 1239940751);
                    ad.an.aa(i9, -1752508204);
                    ad.an.cc((gl.dp * 1289967967) + i7, (byte) 1);
                    client.dv.an(ad, (short) 255);
                }
                if (i4 == 34) {
                    ad2 = ik.ad(nr.cv, client.dv.ag, (byte) 31);
                    ad2.an.cq(i7, 1242192116);
                    ad2.an.co(i6, 1964450504);
                    ad2.an.aa(i9, -1752508204);
                    client.dv.an(ad2, (short) 255);
                    client.hk = 0;
                    ae.hj = hv.ad(i7, 1695059109);
                    client.hg = 1781011561 * i6;
                }
                if (i4 == 21) {
                    client.mj = -751012115 * i6;
                    client.mw = 637696707 * i7;
                    ad = ik.ad(nr.bb, client.dv.ag, (byte) -107);
                    ad.an.ci(i9, 1239940751);
                    ad.an.co((1407993063 * bq.du) + i6, -548092841);
                    iaVar = ad.an;
                    if (client.ao.ac(82, (byte) -119)) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    iaVar.bd(i5, 1703184995);
                    ad.an.co((1289967967 * gl.dp) + i7, -1109380507);
                    client.dv.an(ad, (short) 255);
                }
                if (44 == i4 && client.hb[i9] != null) {
                    client.mj = -751012115 * i6;
                    client.mw = 637696707 * i7;
                    ad = ik.ad(nr.am, client.dv.ag, (byte) 81);
                    ad.an.co(i9, 996880918);
                    iaVar = ad.an;
                    if (client.ao.ac(82, (byte) -46)) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    iaVar.bd(i5, 1703184995);
                    client.dv.an(ad, (short) 255);
                }
                if (i4 == 5) {
                    client.mj = -751012115 * i6;
                    client.mw = 637696707 * i7;
                    ad = ik.ad(nr.by, client.dv.ag, (byte) -67);
                    ad.an.co((1289967967 * gl.dp) + i7, 1077266078);
                    ad.an.aa(i9, -1752508204);
                    iaVar = ad.an;
                    if (client.ao.ac(82, (byte) -37)) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    iaVar.bs(i5, 537618701);
                    ad.an.aa((1407993063 * bq.du) + i6, -1752508204);
                    client.dv.an(ad, (short) 255);
                }
                if (25 == i4) {
                    ac an = jd.an(i7, i6, (byte) 62);
                    if (an != null) {
                        String str3;
                        String str4;
                        nq.ii.az(1255106392);
                        nq.ii.ai(i7, i6, (ah.fy(an, -1309328222) >> 11) & 63, an.fr * -868539721, 768992128);
                        client.jb = 0;
                        if (((ah.fy(an, -1155090710) >> 11) & 63) == 0) {
                            str3 = null;
                        } else if (an.dm == null || an.dm.trim().length() == 0) {
                            str3 = null;
                        } else {
                            str3 = an.dm;
                        }
                        if (str3 == null) {
                            str4 = "Null";
                        } else {
                            str4 = str3;
                        }
                        if (an.az) {
                            str3 = an.dw + gg.ad(16777215, (short) 300);
                        } else {
                            str3 = gg.ad(65280, (short) 300) + an.fa + gg.ad(16777215, (short) 300);
                        }
                        nq.ii.ah(str4, str3, (byte) -72);
                    }
                } else {
                    if (i4 == 20) {
                        client.mj = -751012115 * i6;
                        client.mw = 637696707 * i7;
                        ad = ik.ad(nr.au, client.dv.ag, (byte) -41);
                        ad.an.aa(i9, -1752508204);
                        iaVar = ad.an;
                        if (client.ao.ac(82, (byte) -83)) {
                            i5 = 1;
                        } else {
                            i5 = 0;
                        }
                        iaVar.bd(i5, 1703184995);
                        ad.an.cc((1407993063 * bq.du) + i6, (byte) 1);
                        ad.an.cc((gl.dp * 1289967967) + i7, (byte) 1);
                        client.dv.an(ad, (short) 255);
                    }
                    if (i4 == 36) {
                        ad2 = ik.ad(nr.dk, client.dv.ag, (byte) -48);
                        ad2.an.ci(i6, 1239940751);
                        ad2.an.cj(i7, -2073275081);
                        ad2.an.ci(i9, 1239940751);
                        client.dv.an(ad2, (short) 255);
                        client.hk = 0;
                        ae.hj = hv.ad(i7, 340197472);
                        client.hg = 1781011561 * i6;
                    }
                    if (58 == i4) {
                        ad3 = jd.an(i7, i6, (byte) 63);
                        if (ad3 != null) {
                            ad = ik.ad(nr.cb, client.dv.ag, (byte) -63);
                            ad.an.cm(i7, (byte) -55);
                            ad.an.cq(nq.ii.ax(1473902534), 1242192116);
                            ad.an.cc(i6, (byte) 1);
                            ad.an.co(nq.ii.au(-2054775977), 1474426412);
                            ad.an.co(ad3.fr * -868539721, 791737749);
                            ad.an.co(nq.ii.av(-1570774984), -1845593143);
                            client.dv.an(ad, (short) 255);
                        }
                    }
                    if (i4 == 10 && client.ca[i9] != null) {
                        client.mj = -751012115 * i6;
                        client.mw = 637696707 * i7;
                        ad = ik.ad(nr.ca, client.dv.ag, (byte) 121);
                        ad.an.aa(i9, -1752508204);
                        ad.an.an(client.ao.ac(82, (byte) -116) ? 1 : 0, (byte) 31);
                        client.dv.an(ad, (short) 255);
                    }
                    if (30 == i4 && client.jv == null) {
                        jv.ec(i7, i6, (byte) 0);
                        client.jv = jd.an(i7, i6, (byte) 60);
                        client.fk(client.jv, (byte) 78);
                    }
                    if (32 == i4) {
                        ad2 = ik.ad(nr.bm, client.dv.ag, (byte) -24);
                        ad2.an.cj(i7, -2106327366);
                        ad2.an.cc(i9, (byte) 1);
                        ad2.an.ci(nq.ii.au(1082293618), 1239940751);
                        ad2.an.cc(i6, (byte) 1);
                        ad2.an.cm(nq.ii.ax(1308896100), (byte) -14);
                        client.dv.an(ad2, (short) 255);
                        client.hk = 0;
                        ae.hj = hv.ad(i7, 1268216435);
                        client.hg = 1781011561 * i6;
                    }
                    if (35 == i4) {
                        ad2 = ik.ad(nr.at, client.dv.ag, (byte) -10);
                        ad2.an.co(i6, 1875424065);
                        ad2.an.ay(i7, (short) 128);
                        ad2.an.ci(i9, 1239940751);
                        client.dv.an(ad2, (short) 255);
                        client.hk = 0;
                        ae.hj = hv.ad(i7, 192105944);
                        client.hg = 1781011561 * i6;
                    }
                    if (24 == i4) {
                        ac ad4 = hv.ad(i7, 460580509);
                        boolean z = true;
                        if (ad4.au * -586529633 > 0) {
                            z = aw.fu(ad4, -1871850927);
                        }
                        if (z) {
                            ad2 = ik.ad(nr.cg, client.dv.ag, (byte) -82);
                            ad2.an.ay(i7, (short) 128);
                            client.dv.an(ad2, (short) 255);
                        }
                    }
                    if (1003 == i4) {
                        gm gmVar = client.ca[i9];
                        if (gmVar != null) {
                            au auVar = gmVar.af;
                            if (auVar.bg != null) {
                                auVar = auVar.ar(2125288365);
                            }
                            if (auVar != null) {
                                ad = ik.ad(nr.cn, client.dv.ag, (byte) -20);
                                ad.an.co(auVar.ag * 602799879, -644842370);
                                client.dv.an(ad, (short) 255);
                            }
                        }
                    }
                    if (14 == i4 && client.hb[i9] != null) {
                        client.mj = -751012115 * i6;
                        client.mw = 637696707 * i7;
                        ad = ik.ad(nr.cj, client.dv.ag, (byte) -88);
                        ad.an.cq(-553333807 * fy.ix, 1242192116);
                        ad.an.aa(-276269945 * gw.ja, -1752508204);
                        ad.an.co(i9, 798865854);
                        ad.an.co(-1350374213 * fw.iz, -542676729);
                        ad.an.an(client.ao.ac(82, (byte) -20) ? 1 : 0, (byte) 31);
                        client.dv.an(ad, (short) 255);
                    }
                    if (49 == i4 && client.hb[i9] != null) {
                        client.mj = -751012115 * i6;
                        client.mw = 637696707 * i7;
                        no ad5 = ik.ad(nr.as, client.dv.ag, (byte) -35);
                        ad5.an.ci(i9, 1239940751);
                        ia iaVar2 = ad5.an;
                        if (client.ao.ac(82, (byte) -33)) {
                            i5 = 1;
                        } else {
                            i5 = 0;
                        }
                        iaVar2.bd(i5, 1703184995);
                        client.dv.an(ad5, (short) 255);
                    }
                    if (client.jb * 430699339 != 0) {
                        client.jb = 0;
                        client.fk(hv.ad(fy.ix * -553333807, 2106574762), (byte) 34);
                    }
                    if (nq.ii.ak(-1342045327)) {
                        nq.ii.az(1930004819);
                    }
                    if (ae.hj != null && 1099321631 * client.hk == 0) {
                        client.fk(ae.hj, (byte) 96);
                    }
                }
            }
            if (aa.af(i8, 2028781525)) {
                bc(i, i2, true, str2, str, 1300660511);
            }
            client.ao.ao(gt.at, 1780061874);
        } catch (Throwable e) {
            throw ba.ad(e, "il.aq(" + ')');
        }
    }

    final void db(js jsVar, int i, int i2) {
        int i3;
        int i4;
        ac ad;
        String str = jsVar.ag;
        String str2 = jsVar.ay;
        int i5 = 657567181 * jsVar.af;
        int i6 = 1442432901 * jsVar.ad;
        int i7 = jsVar.an * 1263979533;
        int i8 = 1322476198 * jsVar.aa;
        if (i7 >= 2000) {
            i3 = i7 - 2000;
        } else {
            i3 = i7;
        }
        if (i3 == 18) {
            client.mj = -1904427286 * i5;
            client.mw = 1340650415 * i6;
            no ad2 = ik.ad(nr.cw, client.dv.ag, (byte) -51);
            ad2.an.aa(i8, -1752508204);
            ia iaVar = ad2.an;
            if (client.ao.ac(82, (byte) -53)) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            iaVar.an(i4, (byte) 31);
            ad2.an.aa((gl.dp * 1289967967) + i6, -1752508204);
            ad2.an.ci((bq.du * -1132549951) + i5, 1239940751);
            client.dv.an(ad2, (short) 255);
        }
        if (29 == i3) {
            no ad3 = ik.ad(nr.cg, client.dv.ag, (byte) 47);
            ad3.an.ay(i6, (short) 128);
            client.dv.an(ad3, (short) 255);
            ad = hv.ad(i6, 1045919792);
            if (ad.fd != null && 5 == ad.fd[0][0]) {
                int i9 = ad.fd[0][1];
                if (ad.fk[0] != al.an[i9]) {
                    al.an[i9] = ad.fk[0];
                    em.fp(i9, -905115580);
                }
            }
        }
        if (i3 == 1644616530 || gs.cs == i3 || i3 == 2146994351 || i3 == -1835269290 || i3 == ek.cm) {
            et.pz.cn(i3, i8, new bb(i5), new bb(i6), -1951721437);
        }
        if (21806236 == i3 && client.hb[i8] != null) {
            client.mj = -751012115 * i5;
            client.mw = 637696707 * i6;
            ad2 = ik.ad(nr.al, client.dv.ag, (byte) -88);
            iaVar = ad2.an;
            if (client.ao.ac(82, (byte) -99)) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            iaVar.an(i4, (byte) 31);
            ad2.an.cc(i8, (byte) 1);
            client.dv.an(ad2, (short) 255);
        }
        if (i3 == 22) {
            client.mj = -751012115 * i5;
            client.mw = -448368760 * i6;
            ad2 = ik.ad(nr.bu, client.dv.ag, (byte) 2);
            ad2.an.cc((gl.dp * 1289967967) + i6, (byte) 1);
            ad2.an.co(i8, -1083407182);
            iaVar = ad2.an;
            if (client.ao.ac(82, (byte) -54)) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            iaVar.bd(i4, 1703184995);
            ad2.an.co((1493340880 * bq.du) + i5, -61388801);
            client.dv.an(ad2, (short) 255);
        }
        if (12 == i3 && client.ca[i8] != null) {
            client.mj = -1624510489 * i5;
            client.mw = -867147213 * i6;
            ad2 = ik.ad(nr.bp, client.dv.ag, (byte) -8);
            iaVar = ad2.an;
            if (client.ao.ac(82, (byte) -123)) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            iaVar.bd(i4, 1703184995);
            ad2.an.co(i8, 1315181542);
            client.dv.an(ad2, (short) 255);
        }
        if (i3 == 1) {
            client.mj = -751012115 * i5;
            client.mw = -645595036 * i6;
            ad2 = ik.ad(nr.bd, client.dv.ag, (byte) -45);
            ad2.an.ci((1407993063 * bq.du) + i5, 1239940751);
            ad2.an.co(gw.ja * 1416443418, 778774730);
            iaVar = ad2.an;
            if (client.ao.ac(82, (byte) -16)) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            iaVar.bs(i4, 537618701);
            ad2.an.cc((-147796947 * gl.dp) + i6, (byte) 1);
            ad2.an.aa(fw.iz * 1234014515, -1752508204);
            ad2.an.cc(i8, (byte) 1);
            ad2.an.cj(-553333807 * fy.ix, -2099009794);
            client.dv.an(ad2, (short) 255);
        }
        if (1001 == i3) {
            client.mj = 1544537066 * i5;
            client.mw = 637696707 * i6;
            ad2 = ik.ad(nr.ah, client.dv.ag, (byte) -18);
            ad2.an.co((gl.dp * 1289967967) + i6, 1775077915);
            iaVar = ad2.an;
            if (client.ao.ac(1995049198, (byte) -103)) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            iaVar.bs(i4, 537618701);
            ad2.an.cc((bq.du * 1467123878) + i5, (byte) 1);
            ad2.an.cc(i8, (byte) 1);
            client.dv.an(ad2, (short) 255);
        }
        if (1002 == i3) {
            ad3 = ik.ad(nr.dz, client.dv.ag, (byte) -84);
            ad3.an.co(i8, -1635731852);
            client.dv.an(ad3, (short) 255);
        }
        if (-1906860009 == i3 && client.hb[i8] != null) {
            client.mj = 1170815555 * i5;
            client.mw = 637696707 * i6;
            ad2 = ik.ad(nr.ad, client.dv.ag, (byte) 84);
            iaVar = ad2.an;
            if (client.ao.ac(284385068, (byte) -79)) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            iaVar.bs(i4, 537618701);
            ad2.an.aa(i8, -1752508204);
            client.dv.an(ad2, (short) 255);
        }
        if (i3 == -1950813946) {
            nq.ii.az(-765566395);
            ad = hv.ad(i6, 1965465577);
            client.jb = -1520977289;
            gw.ja = 1157501239 * i5;
            fy.ix = 213740849 * i6;
            fw.iz = -1540851597 * i8;
            client.fk(ad, (byte) 118);
            client.it = gg.ad(251830668, (short) 300) + cm.af(i8, 1812545225).ak + gg.ad(1256180495, (short) 300);
            if (client.it == null) {
                client.it = jv.aj;
            }
        } else {
            if (i3 == 342597119) {
                ad = hv.ad(i6, 212348926);
                if (ad == null || ad.fb[i5] < 100000) {
                    ad3 = ik.ad(nr.dh, client.dv.ag, (byte) -77);
                    ad3.an.ci(i8, 1239940751);
                    client.dv.an(ad3, (short) 255);
                } else {
                    ax.af(27, "", ad.fb[i5] + " x " + cm.af(i8, 1997567595).ak, 1864573577);
                }
                client.hk = 0;
                ae.hj = hv.ad(i6, 1187786244);
                client.hg = 1425098489 * i5;
            }
            if (42 == i3) {
                ad3 = ik.ad(nr.bo, client.dv.ag, (byte) 84);
                ad3.an.co(i8, 2000581106);
                ad3.an.cc(i5, (byte) 1);
                ad3.an.cq(i6, 1242192116);
                client.dv.an(ad3, (short) 255);
                client.hk = 0;
                ae.hj = hv.ad(i6, 1454802763);
                client.hg = 1781011561 * i5;
            }
            if (7 == i3 && client.ca[i8] != null) {
                client.mj = -751012115 * i5;
                client.mw = 637696707 * i6;
                ad2 = ik.ad(nr.ac, client.dv.ag, (byte) -85);
                iaVar = ad2.an;
                if (client.ao.ac(82, (byte) -45)) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                iaVar.bd(i4, 1703184995);
                ad2.an.cq(-553333807 * fy.ix, 1242192116);
                ad2.an.ci(gw.ja * -276269945, 1239940751);
                ad2.an.co(-1155905667 * fw.iz, -2101997604);
                ad2.an.aa(i8, -1752508204);
                client.dv.an(ad2, (short) 255);
            }
            if (i3 == -70469375 || 1007 == i3) {
                ad = jd.an(i6, i5, (byte) 73);
                if (ad != null) {
                    gp.ep(i8, i6, i5, -885293374 * ad.fr, str2, -804543437);
                }
            }
            if (i3 == 43) {
                ad3 = ik.ad(nr.ch, client.dv.ag, (byte) 25);
                ad3.an.aa(i8, -1752508204);
                ad3.an.ci(i5, 1239940751);
                ad3.an.ay(i6, (short) 128);
                client.dv.an(ad3, (short) 255);
                client.hk = 0;
                ae.hj = hv.ad(i6, 945479586);
                client.hg = 1506839569 * i5;
            }
            if (4 == i3) {
                client.mj = 721952213 * i5;
                client.mw = 490798211 * i6;
                ad2 = ik.ad(nr.bf, client.dv.ag, (byte) -18);
                ad2.an.ci((-1166048664 * bq.du) + i5, 1239940751);
                iaVar = ad2.an;
                if (client.ao.ac(-1212484030, (byte) -56)) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                iaVar.bs(i4, 537618701);
                ad2.an.aa((gl.dp * 1289967967) + i6, -1752508204);
                ad2.an.co(i8, 2094284223);
                client.dv.an(ad2, (short) 255);
            }
            if (294510162 == i3) {
                ad3 = ik.ad(nr.bt, client.dv.ag, (byte) 17);
                ad3.an.ci(i8, 1239940751);
                ad3.an.aa(i5, -1752508204);
                ad3.an.cj(i6, -2096371222);
                client.dv.an(ad3, (short) 255);
                client.hk = 0;
                ae.hj = hv.ad(i6, 1307559040);
                client.hg = -1963466096 * i5;
            }
            if (28 == i3) {
                ad3 = ik.ad(nr.cg, client.dv.ag, (byte) -3);
                ad3.an.ay(i6, (short) 128);
                client.dv.an(ad3, (short) 255);
                ad = hv.ad(i6, 1032939298);
                if (ad.fd != null && 5 == ad.fd[0][0]) {
                    i4 = ad.fd[0][1];
                    al.an[i4] = 1 - al.an[i4];
                    em.fp(i4, -1438275080);
                }
            }
            if (i3 == 2026953277) {
                ad3 = ik.ad(nr.aw, client.dv.ag, (byte) 40);
                ad3.an.aa(i5, -1752508204);
                ad3.an.cj(i6, -2140620464);
                ad3.an.ci(i8, 1239940751);
                client.dv.an(ad3, (short) 255);
                client.hk = 0;
                ae.hj = hv.ad(i6, 1066603197);
                client.hg = 635220869 * i5;
            }
            if (i3 == 3) {
                client.mj = -751012115 * i5;
                client.mw = 637696707 * i6;
                ad2 = ik.ad(nr.bv, client.dv.ag, (byte) 27);
                ad2.an.cc(i8, (byte) 1);
                ad2.an.co((663310659 * gl.dp) + i6, 1607757600);
                ad2.an.co((248876574 * bq.du) + i5, -1899303458);
                iaVar = ad2.an;
                if (client.ao.ac(90575813, (byte) -54)) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                iaVar.bm(i4, -977971660);
                client.dv.an(ad2, (short) 255);
            }
            if (16 == i3) {
                client.mj = 1371675302 * i5;
                client.mw = -1374821327 * i6;
                ad2 = ik.ad(nr.dv, client.dv.ag, (byte) -56);
                ad2.an.co(i8, 2090434669);
                ad2.an.co((bq.du * 1407993063) + i5, -1007301634);
                ad2.an.cj(fy.ix * -147219715, -2093028048);
                iaVar = ad2.an;
                if (client.ao.ac(7412091, (byte) -48)) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                iaVar.bd(i4, 1703184995);
                ad2.an.aa(-1053164325 * gw.ja, -1752508204);
                ad2.an.cc((1289967967 * gl.dp) + i6, (byte) 1);
                ad2.an.aa(fw.iz * -1350374213, -1752508204);
                client.dv.an(ad2, (short) 255);
            }
            if (i3 == 11 && client.ca[i8] != null) {
                client.mj = -647130947 * i5;
                client.mw = 637696707 * i6;
                ad2 = ik.ad(nr.cc, client.dv.ag, (byte) -4);
                ad2.an.bs(client.ao.ac(82, (byte) -11) ? 1 : 0, 537618701);
                ad2.an.ci(i8, 1239940751);
                client.dv.an(ad2, (short) 255);
            }
            if (i3 == 2) {
                client.mj = -751012115 * i5;
                client.mw = 637696707 * i6;
                ad2 = ik.ad(nr.cq, client.dv.ag, (byte) 60);
                iaVar = ad2.an;
                if (client.ao.ac(82, (byte) -46)) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                iaVar.bs(i4, 537618701);
                ad2.an.cc((bq.du * 965216274) + i5, (byte) 1);
                ad2.an.co(i8, 1552766408);
                ad2.an.aa(nq.ii.au(-1160910060), -1752508204);
                ad2.an.ay(nq.ii.ax(254990190), (short) 128);
                ad2.an.co((gl.dp * -1316496610) + i6, -1593406606);
                client.dv.an(ad2, (short) 255);
            }
            if (i3 == -1697939441) {
                ad3 = ik.ad(nr.cm, client.dv.ag, (byte) 49);
                ad3.an.ay(i6, (short) 128);
                ad3.an.aa(i8, -1752508204);
                ad3.an.ci(i5, 1239940751);
                client.dv.an(ad3, (short) 255);
                client.hk = 0;
                ae.hj = hv.ad(i6, 441807915);
                client.hg = 1781011561 * i5;
            }
            if (9 == i3 && client.ca[i8] != null) {
                client.mj = -2042009957 * i5;
                client.mw = 313955896 * i6;
                ad2 = ik.ad(nr.f7do, client.dv.ag, (byte) 62);
                ad2.an.cc(i8, (byte) 1);
                ad2.an.bm(client.ao.ac(269500609, (byte) -66) ? 1 : 0, 1302311022);
                client.dv.an(ad2, (short) 255);
            }
            if (i3 == 50 && client.hb[i8] != null) {
                client.mj = -2019250263 * i5;
                client.mw = 1756929310 * i6;
                ad2 = ik.ad(nr.av, client.dv.ag, (byte) 89);
                ad2.an.cc(i8, (byte) 1);
                iaVar = ad2.an;
                if (client.ao.ac(82, (byte) -47)) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                iaVar.bd(i4, 1703184995);
                client.dv.an(ad2, (short) 255);
            }
            if (i3 == 17) {
                client.mj = -1584235479 * i5;
                client.mw = -404659176 * i6;
                ad2 = ik.ad(nr.dn, client.dv.ag, (byte) -72);
                ad2.an.ci((1289967967 * gl.dp) + i6, 1239940751);
                ad2.an.co(nq.ii.au(47693756), -445528090);
                ad2.an.cc((1752777231 * bq.du) + i5, (byte) 1);
                iaVar = ad2.an;
                if (client.ao.ac(478898743, (byte) -98)) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                iaVar.bm(i4, 1616200799);
                ad2.an.cj(nq.ii.ax(-2128263193), -2093357815);
                ad2.an.co(i8, 1526996613);
                client.dv.an(ad2, (short) 255);
            }
            if (23 == i3) {
                if (nq.ii.bq(1242648766)) {
                    gp.en.be();
                } else {
                    gp.en.bu(-1674539149 * dq.hf, i5, i6, true);
                }
            }
            if (-1777628999 == i3 && client.hb[i8] != null) {
                client.mj = 1702608532 * i5;
                client.mw = 1783547934 * i6;
                ad2 = ik.ad(nr.ai, client.dv.ag, (byte) 88);
                ad2.an.bs(client.ao.ac(753800529, (byte) -111) ? 1 : 0, 537618701);
                ad2.an.co(i8, -2074799109);
                client.dv.an(ad2, (short) 255);
            }
            if (i3 == 26) {
                gw.fg(-1265034995);
            }
            if (i3 == 8 && client.ca[i8] != null) {
                client.mj = -751012115 * i5;
                client.mw = 2111380337 * i6;
                ad2 = ik.ad(nr.dt, client.dv.ag, (byte) -103);
                ad2.an.cj(nq.ii.ax(-1154755660), -2133473052);
                ad2.an.aa(i8, -1752508204);
                iaVar = ad2.an;
                if (client.ao.ac(372113650, (byte) -118)) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                iaVar.bm(i4, 2052899675);
                ad2.an.cc(nq.ii.au(1702973687), (byte) 1);
                client.dv.an(ad2, (short) 255);
            }
            if (i3 == 2127238118 && client.hb[i8] != null) {
                client.mj = -751012115 * i5;
                client.mw = -219367624 * i6;
                ad2 = ik.ad(nr.cx, client.dv.ag, (byte) 16);
                iaVar = ad2.an;
                if (client.ao.ac(725783865, (byte) -84)) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                iaVar.bm(i4, 13366400);
                ad2.an.ci(i8, 1239940751);
                client.dv.an(ad2, (short) 255);
            }
            if (37 == i3) {
                ad3 = ik.ad(nr.ct, client.dv.ag, (byte) 63);
                ad3.an.co(i5, 873959620);
                ad3.an.aa(i8, -1752508204);
                ad3.an.cq(i6, 1242192116);
                client.dv.an(ad3, (short) 255);
                client.hk = 0;
                ae.hj = hv.ad(i6, 1789270642);
                client.hg = 1350600236 * i5;
            }
            if (46 == i3 && client.hb[i8] != null) {
                client.mj = 1643743241 * i5;
                client.mw = -1536308830 * i6;
                ad2 = ik.ad(nr.an, client.dv.ag, (byte) 44);
                iaVar = ad2.an;
                if (client.ao.ac(82, (byte) -64)) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                iaVar.an(i4, (byte) 31);
                ad2.an.ci(i8, 1239940751);
                client.dv.an(ad2, (short) 255);
            }
            if (13 == i3 && client.ca[i8] != null) {
                client.mj = -751012115 * i5;
                client.mw = 637696707 * i6;
                ad2 = ik.ad(nr.bh, client.dv.ag, (byte) -41);
                ad2.an.ci(i8, 1239940751);
                ad2.an.an(client.ao.ac(1342929142, (byte) -33) ? 1 : 0, (byte) 31);
                client.dv.an(ad2, (short) 255);
            }
            if (33 == i3) {
                ad3 = ik.ad(nr.bz, client.dv.ag, (byte) -9);
                ad3.an.co(i8, 1545504389);
                ad3.an.aa(i5, -1752508204);
                ad3.an.cj(i6, -2106451374);
                client.dv.an(ad3, (short) 255);
                client.hk = 0;
                ae.hj = hv.ad(i6, 498440435);
                client.hg = 409376220 * i5;
            }
            if (15 == i3 && client.hb[i8] != null) {
                client.mj = -751012115 * i5;
                client.mw = 637696707 * i6;
                ad2 = ik.ad(nr.cu, client.dv.ag, (byte) 88);
                ad2.an.cc(nq.ii.au(-1907739096), (byte) 1);
                ad2.an.cj(nq.ii.ax(2067045456), -2072037883);
                iaVar = ad2.an;
                if (client.ao.ac(82, (byte) -35)) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                iaVar.bd(i4, 1703184995);
                ad2.an.ci(i8, 1239940751);
                client.dv.an(ad2, (short) 255);
            }
            if (19 == i3) {
                client.mj = 1175526288 * i5;
                client.mw = 417329602 * i6;
                ad2 = ik.ad(nr.af, client.dv.ag, (byte) -31);
                ad2.an.ci((bq.du * 1499809521) + i5, 1239940751);
                ad2.an.aa((gl.dp * 1289967967) + i6, -1752508204);
                ad2.an.ci(i8, 1239940751);
                iaVar = ad2.an;
                if (client.ao.ac(-1916783063, (byte) -120)) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                iaVar.bs(i4, 537618701);
                client.dv.an(ad2, (short) 255);
            }
            if (-921344230 == i3) {
                ad3 = ik.ad(nr.dw, client.dv.ag, (byte) -22);
                ad3.an.aa(gw.ja * -276269945, -1752508204);
                ad3.an.ay(1098824583 * fy.ix, (short) 128);
                ad3.an.cc(i8, (byte) 1);
                ad3.an.cc(i5, (byte) 1);
                ad3.an.cj(i6, -2072706165);
                ad3.an.cc(fw.iz * -1350374213, (byte) 1);
                client.dv.an(ad3, (short) 255);
                client.hk = 0;
                ae.hj = hv.ad(i6, 1597034910);
                client.hg = 1781011561 * i5;
            }
            if (i3 == 1004) {
                ad3 = ik.ad(nr.dh, client.dv.ag, (byte) -5);
                ad3.an.ci(i8, 1239940751);
                client.dv.an(ad3, (short) 255);
            }
            if (6 == i3) {
                client.mj = 340051958 * i5;
                client.mw = 1085920167 * i6;
                ad2 = ik.ad(nr.bg, client.dv.ag, (byte) 80);
                ad2.an.bm(client.ao.ac(82, (byte) -20) ? 1 : 0, -2101845042);
                ad2.an.ci((1407993063 * bq.du) + i5, 1239940751);
                ad2.an.aa(i8, -1752508204);
                ad2.an.cc((gl.dp * 1289967967) + i6, (byte) 1);
                client.dv.an(ad2, (short) 255);
            }
            if (i3 == 280407831) {
                ad3 = ik.ad(nr.cv, client.dv.ag, (byte) 55);
                ad3.an.cq(i6, 1242192116);
                ad3.an.co(i5, 1609184851);
                ad3.an.aa(i8, -1752508204);
                client.dv.an(ad3, (short) 255);
                client.hk = 0;
                ae.hj = hv.ad(i6, 194954341);
                client.hg = 1781011561 * i5;
            }
            if (i3 == 21) {
                client.mj = -751012115 * i5;
                client.mw = 637696707 * i6;
                ad2 = ik.ad(nr.bb, client.dv.ag, (byte) -104);
                ad2.an.ci(i8, 1239940751);
                ad2.an.co((770997882 * bq.du) + i5, -1677130977);
                ad2.an.bd(client.ao.ac(-1185089848, (byte) -111) ? 1 : 0, 1703184995);
                ad2.an.co((-532930673 * gl.dp) + i6, 1932886075);
                client.dv.an(ad2, (short) 255);
            }
            if (-96615535 == i3 && client.hb[i8] != null) {
                client.mj = -751012115 * i5;
                client.mw = 637696707 * i6;
                ad2 = ik.ad(nr.am, client.dv.ag, (byte) -92);
                ad2.an.co(i8, -1108592302);
                ad2.an.bd(client.ao.ac(82, (byte) -53) ? 1 : 0, 1703184995);
                client.dv.an(ad2, (short) 255);
            }
            if (i3 == 5) {
                client.mj = -895630669 * i5;
                client.mw = -1268038034 * i6;
                ad2 = ik.ad(nr.by, client.dv.ag, (byte) -75);
                ad2.an.co((-1491955323 * gl.dp) + i6, -640039497);
                ad2.an.aa(i8, -1752508204);
                ad2.an.bs(client.ao.ac(82, (byte) -52) ? 1 : 0, 537618701);
                ad2.an.aa((358760534 * bq.du) + i5, -1752508204);
                client.dv.an(ad2, (short) 255);
            }
            if (25 == i3) {
                ac an = jd.an(i6, i5, (byte) 75);
                if (an != null) {
                    String str3;
                    String str4;
                    nq.ii.az(974712186);
                    nq.ii.ai(i6, i5, (ah.fy(an, -1255092505) >> 11) & 63, an.fr * -868539721, -344138265);
                    client.jb = 0;
                    if (((ah.fy(an, -1463312620) >> 11) & 63) == 0) {
                        str3 = null;
                    } else if (an.dm == null || an.dm.trim().length() == 0) {
                        str3 = null;
                    } else {
                        str3 = an.dm;
                    }
                    if (str3 == null) {
                        str3 = "Null";
                    }
                    if (an.az) {
                        str4 = an.dw + gg.ad(2071319381, (short) 300);
                    } else {
                        str4 = gg.ad(65280, (short) 300) + an.fa + gg.ad(16777215, (short) 300);
                    }
                    nq.ii.ah(str3, str4, (byte) -90);
                }
            } else {
                if (i3 == 20) {
                    client.mj = -751012115 * i5;
                    client.mw = 637696707 * i6;
                    ad2 = ik.ad(nr.au, client.dv.ag, (byte) 72);
                    ad2.an.aa(i8, -1752508204);
                    iaVar = ad2.an;
                    if (client.ao.ac(1992988177, (byte) -25)) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    iaVar.bd(i4, 1703184995);
                    ad2.an.cc((1407993063 * bq.du) + i5, (byte) 1);
                    ad2.an.cc((gl.dp * 1289967967) + i6, (byte) 1);
                    client.dv.an(ad2, (short) 255);
                }
                if (i3 == -14728222) {
                    ad3 = ik.ad(nr.dk, client.dv.ag, (byte) -59);
                    ad3.an.ci(i5, 1239940751);
                    ad3.an.cj(i6, -2110078402);
                    ad3.an.ci(i8, 1239940751);
                    client.dv.an(ad3, (short) 255);
                    client.hk = 0;
                    ae.hj = hv.ad(i6, 2118691522);
                    client.hg = -1449885481 * i5;
                }
                if (58 == i3) {
                    ad = jd.an(i6, i5, (byte) 32);
                    if (ad != null) {
                        ad2 = ik.ad(nr.cb, client.dv.ag, (byte) 89);
                        ad2.an.cm(i6, (byte) -7);
                        ad2.an.cq(nq.ii.ax(267002768), 1242192116);
                        ad2.an.cc(i5, (byte) 1);
                        ad2.an.co(nq.ii.au(360714450), -1754114461);
                        ad2.an.co(ad.fr * -1498387607, -321498484);
                        ad2.an.co(nq.ii.av(-19628724), -1419443161);
                        client.dv.an(ad2, (short) 255);
                    }
                }
                if (i3 == 10 && client.ca[i8] != null) {
                    client.mj = -751012115 * i5;
                    client.mw = 1998095426 * i6;
                    ad2 = ik.ad(nr.ca, client.dv.ag, (byte) 10);
                    ad2.an.aa(i8, -1752508204);
                    iaVar = ad2.an;
                    if (client.ao.ac(-1222473852, (byte) -61)) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    iaVar.an(i4, (byte) 31);
                    client.dv.an(ad2, (short) 255);
                }
                if (30 == i3 && client.jv == null) {
                    jv.ec(i6, i5, (byte) 0);
                    client.jv = jd.an(i6, i5, (byte) 113);
                    client.fk(client.jv, (byte) 108);
                }
                if (-1819719315 == i3) {
                    ad3 = ik.ad(nr.bm, client.dv.ag, (byte) -15);
                    ad3.an.cj(i6, -2094798252);
                    ad3.an.cc(i8, (byte) 1);
                    ad3.an.ci(nq.ii.au(1641417749), 1239940751);
                    ad3.an.cc(i5, (byte) 1);
                    ad3.an.cm(nq.ii.ax(904102478), (byte) -117);
                    client.dv.an(ad3, (short) 255);
                    client.hk = 0;
                    ae.hj = hv.ad(i6, 703593189);
                    client.hg = 1781011561 * i5;
                }
                if (1549274145 == i3) {
                    ad3 = ik.ad(nr.at, client.dv.ag, (byte) -81);
                    ad3.an.co(i5, 449972816);
                    ad3.an.ay(i6, (short) 128);
                    ad3.an.ci(i8, 1239940751);
                    client.dv.an(ad3, (short) 255);
                    client.hk = 0;
                    ae.hj = hv.ad(i6, 686628889);
                    client.hg = 1446836537 * i5;
                }
                if (24 == i3) {
                    ac ad4 = hv.ad(i6, -19394125);
                    boolean z = true;
                    if (ad4.au * -586529633 > 0) {
                        z = aw.fu(ad4, -196824059);
                    }
                    if (z) {
                        ad3 = ik.ad(nr.cg, client.dv.ag, (byte) -8);
                        ad3.an.ay(i6, (short) 128);
                        client.dv.an(ad3, (short) 255);
                    }
                }
                if (1699752449 == i3) {
                    gm gmVar = client.ca[i8];
                    if (gmVar != null) {
                        au auVar = gmVar.af;
                        if (auVar.bg != null) {
                            auVar = auVar.ar(2125288365);
                        }
                        if (auVar != null) {
                            ad2 = ik.ad(nr.cn, client.dv.ag, (byte) 60);
                            ad2.an.co(auVar.ag * -964508859, -1642494772);
                            client.dv.an(ad2, (short) 255);
                        }
                    }
                }
                if (14 == i3 && client.hb[i8] != null) {
                    client.mj = -751012115 * i5;
                    client.mw = 637696707 * i6;
                    ad2 = ik.ad(nr.cj, client.dv.ag, (byte) 4);
                    ad2.an.cq(154574966 * fy.ix, 1242192116);
                    ad2.an.aa(809416617 * gw.ja, -1752508204);
                    ad2.an.co(i8, -1886850882);
                    ad2.an.co(-1350374213 * fw.iz, -2035237968);
                    ad2.an.an(client.ao.ac(82, (byte) -96) ? 1 : 0, (byte) 31);
                    client.dv.an(ad2, (short) 255);
                }
                if (-1160054416 == i3 && client.hb[i8] != null) {
                    client.mj = -1968656221 * i5;
                    client.mw = 637696707 * i6;
                    no ad5 = ik.ad(nr.as, client.dv.ag, (byte) -62);
                    ad5.an.ci(i8, 1239940751);
                    ia iaVar2 = ad5.an;
                    if (client.ao.ac(-15284099, (byte) -106)) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    iaVar2.bd(i4, 1703184995);
                    client.dv.an(ad5, (short) 255);
                }
                if (client.jb * 1657086226 != 0) {
                    client.jb = 0;
                    client.fk(hv.ad(fy.ix * -1419345948, 1060963688), (byte) 31);
                }
                if (nq.ii.ak(1003341680)) {
                    nq.ii.az(1254924070);
                }
                if (ae.hj != null && 1099321631 * client.hk == 0) {
                    client.fk(ae.hj, (byte) 84);
                }
            }
        }
        if (aa.af(i7, -548687977)) {
            bc(i, i2, true, str2, str, -1069164399);
        }
        client.ao.ao(gt.at, 1503782601);
    }

    final void dm(js jsVar, int i, int i2) {
        int i3;
        int i4;
        ac ad;
        String str = jsVar.ag;
        String str2 = jsVar.ay;
        int i5 = -1767236695 * jsVar.af;
        int i6 = -1389708848 * jsVar.ad;
        int i7 = jsVar.an * -1429428028;
        int i8 = 649457180 * jsVar.aa;
        if (i7 >= 2000) {
            i3 = i7 - 2000;
        } else {
            i3 = i7;
        }
        if (i3 == 18) {
            client.mj = -751012115 * i5;
            client.mw = 637696707 * i6;
            no ad2 = ik.ad(nr.cw, client.dv.ag, (byte) -37);
            ad2.an.aa(i8, -1752508204);
            ia iaVar = ad2.an;
            if (client.ao.ac(816694087, (byte) -125)) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            iaVar.an(i4, (byte) 31);
            ad2.an.aa((gl.dp * 1655311046) + i6, -1752508204);
            ad2.an.ci((bq.du * 1407993063) + i5, 1239940751);
            client.dv.an(ad2, (short) 255);
        }
        if (29 == i3) {
            no ad3 = ik.ad(nr.cg, client.dv.ag, (byte) -40);
            ad3.an.ay(i6, (short) 128);
            client.dv.an(ad3, (short) 255);
            ad = hv.ad(i6, 2083241103);
            if (ad.fd != null && 5 == ad.fd[0][0]) {
                int i9 = ad.fd[0][1];
                if (ad.fk[0] != al.an[i9]) {
                    al.an[i9] = ad.fk[0];
                    em.fp(i9, 1759265581);
                }
            }
        }
        if (i3 == -574317532 || -318607975 == i3 || i3 == -1139046371 || i3 == 736743416 || i3 == -400675715) {
            et.pz.cn(i3, i8, new bb(i5), new bb(i6), 35424596);
        }
        if (47 == i3 && client.hb[i8] != null) {
            client.mj = 1499245442 * i5;
            client.mw = 2054427807 * i6;
            ad2 = ik.ad(nr.al, client.dv.ag, (byte) -52);
            iaVar = ad2.an;
            if (client.ao.ac(82, (byte) -85)) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            iaVar.an(i4, (byte) 31);
            ad2.an.cc(i8, (byte) 1);
            client.dv.an(ad2, (short) 255);
        }
        if (i3 == 22) {
            client.mj = -751012115 * i5;
            client.mw = -414687395 * i6;
            ad2 = ik.ad(nr.bu, client.dv.ag, (byte) -17);
            ad2.an.cc((gl.dp * -1054324464) + i6, (byte) 1);
            ad2.an.co(i8, -1317362018);
            ad2.an.bd(client.ao.ac(-512082298, (byte) -38) ? 1 : 0, 1703184995);
            ad2.an.co((1474841023 * bq.du) + i5, 910397214);
            client.dv.an(ad2, (short) 255);
        }
        if (12 == i3 && client.ca[i8] != null) {
            client.mj = -161676890 * i5;
            client.mw = 637696707 * i6;
            ad2 = ik.ad(nr.bp, client.dv.ag, (byte) 44);
            iaVar = ad2.an;
            if (client.ao.ac(82, (byte) -85)) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            iaVar.bd(i4, 1703184995);
            ad2.an.co(i8, -1502175944);
            client.dv.an(ad2, (short) 255);
        }
        if (i3 == 1) {
            client.mj = -751012115 * i5;
            client.mw = 57674059 * i6;
            ad2 = ik.ad(nr.bd, client.dv.ag, (byte) 67);
            ad2.an.ci((1407993063 * bq.du) + i5, 1239940751);
            ad2.an.co(gw.ja * -1973807721, 1474415691);
            iaVar = ad2.an;
            if (client.ao.ac(82, (byte) -69)) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            iaVar.bs(i4, 537618701);
            ad2.an.cc((-1633133505 * gl.dp) + i6, (byte) 1);
            ad2.an.aa(fw.iz * -1350374213, -1752508204);
            ad2.an.cc(i8, (byte) 1);
            ad2.an.cj(-553333807 * fy.ix, -2102449887);
            client.dv.an(ad2, (short) 255);
        }
        if (1001 == i3) {
            client.mj = -751012115 * i5;
            client.mw = -1898882405 * i6;
            ad2 = ik.ad(nr.ah, client.dv.ag, (byte) 9);
            ad2.an.co((gl.dp * 1856273368) + i6, 155041269);
            iaVar = ad2.an;
            if (client.ao.ac(82, (byte) -21)) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            iaVar.bs(i4, 537618701);
            ad2.an.cc((bq.du * 1407993063) + i5, (byte) 1);
            ad2.an.cc(i8, (byte) 1);
            client.dv.an(ad2, (short) 255);
        }
        if (-1635106153 == i3) {
            ad3 = ik.ad(nr.dz, client.dv.ag, (byte) 41);
            ad3.an.co(i8, 1792908720);
            client.dv.an(ad3, (short) 255);
        }
        if (51 == i3 && client.hb[i8] != null) {
            client.mj = 348977451 * i5;
            client.mw = -1063200220 * i6;
            ad2 = ik.ad(nr.ad, client.dv.ag, (byte) 18);
            iaVar = ad2.an;
            if (client.ao.ac(1288624164, (byte) -22)) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            iaVar.bs(i4, 537618701);
            ad2.an.aa(i8, -1752508204);
            client.dv.an(ad2, (short) 255);
        }
        if (i3 == 38) {
            nq.ii.az(-1748511983);
            ad = hv.ad(i6, 1839349872);
            client.jb = 386301539;
            gw.ja = 1157501239 * i5;
            fy.ix = -415363682 * i6;
            fw.iz = -1540851597 * i8;
            client.fk(ad, (byte) 22);
            client.it = gg.ad(1329840853, (short) 300) + cm.af(i8, 1705819873).ak + gg.ad(-1256432519, (short) 300);
            if (client.it == null) {
                client.it = jv.aj;
            }
        } else {
            if (i3 == -1159453395) {
                ad = hv.ad(i6, 2123905390);
                if (ad == null || ad.fb[i5] < 100000) {
                    ad3 = ik.ad(nr.dh, client.dv.ag, (byte) -31);
                    ad3.an.ci(i8, 1239940751);
                    client.dv.an(ad3, (short) 255);
                } else {
                    ax.af(27, "", ad.fb[i5] + " x " + cm.af(i8, 1228167104).ak, 825828863);
                }
                client.hk = 0;
                ae.hj = hv.ad(i6, 1684206812);
                client.hg = 1781011561 * i5;
            }
            if (42 == i3) {
                ad3 = ik.ad(nr.bo, client.dv.ag, (byte) 28);
                ad3.an.co(i8, 1139262118);
                ad3.an.cc(i5, (byte) 1);
                ad3.an.cq(i6, 1242192116);
                client.dv.an(ad3, (short) 255);
                client.hk = 0;
                ae.hj = hv.ad(i6, 112318581);
                client.hg = 1781011561 * i5;
            }
            if (7 == i3 && client.ca[i8] != null) {
                client.mj = -751012115 * i5;
                client.mw = 637696707 * i6;
                ad2 = ik.ad(nr.ac, client.dv.ag, (byte) -51);
                iaVar = ad2.an;
                if (client.ao.ac(-2110275027, (byte) -73)) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                iaVar.bd(i4, 1703184995);
                ad2.an.cq(714033859 * fy.ix, 1242192116);
                ad2.an.ci(gw.ja * 1095112547, 1239940751);
                ad2.an.co(-1350374213 * fw.iz, 110255327);
                ad2.an.aa(i8, -1752508204);
                client.dv.an(ad2, (short) 255);
            }
            if (i3 == 57 || 458673308 == i3) {
                ad = jd.an(i6, i5, (byte) 90);
                if (ad != null) {
                    gp.ep(i8, i6, i5, 1737247819 * ad.fr, str2, 1154604785);
                }
            }
            if (i3 == -1240371068) {
                ad3 = ik.ad(nr.ch, client.dv.ag, (byte) 26);
                ad3.an.aa(i8, -1752508204);
                ad3.an.ci(i5, 1239940751);
                ad3.an.ay(i6, (short) 128);
                client.dv.an(ad3, (short) 255);
                client.hk = 0;
                ae.hj = hv.ad(i6, 1891018027);
                client.hg = 1781011561 * i5;
            }
            if (4 == i3) {
                client.mj = -751012115 * i5;
                client.mw = 637696707 * i6;
                ad2 = ik.ad(nr.bf, client.dv.ag, (byte) 24);
                ad2.an.ci((-148574511 * bq.du) + i5, 1239940751);
                ad2.an.bs(client.ao.ac(-3538319, (byte) -73) ? 1 : 0, 537618701);
                ad2.an.aa((gl.dp * 1289967967) + i6, -1752508204);
                ad2.an.co(i8, 1694109651);
                client.dv.an(ad2, (short) 255);
            }
            if (1887715962 == i3) {
                ad3 = ik.ad(nr.bt, client.dv.ag, (byte) 20);
                ad3.an.ci(i8, 1239940751);
                ad3.an.aa(i5, -1752508204);
                ad3.an.cj(i6, -2113970441);
                client.dv.an(ad3, (short) 255);
                client.hk = 0;
                ae.hj = hv.ad(i6, 885278815);
                client.hg = 994564649 * i5;
            }
            if (28 == i3) {
                ad3 = ik.ad(nr.cg, client.dv.ag, (byte) -22);
                ad3.an.ay(i6, (short) 128);
                client.dv.an(ad3, (short) 255);
                ad = hv.ad(i6, 948654837);
                if (ad.fd != null && 5 == ad.fd[0][0]) {
                    i4 = ad.fd[0][1];
                    al.an[i4] = 1 - al.an[i4];
                    em.fp(i4, -664889599);
                }
            }
            if (i3 == 40) {
                ad3 = ik.ad(nr.aw, client.dv.ag, (byte) -40);
                ad3.an.aa(i5, -1752508204);
                ad3.an.cj(i6, -2093337540);
                ad3.an.ci(i8, 1239940751);
                client.dv.an(ad3, (short) 255);
                client.hk = 0;
                ae.hj = hv.ad(i6, 1347180755);
                client.hg = 1781011561 * i5;
            }
            if (i3 == 3) {
                client.mj = -2143884305 * i5;
                client.mw = 707777537 * i6;
                ad2 = ik.ad(nr.bv, client.dv.ag, (byte) -9);
                ad2.an.cc(i8, (byte) 1);
                ad2.an.co((-2038469133 * gl.dp) + i6, -1008633435);
                ad2.an.co((982721366 * bq.du) + i5, -1833465085);
                iaVar = ad2.an;
                if (client.ao.ac(82, (byte) -100)) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                iaVar.bm(i4, -627291965);
                client.dv.an(ad2, (short) 255);
            }
            if (16 == i3) {
                client.mj = -1847146789 * i5;
                client.mw = 637696707 * i6;
                ad2 = ik.ad(nr.dv, client.dv.ag, (byte) -10);
                ad2.an.co(i8, 1162903774);
                ad2.an.co((bq.du * 453865961) + i5, 1505068567);
                ad2.an.cj(fy.ix * 622060990, -2100541376);
                iaVar = ad2.an;
                if (client.ao.ac(-1322226857, (byte) -52)) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                iaVar.bd(i4, 1703184995);
                ad2.an.aa(-1872635207 * gw.ja, -1752508204);
                ad2.an.cc((1963028401 * gl.dp) + i6, (byte) 1);
                ad2.an.aa(fw.iz * -1350374213, -1752508204);
                client.dv.an(ad2, (short) 255);
            }
            if (i3 == 11 && client.ca[i8] != null) {
                client.mj = -751012115 * i5;
                client.mw = 1140378713 * i6;
                ad2 = ik.ad(nr.cc, client.dv.ag, (byte) 26);
                iaVar = ad2.an;
                if (client.ao.ac(-2014509590, (byte) -66)) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                iaVar.bs(i4, 537618701);
                ad2.an.ci(i8, 1239940751);
                client.dv.an(ad2, (short) 255);
            }
            if (i3 == 2) {
                client.mj = 70244384 * i5;
                client.mw = -260440202 * i6;
                ad2 = ik.ad(nr.cq, client.dv.ag, (byte) 101);
                iaVar = ad2.an;
                if (client.ao.ac(-1038708153, (byte) -28)) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                iaVar.bs(i4, 537618701);
                ad2.an.cc((bq.du * -350047620) + i5, (byte) 1);
                ad2.an.co(i8, -1051803584);
                ad2.an.aa(nq.ii.au(-168606950), -1752508204);
                ad2.an.ay(nq.ii.ax(-1237229046), (short) 128);
                ad2.an.co((gl.dp * 764342622) + i6, -908980333);
                client.dv.an(ad2, (short) 255);
            }
            if (i3 == 41) {
                ad3 = ik.ad(nr.cm, client.dv.ag, (byte) -36);
                ad3.an.ay(i6, (short) 128);
                ad3.an.aa(i8, -1752508204);
                ad3.an.ci(i5, 1239940751);
                client.dv.an(ad3, (short) 255);
                client.hk = 0;
                ae.hj = hv.ad(i6, 1521112670);
                client.hg = 200942010 * i5;
            }
            if (9 == i3 && client.ca[i8] != null) {
                client.mj = -751012115 * i5;
                client.mw = 637696707 * i6;
                ad2 = ik.ad(nr.f7do, client.dv.ag, (byte) 8);
                ad2.an.cc(i8, (byte) 1);
                iaVar = ad2.an;
                if (client.ao.ac(-1049259988, (byte) -90)) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                iaVar.bm(i4, -451748455);
                client.dv.an(ad2, (short) 255);
            }
            if (i3 == 50 && client.hb[i8] != null) {
                client.mj = 425170818 * i5;
                client.mw = 637696707 * i6;
                ad2 = ik.ad(nr.av, client.dv.ag, (byte) -81);
                ad2.an.cc(i8, (byte) 1);
                ad2.an.bd(client.ao.ac(82, (byte) -79) ? 1 : 0, 1703184995);
                client.dv.an(ad2, (short) 255);
            }
            if (i3 == 17) {
                client.mj = 1826342884 * i5;
                client.mw = 637696707 * i6;
                ad2 = ik.ad(nr.dn, client.dv.ag, (byte) 9);
                ad2.an.ci((1289967967 * gl.dp) + i6, 1239940751);
                ad2.an.co(nq.ii.au(1966613609), -530622670);
                ad2.an.cc((1407993063 * bq.du) + i5, (byte) 1);
                ad2.an.bm(client.ao.ac(82, (byte) -55) ? 1 : 0, 1892599500);
                ad2.an.cj(nq.ii.ax(-663419670), -2081675271);
                ad2.an.co(i8, -937625617);
                client.dv.an(ad2, (short) 255);
            }
            if (23 == i3) {
                if (nq.ii.bq(739047779)) {
                    gp.en.be();
                } else {
                    gp.en.bu(-1674539149 * dq.hf, i5, i6, true);
                }
            }
            if (45 == i3 && client.hb[i8] != null) {
                client.mj = 1590724407 * i5;
                client.mw = 637696707 * i6;
                ad2 = ik.ad(nr.ai, client.dv.ag, (byte) 83);
                iaVar = ad2.an;
                if (client.ao.ac(606917342, (byte) -17)) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                iaVar.bs(i4, 537618701);
                ad2.an.co(i8, -1377729387);
                client.dv.an(ad2, (short) 255);
            }
            if (i3 == 26) {
                gw.fg(-1265034995);
            }
            if (i3 == 8 && client.ca[i8] != null) {
                client.mj = -2082228434 * i5;
                client.mw = 637696707 * i6;
                ad2 = ik.ad(nr.dt, client.dv.ag, (byte) -92);
                ad2.an.cj(nq.ii.ax(-566170463), -2114682830);
                ad2.an.aa(i8, -1752508204);
                iaVar = ad2.an;
                if (client.ao.ac(-125909441, (byte) -101)) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                iaVar.bm(i4, -508591606);
                ad2.an.cc(nq.ii.au(342808871), (byte) 1);
                client.dv.an(ad2, (short) 255);
            }
            if (i3 == 48 && client.hb[i8] != null) {
                client.mj = 1864052364 * i5;
                client.mw = 637696707 * i6;
                ad2 = ik.ad(nr.cx, client.dv.ag, (byte) 4);
                iaVar = ad2.an;
                if (client.ao.ac(82, (byte) -109)) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                iaVar.bm(i4, 1142825532);
                ad2.an.ci(i8, 1239940751);
                client.dv.an(ad2, (short) 255);
            }
            if (37 == i3) {
                ad3 = ik.ad(nr.ct, client.dv.ag, (byte) 37);
                ad3.an.co(i5, 302636012);
                ad3.an.aa(i8, -1752508204);
                ad3.an.cq(i6, 1242192116);
                client.dv.an(ad3, (short) 255);
                client.hk = 0;
                ae.hj = hv.ad(i6, 40425888);
                client.hg = 1781011561 * i5;
            }
            if (46 == i3 && client.hb[i8] != null) {
                client.mj = -751012115 * i5;
                client.mw = 637696707 * i6;
                ad2 = ik.ad(nr.an, client.dv.ag, (byte) -83);
                iaVar = ad2.an;
                if (client.ao.ac(1706761479, (byte) -111)) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                iaVar.an(i4, (byte) 31);
                ad2.an.ci(i8, 1239940751);
                client.dv.an(ad2, (short) 255);
            }
            if (13 == i3 && client.ca[i8] != null) {
                client.mj = -751012115 * i5;
                client.mw = -1103335582 * i6;
                ad2 = ik.ad(nr.bh, client.dv.ag, (byte) 1);
                ad2.an.ci(i8, 1239940751);
                iaVar = ad2.an;
                if (client.ao.ac(82, (byte) -84)) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                iaVar.an(i4, (byte) 31);
                client.dv.an(ad2, (short) 255);
            }
            if (33 == i3) {
                ad3 = ik.ad(nr.bz, client.dv.ag, (byte) -61);
                ad3.an.co(i8, -100793961);
                ad3.an.aa(i5, -1752508204);
                ad3.an.cj(i6, -2071896387);
                client.dv.an(ad3, (short) 255);
                client.hk = 0;
                ae.hj = hv.ad(i6, 272223881);
                client.hg = 1781011561 * i5;
            }
            if (15 == i3 && client.hb[i8] != null) {
                client.mj = -751012115 * i5;
                client.mw = -764939063 * i6;
                ad2 = ik.ad(nr.cu, client.dv.ag, (byte) -60);
                ad2.an.cc(nq.ii.au(80892195), (byte) 1);
                ad2.an.cj(nq.ii.ax(136500055), -2118095101);
                iaVar = ad2.an;
                if (client.ao.ac(786174265, (byte) -14)) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                iaVar.bd(i4, 1703184995);
                ad2.an.ci(i8, 1239940751);
                client.dv.an(ad2, (short) 255);
            }
            if (19 == i3) {
                client.mj = 1509227756 * i5;
                client.mw = -1025524168 * i6;
                ad2 = ik.ad(nr.af, client.dv.ag, (byte) 41);
                ad2.an.ci((bq.du * 1407993063) + i5, 1239940751);
                ad2.an.aa((gl.dp * -663919362) + i6, -1752508204);
                ad2.an.ci(i8, 1239940751);
                iaVar = ad2.an;
                if (client.ao.ac(82, (byte) -112)) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                iaVar.bs(i4, 537618701);
                client.dv.an(ad2, (short) 255);
            }
            if (31 == i3) {
                ad3 = ik.ad(nr.dw, client.dv.ag, (byte) -27);
                ad3.an.aa(gw.ja * -276269945, -1752508204);
                ad3.an.ay(1357973482 * fy.ix, (short) 128);
                ad3.an.cc(i8, (byte) 1);
                ad3.an.cc(i5, (byte) 1);
                ad3.an.cj(i6, -2070942521);
                ad3.an.cc(fw.iz * -1350374213, (byte) 1);
                client.dv.an(ad3, (short) 255);
                client.hk = 0;
                ae.hj = hv.ad(i6, 1541860162);
                client.hg = 1781011561 * i5;
            }
            if (i3 == 1004) {
                ad3 = ik.ad(nr.dh, client.dv.ag, (byte) -25);
                ad3.an.ci(i8, 1239940751);
                client.dv.an(ad3, (short) 255);
            }
            if (6 == i3) {
                client.mj = -751012115 * i5;
                client.mw = 637696707 * i6;
                ad2 = ik.ad(nr.bg, client.dv.ag, (byte) -93);
                ad2.an.bm(client.ao.ac(82, (byte) -93) ? 1 : 0, 1696356399);
                ad2.an.ci((1407993063 * bq.du) + i5, 1239940751);
                ad2.an.aa(i8, -1752508204);
                ad2.an.cc((gl.dp * 1289967967) + i6, (byte) 1);
                client.dv.an(ad2, (short) 255);
            }
            if (i3 == 34) {
                ad3 = ik.ad(nr.cv, client.dv.ag, (byte) 5);
                ad3.an.cq(i6, 1242192116);
                ad3.an.co(i5, -78216229);
                ad3.an.aa(i8, -1752508204);
                client.dv.an(ad3, (short) 255);
                client.hk = 0;
                ae.hj = hv.ad(i6, 2060411683);
                client.hg = -429754997 * i5;
            }
            if (i3 == 21) {
                client.mj = 740123807 * i5;
                client.mw = 637696707 * i6;
                ad2 = ik.ad(nr.bb, client.dv.ag, (byte) -32);
                ad2.an.ci(i8, 1239940751);
                ad2.an.co((1407993063 * bq.du) + i5, 987576708);
                iaVar = ad2.an;
                if (client.ao.ac(82, (byte) -2)) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                iaVar.bd(i4, 1703184995);
                ad2.an.co((889264897 * gl.dp) + i6, 427157494);
                client.dv.an(ad2, (short) 255);
            }
            if (44 == i3 && client.hb[i8] != null) {
                client.mj = 41489786 * i5;
                client.mw = 1999359183 * i6;
                ad2 = ik.ad(nr.am, client.dv.ag, (byte) 6);
                ad2.an.co(i8, -407425386);
                iaVar = ad2.an;
                if (client.ao.ac(82, (byte) -82)) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                iaVar.bd(i4, 1703184995);
                client.dv.an(ad2, (short) 255);
            }
            if (i3 == 5) {
                client.mj = -751012115 * i5;
                client.mw = 637696707 * i6;
                ad2 = ik.ad(nr.by, client.dv.ag, (byte) 24);
                ad2.an.co((478234047 * gl.dp) + i6, 1241852328);
                ad2.an.aa(i8, -1752508204);
                ad2.an.bs(client.ao.ac(82, (byte) -12) ? 1 : 0, 537618701);
                ad2.an.aa((1407993063 * bq.du) + i5, -1752508204);
                client.dv.an(ad2, (short) 255);
            }
            if (25 == i3) {
                ac an = jd.an(i6, i5, (byte) 121);
                if (an != null) {
                    String str3;
                    String str4;
                    nq.ii.az(-1519900843);
                    nq.ii.ai(i6, i5, (ah.fy(an, -1039571630) >> 11) & -1323864402, an.fr * -868539721, 1734138160);
                    client.jb = 0;
                    if (((ah.fy(an, -1350621158) >> 11) & 63) == 0) {
                        str3 = null;
                    } else if (an.dm == null || an.dm.trim().length() == 0) {
                        str3 = null;
                    } else {
                        str3 = an.dm;
                    }
                    if (str3 == null) {
                        str3 = "Null";
                    }
                    if (an.az) {
                        str4 = an.dw + gg.ad(16777215, (short) 300);
                    } else {
                        str4 = gg.ad(65280, (short) 300) + an.fa + gg.ad(-1698000141, (short) 300);
                    }
                    nq.ii.ah(str3, str4, (byte) -15);
                }
            } else {
                if (i3 == 20) {
                    client.mj = 1668655709 * i5;
                    client.mw = 637696707 * i6;
                    ad2 = ik.ad(nr.au, client.dv.ag, (byte) 9);
                    ad2.an.aa(i8, -1752508204);
                    iaVar = ad2.an;
                    if (client.ao.ac(82, (byte) -96)) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    iaVar.bd(i4, 1703184995);
                    ad2.an.cc((1407993063 * bq.du) + i5, (byte) 1);
                    ad2.an.cc((gl.dp * 1289967967) + i6, (byte) 1);
                    client.dv.an(ad2, (short) 255);
                }
                if (i3 == -340920553) {
                    ad3 = ik.ad(nr.dk, client.dv.ag, (byte) -75);
                    ad3.an.ci(i5, 1239940751);
                    ad3.an.cj(i6, -2091733096);
                    ad3.an.ci(i8, 1239940751);
                    client.dv.an(ad3, (short) 255);
                    client.hk = 0;
                    ae.hj = hv.ad(i6, 1373153907);
                    client.hg = 1781011561 * i5;
                }
                if (58 == i3) {
                    ad = jd.an(i6, i5, (byte) 73);
                    if (ad != null) {
                        ad2 = ik.ad(nr.cb, client.dv.ag, (byte) -46);
                        ad2.an.cm(i6, (byte) -59);
                        ad2.an.cq(nq.ii.ax(-630369219), 1242192116);
                        ad2.an.cc(i5, (byte) 1);
                        ad2.an.co(nq.ii.au(-67648126), 1854593985);
                        ad2.an.co(ad.fr * 840481869, -1831546394);
                        ad2.an.co(nq.ii.av(-455312619), 307749770);
                        client.dv.an(ad2, (short) 255);
                    }
                }
                if (i3 == 10 && client.ca[i8] != null) {
                    client.mj = 1620712529 * i5;
                    client.mw = 637696707 * i6;
                    ad2 = ik.ad(nr.ca, client.dv.ag, (byte) 86);
                    ad2.an.aa(i8, -1752508204);
                    iaVar = ad2.an;
                    if (client.ao.ac(-1398795031, (byte) -94)) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    iaVar.an(i4, (byte) 31);
                    client.dv.an(ad2, (short) 255);
                }
                if (30 == i3 && client.jv == null) {
                    jv.ec(i6, i5, (byte) 0);
                    client.jv = jd.an(i6, i5, (byte) 111);
                    client.fk(client.jv, (byte) 46);
                }
                if (32 == i3) {
                    ad3 = ik.ad(nr.bm, client.dv.ag, (byte) 13);
                    ad3.an.cj(i6, -2084881636);
                    ad3.an.cc(i8, (byte) 1);
                    ad3.an.ci(nq.ii.au(1194839580), 1239940751);
                    ad3.an.cc(i5, (byte) 1);
                    ad3.an.cm(nq.ii.ax(-598486758), (byte) -32);
                    client.dv.an(ad3, (short) 255);
                    client.hk = 0;
                    ae.hj = hv.ad(i6, 1891364688);
                    client.hg = 1781011561 * i5;
                }
                if (236132431 == i3) {
                    ad3 = ik.ad(nr.at, client.dv.ag, (byte) 27);
                    ad3.an.co(i5, 1449501814);
                    ad3.an.ay(i6, (short) 128);
                    ad3.an.ci(i8, 1239940751);
                    client.dv.an(ad3, (short) 255);
                    client.hk = 0;
                    ae.hj = hv.ad(i6, 1054566195);
                    client.hg = 333872785 * i5;
                }
                if (24 == i3) {
                    ac ad4 = hv.ad(i6, 65422979);
                    boolean z = true;
                    if (ad4.au * -586529633 > 0) {
                        z = aw.fu(ad4, 414145941);
                    }
                    if (z) {
                        ad3 = ik.ad(nr.cg, client.dv.ag, (byte) 42);
                        ad3.an.ay(i6, (short) 128);
                        client.dv.an(ad3, (short) 255);
                    }
                }
                if (1003 == i3) {
                    gm gmVar = client.ca[i8];
                    if (gmVar != null) {
                        au auVar = gmVar.af;
                        if (auVar.bg != null) {
                            auVar = auVar.ar(2125288365);
                        }
                        if (auVar != null) {
                            ad2 = ik.ad(nr.cn, client.dv.ag, (byte) -29);
                            ad2.an.co(auVar.ag * 1467906519, -795714610);
                            client.dv.an(ad2, (short) 255);
                        }
                    }
                }
                if (14 == i3 && client.hb[i8] != null) {
                    client.mj = 176169050 * i5;
                    client.mw = -368238225 * i6;
                    ad2 = ik.ad(nr.cj, client.dv.ag, (byte) 8);
                    ad2.an.cq(-553333807 * fy.ix, 1242192116);
                    ad2.an.aa(-276269945 * gw.ja, -1752508204);
                    ad2.an.co(i8, -1537386428);
                    ad2.an.co(-1820367967 * fw.iz, 1312130717);
                    ad2.an.an(client.ao.ac(82, (byte) -24) ? 1 : 0, (byte) 31);
                    client.dv.an(ad2, (short) 255);
                }
                if (-1556778131 == i3 && client.hb[i8] != null) {
                    client.mj = -751012115 * i5;
                    client.mw = 637696707 * i6;
                    no ad5 = ik.ad(nr.as, client.dv.ag, (byte) 98);
                    ad5.an.ci(i8, 1239940751);
                    ad5.an.bd(client.ao.ac(82, (byte) -31) ? 1 : 0, 1703184995);
                    client.dv.an(ad5, (short) 255);
                }
                if (client.jb * 430699339 != 0) {
                    client.jb = 0;
                    client.fk(hv.ad(fy.ix * -553333807, -28041200), (byte) 74);
                }
                if (nq.ii.ak(1437852970)) {
                    nq.ii.az(-817767900);
                }
                if (ae.hj != null && 1099321631 * client.hk == 0) {
                    client.fk(ae.hj, (byte) 62);
                }
            }
        }
        if (aa.af(i7, 172382107)) {
            bc(i, i2, true, str2, str, 157339452);
        }
        client.ao.ao(gt.at, 1936421122);
    }

    final boolean am(int i, int i2) {
        if (i < 0) {
            return false;
        }
        try {
            int i3 = 1263979533 * this.be[i].an;
            if (i3 >= 2000) {
                i3 -= 2000;
            }
            return 1007 == i3;
        } catch (Throwable e) {
            throw ba.ad(e, "il.am(" + ')');
        }
    }

    final boolean du(int i) {
        if (i < 0) {
            return false;
        }
        int i2 = 1263979533 * this.be[i].an;
        if (i2 >= 2000) {
            i2 -= 2000;
        }
        if (1007 == i2) {
            return true;
        }
        return false;
    }

    boolean at(int i, int i2, int i3) {
        if (i == -1 || -1 == i2) {
            return false;
        }
        try {
            if (i < (this.bf * 540597955) - 10 || i > ((-388771065 * this.bp) + (this.bf * 540597955)) + 10 || i2 < (this.bv * 2056087335) - 10 || i2 > ((-1806555973 * this.bx) + (this.bv * 2056087335)) + 10) {
                return true;
            }
            return false;
        } catch (Throwable e) {
            throw ba.ad(e, "il.at(" + ')');
        }
    }

    boolean df(int i, int i2) {
        if (i == -1 || -1 == i2) {
            return false;
        }
        if (i < (this.bf * 540597955) - 10) {
            return true;
        }
        if (i > ((-388771065 * this.bp) + (this.bf * 540597955)) + 10 || i2 < (this.bv * 2056087335) - 10 || i2 > ((-1806555973 * this.bx) + (this.bv * 2056087335)) + 10) {
            return true;
        }
        return false;
    }

    boolean dg(int i, int i2) {
        if (i == -1 || -1 == i2) {
            return false;
        }
        if (i < (540597955 * this.bf) - 10 || i > ((-388771065 * this.bp) + (-1002658425 * this.bf)) + 10 || i2 < (this.bv * 2056087335) - 10 || i2 > ((-1443277262 * this.bx) + (this.bv * 2056087335)) + 10) {
            return true;
        }
        return false;
    }

    boolean dp(int i, int i2) {
        if (i == -1 || -1 == i2) {
            return false;
        }
        if (i < (this.bf * 540597955) - 10) {
            return true;
        }
        if (i > ((-388771065 * this.bp) + (this.bf * 540597955)) + 10 || i2 < (this.bv * 2056087335) - 10 || i2 > ((-1806555973 * this.bx) + (this.bv * 2056087335)) + 10) {
            return true;
        }
        return false;
    }

    public void ab(int i) {
        int i2 = 0;
        while (i2 < 8) {
            try {
                this.bz[i2] = null;
                this.bg[i2] = false;
                i2++;
            } catch (Throwable e) {
                throw ba.ad(e, "il.ab(" + ')');
            }
        }
    }

    public void dq() {
        for (int i = 0; i < 8; i++) {
            this.bz[i] = null;
            this.bg[i] = false;
        }
    }

    public void er() {
        for (int i = 0; i < 8; i++) {
            this.bz[i] = null;
            this.bg[i] = false;
        }
    }

    public void aw(int i, String str, int i2, byte b) {
        boolean z = true;
        if (i >= 1 && i <= 8) {
            try {
                if (str.equalsIgnoreCase("null")) {
                    str = null;
                }
                this.bz[i - 1] = str;
                boolean[] zArr = this.bg;
                int i3 = i - 1;
                if (i2 != 0) {
                    z = false;
                }
                zArr[i3] = z;
            } catch (Throwable e) {
                throw ba.ad(e, "il.aw(" + ')');
            }
        }
    }

    public void ek(int i, String str, int i2) {
        boolean z = true;
        if (i >= 1 && i <= 8) {
            if (str.equalsIgnoreCase("null")) {
                str = null;
            }
            this.bz[i - 1] = str;
            boolean[] zArr = this.bg;
            int i3 = i - 1;
            if (i2 != 0) {
                z = false;
            }
            zArr[i3] = z;
        }
    }

    public void es(int i, String str, int i2) {
        boolean z = true;
        if (i >= 1 && i <= 8) {
            if (str.equalsIgnoreCase("null")) {
                str = null;
            }
            this.bz[i - 1] = str;
            boolean[] zArr = this.bg;
            int i3 = i - 1;
            if (i2 != 0) {
                z = false;
            }
            zArr[i3] = z;
        }
    }

    public void ew(int i, String str, int i2) {
        boolean z = true;
        if (i >= 1 && i <= 8) {
            if (str.equalsIgnoreCase("null")) {
                str = null;
            }
            this.bz[i - 1] = str;
            boolean[] zArr = this.bg;
            int i3 = i - 1;
            if (i2 != 0) {
                z = false;
            }
            zArr[i3] = z;
        }
    }

    public void ex(int i, String str, int i2) {
        boolean z = true;
        if (i >= 1 && i <= 8) {
            if (str.equalsIgnoreCase("null")) {
                str = null;
            }
            this.bz[i - 1] = str;
            boolean[] zArr = this.bg;
            int i3 = i - 1;
            if (i2 != 0) {
                z = false;
            }
            zArr[i3] = z;
        }
    }

    void ai(int i, int i2, int i3, int i4, int i5) {
        try {
            ac an = jd.an(i, i2, (byte) 62);
            if (!(an == null || an.eu == null)) {
                hv hvVar = new hv();
                hvVar.an = an;
                hvVar.af = an.eu;
                cg.af(hvVar, 120021096);
            }
            this.ac = 178565931 * i4;
            this.ax = true;
            this.au = -331089777 * i;
            this.av = 1943398585 * i2;
            this.al = -713036761 * i3;
            client.fk(an, (byte) 63);
        } catch (Throwable e) {
            throw ba.ad(e, "il.ai(" + ')');
        }
    }

    void ec(int i, int i2, int i3, int i4) {
        ac an = jd.an(i, i2, (byte) 91);
        if (!(an == null || an.eu == null)) {
            hv hvVar = new hv();
            hvVar.an = an;
            hvVar.af = an.eu;
            cg.af(hvVar, -651628426);
        }
        this.ac = 1301180708 * i4;
        this.ax = true;
        this.au = 1235542054 * i;
        this.av = 1943398585 * i2;
        this.al = -713036761 * i3;
        client.fk(an, (byte) 104);
    }

    void ep(int i, int i2, int i3, int i4) {
        ac an = jd.an(i, i2, (byte) 122);
        if (!(an == null || an.eu == null)) {
            hv hvVar = new hv();
            hvVar.an = an;
            hvVar.af = an.eu;
            cg.af(hvVar, -706247626);
        }
        this.ac = 207744252 * i4;
        this.ax = true;
        this.au = -331089777 * i;
        this.av = 1943398585 * i2;
        this.al = 546477250 * i3;
        client.fk(an, (byte) 59);
    }

    void eu(int i, int i2, int i3, int i4) {
        ac an = jd.an(i, i2, (byte) 94);
        if (!(an == null || an.eu == null)) {
            hv hvVar = new hv();
            hvVar.an = an;
            hvVar.af = an.eu;
            cg.af(hvVar, 232747889);
        }
        this.ac = 178565931 * i4;
        this.ax = true;
        this.au = -331089777 * i;
        this.av = 1943398585 * i2;
        this.al = -713036761 * i3;
        client.fk(an, (byte) 10);
    }

    void az(int i) {
        try {
            if (this.ax) {
                ac an = jd.an(this.au * -348248465, this.av * -2001363575, (byte) 113);
                if (!(an == null || an.ec == null)) {
                    hv hvVar = new hv();
                    hvVar.an = an;
                    hvVar.af = an.ec;
                    cg.af(hvVar, 56314653);
                }
                this.ax = false;
                client.fk(an, (byte) 122);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "il.az(" + ')');
        }
    }

    void eq() {
        if (this.ax) {
            ac an = jd.an(this.au * -348248465, this.av * -2001363575, (byte) 54);
            if (!(an == null || an.ec == null)) {
                hv hvVar = new hv();
                hvVar.an = an;
                hvVar.af = an.ec;
                cg.af(hvVar, -715810820);
            }
            this.ax = false;
            client.fk(an, (byte) 54);
        }
    }

    void ev() {
        if (this.ax) {
            ac an = jd.an(this.au * -348248465, this.av * -2001363575, (byte) 10);
            if (!(an == null || an.ec == null)) {
                hv hvVar = new hv();
                hvVar.an = an;
                hvVar.af = an.ec;
                cg.af(hvVar, 313909677);
            }
            this.ax = false;
            client.fk(an, (byte) 44);
        }
    }

    void ah(String str, String str2, byte b) {
        try {
            this.ap = str;
            this.bw = str2;
        } catch (Throwable e) {
            throw ba.ad(e, "il.ah(" + ')');
        }
    }

    void en(String str, String str2) {
        this.ap = str;
        this.bw = str2;
    }

    boolean ak(int i) {
        try {
            return this.ax;
        } catch (Throwable e) {
            throw ba.ad(e, "il.ak(" + ')');
        }
    }

    boolean ea() {
        return this.ax;
    }

    public void ao(boolean z, int i) {
        try {
            this.ax = z;
        } catch (Throwable e) {
            throw ba.ad(e, "il.ao(" + ')');
        }
    }

    public void ef(boolean z) {
        this.ax = z;
    }

    public void el(boolean z) {
        this.ax = z;
    }

    public void et(boolean z) {
        this.ax = z;
    }

    public void ey(boolean z) {
        this.ax = z;
    }

    int ax(int i) {
        try {
            return this.au * -348248465;
        } catch (Throwable e) {
            throw ba.ad(e, "il.ax(" + ')');
        }
    }

    int ed() {
        return this.au * -348248465;
    }

    int eg() {
        return this.au * -348248465;
    }

    int ej() {
        return this.au * -348248465;
    }

    int au(int i) {
        try {
            return -2001363575 * this.av;
        } catch (Throwable e) {
            throw ba.ad(e, "il.au(" + ')');
        }
    }

    int em() {
        return -2001363575 * this.av;
    }

    int ez() {
        return -1709362454 * this.av;
    }

    int av(int i) {
        try {
            return this.ac * 1169453955;
        } catch (Throwable e) {
            throw ba.ad(e, "il.av(" + ')');
        }
    }

    int eb() {
        return this.ac * -1946074364;
    }

    int ee() {
        return this.ac * 1169453955;
    }

    public void ac(gf gfVar, byte b) {
        try {
            int i;
            gfVar.aa(this.bf * 540597955, 2056087335 * this.bv, this.bp * -388771065, -1806555973 * this.bx, 520569781 * this.aq, (byte) 28);
            gfVar.aa((this.bf * 540597955) + 1, (2056087335 * this.bv) + 1, (-388771065 * this.bp) - 2, (657357121 * this.az) + 1, 0, (byte) -5);
            gfVar.fi((this.bf * 540597955) + 1, ((657357121 * this.az) + 3) + (2056087335 * this.bv), (this.bp * -388771065) - 2, (-1806555973 * this.bx) - ((657357121 * this.az) + 4), -16777216, 1042426843);
            if (this.ak) {
                i = this.ai.ae;
            } else {
                i = 0;
            }
            this.ai.aj(jv.fi, (this.bf * 540597955) + 3, ((this.bv * 2056087335) + ((this.az * 657357121) - 1)) - i, 520569781 * this.aq, -1, gfVar);
            int i2 = client.ao.ar[0];
            int i3 = client.ao.aj[0];
            for (int i4 = 0; i4 < this.bu * 49382109; i4++) {
                int i5;
                int i6 = (((2056087335 * this.bv) + (657357121 * this.az)) + 3) + ((this.az * 657357121) * (((49382109 * this.bu) - 1) - i4));
                boolean aj = aj(i2, i3, i6, -400093925);
                if (this.ak) {
                    if (aj) {
                        gfVar.aa((540597955 * this.bf) + 2, ((((this.bu * 49382109) - i4) * (this.az * 657357121)) + (2056087335 * this.bv)) + 3, (this.bp * -388771065) - 4, 657357121 * this.az, -580114975 * this.at, (byte) 9);
                    } else if (i4 % 2 == 1) {
                        gfVar.aa((540597955 * this.bf) + 2, (((this.az * 657357121) * ((this.bu * 49382109) - i4)) + (this.bv * 2056087335)) + 3, (-388771065 * this.bp) - 4, this.az * 657357121, this.am * 1934311801, (byte) -11);
                    }
                }
                if (aj) {
                    i5 = -1168104053 * this.aw;
                } else {
                    i5 = this.ab * 287584741;
                }
                this.ai.aj(ap(i4, (byte) -41), (-804384109 * this.ah) + (this.bf * 540597955), (((this.az * 657357121) + i6) - 1) - i, i5, 0, gfVar);
            }
            ha.ex(540597955 * this.bf, 2056087335 * this.bv, this.bp * -388771065, this.bx * -1806555973, (short) 8294);
        } catch (Throwable e) {
            throw ba.ad(e, "il.ac(" + ')');
        }
    }

    public void eh(gf gfVar) {
        int i;
        gfVar.aa(this.bf * 540597955, 2056087335 * this.bv, this.bp * 979368476, 1939809513 * this.bx, -2032379651 * this.aq, (byte) -6);
        gfVar.aa((this.bf * -529270583) + 1, (2056087335 * this.bv) + 1, (-350886461 * this.bp) - 2, (657357121 * this.az) + 1, 0, (byte) 4);
        gfVar.fi((this.bf * -2085419068) + 1, ((-143695542 * this.az) + 3) + (883077295 * this.bv), (this.bp * -1298798664) - 2, (-1806555973 * this.bx) - ((657357121 * this.az) + 4), -259738573, 141116614);
        if (this.ak) {
            i = this.ai.ae;
        } else {
            i = 0;
        }
        this.ai.aj(jv.fi, (this.bf * -154446466) + 3, ((this.bv * 2056087335) + ((this.az * 657357121) - 1)) - i, 520569781 * this.aq, -1, gfVar);
        int i2 = client.ao.ar[0];
        int i3 = client.ao.aj[0];
        for (int i4 = 0; i4 < this.bu * 652283570; i4++) {
            int i5;
            int i6 = (((2056087335 * this.bv) + (657357121 * this.az)) + 3) + ((this.az * 485521847) * (((49382109 * this.bu) - 1) - i4));
            boolean aj = aj(i2, i3, i6, -1071262873);
            if (this.ak) {
                if (aj) {
                    gfVar.aa((540597955 * this.bf) + 2, ((((this.bu * -1698145919) - i4) * (this.az * 657357121)) + (-1850116786 * this.bv)) + 3, (this.bp * -388771065) - 4, 319583983 * this.az, 1067145733 * this.at, (byte) 86);
                } else if (i4 % 2 == 1) {
                    gfVar.aa((-510428482 * this.bf) + 2, (((this.az * -652921867) * ((this.bu * -535343837) - i4)) + (this.bv * 1616782743)) + 3, (-388771065 * this.bp) - 4, this.az * -585187547, this.am * -1968227507, (byte) -11);
                }
            }
            if (aj) {
                i5 = -1168104053 * this.aw;
            } else {
                i5 = this.ab * 1189528892;
            }
            this.ai.aj(ap(i4, (byte) -68), (612011505 * this.ah) + (this.bf * 540597955), (((this.az * 657357121) + i6) - 1) - i, i5, 0, gfVar);
        }
        ha.ex(-229722509 * this.bf, 2031932692 * this.bv, this.bp * -388771065, this.bx * 369293685, (short) -2693);
    }

    public void ei(gf gfVar) {
        int i;
        gfVar.aa(this.bf * 540597955, 2056087335 * this.bv, this.bp * -388771065, -1806555973 * this.bx, 520569781 * this.aq, (byte) 29);
        gfVar.aa((this.bf * 540597955) + 1, (2056087335 * this.bv) + 1, (-388771065 * this.bp) - 2, (657357121 * this.az) + 1, 0, (byte) -33);
        gfVar.fi((this.bf * 540597955) + 1, ((657357121 * this.az) + 3) + (2056087335 * this.bv), (this.bp * -388771065) - 2, (-1806555973 * this.bx) - ((657357121 * this.az) + 4), -16777216, 1461737871);
        if (this.ak) {
            i = this.ai.ae;
        } else {
            i = 0;
        }
        this.ai.aj(jv.fi, (this.bf * 540597955) + 3, ((this.bv * 2056087335) + ((this.az * 657357121) - 1)) - i, 520569781 * this.aq, -1, gfVar);
        int i2 = client.ao.ar[0];
        int i3 = client.ao.aj[0];
        for (int i4 = 0; i4 < this.bu * 49382109; i4++) {
            int i5 = (((2056087335 * this.bv) + (657357121 * this.az)) + 3) + ((this.az * 657357121) * (((49382109 * this.bu) - 1) - i4));
            boolean aj = aj(i2, i3, i5, -1212747463);
            if (this.ak) {
                if (aj) {
                    gfVar.aa((540597955 * this.bf) + 2, ((((this.bu * 49382109) - i4) * (this.az * 657357121)) + (2056087335 * this.bv)) + 3, (this.bp * -388771065) - 4, 657357121 * this.az, -580114975 * this.at, (byte) -3);
                } else if (i4 % 2 == 1) {
                    gfVar.aa((540597955 * this.bf) + 2, (((this.az * 657357121) * ((this.bu * 49382109) - i4)) + (this.bv * 2056087335)) + 3, (-388771065 * this.bp) - 4, this.az * 657357121, this.am * 1934311801, (byte) -14);
                }
            }
            this.ai.aj(ap(i4, (byte) -23), (-804384109 * this.ah) + (this.bf * 540597955), (((this.az * 657357121) + i5) - 1) - i, aj ? -1168104053 * this.aw : this.ab * 287584741, 0, gfVar);
        }
        ha.ex(540597955 * this.bf, 2056087335 * this.bv, this.bp * -388771065, this.bx * -1806555973, (short) -11332);
    }

    public void eo(gf gfVar) {
        int i;
        gfVar.aa(this.bf * 540597955, 2056087335 * this.bv, this.bp * -388771065, -1806555973 * this.bx, 520569781 * this.aq, (byte) -82);
        gfVar.aa((this.bf * 540597955) + 1, (2056087335 * this.bv) + 1, (-388771065 * this.bp) - 2, (657357121 * this.az) + 1, 0, (byte) -51);
        gfVar.fi((this.bf * 540597955) + 1, ((657357121 * this.az) + 3) + (2056087335 * this.bv), (this.bp * -388771065) - 2, (-1806555973 * this.bx) - ((657357121 * this.az) + 4), -16777216, 1620882571);
        if (this.ak) {
            i = this.ai.ae;
        } else {
            i = 0;
        }
        this.ai.aj(jv.fi, (this.bf * 540597955) + 3, ((this.bv * 2056087335) + ((this.az * 657357121) - 1)) - i, 520569781 * this.aq, -1, gfVar);
        int i2 = client.ao.ar[0];
        int i3 = client.ao.aj[0];
        for (int i4 = 0; i4 < this.bu * 49382109; i4++) {
            int i5;
            int i6 = (((2056087335 * this.bv) + (657357121 * this.az)) + 3) + ((this.az * 657357121) * (((49382109 * this.bu) - 1) - i4));
            boolean aj = aj(i2, i3, i6, -1019907682);
            if (this.ak) {
                if (aj) {
                    gfVar.aa((540597955 * this.bf) + 2, ((((this.bu * 49382109) - i4) * (this.az * 657357121)) + (2056087335 * this.bv)) + 3, (this.bp * -388771065) - 4, 657357121 * this.az, -580114975 * this.at, (byte) -30);
                } else if (i4 % 2 == 1) {
                    gfVar.aa((540597955 * this.bf) + 2, (((this.az * 657357121) * ((this.bu * 49382109) - i4)) + (this.bv * 2056087335)) + 3, (-388771065 * this.bp) - 4, this.az * 657357121, this.am * 1934311801, (byte) -65);
                }
            }
            if (aj) {
                i5 = -1168104053 * this.aw;
            } else {
                i5 = this.ab * 287584741;
            }
            this.ai.aj(ap(i4, (byte) -49), (-804384109 * this.ah) + (this.bf * 540597955), (((this.az * 657357121) + i6) - 1) - i, i5, 0, gfVar);
        }
        ha.ex(540597955 * this.bf, 2056087335 * this.bv, this.bp * -388771065, this.bx * -1806555973, (short) -21013);
    }

    public void fd(gf gfVar) {
        int i;
        gfVar.aa(this.bf * 540597955, 2056087335 * this.bv, this.bp * -388771065, -1806555973 * this.bx, 520569781 * this.aq, (byte) 16);
        gfVar.aa((this.bf * 540597955) + 1, (2056087335 * this.bv) + 1, (-388771065 * this.bp) - 2, (657357121 * this.az) + 1, 0, (byte) 9);
        gfVar.fi((this.bf * 540597955) + 1, ((657357121 * this.az) + 3) + (2056087335 * this.bv), (this.bp * -388771065) - 2, (-1806555973 * this.bx) - ((657357121 * this.az) + 4), -16777216, 1031339263);
        if (this.ak) {
            i = this.ai.ae;
        } else {
            i = 0;
        }
        this.ai.aj(jv.fi, (this.bf * 540597955) + 3, ((this.bv * 2056087335) + ((this.az * 657357121) - 1)) - i, 520569781 * this.aq, -1, gfVar);
        int i2 = client.ao.ar[0];
        int i3 = client.ao.aj[0];
        for (int i4 = 0; i4 < this.bu * 49382109; i4++) {
            int i5;
            int i6 = (((2056087335 * this.bv) + (657357121 * this.az)) + 3) + ((this.az * 657357121) * (((49382109 * this.bu) - 1) - i4));
            boolean aj = aj(i2, i3, i6, 369430295);
            if (this.ak) {
                if (aj) {
                    gfVar.aa((540597955 * this.bf) + 2, ((((this.bu * 49382109) - i4) * (this.az * 657357121)) + (2056087335 * this.bv)) + 3, (this.bp * -388771065) - 4, 657357121 * this.az, -580114975 * this.at, (byte) 58);
                } else if (i4 % 2 == 1) {
                    gfVar.aa((540597955 * this.bf) + 2, (((this.az * 657357121) * ((this.bu * 49382109) - i4)) + (this.bv * 2056087335)) + 3, (-388771065 * this.bp) - 4, this.az * 657357121, this.am * 1934311801, (byte) 69);
                }
            }
            if (aj) {
                i5 = -1168104053 * this.aw;
            } else {
                i5 = this.ab * 287584741;
            }
            this.ai.aj(ap(i4, (byte) -83), (-804384109 * this.ah) + (this.bf * 540597955), (((this.az * 657357121) + i6) - 1) - i, i5, 0, gfVar);
        }
        ha.ex(540597955 * this.bf, 2056087335 * this.bv, this.bp * -388771065, this.bx * -1806555973, (short) -9148);
    }

    public final void al(int i, int i2, gf gfVar, int i3) {
        try {
            if (!this.co) {
                if (this.bu * 49382109 >= 2 || client.jb * 430699339 != 0 || this.ax) {
                    String str;
                    int ba = ba(1461701873);
                    if (client.jb * 430699339 == 1 && this.bu * 49382109 < 2) {
                        str = jv.fx + jv.gc + client.it + " " + ha.ay;
                    } else if (!this.ax || this.bu * 49382109 >= 2) {
                        str = ap(ba, (byte) -31);
                    } else {
                        str = this.ap + jv.gc + this.bw + " " + ha.ay;
                    }
                    if (this.bu * 49382109 > 2) {
                        str = str + gg.ad(16777215, (short) 300) + " " + '/' + " " + ((this.bu * 49382109) - 2) + jv.fw;
                    }
                    this.ai.az(str, (this.ah * -804384109) + i, (this.ai.aj + (this.ai.ar + i2)) - 1, 16777215, 0, (1581849891 * client.ak) / 1000, gfVar);
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "il.al(" + ')');
        }
    }

    public final void fk(int i, int i2, gf gfVar) {
        if (!this.co) {
            if (this.bu * 1543406046 >= 2 || client.jb * 832363126 != 0 || this.ax) {
                String str;
                String str2;
                int ba = ba(-1219911359);
                if (client.jb * 1710462431 == 1 && this.bu * 718463532 < 2) {
                    str = jv.fx + jv.gc + client.it + " " + ha.ay;
                } else if (!this.ax || this.bu * 49382109 >= 2) {
                    str = ap(ba, (byte) -53);
                } else {
                    str = this.ap + jv.gc + this.bw + " " + ha.ay;
                }
                if (this.bu * 1948834845 > 2) {
                    str2 = str + gg.ad(-456736523, (short) 300) + " " + '搂' + " " + ((this.bu * 49382109) - 2) + jv.fw;
                } else {
                    str2 = str;
                }
                this.ai.az(str2, (this.ah * 110851089) + i, (this.ai.aj + (this.ai.ar + i2)) - 1, 16777215, 0, (1581849891 * client.ak) / -332763936, gfVar);
            }
        }
    }

    public final void fv(int i, int i2, gf gfVar) {
        if (!this.co) {
            if (this.bu * 49382109 >= 2 || client.jb * 430699339 != 0 || this.ax) {
                String str;
                String str2;
                int ba = ba(1457178878);
                if (client.jb * 430699339 == 1 && this.bu * 49382109 < 2) {
                    str = jv.fx + jv.gc + client.it + " " + ha.ay;
                } else if (!this.ax || this.bu * 49382109 >= 2) {
                    str = ap(ba, (byte) -38);
                } else {
                    str = this.ap + jv.gc + this.bw + " " + ha.ay;
                }
                if (this.bu * 49382109 > 2) {
                    str2 = str + gg.ad(16777215, (short) 300) + " " + '/' + " " + ((this.bu * 49382109) - 2) + jv.fw;
                } else {
                    str2 = str;
                }
                this.ai.az(str2, (this.ah * -804384109) + i, (this.ai.aj + (this.ai.ar + i2)) - 1, 16777215, 0, (1581849891 * client.ak) / 1000, gfVar);
            }
        }
    }

    String ap(int i, byte b) {
        if (i < 0) {
            try {
                return "";
            } catch (Throwable e) {
                throw ba.ad(e, "il.ap(" + ')');
            }
        }
        js jsVar = this.be[i];
        if (jsVar.ay.length() > 0) {
            return jsVar.ag + jv.gc + jsVar.ay;
        }
        return jsVar.ag;
    }

    String fa(int i) {
        if (i < 0) {
            return "";
        }
        js jsVar = this.be[i];
        return jsVar.ay.length() > 0 ? jsVar.ag + jv.gc + jsVar.ay : jsVar.ag;
    }

    String fm(int i) {
        if (i < 0) {
            return "";
        }
        js jsVar = this.be[i];
        return jsVar.ay.length() > 0 ? jsVar.ag + jv.gc + jsVar.ay : jsVar.ag;
    }

    void bw(int i) {
        try {
            et.es(this.bf * 540597955, this.bv * 2056087335, this.bp * -388771065, -1806555973 * this.bx, 170275756);
        } catch (Throwable e) {
            throw ba.ad(e, "il.bw(" + ')');
        }
    }

    void fh() {
        et.es(this.bf * 540597955, this.bv * 2056087335, this.bp * -388771065, -1806555973 * this.bx, 1299069785);
    }

    void fl() {
        et.es(this.bf * 1410822364, this.bv * 2056087335, this.bp * -388771065, -1806555973 * this.bx, 1147726432);
    }

    public void bb(int i, int i2, boolean z, int i3) {
        try {
            bc(i, i2, z, null, null, -1185845716);
        } catch (Throwable e) {
            throw ba.ad(e, "il.bb(" + ')');
        }
    }

    public void fb(int i, int i2, boolean z) {
        bc(i, i2, z, null, null, 400153328);
    }

    public void fg(int i, int i2, boolean z) {
        bc(i, i2, z, null, null, 39977910);
    }

    public void fp(int i, int i2, boolean z) {
        bc(i, i2, z, null, null, -1355188835);
    }

    public void fq(int i, int i2, boolean z) {
        bc(i, i2, z, null, null, -752208578);
    }

    public void fr(int i, int i2, boolean z) {
        bc(i, i2, z, null, null, -207268845);
    }

    void bc(int i, int i2, boolean z, String str, String str2, int i3) {
        try {
            this.bl = -758323719 * i;
            this.bd = -2081499725 * i2;
            this.bi = z;
            this.br = 0;
            this.bs = str;
            this.bm = str2;
        } catch (Throwable e) {
            throw ba.ad(e, "il.bc(" + ')');
        }
    }

    void fc(int i, int i2, boolean z, String str, String str2) {
        this.bl = -758323719 * i;
        this.bd = -2081499725 * i2;
        this.bi = z;
        this.br = 0;
        this.bs = str;
        this.bm = str2;
    }

    void ff(int i, int i2, boolean z, String str, String str2) {
        this.bl = -758323719 * i;
        this.bd = -2081499725 * i2;
        this.bi = z;
        this.br = 0;
        this.bs = str;
        this.bm = str2;
    }

    void fo(int i, int i2, boolean z, String str, String str2) {
        this.bl = -1586968594 * i;
        this.bd = -2081499725 * i2;
        this.bi = z;
        this.br = 0;
        this.bs = str;
        this.bm = str2;
    }

    void fu(int i, int i2, boolean z, String str, String str2) {
        this.bl = -758323719 * i;
        this.bd = -2081499725 * i2;
        this.bi = z;
        this.br = 0;
        this.bs = str;
        this.bm = str2;
    }

    public void bz(gf gfVar, int i) {
        int i2 = 0;
        try {
            if (!client.hy) {
                return;
            }
            if (this.br * 1898781285 < this.bj * -712899199) {
                if (-1 != 1988698123 * this.cv) {
                    ch(553095800);
                }
                if (this.bq == null) {
                    bg(gfVar, 0, (byte) 52);
                    return;
                }
                int i3 = this.bq[0].ad;
                int length = this.bq.length / 2;
                if (this.bi) {
                    i2 = this.bq.length / 2;
                }
                if (this.bo) {
                    int i4 = 255 - ((this.br * -1142076773) / (this.bj * -712899199));
                    gfVar.bc(this.bq[i2 + ((length * (this.br * 1898781285)) / (this.bj * -712899199))], ((this.bl * 1389415497) - ((i3 * 3) / 2)) + 8, ((this.bd * -2023759493) - ((i3 * 3) / 2)) + 8, i4, -351032358);
                } else {
                    gfVar.ah(this.bq[i2 + ((length * (this.br * 1898781285)) / (this.bj * -712899199))], ((this.bl * 1389415497) - ((i3 * 3) / 2)) + 8, ((this.bd * -2023759493) - ((i3 * 3) / 2)) + 8, 2106205673);
                }
                bg(gfVar, i3, (byte) 45);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "il.bz(" + ')');
        }
    }

    public void fz(gf gfVar) {
        int i = 0;
        if (client.hy && this.br * 1898781285 < this.bj * -712899199) {
            if (-1 != 1988698123 * this.cv) {
                ch(1701369557);
            }
            if (this.bq == null) {
                bg(gfVar, 0, (byte) -31);
                return;
            }
            int i2 = this.bq[0].ad;
            int length = this.bq.length / 2;
            if (this.bi) {
                i = this.bq.length / 2;
            }
            if (this.bo) {
                int i3 = 255 - ((this.br * -1142076773) / (this.bj * -712899199));
                gfVar.bc(this.bq[i + ((length * (this.br * 1898781285)) / (this.bj * -712899199))], ((this.bl * 1389415497) - ((i2 * 3) / 2)) + 8, ((this.bd * -2023759493) - ((i2 * 3) / 2)) + 8, i3, 870383633);
            } else {
                gfVar.ah(this.bq[i + ((length * (this.br * 1898781285)) / (this.bj * -712899199))], ((this.bl * 1389415497) - ((i2 * 3) / 2)) + 8, ((this.bd * -2023759493) - ((i2 * 3) / 2)) + 8, 2106205673);
            }
            bg(gfVar, i2, (byte) -9);
        }
    }

    void bg(gf gfVar, int i, byte b) {
        try {
            if (this.ci && this.bm != null) {
                int i2;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.bm);
                if (this.bs != null && this.bs.length() > 0) {
                    stringBuilder.append(jv.gc);
                    stringBuilder.append(this.bs);
                    stringBuilder.append(ha.ar);
                }
                String stringBuilder2 = stringBuilder.toString();
                int i3 = ((this.bl * 1389415497) + i) + 8;
                int aa = this.ai.aa(stringBuilder2);
                if (this.bl * 1389415497 > (-481290979 * gfVar.ad) / 2) {
                    i2 = (((this.bl * 1389415497) - i) - 8) - aa;
                } else {
                    i2 = i3;
                }
                if (this.bo) {
                    int i4 = 255;
                    if (1898781285 * this.br > (this.bj * -712899199) / 2) {
                        i4 = 255 - ((((1898781285 * this.br) - ((this.bj * -712899199) / 2)) * 510) / (this.bj * -712899199));
                    }
                    gfVar.fw(i2 - 5, (this.bd * -2023759493) - 8, aa + 10, this.ai.as + 10, 0, i4, -309853452);
                    gfVar.an(i2 - 4, (this.bd * -2023759493) - 7, aa + 8, this.ai.as + 8, 6710886, i4, (byte) 8);
                    this.ai.ae(stringBuilder2, i2, (this.bd * -2023759493) + (this.ai.as / 2), 16777215, 0, i4, gfVar);
                    return;
                }
                gfVar.fi(i2 - 5, (this.bd * -2023759493) - 8, aa + 10, this.ai.as + 10, 0, 752603887);
                gfVar.aa(i2 - 4, (this.bd * -2023759493) - 7, aa + 8, this.ai.as + 8, 6710886, (byte) -57);
                this.ai.aj(stringBuilder2, i2, (this.ai.as / 2) + (this.bd * -2023759493), 16777215, 0, gfVar);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "il.bg(" + ')');
        }
    }

    void fe(gf gfVar, int i) {
        if (this.ci && this.bm != null) {
            int i2;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.bm);
            if (this.bs != null && this.bs.length() > 0) {
                stringBuilder.append(jv.gc);
                stringBuilder.append(this.bs);
                stringBuilder.append(ha.ar);
            }
            String stringBuilder2 = stringBuilder.toString();
            int i3 = ((this.bl * -363565481) + i) + 8;
            int aa = this.ai.aa(stringBuilder2);
            if (this.bl * -993415092 > (-1595163469 * gfVar.ad) / 2) {
                i2 = (((1389415497 * this.bl) - i) - 8) - aa;
            } else {
                i2 = i3;
            }
            if (this.bo) {
                int i4 = 255;
                if (1275590080 * this.br > (this.bj * -712899199) / 2) {
                    i4 = 255 - ((373278253 * ((-615952331 * this.br) - ((-1047714902 * this.bj) / 2))) / (this.bj * -712899199));
                }
                gfVar.fw(i2 - 5, (-2106081164 * this.bd) - 8, aa + 10, this.ai.as + 10, 0, i4, 340761405);
                gfVar.an(i2 - 4, (this.bd * -45929021) - 7, aa + 8, this.ai.as + 8, 6710886, i4, (byte) 8);
                this.ai.ae(stringBuilder2, i2, (1621236283 * this.bd) + (this.ai.as / 2), -1608166270, 0, i4, gfVar);
                return;
            }
            gfVar.fi(i2 - 5, (-914700440 * this.bd) - 8, aa + 10, this.ai.as + 10, 0, 1414412075);
            gfVar.aa(i2 - 4, (this.bd * -2023759493) - 7, aa + 8, this.ai.as + 8, 6710886, (byte) 24);
            this.ai.aj(stringBuilder2, i2, (this.ai.as / 2) + (1652346633 * this.bd), 16777215, 0, gfVar);
        }
    }

    void fn(gf gfVar, int i) {
        if (this.ci && this.bm != null) {
            int i2;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.bm);
            if (this.bs != null && this.bs.length() > 0) {
                stringBuilder.append(jv.gc);
                stringBuilder.append(this.bs);
                stringBuilder.append(ha.ar);
            }
            String stringBuilder2 = stringBuilder.toString();
            int i3 = ((this.bl * 1389415497) + i) + 8;
            int aa = this.ai.aa(stringBuilder2);
            if (this.bl * 1389415497 > (-481290979 * gfVar.ad) / 2) {
                i2 = (((1389415497 * this.bl) - i) - 8) - aa;
            } else {
                i2 = i3;
            }
            if (this.bo) {
                int i4 = 255;
                if (1898781285 * this.br > (this.bj * -712899199) / 2) {
                    i4 = 255 - ((((1898781285 * this.br) - ((-712899199 * this.bj) / 2)) * 510) / (this.bj * -712899199));
                }
                gfVar.fw(i2 - 5, (-2023759493 * this.bd) - 8, aa + 10, this.ai.as + 10, 0, i4, -1584125163);
                gfVar.an(i2 - 4, (this.bd * -2023759493) - 7, aa + 8, this.ai.as + 8, 6710886, i4, (byte) 8);
                this.ai.ae(stringBuilder2, i2, (-2023759493 * this.bd) + (this.ai.as / 2), 16777215, 0, i4, gfVar);
                return;
            }
            gfVar.fi(i2 - 5, (-2023759493 * this.bd) - 8, aa + 10, this.ai.as + 10, 0, 1246094066);
            gfVar.aa(i2 - 4, (this.bd * -2023759493) - 7, aa + 8, this.ai.as + 8, 6710886, (byte) 100);
            this.ai.aj(stringBuilder2, i2, (this.ai.as / 2) + (-2023759493 * this.bd), 16777215, 0, gfVar);
        }
    }

    void fs(gf gfVar, int i) {
        if (this.ci && this.bm != null) {
            int i2;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.bm);
            if (this.bs != null && this.bs.length() > 0) {
                stringBuilder.append(jv.gc);
                stringBuilder.append(this.bs);
                stringBuilder.append(ha.ar);
            }
            String stringBuilder2 = stringBuilder.toString();
            int i3 = ((this.bl * 1389415497) + i) + 8;
            int aa = this.ai.aa(stringBuilder2);
            if (this.bl * 1389415497 > (-481290979 * gfVar.ad) / 2) {
                i2 = (((1389415497 * this.bl) - i) - 8) - aa;
            } else {
                i2 = i3;
            }
            if (this.bo) {
                int i4 = 255;
                if (1898781285 * this.br > (this.bj * -712899199) / 2) {
                    i4 = 255 - ((((1898781285 * this.br) - ((-712899199 * this.bj) / 2)) * 510) / (this.bj * -712899199));
                }
                gfVar.fw(i2 - 5, (-2023759493 * this.bd) - 8, aa + 10, this.ai.as + 10, 0, i4, -1857119720);
                gfVar.an(i2 - 4, (this.bd * -2023759493) - 7, aa + 8, this.ai.as + 8, 6710886, i4, (byte) 8);
                this.ai.ae(stringBuilder2, i2, (-2023759493 * this.bd) + (this.ai.as / 2), 16777215, 0, i4, gfVar);
                return;
            }
            gfVar.fi(i2 - 5, (-2023759493 * this.bd) - 8, aa + 10, this.ai.as + 10, 0, 1974516568);
            gfVar.aa(i2 - 4, (this.bd * -2023759493) - 7, aa + 8, this.ai.as + 8, 6710886, (byte) 33);
            this.ai.aj(stringBuilder2, i2, (this.ai.as / 2) + (-2023759493 * this.bd), 16777215, 0, gfVar);
        }
    }

    public final void bh(int i, int i2, int i3, int i4, int i5) {
        try {
            Object obj;
            if (430699339 * client.jb == 0 && !this.ax) {
                bt(jv.gs, "", 23, 0, i - i3, i2 - i4, -235797509);
            }
            int i6 = i - i3;
            int i7 = i2 - i4;
            if (cs.an && i6 == -429386291 * cs.aa && cs.ag * 340086283 == i7) {
                obj = 1;
            } else {
                obj = null;
            }
            if (obj == null) {
                this.bh = true;
                return;
            }
            int ad;
            int aa;
            this.bh = false;
            long j = -1;
            int i8 = 0;
            long j2 = -1;
            while (i8 < cs.ai * 963961457) {
                long j3 = cs.az[i8];
                if (j2 == j3) {
                    j3 = j2;
                    j2 = j;
                } else {
                    long j4;
                    ad = bv.ad(i8, 2074797577);
                    aa = bh.aa(cs.az[i8]);
                    int ag = hk.ag(i8, (short) 256);
                    int ay = am.ay(i8, 1908891897);
                    if (ag == 2) {
                        if ((gp.en.bg(dq.hf * -1674539149, ad, aa, j3) >= 0 ? 1 : null) != null) {
                            ae am;
                            ae ad2 = gi.ad(ay, 1130281409);
                            if (ad2.ba != null) {
                                am = ad2.am((byte) 44);
                            } else {
                                am = ad2;
                            }
                            if (am == null) {
                                j2 = j;
                            } else if (1 == client.jb * 430699339) {
                                bt(jv.fx, client.it + " " + ha.ay + " " + gg.ad(65535, (short) 300) + am.am, 1, ay, ad, aa, 1818204196);
                            } else if (!this.ax) {
                                String[] strArr = am.bc;
                                if (strArr != null) {
                                    for (i6 = 4; i6 >= 0; i6--) {
                                        if (strArr[i6] != null) {
                                            int i9 = 0;
                                            if (i6 == 0) {
                                                i9 = 3;
                                            }
                                            if (1 == i6) {
                                                i9 = 4;
                                            }
                                            if (i6 == 2) {
                                                i9 = 5;
                                            }
                                            if (3 == i6) {
                                                i9 = 6;
                                            }
                                            if (i6 == 4) {
                                                i9 = 1001;
                                            }
                                            bt(strArr[i6], gg.ad(65535, (short) 300) + am.am, i9, ay, ad, aa, -1772067664);
                                        }
                                    }
                                }
                                bt(jv.ft, gg.ad(65535, (short) 300) + am.am, 1002, 2085520429 * am.aj, ad, aa, -1079578038);
                            } else if (4 == ((this.al * 1111933847) & 4)) {
                                bt(this.ap, this.bw + " " + ha.ay + " " + gg.ad(65535, (short) 300) + am.am, 2, ay, ad, aa, 571579756);
                            }
                        }
                    }
                    if (ag == 1) {
                        gx gxVar;
                        if (ay < 0 || ay >= client.ca.length) {
                            gxVar = null;
                        } else {
                            gxVar = client.ca[ay];
                        }
                        if (gxVar == null) {
                            j2 = j;
                        } else {
                            if (gxVar.af.as * 1160465393 == 1 && ((516759209 * gxVar.bg) & 127) == 64 && ((2328865 * gxVar.bh) & 127) == 64) {
                                bf(gxVar, ad, aa, (byte) 50);
                                bv(gxVar, ad, aa, -1785648639);
                            }
                            bk(gxVar.af, ay, ad, aa, (byte) 53);
                        }
                    }
                    if (ag == 0) {
                        gx gxVar2 = client.hb[ay];
                        if (gxVar2 == null) {
                            j2 = j;
                        } else {
                            if (64 == ((516759209 * gxVar2.bg) & 127) && ((2328865 * gxVar2.bh) & 127) == 64) {
                                bf(gxVar2, ad, aa, (byte) 69);
                                bv(gxVar2, ad, aa, -2122894985);
                            }
                            if (ay != bq.ew(1156713831)) {
                                by(gxVar2, ay, ad, aa, (byte) 1);
                                j4 = j;
                            } else {
                                j4 = j3;
                            }
                        }
                    } else {
                        j4 = j;
                    }
                    if (ag == 3) {
                        kg ek = au.ek(-1674539149 * dq.hf, ad, aa, (byte) 34);
                        if (ek != null) {
                            for (hb hbVar = (hb) ek.ar(); hbVar != null; hbVar = (hb) ek.ae()) {
                                ax af = cm.af(hbVar.af * -15746003, 1218603320);
                                if (client.jb * 430699339 == 1) {
                                    bt(jv.fx, client.it + " " + ha.ay + " " + gg.ad(16748608, (short) 300) + af.ak, 16, hbVar.af * -15746003, ad, aa, -128978645);
                                } else if (!this.ax) {
                                    String[] strArr2 = af.bf;
                                    i6 = 4;
                                    while (i6 >= 0) {
                                        if (strArr2 != null && strArr2[i6] != null) {
                                            int i10 = 0;
                                            if (i6 == 0) {
                                                i10 = 18;
                                            }
                                            if (1 == i6) {
                                                i10 = 19;
                                            }
                                            if (i6 == 2) {
                                                i10 = 20;
                                            }
                                            if (i6 == 3) {
                                                i10 = 21;
                                            }
                                            if (4 == i6) {
                                                i10 = 22;
                                            }
                                            bt(strArr2[i6], gg.ad(16748608, (short) 300) + af.ak, i10, hbVar.af * -15746003, ad, aa, 1251036130);
                                        } else if (i6 == 2) {
                                            bt(jv.ad, gg.ad(16748608, (short) 300) + af.ak, 20, hbVar.af * -15746003, ad, aa, -522258972);
                                        } else {
                                            continue;
                                        }
                                        i6--;
                                    }
                                    bt(jv.ft, gg.ad(16748608, (short) 300) + af.ak, 1004, hbVar.af * -15746003, ad, aa, 618266587);
                                } else if (1 == ((this.al * 1111933847) & 1)) {
                                    bt(this.ap, this.bw + " " + ha.ay + " " + gg.ad(16748608, (short) 300) + af.ak, 17, hbVar.af * -15746003, ad, aa, -1828568756);
                                }
                            }
                        }
                    }
                    j2 = j4;
                }
                i8++;
                j = j2;
                j2 = j3;
            }
            if (-1 != j) {
                aa = aq.an(j);
                int aa2 = bh.aa(j);
                ad = bq.ew(490204457);
                by(client.hb[ad], ad, aa, aa2, (byte) 1);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "il.bh(" + ')');
        }
    }

    public final void fj(int i, int i2, int i3, int i4) {
        if (430699339 * client.jb == 0 && !this.ax) {
            bt(jv.gs, "", 23, 0, i - i3, i2 - i4, -463916389);
        }
        Object obj = (cs.an && i - i3 == -329893732 * cs.aa && cs.ag * 340086283 == i2 - i4) ? 1 : null;
        if (obj == null) {
            this.bh = true;
            return;
        }
        this.bh = false;
        int i5 = 0;
        long j = -1;
        long j2 = -1;
        while (i5 < cs.ai * 1661911508) {
            long j3;
            int ad;
            int aa;
            long j4 = cs.az[i5];
            if (j2 == j4) {
                j3 = j2;
                j4 = j;
            } else {
                int i6;
                int i7;
                ad = bv.ad(i5, 2074797577);
                aa = bh.aa(cs.az[i5]);
                int ag = hk.ag(i5, (short) 256);
                int ay = am.ay(i5, -444015778);
                if (ag == 2) {
                    if ((gp.en.bg(dq.hf * -1674539149, ad, aa, j4) >= 0 ? 1 : null) != null) {
                        ae am;
                        ae ad2 = gi.ad(ay, 2000003399);
                        if (ad2.ba != null) {
                            am = ad2.am((byte) 112);
                        } else {
                            am = ad2;
                        }
                        if (am == null) {
                            j3 = j4;
                            j4 = j;
                        } else if (1 == client.jb * 430699339) {
                            bt(jv.fx, client.it + " " + ha.ay + " " + gg.ad(1659014273, (short) 300) + am.am, 1, ay, ad, aa, -1576928664);
                        } else if (!this.ax) {
                            String[] strArr = am.bc;
                            if (strArr != null) {
                                for (i6 = 4; i6 >= 0; i6--) {
                                    if (strArr[i6] != null) {
                                        i7 = 0;
                                        if (i6 == 0) {
                                            i7 = 3;
                                        }
                                        if (1 == i6) {
                                            i7 = 4;
                                        }
                                        if (i6 == 2) {
                                            i7 = 5;
                                        }
                                        if (3 == i6) {
                                            i7 = 6;
                                        }
                                        if (i6 == 4) {
                                            i7 = 677875381;
                                        }
                                        bt(strArr[i6], gg.ad(65535, (short) 300) + am.am, i7, ay, ad, aa, 331705311);
                                    }
                                }
                            }
                            bt(jv.ft, gg.ad(65535, (short) 300) + am.am, 1002, 2085520429 * am.aj, ad, aa, 646767206);
                        } else if (4 == ((this.al * 1111933847) & 4)) {
                            bt(this.ap, this.bw + " " + ha.ay + " " + gg.ad(-997596120, (short) 300) + am.am, 2, ay, ad, aa, 193730343);
                        }
                    }
                }
                if (ag == 1) {
                    gx gxVar;
                    if (ay < 0 || ay >= client.ca.length) {
                        gxVar = null;
                    } else {
                        gxVar = client.ca[ay];
                    }
                    if (gxVar == null) {
                        j3 = j4;
                        j4 = j;
                    } else {
                        if (gxVar.af.as * -851985133 == 1 && ((1378749356 * gxVar.bg) & 127) == 64 && ((2328865 * gxVar.bh) & 127) == -1927987098) {
                            bf(gxVar, ad, aa, (byte) 69);
                            bv(gxVar, ad, aa, -2017403828);
                        }
                        bk(gxVar.af, ay, ad, aa, (byte) 96);
                    }
                }
                if (ag == 0) {
                    gx gxVar2 = client.hb[ay];
                    if (gxVar2 == null) {
                        j3 = j4;
                        j4 = j;
                    } else {
                        if (64 == ((516759209 * gxVar2.bg) & 127) && ((2142541158 * gxVar2.bh) & 127) == -1488770765) {
                            bf(gxVar2, ad, aa, (byte) 122);
                            bv(gxVar2, ad, aa, -1655278106);
                        }
                        if (ay != bq.ew(-776674266)) {
                            by(gxVar2, ay, ad, aa, (byte) 1);
                        } else {
                            j = j4;
                        }
                    }
                }
                if (ag == 3) {
                    kg ek = au.ek(-1289592840 * dq.hf, ad, aa, (byte) 34);
                    if (ek != null) {
                        for (hb hbVar = (hb) ek.ar(); hbVar != null; hbVar = (hb) ek.ae()) {
                            ax af = cm.af(hbVar.af * -396463523, 1538646297);
                            if (client.jb * 430699339 == 1) {
                                bt(jv.fx, client.it + " " + ha.ay + " " + gg.ad(2089144962, (short) 300) + af.ak, 16, hbVar.af * -15746003, ad, aa, -2088289351);
                            } else if (!this.ax) {
                                String[] strArr2 = af.bf;
                                i6 = 4;
                                while (i6 >= 0) {
                                    if (strArr2 != null && strArr2[i6] != null) {
                                        i7 = 0;
                                        if (i6 == 0) {
                                            i7 = 18;
                                        }
                                        if (1 == i6) {
                                            i7 = 19;
                                        }
                                        if (i6 == 2) {
                                            i7 = 20;
                                        }
                                        if (i6 == 3) {
                                            i7 = 21;
                                        }
                                        if (4 == i6) {
                                            i7 = 22;
                                        }
                                        bt(strArr2[i6], gg.ad(-1455739400, (short) 300) + af.ak, i7, hbVar.af * -15746003, ad, aa, 724290985);
                                    } else if (i6 == 2) {
                                        bt(jv.ad, gg.ad(16748608, (short) 300) + af.ak, 20, hbVar.af * -15746003, ad, aa, -820072624);
                                    }
                                    i6--;
                                }
                                bt(jv.ft, gg.ad(16748608, (short) 300) + af.ak, 1004, hbVar.af * -1176019465, ad, aa, -1239101827);
                            } else if (1 == ((this.al * -1282036004) & 1)) {
                                bt(this.ap, this.bw + " " + ha.ay + " " + gg.ad(-1698993517, (short) 300) + af.ak, 17, hbVar.af * 101246387, ad, aa, -1507261855);
                            }
                        }
                    }
                }
                j3 = j4;
                j4 = j;
            }
            i5++;
            j = j4;
            j2 = j3;
        }
        if (-1 != j) {
            aa = aq.an(j);
            int aa2 = bh.aa(j);
            ad = bq.ew(-861776824);
            by(client.hb[ad], ad, aa, aa2, (byte) 1);
        }
    }

    public final void ft(int i, int i2, int i3, int i4) {
        Object obj;
        if (430699339 * client.jb == 0 && !this.ax) {
            bt(jv.gs, "", 23, 0, i - i3, i2 - i4, -823016143);
        }
        int i5 = i - i3;
        int i6 = i2 - i4;
        if (cs.an && i5 == -429386291 * cs.aa && cs.ag * 340086283 == i6) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj == null) {
            this.bh = true;
            return;
        }
        this.bh = false;
        int i7 = 0;
        long j = -1;
        long j2 = -1;
        while (i7 < cs.ai * 963961457) {
            long j3;
            int ad;
            int aa;
            long j4 = cs.az[i7];
            if (j2 == j4) {
                j3 = j2;
                j4 = j;
            } else {
                int i8;
                ad = bv.ad(i7, 2074797577);
                aa = bh.aa(cs.az[i7]);
                int ag = hk.ag(i7, (short) 256);
                int ay = am.ay(i7, 823253458);
                if (ag == 2) {
                    if (gp.en.bg(dq.hf * -1674539149, ad, aa, j4) >= 0) {
                        obj = 1;
                    } else {
                        obj = null;
                    }
                    if (obj != null) {
                        ae am;
                        ae ad2 = gi.ad(ay, 1910828897);
                        if (ad2.ba != null) {
                            am = ad2.am((byte) 5);
                        } else {
                            am = ad2;
                        }
                        if (am == null) {
                            j3 = j4;
                            j4 = j;
                        } else if (1 == client.jb * 64368364) {
                            bt(jv.fx, client.it + " " + ha.ay + " " + gg.ad(1093748056, (short) 300) + am.am, 1, ay, ad, aa, -601702123);
                        } else if (!this.ax) {
                            String[] strArr = am.bc;
                            if (strArr != null) {
                                for (i5 = 4; i5 >= 0; i5--) {
                                    if (strArr[i5] != null) {
                                        i8 = 0;
                                        if (i5 == 0) {
                                            i8 = 3;
                                        }
                                        if (1 == i5) {
                                            i8 = 4;
                                        }
                                        if (i5 == 2) {
                                            i8 = 5;
                                        }
                                        if (3 == i5) {
                                            i8 = 6;
                                        }
                                        if (i5 == 4) {
                                            i8 = 1001;
                                        }
                                        bt(strArr[i5], gg.ad(65535, (short) 300) + am.am, i8, ay, ad, aa, -1575622332);
                                    }
                                }
                            }
                            bt(jv.ft, gg.ad(-1021863786, (short) 300) + am.am, -1888966500, 1318549658 * am.aj, ad, aa, -1791471802);
                        } else if (4 == ((this.al * 1552951719) & 4)) {
                            bt(this.ap, this.bw + " " + ha.ay + " " + gg.ad(65535, (short) 300) + am.am, 2, ay, ad, aa, 1659283126);
                        }
                    }
                }
                if (ag == 1) {
                    gx gxVar;
                    if (ay < 0 || ay >= client.ca.length) {
                        gxVar = null;
                    } else {
                        gxVar = client.ca[ay];
                    }
                    if (gxVar == null) {
                        j3 = j4;
                        j4 = j;
                    } else {
                        if (gxVar.af.as * 1160465393 == 1 && ((1737237366 * gxVar.bg) & 127) == 1149016098 && ((2328865 * gxVar.bh) & -505903551) == 64) {
                            bf(gxVar, ad, aa, (byte) 46);
                            bv(gxVar, ad, aa, -1646140862);
                        }
                        bk(gxVar.af, ay, ad, aa, (byte) 113);
                    }
                }
                if (ag == 0) {
                    gx gxVar2 = client.hb[ay];
                    if (gxVar2 == null) {
                        j3 = j4;
                        j4 = j;
                    } else {
                        if (64 == ((-1504531221 * gxVar2.bg) & -1482157434) && ((2328865 * gxVar2.bh) & 127) == -972141177) {
                            bf(gxVar2, ad, aa, (byte) 54);
                            bv(gxVar2, ad, aa, -1358505609);
                        }
                        if (ay != bq.ew(163317612)) {
                            by(gxVar2, ay, ad, aa, (byte) 1);
                        } else {
                            j = j4;
                        }
                    }
                }
                if (ag == 3) {
                    kg ek = au.ek(-1674539149 * dq.hf, ad, aa, (byte) 34);
                    if (ek != null) {
                        for (hb hbVar = (hb) ek.ar(); hbVar != null; hbVar = (hb) ek.ae()) {
                            ax af = cm.af(hbVar.af * -15746003, 1161211963);
                            if (client.jb * 430699339 == 1) {
                                bt(jv.fx, client.it + " " + ha.ay + " " + gg.ad(16748608, (short) 300) + af.ak, 16, hbVar.af * -1109054685, ad, aa, 1928449071);
                            } else if (!this.ax) {
                                String[] strArr2 = af.bf;
                                i5 = 4;
                                while (i5 >= 0) {
                                    if (strArr2 != null && strArr2[i5] != null) {
                                        i8 = 0;
                                        if (i5 == 0) {
                                            i8 = 18;
                                        }
                                        if (1 == i5) {
                                            i8 = 19;
                                        }
                                        if (i5 == 2) {
                                            i8 = 20;
                                        }
                                        if (i5 == 3) {
                                            i8 = 21;
                                        }
                                        if (4 == i5) {
                                            i8 = 22;
                                        }
                                        bt(strArr2[i5], gg.ad(16748608, (short) 300) + af.ak, i8, hbVar.af * -1750849217, ad, aa, 1623595432);
                                    } else if (i5 == 2) {
                                        bt(jv.ad, gg.ad(-1842216223, (short) 300) + af.ak, 20, hbVar.af * -15746003, ad, aa, -1896871967);
                                    }
                                    i5--;
                                }
                                bt(jv.ft, gg.ad(-628045204, (short) 300) + af.ak, -2036705163, hbVar.af * -15746003, ad, aa, -846855513);
                            } else if (1 == ((this.al * -1985061036) & 1)) {
                                bt(this.ap, this.bw + " " + ha.ay + " " + gg.ad(16748608, (short) 300) + af.ak, 17, hbVar.af * -15746003, ad, aa, 1602675214);
                            }
                        }
                    }
                }
                j3 = j4;
                j4 = j;
            }
            i7++;
            j = j4;
            j2 = j3;
        }
        if (-1 != j) {
            aa = aq.an(j);
            int aa2 = bh.aa(j);
            ad = bq.ew(729877726);
            by(client.hb[ad], ad, aa, aa2, (byte) 1);
        }
    }

    public final void fx(int i, int i2, int i3, int i4) {
        if (-467484702 * client.jb == 0 && !this.ax) {
            bt(jv.gs, "", 23, 0, i - i3, i2 - i4, 728383049);
        }
        Object obj = (cs.an && i - i3 == -429386291 * cs.aa && cs.ag * 340086283 == i2 - i4) ? 1 : null;
        if (obj == null) {
            this.bh = true;
            return;
        }
        int ad;
        int aa;
        this.bh = false;
        int i5 = 0;
        long j = -1;
        long j2 = -1;
        while (i5 < cs.ai * 963961457) {
            long j3;
            long j4 = cs.az[i5];
            if (j2 == j4) {
                j3 = j2;
                j4 = j;
            } else {
                int i6;
                ad = bv.ad(i5, 2074797577);
                aa = bh.aa(cs.az[i5]);
                int ag = hk.ag(i5, (short) 256);
                int ay = am.ay(i5, -973249573);
                if (ag == 2) {
                    if (gp.en.bg(dq.hf * -1674539149, ad, aa, j4) >= 0) {
                        obj = 1;
                    } else {
                        obj = null;
                    }
                    if (obj != null) {
                        ae am;
                        ae ad2 = gi.ad(ay, 1624875462);
                        if (ad2.ba != null) {
                            am = ad2.am((byte) 37);
                        } else {
                            am = ad2;
                        }
                        if (am == null) {
                            j3 = j4;
                            j4 = j;
                        } else if (1 == client.jb * 530524922) {
                            bt(jv.fx, client.it + " " + ha.ay + " " + gg.ad(65535, (short) 300) + am.am, 1, ay, ad, aa, 1026093782);
                        } else if (!this.ax) {
                            String[] strArr = am.bc;
                            if (strArr != null) {
                                for (i6 = 4; i6 >= 0; i6--) {
                                    if (strArr[i6] != null) {
                                        int i7 = 0;
                                        if (i6 == 0) {
                                            i7 = 3;
                                        }
                                        if (1 == i6) {
                                            i7 = 4;
                                        }
                                        if (i6 == 2) {
                                            i7 = 5;
                                        }
                                        if (3 == i6) {
                                            i7 = 6;
                                        }
                                        if (i6 == 4) {
                                            i7 = -2070054576;
                                        }
                                        bt(strArr[i6], gg.ad(-238525470, (short) 300) + am.am, i7, ay, ad, aa, -1991903056);
                                    }
                                }
                            }
                            bt(jv.ft, gg.ad(-847454247, (short) 300) + am.am, 1002, 2085520429 * am.aj, ad, aa, 1233103917);
                        } else if (4 == ((this.al * 1111933847) & 4)) {
                            bt(this.ap, this.bw + " " + ha.ay + " " + gg.ad(65535, (short) 300) + am.am, 2, ay, ad, aa, 1503839385);
                        }
                    }
                }
                if (ag == 1) {
                    gx gxVar;
                    if (ay < 0 || ay >= client.ca.length) {
                        gxVar = null;
                    } else {
                        gxVar = client.ca[ay];
                    }
                    if (gxVar == null) {
                        j3 = j4;
                        j4 = j;
                    } else {
                        if (gxVar.af.as * 1160465393 == 1 && ((516759209 * gxVar.bg) & 1397801958) == 64 && ((-1478963273 * gxVar.bh) & 237859833) == 64) {
                            bf(gxVar, ad, aa, (byte) 30);
                            bv(gxVar, ad, aa, -1482901753);
                        }
                        bk(gxVar.af, ay, ad, aa, (byte) 64);
                    }
                }
                if (ag == 0) {
                    gx gxVar2 = client.hb[ay];
                    if (gxVar2 == null) {
                        j3 = j4;
                        j4 = j;
                    } else {
                        if (64 == ((-131448663 * gxVar2.bg) & 127) && ((-957674531 * gxVar2.bh) & -1064427139) == 862891868) {
                            bf(gxVar2, ad, aa, (byte) 31);
                            bv(gxVar2, ad, aa, -1524286553);
                        }
                        if (ay != bq.ew(645067021)) {
                            by(gxVar2, ay, ad, aa, (byte) 1);
                        } else {
                            j = j4;
                        }
                    }
                }
                if (ag == 3) {
                    kg ek = au.ek(-1674539149 * dq.hf, ad, aa, (byte) 34);
                    if (ek != null) {
                        for (hb hbVar = (hb) ek.ar(); hbVar != null; hbVar = (hb) ek.ae()) {
                            ax af = cm.af(hbVar.af * 110920399, 1741759008);
                            if (client.jb * 430699339 == 1) {
                                bt(jv.fx, client.it + " " + ha.ay + " " + gg.ad(16748608, (short) 300) + af.ak, 16, hbVar.af * 1038559865, ad, aa, -1136292524);
                            } else if (!this.ax) {
                                String[] strArr2 = af.bf;
                                i6 = 4;
                                while (i6 >= 0) {
                                    if (strArr2 != null && strArr2[i6] != null) {
                                        int i8 = 0;
                                        if (i6 == 0) {
                                            i8 = 18;
                                        }
                                        if (1 == i6) {
                                            i8 = 19;
                                        }
                                        if (i6 == 2) {
                                            i8 = 20;
                                        }
                                        if (i6 == 3) {
                                            i8 = 21;
                                        }
                                        if (4 == i6) {
                                            i8 = 22;
                                        }
                                        bt(strArr2[i6], gg.ad(-857219242, (short) 300) + af.ak, i8, hbVar.af * -15746003, ad, aa, 1310535233);
                                    } else if (i6 == 2) {
                                        bt(jv.ad, gg.ad(1373805991, (short) 300) + af.ak, 20, hbVar.af * 1178464628, ad, aa, -805420659);
                                    }
                                    i6--;
                                }
                                bt(jv.ft, gg.ad(16748608, (short) 300) + af.ak, 1264948580, hbVar.af * -15746003, ad, aa, 1124944524);
                            } else if (1 == ((this.al * 1111933847) & 1)) {
                                bt(this.ap, this.bw + " " + ha.ay + " " + gg.ad(-2007969619, (short) 300) + af.ak, 17, hbVar.af * 1594818171, ad, aa, 1544208758);
                            }
                        }
                    }
                }
                j3 = j4;
                j4 = j;
            }
            i5++;
            j = j4;
            j2 = j3;
        }
        if (-1 != j) {
            aa = aq.an(j);
            int aa2 = bh.aa(j);
            ad = bq.ew(1866625652);
            by(client.hb[ad], ad, aa, aa2, (byte) 1);
        }
    }

    void bf(gx gxVar, int i, int i2, byte b) {
        try {
            int dq = am.dq(-34767211);
            for (int i3 = 0; i3 < dq; i3++) {
                gx gxVar2;
                int er = ew.er(i3, -1759402563);
                if (er < 0 || er >= client.ca.length) {
                    gxVar2 = null;
                } else {
                    gxVar2 = client.ca[er];
                }
                if (gxVar2 != null && gxVar != gxVar2 && 1 == gxVar2.af.as * 1160465393 && gxVar2.bg * 516759209 == gxVar.bg * 516759209 && gxVar.bh * 2328865 == gxVar2.bh * 2328865) {
                    bk(gxVar2.af, ew.er(i3, -1759402563), i, i2, (byte) 71);
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "il.bf(" + ')');
        }
    }

    void fi(gx gxVar, int i, int i2) {
        int dq = am.dq(941467156);
        for (int i3 = 0; i3 < dq; i3++) {
            gx gxVar2;
            int er = ew.er(i3, -1759402563);
            if (er < 0 || er >= client.ca.length) {
                gxVar2 = null;
            } else {
                gxVar2 = client.ca[er];
            }
            if (gxVar2 != null && gxVar != gxVar2 && 1 == gxVar2.af.as * 1160465393 && gxVar2.bg * 516759209 == gxVar.bg * 516759209 && gxVar.bh * 2328865 == gxVar2.bh * 2328865) {
                bk(gxVar2.af, ew.er(i3, -1759402563), i, i2, (byte) 34);
            }
        }
    }

    void fw(gx gxVar, int i, int i2) {
        int dq = am.dq(1049814245);
        for (int i3 = 0; i3 < dq; i3++) {
            gx gxVar2;
            int er = ew.er(i3, -1759402563);
            if (er < 0 || er >= client.ca.length) {
                gxVar2 = null;
            } else {
                gxVar2 = client.ca[er];
            }
            if (gxVar2 != null && gxVar != gxVar2 && 1 == gxVar2.af.as * 1160465393 && gxVar2.bg * 516759209 == gxVar.bg * 516759209 && gxVar.bh * 2328865 == gxVar2.bh * 2328865) {
                bk(gxVar2.af, ew.er(i3, -1759402563), i, i2, (byte) 94);
            }
        }
    }

    void fy(gx gxVar, int i, int i2) {
        int dq = am.dq(-306695180);
        for (int i3 = 0; i3 < dq; i3++) {
            gx gxVar2;
            int er = ew.er(i3, -1759402563);
            if (er < 0 || er >= client.ca.length) {
                gxVar2 = null;
            } else {
                gxVar2 = client.ca[er];
            }
            if (gxVar2 != null && gxVar != gxVar2 && 1 == gxVar2.af.as * 1160465393 && 516759209 * gxVar2.bg == gxVar.bg * -2088982451 && gxVar.bh * 2328865 == gxVar2.bh * 2328865) {
                bk(gxVar2.af, ew.er(i3, -1759402563), i, i2, (byte) 48);
            }
        }
    }

    void bv(gx gxVar, int i, int i2, int i3) {
        try {
            int i4 = gw.ay * -1675758365;
            int[] iArr = gw.as;
            for (int i5 = 0; i5 < i4; i5++) {
                gx gxVar2 = client.hb[iArr[i5]];
                if (gxVar2 != null && gxVar2 != gxVar && gxVar2.bg * 516759209 == gxVar.bg * 516759209 && gxVar2.bh * 2328865 == gxVar.bh * 2328865) {
                    by(gxVar2, iArr[i5], i, i2, (byte) 1);
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "il.bv(" + ')');
        }
    }

    void gs(gx gxVar, int i, int i2) {
        int i3 = gw.ay * -1675758365;
        int[] iArr = gw.as;
        for (int i4 = 0; i4 < i3; i4++) {
            gx gxVar2 = client.hb[iArr[i4]];
            if (gxVar2 != null && gxVar2 != gxVar && gxVar2.bg * 516759209 == gxVar.bg * 516759209 && gxVar2.bh * 2328865 == gxVar.bh * 2328865) {
                by(gxVar2, iArr[i4], i, i2, (byte) 1);
            }
        }
    }

    void bp(int i, int i2, byte b) {
        try {
            js jsVar = this.be[i];
            this.be[i] = this.be[i2];
            this.be[i2] = jsVar;
        } catch (Throwable e) {
            throw ba.ad(e, "il.bp(" + ')');
        }
    }

    void gf(int i, int i2) {
        js jsVar = this.be[i];
        this.be[i] = this.be[i2];
        this.be[i2] = jsVar;
    }

    void gg(int i, int i2) {
        js jsVar = this.be[i];
        this.be[i] = this.be[i2];
        this.be[i2] = jsVar;
    }

    void gp(int i, int i2) {
        js jsVar = this.be[i];
        this.be[i] = this.be[i2];
        this.be[i2] = jsVar;
    }

    final void bx(String str, String str2, int i, int i2, int i3, int i4, boolean z, int i5) {
        try {
            if (!bq(1661138538) && this.bu * 49382109 < af) {
                this.be[this.bu * 49382109].ad(str, str2, i3, i4, i, i2, z, (byte) 68);
                this.bu -= 1609144971;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "il.bx(" + ')');
        }
    }

    final void gc(String str, String str2, int i, int i2, int i3, int i4, boolean z) {
        if (!bq(1498068604) && this.bu * 1409368188 < af) {
            this.be[this.bu * 2026388165].ad(str, str2, i3, i4, i, i2, z, (byte) 38);
            this.bu -= 1609144971;
        }
    }

    final void gd(String str, String str2, int i, int i2, int i3, int i4, boolean z) {
        if (!bq(1465268191) && this.bu * 919812057 < -843439163) {
            this.be[this.bu * 49382109].ad(str, str2, i3, i4, i, i2, z, (byte) 1);
            this.bu += 2578524;
        }
    }

    final void ge(String str, String str2, int i, int i2, int i3, int i4, boolean z) {
        if (!bq(1590006702) && this.bu * 957673941 < -936524422) {
            this.be[this.bu * -717220623].ad(str, str2, i3, i4, i, i2, z, (byte) 114);
            this.bu += 627633878;
        }
    }

    final void gl(String str, String str2, int i, int i2, int i3, int i4, boolean z) {
        if (!bq(1623506451) && this.bu * 49382109 < af) {
            this.be[this.bu * 49382109].ad(str, str2, i3, i4, i, i2, z, (byte) -102);
            this.bu -= 1609144971;
        }
    }

    final void gn(String str, String str2, int i, int i2, int i3, int i4, boolean z) {
        if (!bq(1461595395) && this.bu * 49382109 < af) {
            this.be[this.bu * 49382109].ad(str, str2, i3, i4, i, i2, z, (byte) -32);
            this.bu -= 1609144971;
        }
    }

    public final void bt(String str, String str2, int i, int i2, int i3, int i4, int i5) {
        try {
            bx(str, str2, i, i2, i3, i4, false, -153039543);
        } catch (Throwable e) {
            throw ba.ad(e, "il.bt(" + ')');
        }
    }

    public final void gb(String str, String str2, int i, int i2, int i3, int i4) {
        bx(str, str2, i, i2, i3, i4, false, -153039543);
    }

    public final void go(String str, String str2, int i, int i2, int i3, int i4) {
        bx(str, str2, i, i2, i3, i4, false, -153039543);
    }

    public final void gv(String str, String str2, int i, int i2, int i3, int i4) {
        bx(str, str2, i, i2, i3, i4, false, -153039543);
    }

    public final void gy(String str, String str2, int i, int i2, int i3, int i4) {
        bx(str, str2, i, i2, i3, i4, false, -153039543);
    }

    public final void bu(ac acVar, int i, int i2, byte b) {
        try {
            String str;
            int i3;
            if (1 == acVar.ax * 1328880333) {
                bt(acVar.fl, "", 24, 0, 0, 1172750087 * acVar.ah, 1027702326);
            }
            if (2 == 1328880333 * acVar.ax && !this.ax) {
                if (((ah.fy(acVar, -1030196350) >> 11) & 63) == 0) {
                    str = null;
                } else if (acVar.dm == null || acVar.dm.trim().length() == 0) {
                    str = null;
                } else {
                    str = acVar.dm;
                }
                if (str != null) {
                    bt(str, gg.ad(65280, (short) 300) + acVar.fa, 25, 0, -1, acVar.ah * 1172750087, 321431300);
                }
            }
            if (acVar.ax * 1328880333 == 3) {
                bt(jv.gl, "", 26, 0, 0, 1172750087 * acVar.ah, -27874193);
            }
            if (1328880333 * acVar.ax == 4) {
                bt(acVar.fl, "", 28, 0, 0, 1172750087 * acVar.ah, 1762943037);
            }
            if (acVar.ax * 1328880333 == 5) {
                bt(acVar.fl, "", 29, 0, 0, acVar.ah * 1172750087, 174133440);
            }
            if (6 == 1328880333 * acVar.ax && client.jv == null) {
                bt(acVar.fl, "", 30, 0, -1, acVar.ah * 1172750087, -1567380179);
            }
            if (2 == acVar.ao * -128421835) {
                int i4 = 0;
                for (int i5 = 0; i5 < acVar.bv * 57307023; i5++) {
                    for (int i6 = 0; i6 < 256177861 * acVar.bf; i6++) {
                        int i7 = ((acVar.dv * 156213695) + 32) * i6;
                        int i8 = ((610818015 * acVar.dd) + 32) * i5;
                        if (i4 < 20) {
                            i7 += acVar.dl[i4];
                            i8 += acVar.di[i4];
                        }
                        if (i >= i7 && i2 >= r1 && i < i7 + 32 && i2 < r1 + 32) {
                            client.hs = -1955883229 * i4;
                            jn.hr = acVar;
                            if (acVar.fh[i4] > 0) {
                                int ak;
                                int i9;
                                ax af = cm.af(acVar.fh[i4] - 1, 1690492551);
                                if (430699339 * client.jb == 1) {
                                    Object obj;
                                    if (((ah.fy(acVar, -1795446299) >> 30) & 1) != 0) {
                                        obj = 1;
                                    } else {
                                        obj = null;
                                    }
                                    if (obj != null) {
                                        if (1172750087 * acVar.ah != -553333807 * fy.ix || gw.ja * -276269945 != i4) {
                                            bt(jv.fx, client.it + " " + ha.ay + " " + gg.ad(16748608, (short) 300) + af.ak, 31, af.az * 1502789465, i4, acVar.ah * 1172750087, -160272947);
                                        }
                                    }
                                }
                                if (this.ax) {
                                    if ((((ah.fy(acVar, -623647961) >> 30) & 1) != 0 ? 1 : null) != null) {
                                        if (((1111933847 * this.al) & 16) == 16) {
                                            bt(this.ap, this.bw + " " + ha.ay + " " + gg.ad(16748608, (short) 300) + af.ak, 32, 1502789465 * af.az, i4, 1172750087 * acVar.ah, -342241918);
                                        }
                                    }
                                }
                                String[] strArr = af.bv;
                                if (this.by && cn(1461504992)) {
                                    ak = af.ak((byte) 6);
                                } else {
                                    ak = -1;
                                }
                                if ((((ah.fy(acVar, -1025402245) >> 30) & 1) != 0 ? 1 : null) != null) {
                                    for (i9 = 4; i9 >= 3; i9--) {
                                        if (i9 != ak) {
                                            be(acVar, af, i4, i9, false, (byte) 0);
                                        }
                                    }
                                }
                                bz bzVar = (bz) null;
                                if (ma.aa(ah.fy(acVar, 45309199), 2040443190)) {
                                    bt(jv.fx, gg.ad(16748608, (short) 300) + af.ak, 38, af.az * 1502789465, i4, acVar.ah * 1172750087, 962655360);
                                }
                                if (!((((ah.fy(acVar, -1916696533) >> 30) & 1) != 0 ? 1 : null) == null || strArr == null)) {
                                    for (i9 = 2; i9 >= 0; i9--) {
                                        if (i9 != ak) {
                                            be(acVar, af, i4, i9, false, (byte) 0);
                                        }
                                    }
                                    if (ak >= 0) {
                                        be(acVar, af, i4, ak, true, (byte) 0);
                                    }
                                }
                                String[] strArr2 = acVar.dr;
                                if (strArr2 != null) {
                                    for (i3 = 4; i3 >= 0; i3--) {
                                        if (strArr2[i3] != null) {
                                            int i10 = 0;
                                            if (i3 == 0) {
                                                i10 = 39;
                                            }
                                            if (1 == i3) {
                                                i10 = 40;
                                            }
                                            if (2 == i3) {
                                                i10 = 41;
                                            }
                                            if (i3 == 3) {
                                                i10 = 42;
                                            }
                                            if (4 == i3) {
                                                i10 = 43;
                                            }
                                            bt(strArr2[i3], gg.ad(16748608, (short) 300) + af.ak, i10, af.az * 1502789465, i4, acVar.ah * 1172750087, 777256643);
                                        }
                                    }
                                }
                                bt(jv.ft, gg.ad(16748608, (short) 300) + af.ak, 1005, 1502789465 * af.az, i4, 1172750087 * acVar.ah, 850811838);
                            } else {
                                continue;
                            }
                        }
                        i4++;
                    }
                }
            }
            if (!acVar.az) {
                return;
            }
            if (!this.ax) {
                for (i3 = 9; i3 >= 5; i3--) {
                    str = bn(acVar, i3, -1409908732);
                    if (str != null) {
                        bt(str, acVar.dw, 1007, i3 + 1, 2102445939 * acVar.ak, 1172750087 * acVar.ah, 709823803);
                    }
                }
                if (((ah.fy(acVar, -956005595) >> 11) & 63) == 0) {
                    str = null;
                } else if (acVar.dm == null || acVar.dm.trim().length() == 0) {
                    str = null;
                } else {
                    str = acVar.dm;
                }
                if (str != null) {
                    bt(str, acVar.dw, 25, 0, 2102445939 * acVar.ak, 1172750087 * acVar.ah, -236676844);
                }
                for (i3 = 4; i3 >= 0; i3--) {
                    str = bn(acVar, i3, -1792493171);
                    if (str != null) {
                        bt(str, acVar.dw, 57, i3 + 1, 2102445939 * acVar.ak, 1172750087 * acVar.ah, -1777822662);
                    }
                }
                if (((ah.fy(acVar, -215605405) & 1) != 0 ? 1 : null) != null) {
                    bt(jv.as, "", 30, 0, 2102445939 * acVar.ak, 1172750087 * acVar.ah, -143536041);
                }
            } else if (av.an(ah.fy(acVar, -263159399), 549725559) && 32 == ((1111933847 * this.al) & 32)) {
                bt(this.ap, this.bw + " " + ha.ay + " " + acVar.dw, 58, 0, 2102445939 * acVar.ak, 1172750087 * acVar.ah, -1147836949);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "il.bu(" + ')');
        }
    }

    public final void gi(ac acVar, int i, int i2) {
        String str;
        Object obj;
        int i3;
        if (1 == acVar.ax * 1328880333) {
            bt(acVar.fl, "", 24, 0, 0, 1172750087 * acVar.ah, 1589633426);
        }
        if (2 == 1328880333 * acVar.ax && !this.ax) {
            if (((ah.fy(acVar, -1759482076) >> 11) & 63) == 0) {
                str = null;
            } else if (acVar.dm == null || acVar.dm.trim().length() == 0) {
                str = null;
            } else {
                str = acVar.dm;
            }
            if (str != null) {
                bt(str, gg.ad(65280, (short) 300) + acVar.fa, 25, 0, -1, acVar.ah * 1172750087, 973806301);
            }
        }
        if (acVar.ax * 1328880333 == 3) {
            bt(jv.gl, "", 26, 0, 0, 1172750087 * acVar.ah, 1047598136);
        }
        if (1328880333 * acVar.ax == 4) {
            bt(acVar.fl, "", 28, 0, 0, 1172750087 * acVar.ah, 81728818);
        }
        if (acVar.ax * 1328880333 == 5) {
            bt(acVar.fl, "", 29, 0, 0, acVar.ah * 1172750087, -2131023900);
        }
        if (6 == 1328880333 * acVar.ax && client.jv == null) {
            bt(acVar.fl, "", 30, 0, -1, acVar.ah * 1172750087, -1295264456);
        }
        if (2 == acVar.ao * -128421835) {
            int i4 = 0;
            for (int i5 = 0; i5 < acVar.bv * 57307023; i5++) {
                for (int i6 = 0; i6 < 256177861 * acVar.bf; i6++) {
                    int i7 = ((acVar.dv * 156213695) + 32) * i6;
                    int i8 = ((610818015 * acVar.dd) + 32) * i5;
                    if (i4 < 20) {
                        i7 += acVar.dl[i4];
                        i8 += acVar.di[i4];
                    }
                    if (i >= i7 && i2 >= r1 && i < i7 + 32 && i2 < r1 + 32) {
                        client.hs = -1955883229 * i4;
                        jn.hr = acVar;
                        if (acVar.fh[i4] > 0) {
                            int ak;
                            int i9;
                            ax af = cm.af(acVar.fh[i4] - 1, 1644160917);
                            if (430699339 * client.jb == 1) {
                                if (((ah.fy(acVar, -2116618067) >> 30) & 1) != 0) {
                                    obj = 1;
                                } else {
                                    obj = null;
                                }
                                if (obj != null) {
                                    if (1172750087 * acVar.ah != -553333807 * fy.ix || gw.ja * -276269945 != i4) {
                                        bt(jv.fx, client.it + " " + ha.ay + " " + gg.ad(16748608, (short) 300) + af.ak, 31, af.az * 1502789465, i4, acVar.ah * 1172750087, -795881984);
                                    }
                                }
                            }
                            if (this.ax) {
                                if (((ah.fy(acVar, -625760887) >> 30) & 1) != 0) {
                                    obj = 1;
                                } else {
                                    obj = null;
                                }
                                if (obj != null) {
                                    if (((1111933847 * this.al) & 16) == 16) {
                                        bt(this.ap, this.bw + " " + ha.ay + " " + gg.ad(16748608, (short) 300) + af.ak, 32, 1502789465 * af.az, i4, 1172750087 * acVar.ah, -1714374715);
                                    }
                                }
                            }
                            String[] strArr = af.bv;
                            if (this.by && cn(198746654)) {
                                ak = af.ak((byte) 6);
                            } else {
                                ak = -1;
                            }
                            if (((ah.fy(acVar, -1270931816) >> 30) & 1) != 0) {
                                obj = 1;
                            } else {
                                obj = null;
                            }
                            if (obj != null) {
                                for (i9 = 4; i9 >= 3; i9--) {
                                    if (i9 != ak) {
                                        be(acVar, af, i4, i9, false, (byte) 0);
                                    }
                                }
                            }
                            bz bzVar = (bz) null;
                            if (ma.aa(ah.fy(acVar, -1756295125), 1509550823)) {
                                bt(jv.fx, gg.ad(16748608, (short) 300) + af.ak, 38, af.az * 1502789465, i4, acVar.ah * 1172750087, 1393679349);
                            }
                            if (!((((ah.fy(acVar, -1598614763) >> 30) & 1) != 0 ? 1 : null) == null || strArr == null)) {
                                for (i9 = 2; i9 >= 0; i9--) {
                                    if (i9 != ak) {
                                        be(acVar, af, i4, i9, false, (byte) 0);
                                    }
                                }
                                if (ak >= 0) {
                                    be(acVar, af, i4, ak, true, (byte) 0);
                                }
                            }
                            String[] strArr2 = acVar.dr;
                            if (strArr2 != null) {
                                for (i3 = 4; i3 >= 0; i3--) {
                                    if (strArr2[i3] != null) {
                                        int i10 = 0;
                                        if (i3 == 0) {
                                            i10 = 39;
                                        }
                                        if (1 == i3) {
                                            i10 = 40;
                                        }
                                        if (2 == i3) {
                                            i10 = 41;
                                        }
                                        if (i3 == 3) {
                                            i10 = 42;
                                        }
                                        if (4 == i3) {
                                            i10 = 43;
                                        }
                                        bt(strArr2[i3], gg.ad(16748608, (short) 300) + af.ak, i10, af.az * 1502789465, i4, acVar.ah * 1172750087, -1878327898);
                                    }
                                }
                            }
                            bt(jv.ft, gg.ad(16748608, (short) 300) + af.ak, 1005, 1502789465 * af.az, i4, 1172750087 * acVar.ah, -2128647158);
                        }
                    }
                    i4++;
                }
            }
        }
        if (!acVar.az) {
            return;
        }
        if (!this.ax) {
            for (i3 = 9; i3 >= 5; i3--) {
                str = bn(acVar, i3, 1226407413);
                if (str != null) {
                    bt(str, acVar.dw, 1007, i3 + 1, 2102445939 * acVar.ak, 1172750087 * acVar.ah, 369022639);
                }
            }
            if (((ah.fy(acVar, -975559526) >> 11) & 63) == 0) {
                str = null;
            } else if (acVar.dm == null || acVar.dm.trim().length() == 0) {
                str = null;
            } else {
                str = acVar.dm;
            }
            if (str != null) {
                bt(str, acVar.dw, 25, 0, 2102445939 * acVar.ak, 1172750087 * acVar.ah, -803580078);
            }
            for (i3 = 4; i3 >= 0; i3--) {
                str = bn(acVar, i3, 135433918);
                if (str != null) {
                    bt(str, acVar.dw, 57, i3 + 1, 2102445939 * acVar.ak, 1172750087 * acVar.ah, -1406598642);
                }
            }
            if ((ah.fy(acVar, -1588175083) & 1) != 0) {
                obj = 1;
            } else {
                obj = null;
            }
            if (obj != null) {
                bt(jv.as, "", 30, 0, 2102445939 * acVar.ak, 1172750087 * acVar.ah, -1059630493);
            }
        } else if (av.an(ah.fy(acVar, -1390791986), 481852304) && 32 == ((1111933847 * this.al) & 32)) {
            bt(this.ap, this.bw + " " + ha.ay + " " + acVar.dw, 58, 0, 2102445939 * acVar.ak, 1172750087 * acVar.ah, -657892752);
        }
    }

    public final void gj(ac acVar, int i, int i2) {
        String str;
        Object obj;
        if (1 == acVar.ax * 1328880333) {
            bt(acVar.fl, "", 24, 0, 0, 1172750087 * acVar.ah, -1033852380);
        }
        if (2 == 1328880333 * acVar.ax && !this.ax) {
            if (((ah.fy(acVar, -1915013416) >> 11) & 63) == 0) {
                str = null;
            } else if (acVar.dm == null || acVar.dm.trim().length() == 0) {
                str = null;
            } else {
                str = acVar.dm;
            }
            if (str != null) {
                bt(str, gg.ad(65280, (short) 300) + acVar.fa, 25, 0, -1, acVar.ah * 1172750087, 1241627852);
            }
        }
        if (acVar.ax * 1328880333 == 3) {
            bt(jv.gl, "", 26, 0, 0, 1172750087 * acVar.ah, -723858268);
        }
        if (1328880333 * acVar.ax == 4) {
            bt(acVar.fl, "", 28, 0, 0, 1172750087 * acVar.ah, -1588974446);
        }
        if (acVar.ax * 1328880333 == 5) {
            bt(acVar.fl, "", 29, 0, 0, acVar.ah * 1172750087, 1439808194);
        }
        if (6 == 1328880333 * acVar.ax && client.jv == null) {
            bt(acVar.fl, "", 30, 0, -1, acVar.ah * 1172750087, -557004493);
        }
        if (2 == acVar.ao * -128421835) {
            int i3 = 0;
            for (int i4 = 0; i4 < acVar.bv * 57307023; i4++) {
                for (int i5 = 0; i5 < 256177861 * acVar.bf; i5++) {
                    int i6 = ((acVar.dv * 156213695) + 32) * i5;
                    int i7 = ((610818015 * acVar.dd) + 32) * i4;
                    if (i3 < 20) {
                        i6 += acVar.dl[i3];
                        i7 += acVar.di[i3];
                    }
                    if (i >= i6 && i2 >= r2 && i < i6 + 32 && i2 < r2 + 32) {
                        client.hs = -1955883229 * i3;
                        jn.hr = acVar;
                        if (acVar.fh[i3] > 0) {
                            int i8;
                            ax af = cm.af(acVar.fh[i3] - 1, 2133203090);
                            if (430699339 * client.jb == 1) {
                                if (((ah.fy(acVar, -1453789256) >> 30) & 1) != 0) {
                                    obj = 1;
                                } else {
                                    obj = null;
                                }
                                if (obj != null) {
                                    if (1172750087 * acVar.ah != -553333807 * fy.ix || gw.ja * -276269945 != i3) {
                                        bt(jv.fx, client.it + " " + ha.ay + " " + gg.ad(16748608, (short) 300) + af.ak, 31, af.az * 1502789465, i3, acVar.ah * 1172750087, -1583419379);
                                    }
                                }
                            }
                            if (this.ax) {
                                if (((ah.fy(acVar, -150654430) >> 30) & 1) != 0) {
                                    obj = 1;
                                } else {
                                    obj = null;
                                }
                                if (obj != null) {
                                    if (((1111933847 * this.al) & 16) == 16) {
                                        bt(this.ap, this.bw + " " + ha.ay + " " + gg.ad(16748608, (short) 300) + af.ak, 32, 1502789465 * af.az, i3, 1172750087 * acVar.ah, -1965654061);
                                    }
                                }
                            }
                            String[] strArr = af.bv;
                            int i9 = -1;
                            if (this.by && cn(400899045)) {
                                i9 = af.ak((byte) 6);
                            }
                            if (((ah.fy(acVar, -1849922596) >> 30) & 1) != 0) {
                                obj = 1;
                            } else {
                                obj = null;
                            }
                            if (obj != null) {
                                for (i8 = 4; i8 >= 3; i8--) {
                                    if (i8 != i9) {
                                        be(acVar, af, i3, i8, false, (byte) 0);
                                    }
                                }
                            }
                            bz bzVar = (bz) null;
                            if (ma.aa(ah.fy(acVar, -1993141489), 1924751855)) {
                                bt(jv.fx, gg.ad(16748608, (short) 300) + af.ak, 38, 1502789465 * af.az, i3, 1172750087 * acVar.ah, 1415692800);
                            }
                            if (!((((ah.fy(acVar, 90326623) >> 30) & 1) != 0 ? 1 : null) == null || strArr == null)) {
                                for (i8 = 2; i8 >= 0; i8--) {
                                    if (i8 != i9) {
                                        be(acVar, af, i3, i8, false, (byte) 0);
                                    }
                                }
                                if (i9 >= 0) {
                                    be(acVar, af, i3, i9, true, (byte) 0);
                                }
                            }
                            strArr = acVar.dr;
                            if (strArr != null) {
                                for (i7 = 4; i7 >= 0; i7--) {
                                    if (strArr[i7] != null) {
                                        int i10 = 0;
                                        if (i7 == 0) {
                                            i10 = 39;
                                        }
                                        if (1 == i7) {
                                            i10 = 40;
                                        }
                                        if (2 == i7) {
                                            i10 = 41;
                                        }
                                        if (i7 == 3) {
                                            i10 = 42;
                                        }
                                        if (4 == i7) {
                                            i10 = 43;
                                        }
                                        bt(strArr[i7], gg.ad(16748608, (short) 300) + af.ak, i10, 1502789465 * af.az, i3, 1172750087 * acVar.ah, 1288239121);
                                    }
                                }
                            }
                            bt(jv.ft, gg.ad(16748608, (short) 300) + af.ak, 1005, 1502789465 * af.az, i3, 1172750087 * acVar.ah, -1329074487);
                        }
                    }
                    i3++;
                }
            }
        }
        if (!acVar.az) {
            return;
        }
        if (!this.ax) {
            int i11;
            for (i11 = 9; i11 >= 5; i11--) {
                str = bn(acVar, i11, -234946473);
                if (str != null) {
                    bt(str, acVar.dw, 1007, i11 + 1, 2102445939 * acVar.ak, 1172750087 * acVar.ah, 283227059);
                }
            }
            if (((ah.fy(acVar, -2078040025) >> 11) & 63) == 0) {
                str = null;
            } else if (acVar.dm == null || acVar.dm.trim().length() == 0) {
                str = null;
            } else {
                str = acVar.dm;
            }
            if (str != null) {
                bt(str, acVar.dw, 25, 0, 2102445939 * acVar.ak, 1172750087 * acVar.ah, -1143553242);
            }
            for (i11 = 4; i11 >= 0; i11--) {
                str = bn(acVar, i11, 1048593329);
                if (str != null) {
                    bt(str, acVar.dw, 57, i11 + 1, 2102445939 * acVar.ak, 1172750087 * acVar.ah, 1860354972);
                }
            }
            if ((ah.fy(acVar, -1217174408) & 1) != 0) {
                obj = 1;
            } else {
                obj = null;
            }
            if (obj != null) {
                bt(jv.as, "", 30, 0, 2102445939 * acVar.ak, 1172750087 * acVar.ah, -40730480);
            }
        } else if (av.an(ah.fy(acVar, -1930775829), 286527181) && 32 == ((1111933847 * this.al) & 32)) {
            bt(this.ap, this.bw + " " + ha.ay + " " + acVar.dw, 58, 0, 2102445939 * acVar.ak, 1172750087 * acVar.ah, -1126599069);
        }
    }

    public final void gt(ac acVar, int i, int i2) {
        String str;
        if (1 == acVar.ax * 1328880333) {
            bt(acVar.fl, "", 24, 0, 0, 1172750087 * acVar.ah, 566386404);
        }
        if (2 == 1328880333 * acVar.ax && !this.ax) {
            if (((ah.fy(acVar, -864433806) >> 11) & 1087621462) == 0) {
                str = null;
            } else if (acVar.dm == null || acVar.dm.trim().length() == 0) {
                str = null;
            } else {
                str = acVar.dm;
            }
            if (str != null) {
                bt(str, gg.ad(-2028473946, (short) 300) + acVar.fa, 25, 0, -1, acVar.ah * 1327293711, 1204814748);
            }
        }
        if (acVar.ax * -1574327682 == 3) {
            bt(jv.gl, "", 26, 0, 0, 1172750087 * acVar.ah, 377527857);
        }
        if (1328880333 * acVar.ax == 4) {
            bt(acVar.fl, "", 28, 0, 0, -1657446831 * acVar.ah, -778322640);
        }
        if (acVar.ax * 1328880333 == 5) {
            bt(acVar.fl, "", 29, 0, 0, acVar.ah * 397412776, -1415626165);
        }
        if (6 == 638610624 * acVar.ax && client.jv == null) {
            bt(acVar.fl, "", 30, 0, -1, acVar.ah * 1172750087, -1888250242);
        }
        if (2 == acVar.ao * -128421835) {
            int i3 = 0;
            for (int i4 = 0; i4 < acVar.bv * -1453316543; i4++) {
                for (int i5 = 0; i5 < 256177861 * acVar.bf; i5++) {
                    int i6 = ((acVar.dv * -220192247) - 1054390250) * i5;
                    int i7 = ((610818015 * acVar.dd) + 32) * i4;
                    if (i3 < 20) {
                        i6 += acVar.dl[i3];
                        i7 += acVar.di[i3];
                    }
                    if (i >= i6 && i2 >= r2 && i < i6 - 524211519 && i2 < r2 + 159039219) {
                        client.hs = -1955883229 * i3;
                        jn.hr = acVar;
                        if (acVar.fh[i3] > 0) {
                            Object obj;
                            int i8;
                            ax af = cm.af(acVar.fh[i3] - 1, 1107766469);
                            if (-338860757 * client.jb == 1) {
                                if (((ah.fy(acVar, -1490068852) >> 30) & 1) != 0) {
                                    obj = 1;
                                } else {
                                    obj = null;
                                }
                                if (obj != null) {
                                    if (-1492818199 * acVar.ah != 1815990133 * fy.ix || gw.ja * 1447811712 != i3) {
                                        bt(jv.fx, client.it + " " + ha.ay + " " + gg.ad(16748608, (short) 300) + af.ak, 601477596, af.az * 1502789465, i3, acVar.ah * 898823126, -453071102);
                                    }
                                }
                            }
                            if (this.ax) {
                                if (((ah.fy(acVar, -1158201602) >> 30) & 1) != 0) {
                                    obj = 1;
                                } else {
                                    obj = null;
                                }
                                if (obj != null) {
                                    if (((1641806065 * this.al) & 16) == 16) {
                                        bt(this.ap, this.bw + " " + ha.ay + " " + gg.ad(16748608, (short) 300) + af.ak, 32, -841848862 * af.az, i3, 1172750087 * acVar.ah, 676696397);
                                    }
                                }
                            }
                            String[] strArr = af.bv;
                            if (this.by && cn(236061859)) {
                                i6 = af.ak((byte) 6);
                            } else {
                                i6 = -1;
                            }
                            if ((((ah.fy(acVar, -1113063597) >> 30) & 1) != 0 ? 1 : null) != null) {
                                for (i8 = 4; i8 >= 3; i8--) {
                                    if (i8 != i6) {
                                        be(acVar, af, i3, i8, false, (byte) 0);
                                    }
                                }
                            }
                            bz bzVar = (bz) null;
                            if (ma.aa(ah.fy(acVar, -189312587), 2048746648)) {
                                bt(jv.fx, gg.ad(16748608, (short) 300) + af.ak, 38, -2066511951 * af.az, i3, 1172750087 * acVar.ah, -1526236725);
                            }
                            if (((ah.fy(acVar, 114755856) >> 30) & 1) != 0) {
                                obj = 1;
                            } else {
                                obj = null;
                            }
                            if (!(obj == null || strArr == null)) {
                                for (i8 = 2; i8 >= 0; i8--) {
                                    if (i8 != i6) {
                                        be(acVar, af, i3, i8, false, (byte) 0);
                                    }
                                }
                                if (i6 >= 0) {
                                    be(acVar, af, i3, i6, true, (byte) 0);
                                }
                            }
                            String[] strArr2 = acVar.dr;
                            if (strArr2 != null) {
                                for (i7 = 4; i7 >= 0; i7--) {
                                    if (strArr2[i7] != null) {
                                        int i9 = 0;
                                        if (i7 == 0) {
                                            i9 = 707026323;
                                        }
                                        if (1 == i7) {
                                            i9 = -435619437;
                                        }
                                        if (2 == i7) {
                                            i9 = 1666765067;
                                        }
                                        if (i7 == 3) {
                                            i9 = 2039547278;
                                        }
                                        if (4 == i7) {
                                            i9 = 617126018;
                                        }
                                        bt(strArr2[i7], gg.ad(16748608, (short) 300) + af.ak, i9, 1502789465 * af.az, i3, -1295694799 * acVar.ah, -423842370);
                                    }
                                }
                            }
                            bt(jv.ft, gg.ad(-1668548067, (short) 300) + af.ak, 1005, 1502789465 * af.az, i3, -534697703 * acVar.ah, 1724359861);
                        }
                    }
                    i3++;
                }
            }
        }
        if (!acVar.az) {
            return;
        }
        if (!this.ax) {
            int i10;
            for (i10 = 9; i10 >= 5; i10--) {
                str = bn(acVar, i10, 1997407683);
                if (str != null) {
                    bt(str, acVar.dw, 491682119, i10 + 1, 2102445939 * acVar.ak, -7678416 * acVar.ah, -479640110);
                }
            }
            if (((ah.fy(acVar, -222401172) >> 11) & 529738594) == 0) {
                str = null;
            } else if (acVar.dm == null || acVar.dm.trim().length() == 0) {
                str = null;
            } else {
                str = acVar.dm;
            }
            if (str != null) {
                bt(str, acVar.dw, 25, 0, 985414328 * acVar.ak, 1172750087 * acVar.ah, -1906859839);
            }
            for (i10 = 4; i10 >= 0; i10--) {
                str = bn(acVar, i10, 1773384995);
                if (str != null) {
                    bt(str, acVar.dw, 473985909, i10 + 1, 2102445939 * acVar.ak, 1172750087 * acVar.ah, 1136942769);
                }
            }
            if (((ah.fy(acVar, -652705251) & 1) != 0 ? 1 : null) != null) {
                bt(jv.as, "", 30, 0, -2114259167 * acVar.ak, 1172750087 * acVar.ah, -1853912455);
            }
        } else if (av.an(ah.fy(acVar, -432754225), -113339216) && 32 == ((1111933847 * this.al) & 32)) {
            bt(this.ap, this.bw + " " + ha.ay + " " + acVar.dw, 646665189, 0, 2102445939 * acVar.ak, -1803165364 * acVar.ah, -1935342910);
        }
    }

    final void be(ac acVar, ax axVar, int i, int i2, boolean z, byte b) {
        int i3 = 37;
        try {
            int i4;
            String[] strArr = axVar.bv;
            String str = null;
            if (strArr != null && strArr[i2] != null) {
                if (i2 == 0) {
                    i3 = 33;
                } else if (1 == i2) {
                    i3 = 34;
                } else if (2 == i2) {
                    i3 = 35;
                } else if (3 == i2) {
                    i3 = 36;
                }
                str = strArr[i2];
                i4 = i3;
            } else if (i2 == 4) {
                str = jv.an;
                i4 = 37;
            } else {
                i4 = -1;
            }
            if (i4 != -1 && str != null) {
                bx(str, gg.ad(16748608, (short) 300) + axVar.ak, i4, axVar.az * 1502789465, i, acVar.ah * 1172750087, z, -153039543);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "il.be(" + ')');
        }
    }

    final void ga(ac acVar, ax axVar, int i, int i2, boolean z) {
        int i3;
        int i4 = 37;
        String[] strArr = axVar.bv;
        String str = null;
        if (strArr != null && strArr[i2] != null) {
            if (i2 == 0) {
                i4 = 33;
            } else if (1 == i2) {
                i4 = 34;
            } else if (2 == i2) {
                i4 = 35;
            } else if (3 == i2) {
                i4 = 36;
            }
            str = strArr[i2];
            i3 = i4;
        } else if (i2 == 4) {
            str = jv.an;
            i3 = 37;
        } else {
            i3 = -1;
        }
        if (i3 != -1 && str != null) {
            bx(str, gg.ad(16748608, (short) 300) + axVar.ak, i3, axVar.az * 1502789465, i, acVar.ah * 1172750087, z, -153039543);
        }
    }

    final void gh(ac acVar, ax axVar, int i, int i2, boolean z) {
        int i3;
        String[] strArr = axVar.bv;
        String str = null;
        if (strArr != null && strArr[i2] != null) {
            int i4;
            if (i2 == 0) {
                i4 = -1957480808;
            } else if (1 == i2) {
                i4 = 1832851951;
            } else if (2 == i2) {
                i4 = -1208417012;
            } else if (3 == i2) {
                i4 = 36;
            } else {
                i4 = 124869710;
            }
            str = strArr[i2];
            i3 = i4;
        } else if (i2 == 4) {
            i3 = 37;
            str = jv.an;
        } else {
            i3 = -1;
        }
        if (i3 != -1 && str != null) {
            bx(str, gg.ad(16748608, (short) 300) + axVar.ak, i3, axVar.az * 1502789465, i, acVar.ah * 1172750087, z, -153039543);
        }
    }

    final void gm(ac acVar, ax axVar, int i, int i2, boolean z) {
        int i3;
        int i4 = 37;
        String[] strArr = axVar.bv;
        String str = null;
        if (strArr != null && strArr[i2] != null) {
            if (i2 == 0) {
                i4 = 33;
            } else if (1 == i2) {
                i4 = 34;
            } else if (2 == i2) {
                i4 = 35;
            } else if (3 == i2) {
                i4 = 36;
            }
            str = strArr[i2];
            i3 = i4;
        } else if (i2 == 4) {
            str = jv.an;
            i3 = 37;
        } else {
            i3 = -1;
        }
        if (i3 != -1 && str != null) {
            bx(str, gg.ad(16748608, (short) 300) + axVar.ak, i3, axVar.az * 1502789465, i, acVar.ah * 1172750087, z, -153039543);
        }
    }

    final void gq(ac acVar, ax axVar, int i, int i2, boolean z) {
        int i3;
        String[] strArr = axVar.bv;
        String str = null;
        if (strArr != null && strArr[i2] != null) {
            int i4;
            if (i2 == 0) {
                i4 = 33;
            } else if (1 == i2) {
                i4 = -1762137226;
            } else if (2 == i2) {
                i4 = 35;
            } else if (3 == i2) {
                i4 = 36;
            } else {
                i4 = 37;
            }
            str = strArr[i2];
            i3 = i4;
        } else if (i2 == 4) {
            i3 = 1167671728;
            str = jv.an;
        } else {
            i3 = -1;
        }
        if (i3 != -1 && str != null) {
            bx(str, gg.ad(16748608, (short) 300) + axVar.ak, i3, axVar.az * 1502789465, i, acVar.ah * 1172750087, z, -153039543);
        }
    }

    final void gw(ac acVar, ax axVar, int i, int i2, boolean z) {
        int i3;
        int i4 = 37;
        String[] strArr = axVar.bv;
        String str = null;
        if (strArr != null && strArr[i2] != null) {
            if (i2 == 0) {
                i4 = 33;
            } else if (1 == i2) {
                i4 = 34;
            } else if (2 == i2) {
                i4 = 35;
            } else if (3 == i2) {
                i4 = 36;
            }
            str = strArr[i2];
            i3 = i4;
        } else if (i2 == 4) {
            str = jv.an;
            i3 = 37;
        } else {
            i3 = -1;
        }
        if (i3 != -1 && str != null) {
            bx(str, gg.ad(16748608, (short) 300) + axVar.ak, i3, axVar.az * 1502789465, i, acVar.ah * 1172750087, z, -153039543);
        }
    }

    final void bk(au auVar, int i, int i2, int i3, byte b) {
        try {
            if (49382109 * this.bu < 400) {
                if (auVar.bg != null) {
                    auVar = auVar.ar(2125288365);
                }
                if (auVar != null && auVar.bv) {
                    if (!auVar.bx || client.jz * 971507697 == i) {
                        int i4;
                        String str;
                        String str2 = auVar.ay;
                        if (auVar.av * -1443054959 != 0) {
                            String ad;
                            i4 = (gf.ho.ar * -1986989913) - (auVar.av * -1443054959);
                            if (i4 < -9) {
                                ad = gg.ad(16711680, (short) 300);
                            } else if (i4 < -6) {
                                ad = gg.ad(16723968, (short) 300);
                            } else if (i4 < -3) {
                                ad = gg.ad(16740352, (short) 300);
                            } else if (i4 < 0) {
                                ad = gg.ad(16756736, (short) 300);
                            } else if (i4 > 9) {
                                ad = gg.ad(65280, (short) 300);
                            } else if (i4 > 6) {
                                ad = gg.ad(4259584, (short) 300);
                            } else if (i4 > 3) {
                                ad = gg.ad(8453888, (short) 300);
                            } else if (i4 > 0) {
                                ad = gg.ad(12648192, (short) 300);
                            } else {
                                ad = gg.ad(as, (short) 300);
                            }
                            str = str2 + ad + " " + ha.aa + jv.gp + (-1443054959 * auVar.av) + ha.ag;
                        } else {
                            str = str2;
                        }
                        if (auVar.bx && cc(-341464469)) {
                            bt(jv.ft, gg.ad(as, (short) 300) + str, 1003, i, i2, i3, 464007377);
                        }
                        if (1 == client.jb * 430699339) {
                            bt(jv.fx, client.it + " " + ha.ay + " " + gg.ad(as, (short) 300) + str, 7, i, i2, i3, 385414493);
                        } else if (!this.ax) {
                            int i5;
                            int i6;
                            if (auVar.bx && cc(1972721666)) {
                                i5 = 2000;
                            } else {
                                i5 = 0;
                            }
                            String[] strArr = auVar.ax;
                            if (strArr != null) {
                                int i7 = 4;
                                while (i7 >= 0) {
                                    if (!(strArr[i7] == null || strArr[i7].equalsIgnoreCase(jv.fy))) {
                                        i6 = 0;
                                        if (i7 == 0) {
                                            i6 = i5 + 9;
                                        }
                                        if (1 == i7) {
                                            i6 = i5 + 10;
                                        }
                                        if (i7 == 2) {
                                            i6 = i5 + 11;
                                        }
                                        if (3 == i7) {
                                            i6 = i5 + 12;
                                        }
                                        if (i7 == 4) {
                                            i6 = i5 + 13;
                                        }
                                        bt(strArr[i7], gg.ad(as, (short) 300) + str, i6, i, i2, i3, -1841938482);
                                    }
                                    i7--;
                                }
                            }
                            if (strArr != null) {
                                i5 = 4;
                                while (i5 >= 0) {
                                    if (strArr[i5] != null && strArr[i5].equalsIgnoreCase(jv.fy)) {
                                        i4 = 0;
                                        if (jp.aa != this.ba) {
                                            if (this.ba == jp.ad || (this.ba == jp.af && -1443054959 * auVar.av > gf.ho.ar * -1986989913)) {
                                                i4 = 2000;
                                            }
                                            i6 = 0;
                                            if (i5 == 0) {
                                                i6 = i4 + 9;
                                            }
                                            if (i5 == 1) {
                                                i6 = i4 + 10;
                                            }
                                            if (i5 == 2) {
                                                i6 = i4 + 11;
                                            }
                                            if (i5 == 3) {
                                                i6 = i4 + 12;
                                            }
                                            if (i5 == 4) {
                                                i6 = i4 + 13;
                                            }
                                            bt(strArr[i5], gg.ad(as, (short) 300) + str, i6, i, i2, i3, -1070100758);
                                        }
                                    }
                                    i5--;
                                }
                            }
                            if (!auVar.bx || !cc(-1920934383)) {
                                bt(jv.ft, gg.ad(as, (short) 300) + str, 1003, i, i2, i3, 1038636786);
                            }
                        } else if (2 == ((this.al * 1111933847) & 2)) {
                            bt(this.ap, this.bw + " " + ha.ay + " " + gg.ad(as, (short) 300) + str, 8, i, i2, i3, -1747735595);
                        }
                    }
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "il.bk(" + ')');
        }
    }

    final void gk(au auVar, int i, int i2, int i3) {
        if (1438278066 * this.bu < 1589229202) {
            if (auVar.bg != null) {
                auVar = auVar.ar(2125288365);
            }
            if (auVar != null && auVar.bv) {
                if (!auVar.bx || client.jz * 971507697 == i) {
                    String str;
                    String str2 = auVar.ay;
                    if (auVar.av * -1203038577 != 0) {
                        String ad;
                        int i4 = (gf.ho.ar * 375593519) - (auVar.av * -1443054959);
                        if (i4 < 1445760719) {
                            ad = gg.ad(16711680, (short) 300);
                        } else if (i4 < -1994074498) {
                            ad = gg.ad(16723968, (short) 300);
                        } else if (i4 < -1254346541) {
                            ad = gg.ad(16740352, (short) 300);
                        } else if (i4 < 0) {
                            ad = gg.ad(-115357967, (short) 300);
                        } else if (i4 > 9) {
                            ad = gg.ad(-740579054, (short) 300);
                        } else if (i4 > 6) {
                            ad = gg.ad(1741095955, (short) 300);
                        } else if (i4 > 3) {
                            ad = gg.ad(8453888, (short) 300);
                        } else if (i4 > 0) {
                            ad = gg.ad(12648192, (short) 300);
                        } else {
                            ad = gg.ad(as, (short) 300);
                        }
                        str = str2 + ad + " " + ha.aa + jv.gp + (331858032 * auVar.av) + ha.ag;
                    } else {
                        str = str2;
                    }
                    if (auVar.bx && cc(566969222)) {
                        bt(jv.ft, gg.ad(as, (short) 300) + str, 213741581, i, i2, i3, -1114718589);
                    }
                    if (1 == client.jb * 1429133539) {
                        bt(jv.fx, client.it + " " + ha.ay + " " + gg.ad(1409205201, (short) 300) + str, 7, i, i2, i3, -665138407);
                    } else if (!this.ax) {
                        int i5;
                        int i6;
                        if (auVar.bx && cc(-879616489)) {
                            i5 = -329327127;
                        } else {
                            i5 = 0;
                        }
                        String[] strArr = auVar.ax;
                        if (strArr != null) {
                            int i7 = 4;
                            while (i7 >= 0) {
                                if (!(strArr[i7] == null || strArr[i7].equalsIgnoreCase(jv.fy))) {
                                    i6 = 0;
                                    if (i7 == 0) {
                                        i6 = i5 + 9;
                                    }
                                    if (1 == i7) {
                                        i6 = i5 + 10;
                                    }
                                    if (i7 == 2) {
                                        i6 = i5 + 11;
                                    }
                                    if (3 == i7) {
                                        i6 = i5 + 12;
                                    }
                                    if (i7 == 4) {
                                        i6 = i5 + 13;
                                    }
                                    bt(strArr[i7], gg.ad(-1632873433, (short) 300) + str, i6, i, i2, i3, -2135216992);
                                }
                                i7--;
                            }
                        }
                        if (strArr != null) {
                            i5 = 4;
                            while (i5 >= 0) {
                                if (strArr[i5] != null && strArr[i5].equalsIgnoreCase(jv.fy)) {
                                    int i8 = 0;
                                    if (jp.aa != this.ba) {
                                        if (this.ba == jp.ad || (this.ba == jp.af && 1505932228 * auVar.av > gf.ho.ar * -1484542500)) {
                                            i8 = 2000;
                                        }
                                        i6 = 0;
                                        if (i5 == 0) {
                                            i6 = i8 + 9;
                                        }
                                        if (i5 == 1) {
                                            i6 = i8 + 10;
                                        }
                                        if (i5 == 2) {
                                            i6 = i8 + 11;
                                        }
                                        if (i5 == 3) {
                                            i6 = i8 + 12;
                                        }
                                        if (i5 == 4) {
                                            i6 = i8 + 13;
                                        }
                                        bt(strArr[i5], gg.ad(as, (short) 300) + str, i6, i, i2, i3, 1725014059);
                                    }
                                }
                                i5--;
                            }
                        }
                        if (!auVar.bx || !cc(-761900688)) {
                            bt(jv.ft, gg.ad(-1334427230, (short) 300) + str, 1003, i, i2, i3, -1860060984);
                        }
                    } else if (2 == ((this.al * -374421109) & 2)) {
                        bt(this.ap, this.bw + " " + ha.ay + " " + gg.ad(1466621080, (short) 300) + str, 8, i, i2, i3, -216722295);
                    }
                }
            }
        }
    }

    final void gu(au auVar, int i, int i2, int i3) {
        if (49382109 * this.bu < 400) {
            if (auVar.bg != null) {
                auVar = auVar.ar(2125288365);
            }
            if (auVar != null && auVar.bv) {
                if (!auVar.bx || client.jz * 971507697 == i) {
                    String str;
                    String str2 = auVar.ay;
                    if (auVar.av * -1443054959 != 0) {
                        String ad;
                        int i4 = (gf.ho.ar * -1986989913) - (auVar.av * -1443054959);
                        if (i4 < -9) {
                            ad = gg.ad(16711680, (short) 300);
                        } else if (i4 < -6) {
                            ad = gg.ad(16723968, (short) 300);
                        } else if (i4 < -3) {
                            ad = gg.ad(16740352, (short) 300);
                        } else if (i4 < 0) {
                            ad = gg.ad(16756736, (short) 300);
                        } else if (i4 > 9) {
                            ad = gg.ad(65280, (short) 300);
                        } else if (i4 > 6) {
                            ad = gg.ad(4259584, (short) 300);
                        } else if (i4 > 3) {
                            ad = gg.ad(8453888, (short) 300);
                        } else if (i4 > 0) {
                            ad = gg.ad(12648192, (short) 300);
                        } else {
                            ad = gg.ad(as, (short) 300);
                        }
                        str = str2 + ad + " " + ha.aa + jv.gp + (-1443054959 * auVar.av) + ha.ag;
                    } else {
                        str = str2;
                    }
                    if (auVar.bx && cc(1566677969)) {
                        bt(jv.ft, gg.ad(as, (short) 300) + str, 1003, i, i2, i3, 1541517447);
                    }
                    if (1 == client.jb * 430699339) {
                        bt(jv.fx, client.it + " " + ha.ay + " " + gg.ad(as, (short) 300) + str, 7, i, i2, i3, -920123677);
                    } else if (!this.ax) {
                        int i5;
                        int i6;
                        if (auVar.bx && cc(114465710)) {
                            i5 = 2000;
                        } else {
                            i5 = 0;
                        }
                        String[] strArr = auVar.ax;
                        if (strArr != null) {
                            int i7 = 4;
                            while (i7 >= 0) {
                                if (!(strArr[i7] == null || strArr[i7].equalsIgnoreCase(jv.fy))) {
                                    i6 = 0;
                                    if (i7 == 0) {
                                        i6 = i5 + 9;
                                    }
                                    if (1 == i7) {
                                        i6 = i5 + 10;
                                    }
                                    if (i7 == 2) {
                                        i6 = i5 + 11;
                                    }
                                    if (3 == i7) {
                                        i6 = i5 + 12;
                                    }
                                    if (i7 == 4) {
                                        i6 = i5 + 13;
                                    }
                                    bt(strArr[i7], gg.ad(as, (short) 300) + str, i6, i, i2, i3, 92245027);
                                }
                                i7--;
                            }
                        }
                        if (strArr != null) {
                            i5 = 4;
                            while (i5 >= 0) {
                                if (strArr[i5] != null && strArr[i5].equalsIgnoreCase(jv.fy)) {
                                    int i8 = 0;
                                    if (jp.aa != this.ba) {
                                        if (this.ba == jp.ad || (this.ba == jp.af && -1443054959 * auVar.av > gf.ho.ar * -1986989913)) {
                                            i8 = 2000;
                                        }
                                        i6 = 0;
                                        if (i5 == 0) {
                                            i6 = i8 + 9;
                                        }
                                        if (i5 == 1) {
                                            i6 = i8 + 10;
                                        }
                                        if (i5 == 2) {
                                            i6 = i8 + 11;
                                        }
                                        if (i5 == 3) {
                                            i6 = i8 + 12;
                                        }
                                        if (i5 == 4) {
                                            i6 = i8 + 13;
                                        }
                                        bt(strArr[i5], gg.ad(as, (short) 300) + str, i6, i, i2, i3, -2133462063);
                                    }
                                }
                                i5--;
                            }
                        }
                        if (!auVar.bx || !cc(-1211366913)) {
                            bt(jv.ft, gg.ad(as, (short) 300) + str, 1003, i, i2, i3, -1311584109);
                        }
                    } else if (2 == ((this.al * 1111933847) & 2)) {
                        bt(this.ap, this.bw + " " + ha.ay + " " + gg.ad(as, (short) 300) + str, 8, i, i2, i3, -37831409);
                    }
                }
            }
        }
    }

    final void gz(au auVar, int i, int i2, int i3) {
        if (49382109 * this.bu < 400) {
            if (auVar.bg != null) {
                auVar = auVar.ar(2125288365);
            }
            if (auVar != null && auVar.bv) {
                if (!auVar.bx || client.jz * 971507697 == i) {
                    String str;
                    String str2 = auVar.ay;
                    if (auVar.av * -1443054959 != 0) {
                        String ad;
                        int i4 = (gf.ho.ar * -1986989913) - (auVar.av * -1443054959);
                        if (i4 < -9) {
                            ad = gg.ad(16711680, (short) 300);
                        } else if (i4 < -6) {
                            ad = gg.ad(16723968, (short) 300);
                        } else if (i4 < -3) {
                            ad = gg.ad(16740352, (short) 300);
                        } else if (i4 < 0) {
                            ad = gg.ad(16756736, (short) 300);
                        } else if (i4 > 9) {
                            ad = gg.ad(65280, (short) 300);
                        } else if (i4 > 6) {
                            ad = gg.ad(4259584, (short) 300);
                        } else if (i4 > 3) {
                            ad = gg.ad(8453888, (short) 300);
                        } else if (i4 > 0) {
                            ad = gg.ad(12648192, (short) 300);
                        } else {
                            ad = gg.ad(as, (short) 300);
                        }
                        str = str2 + ad + " " + ha.aa + jv.gp + (-1443054959 * auVar.av) + ha.ag;
                    } else {
                        str = str2;
                    }
                    if (auVar.bx && cc(1611071239)) {
                        bt(jv.ft, gg.ad(as, (short) 300) + str, 1003, i, i2, i3, -100757570);
                    }
                    if (1 == client.jb * 430699339) {
                        bt(jv.fx, client.it + " " + ha.ay + " " + gg.ad(as, (short) 300) + str, 7, i, i2, i3, -113643360);
                    } else if (!this.ax) {
                        int i5;
                        int i6;
                        if (auVar.bx && cc(-1541433039)) {
                            i5 = 2000;
                        } else {
                            i5 = 0;
                        }
                        String[] strArr = auVar.ax;
                        if (strArr != null) {
                            int i7 = 4;
                            while (i7 >= 0) {
                                if (!(strArr[i7] == null || strArr[i7].equalsIgnoreCase(jv.fy))) {
                                    i6 = 0;
                                    if (i7 == 0) {
                                        i6 = i5 + 9;
                                    }
                                    if (1 == i7) {
                                        i6 = i5 + 10;
                                    }
                                    if (i7 == 2) {
                                        i6 = i5 + 11;
                                    }
                                    if (3 == i7) {
                                        i6 = i5 + 12;
                                    }
                                    if (i7 == 4) {
                                        i6 = i5 + 13;
                                    }
                                    bt(strArr[i7], gg.ad(as, (short) 300) + str, i6, i, i2, i3, 397147827);
                                }
                                i7--;
                            }
                        }
                        if (strArr != null) {
                            i5 = 4;
                            while (i5 >= 0) {
                                if (strArr[i5] != null && strArr[i5].equalsIgnoreCase(jv.fy)) {
                                    int i8 = 0;
                                    if (jp.aa != this.ba) {
                                        if (this.ba == jp.ad || (this.ba == jp.af && -1443054959 * auVar.av > gf.ho.ar * -1986989913)) {
                                            i8 = 2000;
                                        }
                                        i6 = 0;
                                        if (i5 == 0) {
                                            i6 = i8 + 9;
                                        }
                                        if (i5 == 1) {
                                            i6 = i8 + 10;
                                        }
                                        if (i5 == 2) {
                                            i6 = i8 + 11;
                                        }
                                        if (i5 == 3) {
                                            i6 = i8 + 12;
                                        }
                                        if (i5 == 4) {
                                            i6 = i8 + 13;
                                        }
                                        bt(strArr[i5], gg.ad(as, (short) 300) + str, i6, i, i2, i3, 249681645);
                                    }
                                }
                                i5--;
                            }
                        }
                        if (!auVar.bx || !cc(-1115194924)) {
                            bt(jv.ft, gg.ad(as, (short) 300) + str, 1003, i, i2, i3, -376078945);
                        }
                    } else if (2 == ((this.al * 1111933847) & 2)) {
                        bt(this.ap, this.bw + " " + ha.ay + " " + gg.ad(as, (short) 300) + str, 8, i, i2, i3, -1588351526);
                    }
                }
            }
        }
    }

    final void by(ga gaVar, int i, int i2, int i3, byte b) {
        try {
            if (gf.ho != gaVar && 49382109 * this.bu < 400) {
                int i4;
                String str;
                if (972929391 * gaVar.aj == 0) {
                    String ad;
                    String str2 = gaVar.as[0] + gaVar.af + gaVar.as[1];
                    i4 = (gf.ho.ar * -1986989913) - (gaVar.ar * -1986989913);
                    if (i4 < -9) {
                        ad = gg.ad(16711680, (short) 300);
                    } else if (i4 < -6) {
                        ad = gg.ad(16723968, (short) 300);
                    } else if (i4 < -3) {
                        ad = gg.ad(16740352, (short) 300);
                    } else if (i4 < 0) {
                        ad = gg.ad(16756736, (short) 300);
                    } else if (i4 > 9) {
                        ad = gg.ad(65280, (short) 300);
                    } else if (i4 > 6) {
                        ad = gg.ad(4259584, (short) 300);
                    } else if (i4 > 3) {
                        ad = gg.ad(8453888, (short) 300);
                    } else if (i4 > 0) {
                        ad = gg.ad(12648192, (short) 300);
                    } else {
                        ad = gg.ad(as, (short) 300);
                    }
                    str = str2 + ad + " " + ha.aa + jv.gp + (gaVar.ar * -1986989913) + ha.ag + gaVar.as[2];
                } else {
                    str = gaVar.as[0] + gaVar.af + gaVar.as[1] + " " + ha.aa + jv.gf + (gaVar.aj * 972929391) + ha.ag + gaVar.as[2];
                }
                if (1 == 430699339 * client.jb) {
                    bt(jv.fx, client.it + " " + ha.ay + " " + gg.ad(16777215, (short) 300) + str, 14, i, i2, i3, -1975590398);
                } else if (!this.ax) {
                    for (int i5 = 7; i5 >= 0; i5--) {
                        if (this.bz[i5] != null) {
                            i4 = 0;
                            if (this.bz[i5].equalsIgnoreCase(jv.fy)) {
                                if (this.bn != jp.aa) {
                                    if (this.bn == jp.ad || (jp.af == this.bn && -1986989913 * gaVar.ar > -1986989913 * gf.ho.ar)) {
                                        i4 = 2000;
                                    }
                                    if (!(gf.ho.au * 119175553 == 0 || 119175553 * gaVar.au == 0)) {
                                        if (119175553 * gf.ho.au == 119175553 * gaVar.au) {
                                            i4 = 2000;
                                        } else {
                                            i4 = 0;
                                        }
                                    }
                                }
                            } else if (this.bg[i5]) {
                                i4 = 2000;
                            }
                            int i6 = i4 + this.bc[i5];
                            bt(this.bz[i5], gg.ad(16777215, (short) 300) + str, i6, i, i2, i3, 1537937616);
                        }
                    }
                } else if (((1111933847 * this.al) & 8) == 8) {
                    bt(this.ap, this.bw + " " + ha.ay + " " + gg.ad(16777215, (short) 300) + str, 15, i, i2, i3, 1637551950);
                }
                bi(str, (short) -13795);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "il.by(" + ')');
        }
    }

    final void gr(ga gaVar, int i, int i2, int i3) {
        if (gf.ho != gaVar) {
            if (49382109 * this.bu < 400) {
                int i4;
                String str;
                if (972929391 * gaVar.aj == 0) {
                    String ad;
                    String str2 = gaVar.as[0] + gaVar.af + gaVar.as[1];
                    i4 = (gf.ho.ar * -1986989913) - (gaVar.ar * -1986989913);
                    if (i4 < -9) {
                        ad = gg.ad(16711680, (short) 300);
                    } else if (i4 < -6) {
                        ad = gg.ad(16723968, (short) 300);
                    } else if (i4 < -3) {
                        ad = gg.ad(16740352, (short) 300);
                    } else if (i4 < 0) {
                        ad = gg.ad(16756736, (short) 300);
                    } else if (i4 > 9) {
                        ad = gg.ad(65280, (short) 300);
                    } else if (i4 > 6) {
                        ad = gg.ad(4259584, (short) 300);
                    } else if (i4 > 3) {
                        ad = gg.ad(8453888, (short) 300);
                    } else if (i4 > 0) {
                        ad = gg.ad(12648192, (short) 300);
                    } else {
                        ad = gg.ad(as, (short) 300);
                    }
                    str = str2 + ad + " " + ha.aa + jv.gp + (gaVar.ar * -1986989913) + ha.ag + gaVar.as[2];
                } else {
                    str = gaVar.as[0] + gaVar.af + gaVar.as[1] + " " + ha.aa + jv.gf + (gaVar.aj * 972929391) + ha.ag + gaVar.as[2];
                }
                if (1 == 430699339 * client.jb) {
                    bt(jv.fx, client.it + " " + ha.ay + " " + gg.ad(16777215, (short) 300) + str, 14, i, i2, i3, -1701063203);
                } else if (!this.ax) {
                    for (int i5 = 7; i5 >= 0; i5--) {
                        if (this.bz[i5] != null) {
                            i4 = 0;
                            if (this.bz[i5].equalsIgnoreCase(jv.fy)) {
                                if (this.bn != jp.aa) {
                                    if (this.bn == jp.ad || (jp.af == this.bn && -1986989913 * gaVar.ar > -1986989913 * gf.ho.ar)) {
                                        i4 = 2000;
                                    }
                                    if (!(gf.ho.au * 119175553 == 0 || 119175553 * gaVar.au == 0)) {
                                        if (119175553 * gf.ho.au == 119175553 * gaVar.au) {
                                            i4 = 2000;
                                        } else {
                                            i4 = 0;
                                        }
                                    }
                                }
                            } else if (this.bg[i5]) {
                                i4 = 2000;
                            }
                            int i6 = i4 + this.bc[i5];
                            bt(this.bz[i5], gg.ad(16777215, (short) 300) + str, i6, i, i2, i3, -671786875);
                        }
                    }
                } else if (((1111933847 * this.al) & 8) == 8) {
                    bt(this.ap, this.bw + " " + ha.ay + " " + gg.ad(16777215, (short) 300) + str, 15, i, i2, i3, -1978388388);
                }
                bi(str, (short) -18382);
            }
        }
    }

    String bn(ac acVar, int i, int i2) {
        try {
            Object obj;
            if (((ah.fy(acVar, -65015581) >> (i + 1)) & 1) != 0) {
                obj = 1;
            } else {
                obj = null;
            }
            if (obj == null && acVar.el == null) {
                return null;
            }
            if (acVar.ds == null || acVar.ds.length <= i || acVar.ds[i] == null || acVar.ds[i].trim().length() == 0) {
                return null;
            }
            return acVar.ds[i];
        } catch (Throwable e) {
            throw ba.ad(e, "il.bn(" + ')');
        }
    }

    String gx(ac acVar, int i) {
        return (((((ah.fy(acVar, -1939387995) >> (i + 1)) & 1) != 0 ? 1 : null) == null && acVar.el == null) || acVar.ds == null || acVar.ds.length <= i || acVar.ds[i] == null || acVar.ds[i].trim().length() == 0) ? null : acVar.ds[i];
    }

    String hd(ac acVar, int i) {
        Object obj;
        if (((ah.fy(acVar, -2116777711) >> (i + 1)) & 1) != 0) {
            obj = 1;
        } else {
            obj = null;
        }
        if ((obj == null && acVar.el == null) || acVar.ds == null || acVar.ds.length <= i || acVar.ds[i] == null) {
            return null;
        }
        if (acVar.ds[i].trim().length() == 0) {
            return null;
        }
        return acVar.ds[i];
    }

    String hx(ac acVar, int i) {
        if ((((ah.fy(acVar, -1891293251) >> (i + 1)) & 1) != 0 ? 1 : null) == null && acVar.el == null) {
            return null;
        }
        if (acVar.ds == null || acVar.ds.length <= i || acVar.ds[i] == null || acVar.ds[i].trim().length() == 0) {
            return null;
        }
        return acVar.ds[i];
    }

    String hy(ac acVar, int i) {
        if ((((ah.fy(acVar, 23808949) >> (i + 1)) & 1) != 0 ? 1 : null) == null && acVar.el == null) {
            return null;
        }
        if (acVar.ds == null || acVar.ds.length <= i || acVar.ds[i] == null || acVar.ds[i].trim().length() == 0) {
            return null;
        }
        return acVar.ds[i];
    }

    final int ba(int i) {
        try {
            if (this.bu * 49382109 <= 0) {
                return -1;
            }
            return (this.bu * 49382109) - 1;
        } catch (Throwable e) {
            throw ba.ad(e, "il.ba(" + ')');
        }
    }

    final int hj() {
        if (49382109 * this.bu <= 0) {
            return -1;
        }
        return (this.bu * 912030375) - 1;
    }

    final int hk() {
        return 959492784 * this.bu <= 0 ? -1 : (this.bu * 49382109) - 1;
    }

    final boolean bl(byte b) {
        try {
            return this.bu * 49382109 > 0 && this.by && cn(1395263506) && this.be[(this.bu * 49382109) - 1].as;
        } catch (Throwable e) {
            throw ba.ad(e, "il.bl(" + ')');
        }
    }

    final boolean hg() {
        if (this.bu * 49382109 > 0 && this.by && cn(1253738809) && this.be[(this.bu * 49382109) - 1].as) {
            return true;
        }
        return false;
    }

    final boolean hq() {
        return this.bu * 49382109 > 0 && this.by && cn(751804263) && this.be[(this.bu * 49382109) - 1].as;
    }

    void bd(int i) {
        Object obj = null;
        while (obj == null) {
            obj = 1;
            int i2 = 0;
            while (i2 < (this.bu * 49382109) - 1) {
                try {
                    js jsVar = this.be[i2];
                    js jsVar2 = this.be[i2 + 1];
                    if (jsVar.an * 1263979533 < 1000 && jsVar2.an * 1263979533 > 1000) {
                        bp(i2, i2 + 1, (byte) 3);
                        obj = null;
                    }
                    i2++;
                } catch (Throwable e) {
                    throw ba.ad(e, "il.bd(" + ')');
                }
            }
        }
    }

    void he() {
        Object obj = null;
        while (obj == null) {
            obj = 1;
            for (int i = 0; i < (this.bu * 49382109) - 1; i++) {
                js jsVar = this.be[i];
                js jsVar2 = this.be[i + 1];
                if (jsVar.an * 1263979533 < 1000 && jsVar2.an * 1263979533 > -1861168487) {
                    bp(i, i + 1, (byte) 17);
                    obj = null;
                }
            }
        }
    }

    void hl() {
        Object obj = null;
        while (obj == null) {
            obj = 1;
            for (int i = 0; i < (this.bu * -1465197146) - 1; i++) {
                js jsVar = this.be[i];
                js jsVar2 = this.be[i + 1];
                if (jsVar.an * -1657048221 < 1000 && jsVar2.an * -1366085132 > -1541884380) {
                    bp(i, i + 1, (byte) 87);
                    obj = null;
                }
            }
        }
    }

    void hn() {
        Object obj = null;
        while (obj == null) {
            obj = 1;
            for (int i = 0; i < (this.bu * 49382109) - 1; i++) {
                js jsVar = this.be[i];
                js jsVar2 = this.be[i + 1];
                if (jsVar.an * 1263979533 < 1000 && jsVar2.an * 1263979533 > 1000) {
                    bp(i, i + 1, (byte) 82);
                    obj = null;
                }
            }
        }
    }

    void hr() {
        Object obj = null;
        while (obj == null) {
            obj = 1;
            for (int i = 0; i < (this.bu * 49382109) - 1; i++) {
                js jsVar = this.be[i];
                js jsVar2 = this.be[i + 1];
                if (jsVar.an * 1263979533 < 1000 && jsVar2.an * 1263979533 > 1300212394) {
                    bp(i, i + 1, (byte) -4);
                    obj = null;
                }
            }
        }
    }

    public void bs(int i) {
        try {
            this.bu = 0;
            this.bh = false;
            client.ao.ah((short) 21924);
            bo((byte) -113);
        } catch (Throwable e) {
            throw ba.ad(e, "il.bs(" + ')');
        }
    }

    public void hs() {
        this.bu = 0;
        this.bh = false;
        client.ao.ah((short) 22480);
        bo((byte) -5);
    }

    public void hv() {
        this.bu = 0;
        this.bh = false;
        client.ao.ah((short) 15104);
        bo((byte) -39);
    }

    public void bm(int i) {
        try {
            bs(911327878);
            this.bu = -1609144971;
            this.be[0].af(ae, -788827527);
        } catch (Throwable e) {
            throw ba.ad(e, "il.bm(" + ')');
        }
    }

    public void ha() {
        bs(1253984336);
        this.bu = -1609144971;
        this.be[0].af(ae, -2102934507);
    }

    public void hi() {
        bs(437628950);
        this.bu = -1609144971;
        this.be[0].af(ae, -180228596);
    }

    public void hm() {
        bs(754501119);
        this.bu = -1609144971;
        this.be[0].af(ae, -2077402528);
    }

    public void br(int i) {
        int i2 = 0;
        while (i2 < this.bu * 49382109) {
            try {
                if (ar.bj(this.be[i2].an * 1263979533, -1171263545)) {
                    if (i2 < (this.bu * 49382109) - 1) {
                        for (int i3 = i2; i3 < (this.bu * 49382109) - 1; i3++) {
                            bp(i3, i3 + 1, (byte) -60);
                        }
                    }
                    i2--;
                    this.bu -= -1609144971;
                }
                i2++;
            } catch (Throwable e) {
                throw ba.ad(e, "il.br(" + ')');
            }
        }
        ag(-1890227324);
    }

    public void hu() {
        int i = 0;
        while (i < this.bu * 1977982623) {
            if (ar.bj(this.be[i].an * 306777969, -1171263545)) {
                if (i < (this.bu * 49382109) - 1) {
                    for (int i2 = i; i2 < (this.bu * 49382109) - 1; i2++) {
                        bp(i2, i2 + 1, (byte) 55);
                    }
                }
                i--;
                this.bu -= 1586469895;
            }
            i++;
        }
        ag(419191242);
    }

    public void hw() {
        int i = 0;
        while (i < this.bu * -1115142563) {
            if (ar.bj(this.be[i].an * -1750135235, -1171263545)) {
                if (i < (this.bu * 408575705) - 1) {
                    for (int i2 = i; i2 < (this.bu * 1817756425) - 1; i2++) {
                        bp(i2, i2 + 1, (byte) 52);
                    }
                }
                i--;
                this.bu -= -1609144971;
            }
            i++;
        }
        ag(-131068070);
    }

    static boolean hp(int i) {
        return i == 57 || i == 58 || i == 1007 || 25 == i || 30 == i;
    }

    static boolean ht(int i) {
        return i == 693617014 || i == 58 || i == 1007 || 25 == i || 30 == i;
    }

    void bi(String str, short s) {
        int i = 0;
        while (i < 49382109 * this.bu) {
            try {
                if (1263979533 * this.be[i].an == 23) {
                    this.be[i].ay = gg.ad(16777215, (short) 300) + str;
                    return;
                }
                i++;
            } catch (Throwable e) {
                throw ba.ad(e, "il.bi(" + ')');
            }
        }
    }

    void hb(String str) {
        for (int i = 0; i < 49382109 * this.bu; i++) {
            if (1263979533 * this.be[i].an == 23) {
                this.be[i].ay = gg.ad(16777215, (short) 300) + str;
                return;
            }
        }
    }

    void hc(String str) {
        for (int i = 0; i < 49382109 * this.bu; i++) {
            if (1263979533 * this.be[i].an == 23) {
                this.be[i].ay = gg.ad(16777215, (short) 300) + str;
                return;
            }
        }
    }

    void hf(String str) {
        for (int i = 0; i < 49382109 * this.bu; i++) {
            if (1263979533 * this.be[i].an == 23) {
                this.be[i].ay = gg.ad(16777215, (short) 300) + str;
                return;
            }
        }
    }

    void hz(String str) {
        for (int i = 0; i < 923668541 * this.bu; i++) {
            if (1263979533 * this.be[i].an == 23) {
                this.be[i].ay = gg.ad(-1904742042, (short) 300) + str;
                return;
            }
        }
    }

    public boolean bq(int i) {
        try {
            return this.bt;
        } catch (Throwable e) {
            throw ba.ad(e, "il.bq(" + ')');
        }
    }

    public boolean hh() {
        return this.bt;
    }

    public boolean ho() {
        return this.bt;
    }

    public boolean io() {
        return this.bt;
    }

    void bo(byte b) {
        try {
            if (this.bt) {
                this.bt = false;
                client.ao.ao(gt.at, 1453167757);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "il.bo(" + ')');
        }
    }

    void ij() {
        if (this.bt) {
            this.bt = false;
            client.ao.ao(gt.at, 2145167596);
        }
    }

    void iq() {
        if (this.bt) {
            this.bt = false;
            client.ao.ao(gt.at, 1631625048);
        }
    }

    void iv() {
        if (this.bt) {
            this.bt = false;
            client.ao.ao(gt.at, 1588090439);
        }
    }

    public void cv(jp jpVar, int i) {
        try {
            this.bn = jpVar;
        } catch (Throwable e) {
            throw ba.ad(e, "il.cv(" + ')');
        }
    }

    public void ir(jp jpVar) {
        this.bn = jpVar;
    }

    public void ci(jp jpVar, byte b) {
        try {
            this.ba = jpVar;
        } catch (Throwable e) {
            throw ba.ad(e, "il.ci(" + ')');
        }
    }

    public void id(jp jpVar) {
        this.ba = jpVar;
    }

    public void in(jp jpVar) {
        this.ba = jpVar;
    }

    boolean cc(int i) {
        try {
            return this.bk;
        } catch (Throwable e) {
            throw ba.ad(e, "il.cc(" + ')');
        }
    }

    boolean ic() {
        return this.bk;
    }

    boolean im() {
        return this.bk;
    }

    boolean it() {
        return this.bk;
    }

    public void co(boolean z, int i) {
        try {
            this.bk = z;
        } catch (Throwable e) {
            throw ba.ad(e, "il.co(" + ')');
        }
    }

    public void cy(boolean z, int i) {
        try {
            this.by = z;
        } catch (Throwable e) {
            throw ba.ad(e, "il.cy(" + ')');
        }
    }

    boolean cn(int i) {
        try {
            return this.ao || client.ao.ac(81, (byte) -5);
        } catch (Throwable e) {
            throw ba.ad(e, "il.cn(" + ')');
        }
    }

    boolean ia() {
        return this.ao || client.ao.ac(81, (byte) -60);
    }

    boolean ig() {
        return this.ao || client.ao.ac(81, (byte) -122);
    }

    boolean ik() {
        return this.ao || client.ao.ac(81, (byte) -103);
    }

    boolean iz() {
        return this.ao || client.ao.ac(81, (byte) -22);
    }

    public void ck(boolean z, byte b) {
        try {
            this.ao = z;
        } catch (Throwable e) {
            throw ba.ad(e, "il.ck(" + ')');
        }
    }

    public void ib(boolean z) {
        this.ao = z;
    }

    public void iu(boolean z) {
        this.ao = z;
    }

    public boolean cl(int i) {
        try {
            return this.ao;
        } catch (Throwable e) {
            throw ba.ad(e, "il.cl(" + ')');
        }
    }

    public boolean m19if() {
        return this.ao;
    }

    public boolean iy() {
        return this.ao;
    }

    public void cs(int i, boolean z, int i2) {
        try {
            this.cv = 1449421731 * i;
            this.bo = z;
            ch(943833253);
        } catch (Throwable e) {
            throw ba.ad(e, "il.cs(" + ')');
        }
    }

    public void ii(int i, boolean z) {
        this.cv = 844303077 * i;
        this.bo = z;
        ch(416182877);
    }

    public void cd(boolean z, int i) {
        try {
            this.ci = z;
        } catch (Throwable e) {
            throw ba.ad(e, "il.cd(" + ')');
        }
    }

    public void ie(boolean z) {
        this.ci = z;
    }

    public void ip(boolean z) {
        this.ci = z;
    }

    public void iw(boolean z) {
        this.ci = z;
    }

    public void ix(boolean z) {
        this.ci = z;
    }

    void ch(int i) {
        try {
            if (this.cv * 1988698123 >= 0) {
                fx[] ae = ez.ae(this.cc, this.cv * 1988698123, (byte) 82);
                if (ae != null || this.cv * 1988698123 < 0) {
                    this.bq = ae;
                    this.cv = -1449421731;
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "il.ch(" + ')');
        }
    }
}
