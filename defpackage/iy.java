package p000;

import java.util.HashMap;

public class iy {
    static final int ap = 128;
    static final int as = 64;

    static {
        HashMap hashMap = new HashMap();
    }

    iy() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ba.ad(e, "iy.<init>(" + ')');
        }
    }

    public static ix ad(ix[] ixVarArr, int i) {
        for (ix ixVar : ixVarArr) {
            if (i == ixVar.af(1092885148)) {
                return ixVar;
            }
        }
        return null;
    }

    public static ix an(ix[] ixVarArr, int i) {
        for (ix ixVar : ixVarArr) {
            if (i == ixVar.af(1331572792)) {
                return ixVar;
            }
        }
        return null;
    }

    static String an(kp kpVar, int i, String str, byte b) {
        if (kpVar == null) {
            return str;
        }
        try {
            ki kiVar = (ki) kpVar.af((long) i);
            return kiVar != null ? (String) kiVar.af : str;
        } catch (Throwable e) {
            throw ba.ad(e, "iy.an(" + ')');
        }
    }
}
