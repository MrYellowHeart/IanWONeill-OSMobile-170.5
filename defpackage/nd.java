package p000;

import java.util.Collection;

public class nd extends fb {
    kg ad;
    nx af;
    fl an;

    nd(nx nxVar) {
        try {
            this.ad = new kg();
            this.an = new fl();
            this.af = nxVar;
        } catch (Throwable e) {
            throw ba.ad(e, "nd.<init>(" + ')');
        }
    }

    protected fb ac() {
        ns nsVar = (ns) this.ad.as();
        if (nsVar == null) {
            return null;
        }
        return nsVar.ak != null ? nsVar.ak : as();
    }

    protected fb al() {
        ns nsVar = (ns) this.ad.as();
        if (nsVar == null) {
            return null;
        }
        if (nsVar.ak != null) {
            return nsVar.ak;
        }
        return as();
    }

    protected fb ap() {
        ns nsVar = (ns) this.ad.as();
        if (nsVar == null) {
            return null;
        }
        if (nsVar.ak != null) {
            return nsVar.ak;
        }
        return as();
    }

    protected fb av() {
        ns nsVar = (ns) this.ad.as();
        if (nsVar == null) {
            return null;
        }
        if (nsVar.ak != null) {
            return nsVar.ak;
        }
        return as();
    }

    protected fb ay() {
        try {
            ns nsVar = (ns) this.ad.as();
            if (nsVar == null) {
                return null;
            }
            return nsVar.ak != null ? nsVar.ak : as();
        } catch (Throwable e) {
            throw ba.ad(e, "nd.ay(" + ')');
        }
    }

    protected fb as() {
        ns nsVar;
        do {
            try {
                nsVar = (ns) this.ad.aj();
                if (nsVar == null) {
                    return null;
                }
            } catch (Throwable e) {
                throw ba.ad(e, "nd.as(" + ')');
            }
        } while (nsVar.ak == null);
        return nsVar.ak;
    }

    protected fb bb() {
        ns nsVar;
        do {
            nsVar = (ns) this.ad.aj();
            if (nsVar == null) {
                return null;
            }
        } while (nsVar.ak == null);
        return nsVar.ak;
    }

    protected fb bw() {
        ns nsVar;
        do {
            nsVar = (ns) this.ad.aj();
            if (nsVar == null) {
                return null;
            }
        } while (nsVar.ak == null);
        return nsVar.ak;
    }

    protected int ar() {
        return 0;
    }

    protected int bc() {
        return 0;
    }

    protected int bg() {
        return 0;
    }

    protected int bh() {
        return 0;
    }

    protected int bz() {
        return 0;
    }

    protected void aj(int[] iArr, int i, int i2) {
        try {
            this.an.aj(iArr, i, i2);
            ns nsVar = (ns) this.ad.as();
            while (nsVar != null) {
                if (!this.af.bi(nsVar, 2113374893)) {
                    int i3 = i2;
                    int i4 = i;
                    do {
                        if (i3 <= 400280827 * nsVar.ao) {
                            af(nsVar, iArr, i4, i3, i4 + i3, 1468460752);
                            nsVar.ao -= 1463180851 * i3;
                            break;
                        }
                        af(nsVar, iArr, i4, nsVar.ao * 400280827, i3 + i4, -276428272);
                        i4 += nsVar.ao * 400280827;
                        i3 -= nsVar.ao * 400280827;
                    } while (!this.af.bq(nsVar, iArr, i4, i3, (byte) -123));
                }
                nsVar = (ns) this.ad.aj();
            }
        } catch (Throwable e) {
            throw ba.ad(e, "nd.aj(" + ')');
        }
    }

    protected void bf(int[] iArr, int i, int i2) {
        this.an.aj(iArr, i, i2);
        ns nsVar = (ns) this.ad.as();
        while (nsVar != null) {
            if (!this.af.bi(nsVar, 2129014416)) {
                int i3 = i2;
                int i4 = i;
                while (i3 > nsVar.ao * 400280827) {
                    af(nsVar, iArr, i4, nsVar.ao * 400280827, i3 + i4, -963378828);
                    i4 += nsVar.ao * 400280827;
                    int i5 = i3 - (nsVar.ao * 400280827);
                    if (this.af.bq(nsVar, iArr, i4, i5, (byte) -66)) {
                        break;
                    }
                    i3 = i5;
                }
                af(nsVar, iArr, i4, i3, i4 + i3, 1184678719);
                nsVar.ao -= 1463180851 * i3;
            }
            nsVar = (ns) this.ad.aj();
        }
    }

    public static void ar(Collection collection, byte b) {
        try {
            collection.add(af.ad);
        } catch (Throwable e) {
            throw ba.ad(e, "nd.ar(" + ')');
        }
    }

    protected void aq(int i) {
        try {
            this.an.aq(i);
            ns nsVar = (ns) this.ad.as();
            while (nsVar != null) {
                if (!this.af.bi(nsVar, 2128488874)) {
                    int i2 = i;
                    while (i2 > nsVar.ao * 400280827) {
                        ad(nsVar, nsVar.ao * 400280827, 493483648);
                        i2 -= nsVar.ao * 400280827;
                        if (this.af.bq(nsVar, null, 0, i2, (byte) -19)) {
                            break;
                        }
                    }
                    ad(nsVar, i2, 935080145);
                    nsVar.ao -= 1463180851 * i2;
                }
                nsVar = (ns) this.ad.aj();
            }
        } catch (Throwable e) {
            throw ba.ad(e, "nd.aq(" + ')');
        }
    }

    protected void be(int i) {
        this.an.aq(i);
        ns nsVar = (ns) this.ad.as();
        while (nsVar != null) {
            if (!this.af.bi(nsVar, 2146331184)) {
                int i2 = i;
                while (i2 > nsVar.ao * 400280827) {
                    ad(nsVar, nsVar.ao * 400280827, 947071426);
                    i2 -= nsVar.ao * -1625207244;
                    if (this.af.bq(nsVar, null, 0, i2, (byte) -72)) {
                        break;
                    }
                }
                ad(nsVar, i2, -1232366641);
                nsVar.ao -= 1463180851 * i2;
            }
            nsVar = (ns) this.ad.aj();
        }
    }

    protected void bt(int i) {
        this.an.aq(i);
        ns nsVar = (ns) this.ad.as();
        while (nsVar != null) {
            if (!this.af.bi(nsVar, 2099743320)) {
                int i2 = i;
                while (i2 > 400280827 * nsVar.ao) {
                    ad(nsVar, nsVar.ao * 2013655420, 996152955);
                    i2 -= nsVar.ao * -1135059325;
                    if (this.af.bq(nsVar, null, 0, i2, (byte) -5)) {
                        break;
                    }
                }
                ad(nsVar, i2, 1212493034);
                nsVar.ao -= 1463180851 * i2;
            }
            nsVar = (ns) this.ad.aj();
        }
    }

    protected void bu(int i) {
        this.an.aq(i);
        ns nsVar = (ns) this.ad.as();
        while (nsVar != null) {
            if (!this.af.bi(nsVar, 2115287327)) {
                int i2 = i;
                while (i2 > nsVar.ao * 400280827) {
                    ad(nsVar, nsVar.ao * 400280827, -297782653);
                    i2 -= nsVar.ao * 400280827;
                    if (this.af.bq(nsVar, null, 0, i2, (byte) -50)) {
                        break;
                    }
                }
                ad(nsVar, i2, 2100422404);
                nsVar.ao -= 1463180851 * i2;
            }
            nsVar = (ns) this.ad.aj();
        }
    }

    void aa(ns nsVar, int[] iArr, int i, int i2, int i3) {
        if ((this.af.ao[nsVar.af * 1829364743] & 4) != 0 && nsVar.aw * -1027449183 < 0) {
            int i4 = this.af.al[1829364743 * nsVar.af] / (fa.af * 1688035177);
            while (true) {
                int i5 = ((1048575 + i4) - (-7733305 * nsVar.au)) / i4;
                if (i5 > i2) {
                    break;
                }
                nsVar.ak.aj(iArr, i, i5);
                i += i5;
                i2 -= i5;
                nsVar.au = (((i5 * i4) - oa.ad) * 355602935) + nsVar.au;
                int i6 = (1688035177 * fa.af) / 100;
                i5 = 262144 / i4;
                if (i5 >= i6) {
                    i5 = i6;
                }
                fb fbVar = nsVar.ak;
                if (this.af.av[nsVar.af * 1829364743] == 0) {
                    nsVar.ak = fh.aa(nsVar.an, fbVar.bp(), fbVar.aw(), fbVar.ai());
                } else {
                    boolean z;
                    nsVar.ak = fh.aa(nsVar.an, fbVar.bp(), 0, fbVar.ai());
                    nx nxVar = this.af;
                    if (nsVar.ad.an[2078821397 * nsVar.ay] < (short) 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    nxVar.ah(nsVar, z, 1515915831);
                    nsVar.ak.ao(i5, fbVar.aw());
                }
                if (nsVar.ad.an[2078821397 * nsVar.ay] < (short) 0) {
                    nsVar.ak.ae(-1);
                }
                fbVar.au(i5);
                fbVar.aj(iArr, i, i3 - i);
                if (fbVar.by()) {
                    this.an.af(fbVar);
                }
            }
            nsVar.au += (i4 * i2) * 355602935;
        }
        nsVar.ak.aj(iArr, i, i2);
    }

    void af(ns nsVar, int[] iArr, int i, int i2, int i3, int i4) {
        try {
            if ((this.af.ao[nsVar.af * 1829364743] & 4) != 0 && nsVar.aw * -1027449183 < 0) {
                int i5 = this.af.al[1829364743 * nsVar.af] / (fa.af * 1688035177);
                while (true) {
                    int i6 = ((1048575 + i5) - (-7733305 * nsVar.au)) / i5;
                    if (i6 > i2) {
                        break;
                    }
                    nsVar.ak.aj(iArr, i, i6);
                    i += i6;
                    i2 -= i6;
                    nsVar.au = (((i6 * i5) - oa.ad) * 355602935) + nsVar.au;
                    int i7 = (1688035177 * fa.af) / 100;
                    i6 = 262144 / i5;
                    if (i6 < i7) {
                        i7 = i6;
                    }
                    fb fbVar = nsVar.ak;
                    if (this.af.av[nsVar.af * 1829364743] == 0) {
                        nsVar.ak = fh.aa(nsVar.an, fbVar.bp(), fbVar.aw(), fbVar.ai());
                    } else {
                        boolean z;
                        nsVar.ak = fh.aa(nsVar.an, fbVar.bp(), 0, fbVar.ai());
                        nx nxVar = this.af;
                        if (nsVar.ad.an[2078821397 * nsVar.ay] < (short) 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        nxVar.ah(nsVar, z, 1991506304);
                        nsVar.ak.ao(i7, fbVar.aw());
                    }
                    if (nsVar.ad.an[2078821397 * nsVar.ay] < (short) 0) {
                        nsVar.ak.ae(-1);
                    }
                    fbVar.au(i7);
                    fbVar.aj(iArr, i, i3 - i);
                    if (fbVar.by()) {
                        this.an.af(fbVar);
                    }
                }
                nsVar.au += (i5 * i2) * 355602935;
            }
            nsVar.ak.aj(iArr, i, i2);
        } catch (Throwable e) {
            throw ba.ad(e, "nd.af(" + ')');
        }
    }

    void an(ns nsVar, int[] iArr, int i, int i2, int i3) {
        if ((this.af.ao[nsVar.af * -210812835] & 4) != 0 && nsVar.aw * 1149528672 < 0) {
            int i4 = this.af.al[-1318036135 * nsVar.af] / (fa.af * 498929432);
            while (true) {
                int i5 = ((-1912611216 + i4) - (-7733305 * nsVar.au)) / i4;
                if (i5 > i2) {
                    break;
                }
                nsVar.ak.aj(iArr, i, i5);
                i += i5;
                i2 -= i5;
                nsVar.au = (((i5 * i4) - oa.ad) * 355602935) + nsVar.au;
                int i6 = (499303597 * fa.af) / -1396891203;
                i5 = 262144 / i4;
                if (i5 >= i6) {
                    i5 = i6;
                }
                fb fbVar = nsVar.ak;
                if (this.af.av[nsVar.af * 1829364743] == 0) {
                    nsVar.ak = fh.aa(nsVar.an, fbVar.bp(), fbVar.aw(), fbVar.ai());
                } else {
                    boolean z;
                    nsVar.ak = fh.aa(nsVar.an, fbVar.bp(), 0, fbVar.ai());
                    nx nxVar = this.af;
                    if (nsVar.ad.an[-133068659 * nsVar.ay] < (short) 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    nxVar.ah(nsVar, z, 968894970);
                    nsVar.ak.ao(i5, fbVar.aw());
                }
                if (nsVar.ad.an[-457021831 * nsVar.ay] < (short) 0) {
                    nsVar.ak.ae(-1);
                }
                fbVar.au(i5);
                fbVar.aj(iArr, i, i3 - i);
                if (fbVar.by()) {
                    this.an.af(fbVar);
                }
            }
            nsVar.au += (i4 * i2) * -1564725914;
        }
        nsVar.ak.aj(iArr, i, i2);
    }

    void ad(ns nsVar, int i, int i2) {
        boolean z = false;
        try {
            if ((this.af.ao[nsVar.af * 1829364743] & 4) != 0 && -1027449183 * nsVar.aw < 0) {
                int i3 = this.af.al[nsVar.af * 1829364743] / (1688035177 * fa.af);
                int i4 = ((i3 + 1048575) - (nsVar.au * -7733305)) / i3;
                nsVar.au = (((nsVar.au * -7733305) + (i3 * i)) & 1048575) * 355602935;
                if (i4 <= i) {
                    if (this.af.av[nsVar.af * 1829364743] == 0) {
                        nsVar.ak = fh.aa(nsVar.an, nsVar.ak.bp(), nsVar.ak.aw(), nsVar.ak.ai());
                    } else {
                        nsVar.ak = fh.aa(nsVar.an, nsVar.ak.bp(), 0, nsVar.ak.ai());
                        nx nxVar = this.af;
                        if (nsVar.ad.an[nsVar.ay * 2078821397] < (short) 0) {
                            z = true;
                        }
                        nxVar.ah(nsVar, z, 276747326);
                    }
                    if (nsVar.ad.an[nsVar.ay * 2078821397] < (short) 0) {
                        nsVar.ak.ae(-1);
                    }
                    i = (nsVar.au * -7733305) / i3;
                }
            }
            nsVar.ak.aq(i);
        } catch (Throwable e) {
            throw ba.ad(e, "nd.ad(" + ')');
        }
    }

    void ae(ns nsVar, int i) {
        boolean z = false;
        if ((this.af.ao[nsVar.af * 1829364743] & 4) != 0 && -1027449183 * nsVar.aw < 0) {
            int i2 = this.af.al[nsVar.af * 1829364743] / (1688035177 * fa.af);
            int i3 = ((i2 + 1048575) - (nsVar.au * -7733305)) / i2;
            nsVar.au = (((nsVar.au * -7733305) + (i2 * i)) & 1048575) * 355602935;
            if (i3 <= i) {
                if (this.af.av[nsVar.af * 1829364743] == 0) {
                    nsVar.ak = fh.aa(nsVar.an, nsVar.ak.bp(), nsVar.ak.aw(), nsVar.ak.ai());
                } else {
                    nsVar.ak = fh.aa(nsVar.an, nsVar.ak.bp(), 0, nsVar.ak.ai());
                    nx nxVar = this.af;
                    if (nsVar.ad.an[nsVar.ay * 2078821397] < (short) 0) {
                        z = true;
                    }
                    nxVar.ah(nsVar, z, 152870155);
                }
                if (nsVar.ad.an[nsVar.ay * 2078821397] < (short) 0) {
                    nsVar.ak.ae(-1);
                }
                i = (nsVar.au * -7733305) / i2;
            }
        }
        nsVar.ak.aq(i);
    }

    void ag(ns nsVar, int i) {
        boolean z = false;
        if ((this.af.ao[nsVar.af * 1829364743] & 4) != 0 && -1027449183 * nsVar.aw < 0) {
            int i2 = this.af.al[nsVar.af * 1829364743] / (1688035177 * fa.af);
            int i3 = ((i2 + 1048575) - (nsVar.au * -7733305)) / i2;
            nsVar.au = (((nsVar.au * -7733305) + (i2 * i)) & 1048575) * 355602935;
            if (i3 <= i) {
                if (this.af.av[nsVar.af * 1829364743] == 0) {
                    nsVar.ak = fh.aa(nsVar.an, nsVar.ak.bp(), nsVar.ak.aw(), nsVar.ak.ai());
                } else {
                    nsVar.ak = fh.aa(nsVar.an, nsVar.ak.bp(), 0, nsVar.ak.ai());
                    nx nxVar = this.af;
                    if (nsVar.ad.an[nsVar.ay * 2078821397] < (short) 0) {
                        z = true;
                    }
                    nxVar.ah(nsVar, z, 1281340655);
                }
                if (nsVar.ad.an[nsVar.ay * 2078821397] < (short) 0) {
                    nsVar.ak.ae(-1);
                }
                i = (nsVar.au * -7733305) / i2;
            }
        }
        nsVar.ak.aq(i);
    }

    void am(ns nsVar, int i) {
        boolean z = false;
        if ((this.af.ao[-894156381 * nsVar.af] & 4) != 0 && -1027449183 * nsVar.aw < 0) {
            int i2 = this.af.al[-706934978 * nsVar.af] / (1688035177 * fa.af);
            int i3 = ((-1172486687 + i2) - (-273916857 * nsVar.au)) / i2;
            nsVar.au = (((nsVar.au * -1469811002) + (i2 * i)) & -459667923) * 1797201239;
            if (i3 <= i) {
                if (this.af.av[nsVar.af * 1829364743] == 0) {
                    nsVar.ak = fh.aa(nsVar.an, nsVar.ak.bp(), nsVar.ak.aw(), nsVar.ak.ai());
                } else {
                    nsVar.ak = fh.aa(nsVar.an, nsVar.ak.bp(), 0, nsVar.ak.ai());
                    nx nxVar = this.af;
                    if (nsVar.ad.an[2078821397 * nsVar.ay] < (short) 0) {
                        z = true;
                    }
                    nxVar.ah(nsVar, z, 1352620236);
                }
                if (nsVar.ad.an[nsVar.ay * -1127084445] < (short) 0) {
                    nsVar.ak.ae(-1);
                }
                i = (-7733305 * nsVar.au) / i2;
            }
        }
        nsVar.ak.aq(i);
    }

    void at(ns nsVar, int i) {
        boolean z = false;
        if ((this.af.ao[nsVar.af * 1829364743] & 4) != 0 && -1027449183 * nsVar.aw < 0) {
            int i2 = this.af.al[nsVar.af * 1829364743] / (823084447 * fa.af);
            int i3 = ((i2 + 1048575) - (nsVar.au * -7733305)) / i2;
            nsVar.au = (((nsVar.au * 241453909) + (i2 * i)) & 1048575) * 355602935;
            if (i3 <= i) {
                if (this.af.av[nsVar.af * -16558608] == 0) {
                    nsVar.ak = fh.aa(nsVar.an, nsVar.ak.bp(), nsVar.ak.aw(), nsVar.ak.ai());
                } else {
                    nsVar.ak = fh.aa(nsVar.an, nsVar.ak.bp(), 0, nsVar.ak.ai());
                    nx nxVar = this.af;
                    if (nsVar.ad.an[2078821397 * nsVar.ay] < (short) 0) {
                        z = true;
                    }
                    nxVar.ah(nsVar, z, 1644331504);
                }
                if (nsVar.ad.an[nsVar.ay * 332287890] < (short) 0) {
                    nsVar.ak.ae(-1);
                }
                i = (nsVar.au * -7733305) / i2;
            }
        }
        nsVar.ak.aq(i);
    }
}
