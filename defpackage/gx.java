package p000;

public abstract class gx extends cq {
    boolean an;
    int ba;
    boolean bd;
    int be;
    int bf;
    public int bg;
    public int bh;
    int bj;
    int bk;
    String bl;
    int bm;
    int bn;
    int bp;
    byte bq;
    int br;
    boolean bs;
    int bt;
    int bu;
    int bv;
    int bx;
    int by;
    int ca;
    int cb;
    int[] cc;
    int cd;
    int ce;
    int cf;
    int cg;
    int ch;
    int[] ci;
    int cj;
    int ck;
    boolean cl;
    int cm;
    kj cn;
    int[] co;
    int cp;
    int cq;
    int cr;
    int cs;
    int ct;
    int cu;
    int[] cv;
    int cw;
    int cx;
    int[] cy;
    int cz;
    int[] da;
    int dc;
    int dd;
    int de;
    int[] di;
    int dj;
    int dk;
    int dl;
    int f3do;
    byte[] dr;
    int dt;
    int dv;
    int dw;
    int dz;

    gx() {
        try {
            this.an = false;
            this.bv = 1981295833;
            this.bx = -108915619;
            this.bt = 878920581;
            this.bu = 1204179289;
            this.be = -1523276509;
            this.bk = -539275743;
            this.by = 447796541;
            this.bn = 1542339397;
            this.ba = -1627332603;
            this.bl = null;
            this.bs = false;
            this.bm = -206649612;
            this.br = 0;
            this.bj = 0;
            this.bq = (byte) 0;
            this.cv = new int[4];
            this.ci = new int[4];
            this.cc = new int[4];
            this.co = new int[4];
            this.cy = new int[4];
            this.cn = new kj();
            this.ck = -1968525927;
            this.cl = false;
            this.cs = -464408867;
            this.cd = 662713255;
            this.ch = 0;
            this.cm = 0;
            this.cq = 2033542925;
            this.cj = 0;
            this.cp = 0;
            this.ct = 0;
            this.cb = 0;
            this.cf = 2015474731;
            this.cz = 0;
            this.cr = 0;
            this.f3do = 0;
            this.dt = 525082664;
            this.dv = 0;
            this.dd = 1180237088;
            this.dl = 0;
            this.di = new int[10];
            this.da = new int[10];
            this.dr = new byte[10];
            this.de = 0;
            this.dw = 0;
        } catch (Throwable e) {
            throw ba.ad(e, "gx.<init>(" + ')');
        }
    }

    final void bo() {
        this.dl = 0;
        this.dw = 0;
    }

    final void br(int i) {
        try {
            this.dl = 0;
            this.dw = 0;
        } catch (Throwable e) {
            throw ba.ad(e, "gx.br(" + ')');
        }
    }

    final void cv() {
        this.dl = 0;
        this.dw = 0;
    }

    boolean an(int i) {
        return false;
    }

    boolean ar() {
        return false;
    }

    boolean as() {
        return false;
    }

    final void bj(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        Object obj = 1;
        Object obj2 = 1;
        int i9 = 0;
        while (i9 < 4) {
            try {
                if (this.cc[i9] > i5) {
                    obj2 = null;
                } else {
                    obj = null;
                }
                i9++;
            } catch (Throwable e) {
                throw ba.ad(e, "gx.bj(" + ')');
            }
        }
        int i10 = -1;
        int i11 = 0;
        if (i >= 0) {
            aa af = lq.af(i, (byte) 67);
            i10 = 483376017 * af.av;
            i11 = af.ab * 1659950271;
        }
        int i12;
        if (obj == null) {
            if (obj2 != null) {
                this.bq = (byte) 0;
            }
            for (i12 = 0; i12 < 4; i12++) {
                i8 = this.bq;
                this.bq = (byte) ((this.bq + 1) % 4);
                if (this.cc[i8] <= i5) {
                    break;
                }
            }
            i8 = -1;
        } else if (i10 != -1) {
            i8 = 0;
            i12 = 0;
            if (i10 == 0) {
                i12 = this.cc[0];
            } else if (i10 == 1) {
                i12 = this.ci[0];
            }
            i9 = 1;
            while (i9 < 4) {
                if (i10 == 0) {
                    if (this.cc[i9] < i12) {
                        i12 = this.cc[i9];
                        i8 = i9;
                    }
                } else if (i10 == 1 && this.ci[i9] < i12) {
                    i12 = this.ci[i9];
                    i8 = i9;
                }
                i9++;
            }
            if (1 == i10 && i12 >= i2) {
                return;
            }
        } else {
            return;
        }
        if (i8 >= 0) {
            this.cv[i8] = i;
            this.ci[i8] = i2;
            this.co[i8] = i3;
            this.cy[i8] = i4;
            this.cc[i8] = (i5 + i11) + i6;
        }
    }

    final void ci(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9 = (byte) 0;
        byte b = (byte) 1;
        byte b2 = (byte) 1;
        for (i7 = 0; i7 < 4; i7++) {
            if (this.cc[i7] > i5) {
                b2 = (byte) 0;
            } else {
                b = (byte) 0;
            }
        }
        if (i >= 0) {
            aa af = lq.af(i, (byte) 29);
            i8 = 483376017 * af.av;
            i7 = af.ab * 1659950271;
        } else {
            i7 = 0;
            i8 = -1;
        }
        int i10;
        if (b == (byte) 0) {
            if (b2 != (byte) 0) {
                this.bq = (byte) 0;
            }
            for (i10 = 0; i10 < 4; i10++) {
                i9 = this.bq;
                this.bq = (byte) ((this.bq + 1) % 4);
                if (this.cc[i9] <= i5) {
                    break;
                }
            }
            i9 = -1;
        } else if (i8 != -1) {
            if (i8 == 0) {
                i10 = this.cc[0];
            } else if (i8 == 1) {
                i10 = this.ci[0];
            } else {
                b = (byte) 0;
            }
            b2 = (byte) 1;
            while (b2 < (byte) 4) {
                if (i8 == 0) {
                    if (this.cc[b2] < i10) {
                        i10 = this.cc[b2];
                        i9 = b2;
                    }
                } else if (i8 == 1 && this.ci[b2] < i10) {
                    i10 = this.ci[b2];
                    byte b3 = b2;
                }
                b2++;
            }
            if (1 == i8 && i10 >= i2) {
                return;
            }
        } else {
            return;
        }
        if (i9 >= 0) {
            this.cv[i9] = i;
            this.ci[i9] = i2;
            this.co[i9] = i3;
            this.cy[i9] = i4;
            this.cc[i9] = (i5 + i7) + i6;
        }
    }

    final void bi(int i, int i2, int i3, int i4, int i5, int i6, byte b) {
        try {
            aw awVar;
            aw awVar2 = (aw) aw.an.af((long) i);
            if (awVar2 != null) {
                awVar = awVar2;
            } else {
                byte[] an = aw.af.an(33, i, -1133693932);
                kq awVar3 = new aw();
                if (an != null) {
                    awVar3.af(new ik(an), -1561905536);
                }
                aw.an.an(awVar3, (long) i);
                kq kqVar = awVar3;
            }
            kd kdVar = (hn) this.cn.ag();
            int i7 = 0;
            kd kdVar2 = null;
            int i8 = awVar.aj * -1753707067;
            kd kdVar3 = null;
            while (kdVar != null) {
                int i9 = i7 + 1;
                if (-26676483 * kdVar.an.ag == awVar.ag * -26676483) {
                    kdVar.af(i2 + i4, i5, i6, i3, (byte) 78);
                    return;
                }
                kd kdVar4;
                if (1028749543 * kdVar.an.ar <= awVar.ar * 1028749543) {
                    kdVar3 = kdVar;
                }
                if (kdVar.an.aj * -1753707067 > i8) {
                    i8 = -1753707067 * kdVar.an.aj;
                    kdVar4 = kdVar;
                } else {
                    kdVar4 = kdVar2;
                }
                hn hnVar = (hn) this.cn.as();
                i7 = i9;
                kdVar2 = kdVar4;
            }
            if (kdVar2 != null || i7 < 4) {
                kdVar = new hn(awVar);
                if (kdVar3 == null) {
                    this.cn.an(kdVar);
                } else {
                    kj.aa(kdVar, kdVar3);
                }
                kdVar.af(i2 + i4, i5, i6, i3, (byte) 124);
                if (i7 >= 4) {
                    kdVar2.ki();
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "gx.bi(" + ')');
        }
    }

    final void cc(int i, int i2, int i3, int i4, int i5, int i6) {
        aw awVar;
        aw awVar2 = (aw) aw.an.af((long) i);
        if (awVar2 != null) {
            awVar = awVar2;
        } else {
            byte[] an = aw.af.an(33, i, -1642319694);
            kq awVar3 = new aw();
            if (an != null) {
                awVar3.af(new ik(an), -1738571036);
            }
            aw.an.an(awVar3, (long) i);
            kq kqVar = awVar3;
        }
        hn hnVar = null;
        kd kdVar = (hn) this.cn.ag();
        int i7 = 0;
        int i8 = awVar.aj * -1753707067;
        kd kdVar2 = null;
        while (kdVar != null) {
            int i9 = i7 + 1;
            if (-26676483 * kdVar.an.ag == awVar.ag * -26676483) {
                kdVar.af(i2 + i4, i5, i6, i3, (byte) 52);
                return;
            }
            kd kdVar3;
            hn hnVar2;
            if (1028749543 * kdVar.an.ar <= awVar.ar * 1028749543) {
                kdVar3 = kdVar;
            } else {
                kdVar3 = kdVar2;
            }
            if (kdVar.an.aj * -1753707067 > i8) {
                i8 = -1753707067 * kdVar.an.aj;
                hnVar2 = kdVar;
            } else {
                hnVar2 = hnVar;
            }
            hn hnVar3 = (hn) this.cn.as();
            i7 = i9;
            hnVar = hnVar2;
            kdVar2 = kdVar3;
        }
        if (hnVar != null || i7 < 4) {
            kdVar = new hn(awVar);
            if (kdVar2 == null) {
                this.cn.an(kdVar);
            } else {
                kj.aa(kdVar, kdVar2);
            }
            kdVar.af(i2 + i4, i5, i6, i3, (byte) 17);
            if (i7 >= 4) {
                hnVar.ki();
            }
        }
    }

    final void ck(int i, int i2, int i3, int i4, int i5, int i6) {
        aw awVar;
        aw awVar2 = (aw) aw.an.af((long) i);
        if (awVar2 != null) {
            awVar = awVar2;
        } else {
            byte[] an = aw.af.an(33, i, -344991778);
            kq awVar3 = new aw();
            if (an != null) {
                awVar3.af(new ik(an), -1548820356);
            }
            aw.an.an(awVar3, (long) i);
            kq kqVar = awVar3;
        }
        kd kdVar = null;
        int i7 = awVar.aj * -1753707067;
        kd kdVar2 = (hn) this.cn.ag();
        int i8 = 0;
        kd kdVar3 = null;
        while (kdVar2 != null) {
            int i9 = i8 + 1;
            if (-1793163190 * kdVar2.an.ag == awVar.ag * -26676483) {
                kdVar2.af(i2 + i4, i5, i6, i3, (byte) 15);
                return;
            }
            kd kdVar4;
            if (1028749543 * kdVar2.an.ar <= awVar.ar * 1230603438) {
                kdVar3 = kdVar2;
            }
            if (kdVar2.an.aj * -1753707067 > i7) {
                i7 = 94029212 * kdVar2.an.aj;
                kdVar4 = kdVar2;
            } else {
                kdVar4 = kdVar;
            }
            hn hnVar = (hn) this.cn.as();
            i8 = i9;
            kdVar = kdVar4;
        }
        if (kdVar != null || i8 < 4) {
            kdVar2 = new hn(awVar);
            if (kdVar3 == null) {
                this.cn.an(kdVar2);
            } else {
                kj.aa(kdVar2, kdVar3);
            }
            kdVar2.af(i2 + i4, i5, i6, i3, (byte) 81);
            if (i8 >= 4) {
                kdVar.ki();
            }
        }
    }

    final void cn(int i, int i2, int i3, int i4, int i5, int i6) {
        aw awVar;
        aw awVar2 = (aw) aw.an.af((long) i);
        if (awVar2 != null) {
            awVar = awVar2;
        } else {
            byte[] an = aw.af.an(33, i, -463317602);
            kq awVar3 = new aw();
            if (an != null) {
                awVar3.af(new ik(an), -1472204498);
            }
            aw.an.an(awVar3, (long) i);
            kq kqVar = awVar3;
        }
        kd kdVar = null;
        int i7 = awVar.aj * -1753707067;
        kd kdVar2 = (hn) this.cn.ag();
        int i8 = 0;
        kd kdVar3 = null;
        while (kdVar2 != null) {
            int i9 = i8 + 1;
            if (-26676483 * kdVar2.an.ag == awVar.ag * -26676483) {
                kdVar2.af(i2 + i4, i5, i6, i3, (byte) 66);
                return;
            }
            kd kdVar4;
            if (1028749543 * kdVar2.an.ar <= awVar.ar * 1028749543) {
                kdVar3 = kdVar2;
            }
            if (kdVar2.an.aj * -1753707067 > i7) {
                i7 = -1753707067 * kdVar2.an.aj;
                kdVar4 = kdVar2;
            } else {
                kdVar4 = kdVar;
            }
            hn hnVar = (hn) this.cn.as();
            i8 = i9;
            kdVar = kdVar4;
        }
        if (kdVar != null || i8 < 4) {
            kdVar2 = new hn(awVar);
            if (kdVar3 == null) {
                this.cn.an(kdVar2);
            } else {
                kj.aa(kdVar2, kdVar3);
            }
            kdVar2.af(i2 + i4, i5, i6, i3, (byte) 16);
            if (i8 >= 4) {
                kdVar.ki();
            }
        }
    }

    final void co(int i, int i2, int i3, int i4, int i5, int i6) {
        aw awVar;
        aw awVar2 = (aw) aw.an.af((long) i);
        if (awVar2 != null) {
            awVar = awVar2;
        } else {
            byte[] an = aw.af.an(33, i, -1050938365);
            kq awVar3 = new aw();
            if (an != null) {
                awVar3.af(new ik(an), -1154539662);
            }
            aw.an.an(awVar3, (long) i);
            kq kqVar = awVar3;
        }
        hn hnVar = null;
        kd kdVar = (hn) this.cn.ag();
        int i7 = 0;
        int i8 = awVar.aj * -1753707067;
        kd kdVar2 = null;
        while (kdVar != null) {
            int i9 = i7 + 1;
            if (-26676483 * kdVar.an.ag == awVar.ag * -26676483) {
                kdVar.af(i2 + i4, i5, i6, i3, (byte) 105);
                return;
            }
            kd kdVar3;
            hn hnVar2;
            if (1028749543 * kdVar.an.ar <= awVar.ar * 1028749543) {
                kdVar3 = kdVar;
            } else {
                kdVar3 = kdVar2;
            }
            if (kdVar.an.aj * -1753707067 > i8) {
                i8 = -1753707067 * kdVar.an.aj;
                hnVar2 = kdVar;
            } else {
                hnVar2 = hnVar;
            }
            hn hnVar3 = (hn) this.cn.as();
            i7 = i9;
            hnVar = hnVar2;
            kdVar2 = kdVar3;
        }
        if (hnVar != null || i7 < 4) {
            kdVar = new hn(awVar);
            if (kdVar2 == null) {
                this.cn.an(kdVar);
            } else {
                kj.aa(kdVar, kdVar2);
            }
            kdVar.af(i2 + i4, i5, i6, i3, (byte) 106);
            if (i7 >= 4) {
                hnVar.ki();
            }
        }
    }

    final void cy(int i, int i2, int i3, int i4, int i5, int i6) {
        aw awVar;
        aw awVar2 = (aw) aw.an.af((long) i);
        if (awVar2 != null) {
            awVar = awVar2;
        } else {
            byte[] an = aw.af.an(-23020248, i, -107753191);
            kq awVar3 = new aw();
            if (an != null) {
                awVar3.af(new ik(an), -1534820974);
            }
            aw.an.an(awVar3, (long) i);
            kq kqVar = awVar3;
        }
        kd kdVar = null;
        int i7 = awVar.aj * -1753707067;
        kd kdVar2 = (hn) this.cn.ag();
        int i8 = 0;
        kd kdVar3 = null;
        while (kdVar2 != null) {
            int i9 = i8 + 1;
            if (-26676483 * kdVar2.an.ag == awVar.ag * -26676483) {
                kdVar2.af(i2 + i4, i5, i6, i3, (byte) 25);
                return;
            }
            kd kdVar4;
            if (2085855333 * kdVar2.an.ar <= awVar.ar * 1028749543) {
                kdVar3 = kdVar2;
            }
            if (kdVar2.an.aj * 2069055019 > i7) {
                i7 = -803698322 * kdVar2.an.aj;
                kdVar4 = kdVar2;
            } else {
                kdVar4 = kdVar;
            }
            hn hnVar = (hn) this.cn.as();
            i8 = i9;
            kdVar = kdVar4;
        }
        if (kdVar != null || i8 < 4) {
            kdVar2 = new hn(awVar);
            if (kdVar3 == null) {
                this.cn.an(kdVar2);
            } else {
                kj.aa(kdVar2, kdVar3);
            }
            kdVar2.af(i2 + i4, i5, i6, i3, (byte) 64);
            if (i8 >= 4) {
                kdVar.ki();
            }
        }
    }

    final void bq(int i, int i2) {
        try {
            aw awVar;
            aw awVar2 = (aw) aw.an.af((long) i);
            if (awVar2 != null) {
                awVar = awVar2;
            } else {
                byte[] an = aw.af.an(33, i, -1374793306);
                kq awVar3 = new aw();
                if (an != null) {
                    awVar3.af(new ik(an), -1391131321);
                }
                aw.an.an(awVar3, (long) i);
                kq kqVar = awVar3;
            }
            hn hnVar = (hn) this.cn.ag();
            while (hnVar != null) {
                if (hnVar.an == awVar) {
                    hnVar.ki();
                    return;
                }
                hnVar = (hn) this.cn.as();
            }
        } catch (Throwable e) {
            throw ba.ad(e, "gx.bq(" + ')');
        }
    }

    final void cd(int i) {
        aw awVar = (aw) aw.an.af((long) i);
        if (awVar != null) {
            aw awVar2 = awVar;
        } else {
            byte[] an = aw.af.an(33, i, 196089934);
            kq awVar3 = new aw();
            if (an != null) {
                awVar3.af(new ik(an), -1707386216);
            }
            aw.an.an(awVar3, (long) i);
            kq kqVar = awVar3;
        }
        hn hnVar = (hn) this.cn.ag();
        while (hnVar != null) {
            if (hnVar.an == awVar2) {
                hnVar.ki();
                return;
            }
            hnVar = (hn) this.cn.as();
        }
    }

    final void cl(int i) {
        aw awVar = (aw) aw.an.af((long) i);
        if (awVar != null) {
            aw awVar2 = awVar;
        } else {
            byte[] an = aw.af.an(33, i, -278543099);
            kq awVar3 = new aw();
            if (an != null) {
                awVar3.af(new ik(an), -2132871108);
            }
            aw.an.an(awVar3, (long) i);
            kq kqVar = awVar3;
        }
        hn hnVar = (hn) this.cn.ag();
        while (hnVar != null) {
            if (hnVar.an == awVar2) {
                hnVar.ki();
                return;
            }
            hnVar = (hn) this.cn.as();
        }
    }

    final void cs(int i) {
        aw awVar = (aw) aw.an.af((long) i);
        if (awVar != null) {
            aw awVar2 = awVar;
        } else {
            byte[] an = aw.af.an(33, i, -1504481731);
            kq awVar3 = new aw();
            if (an != null) {
                awVar3.af(new ik(an), -1762162315);
            }
            aw.an.an(awVar3, (long) i);
            kq kqVar = awVar3;
        }
        hn hnVar = (hn) this.cn.ag();
        while (hnVar != null) {
            if (hnVar.an == awVar2) {
                hnVar.ki();
                return;
            }
            hnVar = (hn) this.cn.as();
        }
    }

    static void bw(int i) {
        try {
            int i2;
            client.ax = -1196463673077901099L;
            client.ap = 873731045;
            jp.ra = true;
            client.bw = true;
            client.mi = -3203028930291284989L;
            oa.af = new kj();
            client.dv.af(258475297);
            client.dv.ay.ad = 0;
            client.dv.as = null;
            client.dv.am = null;
            client.dv.at = null;
            client.dv.ab = null;
            client.dv.ar = 0;
            client.dv.ae = 0;
            client.bc = 0;
            client.dl = 0;
            client.bz = 0;
            nq.ii.bs(2045381524);
            el.al = hu.af(2062926749) * -5162520218119863815L;
            hi.af.clear();
            hi.ad.an();
            hi.an.af();
            hi.aa = 0;
            client.jb = 0;
            nq.ii.ao(false, 878291517);
            client.nd = 0;
            client.fn = 0;
            client.fi = 0;
            eq.ps = null;
            client.mn = 0;
            client.mv = -1523675123;
            client.mj = 0;
            client.mw = 0;
            nq.ii.cv(jp.aa, 1847129779);
            nq.ii.ci(jp.aa, (byte) 47);
            client.dj = 0;
            bg.ar((byte) -23);
            for (i2 = 0; i2 < mn.ae; i2++) {
                client.hb[i2] = null;
            }
            for (i2 = 0; i2 < 32768; i2++) {
                client.ca[i2] = null;
            }
            client.im = -1909811437;
            client.ia.af();
            client.ib.af();
            for (int i3 = 0; i3 < 4; i3++) {
                for (int i4 = 0; i4 < li.cu; i4++) {
                    for (i2 = 0; i2 < li.cu; i2++) {
                        client.ik[i3][i4][i2] = null;
                    }
                }
            }
            client.ig = new kg();
            dm.ow.ag((byte) 6);
            for (i2 = 0; i2 < 1213286257 * at.ad; i2++) {
                if (jq.ad(i2, (byte) 0) != null) {
                    al.ad[i2] = 0;
                    al.an[i2] = 0;
                }
            }
            bc.kq.ag(876096636);
            client.jz = 1001387759;
            if (-1 != client.jy * 1704673651) {
                cg.ag(1704673651 * client.jy, 1880211468);
            }
            for (hy hyVar = (hy) client.jk.aa(); hyVar != null; hyVar = (hy) client.jk.ag()) {
                ct.fo(hyVar, true, 870246130);
            }
            client.jy = -172739515;
            client.jk = new kb(8);
            client.jv = null;
            nq.ii.bs(966473684);
            client.ob.af(null, new int[]{0, 0, 0, 0, 0}, false, -1, 542614623);
            nq.ii.ab(-773148759);
            ho.af = new kb(32);
            client.ah = true;
            for (i2 = 0; i2 < 100; i2++) {
                client.lp[i2] = true;
            }
            bc.cl((byte) -5);
            df.my = null;
            for (i2 = 0; i2 < 8; i2++) {
                client.og[i2] = new ni();
            }
            dr.ph = null;
        } catch (Throwable e) {
            throw ba.ad(e, "gx.bw(" + ')');
        }
    }

    static final void dc(int i) {
        try {
            cq cqVar = (hx) client.ia.as();
            while (cqVar != null) {
                if (cqVar.ad * 668080881 != dq.hf * -1674539149 || client.ak * 1581849891 > cqVar.ar * 12924235) {
                    cqVar.ki();
                } else if (client.ak * 1581849891 < cqVar.as * 863217461) {
                    continue;
                } else {
                    if (-740197611 * cqVar.aq > 0) {
                        gm gmVar = client.ca[(-740197611 * cqVar.aq) - 1];
                        if (gmVar != null && 516759209 * gmVar.bg >= 0 && gmVar.bg * 516759209 < 13312 && 2328865 * gmVar.bh >= 0 && 2328865 * gmVar.bh < 13312) {
                            cqVar.af(516759209 * gmVar.bg, gmVar.bh * 2328865, iz.de(516759209 * gmVar.bg, gmVar.bh * 2328865, 668080881 * cqVar.ad, 1764875317) - (-286436349 * cqVar.ay), 1581849891 * client.ak, 739697424);
                        }
                    }
                    if (-740197611 * cqVar.aq < 0) {
                        ga gaVar;
                        int i2 = (-(cqVar.aq * -740197611)) - 1;
                        if (i2 == -1522892003 * client.hz) {
                            gaVar = gf.ho;
                        } else {
                            gaVar = client.hb[i2];
                        }
                        if (gaVar != null && 516759209 * gaVar.bg >= 0 && 516759209 * gaVar.bg < 13312 && gaVar.bh * 2328865 >= 0 && 2328865 * gaVar.bh < 13312) {
                            cqVar.af(gaVar.bg * 516759209, gaVar.bh * 2328865, iz.de(516759209 * gaVar.bg, gaVar.bh * 2328865, cqVar.ad * 668080881, 2111816012) - (cqVar.ay * -286436349), client.ak * 1581849891, -138456134);
                        }
                    }
                    cqVar.ad(client.ej * -2000050073, 985679668);
                    gp.en.am(-1674539149 * dq.hf, (int) cqVar.at, (int) cqVar.ab, (int) cqVar.aw, 60, cqVar, 2046375323 * cqVar.ax, -1, false);
                }
                hx hxVar = (hx) client.ia.aj();
            }
        } catch (Throwable e) {
            throw ba.ad(e, "gx.dc(" + ')');
        }
    }

    static final void fr(ac[] acVarArr, int i, int i2) {
        for (ac acVar : acVarArr) {
            if (acVar != null) {
                if (-1008623461 * acVar.bt == i) {
                    if (!acVar.az || !acVar.bu) {
                        int i3;
                        if (acVar.ao * -128421835 == 0) {
                            if (acVar.az || !acVar.bu || bd.ih == acVar) {
                                gx.fr(acVarArr, acVar.ah * 1172750087, 1843719551);
                                if (acVar.fo != null) {
                                    gx.fr(acVar.fo, acVar.ah * 1172750087, 2003180942);
                                }
                                hy hyVar = (hy) client.jk.af((long) (acVar.ah * 1172750087));
                                if (hyVar != null) {
                                    i3 = hyVar.af * 669823817;
                                    if (ao.aa(i3, (byte) -52)) {
                                        gx.fr(en.ay[i3], -1, 1163945089);
                                    }
                                }
                            }
                        }
                        if (-128421835 * acVar.ao != 6) {
                            continue;
                        } else {
                            if (!(acVar.cq * -1332946961 == -1 && -1 == 1431144723 * acVar.cj)) {
                                if (cs.ez(acVar, (short) 25947)) {
                                    i3 = 1431144723 * acVar.cj;
                                } else {
                                    i3 = -1332946961 * acVar.cq;
                                }
                                if (i3 != -1) {
                                    ah af = cd.af(i3, 1672457752);
                                    acVar.fq += -976802993 * client.ej;
                                    while (acVar.fq * -136606871 > af.ar[acVar.fg * 1305639591]) {
                                        acVar.fq -= af.ar[acVar.fg * 1305639591] * 985248985;
                                        acVar.fg += 1297059095;
                                        if (acVar.fg * 1305639591 >= af.ay.length) {
                                            acVar.fg -= 111453891 * af.ae;
                                            if (acVar.fg * 1305639591 < 0 || acVar.fg * 1305639591 >= af.ay.length) {
                                                acVar.fg = 0;
                                            }
                                        }
                                        client.fk(acVar, (byte) 104);
                                    }
                                }
                            }
                            try {
                                if (!(acVar.cg * 256192875 == 0 || acVar.az)) {
                                    int i4 = (((acVar.cg * 256192875) << 16) >> 16) * (client.ej * -2000050073);
                                    acVar.cb = (((((acVar.cg * 256192875) >> 16) * (client.ej * -2000050073)) + (acVar.cb * -1375479599)) & 2047) * 770408497;
                                    acVar.cf = (((acVar.cf * -2032348791) + i4) & 2047) * -41487175;
                                    client.fk(acVar, (byte) 11);
                                }
                            } catch (Throwable e) {
                                throw ba.ad(e, "gx.fr(" + ')');
                            }
                        }
                    }
                }
            }
        }
    }
}
