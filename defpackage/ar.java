package p000;

public class ar extends kq {
    public static ky ad = new ky(64, null);
    static kf af = null;
    public static short[] aj = null;
    public static final int ck = 82;
    static fx[] eh;
    public int an;

    ar() {
        try {
            this.an = 0;
        } catch (Throwable e) {
            throw ba.ad(e, "ar.<init>(" + ')');
        }
    }

    public static void ag(kf kfVar) {
        af = kfVar;
    }

    public static void ay(kf kfVar) {
        af = kfVar;
    }

    public static ar ae(int i) {
        ar arVar = (ar) ad.af((long) i);
        if (arVar == null) {
            byte[] an = af.an(5, i, -1368466524);
            arVar = new ar();
            if (an != null) {
                arVar.an(new ik(an), 1321533530);
            }
            ad.an(arVar, (long) i);
        }
        return arVar;
    }

    public static ar aj(int i) {
        ar arVar = (ar) ad.af((long) i);
        if (arVar == null) {
            byte[] an = af.an(5, i, -1693634537);
            arVar = new ar();
            if (an != null) {
                arVar.an(new ik(an), 340996386);
            }
            ad.an(arVar, (long) i);
        }
        return arVar;
    }

    public static ar ar(int i) {
        ar arVar = (ar) ad.af((long) i);
        if (arVar == null) {
            byte[] an = af.an(5, i, 557414758);
            arVar = new ar();
            if (an != null) {
                arVar.an(new ik(an), -1879054124);
            }
            ad.an(arVar, (long) i);
        }
        return arVar;
    }

    public static ar as(int i) {
        ar arVar = (ar) ad.af((long) i);
        if (arVar == null) {
            byte[] an = af.an(5, i, 111680344);
            arVar = new ar();
            if (an != null) {
                arVar.an(new ik(an), 1599766761);
            }
            ad.an(arVar, (long) i);
        }
        return arVar;
    }

    void ab(ik ikVar) {
        while (true) {
            int ao = ikVar.ao((byte) 0);
            if (ao != 0) {
                aa(ikVar, ao, 602919278);
            } else {
                return;
            }
        }
    }

    void am(ik ikVar) {
        while (true) {
            int ao = ikVar.ao((byte) 0);
            if (ao != 0) {
                aa(ikVar, ao, 18809773);
            } else {
                return;
            }
        }
    }

    void an(ik ikVar, int i) {
        while (true) {
            try {
                int ao = ikVar.ao((byte) 0);
                if (ao != 0) {
                    aa(ikVar, ao, 223784542);
                } else {
                    return;
                }
            } catch (Throwable e) {
                throw ba.ad(e, "ar.an(" + ')');
            }
        }
    }

    void aq(ik ikVar) {
        while (true) {
            int ao = ikVar.ao((byte) 0);
            if (ao != 0) {
                aa(ikVar, ao, 288161150);
            } else {
                return;
            }
        }
    }

    void at(ik ikVar) {
        while (true) {
            int ao = ikVar.ao((byte) 0);
            if (ao != 0) {
                aa(ikVar, ao, 871089046);
            } else {
                return;
            }
        }
    }

    void aa(ik ikVar, int i, int i2) {
        if (2 == i) {
            try {
                this.an = ikVar.au(-1853432963) * -1067956967;
            } catch (Throwable e) {
                throw ba.ad(e, "ar.aa(" + ')');
            }
        }
    }

    void ai(ik ikVar, int i) {
        if (2 == i) {
            this.an = ikVar.au(-323103808) * -986706145;
        }
    }

    void aw(ik ikVar, int i) {
        if (2 == i) {
            this.an = ikVar.au(-1926619371) * -1067956967;
        }
    }

    static boolean bj(int i, int i2) {
        return i == 57 || i == 58 || i == 1007 || 25 == i || 30 == i;
    }

    static String fw(String str, boolean z, int i) {
        String str2;
        if (z) {
            try {
                str2 = "https://";
            } catch (Throwable e) {
                throw ba.ad(e, "ar.fw(" + ')');
            }
        }
        str2 = "http://";
        if (client.ay * 1902364993 == 1) {
            str = str + "-wtrc";
        } else if (client.ay * 1902364993 == 2) {
            str = str + "-wtqa";
        } else if (client.ay * 1902364993 == 3) {
            str = str + "-wtwip";
        } else if (client.ay * 1902364993 == 5) {
            str = str + "-wti";
        } else if (client.ay * 1902364993 == 4) {
            str = "local";
        }
        String str3 = "";
        if (client.at != null) {
            str3 = "/p=" + client.at;
        }
        return str2 + str + "." + "runescape.com" + "/l=" + (-1387037251 * client.aq) + "/a=" + (1107417901 * mi.ab) + str3 + "/";
    }
}
