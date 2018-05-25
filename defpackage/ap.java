package p000;

import java.util.Collection;

public class ap extends kq {
    public static final int ae = 13;
    static final int cs = 106;
    public final int[] aa;
    public final int ad;
    public final int af;
    public final int[] an;

    public static void ai(Collection collection, int i) {
        try {
            collection.add(ac.am);
            collection.add(ac.at);
            collection.add(ac.ab);
            collection.add(ac.aw);
        } catch (Throwable e) {
            throw ba.ad(e, "ap.ai(" + ')');
        }
    }

    ap(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        try {
            this.af = -1034995691 * i;
            this.ad = -1990881867 * i2;
            this.an = iArr;
            this.aa = iArr2;
        } catch (Throwable e) {
            throw ba.ad(e, "ap.<init>(" + ')');
        }
    }

    public boolean ad(int i, int i2) {
        if (i2 >= 0 && i2 < this.aa.length) {
            int i3 = this.aa[i2];
            if (i >= i3 && i <= i3 + this.an[i2]) {
                return true;
            }
        }
        return false;
    }

    public boolean af(int i, int i2, int i3) {
        if (i2 >= 0) {
            try {
                if (i2 < this.aa.length) {
                    int i4 = this.aa[i2];
                    if (i >= i4 && i <= i4 + this.an[i2]) {
                        return true;
                    }
                }
            } catch (Throwable e) {
                throw ba.ad(e, "ap.af(" + ')');
            }
        }
        return false;
    }

    public boolean an(int i, int i2) {
        if (i2 >= 0 && i2 < this.aa.length) {
            int i3 = this.aa[i2];
            if (i >= i3 && i <= i3 + this.an[i2]) {
                return true;
            }
        }
        return false;
    }
}
