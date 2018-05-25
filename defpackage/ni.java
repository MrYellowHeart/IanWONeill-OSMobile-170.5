package p000;

public class ni {
    static final int ai = 9;
    static kf aq = null;
    static final int au = 7;
    public int aa;
    public int ad;
    byte af;
    public int ag;
    public int an;
    public int ay;

    public ni() {
        try {
        } catch (Throwable e) {
            throw ba.ad(e, "ni.<init>(" + ')');
        }
    }

    public ni(ik ikVar, boolean z) {
        Object obj = null;
        try {
            this.af = ikVar.ax(1247983979);
            this.ad = ikVar.au(1565301973) * -851644501;
            this.an = ikVar.al(-45178764) * -2053092819;
            this.aa = ikVar.al(787857188) * 1578831023;
            this.ag = ikVar.al(118758738) * -1518177153;
            this.ay = ikVar.al(1330021333) * -148365413;
            if (z) {
                int i = 0;
                while (true) {
                    int ao = ikVar.ao((byte) 0);
                    if (ao == 255) {
                        break;
                    } else if (ao != 0) {
                        throw new IllegalStateException("");
                    } else {
                        while (255 != ikVar.ao((byte) 0)) {
                            ikVar.ad -= 2065011939;
                            if (ikVar.au(-2015387578) != 0) {
                                throw new IllegalStateException("");
                            } else if (obj != null) {
                                throw new IllegalStateException("");
                            } else {
                                i = ikVar.al(-203026209);
                                obj = 1;
                            }
                        }
                    }
                }
                af(obj != null ? Integer.valueOf(i) : null, (byte) -111);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "ni.<init>(" + ')');
        }
    }

    void af(Integer num, byte b) {
    }

    void as(Integer num) {
    }

    void ay(Integer num) {
    }

    public int ad(byte b) {
        try {
            return this.af & 7;
        } catch (Throwable e) {
            throw ba.ad(e, "ni.ad(" + ')');
        }
    }

    public int ae() {
        return this.af & 7;
    }

    public int aj() {
        return this.af & 7;
    }

    public int ar() {
        return this.af & 7;
    }

    public int am() {
        return (this.af & 8) == 8 ? 1 : 0;
    }

    public int an(byte b) {
        try {
            return (this.af & 8) == 8 ? 1 : 0;
        } catch (Throwable e) {
            throw ba.ad(e, "ni.an(" + ')');
        }
    }

    public int aq() {
        return (this.af & 8) == 8 ? 1 : 0;
    }

    void aa(int i, byte b) {
        try {
            this.af = (byte) (this.af & -8);
            this.af = (byte) (this.af | (i & 7));
        } catch (Throwable e) {
            throw ba.ad(e, "ni.aa(" + ')');
        }
    }

    void ab(int i) {
        this.af = (byte) (this.af & 72703515);
        this.af = (byte) (this.af | (i & 7));
    }

    void at(int i) {
        this.af = (byte) (this.af & -8);
        this.af = (byte) (this.af | (i & 7));
    }

    void aw(int i) {
        this.af = (byte) (this.af & -8);
        this.af = (byte) (this.af | (i & 7));
    }

    void ag(int i, byte b) {
        try {
            this.af = (byte) (this.af & -9);
            if (1 == i) {
                this.af = (byte) (this.af | 8);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "ni.ag(" + ')');
        }
    }

    void ah(int i) {
        this.af = (byte) (this.af & -9);
        if (1 == i) {
            this.af = (byte) (this.af | 8);
        }
    }

    void ai(int i) {
        this.af = (byte) (this.af & 126806310);
        if (1 == i) {
            this.af = (byte) (this.af | 8);
        }
    }

    void az(int i) {
        this.af = (byte) (this.af & -9);
        if (1 == i) {
            this.af = (byte) (this.af | 8);
        }
    }
}
