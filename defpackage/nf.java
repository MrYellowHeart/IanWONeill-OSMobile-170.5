package p000;

import java.util.Comparator;

/* compiled from: nj */
final class nf implements Comparator {
    public static int aa;
    static kf af;

    nf() {
    }

    int ad(nh nhVar, nh nhVar2) {
        if (nhVar.an.aa * -672413105 < nhVar2.an.aa * -672413105) {
            return -1;
        }
        return nhVar.an.aa * -672413105 == nhVar2.an.aa * -672413105 ? 0 : 1;
    }

    int af(nh nhVar, nh nhVar2, byte b) {
        try {
            if (nhVar.an.aa * -672413105 < nhVar2.an.aa * -672413105) {
                return -1;
            }
            return nhVar.an.aa * -672413105 == nhVar2.an.aa * -672413105 ? 0 : 1;
        } catch (Throwable e) {
            throw ba.ad(e, "nf.af(" + ')');
        }
    }

    int ay(nh nhVar, nh nhVar2) {
        if (nhVar.an.aa * -672413105 < nhVar2.an.aa * -672413105) {
            return -1;
        }
        return nhVar.an.aa * -672413105 == nhVar2.an.aa * -672413105 ? 0 : 1;
    }

    public int aa(Object obj, Object obj2) {
        return af((nh) obj, (nh) obj2, (byte) 9);
    }

    public int ag(Object obj, Object obj2) {
        return af((nh) obj, (nh) obj2, (byte) 9);
    }

    public int an(Object obj, Object obj2) {
        return af((nh) obj, (nh) obj2, (byte) 9);
    }

    public int compare(Object obj, Object obj2) {
        try {
            return af((nh) obj, (nh) obj2, (byte) 9);
        } catch (Throwable e) {
            throw ba.ad(e, "nf.compare(" + ')');
        }
    }

    public boolean cf(Object obj) {
        return super.equals(obj);
    }

    public boolean cz(Object obj) {
        return super.equals(obj);
    }

    public boolean equals(Object obj) {
        try {
            return super.equals(obj);
        } catch (Throwable e) {
            throw ba.ad(e, "nf.equals(" + ')');
        }
    }
}
