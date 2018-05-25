package p000;

public class ez extends et {
    public static np am;
    static kh bi;
    public int ag;
    public int as;
    public int ay;

    ez() {
        try {
            this.ag = -1820808767;
        } catch (Throwable e) {
            throw ba.ad(e, "ez.<init>(" + ')');
        }
    }

    void ba(int i, int i2) {
        this.ag = 1820808767 * i;
        this.ay = 1327442639 * i2;
    }

    void bk(int i, int i2, int i3) {
        try {
            this.ag = 1820808767 * i;
            this.ay = 1327442639 * i2;
        } catch (Throwable e) {
            throw ba.ad(e, "ez.bk(" + ')');
        }
    }

    void bl(int i, int i2) {
        this.ag = -1433080456 * i;
        this.ay = 1327442639 * i2;
    }

    public int bd() {
        return -1161455169 * this.ag;
    }

    public int bm() {
        return -1161455169 * this.ag;
    }

    public int br() {
        return -1161455169 * this.ag;
    }

    public int bs() {
        return 1010622186 * this.ag;
    }

    public int by(byte b) {
        try {
            return -1161455169 * this.ag;
        } catch (Throwable e) {
            throw ba.ad(e, "ez.by(" + ')');
        }
    }

    public boolean bi() {
        return this.ag * -1161455169 > 0;
    }

    public boolean bj() {
        return this.ag * -410670724 > 0;
    }

    public boolean bn(int i) {
        try {
            return this.ag * -1161455169 > 0;
        } catch (Throwable e) {
            throw ba.ad(e, "ez.bn(" + ')');
        }
    }

    static void an(int i, int i2, int i3, int i4, int i5) {
        try {
            ho hoVar;
            ho hoVar2 = (ho) ho.af.af((long) i);
            if (hoVar2 == null) {
                kd hoVar3 = new ho();
                ho.af.ad(hoVar3, (long) i);
                hoVar = hoVar3;
            } else {
                hoVar = hoVar2;
            }
            if (hoVar.ad.length <= i2) {
                int i6;
                int[] iArr = new int[(i2 + 1)];
                int[] iArr2 = new int[(i2 + 1)];
                for (i6 = 0; i6 < hoVar.ad.length; i6++) {
                    iArr[i6] = hoVar.ad[i6];
                    iArr2[i6] = hoVar.an[i6];
                }
                for (i6 = hoVar.ad.length; i6 < i2; i6++) {
                    iArr[i6] = -1;
                    iArr2[i6] = 0;
                }
                hoVar.ad = iArr;
                hoVar.an = iArr2;
            }
            hoVar.ad[i2] = i3;
            hoVar.an[i2] = i4;
        } catch (Throwable e) {
            throw ba.ad(e, "ez.an(" + ')');
        }
    }

    public static fx[] ae(kf kfVar, int i, byte b) {
        try {
            return !C0001do.az(kfVar, i, (byte) -94) ? null : bd.ab(1460694999);
        } catch (Throwable e) {
            throw ba.ad(e, "ez.ae(" + ')');
        }
    }

    static final void df(boolean z, ia iaVar, byte b) {
        try {
            int i;
            int i2;
            client.id = 0;
            client.dk = 0;
            ia iaVar2 = client.dv.ay;
            iaVar2.jw(1565299499);
            int kf = iaVar2.kf(8, (byte) -3);
            if (kf < 453104899 * client.dj) {
                for (i = kf; i < client.dj * 453104899; i++) {
                    int[] iArr = client.in;
                    i2 = client.id + 549087301;
                    client.id = i2;
                    iArr[(i2 * -402101619) - 1] = client.dc[i];
                }
            }
            if (kf > 453104899 * client.dj) {
                throw new RuntimeException("");
            }
            int i3;
            int kf2;
            int[] iArr2;
            int kf3;
            client.dj = 0;
            for (i = 0; i < kf; i++) {
                i3 = client.dc[i];
                gm gmVar = client.ca[i3];
                int[] iArr3;
                int i4;
                if (iaVar2.kf(1, (byte) -123) == 0) {
                    iArr3 = client.dc;
                    i4 = client.dj - 1235796565;
                    client.dj = i4;
                    iArr3[(i4 * 453104899) - 1] = i3;
                    gmVar.do = -92345463 * client.ak;
                } else {
                    kf2 = iaVar2.kf(2, (byte) -47);
                    if (kf2 == 0) {
                        iArr3 = client.dc;
                        i4 = client.dj - 1235796565;
                        client.dj = i4;
                        iArr3[(i4 * 453104899) - 1] = i3;
                        gmVar.do = -92345463 * client.ak;
                        iArr2 = client.f1do;
                        kf2 = client.dk + 757154825;
                        client.dk = kf2;
                        iArr2[(kf2 * -967603655) - 1] = i3;
                    } else if (1 == kf2) {
                        iArr3 = client.dc;
                        i4 = client.dj - 1235796565;
                        client.dj = i4;
                        iArr3[(i4 * 453104899) - 1] = i3;
                        gmVar.do = client.ak * -92345463;
                        gmVar.af(iaVar2.kf(3, (byte) -36), (byte) 1, (byte) -121);
                        if (1 == iaVar2.kf(1, (byte) -5)) {
                            iArr2 = client.f1do;
                            kf2 = client.dk + 757154825;
                            client.dk = kf2;
                            iArr2[(kf2 * -967603655) - 1] = i3;
                        }
                    } else if (kf2 == 2) {
                        iArr3 = client.dc;
                        i4 = client.dj - 1235796565;
                        client.dj = i4;
                        iArr3[(i4 * 453104899) - 1] = i3;
                        gmVar.do = -92345463 * client.ak;
                        gmVar.af(iaVar2.kf(3, (byte) -72), (byte) 2, (byte) -112);
                        gmVar.af(iaVar2.kf(3, (byte) -50), (byte) 2, (byte) -100);
                        if (iaVar2.kf(1, (byte) -82) == 1) {
                            iArr2 = client.f1do;
                            kf2 = client.dk + 757154825;
                            client.dk = kf2;
                            iArr2[(kf2 * -967603655) - 1] = i3;
                        }
                    } else if (kf2 == 3) {
                        iArr2 = client.in;
                        kf2 = client.id + 549087301;
                        client.id = kf2;
                        iArr2[(kf2 * -402101619) - 1] = i3;
                    }
                }
            }
            while (iaVar.kc(client.dv.ar * 414296057, (byte) 1) >= 27) {
                kf3 = iaVar.kf(15, (byte) -50);
                if (kf3 == 32767) {
                    break;
                }
                boolean z2;
                Object obj = null;
                if (client.ca[kf3] == null) {
                    client.ca[kf3] = new gm();
                    obj = 1;
                }
                gm gmVar2 = client.ca[kf3];
                int[] iArr4 = client.dc;
                i2 = client.dj - 1235796565;
                client.dj = i2;
                iArr4[(i2 * 453104899) - 1] = kf3;
                gmVar2.do = client.ak * -92345463;
                if (z) {
                    kf = iaVar.kf(8, (byte) -118);
                    if (kf > 127) {
                        kf -= 256;
                    }
                } else {
                    kf = iaVar.kf(5, (byte) -124);
                    if (kf > 15) {
                        kf -= 32;
                    }
                }
                if (iaVar.kf(1, (byte) -30) == 1) {
                    iArr2 = client.f1do;
                    kf2 = client.dk + 757154825;
                    client.dk = kf2;
                    iArr2[(kf2 * -967603655) - 1] = kf3;
                }
                kf3 = client.ic[iaVar.kf(3, (byte) -73)];
                if (obj != null) {
                    i = 1955545995 * kf3;
                    gmVar2.bf = i;
                    gmVar2.dz = i * -1314677501;
                }
                kf3 = iaVar.kf(1, (byte) -45);
                if (z) {
                    i = iaVar.kf(8, (byte) -71);
                    if (i > 127) {
                        i -= 256;
                    }
                } else {
                    i = iaVar.kf(5, (byte) -60);
                    if (i > 15) {
                        i -= 32;
                    }
                }
                gmVar2.af = ie.ad(iaVar.kf(14, (byte) -19), (byte) 77);
                gmVar2.bv = 1197001545 * gmVar2.af.as;
                gmVar2.dd = -448214397 * gmVar2.af.bz;
                if (gmVar2.dd * 1791262809 == 0) {
                    gmVar2.bf = 0;
                }
                gmVar2.be = -1666788173 * gmVar2.af.at;
                gmVar2.bk = gmVar2.af.ab * -1858657423;
                gmVar2.by = -1864285277 * gmVar2.af.aw;
                gmVar2.bn = gmVar2.af.ai * 1276211489;
                gmVar2.bx = 351400791 * gmVar2.af.ae;
                gmVar2.bt = 199040615 * gmVar2.af.aq;
                gmVar2.bu = gmVar2.af.am * 1383034215;
                kf += gf.ho.di[0];
                i2 = gf.ho.da[0] + i;
                if (kf3 == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                gmVar2.ad(kf, i2, z2, (short) -19936);
            }
            iaVar.kh(1885733558);
            for (int i5 = 0; i5 < -967603655 * client.dk; i5++) {
                gm gmVar3 = client.ca[client.f1do[i5]];
                int ao = iaVar.ao((byte) 0);
                if ((ao & 2) != 0) {
                    gmVar3.ck = iaVar.cn(807792926) * 1968525927;
                    if (65535 == -609375913 * gmVar3.ck) {
                        gmVar3.ck = -1968525927;
                    }
                }
                if ((ao & 32) != 0) {
                    int i6;
                    int br = iaVar.br(2127339229);
                    if (br > 0) {
                        for (i6 = 0; i6 < br; i6++) {
                            i3 = -1;
                            kf3 = -1;
                            i2 = -1;
                            kf = iaVar.bf((byte) 87);
                            if (kf == 32767) {
                                kf = iaVar.bf((byte) 3);
                                kf3 = iaVar.bf((byte) 25);
                                i3 = iaVar.bf((byte) 67);
                                i2 = iaVar.bf((byte) 21);
                            } else if (kf != 32766) {
                                kf3 = iaVar.bf((byte) 109);
                            } else {
                                kf = -1;
                            }
                            gmVar3.bj(kf, kf3, i3, i2, 1581849891 * client.ak, iaVar.bf((byte) 113), -1380243778);
                        }
                    }
                    br = iaVar.bi(-1999743292);
                    if (br > 0) {
                        for (i6 = 0; i6 < br; i6++) {
                            kf = iaVar.bf((byte) 64);
                            i3 = iaVar.bf((byte) 95);
                            if (32767 != i3) {
                                i2 = iaVar.bf((byte) 122);
                                kf2 = iaVar.bi(-595784155);
                                gmVar3.bi(kf, 1581849891 * client.ak, i3, i2, kf2, i3 > 0 ? iaVar.bi(-835952025) : kf2, (byte) 0);
                            } else {
                                gmVar3.bq(kf, 2066656122);
                            }
                        }
                    }
                }
                if ((ao & 8) != 0) {
                    kf = (gmVar3.bg * 516759209) - (((iaVar.au(1752567216) - (bq.du * 1407993063)) - (bq.du * 1407993063)) * 64);
                    kf3 = (gmVar3.bh * 2328865) - (((iaVar.cn(887752143) - (gl.dp * 1289967967)) - (1289967967 * gl.dp)) * 64);
                    if (!(kf == 0 && kf3 == 0)) {
                        gmVar3.cs = (((int) (Math.atan2((double) kf, (double) kf3) * 325.949d)) & 2047) * 464408867;
                    }
                }
                if ((ao & 16) != 0) {
                    gmVar3.cf = iaVar.au(2020122778) * -2015474731;
                    kf = iaVar.cb((byte) -94);
                    gmVar3.cg = (kf >> 16) * -2073088321;
                    gmVar3.ce = ((kf & 65535) + (1581849891 * client.ak)) * 243104753;
                    gmVar3.cz = 0;
                    gmVar3.cr = 0;
                    if (645928209 * gmVar3.ce > client.ak * 1581849891) {
                        gmVar3.cz = 367216679;
                    }
                    if (65535 == gmVar3.cf * 269129085) {
                        gmVar3.cf = 2015474731;
                    }
                }
                if ((ao & 4) != 0) {
                    kf = iaVar.cy(-1005835619);
                    if (65535 == kf) {
                        kf = -1;
                    }
                    kf3 = iaVar.br(1359628204);
                    if (kf == 1462124603 * gmVar3.cq && -1 != kf) {
                        kf = cd.af(kf, 1878937083).ak * 493411451;
                        if (1 == kf) {
                            gmVar3.cj = 0;
                            gmVar3.cp = 0;
                            gmVar3.ct = kf3 * -464504529;
                            gmVar3.cb = 0;
                        }
                        if (2 == kf) {
                            gmVar3.cb = 0;
                        }
                    } else if (-1 == kf || gmVar3.cq * 1462124603 == -1 || cd.af(kf, 625958175).at * -2086360965 >= cd.af(1462124603 * gmVar3.cq, 2119992516).at * -2086360965) {
                        gmVar3.cq = kf * -2033542925;
                        gmVar3.cj = 0;
                        gmVar3.cp = 0;
                        gmVar3.ct = -464504529 * kf3;
                        gmVar3.cb = 0;
                        gmVar3.dw = -709529395 * gmVar3.dl;
                    }
                }
                if ((ao & 64) != 0) {
                    gmVar3.af = ie.ad(iaVar.au(-257789126), (byte) 100);
                    gmVar3.bv = gmVar3.af.as * 1197001545;
                    gmVar3.dd = gmVar3.af.bz * -448214397;
                    gmVar3.be = -1666788173 * gmVar3.af.at;
                    gmVar3.bk = gmVar3.af.ab * -1858657423;
                    gmVar3.by = gmVar3.af.aw * -1864285277;
                    gmVar3.bn = 1276211489 * gmVar3.af.ai;
                    gmVar3.bx = gmVar3.af.ae * 351400791;
                    gmVar3.bt = gmVar3.af.aq * 199040615;
                    gmVar3.bu = gmVar3.af.am * 1383034215;
                }
                if ((ao & 1) != 0) {
                    gmVar3.bl = iaVar.bc(1434564143);
                    gmVar3.bm = -206649612;
                }
            }
            for (i = 0; i < -402101619 * client.id; i++) {
                kf = client.in[i];
                if (client.ca[kf].do * -449430453 != 1581849891 * client.ak) {
                    client.ca[kf].af = null;
                    client.ca[kf] = null;
                }
            }
            if (414296057 * client.dv.ar != iaVar.ad * 1978945739) {
                throw new RuntimeException((iaVar.ad * 1978945739) + ha.ad + (414296057 * client.dv.ar));
            }
            for (i = 0; i < client.dj * 453104899; i++) {
                if (client.ca[client.dc[i]] == null) {
                    throw new RuntimeException(i + ha.ad + (453104899 * client.dj));
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "ez.df(" + ')');
        }
    }
}
