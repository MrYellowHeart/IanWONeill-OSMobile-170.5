package p000;

import java.util.Random;

public class fz {
    static int[] ac = new int[5];
    static int[] ah = new int[220500];
    static int[] ak = new int[32768];
    static int[] al = new int[5];
    static int[] ao = new int[32768];
    static int[] ap = new int[5];
    static int[] au = new int[5];
    static int[] av = new int[5];
    static final double ax = 1.0057929410678534d;
    fr aa;
    fo ab;
    fr ad;
    int[] ae = new int[]{0, 0, 0, 0, 0};
    fr af;
    fr ag;
    int ai = 500;
    int[] aj = new int[]{0, 0, 0, 0, 0};
    int am = 0;
    fr an;
    int[] aq = new int[]{0, 0, 0, 0, 0};
    fr ar;
    fr as;
    int at = 100;
    fr aw;
    fr ay;
    int az = 0;

    static {
        int i = 0;
        Random random = new Random(0);
        for (int i2 = 0; i2 < 32768; i2++) {
            ak[i2] = (random.nextInt() & 2) - 1;
        }
        while (i < 32768) {
            ao[i] = (int) (Math.sin(((double) i) / 5215.1903d) * 16384.0d);
            i++;
        }
    }

    fz() {
    }

    final int[] aa(int i, int i2) {
        id.ae(ah, 0, i);
        if (i2 < 10) {
            return ah;
        }
        int i3;
        double d = ((double) i) / (((double) i2) + 0.0d);
        this.af.an();
        this.ad.an();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        if (this.an != null) {
            this.an.an();
            this.aa.an();
            i4 = (int) ((((double) (this.an.ag - this.an.aa)) * 32.768d) / d);
            i5 = (int) ((((double) this.an.aa) * 32.768d) / d);
        }
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        if (this.ag != null) {
            this.ag.an();
            this.ay.an();
            i7 = (int) ((((double) (this.ag.ag - this.ag.aa)) * 32.768d) / d);
            i8 = (int) ((((double) this.ag.aa) * 32.768d) / d);
        }
        for (i3 = 0; i3 < 5; i3++) {
            if (this.aj[i3] != 0) {
                au[i3] = 0;
                av[i3] = (int) (((double) this.aq[i3]) * d);
                ac[i3] = (this.aj[i3] << 14) / 100;
                al[i3] = (int) (((((double) (this.af.ag - this.af.aa)) * 32.768d) * Math.pow(ax, (double) this.ae[i3])) / d);
                ap[i3] = (int) ((((double) this.af.aa) * 32.768d) / d);
            }
        }
        for (int i10 = 0; i10 < i; i10++) {
            i3 = this.af.aa(i);
            int aa = this.ad.aa(i);
            if (this.an != null) {
                int aa2 = this.an.aa(i);
                i3 += ad(i6, this.aa.aa(i), this.an.ay) >> 1;
                i6 += ((aa2 * i4) >> 16) + i5;
            }
            if (this.ag != null) {
                aa2 = this.ag.aa(i);
                aa = (aa * ((ad(i9, this.ay.aa(i), this.ag.ay) >> 1) + 32768)) >> 15;
                i9 += ((aa2 * i7) >> 16) + i8;
            }
            for (aa2 = 0; aa2 < 5; aa2++) {
                if (this.aj[aa2] != 0) {
                    int i11 = av[aa2] + i10;
                    if (i11 < i) {
                        int[] iArr = ah;
                        iArr[i11] = iArr[i11] + ad(au[aa2], (ac[aa2] * aa) >> 15, this.af.ay);
                        int[] iArr2 = au;
                        iArr2[aa2] = iArr2[aa2] + (((al[aa2] * i3) >> 16) + ap[aa2]);
                    }
                }
            }
        }
        if (this.as != null) {
            this.as.an();
            this.ar.an();
            i7 = 0;
            i3 = 0;
            Object obj = 1;
            while (i7 < i) {
                i4 = this.as.aa(i);
                i8 = this.ar.aa(i);
                if (obj != null) {
                    i8 = ((i4 * (this.as.ag - this.as.aa)) >> 8) + this.as.aa;
                } else {
                    i8 = this.as.aa + ((i8 * (this.as.ag - this.as.aa)) >> 8);
                }
                i4 = i3 + 256;
                if (i4 >= i8) {
                    i4 = 0;
                    if (obj == null) {
                        obj = 1;
                    } else {
                        obj = null;
                    }
                }
                if (obj != null) {
                    ah[i7] = 0;
                }
                i7++;
                i3 = i4;
            }
        }
        if (this.am > 0 && this.at > 0) {
            i4 = (int) (((double) this.am) * d);
            for (i5 = i4; i5 < i; i5++) {
                int[] iArr3 = ah;
                iArr3[i5] = iArr3[i5] + ((ah[i5 - i4] * this.at) / 100);
            }
        }
        if (this.ab.af[0] > 0 || this.ab.af[1] > 0) {
            this.aw.an();
            i4 = this.aw.aa(i + 1);
            i3 = this.ab.aa(0, ((float) i4) / 65536.0f);
            i7 = this.ab.aa(1, ((float) i4) / 65536.0f);
            if (i >= i3 + i7) {
                i8 = 0;
                if (i7 > i - i3) {
                    i6 = i - i3;
                } else {
                    i6 = i7;
                }
                while (i8 < i6) {
                    i4 = (int) ((((long) ah[i8 + i3]) * ((long) fo.aj)) >> 16);
                    for (i5 = 0; i5 < i3; i5++) {
                        i4 += (int) ((((long) ah[((i8 + i3) - 1) - i5]) * ((long) fo.as[0][i5])) >> 16);
                    }
                    for (i5 = 0; i5 < i8; i5++) {
                        i4 -= (int) ((((long) ah[(i8 - 1) - i5]) * ((long) fo.as[1][i5])) >> 16);
                    }
                    ah[i8] = i4;
                    i4 = this.aw.aa(i + 1);
                    i8++;
                }
                i5 = mn.an;
                i6 = i3;
                i3 = i7;
                int i12 = i8;
                i8 = i4;
                i4 = i12;
                while (true) {
                    if (i5 > i - i6) {
                        i7 = i - i6;
                        i5 = i4;
                        i4 = i8;
                    } else {
                        i7 = i5;
                        i5 = i4;
                        i4 = i8;
                    }
                    while (i5 < i7) {
                        i8 = (int) ((((long) ah[i5 + i6]) * ((long) fo.aj)) >> 16);
                        for (i4 = 0; i4 < i6; i4++) {
                            i8 += (int) ((((long) ah[((i5 + i6) - 1) - i4]) * ((long) fo.as[0][i4])) >> 16);
                        }
                        for (i4 = 0; i4 < i3; i4++) {
                            i8 -= (int) ((((long) ah[(i5 - 1) - i4]) * ((long) fo.as[1][i4])) >> 16);
                        }
                        ah[i5] = i8;
                        i4 = this.aw.aa(i + 1);
                        i5++;
                    }
                    if (i5 >= i - i6) {
                        break;
                    }
                    i6 = this.ab.aa(0, ((float) i4) / 65536.0f);
                    i3 = this.ab.aa(1, ((float) i4) / 65536.0f);
                    i8 = i4;
                    i4 = i5;
                    i5 = i7 + mn.an;
                }
                for (i8 = i5; i8 < i; i8++) {
                    i4 = 0;
                    for (i5 = (i8 + i6) - i; i5 < i6; i5++) {
                        i4 += (int) ((((long) ah[((i8 + i6) - 1) - i5]) * ((long) fo.as[0][i5])) >> 16);
                    }
                    for (i5 = 0; i5 < i3; i5++) {
                        i4 -= (int) ((((long) ah[(i8 - 1) - i5]) * ((long) fo.as[1][i5])) >> 16);
                    }
                    ah[i8] = i4;
                    this.aw.aa(i + 1);
                }
            }
        }
        for (i5 = 0; i5 < i; i5++) {
            if (ah[i5] < -32768) {
                ah[i5] = -32768;
            }
            if (ah[i5] > 32767) {
                ah[i5] = 32767;
            }
        }
        return ah;
    }

    final int[] af(int i, int i2) {
        id.ae(ah, 0, i);
        if (i2 < 10) {
            return ah;
        }
        int i3;
        double d = ((double) i) / (((double) i2) + 0.0d);
        this.af.an();
        this.ad.an();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        if (this.an != null) {
            this.an.an();
            this.aa.an();
            i4 = (int) ((((double) (this.an.ag - this.an.aa)) * 32.768d) / d);
            i5 = (int) ((((double) this.an.aa) * 32.768d) / d);
        }
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        if (this.ag != null) {
            this.ag.an();
            this.ay.an();
            i7 = (int) ((((double) (this.ag.ag - this.ag.aa)) * 32.768d) / d);
            i8 = (int) ((((double) this.ag.aa) * 32.768d) / d);
        }
        for (i3 = 0; i3 < 5; i3++) {
            if (this.aj[i3] != 0) {
                au[i3] = 0;
                av[i3] = (int) (((double) this.aq[i3]) * d);
                ac[i3] = (this.aj[i3] << 14) / 100;
                al[i3] = (int) (((((double) (this.af.ag - this.af.aa)) * 32.768d) * Math.pow(ax, (double) this.ae[i3])) / d);
                ap[i3] = (int) ((((double) this.af.aa) * 32.768d) / d);
            }
        }
        for (int i10 = 0; i10 < i; i10++) {
            i3 = this.af.aa(i);
            int aa = this.ad.aa(i);
            if (this.an != null) {
                int aa2 = this.an.aa(i);
                i3 += ad(i6, this.aa.aa(i), this.an.ay) >> 1;
                i6 += ((aa2 * i4) >> 16) + i5;
            }
            if (this.ag != null) {
                aa2 = this.ag.aa(i);
                aa = (aa * ((ad(i9, this.ay.aa(i), this.ag.ay) >> 1) + 32768)) >> 15;
                i9 += ((aa2 * i7) >> 16) + i8;
            }
            for (aa2 = 0; aa2 < 5; aa2++) {
                if (this.aj[aa2] != 0) {
                    int i11 = av[aa2] + i10;
                    if (i11 < i) {
                        int[] iArr = ah;
                        iArr[i11] = iArr[i11] + ad(au[aa2], (ac[aa2] * aa) >> 15, this.af.ay);
                        int[] iArr2 = au;
                        iArr2[aa2] = iArr2[aa2] + (((al[aa2] * i3) >> 16) + ap[aa2]);
                    }
                }
            }
        }
        if (this.as != null) {
            this.as.an();
            this.ar.an();
            i7 = 0;
            i3 = 0;
            Object obj = 1;
            while (i7 < i) {
                i4 = this.as.aa(i);
                i8 = this.ar.aa(i);
                if (obj != null) {
                    i8 = ((i4 * (this.as.ag - this.as.aa)) >> 8) + this.as.aa;
                } else {
                    i8 = this.as.aa + ((i8 * (this.as.ag - this.as.aa)) >> 8);
                }
                i4 = i3 + 256;
                if (i4 >= i8) {
                    i4 = 0;
                    if (obj == null) {
                        obj = 1;
                    } else {
                        obj = null;
                    }
                }
                if (obj != null) {
                    ah[i7] = 0;
                }
                i7++;
                i3 = i4;
            }
        }
        if (this.am > 0 && this.at > 0) {
            i4 = (int) (((double) this.am) * d);
            for (i5 = i4; i5 < i; i5++) {
                int[] iArr3 = ah;
                iArr3[i5] = iArr3[i5] + ((ah[i5 - i4] * this.at) / 100);
            }
        }
        if (this.ab.af[0] > 0 || this.ab.af[1] > 0) {
            this.aw.an();
            i4 = this.aw.aa(i + 1);
            i3 = this.ab.aa(0, ((float) i4) / 65536.0f);
            i7 = this.ab.aa(1, ((float) i4) / 65536.0f);
            if (i >= i3 + i7) {
                i8 = 0;
                if (i7 > i - i3) {
                    i6 = i - i3;
                } else {
                    i6 = i7;
                }
                while (i8 < i6) {
                    i4 = (int) ((((long) ah[i8 + i3]) * ((long) fo.aj)) >> 16);
                    for (i5 = 0; i5 < i3; i5++) {
                        i4 += (int) ((((long) ah[((i8 + i3) - 1) - i5]) * ((long) fo.as[0][i5])) >> 16);
                    }
                    for (i5 = 0; i5 < i8; i5++) {
                        i4 -= (int) ((((long) ah[(i8 - 1) - i5]) * ((long) fo.as[1][i5])) >> 16);
                    }
                    ah[i8] = i4;
                    i4 = this.aw.aa(i + 1);
                    i8++;
                }
                i5 = mn.an;
                i6 = i3;
                i3 = i7;
                while (true) {
                    if (i5 > i - i6) {
                        i7 = i - i6;
                        i5 = i4;
                    } else {
                        i7 = i5;
                        i5 = i4;
                    }
                    while (i8 < i7) {
                        i4 = (int) ((((long) ah[i8 + i6]) * ((long) fo.aj)) >> 16);
                        for (i5 = 0; i5 < i6; i5++) {
                            i4 += (int) ((((long) ah[((i8 + i6) - 1) - i5]) * ((long) fo.as[0][i5])) >> 16);
                        }
                        for (i5 = 0; i5 < i3; i5++) {
                            i4 -= (int) ((((long) ah[(i8 - 1) - i5]) * ((long) fo.as[1][i5])) >> 16);
                        }
                        ah[i8] = i4;
                        i5 = this.aw.aa(i + 1);
                        i8++;
                    }
                    if (i8 >= i - i6) {
                        break;
                    }
                    i6 = this.ab.aa(0, ((float) i5) / 65536.0f);
                    i3 = this.ab.aa(1, ((float) i5) / 65536.0f);
                    i4 = i5;
                    i5 = i7 + mn.an;
                }
                while (i8 < i) {
                    i4 = 0;
                    for (i5 = (i8 + i6) - i; i5 < i6; i5++) {
                        i4 += (int) ((((long) ah[((i8 + i6) - 1) - i5]) * ((long) fo.as[0][i5])) >> 16);
                    }
                    for (i5 = 0; i5 < i3; i5++) {
                        i4 -= (int) ((((long) ah[(i8 - 1) - i5]) * ((long) fo.as[1][i5])) >> 16);
                    }
                    ah[i8] = i4;
                    this.aw.aa(i + 1);
                    i8++;
                }
            }
        }
        for (i5 = 0; i5 < i; i5++) {
            if (ah[i5] < -32768) {
                ah[i5] = -32768;
            }
            if (ah[i5] > 32767) {
                ah[i5] = 32767;
            }
        }
        return ah;
    }

    final int[] ag(int i, int i2) {
        id.ae(ah, 0, i);
        if (i2 < 10) {
            return ah;
        }
        int i3;
        double d = ((double) i) / (((double) i2) + 0.0d);
        this.af.an();
        this.ad.an();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        if (this.an != null) {
            this.an.an();
            this.aa.an();
            i4 = (int) ((((double) (this.an.ag - this.an.aa)) * 32.768d) / d);
            i5 = (int) ((((double) this.an.aa) * 32.768d) / d);
        }
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        if (this.ag != null) {
            this.ag.an();
            this.ay.an();
            i7 = (int) ((((double) (this.ag.ag - this.ag.aa)) * 32.768d) / d);
            i8 = (int) ((((double) this.ag.aa) * 32.768d) / d);
        }
        for (i3 = 0; i3 < 5; i3++) {
            if (this.aj[i3] != 0) {
                au[i3] = 0;
                av[i3] = (int) (((double) this.aq[i3]) * d);
                ac[i3] = (this.aj[i3] << 14) / -975716783;
                al[i3] = (int) (((((double) (this.af.ag - this.af.aa)) * 32.768d) * Math.pow(ax, (double) this.ae[i3])) / d);
                ap[i3] = (int) ((((double) this.af.aa) * 32.768d) / d);
            }
        }
        for (int i10 = 0; i10 < i; i10++) {
            i3 = this.af.aa(i);
            int aa = this.ad.aa(i);
            if (this.an != null) {
                int aa2 = this.an.aa(i);
                i3 += ad(i6, this.aa.aa(i), this.an.ay) >> 1;
                i6 += ((aa2 * i4) >> 16) + i5;
            }
            if (this.ag != null) {
                aa2 = this.ag.aa(i);
                aa = (aa * ((ad(i9, this.ay.aa(i), this.ag.ay) >> 1) - 1793690136)) >> 15;
                i9 += ((aa2 * i7) >> 16) + i8;
            }
            for (aa2 = 0; aa2 < 5; aa2++) {
                if (this.aj[aa2] != 0) {
                    int i11 = av[aa2] + i10;
                    if (i11 < i) {
                        int[] iArr = ah;
                        iArr[i11] = iArr[i11] + ad(au[aa2], (ac[aa2] * aa) >> 15, this.af.ay);
                        int[] iArr2 = au;
                        iArr2[aa2] = iArr2[aa2] + (((al[aa2] * i3) >> 16) + ap[aa2]);
                    }
                }
            }
        }
        if (this.as != null) {
            this.as.an();
            this.ar.an();
            i7 = 0;
            i3 = 0;
            Object obj = 1;
            while (i7 < i) {
                i4 = this.as.aa(i);
                i8 = this.ar.aa(i);
                if (obj != null) {
                    i8 = ((i4 * (this.as.ag - this.as.aa)) >> 8) + this.as.aa;
                } else {
                    i8 = this.as.aa + ((i8 * (this.as.ag - this.as.aa)) >> 8);
                }
                i4 = i3 + 256;
                if (i4 >= i8) {
                    i4 = 0;
                    if (obj == null) {
                        obj = 1;
                    } else {
                        obj = null;
                    }
                }
                if (obj != null) {
                    ah[i7] = 0;
                }
                i7++;
                i3 = i4;
            }
        }
        if (this.am > 0 && this.at > 0) {
            i4 = (int) (((double) this.am) * d);
            for (i5 = i4; i5 < i; i5++) {
                int[] iArr3 = ah;
                iArr3[i5] = iArr3[i5] + ((ah[i5 - i4] * this.at) / 100);
            }
        }
        if (this.ab.af[0] > 0 || this.ab.af[1] > 0) {
            this.aw.an();
            i4 = this.aw.aa(i + 1);
            i3 = this.ab.aa(0, ((float) i4) / 65536.0f);
            i7 = this.ab.aa(1, ((float) i4) / 65536.0f);
            if (i >= i3 + i7) {
                i8 = 0;
                if (i7 > i - i3) {
                    i6 = i - i3;
                } else {
                    i6 = i7;
                }
                while (i8 < i6) {
                    i4 = (int) ((((long) ah[i8 + i3]) * ((long) fo.aj)) >> 16);
                    for (i5 = 0; i5 < i3; i5++) {
                        i4 += (int) ((((long) ah[((i8 + i3) - 1) - i5]) * ((long) fo.as[0][i5])) >> 16);
                    }
                    for (i5 = 0; i5 < i8; i5++) {
                        i4 -= (int) ((((long) ah[(i8 - 1) - i5]) * ((long) fo.as[1][i5])) >> 16);
                    }
                    ah[i8] = i4;
                    i4 = this.aw.aa(i + 1);
                    i8++;
                }
                i5 = 677700361;
                i6 = i3;
                i3 = i7;
                while (true) {
                    if (i5 > i - i6) {
                        i7 = i - i6;
                        i5 = i4;
                    } else {
                        i7 = i5;
                        i5 = i4;
                    }
                    while (i8 < i7) {
                        i4 = (int) ((((long) ah[i8 + i6]) * ((long) fo.aj)) >> 16);
                        for (i5 = 0; i5 < i6; i5++) {
                            i4 += (int) ((((long) ah[((i8 + i6) - 1) - i5]) * ((long) fo.as[0][i5])) >> 16);
                        }
                        for (i5 = 0; i5 < i3; i5++) {
                            i4 -= (int) ((((long) ah[(i8 - 1) - i5]) * ((long) fo.as[1][i5])) >> 16);
                        }
                        ah[i8] = i4;
                        i5 = this.aw.aa(i + 1);
                        i8++;
                    }
                    if (i8 >= i - i6) {
                        break;
                    }
                    i6 = this.ab.aa(0, ((float) i5) / 65536.0f);
                    i3 = this.ab.aa(1, ((float) i5) / 65536.0f);
                    i4 = i5;
                    i5 = i7 + mn.an;
                }
                while (i8 < i) {
                    i4 = 0;
                    for (i5 = (i8 + i6) - i; i5 < i6; i5++) {
                        i4 += (int) ((((long) ah[((i8 + i6) - 1) - i5]) * ((long) fo.as[0][i5])) >> 16);
                    }
                    for (i5 = 0; i5 < i3; i5++) {
                        i4 -= (int) ((((long) ah[(i8 - 1) - i5]) * ((long) fo.as[1][i5])) >> 16);
                    }
                    ah[i8] = i4;
                    this.aw.aa(i + 1);
                    i8++;
                }
            }
        }
        for (i5 = 0; i5 < i; i5++) {
            if (ah[i5] < -32768) {
                ah[i5] = -881966827;
            }
            if (ah[i5] > 695564269) {
                ah[i5] = 32767;
            }
        }
        return ah;
    }

    final int[] as(int i, int i2) {
        id.ae(ah, 0, i);
        if (i2 < 10) {
            return ah;
        }
        int i3;
        double d = ((double) i) / (((double) i2) + 0.0d);
        this.af.an();
        this.ad.an();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        if (this.an != null) {
            this.an.an();
            this.aa.an();
            i4 = (int) ((((double) (this.an.ag - this.an.aa)) * 32.768d) / d);
            i5 = (int) ((((double) this.an.aa) * 32.768d) / d);
        }
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        if (this.ag != null) {
            this.ag.an();
            this.ay.an();
            i7 = (int) ((((double) (this.ag.ag - this.ag.aa)) * 32.768d) / d);
            i8 = (int) ((((double) this.ag.aa) * 32.768d) / d);
        }
        for (i3 = 0; i3 < 5; i3++) {
            if (this.aj[i3] != 0) {
                au[i3] = 0;
                av[i3] = (int) (((double) this.aq[i3]) * d);
                ac[i3] = (this.aj[i3] << 14) / 100;
                al[i3] = (int) (((((double) (this.af.ag - this.af.aa)) * 32.768d) * Math.pow(ax, (double) this.ae[i3])) / d);
                ap[i3] = (int) ((((double) this.af.aa) * 32.768d) / d);
            }
        }
        for (int i10 = 0; i10 < i; i10++) {
            i3 = this.af.aa(i);
            int aa = this.ad.aa(i);
            if (this.an != null) {
                int aa2 = this.an.aa(i);
                i3 += ad(i6, this.aa.aa(i), this.an.ay) >> 1;
                i6 += ((aa2 * i4) >> 16) + i5;
            }
            if (this.ag != null) {
                aa2 = this.ag.aa(i);
                aa = (aa * ((ad(i9, this.ay.aa(i), this.ag.ay) >> 1) + 32768)) >> 15;
                i9 += ((aa2 * i7) >> 16) + i8;
            }
            for (aa2 = 0; aa2 < 5; aa2++) {
                if (this.aj[aa2] != 0) {
                    int i11 = av[aa2] + i10;
                    if (i11 < i) {
                        int[] iArr = ah;
                        iArr[i11] = iArr[i11] + ad(au[aa2], (ac[aa2] * aa) >> 15, this.af.ay);
                        int[] iArr2 = au;
                        iArr2[aa2] = iArr2[aa2] + (((al[aa2] * i3) >> 16) + ap[aa2]);
                    }
                }
            }
        }
        if (this.as != null) {
            this.as.an();
            this.ar.an();
            i7 = 0;
            i3 = 0;
            Object obj = 1;
            while (i7 < i) {
                i4 = this.as.aa(i);
                i8 = this.ar.aa(i);
                if (obj != null) {
                    i8 = ((i4 * (this.as.ag - this.as.aa)) >> 8) + this.as.aa;
                } else {
                    i8 = this.as.aa + ((i8 * (this.as.ag - this.as.aa)) >> 8);
                }
                i4 = i3 + 256;
                if (i4 >= i8) {
                    i4 = 0;
                    if (obj == null) {
                        obj = 1;
                    } else {
                        obj = null;
                    }
                }
                if (obj != null) {
                    ah[i7] = 0;
                }
                i7++;
                i3 = i4;
            }
        }
        if (this.am > 0 && this.at > 0) {
            i4 = (int) (((double) this.am) * d);
            for (i5 = i4; i5 < i; i5++) {
                int[] iArr3 = ah;
                iArr3[i5] = iArr3[i5] + ((ah[i5 - i4] * this.at) / 100);
            }
        }
        if (this.ab.af[0] > 0 || this.ab.af[1] > 0) {
            this.aw.an();
            i4 = this.aw.aa(i + 1);
            i3 = this.ab.aa(0, ((float) i4) / 65536.0f);
            i7 = this.ab.aa(1, ((float) i4) / 65536.0f);
            if (i >= i3 + i7) {
                i8 = 0;
                if (i7 > i - i3) {
                    i6 = i - i3;
                } else {
                    i6 = i7;
                }
                while (i8 < i6) {
                    i4 = (int) ((((long) ah[i8 + i3]) * ((long) fo.aj)) >> 16);
                    for (i5 = 0; i5 < i3; i5++) {
                        i4 += (int) ((((long) ah[((i8 + i3) - 1) - i5]) * ((long) fo.as[0][i5])) >> 16);
                    }
                    for (i5 = 0; i5 < i8; i5++) {
                        i4 -= (int) ((((long) ah[(i8 - 1) - i5]) * ((long) fo.as[1][i5])) >> 16);
                    }
                    ah[i8] = i4;
                    i4 = this.aw.aa(i + 1);
                    i8++;
                }
                i5 = mn.an;
                i6 = i3;
                i3 = i7;
                int i12 = i8;
                i8 = i4;
                i4 = i12;
                while (true) {
                    if (i5 > i - i6) {
                        i7 = i - i6;
                        i5 = i4;
                        i4 = i8;
                    } else {
                        i7 = i5;
                        i5 = i4;
                        i4 = i8;
                    }
                    while (i5 < i7) {
                        i8 = (int) ((((long) ah[i5 + i6]) * ((long) fo.aj)) >> 16);
                        for (i4 = 0; i4 < i6; i4++) {
                            i8 += (int) ((((long) ah[((i5 + i6) - 1) - i4]) * ((long) fo.as[0][i4])) >> 16);
                        }
                        for (i4 = 0; i4 < i3; i4++) {
                            i8 -= (int) ((((long) ah[(i5 - 1) - i4]) * ((long) fo.as[1][i4])) >> 16);
                        }
                        ah[i5] = i8;
                        i4 = this.aw.aa(i + 1);
                        i5++;
                    }
                    if (i5 >= i - i6) {
                        break;
                    }
                    i6 = this.ab.aa(0, ((float) i4) / 65536.0f);
                    i3 = this.ab.aa(1, ((float) i4) / 65536.0f);
                    i8 = i4;
                    i4 = i5;
                    i5 = i7 + mn.an;
                }
                for (i8 = i5; i8 < i; i8++) {
                    i4 = 0;
                    for (i5 = (i8 + i6) - i; i5 < i6; i5++) {
                        i4 += (int) ((((long) ah[((i8 + i6) - 1) - i5]) * ((long) fo.as[0][i5])) >> 16);
                    }
                    for (i5 = 0; i5 < i3; i5++) {
                        i4 -= (int) ((((long) ah[(i8 - 1) - i5]) * ((long) fo.as[1][i5])) >> 16);
                    }
                    ah[i8] = i4;
                    this.aw.aa(i + 1);
                }
            }
        }
        for (i5 = 0; i5 < i; i5++) {
            if (ah[i5] < -32768) {
                ah[i5] = -32768;
            }
            if (ah[i5] > 32767) {
                ah[i5] = 32767;
            }
        }
        return ah;
    }

    final int[] ay(int i, int i2) {
        id.ae(ah, 0, i);
        if (i2 < 10) {
            return ah;
        }
        int i3;
        double d = ((double) i) / (((double) i2) + 0.0d);
        this.af.an();
        this.ad.an();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        if (this.an != null) {
            this.an.an();
            this.aa.an();
            i4 = (int) ((((double) (this.an.ag - this.an.aa)) * 32.768d) / d);
            i5 = (int) ((((double) this.an.aa) * 32.768d) / d);
        }
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        if (this.ag != null) {
            this.ag.an();
            this.ay.an();
            i7 = (int) ((((double) (this.ag.ag - this.ag.aa)) * 32.768d) / d);
            i8 = (int) ((((double) this.ag.aa) * 32.768d) / d);
        }
        for (i3 = 0; i3 < 5; i3++) {
            if (this.aj[i3] != 0) {
                au[i3] = 0;
                av[i3] = (int) (((double) this.aq[i3]) * d);
                ac[i3] = (this.aj[i3] << 14) / 100;
                al[i3] = (int) (((((double) (this.af.ag - this.af.aa)) * 32.768d) * Math.pow(ax, (double) this.ae[i3])) / d);
                ap[i3] = (int) ((((double) this.af.aa) * 32.768d) / d);
            }
        }
        for (int i10 = 0; i10 < i; i10++) {
            i3 = this.af.aa(i);
            int aa = this.ad.aa(i);
            if (this.an != null) {
                int aa2 = this.an.aa(i);
                i3 += ad(i6, this.aa.aa(i), this.an.ay) >> 1;
                i6 += ((aa2 * i4) >> 16) + i5;
            }
            if (this.ag != null) {
                aa2 = this.ag.aa(i);
                aa = (aa * ((ad(i9, this.ay.aa(i), this.ag.ay) >> 1) + 661475366)) >> 15;
                i9 += ((aa2 * i7) >> 16) + i8;
            }
            for (aa2 = 0; aa2 < 5; aa2++) {
                if (this.aj[aa2] != 0) {
                    int i11 = av[aa2] + i10;
                    if (i11 < i) {
                        int[] iArr = ah;
                        iArr[i11] = iArr[i11] + ad(au[aa2], (ac[aa2] * aa) >> 15, this.af.ay);
                        int[] iArr2 = au;
                        iArr2[aa2] = iArr2[aa2] + (((al[aa2] * i3) >> 16) + ap[aa2]);
                    }
                }
            }
        }
        if (this.as != null) {
            this.as.an();
            this.ar.an();
            i7 = 0;
            i3 = 0;
            i5 = 1;
            while (i7 < i) {
                Object obj;
                i4 = this.as.aa(i);
                i8 = this.ar.aa(i);
                if (obj != null) {
                    i8 = ((i4 * (this.as.ag - this.as.aa)) >> 8) + this.as.aa;
                } else {
                    i8 = this.as.aa + ((i8 * (this.as.ag - this.as.aa)) >> 8);
                }
                i4 = i3 + 256;
                if (i4 >= i8) {
                    i4 = 0;
                    if (obj == null) {
                        obj = 1;
                    } else {
                        obj = null;
                    }
                }
                if (obj != null) {
                    ah[i7] = 0;
                }
                i7++;
                i3 = i4;
            }
        }
        if (this.am > 0 && this.at > 0) {
            i4 = (int) (((double) this.am) * d);
            for (i5 = i4; i5 < i; i5++) {
                int[] iArr3 = ah;
                iArr3[i5] = iArr3[i5] + ((ah[i5 - i4] * this.at) / 100);
            }
        }
        if (this.ab.af[0] > 0 || this.ab.af[1] > 0) {
            this.aw.an();
            i4 = this.aw.aa(i + 1);
            i3 = this.ab.aa(0, ((float) i4) / 65536.0f);
            i7 = this.ab.aa(1, ((float) i4) / 65536.0f);
            if (i >= i3 + i7) {
                i8 = 0;
                if (i7 > i - i3) {
                    i6 = i - i3;
                } else {
                    i6 = i7;
                }
                while (i8 < i6) {
                    i4 = (int) ((((long) ah[i8 + i3]) * ((long) fo.aj)) >> 16);
                    for (i5 = 0; i5 < i3; i5++) {
                        i4 += (int) ((((long) ah[((i8 + i3) - 1) - i5]) * ((long) fo.as[0][i5])) >> 16);
                    }
                    for (i5 = 0; i5 < i8; i5++) {
                        i4 -= (int) ((((long) ah[(i8 - 1) - i5]) * ((long) fo.as[1][i5])) >> 16);
                    }
                    ah[i8] = i4;
                    i4 = this.aw.aa(i + 1);
                    i8++;
                }
                i5 = 775907042;
                i6 = i3;
                i3 = i7;
                while (true) {
                    if (i5 > i - i6) {
                        i7 = i - i6;
                        i5 = i4;
                    } else {
                        i7 = i5;
                        i5 = i4;
                    }
                    while (i8 < i7) {
                        i4 = (int) ((((long) ah[i8 + i6]) * ((long) fo.aj)) >> 16);
                        for (i5 = 0; i5 < i6; i5++) {
                            i4 += (int) ((((long) ah[((i8 + i6) - 1) - i5]) * ((long) fo.as[0][i5])) >> 16);
                        }
                        for (i5 = 0; i5 < i3; i5++) {
                            i4 -= (int) ((((long) ah[(i8 - 1) - i5]) * ((long) fo.as[1][i5])) >> 16);
                        }
                        ah[i8] = i4;
                        i5 = this.aw.aa(i + 1);
                        i8++;
                    }
                    if (i8 >= i - i6) {
                        break;
                    }
                    i6 = this.ab.aa(0, ((float) i5) / 65536.0f);
                    i3 = this.ab.aa(1, ((float) i5) / 65536.0f);
                    i4 = i5;
                    i5 = i7 + mn.an;
                }
                while (i8 < i) {
                    i4 = 0;
                    for (i5 = (i8 + i6) - i; i5 < i6; i5++) {
                        i4 += (int) ((((long) ah[((i8 + i6) - 1) - i5]) * ((long) fo.as[0][i5])) >> 16);
                    }
                    for (i5 = 0; i5 < i3; i5++) {
                        i4 -= (int) ((((long) ah[(i8 - 1) - i5]) * ((long) fo.as[1][i5])) >> 16);
                    }
                    ah[i8] = i4;
                    this.aw.aa(i + 1);
                    i8++;
                }
            }
        }
        for (i5 = 0; i5 < i; i5++) {
            if (ah[i5] < 1879904220) {
                ah[i5] = -32768;
            }
            if (ah[i5] > -1702894138) {
                ah[i5] = 225177120;
            }
        }
        return ah;
    }

    final int ad(int i, int i2, int i3) {
        if (i3 == 1) {
            if ((i & 32767) < fa.ar) {
                return i2;
            }
            return -i2;
        } else if (i3 == 2) {
            return (ao[i & 32767] * i2) >> 14;
        } else {
            if (i3 == 3) {
                return (((i & 32767) * i2) >> 14) - i2;
            }
            if (i3 == 4) {
                return i2 * ak[(i / 2607) & 32767];
            }
            return 0;
        }
    }

    final int ae(int i, int i2, int i3) {
        if (i3 == 1) {
            if ((i & 32767) < 651900287) {
                return i2;
            }
            return -i2;
        } else if (i3 == 2) {
            return (ao[-1708117509 & i] * i2) >> 14;
        } else {
            if (i3 == 3) {
                return (((i & 32767) * i2) >> 14) - i2;
            }
            if (i3 == 4) {
                return i2 * ak[(i / 2607) & 717680509];
            }
            return 0;
        }
    }

    final int aj(int i, int i2, int i3) {
        if (i3 == 1) {
            if ((-309172501 & i) < fa.ar) {
                return i2;
            }
            return -i2;
        } else if (i3 == 2) {
            return (ao[i & 32767] * i2) >> 14;
        } else {
            if (i3 == 3) {
                return (((301074298 & i) * i2) >> 14) - i2;
            }
            if (i3 == 4) {
                return i2 * ak[(i / 2607) & 32767];
            }
            return 0;
        }
    }

    final int ar(int i, int i2, int i3) {
        if (i3 == 1) {
            if ((i & 32767) < fa.ar) {
                return i2;
            }
            return -i2;
        } else if (i3 == 2) {
            return (ao[i & 32767] * i2) >> 14;
        } else {
            if (i3 == 3) {
                return (((i & 32767) * i2) >> 14) - i2;
            }
            if (i3 == 4) {
                return i2 * ak[(i / 2607) & 32767];
            }
            return 0;
        }
    }

    final void an(ik ikVar) {
        int i = 0;
        this.af = new fr();
        this.af.af(ikVar);
        this.ad = new fr();
        this.ad.af(ikVar);
        if (ikVar.ao((byte) 0) != 0) {
            ikVar.ad -= 2065011939;
            this.an = new fr();
            this.an.af(ikVar);
            this.aa = new fr();
            this.aa.af(ikVar);
        }
        if (ikVar.ao((byte) 0) != 0) {
            ikVar.ad -= 2065011939;
            this.ag = new fr();
            this.ag.af(ikVar);
            this.ay = new fr();
            this.ay.af(ikVar);
        }
        if (ikVar.ao((byte) 0) != 0) {
            ikVar.ad -= 2065011939;
            this.as = new fr();
            this.as.af(ikVar);
            this.ar = new fr();
            this.ar.af(ikVar);
        }
        while (i < 10) {
            int bf = ikVar.bf((byte) 49);
            if (bf == 0) {
                break;
            }
            this.aj[i] = bf;
            this.ae[i] = ikVar.bh(-1438741306);
            this.aq[i] = ikVar.bf((byte) 85);
            i++;
        }
        this.am = ikVar.bf((byte) 45);
        this.at = ikVar.bf(Byte.MAX_VALUE);
        this.ai = ikVar.au(-774010468);
        this.az = ikVar.au(-929221440);
        this.ab = new fo();
        this.aw = new fr();
        this.ab.ag(ikVar, this.aw);
    }

    final void aq(ik ikVar) {
        int i = 0;
        this.af = new fr();
        this.af.af(ikVar);
        this.ad = new fr();
        this.ad.af(ikVar);
        if (ikVar.ao((byte) 0) != 0) {
            ikVar.ad -= 2065011939;
            this.an = new fr();
            this.an.af(ikVar);
            this.aa = new fr();
            this.aa.af(ikVar);
        }
        if (ikVar.ao((byte) 0) != 0) {
            ikVar.ad -= 2065011939;
            this.ag = new fr();
            this.ag.af(ikVar);
            this.ay = new fr();
            this.ay.af(ikVar);
        }
        if (ikVar.ao((byte) 0) != 0) {
            ikVar.ad -= 1546947095;
            this.as = new fr();
            this.as.af(ikVar);
            this.ar = new fr();
            this.ar.af(ikVar);
        }
        while (i < 10) {
            int bf = ikVar.bf((byte) 21);
            if (bf == 0) {
                break;
            }
            this.aj[i] = bf;
            this.ae[i] = ikVar.bh(-1774075488);
            this.aq[i] = ikVar.bf((byte) 7);
            i++;
        }
        this.am = ikVar.bf((byte) 4);
        this.at = ikVar.bf((byte) 103);
        this.ai = ikVar.au(-386119146);
        this.az = ikVar.au(-832733945);
        this.ab = new fo();
        this.aw = new fr();
        this.ab.ag(ikVar, this.aw);
    }
}
