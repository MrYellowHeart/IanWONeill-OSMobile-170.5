package p000;

public final class hx extends cq {
    public static final int bx = 48;
    static final int cu = 14;
    int aa;
    double ab;
    int ac;
    int ad;
    int ae;
    int af;
    int ag;
    double ah;
    double ai;
    int aj;
    double ak;
    int al;
    boolean am;
    int an;
    double ao;
    int aq;
    int ar;
    int as;
    double at;
    int au;
    ah av;
    double aw;
    int ax;
    int ay;
    double az;

    hx(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        try {
            this.am = false;
            this.ac = 0;
            this.al = 0;
            this.af = -1813871183 * i;
            this.ad = 1970509329 * i2;
            this.an = -997462911 * i3;
            this.aa = -50319663 * i4;
            this.ag = 164853729 * i5;
            this.as = 160215837 * i6;
            this.ar = -49632157 * i7;
            this.aj = 1534922877 * i8;
            this.ae = 1493914479 * i9;
            this.aq = 1760164925 * i10;
            this.ay = -622135637 * i11;
            this.am = false;
            int i12 = ag.ad(this.af * 1182049105, 2145948855).as * 1690052581;
            if (i12 != -1) {
                this.av = cd.af(i12, 1012142155);
            } else {
                this.av = null;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "hx.<init>(" + ')');
        }
    }

    final void af(int i, int i2, int i3, int i4, int i5) {
        try {
            double d;
            if (!this.am) {
                d = (double) (i - (this.an * -271559807));
                double d2 = (double) (i2 - (this.aa * 678226481));
                double sqrt = Math.sqrt((d2 * d2) + (d * d));
                this.at = ((d * ((double) (-75273329 * this.ae))) / sqrt) + ((double) (-271559807 * this.an));
                this.ab = ((((double) (this.ae * -75273329)) * d2) / sqrt) + ((double) (678226481 * this.aa));
                this.aw = (double) (-1979773919 * this.ag);
            }
            d = (double) (((12924235 * this.ar) + 1) - i4);
            this.ai = (((double) i) - this.at) / d;
            this.az = (((double) i2) - this.ab) / d;
            this.ah = Math.sqrt((this.ai * this.ai) + (this.az * this.az));
            if (!this.am) {
                this.ak = (-this.ah) * Math.tan(0.02454369d * ((double) (-771692331 * this.aj)));
            }
            this.ao = (2.0d * ((((double) i3) - this.aw) - (this.ak * d))) / (d * d);
        } catch (Throwable e) {
            throw ba.ad(e, "hx.af(" + ')');
        }
    }

    final void an(int i, int i2, int i3, int i4) {
        double d;
        if (!this.am) {
            d = (double) (i - (this.an * -271559807));
            double d2 = (double) (i2 - (this.aa * 678226481));
            double sqrt = Math.sqrt((d2 * d2) + (d * d));
            this.at = ((d * ((double) (-75273329 * this.ae))) / sqrt) + ((double) (-271559807 * this.an));
            this.ab = ((((double) (this.ae * -75273329)) * d2) / sqrt) + ((double) (678226481 * this.aa));
            this.aw = (double) (-1979773919 * this.ag);
        }
        d = (double) (((12924235 * this.ar) + 1) - i4);
        this.ai = (((double) i) - this.at) / d;
        this.az = (((double) i2) - this.ab) / d;
        this.ah = Math.sqrt((this.ai * this.ai) + (this.az * this.az));
        if (!this.am) {
            this.ak = (-this.ah) * Math.tan(0.02454369d * ((double) (-771692331 * this.aj)));
        }
        this.ao = (2.0d * ((((double) i3) - this.aw) - (this.ak * d))) / (d * d);
    }

    final void aa(int i) {
        this.am = true;
        this.at += this.ai * ((double) i);
        this.ab += this.az * ((double) i);
        this.aw += (((double) i) * ((this.ao * 0.5d) * ((double) i))) + (this.ak * ((double) i));
        this.ak += ((double) i) * this.ao;
        this.ax = ((((int) (Math.atan2(this.ai, this.az) * 325.949d)) + 1687617630) & 2047) * 468854931;
        this.au = (((int) (Math.atan2(this.ak, this.ah) * 325.949d)) & -1085720743) * -796840834;
        if (this.av != null) {
            this.al += i * 946322807;
            while (this.al * -1859769273 > this.av.ar[-1728927445 * this.ac]) {
                this.al -= this.av.ar[-40430484 * this.ac] * 946322807;
                this.ac += 1483256510;
                if (-413687252 * this.ac >= this.av.ay.length) {
                    this.ac -= -611962105 * this.av.ae;
                    if (this.ac * 733371089 < 0 || this.ac * 1457084762 >= this.av.ay.length) {
                        this.ac = 0;
                    }
                }
            }
        }
    }

    final void ad(int i, int i2) {
        try {
            this.am = true;
            this.at += this.ai * ((double) i);
            this.ab += this.az * ((double) i);
            this.aw += (((double) i) * ((this.ao * 0.5d) * ((double) i))) + (this.ak * ((double) i));
            this.ak += ((double) i) * this.ao;
            this.ax = ((((int) (Math.atan2(this.ai, this.az) * 325.949d)) + 1024) & 2047) * 468854931;
            this.au = (((int) (Math.atan2(this.ak, this.ah) * 325.949d)) & 2047) * 516332499;
            if (this.av != null) {
                this.al += i * 946322807;
                while (this.al * -1859769273 > this.av.ar[this.ac * 1248708835]) {
                    this.al -= this.av.ar[this.ac * 1248708835] * 946322807;
                    this.ac += 299482315;
                    if (this.ac * 1248708835 >= this.av.ay.length) {
                        this.ac -= -611962105 * this.av.ae;
                        if (this.ac * 1248708835 < 0 || this.ac * 1248708835 >= this.av.ay.length) {
                            this.ac = 0;
                        }
                    }
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "hx.ad(" + ')');
        }
    }

    final void ag(int i) {
        this.am = true;
        this.at += this.ai * ((double) i);
        this.ab += this.az * ((double) i);
        this.aw += (((double) i) * ((this.ao * 0.5d) * ((double) i))) + (this.ak * ((double) i));
        this.ak += ((double) i) * this.ao;
        this.ax = ((((int) (Math.atan2(this.ai, this.az) * 325.949d)) + 1024) & 2047) * 468854931;
        this.au = (((int) (Math.atan2(this.ak, this.ah) * 325.949d)) & 2047) * 516332499;
        if (this.av != null) {
            this.al += i * 946322807;
            while (this.al * -1859769273 > this.av.ar[this.ac * 1248708835]) {
                this.al -= this.av.ar[this.ac * 1248708835] * 946322807;
                this.ac += 299482315;
                if (this.ac * 1248708835 >= this.av.ay.length) {
                    this.ac -= -611962105 * this.av.ae;
                    if (this.ac * 1248708835 < 0 || this.ac * 1248708835 >= this.av.ay.length) {
                        this.ac = 0;
                    }
                }
            }
        }
    }

    protected final cl ac() {
        try {
            cl ag = ag.ad(1182049105 * this.af, 1887057622).ag(1248708835 * this.ac, -1939193665);
            if (ag == null) {
                return null;
            }
            ag.ai(this.au * -198609829);
            return ag;
        } catch (Throwable e) {
            throw ba.ad(e, "hx.ac(" + ')');
        }
    }

    protected final cl dh() {
        cl ag = ag.ad(1182049105 * this.af, 1996042044).ag(1248708835 * this.ac, -1766824117);
        if (ag == null) {
            return null;
        }
        ag.ai(this.au * -198609829);
        return ag;
    }

    protected final cl dn() {
        cl ag = ag.ad(-2075455121 * this.af, 1775593026).ag(-1003985489 * this.ac, -1954516361);
        if (ag == null) {
            return null;
        }
        ag.ai(this.au * -198609829);
        return ag;
    }

    protected final cl dx() {
        cl ag = ag.ad(-671156126 * this.af, 1824137425).ag(1248708835 * this.ac, -2125569035);
        if (ag == null) {
            return null;
        }
        ag.ai(this.au * -1604612010);
        return ag;
    }

    protected final cl dy() {
        cl ag = ag.ad(1182049105 * this.af, 1734497117).ag(1248708835 * this.ac, -2117614499);
        if (ag == null) {
            return null;
        }
        ag.ai(this.au * -198609829);
        return ag;
    }

    static final void fe(int i) {
        int i2 = 0;
        while (i2 < -1675758365 * gw.ay) {
            try {
                client.hb[gw.as[i2]].aa((byte) 5);
                i2++;
            } catch (Throwable e) {
                throw ba.ad(e, "hx.fe(" + ')');
            }
        }
        as.aa((byte) 16);
        if (df.my != null) {
            df.my.dl(-979465386);
        }
    }
}
