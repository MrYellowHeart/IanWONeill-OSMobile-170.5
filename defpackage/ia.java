package p000;

public final class ia extends ik {
    static final int ab = 8192;
    static final int[] ae = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
    C0002if aj;
    int aq;

    public ia(int i) {
        try {
            super(i);
        } catch (Throwable e) {
            throw ba.ad(e, "ia.<init>(" + ')');
        }
    }

    public void jo(int[] iArr, int i) {
        try {
            this.aj = new C0002if(iArr);
        } catch (Throwable e) {
            throw ba.ad(e, "ia.jo(" + ')');
        }
    }

    public void ks(int[] iArr) {
        this.aj = new C0002if(iArr);
    }

    public void jn(C0002if c0002if, short s) {
        try {
            this.aj = c0002if;
        } catch (Throwable e) {
            throw ba.ad(e, "ia.jn(" + ')');
        }
    }

    public void kj(C0002if c0002if) {
        this.aj = c0002if;
    }

    public void kk(C0002if c0002if) {
        this.aj = c0002if;
    }

    public void kp(C0002if c0002if) {
        this.aj = c0002if;
    }

    public void kv(C0002if c0002if) {
        this.aj = c0002if;
    }

    public void jf(int i, int i2) {
        try {
            byte[] bArr = this.af;
            int i3 = this.ad + 2065011939;
            this.ad = i3;
            bArr[(i3 * 1978945739) - 1] = (byte) (this.aj.af(204984041) + i);
        } catch (Throwable e) {
            throw ba.ad(e, "ia.jf(" + ')');
        }
    }

    public void kr(int i) {
        byte[] bArr = this.af;
        int i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (this.aj.af(356179191) + i);
    }

    public int jg(int i) {
        try {
            byte[] bArr = this.af;
            int i2 = this.ad + 2065011939;
            this.ad = i2;
            return (bArr[(i2 * 1978945739) - 1] - this.aj.af(-58184460)) & 255;
        } catch (Throwable e) {
            throw ba.ad(e, "ia.jg(" + ')');
        }
    }

    public int kd() {
        byte[] bArr = this.af;
        int i = this.ad - 1042684200;
        this.ad = i;
        return (bArr[(i * -842476178) - 1] - this.aj.af(1529756865)) & 255;
    }

    public int kl() {
        byte[] bArr = this.af;
        int i = this.ad - 994211118;
        this.ad = i;
        return (bArr[(i * 571655111) - 1] - this.aj.af(-931514517)) & 255;
    }

    public int kn() {
        byte[] bArr = this.af;
        int i = this.ad + 2065011939;
        this.ad = i;
        return (bArr[(i * -293893182) - 1] - this.aj.af(1345589958)) & -1651465702;
    }

    public boolean jq(int i) {
        try {
            if (((this.af[1978945739 * this.ad] - this.aj.ad((byte) 111)) & 255) < mn.an) {
                return false;
            }
            return true;
        } catch (Throwable e) {
            throw ba.ad(e, "ia.jq(" + ')');
        }
    }

    public boolean kb() {
        if (((this.af[1162198495 * this.ad] - this.aj.ad((byte) 6)) & 255) < mn.an) {
            return false;
        }
        return true;
    }

    public boolean ke() {
        if (((this.af[1978945739 * this.ad] - this.aj.ad((byte) 96)) & 255) < mn.an) {
            return false;
        }
        return true;
    }

    public boolean kt() {
        if (((this.af[-1804817128 * this.ad] - this.aj.ad((byte) 59)) & 255) < mn.an) {
            return false;
        }
        return true;
    }

    public int jj(int i) {
        try {
            byte[] bArr = this.af;
            int i2 = this.ad + 2065011939;
            this.ad = i2;
            int af = (bArr[(i2 * 1978945739) - 1] - this.aj.af(1326853114)) & 255;
            if (af < mn.an) {
                return af;
            }
            af = (af - 128) << 8;
            byte[] bArr2 = this.af;
            int i3 = this.ad + 2065011939;
            this.ad = i3;
            return af + ((bArr2[(i3 * 1978945739) - 1] - this.aj.af(-898044897)) & 255);
        } catch (Throwable e) {
            throw ba.ad(e, "ia.jj(" + ')');
        }
    }

    public int km() {
        byte[] bArr = this.af;
        int i = this.ad + 2065011939;
        this.ad = i;
        int af = (bArr[(i * 1978945739) - 1] - this.aj.af(769349355)) & 255;
        if (af < mn.an) {
            return af;
        }
        af = (af - 128) << 8;
        byte[] bArr2 = this.af;
        int i2 = this.ad + 2065011939;
        this.ad = i2;
        return af + ((bArr2[(i2 * 1978945739) - 1] - this.aj.af(-2029949454)) & 255);
    }

    public int kx() {
        byte[] bArr = this.af;
        int i = this.ad - 1948098226;
        this.ad = i;
        int af = (bArr[(i * 1978945739) - 1] - this.aj.af(400499300)) & 255;
        if (af < 147230930) {
            return af;
        }
        af = (af - 624182041) << 8;
        byte[] bArr2 = this.af;
        int i2 = this.ad - 212994128;
        this.ad = i2;
        return af + ((bArr2[(i2 * 1978945739) - 1] - this.aj.af(-1525599598)) & 255);
    }

    public void jw(int i) {
        try {
            this.aq = -283911144 * this.ad;
        } catch (Throwable e) {
            throw ba.ad(e, "ia.jw(" + ')');
        }
    }

    public void ka() {
        this.aq = -283911144 * this.ad;
    }

    public static no an(byte b) {
        try {
            no af = dt.af(170632450);
            af.af = null;
            af.ad = 0;
            af.an = new ia(5000);
            return af;
        } catch (Throwable e) {
            throw ba.ad(e, "ia.an(" + ')');
        }
    }

    public int kf(int i, byte b) {
        try {
            int i2 = (this.aq * -1146623207) >> 3;
            int i3 = 8 - ((this.aq * -1146623207) & 7);
            int i4 = 0;
            this.aq += -1577434839 * i;
            while (i > i3) {
                i4 += (this.af[i2] & ae[i3]) << (i - i3);
                i -= i3;
                i3 = 8;
                i2++;
            }
            if (i3 != i) {
                return i4 + ((this.af[i2] >> (i3 - i)) & ae[i]);
            }
            return i4 + (ae[i3] & this.af[i2]);
        } catch (Throwable e) {
            throw ba.ad(e, "ia.kf(" + ')');
        }
    }

    public int ko(int i) {
        int i2 = (this.aq * -1146623207) >> 3;
        int i3 = 8 - ((this.aq * -1146623207) & 7);
        int i4 = 0;
        this.aq += -1577434839 * i;
        while (i > i3) {
            i4 += (this.af[i2] & ae[i3]) << (i - i3);
            i -= i3;
            i3 = 8;
            i2++;
        }
        if (i3 != i) {
            return i4 + ((this.af[i2] >> (i3 - i)) & ae[i]);
        }
        return i4 + (ae[i3] & this.af[i2]);
    }

    public int kq(int i) {
        int i2 = (-1146623207 * this.aq) >> 3;
        int i3 = 8 - ((-481036785 * this.aq) & 7);
        int i4 = 0;
        this.aq += 2045433780 * i;
        while (i > i3) {
            i4 += (this.af[i2] & ae[i3]) << (i - i3);
            i -= i3;
            i3 = 8;
            i2++;
        }
        if (i3 != i) {
            return i4 + ((this.af[i2] >> (i3 - i)) & ae[i]);
        }
        return i4 + (ae[i3] & this.af[i2]);
    }

    public int ku(int i) {
        int i2 = (-1484124325 * this.aq) >> 3;
        int i3 = 8 - ((478506320 * this.aq) & 7);
        int i4 = 0;
        this.aq += -1873722745 * i;
        while (i > i3) {
            i4 += (this.af[i2] & ae[i3]) << (i - i3);
            i -= i3;
            i3 = 8;
            i2++;
        }
        if (i3 != i) {
            return i4 + ((this.af[i2] >> (i3 - i)) & ae[i]);
        }
        return i4 + (ae[i3] & this.af[i2]);
    }

    public void kh(int i) {
        try {
            this.ad = (((-1146623207 * this.aq) + 7) / 8) * 2065011939;
        } catch (Throwable e) {
            throw ba.ad(e, "ia.kh(" + ')');
        }
    }

    public void kw() {
        this.ad = (((-1146623207 * this.aq) + 7) / 8) * 2065011939;
    }

    public void ky() {
        this.ad = (((-1146623207 * this.aq) + 7) / 8) * 2065011939;
    }

    public static lr aa(kf kfVar, kf kfVar2, int i, int i2, int i3) {
        try {
            if (jo.ai(kfVar, i, i2, 1278410975)) {
                return ew.aw(kfVar2.an(i, i2, -916231443), -1712999332);
            }
            return null;
        } catch (Throwable e) {
            throw ba.ad(e, "ia.aa(" + ')');
        }
    }

    public int kc(int i, byte b) {
        try {
            return (i * 8) - (this.aq * -1146623207);
        } catch (Throwable e) {
            throw ba.ad(e, "ia.kc(" + ')');
        }
    }

    public int kg(int i) {
        return (i * 8) - (this.aq * -1146623207);
    }

    public int kz(int i) {
        return (i * 8) - (this.aq * -1146623207);
    }
}
