package p000;

import java.util.Comparator;

/* compiled from: nj */
final class ng implements Comparator {
    public static final int ai = 18;

    ng() {
    }

    int ad(nh nhVar, nh nhVar2) {
        return nhVar.af(-1462247273).compareTo(nhVar2.af(-1462247273));
    }

    int af(nh nhVar, nh nhVar2, byte b) {
        try {
            return nhVar.af(-1462247273).compareTo(nhVar2.af(-1462247273));
        } catch (Throwable e) {
            throw ba.ad(e, "ng.af(" + ')');
        }
    }

    public int aa(Object obj, Object obj2) {
        return af((nh) obj, (nh) obj2, (byte) 31);
    }

    public int ag(Object obj, Object obj2) {
        return af((nh) obj, (nh) obj2, (byte) 5);
    }

    public int an(Object obj, Object obj2) {
        return af((nh) obj, (nh) obj2, (byte) 50);
    }

    public int compare(Object obj, Object obj2) {
        try {
            return af((nh) obj, (nh) obj2, (byte) 4);
        } catch (Throwable e) {
            throw ba.ad(e, "ng.compare(" + ')');
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
            throw ba.ad(e, "ng.equals(" + ')');
        }
    }
}
