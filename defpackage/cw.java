package p000;

public class cw extends el {
    public static final String an = "rw";
    static final int bp = 500;
    public static final int cn = 81;
    static lr dx;
    final boolean af;

    public cw(boolean z) {
        try {
            this.af = z;
        } catch (Throwable e) {
            throw ba.ad(e, "cw.<init>(" + ')');
        }
    }

    int ad(ez ezVar, ez ezVar2) {
        int i = 1;
        if (ezVar.ag * -1924996105 != 0) {
            if (-1161455169 * ezVar2.ag == 0) {
                return this.af ? -1 : 1;
            }
        } else if (1953567256 * ezVar2.ag != 0) {
            if (!this.af) {
                i = -1;
            }
            return i;
        }
        return am(ezVar, ezVar2, 1092303063);
    }

    int af(ez ezVar, ez ezVar2, int i) {
        int i2 = 1;
        try {
            if (ezVar.ag * -1161455169 != 0) {
                if (ezVar2.ag * -1161455169 == 0) {
                    if (this.af) {
                        return -1;
                    }
                    return 1;
                }
            } else if (ezVar2.ag * -1161455169 != 0) {
                if (!this.af) {
                    i2 = -1;
                }
                return i2;
            }
            return am(ezVar, ezVar2, 1975169480);
        } catch (Throwable e) {
            throw ba.ad(e, "cw.af(" + ')');
        }
    }

    int ay(ez ezVar, ez ezVar2) {
        int i = 1;
        if (ezVar.ag * -151458621 != 0) {
            if (343325295 * ezVar2.ag == 0) {
                if (this.af) {
                    return -1;
                }
                return 1;
            }
        } else if (-469815318 * ezVar2.ag != 0) {
            if (!this.af) {
                i = -1;
            }
            return i;
        }
        return am(ezVar, ezVar2, 1300996330);
    }

    public int aa(Object obj, Object obj2) {
        return af((ez) obj, (ez) obj2, 1103198973);
    }

    public int ag(Object obj, Object obj2) {
        return af((ez) obj, (ez) obj2, 1103198973);
    }

    public int an(Object obj, Object obj2) {
        return af((ez) obj, (ez) obj2, 1103198973);
    }

    public int compare(Object obj, Object obj2) {
        try {
            return af((ez) obj, (ez) obj2, 1103198973);
        } catch (Throwable e) {
            throw ba.ad(e, "cw.compare(" + ')');
        }
    }

    static int ay(hq hqVar, hq hqVar2, int i, boolean z, int i2, boolean z2, int i3) {
        try {
            int as = bm.as(hqVar, hqVar2, i, z, (byte) 49);
            if (as != 0) {
                if (z) {
                    return -as;
                }
                return as;
            } else if (-1 == i2) {
                return 0;
            } else {
                as = bm.as(hqVar, hqVar2, i2, z2, (byte) 103);
                if (z2) {
                    return -as;
                }
                return as;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "cw.ay(" + ')');
        }
    }
}
