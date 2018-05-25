package p000;

public class em extends ea {
    public static final int ai = 32;
    public static final int cl = 83;
    static final int de = 300;
    int ae;
    final nv aj;
    public kx aq;

    public em(nv nvVar) {
        try {
            super(400);
            this.ae = -1929399585;
            this.aq = new kx();
            this.aj = nvVar;
        } catch (Throwable e) {
            throw ba.ad(e, "em.<init>(" + ')');
        }
    }

    et ao(byte b) {
        try {
            return new ei();
        } catch (Throwable e) {
            throw ba.ad(e, "em.ao(" + ')');
        }
    }

    et cd() {
        return new ei();
    }

    et ch() {
        return new ei();
    }

    et[] ax(int i, int i2) {
        try {
            return new ei[i];
        } catch (Throwable e) {
            throw ba.ad(e, "em.ax(" + ')');
        }
    }

    et[] cj(int i) {
        return new ei[i];
    }

    et[] cm(int i) {
        return new ei[i];
    }

    et[] cq(int i) {
        return new ei[i];
    }

    public boolean dd(ey eyVar, boolean z) {
        ei eiVar = (ei) ag(eyVar, 481756558);
        if (eiVar == null) {
            return false;
        }
        if (z && eiVar.ag * 1392905856 == 0) {
            return false;
        }
        return true;
    }

    public boolean dl(ey eyVar, boolean z) {
        ei eiVar = (ei) ag(eyVar, 1894854124);
        if (eiVar == null) {
            return false;
        }
        if (z && eiVar.ag * -1161455169 == 0) {
            return false;
        }
        return true;
    }

    public boolean dt(ey eyVar, boolean z, byte b) {
        try {
            ei eiVar = (ei) ag(eyVar, -184397091);
            if (eiVar == null) {
                return false;
            }
            if (z && eiVar.ag * -1161455169 == 0) {
                return false;
            }
            return true;
        } catch (Throwable e) {
            throw ba.ad(e, "em.dt(" + ')');
        }
    }

    public boolean dv(ey eyVar, boolean z) {
        ei eiVar = (ei) ag(eyVar, 2012253507);
        if (eiVar == null) {
            return false;
        }
        if (z && eiVar.ag * -1161455169 == 0) {
            return false;
        }
        return true;
    }

    public void da(ik ikVar, int i) {
        while (ikVar.ad * 1978945739 < i) {
            Object obj;
            boolean z;
            boolean z2;
            if (ikVar.ao((byte) 0) == 1) {
                obj = 1;
            } else {
                obj = null;
            }
            ey eyVar = new ey(ikVar.bc(326929550), this.aj);
            ey eyVar2 = new ey(ikVar.bc(470117291), this.aj);
            int au = ikVar.au(1289741373);
            int ao = ikVar.ao((byte) 0);
            int ao2 = ikVar.ao((byte) 0);
            if ((ao2 & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((ao2 & 1) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (au > 0) {
                ikVar.bc(1633371468);
                ikVar.ao((byte) 0);
                ikVar.al(9740449);
            }
            ikVar.bc(1731982232);
            if (eyVar == null || !eyVar.ad(-1069759578)) {
                throw new IllegalStateException();
            }
            et etVar;
            en enVar;
            Object obj2;
            Object obj3;
            ei eiVar;
            et etVar2 = (ei) ay(eyVar, 1099558325);
            if (obj != null) {
                etVar = (ei) ay(eyVar2, 1099558325);
                if (!(etVar == null || etVar2 == etVar)) {
                    if (etVar2 != null) {
                        aj(etVar, 2142124456);
                        etVar = etVar2;
                    }
                    if (etVar != null) {
                        ab(etVar, eyVar, eyVar2, (byte) 64);
                        if (au == etVar.ag * -1161455169) {
                            int i2 = 1;
                            enVar = (en) this.aq.ad();
                            while (enVar != null) {
                                if (enVar.ad.equals(eyVar)) {
                                    if (au == 0 && enVar.an == (short) 0) {
                                        enVar.af();
                                        obj2 = null;
                                        obj3 = obj2;
                                        enVar = (en) this.aq.an();
                                    } else if (au == 0 && enVar.an != (short) 0) {
                                        enVar.af();
                                        obj2 = null;
                                        obj3 = obj2;
                                        enVar = (en) this.aq.an();
                                    }
                                }
                                obj2 = obj3;
                                obj3 = obj2;
                                enVar = (en) this.aq.an();
                            }
                            if (obj3 != null) {
                                this.aq.af(new en(eyVar, au));
                            }
                            eiVar = etVar;
                        } else {
                            etVar2 = etVar;
                        }
                    } else if (ad(1873643898) < 400) {
                        eiVar = (ei) aq(eyVar, eyVar2, -386352732);
                    }
                    if (-1161455169 * eiVar.ag != au) {
                        int i3 = this.ae - 1929399585;
                        this.ae = i3;
                        eiVar.ay = ((i3 * -2085582561) - 1) * 1327442639;
                        if (eiVar.ag * -1161455169 == -1 && au == 0) {
                            eiVar.ay = -(eiVar.ay * 1);
                        }
                        eiVar.ag = 1820808767 * au;
                    }
                    eiVar.as = 862083601 * ao;
                    eiVar.af = z;
                    eiVar.aa = z2;
                }
            }
            etVar = etVar2;
            if (etVar != null) {
                ab(etVar, eyVar, eyVar2, (byte) 64);
                if (au == etVar.ag * -1161455169) {
                    etVar2 = etVar;
                } else {
                    int i22 = 1;
                    enVar = (en) this.aq.ad();
                    while (enVar != null) {
                        if (enVar.ad.equals(eyVar)) {
                            if (au == 0) {
                            }
                            enVar.af();
                            obj2 = null;
                            obj3 = obj2;
                            enVar = (en) this.aq.an();
                        }
                        obj2 = obj3;
                        obj3 = obj2;
                        enVar = (en) this.aq.an();
                    }
                    if (obj3 != null) {
                        this.aq.af(new en(eyVar, au));
                    }
                    eiVar = etVar;
                }
            } else if (ad(1873643898) < 400) {
                eiVar = (ei) aq(eyVar, eyVar2, -386352732);
            }
            if (-1161455169 * eiVar.ag != au) {
                int i32 = this.ae - 1929399585;
                this.ae = i32;
                eiVar.ay = ((i32 * -2085582561) - 1) * 1327442639;
                eiVar.ay = -(eiVar.ay * 1);
                eiVar.ag = 1820808767 * au;
            }
            eiVar.as = 862083601 * ao;
            eiVar.af = z;
            eiVar.aa = z2;
        }
        at(1241064189);
    }

    public void di(ik ikVar, int i) {
        while (ikVar.ad * 1978945739 < i) {
            Object obj;
            boolean z;
            boolean z2;
            if (ikVar.ao((byte) 0) == 1) {
                obj = 1;
            } else {
                obj = null;
            }
            ey eyVar = new ey(ikVar.bc(1666359007), this.aj);
            ey eyVar2 = new ey(ikVar.bc(519920752), this.aj);
            int au = ikVar.au(519541531);
            int ao = ikVar.ao((byte) 0);
            int ao2 = ikVar.ao((byte) 0);
            if ((ao2 & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((ao2 & 1) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (au > 0) {
                ikVar.bc(338523306);
                ikVar.ao((byte) 0);
                ikVar.al(-376784277);
            }
            ikVar.bc(545591321);
            if (eyVar == null || !eyVar.ad(-1069759578)) {
                throw new IllegalStateException();
            }
            et etVar;
            Object obj2;
            en enVar;
            Object obj3;
            ei eiVar;
            et etVar2 = (ei) ay(eyVar, 1099558325);
            if (obj != null) {
                etVar = (ei) ay(eyVar2, 1099558325);
                if (!(etVar == null || etVar2 == etVar)) {
                    if (etVar2 != null) {
                        aj(etVar, 2142124456);
                        etVar = etVar2;
                    }
                    if (etVar != null) {
                        ab(etVar, eyVar, eyVar2, (byte) 64);
                        if (au == etVar.ag * -1161455169) {
                            obj2 = 1;
                            enVar = (en) this.aq.ad();
                            while (enVar != null) {
                                if (enVar.ad.equals(eyVar)) {
                                    if (au == 0 && enVar.an == (short) 0) {
                                        enVar.af();
                                        obj3 = null;
                                        obj2 = obj3;
                                        enVar = (en) this.aq.an();
                                    } else if (au == 0 && enVar.an != (short) 0) {
                                        enVar.af();
                                        obj3 = null;
                                        obj2 = obj3;
                                        enVar = (en) this.aq.an();
                                    }
                                }
                                obj3 = obj2;
                                obj2 = obj3;
                                enVar = (en) this.aq.an();
                            }
                            if (obj2 != null) {
                                this.aq.af(new en(eyVar, au));
                            }
                            eiVar = etVar;
                        } else {
                            etVar2 = etVar;
                        }
                    } else if (ad(1246020068) < 400) {
                        eiVar = (ei) aq(eyVar, eyVar2, -386352732);
                    }
                    if (-1161455169 * eiVar.ag != au) {
                        int i2 = this.ae - 1929399585;
                        this.ae = i2;
                        eiVar.ay = ((i2 * -2085582561) - 1) * 1327442639;
                        if (eiVar.ag * -1161455169 == -1 && au == 0) {
                            eiVar.ay = -(eiVar.ay * 1);
                        }
                        eiVar.ag = 1820808767 * au;
                    }
                    eiVar.as = 862083601 * ao;
                    eiVar.af = z;
                    eiVar.aa = z2;
                }
            }
            etVar = etVar2;
            if (etVar != null) {
                ab(etVar, eyVar, eyVar2, (byte) 64);
                if (au == etVar.ag * -1161455169) {
                    etVar2 = etVar;
                } else {
                    obj2 = 1;
                    enVar = (en) this.aq.ad();
                    while (enVar != null) {
                        if (enVar.ad.equals(eyVar)) {
                            if (au == 0) {
                            }
                            enVar.af();
                            obj3 = null;
                            obj2 = obj3;
                            enVar = (en) this.aq.an();
                        }
                        obj3 = obj2;
                        obj2 = obj3;
                        enVar = (en) this.aq.an();
                    }
                    if (obj2 != null) {
                        this.aq.af(new en(eyVar, au));
                    }
                    eiVar = etVar;
                }
            } else if (ad(1246020068) < 400) {
                eiVar = (ei) aq(eyVar, eyVar2, -386352732);
            }
            if (-1161455169 * eiVar.ag != au) {
                int i22 = this.ae - 1929399585;
                this.ae = i22;
                eiVar.ay = ((i22 * -2085582561) - 1) * 1327442639;
                eiVar.ay = -(eiVar.ay * 1);
                eiVar.ag = 1820808767 * au;
            }
            eiVar.as = 862083601 * ao;
            eiVar.af = z;
            eiVar.aa = z2;
        }
        at(1241064189);
    }

    public void dr(ik ikVar, int i) {
        while (ikVar.ad * 1978945739 < i) {
            Object obj;
            boolean z;
            boolean z2;
            if (ikVar.ao((byte) 0) == 1) {
                obj = 1;
            } else {
                obj = null;
            }
            ey eyVar = new ey(ikVar.bc(715935815), this.aj);
            ey eyVar2 = new ey(ikVar.bc(333456645), this.aj);
            int au = ikVar.au(-1281915736);
            int ao = ikVar.ao((byte) 0);
            int ao2 = ikVar.ao((byte) 0);
            if ((ao2 & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((ao2 & 1) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (au > 0) {
                ikVar.bc(313257554);
                ikVar.ao((byte) 0);
                ikVar.al(-142995574);
            }
            ikVar.bc(1236254766);
            if (eyVar == null || !eyVar.ad(-1069759578)) {
                throw new IllegalStateException();
            }
            et etVar;
            en enVar;
            Object obj2;
            Object obj3;
            ei eiVar;
            et etVar2 = (ei) ay(eyVar, 1099558325);
            if (obj != null) {
                etVar = (ei) ay(eyVar2, 1099558325);
                if (!(etVar == null || etVar2 == etVar)) {
                    if (etVar2 != null) {
                        aj(etVar, 2142124456);
                        etVar = etVar2;
                    }
                    if (etVar != null) {
                        ab(etVar, eyVar, eyVar2, (byte) 64);
                        if (au == etVar.ag * -1161455169) {
                            int i2 = 1;
                            enVar = (en) this.aq.ad();
                            while (enVar != null) {
                                if (enVar.ad.equals(eyVar)) {
                                    if (au == 0 && enVar.an == (short) 0) {
                                        enVar.af();
                                        obj2 = null;
                                        obj3 = obj2;
                                        enVar = (en) this.aq.an();
                                    } else if (au == 0 && enVar.an != (short) 0) {
                                        enVar.af();
                                        obj2 = null;
                                        obj3 = obj2;
                                        enVar = (en) this.aq.an();
                                    }
                                }
                                obj2 = obj3;
                                obj3 = obj2;
                                enVar = (en) this.aq.an();
                            }
                            if (obj3 != null) {
                                this.aq.af(new en(eyVar, au));
                            }
                            etVar2 = etVar;
                        } else {
                            etVar2 = etVar;
                        }
                    } else if (ad(1555683001) < 400) {
                        eiVar = (ei) aq(eyVar, eyVar2, -386352732);
                    }
                    if (-1161455169 * eiVar.ag != au) {
                        int i3 = this.ae - 1929399585;
                        this.ae = i3;
                        eiVar.ay = ((i3 * -2085582561) - 1) * 1327442639;
                        if (eiVar.ag * -1161455169 == -1 && au == 0) {
                            eiVar.ay = -(eiVar.ay * 1);
                        }
                        eiVar.ag = 1820808767 * au;
                    }
                    eiVar.as = 862083601 * ao;
                    eiVar.af = z;
                    eiVar.aa = z2;
                }
            }
            etVar = etVar2;
            if (etVar != null) {
                ab(etVar, eyVar, eyVar2, (byte) 64);
                if (au == etVar.ag * -1161455169) {
                    etVar2 = etVar;
                } else {
                    int i22 = 1;
                    enVar = (en) this.aq.ad();
                    while (enVar != null) {
                        if (enVar.ad.equals(eyVar)) {
                            if (au == 0) {
                            }
                            enVar.af();
                            obj2 = null;
                            obj3 = obj2;
                            enVar = (en) this.aq.an();
                        }
                        obj2 = obj3;
                        obj3 = obj2;
                        enVar = (en) this.aq.an();
                    }
                    if (obj3 != null) {
                        this.aq.af(new en(eyVar, au));
                    }
                    etVar2 = etVar;
                }
            } else if (ad(1555683001) < 400) {
                eiVar = (ei) aq(eyVar, eyVar2, -386352732);
            }
            if (-1161455169 * eiVar.ag != au) {
                int i32 = this.ae - 1929399585;
                this.ae = i32;
                eiVar.ay = ((i32 * -2085582561) - 1) * 1327442639;
                eiVar.ay = -(eiVar.ay * 1);
                eiVar.ag = 1820808767 * au;
            }
            eiVar.as = 862083601 * ao;
            eiVar.af = z;
            eiVar.aa = z2;
        }
        at(1241064189);
    }

    public void dz(ik ikVar, int i, int i2) {
        while (ikVar.ad * 1978945739 < i) {
            try {
                Object obj;
                boolean z;
                boolean z2;
                if (ikVar.ao((byte) 0) == 1) {
                    obj = 1;
                } else {
                    obj = null;
                }
                ey eyVar = new ey(ikVar.bc(1553778620), this.aj);
                ey eyVar2 = new ey(ikVar.bc(1591220529), this.aj);
                int au = ikVar.au(-1522507416);
                int ao = ikVar.ao((byte) 0);
                int ao2 = ikVar.ao((byte) 0);
                if ((ao2 & 2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if ((ao2 & 1) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (au > 0) {
                    ikVar.bc(331940072);
                    ikVar.ao((byte) 0);
                    ikVar.al(-277587716);
                }
                ikVar.bc(1706683693);
                if (eyVar == null || !eyVar.ad(-1069759578)) {
                    throw new IllegalStateException();
                }
                et etVar;
                Object obj2;
                en enVar;
                ei eiVar;
                int i3;
                et etVar2 = (ei) ay(eyVar, 1099558325);
                if (obj != null) {
                    ei eiVar2 = (ei) ay(eyVar2, 1099558325);
                    if (!(eiVar2 == null || etVar2 == eiVar2)) {
                        if (etVar2 != null) {
                            aj(eiVar2, 2142124456);
                            etVar = etVar2;
                        } else {
                            etVar = eiVar2;
                        }
                        if (etVar != null) {
                            ab(etVar, eyVar, eyVar2, (byte) 64);
                            if (au == etVar.ag * -1161455169) {
                                obj2 = 1;
                                enVar = (en) this.aq.ad();
                                while (enVar != null) {
                                    if (enVar.ad.equals(eyVar)) {
                                        if (au == 0 && enVar.an == (short) 0) {
                                            enVar.af();
                                            obj = null;
                                            obj2 = obj;
                                            enVar = (en) this.aq.an();
                                        } else if (au == 0 && enVar.an != (short) 0) {
                                            enVar.af();
                                            obj = null;
                                            obj2 = obj;
                                            enVar = (en) this.aq.an();
                                        }
                                    }
                                    obj = obj2;
                                    obj2 = obj;
                                    enVar = (en) this.aq.an();
                                }
                                if (obj2 != null) {
                                    this.aq.af(new en(eyVar, au));
                                }
                                eiVar = etVar;
                            } else {
                                etVar2 = etVar;
                            }
                        } else if (ad(1743761639) < 400) {
                            eiVar = (ei) aq(eyVar, eyVar2, -386352732);
                        }
                        if (-1161455169 * eiVar.ag != au) {
                            i3 = this.ae - 1929399585;
                            this.ae = i3;
                            eiVar.ay = ((i3 * -2085582561) - 1) * 1327442639;
                            if (eiVar.ag * -1161455169 == -1 && au == 0) {
                                eiVar.ay = -(eiVar.ay * 1);
                            }
                            eiVar.ag = 1820808767 * au;
                        }
                        eiVar.as = 862083601 * ao;
                        eiVar.af = z;
                        eiVar.aa = z2;
                    }
                }
                etVar = etVar2;
                if (etVar != null) {
                    ab(etVar, eyVar, eyVar2, (byte) 64);
                    if (au == etVar.ag * -1161455169) {
                        etVar2 = etVar;
                    } else {
                        obj2 = 1;
                        enVar = (en) this.aq.ad();
                        while (enVar != null) {
                            if (enVar.ad.equals(eyVar)) {
                                if (au == 0) {
                                }
                                enVar.af();
                                obj = null;
                                obj2 = obj;
                                enVar = (en) this.aq.an();
                            }
                            obj = obj2;
                            obj2 = obj;
                            enVar = (en) this.aq.an();
                        }
                        if (obj2 != null) {
                            this.aq.af(new en(eyVar, au));
                        }
                        eiVar = etVar;
                    }
                } else if (ad(1743761639) < 400) {
                    eiVar = (ei) aq(eyVar, eyVar2, -386352732);
                }
                if (-1161455169 * eiVar.ag != au) {
                    i3 = this.ae - 1929399585;
                    this.ae = i3;
                    eiVar.ay = ((i3 * -2085582561) - 1) * 1327442639;
                    eiVar.ay = -(eiVar.ay * 1);
                    eiVar.ag = 1820808767 * au;
                }
                eiVar.as = 862083601 * ao;
                eiVar.af = z;
                eiVar.aa = z2;
            } catch (Throwable e) {
                throw ba.ad(e, "em.dz(" + ')');
            }
        }
        at(1241064189);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final void ag(p000.ik r6, int r7, int r8, int r9, int r10, int r11, int r12, byte r13) {
        /*
        r1 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r5 = 49;
        r4 = 1;
        r0 = 0;
        if (r8 < 0) goto L_0x0077;
    L_0x0008:
        if (r8 >= r1) goto L_0x0077;
    L_0x000a:
        if (r9 < 0) goto L_0x0077;
    L_0x000c:
        if (r9 >= r1) goto L_0x0077;
    L_0x000e:
        r1 = p000.gu.ad;	 Catch:{ RuntimeException -> 0x0056 }
        r1 = r1[r7];	 Catch:{ RuntimeException -> 0x0056 }
        r1 = r1[r8];	 Catch:{ RuntimeException -> 0x0056 }
        r2 = 0;
        r1[r9] = r2;	 Catch:{ RuntimeException -> 0x0056 }
    L_0x0017:
        r1 = 0;
        r1 = r6.ao(r1);	 Catch:{ RuntimeException -> 0x0056 }
        if (r1 != 0) goto L_0x003e;
    L_0x001e:
        if (r7 != 0) goto L_0x00b3;
    L_0x0020:
        r0 = p000.gu.af;	 Catch:{ RuntimeException -> 0x0056 }
        r1 = 0;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x0056 }
        r0 = r0[r8];	 Catch:{ RuntimeException -> 0x0056 }
        r1 = 932731; // 0xe3b7b float:1.307035E-39 double:4.608303E-318;
        r1 = r1 + r8;
        r1 = r1 + r10;
        r2 = 556238; // 0x87cce float:7.79455E-40 double:2.74818E-318;
        r2 = r2 + r9;
        r2 = r2 + r11;
        r3 = 1078822087; // 0x404d84c7 float:3.211229 double:5.33008931E-315;
        r1 = p000.jk.aj(r1, r2, r3);	 Catch:{ RuntimeException -> 0x0056 }
        r1 = -r1;
        r1 = r1 * 8;
        r0[r9] = r1;	 Catch:{ RuntimeException -> 0x0056 }
    L_0x003d:
        return;
    L_0x003e:
        if (r1 != r4) goto L_0x0085;
    L_0x0040:
        r1 = 0;
        r1 = r6.ao(r1);	 Catch:{ RuntimeException -> 0x0056 }
        if (r4 != r1) goto L_0x00ff;
    L_0x0047:
        if (r7 != 0) goto L_0x00e7;
    L_0x0049:
        r1 = p000.gu.af;	 Catch:{ RuntimeException -> 0x0056 }
        r2 = 0;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x0056 }
        r1 = r1[r8];	 Catch:{ RuntimeException -> 0x0056 }
        r0 = -r0;
        r0 = r0 * 8;
        r1[r9] = r0;	 Catch:{ RuntimeException -> 0x0056 }
        goto L_0x003d;
    L_0x0056:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "em.ag(";
        r1 = r1.append(r2);
        r2 = 41;
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0 = p000.ba.ad(r0, r1);
        throw r0;
    L_0x0071:
        if (r0 > r5) goto L_0x0077;
    L_0x0073:
        r0 = 0;
        r6.ao(r0);	 Catch:{ RuntimeException -> 0x0056 }
    L_0x0077:
        r0 = 0;
        r0 = r6.ao(r0);	 Catch:{ RuntimeException -> 0x0056 }
        if (r0 == 0) goto L_0x003d;
    L_0x007e:
        if (r4 != r0) goto L_0x0071;
    L_0x0080:
        r0 = 0;
        r6.ao(r0);	 Catch:{ RuntimeException -> 0x0056 }
        goto L_0x003d;
    L_0x0085:
        if (r1 > r5) goto L_0x00c9;
    L_0x0087:
        r2 = p000.dm.ag;	 Catch:{ RuntimeException -> 0x0056 }
        r2 = r2[r7];	 Catch:{ RuntimeException -> 0x0056 }
        r2 = r2[r8];	 Catch:{ RuntimeException -> 0x0056 }
        r3 = 1247983979; // 0x4a62b96b float:3714650.8 double:6.165860106E-315;
        r3 = r6.ax(r3);	 Catch:{ RuntimeException -> 0x0056 }
        r2[r9] = r3;	 Catch:{ RuntimeException -> 0x0056 }
        r2 = p000.jf.ay;	 Catch:{ RuntimeException -> 0x0056 }
        r2 = r2[r7];	 Catch:{ RuntimeException -> 0x0056 }
        r2 = r2[r8];	 Catch:{ RuntimeException -> 0x0056 }
        r3 = r1 + -2;
        r3 = r3 / 4;
        r3 = (byte) r3;	 Catch:{ RuntimeException -> 0x0056 }
        r2[r9] = r3;	 Catch:{ RuntimeException -> 0x0056 }
        r2 = p000.gb.as;	 Catch:{ RuntimeException -> 0x0056 }
        r2 = r2[r7];	 Catch:{ RuntimeException -> 0x0056 }
        r2 = r2[r8];	 Catch:{ RuntimeException -> 0x0056 }
        r1 = r1 + -2;
        r1 = r1 + r12;
        r1 = r1 & 3;
        r1 = (byte) r1;	 Catch:{ RuntimeException -> 0x0056 }
        r2[r9] = r1;	 Catch:{ RuntimeException -> 0x0056 }
        goto L_0x0017;
    L_0x00b3:
        r0 = p000.gu.af;	 Catch:{ RuntimeException -> 0x0056 }
        r0 = r0[r7];	 Catch:{ RuntimeException -> 0x0056 }
        r0 = r0[r8];	 Catch:{ RuntimeException -> 0x0056 }
        r1 = p000.gu.af;	 Catch:{ RuntimeException -> 0x0056 }
        r2 = r7 + -1;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x0056 }
        r1 = r1[r8];	 Catch:{ RuntimeException -> 0x0056 }
        r1 = r1[r9];	 Catch:{ RuntimeException -> 0x0056 }
        r1 = r1 + -240;
        r0[r9] = r1;	 Catch:{ RuntimeException -> 0x0056 }
        goto L_0x003d;
    L_0x00c9:
        r2 = 81;
        if (r1 > r2) goto L_0x00da;
    L_0x00cd:
        r2 = p000.gu.ad;	 Catch:{ RuntimeException -> 0x0056 }
        r2 = r2[r7];	 Catch:{ RuntimeException -> 0x0056 }
        r2 = r2[r8];	 Catch:{ RuntimeException -> 0x0056 }
        r1 = r1 + -49;
        r1 = (byte) r1;	 Catch:{ RuntimeException -> 0x0056 }
        r2[r9] = r1;	 Catch:{ RuntimeException -> 0x0056 }
        goto L_0x0017;
    L_0x00da:
        r2 = p000.gu.aa;	 Catch:{ RuntimeException -> 0x0056 }
        r2 = r2[r7];	 Catch:{ RuntimeException -> 0x0056 }
        r2 = r2[r8];	 Catch:{ RuntimeException -> 0x0056 }
        r1 = r1 + -81;
        r1 = (byte) r1;	 Catch:{ RuntimeException -> 0x0056 }
        r2[r9] = r1;	 Catch:{ RuntimeException -> 0x0056 }
        goto L_0x0017;
    L_0x00e7:
        r1 = p000.gu.af;	 Catch:{ RuntimeException -> 0x0056 }
        r1 = r1[r7];	 Catch:{ RuntimeException -> 0x0056 }
        r1 = r1[r8];	 Catch:{ RuntimeException -> 0x0056 }
        r2 = p000.gu.af;	 Catch:{ RuntimeException -> 0x0056 }
        r3 = r7 + -1;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x0056 }
        r2 = r2[r8];	 Catch:{ RuntimeException -> 0x0056 }
        r2 = r2[r9];	 Catch:{ RuntimeException -> 0x0056 }
        r0 = r0 * 8;
        r0 = r2 - r0;
        r1[r9] = r0;	 Catch:{ RuntimeException -> 0x0056 }
        goto L_0x003d;
    L_0x00ff:
        r0 = r1;
        goto L_0x0047;
        */
        throw new UnsupportedOperationException("Method not decompiled: em.ag(ik, int, int, int, int, int, int, byte):void");
    }

    static void bu(int i, int i2, int i3, int i4) {
        try {
            if (client.mu * 1745056855 != 0 && i2 != 0 && client.nd * 2118073853 < 50) {
                client.nv[client.nd * 2118073853] = i;
                client.na[client.nd * 2118073853] = i2;
                client.nw[client.nd * 2118073853] = i3;
                client.ny[client.nd * 2118073853] = null;
                client.nn[client.nd * 2118073853] = 0;
                client.nd += 1636861781;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "em.bu(" + ')');
        }
    }

    public static final void fp(int i, int i2) {
        try {
            cg.fm((short) 25864);
            for (hd hdVar = (hd) hd.af.as(); hdVar != null; hdVar = (hd) hd.af.aj()) {
                if (hdVar.aw != null) {
                    hdVar.af((byte) 52);
                }
            }
            int i3 = jq.ad(i, (byte) 0).aa * 828168313;
            if (i3 != 0) {
                jp jpVar;
                int i4 = al.an[i];
                if (i3 == 1) {
                    double random;
                    int i5;
                    int i6;
                    double d;
                    double d2;
                    int i7;
                    int i8;
                    double d3;
                    double d4;
                    double d5;
                    double d6;
                    double d7;
                    int bb;
                    if (i4 == 1) {
                        bs.bw(0.9d);
                        ((cd) bi.ab).al(0.9d);
                    }
                    if (i4 == 2) {
                        bs.bw(0.8d);
                        ((cd) bi.ab).al(0.8d);
                    }
                    if (3 == i4) {
                        random = 0.7d + ((Math.random() * 0.03d) - 0.015d);
                        i5 = 0;
                        i6 = 0;
                        while (i6 < 512) {
                            d = 0.0078125d + (((double) (i6 >> 3)) / 64.0d);
                            d2 = 0.0625d + (((double) (i6 & 7)) / 8.0d);
                            i7 = 0;
                            i8 = i5;
                            while (i7 < mn.an) {
                                d3 = ((double) i7) / 128.0d;
                                if (d2 != 0.0d) {
                                    if (d3 < 0.5d) {
                                        d4 = (1.0d + d2) * d3;
                                    } else {
                                        d4 = (d2 + d3) - (d3 * d2);
                                    }
                                    d3 = (d3 * 2.0d) - d4;
                                    d5 = 0.3333333333333333d + d;
                                    if (d5 > 1.0d) {
                                        d5 -= 1.0d;
                                    }
                                    d6 = d - 0.3333333333333333d;
                                    if (d6 < 0.0d) {
                                        d7 = d6 + 1.0d;
                                    } else {
                                        d7 = d6;
                                    }
                                    d6 = 6.0d * d5 < 1.0d ? (d5 * ((d4 - d3) * 6.0d)) + d3 : 2.0d * d5 < 1.0d ? d4 : 3.0d * d5 < 2.0d ? d3 + (((0.6666666666666666d - d5) * (d4 - d3)) * 6.0d) : d3;
                                    d5 = 6.0d * d < 1.0d ? (((d4 - d3) * 6.0d) * d) + d3 : 2.0d * d < 1.0d ? d4 : 3.0d * d < 2.0d ? (((0.6666666666666666d - d) * (d4 - d3)) * 6.0d) + d3 : d3;
                                    if (6.0d * d7 < 1.0d) {
                                        d4 = (((d4 - d3) * 6.0d) * d7) + d3;
                                        d3 = d5;
                                        d5 = d6;
                                    } else if (2.0d * d7 < 1.0d) {
                                        d3 = d5;
                                        d5 = d6;
                                    } else if (3.0d * d7 < 2.0d) {
                                        d4 = (((d4 - d3) * (0.6666666666666666d - d7)) * 6.0d) + d3;
                                        d3 = d5;
                                        d5 = d6;
                                    } else {
                                        d4 = d3;
                                        d3 = d5;
                                        d5 = d6;
                                    }
                                } else {
                                    d4 = d3;
                                    d5 = d3;
                                }
                                bb = ao.bb(((int) (d4 * 256.0d)) + ((((int) (d3 * 256.0d)) << 8) + (((int) (d5 * 256.0d)) << 16)), random);
                                if (bb == 0) {
                                    bb = 1;
                                }
                                i5 = i8 + 1;
                                bi.at[i8] = bb;
                                i7++;
                                i8 = i5;
                            }
                            i6++;
                            i5 = i8;
                        }
                        ((cd) bi.ab).al(0.7d);
                    }
                    if (4 == i4) {
                        random = 0.6d + ((Math.random() * 0.03d) - 0.015d);
                        i5 = 0;
                        i6 = 0;
                        while (i6 < 512) {
                            d = 0.0078125d + (((double) (i6 >> 3)) / 64.0d);
                            d2 = 0.0625d + (((double) (i6 & 7)) / 8.0d);
                            i7 = 0;
                            i8 = i5;
                            while (i7 < mn.an) {
                                d3 = ((double) i7) / 128.0d;
                                if (0.0d != d2) {
                                    if (d3 < 0.5d) {
                                        d4 = (1.0d + d2) * d3;
                                    } else {
                                        d4 = (d2 + d3) - (d3 * d2);
                                    }
                                    d3 = (d3 * 2.0d) - d4;
                                    d5 = 0.3333333333333333d + d;
                                    if (d5 > 1.0d) {
                                        d5 -= 1.0d;
                                    }
                                    d6 = d - 0.3333333333333333d;
                                    if (d6 < 0.0d) {
                                        d7 = d6 + 1.0d;
                                    } else {
                                        d7 = d6;
                                    }
                                    d6 = 6.0d * d5 < 1.0d ? (d5 * ((d4 - d3) * 6.0d)) + d3 : 2.0d * d5 < 1.0d ? d4 : 3.0d * d5 < 2.0d ? d3 + (((0.6666666666666666d - d5) * (d4 - d3)) * 6.0d) : d3;
                                    d5 = 6.0d * d < 1.0d ? ((6.0d * (d4 - d3)) * d) + d3 : 2.0d * d < 1.0d ? d4 : 3.0d * d < 2.0d ? (6.0d * ((d4 - d3) * (0.6666666666666666d - d))) + d3 : d3;
                                    if (6.0d * d7 < 1.0d) {
                                        d4 = (((d4 - d3) * 6.0d) * d7) + d3;
                                        d3 = d5;
                                        d5 = d6;
                                    } else if (2.0d * d7 < 1.0d) {
                                        d3 = d5;
                                        d5 = d6;
                                    } else if (3.0d * d7 < 2.0d) {
                                        d4 = (((d4 - d3) * (0.6666666666666666d - d7)) * 6.0d) + d3;
                                        d3 = d5;
                                        d5 = d6;
                                    } else {
                                        d4 = d3;
                                        d3 = d5;
                                        d5 = d6;
                                    }
                                } else {
                                    d4 = d3;
                                    d5 = d3;
                                }
                                bb = ao.bb(((int) (d4 * 256.0d)) + ((((int) (d5 * 256.0d)) << 16) + (((int) (d3 * 256.0d)) << 8)), random);
                                if (bb == 0) {
                                    bb = 1;
                                }
                                i5 = i8 + 1;
                                bi.at[i8] = bb;
                                i7++;
                                i8 = i5;
                            }
                            i6++;
                            i5 = i8;
                        }
                        ((cd) bi.ab).al(0.6d);
                    }
                    ax.ab.aa();
                }
                if (i3 == 3) {
                    int i9 = 0;
                    if (i4 == 0) {
                        i9 = 255;
                    }
                    if (1 == i4) {
                        i9 = 192;
                    }
                    if (2 == i4) {
                        i9 = mn.an;
                    }
                    if (3 == i4) {
                        i9 = 64;
                    }
                    if (i4 == 4) {
                        i9 = 0;
                    }
                    if (i9 != -1819605895 * client.mk) {
                        if (client.mk * -1819605895 == 0 && client.mx * 1387447661 != -1) {
                            ao.ad(client.bo, 1387447661 * client.mx, 0, i9, false, -1132449550);
                            client.me = false;
                        } else if (i9 == 0) {
                            mx.an((byte) 41);
                            client.me = false;
                        } else if (mf.ag * -219207591 != 0) {
                            ci.aj = -1734207119 * i9;
                        } else {
                            mf.aa.af(i9, 891188647);
                        }
                        client.mk = 1020536265 * i9;
                    }
                }
                if (i3 == 4) {
                    if (i4 == 0) {
                        client.mu = 1098710041;
                    }
                    if (i4 == 1) {
                        client.mu = 864339616;
                    }
                    if (2 == i4) {
                        client.mu = 2007882176;
                    }
                    if (i4 == 3) {
                        client.mu = -1143542560;
                    }
                    if (i4 == 4) {
                        client.mu = 0;
                    }
                }
                if (5 == i3) {
                    client.ip = 1403721769 * i4;
                }
                if (i3 == 6) {
                    client.jd = 925438107 * i4;
                }
                if (i3 == 9) {
                    client.jr = -1357687407 * i4;
                }
                if (10 == i3) {
                    if (i4 == 0) {
                        client.ns = -594488243;
                    }
                    if (i4 == 1) {
                        client.ns = -1633029344;
                    }
                    if (2 == i4) {
                        client.ns = 342969536;
                    }
                    if (i4 == 3) {
                        client.ns = -1975998880;
                    }
                    if (i4 == 4) {
                        client.ns = 0;
                    }
                }
                if (i3 == 17) {
                    client.jz = -1001387759 * (65535 & i4);
                }
                if (i3 == 18) {
                    jpVar = (jp) bx.af(new jp[]{jp.aa, jp.an, jp.ad, jp.af}, i4, (byte) 106);
                    if (jpVar == null) {
                        jpVar = jp.af;
                    }
                    nq.ii.cv(jpVar, -692207426);
                }
                if (19 == i3) {
                    if (-1 == i4) {
                        client.im = -1909811437;
                    } else {
                        client.im = (i4 & 2047) * 1909811437;
                    }
                }
                if (22 == i3) {
                    jpVar = (jp) bx.af(new jp[]{jp.aa, jp.an, jp.ad, jp.af}, i4, (byte) 29);
                    if (jpVar == null) {
                        jpVar = jp.af;
                    }
                    nq.ii.ci(jpVar, (byte) 58);
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "em.fp(" + ')');
        }
    }
}
