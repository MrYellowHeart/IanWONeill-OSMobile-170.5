package p000;

public class hv extends kd {
    static final long dw = 60000;
    int aa;
    boolean ad;
    String ae;
    public Object[] af;
    int ag;
    int aj;
    int am = 741713220;
    public ac an;
    int aq;
    int ar;
    ac as;
    int ay;

    public static void af(String[] strArr, short[] sArr, int i, int i2, int i3) {
        if (i < i2) {
            try {
                int i4 = (i + i2) / 2;
                String str = strArr[i4];
                strArr[i4] = strArr[i2];
                strArr[i2] = str;
                short s = sArr[i4];
                sArr[i4] = sArr[i2];
                sArr[i2] = s;
                int i5 = i;
                i4 = i;
                while (i5 < i2) {
                    if (str == null || (strArr[i5] != null && strArr[i5].compareTo(str) < (i5 & 1))) {
                        String str2 = strArr[i5];
                        strArr[i5] = strArr[i4];
                        strArr[i4] = str2;
                        short s2 = sArr[i5];
                        sArr[i5] = sArr[i4];
                        int i6 = i4 + 1;
                        sArr[i4] = s2;
                        i4 = i6;
                    }
                    i5++;
                }
                strArr[i2] = strArr[i4];
                strArr[i4] = str;
                sArr[i2] = sArr[i4];
                sArr[i4] = s;
                hv.af(strArr, sArr, i, i4 - 1, -467657098);
                hv.af(strArr, sArr, i4 + 1, i2, -1938003635);
            } catch (Throwable e) {
                throw ba.ad(e, "hv.af(" + ')');
            }
        }
    }

    public void aa(Object[] objArr) {
        this.af = objArr;
    }

    public void af(Object[] objArr, int i) {
        try {
            this.af = objArr;
        } catch (Throwable e) {
            throw ba.ad(e, "hv.af(" + ')');
        }
    }

    public void ag(Object[] objArr) {
        this.af = objArr;
    }

    public void an(Object[] objArr) {
        this.af = objArr;
    }

    public void m24ad(int i, int i2) {
        try {
            this.am = -1403058805 * i;
        } catch (Throwable e) {
            throw ba.ad(e, "hv.ad(" + ')');
        }
    }

    public void ay(int i) {
        this.am = -1403058805 * i;
    }

    public static ac ad(int i, int i2) {
        int i3 = i >> 16;
        int i4 = 65535 & i;
        try {
            if ((en.ay[i3] == null || en.ay[i3][i4] == null) && !ao.aa(i3, (byte) -74)) {
                return null;
            }
            return en.ay[i3][i4];
        } catch (Throwable e) {
            throw ba.ad(e, "hv.ad(" + ')');
        }
    }

    static void bz(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = 256 - i8;
        int i11 = i3;
        int i12 = i2;
        for (int i13 = -i5; i13 < 0; i13++) {
            int i14 = i12;
            i12 = i11;
            i11 = -i4;
            while (i11 < 0) {
                int i15 = i14 + 1;
                try {
                    int i16 = iArr2[i14];
                    if (i16 != 0) {
                        int i17 = iArr[i12];
                        if (i17 == 0) {
                            i14 = i12 + 1;
                            iArr[i12] = i16 | ((i10 - 48) << 24);
                        } else {
                            i14 = i12 + 1;
                            iArr[i12] = (((((i16 & 65280) * i8) + ((i17 & 65280) * i10)) & 16711680) + ((((16711935 & i17) * i10) + ((16711935 & i16) * i8)) & -16711936)) >> 8;
                        }
                    } else {
                        i14 = i12 + 1;
                    }
                    i11++;
                    i12 = i14;
                    i14 = i15;
                } catch (Throwable e) {
                    throw ba.ad(e, "hv.bz(" + ')');
                }
            }
            i11 = i12 + i6;
            i12 = i14 + i7;
        }
    }
}
