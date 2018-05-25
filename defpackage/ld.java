package p000;

public final class ld implements ls {
    int af;

    ld() {
        try {
            this.af = 0;
        } catch (Throwable e) {
            throw ba.ad(e, "ld.<init>(" + ')');
        }
    }

    public synchronized int ad() {
        int i;
        i = 2132450441 * this.af;
        this.af = 0;
        return i;
    }

    public synchronized int af(int i) {
        int i2;
        try {
            i2 = 1555218057 * this.af;
            this.af = 0;
        } catch (Throwable e) {
            throw ba.ad(e, "ld.af(" + ')');
        }
        return i2;
    }

    public synchronized int an() {
        int i;
        i = 1555218057 * this.af;
        this.af = 0;
        return i;
    }
}
