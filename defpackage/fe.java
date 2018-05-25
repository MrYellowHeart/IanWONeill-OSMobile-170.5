package p000;

public class fe {
    int aa = (fp.aa(24) + 1);
    int ad = fp.aa(24);
    int af = fp.aa(16);
    int ag = (fp.aa(6) + 1);
    int an = fp.aa(24);
    int[] as;
    int ay = fp.aa(8);

    fe() {
        int i = 0;
        int[] iArr = new int[this.ag];
        for (int i2 = 0; i2 < this.ag; i2++) {
            int i3;
            int aa = fp.aa(3);
            if (fp.an() != 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (i3 != 0) {
                i3 = fp.aa(5);
            } else {
                i3 = 0;
            }
            iArr[i2] = (i3 << 3) | aa;
        }
        this.as = new int[(this.ag * 8)];
        while (i < this.ag * 8) {
            this.as[i] = (iArr[i >> 3] & (1 << (i & 7))) != 0 ? fp.aa(8) : -1;
            i++;
        }
    }

    void aa(float[] fArr, int i, boolean z) {
        int i2;
        for (i2 = 0; i2 < i; i2++) {
            fArr[i2] = 0.0f;
        }
        if (!z) {
            int i3 = fp.am[this.ay].af;
            int i4 = (this.an - this.ad) / this.aa;
            int[] iArr = new int[i4];
            for (int i5 = 0; i5 < 8; i5++) {
                int i6 = 0;
                while (i6 < i4) {
                    int an;
                    if (i5 == 0) {
                        an = fp.am[this.ay].an();
                        for (i2 = i3 - 1; i2 >= 0; i2--) {
                            if (i6 + i2 < i4) {
                                iArr[i6 + i2] = an % this.ag;
                            }
                            an /= this.ag;
                        }
                    }
                    int i7 = 0;
                    while (i7 < i3) {
                        i2 = this.as[(iArr[i6] * 8) + i5];
                        if (i2 >= 0) {
                            int i8 = this.ad + (this.aa * i6);
                            fk fkVar = fp.am[i2];
                            int i9;
                            float[] aa;
                            if (this.af == 0) {
                                i9 = this.aa / fkVar.af;
                                for (an = 0; an < i9; an++) {
                                    aa = fkVar.aa();
                                    for (i2 = 0; i2 < fkVar.af; i2++) {
                                        int i10 = (i8 + an) + (i2 * i9);
                                        fArr[i10] = fArr[i10] + aa[i2];
                                    }
                                }
                            } else {
                                i2 = 0;
                                while (i2 < this.aa) {
                                    aa = fkVar.aa();
                                    an = 0;
                                    while (an < fkVar.af) {
                                        i9 = i8 + i2;
                                        fArr[i9] = fArr[i9] + aa[an];
                                        an++;
                                        i2++;
                                    }
                                }
                            }
                        }
                        i2 = i6 + 1;
                        if (i2 >= i4) {
                            break;
                        }
                        i7++;
                        i6 = i2;
                    }
                    i2 = i6;
                    i6 = i2;
                }
            }
        }
    }

    void ad(float[] fArr, int i, boolean z) {
        int i2;
        for (i2 = 0; i2 < i; i2++) {
            fArr[i2] = 0.0f;
        }
        if (!z) {
            int i3 = fp.am[this.ay].af;
            int i4 = (this.an - this.ad) / this.aa;
            int[] iArr = new int[i4];
            for (int i5 = 0; i5 < 8; i5++) {
                int i6 = 0;
                while (i6 < i4) {
                    int an;
                    if (i5 == 0) {
                        an = fp.am[this.ay].an();
                        for (i2 = i3 - 1; i2 >= 0; i2--) {
                            if (i6 + i2 < i4) {
                                iArr[i6 + i2] = an % this.ag;
                            }
                            an /= this.ag;
                        }
                    }
                    i2 = i6;
                    for (int i7 = 0; i7 < i3; i7++) {
                        an = this.as[(iArr[i2] * 8) + i5];
                        if (an >= 0) {
                            int i8 = this.ad + (this.aa * i2);
                            fk fkVar = fp.am[an];
                            int i9;
                            float[] aa;
                            if (this.af == 0) {
                                i9 = this.aa / fkVar.af;
                                for (i6 = 0; i6 < i9; i6++) {
                                    aa = fkVar.aa();
                                    for (an = 0; an < fkVar.af; an++) {
                                        int i10 = (i8 + i6) + (an * i9);
                                        fArr[i10] = fArr[i10] + aa[an];
                                    }
                                }
                            } else {
                                an = 0;
                                while (an < this.aa) {
                                    aa = fkVar.aa();
                                    i6 = 0;
                                    while (i6 < fkVar.af) {
                                        i9 = i8 + an;
                                        fArr[i9] = fArr[i9] + aa[i6];
                                        i6++;
                                        an++;
                                    }
                                }
                            }
                        }
                        i2++;
                        if (i2 >= i4) {
                            break;
                        }
                    }
                    i6 = i2;
                }
            }
        }
    }

    void af(float[] fArr, int i, boolean z) {
        int i2;
        for (i2 = 0; i2 < i; i2++) {
            fArr[i2] = 0.0f;
        }
        if (!z) {
            int i3 = fp.am[this.ay].af;
            int i4 = (this.an - this.ad) / this.aa;
            int[] iArr = new int[i4];
            for (int i5 = 0; i5 < 8; i5++) {
                int i6 = 0;
                while (i6 < i4) {
                    int an;
                    if (i5 == 0) {
                        an = fp.am[this.ay].an();
                        for (i2 = i3 - 1; i2 >= 0; i2--) {
                            if (i6 + i2 < i4) {
                                iArr[i6 + i2] = an % this.ag;
                            }
                            an /= this.ag;
                        }
                    }
                    int i7 = 0;
                    while (i7 < i3) {
                        i2 = this.as[(iArr[i6] * 8) + i5];
                        if (i2 >= 0) {
                            int i8 = this.ad + (this.aa * i6);
                            fk fkVar = fp.am[i2];
                            int i9;
                            float[] aa;
                            if (this.af == 0) {
                                i9 = this.aa / fkVar.af;
                                for (an = 0; an < i9; an++) {
                                    aa = fkVar.aa();
                                    for (i2 = 0; i2 < fkVar.af; i2++) {
                                        int i10 = (i8 + an) + (i2 * i9);
                                        fArr[i10] = fArr[i10] + aa[i2];
                                    }
                                }
                            } else {
                                i2 = 0;
                                while (i2 < this.aa) {
                                    aa = fkVar.aa();
                                    an = 0;
                                    while (an < fkVar.af) {
                                        i9 = i8 + i2;
                                        fArr[i9] = fArr[i9] + aa[an];
                                        an++;
                                        i2++;
                                    }
                                }
                            }
                        }
                        i2 = i6 + 1;
                        if (i2 >= i4) {
                            break;
                        }
                        i7++;
                        i6 = i2;
                    }
                    i2 = i6;
                    i6 = i2;
                }
            }
        }
    }

    void ag(float[] fArr, int i, boolean z) {
        int i2;
        for (i2 = 0; i2 < i; i2++) {
            fArr[i2] = 0.0f;
        }
        if (!z) {
            int i3 = fp.am[this.ay].af;
            int i4 = (this.an - this.ad) / this.aa;
            int[] iArr = new int[i4];
            for (int i5 = 0; i5 < 8; i5++) {
                int i6 = 0;
                while (i6 < i4) {
                    int an;
                    if (i5 == 0) {
                        an = fp.am[this.ay].an();
                        for (i2 = i3 - 1; i2 >= 0; i2--) {
                            if (i6 + i2 < i4) {
                                iArr[i6 + i2] = an % this.ag;
                            }
                            an /= this.ag;
                        }
                    }
                    i2 = i6;
                    for (int i7 = 0; i7 < i3; i7++) {
                        i6 = this.as[(iArr[i2] * 8) + i5];
                        if (i6 >= 0) {
                            int i8 = this.ad + (this.aa * i2);
                            fk fkVar = fp.am[i6];
                            int i9;
                            float[] aa;
                            if (this.af == 0) {
                                i9 = this.aa / fkVar.af;
                                for (an = 0; an < i9; an++) {
                                    aa = fkVar.aa();
                                    for (i6 = 0; i6 < fkVar.af; i6++) {
                                        int i10 = (i8 + an) + (i6 * i9);
                                        fArr[i10] = fArr[i10] + aa[i6];
                                    }
                                }
                            } else {
                                i6 = 0;
                                while (i6 < this.aa) {
                                    aa = fkVar.aa();
                                    an = 0;
                                    while (an < fkVar.af) {
                                        i9 = i8 + i6;
                                        fArr[i9] = fArr[i9] + aa[an];
                                        an++;
                                        i6++;
                                    }
                                }
                            }
                        }
                        i2++;
                        if (i2 >= i4) {
                            break;
                        }
                    }
                    i6 = i2;
                }
            }
        }
    }

    void an(float[] fArr, int i, boolean z) {
        int i2;
        for (i2 = 0; i2 < i; i2++) {
            fArr[i2] = 0.0f;
        }
        if (!z) {
            int i3 = fp.am[this.ay].af;
            int i4 = (this.an - this.ad) / this.aa;
            int[] iArr = new int[i4];
            for (int i5 = 0; i5 < 8; i5++) {
                int i6 = 0;
                while (i6 < i4) {
                    int an;
                    if (i5 == 0) {
                        an = fp.am[this.ay].an();
                        for (i2 = i3 - 1; i2 >= 0; i2--) {
                            if (i6 + i2 < i4) {
                                iArr[i6 + i2] = an % this.ag;
                            }
                            an /= this.ag;
                        }
                    }
                    i2 = i6;
                    for (int i7 = 0; i7 < i3; i7++) {
                        an = this.as[(iArr[i2] * 8) + i5];
                        if (an >= 0) {
                            int i8 = this.ad + (this.aa * i2);
                            fk fkVar = fp.am[an];
                            int i9;
                            float[] aa;
                            if (this.af == 0) {
                                i9 = this.aa / fkVar.af;
                                for (i6 = 0; i6 < i9; i6++) {
                                    aa = fkVar.aa();
                                    for (an = 0; an < fkVar.af; an++) {
                                        int i10 = (i8 + i6) + (an * i9);
                                        fArr[i10] = fArr[i10] + aa[an];
                                    }
                                }
                            } else {
                                an = 0;
                                while (an < this.aa) {
                                    aa = fkVar.aa();
                                    i6 = 0;
                                    while (i6 < fkVar.af) {
                                        i9 = i8 + an;
                                        fArr[i9] = fArr[i9] + aa[i6];
                                        i6++;
                                        an++;
                                    }
                                }
                            }
                        }
                        i2++;
                        if (i2 >= i4) {
                            break;
                        }
                    }
                    i6 = i2;
                }
            }
        }
    }
}
