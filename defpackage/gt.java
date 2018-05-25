package p000;

public class gt {
    public static final gt aa = new gt(12);
    static final gt ad = new gt(4);
    static final gt ae = new gt(0);
    public static final gt af = new gt(5);
    public static final gt ag = new gt(9);
    static final gt aj = new gt(8);
    static final gt am = new gt(11);
    public static final gt an = new gt(2);
    static final gt aq = new gt(1);
    static final gt ar = new gt(6);
    public static final gt as = new gt(10);
    public static final gt at = new gt(7);
    static final gt ay = new gt(3);
    public static final int az = 32;
    static int nr;
    final int ab;

    public static byte[] ad(CharSequence charSequence, int i) {
        try {
            int length = charSequence.length();
            byte[] bArr = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = charSequence.charAt(i2);
                if ((charAt > '\u0000' && charAt < '') || (charAt >= ' ' && charAt <= 'ÿ')) {
                    bArr[i2] = (byte) charAt;
                } else if ('€' == charAt) {
                    bArr[i2] = Byte.MIN_VALUE;
                } else if ('‚' == charAt) {
                    bArr[i2] = (byte) -126;
                } else if ('ƒ' == charAt) {
                    bArr[i2] = (byte) -125;
                } else if ('„' == charAt) {
                    bArr[i2] = (byte) -124;
                } else if ('…' == charAt) {
                    bArr[i2] = (byte) -123;
                } else if ('†' == charAt) {
                    bArr[i2] = (byte) -122;
                } else if (charAt == '‡') {
                    bArr[i2] = (byte) -121;
                } else if ('ˆ' == charAt) {
                    bArr[i2] = (byte) -120;
                } else if (charAt == '‰') {
                    bArr[i2] = (byte) -119;
                } else if ('Š' == charAt) {
                    bArr[i2] = (byte) -118;
                } else if (charAt == '‹') {
                    bArr[i2] = (byte) -117;
                } else if ('Œ' == charAt) {
                    bArr[i2] = (byte) -116;
                } else if (charAt == 'Ž') {
                    bArr[i2] = (byte) -114;
                } else if ('‘' == charAt) {
                    bArr[i2] = (byte) -111;
                } else if ('’' == charAt) {
                    bArr[i2] = (byte) -110;
                } else if (charAt == '“') {
                    bArr[i2] = (byte) -109;
                } else if ('”' == charAt) {
                    bArr[i2] = (byte) -108;
                } else if ('•' == charAt) {
                    bArr[i2] = (byte) -107;
                } else if ('–' == charAt) {
                    bArr[i2] = (byte) -106;
                } else if ('—' == charAt) {
                    bArr[i2] = (byte) -105;
                } else if ('˜' == charAt) {
                    bArr[i2] = (byte) -104;
                } else if ('™' == charAt) {
                    bArr[i2] = (byte) -103;
                } else if (charAt == 'š') {
                    bArr[i2] = (byte) -102;
                } else if ('›' == charAt) {
                    bArr[i2] = (byte) -101;
                } else if ('œ' == charAt) {
                    bArr[i2] = (byte) -100;
                } else if ('ž' == charAt) {
                    bArr[i2] = (byte) -98;
                } else if ('Ÿ' == charAt) {
                    bArr[i2] = (byte) -97;
                } else {
                    bArr[i2] = (byte) 63;
                }
            }
            return bArr;
        } catch (Throwable e) {
            throw ba.ad(e, "gt.ad(" + ')');
        }
    }

    gt(int i) {
        try {
            this.ab = -2110653131 * i;
        } catch (Throwable e) {
            throw ba.ad(e, "gt.<init>(" + ')');
        }
    }

    static void ap(int i, int i2, int i3, int[] iArr, int[] iArr2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        int i14 = -i9;
        int i15 = i4;
        int i16 = i6;
        while (i14 < 0) {
            int i17 = i16;
            i16 = i15;
            i15 = -i8;
            int i18 = i17;
            while (i15 < 0) {
                int i19 = i16 + 1;
                try {
                    i16 = iArr2[i16];
                    if (i16 != 0) {
                        int i20 = (16711935 & i16) * i12;
                        i16 = ((((i16 * i12) - i20) & 16711680) + (i20 & -16711936)) >>> 8;
                        i20 = iArr[i18];
                        int i21 = i16 + i20;
                        i16 = (i16 & 16711935) + (i20 & 16711935);
                        i20 = ((i21 - i16) & ic.ad) + (i16 & 16777472);
                        i16 = i18 + 1;
                        iArr[i18] = (i20 - (i20 >>> 8)) | (i21 - i20);
                    } else {
                        i16 = i18 + 1;
                    }
                    i15++;
                    i18 = i16;
                    i16 = i19;
                } catch (Throwable e) {
                    throw ba.ad(e, "gt.ap(" + ')');
                }
            }
            i15 = i16 + i11;
            i14++;
            i16 = i18 + i10;
        }
    }

    static int au(byte b) {
        try {
            if (client.pp == null || client.pu * -427906923 >= client.pp.size()) {
                return lm.ar;
            }
            int i = 0;
            for (int i2 = 0; i2 <= client.pu * -427906923; i2++) {
                i += ((hs) client.pp.get(i2)).aa * -1368840285;
            }
            return (i * lm.ar) / (-1160977331 * client.pl);
        } catch (Throwable e) {
            throw ba.ad(e, "gt.au(" + ')');
        }
    }
}
