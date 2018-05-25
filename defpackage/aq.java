package p000;

public class aq extends kq {
    public static ky ad = new ky(64, null);
    public static final int ae = 9;
    public static kf af = null;
    static final int bi = 4;
    public static final int cw = 100;
    public boolean an = false;

    public static void aa(kf kfVar) {
        af = kfVar;
    }

    public static void ag(kf kfVar) {
        af = kfVar;
    }

    public static void ay(kf kfVar) {
        af = kfVar;
    }

    static final void ad(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException e) {
        } catch (Throwable e2) {
            throw ba.ad(e2, "aq.ad(" + ')');
        }
    }

    public void ad(ik ikVar, int i) {
        while (true) {
            try {
                int ao = ikVar.ao((byte) 0);
                if (ao != 0) {
                    an(ikVar, ao, (byte) -1);
                } else {
                    return;
                }
            } catch (Throwable e) {
                throw ba.ad(e, "aq.ad(" + ')');
            }
        }
    }

    public void ar(ik ikVar) {
        while (true) {
            int ao = ikVar.ao((byte) 0);
            if (ao != 0) {
                an(ikVar, ao, (byte) -1);
            } else {
                return;
            }
        }
    }

    public void as(ik ikVar) {
        while (true) {
            int ao = ikVar.ao((byte) 0);
            if (ao != 0) {
                an(ikVar, ao, (byte) -1);
            } else {
                return;
            }
        }
    }

    void aj(ik ikVar, int i) {
        if (2 == i) {
            this.an = true;
        }
    }

    void an(ik ikVar, int i, byte b) {
        if (2 == i) {
            try {
                this.an = true;
            } catch (Throwable e) {
                throw ba.ad(e, "aq.an(" + ')');
            }
        }
    }

    public static int an(long j) {
        return (int) ((j >>> null) & 127);
    }

    static int ar(int i, int i2, int i3, int i4) {
        try {
            if ((gu.ad[i][i2][i3] & 8) != 0) {
                return 0;
            }
            if (i <= 0 || (gu.ad[1][i2][i3] & 2) == 0) {
                return i;
            }
            return i - 1;
        } catch (Throwable e) {
            throw ba.ad(e, "aq.ar(" + ')');
        }
    }

    static void bh(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        if (i8 >= 255) {
            try {
                bm.ak(iArr, iArr2, 0, i2, i3, i4, i5, i6, i7, -272836284);
                return;
            } catch (Throwable e) {
                throw ba.ad(e, "aq.bh(" + ')');
            }
        }
        int i10 = i8 << 24;
        int i11 = 255 - i8;
        int i12 = i3;
        int i13 = i2;
        for (int i14 = -i5; i14 < 0; i14++) {
            int i15 = i13;
            i13 = i12;
            i12 = -i4;
            while (i12 < 0) {
                int i16 = i15 + 1;
                int i17 = iArr2[i15];
                if (i17 != 0) {
                    int i18 = iArr[i13];
                    if (i18 == 0) {
                        i15 = i13 + 1;
                        iArr[i13] = (i17 & 16777215) | i10;
                    } else {
                        i15 = i13 + 1;
                        iArr[i13] = ((((((i17 & 65280) * i8) + ((i18 & 65280) * i11)) & 16711680) + ((((16711935 & i18) * i11) + ((16711935 & i17) * i8)) & -16711936)) >>> 8) | (-16777216 & (i18 | i10));
                    }
                } else {
                    i15 = i13 + 1;
                }
                i12++;
                i13 = i15;
                i15 = i16;
            }
            i12 = i13 + i6;
            i13 = i15 + i7;
        }
    }

    static void ao(kh khVar, String str, int i) {
        try {
            hs hsVar = new hs(khVar, str);
            client.pp.add(hsVar);
            client.pl = (hsVar.an * -184682577) + client.pl;
        } catch (Throwable e) {
            throw ba.ad(e, "aq.ao(" + ')');
        }
    }

    static void ed(ac acVar, int i, int i2, byte b) {
        try {
            if (acVar.av * -181534661 == 0) {
                acVar.bg = acVar.bw * -1519221509;
            } else if (acVar.av * -181534661 == 1) {
                acVar.bg = (((i - (256177861 * acVar.bf)) / 2) + (acVar.bw * -2010738599)) * 1082094963;
            } else if (2 == acVar.av * -181534661) {
                acVar.bg = ((i - (256177861 * acVar.bf)) - (acVar.bw * -2010738599)) * 1082094963;
            } else if (3 == acVar.av * -181534661) {
                acVar.bg = (((acVar.bw * -2010738599) * i) >> 14) * 1082094963;
            } else if (acVar.av * -181534661 == 4) {
                acVar.bg = (((i - (256177861 * acVar.bf)) / 2) + (((acVar.bw * -2010738599) * i) >> 14)) * 1082094963;
            } else {
                acVar.bg = ((i - (acVar.bf * 256177861)) - (((acVar.bw * -2010738599) * i) >> 14)) * 1082094963;
            }
            if (acVar.ac * -570752573 == 0) {
                acVar.bh = acVar.bb * 1676005485;
            } else if (1 == acVar.ac * -570752573) {
                acVar.bh = ((2145844449 * acVar.bb) + ((i2 - (57307023 * acVar.bv)) / 2)) * -1265034995;
            } else if (acVar.ac * -570752573 == 2) {
                acVar.bh = ((i2 - (57307023 * acVar.bv)) - (2145844449 * acVar.bb)) * -1265034995;
            } else if (acVar.ac * -570752573 == 3) {
                acVar.bh = (((acVar.bb * 2145844449) * i2) >> 14) * -1265034995;
            } else if (4 == acVar.ac * -570752573) {
                acVar.bh = (((i2 - (57307023 * acVar.bv)) / 2) + (((2145844449 * acVar.bb) * i2) >> 14)) * -1265034995;
            } else {
                acVar.bh = ((i2 - (57307023 * acVar.bv)) - (((acVar.bb * 2145844449) * i2) >> 14)) * -1265034995;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "aq.ed(" + ')');
        }
    }
}
