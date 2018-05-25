package p000;

public final class gd extends kq {
    public int aa;
    public int[] ad;
    public byte[] af;
    public int ag;
    public int an;
    public int ar;
    public int as;
    public int ay;

    gd() {
    }

    public void aa() {
        if (this.an != this.as || this.aa != this.ar) {
            byte[] bArr = new byte[(this.as * this.ar)];
            int i = 0;
            for (int i2 = 0; i2 < this.aa; i2++) {
                int i3 = 0;
                while (i3 < this.an) {
                    int i4 = ((this.ay + i2) * this.as) + (this.ag + i3);
                    int i5 = i + 1;
                    bArr[i4] = this.af[i];
                    i3++;
                    i = i5;
                }
            }
            this.af = bArr;
            this.an = this.as;
            this.aa = this.ar;
            this.ag = 0;
            this.ay = 0;
        }
    }

    public void af() {
        if (this.an != this.as || this.aa != this.ar) {
            byte[] bArr = new byte[(this.as * this.ar)];
            int i = 0;
            for (int i2 = 0; i2 < this.aa; i2++) {
                int i3 = 0;
                while (i3 < this.an) {
                    int i4 = ((this.ay + i2) * this.as) + (this.ag + i3);
                    int i5 = i + 1;
                    bArr[i4] = this.af[i];
                    i3++;
                    i = i5;
                }
            }
            this.af = bArr;
            this.an = this.as;
            this.aa = this.ar;
            this.ag = 0;
            this.ay = 0;
        }
    }

    public void an() {
        if (this.an != this.as || this.aa != this.ar) {
            byte[] bArr = new byte[(this.as * this.ar)];
            int i = 0;
            for (int i2 = 0; i2 < this.aa; i2++) {
                int i3 = 0;
                while (i3 < this.an) {
                    int i4 = ((this.ay + i2) * this.as) + (this.ag + i3);
                    int i5 = i + 1;
                    bArr[i4] = this.af[i];
                    i3++;
                    i = i5;
                }
            }
            this.af = bArr;
            this.an = this.as;
            this.aa = this.ar;
            this.ag = 0;
            this.ay = 0;
        }
    }

    public void ad(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.ad.length; i4++) {
            int i5 = ((this.ad[i4] >> 16) & 255) + i;
            if (i5 < 0) {
                i5 = 0;
            } else if (i5 > 255) {
                i5 = 255;
            }
            int i6 = ((this.ad[i4] >> 8) & 255) + i2;
            if (i6 < 0) {
                i6 = 0;
            } else if (i6 > 255) {
                i6 = 255;
            }
            int i7 = (this.ad[i4] & 255) + i3;
            if (i7 < 0) {
                i7 = 0;
            } else if (i7 > 255) {
                i7 = 255;
            }
            this.ad[i4] = ((i5 << 16) + (i6 << 8)) + i7;
        }
    }

    public void ag(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.ad.length; i4++) {
            int i5 = ((this.ad[i4] >> 16) & 255) + i;
            if (i5 < 0) {
                i5 = 0;
            } else if (i5 > 255) {
                i5 = 255;
            }
            int i6 = ((this.ad[i4] >> 8) & 255) + i2;
            if (i6 < 0) {
                i6 = 0;
            } else if (i6 > 255) {
                i6 = 255;
            }
            int i7 = (this.ad[i4] & 255) + i3;
            if (i7 < 0) {
                i7 = 0;
            } else if (i7 > 255) {
                i7 = 255;
            }
            this.ad[i4] = ((i5 << 16) + (i6 << 8)) + i7;
        }
    }

    public void ay(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.ad.length; i4++) {
            int i5 = ((this.ad[i4] >> 16) & 255) + i;
            if (i5 < 0) {
                i5 = 0;
            } else if (i5 > 255) {
                i5 = 255;
            }
            int i6 = ((this.ad[i4] >> 8) & 255) + i2;
            if (i6 < 0) {
                i6 = 0;
            } else if (i6 > 255) {
                i6 = 255;
            }
            int i7 = (this.ad[i4] & 255) + i3;
            if (i7 < 0) {
                i7 = 0;
            } else if (i7 > 255) {
                i7 = 255;
            }
            this.ad[i4] = ((i5 << 16) + (i6 << 8)) + i7;
        }
    }
}
