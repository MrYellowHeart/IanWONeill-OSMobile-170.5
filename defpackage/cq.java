package p000;

public abstract class cq extends kq {
    public int bo;

    protected abstract cl ac();

    protected abstract cl dh();

    protected abstract cl dn();

    protected abstract cl dx();

    protected abstract cl dy();

    protected cq() {
        try {
            this.bo = 1958156536;
        } catch (Throwable e) {
            throw ba.ad(e, "cq.<init>(" + ')');
        }
    }

    static ac fi(ac acVar, byte b) {
        try {
            int af = gj.af(ah.fy(acVar, -186960044), 1773673955);
            if (af == 0) {
                return null;
            }
            int i = 0;
            ac acVar2 = acVar;
            while (i < af) {
                acVar = hv.ad(acVar2.bt * -1008623461, 1158404998);
                if (acVar == null) {
                    return null;
                }
                i++;
                acVar2 = acVar;
            }
            return acVar2;
        } catch (Throwable e) {
            throw ba.ad(e, "cq.fi(" + ')');
        }
    }

    static String gg(String str, int i) {
        try {
            ju[] juVarArr = new ju[]{ju.ad, ju.af, ju.an, ju.aa, ju.ag, ju.ay};
            for (ju juVar : juVarArr) {
                if (-1 != juVar.ar * 1675619249 && str.startsWith(bo.af(juVar.ar * 1675619249, (byte) -31))) {
                    str = str.substring(Integer.toString(juVar.ar * 1675619249).length() + 6);
                    break;
                }
            }
            return str;
        } catch (Throwable e) {
            throw ba.ad(e, "cq.gg(" + ')');
        }
    }
}
