package p000;

public class ey implements Comparable {
    static final int ac = 300000;
    static final int av = 23;
    static long dt;
    String ad;
    String af;

    public ey(String str, nv nvVar) {
        String str2 = null;
        try {
            this.af = str;
            if (str != null) {
                int i = 0;
                int length = str.length();
                while (i < length && dc.an(str.charAt(i), 969497936)) {
                    i++;
                }
                int i2 = length;
                while (i2 > i && dc.an(str.charAt(i2 - 1), 237286540)) {
                    i2--;
                }
                length = i2 - i;
                if (length >= 1 && length <= jg.af(nvVar, -238266575)) {
                    StringBuilder stringBuilder = new StringBuilder(length);
                    for (length = i; length < i2; length++) {
                        char charAt = str.charAt(length);
                        if (aw.ad(charAt, 1059194077)) {
                            switch (charAt) {
                                case ' ':
                                case '-':
                                case '_':
                                case ' ':
                                    charAt = '_';
                                    break;
                                case '#':
                                case '[':
                                case ']':
                                    break;
                                case 'À':
                                case 'Á':
                                case 'Â':
                                case 'Ã':
                                case 'Ä':
                                case 'à':
                                case 'á':
                                case 'â':
                                case 'ã':
                                case 'ä':
                                    charAt = 'a';
                                    break;
                                case 'Ç':
                                case 'ç':
                                    charAt = 'c';
                                    break;
                                case 'È':
                                case 'É':
                                case 'Ê':
                                case 'Ë':
                                case 'è':
                                case 'é':
                                case 'ê':
                                case 'ë':
                                    charAt = 'e';
                                    break;
                                case 'Í':
                                case 'Î':
                                case 'Ï':
                                case 'í':
                                case 'î':
                                case 'ï':
                                    charAt = 'i';
                                    break;
                                case 'Ñ':
                                case 'ñ':
                                    charAt = 'n';
                                    break;
                                case 'Ò':
                                case 'Ó':
                                case 'Ô':
                                case 'Õ':
                                case 'Ö':
                                case 'ò':
                                case 'ó':
                                case 'ô':
                                case 'õ':
                                case 'ö':
                                    charAt = 'o';
                                    break;
                                case 'Ù':
                                case 'Ú':
                                case 'Û':
                                case 'Ü':
                                case 'ù':
                                case 'ú':
                                case 'û':
                                case 'ü':
                                    charAt = 'u';
                                    break;
                                case 'ß':
                                    charAt = 'b';
                                    break;
                                case 'ÿ':
                                case 'Ÿ':
                                    charAt = 'y';
                                    break;
                                default:
                                    charAt = Character.toLowerCase(charAt);
                                    break;
                            }
                            if (charAt != '\u0000') {
                                stringBuilder.append(charAt);
                            }
                        }
                    }
                    if (stringBuilder.length() != 0) {
                        str2 = stringBuilder.toString();
                    }
                }
            }
            this.ad = str2;
        } catch (Throwable e) {
            throw ba.ad(e, "ey.<init>(" + ')');
        }
    }

    public static boolean ay(int i, int i2) {
        try {
            return i >= ji.ax.ac * -1010613707 && i <= ji.au.ac * -1010613707;
        } catch (Throwable e) {
            throw ba.ad(e, "ey.ay(" + ')');
        }
    }

    public String aa() {
        return this.af;
    }

    public String af(int i) {
        try {
            return this.af;
        } catch (Throwable e) {
            throw ba.ad(e, "ey.af(" + ')');
        }
    }

    public String ag() {
        return this.af;
    }

    public String ay() {
        return this.af;
    }

    public boolean ad(int i) {
        try {
            return this.ad != null;
        } catch (Throwable e) {
            throw ba.ad(e, "ey.ad(" + ')');
        }
    }

    public boolean ar() {
        return this.ad != null;
    }

    public boolean as() {
        return this.ad != null;
    }

    public boolean cf(Object obj) {
        if (!(obj instanceof ey)) {
            return false;
        }
        ey eyVar = (ey) obj;
        if (this.ad == null) {
            if (eyVar.ad == null) {
                return true;
            }
            return false;
        } else if (eyVar.ad == null || hashCode() != eyVar.hashCode()) {
            return false;
        } else {
            return this.ad.equals(eyVar.ad);
        }
    }

    public boolean cz(Object obj) {
        if (!(obj instanceof ey)) {
            return false;
        }
        ey eyVar = (ey) obj;
        if (this.ad == null) {
            if (eyVar.ad == null) {
                return true;
            }
            return false;
        } else if (eyVar.ad == null || hashCode() != eyVar.hashCode()) {
            return false;
        } else {
            return this.ad.equals(eyVar.ad);
        }
    }

    public boolean equals(Object obj) {
        try {
            if (!(obj instanceof ey)) {
                return false;
            }
            ey eyVar = (ey) obj;
            if (this.ad == null) {
                if (eyVar.ad == null) {
                    return true;
                }
                return false;
            } else if (eyVar.ad == null) {
                return false;
            } else {
                if (hashCode() != eyVar.hashCode()) {
                    return false;
                }
                return this.ad.equals(eyVar.ad);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "ey.equals(" + ')');
        }
    }

    public int ce() {
        if (this.ad == null) {
            return 0;
        }
        return this.ad.hashCode();
    }

    public int cg() {
        if (this.ad == null) {
            return 0;
        }
        return this.ad.hashCode();
    }

    public int cr() {
        return this.ad == null ? 0 : this.ad.hashCode();
    }

    public int hashCode() {
        try {
            if (this.ad == null) {
                return 0;
            }
            return this.ad.hashCode();
        } catch (Throwable e) {
            throw ba.ad(e, "ey.hashCode(" + ')');
        }
    }

    public String ca() {
        return af(-1040860690);
    }

    public String cw() {
        return af(383725181);
    }

    public String cx() {
        return af(-522358446);
    }

    public String toString() {
        try {
            return af(-1266251861);
        } catch (Throwable e) {
            throw ba.ad(e, "ey.toString(" + ')');
        }
    }

    public int ae(ey eyVar) {
        if (this.ad == null) {
            return eyVar.ad == null ? 0 : 1;
        } else {
            if (eyVar.ad == null) {
                return -1;
            }
            return this.ad.compareTo(eyVar.ad);
        }
    }

    public int aj(ey eyVar) {
        if (this.ad == null) {
            if (eyVar.ad == null) {
                return 0;
            }
            return 1;
        } else if (eyVar.ad == null) {
            return -1;
        } else {
            return this.ad.compareTo(eyVar.ad);
        }
    }

    public int an(ey eyVar, int i) {
        try {
            if (this.ad == null) {
                if (eyVar.ad == null) {
                    return 0;
                }
                return 1;
            } else if (eyVar.ad == null) {
                return -1;
            } else {
                return this.ad.compareTo(eyVar.ad);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "ey.an(" + ')');
        }
    }

    public int am(Object obj) {
        return an((ey) obj, 1328707079);
    }

    public int aq(Object obj) {
        return an((ey) obj, 1383203278);
    }

    public int compareTo(Object obj) {
        try {
            return an((ey) obj, 1454567046);
        } catch (Throwable e) {
            throw ba.ad(e, "ey.compareTo(" + ')');
        }
    }

    static final void eh(ac[] acVarArr, int i, int i2) {
        for (ac acVar : acVarArr) {
            if (acVar != null) {
                hv hvVar;
                if (acVar.ao * -128421835 == 0) {
                    if (acVar.fo != null) {
                        ey.eh(acVar.fo, i, 1288682656);
                    }
                    hy hyVar = (hy) client.jk.af((long) (acVar.ah * 1172750087));
                    if (hyVar != null) {
                        int i3 = hyVar.af * 669823817;
                        if (ao.aa(i3, (byte) -53)) {
                            try {
                                ey.eh(en.ay[i3], i, 1498861810);
                            } catch (Throwable e) {
                                throw ba.ad(e, "ey.eh(" + ')');
                            }
                        }
                    }
                }
                if (i == 0 && acVar.ee != null) {
                    hvVar = new hv();
                    hvVar.an = acVar;
                    hvVar.af = acVar.ee;
                    cg.af(hvVar, -259588667);
                }
                if (1 == i && acVar.eb != null) {
                    if (acVar.ak * 2102445939 >= 0) {
                        ac ad = hv.ad(acVar.ah * 1172750087, 338598500);
                        if (ad != null) {
                            if (ad.fo != null) {
                                if (acVar.ak * 2102445939 < ad.fo.length) {
                                    if (acVar != ad.fo[acVar.ak * 2102445939]) {
                                    }
                                }
                            }
                        }
                    }
                    hvVar = new hv();
                    hvVar.an = acVar;
                    hvVar.af = acVar.eb;
                    cg.af(hvVar, 1393003611);
                }
            }
        }
    }

    public static boolean fl(byte b) {
        try {
            return hw.hq != null;
        } catch (Throwable e) {
            throw ba.ad(e, "ey.fl(" + ')');
        }
    }
}
