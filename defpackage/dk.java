package p000;

public class dk {
    public static final int aa = 12;
    public static final int ad = 6;
    public static final int af = 9;
    public static final int ag = 1;
    public static final int am = 11;
    public static final int ar = 100;
    public static final int ay = 5;
    static final int bo = 58;
    static int no;

    public static ba af(kf kfVar, kf kfVar2, int i, boolean z, byte b) {
        Object obj = 1;
        try {
            int[] ab = kfVar.ab(i, -94148844);
            for (int aq : ab) {
                int aq2;
                byte[] aq3 = kfVar.aq(i, aq2, 1820509216);
                if (aq3 == null) {
                    obj = null;
                } else {
                    aq2 = (aq3[1] & 255) | ((aq3[0] & 255) << 8);
                    if (z) {
                        aq3 = kfVar2.aq(0, aq2, -496997082);
                    } else {
                        aq3 = kfVar2.aq(aq2, 0, 1714449212);
                    }
                    if (aq3 == null) {
                        obj = null;
                    }
                }
            }
            if (obj == null) {
                return null;
            }
            try {
                return new ba(kfVar, kfVar2, i, z);
            } catch (Exception e) {
                return null;
            }
        } catch (Throwable e2) {
            throw ba.ad(e2, "dk.af(" + ')');
        }
    }

    dk() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ba.ad(e, "dk.<init>(" + ')');
        }
    }

    public static boolean af(kf kfVar, kf kfVar2, kf kfVar3, nx nxVar, int i) {
        try {
            mf.af = kfVar;
            mf.ad = kfVar2;
            mf.an = kfVar3;
            mf.aa = nxVar;
            return true;
        } catch (Throwable e) {
            throw ba.ad(e, "dk.af(" + ')');
        }
    }

    public static final void aj(int i) {
        try {
            cs.an = false;
            cs.ai = 0;
        } catch (Throwable e) {
            throw ba.ad(e, "dk.aj(" + ')');
        }
    }
}
