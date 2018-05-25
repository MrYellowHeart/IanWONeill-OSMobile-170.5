package p000;

public class js {
    int aa;
    int ad;
    int af;
    String ag;
    int an;
    boolean as;
    String ay;

    js(String str, String str2, int i, int i2, int i3, int i4, boolean z) {
        try {
            this.ag = str;
            this.ay = str2;
            this.af = -715868007 * i;
            this.ad = 284619463 * i2;
            this.an = 1048076997 * i3;
            this.aa = -492327079 * i4;
            this.as = z;
        } catch (Throwable e) {
            throw ba.ad(e, "js.<init>(" + ')');
        }
    }

    public static void ad(String str, boolean z, boolean z2, byte b) {
        if (z) {
            try {
                if (le.af.startsWith("win") && !z2) {
                    as.an(str, 0, (byte) 3);
                    return;
                } else if (le.af.startsWith("mac")) {
                    hj.aa(str, 1, "openjs", -2043536893);
                    return;
                } else {
                    as.an(str, 2, (byte) 3);
                    return;
                }
            } catch (Throwable e) {
                throw ba.ad(e, "js.ad(" + ')');
            }
        }
        as.an(str, 3, (byte) 3);
    }

    public static jy af(int i, int i2) {
        try {
            jy[] jyVarArr = new jy[]{jy.aa, jy.af, jy.an, jy.ad};
            for (jy jyVar : jyVarArr) {
                if (i == jyVar.ay * -517456315) {
                    return jyVar;
                }
            }
            return null;
        } catch (Throwable e) {
            throw ba.ad(e, "js.af(" + ')');
        }
    }

    js() {
        try {
        } catch (Throwable e) {
            throw ba.ad(e, "js.<init>(" + ')');
        }
    }

    void aa(js jsVar) {
        this.ag = jsVar.ag;
        this.ay = jsVar.ay;
        this.af = jsVar.af * 1;
        this.ad = jsVar.ad * 1;
        this.an = jsVar.an * 1;
        this.aa = jsVar.aa * 1;
        this.as = jsVar.as;
    }

    void af(js jsVar, int i) {
        try {
            this.ag = jsVar.ag;
            this.ay = jsVar.ay;
            this.af = jsVar.af * 1;
            this.ad = jsVar.ad * 1;
            this.an = jsVar.an * 1;
            this.aa = jsVar.aa * 1;
            this.as = jsVar.as;
        } catch (Throwable e) {
            throw ba.ad(e, "js.af(" + ')');
        }
    }

    void ag(js jsVar) {
        this.ag = jsVar.ag;
        this.ay = jsVar.ay;
        this.af = jsVar.af * 1;
        this.ad = jsVar.ad * 1;
        this.an = jsVar.an * 1;
        this.aa = jsVar.aa * 1;
        this.as = jsVar.as;
    }

    void an(js jsVar) {
        this.ag = jsVar.ag;
        this.ay = jsVar.ay;
        this.af = jsVar.af * 1;
        this.ad = jsVar.ad * 1;
        this.an = jsVar.an * 1;
        this.aa = jsVar.aa * 1;
        this.as = jsVar.as;
    }

    void ad(String str, String str2, int i, int i2, int i3, int i4, boolean z, byte b) {
        try {
            this.ag = str;
            this.ay = str2;
            this.af = -715868007 * i;
            this.ad = 284619463 * i2;
            this.an = 1048076997 * i3;
            this.aa = -492327079 * i4;
            this.as = z;
        } catch (Throwable e) {
            throw ba.ad(e, "js.ad(" + ')');
        }
    }

    void as(String str, String str2, int i, int i2, int i3, int i4, boolean z) {
        this.ag = str;
        this.ay = str2;
        this.af = -715868007 * i;
        this.ad = 284619463 * i2;
        this.an = 1048076997 * i3;
        this.aa = -492327079 * i4;
        this.as = z;
    }

    void ay(String str, String str2, int i, int i2, int i3, int i4, boolean z) {
        this.ag = str;
        this.ay = str2;
        this.af = 11900994 * i;
        this.ad = 284619463 * i2;
        this.an = 1048076997 * i3;
        this.aa = -865306953 * i4;
        this.as = z;
    }

    public static int ar(CharSequence charSequence, byte b) {
        int i = 0;
        try {
            int i2 = 0;
            while (i < charSequence.length()) {
                i2 = ((i2 << 5) - i2) + charSequence.charAt(i);
                i++;
            }
            return i2;
        } catch (Throwable e) {
            throw ba.ad(e, "js.ar(" + ')');
        }
    }

    static final boolean am(cl clVar, int i, int i2, int i3, cn cnVar, int i4) {
        try {
            if (!cs.an) {
                return false;
            }
            bc.aq(cnVar.bf, -1720491938);
            int i5 = clVar.bk + i;
            int i6 = clVar.by + i2;
            int i7 = clVar.bn + i3;
            int i8 = clVar.ba;
            int i9 = clVar.bl;
            int i10 = clVar.bd;
            i5 = (-2086919111 * cs.as) - i5;
            i6 = (276416693 * cs.ar) - i6;
            i7 = (1822668035 * cs.aj) - i7;
            if (Math.abs(i5) > (et.at * 1497686983) + i8) {
                return false;
            }
            if (Math.abs(i6) > (-1966739019 * ch.ab) + i9) {
                return false;
            }
            if (Math.abs(i7) > (2101877851 * gl.aw) + i10) {
                return false;
            }
            if (Math.abs(((nb.aq * 2043038857) * i7) - ((1499032267 * jc.am) * i6)) > ((ch.ab * -1966739019) * i10) + ((gl.aw * 2101877851) * i9)) {
                return false;
            }
            if (Math.abs(((1499032267 * jc.am) * i5) - (i7 * (-185772607 * cs.ae))) > (i10 * (1497686983 * et.at)) + ((gl.aw * 2101877851) * i8)) {
                return false;
            }
            if (Math.abs((i6 * (-185772607 * cs.ae)) - (i5 * (nb.aq * 2043038857))) > ((1497686983 * et.at) * i9) + ((ch.ab * -1966739019) * i8)) {
                return false;
            }
            return true;
        } catch (Throwable e) {
            throw ba.ad(e, "js.am(" + ')');
        }
    }
}
