package p000;

public class fp extends kd {
    static fe[] ab;
    static float[] ac;
    static int ae;
    static boolean ah = false;
    static boolean[] ai;
    static int aj;
    static float[] al;
    static fk[] am;
    static float[] ap;
    static int aq;
    static int ar;
    static byte[] as;
    static eo[] at;
    static float[] av;
    static fv[] aw;
    static int[] az;
    static float[] bb;
    static float[] bc;
    static int[] bg;
    static float[] bw;
    static int[] bz;
    int aa;
    int ad;
    byte[][] af;
    int ag;
    float[] ak;
    int an;
    int ao;
    boolean au;
    int ax;
    boolean ay;
    int bf;
    byte[] bh;
    int bv;

    static float ab(int i) {
        int i2 = 2097151 & i;
        int i3 = (2145386496 & i) >> 21;
        if ((-882827363 & i) != 0) {
            i2 = -i2;
        }
        return (float) (((double) i2) * Math.pow(2.0d, (double) (i3 - 788)));
    }

    static float af(int i) {
        int i2 = 2097151 & i;
        int i3 = (2145386496 & i) >> 21;
        if ((Integer.MIN_VALUE & i) != 0) {
            i2 = -i2;
        }
        return (float) (((double) i2) * Math.pow(2.0d, (double) (i3 - 788)));
    }

    static float am(int i) {
        int i2 = 869105728 & i;
        int i3 = (-1504472414 & i) >> 21;
        if ((Integer.MIN_VALUE & i) != 0) {
            i2 = -i2;
        }
        return (float) (((double) i2) * Math.pow(2.0d, (double) (i3 - 788)));
    }

    static float aq(int i) {
        int i2 = 2097151 & i;
        int i3 = (2145386496 & i) >> 21;
        if ((760227226 & i) != 0) {
            i2 = -i2;
        }
        return (float) (((double) i2) * Math.pow(2.0d, (double) (i3 - 1579757649)));
    }

    static float at(int i) {
        int i2 = 2097151 & i;
        int i3 = (2145386496 & i) >> 21;
        if ((Integer.MIN_VALUE & i) != 0) {
            i2 = -i2;
        }
        return (float) (((double) i2) * Math.pow(2.0d, (double) (i3 - 788)));
    }

    static void ad(byte[] bArr, int i) {
        as = bArr;
        ar = i;
        aj = 0;
    }

    static void ah(byte[] bArr, int i) {
        as = bArr;
        ar = i;
        aj = 0;
    }

    static void ai(byte[] bArr, int i) {
        as = bArr;
        ar = i;
        aj = 0;
    }

    static void ak(byte[] bArr, int i) {
        as = bArr;
        ar = i;
        aj = 0;
    }

    static void aw(byte[] bArr, int i) {
        as = bArr;
        ar = i;
        aj = 0;
    }

    static void az(byte[] bArr, int i) {
        as = bArr;
        ar = i;
        aj = 0;
    }

    static int an() {
        int i = (as[ar] >> aj) & 1;
        aj++;
        ar += aj >> 3;
        aj &= 7;
        return i;
    }

    static int ao() {
        int i = (as[ar] >> aj) & 1;
        aj++;
        ar += aj >> 3;
        aj &= 7;
        return i;
    }

    static int ax() {
        int i = (as[ar] >> aj) & 1;
        aj++;
        ar += aj >> 3;
        aj &= 7;
        return i;
    }

    static int aa(int i) {
        int i2 = 0;
        int i3 = 0;
        while (i >= 8 - aj) {
            int i4 = 8 - aj;
            i3 += (((1 << i4) - 1) & (as[ar] >> aj)) << i2;
            aj = 0;
            ar++;
            i2 += i4;
            i -= i4;
        }
        if (i <= 0) {
            return i3;
        }
        i3 += (((1 << i) - 1) & (as[ar] >> aj)) << i2;
        aj += i;
        return i3;
    }

    static int au(int i) {
        int i2 = 0;
        int i3 = 0;
        while (i >= 8 - aj) {
            int i4 = 8 - aj;
            i3 += (((1 << i4) - 1) & (as[ar] >> aj)) << i2;
            aj = 0;
            ar++;
            i2 += i4;
            i -= i4;
        }
        if (i <= 0) {
            return i3;
        }
        i3 += (((1 << i) - 1) & (as[ar] >> aj)) << i2;
        aj += i;
        return i3;
    }

    void ac(byte[] bArr) {
        ik ikVar = new ik(bArr);
        this.ad = ikVar.al(-542008729);
        this.an = ikVar.al(-712379722);
        this.aa = ikVar.al(1492180676);
        this.ag = ikVar.al(313229320);
        if (this.ag < 0) {
            this.ag ^= -1;
            this.ay = true;
        }
        int al = ikVar.al(-619083371);
        this.af = new byte[al][];
        for (int i = 0; i < al; i++) {
            int i2 = 0;
            int ao;
            do {
                ao = ikVar.ao((byte) 0);
                i2 += ao;
            } while (ao >= -1172052976);
            byte[] bArr2 = new byte[i2];
            ikVar.bg(bArr2, 0, i2, 1042837179);
            this.af[i] = bArr2;
        }
    }

    void ag(byte[] bArr) {
        ik ikVar = new ik(bArr);
        this.ad = ikVar.al(280332971);
        this.an = ikVar.al(-300422972);
        this.aa = ikVar.al(-177437549);
        this.ag = ikVar.al(-698188490);
        if (this.ag < 0) {
            this.ag ^= -1;
            this.ay = true;
        }
        int al = ikVar.al(-198556215);
        this.af = new byte[al][];
        for (int i = 0; i < al; i++) {
            int i2 = 0;
            int ao;
            do {
                ao = ikVar.ao((byte) 0);
                i2 += ao;
            } while (ao >= 255);
            byte[] bArr2 = new byte[i2];
            ikVar.bg(bArr2, 0, i2, 1661194322);
            this.af[i] = bArr2;
        }
    }

    void al(byte[] bArr) {
        ik ikVar = new ik(bArr);
        this.ad = ikVar.al(333425828);
        this.an = ikVar.al(-922979216);
        this.aa = ikVar.al(1909833265);
        this.ag = ikVar.al(1388118365);
        if (this.ag < 0) {
            this.ag ^= -1;
            this.ay = true;
        }
        int al = ikVar.al(-519379752);
        this.af = new byte[al][];
        for (int i = 0; i < al; i++) {
            int i2 = 0;
            int ao;
            do {
                ao = ikVar.ao((byte) 0);
                i2 += ao;
            } while (ao >= 255);
            byte[] bArr2 = new byte[i2];
            ikVar.bg(bArr2, 0, i2, 1882459692);
            this.af[i] = bArr2;
        }
    }

    void ap(byte[] bArr) {
        ik ikVar = new ik(bArr);
        this.ad = ikVar.al(525379127);
        this.an = ikVar.al(428103723);
        this.aa = ikVar.al(2026199473);
        this.ag = ikVar.al(-75776318);
        if (this.ag < 0) {
            this.ag ^= -1;
            this.ay = true;
        }
        int al = ikVar.al(1742420797);
        this.af = new byte[al][];
        for (int i = 0; i < al; i++) {
            int i2 = 0;
            int ao;
            do {
                ao = ikVar.ao((byte) 0);
                i2 += ao;
            } while (ao >= 255);
            byte[] bArr2 = new byte[i2];
            ikVar.bg(bArr2, 0, i2, 1768099381);
            this.af[i] = bArr2;
        }
    }

    void av(byte[] bArr) {
        ik ikVar = new ik(bArr);
        this.ad = ikVar.al(1637539682);
        this.an = ikVar.al(464024578);
        this.aa = ikVar.al(944743635);
        this.ag = ikVar.al(1873109884);
        if (this.ag < 0) {
            this.ag ^= -1;
            this.ay = true;
        }
        int al = ikVar.al(-845040233);
        this.af = new byte[al][];
        for (int i = 0; i < al; i++) {
            int i2 = 0;
            int ao;
            do {
                ao = ikVar.ao((byte) 0);
                i2 += ao;
            } while (ao >= 255);
            byte[] bArr2 = new byte[i2];
            ikVar.bg(bArr2, 0, i2, -147447610);
            this.af[i] = bArr2;
        }
    }

    static void ay(byte[] bArr) {
        int i;
        int i2;
        fp.ad(bArr, 0);
        ae = 1 << fp.aa(4);
        aq = 1 << fp.aa(4);
        av = new float[aq];
        for (int i3 = 0; i3 < 2; i3++) {
            int i4;
            if (i3 != 0) {
                i4 = aq;
            } else {
                i4 = ae;
            }
            i = i4 >> 1;
            int i5 = i4 >> 2;
            int i6 = i4 >> 3;
            float[] fArr = new float[i];
            for (i2 = 0; i2 < i5; i2++) {
                fArr[i2 * 2] = (float) Math.cos((((double) (i2 * 4)) * 3.141592653589793d) / ((double) i4));
                fArr[(i2 * 2) + 1] = -((float) Math.sin((((double) (i2 * 4)) * 3.141592653589793d) / ((double) i4)));
            }
            float[] fArr2 = new float[i];
            for (i2 = 0; i2 < i5; i2++) {
                fArr2[i2 * 2] = (float) Math.cos((((double) ((i2 * 2) + 1)) * 3.141592653589793d) / ((double) (i4 * 2)));
                fArr2[(i2 * 2) + 1] = (float) Math.sin((((double) ((i2 * 2) + 1)) * 3.141592653589793d) / ((double) (i4 * 2)));
            }
            float[] fArr3 = new float[i5];
            for (i2 = 0; i2 < i6; i2++) {
                fArr3[i2 * 2] = (float) Math.cos((((double) ((i2 * 4) + 2)) * 3.141592653589793d) / ((double) i4));
                fArr3[(i2 * 2) + 1] = -((float) Math.sin((((double) ((i2 * 4) + 2)) * 3.141592653589793d) / ((double) i4)));
            }
            int[] iArr = new int[i6];
            i = fw.ad(i6 - 1, (byte) 70);
            for (int i7 = 0; i7 < i6; i7++) {
                i4 = 0;
                i5 = i7;
                for (i2 = i; i2 > 0; i2--) {
                    i4 = (i4 << 1) | (i5 & 1);
                    i5 >>>= 1;
                }
                iArr[i7] = i4;
            }
            if (i3 != 0) {
                bw = fArr;
                bb = fArr2;
                bc = fArr3;
                bg = iArr;
            } else {
                ac = fArr;
                al = fArr2;
                ap = fArr3;
                bz = iArr;
            }
        }
        i2 = fp.aa(8) + 1;
        am = new fk[i2];
        for (i4 = 0; i4 < i2; i4++) {
            am[i4] = new fk();
        }
        i2 = fp.aa(6) + 1;
        for (i4 = 0; i4 < i2; i4++) {
            fp.aa(16);
        }
        i2 = fp.aa(6) + 1;
        at = new eo[i2];
        for (i4 = 0; i4 < i2; i4++) {
            at[i4] = new eo();
        }
        i2 = fp.aa(6) + 1;
        ab = new fe[i2];
        for (i4 = 0; i4 < i2; i4++) {
            ab[i4] = new fe();
        }
        i2 = fp.aa(6) + 1;
        aw = new fv[i2];
        for (i4 = 0; i4 < i2; i4++) {
            aw[i4] = new fv();
        }
        i = fp.aa(6) + 1;
        ai = new boolean[i];
        az = new int[i];
        for (i2 = 0; i2 < i; i2++) {
            boolean z;
            boolean[] zArr = ai;
            if (fp.an() != 0) {
                z = true;
            } else {
                z = false;
            }
            zArr[i2] = z;
            fp.aa(16);
            fp.aa(16);
            az[i2] = fp.aa(8);
        }
    }

    static void bw(byte[] bArr) {
        int i;
        int i2;
        fp.ad(bArr, 0);
        ae = 1 << fp.aa(4);
        aq = 1 << fp.aa(4);
        av = new float[aq];
        for (int i3 = 0; i3 < 2; i3++) {
            int i4;
            if (i3 != 0) {
                i4 = aq;
            } else {
                i4 = ae;
            }
            i = i4 >> 1;
            int i5 = i4 >> 2;
            int i6 = i4 >> 3;
            float[] fArr = new float[i];
            for (i2 = 0; i2 < i5; i2++) {
                fArr[i2 * 2] = (float) Math.cos((((double) (i2 * 4)) * 3.141592653589793d) / ((double) i4));
                fArr[(i2 * 2) + 1] = -((float) Math.sin((((double) (i2 * 4)) * 3.141592653589793d) / ((double) i4)));
            }
            float[] fArr2 = new float[i];
            for (i2 = 0; i2 < i5; i2++) {
                fArr2[i2 * 2] = (float) Math.cos((((double) ((i2 * 2) + 1)) * 3.141592653589793d) / ((double) (i4 * 2)));
                fArr2[(i2 * 2) + 1] = (float) Math.sin((((double) ((i2 * 2) + 1)) * 3.141592653589793d) / ((double) (i4 * 2)));
            }
            float[] fArr3 = new float[i5];
            for (i2 = 0; i2 < i6; i2++) {
                fArr3[i2 * 2] = (float) Math.cos((((double) ((i2 * 4) + 2)) * 3.141592653589793d) / ((double) i4));
                fArr3[(i2 * 2) + 1] = -((float) Math.sin((((double) ((i2 * 4) + 2)) * 3.141592653589793d) / ((double) i4)));
            }
            int[] iArr = new int[i6];
            i = fw.ad(i6 - 1, (byte) 29);
            for (int i7 = 0; i7 < i6; i7++) {
                i4 = 0;
                i5 = i7;
                for (i2 = i; i2 > 0; i2--) {
                    i4 = (i4 << 1) | (i5 & 1);
                    i5 >>>= 1;
                }
                iArr[i7] = i4;
            }
            if (i3 != 0) {
                bw = fArr;
                bb = fArr2;
                bc = fArr3;
                bg = iArr;
            } else {
                ac = fArr;
                al = fArr2;
                ap = fArr3;
                bz = iArr;
            }
        }
        i2 = fp.aa(8) + 1;
        am = new fk[i2];
        for (i4 = 0; i4 < i2; i4++) {
            am[i4] = new fk();
        }
        i2 = fp.aa(6) + 1;
        for (i4 = 0; i4 < i2; i4++) {
            fp.aa(16);
        }
        i2 = fp.aa(6) + 1;
        at = new eo[i2];
        for (i4 = 0; i4 < i2; i4++) {
            at[i4] = new eo();
        }
        i2 = fp.aa(6) + 1;
        ab = new fe[i2];
        for (i4 = 0; i4 < i2; i4++) {
            ab[i4] = new fe();
        }
        i2 = fp.aa(6) + 1;
        aw = new fv[i2];
        for (i4 = 0; i4 < i2; i4++) {
            aw[i4] = new fv();
        }
        i = fp.aa(6) + 1;
        ai = new boolean[i];
        az = new int[i];
        for (i2 = 0; i2 < i; i2++) {
            boolean z;
            boolean[] zArr = ai;
            if (fp.an() != 0) {
                z = true;
            } else {
                z = false;
            }
            zArr[i2] = z;
            fp.aa(16);
            fp.aa(16);
            az[i2] = fp.aa(8);
        }
    }

    float[] as(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        fp.ad(this.af[i], 0);
        fp.an();
        int aa = fp.aa(fw.ad(az.length - 1, (byte) 14));
        boolean z2 = ai[aa];
        int i7 = z2 ? aq : ae;
        Object obj = null;
        Object obj2 = null;
        if (z2) {
            if (fp.an() != 0) {
                obj = 1;
            } else {
                obj = null;
            }
            obj2 = fp.an() != 0 ? 1 : null;
        }
        int i8 = i7 >> 1;
        if (z2 && r4 == null) {
            i2 = (i7 >> 2) - (ae >> 2);
            i3 = ae >> 1;
            i4 = (ae >> 2) + (i7 >> 2);
        } else {
            i2 = 0;
            i3 = i7 >> 1;
            i4 = i8;
        }
        if (z2 && r3 == null) {
            i8 = (i7 - (i7 >> 2)) - (ae >> 2);
            i5 = (ae >> 2) + (i7 - (i7 >> 2));
            i6 = ae >> 1;
        } else {
            i6 = i7 >> 1;
            i5 = i7;
        }
        fv fvVar = aw[az[aa]];
        if (at[fvVar.an[fvVar.ad]].ay()) {
            z = false;
        } else {
            z = true;
        }
        for (aa = 0; aa < fvVar.af; aa++) {
            ab[fvVar.aa[aa]].af(av, i7 >> 1, z);
        }
        if (!z) {
            at[fvVar.an[fvVar.ad]].as(av, i7 >> 1);
        }
        if (z) {
            for (i6 = i7 >> 1; i6 < i7; i6++) {
                av[i6] = 0.0f;
            }
        } else {
            float[] fArr;
            float[] fArr2;
            int[] iArr;
            int i9;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            int i10;
            float f6;
            float[] fArr3;
            int i11 = i7 >> 1;
            int i12 = i7 >> 2;
            int i13 = i7 >> 3;
            float[] fArr4 = av;
            for (aa = 0; aa < i11; aa++) {
                fArr4[aa] = fArr4[aa] * 0.5f;
            }
            for (aa = i11; aa < i7; aa++) {
                fArr4[aa] = -fArr4[(i7 - aa) - 1];
            }
            if (z2) {
                fArr = bw;
            } else {
                fArr = ac;
            }
            float[] fArr5 = z2 ? bb : al;
            if (z2) {
                fArr2 = bc;
            } else {
                fArr2 = ap;
            }
            if (z2) {
                iArr = bg;
            } else {
                iArr = bz;
            }
            for (i9 = 0; i9 < i12; i9++) {
                f = fArr4[i9 * 4] - fArr4[(i7 - (i9 * 4)) - 1];
                f2 = fArr4[(i9 * 4) + 2] - fArr4[(i7 - (i9 * 4)) - 3];
                f3 = fArr[i9 * 2];
                f4 = fArr[(i9 * 2) + 1];
                fArr4[(i7 - (i9 * 4)) - 1] = (f * f3) - (f2 * f4);
                fArr4[(i7 - (i9 * 4)) - 3] = (f * f4) + (f2 * f3);
            }
            for (i9 = 0; i9 < i13; i9++) {
                f = fArr4[(i11 + 3) + (i9 * 4)];
                f2 = fArr4[(i11 + 1) + (i9 * 4)];
                f3 = fArr4[(i9 * 4) + 3];
                f4 = fArr4[(i9 * 4) + 1];
                fArr4[(i11 + 3) + (i9 * 4)] = f + f3;
                fArr4[(i11 + 1) + (i9 * 4)] = f2 + f4;
                f5 = fArr[(i11 - 4) - (i9 * 4)];
                float f7 = fArr[(i11 - 3) - (i9 * 4)];
                fArr4[(i9 * 4) + 3] = ((f - f3) * f5) - ((f2 - f4) * f7);
                fArr4[(i9 * 4) + 1] = ((f - f3) * f7) + ((f2 - f4) * f5);
            }
            int ad = fw.ad(i7 - 1, (byte) 60);
            for (int i14 = 0; i14 < ad - 3; i14++) {
                int i15 = i7 >> (i14 + 2);
                int i16 = 8 << i14;
                for (i10 = 0; i10 < (2 << i14); i10++) {
                    int i17 = i7 - ((i15 * 2) * i10);
                    int i18 = i7 - (((i10 * 2) + 1) * i15);
                    for (i9 = 0; i9 < (i7 >> (i14 + 4)); i9++) {
                        int i19 = i9 * 4;
                        float f8 = fArr4[(i17 - 1) - i19];
                        float f9 = fArr4[(i17 - 3) - i19];
                        float f10 = fArr4[(i18 - 1) - i19];
                        float f11 = fArr4[(i18 - 3) - i19];
                        fArr4[(i17 - 1) - i19] = f8 + f10;
                        fArr4[(i17 - 3) - i19] = f9 + f11;
                        float f12 = fArr[i9 * i16];
                        float f13 = fArr[(i9 * i16) + 1];
                        fArr4[(i18 - 1) - i19] = ((f8 - f10) * f12) - ((f9 - f11) * f13);
                        fArr4[(i18 - 3) - i19] = ((f8 - f10) * f13) + ((f9 - f11) * f12);
                    }
                }
            }
            for (aa = 1; aa < i13 - 1; aa++) {
                i9 = iArr[aa];
                if (aa < i9) {
                    i10 = aa * 8;
                    i9 *= 8;
                    f2 = fArr4[i10 + 1];
                    fArr4[i10 + 1] = fArr4[i9 + 1];
                    fArr4[i9 + 1] = f2;
                    f2 = fArr4[i10 + 3];
                    fArr4[i10 + 3] = fArr4[i9 + 3];
                    fArr4[i9 + 3] = f2;
                    f2 = fArr4[i10 + 5];
                    fArr4[i10 + 5] = fArr4[i9 + 5];
                    fArr4[i9 + 5] = f2;
                    f2 = fArr4[i10 + 7];
                    fArr4[i10 + 7] = fArr4[i9 + 7];
                    fArr4[i9 + 7] = f2;
                }
            }
            for (aa = 0; aa < i11; aa++) {
                fArr4[aa] = fArr4[(aa * 2) + 1];
            }
            for (aa = 0; aa < i13; aa++) {
                fArr4[(i7 - 1) - (aa * 2)] = fArr4[aa * 4];
                fArr4[(i7 - 2) - (aa * 2)] = fArr4[(aa * 4) + 1];
                fArr4[((i7 - i12) - 1) - (aa * 2)] = fArr4[(aa * 4) + 2];
                fArr4[((i7 - i12) - 2) - (aa * 2)] = fArr4[(aa * 4) + 3];
            }
            for (aa = 0; aa < i13; aa++) {
                f6 = fArr2[aa * 2];
                float f14 = fArr2[(aa * 2) + 1];
                f = fArr4[(aa * 2) + i11];
                f2 = fArr4[((aa * 2) + i11) + 1];
                f3 = fArr4[(i7 - 2) - (aa * 2)];
                f4 = fArr4[(i7 - 1) - (aa * 2)];
                f5 = ((f - f3) * f14) + ((f2 + f4) * f6);
                fArr4[(aa * 2) + i11] = ((f + f3) + f5) * 0.5f;
                fArr4[(i7 - 2) - (aa * 2)] = ((f + f3) - f5) * 0.5f;
                f6 = (f14 * (f2 + f4)) - (f6 * (f - f3));
                fArr4[((aa * 2) + i11) + 1] = ((f2 - f4) + f6) * 0.5f;
                fArr4[(i7 - 1) - (aa * 2)] = (f6 + ((-f2) + f4)) * 0.5f;
            }
            for (aa = 0; aa < i12; aa++) {
                fArr4[aa] = (fArr4[(aa * 2) + i11] * fArr5[aa * 2]) + (fArr4[((aa * 2) + 1) + i11] * fArr5[(aa * 2) + 1]);
                fArr4[(i11 - 1) - aa] = (fArr4[(aa * 2) + i11] * fArr5[(aa * 2) + 1]) - (fArr4[((aa * 2) + 1) + i11] * fArr5[aa * 2]);
            }
            for (aa = 0; aa < i12; aa++) {
                fArr4[(i7 - i12) + aa] = -fArr4[aa];
            }
            for (aa = 0; aa < i12; aa++) {
                fArr4[aa] = fArr4[i12 + aa];
            }
            for (aa = 0; aa < i12; aa++) {
                fArr4[i12 + aa] = -fArr4[(i12 - aa) - 1];
            }
            for (aa = 0; aa < i12; aa++) {
                fArr4[i11 + aa] = fArr4[(i7 - aa) - 1];
            }
            for (aa = i2; aa < i4; aa++) {
                f6 = (float) Math.sin((((((double) (aa - i2)) + 0.5d) / ((double) i3)) * 0.5d) * 3.141592653589793d);
                fArr3 = av;
                fArr3[aa] = ((float) Math.sin((1.5707963267948966d * ((double) f6)) * ((double) f6))) * fArr3[aa];
            }
            for (aa = i8; aa < i5; aa++) {
                f6 = (float) Math.sin(((((((double) (aa - i8)) + 0.5d) / ((double) i6)) * 0.5d) * 3.141592653589793d) + 1.5707963267948966d);
                fArr3 = av;
                fArr3[aa] = ((float) Math.sin((1.5707963267948966d * ((double) f6)) * ((double) f6))) * fArr3[aa];
            }
        }
        float[] fArr6 = null;
        if (this.ao > 0) {
            fArr6 = new float[((this.ao + i7) >> 2)];
            if (!this.au) {
                for (i8 = 0; i8 < this.ax; i8++) {
                    fArr6[i8] = this.ak[(this.ao >> 1) + i8] + fArr6[i8];
                }
            }
            if (!z) {
                while (i2 < (i7 >> 1)) {
                    i8 = (fArr6.length - (i7 >> 1)) + i2;
                    fArr6[i8] = fArr6[i8] + av[i2];
                    i2++;
                }
            }
        }
        float[] fArr7 = this.ak;
        this.ak = av;
        av = fArr7;
        this.ao = i7;
        this.ax = i5 - (i7 >> 1);
        this.au = z;
        return fArr6;
    }

    float[] bb(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        float[] fArr;
        fp.ad(this.af[i], 0);
        fp.an();
        int aa = fp.aa(fw.ad(az.length - 1, (byte) 48));
        boolean z2 = ai[aa];
        int i7 = z2 ? aq : ae;
        Object obj = null;
        Object obj2 = null;
        if (z2) {
            if (fp.an() != 0) {
                obj = 1;
            } else {
                obj = null;
            }
            if (fp.an() != 0) {
                obj2 = 1;
            } else {
                obj2 = null;
            }
        }
        int i8 = i7 >> 1;
        if (z2 && r4 == null) {
            i2 = (i7 >> 2) - (ae >> 2);
            i3 = ae >> 1;
            i4 = (ae >> 2) + (i7 >> 2);
        } else {
            i2 = 0;
            i3 = i7 >> 1;
            i4 = i8;
        }
        if (z2 && r3 == null) {
            i8 = (i7 - (i7 >> 2)) - (ae >> 2);
            i5 = (ae >> 2) + (i7 - (i7 >> 2));
            i6 = ae >> 1;
        } else {
            i6 = i7 >> 1;
            i5 = i7;
        }
        fv fvVar = aw[az[aa]];
        if (at[fvVar.an[fvVar.ad]].ay()) {
            z = false;
        } else {
            z = true;
        }
        for (aa = 0; aa < fvVar.af; aa++) {
            ab[fvVar.aa[aa]].af(av, i7 >> 1, z);
        }
        if (!z) {
            at[fvVar.an[fvVar.ad]].as(av, i7 >> 1);
        }
        if (z) {
            for (i6 = i7 >> 1; i6 < i7; i6++) {
                av[i6] = 0.0f;
            }
        } else {
            float[] fArr2;
            float[] fArr3;
            int[] iArr;
            int i9;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            int i10;
            int i11;
            float f6;
            int i12;
            float sin;
            float[] fArr4;
            int i13 = i7 >> 1;
            int i14 = i7 >> 2;
            int i15 = i7 >> 3;
            float[] fArr5 = av;
            for (aa = 0; aa < i13; aa++) {
                fArr5[aa] = fArr5[aa] * 0.5f;
            }
            for (aa = i13; aa < i7; aa++) {
                fArr5[aa] = -fArr5[(i7 - aa) - 1];
            }
            if (z2) {
                fArr2 = bw;
            } else {
                fArr2 = ac;
            }
            float[] fArr6 = z2 ? bb : al;
            if (z2) {
                fArr3 = bc;
            } else {
                fArr3 = ap;
            }
            if (z2) {
                iArr = bg;
            } else {
                iArr = bz;
            }
            for (i9 = 0; i9 < i14; i9++) {
                f = fArr5[i9 * 4] - fArr5[(i7 - (i9 * 4)) - 1];
                f2 = fArr5[(i9 * 4) + 2] - fArr5[(i7 - (i9 * 4)) - 3];
                f3 = fArr2[i9 * 2];
                f4 = fArr2[(i9 * 2) + 1];
                fArr5[(i7 - (i9 * 4)) - 1] = (f * f3) - (f2 * f4);
                fArr5[(i7 - (i9 * 4)) - 3] = (f * f4) + (f2 * f3);
            }
            for (i9 = 0; i9 < i15; i9++) {
                f = fArr5[(i13 + 3) + (i9 * 4)];
                f2 = fArr5[(i13 + 1) + (i9 * 4)];
                f3 = fArr5[(i9 * 4) + 3];
                f4 = fArr5[(i9 * 4) + 1];
                fArr5[(i13 + 3) + (i9 * 4)] = f + f3;
                fArr5[(i13 + 1) + (i9 * 4)] = f2 + f4;
                f5 = fArr2[(i13 - 4) - (i9 * 4)];
                float f7 = fArr2[(i13 - 3) - (i9 * 4)];
                fArr5[(i9 * 4) + 3] = ((f - f3) * f5) - ((f2 - f4) * f7);
                fArr5[(i9 * 4) + 1] = ((f - f3) * f7) + ((f2 - f4) * f5);
            }
            int ad = fw.ad(i7 - 1, (byte) 42);
            for (i10 = 0; i10 < ad - 3; i10++) {
                int i16 = i7 >> (i10 + 2);
                int i17 = 8 << i10;
                for (i11 = 0; i11 < (2 << i10); i11++) {
                    int i18 = i7 - ((i16 * 2) * i11);
                    int i19 = i7 - (((i11 * 2) + 1) * i16);
                    for (i9 = 0; i9 < (i7 >> (i10 + 4)); i9++) {
                        int i20 = i9 * 4;
                        float f8 = fArr5[(i18 - 1) - i20];
                        float f9 = fArr5[(i18 - 3) - i20];
                        float f10 = fArr5[(i19 - 1) - i20];
                        float f11 = fArr5[(i19 - 3) - i20];
                        fArr5[(i18 - 1) - i20] = f8 + f10;
                        fArr5[(i18 - 3) - i20] = f9 + f11;
                        float f12 = fArr2[i9 * i17];
                        float f13 = fArr2[(i9 * i17) + 1];
                        fArr5[(i19 - 1) - i20] = ((f8 - f10) * f12) - ((f9 - f11) * f13);
                        fArr5[(i19 - 3) - i20] = ((f8 - f10) * f13) + ((f9 - f11) * f12);
                    }
                }
            }
            for (i9 = 1; i9 < i15 - 1; i9++) {
                i11 = iArr[i9];
                if (i9 < i11) {
                    i10 = i9 * 8;
                    i11 *= 8;
                    f6 = fArr5[i10 + 1];
                    fArr5[i10 + 1] = fArr5[i11 + 1];
                    fArr5[i11 + 1] = f6;
                    f6 = fArr5[i10 + 3];
                    fArr5[i10 + 3] = fArr5[i11 + 3];
                    fArr5[i11 + 3] = f6;
                    f6 = fArr5[i10 + 5];
                    fArr5[i10 + 5] = fArr5[i11 + 5];
                    fArr5[i11 + 5] = f6;
                    f6 = fArr5[i10 + 7];
                    fArr5[i10 + 7] = fArr5[i11 + 7];
                    fArr5[i11 + 7] = f6;
                }
            }
            for (i12 = 0; i12 < i13; i12++) {
                fArr5[i12] = fArr5[(i12 * 2) + 1];
            }
            for (i12 = 0; i12 < i15; i12++) {
                fArr5[(i7 - 1) - (i12 * 2)] = fArr5[i12 * 4];
                fArr5[(i7 - 2) - (i12 * 2)] = fArr5[(i12 * 4) + 1];
                fArr5[((i7 - i14) - 1) - (i12 * 2)] = fArr5[(i12 * 4) + 2];
                fArr5[((i7 - i14) - 2) - (i12 * 2)] = fArr5[(i12 * 4) + 3];
            }
            for (i12 = 0; i12 < i15; i12++) {
                float f14 = fArr3[i12 * 2];
                f = fArr3[(i12 * 2) + 1];
                f2 = fArr5[(i12 * 2) + i13];
                f6 = fArr5[((i12 * 2) + i13) + 1];
                f3 = fArr5[(i7 - 2) - (i12 * 2)];
                f4 = fArr5[(i7 - 1) - (i12 * 2)];
                f5 = ((f2 - f3) * f) + ((f6 + f4) * f14);
                fArr5[(i12 * 2) + i13] = ((f2 + f3) + f5) * 0.5f;
                fArr5[(i7 - 2) - (i12 * 2)] = ((f2 + f3) - f5) * 0.5f;
                f14 = (f * (f6 + f4)) - (f14 * (f2 - f3));
                fArr5[((i12 * 2) + i13) + 1] = ((f6 - f4) + f14) * 0.5f;
                fArr5[(i7 - 1) - (i12 * 2)] = (f14 + ((-f6) + f4)) * 0.5f;
            }
            for (int i21 = 0; i21 < i14; i21++) {
                fArr5[i21] = (fArr5[(i21 * 2) + i13] * fArr6[i21 * 2]) + (fArr5[((i21 * 2) + 1) + i13] * fArr6[(i21 * 2) + 1]);
                fArr5[(i13 - 1) - i21] = (fArr5[(i21 * 2) + i13] * fArr6[(i21 * 2) + 1]) - (fArr5[((i21 * 2) + 1) + i13] * fArr6[i21 * 2]);
            }
            for (aa = 0; aa < i14; aa++) {
                fArr5[(i7 - i14) + aa] = -fArr5[aa];
            }
            for (aa = 0; aa < i14; aa++) {
                fArr5[aa] = fArr5[i14 + aa];
            }
            for (aa = 0; aa < i14; aa++) {
                fArr5[i14 + aa] = -fArr5[(i14 - aa) - 1];
            }
            for (aa = 0; aa < i14; aa++) {
                fArr5[i13 + aa] = fArr5[(i7 - aa) - 1];
            }
            for (aa = i2; aa < i4; aa++) {
                sin = (float) Math.sin((((((double) (aa - i2)) + 0.5d) / ((double) i3)) * 0.5d) * 3.141592653589793d);
                fArr4 = av;
                fArr4[aa] = ((float) Math.sin((1.5707963267948966d * ((double) sin)) * ((double) sin))) * fArr4[aa];
            }
            for (aa = i8; aa < i5; aa++) {
                sin = (float) Math.sin(((((((double) (aa - i8)) + 0.5d) / ((double) i6)) * 0.5d) * 3.141592653589793d) + 1.5707963267948966d);
                fArr4 = av;
                fArr4[aa] = ((float) Math.sin((1.5707963267948966d * ((double) sin)) * ((double) sin))) * fArr4[aa];
            }
        }
        float[] fArr7 = null;
        if (this.ao > 0) {
            fArr = new float[((this.ao + i7) >> 2)];
            if (!this.au) {
                for (i6 = 0; i6 < this.ax; i6++) {
                    fArr[i6] = this.ak[(this.ao >> 1) + i6] + fArr[i6];
                }
            }
            if (!z) {
                for (i6 = i2; i6 < (i7 >> 1); i6++) {
                    aa = (fArr.length - (i7 >> 1)) + i6;
                    fArr[aa] = fArr[aa] + av[i6];
                }
            }
            fArr7 = fArr;
        }
        fArr = this.ak;
        this.ak = av;
        av = fArr;
        this.ao = i7;
        this.ax = i5 - (i7 >> 1);
        this.au = z;
        return fArr7;
    }

    float[] bc(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        int i8;
        fp.ad(this.af[i], 0);
        fp.an();
        int aa = fp.aa(fw.ad(az.length - 1, (byte) 34));
        boolean z2 = ai[aa];
        if (z2) {
            i2 = aq;
        } else {
            i2 = ae;
        }
        Object obj = null;
        Object obj2;
        if (z2) {
            Object obj3;
            if (fp.an() != 0) {
                obj = 1;
            } else {
                obj = null;
            }
            if (fp.an() != 0) {
                obj3 = 1;
            } else {
                obj3 = null;
            }
            obj2 = obj3;
        } else {
            obj2 = null;
        }
        int i9 = i2 >> 1;
        if (z2 && r3 == null) {
            i3 = (i2 >> 2) - (ae >> 2);
            i4 = ae >> 1;
            i5 = (ae >> 2) + (i2 >> 2);
        } else {
            i3 = 0;
            i4 = i2 >> 1;
            i5 = i9;
        }
        if (z2 && r6 == null) {
            i6 = (i2 - (i2 >> 2)) - (ae >> 2);
            i9 = (ae >> 2) + (i2 - (i2 >> 2));
            i7 = ae >> 1;
        } else {
            i7 = i2 >> 1;
            i6 = i9;
            i9 = i2;
        }
        fv fvVar = aw[az[aa]];
        if (at[fvVar.an[fvVar.ad]].ay()) {
            z = false;
        } else {
            z = true;
        }
        for (i8 = 0; i8 < fvVar.af; i8++) {
            ab[fvVar.aa[i8]].af(av, i2 >> 1, z);
        }
        if (!z) {
            at[fvVar.an[fvVar.ad]].as(av, i2 >> 1);
        }
        if (z) {
            for (i7 = i2 >> 1; i7 < i2; i7++) {
                av[i7] = 0.0f;
            }
        } else {
            float[] fArr;
            float[] fArr2;
            float[] fArr3;
            int[] iArr;
            int i10;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            int i11;
            int i12;
            float f6;
            float sin;
            float[] fArr4;
            int i13 = i2 >> 1;
            int i14 = i2 >> 2;
            int i15 = i2 >> 3;
            float[] fArr5 = av;
            for (i8 = 0; i8 < i13; i8++) {
                fArr5[i8] = fArr5[i8] * 0.5f;
            }
            for (i8 = i13; i8 < i2; i8++) {
                fArr5[i8] = -fArr5[(i2 - i8) - 1];
            }
            if (z2) {
                fArr = bw;
            } else {
                fArr = ac;
            }
            if (z2) {
                fArr2 = bb;
            } else {
                fArr2 = al;
            }
            if (z2) {
                fArr3 = bc;
            } else {
                fArr3 = ap;
            }
            if (z2) {
                iArr = bg;
            } else {
                iArr = bz;
            }
            for (i10 = 0; i10 < i14; i10++) {
                f = fArr5[i10 * 4] - fArr5[(i2 - (i10 * 4)) - 1];
                f2 = fArr5[(i10 * 4) + 2] - fArr5[(i2 - (i10 * 4)) - 3];
                f3 = fArr[i10 * 2];
                f4 = fArr[(i10 * 2) + 1];
                fArr5[(i2 - (i10 * 4)) - 1] = (f * f3) - (f2 * f4);
                fArr5[(i2 - (i10 * 4)) - 3] = (f * f4) + (f2 * f3);
            }
            for (i10 = 0; i10 < i15; i10++) {
                f = fArr5[(i13 + 3) + (i10 * 4)];
                f2 = fArr5[(i13 + 1) + (i10 * 4)];
                f3 = fArr5[(i10 * 4) + 3];
                f4 = fArr5[(i10 * 4) + 1];
                fArr5[(i13 + 3) + (i10 * 4)] = f + f3;
                fArr5[(i13 + 1) + (i10 * 4)] = f2 + f4;
                f5 = fArr[(i13 - 4) - (i10 * 4)];
                float f7 = fArr[(i13 - 3) - (i10 * 4)];
                fArr5[(i10 * 4) + 3] = ((f - f3) * f5) - ((f2 - f4) * f7);
                fArr5[(i10 * 4) + 1] = ((f - f3) * f7) + ((f2 - f4) * f5);
            }
            int ad = fw.ad(i2 - 1, (byte) 50);
            for (i11 = 0; i11 < ad - 3; i11++) {
                int i16 = i2 >> (i11 + 2);
                int i17 = 8 << i11;
                for (i12 = 0; i12 < (2 << i11); i12++) {
                    int i18 = i2 - ((i16 * 2) * i12);
                    int i19 = i2 - (((i12 * 2) + 1) * i16);
                    for (i10 = 0; i10 < (i2 >> (i11 + 4)); i10++) {
                        int i20 = i10 * 4;
                        float f8 = fArr5[(i18 - 1) - i20];
                        float f9 = fArr5[(i18 - 3) - i20];
                        float f10 = fArr5[(i19 - 1) - i20];
                        float f11 = fArr5[(i19 - 3) - i20];
                        fArr5[(i18 - 1) - i20] = f8 + f10;
                        fArr5[(i18 - 3) - i20] = f9 + f11;
                        float f12 = fArr[i10 * i17];
                        float f13 = fArr[(i10 * i17) + 1];
                        fArr5[(i19 - 1) - i20] = ((f8 - f10) * f12) - ((f9 - f11) * f13);
                        fArr5[(i19 - 3) - i20] = ((f8 - f10) * f13) + ((f9 - f11) * f12);
                    }
                }
            }
            for (i10 = 1; i10 < i15 - 1; i10++) {
                i12 = iArr[i10];
                if (i10 < i12) {
                    i11 = i10 * 8;
                    i12 *= 8;
                    f6 = fArr5[i11 + 1];
                    fArr5[i11 + 1] = fArr5[i12 + 1];
                    fArr5[i12 + 1] = f6;
                    f6 = fArr5[i11 + 3];
                    fArr5[i11 + 3] = fArr5[i12 + 3];
                    fArr5[i12 + 3] = f6;
                    f6 = fArr5[i11 + 5];
                    fArr5[i11 + 5] = fArr5[i12 + 5];
                    fArr5[i12 + 5] = f6;
                    f6 = fArr5[i11 + 7];
                    fArr5[i11 + 7] = fArr5[i12 + 7];
                    fArr5[i12 + 7] = f6;
                }
            }
            for (aa = 0; aa < i13; aa++) {
                fArr5[aa] = fArr5[(aa * 2) + 1];
            }
            for (aa = 0; aa < i15; aa++) {
                fArr5[(i2 - 1) - (aa * 2)] = fArr5[aa * 4];
                fArr5[(i2 - 2) - (aa * 2)] = fArr5[(aa * 4) + 1];
                fArr5[((i2 - i14) - 1) - (aa * 2)] = fArr5[(aa * 4) + 2];
                fArr5[((i2 - i14) - 2) - (aa * 2)] = fArr5[(aa * 4) + 3];
            }
            for (aa = 0; aa < i15; aa++) {
                float f14 = fArr3[aa * 2];
                f = fArr3[(aa * 2) + 1];
                f2 = fArr5[(aa * 2) + i13];
                f6 = fArr5[((aa * 2) + i13) + 1];
                f3 = fArr5[(i2 - 2) - (aa * 2)];
                f4 = fArr5[(i2 - 1) - (aa * 2)];
                f5 = ((f2 - f3) * f) + ((f6 + f4) * f14);
                fArr5[(aa * 2) + i13] = ((f2 + f3) + f5) * 0.5f;
                fArr5[(i2 - 2) - (aa * 2)] = ((f2 + f3) - f5) * 0.5f;
                f14 = (f * (f6 + f4)) - (f14 * (f2 - f3));
                fArr5[((aa * 2) + i13) + 1] = ((f6 - f4) + f14) * 0.5f;
                fArr5[(i2 - 1) - (aa * 2)] = (f14 + ((-f6) + f4)) * 0.5f;
            }
            for (aa = 0; aa < i14; aa++) {
                fArr5[aa] = (fArr5[(aa * 2) + i13] * fArr2[aa * 2]) + (fArr5[((aa * 2) + 1) + i13] * fArr2[(aa * 2) + 1]);
                fArr5[(i13 - 1) - aa] = (fArr5[(aa * 2) + i13] * fArr2[(aa * 2) + 1]) - (fArr5[((aa * 2) + 1) + i13] * fArr2[aa * 2]);
            }
            for (i8 = 0; i8 < i14; i8++) {
                fArr5[(i2 - i14) + i8] = -fArr5[i8];
            }
            for (i8 = 0; i8 < i14; i8++) {
                fArr5[i8] = fArr5[i14 + i8];
            }
            for (i8 = 0; i8 < i14; i8++) {
                fArr5[i14 + i8] = -fArr5[(i14 - i8) - 1];
            }
            for (i8 = 0; i8 < i14; i8++) {
                fArr5[i13 + i8] = fArr5[(i2 - i8) - 1];
            }
            for (i8 = i3; i8 < i5; i8++) {
                sin = (float) Math.sin((((((double) (i8 - i3)) + 0.5d) / ((double) i4)) * 0.5d) * 3.141592653589793d);
                fArr4 = av;
                fArr4[i8] = ((float) Math.sin((1.5707963267948966d * ((double) sin)) * ((double) sin))) * fArr4[i8];
            }
            for (i8 = i6; i8 < i9; i8++) {
                sin = (float) Math.sin(((((((double) (i8 - i6)) + 0.5d) / ((double) i7)) * 0.5d) * 3.141592653589793d) + 1.5707963267948966d);
                fArr4 = av;
                fArr4[i8] = ((float) Math.sin((1.5707963267948966d * ((double) sin)) * ((double) sin))) * fArr4[i8];
            }
        }
        float[] fArr6 = null;
        if (this.ao > 0) {
            fArr6 = new float[((this.ao + i2) >> 2)];
            if (!this.au) {
                for (i6 = 0; i6 < this.ax; i6++) {
                    i8 = (this.ao >> 1) + i6;
                    fArr6[i6] = this.ak[i8] + fArr6[i6];
                }
            }
            if (!z) {
                while (i3 < (i2 >> 1)) {
                    i6 = (fArr6.length - (i2 >> 1)) + i3;
                    fArr6[i6] = fArr6[i6] + av[i3];
                    i3++;
                }
            }
        }
        float[] fArr7 = this.ak;
        this.ak = av;
        av = fArr7;
        this.ao = i2;
        this.ax = i9 - (i2 >> 1);
        this.au = z;
        return fArr6;
    }

    float[] bz(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float[] fArr;
        fp.ad(this.af[i], 0);
        fp.an();
        int aa = fp.aa(fw.ad(az.length - 1, (byte) 102));
        boolean z = ai[aa];
        int i7 = z ? aq : ae;
        Object obj;
        Object obj2;
        if (z) {
            Object obj3;
            if (fp.an() != 0) {
                obj3 = 1;
            } else {
                obj3 = null;
            }
            if (fp.an() != 0) {
                obj = 1;
            } else {
                obj = null;
            }
            obj2 = obj;
            obj = obj3;
        } else {
            obj2 = null;
            obj = null;
        }
        int i8 = i7 >> 1;
        if (z && r3 == null) {
            i2 = (i7 >> 2) - (ae >> 2);
            i3 = ae >> 1;
            i4 = (ae >> 2) + (i7 >> 2);
        } else {
            i2 = 0;
            i3 = i7 >> 1;
            i4 = i8;
        }
        if (z && r6 == null) {
            i5 = (i7 - (i7 >> 2)) - (ae >> 2);
            i8 = (ae >> 2) + (i7 - (i7 >> 2));
            i6 = ae >> 1;
        } else {
            i6 = i7 >> 1;
            i5 = i8;
            i8 = i7;
        }
        fv fvVar = aw[az[aa]];
        boolean z2 = !at[fvVar.an[fvVar.ad]].ay();
        for (aa = 0; aa < fvVar.af; aa++) {
            ab[fvVar.aa[aa]].af(av, i7 >> 1, z2);
        }
        if (!z2) {
            at[fvVar.an[fvVar.ad]].as(av, i7 >> 1);
        }
        if (z2) {
            for (i6 = i7 >> 1; i6 < i7; i6++) {
                av[i6] = 0.0f;
            }
        } else {
            float[] fArr2;
            float[] fArr3;
            float[] fArr4;
            int[] iArr;
            int i9;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            int i10;
            float sin;
            int i11 = i7 >> 1;
            int i12 = i7 >> 2;
            int i13 = i7 >> 3;
            float[] fArr5 = av;
            for (aa = 0; aa < i11; aa++) {
                fArr5[aa] = fArr5[aa] * 0.5f;
            }
            for (aa = i11; aa < i7; aa++) {
                fArr5[aa] = -fArr5[(i7 - aa) - 1];
            }
            if (z) {
                fArr2 = bw;
            } else {
                fArr2 = ac;
            }
            if (z) {
                fArr3 = bb;
            } else {
                fArr3 = al;
            }
            if (z) {
                fArr4 = bc;
            } else {
                fArr4 = ap;
            }
            if (z) {
                iArr = bg;
            } else {
                iArr = bz;
            }
            for (i9 = 0; i9 < i12; i9++) {
                f = fArr5[i9 * 4] - fArr5[(i7 - (i9 * 4)) - 1];
                f2 = fArr5[(i9 * 4) + 2] - fArr5[(i7 - (i9 * 4)) - 3];
                f3 = fArr2[i9 * 2];
                f4 = fArr2[(i9 * 2) + 1];
                fArr5[(i7 - (i9 * 4)) - 1] = (f * f3) - (f2 * f4);
                fArr5[(i7 - (i9 * 4)) - 3] = (f * f4) + (f2 * f3);
            }
            for (i9 = 0; i9 < i13; i9++) {
                f = fArr5[(i11 + 3) + (i9 * 4)];
                f2 = fArr5[(i11 + 1) + (i9 * 4)];
                f3 = fArr5[(i9 * 4) + 3];
                f4 = fArr5[(i9 * 4) + 1];
                fArr5[(i11 + 3) + (i9 * 4)] = f + f3;
                fArr5[(i11 + 1) + (i9 * 4)] = f2 + f4;
                f5 = fArr2[(i11 - 4) - (i9 * 4)];
                float f6 = fArr2[(i11 - 3) - (i9 * 4)];
                fArr5[(i9 * 4) + 3] = ((f - f3) * f5) - ((f2 - f4) * f6);
                fArr5[(i9 * 4) + 1] = ((f - f3) * f6) + ((f2 - f4) * f5);
            }
            int ad = fw.ad(i7 - 1, (byte) 93);
            for (int i14 = 0; i14 < ad - 3; i14++) {
                int i15 = i7 >> (i14 + 2);
                int i16 = 8 << i14;
                for (i10 = 0; i10 < (2 << i14); i10++) {
                    int i17 = i7 - ((i15 * 2) * i10);
                    int i18 = i7 - (((i10 * 2) + 1) * i15);
                    for (i9 = 0; i9 < (i7 >> (i14 + 4)); i9++) {
                        int i19 = i9 * 4;
                        float f7 = fArr5[(i17 - 1) - i19];
                        float f8 = fArr5[(i17 - 3) - i19];
                        float f9 = fArr5[(i18 - 1) - i19];
                        float f10 = fArr5[(i18 - 3) - i19];
                        fArr5[(i17 - 1) - i19] = f7 + f9;
                        fArr5[(i17 - 3) - i19] = f8 + f10;
                        float f11 = fArr2[i9 * i16];
                        float f12 = fArr2[(i9 * i16) + 1];
                        fArr5[(i18 - 1) - i19] = ((f7 - f9) * f11) - ((f8 - f10) * f12);
                        fArr5[(i18 - 3) - i19] = ((f7 - f9) * f12) + ((f8 - f10) * f11);
                    }
                }
            }
            for (aa = 1; aa < i13 - 1; aa++) {
                i9 = iArr[aa];
                if (aa < i9) {
                    i10 = aa * 8;
                    i9 *= 8;
                    f2 = fArr5[i10 + 1];
                    fArr5[i10 + 1] = fArr5[i9 + 1];
                    fArr5[i9 + 1] = f2;
                    f2 = fArr5[i10 + 3];
                    fArr5[i10 + 3] = fArr5[i9 + 3];
                    fArr5[i9 + 3] = f2;
                    f2 = fArr5[i10 + 5];
                    fArr5[i10 + 5] = fArr5[i9 + 5];
                    fArr5[i9 + 5] = f2;
                    f2 = fArr5[i10 + 7];
                    fArr5[i10 + 7] = fArr5[i9 + 7];
                    fArr5[i9 + 7] = f2;
                }
            }
            for (aa = 0; aa < i11; aa++) {
                fArr5[aa] = fArr5[(aa * 2) + 1];
            }
            for (aa = 0; aa < i13; aa++) {
                fArr5[(i7 - 1) - (aa * 2)] = fArr5[aa * 4];
                fArr5[(i7 - 2) - (aa * 2)] = fArr5[(aa * 4) + 1];
                fArr5[((i7 - i12) - 1) - (aa * 2)] = fArr5[(aa * 4) + 2];
                fArr5[((i7 - i12) - 2) - (aa * 2)] = fArr5[(aa * 4) + 3];
            }
            for (aa = 0; aa < i13; aa++) {
                float f13 = fArr4[aa * 2];
                float f14 = fArr4[(aa * 2) + 1];
                f = fArr5[(aa * 2) + i11];
                f2 = fArr5[((aa * 2) + i11) + 1];
                f3 = fArr5[(i7 - 2) - (aa * 2)];
                f4 = fArr5[(i7 - 1) - (aa * 2)];
                f5 = ((f - f3) * f14) + ((f2 + f4) * f13);
                fArr5[(aa * 2) + i11] = ((f + f3) + f5) * 0.5f;
                fArr5[(i7 - 2) - (aa * 2)] = ((f + f3) - f5) * 0.5f;
                f13 = (f14 * (f2 + f4)) - (f13 * (f - f3));
                fArr5[((aa * 2) + i11) + 1] = ((f2 - f4) + f13) * 0.5f;
                fArr5[(i7 - 1) - (aa * 2)] = (f13 + ((-f2) + f4)) * 0.5f;
            }
            for (aa = 0; aa < i12; aa++) {
                fArr5[aa] = (fArr5[(aa * 2) + i11] * fArr3[aa * 2]) + (fArr5[((aa * 2) + 1) + i11] * fArr3[(aa * 2) + 1]);
                fArr5[(i11 - 1) - aa] = (fArr5[(aa * 2) + i11] * fArr3[(aa * 2) + 1]) - (fArr5[((aa * 2) + 1) + i11] * fArr3[aa * 2]);
            }
            for (aa = 0; aa < i12; aa++) {
                fArr5[(i7 - i12) + aa] = -fArr5[aa];
            }
            for (aa = 0; aa < i12; aa++) {
                fArr5[aa] = fArr5[i12 + aa];
            }
            for (aa = 0; aa < i12; aa++) {
                fArr5[i12 + aa] = -fArr5[(i12 - aa) - 1];
            }
            for (aa = 0; aa < i12; aa++) {
                fArr5[i11 + aa] = fArr5[(i7 - aa) - 1];
            }
            for (aa = i2; aa < i4; aa++) {
                sin = (float) Math.sin((((((double) (aa - i2)) + 0.5d) / ((double) i3)) * 0.5d) * 3.141592653589793d);
                fArr4 = av;
                fArr4[aa] = ((float) Math.sin((1.5707963267948966d * ((double) sin)) * ((double) sin))) * fArr4[aa];
            }
            for (aa = i5; aa < i8; aa++) {
                sin = (float) Math.sin(((((((double) (aa - i5)) + 0.5d) / ((double) i6)) * 0.5d) * 3.141592653589793d) + 1.5707963267948966d);
                fArr4 = av;
                fArr4[aa] = ((float) Math.sin((1.5707963267948966d * ((double) sin)) * ((double) sin))) * fArr4[aa];
            }
        }
        float[] fArr6 = null;
        if (this.ao > 0) {
            fArr = new float[((this.ao + i7) >> 2)];
            if (!this.au) {
                for (i6 = 0; i6 < this.ax; i6++) {
                    fArr[i6] = this.ak[(this.ao >> 1) + i6] + fArr[i6];
                }
            }
            if (!z2) {
                for (i6 = i2; i6 < (i7 >> 1); i6++) {
                    aa = (fArr.length - (i7 >> 1)) + i6;
                    fArr[aa] = fArr[aa] + av[i6];
                }
            }
            fArr6 = fArr;
        }
        fArr = this.ak;
        this.ak = av;
        av = fArr;
        this.ao = i7;
        this.ax = i8 - (i7 >> 1);
        this.au = z2;
        return fArr6;
    }

    static boolean ar(kf kfVar) {
        if (!ah) {
            byte[] an = kfVar.an(0, 0, -415514262);
            if (an == null) {
                return false;
            }
            fp.ay(an);
            ah = true;
        }
        return true;
    }

    static boolean bf(kf kfVar) {
        if (!ah) {
            byte[] an = kfVar.an(0, 0, -95523870);
            if (an == null) {
                return false;
            }
            fp.ay(an);
            ah = true;
        }
        return true;
    }

    static boolean bg(kf kfVar) {
        if (!ah) {
            byte[] an = kfVar.an(0, 0, -279220361);
            if (an == null) {
                return false;
            }
            fp.ay(an);
            ah = true;
        }
        return true;
    }

    static boolean bh(kf kfVar) {
        if (!ah) {
            byte[] an = kfVar.an(0, 0, -873125377);
            if (an == null) {
                return false;
            }
            fp.ay(an);
            ah = true;
        }
        return true;
    }

    static boolean bv(kf kfVar) {
        if (!ah) {
            byte[] an = kfVar.an(0, 0, -1400487028);
            if (an == null) {
                return false;
            }
            fp.ay(an);
            ah = true;
        }
        return true;
    }

    static fp aj(kf kfVar, int i, int i2) {
        if (fp.ar(kfVar)) {
            byte[] an = kfVar.an(i, i2, -2010441729);
            if (an == null) {
                return null;
            }
            return new fp(an);
        }
        kfVar.ag(i, i2, 1805557067);
        return null;
    }

    static fp bp(kf kfVar, int i, int i2) {
        if (fp.ar(kfVar)) {
            byte[] an = kfVar.an(i, i2, -1819690524);
            if (an != null) {
                return new fp(an);
            }
            return null;
        }
        kfVar.ag(i, i2, 1613209820);
        return null;
    }

    static fp bx(kf kfVar, int i, int i2) {
        if (fp.ar(kfVar)) {
            byte[] an = kfVar.an(i, i2, -720550114);
            if (an != null) {
                return new fp(an);
            }
            return null;
        }
        kfVar.ag(i, i2, 1973936742);
        return null;
    }

    fp(byte[] bArr) {
        ag(bArr);
    }

    fc ae(int[] iArr) {
        if (iArr != null && iArr[0] <= 0) {
            return null;
        }
        if (this.bh == null) {
            this.ao = 0;
            this.ak = new float[aq];
            this.bh = new byte[this.an];
            this.bf = 0;
            this.bv = 0;
        }
        while (this.bv < this.af.length) {
            if (iArr != null && iArr[0] <= 0) {
                return null;
            }
            float[] as = as(this.bv);
            if (as != null) {
                int i = this.bf;
                int length = as.length;
                if (length > this.an - i) {
                    length = this.an - i;
                }
                int i2 = 0;
                int i3 = i;
                while (i2 < length) {
                    i = (int) ((as[i2] * 128.0f) + 128.0f);
                    if ((i & -256) != 0) {
                        i = (i ^ -1) >> 31;
                    }
                    int i4 = i3 + 1;
                    this.bh[i3] = (byte) (i - 128);
                    i2++;
                    i3 = i4;
                }
                if (iArr != null) {
                    iArr[0] = iArr[0] - (i3 - this.bf);
                }
                this.bf = i3;
            }
            this.bv++;
        }
        this.ak = null;
        byte[] bArr = this.bh;
        this.bh = null;
        return new fc(this.ad, bArr, this.aa, this.ag, this.ay);
    }

    fc be(int[] iArr) {
        if (iArr != null && iArr[0] <= 0) {
            return null;
        }
        if (this.bh == null) {
            this.ao = 0;
            this.ak = new float[aq];
            this.bh = new byte[this.an];
            this.bf = 0;
            this.bv = 0;
        }
        while (this.bv < this.af.length) {
            if (iArr != null && iArr[0] <= 0) {
                return null;
            }
            float[] as = as(this.bv);
            if (as != null) {
                int i = this.bf;
                int length = as.length;
                if (length > this.an - i) {
                    length = this.an - i;
                }
                int i2 = 0;
                int i3 = i;
                while (i2 < length) {
                    i = (int) ((as[i2] * 128.0f) + 128.0f);
                    if ((-604744198 & i) != 0) {
                        i = (i ^ -1) >> 31;
                    }
                    int i4 = i3 + 1;
                    this.bh[i3] = (byte) (i - 1082520093);
                    i2++;
                    i3 = i4;
                }
                if (iArr != null) {
                    iArr[0] = iArr[0] - (i3 - this.bf);
                }
                this.bf = i3;
            }
            this.bv++;
        }
        this.ak = null;
        byte[] bArr = this.bh;
        this.bh = null;
        return new fc(this.ad, bArr, this.aa, this.ag, this.ay);
    }

    fc bt(int[] iArr) {
        if (iArr != null && iArr[0] <= 0) {
            return null;
        }
        if (this.bh == null) {
            this.ao = 0;
            this.ak = new float[aq];
            this.bh = new byte[this.an];
            this.bf = 0;
            this.bv = 0;
        }
        while (this.bv < this.af.length) {
            if (iArr != null && iArr[0] <= 0) {
                return null;
            }
            float[] as = as(this.bv);
            if (as != null) {
                int i = this.bf;
                int length = as.length;
                if (length > this.an - i) {
                    length = this.an - i;
                }
                int i2 = 0;
                int i3 = i;
                while (i2 < length) {
                    i = (int) ((as[i2] * 128.0f) + 128.0f);
                    if ((i & -256) != 0) {
                        i = (i ^ -1) >> 31;
                    }
                    int i4 = i3 + 1;
                    this.bh[i3] = (byte) (i - 128);
                    i2++;
                    i3 = i4;
                }
                if (iArr != null) {
                    iArr[0] = iArr[0] - (i3 - this.bf);
                }
                this.bf = i3;
            }
            this.bv++;
        }
        this.ak = null;
        byte[] bArr = this.bh;
        this.bh = null;
        return new fc(this.ad, bArr, this.aa, this.ag, this.ay);
    }

    fc bu(int[] iArr) {
        if (iArr != null && iArr[0] <= 0) {
            return null;
        }
        if (this.bh == null) {
            this.ao = 0;
            this.ak = new float[aq];
            this.bh = new byte[this.an];
            this.bf = 0;
            this.bv = 0;
        }
        while (this.bv < this.af.length) {
            if (iArr != null && iArr[0] <= 0) {
                return null;
            }
            float[] as = as(this.bv);
            if (as != null) {
                int i = this.bf;
                int length = as.length;
                if (length > this.an - i) {
                    length = this.an - i;
                }
                int i2 = 0;
                int i3 = i;
                while (i2 < length) {
                    i = (int) ((as[i2] * 128.0f) + 128.0f);
                    if ((i & -256) != 0) {
                        i = (i ^ -1) >> 31;
                    }
                    int i4 = i3 + 1;
                    this.bh[i3] = (byte) (i - 128);
                    i2++;
                    i3 = i4;
                }
                if (iArr != null) {
                    iArr[0] = iArr[0] - (i3 - this.bf);
                }
                this.bf = i3;
            }
            this.bv++;
        }
        this.ak = null;
        byte[] bArr = this.bh;
        this.bh = null;
        return new fc(this.ad, bArr, this.aa, this.ag, this.ay);
    }
}
