package p000;

public class ct extends el {
    public static final int bi = 67;
    static final int db = 104;
    static int et;
    final boolean af;

    public ct(boolean z) {
        try {
            this.af = z;
        } catch (Throwable e) {
            throw ba.ad(e, "ct.<init>(" + ')');
        }
    }

    int ad(ez ezVar, ez ezVar2) {
        if (1372979651 * ezVar2.as == 270724794 * ezVar.as) {
            return am(ezVar, ezVar2, 19890349);
        }
        if (this.af) {
            return (ezVar.as * -533735695) - (ezVar2.as * -533735695);
        }
        return (ezVar2.as * -533735695) - (1148841067 * ezVar.as);
    }

    int af(ez ezVar, ez ezVar2, byte b) {
        try {
            if (ezVar2.as * -533735695 != ezVar.as * -533735695) {
                return this.af ? (ezVar.as * -533735695) - (ezVar2.as * -533735695) : (ezVar2.as * -533735695) - (ezVar.as * -533735695);
            } else {
                return am(ezVar, ezVar2, 618193673);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "ct.af(" + ')');
        }
    }

    public int aa(Object obj, Object obj2) {
        return af((ez) obj, (ez) obj2, (byte) 113);
    }

    public int ag(Object obj, Object obj2) {
        return af((ez) obj, (ez) obj2, (byte) 42);
    }

    public int an(Object obj, Object obj2) {
        return af((ez) obj, (ez) obj2, (byte) 106);
    }

    public int compare(Object obj, Object obj2) {
        try {
            return af((ez) obj, (ez) obj2, (byte) 107);
        } catch (Throwable e) {
            throw ba.ad(e, "ct.compare(" + ')');
        }
    }

    static final void fo(hy hyVar, boolean z, int i) {
        try {
            int i2 = 669823817 * hyVar.af;
            int i3 = (int) hyVar.fy;
            hyVar.ki();
            if (z) {
                cg.ag(i2, 1880211468);
            }
            for (kr krVar = (kr) client.lk.aa(); krVar != null; krVar = (kr) client.lk.ag()) {
                if (((long) i2) == ((krVar.fy >> 48) & 65535)) {
                    krVar.ki();
                }
            }
            ac ad = hv.ad(i3, 731679723);
            if (ad != null) {
                client.fk(ad, (byte) 68);
            }
            nq.ii.br(-2126365372);
            if (-1 != client.jy * 1704673651) {
                int i4 = client.jy * 1704673651;
                if (ao.aa(i4, (byte) -77)) {
                    ey.eh(en.ay[i4], 1, 1656291254);
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "ct.fo(" + ')');
        }
    }
}
