package p000;

import java.io.IOException;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class gj {
    static final int ad = 10;
    static int af = 1052760962;
    static final int aw = 4;
    static kh bm = null;
    static final int bp = 36;
    boolean aa;
    int ag;
    boolean an;
    LinkedHashMap ar;
    boolean as;
    String ay;

    public static int af(int i, int i2) {
        return (i >> 17) & 7;
    }

    gj() {
        try {
            this.ag = 1983339053;
            this.ay = null;
            this.as = false;
            this.ar = new LinkedHashMap();
            af(true, -1721255272);
        } catch (Throwable e) {
            throw ba.ad(e, "gj.<init>(" + ')');
        }
    }

    gj(ik ikVar) {
        boolean z = true;
        int i = 0;
        try {
            this.ag = 1983339053;
            this.ay = null;
            this.as = false;
            this.ar = new LinkedHashMap();
            if (ikVar == null || ikVar.af == null) {
                af(true, -1284981462);
                return;
            }
            int ao = ikVar.ao((byte) 0);
            if (ao < 0 || ao > -202152253 * af) {
                af(true, -1725372696);
                return;
            }
            if (ikVar.ao((byte) 0) == 1) {
                this.an = true;
            }
            if (ao > 1) {
                if (ikVar.ao((byte) 0) != 1) {
                    z = false;
                }
                this.aa = z;
            }
            if (ao > 3) {
                this.ag = ikVar.ao((byte) 0) * 1983339053;
            }
            if (ao > 2) {
                int ao2 = ikVar.ao((byte) 0);
                while (i < ao2) {
                    this.ar.put(Integer.valueOf(ikVar.al(237158285)), Integer.valueOf(ikVar.al(-364845006)));
                    i++;
                }
            }
            if (ao > 4) {
                this.ay = ikVar.bb((byte) 15);
            }
            if (ao > 5) {
                this.as = ikVar.bw(-569262966);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "gj.<init>(" + ')');
        }
    }

    void af(boolean z, int i) {
    }

    void ag(boolean z) {
    }

    void ay(boolean z) {
    }

    ik ad(int i) {
        int i2 = 1;
        try {
            String str;
            ik ikVar = new ik(100);
            ikVar.an(-202152253 * af, (byte) 31);
            ikVar.an(this.an ? 1 : 0, (byte) 31);
            if (!this.aa) {
                i2 = 0;
            }
            ikVar.an(i2, (byte) 31);
            ikVar.an(this.ag * 1775240613, (byte) 31);
            ikVar.an(this.ar.size(), (byte) 31);
            for (Entry entry : this.ar.entrySet()) {
                ikVar.ay(((Integer) entry.getKey()).intValue(), (short) 128);
                ikVar.ay(((Integer) entry.getValue()).intValue(), (short) 128);
            }
            if (this.ay != null) {
                str = this.ay;
            } else {
                str = "";
            }
            ikVar.aq(str, (byte) 46);
            ikVar.aj(this.as, (byte) 27);
            return ikVar;
        } catch (Throwable e) {
            throw ba.ad(e, "gj.ad(" + ')');
        }
    }

    ik ae() {
        int i;
        int i2 = 1;
        ik ikVar = new ik(100);
        ikVar.an(-202152253 * af, (byte) 31);
        if (this.an) {
            i = 1;
        } else {
            i = 0;
        }
        ikVar.an(i, (byte) 31);
        if (!this.aa) {
            i2 = 0;
        }
        ikVar.an(i2, (byte) 31);
        ikVar.an(this.ag * 1775240613, (byte) 31);
        ikVar.an(this.ar.size(), (byte) 31);
        for (Entry entry : this.ar.entrySet()) {
            ikVar.ay(((Integer) entry.getKey()).intValue(), (short) 128);
            ikVar.ay(((Integer) entry.getValue()).intValue(), (short) 128);
        }
        ikVar.aq(this.ay != null ? this.ay : "", (byte) 71);
        ikVar.aj(this.as, (byte) 60);
        return ikVar;
    }

    ik aj() {
        int i;
        String str;
        int i2 = 0;
        ik ikVar = new ik(100);
        ikVar.an(1500322570 * af, (byte) 31);
        if (this.an) {
            i = 1;
        } else {
            i = 0;
        }
        ikVar.an(i, (byte) 31);
        if (this.aa) {
            i2 = 1;
        }
        ikVar.an(i2, (byte) 31);
        ikVar.an(this.ag * 1775240613, (byte) 31);
        ikVar.an(this.ar.size(), (byte) 31);
        for (Entry entry : this.ar.entrySet()) {
            ikVar.ay(((Integer) entry.getKey()).intValue(), (short) 128);
            ikVar.ay(((Integer) entry.getValue()).intValue(), (short) 128);
        }
        if (this.ay != null) {
            str = this.ay;
        } else {
            str = "";
        }
        ikVar.aq(str, (byte) -34);
        ikVar.aj(this.as, (byte) 94);
        return ikVar;
    }

    ik ar() {
        String str;
        int i = 1;
        ik ikVar = new ik(505341262);
        ikVar.an(-1455738113 * af, (byte) 31);
        ikVar.an(this.an ? 1 : 0, (byte) 31);
        if (!this.aa) {
            i = 0;
        }
        ikVar.an(i, (byte) 31);
        ikVar.an(this.ag * 1775240613, (byte) 31);
        ikVar.an(this.ar.size(), (byte) 31);
        for (Entry entry : this.ar.entrySet()) {
            ikVar.ay(((Integer) entry.getKey()).intValue(), (short) 128);
            ikVar.ay(((Integer) entry.getValue()).intValue(), (short) 128);
        }
        if (this.ay != null) {
            str = this.ay;
        } else {
            str = "";
        }
        ikVar.aq(str, (byte) -81);
        ikVar.aj(this.as, (byte) 56);
        return ikVar;
    }

    ik as() {
        int i;
        String str;
        int i2 = 1;
        ik ikVar = new ik(100);
        ikVar.an(-202152253 * af, (byte) 31);
        if (this.an) {
            i = 1;
        } else {
            i = 0;
        }
        ikVar.an(i, (byte) 31);
        if (!this.aa) {
            i2 = 0;
        }
        ikVar.an(i2, (byte) 31);
        ikVar.an(this.ag * 307046175, (byte) 31);
        ikVar.an(this.ar.size(), (byte) 31);
        for (Entry entry : this.ar.entrySet()) {
            ikVar.ay(((Integer) entry.getKey()).intValue(), (short) 128);
            ikVar.ay(((Integer) entry.getValue()).intValue(), (short) 128);
        }
        if (this.ay != null) {
            str = this.ay;
        } else {
            str = "";
        }
        ikVar.aq(str, (byte) -93);
        ikVar.aj(this.as, (byte) 108);
        return ikVar;
    }

    static gj aq() {
        nw nwVar;
        gj gjVar;
        int i = 0;
        nw nwVar2 = null;
        gj gjVar2 = new gj();
        try {
            nwVar2 = kh.af("", client.as.as, false, -1834275597);
            byte[] bArr = new byte[((int) nwVar2.ag(2057608795))];
            while (i < bArr.length) {
                int ay = nwVar2.ay(bArr, i, bArr.length - i, (byte) 63);
                if (-1 == ay) {
                    throw new IOException();
                }
                i += ay;
            }
            gj gjVar3 = new gj(new ik(bArr));
            nwVar = nwVar2;
            gjVar = gjVar3;
        } catch (Exception e) {
            nwVar = nwVar2;
            gjVar = gjVar2;
        }
        if (nwVar != null) {
            try {
                nwVar.an(420907623);
            } catch (Exception e2) {
            }
        }
        return gjVar;
    }

    static void am() {
        nw nwVar = null;
        try {
            nwVar = kh.af("", client.as.as, true, 1576066127);
            ik ad = cs.oj.ad(-1996606121);
            nwVar.ad(ad.af, 0, ad.ad * 1867770025, 1959269856);
        } catch (Exception e) {
        }
        if (nwVar != null) {
            try {
                nwVar.aa(true, 2074797577);
            } catch (Exception e2) {
            }
        }
    }

    static void at() {
        nw nwVar = null;
        try {
            nwVar = kh.af("", client.as.as, true, -1703449305);
            ik ad = cs.oj.ad(-1996606121);
            nwVar.ad(ad.af, 0, ad.ad * -2126913811, 973947804);
        } catch (Exception e) {
        }
        if (nwVar != null) {
            try {
                nwVar.aa(true, 2074797577);
            } catch (Exception e2) {
            }
        }
    }

    public static void am(Collection collection, byte b) {
        try {
            collection.add(au.an);
            collection.add(au.aa);
        } catch (Throwable e) {
            throw ba.ad(e, "gj.am(" + ')');
        }
    }
}
