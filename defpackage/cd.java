package p000;

import java.util.Arrays;

public class cd implements cy {
    static int nu = 0;
    static final int pw = -2;
    int aa;
    kg ad;
    ck[] af;
    double ag;
    int an;
    kf as;
    int ay;

    public cd(kf kfVar, kf kfVar2, int i, double d, int i2) {
        try {
            this.ad = new kg();
            this.aa = 0;
            this.ag = 1.0d;
            this.ay = -1596671104;
            this.as = kfVar2;
            this.an = 403369223 * i;
            this.aa = -1274697397 * this.an;
            this.ag = d;
            this.ay = 658614647 * i2;
            int[] ab = kfVar.ab(0, 696681440);
            int length = ab.length;
            this.af = new ck[kfVar.aw(0, -203397386)];
            for (int i3 = 0; i3 < length; i3++) {
                this.af[ab[i3]] = new ck(new ik(kfVar.an(0, ab[i3], -527069950)));
            }
        } catch (Throwable e) {
            throw ba.ad(e, "cd.<init>(" + ')');
        }
    }

    public int ac(int i) {
        try {
            ck[] ckVarArr = this.af;
            int i2 = 0;
            int i3 = 0;
            for (ck ckVar : ckVarArr) {
                if (!(ckVar == null || ckVar.as == null)) {
                    i3 += ckVar.as.length;
                    int[] iArr = ckVar.as;
                    for (int ay : iArr) {
                        if (this.as.ay(ay, 16777472)) {
                            i2++;
                        }
                    }
                }
            }
            if (i3 == 0) {
                return 0;
            }
            return (i2 * 100) / i3;
        } catch (Throwable e) {
            throw ba.ad(e, "cd.ac(" + ')');
        }
    }

    public int bb() {
        ck[] ckVarArr = this.af;
        int i = 0;
        int i2 = 0;
        for (ck ckVar : ckVarArr) {
            if (!(ckVar == null || ckVar.as == null)) {
                int length = ckVar.as.length + i2;
                int[] iArr = ckVar.as;
                i2 = i;
                for (int ay : iArr) {
                    if (this.as.ay(ay, 16777472)) {
                        i2++;
                    }
                }
                i = i2;
                i2 = length;
            }
        }
        if (i2 == 0) {
            return 0;
        }
        return (i * 100) / i2;
    }

    public int bc() {
        ck[] ckVarArr = this.af;
        int i = 0;
        int i2 = 0;
        for (ck ckVar : ckVarArr) {
            if (!(ckVar == null || ckVar.as == null)) {
                i2 += ckVar.as.length;
                int[] iArr = ckVar.as;
                int i3 = 0;
                while (i3 < iArr.length) {
                    int i4;
                    if (this.as.ay(iArr[i3], 16777472)) {
                        i4 = i + 1;
                    } else {
                        i4 = i;
                    }
                    i3++;
                    i = i4;
                }
            }
        }
        if (i2 == 0) {
            return 0;
        }
        return (i * 100) / i2;
    }

    public int bz() {
        ck[] ckVarArr = this.af;
        int i = 0;
        int i2 = 0;
        for (ck ckVar : ckVarArr) {
            if (!(ckVar == null || ckVar.as == null)) {
                i2 += ckVar.as.length;
                int[] iArr = ckVar.as;
                int i3 = 0;
                while (i3 < iArr.length) {
                    int i4;
                    if (this.as.ay(iArr[i3], 16777472)) {
                        i4 = i + 1;
                    } else {
                        i4 = i;
                    }
                    i3++;
                    i = i4;
                }
            }
        }
        if (i2 == 0) {
            return 0;
        }
        return (-1793323435 * i) / i2;
    }

    public static ah af(int i, int i2) {
        try {
            ah ahVar = (ah) ah.aa.af((long) i);
            if (ahVar == null) {
                byte[] an = ah.af.an(12, i, -1321588524);
                ahVar = new ah();
                if (an != null) {
                    ahVar.ad(new ik(an), (byte) -18);
                }
                ahVar.aa((byte) -37);
                ah.aa.an(ahVar, (long) i);
            }
            return ahVar;
        } catch (Throwable e) {
            throw ba.ad(e, "cd.af(" + ')');
        }
    }

    public void al(double d) {
        try {
            this.ag = d;
            ap(1340227741);
        } catch (Throwable e) {
            throw ba.ad(e, "cd.al(" + ')');
        }
    }

    public void bf(double d) {
        this.ag = d;
        ap(1340227741);
    }

    public void bg(double d) {
        this.ag = d;
        ap(1340227741);
    }

    public void bh(double d) {
        this.ag = d;
        ap(1340227741);
    }

    public ck af(int i, byte b) {
        try {
            return this.af[i];
        } catch (Throwable e) {
            throw ba.ad(e, "cd.af(" + ')');
        }
    }

    public ck aj(int i) {
        return this.af[i];
    }

    public ck m30ar(int i) {
        return this.af[i];
    }

    public int[][] ad(int i) {
        try {
            int[][] iArr = new int[this.af.length][];
            for (int i2 = 0; i2 < this.af.length; i2++) {
                ck ckVar = this.af[i2];
                if (ckVar != null) {
                    if (!ckVar.af(this.ag, this.ay * -66715577, this.as)) {
                        return (int[][]) null;
                    }
                    iArr[i2] = Arrays.copyOf(ckVar.aw, ckVar.aw.length);
                }
            }
            return iArr;
        } catch (Throwable e) {
            throw ba.ad(e, "cd.ad(" + ')');
        }
    }

    public int[][] ae() {
        int[][] iArr = new int[this.af.length][];
        for (int i = 0; i < this.af.length; i++) {
            ck ckVar = this.af[i];
            if (ckVar != null) {
                if (!ckVar.af(this.ag, this.ay * 1244945837, this.as)) {
                    return (int[][]) null;
                }
                iArr[i] = Arrays.copyOf(ckVar.aw, ckVar.aw.length);
            }
        }
        return iArr;
    }

    public int[] am(int i) {
        kd kdVar = this.af[i];
        if (kdVar != null) {
            if (kdVar.aw != null) {
                this.ad.an(kdVar);
                kdVar.ai = true;
                return kdVar.aw;
            } else if (kdVar.af(this.ag, 575145973 * this.ay, this.as)) {
                if (this.aa * 761446085 == 0) {
                    ((ck) this.ad.ay()).ad();
                } else {
                    this.aa -= 2060735521;
                }
                this.ad.an(kdVar);
                kdVar.ai = true;
                return kdVar.aw;
            }
        }
        return null;
    }

    public int[] an(int i, short s) {
        try {
            kd kdVar = this.af[i];
            if (kdVar != null) {
                if (kdVar.aw != null) {
                    this.ad.an(kdVar);
                    kdVar.ai = true;
                    return kdVar.aw;
                } else if (kdVar.af(this.ag, -66715577 * this.ay, this.as)) {
                    if (this.aa * 761446085 == 0) {
                        ((ck) this.ad.ay()).ad();
                    } else {
                        this.aa -= -825225203;
                    }
                    this.ad.an(kdVar);
                    kdVar.ai = true;
                    return kdVar.aw;
                }
            }
            return null;
        } catch (Throwable e) {
            throw ba.ad(e, "cd.an(" + ')');
        }
    }

    public int[] aq(int i) {
        kd kdVar = this.af[i];
        if (kdVar != null) {
            if (kdVar.aw != null) {
                this.ad.an(kdVar);
                kdVar.ai = true;
                return kdVar.aw;
            } else if (kdVar.af(this.ag, 1367839723 * this.ay, this.as)) {
                if (this.aa * 761446085 == 0) {
                    ((ck) this.ad.ay()).ad();
                } else {
                    this.aa -= -825225203;
                }
                this.ad.an(kdVar);
                kdVar.ai = true;
                return kdVar.aw;
            }
        }
        return null;
    }

    public int[] at(int i) {
        kd kdVar = this.af[i];
        if (kdVar != null) {
            if (kdVar.aw != null) {
                this.ad.an(kdVar);
                kdVar.ai = true;
                return kdVar.aw;
            } else if (kdVar.af(this.ag, 144912531 * this.ay, this.as)) {
                if (this.aa * 761446085 == 0) {
                    ((ck) this.ad.ay()).ad();
                } else {
                    this.aa -= 2074573276;
                }
                this.ad.an(kdVar);
                kdVar.ai = true;
                return kdVar.aw;
            }
        }
        return null;
    }

    public int aa(int i, int i2) {
        try {
            if (this.af[i] != null) {
                return this.af[i].ag;
            }
            return 0;
        } catch (Throwable e) {
            throw ba.ad(e, "cd.aa(" + ')');
        }
    }

    public int ab(int i) {
        return this.af[i] != null ? this.af[i].ag : 0;
    }

    public int ai(int i) {
        if (this.af[i] != null) {
            return this.af[i].ag;
        }
        return 0;
    }

    public int aw(int i) {
        return this.af[i] != null ? this.af[i].ag : 0;
    }

    public boolean ag(int i, int i2) {
        try {
            return this.af[i].ay;
        } catch (Throwable e) {
            throw ba.ad(e, "cd.ag(" + ')');
        }
    }

    public boolean ah(int i) {
        return this.af[i].ay;
    }

    public boolean az(int i) {
        return this.af[i].ay;
    }

    public boolean ak(int i) {
        return -66715577 * this.ay == -1820225788;
    }

    public boolean ao(int i) {
        return -66715577 * this.ay == 1811147995;
    }

    public boolean ax(int i) {
        return -1335814417 * this.ay == 1843933980;
    }

    public boolean ay(int i, int i2) {
        try {
            return -66715577 * this.ay == 64;
        } catch (Throwable e) {
            throw ba.ad(e, "cd.ay(" + ')');
        }
    }

    public int as(byte b) {
        try {
            return this.af.length;
        } catch (Throwable e) {
            throw ba.ad(e, "cd.as(" + ')');
        }
    }

    public int au() {
        return this.af.length;
    }

    public int av() {
        return this.af.length;
    }

    public void ap(int i) {
        int i2 = 0;
        while (i2 < this.af.length) {
            try {
                if (this.af[i2] != null) {
                    this.af[i2].ad();
                }
                i2++;
            } catch (Throwable e) {
                throw ba.ad(e, "cd.ap(" + ')');
            }
        }
        this.ad = new kg();
        this.aa = this.an * -1274697397;
    }

    public void bp() {
        for (int i = 0; i < this.af.length; i++) {
            if (this.af[i] != null) {
                this.af[i].ad();
            }
        }
        this.ad = new kg();
        this.aa = this.an * -1365845573;
    }

    public void bv() {
        for (int i = 0; i < this.af.length; i++) {
            if (this.af[i] != null) {
                this.af[i].ad();
            }
        }
        this.ad = new kg();
        this.aa = this.an * 1669458344;
    }

    public void bx() {
        for (int i = 0; i < this.af.length; i++) {
            if (this.af[i] != null) {
                this.af[i].ad();
            }
        }
        this.ad = new kg();
        this.aa = this.an * -1274697397;
    }

    public void bt(int i) {
        for (ck ckVar : this.af) {
            if (!(ckVar == null || ckVar.aq == 0)) {
                ckVar.an(i);
            }
        }
    }

    public void bw(int i, int i2) {
        int i3 = 0;
        while (i3 < this.af.length) {
            try {
                ck ckVar = this.af[i3];
                if (!(ckVar == null || ckVar.aq == 0)) {
                    ckVar.an(i);
                }
                i3++;
            } catch (Throwable e) {
                throw ba.ad(e, "cd.bw(" + ')');
            }
        }
    }

    static hq ar(int i) {
        try {
            hq.as = 0;
            return ek.aj(2144713019);
        } catch (Throwable e) {
            throw ba.ad(e, "cd.ar(" + ')');
        }
    }

    static String ea(String str, ac acVar, int i) {
        try {
            if (str.indexOf("%") != -1) {
                for (int i2 = 1; i2 <= 5; i2++) {
                    while (true) {
                        int indexOf = str.indexOf("%" + i2);
                        if (-1 == indexOf) {
                            break;
                        }
                        String num;
                        String substring = str.substring(0, indexOf);
                        int ee = cj.ee(acVar, i2 - 1, 192066966);
                        if (ee < 999999999) {
                            num = Integer.toString(ee);
                        } else {
                            num = "*";
                        }
                        str = substring + num + str.substring(indexOf + 2);
                    }
                }
            }
            return str;
        } catch (Throwable e) {
            throw ba.ad(e, "cd.ea(" + ')');
        }
    }
}
