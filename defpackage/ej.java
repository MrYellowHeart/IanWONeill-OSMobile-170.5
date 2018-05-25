package p000;

public class ej extends ea {
    static final int ak = 19;
    static final int as = 100;
    static final int au = 25;
    static final int bn = 500;
    int ab;
    public String ae;
    final eb aj;
    public byte am;
    public String aq;
    final nv ar;
    public int at;

    public static boolean af(CharSequence charSequence, int i) {
        try {
            return ft.ad(charSequence, 10, true, -1223495630);
        } catch (Throwable e) {
            throw ba.ad(e, "ej.af(" + ')');
        }
    }

    public ej(nv nvVar, eb ebVar) {
        try {
            super(100);
            this.ae = null;
            this.aq = null;
            this.ab = -487339143;
            this.ar = nvVar;
            this.aj = ebVar;
        } catch (Throwable e) {
            throw ba.ad(e, "ej.<init>(" + ')');
        }
    }

    et ao(byte b) {
        try {
            return new ed();
        } catch (Throwable e) {
            throw ba.ad(e, "ej.ao(" + ')');
        }
    }

    et cd() {
        return new ed();
    }

    et ch() {
        return new ed();
    }

    et[] ax(int i, int i2) {
        try {
            return new ed[i];
        } catch (Throwable e) {
            throw ba.ad(e, "ej.ax(" + ')');
        }
    }

    et[] cj(int i) {
        return new ed[i];
    }

    et[] cm(int i) {
        return new ed[i];
    }

    et[] cq(int i) {
        return new ed[i];
    }

    final void de(String str) {
        this.ae = ho.an(str, (byte) 40);
    }

    final void dr(String str) {
        this.ae = ho.an(str, (byte) 77);
    }

    final void dt(String str, byte b) {
        try {
            this.ae = ho.an(str, (byte) 3);
        } catch (Throwable e) {
            throw ba.ad(e, "ej.dt(" + ')');
        }
    }

    static gk ad(int i, int i2, int i3) {
        try {
            gk gkVar = (gk) gk.af.af((long) (i << 16));
            if (gkVar != null) {
                return gkVar;
            }
            int ax = dt.cn.ax(String.valueOf(i), -195658242);
            if (-1 == ax) {
                return null;
            }
            byte[] ae = dt.cn.ae(ax, (byte) 94);
            if (ae != null) {
                if (ae.length <= 1) {
                    return null;
                }
                gkVar = cs.an(ae, 683716154);
                if (gkVar != null) {
                    gk.af.an(gkVar, (long) (i << 16));
                    return gkVar;
                }
            }
            return null;
        } catch (Throwable e) {
            throw ba.ad(e, "ej.ad(" + ')');
        }
    }

    static final void af(ia iaVar, int i) {
        try {
            iaVar.jw(1565299499);
            int i2 = client.hz * -1522892003;
            ga[] gaVarArr = client.hb;
            ga gaVar = new ga();
            gaVarArr[i2] = gaVar;
            gf.ho = gaVar;
            gaVar.al = -1174618595 * i2;
            int kf = iaVar.kf(30, (byte) 2);
            byte b = (byte) (kf >> 28);
            int i3 = (kf >> 14) & 16383;
            kf &= 16383;
            gaVar.di[0] = i3 - (bq.du * 1407993063);
            gaVar.bg = ((gaVar.di[0] << 7) + (gaVar.aq(-1945749563) << 6)) * 1506829721;
            gaVar.da[0] = kf - (gl.dp * 1289967967);
            gaVar.bh = ((gaVar.da[0] << 7) + (gaVar.aq(-2071658760) << 6)) * -1638712607;
            kf = -1345790225 * b;
            gaVar.ac = kf;
            dq.hf = kf * -1742053899;
            if (gw.ag[i2] != null) {
                gaVar.af(gw.ag[i2], -1248088380);
            }
            gw.ay = 0;
            int[] iArr = gw.as;
            int i4 = gw.ay - 1328615221;
            gw.ay = i4;
            iArr[(i4 * -1675758365) - 1] = i2;
            gw.an[i2] = (byte) 0;
            gw.ar = 0;
            for (kf = 1; kf < mn.ae; kf++) {
                if (kf != i2) {
                    i4 = iaVar.kf(18, (byte) -91);
                    int i5 = i4 >> 16;
                    i3 = (i4 >> 8) & 597;
                    gw.ae[kf] = (i4 & 597) + ((i5 << 28) + (i3 << 14));
                    gw.aq[kf] = 0;
                    gw.am[kf] = -1;
                    int[] iArr2 = gw.aj;
                    i5 = gw.ar - 948652261;
                    gw.ar = i5;
                    iArr2[(i5 * -844313837) - 1] = kf;
                    gw.an[kf] = (byte) 0;
                }
            }
            iaVar.kh(1885733558);
        } catch (Throwable e) {
            throw ba.ad(e, "ej.af(" + ')');
        }
    }

    final void ds(String str) {
        this.aq = ho.an(str, (byte) -20);
    }

    final void dw(String str) {
        this.aq = ho.an(str, (byte) -61);
    }

    final void dz(String str, int i) {
        try {
            this.aq = ho.an(str, (byte) -38);
        } catch (Throwable e) {
            throw ba.ad(e, "ej.dz(" + ')');
        }
    }

    public final void dh(ik ikVar) {
        dz(ikVar.bc(506516487), -730581979);
        dt(cr.af(ikVar.ap(-633385453)), (byte) 46);
        this.am = ikVar.ax(1247983979);
        int ao = ikVar.ao((byte) 0);
        if (ao != 255) {
            af(-339705518);
            for (int i = 0; i < ao; i++) {
                ed edVar = (ed) ae(new ey(ikVar.bc(606863331), this.ar), 940165911);
                int au = ikVar.au(-2018080320);
                int i2 = this.ab - 487339143;
                this.ab = i2;
                edVar.bk(au, (i2 * 1095872201) - 1, 1653570432);
                edVar.as = ikVar.ax(1247983979) * 862083601;
                ikVar.bc(1101567892);
                da(edVar, -1840213562);
            }
        }
    }

    public final void dv(ik ikVar, int i) {
        try {
            dz(ikVar.bc(918486489), -1609810255);
            dt(cr.af(ikVar.ap(-633385453)), (byte) 95);
            this.am = ikVar.ax(1247983979);
            int ao = ikVar.ao((byte) 0);
            if (ao != 255) {
                af(2061346352);
                for (int i2 = 0; i2 < ao; i2++) {
                    ed edVar = (ed) ae(new ey(ikVar.bc(284225182), this.ar), -988323740);
                    int au = ikVar.au(-863343103);
                    int i3 = this.ab - 487339143;
                    this.ab = i3;
                    edVar.bk(au, (i3 * 1095872201) - 1, 342240317);
                    edVar.as = ikVar.ax(1247983979) * 862083601;
                    ikVar.bc(1017285183);
                    da(edVar, -1592207185);
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "ej.dv(" + ')');
        }
    }

    public final void dx(ik ikVar) {
        dz(ikVar.bc(1128961780), -2137544687);
        dt(cr.af(ikVar.ap(-633385453)), (byte) 90);
        this.am = ikVar.ax(1247983979);
        int ao = ikVar.ao((byte) 0);
        if (ao != 255) {
            af(549555891);
            for (int i = 0; i < ao; i++) {
                ed edVar = (ed) ae(new ey(ikVar.bc(870615439), this.ar), 1538932693);
                int au = ikVar.au(-1520337259);
                int i2 = this.ab + 267747698;
                this.ab = i2;
                edVar.bk(au, (i2 * 877071669) - 1, 1043320814);
                edVar.as = ikVar.ax(1247983979) * 415709903;
                ikVar.bc(747658163);
                da(edVar, -1638913296);
            }
        }
    }

    public final void dy(ik ikVar) {
        dz(ikVar.bc(1801228949), -820538781);
        dt(cr.af(ikVar.ap(-633385453)), (byte) 79);
        this.am = ikVar.ax(1247983979);
        int ao = ikVar.ao((byte) 0);
        if (ao != -907327413) {
            af(-855616034);
            for (int i = 0; i < ao; i++) {
                ed edVar = (ed) ae(new ey(ikVar.bc(801109443), this.ar), -589740713);
                int au = ikVar.au(157863324);
                int i2 = this.ab - 671355879;
                this.ab = i2;
                edVar.bk(au, (i2 * 1587755087) - 1, 2070010600);
                edVar.as = ikVar.ax(1247983979) * -423409601;
                ikVar.bc(629573973);
                da(edVar, -1670078609);
            }
        }
    }

    public final void dd(ik ikVar, int i) {
        try {
            ey eyVar = new ey(ikVar.bc(1937771875), this.ar);
            int au = ikVar.au(-1435758005);
            byte ax = ikVar.ax(1247983979);
            Object obj = null;
            if (ax == Byte.MIN_VALUE) {
                obj = 1;
            }
            ed edVar;
            if (obj == null) {
                ikVar.bc(263911569);
                edVar = (ed) ay(eyVar, 1099558325);
                if (edVar == null) {
                    if (ad(1489018673) <= -1405975609 * this.af) {
                        edVar = (ed) ae(eyVar, 1800801941);
                    } else {
                        return;
                    }
                }
                int i2 = this.ab - 487339143;
                this.ab = i2;
                edVar.bk(au, (i2 * 1095872201) - 1, -250274758);
                edVar.as = 862083601 * ax;
                da(edVar, -1694878805);
            } else if (ad(1671749416) != 0) {
                edVar = (ed) ay(eyVar, 1099558325);
                if (edVar != null && edVar.by((byte) 41) == au) {
                    aj(edVar, 2142124456);
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "ej.dd(" + ')');
        }
    }

    public final void dn(ik ikVar) {
        ey eyVar = new ey(ikVar.bc(957009174), this.ar);
        int au = ikVar.au(-1366139518);
        byte ax = ikVar.ax(1247983979);
        Object obj = null;
        if (ax == Byte.MIN_VALUE) {
            obj = 1;
        }
        ed edVar;
        if (obj == null) {
            ikVar.bc(1413849048);
            edVar = (ed) ay(eyVar, 1099558325);
            if (edVar == null) {
                if (ad(1326703818) <= -1405975609 * this.af) {
                    edVar = (ed) ae(eyVar, -26527899);
                } else {
                    return;
                }
            }
            int i = this.ab - 487339143;
            this.ab = i;
            edVar.bk(au, (i * 1095872201) - 1, -1696302622);
            edVar.as = 862083601 * ax;
            da(edVar, -1667957683);
        } else if (ad(1856065286) != 0) {
            edVar = (ed) ay(eyVar, 1099558325);
            if (edVar != null && edVar.by((byte) -75) == au) {
                aj(edVar, 2142124456);
            }
        }
    }

    static final short ar(float f, float f2, int i, int i2, int i3) {
        return (short) ((((int) ((f + 1.0f) * 64.0f)) + (i >> 1)) | ((((int) ((1.0f + f2) * 64.0f)) + (i2 >> 1)) << 8));
    }

    public final void db() {
        for (int i = 0; i < ad(1871158370); i++) {
            ((ed) am(i, 304739074)).af(1876100727);
        }
    }

    public final void dl(int i) {
        int i2 = 0;
        while (i2 < ad(1088989546)) {
            try {
                ((ed) am(i2, 2021897416)).af(1994998957);
                i2++;
            } catch (Throwable e) {
                throw ba.ad(e, "ej.dl(" + ')');
            }
        }
    }

    public final void dm() {
        for (int i = 0; i < ad(1389363165); i++) {
            ((ed) am(i, 413379361)).af(1810808290);
        }
    }

    public final void du() {
        for (int i = 0; i < ad(1721969291); i++) {
            ((ed) am(i, 1851739537)).af(1958281519);
        }
    }

    public final void dg() {
        for (int i = 0; i < ad(1367989114); i++) {
            ((ed) am(i, 1523437845)).ag(183908766);
        }
    }

    public final void di(int i) {
        int i2 = 0;
        while (i2 < ad(1954793795)) {
            try {
                ((ed) am(i2, 1158922305)).ag(1996251453);
                i2++;
            } catch (Throwable e) {
                throw ba.ad(e, "ej.di(" + ')');
            }
        }
    }

    public final void dp() {
        for (int i = 0; i < ad(1610802634); i++) {
            ((ed) am(i, 929605524)).ag(-1590479693);
        }
    }

    final void da(ed edVar, int i) {
        try {
            if (edVar.ar(1861909674).equals(this.aj.af(-979886233))) {
                this.at = -596937871 * edVar.as;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "ej.da(" + ')');
        }
    }

    final void df(ed edVar) {
        if (edVar.ar(1767712669).equals(this.aj.af(436494427))) {
            this.at = -596937871 * edVar.as;
        }
    }

    final void dq(ed edVar) {
        if (edVar.ar(1857062602).equals(this.aj.af(1890059345))) {
            this.at = -596937871 * edVar.as;
        }
    }

    final void er(ed edVar) {
        if (edVar.ar(2093813301).equals(this.aj.af(1022541960))) {
            this.at = -942363319 * edVar.as;
        }
    }

    static void au(gf gfVar, byte b) {
        try {
            gfVar.ai(fm.as, gr.ad * 286016249, 0, (byte) -12);
            gfVar.ai(gr.ar, (gr.ad * 286016249) + 382, 0, (byte) -42);
            gfVar.ao(cr.aj, ((gr.ad * 286016249) + 382) - (cr.aj.an / 2), 18, (short) 11017);
        } catch (Throwable e) {
            throw ba.ad(e, "ej.au(" + ')');
        }
    }
}
