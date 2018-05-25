package p000;

public final class fx extends kq {
    public int aa;
    public int ad;
    public int[] af;
    int ag;
    public int an;
    public int as;
    public int ay;

    fx() {
    }

    public fx(int i, int i2) {
        this(new int[(i * i2)], i, i2);
    }

    public fx(int[] iArr, int i, int i2) {
        this.af = iArr;
        this.ay = i;
        this.ad = i;
        this.as = i2;
        this.an = i2;
        this.ag = 0;
        this.aa = 0;
    }

    public fx ae() {
        fx fxVar = new fx(this.ad, this.an);
        fxVar.ay = this.ay;
        fxVar.as = this.as;
        fxVar.aa = (this.ay - this.ad) - this.aa;
        fxVar.ag = this.ag;
        for (int i = 0; i < this.an; i++) {
            for (int i2 = 0; i2 < this.ad; i2++) {
                fxVar.af[(this.ad * i) + i2] = this.af[(((this.ad * i) + this.ad) - 1) - i2];
            }
        }
        return fxVar;
    }

    public fx af() {
        fx fxVar = new fx(this.ad, this.an);
        fxVar.ay = this.ay;
        fxVar.as = this.as;
        fxVar.aa = (this.ay - this.ad) - this.aa;
        fxVar.ag = this.ag;
        for (int i = 0; i < this.an; i++) {
            for (int i2 = 0; i2 < this.ad; i2++) {
                fxVar.af[(this.ad * i) + i2] = this.af[(((this.ad * i) + this.ad) - 1) - i2];
            }
        }
        return fxVar;
    }

    public fx aj() {
        fx fxVar = new fx(this.ad, this.an);
        fxVar.ay = this.ay;
        fxVar.as = this.as;
        fxVar.aa = (this.ay - this.ad) - this.aa;
        fxVar.ag = this.ag;
        for (int i = 0; i < this.an; i++) {
            for (int i2 = 0; i2 < this.ad; i2++) {
                fxVar.af[(this.ad * i) + i2] = this.af[(((this.ad * i) + this.ad) - 1) - i2];
            }
        }
        return fxVar;
    }

    public fx aq() {
        fx fxVar = new fx(this.ad, this.an);
        fxVar.ay = this.ay;
        fxVar.as = this.as;
        fxVar.aa = (this.ay - this.ad) - this.aa;
        fxVar.ag = this.ag;
        for (int i = 0; i < this.an; i++) {
            for (int i2 = 0; i2 < this.ad; i2++) {
                fxVar.af[(this.ad * i) + i2] = this.af[(((this.ad * i) + this.ad) - 1) - i2];
            }
        }
        return fxVar;
    }

    public fx ad() {
        fx fxVar = new fx(this.ay, this.as);
        for (int i = 0; i < this.an; i++) {
            for (int i2 = 0; i2 < this.ad; i2++) {
                fxVar.af[((this.ag + i) * this.ay) + (this.aa + i2)] = this.af[(this.ad * i) + i2];
            }
        }
        return fxVar;
    }

    public fx am() {
        fx fxVar = new fx(this.ay, this.as);
        for (int i = 0; i < this.an; i++) {
            for (int i2 = 0; i2 < this.ad; i2++) {
                fxVar.af[((this.ag + i) * this.ay) + (this.aa + i2)] = this.af[(this.ad * i) + i2];
            }
        }
        return fxVar;
    }

    public fx at() {
        fx fxVar = new fx(this.ay, this.as);
        for (int i = 0; i < this.an; i++) {
            for (int i2 = 0; i2 < this.ad; i2++) {
                fxVar.af[((this.ag + i) * this.ay) + (this.aa + i2)] = this.af[(this.ad * i) + i2];
            }
        }
        return fxVar;
    }

    public void ab() {
        if (this.ad != this.ay || this.an != this.as) {
            int[] iArr = new int[(this.ay * this.as)];
            for (int i = 0; i < this.an; i++) {
                for (int i2 = 0; i2 < this.ad; i2++) {
                    iArr[((this.ag + i) * this.ay) + (this.aa + i2)] = this.af[(this.ad * i) + i2];
                }
            }
            this.af = iArr;
            this.ad = this.ay;
            this.an = this.as;
            this.aa = 0;
            this.ag = 0;
        }
    }

    public void ai() {
        if (this.ad != this.ay || this.an != this.as) {
            int[] iArr = new int[(this.ay * this.as)];
            for (int i = 0; i < this.an; i++) {
                for (int i2 = 0; i2 < this.ad; i2++) {
                    iArr[((this.ag + i) * this.ay) + (this.aa + i2)] = this.af[(this.ad * i) + i2];
                }
            }
            this.af = iArr;
            this.ad = this.ay;
            this.an = this.as;
            this.aa = 0;
            this.ag = 0;
        }
    }

    public void an() {
        if (this.ad != this.ay || this.an != this.as) {
            int[] iArr = new int[(this.ay * this.as)];
            for (int i = 0; i < this.an; i++) {
                for (int i2 = 0; i2 < this.ad; i2++) {
                    iArr[((this.ag + i) * this.ay) + (this.aa + i2)] = this.af[(this.ad * i) + i2];
                }
            }
            this.af = iArr;
            this.ad = this.ay;
            this.an = this.as;
            this.aa = 0;
            this.ag = 0;
        }
    }

    public void aw() {
        if (this.ad != this.ay || this.an != this.as) {
            int[] iArr = new int[(this.ay * this.as)];
            for (int i = 0; i < this.an; i++) {
                for (int i2 = 0; i2 < this.ad; i2++) {
                    iArr[((this.ag + i) * this.ay) + (this.aa + i2)] = this.af[(this.ad * i) + i2];
                }
            }
            this.af = iArr;
            this.ad = this.ay;
            this.an = this.as;
            this.aa = 0;
            this.ag = 0;
        }
    }

    public void aa(int i) {
        if (this.ad != this.ay || this.an != this.as) {
            int i2;
            int i3;
            int i4;
            if (i > this.aa) {
                i2 = this.aa;
            } else {
                i2 = i;
            }
            if ((this.aa + i) + this.ad > this.ay) {
                i3 = (this.ay - this.aa) - this.ad;
            } else {
                i3 = i;
            }
            if (i > this.ag) {
                i4 = this.ag;
            } else {
                i4 = i;
            }
            if ((this.ag + i) + this.an > this.as) {
                i = (this.as - this.ag) - this.an;
            }
            int i5 = (this.ad + i2) + i3;
            int i6 = (this.an + i4) + i;
            int[] iArr = new int[(i5 * i6)];
            for (i3 = 0; i3 < this.an; i3++) {
                for (int i7 = 0; i7 < this.ad; i7++) {
                    iArr[((i3 + i4) * i5) + (i7 + i2)] = this.af[(this.ad * i3) + i7];
                }
            }
            this.af = iArr;
            this.ad = i5;
            this.an = i6;
            this.aa -= i2;
            this.ag -= i4;
        }
    }

    public void ah(int i) {
        if (this.ad != this.ay || this.an != this.as) {
            int i2;
            int i3;
            int i4;
            if (i > this.aa) {
                i2 = this.aa;
            } else {
                i2 = i;
            }
            if ((this.aa + i) + this.ad > this.ay) {
                i3 = (this.ay - this.aa) - this.ad;
            } else {
                i3 = i;
            }
            if (i > this.ag) {
                i4 = this.ag;
            } else {
                i4 = i;
            }
            if ((this.ag + i) + this.an > this.as) {
                i = (this.as - this.ag) - this.an;
            }
            int i5 = (this.ad + i2) + i3;
            int i6 = (this.an + i4) + i;
            int[] iArr = new int[(i5 * i6)];
            for (i3 = 0; i3 < this.an; i3++) {
                for (int i7 = 0; i7 < this.ad; i7++) {
                    iArr[((i3 + i4) * i5) + (i7 + i2)] = this.af[(this.ad * i3) + i7];
                }
            }
            this.af = iArr;
            this.ad = i5;
            this.an = i6;
            this.aa -= i2;
            this.ag -= i4;
        }
    }

    public void ak(int i) {
        if (this.ad != this.ay || this.an != this.as) {
            int i2;
            int i3;
            int i4;
            if (i > this.aa) {
                i2 = this.aa;
            } else {
                i2 = i;
            }
            if ((this.aa + i) + this.ad > this.ay) {
                i3 = (this.ay - this.aa) - this.ad;
            } else {
                i3 = i;
            }
            if (i > this.ag) {
                i4 = this.ag;
            } else {
                i4 = i;
            }
            if ((this.ag + i) + this.an > this.as) {
                i = (this.as - this.ag) - this.an;
            }
            int i5 = (this.ad + i2) + i3;
            int i6 = (this.an + i4) + i;
            int[] iArr = new int[(i5 * i6)];
            for (i3 = 0; i3 < this.an; i3++) {
                for (int i7 = 0; i7 < this.ad; i7++) {
                    iArr[((i3 + i4) * i5) + (i7 + i2)] = this.af[(this.ad * i3) + i7];
                }
            }
            this.af = iArr;
            this.ad = i5;
            this.an = i6;
            this.aa -= i2;
            this.ag -= i4;
        }
    }

    public void az(int i) {
        if (this.ad != this.ay || this.an != this.as) {
            int i2;
            int i3;
            int i4;
            if (i > this.aa) {
                i2 = this.aa;
            } else {
                i2 = i;
            }
            if ((this.aa + i) + this.ad > this.ay) {
                i3 = (this.ay - this.aa) - this.ad;
            } else {
                i3 = i;
            }
            if (i > this.ag) {
                i4 = this.ag;
            } else {
                i4 = i;
            }
            if ((this.ag + i) + this.an > this.as) {
                i = (this.as - this.ag) - this.an;
            }
            int i5 = (this.ad + i2) + i3;
            int i6 = (this.an + i4) + i;
            int[] iArr = new int[(i5 * i6)];
            for (i3 = 0; i3 < this.an; i3++) {
                for (int i7 = 0; i7 < this.ad; i7++) {
                    iArr[((i3 + i4) * i5) + (i7 + i2)] = this.af[(this.ad * i3) + i7];
                }
            }
            this.af = iArr;
            this.ad = i5;
            this.an = i6;
            this.aa -= i2;
            this.ag -= i4;
        }
    }

    public void ag() {
        int i = 0;
        int[] iArr = new int[(this.ad * this.an)];
        int i2 = 0;
        while (i < this.an) {
            int i3 = this.ad - 1;
            while (i3 >= 0) {
                int i4 = i2 + 1;
                iArr[i2] = this.af[(this.ad * i) + i3];
                i3--;
                i2 = i4;
            }
            i++;
        }
        this.af = iArr;
        this.aa = (this.ay - this.ad) - this.aa;
    }

    public void ao() {
        int i = 0;
        int[] iArr = new int[(this.ad * this.an)];
        int i2 = 0;
        while (i < this.an) {
            int i3 = this.ad - 1;
            while (i3 >= 0) {
                int i4 = i2 + 1;
                iArr[i2] = this.af[(this.ad * i) + i3];
                i3--;
                i2 = i4;
            }
            i++;
        }
        this.af = iArr;
        this.aa = (this.ay - this.ad) - this.aa;
    }

    public void ax() {
        int i = 0;
        int[] iArr = new int[(this.ad * this.an)];
        int i2 = 0;
        while (i < this.an) {
            int i3 = this.ad - 1;
            while (i3 >= 0) {
                int i4 = i2 + 1;
                iArr[i2] = this.af[(this.ad * i) + i3];
                i3--;
                i2 = i4;
            }
            i++;
        }
        this.af = iArr;
        this.aa = (this.ay - this.ad) - this.aa;
    }

    public void ay() {
        int[] iArr = new int[(this.ad * this.an)];
        int i = this.an - 1;
        int i2 = 0;
        while (i >= 0) {
            int i3 = i2;
            i2 = 0;
            while (i2 < this.ad) {
                int i4 = i3 + 1;
                iArr[i3] = this.af[(this.ad * i) + i2];
                i2++;
                i3 = i4;
            }
            i--;
            i2 = i3;
        }
        this.af = iArr;
        this.ag = (this.as - this.an) - this.ag;
    }

    public void as(int i) {
        int[] iArr = new int[(this.ad * this.an)];
        int i2 = 0;
        for (int i3 = 0; i3 < this.an; i3++) {
            int i4 = 0;
            while (i4 < this.ad) {
                int i5;
                int i6 = this.af[i2];
                if (i6 == 0) {
                    if (i4 > 0 && this.af[i2 - 1] != 0) {
                        i5 = i;
                        i6 = i2 + 1;
                        iArr[i2] = i5;
                        i4++;
                        i2 = i6;
                    } else if (i3 > 0 && this.af[i2 - this.ad] != 0) {
                        i5 = i;
                        i6 = i2 + 1;
                        iArr[i2] = i5;
                        i4++;
                        i2 = i6;
                    } else if (i4 < this.ad - 1 && this.af[i2 + 1] != 0) {
                        i5 = i;
                        i6 = i2 + 1;
                        iArr[i2] = i5;
                        i4++;
                        i2 = i6;
                    } else if (i3 < this.an - 1 && this.af[this.ad + i2] != 0) {
                        i5 = i;
                        i6 = i2 + 1;
                        iArr[i2] = i5;
                        i4++;
                        i2 = i6;
                    }
                }
                i5 = i6;
                i6 = i2 + 1;
                iArr[i2] = i5;
                i4++;
                i2 = i6;
            }
        }
        this.af = iArr;
    }

    public void au(int i) {
        int[] iArr = new int[(this.ad * this.an)];
        int i2 = 0;
        for (int i3 = 0; i3 < this.an; i3++) {
            int i4 = 0;
            while (i4 < this.ad) {
                int i5;
                int i6 = this.af[i2];
                if (i6 == 0) {
                    if (i4 > 0 && this.af[i2 - 1] != 0) {
                        i5 = i;
                        i6 = i2 + 1;
                        iArr[i2] = i5;
                        i4++;
                        i2 = i6;
                    } else if (i3 > 0 && this.af[i2 - this.ad] != 0) {
                        i5 = i;
                        i6 = i2 + 1;
                        iArr[i2] = i5;
                        i4++;
                        i2 = i6;
                    } else if (i4 < this.ad - 1 && this.af[i2 + 1] != 0) {
                        i5 = i;
                        i6 = i2 + 1;
                        iArr[i2] = i5;
                        i4++;
                        i2 = i6;
                    } else if (i3 < this.an - 1 && this.af[this.ad + i2] != 0) {
                        i5 = i;
                        i6 = i2 + 1;
                        iArr[i2] = i5;
                        i4++;
                        i2 = i6;
                    }
                }
                i5 = i6;
                i6 = i2 + 1;
                iArr[i2] = i5;
                i4++;
                i2 = i6;
            }
        }
        this.af = iArr;
    }

    public void ar(int i) {
        for (int i2 = this.an - 1; i2 > 0; i2--) {
            int i3 = i2 * this.ad;
            int i4 = this.ad - 1;
            while (i4 > 0) {
                if (this.af[i4 + i3] == 0 && this.af[((i4 + i3) - 1) - this.ad] != 0) {
                    this.af[i4 + i3] = i;
                }
                i4--;
            }
        }
    }
}
