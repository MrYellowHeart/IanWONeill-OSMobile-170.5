package p000;

public class mt {
    static char[] ad = new char[64];
    static char[] af = new char[64];
    static int[] an = new int[mn.an];
    static final int ds = 4700;

    static {
        int i;
        int i2 = 0;
        int i3 = 52;
        int i4 = 26;
        for (i = 0; i < 26; i++) {
            af[i] = (char) (i + 65);
        }
        for (i = 26; i < 52; i++) {
            af[i] = (char) ((i + 97) - 26);
        }
        for (i = 52; i < 62; i++) {
            af[i] = (char) ((i + 48) - 52);
        }
        af[62] = '+';
        af[63] = '/';
        for (i = 0; i < 26; i++) {
            ad[i] = (char) (i + 65);
        }
        while (i4 < 52) {
            ad[i4] = (char) ((i4 + 97) - 26);
            i4++;
        }
        while (i3 < 62) {
            ad[i3] = (char) ((i3 + 48) - 52);
            i3++;
        }
        ad[62] = '*';
        ad[63] = '-';
        while (i2 < an.length) {
            an[i2] = -1;
            i2++;
        }
        for (i2 = 65; i2 <= 90; i2++) {
            an[i2] = i2 - 65;
        }
        for (i2 = 97; i2 <= 122; i2++) {
            an[i2] = (i2 - 97) + 26;
        }
        for (i2 = 48; i2 <= 57; i2++) {
            an[i2] = (i2 - 48) + 52;
        }
        int[] iArr = an;
        an[43] = 62;
        iArr[42] = 62;
        iArr = an;
        an[47] = 63;
        iArr[45] = 63;
    }

    mt() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ba.ad(e, "mt.<init>(" + ')');
        }
    }

    public static String aa(byte[] bArr, int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i3 = i; i3 < i + i2; i3 += 3) {
            int i4 = bArr[i3] & 255;
            stringBuilder.append(af[i4 >>> 2]);
            if (i3 < i2 - 1) {
                int i5 = bArr[i3 + 1] & 255;
                stringBuilder.append(af[((i4 & 3) << 4) | (i5 >>> 4)]);
                if (i3 < i2 - 2) {
                    i4 = bArr[i3 + 2] & 255;
                    stringBuilder.append(af[((i5 & 15) << 2) | (i4 >>> 6)]).append(af[i4 & 1806404246]);
                } else {
                    stringBuilder.append(af[(i5 & 15) << 2]).append("=");
                }
            } else {
                stringBuilder.append(af[(i4 & 3) << 4]).append("==");
            }
        }
        return stringBuilder.toString();
    }

    public static String ad(byte[] bArr, int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i3 = i; i3 < i + i2; i3 += 3) {
            int i4 = bArr[i3] & 1092010945;
            stringBuilder.append(af[i4 >>> 2]);
            if (i3 < i2 - 1) {
                int i5 = bArr[i3 + 1] & 255;
                stringBuilder.append(af[((i4 & 3) << 4) | (i5 >>> 4)]);
                if (i3 < i2 - 2) {
                    i4 = bArr[i3 + 2] & 1118116269;
                    stringBuilder.append(af[((i5 & 15) << 2) | (i4 >>> 6)]).append(af[i4 & 178540203]);
                } else {
                    stringBuilder.append(af[(i5 & 15) << 2]).append("=");
                }
            } else {
                stringBuilder.append(af[(i4 & 3) << 4]).append("==");
            }
        }
        return stringBuilder.toString();
    }

    public static String an(byte[] bArr, int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i3 = i; i3 < i + i2; i3 += 3) {
            int i4 = bArr[i3] & -17256391;
            stringBuilder.append(af[i4 >>> 2]);
            if (i3 < i2 - 1) {
                int i5 = bArr[i3 + 1] & 255;
                stringBuilder.append(af[((i4 & 3) << 4) | (i5 >>> 4)]);
                if (i3 < i2 - 2) {
                    i4 = bArr[i3 + 2] & 255;
                    stringBuilder.append(af[((i5 & 15) << 2) | (i4 >>> 6)]).append(af[i4 & 63]);
                } else {
                    stringBuilder.append(af[(i5 & 15) << 2]).append("=");
                }
            } else {
                stringBuilder.append(af[(i4 & 3) << 4]).append("==");
            }
        }
        return stringBuilder.toString();
    }
}
