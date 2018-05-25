package p000;

import java.lang.reflect.Array;

public class cc {
    static final int ab = 50;
    static int ac = 0;
    public static boolean af = true;
    static int ah = 0;
    static int ai = 0;
    static int ak = 0;
    static int al = 0;
    static final int am = 64;
    static int ao = 0;
    static int ap = 0;
    static final int aq = 128;
    static final int at = 25;
    static int au = 0;
    static int av = 0;
    static int aw = 0;
    static int ax = 0;
    static int az = 0;
    static bp[][] ba = ((bp[][]) Array.newInstance(bp.class, new int[]{by, 500}));
    static int bb = 0;
    static int bc = 0;
    static bp[] bd = new bp[500];
    static final int be = 32;
    static int bf = 0;
    static cm[] bg = new cm[100];
    static boolean bh = false;
    static final int[] bi = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
    static final int[] bj = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
    static final int bk = 128;
    static int bl = 0;
    static final int[] bm = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
    static int[] bn = new int[by];
    static final int[] bo = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
    public static int bp = 0;
    static final int[] bq = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
    static final int[] br = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
    static kg bs = new kg();
    public static int bt = -1;
    static boolean bu = false;
    public static int bv = 0;
    static int bw;
    public static int bx = -1;
    static int by = 4;
    static int bz;
    static cn cc;
    static int cd;
    static int ch;
    static ch ci;
    static boolean[][] ck;
    static int cl;
    static int cm;
    static boolean[][][][] cn = ((boolean[][][][]) Array.newInstance(Boolean.TYPE, new int[]{8, 32, 51, 51}));
    static int cq;
    static int cs;
    static final int[] cv = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
    int aa;
    int ad;
    int[][][] ae;
    int[][][] ag;
    cm[] aj = new cm[5000];
    int an;
    int ar = 0;
    int as = 0;
    cv[][][] ay;
    int[][] co = new int[][]{new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, new int[]{1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, new int[]{0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, new int[]{0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new int[]{1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, new int[]{1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, new int[]{1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, new int[]{1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
    int[][] cy = new int[][]{new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new int[]{12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, new int[]{15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, new int[]{3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};

    public cc(int i, int i2, int i3, int[][][] iArr) {
        this.ad = i;
        this.an = i2;
        this.aa = i3;
        this.ay = (cv[][][]) Array.newInstance(cv.class, new int[]{i, i2, i3});
        this.ae = (int[][][]) Array.newInstance(Integer.TYPE, new int[]{i, i2 + 1, i3 + 1});
        this.ag = iArr;
        af();
    }

    public void af() {
        int i;
        int i2 = 0;
        for (i = 0; i < this.ad; i++) {
            int i3;
            for (i3 = 0; i3 < this.an; i3++) {
                for (int i4 = 0; i4 < this.aa; i4++) {
                    this.ay[i][i3][i4] = null;
                }
            }
        }
        for (i = 0; i < by; i++) {
            for (i3 = 0; i3 < bn[i]; i3++) {
                ba[i][i3] = null;
            }
            bn[i] = 0;
        }
        for (i = 0; i < this.ar; i++) {
            this.aj[i] = null;
        }
        this.ar = 0;
        while (i2 < bg.length) {
            bg[i2] = null;
            i2++;
        }
    }

    public void bo() {
        int i;
        int i2 = 0;
        for (i = 0; i < this.ad; i++) {
            int i3;
            for (i3 = 0; i3 < this.an; i3++) {
                for (int i4 = 0; i4 < this.aa; i4++) {
                    this.ay[i][i3][i4] = null;
                }
            }
        }
        for (i = 0; i < by; i++) {
            for (i3 = 0; i3 < bn[i]; i3++) {
                ba[i][i3] = null;
            }
            bn[i] = 0;
        }
        for (i = 0; i < this.ar; i++) {
            this.aj[i] = null;
        }
        this.ar = 0;
        while (i2 < bg.length) {
            bg[i2] = null;
            i2++;
        }
    }

    public void bq() {
        int i;
        int i2 = 0;
        for (i = 0; i < this.ad; i++) {
            int i3;
            for (i3 = 0; i3 < this.an; i3++) {
                for (int i4 = 0; i4 < this.aa; i4++) {
                    this.ay[i][i3][i4] = null;
                }
            }
        }
        for (i = 0; i < by; i++) {
            for (i3 = 0; i3 < bn[i]; i3++) {
                ba[i][i3] = null;
            }
            bn[i] = 0;
        }
        for (i = 0; i < this.ar; i++) {
            this.aj[i] = null;
        }
        this.ar = 0;
        while (i2 < bg.length) {
            bg[i2] = null;
            i2++;
        }
    }

    public void ad(int i) {
        this.as = i;
        for (int i2 = 0; i2 < this.an; i2++) {
            for (int i3 = 0; i3 < this.aa; i3++) {
                if (this.ay[i][i2][i3] == null) {
                    this.ay[i][i2][i3] = new cv(i, i2, i3);
                }
            }
        }
    }

    public void cc(int i) {
        this.as = i;
        for (int i2 = 0; i2 < this.an; i2++) {
            for (int i3 = 0; i3 < this.aa; i3++) {
                if (this.ay[i][i2][i3] == null) {
                    this.ay[i][i2][i3] = new cv(i, i2, i3);
                }
            }
        }
    }

    public void ci(int i) {
        this.as = i;
        for (int i2 = 0; i2 < this.an; i2++) {
            for (int i3 = 0; i3 < this.aa; i3++) {
                if (this.ay[i][i2][i3] == null) {
                    this.ay[i][i2][i3] = new cv(i, i2, i3);
                }
            }
        }
    }

    public void co(int i) {
        this.as = i;
        for (int i2 = 0; i2 < this.an; i2++) {
            for (int i3 = 0; i3 < this.aa; i3++) {
                if (this.ay[i][i2][i3] == null) {
                    this.ay[i][i2][i3] = new cv(i, i2, i3);
                }
            }
        }
    }

    public void cv(int i) {
        this.as = i;
        for (int i2 = 0; i2 < this.an; i2++) {
            for (int i3 = 0; i3 < this.aa; i3++) {
                if (this.ay[i][i2][i3] == null) {
                    this.ay[i][i2][i3] = new cv(i, i2, i3);
                }
            }
        }
    }

    public void an(int i, int i2) {
        cv cvVar = this.ay[0][i][i2];
        for (int i3 = 0; i3 < 3; i3++) {
            cv[] cvVarArr = this.ay[i3][i];
            cv cvVar2 = this.ay[i3 + 1][i][i2];
            cvVarArr[i2] = cvVar2;
            if (cvVar2 != null) {
                cvVar2.af -= -1480080031;
                for (int i4 = 0; i4 < cvVar2.aq * -1099785793; i4++) {
                    cm cmVar = cvVar2.am[i4];
                    if ((2 == ((int) (((cmVar.at * -966509501471514439L) >>> 14) & 3)) ? 1 : 0) != 0 && cmVar.an * 842696807 == i && cmVar.aj * -917866941 == i2) {
                        cmVar.af -= 1874059083;
                    }
                }
            }
        }
        if (this.ay[0][i][i2] == null) {
            this.ay[0][i][i2] = new cv(0, i, i2);
        }
        this.ay[0][i][i2].av = cvVar;
        this.ay[3][i][i2] = null;
    }

    public void cn(int i, int i2) {
        cv cvVar = this.ay[0][i][i2];
        for (int i3 = 0; i3 < 3; i3++) {
            cv[] cvVarArr = this.ay[i3][i];
            cv cvVar2 = this.ay[i3 + 1][i][i2];
            cvVarArr[i2] = cvVar2;
            if (cvVar2 != null) {
                cvVar2.af -= -1480080031;
                for (int i4 = 0; i4 < cvVar2.aq * -1099785793; i4++) {
                    int i5;
                    cm cmVar = cvVar2.am[i4];
                    if (2 == ((int) (((cmVar.at * -966509501471514439L) >>> 14) & 3))) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    if (i5 != 0 && cmVar.an * 842696807 == i && cmVar.aj * -917866941 == i2) {
                        cmVar.af -= 1874059083;
                    }
                }
            }
        }
        if (this.ay[0][i][i2] == null) {
            this.ay[0][i][i2] = new cv(0, i, i2);
        }
        this.ay[0][i][i2].av = cvVar;
        this.ay[3][i][i2] = null;
    }

    public void cy(int i, int i2) {
        cv cvVar = this.ay[0][i][i2];
        for (int i3 = 0; i3 < 3; i3++) {
            cv[] cvVarArr = this.ay[i3][i];
            cv cvVar2 = this.ay[i3 + 1][i][i2];
            cvVarArr[i2] = cvVar2;
            if (cvVar2 != null) {
                cvVar2.af -= -1480080031;
                for (int i4 = 0; i4 < cvVar2.aq * -1177483486; i4++) {
                    int i5;
                    cm cmVar = cvVar2.am[i4];
                    if (2 == ((int) (((cmVar.at * -966509501471514439L) >>> 14) & 3))) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    if (i5 != 0 && cmVar.an * 842696807 == i && cmVar.aj * -924461136 == i2) {
                        cmVar.af -= 1874059083;
                    }
                }
            }
        }
        if (this.ay[0][i][i2] == null) {
            this.ay[0][i][i2] = new cv(0, i, i2);
        }
        this.ay[0][i][i2].av = cvVar;
        this.ay[3][i][i2] = null;
    }

    public static void aa(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        bp bpVar = new bp();
        bpVar.af = (i3 / mn.an) * -1111010573;
        bpVar.ad = (i4 / mn.an) * -1527451699;
        bpVar.an = (i5 / mn.an) * -1483735801;
        bpVar.aa = (i6 / mn.an) * 1555958467;
        bpVar.ag = 1928591933 * i2;
        bpVar.ay = 1600090937 * i3;
        bpVar.as = -671462455 * i4;
        bpVar.ar = 690627571 * i5;
        bpVar.aj = -783869783 * i6;
        bpVar.ae = 221609521 * i7;
        bpVar.aq = 1500977157 * i8;
        bp[] bpVarArr = ba[i];
        int[] iArr = bn;
        int i9 = iArr[i];
        iArr[i] = i9 + 1;
        bpVarArr[i9] = bpVar;
    }

    public static void cd(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        bp bpVar = new bp();
        bpVar.af = (i3 / mn.an) * -29600918;
        bpVar.ad = (i4 / 2012545675) * -1959418061;
        bpVar.an = (i5 / -1207173364) * -1483735801;
        bpVar.aa = (i6 / mn.an) * 1555958467;
        bpVar.ag = 1928591933 * i2;
        bpVar.ay = 862465891 * i3;
        bpVar.as = -1099561021 * i4;
        bpVar.ar = -507257405 * i5;
        bpVar.aj = 869066168 * i6;
        bpVar.ae = 221609521 * i7;
        bpVar.aq = 1500977157 * i8;
        bp[] bpVarArr = ba[i];
        int[] iArr = bn;
        int i9 = iArr[i];
        iArr[i] = i9 + 1;
        bpVarArr[i9] = bpVar;
    }

    public static void ch(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        bp bpVar = new bp();
        bpVar.af = (i3 / mn.an) * -1111010573;
        bpVar.ad = (i4 / mn.an) * -1527451699;
        bpVar.an = (i5 / mn.an) * -1483735801;
        bpVar.aa = (i6 / mn.an) * 1555958467;
        bpVar.ag = 1928591933 * i2;
        bpVar.ay = 1600090937 * i3;
        bpVar.as = -671462455 * i4;
        bpVar.ar = 690627571 * i5;
        bpVar.aj = -783869783 * i6;
        bpVar.ae = 221609521 * i7;
        bpVar.aq = 1500977157 * i8;
        bp[] bpVarArr = ba[i];
        int[] iArr = bn;
        int i9 = iArr[i];
        iArr[i] = i9 + 1;
        bpVarArr[i9] = bpVar;
    }

    public static void ck(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        bp bpVar = new bp();
        bpVar.af = (i3 / 410627108) * -1930960743;
        bpVar.ad = (i4 / 941768441) * 579936812;
        bpVar.an = (i5 / mn.an) * -1483735801;
        bpVar.aa = (i6 / mn.an) * 359131699;
        bpVar.ag = 1928591933 * i2;
        bpVar.ay = 1600090937 * i3;
        bpVar.as = -1283284760 * i4;
        bpVar.ar = 690627571 * i5;
        bpVar.aj = -783869783 * i6;
        bpVar.ae = 2080704789 * i7;
        bpVar.aq = 1500977157 * i8;
        bp[] bpVarArr = ba[i];
        int[] iArr = bn;
        int i9 = iArr[i];
        iArr[i] = i9 + 1;
        bpVarArr[i9] = bpVar;
    }

    public static void cl(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        bp bpVar = new bp();
        bpVar.af = (i3 / mn.an) * -1111010573;
        bpVar.ad = (i4 / mn.an) * -1527451699;
        bpVar.an = (i5 / mn.an) * -1483735801;
        bpVar.aa = (i6 / mn.an) * 1555958467;
        bpVar.ag = 1928591933 * i2;
        bpVar.ay = 1600090937 * i3;
        bpVar.as = -671462455 * i4;
        bpVar.ar = 690627571 * i5;
        bpVar.aj = -783869783 * i6;
        bpVar.ae = 221609521 * i7;
        bpVar.aq = 1500977157 * i8;
        bp[] bpVarArr = ba[i];
        int[] iArr = bn;
        int i9 = iArr[i];
        iArr[i] = i9 + 1;
        bpVarArr[i9] = bpVar;
    }

    public static void cs(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        bp bpVar = new bp();
        bpVar.af = (i3 / -669981783) * -1111010573;
        bpVar.ad = (i4 / 299508230) * -1527451699;
        bpVar.an = (i5 / mn.an) * -383790322;
        bpVar.aa = (i6 / mn.an) * -1718411089;
        bpVar.ag = -533442987 * i2;
        bpVar.ay = -1605748276 * i3;
        bpVar.as = -706057478 * i4;
        bpVar.ar = 690627571 * i5;
        bpVar.aj = -783869783 * i6;
        bpVar.ae = 221609521 * i7;
        bpVar.aq = -981372816 * i8;
        bp[] bpVarArr = ba[i];
        int[] iArr = bn;
        int i9 = iArr[i];
        iArr[i] = i9 + 1;
        bpVarArr[i9] = bpVar;
    }

    public void ag(int i, int i2, int i3, int i4) {
        if (this.ay[i][i2][i3] != null) {
            this.ay[i][i2][i3].aw = -2001281937 * i4;
        }
    }

    public void cj(int i, int i2, int i3, int i4) {
        if (this.ay[i][i2][i3] != null) {
            this.ay[i][i2][i3].aw = -2001281937 * i4;
        }
    }

    public void cm(int i, int i2, int i3, int i4) {
        if (this.ay[i][i2][i3] != null) {
            this.ay[i][i2][i3].aw = -2001281937 * i4;
        }
    }

    public void cp(int i, int i2, int i3, int i4) {
        if (this.ay[i][i2][i3] != null) {
            this.ay[i][i2][i3].aw = -2001281937 * i4;
        }
    }

    public void cq(int i, int i2, int i3, int i4) {
        if (this.ay[i][i2][i3] != null) {
            this.ay[i][i2][i3].aw = -2001281937 * i4;
        }
    }

    public void ay(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
        be beVar;
        int i21;
        if (i4 == 0) {
            beVar = new be(i11, i12, i13, i14, -1, i19, false);
            for (i21 = i; i21 >= 0; i21--) {
                if (this.ay[i21][i2][i3] == null) {
                    this.ay[i21][i2][i3] = new cv(i21, i2, i3);
                }
            }
            this.ay[i][i2][i3].ag = beVar;
        } else if (i4 == 1) {
            boolean z;
            if (i7 == i8 && i7 == i9 && i7 == i10) {
                z = true;
            } else {
                z = false;
            }
            beVar = new be(i15, i16, i17, i18, i6, i20, z);
            for (i21 = i; i21 >= 0; i21--) {
                if (this.ay[i21][i2][i3] == null) {
                    this.ay[i21][i2][i3] = new cv(i21, i2, i3);
                }
            }
            this.ay[i][i2][i3].ag = beVar;
        } else {
            bl blVar = new bl(i4, i5, i6, i2, i3, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20);
            for (i21 = i; i21 >= 0; i21--) {
                if (this.ay[i21][i2][i3] == null) {
                    this.ay[i21][i2][i3] = new cv(i21, i2, i3);
                }
            }
            this.ay[i][i2][i3].ay = blVar;
        }
    }

    public void cb(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
        be beVar;
        int i21;
        if (i4 == 0) {
            beVar = new be(i11, i12, i13, i14, -1, i19, false);
            for (i21 = i; i21 >= 0; i21--) {
                if (this.ay[i21][i2][i3] == null) {
                    this.ay[i21][i2][i3] = new cv(i21, i2, i3);
                }
            }
            this.ay[i][i2][i3].ag = beVar;
        } else if (i4 == 1) {
            boolean z;
            if (i7 == i8 && i7 == i9 && i7 == i10) {
                z = true;
            } else {
                z = false;
            }
            beVar = new be(i15, i16, i17, i18, i6, i20, z);
            for (i21 = i; i21 >= 0; i21--) {
                if (this.ay[i21][i2][i3] == null) {
                    this.ay[i21][i2][i3] = new cv(i21, i2, i3);
                }
            }
            this.ay[i][i2][i3].ag = beVar;
        } else {
            bl blVar = new bl(i4, i5, i6, i2, i3, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20);
            for (i21 = i; i21 >= 0; i21--) {
                if (this.ay[i21][i2][i3] == null) {
                    this.ay[i21][i2][i3] = new cv(i21, i2, i3);
                }
            }
            this.ay[i][i2][i3].ay = blVar;
        }
    }

    public void ct(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
        be beVar;
        int i21;
        if (i4 == 0) {
            beVar = new be(i11, i12, i13, i14, -1, i19, false);
            for (i21 = i; i21 >= 0; i21--) {
                if (this.ay[i21][i2][i3] == null) {
                    this.ay[i21][i2][i3] = new cv(i21, i2, i3);
                }
            }
            this.ay[i][i2][i3].ag = beVar;
        } else if (i4 == 1) {
            boolean z;
            if (i7 == i8 && i7 == i9 && i7 == i10) {
                z = true;
            } else {
                z = false;
            }
            beVar = new be(i15, i16, i17, i18, i6, i20, z);
            for (i21 = i; i21 >= 0; i21--) {
                if (this.ay[i21][i2][i3] == null) {
                    this.ay[i21][i2][i3] = new cv(i21, i2, i3);
                }
            }
            this.ay[i][i2][i3].ag = beVar;
        } else {
            bl blVar = new bl(i4, i5, i6, i2, i3, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20);
            for (i21 = i; i21 >= 0; i21--) {
                if (this.ay[i21][i2][i3] == null) {
                    this.ay[i21][i2][i3] = new cv(i21, i2, i3);
                }
            }
            this.ay[i][i2][i3].ay = blVar;
        }
    }

    public void as(int i, int i2, int i3, int i4, cq cqVar, long j, int i5) {
        if (cqVar != null) {
            bx bxVar = new bx();
            bxVar.aa = cqVar;
            bxVar.ad = (1112341120 * i2) - 1591313088;
            bxVar.an = (-348007808 * i3) + 1973479744;
            bxVar.af = -1310931091 * i4;
            bxVar.ag = -642653827845607863L * j;
            bxVar.ay = 1805267633 * i5;
            if (this.ay[i][i2][i3] == null) {
                this.ay[i][i2][i3] = new cv(i, i2, i3);
            }
            this.ay[i][i2][i3].aj = bxVar;
        }
    }

    public void cu(int i, int i2, int i3, int i4, cq cqVar, long j, int i5) {
        if (cqVar != null) {
            bx bxVar = new bx();
            bxVar.aa = cqVar;
            bxVar.ad = (1112341120 * i2) - 1591313088;
            bxVar.an = (-348007808 * i3) + 1973479744;
            bxVar.af = -1310931091 * i4;
            bxVar.ag = -642653827845607863L * j;
            bxVar.ay = 1805267633 * i5;
            if (this.ay[i][i2][i3] == null) {
                this.ay[i][i2][i3] = new cv(i, i2, i3);
            }
            this.ay[i][i2][i3].aj = bxVar;
        }
    }

    public void dj(int i, int i2, int i3, int i4, cq cqVar, long j, int i5) {
        if (cqVar != null) {
            bx bxVar = new bx();
            bxVar.aa = cqVar;
            bxVar.ad = (1112341120 * i2) - 426422565;
            bxVar.an = (-348007808 * i3) - 181198067;
            bxVar.af = -1310931091 * i4;
            bxVar.ag = -642653827845607863L * j;
            bxVar.ay = 935666535 * i5;
            if (this.ay[i][i2][i3] == null) {
                this.ay[i][i2][i3] = new cv(i, i2, i3);
            }
            this.ay[i][i2][i3].aj = bxVar;
        }
    }

    public void ar(int i, int i2, int i3, int i4, cq cqVar, long j, cq cqVar2, cq cqVar3) {
        int i5;
        bu buVar = new bu();
        buVar.aa = cqVar;
        buVar.ad = (-1211735424 * i2) + 1541615936;
        buVar.an = (511363200 * i3) + 255681600;
        buVar.af = -71448509 * i4;
        buVar.as = -2611225869286341753L * j;
        buVar.ag = cqVar2;
        buVar.ay = cqVar3;
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar != null) {
            i5 = 0;
            int i6 = 0;
            while (i6 < cvVar.aq * -1099785793) {
                if (((cvVar.am[i6].ab * 2101114947) & 256) == 256 && (cvVar.am[i6].ay instanceof cl)) {
                    cl clVar = (cl) cvVar.am[i6].ay;
                    clVar.ay();
                    if (clVar.bo * 1500767459 > i5) {
                        i5 = 1500767459 * clVar.bo;
                    }
                }
                i6++;
            }
        } else {
            i5 = 0;
        }
        buVar.ar = -228903567 * i5;
        if (this.ay[i][i2][i3] == null) {
            this.ay[i][i2][i3] = new cv(i, i2, i3);
        }
        this.ay[i][i2][i3].ae = buVar;
    }

    public void dc(int i, int i2, int i3, int i4, cq cqVar, long j, cq cqVar2, cq cqVar3) {
        bu buVar = new bu();
        buVar.aa = cqVar;
        buVar.ad = (-1211735424 * i2) + 1541615936;
        buVar.an = (511363200 * i3) + 255681600;
        buVar.af = -71448509 * i4;
        buVar.as = -2611225869286341753L * j;
        buVar.ag = cqVar2;
        buVar.ay = cqVar3;
        int i5 = 0;
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar != null) {
            int i6 = 0;
            int i7 = 0;
            while (i6 < cvVar.aq * -1099785793) {
                if (((cvVar.am[i6].ab * 2101114947) & 256) == 256 && (cvVar.am[i6].ay instanceof cl)) {
                    cl clVar = (cl) cvVar.am[i6].ay;
                    clVar.ay();
                    if (clVar.bo * 1500767459 > i7) {
                        i7 = 1500767459 * clVar.bo;
                    }
                }
                i6++;
            }
            i5 = i7;
        }
        buVar.ar = i5 * -228903567;
        if (this.ay[i][i2][i3] == null) {
            this.ay[i][i2][i3] = new cv(i, i2, i3);
        }
        this.ay[i][i2][i3].ae = buVar;
    }

    public void aj(int i, int i2, int i3, int i4, cq cqVar, cq cqVar2, int i5, int i6, long j, int i7) {
        if (cqVar != null || cqVar2 != null) {
            bs bsVar = new bs();
            bsVar.ar = -1117795098776039793L * j;
            bsVar.aj = 1665419935 * i7;
            bsVar.ad = (-1024016000 * i2) - 512008000;
            bsVar.an = (-2042158720 * i3) + 1126404288;
            bsVar.af = 1780910857 * i4;
            bsVar.ay = cqVar;
            bsVar.as = cqVar2;
            bsVar.aa = 292166751 * i5;
            bsVar.ag = -1392358473 * i6;
            for (int i8 = i; i8 >= 0; i8--) {
                if (this.ay[i8][i2][i3] == null) {
                    this.ay[i8][i2][i3] = new cv(i8, i2, i3);
                }
            }
            this.ay[i][i2][i3].as = bsVar;
        }
    }

    public void dk(int i, int i2, int i3, int i4, cq cqVar, cq cqVar2, int i5, int i6, long j, int i7) {
        if (cqVar != null || cqVar2 != null) {
            bs bsVar = new bs();
            bsVar.ar = -1117795098776039793L * j;
            bsVar.aj = -1699947294 * i7;
            bsVar.ad = (-1024016000 * i2) - 578902622;
            bsVar.an = (-2042158720 * i3) + 1126404288;
            bsVar.af = 1415922799 * i4;
            bsVar.ay = cqVar;
            bsVar.as = cqVar2;
            bsVar.aa = -932599277 * i5;
            bsVar.ag = 1247346765 * i6;
            for (int i8 = i; i8 >= 0; i8--) {
                if (this.ay[i8][i2][i3] == null) {
                    this.ay[i8][i2][i3] = new cv(i8, i2, i3);
                }
            }
            this.ay[i][i2][i3].as = bsVar;
        }
    }

    public void m1do(int i, int i2, int i3, int i4, cq cqVar, cq cqVar2, int i5, int i6, long j, int i7) {
        if (cqVar != null || cqVar2 != null) {
            bs bsVar = new bs();
            bsVar.ar = -1117795098776039793L * j;
            bsVar.aj = 1665419935 * i7;
            bsVar.ad = (-1024016000 * i2) - 512008000;
            bsVar.an = (-2042158720 * i3) + 1126404288;
            bsVar.af = 1780910857 * i4;
            bsVar.ay = cqVar;
            bsVar.as = cqVar2;
            bsVar.aa = 292166751 * i5;
            bsVar.ag = -1392358473 * i6;
            for (int i8 = i; i8 >= 0; i8--) {
                if (this.ay[i8][i2][i3] == null) {
                    this.ay[i8][i2][i3] = new cv(i8, i2, i3);
                }
            }
            this.ay[i][i2][i3].as = bsVar;
        }
    }

    public void dt(int i, int i2, int i3, int i4, cq cqVar, cq cqVar2, int i5, int i6, long j, int i7) {
        if (cqVar != null || cqVar2 != null) {
            bs bsVar = new bs();
            bsVar.ar = -1117795098776039793L * j;
            bsVar.aj = 1665419935 * i7;
            bsVar.ad = (-1024016000 * i2) - 512008000;
            bsVar.an = (-2042158720 * i3) + 1126404288;
            bsVar.af = 1780910857 * i4;
            bsVar.ay = cqVar;
            bsVar.as = cqVar2;
            bsVar.aa = 292166751 * i5;
            bsVar.ag = -1392358473 * i6;
            for (int i8 = i; i8 >= 0; i8--) {
                if (this.ay[i8][i2][i3] == null) {
                    this.ay[i8][i2][i3] = new cv(i8, i2, i3);
                }
            }
            this.ay[i][i2][i3].as = bsVar;
        }
    }

    public void dz(int i, int i2, int i3, int i4, cq cqVar, cq cqVar2, int i5, int i6, long j, int i7) {
        if (cqVar != null || cqVar2 != null) {
            bs bsVar = new bs();
            bsVar.ar = -1117795098776039793L * j;
            bsVar.aj = 1665419935 * i7;
            bsVar.ad = (-1024016000 * i2) - 512008000;
            bsVar.an = (-2042158720 * i3) + 1126404288;
            bsVar.af = 1780910857 * i4;
            bsVar.ay = cqVar;
            bsVar.as = cqVar2;
            bsVar.aa = 292166751 * i5;
            bsVar.ag = -1392358473 * i6;
            for (int i8 = i; i8 >= 0; i8--) {
                if (this.ay[i8][i2][i3] == null) {
                    this.ay[i8][i2][i3] = new cv(i8, i2, i3);
                }
            }
            this.ay[i][i2][i3].as = bsVar;
        }
    }

    public void ae(int i, int i2, int i3, int i4, cq cqVar, cq cqVar2, int i5, int i6, int i7, int i8, long j, int i9) {
        if (cqVar != null) {
            bm bmVar = new bm();
            bmVar.ae = -3043122558899902989L * j;
            bmVar.aq = 656844555 * i9;
            bmVar.ad = (1829749120 * i2) + 914874560;
            bmVar.aa = (-1408678016 * i3) + 1443144640;
            bmVar.af = 235175479 * i4;
            bmVar.ar = cqVar;
            bmVar.aj = cqVar2;
            bmVar.ag = -1731002045 * i5;
            bmVar.ay = 1410311003 * i6;
            bmVar.an = -1494471547 * i7;
            bmVar.as = -259563451 * i8;
            for (int i10 = i; i10 >= 0; i10--) {
                if (this.ay[i10][i2][i3] == null) {
                    this.ay[i10][i2][i3] = new cv(i10, i2, i3);
                }
            }
            this.ay[i][i2][i3].ar = bmVar;
        }
    }

    public void dv(int i, int i2, int i3, int i4, cq cqVar, cq cqVar2, int i5, int i6, int i7, int i8, long j, int i9) {
        if (cqVar != null) {
            bm bmVar = new bm();
            bmVar.ae = -3043122558899902989L * j;
            bmVar.aq = 1188272553 * i9;
            bmVar.ad = (1829749120 * i2) + 914874560;
            bmVar.aa = (1073887614 * i3) + 1443144640;
            bmVar.af = 2083021077 * i4;
            bmVar.ar = cqVar;
            bmVar.aj = cqVar2;
            bmVar.ag = -2137646538 * i5;
            bmVar.ay = 153561113 * i6;
            bmVar.an = -1494471547 * i7;
            bmVar.as = -1325436133 * i8;
            for (int i10 = i; i10 >= 0; i10--) {
                if (this.ay[i10][i2][i3] == null) {
                    this.ay[i10][i2][i3] = new cv(i10, i2, i3);
                }
            }
            this.ay[i][i2][i3].ar = bmVar;
        }
    }

    public boolean aq(int i, int i2, int i3, int i4, int i5, int i6, cq cqVar, int i7, long j, int i8) {
        if (cqVar == null) {
            return true;
        }
        return ab(i, i2, i3, i5, i6, (i2 * mn.an) + (i5 * 64), (i3 * mn.an) + (i6 * 64), i4, cqVar, i7, false, j, i8);
    }

    public boolean dd(int i, int i2, int i3, int i4, int i5, int i6, cq cqVar, int i7, long j, int i8) {
        if (cqVar == null) {
            return true;
        }
        return ab(i, i2, i3, i5, i6, (-309994688 * i2) + (i5 * 64), (-1665610668 * i3) + (i6 * 64), i4, cqVar, i7, false, j, i8);
    }

    public boolean am(int i, int i2, int i3, int i4, int i5, cq cqVar, int i6, long j, boolean z) {
        if (cqVar == null) {
            return true;
        }
        int i7;
        int i8 = i2 - i5;
        int i9 = i3 - i5;
        int i10 = i2 + i5;
        int i11 = i3 + i5;
        if (z) {
            if (i6 > 640 && i6 < 1408) {
                i11 += mn.an;
            }
            if (i6 > 1152 && i6 < 1920) {
                i10 += mn.an;
            }
            if (i6 > 1664 || i6 < 384) {
                i9 -= 128;
            }
            if (i6 > 128 && i6 < 896) {
                i7 = i9;
                i9 = i8 - 128;
                i8 = i7;
                i9 /= mn.an;
                i8 /= mn.an;
                return ab(i, i9, i8, ((i10 / mn.an) - i9) + 1, ((i11 / mn.an) - i8) + 1, i2, i3, i4, cqVar, i6, true, j, 0);
            }
        }
        i7 = i9;
        i9 = i8;
        i8 = i7;
        i9 /= mn.an;
        i8 /= mn.an;
        return ab(i, i9, i8, ((i10 / mn.an) - i9) + 1, ((i11 / mn.an) - i8) + 1, i2, i3, i4, cqVar, i6, true, j, 0);
    }

    public boolean da(int i, int i2, int i3, int i4, int i5, cq cqVar, int i6, long j, boolean z) {
        if (cqVar == null) {
            return true;
        }
        int i7;
        int i8 = i2 - i5;
        int i9 = i3 - i5;
        int i10 = i2 + i5;
        int i11 = i3 + i5;
        if (z) {
            if (i6 > 640 && i6 < 1408) {
                i11 += mn.an;
            }
            if (i6 > 1152 && i6 < 1920) {
                i10 += mn.an;
            }
            if (i6 > 1664 || i6 < 384) {
                i9 -= 128;
            }
            if (i6 > 128 && i6 < 896) {
                i7 = i9;
                i9 = i8 - 128;
                i8 = i7;
                i9 /= mn.an;
                i8 /= mn.an;
                return ab(i, i9, i8, ((i10 / mn.an) - i9) + 1, ((i11 / mn.an) - i8) + 1, i2, i3, i4, cqVar, i6, true, j, 0);
            }
        }
        i7 = i9;
        i9 = i8;
        i8 = i7;
        i9 /= mn.an;
        i8 /= mn.an;
        return ab(i, i9, i8, ((i10 / mn.an) - i9) + 1, ((i11 / mn.an) - i8) + 1, i2, i3, i4, cqVar, i6, true, j, 0);
    }

    public boolean di(int i, int i2, int i3, int i4, int i5, cq cqVar, int i6, long j, boolean z) {
        if (cqVar == null) {
            return true;
        }
        int i7;
        int i8 = i2 - i5;
        int i9 = i3 - i5;
        int i10 = i2 + i5;
        int i11 = i3 + i5;
        if (z) {
            if (i6 > 640 && i6 < 1408) {
                i11 += mn.an;
            }
            if (i6 > 1152 && i6 < 1920) {
                i10 += mn.an;
            }
            if (i6 > 1664 || i6 < 384) {
                i9 -= 128;
            }
            if (i6 > 128 && i6 < 896) {
                i7 = i9;
                i9 = i8 - 128;
                i8 = i7;
                i9 /= mn.an;
                i8 /= mn.an;
                return ab(i, i9, i8, ((i10 / mn.an) - i9) + 1, ((i11 / mn.an) - i8) + 1, i2, i3, i4, cqVar, i6, true, j, 0);
            }
        }
        i7 = i9;
        i9 = i8;
        i8 = i7;
        i9 /= mn.an;
        i8 /= mn.an;
        return ab(i, i9, i8, ((i10 / mn.an) - i9) + 1, ((i11 / mn.an) - i8) + 1, i2, i3, i4, cqVar, i6, true, j, 0);
    }

    public boolean dl(int i, int i2, int i3, int i4, int i5, cq cqVar, int i6, long j, boolean z) {
        if (cqVar == null) {
            return true;
        }
        int i7;
        int i8 = i2 - i5;
        int i9 = i3 - i5;
        int i10 = i2 + i5;
        int i11 = i3 + i5;
        if (z) {
            if (i6 > 640 && i6 < 1408) {
                i11 += mn.an;
            }
            if (i6 > 1152 && i6 < 1920) {
                i10 += mn.an;
            }
            if (i6 > 1664 || i6 < 384) {
                i9 -= 128;
            }
            if (i6 > 128 && i6 < 896) {
                i7 = i9;
                i9 = i8 - 128;
                i8 = i7;
                i9 /= mn.an;
                i8 /= mn.an;
                return ab(i, i9, i8, ((i10 / mn.an) - i9) + 1, ((i11 / mn.an) - i8) + 1, i2, i3, i4, cqVar, i6, true, j, 0);
            }
        }
        i7 = i9;
        i9 = i8;
        i8 = i7;
        i9 /= mn.an;
        i8 /= mn.an;
        return ab(i, i9, i8, ((i10 / mn.an) - i9) + 1, ((i11 / mn.an) - i8) + 1, i2, i3, i4, cqVar, i6, true, j, 0);
    }

    public boolean at(int i, int i2, int i3, int i4, int i5, cq cqVar, int i6, long j, int i7, int i8, int i9, int i10) {
        if (cqVar == null) {
            return true;
        }
        return ab(i, i7, i8, (i9 - i7) + 1, (i10 - i8) + 1, i2, i3, i4, cqVar, i6, true, j, 0);
    }

    public boolean de(int i, int i2, int i3, int i4, int i5, cq cqVar, int i6, long j, int i7, int i8, int i9, int i10) {
        if (cqVar == null) {
            return true;
        }
        return ab(i, i7, i8, (i9 - i7) + 1, (i10 - i8) + 1, i2, i3, i4, cqVar, i6, true, j, 0);
    }

    public boolean dr(int i, int i2, int i3, int i4, int i5, cq cqVar, int i6, long j, int i7, int i8, int i9, int i10) {
        if (cqVar == null) {
            return true;
        }
        return ab(i, i7, i8, (i9 - i7) + 1, (i10 - i8) + 1, i2, i3, i4, cqVar, i6, true, j, 0);
    }

    public boolean dw(int i, int i2, int i3, int i4, int i5, cq cqVar, int i6, long j, int i7, int i8, int i9, int i10) {
        if (cqVar == null) {
            return true;
        }
        return ab(i, i7, i8, (i9 - i7) + 1, (i10 - i8) + 1, i2, i3, i4, cqVar, i6, true, j, 0);
    }

    boolean ab(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, cq cqVar, int i9, boolean z, long j, int i10) {
        int i11 = i2;
        while (i11 < i2 + i4) {
            int i12 = i3;
            while (i12 < i3 + i5) {
                if (i11 < 0 || i12 < 0 || i11 >= this.an || i12 >= this.aa) {
                    return false;
                }
                cv cvVar = this.ay[i][i11][i12];
                if (cvVar != null && cvVar.aq * -1099785793 >= 5) {
                    return false;
                }
                i12++;
            }
            i11++;
        }
        cm cmVar = new cm();
        cmVar.at = -7249700924007783031L * j;
        cmVar.ab = -145648533 * i10;
        cmVar.af = 1874059083 * i;
        cmVar.aa = -1621539107 * i6;
        cmVar.ag = 1491175677 * i7;
        cmVar.ad = -233000707 * i8;
        cmVar.ay = cqVar;
        cmVar.as = 545896899 * i9;
        cmVar.an = -1398533289 * i2;
        cmVar.aj = -1572272533 * i3;
        cmVar.ar = ((i2 + i4) - 1) * 296512969;
        cmVar.ae = ((i3 + i5) - 1) * -1360954651;
        for (int i13 = i2; i13 < i2 + i4; i13++) {
            for (int i14 = i3; i14 < i3 + i5; i14++) {
                i12 = 0;
                if (i13 > i2) {
                    i12 = 1;
                }
                if (i13 < (i2 + i4) - 1) {
                    i12 += 4;
                }
                if (i14 > i3) {
                    i12 += 8;
                }
                if (i14 < (i3 + i5) - 1) {
                    i12 += 2;
                }
                for (i11 = i; i11 >= 0; i11--) {
                    if (this.ay[i11][i13][i14] == null) {
                        this.ay[i11][i13][i14] = new cv(i11, i13, i14);
                    }
                }
                cv cvVar2 = this.ay[i][i13][i14];
                cvVar2.am[cvVar2.aq * -1099785793] = cmVar;
                cvVar2.at[cvVar2.aq * -1099785793] = i12;
                cvVar2.ab = (i12 | (cvVar2.ab * -901382725)) * 444219251;
                cvVar2.aq -= 1420143041;
            }
        }
        if (z) {
            cm[] cmVarArr = this.aj;
            i11 = this.ar;
            this.ar = i11 + 1;
            cmVarArr[i11] = cmVar;
        }
        return true;
    }

    boolean dh(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, cq cqVar, int i9, boolean z, long j, int i10) {
        int i11 = i2;
        while (i11 < i2 + i4) {
            int i12 = i3;
            while (i12 < i3 + i5) {
                if (i11 < 0 || i12 < 0 || i11 >= this.an || i12 >= this.aa) {
                    return false;
                }
                cv cvVar = this.ay[i][i11][i12];
                if (cvVar != null && cvVar.aq * 1481253685 >= 5) {
                    return false;
                }
                i12++;
            }
            i11++;
        }
        cm cmVar = new cm();
        cmVar.at = -7249700924007783031L * j;
        cmVar.ab = -135902033 * i10;
        cmVar.af = 1874059083 * i;
        cmVar.aa = -1758222265 * i6;
        cmVar.ag = 12613228 * i7;
        cmVar.ad = -1049272135 * i8;
        cmVar.ay = cqVar;
        cmVar.as = 545896899 * i9;
        cmVar.an = 1882872655 * i2;
        cmVar.aj = -1572272533 * i3;
        cmVar.ar = ((i2 + i4) - 1) * 1441909918;
        cmVar.ae = ((i3 + i5) - 1) * -1360954651;
        for (int i13 = i2; i13 < i2 + i4; i13++) {
            for (int i14 = i3; i14 < i3 + i5; i14++) {
                i12 = 0;
                if (i13 > i2) {
                    i12 = 1;
                }
                if (i13 < (i2 + i4) - 1) {
                    i12 += 4;
                }
                if (i14 > i3) {
                    i12 += 8;
                }
                if (i14 < (i3 + i5) - 1) {
                    i12 += 2;
                }
                for (i11 = i; i11 >= 0; i11--) {
                    if (this.ay[i11][i13][i14] == null) {
                        this.ay[i11][i13][i14] = new cv(i11, i13, i14);
                    }
                }
                cv cvVar2 = this.ay[i][i13][i14];
                cvVar2.am[cvVar2.aq * 1626820389] = cmVar;
                cvVar2.at[cvVar2.aq * -1015767126] = i12;
                cvVar2.ab = (i12 | (cvVar2.ab * -1915922288)) * 1449429875;
                cvVar2.aq += 2006178839;
            }
        }
        if (z) {
            cm[] cmVarArr = this.aj;
            i11 = this.ar;
            this.ar = i11 + 1;
            cmVarArr[i11] = cmVar;
        }
        return true;
    }

    boolean ds(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, cq cqVar, int i9, boolean z, long j, int i10) {
        int i11 = i2;
        while (i11 < i2 + i4) {
            int i12 = i3;
            while (i12 < i3 + i5) {
                if (i11 < 0 || i12 < 0 || i11 >= this.an || i12 >= this.aa) {
                    return false;
                }
                cv cvVar = this.ay[i][i11][i12];
                if (cvVar != null && cvVar.aq * -1099785793 >= 5) {
                    return false;
                }
                i12++;
            }
            i11++;
        }
        cm cmVar = new cm();
        cmVar.at = -7249700924007783031L * j;
        cmVar.ab = -145648533 * i10;
        cmVar.af = 1874059083 * i;
        cmVar.aa = -1621539107 * i6;
        cmVar.ag = 1491175677 * i7;
        cmVar.ad = -233000707 * i8;
        cmVar.ay = cqVar;
        cmVar.as = 545896899 * i9;
        cmVar.an = -1398533289 * i2;
        cmVar.aj = -1572272533 * i3;
        cmVar.ar = ((i2 + i4) - 1) * 296512969;
        cmVar.ae = ((i3 + i5) - 1) * -1360954651;
        for (int i13 = i2; i13 < i2 + i4; i13++) {
            for (int i14 = i3; i14 < i3 + i5; i14++) {
                i12 = 0;
                if (i13 > i2) {
                    i12 = 1;
                }
                if (i13 < (i2 + i4) - 1) {
                    i12 += 4;
                }
                if (i14 > i3) {
                    i12 += 8;
                }
                if (i14 < (i3 + i5) - 1) {
                    i12 += 2;
                }
                for (i11 = i; i11 >= 0; i11--) {
                    if (this.ay[i11][i13][i14] == null) {
                        this.ay[i11][i13][i14] = new cv(i11, i13, i14);
                    }
                }
                cv cvVar2 = this.ay[i][i13][i14];
                cvVar2.am[cvVar2.aq * -1099785793] = cmVar;
                cvVar2.at[cvVar2.aq * -1099785793] = i12;
                cvVar2.ab = (i12 | (cvVar2.ab * -901382725)) * 444219251;
                cvVar2.aq -= 1420143041;
            }
        }
        if (z) {
            cm[] cmVarArr = this.aj;
            i11 = this.ar;
            this.ar = i11 + 1;
            cmVarArr[i11] = cmVar;
        }
        return true;
    }

    boolean dx(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, cq cqVar, int i9, boolean z, long j, int i10) {
        int i11 = i2;
        while (i11 < i2 + i4) {
            int i12 = i3;
            while (i12 < i3 + i5) {
                if (i11 < 0 || i12 < 0 || i11 >= this.an || i12 >= this.aa) {
                    return false;
                }
                cv cvVar = this.ay[i][i11][i12];
                if (cvVar != null && cvVar.aq * -1099785793 >= 5) {
                    return false;
                }
                i12++;
            }
            i11++;
        }
        cm cmVar = new cm();
        cmVar.at = -7249700924007783031L * j;
        cmVar.ab = -145648533 * i10;
        cmVar.af = 1874059083 * i;
        cmVar.aa = -1621539107 * i6;
        cmVar.ag = 1491175677 * i7;
        cmVar.ad = -233000707 * i8;
        cmVar.ay = cqVar;
        cmVar.as = 545896899 * i9;
        cmVar.an = -1398533289 * i2;
        cmVar.aj = -1572272533 * i3;
        cmVar.ar = ((i2 + i4) - 1) * 296512969;
        cmVar.ae = ((i3 + i5) - 1) * -1360954651;
        for (int i13 = i2; i13 < i2 + i4; i13++) {
            for (int i14 = i3; i14 < i3 + i5; i14++) {
                i12 = 0;
                if (i13 > i2) {
                    i12 = 1;
                }
                if (i13 < (i2 + i4) - 1) {
                    i12 += 4;
                }
                if (i14 > i3) {
                    i12 += 8;
                }
                if (i14 < (i3 + i5) - 1) {
                    i12 += 2;
                }
                for (i11 = i; i11 >= 0; i11--) {
                    if (this.ay[i11][i13][i14] == null) {
                        this.ay[i11][i13][i14] = new cv(i11, i13, i14);
                    }
                }
                cv cvVar2 = this.ay[i][i13][i14];
                cvVar2.am[cvVar2.aq * -1099785793] = cmVar;
                cvVar2.at[cvVar2.aq * -1099785793] = i12;
                cvVar2.ab = (i12 | (cvVar2.ab * -901382725)) * 444219251;
                cvVar2.aq -= 1420143041;
            }
        }
        if (z) {
            cm[] cmVarArr = this.aj;
            i11 = this.ar;
            this.ar = i11 + 1;
            cmVarArr[i11] = cmVar;
        }
        return true;
    }

    boolean dy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, cq cqVar, int i9, boolean z, long j, int i10) {
        int i11 = i2;
        while (i11 < i2 + i4) {
            int i12 = i3;
            while (i12 < i3 + i5) {
                if (i11 < 0 || i12 < 0 || i11 >= this.an || i12 >= this.aa) {
                    return false;
                }
                cv cvVar = this.ay[i][i11][i12];
                if (cvVar != null && cvVar.aq * -1099785793 >= 5) {
                    return false;
                }
                i12++;
            }
            i11++;
        }
        cm cmVar = new cm();
        cmVar.at = -7249700924007783031L * j;
        cmVar.ab = 981058859 * i10;
        cmVar.af = 161354814 * i;
        cmVar.aa = -1621539107 * i6;
        cmVar.ag = -1057017836 * i7;
        cmVar.ad = 1278664104 * i8;
        cmVar.ay = cqVar;
        cmVar.as = 545896899 * i9;
        cmVar.an = -1398533289 * i2;
        cmVar.aj = -1572272533 * i3;
        cmVar.ar = ((i2 + i4) - 1) * -1341060215;
        cmVar.ae = ((i3 + i5) - 1) * -1360954651;
        for (int i13 = i2; i13 < i2 + i4; i13++) {
            for (int i14 = i3; i14 < i3 + i5; i14++) {
                i12 = 0;
                if (i13 > i2) {
                    i12 = 1;
                }
                if (i13 < (i2 + i4) - 1) {
                    i12 += 4;
                }
                if (i14 > i3) {
                    i12 += 8;
                }
                if (i14 < (i3 + i5) - 1) {
                    i12 += 2;
                }
                for (i11 = i; i11 >= 0; i11--) {
                    if (this.ay[i11][i13][i14] == null) {
                        this.ay[i11][i13][i14] = new cv(i11, i13, i14);
                    }
                }
                cv cvVar2 = this.ay[i][i13][i14];
                cvVar2.am[cvVar2.aq * -1099785793] = cmVar;
                cvVar2.at[cvVar2.aq * -1099785793] = i12;
                cvVar2.ab = (i12 | (cvVar2.ab * 1772927444)) * 444219251;
                cvVar2.aq += 297642428;
            }
        }
        if (z) {
            cm[] cmVarArr = this.aj;
            i11 = this.ar;
            this.ar = i11 + 1;
            cmVarArr[i11] = cmVar;
        }
        return true;
    }

    public void aw() {
        for (int i = 0; i < this.ar; i++) {
            ai(this.aj[i]);
            this.aj[i] = null;
        }
        this.ar = 0;
    }

    public void dn() {
        for (int i = 0; i < this.ar; i++) {
            ai(this.aj[i]);
            this.aj[i] = null;
        }
        this.ar = 0;
    }

    void ai(cm cmVar) {
        for (int i = cmVar.an * 842696807; i <= cmVar.ar * 1813855353; i++) {
            for (int i2 = cmVar.aj * -917866941; i2 <= cmVar.ae * -139021587; i2++) {
                cv cvVar = this.ay[cmVar.af * -621006237][i][i2];
                if (cvVar != null) {
                    int i3 = 0;
                    while (i3 < cvVar.aq * -1099785793) {
                        if (cvVar.am[i3] == cmVar) {
                            cvVar.aq -= -1420143041;
                            while (i3 < cvVar.aq * -1099785793) {
                                cvVar.am[i3] = cvVar.am[i3 + 1];
                                cvVar.at[i3] = cvVar.at[i3 + 1];
                                i3++;
                            }
                            cvVar.am[cvVar.aq * -1099785793] = null;
                            cvVar.ab = 0;
                            for (i3 = 0; i3 < cvVar.aq * -1099785793; i3++) {
                                cvVar.ab = ((cvVar.ab * -901382725) | cvVar.at[i3]) * 444219251;
                            }
                        } else {
                            i3++;
                        }
                    }
                    cvVar.ab = 0;
                    for (i3 = 0; i3 < cvVar.aq * -1099785793; i3++) {
                        cvVar.ab = ((cvVar.ab * -901382725) | cvVar.at[i3]) * 444219251;
                    }
                }
            }
        }
    }

    void db(cm cmVar) {
        for (int i = cmVar.an * 842696807; i <= cmVar.ar * 1813855353; i++) {
            for (int i2 = cmVar.aj * -917866941; i2 <= cmVar.ae * -139021587; i2++) {
                cv cvVar = this.ay[cmVar.af * -621006237][i][i2];
                if (cvVar != null) {
                    int i3 = 0;
                    while (i3 < cvVar.aq * -1099785793) {
                        if (cvVar.am[i3] == cmVar) {
                            cvVar.aq -= -1420143041;
                            while (i3 < cvVar.aq * -1099785793) {
                                cvVar.am[i3] = cvVar.am[i3 + 1];
                                cvVar.at[i3] = cvVar.at[i3 + 1];
                                i3++;
                            }
                            cvVar.am[cvVar.aq * -1099785793] = null;
                            cvVar.ab = 0;
                            for (i3 = 0; i3 < cvVar.aq * -1099785793; i3++) {
                                cvVar.ab = ((cvVar.ab * -901382725) | cvVar.at[i3]) * 444219251;
                            }
                        } else {
                            i3++;
                        }
                    }
                    cvVar.ab = 0;
                    for (i3 = 0; i3 < cvVar.aq * -1099785793; i3++) {
                        cvVar.ab = ((cvVar.ab * -901382725) | cvVar.at[i3]) * 444219251;
                    }
                }
            }
        }
    }

    void dm(cm cmVar) {
        for (int i = cmVar.an * 207644659; i <= cmVar.ar * -682338486; i++) {
            for (int i2 = cmVar.aj * -917866941; i2 <= cmVar.ae * -139021587; i2++) {
                cv cvVar = this.ay[cmVar.af * -621006237][i][i2];
                if (cvVar != null) {
                    int i3 = 0;
                    while (i3 < cvVar.aq * -1848204103) {
                        if (cvVar.am[i3] == cmVar) {
                            cvVar.aq -= -931124520;
                            while (i3 < cvVar.aq * 1362431193) {
                                cvVar.am[i3] = cvVar.am[i3 + 1];
                                cvVar.at[i3] = cvVar.at[i3 + 1];
                                i3++;
                            }
                            cvVar.am[cvVar.aq * -1099785793] = null;
                            cvVar.ab = 0;
                            for (i3 = 0; i3 < cvVar.aq * -70199261; i3++) {
                                cvVar.ab = ((cvVar.ab * -901382725) | cvVar.at[i3]) * 1601916244;
                            }
                        } else {
                            i3++;
                        }
                    }
                    cvVar.ab = 0;
                    for (i3 = 0; i3 < cvVar.aq * -70199261; i3++) {
                        cvVar.ab = ((cvVar.ab * -901382725) | cvVar.at[i3]) * 1601916244;
                    }
                }
            }
        }
    }

    void du(cm cmVar) {
        for (int i = cmVar.an * 842696807; i <= cmVar.ar * 1813855353; i++) {
            for (int i2 = cmVar.aj * -917866941; i2 <= cmVar.ae * -139021587; i2++) {
                cv cvVar = this.ay[cmVar.af * -621006237][i][i2];
                if (cvVar != null) {
                    int i3 = 0;
                    while (i3 < cvVar.aq * -1099785793) {
                        if (cvVar.am[i3] == cmVar) {
                            cvVar.aq -= -1420143041;
                            while (i3 < cvVar.aq * -1099785793) {
                                cvVar.am[i3] = cvVar.am[i3 + 1];
                                cvVar.at[i3] = cvVar.at[i3 + 1];
                                i3++;
                            }
                            cvVar.am[cvVar.aq * -1099785793] = null;
                            cvVar.ab = 0;
                            for (i3 = 0; i3 < cvVar.aq * -1099785793; i3++) {
                                cvVar.ab = ((cvVar.ab * -901382725) | cvVar.at[i3]) * 444219251;
                            }
                        } else {
                            i3++;
                        }
                    }
                    cvVar.ab = 0;
                    for (i3 = 0; i3 < cvVar.aq * -1099785793; i3++) {
                        cvVar.ab = ((cvVar.ab * -901382725) | cvVar.at[i3]) * 444219251;
                    }
                }
            }
        }
    }

    public void az(int i, int i2, int i3, int i4) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar != null) {
            bm bmVar = cvVar.ar;
            if (bmVar != null) {
                bmVar.an = (((bmVar.an * -201528243) * i4) / 16) * -1494471547;
                bmVar.as = (((bmVar.as * 1518383757) * i4) / 16) * -259563451;
            }
        }
    }

    public void dg(int i, int i2, int i3, int i4) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar != null) {
            bm bmVar = cvVar.ar;
            if (bmVar != null) {
                bmVar.an = (((bmVar.an * -432011026) * i4) / 16) * -1494471547;
                bmVar.as = (((bmVar.as * -582660301) * i4) / 16) * -932739820;
            }
        }
    }

    public void dp(int i, int i2, int i3, int i4) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar != null) {
            bm bmVar = cvVar.ar;
            if (bmVar != null) {
                bmVar.an = (((bmVar.an * -201528243) * i4) / 16) * -1494471547;
                bmVar.as = (((bmVar.as * 1518383757) * i4) / 16) * -259563451;
            }
        }
    }

    public void ah(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar != null) {
            cvVar.as = null;
        }
    }

    public void df(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar != null) {
            cvVar.as = null;
        }
    }

    public void dq(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar != null) {
            cvVar.as = null;
        }
    }

    public void er(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar != null) {
            cvVar.as = null;
        }
    }

    public void ew(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar != null) {
            cvVar.as = null;
        }
    }

    public void ak(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar != null) {
            cvVar.ar = null;
        }
    }

    public void ek(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar != null) {
            cvVar.ar = null;
        }
    }

    public void es(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar != null) {
            cvVar.ar = null;
        }
    }

    public void ex(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar != null) {
            cvVar.ar = null;
        }
    }

    public void ao(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar != null) {
            for (int i4 = 0; i4 < cvVar.aq * -1099785793; i4++) {
                Object obj;
                cm cmVar = cvVar.am[i4];
                if (2 == ((int) (((-966509501471514439L * cmVar.at) >>> 14) & 3))) {
                    obj = 1;
                } else {
                    obj = null;
                }
                if (obj != null && cmVar.an * 842696807 == i2 && cmVar.aj * -917866941 == i3) {
                    ai(cmVar);
                    return;
                }
            }
        }
    }

    public void ax(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar != null) {
            cvVar.aj = null;
        }
    }

    public void ec(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar != null) {
            cvVar.aj = null;
        }
    }

    public void eu(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar != null) {
            cvVar.aj = null;
        }
    }

    public void au(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar != null) {
            cvVar.ae = null;
        }
    }

    public void ep(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar != null) {
            cvVar.ae = null;
        }
    }

    public void eq(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar != null) {
            cvVar.ae = null;
        }
    }

    public void ev(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar != null) {
            cvVar.ae = null;
        }
    }

    public bs av(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar == null) {
            return null;
        }
        return cvVar.as;
    }

    public bs ea(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar == null) {
            return null;
        }
        return cvVar.as;
    }

    public bs ef(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar == null) {
            return null;
        }
        return cvVar.as;
    }

    public bs en(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        return cvVar == null ? null : cvVar.as;
    }

    public bs ey(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar == null) {
            return null;
        }
        return cvVar.as;
    }

    public bm ac(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar == null) {
            return null;
        }
        return cvVar.ar;
    }

    public bm el(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar == null) {
            return null;
        }
        return cvVar.ar;
    }

    public cm al(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar == null) {
            return null;
        }
        for (int i4 = 0; i4 < cvVar.aq * -1099785793; i4++) {
            Object obj;
            cm cmVar = cvVar.am[i4];
            if (2 == ((int) (((-966509501471514439L * cmVar.at) >>> 14) & 3))) {
                obj = 1;
            } else {
                obj = null;
            }
            if (obj != null && cmVar.an * 842696807 == i2 && cmVar.aj * -917866941 == i3) {
                return cmVar;
            }
        }
        return null;
    }

    public cm eg(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar == null) {
            return null;
        }
        for (int i4 = 0; i4 < cvVar.aq * -1099785793; i4++) {
            Object obj;
            cm cmVar = cvVar.am[i4];
            if (2 == ((int) (((-966509501471514439L * cmVar.at) >>> 14) & 3))) {
                obj = 1;
            } else {
                obj = null;
            }
            if (obj != null && cmVar.an * 842696807 == i2 && cmVar.aj * -917866941 == i3) {
                return cmVar;
            }
        }
        return null;
    }

    public cm ej(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar == null) {
            return null;
        }
        for (int i4 = 0; i4 < cvVar.aq * -1099785793; i4++) {
            Object obj;
            cm cmVar = cvVar.am[i4];
            if (2 == ((int) (((-966509501471514439L * cmVar.at) >>> 14) & 3))) {
                obj = 1;
            } else {
                obj = null;
            }
            if (obj != null && cmVar.an * 708717826 == i2 && cmVar.aj * -917866941 == i3) {
                return cmVar;
            }
        }
        return null;
    }

    public cm et(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar == null) {
            return null;
        }
        for (int i4 = 0; i4 < cvVar.aq * -1099785793; i4++) {
            cm cmVar = cvVar.am[i4];
            if ((2 == ((int) (((-966509501471514439L * cmVar.at) >>> 14) & 3)) ? 1 : null) != null && cmVar.an * 842696807 == i2 && cmVar.aj * -917866941 == i3) {
                return cmVar;
            }
        }
        return null;
    }

    public bx ap(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar == null || cvVar.aj == null) {
            return null;
        }
        return cvVar.aj;
    }

    public bx eb(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar == null || cvVar.aj == null) {
            return null;
        }
        return cvVar.aj;
    }

    public bx ed(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar == null || cvVar.aj == null) {
            return null;
        }
        return cvVar.aj;
    }

    public bx ee(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar == null || cvVar.aj == null) {
            return null;
        }
        return cvVar.aj;
    }

    public bx em(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar == null || cvVar.aj == null) {
            return null;
        }
        return cvVar.aj;
    }

    public bx ez(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar == null || cvVar.aj == null) {
            return null;
        }
        return cvVar.aj;
    }

    public long bw(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        return (cvVar == null || cvVar.as == null) ? 0 : cvVar.as.ar * 2560327866738495599L;
    }

    public long eh(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar == null || cvVar.as == null) {
            return 0;
        }
        return cvVar.as.ar * 2560327866738495599L;
    }

    public long ei(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        return (cvVar == null || cvVar.as == null) ? 0 : cvVar.as.ar * 2560327866738495599L;
    }

    public long bb(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar == null || cvVar.ar == null) {
            return 0;
        }
        return cvVar.ar.ae * 6162409934167472955L;
    }

    public long eo(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar == null || cvVar.ar == null) {
            return 0;
        }
        return cvVar.ar.ae * 6162409934167472955L;
    }

    public long bc(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar == null) {
            return 0;
        }
        for (int i4 = 0; i4 < cvVar.aq * -1099785793; i4++) {
            cm cmVar = cvVar.am[i4];
            if ((2 == ((int) (((-966509501471514439L * cmVar.at) >>> 14) & 3)) ? 1 : null) != null && cmVar.an * 842696807 == i2 && cmVar.aj * -917866941 == i3) {
                return cmVar.at * -966509501471514439L;
            }
        }
        return 0;
    }

    public long fd(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar == null) {
            return 0;
        }
        for (int i4 = 0; i4 < cvVar.aq * -1099785793; i4++) {
            Object obj;
            cm cmVar = cvVar.am[i4];
            if (2 == ((int) (((-966509501471514439L * cmVar.at) >>> 14) & 3))) {
                obj = 1;
            } else {
                obj = null;
            }
            if (obj != null && cmVar.an * -1307414562 == i2 && cmVar.aj * 1035373178 == i3) {
                return cmVar.at * -966509501471514439L;
            }
        }
        return 0;
    }

    public long fk(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar == null) {
            return 0;
        }
        for (int i4 = 0; i4 < cvVar.aq * -1099785793; i4++) {
            Object obj;
            cm cmVar = cvVar.am[i4];
            if (2 == ((int) (((-966509501471514439L * cmVar.at) >>> 14) & 3))) {
                obj = 1;
            } else {
                obj = null;
            }
            if (obj != null && cmVar.an * 842696807 == i2 && cmVar.aj * -917866941 == i3) {
                return cmVar.at * -966509501471514439L;
            }
        }
        return 0;
    }

    public long fv(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar == null) {
            return 0;
        }
        for (int i4 = 0; i4 < cvVar.aq * -1099785793; i4++) {
            cm cmVar = cvVar.am[i4];
            if ((2 == ((int) (((-966509501471514439L * cmVar.at) >>> 14) & 3)) ? 1 : null) != null && cmVar.an * 842696807 == i2 && cmVar.aj * -917866941 == i3) {
                return cmVar.at * -966509501471514439L;
            }
        }
        return 0;
    }

    public long bz(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar == null || cvVar.aj == null) {
            return 0;
        }
        return cvVar.aj.ag * -7401358002501475335L;
    }

    public long fa(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar == null || cvVar.aj == null) {
            return 0;
        }
        return cvVar.aj.ag * -7401358002501475335L;
    }

    public long fh(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        return (cvVar == null || cvVar.aj == null) ? 0 : cvVar.aj.ag * -7401358002501475335L;
    }

    public long fl(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        return (cvVar == null || cvVar.aj == null) ? 0 : cvVar.aj.ag * -7401358002501475335L;
    }

    public long fm(int i, int i2, int i3) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar == null || cvVar.aj == null) {
            return 0;
        }
        return cvVar.aj.ag * -7401358002501475335L;
    }

    public int bg(int i, int i2, int i3, long j) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar == null) {
            return -1;
        }
        if (cvVar.as != null && cvVar.as.ar * 2560327866738495599L == j) {
            return (cvVar.as.aj * -2106306209) & 255;
        }
        if (cvVar.ar != null && cvVar.ar.ae * 6162409934167472955L == j) {
            return (cvVar.ar.aq * -492737373) & 255;
        }
        if (cvVar.aj != null && cvVar.aj.ag * -7401358002501475335L == j) {
            return (cvVar.aj.ay * 1152833105) & 255;
        }
        for (int i4 = 0; i4 < cvVar.aq * -1099785793; i4++) {
            if (cvVar.am[i4].at * -966509501471514439L == j) {
                return (cvVar.am[i4].ab * 2101114947) & 255;
            }
        }
        return -1;
    }

    public int fb(int i, int i2, int i3, long j) {
        cv cvVar = this.ay[i][i2][i3];
        if (cvVar == null) {
            return -1;
        }
        if (cvVar.as != null && cvVar.as.ar * 2560327866738495599L == j) {
            return (cvVar.as.aj * -2106306209) & 255;
        }
        if (cvVar.ar != null && cvVar.ar.ae * 6162409934167472955L == j) {
            return (cvVar.ar.aq * -492737373) & 2058601208;
        }
        if (cvVar.aj != null && cvVar.aj.ag * -7401358002501475335L == j) {
            return (cvVar.aj.ay * 1051089512) & 255;
        }
        for (int i4 = 0; i4 < cvVar.aq * 692223651; i4++) {
            if (cvVar.am[i4].at * -966509501471514439L == j) {
                return (cvVar.am[i4].ab * 2101114947) & 255;
            }
        }
        return -1;
    }

    public void bh(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.ad; i4++) {
            for (int i5 = 0; i5 < this.an; i5++) {
                for (int i6 = 0; i6 < this.aa; i6++) {
                    cv cvVar = this.ay[i4][i5][i6];
                    if (cvVar != null) {
                        bj bjVar;
                        bs bsVar = cvVar.as;
                        if (bsVar != null && (bsVar.ay instanceof bj)) {
                            bjVar = (bj) bsVar.ay;
                            bv(bjVar, i4, i5, i6, 1, 1);
                            if (bsVar.as instanceof bj) {
                                bj bjVar2 = (bj) bsVar.as;
                                bv(bjVar2, i4, i5, i6, 1, 1);
                                bj.ao(bjVar, bjVar2, 0, 0, 0, false);
                                bsVar.as = bjVar2.ax(bjVar2.bb, bjVar2.bc, i, i2, i3);
                            }
                            bsVar.ay = bjVar.ax(bjVar.bb, bjVar.bc, i, i2, i3);
                        }
                        for (int i7 = 0; i7 < cvVar.aq * -1099785793; i7++) {
                            cm cmVar = cvVar.am[i7];
                            if (cmVar != null && (cmVar.ay instanceof bj)) {
                                bjVar = (bj) cmVar.ay;
                                bv(bjVar, i4, i5, i6, ((cmVar.ar * 1813855353) - (cmVar.an * 842696807)) + 1, ((cmVar.ae * -139021587) - (cmVar.aj * -917866941)) + 1);
                                cmVar.ay = bjVar.ax(bjVar.bb, bjVar.bc, i, i2, i3);
                            }
                        }
                        bx bxVar = cvVar.aj;
                        if (bxVar != null && (bxVar.aa instanceof bj)) {
                            bj bjVar3 = (bj) bxVar.aa;
                            bf(bjVar3, i4, i5, i6);
                            bxVar.aa = bjVar3.ax(bjVar3.bb, bjVar3.bc, i, i2, i3);
                        }
                    }
                }
            }
        }
    }

    void bf(bj bjVar, int i, int i2, int i3) {
        cv cvVar;
        if (i2 < this.an) {
            cvVar = this.ay[i][i2 + 1][i3];
            if (!(cvVar == null || cvVar.aj == null || !(cvVar.aj.aa instanceof bj))) {
                bj.ao(bjVar, (bj) cvVar.aj.aa, mn.an, 0, 0, true);
            }
        }
        if (i3 < this.an) {
            cvVar = this.ay[i][i2][i3 + 1];
            if (!(cvVar == null || cvVar.aj == null || !(cvVar.aj.aa instanceof bj))) {
                bj.ao(bjVar, (bj) cvVar.aj.aa, 0, 0, mn.an, true);
            }
        }
        if (i2 < this.an && i3 < this.aa) {
            cvVar = this.ay[i][i2 + 1][i3 + 1];
            if (!(cvVar == null || cvVar.aj == null || !(cvVar.aj.aa instanceof bj))) {
                bj.ao(bjVar, (bj) cvVar.aj.aa, mn.an, 0, mn.an, true);
            }
        }
        if (i2 < this.an && i3 > 0) {
            cvVar = this.ay[i][i2 + 1][i3 - 1];
            if (cvVar != null && cvVar.aj != null && (cvVar.aj.aa instanceof bj)) {
                bj.ao(bjVar, (bj) cvVar.aj.aa, mn.an, 0, -128, true);
            }
        }
    }

    void fr(bj bjVar, int i, int i2, int i3) {
        cv cvVar;
        if (i2 < this.an) {
            cvVar = this.ay[i][i2 + 1][i3];
            if (!(cvVar == null || cvVar.aj == null || !(cvVar.aj.aa instanceof bj))) {
                bj.ao(bjVar, (bj) cvVar.aj.aa, 249612215, 0, 0, true);
            }
        }
        if (i3 < this.an) {
            cvVar = this.ay[i][i2][i3 + 1];
            if (!(cvVar == null || cvVar.aj == null || !(cvVar.aj.aa instanceof bj))) {
                bj.ao(bjVar, (bj) cvVar.aj.aa, 0, 0, 1998798153, true);
            }
        }
        if (i2 < this.an && i3 < this.aa) {
            cvVar = this.ay[i][i2 + 1][i3 + 1];
            if (!(cvVar == null || cvVar.aj == null || !(cvVar.aj.aa instanceof bj))) {
                bj.ao(bjVar, (bj) cvVar.aj.aa, -899131496, 0, mn.an, true);
            }
        }
        if (i2 < this.an && i3 > 0) {
            cvVar = this.ay[i][i2 + 1][i3 - 1];
            if (cvVar != null && cvVar.aj != null && (cvVar.aj.aa instanceof bj)) {
                bj.ao(bjVar, (bj) cvVar.aj.aa, 832146690, 0, -586929480, true);
            }
        }
    }

    void bv(bj bjVar, int i, int i2, int i3, int i4, int i5) {
        boolean z = true;
        int i6 = i2 + i4;
        int i7 = i3 - 1;
        int i8 = i3 + i5;
        int i9 = i;
        int i10 = i2;
        while (i9 <= i + 1) {
            int i11;
            if (i9 == this.ad) {
                i11 = i10;
            } else {
                int i12 = i10;
                while (i12 <= i6) {
                    if (i12 >= 0 && i12 < this.an) {
                        int i13 = i7;
                        while (i13 <= i8) {
                            if (i13 >= 0) {
                                if (i13 < this.aa) {
                                    if (!z || i12 >= i6 || i13 >= i8 || (i13 < i3 && i12 != i2)) {
                                        cv cvVar = this.ay[i9][i12][i13];
                                        if (cvVar != null) {
                                            int i14 = ((((this.ag[i9][i12][i13] + this.ag[i9][i12 + 1][i13]) + this.ag[i9][i12][i13 + 1]) + this.ag[i9][i12 + 1][i13 + 1]) / 4) - ((((this.ag[i][i2][i3] + this.ag[i][i2 + 1][i3]) + this.ag[i][i2][i3 + 1]) + this.ag[i][i2 + 1][i3 + 1]) / 4);
                                            bs bsVar = cvVar.as;
                                            if (bsVar != null) {
                                                bj bjVar2;
                                                if (bsVar.ay instanceof bj) {
                                                    bjVar2 = bjVar;
                                                    bj.ao(bjVar2, (bj) bsVar.ay, ((1 - i4) * 64) + ((i12 - i2) * mn.an), i14, ((1 - i5) * 64) + ((i13 - i3) * mn.an), z);
                                                }
                                                if (bsVar.as instanceof bj) {
                                                    bjVar2 = bjVar;
                                                    bj.ao(bjVar2, (bj) bsVar.as, ((1 - i4) * 64) + ((i12 - i2) * mn.an), i14, ((1 - i5) * 64) + ((i13 - i3) * mn.an), z);
                                                }
                                            }
                                            for (int i15 = 0; i15 < cvVar.aq * -1099785793; i15++) {
                                                cm cmVar = cvVar.am[i15];
                                                if (cmVar != null && (cmVar.ay instanceof bj)) {
                                                    bj.ao(bjVar, (bj) cmVar.ay, (((((cmVar.ar * 1813855353) - (cmVar.an * 842696807)) + 1) - i4) * 64) + (((cmVar.an * 842696807) - i2) * mn.an), i14, (((((cmVar.ae * -139021587) - (cmVar.aj * -917866941)) + 1) - i5) * 64) + (((cmVar.aj * -917866941) - i3) * mn.an), z);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            i13++;
                        }
                    }
                    i12++;
                }
                i11 = i10 - 1;
                z = false;
            }
            i9++;
            i10 = i11;
        }
    }

    void fg(bj bjVar, int i, int i2, int i3, int i4, int i5) {
        boolean z = true;
        int i6 = i2 + i4;
        int i7 = i3 - 1;
        int i8 = i3 + i5;
        int i9 = i;
        int i10 = i2;
        while (i9 <= i + 1) {
            int i11;
            if (i9 == this.ad) {
                i11 = i10;
            } else {
                int i12 = i10;
                while (i12 <= i6) {
                    if (i12 >= 0 && i12 < this.an) {
                        int i13 = i7;
                        while (i13 <= i8) {
                            if (i13 >= 0 && i13 < this.aa && (!z || i12 >= i6 || i13 >= i8 || (i13 < i3 && i12 != i2))) {
                                cv cvVar = this.ay[i9][i12][i13];
                                if (cvVar != null) {
                                    int i14 = ((((this.ag[i9][i12][i13] + this.ag[i9][i12 + 1][i13]) + this.ag[i9][i12][i13 + 1]) + this.ag[i9][i12 + 1][i13 + 1]) / 4) - ((((this.ag[i][i2][i3] + this.ag[i][i2 + 1][i3]) + this.ag[i][i2][i3 + 1]) + this.ag[i][i2 + 1][i3 + 1]) / 4);
                                    bs bsVar = cvVar.as;
                                    if (bsVar != null) {
                                        bj bjVar2;
                                        if (bsVar.ay instanceof bj) {
                                            bjVar2 = bjVar;
                                            bj.ao(bjVar2, (bj) bsVar.ay, ((1 - i4) * 64) + ((i12 - i2) * -917053430), i14, ((1 - i5) * 1007050968) + ((i13 - i3) * mn.an), z);
                                        }
                                        if (bsVar.as instanceof bj) {
                                            bjVar2 = bjVar;
                                            bj.ao(bjVar2, (bj) bsVar.as, ((1 - i4) * 64) + ((i12 - i2) * mn.an), i14, ((1 - i5) * -629764717) + ((i13 - i3) * 1065341370), z);
                                        }
                                    }
                                    for (int i15 = 0; i15 < cvVar.aq * -1040664438; i15++) {
                                        cm cmVar = cvVar.am[i15];
                                        if (cmVar != null && (cmVar.ay instanceof bj)) {
                                            bj.ao(bjVar, (bj) cmVar.ay, (((((cmVar.ar * 1813855353) - (cmVar.an * 842696807)) + 1) - i4) * -1082222560) + (((cmVar.an * 842696807) - i2) * 378145427), i14, (((((cmVar.ae * -139021587) - (cmVar.aj * 10854390)) + 1) - i5) * 64) + (((cmVar.aj * -289841297) - i3) * -1487947644), z);
                                        }
                                    }
                                }
                            }
                            i13++;
                        }
                    }
                    i12++;
                }
                i11 = i10 - 1;
                z = false;
            }
            i9++;
            i10 = i11;
        }
    }

    void fp(bj bjVar, int i, int i2, int i3, int i4, int i5) {
        boolean z = true;
        int i6 = i2 + i4;
        int i7 = i3 - 1;
        int i8 = i3 + i5;
        int i9 = i;
        int i10 = i2;
        while (i9 <= i + 1) {
            int i11;
            if (i9 == this.ad) {
                i11 = i10;
            } else {
                int i12 = i10;
                while (i12 <= i6) {
                    if (i12 >= 0 && i12 < this.an) {
                        int i13 = i7;
                        while (i13 <= i8) {
                            if (i13 >= 0 && i13 < this.aa && (!z || i12 >= i6 || i13 >= i8 || (i13 < i3 && i12 != i2))) {
                                cv cvVar = this.ay[i9][i12][i13];
                                if (cvVar != null) {
                                    int i14 = ((((this.ag[i9][i12][i13] + this.ag[i9][i12 + 1][i13]) + this.ag[i9][i12][i13 + 1]) + this.ag[i9][i12 + 1][i13 + 1]) / 4) - ((((this.ag[i][i2][i3] + this.ag[i][i2 + 1][i3]) + this.ag[i][i2][i3 + 1]) + this.ag[i][i2 + 1][i3 + 1]) / 4);
                                    bs bsVar = cvVar.as;
                                    if (bsVar != null) {
                                        bj bjVar2;
                                        if (bsVar.ay instanceof bj) {
                                            bjVar2 = bjVar;
                                            bj.ao(bjVar2, (bj) bsVar.ay, ((1 - i4) * 64) + ((i12 - i2) * mn.an), i14, ((1 - i5) * 64) + ((i13 - i3) * mn.an), z);
                                        }
                                        if (bsVar.as instanceof bj) {
                                            bjVar2 = bjVar;
                                            bj.ao(bjVar2, (bj) bsVar.as, ((1 - i4) * 64) + ((i12 - i2) * mn.an), i14, ((1 - i5) * 64) + ((i13 - i3) * mn.an), z);
                                        }
                                    }
                                    for (int i15 = 0; i15 < cvVar.aq * -1099785793; i15++) {
                                        cm cmVar = cvVar.am[i15];
                                        if (cmVar != null && (cmVar.ay instanceof bj)) {
                                            bj.ao(bjVar, (bj) cmVar.ay, (((((cmVar.ar * 1813855353) - (cmVar.an * 842696807)) + 1) - i4) * 64) + (((cmVar.an * 842696807) - i2) * mn.an), i14, (((((cmVar.ae * -139021587) - (cmVar.aj * -917866941)) + 1) - i5) * 64) + (((cmVar.aj * -917866941) - i3) * mn.an), z);
                                        }
                                    }
                                }
                            }
                            i13++;
                        }
                    }
                    i12++;
                }
                i11 = i10 - 1;
                z = false;
            }
            i9++;
            i10 = i11;
        }
    }

    public void bp(int[] iArr, int i, int i2, int i3, int i4, int i5) {
        cv cvVar = this.ay[i3][i4][i5];
        if (cvVar != null) {
            be beVar = cvVar.ag;
            int i6;
            int i7;
            if (beVar != null) {
                i6 = -372082497 * beVar.as;
                if (i6 != 0) {
                    for (i7 = 0; i7 < 4; i7++) {
                        iArr[i] = i6;
                        iArr[i + 1] = i6;
                        iArr[i + 2] = i6;
                        iArr[i + 3] = i6;
                        i += i2;
                    }
                    return;
                }
                return;
            }
            bl blVar = cvVar.ay;
            if (blVar != null) {
                int i8 = blVar.am;
                int i9 = blVar.at;
                int i10 = blVar.ab;
                i6 = blVar.aw;
                int[] iArr2 = this.co[i8];
                int[] iArr3 = this.cy[i9];
                if (i10 != 0) {
                    i7 = 0;
                    i8 = 0;
                    while (i8 < 4) {
                        i9 = i7 + 1;
                        if (iArr2[iArr3[i7]] == 0) {
                            i7 = i10;
                        } else {
                            i7 = i6;
                        }
                        iArr[i] = i7;
                        int i11 = i + 1;
                        int i12 = i9 + 1;
                        if (iArr2[iArr3[i9]] == 0) {
                            i7 = i10;
                        } else {
                            i7 = i6;
                        }
                        iArr[i11] = i7;
                        i11 = i12 + 1;
                        iArr[i + 2] = iArr2[iArr3[i12]] == 0 ? i10 : i6;
                        i12 = i + 3;
                        i9 = i11 + 1;
                        if (iArr2[iArr3[i11]] == 0) {
                            i7 = i10;
                        } else {
                            i7 = i6;
                        }
                        iArr[i12] = i7;
                        i += i2;
                        i8++;
                        i7 = i9;
                    }
                    return;
                }
                i10 = 0;
                for (i7 = 0; i7 < 4; i7++) {
                    i8 = i10 + 1;
                    if (iArr2[iArr3[i10]] != 0) {
                        iArr[i] = i6;
                    }
                    i10 = i8 + 1;
                    if (iArr2[iArr3[i8]] != 0) {
                        iArr[i + 1] = i6;
                    }
                    i8 = i10 + 1;
                    if (iArr2[iArr3[i10]] != 0) {
                        iArr[i + 2] = i6;
                    }
                    i10 = i8 + 1;
                    if (iArr2[iArr3[i8]] != 0) {
                        iArr[i + 3] = i6;
                    }
                    i += i2;
                }
            }
        }
    }

    public void fo(int[] iArr, int i, int i2, int i3, int i4, int i5) {
        cv cvVar = this.ay[i3][i4][i5];
        if (cvVar != null) {
            be beVar = cvVar.ag;
            int i6;
            int i7;
            if (beVar != null) {
                i6 = -76274627 * beVar.as;
                if (i6 != 0) {
                    for (i7 = 0; i7 < 4; i7++) {
                        iArr[i] = i6;
                        iArr[i + 1] = i6;
                        iArr[i + 2] = i6;
                        iArr[i + 3] = i6;
                        i += i2;
                    }
                    return;
                }
                return;
            }
            bl blVar = cvVar.ay;
            if (blVar != null) {
                int i8 = blVar.am;
                int i9 = blVar.at;
                i6 = blVar.ab;
                int i10 = blVar.aw;
                int[] iArr2 = this.co[i8];
                int[] iArr3 = this.cy[i9];
                if (i6 != 0) {
                    i7 = 0;
                    i8 = 0;
                    while (i8 < 4) {
                        i9 = i7 + 1;
                        if (iArr2[iArr3[i7]] == 0) {
                            i7 = i6;
                        } else {
                            i7 = i10;
                        }
                        iArr[i] = i7;
                        int i11 = i + 1;
                        int i12 = i9 + 1;
                        if (iArr2[iArr3[i9]] == 0) {
                            i7 = i6;
                        } else {
                            i7 = i10;
                        }
                        iArr[i11] = i7;
                        i9 = i + 2;
                        i11 = i12 + 1;
                        if (iArr2[iArr3[i12]] == 0) {
                            i7 = i6;
                        } else {
                            i7 = i10;
                        }
                        iArr[i9] = i7;
                        i9 = i11 + 1;
                        iArr[i + 3] = iArr2[iArr3[i11]] == 0 ? i6 : i10;
                        i += i2;
                        i8++;
                        i7 = i9;
                    }
                    return;
                }
                i6 = 0;
                for (i7 = 0; i7 < 4; i7++) {
                    i8 = i6 + 1;
                    if (iArr2[iArr3[i6]] != 0) {
                        iArr[i] = i10;
                    }
                    i6 = i8 + 1;
                    if (iArr2[iArr3[i8]] != 0) {
                        iArr[i + 1] = i10;
                    }
                    i8 = i6 + 1;
                    if (iArr2[iArr3[i6]] != 0) {
                        iArr[i + 2] = i10;
                    }
                    i6 = i8 + 1;
                    if (iArr2[iArr3[i8]] != 0) {
                        iArr[i + 3] = i10;
                    }
                    i += i2;
                }
            }
        }
    }

    public void fq(int[] iArr, int i, int i2, int i3, int i4, int i5) {
        cv cvVar = this.ay[i3][i4][i5];
        if (cvVar != null) {
            be beVar = cvVar.ag;
            int i6;
            int i7;
            if (beVar != null) {
                i6 = -1812081534 * beVar.as;
                if (i6 != 0) {
                    for (i7 = 0; i7 < 4; i7++) {
                        iArr[i] = i6;
                        iArr[i + 1] = i6;
                        iArr[i + 2] = i6;
                        iArr[i + 3] = i6;
                        i += i2;
                    }
                    return;
                }
                return;
            }
            bl blVar = cvVar.ay;
            if (blVar != null) {
                int i8 = blVar.am;
                int i9 = blVar.at;
                i6 = blVar.ab;
                int i10 = blVar.aw;
                int[] iArr2 = this.co[i8];
                int[] iArr3 = this.cy[i9];
                if (i6 != 0) {
                    i7 = 0;
                    i8 = 0;
                    while (i8 < 4) {
                        i9 = i7 + 1;
                        if (iArr2[iArr3[i7]] == 0) {
                            i7 = i6;
                        } else {
                            i7 = i10;
                        }
                        iArr[i] = i7;
                        int i11 = i + 1;
                        int i12 = i9 + 1;
                        if (iArr2[iArr3[i9]] == 0) {
                            i7 = i6;
                        } else {
                            i7 = i10;
                        }
                        iArr[i11] = i7;
                        i9 = i + 2;
                        i11 = i12 + 1;
                        if (iArr2[iArr3[i12]] == 0) {
                            i7 = i6;
                        } else {
                            i7 = i10;
                        }
                        iArr[i9] = i7;
                        i9 = i11 + 1;
                        iArr[i + 3] = iArr2[iArr3[i11]] == 0 ? i6 : i10;
                        i += i2;
                        i8++;
                        i7 = i9;
                    }
                    return;
                }
                i6 = 0;
                for (i7 = 0; i7 < 4; i7++) {
                    i8 = i6 + 1;
                    if (iArr2[iArr3[i6]] != 0) {
                        iArr[i] = i10;
                    }
                    i6 = i8 + 1;
                    if (iArr2[iArr3[i8]] != 0) {
                        iArr[i + 1] = i10;
                    }
                    i8 = i6 + 1;
                    if (iArr2[iArr3[i6]] != 0) {
                        iArr[i + 2] = i10;
                    }
                    i6 = i8 + 1;
                    if (iArr2[iArr3[i8]] != 0) {
                        iArr[i + 3] = i10;
                    }
                    i += i2;
                }
            }
        }
    }

    public void fu(int[] iArr, int i, int i2, int i3, int i4, int i5) {
        cv cvVar = this.ay[i3][i4][i5];
        if (cvVar != null) {
            be beVar = cvVar.ag;
            int i6;
            int i7;
            if (beVar != null) {
                i6 = -372082497 * beVar.as;
                if (i6 != 0) {
                    for (i7 = 0; i7 < 4; i7++) {
                        iArr[i] = i6;
                        iArr[i + 1] = i6;
                        iArr[i + 2] = i6;
                        iArr[i + 3] = i6;
                        i += i2;
                    }
                    return;
                }
                return;
            }
            bl blVar = cvVar.ay;
            if (blVar != null) {
                int i8 = blVar.am;
                int i9 = blVar.at;
                i6 = blVar.ab;
                int i10 = blVar.aw;
                int[] iArr2 = this.co[i8];
                int[] iArr3 = this.cy[i9];
                i8 = 0;
                if (i6 != 0) {
                    i7 = 0;
                    i8 = 0;
                    while (i8 < 4) {
                        i9 = i7 + 1;
                        if (iArr2[iArr3[i7]] == 0) {
                            i7 = i6;
                        } else {
                            i7 = i10;
                        }
                        iArr[i] = i7;
                        int i11 = i + 1;
                        int i12 = i9 + 1;
                        if (iArr2[iArr3[i9]] == 0) {
                            i7 = i6;
                        } else {
                            i7 = i10;
                        }
                        iArr[i11] = i7;
                        i9 = i + 2;
                        i11 = i12 + 1;
                        if (iArr2[iArr3[i12]] == 0) {
                            i7 = i6;
                        } else {
                            i7 = i10;
                        }
                        iArr[i9] = i7;
                        i12 = i + 3;
                        i9 = i11 + 1;
                        if (iArr2[iArr3[i11]] == 0) {
                            i7 = i6;
                        } else {
                            i7 = i10;
                        }
                        iArr[i12] = i7;
                        i += i2;
                        i8++;
                        i7 = i9;
                    }
                    return;
                }
                for (i7 = 0; i7 < 4; i7++) {
                    i6 = i8 + 1;
                    if (iArr2[iArr3[i8]] != 0) {
                        iArr[i] = i10;
                    }
                    i8 = i6 + 1;
                    if (iArr2[iArr3[i6]] != 0) {
                        iArr[i + 1] = i10;
                    }
                    i6 = i8 + 1;
                    if (iArr2[iArr3[i8]] != 0) {
                        iArr[i + 2] = i10;
                    }
                    i8 = i6 + 1;
                    if (iArr2[iArr3[i6]] != 0) {
                        iArr[i + 3] = i10;
                    }
                    i += i2;
                }
            }
        }
    }

    public static void bx(int[] iArr, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        cd = 0;
        ch = 0;
        cm = i3;
        cq = i4;
        cl = i3 / 2;
        cs = i4 / 2;
        boolean[][][][] zArr = (boolean[][][][]) Array.newInstance(Boolean.TYPE, new int[]{9, 32, 53, 53});
        for (i5 = mn.an; i5 <= 384; i5 += 32) {
            for (i6 = 0; i6 < mn.ae; i6 += 64) {
                int i9;
                bw = bi.az[i5];
                bb = bi.ah[i5];
                bc = bi.az[i6];
                bz = bi.ah[i6];
                int i10 = (i5 - 128) / 32;
                int i11 = i6 / 64;
                for (i9 = -26; i9 <= 26; i9++) {
                    for (i7 = -26; i7 <= 26; i7++) {
                        int i12 = i9 * mn.an;
                        int i13 = i7 * mn.an;
                        boolean z = false;
                        for (i8 = -i; i8 <= i2; i8 += mn.an) {
                            if (cc.bt(i12, iArr[i10] + i8, i13)) {
                                z = true;
                                break;
                            }
                        }
                        zArr[i10][i11][(i9 + 25) + 1][(i7 + 25) + 1] = z;
                    }
                }
            }
        }
        for (i10 = 0; i10 < 8; i10++) {
            for (i5 = 0; i5 < 32; i5++) {
                for (i6 = -25; i6 < 25; i6++) {
                    for (i9 = -25; i9 < 25; i9++) {
                        z = false;
                        for (i7 = -1; i7 <= 1; i7++) {
                            i8 = -1;
                            while (i8 <= 1) {
                                if (zArr[i10][i5][((i6 + i7) + 25) + 1][((i9 + i8) + 25) + 1]) {
                                    z = true;
                                    break;
                                } else if (zArr[i10][(i5 + 1) % 31][((i6 + i7) + 25) + 1][((i9 + i8) + 25) + 1]) {
                                    z = true;
                                    break;
                                } else if (zArr[i10 + 1][i5][((i6 + i7) + 25) + 1][((i9 + i8) + 25) + 1]) {
                                    z = true;
                                    break;
                                } else if (zArr[i10 + 1][(i5 + 1) % 31][((i6 + i7) + 25) + 1][((i9 + i8) + 25) + 1]) {
                                    z = true;
                                    break;
                                } else {
                                    i8++;
                                }
                            }
                        }
                        cn[i10][i5][i6 + 25][i9 + 25] = z;
                    }
                }
            }
        }
    }

    public static void fc(int[] iArr, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        cd = 0;
        ch = 0;
        cm = i3;
        cq = i4;
        cl = i3 / 2;
        cs = i4 / 2;
        boolean[][][][] zArr = (boolean[][][][]) Array.newInstance(Boolean.TYPE, new int[]{9, 32, 53, 53});
        for (i5 = mn.an; i5 <= 384; i5 += 32) {
            int i7;
            for (i7 = 0; i7 < mn.ae; i7 += 64) {
                int i8;
                bw = bi.az[i5];
                bb = bi.ah[i5];
                bc = bi.az[i7];
                bz = bi.ah[i7];
                int i9 = (i5 - 128) / 32;
                int i10 = i7 / 64;
                for (i8 = -26; i8 <= 26; i8++) {
                    int i11;
                    for (i11 = -26; i11 <= 26; i11++) {
                        int i12 = i8 * mn.an;
                        int i13 = i11 * mn.an;
                        boolean z = false;
                        for (i6 = -i; i6 <= i2; i6 += mn.an) {
                            if (cc.bt(i12, iArr[i9] + i6, i13)) {
                                z = true;
                                break;
                            }
                        }
                        zArr[i9][i10][(i8 + 25) + 1][(i11 + 25) + 1] = z;
                    }
                }
            }
        }
        for (i9 = 0; i9 < 8; i9++) {
            for (i5 = 0; i5 < 32; i5++) {
                for (i7 = -25; i7 < 25; i7++) {
                    for (i8 = -25; i8 < 25; i8++) {
                        z = false;
                        for (i11 = -1; i11 <= 1; i11++) {
                            i6 = -1;
                            while (i6 <= 1) {
                                if (zArr[i9][i5][((i7 + i11) + 25) + 1][((i8 + i6) + 25) + 1]) {
                                    z = true;
                                    break;
                                } else if (zArr[i9][(i5 + 1) % 31][((i7 + i11) + 25) + 1][((i8 + i6) + 25) + 1]) {
                                    z = true;
                                    break;
                                } else if (zArr[i9 + 1][i5][((i7 + i11) + 25) + 1][((i8 + i6) + 25) + 1]) {
                                    z = true;
                                    break;
                                } else if (zArr[i9 + 1][(i5 + 1) % 31][((i7 + i11) + 25) + 1][((i8 + i6) + 25) + 1]) {
                                    z = true;
                                    break;
                                } else {
                                    i6++;
                                }
                            }
                        }
                        cn[i9][i5][i7 + 25][i8 + 25] = z;
                    }
                }
            }
        }
    }

    static boolean bt(int i, int i2, int i3) {
        int i4 = ((bc * i3) + (bz * i)) >> 16;
        int i5 = ((bz * i3) - (bc * i)) >> 16;
        int i6 = ((bw * i2) + (bb * i5)) >> 16;
        i5 = ((bb * i2) - (i5 * bw)) >> 16;
        if (i6 < 50 || i6 > 3500) {
            return false;
        }
        i4 = ((i4 * 390) / i6) + cl;
        i5 = ((i5 * 390) / i6) + cs;
        if (i4 < cd || i4 > cm || i5 < ch) {
            return false;
        }
        if (i5 > cq) {
            return false;
        }
        return true;
    }

    static boolean fe(int i, int i2, int i3) {
        int i4 = ((bc * i3) + (bz * i)) >> 16;
        int i5 = ((bz * i3) - (bc * i)) >> 16;
        int i6 = ((bw * i2) + (bb * i5)) >> 16;
        i5 = ((bb * i2) - (i5 * bw)) >> 16;
        if (i6 < 50 || i6 > 3500) {
            return false;
        }
        i4 = ((i4 * 390) / i6) + cl;
        i5 = ((i5 * 390) / i6) + cs;
        if (i4 < cd || i4 > cm || i5 < ch || i5 > cq) {
            return false;
        }
        return true;
    }

    static boolean ff(int i, int i2, int i3) {
        int i4 = ((bc * i3) + (bz * i)) >> 16;
        int i5 = ((bz * i3) - (bc * i)) >> 16;
        int i6 = ((bw * i2) + (bb * i5)) >> 16;
        i5 = ((bb * i2) - (i5 * bw)) >> 16;
        if (i6 < 50 || i6 > 3500) {
            return false;
        }
        i4 = ((i4 * -1166152375) / i6) + cl;
        i5 = ((i5 * -1634917840) / i6) + cs;
        if (i4 < cd || i4 > cm || i5 < ch || i5 > cq) {
            return false;
        }
        return true;
    }

    static boolean fn(int i, int i2, int i3) {
        int i4 = ((bc * i3) + (bz * i)) >> 16;
        int i5 = ((bz * i3) - (bc * i)) >> 16;
        int i6 = ((bw * i2) + (bb * i5)) >> 16;
        i5 = ((bb * i2) - (i5 * bw)) >> 16;
        if (i6 < 50 || i6 > 3500) {
            return false;
        }
        i4 = ((i4 * 390) / i6) + cl;
        i5 = ((i5 * 390) / i6) + cs;
        if (i4 < cd || i4 > cm || i5 < ch || i5 > cq) {
            return false;
        }
        return true;
    }

    static boolean fs(int i, int i2, int i3) {
        int i4 = ((bc * i3) + (bz * i)) >> 16;
        int i5 = ((bz * i3) - (bc * i)) >> 16;
        int i6 = ((bw * i2) + (bb * i5)) >> 16;
        i5 = ((bb * i2) - (i5 * bw)) >> 16;
        if (i6 < 50 || i6 > 3500) {
            return false;
        }
        i4 = ((i4 * 390) / i6) + cl;
        i5 = ((i5 * 390) / i6) + cs;
        if (i4 < cd || i4 > cm || i5 < ch || i5 > cq) {
            return false;
        }
        return true;
    }

    static boolean fz(int i, int i2, int i3) {
        int i4 = ((bc * i3) + (bz * i)) >> 16;
        int i5 = ((bz * i3) - (bc * i)) >> 16;
        int i6 = ((bw * i2) + (bb * i5)) >> 16;
        i5 = ((bb * i2) - (i5 * bw)) >> 16;
        if (i6 < 191516024 || i6 > 3500) {
            return false;
        }
        i4 = ((i4 * 2101929001) / i6) + cl;
        i5 = ((i5 * 390) / i6) + cs;
        if (i4 < cd || i4 > cm || i5 < ch || i5 > cq) {
            return false;
        }
        return true;
    }

    public void bu(int i, int i2, int i3, boolean z) {
        if (!cc.bk() || z) {
            bh = true;
            bu = z;
            bf = i;
            bv = i2;
            bp = i3;
            bx = -1;
            bt = -1;
        }
    }

    public void fj(int i, int i2, int i3, boolean z) {
        if (!cc.bk() || z) {
            bh = true;
            bu = z;
            bf = i;
            bv = i2;
            bp = i3;
            bx = -1;
            bt = -1;
        }
    }

    public void fx(int i, int i2, int i3, boolean z) {
        if (!cc.bk() || z) {
            bh = true;
            bu = z;
            bf = i;
            bv = i2;
            bp = i3;
            bx = -1;
            bt = -1;
        }
    }

    public void be() {
        bu = true;
    }

    public void fi() {
        bu = true;
    }

    public void ft() {
        bu = true;
    }

    public void fw() {
        bu = true;
    }

    public void fy() {
        bu = true;
    }

    public void gp() {
        bu = true;
    }

    public void gs() {
        bu = true;
    }

    public static boolean bk() {
        return bu && bx != -1;
    }

    public static boolean gf() {
        return bu && bx != -1;
    }

    public static boolean gg() {
        return bu && bx != -1;
    }

    public static void by() {
        bx = -1;
        bu = false;
    }

    public static void gc() {
        bx = -1;
        bu = false;
    }

    public static void gl() {
        bx = -1;
        bu = false;
    }

    public void bn(ch chVar, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        cv cvVar;
        ci = chVar;
        cc = ci.ad((byte) 2);
        if (i < 0) {
            i = 0;
        } else if (i >= this.an * mn.an) {
            i = (this.an * mn.an) - 1;
        }
        if (i3 < 0) {
            i3 = 0;
        } else if (i3 >= this.aa * mn.an) {
            i3 = (this.aa * mn.an) - 1;
        }
        if (i4 < 128) {
            i4 = mn.an;
        } else if (i4 > 383) {
            i4 = 383;
        }
        az++;
        bw = bi.az[i4];
        bb = bi.ah[i4];
        bc = bi.az[i5];
        bz = bi.ah[i5];
        ck = cn[(i4 - 128) / 32][i5 / 64];
        ac = i;
        al = i2;
        ap = i3;
        au = i / mn.an;
        av = i3 / mn.an;
        ai = i6;
        ah = au - 25;
        if (ah < 0) {
            ah = 0;
        }
        ao = av - 25;
        if (ao < 0) {
            ao = 0;
        }
        ak = au + 25;
        if (ak > this.an) {
            ak = this.an;
        }
        ax = av + 25;
        if (ax > this.aa) {
            ax = this.aa;
        }
        bd();
        aw = 0;
        int i9 = this.as;
        while (i9 < this.ad) {
            cv[][] cvVarArr = this.ay[i9];
            int i10 = ah;
            while (i10 < ak) {
                int i11 = ao;
                while (i11 < ax) {
                    cv cvVar2 = cvVarArr[i10][i11];
                    if (cvVar2 != null) {
                        if (cvVar2.aw * 1660813967 > i6 || (!ck[(i10 - au) + 25][(i11 - av) + 25] && this.ag[i9][i10][i11] - i2 < 2000)) {
                            cvVar2.ai = false;
                            cvVar2.az = false;
                            cvVar2.ak = 0;
                        } else {
                            cvVar2.ai = true;
                            cvVar2.az = true;
                            if (cvVar2.aq * -1099785793 > 0) {
                                cvVar2.ah = true;
                            } else {
                                cvVar2.ah = false;
                            }
                            aw++;
                        }
                    }
                    i11++;
                }
                i10++;
            }
            i9++;
        }
        for (i9 = this.as; i9 < this.ad; i9++) {
            cvVarArr = this.ay[i9];
            for (i11 = -25; i11 <= 0; i11++) {
                cv cvVar3;
                int i12 = au + i11;
                int i13 = au - i11;
                if (i12 >= ah || i13 < ak) {
                    for (i10 = -25; i10 <= 0; i10++) {
                        i7 = av + i10;
                        i8 = av - i10;
                        if (i12 >= ah) {
                            if (i7 >= ao) {
                                cvVar = cvVarArr[i12][i7];
                                if (cvVar != null && cvVar.ai) {
                                    ba(cvVar, true);
                                }
                            }
                            if (i8 < ax) {
                                cvVar = cvVarArr[i12][i8];
                                if (cvVar != null && cvVar.ai) {
                                    ba(cvVar, true);
                                }
                            }
                        }
                        if (i13 < ak) {
                            if (i7 >= ao) {
                                cvVar3 = cvVarArr[i13][i7];
                                if (cvVar3 != null && cvVar3.ai) {
                                    ba(cvVar3, true);
                                }
                            }
                            if (i8 < ax) {
                                cvVar3 = cvVarArr[i13][i8];
                                if (cvVar3 != null && cvVar3.ai) {
                                    ba(cvVar3, true);
                                }
                            }
                        }
                        if (aw == 0) {
                            bh = false;
                            return;
                        }
                    }
                    continue;
                }
            }
        }
        for (i9 = this.as; i9 < this.ad; i9++) {
            cvVarArr = this.ay[i9];
            for (i11 = -25; i11 <= 0; i11++) {
                i12 = au + i11;
                i13 = au - i11;
                if (i12 >= ah || i13 < ak) {
                    for (i10 = -25; i10 <= 0; i10++) {
                        i7 = av + i10;
                        i8 = av - i10;
                        if (i12 >= ah) {
                            if (i7 >= ao) {
                                cvVar = cvVarArr[i12][i7];
                                if (cvVar != null && cvVar.ai) {
                                    ba(cvVar, false);
                                }
                            }
                            if (i8 < ax) {
                                cvVar = cvVarArr[i12][i8];
                                if (cvVar != null && cvVar.ai) {
                                    ba(cvVar, false);
                                }
                            }
                        }
                        if (i13 < ak) {
                            if (i7 >= ao) {
                                cvVar3 = cvVarArr[i13][i7];
                                if (cvVar3 != null && cvVar3.ai) {
                                    ba(cvVar3, false);
                                }
                            }
                            if (i8 < ax) {
                                cvVar3 = cvVarArr[i13][i8];
                                if (cvVar3 != null && cvVar3.ai) {
                                    ba(cvVar3, false);
                                }
                            }
                        }
                        if (aw == 0) {
                            bh = false;
                            return;
                        }
                    }
                    continue;
                }
            }
        }
        bh = false;
    }

    public void gd(ch chVar, int i, int i2, int i3, int i4, int i5, int i6) {
        cv cvVar;
        ci = chVar;
        cc = ci.ad((byte) 2);
        if (i < 0) {
            i = 0;
        } else if (i >= this.an * mn.an) {
            i = (this.an * mn.an) - 1;
        }
        if (i3 < 0) {
            i3 = 0;
        } else if (i3 >= this.aa * mn.an) {
            i3 = (this.aa * mn.an) - 1;
        }
        if (i4 < 128) {
            i4 = mn.an;
        } else if (i4 > 383) {
            i4 = 383;
        }
        az++;
        bw = bi.az[i4];
        bb = bi.ah[i4];
        bc = bi.az[i5];
        bz = bi.ah[i5];
        ck = cn[(i4 - 128) / 32][i5 / 64];
        ac = i;
        al = i2;
        ap = i3;
        au = i / mn.an;
        av = i3 / mn.an;
        ai = i6;
        ah = au - 25;
        if (ah < 0) {
            ah = 0;
        }
        ao = av - 25;
        if (ao < 0) {
            ao = 0;
        }
        ak = au + 25;
        if (ak > this.an) {
            ak = this.an;
        }
        ax = av + 25;
        if (ax > this.aa) {
            ax = this.aa;
        }
        bd();
        aw = 0;
        int i7 = this.as;
        while (i7 < this.ad) {
            cv[][] cvVarArr = this.ay[i7];
            int i8 = ah;
            while (i8 < ak) {
                int i9 = ao;
                while (i9 < ax) {
                    cv cvVar2 = cvVarArr[i8][i9];
                    if (cvVar2 != null) {
                        if (cvVar2.aw * 1660813967 > i6 || (!ck[(i8 - au) + 25][(i9 - av) + 25] && this.ag[i7][i8][i9] - i2 < 2000)) {
                            cvVar2.ai = false;
                            cvVar2.az = false;
                            cvVar2.ak = 0;
                        } else {
                            cvVar2.ai = true;
                            cvVar2.az = true;
                            if (cvVar2.aq * -1099785793 > 0) {
                                cvVar2.ah = true;
                            } else {
                                cvVar2.ah = false;
                            }
                            aw++;
                        }
                    }
                    i9++;
                }
                i8++;
            }
            i7++;
        }
        for (i7 = this.as; i7 < this.ad; i7++) {
            cvVarArr = this.ay[i7];
            for (i9 = -25; i9 <= 0; i9++) {
                int i10;
                int i11;
                cv cvVar3;
                int i12 = au + i9;
                int i13 = au - i9;
                if (i12 >= ah || i13 < ak) {
                    for (i8 = -25; i8 <= 0; i8++) {
                        i10 = av + i8;
                        i11 = av - i8;
                        if (i12 >= ah) {
                            if (i10 >= ao) {
                                cvVar3 = cvVarArr[i12][i10];
                                if (cvVar3 != null && cvVar3.ai) {
                                    ba(cvVar3, true);
                                }
                            }
                            if (i11 < ax) {
                                cvVar3 = cvVarArr[i12][i11];
                                if (cvVar3 != null && cvVar3.ai) {
                                    ba(cvVar3, true);
                                }
                            }
                        }
                        if (i13 < ak) {
                            if (i10 >= ao) {
                                cvVar = cvVarArr[i13][i10];
                                if (cvVar != null && cvVar.ai) {
                                    ba(cvVar, true);
                                }
                            }
                            if (i11 < ax) {
                                cvVar = cvVarArr[i13][i11];
                                if (cvVar != null && cvVar.ai) {
                                    ba(cvVar, true);
                                }
                            }
                        }
                        if (aw == 0) {
                            bh = false;
                            return;
                        }
                    }
                    continue;
                }
            }
        }
        for (i7 = this.as; i7 < this.ad; i7++) {
            cvVarArr = this.ay[i7];
            for (i9 = -25; i9 <= 0; i9++) {
                i12 = au + i9;
                i13 = au - i9;
                if (i12 >= ah || i13 < ak) {
                    for (i8 = -25; i8 <= 0; i8++) {
                        i10 = av + i8;
                        i11 = av - i8;
                        if (i12 >= ah) {
                            if (i10 >= ao) {
                                cvVar3 = cvVarArr[i12][i10];
                                if (cvVar3 != null && cvVar3.ai) {
                                    ba(cvVar3, false);
                                }
                            }
                            if (i11 < ax) {
                                cvVar3 = cvVarArr[i12][i11];
                                if (cvVar3 != null && cvVar3.ai) {
                                    ba(cvVar3, false);
                                }
                            }
                        }
                        if (i13 < ak) {
                            if (i10 >= ao) {
                                cvVar = cvVarArr[i13][i10];
                                if (cvVar != null && cvVar.ai) {
                                    ba(cvVar, false);
                                }
                            }
                            if (i11 < ax) {
                                cvVar = cvVarArr[i13][i11];
                                if (cvVar != null && cvVar.ai) {
                                    ba(cvVar, false);
                                }
                            }
                        }
                        if (aw == 0) {
                            bh = false;
                            return;
                        }
                    }
                    continue;
                }
            }
        }
        bh = false;
    }

    void ba(cv cvVar, boolean z) {
        bs.ad(cvVar);
        while (true) {
            cv cvVar2 = (cv) bs.ag();
            if (cvVar2 != null) {
                if (cvVar2.az) {
                    cv cvVar3;
                    bs bsVar;
                    int i;
                    Object obj;
                    int i2;
                    int i3;
                    int i4;
                    int i5;
                    int i6;
                    int i7;
                    bu buVar;
                    kd kdVar;
                    int i8 = cvVar2.ad * -1459029351;
                    int i9 = cvVar2.an * 1969940691;
                    int i10 = cvVar2.af * -1335124319;
                    int i11 = cvVar2.aa * 756116047;
                    cv[][] cvVarArr = this.ay[i10];
                    if (cvVar2.ai) {
                        if (z) {
                            if (i10 > 0) {
                                cvVar3 = this.ay[i10 - 1][i8][i9];
                                if (cvVar3 != null && cvVar3.az) {
                                }
                            }
                            if (i8 <= au && i8 > ah) {
                                cvVar3 = cvVarArr[i8 - 1][i9];
                                if (cvVar3 != null) {
                                    if (cvVar3.az) {
                                        if (!cvVar3.ai) {
                                            if (((cvVar2.ab * -901382725) & 1) == 0) {
                                            }
                                        }
                                    }
                                }
                            }
                            if (i8 >= au && i8 < ak - 1) {
                                cvVar3 = cvVarArr[i8 + 1][i9];
                                if (cvVar3 != null) {
                                    if (cvVar3.az) {
                                        if (!cvVar3.ai) {
                                            if (((cvVar2.ab * -901382725) & 4) == 0) {
                                            }
                                        }
                                    }
                                }
                            }
                            if (i9 <= av && i9 > ao) {
                                cvVar3 = cvVarArr[i8][i9 - 1];
                                if (cvVar3 != null) {
                                    if (cvVar3.az) {
                                        if (!cvVar3.ai) {
                                            if (((cvVar2.ab * -901382725) & 8) == 0) {
                                            }
                                        }
                                    }
                                }
                            }
                            if (i9 >= av && i9 < ax - 1) {
                                cvVar3 = cvVarArr[i8][i9 + 1];
                                if (cvVar3 != null) {
                                    if (cvVar3.az) {
                                        if (!cvVar3.ai) {
                                            if (((cvVar2.ab * -901382725) & 2) == 0) {
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            z = true;
                        }
                        cvVar2.ai = false;
                        if (cvVar2.av != null) {
                            cv cvVar4 = cvVar2.av;
                            if (cvVar4.ag != null) {
                                if (!bs(0, i8, i9)) {
                                    ci.an(this, cvVar4.ag, 0, bw, bb, bc, bz, i8, i9, 971008418);
                                }
                            } else if (!(cvVar4.ay == null || bs(0, i8, i9))) {
                                ci.aa(this, cvVar4.ay, bw, bb, bc, bz, i8, i9, (byte) 1);
                            }
                            bsVar = cvVar4.as;
                            if (bsVar != null) {
                                cc.an(bsVar.ay, 0, bw, bb, bc, bz, (bsVar.ad * 723683627) - ac, (bsVar.af * 1690727225) - al, (bsVar.an * -247091605) - ap, bsVar.ar * 2560327866738495599L);
                            }
                            for (i = 0; i < cvVar4.aq * -1099785793; i++) {
                                cm cmVar = cvVar4.am[i];
                                if (cmVar != null) {
                                    cc.an(cmVar.ay, cmVar.as * -1602093333, bw, bb, bc, bz, (cmVar.aa * -1585528459) - ac, (cmVar.ad * 2005986389) - al, (cmVar.ag * 1813828693) - ap, cmVar.at * -966509501471514439L);
                                }
                            }
                        }
                        obj = null;
                        if (cvVar2.ag != null) {
                            if (!bs(i11, i8, i9)) {
                                if (cvVar2.ag.an * -295616241 != 12345678 || (bh && i10 <= bf)) {
                                    ci.an(this, cvVar2.ag, i11, bw, bb, bc, bz, i8, i9, 643908675);
                                    obj = 1;
                                } else {
                                    i = 1;
                                }
                            }
                        } else if (!(cvVar2.ay == null || bs(i11, i8, i9))) {
                            obj = 1;
                            ci.aa(this, cvVar2.ay, bw, bb, bc, bz, i8, i9, (byte) 1);
                        }
                        i2 = 0;
                        i3 = 0;
                        bs bsVar2 = cvVar2.as;
                        bm bmVar = cvVar2.ar;
                        if (!(bsVar2 == null && bmVar == null)) {
                            if (au == i8) {
                                i2 = 1;
                            } else if (au < i8) {
                                i2 = 2;
                            }
                            if (av == i9) {
                                i2 += 3;
                            } else if (av > i9) {
                                i2 += 6;
                            }
                            i3 = bm[i2];
                            cvVar2.au = bj[i2] * 2007351629;
                        }
                        int i12 = i3;
                        i3 = i2;
                        i2 = i12;
                        if (bsVar2 != null) {
                            if (((bsVar2.aa * 1661157279) & br[i3]) == 0) {
                                cvVar2.ak = 0;
                            } else if (bsVar2.aa * 1661157279 == 16) {
                                cvVar2.ak = -1086755455;
                                cvVar2.ao = bi[i3] * 1274889655;
                                cvVar2.ax = 1974812929 - (cvVar2.ao * -1230975059);
                            } else if (bsVar2.aa * 1661157279 == 32) {
                                cvVar2.ak = 2121456386;
                                cvVar2.ao = bq[i3] * 1274889655;
                                cvVar2.ax = -345341438 - (cvVar2.ao * -1230975059);
                            } else if (bsVar2.aa * 1661157279 == 64) {
                                cvVar2.ak = -52054524;
                                cvVar2.ao = bo[i3] * 1274889655;
                                cvVar2.ax = -690682876 - (cvVar2.ao * -1230975059);
                            } else {
                                cvVar2.ak = 1034700931;
                                cvVar2.ao = cv[i3] * 1274889655;
                                cvVar2.ax = 1629471491 - (cvVar2.ao * -1230975059);
                            }
                            if (((bsVar2.aa * 1661157279) & i2) != 0) {
                                if (!bm(i11, i8, i9, bsVar2.aa * 1661157279)) {
                                    cc.an(bsVar2.ay, 0, bw, bb, bc, bz, (bsVar2.ad * 723683627) - ac, (bsVar2.af * 1690727225) - al, (bsVar2.an * -247091605) - ap, 2560327866738495599L * bsVar2.ar);
                                }
                            }
                            if (((bsVar2.ag * 862683655) & i2) != 0) {
                                if (!bm(i11, i8, i9, bsVar2.ag * 862683655)) {
                                    cc.an(bsVar2.as, 0, bw, bb, bc, bz, (bsVar2.ad * 723683627) - ac, (bsVar2.af * 1690727225) - al, (bsVar2.an * -247091605) - ap, bsVar2.ar * 2560327866738495599L);
                                }
                            }
                        }
                        if (bmVar != null) {
                            if (!br(i11, i8, i9, bmVar.ar.bo * 1500767459)) {
                                if ((i2 & (bmVar.ag * -372796565)) != 0) {
                                    cc.an(bmVar.ar, 0, bw, bb, bc, bz, ((bmVar.ad * 1113941803) - ac) + (bmVar.an * -201528243), (bmVar.af * 80320391) - al, ((bmVar.aa * 379243631) - ap) + (bmVar.as * 1518383757), bmVar.ae * 6162409934167472955L);
                                } else if (bmVar.ag * -372796565 == 256) {
                                    i4 = (bmVar.ad * 1113941803) - ac;
                                    i5 = (bmVar.af * 80320391) - al;
                                    i6 = (bmVar.aa * 379243631) - ap;
                                    i7 = bmVar.ay * -862989101;
                                    if (i7 == 1 || i7 == 2) {
                                        i3 = -i4;
                                    } else {
                                        i3 = i4;
                                    }
                                    if (i7 == 2 || i7 == 3) {
                                        i2 = -i6;
                                    } else {
                                        i2 = i6;
                                    }
                                    if (i2 < i3) {
                                        cc.an(bmVar.ar, 0, bw, bb, bc, bz, i4 + (bmVar.an * -201528243), i5, i6 + (bmVar.as * 1518383757), bmVar.ae * 6162409934167472955L);
                                    } else if (bmVar.aj != null) {
                                        cc.an(bmVar.aj, 0, bw, bb, bc, bz, i4, i5, i6, bmVar.ae * 6162409934167472955L);
                                    }
                                }
                            }
                        }
                        if (obj != null) {
                            bx bxVar = cvVar2.aj;
                            if (bxVar != null) {
                                cc.an(bxVar.aa, 0, bw, bb, bc, bz, (bxVar.ad * -742487459) - ac, (bxVar.af * -498247067) - al, (bxVar.an * -369578963) - ap, bxVar.ag * -7401358002501475335L);
                            }
                            buVar = cvVar2.ae;
                            if (buVar != null && buVar.ar * 1086909329 == 0) {
                                if (buVar.ag != null) {
                                    cc.an(buVar.ag, 0, bw, bb, bc, bz, (buVar.ad * -1498410483) - ac, (buVar.af * 194954347) - al, (buVar.an * -1321964687) - ap, buVar.as * -8252983317974363593L);
                                }
                                if (buVar.ay != null) {
                                    cc.an(buVar.ay, 0, bw, bb, bc, bz, (buVar.ad * -1498410483) - ac, (buVar.af * 194954347) - al, (buVar.an * -1321964687) - ap, buVar.as * -8252983317974363593L);
                                }
                                if (buVar.aa != null) {
                                    cc.an(buVar.aa, 0, bw, bb, bc, bz, (buVar.ad * -1498410483) - ac, (buVar.af * 194954347) - al, (buVar.an * -1321964687) - ap, buVar.as * -8252983317974363593L);
                                }
                            }
                        }
                        i = cvVar2.ab * -901382725;
                        if (i != 0) {
                            kd kdVar2;
                            if (i8 < au && (i & 4) != 0) {
                                kdVar2 = cvVarArr[i8 + 1][i9];
                                if (kdVar2 != null && kdVar2.az) {
                                    bs.ad(kdVar2);
                                }
                            }
                            if (i9 < av && (i & 2) != 0) {
                                kdVar2 = cvVarArr[i8][i9 + 1];
                                if (kdVar2 != null && kdVar2.az) {
                                    bs.ad(kdVar2);
                                }
                            }
                            if (i8 > au && (i & 1) != 0) {
                                kdVar2 = cvVarArr[i8 - 1][i9];
                                if (kdVar2 != null && kdVar2.az) {
                                    bs.ad(kdVar2);
                                }
                            }
                            if (i9 > av && (i & 8) != 0) {
                                kdVar = cvVarArr[i8][i9 - 1];
                                if (kdVar != null && kdVar.az) {
                                    bs.ad(kdVar);
                                }
                            }
                        }
                    }
                    if (cvVar2.ak * -1699317885 != 0) {
                        i = 0;
                        while (i < cvVar2.aq * -1099785793) {
                            if (cvVar2.am[i].am * 346660337 != az && (cvVar2.at[i] & (cvVar2.ak * -1699317885)) == cvVar2.ao * 1950722055) {
                                obj = null;
                                break;
                            }
                            i++;
                        }
                        i = 1;
                        if (obj != null) {
                            bsVar = cvVar2.as;
                            if (!bm(i11, i8, i9, bsVar.aa * 1661157279)) {
                                cc.an(bsVar.ay, 0, bw, bb, bc, bz, (bsVar.ad * 723683627) - ac, (bsVar.af * 1690727225) - al, (bsVar.an * -247091605) - ap, bsVar.ar * 2560327866738495599L);
                            }
                            cvVar2.ak = 0;
                        }
                    }
                    if (cvVar2.ah) {
                        int i13;
                        int i14 = cvVar2.aq * -1099785793;
                        cvVar2.ah = false;
                        int i15 = 0;
                        i7 = 0;
                        while (i7 < i14) {
                            cm cmVar2 = cvVar2.am[i7];
                            if (cmVar2.am * 346660337 != az) {
                                for (i3 = cmVar2.an * 842696807; i3 <= cmVar2.ar * 1813855353; i3++) {
                                    for (i2 = cmVar2.aj * -917866941; i2 <= cmVar2.ae * -139021587; i2++) {
                                        cv cvVar5 = cvVarArr[i3][i2];
                                        if (cvVar5.ai) {
                                            cvVar2.ah = true;
                                            i = i15;
                                            break;
                                        }
                                        if (cvVar5.ak * -1699317885 != 0) {
                                            i = 0;
                                            if (i3 > cmVar2.an * 842696807) {
                                                i = 1;
                                            }
                                            if (i3 < cmVar2.ar * 1813855353) {
                                                i += 4;
                                            }
                                            if (i2 > cmVar2.aj * -917866941) {
                                                i += 8;
                                            }
                                            if (i2 < cmVar2.ae * -139021587) {
                                                i += 2;
                                            }
                                            if ((i & (cvVar5.ak * -1699317885)) == cvVar2.ax * 1264794883) {
                                                cvVar2.ah = true;
                                                i = i15;
                                                break;
                                            }
                                        }
                                    }
                                }
                                i = i15 + 1;
                                bg[i15] = cmVar2;
                                i3 = au - (cmVar2.an * 842696807);
                                i2 = (cmVar2.ar * 1813855353) - au;
                                if (i2 <= i3) {
                                    i2 = i3;
                                }
                                i3 = av - (cmVar2.aj * -917866941);
                                i13 = (cmVar2.ae * -139021587) - av;
                                if (i13 > i3) {
                                    cmVar2.aq = (i2 + i13) * 976695079;
                                } else {
                                    try {
                                        cmVar2.aq = (i2 + i3) * 976695079;
                                    } catch (Exception e) {
                                        cvVar2.ah = false;
                                    }
                                }
                            } else {
                                i = i15;
                            }
                            i7++;
                            i15 = i;
                        }
                        while (i15 > 0) {
                            i3 = -50;
                            i = -1;
                            for (i2 = 0; i2 < i15; i2++) {
                                cm cmVar3 = bg[i2];
                                if (cmVar3.am * 346660337 != az) {
                                    if (cmVar3.aq * 569462935 > i3) {
                                        i3 = cmVar3.aq * 569462935;
                                        i = i2;
                                    } else if (cmVar3.aq * 569462935 == i3) {
                                        i14 = (cmVar3.aa * -1585528459) - ac;
                                        i7 = (cmVar3.ag * 1813828693) - ap;
                                        int i16 = (bg[i].aa * -1585528459) - ac;
                                        i13 = (bg[i].ag * 1813828693) - ap;
                                        if ((i7 * i7) + (i14 * i14) > (i16 * i16) + (i13 * i13)) {
                                            i = i2;
                                        }
                                    }
                                }
                            }
                            if (i == -1) {
                                break;
                            }
                            cm cmVar4 = bg[i];
                            cmVar4.am = az * 1394455313;
                            if (!bj(i11, cmVar4.an * 842696807, cmVar4.ar * 1813855353, cmVar4.aj * -917866941, cmVar4.ae * -139021587, cmVar4.ay.bo * 1500767459)) {
                                cc.an(cmVar4.ay, cmVar4.as * -1602093333, bw, bb, bc, bz, (cmVar4.aa * -1585528459) - ac, (cmVar4.ad * 2005986389) - al, (cmVar4.ag * 1813828693) - ap, cmVar4.at * -966509501471514439L);
                            }
                            for (i2 = cmVar4.an * 842696807; i2 <= cmVar4.ar * 1813855353; i2++) {
                                i = cmVar4.aj * -917866941;
                                while (i <= cmVar4.ae * -139021587) {
                                    kd kdVar3 = cvVarArr[i2][i];
                                    if (kdVar3.ak * -1699317885 != 0) {
                                        bs.ad(kdVar3);
                                    } else if (!(i2 == i8 && i == i9) && kdVar3.az) {
                                        bs.ad(kdVar3);
                                    }
                                    i++;
                                }
                            }
                        }
                        if (cvVar2.ah) {
                        }
                    }
                    if (cvVar2.az && cvVar2.ak * -1699317885 == 0) {
                        if (i8 <= au && i8 > ah) {
                            cvVar3 = cvVarArr[i8 - 1][i9];
                            if (cvVar3 != null && cvVar3.az) {
                            }
                        }
                        if (i8 >= au && i8 < ak - 1) {
                            cvVar3 = cvVarArr[i8 + 1][i9];
                            if (cvVar3 != null && cvVar3.az) {
                            }
                        }
                        if (i9 <= av && i9 > ao) {
                            cvVar3 = cvVarArr[i8][i9 - 1];
                            if (cvVar3 != null && cvVar3.az) {
                            }
                        }
                        if (i9 >= av && i9 < ax - 1) {
                            cvVar3 = cvVarArr[i8][i9 + 1];
                            if (cvVar3 != null && cvVar3.az) {
                            }
                        }
                        cvVar2.az = false;
                        aw--;
                        buVar = cvVar2.ae;
                        if (!(buVar == null || buVar.ar * 1086909329 == 0)) {
                            if (buVar.ag != null) {
                                cc.an(buVar.ag, 0, bw, bb, bc, bz, (buVar.ad * -1498410483) - ac, ((buVar.af * 194954347) - al) - (buVar.ar * 1086909329), (buVar.an * -1321964687) - ap, buVar.as * -8252983317974363593L);
                            }
                            if (buVar.ay != null) {
                                cc.an(buVar.ay, 0, bw, bb, bc, bz, (buVar.ad * -1498410483) - ac, ((buVar.af * 194954347) - al) - (buVar.ar * 1086909329), (buVar.an * -1321964687) - ap, buVar.as * -8252983317974363593L);
                            }
                            if (buVar.aa != null) {
                                cc.an(buVar.aa, 0, bw, bb, bc, bz, (buVar.ad * -1498410483) - ac, ((buVar.af * 194954347) - al) - (buVar.ar * 1086909329), (buVar.an * -1321964687) - ap, buVar.as * -8252983317974363593L);
                            }
                        }
                        if (cvVar2.au * 826498949 != 0) {
                            bm bmVar2 = cvVar2.ar;
                            if (bmVar2 != null) {
                                if (!br(i11, i8, i9, bmVar2.ar.bo * 1500767459)) {
                                    if (((bmVar2.ag * -372796565) & (cvVar2.au * 826498949)) != 0) {
                                        cc.an(bmVar2.ar, 0, bw, bb, bc, bz, ((bmVar2.ad * 1113941803) - ac) + (bmVar2.an * -201528243), (bmVar2.af * 80320391) - al, ((bmVar2.aa * 379243631) - ap) + (bmVar2.as * 1518383757), bmVar2.ae * 6162409934167472955L);
                                    } else if (bmVar2.ag * -372796565 == 256) {
                                        i4 = (bmVar2.ad * 1113941803) - ac;
                                        i5 = (bmVar2.af * 80320391) - al;
                                        i6 = (bmVar2.aa * 379243631) - ap;
                                        i7 = bmVar2.ay * -862989101;
                                        if (i7 == 1 || i7 == 2) {
                                            i2 = -i4;
                                        } else {
                                            i2 = i4;
                                        }
                                        if (i7 == 2 || i7 == 3) {
                                            i = -i6;
                                        } else {
                                            i = i6;
                                        }
                                        if (i >= i2) {
                                            cc.an(bmVar2.ar, 0, bw, bb, bc, bz, i4 + (bmVar2.an * -201528243), i5, i6 + (bmVar2.as * 1518383757), bmVar2.ae * 6162409934167472955L);
                                        } else if (bmVar2.aj != null) {
                                            cc.an(bmVar2.aj, 0, bw, bb, bc, bz, i4, i5, i6, bmVar2.ae * 6162409934167472955L);
                                        }
                                    }
                                }
                            }
                            bsVar = cvVar2.as;
                            if (bsVar != null) {
                                if (((bsVar.ag * 862683655) & (cvVar2.au * 826498949)) != 0) {
                                    if (!bm(i11, i8, i9, bsVar.ag * 862683655)) {
                                        cc.an(bsVar.as, 0, bw, bb, bc, bz, (bsVar.ad * 723683627) - ac, (bsVar.af * 1690727225) - al, (bsVar.an * -247091605) - ap, bsVar.ar * 2560327866738495599L);
                                    }
                                }
                                if (((bsVar.aa * 1661157279) & (cvVar2.au * 826498949)) != 0) {
                                    if (!bm(i11, i8, i9, bsVar.aa * 1661157279)) {
                                        cc.an(bsVar.ay, 0, bw, bb, bc, bz, (bsVar.ad * 723683627) - ac, (bsVar.af * 1690727225) - al, (bsVar.an * -247091605) - ap, bsVar.ar * 2560327866738495599L);
                                    }
                                }
                            }
                        }
                        if (i10 < this.ad - 1) {
                            kdVar = this.ay[i10 + 1][i8][i9];
                            if (kdVar != null && kdVar.az) {
                                bs.ad(kdVar);
                            }
                        }
                        if (i8 < au) {
                            kdVar = cvVarArr[i8 + 1][i9];
                            if (kdVar != null && kdVar.az) {
                                bs.ad(kdVar);
                            }
                        }
                        if (i9 < av) {
                            kdVar = cvVarArr[i8][i9 + 1];
                            if (kdVar != null && kdVar.az) {
                                bs.ad(kdVar);
                            }
                        }
                        if (i8 > au) {
                            kdVar = cvVarArr[i8 - 1][i9];
                            if (kdVar != null && kdVar.az) {
                                bs.ad(kdVar);
                            }
                        }
                        if (i9 > av) {
                            kdVar = cvVarArr[i8][i9 - 1];
                            if (kdVar != null && kdVar.az) {
                                bs.ad(kdVar);
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    static boolean bl(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z = true;
        if (i2 < i3 && i2 < i4 && i2 < i5) {
            return false;
        }
        if (i2 > i3 && i2 > i4 && i2 > i5) {
            return false;
        }
        if (i < i6 && i < i7 && i < i8) {
            return false;
        }
        if (i > i6 && i > i7 && i > i8) {
            return false;
        }
        int i9 = ((i2 - i3) * (i7 - i6)) - ((i - i6) * (i4 - i3));
        int i10 = ((i2 - i4) * (i8 - i7)) - ((i - i7) * (i5 - i4));
        int i11 = ((i2 - i5) * (i6 - i8)) - ((i - i8) * (i3 - i5));
        if (i9 != 0) {
            if (i9 < 0) {
                if (i10 > 0 || i11 > 0) {
                    return false;
                }
                return true;
            } else if (i10 < 0 || i11 < 0) {
                return false;
            } else {
                return true;
            }
        } else if (i10 == 0) {
            return true;
        } else {
            if (i10 < 0) {
                if (i11 > 0) {
                    z = false;
                }
            } else if (i11 < 0) {
                z = false;
            }
            return z;
        }
    }

    static boolean gn(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z = true;
        if (i2 < i3 && i2 < i4 && i2 < i5) {
            return false;
        }
        if (i2 > i3 && i2 > i4 && i2 > i5) {
            return false;
        }
        if (i < i6 && i < i7 && i < i8) {
            return false;
        }
        if (i > i6 && i > i7 && i > i8) {
            return false;
        }
        int i9 = ((i2 - i3) * (i7 - i6)) - ((i - i6) * (i4 - i3));
        int i10 = ((i2 - i4) * (i8 - i7)) - ((i - i7) * (i5 - i4));
        int i11 = ((i2 - i5) * (i6 - i8)) - ((i - i8) * (i3 - i5));
        if (i9 != 0) {
            if (i9 < 0) {
                if (i10 > 0 || i11 > 0) {
                    z = false;
                }
            } else if (i10 < 0 || i11 < 0) {
                z = false;
            }
            return z;
        } else if (i10 == 0) {
            return true;
        } else {
            if (i10 < 0) {
                if (i11 > 0) {
                    z = false;
                }
            } else if (i11 < 0) {
                z = false;
            }
            return z;
        }
    }

    void bd() {
        int i = bn[ai];
        bp[] bpVarArr = ba[ai];
        bl = 0;
        for (int i2 = 0; i2 < i; i2++) {
            bp bpVar = bpVarArr[i2];
            int i3;
            int i4;
            int i5;
            int i6;
            Object obj;
            bp[] bpVarArr2;
            if (bpVar.ag * -1615139563 == 1) {
                i3 = ((bpVar.af * 1544885819) - au) + 25;
                if (i3 >= 0 && i3 <= 50) {
                    i4 = ((bpVar.an * 1895096503) - av) + 25;
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    i5 = ((bpVar.aa * -20220437) - av) + 25;
                    if (i5 > 50) {
                        i5 = 50;
                    }
                    while (i4 <= i5) {
                        i6 = i4 + 1;
                        if (ck[i3][i4]) {
                            obj = 1;
                            break;
                        }
                        i4 = i6;
                    }
                    obj = null;
                    if (obj != null) {
                        i4 = ac - (bpVar.ay * -910324983);
                        if (i4 > 32) {
                            bpVar.am = -1484401501;
                        } else if (i4 < -32) {
                            bpVar.am = 1326164294;
                            i4 = -i4;
                        }
                        bpVar.aw = ((((bpVar.ar * -819450565) - ap) << 8) / i4) * 80809447;
                        bpVar.ai = ((((bpVar.aj * -474281063) - ap) << 8) / i4) * 1152873517;
                        bpVar.az = ((((bpVar.ae * 15932113) - al) << 8) / i4) * 612645039;
                        bpVar.ah = ((((bpVar.aq * -1285950259) - al) << 8) / i4) * 1045217449;
                        bpVarArr2 = bd;
                        i5 = bl;
                        bl = i5 + 1;
                        bpVarArr2[i5] = bpVar;
                    }
                }
            } else if (bpVar.ag * -1615139563 == 2) {
                i3 = ((bpVar.an * 1895096503) - av) + 25;
                if (i3 >= 0) {
                    if (i3 <= 50) {
                        i4 = ((bpVar.af * 1544885819) - au) + 25;
                        if (i4 < 0) {
                            i4 = 0;
                        }
                        i5 = ((bpVar.ad * 523867397) - au) + 25;
                        if (i5 > 50) {
                            i5 = 50;
                        }
                        while (i4 <= i5) {
                            i6 = i4 + 1;
                            if (ck[i4][i3]) {
                                obj = 1;
                                break;
                            }
                            i4 = i6;
                        }
                        obj = null;
                        if (obj != null) {
                            i4 = ap - (bpVar.ar * -819450565);
                            if (i4 > 32) {
                                bpVar.am = -158237207;
                            } else if (i4 < -32) {
                                bpVar.am = -1642638708;
                                i4 = -i4;
                            }
                            bpVar.at = ((((bpVar.ay * -910324983) - ac) << 8) / i4) * -1344487969;
                            bpVar.ab = ((((bpVar.as * -2040807815) - ac) << 8) / i4) * 2145526461;
                            bpVar.az = ((((bpVar.ae * 15932113) - al) << 8) / i4) * 612645039;
                            bpVar.ah = ((((bpVar.aq * -1285950259) - al) << 8) / i4) * 1045217449;
                            bpVarArr2 = bd;
                            i5 = bl;
                            bl = i5 + 1;
                            bpVarArr2[i5] = bpVar;
                        }
                    }
                }
            } else if (bpVar.ag * -1615139563 == 4) {
                int i7 = (bpVar.ae * 15932113) - al;
                if (i7 > mn.an) {
                    int i8;
                    i4 = ((bpVar.an * 1895096503) - av) + 25;
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    i5 = ((bpVar.aa * -20220437) - av) + 25;
                    if (i5 > 50) {
                        i8 = 50;
                    } else {
                        i8 = i5;
                    }
                    if (i4 <= i8) {
                        i5 = ((bpVar.af * 1544885819) - au) + 25;
                        if (i5 < 0) {
                            i5 = 0;
                        }
                        int i9 = ((bpVar.ad * 523867397) - au) + 25;
                        if (i9 > 50) {
                            i9 = 50;
                        }
                        for (i3 = i5; i3 <= i9; i3++) {
                            for (i5 = i4; i5 <= i8; i5++) {
                                if (ck[i3][i5]) {
                                    obj = 1;
                                    break;
                                }
                            }
                        }
                        obj = null;
                        if (obj != null) {
                            bpVar.am = 1167927087;
                            bpVar.at = ((((bpVar.ay * -910324983) - ac) << 8) / i7) * -1344487969;
                            bpVar.ab = ((((bpVar.as * -2040807815) - ac) << 8) / i7) * 2145526461;
                            bpVar.aw = ((((bpVar.ar * -819450565) - ap) << 8) / i7) * 80809447;
                            bpVar.ai = ((((bpVar.aj * -474281063) - ap) << 8) / i7) * 1152873517;
                            bpVarArr2 = bd;
                            i5 = bl;
                            bl = i5 + 1;
                            bpVarArr2[i5] = bpVar;
                        }
                    }
                }
            }
        }
    }

    void gb() {
        int i = bn[ai];
        bp[] bpVarArr = ba[ai];
        bl = 0;
        for (int i2 = 0; i2 < i; i2++) {
            bp bpVar = bpVarArr[i2];
            int i3;
            int i4;
            int i5;
            int i6;
            Object obj;
            bp[] bpVarArr2;
            if (bpVar.ag * -1615139563 == 1) {
                i3 = ((bpVar.af * 1544885819) - au) + 25;
                if (i3 >= 0 && i3 <= 50) {
                    i4 = ((bpVar.an * 1895096503) - av) + 25;
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    i5 = ((bpVar.aa * -20220437) - av) + 25;
                    if (i5 > 50) {
                        i5 = 50;
                    }
                    while (i4 <= i5) {
                        i6 = i4 + 1;
                        if (ck[i3][i4]) {
                            obj = 1;
                            break;
                        }
                        i4 = i6;
                    }
                    obj = null;
                    if (obj != null) {
                        i4 = ac - (bpVar.ay * -910324983);
                        if (i4 > 32) {
                            bpVar.am = -1484401501;
                        } else if (i4 < -32) {
                            bpVar.am = 1326164294;
                            i4 = -i4;
                        }
                        bpVar.aw = ((((bpVar.ar * -819450565) - ap) << 8) / i4) * 80809447;
                        bpVar.ai = ((((bpVar.aj * -474281063) - ap) << 8) / i4) * 1152873517;
                        bpVar.az = ((((bpVar.ae * 15932113) - al) << 8) / i4) * 612645039;
                        bpVar.ah = ((((bpVar.aq * -1285950259) - al) << 8) / i4) * 1045217449;
                        bpVarArr2 = bd;
                        i5 = bl;
                        bl = i5 + 1;
                        bpVarArr2[i5] = bpVar;
                    }
                }
            } else if (bpVar.ag * -1615139563 == 2) {
                i3 = ((bpVar.an * 1895096503) - av) + 25;
                if (i3 >= 0) {
                    if (i3 <= 50) {
                        i4 = ((bpVar.af * 1544885819) - au) + 25;
                        if (i4 < 0) {
                            i4 = 0;
                        }
                        i5 = ((bpVar.ad * 523867397) - au) + 25;
                        if (i5 > 50) {
                            i5 = 50;
                        }
                        while (i4 <= i5) {
                            i6 = i4 + 1;
                            if (ck[i4][i3]) {
                                obj = 1;
                                break;
                            }
                            i4 = i6;
                        }
                        obj = null;
                        if (obj != null) {
                            i4 = ap - (bpVar.ar * -819450565);
                            if (i4 > 32) {
                                bpVar.am = -158237207;
                            } else if (i4 < -32) {
                                bpVar.am = -1642638708;
                                i4 = -i4;
                            }
                            bpVar.at = ((((bpVar.ay * -910324983) - ac) << 8) / i4) * -1344487969;
                            bpVar.ab = ((((bpVar.as * -2040807815) - ac) << 8) / i4) * 2145526461;
                            bpVar.az = ((((bpVar.ae * 15932113) - al) << 8) / i4) * 612645039;
                            bpVar.ah = ((((bpVar.aq * -1285950259) - al) << 8) / i4) * 1045217449;
                            bpVarArr2 = bd;
                            i5 = bl;
                            bl = i5 + 1;
                            bpVarArr2[i5] = bpVar;
                        }
                    }
                }
            } else if (bpVar.ag * -1615139563 == 4) {
                int i7 = (bpVar.ae * 15932113) - al;
                if (i7 > mn.an) {
                    int i8;
                    i4 = ((bpVar.an * 1895096503) - av) + 25;
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    i5 = ((bpVar.aa * -20220437) - av) + 25;
                    if (i5 > 50) {
                        i8 = 50;
                    } else {
                        i8 = i5;
                    }
                    if (i4 <= i8) {
                        i5 = ((bpVar.af * 1544885819) - au) + 25;
                        if (i5 < 0) {
                            i5 = 0;
                        }
                        int i9 = ((bpVar.ad * 523867397) - au) + 25;
                        if (i9 > 50) {
                            i9 = 50;
                        }
                        for (i3 = i5; i3 <= i9; i3++) {
                            for (i5 = i4; i5 <= i8; i5++) {
                                if (ck[i3][i5]) {
                                    obj = 1;
                                    break;
                                }
                            }
                        }
                        obj = null;
                        if (obj != null) {
                            bpVar.am = 1167927087;
                            bpVar.at = ((((bpVar.ay * -910324983) - ac) << 8) / i7) * -1344487969;
                            bpVar.ab = ((((bpVar.as * -2040807815) - ac) << 8) / i7) * 2145526461;
                            bpVar.aw = ((((bpVar.ar * -819450565) - ap) << 8) / i7) * 80809447;
                            bpVar.ai = ((((bpVar.aj * -474281063) - ap) << 8) / i7) * 1152873517;
                            bpVarArr2 = bd;
                            i5 = bl;
                            bl = i5 + 1;
                            bpVarArr2[i5] = bpVar;
                        }
                    }
                }
            }
        }
    }

    void ge() {
        int i = bn[ai];
        bp[] bpVarArr = ba[ai];
        bl = 0;
        for (int i2 = 0; i2 < i; i2++) {
            bp bpVar = bpVarArr[i2];
            int i3;
            int i4;
            int i5;
            int i6;
            Object obj;
            bp[] bpVarArr2;
            if (bpVar.ag * -1573132496 == 1) {
                i3 = ((bpVar.af * 572267944) - au) + 25;
                if (i3 >= 0 && i3 <= 50) {
                    i4 = ((bpVar.an * 125467822) - av) + 25;
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    i5 = ((bpVar.aa * -20220437) - av) + 25;
                    if (i5 > 50) {
                        i5 = -1486229695;
                    }
                    while (i4 <= i5) {
                        i6 = i4 + 1;
                        if (ck[i3][i4]) {
                            obj = 1;
                            break;
                        }
                        i4 = i6;
                    }
                    obj = null;
                    if (obj != null) {
                        i4 = ac - (bpVar.ay * 100333416);
                        if (i4 > 32) {
                            bpVar.am = -1484401501;
                        } else if (i4 < -32) {
                            bpVar.am = 1326164294;
                            i4 = -i4;
                        }
                        bpVar.aw = ((((bpVar.ar * -1967306153) - ap) << 8) / i4) * 80809447;
                        bpVar.ai = ((((bpVar.aj * -474281063) - ap) << 8) / i4) * 832213462;
                        bpVar.az = ((((bpVar.ae * 2027765626) - al) << 8) / i4) * 612645039;
                        bpVar.ah = ((((bpVar.aq * 1544462883) - al) << 8) / i4) * 1045217449;
                        bpVarArr2 = bd;
                        i5 = bl;
                        bl = i5 + 1;
                        bpVarArr2[i5] = bpVar;
                    }
                }
            } else if (bpVar.ag * -1615139563 == 2) {
                i3 = ((bpVar.an * 1895096503) - av) + 25;
                if (i3 >= 0 && i3 <= 50) {
                    i4 = ((bpVar.af * -1441134874) - au) + 25;
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    i5 = ((bpVar.ad * 523867397) - au) + 25;
                    if (i5 > -622307048) {
                        i5 = 1042204040;
                    }
                    while (i4 <= i5) {
                        i6 = i4 + 1;
                        if (ck[i4][i3]) {
                            obj = 1;
                            break;
                        }
                        i4 = i6;
                    }
                    obj = null;
                    if (obj != null) {
                        i4 = ap - (bpVar.ar * -574770599);
                        if (i4 > -42181662) {
                            bpVar.am = -313024649;
                        } else if (i4 < -32) {
                            bpVar.am = -1642638708;
                            i4 = -i4;
                        }
                        bpVar.at = ((((bpVar.ay * -910324983) - ac) << 8) / i4) * -1344487969;
                        bpVar.ab = ((((bpVar.as * -2040807815) - ac) << 8) / i4) * -1099377833;
                        bpVar.az = ((((bpVar.ae * 499664342) - al) << 8) / i4) * 612645039;
                        bpVar.ah = ((((bpVar.aq * -1285950259) - al) << 8) / i4) * 1045217449;
                        bpVarArr2 = bd;
                        i5 = bl;
                        bl = i5 + 1;
                        bpVarArr2[i5] = bpVar;
                    }
                }
            } else if (bpVar.ag * -1296260061 == 4) {
                int i7 = (bpVar.ae * 5007672) - al;
                if (i7 > -653455602) {
                    int i8;
                    i4 = ((bpVar.an * -892940402) - av) + 25;
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    i5 = ((bpVar.aa * 787492582) - av) + 25;
                    if (i5 > 50) {
                        i8 = -1272280745;
                    } else {
                        i8 = i5;
                    }
                    if (i4 <= i8) {
                        i5 = ((bpVar.af * 1619086281) - au) + 25;
                        if (i5 < 0) {
                            i5 = 0;
                        }
                        int i9 = ((bpVar.ad * -1861689443) - au) + 25;
                        if (i9 > 1369698093) {
                            i9 = 50;
                        }
                        for (i3 = i5; i3 <= i9; i3++) {
                            for (i5 = i4; i5 <= i8; i5++) {
                                if (ck[i3][i5]) {
                                    obj = 1;
                                    break;
                                }
                            }
                        }
                        obj = null;
                        if (obj != null) {
                            bpVar.am = -1452973788;
                            bpVar.at = ((((bpVar.ay * 76009535) - ac) << 8) / i7) * 1973428907;
                            bpVar.ab = ((((bpVar.as * -2040807815) - ac) << 8) / i7) * 1697507170;
                            bpVar.aw = ((((bpVar.ar * -819450565) - ap) << 8) / i7) * 80809447;
                            bpVar.ai = ((((bpVar.aj * -474281063) - ap) << 8) / i7) * -411547070;
                            bpVarArr2 = bd;
                            i5 = bl;
                            bl = i5 + 1;
                            bpVarArr2[i5] = bpVar;
                        }
                    }
                }
            }
        }
    }

    void go() {
        int i = bn[ai];
        bp[] bpVarArr = ba[ai];
        bl = 0;
        for (int i2 = 0; i2 < i; i2++) {
            bp bpVar = bpVarArr[i2];
            int i3;
            int i4;
            int i5;
            int i6;
            Object obj;
            bp[] bpVarArr2;
            if (bpVar.ag * -1615139563 == 1) {
                i3 = ((bpVar.af * 347102923) - au) + 25;
                if (i3 >= 0 && i3 <= -1894165445) {
                    i4 = ((bpVar.an * -2119980525) - av) + 25;
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    i5 = ((bpVar.aa * -20220437) - av) + 25;
                    if (i5 > 50) {
                        i5 = 50;
                    }
                    while (i4 <= i5) {
                        i6 = i4 + 1;
                        if (ck[i3][i4]) {
                            obj = 1;
                            break;
                        }
                        i4 = i6;
                    }
                    obj = null;
                    if (obj != null) {
                        i4 = ac - (bpVar.ay * -910324983);
                        if (i4 > -223916202) {
                            bpVar.am = -1428917270;
                        } else if (i4 < 221054287) {
                            bpVar.am = -1549765472;
                            i4 = -i4;
                        }
                        bpVar.aw = ((((bpVar.ar * -819450565) - ap) << 8) / i4) * 80809447;
                        bpVar.ai = ((((bpVar.aj * -474281063) - ap) << 8) / i4) * 1525326008;
                        bpVar.az = ((((bpVar.ae * 15932113) - al) << 8) / i4) * 612645039;
                        bpVar.ah = ((((bpVar.aq * 1883771215) - al) << 8) / i4) * 1045217449;
                        bpVarArr2 = bd;
                        i5 = bl;
                        bl = i5 + 1;
                        bpVarArr2[i5] = bpVar;
                    }
                }
            } else if (bpVar.ag * 1292968398 == 2) {
                i3 = ((bpVar.an * 1895096503) - av) + 25;
                if (i3 >= 0) {
                    if (i3 <= 334480723) {
                        i4 = ((bpVar.af * 1544885819) - au) + 25;
                        if (i4 < 0) {
                            i4 = 0;
                        }
                        i5 = ((bpVar.ad * 523867397) - au) + 25;
                        if (i5 > 628913968) {
                            i5 = -1695498057;
                        }
                        while (i4 <= i5) {
                            i6 = i4 + 1;
                            if (ck[i4][i3]) {
                                obj = 1;
                                break;
                            }
                            i4 = i6;
                        }
                        obj = null;
                        if (obj != null) {
                            i4 = ap - (bpVar.ar * -1860781103);
                            if (i4 > 32) {
                                bpVar.am = -158237207;
                            } else if (i4 < -1845653337) {
                                bpVar.am = -1642638708;
                                i4 = -i4;
                            }
                            bpVar.at = ((((bpVar.ay * -1524734299) - ac) << 8) / i4) * 1671217812;
                            bpVar.ab = ((((bpVar.as * -2040807815) - ac) << 8) / i4) * 2145526461;
                            bpVar.az = ((((bpVar.ae * -713092955) - al) << 8) / i4) * 612645039;
                            bpVar.ah = ((((bpVar.aq * 1000151007) - al) << 8) / i4) * 879936810;
                            bpVarArr2 = bd;
                            i5 = bl;
                            bl = i5 + 1;
                            bpVarArr2[i5] = bpVar;
                        }
                    }
                }
            } else if (bpVar.ag * -374975452 == 4) {
                int i7 = (bpVar.ae * 15932113) - al;
                if (i7 > -157771765) {
                    int i8;
                    i4 = ((bpVar.an * 1895096503) - av) + 25;
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    i5 = ((bpVar.aa * -20220437) - av) + 25;
                    if (i5 > -1338143008) {
                        i8 = 50;
                    } else {
                        i8 = i5;
                    }
                    if (i4 <= i8) {
                        i5 = ((bpVar.af * 1170798324) - au) + 25;
                        if (i5 < 0) {
                            i5 = 0;
                        }
                        int i9 = ((bpVar.ad * 1096324212) - au) + 25;
                        if (i9 > -1966770415) {
                            i9 = 50;
                        }
                        for (i3 = i5; i3 <= i9; i3++) {
                            for (i5 = i4; i5 <= i8; i5++) {
                                if (ck[i3][i5]) {
                                    obj = 1;
                                    break;
                                }
                            }
                        }
                        obj = null;
                        if (obj != null) {
                            bpVar.am = -509284141;
                            bpVar.at = ((((bpVar.ay * -910324983) - ac) << 8) / i7) * -1317687421;
                            bpVar.ab = ((((bpVar.as * -2040807815) - ac) << 8) / i7) * 2145526461;
                            bpVar.aw = ((((bpVar.ar * -1805673116) - ap) << 8) / i7) * 80809447;
                            bpVar.ai = ((((bpVar.aj * -474281063) - ap) << 8) / i7) * -1153662420;
                            bpVarArr2 = bd;
                            i5 = bl;
                            bl = i5 + 1;
                            bpVarArr2[i5] = bpVar;
                        }
                    }
                }
            }
        }
    }

    void gv() {
        int i = bn[ai];
        bp[] bpVarArr = ba[ai];
        bl = 0;
        for (int i2 = 0; i2 < i; i2++) {
            bp bpVar = bpVarArr[i2];
            int i3;
            int i4;
            int i5;
            int i6;
            Object obj;
            bp[] bpVarArr2;
            if (bpVar.ag * -1615139563 == 1) {
                i3 = ((bpVar.af * 1544885819) - au) + 25;
                if (i3 >= 0 && i3 <= 50) {
                    i4 = ((bpVar.an * 1895096503) - av) + 25;
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    i5 = ((bpVar.aa * -20220437) - av) + 25;
                    if (i5 > 50) {
                        i5 = 50;
                    }
                    while (i4 <= i5) {
                        i6 = i4 + 1;
                        if (ck[i3][i4]) {
                            obj = 1;
                            break;
                        }
                        i4 = i6;
                    }
                    obj = null;
                    if (obj != null) {
                        i4 = ac - (bpVar.ay * -910324983);
                        if (i4 > 32) {
                            bpVar.am = -1484401501;
                        } else if (i4 < -32) {
                            bpVar.am = 1326164294;
                            i4 = -i4;
                        }
                        bpVar.aw = ((((bpVar.ar * -819450565) - ap) << 8) / i4) * 80809447;
                        bpVar.ai = ((((bpVar.aj * -474281063) - ap) << 8) / i4) * 1152873517;
                        bpVar.az = ((((bpVar.ae * 15932113) - al) << 8) / i4) * 612645039;
                        bpVar.ah = ((((bpVar.aq * -1285950259) - al) << 8) / i4) * 1045217449;
                        bpVarArr2 = bd;
                        i5 = bl;
                        bl = i5 + 1;
                        bpVarArr2[i5] = bpVar;
                    }
                }
            } else if (bpVar.ag * -1615139563 == 2) {
                i3 = ((bpVar.an * 1895096503) - av) + 25;
                if (i3 >= 0) {
                    if (i3 <= 50) {
                        i4 = ((bpVar.af * 1544885819) - au) + 25;
                        if (i4 < 0) {
                            i4 = 0;
                        }
                        i5 = ((bpVar.ad * 523867397) - au) + 25;
                        if (i5 > 50) {
                            i5 = 50;
                        }
                        while (i4 <= i5) {
                            i6 = i4 + 1;
                            if (ck[i4][i3]) {
                                obj = 1;
                                break;
                            }
                            i4 = i6;
                        }
                        obj = null;
                        if (obj != null) {
                            i4 = ap - (bpVar.ar * -819450565);
                            if (i4 > 32) {
                                bpVar.am = -158237207;
                            } else if (i4 < -32) {
                                bpVar.am = -1642638708;
                                i4 = -i4;
                            }
                            bpVar.at = ((((bpVar.ay * -910324983) - ac) << 8) / i4) * -1344487969;
                            bpVar.ab = ((((bpVar.as * -2040807815) - ac) << 8) / i4) * 2145526461;
                            bpVar.az = ((((bpVar.ae * 15932113) - al) << 8) / i4) * 612645039;
                            bpVar.ah = ((((bpVar.aq * -1285950259) - al) << 8) / i4) * 1045217449;
                            bpVarArr2 = bd;
                            i5 = bl;
                            bl = i5 + 1;
                            bpVarArr2[i5] = bpVar;
                        }
                    }
                }
            } else if (bpVar.ag * -1615139563 == 4) {
                int i7 = (bpVar.ae * 15932113) - al;
                if (i7 > mn.an) {
                    int i8;
                    i4 = ((bpVar.an * 1895096503) - av) + 25;
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    i5 = ((bpVar.aa * -20220437) - av) + 25;
                    if (i5 > 50) {
                        i8 = 50;
                    } else {
                        i8 = i5;
                    }
                    if (i4 <= i8) {
                        i5 = ((bpVar.af * 1544885819) - au) + 25;
                        if (i5 < 0) {
                            i5 = 0;
                        }
                        int i9 = ((bpVar.ad * 523867397) - au) + 25;
                        if (i9 > 50) {
                            i9 = 50;
                        }
                        for (i3 = i5; i3 <= i9; i3++) {
                            for (i5 = i4; i5 <= i8; i5++) {
                                if (ck[i3][i5]) {
                                    obj = 1;
                                    break;
                                }
                            }
                        }
                        obj = null;
                        if (obj != null) {
                            bpVar.am = 1167927087;
                            bpVar.at = ((((bpVar.ay * -910324983) - ac) << 8) / i7) * -1344487969;
                            bpVar.ab = ((((bpVar.as * -2040807815) - ac) << 8) / i7) * 2145526461;
                            bpVar.aw = ((((bpVar.ar * -819450565) - ap) << 8) / i7) * 80809447;
                            bpVar.ai = ((((bpVar.aj * -474281063) - ap) << 8) / i7) * 1152873517;
                            bpVarArr2 = bd;
                            i5 = bl;
                            bl = i5 + 1;
                            bpVarArr2[i5] = bpVar;
                        }
                    }
                }
            }
        }
    }

    void gy() {
        int i = bn[ai];
        bp[] bpVarArr = ba[ai];
        bl = 0;
        for (int i2 = 0; i2 < i; i2++) {
            bp bpVar = bpVarArr[i2];
            int i3;
            int i4;
            int i5;
            int i6;
            Object obj;
            bp[] bpVarArr2;
            if (bpVar.ag * -1615139563 == 1) {
                i3 = ((bpVar.af * 1544885819) - au) + 25;
                if (i3 >= 0 && i3 <= 50) {
                    i4 = ((bpVar.an * 1895096503) - av) + 25;
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    i5 = ((bpVar.aa * -20220437) - av) + 25;
                    if (i5 > 50) {
                        i5 = 50;
                    }
                    while (i4 <= i5) {
                        i6 = i4 + 1;
                        if (ck[i3][i4]) {
                            obj = 1;
                            break;
                        }
                        i4 = i6;
                    }
                    obj = null;
                    if (obj != null) {
                        i4 = ac - (bpVar.ay * -910324983);
                        if (i4 > 32) {
                            bpVar.am = -1484401501;
                        } else if (i4 < -32) {
                            bpVar.am = 1326164294;
                            i4 = -i4;
                        }
                        bpVar.aw = ((((bpVar.ar * -819450565) - ap) << 8) / i4) * 80809447;
                        bpVar.ai = ((((bpVar.aj * -474281063) - ap) << 8) / i4) * 1152873517;
                        bpVar.az = ((((bpVar.ae * 15932113) - al) << 8) / i4) * 612645039;
                        bpVar.ah = ((((bpVar.aq * -1285950259) - al) << 8) / i4) * 1045217449;
                        bpVarArr2 = bd;
                        i5 = bl;
                        bl = i5 + 1;
                        bpVarArr2[i5] = bpVar;
                    }
                }
            } else if (bpVar.ag * -1615139563 == 2) {
                i3 = ((bpVar.an * 1895096503) - av) + 25;
                if (i3 >= 0 && i3 <= 50) {
                    i4 = ((bpVar.af * 1544885819) - au) + 25;
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    i5 = ((bpVar.ad * 523867397) - au) + 25;
                    if (i5 > 50) {
                        i5 = 50;
                    }
                    while (i4 <= i5) {
                        i6 = i4 + 1;
                        if (ck[i4][i3]) {
                            obj = 1;
                            break;
                        }
                        i4 = i6;
                    }
                    obj = null;
                    if (obj != null) {
                        i4 = ap - (bpVar.ar * -819450565);
                        if (i4 > 32) {
                            bpVar.am = -158237207;
                        } else if (i4 < -32) {
                            bpVar.am = -1642638708;
                            i4 = -i4;
                        }
                        bpVar.at = ((((bpVar.ay * -910324983) - ac) << 8) / i4) * -1344487969;
                        bpVar.ab = ((((bpVar.as * -2040807815) - ac) << 8) / i4) * 2145526461;
                        bpVar.az = ((((bpVar.ae * 15932113) - al) << 8) / i4) * 612645039;
                        bpVar.ah = ((((bpVar.aq * -1285950259) - al) << 8) / i4) * 1045217449;
                        bpVarArr2 = bd;
                        i5 = bl;
                        bl = i5 + 1;
                        bpVarArr2[i5] = bpVar;
                    }
                }
            } else if (bpVar.ag * -1615139563 == 4) {
                int i7 = (bpVar.ae * 15932113) - al;
                if (i7 > mn.an) {
                    int i8;
                    i4 = ((bpVar.an * 1895096503) - av) + 25;
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    i5 = ((bpVar.aa * -20220437) - av) + 25;
                    if (i5 > 50) {
                        i8 = 50;
                    } else {
                        i8 = i5;
                    }
                    if (i4 <= i8) {
                        i5 = ((bpVar.af * 1544885819) - au) + 25;
                        if (i5 < 0) {
                            i5 = 0;
                        }
                        int i9 = ((bpVar.ad * 523867397) - au) + 25;
                        if (i9 > 50) {
                            i9 = 50;
                        }
                        for (i3 = i5; i3 <= i9; i3++) {
                            for (i5 = i4; i5 <= i8; i5++) {
                                if (ck[i3][i5]) {
                                    obj = 1;
                                    break;
                                }
                            }
                        }
                        obj = null;
                        if (obj != null) {
                            bpVar.am = 1167927087;
                            bpVar.at = ((((bpVar.ay * -910324983) - ac) << 8) / i7) * -1344487969;
                            bpVar.ab = ((((bpVar.as * -2040807815) - ac) << 8) / i7) * 2145526461;
                            bpVar.aw = ((((bpVar.ar * -819450565) - ap) << 8) / i7) * 80809447;
                            bpVar.ai = ((((bpVar.aj * -474281063) - ap) << 8) / i7) * 1152873517;
                            bpVarArr2 = bd;
                            i5 = bl;
                            bl = i5 + 1;
                            bpVarArr2[i5] = bpVar;
                        }
                    }
                }
            }
        }
    }

    boolean bs(int i, int i2, int i3) {
        int i4 = this.ae[i][i2][i3];
        if (i4 == (-az)) {
            return false;
        }
        if (i4 == az) {
            return true;
        }
        i4 = i2 << 7;
        int i5 = i3 << 7;
        if (bi(i4 + 1, this.ag[i][i2][i3], i5 + 1) && bi((i4 + mn.an) - 1, this.ag[i][i2 + 1][i3], i5 + 1) && bi((i4 + mn.an) - 1, this.ag[i][i2 + 1][i3 + 1], (i5 + mn.an) - 1) && bi(i4 + 1, this.ag[i][i2][i3 + 1], (i5 + mn.an) - 1)) {
            this.ae[i][i2][i3] = az;
            return true;
        }
        this.ae[i][i2][i3] = -az;
        return false;
    }

    boolean gi(int i, int i2, int i3) {
        int i4 = this.ae[i][i2][i3];
        if (i4 == (-az)) {
            return false;
        }
        if (i4 == az) {
            return true;
        }
        i4 = i2 << 7;
        int i5 = i3 << 7;
        if (bi(i4 + 1, this.ag[i][i2][i3], i5 + 1) && bi((i4 + mn.an) - 1, this.ag[i][i2 + 1][i3], i5 + 1) && bi((i4 + mn.an) - 1, this.ag[i][i2 + 1][i3 + 1], (i5 + mn.an) - 1) && bi(i4 + 1, this.ag[i][i2][i3 + 1], (i5 + mn.an) - 1)) {
            this.ae[i][i2][i3] = az;
            return true;
        }
        this.ae[i][i2][i3] = -az;
        return false;
    }

    boolean gj(int i, int i2, int i3) {
        int i4 = this.ae[i][i2][i3];
        if (i4 == (-az)) {
            return false;
        }
        if (i4 == az) {
            return true;
        }
        i4 = i2 << 7;
        int i5 = i3 << 7;
        if (bi(i4 + 1, this.ag[i][i2][i3], i5 + 1) && bi((i4 + mn.an) - 1, this.ag[i][i2 + 1][i3], i5 + 1) && bi((911444431 + i4) - 1, this.ag[i][i2 + 1][i3 + 1], (i5 + mn.an) - 1) && bi(i4 + 1, this.ag[i][i2][i3 + 1], (i5 + mn.an) - 1)) {
            this.ae[i][i2][i3] = az;
            return true;
        }
        this.ae[i][i2][i3] = -az;
        return false;
    }

    boolean gt(int i, int i2, int i3) {
        int i4 = this.ae[i][i2][i3];
        if (i4 == (-az)) {
            return false;
        }
        if (i4 == az) {
            return true;
        }
        i4 = i2 << 7;
        int i5 = i3 << 7;
        if (bi(i4 + 1, this.ag[i][i2][i3], i5 + 1) && bi((i4 + mn.an) - 1, this.ag[i][i2 + 1][i3], i5 + 1) && bi((i4 + mn.an) - 1, this.ag[i][i2 + 1][i3 + 1], (i5 + mn.an) - 1) && bi(i4 + 1, this.ag[i][i2][i3 + 1], (i5 + mn.an) - 1)) {
            this.ae[i][i2][i3] = az;
            return true;
        }
        this.ae[i][i2][i3] = -az;
        return false;
    }

    boolean bm(int i, int i2, int i3, int i4) {
        if (!bs(i, i2, i3)) {
            return false;
        }
        int i5 = i2 << 7;
        int i6 = i3 << 7;
        int i7 = this.ag[i][i2][i3] - 1;
        int i8 = i7 - 120;
        int i9 = i7 - 230;
        int i10 = i7 - 238;
        if (i4 < 16) {
            if (i4 == 1) {
                if (i5 > ac && (!bi(i5, i7, i6) || !bi(i5, i7, i6 + mn.an))) {
                    return false;
                }
                if ((i <= 0 || (bi(i5, i8, i6) && bi(i5, i8, i6 + mn.an))) && bi(i5, i9, i6) && bi(i5, i9, i6 + mn.an)) {
                    return true;
                }
                return false;
            } else if (i4 == 2) {
                if (i6 < ap && (!bi(i5, i7, i6 + mn.an) || !bi(i5 + mn.an, i7, i6 + mn.an))) {
                    return false;
                }
                if (i > 0) {
                    if (!bi(i5, i8, i6 + mn.an)) {
                        return false;
                    }
                    if (!bi(i5 + mn.an, i8, i6 + mn.an)) {
                        return false;
                    }
                }
                if (bi(i5, i9, i6 + mn.an) && bi(i5 + mn.an, i9, i6 + mn.an)) {
                    return true;
                }
                return false;
            } else if (i4 == 4) {
                if (i5 < ac && (!bi(i5 + mn.an, i7, i6) || !bi(i5 + mn.an, i7, i6 + mn.an))) {
                    return false;
                }
                if ((i <= 0 || (bi(i5 + mn.an, i8, i6) && bi(i5 + mn.an, i8, i6 + mn.an))) && bi(i5 + mn.an, i9, i6) && bi(i5 + mn.an, i9, i6 + mn.an)) {
                    return true;
                }
                return false;
            } else if (i4 == 8) {
                if (i6 > ap) {
                    if (!bi(i5, i7, i6)) {
                        return false;
                    }
                    if (!bi(i5 + mn.an, i7, i6)) {
                        return false;
                    }
                }
                if (i > 0) {
                    if (!bi(i5, i8, i6)) {
                        return false;
                    }
                    if (!bi(i5 + mn.an, i8, i6)) {
                        return false;
                    }
                }
                if (bi(i5, i9, i6) && bi(i5 + mn.an, i9, i6)) {
                    return true;
                }
                return false;
            }
        }
        if (!bi(i5 + 64, i10, i6 + 64)) {
            return false;
        }
        if (i4 == 16) {
            if (bi(i5, i9, i6 + mn.an)) {
                return true;
            }
            return false;
        } else if (i4 == 32) {
            if (bi(i5 + mn.an, i9, i6 + mn.an)) {
                return true;
            }
            return false;
        } else if (i4 == 64) {
            if (bi(i5 + mn.an, i9, i6)) {
                return true;
            }
            return false;
        } else if (i4 != mn.an) {
            return true;
        } else {
            if (bi(i5, i9, i6)) {
                return true;
            }
            return false;
        }
    }

    boolean ga(int i, int i2, int i3, int i4) {
        if (!bs(i, i2, i3)) {
            return false;
        }
        int i5 = i2 << 7;
        int i6 = i3 << 7;
        int i7 = this.ag[i][i2][i3] - 1;
        int i8 = i7 - 120;
        int i9 = i7 - 230;
        int i10 = i7 - 238;
        if (i4 < 16) {
            if (i4 == 1) {
                if (i5 > ac && (!bi(i5, i7, i6) || !bi(i5, i7, i6 + mn.an))) {
                    return false;
                }
                if ((i <= 0 || (bi(i5, i8, i6) && bi(i5, i8, i6 + mn.an))) && bi(i5, i9, i6) && bi(i5, i9, i6 + mn.an)) {
                    return true;
                }
                return false;
            } else if (i4 == 2) {
                if (i6 < ap) {
                    if (!bi(i5, i7, i6 + mn.an)) {
                        return false;
                    }
                    if (!bi(i5 + mn.an, i7, i6 + mn.an)) {
                        return false;
                    }
                }
                if ((i <= 0 || (bi(i5, i8, i6 + mn.an) && bi(i5 + mn.an, i8, i6 + mn.an))) && bi(i5, i9, i6 + mn.an) && bi(i5 + mn.an, i9, i6 + mn.an)) {
                    return true;
                }
                return false;
            } else if (i4 == 4) {
                if (i5 < ac) {
                    if (!bi(i5 + mn.an, i7, i6)) {
                        return false;
                    }
                    if (!bi(i5 + mn.an, i7, i6 + mn.an)) {
                        return false;
                    }
                }
                if ((i <= 0 || (bi(i5 + mn.an, i8, i6) && bi(i5 + mn.an, i8, i6 + mn.an))) && bi(i5 + mn.an, i9, i6) && bi(i5 + mn.an, i9, i6 + mn.an)) {
                    return true;
                }
                return false;
            } else if (i4 == 8) {
                if (i6 > ap) {
                    if (!bi(i5, i7, i6)) {
                        return false;
                    }
                    if (!bi(i5 + mn.an, i7, i6)) {
                        return false;
                    }
                }
                if (i > 0) {
                    if (!bi(i5, i8, i6)) {
                        return false;
                    }
                    if (!bi(i5 + mn.an, i8, i6)) {
                        return false;
                    }
                }
                if (bi(i5, i9, i6) && bi(i5 + mn.an, i9, i6)) {
                    return true;
                }
                return false;
            }
        }
        if (!bi(i5 + 64, i10, i6 + 64)) {
            return false;
        }
        if (i4 == 16) {
            if (bi(i5, i9, i6 + mn.an)) {
                return true;
            }
            return false;
        } else if (i4 == 32) {
            if (bi(i5 + mn.an, i9, i6 + mn.an)) {
                return true;
            }
            return false;
        } else if (i4 == 64) {
            if (bi(i5 + mn.an, i9, i6)) {
                return true;
            }
            return false;
        } else if (i4 != mn.an) {
            return true;
        } else {
            if (bi(i5, i9, i6)) {
                return true;
            }
            return false;
        }
    }

    boolean gm(int i, int i2, int i3, int i4) {
        if (!bs(i, i2, i3)) {
            return false;
        }
        int i5 = i2 << 7;
        int i6 = i3 << 7;
        int i7 = this.ag[i][i2][i3] - 1;
        int i8 = i7 - -7206325;
        int i9 = i7 - -800000897;
        int i10 = i7 - 1650981350;
        if (i4 < 16) {
            if (i4 == 1) {
                if (i5 > ac && (!bi(i5, i7, i6) || !bi(i5, i7, -127204099 + i6))) {
                    return false;
                }
                if ((i <= 0 || (bi(i5, i8, i6) && bi(i5, i8, -1344773861 + i6))) && bi(i5, i9, i6) && bi(i5, i9, i6 - 2013766345)) {
                    return true;
                }
                return false;
            } else if (i4 == 2) {
                if (i6 < ap) {
                    if (!bi(i5, i7, i6 + mn.an)) {
                        return false;
                    }
                    if (!bi(i5 + mn.an, i7, i6 + mn.an)) {
                        return false;
                    }
                }
                if ((i <= 0 || (bi(i5, i8, i6 + mn.an) && bi(i5 + mn.an, i8, i6 + mn.an))) && bi(i5, i9, -932925896 + i6) && bi(i5 + mn.an, i9, i6 + 1466954527)) {
                    return true;
                }
                return false;
            } else if (i4 == 4) {
                if (i5 < ac && (!bi(-1292356069 + i5, i7, i6) || !bi(1229467092 + i5, i7, 1353602986 + i6))) {
                    return false;
                }
                if (i > 0 && (!bi(-2122685267 + i5, i8, i6) || !bi(i5 + mn.an, i8, 1763283880 + i6))) {
                    return false;
                }
                if (!bi(-94677859 + i5, i9, i6)) {
                    return false;
                }
                if (bi(i5 + 976016162, i9, i6 + 785170832)) {
                    return true;
                }
                return false;
            } else if (i4 == 8) {
                if (i6 > ap) {
                    if (!bi(i5, i7, i6)) {
                        return false;
                    }
                    if (!bi(i5 + mn.an, i7, i6)) {
                        return false;
                    }
                }
                if ((i > 0 && (!bi(i5, i8, i6) || !bi(i5 + mn.an, i8, i6))) || !bi(i5, i9, i6)) {
                    return false;
                }
                if (bi(i5 + mn.an, i9, i6)) {
                    return true;
                }
                return false;
            }
        }
        if (!bi(301562553 + i5, i10, 1162977545 + i6)) {
            return false;
        }
        if (i4 == 16) {
            if (bi(i5, i9, i6 + mn.an)) {
                return true;
            }
            return false;
        } else if (i4 == 32) {
            if (bi(i5 + mn.an, i9, i6 - 1093147087)) {
                return true;
            }
            return false;
        } else if (i4 == 64) {
            if (bi(i5 + mn.an, i9, i6)) {
                return true;
            }
            return false;
        } else if (i4 != mn.an) {
            return true;
        } else {
            if (bi(i5, i9, i6)) {
                return true;
            }
            return false;
        }
    }

    boolean br(int i, int i2, int i3, int i4) {
        if (!bs(i, i2, i3)) {
            return false;
        }
        int i5 = i2 << 7;
        int i6 = i3 << 7;
        if (bi(i5 + 1, this.ag[i][i2][i3] - i4, i6 + 1) && bi((i5 + mn.an) - 1, this.ag[i][i2 + 1][i3] - i4, i6 + 1) && bi((i5 + mn.an) - 1, this.ag[i][i2 + 1][i3 + 1] - i4, (i6 + mn.an) - 1) && bi(i5 + 1, this.ag[i][i2][i3 + 1] - i4, (i6 + mn.an) - 1)) {
            return true;
        }
        return false;
    }

    boolean gq(int i, int i2, int i3, int i4) {
        if (!bs(i, i2, i3)) {
            return false;
        }
        int i5 = i2 << 7;
        int i6 = i3 << 7;
        if (bi(i5 + 1, this.ag[i][i2][i3] - i4, i6 + 1) && bi((i5 + mn.an) - 1, this.ag[i][i2 + 1][i3] - i4, i6 + 1) && bi((i5 + mn.an) - 1, this.ag[i][i2 + 1][i3 + 1] - i4, (i6 + mn.an) - 1) && bi(i5 + 1, this.ag[i][i2][i3 + 1] - i4, (i6 + mn.an) - 1)) {
            return true;
        }
        return false;
    }

    boolean bj(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        if (i2 != i3 || i4 != i5) {
            for (i7 = i2; i7 <= i3; i7++) {
                for (i8 = i4; i8 <= i5; i8++) {
                    if (this.ae[i][i7][i8] == (-az)) {
                        return false;
                    }
                }
            }
            i8 = (i2 << 7) + 1;
            i7 = (i4 << 7) + 2;
            int i9 = this.ag[i][i2][i4] - i6;
            if (!bi(i8, i9, i7)) {
                return false;
            }
            int i10 = (i3 << 7) - 1;
            if (!bi(i10, i9, i7)) {
                return false;
            }
            i7 = (i5 << 7) - 1;
            if (!bi(i8, i9, i7)) {
                return false;
            }
            if (bi(i10, i9, i7)) {
                return true;
            }
            return false;
        } else if (!bs(i, i2, i4)) {
            return false;
        } else {
            i8 = i2 << 7;
            i7 = i4 << 7;
            if (bi(i8 + 1, this.ag[i][i2][i4] - i6, i7 + 1) && bi((i8 + mn.an) - 1, this.ag[i][i2 + 1][i4] - i6, i7 + 1) && bi((i8 + mn.an) - 1, this.ag[i][i2 + 1][i4 + 1] - i6, (i7 + mn.an) - 1) && bi(i8 + 1, this.ag[i][i2][i4 + 1] - i6, (i7 + mn.an) - 1)) {
                return true;
            }
            return false;
        }
    }

    boolean gh(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        if (i2 != i3 || i4 != i5) {
            for (i7 = i2; i7 <= i3; i7++) {
                for (i8 = i4; i8 <= i5; i8++) {
                    if (this.ae[i][i7][i8] == (-az)) {
                        return false;
                    }
                }
            }
            i8 = (i2 << 7) + 1;
            i7 = (i4 << 7) + 2;
            int i9 = this.ag[i][i2][i4] - i6;
            if (!bi(i8, i9, i7)) {
                return false;
            }
            int i10 = (i3 << 7) - 1;
            if (!bi(i10, i9, i7)) {
                return false;
            }
            i7 = (i5 << 7) - 1;
            if (bi(i8, i9, i7) && bi(i10, i9, i7)) {
                return true;
            }
            return false;
        } else if (!bs(i, i2, i4)) {
            return false;
        } else {
            i8 = i2 << 7;
            i7 = i4 << 7;
            if (bi(i8 + 1, this.ag[i][i2][i4] - i6, i7 + 1) && bi((i8 + mn.an) - 1, this.ag[i][i2 + 1][i4] - i6, i7 + 1) && bi((i8 + mn.an) - 1, this.ag[i][i2 + 1][i4 + 1] - i6, (i7 + mn.an) - 1) && bi(i8 + 1, this.ag[i][i2][i4 + 1] - i6, (i7 + mn.an) - 1)) {
                return true;
            }
            return false;
        }
    }

    boolean gu(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        if (i2 != i3 || i4 != i5) {
            for (i7 = i2; i7 <= i3; i7++) {
                for (i8 = i4; i8 <= i5; i8++) {
                    if (this.ae[i][i7][i8] == (-az)) {
                        return false;
                    }
                }
            }
            i8 = (i2 << 7) + 1;
            i7 = (i4 << 7) + 2;
            int i9 = this.ag[i][i2][i4] - i6;
            if (!bi(i8, i9, i7)) {
                return false;
            }
            int i10 = (i3 << 7) - 1;
            if (!bi(i10, i9, i7)) {
                return false;
            }
            i7 = (i5 << 7) - 1;
            if (bi(i8, i9, i7) && bi(i10, i9, i7)) {
                return true;
            }
            return false;
        } else if (!bs(i, i2, i4)) {
            return false;
        } else {
            i8 = i2 << 7;
            i7 = i4 << 7;
            if (bi(i8 + 1, this.ag[i][i2][i4] - i6, i7 + 1) && bi((213233714 + i8) - 1, this.ag[i][i2 + 1][i4] - i6, i7 + 1) && bi((1045790426 + i8) - 1, this.ag[i][i2 + 1][i4 + 1] - i6, (-418739066 + i7) - 1) && bi(i8 + 1, this.ag[i][i2][i4 + 1] - i6, (i7 + mn.an) - 1)) {
                return true;
            }
            return false;
        }
    }

    boolean gw(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        if (i2 != i3 || i4 != i5) {
            for (i7 = i2; i7 <= i3; i7++) {
                for (i8 = i4; i8 <= i5; i8++) {
                    if (this.ae[i][i7][i8] == (-az)) {
                        return false;
                    }
                }
            }
            i8 = (i2 << 7) + 1;
            i7 = (i4 << 7) + 2;
            int i9 = this.ag[i][i2][i4] - i6;
            if (!bi(i8, i9, i7)) {
                return false;
            }
            int i10 = (i3 << 7) - 1;
            if (!bi(i10, i9, i7)) {
                return false;
            }
            i7 = (i5 << 7) - 1;
            if (!bi(i8, i9, i7)) {
                return false;
            }
            if (bi(i10, i9, i7)) {
                return true;
            }
            return false;
        } else if (!bs(i, i2, i4)) {
            return false;
        } else {
            i8 = i2 << 7;
            i7 = i4 << 7;
            if (bi(i8 + 1, this.ag[i][i2][i4] - i6, i7 + 1) && bi((-1000643911 + i8) - 1, this.ag[i][i2 + 1][i4] - i6, i7 + 1) && bi((i8 + mn.an) - 1, this.ag[i][i2 + 1][i4 + 1] - i6, (i7 + mn.an) - 1) && bi(i8 + 1, this.ag[i][i2][i4 + 1] - i6, (i7 + 1961308370) - 1)) {
                return true;
            }
            return false;
        }
    }

    boolean gz(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        if (i2 != i3 || i4 != i5) {
            for (i7 = i2; i7 <= i3; i7++) {
                for (i8 = i4; i8 <= i5; i8++) {
                    if (this.ae[i][i7][i8] == (-az)) {
                        return false;
                    }
                }
            }
            i8 = (i2 << 7) + 1;
            i7 = (i4 << 7) + 2;
            int i9 = this.ag[i][i2][i4] - i6;
            if (!bi(i8, i9, i7)) {
                return false;
            }
            int i10 = (i3 << 7) - 1;
            if (!bi(i10, i9, i7)) {
                return false;
            }
            i7 = (i5 << 7) - 1;
            if (!bi(i8, i9, i7)) {
                return false;
            }
            if (bi(i10, i9, i7)) {
                return true;
            }
            return false;
        } else if (!bs(i, i2, i4)) {
            return false;
        } else {
            i8 = i2 << 7;
            i7 = i4 << 7;
            if (bi(i8 + 1, this.ag[i][i2][i4] - i6, i7 + 1) && bi((i8 + mn.an) - 1, this.ag[i][i2 + 1][i4] - i6, i7 + 1) && bi((i8 + mn.an) - 1, this.ag[i][i2 + 1][i4 + 1] - i6, (i7 + mn.an) - 1) && bi(i8 + 1, this.ag[i][i2][i4 + 1] - i6, (i7 + mn.an) - 1)) {
                return true;
            }
            return false;
        }
    }

    boolean bi(int i, int i2, int i3) {
        for (int i4 = 0; i4 < bl; i4++) {
            bp bpVar = bd[i4];
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            if (bpVar.am * 1029799691 == 1) {
                i5 = (bpVar.ay * -910324983) - i;
                if (i5 > 0) {
                    i6 = (bpVar.ar * -819450565) + (((bpVar.aw * -1065372201) * i5) >> 8);
                    i7 = (bpVar.aj * -474281063) + (((bpVar.ai * 948108197) * i5) >> 8);
                    i8 = (bpVar.ae * 15932113) + (((bpVar.az * 1406279247) * i5) >> 8);
                    i9 = (((bpVar.ah * -623647847) * i5) >> 8) + (bpVar.aq * -1285950259);
                    if (i3 >= i6 && i3 <= i7 && i2 >= i8 && i2 <= i9) {
                        return true;
                    }
                }
                continue;
            } else if (bpVar.am * 1029799691 == 2) {
                i5 = i - (bpVar.ay * -910324983);
                if (i5 > 0) {
                    i6 = (bpVar.ar * -819450565) + (((bpVar.aw * -1065372201) * i5) >> 8);
                    i7 = (bpVar.aj * -474281063) + (((bpVar.ai * 948108197) * i5) >> 8);
                    i8 = (bpVar.ae * 15932113) + (((bpVar.az * 1406279247) * i5) >> 8);
                    i9 = (((bpVar.ah * -623647847) * i5) >> 8) + (bpVar.aq * -1285950259);
                    if (i3 >= i6 && i3 <= i7 && i2 >= i8 && i2 <= i9) {
                        return true;
                    }
                }
                continue;
            } else if (bpVar.am * 1029799691 == 3) {
                i5 = (bpVar.ar * -819450565) - i3;
                if (i5 > 0) {
                    i6 = (bpVar.ay * -910324983) + (((bpVar.at * 953630239) * i5) >> 8);
                    i7 = (bpVar.as * -2040807815) + (((bpVar.ab * 1596549269) * i5) >> 8);
                    i8 = (bpVar.ae * 15932113) + (((bpVar.az * 1406279247) * i5) >> 8);
                    i9 = (((bpVar.ah * -623647847) * i5) >> 8) + (bpVar.aq * -1285950259);
                    if (i >= i6 && i <= i7 && i2 >= i8 && i2 <= i9) {
                        return true;
                    }
                }
                continue;
            } else if (bpVar.am * 1029799691 == 4) {
                i5 = i3 - (bpVar.ar * -819450565);
                if (i5 > 0) {
                    i6 = (bpVar.ay * -910324983) + (((bpVar.at * 953630239) * i5) >> 8);
                    i7 = (bpVar.as * -2040807815) + (((bpVar.ab * 1596549269) * i5) >> 8);
                    i8 = (bpVar.ae * 15932113) + (((bpVar.az * 1406279247) * i5) >> 8);
                    i9 = (((bpVar.ah * -623647847) * i5) >> 8) + (bpVar.aq * -1285950259);
                    if (i >= i6 && i <= i7 && i2 >= i8 && i2 <= i9) {
                        return true;
                    }
                }
                continue;
            } else if (bpVar.am * 1029799691 == 5) {
                i5 = i2 - (bpVar.ae * 15932113);
                if (i5 > 0) {
                    i6 = (bpVar.ay * -910324983) + (((bpVar.at * 953630239) * i5) >> 8);
                    i7 = (bpVar.as * -2040807815) + (((bpVar.ab * 1596549269) * i5) >> 8);
                    i8 = (bpVar.ar * -819450565) + (((bpVar.aw * -1065372201) * i5) >> 8);
                    i9 = (((bpVar.ai * 948108197) * i5) >> 8) + (bpVar.aj * -474281063);
                    if (i >= i6 && i <= i7 && i3 >= i8 && i3 <= i9) {
                        return true;
                    }
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    boolean gk(int i, int i2, int i3) {
        for (int i4 = 0; i4 < bl; i4++) {
            bp bpVar = bd[i4];
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            if (bpVar.am * 1029799691 == 1) {
                i5 = (bpVar.ay * -910324983) - i;
                if (i5 > 0) {
                    i6 = (bpVar.ar * -819450565) + (((bpVar.aw * -1065372201) * i5) >> 8);
                    i7 = (bpVar.aj * -474281063) + (((bpVar.ai * 948108197) * i5) >> 8);
                    i8 = (bpVar.ae * 15932113) + (((bpVar.az * 1406279247) * i5) >> 8);
                    i9 = (((bpVar.ah * -623647847) * i5) >> 8) + (bpVar.aq * -1285950259);
                    if (i3 >= i6 && i3 <= i7 && i2 >= i8 && i2 <= i9) {
                        return true;
                    }
                }
                continue;
            } else if (bpVar.am * 1029799691 == 2) {
                i5 = i - (bpVar.ay * -910324983);
                if (i5 > 0) {
                    i6 = (bpVar.ar * -819450565) + (((bpVar.aw * -1065372201) * i5) >> 8);
                    i7 = (bpVar.aj * -474281063) + (((bpVar.ai * 948108197) * i5) >> 8);
                    i8 = (bpVar.ae * 15932113) + (((bpVar.az * 1406279247) * i5) >> 8);
                    i9 = (((bpVar.ah * -623647847) * i5) >> 8) + (bpVar.aq * -1285950259);
                    if (i3 >= i6 && i3 <= i7 && i2 >= i8 && i2 <= i9) {
                        return true;
                    }
                }
                continue;
            } else if (bpVar.am * 1029799691 == 3) {
                i5 = (bpVar.ar * -819450565) - i3;
                if (i5 > 0) {
                    i6 = (bpVar.ay * -910324983) + (((bpVar.at * 953630239) * i5) >> 8);
                    i7 = (bpVar.as * -2040807815) + (((bpVar.ab * 1596549269) * i5) >> 8);
                    i8 = (bpVar.ae * 15932113) + (((bpVar.az * 1406279247) * i5) >> 8);
                    i9 = (((bpVar.ah * -623647847) * i5) >> 8) + (bpVar.aq * -1285950259);
                    if (i >= i6 && i <= i7 && i2 >= i8 && i2 <= i9) {
                        return true;
                    }
                }
                continue;
            } else if (bpVar.am * 1029799691 == 4) {
                i5 = i3 - (bpVar.ar * -819450565);
                if (i5 > 0) {
                    i6 = (bpVar.ay * -910324983) + (((bpVar.at * 953630239) * i5) >> 8);
                    i7 = (bpVar.as * -2040807815) + (((bpVar.ab * 1596549269) * i5) >> 8);
                    i8 = (bpVar.ae * 15932113) + (((bpVar.az * 1406279247) * i5) >> 8);
                    i9 = (((bpVar.ah * -623647847) * i5) >> 8) + (bpVar.aq * -1285950259);
                    if (i >= i6 && i <= i7 && i2 >= i8 && i2 <= i9) {
                        return true;
                    }
                }
                continue;
            } else if (bpVar.am * 1029799691 == 5) {
                i5 = i2 - (bpVar.ae * 15932113);
                if (i5 > 0) {
                    i6 = (bpVar.ay * -910324983) + (((bpVar.at * 953630239) * i5) >> 8);
                    i7 = (bpVar.as * -2040807815) + (((bpVar.ab * 1596549269) * i5) >> 8);
                    i8 = (bpVar.ar * -819450565) + (((bpVar.aw * -1065372201) * i5) >> 8);
                    i9 = (((bpVar.ai * 948108197) * i5) >> 8) + (bpVar.aj * -474281063);
                    if (i >= i6 && i <= i7 && i3 >= i8 && i3 <= i9) {
                        return true;
                    }
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    boolean gr(int i, int i2, int i3) {
        for (int i4 = 0; i4 < bl; i4++) {
            bp bpVar = bd[i4];
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            if (bpVar.am * 1416560477 == 1) {
                i5 = (bpVar.ay * -1509493920) - i;
                if (i5 > 0) {
                    i6 = (bpVar.ar * -819450565) + (((bpVar.aw * -1065372201) * i5) >> 8);
                    i7 = (bpVar.aj * -474281063) + (((bpVar.ai * 321511506) * i5) >> 8);
                    i8 = (bpVar.ae * 1546145770) + (((bpVar.az * 771769231) * i5) >> 8);
                    i9 = (((bpVar.ah * -623647847) * i5) >> 8) + (bpVar.aq * 320070358);
                    if (i3 >= i6 && i3 <= i7 && i2 >= i8 && i2 <= i9) {
                        return true;
                    }
                }
                continue;
            } else if (bpVar.am * 827444373 == 2) {
                i5 = i - (bpVar.ay * -910324983);
                if (i5 > 0) {
                    i6 = (bpVar.ar * -819450565) + (((bpVar.aw * -1065372201) * i5) >> 8);
                    i7 = (bpVar.aj * -474281063) + (((bpVar.ai * 1293171493) * i5) >> 8);
                    i8 = (bpVar.ae * 15932113) + (((bpVar.az * 1406279247) * i5) >> 8);
                    i9 = (((bpVar.ah * 555364499) * i5) >> 8) + (bpVar.aq * -1285950259);
                    if (i3 >= i6 && i3 <= i7 && i2 >= i8 && i2 <= i9) {
                        return true;
                    }
                }
                continue;
            } else if (bpVar.am * 215955922 == 3) {
                i5 = (bpVar.ar * -819450565) - i3;
                if (i5 > 0) {
                    i6 = (bpVar.ay * 447473707) + (((bpVar.at * 953630239) * i5) >> 8);
                    i7 = (bpVar.as * -2040807815) + (((bpVar.ab * -1639853175) * i5) >> 8);
                    i8 = (bpVar.ae * 15932113) + (((bpVar.az * 1406279247) * i5) >> 8);
                    i9 = (((bpVar.ah * -623647847) * i5) >> 8) + (bpVar.aq * 1721381816);
                    if (i >= i6 && i <= i7 && i2 >= i8 && i2 <= i9) {
                        return true;
                    }
                }
                continue;
            } else if (bpVar.am * 1029799691 == 4) {
                i5 = i3 - (bpVar.ar * -819450565);
                if (i5 > 0) {
                    i6 = (bpVar.ay * -910324983) + (((bpVar.at * 1746538963) * i5) >> 8);
                    i7 = (bpVar.as * 2023548149) + (((bpVar.ab * -1718561786) * i5) >> 8);
                    i8 = (bpVar.ae * 15932113) + (((bpVar.az * -1664511965) * i5) >> 8);
                    i9 = (((bpVar.ah * -623647847) * i5) >> 8) + (bpVar.aq * -1285950259);
                    if (i >= i6 && i <= i7 && i2 >= i8 && i2 <= i9) {
                        return true;
                    }
                }
                continue;
            } else if (bpVar.am * -1107540364 == 5) {
                i5 = i2 - (bpVar.ae * 15932113);
                if (i5 > 0) {
                    i6 = (bpVar.ay * -910324983) + (((bpVar.at * -625868693) * i5) >> 8);
                    i7 = (bpVar.as * -1709566278) + (((bpVar.ab * 725146500) * i5) >> 8);
                    i8 = (bpVar.ar * -819450565) + (((bpVar.aw * -1065372201) * i5) >> 8);
                    i9 = (((bpVar.ai * 948108197) * i5) >> 8) + (bpVar.aj * -474281063);
                    if (i >= i6 && i <= i7 && i3 >= i8 && i3 <= i9) {
                        return true;
                    }
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }
}
