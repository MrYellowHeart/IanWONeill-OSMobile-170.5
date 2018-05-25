package p000;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public abstract class ea {
    public static final int be = 51;
    static fx[] cw = null;
    static final int lc = 2;
    HashMap aa;
    int ad;
    final int af;
    HashMap ag;
    et[] an;
    Comparator ay;

    abstract et ao(byte b);

    abstract et[] ax(int i, int i2);

    abstract et cd();

    abstract et ch();

    abstract et[] cj(int i);

    abstract et[] cm(int i);

    abstract et[] cq(int i);

    ea(int i) {
        try {
            this.ad = 0;
            this.ay = null;
            this.af = -916435465 * i;
            this.an = ax(i, 1991429076);
            this.aa = new HashMap(i / 8);
            this.ag = new HashMap(i / 8);
        } catch (Throwable e) {
            throw ba.ad(e, "ea.<init>(" + ')');
        }
    }

    public static int af(int i, int i2, int i3, ev evVar, eq eqVar, boolean z, int[] iArr, int[] iArr2, byte b) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Object obj;
        int i15;
        int i16;
        for (i4 = 0; i4 < mn.an; i4++) {
            int i17 = 0;
            while (i17 < mn.an) {
                try {
                    ep.an[i4][i17] = 0;
                    ep.aa[i4][i17] = 99999999;
                    i17++;
                } catch (Throwable e) {
                    throw ba.ad(e, "ea.af(" + ')');
                }
            }
        }
        int[][] iArr3;
        if (1 == i3) {
            i5 = i - 64;
            i6 = i2 - 64;
            ep.an[64][64] = 99;
            ep.aa[64][64] = 0;
            i17 = 0;
            ep.ar[0] = i;
            i7 = 1;
            ep.aj[0] = i2;
            iArr3 = eqVar.bu;
            i8 = i2;
            i9 = i;
            while (i17 != i7) {
                i9 = ep.ar[i17];
                i8 = ep.aj[i17];
                i10 = (i17 + 1) & 4095;
                i11 = i9 - i5;
                i12 = i8 - i6;
                i13 = i9 - (629663169 * eqVar.bv);
                i14 = i8 - (1327812849 * eqVar.bp);
                if (evVar.af(1, i9, i8, eqVar, (byte) 60)) {
                    ep.ag = -1827002269 * i9;
                    ep.ay = -1112299077 * i8;
                    obj = 1;
                    break;
                }
                i4 = ep.aa[i11][i12] + 1;
                if (i11 > 0 && ep.an[i11 - 1][i12] == 0 && (iArr3[i13 - 1][i14] & 19136776) == 0) {
                    ep.ar[i7] = i9 - 1;
                    ep.aj[i7] = i8;
                    i17 = (i7 + 1) & 4095;
                    ep.an[i11 - 1][i12] = 2;
                    ep.aa[i11 - 1][i12] = i4;
                } else {
                    i17 = i7;
                }
                if (i11 < 127 && ep.an[i11 + 1][i12] == 0 && (iArr3[i13 + 1][i14] & 19136896) == 0) {
                    ep.ar[i17] = i9 + 1;
                    ep.aj[i17] = i8;
                    i17 = (i17 + 1) & 4095;
                    ep.an[i11 + 1][i12] = 8;
                    ep.aa[i11 + 1][i12] = i4;
                }
                if (i12 > 0 && ep.an[i11][i12 - 1] == 0 && (iArr3[i13][i14 - 1] & 19136770) == 0) {
                    ep.ar[i17] = i9;
                    ep.aj[i17] = i8 - 1;
                    i17 = (i17 + 1) & 4095;
                    ep.an[i11][i12 - 1] = 1;
                    ep.aa[i11][i12 - 1] = i4;
                }
                if (i12 < 127 && ep.an[i11][i12 + 1] == 0 && (iArr3[i13][i14 + 1] & 19136800) == 0) {
                    ep.ar[i17] = i9;
                    ep.aj[i17] = i8 + 1;
                    i17 = (i17 + 1) & 4095;
                    ep.an[i11][i12 + 1] = 4;
                    ep.aa[i11][i12 + 1] = i4;
                }
                if (i11 > 0 && i12 > 0 && ep.an[i11 - 1][i12 - 1] == 0 && (iArr3[i13 - 1][i14 - 1] & 19136782) == 0 && (iArr3[i13 - 1][i14] & 19136776) == 0 && (iArr3[i13][i14 - 1] & 19136770) == 0) {
                    ep.ar[i17] = i9 - 1;
                    ep.aj[i17] = i8 - 1;
                    i17 = (i17 + 1) & 4095;
                    ep.an[i11 - 1][i12 - 1] = 3;
                    ep.aa[i11 - 1][i12 - 1] = i4;
                }
                if (i11 < 127 && i12 > 0 && ep.an[i11 + 1][i12 - 1] == 0 && (iArr3[i13 + 1][i14 - 1] & 19136899) == 0 && (iArr3[i13 + 1][i14] & 19136896) == 0 && (iArr3[i13][i14 - 1] & 19136770) == 0) {
                    ep.ar[i17] = i9 + 1;
                    ep.aj[i17] = i8 - 1;
                    i17 = (i17 + 1) & 4095;
                    ep.an[i11 + 1][i12 - 1] = 9;
                    ep.aa[i11 + 1][i12 - 1] = i4;
                }
                if (i11 > 0 && i12 < 127 && ep.an[i11 - 1][i12 + 1] == 0 && (iArr3[i13 - 1][i14 + 1] & 19136824) == 0 && (iArr3[i13 - 1][i14] & 19136776) == 0 && (iArr3[i13][i14 + 1] & 19136800) == 0) {
                    ep.ar[i17] = i9 - 1;
                    ep.aj[i17] = i8 + 1;
                    i17 = (i17 + 1) & 4095;
                    ep.an[i11 - 1][i12 + 1] = 6;
                    ep.aa[i11 - 1][i12 + 1] = i4;
                }
                if (i11 < 127 && i12 < 127 && ep.an[i11 + 1][i12 + 1] == 0 && (iArr3[i13 + 1][i14 + 1] & 19136992) == 0 && (iArr3[i13 + 1][i14] & 19136896) == 0 && (iArr3[i13][i14 + 1] & 19136800) == 0) {
                    ep.ar[i17] = i9 + 1;
                    ep.aj[i17] = i8 + 1;
                    i17 = (i17 + 1) & 4095;
                    ep.an[i11 + 1][i12 + 1] = 12;
                    ep.aa[i11 + 1][i12 + 1] = i4;
                }
                i7 = i17;
                i17 = i10;
            }
            ep.ag = -1827002269 * i9;
            ep.ay = -1112299077 * i8;
            obj = null;
        } else if (2 == i3) {
            i5 = i - 64;
            i6 = i2 - 64;
            ep.an[64][64] = 99;
            ep.aa[64][64] = 0;
            i17 = 0;
            ep.ar[0] = i;
            i7 = 1;
            ep.aj[0] = i2;
            iArr3 = eqVar.bu;
            i8 = i2;
            i9 = i;
            while (i7 != i17) {
                i9 = ep.ar[i17];
                i8 = ep.aj[i17];
                i10 = (i17 + 1) & 4095;
                i11 = i9 - i5;
                i12 = i8 - i6;
                i13 = i9 - (629663169 * eqVar.bv);
                i14 = i8 - (1327812849 * eqVar.bp);
                if (evVar.af(2, i9, i8, eqVar, (byte) 67)) {
                    ep.ag = -1827002269 * i9;
                    ep.ay = -1112299077 * i8;
                    obj = 1;
                    break;
                }
                i4 = ep.aa[i11][i12] + 1;
                if (i11 <= 0) {
                    i17 = i7;
                } else if (ep.an[i11 - 1][i12] != 0) {
                    i17 = i7;
                } else if ((iArr3[i13 - 1][i14] & 19136782) != 0) {
                    i17 = i7;
                } else if ((iArr3[i13 - 1][i14 + 1] & 19136824) != 0) {
                    i17 = i7;
                } else {
                    ep.ar[i7] = i9 - 1;
                    ep.aj[i7] = i8;
                    i17 = (i7 + 1) & 4095;
                    ep.an[i11 - 1][i12] = 2;
                    ep.aa[i11 - 1][i12] = i4;
                }
                if (i11 < 126 && ep.an[i11 + 1][i12] == 0) {
                    if ((iArr3[i13 + 2][i14] & 19136899) == 0) {
                        if ((iArr3[i13 + 2][i14 + 1] & 19136992) == 0) {
                            ep.ar[i17] = i9 + 1;
                            ep.aj[i17] = i8;
                            i17 = (i17 + 1) & 4095;
                            ep.an[i11 + 1][i12] = 8;
                            ep.aa[i11 + 1][i12] = i4;
                        }
                    }
                }
                if (i12 > 0 && ep.an[i11][i12 - 1] == 0 && (iArr3[i13][i14 - 1] & 19136782) == 0) {
                    if ((iArr3[i13 + 1][i14 - 1] & 19136899) == 0) {
                        ep.ar[i17] = i9;
                        ep.aj[i17] = i8 - 1;
                        i17 = (i17 + 1) & 4095;
                        ep.an[i11][i12 - 1] = 1;
                        ep.aa[i11][i12 - 1] = i4;
                    }
                }
                if (i12 < 126 && ep.an[i11][i12 + 1] == 0 && (iArr3[i13][i14 + 2] & 19136824) == 0 && (iArr3[i13 + 1][i14 + 2] & 19136992) == 0) {
                    ep.ar[i17] = i9;
                    ep.aj[i17] = i8 + 1;
                    i17 = (i17 + 1) & 4095;
                    ep.an[i11][i12 + 1] = 4;
                    ep.aa[i11][i12 + 1] = i4;
                }
                if (i11 > 0 && i12 > 0 && ep.an[i11 - 1][i12 - 1] == 0 && (iArr3[i13 - 1][i14] & 19136830) == 0 && (iArr3[i13 - 1][i14 - 1] & 19136782) == 0 && (iArr3[i13][i14 - 1] & 19136911) == 0) {
                    ep.ar[i17] = i9 - 1;
                    ep.aj[i17] = i8 - 1;
                    i17 = (i17 + 1) & 4095;
                    ep.an[i11 - 1][i12 - 1] = 3;
                    ep.aa[i11 - 1][i12 - 1] = i4;
                }
                if (i11 < 126 && i12 > 0 && ep.an[i11 + 1][i12 - 1] == 0 && (iArr3[i13 + 1][i14 - 1] & 19136911) == 0 && (iArr3[i13 + 2][i14 - 1] & 19136899) == 0) {
                    if ((iArr3[i13 + 2][i14] & 19136995) == 0) {
                        ep.ar[i17] = i9 + 1;
                        ep.aj[i17] = i8 - 1;
                        i17 = (i17 + 1) & 4095;
                        ep.an[i11 + 1][i12 - 1] = 9;
                        ep.aa[i11 + 1][i12 - 1] = i4;
                    }
                }
                if (i11 > 0 && i12 < 126 && ep.an[i11 - 1][i12 + 1] == 0 && (iArr3[i13 - 1][i14 + 1] & 19136830) == 0 && (iArr3[i13 - 1][i14 + 2] & 19136824) == 0) {
                    if ((iArr3[i13][i14 + 2] & 19137016) == 0) {
                        ep.ar[i17] = i9 - 1;
                        ep.aj[i17] = i8 + 1;
                        i17 = (i17 + 1) & 4095;
                        ep.an[i11 - 1][i12 + 1] = 6;
                        ep.aa[i11 - 1][i12 + 1] = i4;
                    }
                }
                if (i11 < 126 && i12 < 126 && ep.an[i11 + 1][i12 + 1] == 0) {
                    if ((iArr3[i13 + 1][i14 + 2] & 19137016) == 0) {
                        if ((iArr3[i13 + 2][i14 + 2] & 19136992) == 0) {
                            if ((iArr3[i13 + 2][i14 + 1] & 19136995) == 0) {
                                ep.ar[i17] = i9 + 1;
                                ep.aj[i17] = i8 + 1;
                                i17 = (i17 + 1) & 4095;
                                ep.an[i11 + 1][i12 + 1] = 12;
                                ep.aa[i11 + 1][i12 + 1] = i4;
                            }
                        }
                    }
                }
                i7 = i17;
                i17 = i10;
            }
            ep.ag = -1827002269 * i9;
            ep.ay = -1112299077 * i8;
            obj = null;
        } else {
            i5 = i - 64;
            i6 = i2 - 64;
            ep.an[64][64] = 99;
            ep.aa[64][64] = 0;
            i17 = 0;
            ep.ar[0] = i;
            i7 = 1;
            ep.aj[0] = i2;
            iArr3 = eqVar.bu;
            i8 = i2;
            i9 = i;
            while (i7 != i17) {
                i9 = ep.ar[i17];
                i8 = ep.aj[i17];
                i10 = (i17 + 1) & 4095;
                i11 = i9 - i5;
                i12 = i8 - i6;
                i13 = i9 - (629663169 * eqVar.bv);
                i14 = i8 - (eqVar.bp * 1327812849);
                if (evVar.af(i3, i9, i8, eqVar, (byte) 39)) {
                    ep.ag = -1827002269 * i9;
                    ep.ay = -1112299077 * i8;
                    obj = 1;
                    break;
                }
                i15 = ep.aa[i11][i12] + 1;
                if (i11 <= 0) {
                    i4 = i7;
                } else if (ep.an[i11 - 1][i12] != 0) {
                    i4 = i7;
                } else if ((iArr3[i13 - 1][i14] & 19136782) != 0) {
                    i4 = i7;
                } else if ((iArr3[i13 - 1][(i3 + i14) - 1] & 19136824) != 0) {
                    i4 = i7;
                } else {
                    for (i17 = 1; i17 < i3 - 1; i17++) {
                        if ((iArr3[i13 - 1][i17 + i14] & 19136830) != 0) {
                            i4 = i7;
                            break;
                        }
                    }
                    ep.ar[i7] = i9 - 1;
                    ep.aj[i7] = i8;
                    i4 = (i7 + 1) & 4095;
                    ep.an[i11 - 1][i12] = 2;
                    ep.aa[i11 - 1][i12] = i15;
                }
                if (i11 < 128 - i3 && ep.an[i11 + 1][i12] == 0 && (iArr3[i3 + i13][i14] & 19136899) == 0 && (iArr3[i13 + i3][(i3 + i14) - 1] & 19136992) == 0) {
                    for (i17 = 1; i17 < i3 - 1; i17++) {
                        if ((iArr3[i13 + i3][i14 + i17] & 19136995) != 0) {
                            break;
                        }
                    }
                    ep.ar[i4] = i9 + 1;
                    ep.aj[i4] = i8;
                    i4 = (i4 + 1) & 4095;
                    ep.an[i11 + 1][i12] = 8;
                    ep.aa[i11 + 1][i12] = i15;
                }
                if (i12 > 0 && ep.an[i11][i12 - 1] == 0 && (iArr3[i13][i14 - 1] & 19136782) == 0 && (iArr3[(i13 + i3) - 1][i14 - 1] & 19136899) == 0) {
                    for (i17 = 1; i17 < i3 - 1; i17++) {
                        if ((iArr3[i17 + i13][i14 - 1] & 19136911) != 0) {
                            break;
                        }
                    }
                    ep.ar[i4] = i9;
                    ep.aj[i4] = i8 - 1;
                    i4 = (i4 + 1) & 4095;
                    ep.an[i11][i12 - 1] = 1;
                    ep.aa[i11][i12 - 1] = i15;
                }
                if (i12 < 128 - i3 && ep.an[i11][i12 + 1] == 0 && (iArr3[i13][i3 + i14] & 19136824) == 0 && (iArr3[(i3 + i13) - 1][i14 + i3] & 19136992) == 0) {
                    for (i17 = 1; i17 < i3 - 1; i17++) {
                        if ((iArr3[i13 + i17][i3 + i14] & 19137016) != 0) {
                            break;
                        }
                    }
                    ep.ar[i4] = i9;
                    ep.aj[i4] = i8 + 1;
                    i4 = (i4 + 1) & 4095;
                    ep.an[i11][i12 + 1] = 4;
                    ep.aa[i11][i12 + 1] = i15;
                }
                if (i11 > 0 && i12 > 0 && ep.an[i11 - 1][i12 - 1] == 0) {
                    if ((iArr3[i13 - 1][i14 - 1] & 19136782) == 0) {
                        i17 = 1;
                        while (i17 < i3) {
                            if ((iArr3[i13 - 1][(i14 - 1) + i17] & 19136830) != 0 || (iArr3[(i13 - 1) + i17][i14 - 1] & 19136911) != 0) {
                                break;
                            }
                            i17++;
                        }
                        ep.ar[i4] = i9 - 1;
                        ep.aj[i4] = i8 - 1;
                        i4 = (i4 + 1) & 4095;
                        ep.an[i11 - 1][i12 - 1] = 3;
                        ep.aa[i11 - 1][i12 - 1] = i15;
                    }
                }
                if (i11 < 128 - i3 && i12 > 0 && ep.an[i11 + 1][i12 - 1] == 0) {
                    if ((iArr3[i13 + i3][i14 - 1] & 19136899) == 0) {
                        i17 = 1;
                        while (i17 < i3) {
                            if ((iArr3[i3 + i13][(i14 - 1) + i17] & 19136995) != 0 || (iArr3[i13 + i17][i14 - 1] & 19136911) != 0) {
                                break;
                            }
                            i17++;
                        }
                        ep.ar[i4] = i9 + 1;
                        ep.aj[i4] = i8 - 1;
                        i4 = (i4 + 1) & 4095;
                        ep.an[i11 + 1][i12 - 1] = 9;
                        ep.aa[i11 + 1][i12 - 1] = i15;
                    }
                }
                if (i11 <= 0 || i12 >= 128 - i3) {
                    i17 = i4;
                } else if (ep.an[i11 - 1][i12 + 1] != 0) {
                    i17 = i4;
                } else if ((iArr3[i13 - 1][i3 + i14] & 19136824) != 0) {
                    i17 = i4;
                } else {
                    i17 = 1;
                    while (i17 < i3) {
                        if ((iArr3[i13 - 1][i14 + i17] & 19136830) != 0) {
                            i17 = i4;
                            break;
                        } else if ((iArr3[(i13 - 1) + i17][i14 + i3] & 19137016) != 0) {
                            i17 = i4;
                            break;
                        } else {
                            i17++;
                        }
                    }
                    ep.ar[i4] = i9 - 1;
                    ep.aj[i4] = i8 + 1;
                    i17 = (i4 + 1) & 4095;
                    ep.an[i11 - 1][i12 + 1] = 6;
                    ep.aa[i11 - 1][i12 + 1] = i15;
                }
                if (i11 < 128 - i3 && i12 < 128 - i3 && ep.an[i11 + 1][i12 + 1] == 0 && (iArr3[i13 + i3][i3 + i14] & 19136992) == 0) {
                    i4 = 1;
                    while (i4 < i3) {
                        if ((iArr3[i13 + i4][i3 + i14] & 19137016) != 0 || (iArr3[i3 + i13][i14 + i4] & 19136995) != 0) {
                            break;
                        }
                        i4++;
                    }
                    ep.ar[i17] = i9 + 1;
                    ep.aj[i17] = i8 + 1;
                    i17 = (i17 + 1) & 4095;
                    ep.an[i11 + 1][i12 + 1] = 12;
                    ep.aa[i11 + 1][i12 + 1] = i15;
                }
                i7 = i17;
                i17 = i10;
            }
            ep.ag = -1827002269 * i9;
            ep.ay = -1112299077 * i8;
            obj = null;
        }
        i5 = i - 64;
        i6 = i2 - 64;
        i9 = ep.ag * -1057908405;
        i4 = 92779379 * ep.ay;
        if (obj == null) {
            if (!z) {
                return -1;
            }
            i8 = Integer.MAX_VALUE;
            i17 = Integer.MAX_VALUE;
            i11 = -1205974761 * evVar.af;
            i12 = 989331065 * evVar.ad;
            i13 = evVar.an * 1366818547;
            i14 = -1587490839 * evVar.aa;
            i7 = i11 - 10;
            while (i7 <= 10 + i11) {
                i15 = i12 - 10;
                i16 = i4;
                i10 = i9;
                i9 = i17;
                while (i15 <= 10 + i12) {
                    int i18 = i7 - i5;
                    int i19 = i15 - i6;
                    if (i18 >= 0 && i19 >= 0 && i18 < 128 && i19 < 128 && ep.aa[i18][i19] < 100) {
                        i17 = 0;
                        if (i7 < i11) {
                            i17 = i11 - i7;
                        } else if (i7 > (i13 + i11) - 1) {
                            i17 = i7 - ((i11 + i13) - 1);
                        }
                        i4 = 0;
                        if (i15 < i12) {
                            i4 = i12 - i15;
                        } else if (i15 > (i14 + i12) - 1) {
                            i4 = i15 - ((i12 + i14) - 1);
                        }
                        i4 = (i4 * i4) + (i17 * i17);
                        if (i4 < i8 || (i4 == i8 && ep.aa[i18][i19] < i9)) {
                            i17 = ep.aa[i18][i19];
                            i9 = i15;
                            i8 = i7;
                            i15++;
                            i16 = i9;
                            i10 = i8;
                            i9 = i17;
                            i8 = i4;
                        }
                    }
                    i17 = i9;
                    i4 = i8;
                    i9 = i16;
                    i8 = i10;
                    i15++;
                    i16 = i9;
                    i10 = i8;
                    i9 = i17;
                    i8 = i4;
                }
                i7++;
                i17 = i9;
                i4 = i16;
                i9 = i10;
            }
            if (Integer.MAX_VALUE == i8) {
                return -1;
            }
        }
        if (i == i9 && i2 == i4) {
            return 0;
        }
        ep.ar[0] = i9;
        i17 = 1;
        ep.aj[0] = i4;
        i8 = ep.an[i9 - i5][i4 - i6];
        i15 = i8;
        while (true) {
            if (i == i9 && i4 == i2) {
                break;
            }
            if (i8 != i15) {
                ep.ar[i17] = i9;
                i8 = i17 + 1;
                ep.aj[i17] = i4;
                i16 = i8;
                i8 = i15;
            } else {
                i16 = i17;
            }
            if ((i15 & 2) != 0) {
                i9++;
            } else if ((i15 & 8) != 0) {
                i9--;
            }
            if ((i15 & 1) != 0) {
                i17 = i4 + 1;
            } else if ((i15 & 4) != 0) {
                i17 = i4 - 1;
            } else {
                i17 = i4;
            }
            i15 = ep.an[i9 - i5][i17 - i6];
            i4 = i17;
            i17 = i16;
        }
        i4 = 0;
        while (true) {
            i9 = i17 - 1;
            if (i17 <= 0) {
                return i4;
            }
            iArr[i4] = ep.ar[i9];
            i17 = i4 + 1;
            iArr2[i4] = ep.aj[i9];
            if (i17 >= iArr.length) {
                return i17;
            }
            i4 = i17;
            i17 = i9;
        }
    }

    public void af(int i) {
        try {
            this.ad = 0;
            Arrays.fill(this.an, null);
            this.aa.clear();
            this.ag.clear();
        } catch (Throwable e) {
            throw ba.ad(e, "ea.af(" + ')');
        }
    }

    public int ac() {
        return -1708013763 * this.ad;
    }

    public int ad(int i) {
        try {
            return -1708013763 * this.ad;
        } catch (Throwable e) {
            throw ba.ad(e, "ea.ad(" + ')');
        }
    }

    public int al() {
        return -1708013763 * this.ad;
    }

    public int ap() {
        return -1708013763 * this.ad;
    }

    public boolean an(int i) {
        try {
            return this.ad * -1708013763 == -1405975609 * this.af;
        } catch (Throwable e) {
            throw ba.ad(e, "ea.an(" + ')');
        }
    }

    public boolean bb() {
        return this.ad * -1708013763 == -1405975609 * this.af;
    }

    public boolean bc() {
        return this.ad * -1708013763 == -1405975609 * this.af;
    }

    public boolean bw() {
        return this.ad * -1708013763 == -1405975609 * this.af;
    }

    public boolean aa(ey eyVar, byte b) {
        try {
            if (!eyVar.ad(-1069759578)) {
                return false;
            }
            if (this.aa.containsKey(eyVar)) {
                return true;
            }
            return this.ag.containsKey(eyVar);
        } catch (Throwable e) {
            throw ba.ad(e, "ea.aa(" + ')');
        }
    }

    public et ag(ey eyVar, int i) {
        try {
            et ay = ay(eyVar, 1099558325);
            if (ay == null) {
                ay = as(eyVar, -105120672);
            }
            return ay;
        } catch (Throwable e) {
            throw ba.ad(e, "ea.ag(" + ')');
        }
    }

    public et bg(ey eyVar) {
        et ay = ay(eyVar, 1099558325);
        return ay != null ? ay : as(eyVar, 1752657767);
    }

    public et bz(ey eyVar) {
        et ay = ay(eyVar, 1099558325);
        return ay != null ? ay : as(eyVar, 1239654611);
    }

    et ay(ey eyVar, int i) {
        try {
            if (eyVar.ad(-1069759578)) {
                return (et) this.aa.get(eyVar);
            }
            return null;
        } catch (Throwable e) {
            throw ba.ad(e, "ea.ay(" + ')');
        }
    }

    et bf(ey eyVar) {
        return !eyVar.ad(-1069759578) ? null : (et) this.aa.get(eyVar);
    }

    et bh(ey eyVar) {
        if (eyVar.ad(-1069759578)) {
            return (et) this.aa.get(eyVar);
        }
        return null;
    }

    et as(ey eyVar, int i) {
        try {
            if (eyVar.ad(-1069759578)) {
                return (et) this.ag.get(eyVar);
            }
            return null;
        } catch (Throwable e) {
            throw ba.ad(e, "ea.as(" + ')');
        }
    }

    et bp(ey eyVar) {
        if (eyVar.ad(-1069759578)) {
            return (et) this.ag.get(eyVar);
        }
        return null;
    }

    et bt(ey eyVar) {
        return !eyVar.ad(-1069759578) ? null : (et) this.ag.get(eyVar);
    }

    et bv(ey eyVar) {
        if (eyVar.ad(-1069759578)) {
            return (et) this.ag.get(eyVar);
        }
        return null;
    }

    et bx(ey eyVar) {
        if (eyVar.ad(-1069759578)) {
            return (et) this.ag.get(eyVar);
        }
        return null;
    }

    public final boolean ar(ey eyVar, short s) {
        try {
            et ay = ay(eyVar, 1099558325);
            if (ay == null) {
                return false;
            }
            aj(ay, 2142124456);
            return true;
        } catch (Throwable e) {
            throw ba.ad(e, "ea.ar(" + ')');
        }
    }

    public final boolean be(ey eyVar) {
        et ay = ay(eyVar, 1099558325);
        if (ay == null) {
            return false;
        }
        aj(ay, 2142124456);
        return true;
    }

    public final boolean bk(ey eyVar) {
        et ay = ay(eyVar, 1099558325);
        if (ay == null) {
            return false;
        }
        aj(ay, 2142124456);
        return true;
    }

    public final boolean bu(ey eyVar) {
        et ay = ay(eyVar, 1099558325);
        if (ay == null) {
            return false;
        }
        aj(ay, 2142124456);
        return true;
    }

    final void aj(et etVar, int i) {
        try {
            int aw = aw(etVar, 2064031766);
            if (aw != -1) {
                ak(aw, (byte) -85);
                ai(etVar, -598918974);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "ea.aj(" + ')');
        }
    }

    final void bn(et etVar) {
        int aw = aw(etVar, 444249715);
        if (aw != -1) {
            ak(aw, (byte) 0);
            ai(etVar, -249737743);
        }
    }

    final void by(et etVar) {
        int aw = aw(etVar, 108887602);
        if (aw != -1) {
            ak(aw, (byte) -35);
            ai(etVar, -1149361663);
        }
    }

    et ae(ey eyVar, int i) {
        try {
            return aq(eyVar, null, -386352732);
        } catch (Throwable e) {
            throw ba.ad(e, "ea.ae(" + ')');
        }
    }

    public static fx[] as(kf kfVar, String str, String str2, int i) {
        try {
            int ax = kfVar.ax(str, -746549376);
            if (jo.ai(kfVar, ax, kfVar.au(ax, str2, -1400620072), 957174327)) {
                return bd.ab(471225631);
            }
            return null;
        } catch (Throwable e) {
            throw ba.ad(e, "ea.as(" + ')');
        }
    }

    et aq(ey eyVar, ey eyVar2, int i) {
        try {
            if (ay(eyVar, 1099558325) != null) {
                throw new IllegalStateException();
            }
            et ao = ao((byte) 21);
            ao.at(eyVar, eyVar2, (byte) 26);
            az(ao, (byte) -105);
            ah(ao, -1910643432);
            return ao;
        } catch (Throwable e) {
            throw ba.ad(e, "ea.aq(" + ')');
        }
    }

    et ba(ey eyVar, ey eyVar2) {
        if (ay(eyVar, 1099558325) != null) {
            throw new IllegalStateException();
        }
        et ao = ao((byte) 5);
        ao.at(eyVar, eyVar2, (byte) 115);
        az(ao, (byte) -117);
        ah(ao, 158698465);
        return ao;
    }

    et bd(ey eyVar, ey eyVar2) {
        if (ay(eyVar, 1099558325) != null) {
            throw new IllegalStateException();
        }
        et ao = ao((byte) 4);
        ao.at(eyVar, eyVar2, (byte) 86);
        az(ao, (byte) -37);
        ah(ao, 138629529);
        return ao;
    }

    et bl(ey eyVar, ey eyVar2) {
        if (ay(eyVar, 1099558325) != null) {
            throw new IllegalStateException();
        }
        et ao = ao((byte) 13);
        ao.at(eyVar, eyVar2, (byte) 81);
        az(ao, (byte) -68);
        ah(ao, 318923594);
        return ao;
    }

    et bs(ey eyVar, ey eyVar2) {
        if (ay(eyVar, 1099558325) != null) {
            throw new IllegalStateException();
        }
        et ao = ao((byte) -20);
        ao.at(eyVar, eyVar2, (byte) 61);
        az(ao, (byte) -103);
        ah(ao, -741236921);
        return ao;
    }

    public final et am(int i, int i2) {
        if (i >= 0) {
            try {
                if (i < -1708013763 * this.ad) {
                    return this.an[i];
                }
            } catch (Throwable e) {
                throw ba.ad(e, "ea.am(" + ')');
            }
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final et bm(int i) {
        if (i >= 0 && i < 1318450864 * this.ad) {
            return this.an[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final et br(int i) {
        if (i >= 0 && i < 1019033224 * this.ad) {
            return this.an[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final void at(int i) {
        try {
            if (this.ay == null) {
                Arrays.sort(this.an, 0, this.ad * -1708013763);
            } else {
                Arrays.sort(this.an, 0, this.ad * -1708013763, this.ay);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "ea.at(" + ')');
        }
    }

    public final void bi() {
        if (this.ay == null) {
            Arrays.sort(this.an, 0, this.ad * -1708013763);
        } else {
            Arrays.sort(this.an, 0, 515447310 * this.ad, this.ay);
        }
    }

    public final void bj() {
        if (this.ay == null) {
            Arrays.sort(this.an, 0, this.ad * -1708013763);
        } else {
            Arrays.sort(this.an, 0, -117706901 * this.ad, this.ay);
        }
    }

    final void ab(et etVar, ey eyVar, ey eyVar2, byte b) {
        try {
            ai(etVar, -1570534603);
            etVar.at(eyVar, eyVar2, (byte) 10);
            ah(etVar, -919913652);
        } catch (Throwable e) {
            throw ba.ad(e, "ea.ab(" + ')');
        }
    }

    final void bo(et etVar, ey eyVar, ey eyVar2) {
        ai(etVar, 254084086);
        etVar.at(eyVar, eyVar2, (byte) 72);
        ah(etVar, -42977979);
    }

    final void bq(et etVar, ey eyVar, ey eyVar2) {
        ai(etVar, 1164379887);
        etVar.at(eyVar, eyVar2, (byte) 23);
        ah(etVar, -1788605339);
    }

    final void cv(et etVar, ey eyVar, ey eyVar2) {
        ai(etVar, 1899279114);
        etVar.at(eyVar, eyVar2, (byte) 15);
        ah(etVar, -1115426631);
    }

    final int aw(et etVar, int i) {
        int i2 = 0;
        while (i2 < -1708013763 * this.ad) {
            try {
                if (this.an[i2] == etVar) {
                    return i2;
                }
                i2++;
            } catch (Throwable e) {
                throw ba.ad(e, "ea.aw(" + ')');
            }
        }
        return -1;
    }

    final int ci(et etVar) {
        for (int i = 0; i < -1708013763 * this.ad; i++) {
            if (this.an[i] == etVar) {
                return i;
            }
        }
        return -1;
    }

    final void ai(et etVar, int i) {
        try {
            if (this.aa.remove(etVar.ad) == null) {
                throw new IllegalStateException();
            } else if (etVar.an != null) {
                this.ag.remove(etVar.an);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "ea.ai(" + ')');
        }
    }

    final void cc(et etVar) {
        if (this.aa.remove(etVar.ad) == null) {
            throw new IllegalStateException();
        } else if (etVar.an != null) {
            this.ag.remove(etVar.an);
        }
    }

    final void co(et etVar) {
        if (this.aa.remove(etVar.ad) == null) {
            throw new IllegalStateException();
        } else if (etVar.an != null) {
            this.ag.remove(etVar.an);
        }
    }

    final void az(et etVar, byte b) {
        try {
            et[] etVarArr = this.an;
            int i = this.ad + 192923669;
            this.ad = i;
            etVarArr[(i * -1708013763) - 1] = etVar;
        } catch (Throwable e) {
            throw ba.ad(e, "ea.az(" + ')');
        }
    }

    final void ck(et etVar) {
        et[] etVarArr = this.an;
        int i = this.ad + 192923669;
        this.ad = i;
        etVarArr[(i * -1708013763) - 1] = etVar;
    }

    final void cn(et etVar) {
        et[] etVarArr = this.an;
        int i = this.ad + 192923669;
        this.ad = i;
        etVarArr[(i * -1708013763) - 1] = etVar;
    }

    final void cy(et etVar) {
        et[] etVarArr = this.an;
        int i = this.ad + 192923669;
        this.ad = i;
        etVarArr[(i * -1424452906) - 1] = etVar;
    }

    final void ah(et etVar, int i) {
        try {
            this.aa.put(etVar.ad, etVar);
            if (etVar.an != null) {
                et etVar2 = (et) this.ag.put(etVar.an, etVar);
                if (etVar2 != null && etVar != etVar2) {
                    etVar2.an = null;
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "ea.ah(" + ')');
        }
    }

    final void cl(et etVar) {
        this.aa.put(etVar.ad, etVar);
        if (etVar.an != null) {
            et etVar2 = (et) this.ag.put(etVar.an, etVar);
            if (etVar2 != null && etVar != etVar2) {
                etVar2.an = null;
            }
        }
    }

    final void ak(int i, byte b) {
        try {
            this.ad -= 192923669;
            if (i < this.ad * -1708013763) {
                System.arraycopy(this.an, i + 1, this.an, i, (this.ad * -1708013763) - i);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "ea.ak(" + ')');
        }
    }

    final void cs(int i) {
        this.ad -= 192923669;
        if (i < this.ad * -1708013763) {
            System.arraycopy(this.an, i + 1, this.an, i, (this.ad * -1268889476) - i);
        }
    }

    public final void au(int i) {
        try {
            this.ay = null;
        } catch (Throwable e) {
            throw ba.ad(e, "ea.au(" + ')');
        }
    }

    public final void cb() {
        this.ay = null;
    }

    public final void cp() {
        this.ay = null;
    }

    public final void ct() {
        this.ay = null;
    }

    public final void cu() {
        this.ay = null;
    }

    public final void dj() {
        this.ay = null;
    }

    public final void av(Comparator comparator, byte b) {
        try {
            if (this.ay == null) {
                this.ay = comparator;
            } else if (this.ay instanceof el) {
                ((el) this.ay).aq(comparator, (byte) 63);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "ea.av(" + ')');
        }
    }

    public final void dc(Comparator comparator) {
        if (this.ay == null) {
            this.ay = comparator;
        } else if (this.ay instanceof el) {
            ((el) this.ay).aq(comparator, (byte) 115);
        }
    }

    public final void dk(Comparator comparator) {
        if (this.ay == null) {
            this.ay = comparator;
        } else if (this.ay instanceof el) {
            ((el) this.ay).aq(comparator, (byte) 39);
        }
    }

    public final void m7do(Comparator comparator) {
        if (this.ay == null) {
            this.ay = comparator;
        } else if (this.ay instanceof el) {
            ((el) this.ay).aq(comparator, (byte) 103);
        }
    }

    static final boolean at(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        try {
            int i9 = (cs.ag * 340086283) + i7;
            if (i9 < i && i9 < i2 && i9 < i3) {
                return false;
            }
            i9 = (cs.ag * 340086283) - i7;
            if (i9 > i && i9 > i2 && i9 > i3) {
                return false;
            }
            i9 = (cs.aa * -429386291) + i7;
            if (i9 < i4 && i9 < i5 && i9 < i6) {
                return false;
            }
            i9 = (cs.aa * -429386291) - i7;
            if (i9 <= i4 || i9 <= i5 || i9 <= i6) {
                return true;
            }
            return false;
        } catch (Throwable e) {
            throw ba.ad(e, "ea.at(" + ')');
        }
    }
}
