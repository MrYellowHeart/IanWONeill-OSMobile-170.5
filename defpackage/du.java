package p000;

public class du {
    public static final du aa = new du("area");
    public static final du ad = new du("compositemap");
    public static final du af = new du("details");
    public static final du ag = new du("labels");
    static final int ah = 131072;
    public static final du an = new du("compositetexture");
    public static final int bv = 40;
    public final String ay;

    du(String str) {
        try {
            this.ay = str;
        } catch (Throwable e) {
            throw ba.ad(e, "du.<init>(" + ')');
        }
    }

    public static String ad(long j) {
        if (j <= 0 || j >= 6582952005840035281L) {
            return null;
        }
        if (j % 37 == 0) {
            return null;
        }
        int i = 0;
        for (long j2 = j; j2 != 0; j2 /= 37) {
            i++;
        }
        try {
            StringBuilder stringBuilder = new StringBuilder(i);
            while (j != 0) {
                long j3 = j / 37;
                char c = mh.af[(int) (j - (37 * j3))];
                if ('_' == c) {
                    int length = stringBuilder.length() - 1;
                    stringBuilder.setCharAt(length, Character.toUpperCase(stringBuilder.charAt(length)));
                    c = ' ';
                }
                stringBuilder.append(c);
                j = j3;
            }
            stringBuilder.reverse();
            stringBuilder.setCharAt(0, Character.toUpperCase(stringBuilder.charAt(0)));
            return stringBuilder.toString();
        } catch (Throwable e) {
            throw ba.ad(e, "du.ad(" + ')');
        }
    }

    static void ap(int i, int i2, int i3, int[] iArr, int[] iArr2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
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
                try {
                    i15 = iArr2[i15];
                    if (i15 != 0) {
                        int i19 = iArr[i17];
                        int i20 = i15 + i19;
                        i15 = (i15 & 16711935) + (i19 & 16711935);
                        i19 = (16777472 & i15) + ((i20 - i15) & ic.ad);
                        i15 = i17 + 1;
                        iArr[i17] = (i19 - (i19 >>> 8)) | (i20 - i19);
                    } else {
                        i15 = i17 + 1;
                    }
                    i14++;
                    i17 = i15;
                    i15 = i18;
                } catch (Throwable e) {
                    throw ba.ad(e, "du.ap(" + ')');
                }
            }
            i14 = i15 + i11;
            i13++;
            i15 = i17 + i10;
        }
    }

    static final void bk(int i) {
        int i2 = 0;
        try {
            if (bb.mq) {
                if (df.my != null) {
                    df.my.at(1241064189);
                }
                while (i2 < gw.ay * -1675758365) {
                    client.hb[gw.as[i2]].aj(157004358);
                    i2++;
                }
                bb.mq = false;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "du.bk(" + ')');
        }
    }

    static final void fb(int i, byte b) {
        try {
            if (ao.aa(i, (byte) -126)) {
                ac[] acVarArr = en.ay[i];
                for (ac acVar : acVarArr) {
                    if (acVar != null) {
                        acVar.fg = 0;
                        acVar.fq = 0;
                    }
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "du.fb(" + ')');
        }
    }
}
