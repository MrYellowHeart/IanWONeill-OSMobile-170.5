package p000;

public class ci {
    public static int aj = 0;
    static final int ay = 6;
    static final int lf = 1;
    int aa;
    int ad;
    int af;
    int an;

    ci() {
        try {
        } catch (Throwable e) {
            throw ba.ad(e, "ci.<init>(" + ')');
        }
    }

    ci(ci ciVar) {
        try {
            this.af = ciVar.af * 1;
            this.ad = ciVar.ad * 1;
            this.an = ciVar.an * 1;
            this.aa = ciVar.aa * 1;
        } catch (Throwable e) {
            throw ba.ad(e, "ci.<init>(" + ')');
        }
    }

    static void bz(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, byte b) {
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
                try {
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
                } catch (Throwable e) {
                    throw ba.ad(e, "ci.bz(" + ')');
                }
            }
            i12 = i13 + i6;
            i13 = i10 + i7;
        }
    }
}
