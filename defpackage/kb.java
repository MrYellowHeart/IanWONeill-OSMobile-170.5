package p000;

public final class kb {
    kd aa;
    kd[] ad;
    int af;
    int ag = 0;
    kd an;

    public kb(int i) {
        int i2 = 0;
        this.af = i;
        this.ad = new kd[i];
        while (i2 < i) {
            kd[] kdVarArr = this.ad;
            kd kdVar = new kd();
            kdVarArr[i2] = kdVar;
            kdVar.fi = kdVar;
            kdVar.fw = kdVar;
            i2++;
        }
    }

    public kd af(long j) {
        kd kdVar = this.ad[(int) (((long) (this.af - 1)) & j)];
        this.an = kdVar.fi;
        while (this.an != kdVar) {
            if (this.an.fy == j) {
                kd kdVar2 = this.an;
                this.an = this.an.fi;
                return kdVar2;
            }
            this.an = this.an.fi;
        }
        this.an = null;
        return null;
    }

    public kd ay(long j) {
        kd kdVar = this.ad[(int) (((long) (this.af - 1)) & j)];
        this.an = kdVar.fi;
        while (this.an != kdVar) {
            if (this.an.fy == j) {
                kd kdVar2 = this.an;
                this.an = this.an.fi;
                return kdVar2;
            }
            this.an = this.an.fi;
        }
        this.an = null;
        return null;
    }

    public void ad(kd kdVar, long j) {
        if (kdVar.fw != null) {
            kdVar.ki();
        }
        kd kdVar2 = this.ad[(int) (((long) (this.af - 1)) & j)];
        kdVar.fw = kdVar2.fw;
        kdVar.fi = kdVar2;
        kdVar.fw.fi = kdVar;
        kdVar.fi.fw = kdVar;
        kdVar.fy = j;
    }

    public void ar(kd kdVar, long j) {
        if (kdVar.fw != null) {
            kdVar.ki();
        }
        kd kdVar2 = this.ad[(int) (((long) (this.af - 1)) & j)];
        kdVar.fw = kdVar2.fw;
        kdVar.fi = kdVar2;
        kdVar.fw.fi = kdVar;
        kdVar.fi.fw = kdVar;
        kdVar.fy = j;
    }

    public void as(kd kdVar, long j) {
        if (kdVar.fw != null) {
            kdVar.ki();
        }
        kd kdVar2 = this.ad[(int) (((long) (this.af - 1)) & j)];
        kdVar.fw = kdVar2.fw;
        kdVar.fi = kdVar2;
        kdVar.fw.fi = kdVar;
        kdVar.fi.fw = kdVar;
        kdVar.fy = j;
    }

    void ae() {
        for (int i = 0; i < this.af; i++) {
            kd kdVar = this.ad[i];
            while (true) {
                kd kdVar2 = kdVar.fi;
                if (kdVar2 == kdVar) {
                    break;
                }
                kdVar2.ki();
            }
        }
        this.an = null;
        this.aa = null;
    }

    void aj() {
        for (int i = 0; i < this.af; i++) {
            kd kdVar = this.ad[i];
            while (true) {
                kd kdVar2 = kdVar.fi;
                if (kdVar2 == kdVar) {
                    break;
                }
                kdVar2.ki();
            }
        }
        this.an = null;
        this.aa = null;
    }

    void an() {
        for (int i = 0; i < this.af; i++) {
            kd kdVar = this.ad[i];
            while (true) {
                kd kdVar2 = kdVar.fi;
                if (kdVar2 == kdVar) {
                    break;
                }
                kdVar2.ki();
            }
        }
        this.an = null;
        this.aa = null;
    }

    void aq() {
        for (int i = 0; i < this.af; i++) {
            kd kdVar = this.ad[i];
            while (true) {
                kd kdVar2 = kdVar.fi;
                if (kdVar2 == kdVar) {
                    break;
                }
                kdVar2.ki();
            }
        }
        this.an = null;
        this.aa = null;
    }

    public kd aa() {
        this.ag = 0;
        return ag();
    }

    public kd ab() {
        this.ag = 0;
        return ag();
    }

    public kd am() {
        this.ag = 0;
        return ag();
    }

    public kd at() {
        this.ag = 0;
        return ag();
    }

    public kd ag() {
        kd kdVar;
        if (this.ag <= 0 || this.aa == this.ad[this.ag - 1]) {
            while (this.ag < this.af) {
                kd[] kdVarArr = this.ad;
                int i = this.ag;
                this.ag = i + 1;
                kdVar = kdVarArr[i].fi;
                if (kdVar != this.ad[this.ag - 1]) {
                    this.aa = kdVar.fi;
                    return kdVar;
                }
            }
            return null;
        }
        kdVar = this.aa;
        this.aa = kdVar.fi;
        return kdVar;
    }

    public kd aw() {
        kd kdVar;
        if (this.ag <= 0 || this.aa == this.ad[this.ag - 1]) {
            while (this.ag < this.af) {
                kd[] kdVarArr = this.ad;
                int i = this.ag;
                this.ag = i + 1;
                kdVar = kdVarArr[i].fi;
                if (kdVar != this.ad[this.ag - 1]) {
                    this.aa = kdVar.fi;
                    return kdVar;
                }
            }
            return null;
        }
        kdVar = this.aa;
        this.aa = kdVar.fi;
        return kdVar;
    }
}
