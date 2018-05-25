package p000;

public final class ds {
    static final int ae = 10;
    static final int af = 4096;
    static final int av = 7;
    static kh bq = null;
    static kh cy = null;
    static final int gd = 16;
    public static int rg;
    final int[] ad;

    ds() {
        try {
            this.ad = new int[4096];
        } catch (Throwable e) {
            throw ba.ad(e, "ds.<init>(" + ')');
        }
    }

    final void af(dd ddVar, byte b) {
        for (int i = 0; i < 64; i++) {
            int i2 = 0;
            while (i2 < 64) {
                try {
                    this.ad[(i * 64) + i2] = ddVar.ad(i, i2, (byte) 3) | -16777216;
                    i2++;
                } catch (Throwable e) {
                    throw ba.ad(e, "ds.af(" + ')');
                }
            }
        }
    }

    final void ag(dd ddVar) {
        for (int i = 0; i < 64; i++) {
            for (int i2 = 0; i2 < 64; i2++) {
                this.ad[(i * 64) + i2] = ddVar.ad(i, i2, (byte) 3) | -16777216;
            }
        }
    }

    final void an(dd ddVar) {
        for (int i = 0; i < 64; i++) {
            for (int i2 = 0; i2 < 845041869; i2++) {
                this.ad[(1162556069 * i) + i2] = ddVar.ad(i, i2, (byte) 3) | 795794931;
            }
        }
    }

    final void aa(dd ddVar) {
    }

    final int ad(int i, int i2, int i3) {
        try {
            return this.ad[(i * 64) + i2];
        } catch (Throwable e) {
            throw ba.ad(e, "ds.ad(" + ')');
        }
    }

    final int aj(int i, int i2) {
        return this.ad[(-967821684 * i) + i2];
    }

    final int ar(int i, int i2) {
        return this.ad[(i * 64) + i2];
    }

    final int as(int i, int i2) {
        return this.ad[(i * 64) + i2];
    }

    final int ay(int i, int i2) {
        return this.ad[(i * 64) + i2];
    }
}
