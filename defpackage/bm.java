package p000;

public final class bm {
    int aa;
    int ad;
    public long ae;
    int af;
    int ag;
    public cq aj;
    int an;
    int aq;
    public cq ar;
    int as;
    int ay;

    bm() {
        try {
            this.ae = 0;
            this.aq = 0;
        } catch (Throwable e) {
            throw ba.ad(e, "bm.<init>(" + ')');
        }
    }

    static ds an(int i, int i2, byte b) {
        try {
            return (ds) dh.ae.af(lf.af(i, i2, 0, (byte) -62));
        } catch (Throwable e) {
            throw ba.ad(e, "bm.an(" + ')');
        }
    }

    static int as(hq hqVar, hq hqVar2, int i, boolean z, byte b) {
        int i2 = 1;
        if (1 == i) {
            try {
                int i3 = hqVar.at * -1545862613;
                i2 = hqVar2.at * -1545862613;
                if (!z) {
                    if (i3 == -1) {
                        i3 = 2001;
                    }
                    if (i2 == -1) {
                        i2 = 2001;
                    }
                }
                return i3 - i2;
            } catch (Throwable e) {
                throw ba.ad(e, "bm.as(" + ')');
            }
        } else if (i == 2) {
            return (hqVar.ai * 1116252417) - (1116252417 * hqVar2.ai);
        } else {
            if (3 == i) {
                if (hqVar.aw.equals("-")) {
                    if (hqVar2.aw.equals("-")) {
                        return 0;
                    }
                    if (z) {
                        i2 = -1;
                    }
                    return i2;
                } else if (!hqVar2.aw.equals("-")) {
                    return hqVar.aw.compareTo(hqVar2.aw);
                } else {
                    if (!z) {
                        i2 = -1;
                    }
                    return i2;
                }
            } else if (i == 4) {
                if (hqVar.at(2117921008)) {
                    if (hqVar2.at(2117921008)) {
                        return 0;
                    }
                    return 1;
                } else if (hqVar2.at(2117921008)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (5 == i) {
                if (!hqVar.aq(-336102326)) {
                    i2 = hqVar2.aq(-784258097) ? -1 : 0;
                } else if (hqVar2.aq(759479627)) {
                    i2 = 0;
                }
                return i2;
            } else if (i == 6) {
                if (hqVar.am(603044897)) {
                    if (hqVar2.am(-1001711820)) {
                        return 0;
                    }
                    return 1;
                } else if (hqVar2.am(-18997462)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (i != 7) {
                return (-756728079 * hqVar.aq) - (-756728079 * hqVar2.aq);
            } else {
                if (hqVar.ae(-1998519929)) {
                    if (hqVar2.ae(-1726215933)) {
                        return 0;
                    }
                    return 1;
                } else if (hqVar2.ae(-1077274779)) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }

    static void ak(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = -(i4 >> 2);
        int i10 = -(i4 & 3);
        int i11 = -i5;
        int i12 = i2;
        int i13 = i3;
        while (i11 < 0) {
            int i14;
            int i15 = i9;
            while (i15 < 0) {
                int i16 = i12 + 1;
                try {
                    i14 = iArr2[i12];
                    if (i14 != 0) {
                        i12 = i13 + 1;
                        iArr[i13] = i14;
                    } else {
                        i12 = i13 + 1;
                    }
                    i14 = i16 + 1;
                    i16 = iArr2[i16];
                    if (i16 != 0) {
                        i13 = i12 + 1;
                        iArr[i12] = i16;
                        i12 = i13;
                    } else {
                        i12++;
                    }
                    int i17 = i14 + 1;
                    i16 = iArr2[i14];
                    if (i16 != 0) {
                        i13 = i12 + 1;
                        iArr[i12] = i16;
                        i12 = i13;
                    } else {
                        i12++;
                    }
                    i16 = i17 + 1;
                    i14 = iArr2[i17];
                    if (i14 != 0) {
                        i13 = i12 + 1;
                        iArr[i12] = i14;
                    } else {
                        i13 = i12 + 1;
                    }
                    i15++;
                    i12 = i16;
                } catch (Throwable e) {
                    throw ba.ad(e, "bm.ak(" + ')');
                }
            }
            i15 = i13;
            i13 = i12;
            i12 = i10;
            while (i12 < 0) {
                i16 = i13 + 1;
                i14 = iArr2[i13];
                if (i14 != 0) {
                    i13 = i15 + 1;
                    iArr[i15] = i14;
                } else {
                    i13 = i15 + 1;
                }
                i12++;
                i15 = i13;
                i13 = i16;
            }
            i12 = i13 + i7;
            i11++;
            i13 = i15 + i6;
        }
    }

    static void bs(int i, int i2, int i3) {
        try {
            client.fz = -1672228023 * i;
            client.fn = -243484663 * i2;
            client.fs = 0;
            client.fe = 0;
        } catch (Throwable e) {
            throw ba.ad(e, "bm.bs(" + ')');
        }
    }
}
