package p000;

public class fv {
    int[] aa;
    int ad;
    int af;
    int[] an;

    fv() {
        int aa;
        fp.aa(16);
        if (fp.an() != 0) {
            aa = fp.aa(4) + 1;
        } else {
            aa = 1;
        }
        this.af = aa;
        if (fp.an() != 0) {
            fp.aa(8);
        }
        fp.aa(2);
        if (this.af > 1) {
            this.ad = fp.aa(4);
        }
        this.an = new int[this.af];
        this.aa = new int[this.af];
        for (aa = 0; aa < this.af; aa++) {
            fp.aa(8);
            this.an[aa] = fp.aa(8);
            this.aa[aa] = fp.aa(8);
        }
    }
}
