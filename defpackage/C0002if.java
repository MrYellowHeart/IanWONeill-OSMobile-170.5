package p000;

public final class C0002if {
    static final int ad = 256;
    static final int af = 8;
    static final int an = 1;
    static final int dm = 104;
    int aa;
    int[] ag;
    int aj;
    int ar;
    int as;
    int[] ay;

    public static int af(int i, int i2, int i3) {
        return (i << 8) + i2;
    }

    public C0002if(int[] iArr) {
        try {
            this.ay = new int[256];
            this.ag = new int[256];
            for (int i = 0; i < iArr.length; i++) {
                this.ag[i] = iArr[i];
            }
            aa((byte) -85);
        } catch (Throwable e) {
            throw ba.ad(e, "if.<init>(" + ')');
        }
    }

    final int af(int i) {
        try {
            int i2 = this.aa - 1817417607;
            this.aa = i2;
            if ((i2 * 811236919) + 1 == 0) {
                an((byte) 22);
                this.aa = -414978183;
            }
            return this.ag[this.aa * 811236919];
        } catch (Throwable e) {
            throw ba.ad(e, "if.af(" + ')');
        }
    }

    final int ag() {
        int i = this.aa - -1088175565;
        this.aa = i;
        if ((i * -2133457882) + 1 == 0) {
            an((byte) 86);
            this.aa = -414978183;
        }
        return this.ag[811236919 * this.aa];
    }

    final int aj() {
        int i = this.aa - 1817417607;
        this.aa = i;
        if ((i * 811236919) + 1 == 0) {
            an((byte) -20);
            this.aa = -414978183;
        }
        return this.ag[this.aa * 811236919];
    }

    final int ar() {
        int i = this.aa - -1496562348;
        this.aa = i;
        if ((i * -922956318) + 1 == 0) {
            an((byte) -25);
            this.aa = -414978183;
        }
        return this.ag[811236919 * this.aa];
    }

    final int as() {
        int i = this.aa - 1817417607;
        this.aa = i;
        if ((i * 811236919) + 1 == 0) {
            an((byte) 43);
            this.aa = -414978183;
        }
        return this.ag[this.aa * 811236919];
    }

    final int ay() {
        int i = this.aa - 1817417607;
        this.aa = i;
        if ((i * 811236919) + 1 == 0) {
            an((byte) -77);
            this.aa = -414978183;
        }
        return this.ag[this.aa * 811236919];
    }

    final int ad(byte b) {
        try {
            if (this.aa * 811236919 == 0) {
                an((byte) -94);
                this.aa = 1402439424;
            }
            return this.ag[(this.aa * 811236919) - 1];
        } catch (Throwable e) {
            throw ba.ad(e, "if.ad(" + ')');
        }
    }

    final int ae() {
        if (this.aa * 811236919 == 0) {
            an((byte) 17);
            this.aa = -1830239311;
        }
        return this.ag[(this.aa * 811236919) - 1];
    }

    final int aq() {
        if (811236919 * this.aa == 0) {
            an((byte) 44);
            this.aa = 299622413;
        }
        return this.ag[(this.aa * 863538167) - 1];
    }

    final void am() {
        int i = this.ar;
        int i2 = this.aj - 2136757977;
        this.aj = i2;
        this.ar = i + (i2 * 397091059);
        for (i = 0; i < 256; i++) {
            i2 = this.ay[i];
            if ((i & 2) == 0) {
                if ((i & 1) == 0) {
                    this.as = 733957943 * ((this.as * 723997705) ^ ((this.as * -102381039) << 13));
                } else {
                    this.as = ((this.as * -102381039) ^ ((this.as * -102381039) >>> 6)) * 327837425;
                }
            } else if ((i & 1) == 0) {
                this.as = ((-1198285296 * this.as) ^ ((this.as * -102381039) << 2)) * 327837425;
            } else {
                this.as = ((-330368301 * this.as) ^ ((this.as * 1722351593) >>> 16)) * -74320320;
            }
            this.as += this.ay[(i + mn.an) & -1060976865] * 309008912;
            int i3 = (this.ar * 1781830767) + ((this.as * -102381039) + this.ay[(-42805976 & i2) >> 2]);
            this.ay[i] = i3;
            int[] iArr = this.ag;
            i2 = (i2 + this.ay[((i3 >> 8) & 359592551) >> 2]) * 2018986639;
            this.ar = i2;
            iArr[i] = i2 * 1781830767;
        }
    }

    final void an(byte b) {
        try {
            int i = this.ar;
            int i2 = this.aj + 541898485;
            this.aj = i2;
            this.ar = i + (i2 * 397091059);
            for (i = 0; i < 256; i++) {
                i2 = this.ay[i];
                if ((i & 2) == 0) {
                    if ((i & 1) == 0) {
                        this.as = ((this.as * -102381039) ^ ((this.as * -102381039) << 13)) * 327837425;
                    } else {
                        this.as = ((this.as * -102381039) ^ ((this.as * -102381039) >>> 6)) * 327837425;
                    }
                } else if ((i & 1) == 0) {
                    this.as = ((this.as * -102381039) ^ ((this.as * -102381039) << 2)) * 327837425;
                } else {
                    this.as = ((this.as * -102381039) ^ ((this.as * -102381039) >>> 16)) * 327837425;
                }
                this.as += this.ay[(i + mn.an) & 255] * 327837425;
                int i3 = (this.ar * 1781830767) + ((this.as * -102381039) + this.ay[(i2 & 1020) >> 2]);
                this.ay[i] = i3;
                int[] iArr = this.ag;
                i2 = (i2 + this.ay[((i3 >> 8) & 1020) >> 2]) * 2018986639;
                this.ar = i2;
                iArr[i] = i2 * 1781830767;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "if.an(" + ')');
        }
    }

    final void aa(byte b) {
        int i;
        int i2 = 0;
        int i3 = -1640531527;
        int i4 = -1640531527;
        int i5 = -1640531527;
        int i6 = -1640531527;
        int i7 = -1640531527;
        int i8 = -1640531527;
        int i9 = -1640531527;
        int i10 = -1640531527;
        for (i = 0; i < 4; i++) {
            i10 ^= i9 << 11;
            i7 += i10;
            i9 = (i9 + i8) ^ (i8 >>> 2);
            i6 += i9;
            i8 = (i8 + i7) ^ (i7 << 8);
            i5 += i8;
            i7 = (i7 + i6) ^ (i6 >>> 16);
            i4 += i7;
            i6 = (i6 + i5) ^ (i5 << 10);
            i3 += i6;
            i5 = (i5 + i4) ^ (i4 >>> 4);
            i10 += i5;
            i4 = (i4 + i3) ^ (i3 << 8);
            i9 += i4;
            i3 = (i3 + i10) ^ (i10 >>> 9);
            i8 += i3;
            i10 += i9;
        }
        i = 0;
        while (i < 256) {
            try {
                i9 += this.ag[i + 1];
                i8 += this.ag[i + 2];
                i10 = (i10 + this.ag[i]) ^ (i9 << 11);
                i7 = (i7 + this.ag[i + 3]) + i10;
                i9 = (i9 + i8) ^ (i8 >>> 2);
                i6 = (i6 + this.ag[i + 4]) + i9;
                i8 = (i8 + i7) ^ (i7 << 8);
                i5 = (i5 + this.ag[i + 5]) + i8;
                i7 = (i7 + i6) ^ (i6 >>> 16);
                i4 = (i4 + this.ag[i + 6]) + i7;
                i6 = (i6 + i5) ^ (i5 << 10);
                i3 = (i3 + this.ag[i + 7]) + i6;
                i5 = (i5 + i4) ^ (i4 >>> 4);
                i10 += i5;
                i4 = (i4 + i3) ^ (i3 << 8);
                i9 += i4;
                i3 = (i3 + i10) ^ (i10 >>> 9);
                i8 += i3;
                i10 += i9;
                this.ay[i] = i10;
                this.ay[i + 1] = i9;
                this.ay[i + 2] = i8;
                this.ay[i + 3] = i7;
                this.ay[i + 4] = i6;
                this.ay[i + 5] = i5;
                this.ay[i + 6] = i4;
                this.ay[i + 7] = i3;
                i += 8;
            } catch (Throwable e) {
                throw ba.ad(e, "if.aa(" + ')');
            }
        }
        while (i2 < 256) {
            i9 += this.ay[i2 + 1];
            i8 += this.ay[i2 + 2];
            i10 = (i10 + this.ay[i2]) ^ (i9 << 11);
            i7 = (i7 + this.ay[i2 + 3]) + i10;
            i9 = (i9 + i8) ^ (i8 >>> 2);
            i6 = (i6 + this.ay[i2 + 4]) + i9;
            i8 = (i8 + i7) ^ (i7 << 8);
            i5 = (i5 + this.ay[i2 + 5]) + i8;
            i7 = (i7 + i6) ^ (i6 >>> 16);
            i4 = (i4 + this.ay[i2 + 6]) + i7;
            i6 = (i6 + i5) ^ (i5 << 10);
            i3 = (i3 + this.ay[i2 + 7]) + i6;
            i5 = (i5 + i4) ^ (i4 >>> 4);
            i10 += i5;
            i4 = (i4 + i3) ^ (i3 << 8);
            i9 += i4;
            i3 = (i3 + i10) ^ (i10 >>> 9);
            i8 += i3;
            i10 += i9;
            this.ay[i2] = i10;
            this.ay[i2 + 1] = i9;
            this.ay[i2 + 2] = i8;
            this.ay[i2 + 3] = i7;
            this.ay[i2 + 4] = i6;
            this.ay[i2 + 5] = i5;
            this.ay[i2 + 6] = i4;
            this.ay[i2 + 7] = i3;
            i2 += 8;
        }
        an((byte) -78);
        this.aa = 1402439424;
    }

    final void ab() {
        int i;
        int i2 = 0;
        int i3 = -1640531527;
        int i4 = -1640531527;
        int i5 = -1640531527;
        int i6 = -1640531527;
        int i7 = -1640531527;
        int i8 = -1640531527;
        int i9 = -1640531527;
        int i10 = -1640531527;
        for (i = 0; i < 4; i++) {
            i10 ^= i9 << 11;
            i7 += i10;
            i9 = (i9 + i8) ^ (i8 >>> 2);
            i6 += i9;
            i8 = (i8 + i7) ^ (i7 << 8);
            i5 += i8;
            i7 = (i7 + i6) ^ (i6 >>> 16);
            i4 += i7;
            i6 = (i6 + i5) ^ (i5 << 10);
            i3 += i6;
            i5 = (i5 + i4) ^ (i4 >>> 4);
            i10 += i5;
            i4 = (i4 + i3) ^ (i3 << 8);
            i9 += i4;
            i3 = (i3 + i10) ^ (i10 >>> 9);
            i8 += i3;
            i10 += i9;
        }
        for (i = 0; i < 256; i += 8) {
            i9 += this.ag[i + 1];
            i8 += this.ag[i + 2];
            i10 = (i10 + this.ag[i]) ^ (i9 << 11);
            i7 = (i7 + this.ag[i + 3]) + i10;
            i9 = (i9 + i8) ^ (i8 >>> 2);
            i6 = (i6 + this.ag[i + 4]) + i9;
            i8 = (i8 + i7) ^ (i7 << 8);
            i5 = (i5 + this.ag[i + 5]) + i8;
            i7 = (i7 + i6) ^ (i6 >>> 16);
            i4 = (i4 + this.ag[i + 6]) + i7;
            i6 = (i6 + i5) ^ (i5 << 10);
            i3 = (i3 + this.ag[i + 7]) + i6;
            i5 = (i5 + i4) ^ (i4 >>> 4);
            i10 += i5;
            i4 = (i4 + i3) ^ (i3 << 8);
            i9 += i4;
            i3 = (i3 + i10) ^ (i10 >>> 9);
            i8 += i3;
            i10 += i9;
            this.ay[i] = i10;
            this.ay[i + 1] = i9;
            this.ay[i + 2] = i8;
            this.ay[i + 3] = i7;
            this.ay[i + 4] = i6;
            this.ay[i + 5] = i5;
            this.ay[i + 6] = i4;
            this.ay[i + 7] = i3;
        }
        while (i2 < 256) {
            i9 += this.ay[i2 + 1];
            i8 += this.ay[i2 + 2];
            i10 = (i10 + this.ay[i2]) ^ (i9 << 11);
            i7 = (i7 + this.ay[i2 + 3]) + i10;
            i9 = (i9 + i8) ^ (i8 >>> 2);
            i6 = (i6 + this.ay[i2 + 4]) + i9;
            i8 = (i8 + i7) ^ (i7 << 8);
            i5 = (i5 + this.ay[i2 + 5]) + i8;
            i7 = (i7 + i6) ^ (i6 >>> 16);
            i4 = (i4 + this.ay[i2 + 6]) + i7;
            i6 = (i6 + i5) ^ (i5 << 10);
            i3 = (i3 + this.ay[i2 + 7]) + i6;
            i5 = (i5 + i4) ^ (i4 >>> 4);
            i10 += i5;
            i4 = (i4 + i3) ^ (i3 << 8);
            i9 += i4;
            i3 = (i3 + i10) ^ (i10 >>> 9);
            i8 += i3;
            i10 += i9;
            this.ay[i2] = i10;
            this.ay[i2 + 1] = i9;
            this.ay[i2 + 2] = i8;
            this.ay[i2 + 3] = i7;
            this.ay[i2 + 4] = i6;
            this.ay[i2 + 5] = i5;
            this.ay[i2 + 6] = i4;
            this.ay[i2 + 7] = i3;
            i2 += 8;
        }
        an((byte) -12);
        this.aa = 1402439424;
    }

    final void at() {
        int i;
        int i2 = 0;
        int i3 = -1640531527;
        int i4 = -1071727365;
        int i5 = 923569171;
        int i6 = 2145801086;
        int i7 = -1914313336;
        int i8 = -1640531527;
        int i9 = -1640531527;
        int i10 = -1640531527;
        for (i = 0; i < 4; i++) {
            i10 ^= i7 << 11;
            i6 += i10;
            i7 = (i7 + i9) ^ (i9 >>> 2);
            i8 += i7;
            i9 = (i9 + i6) ^ (i6 << 8);
            i5 += i9;
            i6 = (i6 + i8) ^ (i8 >>> 16);
            i3 += i6;
            i8 = (i8 + i5) ^ (i5 << 10);
            i4 += i8;
            i5 = (i5 + i3) ^ (i3 >>> 4);
            i10 += i5;
            i3 = (i3 + i4) ^ (i4 << 8);
            i7 += i3;
            i4 = (i4 + i10) ^ (i10 >>> 9);
            i9 += i4;
            i10 += i7;
        }
        for (i = 0; i < 256; i += 8) {
            i7 += this.ag[i + 1];
            i9 += this.ag[i + 2];
            i10 = (i10 + this.ag[i]) ^ (i7 << 11);
            i6 = (i6 + this.ag[i + 3]) + i10;
            i7 = (i7 + i9) ^ (i9 >>> 2);
            i8 = (i8 + this.ag[i + 4]) + i7;
            i9 = (i9 + i6) ^ (i6 << 8);
            i5 = (i5 + this.ag[i + 5]) + i9;
            i6 = (i6 + i8) ^ (i8 >>> 16);
            i3 = (i3 + this.ag[i + 6]) + i6;
            i8 = (i8 + i5) ^ (i5 << 10);
            i4 = (i4 + this.ag[i + 7]) + i8;
            i5 = (i5 + i3) ^ (i3 >>> 4);
            i10 += i5;
            i3 = (i3 + i4) ^ (i4 << 8);
            i7 += i3;
            i4 = (i4 + i10) ^ (i10 >>> 9);
            i9 += i4;
            i10 += i7;
            this.ay[i] = i10;
            this.ay[i + 1] = i7;
            this.ay[i + 2] = i9;
            this.ay[i + 3] = i6;
            this.ay[i + 4] = i8;
            this.ay[i + 5] = i5;
            this.ay[i + 6] = i3;
            this.ay[i + 7] = i4;
        }
        while (i2 < 256) {
            i7 += this.ay[i2 + 1];
            i9 += this.ay[i2 + 2];
            i10 = (i10 + this.ay[i2]) ^ (i7 << 11);
            i6 = (i6 + this.ay[i2 + 3]) + i10;
            i7 = (i7 + i9) ^ (i9 >>> 2);
            i8 = (i8 + this.ay[i2 + 4]) + i7;
            i9 = (i9 + i6) ^ (i6 << 8);
            i5 = (i5 + this.ay[i2 + 5]) + i9;
            i6 = (i6 + i8) ^ (i8 >>> 16);
            i3 = (i3 + this.ay[i2 + 6]) + i6;
            i8 = (i8 + i5) ^ (i5 << 10);
            i4 = (i4 + this.ay[i2 + 7]) + i8;
            i5 = (i5 + i3) ^ (i3 >>> 4);
            i10 += i5;
            i3 = (i3 + i4) ^ (i4 << 8);
            i7 += i3;
            i4 = (i4 + i10) ^ (i10 >>> 9);
            i9 += i4;
            i10 += i7;
            this.ay[i2] = i10;
            this.ay[i2 + 1] = i7;
            this.ay[i2 + 2] = i9;
            this.ay[i2 + 3] = i6;
            this.ay[i2 + 4] = i8;
            this.ay[i2 + 5] = i5;
            this.ay[i2 + 6] = i3;
            this.ay[i2 + 7] = i4;
            i2 += 8;
        }
        an((byte) -58);
        this.aa = 277976424;
    }

    final void aw() {
        int i;
        int i2 = 0;
        int i3 = -1640531527;
        int i4 = -1640531527;
        int i5 = -1640531527;
        int i6 = -1640531527;
        int i7 = -1640531527;
        int i8 = -1640531527;
        int i9 = -1640531527;
        int i10 = -1640531527;
        for (i = 0; i < 4; i++) {
            i10 ^= i9 << 11;
            i7 += i10;
            i9 = (i9 + i8) ^ (i8 >>> 2);
            i6 += i9;
            i8 = (i8 + i7) ^ (i7 << 8);
            i5 += i8;
            i7 = (i7 + i6) ^ (i6 >>> 16);
            i4 += i7;
            i6 = (i6 + i5) ^ (i5 << 10);
            i3 += i6;
            i5 = (i5 + i4) ^ (i4 >>> 4);
            i10 += i5;
            i4 = (i4 + i3) ^ (i3 << 8);
            i9 += i4;
            i3 = (i3 + i10) ^ (i10 >>> 9);
            i8 += i3;
            i10 += i9;
        }
        for (i = 0; i < 256; i += 8) {
            i9 += this.ag[i + 1];
            i8 += this.ag[i + 2];
            i10 = (i10 + this.ag[i]) ^ (i9 << 11);
            i7 = (i7 + this.ag[i + 3]) + i10;
            i9 = (i9 + i8) ^ (i8 >>> 2);
            i6 = (i6 + this.ag[i + 4]) + i9;
            i8 = (i8 + i7) ^ (i7 << 8);
            i5 = (i5 + this.ag[i + 5]) + i8;
            i7 = (i7 + i6) ^ (i6 >>> 16);
            i4 = (i4 + this.ag[i + 6]) + i7;
            i6 = (i6 + i5) ^ (i5 << 10);
            i3 = (i3 + this.ag[i + 7]) + i6;
            i5 = (i5 + i4) ^ (i4 >>> 4);
            i10 += i5;
            i4 = (i4 + i3) ^ (i3 << 8);
            i9 += i4;
            i3 = (i3 + i10) ^ (i10 >>> 9);
            i8 += i3;
            i10 += i9;
            this.ay[i] = i10;
            this.ay[i + 1] = i9;
            this.ay[i + 2] = i8;
            this.ay[i + 3] = i7;
            this.ay[i + 4] = i6;
            this.ay[i + 5] = i5;
            this.ay[i + 6] = i4;
            this.ay[i + 7] = i3;
        }
        while (i2 < 256) {
            i9 += this.ay[i2 + 1];
            i8 += this.ay[i2 + 2];
            i10 = (i10 + this.ay[i2]) ^ (i9 << 11);
            i7 = (i7 + this.ay[i2 + 3]) + i10;
            i9 = (i9 + i8) ^ (i8 >>> 2);
            i6 = (i6 + this.ay[i2 + 4]) + i9;
            i8 = (i8 + i7) ^ (i7 << 8);
            i5 = (i5 + this.ay[i2 + 5]) + i8;
            i7 = (i7 + i6) ^ (i6 >>> 16);
            i4 = (i4 + this.ay[i2 + 6]) + i7;
            i6 = (i6 + i5) ^ (i5 << 10);
            i3 = (i3 + this.ay[i2 + 7]) + i6;
            i5 = (i5 + i4) ^ (i4 >>> 4);
            i10 += i5;
            i4 = (i4 + i3) ^ (i3 << 8);
            i9 += i4;
            i3 = (i3 + i10) ^ (i10 >>> 9);
            i8 += i3;
            i10 += i9;
            this.ay[i2] = i10;
            this.ay[i2 + 1] = i9;
            this.ay[i2 + 2] = i8;
            this.ay[i2 + 3] = i7;
            this.ay[i2 + 4] = i6;
            this.ay[i2 + 5] = i5;
            this.ay[i2 + 6] = i4;
            this.ay[i2 + 7] = i3;
            i2 += 8;
        }
        an((byte) 5);
        this.aa = 1402439424;
    }
}
