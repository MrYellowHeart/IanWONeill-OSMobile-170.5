package p000;

public class kz {
    int ad = 0;
    final long[] af;
    int an = 0;

    public kz(int i) {
        this.af = new long[i];
    }

    public void aa(long j) {
        if (this.an < this.af.length) {
            this.an++;
        }
        this.af[this.ad] = j;
        this.ad = (this.ad + 1) % this.af.length;
    }

    public void ad(long j) {
        if (this.an < this.af.length) {
            this.an++;
        }
        this.af[this.ad] = j;
        this.ad = (this.ad + 1) % this.af.length;
    }

    public void af(long j) {
        if (this.an < this.af.length) {
            this.an++;
        }
        this.af[this.ad] = j;
        this.ad = (this.ad + 1) % this.af.length;
    }

    public void ag(long j) {
        if (this.an < this.af.length) {
            this.an++;
        }
        this.af[this.ad] = j;
        this.ad = (this.ad + 1) % this.af.length;
    }

    public void an(long j) {
        if (this.an < this.af.length) {
            this.an++;
        }
        this.af[this.ad] = j;
        this.ad = (this.ad + 1) % this.af.length;
    }
}
