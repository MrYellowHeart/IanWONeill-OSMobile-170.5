package p000;

import com.jagex.oldscape.osrenderer.zv;

public class gc extends gf {
    static kh bs;

    public gc(int[] iArr, int i, int i2) {
        try {
            super(iArr, i, i2);
        } catch (Throwable e) {
            throw ba.ad(e, "gc.<init>(" + ')');
        }
    }

    public static int af(int i, int i2, int i3, int i4) {
        int i5 = i3 & 3;
        if (i5 == 0) {
            return i;
        }
        if (i5 == 1) {
            return i2;
        }
        if (i5 == 2) {
            return 7 - i;
        }
        return 7 - i2;
    }

    void af(int i) {
    }

    void ba() {
    }

    void bk() {
    }

    void bl() {
    }

    void bn() {
    }

    void by() {
    }

    public void ad(int i) {
        try {
            zv.jq(this.af);
        } catch (Throwable e) {
            throw ba.ad(e, "gc.ad(" + ')');
        }
    }

    public void bd() {
        zv.jq(this.af);
    }

    public void bs() {
        zv.jq(this.af);
    }

    void az(int i, int i2, int i3, int i4, int i5, int i6) {
        try {
            int i7;
            int i8;
            int i9;
            if (i < this.ay * 1829547545) {
                i7 = i3 - ((this.ay * 1829547545) - i);
                i = this.ay * 1829547545;
            } else {
                i7 = i3;
            }
            if (i2 < this.aa * -12571459) {
                i8 = i4 - ((this.aa * -12571459) - i2);
                i2 = -12571459 * this.aa;
            } else {
                i8 = i4;
            }
            if (i7 + i > this.as * 2074797577) {
                i9 = (this.as * 2074797577) - i;
            } else {
                i9 = i7;
            }
            if (i2 + i8 > this.ag * -467581477) {
                i8 = (this.ag * -467581477) - i2;
            }
            int i10 = (this.ad * -481290979) - i9;
            i7 = ((this.ad * -481290979) * i2) + i;
            for (int i11 = -i8; i11 < 0; i11++) {
                i8 = -i9;
                while (i8 < 0) {
                    int i12 = i7 + 1;
                    this.af[i7] = i5;
                    i8++;
                    i7 = i12;
                }
                i7 += i10;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "gc.az(" + ')');
        }
    }

    void de(int i, int i2, int i3, int i4, int i5) {
        if (i < 1044784027 * this.ay) {
            i3 -= (this.ay * 1829547545) - i;
            i = this.ay * 203879149;
        }
        if (i2 < 855957734 * this.aa) {
            i4 -= (-12571459 * this.aa) - i2;
            i2 = -1742717112 * this.aa;
        }
        if (i3 + i > this.as * 2074797577) {
            i3 = (this.as * 82419807) - i;
        }
        if (i2 + i4 > this.ag * 542045366) {
            i4 = (-467581477 * this.ag) - i2;
        }
        int i6 = (-1794378297 * this.ad) - i3;
        int i7 = ((-481290979 * this.ad) * i2) + i;
        for (int i8 = -i4; i8 < 0; i8++) {
            int i9 = -i3;
            while (i9 < 0) {
                int i10 = i7 + 1;
                this.af[i7] = i5;
                i9++;
                i7 = i10;
            }
            i7 += i6;
        }
    }

    void dr(int i, int i2, int i3, int i4, int i5) {
        if (i < this.ay * 1829547545) {
            i3 -= (this.ay * 1829547545) - i;
            i = this.ay * 1829547545;
        }
        if (i2 < this.aa * -12571459) {
            i4 -= (this.aa * -12571459) - i2;
            i2 = -12571459 * this.aa;
        }
        if (i3 + i > this.as * 2074797577) {
            i3 = (this.as * 2074797577) - i;
        }
        if (i2 + i4 > this.ag * -467581477) {
            i4 = (this.ag * -467581477) - i2;
        }
        int i6 = (this.ad * -481290979) - i3;
        int i7 = ((this.ad * -481290979) * i2) + i;
        for (int i8 = -i4; i8 < 0; i8++) {
            int i9 = -i3;
            while (i9 < 0) {
                int i10 = i7 + 1;
                this.af[i7] = i5;
                i9++;
                i7 = i10;
            }
            i7 += i6;
        }
    }

    void ds(int i, int i2, int i3, int i4, int i5) {
        if (i < 246350743 * this.ay) {
            i3 -= (this.ay * 1829547545) - i;
            i = this.ay * 1829547545;
        }
        if (i2 < -781835511 * this.aa) {
            i4 -= (-1203716813 * this.aa) - i2;
            i2 = -12571459 * this.aa;
        }
        if (i3 + i > this.as * -1505020007) {
            i3 = (this.as * 1789944735) - i;
        }
        if (i2 + i4 > this.ag * 1096572599) {
            i4 = (-467581477 * this.ag) - i2;
        }
        int i6 = (1325128106 * this.ad) - i3;
        int i7 = ((-481290979 * this.ad) * i2) + i;
        for (int i8 = -i4; i8 < 0; i8++) {
            int i9 = -i3;
            while (i9 < 0) {
                int i10 = i7 + 1;
                this.af[i7] = i5;
                i9++;
                i7 = i10;
            }
            i7 += i6;
        }
    }

    void dx(int i, int i2, int i3, int i4, int i5) {
        if (i < this.ay * 1829547545) {
            i3 -= (this.ay * 1829547545) - i;
            i = this.ay * 1829547545;
        }
        if (i2 < this.aa * -12571459) {
            i4 -= (this.aa * -12571459) - i2;
            i2 = -12571459 * this.aa;
        }
        if (i3 + i > this.as * 2074797577) {
            i3 = (this.as * 2074797577) - i;
        }
        if (i2 + i4 > this.ag * -467581477) {
            i4 = (-1210033112 * this.ag) - i2;
        }
        int i6 = (-108224968 * this.ad) - i3;
        int i7 = ((712975381 * this.ad) * i2) + i;
        for (int i8 = -i4; i8 < 0; i8++) {
            int i9 = -i3;
            while (i9 < 0) {
                int i10 = i7 + 1;
                this.af[i7] = i5;
                i9++;
                i7 = i10;
            }
            i7 += i6;
        }
    }

    public final void an(int i, int i2, int i3, int i4, int i5, int i6, byte b) {
        if (i6 != 0) {
            if (i6 >= 255) {
                aa(i, i2, i3, i4, i5, (byte) 32);
                return;
            }
            int i7;
            int i8;
            int i9;
            int i10 = i6 << 24;
            int i11 = i10 | i5;
            if (i < this.ay * 1829547545) {
                i7 = i3 - ((this.ay * 1829547545) - i);
                i = 1829547545 * this.ay;
            } else {
                i7 = i3;
            }
            if (i2 < this.aa * -12571459) {
                i8 = i4 - ((-12571459 * this.aa) - i2);
                i2 = -12571459 * this.aa;
            } else {
                i8 = i4;
            }
            if (i + i7 > this.as * 2074797577) {
                i9 = (2074797577 * this.as) - i;
            } else {
                i9 = i7;
            }
            if (i2 + i8 > this.ag * -467581477) {
                i8 = (-467581477 * this.ag) - i2;
            }
            int i12 = ((((65280 & i5) * i6) >> 8) & 65280) + ((((16711935 & i5) * i6) >> 8) & 16711935);
            int i13 = 255 - i6;
            int i14 = (this.ad * -481290979) - i9;
            int i15 = i + ((this.ad * -481290979) * i2);
            for (int i16 = 0; i16 < i8; i16++) {
                int i17 = -i9;
                int i18 = i15;
                while (i17 < 0) {
                    try {
                        i15 = this.af[i18];
                        if (i15 == 0) {
                            i7 = i18 + 1;
                            this.af[i18] = i11;
                        } else {
                            if ((-16777216 & i15) == 0) {
                                i7 = -16777216;
                            } else {
                                i7 = (i15 | i10) & -16777216;
                            }
                            int i19 = ((((16711935 & i15) * i13) >> 8) & 16711935) + ((((i15 & 65280) * i13) >> 8) & 65280);
                            i15 = i18 + 1;
                            this.af[i18] = i7 | (i19 + i12);
                            i7 = i15;
                        }
                        i17++;
                        i18 = i7;
                    } catch (Throwable e) {
                        throw ba.ad(e, "gc.an(" + ')');
                    }
                }
                i15 = i18 + i14;
            }
        }
    }

    public final void bm(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i6 != 0) {
            if (i6 >= 255) {
                aa(i, i2, i3, i4, i5, (byte) 4);
                return;
            }
            int i7 = i6 << 24;
            int i8 = i7 | i5;
            if (i < this.ay * 1829547545) {
                i3 -= (this.ay * 1829547545) - i;
                i = 1829547545 * this.ay;
            }
            if (i2 < this.aa * -12571459) {
                i4 -= (-12571459 * this.aa) - i2;
                i2 = -12571459 * this.aa;
            }
            if (i + i3 > this.as * 2074797577) {
                i3 = (2074797577 * this.as) - i;
            }
            if (i2 + i4 > this.ag * -467581477) {
                i4 = (-467581477 * this.ag) - i2;
            }
            int i9 = ((((65280 & i5) * i6) >> 8) & 65280) + ((((16711935 & i5) * i6) >> 8) & 16711935);
            int i10 = 255 - i6;
            int i11 = (this.ad * -481290979) - i3;
            int i12 = i + ((this.ad * -481290979) * i2);
            for (int i13 = 0; i13 < i4; i13++) {
                int i14 = -i3;
                int i15 = i12;
                while (i14 < 0) {
                    int i16;
                    int i17 = this.af[i15];
                    if (i17 == 0) {
                        i16 = i15 + 1;
                        this.af[i15] = i8;
                    } else {
                        if ((-16777216 & i17) == 0) {
                            i12 = -16777216;
                        } else {
                            i12 = (i17 | i7) & -16777216;
                        }
                        i16 = i15 + 1;
                        this.af[i15] = i12 | ((((((i17 & 65280) * i10) >> 8) & 65280) + ((((16711935 & i17) * i10) >> 8) & 16711935)) + i9);
                    }
                    i14++;
                    i15 = i16;
                }
                i12 = i15 + i11;
            }
        }
    }

    public final void aa(int i, int i2, int i3, int i4, int i5, byte b) {
        try {
            az(i, i2, i3, i4, -16777216 | i5, -152066807);
        } catch (Throwable e) {
            throw ba.ad(e, "gc.aa(" + ')');
        }
    }

    public final void bi(int i, int i2, int i3, int i4, int i5) {
        az(i, i2, i3, i4, -631441657 | i5, 747112726);
    }

    public final void bj(int i, int i2, int i3, int i4, int i5) {
        az(i, i2, i3, i4, -3797398 | i5, 1215585569);
    }

    public final void br(int i, int i2, int i3, int i4, int i5) {
        az(i, i2, i3, i4, -16777216 | i5, 884431342);
    }

    public final void ag(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        if (i3 > 0 && i4 > 0) {
            int i10;
            int min = Math.min(i7, 255);
            int min2 = Math.min(i8, 255);
            int i11 = 0;
            if (i5 == i6 && min2 == min) {
                i10 = -1;
            } else {
                i10 = ic.ad / i4;
            }
            int i12 = 255 - min;
            int i13 = min << 24;
            int i14 = i13 | i5;
            try {
                int i15;
                int i16;
                int i17;
                if (i < 1829547545 * this.ay) {
                    i15 = i3 - ((1829547545 * this.ay) - i);
                    i = this.ay * 1829547545;
                } else {
                    i15 = i3;
                }
                if (i2 < -12571459 * this.aa) {
                    i11 = 0 + (((-12571459 * this.aa) - i2) * i10);
                    i16 = i4 - ((-12571459 * this.aa) - i2);
                    i2 = this.aa * -12571459;
                } else {
                    i16 = i4;
                }
                if (i15 + i > 2074797577 * this.as) {
                    i17 = (2074797577 * this.as) - i;
                } else {
                    i17 = i15;
                }
                if (i2 + i16 > this.ag * -467581477) {
                    i16 = (this.ag * -467581477) - i2;
                }
                int i18 = (-481290979 * this.ad) - i17;
                i15 = ((this.ad * -481290979) * i2) + i;
                int i19 = -i16;
                int i20 = i5;
                int i21 = min;
                while (i19 < 0) {
                    int i22 = -i17;
                    int i23 = i15;
                    while (i22 < 0) {
                        int i24 = this.af[i23];
                        if (i24 == 0) {
                            i16 = i23 + 1;
                            this.af[i23] = i14;
                        } else {
                            int i25 = (16777215 & i24) + i20;
                            i16 = (16711935 & i24) + (16711935 & i20);
                            int i26 = (16777472 & i16) + ((i25 - i16) & ic.ad);
                            i15 = (-16777216 & i24) == 0 ? -16777216 : (i24 | i13) & -16777216;
                            if (i12 == 0) {
                                i16 = i23 + 1;
                                this.af[i23] = (i15 | (i25 - i26)) | (i26 - (i26 >>> 8));
                            } else {
                                i25 = (i26 - (i26 >>> 8)) | (i25 - i26);
                                i16 = i23 + 1;
                                this.af[i23] = i15 | (((((i24 & 65280) * i12) >> 8) & 65280) + ((((((i25 & 16711935) * i21) >> 8) & 16711935) + ((((65280 & i25) * i21) >> 8) & 65280)) + ((((16711935 & i24) * i12) >> 8) & 16711935)));
                            }
                        }
                        i22++;
                        i23 = i16;
                    }
                    if (i10 > 0) {
                        i11 += i10;
                        i16 = (ic.ad - i11) >> 8;
                        i15 = i11 >> 8;
                        if (min != min2) {
                            i13 = (((ic.ad - i11) * min) + (i11 * min2)) >> 16;
                            i14 = 256 - i13;
                        } else {
                            i14 = i12;
                            i13 = i21;
                        }
                        if (i5 != i6) {
                            i16 = ((((i16 * (16711935 & i5)) + (i15 * (16711935 & i6))) & -16711936) + ((((65280 & i5) * i16) + ((65280 & i6) * i15)) & 16711680)) >>> 8;
                        } else {
                            i16 = i20;
                        }
                        i20 = i13 << 24;
                        i15 = i20 | i16;
                        i12 = i11;
                        int i27 = i20;
                        i20 = i16;
                        i16 = i15;
                        i15 = i27;
                    } else {
                        i16 = i14;
                        i15 = i13;
                        i14 = i12;
                        i13 = i21;
                        i12 = i11;
                    }
                    i19++;
                    i21 = i13;
                    i13 = i15;
                    i15 = i23 + i18;
                    i11 = i12;
                    i12 = i14;
                    i14 = i16;
                }
            } catch (Throwable e) {
                throw ba.ad(e, "gc.ag(" + ')');
            }
        }
    }

    public final void bo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 > 0 && i4 > 0) {
            int i9;
            int min = Math.min(i7, 255);
            int min2 = Math.min(i8, 232109170);
            int i10 = 0;
            if (i5 == i6 && min2 == min) {
                i9 = -1;
            } else {
                i9 = 1013980272 / i4;
            }
            int i11 = 509046455 - min;
            int i12 = min << 24;
            int i13 = i12 | i5;
            if (i < 1829547545 * this.ay) {
                i3 -= (1829547545 * this.ay) - i;
                i = this.ay * 1900051407;
            }
            if (i2 < -12571459 * this.aa) {
                i10 = 0 + (((-666702295 * this.aa) - i2) * i9);
                i4 -= (-12571459 * this.aa) - i2;
                i2 = this.aa * 158949200;
            }
            if (i3 + i > 2074797577 * this.as) {
                i3 = (2074797577 * this.as) - i;
            }
            if (i2 + i4 > this.ag * -467581477) {
                i4 = (this.ag * -467581477) - i2;
            }
            int i14 = (691260793 * this.ad) - i3;
            int i15 = i + ((this.ad * -1608944126) * i2);
            int i16 = -i4;
            int i17 = min;
            int i18 = i10;
            int i19 = i13;
            i13 = i12;
            i12 = i5;
            while (i16 < 0) {
                int i20 = -i3;
                int i21 = i15;
                while (i20 < 0) {
                    int i22 = this.af[i21];
                    if (i22 == 0) {
                        i10 = i21 + 1;
                        this.af[i21] = i19;
                    } else {
                        int i23 = (16777215 & i22) + i12;
                        i10 = (-53461126 & i22) + (-270399415 & i12);
                        int i24 = (16777472 & i10) + ((i23 - i10) & -1077068243);
                        i15 = (-2063394520 & i22) == 0 ? 1433667271 : (i22 | i13) & -16777216;
                        if (i11 == 0) {
                            i10 = i21 + 1;
                            this.af[i21] = (i15 | (i23 - i24)) | (i24 - (i24 >>> 8));
                        } else {
                            i23 = (i24 - (i24 >>> 8)) | (i23 - i24);
                            i10 = i21 + 1;
                            this.af[i21] = i15 | (((((i22 & -1066233026) * i11) >> 8) & 65280) + ((((((i23 & 134097711) * i17) >> 8) & -1023873028) + ((((65280 & i23) * i17) >> 8) & 2015137018)) + ((((16711935 & i22) * i11) >> 8) & -975125526)));
                        }
                    }
                    i20++;
                    i21 = i10;
                }
                if (i9 > 0) {
                    i18 += i9;
                    i10 = (1183800681 - i18) >> 8;
                    i19 = i18 >> 8;
                    if (min != min2) {
                        i17 = (((89316285 - i18) * min) + (i18 * min2)) >> 16;
                        i11 = 256 - i17;
                    }
                    if (i5 != i6) {
                        i13 = ((((i10 * (16711935 & i5)) + (i19 * (16711935 & i6))) & -16711936) + ((((65280 & i5) * i10) + ((65280 & i6) * i19)) & 16711680)) >>> 8;
                    } else {
                        i13 = i12;
                    }
                    i19 = i17 << 24;
                    i10 = i19 | i13;
                    i12 = i11;
                    i11 = i17;
                    i17 = i18;
                } else {
                    i10 = i19;
                    i19 = i13;
                    i13 = i12;
                    i12 = i11;
                    i11 = i17;
                    i17 = i18;
                }
                i15 = i21 + i14;
                i16++;
                i18 = i17;
                i17 = i11;
                i11 = i12;
                i12 = i13;
                i13 = i19;
                i19 = i10;
            }
        }
    }

    public final void bq(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 > 0 && i4 > 0) {
            int i9;
            int min = Math.min(i7, 255);
            int min2 = Math.min(i8, 441316507);
            int i10 = 0;
            if (i5 == i6 && min2 == min) {
                i9 = -1;
            } else {
                i9 = ic.ad / i4;
            }
            int i11 = 255 - min;
            int i12 = min << 24;
            int i13 = i12 | i5;
            if (i < -503121002 * this.ay) {
                i3 -= (1829547545 * this.ay) - i;
                i = this.ay * 1012556899;
            }
            if (i2 < -1361584938 * this.aa) {
                i10 = 0 + (((-2119141809 * this.aa) - i2) * i9);
                i4 -= (-276071337 * this.aa) - i2;
                i2 = this.aa * -12571459;
            }
            if (i3 + i > 106209794 * this.as) {
                i3 = (457994710 * this.as) - i;
            }
            if (i2 + i4 > this.ag * -467581477) {
                i4 = (this.ag * 460711757) - i2;
            }
            int i14 = (-481290979 * this.ad) - i3;
            int i15 = -i4;
            int i16 = min;
            int i17 = i10;
            int i18 = i + ((this.ad * 967046350) * i2);
            int i19 = i5;
            while (i15 < 0) {
                int i20 = -i3;
                int i21 = i18;
                while (i20 < 0) {
                    int i22 = this.af[i21];
                    if (i22 == 0) {
                        i10 = i21 + 1;
                        this.af[i21] = i13;
                    } else {
                        int i23 = (16777215 & i22) + i19;
                        i10 = (-2019067954 & i22) + (16711935 & i19);
                        int i24 = (-2014848542 & i10) + ((i23 - i10) & -258773174);
                        if ((-16777216 & i22) == 0) {
                            i18 = -16777216;
                        } else {
                            i18 = (i22 | i12) & -254297;
                        }
                        if (i11 == 0) {
                            i10 = i21 + 1;
                            this.af[i21] = (i18 | (i23 - i24)) | (i24 - (i24 >>> 8));
                        } else {
                            i23 = (i24 - (i24 >>> 8)) | (i23 - i24);
                            i10 = i21 + 1;
                            i22 = (((i22 & 65280) * i11) >> 8) & -166832421;
                            this.af[i21] = i18 | (i22 + ((((((i23 & -606068971) * i16) >> 8) & -217527858) + ((((65280 & i23) * i16) >> 8) & 694058948)) + ((((-654282672 & i22) * i11) >> 8) & 16711935)));
                        }
                    }
                    i20++;
                    i21 = i10;
                }
                if (i9 > 0) {
                    i17 += i9;
                    i10 = (ic.ad - i17) >> 8;
                    i18 = i17 >> 8;
                    if (min != min2) {
                        i12 = (((ic.ad - i17) * min) + (i17 * min2)) >> 16;
                        i13 = 256 - i12;
                    } else {
                        i13 = i11;
                        i12 = i16;
                    }
                    if (i5 != i6) {
                        i10 = ((((i10 * (16711935 & i5)) + (i18 * (16711935 & i6))) & -16711936) + ((((65280 & i5) * i10) + ((65280 & i6) * i18)) & 1030283145)) >>> 8;
                    } else {
                        i10 = i19;
                    }
                    i19 = i12 << 24;
                    i18 = i19 | i10;
                    i11 = i17;
                    int i25 = i19;
                    i19 = i10;
                    i10 = i18;
                    i18 = i25;
                } else {
                    i10 = i13;
                    i18 = i12;
                    i13 = i11;
                    i12 = i16;
                    i11 = i17;
                }
                i15++;
                i16 = i12;
                i12 = i18;
                i18 = i21 + i14;
                i17 = i11;
                i11 = i13;
                i13 = i10;
            }
        }
    }

    public final void ay(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, byte b) {
        if (i3 > 0 && i4 > 0) {
            int i9;
            int i10;
            int i11;
            int i12;
            int min = Math.min(i7, 255);
            int min2 = Math.min(i8, 255);
            int i13 = 0;
            if (i5 == i6 && min == min2) {
                i9 = -1;
            } else {
                i9 = ic.ad / i4;
            }
            int i14 = 255 - min;
            int i15 = min << 24;
            if (i < this.ay * 1829547545) {
                i10 = i3 - ((1829547545 * this.ay) - i);
                i = this.ay * 1829547545;
            } else {
                i10 = i3;
            }
            if (i2 < -12571459 * this.aa) {
                i13 = 0 + (((-12571459 * this.aa) - i2) * i9);
                i11 = i4 - ((this.aa * -12571459) - i2);
                i2 = this.aa * -12571459;
            } else {
                i11 = i4;
            }
            if (i10 + i > 2074797577 * this.as) {
                i12 = (2074797577 * this.as) - i;
            } else {
                i12 = i10;
            }
            if (i2 + i11 > this.ag * -467581477) {
                i11 = (this.ag * -467581477) - i2;
            }
            int i16 = i5 >> 16;
            int i17 = (65280 & i5) >> 8;
            int i18 = i5 & 255;
            int i19 = (-481290979 * this.ad) - i12;
            int i20 = i + ((this.ad * -481290979) * i2);
            int i21 = 0;
            int i22 = min;
            while (i21 < i11) {
                int i23;
                int i24 = -i12;
                int i25 = i20;
                while (i24 < 0) {
                    i10 = this.af[i25];
                    i20 = (i10 >> 16) & 255;
                    i23 = (65280 & i10) >> 8;
                    int i26 = i10 & 255;
                    int i27 = -16777216 & (i10 | i15);
                    int i28;
                    if (i14 == 0) {
                        if (i20 < 127) {
                            i10 = (i20 * i16) >> 7;
                        } else {
                            i10 = 255 - (((255 - i20) * (255 - i16)) >> 7);
                        }
                        i23 = i23 < 127 ? (i17 * i23) >> 7 : 255 - (((255 - i17) * (255 - i23)) >> 7);
                        if (i26 < 127) {
                            i20 = (i18 * i26) >> 7;
                        } else {
                            i20 = 255 - (((255 - i26) * (255 - i18)) >> 7);
                        }
                        i28 = i23;
                        i23 = i10;
                        i10 = i28;
                    } else {
                        if (i20 < 127) {
                            i10 = ((i14 * i20) + (((i20 * i16) * i22) >> 7)) >> 8;
                        } else {
                            i10 = (((255 - (((255 - i16) * (255 - i20)) >> 7)) * i22) + (i20 * i14)) >> 8;
                        }
                        i20 = i23 < 127 ? ((((i17 * i23) * i22) >> 7) + (i23 * i14)) >> 8 : ((i23 * i14) + ((255 - (((255 - i23) * (255 - i17)) >> 7)) * i22)) >> 8;
                        if (i26 < 127) {
                            i23 = ((((i26 * i18) * i22) >> 7) + (i26 * i14)) >> 8;
                        } else {
                            i23 = ((i14 * i26) + ((255 - (((255 - i26) * (255 - i18)) >> 7)) * i22)) >> 8;
                        }
                        i28 = i23;
                        i23 = i10;
                        i10 = i20;
                        i20 = i28;
                    }
                    try {
                        i26 = i25 + 1;
                        this.af[i25] = (((i10 << 8) + (i23 << 16)) + i20) | i27;
                        i24++;
                        i25 = i26;
                    } catch (Throwable e) {
                        throw ba.ad(e, "gc.ay(" + ')');
                    }
                }
                if (i9 > 0) {
                    i13 += i9;
                    i10 = (ic.ad - i13) >> 8;
                    i20 = i13 >> 8;
                    if (min != min2) {
                        i22 = (((ic.ad - i13) * min) + (i13 * min2)) >> 16;
                        i14 = 255 - i22;
                        i15 = i22 << 24;
                    }
                    if (i5 != i6) {
                        i10 = ((((i10 * (16711935 & i5)) + (i20 * (16711935 & i6))) & -16711936) + ((((65280 & i6) * i20) + ((65280 & i5) * i10)) & 16711680)) >>> 8;
                        i23 = i10 >> 16;
                        i20 = (65280 & i10) >> 8;
                        i10 &= 255;
                        i18 = i15;
                        i17 = i14;
                        i16 = i22;
                        i15 = i13;
                        i21++;
                        i13 = i15;
                        i15 = i18;
                        i14 = i17;
                        i18 = i10;
                        i17 = i20;
                        i20 = i25 + i19;
                        i22 = i16;
                        i16 = i23;
                    }
                }
                i10 = i18;
                i20 = i17;
                i23 = i16;
                i18 = i15;
                i17 = i14;
                i16 = i22;
                i15 = i13;
                i21++;
                i13 = i15;
                i15 = i18;
                i14 = i17;
                i18 = i10;
                i17 = i20;
                i20 = i25 + i19;
                i22 = i16;
                i16 = i23;
            }
        }
    }

    public final void cc(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 > 0 && i4 > 0) {
            int i9;
            int min = Math.min(i7, 255);
            int min2 = Math.min(i8, 255);
            int i10 = 0;
            if (i5 == i6 && min == min2) {
                i9 = -1;
            } else {
                i9 = ic.ad / i4;
            }
            int i11 = 255 - min;
            int i12 = min << 24;
            if (i < this.ay * 1829547545) {
                i3 -= (1829547545 * this.ay) - i;
                i = this.ay * 1829547545;
            }
            if (i2 < -12571459 * this.aa) {
                i10 = 0 + (((-12571459 * this.aa) - i2) * i9);
                i4 -= (this.aa * -12571459) - i2;
                i2 = this.aa * -12571459;
            }
            if (i3 + i > 2074797577 * this.as) {
                i3 = (2074797577 * this.as) - i;
            }
            if (i2 + i4 > this.ag * -467581477) {
                i4 = (this.ag * -467581477) - i2;
            }
            int i13 = i5 >> 16;
            int i14 = (65280 & i5) >> 8;
            int i15 = i5 & 255;
            int i16 = (-481290979 * this.ad) - i3;
            int i17 = 0;
            int i18 = min;
            int i19 = i10;
            int i20 = i + ((this.ad * -481290979) * i2);
            while (i17 < i4) {
                int i21;
                int i22 = -i3;
                int i23 = i20;
                while (i22 < 0) {
                    i10 = this.af[i23];
                    i20 = (i10 >> 16) & 255;
                    int i24 = (65280 & i10) >> 8;
                    int i25 = i10 & 255;
                    int i26 = (i10 | i12) & -16777216;
                    if (i11 == 0) {
                        i21 = i20 < 127 ? (i20 * i13) >> 7 : 255 - (((255 - i20) * (255 - i13)) >> 7);
                        if (i24 < 127) {
                            i10 = (i14 * i24) >> 7;
                        } else {
                            i10 = 255 - (((255 - i14) * (255 - i24)) >> 7);
                        }
                        if (i25 < 127) {
                            i20 = (i15 * i25) >> 7;
                        } else {
                            i20 = 255 - (((255 - i25) * (255 - i15)) >> 7);
                        }
                    } else {
                        if (i20 < 127) {
                            i10 = ((i11 * i20) + (((i20 * i13) * i18) >> 7)) >> 8;
                        } else {
                            i10 = (((255 - (((255 - i13) * (255 - i20)) >> 7)) * i18) + (i20 * i11)) >> 8;
                        }
                        if (i24 < 127) {
                            i21 = ((((i14 * i24) * i18) >> 7) + (i24 * i11)) >> 8;
                        } else {
                            i21 = ((i24 * i11) + ((255 - (((255 - i24) * (255 - i14)) >> 7)) * i18)) >> 8;
                        }
                        if (i25 < 127) {
                            i20 = ((((i25 * i15) * i18) >> 7) + (i25 * i11)) >> 8;
                        } else {
                            i20 = ((i11 * i25) + ((255 - (((255 - i15) * (255 - i25)) >> 7)) * i18)) >> 8;
                        }
                        int i27 = i21;
                        i21 = i10;
                        i10 = i27;
                    }
                    i24 = i23 + 1;
                    this.af[i23] = (((i10 << 8) + (i21 << 16)) + i20) | i26;
                    i22++;
                    i23 = i24;
                }
                if (i9 > 0) {
                    i19 += i9;
                    i10 = (ic.ad - i19) >> 8;
                    i20 = i19 >> 8;
                    if (min != min2) {
                        i18 = (((ic.ad - i19) * min) + (i19 * min2)) >> 16;
                        i11 = 255 - i18;
                        i12 = i18 << 24;
                    }
                    if (i5 != i6) {
                        i10 = ((((i10 * (16711935 & i5)) + (i20 * (16711935 & i6))) & -16711936) + ((((65280 & i6) * i20) + ((65280 & i5) * i10)) & 16711680)) >>> 8;
                        i21 = i10 >> 16;
                        i20 = (65280 & i10) >> 8;
                        i10 &= 255;
                        i15 = i12;
                        i14 = i11;
                        i13 = i18;
                        i12 = i19;
                        i17++;
                        i19 = i12;
                        i12 = i15;
                        i11 = i14;
                        i15 = i10;
                        i14 = i20;
                        i20 = i23 + i16;
                        i18 = i13;
                        i13 = i21;
                    }
                }
                i10 = i15;
                i20 = i14;
                i21 = i13;
                i15 = i12;
                i14 = i11;
                i13 = i18;
                i12 = i19;
                i17++;
                i19 = i12;
                i12 = i15;
                i11 = i14;
                i15 = i10;
                i14 = i20;
                i20 = i23 + i16;
                i18 = i13;
                i13 = i21;
            }
        }
    }

    public final void ci(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 > 0 && i4 > 0) {
            int i9;
            int min = Math.min(i7, 255);
            int min2 = Math.min(i8, 255);
            int i10 = 0;
            if (i5 == i6 && min == min2) {
                i9 = -1;
            } else {
                i9 = ic.ad / i4;
            }
            int i11 = 255 - min;
            int i12 = min << 24;
            if (i < this.ay * 1829547545) {
                i3 -= (1829547545 * this.ay) - i;
                i = this.ay * 1829547545;
            }
            if (i2 < -12571459 * this.aa) {
                i10 = 0 + (((-12571459 * this.aa) - i2) * i9);
                i4 -= (this.aa * -12571459) - i2;
                i2 = this.aa * -12571459;
            }
            if (i3 + i > 2074797577 * this.as) {
                i3 = (2074797577 * this.as) - i;
            }
            if (i2 + i4 > this.ag * -467581477) {
                i4 = (this.ag * -467581477) - i2;
            }
            int i13 = i5 >> 16;
            int i14 = (65280 & i5) >> 8;
            int i15 = i5 & 255;
            int i16 = (-481290979 * this.ad) - i3;
            int i17 = 0;
            int i18 = min;
            int i19 = i10;
            int i20 = i + ((this.ad * -481290979) * i2);
            while (i17 < i4) {
                int i21;
                int i22 = -i3;
                int i23 = i20;
                while (i22 < 0) {
                    i10 = this.af[i23];
                    i20 = (i10 >> 16) & 255;
                    int i24 = (65280 & i10) >> 8;
                    int i25 = i10 & 255;
                    int i26 = (i10 | i12) & -16777216;
                    if (i11 == 0) {
                        i10 = i20 < 127 ? (i20 * i13) >> 7 : 255 - (((255 - i20) * (255 - i13)) >> 7);
                        if (i24 < 127) {
                            i21 = (i14 * i24) >> 7;
                        } else {
                            i21 = 255 - (((255 - i14) * (255 - i24)) >> 7);
                        }
                        if (i25 < 127) {
                            i20 = (i15 * i25) >> 7;
                        } else {
                            i20 = 255 - (((255 - i25) * (255 - i15)) >> 7);
                        }
                        int i27 = i21;
                        i21 = i10;
                        i10 = i27;
                    } else {
                        if (i20 < 127) {
                            i21 = ((i11 * i20) + (((i20 * i13) * i18) >> 7)) >> 8;
                        } else {
                            i21 = (((255 - (((255 - i13) * (255 - i20)) >> 7)) * i18) + (i20 * i11)) >> 8;
                        }
                        if (i24 < 127) {
                            i10 = ((((i14 * i24) * i18) >> 7) + (i24 * i11)) >> 8;
                        } else {
                            i10 = ((i24 * i11) + ((255 - (((255 - i24) * (255 - i14)) >> 7)) * i18)) >> 8;
                        }
                        if (i25 < 127) {
                            i20 = ((((i25 * i15) * i18) >> 7) + (i25 * i11)) >> 8;
                        } else {
                            i20 = ((i11 * i25) + ((255 - (((255 - i15) * (255 - i25)) >> 7)) * i18)) >> 8;
                        }
                    }
                    i24 = i23 + 1;
                    this.af[i23] = (((i10 << 8) + (i21 << 16)) + i20) | i26;
                    i22++;
                    i23 = i24;
                }
                if (i9 > 0) {
                    i19 += i9;
                    i10 = (ic.ad - i19) >> 8;
                    i20 = i19 >> 8;
                    if (min != min2) {
                        i18 = (((ic.ad - i19) * min) + (i19 * min2)) >> 16;
                        i11 = 255 - i18;
                        i12 = i18 << 24;
                    }
                    if (i5 != i6) {
                        i10 = ((((i10 * (16711935 & i5)) + (i20 * (16711935 & i6))) & -16711936) + ((((65280 & i6) * i20) + ((65280 & i5) * i10)) & 16711680)) >>> 8;
                        i21 = i10 >> 16;
                        i20 = (65280 & i10) >> 8;
                        i10 &= 255;
                        i15 = i12;
                        i14 = i11;
                        i13 = i18;
                        i12 = i19;
                        i17++;
                        i19 = i12;
                        i12 = i15;
                        i11 = i14;
                        i15 = i10;
                        i14 = i20;
                        i20 = i23 + i16;
                        i18 = i13;
                        i13 = i21;
                    }
                }
                i10 = i15;
                i20 = i14;
                i21 = i13;
                i15 = i12;
                i14 = i11;
                i13 = i18;
                i12 = i19;
                i17++;
                i19 = i12;
                i12 = i15;
                i11 = i14;
                i15 = i10;
                i14 = i20;
                i20 = i23 + i16;
                i18 = i13;
                i13 = i21;
            }
        }
    }

    public final void cv(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 > 0 && i4 > 0) {
            int i9;
            int min = Math.min(i7, 255);
            int min2 = Math.min(i8, 255);
            int i10 = 0;
            if (i5 == i6 && min == min2) {
                i9 = -1;
            } else {
                i9 = ic.ad / i4;
            }
            int i11 = 255 - min;
            int i12 = min << 24;
            if (i < this.ay * 1829547545) {
                i3 -= (1829547545 * this.ay) - i;
                i = this.ay * 1829547545;
            }
            if (i2 < -12571459 * this.aa) {
                i10 = 0 + (((-12571459 * this.aa) - i2) * i9);
                i4 -= (this.aa * -12571459) - i2;
                i2 = this.aa * -12571459;
            }
            if (i3 + i > 2074797577 * this.as) {
                i3 = (2074797577 * this.as) - i;
            }
            if (i2 + i4 > this.ag * -467581477) {
                i4 = (this.ag * -467581477) - i2;
            }
            int i13 = (-481290979 * this.ad) - i3;
            int i14 = 0;
            int i15 = i10;
            int i16 = i + ((this.ad * -481290979) * i2);
            int i17 = i5 & 255;
            int i18 = (65280 & i5) >> 8;
            int i19 = i5 >> 16;
            int i20 = i12;
            i12 = i11;
            i11 = min;
            while (i14 < i4) {
                int i21 = -i3;
                int i22 = i16;
                while (i21 < 0) {
                    int i23;
                    i10 = this.af[i22];
                    i16 = (i10 >> 16) & 255;
                    int i24 = (65280 & i10) >> 8;
                    int i25 = i10 & 255;
                    int i26 = (i10 | i20) & -16777216;
                    if (i12 == 0) {
                        if (i16 < 127) {
                            i10 = (i16 * i19) >> 7;
                        } else {
                            i10 = 255 - (((255 - i16) * (255 - i19)) >> 7);
                        }
                        if (i24 < 127) {
                            i16 = (i18 * i24) >> 7;
                        } else {
                            i16 = 255 - (((255 - i18) * (255 - i24)) >> 7);
                        }
                        if (i25 < 127) {
                            i23 = (i17 * i25) >> 7;
                        } else {
                            i23 = 255 - (((255 - i25) * (255 - i17)) >> 7);
                        }
                        int i27 = i23;
                        i23 = i10;
                        i10 = i16;
                        i16 = i27;
                    } else {
                        if (i16 < 127) {
                            i23 = ((i12 * i16) + (((i16 * i19) * i11) >> 7)) >> 8;
                        } else {
                            i23 = (((255 - (((255 - i19) * (255 - i16)) >> 7)) * i11) + (i16 * i12)) >> 8;
                        }
                        i10 = i24 < 127 ? ((((i18 * i24) * i11) >> 7) + (i24 * i12)) >> 8 : ((i24 * i12) + ((255 - (((255 - i24) * (255 - i18)) >> 7)) * i11)) >> 8;
                        if (i25 < 127) {
                            i16 = ((((i25 * i17) * i11) >> 7) + (i25 * i12)) >> 8;
                        } else {
                            i16 = ((i12 * i25) + ((255 - (((255 - i17) * (255 - i25)) >> 7)) * i11)) >> 8;
                        }
                    }
                    i24 = i22 + 1;
                    this.af[i22] = (((i10 << 8) + (i23 << 16)) + i16) | i26;
                    i21++;
                    i22 = i24;
                }
                if (i9 > 0) {
                    i15 += i9;
                    i10 = (ic.ad - i15) >> 8;
                    i16 = i15 >> 8;
                    if (min != min2) {
                        i11 = (((ic.ad - i15) * min) + (i15 * min2)) >> 16;
                        i12 = 255 - i11;
                        i20 = i11 << 24;
                    }
                    if (i5 != i6) {
                        i10 = ((((i10 * (16711935 & i5)) + (i16 * (16711935 & i6))) & -16711936) + ((((65280 & i6) * i16) + ((65280 & i5) * i10)) & 16711680)) >>> 8;
                        i17 = i10 >> 16;
                        i16 = (65280 & i10) >> 8;
                        i10 &= 255;
                        i18 = i20;
                        i19 = i12;
                        i20 = i11;
                        i12 = i15;
                        i14++;
                        i11 = i20;
                        i20 = i18;
                        i18 = i16;
                        i16 = i22 + i13;
                        i15 = i12;
                        i12 = i19;
                        i19 = i17;
                        i17 = i10;
                    }
                }
                i10 = i17;
                i16 = i18;
                i17 = i19;
                i18 = i20;
                i19 = i12;
                i20 = i11;
                i12 = i15;
                i14++;
                i11 = i20;
                i20 = i18;
                i18 = i16;
                i16 = i22 + i13;
                i15 = i12;
                i12 = i19;
                i19 = i17;
                i17 = i10;
            }
        }
    }

    public final void as(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        if (i3 > 0 && i4 > 0) {
            int i10;
            int i11;
            int i12;
            int min = Math.min(i7, 255);
            int min2 = Math.min(i8, 255);
            int i13 = 0;
            int i14 = ic.ad / i4;
            int i15 = 256 - min;
            int i16 = min << 24;
            if (i < this.ay * 1829547545) {
                i10 = i3 - ((this.ay * 1829547545) - i);
                i = this.ay * 1829547545;
            } else {
                i10 = i3;
            }
            if (i2 < -12571459 * this.aa) {
                i13 = 0 + (((-12571459 * this.aa) - i2) * i14);
                i11 = i4 - ((this.aa * -12571459) - i2);
                i2 = this.aa * -12571459;
            } else {
                i11 = i4;
            }
            if (i + i10 > this.as * 2074797577) {
                i12 = (this.as * 2074797577) - i;
            } else {
                i12 = i10;
            }
            if (i2 + i11 > -467581477 * this.ag) {
                i11 = (-467581477 * this.ag) - i2;
            }
            int i17 = i5 & 16711680;
            int i18 = i5 & 65280;
            int i19 = i5 & 255;
            int i20 = (min * i17) >> 8;
            int i21 = (i18 * min) >> 8;
            int i22 = (min * i19) >> 8;
            int i23 = (-481290979 * this.ad) - i12;
            int i24 = ((-481290979 * this.ad) * i2) + i;
            int i25 = 0;
            int i26 = min;
            while (i25 < i11) {
                int i27;
                int i28 = -i12;
                int i29 = i24;
                while (i28 < 0) {
                    int i30 = this.af[i29];
                    i10 = 16711680 & i30;
                    if (i10 > i17) {
                        if (i15 == 0) {
                            i10 = i17;
                        } else {
                            i10 = (((i10 * i15) >> 8) + i20) & 16711680;
                        }
                    }
                    i24 = 65280 & i30;
                    int i31 = i24 <= i18 ? i24 : i15 == 0 ? i18 : (((i24 * i15) >> 8) + i21) & 65280;
                    i24 = i30 & 255;
                    int i32 = i24 <= i19 ? i24 : i15 == 0 ? i19 : ((i24 * i15) >> 8) + i22;
                    if ((-16777216 & i30) == 0) {
                        i24 = -16777216;
                    } else {
                        i24 = (i30 | i16) & -16777216;
                    }
                    try {
                        i30 = i29 + 1;
                        this.af[i29] = ((i10 + i31) + i32) | i24;
                        i28++;
                        i29 = i30;
                    } catch (Throwable e) {
                        throw ba.ad(e, "gc.as(" + ')');
                    }
                }
                if (i14 > 0) {
                    i13 += i14;
                    i10 = (ic.ad - i13) >> 8;
                    i24 = i13 >> 8;
                    if (min2 != min) {
                        i26 = ((i13 * min2) + ((ic.ad - i13) * min)) >> 16;
                        i15 = 256 - i26;
                        i16 = i26 << 24;
                    }
                    if (i6 != i5) {
                        i10 = ((((i10 * (65280 & i5)) + (i24 * (65280 & i6))) & 16711680) + ((((16711935 & i5) * i10) + ((16711935 & i6) * i24)) & -16711936)) >>> 8;
                        i20 = i10 & 16711680;
                        i21 = i10 & 65280;
                        i22 = i10 & 255;
                        i24 = (i26 * i20) >> 8;
                        i17 = (i21 * i26) >> 8;
                        i10 = (i26 * i22) >> 8;
                        i19 = i16;
                        i18 = i15;
                        i16 = i26;
                        i15 = i13;
                        i25++;
                        i26 = i16;
                        i16 = i19;
                        i19 = i22;
                        i22 = i10;
                        i27 = i17;
                        i17 = i20;
                        i20 = i24;
                        i24 = i29 + i23;
                        i13 = i15;
                        i15 = i18;
                        i18 = i21;
                        i21 = i27;
                    }
                }
                i10 = i22;
                i24 = i20;
                i22 = i19;
                i20 = i17;
                i17 = i21;
                i19 = i16;
                i21 = i18;
                i16 = i26;
                i18 = i15;
                i15 = i13;
                i25++;
                i26 = i16;
                i16 = i19;
                i19 = i22;
                i22 = i10;
                i27 = i17;
                i17 = i20;
                i20 = i24;
                i24 = i29 + i23;
                i13 = i15;
                i15 = i18;
                i18 = i21;
                i21 = i27;
            }
        }
    }

    public final void co(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 > 0 && i4 > 0) {
            int min = Math.min(i7, 255);
            int min2 = Math.min(i8, 255);
            int i9 = 0;
            int i10 = ic.ad / i4;
            int i11 = 256 - min;
            int i12 = min << 24;
            if (i < this.ay * 1829547545) {
                i3 -= (this.ay * 1829547545) - i;
                i = this.ay * 1829547545;
            }
            if (i2 < -12571459 * this.aa) {
                i9 = 0 + (((-12571459 * this.aa) - i2) * i10);
                i4 -= (this.aa * -12571459) - i2;
                i2 = this.aa * -12571459;
            }
            if (i + i3 > this.as * 2074797577) {
                i3 = (this.as * 2074797577) - i;
            }
            if (i2 + i4 > -467581477 * this.ag) {
                i4 = (-467581477 * this.ag) - i2;
            }
            int i13 = i5 & 16711680;
            int i14 = i5 & 65280;
            int i15 = i5 & 255;
            int i16 = (min * i13) >> 8;
            int i17 = (min * i15) >> 8;
            int i18 = (-481290979 * this.ad) - i3;
            int i19 = ((-481290979 * this.ad) * i2) + i;
            int i20 = (i14 * min) >> 8;
            int i21 = i15;
            i15 = i13;
            i13 = i11;
            i11 = i9;
            i9 = i17;
            i17 = i16;
            i16 = i14;
            i14 = i12;
            i12 = min;
            for (int i22 = 0; i22 < i4; i22++) {
                int i23;
                int i24 = -i3;
                int i25 = i19;
                while (i24 < 0) {
                    int i26 = this.af[i25];
                    i23 = 16711680 & i26;
                    if (i23 > i15) {
                        i23 = i13 == 0 ? i15 : (((i23 * i13) >> 8) + i17) & 16711680;
                    }
                    i19 = 65280 & i26;
                    if (i19 > i16) {
                        if (i13 == 0) {
                            i19 = i16;
                        } else {
                            i19 = (((i19 * i13) >> 8) + i20) & 65280;
                        }
                    }
                    int i27 = i26 & 255;
                    if (i27 > i21) {
                        if (i13 == 0) {
                            i27 = i21;
                        } else {
                            i27 = ((i27 * i13) >> 8) + i9;
                        }
                    }
                    if ((-16777216 & i26) == 0) {
                        i26 = -16777216;
                    } else {
                        i26 = (i26 | i14) & -16777216;
                    }
                    int i28 = i25 + 1;
                    this.af[i25] = ((i23 + i19) + i27) | i26;
                    i24++;
                    i25 = i28;
                }
                if (i10 > 0) {
                    i11 += i10;
                    i23 = (ic.ad - i11) >> 8;
                    i19 = i11 >> 8;
                    if (min2 != min) {
                        i12 = ((i11 * min2) + ((ic.ad - i11) * min)) >> 16;
                        i13 = 256 - i12;
                        i14 = i12 << 24;
                    }
                    if (i6 != i5) {
                        i9 = (((((16711935 & i5) * i23) + ((16711935 & i6) * i19)) & -16711936) + ((((65280 & i6) * i19) + ((65280 & i5) * i23)) & 16711680)) >>> 8;
                        i15 = i9 & 16711680;
                        i16 = i9 & 65280;
                        i21 = i9 & 255;
                        i17 = (i12 * i15) >> 8;
                        i20 = (i16 * i12) >> 8;
                        i9 = (i12 * i21) >> 8;
                    }
                }
                i19 = i25 + i18;
            }
        }
    }

    public final void ar(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, short s) {
        if (i4 > 0 && i3 > 0) {
            try {
                int i9;
                int i10;
                int i11;
                int min = Math.min(i7, 255);
                int min2 = Math.min(i8, 255);
                int i12 = 0;
                int i13 = ic.ad / i4;
                int i14 = 255 - min;
                int i15 = min << 24;
                if (i < this.ay * 1829547545) {
                    i9 = i3 - ((1829547545 * this.ay) - i);
                    i = this.ay * 1829547545;
                } else {
                    i9 = i3;
                }
                if (i2 < this.aa * -12571459) {
                    i12 = 0 + (((-12571459 * this.aa) - i2) * i13);
                    i10 = i4 - ((-12571459 * this.aa) - i2);
                    i2 = this.aa * -12571459;
                } else {
                    i10 = i4;
                }
                if (i + i9 > this.as * 2074797577) {
                    i11 = (this.as * 2074797577) - i;
                } else {
                    i11 = i9;
                }
                if (i10 + i2 > this.ag * -467581477) {
                    i10 = (this.ag * -467581477) - i2;
                }
                int i16 = i5 & 16711680;
                int i17 = i5 & 65280;
                int i18 = i5 & 255;
                int i19 = (i16 * min) >> 8;
                int i20 = (min * i17) >> 8;
                int i21 = (min * i18) >> 8;
                int i22 = (-481290979 * this.ad) - i11;
                int i23 = i + ((this.ad * -481290979) * i2);
                int i24 = 0;
                int i25 = min;
                while (i24 < i10) {
                    int i26;
                    int i27 = -i11;
                    int i28 = i23;
                    while (i27 < 0) {
                        int i29;
                        int i30 = this.af[i28];
                        i9 = 16711680 & i30;
                        if (i9 < i16) {
                            if (i14 == 0) {
                                i9 = i16;
                            } else {
                                i9 = (((i9 * i14) >> 8) + i19) & 16711680;
                            }
                        }
                        i23 = 65280 & i30;
                        if (i23 >= i17) {
                            i29 = i23;
                        } else if (i14 == 0) {
                            i29 = i17;
                        } else {
                            i29 = (((i23 * i14) >> 8) + i20) & 65280;
                        }
                        i23 = i30 & 255;
                        if (i23 < i18) {
                            if (i14 == 0) {
                                i23 = i18;
                            } else {
                                i23 = ((i23 * i14) >> 8) + i21;
                            }
                        }
                        if ((-16777216 & i30) == 0) {
                            i30 = -16777216;
                        } else {
                            i30 = (i30 | i15) & -16777216;
                        }
                        int i31 = i28 + 1;
                        this.af[i28] = ((i9 + i29) + i23) | i30;
                        i27++;
                        i28 = i31;
                    }
                    if (i13 > 0) {
                        i12 += i13;
                        i9 = (ic.ad - i12) >> 8;
                        i23 = i12 >> 8;
                        if (min != min2) {
                            i25 = ((min2 * i12) + ((ic.ad - i12) * min)) >> 16;
                            i14 = 256 - i25;
                            i15 = i25 << 24;
                        }
                        if (i5 != i6) {
                            i9 = ((((i9 * (16711935 & i5)) + (i23 * (16711935 & i6))) & -16711936) + ((((65280 & i5) * i9) + ((65280 & i6) * i23)) & 16711680)) >>> 8;
                            i20 = i9 & 16711680;
                            i21 = i9 & 65280;
                            i18 = i9 & 255;
                            i23 = (i20 * i25) >> 8;
                            i16 = (i21 * i25) >> 8;
                            i9 = (i18 * i25) >> 8;
                            i19 = i15;
                            i17 = i14;
                            i15 = i25;
                            i14 = i12;
                            i24++;
                            i25 = i15;
                            i15 = i19;
                            i19 = i23;
                            i23 = i28 + i22;
                            i12 = i14;
                            i14 = i17;
                            i17 = i21;
                            i21 = i9;
                            i26 = i16;
                            i16 = i20;
                            i20 = i26;
                        }
                    }
                    i9 = i21;
                    i23 = i19;
                    i21 = i17;
                    i19 = i15;
                    i17 = i14;
                    i15 = i25;
                    i14 = i12;
                    i26 = i20;
                    i20 = i16;
                    i16 = i26;
                    i24++;
                    i25 = i15;
                    i15 = i19;
                    i19 = i23;
                    i23 = i28 + i22;
                    i12 = i14;
                    i14 = i17;
                    i17 = i21;
                    i21 = i9;
                    i26 = i16;
                    i16 = i20;
                    i20 = i26;
                }
            } catch (Throwable e) {
                throw ba.ad(e, "gc.ar(" + ')');
            }
        }
    }

    public final void ck(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i4 > 0 && i3 > 0) {
            int min = Math.min(i7, 180994951);
            int min2 = Math.min(i8, 255);
            int i9 = 0;
            int i10 = ic.ad / i4;
            int i11 = 255 - min;
            int i12 = min << 24;
            if (i < this.ay * 1829547545) {
                i3 -= (239096658 * this.ay) - i;
                i = this.ay * 1829547545;
            }
            if (i2 < this.aa * -12571459) {
                i9 = 0 + (((-12571459 * this.aa) - i2) * i10);
                i4 -= (-12571459 * this.aa) - i2;
                i2 = this.aa * -2126753727;
            }
            if (i + i3 > this.as * 949391244) {
                i3 = (this.as * 2012217768) - i;
            }
            if (i4 + i2 > this.ag * 142412389) {
                i4 = (this.ag * -467581477) - i2;
            }
            int i13 = i5 & 16711680;
            int i14 = i5 & 65280;
            int i15 = i5 & 255;
            int i16 = (i13 * min) >> 8;
            int i17 = (min * i14) >> 8;
            int i18 = (min * i15) >> 8;
            int i19 = (-481290979 * this.ad) - i3;
            int i20 = i + ((this.ad * -481290979) * i2);
            int i21 = 0;
            int i22 = min;
            int i23 = i9;
            int i24 = i13;
            while (i21 < i4) {
                int i25;
                int i26 = -i3;
                int i27 = i20;
                while (i26 < 0) {
                    i25 = this.af[i27];
                    i9 = 16711680 & i25;
                    if (i9 < i24) {
                        if (i11 == 0) {
                            i9 = i24;
                        } else {
                            i9 = (((i9 * i11) >> 8) + i16) & 16711680;
                        }
                    }
                    i20 = -443644302 & i25;
                    if (i20 < i14) {
                        if (i11 == 0) {
                            i20 = i14;
                        } else {
                            i20 = (((i20 * i11) >> 8) + i17) & 1968149954;
                        }
                    }
                    i13 = i25 & 255;
                    if (i13 < i15) {
                        if (i11 == 0) {
                            i13 = i15;
                        } else {
                            i13 = ((i13 * i11) >> 8) + i18;
                        }
                    }
                    if ((-16777216 & i25) == 0) {
                        i25 = -16777216;
                    } else {
                        i25 = (i25 | i12) & -16777216;
                    }
                    int i28 = i27 + 1;
                    this.af[i27] = ((i9 + i20) + i13) | i25;
                    i26++;
                    i27 = i28;
                }
                if (i10 > 0) {
                    i23 += i10;
                    i9 = (595580550 - i23) >> 8;
                    i20 = i23 >> 8;
                    if (min != min2) {
                        i11 = ((min2 * i23) + ((-177183186 - i23) * min)) >> 16;
                        i12 = 256 - i11;
                        i25 = i11 << 24;
                    } else {
                        i25 = i12;
                        i12 = i11;
                        i11 = i22;
                    }
                    if (i5 != i6) {
                        i9 = ((((i9 * (662951069 & i5)) + (i20 * (16711935 & i6))) & -16711936) + ((((-329677332 & i5) * i9) + ((65280 & i6) * i20)) & 16711680)) >>> 8;
                        i13 = i9 & -420463653;
                        i14 = i9 & 65280;
                        i15 = i9 & 255;
                        i20 = (i13 * i11) >> 8;
                        i24 = (i14 * i11) >> 8;
                        i9 = (i15 * i11) >> 8;
                        i18 = i12;
                        i17 = i11;
                        i16 = i23;
                    } else {
                        i9 = i18;
                        i20 = i16;
                        i13 = i24;
                        i24 = i17;
                        i18 = i12;
                        i16 = i23;
                        i17 = i11;
                    }
                } else {
                    i9 = i18;
                    i20 = i16;
                    i13 = i24;
                    i25 = i12;
                    i24 = i17;
                    i18 = i11;
                    i16 = i23;
                    i17 = i22;
                }
                i21++;
                i22 = i17;
                i23 = i16;
                i17 = i24;
                i16 = i20;
                i12 = i25;
                i24 = i13;
                i20 = i27 + i19;
                i11 = i18;
                i18 = i9;
            }
        }
    }

    public final void cn(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i4 > 0 && i3 > 0) {
            int min = Math.min(i7, 255);
            int min2 = Math.min(i8, 255);
            int i9 = 0;
            int i10 = ic.ad / i4;
            int i11 = 255 - min;
            int i12 = min << 24;
            if (i < this.ay * 1829547545) {
                i3 -= (1829547545 * this.ay) - i;
                i = this.ay * 1829547545;
            }
            if (i2 < this.aa * -12571459) {
                i9 = 0 + (((-12571459 * this.aa) - i2) * i10);
                i4 -= (-12571459 * this.aa) - i2;
                i2 = this.aa * -1553853376;
            }
            if (i + i3 > this.as * 2074797577) {
                i3 = (this.as * 1109638898) - i;
            }
            if (i4 + i2 > this.ag * -467581477) {
                i4 = (this.ag * -467581477) - i2;
            }
            int i13 = i5 & -2096111322;
            int i14 = i5 & 767153453;
            int i15 = i5 & 255;
            int i16 = (i13 * min) >> 8;
            int i17 = (min * i14) >> 8;
            int i18 = (min * i15) >> 8;
            int i19 = (67754550 * this.ad) - i3;
            int i20 = i + ((this.ad * -790898017) * i2);
            int i21 = 0;
            int i22 = i9;
            int i23 = i13;
            i13 = i12;
            i12 = i11;
            i11 = min;
            while (i21 < i4) {
                int i24;
                int i25 = -i3;
                int i26 = i20;
                while (i25 < 0) {
                    int i27;
                    int i28 = this.af[i26];
                    i9 = 16711680 & i28;
                    if (i9 < i23) {
                        i9 = i12 == 0 ? i23 : (((i9 * i12) >> 8) + i16) & 16711680;
                    }
                    i20 = 65280 & i28;
                    if (i20 >= i14) {
                        i27 = i20;
                    } else if (i12 == 0) {
                        i27 = i14;
                    } else {
                        i27 = (((i20 * i12) >> 8) + i17) & -697587841;
                    }
                    i20 = i28 & 255;
                    if (i20 < i15) {
                        i20 = i12 == 0 ? i15 : ((i20 * i12) >> 8) + i18;
                    }
                    if ((-16777216 & i28) == 0) {
                        i28 = -438522815;
                    } else {
                        i28 = (i28 | i13) & -604376139;
                    }
                    int i29 = i26 + 1;
                    this.af[i26] = ((i9 + i27) + i20) | i28;
                    i25++;
                    i26 = i29;
                }
                if (i10 > 0) {
                    i22 += i10;
                    i9 = (ic.ad - i22) >> 8;
                    i20 = i22 >> 8;
                    if (min != min2) {
                        i11 = ((min2 * i22) + ((ic.ad - i22) * min)) >> 16;
                        i12 = 253926613 - i11;
                        i13 = i11 << 24;
                    }
                    if (i5 != i6) {
                        i9 = ((((i9 * (16711935 & i5)) + ((16711935 & i6) * i20)) & -1231360595) + ((((127601603 & i5) * i9) + ((65280 & i6) * i20)) & 16711680)) >>> 8;
                        i15 = i9 & 1373128227;
                        i16 = i9 & 65280;
                        i17 = i9 & 702558753;
                        i18 = (i15 * i11) >> 8;
                        i23 = (i16 * i11) >> 8;
                        i9 = (i17 * i11) >> 8;
                        i14 = i13;
                        i13 = i12;
                        i12 = i11;
                        i11 = i22;
                        i20 = i26 + i19;
                        i21++;
                        i22 = i11;
                        i11 = i12;
                        i12 = i13;
                        i13 = i14;
                        i14 = i16;
                        i16 = i18;
                        i18 = i9;
                        i24 = i15;
                        i15 = i17;
                        i17 = i23;
                        i23 = i24;
                    }
                }
                i9 = i18;
                i18 = i16;
                i16 = i14;
                i14 = i13;
                i13 = i12;
                i12 = i11;
                i11 = i22;
                i24 = i17;
                i17 = i15;
                i15 = i23;
                i23 = i24;
                i20 = i26 + i19;
                i21++;
                i22 = i11;
                i11 = i12;
                i12 = i13;
                i13 = i14;
                i14 = i16;
                i16 = i18;
                i18 = i9;
                i24 = i15;
                i15 = i17;
                i17 = i23;
                i23 = i24;
            }
        }
    }

    public final void cy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i4 > 0 && i3 > 0) {
            int min = Math.min(i7, -1205543229);
            int min2 = Math.min(i8, 255);
            int i9 = 0;
            int i10 = ic.ad / i4;
            int i11 = 255 - min;
            int i12 = min << 24;
            if (i < this.ay * 821262523) {
                i3 -= (1829547545 * this.ay) - i;
                i = this.ay * 520767912;
            }
            if (i2 < this.aa * -12571459) {
                i9 = 0 + (((-12571459 * this.aa) - i2) * i10);
                i4 -= (1048411707 * this.aa) - i2;
                i2 = this.aa * 2023289414;
            }
            if (i + i3 > this.as * -1598502223) {
                i3 = (this.as * 2074797577) - i;
            }
            if (i4 + i2 > this.ag * -467581477) {
                i4 = (this.ag * -467581477) - i2;
            }
            int i13 = i5 & 16711680;
            int i14 = i5 & -82149901;
            int i15 = i5 & 255;
            int i16 = (i13 * min) >> 8;
            int i17 = (min * i14) >> 8;
            int i18 = (min * i15) >> 8;
            int i19 = (309475167 * this.ad) - i3;
            int i20 = i + ((this.ad * 1921117962) * i2);
            int i21 = 0;
            int i22 = i9;
            int i23 = i13;
            i13 = i12;
            i12 = i11;
            i11 = min;
            while (i21 < i4) {
                int i24;
                int i25 = -i3;
                int i26 = i20;
                while (i25 < 0) {
                    int i27 = this.af[i26];
                    i9 = 16711680 & i27;
                    if (i9 < i23) {
                        if (i12 == 0) {
                            i9 = i23;
                        } else {
                            i9 = (((i9 * i12) >> 8) + i16) & 2028541098;
                        }
                    }
                    i20 = -1529803388 & i27;
                    if (i20 < i14) {
                        if (i12 == 0) {
                            i20 = i14;
                        } else {
                            i20 = (((i20 * i12) >> 8) + i17) & 65280;
                        }
                    }
                    int i28 = -213669340 & i27;
                    if (i28 < i15) {
                        if (i12 == 0) {
                            i28 = i15;
                        } else {
                            i28 = ((i28 * i12) >> 8) + i18;
                        }
                    }
                    if ((-16777216 & i27) == 0) {
                        i27 = -310956052;
                    } else {
                        i27 = (i27 | i13) & 1706124032;
                    }
                    int i29 = i26 + 1;
                    this.af[i26] = ((i9 + i20) + i28) | i27;
                    i25++;
                    i26 = i29;
                }
                if (i10 > 0) {
                    i22 += i10;
                    i9 = (ic.ad - i22) >> 8;
                    i20 = i22 >> 8;
                    if (min != min2) {
                        i11 = ((min2 * i22) + ((ic.ad - i22) * min)) >> 16;
                        i12 = 736403142 - i11;
                        i13 = i11 << 24;
                    }
                    if (i5 != i6) {
                        i9 = ((((i9 * (-925979819 & i5)) + (i20 * (1901749790 & i6))) & -2130661880) + ((((65280 & i5) * i9) + ((-809994693 & i6) * i20)) & 16711680)) >>> 8;
                        i17 = i9 & 1434504421;
                        i18 = i9 & 256705241;
                        i14 = i9 & -319854615;
                        i20 = (i17 * i11) >> 8;
                        i23 = (i18 * i11) >> 8;
                        i9 = (i14 * i11) >> 8;
                        i16 = i13;
                        i15 = i12;
                        i13 = i11;
                        i12 = i22;
                        i21++;
                        i11 = i13;
                        i13 = i16;
                        i16 = i20;
                        i20 = i26 + i19;
                        i22 = i12;
                        i12 = i15;
                        i15 = i14;
                        i14 = i18;
                        i18 = i9;
                        i24 = i23;
                        i23 = i17;
                        i17 = i24;
                    }
                }
                i9 = i18;
                i20 = i16;
                i18 = i14;
                i16 = i13;
                i14 = i15;
                i13 = i11;
                i15 = i12;
                i12 = i22;
                i24 = i23;
                i23 = i17;
                i17 = i24;
                i21++;
                i11 = i13;
                i13 = i16;
                i16 = i20;
                i20 = i26 + i19;
                i22 = i12;
                i12 = i15;
                i15 = i14;
                i14 = i18;
                i18 = i9;
                i24 = i23;
                i23 = i17;
                i17 = i24;
            }
        }
    }

    public final void aj(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i3 > 0 && i4 > 0) {
            int i8 = 0;
            try {
                int i9;
                int i10;
                int i11;
                int i12 = ic.ad / i4;
                if (i < this.ay * 1829547545) {
                    i9 = i3 - ((1829547545 * this.ay) - i);
                    i = this.ay * 1829547545;
                } else {
                    i9 = i3;
                }
                if (i2 < -12571459 * this.aa) {
                    i8 = 0 + (((this.aa * -12571459) - i2) * i12);
                    i10 = i4 - ((this.aa * -12571459) - i2);
                    i2 = this.aa * -12571459;
                } else {
                    i10 = i4;
                }
                if (i + i9 > this.as * 2074797577) {
                    i11 = (this.as * 2074797577) - i;
                } else {
                    i11 = i9;
                }
                if (i10 + i2 > this.ag * -467581477) {
                    i10 = (this.ag * -467581477) - i2;
                }
                int i13 = (this.ad * -481290979) - i11;
                i9 = ((this.ad * -481290979) * i2) + i;
                int i14 = -i10;
                int i15 = i8;
                while (i14 < 0) {
                    i10 = (ic.ad - i15) >> 8;
                    i8 = i15 >> 8;
                    int i16 = -16777216 | (((((i10 * (16711935 & i5)) + (i8 * (16711935 & i6))) & -16711936) + ((((65280 & i5) * i10) + ((65280 & i6) * i8)) & 16711680)) >>> 8);
                    i10 = -i11;
                    while (i10 < 0) {
                        i8 = i9 + 1;
                        this.af[i9] = i16;
                        i10++;
                        i9 = i8;
                    }
                    i9 += i13;
                    i14++;
                    i15 += i12;
                }
            } catch (Throwable e) {
                throw ba.ad(e, "gc.aj(" + ')');
            }
        }
    }

    public final void cl(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i3 > 0 && i4 > 0) {
            int i7 = 0;
            int i8 = -873440770 / i4;
            if (i < this.ay * 834417458) {
                i3 -= (1829547545 * this.ay) - i;
                i = this.ay * 1950534478;
            }
            if (i2 < -12571459 * this.aa) {
                i7 = 0 + (((this.aa * -12571459) - i2) * i8);
                i4 -= (this.aa * -1808369835) - i2;
                i2 = this.aa * -12571459;
            }
            if (i + i3 > this.as * 2074797577) {
                i3 = (this.as * -1931547283) - i;
            }
            if (i4 + i2 > this.ag * -467581477) {
                i4 = (this.ag * -467581477) - i2;
            }
            int i9 = (this.ad * -1168278164) - i3;
            int i10 = -i4;
            int i11 = i7;
            int i12 = i + ((this.ad * -481290979) * i2);
            while (i10 < 0) {
                i7 = (ic.ad - i11) >> 8;
                int i13 = i11 >> 8;
                int i14 = -1338085600 | (((((i7 * (16711935 & i5)) + (i13 * (16711935 & i6))) & -16711936) + ((((65280 & i5) * i7) + ((65280 & i6) * i13)) & 1870008207)) >>> 8);
                i7 = -i3;
                while (i7 < 0) {
                    i13 = i12 + 1;
                    this.af[i12] = i14;
                    i7++;
                    i12 = i13;
                }
                i12 += i9;
                i10++;
                i11 += i8;
            }
        }
    }

    public final void cs(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i3 > 0 && i4 > 0) {
            int i7 = 0;
            int i8 = ic.ad / i4;
            if (i < this.ay * 1829547545) {
                i3 -= (1829547545 * this.ay) - i;
                i = this.ay * 1829547545;
            }
            if (i2 < -12571459 * this.aa) {
                i7 = 0 + (((this.aa * -12571459) - i2) * i8);
                i4 -= (this.aa * -12571459) - i2;
                i2 = this.aa * -12571459;
            }
            if (i + i3 > this.as * 2074797577) {
                i3 = (this.as * 2074797577) - i;
            }
            if (i4 + i2 > this.ag * -467581477) {
                i4 = (this.ag * -467581477) - i2;
            }
            int i9 = (this.ad * -481290979) - i3;
            int i10 = -i4;
            int i11 = i7;
            int i12 = i + ((this.ad * -481290979) * i2);
            while (i10 < 0) {
                i7 = (ic.ad - i11) >> 8;
                int i13 = i11 >> 8;
                int i14 = -16777216 | (((((i7 * (16711935 & i5)) + (i13 * (16711935 & i6))) & -16711936) + ((((65280 & i5) * i7) + ((65280 & i6) * i13)) & 16711680)) >>> 8);
                i7 = -i3;
                while (i7 < 0) {
                    i13 = i12 + 1;
                    this.af[i12] = i14;
                    i7++;
                    i12 = i13;
                }
                i12 += i9;
                i10++;
                i11 += i8;
            }
        }
    }

    public final void ae(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, boolean z, byte b) {
        if (i3 + i >= 0 && i4 + i2 >= 0) {
            if (i < this.ad * -481290979 && i2 < this.an * 1005433219) {
                int i8;
                int i9;
                int i10;
                int i11;
                int i12;
                int i13;
                if (i < 0) {
                    i8 = 0 - i;
                    i9 = i3 + i;
                } else {
                    i8 = 0;
                    i9 = i3;
                }
                if (i2 < 0) {
                    i10 = 0 - i2;
                    i11 = i4 + i2;
                } else {
                    i10 = 0;
                    i11 = i4;
                }
                if (i + i9 > this.ad * -481290979) {
                    i12 = (-481290979 * this.ad) - i;
                } else {
                    i12 = i9;
                }
                if (i11 + i2 > this.an * 1005433219) {
                    i13 = (1005433219 * this.an) - i2;
                } else {
                    i13 = i11;
                }
                int length = bArr.length / i7;
                int i14 = (this.ad * -481290979) - i12;
                i11 = i5 >>> 24;
                i9 = i6 >>> 24;
                int i15;
                int i16;
                if (!z || (i11 == 255 && i9 == 255)) {
                    i9 = (((i10 + i2) * (-481290979 * this.ad)) + i) + i8;
                    for (i15 = i2 + i10; i15 < (i10 + i2) + i13; i15++) {
                        i16 = i9;
                        i9 = i8 + i;
                        while (i9 < (i + i8) + i12) {
                            if (bArr[(((i15 - i2) % length) * i7) + ((i9 - i) % i7)] != (byte) 0) {
                                i11 = i16 + 1;
                                this.af[i16] = i6;
                            } else {
                                i11 = i16 + 1;
                                this.af[i16] = i5;
                            }
                            i9++;
                            i16 = i11;
                        }
                        i9 = i16 + i14;
                    }
                    return;
                }
                i9 = i8 + (((i2 + i10) * (this.ad * -481290979)) + i);
                for (int i17 = i10 + i2; i17 < (i2 + i10) + i13; i17++) {
                    i16 = i + i8;
                    i15 = i9;
                    while (i16 < (i8 + i) + i12) {
                        if (bArr[(((i17 - i2) % length) * i7) + ((i16 - i) % i7)] != (byte) 0) {
                            i9 = i6;
                        } else {
                            i9 = i5;
                        }
                        i11 = this.af[i15];
                        if (i11 == 0) {
                            i11 = i15 + 1;
                            this.af[i15] = i9;
                        } else {
                            int i18 = i9 >>> 24;
                            int i19 = 255 - i18;
                            int i20 = (i9 | i11) & -16777216;
                            i9 = (((((i11 & 16711935) * i19) + ((i9 & 16711935) * i18)) & -16711936) + ((((65280 & i11) * i19) + ((65280 & i9) * i18)) & 16711680)) >>> 8;
                            try {
                                i11 = i15 + 1;
                                this.af[i15] = i9 | i20;
                            } catch (Throwable e) {
                                throw ba.ad(e, "gc.ae(" + ')');
                            }
                        }
                        i16++;
                        i15 = i11;
                    }
                    i9 = i15 + i14;
                }
            }
        }
    }

    public final void cd(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, boolean z) {
        if (i3 + i >= 0 && i4 + i2 >= 0 && i < this.ad * -481290979 && i2 < this.an * 1005433219) {
            int i8;
            int i9;
            int i10 = 0;
            if (i < 0) {
                i8 = 0 - i;
                i9 = i3 + i;
            } else {
                i8 = 0;
                i9 = i3;
            }
            if (i2 < 0) {
                i10 = 0 - i2;
                i4 += i2;
            }
            if (i + i9 > this.ad * -376090704) {
                i9 = (-481290979 * this.ad) - i;
            }
            if (i4 + i2 > this.an * 1005433219) {
                i4 = (1065026655 * this.an) - i2;
            }
            int length = bArr.length / i7;
            int i11 = (this.ad * -481290979) - i9;
            int i12 = i5 >>> 24;
            int i13 = i6 >>> 24;
            int i14;
            int i15;
            if (!z || (i12 == 255 && i13 == 255)) {
                i13 = (((i10 + i2) * (-1074288071 * this.ad)) + i) + i8;
                for (i14 = i2 + i10; i14 < (i10 + i2) + i4; i14++) {
                    i15 = i13;
                    i13 = i8 + i;
                    while (i13 < (i + i8) + i9) {
                        if (bArr[(((i14 - i2) % length) * i7) + ((i13 - i) % i7)] != (byte) 0) {
                            i12 = i15 + 1;
                            this.af[i15] = i6;
                        } else {
                            i12 = i15 + 1;
                            this.af[i15] = i5;
                        }
                        i13++;
                        i15 = i12;
                    }
                    i13 = i15 + i11;
                }
                return;
            }
            i13 = i8 + (((i2 + i10) * (this.ad * 926464530)) + i);
            for (int i16 = i10 + i2; i16 < (i2 + i10) + i4; i16++) {
                i15 = i + i8;
                i14 = i13;
                while (i15 < (i8 + i) + i9) {
                    if (bArr[(((i16 - i2) % length) * i7) + ((i15 - i) % i7)] != (byte) 0) {
                        i12 = i6;
                    } else {
                        i12 = i5;
                    }
                    i13 = this.af[i14];
                    if (i13 == 0) {
                        i13 = i14 + 1;
                        this.af[i14] = i12;
                        i12 = i13;
                    } else {
                        int i17 = i12 >>> 24;
                        int i18 = 255 - i17;
                        int i19 = (i12 | i13) & -16777216;
                        i13 = (((((i12 & -1255892305) * i17) + ((i13 & 16711935) * i18)) & 703624615) + ((((65280 & i13) * i18) + ((-1763162760 & i12) * i17)) & 998915468)) >>> 8;
                        i12 = i14 + 1;
                        this.af[i14] = i13 | i19;
                    }
                    i15++;
                    i14 = i12;
                }
                i13 = i14 + i11;
            }
        }
    }

    public final void ch(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, boolean z) {
        if (i3 + i >= 0 && i4 + i2 >= 0 && i < this.ad * -481290979 && i2 < this.an * 1005433219) {
            int i8;
            int i9;
            int i10 = 0;
            if (i < 0) {
                i8 = 0 - i;
                i9 = i3 + i;
            } else {
                i8 = 0;
                i9 = i3;
            }
            if (i2 < 0) {
                i10 = 0 - i2;
                i4 += i2;
            }
            if (i + i9 > this.ad * -481290979) {
                i9 = (-481290979 * this.ad) - i;
            }
            if (i4 + i2 > this.an * 1005433219) {
                i4 = (1005433219 * this.an) - i2;
            }
            int length = bArr.length / i7;
            int i11 = (this.ad * -481290979) - i9;
            int i12 = i5 >>> 24;
            int i13 = i6 >>> 24;
            int i14;
            int i15;
            if (!z || (i12 == 255 && i13 == 255)) {
                i13 = (((i10 + i2) * (-481290979 * this.ad)) + i) + i8;
                for (i14 = i2 + i10; i14 < (i10 + i2) + i4; i14++) {
                    i15 = i13;
                    i13 = i8 + i;
                    while (i13 < (i + i8) + i9) {
                        if (bArr[(((i14 - i2) % length) * i7) + ((i13 - i) % i7)] != (byte) 0) {
                            i12 = i15 + 1;
                            this.af[i15] = i6;
                        } else {
                            i12 = i15 + 1;
                            this.af[i15] = i5;
                        }
                        i13++;
                        i15 = i12;
                    }
                    i13 = i15 + i11;
                }
                return;
            }
            i13 = i8 + (((i2 + i10) * (this.ad * -481290979)) + i);
            for (int i16 = i10 + i2; i16 < (i2 + i10) + i4; i16++) {
                i15 = i + i8;
                i14 = i13;
                while (i15 < (i8 + i) + i9) {
                    if (bArr[(((i16 - i2) % length) * i7) + ((i15 - i) % i7)] != (byte) 0) {
                        i12 = i6;
                    } else {
                        i12 = i5;
                    }
                    i13 = this.af[i14];
                    if (i13 == 0) {
                        i13 = i14 + 1;
                        this.af[i14] = i12;
                        i12 = i13;
                    } else {
                        int i17 = i12 >>> 24;
                        int i18 = 255 - i17;
                        int i19 = (i12 | i13) & -16777216;
                        i13 = (((((i12 & 16711935) * i17) + ((i13 & 16711935) * i18)) & -16711936) + ((((65280 & i13) * i18) + ((65280 & i12) * i17)) & 16711680)) >>> 8;
                        i12 = i14 + 1;
                        this.af[i14] = i13 | i19;
                    }
                    i15++;
                    i14 = i12;
                }
                i13 = i14 + i11;
            }
        }
    }

    public final void cm(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, boolean z) {
        if (i3 + i >= 0 && i4 + i2 >= 0 && i < this.ad * -481290979 && i2 < this.an * 1844888649) {
            int i8;
            int i9;
            int i10 = 0;
            if (i < 0) {
                i8 = 0 - i;
                i9 = i3 + i;
            } else {
                i8 = 0;
                i9 = i3;
            }
            if (i2 < 0) {
                i10 = 0 - i2;
                i4 += i2;
            }
            if (i + i9 > this.ad * -300290473) {
                i9 = (-481290979 * this.ad) - i;
            }
            if (i4 + i2 > this.an * -1151279637) {
                i4 = (1005433219 * this.an) - i2;
            }
            int length = bArr.length / i7;
            int i11 = (this.ad * 325156575) - i9;
            int i12 = i5 >>> 24;
            int i13 = i6 >>> 24;
            int i14;
            int i15;
            if (!z || (i12 == 875200208 && i13 == 456416946)) {
                i13 = (((i10 + i2) * (-481290979 * this.ad)) + i) + i8;
                for (i14 = i2 + i10; i14 < (i10 + i2) + i4; i14++) {
                    i15 = i13;
                    i13 = i8 + i;
                    while (i13 < (i + i8) + i9) {
                        if (bArr[(((i14 - i2) % length) * i7) + ((i13 - i) % i7)] != (byte) 0) {
                            i12 = i15 + 1;
                            this.af[i15] = i6;
                        } else {
                            i12 = i15 + 1;
                            this.af[i15] = i5;
                        }
                        i13++;
                        i15 = i12;
                    }
                    i13 = i15 + i11;
                }
                return;
            }
            i13 = i8 + (((i2 + i10) * (this.ad * 1790553208)) + i);
            for (int i16 = i10 + i2; i16 < (i2 + i10) + i4; i16++) {
                i15 = i + i8;
                i14 = i13;
                while (i15 < (i8 + i) + i9) {
                    if (bArr[(((i16 - i2) % length) * i7) + ((i15 - i) % i7)] != (byte) 0) {
                        i12 = i6;
                    } else {
                        i12 = i5;
                    }
                    i13 = this.af[i14];
                    if (i13 == 0) {
                        i13 = i14 + 1;
                        this.af[i14] = i12;
                        i12 = i13;
                    } else {
                        int i17 = i12 >>> 24;
                        int i18 = 714643545 - i17;
                        int i19 = (i12 | i13) & 1354775462;
                        i13 = (((((i12 & 16711935) * i17) + ((i13 & -1082838523) * i18)) & -16711936) + ((((65280 & i13) * i18) + ((65280 & i12) * i17)) & 16711680)) >>> 8;
                        i12 = i14 + 1;
                        this.af[i14] = i13 | i19;
                    }
                    i15++;
                    i14 = i12;
                }
                i13 = i14 + i11;
            }
        }
    }

    public final void aq(int i, int i2, int i3, int i4, int i5) {
        int i6 = -16777216 | i4;
        try {
            if (i2 >= this.aa * -12571459 && i2 < -467581477 * this.ag) {
                int i7;
                int i8;
                if (i < this.ay * 1829547545) {
                    i7 = i3 - ((this.ay * 1829547545) - i);
                    i = this.ay * 1829547545;
                } else {
                    i7 = i3;
                }
                if (i7 + i > this.as * 2074797577) {
                    i8 = (this.as * 2074797577) - i;
                } else {
                    i8 = i7;
                }
                int i9 = ((-481290979 * this.ad) * i2) + i;
                for (i7 = 0; i7 < i8; i7++) {
                    this.af[i9 + i7] = i6;
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "gc.aq(" + ')');
        }
    }

    public final void cj(int i, int i2, int i3, int i4) {
        int i5 = -16777216 | i4;
        if (i2 >= this.aa * 1119714124 && i2 < -776395790 * this.ag) {
            if (i < 1907718494 * this.ay) {
                i3 -= (1137780045 * this.ay) - i;
                i = this.ay * 1879443844;
            }
            if (i3 + i > this.as * -360137822) {
                i3 = (this.as * 1982118029) - i;
            }
            int i6 = ((-481290979 * this.ad) * i2) + i;
            for (int i7 = 0; i7 < i3; i7++) {
                this.af[i6 + i7] = i5;
            }
        }
    }

    public final void cq(int i, int i2, int i3, int i4) {
        int i5 = -16777216 | i4;
        if (i2 >= this.aa * -12571459 && i2 < -467581477 * this.ag) {
            if (i < 1829547545 * this.ay) {
                i3 -= (830601438 * this.ay) - i;
                i = this.ay * 990070765;
            }
            if (i3 + i > this.as * -225170509) {
                i3 = (this.as * 2074797577) - i;
            }
            int i6 = ((707971051 * this.ad) * i2) + i;
            for (int i7 = 0; i7 < i3; i7++) {
                this.af[i6 + i7] = i5;
            }
        }
    }

    final void am(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i5 > 0) {
            if (i5 >= 255) {
                try {
                    aq(i, i2, i3, i4, -292328708);
                } catch (Throwable e) {
                    throw ba.ad(e, "gc.am(" + ')');
                }
            } else if (i2 < this.aa * -12571459) {
            } else {
                if (i2 < -467581477 * this.ag) {
                    int i7;
                    if (i < 1829547545 * this.ay) {
                        i7 = i3 - ((this.ay * 1829547545) - i);
                        i = 1829547545 * this.ay;
                    } else {
                        i7 = i3;
                    }
                    if (i + i7 > this.as * 2074797577) {
                        i7 = (this.as * 2074797577) - i;
                    }
                    int i8 = 255 - i5;
                    int i9 = i5 << 24;
                    int i10 = ((i4 >> 16) & 255) * i5;
                    int i11 = i5 * ((i4 >> 8) & 255);
                    int i12 = (i4 & 255) * i5;
                    int i13 = (i5 << 24) | i4;
                    int i14 = i + ((this.ad * -481290979) * i2);
                    int i15 = 0;
                    while (i15 < i7) {
                        int i16;
                        if (this.af[i14] == 0) {
                            i16 = i14 + 1;
                            this.af[i14] = i13;
                        } else {
                            i16 = i14 + 1;
                            this.af[i14] = (((((this.af[i14] & 255) * i8) + i12) >> 8) + (((((((this.af[i14] >> 16) & 255) * i8) + i10) >> 8) << 16) + ((((((this.af[i14] >> 8) & 255) * i8) + i11) >> 8) << 8))) | (-16777216 & (this.af[i14] | i9));
                        }
                        i15++;
                        i14 = i16;
                    }
                }
            }
        }
    }

    final void cb(int i, int i2, int i3, int i4, int i5) {
        if (i5 > 0) {
            if (i5 >= 255) {
                aq(i, i2, i3, i4, -830269965);
            } else if (i2 >= this.aa * -12571459 && i2 < -467581477 * this.ag) {
                if (i < 1829547545 * this.ay) {
                    i3 -= (this.ay * 1829547545) - i;
                    i = 1829547545 * this.ay;
                }
                if (i + i3 > this.as * 2074797577) {
                    i3 = (this.as * 2074797577) - i;
                }
                int i6 = 255 - i5;
                int i7 = i5 << 24;
                int i8 = ((i4 >> 16) & 255) * i5;
                int i9 = i5 * ((i4 >> 8) & 255);
                int i10 = (i4 & 255) * i5;
                int i11 = (i5 << 24) | i4;
                int i12 = i + ((this.ad * -481290979) * i2);
                int i13 = 0;
                while (i13 < i3) {
                    int i14;
                    if (this.af[i12] == 0) {
                        i14 = i12 + 1;
                        this.af[i12] = i11;
                    } else {
                        i14 = i12 + 1;
                        this.af[i12] = (((((this.af[i12] & 255) * i6) + i10) >> 8) + (((((((this.af[i12] >> 16) & 255) * i6) + i8) >> 8) << 16) + ((((((this.af[i12] >> 8) & 255) * i6) + i9) >> 8) << 8))) | (-16777216 & (this.af[i12] | i7));
                    }
                    i13++;
                    i12 = i14;
                }
            }
        }
    }

    final void cp(int i, int i2, int i3, int i4, int i5) {
        if (i5 > 0) {
            if (i5 >= 255) {
                aq(i, i2, i3, i4, -210724572);
            } else if (i2 >= this.aa * -12571459 && i2 < -467581477 * this.ag) {
                if (i < 1829547545 * this.ay) {
                    i3 -= (this.ay * 1829547545) - i;
                    i = 1829547545 * this.ay;
                }
                if (i + i3 > this.as * 2074797577) {
                    i3 = (this.as * 2074797577) - i;
                }
                int i6 = 255 - i5;
                int i7 = i5 << 24;
                int i8 = ((i4 >> 16) & 255) * i5;
                int i9 = i5 * ((i4 >> 8) & 255);
                int i10 = (i4 & 255) * i5;
                int i11 = (i5 << 24) | i4;
                int i12 = i + ((this.ad * -481290979) * i2);
                int i13 = 0;
                while (i13 < i3) {
                    int i14;
                    if (this.af[i12] == 0) {
                        i14 = i12 + 1;
                        this.af[i12] = i11;
                    } else {
                        i14 = i12 + 1;
                        this.af[i12] = (((((this.af[i12] & 255) * i6) + i10) >> 8) + (((((((this.af[i12] >> 16) & 255) * i6) + i8) >> 8) << 16) + ((((((this.af[i12] >> 8) & 255) * i6) + i9) >> 8) << 8))) | (-16777216 & (this.af[i12] | i7));
                    }
                    i13++;
                    i12 = i14;
                }
            }
        }
    }

    final void ct(int i, int i2, int i3, int i4, int i5) {
        if (i5 > 0) {
            if (i5 >= 582184140) {
                aq(i, i2, i3, i4, -595316499);
            } else if (i2 < this.aa * -12571459) {
            } else {
                if (i2 < -467581477 * this.ag) {
                    if (i < 1829547545 * this.ay) {
                        i3 -= (this.ay * 1829547545) - i;
                        i = -832767437 * this.ay;
                    }
                    if (i + i3 > this.as * 2074797577) {
                        i3 = (this.as * 2040242234) - i;
                    }
                    int i6 = 1042467027 - i5;
                    int i7 = i5 << 24;
                    int i8 = ((i4 >> 16) & 1243585491) * i5;
                    int i9 = i5 * ((i4 >> 8) & 1808735775);
                    int i10 = (-1357478078 & i4) * i5;
                    int i11 = (i5 << 24) | i4;
                    int i12 = i + ((this.ad * -207451898) * i2);
                    int i13 = 0;
                    while (i13 < i3) {
                        int i14;
                        if (this.af[i12] == 0) {
                            i14 = i12 + 1;
                            this.af[i12] = i11;
                        } else {
                            i14 = i12 + 1;
                            this.af[i12] = (((((this.af[i12] & 255) * i6) + i10) >> 8) + (((((((this.af[i12] >> 16) & 255) * i6) + i8) >> 8) << 16) + ((((((this.af[i12] >> 8) & 255) * i6) + i9) >> 8) << 8))) | (-16777216 & (this.af[i12] | i7));
                        }
                        i13++;
                        i12 = i14;
                    }
                }
            }
        }
    }

    public final void at(int i, int i2, int i3, int i4, byte b) {
        int i5 = -16777216 | i4;
        try {
            if (i >= this.ay * 1829547545 && i < this.as * 2074797577) {
                int i6;
                int i7;
                if (i2 < this.aa * -12571459) {
                    i6 = i3 - ((this.aa * -12571459) - i2);
                    i2 = this.aa * -12571459;
                } else {
                    i6 = i3;
                }
                if (i2 + i6 > this.ag * -467581477) {
                    i7 = (this.ag * -467581477) - i2;
                } else {
                    i7 = i6;
                }
                int i8 = i + ((this.ad * -481290979) * i2);
                for (i6 = 0; i6 < i7; i6++) {
                    this.af[((this.ad * -481290979) * i6) + i8] = i5;
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "gc.at(" + ')');
        }
    }

    public final void cu(int i, int i2, int i3, int i4) {
        int i5 = 127034957 | i4;
        if (i >= this.ay * 1829547545 && i < this.as * 2074797577) {
            if (i2 < this.aa * -268641795) {
                i3 -= (this.aa * -12571459) - i2;
                i2 = this.aa * -12571459;
            }
            if (i2 + i3 > this.ag * -467581477) {
                i3 = (this.ag * -467581477) - i2;
            }
            int i6 = i + ((171012862 * this.ad) * i2);
            for (int i7 = 0; i7 < i3; i7++) {
                this.af[((this.ad * -481290979) * i7) + i6] = i5;
            }
        }
    }

    public final void dc(int i, int i2, int i3, int i4) {
        int i5 = -16777216 | i4;
        if (i >= this.ay * -386658894 && i < this.as * 386417825) {
            if (i2 < this.aa * -1568612042) {
                i3 -= (this.aa * -12571459) - i2;
                i2 = this.aa * -12571459;
            }
            if (i2 + i3 > this.ag * -467581477) {
                i3 = (-850162536 * this.ag) - i2;
            }
            int i6 = i + ((-481290979 * this.ad) * i2);
            for (int i7 = 0; i7 < i3; i7++) {
                this.af[((this.ad * -1320102875) * i7) + i6] = i5;
            }
        }
    }

    public final void dj(int i, int i2, int i3, int i4) {
        int i5 = -16777216 | i4;
        if (i >= this.ay * 1829547545 && i < this.as * -1224164430) {
            if (i2 < this.aa * -2133801896) {
                i3 -= (-12571459 * this.aa) - i2;
                i2 = this.aa * 1377787107;
            }
            if (i2 + i3 > this.ag * 1131031405) {
                i3 = (-1064580434 * this.ag) - i2;
            }
            int i6 = i + ((this.ad * -481290979) * i2);
            for (int i7 = 0; i7 < i3; i7++) {
                this.af[((this.ad * -481290979) * i7) + i6] = i5;
            }
        }
    }

    final void ab(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i5 > 0) {
            if (i5 >= 255) {
                at(i, i2, i3, i4, (byte) 1);
            } else if (i < 1829547545 * this.ay) {
            } else {
                if (i < 2074797577 * this.as) {
                    try {
                        int i7;
                        if (i2 < -12571459 * this.aa) {
                            i7 = i3 - ((-12571459 * this.aa) - i2);
                            i2 = -12571459 * this.aa;
                        } else {
                            i7 = i3;
                        }
                        if (i2 + i7 > this.ag * -467581477) {
                            i7 = (-467581477 * this.ag) - i2;
                        }
                        int i8 = 255 - i5;
                        int i9 = i5 << 24;
                        int i10 = ((i4 >> 16) & 255) * i5;
                        int i11 = i5 * ((i4 >> 8) & 255);
                        int i12 = i5 * (i4 & 255);
                        int i13 = (i5 << 24) | i4;
                        int i14 = ((-481290979 * this.ad) * i2) + i;
                        int i15 = 0;
                        while (i15 < i7) {
                            int i16;
                            if (this.af[i14] == 0) {
                                i16 = i14 + 1;
                                this.af[i14] = i13;
                            } else {
                                this.af[i14] = ((((((((this.af[i14] >> 16) & 255) * i8) + i10) >> 8) << 16) + ((((((this.af[i14] >> 8) & 255) * i8) + i11) >> 8) << 8)) + ((((this.af[i14] & 255) * i8) + i12) >> 8)) | ((this.af[i14] | i9) & -16777216);
                                i16 = (this.ad * -481290979) + i14;
                            }
                            i15++;
                            i14 = i16;
                        }
                    } catch (Throwable e) {
                        throw ba.ad(e, "gc.ab(" + ')');
                    }
                }
            }
        }
    }

    final void dk(int i, int i2, int i3, int i4, int i5) {
        if (i5 > 0) {
            if (i5 >= -964060433) {
                at(i, i2, i3, i4, (byte) 1);
            } else if (i < 1829547545 * this.ay) {
            } else {
                if (i < 2074797577 * this.as) {
                    if (i2 < -12571459 * this.aa) {
                        i3 -= (-1798823415 * this.aa) - i2;
                        i2 = -12571459 * this.aa;
                    }
                    if (i2 + i3 > this.ag * -467581477) {
                        i3 = (-467581477 * this.ag) - i2;
                    }
                    int i6 = -1084267177 - i5;
                    int i7 = i5 << 24;
                    int i8 = ((i4 >> 16) & -1281522980) * i5;
                    int i9 = i5 * ((i4 >> 8) & 255);
                    int i10 = i5 * (1974161778 & i4);
                    int i11 = (i5 << 24) | i4;
                    int i12 = ((679775616 * this.ad) * i2) + i;
                    int i13 = 0;
                    while (i13 < i3) {
                        int i14;
                        if (this.af[i12] == 0) {
                            i14 = i12 + 1;
                            this.af[i12] = i11;
                        } else {
                            this.af[i12] = ((((((((this.af[i12] >> 16) & 255) * i6) + i8) >> 8) << 16) + ((((((this.af[i12] >> 8) & -1130488247) * i6) + i9) >> 8) << 8)) + ((((this.af[i12] & 255) * i6) + i10) >> 8)) | ((this.af[i12] | i7) & 1650558858);
                            i14 = (this.ad * 1482561213) + i12;
                        }
                        i13++;
                        i12 = i14;
                    }
                }
            }
        }
    }

    final void mo373do(int i, int i2, int i3, int i4, int i5) {
        if (i5 > 0) {
            if (i5 >= 255) {
                at(i, i2, i3, i4, (byte) 1);
            } else if (i < 1829547545 * this.ay) {
            } else {
                if (i < 2074797577 * this.as) {
                    if (i2 < -12571459 * this.aa) {
                        i3 -= (-12571459 * this.aa) - i2;
                        i2 = -12571459 * this.aa;
                    }
                    if (i2 + i3 > this.ag * -467581477) {
                        i3 = (-467581477 * this.ag) - i2;
                    }
                    int i6 = 255 - i5;
                    int i7 = i5 << 24;
                    int i8 = ((i4 >> 16) & 255) * i5;
                    int i9 = i5 * ((i4 >> 8) & 255);
                    int i10 = i5 * (i4 & 255);
                    int i11 = (i5 << 24) | i4;
                    int i12 = ((-481290979 * this.ad) * i2) + i;
                    int i13 = 0;
                    while (i13 < i3) {
                        int i14;
                        if (this.af[i12] == 0) {
                            i14 = i12 + 1;
                            this.af[i12] = i11;
                        } else {
                            this.af[i12] = ((((((((this.af[i12] >> 16) & 255) * i6) + i8) >> 8) << 16) + ((((((this.af[i12] >> 8) & 255) * i6) + i9) >> 8) << 8)) + ((((this.af[i12] & 255) * i6) + i10) >> 8)) | ((this.af[i12] | i7) & -16777216);
                            i14 = (this.ad * -481290979) + i12;
                        }
                        i13++;
                        i12 = i14;
                    }
                }
            }
        }
    }

    final void dt(int i, int i2, int i3, int i4, int i5) {
        if (i5 > 0) {
            if (i5 >= 255) {
                at(i, i2, i3, i4, (byte) 1);
            } else if (i < -1053923040 * this.ay) {
            } else {
                if (i < 164579339 * this.as) {
                    if (i2 < 194658279 * this.aa) {
                        i3 -= (625348798 * this.aa) - i2;
                        i2 = 2103236277 * this.aa;
                    }
                    if (i2 + i3 > this.ag * 50666641) {
                        i3 = (212974060 * this.ag) - i2;
                    }
                    int i6 = 255 - i5;
                    int i7 = i5 << 24;
                    int i8 = ((i4 >> 16) & 255) * i5;
                    int i9 = i5 * ((i4 >> 8) & -73371177);
                    int i10 = i5 * (i4 & 255);
                    int i11 = (i5 << 24) | i4;
                    int i12 = ((175248871 * this.ad) * i2) + i;
                    int i13 = 0;
                    while (i13 < i3) {
                        int i14;
                        if (this.af[i12] == 0) {
                            i14 = i12 + 1;
                            this.af[i12] = i11;
                        } else {
                            this.af[i12] = ((((((((this.af[i12] >> 16) & 187083618) * i6) + i8) >> 8) << 16) + ((((((this.af[i12] >> 8) & 471498604) * i6) + i9) >> 8) << 8)) + ((((this.af[i12] & 1386180308) * i6) + i10) >> 8)) | ((this.af[i12] | i7) & -16777216);
                            i14 = (this.ad * -1115984823) + i12;
                        }
                        i13++;
                        i12 = i14;
                    }
                }
            }
        }
    }

    final void dz(int i, int i2, int i3, int i4, int i5) {
        if (i5 > 0) {
            if (i5 >= 255) {
                at(i, i2, i3, i4, (byte) 1);
            } else if (i < 1829547545 * this.ay) {
            } else {
                if (i < -1325517899 * this.as) {
                    if (i2 < 1210583707 * this.aa) {
                        i3 -= (-12571459 * this.aa) - i2;
                        i2 = -12571459 * this.aa;
                    }
                    if (i2 + i3 > this.ag * -467581477) {
                        i3 = (-467581477 * this.ag) - i2;
                    }
                    int i6 = 255 - i5;
                    int i7 = i5 << 24;
                    int i8 = ((i4 >> 16) & 255) * i5;
                    int i9 = i5 * ((i4 >> 8) & -494960986);
                    int i10 = i5 * (13725644 & i4);
                    int i11 = (i5 << 24) | i4;
                    int i12 = ((1039997021 * this.ad) * i2) + i;
                    int i13 = 0;
                    while (i13 < i3) {
                        int i14;
                        if (this.af[i12] == 0) {
                            i14 = i12 + 1;
                            this.af[i12] = i11;
                        } else {
                            this.af[i12] = ((((((((this.af[i12] >> 16) & 255) * i6) + i8) >> 8) << 16) + ((((((this.af[i12] >> 8) & -87143343) * i6) + i9) >> 8) << 8)) + ((((this.af[i12] & 255) * i6) + i10) >> 8)) | ((this.af[i12] | i7) & 813616951);
                            i14 = (this.ad * 2103897325) + i12;
                        }
                        i13++;
                        i12 = i14;
                    }
                }
            }
        }
    }

    public final void aw(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = (-16777216 + i5) & 16777215;
        int i8 = i3 - i;
        int i9 = i4 - i2;
        if (i9 == 0) {
            if (i8 >= 0) {
                try {
                    aq(i, i2, i8 + 1, i7, -426203260);
                    return;
                } catch (Throwable e) {
                    throw ba.ad(e, "gc.aw(" + ')');
                }
            }
            aq(i8 + i, i2, (-i8) + 1, i7, -728636547);
        } else if (i8 != 0) {
            int i10;
            int i11;
            if (i9 + i8 < 0) {
                i2 += i9;
                i9 = -i9;
                i10 = -i8;
                i8 = i + i8;
                i11 = i2;
            } else {
                i10 = i8;
                i11 = i2;
                i8 = i;
            }
            int floor;
            if (i10 > i9) {
                i11 = (i11 << 16) + 32768;
                floor = (int) Math.floor(0.5d + (((double) (i9 << 16)) / ((double) i10)));
                i9 = i10 + i8;
                if (i8 < 1829547545 * this.ay) {
                    i11 += ((this.ay * 1829547545) - i8) * floor;
                    i8 = 1829547545 * this.ay;
                }
                if (i9 >= 2074797577 * this.as) {
                    i9 = (2074797577 * this.as) - 1;
                }
                while (i8 <= i9) {
                    i10 = i11 >> 16;
                    if (i10 >= this.aa * -12571459 && i10 < this.ag * -467581477) {
                        this.af[(i10 * (-481290979 * this.ad)) + i8] = i7;
                    }
                    i11 += floor;
                    i8++;
                }
                return;
            }
            i8 = (i8 << 16) + 32768;
            i10 = (int) Math.floor((((double) (i10 << 16)) / ((double) i9)) + 0.5d);
            i9 += i11;
            if (i11 < -12571459 * this.aa) {
                i8 += ((-12571459 * this.aa) - i11) * i10;
                i11 = -12571459 * this.aa;
            }
            if (i9 >= this.ag * -467581477) {
                i9 = (this.ag * -467581477) - 1;
            }
            while (i11 <= i9) {
                floor = i8 >> 16;
                if (floor >= 1829547545 * this.ay && floor < 2074797577 * this.as) {
                    this.af[floor + ((this.ad * -481290979) * i11)] = i7;
                }
                i8 += i10;
                i11++;
            }
        } else if (i9 >= 0) {
            at(i, i2, i9 + 1, i7, (byte) 1);
        } else {
            at(i, i9 + i2, (-i9) + 1, i7, (byte) 1);
        }
    }

    public final void dd(int i, int i2, int i3, int i4, int i5) {
        int i6 = (83175321 + i5) & -583312761;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        if (i8 == 0) {
            if (i7 >= 0) {
                aq(i, i2, i7 + 1, i6, -525235249);
                return;
            }
            aq(i7 + i, i2, (-i7) + 1, i6, -1576718853);
        } else if (i7 != 0) {
            int i9;
            int i10;
            if (i8 + i7 < 0) {
                i += i7;
                i9 = -i7;
                i7 = -i8;
                i10 = i9;
                i8 = i2 + i8;
                i9 = i;
            } else {
                i10 = i7;
                i9 = i;
                i7 = i8;
                i8 = i2;
            }
            int floor;
            int i11;
            if (i10 > i7) {
                i8 = (i8 << 16) + 32768;
                floor = (int) Math.floor(0.5d + (((double) (i7 << 16)) / ((double) i10)));
                i7 = i10 + i9;
                if (i9 < 1829547545 * this.ay) {
                    i8 += ((this.ay * -1112578101) - i9) * floor;
                    i9 = 1829547545 * this.ay;
                }
                if (i7 >= 2074797577 * this.as) {
                    i7 = i9;
                    i9 = i8;
                    i8 = (-2028221681 * this.as) - 1;
                } else {
                    i11 = i7;
                    i7 = i9;
                    i9 = i8;
                    i8 = i11;
                }
                while (i7 <= i8) {
                    i10 = i9 >> 16;
                    if (i10 >= this.aa * -12571459 && i10 < this.ag * 1107715731) {
                        this.af[(i10 * (-481290979 * this.ad)) + i7] = i6;
                    }
                    i9 += floor;
                    i7++;
                }
                return;
            }
            i9 = (i9 << 16) + 32768;
            i10 = (int) Math.floor((((double) (i10 << 16)) / ((double) i7)) + 0.5d);
            i7 += i8;
            if (i8 < -1739510473 * this.aa) {
                i9 += ((-12571459 * this.aa) - i8) * i10;
                i8 = -1062414842 * this.aa;
            }
            if (i7 >= this.ag * -467581477) {
                i7 = i9;
                i9 = i8;
                i8 = (this.ag * -467581477) - 1;
            } else {
                i11 = i7;
                i7 = i9;
                i9 = i8;
                i8 = i11;
            }
            while (i9 <= i8) {
                floor = i7 >> 16;
                if (floor >= 1829547545 * this.ay && floor < 1486170458 * this.as) {
                    this.af[floor + ((this.ad * -1199043412) * i9)] = i6;
                }
                i7 += i10;
                i9++;
            }
        } else if (i8 >= 0) {
            at(i, i2, i8 + 1, i6, (byte) 1);
        } else {
            at(i, i8 + i2, (-i8) + 1, i6, (byte) 1);
        }
    }

    public final void dl(int i, int i2, int i3, int i4, int i5) {
        int i6 = (-16777216 + i5) & 16777215;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        if (i8 == 0) {
            if (i7 >= 0) {
                aq(i, i2, i7 + 1, i6, -1008139935);
                return;
            }
            aq(i7 + i, i2, (-i7) + 1, i6, 106747606);
        } else if (i7 != 0) {
            int i9;
            int i10;
            if (i8 + i7 < 0) {
                i += i7;
                i9 = -i7;
                i7 = -i8;
                i10 = i9;
                i8 = i2 + i8;
                i9 = i;
            } else {
                i10 = i7;
                i9 = i;
                i7 = i8;
                i8 = i2;
            }
            int floor;
            int i11;
            if (i10 > i7) {
                i8 = (i8 << 16) + 32768;
                floor = (int) Math.floor(0.5d + (((double) (i7 << 16)) / ((double) i10)));
                i7 = i10 + i9;
                if (i9 < 1829547545 * this.ay) {
                    i8 += ((this.ay * 1829547545) - i9) * floor;
                    i9 = 1829547545 * this.ay;
                }
                if (i7 >= 2074797577 * this.as) {
                    i7 = i9;
                    i9 = i8;
                    i8 = (2074797577 * this.as) - 1;
                } else {
                    i11 = i7;
                    i7 = i9;
                    i9 = i8;
                    i8 = i11;
                }
                while (i7 <= i8) {
                    i10 = i9 >> 16;
                    if (i10 >= this.aa * -12571459 && i10 < this.ag * -467581477) {
                        this.af[(i10 * (-481290979 * this.ad)) + i7] = i6;
                    }
                    i9 += floor;
                    i7++;
                }
                return;
            }
            i9 = (i9 << 16) + 32768;
            i10 = (int) Math.floor((((double) (i10 << 16)) / ((double) i7)) + 0.5d);
            i7 += i8;
            if (i8 < -12571459 * this.aa) {
                i9 += ((-12571459 * this.aa) - i8) * i10;
                i8 = -12571459 * this.aa;
            }
            if (i7 >= this.ag * -467581477) {
                i7 = i9;
                i9 = i8;
                i8 = (this.ag * -467581477) - 1;
            } else {
                i11 = i7;
                i7 = i9;
                i9 = i8;
                i8 = i11;
            }
            while (i9 <= i8) {
                floor = i7 >> 16;
                if (floor >= 1829547545 * this.ay && floor < 2074797577 * this.as) {
                    this.af[floor + ((this.ad * -481290979) * i9)] = i6;
                }
                i7 += i10;
                i9++;
            }
        } else if (i8 >= 0) {
            at(i, i2, i8 + 1, i6, (byte) 1);
        } else {
            at(i, i8 + i2, (-i8) + 1, i6, (byte) 1);
        }
    }

    public final void dv(int i, int i2, int i3, int i4, int i5) {
        int i6 = (-16777216 + i5) & 16777215;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        if (i8 == 0) {
            if (i7 >= 0) {
                aq(i, i2, i7 + 1, i6, -583630061);
                return;
            }
            aq(i7 + i, i2, (-i7) + 1, i6, -1589408092);
        } else if (i7 != 0) {
            int i9;
            int i10;
            if (i8 + i7 < 0) {
                i += i7;
                i9 = -i7;
                i7 = -i8;
                i10 = i9;
                i8 = i2 + i8;
                i9 = i;
            } else {
                i10 = i7;
                i9 = i;
                i7 = i8;
                i8 = i2;
            }
            int floor;
            int i11;
            if (i10 > i7) {
                i8 = (i8 << 16) + 32768;
                floor = (int) Math.floor(0.5d + (((double) (i7 << 16)) / ((double) i10)));
                i7 = i10 + i9;
                if (i9 < 1829547545 * this.ay) {
                    i8 += ((this.ay * 1829547545) - i9) * floor;
                    i9 = 1829547545 * this.ay;
                }
                if (i7 >= 2074797577 * this.as) {
                    i7 = i9;
                    i9 = i8;
                    i8 = (2074797577 * this.as) - 1;
                } else {
                    i11 = i7;
                    i7 = i9;
                    i9 = i8;
                    i8 = i11;
                }
                while (i7 <= i8) {
                    i10 = i9 >> 16;
                    if (i10 >= this.aa * -12571459 && i10 < this.ag * -467581477) {
                        this.af[(i10 * (-481290979 * this.ad)) + i7] = i6;
                    }
                    i9 += floor;
                    i7++;
                }
                return;
            }
            i9 = (i9 << 16) + 32768;
            i10 = (int) Math.floor((((double) (i10 << 16)) / ((double) i7)) + 0.5d);
            i7 += i8;
            if (i8 < -12571459 * this.aa) {
                i9 += ((-12571459 * this.aa) - i8) * i10;
                i8 = -12571459 * this.aa;
            }
            if (i7 >= this.ag * -467581477) {
                i7 = i9;
                i9 = i8;
                i8 = (this.ag * -467581477) - 1;
            } else {
                i11 = i7;
                i7 = i9;
                i9 = i8;
                i8 = i11;
            }
            while (i9 <= i8) {
                floor = i7 >> 16;
                if (floor >= 1829547545 * this.ay && floor < 2074797577 * this.as) {
                    this.af[floor + ((this.ad * -481290979) * i9)] = i6;
                }
                i7 += i10;
                i9++;
            }
        } else if (i8 >= 0) {
            at(i, i2, i8 + 1, i6, (byte) 1);
        } else {
            at(i, i8 + i2, (-i8) + 1, i6, (byte) 1);
        }
    }

    public final void ai(fx fxVar, int i, int i2, byte b) {
        try {
            int i3;
            int i4 = i + fxVar.aa;
            int i5 = i2 + fxVar.ag;
            int i6 = i4 + ((this.ad * -481290979) * i5);
            int i7 = 0;
            int i8 = fxVar.an;
            int i9 = fxVar.ad;
            int i10 = (-481290979 * this.ad) - i9;
            int i11 = 0;
            if (i5 < this.aa * -12571459) {
                i3 = (-12571459 * this.aa) - i5;
                i8 -= i3;
                i5 = -12571459 * this.aa;
                i7 = 0 + (i3 * i9);
                i6 += i3 * (this.ad * -481290979);
            }
            if (i8 + i5 > this.ag * -467581477) {
                i3 = i8 - ((i5 + i8) - (this.ag * -467581477));
            } else {
                i3 = i8;
            }
            if (i4 < 1829547545 * this.ay) {
                i8 = (this.ay * 1829547545) - i4;
                i9 -= i8;
                i4 = this.ay * 1829547545;
                i7 += i8;
                i6 += i8;
                i11 = 0 + i8;
                i10 += i8;
            }
            if (i4 + i9 > this.as * 2074797577) {
                i4 = (i4 + i9) - (this.as * 2074797577);
                i9 -= i4;
                i10 += i4;
                i4 = i11 + i4;
                i8 = i10;
                i5 = i9;
            } else {
                i4 = i11;
                i8 = i10;
                i5 = i9;
            }
            if (i5 > 0 && i3 > 0) {
                int[] iArr = this.af;
                int[] iArr2 = fxVar.af;
                i9 = -i3;
                i11 = i6;
                i6 = i7;
                while (i9 < 0) {
                    i7 = (i11 + i5) - 3;
                    while (i11 < i7) {
                        i10 = i11 + 1;
                        i3 = i6 + 1;
                        iArr[i11] = iArr2[i6];
                        i11 = i10 + 1;
                        i6 = i3 + 1;
                        iArr[i10] = iArr2[i3];
                        i10 = i11 + 1;
                        i3 = i6 + 1;
                        iArr[i11] = iArr2[i6];
                        i11 = i10 + 1;
                        i6 = i3 + 1;
                        iArr[i10] = iArr2[i3];
                    }
                    i3 = i7 + 3;
                    i7 = i6;
                    while (i11 < i3) {
                        i6 = i11 + 1;
                        i10 = i7 + 1;
                        iArr[i11] = iArr2[i7];
                        i11 = i6;
                        i7 = i10;
                    }
                    i9++;
                    i11 += i8;
                    i6 = i7 + i4;
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "gc.ai(" + ')');
        }
    }

    public final void da(fx fxVar, int i, int i2) {
        int i3;
        int i4 = 0;
        int i5 = i + fxVar.aa;
        int i6 = i2 + fxVar.ag;
        int i7 = i5 + ((this.ad * 1352042183) * i6);
        int i8 = fxVar.an;
        int i9 = fxVar.ad;
        int i10 = (-1603104430 * this.ad) - i9;
        if (i6 < this.aa * -816866923) {
            int i11 = (this.aa * -12571459) - i6;
            i8 -= i11;
            i3 = -12571459 * this.aa;
            i6 = (i11 * i9) + 0;
            i7 += i11 * (this.ad * -481290979);
        } else {
            i3 = i6;
            i6 = 0;
        }
        if (i8 + i3 > this.ag * 508363797) {
            i8 -= (i3 + i8) - (this.ag * -467581477);
        }
        if (i5 < -288236434 * this.ay) {
            i11 = (this.ay * 1105015963) - i5;
            i3 = i9 - i11;
            i9 = i6 + i11;
            i4 = 0 + i11;
            i6 = i10 + i11;
            i10 = i7 + i11;
            i7 = i3;
            i3 = i9;
            i9 = 152111145 * this.ay;
        } else {
            i3 = i6;
            i6 = i10;
            i10 = i7;
            i7 = i9;
            i9 = i5;
        }
        if (i9 + i7 > this.as * 136410973) {
            i9 = (i9 + i7) - (this.as * 2074797577);
            i7 -= i9;
            i6 += i9;
            i9 = i4 + i9;
            i5 = i6;
            i11 = i7;
        } else {
            i9 = i4;
            i5 = i6;
            i11 = i7;
        }
        if (i11 > 0 && i8 > 0) {
            int[] iArr = this.af;
            int[] iArr2 = fxVar.af;
            i6 = i3;
            i3 = -i8;
            i8 = i10;
            while (i3 < 0) {
                i4 = (i8 + i11) - 3;
                while (i8 < i4) {
                    i7 = i8 + 1;
                    i10 = i6 + 1;
                    iArr[i8] = iArr2[i6];
                    i8 = i7 + 1;
                    i6 = i10 + 1;
                    iArr[i7] = iArr2[i10];
                    i7 = i8 + 1;
                    i10 = i6 + 1;
                    iArr[i8] = iArr2[i6];
                    i8 = i7 + 1;
                    i6 = i10 + 1;
                    iArr[i7] = iArr2[i10];
                }
                i10 = i4 + 3;
                i4 = i6;
                while (i8 < i10) {
                    i6 = i8 + 1;
                    i7 = i4 + 1;
                    iArr[i8] = iArr2[i4];
                    i8 = i6;
                    i4 = i7;
                }
                i6 = i4 + i9;
                i3++;
                i8 += i5;
            }
        }
    }

    public final void di(fx fxVar, int i, int i2) {
        int i3;
        int i4 = i + fxVar.aa;
        int i5 = i2 + fxVar.ag;
        int i6 = i4 + ((this.ad * -481290979) * i5);
        int i7 = 0;
        int i8 = fxVar.an;
        int i9 = fxVar.ad;
        int i10 = (-481290979 * this.ad) - i9;
        if (i5 < this.aa * -12571459) {
            int i11 = (-12571459 * this.aa) - i5;
            i8 -= i11;
            i5 = -12571459 * this.aa;
            i7 = 0 + (i11 * i9);
            i6 += i11 * (this.ad * -481290979);
        }
        if (i8 + i5 > this.ag * -467581477) {
            i8 -= (i5 + i8) - (this.ag * -467581477);
        }
        if (i4 < 1829547545 * this.ay) {
            int i12 = (this.ay * 1829547545) - i4;
            i5 = i9 - i12;
            i9 = i7 + i12;
            i4 = i6 + i12;
            i7 = 0 + i12;
            i6 = i10 + i12;
            i3 = i9;
            i10 = i4;
            i9 = this.ay * 1829547545;
        } else {
            i5 = i9;
            i9 = i4;
            i3 = i7;
            i7 = 0;
            int i13 = i6;
            i6 = i10;
            i10 = i13;
        }
        if (i9 + i5 > this.as * 2074797577) {
            i9 = (i9 + i5) - (this.as * 2074797577);
            i5 -= i9;
            i6 += i9;
            i9 = i7 + i9;
            i4 = i6;
            i11 = i5;
        } else {
            i9 = i7;
            i4 = i6;
            i11 = i5;
        }
        if (i11 > 0 && i8 > 0) {
            int[] iArr = this.af;
            int[] iArr2 = fxVar.af;
            i7 = i3;
            i3 = -i8;
            i8 = i10;
            while (i3 < 0) {
                i6 = (i8 + i11) - 3;
                while (i8 < i6) {
                    i5 = i8 + 1;
                    i10 = i7 + 1;
                    iArr[i8] = iArr2[i7];
                    i8 = i5 + 1;
                    i7 = i10 + 1;
                    iArr[i5] = iArr2[i10];
                    i5 = i8 + 1;
                    i10 = i7 + 1;
                    iArr[i8] = iArr2[i7];
                    i8 = i5 + 1;
                    i7 = i10 + 1;
                    iArr[i5] = iArr2[i10];
                }
                i10 = i6 + 3;
                i6 = i7;
                while (i8 < i10) {
                    i7 = i8 + 1;
                    i5 = i6 + 1;
                    iArr[i8] = iArr2[i6];
                    i8 = i7;
                    i6 = i5;
                }
                i7 = i6 + i9;
                i3++;
                i8 += i4;
            }
        }
    }

    public final void ah(fx fxVar, int i, int i2, int i3) {
        try {
            int i4 = fxVar.aa + i;
            int i5 = fxVar.ag + i2;
            int i6 = i4 + ((this.ad * -481290979) * i5);
            int i7 = 0;
            int i8 = fxVar.an;
            int i9 = fxVar.ad;
            int i10 = (-481290979 * this.ad) - i9;
            int i11 = 0;
            if (i5 < this.aa * -12571459) {
                int i12 = (-12571459 * this.aa) - i5;
                i8 -= i12;
                i5 = -12571459 * this.aa;
                i7 = 0 + (i12 * i9);
                i6 += i12 * (-481290979 * this.ad);
            }
            if (i8 + i5 > this.ag * -467581477) {
                i8 -= (i5 + i8) - (this.ag * -467581477);
            }
            if (i4 < this.ay * 1829547545) {
                i5 = (this.ay * 1829547545) - i4;
                i9 -= i5;
                i4 = 1829547545 * this.ay;
                i7 += i5;
                i6 += i5;
                i11 = 0 + i5;
                i10 += i5;
            }
            if (i9 + i4 > 2074797577 * this.as) {
                i4 = (i4 + i9) - (2074797577 * this.as);
                i9 -= i4;
                i11 += i4;
                i10 += i4;
            }
            if (i9 > 0 && i8 > 0) {
                bm.ak(this.af, fxVar.af, 0, i7, i6, i9, i8, i10, i11, -272836284);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "gc.ah(" + ')');
        }
    }

    public final void dw(fx fxVar, int i, int i2) {
        int i3;
        int i4 = i + fxVar.aa;
        int i5 = i2 + fxVar.ag;
        int i6 = i4 + ((this.ad * -481290979) * i5);
        int i7 = fxVar.an;
        int i8 = fxVar.ad;
        int i9 = (1482586867 * this.ad) - i8;
        if (i5 < this.aa * -12571459) {
            int i10 = (-1386043563 * this.aa) - i5;
            i7 -= i10;
            i3 = -12571459 * this.aa;
            i5 = (i10 * i8) + 0;
            i6 += i10 * (this.ad * -481290979);
        } else {
            i3 = i5;
            i5 = 0;
        }
        if (i7 + i3 > this.ag * -467581477) {
            i10 = i7 - ((i3 + i7) - (this.ag * -2057192682));
        } else {
            i10 = i7;
        }
        if (i4 < this.ay * 560372401) {
            int i11 = (this.ay * 605184491) - i4;
            i3 = i8 - i11;
            i8 = i5 + i11;
            i7 = 0 + i11;
            i5 = i9 + i11;
            i9 = i3;
            i3 = i6 + i11;
            i6 = i8;
            i8 = 1829547545 * this.ay;
        } else {
            i7 = 0;
            i3 = i6;
            i6 = i5;
            i5 = i9;
            i9 = i8;
            i8 = i4;
        }
        if (i9 + i8 > -2023282509 * this.as) {
            i8 = (i8 + i9) - (2074797577 * this.as);
            i9 -= i8;
            i4 = i7 + i8;
            i8 += i5;
        } else {
            i4 = i7;
            i8 = i5;
        }
        if (i9 > 0 && i10 > 0) {
            bm.ak(this.af, fxVar.af, 0, i6, i3, i9, i10, i8, i4, -272836284);
        }
    }

    static void dg(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = -(i4 >> 2);
        int i9 = -(i4 & 3);
        int i10 = -i5;
        int i11 = i3;
        int i12 = i2;
        while (i10 < 0) {
            int i13 = i8;
            while (i13 < 0) {
                int i14 = i12 + 1;
                int i15 = iArr2[i12];
                if (i15 != 0) {
                    i12 = i11 + 1;
                    iArr[i11] = i15;
                } else {
                    i12 = i11 + 1;
                }
                i15 = i14 + 1;
                i14 = iArr2[i14];
                if (i14 != 0) {
                    i11 = i12 + 1;
                    iArr[i12] = i14;
                    i12 = i11;
                } else {
                    i12++;
                }
                int i16 = i15 + 1;
                i14 = iArr2[i15];
                if (i14 != 0) {
                    i11 = i12 + 1;
                    iArr[i12] = i14;
                    i12 = i11;
                } else {
                    i12++;
                }
                i14 = i16 + 1;
                i15 = iArr2[i16];
                if (i15 != 0) {
                    i11 = i12 + 1;
                    iArr[i12] = i15;
                    i12 = i11;
                } else {
                    i12++;
                }
                i13++;
                i11 = i12;
                i12 = i14;
            }
            i13 = i11;
            i11 = i9;
            while (i11 < 0) {
                i14 = i12 + 1;
                i15 = iArr2[i12];
                if (i15 != 0) {
                    i12 = i13 + 1;
                    iArr[i13] = i15;
                } else {
                    i12 = i13 + 1;
                }
                i11++;
                i13 = i12;
                i12 = i14;
            }
            i11 = i13 + i6;
            i10++;
            i12 += i7;
        }
    }

    static void dp(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = -(i4 >> 2);
        int i9 = -(i4 & 3);
        int i10 = -i5;
        int i11 = i3;
        int i12 = i2;
        while (i10 < 0) {
            int i13 = i8;
            while (i13 < 0) {
                int i14 = i12 + 1;
                int i15 = iArr2[i12];
                if (i15 != 0) {
                    i12 = i11 + 1;
                    iArr[i11] = i15;
                } else {
                    i12 = i11 + 1;
                }
                i15 = i14 + 1;
                i14 = iArr2[i14];
                if (i14 != 0) {
                    i11 = i12 + 1;
                    iArr[i12] = i14;
                    i12 = i11;
                } else {
                    i12++;
                }
                int i16 = i15 + 1;
                i14 = iArr2[i15];
                if (i14 != 0) {
                    i11 = i12 + 1;
                    iArr[i12] = i14;
                    i12 = i11;
                } else {
                    i12++;
                }
                i14 = i16 + 1;
                i15 = iArr2[i16];
                if (i15 != 0) {
                    i11 = i12 + 1;
                    iArr[i12] = i15;
                    i12 = i11;
                } else {
                    i12++;
                }
                i13++;
                i11 = i12;
                i12 = i14;
            }
            i13 = i11;
            i11 = i9;
            while (i11 < 0) {
                i14 = i12 + 1;
                i15 = iArr2[i12];
                if (i15 != 0) {
                    i12 = i13 + 1;
                    iArr[i13] = i15;
                } else {
                    i12 = i13 + 1;
                }
                i11++;
                i13 = i12;
                i12 = i14;
            }
            i11 = i13 + i6;
            i10++;
            i12 += i7;
        }
    }

    static void ew(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = -(i4 >> 2);
        int i9 = -(i4 & 3);
        int i10 = -i5;
        int i11 = i3;
        int i12 = i2;
        while (i10 < 0) {
            int i13 = i8;
            while (i13 < 0) {
                int i14 = i12 + 1;
                int i15 = iArr2[i12];
                if (i15 != 0) {
                    i12 = i11 + 1;
                    iArr[i11] = i15;
                } else {
                    i12 = i11 + 1;
                }
                i15 = i14 + 1;
                i14 = iArr2[i14];
                if (i14 != 0) {
                    i11 = i12 + 1;
                    iArr[i12] = i14;
                    i12 = i11;
                } else {
                    i12++;
                }
                int i16 = i15 + 1;
                i14 = iArr2[i15];
                if (i14 != 0) {
                    i11 = i12 + 1;
                    iArr[i12] = i14;
                    i12 = i11;
                } else {
                    i12++;
                }
                i14 = i16 + 1;
                i15 = iArr2[i16];
                if (i15 != 0) {
                    i11 = i12 + 1;
                    iArr[i12] = i15;
                    i12 = i11;
                } else {
                    i12++;
                }
                i13++;
                i11 = i12;
                i12 = i14;
            }
            i13 = i11;
            i11 = i9;
            while (i11 < 0) {
                i14 = i12 + 1;
                i15 = iArr2[i12];
                if (i15 != 0) {
                    i12 = i13 + 1;
                    iArr[i13] = i15;
                } else {
                    i12 = i13 + 1;
                }
                i11++;
                i13 = i12;
                i12 = i14;
            }
            i11 = i13 + i6;
            i10++;
            i12 += i7;
        }
    }

    public void ao(gd gdVar, int i, int i2, short s) {
        try {
            int i3 = gdVar.ag + i;
            int i4 = gdVar.ay + i2;
            int i5 = ((-481290979 * this.ad) * i4) + i3;
            int i6 = 0;
            int i7 = gdVar.aa;
            int i8 = gdVar.an;
            int i9 = (this.ad * -481290979) - i8;
            int i10 = 0;
            if (i4 < -12571459 * this.aa) {
                int i11 = (this.aa * -12571459) - i4;
                i7 -= i11;
                i4 = this.aa * -12571459;
                i6 = 0 + (i11 * i8);
                i5 += i11 * (this.ad * -481290979);
            }
            if (i4 + i7 > this.ag * -467581477) {
                i7 -= (i4 + i7) - (-467581477 * this.ag);
            }
            if (i3 < this.ay * 1829547545) {
                i4 = (1829547545 * this.ay) - i3;
                i8 -= i4;
                i3 = 1829547545 * this.ay;
                i6 += i4;
                i5 += i4;
                i10 = 0 + i4;
                i9 += i4;
            }
            if (i8 + i3 > 2074797577 * this.as) {
                i3 = (i3 + i8) - (2074797577 * this.as);
                i8 -= i3;
                i10 += i3;
                i9 += i3;
            }
            if (i8 > 0 && i7 > 0) {
                aj.au(this.af, gdVar.af, gdVar.ad, i6, i5, i8, i7, i9, i10, -2141215494);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "gc.ao(" + ')');
        }
    }

    public void dh(gd gdVar, int i, int i2) {
        int i3;
        int i4 = i + gdVar.ag;
        int i5 = i2 + gdVar.ay;
        int i6 = ((-481290979 * this.ad) * i5) + i4;
        int i7 = 0;
        int i8 = gdVar.aa;
        int i9 = gdVar.an;
        int i10 = (this.ad * -481290979) - i9;
        if (i5 < -12571459 * this.aa) {
            int i11 = (this.aa * -12571459) - i5;
            i8 -= i11;
            i5 = this.aa * -12571459;
            i7 = 0 + (i11 * i9);
            i6 += i11 * (this.ad * -481290979);
        }
        if (i5 + i8 > this.ag * -467581477) {
            i11 = i8 - ((i5 + i8) - (-467581477 * this.ag));
        } else {
            i11 = i8;
        }
        if (i4 < this.ay * 1829547545) {
            int i12 = (1829547545 * this.ay) - i4;
            i5 = i9 - i12;
            i9 = i7 + i12;
            i8 = 0 + i12;
            i7 = i10 + i12;
            i3 = i6 + i12;
            i10 = 1829547545 * this.ay;
            i6 = i5;
            i5 = i9;
        } else {
            i8 = 0;
            i5 = i7;
            i7 = i10;
            i3 = i6;
            i6 = i9;
            i10 = i4;
        }
        if (i6 + i10 > 2074797577 * this.as) {
            i9 = (i10 + i6) - (2074797577 * this.as);
            i10 = i6 - i9;
            i4 = i8 + i9;
            i9 += i7;
        } else {
            i4 = i8;
            i9 = i7;
            i10 = i6;
        }
        if (i10 > 0 && i11 > 0) {
            aj.au(this.af, gdVar.af, gdVar.ad, i5, i3, i10, i11, i9, i4, -2141612197);
        }
    }

    public void dn(gd gdVar, int i, int i2) {
        int i3;
        int i4 = i + gdVar.ag;
        int i5 = i2 + gdVar.ay;
        int i6 = ((-481290979 * this.ad) * i5) + i4;
        int i7 = 0;
        int i8 = gdVar.aa;
        int i9 = gdVar.an;
        int i10 = (this.ad * -481290979) - i9;
        if (i5 < -12571459 * this.aa) {
            int i11 = (this.aa * -1004284796) - i5;
            i8 -= i11;
            i5 = this.aa * -12571459;
            i7 = 0 + (i11 * i9);
            i6 += i11 * (this.ad * -792730889);
        }
        if (i5 + i8 > this.ag * -467581477) {
            i11 = i8 - ((i5 + i8) - (-467581477 * this.ag));
        } else {
            i11 = i8;
        }
        if (i4 < this.ay * 717469061) {
            int i12 = (893536515 * this.ay) - i4;
            i5 = i9 - i12;
            i9 = i7 + i12;
            i8 = 0 + i12;
            i7 = i10 + i12;
            i3 = i6 + i12;
            i10 = -1893767562 * this.ay;
            i6 = i5;
            i5 = i9;
        } else {
            i8 = 0;
            i5 = i7;
            i7 = i10;
            i3 = i6;
            i6 = i9;
            i10 = i4;
        }
        if (i6 + i10 > 2074797577 * this.as) {
            i9 = (i10 + i6) - (-865366927 * this.as);
            i10 = i6 - i9;
            i4 = i8 + i9;
            i9 += i7;
        } else {
            i4 = i8;
            i9 = i7;
            i10 = i6;
        }
        if (i10 > 0 && i11 > 0) {
            aj.au(this.af, gdVar.af, gdVar.ad, i5, i3, i10, i11, i9, i4, -2147386566);
        }
    }

    public void dy(gd gdVar, int i, int i2) {
        int i3;
        int i4 = i + gdVar.ag;
        int i5 = i2 + gdVar.ay;
        int i6 = ((-481290979 * this.ad) * i5) + i4;
        int i7 = 0;
        int i8 = gdVar.aa;
        int i9 = gdVar.an;
        int i10 = (this.ad * -481290979) - i9;
        if (i5 < -12571459 * this.aa) {
            int i11 = (this.aa * -12571459) - i5;
            i8 -= i11;
            i5 = this.aa * -12571459;
            i7 = 0 + (i11 * i9);
            i6 += i11 * (this.ad * -481290979);
        }
        if (i5 + i8 > this.ag * -467581477) {
            i11 = i8 - ((i5 + i8) - (-467581477 * this.ag));
        } else {
            i11 = i8;
        }
        if (i4 < this.ay * 1829547545) {
            int i12 = (1829547545 * this.ay) - i4;
            i5 = i9 - i12;
            i9 = i7 + i12;
            i8 = 0 + i12;
            i7 = i10 + i12;
            i3 = i6 + i12;
            i10 = 1829547545 * this.ay;
            i6 = i5;
            i5 = i9;
        } else {
            i8 = 0;
            i5 = i7;
            i7 = i10;
            i3 = i6;
            i6 = i9;
            i10 = i4;
        }
        if (i6 + i10 > 2074797577 * this.as) {
            i9 = (i10 + i6) - (2074797577 * this.as);
            i10 = i6 - i9;
            i4 = i8 + i9;
            i9 += i7;
        } else {
            i4 = i8;
            i9 = i7;
            i10 = i6;
        }
        if (i10 > 0 && i11 > 0) {
            aj.au(this.af, gdVar.af, gdVar.ad, i5, i3, i10, i11, i9, i4, -2145097287);
        }
    }

    static void ek(int[] iArr, byte[] bArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = -(i3 >> 2);
        int i8 = -(i3 & 3);
        int i9 = -i4;
        int i10 = i2;
        int i11 = i;
        while (i9 < 0) {
            int i12 = i7;
            while (i12 < 0) {
                int i13 = i11 + 1;
                byte b = bArr[i11];
                if (b != (byte) 0) {
                    i11 = i10 + 1;
                    iArr[i10] = iArr2[b & 1759651193];
                } else {
                    i11 = i10 + 1;
                }
                int i14 = i13 + 1;
                byte b2 = bArr[i13];
                if (b2 != (byte) 0) {
                    i10 = i11 + 1;
                    iArr[i11] = iArr2[b2 & 483467074];
                    i11 = i10;
                } else {
                    i11++;
                }
                int i15 = i14 + 1;
                b2 = bArr[i14];
                if (b2 != (byte) 0) {
                    i10 = i11 + 1;
                    iArr[i11] = iArr2[b2 & 1059410251];
                    i11 = i10;
                } else {
                    i11++;
                }
                i13 = i15 + 1;
                b = bArr[i15];
                if (b != (byte) 0) {
                    i10 = i11 + 1;
                    iArr[i11] = iArr2[b & 255];
                    i11 = i10;
                } else {
                    i11++;
                }
                i12++;
                i10 = i11;
                i11 = i13;
            }
            i12 = i10;
            i10 = i8;
            while (i10 < 0) {
                i13 = i11 + 1;
                b = bArr[i11];
                if (b != (byte) 0) {
                    i11 = i12 + 1;
                    iArr[i12] = iArr2[b & 255];
                } else {
                    i11 = i12 + 1;
                }
                i10++;
                i12 = i11;
                i11 = i13;
            }
            i10 = i12 + i5;
            i9++;
            i11 += i6;
        }
    }

    static void es(int[] iArr, byte[] bArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = -(i3 >> 2);
        int i8 = -(i3 & 3);
        int i9 = -i4;
        int i10 = i2;
        int i11 = i;
        while (i9 < 0) {
            int i12 = i7;
            while (i12 < 0) {
                int i13 = i11 + 1;
                byte b = bArr[i11];
                if (b != (byte) 0) {
                    i11 = i10 + 1;
                    iArr[i10] = iArr2[b & -1555336839];
                } else {
                    i11 = i10 + 1;
                }
                int i14 = i13 + 1;
                byte b2 = bArr[i13];
                if (b2 != (byte) 0) {
                    i10 = i11 + 1;
                    iArr[i11] = iArr2[b2 & 1601308361];
                    i11 = i10;
                } else {
                    i11++;
                }
                int i15 = i14 + 1;
                b2 = bArr[i14];
                if (b2 != (byte) 0) {
                    i10 = i11 + 1;
                    iArr[i11] = iArr2[b2 & 733462281];
                    i11 = i10;
                } else {
                    i11++;
                }
                i13 = i15 + 1;
                b = bArr[i15];
                if (b != (byte) 0) {
                    i10 = i11 + 1;
                    iArr[i11] = iArr2[b & 255];
                    i11 = i10;
                } else {
                    i11++;
                }
                i12++;
                i10 = i11;
                i11 = i13;
            }
            i12 = i10;
            i10 = i8;
            while (i10 < 0) {
                i13 = i11 + 1;
                b = bArr[i11];
                if (b != (byte) 0) {
                    i11 = i12 + 1;
                    iArr[i12] = iArr2[b & -611507698];
                } else {
                    i11 = i12 + 1;
                }
                i10++;
                i12 = i11;
                i11 = i13;
            }
            i10 = i12 + i5;
            i9++;
            i11 += i6;
        }
    }

    public void ax(fx fxVar, int i, int i2, int i3, int i4, int i5) {
        if (i3 > 0 && i4 > 0) {
            try {
                int i6;
                int i7;
                int i8;
                int i9 = fxVar.ad;
                int i10 = fxVar.an;
                int i11 = 0;
                int i12 = 0;
                int i13 = fxVar.ay;
                int i14 = fxVar.as;
                int i15 = (i13 << 16) / i3;
                int i16 = (i14 << 16) / i4;
                if (fxVar.aa > 0) {
                    i6 = (((fxVar.aa << 16) + i15) - 1) / i15;
                    i += i6;
                    i11 = 0 + ((i6 * i15) - (fxVar.aa << 16));
                }
                if (fxVar.ag > 0) {
                    i6 = (((fxVar.ag << 16) + i16) - 1) / i16;
                    i2 += i6;
                    i12 = 0 + ((i6 * i16) - (fxVar.ag << 16));
                }
                if (i9 < i13) {
                    i7 = ((((i9 << 16) - i11) + i15) - 1) / i15;
                } else {
                    i7 = i3;
                }
                if (i10 < i14) {
                    i8 = ((((i10 << 16) - i12) + i16) - 1) / i16;
                } else {
                    i8 = i4;
                }
                i6 = ((-481290979 * this.ad) * i2) + i;
                int i17 = (this.ad * -481290979) - i7;
                if (i8 + i2 > this.ag * -467581477) {
                    i8 -= (i8 + i2) - (-467581477 * this.ag);
                }
                if (i2 < -12571459 * this.aa) {
                    i10 = (this.aa * -12571459) - i2;
                    i8 -= i10;
                    i6 += (this.ad * -481290979) * i10;
                    i12 += i10 * i16;
                }
                if (i7 + i > this.as * 2074797577) {
                    i10 = (i + i7) - (2074797577 * this.as);
                    i7 -= i10;
                    i17 += i10;
                }
                if (i < this.ay * 1829547545) {
                    i10 = (this.ay * 1829547545) - i;
                    i7 -= i10;
                    i6 += i10;
                    i11 += i10 * i15;
                    i17 += i10;
                }
                gs.al(this.af, fxVar.af, 0, i11, i12, i6, i17, i7, i8, i15, i16, i9, (short) -14366);
            } catch (Throwable e) {
                throw ba.ad(e, "gc.ax(" + ')');
            }
        }
    }

    public void db(fx fxVar, int i, int i2, int i3, int i4) {
        if (i3 > 0 && i4 > 0) {
            int i5;
            int i6;
            int i7;
            int i8;
            int i9 = fxVar.ad;
            int i10 = fxVar.an;
            int i11 = 0;
            int i12 = 0;
            int i13 = fxVar.ay;
            int i14 = fxVar.as;
            int i15 = (i13 << 16) / i3;
            int i16 = (i14 << 16) / i4;
            if (fxVar.aa > 0) {
                i5 = (((fxVar.aa << 16) + i15) - 1) / i15;
                i += i5;
                i11 = 0 + ((i5 * i15) - (fxVar.aa << 16));
            }
            if (fxVar.ag > 0) {
                i5 = (((fxVar.ag << 16) + i16) - 1) / i16;
                i2 += i5;
                i12 = 0 + ((i5 * i16) - (fxVar.ag << 16));
            }
            if (i9 < i13) {
                i5 = ((((i9 << 16) - i11) + i15) - 1) / i15;
            } else {
                i5 = i3;
            }
            if (i10 < i14) {
                i4 = ((((i10 << 16) - i12) + i16) - 1) / i16;
            }
            i10 = ((-481290979 * this.ad) * i2) + i;
            i13 = (this.ad * 1559333567) - i5;
            if (i4 + i2 > this.ag * -1053653844) {
                i4 -= (i4 + i2) - (-467581477 * this.ag);
            }
            if (i2 < -12571459 * this.aa) {
                i14 = (this.aa * -960814648) - i2;
                i6 = i4 - i14;
                i10 += (this.ad * -481290979) * i14;
                i12 += i14 * i16;
            } else {
                i6 = i4;
            }
            if (i5 + i > this.as * 1864261715) {
                i14 = (i + i5) - (1897432817 * this.as);
                i5 -= i14;
                i13 += i14;
            }
            if (i < this.ay * 1829547545) {
                i7 = (this.ay * 1829547545) - i;
                i8 = i5 - i7;
                i14 = i10 + i7;
                i5 = i11 + (i7 * i15);
                i7 += i13;
            } else {
                i7 = i13;
                i14 = i10;
                i8 = i5;
                i5 = i11;
            }
            gs.al(this.af, fxVar.af, 0, i5, i12, i14, i7, i8, i6, i15, i16, i9, (short) -6197);
        }
    }

    public void dm(fx fxVar, int i, int i2, int i3, int i4) {
        if (i3 > 0 && i4 > 0) {
            int i5;
            int i6;
            int i7;
            int i8;
            int i9 = fxVar.ad;
            int i10 = fxVar.an;
            int i11 = 0;
            int i12 = 0;
            int i13 = fxVar.ay;
            int i14 = fxVar.as;
            int i15 = (i13 << 16) / i3;
            int i16 = (i14 << 16) / i4;
            if (fxVar.aa > 0) {
                i5 = (((fxVar.aa << 16) + i15) - 1) / i15;
                i += i5;
                i11 = 0 + ((i5 * i15) - (fxVar.aa << 16));
            }
            if (fxVar.ag > 0) {
                i5 = (((fxVar.ag << 16) + i16) - 1) / i16;
                i2 += i5;
                i12 = 0 + ((i5 * i16) - (fxVar.ag << 16));
            }
            if (i9 < i13) {
                i5 = ((((i9 << 16) - i11) + i15) - 1) / i15;
            } else {
                i5 = i3;
            }
            if (i10 < i14) {
                i4 = ((((i10 << 16) - i12) + i16) - 1) / i16;
            }
            i10 = ((74245702 * this.ad) * i2) + i;
            i13 = (this.ad * -283850635) - i5;
            if (i4 + i2 > this.ag * -467581477) {
                i4 -= (i4 + i2) - (-893488251 * this.ag);
            }
            if (i2 < 1086673976 * this.aa) {
                i14 = (this.aa * 703708818) - i2;
                i6 = i4 - i14;
                i10 += (this.ad * -481290979) * i14;
                i12 += i14 * i16;
            } else {
                i6 = i4;
            }
            if (i5 + i > this.as * -988599075) {
                i14 = (i + i5) - (2074797577 * this.as);
                i5 -= i14;
                i13 += i14;
            }
            if (i < this.ay * -628614421) {
                i7 = (this.ay * 1829547545) - i;
                i8 = i5 - i7;
                i14 = i10 + i7;
                i5 = i11 + (i7 * i15);
                i7 += i13;
            } else {
                i7 = i13;
                i14 = i10;
                i8 = i5;
                i5 = i11;
            }
            gs.al(this.af, fxVar.af, 0, i5, i12, i14, i7, i8, i6, i15, i16, i9, (short) 12358);
        }
    }

    public void du(fx fxVar, int i, int i2, int i3, int i4) {
        if (i3 > 0 && i4 > 0) {
            int i5;
            int i6;
            int i7;
            int i8;
            int i9 = fxVar.ad;
            int i10 = fxVar.an;
            int i11 = 0;
            int i12 = 0;
            int i13 = fxVar.ay;
            int i14 = fxVar.as;
            int i15 = (i13 << 16) / i3;
            int i16 = (i14 << 16) / i4;
            if (fxVar.aa > 0) {
                i5 = (((fxVar.aa << 16) + i15) - 1) / i15;
                i += i5;
                i11 = 0 + ((i5 * i15) - (fxVar.aa << 16));
            }
            if (fxVar.ag > 0) {
                i5 = (((fxVar.ag << 16) + i16) - 1) / i16;
                i2 += i5;
                i12 = 0 + ((i5 * i16) - (fxVar.ag << 16));
            }
            if (i9 < i13) {
                i5 = ((((i9 << 16) - i11) + i15) - 1) / i15;
            } else {
                i5 = i3;
            }
            if (i10 < i14) {
                i4 = ((((i10 << 16) - i12) + i16) - 1) / i16;
            }
            i10 = ((-2021742198 * this.ad) * i2) + i;
            i13 = (this.ad * -481290979) - i5;
            if (i4 + i2 > this.ag * -467581477) {
                i4 -= (i4 + i2) - (-532169246 * this.ag);
            }
            if (i2 < 1910797824 * this.aa) {
                i14 = (this.aa * -12571459) - i2;
                i6 = i4 - i14;
                i10 += (this.ad * -2125862759) * i14;
                i12 += i14 * i16;
            } else {
                i6 = i4;
            }
            if (i5 + i > this.as * 978361114) {
                i14 = (i + i5) - (2074797577 * this.as);
                i5 -= i14;
                i13 += i14;
            }
            if (i < this.ay * 2116234159) {
                i7 = (this.ay * -1395912117) - i;
                i8 = i5 - i7;
                i14 = i10 + i7;
                i5 = i11 + (i7 * i15);
                i7 += i13;
            } else {
                i7 = i13;
                i14 = i10;
                i8 = i5;
                i5 = i11;
            }
            gs.al(this.af, fxVar.af, 0, i5, i12, i14, i7, i8, i6, i15, i16, i9, (short) 8962);
        }
    }

    static void eu(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11 = -i7;
        int i12 = i4;
        int i13 = i2;
        while (i11 < 0) {
            int i14 = i10 * (i3 >> 16);
            int i15 = i13;
            i13 = i12;
            i12 = -i6;
            while (i12 < 0) {
                int i16;
                int i17 = iArr2[(i15 >> 16) + i14];
                if (i17 != 0) {
                    i16 = i13 + 1;
                    iArr[i13] = i17;
                } else {
                    i16 = i13 + 1;
                }
                i12++;
                i15 += i8;
                i13 = i16;
            }
            i3 += i9;
            i12 = i13 + i5;
            i11++;
            i13 = i2;
        }
    }

    static void ex(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11 = -i7;
        int i12 = i4;
        int i13 = i2;
        while (i11 < 0) {
            int i14 = i10 * (i3 >> 16);
            int i15 = i13;
            i13 = i12;
            i12 = -i6;
            while (i12 < 0) {
                int i16;
                int i17 = iArr2[(i15 >> 16) + i14];
                if (i17 != 0) {
                    i16 = i13 + 1;
                    iArr[i13] = i17;
                } else {
                    i16 = i13 + 1;
                }
                i12++;
                i15 += i8;
                i13 = i16;
            }
            i3 += i9;
            i12 = i13 + i5;
            i11++;
            i13 = i2;
        }
    }

    public void av(gd gdVar, int i, int i2, int i3, int i4, int i5) {
        try {
            int i6;
            int i7;
            int i8;
            int i9;
            int i10 = gdVar.an;
            int i11 = gdVar.aa;
            int i12 = 0;
            int i13 = 0;
            int i14 = gdVar.as;
            int i15 = gdVar.ar;
            int i16 = (i14 << 16) / i3;
            int i17 = (i15 << 16) / i4;
            if (gdVar.ag > 0) {
                i6 = (((gdVar.ag << 16) + i16) - 1) / i16;
                i += i6;
                i12 = 0 + ((i6 * i16) - (gdVar.ag << 16));
            }
            if (gdVar.ay > 0) {
                i6 = (((gdVar.ay << 16) + i17) - 1) / i17;
                i2 += i6;
                i13 = 0 + ((i6 * i17) - (gdVar.ay << 16));
            }
            if (i10 < i14) {
                i6 = ((((i10 << 16) - i12) + i16) - 1) / i16;
            } else {
                i6 = i3;
            }
            if (i11 < i15) {
                i15 = ((((i11 << 16) - i13) + i17) - 1) / i17;
            } else {
                i15 = i4;
            }
            i14 = i + ((this.ad * -481290979) * i2);
            i11 = (-481290979 * this.ad) - i6;
            if (i2 + i15 > this.ag * -467581477) {
                i15 -= (i2 + i15) - (-467581477 * this.ag);
            }
            if (i2 < -12571459 * this.aa) {
                i7 = (this.aa * -12571459) - i2;
                i15 -= i7;
                i14 += (this.ad * -481290979) * i7;
                i13 += i7 * i17;
            }
            if (i + i6 > this.as * 2074797577) {
                i7 = (i6 + i) - (this.as * 2074797577);
                i6 -= i7;
                i11 += i7;
            }
            if (i < this.ay * 1829547545) {
                i7 = (this.ay * 1829547545) - i;
                i14 += i7;
                i12 += i7 * i16;
                i8 = i11 + i7;
                i9 = i6 - i7;
            } else {
                i8 = i11;
                i9 = i6;
            }
            int[] iArr = this.af;
            byte[] bArr = gdVar.af;
            int[] iArr2 = gdVar.ad;
            i15 = -i15;
            i7 = i13;
            i13 = i12;
            while (i15 < 0) {
                int i18 = i10 * (i7 >> 16);
                i6 = i13;
                i13 = i14;
                i14 = -i9;
                while (i14 < 0) {
                    byte b = bArr[(i6 >> 16) + i18];
                    if (b != (byte) 0) {
                        i11 = i13 + 1;
                        iArr[i13] = iArr2[b & 255];
                    } else {
                        i11 = i13 + 1;
                    }
                    i14++;
                    i6 += i16;
                    i13 = i11;
                }
                i14 = i13 + i8;
                i15++;
                i7 += i17;
                i13 = i12;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "gc.av(" + ')');
        }
    }

    public void df(gd gdVar, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = gdVar.an;
        int i7 = gdVar.aa;
        int i8 = 0;
        int i9 = 0;
        int i10 = gdVar.as;
        int i11 = gdVar.ar;
        int i12 = (i10 << 16) / i3;
        int i13 = (i11 << 16) / i4;
        if (gdVar.ag > 0) {
            i5 = (((gdVar.ag << 16) + i12) - 1) / i12;
            i += i5;
            i8 = 0 + ((i5 * i12) - (gdVar.ag << 16));
        }
        if (gdVar.ay > 0) {
            i5 = (((gdVar.ay << 16) + i13) - 1) / i13;
            i2 += i5;
            i9 = 0 + ((i5 * i13) - (gdVar.ay << 16));
        }
        if (i6 < i10) {
            i5 = ((((i6 << 16) - i8) + i12) - 1) / i12;
        } else {
            i5 = i3;
        }
        if (i7 < i11) {
            i4 = ((((i7 << 16) - i9) + i13) - 1) / i13;
        }
        i7 = ((this.ad * -481290979) * i2) + i;
        i10 = (-481290979 * this.ad) - i5;
        if (i2 + i4 > this.ag * -467581477) {
            i4 -= (i2 + i4) - (-467581477 * this.ag);
        }
        if (i2 < -12571459 * this.aa) {
            i11 = (this.aa * -12571459) - i2;
            i4 -= i11;
            i7 += (this.ad * -481290979) * i11;
            i9 += i11 * i13;
        }
        if (i + i5 > this.as * 2074797577) {
            i11 = (i5 + i) - (this.as * 2074797577);
            i5 -= i11;
            i10 += i11;
        }
        if (i < this.ay * 1829547545) {
            i11 = (this.ay * 1829547545) - i;
            i5 -= i11;
            i7 += i11;
            i8 += i11 * i12;
            i10 += i11;
        }
        int[] iArr = this.af;
        byte[] bArr = gdVar.af;
        int[] iArr2 = gdVar.ad;
        int i14 = -i4;
        int i15 = i9;
        i9 = i7;
        i11 = i8;
        while (i14 < 0) {
            int i16 = i6 * (i15 >> 16);
            int i17 = i11;
            i11 = i9;
            i9 = -i5;
            while (i9 < 0) {
                byte b = bArr[(i17 >> 16) + i16];
                if (b != (byte) 0) {
                    i7 = i11 + 1;
                    iArr[i11] = iArr2[b & 255];
                } else {
                    i7 = i11 + 1;
                }
                i9++;
                i17 += i12;
                i11 = i7;
            }
            i9 = i11 + i10;
            i14++;
            i15 += i13;
            i11 = i8;
        }
    }

    public void dq(gd gdVar, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = gdVar.an;
        int i7 = gdVar.aa;
        int i8 = 0;
        int i9 = 0;
        int i10 = gdVar.as;
        int i11 = gdVar.ar;
        int i12 = (i10 << 16) / i3;
        int i13 = (i11 << 16) / i4;
        if (gdVar.ag > 0) {
            i5 = (((gdVar.ag << 16) + i12) - 1) / i12;
            i += i5;
            i8 = 0 + ((i5 * i12) - (gdVar.ag << 16));
        }
        if (gdVar.ay > 0) {
            i5 = (((gdVar.ay << 16) + i13) - 1) / i13;
            i2 += i5;
            i9 = 0 + ((i5 * i13) - (gdVar.ay << 16));
        }
        if (i6 < i10) {
            i5 = ((((i6 << 16) - i8) + i12) - 1) / i12;
        } else {
            i5 = i3;
        }
        if (i7 < i11) {
            i4 = ((((i7 << 16) - i9) + i13) - 1) / i13;
        }
        i7 = ((this.ad * -481290979) * i2) + i;
        i10 = (-481290979 * this.ad) - i5;
        if (i2 + i4 > this.ag * -467581477) {
            i4 -= (i2 + i4) - (-467581477 * this.ag);
        }
        if (i2 < -12571459 * this.aa) {
            i11 = (this.aa * -12571459) - i2;
            i4 -= i11;
            i7 += (this.ad * -481290979) * i11;
            i9 += i11 * i13;
        }
        if (i + i5 > this.as * 2074797577) {
            i11 = (i5 + i) - (this.as * 2074797577);
            i5 -= i11;
            i10 += i11;
        }
        if (i < this.ay * 1829547545) {
            i11 = (this.ay * 1829547545) - i;
            i5 -= i11;
            i7 += i11;
            i8 += i11 * i12;
            i10 += i11;
        }
        int[] iArr = this.af;
        byte[] bArr = gdVar.af;
        int[] iArr2 = gdVar.ad;
        int i14 = -i4;
        int i15 = i9;
        i9 = i7;
        i11 = i8;
        while (i14 < 0) {
            int i16 = i6 * (i15 >> 16);
            int i17 = i11;
            i11 = i9;
            i9 = -i5;
            while (i9 < 0) {
                byte b = bArr[(i17 >> 16) + i16];
                if (b != (byte) 0) {
                    i7 = i11 + 1;
                    iArr[i11] = iArr2[b & 255];
                } else {
                    i7 = i11 + 1;
                }
                i9++;
                i17 += i12;
                i11 = i7;
            }
            i9 = i11 + i10;
            i14++;
            i15 += i13;
            i11 = i8;
        }
    }

    public void ac(fx fxVar, int i, int i2, int i3, int i4) {
        try {
            int i5 = fxVar.aa + i;
            int i6 = fxVar.ag + i2;
            int i7 = i5 + ((this.ad * -481290979) * i6);
            int i8 = 0;
            int i9 = fxVar.an;
            int i10 = fxVar.ad;
            int i11 = (-481290979 * this.ad) - i10;
            int i12 = 0;
            if (i6 < -12571459 * this.aa) {
                int i13 = (this.aa * -12571459) - i6;
                i9 -= i13;
                i6 = this.aa * -12571459;
                i8 = 0 + (i13 * i10);
                i7 += i13 * (this.ad * -481290979);
            }
            if (i9 + i6 > -467581477 * this.ag) {
                i9 -= (i6 + i9) - (this.ag * -467581477);
            }
            if (i5 < 1829547545 * this.ay) {
                i6 = (this.ay * 1829547545) - i5;
                i10 -= i6;
                i5 = 1829547545 * this.ay;
                i8 += i6;
                i7 += i6;
                i12 = 0 + i6;
                i11 += i6;
            }
            if (i10 + i5 > 2074797577 * this.as) {
                i5 = (i5 + i10) - (this.as * 2074797577);
                i10 -= i5;
                i12 += i5;
                i11 += i5;
            }
            if (i10 > 0 && i9 > 0) {
                if (i3 == 256) {
                    du.ap(0, 0, 0, this.af, fxVar.af, i8, 0, i7, 0, i10, i9, i11, i12, 1361942400);
                } else {
                    bg.bb(0, 0, 0, this.af, fxVar.af, i8, 0, i7, 0, i10, i9, i11, i12, i3, -1529049503);
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "gc.ac(" + ')');
        }
    }

    public void er(fx fxVar, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7 = i + fxVar.aa;
        int i8 = i2 + fxVar.ag;
        int i9 = i7 + ((this.ad * -481290979) * i8);
        int i10 = 0;
        int i11 = fxVar.an;
        int i12 = fxVar.ad;
        int i13 = (-481290979 * this.ad) - i12;
        if (i8 < -12571459 * this.aa) {
            int i14 = (this.aa * -12571459) - i8;
            i11 -= i14;
            i8 = this.aa * -12571459;
            i10 = 0 + (i14 * i12);
            i9 += i14 * (this.ad * -481290979);
        }
        if (i11 + i8 > -467581477 * this.ag) {
            i4 = i11 - ((i8 + i11) - (this.ag * -467581477));
        } else {
            i4 = i11;
        }
        if (i7 < 1829547545 * this.ay) {
            int i15 = (this.ay * 1829547545) - i7;
            i8 = i12 - i15;
            i12 = i10 + i15;
            i7 = i9 + i15;
            i11 = 0 + i15;
            i10 = i13 + i15;
            i9 = i8;
            i13 = i12;
            i8 = 1829547545 * this.ay;
        } else {
            i11 = 0;
            i8 = i7;
            i7 = i9;
            i9 = i12;
            int i16 = i10;
            i10 = i13;
            i13 = i16;
        }
        if (i9 + i8 > 2074797577 * this.as) {
            i8 = (i8 + i9) - (this.as * 2074797577);
            i15 = i9 - i8;
            i5 = i11 + i8;
            i6 = i10 + i8;
        } else {
            i5 = i11;
            i6 = i10;
            i15 = i9;
        }
        if (i15 > 0 && i4 > 0) {
            if (i3 == 256) {
                du.ap(0, 0, 0, this.af, fxVar.af, i13, 0, i7, 0, i15, i4, i6, i5, 2120404010);
            } else {
                bg.bb(0, 0, 0, this.af, fxVar.af, i13, 0, i7, 0, i15, i4, i6, i5, i3, -186322553);
            }
        }
    }

    static void ea(int i, int i2, int i3, int[] iArr, int[] iArr2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        int i12 = -i9;
        int i13 = i4;
        int i14 = i6;
        while (i12 < 0) {
            int i15 = i14;
            i14 = i13;
            i13 = -i8;
            int i16 = i15;
            while (i13 < 0) {
                int i17 = i14 + 1;
                i14 = iArr2[i14];
                if (i14 != 0) {
                    int i18 = iArr[i16];
                    int i19 = i14 + i18;
                    i14 = (i14 & 16711935) + (i18 & -918087581);
                    i18 = (16777472 & i14) + ((i19 - i14) & 831820202);
                    i14 = i16 + 1;
                    iArr[i16] = (i18 - (i18 >>> 8)) | (i19 - i18);
                } else {
                    i14 = i16 + 1;
                }
                i13++;
                i16 = i14;
                i14 = i17;
            }
            i13 = i14 + i11;
            i12++;
            i14 = i16 + i10;
        }
    }

    static void en(int i, int i2, int i3, int[] iArr, int[] iArr2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        int i12 = -i9;
        int i13 = i4;
        int i14 = i6;
        while (i12 < 0) {
            int i15 = i14;
            i14 = i13;
            i13 = -i8;
            int i16 = i15;
            while (i13 < 0) {
                int i17 = i14 + 1;
                i14 = iArr2[i14];
                if (i14 != 0) {
                    int i18 = iArr[i16];
                    int i19 = i14 + i18;
                    i14 = (i14 & 16711935) + (i18 & 16711935);
                    i18 = (16777472 & i14) + ((i19 - i14) & ic.ad);
                    i14 = i16 + 1;
                    iArr[i16] = (i18 - (i18 >>> 8)) | (i19 - i18);
                } else {
                    i14 = i16 + 1;
                }
                i13++;
                i16 = i14;
                i14 = i17;
            }
            i13 = i14 + i11;
            i12++;
            i14 = i16 + i10;
        }
    }

    static void eq(int i, int i2, int i3, int[] iArr, int[] iArr2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        int i12 = -i9;
        int i13 = i4;
        int i14 = i6;
        while (i12 < 0) {
            int i15 = i14;
            i14 = i13;
            i13 = -i8;
            int i16 = i15;
            while (i13 < 0) {
                int i17 = i14 + 1;
                i14 = iArr2[i14];
                if (i14 != 0) {
                    int i18 = iArr[i16];
                    int i19 = i14 + i18;
                    i14 = (i14 & 16711935) + (i18 & 16711935);
                    i18 = (16777472 & i14) + ((i19 - i14) & ic.ad);
                    i14 = i16 + 1;
                    iArr[i16] = (i18 - (i18 >>> 8)) | (i19 - i18);
                } else {
                    i14 = i16 + 1;
                }
                i13++;
                i16 = i14;
                i14 = i17;
            }
            i13 = i14 + i11;
            i12++;
            i14 = i16 + i10;
        }
    }

    static void eg(int i, int i2, int i3, int[] iArr, int[] iArr2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        int i13 = -i9;
        int i14 = i4;
        int i15 = i6;
        while (i13 < 0) {
            int i16 = i15;
            i15 = i14;
            i14 = -i8;
            int i17 = i16;
            while (i14 < 0) {
                int i18 = i15 + 1;
                i15 = iArr2[i15];
                if (i15 != 0) {
                    int i19 = (16711935 & i15) * i12;
                    i15 = ((((i15 * i12) - i19) & 16711680) + (i19 & -16711936)) >>> 8;
                    i19 = iArr[i17];
                    int i20 = i15 + i19;
                    i15 = (i15 & 16711935) + (i19 & 16711935);
                    i19 = ((i20 - i15) & ic.ad) + (i15 & 16777472);
                    i15 = i17 + 1;
                    iArr[i17] = (i19 - (i19 >>> 8)) | (i20 - i19);
                } else {
                    i15 = i17 + 1;
                }
                i14++;
                i17 = i15;
                i15 = i18;
            }
            i14 = i15 + i11;
            i13++;
            i15 = i17 + i10;
        }
    }

    static void et(int i, int i2, int i3, int[] iArr, int[] iArr2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        int i13 = -i9;
        int i14 = i4;
        int i15 = i6;
        while (i13 < 0) {
            int i16 = i15;
            i15 = i14;
            i14 = -i8;
            int i17 = i16;
            while (i14 < 0) {
                int i18 = i15 + 1;
                i15 = iArr2[i15];
                if (i15 != 0) {
                    int i19 = (16711935 & i15) * i12;
                    i15 = ((((i15 * i12) - i19) & 1781150907) + (i19 & -16711936)) >>> 8;
                    i19 = iArr[i17];
                    int i20 = i15 + i19;
                    i15 = (i15 & 16711935) + (i19 & 16711935);
                    i19 = ((i20 - i15) & ic.ad) + (i15 & 16777472);
                    i15 = i17 + 1;
                    iArr[i17] = (i19 - (i19 >>> 8)) | (i20 - i19);
                } else {
                    i15 = i17 + 1;
                }
                i14++;
                i17 = i15;
                i15 = i18;
            }
            i14 = i15 + i11;
            i13++;
            i15 = i17 + i10;
        }
    }

    public void bw(fx fxVar, int i, int i2, int i3, int i4, byte b) {
        if (i3 >= 255) {
            try {
                ah(fxVar, i, i2, 2106205673);
                return;
            } catch (Throwable e) {
                throw ba.ad(e, "gc.bw(" + ')');
            }
        }
        int i5 = fxVar.aa + i;
        int i6 = fxVar.ag + i2;
        int i7 = i5 + ((-481290979 * this.ad) * i6);
        int i8 = 0;
        int i9 = fxVar.an;
        int i10 = fxVar.ad;
        int i11 = (-481290979 * this.ad) - i10;
        int i12 = 0;
        if (i6 < -12571459 * this.aa) {
            int i13 = (-12571459 * this.aa) - i6;
            i9 -= i13;
            i6 = -12571459 * this.aa;
            i8 = 0 + (i10 * i13);
            i7 += i13 * (-481290979 * this.ad);
        }
        if (i9 + i6 > -467581477 * this.ag) {
            i9 -= (i6 + i9) - (this.ag * -467581477);
        }
        if (i5 < this.ay * 1829547545) {
            i6 = (this.ay * 1829547545) - i5;
            i10 -= i6;
            i5 = 1829547545 * this.ay;
            i8 += i6;
            i7 += i6;
            i12 = 0 + i6;
            i11 += i6;
        }
        if (i5 + i10 > 2074797577 * this.as) {
            i5 = (i5 + i10) - (2074797577 * this.as);
            i10 -= i5;
            i12 += i5;
            i11 += i5;
        }
        if (i10 > 0 && i9 > 0) {
            ci.bz(this.af, fxVar.af, 0, i8, i7, i10, i9, i11, i12, i3, i4, (byte) -125);
        }
    }

    public void ec(fx fxVar, int i, int i2, int i3, int i4) {
        if (i3 >= 255) {
            ah(fxVar, i, i2, 2106205673);
            return;
        }
        int i5;
        int i6 = i + fxVar.aa;
        int i7 = i2 + fxVar.ag;
        int i8 = i6 + ((-481290979 * this.ad) * i7);
        int i9 = 0;
        int i10 = fxVar.an;
        int i11 = fxVar.ad;
        int i12 = (-481290979 * this.ad) - i11;
        if (i7 < -12571459 * this.aa) {
            int i13 = (-12571459 * this.aa) - i7;
            i10 -= i13;
            i7 = -12571459 * this.aa;
            i9 = 0 + (i11 * i13);
            i8 += i13 * (-481290979 * this.ad);
        }
        if (i10 + i7 > -467581477 * this.ag) {
            i13 = i10 - ((i7 + i10) - (this.ag * -467581477));
        } else {
            i13 = i10;
        }
        if (i6 < this.ay * 1829547545) {
            int i14 = (this.ay * 1829547545) - i6;
            i7 = i11 - i14;
            i11 = i9 + i14;
            i10 = 0 + i14;
            i9 = i12 + i14;
            i5 = i8 + i14;
            i12 = 1829547545 * this.ay;
            i8 = i7;
            i7 = i11;
        } else {
            i10 = 0;
            i7 = i9;
            i9 = i12;
            i5 = i8;
            i8 = i11;
            i12 = i6;
        }
        if (i12 + i8 > 2074797577 * this.as) {
            i11 = (i12 + i8) - (2074797577 * this.as);
            i12 = i8 - i11;
            i6 = i10 + i11;
            i11 += i9;
        } else {
            i6 = i10;
            i11 = i9;
            i12 = i8;
        }
        if (i12 > 0 && i13 > 0) {
            ci.bz(this.af, fxVar.af, 0, i7, i5, i12, i13, i11, i6, i3, i4, (byte) -115);
        }
    }

    public void ep(fx fxVar, int i, int i2, int i3, int i4) {
        if (i3 >= 255) {
            ah(fxVar, i, i2, 2106205673);
            return;
        }
        int i5;
        int i6 = i + fxVar.aa;
        int i7 = i2 + fxVar.ag;
        int i8 = i6 + ((-481290979 * this.ad) * i7);
        int i9 = 0;
        int i10 = fxVar.an;
        int i11 = fxVar.ad;
        int i12 = (-481290979 * this.ad) - i11;
        if (i7 < -12571459 * this.aa) {
            int i13 = (-12571459 * this.aa) - i7;
            i10 -= i13;
            i7 = -12571459 * this.aa;
            i9 = 0 + (i11 * i13);
            i8 += i13 * (-481290979 * this.ad);
        }
        if (i10 + i7 > -467581477 * this.ag) {
            i13 = i10 - ((i7 + i10) - (this.ag * -467581477));
        } else {
            i13 = i10;
        }
        if (i6 < this.ay * 1829547545) {
            int i14 = (this.ay * 1829547545) - i6;
            i7 = i11 - i14;
            i11 = i9 + i14;
            i10 = 0 + i14;
            i9 = i12 + i14;
            i5 = i8 + i14;
            i12 = 1829547545 * this.ay;
            i8 = i7;
            i7 = i11;
        } else {
            i10 = 0;
            i7 = i9;
            i9 = i12;
            i5 = i8;
            i8 = i11;
            i12 = i6;
        }
        if (i12 + i8 > 2074797577 * this.as) {
            i11 = (i12 + i8) - (2074797577 * this.as);
            i12 = i8 - i11;
            i6 = i10 + i11;
            i11 += i9;
        } else {
            i6 = i10;
            i11 = i9;
            i12 = i8;
        }
        if (i12 > 0 && i13 > 0) {
            ci.bz(this.af, fxVar.af, 0, i7, i5, i12, i13, i11, i6, i3, i4, (byte) -82);
        }
    }

    public void ev(fx fxVar, int i, int i2, int i3, int i4) {
        if (i3 >= 255) {
            ah(fxVar, i, i2, 2106205673);
            return;
        }
        int i5;
        int i6 = i + fxVar.aa;
        int i7 = i2 + fxVar.ag;
        int i8 = i6 + ((-481290979 * this.ad) * i7);
        int i9 = 0;
        int i10 = fxVar.an;
        int i11 = fxVar.ad;
        int i12 = (-481290979 * this.ad) - i11;
        if (i7 < -12571459 * this.aa) {
            int i13 = (-12571459 * this.aa) - i7;
            i10 -= i13;
            i7 = -12571459 * this.aa;
            i9 = 0 + (i11 * i13);
            i8 += i13 * (-481290979 * this.ad);
        }
        if (i10 + i7 > -467581477 * this.ag) {
            i13 = i10 - ((i7 + i10) - (this.ag * -467581477));
        } else {
            i13 = i10;
        }
        if (i6 < this.ay * 1829547545) {
            int i14 = (this.ay * 1829547545) - i6;
            i7 = i11 - i14;
            i11 = i9 + i14;
            i10 = 0 + i14;
            i9 = i12 + i14;
            i5 = i8 + i14;
            i12 = 1829547545 * this.ay;
            i8 = i7;
            i7 = i11;
        } else {
            i10 = 0;
            i7 = i9;
            i9 = i12;
            i5 = i8;
            i8 = i11;
            i12 = i6;
        }
        if (i12 + i8 > 2074797577 * this.as) {
            i11 = (i12 + i8) - (2074797577 * this.as);
            i12 = i8 - i11;
            i6 = i10 + i11;
            i11 += i9;
        } else {
            i6 = i10;
            i11 = i9;
            i12 = i8;
        }
        if (i12 > 0 && i13 > 0) {
            ci.bz(this.af, fxVar.af, 0, i7, i5, i12, i13, i11, i6, i3, i4, (byte) -108);
        }
    }

    static void ej(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = 255 - i8;
        int i11 = (((i10 * (65280 & i9)) & 16711680) | (((16711935 & i9) * i10) & -16711936)) >>> 8;
        int i12 = i3;
        int i13 = i2;
        for (int i14 = -i5; i14 < 0; i14++) {
            i10 = i13;
            i13 = i12;
            i12 = -i4;
            while (i12 < 0) {
                int i15 = i10 + 1;
                i10 = iArr2[i10];
                if (i10 != 0) {
                    int i16 = 16711680 & ((i10 & 65280) * i8);
                    i10 = i13 + 1;
                    iArr[i13] = ((((((16711935 & i10) * i8) & -16711936) | i16) >>> 8) + i11) | -16777216;
                } else {
                    i10 = i13 + 1;
                }
                i12++;
                i13 = i10;
                i10 = i15;
            }
            i12 = i13 + i6;
            i13 = i10 + i7;
        }
    }

    public void bc(fx fxVar, int i, int i2, int i3, int i4) {
        try {
            int i5 = fxVar.aa + i;
            int i6 = fxVar.ag + i2;
            int i7 = i5 + ((-481290979 * this.ad) * i6);
            int i8 = 0;
            int i9 = fxVar.an;
            int i10 = fxVar.ad;
            int i11 = (this.ad * -481290979) - i10;
            int i12 = 0;
            if (i6 < this.aa * -12571459) {
                int i13 = (-12571459 * this.aa) - i6;
                i9 -= i13;
                i6 = -12571459 * this.aa;
                i8 = 0 + (i13 * i10);
                i7 += i13 * (-481290979 * this.ad);
            }
            if (i6 + i9 > this.ag * -467581477) {
                i9 -= (i6 + i9) - (this.ag * -467581477);
            }
            if (i5 < this.ay * 1829547545) {
                i6 = (1829547545 * this.ay) - i5;
                i10 -= i6;
                i5 = this.ay * 1829547545;
                i8 += i6;
                i7 += i6;
                i12 = 0 + i6;
                i11 += i6;
            }
            if (i5 + i10 > 2074797577 * this.as) {
                i5 = (i5 + i10) - (2074797577 * this.as);
                i10 -= i5;
                i12 += i5;
                i11 += i5;
            }
            if (i10 > 0 && i9 > 0) {
                aq.bh(this.af, fxVar.af, 0, i8, i7, i10, i9, i11, i12, i3, 1662079185);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "gc.bc(" + ')');
        }
    }

    public void ef(fx fxVar, int i, int i2, int i3) {
        int i4;
        int i5 = i + fxVar.aa;
        int i6 = i2 + fxVar.ag;
        int i7 = i5 + ((983340340 * this.ad) * i6);
        int i8 = 0;
        int i9 = fxVar.an;
        int i10 = fxVar.ad;
        int i11 = (this.ad * -1880109518) - i10;
        if (i6 < this.aa * -12571459) {
            int i12 = (-12571459 * this.aa) - i6;
            i9 -= i12;
            i6 = -12571459 * this.aa;
            i8 = 0 + (i12 * i10);
            i7 += i12 * (-481290979 * this.ad);
        }
        if (i6 + i9 > this.ag * -788079327) {
            i12 = i9 - ((i6 + i9) - (this.ag * 1667582013));
        } else {
            i12 = i9;
        }
        if (i5 < this.ay * 1829547545) {
            int i13 = (344418419 * this.ay) - i5;
            i6 = i10 - i13;
            i10 = i8 + i13;
            i9 = 0 + i13;
            i8 = i11 + i13;
            i4 = i7 + i13;
            i11 = this.ay * 1829547545;
            i7 = i6;
            i6 = i10;
        } else {
            i9 = 0;
            i6 = i8;
            i8 = i11;
            i4 = i7;
            i7 = i10;
            i11 = i5;
        }
        if (i11 + i7 > 1748891631 * this.as) {
            i10 = (i11 + i7) - (864581642 * this.as);
            i11 = i7 - i10;
            i5 = i9 + i10;
            i10 += i8;
        } else {
            i5 = i9;
            i10 = i8;
            i11 = i7;
        }
        if (i11 > 0 && i12 > 0) {
            aq.bh(this.af, fxVar.af, 0, i6, i4, i11, i12, i10, i5, i3, 1708834444);
        }
    }

    public void el(fx fxVar, int i, int i2, int i3) {
        int i4;
        int i5 = i + fxVar.aa;
        int i6 = i2 + fxVar.ag;
        int i7 = i5 + ((-481290979 * this.ad) * i6);
        int i8 = 0;
        int i9 = fxVar.an;
        int i10 = fxVar.ad;
        int i11 = (this.ad * -481290979) - i10;
        if (i6 < this.aa * -12571459) {
            int i12 = (-12571459 * this.aa) - i6;
            i9 -= i12;
            i6 = -12571459 * this.aa;
            i8 = 0 + (i12 * i10);
            i7 += i12 * (-481290979 * this.ad);
        }
        if (i6 + i9 > this.ag * -467581477) {
            i12 = i9 - ((i6 + i9) - (this.ag * -467581477));
        } else {
            i12 = i9;
        }
        if (i5 < this.ay * 1829547545) {
            int i13 = (1829547545 * this.ay) - i5;
            i6 = i10 - i13;
            i10 = i8 + i13;
            i9 = 0 + i13;
            i8 = i11 + i13;
            i4 = i7 + i13;
            i11 = this.ay * 1829547545;
            i7 = i6;
            i6 = i10;
        } else {
            i9 = 0;
            i6 = i8;
            i8 = i11;
            i4 = i7;
            i7 = i10;
            i11 = i5;
        }
        if (i11 + i7 > 2074797577 * this.as) {
            i10 = (i11 + i7) - (2074797577 * this.as);
            i11 = i7 - i10;
            i5 = i9 + i10;
            i10 += i8;
        } else {
            i5 = i9;
            i10 = i8;
            i11 = i7;
        }
        if (i11 > 0 && i12 > 0) {
            aq.bh(this.af, fxVar.af, 0, i6, i4, i11, i12, i10, i5, i3, 1867648851);
        }
    }

    public void ey(fx fxVar, int i, int i2, int i3) {
        int i4;
        int i5 = i + fxVar.aa;
        int i6 = i2 + fxVar.ag;
        int i7 = i5 + ((-577592135 * this.ad) * i6);
        int i8 = fxVar.an;
        int i9 = fxVar.ad;
        int i10 = (this.ad * 1751196969) - i9;
        if (i6 < this.aa * -12571459) {
            int i11 = (this.aa * -12571459) - i6;
            i8 -= i11;
            i4 = this.aa * 600195144;
            i6 = (i11 * i9) + 0;
            i7 += i11 * (561230626 * this.ad);
        } else {
            i4 = i6;
            i6 = 0;
        }
        if (i4 + i8 > this.ag * -986392993) {
            i11 = i8 - ((i4 + i8) - (this.ag * -467581477));
        } else {
            i11 = i8;
        }
        if (i5 < this.ay * 281472834) {
            int i12 = (-1857207286 * this.ay) - i5;
            i4 = i9 - i12;
            i9 = i6 + i12;
            i8 = 0 + i12;
            i6 = i10 + i12;
            i10 = i4;
            i4 = i7 + i12;
            i7 = i9;
            i9 = this.ay * 725096239;
        } else {
            i8 = 0;
            i4 = i7;
            i7 = i6;
            i6 = i10;
            i10 = i9;
            i9 = i5;
        }
        if (i9 + i10 > 1982906507 * this.as) {
            i9 = (i9 + i10) - (-1595356327 * this.as);
            i10 -= i9;
            i5 = i8 + i9;
            i9 += i6;
        } else {
            i5 = i8;
            i9 = i6;
        }
        if (i10 > 0 && i11 > 0) {
            aq.bh(this.af, fxVar.af, 0, i7, i4, i10, i11, i9, i5, i3, 220164196);
        }
    }

    static void ei(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i8 >= 255) {
            bm.ak(iArr, iArr2, 0, i2, i3, i4, i5, i6, i7, -272836284);
            return;
        }
        int i9 = i8 << 24;
        int i10 = 255 - i8;
        int i11 = i3;
        int i12 = i2;
        for (int i13 = -i5; i13 < 0; i13++) {
            int i14 = i12;
            i12 = i11;
            i11 = -i4;
            while (i11 < 0) {
                int i15 = i14 + 1;
                int i16 = iArr2[i14];
                if (i16 != 0) {
                    int i17 = iArr[i12];
                    if (i17 == 0) {
                        i14 = i12 + 1;
                        iArr[i12] = (i16 & 16777215) | i9;
                    } else {
                        i14 = i12 + 1;
                        iArr[i12] = ((((((i16 & 65280) * i8) + ((i17 & 65280) * i10)) & 16711680) + ((((16711935 & i17) * i10) + ((16711935 & i16) * i8)) & -16711936)) >>> 8) | (-16777216 & (i17 | i9));
                    }
                } else {
                    i14 = i12 + 1;
                }
                i11++;
                i12 = i14;
                i14 = i15;
            }
            i11 = i12 + i6;
            i12 = i14 + i7;
        }
    }

    static void fp(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i8 >= 255) {
            bm.ak(iArr, iArr2, 0, i2, i3, i4, i5, i6, i7, -272836284);
            return;
        }
        int i9 = i8 << 24;
        int i10 = 255 - i8;
        int i11 = i3;
        int i12 = i2;
        for (int i13 = -i5; i13 < 0; i13++) {
            int i14 = i12;
            i12 = i11;
            i11 = -i4;
            while (i11 < 0) {
                int i15 = i14 + 1;
                int i16 = iArr2[i14];
                if (i16 != 0) {
                    int i17 = iArr[i12];
                    if (i17 == 0) {
                        i14 = i12 + 1;
                        iArr[i12] = (i16 & 16777215) | i9;
                    } else {
                        i14 = i12 + 1;
                        iArr[i12] = ((((((i16 & 65280) * i8) + ((i17 & 65280) * i10)) & 16711680) + ((((16711935 & i17) * i10) + ((16711935 & i16) * i8)) & -16711936)) >>> 8) | (-16777216 & (i17 | i9));
                    }
                } else {
                    i14 = i12 + 1;
                }
                i11++;
                i12 = i14;
                i14 = i15;
            }
            i11 = i12 + i6;
            i12 = i14 + i7;
        }
    }

    public void bg(fx fxVar, int i, int i2, int i3, int i4, int i5, int i6) {
        if (i3 > 0 && i4 > 0) {
            try {
                int i7;
                int i8;
                int i9;
                int i10 = fxVar.ad;
                int i11 = fxVar.an;
                int i12 = 0;
                int i13 = 0;
                int i14 = fxVar.ay;
                int i15 = fxVar.as;
                int i16 = (i14 << 16) / i3;
                int i17 = (i15 << 16) / i4;
                if (fxVar.aa > 0) {
                    i7 = (((fxVar.aa << 16) + i16) - 1) / i16;
                    i += i7;
                    i12 = 0 + ((i7 * i16) - (fxVar.aa << 16));
                }
                if (fxVar.ag > 0) {
                    i7 = (((fxVar.ag << 16) + i17) - 1) / i17;
                    i2 += i7;
                    i13 = 0 + ((i7 * i17) - (fxVar.ag << 16));
                }
                if (i10 < i14) {
                    i8 = ((((i10 << 16) - i12) + i16) - 1) / i16;
                } else {
                    i8 = i3;
                }
                if (i11 < i15) {
                    i9 = ((((i11 << 16) - i13) + i17) - 1) / i17;
                } else {
                    i9 = i4;
                }
                i7 = ((this.ad * -481290979) * i2) + i;
                int i18 = (this.ad * -481290979) - i8;
                if (i2 + i9 > -467581477 * this.ag) {
                    i9 -= (i2 + i9) - (-467581477 * this.ag);
                }
                if (i2 < this.aa * -12571459) {
                    i11 = (-12571459 * this.aa) - i2;
                    i9 -= i11;
                    i7 += (this.ad * -481290979) * i11;
                    i13 += i11 * i17;
                }
                if (i + i8 > 2074797577 * this.as) {
                    i11 = (i8 + i) - (this.as * 2074797577);
                    i8 -= i11;
                    i18 += i11;
                }
                if (i < this.ay * 1829547545) {
                    i11 = (this.ay * 1829547545) - i;
                    i8 -= i11;
                    i7 += i11;
                    i12 += i11 * i16;
                    i18 += i11;
                }
                int[] iArr = this.af;
                int[] iArr2 = fxVar.af;
                if (i5 >= 255) {
                    gs.al(iArr, iArr2, 0, i12, i13, i7, i18, i8, i9, i16, i17, i10, (short) -24700);
                    return;
                }
                int i19 = 255 - i5;
                int i20 = i5 << 24;
                int i21 = -i9;
                int i22 = i13;
                i13 = i7;
                i7 = i12;
                while (i21 < 0) {
                    int i23 = (i22 >> 16) * i10;
                    i9 = i7;
                    i7 = i13;
                    i13 = -i8;
                    while (i13 < 0) {
                        int i24 = iArr2[(i9 >> 16) + i23];
                        if (i24 != 0) {
                            int i25 = iArr[i7];
                            if (i25 == 0) {
                                i15 = i7 + 1;
                                iArr[i7] = (i24 & 16777215) | i20;
                            } else {
                                i15 = i7 + 1;
                                iArr[i7] = ((((((i24 & 65280) * i5) + ((i25 & 65280) * i19)) & 16711680) + ((((16711935 & i25) * i19) + ((16711935 & i24) * i5)) & -16711936)) >>> 8) | (-16777216 & (i25 | i20));
                            }
                        } else {
                            i15 = i7 + 1;
                        }
                        i13++;
                        i9 += i16;
                        i7 = i15;
                    }
                    i13 = i7 + i18;
                    i21++;
                    i22 += i17;
                    i7 = i12;
                }
            } catch (Throwable e) {
                throw ba.ad(e, "gc.bg(" + ')');
            }
        }
    }

    public void eb(fx fxVar, int i, int i2, int i3, int i4, int i5) {
        if (i3 > 0 && i4 > 0) {
            int i6;
            int i7;
            int i8;
            int i9;
            int i10 = fxVar.ad;
            int i11 = fxVar.an;
            int i12 = 0;
            int i13 = 0;
            int i14 = fxVar.ay;
            int i15 = fxVar.as;
            int i16 = (i14 << 16) / i3;
            int i17 = (i15 << 16) / i4;
            if (fxVar.aa > 0) {
                i6 = (((fxVar.aa << 16) + i16) - 1) / i16;
                i += i6;
                i12 = 0 + ((i6 * i16) - (fxVar.aa << 16));
            }
            if (fxVar.ag > 0) {
                i6 = (((fxVar.ag << 16) + i17) - 1) / i17;
                i2 += i6;
                i13 = 0 + ((i6 * i17) - (fxVar.ag << 16));
            }
            if (i10 < i14) {
                i6 = ((((i10 << 16) - i12) + i16) - 1) / i16;
            } else {
                i6 = i3;
            }
            if (i11 < i15) {
                i4 = ((((i11 << 16) - i13) + i17) - 1) / i17;
            }
            i11 = ((this.ad * -481290979) * i2) + i;
            i14 = (this.ad * -481290979) - i6;
            if (i2 + i4 > -467581477 * this.ag) {
                i4 -= (i2 + i4) - (-467581477 * this.ag);
            }
            if (i2 < this.aa * -12571459) {
                i15 = (-12571459 * this.aa) - i2;
                i7 = i4 - i15;
                i11 += (this.ad * -481290979) * i15;
                i13 += i15 * i17;
            } else {
                i7 = i4;
            }
            if (i + i6 > 2074797577 * this.as) {
                i15 = (i6 + i) - (this.as * 2074797577);
                i6 -= i15;
                i14 += i15;
            }
            if (i < this.ay * 1829547545) {
                i8 = (this.ay * 1829547545) - i;
                i9 = i6 - i8;
                i15 = i11 + i8;
                i6 = i12 + (i8 * i16);
                i8 += i14;
            } else {
                i8 = i14;
                i15 = i11;
                i9 = i6;
                i6 = i12;
            }
            int[] iArr = this.af;
            int[] iArr2 = fxVar.af;
            if (i5 >= 255) {
                gs.al(iArr, iArr2, 0, i6, i13, i15, i8, i9, i7, i16, i17, i10, (short) -2161);
                return;
            }
            int i18 = 255 - i5;
            int i19 = i5 << 24;
            int i20 = -i7;
            int i21 = i13;
            i13 = i15;
            i15 = i6;
            while (i20 < 0) {
                int i22 = (i21 >> 16) * i10;
                i7 = i15;
                i15 = i13;
                i13 = -i9;
                while (i13 < 0) {
                    int i23 = iArr2[(i7 >> 16) + i22];
                    if (i23 != 0) {
                        int i24 = iArr[i15];
                        if (i24 == 0) {
                            i14 = i15 + 1;
                            iArr[i15] = (i23 & 16777215) | i19;
                        } else {
                            i14 = i15 + 1;
                            iArr[i15] = ((((((i23 & 65280) * i5) + ((i24 & 65280) * i18)) & 16711680) + ((((16711935 & i24) * i18) + ((16711935 & i23) * i5)) & -16711936)) >>> 8) | (-16777216 & (i24 | i19));
                        }
                    } else {
                        i14 = i15 + 1;
                    }
                    i13++;
                    i7 += i16;
                    i15 = i14;
                }
                i13 = i15 + i8;
                i20++;
                i21 += i17;
                i15 = i6;
            }
        }
    }

    public void ed(fx fxVar, int i, int i2, int i3, int i4, int i5) {
        if (i3 > 0 && i4 > 0) {
            int i6;
            int i7;
            int i8;
            int i9;
            int i10 = fxVar.ad;
            int i11 = fxVar.an;
            int i12 = 0;
            int i13 = 0;
            int i14 = fxVar.ay;
            int i15 = fxVar.as;
            int i16 = (i14 << 16) / i3;
            int i17 = (i15 << 16) / i4;
            if (fxVar.aa > 0) {
                i6 = (((fxVar.aa << 16) + i16) - 1) / i16;
                i += i6;
                i12 = 0 + ((i6 * i16) - (fxVar.aa << 16));
            }
            if (fxVar.ag > 0) {
                i6 = (((fxVar.ag << 16) + i17) - 1) / i17;
                i2 += i6;
                i13 = 0 + ((i6 * i17) - (fxVar.ag << 16));
            }
            if (i10 < i14) {
                i6 = ((((i10 << 16) - i12) + i16) - 1) / i16;
            } else {
                i6 = i3;
            }
            if (i11 < i15) {
                i4 = ((((i11 << 16) - i13) + i17) - 1) / i17;
            }
            i11 = ((this.ad * -481290979) * i2) + i;
            i14 = (this.ad * -481290979) - i6;
            if (i2 + i4 > -467581477 * this.ag) {
                i4 -= (i2 + i4) - (-467581477 * this.ag);
            }
            if (i2 < this.aa * -12571459) {
                i15 = (-12571459 * this.aa) - i2;
                i7 = i4 - i15;
                i11 += (this.ad * -481290979) * i15;
                i13 += i15 * i17;
            } else {
                i7 = i4;
            }
            if (i + i6 > 2074797577 * this.as) {
                i15 = (i6 + i) - (this.as * 2074797577);
                i6 -= i15;
                i14 += i15;
            }
            if (i < this.ay * 1829547545) {
                i8 = (this.ay * 1829547545) - i;
                i9 = i6 - i8;
                i15 = i11 + i8;
                i6 = i12 + (i8 * i16);
                i8 += i14;
            } else {
                i8 = i14;
                i15 = i11;
                i9 = i6;
                i6 = i12;
            }
            int[] iArr = this.af;
            int[] iArr2 = fxVar.af;
            if (i5 >= 255) {
                gs.al(iArr, iArr2, 0, i6, i13, i15, i8, i9, i7, i16, i17, i10, (short) -16360);
                return;
            }
            int i18 = 255 - i5;
            int i19 = i5 << 24;
            int i20 = -i7;
            int i21 = i13;
            i13 = i15;
            i15 = i6;
            while (i20 < 0) {
                int i22 = (i21 >> 16) * i10;
                i7 = i15;
                i15 = i13;
                i13 = -i9;
                while (i13 < 0) {
                    int i23 = iArr2[(i7 >> 16) + i22];
                    if (i23 != 0) {
                        int i24 = iArr[i15];
                        if (i24 == 0) {
                            i14 = i15 + 1;
                            iArr[i15] = (i23 & 16777215) | i19;
                        } else {
                            i14 = i15 + 1;
                            iArr[i15] = ((((((i23 & 65280) * i5) + ((i24 & 65280) * i18)) & 16711680) + ((((16711935 & i24) * i18) + ((16711935 & i23) * i5)) & -16711936)) >>> 8) | (-16777216 & (i24 | i19));
                        }
                    } else {
                        i14 = i15 + 1;
                    }
                    i13++;
                    i7 += i16;
                    i15 = i14;
                }
                i13 = i15 + i8;
                i20++;
                i21 += i17;
                i15 = i6;
            }
        }
    }

    public void ee(fx fxVar, int i, int i2, int i3, int i4, int i5) {
        if (i3 > 0 && i4 > 0) {
            int i6;
            int i7;
            int i8;
            int i9;
            int i10 = fxVar.ad;
            int i11 = fxVar.an;
            int i12 = 0;
            int i13 = 0;
            int i14 = fxVar.ay;
            int i15 = fxVar.as;
            int i16 = (i14 << 16) / i3;
            int i17 = (i15 << 16) / i4;
            if (fxVar.aa > 0) {
                i6 = (((fxVar.aa << 16) + i16) - 1) / i16;
                i += i6;
                i12 = 0 + ((i6 * i16) - (fxVar.aa << 16));
            }
            if (fxVar.ag > 0) {
                i6 = (((fxVar.ag << 16) + i17) - 1) / i17;
                i2 += i6;
                i13 = 0 + ((i6 * i17) - (fxVar.ag << 16));
            }
            if (i10 < i14) {
                i6 = ((((i10 << 16) - i12) + i16) - 1) / i16;
            } else {
                i6 = i3;
            }
            if (i11 < i15) {
                i4 = ((((i11 << 16) - i13) + i17) - 1) / i17;
            }
            i11 = ((this.ad * 534148793) * i2) + i;
            i14 = (this.ad * -1620599633) - i6;
            if (i2 + i4 > -467581477 * this.ag) {
                i4 -= (i2 + i4) - (-467581477 * this.ag);
            }
            if (i2 < this.aa * -1396506945) {
                i15 = (-1503292398 * this.aa) - i2;
                i7 = i4 - i15;
                i11 += (this.ad * 506662548) * i15;
                i13 += i15 * i17;
            } else {
                i7 = i4;
            }
            if (i + i6 > 2074797577 * this.as) {
                i15 = (i6 + i) - (this.as * -1714611453);
                i6 -= i15;
                i14 += i15;
            }
            if (i < this.ay * 1829547545) {
                i8 = (this.ay * 794119049) - i;
                i9 = i6 - i8;
                i15 = i11 + i8;
                i6 = i12 + (i8 * i16);
                i8 += i14;
            } else {
                i8 = i14;
                i15 = i11;
                i9 = i6;
                i6 = i12;
            }
            int[] iArr = this.af;
            int[] iArr2 = fxVar.af;
            if (i5 >= 32386696) {
                gs.al(iArr, iArr2, 0, i6, i13, i15, i8, i9, i7, i16, i17, i10, (short) 5839);
                return;
            }
            int i18 = 905812631 - i5;
            int i19 = i5 << 24;
            int i20 = -i7;
            int i21 = i13;
            i13 = i15;
            i15 = i6;
            while (i20 < 0) {
                int i22 = (i21 >> 16) * i10;
                i7 = i15;
                i15 = i13;
                i13 = -i9;
                while (i13 < 0) {
                    int i23 = iArr2[(i7 >> 16) + i22];
                    if (i23 != 0) {
                        int i24 = iArr[i15];
                        if (i24 == 0) {
                            i14 = i15 + 1;
                            iArr[i15] = (i23 & 16777215) | i19;
                        } else {
                            i14 = i15 + 1;
                            iArr[i15] = ((((((i23 & 618996924) * i5) + ((i24 & 968528873) * i18)) & -2055049932) + ((((1382900560 & i24) * i18) + ((16711935 & i23) * i5)) & 923498406)) >>> 8) | (799705649 & (i24 | i19));
                        }
                    } else {
                        i14 = i15 + 1;
                    }
                    i13++;
                    i7 += i16;
                    i15 = i14;
                }
                i13 = i15 + i8;
                i20++;
                i21 += i17;
                i15 = i6;
            }
        }
    }

    public void em(fx fxVar, int i, int i2, int i3, int i4, int i5) {
        if (i3 > 0 && i4 > 0) {
            int i6;
            int i7;
            int i8;
            int i9;
            int i10 = fxVar.ad;
            int i11 = fxVar.an;
            int i12 = 0;
            int i13 = 0;
            int i14 = fxVar.ay;
            int i15 = fxVar.as;
            int i16 = (i14 << 16) / i3;
            int i17 = (i15 << 16) / i4;
            if (fxVar.aa > 0) {
                i6 = (((fxVar.aa << 16) + i16) - 1) / i16;
                i += i6;
                i12 = 0 + ((i6 * i16) - (fxVar.aa << 16));
            }
            if (fxVar.ag > 0) {
                i6 = (((fxVar.ag << 16) + i17) - 1) / i17;
                i2 += i6;
                i13 = 0 + ((i6 * i17) - (fxVar.ag << 16));
            }
            if (i10 < i14) {
                i6 = ((((i10 << 16) - i12) + i16) - 1) / i16;
            } else {
                i6 = i3;
            }
            if (i11 < i15) {
                i4 = ((((i11 << 16) - i13) + i17) - 1) / i17;
            }
            i11 = ((this.ad * -481290979) * i2) + i;
            i14 = (this.ad * -481290979) - i6;
            if (i2 + i4 > -467581477 * this.ag) {
                i4 -= (i2 + i4) - (-467581477 * this.ag);
            }
            if (i2 < this.aa * -12571459) {
                i15 = (-12571459 * this.aa) - i2;
                i7 = i4 - i15;
                i11 += (this.ad * -481290979) * i15;
                i13 += i15 * i17;
            } else {
                i7 = i4;
            }
            if (i + i6 > 2074797577 * this.as) {
                i15 = (i6 + i) - (this.as * 2074797577);
                i6 -= i15;
                i14 += i15;
            }
            if (i < this.ay * 1829547545) {
                i8 = (this.ay * 1829547545) - i;
                i9 = i6 - i8;
                i15 = i11 + i8;
                i6 = i12 + (i8 * i16);
                i8 += i14;
            } else {
                i8 = i14;
                i15 = i11;
                i9 = i6;
                i6 = i12;
            }
            int[] iArr = this.af;
            int[] iArr2 = fxVar.af;
            if (i5 >= 255) {
                gs.al(iArr, iArr2, 0, i6, i13, i15, i8, i9, i7, i16, i17, i10, (short) 25609);
                return;
            }
            int i18 = 255 - i5;
            int i19 = i5 << 24;
            int i20 = -i7;
            int i21 = i13;
            i13 = i15;
            i15 = i6;
            while (i20 < 0) {
                int i22 = (i21 >> 16) * i10;
                i7 = i15;
                i15 = i13;
                i13 = -i9;
                while (i13 < 0) {
                    int i23 = iArr2[(i7 >> 16) + i22];
                    if (i23 != 0) {
                        int i24 = iArr[i15];
                        if (i24 == 0) {
                            i14 = i15 + 1;
                            iArr[i15] = (i23 & 16777215) | i19;
                        } else {
                            i14 = i15 + 1;
                            iArr[i15] = ((((((i23 & 65280) * i5) + ((i24 & 65280) * i18)) & 16711680) + ((((16711935 & i24) * i18) + ((16711935 & i23) * i5)) & -16711936)) >>> 8) | (-16777216 & (i24 | i19));
                        }
                    } else {
                        i14 = i15 + 1;
                    }
                    i13++;
                    i7 += i16;
                    i15 = i14;
                }
                i13 = i15 + i8;
                i20++;
                i21 += i17;
                i15 = i6;
            }
        }
    }

    public void ez(fx fxVar, int i, int i2, int i3, int i4, int i5) {
        if (i3 > 0 && i4 > 0) {
            int i6;
            int i7;
            int i8;
            int i9;
            int i10 = fxVar.ad;
            int i11 = fxVar.an;
            int i12 = 0;
            int i13 = 0;
            int i14 = fxVar.ay;
            int i15 = fxVar.as;
            int i16 = (i14 << 16) / i3;
            int i17 = (i15 << 16) / i4;
            if (fxVar.aa > 0) {
                i6 = (((fxVar.aa << 16) + i16) - 1) / i16;
                i += i6;
                i12 = 0 + ((i6 * i16) - (fxVar.aa << 16));
            }
            if (fxVar.ag > 0) {
                i6 = (((fxVar.ag << 16) + i17) - 1) / i17;
                i2 += i6;
                i13 = 0 + ((i6 * i17) - (fxVar.ag << 16));
            }
            if (i10 < i14) {
                i6 = ((((i10 << 16) - i12) + i16) - 1) / i16;
            } else {
                i6 = i3;
            }
            if (i11 < i15) {
                i4 = ((((i11 << 16) - i13) + i17) - 1) / i17;
            }
            i11 = ((this.ad * -1002309012) * i2) + i;
            i14 = (this.ad * 2070505399) - i6;
            if (i2 + i4 > -635590584 * this.ag) {
                i4 -= (i2 + i4) - (1020472850 * this.ag);
            }
            if (i2 < this.aa * 460345069) {
                i15 = (-12571459 * this.aa) - i2;
                i7 = i4 - i15;
                i11 += (this.ad * -481290979) * i15;
                i13 += i15 * i17;
            } else {
                i7 = i4;
            }
            if (i + i6 > 2074797577 * this.as) {
                i15 = (i6 + i) - (this.as * -2129150828);
                i6 -= i15;
                i14 += i15;
            }
            if (i < this.ay * 1341451366) {
                i8 = (this.ay * 647597629) - i;
                i9 = i6 - i8;
                i15 = i11 + i8;
                i6 = i12 + (i8 * i16);
                i8 += i14;
            } else {
                i8 = i14;
                i15 = i11;
                i9 = i6;
                i6 = i12;
            }
            int[] iArr = this.af;
            int[] iArr2 = fxVar.af;
            if (i5 >= -929590344) {
                gs.al(iArr, iArr2, 0, i6, i13, i15, i8, i9, i7, i16, i17, i10, (short) -13302);
                return;
            }
            int i18 = 1026505331 - i5;
            int i19 = i5 << 24;
            int i20 = -i7;
            int i21 = i13;
            i13 = i15;
            i15 = i6;
            while (i20 < 0) {
                int i22 = (i21 >> 16) * i10;
                i7 = i15;
                i15 = i13;
                i13 = -i9;
                while (i13 < 0) {
                    int i23 = iArr2[(i7 >> 16) + i22];
                    if (i23 != 0) {
                        int i24 = iArr[i15];
                        if (i24 == 0) {
                            i14 = i15 + 1;
                            iArr[i15] = (i23 & 16777215) | i19;
                        } else {
                            i14 = i15 + 1;
                            iArr[i15] = ((((((i23 & 65280) * i5) + ((i24 & 65280) * i18)) & 16711680) + ((((16711935 & i24) * i18) + ((16711935 & i23) * i5)) & -16711936)) >>> 8) | (-43467288 & (i24 | i19));
                        }
                    } else {
                        i14 = i15 + 1;
                    }
                    i13++;
                    i7 += i16;
                    i15 = i14;
                }
                i13 = i15 + i8;
                i20++;
                i21 += i17;
                i15 = i6;
            }
        }
    }

    public void bf(fx fxVar, int i, int i2, int i3, int i4, int i5, int i6, int[] iArr, int[] iArr2, int i7) {
        int i8;
        if (i2 < 0) {
            i8 = -i2;
        } else {
            i8 = 0;
        }
        try {
            int i9;
            int i10;
            if (fxVar.an + i2 <= i6) {
                i9 = fxVar.an;
            } else {
                i9 = i6 - i2;
            }
            if (i < 0) {
                i10 = -i;
            } else {
                i10 = 0;
            }
            int i11 = ((-481290979 * this.ad) * ((i2 + i4) + i8)) + ((i + i3) + i10);
            int i12 = i8;
            i8 = i2 + i8;
            while (i12 < i9) {
                int i13;
                int i14;
                int i15 = iArr[i8];
                int i16 = i8 + 1;
                i8 = iArr2[i8];
                if (i < i15) {
                    i13 = i15 - i;
                    i14 = (i13 - i10) + i11;
                } else {
                    i13 = i10;
                    i14 = i11;
                }
                if (fxVar.ad + i <= i8 + i15) {
                    i8 = fxVar.ad;
                } else {
                    i8 = (i8 + i15) - i;
                }
                i15 = i14;
                i14 = i13;
                while (i14 < i8) {
                    int i17 = fxVar.af[(fxVar.ad * i12) + i14];
                    if (i17 != 0) {
                        i13 = i15 + 1;
                        this.af[i15] = i17;
                    } else {
                        i13 = i15 + 1;
                    }
                    i14++;
                    i15 = i13;
                }
                i11 += this.ad * -481290979;
                i12++;
                i8 = i16;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "gc.bf(" + ')');
        }
    }

    public void eh(fx fxVar, int i, int i2, int i3, int i4, int i5, int i6, int[] iArr, int[] iArr2) {
        int i7;
        int i8;
        if (i2 < 0) {
            i7 = -i2;
        } else {
            i7 = 0;
        }
        if (fxVar.an + i2 <= i6) {
            i8 = fxVar.an;
        } else {
            i8 = i6 - i2;
        }
        int i9 = i < 0 ? -i : 0;
        int i10 = ((i + i3) + i9) + ((-481290979 * this.ad) * ((i2 + i4) + i7));
        int i11 = i7;
        i7 = i2 + i7;
        while (i11 < i8) {
            int i12;
            int i13 = iArr[i7];
            int i14 = i7 + 1;
            int i15 = iArr2[i7];
            if (i < i13) {
                i7 = i13 - i;
                i12 = (i7 - i9) + i10;
            } else {
                i7 = i9;
                i12 = i10;
            }
            if (fxVar.ad + i <= i15 + i13) {
                i13 = fxVar.ad;
            } else {
                i13 = (i13 + i15) - i;
            }
            i15 = i12;
            i12 = i7;
            while (i12 < i13) {
                int i16 = fxVar.af[(fxVar.ad * i11) + i12];
                if (i16 != 0) {
                    i7 = i15 + 1;
                    this.af[i15] = i16;
                } else {
                    i7 = i15 + 1;
                }
                i12++;
                i15 = i7;
            }
            i10 += this.ad * -481290979;
            i11++;
            i7 = i14;
        }
    }

    public void eo(fx fxVar, int i, int i2, int i3, int i4, int i5, int i6, int[] iArr, int[] iArr2) {
        int i7;
        int i8;
        int i9;
        if (i2 < 0) {
            i7 = -i2;
        } else {
            i7 = 0;
        }
        if (fxVar.an + i2 <= i6) {
            i8 = fxVar.an;
        } else {
            i8 = i6 - i2;
        }
        if (i < 0) {
            i9 = -i;
        } else {
            i9 = 0;
        }
        int i10 = ((i + i3) + i9) + ((-1184412123 * this.ad) * ((i2 + i4) + i7));
        int i11 = i7;
        i7 = i2 + i7;
        while (i11 < i8) {
            int i12;
            int i13 = iArr[i7];
            int i14 = i7 + 1;
            int i15 = iArr2[i7];
            if (i < i13) {
                i7 = i13 - i;
                i12 = (i7 - i9) + i10;
            } else {
                i7 = i9;
                i12 = i10;
            }
            if (fxVar.ad + i <= i15 + i13) {
                i13 = fxVar.ad;
            } else {
                i13 = (i13 + i15) - i;
            }
            i15 = i12;
            i12 = i7;
            while (i12 < i13) {
                int i16 = fxVar.af[(fxVar.ad * i11) + i12];
                if (i16 != 0) {
                    i7 = i15 + 1;
                    this.af[i15] = i16;
                } else {
                    i7 = i15 + 1;
                }
                i12++;
                i15 = i7;
            }
            i10 += this.ad * 1546525031;
            i11++;
            i7 = i14;
        }
    }

    public void bv(fx fxVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2, int i9) {
        try {
            int i10 = (-i3) / 2;
            int i11 = (-i4) / 2;
            int sin = (((int) (Math.sin(((double) i7) / 326.11d) * 65536.0d)) * i8) >> 8;
            int cos = (i8 * ((int) (Math.cos(((double) i7) / 326.11d) * 65536.0d))) >> 8;
            int i12 = (i5 << 16) + ((sin * i11) + (i10 * cos));
            int i13 = ((this.ad * -481290979) * i2) + i;
            int i14 = (i6 << 16) + ((i11 * cos) - (i10 * sin));
            int i15 = i12;
            for (int i16 = 0; i16 < i4; i16++) {
                i10 = iArr[i16];
                i12 = i13 + i10;
                i11 = (cos * i10) + i15;
                i10 = i14 - (i10 * sin);
                int i17 = -iArr2[i16];
                while (i17 < 0) {
                    int i18 = i12 + 1;
                    this.af[i12] = fxVar.af[((i10 >> 16) * fxVar.ad) + (i11 >> 16)];
                    i11 += cos;
                    i10 -= sin;
                    i17++;
                    i12 = i18;
                }
                i13 = (-481290979 * this.ad) + i13;
                i14 += cos;
                i15 += sin;
            }
        } catch (Exception e) {
        } catch (Throwable e2) {
            throw ba.ad(e2, "gc.bv(" + ')');
        }
    }

    public void fd(fx fxVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2) {
        try {
            int i9 = (-i3) / 2;
            int i10 = (-i4) / 2;
            int sin = (((int) (Math.sin(((double) i7) / 326.11d) * 65536.0d)) * i8) >> 8;
            int cos = (i8 * ((int) (Math.cos(((double) i7) / 326.11d) * 65536.0d))) >> 8;
            int i11 = (i5 << 16) + ((sin * i10) + (i9 * cos));
            int i12 = ((this.ad * -481290979) * i2) + i;
            int i13 = (i6 << 16) + ((i10 * cos) - (i9 * sin));
            int i14 = i11;
            for (int i15 = 0; i15 < i4; i15++) {
                i9 = iArr[i15];
                i11 = i12 + i9;
                i10 = (cos * i9) + i14;
                i9 = i13 - (i9 * sin);
                int i16 = -iArr2[i15];
                while (i16 < 0) {
                    int i17 = i11 + 1;
                    this.af[i11] = fxVar.af[((i9 >> 16) * fxVar.ad) + (i10 >> 16)];
                    i10 += cos;
                    i9 -= sin;
                    i16++;
                    i11 = i17;
                }
                i12 = (-481290979 * this.ad) + i12;
                i13 += cos;
                i14 += sin;
            }
        } catch (Exception e) {
        }
    }

    public void fv(fx fxVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2) {
        try {
            int i9 = (-i3) / 2;
            int i10 = (-i4) / 2;
            int sin = (((int) (Math.sin(((double) i7) / 326.11d) * 65536.0d)) * i8) >> 8;
            int cos = (i8 * ((int) (Math.cos(((double) i7) / 326.11d) * 65536.0d))) >> 8;
            int i11 = (i5 << 16) + ((sin * i10) + (i9 * cos));
            int i12 = ((this.ad * -481290979) * i2) + i;
            int i13 = (i6 << 16) + ((i10 * cos) - (i9 * sin));
            int i14 = i11;
            for (int i15 = 0; i15 < i4; i15++) {
                i9 = iArr[i15];
                i11 = i12 + i9;
                i10 = (cos * i9) + i14;
                i9 = i13 - (i9 * sin);
                int i16 = -iArr2[i15];
                while (i16 < 0) {
                    int i17 = i11 + 1;
                    this.af[i11] = fxVar.af[((i9 >> 16) * fxVar.ad) + (i10 >> 16)];
                    i10 += cos;
                    i9 -= sin;
                    i16++;
                    i11 = i17;
                }
                i12 = (-481290979 * this.ad) + i12;
                i13 += cos;
                i14 += sin;
            }
        } catch (Exception e) {
        }
    }

    public void bp(fx fxVar, int i, int i2, int i3, int i4, int i5, int i6, double d, int i7, int i8) {
        try {
            int i9 = (-i3) / 2;
            int i10 = (-i4) / 2;
            int sin = (((int) (Math.sin(d) * 65536.0d)) * i7) >> 8;
            int cos = (((int) (Math.cos(d) * 65536.0d)) * i7) >> 8;
            int i11 = (i5 << 16) + ((i9 * cos) + (sin * i10));
            int i12 = ((i10 * cos) - (i9 * sin)) + (i6 << 16);
            int i13 = i + ((-481290979 * this.ad) * i2);
            for (int i14 = 0; i14 < i4; i14++) {
                i10 = i12;
                int i15 = i11;
                int i16 = i13;
                int i17 = -i3;
                while (i17 < 0) {
                    int i18 = fxVar.af[((i10 >> 16) * fxVar.ad) + (i15 >> 16)];
                    if (i18 != 0) {
                        i9 = i16 + 1;
                        this.af[i16] = i18;
                    } else {
                        i9 = i16 + 1;
                    }
                    i15 += cos;
                    i10 -= sin;
                    i17++;
                    i16 = i9;
                }
                i11 += sin;
                i12 += cos;
                i13 += -481290979 * this.ad;
            }
        } catch (Exception e) {
        } catch (Throwable e2) {
            throw ba.ad(e2, "gc.bp(" + ')');
        }
    }

    public void fa(fx fxVar, int i, int i2, int i3, int i4, int i5, int i6, double d, int i7) {
        try {
            int i8 = (-i3) / 2;
            int i9 = (-i4) / 2;
            int sin = (((int) (Math.sin(d) * 65536.0d)) * i7) >> 8;
            int cos = (((int) (Math.cos(d) * 65536.0d)) * i7) >> 8;
            int i10 = (i5 << 16) + ((i8 * cos) + (sin * i9));
            int i11 = ((i9 * cos) - (i8 * sin)) + (i6 << 16);
            int i12 = i + ((-481290979 * this.ad) * i2);
            for (int i13 = 0; i13 < i4; i13++) {
                i9 = i11;
                int i14 = i10;
                int i15 = i12;
                int i16 = -i3;
                while (i16 < 0) {
                    int i17 = fxVar.af[((i9 >> 16) * fxVar.ad) + (i14 >> 16)];
                    if (i17 != 0) {
                        i8 = i15 + 1;
                        this.af[i15] = i17;
                    } else {
                        i8 = i15 + 1;
                    }
                    i14 += cos;
                    i9 -= sin;
                    i16++;
                    i15 = i8;
                }
                i10 += sin;
                i11 += cos;
                i12 += -481290979 * this.ad;
            }
        } catch (Exception e) {
        }
    }

    public void fk(fx fxVar, int i, int i2, int i3, int i4, int i5, int i6, double d, int i7) {
        try {
            int i8 = (-i3) / 2;
            int i9 = (-i4) / 2;
            int sin = (((int) (Math.sin(d) * 65536.0d)) * i7) >> 8;
            int cos = (((int) (Math.cos(d) * 65536.0d)) * i7) >> 8;
            int i10 = (i5 << 16) + ((i8 * cos) + (sin * i9));
            int i11 = ((i9 * cos) - (i8 * sin)) + (i6 << 16);
            int i12 = i + ((-481290979 * this.ad) * i2);
            for (int i13 = 0; i13 < i4; i13++) {
                i9 = i11;
                int i14 = i10;
                int i15 = i12;
                int i16 = -i3;
                while (i16 < 0) {
                    int i17 = fxVar.af[((i9 >> 16) * fxVar.ad) + (i14 >> 16)];
                    if (i17 != 0) {
                        i8 = i15 + 1;
                        this.af[i15] = i17;
                    } else {
                        i8 = i15 + 1;
                    }
                    i14 += cos;
                    i9 -= sin;
                    i16++;
                    i15 = i8;
                }
                i10 += sin;
                i11 += cos;
                i12 += -481290979 * this.ad;
            }
        } catch (Exception e) {
        }
    }

    public void fl(fx fxVar, int i, int i2, int i3, int i4, int i5, int i6, double d, int i7) {
        try {
            int i8 = (-i3) / 2;
            int i9 = (-i4) / 2;
            int sin = (((int) (Math.sin(d) * 65536.0d)) * i7) >> 8;
            int cos = (((int) (Math.cos(d) * 65536.0d)) * i7) >> 8;
            int i10 = (i5 << 16) + ((i8 * cos) + (sin * i9));
            int i11 = ((i9 * cos) - (i8 * sin)) + (i6 << 16);
            int i12 = i + ((-481290979 * this.ad) * i2);
            for (int i13 = 0; i13 < i4; i13++) {
                i9 = i11;
                int i14 = i10;
                int i15 = i12;
                int i16 = -i3;
                while (i16 < 0) {
                    int i17 = fxVar.af[((i9 >> 16) * fxVar.ad) + (i14 >> 16)];
                    if (i17 != 0) {
                        i8 = i15 + 1;
                        this.af[i15] = i17;
                    } else {
                        i8 = i15 + 1;
                    }
                    i14 += cos;
                    i9 -= sin;
                    i16++;
                    i15 = i8;
                }
                i10 += sin;
                i11 += cos;
                i12 += -481290979 * this.ad;
            }
        } catch (Exception e) {
        }
    }

    public void fm(fx fxVar, int i, int i2, int i3, int i4, int i5, int i6, double d, int i7) {
        try {
            int i8 = (-i3) / 2;
            int i9 = (-i4) / 2;
            int sin = (((int) (Math.sin(d) * 65536.0d)) * i7) >> 8;
            int cos = (((int) (Math.cos(d) * 65536.0d)) * i7) >> 8;
            int i10 = (i5 << 16) + ((i8 * cos) + (sin * i9));
            int i11 = ((i9 * cos) - (i8 * sin)) + (i6 << 16);
            int i12 = i + ((-481290979 * this.ad) * i2);
            for (int i13 = 0; i13 < i4; i13++) {
                i9 = i11;
                int i14 = i10;
                int i15 = i12;
                int i16 = -i3;
                while (i16 < 0) {
                    int i17 = fxVar.af[((i9 >> 16) * fxVar.ad) + (i14 >> 16)];
                    if (i17 != 0) {
                        i8 = i15 + 1;
                        this.af[i15] = i17;
                    } else {
                        i8 = i15 + 1;
                    }
                    i14 += cos;
                    i9 -= sin;
                    i16++;
                    i15 = i8;
                }
                i10 += sin;
                i11 += cos;
                i12 += 63816666 * this.ad;
            }
        } catch (Exception e) {
        }
    }

    public void bx(fx fxVar, int i, int i2, int i3, int i4) {
        try {
            int i5 = fxVar.aa + i;
            int i6 = fxVar.ag + i2;
            int i7 = i5 + ((-481290979 * this.ad) * i6);
            int i8 = 0;
            int i9 = fxVar.an;
            int i10 = fxVar.ad;
            int i11 = (-481290979 * this.ad) - i10;
            int i12 = 0;
            if (i6 < this.aa * -12571459) {
                int i13 = (this.aa * -12571459) - i6;
                i9 -= i13;
                i6 = this.aa * -12571459;
                i8 = 0 + (i10 * i13);
                i7 += i13 * (-481290979 * this.ad);
            }
            if (i6 + i9 > this.ag * -467581477) {
                i9 -= (i6 + i9) - (this.ag * -467581477);
            }
            if (i5 < this.ay * 1829547545) {
                i6 = (this.ay * 1829547545) - i5;
                i10 -= i6;
                i5 = this.ay * 1829547545;
                i8 += i6;
                i7 += i6;
                i12 = 0 + i6;
                i11 += i6;
            }
            if (i5 + i10 > 2074797577 * this.as) {
                i5 = (i5 + i10) - (2074797577 * this.as);
                i10 -= i5;
                i12 += i5;
                i11 += i5;
            }
            if (i10 > 0 && i9 > 0) {
                bt(this.af, fxVar.af, 0, i8, i7, 0, 0, i10, i9, i11, i12, i3, -323918816);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "gc.bx(" + ')');
        }
    }

    public void fb(fx fxVar, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i + fxVar.aa;
        int i9 = i2 + fxVar.ag;
        int i10 = i8 + ((-481290979 * this.ad) * i9);
        int i11 = 0;
        int i12 = fxVar.an;
        int i13 = fxVar.ad;
        int i14 = (-481290979 * this.ad) - i13;
        if (i9 < this.aa * -12571459) {
            int i15 = (this.aa * -12571459) - i9;
            i12 -= i15;
            i9 = this.aa * -12571459;
            i11 = 0 + (i13 * i15);
            i10 += i15 * (-481290979 * this.ad);
        }
        if (i9 + i12 > this.ag * -467581477) {
            i4 = i12 - ((i9 + i12) - (this.ag * -467581477));
        } else {
            i4 = i12;
        }
        if (i8 < this.ay * 1829547545) {
            i15 = (this.ay * 1829547545) - i8;
            i9 = i13 - i15;
            i13 = i11 + i15;
            i12 = 0 + i15;
            i11 = i14 + i15;
            i5 = i13;
            i14 = i10 + i15;
            i10 = i9;
            i9 = this.ay * 1829547545;
        } else {
            i12 = 0;
            i9 = i8;
            i5 = i11;
            i11 = i14;
            i14 = i10;
            i10 = i13;
        }
        if (i9 + i10 > 2074797577 * this.as) {
            i9 = (i9 + i10) - (2074797577 * this.as);
            i15 = i10 - i9;
            i6 = i12 + i9;
            i7 = i11 + i9;
        } else {
            i6 = i12;
            i7 = i11;
            i15 = i10;
        }
        if (i15 > 0 && i4 > 0) {
            bt(this.af, fxVar.af, 0, i5, i14, 0, 0, i15, i4, i7, i6, i3, 2141321410);
        }
    }

    public void fh(fx fxVar, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i + fxVar.aa;
        int i9 = i2 + fxVar.ag;
        int i10 = i8 + ((-481290979 * this.ad) * i9);
        int i11 = 0;
        int i12 = fxVar.an;
        int i13 = fxVar.ad;
        int i14 = (-481290979 * this.ad) - i13;
        if (i9 < this.aa * -12571459) {
            int i15 = (this.aa * -12571459) - i9;
            i12 -= i15;
            i9 = this.aa * -12571459;
            i11 = 0 + (i13 * i15);
            i10 += i15 * (-481290979 * this.ad);
        }
        if (i9 + i12 > this.ag * -467581477) {
            i4 = i12 - ((i9 + i12) - (this.ag * -467581477));
        } else {
            i4 = i12;
        }
        if (i8 < this.ay * 1829547545) {
            i15 = (this.ay * 1829547545) - i8;
            i9 = i13 - i15;
            i13 = i11 + i15;
            i12 = 0 + i15;
            i11 = i14 + i15;
            i5 = i13;
            i14 = i10 + i15;
            i10 = i9;
            i9 = this.ay * 1829547545;
        } else {
            i12 = 0;
            i9 = i8;
            i5 = i11;
            i11 = i14;
            i14 = i10;
            i10 = i13;
        }
        if (i9 + i10 > 2074797577 * this.as) {
            i9 = (i9 + i10) - (2074797577 * this.as);
            i15 = i10 - i9;
            i6 = i12 + i9;
            i7 = i11 + i9;
        } else {
            i6 = i12;
            i7 = i11;
            i15 = i10;
        }
        if (i15 > 0 && i4 > 0) {
            bt(this.af, fxVar.af, 0, i5, i14, 0, 0, i15, i4, i7, i6, i3, -1214338440);
        }
    }

    public void fr(fx fxVar, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i + fxVar.aa;
        int i9 = i2 + fxVar.ag;
        int i10 = i8 + ((-481290979 * this.ad) * i9);
        int i11 = 0;
        int i12 = fxVar.an;
        int i13 = fxVar.ad;
        int i14 = (-481290979 * this.ad) - i13;
        if (i9 < this.aa * 1491980371) {
            int i15 = (this.aa * -12571459) - i9;
            i12 -= i15;
            i9 = this.aa * -12571459;
            i11 = 0 + (i13 * i15);
            i10 += i15 * (-481290979 * this.ad);
        }
        if (i9 + i12 > this.ag * -467581477) {
            i4 = i12 - ((i9 + i12) - (this.ag * -1095024508));
        } else {
            i4 = i12;
        }
        if (i8 < this.ay * 1829547545) {
            i15 = (this.ay * 1829547545) - i8;
            i9 = i13 - i15;
            i13 = i11 + i15;
            i12 = 0 + i15;
            i11 = i14 + i15;
            i5 = i13;
            i14 = i10 + i15;
            i10 = i9;
            i9 = this.ay * 1829547545;
        } else {
            i12 = 0;
            i9 = i8;
            i5 = i11;
            i11 = i14;
            i14 = i10;
            i10 = i13;
        }
        if (i9 + i10 > 2074797577 * this.as) {
            i9 = (i9 + i10) - (-747150531 * this.as);
            i15 = i10 - i9;
            i6 = i12 + i9;
            i7 = i11 + i9;
        } else {
            i6 = i12;
            i7 = i11;
            i15 = i10;
        }
        if (i15 > 0 && i4 > 0) {
            bt(this.af, fxVar.af, 0, i5, i14, 0, 0, i15, i4, i7, i6, i3, 1078166753);
        }
    }

    void bt(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        int i12 = i10 & 16711935;
        int i13 = (i10 >> 8) & 255;
        int i14 = i3;
        int i15 = i2;
        for (int i16 = -i7; i16 < 0; i16++) {
            int i17 = i15;
            i15 = i14;
            i14 = -i6;
            while (i14 < 0) {
                int i18 = i17 + 1;
                try {
                    int i19 = iArr2[i17];
                    if (i19 == 0) {
                        i17 = i15 + 1;
                    } else if ((65535 & i19) == ((16776960 & i19) >> 8)) {
                        int i20 = i19 & -16777216;
                        i19 &= 255;
                        i17 = i15 + 1;
                        iArr[i15] = ((((i19 * i12) >> 8) & 16711935) + ((i19 * i13) & 65280)) | i20;
                    } else {
                        i17 = i15 + 1;
                        iArr[i15] = i19;
                    }
                    i14++;
                    i15 = i17;
                    i17 = i18;
                } catch (Throwable e) {
                    throw ba.ad(e, "gc.bt(" + ')');
                }
            }
            i14 = i15 + i8;
            i15 = i17 + i9;
        }
    }

    void fg(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11 = i10 & 16711935;
        int i12 = (i10 >> 8) & 255;
        int i13 = i3;
        int i14 = i2;
        for (int i15 = -i7; i15 < 0; i15++) {
            int i16 = i14;
            i14 = i13;
            i13 = -i6;
            while (i13 < 0) {
                int i17 = i16 + 1;
                int i18 = iArr2[i16];
                if (i18 == 0) {
                    i16 = i14 + 1;
                } else if ((65535 & i18) == ((16776960 & i18) >> 8)) {
                    int i19 = i18 & -16777216;
                    i18 &= 255;
                    i16 = i14 + 1;
                    iArr[i14] = ((((i18 * i11) >> 8) & 16711935) + ((i18 * i12) & 65280)) | i19;
                } else {
                    i16 = i14 + 1;
                    iArr[i14] = i18;
                }
                i13++;
                i14 = i16;
                i16 = i17;
            }
            i13 = i14 + i8;
            i14 = i16 + i9;
        }
    }

    void fq(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11 = i10 & -363633202;
        int i12 = (i10 >> 8) & 2118107482;
        int i13 = i3;
        int i14 = i2;
        for (int i15 = -i7; i15 < 0; i15++) {
            int i16 = i14;
            i14 = i13;
            i13 = -i6;
            while (i13 < 0) {
                int i17 = i16 + 1;
                int i18 = iArr2[i16];
                if (i18 == 0) {
                    i16 = i14 + 1;
                } else if ((65535 & i18) == ((16776960 & i18) >> 8)) {
                    int i19 = i18 & -16777216;
                    i18 &= 255;
                    i16 = i14 + 1;
                    iArr[i14] = ((((i18 * i11) >> 8) & 16711935) + ((i18 * i12) & -1296414678)) | i19;
                } else {
                    i16 = i14 + 1;
                    iArr[i14] = i18;
                }
                i13++;
                i14 = i16;
                i16 = i17;
            }
            i13 = i14 + i8;
            i14 = i16 + i9;
        }
    }

    void bu(fx fxVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i6 != 0) {
            int i8;
            int i9 = i - (fxVar.aa << 4);
            int i10 = i2 - (fxVar.ag << 4);
            double d = ((double) (65535 & i5)) * 9.587379924285257E-5d;
            int floor = (int) Math.floor((Math.sin(d) * ((double) i6)) + 0.5d);
            int floor2 = (int) Math.floor((Math.cos(d) * ((double) i6)) + 0.5d);
            int i11 = ((-i9) * floor2) + ((-i10) * floor);
            int i12 = ((-(-i9)) * floor) + ((-i10) * floor2);
            int i13 = (((fxVar.ad << 4) - i9) * floor2) + ((-i10) * floor);
            int i14 = ((-((fxVar.ad << 4) - i9)) * floor) + ((-i10) * floor2);
            int i15 = ((-i9) * floor2) + (((fxVar.an << 4) - i10) * floor);
            int i16 = (((fxVar.an << 4) - i10) * floor2) + ((-(-i9)) * floor);
            int i17 = (((fxVar.an << 4) - i10) * floor) + (((fxVar.ad << 4) - i9) * floor2);
            floor = (floor * (-((fxVar.ad << 4) - i9))) + (floor2 * ((fxVar.an << 4) - i10));
            if (i11 >= i13) {
                i8 = i11;
                i11 = i13;
                i13 = i8;
            }
            if (i15 < i11) {
                i11 = i15;
            }
            if (i17 < i11) {
                i11 = i17;
            }
            if (i15 <= i13) {
                i15 = i13;
            }
            if (i17 <= i15) {
                i17 = i15;
            }
            if (i12 < i14) {
                i8 = i14;
                i14 = i12;
                i12 = i8;
            }
            if (i16 < i14) {
                i14 = i16;
            }
            if (floor < i14) {
                i14 = floor;
            }
            if (i16 <= i12) {
                i16 = i12;
            }
            if (floor <= i16) {
                floor = i16;
            }
            i17 = (i14 >> 12) + i4;
            i14 = ((i11 >> 12) + i3) >> 4;
            i12 = ((((i17 + 4095) >> 12) + i3) + 15) >> 4;
            i16 = i17 >> 4;
            floor = ((((floor + 4095) >> 12) + i4) + 15) >> 4;
            if (i14 < this.ay * 1829547545) {
                i14 = 1829547545 * this.ay;
            }
            if (i12 > 2074797577 * this.as) {
                i12 = this.as * 2074797577;
            }
            if (i16 < this.aa * -12571459) {
                i16 = -12571459 * this.aa;
            }
            if (floor > -467581477 * this.ag) {
                floor = -467581477 * this.ag;
            }
            i17 = i14 - i12;
            if (i17 < 0) {
                floor = i16 - floor;
                if (floor < 0) {
                    i12 = ((this.ad * -481290979) * i16) + i14;
                    double d2 = 1.6777216E7d / ((double) i6);
                    floor2 = (int) Math.floor((Math.sin(d) * d2) + 0.5d);
                    int floor3 = (int) Math.floor((d2 * Math.cos(d)) + 0.5d);
                    int i18 = ((i14 << 4) + 8) - i3;
                    i16 = ((i16 << 4) + 8) - i4;
                    i13 = (i9 << 8) - ((floor2 * i16) >> 4);
                    i16 = ((i16 * floor3) >> 4) + (i10 << 8);
                    if (floor3 == 0) {
                        if (floor2 == 0) {
                            i15 = i12;
                            for (i11 = floor; i11 < 0; i11++) {
                                if (i13 >= 0 && i16 >= 0 && i13 - (fxVar.ad << 12) < 0 && i16 - (fxVar.an << 12) < 0) {
                                    i12 = i17;
                                    i14 = i15;
                                    while (i12 < 0) {
                                        i9 = fxVar.af[(fxVar.ad * (i16 >> 12)) + (i13 >> 12)];
                                        if (i9 != 0) {
                                            floor = i14 + 1;
                                            this.af[i14] = i9;
                                        } else {
                                            floor = i14 + 1;
                                        }
                                        i12++;
                                        i14 = floor;
                                    }
                                }
                                i15 += this.ad * -481290979;
                            }
                        } else if (floor2 < 0) {
                            i11 = floor;
                            i9 = i13;
                            i13 = i12;
                            while (i11 < 0) {
                                i14 = i16 + ((floor2 * i18) >> 4);
                                if (i9 >= 0) {
                                    if (i9 - (fxVar.ad << 12) < 0) {
                                        floor = i14 - (fxVar.an << 12);
                                        if (floor >= 0) {
                                            floor = (floor2 - floor) / floor2;
                                            i12 = i17 + floor;
                                            i14 += floor2 * floor;
                                            i15 = i13 + floor;
                                        } else {
                                            i12 = i17;
                                            i15 = i13;
                                        }
                                        floor = (i14 - floor2) / floor2;
                                        if (floor > i12) {
                                            i12 = floor;
                                        }
                                        while (i12 < 0) {
                                            i10 = fxVar.af[(i9 >> 12) + ((i14 >> 12) * fxVar.ad)];
                                            if (i10 != 0) {
                                                floor = i15 + 1;
                                                this.af[i15] = i10;
                                            } else {
                                                floor = i15 + 1;
                                            }
                                            i14 += floor2;
                                            i12++;
                                            i15 = floor;
                                        }
                                    }
                                }
                                i13 += -481290979 * this.ad;
                                i11++;
                                i9 -= floor2;
                            }
                        } else {
                            i11 = floor;
                            i9 = i13;
                            i13 = i12;
                            while (i11 < 0) {
                                i14 = i16 + ((i18 * floor2) >> 4);
                                if (i9 >= 0) {
                                    if (i9 - (fxVar.ad << 12) < 0) {
                                        if (i14 < 0) {
                                            floor = ((floor2 - 1) - i14) / floor2;
                                            i12 = i17 + floor;
                                            i14 += floor2 * floor;
                                            i15 = i13 + floor;
                                        } else {
                                            i12 = i17;
                                            i15 = i13;
                                        }
                                        floor = (((i14 + 1) - (fxVar.an << 12)) - floor2) / floor2;
                                        if (floor > i12) {
                                            i12 = floor;
                                        }
                                        while (i12 < 0) {
                                            i10 = fxVar.af[((i14 >> 12) * fxVar.ad) + (i9 >> 12)];
                                            if (i10 != 0) {
                                                floor = i15 + 1;
                                                this.af[i15] = i10;
                                            } else {
                                                floor = i15 + 1;
                                            }
                                            i14 += floor2;
                                            i12++;
                                            i15 = floor;
                                        }
                                    }
                                }
                                i13 += -481290979 * this.ad;
                                i11++;
                                i9 -= floor2;
                            }
                        }
                    } else if (floor3 < 0) {
                        if (floor2 == 0) {
                            i11 = floor;
                            i9 = i16;
                            i15 = i12;
                            while (i11 < 0) {
                                i12 = ((floor3 * i18) >> 4) + i13;
                                if (i9 >= 0) {
                                    if (i9 - (fxVar.an << 12) < 0) {
                                        floor = i12 - (fxVar.ad << 12);
                                        if (floor >= 0) {
                                            floor = (floor3 - floor) / floor3;
                                            i16 = i17 + floor;
                                            i12 += floor * floor3;
                                            i14 = i15 + floor;
                                        } else {
                                            i16 = i17;
                                            i14 = i15;
                                        }
                                        floor = (i12 - floor3) / floor3;
                                        if (floor > i16) {
                                            i16 = floor;
                                        }
                                        while (i16 < 0) {
                                            i10 = fxVar.af[(fxVar.ad * (i9 >> 12)) + (i12 >> 12)];
                                            if (i10 != 0) {
                                                floor = i14 + 1;
                                                this.af[i14] = i10;
                                            } else {
                                                floor = i14 + 1;
                                            }
                                            i12 += floor3;
                                            i16++;
                                            i14 = floor;
                                        }
                                    }
                                }
                                i15 += this.ad * -481290979;
                                i11++;
                                i9 += floor3;
                            }
                        } else if (floor2 < 0) {
                            i11 = floor;
                            i9 = i16;
                            i10 = i13;
                            i13 = i12;
                            while (i11 < 0) {
                                i14 = i10 + ((floor3 * i18) >> 4);
                                i12 = ((floor2 * i18) >> 4) + i9;
                                floor = i14 - (fxVar.ad << 12);
                                if (floor >= 0) {
                                    i16 = (floor3 - floor) / floor3;
                                    floor = i17 + i16;
                                    i14 += floor3 * i16;
                                    i12 += floor2 * i16;
                                    i15 = i13 + i16;
                                } else {
                                    floor = i17;
                                    i15 = i13;
                                }
                                i16 = (i14 - floor3) / floor3;
                                if (i16 <= floor) {
                                    i16 = floor;
                                }
                                floor = i12 - (fxVar.an << 12);
                                if (floor >= 0) {
                                    floor = (floor2 - floor) / floor2;
                                    i16 += floor;
                                    i14 += floor3 * floor;
                                    i12 += floor * floor2;
                                    i15 += floor;
                                }
                                floor = (i12 - floor2) / floor2;
                                if (floor > i16) {
                                    i16 = floor;
                                }
                                while (i16 < 0) {
                                    r15 = fxVar.af[(fxVar.ad * (i12 >> 12)) + (i14 >> 12)];
                                    if (r15 != 0) {
                                        floor = i15 + 1;
                                        this.af[i15] = r15;
                                    } else {
                                        floor = i15 + 1;
                                    }
                                    i14 += floor3;
                                    i12 += floor2;
                                    i16++;
                                    i15 = floor;
                                }
                                i13 += -481290979 * this.ad;
                                i11++;
                                i9 += floor3;
                                i10 -= floor2;
                            }
                        } else {
                            i11 = floor;
                            i9 = i16;
                            i10 = i13;
                            i13 = i12;
                            while (i11 < 0) {
                                i14 = i10 + ((i18 * floor3) >> 4);
                                i12 = ((i18 * floor2) >> 4) + i9;
                                floor = i14 - (fxVar.ad << 12);
                                if (floor >= 0) {
                                    i16 = (floor3 - floor) / floor3;
                                    floor = i17 + i16;
                                    i14 += floor3 * i16;
                                    i12 += floor2 * i16;
                                    i15 = i13 + i16;
                                } else {
                                    floor = i17;
                                    i15 = i13;
                                }
                                i16 = (i14 - floor3) / floor3;
                                if (i16 <= floor) {
                                    i16 = floor;
                                }
                                if (i12 < 0) {
                                    floor = ((floor2 - 1) - i12) / floor2;
                                    i16 += floor;
                                    i14 += floor3 * floor;
                                    i12 += floor * floor2;
                                    i15 += floor;
                                }
                                floor = (((i12 + 1) - (fxVar.an << 12)) - floor2) / floor2;
                                if (floor > i16) {
                                    i16 = floor;
                                }
                                while (i16 < 0) {
                                    r15 = fxVar.af[(i14 >> 12) + (fxVar.ad * (i12 >> 12))];
                                    if (r15 != 0) {
                                        floor = i15 + 1;
                                        this.af[i15] = r15;
                                    } else {
                                        floor = i15 + 1;
                                    }
                                    i14 += floor3;
                                    i12 += floor2;
                                    i16++;
                                    i15 = floor;
                                }
                                i13 += -481290979 * this.ad;
                                i11++;
                                i9 += floor3;
                                i10 -= floor2;
                            }
                        }
                    } else if (floor2 == 0) {
                        i11 = floor;
                        i9 = i16;
                        i15 = i12;
                        while (i11 < 0) {
                            i12 = ((i18 * floor3) >> 4) + i13;
                            if (i9 >= 0) {
                                if (i9 - (fxVar.an << 12) < 0) {
                                    if (i12 < 0) {
                                        floor = ((floor3 - 1) - i12) / floor3;
                                        i16 = i17 + floor;
                                        i12 += floor * floor3;
                                        i14 = i15 + floor;
                                    } else {
                                        i16 = i17;
                                        i14 = i15;
                                    }
                                    floor = (((i12 + 1) - (fxVar.ad << 12)) - floor3) / floor3;
                                    if (floor > i16) {
                                        i16 = floor;
                                    }
                                    while (i16 < 0) {
                                        i10 = fxVar.af[((i9 >> 12) * fxVar.ad) + (i12 >> 12)];
                                        if (i10 != 0) {
                                            floor = i14 + 1;
                                            this.af[i14] = i10;
                                        } else {
                                            floor = i14 + 1;
                                        }
                                        i12 += floor3;
                                        i16++;
                                        i14 = floor;
                                    }
                                    continue;
                                } else {
                                    continue;
                                }
                            }
                            i15 += -481290979 * this.ad;
                            i11++;
                            i9 += floor3;
                        }
                    } else if (floor2 < 0) {
                        i11 = floor;
                        i9 = i16;
                        i10 = i13;
                        i13 = i12;
                        while (i11 < 0) {
                            i14 = i10 + ((floor3 * i18) >> 4);
                            i12 = i9 + ((floor2 * i18) >> 4);
                            if (i14 < 0) {
                                i16 = ((floor3 - 1) - i14) / floor3;
                                floor = i17 + i16;
                                i14 += i16 * floor3;
                                i12 += i16 * floor2;
                                i15 = i13 + i16;
                            } else {
                                floor = i17;
                                i15 = i13;
                            }
                            i16 = (((i14 + 1) - (fxVar.ad << 12)) - floor3) / floor3;
                            if (i16 <= floor) {
                                i16 = floor;
                            }
                            floor = i12 - (fxVar.an << 12);
                            if (floor >= 0) {
                                floor = (floor2 - floor) / floor2;
                                i16 += floor;
                                i14 += floor3 * floor;
                                i12 += floor * floor2;
                                i15 += floor;
                            }
                            floor = (i12 - floor2) / floor2;
                            if (floor > i16) {
                                i16 = floor;
                            }
                            while (i16 < 0) {
                                r15 = fxVar.af[((i12 >> 12) * fxVar.ad) + (i14 >> 12)];
                                if (r15 != 0) {
                                    floor = i15 + 1;
                                    this.af[i15] = r15;
                                } else {
                                    floor = i15 + 1;
                                }
                                i14 += floor3;
                                i12 += floor2;
                                i16++;
                                i15 = floor;
                            }
                            try {
                                i13 += this.ad * -481290979;
                                i11++;
                                i9 += floor3;
                                i10 -= floor2;
                            } catch (Throwable e) {
                                throw ba.ad(e, "gc.bu(" + ')');
                            }
                        }
                    } else {
                        i11 = floor;
                        i9 = i16;
                        i10 = i13;
                        i13 = i12;
                        while (i11 < 0) {
                            i14 = ((i18 * floor3) >> 4) + i10;
                            i12 = ((floor2 * i18) >> 4) + i9;
                            if (i14 < 0) {
                                i16 = ((floor3 - 1) - i14) / floor3;
                                floor = i17 + i16;
                                i14 += i16 * floor3;
                                i12 += i16 * floor2;
                                i15 = i13 + i16;
                            } else {
                                floor = i17;
                                i15 = i13;
                            }
                            i16 = (((i14 + 1) - (fxVar.ad << 12)) - floor3) / floor3;
                            if (i16 <= floor) {
                                i16 = floor;
                            }
                            if (i12 < 0) {
                                floor = ((floor2 - 1) - i12) / floor2;
                                i16 += floor;
                                i14 += floor3 * floor;
                                i12 += floor * floor2;
                                i15 += floor;
                            }
                            floor = (((i12 + 1) - (fxVar.an << 12)) - floor2) / floor2;
                            if (floor > i16) {
                                i16 = floor;
                            }
                            while (i16 < 0) {
                                r15 = fxVar.af[(i14 >> 12) + (fxVar.ad * (i12 >> 12))];
                                if (r15 != 0) {
                                    floor = i15 + 1;
                                    this.af[i15] = r15;
                                } else {
                                    floor = i15 + 1;
                                }
                                i14 += floor3;
                                i12 += floor2;
                                i16++;
                                i15 = floor;
                            }
                            i13 += -481290979 * this.ad;
                            i11++;
                            i9 += floor3;
                            i10 -= floor2;
                        }
                    }
                }
            }
        }
    }

    void fu(fx fxVar, int i, int i2, int i3, int i4, int i5, int i6) {
        if (i6 != 0) {
            int i7;
            int i8 = i - (fxVar.aa << 4);
            int i9 = i2 - (fxVar.ag << 4);
            double d = ((double) (-1231506677 & i5)) * 9.587379924285257E-5d;
            int floor = (int) Math.floor((Math.sin(d) * ((double) i6)) + 0.5d);
            int floor2 = (int) Math.floor((Math.cos(d) * ((double) i6)) + 0.5d);
            int i10 = ((-i8) * floor2) + ((-i9) * floor);
            int i11 = ((-(-i8)) * floor) + ((-i9) * floor2);
            int i12 = (((fxVar.ad << 4) - i8) * floor2) + ((-i9) * floor);
            int i13 = ((-((fxVar.ad << 4) - i8)) * floor) + ((-i9) * floor2);
            int i14 = ((-i8) * floor2) + (((fxVar.an << 4) - i9) * floor);
            int i15 = (((fxVar.an << 4) - i9) * floor2) + ((-(-i8)) * floor);
            int i16 = (((fxVar.an << 4) - i9) * floor) + (((fxVar.ad << 4) - i8) * floor2);
            floor = (floor * (-((fxVar.ad << 4) - i8))) + (floor2 * ((fxVar.an << 4) - i9));
            if (i10 >= i12) {
                i7 = i10;
                i10 = i12;
                i12 = i7;
            }
            if (i14 < i10) {
                i10 = i14;
            }
            if (i16 < i10) {
                i10 = i16;
            }
            if (i14 <= i12) {
                i14 = i12;
            }
            if (i16 <= i14) {
                i16 = i14;
            }
            if (i11 < i13) {
                i7 = i13;
                i13 = i11;
                i11 = i7;
            }
            if (i15 < i13) {
                i13 = i15;
            }
            if (floor < i13) {
                i13 = floor;
            }
            if (i15 <= i11) {
                i15 = i11;
            }
            if (floor <= i15) {
                floor = i15;
            }
            i16 = ((floor - 723459670) >> 12) + i4;
            floor = ((i10 >> 12) + i3) >> 4;
            i15 = ((((i16 + 4095) >> 12) + i3) + 15) >> 4;
            i11 = ((i13 >> 12) + i4) >> 4;
            i13 = (i16 + 15) >> 4;
            if (floor < this.ay * 1829547545) {
                floor = 1829547545 * this.ay;
            }
            if (i15 > -1340898677 * this.as) {
                i15 = this.as * -1631050200;
            }
            if (i11 < this.aa * -12571459) {
                i11 = -699988706 * this.aa;
            }
            if (i13 > -467581477 * this.ag) {
                i13 = 2023956251 * this.ag;
            }
            i15 = floor - i15;
            if (i15 < 0) {
                i13 = i11 - i13;
                if (i13 < 0) {
                    i16 = ((this.ad * -481290979) * i11) + floor;
                    double d2 = 1.6777216E7d / ((double) i6);
                    floor2 = (int) Math.floor((Math.sin(d) * d2) + 0.5d);
                    int floor3 = (int) Math.floor((d2 * Math.cos(d)) + 0.5d);
                    int i17 = ((floor << 4) + 8) - i3;
                    floor = ((i11 << 4) + 8) - i4;
                    i14 = (i8 << 8) - ((floor2 * floor) >> 4);
                    i8 = (i9 << 8) + ((floor * floor3) >> 4);
                    if (floor3 == 0) {
                        if (floor2 == 0) {
                            for (i12 = i13; i12 < 0; i12++) {
                                if (i14 >= 0 && i8 >= 0 && i14 - (fxVar.ad << 12) < 0 && i8 - (fxVar.an << 12) < 0) {
                                    i11 = i15;
                                    i13 = i16;
                                    while (i11 < 0) {
                                        i10 = fxVar.af[(fxVar.ad * (i8 >> 12)) + (i14 >> 12)];
                                        if (i10 != 0) {
                                            floor = i13 + 1;
                                            this.af[i13] = i10;
                                        } else {
                                            floor = i13 + 1;
                                        }
                                        i11++;
                                        i13 = floor;
                                    }
                                }
                                i16 += this.ad * -481290979;
                            }
                        } else if (floor2 < 0) {
                            i12 = i13;
                            i10 = i14;
                            while (i12 < 0) {
                                i11 = i8 + ((floor2 * i17) >> 4);
                                if (i10 >= 0) {
                                    if (i10 - (fxVar.ad << 12) < 0) {
                                        floor = i11 - (fxVar.an << 12);
                                        if (floor >= 0) {
                                            i13 = (floor2 - floor) / floor2;
                                            floor = i15 + i13;
                                            i11 += floor2 * i13;
                                            i13 += i16;
                                        } else {
                                            floor = i15;
                                            i13 = i16;
                                        }
                                        i14 = (i11 - floor2) / floor2;
                                        if (i14 > floor) {
                                            i7 = i14;
                                            i14 = i13;
                                            i13 = i11;
                                            i11 = i7;
                                        } else {
                                            i14 = i13;
                                            i13 = i11;
                                            i11 = floor;
                                        }
                                        while (i11 < 0) {
                                            i9 = fxVar.af[(i10 >> 12) + ((i13 >> 12) * fxVar.ad)];
                                            if (i9 != 0) {
                                                floor = i14 + 1;
                                                this.af[i14] = i9;
                                            } else {
                                                floor = i14 + 1;
                                            }
                                            i13 += floor2;
                                            i11++;
                                            i14 = floor;
                                        }
                                    }
                                }
                                i16 += -481290979 * this.ad;
                                i12++;
                                i10 -= floor2;
                            }
                        } else {
                            i12 = i13;
                            i10 = i14;
                            while (i12 < 0) {
                                i11 = i8 + ((i17 * floor2) >> 4);
                                if (i10 >= 0 && i10 - (fxVar.ad << 12) < 0) {
                                    if (i11 < 0) {
                                        i13 = ((floor2 - 1) - i11) / floor2;
                                        floor = i15 + i13;
                                        i11 += floor2 * i13;
                                        i13 += i16;
                                    } else {
                                        floor = i15;
                                        i13 = i16;
                                    }
                                    i14 = (((i11 + 1) - (fxVar.an << 12)) - floor2) / floor2;
                                    if (i14 > floor) {
                                        i7 = i14;
                                        i14 = i13;
                                        i13 = i11;
                                        i11 = i7;
                                    } else {
                                        i14 = i13;
                                        i13 = i11;
                                        i11 = floor;
                                    }
                                    while (i11 < 0) {
                                        i9 = fxVar.af[((i13 >> 12) * fxVar.ad) + (i10 >> 12)];
                                        if (i9 != 0) {
                                            floor = i14 + 1;
                                            this.af[i14] = i9;
                                        } else {
                                            floor = i14 + 1;
                                        }
                                        i13 += floor2;
                                        i11++;
                                        i14 = floor;
                                    }
                                }
                                i16 += -481290979 * this.ad;
                                i12++;
                                i10 -= floor2;
                            }
                        }
                    } else if (floor3 < 0) {
                        if (floor2 == 0) {
                            for (i10 = i13; i10 < 0; i10++) {
                                i11 = ((floor3 * i17) >> 4) + i14;
                                if (i8 >= 0) {
                                    if (i8 - (fxVar.an << 12) < 0) {
                                        floor = i11 - (fxVar.ad << 12);
                                        if (floor >= 0) {
                                            i13 = (floor3 - floor) / floor3;
                                            floor = i15 + i13;
                                            i11 += i13 * floor3;
                                            i13 += i16;
                                        } else {
                                            floor = i15;
                                            i13 = i16;
                                        }
                                        i12 = (i11 - floor3) / floor3;
                                        if (i12 > floor) {
                                            i7 = i12;
                                            i12 = i13;
                                            i13 = i11;
                                            i11 = i7;
                                        } else {
                                            i12 = i13;
                                            i13 = i11;
                                            i11 = floor;
                                        }
                                        while (i11 < 0) {
                                            i9 = fxVar.af[(fxVar.ad * (i8 >> 12)) + (i13 >> 12)];
                                            if (i9 != 0) {
                                                floor = i12 + 1;
                                                this.af[i12] = i9;
                                            } else {
                                                floor = i12 + 1;
                                            }
                                            i13 += floor3;
                                            i11++;
                                            i12 = floor;
                                        }
                                    }
                                }
                                i8 += floor3;
                                i16 += this.ad * -481290979;
                            }
                        } else if (floor2 < 0) {
                            i10 = i13;
                            i9 = i14;
                            i14 = i16;
                            while (i10 < 0) {
                                i13 = i9 + ((floor3 * i17) >> 4);
                                i11 = ((floor2 * i17) >> 4) + i8;
                                floor = i13 - (fxVar.ad << 12);
                                if (floor >= 0) {
                                    i16 = (floor3 - floor) / floor3;
                                    floor = i15 + i16;
                                    i13 += floor3 * i16;
                                    i11 += floor2 * i16;
                                    i16 += i14;
                                } else {
                                    floor = i15;
                                    i16 = i14;
                                }
                                i12 = (i13 - floor3) / floor3;
                                if (i12 > floor) {
                                    floor = i12;
                                }
                                i12 = i11 - (fxVar.an << 12);
                                if (i12 >= 0) {
                                    i12 = (floor2 - i12) / floor2;
                                    floor += i12;
                                    i13 += floor3 * i12;
                                    i11 += i12 * floor2;
                                    i16 += i12;
                                }
                                i12 = (i11 - floor2) / floor2;
                                if (i12 > floor) {
                                    i7 = i12;
                                    i12 = i16;
                                    i16 = i13;
                                    i13 = i11;
                                    i11 = i7;
                                } else {
                                    i12 = i16;
                                    i16 = i13;
                                    i13 = i11;
                                    i11 = floor;
                                }
                                while (i11 < 0) {
                                    r15 = fxVar.af[(fxVar.ad * (i13 >> 12)) + (i16 >> 12)];
                                    if (r15 != 0) {
                                        floor = i12 + 1;
                                        this.af[i12] = r15;
                                    } else {
                                        floor = i12 + 1;
                                    }
                                    i16 += floor3;
                                    i13 += floor2;
                                    i11++;
                                    i12 = floor;
                                }
                                i8 += floor3;
                                i14 += -481290979 * this.ad;
                                i10++;
                                i9 -= floor2;
                            }
                        } else {
                            i10 = i13;
                            i9 = i14;
                            i14 = i16;
                            while (i10 < 0) {
                                i13 = i9 + ((i17 * floor3) >> 4);
                                i11 = ((i17 * floor2) >> 4) + i8;
                                floor = i13 - (fxVar.ad << 12);
                                if (floor >= 0) {
                                    i16 = (floor3 - floor) / floor3;
                                    floor = i15 + i16;
                                    i13 += floor3 * i16;
                                    i11 += floor2 * i16;
                                    i16 += i14;
                                } else {
                                    floor = i15;
                                    i16 = i14;
                                }
                                i12 = (i13 - floor3) / floor3;
                                if (i12 > floor) {
                                    floor = i12;
                                }
                                if (i11 < 0) {
                                    i12 = ((floor2 - 1) - i11) / floor2;
                                    floor += i12;
                                    i13 += floor3 * i12;
                                    i11 += i12 * floor2;
                                    i16 += i12;
                                }
                                i12 = (((i11 + 1) - (fxVar.an << 12)) - floor2) / floor2;
                                if (i12 > floor) {
                                    i7 = i12;
                                    i12 = i16;
                                    i16 = i13;
                                    i13 = i11;
                                    i11 = i7;
                                } else {
                                    i12 = i16;
                                    i16 = i13;
                                    i13 = i11;
                                    i11 = floor;
                                }
                                while (i11 < 0) {
                                    r15 = fxVar.af[(i16 >> 12) + (fxVar.ad * (i13 >> 12))];
                                    if (r15 != 0) {
                                        floor = i12 + 1;
                                        this.af[i12] = r15;
                                    } else {
                                        floor = i12 + 1;
                                    }
                                    i16 += floor3;
                                    i13 += floor2;
                                    i11++;
                                    i12 = floor;
                                }
                                i8 += floor3;
                                i14 += 1353639402 * this.ad;
                                i10++;
                                i9 -= floor2;
                            }
                        }
                    } else if (floor2 == 0) {
                        for (i10 = i13; i10 < 0; i10++) {
                            i11 = ((i17 * floor3) >> 4) + i14;
                            if (i8 >= 0) {
                                if (i8 - (fxVar.an << 12) < 0) {
                                    if (i11 < 0) {
                                        i13 = ((floor3 - 1) - i11) / floor3;
                                        floor = i15 + i13;
                                        i11 += i13 * floor3;
                                        i13 += i16;
                                    } else {
                                        floor = i15;
                                        i13 = i16;
                                    }
                                    i12 = (((i11 + 1) - (fxVar.ad << 12)) - floor3) / floor3;
                                    if (i12 > floor) {
                                        i7 = i12;
                                        i12 = i13;
                                        i13 = i11;
                                        i11 = i7;
                                    } else {
                                        i12 = i13;
                                        i13 = i11;
                                        i11 = floor;
                                    }
                                    while (i11 < 0) {
                                        i9 = fxVar.af[((i8 >> 12) * fxVar.ad) + (i13 >> 12)];
                                        if (i9 == 0) {
                                            floor = i12 + 1;
                                        } else {
                                            floor = i12 + 1;
                                            this.af[i12] = i9;
                                        }
                                        i13 += floor3;
                                        i11++;
                                        i12 = floor;
                                    }
                                }
                            }
                            i8 += floor3;
                            i16 += -225862877 * this.ad;
                        }
                    } else if (floor2 < 0) {
                        i10 = i13;
                        i9 = i14;
                        i14 = i16;
                        while (i10 < 0) {
                            i13 = i9 + ((floor3 * i17) >> 4);
                            i11 = i8 + ((floor2 * i17) >> 4);
                            if (i13 < 0) {
                                i16 = ((floor3 - 1) - i13) / floor3;
                                floor = i15 + i16;
                                i13 += i16 * floor3;
                                i11 += i16 * floor2;
                                i16 += i14;
                            } else {
                                floor = i15;
                                i16 = i14;
                            }
                            i12 = (((i13 + 1) - (fxVar.ad << 12)) - floor3) / floor3;
                            if (i12 > floor) {
                                floor = i12;
                            }
                            i12 = i11 - (fxVar.an << 12);
                            if (i12 >= 0) {
                                i12 = (floor2 - i12) / floor2;
                                floor += i12;
                                i13 += floor3 * i12;
                                i11 += i12 * floor2;
                                i16 += i12;
                            }
                            i12 = (i11 - floor2) / floor2;
                            if (i12 > floor) {
                                i7 = i12;
                                i12 = i16;
                                i16 = i13;
                                i13 = i11;
                                i11 = i7;
                            } else {
                                i12 = i16;
                                i16 = i13;
                                i13 = i11;
                                i11 = floor;
                            }
                            while (i11 < 0) {
                                r15 = fxVar.af[((i13 >> 12) * fxVar.ad) + (i16 >> 12)];
                                if (r15 != 0) {
                                    floor = i12 + 1;
                                    this.af[i12] = r15;
                                } else {
                                    floor = i12 + 1;
                                }
                                i16 += floor3;
                                i13 += floor2;
                                i11++;
                                i12 = floor;
                            }
                            i14 += this.ad * -481290979;
                            i10++;
                            i8 += floor3;
                            i9 -= floor2;
                        }
                    } else {
                        i10 = i13;
                        i9 = i14;
                        i14 = i16;
                        while (i10 < 0) {
                            i13 = ((i17 * floor3) >> 4) + i9;
                            i11 = ((floor2 * i17) >> 4) + i8;
                            if (i13 < 0) {
                                i16 = ((floor3 - 1) - i13) / floor3;
                                floor = i15 + i16;
                                i13 += i16 * floor3;
                                i11 += i16 * floor2;
                                i16 += i14;
                            } else {
                                floor = i15;
                                i16 = i14;
                            }
                            i12 = (((i13 + 1) - (fxVar.ad << 12)) - floor3) / floor3;
                            if (i12 > floor) {
                                floor = i12;
                            }
                            if (i11 < 0) {
                                i12 = ((floor2 - 1) - i11) / floor2;
                                floor += i12;
                                i13 += floor3 * i12;
                                i11 += i12 * floor2;
                                i16 += i12;
                            }
                            i12 = (((i11 + 1) - (fxVar.an << 12)) - floor2) / floor2;
                            if (i12 > floor) {
                                i7 = i12;
                                i12 = i16;
                                i16 = i13;
                                i13 = i11;
                                i11 = i7;
                            } else {
                                i12 = i16;
                                i16 = i13;
                                i13 = i11;
                                i11 = floor;
                            }
                            while (i11 < 0) {
                                r15 = fxVar.af[(i16 >> 12) + (fxVar.ad * (i13 >> 12))];
                                if (r15 != 0) {
                                    floor = i12 + 1;
                                    this.af[i12] = r15;
                                } else {
                                    floor = i12 + 1;
                                }
                                i16 += floor3;
                                i13 += floor2;
                                i11++;
                                i12 = floor;
                            }
                            i8 += floor3;
                            i14 += 1553190604 * this.ad;
                            i10++;
                            i9 -= floor2;
                        }
                    }
                }
            }
        }
    }

    public void be(fx fxVar, int i, int i2, int i3, int i4, int i5) {
        try {
            if (i3 > fxVar.ay || i4 > fxVar.as) {
                throw new IllegalArgumentException();
            }
            int i6;
            int i7;
            int i8 = ((fxVar.aa * i3) / fxVar.ay) + i;
            int i9 = (((fxVar.ay + ((fxVar.aa + fxVar.ad) * i3)) - 1) / fxVar.ay) + i;
            int i10 = ((fxVar.ag * i4) / fxVar.as) + i2;
            int i11 = (((((fxVar.an + fxVar.ag) * i4) + fxVar.as) - 1) / fxVar.as) + i2;
            if (i8 < 1829547545 * this.ay) {
                i8 = 1829547545 * this.ay;
            }
            if (i9 > 2074797577 * this.as) {
                i6 = this.as * 2074797577;
            } else {
                i6 = i9;
            }
            if (i10 < this.aa * -12571459) {
                i10 = this.aa * -12571459;
            }
            if (i11 > this.ag * -467581477) {
                i7 = this.ag * -467581477;
            } else {
                i7 = i11;
            }
            if (i8 < i6 && i10 < i7) {
                int i12 = ((this.ad * -481290979) * i10) + i8;
                int i13 = (-481290979 * this.ad) - (i6 - i8);
                if (i12 < this.af.length) {
                    for (int i14 = i10; i14 < i7; i14++) {
                        int i15 = i8;
                        while (i15 < i6) {
                            i10 = (i15 - i) << 4;
                            int i16 = (i14 - i2) << 4;
                            int i17 = ((fxVar.ay * i10) / i3) - (fxVar.aa << 4);
                            i9 = (((i10 + 16) * fxVar.ay) / i3) - (fxVar.aa << 4);
                            i11 = ((fxVar.as * i16) / i4) - (fxVar.ag << 4);
                            i10 = (((i16 + 16) * fxVar.as) / i4) - (fxVar.ag << 4);
                            int i18 = ((i9 - i17) * (i10 - i11)) >> 1;
                            if (i18 == 0) {
                                i10 = i12;
                            } else {
                                if (i17 < 0) {
                                    i16 = 0;
                                } else {
                                    i16 = i17;
                                }
                                if (i9 >= (fxVar.ad << 4)) {
                                    i17 = fxVar.ad << 4;
                                } else {
                                    i17 = i9;
                                }
                                if (i11 < 0) {
                                    i9 = 0;
                                } else {
                                    i9 = i11;
                                }
                                if (i10 >= (fxVar.an << 4)) {
                                    i10 = fxVar.an << 4;
                                }
                                i17--;
                                i10--;
                                int i19 = 16 - (i16 & 15);
                                int i20 = (i17 & 15) + 1;
                                int i21 = 16 - (i9 & 15);
                                i11 = (i10 & 15) + 1;
                                int i22 = i16 >> 4;
                                int i23 = i17 >> 4;
                                int i24 = i9 >> 4;
                                int i25 = i10 >> 4;
                                int i26 = 0;
                                i16 = 0;
                                i17 = 0;
                                i9 = 0;
                                for (int i27 = i24; i27 <= i25; i27++) {
                                    i10 = 16;
                                    if (i24 == i27) {
                                        i10 = i21;
                                    }
                                    if (i27 == i25) {
                                        i10 = i11;
                                    }
                                    for (int i28 = i22; i28 <= i23; i28++) {
                                        int i29 = fxVar.af[(fxVar.ad * i27) + i28];
                                        if (i29 != 0) {
                                            int i30;
                                            if (i22 == i28) {
                                                i30 = i10 * i19;
                                            } else if (i23 == i28) {
                                                i30 = i10 * i20;
                                            } else {
                                                i30 = i10 << 4;
                                            }
                                            i9 += i30;
                                            i26 += ((i29 >> 16) & 255) * i30;
                                            i16 += ((i29 >> 8) & 255) * i30;
                                            i17 += i30 * (i29 & 255);
                                        }
                                    }
                                }
                                if (i9 >= i18) {
                                    this.af[i12] = -16777216 | ((i17 / i9) + (((i26 / i9) << 16) + ((i16 / i9) << 8)));
                                }
                                i10 = i12 + 1;
                            }
                            i15++;
                            i12 = i10;
                        }
                        i12 += i13;
                    }
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "gc.be(" + ')');
        }
    }

    public void fc(fx fxVar, int i, int i2, int i3, int i4) {
        if (i3 > fxVar.ay || i4 > fxVar.as) {
            throw new IllegalArgumentException();
        }
        int i5;
        int i6 = ((fxVar.aa * i3) / fxVar.ay) + i;
        int i7 = (((fxVar.ay + ((fxVar.aa + fxVar.ad) * i3)) - 1) / fxVar.ay) + i;
        int i8 = ((fxVar.ag * i4) / fxVar.as) + i2;
        int i9 = (((((fxVar.an + fxVar.ag) * i4) + fxVar.as) - 1) / fxVar.as) + i2;
        if (i6 < 134616810 * this.ay) {
            i6 = 1524379846 * this.ay;
        }
        if (i7 > -36109486 * this.as) {
            i7 = this.as * -1025432394;
        }
        if (i8 < this.aa * 578624726) {
            i8 = this.aa * -12571459;
        }
        if (i9 > this.ag * 2095151035) {
            i5 = this.ag * -1808907627;
        } else {
            i5 = i9;
        }
        if (i6 < i7 && i8 < i5) {
            i9 = ((this.ad * 2089446477) * i8) + i6;
            int i10 = (-683650277 * this.ad) - (i7 - i6);
            if (i9 < this.af.length) {
                int i11 = i8;
                i8 = i9;
                while (i11 < i5) {
                    for (int i12 = i6; i12 < i7; i12++) {
                        int i13 = (i12 - i) << 4;
                        int i14 = (i11 - i2) << 4;
                        i9 = ((fxVar.ay * i13) / i3) - (fxVar.aa << 4);
                        int i15 = (((i13 + 16) * fxVar.ay) / i3) - (fxVar.aa << 4);
                        i13 = ((fxVar.as * i14) / i4) - (fxVar.ag << 4);
                        i14 = (((i14 + 16) * fxVar.as) / i4) - (fxVar.ag << 4);
                        int i16 = ((i15 - i9) * (i14 - i13)) >> 1;
                        if (i16 != 0) {
                            if (i9 < 0) {
                                i9 = 0;
                            }
                            if (i15 >= (fxVar.ad << 4)) {
                                i15 = fxVar.ad << 4;
                            }
                            if (i13 < 0) {
                                i13 = 0;
                            }
                            if (i14 >= (fxVar.an << 4)) {
                                i14 = fxVar.an << 4;
                            }
                            i15--;
                            int i17 = i14 - 1;
                            int i18 = 16 - (i9 & 15);
                            int i19 = (i15 & 15) + 1;
                            int i20 = 16 - (i13 & 15);
                            i14 = (i17 & 15) + 1;
                            int i21 = i9 >> 4;
                            int i22 = i15 >> 4;
                            int i23 = i13 >> 4;
                            int i24 = i17 >> 4;
                            int i25 = 0;
                            int i26 = 0;
                            i17 = 0;
                            i15 = 0;
                            for (int i27 = i23; i27 <= i24; i27++) {
                                i9 = 16;
                                if (i23 == i27) {
                                    i9 = i20;
                                }
                                if (i27 == i24) {
                                    i9 = i14;
                                }
                                int i28 = i21;
                                while (i28 <= i22) {
                                    int i29 = fxVar.af[(fxVar.ad * i27) + i28];
                                    if (i29 != 0) {
                                        if (i21 == i28) {
                                            i13 = i9 * i18;
                                        } else if (i22 == i28) {
                                            i13 = i9 * i19;
                                        } else {
                                            i13 = i9 << 4;
                                        }
                                        i15 += i13;
                                        i25 += ((i29 >> 16) & 1089513397) * i13;
                                        i13 = (i13 * (i29 & 255)) + i17;
                                        i17 = i26 + (((i29 >> 8) & 258173295) * i13);
                                        i26 = i25;
                                        int i30 = i15;
                                        i15 = i13;
                                        i13 = i30;
                                    } else {
                                        i13 = i15;
                                        i15 = i17;
                                        i17 = i26;
                                        i26 = i25;
                                    }
                                    i28++;
                                    i25 = i26;
                                    i26 = i17;
                                    i17 = i15;
                                    i15 = i13;
                                }
                            }
                            if (i15 >= i16) {
                                this.af[i8] = 1407004447 | ((i17 / i15) + (((i26 / i15) << 8) + ((i25 / i15) << 16)));
                            }
                            i8++;
                        }
                    }
                    i11++;
                    i8 += i10;
                }
            }
        }
    }

    public void ff(fx fxVar, int i, int i2, int i3, int i4) {
        if (i3 > fxVar.ay || i4 > fxVar.as) {
            throw new IllegalArgumentException();
        }
        int i5;
        int i6 = ((fxVar.aa * i3) / fxVar.ay) + i;
        int i7 = (((fxVar.ay + ((fxVar.aa + fxVar.ad) * i3)) - 1) / fxVar.ay) + i;
        int i8 = ((fxVar.ag * i4) / fxVar.as) + i2;
        int i9 = (((((fxVar.an + fxVar.ag) * i4) + fxVar.as) - 1) / fxVar.as) + i2;
        if (i6 < 1829547545 * this.ay) {
            i6 = 1829547545 * this.ay;
        }
        if (i7 > 2074797577 * this.as) {
            i7 = this.as * 2074797577;
        }
        if (i8 < this.aa * -12571459) {
            i8 = this.aa * -12571459;
        }
        if (i9 > this.ag * -467581477) {
            i5 = this.ag * -467581477;
        } else {
            i5 = i9;
        }
        if (i6 < i7 && i8 < i5) {
            int i10 = ((this.ad * -481290979) * i8) + i6;
            int i11 = (-481290979 * this.ad) - (i7 - i6);
            if (i10 < this.af.length) {
                for (int i12 = i8; i12 < i5; i12++) {
                    int i13 = i6;
                    while (i13 < i7) {
                        i9 = (i13 - i) << 4;
                        int i14 = (i12 - i2) << 4;
                        i8 = ((fxVar.ay * i9) / i3) - (fxVar.aa << 4);
                        int i15 = (((i9 + 16) * fxVar.ay) / i3) - (fxVar.aa << 4);
                        i9 = ((fxVar.as * i14) / i4) - (fxVar.ag << 4);
                        i14 = (((i14 + 16) * fxVar.as) / i4) - (fxVar.ag << 4);
                        int i16 = ((i15 - i8) * (i14 - i9)) >> 1;
                        if (i16 == 0) {
                            i8 = i10;
                        } else {
                            if (i8 < 0) {
                                i8 = 0;
                            }
                            if (i15 >= (fxVar.ad << 4)) {
                                i15 = fxVar.ad << 4;
                            }
                            if (i9 < 0) {
                                i9 = 0;
                            }
                            if (i14 >= (fxVar.an << 4)) {
                                i14 = fxVar.an << 4;
                            }
                            i15--;
                            int i17 = i14 - 1;
                            int i18 = 16 - (i8 & 15);
                            int i19 = (i15 & 15) + 1;
                            int i20 = 16 - (i9 & 15);
                            i14 = (i17 & 15) + 1;
                            int i21 = i8 >> 4;
                            int i22 = i15 >> 4;
                            int i23 = i9 >> 4;
                            int i24 = i17 >> 4;
                            int i25 = 0;
                            int i26 = 0;
                            i17 = 0;
                            i15 = 0;
                            for (int i27 = i23; i27 <= i24; i27++) {
                                i8 = 16;
                                if (i23 == i27) {
                                    i8 = i20;
                                }
                                if (i27 == i24) {
                                    i8 = i14;
                                }
                                int i28 = i21;
                                while (i28 <= i22) {
                                    int i29 = fxVar.af[(fxVar.ad * i27) + i28];
                                    if (i29 != 0) {
                                        if (i21 == i28) {
                                            i9 = i8 * i18;
                                        } else if (i22 == i28) {
                                            i9 = i8 * i19;
                                        } else {
                                            i9 = i8 << 4;
                                        }
                                        i15 += i9;
                                        i25 += ((i29 >> 16) & 255) * i9;
                                        i9 = (i9 * (i29 & 255)) + i17;
                                        i17 = i26 + (((i29 >> 8) & 255) * i9);
                                        i26 = i25;
                                        int i30 = i15;
                                        i15 = i9;
                                        i9 = i30;
                                    } else {
                                        i9 = i15;
                                        i15 = i17;
                                        i17 = i26;
                                        i26 = i25;
                                    }
                                    i28++;
                                    i25 = i26;
                                    i26 = i17;
                                    i17 = i15;
                                    i15 = i9;
                                }
                            }
                            if (i15 >= i16) {
                                this.af[i10] = -16777216 | ((i17 / i15) + (((i26 / i15) << 8) + ((i25 / i15) << 16)));
                            }
                            i8 = i10 + 1;
                        }
                        i13++;
                        i10 = i8;
                    }
                    i10 += i11;
                }
            }
        }
    }

    public void fn(fx fxVar, int i, int i2, int i3, int i4) {
        if (i3 > fxVar.ay || i4 > fxVar.as) {
            throw new IllegalArgumentException();
        }
        int i5;
        int i6 = ((fxVar.aa * i3) / fxVar.ay) + i;
        int i7 = (((fxVar.ay + ((fxVar.aa + fxVar.ad) * i3)) - 1) / fxVar.ay) + i;
        int i8 = ((fxVar.ag * i4) / fxVar.as) + i2;
        int i9 = (((((fxVar.an + fxVar.ag) * i4) + fxVar.as) - 1) / fxVar.as) + i2;
        if (i6 < 1829547545 * this.ay) {
            i6 = -343160096 * this.ay;
        }
        if (i7 > -527854000 * this.as) {
            i7 = this.as * 2074797577;
        }
        if (i8 < this.aa * -12571459) {
            i8 = this.aa * -12571459;
        }
        if (i9 > this.ag * -467581477) {
            i5 = this.ag * -703243103;
        } else {
            i5 = i9;
        }
        if (i6 < i7 && i8 < i5) {
            int i10 = ((this.ad * -152757233) * i8) + i6;
            int i11 = (-1753670081 * this.ad) - (i7 - i6);
            if (i10 < this.af.length) {
                for (int i12 = i8; i12 < i5; i12++) {
                    int i13 = i6;
                    while (i13 < i7) {
                        i9 = (i13 - i) << 4;
                        int i14 = (i12 - i2) << 4;
                        i8 = ((fxVar.ay * i9) / i3) - (fxVar.aa << 4);
                        int i15 = (((i9 + 16) * fxVar.ay) / i3) - (fxVar.aa << 4);
                        i9 = ((fxVar.as * i14) / i4) - (fxVar.ag << 4);
                        i14 = (((i14 + 16) * fxVar.as) / i4) - (fxVar.ag << 4);
                        int i16 = ((i15 - i8) * (i14 - i9)) >> 1;
                        if (i16 == 0) {
                            i8 = i10;
                        } else {
                            if (i8 < 0) {
                                i8 = 0;
                            }
                            if (i15 >= (fxVar.ad << 4)) {
                                i15 = fxVar.ad << 4;
                            }
                            if (i9 < 0) {
                                i9 = 0;
                            }
                            if (i14 >= (fxVar.an << 4)) {
                                i14 = fxVar.an << 4;
                            }
                            i15--;
                            int i17 = i14 - 1;
                            int i18 = 16 - (i8 & 15);
                            int i19 = (i15 & 15) + 1;
                            int i20 = 16 - (i9 & 15);
                            i14 = (i17 & 15) + 1;
                            int i21 = i8 >> 4;
                            int i22 = i15 >> 4;
                            int i23 = i9 >> 4;
                            int i24 = i17 >> 4;
                            int i25 = 0;
                            int i26 = 0;
                            i17 = 0;
                            i15 = 0;
                            for (int i27 = i23; i27 <= i24; i27++) {
                                i8 = 16;
                                if (i23 == i27) {
                                    i8 = i20;
                                }
                                if (i27 == i24) {
                                    i8 = i14;
                                }
                                int i28 = i21;
                                while (i28 <= i22) {
                                    int i29 = fxVar.af[(fxVar.ad * i27) + i28];
                                    if (i29 != 0) {
                                        if (i21 == i28) {
                                            i9 = i8 * i18;
                                        } else if (i22 == i28) {
                                            i9 = i8 * i19;
                                        } else {
                                            i9 = i8 << 4;
                                        }
                                        i15 += i9;
                                        i25 += ((i29 >> 16) & 255) * i9;
                                        i9 = (i9 * (i29 & 255)) + i17;
                                        i17 = i26 + (((i29 >> 8) & -1204929836) * i9);
                                        i26 = i25;
                                        int i30 = i15;
                                        i15 = i9;
                                        i9 = i30;
                                    } else {
                                        i9 = i15;
                                        i15 = i17;
                                        i17 = i26;
                                        i26 = i25;
                                    }
                                    i28++;
                                    i25 = i26;
                                    i26 = i17;
                                    i17 = i15;
                                    i15 = i9;
                                }
                            }
                            if (i15 >= i16) {
                                this.af[i10] = -16777216 | ((i17 / i15) + (((i26 / i15) << 8) + ((i25 / i15) << 16)));
                            }
                            i8 = i10 + 1;
                        }
                        i13++;
                        i10 = i8;
                    }
                    i10 += i11;
                }
            }
        }
    }

    public void fz(fx fxVar, int i, int i2, int i3, int i4) {
        if (i3 > fxVar.ay || i4 > fxVar.as) {
            throw new IllegalArgumentException();
        }
        int i5;
        int i6 = ((fxVar.aa * i3) / fxVar.ay) + i;
        int i7 = (((fxVar.ay + ((fxVar.aa + fxVar.ad) * i3)) - 1) / fxVar.ay) + i;
        int i8 = ((fxVar.ag * i4) / fxVar.as) + i2;
        int i9 = (((((fxVar.an + fxVar.ag) * i4) + fxVar.as) - 1) / fxVar.as) + i2;
        if (i6 < 1829547545 * this.ay) {
            i6 = 1829547545 * this.ay;
        }
        if (i7 > 2074797577 * this.as) {
            i7 = this.as * 1514680009;
        }
        if (i8 < this.aa * -12571459) {
            i8 = this.aa * -12571459;
        }
        if (i9 > this.ag * -1381219187) {
            i5 = this.ag * -467581477;
        } else {
            i5 = i9;
        }
        if (i6 < i7 && i8 < i5) {
            i9 = ((this.ad * -481290979) * i8) + i6;
            int i10 = (1942352054 * this.ad) - (i7 - i6);
            if (i9 < this.af.length) {
                for (int i11 = i8; i11 < i5; i11++) {
                    int i12 = i6;
                    while (i12 < i7) {
                        int i13 = (i12 - i) << 4;
                        int i14 = (i11 - i2) << 4;
                        i8 = ((fxVar.ay * i13) / i3) - (fxVar.aa << 4);
                        int i15 = (((i13 + 16) * fxVar.ay) / i3) - (fxVar.aa << 4);
                        i13 = ((fxVar.as * i14) / i4) - (fxVar.ag << 4);
                        i14 = (((i14 + 16) * fxVar.as) / i4) - (fxVar.ag << 4);
                        int i16 = ((i15 - i8) * (i14 - i13)) >> 1;
                        if (i16 == 0) {
                            i8 = i9;
                        } else {
                            if (i8 < 0) {
                                i8 = 0;
                            }
                            if (i15 >= (fxVar.ad << 4)) {
                                i15 = fxVar.ad << 4;
                            }
                            if (i13 < 0) {
                                i13 = 0;
                            }
                            if (i14 >= (fxVar.an << 4)) {
                                i14 = fxVar.an << 4;
                            }
                            i15--;
                            int i17 = i14 - 1;
                            int i18 = 16 - (i8 & 15);
                            int i19 = (i15 & 15) + 1;
                            int i20 = 16 - (i13 & 15);
                            i14 = (i17 & 15) + 1;
                            int i21 = i8 >> 4;
                            int i22 = i15 >> 4;
                            int i23 = i13 >> 4;
                            int i24 = i17 >> 4;
                            int i25 = 0;
                            int i26 = 0;
                            i17 = 0;
                            i15 = 0;
                            for (int i27 = i23; i27 <= i24; i27++) {
                                i8 = 16;
                                if (i23 == i27) {
                                    i8 = i20;
                                }
                                if (i27 == i24) {
                                    i8 = i14;
                                }
                                int i28 = i21;
                                while (i28 <= i22) {
                                    int i29 = fxVar.af[(fxVar.ad * i27) + i28];
                                    if (i29 != 0) {
                                        if (i21 == i28) {
                                            i13 = i8 * i18;
                                        } else if (i22 == i28) {
                                            i13 = i8 * i19;
                                        } else {
                                            i13 = i8 << 4;
                                        }
                                        i15 += i13;
                                        i25 += ((i29 >> 16) & 255) * i13;
                                        i13 = (i13 * (i29 & -172523995)) + i17;
                                        i17 = i26 + (((i29 >> 8) & 1654085403) * i13);
                                        i26 = i25;
                                        int i30 = i15;
                                        i15 = i13;
                                        i13 = i30;
                                    } else {
                                        i13 = i15;
                                        i15 = i17;
                                        i17 = i26;
                                        i26 = i25;
                                    }
                                    i28++;
                                    i25 = i26;
                                    i26 = i17;
                                    i17 = i15;
                                    i15 = i13;
                                }
                            }
                            if (i15 >= i16) {
                                this.af[i9] = -16777216 | ((i17 / i15) + (((i26 / i15) << 8) + ((i25 / i15) << 16)));
                            }
                            i8 = i9 + 1;
                        }
                        i12++;
                        i9 = i8;
                    }
                    i9 += i10;
                }
            }
        }
    }
}
