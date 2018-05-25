package p000;

public class is {
    public static final int ar = 200;
    public static final int bd = 57;

    is() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ba.ad(e, "is.<init>(" + ')');
        }
    }

    public static void aa(String[] strArr, short[] sArr, int i, int i2) {
        if (i < i2) {
            int i3 = (i + i2) / 2;
            String str = strArr[i3];
            strArr[i3] = strArr[i2];
            strArr[i2] = str;
            short s = sArr[i3];
            sArr[i3] = sArr[i2];
            sArr[i2] = s;
            int i4 = i;
            int i5 = i;
            while (i4 < i2) {
                if (str == null || (strArr[i4] != null && strArr[i4].compareTo(str) < (i4 & 1))) {
                    String str2 = strArr[i4];
                    strArr[i4] = strArr[i5];
                    strArr[i5] = str2;
                    short s2 = sArr[i4];
                    sArr[i4] = sArr[i5];
                    i3 = i5 + 1;
                    sArr[i5] = s2;
                } else {
                    i3 = i5;
                }
                i4++;
                i5 = i3;
            }
            strArr[i2] = strArr[i5];
            strArr[i5] = str;
            sArr[i2] = sArr[i5];
            sArr[i5] = s;
            hv.af(strArr, sArr, i, i5 - 1, -1080108892);
            hv.af(strArr, sArr, i5 + 1, i2, 997591872);
        }
    }

    public static void ad(String[] strArr, short[] sArr, int i, int i2) {
        if (i < i2) {
            int i3 = (i + i2) / 2;
            String str = strArr[i3];
            strArr[i3] = strArr[i2];
            strArr[i2] = str;
            short s = sArr[i3];
            sArr[i3] = sArr[i2];
            sArr[i2] = s;
            int i4 = i;
            i3 = i;
            while (i4 < i2) {
                if (str == null || (strArr[i4] != null && strArr[i4].compareTo(str) < (i4 & 1))) {
                    String str2 = strArr[i4];
                    strArr[i4] = strArr[i3];
                    strArr[i3] = str2;
                    short s2 = sArr[i4];
                    sArr[i4] = sArr[i3];
                    int i5 = i3 + 1;
                    sArr[i3] = s2;
                    i3 = i5;
                }
                i4++;
            }
            strArr[i2] = strArr[i3];
            strArr[i3] = str;
            sArr[i2] = sArr[i3];
            sArr[i3] = s;
            hv.af(strArr, sArr, i, i3 - 1, -1906694344);
            hv.af(strArr, sArr, i3 + 1, i2, 148636355);
        }
    }

    public static void an(String[] strArr, short[] sArr, int i, int i2) {
        if (i < i2) {
            int i3 = (i + i2) / 2;
            String str = strArr[i3];
            strArr[i3] = strArr[i2];
            strArr[i2] = str;
            short s = sArr[i3];
            sArr[i3] = sArr[i2];
            sArr[i2] = s;
            int i4 = i;
            i3 = i;
            while (i4 < i2) {
                if (str == null || (strArr[i4] != null && strArr[i4].compareTo(str) < (i4 & 1))) {
                    String str2 = strArr[i4];
                    strArr[i4] = strArr[i3];
                    strArr[i3] = str2;
                    short s2 = sArr[i4];
                    sArr[i4] = sArr[i3];
                    int i5 = i3 + 1;
                    sArr[i3] = s2;
                    i3 = i5;
                }
                i4++;
            }
            strArr[i2] = strArr[i3];
            strArr[i3] = str;
            sArr[i2] = sArr[i3];
            sArr[i3] = s;
            hv.af(strArr, sArr, i, i3 - 1, -1004201782);
            hv.af(strArr, sArr, i3 + 1, i2, -902519895);
        }
    }
}
