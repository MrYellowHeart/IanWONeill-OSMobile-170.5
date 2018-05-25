package p000;

public class fw extends ft {
    public static final int am = 90;
    public static final int ay = 5;
    public static int iz;
    cj ad;
    gs af;
    bh an;

    public fw() {
        try {
            this.af = new gs(0, 0);
            this.ad = new cj(this.af.af, 0, 0);
            this.an = new bh(this.ad);
        } catch (Throwable e) {
            throw ba.ad(e, "fw.<init>(" + ')');
        }
    }

    public static int ad(int i, byte b) {
        int i2;
        int i3 = 0;
        if (i < 0 || i >= ic.ad) {
            i2 = i >>> 16;
            i3 = 16;
        } else {
            i2 = i;
        }
        if (i2 >= 256) {
            i2 >>>= 8;
            i3 += 8;
        }
        if (i2 >= 16) {
            i2 >>>= 4;
            i3 += 4;
        }
        if (i2 >= 4) {
            i2 >>>= 2;
            i3 += 2;
        }
        if (i2 >= 1) {
            i2 >>>= 1;
            i3++;
        }
        return i3 + i2;
    }

    public gf af(int i) {
        try {
            return this.af;
        } catch (Throwable e) {
            throw ba.ad(e, "fw.af(" + ')');
        }
    }

    public gf al() {
        return this.af;
    }

    public gf ap() {
        return this.af;
    }

    public bi ad(byte b) {
        try {
            return this.ad;
        } catch (Throwable e) {
            throw ba.ad(e, "fw.ad(" + ')');
        }
    }

    public bi ae() {
        return this.ad;
    }

    public bi aj() {
        return this.ad;
    }

    public ch am() {
        return this.an;
    }

    public ch an(int i) {
        try {
            return this.an;
        } catch (Throwable e) {
            throw ba.ad(e, "fw.an(" + ')');
        }
    }

    public ch aq() {
        return this.an;
    }

    public ch at() {
        return this.an;
    }

    public void aa(int i, int i2, int i3) {
        try {
            bw(new int[(i * i2)], i, i2, 667610327);
        } catch (Throwable e) {
            throw ba.ad(e, "fw.aa(" + ')');
        }
    }

    public void ab(int i, int i2) {
        bw(new int[(i * i2)], i, i2, -1621072713);
    }

    public void ai(int i, int i2) {
        bw(new int[(i * i2)], i, i2, -23095162);
    }

    public void aw(int i, int i2) {
        bw(new int[(i * i2)], i, i2, 876478525);
    }

    public void bc(int[] iArr, int i, int i2) {
        this.af.fe(iArr, i, i2, 1598390010);
        this.ad.aa(iArr, i, i2, -505807934);
    }

    public void bw(int[] iArr, int i, int i2, int i3) {
        try {
            this.af.fe(iArr, i, i2, 311104969);
            this.ad.aa(iArr, i, i2, -6201778);
        } catch (Throwable e) {
            throw ba.ad(e, "fw.bw(" + ')');
        }
    }

    public void bb(fx fxVar, byte b) {
        try {
            bw(fxVar.af, fxVar.ad, fxVar.an, 458987911);
        } catch (Throwable e) {
            throw ba.ad(e, "fw.bb(" + ')');
        }
    }

    public void bf(fx fxVar) {
        bw(fxVar.af, fxVar.ad, fxVar.an, -1279960201);
    }

    public void bg(fx fxVar) {
        bw(fxVar.af, fxVar.ad, fxVar.an, 450322778);
    }

    public void bh(fx fxVar) {
        bw(fxVar.af, fxVar.ad, fxVar.an, 632433078);
    }

    public void bz(fx fxVar) {
        bw(fxVar.af, fxVar.ad, fxVar.an, -2044182609);
    }

    public void ak(int i, int i2, int i3, int i4) {
        throw new Error("");
    }

    public void ay(int i, int i2, int i3, int i4, byte b) {
        try {
            throw new Error("");
        } catch (Throwable e) {
            throw ba.ad(e, "fw.ay(" + ')');
        }
    }

    public void ao(int i, int i2) {
        throw new Error("");
    }

    public void as(int i, int i2, int i3) {
        try {
            throw new Error("");
        } catch (Throwable e) {
            throw ba.ad(e, "fw.as(" + ')');
        }
    }

    public void ax(int i, int i2) {
        throw new Error("");
    }

    public void ac() {
    }

    public void ar(int i) {
    }

    public void au() {
    }

    public void av() {
    }

    static final int ab(int i, int i2, byte b) {
        int i3 = 2;
        if (i == -1) {
            return 12345678;
        }
        try {
            int i4 = ((i & 127) * i2) / mn.an;
            if (i4 >= 2) {
                if (i4 > 126) {
                    i3 = 126;
                } else {
                    i3 = i4;
                }
            }
            return i3 + (65408 & i);
        } catch (Throwable e) {
            throw ba.ad(e, "fw.ab(" + ')');
        }
    }
}
