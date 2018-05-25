package p000;

public class ig {
    byte[] ad;
    int[] af;
    int[] an;

    public ig(byte[] bArr) {
        try {
            int length = bArr.length;
            this.af = new int[length];
            this.ad = bArr;
            int[] iArr = new int[33];
            this.an = new int[8];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                byte b = bArr[i2];
                if (b != (byte) 0) {
                    int i3;
                    int i4;
                    int i5 = 1 << (32 - b);
                    int i6 = iArr[b];
                    this.af[i2] = i6;
                    if ((i6 & i5) != 0) {
                        i3 = iArr[b - 1];
                    } else {
                        i5 |= i6;
                        for (i3 = b - 1; i3 >= 1; i3--) {
                            int i7 = iArr[i3];
                            if (i7 != i6) {
                                break;
                            }
                            i4 = 1 << (32 - i3);
                            if ((i7 & i4) != 0) {
                                iArr[i3] = iArr[i3 - 1];
                                i3 = i5;
                                break;
                            }
                            iArr[i3] = i7 | i4;
                        }
                        i3 = i5;
                    }
                    iArr[b] = i3;
                    for (i5 = b + 1; i5 <= 32; i5++) {
                        if (i6 == iArr[i5]) {
                            iArr[i5] = i3;
                        }
                    }
                    i3 = 0;
                    for (byte b2 = (byte) 0; b2 < b; b2++) {
                        i4 = Integer.MIN_VALUE >>> b2;
                        if ((i6 & i4) != 0) {
                            if (this.an[i3] == 0) {
                                this.an[i3] = i;
                            }
                            i3 = this.an[i3];
                        } else {
                            i3++;
                        }
                        if (i3 >= this.an.length) {
                            int[] iArr2 = new int[(this.an.length * 2)];
                            for (i5 = 0; i5 < this.an.length; i5++) {
                                iArr2[i5] = this.an[i5];
                            }
                            this.an = iArr2;
                        }
                        i5 = i4 >>> 1;
                    }
                    this.an[i3] = i2 ^ -1;
                    if (i3 >= i) {
                        i = i3 + 1;
                    }
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "ig.<init>(" + ')');
        }
    }

    public int aa(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = i2 + i;
        int i5 = 0;
        int i6 = i3 << 3;
        while (i < i4) {
            int i7 = bArr[i] & 255;
            int i8 = this.af[i7];
            byte b = this.ad[i7];
            if (b == (byte) 0) {
                throw new RuntimeException("");
            }
            int i9 = i6 >> 3;
            int i10 = i6 & 7;
            i5 &= (-i10) >> 31;
            int i11 = (((b + i10) - 1) >> 3) + i9;
            i10 += 24;
            i5 |= i8 >>> i10;
            bArr2[i9] = (byte) i5;
            if (i9 < i11) {
                i9++;
                i10 -= 8;
                i5 = i8 >>> i10;
                bArr2[i9] = (byte) i5;
                if (i9 < i11) {
                    i9++;
                    i10 -= 8;
                    i5 = i8 >>> i10;
                    bArr2[i9] = (byte) i5;
                    if (i9 < i11) {
                        i9++;
                        i10 -= 8;
                        i5 = i8 >>> i10;
                        bArr2[i9] = (byte) i5;
                        if (i9 < i11) {
                            i5 = i8 << (-(i10 - 8));
                            bArr2[i9 + 1] = (byte) i5;
                        }
                    }
                }
            }
            i6 += b;
            i++;
        }
        return ((i6 + 7) >> 3) - i3;
    }

    public int af(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        int i5 = i2 + i;
        int i6 = 0;
        int i7 = i3 << 3;
        while (i < i5) {
            int i8 = bArr[i] & 255;
            int i9 = this.af[i8];
            byte b = this.ad[i8];
            if (b == (byte) 0) {
                throw new RuntimeException("");
            }
            int i10 = i7 >> 3;
            int i11 = i7 & 7;
            i6 &= (-i11) >> 31;
            int i12 = (((b + i11) - 1) >> 3) + i10;
            i11 += 24;
            i6 |= i9 >>> i11;
            bArr2[i10] = (byte) i6;
            if (i10 < i12) {
                i10++;
                i11 -= 8;
                i6 = i9 >>> i11;
                bArr2[i10] = (byte) i6;
                if (i10 < i12) {
                    i10++;
                    i11 -= 8;
                    i6 = i9 >>> i11;
                    try {
                        bArr2[i10] = (byte) i6;
                        if (i10 < i12) {
                            i10++;
                            i11 -= 8;
                            i6 = i9 >>> i11;
                            bArr2[i10] = (byte) i6;
                            if (i10 < i12) {
                                i6 = i9 << (-(i11 - 8));
                                bArr2[i10 + 1] = (byte) i6;
                            }
                        }
                    } catch (Throwable e) {
                        throw ba.ad(e, "ig.af(" + ')');
                    }
                }
            }
            i7 += b;
            i++;
        }
        return ((i7 + 7) >> 3) - i3;
    }

    public int ag(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = i2 + i;
        int i5 = 0;
        int i6 = i3 << 3;
        while (i < i4) {
            int i7 = bArr[i] & -1828294481;
            int i8 = this.af[i7];
            byte b = this.ad[i7];
            if (b == (byte) 0) {
                throw new RuntimeException("");
            }
            int i9 = i6 >> 3;
            int i10 = i6 & 7;
            i5 &= (-i10) >> 31;
            int i11 = (((b + i10) - 1) >> 3) + i9;
            i10 += 24;
            i5 |= i8 >>> i10;
            bArr2[i9] = (byte) i5;
            if (i9 < i11) {
                i9++;
                i10 -= 8;
                i5 = i8 >>> i10;
                bArr2[i9] = (byte) i5;
                if (i9 < i11) {
                    i9++;
                    i10 -= 8;
                    i5 = i8 >>> i10;
                    bArr2[i9] = (byte) i5;
                    if (i9 < i11) {
                        i9++;
                        i10 -= 8;
                        i5 = i8 >>> i10;
                        bArr2[i9] = (byte) i5;
                        if (i9 < i11) {
                            i5 = i8 << (-(i10 - 8));
                            bArr2[i9 + 1] = (byte) i5;
                        }
                    }
                }
            }
            i6 += b;
            i++;
        }
        return ((i6 + 7) >> 3) - i3;
    }

    public int an(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = i2 + i;
        int i5 = 0;
        int i6 = i3 << 3;
        while (i < i4) {
            int i7 = bArr[i] & 255;
            int i8 = this.af[i7];
            byte b = this.ad[i7];
            if (b == (byte) 0) {
                throw new RuntimeException("");
            }
            int i9 = i6 >> 3;
            int i10 = i6 & 7;
            i5 &= (-i10) >> 31;
            int i11 = (((b + i10) - 1) >> 3) + i9;
            i10 += 24;
            i5 |= i8 >>> i10;
            bArr2[i9] = (byte) i5;
            if (i9 < i11) {
                i9++;
                i10 -= 8;
                i5 = i8 >>> i10;
                bArr2[i9] = (byte) i5;
                if (i9 < i11) {
                    i9++;
                    i10 -= 8;
                    i5 = i8 >>> i10;
                    bArr2[i9] = (byte) i5;
                    if (i9 < i11) {
                        i9++;
                        i10 -= 8;
                        i5 = i8 >>> i10;
                        bArr2[i9] = (byte) i5;
                        if (i9 < i11) {
                            i5 = i8 << (-(i10 - 8));
                            bArr2[i9 + 1] = (byte) i5;
                        }
                    }
                }
            }
            i6 += b;
            i++;
        }
        return ((i6 + 7) >> 3) - i3;
    }

    public int ay(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = i2 + i;
        int i5 = 0;
        int i6 = i3 << 3;
        while (i < i4) {
            int i7 = bArr[i] & 255;
            int i8 = this.af[i7];
            byte b = this.ad[i7];
            if (b == (byte) 0) {
                throw new RuntimeException("");
            }
            int i9 = i6 >> 3;
            int i10 = i6 & 7;
            i5 &= (-i10) >> -142634555;
            int i11 = (((b + i10) - 1) >> 3) + i9;
            i10 += 24;
            i5 |= i8 >>> i10;
            bArr2[i9] = (byte) i5;
            if (i9 < i11) {
                i9++;
                i10 -= 8;
                i5 = i8 >>> i10;
                bArr2[i9] = (byte) i5;
                if (i9 < i11) {
                    i9++;
                    i10 -= 8;
                    i5 = i8 >>> i10;
                    bArr2[i9] = (byte) i5;
                    if (i9 < i11) {
                        i9++;
                        i10 -= 8;
                        i5 = i8 >>> i10;
                        bArr2[i9] = (byte) i5;
                        if (i9 < i11) {
                            i5 = i8 << (-(i10 - 8));
                            bArr2[i9 + 1] = (byte) i5;
                        }
                    }
                }
            }
            i6 += b;
            i++;
        }
        return ((i6 + 7) >> 3) - i3;
    }

    static void ad(int i) {
        try {
            gu.aa = (byte[][][]) null;
            dm.ag = (byte[][][]) null;
            jf.ay = (byte[][][]) null;
            gb.as = (byte[][][]) null;
            nh.aw = (int[][][]) null;
            ch.ar = (byte[][][]) null;
            gu.aj = (int[][]) null;
            dm.ae = null;
            gu.aq = null;
            dy.am = null;
            gu.at = null;
            gu.ab = null;
        } catch (Throwable e) {
            throw ba.ad(e, "ig.ad(" + ')');
        }
    }

    public int ad(byte[] bArr, int i, byte[] bArr2, int i2, int i3, int i4) {
        if (i3 == 0) {
            return 0;
        }
        int i5 = i3 + i2;
        int i6 = i;
        int i7 = 0;
        int i8 = i2;
        while (true) {
            byte b = bArr[i6];
            if (b < (byte) 0) {
                i7 = this.an[i7];
            } else {
                i7++;
            }
            int i9 = this.an[i7];
            int i10;
            if (i9 < 0) {
                i10 = i8 + 1;
                bArr2[i8] = (byte) (i9 ^ -1);
                if (i10 >= i5) {
                    break;
                }
                i7 = 0;
                if ((b & 64) == 0) {
                    i7 = this.an[i7];
                } else {
                    i7++;
                }
                i9 = this.an[i7];
                if (i9 >= 0) {
                    i8 = i10 + 1;
                    bArr2[i10] = (byte) (i9 ^ -1);
                    if (i8 < i5) {
                        break;
                    }
                    i7 = 0;
                } else {
                    i8 = i10;
                }
                if ((b & 32) == 0) {
                    i7 = this.an[i7];
                } else {
                    i7++;
                }
                i9 = this.an[i7];
                if (i9 < 0) {
                    i10 = i8 + 1;
                    bArr2[i8] = (byte) (i9 ^ -1);
                    if (i10 >= i5) {
                        break;
                    }
                    i7 = 0;
                } else {
                    i10 = i8;
                }
                if ((b & 16) == 0) {
                    try {
                        i7 = this.an[i7];
                    } catch (Throwable e) {
                        throw ba.ad(e, "ig.ad(" + ')');
                    }
                }
                i7++;
                i9 = this.an[i7];
                if (i9 < 0) {
                    i8 = i10 + 1;
                    bArr2[i10] = (byte) (i9 ^ -1);
                    if (i8 >= i5) {
                        break;
                    }
                    i7 = 0;
                } else {
                    i8 = i10;
                }
                if ((b & 8) == 0) {
                    i7 = this.an[i7];
                } else {
                    i7++;
                }
                i9 = this.an[i7];
                if (i9 >= 0) {
                    i10 = i8 + 1;
                    bArr2[i8] = (byte) (i9 ^ -1);
                    if (i10 < i5) {
                        break;
                    }
                    i7 = 0;
                } else {
                    i10 = i8;
                }
                if ((b & 4) == 0) {
                    i7 = this.an[i7];
                } else {
                    i7++;
                }
                i9 = this.an[i7];
                if (i9 < 0) {
                    i8 = i10 + 1;
                    bArr2[i10] = (byte) (i9 ^ -1);
                    if (i8 >= i5) {
                        break;
                    }
                    i7 = 0;
                } else {
                    i8 = i10;
                }
                if ((b & 2) == 0) {
                    i7 = this.an[i7];
                } else {
                    i7++;
                }
                i9 = this.an[i7];
                if (i9 >= 0) {
                    i10 = i8 + 1;
                    bArr2[i8] = (byte) (i9 ^ -1);
                    if (i10 < i5) {
                        break;
                    }
                    i7 = 0;
                } else {
                    i10 = i8;
                }
                if ((b & 1) == 0) {
                    i7 = this.an[i7];
                } else {
                    i7++;
                }
                i8 = this.an[i7];
                if (i8 < 0) {
                    i7 = i10 + 1;
                    bArr2[i10] = (byte) (i8 ^ -1);
                    if (i7 < i5) {
                        break;
                    }
                    i10 = i7;
                    i7 = 0;
                }
                i6++;
                i8 = i10;
            } else {
                i10 = i8;
                if ((b & 64) == 0) {
                    i7++;
                } else {
                    i7 = this.an[i7];
                }
                i9 = this.an[i7];
                if (i9 >= 0) {
                    i8 = i10;
                } else {
                    i8 = i10 + 1;
                    bArr2[i10] = (byte) (i9 ^ -1);
                    if (i8 < i5) {
                        break;
                    }
                    i7 = 0;
                }
                if ((b & 32) == 0) {
                    i7++;
                } else {
                    i7 = this.an[i7];
                }
                i9 = this.an[i7];
                if (i9 < 0) {
                    i10 = i8 + 1;
                    bArr2[i8] = (byte) (i9 ^ -1);
                    if (i10 >= i5) {
                        break;
                    }
                    i7 = 0;
                } else {
                    i10 = i8;
                }
                if ((b & 16) == 0) {
                    i7++;
                } else {
                    i7 = this.an[i7];
                }
                i9 = this.an[i7];
                if (i9 < 0) {
                    i8 = i10 + 1;
                    bArr2[i10] = (byte) (i9 ^ -1);
                    if (i8 >= i5) {
                        break;
                    }
                    i7 = 0;
                } else {
                    i8 = i10;
                }
                if ((b & 8) == 0) {
                    i7++;
                } else {
                    i7 = this.an[i7];
                }
                i9 = this.an[i7];
                if (i9 >= 0) {
                    i10 = i8;
                } else {
                    i10 = i8 + 1;
                    bArr2[i8] = (byte) (i9 ^ -1);
                    if (i10 < i5) {
                        break;
                    }
                    i7 = 0;
                }
                if ((b & 4) == 0) {
                    i7++;
                } else {
                    i7 = this.an[i7];
                }
                i9 = this.an[i7];
                if (i9 < 0) {
                    i8 = i10 + 1;
                    bArr2[i10] = (byte) (i9 ^ -1);
                    if (i8 >= i5) {
                        break;
                    }
                    i7 = 0;
                } else {
                    i8 = i10;
                }
                if ((b & 2) == 0) {
                    i7++;
                } else {
                    i7 = this.an[i7];
                }
                i9 = this.an[i7];
                if (i9 >= 0) {
                    i10 = i8;
                } else {
                    i10 = i8 + 1;
                    bArr2[i8] = (byte) (i9 ^ -1);
                    if (i10 < i5) {
                        break;
                    }
                    i7 = 0;
                }
                if ((b & 1) == 0) {
                    i7++;
                } else {
                    i7 = this.an[i7];
                }
                i8 = this.an[i7];
                if (i8 < 0) {
                    i7 = i10 + 1;
                    bArr2[i10] = (byte) (i8 ^ -1);
                    if (i7 < i5) {
                        break;
                    }
                    i10 = i7;
                    i7 = 0;
                }
                i6++;
                i8 = i10;
            }
        }
        return (i6 + 1) - i;
    }

    public int ar(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        int i4 = i3 + i2;
        int i5 = i;
        int i6 = 0;
        while (true) {
            byte b = bArr[i5];
            i6 = b < (byte) 0 ? this.an[i6] : i6 + 1;
            int i7 = this.an[i6];
            int i8;
            int i9;
            if (i7 < 0) {
                i8 = i2 + 1;
                bArr2[i2] = (byte) (i7 ^ -1);
                if (i8 >= i4) {
                    break;
                }
                i6 = 0;
                if ((b & 64) == 0) {
                    i6 = this.an[i6];
                } else {
                    i6++;
                }
                i9 = this.an[i6];
                if (i9 >= 0) {
                    i7 = i8 + 1;
                    bArr2[i8] = (byte) (i9 ^ -1);
                    if (i7 < i4) {
                        break;
                    }
                    i6 = 0;
                } else {
                    i7 = i8;
                }
                if ((1795871548 & b) == 0) {
                    i6 = this.an[i6];
                } else {
                    i6++;
                }
                i9 = this.an[i6];
                if (i9 < 0) {
                    i8 = i7 + 1;
                    bArr2[i7] = (byte) (i9 ^ -1);
                    if (i8 >= i4) {
                        break;
                    }
                    i6 = 0;
                } else {
                    i8 = i7;
                }
                if ((b & 16) == 0) {
                    i6 = this.an[i6];
                } else {
                    i6++;
                }
                i9 = this.an[i6];
                if (i9 < 0) {
                    i7 = i8 + 1;
                    bArr2[i8] = (byte) (i9 ^ -1);
                    if (i7 >= i4) {
                        break;
                    }
                    i6 = 0;
                } else {
                    i7 = i8;
                }
                if ((b & 8) == 0) {
                    i6 = this.an[i6];
                } else {
                    i6++;
                }
                i9 = this.an[i6];
                if (i9 >= 0) {
                    i8 = i7 + 1;
                    bArr2[i7] = (byte) (i9 ^ -1);
                    if (i8 < i4) {
                        break;
                    }
                    i6 = 0;
                } else {
                    i8 = i7;
                }
                if ((b & 4) == 0) {
                    i6 = this.an[i6];
                } else {
                    i6++;
                }
                i9 = this.an[i6];
                if (i9 >= 0) {
                    i7 = i8 + 1;
                    bArr2[i8] = (byte) (i9 ^ -1);
                    if (i7 < i4) {
                        break;
                    }
                    i6 = 0;
                } else {
                    i7 = i8;
                }
                if ((b & 2) == 0) {
                    i6 = this.an[i6];
                } else {
                    i6++;
                }
                i9 = this.an[i6];
                if (i9 >= 0) {
                    i8 = i7 + 1;
                    bArr2[i7] = (byte) (i9 ^ -1);
                    if (i8 < i4) {
                        break;
                    }
                    i6 = 0;
                } else {
                    i8 = i7;
                }
                if ((b & 1) == 0) {
                    i6 = this.an[i6];
                } else {
                    i6++;
                }
                i7 = this.an[i6];
                if (i7 >= 0) {
                    i2 = i8 + 1;
                    bArr2[i8] = (byte) (i7 ^ -1);
                    if (i2 < i4) {
                        break;
                    }
                    i6 = 0;
                } else {
                    i2 = i8;
                }
                i5++;
            } else {
                i8 = i2;
                if ((b & 64) == 0) {
                    i6++;
                } else {
                    i6 = this.an[i6];
                }
                i9 = this.an[i6];
                if (i9 >= 0) {
                    i7 = i8;
                } else {
                    i7 = i8 + 1;
                    bArr2[i8] = (byte) (i9 ^ -1);
                    if (i7 < i4) {
                        break;
                    }
                    i6 = 0;
                }
                if ((1795871548 & b) == 0) {
                    i6++;
                } else {
                    i6 = this.an[i6];
                }
                i9 = this.an[i6];
                if (i9 < 0) {
                    i8 = i7 + 1;
                    bArr2[i7] = (byte) (i9 ^ -1);
                    if (i8 >= i4) {
                        break;
                    }
                    i6 = 0;
                } else {
                    i8 = i7;
                }
                if ((b & 16) == 0) {
                    i6++;
                } else {
                    i6 = this.an[i6];
                }
                i9 = this.an[i6];
                if (i9 < 0) {
                    i7 = i8 + 1;
                    bArr2[i8] = (byte) (i9 ^ -1);
                    if (i7 >= i4) {
                        break;
                    }
                    i6 = 0;
                } else {
                    i7 = i8;
                }
                if ((b & 8) == 0) {
                    i6++;
                } else {
                    i6 = this.an[i6];
                }
                i9 = this.an[i6];
                if (i9 >= 0) {
                    i8 = i7;
                } else {
                    i8 = i7 + 1;
                    bArr2[i7] = (byte) (i9 ^ -1);
                    if (i8 < i4) {
                        break;
                    }
                    i6 = 0;
                }
                if ((b & 4) == 0) {
                    i6++;
                } else {
                    i6 = this.an[i6];
                }
                i9 = this.an[i6];
                if (i9 >= 0) {
                    i7 = i8;
                } else {
                    i7 = i8 + 1;
                    bArr2[i8] = (byte) (i9 ^ -1);
                    if (i7 < i4) {
                        break;
                    }
                    i6 = 0;
                }
                if ((b & 2) == 0) {
                    i6++;
                } else {
                    i6 = this.an[i6];
                }
                i9 = this.an[i6];
                if (i9 >= 0) {
                    i8 = i7;
                } else {
                    i8 = i7 + 1;
                    bArr2[i7] = (byte) (i9 ^ -1);
                    if (i8 < i4) {
                        break;
                    }
                    i6 = 0;
                }
                if ((b & 1) == 0) {
                    i6++;
                } else {
                    i6 = this.an[i6];
                }
                i7 = this.an[i6];
                if (i7 >= 0) {
                    i2 = i8;
                } else {
                    i2 = i8 + 1;
                    bArr2[i8] = (byte) (i7 ^ -1);
                    if (i2 < i4) {
                        break;
                    }
                    i6 = 0;
                }
                i5++;
            }
        }
        return (i5 + 1) - i;
    }

    public int as(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        int i4 = i3 + i2;
        int i5 = i;
        int i6 = 0;
        while (true) {
            byte b = bArr[i5];
            if (b < (byte) 0) {
                i6 = this.an[i6];
            } else {
                i6++;
            }
            int i7 = this.an[i6];
            int i8;
            int i9;
            if (i7 < 0) {
                i8 = i2 + 1;
                bArr2[i2] = (byte) (i7 ^ -1);
                if (i8 >= i4) {
                    break;
                }
                i6 = 0;
                if ((b & 64) == 0) {
                    i6 = this.an[i6];
                } else {
                    i6++;
                }
                i9 = this.an[i6];
                if (i9 >= 0) {
                    i7 = i8 + 1;
                    bArr2[i8] = (byte) (i9 ^ -1);
                    if (i7 < i4) {
                        break;
                    }
                    i6 = 0;
                } else {
                    i7 = i8;
                }
                if ((1222978006 & b) == 0) {
                    i6 = this.an[i6];
                } else {
                    i6++;
                }
                i9 = this.an[i6];
                if (i9 < 0) {
                    i8 = i7 + 1;
                    bArr2[i7] = (byte) (i9 ^ -1);
                    if (i8 >= i4) {
                        break;
                    }
                    i6 = 0;
                } else {
                    i8 = i7;
                }
                if ((b & 16) == 0) {
                    i6 = this.an[i6];
                } else {
                    i6++;
                }
                i9 = this.an[i6];
                if (i9 < 0) {
                    i7 = i8 + 1;
                    bArr2[i8] = (byte) (i9 ^ -1);
                    if (i7 >= i4) {
                        break;
                    }
                    i6 = 0;
                } else {
                    i7 = i8;
                }
                if ((b & 8) == 0) {
                    i6 = this.an[i6];
                } else {
                    i6++;
                }
                i9 = this.an[i6];
                if (i9 < 0) {
                    i8 = i7 + 1;
                    bArr2[i7] = (byte) (i9 ^ -1);
                    if (i8 >= i4) {
                        break;
                    }
                    i6 = 0;
                } else {
                    i8 = i7;
                }
                if ((b & 4) == 0) {
                    i6 = this.an[i6];
                } else {
                    i6++;
                }
                i9 = this.an[i6];
                if (i9 >= 0) {
                    i7 = i8 + 1;
                    bArr2[i8] = (byte) (i9 ^ -1);
                    if (i7 < i4) {
                        break;
                    }
                    i6 = 0;
                } else {
                    i7 = i8;
                }
                if ((b & 2) == 0) {
                    i6 = this.an[i6];
                } else {
                    i6++;
                }
                i9 = this.an[i6];
                if (i9 >= 0) {
                    i8 = i7 + 1;
                    bArr2[i7] = (byte) (i9 ^ -1);
                    if (i8 < i4) {
                        break;
                    }
                    i6 = 0;
                } else {
                    i8 = i7;
                }
                i6 = (b & 1) == 0 ? this.an[i6] : i6 + 1;
                i7 = this.an[i6];
                if (i7 >= 0) {
                    i2 = i8 + 1;
                    bArr2[i8] = (byte) (i7 ^ -1);
                    if (i2 < i4) {
                        break;
                    }
                    i6 = 0;
                } else {
                    i2 = i8;
                }
                i5++;
            } else {
                i8 = i2;
                if ((b & 64) == 0) {
                    i6++;
                } else {
                    i6 = this.an[i6];
                }
                i9 = this.an[i6];
                if (i9 >= 0) {
                    i7 = i8;
                } else {
                    i7 = i8 + 1;
                    bArr2[i8] = (byte) (i9 ^ -1);
                    if (i7 < i4) {
                        break;
                    }
                    i6 = 0;
                }
                if ((1222978006 & b) == 0) {
                    i6++;
                } else {
                    i6 = this.an[i6];
                }
                i9 = this.an[i6];
                if (i9 < 0) {
                    i8 = i7 + 1;
                    bArr2[i7] = (byte) (i9 ^ -1);
                    if (i8 >= i4) {
                        break;
                    }
                    i6 = 0;
                } else {
                    i8 = i7;
                }
                if ((b & 16) == 0) {
                    i6++;
                } else {
                    i6 = this.an[i6];
                }
                i9 = this.an[i6];
                if (i9 < 0) {
                    i7 = i8 + 1;
                    bArr2[i8] = (byte) (i9 ^ -1);
                    if (i7 >= i4) {
                        break;
                    }
                    i6 = 0;
                } else {
                    i7 = i8;
                }
                if ((b & 8) == 0) {
                    i6++;
                } else {
                    i6 = this.an[i6];
                }
                i9 = this.an[i6];
                if (i9 < 0) {
                    i8 = i7 + 1;
                    bArr2[i7] = (byte) (i9 ^ -1);
                    if (i8 >= i4) {
                        break;
                    }
                    i6 = 0;
                } else {
                    i8 = i7;
                }
                if ((b & 4) == 0) {
                    i6++;
                } else {
                    i6 = this.an[i6];
                }
                i9 = this.an[i6];
                if (i9 >= 0) {
                    i7 = i8;
                } else {
                    i7 = i8 + 1;
                    bArr2[i8] = (byte) (i9 ^ -1);
                    if (i7 < i4) {
                        break;
                    }
                    i6 = 0;
                }
                if ((b & 2) == 0) {
                    i6++;
                } else {
                    i6 = this.an[i6];
                }
                i9 = this.an[i6];
                if (i9 >= 0) {
                    i8 = i7;
                } else {
                    i8 = i7 + 1;
                    bArr2[i7] = (byte) (i9 ^ -1);
                    if (i8 < i4) {
                        break;
                    }
                    i6 = 0;
                }
                if ((b & 1) == 0) {
                }
                i7 = this.an[i6];
                if (i7 >= 0) {
                    i2 = i8;
                } else {
                    i2 = i8 + 1;
                    bArr2[i8] = (byte) (i7 ^ -1);
                    if (i2 < i4) {
                        break;
                    }
                    i6 = 0;
                }
                i5++;
            }
        }
        return (i5 + 1) - i;
    }

    static final void dh(int i, int i2, int i3, int i4, int i5, int i6) {
        try {
            int bg;
            int i7;
            int[] iArr;
            int i8;
            gd gdVar;
            long bw = gp.en.bw(i, i2, i3);
            if (bw != 0) {
                bg = gp.en.bg(i, i2, i3, bw);
                i7 = (bg >> 6) & 3;
                bg &= 31;
                if (!ev.af(bw)) {
                    i5 = i4;
                }
                iArr = dn.ma.af;
                i8 = ((103 - i3) * mn.ae) + ((i2 * 4) + 24624);
                ae ad = gi.ad(bb.as(bw), 1901194910);
                if (-1 != -2037709805 * ad.bg) {
                    gdVar = nm.ez[-2037709805 * ad.bg];
                    if (gdVar != null) {
                        ex.mz.ao(gdVar, (((ad.az * -1063018780) - gdVar.an) / 2) + ((i2 * 4) + 48), (((ad.ah * -1378975012) - gdVar.aa) / 2) + ((((104 - i3) - (ad.ah * -344743753)) * 4) + 48), (short) -3045);
                    }
                } else {
                    if (bg == 0 || 2 == bg) {
                        if (i7 == 0) {
                            iArr[i8] = i5;
                            iArr[i8 + 512] = i5;
                            iArr[i8 + 1024] = i5;
                            iArr[i8 + eu.ar] = i5;
                        } else if (1 == i7) {
                            iArr[i8] = i5;
                            iArr[i8 + 1] = i5;
                            iArr[i8 + 2] = i5;
                            iArr[i8 + 3] = i5;
                        } else if (2 == i7) {
                            iArr[i8 + 3] = i5;
                            iArr[(i8 + 3) + 512] = i5;
                            iArr[(i8 + 3) + 1024] = i5;
                            iArr[(i8 + 3) + eu.ar] = i5;
                        } else if (i7 == 3) {
                            iArr[i8 + eu.ar] = i5;
                            iArr[(i8 + eu.ar) + 1] = i5;
                            iArr[(i8 + eu.ar) + 2] = i5;
                            iArr[(i8 + eu.ar) + 3] = i5;
                        }
                    }
                    if (bg == 3) {
                        if (i7 == 0) {
                            iArr[i8] = i5;
                        } else if (1 == i7) {
                            iArr[i8 + 3] = i5;
                        } else if (2 == i7) {
                            iArr[(i8 + 3) + eu.ar] = i5;
                        } else if (3 == i7) {
                            iArr[i8 + eu.ar] = i5;
                        }
                    }
                    if (bg == 2) {
                        if (3 == i7) {
                            iArr[i8] = i5;
                            iArr[i8 + 512] = i5;
                            iArr[i8 + 1024] = i5;
                            iArr[i8 + eu.ar] = i5;
                        } else if (i7 == 0) {
                            iArr[i8] = i5;
                            iArr[i8 + 1] = i5;
                            iArr[i8 + 2] = i5;
                            iArr[i8 + 3] = i5;
                        } else if (1 == i7) {
                            iArr[i8 + 3] = i5;
                            iArr[(i8 + 3) + 512] = i5;
                            iArr[(i8 + 3) + 1024] = i5;
                            iArr[(i8 + 3) + eu.ar] = i5;
                        } else if (2 == i7) {
                            iArr[i8 + eu.ar] = i5;
                            iArr[(i8 + eu.ar) + 1] = i5;
                            iArr[(i8 + eu.ar) + 2] = i5;
                            iArr[(i8 + eu.ar) + 3] = i5;
                        }
                    }
                }
            }
            bw = gp.en.bc(i, i2, i3);
            if (0 != bw) {
                bg = gp.en.bg(i, i2, i3, bw);
                i7 = (bg >> 6) & 3;
                bg &= 31;
                ae ad2 = gi.ad(bb.as(bw), 1971801114);
                if (-2037709805 * ad2.bg != -1) {
                    gdVar = nm.ez[-2037709805 * ad2.bg];
                    if (gdVar != null) {
                        ex.mz.ao(gdVar, (((ad2.az * -1063018780) - gdVar.an) / 2) + ((i2 * 4) + 48), ((((104 - i3) - (ad2.ah * -344743753)) * 4) + 48) + (((ad2.ah * -1378975012) - gdVar.aa) / 2), (short) -1096);
                    }
                } else if (9 == bg) {
                    bg = 15658734;
                    if (ev.af(bw)) {
                        bg = 15597568;
                    }
                    iArr = dn.ma.af;
                    i8 = ((103 - i3) * mn.ae) + ((i2 * 4) + 24624);
                    if (i7 == 0 || i7 == 2) {
                        iArr[i8 + eu.ar] = bg;
                        iArr[(i8 + 1024) + 1] = bg;
                        iArr[(i8 + 512) + 2] = bg;
                        iArr[i8 + 3] = bg;
                    } else {
                        iArr[i8] = bg;
                        iArr[(i8 + 512) + 1] = bg;
                        iArr[(i8 + 1024) + 2] = bg;
                        iArr[(i8 + eu.ar) + 3] = bg;
                    }
                }
            }
            long bz = gp.en.bz(i, i2, i3);
            if (0 != bz) {
                ae ad3 = gi.ad(bb.as(bz), 1516581698);
                if (ad3.bg * -2037709805 != -1) {
                    gd gdVar2 = nm.ez[-2037709805 * ad3.bg];
                    if (gdVar2 != null) {
                        ex.mz.ao(gdVar2, (((-1063018780 * ad3.az) - gdVar2.an) / 2) + ((i2 * 4) + 48), ((((104 - i3) - (ad3.ah * -344743753)) * 4) + 48) + (((ad3.ah * -1378975012) - gdVar2.aa) / 2), (short) -19478);
                    }
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "ig.dh(" + ')');
        }
    }
}
