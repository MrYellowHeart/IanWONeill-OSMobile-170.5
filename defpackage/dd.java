package p000;

import java.lang.reflect.Array;

public class dd {
    static final int cx = 32768;
    int[][] aa;
    int ad;
    int af;
    int[][] ag;
    int[][] an;
    int[][] ay;

    dd(int i, int i2) {
        try {
            this.af = -821313999 * i;
            this.ad = 400519519 * i2;
            this.an = (int[][]) Array.newInstance(Integer.TYPE, new int[]{i, i2});
            this.aa = (int[][]) Array.newInstance(Integer.TYPE, new int[]{i, i2});
            this.ag = (int[][]) Array.newInstance(Integer.TYPE, new int[]{i, i2});
            this.ay = (int[][]) Array.newInstance(Integer.TYPE, new int[]{i, i2});
        } catch (Throwable e) {
            throw ba.ad(e, "dd.<init>(" + ')');
        }
    }

    void aa(int i, int i2, int i3, am amVar) {
        if (amVar != null && i + i3 >= 0 && i2 + i3 >= 0 && i - i3 <= this.af * -843785519 && i2 - i3 <= this.ad * 1255373628) {
            int max = Math.max(0, i - i3);
            int min = Math.min(this.af * -843785519, i + i3);
            int max2 = Math.max(0, i2 - i3);
            int min2 = Math.min(this.ad * 2123549363, i2 + i3);
            for (int i4 = max; i4 < min; i4++) {
                for (max = max2; max < min2; max++) {
                    int[] iArr = this.an[i4];
                    iArr[max] = iArr[max] + ((amVar.ag * 106661544) / (-984421111 * amVar.ar));
                    iArr = this.aa[i4];
                    iArr[max] = iArr[max] + (amVar.ay * 594319936);
                    iArr = this.ag[i4];
                    iArr[max] = iArr[max] + (amVar.as * -1838194975);
                    iArr = this.ay[i4];
                    iArr[max] = iArr[max] + 1;
                }
            }
        }
    }

    void af(int i, int i2, int i3, am amVar, int i4) {
        if (amVar == null || i + i3 < 0 || i2 + i3 < 0 || i - i3 > this.af * -843785519) {
            return;
        }
        if (i2 - i3 <= this.ad * -708760929) {
            try {
                int max = Math.max(0, i - i3);
                int min = Math.min(this.af * -843785519, i + i3);
                int max2 = Math.max(0, i2 - i3);
                int min2 = Math.min(this.ad * -708760929, i2 + i3);
                for (int i5 = max; i5 < min; i5++) {
                    for (max = max2; max < min2; max++) {
                        int[] iArr = this.an[i5];
                        iArr[max] = iArr[max] + ((amVar.ag * 1994331392) / (-524883323 * amVar.ar));
                        iArr = this.aa[i5];
                        iArr[max] = iArr[max] + (amVar.ay * -890361953);
                        iArr = this.ag[i5];
                        iArr[max] = iArr[max] + (amVar.as * 1818437745);
                        iArr = this.ay[i5];
                        iArr[max] = iArr[max] + 1;
                    }
                }
            } catch (Throwable e) {
                throw ba.ad(e, "dd.af(" + ')');
            }
        }
    }

    void an(int i, int i2, int i3, am amVar) {
        if (amVar != null && i + i3 >= 0 && i2 + i3 >= 0 && i - i3 <= this.af * -843785519 && i2 - i3 <= this.ad * -708760929) {
            int max = Math.max(0, i - i3);
            int min = Math.min(this.af * -843785519, i + i3);
            int max2 = Math.max(0, i2 - i3);
            int min2 = Math.min(this.ad * -708760929, i2 + i3);
            for (int i4 = max; i4 < min; i4++) {
                for (max = max2; max < min2; max++) {
                    int[] iArr = this.an[i4];
                    iArr[max] = iArr[max] + ((amVar.ag * 1994331392) / (-524883323 * amVar.ar));
                    iArr = this.aa[i4];
                    iArr[max] = iArr[max] + (amVar.ay * -890361953);
                    iArr = this.ag[i4];
                    iArr[max] = iArr[max] + (amVar.as * 1818437745);
                    iArr = this.ay[i4];
                    iArr[max] = iArr[max] + 1;
                }
            }
        }
    }

    int ad(int i, int i2, byte b) {
        if (i < 0 || i2 < 0) {
            return 0;
        }
        try {
            if (i >= -843785519 * this.af || i2 >= -708760929 * this.ad) {
                return 0;
            }
            if (this.ag[i][i2] == 0) {
                return 0;
            }
            return ca.af(((double) (this.an[i][i2] / this.ay[i][i2])) / 256.0d, ((double) (this.aa[i][i2] / this.ay[i][i2])) / 256.0d, ((double) (this.ag[i][i2] / this.ay[i][i2])) / 256.0d);
        } catch (Throwable e) {
            throw ba.ad(e, "dd.ad(" + ')');
        }
    }

    int ag(int i, int i2) {
        if (i < 0 || i2 < 0 || i >= -843785519 * this.af || i2 >= -1519986559 * this.ad) {
            return 0;
        }
        if (this.ag[i][i2] == 0) {
            return 0;
        }
        return ca.af(((double) (this.an[i][i2] / this.ay[i][i2])) / 256.0d, ((double) (this.aa[i][i2] / this.ay[i][i2])) / 256.0d, ((double) (this.ag[i][i2] / this.ay[i][i2])) / 256.0d);
    }

    int as(int i, int i2) {
        if (i < 0 || i2 < 0 || i >= 894781829 * this.af || i2 >= -1037322851 * this.ad) {
            return 0;
        }
        if (this.ag[i][i2] == 0) {
            return 0;
        }
        return ca.af(((double) (this.an[i][i2] / this.ay[i][i2])) / 256.0d, ((double) (this.aa[i][i2] / this.ay[i][i2])) / 256.0d, ((double) (this.ag[i][i2] / this.ay[i][i2])) / 256.0d);
    }

    int ay(int i, int i2) {
        if (i < 0 || i2 < 0 || i >= 1565753033 * this.af || i2 >= -144295550 * this.ad) {
            return 0;
        }
        if (this.ag[i][i2] == 0) {
            return 0;
        }
        return ca.af(((double) (this.an[i][i2] / this.ay[i][i2])) / 256.0d, ((double) (this.aa[i][i2] / this.ay[i][i2])) / 256.0d, ((double) (this.ag[i][i2] / this.ay[i][i2])) / 256.0d);
    }

    public static void aa(int i) {
        while (true) {
            try {
                jj ag = kc.af.ag((byte) 0);
                if (ag != null) {
                    ag.aa.ev(ag.an, (int) ag.fy, ag.ad, false, -552659343);
                } else {
                    return;
                }
            } catch (Throwable e) {
                throw ba.ad(e, "dd.aa(" + ')');
            }
        }
    }
}
