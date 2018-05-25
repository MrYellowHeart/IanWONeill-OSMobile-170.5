package p000;

public class fl extends fb {
    int aa = -1;
    kg ad = new kg();
    kg af = new kg();
    int an = 0;

    public final synchronized void ab(fb fbVar) {
        this.af.an(fbVar);
    }

    public final synchronized void af(fb fbVar) {
        this.af.an(fbVar);
    }

    public final synchronized void at(fb fbVar) {
        this.af.an(fbVar);
    }

    public final synchronized void aw(fb fbVar) {
        this.af.an(fbVar);
    }

    public final synchronized void ad(fb fbVar) {
        fbVar.ki();
    }

    public final synchronized void ah(fb fbVar) {
        fbVar.ki();
    }

    public final synchronized void ai(fb fbVar) {
        fbVar.ki();
    }

    public final synchronized void az(fb fbVar) {
        fbVar.ki();
    }

    void ak() {
        if (this.an > 0) {
            fs fsVar = (fs) this.ad.as();
            while (fsVar != null) {
                fsVar.af -= this.an;
                fsVar = (fs) this.ad.aj();
            }
            this.aa -= this.an;
            this.an = 0;
        }
    }

    void an() {
        if (this.an > 0) {
            fs fsVar = (fs) this.ad.as();
            while (fsVar != null) {
                fsVar.af -= this.an;
                fsVar = (fs) this.ad.aj();
            }
            this.aa -= this.an;
            this.an = 0;
        }
    }

    void ao() {
        if (this.an > 0) {
            fs fsVar = (fs) this.ad.as();
            while (fsVar != null) {
                fsVar.af -= this.an;
                fsVar = (fs) this.ad.aj();
            }
            this.aa -= this.an;
            this.an = 0;
        }
    }

    void aa(kd kdVar, fs fsVar) {
        kd kdVar2 = kdVar;
        while (kdVar2 != this.ad.af && ((fs) kdVar2).af <= fsVar.af) {
            kdVar2 = kdVar2.fi;
        }
        kg.aa(fsVar, kdVar2);
        this.aa = ((fs) this.ad.af.fi).af;
    }

    void ax(kd kdVar, fs fsVar) {
        kd kdVar2 = kdVar;
        while (kdVar2 != this.ad.af && ((fs) kdVar2).af <= fsVar.af) {
            kdVar2 = kdVar2.fi;
        }
        kg.aa(fsVar, kdVar2);
        this.aa = ((fs) this.ad.af.fi).af;
    }

    void ag(fs fsVar) {
        fsVar.ki();
        fsVar.af();
        kd kdVar = this.ad.af.fi;
        if (kdVar == this.ad.af) {
            this.aa = -1;
        } else {
            this.aa = ((fs) kdVar).af;
        }
    }

    void au(fs fsVar) {
        fsVar.ki();
        fsVar.af();
        kd kdVar = this.ad.af.fi;
        if (kdVar == this.ad.af) {
            this.aa = -1;
        } else {
            this.aa = ((fs) kdVar).af;
        }
    }

    protected fb ac() {
        return (fb) this.af.as();
    }

    protected fb al() {
        return (fb) this.af.as();
    }

    protected fb ap() {
        return (fb) this.af.as();
    }

    protected fb av() {
        return (fb) this.af.as();
    }

    protected fb ay() {
        return (fb) this.af.as();
    }

    protected fb as() {
        return (fb) this.af.aj();
    }

    protected fb bb() {
        return (fb) this.af.aj();
    }

    protected fb bw() {
        return (fb) this.af.aj();
    }

    protected int ar() {
        return 0;
    }

    protected int bc() {
        return 0;
    }

    protected int bg() {
        return 0;
    }

    protected int bh() {
        return 0;
    }

    protected int bz() {
        return 0;
    }

    public final synchronized void aj(int[] iArr, int i, int i2) {
        do {
            if (this.aa < 0) {
                ae(iArr, i, i2);
                break;
            } else if (this.an + i2 < this.aa) {
                this.an += i2;
                ae(iArr, i, i2);
                break;
            } else {
                int i3 = this.aa - this.an;
                ae(iArr, i, i3);
                i += i3;
                i2 -= i3;
                this.an = i3 + this.an;
                an();
                fs fsVar = (fs) this.ad.as();
                synchronized (fsVar) {
                    int ad = fsVar.ad(this);
                    if (ad < 0) {
                        fsVar.af = 0;
                        ag(fsVar);
                    } else {
                        fsVar.af = ad;
                        aa(fsVar.fi, fsVar);
                    }
                }
            }
        } while (i2 != 0);
    }

    public final synchronized void bf(int[] iArr, int i, int i2) {
        do {
            if (this.aa < 0) {
                ae(iArr, i, i2);
                break;
            } else if (this.an + i2 < this.aa) {
                this.an += i2;
                ae(iArr, i, i2);
                break;
            } else {
                int i3 = this.aa - this.an;
                ae(iArr, i, i3);
                i += i3;
                i2 -= i3;
                this.an = i3 + this.an;
                an();
                fs fsVar = (fs) this.ad.as();
                synchronized (fsVar) {
                    int ad = fsVar.ad(this);
                    if (ad < 0) {
                        fsVar.af = 0;
                        ag(fsVar);
                    } else {
                        fsVar.af = ad;
                        aa(fsVar.fi, fsVar);
                    }
                }
            }
        } while (i2 != 0);
    }

    void ae(int[] iArr, int i, int i2) {
        fb fbVar = (fb) this.af.as();
        while (fbVar != null) {
            fbVar.fw(iArr, i, i2);
            fbVar = (fb) this.af.aj();
        }
    }

    void bp(int[] iArr, int i, int i2) {
        fb fbVar = (fb) this.af.as();
        while (fbVar != null) {
            fbVar.fw(iArr, i, i2);
            fbVar = (fb) this.af.aj();
        }
    }

    void bv(int[] iArr, int i, int i2) {
        fb fbVar = (fb) this.af.as();
        while (fbVar != null) {
            fbVar.fw(iArr, i, i2);
            fbVar = (fb) this.af.aj();
        }
    }

    void bx(int[] iArr, int i, int i2) {
        fb fbVar = (fb) this.af.as();
        while (fbVar != null) {
            fbVar.fw(iArr, i, i2);
            fbVar = (fb) this.af.aj();
        }
    }

    public final synchronized void aq(int i) {
        do {
            if (this.aa < 0) {
                am(i);
                break;
            } else if (this.an + i < this.aa) {
                this.an += i;
                am(i);
                break;
            } else {
                int i2 = this.aa - this.an;
                am(i2);
                i -= i2;
                this.an = i2 + this.an;
                an();
                fs fsVar = (fs) this.ad.as();
                synchronized (fsVar) {
                    int ad = fsVar.ad(this);
                    if (ad < 0) {
                        fsVar.af = 0;
                        ag(fsVar);
                    } else {
                        fsVar.af = ad;
                        aa(fsVar.fi, fsVar);
                    }
                }
            }
        } while (i != 0);
    }

    public final synchronized void be(int i) {
        do {
            if (this.aa < 0) {
                am(i);
                break;
            } else if (this.an + i < this.aa) {
                this.an += i;
                am(i);
                break;
            } else {
                int i2 = this.aa - this.an;
                am(i2);
                i -= i2;
                this.an = i2 + this.an;
                an();
                fs fsVar = (fs) this.ad.as();
                synchronized (fsVar) {
                    int ad = fsVar.ad(this);
                    if (ad < 0) {
                        fsVar.af = 0;
                        ag(fsVar);
                    } else {
                        fsVar.af = ad;
                        aa(fsVar.fi, fsVar);
                    }
                }
            }
        } while (i != 0);
    }

    public final synchronized void bt(int i) {
        do {
            if (this.aa < 0) {
                am(i);
                break;
            } else if (this.an + i < this.aa) {
                this.an += i;
                am(i);
                break;
            } else {
                int i2 = this.aa - this.an;
                am(i2);
                i -= i2;
                this.an = i2 + this.an;
                an();
                fs fsVar = (fs) this.ad.as();
                synchronized (fsVar) {
                    int ad = fsVar.ad(this);
                    if (ad < 0) {
                        fsVar.af = 0;
                        ag(fsVar);
                    } else {
                        fsVar.af = ad;
                        aa(fsVar.fi, fsVar);
                    }
                }
            }
        } while (i != 0);
    }

    public final synchronized void bu(int i) {
        do {
            if (this.aa < 0) {
                am(i);
                break;
            } else if (this.an + i < this.aa) {
                this.an += i;
                am(i);
                break;
            } else {
                int i2 = this.aa - this.an;
                am(i2);
                i -= i2;
                this.an = i2 + this.an;
                an();
                fs fsVar = (fs) this.ad.as();
                synchronized (fsVar) {
                    int ad = fsVar.ad(this);
                    if (ad < 0) {
                        fsVar.af = 0;
                        ag(fsVar);
                    } else {
                        fsVar.af = ad;
                        aa(fsVar.fi, fsVar);
                    }
                }
            }
        } while (i != 0);
    }

    void am(int i) {
        fb fbVar = (fb) this.af.as();
        while (fbVar != null) {
            fbVar.aq(i);
            fbVar = (fb) this.af.aj();
        }
    }
}
