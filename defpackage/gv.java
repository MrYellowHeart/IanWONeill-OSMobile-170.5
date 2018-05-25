package p000;

public class gv implements go {
    gv() {
        try {
        } catch (Throwable e) {
            throw ba.ad(e, "gv.<init>(" + ')');
        }
    }

    public boolean ay(int i, long j) {
        return true;
    }

    public boolean bb(int i, long j) {
        return true;
    }

    public boolean bc(int i, long j) {
        return true;
    }

    public boolean bw(int i, long j) {
        return true;
    }

    public boolean bz(int i, long j) {
        return true;
    }

    public boolean as(int i, long j) {
        return true;
    }

    public boolean bf(int i, long j) {
        return true;
    }

    public boolean bg(int i, long j) {
        return true;
    }

    public boolean bh(int i, long j) {
        return true;
    }

    public boolean bv(int i, long j) {
        return true;
    }

    public boolean ar(char c, long j) {
        return true;
    }

    public boolean be(char c, long j) {
        return true;
    }

    public boolean bp(char c, long j) {
        return true;
    }

    public boolean bt(char c, long j) {
        return true;
    }

    public boolean bu(char c, long j) {
        return true;
    }

    public boolean bx(char c, long j) {
        return true;
    }

    public boolean aj(int i, int i2, int i3, int i4, long j) {
        return true;
    }

    public boolean bk(int i, int i2, int i3, int i4, long j) {
        return true;
    }

    public boolean bn(int i, int i2, int i3, int i4, long j) {
        return true;
    }

    public boolean by(int i, int i2, int i3, int i4, long j) {
        return true;
    }

    public boolean ae(int i, int i2, int i3, int i4, long j) {
        return true;
    }

    public boolean ba(int i, int i2, int i3, int i4, long j) {
        return true;
    }

    public boolean aq(int i, int i2, int i3, long j) {
        return true;
    }

    public boolean bl(int i, int i2, int i3, long j) {
        return true;
    }

    public boolean am(int i, int i2, long j) {
        return true;
    }

    public boolean bd(int i, int i2, long j) {
        return true;
    }

    public boolean at(int i, long j) {
        return true;
    }

    public boolean bm(int i, long j) {
        return true;
    }

    public boolean bs(int i, long j) {
        return true;
    }

    static final void ay(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, cc ccVar, eq[] eqVarArr, short s) {
        try {
            ik ikVar = new ik(bArr);
            int i8 = -1;
            while (true) {
                int bv = ikVar.bv(-1819149345);
                if (bv != 0) {
                    int i9 = i8 + bv;
                    i8 = 0;
                    while (true) {
                        bv = ikVar.bf((byte) 87);
                        if (bv == 0) {
                            break;
                        }
                        int i10 = i8 + (bv - 1);
                        int i11 = i10 & 63;
                        int i12 = (i10 >> 6) & 63;
                        i8 = i10 >> 12;
                        bv = ikVar.ao((byte) 0);
                        int i13 = bv >> 2;
                        int i14 = bv & 3;
                        if (i8 == i4 && i12 >= i5 && i12 < i5 + 8 && i11 >= i6 && i11 < i6 + 8) {
                            ae ad = gi.ad(i9, 1158441283);
                            int ad2 = i2 + gr.ad(i12 & 7, i11 & 7, i7, ad.az * -265754695, -344743753 * ad.ah, i14, -218565506);
                            int an = i3 + lq.an(i12 & 7, i11 & 7, i7, -265754695 * ad.az, -344743753 * ad.ah, i14, 795795941);
                            if (ad2 > 0 && an > 0 && ad2 < 103 && an < 103) {
                                if ((gu.ad[1][ad2][an] & 2) == 2) {
                                    i8 = i - 1;
                                } else {
                                    i8 = i;
                                }
                                eq eqVar = null;
                                if (i8 >= 0) {
                                    eqVar = eqVarArr[i8];
                                }
                                gn.as(i, ad2, an, i9, (i14 + i7) & 3, i13, ccVar, eqVar, 1112033984);
                            }
                        }
                        i8 = i10;
                    }
                    i8 = i9;
                } else {
                    return;
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "gv.ay(" + ')');
        }
    }
}
