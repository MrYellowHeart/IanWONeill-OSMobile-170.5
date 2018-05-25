package p000;

import java.lang.reflect.Array;

public class fk {
    int[] aa;
    int ad = fp.aa(24);
    int af = fp.aa(16);
    float[][] ag;
    int[] an = new int[this.ad];
    int[] ay;

    static int af(int i, int i2) {
        int pow = ((int) Math.pow((double) i, 1.0d / ((double) i2))) + 1;
        while (ca.af(pow, i2, -238350737) > i) {
            pow--;
        }
        return pow;
    }

    static int ag(int i, int i2) {
        int pow = ((int) Math.pow((double) i, 1.0d / ((double) i2))) + 1;
        while (ca.af(pow, i2, 732095151) > i) {
            pow--;
        }
        return pow;
    }

    static int as(int i, int i2) {
        int pow = ((int) Math.pow((double) i, 1.0d / ((double) i2))) + 1;
        while (ca.af(pow, i2, -1019945222) > i) {
            pow--;
        }
        return pow;
    }

    static int ay(int i, int i2) {
        int pow = ((int) Math.pow((double) i, 1.0d / ((double) i2))) + 1;
        while (ca.af(pow, i2, -1187835063) > i) {
            pow--;
        }
        return pow;
    }

    fk() {
        Object obj;
        int aa;
        int aa2;
        int i;
        int i2;
        Object obj2;
        fp.aa(24);
        if (fp.an() != 0) {
            obj = 1;
        } else {
            obj = null;
        }
        int i3;
        if (obj != null) {
            aa = fp.aa(5) + 1;
            i3 = 0;
            while (i3 < this.ad) {
                aa2 = fp.aa(fw.ad(this.ad - i3, (byte) 125));
                i = 0;
                while (i < aa2) {
                    i2 = i3 + 1;
                    this.an[i3] = aa;
                    i++;
                    i3 = i2;
                }
                aa++;
            }
        } else {
            if (fp.an() != 0) {
                i3 = 1;
            } else {
                obj2 = null;
            }
            for (aa = 0; aa < this.ad; aa++) {
                if (obj2 == null || fp.an() != 0) {
                    this.an[aa] = fp.aa(5) + 1;
                } else {
                    this.an[aa] = 0;
                }
            }
        }
        ad();
        i2 = fp.aa(4);
        if (i2 > 0) {
            float af = fp.af(fp.aa(32));
            float af2 = fp.af(fp.aa(32));
            aa2 = fp.aa(4) + 1;
            if (fp.an() != 0) {
                obj2 = 1;
            } else {
                obj2 = null;
            }
            if (i2 == 1) {
                i = fk.af(this.ad, this.af);
            } else {
                i = this.ad * this.af;
            }
            this.aa = new int[i];
            for (aa = 0; aa < i; aa++) {
                this.aa[aa] = fp.aa(aa2);
            }
            this.ag = (float[][]) Array.newInstance(Float.TYPE, new int[]{this.ad, this.af});
            if (i2 == 1) {
                for (aa = 0; aa < this.ad; aa++) {
                    aa2 = 1;
                    float f = 0.0f;
                    for (i2 = 0; i2 < this.af; i2++) {
                        float f2 = ((((float) this.aa[(aa / aa2) % i]) * af2) + af) + f;
                        this.ag[aa][i2] = f2;
                        if (obj2 != null) {
                            f = f2;
                        }
                        aa2 *= i;
                    }
                }
                return;
            }
            for (aa = 0; aa < this.ad; aa++) {
                i = this.af * aa;
                float f3 = 0.0f;
                for (int i4 = 0; i4 < this.af; i4++) {
                    float f4 = ((((float) this.aa[i]) * af2) + af) + f3;
                    this.ag[aa][i4] = f4;
                    if (obj2 != null) {
                        f3 = f4;
                    }
                    i++;
                }
            }
        }
    }

    void ad() {
        int i;
        int i2;
        int[] iArr = new int[this.ad];
        int[] iArr2 = new int[33];
        for (i = 0; i < this.ad; i++) {
            int i3;
            int i4;
            int i5;
            int i6;
            int i7 = this.an[i];
            if (i7 != 0) {
                i2 = 1 << (32 - i7);
                i3 = iArr2[i7];
                iArr[i] = i3;
                if ((i3 & i2) == 0) {
                    i2 |= i3;
                    i4 = i7 - 1;
                    while (i4 >= 1) {
                        i5 = iArr2[i4];
                        if (i5 != i3) {
                            break;
                        }
                        i6 = 1 << (32 - i4);
                        if ((i5 & i6) != 0) {
                            iArr2[i4] = iArr2[i4 - 1];
                            break;
                        } else {
                            iArr2[i4] = i5 | i6;
                            i4--;
                        }
                    }
                } else {
                    i2 = iArr2[i7 - 1];
                }
                iArr2[i7] = i2;
                for (i4 = i7 + 1; i4 <= 32; i4++) {
                    if (iArr2[i4] == i3) {
                        iArr2[i4] = i2;
                    }
                }
            }
        }
        this.ay = new int[8];
        i2 = 0;
        for (i = 0; i < this.ad; i++) {
            i3 = this.an[i];
            if (i3 != 0) {
                i5 = iArr[i];
                i4 = 0;
                for (i7 = 0; i7 < i3; i7++) {
                    int i8;
                    i6 = Integer.MIN_VALUE >>> i7;
                    if ((i5 & i6) != 0) {
                        if (this.ay[i4] == 0) {
                            this.ay[i4] = i2;
                        }
                        i4 = this.ay[i4];
                    } else {
                        i4++;
                    }
                    if (i4 >= this.ay.length) {
                        int[] iArr3 = new int[(this.ay.length * 2)];
                        for (i8 = 0; i8 < this.ay.length; i8++) {
                            iArr3[i8] = this.ay[i8];
                        }
                        this.ay = iArr3;
                    }
                    i8 = i6 >>> 1;
                }
                this.ay[i4] = i ^ -1;
                if (i4 >= i2) {
                    i2 = i4 + 1;
                }
            }
        }
    }

    void ar() {
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr = new int[this.ad];
        int[] iArr2 = new int[33];
        for (i = 0; i < this.ad; i++) {
            int i5;
            int i6;
            int i7 = this.an[i];
            if (i7 != 0) {
                i2 = 1 << (32 - i7);
                i5 = iArr2[i7];
                iArr[i] = i5;
                if ((i5 & i2) == 0) {
                    i2 |= i5;
                    i6 = i7 - 1;
                    while (i6 >= 1) {
                        i3 = iArr2[i6];
                        if (i3 != i5) {
                            break;
                        }
                        i4 = 1 << (32 - i6);
                        if ((i3 & i4) != 0) {
                            iArr2[i6] = iArr2[i6 - 1];
                            break;
                        } else {
                            iArr2[i6] = i3 | i4;
                            i6--;
                        }
                    }
                } else {
                    i2 = iArr2[i7 - 1];
                }
                iArr2[i7] = i2;
                for (i6 = i7 + 1; i6 <= 32; i6++) {
                    if (iArr2[i6] == i5) {
                        iArr2[i6] = i2;
                    }
                }
            }
        }
        this.ay = new int[8];
        i2 = 0;
        for (i = 0; i < this.ad; i++) {
            i5 = this.an[i];
            if (i5 != 0) {
                i3 = iArr[i];
                i6 = 0;
                for (i7 = 0; i7 < i5; i7++) {
                    int i8;
                    i4 = Integer.MIN_VALUE >>> i7;
                    if ((i3 & i4) != 0) {
                        if (this.ay[i6] == 0) {
                            this.ay[i6] = i2;
                        }
                        i6 = this.ay[i6];
                    } else {
                        i6++;
                    }
                    if (i6 >= this.ay.length) {
                        int[] iArr3 = new int[(this.ay.length * 2)];
                        for (i8 = 0; i8 < this.ay.length; i8++) {
                            iArr3[i8] = this.ay[i8];
                        }
                        this.ay = iArr3;
                    }
                    i8 = i4 >>> 1;
                }
                this.ay[i6] = i ^ -1;
                if (i6 >= i2) {
                    i2 = i6 + 1;
                }
            }
        }
    }

    int an() {
        int i = 0;
        while (this.ay[i] >= 0) {
            i = fp.an() != 0 ? this.ay[i] : i + 1;
        }
        return this.ay[i] ^ -1;
    }

    float[] aa() {
        return this.ag[an()];
    }

    float[] ae() {
        return this.ag[an()];
    }

    float[] aj() {
        return this.ag[an()];
    }

    float[] am() {
        return this.ag[an()];
    }

    float[] aq() {
        return this.ag[an()];
    }

    float[] at() {
        return this.ag[an()];
    }
}
