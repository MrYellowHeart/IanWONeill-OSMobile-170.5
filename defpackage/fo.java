package p000;

import java.lang.reflect.Array;

public class fo {
    static final int ad = 4;
    static final float ae = 100.0f;
    static int aj = 0;
    static final float am = 32.703197f;
    static final float aq = 8.0f;
    static float ar;
    static int[][] as = ((int[][]) Array.newInstance(Integer.TYPE, new int[]{2, 8}));
    static float[][] ay = ((float[][]) Array.newInstance(Float.TYPE, new int[]{2, 8}));
    int[][][] aa = ((int[][][]) Array.newInstance(Integer.TYPE, new int[]{2, 2, 4}));
    int[] af = new int[2];
    int[] ag = new int[2];
    int[][][] an = ((int[][][]) Array.newInstance(Integer.TYPE, new int[]{2, 2, 4}));

    fo() {
    }

    float af(int i, int i2, float f) {
        return 1.0f - ((float) Math.pow(10.0d, (double) ((-((((float) this.aa[i][0][i2]) + (((float) (this.aa[i][1][i2] - this.aa[i][0][i2])) * f)) * 0.0015258789f)) / 20.0f)));
    }

    float aj(int i, int i2, float f) {
        return 1.0f - ((float) Math.pow(10.0d, (double) ((-((((float) this.aa[i][0][i2]) + (((float) (this.aa[i][1][i2] - this.aa[i][0][i2])) * f)) * 0.0015258789f)) / 20.0f)));
    }

    float ar(int i, int i2, float f) {
        return 1.0f - ((float) Math.pow(10.0d, (double) ((-((((float) this.aa[i][0][i2]) + (((float) (this.aa[i][1][i2] - this.aa[i][0][i2])) * f)) * 0.0015258789f)) / 20.0f)));
    }

    float as(int i, int i2, float f) {
        return 1.0f - ((float) Math.pow(10.0d, (double) ((-((((float) this.aa[i][0][i2]) + (((float) (this.aa[i][1][i2] - this.aa[i][0][i2])) * f)) * 0.0015258789f)) / 20.0f)));
    }

    float ay(int i, int i2, float f) {
        return 1.0f - ((float) Math.pow(10.0d, (double) ((-((((float) this.aa[i][0][i2]) + (((float) (this.aa[i][1][i2] - this.aa[i][0][i2])) * f)) * 0.0015258789f)) / 20.0f)));
    }

    static float ad(float f) {
        return ((am * ((float) Math.pow(2.0d, (double) f))) * 3.1415927f) / 11025.0f;
    }

    static float ae(float f) {
        return ((am * ((float) Math.pow(2.0d, (double) f))) * 3.1415927f) / 11025.0f;
    }

    float ab(int i, int i2, float f) {
        return fo.ad((((float) this.an[i][0][i2]) + (((float) (this.an[i][1][i2] - this.an[i][0][i2])) * f)) * 1.2207031E-4f);
    }

    float am(int i, int i2, float f) {
        return fo.ad((((float) this.an[i][0][i2]) + (((float) (this.an[i][1][i2] - this.an[i][0][i2])) * f)) * 1.2207031E-4f);
    }

    float an(int i, int i2, float f) {
        return fo.ad((((float) this.an[i][0][i2]) + (((float) (this.an[i][1][i2] - this.an[i][0][i2])) * f)) * 1.2207031E-4f);
    }

    float aq(int i, int i2, float f) {
        return fo.ad((((float) this.an[i][0][i2]) + (((float) (this.an[i][1][i2] - this.an[i][0][i2])) * f)) * 1.2207031E-4f);
    }

    float at(int i, int i2, float f) {
        return fo.ad((((float) this.an[i][0][i2]) + (((float) (this.an[i][1][i2] - this.an[i][0][i2])) * f)) * 1.2207031E-4f);
    }

    int aa(int i, float f) {
        int i2 = 0;
        if (i == 0) {
            ar = (float) Math.pow(0.1d, (double) (((((float) this.ag[0]) + (((float) (this.ag[1] - this.ag[0])) * f)) * 0.0030517578f) / 20.0f));
            aj = (int) (ar * 65536.0f);
        }
        if (this.af[i] == 0) {
            return 0;
        }
        int i3;
        float af = af(i, 0, f);
        ay[i][0] = (-2.0f * af) * ((float) Math.cos((double) an(i, 0, f)));
        ay[i][1] = af * af;
        for (i3 = 1; i3 < this.af[i]; i3++) {
            float af2 = af(i, i3, f);
            float cos = (-2.0f * af2) * ((float) Math.cos((double) an(i, i3, f)));
            float f2 = af2 * af2;
            ay[i][(i3 * 2) + 1] = ay[i][(i3 * 2) - 1] * f2;
            ay[i][i3 * 2] = (ay[i][(i3 * 2) - 1] * cos) + (ay[i][(i3 * 2) - 2] * f2);
            for (int i4 = (i3 * 2) - 1; i4 >= 2; i4--) {
                float[] fArr = ay[i];
                fArr[i4] = fArr[i4] + ((ay[i][i4 - 1] * cos) + (ay[i][i4 - 2] * f2));
            }
            float[] fArr2 = ay[i];
            fArr2[1] = (f2 + (ay[i][0] * cos)) + fArr2[1];
            fArr2 = ay[i];
            fArr2[0] = cos + fArr2[0];
        }
        if (i == 0) {
            for (i3 = 0; i3 < this.af[0] * 2; i3++) {
                float[] fArr3 = ay[0];
                fArr3[i3] = fArr3[i3] * ar;
            }
        }
        while (i2 < this.af[i] * 2) {
            as[i][i2] = (int) (ay[i][i2] * 65536.0f);
            i2++;
        }
        return this.af[i] * 2;
    }

    int ai(int i, float f) {
        if (i == 0) {
            ar = (float) Math.pow(0.1d, (double) (((((float) this.ag[0]) + (((float) (this.ag[1] - this.ag[0])) * f)) * 0.0030517578f) / 20.0f));
            aj = (int) (ar * 65536.0f);
        }
        if (this.af[i] == 0) {
            return 0;
        }
        int i2;
        float af = af(i, 0, f);
        ay[i][0] = (-2.0f * af) * ((float) Math.cos((double) an(i, 0, f)));
        ay[i][1] = af * af;
        for (i2 = 1; i2 < this.af[i]; i2++) {
            float af2 = af(i, i2, f);
            float cos = (-2.0f * af2) * ((float) Math.cos((double) an(i, i2, f)));
            float f2 = af2 * af2;
            ay[i][(i2 * 2) + 1] = ay[i][(i2 * 2) - 1] * f2;
            ay[i][i2 * 2] = (ay[i][(i2 * 2) - 1] * cos) + (ay[i][(i2 * 2) - 2] * f2);
            for (int i3 = (i2 * 2) - 1; i3 >= 2; i3--) {
                float[] fArr = ay[i];
                fArr[i3] = fArr[i3] + ((ay[i][i3 - 1] * cos) + (ay[i][i3 - 2] * f2));
            }
            float[] fArr2 = ay[i];
            fArr2[1] = (f2 + (ay[i][0] * cos)) + fArr2[1];
            fArr2 = ay[i];
            fArr2[0] = cos + fArr2[0];
        }
        if (i == 0) {
            for (i2 = 0; i2 < this.af[0] * 2; i2++) {
                float[] fArr3 = ay[0];
                fArr3[i2] = fArr3[i2] * ar;
            }
        }
        for (i2 = 0; i2 < this.af[i] * 2; i2++) {
            as[i][i2] = (int) (ay[i][i2] * 65536.0f);
        }
        return this.af[i] * 2;
    }

    int aw(int i, float f) {
        int i2 = 0;
        if (i == 0) {
            ar = (float) Math.pow(0.1d, (double) (((((float) this.ag[0]) + (((float) (this.ag[1] - this.ag[0])) * f)) * 0.0030517578f) / 20.0f));
            aj = (int) (ar * 65536.0f);
        }
        if (this.af[i] == 0) {
            return 0;
        }
        int i3;
        float af = af(i, 0, f);
        ay[i][0] = (-2.0f * af) * ((float) Math.cos((double) an(i, 0, f)));
        ay[i][1] = af * af;
        for (i3 = 1; i3 < this.af[i]; i3++) {
            float af2 = af(i, i3, f);
            float cos = (-2.0f * af2) * ((float) Math.cos((double) an(i, i3, f)));
            float f2 = af2 * af2;
            ay[i][(i3 * 2) + 1] = ay[i][(i3 * 2) - 1] * f2;
            ay[i][i3 * 2] = (ay[i][(i3 * 2) - 1] * cos) + (ay[i][(i3 * 2) - 2] * f2);
            for (int i4 = (i3 * 2) - 1; i4 >= 2; i4--) {
                float[] fArr = ay[i];
                fArr[i4] = fArr[i4] + ((ay[i][i4 - 1] * cos) + (ay[i][i4 - 2] * f2));
            }
            float[] fArr2 = ay[i];
            fArr2[1] = (f2 + (ay[i][0] * cos)) + fArr2[1];
            fArr2 = ay[i];
            fArr2[0] = cos + fArr2[0];
        }
        if (i == 0) {
            for (i3 = 0; i3 < this.af[0] * 2; i3++) {
                float[] fArr3 = ay[0];
                fArr3[i3] = fArr3[i3] * ar;
            }
        }
        while (i2 < this.af[i] * 2) {
            as[i][i2] = (int) (ay[i][i2] * 65536.0f);
            i2++;
        }
        return this.af[i] * 2;
    }

    int az(int i, float f) {
        int i2 = 0;
        if (i == 0) {
            ar = (float) Math.pow(0.1d, (double) (((((float) this.ag[0]) + (((float) (this.ag[1] - this.ag[0])) * f)) * 0.0030517578f) / 20.0f));
            aj = (int) (ar * 65536.0f);
        }
        if (this.af[i] == 0) {
            return 0;
        }
        int i3;
        float af = af(i, 0, f);
        ay[i][0] = (-2.0f * af) * ((float) Math.cos((double) an(i, 0, f)));
        ay[i][1] = af * af;
        for (i3 = 1; i3 < this.af[i]; i3++) {
            float af2 = af(i, i3, f);
            float cos = (-2.0f * af2) * ((float) Math.cos((double) an(i, i3, f)));
            float f2 = af2 * af2;
            ay[i][(i3 * 2) + 1] = ay[i][(i3 * 2) - 1] * f2;
            ay[i][i3 * 2] = (ay[i][(i3 * 2) - 1] * cos) + (ay[i][(i3 * 2) - 2] * f2);
            for (int i4 = (i3 * 2) - 1; i4 >= 2; i4--) {
                float[] fArr = ay[i];
                fArr[i4] = fArr[i4] + ((ay[i][i4 - 1] * cos) + (ay[i][i4 - 2] * f2));
            }
            float[] fArr2 = ay[i];
            fArr2[1] = (f2 + (ay[i][0] * cos)) + fArr2[1];
            fArr2 = ay[i];
            fArr2[0] = cos + fArr2[0];
        }
        if (i == 0) {
            for (i3 = 0; i3 < this.af[0] * 2; i3++) {
                float[] fArr3 = ay[0];
                fArr3[i3] = fArr3[i3] * ar;
            }
        }
        while (i2 < this.af[i] * 2) {
            as[i][i2] = (int) (ay[i][i2] * 65536.0f);
            i2++;
        }
        return this.af[i] * 2;
    }

    final void ag(ik ikVar, fr frVar) {
        int ao = ikVar.ao((byte) 0);
        this.af[0] = ao >> 4;
        this.af[1] = ao & 15;
        if (ao != 0) {
            int i;
            this.ag[0] = ikVar.au(-185589846);
            this.ag[1] = ikVar.au(-378949628);
            int ao2 = ikVar.ao((byte) 0);
            for (i = 0; i < 2; i++) {
                for (ao = 0; ao < this.af[i]; ao++) {
                    this.an[i][0][ao] = ikVar.au(-2103356637);
                    this.aa[i][0][ao] = ikVar.au(-325486023);
                }
            }
            for (i = 0; i < 2; i++) {
                for (ao = 0; ao < this.af[i]; ao++) {
                    if ((((1 << (i * 4)) << ao) & ao2) != 0) {
                        this.an[i][1][ao] = ikVar.au(969951193);
                        this.aa[i][1][ao] = ikVar.au(-618442757);
                    } else {
                        this.an[i][1][ao] = this.an[i][0][ao];
                        this.aa[i][1][ao] = this.aa[i][0][ao];
                    }
                }
            }
            if (ao2 != 0 || this.ag[1] != this.ag[0]) {
                frVar.ad(ikVar);
                return;
            }
            return;
        }
        int[] iArr = this.ag;
        this.ag[1] = 0;
        iArr[0] = 0;
    }

    final void ah(ik ikVar, fr frVar) {
        int ao = ikVar.ao((byte) 0);
        this.af[0] = ao >> 4;
        this.af[1] = ao & 15;
        if (ao != 0) {
            int i;
            this.ag[0] = ikVar.au(397002064);
            this.ag[1] = ikVar.au(-362406028);
            int ao2 = ikVar.ao((byte) 0);
            for (i = 0; i < 2; i++) {
                for (ao = 0; ao < this.af[i]; ao++) {
                    this.an[i][0][ao] = ikVar.au(-1248772446);
                    this.aa[i][0][ao] = ikVar.au(1916875411);
                }
            }
            for (i = 0; i < 2; i++) {
                for (ao = 0; ao < this.af[i]; ao++) {
                    if ((((1 << (i * 4)) << ao) & ao2) != 0) {
                        this.an[i][1][ao] = ikVar.au(-209366251);
                        this.aa[i][1][ao] = ikVar.au(861047320);
                    } else {
                        this.an[i][1][ao] = this.an[i][0][ao];
                        this.aa[i][1][ao] = this.aa[i][0][ao];
                    }
                }
            }
            if (ao2 != 0 || this.ag[1] != this.ag[0]) {
                frVar.ad(ikVar);
                return;
            }
            return;
        }
        int[] iArr = this.ag;
        this.ag[1] = 0;
        iArr[0] = 0;
    }
}
