package p000;

public class fr {
    int aa;
    int[] ad = new int[2];
    int ae;
    int af = 2;
    int ag;
    int aj;
    int[] an = new int[2];
    int aq;
    int ar;
    int as;
    int ay;

    fr() {
        this.ad[0] = 0;
        this.ad[1] = 65535;
        this.an[0] = 0;
        this.an[1] = 65535;
    }

    final void af(ik ikVar) {
        this.ay = ikVar.ao((byte) 0);
        this.aa = ikVar.al(-76594298);
        this.ag = ikVar.al(1429221821);
        ad(ikVar);
    }

    final void ad(ik ikVar) {
        int i = 0;
        this.af = ikVar.ao((byte) 0);
        this.ad = new int[this.af];
        this.an = new int[this.af];
        while (i < this.af) {
            this.ad[i] = ikVar.au(2040971200);
            this.an[i] = ikVar.au(166825182);
            i++;
        }
    }

    final void ag(ik ikVar) {
        int i = 0;
        this.af = ikVar.ao((byte) 0);
        this.ad = new int[this.af];
        this.an = new int[this.af];
        while (i < this.af) {
            this.ad[i] = ikVar.au(-255523836);
            this.an[i] = ikVar.au(-1889725208);
            i++;
        }
    }

    final void ay(ik ikVar) {
        int i = 0;
        this.af = ikVar.ao((byte) 0);
        this.ad = new int[this.af];
        this.an = new int[this.af];
        while (i < this.af) {
            this.ad[i] = ikVar.au(405404149);
            this.an[i] = ikVar.au(-611347236);
            i++;
        }
    }

    final void aj() {
        this.as = 0;
        this.ar = 0;
        this.aj = 0;
        this.ae = 0;
        this.aq = 0;
    }

    final void an() {
        this.as = 0;
        this.ar = 0;
        this.aj = 0;
        this.ae = 0;
        this.aq = 0;
    }

    final void ar() {
        this.as = 0;
        this.ar = 0;
        this.aj = 0;
        this.ae = 0;
        this.aq = 0;
    }

    final void as() {
        this.as = 0;
        this.ar = 0;
        this.aj = 0;
        this.ae = 0;
        this.aq = 0;
    }

    final int aa(int i) {
        if (this.aq >= this.as) {
            int[] iArr = this.an;
            int i2 = this.ar;
            this.ar = i2 + 1;
            this.ae = iArr[i2] << 15;
            if (this.ar >= this.af) {
                this.ar = this.af - 1;
            }
            this.as = (int) ((((double) this.ad[this.ar]) / 65536.0d) * ((double) i));
            if (this.as > this.aq) {
                this.aj = ((this.an[this.ar] << 15) - this.ae) / (this.as - this.aq);
            }
        }
        this.ae += this.aj;
        this.aq++;
        return (this.ae - this.aj) >> 15;
    }

    final int ae(int i) {
        if (this.aq >= this.as) {
            int[] iArr = this.an;
            int i2 = this.ar;
            this.ar = i2 + 1;
            this.ae = iArr[i2] << 15;
            if (this.ar >= this.af) {
                this.ar = this.af - 1;
            }
            this.as = (int) ((((double) this.ad[this.ar]) / 65536.0d) * ((double) i));
            if (this.as > this.aq) {
                this.aj = ((this.an[this.ar] << 15) - this.ae) / (this.as - this.aq);
            }
        }
        this.ae += this.aj;
        this.aq++;
        return (this.ae - this.aj) >> 15;
    }

    final int am(int i) {
        if (this.aq >= this.as) {
            int[] iArr = this.an;
            int i2 = this.ar;
            this.ar = i2 + 1;
            this.ae = iArr[i2] << 15;
            if (this.ar >= this.af) {
                this.ar = this.af - 1;
            }
            this.as = (int) ((((double) this.ad[this.ar]) / 65536.0d) * ((double) i));
            if (this.as > this.aq) {
                this.aj = ((this.an[this.ar] << 15) - this.ae) / (this.as - this.aq);
            }
        }
        this.ae += this.aj;
        this.aq++;
        return (this.ae - this.aj) >> 15;
    }

    final int aq(int i) {
        if (this.aq >= this.as) {
            int[] iArr = this.an;
            int i2 = this.ar;
            this.ar = i2 + 1;
            this.ae = iArr[i2] << 15;
            if (this.ar >= this.af) {
                this.ar = this.af - 1;
            }
            this.as = (int) ((((double) this.ad[this.ar]) / 65536.0d) * ((double) i));
            if (this.as > this.aq) {
                this.aj = ((this.an[this.ar] << 15) - this.ae) / (this.as - this.aq);
            }
        }
        this.ae += this.aj;
        this.aq++;
        return (this.ae - this.aj) >> 15;
    }
}
