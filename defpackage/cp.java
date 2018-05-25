package p000;

public class cp extends el {
    static final int aa = 7169111;
    static final int ak = 20;
    static final int bc = 2;
    static final int bq = 57;
    final boolean af;

    public cp(boolean z) {
        try {
            this.af = z;
        } catch (Throwable e) {
            throw ba.ad(e, "cp.<init>(" + ')');
        }
    }

    int ad(ez ezVar, ez ezVar2) {
        if (1575101184 * ezVar2.ag != ezVar.ag * 554984567) {
            return this.af ? (1080317286 * ezVar.ag) - (ezVar2.ag * -1161455169) : (ezVar2.ag * -1161455169) - (702193134 * ezVar.ag);
        } else {
            return am(ezVar, ezVar2, 1721257902);
        }
    }

    int af(ez ezVar, ez ezVar2, byte b) {
        try {
            if (ezVar2.ag * -1161455169 == ezVar.ag * -1161455169) {
                return am(ezVar, ezVar2, 157260329);
            }
            if (this.af) {
                return (ezVar.ag * -1161455169) - (ezVar2.ag * -1161455169);
            }
            return (ezVar2.ag * -1161455169) - (ezVar.ag * -1161455169);
        } catch (Throwable e) {
            throw ba.ad(e, "cp.af(" + ')');
        }
    }

    public static void af(kf kfVar, int i) {
        try {
            am.af = kfVar;
            lh.ad = new am[kfVar.aw(1, 1418373798)];
            for (int i2 = 0; i2 < lh.ad.length; i2++) {
                byte[] an = am.af.an(1, i2, -2141732547);
                lh.ad[i2] = new am();
                if (an != null) {
                    lh.ad[i2].aa(new ik(an), i2, (byte) 116);
                }
                lh.ad[i2].an(-2037890695);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "cp.af(" + ')');
        }
    }

    public int aa(Object obj, Object obj2) {
        return af((ez) obj, (ez) obj2, (byte) 17);
    }

    public int ag(Object obj, Object obj2) {
        return af((ez) obj, (ez) obj2, (byte) 90);
    }

    public int an(Object obj, Object obj2) {
        return af((ez) obj, (ez) obj2, (byte) 124);
    }

    public int compare(Object obj, Object obj2) {
        try {
            return af((ez) obj, (ez) obj2, (byte) 16);
        } catch (Throwable e) {
            throw ba.ad(e, "cp.compare(" + ')');
        }
    }
}
