package p000;

import java.io.EOFException;
import java.io.IOException;

public final class mr {
    static byte[] af = new byte[520];
    public static final int am = 256;
    public static final int ci = 71;
    static final int da = 300;
    int aa;
    nn ad;
    int ag;
    nn an;

    public mr(int i, nn nnVar, nn nnVar2, int i2) {
        try {
            this.ad = null;
            this.an = null;
            this.ag = -636576424;
            this.aa = 1874332673 * i;
            this.ad = nnVar;
            this.an = nnVar2;
            this.ag = -1077451897 * i2;
        } catch (Throwable e) {
            throw ba.ad(e, "mr.<init>(" + ')');
        }
    }

    public byte[] aa(int i) {
        byte[] bArr;
        synchronized (this.ad) {
            if (this.an.an((short) -16745) < ((long) ((i * 6) + 6))) {
                bArr = null;
            } else {
                this.an.ad((long) (i * 6));
                this.an.ag(af, 0, 6, -606087449);
                int i2 = (af[2] & 255) + (((af[1] & 201201915) << 8) + ((af[0] & -289892632) << 16));
                int i3 = (((af[3] & 255) << 16) + ((af[4] & 1694882709) << 8)) + (af[5] & -1741676430);
                if (i2 < 0 || i2 > -1619249541 * this.ag) {
                    bArr = null;
                } else {
                    if (i3 > 0) {
                        if (((long) i3) <= this.ad.an((short) -3633) / 520) {
                            bArr = new byte[i2];
                            int i4 = 0;
                            int i5 = 0;
                            int i6 = i3;
                            while (i4 < i2) {
                                if (i6 != 0) {
                                    int i7;
                                    this.ad.ad((long) (i6 * 520));
                                    i6 = i2 - i4;
                                    if (i6 > 512) {
                                        i7 = 512;
                                    } else {
                                        i7 = i6;
                                    }
                                    this.ad.ag(af, 0, i7 + 8, -606087449);
                                    i3 = (af[3] & 255) + ((af[2] & -279192933) << 8);
                                    int i8 = (af[6] & -1768626408) + (((af[4] & 255) << 16) + ((af[5] & 1298714854) << 8));
                                    int i9 = af[7] & 255;
                                    if (((af[0] & 1900709624) << 8) + (af[1] & 1172578931) != i || i5 != i3 || 282588161 * this.aa != i9) {
                                        bArr = null;
                                        break;
                                    }
                                    if (i8 >= 0) {
                                        try {
                                            if (((long) i8) <= this.ad.an((short) -6130) / 520) {
                                                i6 = 0;
                                                while (i6 < i7) {
                                                    i3 = i4 + 1;
                                                    bArr[i4] = af[i6 + 8];
                                                    i6++;
                                                    i4 = i3;
                                                }
                                                i5++;
                                                i6 = i8;
                                            }
                                        } catch (IOException e) {
                                            bArr = null;
                                        }
                                    }
                                    bArr = null;
                                    break;
                                }
                                bArr = null;
                                break;
                            }
                        }
                    }
                    bArr = null;
                }
            }
        }
        return bArr;
    }

    public byte[] af(int i, int i2) {
        try {
            byte[] bArr;
            synchronized (this.ad) {
                if (this.an.an((short) -18803) < ((long) ((i * 6) + 6))) {
                    bArr = null;
                } else {
                    this.an.ad((long) (i * 6));
                    this.an.ag(af, 0, 6, -606087449);
                    int i3 = (af[2] & 255) + (((af[1] & 255) << 8) + ((af[0] & 255) << 16));
                    int i4 = (((af[3] & 255) << 16) + ((af[4] & 255) << 8)) + (af[5] & 255);
                    if (i3 < 0 || i3 > 474804791 * this.ag) {
                        bArr = null;
                    } else {
                        if (i4 > 0) {
                            if (((long) i4) <= this.ad.an((short) -9605) / 520) {
                                bArr = new byte[i3];
                                int i5 = 0;
                                int i6 = 0;
                                int i7 = i4;
                                while (i5 < i3) {
                                    if (i7 != 0) {
                                        int i8;
                                        this.ad.ad((long) (i7 * 520));
                                        i7 = i3 - i5;
                                        if (i7 > 512) {
                                            i8 = 512;
                                        } else {
                                            i8 = i7;
                                        }
                                        this.ad.ag(af, 0, i8 + 8, -606087449);
                                        i4 = (af[3] & 255) + ((af[2] & 255) << 8);
                                        int i9 = (af[6] & 255) + (((af[4] & 255) << 16) + ((af[5] & 255) << 8));
                                        int i10 = af[7] & 255;
                                        if (((af[0] & 255) << 8) + (af[1] & 255) != i || i6 != i4 || 282588161 * this.aa != i10) {
                                            bArr = null;
                                            break;
                                        }
                                        if (i9 >= 0) {
                                            if (((long) i9) <= this.ad.an((short) -6303) / 520) {
                                                i7 = 0;
                                                while (i7 < i8) {
                                                    i4 = i5 + 1;
                                                    try {
                                                        bArr[i5] = af[i7 + 8];
                                                        i7++;
                                                        i5 = i4;
                                                    } catch (IOException e) {
                                                        bArr = null;
                                                    }
                                                }
                                                i6++;
                                                i7 = i9;
                                            }
                                        }
                                        bArr = null;
                                        break;
                                    }
                                    bArr = null;
                                    break;
                                }
                            }
                        }
                        bArr = null;
                    }
                }
            }
            return bArr;
        } catch (Throwable e2) {
            throw ba.ad(e2, "mr.af(" + ')');
        }
    }

    public byte[] ag(int i) {
        byte[] bArr;
        synchronized (this.ad) {
            if (this.an.an((short) -25300) < ((long) ((i * 6) + 6))) {
                bArr = null;
            } else {
                this.an.ad((long) (i * 6));
                this.an.ag(af, 0, 6, -606087449);
                int i2 = (af[2] & 255) + (((af[1] & 1557147977) << 8) + ((af[0] & 366936245) << 16));
                int i3 = (((af[3] & 255) << 16) + ((af[4] & 255) << 8)) + (af[5] & -742890080);
                if (i2 < 0 || i2 > -767129588 * this.ag) {
                    bArr = null;
                } else {
                    if (i3 > 0) {
                        if (((long) i3) <= this.ad.an((short) -20927) / 520) {
                            bArr = new byte[i2];
                            int i4 = 0;
                            int i5 = 0;
                            int i6 = i3;
                            while (i4 < i2) {
                                if (i6 != 0) {
                                    int i7;
                                    this.ad.ad((long) (i6 * 520));
                                    i6 = i2 - i4;
                                    if (i6 > 512) {
                                        i7 = -1276555387;
                                    } else {
                                        i7 = i6;
                                    }
                                    this.ad.ag(af, 0, i7 + 8, -606087449);
                                    i3 = (af[3] & 255) + ((af[2] & -1022631952) << 8);
                                    int i8 = (af[6] & 255) + (((af[4] & 1431472801) << 16) + ((af[5] & 255) << 8));
                                    int i9 = af[7] & 255;
                                    if (((af[0] & 255) << 8) + (af[1] & -679491972) != i || i5 != i3 || 282588161 * this.aa != i9) {
                                        bArr = null;
                                        break;
                                    }
                                    if (i8 >= 0) {
                                        if (((long) i8) <= this.ad.an((short) -13752) / 520) {
                                            i6 = 0;
                                            while (i6 < i7) {
                                                i3 = i4 + 1;
                                                try {
                                                    bArr[i4] = af[i6 + 8];
                                                    i6++;
                                                    i4 = i3;
                                                } catch (IOException e) {
                                                    bArr = null;
                                                }
                                            }
                                            i5++;
                                            i6 = i8;
                                        }
                                    }
                                    bArr = null;
                                    break;
                                }
                                bArr = null;
                                break;
                            }
                        }
                    }
                    bArr = null;
                }
            }
        }
        return bArr;
    }

    public boolean ad(int i, byte[] bArr, int i2, int i3) {
        try {
            boolean an;
            synchronized (this.ad) {
                if (i2 >= 0) {
                    if (i2 <= this.ag * 474804791) {
                        an = an(i, bArr, i2, true, 537618701);
                        if (!an) {
                            an = an(i, bArr, i2, false, 537618701);
                        }
                    }
                }
                throw new IllegalArgumentException();
            }
            return an;
        } catch (Throwable e) {
            throw ba.ad(e, "mr.ad(" + ')');
        }
    }

    public boolean ae(int i, byte[] bArr, int i2) {
        boolean an;
        synchronized (this.ad) {
            if (i2 >= 0) {
                if (i2 <= this.ag * 474804791) {
                    an = an(i, bArr, i2, true, 537618701);
                    if (!an) {
                        an = an(i, bArr, i2, false, 537618701);
                    }
                }
            }
            throw new IllegalArgumentException();
        }
        return an;
    }

    public boolean aj(int i, byte[] bArr, int i2) {
        boolean an;
        synchronized (this.ad) {
            if (i2 >= 0) {
                if (i2 <= this.ag * 474804791) {
                    an = an(i, bArr, i2, true, 537618701);
                    if (!an) {
                        an = an(i, bArr, i2, false, 537618701);
                    }
                }
            }
            throw new IllegalArgumentException();
        }
        return an;
    }

    public boolean ar(int i, byte[] bArr, int i2) {
        boolean an;
        synchronized (this.ad) {
            if (i2 >= 0) {
                if (i2 <= this.ag * 474804791) {
                    an = an(i, bArr, i2, true, 537618701);
                    if (!an) {
                        an = an(i, bArr, i2, false, 537618701);
                    }
                }
            }
            throw new IllegalArgumentException();
        }
        return an;
    }

    public boolean as(int i, byte[] bArr, int i2) {
        boolean an;
        synchronized (this.ad) {
            if (i2 >= 0) {
                if (i2 <= this.ag * 890725105) {
                    an = an(i, bArr, i2, true, 537618701);
                    if (!an) {
                        an = an(i, bArr, i2, false, 537618701);
                    }
                }
            }
            throw new IllegalArgumentException();
        }
        return an;
    }

    public boolean ay(int i, byte[] bArr, int i2) {
        boolean an;
        synchronized (this.ad) {
            if (i2 >= 0) {
                if (i2 <= this.ag * -839398266) {
                    an = an(i, bArr, i2, true, 537618701);
                    if (!an) {
                        an = an(i, bArr, i2, false, 537618701);
                    }
                }
            }
            throw new IllegalArgumentException();
        }
        return an;
    }

    boolean am(int i, byte[] bArr, int i2, boolean z) {
        boolean z2;
        synchronized (this.ad) {
            int an;
            int i3;
            int i4;
            int i5;
            boolean z3;
            int i6;
            int i7;
            int i8;
            boolean z4;
            int i9;
            if (!z) {
                an = (int) ((this.ad.an((short) -16112) + 519) / 520);
                if (an == 0) {
                    an = 1;
                }
                af[0] = (byte) (i2 >> 16);
                af[1] = (byte) (i2 >> 8);
                af[2] = (byte) i2;
                af[3] = (byte) (an >> 16);
                af[4] = (byte) (an >> 8);
                af[5] = (byte) an;
                this.an.ad((long) (i * 6));
                this.an.as(af, 0, 6, 361159088);
                i3 = 0;
                i4 = 0;
                i5 = an;
                z3 = z;
                while (i4 < i2) {
                    i6 = 0;
                    if (z3) {
                        this.ad.ad((long) (953529225 * i5));
                        this.ad.ag(af, 0, 8, -606087449);
                        i7 = (af[3] & 255) + ((af[2] & -1853383321) << 8);
                        i6 = (((af[5] & 255) << 8) + ((af[4] & 255) << 16)) + (af[6] & -517750281);
                        i8 = af[7] & -1827686815;
                        if (i == (af[1] & 255) + ((af[0] & 255) << 8)) {
                        }
                        z2 = false;
                        break;
                    }
                    if (i6 == 0) {
                        z3 = false;
                        i6 = (int) ((this.ad.an((short) -2284) + 519) / 520);
                        if (i6 == 0) {
                            i6++;
                        }
                        if (i5 == i6) {
                            i6++;
                            z4 = false;
                            if (i2 - i4 > 512) {
                                i9 = 0;
                            } else {
                                i9 = i6;
                            }
                            af[0] = (byte) (i >> 8);
                            af[1] = (byte) i;
                            af[2] = (byte) (i3 >> 8);
                            af[3] = (byte) i3;
                            af[4] = (byte) (i9 >> 16);
                            af[5] = (byte) (i9 >> 8);
                            af[6] = (byte) i9;
                            af[7] = (byte) (this.aa * 1451289142);
                            this.ad.ad((long) (i5 * 1687526883));
                            this.ad.as(af, 0, 8, 727167935);
                            i6 = i2 - i4;
                            if (i6 > 512) {
                                i6 = 512;
                            }
                            this.ad.as(bArr, i4, i6, -325395095);
                            i4 += i6;
                            i3++;
                            i5 = i9;
                            z3 = z4;
                        }
                    }
                    z4 = z3;
                    if (i2 - i4 > 512) {
                        i9 = i6;
                    } else {
                        i9 = 0;
                    }
                    af[0] = (byte) (i >> 8);
                    af[1] = (byte) i;
                    af[2] = (byte) (i3 >> 8);
                    af[3] = (byte) i3;
                    af[4] = (byte) (i9 >> 16);
                    af[5] = (byte) (i9 >> 8);
                    af[6] = (byte) i9;
                    af[7] = (byte) (this.aa * 1451289142);
                    this.ad.ad((long) (i5 * 1687526883));
                    this.ad.as(af, 0, 8, 727167935);
                    i6 = i2 - i4;
                    if (i6 > 512) {
                        i6 = 512;
                    }
                    this.ad.as(bArr, i4, i6, -325395095);
                    i4 += i6;
                    i3++;
                    i5 = i9;
                    z3 = z4;
                }
                z2 = true;
            } else if (this.an.an((short) -30425) < ((long) ((i * 6) + 6))) {
                z2 = false;
            } else {
                this.an.ad((long) (i * 6));
                this.an.ag(af, 0, 6, -606087449);
                an = (af[5] & 255) + (((af[3] & 193385451) << 16) + ((af[4] & -1582815528) << 8));
                if (an <= 0 || ((long) an) > this.ad.an((short) 395) / 520) {
                    z2 = false;
                }
                af[0] = (byte) (i2 >> 16);
                af[1] = (byte) (i2 >> 8);
                af[2] = (byte) i2;
                af[3] = (byte) (an >> 16);
                af[4] = (byte) (an >> 8);
                af[5] = (byte) an;
                this.an.ad((long) (i * 6));
                this.an.as(af, 0, 6, 361159088);
                i3 = 0;
                i4 = 0;
                i5 = an;
                z3 = z;
                while (i4 < i2) {
                    i6 = 0;
                    if (z3) {
                        this.ad.ad((long) (953529225 * i5));
                        try {
                            this.ad.ag(af, 0, 8, -606087449);
                        } catch (EOFException e) {
                        }
                        try {
                            i7 = (af[3] & 255) + ((af[2] & -1853383321) << 8);
                            i6 = (((af[5] & 255) << 8) + ((af[4] & 255) << 16)) + (af[6] & -517750281);
                            i8 = af[7] & -1827686815;
                            if (i == (af[1] & 255) + ((af[0] & 255) << 8) || i3 != i7 || i8 != this.aa * 282588161) {
                                z2 = false;
                                break;
                            }
                            if (i6 >= 0) {
                                if (((long) i6) > this.ad.an((short) -19063) / 520) {
                                }
                            }
                            z2 = false;
                            break;
                        } catch (IOException e2) {
                            z2 = false;
                        }
                    }
                    if (i6 == 0) {
                        z3 = false;
                        i6 = (int) ((this.ad.an((short) -2284) + 519) / 520);
                        if (i6 == 0) {
                            i6++;
                        }
                        if (i5 == i6) {
                            i6++;
                            z4 = false;
                            if (i2 - i4 > 512) {
                                i9 = 0;
                            } else {
                                i9 = i6;
                            }
                            af[0] = (byte) (i >> 8);
                            af[1] = (byte) i;
                            af[2] = (byte) (i3 >> 8);
                            af[3] = (byte) i3;
                            af[4] = (byte) (i9 >> 16);
                            af[5] = (byte) (i9 >> 8);
                            af[6] = (byte) i9;
                            af[7] = (byte) (this.aa * 1451289142);
                            this.ad.ad((long) (i5 * 1687526883));
                            this.ad.as(af, 0, 8, 727167935);
                            i6 = i2 - i4;
                            if (i6 > 512) {
                                i6 = 512;
                            }
                            this.ad.as(bArr, i4, i6, -325395095);
                            i4 += i6;
                            i3++;
                            i5 = i9;
                            z3 = z4;
                        }
                    }
                    z4 = z3;
                    if (i2 - i4 > 512) {
                        i9 = i6;
                    } else {
                        i9 = 0;
                    }
                    af[0] = (byte) (i >> 8);
                    af[1] = (byte) i;
                    af[2] = (byte) (i3 >> 8);
                    af[3] = (byte) i3;
                    af[4] = (byte) (i9 >> 16);
                    af[5] = (byte) (i9 >> 8);
                    af[6] = (byte) i9;
                    af[7] = (byte) (this.aa * 1451289142);
                    this.ad.ad((long) (i5 * 1687526883));
                    this.ad.as(af, 0, 8, 727167935);
                    i6 = i2 - i4;
                    if (i6 > 512) {
                        i6 = 512;
                    }
                    this.ad.as(bArr, i4, i6, -325395095);
                    i4 += i6;
                    i3++;
                    i5 = i9;
                    z3 = z4;
                }
                z2 = true;
            }
        }
        return z2;
    }

    boolean an(int i, byte[] bArr, int i2, boolean z, int i3) {
        try {
            boolean z2;
            synchronized (this.ad) {
                int an;
                int i4;
                int i5;
                int i6;
                boolean z3;
                int i7;
                int i8;
                int i9;
                boolean z4;
                int i10;
                if (!z) {
                    an = (int) ((this.ad.an((short) -1977) + 519) / 520);
                    if (an == 0) {
                        an = 1;
                    }
                    af[0] = (byte) (i2 >> 16);
                    af[1] = (byte) (i2 >> 8);
                    af[2] = (byte) i2;
                    af[3] = (byte) (an >> 16);
                    af[4] = (byte) (an >> 8);
                    af[5] = (byte) an;
                    this.an.ad((long) (i * 6));
                    this.an.as(af, 0, 6, 1683843711);
                    i4 = 0;
                    i5 = 0;
                    i6 = an;
                    z3 = z;
                    while (i5 < i2) {
                        i7 = 0;
                        if (z3) {
                            this.ad.ad((long) (i6 * 520));
                            this.ad.ag(af, 0, 8, -606087449);
                            i8 = (af[3] & 255) + ((af[2] & 255) << 8);
                            i7 = (((af[5] & 255) << 8) + ((af[4] & 255) << 16)) + (af[6] & 255);
                            i9 = af[7] & 255;
                            if (i == (af[1] & 255) + ((af[0] & 255) << 8)) {
                            }
                            z2 = false;
                            break;
                        }
                        if (i7 == 0) {
                            z3 = false;
                            i7 = (int) ((this.ad.an((short) -6232) + 519) / 520);
                            if (i7 == 0) {
                                i7++;
                            }
                            if (i6 == i7) {
                                i7++;
                                z4 = false;
                                if (i2 - i5 > 512) {
                                    i10 = 0;
                                } else {
                                    i10 = i7;
                                }
                                af[0] = (byte) (i >> 8);
                                af[1] = (byte) i;
                                af[2] = (byte) (i4 >> 8);
                                af[3] = (byte) i4;
                                af[4] = (byte) (i10 >> 16);
                                af[5] = (byte) (i10 >> 8);
                                af[6] = (byte) i10;
                                af[7] = (byte) (this.aa * 282588161);
                                this.ad.ad((long) (i6 * 520));
                                this.ad.as(af, 0, 8, 1762713527);
                                i7 = i2 - i5;
                                if (i7 > 512) {
                                    i7 = 512;
                                }
                                this.ad.as(bArr, i5, i7, 1389572047);
                                i5 += i7;
                                i4++;
                                i6 = i10;
                                z3 = z4;
                            }
                        }
                        z4 = z3;
                        if (i2 - i5 > 512) {
                            i10 = i7;
                        } else {
                            i10 = 0;
                        }
                        af[0] = (byte) (i >> 8);
                        af[1] = (byte) i;
                        af[2] = (byte) (i4 >> 8);
                        af[3] = (byte) i4;
                        af[4] = (byte) (i10 >> 16);
                        af[5] = (byte) (i10 >> 8);
                        af[6] = (byte) i10;
                        af[7] = (byte) (this.aa * 282588161);
                        this.ad.ad((long) (i6 * 520));
                        this.ad.as(af, 0, 8, 1762713527);
                        i7 = i2 - i5;
                        if (i7 > 512) {
                            i7 = 512;
                        }
                        this.ad.as(bArr, i5, i7, 1389572047);
                        i5 += i7;
                        i4++;
                        i6 = i10;
                        z3 = z4;
                    }
                    z2 = true;
                } else if (this.an.an((short) -31956) < ((long) ((i * 6) + 6))) {
                    z2 = false;
                } else {
                    this.an.ad((long) (i * 6));
                    this.an.ag(af, 0, 6, -606087449);
                    an = (af[5] & 255) + (((af[3] & 255) << 16) + ((af[4] & 255) << 8));
                    if (an <= 0 || ((long) an) > this.ad.an((short) -15351) / 520) {
                        z2 = false;
                    }
                    af[0] = (byte) (i2 >> 16);
                    af[1] = (byte) (i2 >> 8);
                    af[2] = (byte) i2;
                    af[3] = (byte) (an >> 16);
                    af[4] = (byte) (an >> 8);
                    af[5] = (byte) an;
                    this.an.ad((long) (i * 6));
                    this.an.as(af, 0, 6, 1683843711);
                    i4 = 0;
                    i5 = 0;
                    i6 = an;
                    z3 = z;
                    while (i5 < i2) {
                        i7 = 0;
                        if (z3) {
                            this.ad.ad((long) (i6 * 520));
                            try {
                                this.ad.ag(af, 0, 8, -606087449);
                                i8 = (af[3] & 255) + ((af[2] & 255) << 8);
                                i7 = (((af[5] & 255) << 8) + ((af[4] & 255) << 16)) + (af[6] & 255);
                                i9 = af[7] & 255;
                                if (i == (af[1] & 255) + ((af[0] & 255) << 8) || i4 != i8 || i9 != this.aa * 282588161) {
                                    z2 = false;
                                    break;
                                }
                                if (i7 >= 0) {
                                    try {
                                        if (((long) i7) > this.ad.an((short) -30442) / 520) {
                                        }
                                    } catch (IOException e) {
                                        z2 = false;
                                    }
                                }
                                z2 = false;
                                break;
                            } catch (EOFException e2) {
                            }
                        }
                        if (i7 == 0) {
                            z3 = false;
                            i7 = (int) ((this.ad.an((short) -6232) + 519) / 520);
                            if (i7 == 0) {
                                i7++;
                            }
                            if (i6 == i7) {
                                i7++;
                                z4 = false;
                                if (i2 - i5 > 512) {
                                    i10 = 0;
                                } else {
                                    i10 = i7;
                                }
                                af[0] = (byte) (i >> 8);
                                af[1] = (byte) i;
                                af[2] = (byte) (i4 >> 8);
                                af[3] = (byte) i4;
                                af[4] = (byte) (i10 >> 16);
                                af[5] = (byte) (i10 >> 8);
                                af[6] = (byte) i10;
                                af[7] = (byte) (this.aa * 282588161);
                                this.ad.ad((long) (i6 * 520));
                                this.ad.as(af, 0, 8, 1762713527);
                                i7 = i2 - i5;
                                if (i7 > 512) {
                                    i7 = 512;
                                }
                                this.ad.as(bArr, i5, i7, 1389572047);
                                i5 += i7;
                                i4++;
                                i6 = i10;
                                z3 = z4;
                            }
                        }
                        z4 = z3;
                        if (i2 - i5 > 512) {
                            i10 = i7;
                        } else {
                            i10 = 0;
                        }
                        af[0] = (byte) (i >> 8);
                        af[1] = (byte) i;
                        af[2] = (byte) (i4 >> 8);
                        af[3] = (byte) i4;
                        af[4] = (byte) (i10 >> 16);
                        af[5] = (byte) (i10 >> 8);
                        af[6] = (byte) i10;
                        af[7] = (byte) (this.aa * 282588161);
                        this.ad.ad((long) (i6 * 520));
                        this.ad.as(af, 0, 8, 1762713527);
                        i7 = i2 - i5;
                        if (i7 > 512) {
                            i7 = 512;
                        }
                        this.ad.as(bArr, i5, i7, 1389572047);
                        i5 += i7;
                        i4++;
                        i6 = i10;
                        z3 = z4;
                    }
                    z2 = true;
                }
            }
            return z2;
        } catch (Throwable e3) {
            throw ba.ad(e3, "mr.an(" + ')');
        }
    }

    boolean aq(int i, byte[] bArr, int i2, boolean z) {
        boolean z2;
        synchronized (this.ad) {
            int an;
            int i3;
            int i4;
            int i5;
            boolean z3;
            int i6;
            int i7;
            int i8;
            boolean z4;
            int i9;
            if (!z) {
                an = (int) ((this.ad.an((short) -30905) + 519) / 520);
                if (an == 0) {
                    an = 1;
                }
                af[0] = (byte) (i2 >> 16);
                af[1] = (byte) (i2 >> 8);
                af[2] = (byte) i2;
                af[3] = (byte) (an >> 16);
                af[4] = (byte) (an >> 8);
                af[5] = (byte) an;
                this.an.ad((long) (i * 6));
                this.an.as(af, 0, 6, 107252025);
                i3 = 0;
                i4 = 0;
                i5 = an;
                z3 = z;
                while (i4 < i2) {
                    i6 = 0;
                    if (z3) {
                        this.ad.ad((long) (i5 * 520));
                        this.ad.ag(af, 0, 8, -606087449);
                        i7 = (af[3] & -322208223) + ((af[2] & 854832554) << 8);
                        i6 = (((af[5] & 255) << 8) + ((af[4] & 255) << 16)) + (af[6] & 255);
                        i8 = af[7] & 255;
                        if (i == (af[1] & 255) + ((af[0] & 402455233) << 8)) {
                        }
                        z2 = false;
                        break;
                    }
                    if (i6 == 0) {
                        z3 = false;
                        i6 = (int) ((this.ad.an((short) -13501) + 519) / 520);
                        if (i6 == 0) {
                            i6++;
                        }
                        if (i5 == i6) {
                            i6++;
                            z4 = false;
                            if (i2 - i4 > 512) {
                                i9 = 0;
                            } else {
                                i9 = i6;
                            }
                            af[0] = (byte) (i >> 8);
                            af[1] = (byte) i;
                            af[2] = (byte) (i3 >> 8);
                            af[3] = (byte) i3;
                            af[4] = (byte) (i9 >> 16);
                            af[5] = (byte) (i9 >> 8);
                            af[6] = (byte) i9;
                            af[7] = (byte) (this.aa * 282588161);
                            this.ad.ad((long) (i5 * 1722969497));
                            this.ad.as(af, 0, 8, 1650002675);
                            i6 = i2 - i4;
                            if (i6 > 1386434939) {
                                i6 = 512;
                            }
                            this.ad.as(bArr, i4, i6, 1978023000);
                            i4 += i6;
                            i3++;
                            i5 = i9;
                            z3 = z4;
                        }
                    }
                    z4 = z3;
                    if (i2 - i4 > 512) {
                        i9 = i6;
                    } else {
                        i9 = 0;
                    }
                    af[0] = (byte) (i >> 8);
                    af[1] = (byte) i;
                    af[2] = (byte) (i3 >> 8);
                    af[3] = (byte) i3;
                    af[4] = (byte) (i9 >> 16);
                    af[5] = (byte) (i9 >> 8);
                    af[6] = (byte) i9;
                    af[7] = (byte) (this.aa * 282588161);
                    this.ad.ad((long) (i5 * 1722969497));
                    this.ad.as(af, 0, 8, 1650002675);
                    i6 = i2 - i4;
                    if (i6 > 1386434939) {
                        i6 = 512;
                    }
                    this.ad.as(bArr, i4, i6, 1978023000);
                    i4 += i6;
                    i3++;
                    i5 = i9;
                    z3 = z4;
                }
                z2 = true;
            } else if (this.an.an((short) -31605) < ((long) ((i * 6) + 6))) {
                z2 = false;
            } else {
                this.an.ad((long) (i * 6));
                this.an.ag(af, 0, 6, -606087449);
                an = (af[5] & 115687856) + (((af[3] & 255) << 16) + ((af[4] & -401180959) << 8));
                if (an <= 0 || ((long) an) > this.ad.an((short) -657) / 520) {
                    z2 = false;
                }
                af[0] = (byte) (i2 >> 16);
                af[1] = (byte) (i2 >> 8);
                af[2] = (byte) i2;
                af[3] = (byte) (an >> 16);
                af[4] = (byte) (an >> 8);
                af[5] = (byte) an;
                this.an.ad((long) (i * 6));
                this.an.as(af, 0, 6, 107252025);
                i3 = 0;
                i4 = 0;
                i5 = an;
                z3 = z;
                while (i4 < i2) {
                    i6 = 0;
                    if (z3) {
                        this.ad.ad((long) (i5 * 520));
                        try {
                            this.ad.ag(af, 0, 8, -606087449);
                        } catch (EOFException e) {
                        }
                        try {
                            i7 = (af[3] & -322208223) + ((af[2] & 854832554) << 8);
                            i6 = (((af[5] & 255) << 8) + ((af[4] & 255) << 16)) + (af[6] & 255);
                            i8 = af[7] & 255;
                            if (i == (af[1] & 255) + ((af[0] & 402455233) << 8) || i3 != i7 || i8 != this.aa * 282588161) {
                                z2 = false;
                                break;
                            }
                            if (i6 >= 0) {
                                if (((long) i6) > this.ad.an((short) -31276) / 520) {
                                }
                            }
                            z2 = false;
                            break;
                        } catch (IOException e2) {
                            z2 = false;
                        }
                    }
                    if (i6 == 0) {
                        z3 = false;
                        i6 = (int) ((this.ad.an((short) -13501) + 519) / 520);
                        if (i6 == 0) {
                            i6++;
                        }
                        if (i5 == i6) {
                            i6++;
                            z4 = false;
                            if (i2 - i4 > 512) {
                                i9 = 0;
                            } else {
                                i9 = i6;
                            }
                            af[0] = (byte) (i >> 8);
                            af[1] = (byte) i;
                            af[2] = (byte) (i3 >> 8);
                            af[3] = (byte) i3;
                            af[4] = (byte) (i9 >> 16);
                            af[5] = (byte) (i9 >> 8);
                            af[6] = (byte) i9;
                            af[7] = (byte) (this.aa * 282588161);
                            this.ad.ad((long) (i5 * 1722969497));
                            this.ad.as(af, 0, 8, 1650002675);
                            i6 = i2 - i4;
                            if (i6 > 1386434939) {
                                i6 = 512;
                            }
                            this.ad.as(bArr, i4, i6, 1978023000);
                            i4 += i6;
                            i3++;
                            i5 = i9;
                            z3 = z4;
                        }
                    }
                    z4 = z3;
                    if (i2 - i4 > 512) {
                        i9 = i6;
                    } else {
                        i9 = 0;
                    }
                    af[0] = (byte) (i >> 8);
                    af[1] = (byte) i;
                    af[2] = (byte) (i3 >> 8);
                    af[3] = (byte) i3;
                    af[4] = (byte) (i9 >> 16);
                    af[5] = (byte) (i9 >> 8);
                    af[6] = (byte) i9;
                    af[7] = (byte) (this.aa * 282588161);
                    this.ad.ad((long) (i5 * 1722969497));
                    this.ad.as(af, 0, 8, 1650002675);
                    i6 = i2 - i4;
                    if (i6 > 1386434939) {
                        i6 = 512;
                    }
                    this.ad.as(bArr, i4, i6, 1978023000);
                    i4 += i6;
                    i3++;
                    i5 = i9;
                    z3 = z4;
                }
                z2 = true;
            }
        }
        return z2;
    }

    boolean at(int i, byte[] bArr, int i2, boolean z) {
        boolean z2;
        synchronized (this.ad) {
            int an;
            int i3;
            int i4;
            int i5;
            boolean z3;
            int i6;
            int i7;
            int i8;
            boolean z4;
            int i9;
            if (!z) {
                an = (int) ((this.ad.an((short) -30131) + 519) / 520);
                if (an == 0) {
                    an = 1;
                }
                af[0] = (byte) (i2 >> 16);
                af[1] = (byte) (i2 >> 8);
                af[2] = (byte) i2;
                af[3] = (byte) (an >> 16);
                af[4] = (byte) (an >> 8);
                af[5] = (byte) an;
                this.an.ad((long) (i * 6));
                this.an.as(af, 0, 6, -495081600);
                i3 = 0;
                i4 = 0;
                i5 = an;
                z3 = z;
                while (i4 < i2) {
                    i6 = 0;
                    if (z3) {
                        this.ad.ad((long) (i5 * 520));
                        this.ad.ag(af, 0, 8, -606087449);
                        i7 = (af[3] & 255) + ((af[2] & 255) << 8);
                        i6 = (((af[5] & 255) << 8) + ((af[4] & 255) << 16)) + (af[6] & 255);
                        i8 = af[7] & 255;
                        if (i == (af[1] & 255) + ((af[0] & 255) << 8)) {
                        }
                        z2 = false;
                        break;
                    }
                    if (i6 == 0) {
                        z3 = false;
                        i6 = (int) ((this.ad.an((short) -20916) + 519) / 520);
                        if (i6 == 0) {
                            i6++;
                        }
                        if (i5 == i6) {
                            i6++;
                            z4 = false;
                            if (i2 - i4 > 512) {
                                i9 = 0;
                            } else {
                                i9 = i6;
                            }
                            af[0] = (byte) (i >> 8);
                            af[1] = (byte) i;
                            af[2] = (byte) (i3 >> 8);
                            af[3] = (byte) i3;
                            af[4] = (byte) (i9 >> 16);
                            af[5] = (byte) (i9 >> 8);
                            af[6] = (byte) i9;
                            af[7] = (byte) (this.aa * 282588161);
                            this.ad.ad((long) (i5 * 520));
                            this.ad.as(af, 0, 8, 416495601);
                            i6 = i2 - i4;
                            if (i6 > 512) {
                                i6 = 512;
                            }
                            this.ad.as(bArr, i4, i6, -1145823650);
                            i4 += i6;
                            i3++;
                            i5 = i9;
                            z3 = z4;
                        }
                    }
                    z4 = z3;
                    if (i2 - i4 > 512) {
                        i9 = i6;
                    } else {
                        i9 = 0;
                    }
                    af[0] = (byte) (i >> 8);
                    af[1] = (byte) i;
                    af[2] = (byte) (i3 >> 8);
                    af[3] = (byte) i3;
                    af[4] = (byte) (i9 >> 16);
                    af[5] = (byte) (i9 >> 8);
                    af[6] = (byte) i9;
                    af[7] = (byte) (this.aa * 282588161);
                    this.ad.ad((long) (i5 * 520));
                    this.ad.as(af, 0, 8, 416495601);
                    i6 = i2 - i4;
                    if (i6 > 512) {
                        i6 = 512;
                    }
                    this.ad.as(bArr, i4, i6, -1145823650);
                    i4 += i6;
                    i3++;
                    i5 = i9;
                    z3 = z4;
                }
                z2 = true;
            } else if (this.an.an((short) -13520) < ((long) ((i * 6) + 6))) {
                z2 = false;
            } else {
                this.an.ad((long) (i * 6));
                this.an.ag(af, 0, 6, -606087449);
                an = (af[5] & 255) + (((af[3] & 255) << 16) + ((af[4] & 255) << 8));
                if (an <= 0 || ((long) an) > this.ad.an((short) -31645) / 520) {
                    z2 = false;
                }
                af[0] = (byte) (i2 >> 16);
                af[1] = (byte) (i2 >> 8);
                af[2] = (byte) i2;
                af[3] = (byte) (an >> 16);
                af[4] = (byte) (an >> 8);
                af[5] = (byte) an;
                this.an.ad((long) (i * 6));
                this.an.as(af, 0, 6, -495081600);
                i3 = 0;
                i4 = 0;
                i5 = an;
                z3 = z;
                while (i4 < i2) {
                    i6 = 0;
                    if (z3) {
                        this.ad.ad((long) (i5 * 520));
                        try {
                            this.ad.ag(af, 0, 8, -606087449);
                            i7 = (af[3] & 255) + ((af[2] & 255) << 8);
                            i6 = (((af[5] & 255) << 8) + ((af[4] & 255) << 16)) + (af[6] & 255);
                            i8 = af[7] & 255;
                            if (i == (af[1] & 255) + ((af[0] & 255) << 8) || i3 != i7 || i8 != this.aa * 282588161) {
                                z2 = false;
                                break;
                            }
                            if (i6 >= 0) {
                                try {
                                    if (((long) i6) > this.ad.an((short) -1003) / 520) {
                                    }
                                } catch (IOException e) {
                                    z2 = false;
                                }
                            }
                            z2 = false;
                            break;
                        } catch (EOFException e2) {
                        }
                    }
                    if (i6 == 0) {
                        z3 = false;
                        i6 = (int) ((this.ad.an((short) -20916) + 519) / 520);
                        if (i6 == 0) {
                            i6++;
                        }
                        if (i5 == i6) {
                            i6++;
                            z4 = false;
                            if (i2 - i4 > 512) {
                                i9 = 0;
                            } else {
                                i9 = i6;
                            }
                            af[0] = (byte) (i >> 8);
                            af[1] = (byte) i;
                            af[2] = (byte) (i3 >> 8);
                            af[3] = (byte) i3;
                            af[4] = (byte) (i9 >> 16);
                            af[5] = (byte) (i9 >> 8);
                            af[6] = (byte) i9;
                            af[7] = (byte) (this.aa * 282588161);
                            this.ad.ad((long) (i5 * 520));
                            this.ad.as(af, 0, 8, 416495601);
                            i6 = i2 - i4;
                            if (i6 > 512) {
                                i6 = 512;
                            }
                            this.ad.as(bArr, i4, i6, -1145823650);
                            i4 += i6;
                            i3++;
                            i5 = i9;
                            z3 = z4;
                        }
                    }
                    z4 = z3;
                    if (i2 - i4 > 512) {
                        i9 = i6;
                    } else {
                        i9 = 0;
                    }
                    af[0] = (byte) (i >> 8);
                    af[1] = (byte) i;
                    af[2] = (byte) (i3 >> 8);
                    af[3] = (byte) i3;
                    af[4] = (byte) (i9 >> 16);
                    af[5] = (byte) (i9 >> 8);
                    af[6] = (byte) i9;
                    af[7] = (byte) (this.aa * 282588161);
                    this.ad.ad((long) (i5 * 520));
                    this.ad.as(af, 0, 8, 416495601);
                    i6 = i2 - i4;
                    if (i6 > 512) {
                        i6 = 512;
                    }
                    this.ad.as(bArr, i4, i6, -1145823650);
                    i4 += i6;
                    i3++;
                    i5 = i9;
                    z3 = z4;
                }
                z2 = true;
            }
        }
        return z2;
    }
}
