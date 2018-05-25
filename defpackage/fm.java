package p000;

public class fm {
    static final int aj = 9;
    static fx as = null;
    static final int pv = 7;
    kb aa;
    kf ad;
    kf af;
    kb an;

    public fm(kf kfVar, kf kfVar2) {
        try {
            this.an = new kb(256);
            this.aa = new kb(256);
            this.af = kfVar;
            this.ad = kfVar2;
        } catch (Throwable e) {
            throw ba.ad(e, "fm.<init>(" + ')');
        }
    }

    fc af(int i, int i2, int[] iArr, int i3) {
        long j = (long) (((((i << 4) & 65535) | (i >>> 12)) ^ i2) | (i << 16));
        try {
            fc fcVar = (fc) this.aa.af(j);
            if (fcVar != null) {
                return fcVar;
            }
            if (iArr != null && iArr[0] <= 0) {
                return null;
            }
            fu af = fu.af(this.af, i, i2);
            if (af == null) {
                return null;
            }
            fcVar = af.ad();
            this.aa.ad(fcVar, j);
            if (iArr == null) {
                return fcVar;
            }
            iArr[0] = iArr[0] - fcVar.an.length;
            return fcVar;
        } catch (Throwable e) {
            throw ba.ad(e, "fm.af(" + ')');
        }
    }

    fc ag(int i, int i2, int[] iArr) {
        long j = (long) (((((i << 4) & 65535) | (i >>> 12)) ^ i2) | (i << 16));
        fc fcVar = (fc) this.aa.af(j);
        if (fcVar != null) {
            return fcVar;
        }
        if (iArr != null && iArr[0] <= 0) {
            return null;
        }
        fu af = fu.af(this.af, i, i2);
        if (af == null) {
            return null;
        }
        fcVar = af.ad();
        this.aa.ad(fcVar, j);
        if (iArr == null) {
            return fcVar;
        }
        iArr[0] = iArr[0] - fcVar.an.length;
        return fcVar;
    }

    fc as(int i, int i2, int[] iArr) {
        long j = (long) (((((i << 4) & 2141570497) | (i >>> 12)) ^ i2) | (i << 16));
        fc fcVar = (fc) this.aa.af(j);
        if (fcVar != null) {
            return fcVar;
        }
        if (iArr != null && iArr[0] <= 0) {
            return null;
        }
        fu af = fu.af(this.af, i, i2);
        if (af == null) {
            return null;
        }
        fcVar = af.ad();
        this.aa.ad(fcVar, j);
        if (iArr == null) {
            return fcVar;
        }
        iArr[0] = iArr[0] - fcVar.an.length;
        return fcVar;
    }

    fc ay(int i, int i2, int[] iArr) {
        long j = (long) (((((i << 4) & 65535) | (i >>> 12)) ^ i2) | (i << 16));
        fc fcVar = (fc) this.aa.af(j);
        if (fcVar != null) {
            return fcVar;
        }
        if (iArr != null && iArr[0] <= 0) {
            return null;
        }
        fu af = fu.af(this.af, i, i2);
        if (af == null) {
            return null;
        }
        fcVar = af.ad();
        this.aa.ad(fcVar, j);
        if (iArr == null) {
            return fcVar;
        }
        iArr[0] = iArr[0] - fcVar.an.length;
        return fcVar;
    }

    fc ad(int i, int i2, int[] iArr, int i3) {
        long j = 4294967296L ^ ((long) (((((i << 4) & 65535) | (i >>> 12)) ^ i2) | (i << 16)));
        try {
            fc fcVar = (fc) this.aa.af(j);
            if (fcVar != null) {
                return fcVar;
            }
            if (iArr != null && iArr[0] <= 0) {
                return null;
            }
            fp fpVar;
            fp fpVar2 = (fp) this.an.af(j);
            if (fpVar2 == null) {
                kd aj = fp.aj(this.ad, i, i2);
                if (aj == null) {
                    return null;
                }
                this.an.ad(aj, j);
                fpVar = aj;
            } else {
                fpVar = fpVar2;
            }
            fcVar = fpVar.ae(iArr);
            if (fcVar == null) {
                return null;
            }
            fpVar.ki();
            this.aa.ad(fcVar, j);
            return fcVar;
        } catch (Throwable e) {
            throw ba.ad(e, "fm.ad(" + ')');
        }
    }

    fc ar(int i, int i2, int[] iArr) {
        long j = 4294967296L ^ ((long) (((((i << 4) & 65535) | (i >>> 12)) ^ i2) | (i << 16)));
        fc fcVar = (fc) this.aa.af(j);
        if (fcVar != null) {
            return fcVar;
        }
        if (iArr != null && iArr[0] <= 0) {
            return null;
        }
        fp fpVar = (fp) this.an.af(j);
        if (fpVar == null) {
            fpVar = fp.aj(this.ad, i, i2);
            if (fpVar == null) {
                return null;
            }
            this.an.ad(fpVar, j);
        }
        kd ae = fpVar.ae(iArr);
        if (ae == null) {
            return null;
        }
        fpVar.ki();
        this.aa.ad(ae, j);
        return ae;
    }

    public fc aj(int i, int[] iArr) {
        if (this.af.ai(1336872930) == 1) {
            return af(0, i, iArr, 2139214015);
        }
        if (this.af.aw(i, -411458426) == 1) {
            return af(i, 0, iArr, 1580999162);
        }
        throw new RuntimeException();
    }

    public fc an(int i, int[] iArr, byte b) {
        try {
            if (this.af.ai(1772531020) == 1) {
                return af(0, i, iArr, 1663371717);
            }
            if (this.af.aw(i, -1652247814) == 1) {
                return af(i, 0, iArr, 390465965);
            }
            throw new RuntimeException();
        } catch (Throwable e) {
            throw ba.ad(e, "fm.an(" + ')');
        }
    }

    public fc aa(int i, int[] iArr, int i2) {
        try {
            if (this.ad.ai(1417768690) == 1) {
                return ad(0, i, iArr, -537795290);
            }
            if (this.ad.aw(i, 1083342061) == 1) {
                return ad(i, 0, iArr, -537795290);
            }
            throw new RuntimeException();
        } catch (Throwable e) {
            throw ba.ad(e, "fm.aa(" + ')');
        }
    }
}
