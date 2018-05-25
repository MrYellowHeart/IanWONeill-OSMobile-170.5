package p000;

import java.util.Comparator;

public class lo implements Comparator {
    final boolean af;

    public lo(boolean z) {
        try {
            this.af = z;
        } catch (Throwable e) {
            throw ba.ad(e, "lo.<init>(" + ')');
        }
    }

    int ad(et etVar, et etVar2) {
        return this.af ? etVar.ad(etVar2, (byte) 0) : etVar2.ad(etVar, (byte) 0);
    }

    int af(et etVar, et etVar2, int i) {
        try {
            return this.af ? etVar.ad(etVar2, (byte) 0) : etVar2.ad(etVar, (byte) 0);
        } catch (Throwable e) {
            throw ba.ad(e, "lo.af(" + ')');
        }
    }

    int ay(et etVar, et etVar2) {
        return this.af ? etVar.ad(etVar2, (byte) 0) : etVar2.ad(etVar, (byte) 0);
    }

    public int aa(Object obj, Object obj2) {
        return af((et) obj, (et) obj2, 947552998);
    }

    public int ag(Object obj, Object obj2) {
        return af((et) obj, (et) obj2, -34578601);
    }

    public int an(Object obj, Object obj2) {
        return af((et) obj, (et) obj2, 1297213155);
    }

    public int compare(Object obj, Object obj2) {
        try {
            return af((et) obj, (et) obj2, -103098222);
        } catch (Throwable e) {
            throw ba.ad(e, "lo.compare(" + ')');
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
            throw ba.ad(e, "lo.equals(" + ')');
        }
    }
}
