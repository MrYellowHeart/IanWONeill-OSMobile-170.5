package p000;

public class fh extends fb {
    int aa;
    int ab;
    int ad;
    int ae;
    int af;
    int ag;
    int aj;
    int am;
    int an;
    boolean aq;
    int ar;
    int as;
    int at;
    int aw;
    int ay;

    static int af(int i, int i2) {
        return i2 < 0 ? i : (int) ((((double) i) * Math.sqrt(((double) (16384 - i2)) * 1.220703125E-4d)) + 0.5d);
    }

    static int ad(int i, int i2) {
        return i2 < 0 ? -i : (int) ((((double) i) * Math.sqrt(((double) i2) * 1.220703125E-4d)) + 0.5d);
    }

    static int cd(int i, int i2) {
        return i2 < 0 ? -i : (int) ((((double) i) * Math.sqrt(((double) i2) * 1.220703125E-4d)) + 0.5d);
    }

    static int cs(int i, int i2) {
        return i2 < 0 ? -i : (int) ((((double) i) * Math.sqrt(((double) i2) * 1.220703125E-4d)) + 0.5d);
    }

    int bk() {
        int i = (this.ag * 3) >> 6;
        int i2 = ((i >> 31) ^ i) + (i >>> 31);
        i = this.ar == 0 ? i2 - ((i2 * this.af) / (((fc) this.ah).an.length << 8)) : this.ar >= 0 ? i2 - ((i2 * this.aj) / ((fc) this.ah).an.length) : i2;
        if (i > 255) {
            return 255;
        }
        return i;
    }

    int ch() {
        int i = (this.ag * 3) >> 6;
        int i2 = ((i >> 31) ^ i) + (i >>> 31);
        i = this.ar == 0 ? i2 - ((i2 * this.af) / (((fc) this.ah).an.length << 8)) : this.ar >= 0 ? i2 - ((i2 * this.aj) / ((fc) this.ah).an.length) : i2;
        return i > 255 ? 255 : i;
    }

    int cm() {
        int i = (this.ag * 3) >> 6;
        int i2 = ((i >> 31) ^ i) + (i >>> 31);
        i = this.ar == 0 ? i2 - ((i2 * this.af) / (((fc) this.ah).an.length << 8)) : this.ar >= 0 ? i2 - ((i2 * this.aj) / ((fc) this.ah).an.length) : i2;
        if (i > 255) {
            return 255;
        }
        return i;
    }

    int cq() {
        int i = (this.ag * 3) >> 6;
        int i2 = ((i >> 31) ^ i) + (i >>> 31);
        i = this.ar == 0 ? i2 - ((i2 * this.af) / (((fc) this.ah).an.length << 8)) : this.ar >= 0 ? i2 - ((i2 * this.aj) / ((fc) this.ah).an.length) : i2;
        if (i > 255) {
            return 255;
        }
        return i;
    }

    fh(fc fcVar, int i, int i2) {
        this.ah = fcVar;
        this.aj = fcVar.aa;
        this.ae = fcVar.ag;
        this.aq = fcVar.ay;
        this.ad = i;
        this.an = i2;
        this.aa = 8192;
        this.af = 0;
        ag();
    }

    fh(fc fcVar, int i, int i2, int i3) {
        this.ah = fcVar;
        this.aj = fcVar.aa;
        this.ae = fcVar.ag;
        this.aq = fcVar.ay;
        this.ad = i;
        this.an = i2;
        this.aa = i3;
        this.af = 0;
        ag();
    }

    public static fh an(fc fcVar, int i, int i2) {
        return (fcVar.an == null || fcVar.an.length == 0) ? null : new fh(fcVar, (int) (((((long) fcVar.ad) * 256) * ((long) i)) / ((long) (fa.af * 1299793156))), i2 << 6);
    }

    public static fh cj(fc fcVar, int i, int i2) {
        return (fcVar.an == null || fcVar.an.length == 0) ? null : new fh(fcVar, (int) (((((long) fcVar.ad) * 256) * ((long) i)) / ((long) (fa.af * 1299793156))), i2 << 6);
    }

    public static fh cp(fc fcVar, int i, int i2) {
        return (fcVar.an == null || fcVar.an.length == 0) ? null : new fh(fcVar, (int) (((((long) fcVar.ad) * 256) * ((long) i)) / ((long) (fa.af * 1299793156))), i2 << 6);
    }

    public static fh aa(fc fcVar, int i, int i2, int i3) {
        return (fcVar.an == null || fcVar.an.length == 0) ? null : new fh(fcVar, i, i2, i3);
    }

    public static fh cb(fc fcVar, int i, int i2, int i3) {
        return (fcVar.an == null || fcVar.an.length == 0) ? null : new fh(fcVar, i, i2, i3);
    }

    public static fh ct(fc fcVar, int i, int i2, int i3) {
        if (fcVar.an == null || fcVar.an.length == 0) {
            return null;
        }
        return new fh(fcVar, i, i2, i3);
    }

    void ag() {
        this.ag = this.an;
        this.ay = fh.af(this.an, this.aa);
        this.as = fh.ad(this.an, this.aa);
    }

    void cu() {
        this.ag = this.an;
        this.ay = fh.af(this.an, this.aa);
        this.as = fh.ad(this.an, this.aa);
    }

    void dj() {
        this.ag = this.an;
        this.ay = fh.af(this.an, this.aa);
        this.as = fh.ad(this.an, this.aa);
    }

    public synchronized void ae(int i) {
        this.ar = i;
    }

    public synchronized void am(int i) {
        ab(i << 6, ai());
    }

    public synchronized void dc(int i) {
        ab(i << 6, ai());
    }

    public synchronized void dk(int i) {
        ab(i << 6, ai());
    }

    public synchronized void m8do(int i) {
        ab(i << 6, ai());
    }

    synchronized void at(int i) {
        ab(i, ai());
    }

    synchronized void dt(int i) {
        ab(i, ai());
    }

    synchronized void dv(int i) {
        ab(i, ai());
    }

    synchronized void dz(int i) {
        ab(i, ai());
    }

    synchronized void ab(int i, int i2) {
        this.an = i;
        this.aa = i2;
        this.am = 0;
        ag();
    }

    synchronized void da(int i, int i2) {
        this.an = i;
        this.aa = i2;
        this.am = 0;
        ag();
    }

    synchronized void dd(int i, int i2) {
        this.an = i;
        this.aa = i2;
        this.am = 0;
        ag();
    }

    synchronized void di(int i, int i2) {
        this.an = i;
        this.aa = i2;
        this.am = 0;
        ag();
    }

    synchronized void dl(int i, int i2) {
        this.an = i;
        this.aa = i2;
        this.am = 0;
        ag();
    }

    public synchronized int aw() {
        return this.an == Integer.MIN_VALUE ? 0 : this.an;
    }

    public synchronized int dr() {
        return this.an == Integer.MIN_VALUE ? 0 : this.an;
    }

    public synchronized int ai() {
        return this.aa < 0 ? -1 : this.aa;
    }

    public synchronized int de() {
        return this.aa < 0 ? -1 : this.aa;
    }

    public synchronized int ds() {
        return this.aa < 0 ? -1 : this.aa;
    }

    public synchronized int dw() {
        return this.aa < 0 ? -1 : this.aa;
    }

    public synchronized void az(int i) {
        int i2 = -1;
        synchronized (this) {
            int length = ((fc) this.ah).an.length << 8;
            if (i >= -1) {
                i2 = i;
            }
            if (i2 <= length) {
                length = i2;
            }
            this.af = length;
        }
    }

    public synchronized void dx(int i) {
        int i2 = -1;
        synchronized (this) {
            int length = ((fc) this.ah).an.length << 8;
            if (i >= -1) {
                i2 = i;
            }
            if (i2 <= length) {
                length = i2;
            }
            this.af = length;
        }
    }

    public synchronized void ah(boolean z) {
        this.ad = (this.ad ^ (this.ad >> 31)) + (this.ad >>> 31);
        if (z) {
            this.ad = -this.ad;
        }
    }

    void ak() {
        if (this.am != 0) {
            if (this.an == Integer.MIN_VALUE) {
                this.an = 0;
            }
            this.am = 0;
            ag();
        }
    }

    void dh() {
        if (this.am != 0) {
            if (this.an == Integer.MIN_VALUE) {
                this.an = 0;
            }
            this.am = 0;
            ag();
        }
    }

    public synchronized void ao(int i, int i2) {
        ax(i, i2, ai());
    }

    public synchronized void dn(int i, int i2) {
        ax(i, i2, ai());
    }

    public synchronized void dy(int i, int i2) {
        ax(i, i2, ai());
    }

    public synchronized void ax(int i, int i2, int i3) {
        if (i == 0) {
            ab(i2, i3);
        } else {
            int af = fh.af(i2, i3);
            int ad = fh.ad(i2, i3);
            if (this.ay == af && this.as == ad) {
                this.am = 0;
            } else {
                int i4 = i2 - this.ag;
                if (this.ag - i2 > i4) {
                    i4 = this.ag - i2;
                }
                if (af - this.ay > i4) {
                    i4 = af - this.ay;
                }
                if (this.ay - af > i4) {
                    i4 = this.ay - af;
                }
                if (ad - this.as > i4) {
                    i4 = ad - this.as;
                }
                if (this.as - ad > i4) {
                    i4 = this.as - ad;
                }
                if (i > i4) {
                    i = i4;
                }
                this.am = i;
                this.an = i2;
                this.aa = i3;
                this.at = (i2 - this.ag) / i;
                this.ab = (af - this.ay) / i;
                this.aw = (ad - this.as) / i;
            }
        }
    }

    public synchronized void au(int i) {
        if (i == 0) {
            at(0);
            ki();
        } else if (this.ay == 0 && this.as == 0) {
            this.am = 0;
            this.an = 0;
            this.ag = 0;
            ki();
        } else {
            int i2 = -this.ag;
            if (this.ag > i2) {
                i2 = this.ag;
            }
            if ((-this.ay) > i2) {
                i2 = -this.ay;
            }
            if (this.ay > i2) {
                i2 = this.ay;
            }
            if ((-this.as) > i2) {
                i2 = -this.as;
            }
            if (this.as > i2) {
                i2 = this.as;
            }
            if (i > i2) {
                i = i2;
            }
            this.am = i;
            this.an = Integer.MIN_VALUE;
            this.at = (-this.ag) / i;
            this.ab = (-this.ay) / i;
            this.aw = (-this.as) / i;
        }
    }

    public synchronized void db(int i) {
        if (i == 0) {
            at(0);
            ki();
        } else if (this.ay == 0 && this.as == 0) {
            this.am = 0;
            this.an = 0;
            this.ag = 0;
            ki();
        } else {
            int i2 = -this.ag;
            if (this.ag > i2) {
                i2 = this.ag;
            }
            if ((-this.ay) > i2) {
                i2 = -this.ay;
            }
            if (this.ay > i2) {
                i2 = this.ay;
            }
            if ((-this.as) > i2) {
                i2 = -this.as;
            }
            if (this.as > i2) {
                i2 = this.as;
            }
            if (i > i2) {
                i = i2;
            }
            this.am = i;
            this.an = Integer.MIN_VALUE;
            this.at = (-this.ag) / i;
            this.ab = (-this.ay) / i;
            this.aw = (-this.as) / i;
        }
    }

    public synchronized void dg(int i) {
        if (i == 0) {
            at(0);
            ki();
        } else if (this.ay == 0 && this.as == 0) {
            this.am = 0;
            this.an = 0;
            this.ag = 0;
            ki();
        } else {
            int i2 = -this.ag;
            if (this.ag > i2) {
                i2 = this.ag;
            }
            if ((-this.ay) > i2) {
                i2 = -this.ay;
            }
            if (this.ay > i2) {
                i2 = this.ay;
            }
            if ((-this.as) > i2) {
                i2 = -this.as;
            }
            if (this.as > i2) {
                i2 = this.as;
            }
            if (i > i2) {
                i = i2;
            }
            this.am = i;
            this.an = Integer.MIN_VALUE;
            this.at = (-this.ag) / i;
            this.ab = (-this.ay) / i;
            this.aw = (-this.as) / i;
        }
    }

    public synchronized void dm(int i) {
        if (i == 0) {
            at(0);
            ki();
        } else if (this.ay == 0 && this.as == 0) {
            this.am = 0;
            this.an = 0;
            this.ag = 0;
            ki();
        } else {
            int i2 = -this.ag;
            if (this.ag > i2) {
                i2 = this.ag;
            }
            if ((-this.ay) > i2) {
                i2 = -this.ay;
            }
            if (this.ay > i2) {
                i2 = this.ay;
            }
            if ((-this.as) > i2) {
                i2 = -this.as;
            }
            if (this.as > i2) {
                i2 = this.as;
            }
            if (i > i2) {
                i = i2;
            }
            this.am = i;
            this.an = Integer.MIN_VALUE;
            this.at = (-this.ag) / i;
            this.ab = (-this.ay) / i;
            this.aw = (-this.as) / i;
        }
    }

    public synchronized void dp(int i) {
        if (i == 0) {
            at(0);
            ki();
        } else if (this.ay == 0 && this.as == 0) {
            this.am = 0;
            this.an = 0;
            this.ag = 0;
            ki();
        } else {
            int i2 = -this.ag;
            if (this.ag > i2) {
                i2 = this.ag;
            }
            if ((-this.ay) > i2) {
                i2 = -this.ay;
            }
            if (this.ay > i2) {
                i2 = this.ay;
            }
            if ((-this.as) > i2) {
                i2 = -this.as;
            }
            if (this.as > i2) {
                i2 = this.as;
            }
            if (i > i2) {
                i = i2;
            }
            this.am = i;
            this.an = Integer.MIN_VALUE;
            this.at = (-this.ag) / i;
            this.ab = (-this.ay) / i;
            this.aw = (-this.as) / i;
        }
    }

    public synchronized void du(int i) {
        if (i == 0) {
            at(0);
            ki();
        } else if (this.ay == 0 && this.as == 0) {
            this.am = 0;
            this.an = 0;
            this.ag = 0;
            ki();
        } else {
            int i2 = -this.ag;
            if (this.ag > i2) {
                i2 = this.ag;
            }
            if ((-this.ay) > i2) {
                i2 = -this.ay;
            }
            if (this.ay > i2) {
                i2 = this.ay;
            }
            if ((-this.as) > i2) {
                i2 = -this.as;
            }
            if (this.as > i2) {
                i2 = this.as;
            }
            if (i > i2) {
                i = i2;
            }
            this.am = i;
            this.an = Integer.MIN_VALUE;
            this.at = (-this.ag) / i;
            this.ab = (-this.ay) / i;
            this.aw = (-this.as) / i;
        }
    }

    public synchronized void bv(int i) {
        if (this.ad < 0) {
            this.ad = -i;
        } else {
            this.ad = i;
        }
    }

    public synchronized void df(int i) {
        if (this.ad < 0) {
            this.ad = -i;
        } else {
            this.ad = i;
        }
    }

    public synchronized void dq(int i) {
        if (this.ad < 0) {
            this.ad = -i;
        } else {
            this.ad = i;
        }
    }

    public synchronized void er(int i) {
        if (this.ad < 0) {
            this.ad = -i;
        } else {
            this.ad = i;
        }
    }

    public synchronized int bp() {
        return this.ad < 0 ? -this.ad : this.ad;
    }

    public synchronized int ew() {
        return this.ad < 0 ? -this.ad : this.ad;
    }

    public boolean bx() {
        return this.af < 0 || this.af >= (((fc) this.ah).an.length << 8);
    }

    public boolean ek() {
        return this.af < 0 || this.af >= (((fc) this.ah).an.length << 8);
    }

    public boolean es() {
        return this.af < 0 || this.af >= (((fc) this.ah).an.length << 8);
    }

    public boolean by() {
        return this.am != 0;
    }

    public boolean ec() {
        return this.am != 0;
    }

    public boolean ep() {
        return this.am != 0;
    }

    public boolean eu() {
        return this.am != 0;
    }

    public boolean ev() {
        return this.am != 0;
    }

    public boolean ex() {
        return this.am != 0;
    }

    protected fb ac() {
        return null;
    }

    protected fb al() {
        return null;
    }

    protected fb ap() {
        return null;
    }

    protected fb av() {
        return null;
    }

    protected fb ay() {
        return null;
    }

    protected fb as() {
        return null;
    }

    protected fb bb() {
        return null;
    }

    protected fb bw() {
        return null;
    }

    protected int ar() {
        return (this.an == 0 && this.am == 0) ? 0 : 1;
    }

    protected int bc() {
        return (this.an == 0 && this.am == 0) ? 0 : 1;
    }

    protected int bg() {
        return (this.an == 0 && this.am == 0) ? 0 : 1;
    }

    protected int bh() {
        if (this.an == 0 && this.am == 0) {
            return 0;
        }
        return 1;
    }

    protected int bz() {
        return (this.an == 0 && this.am == 0) ? 0 : 1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void aj(int[] r16, int r17, int r18) {
        /*
        r15 = this;
        monitor-enter(r15);
        r1 = r15.an;	 Catch:{ all -> 0x00b3 }
        if (r1 != 0) goto L_0x0010;
    L_0x0005:
        r1 = r15.am;	 Catch:{ all -> 0x00b3 }
        if (r1 != 0) goto L_0x0010;
    L_0x0009:
        r0 = r18;
        r15.aq(r0);	 Catch:{ all -> 0x00b3 }
    L_0x000e:
        monitor-exit(r15);
        return;
    L_0x0010:
        r1 = r15.ah;	 Catch:{ all -> 0x00b3 }
        r0 = r1;
        r0 = (p000.fc) r0;	 Catch:{ all -> 0x00b3 }
        r12 = r0;
        r1 = r15.aj;	 Catch:{ all -> 0x00b3 }
        r9 = r1 << 8;
        r1 = r15.ae;	 Catch:{ all -> 0x00b3 }
        r4 = r1 << 8;
        r1 = r12.an;	 Catch:{ all -> 0x00b3 }
        r1 = r1.length;	 Catch:{ all -> 0x00b3 }
        r13 = r1 << 8;
        r14 = r4 - r9;
        if (r14 > 0) goto L_0x002a;
    L_0x0027:
        r1 = 0;
        r15.ar = r1;	 Catch:{ all -> 0x00b3 }
    L_0x002a:
        r5 = r18 + r17;
        r1 = r15.af;	 Catch:{ all -> 0x00b3 }
        if (r1 >= 0) goto L_0x0037;
    L_0x0030:
        r1 = r15.ad;	 Catch:{ all -> 0x00b3 }
        if (r1 <= 0) goto L_0x013e;
    L_0x0034:
        r1 = 0;
        r15.af = r1;	 Catch:{ all -> 0x00b3 }
    L_0x0037:
        r1 = r15.af;	 Catch:{ all -> 0x00b3 }
        if (r1 < r13) goto L_0x0043;
    L_0x003b:
        r1 = r15.ad;	 Catch:{ all -> 0x00b3 }
        if (r1 >= 0) goto L_0x0146;
    L_0x003f:
        r1 = r13 + -1;
        r15.af = r1;	 Catch:{ all -> 0x00b3 }
    L_0x0043:
        r1 = r15.ar;	 Catch:{ all -> 0x00b3 }
        if (r1 >= 0) goto L_0x01fe;
    L_0x0047:
        r1 = r15.aq;	 Catch:{ all -> 0x00b3 }
        if (r1 == 0) goto L_0x0220;
    L_0x004b:
        r1 = r15.ad;	 Catch:{ all -> 0x00b3 }
        if (r1 >= 0) goto L_0x024a;
    L_0x004f:
        r1 = r12.an;	 Catch:{ all -> 0x00b3 }
        r2 = r15.aj;	 Catch:{ all -> 0x00b3 }
        r11 = r1[r2];	 Catch:{ all -> 0x00b3 }
        r6 = r15;
        r7 = r16;
        r8 = r17;
        r10 = r5;
        r3 = r6.ba(r7, r8, r9, r10, r11);	 Catch:{ all -> 0x00b3 }
        r1 = r15.af;	 Catch:{ all -> 0x00b3 }
        if (r1 >= r9) goto L_0x000e;
    L_0x0063:
        r1 = r9 + r9;
        r1 = r1 + -1;
        r2 = r15.af;	 Catch:{ all -> 0x00b3 }
        r1 = r1 - r2;
        r15.af = r1;	 Catch:{ all -> 0x00b3 }
        r1 = r15.ad;	 Catch:{ all -> 0x00b3 }
        r1 = -r1;
        r15.ad = r1;	 Catch:{ all -> 0x00b3 }
    L_0x0071:
        r1 = r12.an;	 Catch:{ all -> 0x00b3 }
        r2 = r15.ae;	 Catch:{ all -> 0x00b3 }
        r2 = r2 + -1;
        r6 = r1[r2];	 Catch:{ all -> 0x00b3 }
        r1 = r15;
        r2 = r16;
        r8 = r1.bn(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x00b3 }
        r1 = r15.af;	 Catch:{ all -> 0x00b3 }
        if (r1 < r4) goto L_0x000e;
    L_0x0084:
        r1 = r4 + r4;
        r1 = r1 + -1;
        r2 = r15.af;	 Catch:{ all -> 0x00b3 }
        r1 = r1 - r2;
        r15.af = r1;	 Catch:{ all -> 0x00b3 }
        r1 = r15.ad;	 Catch:{ all -> 0x00b3 }
        r1 = -r1;
        r15.ad = r1;	 Catch:{ all -> 0x00b3 }
        r1 = r12.an;	 Catch:{ all -> 0x00b3 }
        r2 = r15.aj;	 Catch:{ all -> 0x00b3 }
        r11 = r1[r2];	 Catch:{ all -> 0x00b3 }
        r6 = r15;
        r7 = r16;
        r10 = r5;
        r3 = r6.ba(r7, r8, r9, r10, r11);	 Catch:{ all -> 0x00b3 }
        r1 = r15.af;	 Catch:{ all -> 0x00b3 }
        if (r1 >= r9) goto L_0x000e;
    L_0x00a4:
        r1 = r9 + r9;
        r1 = r1 + -1;
        r2 = r15.af;	 Catch:{ all -> 0x00b3 }
        r1 = r1 - r2;
        r15.af = r1;	 Catch:{ all -> 0x00b3 }
        r1 = r15.ad;	 Catch:{ all -> 0x00b3 }
        r1 = -r1;
        r15.ad = r1;	 Catch:{ all -> 0x00b3 }
        goto L_0x0071;
    L_0x00b3:
        r1 = move-exception;
        monitor-exit(r15);
        throw r1;
    L_0x00b6:
        r1 = r4 + r4;
        r1 = r1 + -1;
        r2 = r15.af;	 Catch:{ all -> 0x00b3 }
        r1 = r1 - r2;
        r15.af = r1;	 Catch:{ all -> 0x00b3 }
        r1 = r15.ad;	 Catch:{ all -> 0x00b3 }
        r1 = -r1;
        r15.ad = r1;	 Catch:{ all -> 0x00b3 }
        r1 = r15.ar;	 Catch:{ all -> 0x00b3 }
        r1 = r1 + -1;
        r15.ar = r1;	 Catch:{ all -> 0x00b3 }
        if (r1 != 0) goto L_0x014e;
    L_0x00cc:
        r3 = r8;
    L_0x00cd:
        r1 = r15.ad;	 Catch:{ all -> 0x00b3 }
        if (r1 >= 0) goto L_0x0228;
    L_0x00d1:
        r4 = 0;
        r6 = 0;
        r1 = r15;
        r2 = r16;
        r1.ba(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x00b3 }
        r1 = r15.af;	 Catch:{ all -> 0x00b3 }
        if (r1 >= 0) goto L_0x000e;
    L_0x00dd:
        r1 = -1;
        r15.af = r1;	 Catch:{ all -> 0x00b3 }
        r15.ak();	 Catch:{ all -> 0x00b3 }
        r15.ki();	 Catch:{ all -> 0x00b3 }
        goto L_0x000e;
    L_0x00e8:
        r3 = r17;
    L_0x00ea:
        r1 = r12.an;	 Catch:{ all -> 0x00b3 }
        r2 = r15.ae;	 Catch:{ all -> 0x00b3 }
        r2 = r2 + -1;
        r6 = r1[r2];	 Catch:{ all -> 0x00b3 }
        r1 = r15;
        r2 = r16;
        r8 = r1.bn(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x00b3 }
        r1 = r15.af;	 Catch:{ all -> 0x00b3 }
        if (r1 >= r4) goto L_0x00b6;
    L_0x00fd:
        goto L_0x000e;
    L_0x00ff:
        r2 = r15.af;	 Catch:{ all -> 0x00b3 }
        r6 = r14 * r1;
        r2 = r2 + r6;
        r15.af = r2;	 Catch:{ all -> 0x00b3 }
        r2 = r15.ar;	 Catch:{ all -> 0x00b3 }
        r1 = r2 - r1;
        r15.ar = r1;	 Catch:{ all -> 0x00b3 }
        r8 = r3;
    L_0x010d:
        r1 = r12.an;	 Catch:{ all -> 0x00b3 }
        r2 = r15.ae;	 Catch:{ all -> 0x00b3 }
        r2 = r2 + -1;
        r11 = r1[r2];	 Catch:{ all -> 0x00b3 }
        r6 = r15;
        r7 = r16;
        r10 = r5;
        r3 = r6.ba(r7, r8, r9, r10, r11);	 Catch:{ all -> 0x00b3 }
        r1 = r15.af;	 Catch:{ all -> 0x00b3 }
        if (r1 >= r9) goto L_0x000e;
    L_0x0121:
        r1 = r4 + -1;
        r2 = r15.af;	 Catch:{ all -> 0x00b3 }
        r1 = r1 - r2;
        r1 = r1 / r14;
        r2 = r15.ar;	 Catch:{ all -> 0x00b3 }
        if (r1 < r2) goto L_0x00ff;
    L_0x012b:
        r1 = r15.af;	 Catch:{ all -> 0x00b3 }
        r2 = r15.ar;	 Catch:{ all -> 0x00b3 }
        r2 = r2 * r14;
        r1 = r1 + r2;
        r15.af = r1;	 Catch:{ all -> 0x00b3 }
        r1 = 0;
        r15.ar = r1;	 Catch:{ all -> 0x00b3 }
        goto L_0x00cd;
    L_0x0137:
        r1 = r15.ad;	 Catch:{ all -> 0x00b3 }
        if (r1 >= 0) goto L_0x0242;
    L_0x013b:
        r8 = r17;
        goto L_0x010d;
    L_0x013e:
        r15.ak();	 Catch:{ all -> 0x00b3 }
        r15.ki();	 Catch:{ all -> 0x00b3 }
        goto L_0x000e;
    L_0x0146:
        r15.ak();	 Catch:{ all -> 0x00b3 }
        r15.ki();	 Catch:{ all -> 0x00b3 }
        goto L_0x000e;
    L_0x014e:
        r1 = r12.an;	 Catch:{ all -> 0x00b3 }
        r2 = r15.aj;	 Catch:{ all -> 0x00b3 }
        r11 = r1[r2];	 Catch:{ all -> 0x00b3 }
        r6 = r15;
        r7 = r16;
        r10 = r5;
        r3 = r6.ba(r7, r8, r9, r10, r11);	 Catch:{ all -> 0x00b3 }
        r1 = r15.af;	 Catch:{ all -> 0x00b3 }
        if (r1 >= r9) goto L_0x000e;
    L_0x0160:
        r1 = r9 + r9;
        r1 = r1 + -1;
        r2 = r15.af;	 Catch:{ all -> 0x00b3 }
        r1 = r1 - r2;
        r15.af = r1;	 Catch:{ all -> 0x00b3 }
        r1 = r15.ad;	 Catch:{ all -> 0x00b3 }
        r1 = -r1;
        r15.ad = r1;	 Catch:{ all -> 0x00b3 }
        r1 = r15.ar;	 Catch:{ all -> 0x00b3 }
        r1 = r1 + -1;
        r15.ar = r1;	 Catch:{ all -> 0x00b3 }
        if (r1 != 0) goto L_0x00ea;
    L_0x0176:
        goto L_0x00cd;
    L_0x0178:
        r1 = r4 + -1;
        r2 = r4 + -1;
        r3 = r15.af;	 Catch:{ all -> 0x00b3 }
        r2 = r2 - r3;
        r2 = r2 % r14;
        r1 = r1 - r2;
        r15.af = r1;	 Catch:{ all -> 0x00b3 }
    L_0x0183:
        r1 = r12.an;	 Catch:{ all -> 0x00b3 }
        r2 = r15.ae;	 Catch:{ all -> 0x00b3 }
        r2 = r2 + -1;
        r11 = r1[r2];	 Catch:{ all -> 0x00b3 }
        r6 = r15;
        r7 = r16;
        r10 = r5;
        r8 = r6.ba(r7, r8, r9, r10, r11);	 Catch:{ all -> 0x00b3 }
        r1 = r15.af;	 Catch:{ all -> 0x00b3 }
        if (r1 < r9) goto L_0x0178;
    L_0x0197:
        goto L_0x000e;
    L_0x0199:
        r1 = r15.af;	 Catch:{ all -> 0x00b3 }
        r1 = r1 - r9;
        r1 = r1 % r14;
        r1 = r1 + r9;
        r15.af = r1;	 Catch:{ all -> 0x00b3 }
    L_0x01a0:
        r1 = r12.an;	 Catch:{ all -> 0x00b3 }
        r2 = r15.aj;	 Catch:{ all -> 0x00b3 }
        r6 = r1[r2];	 Catch:{ all -> 0x00b3 }
        r1 = r15;
        r2 = r16;
        r3 = r1.bn(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x00b3 }
        r1 = r15.af;	 Catch:{ all -> 0x00b3 }
        if (r1 >= r4) goto L_0x0199;
    L_0x01b1:
        goto L_0x000e;
    L_0x01b3:
        r2 = r15.af;	 Catch:{ all -> 0x00b3 }
        r6 = r14 * r1;
        r2 = r2 - r6;
        r15.af = r2;	 Catch:{ all -> 0x00b3 }
        r2 = r15.ar;	 Catch:{ all -> 0x00b3 }
        r1 = r2 - r1;
        r15.ar = r1;	 Catch:{ all -> 0x00b3 }
    L_0x01c0:
        r1 = r12.an;	 Catch:{ all -> 0x00b3 }
        r2 = r15.aj;	 Catch:{ all -> 0x00b3 }
        r6 = r1[r2];	 Catch:{ all -> 0x00b3 }
        r1 = r15;
        r2 = r16;
        r3 = r1.bn(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x00b3 }
        r1 = r15.af;	 Catch:{ all -> 0x00b3 }
        if (r1 < r4) goto L_0x000e;
    L_0x01d1:
        r1 = r15.af;	 Catch:{ all -> 0x00b3 }
        r1 = r1 - r9;
        r1 = r1 / r14;
        r2 = r15.ar;	 Catch:{ all -> 0x00b3 }
        if (r1 < r2) goto L_0x01b3;
    L_0x01d9:
        r1 = r15.af;	 Catch:{ all -> 0x00b3 }
        r2 = r15.ar;	 Catch:{ all -> 0x00b3 }
        r2 = r2 * r14;
        r1 = r1 - r2;
        r15.af = r1;	 Catch:{ all -> 0x00b3 }
        r1 = 0;
        r15.ar = r1;	 Catch:{ all -> 0x00b3 }
        goto L_0x00cd;
    L_0x01e6:
        r1 = r9 + r9;
        r1 = r1 + -1;
        r2 = r15.af;	 Catch:{ all -> 0x00b3 }
        r1 = r1 - r2;
        r15.af = r1;	 Catch:{ all -> 0x00b3 }
        r1 = r15.ad;	 Catch:{ all -> 0x00b3 }
        r1 = -r1;
        r15.ad = r1;	 Catch:{ all -> 0x00b3 }
        r1 = r15.ar;	 Catch:{ all -> 0x00b3 }
        r1 = r1 + -1;
        r15.ar = r1;	 Catch:{ all -> 0x00b3 }
        if (r1 != 0) goto L_0x00ea;
    L_0x01fc:
        goto L_0x00cd;
    L_0x01fe:
        r1 = r15.ar;	 Catch:{ all -> 0x00b3 }
        if (r1 <= 0) goto L_0x0246;
    L_0x0202:
        r1 = r15.aq;	 Catch:{ all -> 0x00b3 }
        if (r1 == 0) goto L_0x0137;
    L_0x0206:
        r1 = r15.ad;	 Catch:{ all -> 0x00b3 }
        if (r1 >= 0) goto L_0x00e8;
    L_0x020a:
        r1 = r12.an;	 Catch:{ all -> 0x00b3 }
        r2 = r15.aj;	 Catch:{ all -> 0x00b3 }
        r11 = r1[r2];	 Catch:{ all -> 0x00b3 }
        r6 = r15;
        r7 = r16;
        r8 = r17;
        r10 = r5;
        r3 = r6.ba(r7, r8, r9, r10, r11);	 Catch:{ all -> 0x00b3 }
        r1 = r15.af;	 Catch:{ all -> 0x00b3 }
        if (r1 < r9) goto L_0x01e6;
    L_0x021e:
        goto L_0x000e;
    L_0x0220:
        r1 = r15.ad;	 Catch:{ all -> 0x00b3 }
        if (r1 >= 0) goto L_0x023e;
    L_0x0224:
        r8 = r17;
        goto L_0x0183;
    L_0x0228:
        r6 = 0;
        r1 = r15;
        r2 = r16;
        r4 = r13;
        r1.bn(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x00b3 }
        r1 = r15.af;	 Catch:{ all -> 0x00b3 }
        if (r1 < r13) goto L_0x000e;
    L_0x0234:
        r15.af = r13;	 Catch:{ all -> 0x00b3 }
        r15.ak();	 Catch:{ all -> 0x00b3 }
        r15.ki();	 Catch:{ all -> 0x00b3 }
        goto L_0x000e;
    L_0x023e:
        r3 = r17;
        goto L_0x01a0;
    L_0x0242:
        r3 = r17;
        goto L_0x01c0;
    L_0x0246:
        r3 = r17;
        goto L_0x00cd;
    L_0x024a:
        r3 = r17;
        goto L_0x0071;
        */
        throw new UnsupportedOperationException("Method not decompiled: fh.aj(int[], int, int):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void bf(int[] r16, int r17, int r18) {
        /*
        r15 = this;
        monitor-enter(r15);
        r1 = r15.an;	 Catch:{ all -> 0x0040 }
        if (r1 != 0) goto L_0x0055;
    L_0x0005:
        r1 = r15.am;	 Catch:{ all -> 0x0040 }
        if (r1 != 0) goto L_0x0055;
    L_0x0009:
        r0 = r18;
        r15.aq(r0);	 Catch:{ all -> 0x0040 }
    L_0x000e:
        monitor-exit(r15);
        return;
    L_0x0010:
        r1 = r4 + r4;
        r1 = r1 + -1;
        r2 = r15.af;	 Catch:{ all -> 0x0040 }
        r1 = r1 - r2;
        r15.af = r1;	 Catch:{ all -> 0x0040 }
        r1 = r15.ad;	 Catch:{ all -> 0x0040 }
        r1 = -r1;
        r15.ad = r1;	 Catch:{ all -> 0x0040 }
        r1 = r15.ar;	 Catch:{ all -> 0x0040 }
        r1 = r1 + -1;
        r15.ar = r1;	 Catch:{ all -> 0x0040 }
        if (r1 != 0) goto L_0x0173;
    L_0x0026:
        r1 = r15.ad;	 Catch:{ all -> 0x0040 }
        if (r1 >= 0) goto L_0x01f0;
    L_0x002a:
        r4 = 0;
        r6 = 0;
        r1 = r15;
        r2 = r16;
        r1.ba(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x0040 }
        r1 = r15.af;	 Catch:{ all -> 0x0040 }
        if (r1 >= 0) goto L_0x000e;
    L_0x0036:
        r1 = -1;
        r15.af = r1;	 Catch:{ all -> 0x0040 }
        r15.ak();	 Catch:{ all -> 0x0040 }
        r15.ki();	 Catch:{ all -> 0x0040 }
        goto L_0x000e;
    L_0x0040:
        r1 = move-exception;
        monitor-exit(r15);
        throw r1;
    L_0x0043:
        r1 = r12.an;	 Catch:{ all -> 0x0040 }
        r2 = r15.aj;	 Catch:{ all -> 0x0040 }
        r6 = r1[r2];	 Catch:{ all -> 0x0040 }
        r1 = r15;
        r2 = r16;
        r3 = r1.ba(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x0040 }
        r1 = r15.af;	 Catch:{ all -> 0x0040 }
        if (r1 < r4) goto L_0x0010;
    L_0x0054:
        goto L_0x000e;
    L_0x0055:
        r1 = r15.ah;	 Catch:{ all -> 0x0040 }
        r0 = r1;
        r0 = (p000.fc) r0;	 Catch:{ all -> 0x0040 }
        r12 = r0;
        r1 = r15.aj;	 Catch:{ all -> 0x0040 }
        r4 = r1 << 8;
        r1 = r15.ae;	 Catch:{ all -> 0x0040 }
        r9 = r1 << 8;
        r1 = r12.an;	 Catch:{ all -> 0x0040 }
        r1 = r1.length;	 Catch:{ all -> 0x0040 }
        r13 = r1 << 8;
        r14 = r9 - r4;
        if (r14 > 0) goto L_0x006f;
    L_0x006c:
        r1 = 0;
        r15.ar = r1;	 Catch:{ all -> 0x0040 }
    L_0x006f:
        r5 = r18 + r17;
        r1 = r15.af;	 Catch:{ all -> 0x0040 }
        if (r1 >= 0) goto L_0x007c;
    L_0x0075:
        r1 = r15.ad;	 Catch:{ all -> 0x0040 }
        if (r1 <= 0) goto L_0x00f7;
    L_0x0079:
        r1 = 0;
        r15.af = r1;	 Catch:{ all -> 0x0040 }
    L_0x007c:
        r1 = r15.af;	 Catch:{ all -> 0x0040 }
        if (r1 < r13) goto L_0x0088;
    L_0x0080:
        r1 = r15.ad;	 Catch:{ all -> 0x0040 }
        if (r1 >= 0) goto L_0x0136;
    L_0x0084:
        r1 = r13 + -1;
        r15.af = r1;	 Catch:{ all -> 0x0040 }
    L_0x0088:
        r1 = r15.ar;	 Catch:{ all -> 0x0040 }
        if (r1 >= 0) goto L_0x013e;
    L_0x008c:
        r1 = r15.aq;	 Catch:{ all -> 0x0040 }
        if (r1 == 0) goto L_0x0206;
    L_0x0090:
        r1 = r15.ad;	 Catch:{ all -> 0x0040 }
        if (r1 >= 0) goto L_0x0237;
    L_0x0094:
        r1 = r12.an;	 Catch:{ all -> 0x0040 }
        r2 = r15.aj;	 Catch:{ all -> 0x0040 }
        r6 = r1[r2];	 Catch:{ all -> 0x0040 }
        r1 = r15;
        r2 = r16;
        r3 = r17;
        r8 = r1.ba(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x0040 }
        r1 = r15.af;	 Catch:{ all -> 0x0040 }
        if (r1 >= r4) goto L_0x000e;
    L_0x00a7:
        r1 = r4 + r4;
        r1 = r1 + -1;
        r2 = r15.af;	 Catch:{ all -> 0x0040 }
        r1 = r1 - r2;
        r15.af = r1;	 Catch:{ all -> 0x0040 }
        r1 = r15.ad;	 Catch:{ all -> 0x0040 }
        r1 = -r1;
        r15.ad = r1;	 Catch:{ all -> 0x0040 }
    L_0x00b5:
        r1 = r12.an;	 Catch:{ all -> 0x0040 }
        r2 = r15.ae;	 Catch:{ all -> 0x0040 }
        r2 = r2 + -1;
        r11 = r1[r2];	 Catch:{ all -> 0x0040 }
        r6 = r15;
        r7 = r16;
        r10 = r5;
        r3 = r6.bn(r7, r8, r9, r10, r11);	 Catch:{ all -> 0x0040 }
        r1 = r15.af;	 Catch:{ all -> 0x0040 }
        if (r1 < r9) goto L_0x000e;
    L_0x00c9:
        r1 = r9 + r9;
        r1 = r1 + -1;
        r2 = r15.af;	 Catch:{ all -> 0x0040 }
        r1 = r1 - r2;
        r15.af = r1;	 Catch:{ all -> 0x0040 }
        r1 = r15.ad;	 Catch:{ all -> 0x0040 }
        r1 = -r1;
        r15.ad = r1;	 Catch:{ all -> 0x0040 }
        r1 = r12.an;	 Catch:{ all -> 0x0040 }
        r2 = r15.aj;	 Catch:{ all -> 0x0040 }
        r6 = r1[r2];	 Catch:{ all -> 0x0040 }
        r1 = r15;
        r2 = r16;
        r8 = r1.ba(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x0040 }
        r1 = r15.af;	 Catch:{ all -> 0x0040 }
        if (r1 >= r4) goto L_0x000e;
    L_0x00e8:
        r1 = r4 + r4;
        r1 = r1 + -1;
        r2 = r15.af;	 Catch:{ all -> 0x0040 }
        r1 = r1 - r2;
        r15.af = r1;	 Catch:{ all -> 0x0040 }
        r1 = r15.ad;	 Catch:{ all -> 0x0040 }
        r1 = -r1;
        r15.ad = r1;	 Catch:{ all -> 0x0040 }
        goto L_0x00b5;
    L_0x00f7:
        r15.ak();	 Catch:{ all -> 0x0040 }
        r15.ki();	 Catch:{ all -> 0x0040 }
        goto L_0x000e;
    L_0x00ff:
        r2 = r15.af;	 Catch:{ all -> 0x0040 }
        r6 = r14 * r1;
        r2 = r2 + r6;
        r15.af = r2;	 Catch:{ all -> 0x0040 }
        r2 = r15.ar;	 Catch:{ all -> 0x0040 }
        r1 = r2 - r1;
        r15.ar = r1;	 Catch:{ all -> 0x0040 }
    L_0x010c:
        r1 = r12.an;	 Catch:{ all -> 0x0040 }
        r2 = r15.ae;	 Catch:{ all -> 0x0040 }
        r2 = r2 + -1;
        r6 = r1[r2];	 Catch:{ all -> 0x0040 }
        r1 = r15;
        r2 = r16;
        r3 = r1.ba(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x0040 }
        r1 = r15.af;	 Catch:{ all -> 0x0040 }
        if (r1 >= r4) goto L_0x000e;
    L_0x011f:
        r1 = r9 + -1;
        r2 = r15.af;	 Catch:{ all -> 0x0040 }
        r1 = r1 - r2;
        r1 = r1 / r14;
        r2 = r15.ar;	 Catch:{ all -> 0x0040 }
        if (r1 < r2) goto L_0x00ff;
    L_0x0129:
        r1 = r15.af;	 Catch:{ all -> 0x0040 }
        r2 = r15.ar;	 Catch:{ all -> 0x0040 }
        r2 = r2 * r14;
        r1 = r1 + r2;
        r15.af = r1;	 Catch:{ all -> 0x0040 }
        r1 = 0;
        r15.ar = r1;	 Catch:{ all -> 0x0040 }
        goto L_0x0026;
    L_0x0136:
        r15.ak();	 Catch:{ all -> 0x0040 }
        r15.ki();	 Catch:{ all -> 0x0040 }
        goto L_0x000e;
    L_0x013e:
        r1 = r15.ar;	 Catch:{ all -> 0x0040 }
        if (r1 <= 0) goto L_0x0246;
    L_0x0142:
        r1 = r15.aq;	 Catch:{ all -> 0x0040 }
        if (r1 == 0) goto L_0x020d;
    L_0x0146:
        r1 = r15.ad;	 Catch:{ all -> 0x0040 }
        if (r1 >= 0) goto L_0x0242;
    L_0x014a:
        r1 = r12.an;	 Catch:{ all -> 0x0040 }
        r2 = r15.aj;	 Catch:{ all -> 0x0040 }
        r6 = r1[r2];	 Catch:{ all -> 0x0040 }
        r1 = r15;
        r2 = r16;
        r3 = r17;
        r3 = r1.ba(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x0040 }
        r1 = r15.af;	 Catch:{ all -> 0x0040 }
        if (r1 >= r4) goto L_0x000e;
    L_0x015d:
        r1 = r4 + r4;
        r1 = r1 + -1;
        r2 = r15.af;	 Catch:{ all -> 0x0040 }
        r1 = r1 - r2;
        r15.af = r1;	 Catch:{ all -> 0x0040 }
        r1 = r15.ad;	 Catch:{ all -> 0x0040 }
        r1 = -r1;
        r15.ad = r1;	 Catch:{ all -> 0x0040 }
        r1 = r15.ar;	 Catch:{ all -> 0x0040 }
        r1 = r1 + -1;
        r15.ar = r1;	 Catch:{ all -> 0x0040 }
        if (r1 == 0) goto L_0x0026;
    L_0x0173:
        r8 = r3;
    L_0x0174:
        r1 = r12.an;	 Catch:{ all -> 0x0040 }
        r2 = r15.ae;	 Catch:{ all -> 0x0040 }
        r2 = r2 + -1;
        r11 = r1[r2];	 Catch:{ all -> 0x0040 }
        r6 = r15;
        r7 = r16;
        r10 = r5;
        r3 = r6.bn(r7, r8, r9, r10, r11);	 Catch:{ all -> 0x0040 }
        r1 = r15.af;	 Catch:{ all -> 0x0040 }
        if (r1 < r9) goto L_0x000e;
    L_0x0188:
        r1 = r9 + r9;
        r1 = r1 + -1;
        r2 = r15.af;	 Catch:{ all -> 0x0040 }
        r1 = r1 - r2;
        r15.af = r1;	 Catch:{ all -> 0x0040 }
        r1 = r15.ad;	 Catch:{ all -> 0x0040 }
        r1 = -r1;
        r15.ad = r1;	 Catch:{ all -> 0x0040 }
        r1 = r15.ar;	 Catch:{ all -> 0x0040 }
        r1 = r1 + -1;
        r15.ar = r1;	 Catch:{ all -> 0x0040 }
        if (r1 != 0) goto L_0x0043;
    L_0x019e:
        goto L_0x0026;
    L_0x01a0:
        r1 = r15.af;	 Catch:{ all -> 0x0040 }
        r1 = r1 - r4;
        r1 = r1 % r14;
        r1 = r1 + r4;
        r15.af = r1;	 Catch:{ all -> 0x0040 }
    L_0x01a7:
        r1 = r12.an;	 Catch:{ all -> 0x0040 }
        r2 = r15.aj;	 Catch:{ all -> 0x0040 }
        r11 = r1[r2];	 Catch:{ all -> 0x0040 }
        r6 = r15;
        r7 = r16;
        r10 = r5;
        r8 = r6.bn(r7, r8, r9, r10, r11);	 Catch:{ all -> 0x0040 }
        r1 = r15.af;	 Catch:{ all -> 0x0040 }
        if (r1 >= r9) goto L_0x01a0;
    L_0x01b9:
        goto L_0x000e;
    L_0x01bb:
        r1 = r9 + -1;
        r2 = r9 + -1;
        r6 = r15.af;	 Catch:{ all -> 0x0040 }
        r2 = r2 - r6;
        r2 = r2 % r14;
        r1 = r1 - r2;
        r15.af = r1;	 Catch:{ all -> 0x0040 }
    L_0x01c6:
        r1 = r12.an;	 Catch:{ all -> 0x0040 }
        r2 = r15.ae;	 Catch:{ all -> 0x0040 }
        r2 = r2 + -1;
        r6 = r1[r2];	 Catch:{ all -> 0x0040 }
        r1 = r15;
        r2 = r16;
        r3 = r1.ba(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x0040 }
        r1 = r15.af;	 Catch:{ all -> 0x0040 }
        if (r1 < r4) goto L_0x01bb;
    L_0x01d9:
        goto L_0x000e;
    L_0x01db:
        r1 = r15.af;	 Catch:{ all -> 0x0040 }
        r1 = r1 - r4;
        r1 = r1 / r14;
        r2 = r15.ar;	 Catch:{ all -> 0x0040 }
        if (r1 < r2) goto L_0x0215;
    L_0x01e3:
        r1 = r15.af;	 Catch:{ all -> 0x0040 }
        r2 = r15.ar;	 Catch:{ all -> 0x0040 }
        r2 = r2 * r14;
        r1 = r1 - r2;
        r15.af = r1;	 Catch:{ all -> 0x0040 }
        r1 = 0;
        r15.ar = r1;	 Catch:{ all -> 0x0040 }
        goto L_0x0026;
    L_0x01f0:
        r6 = 0;
        r1 = r15;
        r2 = r16;
        r4 = r13;
        r1.bn(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x0040 }
        r1 = r15.af;	 Catch:{ all -> 0x0040 }
        if (r1 < r13) goto L_0x000e;
    L_0x01fc:
        r15.af = r13;	 Catch:{ all -> 0x0040 }
        r15.ak();	 Catch:{ all -> 0x0040 }
        r15.ki();	 Catch:{ all -> 0x0040 }
        goto L_0x000e;
    L_0x0206:
        r1 = r15.ad;	 Catch:{ all -> 0x0040 }
        if (r1 >= 0) goto L_0x023e;
    L_0x020a:
        r3 = r17;
        goto L_0x01c6;
    L_0x020d:
        r1 = r15.ad;	 Catch:{ all -> 0x0040 }
        if (r1 >= 0) goto L_0x023b;
    L_0x0211:
        r3 = r17;
        goto L_0x010c;
    L_0x0215:
        r2 = r15.af;	 Catch:{ all -> 0x0040 }
        r6 = r14 * r1;
        r2 = r2 - r6;
        r15.af = r2;	 Catch:{ all -> 0x0040 }
        r2 = r15.ar;	 Catch:{ all -> 0x0040 }
        r1 = r2 - r1;
        r15.ar = r1;	 Catch:{ all -> 0x0040 }
        r8 = r3;
    L_0x0223:
        r1 = r12.an;	 Catch:{ all -> 0x0040 }
        r2 = r15.aj;	 Catch:{ all -> 0x0040 }
        r11 = r1[r2];	 Catch:{ all -> 0x0040 }
        r6 = r15;
        r7 = r16;
        r10 = r5;
        r3 = r6.bn(r7, r8, r9, r10, r11);	 Catch:{ all -> 0x0040 }
        r1 = r15.af;	 Catch:{ all -> 0x0040 }
        if (r1 >= r9) goto L_0x01db;
    L_0x0235:
        goto L_0x000e;
    L_0x0237:
        r8 = r17;
        goto L_0x00b5;
    L_0x023b:
        r8 = r17;
        goto L_0x0223;
    L_0x023e:
        r8 = r17;
        goto L_0x01a7;
    L_0x0242:
        r8 = r17;
        goto L_0x0174;
    L_0x0246:
        r3 = r17;
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: fh.bf(int[], int, int):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void aq(int r7) {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r6.am;	 Catch:{ all -> 0x0097 }
        if (r0 <= 0) goto L_0x0026;
    L_0x0005:
        r0 = r6.am;	 Catch:{ all -> 0x0097 }
        if (r7 < r0) goto L_0x00c9;
    L_0x0009:
        r0 = r6.an;	 Catch:{ all -> 0x0097 }
        r1 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r0 != r1) goto L_0x0020;
    L_0x000f:
        r0 = 0;
        r6.an = r0;	 Catch:{ all -> 0x0097 }
        r0 = 0;
        r6.as = r0;	 Catch:{ all -> 0x0097 }
        r0 = 0;
        r6.ay = r0;	 Catch:{ all -> 0x0097 }
        r0 = 0;
        r6.ag = r0;	 Catch:{ all -> 0x0097 }
        r6.ki();	 Catch:{ all -> 0x0097 }
        r7 = r6.am;	 Catch:{ all -> 0x0097 }
    L_0x0020:
        r0 = 0;
        r6.am = r0;	 Catch:{ all -> 0x0097 }
        r6.ag();	 Catch:{ all -> 0x0097 }
    L_0x0026:
        r0 = r6.ah;	 Catch:{ all -> 0x0097 }
        r0 = (p000.fc) r0;	 Catch:{ all -> 0x0097 }
        r1 = r6.aj;	 Catch:{ all -> 0x0097 }
        r1 = r1 << 8;
        r2 = r6.ae;	 Catch:{ all -> 0x0097 }
        r2 = r2 << 8;
        r0 = r0.an;	 Catch:{ all -> 0x0097 }
        r0 = r0.length;	 Catch:{ all -> 0x0097 }
        r0 = r0 << 8;
        r3 = r2 - r1;
        if (r3 > 0) goto L_0x003e;
    L_0x003b:
        r4 = 0;
        r6.ar = r4;	 Catch:{ all -> 0x0097 }
    L_0x003e:
        r4 = r6.af;	 Catch:{ all -> 0x0097 }
        if (r4 >= 0) goto L_0x0049;
    L_0x0042:
        r4 = r6.ad;	 Catch:{ all -> 0x0097 }
        if (r4 <= 0) goto L_0x00e8;
    L_0x0046:
        r4 = 0;
        r6.af = r4;	 Catch:{ all -> 0x0097 }
    L_0x0049:
        r4 = r6.af;	 Catch:{ all -> 0x0097 }
        if (r4 < r0) goto L_0x0055;
    L_0x004d:
        r4 = r6.ad;	 Catch:{ all -> 0x0097 }
        if (r4 >= 0) goto L_0x0105;
    L_0x0051:
        r4 = r0 + -1;
        r6.af = r4;	 Catch:{ all -> 0x0097 }
    L_0x0055:
        r4 = r6.af;	 Catch:{ all -> 0x0097 }
        r5 = r6.ad;	 Catch:{ all -> 0x0097 }
        r5 = r5 * r7;
        r4 = r4 + r5;
        r6.af = r4;	 Catch:{ all -> 0x0097 }
        r4 = r6.ar;	 Catch:{ all -> 0x0097 }
        if (r4 >= 0) goto L_0x0160;
    L_0x0061:
        r0 = r6.aq;	 Catch:{ all -> 0x0097 }
        if (r0 == 0) goto L_0x00f0;
    L_0x0065:
        r0 = r6.ad;	 Catch:{ all -> 0x0097 }
        if (r0 >= 0) goto L_0x0132;
    L_0x0069:
        r0 = r6.af;	 Catch:{ all -> 0x0097 }
        if (r0 < r1) goto L_0x0124;
    L_0x006d:
        monitor-exit(r6);
        return;
    L_0x006f:
        r3 = r1 + r1;
        r3 = r3 + -1;
        r4 = r6.af;	 Catch:{ all -> 0x0097 }
        r3 = r3 - r4;
        r6.af = r3;	 Catch:{ all -> 0x0097 }
        r3 = r6.ad;	 Catch:{ all -> 0x0097 }
        r3 = -r3;
        r6.ad = r3;	 Catch:{ all -> 0x0097 }
        r3 = r6.ar;	 Catch:{ all -> 0x0097 }
        r3 = r3 + -1;
        r6.ar = r3;	 Catch:{ all -> 0x0097 }
        if (r3 != 0) goto L_0x0172;
    L_0x0085:
        r1 = r6.ad;	 Catch:{ all -> 0x0097 }
        if (r1 >= 0) goto L_0x00a7;
    L_0x0089:
        r0 = r6.af;	 Catch:{ all -> 0x0097 }
        if (r0 >= 0) goto L_0x006d;
    L_0x008d:
        r0 = -1;
        r6.af = r0;	 Catch:{ all -> 0x0097 }
        r6.ak();	 Catch:{ all -> 0x0097 }
        r6.ki();	 Catch:{ all -> 0x0097 }
        goto L_0x006d;
    L_0x0097:
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
    L_0x009a:
        r0 = r6.af;	 Catch:{ all -> 0x0097 }
        r2 = r3 * r1;
        r0 = r0 + r2;
        r6.af = r0;	 Catch:{ all -> 0x0097 }
        r0 = r6.ar;	 Catch:{ all -> 0x0097 }
        r0 = r0 - r1;
        r6.ar = r0;	 Catch:{ all -> 0x0097 }
        goto L_0x006d;
    L_0x00a7:
        r1 = r6.af;	 Catch:{ all -> 0x0097 }
        if (r1 < r0) goto L_0x006d;
    L_0x00ab:
        r6.af = r0;	 Catch:{ all -> 0x0097 }
        r6.ak();	 Catch:{ all -> 0x0097 }
        r6.ki();	 Catch:{ all -> 0x0097 }
        goto L_0x006d;
    L_0x00b4:
        r2 = r6.af;	 Catch:{ all -> 0x0097 }
        r1 = r2 - r1;
        r1 = r1 / r3;
        r2 = r6.ar;	 Catch:{ all -> 0x0097 }
        if (r1 < r2) goto L_0x01be;
    L_0x00bd:
        r1 = r6.af;	 Catch:{ all -> 0x0097 }
        r2 = r6.ar;	 Catch:{ all -> 0x0097 }
        r2 = r2 * r3;
        r1 = r1 - r2;
        r6.af = r1;	 Catch:{ all -> 0x0097 }
        r1 = 0;
        r6.ar = r1;	 Catch:{ all -> 0x0097 }
        goto L_0x0085;
    L_0x00c9:
        r0 = r6.ag;	 Catch:{ all -> 0x0097 }
        r1 = r6.at;	 Catch:{ all -> 0x0097 }
        r1 = r1 * r7;
        r0 = r0 + r1;
        r6.ag = r0;	 Catch:{ all -> 0x0097 }
        r0 = r6.ay;	 Catch:{ all -> 0x0097 }
        r1 = r6.ab;	 Catch:{ all -> 0x0097 }
        r1 = r1 * r7;
        r0 = r0 + r1;
        r6.ay = r0;	 Catch:{ all -> 0x0097 }
        r0 = r6.as;	 Catch:{ all -> 0x0097 }
        r1 = r6.aw;	 Catch:{ all -> 0x0097 }
        r1 = r1 * r7;
        r0 = r0 + r1;
        r6.as = r0;	 Catch:{ all -> 0x0097 }
        r0 = r6.am;	 Catch:{ all -> 0x0097 }
        r0 = r0 - r7;
        r6.am = r0;	 Catch:{ all -> 0x0097 }
        goto L_0x0026;
    L_0x00e8:
        r6.ak();	 Catch:{ all -> 0x0097 }
        r6.ki();	 Catch:{ all -> 0x0097 }
        goto L_0x006d;
    L_0x00f0:
        r0 = r6.ad;	 Catch:{ all -> 0x0097 }
        if (r0 >= 0) goto L_0x01a8;
    L_0x00f4:
        r0 = r6.af;	 Catch:{ all -> 0x0097 }
        if (r0 >= r1) goto L_0x006d;
    L_0x00f8:
        r0 = r2 + -1;
        r1 = r2 + -1;
        r2 = r6.af;	 Catch:{ all -> 0x0097 }
        r1 = r1 - r2;
        r1 = r1 % r3;
        r0 = r0 - r1;
        r6.af = r0;	 Catch:{ all -> 0x0097 }
        goto L_0x006d;
    L_0x0105:
        r6.ak();	 Catch:{ all -> 0x0097 }
        r6.ki();	 Catch:{ all -> 0x0097 }
        goto L_0x006d;
    L_0x010d:
        r1 = r2 + -1;
        r2 = r6.af;	 Catch:{ all -> 0x0097 }
        r1 = r1 - r2;
        r1 = r1 / r3;
        r2 = r6.ar;	 Catch:{ all -> 0x0097 }
        if (r1 < r2) goto L_0x009a;
    L_0x0117:
        r1 = r6.af;	 Catch:{ all -> 0x0097 }
        r2 = r6.ar;	 Catch:{ all -> 0x0097 }
        r2 = r2 * r3;
        r1 = r1 + r2;
        r6.af = r1;	 Catch:{ all -> 0x0097 }
        r1 = 0;
        r6.ar = r1;	 Catch:{ all -> 0x0097 }
        goto L_0x0085;
    L_0x0124:
        r0 = r1 + r1;
        r0 = r0 + -1;
        r3 = r6.af;	 Catch:{ all -> 0x0097 }
        r0 = r0 - r3;
        r6.af = r0;	 Catch:{ all -> 0x0097 }
        r0 = r6.ad;	 Catch:{ all -> 0x0097 }
        r0 = -r0;
        r6.ad = r0;	 Catch:{ all -> 0x0097 }
    L_0x0132:
        r0 = r6.af;	 Catch:{ all -> 0x0097 }
        if (r0 < r2) goto L_0x006d;
    L_0x0136:
        r0 = r2 + r2;
        r0 = r0 + -1;
        r3 = r6.af;	 Catch:{ all -> 0x0097 }
        r0 = r0 - r3;
        r6.af = r0;	 Catch:{ all -> 0x0097 }
        r0 = r6.ad;	 Catch:{ all -> 0x0097 }
        r0 = -r0;
        r6.ad = r0;	 Catch:{ all -> 0x0097 }
        r0 = r6.af;	 Catch:{ all -> 0x0097 }
        if (r0 >= r1) goto L_0x006d;
    L_0x0148:
        r0 = r1 + r1;
        r0 = r0 + -1;
        r3 = r6.af;	 Catch:{ all -> 0x0097 }
        r0 = r0 - r3;
        r6.af = r0;	 Catch:{ all -> 0x0097 }
        r0 = r6.ad;	 Catch:{ all -> 0x0097 }
        r0 = -r0;
        r6.ad = r0;	 Catch:{ all -> 0x0097 }
        goto L_0x0132;
    L_0x0157:
        r0 = r6.af;	 Catch:{ all -> 0x0097 }
        r0 = r0 - r1;
        r0 = r0 % r3;
        r0 = r0 + r1;
        r6.af = r0;	 Catch:{ all -> 0x0097 }
        goto L_0x006d;
    L_0x0160:
        r4 = r6.ar;	 Catch:{ all -> 0x0097 }
        if (r4 <= 0) goto L_0x0085;
    L_0x0164:
        r4 = r6.aq;	 Catch:{ all -> 0x0097 }
        if (r4 == 0) goto L_0x01ae;
    L_0x0168:
        r3 = r6.ad;	 Catch:{ all -> 0x0097 }
        if (r3 >= 0) goto L_0x0172;
    L_0x016c:
        r3 = r6.af;	 Catch:{ all -> 0x0097 }
        if (r3 < r1) goto L_0x006f;
    L_0x0170:
        goto L_0x006d;
    L_0x0172:
        r3 = r6.af;	 Catch:{ all -> 0x0097 }
        if (r3 < r2) goto L_0x006d;
    L_0x0176:
        r3 = r2 + r2;
        r3 = r3 + -1;
        r4 = r6.af;	 Catch:{ all -> 0x0097 }
        r3 = r3 - r4;
        r6.af = r3;	 Catch:{ all -> 0x0097 }
        r3 = r6.ad;	 Catch:{ all -> 0x0097 }
        r3 = -r3;
        r6.ad = r3;	 Catch:{ all -> 0x0097 }
        r3 = r6.ar;	 Catch:{ all -> 0x0097 }
        r3 = r3 + -1;
        r6.ar = r3;	 Catch:{ all -> 0x0097 }
        if (r3 == 0) goto L_0x0085;
    L_0x018c:
        r3 = r6.af;	 Catch:{ all -> 0x0097 }
        if (r3 >= r1) goto L_0x006d;
    L_0x0190:
        r3 = r1 + r1;
        r3 = r3 + -1;
        r4 = r6.af;	 Catch:{ all -> 0x0097 }
        r3 = r3 - r4;
        r6.af = r3;	 Catch:{ all -> 0x0097 }
        r3 = r6.ad;	 Catch:{ all -> 0x0097 }
        r3 = -r3;
        r6.ad = r3;	 Catch:{ all -> 0x0097 }
        r3 = r6.ar;	 Catch:{ all -> 0x0097 }
        r3 = r3 + -1;
        r6.ar = r3;	 Catch:{ all -> 0x0097 }
        if (r3 != 0) goto L_0x0172;
    L_0x01a6:
        goto L_0x0085;
    L_0x01a8:
        r0 = r6.af;	 Catch:{ all -> 0x0097 }
        if (r0 >= r2) goto L_0x0157;
    L_0x01ac:
        goto L_0x006d;
    L_0x01ae:
        r4 = r6.ad;	 Catch:{ all -> 0x0097 }
        if (r4 >= 0) goto L_0x01b8;
    L_0x01b2:
        r4 = r6.af;	 Catch:{ all -> 0x0097 }
        if (r4 < r1) goto L_0x010d;
    L_0x01b6:
        goto L_0x006d;
    L_0x01b8:
        r4 = r6.af;	 Catch:{ all -> 0x0097 }
        if (r4 >= r2) goto L_0x00b4;
    L_0x01bc:
        goto L_0x006d;
    L_0x01be:
        r0 = r6.af;	 Catch:{ all -> 0x0097 }
        r2 = r3 * r1;
        r0 = r0 - r2;
        r6.af = r0;	 Catch:{ all -> 0x0097 }
        r0 = r6.ar;	 Catch:{ all -> 0x0097 }
        r0 = r0 - r1;
        r6.ar = r0;	 Catch:{ all -> 0x0097 }
        goto L_0x006d;
        */
        throw new UnsupportedOperationException("Method not decompiled: fh.aq(int):void");
    }

    public synchronized void be(int i) {
        if (this.am > 0) {
            if (i >= this.am) {
                if (this.an == Integer.MIN_VALUE) {
                    this.an = 0;
                    this.as = 0;
                    this.ay = 0;
                    this.ag = 0;
                    ki();
                    i = this.am;
                }
                this.am = 0;
                ag();
            } else {
                this.ag += this.at * i;
                this.ay += this.ab * i;
                this.as += this.aw * i;
                this.am -= i;
            }
        }
        int i2 = this.aj << 8;
        int i3 = this.ae << 8;
        int length = ((fc) this.ah).an.length << 8;
        int i4 = i3 - i2;
        if (i4 <= 0) {
            this.ar = 0;
        }
        if (this.af < 0) {
            if (this.ad > 0) {
                this.af = 0;
            } else {
                ak();
                ki();
            }
        }
        if (this.af >= length) {
            if (this.ad < 0) {
                this.af = length - 1;
            } else {
                ak();
                ki();
            }
        }
        this.af += this.ad * i;
        if (this.ar >= 0) {
            if (this.ar > 0) {
                if (this.aq) {
                    if (this.ad < 0) {
                        if (this.af < i2) {
                            this.af = ((i2 + i2) - 1) - this.af;
                            this.ad = -this.ad;
                            i4 = this.ar - 1;
                            this.ar = i4;
                            if (i4 == 0) {
                            }
                        }
                    }
                    while (this.af >= i3) {
                        this.af = ((i3 + i3) - 1) - this.af;
                        this.ad = -this.ad;
                        i4 = this.ar - 1;
                        this.ar = i4;
                        if (i4 != 0) {
                            if (this.af >= i2) {
                                break;
                            }
                            this.af = ((i2 + i2) - 1) - this.af;
                            this.ad = -this.ad;
                            i4 = this.ar - 1;
                            this.ar = i4;
                            if (i4 == 0) {
                            }
                        }
                    }
                } else if (this.ad < 0) {
                    if (this.af < i2) {
                        i2 = ((i3 - 1) - this.af) / i4;
                        if (i2 >= this.ar) {
                            this.af += this.ar * i4;
                            this.ar = 0;
                        } else {
                            this.af += i4 * i2;
                            this.ar -= i2;
                        }
                    }
                } else if (this.af >= i3) {
                    i2 = (this.af - i2) / i4;
                    if (i2 >= this.ar) {
                        this.af -= this.ar * i4;
                        this.ar = 0;
                    } else {
                        this.af -= i4 * i2;
                        this.ar -= i2;
                    }
                }
            }
            if (this.ad < 0) {
                if (this.af < 0) {
                    this.af = -1;
                    ak();
                    ki();
                }
            } else if (this.af >= length) {
                this.af = length;
                ak();
                ki();
            }
        } else if (this.aq) {
            if (this.ad < 0) {
                if (this.af < i2) {
                    this.af = ((i2 + i2) - 1) - this.af;
                    this.ad = -this.ad;
                }
            }
            while (this.af >= i3) {
                this.af = ((i3 + i3) - 1) - this.af;
                this.ad = -this.ad;
                if (this.af >= i2) {
                    break;
                }
                this.af = ((i2 + i2) - 1) - this.af;
                this.ad = -this.ad;
            }
        } else if (this.ad < 0) {
            if (this.af < i2) {
                this.af = (i3 - 1) - (((i3 - 1) - this.af) % i4);
            }
        } else if (this.af >= i3) {
            this.af = ((this.af - i2) % i4) + i2;
        }
    }

    public synchronized void bt(int i) {
        if (this.am > 0) {
            if (i >= this.am) {
                if (this.an == Integer.MIN_VALUE) {
                    this.an = 0;
                    this.as = 0;
                    this.ay = 0;
                    this.ag = 0;
                    ki();
                    i = this.am;
                }
                this.am = 0;
                ag();
            } else {
                this.ag += this.at * i;
                this.ay += this.ab * i;
                this.as += this.aw * i;
                this.am -= i;
            }
        }
        int i2 = this.aj << 8;
        int i3 = this.ae << 8;
        int length = ((fc) this.ah).an.length << 8;
        int i4 = i3 - i2;
        if (i4 <= 0) {
            this.ar = 0;
        }
        if (this.af < 0) {
            if (this.ad > 0) {
                this.af = 0;
            } else {
                ak();
                ki();
            }
        }
        if (this.af >= length) {
            if (this.ad < 0) {
                this.af = length - 1;
            } else {
                ak();
                ki();
            }
        }
        this.af += this.ad * i;
        if (this.ar >= 0) {
            if (this.ar > 0) {
                if (this.aq) {
                    if (this.ad < 0) {
                        if (this.af < i2) {
                            this.af = ((i2 + i2) - 1) - this.af;
                            this.ad = -this.ad;
                            i4 = this.ar - 1;
                            this.ar = i4;
                            if (i4 == 0) {
                            }
                        }
                    }
                    while (this.af >= i3) {
                        this.af = ((i3 + i3) - 1) - this.af;
                        this.ad = -this.ad;
                        i4 = this.ar - 1;
                        this.ar = i4;
                        if (i4 != 0) {
                            if (this.af >= i2) {
                                break;
                            }
                            this.af = ((i2 + i2) - 1) - this.af;
                            this.ad = -this.ad;
                            i4 = this.ar - 1;
                            this.ar = i4;
                            if (i4 == 0) {
                            }
                        }
                    }
                } else if (this.ad < 0) {
                    if (this.af < i2) {
                        i2 = ((i3 - 1) - this.af) / i4;
                        if (i2 >= this.ar) {
                            this.af += this.ar * i4;
                            this.ar = 0;
                        } else {
                            this.af += i4 * i2;
                            this.ar -= i2;
                        }
                    }
                } else if (this.af >= i3) {
                    i2 = (this.af - i2) / i4;
                    if (i2 >= this.ar) {
                        this.af -= this.ar * i4;
                        this.ar = 0;
                    } else {
                        this.af -= i4 * i2;
                        this.ar -= i2;
                    }
                }
            }
            if (this.ad < 0) {
                if (this.af < 0) {
                    this.af = -1;
                    ak();
                    ki();
                }
            } else if (this.af >= length) {
                this.af = length;
                ak();
                ki();
            }
        } else if (this.aq) {
            if (this.ad < 0) {
                if (this.af < i2) {
                    this.af = ((i2 + i2) - 1) - this.af;
                    this.ad = -this.ad;
                }
            }
            while (this.af >= i3) {
                this.af = ((i3 + i3) - 1) - this.af;
                this.ad = -this.ad;
                if (this.af >= i2) {
                    break;
                }
                this.af = ((i2 + i2) - 1) - this.af;
                this.ad = -this.ad;
            }
        } else if (this.ad < 0) {
            if (this.af < i2) {
                this.af = (i3 - 1) - (((i3 - 1) - this.af) % i4);
            }
        } else if (this.af >= i3) {
            this.af = ((this.af - i2) % i4) + i2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void bu(int r7) {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r6.am;	 Catch:{ all -> 0x0076 }
        if (r0 <= 0) goto L_0x0026;
    L_0x0005:
        r0 = r6.am;	 Catch:{ all -> 0x0076 }
        if (r7 < r0) goto L_0x009f;
    L_0x0009:
        r0 = r6.an;	 Catch:{ all -> 0x0076 }
        r1 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r0 != r1) goto L_0x0020;
    L_0x000f:
        r0 = 0;
        r6.an = r0;	 Catch:{ all -> 0x0076 }
        r0 = 0;
        r6.as = r0;	 Catch:{ all -> 0x0076 }
        r0 = 0;
        r6.ay = r0;	 Catch:{ all -> 0x0076 }
        r0 = 0;
        r6.ag = r0;	 Catch:{ all -> 0x0076 }
        r6.ki();	 Catch:{ all -> 0x0076 }
        r7 = r6.am;	 Catch:{ all -> 0x0076 }
    L_0x0020:
        r0 = 0;
        r6.am = r0;	 Catch:{ all -> 0x0076 }
        r6.ag();	 Catch:{ all -> 0x0076 }
    L_0x0026:
        r0 = r6.ah;	 Catch:{ all -> 0x0076 }
        r0 = (p000.fc) r0;	 Catch:{ all -> 0x0076 }
        r1 = r6.aj;	 Catch:{ all -> 0x0076 }
        r1 = r1 << 8;
        r2 = r6.ae;	 Catch:{ all -> 0x0076 }
        r2 = r2 << 8;
        r0 = r0.an;	 Catch:{ all -> 0x0076 }
        r0 = r0.length;	 Catch:{ all -> 0x0076 }
        r0 = r0 << 8;
        r3 = r2 - r1;
        if (r3 > 0) goto L_0x003e;
    L_0x003b:
        r4 = 0;
        r6.ar = r4;	 Catch:{ all -> 0x0076 }
    L_0x003e:
        r4 = r6.af;	 Catch:{ all -> 0x0076 }
        if (r4 >= 0) goto L_0x0049;
    L_0x0042:
        r4 = r6.ad;	 Catch:{ all -> 0x0076 }
        if (r4 <= 0) goto L_0x012f;
    L_0x0046:
        r4 = 0;
        r6.af = r4;	 Catch:{ all -> 0x0076 }
    L_0x0049:
        r4 = r6.af;	 Catch:{ all -> 0x0076 }
        if (r4 < r0) goto L_0x0055;
    L_0x004d:
        r4 = r6.ad;	 Catch:{ all -> 0x0076 }
        if (r4 >= 0) goto L_0x006f;
    L_0x0051:
        r4 = r0 + -1;
        r6.af = r4;	 Catch:{ all -> 0x0076 }
    L_0x0055:
        r4 = r6.af;	 Catch:{ all -> 0x0076 }
        r5 = r6.ad;	 Catch:{ all -> 0x0076 }
        r5 = r5 * r7;
        r4 = r4 + r5;
        r6.af = r4;	 Catch:{ all -> 0x0076 }
        r4 = r6.ar;	 Catch:{ all -> 0x0076 }
        if (r4 >= 0) goto L_0x01a0;
    L_0x0061:
        r0 = r6.aq;	 Catch:{ all -> 0x0076 }
        if (r0 == 0) goto L_0x0190;
    L_0x0065:
        r0 = r6.ad;	 Catch:{ all -> 0x0076 }
        if (r0 >= 0) goto L_0x00de;
    L_0x0069:
        r0 = r6.af;	 Catch:{ all -> 0x0076 }
        if (r0 < r1) goto L_0x016a;
    L_0x006d:
        monitor-exit(r6);
        return;
    L_0x006f:
        r6.ak();	 Catch:{ all -> 0x0076 }
        r6.ki();	 Catch:{ all -> 0x0076 }
        goto L_0x006d;
    L_0x0076:
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
    L_0x0079:
        r2 = r6.af;	 Catch:{ all -> 0x0076 }
        r1 = r2 - r1;
        r1 = r1 / r3;
        r2 = r6.ar;	 Catch:{ all -> 0x0076 }
        if (r1 < r2) goto L_0x0137;
    L_0x0082:
        r1 = r6.af;	 Catch:{ all -> 0x0076 }
        r2 = r6.ar;	 Catch:{ all -> 0x0076 }
        r2 = r2 * r3;
        r1 = r1 - r2;
        r6.af = r1;	 Catch:{ all -> 0x0076 }
        r1 = 0;
        r6.ar = r1;	 Catch:{ all -> 0x0076 }
    L_0x008d:
        r1 = r6.ad;	 Catch:{ all -> 0x0076 }
        if (r1 >= 0) goto L_0x015c;
    L_0x0091:
        r0 = r6.af;	 Catch:{ all -> 0x0076 }
        if (r0 >= 0) goto L_0x006d;
    L_0x0095:
        r0 = -1;
        r6.af = r0;	 Catch:{ all -> 0x0076 }
        r6.ak();	 Catch:{ all -> 0x0076 }
        r6.ki();	 Catch:{ all -> 0x0076 }
        goto L_0x006d;
    L_0x009f:
        r0 = r6.ag;	 Catch:{ all -> 0x0076 }
        r1 = r6.at;	 Catch:{ all -> 0x0076 }
        r1 = r1 * r7;
        r0 = r0 + r1;
        r6.ag = r0;	 Catch:{ all -> 0x0076 }
        r0 = r6.ay;	 Catch:{ all -> 0x0076 }
        r1 = r6.ab;	 Catch:{ all -> 0x0076 }
        r1 = r1 * r7;
        r0 = r0 + r1;
        r6.ay = r0;	 Catch:{ all -> 0x0076 }
        r0 = r6.as;	 Catch:{ all -> 0x0076 }
        r1 = r6.aw;	 Catch:{ all -> 0x0076 }
        r1 = r1 * r7;
        r0 = r0 + r1;
        r6.as = r0;	 Catch:{ all -> 0x0076 }
        r0 = r6.am;	 Catch:{ all -> 0x0076 }
        r0 = r0 - r7;
        r6.am = r0;	 Catch:{ all -> 0x0076 }
        goto L_0x0026;
    L_0x00be:
        r0 = r2 + r2;
        r0 = r0 + -1;
        r3 = r6.af;	 Catch:{ all -> 0x0076 }
        r0 = r0 - r3;
        r6.af = r0;	 Catch:{ all -> 0x0076 }
        r0 = r6.ad;	 Catch:{ all -> 0x0076 }
        r0 = -r0;
        r6.ad = r0;	 Catch:{ all -> 0x0076 }
        r0 = r6.af;	 Catch:{ all -> 0x0076 }
        if (r0 >= r1) goto L_0x006d;
    L_0x00d0:
        r0 = r1 + r1;
        r0 = r0 + -1;
        r3 = r6.af;	 Catch:{ all -> 0x0076 }
        r0 = r0 - r3;
        r6.af = r0;	 Catch:{ all -> 0x0076 }
        r0 = r6.ad;	 Catch:{ all -> 0x0076 }
        r0 = -r0;
        r6.ad = r0;	 Catch:{ all -> 0x0076 }
    L_0x00de:
        r0 = r6.af;	 Catch:{ all -> 0x0076 }
        if (r0 >= r2) goto L_0x00be;
    L_0x00e2:
        goto L_0x006d;
    L_0x00e3:
        r3 = r1 + r1;
        r3 = r3 + -1;
        r4 = r6.af;	 Catch:{ all -> 0x0076 }
        r3 = r3 - r4;
        r6.af = r3;	 Catch:{ all -> 0x0076 }
        r3 = r6.ad;	 Catch:{ all -> 0x0076 }
        r3 = -r3;
        r6.ad = r3;	 Catch:{ all -> 0x0076 }
        r3 = r6.ar;	 Catch:{ all -> 0x0076 }
        r3 = r3 + -1;
        r6.ar = r3;	 Catch:{ all -> 0x0076 }
        if (r3 == 0) goto L_0x008d;
    L_0x00f9:
        r3 = r6.af;	 Catch:{ all -> 0x0076 }
        if (r3 < r2) goto L_0x006d;
    L_0x00fd:
        r3 = r2 + r2;
        r3 = r3 + -1;
        r4 = r6.af;	 Catch:{ all -> 0x0076 }
        r3 = r3 - r4;
        r6.af = r3;	 Catch:{ all -> 0x0076 }
        r3 = r6.ad;	 Catch:{ all -> 0x0076 }
        r3 = -r3;
        r6.ad = r3;	 Catch:{ all -> 0x0076 }
        r3 = r6.ar;	 Catch:{ all -> 0x0076 }
        r3 = r3 + -1;
        r6.ar = r3;	 Catch:{ all -> 0x0076 }
        if (r3 == 0) goto L_0x008d;
    L_0x0113:
        r3 = r6.af;	 Catch:{ all -> 0x0076 }
        if (r3 >= r1) goto L_0x006d;
    L_0x0117:
        r3 = r1 + r1;
        r3 = r3 + -1;
        r4 = r6.af;	 Catch:{ all -> 0x0076 }
        r3 = r3 - r4;
        r6.af = r3;	 Catch:{ all -> 0x0076 }
        r3 = r6.ad;	 Catch:{ all -> 0x0076 }
        r3 = -r3;
        r6.ad = r3;	 Catch:{ all -> 0x0076 }
        r3 = r6.ar;	 Catch:{ all -> 0x0076 }
        r3 = r3 + -1;
        r6.ar = r3;	 Catch:{ all -> 0x0076 }
        if (r3 != 0) goto L_0x00f9;
    L_0x012d:
        goto L_0x008d;
    L_0x012f:
        r6.ak();	 Catch:{ all -> 0x0076 }
        r6.ki();	 Catch:{ all -> 0x0076 }
        goto L_0x006d;
    L_0x0137:
        r0 = r6.af;	 Catch:{ all -> 0x0076 }
        r2 = r3 * r1;
        r0 = r0 - r2;
        r6.af = r0;	 Catch:{ all -> 0x0076 }
        r0 = r6.ar;	 Catch:{ all -> 0x0076 }
        r0 = r0 - r1;
        r6.ar = r0;	 Catch:{ all -> 0x0076 }
        goto L_0x006d;
    L_0x0145:
        r1 = r2 + -1;
        r2 = r6.af;	 Catch:{ all -> 0x0076 }
        r1 = r1 - r2;
        r1 = r1 / r3;
        r2 = r6.ar;	 Catch:{ all -> 0x0076 }
        if (r1 < r2) goto L_0x01bc;
    L_0x014f:
        r1 = r6.af;	 Catch:{ all -> 0x0076 }
        r2 = r6.ar;	 Catch:{ all -> 0x0076 }
        r2 = r2 * r3;
        r1 = r1 + r2;
        r6.af = r1;	 Catch:{ all -> 0x0076 }
        r1 = 0;
        r6.ar = r1;	 Catch:{ all -> 0x0076 }
        goto L_0x008d;
    L_0x015c:
        r1 = r6.af;	 Catch:{ all -> 0x0076 }
        if (r1 < r0) goto L_0x006d;
    L_0x0160:
        r6.af = r0;	 Catch:{ all -> 0x0076 }
        r6.ak();	 Catch:{ all -> 0x0076 }
        r6.ki();	 Catch:{ all -> 0x0076 }
        goto L_0x006d;
    L_0x016a:
        r0 = r1 + r1;
        r0 = r0 + -1;
        r3 = r6.af;	 Catch:{ all -> 0x0076 }
        r0 = r0 - r3;
        r6.af = r0;	 Catch:{ all -> 0x0076 }
        r0 = r6.ad;	 Catch:{ all -> 0x0076 }
        r0 = -r0;
        r6.ad = r0;	 Catch:{ all -> 0x0076 }
        goto L_0x00de;
    L_0x017a:
        r0 = r6.af;	 Catch:{ all -> 0x0076 }
        r0 = r0 - r1;
        r0 = r0 % r3;
        r0 = r0 + r1;
        r6.af = r0;	 Catch:{ all -> 0x0076 }
        goto L_0x006d;
    L_0x0183:
        r0 = r2 + -1;
        r1 = r2 + -1;
        r2 = r6.af;	 Catch:{ all -> 0x0076 }
        r1 = r1 - r2;
        r1 = r1 % r3;
        r0 = r0 - r1;
        r6.af = r0;	 Catch:{ all -> 0x0076 }
        goto L_0x006d;
    L_0x0190:
        r0 = r6.ad;	 Catch:{ all -> 0x0076 }
        if (r0 >= 0) goto L_0x019a;
    L_0x0194:
        r0 = r6.af;	 Catch:{ all -> 0x0076 }
        if (r0 < r1) goto L_0x0183;
    L_0x0198:
        goto L_0x006d;
    L_0x019a:
        r0 = r6.af;	 Catch:{ all -> 0x0076 }
        if (r0 >= r2) goto L_0x017a;
    L_0x019e:
        goto L_0x006d;
    L_0x01a0:
        r4 = r6.ar;	 Catch:{ all -> 0x0076 }
        if (r4 <= 0) goto L_0x008d;
    L_0x01a4:
        r4 = r6.aq;	 Catch:{ all -> 0x0076 }
        if (r4 == 0) goto L_0x01b2;
    L_0x01a8:
        r3 = r6.ad;	 Catch:{ all -> 0x0076 }
        if (r3 >= 0) goto L_0x00f9;
    L_0x01ac:
        r3 = r6.af;	 Catch:{ all -> 0x0076 }
        if (r3 < r1) goto L_0x00e3;
    L_0x01b0:
        goto L_0x006d;
    L_0x01b2:
        r4 = r6.ad;	 Catch:{ all -> 0x0076 }
        if (r4 >= 0) goto L_0x01ca;
    L_0x01b6:
        r4 = r6.af;	 Catch:{ all -> 0x0076 }
        if (r4 < r1) goto L_0x0145;
    L_0x01ba:
        goto L_0x006d;
    L_0x01bc:
        r0 = r6.af;	 Catch:{ all -> 0x0076 }
        r2 = r3 * r1;
        r0 = r0 + r2;
        r6.af = r0;	 Catch:{ all -> 0x0076 }
        r0 = r6.ar;	 Catch:{ all -> 0x0076 }
        r0 = r0 - r1;
        r6.ar = r0;	 Catch:{ all -> 0x0076 }
        goto L_0x006d;
    L_0x01ca:
        r4 = r6.af;	 Catch:{ all -> 0x0076 }
        if (r4 >= r2) goto L_0x0079;
    L_0x01ce:
        goto L_0x006d;
        */
        throw new UnsupportedOperationException("Method not decompiled: fh.bu(int):void");
    }

    int bn(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = i;
        while (this.am > 0) {
            int i6 = i5 + this.am;
            if (i6 > i3) {
                i6 = i3;
            }
            this.am += i5;
            if (this.ad == 256 && (this.af & 255) == 0) {
                if (iv.ad) {
                    i5 = fh.ci(0, ((fc) this.ah).an, iArr, this.af, i5, this.ay, this.as, this.ab, this.aw, 0, i6, i2, this);
                } else {
                    i5 = fh.cv(((fc) this.ah).an, iArr, this.af, i5, this.ag, this.at, 0, i6, i2, this);
                }
            } else if (iv.ad) {
                i5 = fh.cn(0, 0, ((fc) this.ah).an, iArr, this.af, i5, this.ay, this.as, this.ab, this.aw, 0, i6, i2, this, this.ad, i4);
            } else {
                i5 = fh.cy(0, 0, ((fc) this.ah).an, iArr, this.af, i5, this.ag, this.at, 0, i6, i2, this, this.ad, i4);
            }
            this.am -= i5;
            if (this.am != 0) {
                return i5;
            }
            if (bl()) {
                return i3;
            }
        }
        if (this.ad == 256 && (this.af & 255) == 0) {
            if (iv.ad) {
                return fh.bs(0, ((fc) this.ah).an, iArr, this.af, i5, this.ay, this.as, 0, i3, i2, this);
            }
            return fh.bd(((fc) this.ah).an, iArr, this.af, i5, this.ag, 0, i3, i2, this);
        } else if (iv.ad) {
            return fh.bi(0, 0, ((fc) this.ah).an, iArr, this.af, i5, this.ay, this.as, 0, i3, i2, this, this.ad, i4);
        } else {
            return fh.bj(0, 0, ((fc) this.ah).an, iArr, this.af, i5, this.ag, 0, i3, i2, this, this.ad, i4);
        }
    }

    int eq(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = i;
        while (this.am > 0) {
            int i6 = i5 + this.am;
            if (i6 > i3) {
                i6 = i3;
            }
            this.am += i5;
            if (this.ad == 256 && (this.af & 255) == 0) {
                if (iv.ad) {
                    i5 = fh.ci(0, ((fc) this.ah).an, iArr, this.af, i5, this.ay, this.as, this.ab, this.aw, 0, i6, i2, this);
                } else {
                    i5 = fh.cv(((fc) this.ah).an, iArr, this.af, i5, this.ag, this.at, 0, i6, i2, this);
                }
            } else if (iv.ad) {
                i5 = fh.cn(0, 0, ((fc) this.ah).an, iArr, this.af, i5, this.ay, this.as, this.ab, this.aw, 0, i6, i2, this, this.ad, i4);
            } else {
                i5 = fh.cy(0, 0, ((fc) this.ah).an, iArr, this.af, i5, this.ag, this.at, 0, i6, i2, this, this.ad, i4);
            }
            this.am -= i5;
            if (this.am != 0) {
                return i5;
            }
            if (bl()) {
                return i3;
            }
        }
        if (this.ad == 256 && (this.af & 255) == 0) {
            if (iv.ad) {
                return fh.bs(0, ((fc) this.ah).an, iArr, this.af, i5, this.ay, this.as, 0, i3, i2, this);
            }
            return fh.bd(((fc) this.ah).an, iArr, this.af, i5, this.ag, 0, i3, i2, this);
        } else if (iv.ad) {
            return fh.bi(0, 0, ((fc) this.ah).an, iArr, this.af, i5, this.ay, this.as, 0, i3, i2, this, this.ad, i4);
        } else {
            return fh.bj(0, 0, ((fc) this.ah).an, iArr, this.af, i5, this.ag, 0, i3, i2, this, this.ad, i4);
        }
    }

    int ba(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = i;
        while (this.am > 0) {
            int i6 = i5 + this.am;
            if (i6 > i3) {
                i6 = i3;
            }
            this.am += i5;
            if (this.ad == -256 && (this.af & 255) == 0) {
                if (iv.ad) {
                    i5 = fh.co(0, ((fc) this.ah).an, iArr, this.af, i5, this.ay, this.as, this.ab, this.aw, 0, i6, i2, this);
                } else {
                    i5 = fh.cc(((fc) this.ah).an, iArr, this.af, i5, this.ag, this.at, 0, i6, i2, this);
                }
            } else if (iv.ad) {
                i5 = fh.cl(0, 0, ((fc) this.ah).an, iArr, this.af, i5, this.ay, this.as, this.ab, this.aw, 0, i6, i2, this, this.ad, i4);
            } else {
                i5 = fh.ck(0, 0, ((fc) this.ah).an, iArr, this.af, i5, this.ag, this.at, 0, i6, i2, this, this.ad, i4);
            }
            this.am -= i5;
            if (this.am != 0) {
                return i5;
            }
            if (bl()) {
                return i3;
            }
        }
        if (this.ad == -256 && (this.af & 255) == 0) {
            if (iv.ad) {
                return fh.br(0, ((fc) this.ah).an, iArr, this.af, i5, this.ay, this.as, 0, i3, i2, this);
            }
            return fh.bm(((fc) this.ah).an, iArr, this.af, i5, this.ag, 0, i3, i2, this);
        } else if (iv.ad) {
            return fh.bo(0, 0, ((fc) this.ah).an, iArr, this.af, i5, this.ay, this.as, 0, i3, i2, this, this.ad, i4);
        } else {
            return fh.bq(0, 0, ((fc) this.ah).an, iArr, this.af, i5, this.ag, 0, i3, i2, this, this.ad, i4);
        }
    }

    int ea(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = i;
        while (this.am > 0) {
            int i6 = i5 + this.am;
            if (i6 > i3) {
                i6 = i3;
            }
            this.am += i5;
            if (this.ad == -256 && (this.af & 255) == 0) {
                if (iv.ad) {
                    i5 = fh.co(0, ((fc) this.ah).an, iArr, this.af, i5, this.ay, this.as, this.ab, this.aw, 0, i6, i2, this);
                } else {
                    i5 = fh.cc(((fc) this.ah).an, iArr, this.af, i5, this.ag, this.at, 0, i6, i2, this);
                }
            } else if (iv.ad) {
                i5 = fh.cl(0, 0, ((fc) this.ah).an, iArr, this.af, i5, this.ay, this.as, this.ab, this.aw, 0, i6, i2, this, this.ad, i4);
            } else {
                i5 = fh.ck(0, 0, ((fc) this.ah).an, iArr, this.af, i5, this.ag, this.at, 0, i6, i2, this, this.ad, i4);
            }
            this.am -= i5;
            if (this.am != 0) {
                return i5;
            }
            if (bl()) {
                return i3;
            }
        }
        if (this.ad == -256 && (this.af & -621007793) == 0) {
            if (iv.ad) {
                return fh.br(0, ((fc) this.ah).an, iArr, this.af, i5, this.ay, this.as, 0, i3, i2, this);
            }
            return fh.bm(((fc) this.ah).an, iArr, this.af, i5, this.ag, 0, i3, i2, this);
        } else if (iv.ad) {
            return fh.bo(0, 0, ((fc) this.ah).an, iArr, this.af, i5, this.ay, this.as, 0, i3, i2, this, this.ad, i4);
        } else {
            return fh.bq(0, 0, ((fc) this.ah).an, iArr, this.af, i5, this.ag, 0, i3, i2, this, this.ad, i4);
        }
    }

    int en(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = i;
        while (this.am > 0) {
            int i6 = i5 + this.am;
            if (i6 > i3) {
                i6 = i3;
            }
            this.am += i5;
            if (this.ad == 1738591611 && (this.af & 255) == 0) {
                if (iv.ad) {
                    i5 = fh.co(0, ((fc) this.ah).an, iArr, this.af, i5, this.ay, this.as, this.ab, this.aw, 0, i6, i2, this);
                } else {
                    i5 = fh.cc(((fc) this.ah).an, iArr, this.af, i5, this.ag, this.at, 0, i6, i2, this);
                }
            } else if (iv.ad) {
                i5 = fh.cl(0, 0, ((fc) this.ah).an, iArr, this.af, i5, this.ay, this.as, this.ab, this.aw, 0, i6, i2, this, this.ad, i4);
            } else {
                i5 = fh.ck(0, 0, ((fc) this.ah).an, iArr, this.af, i5, this.ag, this.at, 0, i6, i2, this, this.ad, i4);
            }
            this.am -= i5;
            if (this.am != 0) {
                return i5;
            }
            if (bl()) {
                return i3;
            }
        }
        if (this.ad == -256 && (this.af & 1827644254) == 0) {
            if (iv.ad) {
                return fh.br(0, ((fc) this.ah).an, iArr, this.af, i5, this.ay, this.as, 0, i3, i2, this);
            }
            return fh.bm(((fc) this.ah).an, iArr, this.af, i5, this.ag, 0, i3, i2, this);
        } else if (iv.ad) {
            return fh.bo(0, 0, ((fc) this.ah).an, iArr, this.af, i5, this.ay, this.as, 0, i3, i2, this, this.ad, i4);
        } else {
            return fh.bq(0, 0, ((fc) this.ah).an, iArr, this.af, i5, this.ag, 0, i3, i2, this, this.ad, i4);
        }
    }

    boolean bl() {
        int i;
        int i2;
        int i3 = this.an;
        if (i3 == Integer.MIN_VALUE) {
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            i2 = fh.af(i3, this.aa);
            i = fh.ad(i3, this.aa);
        }
        if (this.ag != i3 || this.ay != i2 || this.as != i) {
            if (this.ag < i3) {
                this.at = 1;
                this.am = i3 - this.ag;
            } else if (this.ag > i3) {
                this.at = -1;
                this.am = this.ag - i3;
            } else {
                this.at = 0;
            }
            if (this.ay < i2) {
                this.ab = 1;
                if (this.am == 0 || this.am > i2 - this.ay) {
                    this.am = i2 - this.ay;
                }
            } else if (this.ay > i2) {
                this.ab = -1;
                if (this.am == 0 || this.am > this.ay - i2) {
                    this.am = this.ay - i2;
                }
            } else {
                this.ab = 0;
            }
            if (this.as < i) {
                this.aw = 1;
                if (this.am != 0 && this.am <= i - this.as) {
                    return false;
                }
                this.am = i - this.as;
                return false;
            } else if (this.as > i) {
                this.aw = -1;
                if (this.am != 0 && this.am <= this.as - i) {
                    return false;
                }
                this.am = this.as - i;
                return false;
            } else {
                this.aw = 0;
                return false;
            }
        } else if (this.an == Integer.MIN_VALUE) {
            this.an = 0;
            this.as = 0;
            this.ay = 0;
            this.ag = 0;
            ki();
            return true;
        } else {
            ag();
            return false;
        }
    }

    boolean ef() {
        int i;
        int i2;
        int i3 = this.an;
        if (i3 == 1835435602) {
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            i2 = fh.af(i3, this.aa);
            i = fh.ad(i3, this.aa);
        }
        if (this.ag != i3 || this.ay != i2 || this.as != i) {
            if (this.ag < i3) {
                this.at = 1;
                this.am = i3 - this.ag;
            } else if (this.ag > i3) {
                this.at = -1;
                this.am = this.ag - i3;
            } else {
                this.at = 0;
            }
            if (this.ay < i2) {
                this.ab = 1;
                if (this.am == 0 || this.am > i2 - this.ay) {
                    this.am = i2 - this.ay;
                }
            } else if (this.ay > i2) {
                this.ab = -1;
                if (this.am == 0 || this.am > this.ay - i2) {
                    this.am = this.ay - i2;
                }
            } else {
                this.ab = 0;
            }
            if (this.as < i) {
                this.aw = 1;
                if (this.am != 0 && this.am <= i - this.as) {
                    return false;
                }
                this.am = i - this.as;
                return false;
            } else if (this.as > i) {
                this.aw = -1;
                if (this.am != 0 && this.am <= this.as - i) {
                    return false;
                }
                this.am = this.as - i;
                return false;
            } else {
                this.aw = 0;
                return false;
            }
        } else if (this.an == Integer.MIN_VALUE) {
            this.an = 0;
            this.as = 0;
            this.ay = 0;
            this.ag = 0;
            ki();
            return true;
        } else {
            ag();
            return false;
        }
    }

    boolean ey() {
        int i;
        int i2;
        int i3 = this.an;
        if (i3 == Integer.MIN_VALUE) {
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            i2 = fh.af(i3, this.aa);
            i = fh.ad(i3, this.aa);
        }
        if (this.ag != i3 || this.ay != i2 || this.as != i) {
            if (this.ag < i3) {
                this.at = 1;
                this.am = i3 - this.ag;
            } else if (this.ag > i3) {
                this.at = -1;
                this.am = this.ag - i3;
            } else {
                this.at = 0;
            }
            if (this.ay < i2) {
                this.ab = 1;
                if (this.am == 0 || this.am > i2 - this.ay) {
                    this.am = i2 - this.ay;
                }
            } else if (this.ay > i2) {
                this.ab = -1;
                if (this.am == 0 || this.am > this.ay - i2) {
                    this.am = this.ay - i2;
                }
            } else {
                this.ab = 0;
            }
            if (this.as < i) {
                this.aw = 1;
                if (this.am != 0 && this.am <= i - this.as) {
                    return false;
                }
                this.am = i - this.as;
                return false;
            } else if (this.as > i) {
                this.aw = -1;
                if (this.am != 0 && this.am <= this.as - i) {
                    return false;
                }
                this.am = this.as - i;
                return false;
            } else {
                this.aw = 0;
                return false;
            }
        } else if (this.an == Integer.MIN_VALUE) {
            this.an = 0;
            this.as = 0;
            this.ay = 0;
            this.ag = 0;
            ki();
            return true;
        } else {
            ag();
            return false;
        }
    }

    static int bd(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, fh fhVar) {
        int i7;
        int i8 = i >> 8;
        int i9 = i3 << 2;
        int i10 = ((i6 >> 8) + i2) - i8;
        if (i10 <= i5) {
            i5 = i10;
        }
        int i11 = i5 - 3;
        i10 = i2;
        while (i10 < i11) {
            int i12 = i10 + 1;
            int i13 = i8 + 1;
            iArr[i10] = (bArr[i8] * i9) + iArr[i10];
            i10 = i12 + 1;
            i7 = i13 + 1;
            iArr[i12] = iArr[i12] + (bArr[i13] * i9);
            i12 = i10 + 1;
            i13 = i7 + 1;
            iArr[i10] = iArr[i10] + (bArr[i7] * i9);
            i10 = i12 + 1;
            i8 = i13 + 1;
            iArr[i12] = iArr[i12] + (bArr[i13] * i9);
        }
        i7 = i11 + 3;
        i11 = i8;
        while (i10 < i7) {
            i8 = i10 + 1;
            i12 = i11 + 1;
            iArr[i10] = (bArr[i11] * i9) + iArr[i10];
            i10 = i8;
            i11 = i12;
        }
        fhVar.af = i11 << 8;
        return i10;
    }

    static int el(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, fh fhVar) {
        int i7;
        int i8 = i >> 8;
        int i9 = i3 << 2;
        int i10 = ((i6 >> 8) + i2) - i8;
        if (i10 <= i5) {
            i5 = i10;
        }
        int i11 = i5 - 3;
        i10 = i2;
        while (i10 < i11) {
            int i12 = i10 + 1;
            int i13 = i8 + 1;
            iArr[i10] = (bArr[i8] * i9) + iArr[i10];
            i10 = i12 + 1;
            i7 = i13 + 1;
            iArr[i12] = iArr[i12] + (bArr[i13] * i9);
            i12 = i10 + 1;
            i13 = i7 + 1;
            iArr[i10] = iArr[i10] + (bArr[i7] * i9);
            i10 = i12 + 1;
            i8 = i13 + 1;
            iArr[i12] = iArr[i12] + (bArr[i13] * i9);
        }
        i7 = i11 + 3;
        i11 = i8;
        while (i10 < i7) {
            i8 = i10 + 1;
            i12 = i11 + 1;
            iArr[i10] = (bArr[i11] * i9) + iArr[i10];
            i10 = i8;
            i11 = i12;
        }
        fhVar.af = i11 << 8;
        return i10;
    }

    static int et(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, fh fhVar) {
        int i7;
        int i8 = i >> 8;
        int i9 = i3 << 2;
        int i10 = ((i6 >> 8) + i2) - i8;
        if (i10 <= i5) {
            i5 = i10;
        }
        int i11 = i5 - 3;
        i10 = i2;
        while (i10 < i11) {
            int i12 = i10 + 1;
            int i13 = i8 + 1;
            iArr[i10] = (bArr[i8] * i9) + iArr[i10];
            i10 = i12 + 1;
            i7 = i13 + 1;
            iArr[i12] = iArr[i12] + (bArr[i13] * i9);
            i12 = i10 + 1;
            i13 = i7 + 1;
            iArr[i10] = iArr[i10] + (bArr[i7] * i9);
            i10 = i12 + 1;
            i8 = i13 + 1;
            iArr[i12] = iArr[i12] + (bArr[i13] * i9);
        }
        i7 = i11 + 3;
        i11 = i8;
        while (i10 < i7) {
            i8 = i10 + 1;
            i12 = i11 + 1;
            iArr[i10] = (bArr[i11] * i9) + iArr[i10];
            i10 = i8;
            i11 = i12;
        }
        fhVar.af = i11 << 8;
        return i10;
    }

    static int bs(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, fh fhVar) {
        int i9;
        int i10 = i2 >> 8;
        int i11 = i4 << 2;
        int i12 = i5 << 2;
        int i13 = ((i8 >> 8) + i3) - i10;
        if (i13 <= i7) {
            i7 = i13;
        }
        i13 = i3 << 1;
        int i14 = (i7 << 1) - 6;
        while (i13 < i14) {
            i9 = i10 + 1;
            byte b = bArr[i10];
            int i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i9 + 1;
            byte b2 = bArr[i9];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i11);
            i13 = i15 + 1;
            iArr[i15] = (b2 * i12) + iArr[i15];
            i9 = i10 + 1;
            b = bArr[i10];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i9 + 1;
            b2 = bArr[i9];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i11);
            i13 = i15 + 1;
            iArr[i15] = (b2 * i12) + iArr[i15];
        }
        i9 = i14 + 6;
        while (i13 < i9) {
            i14 = i10 + 1;
            b = bArr[i10];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i14;
        }
        fhVar.af = i10 << 8;
        return i13 >> 1;
    }

    static int ed(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, fh fhVar) {
        int i9;
        int i10 = i2 >> 8;
        int i11 = i4 << 2;
        int i12 = i5 << 2;
        int i13 = ((i8 >> 8) + i3) - i10;
        if (i13 <= i7) {
            i7 = i13;
        }
        i13 = i3 << 1;
        int i14 = (i7 << 1) - 6;
        while (i13 < i14) {
            i9 = i10 + 1;
            byte b = bArr[i10];
            int i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i9 + 1;
            byte b2 = bArr[i9];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i11);
            i13 = i15 + 1;
            iArr[i15] = (b2 * i12) + iArr[i15];
            i9 = i10 + 1;
            b = bArr[i10];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i9 + 1;
            b2 = bArr[i9];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i11);
            i13 = i15 + 1;
            iArr[i15] = (b2 * i12) + iArr[i15];
        }
        i9 = i14 + 6;
        while (i13 < i9) {
            i14 = i10 + 1;
            b = bArr[i10];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i14;
        }
        fhVar.af = i10 << 8;
        return i13 >> 1;
    }

    static int eg(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, fh fhVar) {
        int i9;
        int i10 = i2 >> 8;
        int i11 = i4 << 2;
        int i12 = i5 << 2;
        int i13 = ((i8 >> 8) + i3) - i10;
        if (i13 <= i7) {
            i7 = i13;
        }
        i13 = i3 << 1;
        int i14 = (i7 << 1) - 6;
        while (i13 < i14) {
            i9 = i10 + 1;
            byte b = bArr[i10];
            int i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i9 + 1;
            byte b2 = bArr[i9];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i11);
            i13 = i15 + 1;
            iArr[i15] = (b2 * i12) + iArr[i15];
            i9 = i10 + 1;
            b = bArr[i10];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i9 + 1;
            b2 = bArr[i9];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i11);
            i13 = i15 + 1;
            iArr[i15] = (b2 * i12) + iArr[i15];
        }
        i9 = i14 + 6;
        while (i13 < i9) {
            i14 = i10 + 1;
            b = bArr[i10];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i14;
        }
        fhVar.af = i10 << 8;
        return i13 >> 1;
    }

    static int ej(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, fh fhVar) {
        int i9;
        int i10 = i2 >> 8;
        int i11 = i4 << 2;
        int i12 = i5 << 2;
        int i13 = ((i8 >> 8) + i3) - i10;
        if (i13 <= i7) {
            i7 = i13;
        }
        i13 = i3 << 1;
        int i14 = (i7 << 1) - 6;
        while (i13 < i14) {
            i9 = i10 + 1;
            byte b = bArr[i10];
            int i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i9 + 1;
            byte b2 = bArr[i9];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i11);
            i13 = i15 + 1;
            iArr[i15] = (b2 * i12) + iArr[i15];
            i9 = i10 + 1;
            b = bArr[i10];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i9 + 1;
            b2 = bArr[i9];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i11);
            i13 = i15 + 1;
            iArr[i15] = (b2 * i12) + iArr[i15];
        }
        i9 = i14 + 6;
        while (i13 < i9) {
            i14 = i10 + 1;
            b = bArr[i10];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i14;
        }
        fhVar.af = i10 << 8;
        return i13 >> 1;
    }

    static int bm(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, fh fhVar) {
        int i7;
        int i8 = i >> 8;
        int i9 = i3 << 2;
        int i10 = (i2 + i8) - ((i6 >> 8) - 1);
        if (i10 <= i5) {
            i5 = i10;
        }
        int i11 = i5 - 3;
        i10 = i2;
        while (i10 < i11) {
            int i12 = i10 + 1;
            int i13 = i8 - 1;
            iArr[i10] = (bArr[i8] * i9) + iArr[i10];
            i10 = i12 + 1;
            i7 = i13 - 1;
            iArr[i12] = iArr[i12] + (bArr[i13] * i9);
            i12 = i10 + 1;
            i13 = i7 - 1;
            iArr[i10] = iArr[i10] + (bArr[i7] * i9);
            i10 = i12 + 1;
            i8 = i13 - 1;
            iArr[i12] = iArr[i12] + (bArr[i13] * i9);
        }
        i7 = i11 + 3;
        i11 = i8;
        while (i10 < i7) {
            i8 = i10 + 1;
            i12 = i11 - 1;
            iArr[i10] = (bArr[i11] * i9) + iArr[i10];
            i10 = i8;
            i11 = i12;
        }
        fhVar.af = i11 << 8;
        return i10;
    }

    static int br(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, fh fhVar) {
        int i9;
        int i10 = i2 >> 8;
        int i11 = i4 << 2;
        int i12 = i5 << 2;
        int i13 = (i3 + i10) - ((i8 >> 8) - 1);
        if (i13 <= i7) {
            i7 = i13;
        }
        i13 = i3 << 1;
        int i14 = (i7 << 1) - 6;
        while (i13 < i14) {
            i9 = i10 - 1;
            byte b = bArr[i10];
            int i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i9 - 1;
            byte b2 = bArr[i9];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i11);
            i13 = i15 + 1;
            iArr[i15] = (b2 * i12) + iArr[i15];
            i9 = i10 - 1;
            b = bArr[i10];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i9 - 1;
            b2 = bArr[i9];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i11);
            i13 = i15 + 1;
            iArr[i15] = (b2 * i12) + iArr[i15];
        }
        i9 = i14 + 6;
        while (i13 < i9) {
            i14 = i10 - 1;
            b = bArr[i10];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i14;
        }
        fhVar.af = i10 << 8;
        return i13 >> 1;
    }

    static int ee(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, fh fhVar) {
        int i9;
        int i10 = i2 >> 8;
        int i11 = i4 << 2;
        int i12 = i5 << 2;
        int i13 = (i3 + i10) - ((i8 >> 8) - 1);
        if (i13 <= i7) {
            i7 = i13;
        }
        i13 = i3 << 1;
        int i14 = (i7 << 1) - 6;
        while (i13 < i14) {
            i9 = i10 - 1;
            byte b = bArr[i10];
            int i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i9 - 1;
            byte b2 = bArr[i9];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i11);
            i13 = i15 + 1;
            iArr[i15] = (b2 * i12) + iArr[i15];
            i9 = i10 - 1;
            b = bArr[i10];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i9 - 1;
            b2 = bArr[i9];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i11);
            i13 = i15 + 1;
            iArr[i15] = (b2 * i12) + iArr[i15];
        }
        i9 = i14 + 6;
        while (i13 < i9) {
            i14 = i10 - 1;
            b = bArr[i10];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i14;
        }
        fhVar.af = i10 << 8;
        return i13 >> 1;
    }

    static int em(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, fh fhVar) {
        int i9;
        int i10 = i2 >> 8;
        int i11 = i4 << 2;
        int i12 = i5 << 2;
        int i13 = (i3 + i10) - ((i8 >> 8) - 1);
        if (i13 <= i7) {
            i7 = i13;
        }
        i13 = i3 << 1;
        int i14 = (i7 << 1) - 6;
        while (i13 < i14) {
            i9 = i10 - 1;
            byte b = bArr[i10];
            int i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i9 - 1;
            byte b2 = bArr[i9];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i11);
            i13 = i15 + 1;
            iArr[i15] = (b2 * i12) + iArr[i15];
            i9 = i10 - 1;
            b = bArr[i10];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i9 - 1;
            b2 = bArr[i9];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i11);
            i13 = i15 + 1;
            iArr[i15] = (b2 * i12) + iArr[i15];
        }
        i9 = i14 + 6;
        while (i13 < i9) {
            i14 = i10 - 1;
            b = bArr[i10];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i14;
        }
        fhVar.af = i10 << 8;
        return i13 >> 1;
    }

    static int ez(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, fh fhVar) {
        int i9;
        int i10 = i2 >> 8;
        int i11 = i4 << 2;
        int i12 = i5 << 2;
        int i13 = (i3 + i10) - ((i8 >> 8) - 1);
        if (i13 <= i7) {
            i7 = i13;
        }
        i13 = i3 << 1;
        int i14 = (i7 << 1) - 6;
        while (i13 < i14) {
            i9 = i10 - 1;
            byte b = bArr[i10];
            int i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i9 - 1;
            byte b2 = bArr[i9];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i11);
            i13 = i15 + 1;
            iArr[i15] = (b2 * i12) + iArr[i15];
            i9 = i10 - 1;
            b = bArr[i10];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i9 - 1;
            b2 = bArr[i9];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i11);
            i13 = i15 + 1;
            iArr[i15] = (b2 * i12) + iArr[i15];
        }
        i9 = i14 + 6;
        while (i13 < i9) {
            i14 = i10 - 1;
            b = bArr[i10];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i14;
        }
        fhVar.af = i10 << 8;
        return i13 >> 1;
    }

    static int bj(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, fh fhVar, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        if (i9 != 0) {
            i11 = ((((i8 - i3) + i9) - 257) / i9) + i4;
            if (i11 <= i7) {
                i12 = i4;
                i13 = i3;
                while (i12 < i11) {
                    int i14 = i13 >> 8;
                    byte b = bArr[i14];
                    i4 = i12 + 1;
                    iArr[i12] = (((((bArr[i14 + 1] - b) * (i13 & 255)) + (b << 8)) * i5) >> 6) + iArr[i12];
                    i12 = i4;
                    i13 += i9;
                }
                if (i9 != 0) {
                    i11 = ((((i8 - i13) + i9) - 1) / i9) + i12;
                    if (i11 <= i7) {
                        i7 = i11;
                    }
                }
                i11 = i12;
                while (i11 < i7) {
                    byte b2 = bArr[i13 >> 8];
                    i12 = i11 + 1;
                    iArr[i11] = (((((i10 - b2) * (i13 & 255)) + (b2 << 8)) * i5) >> 6) + iArr[i11];
                    i13 += i9;
                    i11 = i12;
                }
                fhVar.af = i13;
                return i11;
            }
        }
        i11 = i7;
        i12 = i4;
        i13 = i3;
        while (i12 < i11) {
            int i142 = i13 >> 8;
            byte b3 = bArr[i142];
            i4 = i12 + 1;
            iArr[i12] = (((((bArr[i142 + 1] - b3) * (i13 & 255)) + (b3 << 8)) * i5) >> 6) + iArr[i12];
            i12 = i4;
            i13 += i9;
        }
        if (i9 != 0) {
            i11 = ((((i8 - i13) + i9) - 1) / i9) + i12;
            if (i11 <= i7) {
                i7 = i11;
            }
        }
        i11 = i12;
        while (i11 < i7) {
            byte b22 = bArr[i13 >> 8];
            i12 = i11 + 1;
            iArr[i11] = (((((i10 - b22) * (i13 & 255)) + (b22 << 8)) * i5) >> 6) + iArr[i11];
            i13 += i9;
            i11 = i12;
        }
        fhVar.af = i13;
        return i11;
    }

    static int eb(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, fh fhVar, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        if (i9 != 0) {
            i11 = ((((i8 - i3) + i9) - 257) / i9) + i4;
            if (i11 <= i7) {
                i12 = i4;
                i13 = i3;
                while (i12 < i11) {
                    int i14 = i13 >> 8;
                    byte b = bArr[i14];
                    i4 = i12 + 1;
                    iArr[i12] = (((((bArr[i14 + 1] - b) * (i13 & 255)) + (b << 8)) * i5) >> 6) + iArr[i12];
                    i12 = i4;
                    i13 += i9;
                }
                if (i9 != 0) {
                    i11 = ((((i8 - i13) + i9) - 1) / i9) + i12;
                    if (i11 <= i7) {
                        i7 = i11;
                    }
                }
                i11 = i12;
                while (i11 < i7) {
                    byte b2 = bArr[i13 >> 8];
                    i12 = i11 + 1;
                    iArr[i11] = (((((i10 - b2) * (-1735337126 & i13)) + (b2 << 8)) * i5) >> 6) + iArr[i11];
                    i13 += i9;
                    i11 = i12;
                }
                fhVar.af = i13;
                return i11;
            }
        }
        i11 = i7;
        i12 = i4;
        i13 = i3;
        while (i12 < i11) {
            int i142 = i13 >> 8;
            byte b3 = bArr[i142];
            i4 = i12 + 1;
            iArr[i12] = (((((bArr[i142 + 1] - b3) * (i13 & 255)) + (b3 << 8)) * i5) >> 6) + iArr[i12];
            i12 = i4;
            i13 += i9;
        }
        if (i9 != 0) {
            i11 = ((((i8 - i13) + i9) - 1) / i9) + i12;
            if (i11 <= i7) {
                i7 = i11;
            }
        }
        i11 = i12;
        while (i11 < i7) {
            byte b22 = bArr[i13 >> 8];
            i12 = i11 + 1;
            iArr[i11] = (((((i10 - b22) * (-1735337126 & i13)) + (b22 << 8)) * i5) >> 6) + iArr[i11];
            i13 += i9;
            i11 = i12;
        }
        fhVar.af = i13;
        return i11;
    }

    static int ei(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, fh fhVar, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        if (i9 != 0) {
            i11 = ((((i8 - i3) + i9) - 257) / i9) + i4;
            if (i11 <= i7) {
                i12 = i4;
                i13 = i3;
                while (i12 < i11) {
                    int i14 = i13 >> 8;
                    byte b = bArr[i14];
                    i4 = i12 + 1;
                    iArr[i12] = (((((bArr[i14 + 1] - b) * (i13 & 255)) + (b << 8)) * i5) >> 6) + iArr[i12];
                    i12 = i4;
                    i13 += i9;
                }
                if (i9 != 0) {
                    i11 = ((((i8 - i13) + i9) - 1) / i9) + i12;
                    if (i11 <= i7) {
                        i7 = i11;
                    }
                }
                i11 = i12;
                while (i11 < i7) {
                    byte b2 = bArr[i13 >> 8];
                    i12 = i11 + 1;
                    iArr[i11] = (((((i10 - b2) * (i13 & 255)) + (b2 << 8)) * i5) >> 6) + iArr[i11];
                    i13 += i9;
                    i11 = i12;
                }
                fhVar.af = i13;
                return i11;
            }
        }
        i11 = i7;
        i12 = i4;
        i13 = i3;
        while (i12 < i11) {
            int i142 = i13 >> 8;
            byte b3 = bArr[i142];
            i4 = i12 + 1;
            iArr[i12] = (((((bArr[i142 + 1] - b3) * (i13 & 255)) + (b3 << 8)) * i5) >> 6) + iArr[i12];
            i12 = i4;
            i13 += i9;
        }
        if (i9 != 0) {
            i11 = ((((i8 - i13) + i9) - 1) / i9) + i12;
            if (i11 <= i7) {
                i7 = i11;
            }
        }
        i11 = i12;
        while (i11 < i7) {
            byte b22 = bArr[i13 >> 8];
            i12 = i11 + 1;
            iArr[i11] = (((((i10 - b22) * (i13 & 255)) + (b22 << 8)) * i5) >> 6) + iArr[i11];
            i13 += i9;
            i11 = i12;
        }
        fhVar.af = i13;
        return i11;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int bi(int r8, int r9, byte[] r10, int[] r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, p000.fh r19, int r20, int r21) {
        /*
        if (r20 == 0) goto L_0x000f;
    L_0x0002:
        r1 = r18 - r12;
        r1 = r1 + r20;
        r1 = r1 + -257;
        r1 = r1 / r20;
        r1 = r1 + r13;
        r0 = r17;
        if (r1 <= r0) goto L_0x0011;
    L_0x000f:
        r1 = r17;
    L_0x0011:
        r2 = r13 << 1;
        r1 = r1 << 1;
        r3 = r12;
    L_0x0016:
        if (r2 >= r1) goto L_0x003f;
    L_0x0018:
        r4 = r3 >> 8;
        r5 = r10[r4];
        r6 = r5 << 8;
        r4 = r4 + 1;
        r4 = r10[r4];
        r4 = r4 - r5;
        r5 = r3 & 255;
        r4 = r4 * r5;
        r4 = r4 + r6;
        r5 = r2 + 1;
        r6 = r11[r2];
        r7 = r4 * r14;
        r7 = r7 >> 6;
        r6 = r6 + r7;
        r11[r2] = r6;
        r2 = r5 + 1;
        r6 = r11[r5];
        r4 = r4 * r15;
        r4 = r4 >> 6;
        r4 = r4 + r6;
        r11[r5] = r4;
        r3 = r3 + r20;
        goto L_0x0016;
    L_0x003f:
        if (r20 == 0) goto L_0x0050;
    L_0x0041:
        r1 = r2 >> 1;
        r4 = r18 - r3;
        r4 = r4 + r20;
        r4 = r4 + -1;
        r4 = r4 / r20;
        r1 = r1 + r4;
        r0 = r17;
        if (r1 <= r0) goto L_0x0081;
    L_0x0050:
        r4 = r17 << 1;
        r1 = r2;
        r2 = r3;
    L_0x0054:
        if (r1 >= r4) goto L_0x007a;
    L_0x0056:
        r3 = r2 >> 8;
        r3 = r10[r3];
        r5 = r3 << 8;
        r3 = r21 - r3;
        r6 = r2 & 255;
        r3 = r3 * r6;
        r3 = r3 + r5;
        r5 = r1 + 1;
        r6 = r11[r1];
        r7 = r3 * r14;
        r7 = r7 >> 6;
        r6 = r6 + r7;
        r11[r1] = r6;
        r1 = r5 + 1;
        r6 = r11[r5];
        r3 = r3 * r15;
        r3 = r3 >> 6;
        r3 = r3 + r6;
        r11[r5] = r3;
        r2 = r2 + r20;
        goto L_0x0054;
    L_0x007a:
        r0 = r19;
        r0.af = r2;
        r1 = r1 >> 1;
        return r1;
    L_0x0081:
        r17 = r1;
        goto L_0x0050;
        */
        throw new UnsupportedOperationException("Method not decompiled: fh.bi(int, int, byte[], int[], int, int, int, int, int, int, int, fh, int, int):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int eh(int r8, int r9, byte[] r10, int[] r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, p000.fh r19, int r20, int r21) {
        /*
        if (r20 == 0) goto L_0x000f;
    L_0x0002:
        r1 = r18 - r12;
        r1 = r1 + r20;
        r1 = r1 + -257;
        r1 = r1 / r20;
        r1 = r1 + r13;
        r0 = r17;
        if (r1 <= r0) goto L_0x0011;
    L_0x000f:
        r1 = r17;
    L_0x0011:
        r2 = r13 << 1;
        r1 = r1 << 1;
        r3 = r12;
    L_0x0016:
        if (r2 >= r1) goto L_0x003f;
    L_0x0018:
        r4 = r3 >> 8;
        r5 = r10[r4];
        r6 = r5 << 8;
        r4 = r4 + 1;
        r4 = r10[r4];
        r4 = r4 - r5;
        r5 = r3 & 255;
        r4 = r4 * r5;
        r4 = r4 + r6;
        r5 = r2 + 1;
        r6 = r11[r2];
        r7 = r4 * r14;
        r7 = r7 >> 6;
        r6 = r6 + r7;
        r11[r2] = r6;
        r2 = r5 + 1;
        r6 = r11[r5];
        r4 = r4 * r15;
        r4 = r4 >> 6;
        r4 = r4 + r6;
        r11[r5] = r4;
        r3 = r3 + r20;
        goto L_0x0016;
    L_0x003f:
        if (r20 == 0) goto L_0x0050;
    L_0x0041:
        r1 = r2 >> 1;
        r4 = r18 - r3;
        r4 = r4 + r20;
        r4 = r4 + -1;
        r4 = r4 / r20;
        r1 = r1 + r4;
        r0 = r17;
        if (r1 <= r0) goto L_0x0081;
    L_0x0050:
        r4 = r17 << 1;
        r1 = r2;
        r2 = r3;
    L_0x0054:
        if (r1 >= r4) goto L_0x007a;
    L_0x0056:
        r3 = r2 >> 8;
        r3 = r10[r3];
        r5 = r3 << 8;
        r3 = r21 - r3;
        r6 = r2 & 255;
        r3 = r3 * r6;
        r3 = r3 + r5;
        r5 = r1 + 1;
        r6 = r11[r1];
        r7 = r3 * r14;
        r7 = r7 >> 6;
        r6 = r6 + r7;
        r11[r1] = r6;
        r1 = r5 + 1;
        r6 = r11[r5];
        r3 = r3 * r15;
        r3 = r3 >> 6;
        r3 = r3 + r6;
        r11[r5] = r3;
        r2 = r2 + r20;
        goto L_0x0054;
    L_0x007a:
        r0 = r19;
        r0.af = r2;
        r1 = r1 >> 1;
        return r1;
    L_0x0081:
        r17 = r1;
        goto L_0x0050;
        */
        throw new UnsupportedOperationException("Method not decompiled: fh.eh(int, int, byte[], int[], int, int, int, int, int, int, int, fh, int, int):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int eo(int r8, int r9, byte[] r10, int[] r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, p000.fh r19, int r20, int r21) {
        /*
        if (r20 == 0) goto L_0x0011;
    L_0x0002:
        r1 = r18 - r12;
        r1 = r1 + r20;
        r2 = 617348823; // 0x24cbfed7 float:8.846893E-17 double:3.05010845E-315;
        r1 = r1 - r2;
        r1 = r1 / r20;
        r1 = r1 + r13;
        r0 = r17;
        if (r1 <= r0) goto L_0x0013;
    L_0x0011:
        r1 = r17;
    L_0x0013:
        r2 = r13 << 1;
        r1 = r1 << 1;
        r3 = r12;
    L_0x0018:
        if (r2 >= r1) goto L_0x0043;
    L_0x001a:
        r4 = r3 >> 8;
        r5 = r10[r4];
        r6 = r5 << 8;
        r4 = r4 + 1;
        r4 = r10[r4];
        r4 = r4 - r5;
        r5 = 1172468336; // 0x45e27270 float:7246.3047 double:5.792763257E-315;
        r5 = r5 & r3;
        r4 = r4 * r5;
        r4 = r4 + r6;
        r5 = r2 + 1;
        r6 = r11[r2];
        r7 = r4 * r14;
        r7 = r7 >> 6;
        r6 = r6 + r7;
        r11[r2] = r6;
        r2 = r5 + 1;
        r6 = r11[r5];
        r4 = r4 * r15;
        r4 = r4 >> 6;
        r4 = r4 + r6;
        r11[r5] = r4;
        r3 = r3 + r20;
        goto L_0x0018;
    L_0x0043:
        if (r20 == 0) goto L_0x0054;
    L_0x0045:
        r1 = r2 >> 1;
        r4 = r18 - r3;
        r4 = r4 + r20;
        r4 = r4 + -1;
        r4 = r4 / r20;
        r1 = r1 + r4;
        r0 = r17;
        if (r1 <= r0) goto L_0x0085;
    L_0x0054:
        r4 = r17 << 1;
        r1 = r2;
        r2 = r3;
    L_0x0058:
        if (r1 >= r4) goto L_0x007e;
    L_0x005a:
        r3 = r2 >> 8;
        r3 = r10[r3];
        r5 = r3 << 8;
        r3 = r21 - r3;
        r6 = r2 & 255;
        r3 = r3 * r6;
        r3 = r3 + r5;
        r5 = r1 + 1;
        r6 = r11[r1];
        r7 = r3 * r14;
        r7 = r7 >> 6;
        r6 = r6 + r7;
        r11[r1] = r6;
        r1 = r5 + 1;
        r6 = r11[r5];
        r3 = r3 * r15;
        r3 = r3 >> 6;
        r3 = r3 + r6;
        r11[r5] = r3;
        r2 = r2 + r20;
        goto L_0x0058;
    L_0x007e:
        r0 = r19;
        r0.af = r2;
        r1 = r1 >> 1;
        return r1;
    L_0x0085:
        r17 = r1;
        goto L_0x0054;
        */
        throw new UnsupportedOperationException("Method not decompiled: fh.eo(int, int, byte[], int[], int, int, int, int, int, int, int, fh, int, int):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int fd(int r8, int r9, byte[] r10, int[] r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, p000.fh r19, int r20, int r21) {
        /*
        if (r20 == 0) goto L_0x0011;
    L_0x0002:
        r1 = r18 - r12;
        r1 = r1 + r20;
        r2 = 1318529535; // 0x4e9729ff float:1.26805594E9 double:6.514401463E-315;
        r1 = r1 - r2;
        r1 = r1 / r20;
        r1 = r1 + r13;
        r0 = r17;
        if (r1 <= r0) goto L_0x0013;
    L_0x0011:
        r1 = r17;
    L_0x0013:
        r2 = r13 << 1;
        r1 = r1 << 1;
        r3 = r12;
    L_0x0018:
        if (r2 >= r1) goto L_0x0041;
    L_0x001a:
        r4 = r3 >> 8;
        r5 = r10[r4];
        r6 = r5 << 8;
        r4 = r4 + 1;
        r4 = r10[r4];
        r4 = r4 - r5;
        r5 = r3 & 255;
        r4 = r4 * r5;
        r4 = r4 + r6;
        r5 = r2 + 1;
        r6 = r11[r2];
        r7 = r4 * r14;
        r7 = r7 >> 6;
        r6 = r6 + r7;
        r11[r2] = r6;
        r2 = r5 + 1;
        r6 = r11[r5];
        r4 = r4 * r15;
        r4 = r4 >> 6;
        r4 = r4 + r6;
        r11[r5] = r4;
        r3 = r3 + r20;
        goto L_0x0018;
    L_0x0041:
        if (r20 == 0) goto L_0x0052;
    L_0x0043:
        r1 = r2 >> 1;
        r4 = r18 - r3;
        r4 = r4 + r20;
        r4 = r4 + -1;
        r4 = r4 / r20;
        r1 = r1 + r4;
        r0 = r17;
        if (r1 <= r0) goto L_0x0083;
    L_0x0052:
        r4 = r17 << 1;
        r1 = r2;
        r2 = r3;
    L_0x0056:
        if (r1 >= r4) goto L_0x007c;
    L_0x0058:
        r3 = r2 >> 8;
        r3 = r10[r3];
        r5 = r3 << 8;
        r3 = r21 - r3;
        r6 = r2 & 255;
        r3 = r3 * r6;
        r3 = r3 + r5;
        r5 = r1 + 1;
        r6 = r11[r1];
        r7 = r3 * r14;
        r7 = r7 >> 6;
        r6 = r6 + r7;
        r11[r1] = r6;
        r1 = r5 + 1;
        r6 = r11[r5];
        r3 = r3 * r15;
        r3 = r3 >> 6;
        r3 = r3 + r6;
        r11[r5] = r3;
        r2 = r2 + r20;
        goto L_0x0056;
    L_0x007c:
        r0 = r19;
        r0.af = r2;
        r1 = r1 >> 1;
        return r1;
    L_0x0083:
        r17 = r1;
        goto L_0x0052;
        */
        throw new UnsupportedOperationException("Method not decompiled: fh.fd(int, int, byte[], int[], int, int, int, int, int, int, int, fh, int, int):int");
    }

    static int bq(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, fh fhVar, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        if (i9 != 0) {
            i11 = ((((i8 + 256) - i3) + i9) / i9) + i4;
            if (i11 <= i7) {
                i12 = i4;
                i13 = i3;
                while (i12 < i11) {
                    int i14 = i13 >> 8;
                    byte b = bArr[i14 - 1];
                    i4 = i12 + 1;
                    iArr[i12] = (((((bArr[i14] - b) * (i13 & 255)) + (b << 8)) * i5) >> 6) + iArr[i12];
                    i12 = i4;
                    i13 += i9;
                }
                if (i9 != 0) {
                    i11 = (((i8 - i13) + i9) / i9) + i12;
                    if (i11 <= i7) {
                        i7 = i11;
                    }
                }
                i11 = i12;
                while (i11 < i7) {
                    i12 = i11 + 1;
                    iArr[i11] = iArr[i11] + ((((i10 << 8) + ((bArr[i13 >> 8] - i10) * (i13 & 255))) * i5) >> 6);
                    i13 += i9;
                    i11 = i12;
                }
                fhVar.af = i13;
                return i11;
            }
        }
        i11 = i7;
        i12 = i4;
        i13 = i3;
        while (i12 < i11) {
            int i142 = i13 >> 8;
            byte b2 = bArr[i142 - 1];
            i4 = i12 + 1;
            iArr[i12] = (((((bArr[i142] - b2) * (i13 & 255)) + (b2 << 8)) * i5) >> 6) + iArr[i12];
            i12 = i4;
            i13 += i9;
        }
        if (i9 != 0) {
            i11 = (((i8 - i13) + i9) / i9) + i12;
            if (i11 <= i7) {
                i7 = i11;
            }
        }
        i11 = i12;
        while (i11 < i7) {
            i12 = i11 + 1;
            iArr[i11] = iArr[i11] + ((((i10 << 8) + ((bArr[i13 >> 8] - i10) * (i13 & 255))) * i5) >> 6);
            i13 += i9;
            i11 = i12;
        }
        fhVar.af = i13;
        return i11;
    }

    static int fa(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, fh fhVar, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        if (i9 != 0) {
            i11 = ((((-1128844011 + i8) - i3) + i9) / i9) + i4;
            if (i11 <= i7) {
                i12 = i4;
                i13 = i3;
                while (i12 < i11) {
                    int i14 = i13 >> 8;
                    byte b = bArr[i14 - 1];
                    i4 = i12 + 1;
                    iArr[i12] = (((((bArr[i14] - b) * (1703783232 & i13)) + (b << 8)) * i5) >> 6) + iArr[i12];
                    i12 = i4;
                    i13 += i9;
                }
                if (i9 != 0) {
                    i11 = (((i8 - i13) + i9) / i9) + i12;
                    if (i11 <= i7) {
                        i7 = i11;
                    }
                }
                i11 = i12;
                while (i11 < i7) {
                    i12 = i11 + 1;
                    iArr[i11] = iArr[i11] + ((((i10 << 8) + ((bArr[i13 >> 8] - i10) * (1625775593 & i13))) * i5) >> 6);
                    i13 += i9;
                    i11 = i12;
                }
                fhVar.af = i13;
                return i11;
            }
        }
        i11 = i7;
        i12 = i4;
        i13 = i3;
        while (i12 < i11) {
            int i142 = i13 >> 8;
            byte b2 = bArr[i142 - 1];
            i4 = i12 + 1;
            iArr[i12] = (((((bArr[i142] - b2) * (1703783232 & i13)) + (b2 << 8)) * i5) >> 6) + iArr[i12];
            i12 = i4;
            i13 += i9;
        }
        if (i9 != 0) {
            i11 = (((i8 - i13) + i9) / i9) + i12;
            if (i11 <= i7) {
                i7 = i11;
            }
        }
        i11 = i12;
        while (i11 < i7) {
            i12 = i11 + 1;
            iArr[i11] = iArr[i11] + ((((i10 << 8) + ((bArr[i13 >> 8] - i10) * (1625775593 & i13))) * i5) >> 6);
            i13 += i9;
            i11 = i12;
        }
        fhVar.af = i13;
        return i11;
    }

    static int fk(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, fh fhVar, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        if (i9 != 0) {
            i11 = ((((i8 + 256) - i3) + i9) / i9) + i4;
            if (i11 <= i7) {
                i12 = i4;
                i13 = i3;
                while (i12 < i11) {
                    int i14 = i13 >> 8;
                    byte b = bArr[i14 - 1];
                    i4 = i12 + 1;
                    iArr[i12] = (((((bArr[i14] - b) * (i13 & 255)) + (b << 8)) * i5) >> 6) + iArr[i12];
                    i12 = i4;
                    i13 += i9;
                }
                if (i9 != 0) {
                    i11 = (((i8 - i13) + i9) / i9) + i12;
                    if (i11 <= i7) {
                        i7 = i11;
                    }
                }
                i11 = i12;
                while (i11 < i7) {
                    i12 = i11 + 1;
                    iArr[i11] = iArr[i11] + ((((i10 << 8) + ((bArr[i13 >> 8] - i10) * (i13 & 255))) * i5) >> 6);
                    i13 += i9;
                    i11 = i12;
                }
                fhVar.af = i13;
                return i11;
            }
        }
        i11 = i7;
        i12 = i4;
        i13 = i3;
        while (i12 < i11) {
            int i142 = i13 >> 8;
            byte b2 = bArr[i142 - 1];
            i4 = i12 + 1;
            iArr[i12] = (((((bArr[i142] - b2) * (i13 & 255)) + (b2 << 8)) * i5) >> 6) + iArr[i12];
            i12 = i4;
            i13 += i9;
        }
        if (i9 != 0) {
            i11 = (((i8 - i13) + i9) / i9) + i12;
            if (i11 <= i7) {
                i7 = i11;
            }
        }
        i11 = i12;
        while (i11 < i7) {
            i12 = i11 + 1;
            iArr[i11] = iArr[i11] + ((((i10 << 8) + ((bArr[i13 >> 8] - i10) * (i13 & 255))) * i5) >> 6);
            i13 += i9;
            i11 = i12;
        }
        fhVar.af = i13;
        return i11;
    }

    static int fm(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, fh fhVar, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        if (i9 != 0) {
            i11 = ((((i8 + 256) - i3) + i9) / i9) + i4;
            if (i11 <= i7) {
                i12 = i4;
                i13 = i3;
                while (i12 < i11) {
                    int i14 = i13 >> 8;
                    byte b = bArr[i14 - 1];
                    i4 = i12 + 1;
                    iArr[i12] = (((((bArr[i14] - b) * (i13 & 255)) + (b << 8)) * i5) >> 6) + iArr[i12];
                    i12 = i4;
                    i13 += i9;
                }
                if (i9 != 0) {
                    i11 = (((i8 - i13) + i9) / i9) + i12;
                    if (i11 <= i7) {
                        i7 = i11;
                    }
                }
                i11 = i12;
                while (i11 < i7) {
                    i12 = i11 + 1;
                    iArr[i11] = iArr[i11] + ((((i10 << 8) + ((bArr[i13 >> 8] - i10) * (i13 & 255))) * i5) >> 6);
                    i13 += i9;
                    i11 = i12;
                }
                fhVar.af = i13;
                return i11;
            }
        }
        i11 = i7;
        i12 = i4;
        i13 = i3;
        while (i12 < i11) {
            int i142 = i13 >> 8;
            byte b2 = bArr[i142 - 1];
            i4 = i12 + 1;
            iArr[i12] = (((((bArr[i142] - b2) * (i13 & 255)) + (b2 << 8)) * i5) >> 6) + iArr[i12];
            i12 = i4;
            i13 += i9;
        }
        if (i9 != 0) {
            i11 = (((i8 - i13) + i9) / i9) + i12;
            if (i11 <= i7) {
                i7 = i11;
            }
        }
        i11 = i12;
        while (i11 < i7) {
            i12 = i11 + 1;
            iArr[i11] = iArr[i11] + ((((i10 << 8) + ((bArr[i13 >> 8] - i10) * (i13 & 255))) * i5) >> 6);
            i13 += i9;
            i11 = i12;
        }
        fhVar.af = i13;
        return i11;
    }

    static int fv(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, fh fhVar, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        if (i9 != 0) {
            i11 = ((((1733403337 + i8) - i3) + i9) / i9) + i4;
            if (i11 <= i7) {
                i12 = i4;
                i13 = i3;
                while (i12 < i11) {
                    int i14 = i13 >> 8;
                    byte b = bArr[i14 - 1];
                    i4 = i12 + 1;
                    iArr[i12] = (((((bArr[i14] - b) * (i13 & 255)) + (b << 8)) * i5) >> 6) + iArr[i12];
                    i12 = i4;
                    i13 += i9;
                }
                if (i9 != 0) {
                    i11 = (((i8 - i13) + i9) / i9) + i12;
                    if (i11 <= i7) {
                        i7 = i11;
                    }
                }
                i11 = i12;
                while (i11 < i7) {
                    i12 = i11 + 1;
                    iArr[i11] = iArr[i11] + ((((i10 << 8) + ((bArr[i13 >> 8] - i10) * (i13 & 255))) * i5) >> 6);
                    i13 += i9;
                    i11 = i12;
                }
                fhVar.af = i13;
                return i11;
            }
        }
        i11 = i7;
        i12 = i4;
        i13 = i3;
        while (i12 < i11) {
            int i142 = i13 >> 8;
            byte b2 = bArr[i142 - 1];
            i4 = i12 + 1;
            iArr[i12] = (((((bArr[i142] - b2) * (i13 & 255)) + (b2 << 8)) * i5) >> 6) + iArr[i12];
            i12 = i4;
            i13 += i9;
        }
        if (i9 != 0) {
            i11 = (((i8 - i13) + i9) / i9) + i12;
            if (i11 <= i7) {
                i7 = i11;
            }
        }
        i11 = i12;
        while (i11 < i7) {
            i12 = i11 + 1;
            iArr[i11] = iArr[i11] + ((((i10 << 8) + ((bArr[i13 >> 8] - i10) * (i13 & 255))) * i5) >> 6);
            i13 += i9;
            i11 = i12;
        }
        fhVar.af = i13;
        return i11;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int bo(int r8, int r9, byte[] r10, int[] r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, p000.fh r19, int r20, int r21) {
        /*
        if (r20 == 0) goto L_0x0010;
    L_0x0002:
        r0 = r18;
        r1 = r0 + 256;
        r1 = r1 - r12;
        r1 = r1 + r20;
        r1 = r1 / r20;
        r1 = r1 + r13;
        r0 = r17;
        if (r1 <= r0) goto L_0x0012;
    L_0x0010:
        r1 = r17;
    L_0x0012:
        r2 = r13 << 1;
        r1 = r1 << 1;
        r3 = r12;
    L_0x0017:
        if (r2 >= r1) goto L_0x0040;
    L_0x0019:
        r4 = r3 >> 8;
        r5 = r4 + -1;
        r5 = r10[r5];
        r6 = r5 << 8;
        r4 = r10[r4];
        r4 = r4 - r5;
        r5 = r3 & 255;
        r4 = r4 * r5;
        r4 = r4 + r6;
        r5 = r2 + 1;
        r6 = r11[r2];
        r7 = r4 * r14;
        r7 = r7 >> 6;
        r6 = r6 + r7;
        r11[r2] = r6;
        r2 = r5 + 1;
        r6 = r11[r5];
        r4 = r4 * r15;
        r4 = r4 >> 6;
        r4 = r4 + r6;
        r11[r5] = r4;
        r3 = r3 + r20;
        goto L_0x0017;
    L_0x0040:
        if (r20 == 0) goto L_0x004f;
    L_0x0042:
        r1 = r2 >> 1;
        r4 = r18 - r3;
        r4 = r4 + r20;
        r4 = r4 / r20;
        r1 = r1 + r4;
        r0 = r17;
        if (r1 <= r0) goto L_0x0080;
    L_0x004f:
        r4 = r17 << 1;
        r1 = r2;
        r2 = r3;
    L_0x0053:
        if (r1 >= r4) goto L_0x0079;
    L_0x0055:
        r3 = r21 << 8;
        r5 = r2 >> 8;
        r5 = r10[r5];
        r5 = r5 - r21;
        r6 = r2 & 255;
        r5 = r5 * r6;
        r3 = r3 + r5;
        r5 = r1 + 1;
        r6 = r11[r1];
        r7 = r3 * r14;
        r7 = r7 >> 6;
        r6 = r6 + r7;
        r11[r1] = r6;
        r1 = r5 + 1;
        r6 = r11[r5];
        r3 = r3 * r15;
        r3 = r3 >> 6;
        r3 = r3 + r6;
        r11[r5] = r3;
        r2 = r2 + r20;
        goto L_0x0053;
    L_0x0079:
        r0 = r19;
        r0.af = r2;
        r1 = r1 >> 1;
        return r1;
    L_0x0080:
        r17 = r1;
        goto L_0x004f;
        */
        throw new UnsupportedOperationException("Method not decompiled: fh.bo(int, int, byte[], int[], int, int, int, int, int, int, int, fh, int, int):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int fh(int r8, int r9, byte[] r10, int[] r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, p000.fh r19, int r20, int r21) {
        /*
        if (r20 == 0) goto L_0x0010;
    L_0x0002:
        r0 = r18;
        r1 = r0 + 256;
        r1 = r1 - r12;
        r1 = r1 + r20;
        r1 = r1 / r20;
        r1 = r1 + r13;
        r0 = r17;
        if (r1 <= r0) goto L_0x0012;
    L_0x0010:
        r1 = r17;
    L_0x0012:
        r2 = r13 << 1;
        r1 = r1 << 1;
        r3 = r12;
    L_0x0017:
        if (r2 >= r1) goto L_0x0042;
    L_0x0019:
        r4 = r3 >> 8;
        r5 = r4 + -1;
        r5 = r10[r5];
        r6 = r5 << 8;
        r4 = r10[r4];
        r4 = r4 - r5;
        r5 = 261806431; // 0xf9ad95f float:1.52693E-29 double:1.293495634E-315;
        r5 = r5 & r3;
        r4 = r4 * r5;
        r4 = r4 + r6;
        r5 = r2 + 1;
        r6 = r11[r2];
        r7 = r4 * r14;
        r7 = r7 >> 6;
        r6 = r6 + r7;
        r11[r2] = r6;
        r2 = r5 + 1;
        r6 = r11[r5];
        r4 = r4 * r15;
        r4 = r4 >> 6;
        r4 = r4 + r6;
        r11[r5] = r4;
        r3 = r3 + r20;
        goto L_0x0017;
    L_0x0042:
        if (r20 == 0) goto L_0x0051;
    L_0x0044:
        r1 = r2 >> 1;
        r4 = r18 - r3;
        r4 = r4 + r20;
        r4 = r4 / r20;
        r1 = r1 + r4;
        r0 = r17;
        if (r1 <= r0) goto L_0x0082;
    L_0x0051:
        r4 = r17 << 1;
        r1 = r2;
        r2 = r3;
    L_0x0055:
        if (r1 >= r4) goto L_0x007b;
    L_0x0057:
        r3 = r21 << 8;
        r5 = r2 >> 8;
        r5 = r10[r5];
        r5 = r5 - r21;
        r6 = r2 & 255;
        r5 = r5 * r6;
        r3 = r3 + r5;
        r5 = r1 + 1;
        r6 = r11[r1];
        r7 = r3 * r14;
        r7 = r7 >> 6;
        r6 = r6 + r7;
        r11[r1] = r6;
        r1 = r5 + 1;
        r6 = r11[r5];
        r3 = r3 * r15;
        r3 = r3 >> 6;
        r3 = r3 + r6;
        r11[r5] = r3;
        r2 = r2 + r20;
        goto L_0x0055;
    L_0x007b:
        r0 = r19;
        r0.af = r2;
        r1 = r1 >> 1;
        return r1;
    L_0x0082:
        r17 = r1;
        goto L_0x0051;
        */
        throw new UnsupportedOperationException("Method not decompiled: fh.fh(int, int, byte[], int[], int, int, int, int, int, int, int, fh, int, int):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int fl(int r8, int r9, byte[] r10, int[] r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, p000.fh r19, int r20, int r21) {
        /*
        if (r20 == 0) goto L_0x0010;
    L_0x0002:
        r0 = r18;
        r1 = r0 + 256;
        r1 = r1 - r12;
        r1 = r1 + r20;
        r1 = r1 / r20;
        r1 = r1 + r13;
        r0 = r17;
        if (r1 <= r0) goto L_0x0012;
    L_0x0010:
        r1 = r17;
    L_0x0012:
        r2 = r13 << 1;
        r1 = r1 << 1;
        r3 = r12;
    L_0x0017:
        if (r2 >= r1) goto L_0x0066;
    L_0x0019:
        r4 = r3 >> 8;
        r5 = r4 + -1;
        r5 = r10[r5];
        r6 = r5 << 8;
        r4 = r10[r4];
        r4 = r4 - r5;
        r5 = r3 & 255;
        r4 = r4 * r5;
        r4 = r4 + r6;
        r5 = r2 + 1;
        r6 = r11[r2];
        r7 = r4 * r14;
        r7 = r7 >> 6;
        r6 = r6 + r7;
        r11[r2] = r6;
        r2 = r5 + 1;
        r6 = r11[r5];
        r4 = r4 * r15;
        r4 = r4 >> 6;
        r4 = r4 + r6;
        r11[r5] = r4;
        r3 = r3 + r20;
        goto L_0x0017;
    L_0x0040:
        r2 = r2 + r20;
    L_0x0042:
        if (r1 >= r4) goto L_0x007a;
    L_0x0044:
        r3 = r21 << 8;
        r5 = r2 >> 8;
        r5 = r10[r5];
        r5 = r5 - r21;
        r6 = r2 & 255;
        r5 = r5 * r6;
        r3 = r3 + r5;
        r5 = r1 + 1;
        r6 = r11[r1];
        r7 = r3 * r14;
        r7 = r7 >> 6;
        r6 = r6 + r7;
        r11[r1] = r6;
        r1 = r5 + 1;
        r6 = r11[r5];
        r3 = r3 * r15;
        r3 = r3 >> 6;
        r3 = r3 + r6;
        r11[r5] = r3;
        goto L_0x0040;
    L_0x0066:
        if (r20 == 0) goto L_0x0075;
    L_0x0068:
        r1 = r2 >> 1;
        r4 = r18 - r3;
        r4 = r4 + r20;
        r4 = r4 / r20;
        r1 = r1 + r4;
        r0 = r17;
        if (r1 <= r0) goto L_0x0081;
    L_0x0075:
        r4 = r17 << 1;
        r1 = r2;
        r2 = r3;
        goto L_0x0042;
    L_0x007a:
        r0 = r19;
        r0.af = r2;
        r1 = r1 >> 1;
        return r1;
    L_0x0081:
        r17 = r1;
        goto L_0x0075;
        */
        throw new UnsupportedOperationException("Method not decompiled: fh.fl(int, int, byte[], int[], int, int, int, int, int, int, int, fh, int, int):int");
    }

    static int cv(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, fh fhVar) {
        int i8;
        int i9 = i >> 8;
        int i10 = i3 << 2;
        int i11 = i4 << 2;
        int i12 = ((i7 >> 8) + i2) - i9;
        if (i12 <= i6) {
            i6 = i12;
        }
        fhVar.ay += fhVar.ab * (i6 - i2);
        fhVar.as += fhVar.aw * (i6 - i2);
        int i13 = i6 - 3;
        i12 = i10;
        i10 = i2;
        while (i10 < i13) {
            int i14 = i10 + 1;
            int i15 = i9 + 1;
            iArr[i10] = (bArr[i9] * i12) + iArr[i10];
            i12 += i11;
            i10 = i14 + 1;
            i8 = i15 + 1;
            iArr[i14] = iArr[i14] + (bArr[i15] * i12);
            i12 += i11;
            i14 = i10 + 1;
            i15 = i8 + 1;
            iArr[i10] = iArr[i10] + (bArr[i8] * i12);
            i12 += i11;
            i10 = i14 + 1;
            i9 = i15 + 1;
            iArr[i14] = iArr[i14] + (bArr[i15] * i12);
            i12 += i11;
        }
        i8 = i13 + 3;
        i13 = i9;
        while (i10 < i8) {
            i9 = i10 + 1;
            i14 = i13 + 1;
            iArr[i10] = (bArr[i13] * i12) + iArr[i10];
            i12 += i11;
            i10 = i9;
            i13 = i14;
        }
        fhVar.ag = i12 >> 2;
        fhVar.af = i13 << 8;
        return i10;
    }

    static int fb(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, fh fhVar) {
        int i8;
        int i9 = i >> 8;
        int i10 = i3 << 2;
        int i11 = i4 << 2;
        int i12 = ((i7 >> 8) + i2) - i9;
        if (i12 <= i6) {
            i6 = i12;
        }
        fhVar.ay += fhVar.ab * (i6 - i2);
        fhVar.as += fhVar.aw * (i6 - i2);
        int i13 = i6 - 3;
        i12 = i10;
        i10 = i2;
        while (i10 < i13) {
            int i14 = i10 + 1;
            int i15 = i9 + 1;
            iArr[i10] = (bArr[i9] * i12) + iArr[i10];
            i12 += i11;
            i10 = i14 + 1;
            i8 = i15 + 1;
            iArr[i14] = iArr[i14] + (bArr[i15] * i12);
            i12 += i11;
            i14 = i10 + 1;
            i15 = i8 + 1;
            iArr[i10] = iArr[i10] + (bArr[i8] * i12);
            i12 += i11;
            i10 = i14 + 1;
            i9 = i15 + 1;
            iArr[i14] = iArr[i14] + (bArr[i15] * i12);
            i12 += i11;
        }
        i8 = i13 + 3;
        i13 = i9;
        while (i10 < i8) {
            i9 = i10 + 1;
            i14 = i13 + 1;
            iArr[i10] = (bArr[i13] * i12) + iArr[i10];
            i12 += i11;
            i10 = i9;
            i13 = i14;
        }
        fhVar.ag = i12 >> 2;
        fhVar.af = i13 << 8;
        return i10;
    }

    static int fg(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, fh fhVar) {
        int i8;
        int i9 = i >> 8;
        int i10 = i3 << 2;
        int i11 = i4 << 2;
        int i12 = ((i7 >> 8) + i2) - i9;
        if (i12 <= i6) {
            i6 = i12;
        }
        fhVar.ay += fhVar.ab * (i6 - i2);
        fhVar.as += fhVar.aw * (i6 - i2);
        int i13 = i6 - 3;
        i12 = i10;
        i10 = i2;
        while (i10 < i13) {
            int i14 = i10 + 1;
            int i15 = i9 + 1;
            iArr[i10] = (bArr[i9] * i12) + iArr[i10];
            i12 += i11;
            i10 = i14 + 1;
            i8 = i15 + 1;
            iArr[i14] = iArr[i14] + (bArr[i15] * i12);
            i12 += i11;
            i14 = i10 + 1;
            i15 = i8 + 1;
            iArr[i10] = iArr[i10] + (bArr[i8] * i12);
            i12 += i11;
            i10 = i14 + 1;
            i9 = i15 + 1;
            iArr[i14] = iArr[i14] + (bArr[i15] * i12);
            i12 += i11;
        }
        i8 = i13 + 3;
        i13 = i9;
        while (i10 < i8) {
            i9 = i10 + 1;
            i14 = i13 + 1;
            iArr[i10] = (bArr[i13] * i12) + iArr[i10];
            i12 += i11;
            i10 = i9;
            i13 = i14;
        }
        fhVar.ag = i12 >> 2;
        fhVar.af = i13 << 8;
        return i10;
    }

    static int fp(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, fh fhVar) {
        int i8;
        int i9 = i >> 8;
        int i10 = i3 << 2;
        int i11 = i4 << 2;
        int i12 = ((i7 >> 8) + i2) - i9;
        if (i12 <= i6) {
            i6 = i12;
        }
        fhVar.ay += fhVar.ab * (i6 - i2);
        fhVar.as += fhVar.aw * (i6 - i2);
        int i13 = i6 - 3;
        i12 = i10;
        i10 = i2;
        while (i10 < i13) {
            int i14 = i10 + 1;
            int i15 = i9 + 1;
            iArr[i10] = (bArr[i9] * i12) + iArr[i10];
            i12 += i11;
            i10 = i14 + 1;
            i8 = i15 + 1;
            iArr[i14] = iArr[i14] + (bArr[i15] * i12);
            i12 += i11;
            i14 = i10 + 1;
            i15 = i8 + 1;
            iArr[i10] = iArr[i10] + (bArr[i8] * i12);
            i12 += i11;
            i10 = i14 + 1;
            i9 = i15 + 1;
            iArr[i14] = iArr[i14] + (bArr[i15] * i12);
            i12 += i11;
        }
        i8 = i13 + 3;
        i13 = i9;
        while (i10 < i8) {
            i9 = i10 + 1;
            i14 = i13 + 1;
            iArr[i10] = (bArr[i13] * i12) + iArr[i10];
            i12 += i11;
            i10 = i9;
            i13 = i14;
        }
        fhVar.ag = i12 >> 2;
        fhVar.af = i13 << 8;
        return i10;
    }

    static int fr(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, fh fhVar) {
        int i8;
        int i9 = i >> 8;
        int i10 = i3 << 2;
        int i11 = i4 << 2;
        int i12 = ((i7 >> 8) + i2) - i9;
        if (i12 <= i6) {
            i6 = i12;
        }
        fhVar.ay += fhVar.ab * (i6 - i2);
        fhVar.as += fhVar.aw * (i6 - i2);
        int i13 = i6 - 3;
        i12 = i10;
        i10 = i2;
        while (i10 < i13) {
            int i14 = i10 + 1;
            int i15 = i9 + 1;
            iArr[i10] = (bArr[i9] * i12) + iArr[i10];
            i12 += i11;
            i10 = i14 + 1;
            i8 = i15 + 1;
            iArr[i14] = iArr[i14] + (bArr[i15] * i12);
            i12 += i11;
            i14 = i10 + 1;
            i15 = i8 + 1;
            iArr[i10] = iArr[i10] + (bArr[i8] * i12);
            i12 += i11;
            i10 = i14 + 1;
            i9 = i15 + 1;
            iArr[i14] = iArr[i14] + (bArr[i15] * i12);
            i12 += i11;
        }
        i8 = i13 + 3;
        i13 = i9;
        while (i10 < i8) {
            i9 = i10 + 1;
            i14 = i13 + 1;
            iArr[i10] = (bArr[i13] * i12) + iArr[i10];
            i12 += i11;
            i10 = i9;
            i13 = i14;
        }
        fhVar.ag = i12 >> 2;
        fhVar.af = i13 << 8;
        return i10;
    }

    static int ci(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, fh fhVar) {
        int i11;
        int i12 = i2 >> 8;
        int i13 = i4 << 2;
        int i14 = i5 << 2;
        int i15 = i6 << 2;
        int i16 = i7 << 2;
        int i17 = ((i10 >> 8) + i3) - i12;
        if (i17 <= i9) {
            i9 = i17;
        }
        fhVar.ag += fhVar.at * (i9 - i3);
        int i18 = (i9 << 1) - 6;
        int i19 = i14;
        i14 = i13;
        i13 = i3 << 1;
        i17 = i19;
        while (i13 < i18) {
            i11 = i12 + 1;
            byte b = bArr[i12];
            int i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b * i17) + iArr[i20];
            i17 += i16;
            i12 = i11 + 1;
            byte b2 = bArr[i11];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b2 * i17) + iArr[i20];
            i17 += i16;
            i11 = i12 + 1;
            b = bArr[i12];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b * i17) + iArr[i20];
            i17 += i16;
            i12 = i11 + 1;
            b2 = bArr[i11];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b2 * i17) + iArr[i20];
            i17 += i16;
        }
        i11 = i18 + 6;
        while (i13 < i11) {
            i18 = i12 + 1;
            b = bArr[i12];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b * i17) + iArr[i20];
            i17 += i16;
            i12 = i18;
        }
        fhVar.ay = i14 >> 2;
        fhVar.as = i17 >> 2;
        fhVar.af = i12 << 8;
        return i13 >> 1;
    }

    static int fq(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, fh fhVar) {
        int i11;
        int i12 = i2 >> 8;
        int i13 = i4 << 2;
        int i14 = i5 << 2;
        int i15 = i6 << 2;
        int i16 = i7 << 2;
        int i17 = ((i10 >> 8) + i3) - i12;
        if (i17 <= i9) {
            i9 = i17;
        }
        fhVar.ag += fhVar.at * (i9 - i3);
        int i18 = (i9 << 1) - 6;
        int i19 = i14;
        i14 = i13;
        i13 = i3 << 1;
        i17 = i19;
        while (i13 < i18) {
            i11 = i12 + 1;
            byte b = bArr[i12];
            int i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b * i17) + iArr[i20];
            i17 += i16;
            i12 = i11 + 1;
            byte b2 = bArr[i11];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b2 * i17) + iArr[i20];
            i17 += i16;
            i11 = i12 + 1;
            b = bArr[i12];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b * i17) + iArr[i20];
            i17 += i16;
            i12 = i11 + 1;
            b2 = bArr[i11];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b2 * i17) + iArr[i20];
            i17 += i16;
        }
        i11 = i18 + 6;
        while (i13 < i11) {
            i18 = i12 + 1;
            b = bArr[i12];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b * i17) + iArr[i20];
            i17 += i16;
            i12 = i18;
        }
        fhVar.ay = i14 >> 2;
        fhVar.as = i17 >> 2;
        fhVar.af = i12 << 8;
        return i13 >> 1;
    }

    static int cc(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, fh fhVar) {
        int i8;
        int i9 = i >> 8;
        int i10 = i3 << 2;
        int i11 = i4 << 2;
        int i12 = (i2 + i9) - ((i7 >> 8) - 1);
        if (i12 <= i6) {
            i6 = i12;
        }
        fhVar.ay += fhVar.ab * (i6 - i2);
        fhVar.as += fhVar.aw * (i6 - i2);
        int i13 = i6 - 3;
        i12 = i10;
        i10 = i2;
        while (i10 < i13) {
            int i14 = i10 + 1;
            int i15 = i9 - 1;
            iArr[i10] = (bArr[i9] * i12) + iArr[i10];
            i12 += i11;
            i10 = i14 + 1;
            i8 = i15 - 1;
            iArr[i14] = iArr[i14] + (bArr[i15] * i12);
            i12 += i11;
            i14 = i10 + 1;
            i15 = i8 - 1;
            iArr[i10] = iArr[i10] + (bArr[i8] * i12);
            i12 += i11;
            i10 = i14 + 1;
            i9 = i15 - 1;
            iArr[i14] = iArr[i14] + (bArr[i15] * i12);
            i12 += i11;
        }
        i8 = i13 + 3;
        i13 = i9;
        while (i10 < i8) {
            i9 = i10 + 1;
            i14 = i13 - 1;
            iArr[i10] = (bArr[i13] * i12) + iArr[i10];
            i12 += i11;
            i10 = i9;
            i13 = i14;
        }
        fhVar.ag = i12 >> 2;
        fhVar.af = i13 << 8;
        return i10;
    }

    static int fc(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, fh fhVar) {
        int i8;
        int i9 = i >> 8;
        int i10 = i3 << 2;
        int i11 = i4 << 2;
        int i12 = (i2 + i9) - ((i7 >> 8) - 1);
        if (i12 <= i6) {
            i6 = i12;
        }
        fhVar.ay += fhVar.ab * (i6 - i2);
        fhVar.as += fhVar.aw * (i6 - i2);
        int i13 = i6 - 3;
        i12 = i10;
        i10 = i2;
        while (i10 < i13) {
            int i14 = i10 + 1;
            int i15 = i9 - 1;
            iArr[i10] = (bArr[i9] * i12) + iArr[i10];
            i12 += i11;
            i10 = i14 + 1;
            i8 = i15 - 1;
            iArr[i14] = iArr[i14] + (bArr[i15] * i12);
            i12 += i11;
            i14 = i10 + 1;
            i15 = i8 - 1;
            iArr[i10] = iArr[i10] + (bArr[i8] * i12);
            i12 += i11;
            i10 = i14 + 1;
            i9 = i15 - 1;
            iArr[i14] = iArr[i14] + (bArr[i15] * i12);
            i12 += i11;
        }
        i8 = i13 + 3;
        i13 = i9;
        while (i10 < i8) {
            i9 = i10 + 1;
            i14 = i13 - 1;
            iArr[i10] = (bArr[i13] * i12) + iArr[i10];
            i12 += i11;
            i10 = i9;
            i13 = i14;
        }
        fhVar.ag = i12 >> 2;
        fhVar.af = i13 << 8;
        return i10;
    }

    static int ff(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, fh fhVar) {
        int i8;
        int i9 = i >> 8;
        int i10 = i3 << 2;
        int i11 = i4 << 2;
        int i12 = (i2 + i9) - ((i7 >> 8) - 1);
        if (i12 <= i6) {
            i6 = i12;
        }
        fhVar.ay += fhVar.ab * (i6 - i2);
        fhVar.as += fhVar.aw * (i6 - i2);
        int i13 = i6 - 3;
        i12 = i10;
        i10 = i2;
        while (i10 < i13) {
            int i14 = i10 + 1;
            int i15 = i9 - 1;
            iArr[i10] = (bArr[i9] * i12) + iArr[i10];
            i12 += i11;
            i10 = i14 + 1;
            i8 = i15 - 1;
            iArr[i14] = iArr[i14] + (bArr[i15] * i12);
            i12 += i11;
            i14 = i10 + 1;
            i15 = i8 - 1;
            iArr[i10] = iArr[i10] + (bArr[i8] * i12);
            i12 += i11;
            i10 = i14 + 1;
            i9 = i15 - 1;
            iArr[i14] = iArr[i14] + (bArr[i15] * i12);
            i12 += i11;
        }
        i8 = i13 + 3;
        i13 = i9;
        while (i10 < i8) {
            i9 = i10 + 1;
            i14 = i13 - 1;
            iArr[i10] = (bArr[i13] * i12) + iArr[i10];
            i12 += i11;
            i10 = i9;
            i13 = i14;
        }
        fhVar.ag = i12 >> 2;
        fhVar.af = i13 << 8;
        return i10;
    }

    static int fo(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, fh fhVar) {
        int i8;
        int i9 = i >> 8;
        int i10 = i3 << 2;
        int i11 = i4 << 2;
        int i12 = (i2 + i9) - ((i7 >> 8) - 1);
        if (i12 <= i6) {
            i6 = i12;
        }
        fhVar.ay += fhVar.ab * (i6 - i2);
        fhVar.as += fhVar.aw * (i6 - i2);
        int i13 = i6 - 3;
        i12 = i10;
        i10 = i2;
        while (i10 < i13) {
            int i14 = i10 + 1;
            int i15 = i9 - 1;
            iArr[i10] = (bArr[i9] * i12) + iArr[i10];
            i12 += i11;
            i10 = i14 + 1;
            i8 = i15 - 1;
            iArr[i14] = iArr[i14] + (bArr[i15] * i12);
            i12 += i11;
            i14 = i10 + 1;
            i15 = i8 - 1;
            iArr[i10] = iArr[i10] + (bArr[i8] * i12);
            i12 += i11;
            i10 = i14 + 1;
            i9 = i15 - 1;
            iArr[i14] = iArr[i14] + (bArr[i15] * i12);
            i12 += i11;
        }
        i8 = i13 + 3;
        i13 = i9;
        while (i10 < i8) {
            i9 = i10 + 1;
            i14 = i13 - 1;
            iArr[i10] = (bArr[i13] * i12) + iArr[i10];
            i12 += i11;
            i10 = i9;
            i13 = i14;
        }
        fhVar.ag = i12 >> 2;
        fhVar.af = i13 << 8;
        return i10;
    }

    static int fu(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, fh fhVar) {
        int i8;
        int i9 = i >> 8;
        int i10 = i3 << 2;
        int i11 = i4 << 2;
        int i12 = (i2 + i9) - ((i7 >> 8) - 1);
        if (i12 <= i6) {
            i6 = i12;
        }
        fhVar.ay += fhVar.ab * (i6 - i2);
        fhVar.as += fhVar.aw * (i6 - i2);
        int i13 = i6 - 3;
        i12 = i10;
        i10 = i2;
        while (i10 < i13) {
            int i14 = i10 + 1;
            int i15 = i9 - 1;
            iArr[i10] = (bArr[i9] * i12) + iArr[i10];
            i12 += i11;
            i10 = i14 + 1;
            i8 = i15 - 1;
            iArr[i14] = iArr[i14] + (bArr[i15] * i12);
            i12 += i11;
            i14 = i10 + 1;
            i15 = i8 - 1;
            iArr[i10] = iArr[i10] + (bArr[i8] * i12);
            i12 += i11;
            i10 = i14 + 1;
            i9 = i15 - 1;
            iArr[i14] = iArr[i14] + (bArr[i15] * i12);
            i12 += i11;
        }
        i8 = i13 + 3;
        i13 = i9;
        while (i10 < i8) {
            i9 = i10 + 1;
            i14 = i13 - 1;
            iArr[i10] = (bArr[i13] * i12) + iArr[i10];
            i12 += i11;
            i10 = i9;
            i13 = i14;
        }
        fhVar.ag = i12 >> 2;
        fhVar.af = i13 << 8;
        return i10;
    }

    static int co(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, fh fhVar) {
        int i11;
        int i12 = i2 >> 8;
        int i13 = i4 << 2;
        int i14 = i5 << 2;
        int i15 = i6 << 2;
        int i16 = i7 << 2;
        int i17 = (i3 + i12) - ((i10 >> 8) - 1);
        if (i17 <= i9) {
            i9 = i17;
        }
        fhVar.ag += fhVar.at * (i9 - i3);
        int i18 = (i9 << 1) - 6;
        int i19 = i14;
        i14 = i13;
        i13 = i3 << 1;
        i17 = i19;
        while (i13 < i18) {
            i11 = i12 - 1;
            byte b = bArr[i12];
            int i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b * i17) + iArr[i20];
            i17 += i16;
            i12 = i11 - 1;
            byte b2 = bArr[i11];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b2 * i17) + iArr[i20];
            i17 += i16;
            i11 = i12 - 1;
            b = bArr[i12];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b * i17) + iArr[i20];
            i17 += i16;
            i12 = i11 - 1;
            b2 = bArr[i11];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b2 * i17) + iArr[i20];
            i17 += i16;
        }
        i11 = i18 + 6;
        while (i13 < i11) {
            i18 = i12 - 1;
            b = bArr[i12];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b * i17) + iArr[i20];
            i17 += i16;
            i12 = i18;
        }
        fhVar.ay = i14 >> 2;
        fhVar.as = i17 >> 2;
        fhVar.af = i12 << 8;
        return i13 >> 1;
    }

    static int fn(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, fh fhVar) {
        int i11;
        int i12 = i2 >> 8;
        int i13 = i4 << 2;
        int i14 = i5 << 2;
        int i15 = i6 << 2;
        int i16 = i7 << 2;
        int i17 = (i3 + i12) - ((i10 >> 8) - 1);
        if (i17 <= i9) {
            i9 = i17;
        }
        fhVar.ag += fhVar.at * (i9 - i3);
        int i18 = (i9 << 1) - 6;
        int i19 = i14;
        i14 = i13;
        i13 = i3 << 1;
        i17 = i19;
        while (i13 < i18) {
            i11 = i12 - 1;
            byte b = bArr[i12];
            int i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b * i17) + iArr[i20];
            i17 += i16;
            i12 = i11 - 1;
            byte b2 = bArr[i11];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b2 * i17) + iArr[i20];
            i17 += i16;
            i11 = i12 - 1;
            b = bArr[i12];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b * i17) + iArr[i20];
            i17 += i16;
            i12 = i11 - 1;
            b2 = bArr[i11];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b2 * i17) + iArr[i20];
            i17 += i16;
        }
        i11 = i18 + 6;
        while (i13 < i11) {
            i18 = i12 - 1;
            b = bArr[i12];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b * i17) + iArr[i20];
            i17 += i16;
            i12 = i18;
        }
        fhVar.ay = i14 >> 2;
        fhVar.as = i17 >> 2;
        fhVar.af = i12 << 8;
        return i13 >> 1;
    }

    static int fz(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, fh fhVar) {
        int i11;
        int i12 = i2 >> 8;
        int i13 = i4 << 2;
        int i14 = i5 << 2;
        int i15 = i6 << 2;
        int i16 = i7 << 2;
        int i17 = (i3 + i12) - ((i10 >> 8) - 1);
        if (i17 <= i9) {
            i9 = i17;
        }
        fhVar.ag += fhVar.at * (i9 - i3);
        int i18 = (i9 << 1) - 6;
        int i19 = i14;
        i14 = i13;
        i13 = i3 << 1;
        i17 = i19;
        while (i13 < i18) {
            i11 = i12 - 1;
            byte b = bArr[i12];
            int i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b * i17) + iArr[i20];
            i17 += i16;
            i12 = i11 - 1;
            byte b2 = bArr[i11];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b2 * i17) + iArr[i20];
            i17 += i16;
            i11 = i12 - 1;
            b = bArr[i12];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b * i17) + iArr[i20];
            i17 += i16;
            i12 = i11 - 1;
            b2 = bArr[i11];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b2 * i17) + iArr[i20];
            i17 += i16;
        }
        i11 = i18 + 6;
        while (i13 < i11) {
            i18 = i12 - 1;
            b = bArr[i12];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b * i17) + iArr[i20];
            i17 += i16;
            i12 = i18;
        }
        fhVar.ay = i14 >> 2;
        fhVar.as = i17 >> 2;
        fhVar.af = i12 << 8;
        return i13 >> 1;
    }

    static int cy(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, int i9, fh fhVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        fhVar.ay -= fhVar.ab * i4;
        fhVar.as -= fhVar.aw * i4;
        if (i10 != 0) {
            i12 = ((((i9 - i3) + i10) - 257) / i10) + i4;
            if (i12 <= i8) {
                i13 = i5;
                i14 = i4;
                i15 = i3;
                while (i14 < i12) {
                    int i16 = i15 >> 8;
                    byte b = bArr[i16];
                    i4 = i14 + 1;
                    iArr[i14] = (((((bArr[i16 + 1] - b) * (i15 & 255)) + (b << 8)) * i13) >> 6) + iArr[i14];
                    i13 += i6;
                    i14 = i4;
                    i15 += i10;
                }
                if (i10 != 0) {
                    i12 = ((((i9 - i15) + i10) - 1) / i10) + i14;
                    if (i12 <= i8) {
                        i8 = i12;
                    }
                }
                i12 = i13;
                i13 = i14;
                while (i13 < i8) {
                    byte b2 = bArr[i15 >> 8];
                    i14 = i13 + 1;
                    iArr[i13] = (((((i11 - b2) * (i15 & 255)) + (b2 << 8)) * i12) >> 6) + iArr[i13];
                    i12 += i6;
                    i15 += i10;
                    i13 = i14;
                }
                fhVar.ay += fhVar.ab * i13;
                fhVar.as += fhVar.aw * i13;
                fhVar.ag = i12;
                fhVar.af = i15;
                return i13;
            }
        }
        i12 = i8;
        i13 = i5;
        i14 = i4;
        i15 = i3;
        while (i14 < i12) {
            int i162 = i15 >> 8;
            byte b3 = bArr[i162];
            i4 = i14 + 1;
            iArr[i14] = (((((bArr[i162 + 1] - b3) * (i15 & 255)) + (b3 << 8)) * i13) >> 6) + iArr[i14];
            i13 += i6;
            i14 = i4;
            i15 += i10;
        }
        if (i10 != 0) {
            i12 = ((((i9 - i15) + i10) - 1) / i10) + i14;
            if (i12 <= i8) {
                i8 = i12;
            }
        }
        i12 = i13;
        i13 = i14;
        while (i13 < i8) {
            byte b22 = bArr[i15 >> 8];
            i14 = i13 + 1;
            iArr[i13] = (((((i11 - b22) * (i15 & 255)) + (b22 << 8)) * i12) >> 6) + iArr[i13];
            i12 += i6;
            i15 += i10;
            i13 = i14;
        }
        fhVar.ay += fhVar.ab * i13;
        fhVar.as += fhVar.aw * i13;
        fhVar.ag = i12;
        fhVar.af = i15;
        return i13;
    }

    static int fe(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, int i9, fh fhVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        fhVar.ay -= fhVar.ab * i4;
        fhVar.as -= fhVar.aw * i4;
        if (i10 != 0) {
            i12 = ((((i9 - i3) + i10) - 257) / i10) + i4;
            if (i12 <= i8) {
                i13 = i5;
                i14 = i4;
                i15 = i3;
                while (i14 < i12) {
                    int i16 = i15 >> 8;
                    byte b = bArr[i16];
                    i4 = i14 + 1;
                    iArr[i14] = (((((bArr[i16 + 1] - b) * (i15 & 255)) + (b << 8)) * i13) >> 6) + iArr[i14];
                    i13 += i6;
                    i14 = i4;
                    i15 += i10;
                }
                if (i10 != 0) {
                    i12 = ((((i9 - i15) + i10) - 1) / i10) + i14;
                    if (i12 <= i8) {
                        i8 = i12;
                    }
                }
                i12 = i13;
                i13 = i14;
                while (i13 < i8) {
                    byte b2 = bArr[i15 >> 8];
                    i14 = i13 + 1;
                    iArr[i13] = (((((i11 - b2) * (i15 & 255)) + (b2 << 8)) * i12) >> 6) + iArr[i13];
                    i12 += i6;
                    i15 += i10;
                    i13 = i14;
                }
                fhVar.ay += fhVar.ab * i13;
                fhVar.as += fhVar.aw * i13;
                fhVar.ag = i12;
                fhVar.af = i15;
                return i13;
            }
        }
        i12 = i8;
        i13 = i5;
        i14 = i4;
        i15 = i3;
        while (i14 < i12) {
            int i162 = i15 >> 8;
            byte b3 = bArr[i162];
            i4 = i14 + 1;
            iArr[i14] = (((((bArr[i162 + 1] - b3) * (i15 & 255)) + (b3 << 8)) * i13) >> 6) + iArr[i14];
            i13 += i6;
            i14 = i4;
            i15 += i10;
        }
        if (i10 != 0) {
            i12 = ((((i9 - i15) + i10) - 1) / i10) + i14;
            if (i12 <= i8) {
                i8 = i12;
            }
        }
        i12 = i13;
        i13 = i14;
        while (i13 < i8) {
            byte b22 = bArr[i15 >> 8];
            i14 = i13 + 1;
            iArr[i13] = (((((i11 - b22) * (i15 & 255)) + (b22 << 8)) * i12) >> 6) + iArr[i13];
            i12 += i6;
            i15 += i10;
            i13 = i14;
        }
        fhVar.ay += fhVar.ab * i13;
        fhVar.as += fhVar.aw * i13;
        fhVar.ag = i12;
        fhVar.af = i15;
        return i13;
    }

    static int fs(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, int i9, fh fhVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        fhVar.ay -= fhVar.ab * i4;
        fhVar.as -= fhVar.aw * i4;
        if (i10 != 0) {
            i12 = ((((i9 - i3) + i10) - 257) / i10) + i4;
            if (i12 <= i8) {
                i13 = i5;
                i14 = i4;
                i15 = i3;
                while (i14 < i12) {
                    int i16 = i15 >> 8;
                    byte b = bArr[i16];
                    i4 = i14 + 1;
                    iArr[i14] = (((((bArr[i16 + 1] - b) * (i15 & 255)) + (b << 8)) * i13) >> 6) + iArr[i14];
                    i13 += i6;
                    i14 = i4;
                    i15 += i10;
                }
                if (i10 != 0) {
                    i12 = ((((i9 - i15) + i10) - 1) / i10) + i14;
                    if (i12 <= i8) {
                        i8 = i12;
                    }
                }
                i12 = i13;
                i13 = i14;
                while (i13 < i8) {
                    byte b2 = bArr[i15 >> 8];
                    i14 = i13 + 1;
                    iArr[i13] = (((((i11 - b2) * (i15 & 255)) + (b2 << 8)) * i12) >> 6) + iArr[i13];
                    i12 += i6;
                    i15 += i10;
                    i13 = i14;
                }
                fhVar.ay += fhVar.ab * i13;
                fhVar.as += fhVar.aw * i13;
                fhVar.ag = i12;
                fhVar.af = i15;
                return i13;
            }
        }
        i12 = i8;
        i13 = i5;
        i14 = i4;
        i15 = i3;
        while (i14 < i12) {
            int i162 = i15 >> 8;
            byte b3 = bArr[i162];
            i4 = i14 + 1;
            iArr[i14] = (((((bArr[i162 + 1] - b3) * (i15 & 255)) + (b3 << 8)) * i13) >> 6) + iArr[i14];
            i13 += i6;
            i14 = i4;
            i15 += i10;
        }
        if (i10 != 0) {
            i12 = ((((i9 - i15) + i10) - 1) / i10) + i14;
            if (i12 <= i8) {
                i8 = i12;
            }
        }
        i12 = i13;
        i13 = i14;
        while (i13 < i8) {
            byte b22 = bArr[i15 >> 8];
            i14 = i13 + 1;
            iArr[i13] = (((((i11 - b22) * (i15 & 255)) + (b22 << 8)) * i12) >> 6) + iArr[i13];
            i12 += i6;
            i15 += i10;
            i13 = i14;
        }
        fhVar.ay += fhVar.ab * i13;
        fhVar.as += fhVar.aw * i13;
        fhVar.ag = i12;
        fhVar.af = i15;
        return i13;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int cn(int r10, int r11, byte[] r12, int[] r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, p000.fh r23, int r24, int r25) {
        /*
        r0 = r23;
        r1 = r0.ag;
        r0 = r23;
        r2 = r0.at;
        r2 = r2 * r15;
        r1 = r1 - r2;
        r0 = r23;
        r0.ag = r1;
        if (r24 == 0) goto L_0x001d;
    L_0x0010:
        r1 = r22 - r14;
        r1 = r1 + r24;
        r1 = r1 + -257;
        r1 = r1 / r24;
        r1 = r1 + r15;
        r0 = r21;
        if (r1 <= r0) goto L_0x001f;
    L_0x001d:
        r1 = r21;
    L_0x001f:
        r4 = r15 << 1;
        r1 = r1 << 1;
        r2 = r17;
        r3 = r16;
        r5 = r14;
    L_0x0028:
        if (r4 >= r1) goto L_0x0072;
    L_0x002a:
        r6 = r5 >> 8;
        r7 = r12[r6];
        r8 = r7 << 8;
        r6 = r6 + 1;
        r6 = r12[r6];
        r6 = r6 - r7;
        r7 = r5 & 255;
        r6 = r6 * r7;
        r6 = r6 + r8;
        r7 = r4 + 1;
        r8 = r13[r4];
        r9 = r6 * r3;
        r9 = r9 >> 6;
        r8 = r8 + r9;
        r13[r4] = r8;
        r3 = r3 + r18;
        r4 = r7 + 1;
        r8 = r13[r7];
        r6 = r6 * r2;
        r6 = r6 >> 6;
        r6 = r6 + r8;
        r13[r7] = r6;
        r2 = r2 + r19;
        r5 = r5 + r24;
        goto L_0x0028;
    L_0x0055:
        r3 = r3 >> 1;
        r0 = r23;
        r5 = r0.ag;
        r0 = r23;
        r6 = r0.at;
        r6 = r6 * r3;
        r5 = r5 + r6;
        r0 = r23;
        r0.ag = r5;
        r0 = r23;
        r0.ay = r2;
        r0 = r23;
        r0.as = r1;
        r0 = r23;
        r0.af = r4;
        return r3;
    L_0x0072:
        if (r24 == 0) goto L_0x0083;
    L_0x0074:
        r1 = r4 >> 1;
        r6 = r22 - r5;
        r6 = r6 + r24;
        r6 = r6 + -1;
        r6 = r6 / r24;
        r1 = r1 + r6;
        r0 = r21;
        if (r1 <= r0) goto L_0x00b3;
    L_0x0083:
        r6 = r21 << 1;
        r1 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r5;
    L_0x0089:
        if (r3 >= r6) goto L_0x0055;
    L_0x008b:
        r5 = r4 >> 8;
        r5 = r12[r5];
        r7 = r5 << 8;
        r5 = r25 - r5;
        r8 = r4 & 255;
        r5 = r5 * r8;
        r5 = r5 + r7;
        r7 = r3 + 1;
        r8 = r13[r3];
        r9 = r5 * r2;
        r9 = r9 >> 6;
        r8 = r8 + r9;
        r13[r3] = r8;
        r2 = r2 + r18;
        r3 = r7 + 1;
        r8 = r13[r7];
        r5 = r5 * r1;
        r5 = r5 >> 6;
        r5 = r5 + r8;
        r13[r7] = r5;
        r1 = r1 + r19;
        r4 = r4 + r24;
        goto L_0x0089;
    L_0x00b3:
        r21 = r1;
        goto L_0x0083;
        */
        throw new UnsupportedOperationException("Method not decompiled: fh.cn(int, int, byte[], int[], int, int, int, int, int, int, int, int, int, fh, int, int):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int fj(int r10, int r11, byte[] r12, int[] r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, p000.fh r23, int r24, int r25) {
        /*
        r0 = r23;
        r1 = r0.ag;
        r0 = r23;
        r2 = r0.at;
        r2 = r2 * r15;
        r1 = r1 - r2;
        r0 = r23;
        r0.ag = r1;
        if (r24 == 0) goto L_0x001d;
    L_0x0010:
        r1 = r22 - r14;
        r1 = r1 + r24;
        r1 = r1 + -257;
        r1 = r1 / r24;
        r1 = r1 + r15;
        r0 = r21;
        if (r1 <= r0) goto L_0x001f;
    L_0x001d:
        r1 = r21;
    L_0x001f:
        r4 = r15 << 1;
        r1 = r1 << 1;
        r2 = r17;
        r3 = r16;
        r5 = r14;
    L_0x0028:
        if (r4 >= r1) goto L_0x0072;
    L_0x002a:
        r6 = r5 >> 8;
        r7 = r12[r6];
        r8 = r7 << 8;
        r6 = r6 + 1;
        r6 = r12[r6];
        r6 = r6 - r7;
        r7 = r5 & 255;
        r6 = r6 * r7;
        r6 = r6 + r8;
        r7 = r4 + 1;
        r8 = r13[r4];
        r9 = r6 * r3;
        r9 = r9 >> 6;
        r8 = r8 + r9;
        r13[r4] = r8;
        r3 = r3 + r18;
        r4 = r7 + 1;
        r8 = r13[r7];
        r6 = r6 * r2;
        r6 = r6 >> 6;
        r6 = r6 + r8;
        r13[r7] = r6;
        r2 = r2 + r19;
        r5 = r5 + r24;
        goto L_0x0028;
    L_0x0055:
        r3 = r3 >> 1;
        r0 = r23;
        r5 = r0.ag;
        r0 = r23;
        r6 = r0.at;
        r6 = r6 * r3;
        r5 = r5 + r6;
        r0 = r23;
        r0.ag = r5;
        r0 = r23;
        r0.ay = r2;
        r0 = r23;
        r0.as = r1;
        r0 = r23;
        r0.af = r4;
        return r3;
    L_0x0072:
        if (r24 == 0) goto L_0x0083;
    L_0x0074:
        r1 = r4 >> 1;
        r6 = r22 - r5;
        r6 = r6 + r24;
        r6 = r6 + -1;
        r6 = r6 / r24;
        r1 = r1 + r6;
        r0 = r21;
        if (r1 <= r0) goto L_0x00b3;
    L_0x0083:
        r6 = r21 << 1;
        r1 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r5;
    L_0x0089:
        if (r3 >= r6) goto L_0x0055;
    L_0x008b:
        r5 = r4 >> 8;
        r5 = r12[r5];
        r7 = r5 << 8;
        r5 = r25 - r5;
        r8 = r4 & 255;
        r5 = r5 * r8;
        r5 = r5 + r7;
        r7 = r3 + 1;
        r8 = r13[r3];
        r9 = r5 * r2;
        r9 = r9 >> 6;
        r8 = r8 + r9;
        r13[r3] = r8;
        r2 = r2 + r18;
        r3 = r7 + 1;
        r8 = r13[r7];
        r5 = r5 * r1;
        r5 = r5 >> 6;
        r5 = r5 + r8;
        r13[r7] = r5;
        r1 = r1 + r19;
        r4 = r4 + r24;
        goto L_0x0089;
    L_0x00b3:
        r21 = r1;
        goto L_0x0083;
        */
        throw new UnsupportedOperationException("Method not decompiled: fh.fj(int, int, byte[], int[], int, int, int, int, int, int, int, int, int, fh, int, int):int");
    }

    static int ck(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, int i9, fh fhVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        fhVar.ay -= fhVar.ab * i4;
        fhVar.as -= fhVar.aw * i4;
        if (i10 != 0) {
            i12 = ((((i9 + 256) - i3) + i10) / i10) + i4;
            if (i12 <= i8) {
                i13 = i5;
                i14 = i4;
                i15 = i3;
                while (i14 < i12) {
                    int i16 = i15 >> 8;
                    byte b = bArr[i16 - 1];
                    i4 = i14 + 1;
                    iArr[i14] = (((((bArr[i16] - b) * (i15 & 255)) + (b << 8)) * i13) >> 6) + iArr[i14];
                    i13 += i6;
                    i14 = i4;
                    i15 += i10;
                }
                if (i10 != 0) {
                    i12 = (((i9 - i15) + i10) / i10) + i14;
                    if (i12 <= i8) {
                        i8 = i12;
                    }
                }
                i12 = i13;
                i13 = i14;
                while (i13 < i8) {
                    i14 = i13 + 1;
                    iArr[i13] = iArr[i13] + ((((i11 << 8) + ((bArr[i15 >> 8] - i11) * (i15 & 255))) * i12) >> 6);
                    i12 += i6;
                    i15 += i10;
                    i13 = i14;
                }
                fhVar.ay += fhVar.ab * i13;
                fhVar.as += fhVar.aw * i13;
                fhVar.ag = i12;
                fhVar.af = i15;
                return i13;
            }
        }
        i12 = i8;
        i13 = i5;
        i14 = i4;
        i15 = i3;
        while (i14 < i12) {
            int i162 = i15 >> 8;
            byte b2 = bArr[i162 - 1];
            i4 = i14 + 1;
            iArr[i14] = (((((bArr[i162] - b2) * (i15 & 255)) + (b2 << 8)) * i13) >> 6) + iArr[i14];
            i13 += i6;
            i14 = i4;
            i15 += i10;
        }
        if (i10 != 0) {
            i12 = (((i9 - i15) + i10) / i10) + i14;
            if (i12 <= i8) {
                i8 = i12;
            }
        }
        i12 = i13;
        i13 = i14;
        while (i13 < i8) {
            i14 = i13 + 1;
            iArr[i13] = iArr[i13] + ((((i11 << 8) + ((bArr[i15 >> 8] - i11) * (i15 & 255))) * i12) >> 6);
            i12 += i6;
            i15 += i10;
            i13 = i14;
        }
        fhVar.ay += fhVar.ab * i13;
        fhVar.as += fhVar.aw * i13;
        fhVar.ag = i12;
        fhVar.af = i15;
        return i13;
    }

    static int fx(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, int i9, fh fhVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        fhVar.ay -= fhVar.ab * i4;
        fhVar.as -= fhVar.aw * i4;
        if (i10 != 0) {
            i12 = ((((1014396844 + i9) - i3) + i10) / i10) + i4;
            if (i12 <= i8) {
                i13 = i5;
                i14 = i4;
                i15 = i3;
                while (i14 < i12) {
                    int i16 = i15 >> 8;
                    byte b = bArr[i16 - 1];
                    i4 = i14 + 1;
                    iArr[i14] = (((((bArr[i16] - b) * (i15 & 255)) + (b << 8)) * i13) >> 6) + iArr[i14];
                    i13 += i6;
                    i14 = i4;
                    i15 += i10;
                }
                if (i10 != 0) {
                    i12 = (((i9 - i15) + i10) / i10) + i14;
                    if (i12 <= i8) {
                        i8 = i12;
                    }
                }
                i12 = i13;
                i13 = i14;
                while (i13 < i8) {
                    i14 = i13 + 1;
                    iArr[i13] = iArr[i13] + ((((i11 << 8) + ((bArr[i15 >> 8] - i11) * (i15 & 255))) * i12) >> 6);
                    i12 += i6;
                    i15 += i10;
                    i13 = i14;
                }
                fhVar.ay += fhVar.ab * i13;
                fhVar.as += fhVar.aw * i13;
                fhVar.ag = i12;
                fhVar.af = i15;
                return i13;
            }
        }
        i12 = i8;
        i13 = i5;
        i14 = i4;
        i15 = i3;
        while (i14 < i12) {
            int i162 = i15 >> 8;
            byte b2 = bArr[i162 - 1];
            i4 = i14 + 1;
            iArr[i14] = (((((bArr[i162] - b2) * (i15 & 255)) + (b2 << 8)) * i13) >> 6) + iArr[i14];
            i13 += i6;
            i14 = i4;
            i15 += i10;
        }
        if (i10 != 0) {
            i12 = (((i9 - i15) + i10) / i10) + i14;
            if (i12 <= i8) {
                i8 = i12;
            }
        }
        i12 = i13;
        i13 = i14;
        while (i13 < i8) {
            i14 = i13 + 1;
            iArr[i13] = iArr[i13] + ((((i11 << 8) + ((bArr[i15 >> 8] - i11) * (i15 & 255))) * i12) >> 6);
            i12 += i6;
            i15 += i10;
            i13 = i14;
        }
        fhVar.ay += fhVar.ab * i13;
        fhVar.as += fhVar.aw * i13;
        fhVar.ag = i12;
        fhVar.af = i15;
        return i13;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int cl(int r10, int r11, byte[] r12, int[] r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, p000.fh r23, int r24, int r25) {
        /*
        r0 = r23;
        r1 = r0.ag;
        r0 = r23;
        r2 = r0.at;
        r2 = r2 * r15;
        r1 = r1 - r2;
        r0 = r23;
        r0.ag = r1;
        if (r24 == 0) goto L_0x001e;
    L_0x0010:
        r0 = r22;
        r1 = r0 + 256;
        r1 = r1 - r14;
        r1 = r1 + r24;
        r1 = r1 / r24;
        r1 = r1 + r15;
        r0 = r21;
        if (r1 <= r0) goto L_0x0020;
    L_0x001e:
        r1 = r21;
    L_0x0020:
        r4 = r15 << 1;
        r1 = r1 << 1;
        r2 = r17;
        r3 = r16;
        r5 = r14;
    L_0x0029:
        if (r4 >= r1) goto L_0x009d;
    L_0x002b:
        r6 = r5 >> 8;
        r7 = r6 + -1;
        r7 = r12[r7];
        r8 = r7 << 8;
        r6 = r12[r6];
        r6 = r6 - r7;
        r7 = r5 & 255;
        r6 = r6 * r7;
        r6 = r6 + r8;
        r7 = r4 + 1;
        r8 = r13[r4];
        r9 = r6 * r3;
        r9 = r9 >> 6;
        r8 = r8 + r9;
        r13[r4] = r8;
        r3 = r3 + r18;
        r4 = r7 + 1;
        r8 = r13[r7];
        r6 = r6 * r2;
        r6 = r6 >> 6;
        r6 = r6 + r8;
        r13[r7] = r6;
        r2 = r2 + r19;
        r5 = r5 + r24;
        goto L_0x0029;
    L_0x0056:
        r3 = r3 >> 1;
        r0 = r23;
        r5 = r0.ag;
        r0 = r23;
        r6 = r0.at;
        r6 = r6 * r3;
        r5 = r5 + r6;
        r0 = r23;
        r0.ag = r5;
        r0 = r23;
        r0.ay = r2;
        r0 = r23;
        r0.as = r1;
        r0 = r23;
        r0.af = r4;
        return r3;
    L_0x0073:
        r4 = r4 + r24;
    L_0x0075:
        if (r3 >= r6) goto L_0x0056;
    L_0x0077:
        r5 = r25 << 8;
        r7 = r4 >> 8;
        r7 = r12[r7];
        r7 = r7 - r25;
        r8 = r4 & 255;
        r7 = r7 * r8;
        r5 = r5 + r7;
        r7 = r3 + 1;
        r8 = r13[r3];
        r9 = r5 * r2;
        r9 = r9 >> 6;
        r8 = r8 + r9;
        r13[r3] = r8;
        r2 = r2 + r18;
        r3 = r7 + 1;
        r8 = r13[r7];
        r5 = r5 * r1;
        r5 = r5 >> 6;
        r5 = r5 + r8;
        r13[r7] = r5;
        r1 = r1 + r19;
        goto L_0x0073;
    L_0x009d:
        if (r24 == 0) goto L_0x00ac;
    L_0x009f:
        r1 = r4 >> 1;
        r6 = r22 - r5;
        r6 = r6 + r24;
        r6 = r6 / r24;
        r1 = r1 + r6;
        r0 = r21;
        if (r1 <= r0) goto L_0x00b3;
    L_0x00ac:
        r6 = r21 << 1;
        r1 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r5;
        goto L_0x0075;
    L_0x00b3:
        r21 = r1;
        goto L_0x00ac;
        */
        throw new UnsupportedOperationException("Method not decompiled: fh.cl(int, int, byte[], int[], int, int, int, int, int, int, int, int, int, fh, int, int):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int fi(int r10, int r11, byte[] r12, int[] r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, p000.fh r23, int r24, int r25) {
        /*
        r0 = r23;
        r1 = r0.ag;
        r0 = r23;
        r2 = r0.at;
        r2 = r2 * r15;
        r1 = r1 - r2;
        r0 = r23;
        r0.ag = r1;
        if (r24 == 0) goto L_0x001f;
    L_0x0010:
        r1 = 1595263274; // 0x5f15c92a float:1.0793204E19 double:7.8816478E-315;
        r1 = r1 + r22;
        r1 = r1 - r14;
        r1 = r1 + r24;
        r1 = r1 / r24;
        r1 = r1 + r15;
        r0 = r21;
        if (r1 <= r0) goto L_0x0021;
    L_0x001f:
        r1 = r21;
    L_0x0021:
        r4 = r15 << 1;
        r1 = r1 << 1;
        r2 = r17;
        r3 = r16;
        r5 = r14;
    L_0x002a:
        if (r4 >= r1) goto L_0x0057;
    L_0x002c:
        r6 = r5 >> 8;
        r7 = r6 + -1;
        r7 = r12[r7];
        r8 = r7 << 8;
        r6 = r12[r6];
        r6 = r6 - r7;
        r7 = r5 & 255;
        r6 = r6 * r7;
        r6 = r6 + r8;
        r7 = r4 + 1;
        r8 = r13[r4];
        r9 = r6 * r3;
        r9 = r9 >> 6;
        r8 = r8 + r9;
        r13[r4] = r8;
        r3 = r3 + r18;
        r4 = r7 + 1;
        r8 = r13[r7];
        r6 = r6 * r2;
        r6 = r6 >> 6;
        r6 = r6 + r8;
        r13[r7] = r6;
        r2 = r2 + r19;
        r5 = r5 + r24;
        goto L_0x002a;
    L_0x0057:
        if (r24 == 0) goto L_0x0066;
    L_0x0059:
        r1 = r4 >> 1;
        r6 = r22 - r5;
        r6 = r6 + r24;
        r6 = r6 / r24;
        r1 = r1 + r6;
        r0 = r21;
        if (r1 <= r0) goto L_0x00b5;
    L_0x0066:
        r6 = r21 << 1;
        r1 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r5;
    L_0x006c:
        if (r3 >= r6) goto L_0x0098;
    L_0x006e:
        r5 = r25 << 8;
        r7 = r4 >> 8;
        r7 = r12[r7];
        r7 = r7 - r25;
        r8 = -376438212; // 0xffffffffe990023c float:-2.1761984E25 double:NaN;
        r8 = r8 & r4;
        r7 = r7 * r8;
        r5 = r5 + r7;
        r7 = r3 + 1;
        r8 = r13[r3];
        r9 = r5 * r2;
        r9 = r9 >> 6;
        r8 = r8 + r9;
        r13[r3] = r8;
        r2 = r2 + r18;
        r3 = r7 + 1;
        r8 = r13[r7];
        r5 = r5 * r1;
        r5 = r5 >> 6;
        r5 = r5 + r8;
        r13[r7] = r5;
        r1 = r1 + r19;
        r4 = r4 + r24;
        goto L_0x006c;
    L_0x0098:
        r3 = r3 >> 1;
        r0 = r23;
        r5 = r0.ag;
        r0 = r23;
        r6 = r0.at;
        r6 = r6 * r3;
        r5 = r5 + r6;
        r0 = r23;
        r0.ag = r5;
        r0 = r23;
        r0.ay = r2;
        r0 = r23;
        r0.as = r1;
        r0 = r23;
        r0.af = r4;
        return r3;
    L_0x00b5:
        r21 = r1;
        goto L_0x0066;
        */
        throw new UnsupportedOperationException("Method not decompiled: fh.fi(int, int, byte[], int[], int, int, int, int, int, int, int, int, int, fh, int, int):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int ft(int r10, int r11, byte[] r12, int[] r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, p000.fh r23, int r24, int r25) {
        /*
        r0 = r23;
        r1 = r0.ag;
        r0 = r23;
        r2 = r0.at;
        r2 = r2 * r15;
        r1 = r1 - r2;
        r0 = r23;
        r0.ag = r1;
        if (r24 == 0) goto L_0x001e;
    L_0x0010:
        r0 = r22;
        r1 = r0 + 256;
        r1 = r1 - r14;
        r1 = r1 + r24;
        r1 = r1 / r24;
        r1 = r1 + r15;
        r0 = r21;
        if (r1 <= r0) goto L_0x0020;
    L_0x001e:
        r1 = r21;
    L_0x0020:
        r4 = r15 << 1;
        r1 = r1 << 1;
        r2 = r17;
        r3 = r16;
        r5 = r14;
    L_0x0029:
        if (r4 >= r1) goto L_0x0056;
    L_0x002b:
        r6 = r5 >> 8;
        r7 = r6 + -1;
        r7 = r12[r7];
        r8 = r7 << 8;
        r6 = r12[r6];
        r6 = r6 - r7;
        r7 = r5 & 255;
        r6 = r6 * r7;
        r6 = r6 + r8;
        r7 = r4 + 1;
        r8 = r13[r4];
        r9 = r6 * r3;
        r9 = r9 >> 6;
        r8 = r8 + r9;
        r13[r4] = r8;
        r3 = r3 + r18;
        r4 = r7 + 1;
        r8 = r13[r7];
        r6 = r6 * r2;
        r6 = r6 >> 6;
        r6 = r6 + r8;
        r13[r7] = r6;
        r2 = r2 + r19;
        r5 = r5 + r24;
        goto L_0x0029;
    L_0x0056:
        if (r24 == 0) goto L_0x0065;
    L_0x0058:
        r1 = r4 >> 1;
        r6 = r22 - r5;
        r6 = r6 + r24;
        r6 = r6 / r24;
        r1 = r1 + r6;
        r0 = r21;
        if (r1 <= r0) goto L_0x00b2;
    L_0x0065:
        r6 = r21 << 1;
        r1 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r5;
    L_0x006b:
        if (r3 >= r6) goto L_0x0095;
    L_0x006d:
        r5 = r25 << 8;
        r7 = r4 >> 8;
        r7 = r12[r7];
        r7 = r7 - r25;
        r8 = r4 & 255;
        r7 = r7 * r8;
        r5 = r5 + r7;
        r7 = r3 + 1;
        r8 = r13[r3];
        r9 = r5 * r2;
        r9 = r9 >> 6;
        r8 = r8 + r9;
        r13[r3] = r8;
        r2 = r2 + r18;
        r3 = r7 + 1;
        r8 = r13[r7];
        r5 = r5 * r1;
        r5 = r5 >> 6;
        r5 = r5 + r8;
        r13[r7] = r5;
        r1 = r1 + r19;
        r4 = r4 + r24;
        goto L_0x006b;
    L_0x0095:
        r3 = r3 >> 1;
        r0 = r23;
        r5 = r0.ag;
        r0 = r23;
        r6 = r0.at;
        r6 = r6 * r3;
        r5 = r5 + r6;
        r0 = r23;
        r0.ag = r5;
        r0 = r23;
        r0.ay = r2;
        r0 = r23;
        r0.as = r1;
        r0 = r23;
        r0.af = r4;
        return r3;
    L_0x00b2:
        r21 = r1;
        goto L_0x0065;
        */
        throw new UnsupportedOperationException("Method not decompiled: fh.ft(int, int, byte[], int[], int, int, int, int, int, int, int, int, int, fh, int, int):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int fy(int r10, int r11, byte[] r12, int[] r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, p000.fh r23, int r24, int r25) {
        /*
        r0 = r23;
        r1 = r0.ag;
        r0 = r23;
        r2 = r0.at;
        r2 = r2 * r15;
        r1 = r1 - r2;
        r0 = r23;
        r0.ag = r1;
        if (r24 == 0) goto L_0x001e;
    L_0x0010:
        r0 = r22;
        r1 = r0 + 256;
        r1 = r1 - r14;
        r1 = r1 + r24;
        r1 = r1 / r24;
        r1 = r1 + r15;
        r0 = r21;
        if (r1 <= r0) goto L_0x0020;
    L_0x001e:
        r1 = r21;
    L_0x0020:
        r4 = r15 << 1;
        r1 = r1 << 1;
        r2 = r17;
        r3 = r16;
        r5 = r14;
    L_0x0029:
        if (r4 >= r1) goto L_0x0058;
    L_0x002b:
        r6 = r5 >> 8;
        r7 = r6 + -1;
        r7 = r12[r7];
        r8 = r7 << 8;
        r6 = r12[r6];
        r6 = r6 - r7;
        r7 = -723436621; // 0xffffffffd4e13bb3 float:-7.7389538E12 double:NaN;
        r7 = r7 & r5;
        r6 = r6 * r7;
        r6 = r6 + r8;
        r7 = r4 + 1;
        r8 = r13[r4];
        r9 = r6 * r3;
        r9 = r9 >> 6;
        r8 = r8 + r9;
        r13[r4] = r8;
        r3 = r3 + r18;
        r4 = r7 + 1;
        r8 = r13[r7];
        r6 = r6 * r2;
        r6 = r6 >> 6;
        r6 = r6 + r8;
        r13[r7] = r6;
        r2 = r2 + r19;
        r5 = r5 + r24;
        goto L_0x0029;
    L_0x0058:
        if (r24 == 0) goto L_0x0067;
    L_0x005a:
        r1 = r4 >> 1;
        r6 = r22 - r5;
        r6 = r6 + r24;
        r6 = r6 / r24;
        r1 = r1 + r6;
        r0 = r21;
        if (r1 <= r0) goto L_0x00b4;
    L_0x0067:
        r6 = r21 << 1;
        r1 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r5;
    L_0x006d:
        if (r3 >= r6) goto L_0x0097;
    L_0x006f:
        r5 = r25 << 8;
        r7 = r4 >> 8;
        r7 = r12[r7];
        r7 = r7 - r25;
        r8 = r4 & 255;
        r7 = r7 * r8;
        r5 = r5 + r7;
        r7 = r3 + 1;
        r8 = r13[r3];
        r9 = r5 * r2;
        r9 = r9 >> 6;
        r8 = r8 + r9;
        r13[r3] = r8;
        r2 = r2 + r18;
        r3 = r7 + 1;
        r8 = r13[r7];
        r5 = r5 * r1;
        r5 = r5 >> 6;
        r5 = r5 + r8;
        r13[r7] = r5;
        r1 = r1 + r19;
        r4 = r4 + r24;
        goto L_0x006d;
    L_0x0097:
        r3 = r3 >> 1;
        r0 = r23;
        r5 = r0.ag;
        r0 = r23;
        r6 = r0.at;
        r6 = r6 * r3;
        r5 = r5 + r6;
        r0 = r23;
        r0.ag = r5;
        r0 = r23;
        r0.ay = r2;
        r0 = r23;
        r0.as = r1;
        r0 = r23;
        r0.af = r4;
        return r3;
    L_0x00b4:
        r21 = r1;
        goto L_0x0067;
        */
        throw new UnsupportedOperationException("Method not decompiled: fh.fy(int, int, byte[], int[], int, int, int, int, int, int, int, int, int, fh, int, int):int");
    }
}
