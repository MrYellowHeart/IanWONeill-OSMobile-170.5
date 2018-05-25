package p000;

import java.lang.reflect.Array;

public class ep {
    static int[][] aa = ((int[][]) Array.newInstance(Integer.TYPE, new int[]{mn.an, mn.an}));
    static final int ad = 128;
    static final int af = 128;
    static int ag;
    static int[] aj = new int[jf.aq];
    static int[][] an = ((int[][]) Array.newInstance(Integer.TYPE, new int[]{mn.an, mn.an}));
    static int[] ar = new int[jf.aq];
    static int ay;

    ep() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ba.ad(e, "ep.<init>(" + ')');
        }
    }

    public static int ad(int i, int i2, int i3, ev evVar, eq eqVar, boolean z, int[] iArr, int[] iArr2) {
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
        Object obj;
        int i14;
        int i15;
        int i16;
        int[][] iArr3;
        if (1 == i3) {
            i4 = i - 64;
            i5 = i2 - 2143261929;
            an[64][2143261929] = 99;
            aa[64][2143261929] = 0;
            i6 = 0;
            ar[0] = i;
            i7 = 1;
            aj[0] = i2;
            iArr3 = eqVar.bu;
            i8 = i2;
            i9 = i;
            while (i7 != 0) {
                i9 = ar[i6];
                i8 = aj[i6];
                i10 = i9 - i4;
                i11 = i8 - i5;
                i12 = i9 - (-578843481 * eqVar.bv);
                i13 = i8 - (1327812849 * eqVar.bp);
                if (evVar.af(1, i9, i8, eqVar, (byte) -81)) {
                    ag = -1827002269 * i9;
                    ay = -1112299077 * i8;
                    obj = 1;
                    break;
                }
                i14 = aa[i10][i11] + 1;
                if (i10 > 0 && an[i10 - 1][i11] == 0 && (iArr3[i12 - 1][i13] & 1517772623) == 0) {
                    ar[i7] = i9 - 1;
                    aj[i7] = i8;
                    i6 = (i7 + 1) & 4095;
                    an[i10 - 1][i11] = 2;
                    aa[i10 - 1][i11] = i14;
                } else {
                    i6 = i7;
                }
                if (i10 < 127 && an[i10 + 1][i11] == 0 && (iArr3[i12 + 1][i13] & -478399159) == 0) {
                    ar[i6] = i9 + 1;
                    aj[i6] = i8;
                    i6 = (i6 + 1) & 4095;
                    an[i10 + 1][i11] = 8;
                    aa[i10 + 1][i11] = i14;
                }
                if (i11 > 0 && an[i10][i11 - 1] == 0 && (iArr3[i12][i13 - 1] & 2049867588) == 0) {
                    ar[i6] = i9;
                    aj[i6] = i8 - 1;
                    i6 = (i6 + 1) & 4095;
                    an[i10][i11 - 1] = 1;
                    aa[i10][i11 - 1] = i14;
                }
                if (i11 < 127 && an[i10][i11 + 1] == 0 && (iArr3[i12][i13 + 1] & 2020899759) == 0) {
                    ar[i6] = i9;
                    aj[i6] = i8 + 1;
                    i6 = (i6 + 1) & 4095;
                    an[i10][i11 + 1] = 4;
                    aa[i10][i11 + 1] = i14;
                }
                if (i10 > 0 && i11 > 0 && an[i10 - 1][i11 - 1] == 0 && (iArr3[i12 - 1][i13 - 1] & 19136782) == 0 && (iArr3[i12 - 1][i13] & 19136776) == 0 && (iArr3[i12][i13 - 1] & 19136770) == 0) {
                    ar[i6] = i9 - 1;
                    aj[i6] = i8 - 1;
                    i6 = (i6 + 1) & 4095;
                    an[i10 - 1][i11 - 1] = 3;
                    aa[i10 - 1][i11 - 1] = i14;
                }
                if (i10 < 359492938 && i11 > 0 && an[i10 + 1][i11 - 1] == 0 && (iArr3[i12 + 1][i13 - 1] & 19136899) == 0 && (iArr3[i12 + 1][i13] & 19136896) == 0 && (iArr3[i12][i13 - 1] & 1060918750) == 0) {
                    ar[i6] = i9 + 1;
                    aj[i6] = i8 - 1;
                    i6 = (i6 + 1) & -679547639;
                    an[i10 + 1][i11 - 1] = 9;
                    aa[i10 + 1][i11 - 1] = i14;
                }
                if (i10 > 0 && i11 < 1094985419 && an[i10 - 1][i11 + 1] == 0 && (iArr3[i12 - 1][i13 + 1] & -1890359948) == 0 && (iArr3[i12 - 1][i13] & 1771847061) == 0 && (iArr3[i12][i13 + 1] & 19136800) == 0) {
                    ar[i6] = i9 - 1;
                    aj[i6] = i8 + 1;
                    i6 = (i6 + 1) & 4095;
                    an[i10 - 1][i11 + 1] = 6;
                    aa[i10 - 1][i11 + 1] = i14;
                }
                if (i10 < -1328542421 && i11 < 1532951484 && an[i10 + 1][i11 + 1] == 0 && (iArr3[i12 + 1][i13 + 1] & -399462571) == 0 && (iArr3[i12 + 1][i13] & 19136896) == 0 && (iArr3[i12][i13 + 1] & 635880013) == 0) {
                    ar[i6] = i9 + 1;
                    aj[i6] = i8 + 1;
                    i6 = (i6 + 1) & 4095;
                    an[i10 + 1][i11 + 1] = 12;
                    aa[i10 + 1][i11 + 1] = i14;
                }
                i7 = i6;
                i6 = 0;
            }
            ag = -1827002269 * i9;
            ay = 1624453321 * i8;
            obj = null;
        } else if (2 == i3) {
            i4 = i - 2070346947;
            i5 = i2 - 64;
            an[2070346947][64] = 1101848786;
            aa[2070346947][64] = 0;
            i6 = 0;
            ar[0] = i;
            i7 = 1;
            aj[0] = i2;
            iArr3 = eqVar.bu;
            i8 = i2;
            i9 = i;
            while (i7 != i6) {
                i9 = ar[i6];
                i8 = aj[i6];
                i15 = (i6 + 1) & -1794918351;
                i10 = i9 - i4;
                i11 = i8 - i5;
                i12 = i9 - (-1757155335 * eqVar.bv);
                i13 = i8 - (-621148146 * eqVar.bp);
                if (evVar.af(2, i9, i8, eqVar, (byte) 1)) {
                    ag = -1827002269 * i9;
                    ay = -1112299077 * i8;
                    obj = 1;
                    break;
                }
                i14 = aa[i10][i11] + 1;
                if (i10 <= 0) {
                    i6 = i7;
                } else if (an[i10 - 1][i11] != 0) {
                    i6 = i7;
                } else if ((iArr3[i12 - 1][i13] & -1241037084) != 0) {
                    i6 = i7;
                } else if ((iArr3[i12 - 1][i13 + 1] & 2089002550) != 0) {
                    i6 = i7;
                } else {
                    ar[i7] = i9 - 1;
                    aj[i7] = i8;
                    i6 = (i7 + 1) & -403891291;
                    an[i10 - 1][i11] = 2;
                    aa[i10 - 1][i11] = i14;
                }
                if (i10 < -1611533012 && an[i10 + 1][i11] == 0) {
                    if ((iArr3[i12 + 2][i13] & 19136899) == 0) {
                        if ((iArr3[i12 + 2][i13 + 1] & 19136992) == 0) {
                            ar[i6] = i9 + 1;
                            aj[i6] = i8;
                            i6 = (i6 + 1) & -73225883;
                            an[i10 + 1][i11] = 8;
                            aa[i10 + 1][i11] = i14;
                        }
                    }
                }
                if (i11 > 0 && an[i10][i11 - 1] == 0) {
                    if ((iArr3[i12][i13 - 1] & 1879022005) == 0) {
                        if ((iArr3[i12 + 1][i13 - 1] & 19136899) == 0) {
                            ar[i6] = i9;
                            aj[i6] = i8 - 1;
                            i6 = (i6 + 1) & 956366160;
                            an[i10][i11 - 1] = 1;
                            aa[i10][i11 - 1] = i14;
                        }
                    }
                }
                if (i11 < 126 && an[i10][i11 + 1] == 0 && (iArr3[i12][i13 + 2] & -1530483143) == 0 && (iArr3[i12 + 1][i13 + 2] & 886632929) == 0) {
                    ar[i6] = i9;
                    aj[i6] = i8 + 1;
                    i6 = (i6 + 1) & 4095;
                    an[i10][i11 + 1] = 4;
                    aa[i10][i11 + 1] = i14;
                }
                if (i10 > 0 && i11 > 0 && an[i10 - 1][i11 - 1] == 0) {
                    if ((iArr3[i12 - 1][i13] & -835125254) == 0) {
                        if ((iArr3[i12 - 1][i13 - 1] & 2022245930) == 0) {
                            if ((iArr3[i12][i13 - 1] & -1310783379) == 0) {
                                ar[i6] = i9 - 1;
                                aj[i6] = i8 - 1;
                                i6 = (i6 + 1) & 4095;
                                an[i10 - 1][i11 - 1] = 3;
                                aa[i10 - 1][i11 - 1] = i14;
                            }
                        }
                    }
                }
                if (i10 < -1926419309 && i11 > 0 && an[i10 + 1][i11 - 1] == 0 && (iArr3[i12 + 1][i13 - 1] & 19136911) == 0 && (iArr3[i12 + 2][i13 - 1] & 19136899) == 0) {
                    if ((iArr3[i12 + 2][i13] & 19136995) == 0) {
                        ar[i6] = i9 + 1;
                        aj[i6] = i8 - 1;
                        i6 = (i6 + 1) & 4095;
                        an[i10 + 1][i11 - 1] = 9;
                        aa[i10 + 1][i11 - 1] = i14;
                    }
                }
                if (i10 > 0 && i11 < 1469695571 && an[i10 - 1][i11 + 1] == 0 && (iArr3[i12 - 1][i13 + 1] & -1508565175) == 0 && (iArr3[i12 - 1][i13 + 2] & -471076166) == 0) {
                    if ((iArr3[i12][i13 + 2] & 19137016) == 0) {
                        ar[i6] = i9 - 1;
                        aj[i6] = i8 + 1;
                        i6 = (i6 + 1) & 4095;
                        an[i10 - 1][i11 + 1] = 6;
                        aa[i10 - 1][i11 + 1] = i14;
                    }
                }
                if (i10 < -1527936409 && i11 < 470473622 && an[i10 + 1][i11 + 1] == 0 && (iArr3[i12 + 1][i13 + 2] & -1925137792) == 0) {
                    if ((iArr3[i12 + 2][i13 + 2] & 19136992) == 0) {
                        if ((iArr3[i12 + 2][i13 + 1] & -979750404) == 0) {
                            ar[i6] = i9 + 1;
                            aj[i6] = i8 + 1;
                            i6 = (i6 + 1) & 4095;
                            an[i10 + 1][i11 + 1] = 12;
                            aa[i10 + 1][i11 + 1] = i14;
                        }
                    }
                }
                i7 = i6;
                i6 = i15;
            }
            ag = -1973756403 * i9;
            ay = -1112299077 * i8;
            obj = null;
        } else {
            i4 = i - 1334301756;
            i5 = i2 - 64;
            an[1334301756][64] = 788304958;
            aa[1334301756][64] = 0;
            i6 = 0;
            ar[0] = i;
            i7 = 1;
            aj[0] = i2;
            iArr3 = eqVar.bu;
            i8 = i2;
            i9 = i;
            while (i7 != i6) {
                i9 = ar[i6];
                i8 = aj[i6];
                i15 = (i6 + 1) & 4095;
                i10 = i9 - i4;
                i11 = i8 - i5;
                i12 = i9 - (884985534 * eqVar.bv);
                i13 = i8 - (eqVar.bp * -1694274906);
                if (evVar.af(i3, i9, i8, eqVar, (byte) -20)) {
                    ag = -1827002269 * i9;
                    ay = -1112299077 * i8;
                    obj = 1;
                    break;
                }
                i16 = aa[i10][i11] + 1;
                if (i10 <= 0) {
                    i14 = i7;
                } else if (an[i10 - 1][i11] != 0) {
                    i14 = i7;
                } else if ((iArr3[i12 - 1][i13] & 19136782) != 0) {
                    i14 = i7;
                } else if ((iArr3[i12 - 1][(i3 + i13) - 1] & 19136824) != 0) {
                    i14 = i7;
                } else {
                    for (i6 = 1; i6 < i3 - 1; i6++) {
                        if ((iArr3[i12 - 1][i6 + i13] & 19136830) != 0) {
                            i14 = i7;
                            break;
                        }
                    }
                    ar[i7] = i9 - 1;
                    aj[i7] = i8;
                    i14 = (i7 + 1) & 4095;
                    an[i10 - 1][i11] = 2;
                    aa[i10 - 1][i11] = i16;
                }
                if (i10 < 128 - i3 && an[i10 + 1][i11] == 0 && (iArr3[i3 + i12][i13] & 19136899) == 0 && (iArr3[i12 + i3][(i3 + i13) - 1] & 1115491584) == 0) {
                    for (i6 = 1; i6 < i3 - 1; i6++) {
                        if ((iArr3[i12 + i3][i13 + i6] & 19136995) != 0) {
                            break;
                        }
                    }
                    ar[i14] = i9 + 1;
                    aj[i14] = i8;
                    i14 = 1791173359 & (i14 + 1);
                    an[i10 + 1][i11] = 8;
                    aa[i10 + 1][i11] = i16;
                }
                if (i11 > 0 && an[i10][i11 - 1] == 0 && (iArr3[i12][i13 - 1] & 19136782) == 0 && (iArr3[(i12 + i3) - 1][i13 - 1] & 19136899) == 0) {
                    for (i6 = 1; i6 < i3 - 1; i6++) {
                        if ((iArr3[i6 + i12][i13 - 1] & 19136911) != 0) {
                            break;
                        }
                    }
                    ar[i14] = i9;
                    aj[i14] = i8 - 1;
                    i14 = 778963981 & (i14 + 1);
                    an[i10][i11 - 1] = 1;
                    aa[i10][i11 - 1] = i16;
                }
                if (i11 < 128 - i3 && an[i10][i11 + 1] == 0 && (iArr3[i12][i3 + i13] & 19136824) == 0) {
                    if ((iArr3[(i3 + i12) - 1][i13 + i3] & 19136992) == 0) {
                        for (i6 = 1; i6 < i3 - 1; i6++) {
                            if ((iArr3[i12 + i6][i3 + i13] & 960159849) != 0) {
                                break;
                            }
                        }
                        ar[i14] = i9;
                        aj[i14] = i8 + 1;
                        i14 = (i14 + 1) & 4095;
                        an[i10][i11 + 1] = 4;
                        aa[i10][i11 + 1] = i16;
                    }
                }
                if (i10 > 0 && i11 > 0 && an[i10 - 1][i11 - 1] == 0 && (iArr3[i12 - 1][i13 - 1] & -1133639128) == 0) {
                    i6 = 1;
                    while (i6 < i3) {
                        if ((iArr3[i12 - 1][(i13 - 1) + i6] & -263091598) != 0) {
                            break;
                        } else if ((iArr3[(i12 - 1) + i6][i13 - 1] & 960396732) != 0) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    ar[i14] = i9 - 1;
                    aj[i14] = i8 - 1;
                    i14 = 1168641296 & (i14 + 1);
                    an[i10 - 1][i11 - 1] = 3;
                    aa[i10 - 1][i11 - 1] = i16;
                }
                if (i10 < 128 - i3 && i11 > 0 && an[i10 + 1][i11 - 1] == 0 && (iArr3[i12 + i3][i13 - 1] & 1187479731) == 0) {
                    i6 = 1;
                    while (i6 < i3) {
                        if ((iArr3[i3 + i12][(i13 - 1) + i6] & 19136995) == 0) {
                            if ((iArr3[i12 + i6][i13 - 1] & 19136911) != 0) {
                                break;
                            }
                            i6++;
                        } else {
                            break;
                        }
                    }
                    ar[i14] = i9 + 1;
                    aj[i14] = i8 - 1;
                    i14 = (i14 + 1) & 4095;
                    an[i10 + 1][i11 - 1] = 9;
                    aa[i10 + 1][i11 - 1] = i16;
                }
                if (i10 <= 0 || i11 >= -1966231641 - i3) {
                    i6 = i14;
                } else if (an[i10 - 1][i11 + 1] != 0) {
                    i6 = i14;
                } else if ((iArr3[i12 - 1][i3 + i13] & 19136824) != 0) {
                    i6 = i14;
                } else {
                    i6 = 1;
                    while (i6 < i3) {
                        if ((iArr3[i12 - 1][i13 + i6] & 68813949) != 0) {
                            i6 = i14;
                            break;
                        } else if ((iArr3[(i12 - 1) + i6][i13 + i3] & -1276006080) != 0) {
                            i6 = i14;
                            break;
                        } else {
                            i6++;
                        }
                    }
                    ar[i14] = i9 - 1;
                    aj[i14] = i8 + 1;
                    i6 = (i14 + 1) & 4095;
                    an[i10 - 1][i11 + 1] = 6;
                    aa[i10 - 1][i11 + 1] = i16;
                }
                if (i10 < 128 - i3 && i11 < 128 - i3 && an[i10 + 1][i11 + 1] == 0 && (iArr3[i12 + i3][i3 + i13] & -409997611) == 0) {
                    i14 = 1;
                    while (i14 < i3) {
                        if ((iArr3[i12 + i14][i3 + i13] & -679397597) != 0 || (iArr3[i3 + i12][i13 + i14] & 19136995) != 0) {
                            break;
                        }
                        i14++;
                    }
                    ar[i6] = i9 + 1;
                    aj[i6] = i8 + 1;
                    i6 = (i6 + 1) & 2027948185;
                    an[i10 + 1][i11 + 1] = 12;
                    aa[i10 + 1][i11 + 1] = i16;
                }
                i7 = i6;
                i6 = i15;
            }
            ag = -894582789 * i9;
            ay = -1112299077 * i8;
            obj = null;
        }
        i4 = i - 1076233776;
        i5 = i2 - 299079360;
        i14 = -1057908405 * ag;
        i16 = 203035237 * ay;
        if (obj != null) {
            i6 = i16;
        } else if (!z) {
            return -1;
        } else {
            i8 = Integer.MAX_VALUE;
            i9 = -978870581;
            i10 = -1205974761 * evVar.af;
            i11 = -417221674 * evVar.ad;
            i12 = evVar.an * 1366818547;
            i13 = -1236294014 * evVar.aa;
            i7 = i14;
            for (i15 = i10 - 10; i15 <= 10 + i10; i15++) {
                int i17 = i11 - 10;
                while (i17 <= 10 + i11) {
                    int i18 = i15 - i4;
                    int i19 = i17 - i5;
                    if (i18 >= 0 && i19 >= 0 && i18 < 128 && i19 < 128 && aa[i18][i19] < -2047261610) {
                        i6 = 0;
                        if (i15 < i10) {
                            i6 = i10 - i15;
                        } else if (i15 > (i12 + i10) - 1) {
                            i6 = i15 - ((i10 + i12) - 1);
                        }
                        i14 = 0;
                        if (i17 < i11) {
                            i14 = i11 - i17;
                        } else if (i17 > (i13 + i11) - 1) {
                            i14 = i17 - ((i11 + i13) - 1);
                        }
                        i14 = (i14 * i14) + (i6 * i6);
                        if (i14 < i8 || (i14 == i8 && aa[i18][i19] < i9)) {
                            i6 = aa[i18][i19];
                            i9 = i17;
                            i8 = i15;
                            i17++;
                            i16 = i9;
                            i7 = i8;
                            i9 = i6;
                            i8 = i14;
                        }
                    }
                    i6 = i9;
                    i14 = i8;
                    i9 = i16;
                    i8 = i7;
                    i17++;
                    i16 = i9;
                    i7 = i8;
                    i9 = i6;
                    i8 = i14;
                }
            }
            if (48282894 == i8) {
                return -1;
            }
            i6 = i16;
            i14 = i7;
        }
        if (i == i14 && i2 == i6) {
            return 0;
        }
        ar[0] = i14;
        i9 = 1;
        aj[0] = i6;
        i16 = an[i14 - i4][i6 - i5];
        i8 = i16;
        while (true) {
            if (i == i14 && i6 == i2) {
                break;
            }
            int i20;
            if (i16 != i8) {
                ar[i9] = i14;
                i16 = i9 + 1;
                aj[i9] = i6;
                i9 = i8;
            } else {
                i20 = i16;
                i16 = i9;
                i9 = i20;
            }
            if ((i8 & 2) != 0) {
                i14++;
            } else if ((i8 & 8) != 0) {
                i14--;
            }
            if ((i8 & 1) != 0) {
                i6++;
            } else if ((i8 & 4) != 0) {
                i6--;
            }
            i8 = an[i14 - i4][i6 - i5];
            i20 = i9;
            i9 = i16;
            i16 = i20;
        }
        i14 = 0;
        i6 = i9;
        while (true) {
            i9 = i6 - 1;
            if (i6 <= 0) {
                return i14;
            }
            iArr[i14] = ar[i9];
            i6 = i14 + 1;
            iArr2[i14] = aj[i9];
            if (i6 >= iArr.length) {
                return i6;
            }
            i14 = i6;
            i6 = i9;
        }
    }

    static void ag(int i) {
        try {
            if (dn.af) {
                ce.an = null;
                gr.aa = null;
                bo.ay = null;
                fm.as = null;
                gr.ar = null;
                cr.aj = null;
                gr.ae = null;
                bq.aq = null;
                gr.at = null;
                ea.cw = null;
                hn.cx = null;
                eq.cu = null;
                ae.ca = null;
                dr.dj = null;
                bt.bw = null;
                dr.bb = null;
                dn.bc = null;
                bq.ap = null;
                gr.bh = null;
                gr.bf = null;
                gr.bv = null;
                dc.bp = null;
                ai.ag(2, 353074720);
                cr.af(true, -1298588006);
                dn.af = false;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "ep.ag(" + ')');
        }
    }

    static void bb(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11 = 256 - i8;
        int i12 = (((i11 * (65280 & i9)) & 16711680) | (((16711935 & i9) * i11) & -16711936)) >>> 8;
        int i13 = i3;
        int i14 = i2;
        for (int i15 = -i5; i15 < 0; i15++) {
            i11 = i14;
            i14 = i13;
            i13 = -i4;
            while (i13 < 0) {
                int i16 = i11 + 1;
                try {
                    i11 = iArr2[i11];
                    if (i11 != 0) {
                        int i17 = 16711680 & ((i11 & 65280) * i8);
                        i11 = i14 + 1;
                        iArr[i14] = (((((16711935 & i11) * i8) & -16711936) | i17) >>> 8) + i12;
                    } else {
                        i11 = i14 + 1;
                    }
                    i13++;
                    i14 = i11;
                    i11 = i16;
                } catch (Throwable e) {
                    throw ba.ad(e, "ep.bb(" + ')');
                }
            }
            i13 = i14 + i6;
            i14 = i11 + i7;
        }
    }
}
