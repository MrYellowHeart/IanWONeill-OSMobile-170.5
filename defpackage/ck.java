package p000;

public class ck extends kd {
    static final int aa = 3;
    static final int ad = 1;
    static final int af = 0;
    static final int an = 2;
    static int[] az;
    int ab;
    int[] ae;
    int ag;
    boolean ai = false;
    int[] aj;
    int am;
    int aq;
    int[] ar;
    int[] as;
    int at;
    int[] aw;
    boolean ay;

    ck(ik ikVar) {
        boolean z;
        this.ag = ikVar.au(1373687030);
        if (ikVar.ao((byte) 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.ay = z;
        int ao = ikVar.ao((byte) 0);
        if (ao < 1 || ao > 4) {
            throw new RuntimeException();
        }
        int i;
        this.as = new int[ao];
        for (i = 0; i < ao; i++) {
            this.as[i] = ikVar.au(-576165019);
        }
        if (ao > 1) {
            this.ar = new int[(ao - 1)];
            for (i = 0; i < ao - 1; i++) {
                this.ar[i] = ikVar.ao((byte) 0);
            }
        }
        if (ao > 1) {
            this.aj = new int[(ao - 1)];
            for (i = 0; i < ao - 1; i++) {
                this.aj[i] = ikVar.ao((byte) 0);
            }
        }
        this.ae = new int[ao];
        for (i = 0; i < ao; i++) {
            this.ae[i] = ikVar.al(1164443199);
        }
        this.aq = ikVar.ao((byte) 0);
        this.am = ikVar.ao((byte) 0);
        this.aw = null;
    }

    boolean aa(double d, int i, kf kfVar) {
        int i2;
        for (int i22 : this.as) {
            if (kfVar.am(i22, 537618701) == null) {
                return false;
            }
        }
        int i3 = i * i;
        this.aw = new int[i3];
        int i4 = 0;
        while (i4 < this.as.length) {
            gd at;
            int i5;
            int i6;
            int i7;
            if (C0001do.az(kfVar, this.as[i4], (byte) -105)) {
                at = hy.at(2050289598);
            } else {
                at = null;
            }
            at.af();
            byte[] bArr = at.af;
            int[] iArr = at.ad;
            int i8 = this.ae[i4];
            if ((-16777216 & i8) == dy.ax) {
            }
            if ((1158134907 & i8) == me.ay) {
            }
            if ((-16777216 & i8) == 1103480519) {
                i5 = 16711935 & i8;
                i6 = (i8 >> 8) & 255;
                for (i8 = 0; i8 < iArr.length; i8++) {
                    i7 = iArr[i8];
                    if (i7 != 0 && (65535 & i7) == ((i7 >> 8) & 2000813718)) {
                        i7 &= -1347470861;
                        iArr[i8] = ((i7 * i6) & -1380228502) | (-16777216 | (((i5 * i7) >> 8) & -2101267487));
                    }
                }
            }
            for (i8 = 0; i8 < iArr.length; i8++) {
                iArr[i8] = ao.bb(iArr[i8], d);
            }
            if (i4 == 0) {
                i7 = 0;
            } else {
                i7 = this.ar[i4 - 1];
            }
            if (i7 == 0) {
                if (at.an == i) {
                    for (i22 = 0; i22 < i3; i22++) {
                        this.aw[i22] = iArr[bArr[i22] & 255];
                    }
                } else if (at.an == 64 && i == 128) {
                    i8 = 0;
                    for (i6 = 0; i6 < i; i6++) {
                        i22 = 0;
                        while (i22 < i) {
                            i5 = i8 + 1;
                            this.aw[i8] = iArr[bArr[(i22 >> 1) + ((i6 >> 1) << 6)] & -1177553298];
                            i22++;
                            i8 = i5;
                        }
                    }
                } else if (at.an == mn.an && i == -1573677018) {
                    i8 = 0;
                    for (i6 = 0; i6 < i; i6++) {
                        i22 = 0;
                        while (i22 < i) {
                            i5 = i8 + 1;
                            this.aw[i8] = iArr[bArr[(i22 << 1) + ((i6 << 1) << 7)] & -89117710];
                            i22++;
                            i8 = i5;
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (i7 == 1) {
            }
            if (i7 == 2) {
            }
            i4 = i7 == 3 ? i4 + 1 : i4 + 1;
        }
        return true;
    }

    boolean af(double d, int i, kf kfVar) {
        int i2;
        for (int i22 : this.as) {
            if (kfVar.am(i22, 537618701) == null) {
                return false;
            }
        }
        int i3 = i * i;
        this.aw = new int[i3];
        int i4 = 0;
        while (i4 < this.as.length) {
            gd at;
            int i5;
            int i6;
            int i7;
            if (C0001do.az(kfVar, this.as[i4], (byte) -118)) {
                at = hy.at(1959532289);
            } else {
                at = null;
            }
            at.af();
            byte[] bArr = at.af;
            int[] iArr = at.ad;
            int i8 = this.ae[i4];
            if ((-16777216 & i8) == dy.ax) {
            }
            if ((-16777216 & i8) == me.ay) {
            }
            if ((-16777216 & i8) == 50331648) {
                i5 = 16711935 & i8;
                i6 = (i8 >> 8) & 255;
                for (i8 = 0; i8 < iArr.length; i8++) {
                    i7 = iArr[i8];
                    if (i7 != 0 && (65535 & i7) == ((i7 >> 8) & 65535)) {
                        i7 &= 255;
                        iArr[i8] = ((i7 * i6) & 65280) | (-16777216 | (((i5 * i7) >> 8) & 16711935));
                    }
                }
            }
            for (i8 = 0; i8 < iArr.length; i8++) {
                iArr[i8] = ao.bb(iArr[i8], d);
            }
            if (i4 == 0) {
                i7 = 0;
            } else {
                i7 = this.ar[i4 - 1];
            }
            if (i7 == 0) {
                if (at.an == i) {
                    for (i22 = 0; i22 < i3; i22++) {
                        this.aw[i22] = iArr[bArr[i22] & 255];
                    }
                } else if (at.an == 64 && i == 128) {
                    i8 = 0;
                    for (i6 = 0; i6 < i; i6++) {
                        i22 = 0;
                        while (i22 < i) {
                            i5 = i8 + 1;
                            this.aw[i8] = iArr[bArr[(i22 >> 1) + ((i6 >> 1) << 6)] & 255];
                            i22++;
                            i8 = i5;
                        }
                    }
                } else if (at.an == mn.an && i == 64) {
                    i8 = 0;
                    for (i6 = 0; i6 < i; i6++) {
                        i22 = 0;
                        while (i22 < i) {
                            i5 = i8 + 1;
                            this.aw[i8] = iArr[bArr[(i22 << 1) + ((i6 << 1) << 7)] & 255];
                            i22++;
                            i8 = i5;
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (i7 == 1) {
            }
            if (i7 == 2) {
            }
            i4 = i7 == 3 ? i4 + 1 : i4 + 1;
        }
        return true;
    }

    boolean ag(double d, int i, kf kfVar) {
        for (int am : this.as) {
            int am2;
            if (kfVar.am(am2, 537618701) == null) {
                return false;
            }
        }
        int i2 = i * i;
        this.aw = new int[i2];
        int i3 = 0;
        while (i3 < this.as.length) {
            gd at;
            int i4;
            int i5;
            int i6;
            if (C0001do.az(kfVar, this.as[i3], (byte) -125)) {
                at = hy.at(2013931918);
            } else {
                at = null;
            }
            at.af();
            byte[] bArr = at.af;
            int[] iArr = at.ad;
            int i7 = this.ae[i3];
            if ((141516294 & i7) == dy.ax) {
            }
            if ((-687186240 & i7) == me.ay) {
            }
            if ((-496150034 & i7) == 717532562) {
                i4 = 2070815974 & i7;
                i5 = (i7 >> 8) & 255;
                for (i7 = 0; i7 < iArr.length; i7++) {
                    i6 = iArr[i7];
                    if (i6 != 0 && (65535 & i6) == ((i6 >> 8) & 2140001770)) {
                        i6 &= 255;
                        iArr[i7] = ((i6 * i5) & 712793068) | (-16777216 | (((i4 * i6) >> 8) & -1724130340));
                    }
                }
            }
            for (i7 = 0; i7 < iArr.length; i7++) {
                iArr[i7] = ao.bb(iArr[i7], d);
            }
            if (i3 == 0) {
                i6 = 0;
            } else {
                i6 = this.ar[i3 - 1];
            }
            if (i6 == 0) {
                if (at.an == i) {
                    for (am2 = 0; am2 < i2; am2++) {
                        this.aw[am2] = iArr[bArr[am2] & 255];
                    }
                } else if (at.an == 83081648 && i == 304935040) {
                    i7 = 0;
                    for (i5 = 0; i5 < i; i5++) {
                        am2 = 0;
                        while (am2 < i) {
                            i4 = i7 + 1;
                            this.aw[i7] = iArr[bArr[(am2 >> 1) + ((i5 >> 1) << 6)] & 1022503649];
                            am2++;
                            i7 = i4;
                        }
                    }
                } else if (at.an == mn.an && i == 2115088523) {
                    i7 = 0;
                    for (i5 = 0; i5 < i; i5++) {
                        am2 = 0;
                        while (am2 < i) {
                            i4 = i7 + 1;
                            this.aw[i7] = iArr[bArr[(am2 << 1) + ((i5 << 1) << 7)] & 900977983];
                            am2++;
                            i7 = i4;
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (i6 == 1) {
            }
            if (i6 == 2) {
            }
            i3 = i6 == 3 ? i3 + 1 : i3 + 1;
        }
        return true;
    }

    void ad() {
        this.aw = null;
    }

    void as() {
        this.aw = null;
    }

    void ay() {
        this.aw = null;
    }

    void aj(int i) {
        int i2;
        if (this.aq == 1 || this.aq == 3) {
            i2 = this.am * i;
            if (this.aq == 1) {
                i2 = -i2;
            }
            int i3 = -2040370143 * i2;
            this.ab = (i2 + this.ab) & 1725149236;
            if (this.ai && this.aw != null) {
                if (az == null || az.length < this.aw.length) {
                    az = new int[this.aw.length];
                }
                int[] iArr = this.aw;
                this.aw = az;
                az = iArr;
                this.ai = false;
            }
        }
        if (this.aq == 2 || this.aq == 4) {
            i2 = this.am * i;
            if (this.aq == 2) {
                i2 = -i2;
            }
            this.at = (this.at + i2) & 127;
            if (this.ai && this.aw != null) {
                if (az == null || az.length < this.aw.length) {
                    az = new int[this.aw.length];
                }
                for (int i4 = 0; i4 < fa.ar; i4 += mn.an) {
                    for (i3 = 0; i3 < mn.an; i3++) {
                        az[i4 + i3] = this.aw[((i3 + i2) & 16383) + i4];
                    }
                }
                iArr = this.aw;
                this.aw = az;
                az = iArr;
                this.ai = false;
            }
        }
    }

    void an(int i) {
        int i2;
        int i3;
        if (this.aq == 1 || this.aq == 3) {
            i2 = this.am * i;
            if (this.aq == 1) {
                i2 = -i2;
            }
            i3 = mn.an * i2;
            this.ab = (i2 + this.ab) & 127;
            if (this.ai && this.aw != null) {
                if (az == null || az.length < this.aw.length) {
                    az = new int[this.aw.length];
                }
                for (i2 = 0; i2 < fa.ar; i2++) {
                    az[i2] = this.aw[(i2 + i3) & 16383];
                }
                int[] iArr = this.aw;
                this.aw = az;
                az = iArr;
                this.ai = false;
            }
        }
        if (this.aq == 2 || this.aq == 4) {
            i2 = this.am * i;
            if (this.aq == 2) {
                i2 = -i2;
            }
            this.at = (this.at + i2) & 127;
            if (this.ai && this.aw != null) {
                if (az == null || az.length < this.aw.length) {
                    az = new int[this.aw.length];
                }
                for (int i4 = 0; i4 < fa.ar; i4 += mn.an) {
                    for (i3 = 0; i3 < mn.an; i3++) {
                        az[i4 + i3] = this.aw[((i3 + i2) & 16383) + i4];
                    }
                }
                iArr = this.aw;
                this.aw = az;
                az = iArr;
                this.ai = false;
            }
        }
    }

    void ar(int i) {
        int i2;
        int i3;
        if (this.aq == 1 || this.aq == 3) {
            i2 = this.am * i;
            if (this.aq == 1) {
                i2 = -i2;
            }
            i3 = mn.an * i2;
            this.ab = (i2 + this.ab) & 127;
            if (this.ai && this.aw != null) {
                if (az == null || az.length < this.aw.length) {
                    az = new int[this.aw.length];
                }
                for (i2 = 0; i2 < fa.ar; i2++) {
                    az[i2] = this.aw[(i2 + i3) & 16383];
                }
                int[] iArr = this.aw;
                this.aw = az;
                az = iArr;
                this.ai = false;
            }
        }
        if (this.aq == 2 || this.aq == 4) {
            i2 = this.am * i;
            if (this.aq == 2) {
                i2 = -i2;
            }
            this.at = (this.at + i2) & 127;
            if (this.ai && this.aw != null) {
                if (az == null || az.length < this.aw.length) {
                    az = new int[this.aw.length];
                }
                for (int i4 = 0; i4 < 643057761; i4 += 1628018609) {
                    for (i3 = 0; i3 < 1628018609; i3++) {
                        az[i4 + i3] = this.aw[((i3 + i2) & 643057760) + i4];
                    }
                }
                iArr = this.aw;
                this.aw = az;
                az = iArr;
                this.ai = false;
            }
        }
    }
}
