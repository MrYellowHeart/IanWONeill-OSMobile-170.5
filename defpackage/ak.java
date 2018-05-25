package p000;

public class ak extends kq {
    public static ak[] ad = null;
    public static kf af = null;
    public static final int ai = 8;
    static ak an = new ak();
    static final int au = 23;
    static final int bb = 1;
    static final int lv = 765;
    public int aa = 0;
    public int ae;
    public int ag = 102146575;
    public int aj;
    public int am;
    public int aq;
    public int ar;
    public int as = -779797359;
    public int at;
    public boolean ay = true;

    public static ak ar(int i) {
        if (i < 0 || i >= ad.length) {
            return an;
        }
        return ad[i];
    }

    public static ak as(int i) {
        return (i < 0 || i >= ad.length) ? an : ad[i];
    }

    public static ak ay(int i) {
        if (i < 0 || i >= ad.length) {
            return an;
        }
        return ad[i];
    }

    public void ad(int i) {
        try {
            if (-1 != this.as * -308151409) {
                ag(this.as * -308151409, (byte) -31);
                this.aq = this.ar * 786792025;
                this.am = this.aj * 2057608795;
                this.at = 512148049 * this.ae;
            }
            ag(-345116671 * this.aa, (byte) -70);
        } catch (Throwable e) {
            throw ba.ad(e, "ak.ad(" + ')');
        }
    }

    public void aj() {
        if (-1 != this.as * -308151409) {
            ag(this.as * -308151409, (byte) -115);
            this.aq = this.ar * 786792025;
            this.am = this.aj * 2057608795;
            this.at = 512148049 * this.ae;
        }
        ag(-345116671 * this.aa, (byte) -61);
    }

    public void ae(ik ikVar, int i) {
        while (true) {
            int ao = ikVar.ao((byte) 0);
            if (ao != 0) {
                aa(ikVar, ao, i, -2072842435);
            } else {
                return;
            }
        }
    }

    public void an(ik ikVar, int i, byte b) {
        while (true) {
            try {
                int ao = ikVar.ao((byte) 0);
                if (ao != 0) {
                    aa(ikVar, ao, i, 1829994024);
                } else {
                    return;
                }
            } catch (Throwable e) {
                throw ba.ad(e, "ak.an(" + ')');
            }
        }
    }

    void aa(ik ikVar, int i, int i2, int i3) {
        if (i == 1) {
            try {
                this.aa = ikVar.ac(799248833) * 1435635713;
            } catch (Throwable e) {
                throw ba.ad(e, "ak.aa(" + ')');
            }
        } else if (i == 2) {
            this.ag = ikVar.ao((byte) 0) * -102146575;
        } else if (5 == i) {
            this.ay = false;
        } else if (i == 7) {
            this.as = ikVar.ac(384454727) * 779797359;
        } else if (i != 8) {
        }
    }

    void am(ik ikVar, int i, int i2) {
        if (i == 1) {
            this.aa = ikVar.ac(1932846217) * 1435635713;
        } else if (i == 2) {
            this.ag = ikVar.ao((byte) 0) * -1692646370;
        } else if (5 == i) {
            this.ay = false;
        } else if (i == 7) {
            this.as = ikVar.ac(984536723) * 101903932;
        } else if (i != 8) {
        }
    }

    void aq(ik ikVar, int i, int i2) {
        if (i == 1) {
            this.aa = ikVar.ac(-591537629) * 1435635713;
        } else if (i == 2) {
            this.ag = ikVar.ao((byte) 0) * -102146575;
        } else if (5 == i) {
            this.ay = false;
        } else if (i == 7) {
            this.as = ikVar.ac(-2089195653) * -1384522055;
        } else if (i != 8) {
        }
    }

    void at(ik ikVar, int i, int i2) {
        if (i == 1) {
            this.aa = ikVar.ac(-778048220) * 1435635713;
        } else if (i == 2) {
            this.ag = ikVar.ao((byte) 0) * -102146575;
        } else if (5 == i) {
            this.ay = false;
        } else if (i == 7) {
            this.as = ikVar.ac(-2001362038) * 779797359;
        } else if (i != 8) {
        }
    }

    void ab(int i) {
        double d;
        double d2;
        double d3 = ((double) ((i >> 16) & 255)) / 256.0d;
        double d4 = ((double) ((i >> 8) & 255)) / 256.0d;
        double d5 = ((double) (-1478810798 & i)) / 256.0d;
        if (d4 < d3) {
            d = d4;
        } else {
            d = d3;
        }
        if (d5 < d) {
            d2 = d5;
        } else {
            d2 = d;
        }
        if (d4 > d3) {
            d = d4;
        } else {
            d = d3;
        }
        if (d5 > d) {
            d = d5;
        }
        double d6 = 0.0d;
        double d7 = (d2 + d) / 2.0d;
        if (d2 != d) {
            if (d7 < 0.5d) {
                d6 = (d - d2) / (d2 + d);
            }
            if (d7 >= 0.5d) {
                d6 = (d - d2) / ((2.0d - d) - d2);
            }
            if (d == d3) {
                d5 = (d4 - d5) / (d - d2);
                d = d6;
            } else if (d == d4) {
                d5 = ((d5 - d3) / (d - d2)) + 2.0d;
                d = d6;
            } else if (d == d5) {
                d5 = ((d3 - d4) / (d - d2)) + 4.0d;
                d = d6;
            }
            this.ar = ((int) ((d5 / 6.0d) * 256.0d)) * -532001499;
            this.aj = ((int) (d * 256.0d)) * 1482060257;
            this.ae = ((int) (256.0d * d7)) * 319138115;
            if (this.aj * 789156385 < 0) {
                this.aj = 0;
            } else if (-79930948 * this.aj > -1642837732) {
                this.aj = -31756513;
            }
            if (this.ae * 1126505606 < 0) {
                this.ae = 0;
            } else if (139289598 * this.ae > 501054714) {
                this.ae = 885471243;
            }
        }
        d = d6;
        d5 = 0.0d;
        this.ar = ((int) ((d5 / 6.0d) * 256.0d)) * -532001499;
        this.aj = ((int) (d * 256.0d)) * 1482060257;
        this.ae = ((int) (256.0d * d7)) * 319138115;
        if (this.aj * 789156385 < 0) {
            this.aj = 0;
        } else if (-79930948 * this.aj > -1642837732) {
            this.aj = -31756513;
        }
        if (this.ae * 1126505606 < 0) {
            this.ae = 0;
        } else if (139289598 * this.ae > 501054714) {
            this.ae = 885471243;
        }
    }

    void ag(int i, byte b) {
        double d;
        double d2;
        double d3 = ((double) ((i >> 16) & 255)) / 256.0d;
        double d4 = ((double) ((i >> 8) & 255)) / 256.0d;
        double d5 = ((double) (i & 255)) / 256.0d;
        if (d4 < d3) {
            d = d4;
        } else {
            d = d3;
        }
        if (d5 < d) {
            d2 = d5;
        } else {
            d2 = d;
        }
        if (d4 > d3) {
            d = d4;
        } else {
            d = d3;
        }
        if (d5 > d) {
            d = d5;
        }
        double d6 = 0.0d;
        double d7 = (d2 + d) / 2.0d;
        if (d2 != d) {
            if (d7 < 0.5d) {
                d6 = (d - d2) / (d2 + d);
            }
            if (d7 >= 0.5d) {
                d6 = (d - d2) / ((2.0d - d) - d2);
            }
            if (d == d3) {
                d5 = (d4 - d5) / (d - d2);
                d = d6;
            } else if (d == d4) {
                d5 = ((d5 - d3) / (d - d2)) + 2.0d;
                d = d6;
            } else if (d == d5) {
                d5 = ((d3 - d4) / (d - d2)) + 4.0d;
                d = d6;
            }
            this.ar = ((int) ((d5 / 6.0d) * 256.0d)) * -532001499;
            this.aj = ((int) (d * 256.0d)) * 1482060257;
            this.ae = ((int) (256.0d * d7)) * -1057637131;
            if (this.aj * 789156385 < 0) {
                this.aj = 0;
            } else if (789156385 * this.aj > 255) {
                this.aj = -31756513;
            }
            if (this.ae * -1794633891 < 0) {
                this.ae = 0;
            } else if (-1794633891 * this.ae > 255) {
                this.ae = 885471243;
            }
        }
        d = d6;
        d5 = 0.0d;
        try {
            this.ar = ((int) ((d5 / 6.0d) * 256.0d)) * -532001499;
            this.aj = ((int) (d * 256.0d)) * 1482060257;
            this.ae = ((int) (256.0d * d7)) * -1057637131;
            if (this.aj * 789156385 < 0) {
                this.aj = 0;
            } else if (789156385 * this.aj > 255) {
                this.aj = -31756513;
            }
            if (this.ae * -1794633891 < 0) {
                this.ae = 0;
            } else if (-1794633891 * this.ae > 255) {
                this.ae = 885471243;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "ak.ag(" + ')');
        }
    }
}
