package p000;

public class cl extends cq {
    static byte[] aa = new byte[1];
    static byte[] ad = new byte[1];
    static cl af = new cl();
    static cl an = new cl();
    static int bi;
    static int bj;
    static final int[] bm = bi.az;
    static int bq;
    static final int[] br = bi.ah;
    public static boolean bs = true;
    static int bz = 0;
    int[] ab;
    int[] ac;
    int[] ae;
    int ag = 0;
    byte[] ah;
    byte[] ai;
    int aj = 0;
    short[] ak;
    int[][] al;
    int[] am;
    byte ao = (byte) 0;
    int[][] ap;
    int[] aq;
    int[] ar;
    int[] as;
    int[] at;
    int[] au;
    int[] av;
    int[] aw;
    int ax = 0;
    int[] ay;
    byte[] az;
    int ba;
    int[] bb;
    public boolean bc = false;
    int bd;
    int be;
    int bf;
    int bg;
    boolean bh;
    int bk;
    int bl;
    int bn;
    int bp;
    int bt;
    int bu;
    boolean bv;
    int[] bw;
    int bx;
    int by;

    cl() {
        int i = bz;
        bz = i + 1;
        this.bg = i;
        this.bh = true;
        this.bf = -1;
        this.bv = false;
        this.ba = -1;
        this.bl = -1;
        this.bd = -1;
    }

    public cl(cl[] clVarArr, int i) {
        int i2 = bz;
        bz = i2 + 1;
        this.bg = i2;
        this.bh = true;
        this.bf = -1;
        this.bv = false;
        this.ba = -1;
        this.bl = -1;
        this.bd = -1;
        this.ag = 0;
        this.aj = 0;
        this.ax = 0;
        this.ao = (byte) -1;
        i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        for (int i5 = 0; i5 < i; i5++) {
            int i6;
            cl clVar = clVarArr[i5];
            if (clVar != null) {
                this.ag += clVar.ag;
                this.aj += clVar.aj;
                this.ax += clVar.ax;
                if (clVar.ai != null) {
                    z = true;
                } else {
                    if (this.ao == (byte) -1) {
                        this.ao = clVar.ao;
                    }
                    if (this.ao != clVar.ao) {
                        z = true;
                    }
                }
                if (clVar.az != null) {
                    i6 = 1;
                } else {
                    i6 = 0;
                }
                i4 |= i6;
                i3 |= clVar.ak != null ? 1 : 0;
                if (clVar.ah != null) {
                    i6 = 1;
                } else {
                    i6 = 0;
                }
                i2 |= i6;
            }
        }
        this.ay = new int[this.ag];
        this.as = new int[this.ag];
        this.ar = new int[this.ag];
        this.ae = new int[this.aj];
        this.aq = new int[this.aj];
        this.am = new int[this.aj];
        this.at = new int[this.aj];
        this.ab = new int[this.aj];
        this.aw = new int[this.aj];
        if (z) {
            this.ai = new byte[this.aj];
        }
        if (i4 != 0) {
            this.az = new byte[this.aj];
        }
        if (i3 != 0) {
            this.ak = new short[this.aj];
        }
        if (i2 != 0) {
            this.ah = new byte[this.aj];
        }
        if (this.ax > 0) {
            this.au = new int[this.ax];
            this.av = new int[this.ax];
            this.ac = new int[this.ax];
        }
        this.ag = 0;
        this.aj = 0;
        this.ax = 0;
        for (i6 = 0; i6 < i; i6++) {
            cl clVar2 = clVarArr[i6];
            if (clVar2 != null) {
                int i7 = 0;
                while (i7 < clVar2.aj) {
                    this.ae[this.aj] = clVar2.ae[i7] + this.ag;
                    this.aq[this.aj] = clVar2.aq[i7] + this.ag;
                    this.am[this.aj] = clVar2.am[i7] + this.ag;
                    this.at[this.aj] = clVar2.at[i7];
                    this.ab[this.aj] = clVar2.ab[i7];
                    this.aw[this.aj] = clVar2.aw[i7];
                    if (z) {
                        if (clVar2.ai != null) {
                            this.ai[this.aj] = clVar2.ai[i7];
                        } else {
                            this.ai[this.aj] = clVar2.ao;
                        }
                    }
                    if (!(i4 == 0 || clVar2.az == null)) {
                        this.az[this.aj] = clVar2.az[i7];
                    }
                    if (i3 != 0) {
                        if (clVar2.ak != null) {
                            this.ak[this.aj] = clVar2.ak[i7];
                        } else {
                            this.ak[this.aj] = (short) -1;
                        }
                    }
                    if (i2 != 0) {
                        if (clVar2.ah == null || clVar2.ah[i7] == (byte) -1) {
                            this.ah[this.aj] = (byte) -1;
                        } else {
                            this.ah[this.aj] = (byte) (clVar2.ah[i7] + this.ax);
                        }
                    }
                    this.aj++;
                    i7++;
                }
                for (i7 = 0; i7 < clVar2.ax; i7++) {
                    this.au[this.ax] = clVar2.au[i7] + this.ag;
                    this.av[this.ax] = clVar2.av[i7] + this.ag;
                    this.ac[this.ax] = clVar2.ac[i7] + this.ag;
                    this.ax++;
                }
                for (i7 = 0; i7 < clVar2.ag; i7++) {
                    this.ay[this.ag] = clVar2.ay[i7];
                    this.as[this.ag] = clVar2.as[i7];
                    this.ar[this.ag] = clVar2.ar[i7];
                    this.ag++;
                }
            }
        }
    }

    public cl af(int[][] iArr, int i, int i2, int i3, boolean z, int i4) {
        ay();
        int i5 = i - this.bt;
        int i6 = this.bt + i;
        int i7 = i3 - this.bt;
        int i8 = this.bt + i3;
        if (i5 < 0 || ((i6 + mn.an) >> 7) >= iArr.length || i7 < 0 || ((i8 + mn.an) >> 7) >= iArr[0].length) {
            return this;
        }
        i5 >>= 7;
        i6 = (i6 + 127) >> 7;
        i7 >>= 7;
        i8 = (i8 + 127) >> 7;
        if (iArr[i5][i7] == i2 && iArr[i6][i7] == i2 && iArr[i5][i8] == i2 && iArr[i6][i8] == i2) {
            return this;
        }
        cl clVar;
        if (z) {
            clVar = new cl();
            clVar.ag = this.ag;
            clVar.aj = this.aj;
            clVar.ax = this.ax;
            clVar.ay = this.ay;
            clVar.ar = this.ar;
            clVar.ae = this.ae;
            clVar.aq = this.aq;
            clVar.am = this.am;
            clVar.at = this.at;
            clVar.ab = this.ab;
            clVar.aw = this.aw;
            clVar.ai = this.ai;
            clVar.az = this.az;
            clVar.ah = this.ah;
            clVar.ak = this.ak;
            clVar.ao = this.ao;
            clVar.au = this.au;
            clVar.av = this.av;
            clVar.ac = this.ac;
            clVar.al = this.al;
            clVar.ap = this.ap;
            clVar.bw = this.bw;
            clVar.bb = this.bb;
            clVar.bc = this.bc;
            clVar.as = new int[clVar.ag];
        } else {
            clVar = this;
        }
        int i9;
        int i10;
        int i11;
        if (i4 == 0) {
            for (i5 = 0; i5 < clVar.ag; i5++) {
                i7 = this.ay[i5] + i;
                i8 = this.ar[i5] + i3;
                i9 = i7 & 127;
                i10 = i8 & 127;
                i7 >>= 7;
                i8 >>= 7;
                i11 = ((iArr[i7][i8] * (128 - i9)) + (iArr[i7 + 1][i8] * i9)) >> 7;
                clVar.as[i5] = (((((((iArr[i7 + 1][i8 + 1] * i9) + (iArr[i7][i8 + 1] * (128 - i9))) >> 7) * i10) + ((128 - i10) * i11)) >> 7) + this.as[i5]) - i2;
            }
        } else {
            for (i5 = 0; i5 < clVar.ag; i5++) {
                i7 = ((-this.as[i5]) << 16) / (this.bo * 1500767459);
                if (i7 < i4) {
                    i8 = this.ay[i5] + i;
                    i9 = this.ar[i5] + i3;
                    i10 = i8 & 127;
                    i11 = i9 & 127;
                    i8 >>= 7;
                    i9 >>= 7;
                    int i12 = ((iArr[i8][i9] * (128 - i10)) + (iArr[i8 + 1][i9] * i10)) >> 7;
                    i7 = i4 - i7;
                    clVar.as[i5] = ((i7 * (((((((iArr[i8 + 1][i9 + 1] * i10) + (iArr[i8][i9 + 1] * (128 - i10))) >> 7) * i11) + ((128 - i11) * i12)) >> 7) - i2)) / i4) + this.as[i5];
                }
            }
        }
        clVar.aj();
        return clVar;
    }

    public cl ak(int[][] iArr, int i, int i2, int i3, boolean z, int i4) {
        ay();
        int i5 = i - this.bt;
        int i6 = this.bt + i;
        int i7 = i3 - this.bt;
        int i8 = this.bt + i3;
        if (i5 < 0 || ((-1063183558 + i6) >> 7) >= iArr.length || i7 < 0 || ((i8 + mn.an) >> 7) >= iArr[0].length) {
            return this;
        }
        i5 >>= 7;
        i6 = (i6 + 1527801611) >> 7;
        i7 >>= 7;
        i8 = (i8 + 127) >> 7;
        if (iArr[i5][i7] == i2 && iArr[i6][i7] == i2 && iArr[i5][i8] == i2 && iArr[i6][i8] == i2) {
            return this;
        }
        cl clVar;
        if (z) {
            clVar = new cl();
            clVar.ag = this.ag;
            clVar.aj = this.aj;
            clVar.ax = this.ax;
            clVar.ay = this.ay;
            clVar.ar = this.ar;
            clVar.ae = this.ae;
            clVar.aq = this.aq;
            clVar.am = this.am;
            clVar.at = this.at;
            clVar.ab = this.ab;
            clVar.aw = this.aw;
            clVar.ai = this.ai;
            clVar.az = this.az;
            clVar.ah = this.ah;
            clVar.ak = this.ak;
            clVar.ao = this.ao;
            clVar.au = this.au;
            clVar.av = this.av;
            clVar.ac = this.ac;
            clVar.al = this.al;
            clVar.ap = this.ap;
            clVar.bw = this.bw;
            clVar.bb = this.bb;
            clVar.bc = this.bc;
            clVar.as = new int[clVar.ag];
        } else {
            clVar = this;
        }
        int i9;
        int i10;
        int i11;
        if (i4 == 0) {
            for (i5 = 0; i5 < clVar.ag; i5++) {
                i7 = this.ay[i5] + i;
                i8 = this.ar[i5] + i3;
                i9 = 265924348 & i7;
                i10 = 1896127185 & i8;
                i7 >>= 7;
                i8 >>= 7;
                i11 = ((iArr[i7][i8] * (128 - i9)) + (iArr[i7 + 1][i8] * i9)) >> 7;
                clVar.as[i5] = (((((((iArr[i7 + 1][i8 + 1] * i9) + (iArr[i7][i8 + 1] * (128 - i9))) >> 7) * i10) + ((128 - i10) * i11)) >> 7) + this.as[i5]) - i2;
            }
        } else {
            for (i5 = 0; i5 < clVar.ag; i5++) {
                i7 = ((-this.as[i5]) << 16) / (this.bo * 1500767459);
                if (i7 < i4) {
                    i8 = this.ay[i5] + i;
                    i9 = this.ar[i5] + i3;
                    i10 = i8 & 127;
                    i11 = -1039009315 & i9;
                    i8 >>= 7;
                    i9 >>= 7;
                    int i12 = ((iArr[i8][i9] * (310093757 - i10)) + (iArr[i8 + 1][i9] * i10)) >> 7;
                    i7 = i4 - i7;
                    clVar.as[i5] = ((i7 * (((((((iArr[i8 + 1][i9 + 1] * i10) + (iArr[i8][i9 + 1] * (128 - i10))) >> 7) * i11) + ((-553198686 - i11) * i12)) >> 7) - i2)) / i4) + this.as[i5];
                }
            }
        }
        clVar.aj();
        return clVar;
    }

    public cl ad(boolean z) {
        if (!z && ad.length < this.aj) {
            ad = new byte[(this.aj + 100)];
        }
        return aa(z, af, ad);
    }

    public cl ao(boolean z) {
        if (!z && ad.length < this.aj) {
            ad = new byte[(this.aj + 100)];
        }
        return aa(z, af, ad);
    }

    public cl ax(boolean z) {
        if (!z && ad.length < this.aj) {
            ad = new byte[(this.aj - 1689673449)];
        }
        return aa(z, af, ad);
    }

    public cl an(boolean z) {
        if (!z && aa.length < this.aj) {
            aa = new byte[(this.aj + 100)];
        }
        return aa(z, an, aa);
    }

    public cl au(boolean z) {
        if (!z && aa.length < this.aj) {
            aa = new byte[(this.aj + 100)];
        }
        return aa(z, an, aa);
    }

    public cl av(boolean z) {
        if (!z && aa.length < this.aj) {
            aa = new byte[(this.aj + 100)];
        }
        return aa(z, an, aa);
    }

    cl aa(boolean z, cl clVar, byte[] bArr) {
        int i;
        int i2 = 0;
        clVar.ag = this.ag;
        clVar.aj = this.aj;
        clVar.ax = this.ax;
        if (clVar.ay == null || clVar.ay.length < this.ag) {
            clVar.ay = new int[(this.ag + 100)];
            clVar.as = new int[(this.ag + 100)];
            clVar.ar = new int[(this.ag + 100)];
        }
        for (i = 0; i < this.ag; i++) {
            clVar.ay[i] = this.ay[i];
            clVar.as[i] = this.as[i];
            clVar.ar[i] = this.ar[i];
        }
        if (z) {
            clVar.az = this.az;
        } else {
            clVar.az = bArr;
            if (this.az == null) {
                for (i = 0; i < this.aj; i++) {
                    clVar.az[i] = (byte) 0;
                }
            } else {
                while (i2 < this.aj) {
                    clVar.az[i2] = this.az[i2];
                    i2++;
                }
            }
        }
        clVar.ae = this.ae;
        clVar.aq = this.aq;
        clVar.am = this.am;
        clVar.at = this.at;
        clVar.ab = this.ab;
        clVar.aw = this.aw;
        clVar.ai = this.ai;
        clVar.ah = this.ah;
        clVar.ak = this.ak;
        clVar.ao = this.ao;
        clVar.au = this.au;
        clVar.av = this.av;
        clVar.ac = this.ac;
        clVar.al = this.al;
        clVar.ap = this.ap;
        clVar.bw = this.bw;
        clVar.bb = this.bb;
        clVar.bc = this.bc;
        i = bz;
        bz = i + 1;
        clVar.bg = i;
        clVar.bv = true;
        clVar.aj();
        return clVar;
    }

    void ag(int i) {
        int i2 = 0;
        if (this.ba == -1) {
            int i3 = br[i];
            int i4 = bm[i];
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i2 < this.ag) {
                int be = bp.be(this.ay[i2], this.ar[i2], i3, i4, -1666565096);
                int i11 = this.as[i2];
                int i12 = ((this.ar[i2] * i3) - (this.ay[i2] * i4)) >> 16;
                if (be < i10) {
                    i10 = be;
                }
                if (be > i7) {
                    i7 = be;
                }
                if (i11 < i9) {
                    i9 = i11;
                }
                if (i11 > i6) {
                    i6 = i11;
                }
                if (i12 < i8) {
                    i8 = i12;
                }
                if (i12 > i5) {
                    i5 = i12;
                }
                i2++;
            }
            this.bk = (i7 + i10) / 2;
            this.by = (i6 + i9) / 2;
            this.bn = (i5 + i8) / 2;
            this.ba = ((i7 - i10) + 1) / 2;
            this.bl = ((i6 - i9) + 1) / 2;
            this.bd = ((i5 - i8) + 1) / 2;
            if (this.ba < 32) {
                this.ba = 32;
            }
            if (this.bd < 32) {
                this.bd = 32;
            }
            if (this.bc) {
                this.ba += 8;
                this.bd += 8;
            }
        }
    }

    void al(int i) {
        int i2 = 0;
        if (this.ba == -1) {
            int i3 = br[i];
            int i4 = bm[i];
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i2 < this.ag) {
                int be = bp.be(this.ay[i2], this.ar[i2], i3, i4, -1666565096);
                int i11 = this.as[i2];
                int i12 = ((this.ar[i2] * i3) - (this.ay[i2] * i4)) >> 16;
                if (be < i10) {
                    i10 = be;
                }
                if (be > i7) {
                    i7 = be;
                }
                if (i11 < i9) {
                    i9 = i11;
                }
                if (i11 > i6) {
                    i6 = i11;
                }
                if (i12 < i8) {
                    i8 = i12;
                }
                if (i12 > i5) {
                    i5 = i12;
                }
                i2++;
            }
            this.bk = (i7 + i10) / 2;
            this.by = (i6 + i9) / 2;
            this.bn = (i5 + i8) / 2;
            this.ba = ((i7 - i10) + 1) / 2;
            this.bl = ((i6 - i9) + 1) / 2;
            this.bd = ((i5 - i8) + 1) / 2;
            if (this.ba < 32) {
                this.ba = 32;
            }
            if (this.bd < 32) {
                this.bd = 32;
            }
            if (this.bc) {
                this.ba += 8;
                this.bd += 8;
            }
        }
    }

    void ap(int i) {
        int i2 = 0;
        if (this.ba == -1) {
            int i3 = br[i];
            int i4 = bm[i];
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i2 < this.ag) {
                int be = bp.be(this.ay[i2], this.ar[i2], i3, i4, -1666565096);
                int i11 = this.as[i2];
                int i12 = ((this.ar[i2] * i3) - (this.ay[i2] * i4)) >> 16;
                if (be < i10) {
                    i10 = be;
                }
                if (be > i7) {
                    i7 = be;
                }
                if (i11 < i9) {
                    i9 = i11;
                }
                if (i11 > i6) {
                    i6 = i11;
                }
                if (i12 < i8) {
                    i8 = i12;
                }
                if (i12 > i5) {
                    i5 = i12;
                }
                i2++;
            }
            this.bk = (i7 + i10) / 2;
            this.by = (i6 + i9) / 2;
            this.bn = (i5 + i8) / 2;
            this.ba = ((i7 - i10) + 1) / 2;
            this.bl = ((i6 - i9) + 1) / 2;
            this.bd = ((i5 - i8) + 1) / 2;
            if (this.ba < 1943028235) {
                this.ba = 32;
            }
            if (this.bd < 305063824) {
                this.bd = 32;
            }
            if (this.bc) {
                this.ba += 8;
                this.bd += 8;
            }
        }
    }

    void bw(int i) {
        int i2 = 0;
        if (this.ba == -1) {
            int i3 = br[i];
            int i4 = bm[i];
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i2 < this.ag) {
                int be = bp.be(this.ay[i2], this.ar[i2], i3, i4, -1666565096);
                int i11 = this.as[i2];
                int i12 = ((this.ar[i2] * i3) - (this.ay[i2] * i4)) >> 16;
                if (be < i10) {
                    i10 = be;
                }
                if (be > i7) {
                    i7 = be;
                }
                if (i11 < i9) {
                    i9 = i11;
                }
                if (i11 > i6) {
                    i6 = i11;
                }
                if (i12 < i8) {
                    i8 = i12;
                }
                if (i12 > i5) {
                    i5 = i12;
                }
                i2++;
            }
            this.bk = (i7 + i10) / 2;
            this.by = (i6 + i9) / 2;
            this.bn = (i5 + i8) / 2;
            this.ba = ((i7 - i10) + 1) / 2;
            this.bl = ((i6 - i9) + 1) / 2;
            this.bd = ((i5 - i8) + 1) / 2;
            if (this.ba < 32) {
                this.ba = 32;
            }
            if (this.bd < 32) {
                this.bd = 32;
            }
            if (this.bc) {
                this.ba += 8;
                this.bd += 8;
            }
        }
    }

    public void ay() {
        int i = 0;
        if (this.bp != 1) {
            this.bp = 1;
            this.bo = 0;
            this.bx = 0;
            this.bt = 0;
            while (i < this.ag) {
                int i2 = this.ay[i];
                int i3 = this.as[i];
                int i4 = this.ar[i];
                if ((-i3) > this.bo * 1500767459) {
                    this.bo = (-i3) * 1329103051;
                }
                if (i3 > this.bx) {
                    this.bx = i3;
                }
                i2 = (i2 * i2) + (i4 * i4);
                if (i2 > this.bt) {
                    this.bt = i2;
                }
                i++;
            }
            this.bt = (int) (Math.sqrt((double) this.bt) + 0.99d);
            this.be = (int) (Math.sqrt((double) ((this.bt * this.bt) + ((this.bo * 1500767459) * (this.bo * 1500767459)))) + 0.99d);
            this.bu = this.be + ((int) (Math.sqrt((double) ((this.bt * this.bt) + (this.bx * this.bx))) + 0.99d));
        }
    }

    public void bb() {
        int i = 0;
        if (this.bp != 1) {
            this.bp = 1;
            this.bo = 0;
            this.bx = 0;
            this.bt = 0;
            while (i < this.ag) {
                int i2 = this.ay[i];
                int i3 = this.as[i];
                int i4 = this.ar[i];
                if ((-i3) > this.bo * 1032390726) {
                    this.bo = (-i3) * 1329103051;
                }
                if (i3 > this.bx) {
                    this.bx = i3;
                }
                i2 = (i2 * i2) + (i4 * i4);
                if (i2 > this.bt) {
                    this.bt = i2;
                }
                i++;
            }
            this.bt = (int) (Math.sqrt((double) this.bt) + 0.99d);
            this.be = (int) (Math.sqrt((double) ((this.bt * this.bt) + ((this.bo * -481161561) * (this.bo * -1156894103)))) + 0.99d);
            this.bu = this.be + ((int) (Math.sqrt((double) ((this.bt * this.bt) + (this.bx * this.bx))) + 0.99d));
        }
    }

    public void bc() {
        int i = 0;
        if (this.bp != 1) {
            this.bp = 1;
            this.bo = 0;
            this.bx = 0;
            this.bt = 0;
            while (i < this.ag) {
                int i2 = this.ay[i];
                int i3 = this.as[i];
                int i4 = this.ar[i];
                if ((-i3) > this.bo * 1500767459) {
                    this.bo = (-i3) * 1329103051;
                }
                if (i3 > this.bx) {
                    this.bx = i3;
                }
                i2 = (i2 * i2) + (i4 * i4);
                if (i2 > this.bt) {
                    this.bt = i2;
                }
                i++;
            }
            this.bt = (int) (Math.sqrt((double) this.bt) + 0.99d);
            this.be = (int) (Math.sqrt((double) ((this.bt * this.bt) + ((this.bo * 1500767459) * (this.bo * 1500767459)))) + 0.99d);
            this.bu = this.be + ((int) (Math.sqrt((double) ((this.bt * this.bt) + (this.bx * this.bx))) + 0.99d));
        }
    }

    public void bz() {
        int i = 0;
        if (this.bp != 1) {
            this.bp = 1;
            this.bo = 0;
            this.bx = 0;
            this.bt = 0;
            while (i < this.ag) {
                int i2 = this.ay[i];
                int i3 = this.as[i];
                int i4 = this.ar[i];
                if ((-i3) > this.bo * 1500767459) {
                    this.bo = (-i3) * 1329103051;
                }
                if (i3 > this.bx) {
                    this.bx = i3;
                }
                i2 = (i2 * i2) + (i4 * i4);
                if (i2 > this.bt) {
                    this.bt = i2;
                }
                i++;
            }
            this.bt = (int) (Math.sqrt((double) this.bt) + 0.99d);
            this.be = (int) (Math.sqrt((double) ((this.bt * this.bt) + ((this.bo * 1500767459) * (this.bo * 1500767459)))) + 0.99d);
            this.bu = this.be + ((int) (Math.sqrt((double) ((this.bt * this.bt) + (this.bx * this.bx))) + 0.99d));
        }
    }

    void as() {
        int i = 0;
        if (this.bp != 2) {
            this.bp = 2;
            this.bt = 0;
            while (i < this.ag) {
                int i2 = this.ay[i];
                int i3 = this.as[i];
                int i4 = this.ar[i];
                i2 = ((i2 * i2) + (i4 * i4)) + (i3 * i3);
                if (i2 > this.bt) {
                    this.bt = i2;
                }
                i++;
            }
            this.bt = (int) (Math.sqrt((double) this.bt) + 0.99d);
            this.be = this.bt;
            this.bu = this.bt + this.bt;
        }
    }

    void bg() {
        int i = 0;
        if (this.bp != 2) {
            this.bp = 2;
            this.bt = 0;
            while (i < this.ag) {
                int i2 = this.ay[i];
                int i3 = this.as[i];
                int i4 = this.ar[i];
                i2 = ((i2 * i2) + (i4 * i4)) + (i3 * i3);
                if (i2 > this.bt) {
                    this.bt = i2;
                }
                i++;
            }
            this.bt = (int) (Math.sqrt((double) this.bt) + 0.99d);
            this.be = this.bt;
            this.bu = this.bt + this.bt;
        }
    }

    void bh() {
        int i = 0;
        if (this.bp != 2) {
            this.bp = 2;
            this.bt = 0;
            while (i < this.ag) {
                int i2 = this.ay[i];
                int i3 = this.as[i];
                int i4 = this.ar[i];
                i2 = ((i2 * i2) + (i4 * i4)) + (i3 * i3);
                if (i2 > this.bt) {
                    this.bt = i2;
                }
                i++;
            }
            this.bt = (int) (Math.sqrt((double) this.bt) + 0.99d);
            this.be = this.bt;
            this.bu = this.bt + this.bt;
        }
    }

    public int ar() {
        ay();
        return this.bt;
    }

    public int bf() {
        ay();
        return this.bt;
    }

    public int bp() {
        ay();
        return this.bt;
    }

    public int bv() {
        ay();
        return this.bt;
    }

    public int bx() {
        ay();
        return this.bt;
    }

    void aj() {
        this.bp = 0;
        this.ba = -1;
        this.bh = true;
    }

    void bt() {
        this.bp = 0;
        this.ba = -1;
        this.bh = true;
    }

    void bu() {
        this.bp = 0;
        this.ba = -1;
        this.bh = true;
    }

    public void ae(ba baVar, int i) {
        if (this.al != null) {
            if (i != -1) {
                bn bnVar = baVar.af[i];
                bf bfVar = bnVar.ag;
                bj = 0;
                bi = 0;
                bq = 0;
                int i2 = 0;
                while (i2 < bnVar.ay && bfVar.an[bnVar.as[i2]] != 5) {
                    i2++;
                }
                for (int i3 = 0; i3 < bnVar.ay; i3++) {
                    i2 = bnVar.as[i3];
                    am(bfVar.an[i2], bfVar.aa[i2], bnVar.ar[i3], bnVar.aj[i3], bnVar.ae[i3]);
                }
                aj();
            }
        }
    }

    public void be(ba baVar, int i) {
        if (this.al != null) {
            if (i != -1) {
                bn bnVar = baVar.af[i];
                bf bfVar = bnVar.ag;
                bj = 0;
                bi = 0;
                bq = 0;
                int i2 = 0;
                while (i2 < bnVar.ay && bfVar.an[bnVar.as[i2]] != 5) {
                    i2++;
                }
                for (int i3 = 0; i3 < bnVar.ay; i3++) {
                    i2 = bnVar.as[i3];
                    am(bfVar.an[i2], bfVar.aa[i2], bnVar.ar[i3], bnVar.aj[i3], bnVar.ae[i3]);
                }
                aj();
            }
        }
    }

    public void aq(ba baVar, int i, ba baVar2, int i2, int[] iArr) {
        if (i != -1) {
            if (iArr == null || i2 == -1) {
                ae(baVar, i);
                return;
            }
            int i3;
            int i4;
            int i5;
            bn bnVar = baVar.af[i];
            bn bnVar2 = baVar2.af[i2];
            bf bfVar = bnVar.ag;
            bj = 0;
            bi = 0;
            bq = 0;
            int i6 = 0;
            int i7 = iArr[0];
            int i8 = 1;
            while (i6 < bnVar.ay) {
                i3 = bnVar.as[i6];
                i4 = i7;
                i5 = i8;
                while (i3 > i4) {
                    i8 = i5 + 1;
                    i4 = iArr[i5];
                    i5 = i8;
                }
                if (i3 != i4 || bfVar.an[i3] == 0) {
                    am(bfVar.an[i3], bfVar.aa[i3], bnVar.ar[i6], bnVar.aj[i6], bnVar.ae[i6]);
                }
                i6++;
                i8 = i5;
                i7 = i4;
            }
            bj = 0;
            bi = 0;
            bq = 0;
            i6 = 0;
            i7 = iArr[0];
            i8 = 1;
            while (i6 < bnVar2.ay) {
                i3 = bnVar2.as[i6];
                i4 = i7;
                i5 = i8;
                while (i3 > i4) {
                    i8 = i5 + 1;
                    i4 = iArr[i5];
                    i5 = i8;
                }
                if (i3 == i4 || bfVar.an[i3] == 0) {
                    am(bfVar.an[i3], bfVar.aa[i3], bnVar2.ar[i6], bnVar2.aj[i6], bnVar2.ae[i6]);
                }
                i6++;
                i8 = i5;
                i7 = i4;
            }
            aj();
        }
    }

    void am(int i, int[] iArr, int i2, int i3, int i4) {
        int i5;
        int i6;
        int[] iArr2;
        int i7;
        if (i == 0) {
            bj = 0;
            bi = 0;
            bq = 0;
            i5 = 0;
            for (int i62 : iArr) {
                if (i62 < this.al.length) {
                    iArr2 = this.al[i62];
                    i62 = 0;
                    while (i62 < iArr2.length) {
                        i7 = iArr2[i62];
                        bj += this.ay[i7];
                        bi += this.as[i7];
                        bq = this.ar[i7] + bq;
                        i62++;
                        i5++;
                    }
                }
            }
            if (i5 > 0) {
                bj = (bj / i5) + i2;
                bi = (bi / i5) + i3;
                bq = (bq / i5) + i4;
                return;
            }
            bj = i2;
            bi = i3;
            bq = i4;
        } else if (i == 1) {
            for (int i52 : iArr) {
                if (i52 < this.al.length) {
                    r3 = this.al[i52];
                    for (int i8 : r3) {
                        iArr2 = this.ay;
                        iArr2[i8] = iArr2[i8] + i2;
                        iArr2 = this.as;
                        iArr2[i8] = iArr2[i8] + i3;
                        iArr2 = this.ar;
                        iArr2[i8] = iArr2[i8] + i4;
                    }
                }
            }
        } else if (i == 2) {
            for (int i522 : iArr) {
                if (i522 < this.al.length) {
                    r3 = this.al[i522];
                    for (int i82 : r3) {
                        int i9;
                        iArr2 = this.ay;
                        iArr2[i82] = iArr2[i82] - bj;
                        iArr2 = this.as;
                        iArr2[i82] = iArr2[i82] - bi;
                        iArr2 = this.ar;
                        iArr2[i82] = iArr2[i82] - bq;
                        r6 = (i2 & 255) * 8;
                        int i10 = (i3 & 255) * 8;
                        int i11 = (i4 & 255) * 8;
                        if (i11 != 0) {
                            i9 = bm[i11];
                            i11 = br[i11];
                            int i12 = ((this.as[i82] * i9) + (this.ay[i82] * i11)) >> 16;
                            this.as[i82] = ((i11 * this.as[i82]) - (i9 * this.ay[i82])) >> 16;
                            this.ay[i82] = i12;
                        }
                        if (r6 != 0) {
                            i11 = bm[r6];
                            r6 = br[r6];
                            i9 = ((this.as[i82] * r6) - (this.ar[i82] * i11)) >> 16;
                            this.ar[i82] = ((r6 * this.ar[i82]) + (i11 * this.as[i82])) >> 16;
                            this.as[i82] = i9;
                        }
                        if (i10 != 0) {
                            r6 = bm[i10];
                            i10 = br[i10];
                            i11 = ((this.ar[i82] * r6) + (this.ay[i82] * i10)) >> 16;
                            this.ar[i82] = ((i10 * this.ar[i82]) - (r6 * this.ay[i82])) >> 16;
                            this.ay[i82] = i11;
                        }
                        iArr2 = this.ay;
                        iArr2[i82] = iArr2[i82] + bj;
                        iArr2 = this.as;
                        iArr2[i82] = iArr2[i82] + bi;
                        iArr2 = this.ar;
                        iArr2[i82] = iArr2[i82] + bq;
                    }
                }
            }
        } else if (i == 3) {
            for (int i5222 : iArr) {
                if (i5222 < this.al.length) {
                    r3 = this.al[i5222];
                    for (int i822 : r3) {
                        iArr2 = this.ay;
                        iArr2[i822] = iArr2[i822] - bj;
                        iArr2 = this.as;
                        iArr2[i822] = iArr2[i822] - bi;
                        iArr2 = this.ar;
                        iArr2[i822] = iArr2[i822] - bq;
                        this.ay[i822] = (this.ay[i822] * i2) / mn.an;
                        this.as[i822] = (this.as[i822] * i3) / mn.an;
                        this.ar[i822] = (this.ar[i822] * i4) / mn.an;
                        iArr2 = this.ay;
                        iArr2[i822] = iArr2[i822] + bj;
                        iArr2 = this.as;
                        iArr2[i822] = iArr2[i822] + bi;
                        iArr2 = this.ar;
                        iArr2[i822] = iArr2[i822] + bq;
                    }
                }
            }
        } else if (i == 5 && this.ap != null && this.az != null) {
            for (int i52222 : iArr) {
                if (i52222 < this.ap.length) {
                    int[] iArr3 = this.ap[i52222];
                    for (int i13 : iArr3) {
                        i62 = (this.az[i13] & 255) + (i2 * 8);
                        if (i62 < 0) {
                            i62 = 0;
                        } else if (i62 > 255) {
                            i62 = 255;
                        }
                        this.az[i13] = (byte) i62;
                    }
                }
            }
        }
    }

    void bk(int i, int[] iArr, int i2, int i3, int i4) {
        int i5;
        int[] iArr2;
        int i6;
        if (i == 0) {
            i5 = 0;
            bj = 0;
            bi = 0;
            bq = 0;
            for (int i7 : iArr) {
                if (i7 < this.al.length) {
                    iArr2 = this.al[i7];
                    for (int i62 : iArr2) {
                        bj += this.ay[i62];
                        bi += this.as[i62];
                        bq = this.ar[i62] + bq;
                        i5++;
                    }
                }
            }
            if (i5 > 0) {
                bj = (bj / i5) + i2;
                bi = (bi / i5) + i3;
                bq = (bq / i5) + i4;
                return;
            }
            bj = i2;
            bi = i3;
            bq = i4;
        } else if (i == 1) {
            for (int i72 : iArr) {
                if (i72 < this.al.length) {
                    r3 = this.al[i72];
                    for (int i8 : r3) {
                        r6 = this.ay;
                        r6[i8] = r6[i8] + i2;
                        r6 = this.as;
                        r6[i8] = r6[i8] + i3;
                        r6 = this.ar;
                        r6[i8] = r6[i8] + i4;
                    }
                }
            }
        } else if (i == 2) {
            for (int i722 : iArr) {
                if (i722 < this.al.length) {
                    r3 = this.al[i722];
                    for (int i82 : r3) {
                        int i9;
                        r6 = this.ay;
                        r6[i82] = r6[i82] - bj;
                        r6 = this.as;
                        r6[i82] = r6[i82] - bi;
                        r6 = this.ar;
                        r6[i82] = r6[i82] - bq;
                        i62 = (-1822316498 & i2) * 8;
                        int i10 = (i3 & 255) * 8;
                        int i11 = (75044771 & i4) * 8;
                        if (i11 != 0) {
                            i9 = bm[i11];
                            i11 = br[i11];
                            int i12 = ((this.as[i82] * i9) + (this.ay[i82] * i11)) >> 16;
                            this.as[i82] = ((i11 * this.as[i82]) - (i9 * this.ay[i82])) >> 16;
                            this.ay[i82] = i12;
                        }
                        if (i62 != 0) {
                            i11 = bm[i62];
                            i62 = br[i62];
                            i9 = ((this.as[i82] * i62) - (this.ar[i82] * i11)) >> 16;
                            this.ar[i82] = ((i62 * this.ar[i82]) + (i11 * this.as[i82])) >> 16;
                            this.as[i82] = i9;
                        }
                        if (i10 != 0) {
                            i62 = bm[i10];
                            i10 = br[i10];
                            i11 = ((this.ar[i82] * i62) + (this.ay[i82] * i10)) >> 16;
                            this.ar[i82] = ((i10 * this.ar[i82]) - (i62 * this.ay[i82])) >> 16;
                            this.ay[i82] = i11;
                        }
                        r6 = this.ay;
                        r6[i82] = r6[i82] + bj;
                        r6 = this.as;
                        r6[i82] = r6[i82] + bi;
                        r6 = this.ar;
                        r6[i82] = r6[i82] + bq;
                    }
                }
            }
        } else if (i == 3) {
            for (int i7222 : iArr) {
                if (i7222 < this.al.length) {
                    r3 = this.al[i7222];
                    for (int i822 : r3) {
                        r6 = this.ay;
                        r6[i822] = r6[i822] - bj;
                        r6 = this.as;
                        r6[i822] = r6[i822] - bi;
                        r6 = this.ar;
                        r6[i822] = r6[i822] - bq;
                        this.ay[i822] = (this.ay[i822] * i2) / 161782795;
                        this.as[i822] = (this.as[i822] * i3) / -876709861;
                        this.ar[i822] = (this.ar[i822] * i4) / 602488114;
                        r6 = this.ay;
                        r6[i822] = r6[i822] + bj;
                        r6 = this.as;
                        r6[i822] = r6[i822] + bi;
                        r6 = this.ar;
                        r6[i822] = r6[i822] + bq;
                    }
                }
            }
        } else if (i == 5 && this.ap != null && this.az != null) {
            for (int i72222 : iArr) {
                if (i72222 < this.ap.length) {
                    iArr2 = this.ap[i72222];
                    for (int i622 : iArr2) {
                        i5 = (this.az[i622] & -363624821) + (i2 * 8);
                        if (i5 < 0) {
                            i5 = 0;
                        } else if (i5 > 255) {
                            i5 = 1870607421;
                        }
                        this.az[i622] = (byte) i5;
                    }
                }
            }
        }
    }

    void bn(int i, int[] iArr, int i2, int i3, int i4) {
        int i5;
        int[] iArr2;
        int i6;
        if (i == 0) {
            i5 = 0;
            bj = 0;
            bi = 0;
            bq = 0;
            for (int i7 : iArr) {
                if (i7 < this.al.length) {
                    iArr2 = this.al[i7];
                    for (int i62 : iArr2) {
                        bj += this.ay[i62];
                        bi += this.as[i62];
                        bq = this.ar[i62] + bq;
                        i5++;
                    }
                }
            }
            if (i5 > 0) {
                bj = (bj / i5) + i2;
                bi = (bi / i5) + i3;
                bq = (bq / i5) + i4;
                return;
            }
            bj = i2;
            bi = i3;
            bq = i4;
        } else if (i == 1) {
            for (int i72 : iArr) {
                if (i72 < this.al.length) {
                    r3 = this.al[i72];
                    for (int i8 : r3) {
                        r6 = this.ay;
                        r6[i8] = r6[i8] + i2;
                        r6 = this.as;
                        r6[i8] = r6[i8] + i3;
                        r6 = this.ar;
                        r6[i8] = r6[i8] + i4;
                    }
                }
            }
        } else if (i == 2) {
            for (int i722 : iArr) {
                if (i722 < this.al.length) {
                    r3 = this.al[i722];
                    for (int i82 : r3) {
                        int i9;
                        r6 = this.ay;
                        r6[i82] = r6[i82] - bj;
                        r6 = this.as;
                        r6[i82] = r6[i82] - bi;
                        r6 = this.ar;
                        r6[i82] = r6[i82] - bq;
                        i62 = (i2 & 255) * 8;
                        int i10 = (i3 & 255) * 8;
                        int i11 = (i4 & 255) * 8;
                        if (i11 != 0) {
                            i9 = bm[i11];
                            i11 = br[i11];
                            int i12 = ((this.as[i82] * i9) + (this.ay[i82] * i11)) >> 16;
                            this.as[i82] = ((i11 * this.as[i82]) - (i9 * this.ay[i82])) >> 16;
                            this.ay[i82] = i12;
                        }
                        if (i62 != 0) {
                            i11 = bm[i62];
                            i62 = br[i62];
                            i9 = ((this.as[i82] * i62) - (this.ar[i82] * i11)) >> 16;
                            this.ar[i82] = ((i62 * this.ar[i82]) + (i11 * this.as[i82])) >> 16;
                            this.as[i82] = i9;
                        }
                        if (i10 != 0) {
                            i62 = bm[i10];
                            i10 = br[i10];
                            i11 = ((this.ar[i82] * i62) + (this.ay[i82] * i10)) >> 16;
                            this.ar[i82] = ((i10 * this.ar[i82]) - (i62 * this.ay[i82])) >> 16;
                            this.ay[i82] = i11;
                        }
                        r6 = this.ay;
                        r6[i82] = r6[i82] + bj;
                        r6 = this.as;
                        r6[i82] = r6[i82] + bi;
                        r6 = this.ar;
                        r6[i82] = r6[i82] + bq;
                    }
                }
            }
        } else if (i == 3) {
            for (int i7222 : iArr) {
                if (i7222 < this.al.length) {
                    r3 = this.al[i7222];
                    for (int i822 : r3) {
                        r6 = this.ay;
                        r6[i822] = r6[i822] - bj;
                        r6 = this.as;
                        r6[i822] = r6[i822] - bi;
                        r6 = this.ar;
                        r6[i822] = r6[i822] - bq;
                        this.ay[i822] = (this.ay[i822] * i2) / mn.an;
                        this.as[i822] = (this.as[i822] * i3) / mn.an;
                        this.ar[i822] = (this.ar[i822] * i4) / mn.an;
                        r6 = this.ay;
                        r6[i822] = r6[i822] + bj;
                        r6 = this.as;
                        r6[i822] = r6[i822] + bi;
                        r6 = this.ar;
                        r6[i822] = r6[i822] + bq;
                    }
                }
            }
        } else if (i == 5 && this.ap != null && this.az != null) {
            for (int i72222 : iArr) {
                if (i72222 < this.ap.length) {
                    iArr2 = this.ap[i72222];
                    for (int i622 : iArr2) {
                        i5 = (this.az[i622] & 255) + (i2 * 8);
                        if (i5 < 0) {
                            i5 = 0;
                        } else if (i5 > 255) {
                            i5 = 255;
                        }
                        this.az[i622] = (byte) i5;
                    }
                }
            }
        }
    }

    void by(int i, int[] iArr, int i2, int i3, int i4) {
        int i5;
        int i6;
        int[] iArr2;
        int i7;
        if (i == 0) {
            bj = 0;
            bi = 0;
            bq = 0;
            i5 = 0;
            for (int i62 : iArr) {
                if (i62 < this.al.length) {
                    iArr2 = this.al[i62];
                    i62 = 0;
                    while (i62 < iArr2.length) {
                        i7 = iArr2[i62];
                        bj += this.ay[i7];
                        bi += this.as[i7];
                        bq = this.ar[i7] + bq;
                        i62++;
                        i5++;
                    }
                }
            }
            if (i5 > 0) {
                bj = (bj / i5) + i2;
                bi = (bi / i5) + i3;
                bq = (bq / i5) + i4;
                return;
            }
            bj = i2;
            bi = i3;
            bq = i4;
        } else if (i == 1) {
            for (int i52 : iArr) {
                if (i52 < this.al.length) {
                    r2 = this.al[i52];
                    for (int i8 : r2) {
                        iArr2 = this.ay;
                        iArr2[i8] = iArr2[i8] + i2;
                        iArr2 = this.as;
                        iArr2[i8] = iArr2[i8] + i3;
                        iArr2 = this.ar;
                        iArr2[i8] = iArr2[i8] + i4;
                    }
                }
            }
        } else if (i == 2) {
            for (int i522 : iArr) {
                if (i522 < this.al.length) {
                    r2 = this.al[i522];
                    for (int i82 : r2) {
                        int i9;
                        iArr2 = this.ay;
                        iArr2[i82] = iArr2[i82] - bj;
                        iArr2 = this.as;
                        iArr2[i82] = iArr2[i82] - bi;
                        iArr2 = this.ar;
                        iArr2[i82] = iArr2[i82] - bq;
                        r5 = (-494464423 & i2) * 8;
                        int i10 = (-309472672 & i3) * 8;
                        int i11 = (-269204566 & i4) * 8;
                        if (i11 != 0) {
                            i9 = bm[i11];
                            i11 = br[i11];
                            int i12 = ((this.as[i82] * i9) + (this.ay[i82] * i11)) >> 16;
                            this.as[i82] = ((i11 * this.as[i82]) - (i9 * this.ay[i82])) >> 16;
                            this.ay[i82] = i12;
                        }
                        if (r5 != 0) {
                            i11 = bm[r5];
                            r5 = br[r5];
                            i9 = ((this.as[i82] * r5) - (this.ar[i82] * i11)) >> 16;
                            this.ar[i82] = ((r5 * this.ar[i82]) + (i11 * this.as[i82])) >> 16;
                            this.as[i82] = i9;
                        }
                        if (i10 != 0) {
                            r5 = bm[i10];
                            i10 = br[i10];
                            i11 = ((this.ar[i82] * r5) + (this.ay[i82] * i10)) >> 16;
                            this.ar[i82] = ((i10 * this.ar[i82]) - (r5 * this.ay[i82])) >> 16;
                            this.ay[i82] = i11;
                        }
                        iArr2 = this.ay;
                        iArr2[i82] = iArr2[i82] + bj;
                        iArr2 = this.as;
                        iArr2[i82] = iArr2[i82] + bi;
                        iArr2 = this.ar;
                        iArr2[i82] = iArr2[i82] + bq;
                    }
                }
            }
        } else if (i == 3) {
            for (int i5222 : iArr) {
                if (i5222 < this.al.length) {
                    r2 = this.al[i5222];
                    for (int i822 : r2) {
                        iArr2 = this.ay;
                        iArr2[i822] = iArr2[i822] - bj;
                        iArr2 = this.as;
                        iArr2[i822] = iArr2[i822] - bi;
                        iArr2 = this.ar;
                        iArr2[i822] = iArr2[i822] - bq;
                        this.ay[i822] = (this.ay[i822] * i2) / 119942059;
                        this.as[i822] = (this.as[i822] * i3) / 2103469704;
                        this.ar[i822] = (this.ar[i822] * i4) / mn.an;
                        iArr2 = this.ay;
                        iArr2[i822] = iArr2[i822] + bj;
                        iArr2 = this.as;
                        iArr2[i822] = iArr2[i822] + bi;
                        iArr2 = this.ar;
                        iArr2[i822] = iArr2[i822] + bq;
                    }
                }
            }
        } else if (i == 5 && this.ap != null && this.az != null) {
            for (int i52222 : iArr) {
                if (i52222 < this.ap.length) {
                    int[] iArr3 = this.ap[i52222];
                    for (int i13 : iArr3) {
                        i62 = (this.az[i13] & 255) + (i2 * 8);
                        if (i62 < 0) {
                            i62 = 0;
                        } else if (i62 > -1715461198) {
                            i62 = 2026937111;
                        }
                        this.az[i13] = (byte) i62;
                    }
                }
            }
        }
    }

    public void at() {
        for (int i = 0; i < this.ag; i++) {
            int i2 = this.ay[i];
            this.ay[i] = this.ar[i];
            this.ar[i] = -i2;
        }
        aj();
    }

    public void ba() {
        for (int i = 0; i < this.ag; i++) {
            int i2 = this.ay[i];
            this.ay[i] = this.ar[i];
            this.ar[i] = -i2;
        }
        aj();
    }

    public void bl() {
        for (int i = 0; i < this.ag; i++) {
            int i2 = this.ay[i];
            this.ay[i] = this.ar[i];
            this.ar[i] = -i2;
        }
        aj();
    }

    public void ab() {
        for (int i = 0; i < this.ag; i++) {
            this.ay[i] = -this.ay[i];
            this.ar[i] = -this.ar[i];
        }
        aj();
    }

    public void bd() {
        for (int i = 0; i < this.ag; i++) {
            this.ay[i] = -this.ay[i];
            this.ar[i] = -this.ar[i];
        }
        aj();
    }

    public void bs() {
        for (int i = 0; i < this.ag; i++) {
            this.ay[i] = -this.ay[i];
            this.ar[i] = -this.ar[i];
        }
        aj();
    }

    public void aw() {
        for (int i = 0; i < this.ag; i++) {
            int i2 = this.ar[i];
            this.ar[i] = this.ay[i];
            this.ay[i] = -i2;
        }
        aj();
    }

    public void bi() {
        for (int i = 0; i < this.ag; i++) {
            int i2 = this.ar[i];
            this.ar[i] = this.ay[i];
            this.ay[i] = -i2;
        }
        aj();
    }

    public void bj() {
        for (int i = 0; i < this.ag; i++) {
            int i2 = this.ar[i];
            this.ar[i] = this.ay[i];
            this.ay[i] = -i2;
        }
        aj();
    }

    public void bm() {
        for (int i = 0; i < this.ag; i++) {
            int i2 = this.ar[i];
            this.ar[i] = this.ay[i];
            this.ay[i] = -i2;
        }
        aj();
    }

    public void bq() {
        for (int i = 0; i < this.ag; i++) {
            int i2 = this.ar[i];
            this.ar[i] = this.ay[i];
            this.ay[i] = -i2;
        }
        aj();
    }

    public void br() {
        for (int i = 0; i < this.ag; i++) {
            int i2 = this.ar[i];
            this.ar[i] = this.ay[i];
            this.ay[i] = -i2;
        }
        aj();
    }

    public void ai(int i) {
        int i2 = bm[i];
        int i3 = br[i];
        for (int i4 = 0; i4 < this.ag; i4++) {
            int i5 = ((this.as[i4] * i3) - (this.ar[i4] * i2)) >> 16;
            this.ar[i4] = ((this.as[i4] * i2) + (this.ar[i4] * i3)) >> 16;
            this.as[i4] = i5;
        }
        aj();
    }

    public void bo(int i) {
        int i2 = bm[i];
        int i3 = br[i];
        for (int i4 = 0; i4 < this.ag; i4++) {
            int i5 = ((this.as[i4] * i3) - (this.ar[i4] * i2)) >> 16;
            this.ar[i4] = ((this.as[i4] * i2) + (this.ar[i4] * i3)) >> 16;
            this.as[i4] = i5;
        }
        aj();
    }

    public void cv(int i) {
        int i2 = bm[i];
        int i3 = br[i];
        for (int i4 = 0; i4 < this.ag; i4++) {
            int i5 = ((this.as[i4] * i3) - (this.ar[i4] * i2)) >> 16;
            this.ar[i4] = ((this.as[i4] * i2) + (this.ar[i4] * i3)) >> 16;
            this.as[i4] = i5;
        }
        aj();
    }

    public void az(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.ag; i4++) {
            int[] iArr = this.ay;
            iArr[i4] = iArr[i4] + i;
            iArr = this.as;
            iArr[i4] = iArr[i4] + i2;
            iArr = this.ar;
            iArr[i4] = iArr[i4] + i3;
        }
        aj();
    }

    public void cc(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.ag; i4++) {
            int[] iArr = this.ay;
            iArr[i4] = iArr[i4] + i;
            iArr = this.as;
            iArr[i4] = iArr[i4] + i2;
            iArr = this.ar;
            iArr[i4] = iArr[i4] + i3;
        }
        aj();
    }

    public void ci(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.ag; i4++) {
            int[] iArr = this.ay;
            iArr[i4] = iArr[i4] + i;
            iArr = this.as;
            iArr[i4] = iArr[i4] + i2;
            iArr = this.ar;
            iArr[i4] = iArr[i4] + i3;
        }
        aj();
    }

    public void cn(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.ag; i4++) {
            int[] iArr = this.ay;
            iArr[i4] = iArr[i4] + i;
            iArr = this.as;
            iArr[i4] = iArr[i4] + i2;
            iArr = this.ar;
            iArr[i4] = iArr[i4] + i3;
        }
        aj();
    }

    public void co(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.ag; i4++) {
            int[] iArr = this.ay;
            iArr[i4] = iArr[i4] + i;
            iArr = this.as;
            iArr[i4] = iArr[i4] + i2;
            iArr = this.ar;
            iArr[i4] = iArr[i4] + i3;
        }
        aj();
    }

    public void cy(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.ag; i4++) {
            int[] iArr = this.ay;
            iArr[i4] = iArr[i4] + i;
            iArr = this.as;
            iArr[i4] = iArr[i4] + i2;
            iArr = this.ar;
            iArr[i4] = iArr[i4] + i3;
        }
        aj();
    }

    public void ah(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.ag; i4++) {
            this.ay[i4] = (this.ay[i4] * i) / mn.an;
            this.as[i4] = (this.as[i4] * i2) / mn.an;
            this.ar[i4] = (this.ar[i4] * i3) / mn.an;
        }
        aj();
    }

    protected final cl ac() {
        return this;
    }

    protected final cl dh() {
        return this;
    }

    protected final cl dn() {
        return this;
    }

    protected final cl dx() {
        return this;
    }

    protected final cl dy() {
        return this;
    }
}
