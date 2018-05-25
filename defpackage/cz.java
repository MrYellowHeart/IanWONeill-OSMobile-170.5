package p000;

public class cz extends el {
    static final int ar = 4;
    static final int az = 17;
    static kh cc;
    static int fg;
    static int pi;
    final boolean af;

    public cz(boolean z) {
        try {
            this.af = z;
        } catch (Throwable e) {
            throw ba.ad(e, "cz.<init>(" + ')');
        }
    }

    int ad(ez ezVar, ez ezVar2) {
        if (ezVar.ag * -1498276099 == client.an * -1304916389 && ezVar2.ag * -1161455169 == client.an * -1304916389) {
            return this.af ? (725526915 * ezVar.ay) - (ezVar2.ay * 2046794799) : (ezVar2.ay * 2046794799) - (ezVar.ay * -1679865715);
        } else {
            return am(ezVar, ezVar2, 1246098068);
        }
    }

    int af(ez ezVar, ez ezVar2, int i) {
        try {
            if (ezVar.ag * -1161455169 == client.an * -1304916389 && ezVar2.ag * -1161455169 == client.an * -1304916389) {
                return this.af ? (ezVar.ay * 2046794799) - (ezVar2.ay * 2046794799) : (ezVar2.ay * 2046794799) - (ezVar.ay * 2046794799);
            } else {
                return am(ezVar, ezVar2, 700789352);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "cz.af(" + ')');
        }
    }

    int as(ez ezVar, ez ezVar2) {
        if (ezVar.ag * -1161455169 != -1566473992 * client.an || ezVar2.ag * 1979744621 != client.an * -1304916389) {
            return am(ezVar, ezVar2, 728258649);
        }
        if (this.af) {
            return (1666786459 * ezVar.ay) - (-108773822 * ezVar2.ay);
        }
        return (-676320821 * ezVar2.ay) - (ezVar.ay * -466580549);
    }

    int ay(ez ezVar, ez ezVar2) {
        if (ezVar.ag * -678832347 == client.an * -1304916389 && ezVar2.ag * -1161455169 == client.an * -1304916389) {
            return this.af ? (89622 * ezVar.ay) - (ezVar2.ay * 2046794799) : (ezVar2.ay * 2046794799) - (ezVar.ay * 1633588183);
        } else {
            return am(ezVar, ezVar2, 1842412636);
        }
    }

    public int aa(Object obj, Object obj2) {
        return af((ez) obj, (ez) obj2, -1849596552);
    }

    public int ag(Object obj, Object obj2) {
        return af((ez) obj, (ez) obj2, -1403571357);
    }

    public int an(Object obj, Object obj2) {
        return af((ez) obj, (ez) obj2, 584729270);
    }

    public int compare(Object obj, Object obj2) {
        try {
            return af((ez) obj, (ez) obj2, -1849795422);
        } catch (Throwable e) {
            throw ba.ad(e, "cz.compare(" + ')');
        }
    }

    static final void aj(String str, byte b) {
        try {
            ax.af(30, "", str, 1719729534);
        } catch (Throwable e) {
            throw ba.ad(e, "cz.aj(" + ')');
        }
    }

    public static boolean aj(char c, int i) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    public static int aw(int i, int i2) {
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        return 0;
    }

    static void ct(int i) {
        try {
            if (client.hh) {
                kf.cu(gf.ho, false, 2133224411);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "cz.ct(" + ')');
        }
    }
}
