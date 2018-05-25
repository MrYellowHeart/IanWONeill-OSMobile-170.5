package p000;

public class cj extends bi {
    static final byte ay = (byte) 0;
    int[] af;

    public cj(int[] iArr, int i, int i2) {
        try {
            aa(iArr, i, i2, 1462363449);
        } catch (Throwable e) {
            throw ba.ad(e, "cj.<init>(" + ')');
        }
    }

    public void ae() {
    }

    public void af(int i) {
    }

    public void aq() {
    }

    public final void aa(int[] iArr, int i, int i2, int i3) {
        try {
            this.af = iArr;
            this.ak = -145201409 * i;
            this.ao = 359809005 * i2;
            bf(0, 0, i, i2, (byte) 13);
            bv(-1691347077);
        } catch (Throwable e) {
            throw ba.ad(e, "cj.aa(" + ')');
        }
    }

    public final void ao(int[] iArr, int i, int i2) {
        this.af = iArr;
        this.ak = -1442418282 * i;
        this.ao = 1360881458 * i2;
        bf(0, 0, i, i2, (byte) -51);
        bv(-1419248460);
    }

    public final void ax(int[] iArr, int i, int i2) {
        this.af = iArr;
        this.ak = -145201409 * i;
        this.ao = 359809005 * i2;
        bf(0, 0, i, i2, (byte) -67);
        bv(-1402488977);
    }

    final void ag(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        int i13 = i5 - i4;
        int i14 = i2 - i;
        int i15 = i6 - i4;
        int i16 = i3 - i;
        int i17 = i8 - i7;
        int i18 = i9 - i7;
        if (i3 != i2) {
            try {
                int i19 = ((i6 - i5) << 14) / (i3 - i2);
            } catch (Throwable e) {
                throw ba.ad(e, "cj.ag(" + ')');
            }
        }
        i19 = 0;
        if (i != i2) {
            i11 = (i13 << 14) / i14;
        } else {
            i11 = 0;
        }
        if (i != i3) {
            i12 = (i15 << 14) / i16;
        } else {
            i12 = 0;
        }
        int i20 = (i13 * i16) - (i14 * i15);
        if (i20 != 0) {
            int i21 = (((i16 * i17) - (i14 * i18)) << 8) / i20;
            int i22 = (((i13 * i18) - (i17 * i15)) << 8) / i20;
            int i23;
            int i24;
            int i25;
            int i26;
            int i27;
            int i28;
            if (i > i2 || i > i3) {
                if (i2 <= i3) {
                    if (i2 < -1759402563 * this.bv) {
                        if (i3 > this.bv * -1759402563) {
                            i13 = -1759402563 * this.bv;
                        } else {
                            i13 = i3;
                        }
                        if (i > this.bv * -1759402563) {
                            i = this.bv * -1759402563;
                        }
                        i23 = ((i8 << 8) - (i5 * i21)) + i21;
                        if (i13 < i) {
                            i20 = i5 << 14;
                            if (i2 < 0) {
                                i24 = i20 - (i11 * i2);
                                i20 -= i2 * i19;
                                i23 -= i2 * i22;
                                i2 = 0;
                            } else {
                                i24 = i20;
                            }
                            i25 = i6 << 14;
                            if (i13 < 0) {
                                i25 -= i13 * i12;
                                i13 = 0;
                            }
                            if ((i2 == i13 || i11 >= i19) && (i13 != i2 || i11 <= i12)) {
                                i26 = i - i13;
                                i13 -= i2;
                                i14 = this.be[i2];
                                i27 = i20;
                                i20 = i13;
                                while (true) {
                                    i28 = i20 - 1;
                                    if (i28 < 0) {
                                        break;
                                    }
                                    ay(this.af, i14, 0, 0, i27 >> 14, i24 >> 14, i23, i21, -70527980);
                                    i24 += i11;
                                    i23 += i22;
                                    i14 += -1741252353 * this.ak;
                                    i27 += i19;
                                    i20 = i28;
                                }
                                i20 = i26;
                                while (true) {
                                    i26 = i20 - 1;
                                    if (i26 >= 0) {
                                        ay(this.af, i14, 0, 0, i25 >> 14, i24 >> 14, i23, i21, 152729900);
                                        i23 += i22;
                                        i14 += -1741252353 * this.ak;
                                        i25 += i12;
                                        i24 += i11;
                                        i20 = i26;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i26 = i - i13;
                            i13 -= i2;
                            i14 = this.be[i2];
                            i27 = i20;
                            i20 = i13;
                            while (true) {
                                i28 = i20 - 1;
                                if (i28 < 0) {
                                    break;
                                }
                                ay(this.af, i14, 0, 0, i24 >> 14, i27 >> 14, i23, i21, -904643055);
                                i24 += i11;
                                i23 += i22;
                                i14 += this.ak * -1741252353;
                                i27 += i19;
                                i20 = i28;
                            }
                            i20 = i26;
                            while (true) {
                                i26 = i20 - 1;
                                if (i26 >= 0) {
                                    ay(this.af, i14, 0, 0, i24 >> 14, i25 >> 14, i23, i21, 148235902);
                                    i25 += i12;
                                    i23 += i22;
                                    i14 += this.ak * -1741252353;
                                    i24 += i11;
                                    i20 = i26;
                                } else {
                                    return;
                                }
                            }
                        }
                        i14 = i5 << 14;
                        if (i2 < 0) {
                            i20 = i14 - (i2 * i11);
                            i25 = i14 - (i2 * i19);
                            i23 -= i22 * i2;
                            i2 = 0;
                        } else {
                            i20 = i14;
                            i25 = i14;
                        }
                        i24 = i4 << 14;
                        if (i < 0) {
                            i24 -= i12 * i;
                            i = 0;
                        }
                        if (i11 < i19) {
                            i26 = i13 - i;
                            i13 = i - i2;
                            i14 = this.be[i2];
                            i27 = i20;
                            i20 = i13;
                            while (true) {
                                i28 = i20 - 1;
                                if (i28 < 0) {
                                    break;
                                }
                                ay(this.af, i14, 0, 0, i27 >> 14, i25 >> 14, i23, i21, 403968514);
                                i25 += i19;
                                i23 += i22;
                                i14 += -1741252353 * this.ak;
                                i27 += i11;
                                i20 = i28;
                            }
                            i20 = i26;
                            while (true) {
                                i26 = i20 - 1;
                                if (i26 >= 0) {
                                    ay(this.af, i14, 0, 0, i24 >> 14, i25 >> 14, i23, i21, -916753724);
                                    i23 += i22;
                                    i14 += -1741252353 * this.ak;
                                    i25 += i19;
                                    i24 += i12;
                                    i20 = i26;
                                } else {
                                    return;
                                }
                            }
                        }
                        i26 = i13 - i;
                        i13 = i - i2;
                        i14 = this.be[i2];
                        i27 = i20;
                        i20 = i13;
                        while (true) {
                            i28 = i20 - 1;
                            if (i28 < 0) {
                                break;
                            }
                            ay(this.af, i14, 0, 0, i25 >> 14, i27 >> 14, i23, i21, 1353129087);
                            i25 += i19;
                            i23 += i22;
                            i14 += -1741252353 * this.ak;
                            i27 += i11;
                            i20 = i28;
                        }
                        i20 = i26;
                        while (true) {
                            i26 = i20 - 1;
                            if (i26 >= 0) {
                                ay(this.af, i14, 0, 0, i25 >> 14, i24 >> 14, i23, i21, -1048162916);
                                i24 += i12;
                                i23 += i22;
                                i14 += this.ak * -1741252353;
                                i25 += i19;
                                i20 = i26;
                            } else {
                                return;
                            }
                        }
                    }
                } else if (i3 < this.bv * -1759402563) {
                    if (i > -1759402563 * this.bv) {
                        i15 = this.bv * -1759402563;
                    } else {
                        i15 = i;
                    }
                    if (i2 > -1759402563 * this.bv) {
                        i2 = this.bv * -1759402563;
                    }
                    i20 = ((i9 << 8) - (i6 * i21)) + i21;
                    if (i15 < i2) {
                        i13 = i6 << 14;
                        if (i3 < 0) {
                            i14 = i13 - (i19 * i3);
                            i13 -= i3 * i12;
                            i20 -= i22 * i3;
                            i3 = 0;
                        } else {
                            i14 = i13;
                        }
                        i24 = i4 << 14;
                        if (i15 < 0) {
                            i24 -= i15 * i11;
                            i15 = 0;
                        }
                        if (i19 < i12) {
                            i26 = i2 - i15;
                            i16 = i15 - i3;
                            i23 = i20;
                            i27 = i13;
                            i25 = i14;
                            i14 = this.be[i3];
                            i20 = i16;
                            while (true) {
                                i28 = i20 - 1;
                                if (i28 < 0) {
                                    break;
                                }
                                ay(this.af, i14, 0, 0, i25 >> 14, i27 >> 14, i23, i21, -1119263885);
                                i25 += i19;
                                i23 += i22;
                                i14 += this.ak * -1741252353;
                                i27 += i12;
                                i20 = i28;
                            }
                            i12 = i25;
                            i20 = i26;
                            i25 = i24;
                            while (true) {
                                i24 = i20 - 1;
                                if (i24 >= 0) {
                                    ay(this.af, i14, 0, 0, i12 >> 14, i25 >> 14, i23, i21, 387050416);
                                    i23 += i22;
                                    i14 += this.ak * -1741252353;
                                    i12 += i19;
                                    i25 += i11;
                                    i20 = i24;
                                } else {
                                    return;
                                }
                            }
                        }
                        i26 = i2 - i15;
                        i16 = i15 - i3;
                        i23 = i20;
                        i27 = i13;
                        i25 = i14;
                        i14 = this.be[i3];
                        i20 = i16;
                        while (true) {
                            i28 = i20 - 1;
                            if (i28 < 0) {
                                break;
                            }
                            ay(this.af, i14, 0, 0, i27 >> 14, i25 >> 14, i23, i21, -1266191086);
                            i25 += i19;
                            i23 += i22;
                            i14 += -1741252353 * this.ak;
                            i27 += i12;
                            i20 = i28;
                        }
                        i12 = i25;
                        i20 = i26;
                        while (true) {
                            i25 = i20 - 1;
                            if (i25 >= 0) {
                                ay(this.af, i14, 0, 0, i24 >> 14, i12 >> 14, i23, i21, -753350603);
                                i24 += i11;
                                i23 += i22;
                                i14 += this.ak * -1741252353;
                                i12 += i19;
                                i20 = i25;
                            } else {
                                return;
                            }
                        }
                    }
                    i25 = i6 << 14;
                    if (i3 < 0) {
                        i13 = i25 - (i3 * i19);
                        i25 -= i3 * i12;
                        i23 = i20 - (i22 * i3);
                        i3 = 0;
                        i20 = i13;
                    } else {
                        i23 = i20;
                        i20 = i25;
                    }
                    i24 = i5 << 14;
                    if (i2 < 0) {
                        i24 -= i2 * i11;
                        i2 = 0;
                    }
                    if (i19 < i12) {
                        i26 = i15 - i2;
                        i13 = i2 - i3;
                        i14 = this.be[i3];
                        i27 = i20;
                        i20 = i13;
                        while (true) {
                            i28 = i20 - 1;
                            if (i28 < 0) {
                                break;
                            }
                            ay(this.af, i14, 0, 0, i27 >> 14, i25 >> 14, i23, i21, -664538634);
                            i25 += i12;
                            i23 += i22;
                            i14 += this.ak * -1741252353;
                            i27 += i19;
                            i20 = i28;
                        }
                        i20 = i26;
                        while (true) {
                            i26 = i20 - 1;
                            if (i26 >= 0) {
                                ay(this.af, i14, 0, 0, i24 >> 14, i25 >> 14, i23, i21, -1489325526);
                                i24 += i11;
                                i23 += i22;
                                i14 += -1741252353 * this.ak;
                                i25 += i12;
                                i20 = i26;
                            } else {
                                return;
                            }
                        }
                    }
                    i26 = i15 - i2;
                    i13 = i2 - i3;
                    i14 = this.be[i3];
                    i27 = i20;
                    i20 = i13;
                    while (true) {
                        i28 = i20 - 1;
                        if (i28 < 0) {
                            break;
                        }
                        ay(this.af, i14, 0, 0, i25 >> 14, i27 >> 14, i23, i21, -566840791);
                        i25 += i12;
                        i23 += i22;
                        i14 += -1741252353 * this.ak;
                        i27 += i19;
                        i20 = i28;
                    }
                    i20 = i26;
                    while (true) {
                        i26 = i20 - 1;
                        if (i26 >= 0) {
                            ay(this.af, i14, 0, 0, i25 >> 14, i24 >> 14, i23, i21, -980049945);
                            i23 += i22;
                            i14 += this.ak * -1741252353;
                            i25 += i12;
                            i24 += i11;
                            i20 = i26;
                        } else {
                            return;
                        }
                    }
                }
            } else if (i < -1759402563 * this.bv) {
                if (i2 > this.bv * -1759402563) {
                    i13 = -1759402563 * this.bv;
                } else {
                    i13 = i2;
                }
                if (i3 > this.bv * -1759402563) {
                    i3 = -1759402563 * this.bv;
                }
                i23 = ((i7 << 8) - (i4 * i21)) + i21;
                if (i13 < i3) {
                    i20 = i4 << 14;
                    if (i < 0) {
                        i25 = i20 - (i * i12);
                        i20 -= i * i11;
                        i23 -= i22 * i;
                        i = 0;
                    } else {
                        i25 = i20;
                    }
                    i24 = i5 << 14;
                    if (i13 < 0) {
                        i24 -= i13 * i19;
                        i13 = 0;
                    }
                    if ((i13 == i || i12 >= i11) && (i13 != i || i12 <= i19)) {
                        i26 = i3 - i13;
                        i13 -= i;
                        i14 = this.be[i];
                        i27 = i20;
                        i20 = i13;
                        while (true) {
                            i28 = i20 - 1;
                            if (i28 < 0) {
                                break;
                            }
                            ay(this.af, i14, 0, 0, i27 >> 14, i25 >> 14, i23, i21, 166621584);
                            i25 += i12;
                            i23 += i22;
                            i14 += this.ak * -1741252353;
                            i27 += i11;
                            i20 = i28;
                        }
                        i20 = i26;
                        while (true) {
                            i26 = i20 - 1;
                            if (i26 >= 0) {
                                ay(this.af, i14, 0, 0, i24 >> 14, i25 >> 14, i23, i21, -1078292781);
                                i24 += i19;
                                i23 += i22;
                                i14 += -1741252353 * this.ak;
                                i25 += i12;
                                i20 = i26;
                            } else {
                                return;
                            }
                        }
                    }
                    i26 = i3 - i13;
                    i13 -= i;
                    i14 = this.be[i];
                    i27 = i20;
                    i20 = i13;
                    while (true) {
                        i28 = i20 - 1;
                        if (i28 < 0) {
                            break;
                        }
                        ay(this.af, i14, 0, 0, i25 >> 14, i27 >> 14, i23, i21, -2107372889);
                        i25 += i12;
                        i23 += i22;
                        i14 += this.ak * -1741252353;
                        i27 += i11;
                        i20 = i28;
                    }
                    i20 = i26;
                    while (true) {
                        i26 = i20 - 1;
                        if (i26 >= 0) {
                            ay(this.af, i14, 0, 0, i25 >> 14, i24 >> 14, i23, i21, 1648024342);
                            i23 += i22;
                            i14 += -1741252353 * this.ak;
                            i25 += i12;
                            i24 += i19;
                            i20 = i26;
                        } else {
                            return;
                        }
                    }
                }
                i14 = i4 << 14;
                if (i < 0) {
                    i20 = i14 - (i12 * i);
                    i24 = i14 - (i * i11);
                    i23 -= i22 * i;
                    i = 0;
                } else {
                    i20 = i14;
                    i24 = i14;
                }
                i25 = i6 << 14;
                if (i3 < 0) {
                    i25 -= i3 * i19;
                    i3 = 0;
                }
                if ((i3 == i || i12 >= i11) && (i != i3 || i19 <= i11)) {
                    i26 = i13 - i3;
                    i13 = i3 - i;
                    i14 = this.be[i];
                    i27 = i20;
                    i20 = i13;
                    while (true) {
                        i28 = i20 - 1;
                        if (i28 < 0) {
                            break;
                        }
                        ay(this.af, i14, 0, 0, i24 >> 14, i27 >> 14, i23, i21, -971000701);
                        i24 += i11;
                        i23 += i22;
                        i14 += this.ak * -1741252353;
                        i27 += i12;
                        i20 = i28;
                    }
                    i12 = i25;
                    i20 = i26;
                    i25 = i24;
                    while (true) {
                        i24 = i20 - 1;
                        if (i24 >= 0) {
                            ay(this.af, i14, 0, 0, i25 >> 14, i12 >> 14, i23, i21, 1767927683);
                            i23 += i22;
                            i14 += this.ak * -1741252353;
                            i12 += i19;
                            i25 += i11;
                            i20 = i24;
                        } else {
                            return;
                        }
                    }
                }
                i26 = i13 - i3;
                i13 = i3 - i;
                i14 = this.be[i];
                i27 = i20;
                i20 = i13;
                while (true) {
                    i28 = i20 - 1;
                    if (i28 < 0) {
                        break;
                    }
                    ay(this.af, i14, 0, 0, i27 >> 14, i24 >> 14, i23, i21, 807429145);
                    i24 += i11;
                    i23 += i22;
                    i14 += this.ak * -1741252353;
                    i27 += i12;
                    i20 = i28;
                }
                i12 = i24;
                i20 = i26;
                while (true) {
                    i24 = i20 - 1;
                    if (i24 >= 0) {
                        ay(this.af, i14, 0, 0, i25 >> 14, i12 >> 14, i23, i21, -827905913);
                        i25 += i19;
                        i23 += i22;
                        i14 += this.ak * -1741252353;
                        i12 += i11;
                        i20 = i24;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    final void au(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int i13 = i5 - i4;
        int i14 = i2 - i;
        int i15 = i6 - i4;
        int i16 = i3 - i;
        int i17 = i8 - i7;
        int i18 = i9 - i7;
        if (i3 != i2) {
            i10 = ((i6 - i5) << 14) / (i3 - i2);
        } else {
            i10 = 0;
        }
        if (i != i2) {
            i11 = (i13 << 14) / i14;
        } else {
            i11 = 0;
        }
        if (i != i3) {
            i12 = (i15 << 14) / i16;
        } else {
            i12 = 0;
        }
        int i19 = (i13 * i16) - (i14 * i15);
        if (i19 != 0) {
            int i20 = (((i16 * i17) - (i14 * i18)) << 8) / i19;
            int i21 = (((i13 * i18) - (i17 * i15)) << 8) / i19;
            int i22;
            int i23;
            int i24;
            int i25;
            int i26;
            int i27;
            if (i > i2 || i > i3) {
                if (i2 <= i3) {
                    if (i2 < 189978707 * this.bv) {
                        if (i3 > this.bv * -1759402563) {
                            i3 = this.bv * -556564038;
                        }
                        if (i > this.bv * -11753865) {
                            i15 = this.bv * 1626047051;
                        } else {
                            i15 = i;
                        }
                        i19 = ((i8 << 8) - (i5 * i20)) + i20;
                        if (i3 < i15) {
                            i13 = i5 << 14;
                            if (i2 < 0) {
                                i14 = i13 - (i11 * i2);
                                i13 -= i2 * i10;
                                i19 -= i2 * i21;
                                i2 = 0;
                            } else {
                                i14 = i13;
                            }
                            i22 = i6 << 14;
                            if (i3 < 0) {
                                i22 -= i3 * i12;
                                i3 = 0;
                            }
                            if ((i2 == i3 || i11 >= i10) && (i3 != i2 || i11 <= i12)) {
                                i23 = i15 - i3;
                                i24 = i19;
                                i25 = i13;
                                i26 = i14;
                                i19 = i3 - i2;
                                i14 = this.be[i2];
                                while (true) {
                                    i27 = i19 - 1;
                                    if (i27 < 0) {
                                        break;
                                    }
                                    ay(this.af, i14, 0, 0, i25 >> 14, i26 >> 14, i24, i20, 552775181);
                                    i26 += i11;
                                    i24 += i21;
                                    i14 += -1741252353 * this.ak;
                                    i25 += i10;
                                    i19 = i27;
                                }
                                i19 = i23;
                                while (true) {
                                    i23 = i19 - 1;
                                    if (i23 >= 0) {
                                        ay(this.af, i14, 0, 0, i22 >> 14, i26 >> 14, i24, i20, 903717481);
                                        i22 += i12;
                                        i24 += i21;
                                        i14 += -1741252353 * this.ak;
                                        i26 += i11;
                                        i19 = i23;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i23 = i15 - i3;
                            i24 = i19;
                            i25 = i13;
                            i26 = i14;
                            i19 = i3 - i2;
                            i14 = this.be[i2];
                            while (true) {
                                i27 = i19 - 1;
                                if (i27 < 0) {
                                    break;
                                }
                                ay(this.af, i14, 0, 0, i26 >> 14, i25 >> 14, i24, i20, -506583373);
                                i26 += i11;
                                i24 += i21;
                                i14 += this.ak * -1957768570;
                                i25 += i10;
                                i19 = i27;
                            }
                            i19 = i23;
                            while (true) {
                                i23 = i19 - 1;
                                if (i23 >= 0) {
                                    ay(this.af, i14, 0, 0, i26 >> 14, i22 >> 14, i24, i20, -2129907592);
                                    i24 += i21;
                                    i14 += this.ak * -1741252353;
                                    i22 += i12;
                                    i26 += i11;
                                    i19 = i23;
                                } else {
                                    return;
                                }
                            }
                        }
                        i14 = i5 << 14;
                        if (i2 < 0) {
                            i13 = i14 - (i2 * i11);
                            i14 -= i2 * i10;
                            i19 -= i21 * i2;
                            i2 = 0;
                        } else {
                            i13 = i14;
                        }
                        i26 = i4 << 14;
                        if (i15 < 0) {
                            i26 -= i15 * i12;
                            i15 = 0;
                        }
                        if (i11 < i10) {
                            i23 = i3 - i15;
                            i16 = i15 - i2;
                            i24 = i19;
                            i25 = i13;
                            i22 = i14;
                            i14 = this.be[i2];
                            i19 = i16;
                            while (true) {
                                i27 = i19 - 1;
                                if (i27 < 0) {
                                    break;
                                }
                                ay(this.af, i14, 0, 0, i25 >> 14, i22 >> 14, i24, i20, 937405585);
                                i22 += i10;
                                i24 += i21;
                                i14 += -1741252353 * this.ak;
                                i25 += i11;
                                i19 = i27;
                            }
                            i19 = i23;
                            while (true) {
                                i23 = i19 - 1;
                                if (i23 >= 0) {
                                    ay(this.af, i14, 0, 0, i26 >> 14, i22 >> 14, i24, i20, -80744573);
                                    i26 += i12;
                                    i24 += i21;
                                    i14 += 23666123 * this.ak;
                                    i22 += i10;
                                    i19 = i23;
                                } else {
                                    return;
                                }
                            }
                        }
                        i23 = i3 - i15;
                        i16 = i15 - i2;
                        i24 = i19;
                        i25 = i13;
                        i22 = i14;
                        i14 = this.be[i2];
                        i19 = i16;
                        while (true) {
                            i27 = i19 - 1;
                            if (i27 < 0) {
                                break;
                            }
                            ay(this.af, i14, 0, 0, i22 >> 14, i25 >> 14, i24, i20, -339901426);
                            i22 += i10;
                            i24 += i21;
                            i14 += -1741252353 * this.ak;
                            i25 += i11;
                            i19 = i27;
                        }
                        i19 = i23;
                        while (true) {
                            i23 = i19 - 1;
                            if (i23 >= 0) {
                                ay(this.af, i14, 0, 0, i22 >> 14, i26 >> 14, i24, i20, -267689691);
                                i24 += i21;
                                i14 += this.ak * -1607763372;
                                i22 += i10;
                                i26 += i12;
                                i19 = i23;
                            } else {
                                return;
                            }
                        }
                    }
                } else if (i3 < this.bv * 158213387) {
                    if (i > 1236590645 * this.bv) {
                        i = this.bv * 2038860382;
                    }
                    if (i2 > -1759402563 * this.bv) {
                        i2 = this.bv * -1759402563;
                    }
                    i19 = ((i9 << 8) - (i6 * i20)) + i20;
                    if (i < i2) {
                        i13 = i6 << 14;
                        if (i3 < 0) {
                            i14 = i13 - (i10 * i3);
                            i13 -= i3 * i12;
                            i19 -= i21 * i3;
                            i3 = 0;
                        } else {
                            i14 = i13;
                        }
                        i26 = i4 << 14;
                        if (i < 0) {
                            i26 -= i11 * i;
                            i = 0;
                        }
                        if (i10 < i12) {
                            i23 = i2 - i;
                            i16 = i - i3;
                            i24 = i19;
                            i25 = i13;
                            i22 = i14;
                            i14 = this.be[i3];
                            i19 = i16;
                            while (true) {
                                i27 = i19 - 1;
                                if (i27 < 0) {
                                    break;
                                }
                                ay(this.af, i14, 0, 0, i22 >> 14, i25 >> 14, i24, i20, -18479016);
                                i22 += i10;
                                i24 += i21;
                                i14 += this.ak * -1703417886;
                                i25 += i12;
                                i19 = i27;
                            }
                            i12 = i22;
                            i19 = i23;
                            while (true) {
                                i22 = i19 - 1;
                                if (i22 >= 0) {
                                    ay(this.af, i14, 0, 0, i12 >> 14, i26 >> 14, i24, i20, 1871973656);
                                    i26 += i11;
                                    i24 += i21;
                                    i14 += this.ak * -1849017252;
                                    i12 += i10;
                                    i19 = i22;
                                } else {
                                    return;
                                }
                            }
                        }
                        i23 = i2 - i;
                        i16 = i - i3;
                        i24 = i19;
                        i25 = i13;
                        i22 = i14;
                        i14 = this.be[i3];
                        i19 = i16;
                        while (true) {
                            i27 = i19 - 1;
                            if (i27 < 0) {
                                break;
                            }
                            ay(this.af, i14, 0, 0, i25 >> 14, i22 >> 14, i24, i20, 1819672146);
                            i22 += i10;
                            i24 += i21;
                            i14 += -2123194586 * this.ak;
                            i25 += i12;
                            i19 = i27;
                        }
                        i12 = i22;
                        i19 = i23;
                        i22 = i26;
                        while (true) {
                            i26 = i19 - 1;
                            if (i26 >= 0) {
                                ay(this.af, i14, 0, 0, i22 >> 14, i12 >> 14, i24, i20, 346919709);
                                i24 += i21;
                                i14 += this.ak * -1741252353;
                                i12 += i10;
                                i22 += i11;
                                i19 = i26;
                            } else {
                                return;
                            }
                        }
                    }
                    i22 = i6 << 14;
                    if (i3 < 0) {
                        i13 = i22 - (i3 * i10);
                        i22 -= i3 * i12;
                        i24 = i19 - (i21 * i3);
                        i3 = 0;
                        i19 = i13;
                    } else {
                        i24 = i19;
                        i19 = i22;
                    }
                    i26 = i5 << 14;
                    if (i2 < 0) {
                        i26 -= i2 * i11;
                        i2 = 0;
                    }
                    if (i10 < i12) {
                        i23 = i - i2;
                        i13 = i2 - i3;
                        i14 = this.be[i3];
                        i25 = i19;
                        i19 = i13;
                        while (true) {
                            i27 = i19 - 1;
                            if (i27 < 0) {
                                break;
                            }
                            ay(this.af, i14, 0, 0, i25 >> 14, i22 >> 14, i24, i20, -1579320322);
                            i22 += i12;
                            i24 += i21;
                            i14 += this.ak * 2094236661;
                            i25 += i10;
                            i19 = i27;
                        }
                        i19 = i23;
                        while (true) {
                            i23 = i19 - 1;
                            if (i23 >= 0) {
                                ay(this.af, i14, 0, 0, i26 >> 14, i22 >> 14, i24, i20, 1072898942);
                                i26 += i11;
                                i24 += i21;
                                i14 += -715164554 * this.ak;
                                i22 += i12;
                                i19 = i23;
                            } else {
                                return;
                            }
                        }
                    }
                    i23 = i - i2;
                    i13 = i2 - i3;
                    i14 = this.be[i3];
                    i25 = i19;
                    i19 = i13;
                    while (true) {
                        i27 = i19 - 1;
                        if (i27 < 0) {
                            break;
                        }
                        ay(this.af, i14, 0, 0, i22 >> 14, i25 >> 14, i24, i20, -673433197);
                        i22 += i12;
                        i24 += i21;
                        i14 += -1200031126 * this.ak;
                        i25 += i10;
                        i19 = i27;
                    }
                    i19 = i23;
                    while (true) {
                        i23 = i19 - 1;
                        if (i23 >= 0) {
                            ay(this.af, i14, 0, 0, i22 >> 14, i26 >> 14, i24, i20, 408903327);
                            i24 += i21;
                            i14 += this.ak * -1741252353;
                            i22 += i12;
                            i26 += i11;
                            i19 = i23;
                        } else {
                            return;
                        }
                    }
                }
            } else if (i < -2128734493 * this.bv) {
                if (i2 > this.bv * 799933299) {
                    i2 = this.bv * 105123573;
                }
                if (i3 > this.bv * -1759402563) {
                    i15 = 965323303 * this.bv;
                } else {
                    i15 = i3;
                }
                i19 = ((i7 << 8) - (i4 * i20)) + i20;
                if (i2 < i15) {
                    i14 = i4 << 14;
                    if (i < 0) {
                        i13 = i14 - (i * i12);
                        i14 -= i * i11;
                        i19 -= i21 * i;
                        i = 0;
                    } else {
                        i13 = i14;
                    }
                    i26 = i5 << 14;
                    if (i2 < 0) {
                        i26 -= i2 * i10;
                        i2 = 0;
                    }
                    if ((i2 == i || i12 >= i11) && (i2 != i || i12 <= i10)) {
                        i23 = i15 - i2;
                        i24 = i19;
                        i22 = i13;
                        i25 = i14;
                        i19 = i2 - i;
                        i14 = this.be[i];
                        while (true) {
                            i27 = i19 - 1;
                            if (i27 < 0) {
                                break;
                            }
                            ay(this.af, i14, 0, 0, i25 >> 14, i22 >> 14, i24, i20, -579000529);
                            i22 += i12;
                            i24 += i21;
                            i14 += this.ak * 362333062;
                            i25 += i11;
                            i19 = i27;
                        }
                        i19 = i23;
                        while (true) {
                            i23 = i19 - 1;
                            if (i23 >= 0) {
                                ay(this.af, i14, 0, 0, i26 >> 14, i22 >> 14, i24, i20, 2014923059);
                                i24 += i21;
                                i14 += -1741252353 * this.ak;
                                i22 += i12;
                                i26 += i10;
                                i19 = i23;
                            } else {
                                return;
                            }
                        }
                    }
                    i23 = i15 - i2;
                    i24 = i19;
                    i22 = i13;
                    i25 = i14;
                    i19 = i2 - i;
                    i14 = this.be[i];
                    while (true) {
                        i27 = i19 - 1;
                        if (i27 < 0) {
                            break;
                        }
                        ay(this.af, i14, 0, 0, i22 >> 14, i25 >> 14, i24, i20, 1912548146);
                        i22 += i12;
                        i24 += i21;
                        i14 += this.ak * 1646731537;
                        i25 += i11;
                        i19 = i27;
                    }
                    i19 = i23;
                    while (true) {
                        i23 = i19 - 1;
                        if (i23 >= 0) {
                            ay(this.af, i14, 0, 0, i22 >> 14, i26 >> 14, i24, i20, -611439700);
                            i26 += i10;
                            i24 += i21;
                            i14 += -1690704097 * this.ak;
                            i22 += i12;
                            i19 = i23;
                        } else {
                            return;
                        }
                    }
                }
                i14 = i4 << 14;
                if (i < 0) {
                    i13 = i14 - (i12 * i);
                    i26 = i14 - (i * i11);
                    i24 = i19 - (i21 * i);
                    i = 0;
                    i19 = i13;
                } else {
                    i24 = i19;
                    i26 = i14;
                    i19 = i14;
                }
                i22 = i6 << 14;
                if (i15 < 0) {
                    i22 -= i15 * i10;
                    i13 = 0;
                } else {
                    i13 = i15;
                }
                if ((i13 == i || i12 >= i11) && (i != i13 || i10 <= i11)) {
                    i23 = i2 - i13;
                    i13 -= i;
                    i14 = this.be[i];
                    i25 = i19;
                    i19 = i13;
                    while (true) {
                        i27 = i19 - 1;
                        if (i27 < 0) {
                            break;
                        }
                        ay(this.af, i14, 0, 0, i26 >> 14, i25 >> 14, i24, i20, -1725138783);
                        i26 += i11;
                        i24 += i21;
                        i14 += this.ak * 1714753286;
                        i25 += i12;
                        i19 = i27;
                    }
                    i12 = i26;
                    i19 = i23;
                    while (true) {
                        i26 = i19 - 1;
                        if (i26 >= 0) {
                            ay(this.af, i14, 0, 0, i12 >> 14, i22 >> 14, i24, i20, -4384727);
                            i22 += i10;
                            i24 += i21;
                            i14 += this.ak * -1741252353;
                            i12 += i11;
                            i19 = i26;
                        } else {
                            return;
                        }
                    }
                }
                i23 = i2 - i13;
                i13 -= i;
                i14 = this.be[i];
                i25 = i19;
                i19 = i13;
                while (true) {
                    i27 = i19 - 1;
                    if (i27 < 0) {
                        break;
                    }
                    ay(this.af, i14, 0, 0, i25 >> 14, i26 >> 14, i24, i20, 864279770);
                    i26 += i11;
                    i24 += i21;
                    i14 += this.ak * -1110109890;
                    i25 += i12;
                    i19 = i27;
                }
                i12 = i22;
                i19 = i23;
                i22 = i26;
                while (true) {
                    i26 = i19 - 1;
                    if (i26 >= 0) {
                        ay(this.af, i14, 0, 0, i12 >> 14, i22 >> 14, i24, i20, 1438762045);
                        i24 += i21;
                        i14 += this.ak * -1712812913;
                        i12 += i10;
                        i22 += i11;
                        i19 = i26;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    final void av(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int i13 = i5 - i4;
        int i14 = i2 - i;
        int i15 = i6 - i4;
        int i16 = i3 - i;
        int i17 = i8 - i7;
        int i18 = i9 - i7;
        if (i3 != i2) {
            i10 = ((i6 - i5) << 14) / (i3 - i2);
        } else {
            i10 = 0;
        }
        if (i != i2) {
            i11 = (i13 << 14) / i14;
        } else {
            i11 = 0;
        }
        if (i != i3) {
            i12 = (i15 << 14) / i16;
        } else {
            i12 = 0;
        }
        int i19 = (i13 * i16) - (i14 * i15);
        if (i19 != 0) {
            int i20 = (((i16 * i17) - (i14 * i18)) << 8) / i19;
            int i21 = (((i13 * i18) - (i17 * i15)) << 8) / i19;
            int i22;
            int i23;
            int i24;
            int i25;
            int i26;
            int i27;
            if (i > i2 || i > i3) {
                if (i2 <= i3) {
                    if (i2 < 282960379 * this.bv) {
                        if (i3 > this.bv * -1759402563) {
                            i3 = this.bv * 1340490905;
                        }
                        if (i > this.bv * 198039490) {
                            i = this.bv * -1759402563;
                        }
                        i19 = ((i8 << 8) - (i5 * i20)) + i20;
                        if (i3 < i) {
                            i13 = i5 << 14;
                            if (i2 < 0) {
                                i14 = i13 - (i11 * i2);
                                i13 -= i2 * i10;
                                i19 -= i2 * i21;
                                i2 = 0;
                            } else {
                                i14 = i13;
                            }
                            i22 = i6 << 14;
                            if (i3 < 0) {
                                i22 -= i3 * i12;
                                i3 = 0;
                            }
                            if ((i2 == i3 || i11 >= i10) && (i3 != i2 || i11 <= i12)) {
                                i23 = i - i3;
                                i24 = i19;
                                i25 = i13;
                                i26 = i14;
                                i19 = i3 - i2;
                                i14 = this.be[i2];
                                while (true) {
                                    i27 = i19 - 1;
                                    if (i27 < 0) {
                                        break;
                                    }
                                    ay(this.af, i14, 0, 0, i25 >> 14, i26 >> 14, i24, i20, 552354461);
                                    i26 += i11;
                                    i24 += i21;
                                    i14 += 1385878766 * this.ak;
                                    i25 += i10;
                                    i19 = i27;
                                }
                                i19 = i23;
                                while (true) {
                                    i23 = i19 - 1;
                                    if (i23 >= 0) {
                                        ay(this.af, i14, 0, 0, i22 >> 14, i26 >> 14, i24, i20, 873411848);
                                        i22 += i12;
                                        i24 += i21;
                                        i14 += -1741252353 * this.ak;
                                        i26 += i11;
                                        i19 = i23;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i23 = i - i3;
                            i24 = i19;
                            i25 = i13;
                            i26 = i14;
                            i19 = i3 - i2;
                            i14 = this.be[i2];
                            while (true) {
                                i27 = i19 - 1;
                                if (i27 < 0) {
                                    break;
                                }
                                ay(this.af, i14, 0, 0, i26 >> 14, i25 >> 14, i24, i20, -1410306909);
                                i26 += i11;
                                i24 += i21;
                                i14 += this.ak * -2034884771;
                                i25 += i10;
                                i19 = i27;
                            }
                            i19 = i23;
                            while (true) {
                                i23 = i19 - 1;
                                if (i23 >= 0) {
                                    ay(this.af, i14, 0, 0, i26 >> 14, i22 >> 14, i24, i20, -1072970015);
                                    i24 += i21;
                                    i14 += this.ak * -1741252353;
                                    i22 += i12;
                                    i26 += i11;
                                    i19 = i23;
                                } else {
                                    return;
                                }
                            }
                        }
                        i14 = i5 << 14;
                        if (i2 < 0) {
                            i13 = i14 - (i2 * i11);
                            i14 -= i2 * i10;
                            i19 -= i21 * i2;
                            i2 = 0;
                        } else {
                            i13 = i14;
                        }
                        i26 = i4 << 14;
                        if (i < 0) {
                            i26 -= i12 * i;
                            i = 0;
                        }
                        if (i11 < i10) {
                            i23 = i3 - i;
                            i16 = i - i2;
                            i24 = i19;
                            i25 = i13;
                            i22 = i14;
                            i14 = this.be[i2];
                            i19 = i16;
                            while (true) {
                                i27 = i19 - 1;
                                if (i27 < 0) {
                                    break;
                                }
                                ay(this.af, i14, 0, 0, i25 >> 14, i22 >> 14, i24, i20, 1371032207);
                                i22 += i10;
                                i24 += i21;
                                i14 += -720434776 * this.ak;
                                i25 += i11;
                                i19 = i27;
                            }
                            i19 = i23;
                            while (true) {
                                i23 = i19 - 1;
                                if (i23 >= 0) {
                                    ay(this.af, i14, 0, 0, i26 >> 14, i22 >> 14, i24, i20, -107794268);
                                    i26 += i12;
                                    i24 += i21;
                                    i14 += -1741252353 * this.ak;
                                    i22 += i10;
                                    i19 = i23;
                                } else {
                                    return;
                                }
                            }
                        }
                        i23 = i3 - i;
                        i16 = i - i2;
                        i24 = i19;
                        i25 = i13;
                        i22 = i14;
                        i14 = this.be[i2];
                        i19 = i16;
                        while (true) {
                            i27 = i19 - 1;
                            if (i27 < 0) {
                                break;
                            }
                            ay(this.af, i14, 0, 0, i22 >> 14, i25 >> 14, i24, i20, -1726722954);
                            i22 += i10;
                            i24 += i21;
                            i14 += -512872569 * this.ak;
                            i25 += i11;
                            i19 = i27;
                        }
                        i19 = i23;
                        while (true) {
                            i23 = i19 - 1;
                            if (i23 >= 0) {
                                ay(this.af, i14, 0, 0, i22 >> 14, i26 >> 14, i24, i20, -1254710495);
                                i24 += i21;
                                i14 += this.ak * -1741252353;
                                i22 += i10;
                                i26 += i12;
                                i19 = i23;
                            } else {
                                return;
                            }
                        }
                    }
                } else if (i3 < this.bv * -1759402563) {
                    if (i > -1291981049 * this.bv) {
                        i = this.bv * -257747086;
                    }
                    if (i2 > -1759402563 * this.bv) {
                        i2 = this.bv * 920435763;
                    }
                    i19 = ((i9 << 8) - (i6 * i20)) + i20;
                    if (i < i2) {
                        i13 = i6 << 14;
                        if (i3 < 0) {
                            i14 = i13 - (i10 * i3);
                            i13 -= i3 * i12;
                            i19 -= i21 * i3;
                            i3 = 0;
                        } else {
                            i14 = i13;
                        }
                        i26 = i4 << 14;
                        if (i < 0) {
                            i26 -= i11 * i;
                            i = 0;
                        }
                        if (i10 < i12) {
                            i23 = i2 - i;
                            i16 = i - i3;
                            i24 = i19;
                            i25 = i13;
                            i22 = i14;
                            i14 = this.be[i3];
                            i19 = i16;
                            while (true) {
                                i27 = i19 - 1;
                                if (i27 < 0) {
                                    break;
                                }
                                ay(this.af, i14, 0, 0, i22 >> 14, i25 >> 14, i24, i20, -622708464);
                                i22 += i10;
                                i24 += i21;
                                i14 += this.ak * -1741252353;
                                i25 += i12;
                                i19 = i27;
                            }
                            i19 = i23;
                            while (true) {
                                i23 = i19 - 1;
                                if (i23 >= 0) {
                                    ay(this.af, i14, 0, 0, i22 >> 14, i26 >> 14, i24, i20, -1668106477);
                                    i24 += i21;
                                    i14 += this.ak * -473968187;
                                    i22 += i10;
                                    i26 += i11;
                                    i19 = i23;
                                } else {
                                    return;
                                }
                            }
                        }
                        i23 = i2 - i;
                        i16 = i - i3;
                        i24 = i19;
                        i25 = i13;
                        i22 = i14;
                        i14 = this.be[i3];
                        i19 = i16;
                        while (true) {
                            i27 = i19 - 1;
                            if (i27 < 0) {
                                break;
                            }
                            ay(this.af, i14, 0, 0, i25 >> 14, i22 >> 14, i24, i20, 2073318635);
                            i22 += i10;
                            i24 += i21;
                            i14 += 903349994 * this.ak;
                            i25 += i12;
                            i19 = i27;
                        }
                        i19 = i23;
                        while (true) {
                            i23 = i19 - 1;
                            if (i23 >= 0) {
                                ay(this.af, i14, 0, 0, i26 >> 14, i22 >> 14, i24, i20, -1508302391);
                                i26 += i11;
                                i24 += i21;
                                i14 += this.ak * 1577195485;
                                i22 += i10;
                                i19 = i23;
                            } else {
                                return;
                            }
                        }
                    }
                    i22 = i6 << 14;
                    if (i3 < 0) {
                        i13 = i22 - (i3 * i10);
                        i22 -= i3 * i12;
                        i24 = i19 - (i21 * i3);
                        i3 = 0;
                        i19 = i13;
                    } else {
                        i24 = i19;
                        i19 = i22;
                    }
                    i26 = i5 << 14;
                    if (i2 < 0) {
                        i26 -= i2 * i11;
                        i2 = 0;
                    }
                    if (i10 < i12) {
                        i23 = i - i2;
                        i13 = i2 - i3;
                        i14 = this.be[i3];
                        i25 = i19;
                        i19 = i13;
                        while (true) {
                            i27 = i19 - 1;
                            if (i27 < 0) {
                                break;
                            }
                            ay(this.af, i14, 0, 0, i25 >> 14, i22 >> 14, i24, i20, -2026306439);
                            i22 += i12;
                            i24 += i21;
                            i14 += this.ak * 2137598819;
                            i25 += i10;
                            i19 = i27;
                        }
                        i19 = i23;
                        while (true) {
                            i23 = i19 - 1;
                            if (i23 >= 0) {
                                ay(this.af, i14, 0, 0, i26 >> 14, i22 >> 14, i24, i20, -924617256);
                                i26 += i11;
                                i24 += i21;
                                i14 += -1741252353 * this.ak;
                                i22 += i12;
                                i19 = i23;
                            } else {
                                return;
                            }
                        }
                    }
                    i23 = i - i2;
                    i13 = i2 - i3;
                    i14 = this.be[i3];
                    i25 = i19;
                    i19 = i13;
                    while (true) {
                        i27 = i19 - 1;
                        if (i27 < 0) {
                            break;
                        }
                        ay(this.af, i14, 0, 0, i22 >> 14, i25 >> 14, i24, i20, 750602522);
                        i22 += i12;
                        i24 += i21;
                        i14 += -1741252353 * this.ak;
                        i25 += i10;
                        i19 = i27;
                    }
                    i19 = i23;
                    while (true) {
                        i23 = i19 - 1;
                        if (i23 >= 0) {
                            ay(this.af, i14, 0, 0, i22 >> 14, i26 >> 14, i24, i20, 1239092912);
                            i24 += i21;
                            i14 += this.ak * -1741252353;
                            i22 += i12;
                            i26 += i11;
                            i19 = i23;
                        } else {
                            return;
                        }
                    }
                }
            } else if (i < -1759402563 * this.bv) {
                if (i2 > this.bv * -1353331180) {
                    i2 = this.bv * 1867206882;
                }
                if (i3 > this.bv * 339146237) {
                    i15 = -1534291447 * this.bv;
                } else {
                    i15 = i3;
                }
                i19 = ((i7 << 8) - (i4 * i20)) + i20;
                if (i2 < i15) {
                    i14 = i4 << 14;
                    if (i < 0) {
                        i13 = i14 - (i * i12);
                        i14 -= i * i11;
                        i19 -= i21 * i;
                        i = 0;
                    } else {
                        i13 = i14;
                    }
                    i26 = i5 << 14;
                    if (i2 < 0) {
                        i26 -= i2 * i10;
                        i2 = 0;
                    }
                    if ((i2 == i || i12 >= i11) && (i2 != i || i12 <= i10)) {
                        i23 = i15 - i2;
                        i24 = i19;
                        i22 = i13;
                        i25 = i14;
                        i19 = i2 - i;
                        i14 = this.be[i];
                        while (true) {
                            i27 = i19 - 1;
                            if (i27 < 0) {
                                break;
                            }
                            ay(this.af, i14, 0, 0, i25 >> 14, i22 >> 14, i24, i20, -2025095776);
                            i22 += i12;
                            i24 += i21;
                            i14 += this.ak * 1341846669;
                            i25 += i11;
                            i19 = i27;
                        }
                        i19 = i23;
                        while (true) {
                            i23 = i19 - 1;
                            if (i23 >= 0) {
                                ay(this.af, i14, 0, 0, i26 >> 14, i22 >> 14, i24, i20, -384879729);
                                i24 += i21;
                                i14 += -2048513183 * this.ak;
                                i22 += i12;
                                i26 += i10;
                                i19 = i23;
                            } else {
                                return;
                            }
                        }
                    }
                    i23 = i15 - i2;
                    i24 = i19;
                    i22 = i13;
                    i25 = i14;
                    i19 = i2 - i;
                    i14 = this.be[i];
                    while (true) {
                        i27 = i19 - 1;
                        if (i27 < 0) {
                            break;
                        }
                        ay(this.af, i14, 0, 0, i22 >> 14, i25 >> 14, i24, i20, -65543289);
                        i22 += i12;
                        i24 += i21;
                        i14 += this.ak * 805805075;
                        i25 += i11;
                        i19 = i27;
                    }
                    i19 = i23;
                    while (true) {
                        i23 = i19 - 1;
                        if (i23 >= 0) {
                            ay(this.af, i14, 0, 0, i22 >> 14, i26 >> 14, i24, i20, 1059626382);
                            i26 += i10;
                            i24 += i21;
                            i14 += -1741252353 * this.ak;
                            i22 += i12;
                            i19 = i23;
                        } else {
                            return;
                        }
                    }
                }
                i14 = i4 << 14;
                if (i < 0) {
                    i13 = i14 - (i12 * i);
                    i14 -= i * i11;
                    i19 -= i21 * i;
                    i = 0;
                } else {
                    i13 = i14;
                }
                i22 = i6 << 14;
                if (i15 < 0) {
                    i22 -= i15 * i10;
                    i15 = 0;
                }
                if ((i15 == i || i12 >= i11) && (i != i15 || i10 <= i11)) {
                    i23 = i2 - i15;
                    i24 = i19;
                    i25 = i13;
                    i26 = i14;
                    i19 = i15 - i;
                    i14 = this.be[i];
                    while (true) {
                        i27 = i19 - 1;
                        if (i27 < 0) {
                            break;
                        }
                        ay(this.af, i14, 0, 0, i26 >> 14, i25 >> 14, i24, i20, 355372884);
                        i26 += i11;
                        i24 += i21;
                        i14 += this.ak * 1412026261;
                        i25 += i12;
                        i19 = i27;
                    }
                    i19 = i23;
                    while (true) {
                        i23 = i19 - 1;
                        if (i23 >= 0) {
                            ay(this.af, i14, 0, 0, i26 >> 14, i22 >> 14, i24, i20, -454529699);
                            i22 += i10;
                            i24 += i21;
                            i14 += this.ak * 1420080582;
                            i26 += i11;
                            i19 = i23;
                        } else {
                            return;
                        }
                    }
                }
                i23 = i2 - i15;
                i24 = i19;
                i25 = i13;
                i26 = i14;
                i19 = i15 - i;
                i14 = this.be[i];
                while (true) {
                    i27 = i19 - 1;
                    if (i27 < 0) {
                        break;
                    }
                    ay(this.af, i14, 0, 0, i25 >> 14, i26 >> 14, i24, i20, -1024465145);
                    i26 += i11;
                    i24 += i21;
                    i14 += this.ak * -1741252353;
                    i25 += i12;
                    i19 = i27;
                }
                i19 = i23;
                while (true) {
                    i23 = i19 - 1;
                    if (i23 >= 0) {
                        ay(this.af, i14, 0, 0, i22 >> 14, i26 >> 14, i24, i20, -878430029);
                        i24 += i21;
                        i14 += this.ak * -1741252353;
                        i22 += i10;
                        i26 += i11;
                        i19 = i23;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    static final int bk(int i, int i2, int i3, int i4, byte b) {
        return ((i * i3) - (i4 * i2)) >> 16;
    }

    final void ac(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (this.al) {
            if (i5 > this.bf * 784773023) {
                i5 = this.bf * 784773023;
            }
            if (i4 < 0) {
                i4 = 0;
            }
        }
        if (i4 < i5) {
            int i8 = i + i4;
            int i9 = (i7 * i4) + i6;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            if (this.bb) {
                i10 = (i5 - i4) >> 2;
                i11 = i7 << 2;
                if (238267341 * this.bc == 0) {
                    if (i10 > 0) {
                        do {
                            i12 = at[i9 >> 8];
                            i9 += i11;
                            i13 = i8 + 1;
                            iArr[i8] = i12;
                            i8 = i13 + 1;
                            iArr[i13] = i12;
                            i13 = i8 + 1;
                            iArr[i8] = i12;
                            i8 = i13 + 1;
                            iArr[i13] = i12;
                            i10--;
                        } while (i10 > 0);
                    }
                    i10 = (i5 - i4) & 3;
                    if (i10 > 0) {
                        i11 = at[i9 >> 8];
                        i9 = i10;
                        while (true) {
                            i10 = i8 + 1;
                            iArr[i8] = i11;
                            i9--;
                            if (i9 > 0) {
                                i8 = i10;
                            } else {
                                return;
                            }
                        }
                    }
                    return;
                }
                i12 = 238267341 * this.bc;
                i13 = 256 - (this.bc * 238267341);
                if (i10 > 0) {
                    do {
                        i14 = at[i9 >> 8];
                        i9 += i11;
                        i14 = ((((i14 & 16711935) * i13) >> 8) & 16711935) + ((((65280 & i14) * i13) >> 8) & 65280);
                        i15 = iArr[i8];
                        int i16 = i8 + 1;
                        iArr[i8] = ((((i15 & 65280) * i12) >> 8) & 65280) + (((((16711935 & i15) * i12) >> 8) & 16711935) + i14);
                        i8 = iArr[i16];
                        i15 = i16 + 1;
                        iArr[i16] = (((((i8 & 16711935) * i12) >> 8) & 16711935) + i14) + ((((65280 & i8) * i12) >> 8) & 65280);
                        i8 = iArr[i15];
                        i16 = i15 + 1;
                        iArr[i15] = (((((i8 & 16711935) * i12) >> 8) & 16711935) + i14) + ((((65280 & i8) * i12) >> 8) & 65280);
                        i15 = iArr[i16];
                        i8 = i16 + 1;
                        iArr[i16] = (i14 + ((((16711935 & i15) * i12) >> 8) & 16711935)) + ((((i15 & 65280) * i12) >> 8) & 65280);
                        i10--;
                    } while (i10 > 0);
                }
                i10 = i8;
                i8 = i9;
                i9 = (i5 - i4) & 3;
                if (i9 > 0) {
                    i8 = at[i8 >> 8];
                    i11 = ((((65280 & i8) * i13) >> 8) & 65280) + ((((i8 & 16711935) * i13) >> 8) & 16711935);
                    while (true) {
                        i13 = iArr[i10];
                        i8 = i10 + 1;
                        iArr[i10] = (((((i13 & 16711935) * i12) >> 8) & 16711935) + i11) + ((((65280 & i13) * i12) >> 8) & 65280);
                        i9--;
                        if (i9 > 0) {
                            i10 = i8;
                        } else {
                            return;
                        }
                    }
                }
                return;
            }
            i10 = i5 - i4;
            if (this.bc * 238267341 == 0) {
                while (true) {
                    i11 = i8 + 1;
                    iArr[i8] = at[i9 >> 8];
                    i9 += i7;
                    i10--;
                    if (i10 > 0) {
                        i8 = i11;
                    } else {
                        return;
                    }
                }
            }
            i12 = this.bc * 238267341;
            i13 = 256 - (this.bc * 238267341);
            while (true) {
                i11 = at[i9 >> 8];
                i9 += i7;
                i14 = ((((65280 & i11) * i13) >> 8) & 65280) + ((((i11 & 16711935) * i13) >> 8) & 16711935);
                i15 = iArr[i8];
                i11 = i8 + 1;
                iArr[i8] = (i14 + ((((16711935 & i15) * i12) >> 8) & 16711935)) + ((((i15 & 65280) * i12) >> 8) & 65280);
                i10--;
                if (i10 > 0) {
                    i8 = i11;
                } else {
                    return;
                }
            }
        }
    }

    final void al(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (this.al) {
            if (i5 > this.bf * 784773023) {
                i5 = this.bf * 784773023;
            }
            if (i4 < 0) {
                i4 = 0;
            }
        }
        if (i4 < i5) {
            int i8 = i + i4;
            int i9 = (i7 * i4) + i6;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            if (this.bb) {
                i10 = (i5 - i4) >> 2;
                i11 = i7 << 2;
                if (238267341 * this.bc == 0) {
                    if (i10 > 0) {
                        do {
                            i12 = at[i9 >> 8];
                            i9 += i11;
                            i13 = i8 + 1;
                            iArr[i8] = i12;
                            i8 = i13 + 1;
                            iArr[i13] = i12;
                            i13 = i8 + 1;
                            iArr[i8] = i12;
                            i8 = i13 + 1;
                            iArr[i13] = i12;
                            i10--;
                        } while (i10 > 0);
                    }
                    i10 = (i5 - i4) & 3;
                    if (i10 > 0) {
                        i11 = at[i9 >> 8];
                        i9 = i10;
                        while (true) {
                            i10 = i8 + 1;
                            iArr[i8] = i11;
                            i9--;
                            if (i9 > 0) {
                                i8 = i10;
                            } else {
                                return;
                            }
                        }
                    }
                    return;
                }
                i12 = 238267341 * this.bc;
                i13 = 256 - (this.bc * 238267341);
                if (i10 > 0) {
                    do {
                        i14 = at[i9 >> 8];
                        i9 += i11;
                        i14 = ((((i14 & 16711935) * i13) >> 8) & 16711935) + ((((65280 & i14) * i13) >> 8) & 65280);
                        i15 = iArr[i8];
                        int i16 = i8 + 1;
                        iArr[i8] = ((((i15 & 65280) * i12) >> 8) & 65280) + (((((16711935 & i15) * i12) >> 8) & 16711935) + i14);
                        i8 = iArr[i16];
                        i15 = i16 + 1;
                        iArr[i16] = (((((i8 & 16711935) * i12) >> 8) & 16711935) + i14) + ((((65280 & i8) * i12) >> 8) & 65280);
                        i8 = iArr[i15];
                        i16 = i15 + 1;
                        iArr[i15] = (((((i8 & 16711935) * i12) >> 8) & 16711935) + i14) + ((((65280 & i8) * i12) >> 8) & 65280);
                        i15 = iArr[i16];
                        i8 = i16 + 1;
                        iArr[i16] = (i14 + ((((16711935 & i15) * i12) >> 8) & 16711935)) + ((((i15 & 65280) * i12) >> 8) & 65280);
                        i10--;
                    } while (i10 > 0);
                }
                i10 = i8;
                i8 = i9;
                i9 = (i5 - i4) & 3;
                if (i9 > 0) {
                    i8 = at[i8 >> 8];
                    i11 = ((((65280 & i8) * i13) >> 8) & 65280) + ((((i8 & 16711935) * i13) >> 8) & 16711935);
                    while (true) {
                        i13 = iArr[i10];
                        i8 = i10 + 1;
                        iArr[i10] = (((((i13 & 16711935) * i12) >> 8) & 16711935) + i11) + ((((65280 & i13) * i12) >> 8) & 65280);
                        i9--;
                        if (i9 > 0) {
                            i10 = i8;
                        } else {
                            return;
                        }
                    }
                }
                return;
            }
            i10 = i5 - i4;
            if (this.bc * 238267341 == 0) {
                while (true) {
                    i11 = i8 + 1;
                    iArr[i8] = at[i9 >> 8];
                    i9 += i7;
                    i10--;
                    if (i10 > 0) {
                        i8 = i11;
                    } else {
                        return;
                    }
                }
            }
            i12 = this.bc * 238267341;
            i13 = 256 - (this.bc * 238267341);
            while (true) {
                i11 = at[i9 >> 8];
                i9 += i7;
                i14 = ((((65280 & i11) * i13) >> 8) & 65280) + ((((i11 & 16711935) * i13) >> 8) & 16711935);
                i15 = iArr[i8];
                i11 = i8 + 1;
                iArr[i8] = (i14 + ((((16711935 & i15) * i12) >> 8) & 16711935)) + ((((i15 & 65280) * i12) >> 8) & 65280);
                i10--;
                if (i10 > 0) {
                    i8 = i11;
                } else {
                    return;
                }
            }
        }
    }

    final void ap(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (this.al) {
            if (i5 > this.bf * 784773023) {
                i5 = this.bf * -260895343;
            }
            if (i4 < 0) {
                i4 = 0;
            }
        }
        if (i4 < i5) {
            int i8 = i + i4;
            int i9 = (i7 * i4) + i6;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            if (this.bb) {
                i10 = (i5 - i4) >> 2;
                i11 = i7 << 2;
                if (238267341 * this.bc == 0) {
                    if (i10 > 0) {
                        do {
                            i12 = at[i9 >> 8];
                            i9 += i11;
                            i13 = i8 + 1;
                            iArr[i8] = i12;
                            i8 = i13 + 1;
                            iArr[i13] = i12;
                            i13 = i8 + 1;
                            iArr[i8] = i12;
                            i8 = i13 + 1;
                            iArr[i13] = i12;
                            i10--;
                        } while (i10 > 0);
                    }
                    i10 = i8;
                    i8 = i9;
                    i9 = (i5 - i4) & 3;
                    if (i9 > 0) {
                        i11 = at[i8 >> 8];
                        while (true) {
                            i8 = i10 + 1;
                            iArr[i10] = i11;
                            i9--;
                            if (i9 > 0) {
                                i10 = i8;
                            } else {
                                return;
                            }
                        }
                    }
                    return;
                }
                i12 = 970669147 * this.bc;
                i13 = 993219905 - (this.bc * 215905729);
                if (i10 > 0) {
                    do {
                        i14 = at[i9 >> 8];
                        i9 += i11;
                        i14 = ((((i14 & -1264235608) * i13) >> 8) & -1506672242) + ((((-1162043640 & i14) * i13) >> 8) & -1789507423);
                        i15 = iArr[i8];
                        int i16 = i8 + 1;
                        iArr[i8] = ((((i15 & 65280) * i12) >> 8) & 65280) + (((((16711935 & i15) * i12) >> 8) & 1696330621) + i14);
                        i8 = iArr[i16];
                        i15 = i16 + 1;
                        iArr[i16] = (((((i8 & -646198042) * i12) >> 8) & -392065957) + i14) + ((((-2076690748 & i8) * i12) >> 8) & -2041325730);
                        i8 = iArr[i15];
                        i16 = i15 + 1;
                        iArr[i15] = (((((i8 & 16711935) * i12) >> 8) & 16711935) + i14) + ((((65280 & i8) * i12) >> 8) & 918546951);
                        i15 = iArr[i16];
                        i8 = i16 + 1;
                        iArr[i16] = (i14 + ((((1615151682 & i15) * i12) >> 8) & 937812508)) + ((((i15 & 1923893366) * i12) >> 8) & -1492155629);
                        i10--;
                    } while (i10 > 0);
                }
                i10 = (i5 - i4) & 3;
                if (i10 > 0) {
                    i9 = at[i9 >> 8];
                    i11 = ((((1610365092 & i9) * i13) >> 8) & 65280) + ((((i9 & 484986598) * i13) >> 8) & 16711935);
                    i9 = i10;
                    while (true) {
                        i13 = iArr[i8];
                        i10 = i8 + 1;
                        iArr[i8] = (((((i13 & 691325832) * i12) >> 8) & 1843720770) + i11) + ((((-2001081651 & i13) * i12) >> 8) & -348935574);
                        i9--;
                        if (i9 > 0) {
                            i8 = i10;
                        } else {
                            return;
                        }
                    }
                }
                return;
            }
            i10 = i5 - i4;
            if (this.bc * -557878139 == 0) {
                while (true) {
                    i11 = i8 + 1;
                    iArr[i8] = at[i9 >> 8];
                    i9 += i7;
                    i10--;
                    if (i10 > 0) {
                        i8 = i11;
                    } else {
                        return;
                    }
                }
            }
            i12 = this.bc * 238267341;
            i13 = 256 - (this.bc * 238267341);
            while (true) {
                i11 = at[i9 >> 8];
                i9 += i7;
                i14 = ((((65280 & i11) * i13) >> 8) & 65280) + ((((i11 & 16711935) * i13) >> 8) & 16711935);
                i15 = iArr[i8];
                i11 = i8 + 1;
                iArr[i8] = (i14 + ((((-935566339 & i15) * i12) >> 8) & 16711935)) + ((((i15 & 65280) * i12) >> 8) & 65280);
                i10--;
                if (i10 > 0) {
                    i8 = i11;
                } else {
                    return;
                }
            }
        }
    }

    final void ay(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        try {
            if (this.al) {
                if (i5 > this.bf * 784773023) {
                    i5 = this.bf * 784773023;
                }
                if (i4 < 0) {
                    i4 = 0;
                }
            }
            if (i4 < i5) {
                int i9 = i + i4;
                int i10 = (i7 * i4) + i6;
                int i11;
                int i12;
                int i13;
                int i14;
                int i15;
                int i16;
                if (this.bb) {
                    i11 = (i5 - i4) >> 2;
                    i12 = i7 << 2;
                    if (238267341 * this.bc == 0) {
                        if (i11 > 0) {
                            do {
                                i13 = at[i10 >> 8];
                                i10 += i12;
                                i14 = i9 + 1;
                                iArr[i9] = i13;
                                i9 = i14 + 1;
                                iArr[i14] = i13;
                                i14 = i9 + 1;
                                iArr[i9] = i13;
                                i9 = i14 + 1;
                                iArr[i14] = i13;
                                i11--;
                            } while (i11 > 0);
                        }
                        i11 = i10;
                        i10 = (i5 - i4) & 3;
                        if (i10 > 0) {
                            i12 = at[i11 >> 8];
                            while (true) {
                                i11 = i9 + 1;
                                iArr[i9] = i12;
                                i10--;
                                if (i10 > 0) {
                                    i9 = i11;
                                } else {
                                    return;
                                }
                            }
                        }
                        return;
                    }
                    i13 = 238267341 * this.bc;
                    i14 = 256 - (this.bc * 238267341);
                    if (i11 > 0) {
                        do {
                            i15 = at[i10 >> 8];
                            i10 += i12;
                            i15 = ((((i15 & 16711935) * i14) >> 8) & 16711935) + ((((65280 & i15) * i14) >> 8) & 65280);
                            i16 = iArr[i9];
                            int i17 = i9 + 1;
                            iArr[i9] = ((((i16 & 65280) * i13) >> 8) & 65280) + (((((16711935 & i16) * i13) >> 8) & 16711935) + i15);
                            i9 = iArr[i17];
                            i16 = i17 + 1;
                            iArr[i17] = (((((i9 & 16711935) * i13) >> 8) & 16711935) + i15) + ((((65280 & i9) * i13) >> 8) & 65280);
                            i9 = iArr[i16];
                            i17 = i16 + 1;
                            iArr[i16] = (((((i9 & 16711935) * i13) >> 8) & 16711935) + i15) + ((((65280 & i9) * i13) >> 8) & 65280);
                            i16 = iArr[i17];
                            i9 = i17 + 1;
                            iArr[i17] = (i15 + ((((16711935 & i16) * i13) >> 8) & 16711935)) + ((((i16 & 65280) * i13) >> 8) & 65280);
                            i11--;
                        } while (i11 > 0);
                    }
                    i11 = (i5 - i4) & 3;
                    if (i11 > 0) {
                        i10 = at[i10 >> 8];
                        i12 = ((((65280 & i10) * i14) >> 8) & 65280) + ((((i10 & 16711935) * i14) >> 8) & 16711935);
                        i10 = i11;
                        while (true) {
                            i14 = iArr[i9];
                            i11 = i9 + 1;
                            iArr[i9] = (((((i14 & 16711935) * i13) >> 8) & 16711935) + i12) + ((((65280 & i14) * i13) >> 8) & 65280);
                            i10--;
                            if (i10 > 0) {
                                i9 = i11;
                            } else {
                                return;
                            }
                        }
                    }
                    return;
                }
                i11 = i5 - i4;
                if (this.bc * 238267341 == 0) {
                    while (true) {
                        i12 = i9 + 1;
                        iArr[i9] = at[i10 >> 8];
                        i10 += i7;
                        i11--;
                        if (i11 > 0) {
                            i9 = i12;
                        } else {
                            return;
                        }
                    }
                }
                i13 = this.bc * 238267341;
                i14 = 256 - (this.bc * 238267341);
                int i18 = i11;
                i11 = i9;
                i9 = i18;
                while (true) {
                    i12 = at[i10 >> 8];
                    i10 += i7;
                    i15 = ((((65280 & i12) * i14) >> 8) & 65280) + ((((i12 & 16711935) * i14) >> 8) & 16711935);
                    i16 = iArr[i11];
                    i12 = i11 + 1;
                    iArr[i11] = (i15 + ((((16711935 & i16) * i13) >> 8) & 16711935)) + ((((i16 & 65280) * i13) >> 8) & 65280);
                    i9--;
                    if (i9 > 0) {
                        i11 = i12;
                    } else {
                        return;
                    }
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "cj.ay(" + ')');
        }
    }

    final void cu(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (this.al) {
            if (i5 > this.bf * 784773023) {
                i5 = this.bf * 784773023;
            }
            if (i4 < 0) {
                i4 = 0;
            }
        }
        if (i4 < i5) {
            int i8 = i + i4;
            int i9 = (i7 * i4) + i6;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            if (this.bb) {
                i10 = (i5 - i4) >> 2;
                i11 = i7 << 2;
                if (238267341 * this.bc == 0) {
                    if (i10 > 0) {
                        do {
                            i12 = at[i9 >> 8];
                            i9 += i11;
                            i13 = i8 + 1;
                            iArr[i8] = i12;
                            i8 = i13 + 1;
                            iArr[i13] = i12;
                            i13 = i8 + 1;
                            iArr[i8] = i12;
                            i8 = i13 + 1;
                            iArr[i13] = i12;
                            i10--;
                        } while (i10 > 0);
                    }
                    i10 = i8;
                    i8 = i9;
                    i9 = (i5 - i4) & 3;
                    if (i9 > 0) {
                        i11 = at[i8 >> 8];
                        while (true) {
                            i8 = i10 + 1;
                            iArr[i10] = i11;
                            i9--;
                            if (i9 > 0) {
                                i10 = i8;
                            } else {
                                return;
                            }
                        }
                    }
                    return;
                }
                i12 = 238267341 * this.bc;
                i13 = 256 - (this.bc * 238267341);
                if (i10 > 0) {
                    do {
                        i14 = at[i9 >> 8];
                        i9 += i11;
                        i14 = ((((i14 & 16711935) * i13) >> 8) & 16711935) + ((((65280 & i14) * i13) >> 8) & 65280);
                        i15 = iArr[i8];
                        int i16 = i8 + 1;
                        iArr[i8] = ((((i15 & 65280) * i12) >> 8) & 65280) + (((((16711935 & i15) * i12) >> 8) & 16711935) + i14);
                        i8 = iArr[i16];
                        i15 = i16 + 1;
                        iArr[i16] = (((((i8 & 16711935) * i12) >> 8) & 16711935) + i14) + ((((65280 & i8) * i12) >> 8) & 65280);
                        i8 = iArr[i15];
                        i16 = i15 + 1;
                        iArr[i15] = (((((i8 & 16711935) * i12) >> 8) & 16711935) + i14) + ((((65280 & i8) * i12) >> 8) & 65280);
                        i15 = iArr[i16];
                        i8 = i16 + 1;
                        iArr[i16] = (i14 + ((((16711935 & i15) * i12) >> 8) & 16711935)) + ((((i15 & 65280) * i12) >> 8) & 65280);
                        i10--;
                    } while (i10 > 0);
                }
                i10 = i8;
                i8 = i9;
                i9 = (i5 - i4) & 3;
                if (i9 > 0) {
                    i8 = at[i8 >> 8];
                    i11 = ((((65280 & i8) * i13) >> 8) & 65280) + ((((i8 & 16711935) * i13) >> 8) & 16711935);
                    while (true) {
                        i13 = iArr[i10];
                        i8 = i10 + 1;
                        iArr[i10] = (((((i13 & 16711935) * i12) >> 8) & 16711935) + i11) + ((((65280 & i13) * i12) >> 8) & 65280);
                        i9--;
                        if (i9 > 0) {
                            i10 = i8;
                        } else {
                            return;
                        }
                    }
                }
                return;
            }
            i10 = i5 - i4;
            if (this.bc * 238267341 == 0) {
                while (true) {
                    i11 = i8 + 1;
                    iArr[i8] = at[i9 >> 8];
                    i9 += i7;
                    i10--;
                    if (i10 > 0) {
                        i8 = i11;
                    } else {
                        return;
                    }
                }
            }
            i12 = this.bc * 238267341;
            i13 = 256 - (this.bc * 238267341);
            while (true) {
                i11 = at[i9 >> 8];
                i9 += i7;
                i14 = ((((65280 & i11) * i13) >> 8) & 65280) + ((((i11 & 16711935) * i13) >> 8) & 16711935);
                i15 = iArr[i8];
                i11 = i8 + 1;
                iArr[i8] = (i14 + ((((16711935 & i15) * i12) >> 8) & 16711935)) + ((((i15 & 65280) * i12) >> 8) & 65280);
                i10--;
                if (i10 > 0) {
                    i8 = i11;
                } else {
                    return;
                }
            }
        }
    }

    public final void as(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        if (i2 != i) {
            try {
                int i11 = ((i5 - i4) << 14) / (i2 - i);
            } catch (Throwable e) {
                throw ba.ad(e, "cj.as(" + ')');
            }
        }
        i11 = 0;
        if (i2 != i3) {
            i9 = ((i6 - i5) << 14) / (i3 - i2);
        } else {
            i9 = 0;
        }
        if (i != i3) {
            i10 = ((i4 - i6) << 14) / (i - i3);
        } else {
            i10 = 0;
        }
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        if (i > i2 || i > i3) {
            if (i2 <= i3) {
                if (i2 < -1759402563 * this.bv) {
                    if (i3 > this.bv * -1759402563) {
                        i12 = -1759402563 * this.bv;
                    } else {
                        i12 = i3;
                    }
                    if (i > -1759402563 * this.bv) {
                        i13 = this.bv * -1759402563;
                    } else {
                        i13 = i;
                    }
                    if (i12 < i13) {
                        i14 = i5 << 14;
                        if (i2 < 0) {
                            i15 = i14 - (i2 * i11);
                            i14 -= i9 * i2;
                            i2 = 0;
                        } else {
                            i15 = i14;
                        }
                        i16 = i6 << 14;
                        if (i12 < 0) {
                            i16 -= i12 * i10;
                            i17 = 0;
                        } else {
                            i17 = i12;
                        }
                        if ((i2 == i17 || i11 >= i9) && (i17 != i2 || i11 <= i10)) {
                            i18 = i13 - i17;
                            i17 -= i2;
                            i13 = this.be[i2];
                            i19 = i14;
                            i14 = i17;
                            while (true) {
                                i20 = i14 - 1;
                                if (i20 < 0) {
                                    break;
                                }
                                ar(this.af, i13, i7, 0, i19 >> 14, i15 >> 14, (byte) 55);
                                i15 += i11;
                                i13 += this.ak * -1741252353;
                                i19 += i9;
                                i14 = i20;
                            }
                            i9 = i15;
                            i14 = i18;
                            while (true) {
                                i15 = i14 - 1;
                                if (i15 >= 0) {
                                    ar(this.af, i13, i7, 0, i16 >> 14, i9 >> 14, (byte) 108);
                                    i16 += i10;
                                    i13 += -1741252353 * this.ak;
                                    i9 += i11;
                                    i14 = i15;
                                } else {
                                    return;
                                }
                            }
                        }
                        i18 = i13 - i17;
                        i17 -= i2;
                        i13 = this.be[i2];
                        i19 = i14;
                        i14 = i17;
                        while (true) {
                            i20 = i14 - 1;
                            if (i20 < 0) {
                                break;
                            }
                            ar(this.af, i13, i7, 0, i15 >> 14, i19 >> 14, (byte) 120);
                            i15 += i11;
                            i13 += this.ak * -1741252353;
                            i19 += i9;
                            i14 = i20;
                        }
                        i9 = i16;
                        i14 = i18;
                        i16 = i15;
                        while (true) {
                            i15 = i14 - 1;
                            if (i15 >= 0) {
                                ar(this.af, i13, i7, 0, i16 >> 14, i9 >> 14, (byte) 17);
                                i13 += -1741252353 * this.ak;
                                i9 += i10;
                                i16 += i11;
                                i14 = i15;
                            } else {
                                return;
                            }
                        }
                    }
                    i17 = i5 << 14;
                    if (i2 < 0) {
                        i14 = i17 - (i11 * i2);
                        i17 -= i2 * i9;
                        i2 = 0;
                    } else {
                        i14 = i17;
                    }
                    i15 = i4 << 14;
                    if (i13 < 0) {
                        i15 -= i13 * i10;
                        i13 = 0;
                    }
                    if (i11 < i9) {
                        i18 = i12 - i13;
                        i12 = i13 - i2;
                        i13 = this.be[i2];
                        i19 = i14;
                        i16 = i17;
                        i14 = i12;
                        while (true) {
                            i20 = i14 - 1;
                            if (i20 < 0) {
                                break;
                            }
                            ar(this.af, i13, i7, 0, i19 >> 14, i16 >> 14, (byte) 37);
                            i16 += i9;
                            i13 += -1741252353 * this.ak;
                            i19 += i11;
                            i14 = i20;
                        }
                        i11 = i16;
                        i14 = i18;
                        i16 = i15;
                        while (true) {
                            i15 = i14 - 1;
                            if (i15 >= 0) {
                                ar(this.af, i13, i7, 0, i16 >> 14, i11 >> 14, (byte) 44);
                                i13 += this.ak * -1741252353;
                                i11 += i9;
                                i16 += i10;
                                i14 = i15;
                            } else {
                                return;
                            }
                        }
                    }
                    i18 = i12 - i13;
                    i12 = i13 - i2;
                    i13 = this.be[i2];
                    i19 = i14;
                    i16 = i17;
                    i14 = i12;
                    while (true) {
                        i20 = i14 - 1;
                        if (i20 < 0) {
                            break;
                        }
                        ar(this.af, i13, i7, 0, i16 >> 14, i19 >> 14, (byte) 67);
                        i16 += i9;
                        i13 += -1741252353 * this.ak;
                        i19 += i11;
                        i14 = i20;
                    }
                    i11 = i16;
                    i14 = i18;
                    while (true) {
                        i16 = i14 - 1;
                        if (i16 >= 0) {
                            ar(this.af, i13, i7, 0, i11 >> 14, i15 >> 14, (byte) 84);
                            i15 += i10;
                            i13 += -1741252353 * this.ak;
                            i11 += i9;
                            i14 = i16;
                        } else {
                            return;
                        }
                    }
                }
            } else if (i3 < -1759402563 * this.bv) {
                if (i > this.bv * -1759402563) {
                    i12 = -1759402563 * this.bv;
                } else {
                    i12 = i;
                }
                if (i2 > -1759402563 * this.bv) {
                    i13 = this.bv * -1759402563;
                } else {
                    i13 = i2;
                }
                if (i12 < i13) {
                    i14 = i6 << 14;
                    if (i3 < 0) {
                        i17 = i14 - (i3 * i9);
                        i14 -= i10 * i3;
                        i3 = 0;
                    } else {
                        i17 = i14;
                    }
                    i15 = i4 << 14;
                    if (i12 < 0) {
                        i15 -= i12 * i11;
                        i12 = 0;
                    }
                    if (i9 < i10) {
                        i18 = i13 - i12;
                        i12 -= i3;
                        i13 = this.be[i3];
                        i19 = i14;
                        i16 = i17;
                        i14 = i12;
                        while (true) {
                            i20 = i14 - 1;
                            if (i20 < 0) {
                                break;
                            }
                            ar(this.af, i13, i7, 0, i16 >> 14, i19 >> 14, (byte) 21);
                            i16 += i9;
                            i13 += -1741252353 * this.ak;
                            i19 += i10;
                            i14 = i20;
                        }
                        i14 = i18;
                        while (true) {
                            i18 = i14 - 1;
                            if (i18 >= 0) {
                                ar(this.af, i13, i7, 0, i16 >> 14, i15 >> 14, (byte) 75);
                                i13 += this.ak * -1741252353;
                                i16 += i9;
                                i15 += i11;
                                i14 = i18;
                            } else {
                                return;
                            }
                        }
                    }
                    i18 = i13 - i12;
                    i12 -= i3;
                    i13 = this.be[i3];
                    i19 = i14;
                    i16 = i17;
                    i14 = i12;
                    while (true) {
                        i20 = i14 - 1;
                        if (i20 < 0) {
                            break;
                        }
                        ar(this.af, i13, i7, 0, i19 >> 14, i16 >> 14, (byte) 124);
                        i16 += i9;
                        i13 += -1741252353 * this.ak;
                        i19 += i10;
                        i14 = i20;
                    }
                    i14 = i18;
                    while (true) {
                        i18 = i14 - 1;
                        if (i18 >= 0) {
                            ar(this.af, i13, i7, 0, i15 >> 14, i16 >> 14, (byte) 86);
                            i15 += i11;
                            i13 += this.ak * -1741252353;
                            i16 += i9;
                            i14 = i18;
                        } else {
                            return;
                        }
                    }
                }
                i14 = i6 << 14;
                if (i3 < 0) {
                    i17 = i14 - (i3 * i9);
                    i14 -= i10 * i3;
                    i3 = 0;
                } else {
                    i17 = i14;
                }
                i15 = i5 << 14;
                if (i13 < 0) {
                    i15 -= i13 * i11;
                    i13 = 0;
                }
                if (i9 < i10) {
                    i18 = i12 - i13;
                    i12 = i13 - i3;
                    i13 = this.be[i3];
                    i16 = i14;
                    i19 = i17;
                    i14 = i12;
                    while (true) {
                        i20 = i14 - 1;
                        if (i20 < 0) {
                            break;
                        }
                        ar(this.af, i13, i7, 0, i19 >> 14, i16 >> 14, (byte) 84);
                        i16 += i10;
                        i13 += -1741252353 * this.ak;
                        i19 += i9;
                        i14 = i20;
                    }
                    i9 = i16;
                    i14 = i18;
                    while (true) {
                        i16 = i14 - 1;
                        if (i16 >= 0) {
                            ar(this.af, i13, i7, 0, i15 >> 14, i9 >> 14, (byte) 59);
                            i15 += i11;
                            i13 += this.ak * -1741252353;
                            i9 += i10;
                            i14 = i16;
                        } else {
                            return;
                        }
                    }
                }
                i18 = i12 - i13;
                i12 = i13 - i3;
                i13 = this.be[i3];
                i16 = i14;
                i19 = i17;
                i14 = i12;
                while (true) {
                    i20 = i14 - 1;
                    if (i20 < 0) {
                        break;
                    }
                    ar(this.af, i13, i7, 0, i16 >> 14, i19 >> 14, (byte) 50);
                    i16 += i10;
                    i13 += this.ak * -1741252353;
                    i19 += i9;
                    i14 = i20;
                }
                i9 = i16;
                i14 = i18;
                i16 = i15;
                while (true) {
                    i15 = i14 - 1;
                    if (i15 >= 0) {
                        ar(this.af, i13, i7, 0, i9 >> 14, i16 >> 14, (byte) 98);
                        i13 += this.ak * -1741252353;
                        i9 += i10;
                        i16 += i11;
                        i14 = i15;
                    } else {
                        return;
                    }
                }
            }
        } else if (i < this.bv * -1759402563) {
            if (i2 > this.bv * -1759402563) {
                i13 = -1759402563 * this.bv;
            } else {
                i13 = i2;
            }
            if (i3 > -1759402563 * this.bv) {
                i12 = this.bv * -1759402563;
            } else {
                i12 = i3;
            }
            if (i13 < i12) {
                i17 = i4 << 14;
                if (i < 0) {
                    i14 = i17 - (i10 * i);
                    i17 -= i11 * i;
                    i = 0;
                } else {
                    i14 = i17;
                }
                i15 = i5 << 14;
                if (i13 < 0) {
                    i15 -= i13 * i9;
                    i13 = 0;
                }
                if ((i13 == i || i10 >= i11) && (i13 != i || i10 <= i9)) {
                    i18 = i12 - i13;
                    i16 = i14;
                    i19 = i17;
                    i14 = i13 - i;
                    i13 = this.be[i];
                    while (true) {
                        i20 = i14 - 1;
                        if (i20 < 0) {
                            break;
                        }
                        ar(this.af, i13, i7, 0, i19 >> 14, i16 >> 14, (byte) 85);
                        i16 += i10;
                        i13 += -1741252353 * this.ak;
                        i19 += i11;
                        i14 = i20;
                    }
                    i11 = i16;
                    i14 = i18;
                    while (true) {
                        i16 = i14 - 1;
                        if (i16 >= 0) {
                            ar(this.af, i13, i7, 0, i15 >> 14, i11 >> 14, (byte) 5);
                            i15 += i9;
                            i13 += this.ak * -1741252353;
                            i11 += i10;
                            i14 = i16;
                        } else {
                            return;
                        }
                    }
                }
                i18 = i12 - i13;
                i16 = i14;
                i19 = i17;
                i14 = i13 - i;
                i13 = this.be[i];
                while (true) {
                    i20 = i14 - 1;
                    if (i20 < 0) {
                        break;
                    }
                    ar(this.af, i13, i7, 0, i16 >> 14, i19 >> 14, (byte) 98);
                    i16 += i10;
                    i13 += this.ak * -1741252353;
                    i19 += i11;
                    i14 = i20;
                }
                i11 = i16;
                i14 = i18;
                i16 = i15;
                while (true) {
                    i15 = i14 - 1;
                    if (i15 >= 0) {
                        ar(this.af, i13, i7, 0, i11 >> 14, i16 >> 14, (byte) 104);
                        i13 += -1741252353 * this.ak;
                        i11 += i10;
                        i16 += i9;
                        i14 = i15;
                    } else {
                        return;
                    }
                }
            }
            i17 = i4 << 14;
            if (i < 0) {
                i14 = i17 - (i * i10);
                i17 -= i * i11;
                i = 0;
            } else {
                i14 = i17;
            }
            i16 = i6 << 14;
            if (i12 < 0) {
                i16 -= i12 * i9;
                i12 = 0;
            }
            if ((i12 == i || i10 >= i11) && (i != i12 || i9 <= i11)) {
                i18 = i13 - i12;
                i19 = i14;
                i15 = i17;
                i14 = i12 - i;
                i13 = this.be[i];
                while (true) {
                    i20 = i14 - 1;
                    if (i20 < 0) {
                        break;
                    }
                    ar(this.af, i13, i7, 0, i15 >> 14, i19 >> 14, (byte) 28);
                    i15 += i11;
                    i13 += -1741252353 * this.ak;
                    i19 += i10;
                    i14 = i20;
                }
                i14 = i18;
                while (true) {
                    i18 = i14 - 1;
                    if (i18 >= 0) {
                        ar(this.af, i13, i7, 0, i15 >> 14, i16 >> 14, (byte) 60);
                        i13 += -1741252353 * this.ak;
                        i16 += i9;
                        i15 += i11;
                        i14 = i18;
                    } else {
                        return;
                    }
                }
            }
            i18 = i13 - i12;
            i19 = i14;
            i15 = i17;
            i14 = i12 - i;
            i13 = this.be[i];
            while (true) {
                i20 = i14 - 1;
                if (i20 < 0) {
                    break;
                }
                ar(this.af, i13, i7, 0, i19 >> 14, i15 >> 14, (byte) 60);
                i15 += i11;
                i13 += this.ak * -1741252353;
                i19 += i10;
                i14 = i20;
            }
            i14 = i18;
            while (true) {
                i18 = i14 - 1;
                if (i18 >= 0) {
                    ar(this.af, i13, i7, 0, i16 >> 14, i15 >> 14, (byte) 67);
                    i16 += i9;
                    i13 += this.ak * -1741252353;
                    i15 += i11;
                    i14 = i18;
                } else {
                    return;
                }
            }
        }
    }

    public final void dc(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        if (i2 != i) {
            i8 = ((i5 - i4) << 14) / (i2 - i);
        } else {
            i8 = 0;
        }
        if (i2 != i3) {
            i9 = ((i6 - i5) << 14) / (i3 - i2);
        } else {
            i9 = 0;
        }
        if (i != i3) {
            i10 = ((i4 - i6) << 14) / (i - i3);
        } else {
            i10 = 0;
        }
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        if (i > i2 || i > i3) {
            int i19;
            if (i2 <= i3) {
                if (i2 < -1759402563 * this.bv) {
                    if (i3 > this.bv * 843792845) {
                        i3 = -1759402563 * this.bv;
                    }
                    if (i > -1759402563 * this.bv) {
                        i11 = this.bv * -1759402563;
                    } else {
                        i11 = i;
                    }
                    if (i3 < i11) {
                        i12 = i5 << 14;
                        if (i2 < 0) {
                            i13 = i12 - (i2 * i8);
                            i12 -= i9 * i2;
                            i2 = 0;
                        } else {
                            i13 = i12;
                        }
                        i14 = i6 << 14;
                        if (i3 < 0) {
                            i14 -= i3 * i10;
                            i3 = 0;
                        }
                        if ((i2 == i3 || i8 >= i9) && (i3 != i2 || i8 <= i10)) {
                            i15 = i11 - i3;
                            i16 = i12;
                            i17 = i13;
                            i12 = i3 - i2;
                            i11 = this.be[i2];
                            while (true) {
                                i18 = i12 - 1;
                                if (i18 < 0) {
                                    break;
                                }
                                ar(this.af, i11, i7, 0, i16 >> 14, i17 >> 14, (byte) 59);
                                i17 += i8;
                                i11 += this.ak * -1741252353;
                                i16 += i9;
                                i12 = i18;
                            }
                            i9 = i14;
                            i12 = i15;
                            i14 = i17;
                            while (true) {
                                i17 = i12 - 1;
                                if (i17 >= 0) {
                                    ar(this.af, i11, i7, 0, i9 >> 14, i14 >> 14, (byte) 31);
                                    i11 += -1741252353 * this.ak;
                                    i9 += i10;
                                    i14 += i8;
                                    i12 = i17;
                                } else {
                                    return;
                                }
                            }
                        }
                        i15 = i11 - i3;
                        i16 = i12;
                        i17 = i13;
                        i12 = i3 - i2;
                        i11 = this.be[i2];
                        while (true) {
                            i18 = i12 - 1;
                            if (i18 < 0) {
                                break;
                            }
                            ar(this.af, i11, i7, 0, i17 >> 14, i16 >> 14, (byte) 53);
                            i17 += i8;
                            i11 += this.ak * -1741252353;
                            i16 += i9;
                            i12 = i18;
                        }
                        i9 = i17;
                        i12 = i15;
                        while (true) {
                            i17 = i12 - 1;
                            if (i17 >= 0) {
                                ar(this.af, i11, i7, 0, i9 >> 14, i14 >> 14, (byte) 102);
                                i14 += i10;
                                i11 += -1741252353 * this.ak;
                                i9 += i8;
                                i12 = i17;
                            } else {
                                return;
                            }
                        }
                    }
                    i13 = i5 << 14;
                    if (i2 < 0) {
                        i12 = i13 - (i8 * i2);
                        i13 -= i2 * i9;
                        i2 = 0;
                    } else {
                        i12 = i13;
                    }
                    i17 = i4 << 14;
                    if (i11 < 0) {
                        i17 -= i11 * i10;
                        i11 = 0;
                    }
                    if (i8 < i9) {
                        i15 = i3 - i11;
                        i19 = i11 - i2;
                        i11 = this.be[i2];
                        i16 = i12;
                        i14 = i13;
                        i12 = i19;
                        while (true) {
                            i18 = i12 - 1;
                            if (i18 < 0) {
                                break;
                            }
                            ar(this.af, i11, i7, 0, i16 >> 14, i14 >> 14, (byte) 109);
                            i14 += i9;
                            i11 += -1385393910 * this.ak;
                            i16 += i8;
                            i12 = i18;
                        }
                        i8 = i14;
                        i12 = i15;
                        i14 = i17;
                        while (true) {
                            i17 = i12 - 1;
                            if (i17 >= 0) {
                                ar(this.af, i11, i7, 0, i14 >> 14, i8 >> 14, (byte) 88);
                                i11 += this.ak * -1741252353;
                                i8 += i9;
                                i14 += i10;
                                i12 = i17;
                            } else {
                                return;
                            }
                        }
                    }
                    i15 = i3 - i11;
                    i19 = i11 - i2;
                    i11 = this.be[i2];
                    i16 = i12;
                    i14 = i13;
                    i12 = i19;
                    while (true) {
                        i18 = i12 - 1;
                        if (i18 < 0) {
                            break;
                        }
                        ar(this.af, i11, i7, 0, i14 >> 14, i16 >> 14, (byte) 19);
                        i14 += i9;
                        i11 += -1741252353 * this.ak;
                        i16 += i8;
                        i12 = i18;
                    }
                    i8 = i14;
                    i12 = i15;
                    while (true) {
                        i14 = i12 - 1;
                        if (i14 >= 0) {
                            ar(this.af, i11, i7, 0, i8 >> 14, i17 >> 14, (byte) 62);
                            i17 += i10;
                            i11 += -383904990 * this.ak;
                            i8 += i9;
                            i12 = i14;
                        } else {
                            return;
                        }
                    }
                }
            } else if (i3 < -1073236502 * this.bv) {
                if (i > this.bv * -654296798) {
                    i = -1759402563 * this.bv;
                }
                if (i2 > 1347877634 * this.bv) {
                    i11 = this.bv * -1759402563;
                } else {
                    i11 = i2;
                }
                if (i < i11) {
                    i12 = i6 << 14;
                    if (i3 < 0) {
                        i13 = i12 - (i3 * i9);
                        i12 -= i10 * i3;
                        i3 = 0;
                    } else {
                        i13 = i12;
                    }
                    i17 = i4 << 14;
                    if (i < 0) {
                        i17 -= i * i8;
                        i = 0;
                    }
                    if (i9 < i10) {
                        i15 = i11 - i;
                        i19 = i - i3;
                        i11 = this.be[i3];
                        i16 = i12;
                        i14 = i13;
                        i12 = i19;
                        while (true) {
                            i18 = i12 - 1;
                            if (i18 < 0) {
                                break;
                            }
                            ar(this.af, i11, i7, 0, i14 >> 14, i16 >> 14, (byte) 23);
                            i14 += i9;
                            i11 += 2008155961 * this.ak;
                            i16 += i10;
                            i12 = i18;
                        }
                        i12 = i15;
                        while (true) {
                            i15 = i12 - 1;
                            if (i15 >= 0) {
                                ar(this.af, i11, i7, 0, i14 >> 14, i17 >> 14, (byte) 57);
                                i17 += i8;
                                i11 += this.ak * -1741252353;
                                i14 += i9;
                                i12 = i15;
                            } else {
                                return;
                            }
                        }
                    }
                    i15 = i11 - i;
                    i19 = i - i3;
                    i11 = this.be[i3];
                    i16 = i12;
                    i14 = i13;
                    i12 = i19;
                    while (true) {
                        i18 = i12 - 1;
                        if (i18 < 0) {
                            break;
                        }
                        ar(this.af, i11, i7, 0, i16 >> 14, i14 >> 14, (byte) 57);
                        i14 += i9;
                        i11 += 1521185902 * this.ak;
                        i16 += i10;
                        i12 = i18;
                    }
                    i12 = i15;
                    while (true) {
                        i15 = i12 - 1;
                        if (i15 >= 0) {
                            ar(this.af, i11, i7, 0, i17 >> 14, i14 >> 14, (byte) 63);
                            i11 += this.ak * -1741252353;
                            i14 += i9;
                            i17 += i8;
                            i12 = i15;
                        } else {
                            return;
                        }
                    }
                }
                i14 = i6 << 14;
                if (i3 < 0) {
                    i12 = i14 - (i3 * i9);
                    i14 -= i10 * i3;
                    i3 = 0;
                } else {
                    i12 = i14;
                }
                i17 = i5 << 14;
                if (i11 < 0) {
                    i17 -= i8 * i11;
                    i13 = 0;
                } else {
                    i13 = i11;
                }
                if (i9 < i10) {
                    i15 = i - i13;
                    i13 -= i3;
                    i11 = this.be[i3];
                    i16 = i12;
                    i12 = i13;
                    while (true) {
                        i18 = i12 - 1;
                        if (i18 < 0) {
                            break;
                        }
                        ar(this.af, i11, i7, 0, i16 >> 14, i14 >> 14, (byte) 35);
                        i14 += i10;
                        i11 += -27971018 * this.ak;
                        i16 += i9;
                        i12 = i18;
                    }
                    i9 = i14;
                    i12 = i15;
                    while (true) {
                        i14 = i12 - 1;
                        if (i14 >= 0) {
                            ar(this.af, i11, i7, 0, i17 >> 14, i9 >> 14, (byte) 24);
                            i17 += i8;
                            i11 += this.ak * -1741252353;
                            i9 += i10;
                            i12 = i14;
                        } else {
                            return;
                        }
                    }
                }
                i15 = i - i13;
                i13 -= i3;
                i11 = this.be[i3];
                i16 = i12;
                i12 = i13;
                while (true) {
                    i18 = i12 - 1;
                    if (i18 < 0) {
                        break;
                    }
                    ar(this.af, i11, i7, 0, i14 >> 14, i16 >> 14, (byte) 124);
                    i14 += i10;
                    i11 += this.ak * -1741252353;
                    i16 += i9;
                    i12 = i18;
                }
                i9 = i14;
                i12 = i15;
                i14 = i17;
                while (true) {
                    i17 = i12 - 1;
                    if (i17 >= 0) {
                        ar(this.af, i11, i7, 0, i9 >> 14, i14 >> 14, (byte) 124);
                        i11 += this.ak * -1741252353;
                        i9 += i10;
                        i14 += i8;
                        i12 = i17;
                    } else {
                        return;
                    }
                }
            }
        } else if (i < this.bv * -2136419805) {
            if (i2 > this.bv * -1759402563) {
                i2 = -1759402563 * this.bv;
            }
            if (i3 > -1759402563 * this.bv) {
                i11 = this.bv * -722187615;
            } else {
                i11 = i3;
            }
            if (i2 < i11) {
                i13 = i4 << 14;
                if (i < 0) {
                    i12 = i13 - (i10 * i);
                    i13 -= i8 * i;
                    i = 0;
                } else {
                    i12 = i13;
                }
                i17 = i5 << 14;
                if (i2 < 0) {
                    i17 -= i9 * i2;
                    i2 = 0;
                }
                if ((i2 == i || i10 >= i8) && (i2 != i || i10 <= i9)) {
                    i15 = i11 - i2;
                    i14 = i12;
                    i16 = i13;
                    i12 = i2 - i;
                    i11 = this.be[i];
                    while (true) {
                        i18 = i12 - 1;
                        if (i18 < 0) {
                            break;
                        }
                        ar(this.af, i11, i7, 0, i16 >> 14, i14 >> 14, (byte) 106);
                        i14 += i10;
                        i11 += -94997679 * this.ak;
                        i16 += i8;
                        i12 = i18;
                    }
                    i8 = i14;
                    i12 = i15;
                    while (true) {
                        i14 = i12 - 1;
                        if (i14 >= 0) {
                            ar(this.af, i11, i7, 0, i17 >> 14, i8 >> 14, (byte) 115);
                            i17 += i9;
                            i11 += this.ak * -49853882;
                            i8 += i10;
                            i12 = i14;
                        } else {
                            return;
                        }
                    }
                }
                i15 = i11 - i2;
                i14 = i12;
                i16 = i13;
                i12 = i2 - i;
                i11 = this.be[i];
                while (true) {
                    i18 = i12 - 1;
                    if (i18 < 0) {
                        break;
                    }
                    ar(this.af, i11, i7, 0, i14 >> 14, i16 >> 14, (byte) 112);
                    i14 += i10;
                    i11 += this.ak * 2073277916;
                    i16 += i8;
                    i12 = i18;
                }
                i8 = i14;
                i12 = i15;
                i14 = i17;
                while (true) {
                    i17 = i12 - 1;
                    if (i17 >= 0) {
                        ar(this.af, i11, i7, 0, i8 >> 14, i14 >> 14, (byte) 90);
                        i11 += -1741252353 * this.ak;
                        i8 += i10;
                        i14 += i9;
                        i12 = i17;
                    } else {
                        return;
                    }
                }
            }
            i13 = i4 << 14;
            if (i < 0) {
                i12 = i13 - (i * i10);
                i13 -= i * i8;
                i = 0;
            } else {
                i12 = i13;
            }
            i14 = i6 << 14;
            if (i11 < 0) {
                i14 -= i11 * i9;
                i11 = 0;
            }
            if ((i11 == i || i10 >= i8) && (i != i11 || i9 <= i8)) {
                i15 = i2 - i11;
                i16 = i12;
                i17 = i13;
                i12 = i11 - i;
                i11 = this.be[i];
                while (true) {
                    i18 = i12 - 1;
                    if (i18 < 0) {
                        break;
                    }
                    ar(this.af, i11, i7, 0, i17 >> 14, i16 >> 14, (byte) 87);
                    i17 += i8;
                    i11 += -1741252353 * this.ak;
                    i16 += i10;
                    i12 = i18;
                }
                i12 = i15;
                while (true) {
                    i15 = i12 - 1;
                    if (i15 >= 0) {
                        ar(this.af, i11, i7, 0, i17 >> 14, i14 >> 14, (byte) 126);
                        i11 += 1587489504 * this.ak;
                        i14 += i9;
                        i17 += i8;
                        i12 = i15;
                    } else {
                        return;
                    }
                }
            }
            i15 = i2 - i11;
            i16 = i12;
            i17 = i13;
            i12 = i11 - i;
            i11 = this.be[i];
            while (true) {
                i18 = i12 - 1;
                if (i18 < 0) {
                    break;
                }
                ar(this.af, i11, i7, 0, i16 >> 14, i17 >> 14, (byte) 91);
                i17 += i8;
                i11 += this.ak * -1741252353;
                i16 += i10;
                i12 = i18;
            }
            i12 = i15;
            while (true) {
                i15 = i12 - 1;
                if (i15 >= 0) {
                    ar(this.af, i11, i7, 0, i14 >> 14, i17 >> 14, (byte) 47);
                    i14 += i9;
                    i11 += this.ak * 1130222437;
                    i17 += i8;
                    i12 = i15;
                } else {
                    return;
                }
            }
        }
    }

    public final void dj(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        if (i2 != i) {
            i8 = ((i5 - i4) << 14) / (i2 - i);
        } else {
            i8 = 0;
        }
        if (i2 != i3) {
            i9 = ((i6 - i5) << 14) / (i3 - i2);
        } else {
            i9 = 0;
        }
        if (i != i3) {
            i10 = ((i4 - i6) << 14) / (i - i3);
        } else {
            i10 = 0;
        }
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        if (i > i2 || i > i3) {
            int i19;
            if (i2 <= i3) {
                if (i2 < -1759402563 * this.bv) {
                    if (i3 > this.bv * -674590930) {
                        i3 = -1759402563 * this.bv;
                    }
                    if (i > 533402719 * this.bv) {
                        i11 = this.bv * -1759402563;
                    } else {
                        i11 = i;
                    }
                    if (i3 < i11) {
                        i12 = i5 << 14;
                        if (i2 < 0) {
                            i13 = i12 - (i2 * i8);
                            i12 -= i9 * i2;
                            i2 = 0;
                        } else {
                            i13 = i12;
                        }
                        i14 = i6 << 14;
                        if (i3 < 0) {
                            i14 -= i3 * i10;
                            i3 = 0;
                        }
                        if ((i2 == i3 || i8 >= i9) && (i3 != i2 || i8 <= i10)) {
                            i15 = i11 - i3;
                            i16 = i12;
                            i17 = i13;
                            i12 = i3 - i2;
                            i11 = this.be[i2];
                            while (true) {
                                i18 = i12 - 1;
                                if (i18 < 0) {
                                    break;
                                }
                                ar(this.af, i11, i7, 0, i16 >> 14, i17 >> 14, (byte) 35);
                                i17 += i8;
                                i11 += this.ak * -1741252353;
                                i16 += i9;
                                i12 = i18;
                            }
                            i9 = i17;
                            i12 = i15;
                            while (true) {
                                i17 = i12 - 1;
                                if (i17 >= 0) {
                                    ar(this.af, i11, i7, 0, i14 >> 14, i9 >> 14, (byte) 109);
                                    i14 += i10;
                                    i11 += -1741252353 * this.ak;
                                    i9 += i8;
                                    i12 = i17;
                                } else {
                                    return;
                                }
                            }
                        }
                        i15 = i11 - i3;
                        i16 = i12;
                        i17 = i13;
                        i12 = i3 - i2;
                        i11 = this.be[i2];
                        while (true) {
                            i18 = i12 - 1;
                            if (i18 < 0) {
                                break;
                            }
                            ar(this.af, i11, i7, 0, i17 >> 14, i16 >> 14, (byte) 121);
                            i17 += i8;
                            i11 += this.ak * -1741252353;
                            i16 += i9;
                            i12 = i18;
                        }
                        i9 = i14;
                        i12 = i15;
                        i14 = i17;
                        while (true) {
                            i17 = i12 - 1;
                            if (i17 >= 0) {
                                ar(this.af, i11, i7, 0, i14 >> 14, i9 >> 14, (byte) 43);
                                i11 += -1741252353 * this.ak;
                                i9 += i10;
                                i14 += i8;
                                i12 = i17;
                            } else {
                                return;
                            }
                        }
                    }
                    i13 = i5 << 14;
                    if (i2 < 0) {
                        i12 = i13 - (i8 * i2);
                        i13 -= i2 * i9;
                        i2 = 0;
                    } else {
                        i12 = i13;
                    }
                    i17 = i4 << 14;
                    if (i11 < 0) {
                        i17 -= i11 * i10;
                        i11 = 0;
                    }
                    if (i8 < i9) {
                        i15 = i3 - i11;
                        i19 = i11 - i2;
                        i11 = this.be[i2];
                        i16 = i12;
                        i14 = i13;
                        i12 = i19;
                        while (true) {
                            i18 = i12 - 1;
                            if (i18 < 0) {
                                break;
                            }
                            ar(this.af, i11, i7, 0, i16 >> 14, i14 >> 14, (byte) 58);
                            i14 += i9;
                            i11 += -842885926 * this.ak;
                            i16 += i8;
                            i12 = i18;
                        }
                        i12 = i15;
                        while (true) {
                            i15 = i12 - 1;
                            if (i15 >= 0) {
                                ar(this.af, i11, i7, 0, i17 >> 14, i14 >> 14, (byte) 77);
                                i17 += i10;
                                i11 += this.ak * -1741252353;
                                i14 += i9;
                                i12 = i15;
                            } else {
                                return;
                            }
                        }
                    }
                    i15 = i3 - i11;
                    i19 = i11 - i2;
                    i11 = this.be[i2];
                    i16 = i12;
                    i14 = i13;
                    i12 = i19;
                    while (true) {
                        i18 = i12 - 1;
                        if (i18 < 0) {
                            break;
                        }
                        ar(this.af, i11, i7, 0, i14 >> 14, i16 >> 14, (byte) 40);
                        i14 += i9;
                        i11 += -1741252353 * this.ak;
                        i16 += i8;
                        i12 = i18;
                    }
                    i12 = i15;
                    while (true) {
                        i15 = i12 - 1;
                        if (i15 >= 0) {
                            ar(this.af, i11, i7, 0, i14 >> 14, i17 >> 14, (byte) 19);
                            i11 += 1501622557 * this.ak;
                            i14 += i9;
                            i17 += i10;
                            i12 = i15;
                        } else {
                            return;
                        }
                    }
                }
            } else if (i3 < -1759402563 * this.bv) {
                if (i > this.bv * -1759402563) {
                    i = 1438466713 * this.bv;
                }
                if (i2 > -1759402563 * this.bv) {
                    i11 = this.bv * 51413096;
                } else {
                    i11 = i2;
                }
                if (i < i11) {
                    i12 = i6 << 14;
                    if (i3 < 0) {
                        i13 = i12 - (i3 * i9);
                        i12 -= i10 * i3;
                        i3 = 0;
                    } else {
                        i13 = i12;
                    }
                    i17 = i4 << 14;
                    if (i < 0) {
                        i17 -= i * i8;
                        i = 0;
                    }
                    if (i9 < i10) {
                        i15 = i11 - i;
                        i19 = i - i3;
                        i11 = this.be[i3];
                        i16 = i12;
                        i14 = i13;
                        i12 = i19;
                        while (true) {
                            i18 = i12 - 1;
                            if (i18 < 0) {
                                break;
                            }
                            ar(this.af, i11, i7, 0, i14 >> 14, i16 >> 14, (byte) 76);
                            i14 += i9;
                            i11 += -1741252353 * this.ak;
                            i16 += i10;
                            i12 = i18;
                        }
                        i12 = i15;
                        while (true) {
                            i15 = i12 - 1;
                            if (i15 >= 0) {
                                ar(this.af, i11, i7, 0, i14 >> 14, i17 >> 14, (byte) 119);
                                i17 += i8;
                                i11 += this.ak * -226163218;
                                i14 += i9;
                                i12 = i15;
                            } else {
                                return;
                            }
                        }
                    }
                    i15 = i11 - i;
                    i19 = i - i3;
                    i11 = this.be[i3];
                    i16 = i12;
                    i14 = i13;
                    i12 = i19;
                    while (true) {
                        i18 = i12 - 1;
                        if (i18 < 0) {
                            break;
                        }
                        ar(this.af, i11, i7, 0, i16 >> 14, i14 >> 14, (byte) 50);
                        i14 += i9;
                        i11 += -1369823886 * this.ak;
                        i16 += i10;
                        i12 = i18;
                    }
                    i12 = i15;
                    while (true) {
                        i15 = i12 - 1;
                        if (i15 >= 0) {
                            ar(this.af, i11, i7, 0, i17 >> 14, i14 >> 14, (byte) 93);
                            i11 += this.ak * -1741252353;
                            i14 += i9;
                            i17 += i8;
                            i12 = i15;
                        } else {
                            return;
                        }
                    }
                }
                i12 = i6 << 14;
                if (i3 < 0) {
                    i13 = i12 - (i3 * i9);
                    i12 -= i10 * i3;
                    i3 = 0;
                } else {
                    i13 = i12;
                }
                i17 = i5 << 14;
                if (i11 < 0) {
                    i17 -= i11 * i8;
                    i11 = 0;
                }
                if (i9 < i10) {
                    i15 = i - i11;
                    i19 = i11 - i3;
                    i11 = this.be[i3];
                    i14 = i12;
                    i16 = i13;
                    i12 = i19;
                    while (true) {
                        i18 = i12 - 1;
                        if (i18 < 0) {
                            break;
                        }
                        ar(this.af, i11, i7, 0, i16 >> 14, i14 >> 14, (byte) 8);
                        i14 += i10;
                        i11 += -1741252353 * this.ak;
                        i16 += i9;
                        i12 = i18;
                    }
                    i9 = i14;
                    i12 = i15;
                    while (true) {
                        i14 = i12 - 1;
                        if (i14 >= 0) {
                            ar(this.af, i11, i7, 0, i17 >> 14, i9 >> 14, (byte) 23);
                            i17 += i8;
                            i11 += this.ak * -69929916;
                            i9 += i10;
                            i12 = i14;
                        } else {
                            return;
                        }
                    }
                }
                i15 = i - i11;
                i19 = i11 - i3;
                i11 = this.be[i3];
                i14 = i12;
                i16 = i13;
                i12 = i19;
                while (true) {
                    i18 = i12 - 1;
                    if (i18 < 0) {
                        break;
                    }
                    ar(this.af, i11, i7, 0, i14 >> 14, i16 >> 14, (byte) 31);
                    i14 += i10;
                    i11 += this.ak * 1529427361;
                    i16 += i9;
                    i12 = i18;
                }
                i9 = i14;
                i12 = i15;
                i14 = i17;
                while (true) {
                    i17 = i12 - 1;
                    if (i17 >= 0) {
                        ar(this.af, i11, i7, 0, i9 >> 14, i14 >> 14, (byte) 29);
                        i11 += this.ak * 739233481;
                        i9 += i10;
                        i14 += i8;
                        i12 = i17;
                    } else {
                        return;
                    }
                }
            }
        } else if (i < this.bv * -1759402563) {
            if (i2 > this.bv * 1860205044) {
                i2 = -1022567491 * this.bv;
            }
            if (i3 > -1759402563 * this.bv) {
                i11 = this.bv * -1759402563;
            } else {
                i11 = i3;
            }
            if (i2 < i11) {
                i13 = i4 << 14;
                if (i < 0) {
                    i12 = i13 - (i10 * i);
                    i13 -= i8 * i;
                    i = 0;
                } else {
                    i12 = i13;
                }
                i17 = i5 << 14;
                if (i2 < 0) {
                    i17 -= i9 * i2;
                    i2 = 0;
                }
                if ((i2 == i || i10 >= i8) && (i2 != i || i10 <= i9)) {
                    i15 = i11 - i2;
                    i14 = i12;
                    i16 = i13;
                    i12 = i2 - i;
                    i11 = this.be[i];
                    while (true) {
                        i18 = i12 - 1;
                        if (i18 < 0) {
                            break;
                        }
                        ar(this.af, i11, i7, 0, i16 >> 14, i14 >> 14, (byte) 103);
                        i14 += i10;
                        i11 += -1880822811 * this.ak;
                        i16 += i8;
                        i12 = i18;
                    }
                    i12 = i15;
                    while (true) {
                        i15 = i12 - 1;
                        if (i15 >= 0) {
                            ar(this.af, i11, i7, 0, i17 >> 14, i14 >> 14, (byte) 124);
                            i17 += i9;
                            i11 += this.ak * 265516311;
                            i14 += i10;
                            i12 = i15;
                        } else {
                            return;
                        }
                    }
                }
                i15 = i11 - i2;
                i14 = i12;
                i16 = i13;
                i12 = i2 - i;
                i11 = this.be[i];
                while (true) {
                    i18 = i12 - 1;
                    if (i18 < 0) {
                        break;
                    }
                    ar(this.af, i11, i7, 0, i14 >> 14, i16 >> 14, (byte) 55);
                    i14 += i10;
                    i11 += this.ak * -1670229309;
                    i16 += i8;
                    i12 = i18;
                }
                i12 = i15;
                while (true) {
                    i15 = i12 - 1;
                    if (i15 >= 0) {
                        ar(this.af, i11, i7, 0, i14 >> 14, i17 >> 14, (byte) 79);
                        i11 += -1962086162 * this.ak;
                        i14 += i10;
                        i17 += i9;
                        i12 = i15;
                    } else {
                        return;
                    }
                }
            }
            i13 = i4 << 14;
            if (i < 0) {
                i12 = i13 - (i * i10);
                i17 = i13 - (i * i8);
                i = 0;
            } else {
                i12 = i13;
                i17 = i13;
            }
            i14 = i6 << 14;
            if (i11 < 0) {
                i14 -= i9 * i11;
                i13 = 0;
            } else {
                i13 = i11;
            }
            if ((i13 == i || i10 >= i8) && (i != i13 || i9 <= i8)) {
                i15 = i2 - i13;
                i13 -= i;
                i11 = this.be[i];
                i16 = i12;
                i12 = i13;
                while (true) {
                    i18 = i12 - 1;
                    if (i18 < 0) {
                        break;
                    }
                    ar(this.af, i11, i7, 0, i17 >> 14, i16 >> 14, (byte) 126);
                    i17 += i8;
                    i11 += 1885911592 * this.ak;
                    i16 += i10;
                    i12 = i18;
                }
                i12 = i15;
                while (true) {
                    i15 = i12 - 1;
                    if (i15 >= 0) {
                        ar(this.af, i11, i7, 0, i17 >> 14, i14 >> 14, (byte) 77);
                        i14 += i9;
                        i11 += -1690196789 * this.ak;
                        i17 += i8;
                        i12 = i15;
                    } else {
                        return;
                    }
                }
            }
            i15 = i2 - i13;
            i13 -= i;
            i11 = this.be[i];
            i16 = i12;
            i12 = i13;
            while (true) {
                i18 = i12 - 1;
                if (i18 < 0) {
                    break;
                }
                ar(this.af, i11, i7, 0, i16 >> 14, i17 >> 14, (byte) 110);
                i17 += i8;
                i11 += this.ak * 1685644343;
                i16 += i10;
                i12 = i18;
            }
            i12 = i15;
            while (true) {
                i15 = i12 - 1;
                if (i15 >= 0) {
                    ar(this.af, i11, i7, 0, i14 >> 14, i17 >> 14, (byte) 4);
                    i11 += this.ak * 1819327329;
                    i14 += i9;
                    i17 += i8;
                    i12 = i15;
                } else {
                    return;
                }
            }
        }
    }

    public final void dk(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        if (i2 != i) {
            i8 = ((i5 - i4) << 14) / (i2 - i);
        } else {
            i8 = 0;
        }
        if (i2 != i3) {
            i9 = ((i6 - i5) << 14) / (i3 - i2);
        } else {
            i9 = 0;
        }
        if (i != i3) {
            i10 = ((i4 - i6) << 14) / (i - i3);
        } else {
            i10 = 0;
        }
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        if (i > i2 || i > i3) {
            if (i2 <= i3) {
                if (i2 < -1759402563 * this.bv) {
                    if (i3 > this.bv * -1759402563) {
                        i3 = -1759402563 * this.bv;
                    }
                    if (i > -1759402563 * this.bv) {
                        i11 = this.bv * -1759402563;
                    } else {
                        i11 = i;
                    }
                    if (i3 < i11) {
                        i12 = i5 << 14;
                        if (i2 < 0) {
                            i13 = i12 - (i2 * i8);
                            i12 -= i9 * i2;
                            i2 = 0;
                        } else {
                            i13 = i12;
                        }
                        i14 = i6 << 14;
                        if (i3 < 0) {
                            i14 -= i3 * i10;
                            i3 = 0;
                        }
                        if ((i2 == i3 || i8 >= i9) && (i3 != i2 || i8 <= i10)) {
                            i15 = i11 - i3;
                            i16 = i12;
                            i17 = i13;
                            i12 = i3 - i2;
                            i11 = this.be[i2];
                            while (true) {
                                i18 = i12 - 1;
                                if (i18 < 0) {
                                    break;
                                }
                                ar(this.af, i11, i7, 0, i16 >> 14, i17 >> 14, (byte) 103);
                                i17 += i8;
                                i11 += this.ak * -1741252353;
                                i16 += i9;
                                i12 = i18;
                            }
                            i9 = i17;
                            i12 = i15;
                            while (true) {
                                i17 = i12 - 1;
                                if (i17 >= 0) {
                                    ar(this.af, i11, i7, 0, i14 >> 14, i9 >> 14, (byte) 78);
                                    i14 += i10;
                                    i11 += -1741252353 * this.ak;
                                    i9 += i8;
                                    i12 = i17;
                                } else {
                                    return;
                                }
                            }
                        }
                        i15 = i11 - i3;
                        i16 = i12;
                        i17 = i13;
                        i12 = i3 - i2;
                        i11 = this.be[i2];
                        while (true) {
                            i18 = i12 - 1;
                            if (i18 < 0) {
                                break;
                            }
                            ar(this.af, i11, i7, 0, i17 >> 14, i16 >> 14, (byte) 115);
                            i17 += i8;
                            i11 += this.ak * -1741252353;
                            i16 += i9;
                            i12 = i18;
                        }
                        i9 = i14;
                        i12 = i15;
                        i14 = i17;
                        while (true) {
                            i17 = i12 - 1;
                            if (i17 >= 0) {
                                ar(this.af, i11, i7, 0, i14 >> 14, i9 >> 14, (byte) 63);
                                i11 += -1741252353 * this.ak;
                                i9 += i10;
                                i14 += i8;
                                i12 = i17;
                            } else {
                                return;
                            }
                        }
                    }
                    i13 = i5 << 14;
                    if (i2 < 0) {
                        i12 = i13 - (i8 * i2);
                        i14 = i13 - (i2 * i9);
                        i2 = 0;
                    } else {
                        i12 = i13;
                        i14 = i13;
                    }
                    i17 = i4 << 14;
                    if (i11 < 0) {
                        i17 -= i10 * i11;
                        i13 = 0;
                    } else {
                        i13 = i11;
                    }
                    if (i8 < i9) {
                        i15 = i3 - i13;
                        i13 -= i2;
                        i11 = this.be[i2];
                        i16 = i12;
                        i12 = i13;
                        while (true) {
                            i18 = i12 - 1;
                            if (i18 < 0) {
                                break;
                            }
                            ar(this.af, i11, i7, 0, i16 >> 14, i14 >> 14, (byte) 26);
                            i14 += i9;
                            i11 += -1741252353 * this.ak;
                            i16 += i8;
                            i12 = i18;
                        }
                        i8 = i14;
                        i12 = i15;
                        while (true) {
                            i14 = i12 - 1;
                            if (i14 >= 0) {
                                ar(this.af, i11, i7, 0, i17 >> 14, i8 >> 14, (byte) 59);
                                i17 += i10;
                                i11 += this.ak * -1741252353;
                                i8 += i9;
                                i12 = i14;
                            } else {
                                return;
                            }
                        }
                    }
                    i15 = i3 - i13;
                    i13 -= i2;
                    i11 = this.be[i2];
                    i16 = i12;
                    i12 = i13;
                    while (true) {
                        i18 = i12 - 1;
                        if (i18 < 0) {
                            break;
                        }
                        ar(this.af, i11, i7, 0, i14 >> 14, i16 >> 14, (byte) 18);
                        i14 += i9;
                        i11 += -1741252353 * this.ak;
                        i16 += i8;
                        i12 = i18;
                    }
                    i8 = i14;
                    i12 = i15;
                    i14 = i17;
                    while (true) {
                        i17 = i12 - 1;
                        if (i17 >= 0) {
                            ar(this.af, i11, i7, 0, i8 >> 14, i14 >> 14, (byte) 84);
                            i11 += -1741252353 * this.ak;
                            i8 += i9;
                            i14 += i10;
                            i12 = i17;
                        } else {
                            return;
                        }
                    }
                }
            } else if (i3 < -1759402563 * this.bv) {
                if (i > this.bv * -1759402563) {
                    i = -1759402563 * this.bv;
                }
                if (i2 > -1759402563 * this.bv) {
                    i11 = this.bv * -1759402563;
                } else {
                    i11 = i2;
                }
                if (i < i11) {
                    i12 = i6 << 14;
                    if (i3 < 0) {
                        i13 = i12 - (i3 * i9);
                        i12 -= i10 * i3;
                        i3 = 0;
                    } else {
                        i13 = i12;
                    }
                    i17 = i4 << 14;
                    if (i < 0) {
                        i17 -= i * i8;
                        i = 0;
                    }
                    int i19;
                    if (i9 < i10) {
                        i15 = i11 - i;
                        i19 = i - i3;
                        i11 = this.be[i3];
                        i16 = i12;
                        i14 = i13;
                        i12 = i19;
                        while (true) {
                            i18 = i12 - 1;
                            if (i18 < 0) {
                                break;
                            }
                            ar(this.af, i11, i7, 0, i14 >> 14, i16 >> 14, (byte) 116);
                            i14 += i9;
                            i11 += -1741252353 * this.ak;
                            i16 += i10;
                            i12 = i18;
                        }
                        i12 = i15;
                        while (true) {
                            i15 = i12 - 1;
                            if (i15 >= 0) {
                                ar(this.af, i11, i7, 0, i14 >> 14, i17 >> 14, (byte) 22);
                                i17 += i8;
                                i11 += this.ak * -1741252353;
                                i14 += i9;
                                i12 = i15;
                            } else {
                                return;
                            }
                        }
                    }
                    i15 = i11 - i;
                    i19 = i - i3;
                    i11 = this.be[i3];
                    i16 = i12;
                    i14 = i13;
                    i12 = i19;
                    while (true) {
                        i18 = i12 - 1;
                        if (i18 < 0) {
                            break;
                        }
                        ar(this.af, i11, i7, 0, i16 >> 14, i14 >> 14, (byte) 29);
                        i14 += i9;
                        i11 += -1741252353 * this.ak;
                        i16 += i10;
                        i12 = i18;
                    }
                    i12 = i15;
                    while (true) {
                        i15 = i12 - 1;
                        if (i15 >= 0) {
                            ar(this.af, i11, i7, 0, i17 >> 14, i14 >> 14, (byte) 28);
                            i11 += this.ak * -1741252353;
                            i14 += i9;
                            i17 += i8;
                            i12 = i15;
                        } else {
                            return;
                        }
                    }
                }
                i14 = i6 << 14;
                if (i3 < 0) {
                    i12 = i14 - (i3 * i9);
                    i14 -= i10 * i3;
                    i3 = 0;
                } else {
                    i12 = i14;
                }
                i17 = i5 << 14;
                if (i11 < 0) {
                    i17 -= i8 * i11;
                    i13 = 0;
                } else {
                    i13 = i11;
                }
                if (i9 < i10) {
                    i15 = i - i13;
                    i13 -= i3;
                    i11 = this.be[i3];
                    i16 = i12;
                    i12 = i13;
                    while (true) {
                        i18 = i12 - 1;
                        if (i18 < 0) {
                            break;
                        }
                        ar(this.af, i11, i7, 0, i16 >> 14, i14 >> 14, (byte) 63);
                        i14 += i10;
                        i11 += -1741252353 * this.ak;
                        i16 += i9;
                        i12 = i18;
                    }
                    i9 = i14;
                    i12 = i15;
                    while (true) {
                        i14 = i12 - 1;
                        if (i14 >= 0) {
                            ar(this.af, i11, i7, 0, i17 >> 14, i9 >> 14, (byte) 21);
                            i17 += i8;
                            i11 += this.ak * -1741252353;
                            i9 += i10;
                            i12 = i14;
                        } else {
                            return;
                        }
                    }
                }
                i15 = i - i13;
                i13 -= i3;
                i11 = this.be[i3];
                i16 = i12;
                i12 = i13;
                while (true) {
                    i18 = i12 - 1;
                    if (i18 < 0) {
                        break;
                    }
                    ar(this.af, i11, i7, 0, i14 >> 14, i16 >> 14, (byte) 44);
                    i14 += i10;
                    i11 += this.ak * -1741252353;
                    i16 += i9;
                    i12 = i18;
                }
                i9 = i14;
                i12 = i15;
                i14 = i17;
                while (true) {
                    i17 = i12 - 1;
                    if (i17 >= 0) {
                        ar(this.af, i11, i7, 0, i9 >> 14, i14 >> 14, (byte) 104);
                        i11 += this.ak * -1741252353;
                        i9 += i10;
                        i14 += i8;
                        i12 = i17;
                    } else {
                        return;
                    }
                }
            }
        } else if (i < this.bv * -1759402563) {
            if (i2 > this.bv * -1759402563) {
                i2 = -1759402563 * this.bv;
            }
            if (i3 > -1759402563 * this.bv) {
                i11 = this.bv * -1759402563;
            } else {
                i11 = i3;
            }
            if (i2 < i11) {
                i13 = i4 << 14;
                if (i < 0) {
                    i12 = i13 - (i10 * i);
                    i13 -= i8 * i;
                    i = 0;
                } else {
                    i12 = i13;
                }
                i17 = i5 << 14;
                if (i2 < 0) {
                    i17 -= i9 * i2;
                    i2 = 0;
                }
                if ((i2 == i || i10 >= i8) && (i2 != i || i10 <= i9)) {
                    i15 = i11 - i2;
                    i14 = i12;
                    i16 = i13;
                    i12 = i2 - i;
                    i11 = this.be[i];
                    while (true) {
                        i18 = i12 - 1;
                        if (i18 < 0) {
                            break;
                        }
                        ar(this.af, i11, i7, 0, i16 >> 14, i14 >> 14, (byte) 36);
                        i14 += i10;
                        i11 += -1741252353 * this.ak;
                        i16 += i8;
                        i12 = i18;
                    }
                    i8 = i14;
                    i12 = i15;
                    while (true) {
                        i14 = i12 - 1;
                        if (i14 >= 0) {
                            ar(this.af, i11, i7, 0, i17 >> 14, i8 >> 14, (byte) 37);
                            i17 += i9;
                            i11 += this.ak * -1741252353;
                            i8 += i10;
                            i12 = i14;
                        } else {
                            return;
                        }
                    }
                }
                i15 = i11 - i2;
                i14 = i12;
                i16 = i13;
                i12 = i2 - i;
                i11 = this.be[i];
                while (true) {
                    i18 = i12 - 1;
                    if (i18 < 0) {
                        break;
                    }
                    ar(this.af, i11, i7, 0, i14 >> 14, i16 >> 14, (byte) 33);
                    i14 += i10;
                    i11 += this.ak * -1741252353;
                    i16 += i8;
                    i12 = i18;
                }
                i8 = i14;
                i12 = i15;
                i14 = i17;
                while (true) {
                    i17 = i12 - 1;
                    if (i17 >= 0) {
                        ar(this.af, i11, i7, 0, i8 >> 14, i14 >> 14, (byte) 29);
                        i11 += -1741252353 * this.ak;
                        i8 += i10;
                        i14 += i9;
                        i12 = i17;
                    } else {
                        return;
                    }
                }
            }
            i13 = i4 << 14;
            if (i < 0) {
                i12 = i13 - (i * i10);
                i17 = i13 - (i * i8);
                i = 0;
            } else {
                i12 = i13;
                i17 = i13;
            }
            i14 = i6 << 14;
            if (i11 < 0) {
                i14 -= i9 * i11;
                i13 = 0;
            } else {
                i13 = i11;
            }
            if ((i13 == i || i10 >= i8) && (i != i13 || i9 <= i8)) {
                i15 = i2 - i13;
                i13 -= i;
                i11 = this.be[i];
                i16 = i12;
                i12 = i13;
                while (true) {
                    i18 = i12 - 1;
                    if (i18 < 0) {
                        break;
                    }
                    ar(this.af, i11, i7, 0, i17 >> 14, i16 >> 14, (byte) 76);
                    i17 += i8;
                    i11 += -1741252353 * this.ak;
                    i16 += i10;
                    i12 = i18;
                }
                i12 = i15;
                while (true) {
                    i15 = i12 - 1;
                    if (i15 >= 0) {
                        ar(this.af, i11, i7, 0, i17 >> 14, i14 >> 14, (byte) 32);
                        i14 += i9;
                        i11 += -1741252353 * this.ak;
                        i17 += i8;
                        i12 = i15;
                    } else {
                        return;
                    }
                }
            }
            i15 = i2 - i13;
            i13 -= i;
            i11 = this.be[i];
            i16 = i12;
            i12 = i13;
            while (true) {
                i18 = i12 - 1;
                if (i18 < 0) {
                    break;
                }
                ar(this.af, i11, i7, 0, i16 >> 14, i17 >> 14, (byte) 6);
                i17 += i8;
                i11 += this.ak * -1741252353;
                i16 += i10;
                i12 = i18;
            }
            i12 = i15;
            while (true) {
                i15 = i12 - 1;
                if (i15 >= 0) {
                    ar(this.af, i11, i7, 0, i14 >> 14, i17 >> 14, (byte) 41);
                    i11 += this.ak * -1741252353;
                    i14 += i9;
                    i17 += i8;
                    i12 = i15;
                } else {
                    return;
                }
            }
        }
    }

    public final void m2do(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        if (i2 != i) {
            i8 = ((i5 - i4) << 14) / (i2 - i);
        } else {
            i8 = 0;
        }
        if (i2 != i3) {
            i9 = ((i6 - i5) << 14) / (i3 - i2);
        } else {
            i9 = 0;
        }
        if (i != i3) {
            i10 = ((i4 - i6) << 14) / (i - i3);
        } else {
            i10 = 0;
        }
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        if (i > i2 || i > i3) {
            if (i2 <= i3) {
                if (i2 < -1759402563 * this.bv) {
                    if (i3 > this.bv * -1759402563) {
                        i3 = -1759402563 * this.bv;
                    }
                    if (i > -1759402563 * this.bv) {
                        i11 = this.bv * -1759402563;
                    } else {
                        i11 = i;
                    }
                    if (i3 < i11) {
                        i12 = i5 << 14;
                        if (i2 < 0) {
                            i13 = i12 - (i2 * i8);
                            i12 -= i9 * i2;
                            i2 = 0;
                        } else {
                            i13 = i12;
                        }
                        i14 = i6 << 14;
                        if (i3 < 0) {
                            i14 -= i3 * i10;
                            i3 = 0;
                        }
                        if ((i2 == i3 || i8 >= i9) && (i3 != i2 || i8 <= i10)) {
                            i15 = i11 - i3;
                            i16 = i12;
                            i17 = i13;
                            i12 = i3 - i2;
                            i11 = this.be[i2];
                            while (true) {
                                i18 = i12 - 1;
                                if (i18 < 0) {
                                    break;
                                }
                                ar(this.af, i11, i7, 0, i16 >> 14, i17 >> 14, (byte) 76);
                                i17 += i8;
                                i11 += this.ak * -1741252353;
                                i16 += i9;
                                i12 = i18;
                            }
                            i9 = i17;
                            i12 = i15;
                            while (true) {
                                i17 = i12 - 1;
                                if (i17 >= 0) {
                                    ar(this.af, i11, i7, 0, i14 >> 14, i9 >> 14, (byte) 109);
                                    i14 += i10;
                                    i11 += -1741252353 * this.ak;
                                    i9 += i8;
                                    i12 = i17;
                                } else {
                                    return;
                                }
                            }
                        }
                        i15 = i11 - i3;
                        i16 = i12;
                        i17 = i13;
                        i12 = i3 - i2;
                        i11 = this.be[i2];
                        while (true) {
                            i18 = i12 - 1;
                            if (i18 < 0) {
                                break;
                            }
                            ar(this.af, i11, i7, 0, i17 >> 14, i16 >> 14, (byte) 24);
                            i17 += i8;
                            i11 += this.ak * -1741252353;
                            i16 += i9;
                            i12 = i18;
                        }
                        i9 = i14;
                        i12 = i15;
                        i14 = i17;
                        while (true) {
                            i17 = i12 - 1;
                            if (i17 >= 0) {
                                ar(this.af, i11, i7, 0, i14 >> 14, i9 >> 14, (byte) 91);
                                i11 += -1741252353 * this.ak;
                                i9 += i10;
                                i14 += i8;
                                i12 = i17;
                            } else {
                                return;
                            }
                        }
                    }
                    i13 = i5 << 14;
                    if (i2 < 0) {
                        i12 = i13 - (i8 * i2);
                        i14 = i13 - (i2 * i9);
                        i2 = 0;
                    } else {
                        i12 = i13;
                        i14 = i13;
                    }
                    i17 = i4 << 14;
                    if (i11 < 0) {
                        i17 -= i10 * i11;
                        i13 = 0;
                    } else {
                        i13 = i11;
                    }
                    if (i8 < i9) {
                        i15 = i3 - i13;
                        i13 -= i2;
                        i11 = this.be[i2];
                        i16 = i12;
                        i12 = i13;
                        while (true) {
                            i18 = i12 - 1;
                            if (i18 < 0) {
                                break;
                            }
                            ar(this.af, i11, i7, 0, i16 >> 14, i14 >> 14, (byte) 59);
                            i14 += i9;
                            i11 += -1741252353 * this.ak;
                            i16 += i8;
                            i12 = i18;
                        }
                        i8 = i14;
                        i12 = i15;
                        while (true) {
                            i14 = i12 - 1;
                            if (i14 >= 0) {
                                ar(this.af, i11, i7, 0, i17 >> 14, i8 >> 14, (byte) 104);
                                i17 += i10;
                                i11 += this.ak * -1741252353;
                                i8 += i9;
                                i12 = i14;
                            } else {
                                return;
                            }
                        }
                    }
                    i15 = i3 - i13;
                    i13 -= i2;
                    i11 = this.be[i2];
                    i16 = i12;
                    i12 = i13;
                    while (true) {
                        i18 = i12 - 1;
                        if (i18 < 0) {
                            break;
                        }
                        ar(this.af, i11, i7, 0, i14 >> 14, i16 >> 14, (byte) 86);
                        i14 += i9;
                        i11 += -1741252353 * this.ak;
                        i16 += i8;
                        i12 = i18;
                    }
                    i8 = i14;
                    i12 = i15;
                    i14 = i17;
                    while (true) {
                        i17 = i12 - 1;
                        if (i17 >= 0) {
                            ar(this.af, i11, i7, 0, i8 >> 14, i14 >> 14, (byte) 104);
                            i11 += -1741252353 * this.ak;
                            i8 += i9;
                            i14 += i10;
                            i12 = i17;
                        } else {
                            return;
                        }
                    }
                }
            } else if (i3 < -1759402563 * this.bv) {
                if (i > this.bv * -1759402563) {
                    i = -1759402563 * this.bv;
                }
                if (i2 > -1759402563 * this.bv) {
                    i11 = this.bv * -1759402563;
                } else {
                    i11 = i2;
                }
                if (i < i11) {
                    i12 = i6 << 14;
                    if (i3 < 0) {
                        i13 = i12 - (i3 * i9);
                        i12 -= i10 * i3;
                        i3 = 0;
                    } else {
                        i13 = i12;
                    }
                    i17 = i4 << 14;
                    if (i < 0) {
                        i17 -= i * i8;
                        i = 0;
                    }
                    int i19;
                    if (i9 < i10) {
                        i15 = i11 - i;
                        i19 = i - i3;
                        i11 = this.be[i3];
                        i16 = i12;
                        i14 = i13;
                        i12 = i19;
                        while (true) {
                            i18 = i12 - 1;
                            if (i18 < 0) {
                                break;
                            }
                            ar(this.af, i11, i7, 0, i14 >> 14, i16 >> 14, (byte) 78);
                            i14 += i9;
                            i11 += -1741252353 * this.ak;
                            i16 += i10;
                            i12 = i18;
                        }
                        i12 = i15;
                        while (true) {
                            i15 = i12 - 1;
                            if (i15 >= 0) {
                                ar(this.af, i11, i7, 0, i14 >> 14, i17 >> 14, (byte) 34);
                                i17 += i8;
                                i11 += this.ak * -1741252353;
                                i14 += i9;
                                i12 = i15;
                            } else {
                                return;
                            }
                        }
                    }
                    i15 = i11 - i;
                    i19 = i - i3;
                    i11 = this.be[i3];
                    i16 = i12;
                    i14 = i13;
                    i12 = i19;
                    while (true) {
                        i18 = i12 - 1;
                        if (i18 < 0) {
                            break;
                        }
                        ar(this.af, i11, i7, 0, i16 >> 14, i14 >> 14, (byte) 27);
                        i14 += i9;
                        i11 += -1741252353 * this.ak;
                        i16 += i10;
                        i12 = i18;
                    }
                    i12 = i15;
                    while (true) {
                        i15 = i12 - 1;
                        if (i15 >= 0) {
                            ar(this.af, i11, i7, 0, i17 >> 14, i14 >> 14, (byte) 116);
                            i11 += this.ak * -1741252353;
                            i14 += i9;
                            i17 += i8;
                            i12 = i15;
                        } else {
                            return;
                        }
                    }
                }
                i14 = i6 << 14;
                if (i3 < 0) {
                    i12 = i14 - (i3 * i9);
                    i14 -= i10 * i3;
                    i3 = 0;
                } else {
                    i12 = i14;
                }
                i17 = i5 << 14;
                if (i11 < 0) {
                    i17 -= i8 * i11;
                    i13 = 0;
                } else {
                    i13 = i11;
                }
                if (i9 < i10) {
                    i15 = i - i13;
                    i13 -= i3;
                    i11 = this.be[i3];
                    i16 = i12;
                    i12 = i13;
                    while (true) {
                        i18 = i12 - 1;
                        if (i18 < 0) {
                            break;
                        }
                        ar(this.af, i11, i7, 0, i16 >> 14, i14 >> 14, (byte) 22);
                        i14 += i10;
                        i11 += -1741252353 * this.ak;
                        i16 += i9;
                        i12 = i18;
                    }
                    i9 = i14;
                    i12 = i15;
                    i14 = i17;
                    while (true) {
                        i17 = i12 - 1;
                        if (i17 >= 0) {
                            ar(this.af, i11, i7, 0, i14 >> 14, i9 >> 14, (byte) 18);
                            i11 += this.ak * -1741252353;
                            i9 += i10;
                            i14 += i8;
                            i12 = i17;
                        } else {
                            return;
                        }
                    }
                }
                i15 = i - i13;
                i13 -= i3;
                i11 = this.be[i3];
                i16 = i12;
                i12 = i13;
                while (true) {
                    i18 = i12 - 1;
                    if (i18 < 0) {
                        break;
                    }
                    ar(this.af, i11, i7, 0, i14 >> 14, i16 >> 14, (byte) 75);
                    i14 += i10;
                    i11 += this.ak * -1741252353;
                    i16 += i9;
                    i12 = i18;
                }
                i9 = i14;
                i12 = i15;
                while (true) {
                    i14 = i12 - 1;
                    if (i14 >= 0) {
                        ar(this.af, i11, i7, 0, i9 >> 14, i17 >> 14, (byte) 44);
                        i17 += i8;
                        i11 += this.ak * -1741252353;
                        i9 += i10;
                        i12 = i14;
                    } else {
                        return;
                    }
                }
            }
        } else if (i < this.bv * -1759402563) {
            if (i2 > this.bv * -1759402563) {
                i2 = -1759402563 * this.bv;
            }
            if (i3 > -1759402563 * this.bv) {
                i11 = this.bv * -1759402563;
            } else {
                i11 = i3;
            }
            if (i2 < i11) {
                i12 = i4 << 14;
                if (i < 0) {
                    i14 = i12 - (i10 * i);
                    i12 -= i8 * i;
                    i = 0;
                } else {
                    i14 = i12;
                }
                i17 = i5 << 14;
                if (i2 < 0) {
                    i17 -= i9 * i2;
                    i2 = 0;
                }
                if ((i2 == i || i10 >= i8) && (i2 != i || i10 <= i9)) {
                    i15 = i11 - i2;
                    i13 = i2 - i;
                    i11 = this.be[i];
                    i16 = i12;
                    i12 = i13;
                    while (true) {
                        i18 = i12 - 1;
                        if (i18 < 0) {
                            break;
                        }
                        ar(this.af, i11, i7, 0, i16 >> 14, i14 >> 14, (byte) 77);
                        i14 += i10;
                        i11 += -1741252353 * this.ak;
                        i16 += i8;
                        i12 = i18;
                    }
                    i8 = i14;
                    i12 = i15;
                    i14 = i17;
                    while (true) {
                        i17 = i12 - 1;
                        if (i17 >= 0) {
                            ar(this.af, i11, i7, 0, i14 >> 14, i8 >> 14, (byte) 68);
                            i11 += this.ak * -1741252353;
                            i8 += i10;
                            i14 += i9;
                            i12 = i17;
                        } else {
                            return;
                        }
                    }
                }
                i15 = i11 - i2;
                i13 = i2 - i;
                i11 = this.be[i];
                i16 = i12;
                i12 = i13;
                while (true) {
                    i18 = i12 - 1;
                    if (i18 < 0) {
                        break;
                    }
                    ar(this.af, i11, i7, 0, i14 >> 14, i16 >> 14, (byte) 100);
                    i14 += i10;
                    i11 += this.ak * -1741252353;
                    i16 += i8;
                    i12 = i18;
                }
                i8 = i14;
                i12 = i15;
                while (true) {
                    i14 = i12 - 1;
                    if (i14 >= 0) {
                        ar(this.af, i11, i7, 0, i8 >> 14, i17 >> 14, (byte) 47);
                        i17 += i9;
                        i11 += -1741252353 * this.ak;
                        i8 += i10;
                        i12 = i14;
                    } else {
                        return;
                    }
                }
            }
            i13 = i4 << 14;
            if (i < 0) {
                i12 = i13 - (i * i10);
                i13 -= i * i8;
                i = 0;
            } else {
                i12 = i13;
            }
            i14 = i6 << 14;
            if (i11 < 0) {
                i14 -= i11 * i9;
                i11 = 0;
            }
            if ((i11 == i || i10 >= i8) && (i != i11 || i9 <= i8)) {
                i15 = i2 - i11;
                i16 = i12;
                i17 = i13;
                i12 = i11 - i;
                i11 = this.be[i];
                while (true) {
                    i18 = i12 - 1;
                    if (i18 < 0) {
                        break;
                    }
                    ar(this.af, i11, i7, 0, i17 >> 14, i16 >> 14, (byte) 102);
                    i17 += i8;
                    i11 += -1741252353 * this.ak;
                    i16 += i10;
                    i12 = i18;
                }
                i12 = i15;
                while (true) {
                    i15 = i12 - 1;
                    if (i15 >= 0) {
                        ar(this.af, i11, i7, 0, i17 >> 14, i14 >> 14, (byte) 25);
                        i11 += -1741252353 * this.ak;
                        i14 += i9;
                        i17 += i8;
                        i12 = i15;
                    } else {
                        return;
                    }
                }
            }
            i15 = i2 - i11;
            i16 = i12;
            i17 = i13;
            i12 = i11 - i;
            i11 = this.be[i];
            while (true) {
                i18 = i12 - 1;
                if (i18 < 0) {
                    break;
                }
                ar(this.af, i11, i7, 0, i16 >> 14, i17 >> 14, (byte) 73);
                i17 += i8;
                i11 += this.ak * -1741252353;
                i16 += i10;
                i12 = i18;
            }
            i12 = i15;
            while (true) {
                i15 = i12 - 1;
                if (i15 >= 0) {
                    ar(this.af, i11, i7, 0, i14 >> 14, i17 >> 14, (byte) 103);
                    i14 += i9;
                    i11 += this.ak * -1741252353;
                    i17 += i8;
                    i12 = i15;
                } else {
                    return;
                }
            }
        }
    }

    final void ar(int[] iArr, int i, int i2, int i3, int i4, int i5, byte b) {
        try {
            if (this.al) {
                if (i5 > 784773023 * this.bf) {
                    i5 = this.bf * 784773023;
                }
                if (i4 < 0) {
                    i4 = 0;
                }
            }
            if (i4 < i5) {
                int i6 = i + i4;
                int i7 = (i5 - i4) >> 2;
                int i8;
                if (238267341 * this.bc == 0) {
                    while (true) {
                        i7--;
                        if (i7 < 0) {
                            break;
                        }
                        i8 = i6 + 1;
                        iArr[i6] = i2;
                        i6 = i8 + 1;
                        iArr[i8] = i2;
                        i8 = i6 + 1;
                        iArr[i6] = i2;
                        i6 = i8 + 1;
                        iArr[i8] = i2;
                    }
                    i7 = (i5 - i4) & 3;
                    while (true) {
                        i7--;
                        if (i7 >= 0) {
                            i8 = i6 + 1;
                            iArr[i6] = i2;
                            i6 = i8;
                        } else {
                            return;
                        }
                    }
                } else if (this.bc * 238267341 == 254) {
                    while (true) {
                        i7--;
                        if (i7 < 0) {
                            break;
                        }
                        i8 = i6 + 1;
                        iArr[i6] = iArr[i8];
                        i6 = i8 + 1;
                        iArr[i8] = iArr[i6];
                        i8 = i6 + 1;
                        iArr[i6] = iArr[i8];
                        i6 = i8 + 1;
                        iArr[i8] = iArr[i6];
                    }
                    i7 = (i5 - i4) & 3;
                    while (true) {
                        i7--;
                        if (i7 >= 0) {
                            i8 = i6 + 1;
                            iArr[i6] = iArr[i8];
                            i6 = i8;
                        } else {
                            return;
                        }
                    }
                } else {
                    int i9;
                    int i10 = this.bc * 238267341;
                    i8 = 256 - (238267341 * this.bc);
                    int i11 = ((((16711935 & i2) * i8) >> 8) & 16711935) + (((i8 * (65280 & i2)) >> 8) & 65280);
                    while (true) {
                        i7--;
                        if (i7 < 0) {
                            break;
                        }
                        i8 = iArr[i6];
                        i9 = i6 + 1;
                        iArr[i6] = ((((i8 & 65280) * i10) >> 8) & 65280) + (((((16711935 & i8) * i10) >> 8) & 16711935) + i11);
                        i6 = iArr[i9];
                        i8 = i9 + 1;
                        iArr[i9] = ((((i6 & 65280) * i10) >> 8) & 65280) + (((((16711935 & i6) * i10) >> 8) & 16711935) + i11);
                        i6 = iArr[i8];
                        i9 = i8 + 1;
                        iArr[i8] = ((((i6 & 65280) * i10) >> 8) & 65280) + (((((16711935 & i6) * i10) >> 8) & 16711935) + i11);
                        i8 = iArr[i9];
                        i6 = i9 + 1;
                        iArr[i9] = (((((i8 & 16711935) * i10) >> 8) & 16711935) + i11) + ((((65280 & i8) * i10) >> 8) & 65280);
                    }
                    i7 = (i5 - i4) & 3;
                    while (true) {
                        i7--;
                        if (i7 >= 0) {
                            i9 = iArr[i6];
                            i8 = i6 + 1;
                            iArr[i6] = ((((i9 & 65280) * i10) >> 8) & 65280) + (((((16711935 & i9) * i10) >> 8) & 16711935) + i11);
                            i6 = i8;
                        } else {
                            return;
                        }
                    }
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "cj.ar(" + ')');
        }
    }

    final void dt(int[] iArr, int i, int i2, int i3, int i4, int i5) {
        if (this.al) {
            if (i5 > this.bf * 784773023) {
                i5 = this.bf * 784773023;
            }
            if (i4 < 0) {
                i4 = 0;
            }
        }
        if (i4 < i5) {
            int i6 = i + i4;
            int i7 = (i5 - i4) >> 2;
            int i8;
            if (this.bc * 238267341 == 0) {
                while (true) {
                    i7--;
                    if (i7 < 0) {
                        break;
                    }
                    i8 = i6 + 1;
                    iArr[i6] = i2;
                    i6 = i8 + 1;
                    iArr[i8] = i2;
                    i8 = i6 + 1;
                    iArr[i6] = i2;
                    i6 = i8 + 1;
                    iArr[i8] = i2;
                }
                i7 = (i5 - i4) & 3;
                while (true) {
                    i7--;
                    if (i7 >= 0) {
                        i8 = i6 + 1;
                        iArr[i6] = i2;
                        i6 = i8;
                    } else {
                        return;
                    }
                }
            } else if (this.bc * 238267341 == 254) {
                while (true) {
                    i7--;
                    if (i7 < 0) {
                        break;
                    }
                    i8 = i6 + 1;
                    iArr[i6] = iArr[i8];
                    i6 = i8 + 1;
                    iArr[i8] = iArr[i6];
                    i8 = i6 + 1;
                    iArr[i6] = iArr[i8];
                    i6 = i8 + 1;
                    iArr[i8] = iArr[i6];
                }
                i7 = (i5 - i4) & 3;
                while (true) {
                    i7--;
                    if (i7 >= 0) {
                        i8 = i6 + 1;
                        iArr[i6] = iArr[i8];
                        i6 = i8;
                    } else {
                        return;
                    }
                }
            } else {
                int i9;
                int i10 = 238267341 * this.bc;
                i8 = 256 - (this.bc * 238267341);
                int i11 = ((((i2 & 16711935) * i8) >> 8) & 16711935) + (((i8 * (i2 & 65280)) >> 8) & 65280);
                while (true) {
                    i7--;
                    if (i7 < 0) {
                        break;
                    }
                    i8 = iArr[i6];
                    i9 = i6 + 1;
                    iArr[i6] = ((((i8 & 65280) * i10) >> 8) & 65280) + (((((i8 & 16711935) * i10) >> 8) & 16711935) + i11);
                    i6 = iArr[i9];
                    i8 = i9 + 1;
                    iArr[i9] = ((((i6 & 65280) * i10) >> 8) & 65280) + (((((i6 & 16711935) * i10) >> 8) & 16711935) + i11);
                    i6 = iArr[i8];
                    i9 = i8 + 1;
                    iArr[i8] = ((((i6 & 65280) * i10) >> 8) & 65280) + (((((i6 & 16711935) * i10) >> 8) & 16711935) + i11);
                    i8 = iArr[i9];
                    i6 = i9 + 1;
                    iArr[i9] = (((((i8 & 16711935) * i10) >> 8) & 16711935) + i11) + ((((i8 & 65280) * i10) >> 8) & 65280);
                }
                i7 = (i5 - i4) & 3;
                while (true) {
                    i7--;
                    if (i7 >= 0) {
                        i9 = iArr[i6];
                        i8 = i6 + 1;
                        iArr[i6] = ((((i9 & 65280) * i10) >> 8) & 65280) + (((((i9 & 16711935) * i10) >> 8) & 16711935) + i11);
                        i6 = i8;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    final void dz(int[] iArr, int i, int i2, int i3, int i4, int i5) {
        if (this.al) {
            if (i5 > 784773023 * this.bf) {
                i5 = this.bf * -1920743013;
            }
            if (i4 < 0) {
                i4 = 0;
            }
        }
        if (i4 < i5) {
            int i6 = i + i4;
            int i7 = (i5 - i4) >> 2;
            int i8;
            if (238267341 * this.bc == 0) {
                while (true) {
                    i7--;
                    if (i7 < 0) {
                        break;
                    }
                    i8 = i6 + 1;
                    iArr[i6] = i2;
                    i6 = i8 + 1;
                    iArr[i8] = i2;
                    i8 = i6 + 1;
                    iArr[i6] = i2;
                    i6 = i8 + 1;
                    iArr[i8] = i2;
                }
                i7 = (i5 - i4) & 3;
                while (true) {
                    i7--;
                    if (i7 >= 0) {
                        i8 = i6 + 1;
                        iArr[i6] = i2;
                        i6 = i8;
                    } else {
                        return;
                    }
                }
            } else if (this.bc * 2104977034 == 1141157452) {
                while (true) {
                    i7--;
                    if (i7 < 0) {
                        break;
                    }
                    i8 = i6 + 1;
                    iArr[i6] = iArr[i8];
                    i6 = i8 + 1;
                    iArr[i8] = iArr[i6];
                    i8 = i6 + 1;
                    iArr[i6] = iArr[i8];
                    i6 = i8 + 1;
                    iArr[i8] = iArr[i6];
                }
                i7 = (i5 - i4) & 3;
                while (true) {
                    i7--;
                    if (i7 >= 0) {
                        i8 = i6 + 1;
                        iArr[i6] = iArr[i8];
                        i6 = i8;
                    } else {
                        return;
                    }
                }
            } else {
                int i9;
                int i10 = this.bc * -931012197;
                i8 = -167412111 - (238267341 * this.bc);
                int i11 = ((((-1460685997 & i2) * i8) >> 8) & 768060759) + (((i8 * (-1900205906 & i2)) >> 8) & -1711788003);
                while (true) {
                    i7--;
                    if (i7 < 0) {
                        break;
                    }
                    i8 = iArr[i6];
                    i9 = i6 + 1;
                    iArr[i6] = ((((i8 & 65280) * i10) >> 8) & -206950016) + (((((-1500428789 & i8) * i10) >> 8) & 16711935) + i11);
                    i6 = iArr[i9];
                    i8 = i9 + 1;
                    iArr[i9] = ((((i6 & 1317533975) * i10) >> 8) & 979793965) + (((((-2136947203 & i6) * i10) >> 8) & 733394844) + i11);
                    i6 = iArr[i8];
                    i9 = i8 + 1;
                    iArr[i8] = ((((i6 & 65280) * i10) >> 8) & 65280) + (((((-1139017643 & i6) * i10) >> 8) & 16711935) + i11);
                    i8 = iArr[i9];
                    i6 = i9 + 1;
                    iArr[i9] = (((((i8 & 181828113) * i10) >> 8) & 16711935) + i11) + ((((1136199648 & i8) * i10) >> 8) & -361673176);
                }
                i7 = (i5 - i4) & 3;
                while (true) {
                    i7--;
                    if (i7 >= 0) {
                        i9 = iArr[i6];
                        i8 = i6 + 1;
                        iArr[i6] = ((((i9 & 65280) * i10) >> 8) & 65280) + (((((16711935 & i9) * i10) >> 8) & 16711935) + i11);
                        i6 = i8;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    final void aj(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
        try {
            int[] an = ab.an(i19, (short) 255);
            int aa;
            if (an == null) {
                aa = ab.aa(i19, 1577195485);
                ag(i, i2, i3, i4, i5, i6, bx.bu(aa, i7, -2138350775), bx.bu(aa, i8, -2085123791), bx.bu(aa, i9, -2128438283), 971130952);
                return;
            }
            int i21;
            int i22;
            int i23;
            this.bw = ab.ay(i19, -16085959);
            this.ap = ab.ag(i19, -498676197);
            int i24 = i5 - i4;
            int i25 = i2 - i;
            int i26 = i6 - i4;
            int i27 = i3 - i;
            int i28 = i8 - i7;
            int i29 = i9 - i7;
            if (i2 != i) {
                i21 = ((i5 - i4) << 14) / (i2 - i);
            } else {
                i21 = 0;
            }
            if (i2 != i3) {
                i22 = ((i6 - i5) << 14) / (i3 - i2);
            } else {
                i22 = 0;
            }
            if (i != i3) {
                i23 = ((i4 - i6) << 14) / (i - i3);
            } else {
                i23 = 0;
            }
            aa = (i24 * i27) - (i26 * i25);
            if (aa != 0) {
                int i30 = (((i27 * i28) - (i25 * i29)) << 9) / aa;
                int i31 = (((i24 * i29) - (i28 * i26)) << 9) / aa;
                aa = i10 - i11;
                i24 = i13 - i14;
                i25 = i16 - i17;
                i26 = i12 - i10;
                i27 = i15 - i13;
                i28 = i18 - i16;
                i29 = ((i13 * i26) - (i10 * i27)) << 14;
                int i32 = (int) (((((long) ((i27 * i16) - (i28 * i13))) << 3) << 14) / ((long) (542614623 * this.bz)));
                int i33 = (int) ((((long) ((i10 * i28) - (i26 * i16))) << 14) / ((long) (542614623 * this.bz)));
                int i34 = ((aa * i13) - (i24 * i10)) << 14;
                int i35 = (int) (((((long) ((i24 * i16) - (i13 * i25))) << 3) << 14) / ((long) (542614623 * this.bz)));
                int i36 = (int) ((((long) ((i10 * i25) - (aa * i16))) << 14) / ((long) (this.bz * 542614623)));
                int i37 = ((i24 * i26) - (aa * i27)) << 14;
                int i38 = (int) (((((long) ((i27 * i25) - (i24 * i28))) << 3) << 14) / ((long) (542614623 * this.bz)));
                int i39 = (int) ((((long) ((aa * i28) - (i25 * i26))) << 14) / ((long) (this.bz * 542614623)));
                int i40;
                int i41;
                int i42;
                int i43;
                int i44;
                int i45;
                int i46;
                if (i > i2 || i > i3) {
                    if (i2 <= i3) {
                        if (i2 < -1759402563 * this.bv) {
                            if (i3 > -1759402563 * this.bv) {
                                i24 = -1759402563 * this.bv;
                            } else {
                                i24 = i3;
                            }
                            if (i > this.bv * -1759402563) {
                                i = this.bv * -1759402563;
                            }
                            i40 = i30 + ((i8 << 9) - (i30 * i5));
                            if (i24 < i) {
                                aa = i5 << 14;
                                if (i2 < 0) {
                                    i41 = aa - (i2 * i21);
                                    aa -= i22 * i2;
                                    i40 -= i31 * i2;
                                    i2 = 0;
                                } else {
                                    i41 = aa;
                                }
                                i42 = i6 << 14;
                                if (i24 < 0) {
                                    i42 -= i24 * i23;
                                    i24 = 0;
                                }
                                i25 = i2 - (-1508152919 * this.bh);
                                i43 = i29 + (i33 * i25);
                                i34 += i25 * i36;
                                i37 += i25 * i39;
                                if ((i2 == i24 || i21 >= i22) && (i24 != i2 || i21 <= i23)) {
                                    i44 = i - i24;
                                    i24 -= i2;
                                    i27 = this.be[i2];
                                    i45 = aa;
                                    aa = i24;
                                    while (true) {
                                        i46 = aa - 1;
                                        if (i46 < 0) {
                                            break;
                                        }
                                        az(this.af, an, 0, 0, i27, i45 >> 14, i41 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, 1245522068);
                                        i41 += i21;
                                        i40 += i31;
                                        i27 += -1741252353 * this.ak;
                                        i43 += i33;
                                        i34 += i36;
                                        i37 += i39;
                                        i45 += i22;
                                        aa = i46;
                                    }
                                    i22 = i41;
                                    aa = i44;
                                    while (true) {
                                        i41 = aa - 1;
                                        if (i41 >= 0) {
                                            az(this.af, an, 0, 0, i27, i42 >> 14, i22 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, 1245522068);
                                            i42 += i23;
                                            i40 += i31;
                                            i27 += this.ak * -1741252353;
                                            i43 += i33;
                                            i34 += i36;
                                            i37 += i39;
                                            i22 += i21;
                                            aa = i41;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                i44 = i - i24;
                                i24 -= i2;
                                i27 = this.be[i2];
                                i45 = aa;
                                aa = i24;
                                while (true) {
                                    i46 = aa - 1;
                                    if (i46 < 0) {
                                        break;
                                    }
                                    az(this.af, an, 0, 0, i27, i41 >> 14, i45 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, 1245522068);
                                    i41 += i21;
                                    i40 += i31;
                                    i27 += -1741252353 * this.ak;
                                    i43 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    i45 += i22;
                                    aa = i46;
                                }
                                i22 = i42;
                                aa = i44;
                                i42 = i41;
                                while (true) {
                                    i41 = aa - 1;
                                    if (i41 >= 0) {
                                        az(this.af, an, 0, 0, i27, i42 >> 14, i22 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, 1245522068);
                                        i40 += i31;
                                        i27 += -1741252353 * this.ak;
                                        i43 += i33;
                                        i34 += i36;
                                        i37 += i39;
                                        i22 += i23;
                                        i42 += i21;
                                        aa = i41;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i25 = i5 << 14;
                            if (i2 < 0) {
                                aa = i25 - (i21 * i2);
                                i42 = i25 - (i22 * i2);
                                i40 -= i31 * i2;
                                i2 = 0;
                            } else {
                                aa = i25;
                                i42 = i25;
                            }
                            i41 = i4 << 14;
                            if (i < 0) {
                                i41 -= i23 * i;
                                i = 0;
                            }
                            i25 = i2 - (this.bh * -1508152919);
                            i43 = i29 + (i25 * i33);
                            i34 += i36 * i25;
                            i37 += i25 * i39;
                            if (i21 < i22) {
                                i44 = i24 - i;
                                i24 = i - i2;
                                i27 = this.be[i2];
                                i45 = aa;
                                aa = i24;
                                while (true) {
                                    i46 = aa - 1;
                                    if (i46 < 0) {
                                        break;
                                    }
                                    az(this.af, an, 0, 0, i27, i45 >> 14, i42 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, 1245522068);
                                    i42 += i22;
                                    i40 += i31;
                                    i27 += -1741252353 * this.ak;
                                    i43 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    i45 += i21;
                                    aa = i46;
                                }
                                aa = i44;
                                while (true) {
                                    i44 = aa - 1;
                                    if (i44 >= 0) {
                                        az(this.af, an, 0, 0, i27, i41 >> 14, i42 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, 1245522068);
                                        i40 += i31;
                                        i27 += this.ak * -1741252353;
                                        i43 += i33;
                                        i34 += i36;
                                        i37 += i39;
                                        i42 += i22;
                                        i41 += i23;
                                        aa = i44;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i44 = i24 - i;
                            i24 = i - i2;
                            i27 = this.be[i2];
                            i45 = aa;
                            aa = i24;
                            while (true) {
                                i46 = aa - 1;
                                if (i46 < 0) {
                                    break;
                                }
                                az(this.af, an, 0, 0, i27, i42 >> 14, i45 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, 1245522068);
                                i42 += i22;
                                i40 += i31;
                                i27 += -1741252353 * this.ak;
                                i43 += i33;
                                i34 += i36;
                                i37 += i39;
                                i45 += i21;
                                aa = i46;
                            }
                            aa = i44;
                            while (true) {
                                i44 = aa - 1;
                                if (i44 >= 0) {
                                    az(this.af, an, 0, 0, i27, i42 >> 14, i41 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, 1245522068);
                                    i41 += i23;
                                    i40 += i31;
                                    i27 += -1741252353 * this.ak;
                                    i43 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    i42 += i22;
                                    aa = i44;
                                } else {
                                    return;
                                }
                            }
                        }
                    } else if (i3 < this.bv * -1759402563) {
                        if (i > this.bv * -1759402563) {
                            i26 = this.bv * -1759402563;
                        } else {
                            i26 = i;
                        }
                        if (i2 > -1759402563 * this.bv) {
                            i2 = this.bv * -1759402563;
                        }
                        aa = ((i9 << 9) - (i30 * i6)) + i30;
                        if (i26 < i2) {
                            i24 = i6 << 14;
                            if (i3 < 0) {
                                i25 = i24 - (i22 * i3);
                                i24 -= i3 * i23;
                                aa -= i31 * i3;
                                i3 = 0;
                            } else {
                                i25 = i24;
                            }
                            i41 = i4 << 14;
                            if (i26 < 0) {
                                i41 -= i26 * i21;
                                i26 = 0;
                            }
                            i27 = i3 - (this.bh * -1508152919);
                            i43 = i29 + (i27 * i33);
                            i34 += i36 * i27;
                            i37 += i27 * i39;
                            if (i22 < i23) {
                                i44 = i2 - i26;
                                i26 -= i3;
                                i27 = this.be[i3];
                                i40 = aa;
                                i45 = i24;
                                i42 = i25;
                                aa = i26;
                                while (true) {
                                    i46 = aa - 1;
                                    if (i46 < 0) {
                                        break;
                                    }
                                    az(this.af, an, 0, 0, i27, i42 >> 14, i45 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, 1245522068);
                                    i42 += i22;
                                    i40 += i31;
                                    i27 += this.ak * -1741252353;
                                    i43 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    i45 += i23;
                                    aa = i46;
                                }
                                i23 = i42;
                                aa = i44;
                                i42 = i41;
                                while (true) {
                                    i41 = aa - 1;
                                    if (i41 >= 0) {
                                        az(this.af, an, 0, 0, i27, i23 >> 14, i42 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, 1245522068);
                                        i40 += i31;
                                        i27 += -1741252353 * this.ak;
                                        i43 += i33;
                                        i34 += i36;
                                        i37 += i39;
                                        i23 += i22;
                                        i42 += i21;
                                        aa = i41;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i44 = i2 - i26;
                            i26 -= i3;
                            i27 = this.be[i3];
                            i40 = aa;
                            i45 = i24;
                            i42 = i25;
                            aa = i26;
                            while (true) {
                                i46 = aa - 1;
                                if (i46 < 0) {
                                    break;
                                }
                                az(this.af, an, 0, 0, i27, i45 >> 14, i42 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, 1245522068);
                                i42 += i22;
                                i40 += i31;
                                i27 += this.ak * -1741252353;
                                i43 += i33;
                                i34 += i36;
                                i37 += i39;
                                i45 += i23;
                                aa = i46;
                            }
                            i23 = i42;
                            aa = i44;
                            while (true) {
                                i42 = aa - 1;
                                if (i42 >= 0) {
                                    az(this.af, an, 0, 0, i27, i41 >> 14, i23 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, 1245522068);
                                    i41 += i21;
                                    i40 += i31;
                                    i27 += -1741252353 * this.ak;
                                    i43 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    i23 += i22;
                                    aa = i42;
                                } else {
                                    return;
                                }
                            }
                        }
                        i42 = i6 << 14;
                        if (i3 < 0) {
                            i24 = i42 - (i22 * i3);
                            i42 -= i23 * i3;
                            i40 = aa - (i31 * i3);
                            i3 = 0;
                            aa = i24;
                        } else {
                            i40 = aa;
                            aa = i42;
                        }
                        i41 = i5 << 14;
                        if (i2 < 0) {
                            i41 -= i2 * i21;
                            i2 = 0;
                        }
                        i24 = i3 - (this.bh * -1508152919);
                        i43 = i29 + (i33 * i24);
                        i34 += i36 * i24;
                        i37 += i24 * i39;
                        if (i22 < i23) {
                            i44 = i26 - i2;
                            i24 = i2 - i3;
                            i27 = this.be[i3];
                            i45 = aa;
                            aa = i24;
                            while (true) {
                                i46 = aa - 1;
                                if (i46 < 0) {
                                    break;
                                }
                                az(this.af, an, 0, 0, i27, i45 >> 14, i42 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, 1245522068);
                                i42 += i23;
                                i40 += i31;
                                i27 += -1741252353 * this.ak;
                                i43 += i33;
                                i34 += i36;
                                i37 += i39;
                                i45 += i22;
                                aa = i46;
                            }
                            i22 = i42;
                            aa = i44;
                            while (true) {
                                i42 = aa - 1;
                                if (i42 >= 0) {
                                    az(this.af, an, 0, 0, i27, i41 >> 14, i22 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, 1245522068);
                                    i41 += i21;
                                    i40 += i31;
                                    i27 += -1741252353 * this.ak;
                                    i43 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    i22 += i23;
                                    aa = i42;
                                } else {
                                    return;
                                }
                            }
                        }
                        i44 = i26 - i2;
                        i24 = i2 - i3;
                        i27 = this.be[i3];
                        i45 = aa;
                        aa = i24;
                        while (true) {
                            i46 = aa - 1;
                            if (i46 < 0) {
                                break;
                            }
                            az(this.af, an, 0, 0, i27, i42 >> 14, i45 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, 1245522068);
                            i42 += i23;
                            i40 += i31;
                            i27 += this.ak * -1741252353;
                            i43 += i33;
                            i34 += i36;
                            i37 += i39;
                            i45 += i22;
                            aa = i46;
                        }
                        i22 = i42;
                        aa = i44;
                        i42 = i41;
                        while (true) {
                            i41 = aa - 1;
                            if (i41 >= 0) {
                                az(this.af, an, 0, 0, i27, i22 >> 14, i42 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, 1245522068);
                                i40 += i31;
                                i27 += this.ak * -1741252353;
                                i43 += i33;
                                i34 += i36;
                                i37 += i39;
                                i22 += i23;
                                i42 += i21;
                                aa = i41;
                            } else {
                                return;
                            }
                        }
                    }
                } else if (i < this.bv * -1759402563) {
                    if (i2 > -1759402563 * this.bv) {
                        i27 = -1759402563 * this.bv;
                    } else {
                        i27 = i2;
                    }
                    if (i3 > this.bv * -1759402563) {
                        i26 = -1759402563 * this.bv;
                    } else {
                        i26 = i3;
                    }
                    aa = ((i7 << 9) - (i30 * i4)) + i30;
                    if (i27 < i26) {
                        i25 = i4 << 14;
                        if (i < 0) {
                            i24 = i25 - (i * i23);
                            i25 -= i21 * i;
                            aa -= i * i31;
                            i = 0;
                        } else {
                            i24 = i25;
                        }
                        i41 = i5 << 14;
                        if (i27 < 0) {
                            i41 -= i27 * i22;
                            i27 = 0;
                        }
                        i28 = i - (-1508152919 * this.bh);
                        i43 = i29 + (i33 * i28);
                        i34 += i28 * i36;
                        i37 += i28 * i39;
                        if ((i27 == i || i23 >= i21) && (i27 != i || i23 <= i22)) {
                            i44 = i26 - i27;
                            i26 = i27 - i;
                            i27 = this.be[i];
                            i40 = aa;
                            i42 = i24;
                            i45 = i25;
                            aa = i26;
                            while (true) {
                                i46 = aa - 1;
                                if (i46 < 0) {
                                    break;
                                }
                                az(this.af, an, 0, 0, i27, i45 >> 14, i42 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, 1245522068);
                                i42 += i23;
                                i40 += i31;
                                i27 += this.ak * -1741252353;
                                i43 += i33;
                                i34 += i36;
                                i37 += i39;
                                i45 += i21;
                                aa = i46;
                            }
                            aa = i44;
                            while (true) {
                                i44 = aa - 1;
                                if (i44 >= 0) {
                                    az(this.af, an, 0, 0, i27, i41 >> 14, i42 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, 1245522068);
                                    i40 += i31;
                                    i27 += -1741252353 * this.ak;
                                    i43 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    i42 += i23;
                                    i41 += i22;
                                    aa = i44;
                                } else {
                                    return;
                                }
                            }
                        }
                        i44 = i26 - i27;
                        i26 = i27 - i;
                        i27 = this.be[i];
                        i40 = aa;
                        i42 = i24;
                        i45 = i25;
                        aa = i26;
                        while (true) {
                            i46 = aa - 1;
                            if (i46 < 0) {
                                break;
                            }
                            az(this.af, an, 0, 0, i27, i42 >> 14, i45 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, 1245522068);
                            i42 += i23;
                            i40 += i31;
                            i27 += -1741252353 * this.ak;
                            i43 += i33;
                            i34 += i36;
                            i37 += i39;
                            i45 += i21;
                            aa = i46;
                        }
                        aa = i44;
                        while (true) {
                            i44 = aa - 1;
                            if (i44 >= 0) {
                                az(this.af, an, 0, 0, i27, i42 >> 14, i41 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, 1245522068);
                                i41 += i22;
                                i40 += i31;
                                i27 += this.ak * -1741252353;
                                i43 += i33;
                                i34 += i36;
                                i37 += i39;
                                i42 += i23;
                                aa = i44;
                            } else {
                                return;
                            }
                        }
                    }
                    i25 = i4 << 14;
                    if (i < 0) {
                        i24 = i25 - (i23 * i);
                        i25 -= i * i21;
                        aa -= i31 * i;
                        i = 0;
                    } else {
                        i24 = i25;
                    }
                    i42 = i6 << 14;
                    if (i26 < 0) {
                        i42 -= i26 * i22;
                        i26 = 0;
                    }
                    i28 = i - (-1508152919 * this.bh);
                    i43 = i29 + (i33 * i28);
                    i34 += i28 * i36;
                    i37 += i28 * i39;
                    if ((i26 == i || i23 >= i21) && (i != i26 || i22 <= i21)) {
                        i44 = i27 - i26;
                        i26 -= i;
                        i27 = this.be[i];
                        i40 = aa;
                        i45 = i24;
                        i41 = i25;
                        aa = i26;
                        while (true) {
                            i46 = aa - 1;
                            if (i46 < 0) {
                                break;
                            }
                            az(this.af, an, 0, 0, i27, i41 >> 14, i45 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, 1245522068);
                            i41 += i21;
                            i40 += i31;
                            i27 += this.ak * -1741252353;
                            i43 += i33;
                            i34 += i36;
                            i37 += i39;
                            i45 += i23;
                            aa = i46;
                        }
                        i23 = i41;
                        aa = i44;
                        while (true) {
                            i41 = aa - 1;
                            if (i41 >= 0) {
                                az(this.af, an, 0, 0, i27, i23 >> 14, i42 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, 1245522068);
                                i42 += i22;
                                i40 += i31;
                                i27 += -1741252353 * this.ak;
                                i43 += i33;
                                i34 += i36;
                                i37 += i39;
                                i23 += i21;
                                aa = i41;
                            } else {
                                return;
                            }
                        }
                    }
                    i44 = i27 - i26;
                    i26 -= i;
                    i27 = this.be[i];
                    i40 = aa;
                    i45 = i24;
                    i41 = i25;
                    aa = i26;
                    while (true) {
                        i46 = aa - 1;
                        if (i46 < 0) {
                            break;
                        }
                        az(this.af, an, 0, 0, i27, i45 >> 14, i41 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, 1245522068);
                        i41 += i21;
                        i40 += i31;
                        i27 += -1741252353 * this.ak;
                        i43 += i33;
                        i34 += i36;
                        i37 += i39;
                        i45 += i23;
                        aa = i46;
                    }
                    i23 = i42;
                    aa = i44;
                    i42 = i41;
                    while (true) {
                        i41 = aa - 1;
                        if (i41 >= 0) {
                            az(this.af, an, 0, 0, i27, i23 >> 14, i42 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, 1245522068);
                            i40 += i31;
                            i27 += this.ak * -1741252353;
                            i43 += i33;
                            i34 += i36;
                            i37 += i39;
                            i23 += i22;
                            i42 += i21;
                            aa = i41;
                        } else {
                            return;
                        }
                    }
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "cj.aj(" + ')');
        }
    }

    final void dd(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        int[] an = ab.an(i19, (short) 255);
        if (an == null) {
            int aa = ab.aa(i19, 1577195485);
            ag(i, i2, i3, i4, i5, i6, bx.bu(aa, i7, -2146196316), bx.bu(aa, i8, -2141582002), bx.bu(aa, i9, -2111823019), 1584002306);
            return;
        }
        int i20;
        int i21;
        int i22;
        this.bw = ab.ay(i19, -421289729);
        this.ap = ab.ag(i19, -480947635);
        int i23 = i5 - i4;
        int i24 = i2 - i;
        int i25 = i6 - i4;
        int i26 = i3 - i;
        int i27 = i8 - i7;
        int i28 = i9 - i7;
        if (i2 != i) {
            i20 = ((i5 - i4) << 14) / (i2 - i);
        } else {
            i20 = 0;
        }
        if (i2 != i3) {
            i21 = ((i6 - i5) << 14) / (i3 - i2);
        } else {
            i21 = 0;
        }
        if (i != i3) {
            i22 = ((i4 - i6) << 14) / (i - i3);
        } else {
            i22 = 0;
        }
        aa = (i23 * i26) - (i25 * i24);
        if (aa != 0) {
            int i29 = (((i26 * i27) - (i24 * i28)) << 9) / aa;
            int i30 = (((i23 * i28) - (i27 * i25)) << 9) / aa;
            aa = i10 - i11;
            i23 = i13 - i14;
            i24 = i16 - i17;
            i25 = i12 - i10;
            i26 = i15 - i13;
            i27 = i18 - i16;
            i28 = ((i13 * i25) - (i10 * i26)) << 14;
            int i31 = (int) (((((long) ((i26 * i16) - (i27 * i13))) << 3) << 14) / ((long) (542614623 * this.bz)));
            int i32 = (int) ((((long) ((i10 * i27) - (i25 * i16))) << 14) / ((long) (542614623 * this.bz)));
            int i33 = ((aa * i13) - (i23 * i10)) << 14;
            int i34 = (int) (((((long) ((i23 * i16) - (i13 * i24))) << 3) << 14) / ((long) (542614623 * this.bz)));
            int i35 = (int) ((((long) ((i10 * i24) - (aa * i16))) << 14) / ((long) (this.bz * 542614623)));
            int i36 = ((i23 * i25) - (aa * i26)) << 14;
            int i37 = (int) (((((long) ((i26 * i24) - (i23 * i27))) << 3) << 14) / ((long) (542614623 * this.bz)));
            int i38 = (int) ((((long) ((aa * i27) - (i24 * i25))) << 14) / ((long) (this.bz * 542614623)));
            int i39;
            int i40;
            int i41;
            int i42;
            int i43;
            int i44;
            int i45;
            if (i > i2 || i > i3) {
                if (i2 <= i3) {
                    if (i2 < -1759402563 * this.bv) {
                        if (i3 > -1759402563 * this.bv) {
                            i3 = this.bv * -1759402563;
                        }
                        if (i > this.bv * -1759402563) {
                            i26 = this.bv * -1759402563;
                        } else {
                            i26 = i;
                        }
                        aa = ((i8 << 9) - (i29 * i5)) + i29;
                        if (i3 < i26) {
                            i23 = i5 << 14;
                            if (i2 < 0) {
                                i39 = i23 - (i2 * i20);
                                i23 -= i21 * i2;
                                i40 = aa - (i30 * i2);
                                i2 = 0;
                            } else {
                                i40 = aa;
                                i39 = i23;
                            }
                            aa = i6 << 14;
                            if (i3 < 0) {
                                i3 = 0;
                                i41 = aa - (i3 * i22);
                            } else {
                                i41 = aa;
                            }
                            aa = i2 - (-1508152919 * this.bh);
                            i42 = i28 + (i32 * aa);
                            i33 += aa * i35;
                            i36 += aa * i38;
                            if ((i2 == i3 || i20 >= i21) && (i3 != i2 || i20 <= i22)) {
                                i43 = i26 - i3;
                                aa = i3 - i2;
                                i26 = this.be[i2];
                                i44 = i23;
                                while (true) {
                                    i45 = aa - 1;
                                    if (i45 < 0) {
                                        break;
                                    }
                                    az(this.af, an, 0, 0, i26, i44 >> 14, i39 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 1245522068);
                                    i39 += i20;
                                    i40 += i30;
                                    i26 += -1741252353 * this.ak;
                                    i42 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i44 += i21;
                                    aa = i45;
                                }
                                aa = i43;
                                while (true) {
                                    i43 = aa - 1;
                                    if (i43 >= 0) {
                                        az(this.af, an, 0, 0, i26, i41 >> 14, i39 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 1245522068);
                                        i41 += i22;
                                        i40 += i30;
                                        i26 += this.ak * -1741252353;
                                        i42 += i32;
                                        i33 += i35;
                                        i36 += i38;
                                        i39 += i20;
                                        aa = i43;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i43 = i26 - i3;
                            aa = i3 - i2;
                            i26 = this.be[i2];
                            i44 = i23;
                            while (true) {
                                i45 = aa - 1;
                                if (i45 < 0) {
                                    break;
                                }
                                az(this.af, an, 0, 0, i26, i39 >> 14, i44 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 1245522068);
                                i39 += i20;
                                i40 += i30;
                                i26 += -1741252353 * this.ak;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                i44 += i21;
                                aa = i45;
                            }
                            aa = i43;
                            while (true) {
                                i43 = aa - 1;
                                if (i43 >= 0) {
                                    az(this.af, an, 0, 0, i26, i39 >> 14, i41 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 1245522068);
                                    i41 += i22;
                                    i40 += i30;
                                    i26 += -1741252353 * this.ak;
                                    i42 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i39 += i20;
                                    aa = i43;
                                } else {
                                    return;
                                }
                            }
                        }
                        i24 = i5 << 14;
                        if (i2 < 0) {
                            i23 = i24 - (i20 * i2);
                            i24 -= i21 * i2;
                            aa -= i30 * i2;
                            i2 = 0;
                        } else {
                            i23 = i24;
                        }
                        i25 = i4 << 14;
                        if (i26 < 0) {
                            i41 = i25 - (i26 * i22);
                            i25 = 0;
                        } else {
                            i41 = i25;
                            i25 = i26;
                        }
                        i26 = i2 - (this.bh * -1508152919);
                        i42 = i28 + (i26 * i32);
                        i33 += i35 * i26;
                        i36 += i26 * i38;
                        if (i20 < i21) {
                            i43 = i3 - i25;
                            i25 -= i2;
                            i26 = this.be[i2];
                            i40 = aa;
                            i44 = i23;
                            i39 = i24;
                            aa = i25;
                            while (true) {
                                i45 = aa - 1;
                                if (i45 < 0) {
                                    break;
                                }
                                az(this.af, an, 0, 0, i26, i44 >> 14, i39 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 1245522068);
                                i39 += i21;
                                i40 += i30;
                                i26 += -1741252353 * this.ak;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                i44 += i20;
                                aa = i45;
                            }
                            i20 = i39;
                            aa = i43;
                            while (true) {
                                i39 = aa - 1;
                                if (i39 >= 0) {
                                    az(this.af, an, 0, 0, i26, i41 >> 14, i20 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 1245522068);
                                    i41 += i22;
                                    i40 += i30;
                                    i26 += this.ak * -1741252353;
                                    i42 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i20 += i21;
                                    aa = i39;
                                } else {
                                    return;
                                }
                            }
                        }
                        i43 = i3 - i25;
                        i25 -= i2;
                        i26 = this.be[i2];
                        i40 = aa;
                        i44 = i23;
                        i39 = i24;
                        aa = i25;
                        while (true) {
                            i45 = aa - 1;
                            if (i45 < 0) {
                                break;
                            }
                            az(this.af, an, 0, 0, i26, i39 >> 14, i44 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 1245522068);
                            i39 += i21;
                            i40 += i30;
                            i26 += -1741252353 * this.ak;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            i44 += i20;
                            aa = i45;
                        }
                        i20 = i39;
                        aa = i43;
                        while (true) {
                            i39 = aa - 1;
                            if (i39 >= 0) {
                                az(this.af, an, 0, 0, i26, i20 >> 14, i41 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 1245522068);
                                i41 += i22;
                                i40 += i30;
                                i26 += -1741252353 * this.ak;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                i20 += i21;
                                aa = i39;
                            } else {
                                return;
                            }
                        }
                    }
                } else if (i3 < this.bv * -1759402563) {
                    if (i > this.bv * -1759402563) {
                        i = this.bv * -1759402563;
                    }
                    if (i2 > -1759402563 * this.bv) {
                        i2 = this.bv * -1759402563;
                    }
                    aa = ((i9 << 9) - (i29 * i6)) + i29;
                    if (i < i2) {
                        i23 = i6 << 14;
                        if (i3 < 0) {
                            i24 = i23 - (i21 * i3);
                            i23 -= i3 * i22;
                            aa -= i30 * i3;
                            i3 = 0;
                        } else {
                            i24 = i23;
                        }
                        i25 = i4 << 14;
                        if (i < 0) {
                            i = 0;
                            i41 = i25 - (i20 * i);
                        } else {
                            i41 = i25;
                        }
                        i25 = i3 - (this.bh * -1508152919);
                        i42 = i28 + (i25 * i32);
                        i33 += i35 * i25;
                        i36 += i25 * i38;
                        if (i21 < i22) {
                            i43 = i2 - i;
                            i25 = i - i3;
                            i26 = this.be[i3];
                            i40 = aa;
                            i44 = i23;
                            i39 = i24;
                            aa = i25;
                            while (true) {
                                i45 = aa - 1;
                                if (i45 < 0) {
                                    break;
                                }
                                az(this.af, an, 0, 0, i26, i39 >> 14, i44 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 1245522068);
                                i39 += i21;
                                i40 += i30;
                                i26 += this.ak * -1741252353;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                i44 += i22;
                                aa = i45;
                            }
                            i22 = i39;
                            aa = i43;
                            while (true) {
                                i39 = aa - 1;
                                if (i39 >= 0) {
                                    az(this.af, an, 0, 0, i26, i22 >> 14, i41 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 1245522068);
                                    i41 += i20;
                                    i40 += i30;
                                    i26 += -1741252353 * this.ak;
                                    i42 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i22 += i21;
                                    aa = i39;
                                } else {
                                    return;
                                }
                            }
                        }
                        i43 = i2 - i;
                        i25 = i - i3;
                        i26 = this.be[i3];
                        i40 = aa;
                        i44 = i23;
                        i39 = i24;
                        aa = i25;
                        while (true) {
                            i45 = aa - 1;
                            if (i45 < 0) {
                                break;
                            }
                            az(this.af, an, 0, 0, i26, i44 >> 14, i39 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 1245522068);
                            i39 += i21;
                            i40 += i30;
                            i26 += this.ak * -1741252353;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            i44 += i22;
                            aa = i45;
                        }
                        i22 = i39;
                        aa = i43;
                        while (true) {
                            i39 = aa - 1;
                            if (i39 >= 0) {
                                az(this.af, an, 0, 0, i26, i41 >> 14, i22 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 1245522068);
                                i41 += i20;
                                i40 += i30;
                                i26 += -1741252353 * this.ak;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                i22 += i21;
                                aa = i39;
                            } else {
                                return;
                            }
                        }
                    }
                    i23 = i6 << 14;
                    if (i3 < 0) {
                        i24 = i23 - (i21 * i3);
                        i23 -= i22 * i3;
                        aa -= i30 * i3;
                        i3 = 0;
                    } else {
                        i24 = i23;
                    }
                    i25 = i5 << 14;
                    if (i2 < 0) {
                        i2 = 0;
                        i41 = i25 - (i2 * i20);
                    } else {
                        i41 = i25;
                    }
                    i25 = i3 - (this.bh * -1508152919);
                    i42 = i28 + (i32 * i25);
                    i33 += i35 * i25;
                    i36 += i25 * i38;
                    int i46;
                    if (i21 < i22) {
                        i43 = i - i2;
                        i25 = i2 - i3;
                        i26 = this.be[i3];
                        i40 = aa;
                        i39 = i23;
                        i44 = i24;
                        aa = i25;
                        while (true) {
                            i45 = aa - 1;
                            if (i45 < 0) {
                                break;
                            }
                            az(this.af, an, 0, 0, i26, i44 >> 14, i39 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 1245522068);
                            i39 += i22;
                            i40 += i30;
                            i26 += -1741252353 * this.ak;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            i44 += i21;
                            aa = i45;
                        }
                        aa = i43;
                        i46 = i41;
                        i41 = i39;
                        i39 = i46;
                        while (true) {
                            i43 = aa - 1;
                            if (i43 >= 0) {
                                az(this.af, an, 0, 0, i26, i39 >> 14, i41 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 1245522068);
                                i40 += i30;
                                i26 += -1741252353 * this.ak;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                i41 += i22;
                                i39 += i20;
                                aa = i43;
                            } else {
                                return;
                            }
                        }
                    }
                    i43 = i - i2;
                    i25 = i2 - i3;
                    i26 = this.be[i3];
                    i40 = aa;
                    i39 = i23;
                    i44 = i24;
                    aa = i25;
                    while (true) {
                        i45 = aa - 1;
                        if (i45 < 0) {
                            break;
                        }
                        az(this.af, an, 0, 0, i26, i39 >> 14, i44 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 1245522068);
                        i39 += i22;
                        i40 += i30;
                        i26 += this.ak * -1741252353;
                        i42 += i32;
                        i33 += i35;
                        i36 += i38;
                        i44 += i21;
                        aa = i45;
                    }
                    aa = i43;
                    i46 = i41;
                    i41 = i39;
                    i39 = i46;
                    while (true) {
                        i43 = aa - 1;
                        if (i43 >= 0) {
                            az(this.af, an, 0, 0, i26, i41 >> 14, i39 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 1245522068);
                            i40 += i30;
                            i26 += this.ak * -1741252353;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            i41 += i22;
                            i39 += i20;
                            aa = i43;
                        } else {
                            return;
                        }
                    }
                }
            } else if (i < this.bv * -1759402563) {
                if (i2 > -1759402563 * this.bv) {
                    i2 = -1759402563 * this.bv;
                }
                if (i3 > this.bv * -1759402563) {
                    i26 = -1759402563 * this.bv;
                } else {
                    i26 = i3;
                }
                aa = ((i7 << 9) - (i29 * i4)) + i29;
                if (i2 < i26) {
                    i24 = i4 << 14;
                    if (i < 0) {
                        i23 = i24 - (i * i22);
                        i24 -= i20 * i;
                        aa -= i * i30;
                        i = 0;
                    } else {
                        i23 = i24;
                    }
                    i25 = i5 << 14;
                    if (i2 < 0) {
                        i2 = 0;
                        i41 = i25 - (i2 * i21);
                    } else {
                        i41 = i25;
                    }
                    i25 = i - (-1508152919 * this.bh);
                    i42 = i28 + (i32 * i25);
                    i33 += i25 * i35;
                    i36 += i25 * i38;
                    if ((i2 == i || i22 >= i20) && (i2 != i || i22 <= i21)) {
                        i43 = i26 - i2;
                        i25 = i2 - i;
                        i26 = this.be[i];
                        i40 = aa;
                        i39 = i23;
                        i44 = i24;
                        aa = i25;
                        while (true) {
                            i45 = aa - 1;
                            if (i45 < 0) {
                                break;
                            }
                            az(this.af, an, 0, 0, i26, i44 >> 14, i39 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 1245522068);
                            i39 += i22;
                            i40 += i30;
                            i26 += this.ak * -1741252353;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            i44 += i20;
                            aa = i45;
                        }
                        i20 = i39;
                        aa = i43;
                        while (true) {
                            i39 = aa - 1;
                            if (i39 >= 0) {
                                az(this.af, an, 0, 0, i26, i41 >> 14, i20 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 1245522068);
                                i41 += i21;
                                i40 += i30;
                                i26 += -1741252353 * this.ak;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                i20 += i22;
                                aa = i39;
                            } else {
                                return;
                            }
                        }
                    }
                    i43 = i26 - i2;
                    i25 = i2 - i;
                    i26 = this.be[i];
                    i40 = aa;
                    i39 = i23;
                    i44 = i24;
                    aa = i25;
                    while (true) {
                        i45 = aa - 1;
                        if (i45 < 0) {
                            break;
                        }
                        az(this.af, an, 0, 0, i26, i39 >> 14, i44 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 1245522068);
                        i39 += i22;
                        i40 += i30;
                        i26 += -1741252353 * this.ak;
                        i42 += i32;
                        i33 += i35;
                        i36 += i38;
                        i44 += i20;
                        aa = i45;
                    }
                    i20 = i39;
                    aa = i43;
                    while (true) {
                        i39 = aa - 1;
                        if (i39 >= 0) {
                            az(this.af, an, 0, 0, i26, i20 >> 14, i41 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 1245522068);
                            i41 += i21;
                            i40 += i30;
                            i26 += this.ak * -1741252353;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            i20 += i22;
                            aa = i39;
                        } else {
                            return;
                        }
                    }
                }
                i23 = i4 << 14;
                if (i < 0) {
                    i24 = i23 - (i22 * i);
                    i39 = i23 - (i * i20);
                    i40 = aa - (i30 * i);
                    i = 0;
                } else {
                    i40 = aa;
                    i24 = i23;
                    i39 = i23;
                }
                aa = i6 << 14;
                if (i26 < 0) {
                    i41 = aa - (i26 * i21);
                    aa = 0;
                } else {
                    i41 = aa;
                    aa = i26;
                }
                i23 = i - (-1508152919 * this.bh);
                i42 = i28 + (i32 * i23);
                i33 += i23 * i35;
                i36 += i23 * i38;
                if ((aa == i || i22 >= i20) && (i != aa || i21 <= i20)) {
                    i43 = i2 - aa;
                    aa -= i;
                    i26 = this.be[i];
                    i44 = i24;
                    while (true) {
                        i45 = aa - 1;
                        if (i45 < 0) {
                            break;
                        }
                        az(this.af, an, 0, 0, i26, i39 >> 14, i44 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 1245522068);
                        i39 += i20;
                        i40 += i30;
                        i26 += this.ak * -1741252353;
                        i42 += i32;
                        i33 += i35;
                        i36 += i38;
                        i44 += i22;
                        aa = i45;
                    }
                    i22 = i39;
                    aa = i43;
                    while (true) {
                        i39 = aa - 1;
                        if (i39 >= 0) {
                            az(this.af, an, 0, 0, i26, i22 >> 14, i41 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 1245522068);
                            i41 += i21;
                            i40 += i30;
                            i26 += -1741252353 * this.ak;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            i22 += i20;
                            aa = i39;
                        } else {
                            return;
                        }
                    }
                }
                i43 = i2 - aa;
                aa -= i;
                i26 = this.be[i];
                i44 = i24;
                while (true) {
                    i45 = aa - 1;
                    if (i45 < 0) {
                        break;
                    }
                    az(this.af, an, 0, 0, i26, i44 >> 14, i39 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 1245522068);
                    i39 += i20;
                    i40 += i30;
                    i26 += -1741252353 * this.ak;
                    i42 += i32;
                    i33 += i35;
                    i36 += i38;
                    i44 += i22;
                    aa = i45;
                }
                i22 = i39;
                aa = i43;
                while (true) {
                    i39 = aa - 1;
                    if (i39 >= 0) {
                        az(this.af, an, 0, 0, i26, i41 >> 14, i22 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 1245522068);
                        i41 += i21;
                        i40 += i30;
                        i26 += this.ak * -1741252353;
                        i42 += i32;
                        i33 += i35;
                        i36 += i38;
                        i22 += i20;
                        aa = i39;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    final void dl(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        int[] an = ab.an(i19, (short) 255);
        if (an == null) {
            int aa = ab.aa(i19, 1577195485);
            ag(i, i2, i3, i4, i5, i6, bx.bu(aa, i7, -2137942363), bx.bu(aa, i8, -2137633569), bx.bu(aa, i9, -2146542776), 1872653134);
            return;
        }
        int i20;
        int i21;
        int i22;
        this.bw = ab.ay(i19, 1637064250);
        this.ap = ab.ag(i19, -2030401236);
        int i23 = i5 - i4;
        int i24 = i2 - i;
        int i25 = i6 - i4;
        int i26 = i3 - i;
        int i27 = i8 - i7;
        int i28 = i9 - i7;
        if (i2 != i) {
            i20 = ((i5 - i4) << 14) / (i2 - i);
        } else {
            i20 = 0;
        }
        if (i2 != i3) {
            i21 = ((i6 - i5) << 14) / (i3 - i2);
        } else {
            i21 = 0;
        }
        if (i != i3) {
            i22 = ((i4 - i6) << 14) / (i - i3);
        } else {
            i22 = 0;
        }
        aa = (i23 * i26) - (i25 * i24);
        if (aa != 0) {
            int i29 = (((i26 * i27) - (i24 * i28)) << 9) / aa;
            int i30 = (((i23 * i28) - (i27 * i25)) << 9) / aa;
            aa = i10 - i11;
            i23 = i13 - i14;
            i24 = i16 - i17;
            i25 = i12 - i10;
            i26 = i15 - i13;
            i27 = i18 - i16;
            i28 = ((i13 * i25) - (i10 * i26)) << 14;
            int i31 = (int) (((((long) ((i26 * i16) - (i27 * i13))) << 3) << 14) / ((long) (542614623 * this.bz)));
            int i32 = (int) ((((long) ((i10 * i27) - (i25 * i16))) << 14) / ((long) (542614623 * this.bz)));
            int i33 = ((aa * i13) - (i23 * i10)) << 14;
            int i34 = (int) (((((long) ((i23 * i16) - (i13 * i24))) << 3) << 14) / ((long) (542614623 * this.bz)));
            int i35 = (int) ((((long) ((i10 * i24) - (aa * i16))) << 14) / ((long) (this.bz * 542614623)));
            int i36 = ((i23 * i25) - (aa * i26)) << 14;
            int i37 = (int) (((((long) ((i26 * i24) - (i23 * i27))) << 3) << 14) / ((long) (542614623 * this.bz)));
            int i38 = (int) ((((long) ((aa * i27) - (i24 * i25))) << 14) / ((long) (this.bz * -1569461480)));
            int i39;
            int i40;
            int i41;
            int i42;
            int i43;
            int i44;
            int i45;
            int i46;
            if (i > i2 || i > i3) {
                if (i2 <= i3) {
                    if (i2 < 1402058039 * this.bv) {
                        if (i3 > 1730448686 * this.bv) {
                            i3 = this.bv * -1759402563;
                        }
                        if (i > this.bv * -1585951309) {
                            i = this.bv * -1759402563;
                        }
                        aa = ((i8 << 9) - (i29 * i5)) + i29;
                        if (i3 < i) {
                            i23 = i5 << 14;
                            if (i2 < 0) {
                                i24 = i23 - (i2 * i20);
                                i23 -= i21 * i2;
                                aa -= i30 * i2;
                                i2 = 0;
                            } else {
                                i24 = i23;
                            }
                            i25 = i6 << 14;
                            if (i3 < 0) {
                                i3 = 0;
                                i39 = i25 - (i3 * i22);
                            } else {
                                i39 = i25;
                            }
                            i25 = i2 - (1521986482 * this.bh);
                            i40 = i28 + (i32 * i25);
                            i33 += i25 * i35;
                            i36 += i25 * i38;
                            if ((i2 == i3 || i20 >= i21) && (i3 != i2 || i20 <= i22)) {
                                i41 = i - i3;
                                i25 = i3 - i2;
                                i26 = this.be[i2];
                                i42 = aa;
                                i43 = i23;
                                i44 = i24;
                                aa = i25;
                                while (true) {
                                    i45 = aa - 1;
                                    if (i45 < 0) {
                                        break;
                                    }
                                    az(this.af, an, 0, 0, i26, i43 >> 14, i44 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                                    i44 += i20;
                                    i42 += i30;
                                    i26 += -2037578834 * this.ak;
                                    i40 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i43 += i21;
                                    aa = i45;
                                }
                                aa = i41;
                                while (true) {
                                    i41 = aa - 1;
                                    if (i41 >= 0) {
                                        az(this.af, an, 0, 0, i26, i39 >> 14, i44 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                                        i39 += i22;
                                        i42 += i30;
                                        i26 += this.ak * -1732537371;
                                        i40 += i32;
                                        i33 += i35;
                                        i36 += i38;
                                        i44 += i20;
                                        aa = i41;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i41 = i - i3;
                            i25 = i3 - i2;
                            i26 = this.be[i2];
                            i42 = aa;
                            i43 = i23;
                            i44 = i24;
                            aa = i25;
                            while (true) {
                                i45 = aa - 1;
                                if (i45 < 0) {
                                    break;
                                }
                                az(this.af, an, 0, 0, i26, i44 >> 14, i43 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                                i44 += i20;
                                i42 += i30;
                                i26 += -1741252353 * this.ak;
                                i40 += i32;
                                i33 += i35;
                                i36 += i38;
                                i43 += i21;
                                aa = i45;
                            }
                            aa = i41;
                            while (true) {
                                i41 = aa - 1;
                                if (i41 >= 0) {
                                    az(this.af, an, 0, 0, i26, i44 >> 14, i39 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                                    i39 += i22;
                                    i42 += i30;
                                    i26 += 156939034 * this.ak;
                                    i40 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i44 += i20;
                                    aa = i41;
                                } else {
                                    return;
                                }
                            }
                        }
                        i24 = i5 << 14;
                        if (i2 < 0) {
                            i23 = i24 - (i20 * i2);
                            i44 = i24 - (i21 * i2);
                            i42 = aa - (i30 * i2);
                            i2 = 0;
                        } else {
                            i42 = aa;
                            i23 = i24;
                            i44 = i24;
                        }
                        aa = i4 << 14;
                        if (i < 0) {
                            i = 0;
                            i39 = aa - (i22 * i);
                        } else {
                            i39 = aa;
                        }
                        aa = i2 - (this.bh * -1508152919);
                        i40 = i28 + (aa * i32);
                        i33 += i35 * aa;
                        i36 += aa * i38;
                        if (i20 < i21) {
                            i41 = i3 - i;
                            aa = i - i2;
                            i26 = this.be[i2];
                            i43 = i23;
                            while (true) {
                                i45 = aa - 1;
                                if (i45 < 0) {
                                    break;
                                }
                                az(this.af, an, 0, 0, i26, i43 >> 14, i44 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                                i44 += i21;
                                i42 += i30;
                                i26 += 27336923 * this.ak;
                                i40 += i32;
                                i33 += i35;
                                i36 += i38;
                                i43 += i20;
                                aa = i45;
                            }
                            aa = i41;
                            i46 = i39;
                            i39 = i44;
                            i44 = i46;
                            while (true) {
                                i41 = aa - 1;
                                if (i41 >= 0) {
                                    az(this.af, an, 0, 0, i26, i44 >> 14, i39 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                                    i42 += i30;
                                    i26 += this.ak * -875113142;
                                    i40 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i39 += i21;
                                    i44 += i22;
                                    aa = i41;
                                } else {
                                    return;
                                }
                            }
                        }
                        i41 = i3 - i;
                        aa = i - i2;
                        i26 = this.be[i2];
                        i43 = i23;
                        while (true) {
                            i45 = aa - 1;
                            if (i45 < 0) {
                                break;
                            }
                            az(this.af, an, 0, 0, i26, i44 >> 14, i43 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                            i44 += i21;
                            i42 += i30;
                            i26 += -1741252353 * this.ak;
                            i40 += i32;
                            i33 += i35;
                            i36 += i38;
                            i43 += i20;
                            aa = i45;
                        }
                        aa = i41;
                        i46 = i39;
                        i39 = i44;
                        i44 = i46;
                        while (true) {
                            i41 = aa - 1;
                            if (i41 >= 0) {
                                az(this.af, an, 0, 0, i26, i39 >> 14, i44 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                                i42 += i30;
                                i26 += -1887934201 * this.ak;
                                i40 += i32;
                                i33 += i35;
                                i36 += i38;
                                i39 += i21;
                                i44 += i22;
                                aa = i41;
                            } else {
                                return;
                            }
                        }
                    }
                } else if (i3 < this.bv * -1759402563) {
                    if (i > this.bv * 2142384152) {
                        i = this.bv * -1759402563;
                    }
                    if (i2 > 1678525590 * this.bv) {
                        i2 = this.bv * 394113657;
                    }
                    aa = ((i9 << 9) - (i29 * i6)) + i29;
                    if (i < i2) {
                        i23 = i6 << 14;
                        if (i3 < 0) {
                            i44 = i23 - (i21 * i3);
                            i23 -= i3 * i22;
                            i42 = aa - (i30 * i3);
                            i3 = 0;
                        } else {
                            i42 = aa;
                            i44 = i23;
                        }
                        aa = i4 << 14;
                        if (i < 0) {
                            i = 0;
                            i39 = aa - (i20 * i);
                        } else {
                            i39 = aa;
                        }
                        aa = i3 - (this.bh * -348431082);
                        i40 = i28 + (aa * i32);
                        i33 += i35 * aa;
                        i36 += aa * i38;
                        if (i21 < i22) {
                            i41 = i2 - i;
                            aa = i - i3;
                            i26 = this.be[i3];
                            i43 = i23;
                            while (true) {
                                i45 = aa - 1;
                                if (i45 < 0) {
                                    break;
                                }
                                az(this.af, an, 0, 0, i26, i44 >> 14, i43 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                                i44 += i21;
                                i42 += i30;
                                i26 += this.ak * 1029096020;
                                i40 += i32;
                                i33 += i35;
                                i36 += i38;
                                i43 += i22;
                                aa = i45;
                            }
                            aa = i41;
                            i46 = i39;
                            i39 = i44;
                            i44 = i46;
                            while (true) {
                                i41 = aa - 1;
                                if (i41 >= 0) {
                                    az(this.af, an, 0, 0, i26, i39 >> 14, i44 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                                    i42 += i30;
                                    i26 += -1741252353 * this.ak;
                                    i40 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i44 += i20;
                                    i39 += i21;
                                    aa = i41;
                                } else {
                                    return;
                                }
                            }
                        }
                        i41 = i2 - i;
                        aa = i - i3;
                        i26 = this.be[i3];
                        i43 = i23;
                        while (true) {
                            i45 = aa - 1;
                            if (i45 < 0) {
                                break;
                            }
                            az(this.af, an, 0, 0, i26, i43 >> 14, i44 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                            i44 += i21;
                            i42 += i30;
                            i26 += this.ak * -1741252353;
                            i40 += i32;
                            i33 += i35;
                            i36 += i38;
                            i43 += i22;
                            aa = i45;
                        }
                        aa = i41;
                        i46 = i39;
                        i39 = i44;
                        i44 = i46;
                        while (true) {
                            i41 = aa - 1;
                            if (i41 >= 0) {
                                az(this.af, an, 0, 0, i26, i44 >> 14, i39 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                                aa = i39 + i21;
                                i42 += i30;
                                i26 += 554814340 * this.ak;
                                i40 += i32;
                                i33 += i35;
                                i36 += i38;
                                i44 += i20;
                                i39 = aa;
                                aa = i41;
                            } else {
                                return;
                            }
                        }
                    }
                    i23 = i6 << 14;
                    if (i3 < 0) {
                        i24 = i23 - (i21 * i3);
                        i23 -= i22 * i3;
                        aa -= i30 * i3;
                        i3 = 0;
                    } else {
                        i24 = i23;
                    }
                    i25 = i5 << 14;
                    if (i2 < 0) {
                        i2 = 0;
                        i39 = i25 - (i2 * i20);
                    } else {
                        i39 = i25;
                    }
                    i25 = i3 - (this.bh * -1306095721);
                    i40 = i28 + (i32 * i25);
                    i33 += i35 * i25;
                    i36 += i25 * i38;
                    if (i21 < i22) {
                        i41 = i - i2;
                        i25 = i2 - i3;
                        i26 = this.be[i3];
                        i42 = aa;
                        i44 = i23;
                        i43 = i24;
                        aa = i25;
                        while (true) {
                            i45 = aa - 1;
                            if (i45 < 0) {
                                break;
                            }
                            az(this.af, an, 0, 0, i26, i43 >> 14, i44 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                            i44 += i22;
                            i42 += i30;
                            i26 += 219501817 * this.ak;
                            i40 += i32;
                            i33 += i35;
                            i36 += i38;
                            i43 += i21;
                            aa = i45;
                        }
                        aa = i41;
                        i46 = i39;
                        i39 = i44;
                        i44 = i46;
                        while (true) {
                            i41 = aa - 1;
                            if (i41 >= 0) {
                                az(this.af, an, 0, 0, i26, i44 >> 14, i39 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                                i42 += i30;
                                i26 += 968080574 * this.ak;
                                i40 += i32;
                                i33 += i35;
                                i36 += i38;
                                i39 += i22;
                                i44 += i20;
                                aa = i41;
                            } else {
                                return;
                            }
                        }
                    }
                    i41 = i - i2;
                    i25 = i2 - i3;
                    i26 = this.be[i3];
                    i42 = aa;
                    i44 = i23;
                    i43 = i24;
                    aa = i25;
                    while (true) {
                        i45 = aa - 1;
                        if (i45 < 0) {
                            break;
                        }
                        az(this.af, an, 0, 0, i26, i44 >> 14, i43 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                        i44 += i22;
                        i42 += i30;
                        i26 += this.ak * -1690112186;
                        i40 += i32;
                        i33 += i35;
                        i36 += i38;
                        i43 += i21;
                        aa = i45;
                    }
                    aa = i41;
                    i46 = i39;
                    i39 = i44;
                    i44 = i46;
                    while (true) {
                        i41 = aa - 1;
                        if (i41 >= 0) {
                            az(this.af, an, 0, 0, i26, i39 >> 14, i44 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                            i42 += i30;
                            i26 += this.ak * 1593584282;
                            i40 += i32;
                            i33 += i35;
                            i36 += i38;
                            i39 += i22;
                            i44 += i20;
                            aa = i41;
                        } else {
                            return;
                        }
                    }
                }
            } else if (i < this.bv * -1086144933) {
                if (i2 > -1063766229 * this.bv) {
                    i2 = 1901896148 * this.bv;
                }
                if (i3 > this.bv * -1935819277) {
                    i23 = this.bv * -1759402563;
                } else {
                    i23 = i3;
                }
                i42 = ((i7 << 9) - (i29 * i4)) + i29;
                if (i2 < i23) {
                    aa = i4 << 14;
                    if (i < 0) {
                        i44 = aa - (i * i22);
                        i24 = aa - (i20 * i);
                        i42 -= i * i30;
                        i = 0;
                    } else {
                        i44 = aa;
                        i24 = aa;
                    }
                    aa = i5 << 14;
                    if (i2 < 0) {
                        i2 = 0;
                        i39 = aa - (i2 * i21);
                    } else {
                        i39 = aa;
                    }
                    aa = i - (-1571295876 * this.bh);
                    i40 = i28 + (i32 * aa);
                    i33 += aa * i35;
                    i36 += aa * i38;
                    if ((i2 == i || i22 >= i20) && (i2 != i || i22 <= i21)) {
                        i41 = i23 - i2;
                        aa = i2 - i;
                        i26 = this.be[i];
                        i43 = i24;
                        while (true) {
                            i45 = aa - 1;
                            if (i45 < 0) {
                                break;
                            }
                            az(this.af, an, 0, 0, i26, i43 >> 14, i44 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                            i44 += i22;
                            i42 += i30;
                            i26 += this.ak * -1741252353;
                            i40 += i32;
                            i33 += i35;
                            i36 += i38;
                            i43 += i20;
                            aa = i45;
                        }
                        aa = i41;
                        i46 = i39;
                        i39 = i44;
                        i44 = i46;
                        while (true) {
                            i41 = aa - 1;
                            if (i41 >= 0) {
                                az(this.af, an, 0, 0, i26, i44 >> 14, i39 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                                i42 += i30;
                                i26 += 353549606 * this.ak;
                                i40 += i32;
                                i33 += i35;
                                i36 += i38;
                                i44 += i21;
                                i39 += i22;
                                aa = i41;
                            } else {
                                return;
                            }
                        }
                    }
                    i41 = i23 - i2;
                    aa = i2 - i;
                    i26 = this.be[i];
                    i43 = i24;
                    while (true) {
                        i45 = aa - 1;
                        if (i45 < 0) {
                            break;
                        }
                        az(this.af, an, 0, 0, i26, i44 >> 14, i43 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                        i44 += i22;
                        i42 += i30;
                        i26 += -1741252353 * this.ak;
                        i40 += i32;
                        i33 += i35;
                        i36 += i38;
                        i43 += i20;
                        aa = i45;
                    }
                    aa = i41;
                    i46 = i39;
                    i39 = i44;
                    i44 = i46;
                    while (true) {
                        i41 = aa - 1;
                        if (i41 >= 0) {
                            az(this.af, an, 0, 0, i26, i39 >> 14, i44 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                            aa = i39 + i22;
                            i42 += i30;
                            i26 += this.ak * 1649587681;
                            i40 += i32;
                            i33 += i35;
                            i36 += i38;
                            i44 += i21;
                            i39 = aa;
                            aa = i41;
                        } else {
                            return;
                        }
                    }
                }
                aa = i4 << 14;
                if (i < 0) {
                    i24 = aa - (i22 * i);
                    i44 = aa - (i * i20);
                    i42 -= i30 * i;
                    i = 0;
                } else {
                    i24 = aa;
                    i44 = aa;
                }
                aa = i6 << 14;
                if (i23 < 0) {
                    i39 = aa - (i23 * i21);
                    aa = 0;
                } else {
                    i39 = aa;
                    aa = i23;
                }
                i23 = i - (-523971820 * this.bh);
                i40 = i28 + (i32 * i23);
                i33 += i23 * i35;
                i36 += i23 * i38;
                if ((aa == i || i22 >= i20) && (i != aa || i21 <= i20)) {
                    i41 = i2 - aa;
                    aa -= i;
                    i26 = this.be[i];
                    i43 = i24;
                    while (true) {
                        i45 = aa - 1;
                        if (i45 < 0) {
                            break;
                        }
                        az(this.af, an, 0, 0, i26, i44 >> 14, i43 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                        i44 += i20;
                        i42 += i30;
                        i26 += this.ak * -1741252353;
                        i40 += i32;
                        i33 += i35;
                        i36 += i38;
                        i43 += i22;
                        aa = i45;
                    }
                    aa = i41;
                    while (true) {
                        i41 = aa - 1;
                        if (i41 >= 0) {
                            az(this.af, an, 0, 0, i26, i44 >> 14, i39 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                            i39 += i21;
                            i42 += i30;
                            i26 += 2046625773 * this.ak;
                            i40 += i32;
                            i33 += i35;
                            i36 += i38;
                            i44 += i20;
                            aa = i41;
                        } else {
                            return;
                        }
                    }
                }
                i41 = i2 - aa;
                aa -= i;
                i26 = this.be[i];
                i43 = i24;
                while (true) {
                    i45 = aa - 1;
                    if (i45 < 0) {
                        break;
                    }
                    az(this.af, an, 0, 0, i26, i43 >> 14, i44 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                    i44 += i20;
                    i42 += i30;
                    i26 += -1741252353 * this.ak;
                    i40 += i32;
                    i33 += i35;
                    i36 += i38;
                    i43 += i22;
                    aa = i45;
                }
                aa = i41;
                while (true) {
                    i41 = aa - 1;
                    if (i41 >= 0) {
                        az(this.af, an, 0, 0, i26, i39 >> 14, i44 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                        i39 += i21;
                        i42 += i30;
                        i26 += this.ak * -1642684794;
                        i40 += i32;
                        i33 += i35;
                        i36 += i38;
                        i44 += i20;
                        aa = i41;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    final void dv(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        int[] an = ab.an(i19, (short) 255);
        if (an == null) {
            int aa = ab.aa(i19, 1577195485);
            ag(i, i2, i3, i4, i5, i6, bx.bu(aa, i7, -2114752856), bx.bu(aa, i8, -2109001187), bx.bu(aa, i9, -2115506335), 1954783136);
            return;
        }
        int i20;
        int i21;
        int i22;
        this.bw = ab.ay(i19, 734833600);
        this.ap = ab.ag(i19, 1183408112);
        int i23 = i5 - i4;
        int i24 = i2 - i;
        int i25 = i6 - i4;
        int i26 = i3 - i;
        int i27 = i8 - i7;
        int i28 = i9 - i7;
        if (i2 != i) {
            i20 = ((i5 - i4) << 14) / (i2 - i);
        } else {
            i20 = 0;
        }
        if (i2 != i3) {
            i21 = ((i6 - i5) << 14) / (i3 - i2);
        } else {
            i21 = 0;
        }
        if (i != i3) {
            i22 = ((i4 - i6) << 14) / (i - i3);
        } else {
            i22 = 0;
        }
        aa = (i23 * i26) - (i25 * i24);
        if (aa != 0) {
            int i29 = (((i26 * i27) - (i24 * i28)) << 9) / aa;
            int i30 = (((i23 * i28) - (i27 * i25)) << 9) / aa;
            aa = i10 - i11;
            i23 = i13 - i14;
            i24 = i16 - i17;
            i25 = i12 - i10;
            i26 = i15 - i13;
            i27 = i18 - i16;
            i28 = ((i13 * i25) - (i10 * i26)) << 14;
            int i31 = (int) (((((long) ((i26 * i16) - (i27 * i13))) << 3) << 14) / ((long) (542614623 * this.bz)));
            int i32 = (int) ((((long) ((i10 * i27) - (i25 * i16))) << 14) / ((long) (542614623 * this.bz)));
            int i33 = ((aa * i13) - (i23 * i10)) << 14;
            int i34 = (int) (((((long) ((i23 * i16) - (i13 * i24))) << 3) << 14) / ((long) (542614623 * this.bz)));
            int i35 = (int) ((((long) ((i10 * i24) - (aa * i16))) << 14) / ((long) (this.bz * 542614623)));
            int i36 = ((i23 * i25) - (aa * i26)) << 14;
            int i37 = (int) (((((long) ((i26 * i24) - (i23 * i27))) << 3) << 14) / ((long) (542614623 * this.bz)));
            int i38 = (int) ((((long) ((aa * i27) - (i24 * i25))) << 14) / ((long) (this.bz * 542614623)));
            int i39;
            int i40;
            int i41;
            int i42;
            int i43;
            int i44;
            int i45;
            if (i > i2 || i > i3) {
                if (i2 <= i3) {
                    if (i2 < -1759402563 * this.bv) {
                        if (i3 > -1759402563 * this.bv) {
                            i3 = this.bv * -1759402563;
                        }
                        if (i > this.bv * -1759402563) {
                            i = this.bv * -1759402563;
                        }
                        aa = ((i8 << 9) - (i29 * i5)) + i29;
                        if (i3 < i) {
                            i23 = i5 << 14;
                            if (i2 < 0) {
                                i24 = i23 - (i2 * i20);
                                i23 -= i21 * i2;
                                aa -= i30 * i2;
                                i2 = 0;
                            } else {
                                i24 = i23;
                            }
                            i25 = i6 << 14;
                            if (i3 < 0) {
                                i3 = 0;
                                i39 = i25 - (i3 * i22);
                            } else {
                                i39 = i25;
                            }
                            i25 = i2 - (-1508152919 * this.bh);
                            i40 = i28 + (i32 * i25);
                            i33 += i25 * i35;
                            i36 += i25 * i38;
                            if ((i2 == i3 || i20 >= i21) && (i3 != i2 || i20 <= i22)) {
                                i41 = i - i3;
                                i25 = i3 - i2;
                                i26 = this.be[i2];
                                i42 = aa;
                                i43 = i23;
                                i44 = i24;
                                aa = i25;
                                while (true) {
                                    i45 = aa - 1;
                                    if (i45 < 0) {
                                        break;
                                    }
                                    az(this.af, an, 0, 0, i26, i43 >> 14, i44 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                                    i44 += i20;
                                    i42 += i30;
                                    i26 += -1741252353 * this.ak;
                                    i40 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i43 += i21;
                                    aa = i45;
                                }
                                i21 = i44;
                                aa = i41;
                                while (true) {
                                    i44 = aa - 1;
                                    if (i44 >= 0) {
                                        az(this.af, an, 0, 0, i26, i39 >> 14, i21 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                                        i39 += i22;
                                        i42 += i30;
                                        i26 += this.ak * -1741252353;
                                        i40 += i32;
                                        i33 += i35;
                                        i36 += i38;
                                        i21 += i20;
                                        aa = i44;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i41 = i - i3;
                            i25 = i3 - i2;
                            i26 = this.be[i2];
                            i42 = aa;
                            i43 = i23;
                            i44 = i24;
                            aa = i25;
                            while (true) {
                                i45 = aa - 1;
                                if (i45 < 0) {
                                    break;
                                }
                                az(this.af, an, 0, 0, i26, i44 >> 14, i43 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                                i44 += i20;
                                i42 += i30;
                                i26 += -1741252353 * this.ak;
                                i40 += i32;
                                i33 += i35;
                                i36 += i38;
                                i43 += i21;
                                aa = i45;
                            }
                            i21 = i44;
                            aa = i41;
                            while (true) {
                                i44 = aa - 1;
                                if (i44 >= 0) {
                                    az(this.af, an, 0, 0, i26, i21 >> 14, i39 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                                    i39 += i22;
                                    i42 += i30;
                                    i26 += -1741252353 * this.ak;
                                    i40 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i21 += i20;
                                    aa = i44;
                                } else {
                                    return;
                                }
                            }
                        }
                        i24 = i5 << 14;
                        if (i2 < 0) {
                            i23 = i24 - (i20 * i2);
                            i24 -= i21 * i2;
                            aa -= i30 * i2;
                            i2 = 0;
                        } else {
                            i23 = i24;
                        }
                        i25 = i4 << 14;
                        if (i < 0) {
                            i = 0;
                            i39 = i25 - (i22 * i);
                        } else {
                            i39 = i25;
                        }
                        i25 = i2 - (this.bh * -1508152919);
                        i40 = i28 + (i25 * i32);
                        i33 += i35 * i25;
                        i36 += i25 * i38;
                        if (i20 < i21) {
                            i41 = i3 - i;
                            i25 = i - i2;
                            i26 = this.be[i2];
                            i42 = aa;
                            i43 = i23;
                            i44 = i24;
                            aa = i25;
                            while (true) {
                                i45 = aa - 1;
                                if (i45 < 0) {
                                    break;
                                }
                                az(this.af, an, 0, 0, i26, i43 >> 14, i44 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                                i44 += i21;
                                i42 += i30;
                                i26 += -1741252353 * this.ak;
                                i40 += i32;
                                i33 += i35;
                                i36 += i38;
                                i43 += i20;
                                aa = i45;
                            }
                            i20 = i44;
                            aa = i41;
                            while (true) {
                                i44 = aa - 1;
                                if (i44 >= 0) {
                                    az(this.af, an, 0, 0, i26, i39 >> 14, i20 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                                    i39 += i22;
                                    i42 += i30;
                                    i26 += this.ak * -1741252353;
                                    i40 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i20 += i21;
                                    aa = i44;
                                } else {
                                    return;
                                }
                            }
                        }
                        i41 = i3 - i;
                        i25 = i - i2;
                        i26 = this.be[i2];
                        i42 = aa;
                        i43 = i23;
                        i44 = i24;
                        aa = i25;
                        while (true) {
                            i45 = aa - 1;
                            if (i45 < 0) {
                                break;
                            }
                            az(this.af, an, 0, 0, i26, i44 >> 14, i43 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                            i44 += i21;
                            i42 += i30;
                            i26 += -1741252353 * this.ak;
                            i40 += i32;
                            i33 += i35;
                            i36 += i38;
                            i43 += i20;
                            aa = i45;
                        }
                        i20 = i44;
                        aa = i41;
                        while (true) {
                            i44 = aa - 1;
                            if (i44 >= 0) {
                                az(this.af, an, 0, 0, i26, i20 >> 14, i39 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                                i39 += i22;
                                i42 += i30;
                                i26 += -1741252353 * this.ak;
                                i40 += i32;
                                i33 += i35;
                                i36 += i38;
                                i20 += i21;
                                aa = i44;
                            } else {
                                return;
                            }
                        }
                    }
                } else if (i3 < this.bv * -1759402563) {
                    if (i > this.bv * -1759402563) {
                        i = this.bv * -1759402563;
                    }
                    if (i2 > -1759402563 * this.bv) {
                        i2 = this.bv * -1759402563;
                    }
                    aa = ((i9 << 9) - (i29 * i6)) + i29;
                    if (i < i2) {
                        i23 = i6 << 14;
                        if (i3 < 0) {
                            i24 = i23 - (i21 * i3);
                            i23 -= i3 * i22;
                            aa -= i30 * i3;
                            i3 = 0;
                        } else {
                            i24 = i23;
                        }
                        i25 = i4 << 14;
                        if (i < 0) {
                            i = 0;
                            i39 = i25 - (i20 * i);
                        } else {
                            i39 = i25;
                        }
                        i25 = i3 - (this.bh * -1508152919);
                        i40 = i28 + (i25 * i32);
                        i33 += i35 * i25;
                        i36 += i25 * i38;
                        if (i21 < i22) {
                            i41 = i2 - i;
                            i25 = i - i3;
                            i26 = this.be[i3];
                            i42 = aa;
                            i43 = i23;
                            i44 = i24;
                            aa = i25;
                            while (true) {
                                i45 = aa - 1;
                                if (i45 < 0) {
                                    break;
                                }
                                az(this.af, an, 0, 0, i26, i44 >> 14, i43 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                                i44 += i21;
                                i42 += i30;
                                i26 += this.ak * -1741252353;
                                i40 += i32;
                                i33 += i35;
                                i36 += i38;
                                i43 += i22;
                                aa = i45;
                            }
                            i22 = i44;
                            aa = i41;
                            while (true) {
                                i44 = aa - 1;
                                if (i44 >= 0) {
                                    az(this.af, an, 0, 0, i26, i22 >> 14, i39 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                                    i39 += i20;
                                    i42 += i30;
                                    i26 += -1741252353 * this.ak;
                                    i40 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i22 += i21;
                                    aa = i44;
                                } else {
                                    return;
                                }
                            }
                        }
                        i41 = i2 - i;
                        i25 = i - i3;
                        i26 = this.be[i3];
                        i42 = aa;
                        i43 = i23;
                        i44 = i24;
                        aa = i25;
                        while (true) {
                            i45 = aa - 1;
                            if (i45 < 0) {
                                break;
                            }
                            az(this.af, an, 0, 0, i26, i43 >> 14, i44 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                            i44 += i21;
                            i42 += i30;
                            i26 += this.ak * -1741252353;
                            i40 += i32;
                            i33 += i35;
                            i36 += i38;
                            i43 += i22;
                            aa = i45;
                        }
                        i22 = i44;
                        aa = i41;
                        while (true) {
                            i44 = aa - 1;
                            if (i44 >= 0) {
                                az(this.af, an, 0, 0, i26, i39 >> 14, i22 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                                i39 += i20;
                                i42 += i30;
                                i26 += -1741252353 * this.ak;
                                i40 += i32;
                                i33 += i35;
                                i36 += i38;
                                i22 += i21;
                                aa = i44;
                            } else {
                                return;
                            }
                        }
                    }
                    i23 = i6 << 14;
                    if (i3 < 0) {
                        i24 = i23 - (i21 * i3);
                        i23 -= i22 * i3;
                        aa -= i30 * i3;
                        i3 = 0;
                    } else {
                        i24 = i23;
                    }
                    i25 = i5 << 14;
                    if (i2 < 0) {
                        i2 = 0;
                        i39 = i25 - (i2 * i20);
                    } else {
                        i39 = i25;
                    }
                    i25 = i3 - (this.bh * -1508152919);
                    i40 = i28 + (i32 * i25);
                    i33 += i35 * i25;
                    i36 += i25 * i38;
                    if (i21 < i22) {
                        i41 = i - i2;
                        i25 = i2 - i3;
                        i26 = this.be[i3];
                        i42 = aa;
                        i44 = i23;
                        i43 = i24;
                        aa = i25;
                        while (true) {
                            i45 = aa - 1;
                            if (i45 < 0) {
                                break;
                            }
                            az(this.af, an, 0, 0, i26, i43 >> 14, i44 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                            i44 += i22;
                            i42 += i30;
                            i26 += -1741252353 * this.ak;
                            i40 += i32;
                            i33 += i35;
                            i36 += i38;
                            i43 += i21;
                            aa = i45;
                        }
                        i21 = i44;
                        aa = i41;
                        while (true) {
                            i44 = aa - 1;
                            if (i44 >= 0) {
                                az(this.af, an, 0, 0, i26, i39 >> 14, i21 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                                i39 += i20;
                                i42 += i30;
                                i26 += -1741252353 * this.ak;
                                i40 += i32;
                                i33 += i35;
                                i36 += i38;
                                i21 += i22;
                                aa = i44;
                            } else {
                                return;
                            }
                        }
                    }
                    i41 = i - i2;
                    i25 = i2 - i3;
                    i26 = this.be[i3];
                    i42 = aa;
                    i44 = i23;
                    i43 = i24;
                    aa = i25;
                    while (true) {
                        i45 = aa - 1;
                        if (i45 < 0) {
                            break;
                        }
                        az(this.af, an, 0, 0, i26, i44 >> 14, i43 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                        i44 += i22;
                        i42 += i30;
                        i26 += this.ak * -1741252353;
                        i40 += i32;
                        i33 += i35;
                        i36 += i38;
                        i43 += i21;
                        aa = i45;
                    }
                    i21 = i44;
                    aa = i41;
                    while (true) {
                        i44 = aa - 1;
                        if (i44 >= 0) {
                            az(this.af, an, 0, 0, i26, i21 >> 14, i39 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                            i39 += i20;
                            i42 += i30;
                            i26 += this.ak * -1741252353;
                            i40 += i32;
                            i33 += i35;
                            i36 += i38;
                            i21 += i22;
                            aa = i44;
                        } else {
                            return;
                        }
                    }
                }
            } else if (i < this.bv * -1759402563) {
                if (i2 > -1759402563 * this.bv) {
                    i2 = -1759402563 * this.bv;
                }
                if (i3 > this.bv * -1759402563) {
                    i26 = -1759402563 * this.bv;
                } else {
                    i26 = i3;
                }
                aa = ((i7 << 9) - (i29 * i4)) + i29;
                if (i2 < i26) {
                    i24 = i4 << 14;
                    if (i < 0) {
                        i23 = i24 - (i * i22);
                        i24 -= i20 * i;
                        aa -= i * i30;
                        i = 0;
                    } else {
                        i23 = i24;
                    }
                    i25 = i5 << 14;
                    if (i2 < 0) {
                        i2 = 0;
                        i39 = i25 - (i2 * i21);
                    } else {
                        i39 = i25;
                    }
                    i25 = i - (-1508152919 * this.bh);
                    i40 = i28 + (i32 * i25);
                    i33 += i25 * i35;
                    i36 += i25 * i38;
                    if ((i2 == i || i22 >= i20) && (i2 != i || i22 <= i21)) {
                        i41 = i26 - i2;
                        i25 = i2 - i;
                        i26 = this.be[i];
                        i42 = aa;
                        i44 = i23;
                        i43 = i24;
                        aa = i25;
                        while (true) {
                            i45 = aa - 1;
                            if (i45 < 0) {
                                break;
                            }
                            az(this.af, an, 0, 0, i26, i43 >> 14, i44 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                            i44 += i22;
                            i42 += i30;
                            i26 += this.ak * -1741252353;
                            i40 += i32;
                            i33 += i35;
                            i36 += i38;
                            i43 += i20;
                            aa = i45;
                        }
                        i20 = i44;
                        aa = i41;
                        while (true) {
                            i44 = aa - 1;
                            if (i44 >= 0) {
                                az(this.af, an, 0, 0, i26, i39 >> 14, i20 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                                i39 += i21;
                                i42 += i30;
                                i26 += -1741252353 * this.ak;
                                i40 += i32;
                                i33 += i35;
                                i36 += i38;
                                i20 += i22;
                                aa = i44;
                            } else {
                                return;
                            }
                        }
                    }
                    i41 = i26 - i2;
                    i25 = i2 - i;
                    i26 = this.be[i];
                    i42 = aa;
                    i44 = i23;
                    i43 = i24;
                    aa = i25;
                    while (true) {
                        i45 = aa - 1;
                        if (i45 < 0) {
                            break;
                        }
                        az(this.af, an, 0, 0, i26, i44 >> 14, i43 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                        i44 += i22;
                        i42 += i30;
                        i26 += -1741252353 * this.ak;
                        i40 += i32;
                        i33 += i35;
                        i36 += i38;
                        i43 += i20;
                        aa = i45;
                    }
                    i20 = i44;
                    aa = i41;
                    while (true) {
                        i44 = aa - 1;
                        if (i44 >= 0) {
                            az(this.af, an, 0, 0, i26, i20 >> 14, i39 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                            i39 += i21;
                            i42 += i30;
                            i26 += this.ak * -1741252353;
                            i40 += i32;
                            i33 += i35;
                            i36 += i38;
                            i20 += i22;
                            aa = i44;
                        } else {
                            return;
                        }
                    }
                }
                i23 = i4 << 14;
                if (i < 0) {
                    i24 = i23 - (i22 * i);
                    i44 = i23 - (i * i20);
                    i42 = aa - (i30 * i);
                    i = 0;
                } else {
                    i42 = aa;
                    i24 = i23;
                    i44 = i23;
                }
                aa = i6 << 14;
                if (i26 < 0) {
                    i39 = aa - (i26 * i21);
                    aa = 0;
                } else {
                    i39 = aa;
                    aa = i26;
                }
                i23 = i - (-1508152919 * this.bh);
                i40 = i28 + (i32 * i23);
                i33 += i23 * i35;
                i36 += i23 * i38;
                if ((aa == i || i22 >= i20) && (i != aa || i21 <= i20)) {
                    i41 = i2 - aa;
                    aa -= i;
                    i26 = this.be[i];
                    i43 = i24;
                    while (true) {
                        i45 = aa - 1;
                        if (i45 < 0) {
                            break;
                        }
                        az(this.af, an, 0, 0, i26, i44 >> 14, i43 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                        i44 += i20;
                        i42 += i30;
                        i26 += this.ak * -1741252353;
                        i40 += i32;
                        i33 += i35;
                        i36 += i38;
                        i43 += i22;
                        aa = i45;
                    }
                    i22 = i44;
                    aa = i41;
                    while (true) {
                        i44 = aa - 1;
                        if (i44 >= 0) {
                            az(this.af, an, 0, 0, i26, i22 >> 14, i39 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                            i39 += i21;
                            i42 += i30;
                            i26 += -1741252353 * this.ak;
                            i40 += i32;
                            i33 += i35;
                            i36 += i38;
                            i22 += i20;
                            aa = i44;
                        } else {
                            return;
                        }
                    }
                }
                i41 = i2 - aa;
                aa -= i;
                i26 = this.be[i];
                i43 = i24;
                while (true) {
                    i45 = aa - 1;
                    if (i45 < 0) {
                        break;
                    }
                    az(this.af, an, 0, 0, i26, i43 >> 14, i44 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                    i44 += i20;
                    i42 += i30;
                    i26 += -1741252353 * this.ak;
                    i40 += i32;
                    i33 += i35;
                    i36 += i38;
                    i43 += i22;
                    aa = i45;
                }
                i22 = i44;
                aa = i41;
                while (true) {
                    i44 = aa - 1;
                    if (i44 >= 0) {
                        az(this.af, an, 0, 0, i26, i39 >> 14, i22 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 1245522068);
                        i39 += i21;
                        i42 += i30;
                        i26 += this.ak * -1741252353;
                        i40 += i32;
                        i33 += i35;
                        i36 += i38;
                        i22 += i20;
                        aa = i44;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    final void az(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        try {
            if (this.al) {
                if (i5 > 784773023 * this.bf) {
                    i5 = 784773023 * this.bf;
                }
                if (i4 < 0) {
                    i4 = 0;
                }
            }
            if (i4 < i5) {
                int i15 = i3 + i4;
                int i16 = i6 + (i4 * i7);
                int i17 = i5 - i4;
                int i18;
                int i19;
                int i20;
                int i21;
                int i22;
                int i23;
                int i24;
                int i25;
                int i26;
                int i27;
                int i28;
                int i29;
                int i30;
                if (this.bw) {
                    i18 = i4 - (this.bg * -1575402035);
                    i19 = i8 + ((i11 >> 3) * i18);
                    i20 = i9 + ((i12 >> 3) * i18);
                    i21 = i10 + (i18 * (i13 >> 3));
                    i18 = i21 >> 12;
                    if (i18 != 0) {
                        i22 = i19 / i18;
                        i18 = i20 / i18;
                        if (i22 < 0) {
                            i22 = 0;
                        } else if (i22 > 4032) {
                            i22 = 4032;
                        }
                    } else {
                        i22 = 0;
                        i18 = 0;
                    }
                    i23 = i19 + i11;
                    i24 = i20 + i12;
                    i25 = i21 + i13;
                    i19 = i25 >> 12;
                    if (i19 != 0) {
                        i20 = i23 / i19;
                        i19 = i24 / i19;
                        if (i20 < 0) {
                            i20 = 0;
                        } else if (i20 > 4032) {
                            i20 = 4032;
                        }
                    } else {
                        i20 = 0;
                        i19 = 0;
                    }
                    i21 = (i22 << 20) + i18;
                    i18 = ((i19 - i18) >> 3) + (((i20 - i22) >> 3) << 20);
                    i17 >>= 3;
                    i26 = i7 << 3;
                    i22 = i16 >> 8;
                    if (this.ap) {
                        if (i17 > 0) {
                            i27 = i16;
                            i28 = i20;
                            i20 = i25;
                            i25 = i28;
                            i29 = i17;
                            i17 = i19;
                            i19 = i15;
                            i15 = i24;
                            i24 = i29;
                            int i31 = i23;
                            i23 = i21;
                            i21 = i31;
                            while (true) {
                                i16 = iArr2[(i23 >>> 26) + (i23 & 4032)];
                                i30 = i19 + 1;
                                iArr[i19] = ((((i16 & 65280) * i22) & 16711680) + (((16711935 & i16) * i22) & -16711936)) >> 8;
                                i19 = i23 + i18;
                                i23 = iArr2[(i19 >>> 26) + (i19 & 4032)];
                                i16 = i30 + 1;
                                iArr[i30] = ((((i23 & 16711935) * i22) & -16711936) + (((65280 & i23) * i22) & 16711680)) >> 8;
                                i19 += i18;
                                i23 = iArr2[(i19 >>> 26) + (i19 & 4032)];
                                i30 = i16 + 1;
                                iArr[i16] = ((((i23 & 65280) * i22) & 16711680) + (((16711935 & i23) * i22) & -16711936)) >> 8;
                                i19 += i18;
                                i23 = iArr2[(i19 & 4032) + (i19 >>> 26)];
                                i16 = i30 + 1;
                                iArr[i30] = ((((i23 & 16711935) * i22) & -16711936) + (((65280 & i23) * i22) & 16711680)) >> 8;
                                i19 += i18;
                                i23 = iArr2[(i19 & 4032) + (i19 >>> 26)];
                                i30 = i16 + 1;
                                iArr[i16] = ((((i23 & 16711935) * i22) & -16711936) + (((65280 & i23) * i22) & 16711680)) >> 8;
                                i19 += i18;
                                i23 = iArr2[(i19 & 4032) + (i19 >>> 26)];
                                i16 = i30 + 1;
                                iArr[i30] = ((((i23 & 65280) * i22) & 16711680) + (((16711935 & i23) * i22) & -16711936)) >> 8;
                                i19 += i18;
                                i23 = iArr2[(i19 >>> 26) + (i19 & 4032)];
                                i30 = i16 + 1;
                                iArr[i16] = ((((i23 & 16711935) * i22) & -16711936) + (((65280 & i23) * i22) & 16711680)) >> 8;
                                i23 = i19 + i18;
                                i16 = iArr2[(i23 >>> 26) + (i23 & 4032)];
                                i19 = i30 + 1;
                                iArr[i30] = (((i22 * (i16 & 65280)) & 16711680) + (((16711935 & i16) * i22) & -16711936)) >> 8;
                                i18 += i23;
                                i30 = i21 + i11;
                                i16 = i15 + i12;
                                i23 = i20 + i13;
                                i18 = i23 >> 12;
                                if (i18 != 0) {
                                    i22 = i30 / i18;
                                    i18 = i16 / i18;
                                    if (i22 < 0) {
                                        i15 = i18;
                                        i21 = 0;
                                    } else if (i22 > 4032) {
                                        i15 = i18;
                                        i21 = 4032;
                                    } else {
                                        i15 = i18;
                                        i21 = i22;
                                    }
                                } else {
                                    i15 = 0;
                                    i21 = 0;
                                }
                                i20 = (i25 << 20) + i17;
                                i18 = ((i15 - i17) >> 3) + (((i21 - i25) >> 3) << 20);
                                i25 = i27 + i26;
                                i22 = i25 >> 8;
                                i17 = i24 - 1;
                                if (i17 <= 0) {
                                    break;
                                }
                                i24 = i17;
                                i27 = i25;
                                i17 = i15;
                                i25 = i21;
                                i15 = i16;
                                i21 = i30;
                                i28 = i23;
                                i23 = i20;
                                i20 = i28;
                            }
                        } else {
                            i19 = i15;
                            i20 = i21;
                        }
                        i15 = (i5 - i4) & 7;
                        if (i15 > 0) {
                            i21 = i20;
                            i20 = i19;
                            i19 = i15;
                            while (true) {
                                i17 = iArr2[(i21 & 4032) + (i21 >>> 26)];
                                i15 = i20 + 1;
                                iArr[i20] = ((((i17 & 65280) * i22) & 16711680) + (((16711935 & i17) * i22) & -16711936)) >> 8;
                                i20 = i21 + i18;
                                i19--;
                                if (i19 > 0) {
                                    i21 = i20;
                                    i20 = i15;
                                } else {
                                    return;
                                }
                            }
                        }
                        return;
                    }
                    if (i17 > 0) {
                        while (true) {
                            i30 = iArr2[(i21 & 4032) + (i21 >>> 26)];
                            if (i30 != 0) {
                                iArr[i15] = ((((i30 & 16711935) * i22) & -16711936) + (((65280 & i30) * i22) & 16711680)) >> 8;
                            }
                            i15++;
                            i21 += i18;
                            i30 = iArr2[(i21 >>> 26) + (i21 & 4032)];
                            if (i30 != 0) {
                                iArr[i15] = ((((i30 & 65280) * i22) & 16711680) + (((16711935 & i30) * i22) & -16711936)) >> 8;
                            }
                            i15++;
                            i21 += i18;
                            i30 = iArr2[(i21 >>> 26) + (i21 & 4032)];
                            if (i30 != 0) {
                                iArr[i15] = ((((i30 & 16711935) * i22) & -16711936) + (((65280 & i30) * i22) & 16711680)) >> 8;
                            }
                            i15++;
                            i21 += i18;
                            i30 = iArr2[(i21 & 4032) + (i21 >>> 26)];
                            if (i30 != 0) {
                                iArr[i15] = ((((i30 & 16711935) * i22) & -16711936) + (((65280 & i30) * i22) & 16711680)) >> 8;
                            }
                            i15++;
                            i21 += i18;
                            i30 = iArr2[(i21 & 4032) + (i21 >>> 26)];
                            if (i30 != 0) {
                                iArr[i15] = ((((i30 & 16711935) * i22) & -16711936) + (((65280 & i30) * i22) & 16711680)) >> 8;
                            }
                            i15++;
                            i21 += i18;
                            i30 = iArr2[(i21 & 4032) + (i21 >>> 26)];
                            if (i30 != 0) {
                                iArr[i15] = ((((i30 & 65280) * i22) & 16711680) + (((16711935 & i30) * i22) & -16711936)) >> 8;
                            }
                            i15++;
                            i21 += i18;
                            i30 = iArr2[(i21 & 4032) + (i21 >>> 26)];
                            if (i30 != 0) {
                                iArr[i15] = ((((i30 & 65280) * i22) & 16711680) + (((16711935 & i30) * i22) & -16711936)) >> 8;
                            }
                            i15++;
                            i21 += i18;
                            i30 = iArr2[(i21 >>> 26) + (i21 & 4032)];
                            if (i30 != 0) {
                                iArr[i15] = (((i22 * (i30 & 65280)) & 16711680) + (((16711935 & i30) * i22) & -16711936)) >> 8;
                            }
                            i15++;
                            i18 += i21;
                            i23 += i11;
                            i24 += i12;
                            i25 += i13;
                            i18 = i25 >> 12;
                            if (i18 != 0) {
                                i22 = i23 / i18;
                                i18 = i24 / i18;
                                if (i22 < 0) {
                                    i22 = 0;
                                } else if (i22 > 4032) {
                                    i22 = 4032;
                                }
                            } else {
                                i22 = 0;
                                i18 = 0;
                            }
                            i21 = (i20 << 20) + i19;
                            i19 = ((i18 - i19) >> 3) + (((i22 - i20) >> 3) << 20);
                            i16 += i26;
                            i20 = i16 >> 8;
                            i17--;
                            if (i17 <= 0) {
                                break;
                            }
                            i28 = i18;
                            i18 = i19;
                            i19 = i28;
                            i29 = i22;
                            i22 = i20;
                            i20 = i29;
                        }
                        i22 = i15;
                        i15 = i20;
                        i20 = i19;
                        i19 = i21;
                    } else {
                        i20 = i18;
                        i19 = i21;
                        i28 = i15;
                        i15 = i22;
                        i22 = i28;
                    }
                    i18 = (i5 - i4) & 7;
                    if (i18 > 0) {
                        do {
                            i21 = iArr2[(i19 & 4032) + (i19 >>> 26)];
                            if (i21 != 0) {
                                iArr[i22] = ((((i21 & 65280) * i15) & 16711680) + (((16711935 & i21) * i15) & -16711936)) >> 8;
                            }
                            i22++;
                            i19 += i20;
                            i18--;
                        } while (i18 > 0);
                        return;
                    }
                    return;
                }
                i18 = i4 - (this.bg * -1575402035);
                i19 = i8 + ((i11 >> 3) * i18);
                i20 = i9 + ((i12 >> 3) * i18);
                i21 = i10 + (i18 * (i13 >> 3));
                i18 = i21 >> 14;
                if (i18 != 0) {
                    i22 = i19 / i18;
                    i18 = i20 / i18;
                    if (i22 < 0) {
                        i22 = 0;
                    } else if (i22 > 16256) {
                        i22 = 16256;
                    }
                } else {
                    i22 = 0;
                    i18 = 0;
                }
                i23 = i19 + i11;
                i24 = i20 + i12;
                i25 = i21 + i13;
                i19 = i25 >> 14;
                if (i19 != 0) {
                    i20 = i23 / i19;
                    i19 = i24 / i19;
                    if (i20 < 0) {
                        i20 = 0;
                    } else if (i20 > 16256) {
                        i20 = 16256;
                    }
                } else {
                    i20 = 0;
                    i19 = 0;
                }
                i21 = (i22 << 18) + i18;
                i18 = ((i19 - i18) >> 3) + (((i20 - i22) >> 3) << 18);
                i17 >>= 3;
                i26 = i7 << 3;
                i22 = i16 >> 8;
                if (this.ap) {
                    if (i17 > 0) {
                        while (true) {
                            i30 = iArr2[(i21 >>> 25) + (i21 & 16256)];
                            i27 = i15 + 1;
                            iArr[i15] = ((((i30 & 16711935) * i22) & -16711936) + (((65280 & i30) * i22) & 16711680)) >> 8;
                            i15 = i21 + i18;
                            i21 = iArr2[(i15 >>> 25) + (i15 & 16256)];
                            i30 = i27 + 1;
                            iArr[i27] = ((((i21 & 16711935) * i22) & -16711936) + (((65280 & i21) * i22) & 16711680)) >> 8;
                            i15 += i18;
                            i21 = iArr2[(i15 >>> 25) + (i15 & 16256)];
                            i27 = i30 + 1;
                            iArr[i30] = ((((i21 & 65280) * i22) & 16711680) + (((16711935 & i21) * i22) & -16711936)) >> 8;
                            i15 += i18;
                            i21 = iArr2[(i15 & 16256) + (i15 >>> 25)];
                            i30 = i27 + 1;
                            iArr[i27] = ((((i21 & 65280) * i22) & 16711680) + (((16711935 & i21) * i22) & -16711936)) >> 8;
                            i15 += i18;
                            i21 = iArr2[(i15 & 16256) + (i15 >>> 25)];
                            i27 = i30 + 1;
                            iArr[i30] = ((((i21 & 65280) * i22) & 16711680) + (((16711935 & i21) * i22) & -16711936)) >> 8;
                            i15 += i18;
                            i21 = iArr2[(i15 & 16256) + (i15 >>> 25)];
                            i30 = i27 + 1;
                            iArr[i27] = ((((i21 & 65280) * i22) & 16711680) + (((16711935 & i21) * i22) & -16711936)) >> 8;
                            i15 += i18;
                            i21 = iArr2[(i15 >>> 25) + (i15 & 16256)];
                            i27 = i30 + 1;
                            iArr[i30] = ((((i21 & 16711935) * i22) & -16711936) + (((65280 & i21) * i22) & 16711680)) >> 8;
                            i21 = i15 + i18;
                            i30 = iArr2[(i21 >>> 25) + (i21 & 16256)];
                            i15 = i27 + 1;
                            iArr[i27] = (((i22 * (i30 & 16711935)) & -16711936) + (((65280 & i30) * i22) & 16711680)) >> 8;
                            i18 += i21;
                            i23 += i11;
                            i24 += i12;
                            i25 += i13;
                            i18 = i25 >> 14;
                            if (i18 != 0) {
                                i22 = i23 / i18;
                                i18 = i24 / i18;
                                if (i22 < 0) {
                                    i22 = 0;
                                } else if (i22 > 16256) {
                                    i22 = 16256;
                                }
                            } else {
                                i22 = 0;
                                i18 = 0;
                            }
                            i21 = (i20 << 18) + i19;
                            i19 = ((i18 - i19) >> 3) + (((i22 - i20) >> 3) << 18);
                            i16 += i26;
                            i20 = i16 >> 8;
                            i17--;
                            if (i17 <= 0) {
                                break;
                            }
                            i28 = i18;
                            i18 = i19;
                            i19 = i28;
                            i29 = i22;
                            i22 = i20;
                            i20 = i29;
                        }
                        i22 = i15;
                        i15 = i19;
                        i19 = i21;
                        i21 = i20;
                    } else {
                        i19 = i21;
                        i21 = i22;
                        i22 = i15;
                        i15 = i18;
                    }
                    i18 = (i5 - i4) & 7;
                    if (i18 > 0) {
                        i20 = i19;
                        while (true) {
                            i17 = iArr2[(i20 & 16256) + (i20 >>> 25)];
                            i19 = i22 + 1;
                            iArr[i22] = ((((i17 & 65280) * i21) & 16711680) + (((16711935 & i17) * i21) & -16711936)) >> 8;
                            i22 = i20 + i15;
                            i18--;
                            if (i18 > 0) {
                                i20 = i22;
                                i22 = i19;
                            } else {
                                return;
                            }
                        }
                    }
                    return;
                }
                if (i17 > 0) {
                    i27 = i16;
                    i28 = i20;
                    i20 = i24;
                    i24 = i17;
                    i17 = i19;
                    i19 = i25;
                    i25 = i28;
                    i29 = i23;
                    i23 = i21;
                    i21 = i29;
                    while (true) {
                        i16 = iArr2[(i23 >>> 25) + (i23 & 16256)];
                        if (i16 != 0) {
                            iArr[i15] = ((((i16 & 65280) * i22) & 16711680) + (((16711935 & i16) * i22) & -16711936)) >> 8;
                        }
                        i15++;
                        i23 += i18;
                        i16 = iArr2[(i23 & 16256) + (i23 >>> 25)];
                        if (i16 != 0) {
                            iArr[i15] = ((((i16 & 16711935) * i22) & -16711936) + (((65280 & i16) * i22) & 16711680)) >> 8;
                        }
                        i15++;
                        i23 += i18;
                        i16 = iArr2[(i23 >>> 25) + (i23 & 16256)];
                        if (i16 != 0) {
                            iArr[i15] = ((((i16 & 65280) * i22) & 16711680) + (((16711935 & i16) * i22) & -16711936)) >> 8;
                        }
                        i15++;
                        i23 += i18;
                        i16 = iArr2[(i23 >>> 25) + (i23 & 16256)];
                        if (i16 != 0) {
                            iArr[i15] = ((((i16 & 16711935) * i22) & -16711936) + (((65280 & i16) * i22) & 16711680)) >> 8;
                        }
                        i15++;
                        i23 += i18;
                        i16 = iArr2[(i23 >>> 25) + (i23 & 16256)];
                        if (i16 != 0) {
                            iArr[i15] = ((((i16 & 16711935) * i22) & -16711936) + (((65280 & i16) * i22) & 16711680)) >> 8;
                        }
                        i15++;
                        i23 += i18;
                        i16 = iArr2[(i23 & 16256) + (i23 >>> 25)];
                        if (i16 != 0) {
                            iArr[i15] = ((((i16 & 65280) * i22) & 16711680) + (((16711935 & i16) * i22) & -16711936)) >> 8;
                        }
                        i15++;
                        i23 += i18;
                        i16 = iArr2[(i23 & 16256) + (i23 >>> 25)];
                        if (i16 != 0) {
                            iArr[i15] = ((((i16 & 65280) * i22) & 16711680) + (((16711935 & i16) * i22) & -16711936)) >> 8;
                        }
                        i15++;
                        i23 += i18;
                        i16 = iArr2[(i23 & 16256) + (i23 >>> 25)];
                        if (i16 != 0) {
                            iArr[i15] = (((i22 * (i16 & 16711935)) & -16711936) + (((65280 & i16) * i22) & 16711680)) >> 8;
                        }
                        i15++;
                        i18 += i23;
                        i30 = i21 + i11;
                        i16 = i20 + i12;
                        i23 = i19 + i13;
                        i18 = i23 >> 14;
                        if (i18 != 0) {
                            i22 = i30 / i18;
                            i18 = i16 / i18;
                            if (i22 < 0) {
                                i20 = i18;
                                i21 = 0;
                            } else if (i22 > 16256) {
                                i20 = i18;
                                i21 = 16256;
                            } else {
                                i20 = i18;
                                i21 = i22;
                            }
                        } else {
                            i20 = 0;
                            i21 = 0;
                        }
                        i19 = (i25 << 18) + i17;
                        i18 = ((i20 - i17) >> 3) + (((i21 - i25) >> 3) << 18);
                        i25 = i27 + i26;
                        i22 = i25 >> 8;
                        i17 = i24 - 1;
                        if (i17 <= 0) {
                            break;
                        }
                        i24 = i17;
                        i27 = i25;
                        i17 = i20;
                        i25 = i21;
                        i20 = i16;
                        i21 = i30;
                        i28 = i23;
                        i23 = i19;
                        i19 = i28;
                    }
                } else {
                    i19 = i21;
                }
                i20 = (i5 - i4) & 7;
                if (i20 > 0) {
                    i28 = i20;
                    i20 = i19;
                    i19 = i28;
                    do {
                        i21 = iArr2[(i20 & 16256) + (i20 >>> 25)];
                        if (i21 != 0) {
                            iArr[i15] = ((((i21 & 65280) * i22) & 16711680) + (((16711935 & i21) * i22) & -16711936)) >> 8;
                        }
                        i15++;
                        i20 += i18;
                        i19--;
                    } while (i19 > 0);
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "cj.az(" + ')');
        }
    }

    final void da(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        if (this.al) {
            if (i5 > 784773023 * this.bf) {
                i5 = 784773023 * this.bf;
            }
            if (i4 < 0) {
                i4 = 0;
            }
        }
        if (i4 < i5) {
            int i14 = i3 + i4;
            int i15 = i6 + (i4 * i7);
            int i16 = i5 - i4;
            int i17;
            int i18;
            int i19;
            int i20;
            int i21;
            int i22;
            int i23;
            int i24;
            int i25;
            int i26;
            int i27;
            int i28;
            int i29;
            if (this.bw) {
                i17 = i4 - (this.bg * -1575402035);
                i18 = i8 + ((i11 >> 3) * i17);
                i19 = i9 + ((i12 >> 3) * i17);
                i20 = i10 + (i17 * (i13 >> 3));
                i17 = i20 >> 12;
                if (i17 != 0) {
                    i21 = i18 / i17;
                    i17 = i19 / i17;
                    if (i21 < 0) {
                        i21 = 0;
                    } else if (i21 > 4032) {
                        i21 = 4032;
                    }
                } else {
                    i21 = 0;
                    i17 = 0;
                }
                i22 = i18 + i11;
                i23 = i19 + i12;
                i20 += i13;
                i18 = i20 >> 12;
                if (i18 != 0) {
                    i19 = i22 / i18;
                    i18 = i23 / i18;
                    if (i19 < 0) {
                        i19 = 0;
                    } else if (i19 > 4032) {
                        i19 = 4032;
                    }
                } else {
                    i19 = 0;
                    i18 = 0;
                }
                i24 = (i21 << 20) + i17;
                i21 = (((i19 - i21) >> 3) << 20) + ((i18 - i17) >> 3);
                i17 = i16 >> 3;
                i25 = i7 << 3;
                i16 = i15 >> 8;
                if (this.ap) {
                    if (i17 > 0) {
                        i26 = i17;
                        i17 = i16;
                        i16 = i26;
                        i27 = i15;
                        i15 = i14;
                        i14 = i27;
                        while (true) {
                            i28 = iArr2[(i24 >>> 26) + (i24 & 4032)];
                            i29 = i15 + 1;
                            iArr[i15] = ((((i28 & 65280) * i17) & 16711680) + (((16711935 & i28) * i17) & -16711936)) >> 8;
                            i15 = i24 + i21;
                            i24 = iArr2[(i15 >>> 26) + (i15 & 4032)];
                            i28 = i29 + 1;
                            iArr[i29] = ((((i24 & 16711935) * i17) & -16711936) + (((65280 & i24) * i17) & 16711680)) >> 8;
                            i15 += i21;
                            i24 = iArr2[(i15 >>> 26) + (i15 & 4032)];
                            i29 = i28 + 1;
                            iArr[i28] = ((((i24 & 65280) * i17) & 16711680) + (((16711935 & i24) * i17) & -16711936)) >> 8;
                            i15 += i21;
                            i24 = iArr2[(i15 & 4032) + (i15 >>> 26)];
                            i28 = i29 + 1;
                            iArr[i29] = ((((i24 & 16711935) * i17) & -16711936) + (((65280 & i24) * i17) & 16711680)) >> 8;
                            i15 += i21;
                            i24 = iArr2[(i15 & 4032) + (i15 >>> 26)];
                            i29 = i28 + 1;
                            iArr[i28] = ((((i24 & 16711935) * i17) & -16711936) + (((65280 & i24) * i17) & 16711680)) >> 8;
                            i15 += i21;
                            i24 = iArr2[(i15 & 4032) + (i15 >>> 26)];
                            i28 = i29 + 1;
                            iArr[i29] = ((((i24 & 65280) * i17) & 16711680) + (((16711935 & i24) * i17) & -16711936)) >> 8;
                            i15 += i21;
                            i24 = iArr2[(i15 >>> 26) + (i15 & 4032)];
                            i29 = i28 + 1;
                            iArr[i28] = ((((i24 & 16711935) * i17) & -16711936) + (((65280 & i24) * i17) & 16711680)) >> 8;
                            i15 += i21;
                            i28 = iArr2[(i15 >>> 26) + (i15 & 4032)];
                            i24 = i29 + 1;
                            iArr[i29] = (((i17 * (i28 & 65280)) & 16711680) + (((16711935 & i28) * i17) & -16711936)) >> 8;
                            i17 = i15 + i21;
                            i15 = i22 + i11;
                            i22 = i23 + i12;
                            i23 = i20 + i13;
                            i17 = i23 >> 12;
                            if (i17 != 0) {
                                i21 = i15 / i17;
                                i17 = i22 / i17;
                                if (i21 < 0) {
                                    i21 = 0;
                                } else if (i21 > 4032) {
                                    i21 = 4032;
                                }
                            } else {
                                i21 = 0;
                                i17 = 0;
                            }
                            i28 = (i19 << 20) + i18;
                            i19 = (((i21 - i19) >> 3) << 20) + ((i17 - i18) >> 3);
                            i14 += i25;
                            i20 = i14 >> 8;
                            i18 = i16 - 1;
                            if (i18 <= 0) {
                                break;
                            }
                            i16 = i18;
                            i18 = i17;
                            i17 = i20;
                            i20 = i23;
                            i23 = i22;
                            i22 = i15;
                            i15 = i24;
                            i24 = i28;
                            i26 = i21;
                            i21 = i19;
                            i19 = i26;
                        }
                    } else {
                        i19 = i21;
                        i20 = i16;
                        i28 = i24;
                        i24 = i14;
                    }
                    i17 = (i5 - i4) & 7;
                    if (i17 > 0) {
                        while (true) {
                            i18 = iArr2[(i28 & 4032) + (i28 >>> 26)];
                            i21 = i24 + 1;
                            iArr[i24] = ((((i18 & 65280) * i20) & 16711680) + (((16711935 & i18) * i20) & -16711936)) >> 8;
                            i28 += i19;
                            i17--;
                            if (i17 > 0) {
                                i24 = i21;
                            } else {
                                return;
                            }
                        }
                    }
                    return;
                }
                if (i17 > 0) {
                    i26 = i17;
                    i17 = i21;
                    i21 = i16;
                    i16 = i26;
                    i27 = i15;
                    i15 = i14;
                    i14 = i27;
                    while (true) {
                        i28 = iArr2[(i24 & 4032) + (i24 >>> 26)];
                        if (i28 != 0) {
                            iArr[i15] = ((((i28 & 16711935) * i21) & -16711936) + (((65280 & i28) * i21) & 16711680)) >> 8;
                        }
                        i15++;
                        i24 += i17;
                        i28 = iArr2[(i24 >>> 26) + (i24 & 4032)];
                        if (i28 != 0) {
                            iArr[i15] = ((((i28 & 65280) * i21) & 16711680) + (((16711935 & i28) * i21) & -16711936)) >> 8;
                        }
                        i15++;
                        i24 += i17;
                        i28 = iArr2[(i24 >>> 26) + (i24 & 4032)];
                        if (i28 != 0) {
                            iArr[i15] = ((((i28 & 16711935) * i21) & -16711936) + (((65280 & i28) * i21) & 16711680)) >> 8;
                        }
                        i15++;
                        i24 += i17;
                        i28 = iArr2[(i24 & 4032) + (i24 >>> 26)];
                        if (i28 != 0) {
                            iArr[i15] = ((((i28 & 16711935) * i21) & -16711936) + (((65280 & i28) * i21) & 16711680)) >> 8;
                        }
                        i15++;
                        i24 += i17;
                        i28 = iArr2[(i24 & 4032) + (i24 >>> 26)];
                        if (i28 != 0) {
                            iArr[i15] = ((((i28 & 16711935) * i21) & -16711936) + (((65280 & i28) * i21) & 16711680)) >> 8;
                        }
                        i15++;
                        i24 += i17;
                        i28 = iArr2[(i24 & 4032) + (i24 >>> 26)];
                        if (i28 != 0) {
                            iArr[i15] = ((((i28 & 65280) * i21) & 16711680) + (((16711935 & i28) * i21) & -16711936)) >> 8;
                        }
                        i15++;
                        i24 += i17;
                        i28 = iArr2[(i24 & 4032) + (i24 >>> 26)];
                        if (i28 != 0) {
                            iArr[i15] = ((((i28 & 65280) * i21) & 16711680) + (((16711935 & i28) * i21) & -16711936)) >> 8;
                        }
                        i15++;
                        i28 = i24 + i17;
                        i24 = iArr2[(i28 >>> 26) + (i28 & 4032)];
                        if (i24 != 0) {
                            iArr[i15] = (((i21 * (i24 & 65280)) & 16711680) + (((16711935 & i24) * i21) & -16711936)) >> 8;
                        }
                        i24 = i15 + 1;
                        i17 += i28;
                        i15 = i22 + i11;
                        i22 = i23 + i12;
                        i23 = i20 + i13;
                        i17 = i23 >> 12;
                        if (i17 != 0) {
                            i21 = i15 / i17;
                            i17 = i22 / i17;
                            if (i21 < 0) {
                                i21 = 0;
                            } else if (i21 > 4032) {
                                i21 = 4032;
                            }
                        } else {
                            i21 = 0;
                            i17 = 0;
                        }
                        i28 = (i19 << 20) + i18;
                        i19 = (((i21 - i19) >> 3) << 20) + ((i17 - i18) >> 3);
                        i14 += i25;
                        i20 = i14 >> 8;
                        i18 = i16 - 1;
                        if (i18 <= 0) {
                            break;
                        }
                        i16 = i18;
                        i18 = i17;
                        i17 = i19;
                        i19 = i21;
                        i21 = i20;
                        i20 = i23;
                        i23 = i22;
                        i22 = i15;
                        i15 = i24;
                        i24 = i28;
                    }
                } else {
                    i19 = i21;
                    i20 = i16;
                    i28 = i24;
                    i24 = i14;
                }
                i17 = (i5 - i4) & 7;
                if (i17 > 0) {
                    do {
                        i21 = iArr2[(i28 & 4032) + (i28 >>> 26)];
                        if (i21 != 0) {
                            iArr[i24] = ((((i21 & 65280) * i20) & 16711680) + (((16711935 & i21) * i20) & -16711936)) >> 8;
                        }
                        i24++;
                        i28 += i19;
                        i17--;
                    } while (i17 > 0);
                    return;
                }
                return;
            }
            i17 = i4 - (this.bg * -1575402035);
            i18 = i8 + ((i11 >> 3) * i17);
            i19 = i9 + ((i12 >> 3) * i17);
            i20 = i10 + (i17 * (i13 >> 3));
            i17 = i20 >> 14;
            if (i17 != 0) {
                i21 = i18 / i17;
                i17 = i19 / i17;
                if (i21 < 0) {
                    i21 = 0;
                } else if (i21 > 16256) {
                    i21 = 16256;
                }
            } else {
                i21 = 0;
                i17 = 0;
            }
            i22 = i18 + i11;
            i23 = i19 + i12;
            i20 += i13;
            i18 = i20 >> 14;
            if (i18 != 0) {
                i19 = i22 / i18;
                i18 = i23 / i18;
                if (i19 < 0) {
                    i19 = 0;
                } else if (i19 > 16256) {
                    i19 = 16256;
                }
            } else {
                i19 = 0;
                i18 = 0;
            }
            i24 = (i21 << 18) + i17;
            i21 = (((i19 - i21) >> 3) << 18) + ((i18 - i17) >> 3);
            i17 = i16 >> 3;
            i25 = i7 << 3;
            i16 = i15 >> 8;
            if (this.ap) {
                if (i17 > 0) {
                    i26 = i17;
                    i17 = i21;
                    i21 = i16;
                    i16 = i26;
                    i27 = i15;
                    i15 = i14;
                    i14 = i27;
                    while (true) {
                        i28 = iArr2[(i24 >>> 25) + (i24 & 16256)];
                        i29 = i15 + 1;
                        iArr[i15] = ((((i28 & 16711935) * i21) & -16711936) + (((65280 & i28) * i21) & 16711680)) >> 8;
                        i15 = i24 + i17;
                        i24 = iArr2[(i15 >>> 25) + (i15 & 16256)];
                        i28 = i29 + 1;
                        iArr[i29] = ((((i24 & 16711935) * i21) & -16711936) + (((65280 & i24) * i21) & 16711680)) >> 8;
                        i15 += i17;
                        i24 = iArr2[(i15 >>> 25) + (i15 & 16256)];
                        i29 = i28 + 1;
                        iArr[i28] = ((((i24 & 65280) * i21) & 16711680) + (((16711935 & i24) * i21) & -16711936)) >> 8;
                        i15 += i17;
                        i24 = iArr2[(i15 & 16256) + (i15 >>> 25)];
                        i28 = i29 + 1;
                        iArr[i29] = ((((i24 & 65280) * i21) & 16711680) + (((16711935 & i24) * i21) & -16711936)) >> 8;
                        i15 += i17;
                        i24 = iArr2[(i15 & 16256) + (i15 >>> 25)];
                        i29 = i28 + 1;
                        iArr[i28] = ((((i24 & 65280) * i21) & 16711680) + (((16711935 & i24) * i21) & -16711936)) >> 8;
                        i15 += i17;
                        i24 = iArr2[(i15 & 16256) + (i15 >>> 25)];
                        i28 = i29 + 1;
                        iArr[i29] = ((((i24 & 65280) * i21) & 16711680) + (((16711935 & i24) * i21) & -16711936)) >> 8;
                        i15 += i17;
                        i24 = iArr2[(i15 >>> 25) + (i15 & 16256)];
                        i29 = i28 + 1;
                        iArr[i28] = ((((i24 & 16711935) * i21) & -16711936) + (((65280 & i24) * i21) & 16711680)) >> 8;
                        i15 += i17;
                        i28 = iArr2[(i15 >>> 25) + (i15 & 16256)];
                        i24 = i29 + 1;
                        iArr[i29] = (((i21 * (i28 & 16711935)) & -16711936) + (((65280 & i28) * i21) & 16711680)) >> 8;
                        i17 += i15;
                        i15 = i22 + i11;
                        i22 = i23 + i12;
                        i23 = i20 + i13;
                        i17 = i23 >> 14;
                        if (i17 != 0) {
                            i21 = i15 / i17;
                            i17 = i22 / i17;
                            if (i21 < 0) {
                                i21 = 0;
                            } else if (i21 > 16256) {
                                i21 = 16256;
                            }
                        } else {
                            i21 = 0;
                            i17 = 0;
                        }
                        i28 = (i19 << 18) + i18;
                        i19 = (((i21 - i19) >> 3) << 18) + ((i17 - i18) >> 3);
                        i14 += i25;
                        i20 = i14 >> 8;
                        i18 = i16 - 1;
                        if (i18 <= 0) {
                            break;
                        }
                        i16 = i18;
                        i18 = i17;
                        i17 = i19;
                        i19 = i21;
                        i21 = i20;
                        i20 = i23;
                        i23 = i22;
                        i22 = i15;
                        i15 = i24;
                        i24 = i28;
                    }
                } else {
                    i19 = i21;
                    i20 = i16;
                    i28 = i24;
                    i24 = i14;
                }
                i17 = (i5 - i4) & 7;
                if (i17 > 0) {
                    while (true) {
                        i18 = iArr2[(i28 & 16256) + (i28 >>> 25)];
                        i21 = i24 + 1;
                        iArr[i24] = ((((i18 & 65280) * i20) & 16711680) + (((16711935 & i18) * i20) & -16711936)) >> 8;
                        i28 += i19;
                        i17--;
                        if (i17 > 0) {
                            i24 = i21;
                        } else {
                            return;
                        }
                    }
                }
                return;
            }
            if (i17 > 0) {
                i26 = i17;
                i17 = i16;
                i16 = i26;
                i27 = i15;
                i15 = i14;
                i14 = i27;
                while (true) {
                    i28 = iArr2[(i24 >>> 25) + (i24 & 16256)];
                    if (i28 != 0) {
                        iArr[i15] = ((((i28 & 65280) * i17) & 16711680) + (((16711935 & i28) * i17) & -16711936)) >> 8;
                    }
                    i15++;
                    i24 += i21;
                    i28 = iArr2[(i24 & 16256) + (i24 >>> 25)];
                    if (i28 != 0) {
                        iArr[i15] = ((((i28 & 16711935) * i17) & -16711936) + (((65280 & i28) * i17) & 16711680)) >> 8;
                    }
                    i15++;
                    i24 += i21;
                    i28 = iArr2[(i24 >>> 25) + (i24 & 16256)];
                    if (i28 != 0) {
                        iArr[i15] = ((((i28 & 65280) * i17) & 16711680) + (((16711935 & i28) * i17) & -16711936)) >> 8;
                    }
                    i15++;
                    i24 += i21;
                    i28 = iArr2[(i24 >>> 25) + (i24 & 16256)];
                    if (i28 != 0) {
                        iArr[i15] = ((((i28 & 16711935) * i17) & -16711936) + (((65280 & i28) * i17) & 16711680)) >> 8;
                    }
                    i15++;
                    i24 += i21;
                    i28 = iArr2[(i24 >>> 25) + (i24 & 16256)];
                    if (i28 != 0) {
                        iArr[i15] = ((((i28 & 16711935) * i17) & -16711936) + (((65280 & i28) * i17) & 16711680)) >> 8;
                    }
                    i15++;
                    i24 += i21;
                    i28 = iArr2[(i24 & 16256) + (i24 >>> 25)];
                    if (i28 != 0) {
                        iArr[i15] = ((((i28 & 65280) * i17) & 16711680) + (((16711935 & i28) * i17) & -16711936)) >> 8;
                    }
                    i15++;
                    i24 += i21;
                    i28 = iArr2[(i24 & 16256) + (i24 >>> 25)];
                    if (i28 != 0) {
                        iArr[i15] = ((((i28 & 65280) * i17) & 16711680) + (((16711935 & i28) * i17) & -16711936)) >> 8;
                    }
                    i15++;
                    i28 = i24 + i21;
                    i24 = iArr2[(i28 & 16256) + (i28 >>> 25)];
                    if (i24 != 0) {
                        iArr[i15] = (((i17 * (i24 & 16711935)) & -16711936) + (((65280 & i24) * i17) & 16711680)) >> 8;
                    }
                    i24 = i15 + 1;
                    i17 = i28 + i21;
                    i15 = i22 + i11;
                    i22 = i23 + i12;
                    i23 = i20 + i13;
                    i17 = i23 >> 14;
                    if (i17 != 0) {
                        i21 = i15 / i17;
                        i17 = i22 / i17;
                        if (i21 < 0) {
                            i21 = 0;
                        } else if (i21 > 16256) {
                            i21 = 16256;
                        }
                    } else {
                        i21 = 0;
                        i17 = 0;
                    }
                    i28 = (i19 << 18) + i18;
                    i19 = (((i21 - i19) >> 3) << 18) + ((i17 - i18) >> 3);
                    i14 += i25;
                    i20 = i14 >> 8;
                    i18 = i16 - 1;
                    if (i18 <= 0) {
                        break;
                    }
                    i16 = i18;
                    i18 = i17;
                    i17 = i20;
                    i20 = i23;
                    i23 = i22;
                    i22 = i15;
                    i15 = i24;
                    i24 = i28;
                    i26 = i21;
                    i21 = i19;
                    i19 = i26;
                }
            } else {
                i19 = i21;
                i20 = i16;
                i28 = i24;
                i24 = i14;
            }
            i17 = (i5 - i4) & 7;
            if (i17 > 0) {
                do {
                    i21 = iArr2[(i28 & 16256) + (i28 >>> 25)];
                    if (i21 != 0) {
                        iArr[i24] = ((((i21 & 65280) * i20) & 16711680) + (((16711935 & i21) * i20) & -16711936)) >> 8;
                    }
                    i24++;
                    i28 += i19;
                    i17--;
                } while (i17 > 0);
            }
        }
    }

    final void di(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        if (this.al) {
            if (i5 > 1378401118 * this.bf) {
                i5 = -1521391158 * this.bf;
            }
            if (i4 < 0) {
                i4 = 0;
            }
        }
        if (i4 < i5) {
            int i14 = i3 + i4;
            int i15 = i6 + (i4 * i7);
            int i16 = i5 - i4;
            int i17;
            int i18;
            int i19;
            int i20;
            int i21;
            int i22;
            int i23;
            int i24;
            int i25;
            int i26;
            int i27;
            int i28;
            if (this.bw) {
                i17 = i4 - (this.bg * -89970551);
                i18 = i8 + ((i11 >> 3) * i17);
                i19 = i9 + ((i12 >> 3) * i17);
                i20 = i10 + (i17 * (i13 >> 3));
                i17 = i20 >> 12;
                if (i17 != 0) {
                    i21 = i18 / i17;
                    i17 = i19 / i17;
                    if (i21 < 0) {
                        i21 = 0;
                    } else if (i21 > 4032) {
                        i21 = 4032;
                    }
                } else {
                    i21 = 0;
                    i17 = 0;
                }
                i22 = i18 + i11;
                i23 = i19 + i12;
                i24 = i20 + i13;
                i18 = i24 >> 12;
                if (i18 != 0) {
                    i19 = i22 / i18;
                    i18 = i23 / i18;
                    if (i19 < 0) {
                        i19 = 0;
                    } else if (i19 > 508324844) {
                        i19 = 1100687083;
                    }
                } else {
                    i19 = 0;
                    i18 = 0;
                }
                i20 = (i21 << 20) + i17;
                i17 = ((i18 - i17) >> 3) + (((i19 - i21) >> 3) << 20);
                i25 = i16 >> 3;
                i16 = i7 << 3;
                i21 = i15 >> 8;
                int i29;
                if (this.ap) {
                    if (i25 > 0) {
                        i26 = i18;
                        i18 = i14;
                        i14 = i21;
                        i21 = i19;
                        i19 = i17;
                        i17 = i26;
                        i29 = i23;
                        i23 = i22;
                        i22 = i20;
                        i20 = i24;
                        i24 = i29;
                        while (true) {
                            i27 = iArr2[(i22 >>> 26) + (i22 & 4032)];
                            i28 = i18 + 1;
                            iArr[i18] = ((((i27 & 65280) * i14) & 16711680) + (((-1131442474 & i27) * i14) & -705173502)) >> 8;
                            i18 = i22 + i19;
                            i22 = iArr2[(i18 >>> 26) + (i18 & 4032)];
                            i27 = i28 + 1;
                            iArr[i28] = ((((i22 & 884210677) * i14) & -1552616846) + (((65280 & i22) * i14) & 16711680)) >> 8;
                            i18 += i19;
                            i22 = iArr2[(i18 >>> 26) + (794129768 & i18)];
                            i28 = i27 + 1;
                            iArr[i27] = ((((i22 & 2138530558) * i14) & -451130871) + (((2060727440 & i22) * i14) & 1342076736)) >> 8;
                            i18 += i19;
                            i22 = iArr2[(i18 & 4032) + (i18 >>> 26)];
                            i27 = i28 + 1;
                            iArr[i28] = ((((i22 & 254421181) * i14) & 77469151) + (((1505115280 & i22) * i14) & 16711680)) >> 8;
                            i18 += i19;
                            i22 = iArr2[(76106136 & i18) + (i18 >>> 26)];
                            i28 = i27 + 1;
                            iArr[i27] = ((((i22 & 16711935) * i14) & -999465720) + (((816575670 & i22) * i14) & 16711680)) >> 8;
                            i18 += i19;
                            i22 = iArr2[(i18 & 4032) + (i18 >>> 26)];
                            i27 = i28 + 1;
                            iArr[i28] = ((((i22 & 65280) * i14) & 16711680) + (((16711935 & i22) * i14) & -16711936)) >> 8;
                            i18 += i19;
                            i22 = iArr2[(i18 >>> 26) + (i18 & 4032)];
                            i28 = i27 + 1;
                            iArr[i27] = ((((i22 & 1033453843) * i14) & -178478766) + (((969985874 & i22) * i14) & 16711680)) >> 8;
                            i22 = i18 + i19;
                            i27 = iArr2[(i22 >>> 26) + (i22 & 4032)];
                            i18 = i28 + 1;
                            iArr[i28] = (((i14 * (i27 & 65280)) & 1411150211) + (((16711935 & i27) * i14) & -347448206)) >> 8;
                            i19 += i22;
                            i22 = i23 + i11;
                            i23 = i24 + i12;
                            i24 = i20 + i13;
                            i19 = i24 >> 12;
                            if (i19 != 0) {
                                i20 = i22 / i19;
                                i14 = i23 / i19;
                                if (i20 < 0) {
                                    i20 = 0;
                                } else if (i20 > 1912688881) {
                                    i20 = 4032;
                                }
                            } else {
                                i20 = 0;
                                i14 = 0;
                            }
                            i19 = (i21 << 20) + i17;
                            i17 = ((i14 - i17) >> 3) + (((i20 - i21) >> 3) << 20);
                            i15 += i16;
                            i21 = i15 >> 8;
                            i25--;
                            if (i25 <= 0) {
                                break;
                            }
                            i26 = i14;
                            i14 = i21;
                            i21 = i20;
                            i20 = i24;
                            i24 = i23;
                            i23 = i22;
                            i22 = i19;
                            i19 = i17;
                            i17 = i26;
                        }
                    } else {
                        i18 = i14;
                        i19 = i20;
                    }
                    i14 = (i5 - i4) & 7;
                    if (i14 > 0) {
                        i20 = i19;
                        i19 = i18;
                        i18 = i14;
                        while (true) {
                            i25 = iArr2[(-2020327506 & i20) + (i20 >>> 26)];
                            i14 = i19 + 1;
                            iArr[i19] = ((((i25 & 65280) * i21) & 16711680) + (((16711935 & i25) * i21) & -16711936)) >> 8;
                            i19 = i20 + i17;
                            i18--;
                            if (i18 > 0) {
                                i20 = i19;
                                i19 = i14;
                            } else {
                                return;
                            }
                        }
                    }
                    return;
                }
                if (i25 > 0) {
                    while (true) {
                        i27 = iArr2[(i20 & 4032) + (i20 >>> 26)];
                        if (i27 != 0) {
                            iArr[i14] = ((((i27 & 361841737) * i21) & 1246008906) + (((65280 & i27) * i21) & -1499797655)) >> 8;
                        }
                        i14++;
                        i20 += i17;
                        i27 = iArr2[(i20 >>> 26) + (i20 & 4032)];
                        if (i27 != 0) {
                            iArr[i14] = ((((i27 & 65280) * i21) & 1847294918) + (((16711935 & i27) * i21) & -16711936)) >> 8;
                        }
                        i14++;
                        i20 += i17;
                        i27 = iArr2[(i20 >>> 26) + (i20 & 4032)];
                        if (i27 != 0) {
                            iArr[i14] = ((((i27 & 16711935) * i21) & -16711936) + (((65280 & i27) * i21) & 16711680)) >> 8;
                        }
                        i14++;
                        i20 += i17;
                        i27 = iArr2[(i20 & 4032) + (i20 >>> 26)];
                        if (i27 != 0) {
                            iArr[i14] = ((((i27 & -1300915308) * i21) & 481339531) + (((998343808 & i27) * i21) & 16711680)) >> 8;
                        }
                        i14++;
                        i20 += i17;
                        i27 = iArr2[(-737159543 & i20) + (i20 >>> 26)];
                        if (i27 != 0) {
                            iArr[i14] = ((((i27 & 16711935) * i21) & -1904205798) + (((-264407641 & i27) * i21) & 312505086)) >> 8;
                        }
                        i14++;
                        i20 += i17;
                        i27 = iArr2[(-1672489817 & i20) + (i20 >>> 26)];
                        if (i27 != 0) {
                            iArr[i14] = ((((i27 & -392755032) * i21) & -1401583199) + (((16711935 & i27) * i21) & 182776092)) >> 8;
                        }
                        i14++;
                        i20 += i17;
                        i27 = iArr2[(-568114244 & i20) + (i20 >>> 26)];
                        if (i27 != 0) {
                            iArr[i14] = ((((i27 & 1323948198) * i21) & -1362191335) + (((16711935 & i27) * i21) & -16711936)) >> 8;
                        }
                        i14++;
                        i20 += i17;
                        i27 = iArr2[(i20 >>> 26) + (-1873166303 & i20)];
                        if (i27 != 0) {
                            iArr[i14] = (((i21 * (i27 & 65280)) & 16711680) + (((16711935 & i27) * i21) & 2067975511)) >> 8;
                        }
                        i14++;
                        i17 += i20;
                        i22 += i11;
                        i23 += i12;
                        i24 += i13;
                        i17 = i24 >> 12;
                        if (i17 != 0) {
                            i21 = i22 / i17;
                            i17 = i23 / i17;
                            if (i21 < 0) {
                                i21 = 0;
                            } else if (i21 > 62896450) {
                                i21 = 1306706923;
                            }
                        } else {
                            i21 = 0;
                            i17 = 0;
                        }
                        i20 = (i19 << 20) + i18;
                        i18 = ((i17 - i18) >> 3) + (((i21 - i19) >> 3) << 20);
                        i15 += i16;
                        i19 = i15 >> 8;
                        i25--;
                        if (i25 <= 0) {
                            break;
                        }
                        i26 = i17;
                        i17 = i18;
                        i18 = i26;
                        i29 = i21;
                        i21 = i19;
                        i19 = i29;
                    }
                    i21 = i14;
                    i14 = i19;
                    i19 = i18;
                    i18 = i20;
                } else {
                    i19 = i17;
                    i18 = i20;
                    i26 = i14;
                    i14 = i21;
                    i21 = i26;
                }
                i17 = (i5 - i4) & 7;
                if (i17 > 0) {
                    do {
                        i20 = iArr2[(i18 & 4032) + (i18 >>> 26)];
                        if (i20 != 0) {
                            iArr[i21] = ((((i20 & 65280) * i14) & -2038381771) + (((16711935 & i20) * i14) & -1992234997)) >> 8;
                        }
                        i21++;
                        i18 += i19;
                        i17--;
                    } while (i17 > 0);
                    return;
                }
                return;
            }
            i17 = i4 - (this.bg * -1575402035);
            i18 = i8 + ((i11 >> 3) * i17);
            i19 = i9 + ((i12 >> 3) * i17);
            i20 = i10 + (i17 * (i13 >> 3));
            i17 = i20 >> 14;
            if (i17 != 0) {
                i21 = i18 / i17;
                i17 = i19 / i17;
                if (i21 < 0) {
                    i21 = 0;
                } else if (i21 > 16256) {
                    i21 = 16256;
                }
            } else {
                i21 = 0;
                i17 = 0;
            }
            i23 = i18 + i11;
            i24 = i19 + i12;
            i25 = i20 + i13;
            i18 = i25 >> 14;
            if (i18 != 0) {
                i19 = i23 / i18;
                i18 = i24 / i18;
                if (i19 < 0) {
                    i19 = 0;
                } else if (i19 > 16256) {
                    i19 = 16256;
                }
            } else {
                i19 = 0;
                i18 = 0;
            }
            i22 = (i21 << 18) + i17;
            i21 = (((i19 - i21) >> 3) << 18) + ((i18 - i17) >> 3);
            i17 = i16 >> 3;
            i27 = i7 << 3;
            i20 = i15 >> 8;
            if (this.ap) {
                if (i17 > 0) {
                    i26 = i17;
                    i17 = i21;
                    i21 = i20;
                    i20 = i25;
                    i25 = i24;
                    i24 = i23;
                    i23 = i14;
                    i14 = i26;
                    while (true) {
                        i16 = iArr2[(i22 >>> 25) + (-1819629554 & i22)];
                        i28 = i23 + 1;
                        iArr[i23] = ((((i16 & 108502580) * i21) & -16711936) + (((65280 & i16) * i21) & -1664370722)) >> 8;
                        i23 = i22 + i17;
                        i22 = iArr2[(i23 >>> 25) + (i23 & 16256)];
                        i16 = i28 + 1;
                        iArr[i28] = ((((i22 & 16711935) * i21) & -16711936) + (((65280 & i22) * i21) & -1944003229)) >> 8;
                        i23 += i17;
                        i22 = iArr2[(i23 >>> 25) + (i23 & 16256)];
                        i28 = i16 + 1;
                        iArr[i16] = ((((i22 & -458554041) * i21) & 16711680) + (((16711935 & i22) * i21) & -515346911)) >> 8;
                        i23 += i17;
                        i22 = iArr2[(i23 & 16256) + (i23 >>> 25)];
                        i16 = i28 + 1;
                        iArr[i28] = ((((i22 & -2100593930) * i21) & 16711680) + (((1967547125 & i22) * i21) & 1543941530)) >> 8;
                        i23 += i17;
                        i22 = iArr2[(1009060438 & i23) + (i23 >>> 25)];
                        i28 = i16 + 1;
                        iArr[i16] = ((((i22 & -1987296569) * i21) & -285475412) + (((-836591291 & i22) * i21) & 599727611)) >> 8;
                        i23 += i17;
                        i22 = iArr2[(i23 & 16256) + (i23 >>> 25)];
                        i16 = i28 + 1;
                        iArr[i28] = ((((i22 & 31109719) * i21) & 931022365) + (((16711935 & i22) * i21) & -16711936)) >> 8;
                        i23 += i17;
                        i22 = iArr2[(i23 >>> 25) + (-1597935254 & i23)];
                        i28 = i16 + 1;
                        iArr[i16] = ((((i22 & 16711935) * i21) & -16711936) + (((1106459186 & i22) * i21) & 16711680)) >> 8;
                        i23 += i17;
                        i16 = iArr2[(i23 >>> 25) + (i23 & 16256)];
                        i22 = i28 + 1;
                        iArr[i28] = (((i21 * (i16 & 1095754542)) & -16711936) + (((-31735412 & i16) * i21) & -1343329142)) >> 8;
                        i17 += i23;
                        i23 = i24 + i11;
                        i24 = i25 + i12;
                        i25 = i20 + i13;
                        i17 = i25 >> 14;
                        if (i17 != 0) {
                            i21 = i23 / i17;
                            i17 = i24 / i17;
                            if (i21 < 0) {
                                i21 = 0;
                            } else if (i21 > 16256) {
                                i21 = 156220670;
                            }
                        } else {
                            i21 = 0;
                            i17 = 0;
                        }
                        i16 = (i19 << 18) + i18;
                        i19 = (((i21 - i19) >> 3) << 18) + ((i17 - i18) >> 3);
                        i15 += i27;
                        i20 = i15 >> 8;
                        i18 = i14 - 1;
                        if (i18 <= 0) {
                            break;
                        }
                        i14 = i18;
                        i18 = i17;
                        i17 = i19;
                        i19 = i21;
                        i21 = i20;
                        i20 = i25;
                        i25 = i24;
                        i24 = i23;
                        i23 = i22;
                        i22 = i16;
                    }
                    i14 = i19;
                    i21 = i22;
                    i18 = i16;
                } else {
                    i18 = i22;
                    i26 = i14;
                    i14 = i21;
                    i21 = i26;
                }
                i17 = (i5 - i4) & 7;
                if (i17 > 0) {
                    i19 = i18;
                    while (true) {
                        i25 = iArr2[(-1209753664 & i19) + (i19 >>> 25)];
                        i18 = i21 + 1;
                        iArr[i21] = ((((i25 & -345957760) * i20) & -724233687) + (((16711935 & i25) * i20) & -16711936)) >> 8;
                        i21 = i19 + i14;
                        i17--;
                        if (i17 > 0) {
                            i19 = i21;
                            i21 = i18;
                        } else {
                            return;
                        }
                    }
                }
                return;
            }
            if (i17 > 0) {
                i26 = i17;
                i17 = i14;
                i14 = i26;
                while (true) {
                    i16 = iArr2[(i22 >>> 25) + (i22 & 16256)];
                    if (i16 != 0) {
                        iArr[i17] = ((((i16 & -1589534554) * i20) & 16711680) + (((16711935 & i16) * i20) & -16711936)) >> 8;
                    }
                    i17++;
                    i22 += i21;
                    i16 = iArr2[(1004272457 & i22) + (i22 >>> 25)];
                    if (i16 != 0) {
                        iArr[i17] = ((((i16 & 16711935) * i20) & -16711936) + (((65280 & i16) * i20) & 16711680)) >> 8;
                    }
                    i17++;
                    i22 += i21;
                    i16 = iArr2[(i22 >>> 25) + (i22 & 16256)];
                    if (i16 != 0) {
                        iArr[i17] = ((((i16 & -1290453350) * i20) & -2021943392) + (((16711935 & i16) * i20) & -16711936)) >> 8;
                    }
                    i17++;
                    i22 += i21;
                    i16 = iArr2[(i22 >>> 25) + (1155340756 & i22)];
                    if (i16 != 0) {
                        iArr[i17] = ((((i16 & 16711935) * i20) & -785097313) + (((65280 & i16) * i20) & 16711680)) >> 8;
                    }
                    i17++;
                    i22 += i21;
                    i16 = iArr2[(i22 >>> 25) + (1791356602 & i22)];
                    if (i16 != 0) {
                        iArr[i17] = ((((i16 & -2115784826) * i20) & -16711936) + (((65280 & i16) * i20) & 16711680)) >> 8;
                    }
                    i17++;
                    i22 += i21;
                    i16 = iArr2[(i22 & 16256) + (i22 >>> 25)];
                    if (i16 != 0) {
                        iArr[i17] = ((((i16 & 1768470149) * i20) & -1114420750) + (((16711935 & i16) * i20) & -1569696120)) >> 8;
                    }
                    i17++;
                    i22 += i21;
                    i16 = iArr2[(374225835 & i22) + (i22 >>> 25)];
                    if (i16 != 0) {
                        iArr[i17] = ((((i16 & 960128696) * i20) & -1846230992) + (((16711935 & i16) * i20) & 209000861)) >> 8;
                    }
                    i17++;
                    i16 = i22 + i21;
                    i22 = iArr2[(-1062429550 & i16) + (i16 >>> 25)];
                    if (i22 != 0) {
                        iArr[i17] = (((i20 * (i22 & 16711935)) & -16711936) + (((-237812675 & i22) * i20) & 16711680)) >> 8;
                    }
                    i22 = i17 + 1;
                    i17 = i16 + i21;
                    i23 += i11;
                    i24 += i12;
                    i25 += i13;
                    i17 = i25 >> 14;
                    if (i17 != 0) {
                        i21 = i23 / i17;
                        i17 = i24 / i17;
                        if (i21 < 0) {
                            i21 = 0;
                        } else if (i21 > -1803554987) {
                            i21 = 16256;
                        }
                    } else {
                        i21 = 0;
                        i17 = 0;
                    }
                    i16 = (i19 << 18) + i18;
                    i19 = (((i21 - i19) >> 3) << 18) + ((i17 - i18) >> 3);
                    i15 += i27;
                    i20 = i15 >> 8;
                    i18 = i14 - 1;
                    if (i18 <= 0) {
                        break;
                    }
                    i14 = i18;
                    i18 = i17;
                    i17 = i22;
                    i22 = i16;
                    i26 = i21;
                    i21 = i19;
                    i19 = i26;
                }
            } else {
                i19 = i21;
                i16 = i22;
                i22 = i14;
            }
            i17 = (i5 - i4) & 7;
            if (i17 > 0) {
                do {
                    i21 = iArr2[(i16 & 16256) + (i16 >>> 25)];
                    if (i21 != 0) {
                        iArr[i22] = ((((i21 & 948607644) * i20) & 321553347) + (((16711935 & i21) * i20) & -16711936)) >> 8;
                    }
                    i22++;
                    i16 += i19;
                    i17--;
                } while (i17 > 0);
            }
        }
    }

    final void ah(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
        try {
            int[] an = ab.an(i19, (short) 255);
            int aa;
            if (an == null) {
                aa = ab.aa(i19, 1577195485);
                ag(i, i2, i3, i4, i5, i6, bx.bu(aa, i7, -2104684649), bx.bu(aa, i8, -2118224208), bx.bu(aa, i9, -2138679208), 1843687308);
                return;
            }
            int i21;
            int i22;
            int i23;
            this.bw = ab.ay(i19, -411837604);
            this.ap = ab.ag(i19, 888214636);
            int i24 = i5 - i4;
            int i25 = i2 - i;
            int i26 = i6 - i4;
            int i27 = i3 - i;
            int i28 = i8 - i7;
            int i29 = i9 - i7;
            if (i2 != i) {
                i21 = ((i5 - i4) << 14) / (i2 - i);
            } else {
                i21 = 0;
            }
            if (i3 != i2) {
                i22 = ((i6 - i5) << 14) / (i3 - i2);
            } else {
                i22 = 0;
            }
            if (i != i3) {
                i23 = ((i4 - i6) << 14) / (i - i3);
            } else {
                i23 = 0;
            }
            aa = (i27 * i24) - (i26 * i25);
            if (aa != 0) {
                int i30 = (((i27 * i28) - (i25 * i29)) << 9) / aa;
                int i31 = (((i24 * i29) - (i28 * i26)) << 9) / aa;
                aa = i10 - i11;
                i24 = i13 - i14;
                i25 = i16 - i17;
                i26 = i12 - i10;
                i27 = i15 - i13;
                i28 = i18 - i16;
                i29 = ((i26 * i13) - (i10 * i27)) << 14;
                int i32 = (int) ((((long) ((i16 * i27) - (i13 * i28))) << 14) / ((long) (542614623 * this.bz)));
                int i33 = (int) ((((long) ((i28 * i10) - (i16 * i26))) << 14) / ((long) (542614623 * this.bz)));
                int i34 = ((i13 * aa) - (i10 * i24)) << 14;
                int i35 = (int) ((((long) ((i24 * i16) - (i25 * i13))) << 14) / ((long) (this.bz * 542614623)));
                int i36 = (int) ((((long) ((i10 * i25) - (i16 * aa))) << 14) / ((long) (this.bz * 542614623)));
                int i37 = ((i26 * i24) - (aa * i27)) << 14;
                int i38 = (int) ((((long) ((i27 * i25) - (i24 * i28))) << 14) / ((long) (542614623 * this.bz)));
                int i39 = (int) ((((long) ((aa * i28) - (i26 * i25))) << 14) / ((long) (542614623 * this.bz)));
                int i40;
                int i41;
                int i42;
                int i43;
                int i44;
                int i45;
                int i46;
                if (i > i2 || i > i3) {
                    if (i2 <= i3) {
                        if (i2 < -1759402563 * this.bv) {
                            if (i3 > -1759402563 * this.bv) {
                                i27 = -1759402563 * this.bv;
                            } else {
                                i27 = i3;
                            }
                            if (i > -1759402563 * this.bv) {
                                i26 = -1759402563 * this.bv;
                            } else {
                                i26 = i;
                            }
                            aa = ((i8 << 9) - (i5 * i30)) + i30;
                            if (i27 < i26) {
                                i24 = i5 << 14;
                                if (i2 < 0) {
                                    i40 = i24 - (i2 * i21);
                                    i24 -= i22 * i2;
                                    i41 = aa - (i31 * i2);
                                    i2 = 0;
                                    aa = i24;
                                } else {
                                    i41 = aa;
                                    i40 = i24;
                                    aa = i24;
                                }
                                i42 = i6 << 14;
                                if (i27 < 0) {
                                    i42 -= i27 * i23;
                                    i24 = 0;
                                } else {
                                    i24 = i27;
                                }
                                i25 = i2 - (-1508152919 * this.bh);
                                i43 = i29 + (i33 * i25);
                                i34 += i25 * i36;
                                i37 += i25 * i39;
                                if ((i2 == i24 || i21 >= i22) && (i2 != i24 || i21 <= i23)) {
                                    i44 = i26 - i24;
                                    i24 -= i2;
                                    i27 = this.be[i2];
                                    i45 = aa;
                                    aa = i24;
                                    while (true) {
                                        i46 = aa - 1;
                                        if (i46 < 0) {
                                            break;
                                        }
                                        ak(this.af, an, 0, 0, i27, i45 >> 14, i40 >> 14, i41, i30, i43, i34, i37, i32, i35, i38, 68239216);
                                        i40 += i21;
                                        i41 += i31;
                                        i27 += this.ak * -1741252353;
                                        i43 += i33;
                                        i34 += i36;
                                        i37 += i39;
                                        i45 += i22;
                                        aa = i46;
                                    }
                                    i22 = i42;
                                    aa = i44;
                                    i42 = i40;
                                    while (true) {
                                        i40 = aa - 1;
                                        if (i40 >= 0) {
                                            ak(this.af, an, 0, 0, i27, i22 >> 14, i42 >> 14, i41, i30, i43, i34, i37, i32, i35, i38, 68239216);
                                            i41 += i31;
                                            i27 += -1741252353 * this.ak;
                                            i43 += i33;
                                            i34 += i36;
                                            i37 += i39;
                                            i22 += i23;
                                            i42 += i21;
                                            aa = i40;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                i44 = i26 - i24;
                                i24 -= i2;
                                i27 = this.be[i2];
                                i45 = aa;
                                aa = i24;
                                while (true) {
                                    i46 = aa - 1;
                                    if (i46 < 0) {
                                        break;
                                    }
                                    ak(this.af, an, 0, 0, i27, i40 >> 14, i45 >> 14, i41, i30, i43, i34, i37, i32, i35, i38, 68239216);
                                    i40 += i21;
                                    i41 += i31;
                                    i27 += -1741252353 * this.ak;
                                    i43 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    i45 += i22;
                                    aa = i46;
                                }
                                i22 = i40;
                                aa = i44;
                                while (true) {
                                    i40 = aa - 1;
                                    if (i40 >= 0) {
                                        ak(this.af, an, 0, 0, i27, i22 >> 14, i42 >> 14, i41, i30, i43, i34, i37, i32, i35, i38, 68239216);
                                        i42 += i23;
                                        i41 += i31;
                                        i27 += this.ak * -1741252353;
                                        i43 += i33;
                                        i34 += i36;
                                        i37 += i39;
                                        i22 += i21;
                                        aa = i40;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i25 = i5 << 14;
                            if (i2 < 0) {
                                i24 = i25 - (i2 * i21);
                                i25 -= i22 * i2;
                                aa -= i2 * i31;
                                i2 = 0;
                            } else {
                                i24 = i25;
                            }
                            i40 = i4 << 14;
                            if (i26 < 0) {
                                i40 -= i26 * i23;
                                i26 = 0;
                            }
                            i28 = i2 - (-1508152919 * this.bh);
                            i43 = i29 + (i33 * i28);
                            i34 += i36 * i28;
                            i37 += i28 * i39;
                            if (i21 < i22) {
                                i44 = i27 - i26;
                                i26 -= i2;
                                i27 = this.be[i2];
                                i41 = aa;
                                i45 = i24;
                                i42 = i25;
                                aa = i26;
                                while (true) {
                                    i46 = aa - 1;
                                    if (i46 < 0) {
                                        break;
                                    }
                                    ak(this.af, an, 0, 0, i27, i45 >> 14, i42 >> 14, i41, i30, i43, i34, i37, i32, i35, i38, 68239216);
                                    i42 += i22;
                                    i41 += i31;
                                    i27 += -1741252353 * this.ak;
                                    i43 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    i45 += i21;
                                    aa = i46;
                                }
                                i21 = i42;
                                aa = i44;
                                while (true) {
                                    i42 = aa - 1;
                                    if (i42 >= 0) {
                                        ak(this.af, an, 0, 0, i27, i40 >> 14, i21 >> 14, i41, i30, i43, i34, i37, i32, i35, i38, 68239216);
                                        i40 += i23;
                                        i41 += i31;
                                        i27 += -1741252353 * this.ak;
                                        i43 += i33;
                                        i34 += i36;
                                        i37 += i39;
                                        i21 += i22;
                                        aa = i42;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i44 = i27 - i26;
                            i26 -= i2;
                            i27 = this.be[i2];
                            i41 = aa;
                            i45 = i24;
                            i42 = i25;
                            aa = i26;
                            while (true) {
                                i46 = aa - 1;
                                if (i46 < 0) {
                                    break;
                                }
                                ak(this.af, an, 0, 0, i27, i42 >> 14, i45 >> 14, i41, i30, i43, i34, i37, i32, i35, i38, 68239216);
                                i42 += i22;
                                i41 += i31;
                                i27 += -1741252353 * this.ak;
                                i43 += i33;
                                i34 += i36;
                                i37 += i39;
                                i45 += i21;
                                aa = i46;
                            }
                            i21 = i42;
                            aa = i44;
                            i42 = i40;
                            while (true) {
                                i40 = aa - 1;
                                if (i40 >= 0) {
                                    ak(this.af, an, 0, 0, i27, i21 >> 14, i42 >> 14, i41, i30, i43, i34, i37, i32, i35, i38, 68239216);
                                    i41 += i31;
                                    i27 += this.ak * -1741252353;
                                    i43 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    i21 += i22;
                                    i42 += i23;
                                    aa = i40;
                                } else {
                                    return;
                                }
                            }
                        }
                    } else if (i3 < this.bv * -1759402563) {
                        if (i > -1759402563 * this.bv) {
                            i26 = -1759402563 * this.bv;
                        } else {
                            i26 = i;
                        }
                        if (i2 > -1759402563 * this.bv) {
                            i2 = -1759402563 * this.bv;
                        }
                        aa = ((i9 << 9) - (i30 * i6)) + i30;
                        if (i26 < i2) {
                            i24 = i6 << 14;
                            if (i3 < 0) {
                                i25 = i24 - (i22 * i3);
                                i24 -= i3 * i23;
                                aa -= i31 * i3;
                                i3 = 0;
                            } else {
                                i25 = i24;
                            }
                            i40 = i4 << 14;
                            if (i26 < 0) {
                                i40 -= i26 * i21;
                                i26 = 0;
                            }
                            i27 = i3 - (-1508152919 * this.bh);
                            i43 = i29 + (i27 * i33);
                            i34 += i36 * i27;
                            i37 += i27 * i39;
                            if (i22 < i23) {
                                i44 = i2 - i26;
                                i26 -= i3;
                                i27 = this.be[i3];
                                i41 = aa;
                                i45 = i24;
                                i42 = i25;
                                aa = i26;
                                while (true) {
                                    i46 = aa - 1;
                                    if (i46 < 0) {
                                        break;
                                    }
                                    ak(this.af, an, 0, 0, i27, i42 >> 14, i45 >> 14, i41, i30, i43, i34, i37, i32, i35, i38, 68239216);
                                    i42 += i22;
                                    i41 += i31;
                                    i27 += -1741252353 * this.ak;
                                    i43 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    i45 += i23;
                                    aa = i46;
                                }
                                i23 = i42;
                                aa = i44;
                                while (true) {
                                    i42 = aa - 1;
                                    if (i42 >= 0) {
                                        ak(this.af, an, 0, 0, i27, i23 >> 14, i40 >> 14, i41, i30, i43, i34, i37, i32, i35, i38, 68239216);
                                        i40 += i21;
                                        i41 += i31;
                                        i27 += -1741252353 * this.ak;
                                        i43 += i33;
                                        i34 += i36;
                                        i37 += i39;
                                        i23 += i22;
                                        aa = i42;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i44 = i2 - i26;
                            i26 -= i3;
                            i27 = this.be[i3];
                            i41 = aa;
                            i45 = i24;
                            i42 = i25;
                            aa = i26;
                            while (true) {
                                i46 = aa - 1;
                                if (i46 < 0) {
                                    break;
                                }
                                ak(this.af, an, 0, 0, i27, i45 >> 14, i42 >> 14, i41, i30, i43, i34, i37, i32, i35, i38, 68239216);
                                i42 += i22;
                                i41 += i31;
                                i27 += -1741252353 * this.ak;
                                i43 += i33;
                                i34 += i36;
                                i37 += i39;
                                i45 += i23;
                                aa = i46;
                            }
                            i23 = i42;
                            aa = i44;
                            i42 = i40;
                            while (true) {
                                i40 = aa - 1;
                                if (i40 >= 0) {
                                    ak(this.af, an, 0, 0, i27, i42 >> 14, i23 >> 14, i41, i30, i43, i34, i37, i32, i35, i38, 68239216);
                                    i41 += i31;
                                    i27 += this.ak * -1741252353;
                                    i43 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    i23 += i22;
                                    i42 += i21;
                                    aa = i40;
                                } else {
                                    return;
                                }
                            }
                        }
                        i24 = i6 << 14;
                        if (i3 < 0) {
                            i25 = i24 - (i3 * i22);
                            i24 -= i23 * i3;
                            aa -= i31 * i3;
                            i3 = 0;
                        } else {
                            i25 = i24;
                        }
                        i40 = i5 << 14;
                        if (i2 < 0) {
                            i40 -= i2 * i21;
                            i2 = 0;
                        }
                        i27 = i3 - (-1508152919 * this.bh);
                        i43 = i29 + (i27 * i33);
                        i34 += i27 * i36;
                        i37 += i27 * i39;
                        if (i22 < i23) {
                            i44 = i26 - i2;
                            i26 = i2 - i3;
                            i27 = this.be[i3];
                            i41 = aa;
                            i42 = i24;
                            i45 = i25;
                            aa = i26;
                            while (true) {
                                i46 = aa - 1;
                                if (i46 < 0) {
                                    break;
                                }
                                ak(this.af, an, 0, 0, i27, i45 >> 14, i42 >> 14, i41, i30, i43, i34, i37, i32, i35, i38, 68239216);
                                i42 += i23;
                                i41 += i31;
                                i27 += this.ak * -1741252353;
                                i43 += i33;
                                i34 += i36;
                                i37 += i39;
                                i45 += i22;
                                aa = i46;
                            }
                            i22 = i42;
                            aa = i44;
                            while (true) {
                                i42 = aa - 1;
                                if (i42 >= 0) {
                                    ak(this.af, an, 0, 0, i27, i40 >> 14, i22 >> 14, i41, i30, i43, i34, i37, i32, i35, i38, 68239216);
                                    i40 += i21;
                                    i41 += i31;
                                    i27 += this.ak * -1741252353;
                                    i43 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    i22 += i23;
                                    aa = i42;
                                } else {
                                    return;
                                }
                            }
                        }
                        i44 = i26 - i2;
                        i26 = i2 - i3;
                        i27 = this.be[i3];
                        i41 = aa;
                        i42 = i24;
                        i45 = i25;
                        aa = i26;
                        while (true) {
                            i46 = aa - 1;
                            if (i46 < 0) {
                                break;
                            }
                            ak(this.af, an, 0, 0, i27, i42 >> 14, i45 >> 14, i41, i30, i43, i34, i37, i32, i35, i38, 68239216);
                            i42 += i23;
                            i41 += i31;
                            i27 += this.ak * -1741252353;
                            i43 += i33;
                            i34 += i36;
                            i37 += i39;
                            i45 += i22;
                            aa = i46;
                        }
                        i22 = i42;
                        aa = i44;
                        i42 = i40;
                        while (true) {
                            i40 = aa - 1;
                            if (i40 >= 0) {
                                ak(this.af, an, 0, 0, i27, i22 >> 14, i42 >> 14, i41, i30, i43, i34, i37, i32, i35, i38, 68239216);
                                i41 += i31;
                                i27 += this.ak * -1741252353;
                                i43 += i33;
                                i34 += i36;
                                i37 += i39;
                                i22 += i23;
                                i42 += i21;
                                aa = i40;
                            } else {
                                return;
                            }
                        }
                    }
                } else if (i < this.bv * -1759402563) {
                    if (i2 > -1759402563 * this.bv) {
                        i26 = this.bv * -1759402563;
                    } else {
                        i26 = i2;
                    }
                    if (i3 > this.bv * -1759402563) {
                        i3 = this.bv * -1759402563;
                    }
                    aa = ((i7 << 9) - (i4 * i30)) + i30;
                    if (i26 < i3) {
                        i25 = i4 << 14;
                        if (i < 0) {
                            i24 = i25 - (i23 * i);
                            i25 -= i * i21;
                            aa -= i31 * i;
                            i = 0;
                        } else {
                            i24 = i25;
                        }
                        i40 = i5 << 14;
                        if (i26 < 0) {
                            i40 -= i26 * i22;
                            i26 = 0;
                        }
                        i27 = i - (this.bh * -1508152919);
                        i43 = i29 + (i27 * i33);
                        i34 += i27 * i36;
                        i37 += i27 * i39;
                        if ((i26 == i || i23 >= i21) && (i26 != i || i23 <= i22)) {
                            i44 = i3 - i26;
                            i26 -= i;
                            i27 = this.be[i];
                            i41 = aa;
                            i42 = i24;
                            i45 = i25;
                            aa = i26;
                            while (true) {
                                i46 = aa - 1;
                                if (i46 < 0) {
                                    break;
                                }
                                ak(this.af, an, 0, 0, i27, i45 >> 14, i42 >> 14, i41, i30, i43, i34, i37, i32, i35, i38, 68239216);
                                i42 += i23;
                                i41 += i31;
                                i27 += -1741252353 * this.ak;
                                i43 += i33;
                                i34 += i36;
                                i37 += i39;
                                i45 += i21;
                                aa = i46;
                            }
                            i21 = i42;
                            aa = i44;
                            while (true) {
                                i42 = aa - 1;
                                if (i42 >= 0) {
                                    ak(this.af, an, 0, 0, i27, i40 >> 14, i21 >> 14, i41, i30, i43, i34, i37, i32, i35, i38, 68239216);
                                    i40 += i22;
                                    i41 += i31;
                                    i27 += -1741252353 * this.ak;
                                    i43 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    i21 += i23;
                                    aa = i42;
                                } else {
                                    return;
                                }
                            }
                        }
                        i44 = i3 - i26;
                        i26 -= i;
                        i27 = this.be[i];
                        i41 = aa;
                        i42 = i24;
                        i45 = i25;
                        aa = i26;
                        while (true) {
                            i46 = aa - 1;
                            if (i46 < 0) {
                                break;
                            }
                            ak(this.af, an, 0, 0, i27, i42 >> 14, i45 >> 14, i41, i30, i43, i34, i37, i32, i35, i38, 68239216);
                            i42 += i23;
                            i41 += i31;
                            i27 += -1741252353 * this.ak;
                            i43 += i33;
                            i34 += i36;
                            i37 += i39;
                            i45 += i21;
                            aa = i46;
                        }
                        i21 = i42;
                        aa = i44;
                        i42 = i40;
                        while (true) {
                            i40 = aa - 1;
                            if (i40 >= 0) {
                                ak(this.af, an, 0, 0, i27, i21 >> 14, i42 >> 14, i41, i30, i43, i34, i37, i32, i35, i38, 68239216);
                                i41 += i31;
                                i27 += -1741252353 * this.ak;
                                i43 += i33;
                                i34 += i36;
                                i37 += i39;
                                i21 += i23;
                                i42 += i22;
                                aa = i40;
                            } else {
                                return;
                            }
                        }
                    }
                    i25 = i4 << 14;
                    if (i < 0) {
                        i24 = i25 - (i23 * i);
                        i25 -= i * i21;
                        aa -= i31 * i;
                        i = 0;
                    } else {
                        i24 = i25;
                    }
                    i42 = i6 << 14;
                    if (i3 < 0) {
                        i42 -= i3 * i22;
                        i3 = 0;
                    }
                    i27 = i - (this.bh * -1508152919);
                    i43 = i29 + (i27 * i33);
                    i34 += i27 * i36;
                    i37 += i27 * i39;
                    if ((i3 == i || i23 >= i21) && (i != i3 || i22 <= i21)) {
                        i44 = i26 - i3;
                        i26 = i3 - i;
                        i27 = this.be[i];
                        i41 = aa;
                        i45 = i24;
                        i40 = i25;
                        aa = i26;
                        while (true) {
                            i46 = aa - 1;
                            if (i46 < 0) {
                                break;
                            }
                            ak(this.af, an, 0, 0, i27, i40 >> 14, i45 >> 14, i41, i30, i43, i34, i37, i32, i35, i38, 68239216);
                            i40 += i21;
                            i41 += i31;
                            i27 += -1741252353 * this.ak;
                            i43 += i33;
                            i34 += i36;
                            i37 += i39;
                            i45 += i23;
                            aa = i46;
                        }
                        i23 = i40;
                        aa = i44;
                        while (true) {
                            i40 = aa - 1;
                            if (i40 >= 0) {
                                ak(this.af, an, 0, 0, i27, i23 >> 14, i42 >> 14, i41, i30, i43, i34, i37, i32, i35, i38, 68239216);
                                i42 += i22;
                                i41 += i31;
                                i27 += this.ak * -1741252353;
                                i43 += i33;
                                i34 += i36;
                                i37 += i39;
                                i23 += i21;
                                aa = i40;
                            } else {
                                return;
                            }
                        }
                    }
                    i44 = i26 - i3;
                    i26 = i3 - i;
                    i27 = this.be[i];
                    i41 = aa;
                    i45 = i24;
                    i40 = i25;
                    aa = i26;
                    while (true) {
                        i46 = aa - 1;
                        if (i46 < 0) {
                            break;
                        }
                        ak(this.af, an, 0, 0, i27, i45 >> 14, i40 >> 14, i41, i30, i43, i34, i37, i32, i35, i38, 68239216);
                        i40 += i21;
                        i41 += i31;
                        i27 += -1741252353 * this.ak;
                        i43 += i33;
                        i34 += i36;
                        i37 += i39;
                        i45 += i23;
                        aa = i46;
                    }
                    i23 = i42;
                    aa = i44;
                    i42 = i40;
                    while (true) {
                        i40 = aa - 1;
                        if (i40 >= 0) {
                            ak(this.af, an, 0, 0, i27, i23 >> 14, i42 >> 14, i41, i30, i43, i34, i37, i32, i35, i38, 68239216);
                            i41 += i31;
                            i27 += -1741252353 * this.ak;
                            i43 += i33;
                            i34 += i36;
                            i37 += i39;
                            i23 += i22;
                            i42 += i21;
                            aa = i40;
                        } else {
                            return;
                        }
                    }
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "cj.ah(" + ')');
        }
    }

    final void dr(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        int[] an = ab.an(i19, (short) 255);
        if (an == null) {
            int aa = ab.aa(i19, 1577195485);
            ag(i, i2, i3, i4, i5, i6, bx.bu(aa, i7, -2107159748), bx.bu(aa, i8, -2084049681), bx.bu(aa, i9, -2095219196), 1254219238);
            return;
        }
        int i20;
        int i21;
        int i22;
        this.bw = ab.ay(i19, -40973320);
        this.ap = ab.ag(i19, -181727620);
        int i23 = i5 - i4;
        int i24 = i2 - i;
        int i25 = i6 - i4;
        int i26 = i3 - i;
        int i27 = i8 - i7;
        int i28 = i9 - i7;
        if (i2 != i) {
            i20 = ((i5 - i4) << 14) / (i2 - i);
        } else {
            i20 = 0;
        }
        if (i3 != i2) {
            i21 = ((i6 - i5) << 14) / (i3 - i2);
        } else {
            i21 = 0;
        }
        if (i != i3) {
            i22 = ((i4 - i6) << 14) / (i - i3);
        } else {
            i22 = 0;
        }
        aa = (i26 * i23) - (i25 * i24);
        if (aa != 0) {
            int i29 = (((i26 * i27) - (i24 * i28)) << 9) / aa;
            int i30 = (((i23 * i28) - (i27 * i25)) << 9) / aa;
            aa = i10 - i11;
            i23 = i13 - i14;
            i24 = i16 - i17;
            i25 = i12 - i10;
            i26 = i15 - i13;
            i27 = i18 - i16;
            i28 = ((i25 * i13) - (i10 * i26)) << 14;
            int i31 = (int) ((((long) ((i16 * i26) - (i13 * i27))) << 14) / ((long) (542614623 * this.bz)));
            int i32 = (int) ((((long) ((i27 * i10) - (i16 * i25))) << 14) / ((long) (542614623 * this.bz)));
            int i33 = ((i13 * aa) - (i10 * i23)) << 14;
            int i34 = (int) ((((long) ((i23 * i16) - (i24 * i13))) << 14) / ((long) (this.bz * 542614623)));
            int i35 = (int) ((((long) ((i10 * i24) - (i16 * aa))) << 14) / ((long) (this.bz * 542614623)));
            int i36 = ((i25 * i23) - (aa * i26)) << 14;
            int i37 = (int) ((((long) ((i26 * i24) - (i23 * i27))) << 14) / ((long) (542614623 * this.bz)));
            int i38 = (int) ((((long) ((aa * i27) - (i25 * i24))) << 14) / ((long) (542614623 * this.bz)));
            int i39;
            int i40;
            int i41;
            int i42;
            int i43;
            int i44;
            int i45;
            if (i > i2 || i > i3) {
                if (i2 <= i3) {
                    if (i2 < -1759402563 * this.bv) {
                        if (i3 > -1759402563 * this.bv) {
                            i3 = -1759402563 * this.bv;
                        }
                        if (i > -1759402563 * this.bv) {
                            i = -1759402563 * this.bv;
                        }
                        aa = ((i8 << 9) - (i5 * i29)) + i29;
                        if (i3 < i) {
                            i23 = i5 << 14;
                            if (i2 < 0) {
                                i39 = i23 - (i2 * i20);
                                i23 -= i21 * i2;
                                i40 = aa - (i30 * i2);
                                i2 = 0;
                            } else {
                                i40 = aa;
                                i39 = i23;
                            }
                            aa = i6 << 14;
                            if (i3 < 0) {
                                i3 = 0;
                                i41 = aa - (i3 * i22);
                            } else {
                                i41 = aa;
                            }
                            aa = i2 - (-1508152919 * this.bh);
                            i42 = i28 + (i32 * aa);
                            i33 += aa * i35;
                            i36 += aa * i38;
                            if ((i2 == i3 || i20 >= i21) && (i2 != i3 || i20 <= i22)) {
                                i43 = i - i3;
                                aa = i3 - i2;
                                i26 = this.be[i2];
                                i44 = i23;
                                while (true) {
                                    i45 = aa - 1;
                                    if (i45 < 0) {
                                        break;
                                    }
                                    ak(this.af, an, 0, 0, i26, i44 >> 14, i39 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 68239216);
                                    i39 += i20;
                                    i40 += i30;
                                    i26 += this.ak * -1741252353;
                                    i42 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i44 += i21;
                                    aa = i45;
                                }
                                i21 = i39;
                                aa = i43;
                                while (true) {
                                    i39 = aa - 1;
                                    if (i39 >= 0) {
                                        ak(this.af, an, 0, 0, i26, i41 >> 14, i21 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 68239216);
                                        i41 += i22;
                                        i40 += i30;
                                        i26 += -1741252353 * this.ak;
                                        i42 += i32;
                                        i33 += i35;
                                        i36 += i38;
                                        i21 += i20;
                                        aa = i39;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i43 = i - i3;
                            aa = i3 - i2;
                            i26 = this.be[i2];
                            i44 = i23;
                            while (true) {
                                i45 = aa - 1;
                                if (i45 < 0) {
                                    break;
                                }
                                ak(this.af, an, 0, 0, i26, i39 >> 14, i44 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 68239216);
                                i39 += i20;
                                i40 += i30;
                                i26 += -1741252353 * this.ak;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                i44 += i21;
                                aa = i45;
                            }
                            i21 = i39;
                            aa = i43;
                            while (true) {
                                i39 = aa - 1;
                                if (i39 >= 0) {
                                    ak(this.af, an, 0, 0, i26, i21 >> 14, i41 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 68239216);
                                    i41 += i22;
                                    i40 += i30;
                                    i26 += this.ak * -1741252353;
                                    i42 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i21 += i20;
                                    aa = i39;
                                } else {
                                    return;
                                }
                            }
                        }
                        i24 = i5 << 14;
                        if (i2 < 0) {
                            i23 = i24 - (i2 * i20);
                            i24 -= i21 * i2;
                            aa -= i2 * i30;
                            i2 = 0;
                        } else {
                            i23 = i24;
                        }
                        i25 = i4 << 14;
                        if (i < 0) {
                            i = 0;
                            i41 = i25 - (i22 * i);
                        } else {
                            i41 = i25;
                        }
                        i25 = i2 - (-1508152919 * this.bh);
                        i42 = i28 + (i32 * i25);
                        i33 += i35 * i25;
                        i36 += i25 * i38;
                        if (i20 < i21) {
                            i43 = i3 - i;
                            i25 = i - i2;
                            i26 = this.be[i2];
                            i40 = aa;
                            i44 = i23;
                            i39 = i24;
                            aa = i25;
                            while (true) {
                                i45 = aa - 1;
                                if (i45 < 0) {
                                    break;
                                }
                                ak(this.af, an, 0, 0, i26, i44 >> 14, i39 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 68239216);
                                i39 += i21;
                                i40 += i30;
                                i26 += -1741252353 * this.ak;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                i44 += i20;
                                aa = i45;
                            }
                            i20 = i39;
                            aa = i43;
                            while (true) {
                                i39 = aa - 1;
                                if (i39 >= 0) {
                                    ak(this.af, an, 0, 0, i26, i41 >> 14, i20 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 68239216);
                                    i41 += i22;
                                    i40 += i30;
                                    i26 += -1741252353 * this.ak;
                                    i42 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i20 += i21;
                                    aa = i39;
                                } else {
                                    return;
                                }
                            }
                        }
                        i43 = i3 - i;
                        i25 = i - i2;
                        i26 = this.be[i2];
                        i40 = aa;
                        i44 = i23;
                        i39 = i24;
                        aa = i25;
                        while (true) {
                            i45 = aa - 1;
                            if (i45 < 0) {
                                break;
                            }
                            ak(this.af, an, 0, 0, i26, i39 >> 14, i44 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 68239216);
                            i39 += i21;
                            i40 += i30;
                            i26 += -1741252353 * this.ak;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            i44 += i20;
                            aa = i45;
                        }
                        i20 = i39;
                        aa = i43;
                        while (true) {
                            i39 = aa - 1;
                            if (i39 >= 0) {
                                ak(this.af, an, 0, 0, i26, i20 >> 14, i41 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 68239216);
                                i41 += i22;
                                i40 += i30;
                                i26 += this.ak * -1741252353;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                i20 += i21;
                                aa = i39;
                            } else {
                                return;
                            }
                        }
                    }
                } else if (i3 < this.bv * -1759402563) {
                    if (i > -1759402563 * this.bv) {
                        i = -1759402563 * this.bv;
                    }
                    if (i2 > -1759402563 * this.bv) {
                        i2 = -1759402563 * this.bv;
                    }
                    aa = ((i9 << 9) - (i29 * i6)) + i29;
                    if (i < i2) {
                        i23 = i6 << 14;
                        if (i3 < 0) {
                            i39 = i23 - (i21 * i3);
                            i23 -= i3 * i22;
                            i40 = aa - (i30 * i3);
                            i3 = 0;
                        } else {
                            i40 = aa;
                            i39 = i23;
                        }
                        aa = i4 << 14;
                        if (i < 0) {
                            i = 0;
                            i41 = aa - (i20 * i);
                        } else {
                            i41 = aa;
                        }
                        aa = i3 - (-1508152919 * this.bh);
                        i42 = i28 + (aa * i32);
                        i33 += i35 * aa;
                        i36 += aa * i38;
                        int i46;
                        if (i21 < i22) {
                            i43 = i2 - i;
                            aa = i - i3;
                            i26 = this.be[i3];
                            i44 = i23;
                            while (true) {
                                i45 = aa - 1;
                                if (i45 < 0) {
                                    break;
                                }
                                ak(this.af, an, 0, 0, i26, i39 >> 14, i44 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 68239216);
                                i39 += i21;
                                i40 += i30;
                                i26 += -1741252353 * this.ak;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                i44 += i22;
                                aa = i45;
                            }
                            aa = i43;
                            i46 = i41;
                            i41 = i39;
                            i39 = i46;
                            while (true) {
                                i43 = aa - 1;
                                if (i43 >= 0) {
                                    ak(this.af, an, 0, 0, i26, i41 >> 14, i39 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 68239216);
                                    i40 += i30;
                                    i26 += -1741252353 * this.ak;
                                    i42 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i39 += i20;
                                    i41 += i21;
                                    aa = i43;
                                } else {
                                    return;
                                }
                            }
                        }
                        i43 = i2 - i;
                        aa = i - i3;
                        i26 = this.be[i3];
                        i44 = i23;
                        while (true) {
                            i45 = aa - 1;
                            if (i45 < 0) {
                                break;
                            }
                            ak(this.af, an, 0, 0, i26, i44 >> 14, i39 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 68239216);
                            i39 += i21;
                            i40 += i30;
                            i26 += -1741252353 * this.ak;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            i44 += i22;
                            aa = i45;
                        }
                        aa = i43;
                        i46 = i41;
                        i41 = i39;
                        i39 = i46;
                        while (true) {
                            i43 = aa - 1;
                            if (i43 >= 0) {
                                ak(this.af, an, 0, 0, i26, i39 >> 14, i41 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 68239216);
                                i40 += i30;
                                i26 += this.ak * -1741252353;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                i39 += i20;
                                i41 += i21;
                                aa = i43;
                            } else {
                                return;
                            }
                        }
                    }
                    i23 = i6 << 14;
                    if (i3 < 0) {
                        i24 = i23 - (i3 * i21);
                        i23 -= i22 * i3;
                        aa -= i30 * i3;
                        i3 = 0;
                    } else {
                        i24 = i23;
                    }
                    i25 = i5 << 14;
                    if (i2 < 0) {
                        i2 = 0;
                        i41 = i25 - (i2 * i20);
                    } else {
                        i41 = i25;
                    }
                    i25 = i3 - (-1508152919 * this.bh);
                    i42 = i28 + (i25 * i32);
                    i33 += i25 * i35;
                    i36 += i25 * i38;
                    if (i21 < i22) {
                        i43 = i - i2;
                        i25 = i2 - i3;
                        i26 = this.be[i3];
                        i40 = aa;
                        i39 = i23;
                        i44 = i24;
                        aa = i25;
                        while (true) {
                            i45 = aa - 1;
                            if (i45 < 0) {
                                break;
                            }
                            ak(this.af, an, 0, 0, i26, i44 >> 14, i39 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 68239216);
                            i39 += i22;
                            i40 += i30;
                            i26 += this.ak * -1741252353;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            i44 += i21;
                            aa = i45;
                        }
                        i21 = i39;
                        aa = i43;
                        while (true) {
                            i39 = aa - 1;
                            if (i39 >= 0) {
                                ak(this.af, an, 0, 0, i26, i41 >> 14, i21 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 68239216);
                                i41 += i20;
                                i40 += i30;
                                i26 += this.ak * -1741252353;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                i21 += i22;
                                aa = i39;
                            } else {
                                return;
                            }
                        }
                    }
                    i43 = i - i2;
                    i25 = i2 - i3;
                    i26 = this.be[i3];
                    i40 = aa;
                    i39 = i23;
                    i44 = i24;
                    aa = i25;
                    while (true) {
                        i45 = aa - 1;
                        if (i45 < 0) {
                            break;
                        }
                        ak(this.af, an, 0, 0, i26, i39 >> 14, i44 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 68239216);
                        i39 += i22;
                        i40 += i30;
                        i26 += this.ak * -1741252353;
                        i42 += i32;
                        i33 += i35;
                        i36 += i38;
                        i44 += i21;
                        aa = i45;
                    }
                    i21 = i39;
                    aa = i43;
                    while (true) {
                        i39 = aa - 1;
                        if (i39 >= 0) {
                            ak(this.af, an, 0, 0, i26, i21 >> 14, i41 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 68239216);
                            i41 += i20;
                            i40 += i30;
                            i26 += this.ak * -1741252353;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            i21 += i22;
                            aa = i39;
                        } else {
                            return;
                        }
                    }
                }
            } else if (i < this.bv * -1759402563) {
                if (i2 > -1759402563 * this.bv) {
                    i2 = this.bv * -1759402563;
                }
                if (i3 > this.bv * -1759402563) {
                    i3 = this.bv * -1759402563;
                }
                aa = ((i7 << 9) - (i4 * i29)) + i29;
                if (i2 < i3) {
                    i24 = i4 << 14;
                    if (i < 0) {
                        i23 = i24 - (i22 * i);
                        i24 -= i * i20;
                        aa -= i30 * i;
                        i = 0;
                    } else {
                        i23 = i24;
                    }
                    i25 = i5 << 14;
                    if (i2 < 0) {
                        i2 = 0;
                        i41 = i25 - (i2 * i21);
                    } else {
                        i41 = i25;
                    }
                    i25 = i - (this.bh * -1508152919);
                    i42 = i28 + (i25 * i32);
                    i33 += i25 * i35;
                    i36 += i25 * i38;
                    if ((i2 == i || i22 >= i20) && (i2 != i || i22 <= i21)) {
                        i43 = i3 - i2;
                        i25 = i2 - i;
                        i26 = this.be[i];
                        i40 = aa;
                        i39 = i23;
                        i44 = i24;
                        aa = i25;
                        while (true) {
                            i45 = aa - 1;
                            if (i45 < 0) {
                                break;
                            }
                            ak(this.af, an, 0, 0, i26, i44 >> 14, i39 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 68239216);
                            i39 += i22;
                            i40 += i30;
                            i26 += -1741252353 * this.ak;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            i44 += i20;
                            aa = i45;
                        }
                        i20 = i39;
                        aa = i43;
                        while (true) {
                            i39 = aa - 1;
                            if (i39 >= 0) {
                                ak(this.af, an, 0, 0, i26, i41 >> 14, i20 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 68239216);
                                i41 += i21;
                                i40 += i30;
                                i26 += -1741252353 * this.ak;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                i20 += i22;
                                aa = i39;
                            } else {
                                return;
                            }
                        }
                    }
                    i43 = i3 - i2;
                    i25 = i2 - i;
                    i26 = this.be[i];
                    i40 = aa;
                    i39 = i23;
                    i44 = i24;
                    aa = i25;
                    while (true) {
                        i45 = aa - 1;
                        if (i45 < 0) {
                            break;
                        }
                        ak(this.af, an, 0, 0, i26, i39 >> 14, i44 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 68239216);
                        i39 += i22;
                        i40 += i30;
                        i26 += -1741252353 * this.ak;
                        i42 += i32;
                        i33 += i35;
                        i36 += i38;
                        i44 += i20;
                        aa = i45;
                    }
                    i20 = i39;
                    aa = i43;
                    while (true) {
                        i39 = aa - 1;
                        if (i39 >= 0) {
                            ak(this.af, an, 0, 0, i26, i20 >> 14, i41 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 68239216);
                            i41 += i21;
                            i40 += i30;
                            i26 += -1741252353 * this.ak;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            i20 += i22;
                            aa = i39;
                        } else {
                            return;
                        }
                    }
                }
                i24 = i4 << 14;
                if (i < 0) {
                    i23 = i24 - (i22 * i);
                    i39 = i24 - (i * i20);
                    i40 = aa - (i30 * i);
                    i = 0;
                } else {
                    i40 = aa;
                    i23 = i24;
                    i39 = i24;
                }
                aa = i6 << 14;
                if (i3 < 0) {
                    i3 = 0;
                    i41 = aa - (i3 * i21);
                } else {
                    i41 = aa;
                }
                aa = i - (this.bh * -1508152919);
                i42 = i28 + (aa * i32);
                i33 += aa * i35;
                i36 += aa * i38;
                if ((i3 == i || i22 >= i20) && (i != i3 || i21 <= i20)) {
                    i43 = i2 - i3;
                    aa = i3 - i;
                    i26 = this.be[i];
                    i44 = i23;
                    while (true) {
                        i45 = aa - 1;
                        if (i45 < 0) {
                            break;
                        }
                        ak(this.af, an, 0, 0, i26, i39 >> 14, i44 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 68239216);
                        i39 += i20;
                        i40 += i30;
                        i26 += -1741252353 * this.ak;
                        i42 += i32;
                        i33 += i35;
                        i36 += i38;
                        i44 += i22;
                        aa = i45;
                    }
                    aa = i43;
                    while (true) {
                        i43 = aa - 1;
                        if (i43 >= 0) {
                            ak(this.af, an, 0, 0, i26, i39 >> 14, i41 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 68239216);
                            i41 += i21;
                            i40 += i30;
                            i26 += this.ak * -1741252353;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            i39 += i20;
                            aa = i43;
                        } else {
                            return;
                        }
                    }
                }
                i43 = i2 - i3;
                aa = i3 - i;
                i26 = this.be[i];
                i44 = i23;
                while (true) {
                    i45 = aa - 1;
                    if (i45 < 0) {
                        break;
                    }
                    ak(this.af, an, 0, 0, i26, i44 >> 14, i39 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 68239216);
                    i39 += i20;
                    i40 += i30;
                    i26 += -1741252353 * this.ak;
                    i42 += i32;
                    i33 += i35;
                    i36 += i38;
                    i44 += i22;
                    aa = i45;
                }
                aa = i43;
                while (true) {
                    i43 = aa - 1;
                    if (i43 >= 0) {
                        ak(this.af, an, 0, 0, i26, i41 >> 14, i39 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 68239216);
                        i41 += i21;
                        i40 += i30;
                        i26 += -1741252353 * this.ak;
                        i42 += i32;
                        i33 += i35;
                        i36 += i38;
                        i39 += i20;
                        aa = i43;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    final void ak(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        try {
            if (this.al) {
                if (i5 > this.bf * 784773023) {
                    i5 = 784773023 * this.bf;
                }
                if (i4 < 0) {
                    i4 = 0;
                }
            }
            if (i4 < i5) {
                int i15 = i3 + i4;
                int i16 = i6 + (i7 * i4);
                int i17 = i5 - i4;
                int i18;
                int i19;
                int i20;
                int i21;
                int i22;
                int i23;
                int i24;
                if (this.bw) {
                    i18 = i4 - (-1575402035 * this.bg);
                    i19 = i8 + (i18 * i11);
                    i20 = i9 + (i12 * i18);
                    i21 = i10 + (i18 * i13);
                    i18 = i21 >> 12;
                    if (i18 != 0) {
                        i22 = i19 / i18;
                        i18 = i20 / i18;
                    } else {
                        i22 = 0;
                        i18 = 0;
                    }
                    i19 += i17 * i11;
                    i23 = (i17 * i12) + i20;
                    i21 = ((i17 * i13) + i21) >> 12;
                    if (i21 != 0) {
                        i20 = i19 / i21;
                        i19 = i23 / i21;
                    } else {
                        i20 = 0;
                        i19 = 0;
                    }
                    i21 = (i22 << 20) + i18;
                    i23 = ((i19 - i18) / i17) + (((i20 - i22) / i17) << 20);
                    i22 = i17 >> 3;
                    i20 = i7 << 3;
                    i18 = i16 >> 8;
                    if (this.ap) {
                        if (i22 > 0) {
                            i19 = i16;
                            i24 = i18;
                            i18 = i22;
                            i22 = i24;
                            do {
                                i16 = iArr2[(i21 >>> 26) + (i21 & 4032)];
                                i17 = i15 + 1;
                                iArr[i15] = ((((i16 & 16711935) * i22) & -16711936) + (((65280 & i16) * i22) & 16711680)) >> 8;
                                i15 = i21 + i23;
                                i21 = iArr2[(i15 & 4032) + (i15 >>> 26)];
                                i16 = i17 + 1;
                                iArr[i17] = ((((i21 & 16711935) * i22) & -16711936) + (((65280 & i21) * i22) & 16711680)) >> 8;
                                i15 += i23;
                                i21 = iArr2[(i15 & 4032) + (i15 >>> 26)];
                                i17 = i16 + 1;
                                iArr[i16] = ((((i21 & 65280) * i22) & 16711680) + (((16711935 & i21) * i22) & -16711936)) >> 8;
                                i15 += i23;
                                i21 = iArr2[(i15 & 4032) + (i15 >>> 26)];
                                i16 = i17 + 1;
                                iArr[i17] = ((((i21 & 65280) * i22) & 16711680) + (((16711935 & i21) * i22) & -16711936)) >> 8;
                                i15 += i23;
                                i21 = iArr2[(i15 >>> 26) + (i15 & 4032)];
                                i17 = i16 + 1;
                                iArr[i16] = ((((i21 & 65280) * i22) & 16711680) + (((16711935 & i21) * i22) & -16711936)) >> 8;
                                i15 += i23;
                                i21 = iArr2[(i15 >>> 26) + (i15 & 4032)];
                                i16 = i17 + 1;
                                iArr[i17] = ((((i21 & 65280) * i22) & 16711680) + (((16711935 & i21) * i22) & -16711936)) >> 8;
                                i15 += i23;
                                i21 = iArr2[(i15 >>> 26) + (i15 & 4032)];
                                i17 = i16 + 1;
                                iArr[i16] = ((((i21 & 65280) * i22) & 16711680) + (((16711935 & i21) * i22) & -16711936)) >> 8;
                                i21 = i15 + i23;
                                i16 = iArr2[(i21 & 4032) + (i21 >>> 26)];
                                i15 = i17 + 1;
                                iArr[i17] = (((i22 * (i16 & 65280)) & 16711680) + (((16711935 & i16) * i22) & -16711936)) >> 8;
                                i21 += i23;
                                i19 += i20;
                                i22 = i19 >> 8;
                                i18--;
                            } while (i18 > 0);
                            i19 = i21;
                            i24 = i15;
                            i15 = i22;
                            i22 = i24;
                        } else {
                            i22 = i15;
                            i19 = i21;
                            i15 = i18;
                        }
                        i18 = (i5 - i4) & 7;
                        if (i18 > 0) {
                            i20 = i19;
                            while (true) {
                                i21 = iArr2[(i20 >>> 26) + (i20 & 4032)];
                                i19 = i22 + 1;
                                iArr[i22] = ((((i21 & 16711935) * i15) & -16711936) + (((65280 & i21) * i15) & 16711680)) >> 8;
                                i22 = i20 + i23;
                                i18--;
                                if (i18 > 0) {
                                    i20 = i22;
                                    i22 = i19;
                                } else {
                                    return;
                                }
                            }
                        }
                        return;
                    }
                    if (i22 > 0) {
                        i19 = i22;
                        while (true) {
                            i22 = iArr2[(i21 >>> 26) + (i21 & 4032)];
                            if (i22 != 0) {
                                iArr[i15] = ((((i22 & 65280) * i18) & 16711680) + (((16711935 & i22) * i18) & -16711936)) >> 8;
                            }
                            i22 = i15 + 1;
                            i15 = i21 + i23;
                            i21 = iArr2[(i15 >>> 26) + (i15 & 4032)];
                            if (i21 != 0) {
                                iArr[i22] = ((((i21 & 65280) * i18) & 16711680) + (((16711935 & i21) * i18) & -16711936)) >> 8;
                            }
                            i22++;
                            i15 += i23;
                            i21 = iArr2[(i15 >>> 26) + (i15 & 4032)];
                            if (i21 != 0) {
                                iArr[i22] = ((((i21 & 16711935) * i18) & -16711936) + (((65280 & i21) * i18) & 16711680)) >> 8;
                            }
                            i22++;
                            i15 += i23;
                            i21 = iArr2[(i15 & 4032) + (i15 >>> 26)];
                            if (i21 != 0) {
                                iArr[i22] = ((((i21 & 16711935) * i18) & -16711936) + (((65280 & i21) * i18) & 16711680)) >> 8;
                            }
                            i22++;
                            i15 += i23;
                            i21 = iArr2[(i15 >>> 26) + (i15 & 4032)];
                            if (i21 != 0) {
                                iArr[i22] = ((((i21 & 16711935) * i18) & -16711936) + (((65280 & i21) * i18) & 16711680)) >> 8;
                            }
                            i22++;
                            i15 += i23;
                            i21 = iArr2[(i15 & 4032) + (i15 >>> 26)];
                            if (i21 != 0) {
                                iArr[i22] = ((((i21 & 65280) * i18) & 16711680) + (((16711935 & i21) * i18) & -16711936)) >> 8;
                            }
                            i22++;
                            i15 += i23;
                            i21 = iArr2[(i15 & 4032) + (i15 >>> 26)];
                            if (i21 != 0) {
                                iArr[i22] = ((((i21 & 65280) * i18) & 16711680) + (((16711935 & i21) * i18) & -16711936)) >> 8;
                            }
                            i22++;
                            i21 = i15 + i23;
                            i15 = iArr2[(i21 >>> 26) + (i21 & 4032)];
                            if (i15 != 0) {
                                iArr[i22] = (((i18 * (i15 & 16711935)) & -16711936) + (((65280 & i15) * i18) & 16711680)) >> 8;
                            }
                            i15 = i22 + 1;
                            i22 = i21 + i23;
                            i16 += i20;
                            i18 = i16 >> 8;
                            i19--;
                            if (i19 <= 0) {
                                break;
                            }
                            i21 = i22;
                        }
                    } else {
                        i22 = i21;
                    }
                    i19 = (i5 - i4) & 7;
                    if (i19 > 0) {
                        i24 = i19;
                        i19 = i22;
                        i22 = i24;
                        do {
                            i20 = iArr2[(i19 >>> 26) + (i19 & 4032)];
                            if (i20 != 0) {
                                iArr[i15] = ((((i20 & 65280) * i18) & 16711680) + (((16711935 & i20) * i18) & -16711936)) >> 8;
                            }
                            i15++;
                            i19 += i23;
                            i22--;
                        } while (i22 > 0);
                        return;
                    }
                    return;
                }
                i18 = i4 - (this.bg * -1575402035);
                i19 = i8 + (i18 * i11);
                i20 = i9 + (i18 * i12);
                i21 = i10 + (i18 * i13);
                i18 = i21 >> 14;
                if (i18 != 0) {
                    i22 = i19 / i18;
                    i18 = i20 / i18;
                } else {
                    i22 = 0;
                    i18 = 0;
                }
                i19 += i11 * i17;
                i23 = (i12 * i17) + i20;
                i21 = ((i17 * i13) + i21) >> 14;
                if (i21 != 0) {
                    i20 = i19 / i21;
                    i19 = i23 / i21;
                } else {
                    i20 = 0;
                    i19 = 0;
                }
                i21 = (i22 << 18) + i18;
                i23 = (((i20 - i22) / i17) << 18) + ((i19 - i18) / i17);
                i22 = i17 >> 3;
                i17 = i7 << 3;
                i18 = i16 >> 8;
                if (this.ap) {
                    if (i22 > 0) {
                        i20 = i22;
                        while (true) {
                            i22 = iArr2[(i21 >>> 25) + (i21 & 16256)];
                            i19 = i15 + 1;
                            iArr[i15] = ((((i22 & 65280) * i18) & 16711680) + (((16711935 & i22) * i18) & -16711936)) >> 8;
                            i22 = i21 + i23;
                            i15 = iArr2[(i22 >>> 25) + (i22 & 16256)];
                            i21 = i19 + 1;
                            iArr[i19] = ((((i15 & 65280) * i18) & 16711680) + (((16711935 & i15) * i18) & -16711936)) >> 8;
                            i22 += i23;
                            i19 = iArr2[(i22 >>> 25) + (i22 & 16256)];
                            i15 = i21 + 1;
                            iArr[i21] = ((((i19 & 65280) * i18) & 16711680) + (((16711935 & i19) * i18) & -16711936)) >> 8;
                            i22 += i23;
                            i19 = iArr2[(i22 & 16256) + (i22 >>> 25)];
                            i21 = i15 + 1;
                            iArr[i15] = ((((i19 & 16711935) * i18) & -16711936) + (((65280 & i19) * i18) & 16711680)) >> 8;
                            i22 += i23;
                            i19 = iArr2[(i22 & 16256) + (i22 >>> 25)];
                            i15 = i21 + 1;
                            iArr[i21] = ((((i19 & 16711935) * i18) & -16711936) + (((65280 & i19) * i18) & 16711680)) >> 8;
                            i22 += i23;
                            i19 = iArr2[(i22 & 16256) + (i22 >>> 25)];
                            i21 = i15 + 1;
                            iArr[i15] = ((((i19 & 16711935) * i18) & -16711936) + (((65280 & i19) * i18) & 16711680)) >> 8;
                            i22 += i23;
                            i19 = iArr2[(i22 & 16256) + (i22 >>> 25)];
                            i15 = i21 + 1;
                            iArr[i21] = ((((i19 & 16711935) * i18) & -16711936) + (((65280 & i19) * i18) & 16711680)) >> 8;
                            i19 = i22 + i23;
                            i21 = iArr2[(i19 >>> 25) + (i19 & 16256)];
                            i22 = i15 + 1;
                            iArr[i15] = (((i18 * (i21 & 65280)) & 16711680) + (((16711935 & i21) * i18) & -16711936)) >> 8;
                            i19 += i23;
                            i16 += i17;
                            i18 = i16 >> 8;
                            i20--;
                            if (i20 <= 0) {
                                break;
                            }
                            i15 = i22;
                            i21 = i19;
                        }
                        i15 = i18;
                    } else {
                        i22 = i15;
                        i19 = i21;
                        i15 = i18;
                    }
                    i18 = (i5 - i4) & 7;
                    if (i18 > 0) {
                        i20 = i19;
                        while (true) {
                            i21 = iArr2[(i20 & 16256) + (i20 >>> 25)];
                            i19 = i22 + 1;
                            iArr[i22] = ((((i21 & 65280) * i15) & 16711680) + (((16711935 & i21) * i15) & -16711936)) >> 8;
                            i22 = i20 + i23;
                            i18--;
                            if (i18 > 0) {
                                i20 = i22;
                                i22 = i19;
                            } else {
                                return;
                            }
                        }
                    }
                    return;
                }
                if (i22 > 0) {
                    i20 = i22;
                    while (true) {
                        i22 = iArr2[(i21 >>> 25) + (i21 & 16256)];
                        if (i22 != 0) {
                            iArr[i15] = ((((i22 & 16711935) * i18) & -16711936) + (((65280 & i22) * i18) & 16711680)) >> 8;
                        }
                        i22 = i15 + 1;
                        i19 = i21 + i23;
                        i15 = iArr2[(i19 & 16256) + (i19 >>> 25)];
                        if (i15 != 0) {
                            iArr[i22] = ((((i15 & 65280) * i18) & 16711680) + (((16711935 & i15) * i18) & -16711936)) >> 8;
                        }
                        i22++;
                        i19 += i23;
                        i15 = iArr2[(i19 & 16256) + (i19 >>> 25)];
                        if (i15 != 0) {
                            iArr[i22] = ((((i15 & 16711935) * i18) & -16711936) + (((65280 & i15) * i18) & 16711680)) >> 8;
                        }
                        i22++;
                        i19 += i23;
                        i15 = iArr2[(i19 >>> 25) + (i19 & 16256)];
                        if (i15 != 0) {
                            iArr[i22] = ((((i15 & 65280) * i18) & 16711680) + (((16711935 & i15) * i18) & -16711936)) >> 8;
                        }
                        i22++;
                        i19 += i23;
                        i15 = iArr2[(i19 >>> 25) + (i19 & 16256)];
                        if (i15 != 0) {
                            iArr[i22] = ((((i15 & 16711935) * i18) & -16711936) + (((65280 & i15) * i18) & 16711680)) >> 8;
                        }
                        i22++;
                        i19 += i23;
                        i15 = iArr2[(i19 >>> 25) + (i19 & 16256)];
                        if (i15 != 0) {
                            iArr[i22] = ((((i15 & 65280) * i18) & 16711680) + (((16711935 & i15) * i18) & -16711936)) >> 8;
                        }
                        i22++;
                        i19 += i23;
                        i15 = iArr2[(i19 >>> 25) + (i19 & 16256)];
                        if (i15 != 0) {
                            iArr[i22] = ((((i15 & 16711935) * i18) & -16711936) + (((65280 & i15) * i18) & 16711680)) >> 8;
                        }
                        i22++;
                        i19 += i23;
                        i15 = iArr2[(i19 & 16256) + (i19 >>> 25)];
                        if (i15 != 0) {
                            iArr[i22] = (((i18 * (i15 & 16711935)) & -16711936) + (((65280 & i15) * i18) & 16711680)) >> 8;
                        }
                        i22++;
                        i19 += i23;
                        i16 += i17;
                        i18 = i16 >> 8;
                        i20--;
                        if (i20 <= 0) {
                            break;
                        }
                        i15 = i22;
                        i21 = i19;
                    }
                } else {
                    i22 = i15;
                    i19 = i21;
                }
                i20 = (i5 - i4) & 7;
                if (i20 > 0) {
                    i24 = i20;
                    i20 = i19;
                    i19 = i22;
                    i22 = i24;
                    do {
                        i15 = iArr2[(i20 & 16256) + (i20 >>> 25)];
                        if (i15 != 0) {
                            iArr[i19] = ((((i15 & 16711935) * i18) & -16711936) + (((65280 & i15) * i18) & 16711680)) >> 8;
                        }
                        i19++;
                        i20 += i23;
                        i22--;
                    } while (i22 > 0);
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "cj.ak(" + ')');
        }
    }

    final void de(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        if (this.al) {
            if (i5 > this.bf * 784773023) {
                i5 = 784773023 * this.bf;
            }
            if (i4 < 0) {
                i4 = 0;
            }
        }
        if (i4 < i5) {
            int i14 = i3 + i4;
            int i15 = i6 + (i7 * i4);
            int i16 = i5 - i4;
            int i17;
            int i18;
            int i19;
            int i20;
            int i21;
            int i22;
            int i23;
            if (this.bw) {
                i17 = i4 - (-1575402035 * this.bg);
                i18 = i8 + (i17 * i11);
                i19 = i9 + (i12 * i17);
                i20 = i10 + (i17 * i13);
                i17 = i20 >> 12;
                if (i17 != 0) {
                    i21 = i18 / i17;
                    i17 = i19 / i17;
                } else {
                    i21 = 0;
                    i17 = 0;
                }
                i18 += i16 * i11;
                i22 = (i16 * i12) + i19;
                i20 = ((i16 * i13) + i20) >> 12;
                if (i20 != 0) {
                    i19 = i18 / i20;
                    i18 = i22 / i20;
                } else {
                    i19 = 0;
                    i18 = 0;
                }
                i20 = (i21 << 20) + i17;
                i22 = ((i18 - i17) / i16) + (((i19 - i21) / i16) << 20);
                i17 = i16 >> 3;
                i19 = i7 << 3;
                i21 = i15 >> 8;
                if (this.ap) {
                    if (i17 > 0) {
                        do {
                            i18 = iArr2[(i20 >>> 26) + (1573285327 & i20)];
                            i16 = i14 + 1;
                            iArr[i14] = ((((i18 & 16711935) * i21) & -16711936) + (((65280 & i18) * i21) & 16711680)) >> 8;
                            i18 = i20 + i22;
                            i14 = iArr2[(i18 & 4032) + (i18 >>> 26)];
                            i20 = i16 + 1;
                            iArr[i16] = ((((i14 & 16711935) * i21) & -1658717436) + (((-2059219166 & i14) * i21) & 670815339)) >> 8;
                            i18 += i22;
                            i14 = iArr2[(i18 & 4032) + (i18 >>> 26)];
                            i16 = i20 + 1;
                            iArr[i20] = ((((i14 & 205668773) * i21) & 1211313845) + (((16711935 & i14) * i21) & -16711936)) >> 8;
                            i18 += i22;
                            i14 = iArr2[(i18 & 4032) + (i18 >>> 26)];
                            i20 = i16 + 1;
                            iArr[i16] = ((((i14 & 401122292) * i21) & -605412352) + (((16711935 & i14) * i21) & 1581192158)) >> 8;
                            i18 += i22;
                            i14 = iArr2[(i18 >>> 26) + (-1749332264 & i18)];
                            i16 = i20 + 1;
                            iArr[i20] = ((((i14 & 1071534290) * i21) & 16711680) + (((73934828 & i14) * i21) & -16711936)) >> 8;
                            i18 += i22;
                            i14 = iArr2[(i18 >>> 26) + (-1850779729 & i18)];
                            i20 = i16 + 1;
                            iArr[i16] = ((((i14 & 1562365116) * i21) & -1541279547) + (((16711935 & i14) * i21) & -16711936)) >> 8;
                            i18 += i22;
                            i14 = iArr2[(i18 >>> 26) + (-1166568182 & i18)];
                            i16 = i20 + 1;
                            iArr[i20] = ((((i14 & 65280) * i21) & 16711680) + (((16711935 & i14) * i21) & -16711936)) >> 8;
                            i18 += i22;
                            i20 = iArr2[(i18 & 4032) + (i18 >>> 26)];
                            i14 = i16 + 1;
                            iArr[i16] = (((i21 * (i20 & 321005914)) & -1418948832) + (((-2065124967 & i20) * i21) & -16711936)) >> 8;
                            i20 = i18 + i22;
                            i15 += i19;
                            i21 = i15 >> 8;
                            i17--;
                        } while (i17 > 0);
                        i18 = i20;
                        i23 = i14;
                        i14 = i21;
                        i21 = i23;
                    } else {
                        i18 = i20;
                        i23 = i14;
                        i14 = i21;
                        i21 = i23;
                    }
                    i17 = (i5 - i4) & 7;
                    if (i17 > 0) {
                        i19 = i18;
                        while (true) {
                            i20 = iArr2[(i19 >>> 26) + (i19 & 4032)];
                            i18 = i21 + 1;
                            iArr[i21] = ((((i20 & -153698632) * i14) & -1087498109) + (((-1958937280 & i20) * i14) & 16711680)) >> 8;
                            i21 = i19 + i22;
                            i17--;
                            if (i17 > 0) {
                                i19 = i21;
                                i21 = i18;
                            } else {
                                return;
                            }
                        }
                    }
                    return;
                }
                if (i17 > 0) {
                    i18 = i20;
                    do {
                        i20 = iArr2[(i18 >>> 26) + (1100221445 & i18)];
                        if (i20 != 0) {
                            iArr[i14] = ((((i20 & 65280) * i21) & 16711680) + (((16711935 & i20) * i21) & 1301646154)) >> 8;
                        }
                        i14++;
                        i18 += i22;
                        i20 = iArr2[(i18 >>> 26) + (i18 & 4032)];
                        if (i20 != 0) {
                            iArr[i14] = ((((i20 & 994535724) * i21) & -728348252) + (((310126314 & i20) * i21) & -383594231)) >> 8;
                        }
                        i14++;
                        i18 += i22;
                        i20 = iArr2[(i18 >>> 26) + (1459765400 & i18)];
                        if (i20 != 0) {
                            iArr[i14] = ((((i20 & 16711935) * i21) & 622938769) + (((65280 & i20) * i21) & 1380874496)) >> 8;
                        }
                        i14++;
                        i18 += i22;
                        i20 = iArr2[(103255603 & i18) + (i18 >>> 26)];
                        if (i20 != 0) {
                            iArr[i14] = ((((i20 & 16711935) * i21) & -16711936) + (((65280 & i20) * i21) & 16711680)) >> 8;
                        }
                        i14++;
                        i18 += i22;
                        i20 = iArr2[(i18 >>> 26) + (-2015683942 & i18)];
                        if (i20 != 0) {
                            iArr[i14] = ((((i20 & 16711935) * i21) & 1286049841) + (((65280 & i20) * i21) & 16711680)) >> 8;
                        }
                        i14++;
                        i18 += i22;
                        i20 = iArr2[(1797958838 & i18) + (i18 >>> 26)];
                        if (i20 != 0) {
                            iArr[i14] = ((((i20 & 65280) * i21) & -268270667) + (((16711935 & i20) * i21) & -1799214960)) >> 8;
                        }
                        i14++;
                        i18 += i22;
                        i20 = iArr2[(i18 & 4032) + (i18 >>> 26)];
                        if (i20 != 0) {
                            iArr[i14] = ((((i20 & 65280) * i21) & 1227691018) + (((16711935 & i20) * i21) & -16711936)) >> 8;
                        }
                        i14++;
                        i18 += i22;
                        i20 = iArr2[(i18 >>> 26) + (i18 & 4032)];
                        if (i20 != 0) {
                            iArr[i14] = (((i21 * (i20 & -719220111)) & -16711936) + (((-748893059 & i20) * i21) & 16711680)) >> 8;
                        }
                        i14++;
                        i18 += i22;
                        i15 += i19;
                        i21 = i15 >> 8;
                        i17--;
                    } while (i17 > 0);
                } else {
                    i18 = i20;
                }
                i17 = (i5 - i4) & 7;
                if (i17 > 0) {
                    do {
                        i19 = iArr2[(i18 >>> 26) + (i18 & 4032)];
                        if (i19 != 0) {
                            iArr[i14] = ((((i19 & 1018514238) * i21) & -99660451) + (((-194695784 & i19) * i21) & -16711936)) >> 8;
                        }
                        i14++;
                        i18 += i22;
                        i17--;
                    } while (i17 > 0);
                    return;
                }
                return;
            }
            i17 = i4 - (this.bg * -1575402035);
            i18 = i8 + (i17 * i11);
            i19 = i9 + (i17 * i12);
            i20 = i10 + (i17 * i13);
            i17 = i20 >> 14;
            if (i17 != 0) {
                i21 = i18 / i17;
                i17 = i19 / i17;
            } else {
                i21 = 0;
                i17 = 0;
            }
            i18 += i11 * i16;
            i22 = (i12 * i16) + i19;
            i20 = ((i16 * i13) + i20) >> 14;
            if (i20 != 0) {
                i19 = i18 / i20;
                i18 = i22 / i20;
            } else {
                i19 = 0;
                i18 = 0;
            }
            i20 = (i21 << 18) + i17;
            i22 = (((i19 - i21) / i16) << 18) + ((i18 - i17) / i16);
            i21 = i16 >> 3;
            i16 = i7 << 3;
            i17 = i15 >> 8;
            if (this.ap) {
                if (i21 > 0) {
                    do {
                        i18 = iArr2[(i20 >>> 25) + (i20 & 16256)];
                        i19 = i14 + 1;
                        iArr[i14] = ((((i18 & 1900957353) * i17) & -1556087314) + (((16711935 & i18) * i17) & -2064940273)) >> 8;
                        i18 = i20 + i22;
                        i14 = iArr2[(i18 >>> 25) + (i18 & 16256)];
                        i20 = i19 + 1;
                        iArr[i19] = ((((i14 & -585988688) * i17) & 52353583) + (((-1899879616 & i14) * i17) & -776289075)) >> 8;
                        i18 += i22;
                        i19 = iArr2[(i18 >>> 25) + (i18 & 16256)];
                        i14 = i20 + 1;
                        iArr[i20] = ((((i19 & 663356892) * i17) & -805469072) + (((1343032791 & i19) * i17) & -826396956)) >> 8;
                        i18 += i22;
                        i19 = iArr2[(i18 & 16256) + (i18 >>> 25)];
                        i20 = i14 + 1;
                        iArr[i14] = ((((i19 & 16711935) * i17) & 1425738734) + (((65280 & i19) * i17) & 16711680)) >> 8;
                        i18 += i22;
                        i19 = iArr2[(i18 & 16256) + (i18 >>> 25)];
                        i14 = i20 + 1;
                        iArr[i20] = ((((i19 & -1921560600) * i17) & -16711936) + (((65280 & i19) * i17) & 16711680)) >> 8;
                        i18 += i22;
                        i19 = iArr2[(i18 & 16256) + (i18 >>> 25)];
                        i20 = i14 + 1;
                        iArr[i14] = ((((i19 & 16711935) * i17) & -1625836598) + (((-1507088930 & i19) * i17) & 16711680)) >> 8;
                        i18 += i22;
                        i19 = iArr2[(-1831290167 & i18) + (i18 >>> 25)];
                        int i24 = i20 + 1;
                        iArr[i20] = ((((i19 & -299660756) * i17) & -16711936) + (((65280 & i19) * i17) & 662057426)) >> 8;
                        i18 += i22;
                        i19 = iArr2[(i18 >>> 25) + (1504490031 & i18)];
                        i14 = i24 + 1;
                        iArr[i24] = (((i17 * (i19 & 65280)) & 16711680) + (((842727477 & i19) * i17) & -16711936)) >> 8;
                        i20 = i18 + i22;
                        i15 += i16;
                        i17 = i15 >> 8;
                        i21--;
                    } while (i21 > 0);
                }
                i21 = (i5 - i4) & 7;
                if (i21 > 0) {
                    while (true) {
                        i19 = iArr2[(236443176 & i20) + (i20 >>> 25)];
                        i18 = i14 + 1;
                        iArr[i14] = ((((i19 & 815181670) * i17) & 113580630) + (((2101257554 & i19) * i17) & -16711936)) >> 8;
                        i20 += i22;
                        i21--;
                        if (i21 > 0) {
                            i14 = i18;
                        } else {
                            return;
                        }
                    }
                }
                return;
            }
            if (i21 > 0) {
                i19 = i21;
                i21 = i14;
                i14 = i15;
                while (true) {
                    i18 = iArr2[(i20 >>> 25) + (i20 & 16256)];
                    if (i18 != 0) {
                        iArr[i21] = ((((i18 & -1704488671) * i17) & -1623588630) + (((65280 & i18) * i17) & -415586243)) >> 8;
                    }
                    i21++;
                    i18 = i20 + i22;
                    i20 = iArr2[(i18 & 16256) + (i18 >>> 25)];
                    if (i20 != 0) {
                        iArr[i21] = ((((i20 & -524498566) * i17) & 16711680) + (((-1845981894 & i20) * i17) & 83173756)) >> 8;
                    }
                    i21++;
                    i18 += i22;
                    i20 = iArr2[(i18 & 16256) + (i18 >>> 25)];
                    if (i20 != 0) {
                        iArr[i21] = ((((i20 & -2054401820) * i17) & -16711936) + (((424281372 & i20) * i17) & 16711680)) >> 8;
                    }
                    i21++;
                    i18 += i22;
                    i20 = iArr2[(i18 >>> 25) + (1292908953 & i18)];
                    if (i20 != 0) {
                        iArr[i21] = ((((i20 & 65280) * i17) & 105578471) + (((16711935 & i20) * i17) & -16711936)) >> 8;
                    }
                    i21++;
                    i18 += i22;
                    i20 = iArr2[(i18 >>> 25) + (-1078213544 & i18)];
                    if (i20 != 0) {
                        iArr[i21] = ((((i20 & -2133034872) * i17) & -16711936) + (((500274313 & i20) * i17) & -109814759)) >> 8;
                    }
                    i21++;
                    i18 += i22;
                    i20 = iArr2[(i18 >>> 25) + (1830744643 & i18)];
                    if (i20 != 0) {
                        iArr[i21] = ((((i20 & 1774354260) * i17) & 16711680) + (((-1856062513 & i20) * i17) & -1020833227)) >> 8;
                    }
                    i21++;
                    i18 += i22;
                    i20 = iArr2[(i18 >>> 25) + (-1104797229 & i18)];
                    if (i20 != 0) {
                        iArr[i21] = ((((i20 & 16711935) * i17) & -16711936) + (((65280 & i20) * i17) & -2071841277)) >> 8;
                    }
                    i21++;
                    i18 += i22;
                    i20 = iArr2[(i18 & 16256) + (i18 >>> 25)];
                    if (i20 != 0) {
                        iArr[i21] = (((i17 * (i20 & 16711935)) & 414240322) + (((-1124253686 & i20) * i17) & 1227933737)) >> 8;
                    }
                    i21++;
                    i18 += i22;
                    i14 += i16;
                    i17 = i14 >> 8;
                    i19--;
                    if (i19 <= 0) {
                        break;
                    }
                    i20 = i18;
                }
            } else {
                i21 = i14;
                i18 = i20;
            }
            i19 = (i5 - i4) & 7;
            if (i19 > 0) {
                i23 = i19;
                i19 = i18;
                i18 = i21;
                i21 = i23;
                do {
                    i14 = iArr2[(-1442243336 & i19) + (i19 >>> 25)];
                    if (i14 != 0) {
                        iArr[i18] = ((((i14 & -996418066) * i17) & -1452084392) + (((65280 & i14) * i17) & -2077136331)) >> 8;
                    }
                    i18++;
                    i19 += i22;
                    i21--;
                } while (i21 > 0);
            }
        }
    }

    static final int ee(ac acVar, int i, int i2) {
        try {
            if (acVar.fd == null || i >= acVar.fd.length) {
                return -2;
            }
            try {
                int[] iArr = acVar.fd[i];
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    int i6 = i4 + 1;
                    int i7 = iArr[i4];
                    int i8 = 0;
                    if (i7 == 0) {
                        return i3;
                    }
                    int i9;
                    int i10;
                    ac ad;
                    if (i7 == 1) {
                        i9 = i6 + 1;
                        i8 = client.iu[iArr[i6]];
                    } else {
                        i9 = i6;
                    }
                    if (i7 == 2) {
                        i6 = i9 + 1;
                        i8 = client.f2if[iArr[i9]];
                    } else {
                        i6 = i9;
                    }
                    if (i7 == 3) {
                        i9 = i6 + 1;
                        i8 = client.iy[iArr[i6]];
                    } else {
                        i9 = i6;
                    }
                    if (i7 == 4) {
                        i6 = i9 + 1;
                        i10 = i6 + 1;
                        ad = hv.ad((iArr[i9] << 16) + iArr[i6], 565008712);
                        i6 = i10 + 1;
                        i10 = iArr[i10];
                        if (i10 == -1 || (cm.af(i10, 1404336134).bh && !client.aj)) {
                            i9 = i6;
                        } else {
                            i9 = i8;
                            for (i8 = 0; i8 < ad.fh.length; i8++) {
                                if (ad.fh[i8] == i10 + 1) {
                                    i9 += ad.fb[i8];
                                }
                            }
                            i8 = i9;
                            i9 = i6;
                        }
                    }
                    if (5 == i7) {
                        i6 = i9 + 1;
                        i8 = al.an[iArr[i9]];
                    } else {
                        i6 = i9;
                    }
                    if (i7 == 6) {
                        i9 = i6 + 1;
                        i8 = jc.an[client.f2if[iArr[i6]] - 1];
                    } else {
                        i9 = i6;
                    }
                    if (i7 == 7) {
                        i6 = i9 + 1;
                        i8 = (al.an[iArr[i9]] * 100) / 46875;
                    } else {
                        i6 = i9;
                    }
                    if (8 == i7) {
                        i8 = gf.ho.ar * -1986989913;
                    }
                    if (9 == i7) {
                        i9 = i8;
                        for (i8 = 0; i8 < 25; i8++) {
                            if (jc.ad[i8]) {
                                i9 += client.f2if[i8];
                            }
                        }
                        i8 = i9;
                    }
                    if (10 == i7) {
                        i9 = i6 + 1;
                        i10 = i9 + 1;
                        ad = hv.ad(iArr[i9] + (iArr[i6] << 16), 1017786702);
                        i9 = i10 + 1;
                        i10 = iArr[i10];
                        if (i10 != -1 && (!cm.af(i10, 1753582816).bh || client.aj)) {
                            for (int i11 : ad.fh) {
                                if (i11 == i10 + 1) {
                                    i8 = 999999999;
                                    break;
                                }
                            }
                        }
                    } else {
                        i9 = i6;
                    }
                    if (i7 == 11) {
                        i8 = client.jx * -28768771;
                    }
                    if (12 == i7) {
                        i8 = client.ji * 392548631;
                    }
                    if (i7 == 13) {
                        i6 = i9 + 1;
                        int i12 = (al.an[iArr[i9]] & (1 << iArr[i6])) != 0 ? 1 : 0;
                        i9 = i6 + 1;
                        i8 = i12;
                    }
                    if (14 == i7) {
                        i6 = i9 + 1;
                        i8 = io.af(iArr[i9], 998830794);
                    } else {
                        i6 = i9;
                    }
                    if (i7 == 15) {
                        i9 = 1;
                    } else {
                        i9 = 0;
                    }
                    if (16 == i7) {
                        i9 = 2;
                    }
                    if (i7 == 17) {
                        i9 = 3;
                    }
                    if (18 == i7) {
                        i8 = ((516759209 * gf.ho.bg) >> 7) + (1407993063 * bq.du);
                    }
                    if (i7 == 19) {
                        i8 = ((gf.ho.bh * 2328865) >> 7) + (1289967967 * gl.dp);
                    }
                    if (20 == i7) {
                        i4 = i6 + 1;
                        i8 = iArr[i6];
                    } else {
                        i4 = i6;
                    }
                    if (i9 == 0) {
                        if (i5 == 0) {
                            i9 = i3 + i8;
                        } else {
                            i9 = i3;
                        }
                        if (1 == i5) {
                            i9 -= i8;
                        }
                        if (2 == i5 && i8 != 0) {
                            i9 /= i8;
                        }
                        if (i5 == 3) {
                            i9 *= i8;
                        }
                        i3 = i9;
                        i9 = 0;
                    }
                    i5 = i9;
                }
            } catch (Exception e) {
                return -1;
            }
        } catch (Throwable e2) {
            throw ba.ad(e2, "cj.ee(" + ')');
        }
    }
}
