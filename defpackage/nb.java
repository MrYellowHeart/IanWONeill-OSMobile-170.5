package p000;

public class nb extends kd {
    static int aq;
    byte[] aa;
    fc[] ad;
    int af;
    byte[] ag;
    short[] an;
    int[] ar;
    byte[] as;
    nz[] ay;

    nb(byte[] bArr) {
        try {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            nz nzVar;
            byte[] bArr2;
            byte[] bArr3;
            byte b;
            byte b2;
            byte b3;
            nz nzVar2;
            byte b4;
            this.ad = new fc[mn.an];
            this.an = new short[mn.an];
            this.aa = new byte[mn.an];
            this.ag = new byte[mn.an];
            this.ay = new nz[mn.an];
            this.as = new byte[mn.an];
            this.ar = new int[mn.an];
            ik ikVar = new ik(bArr);
            int i6 = 0;
            while (ikVar.af[(ikVar.ad * 1978945739) + i6] != (byte) 0) {
                i6++;
            }
            byte[] bArr4 = new byte[i6];
            for (i = 0; i < i6; i++) {
                bArr4[i] = ikVar.ax(1247983979);
            }
            ikVar.ad += 2065011939;
            int i7 = 1978945739 * ikVar.ad;
            ikVar.ad = ((i6 + 1) * 2065011939) + ikVar.ad;
            i6 = 0;
            while (ikVar.af[(ikVar.ad * 1978945739) + i6] != (byte) 0) {
                i6++;
            }
            byte[] bArr5 = new byte[i6];
            for (i = 0; i < i6; i++) {
                bArr5[i] = ikVar.ax(1247983979);
            }
            ikVar.ad += 2065011939;
            int i8 = ikVar.ad * 1978945739;
            ikVar.ad = ((i6 + 1) * 2065011939) + ikVar.ad;
            i6 = 0;
            while (ikVar.af[(1978945739 * ikVar.ad) + i6] != (byte) 0) {
                i6++;
            }
            byte[] bArr6 = new byte[i6];
            for (i = 0; i < i6; i++) {
                bArr6[i] = ikVar.ax(1247983979);
            }
            ikVar.ad += 2065011939;
            int i9 = i6 + 1;
            byte[] bArr7 = new byte[i9];
            if (i9 > 1) {
                bArr7[1] = (byte) 1;
                i2 = 1;
                i6 = 2;
                i3 = 2;
                while (i3 < i9) {
                    i = ikVar.ao((byte) 0);
                    if (i == 0) {
                        i = i6 + 1;
                    } else {
                        if (i <= i2) {
                            i--;
                        }
                        i4 = i;
                        i = i6;
                        i6 = i4;
                    }
                    bArr7[i3] = (byte) i6;
                    i3++;
                    i2 = i6;
                    i6 = i;
                }
                i5 = i6;
            } else {
                i5 = i9;
            }
            nz[] nzVarArr = new nz[i5];
            for (i = 0; i < nzVarArr.length; i++) {
                nzVar = new nz();
                nzVarArr[i] = nzVar;
                i9 = ikVar.ao((byte) 0);
                if (i9 > 0) {
                    nzVar.af = new byte[(i9 * 2)];
                }
                i9 = ikVar.ao((byte) 0);
                if (i9 > 0) {
                    nzVar.ad = new byte[((i9 * 2) + 2)];
                    nzVar.ad[1] = (byte) 64;
                }
            }
            i = ikVar.ao((byte) 0);
            if (i > 0) {
                bArr2 = new byte[(i * 2)];
            } else {
                bArr2 = null;
            }
            i6 = ikVar.ao((byte) 0);
            if (i6 > 0) {
                bArr3 = new byte[(i6 * 2)];
            } else {
                bArr3 = null;
            }
            i3 = 0;
            while (ikVar.af[(ikVar.ad * 1978945739) + i3] != (byte) 0) {
                i3++;
            }
            byte[] bArr8 = new byte[i3];
            for (i9 = 0; i9 < i3; i9++) {
                bArr8[i9] = ikVar.ax(1247983979);
            }
            ikVar.ad += 2065011939;
            i9 = i3 + 1;
            i3 = 0;
            for (i9 = 0; i9 < mn.an; i9++) {
                i3 += ikVar.ao((byte) 0);
                this.an[i9] = (short) i3;
            }
            i3 = 0;
            for (i9 = 0; i9 < mn.an; i9++) {
                i3 += ikVar.ao((byte) 0);
                short[] sArr = this.an;
                sArr[i9] = (short) (sArr[i9] + (i3 << 8));
            }
            i9 = 0;
            i3 = 0;
            i2 = 0;
            int i10 = 0;
            while (i10 < mn.an) {
                if (i2 == 0) {
                    if (i3 < bArr8.length) {
                        i9 = i3 + 1;
                        b = bArr8[i3];
                    } else {
                        i4 = i3;
                        b = (byte) -1;
                        i9 = i4;
                    }
                    i2 = b;
                    i3 = i9;
                    i9 = ikVar.bt(-1680468067);
                }
                short[] sArr2 = this.an;
                sArr2[i10] = (short) (sArr2[i10] + (((i9 - 1) & 2) << 14));
                this.ar[i10] = i9;
                i10++;
                i2--;
            }
            i9 = 0;
            i3 = 0;
            i2 = 0;
            i10 = i7;
            for (int i11 = 0; i11 < mn.an; i11++) {
                if (this.ar[i11] != 0) {
                    if (i2 == 0) {
                        if (i3 < bArr4.length) {
                            i4 = i3 + 1;
                            b2 = bArr4[i3];
                            i3 = i4;
                        } else {
                            b2 = (byte) -1;
                        }
                        i10++;
                        byte b5 = b2;
                        i9 = ikVar.af[i10] - 1;
                        i2 = b5;
                    }
                    this.as[i11] = (byte) i9;
                    i2--;
                }
            }
            i9 = 0;
            i3 = 0;
            i2 = 0;
            i10 = i8;
            for (i8 = 0; i8 < mn.an; i8++) {
                if (this.ar[i8] != 0) {
                    if (i2 == 0) {
                        if (i3 < bArr5.length) {
                            i9 = i3 + 1;
                            i2 = bArr5[i3];
                            i3 = i9;
                        } else {
                            i2 = -1;
                        }
                        i9 = (ikVar.af[i10] + 16) << 2;
                        i10++;
                    }
                    this.ag[i8] = (byte) i9;
                    i2--;
                }
            }
            nz nzVar3 = null;
            i3 = 0;
            i2 = 0;
            for (i10 = 0; i10 < mn.an; i10++) {
                if (this.ar[i10] != 0) {
                    if (i2 == 0) {
                        nzVar3 = nzVarArr[bArr7[i3]];
                        if (i3 < bArr6.length) {
                            i4 = i3 + 1;
                            b3 = bArr6[i3];
                            i3 = i4;
                        } else {
                            i2 = -1;
                        }
                    }
                    this.ay[i10] = nzVar3;
                    i2--;
                }
            }
            i9 = 0;
            i3 = 0;
            i2 = 0;
            i10 = 0;
            while (i10 < mn.an) {
                if (i2 == 0) {
                    if (i3 < bArr8.length) {
                        i4 = i3 + 1;
                        i2 = bArr8[i3];
                        i3 = i4;
                    } else {
                        i2 = -1;
                    }
                    if (this.ar[i10] > 0) {
                        i9 = ikVar.ao((byte) 0) + 1;
                    }
                }
                this.aa[i10] = (byte) i9;
                i10++;
                i2--;
            }
            this.af = (ikVar.ao((byte) 0) + 1) * -726688045;
            for (i3 = 0; i3 < i5; i3++) {
                nz nzVar4 = nzVarArr[i3];
                if (nzVar4.af != null) {
                    for (i9 = 1; i9 < nzVar4.af.length; i9 += 2) {
                        nzVar4.af[i9] = ikVar.ax(1247983979);
                    }
                }
                if (nzVar4.ad != null) {
                    for (i9 = 3; i9 < nzVar4.ad.length - 2; i9 += 2) {
                        nzVar4.ad[i9] = ikVar.ax(1247983979);
                    }
                }
            }
            if (bArr2 != null) {
                for (i9 = 1; i9 < bArr2.length; i9 += 2) {
                    bArr2[i9] = ikVar.ax(1247983979);
                }
            }
            if (bArr3 != null) {
                for (i9 = 1; i9 < bArr3.length; i9 += 2) {
                    bArr3[i9] = ikVar.ax(1247983979);
                }
            }
            for (i2 = 0; i2 < i5; i2++) {
                nzVar2 = nzVarArr[i2];
                if (nzVar2.ad != null) {
                    i3 = 0;
                    for (i9 = 2; i9 < nzVar2.ad.length; i9 += 2) {
                        i3 = (i3 + 1) + ikVar.ao((byte) 0);
                        nzVar2.ad[i9] = (byte) i3;
                    }
                }
            }
            for (i2 = 0; i2 < i5; i2++) {
                nzVar2 = nzVarArr[i2];
                if (nzVar2.af != null) {
                    i3 = 0;
                    for (i9 = 2; i9 < nzVar2.af.length; i9 += 2) {
                        i3 = (i3 + 1) + ikVar.ao((byte) 0);
                        nzVar2.af[i9] = (byte) i3;
                    }
                }
            }
            if (bArr2 != null) {
                i3 = ikVar.ao((byte) 0);
                bArr2[0] = (byte) i3;
                for (i9 = 2; i9 < bArr2.length; i9 += 2) {
                    i3 = (i3 + 1) + ikVar.ao((byte) 0);
                    bArr2[i9] = (byte) i3;
                }
                b3 = bArr2[0];
                b = bArr2[1];
                for (b2 = (byte) 0; b2 < b3; b2++) {
                    this.aa[b2] = (byte) (((this.aa[b2] * b) + 32) >> 6);
                }
                i10 = 2;
                byte b6 = b;
                b = b3;
                while (i10 < bArr2.length) {
                    b4 = bArr2[i10];
                    byte b7 = bArr2[i10 + 1];
                    i2 = ((b4 - i3) / 2) + ((b4 - i3) * i7);
                    for (b2 = i3; b2 < b4; b2++) {
                        this.aa[b2] = (byte) (((ft.an(i2, b4 - i3, 1681357304) * this.aa[b2]) + 32) >> 6);
                        i2 += b7 - i7;
                    }
                    i10 += 2;
                    i7 = b7;
                    i3 = b4;
                }
                while (i3 < mn.an) {
                    this.aa[i3] = (byte) (((this.aa[i3] * i7) + 32) >> 6);
                    i3++;
                }
            }
            if (bArr3 != null) {
                i9 = ikVar.ao((byte) 0);
                bArr3[0] = (byte) i9;
                for (i = 2; i < bArr3.length; i += 2) {
                    i9 = (i9 + 1) + ikVar.ao((byte) 0);
                    bArr3[i] = (byte) i9;
                }
                b = bArr3[0];
                i9 = bArr3[1] << 1;
                for (b3 = (byte) 0; b3 < b; b3++) {
                    i = (this.ag[b3] & 255) + i9;
                    if (i < 0) {
                        i = 0;
                    }
                    if (i > mn.an) {
                        i = mn.an;
                    }
                    this.ag[b3] = (byte) i;
                }
                i10 = 2;
                i7 = i9;
                b2 = b;
                while (i10 < bArr3.length) {
                    b4 = bArr3[i10];
                    i8 = bArr3[i10 + 1] << 1;
                    i2 = ((b4 - b2) * i7) + ((b4 - b2) / 2);
                    for (b = b2; b < b4; b++) {
                        i = ft.an(i2, b4 - b2, -1540188955) + (this.ag[b] & 255);
                        if (i < 0) {
                            i = 0;
                        }
                        if (i > mn.an) {
                            i = mn.an;
                        }
                        this.ag[b] = (byte) i;
                        i2 += i8 - i7;
                    }
                    i10 += 2;
                    i7 = i8;
                    b2 = b4;
                }
                for (i6 = b2; i6 < mn.an; i6++) {
                    i = (this.ag[i6] & 255) + i7;
                    if (i < 0) {
                        i = 0;
                    }
                    if (i > mn.an) {
                        i = mn.an;
                    }
                    this.ag[i6] = (byte) i;
                }
            }
            for (i = 0; i < i5; i++) {
                nzVarArr[i].an = ikVar.ao((byte) 0) * -529915055;
            }
            for (i = 0; i < i5; i++) {
                nzVar = nzVarArr[i];
                if (nzVar.af != null) {
                    nzVar.aa = ikVar.ao((byte) 0) * -1807563047;
                }
                if (nzVar.ad != null) {
                    nzVar.ag = ikVar.ao((byte) 0) * 851611311;
                }
                if (nzVar.an * 400360881 > 0) {
                    nzVar.ay = ikVar.ao((byte) 0) * 130426205;
                }
            }
            for (i = 0; i < i5; i++) {
                nzVarArr[i].ar = ikVar.ao((byte) 0) * 2031947481;
            }
            for (i = 0; i < i5; i++) {
                nzVar = nzVarArr[i];
                if (1468830057 * nzVar.ar > 0) {
                    nzVar.as = ikVar.ao((byte) 0) * 876330179;
                }
            }
            for (i = 0; i < i5; i++) {
                nzVar = nzVarArr[i];
                if (nzVar.as * 1204278251 > 0) {
                    nzVar.aj = ikVar.ao((byte) 0) * 102558217;
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "nb.<init>(" + ')');
        }
    }

    boolean aa(fm fmVar, byte[] bArr, int[] iArr) {
        boolean z = true;
        fc fcVar = null;
        int i = 0;
        int i2 = 0;
        while (i < mn.an) {
            if (bArr == null || bArr[i] != (byte) 0) {
                int i3 = this.ar[i];
                if (i3 != 0) {
                    if (i3 != i2) {
                        int i4 = i3 - 1;
                        if ((i4 & 1) == 0) {
                            fcVar = fmVar.an(i4 >> 2, iArr, (byte) -35);
                        } else {
                            fcVar = fmVar.aa(i4 >> 2, iArr, 842696807);
                        }
                        if (fcVar == null) {
                            i2 = i3;
                            z = false;
                        } else {
                            i2 = i3;
                        }
                    }
                    if (fcVar != null) {
                        this.ad[i] = fcVar;
                        this.ar[i] = 0;
                    }
                }
            }
            i++;
        }
        return z;
    }

    boolean af(fm fmVar, byte[] bArr, int[] iArr, int i) {
        boolean z = true;
        fc fcVar = null;
        int i2 = 0;
        for (int i3 = 0; i3 < mn.an; i3++) {
            if (bArr != null) {
                if (bArr[i3] == (byte) 0) {
                    continue;
                }
            }
            int i4 = this.ar[i3];
            if (i4 != 0) {
                if (i4 != i2) {
                    int i5 = i4 - 1;
                    if ((i5 & 1) == 0) {
                        fcVar = fmVar.an(i5 >> 2, iArr, (byte) -97);
                    } else {
                        try {
                            fcVar = fmVar.aa(i5 >> 2, iArr, 842696807);
                        } catch (Throwable e) {
                            throw ba.ad(e, "nb.af(" + ')');
                        }
                    }
                    if (fcVar == null) {
                        i2 = i4;
                        z = false;
                    } else {
                        i2 = i4;
                    }
                }
                if (fcVar != null) {
                    this.ad[i3] = fcVar;
                    this.ar[i3] = 0;
                }
            } else {
                continue;
            }
        }
        return z;
    }

    boolean an(fm fmVar, byte[] bArr, int[] iArr) {
        boolean z = true;
        fc fcVar = null;
        int i = 0;
        int i2 = 0;
        while (i < mn.an) {
            if (bArr == null || bArr[i] != (byte) 0) {
                int i3 = this.ar[i];
                if (i3 != 0) {
                    if (i3 != i2) {
                        int i4 = i3 - 1;
                        if ((i4 & 1) == 0) {
                            fcVar = fmVar.an(i4 >> 2, iArr, (byte) -78);
                        } else {
                            fcVar = fmVar.aa(i4 >> 2, iArr, 842696807);
                        }
                        if (fcVar == null) {
                            i2 = i3;
                            z = false;
                        } else {
                            i2 = i3;
                        }
                    }
                    if (fcVar != null) {
                        this.ad[i] = fcVar;
                        this.ar[i] = 0;
                    }
                }
            }
            i++;
        }
        return z;
    }

    void ad(int i) {
        try {
            this.ar = null;
        } catch (Throwable e) {
            throw ba.ad(e, "nb.ad(" + ')');
        }
    }

    void ag() {
        this.ar = null;
    }

    void as() {
        this.ar = null;
    }

    void ay() {
        this.ar = null;
    }

    static final void bg(int i) {
        try {
            if (-236480925 * client.dl > 0 || hu.af(191731252) > 60000 + (8910287064128864421L * he.qz)) {
                eg.bz(20665930);
                return;
            }
            client.dr.ad(-1398342445);
            ad.ai(40, -2031373184);
            ha.dd = client.dv.as(1217888446);
            client.dv.ay(-2010783442);
        } catch (Throwable e) {
            throw ba.ad(e, "nb.bg(" + ')');
        }
    }
}
