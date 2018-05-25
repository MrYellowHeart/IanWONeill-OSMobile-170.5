package p000;

public class jk implements ix {
    public static final jk aa = new jk("game4", "Game 4", 3);
    public static final jk ad = new jk("stellardawn", "Stellar Dawn", 1);
    public static final jk af = new jk("runescape", "RuneScape", 0);
    public static final jk ag = new jk("game5", "Game 5", 4);
    public static final jk an = new jk("game3", "Game 3", 2);
    public static final jk ay = new jk("oldscape", "RuneScape 2007", 5);
    final int ar;
    public final String as;

    jk(String str, String str2, int i) {
        try {
            this.as = str;
            this.ar = 114850703 * i;
        } catch (Throwable e) {
            throw ba.ad(e, "jk.<init>(" + ')');
        }
    }

    public int aa() {
        return -311147665 * this.ar;
    }

    public int ad() {
        return -1004527016 * this.ar;
    }

    public int af(int i) {
        try {
            return -311147665 * this.ar;
        } catch (Throwable e) {
            throw ba.ad(e, "jk.af(" + ')');
        }
    }

    public int an() {
        return -669886061 * this.ar;
    }

    static final int aj(int i, int i2, int i3) {
        try {
            int ae = ((int) (((double) (((ed.ae(45365 + i, 91923 + i2, 4, -1603457738) - 128) + ((ed.ae(i + 10294, 37821 + i2, 2, 192180088) - 128) >> 1)) + ((ed.ae(i, i2, 1, 876314827) - 128) >> 2))) * 0.3d)) + 35;
            if (ae < 10) {
                return 10;
            }
            if (ae <= 60) {
                return ae;
            }
            return 60;
        } catch (Throwable e) {
            throw ba.ad(e, "jk.aj(" + ')');
        }
    }
}
