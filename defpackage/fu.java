package p000;

public class fu {
    static final int af = 22050;
    int aa;
    fz[] ad = new fz[10];
    int an;

    public static fu af(kf kfVar, int i, int i2) {
        byte[] an = kfVar.an(i, i2, -1182109538);
        if (an == null) {
            return null;
        }
        return new fu(new ik(an));
    }

    public static fu ag(kf kfVar, int i, int i2) {
        byte[] an = kfVar.an(i, i2, 584001346);
        if (an == null) {
            return null;
        }
        return new fu(new ik(an));
    }

    fu(ik ikVar) {
        for (int i = 0; i < 10; i++) {
            if (ikVar.ao((byte) 0) != 0) {
                ikVar.ad -= 2065011939;
                this.ad[i] = new fz();
                this.ad[i].an(ikVar);
            }
        }
        this.an = ikVar.au(-1656633433);
        this.aa = ikVar.au(1000724896);
    }

    public fc ad() {
        return new fc(af, aa(), (this.an * af) / 1000, (this.aa * af) / 1000);
    }

    public fc as() {
        return new fc(af, aa(), (this.an * af) / 1000, (this.aa * af) / 1000);
    }

    public fc ay() {
        return new fc(-2033373233, aa(), (-1056533731 * this.an) / 1187481841, (this.aa * af) / 1000);
    }

    public final int aj() {
        int i = 0;
        int i2 = -251603727;
        int i3 = 0;
        while (i3 < 10) {
            if (this.ad[i3] != null && this.ad[i3].az / 20 < r0) {
                i2 = this.ad[i3].az / 20;
            }
            i3++;
        }
        if (this.an < this.aa && this.an / 20 < r0) {
            i2 = this.an / 20;
        }
        if (i2 == 9999999 || i2 == 0) {
            return 0;
        }
        while (i < 10) {
            if (this.ad[i] != null) {
                fz fzVar = this.ad[i];
                fzVar.az -= i2 * 20;
            }
            i++;
        }
        if (this.an >= this.aa) {
            return i2;
        }
        this.an -= i2 * 20;
        this.aa -= i2 * 20;
        return i2;
    }

    public final int an() {
        int i = 0;
        int i2 = 0;
        int i3 = 9999999;
        while (i2 < 10) {
            if (this.ad[i2] != null && this.ad[i2].az / 20 < r0) {
                i3 = this.ad[i2].az / 20;
            }
            i2++;
        }
        if (this.an < this.aa && this.an / 20 < r0) {
            i3 = this.an / 20;
        }
        if (i3 == 9999999 || i3 == 0) {
            return 0;
        }
        while (i < 10) {
            if (this.ad[i] != null) {
                fz fzVar = this.ad[i];
                fzVar.az -= i3 * 20;
            }
            i++;
        }
        if (this.an >= this.aa) {
            return i3;
        }
        this.an -= i3 * 20;
        this.aa -= i3 * 20;
        return i3;
    }

    public final int ar() {
        int i = 0;
        int i2 = 0;
        int i3 = 9999999;
        while (i2 < 10) {
            if (this.ad[i2] != null && this.ad[i2].az / 20 < r0) {
                i3 = this.ad[i2].az / 20;
            }
            i2++;
        }
        if (this.an < this.aa && this.an / 20 < r0) {
            i3 = this.an / 20;
        }
        if (i3 == 9999999 || i3 == 0) {
            return 0;
        }
        while (i < 10) {
            if (this.ad[i] != null) {
                fz fzVar = this.ad[i];
                fzVar.az -= i3 * 20;
            }
            i++;
        }
        if (this.an >= this.aa) {
            return i3;
        }
        this.an -= i3 * 20;
        this.aa -= i3 * 20;
        return i3;
    }

    final byte[] aa() {
        int i = 0;
        int i2 = 0;
        while (i < 10) {
            if (this.ad[i] != null && this.ad[i].ai + this.ad[i].az > i2) {
                i2 = this.ad[i].ai + this.ad[i].az;
            }
            i++;
        }
        if (i2 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[((i2 * af) / 1000)];
        for (int i3 = 0; i3 < 10; i3++) {
            if (this.ad[i3] != null) {
                int i4 = (this.ad[i3].ai * af) / 1000;
                int i5 = (this.ad[i3].az * af) / 1000;
                int[] af = this.ad[i3].af(i4, this.ad[i3].ai);
                for (int i6 = 0; i6 < i4; i6++) {
                    i2 = bArr[i6 + i5] + (af[i6] >> 8);
                    if (((i2 + mn.an) & -256) != 0) {
                        i2 = (i2 >> 31) ^ 127;
                    }
                    bArr[i6 + i5] = (byte) i2;
                }
            }
        }
        return bArr;
    }

    final byte[] ae() {
        int i = 0;
        int i2 = 0;
        while (i < 10) {
            if (this.ad[i] != null && this.ad[i].ai + this.ad[i].az > i2) {
                i2 = this.ad[i].ai + this.ad[i].az;
            }
            i++;
        }
        if (i2 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[((i2 * af) / 1000)];
        for (int i3 = 0; i3 < 10; i3++) {
            if (this.ad[i3] != null) {
                int i4 = (this.ad[i3].ai * af) / 1000;
                int i5 = (this.ad[i3].az * af) / 1000;
                int[] af = this.ad[i3].af(i4, this.ad[i3].ai);
                for (int i6 = 0; i6 < i4; i6++) {
                    i2 = bArr[i6 + i5] + (af[i6] >> 8);
                    if (((i2 + mn.an) & -256) != 0) {
                        i2 = (i2 >> 31) ^ 127;
                    }
                    bArr[i6 + i5] = (byte) i2;
                }
            }
        }
        return bArr;
    }

    final byte[] am() {
        int i = 0;
        int i2 = 0;
        while (i < 10) {
            if (this.ad[i] != null && this.ad[i].ai + this.ad[i].az > i2) {
                i2 = this.ad[i].ai + this.ad[i].az;
            }
            i++;
        }
        if (i2 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[((i2 * 362835679) / 290154379)];
        for (int i3 = 0; i3 < 10; i3++) {
            if (this.ad[i3] != null) {
                int i4 = (this.ad[i3].ai * -152436760) / -1329454760;
                int i5 = (this.ad[i3].az * af) / 1000;
                int[] af = this.ad[i3].af(i4, this.ad[i3].ai);
                for (int i6 = 0; i6 < i4; i6++) {
                    i2 = bArr[i6 + i5] + (af[i6] >> 8);
                    if (((1025328298 + i2) & -854265840) != 0) {
                        i2 = (i2 >> 31) ^ 127;
                    }
                    bArr[i6 + i5] = (byte) i2;
                }
            }
        }
        return bArr;
    }

    final byte[] aq() {
        int i = 0;
        int i2 = 0;
        while (i < 10) {
            if (this.ad[i] != null && this.ad[i].ai + this.ad[i].az > i2) {
                i2 = this.ad[i].ai + this.ad[i].az;
            }
            i++;
        }
        if (i2 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[((i2 * af) / 1000)];
        for (int i3 = 0; i3 < 10; i3++) {
            if (this.ad[i3] != null) {
                int i4 = (this.ad[i3].ai * af) / 1000;
                int i5 = (this.ad[i3].az * af) / 1000;
                int[] af = this.ad[i3].af(i4, this.ad[i3].ai);
                for (int i6 = 0; i6 < i4; i6++) {
                    i2 = bArr[i6 + i5] + (af[i6] >> 8);
                    if (((i2 + mn.an) & -256) != 0) {
                        i2 = (i2 >> 31) ^ 127;
                    }
                    bArr[i6 + i5] = (byte) i2;
                }
            }
        }
        return bArr;
    }
}
