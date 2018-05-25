package p000;

public class hk extends kd {
    public static short[][] ae = null;
    static final int am = 4095;
    static String cb;
    int aa;
    int ad;
    int af;
    int an;

    hk(int i, int i2, int i3, int i4) {
        try {
            this.af = -1879182819 * i;
            this.ad = 1167767495 * i2;
            this.an = -886958987 * i3;
            this.aa = 1860984207 * i4;
        } catch (Throwable e) {
            throw ba.ad(e, "hk.<init>(" + ')');
        }
    }

    void aa(int i, int i2, int i3, int i4) {
        this.af = -1879182819 * i;
        this.ad = 1167767495 * i2;
        this.an = -886958987 * i3;
        this.aa = 1860984207 * i4;
    }

    void ad(int i, int i2, int i3, int i4) {
        this.af = -1879182819 * i;
        this.ad = 1167767495 * i2;
        this.an = -886958987 * i3;
        this.aa = 1860984207 * i4;
    }

    void af(int i, int i2, int i3, int i4, byte b) {
        try {
            this.af = -1879182819 * i;
            this.ad = 1167767495 * i2;
            this.an = -886958987 * i3;
            this.aa = 1860984207 * i4;
        } catch (Throwable e) {
            throw ba.ad(e, "hk.af(" + ')');
        }
    }

    void an(int i, int i2, int i3, int i4) {
        this.af = -710193799 * i;
        this.ad = -636552269 * i2;
        this.an = -886958987 * i3;
        this.aa = 1860984207 * i4;
    }

    public static int ag(int i, short s) {
        try {
            return (int) ((cs.az[i] >>> 14) & 3);
        } catch (Throwable e) {
            throw ba.ad(e, "hk.ag(" + ')');
        }
    }

    public static int as(CharSequence charSequence, int i) {
        int i2 = 0;
        try {
            int i3 = 0;
            while (i2 < charSequence.length()) {
                i3 = ((i3 << 5) - i3) + jq.af(charSequence.charAt(i2), 907446118);
                i2++;
            }
            return i3;
        } catch (Throwable e) {
            throw ba.ad(e, "hk.as(" + ')');
        }
    }

    static final void am(String str, int i) {
        try {
            cz.aj(jv.ga + str + jv.gq, (byte) 4);
        } catch (Throwable e) {
            throw ba.ad(e, "hk.am(" + ')');
        }
    }
}
