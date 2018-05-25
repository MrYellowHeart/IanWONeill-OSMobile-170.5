package p000;

public class bf extends kd {
    public static final int ah = 0;
    int[][] aa;
    int ad;
    int af;
    int[] ag;
    int[] an;
    int[] ay;

    bf(int i, byte[] bArr) {
        int i2 = 0;
        try {
            int i3;
            this.af = 188272583 * i;
            ik ikVar = new ik(bArr);
            this.ad = ikVar.ao((byte) 0) * -226945423;
            this.an = new int[(this.ad * 1121446545)];
            this.aa = new int[(this.ad * 1121446545)][];
            this.ag = new int[(-672493312 * this.ad)];
            this.ay = new int[(this.ad * 1121446545)];
            for (i3 = 0; i3 < this.ad * 1121446545; i3++) {
                this.an[i3] = ikVar.ao((byte) 0);
            }
            for (i3 = 0; i3 < this.ad * 1121446545; i3++) {
                this.aa[i3] = new int[ikVar.ao((byte) 0)];
            }
            for (int i4 = 0; i4 < this.ad * 1121446545; i4++) {
                for (i3 = 0; i3 < this.aa[i4].length; i3++) {
                    int[] iArr = this.ag;
                    int i5 = (i4 * 256) + i3;
                    int[] iArr2 = this.aa[i4];
                    int ao = ikVar.ao((byte) 0);
                    iArr2[i3] = ao;
                    iArr[i5] = ao;
                }
            }
            while (i2 < this.ad * 1121446545) {
                this.ay[i2] = this.aa[i2].length;
                i2++;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "bf.<init>(" + ')');
        }
    }

    static void ak(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = -(i4 >> 2);
        int i10 = -(i4 & 3);
        int i11 = -i5;
        int i12 = i3;
        int i13 = i2;
        while (i11 < 0) {
            int i14 = i9;
            while (i14 < 0) {
                int i15;
                int i16 = i13 + 1;
                try {
                    i15 = iArr2[i13];
                    if (i15 != 0) {
                        i13 = i12 + 1;
                        iArr[i12] = i15;
                        i12 = i13;
                    } else {
                        i12++;
                    }
                    i15 = i16 + 1;
                    i16 = iArr2[i16];
                    if (i16 != 0) {
                        i13 = i12 + 1;
                        iArr[i12] = i16;
                        i12 = i13;
                    } else {
                        i12++;
                    }
                    int i17 = i15 + 1;
                    i16 = iArr2[i15];
                    if (i16 != 0) {
                        i13 = i12 + 1;
                        iArr[i12] = i16;
                        i12 = i13;
                    } else {
                        i12++;
                    }
                    i16 = i17 + 1;
                    i15 = iArr2[i17];
                    if (i15 != 0) {
                        i13 = i12 + 1;
                        iArr[i12] = i15;
                    } else {
                        i13 = i12 + 1;
                    }
                    i14++;
                    i12 = i13;
                    i13 = i16;
                } catch (Throwable e) {
                    throw ba.ad(e, "bf.ak(" + ')');
                }
            }
            i14 = i12;
            i12 = i10;
            while (i12 < 0) {
                i16 = i13 + 1;
                i15 = iArr2[i13];
                if (i15 != 0) {
                    i13 = i14 + 1;
                    iArr[i14] = i15;
                } else {
                    i13 = i14 + 1;
                }
                i12++;
                i14 = i13;
                i13 = i16;
            }
            i12 = i14 + i6;
            i11++;
            i13 += i7;
        }
    }
}
