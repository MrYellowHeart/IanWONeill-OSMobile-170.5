package p000;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class dt extends ew {
    static kh cn = null;
    static final int pk = 2;
    HashSet ad;
    HashSet af;
    List an;

    dt() {
        try {
        } catch (Throwable e) {
            throw ba.ad(e, "dt.<init>(" + ')');
        }
    }

    void aa(ik ikVar, ik ikVar2, ik ikVar3, int i, boolean z) {
        int i2;
        int i3 = 0;
        aj(ikVar, i, (byte) 1);
        int au = ikVar3.au(-1557708531);
        this.af = new HashSet(au);
        for (i2 = 0; i2 < au; i2++) {
            dy dyVar = new dy();
            try {
                dyVar.av(ikVar2, ikVar3, -660168861);
                this.af.add(dyVar);
            } catch (IllegalStateException e) {
            }
        }
        i2 = ikVar3.au(826008909);
        this.ad = new HashSet(i2);
        while (i3 < i2) {
            dw dwVar = new dw();
            try {
                dwVar.av(ikVar2, ikVar3, -753941423);
                this.ad.add(dwVar);
            } catch (IllegalStateException e2) {
            }
            i3++;
        }
        ad(ikVar2, z, (byte) -94);
    }

    void af(ik ikVar, ik ikVar2, ik ikVar3, int i, boolean z, byte b) {
        int i2 = 0;
        aj(ikVar, i, (byte) 1);
        int au = ikVar3.au(-903481480);
        this.af = new HashSet(au);
        int i3 = 0;
        while (i3 < au) {
            dy dyVar = new dy();
            try {
                dyVar.av(ikVar2, ikVar3, 1590812456);
            } catch (IllegalStateException e) {
            }
            try {
                this.af.add(dyVar);
                i3++;
            } catch (Throwable e2) {
                throw ba.ad(e2, "dt.af(" + ')');
            }
        }
        i3 = ikVar3.au(-275251364);
        this.ad = new HashSet(i3);
        while (i2 < i3) {
            dw dwVar = new dw();
            try {
                dwVar.av(ikVar2, ikVar3, -1461724716);
                this.ad.add(dwVar);
            } catch (IllegalStateException e3) {
            }
            i2++;
        }
        ad(ikVar2, z, (byte) -22);
    }

    void ag(ik ikVar, ik ikVar2, ik ikVar3, int i, boolean z) {
        int i2;
        int i3 = 0;
        aj(ikVar, i, (byte) 1);
        int au = ikVar3.au(-1671252597);
        this.af = new HashSet(au);
        for (i2 = 0; i2 < au; i2++) {
            dy dyVar = new dy();
            try {
                dyVar.av(ikVar2, ikVar3, 1097614293);
                this.af.add(dyVar);
            } catch (IllegalStateException e) {
            }
        }
        i2 = ikVar3.au(-950018059);
        this.ad = new HashSet(i2);
        while (i3 < i2) {
            dw dwVar = new dw();
            try {
                dwVar.av(ikVar2, ikVar3, -2143587902);
                this.ad.add(dwVar);
            } catch (IllegalStateException e2) {
            }
            i3++;
        }
        ad(ikVar2, z, (byte) -84);
    }

    void an(ik ikVar, ik ikVar2, ik ikVar3, int i, boolean z) {
        int i2;
        int i3 = 0;
        aj(ikVar, i, (byte) 1);
        int au = ikVar3.au(-349979271);
        this.af = new HashSet(au);
        for (i2 = 0; i2 < au; i2++) {
            dy dyVar = new dy();
            try {
                dyVar.av(ikVar2, ikVar3, 1389645102);
                this.af.add(dyVar);
            } catch (IllegalStateException e) {
            }
        }
        i2 = ikVar3.au(-829734256);
        this.ad = new HashSet(i2);
        while (i3 < i2) {
            dw dwVar = new dw();
            try {
                dwVar.av(ikVar2, ikVar3, -662277063);
                this.ad.add(dwVar);
            } catch (IllegalStateException e2) {
            }
            i3++;
        }
        ad(ikVar2, z, (byte) -127);
    }

    public static no af(int i) {
        try {
            if (no.ay * -1061586891 == 0) {
                return new no();
            }
            no[] noVarArr = no.ag;
            int i2 = no.ay - -358082019;
            no.ay = i2;
            return noVarArr[i2 * -1061586891];
        } catch (Throwable e) {
            throw ba.ad(e, "dt.af(" + ')');
        }
    }

    void ad(ik ikVar, boolean z, byte b) {
        try {
            this.an = new LinkedList();
            int au = ikVar.au(-1006396284);
            for (int i = 0; i < au; i++) {
                int bx = ikVar.bx(1711962672);
                bb bbVar = new bb(ikVar.al(-84023037));
                Object obj;
                if (ikVar.ao((byte) 0) == 1) {
                    obj = 1;
                } else {
                    obj = null;
                }
                if (z || r0 == null) {
                    this.an.add(new dm(bx, bbVar));
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "dt.ad(" + ')');
        }
    }

    void ar(ik ikVar, boolean z) {
        this.an = new LinkedList();
        int au = ikVar.au(1556844316);
        for (int i = 0; i < au; i++) {
            int bx = ikVar.bx(1167021022);
            bb bbVar = new bb(ikVar.al(562247985));
            byte b;
            if (ikVar.ao((byte) 0) == 1) {
                b = (byte) 1;
            } else {
                b = (byte) 0;
            }
            if (z || r0 == (byte) 0) {
                this.an.add(new dm(bx, bbVar));
            }
        }
    }

    void as(ik ikVar, boolean z) {
        this.an = new LinkedList();
        int au = ikVar.au(-809321251);
        for (int i = 0; i < au; i++) {
            int bx = ikVar.bx(2021024674);
            bb bbVar = new bb(ikVar.al(-949293227));
            byte b;
            if (ikVar.ao((byte) 0) == 1) {
                b = (byte) 1;
            } else {
                b = (byte) 0;
            }
            if (z || r0 == (byte) 0) {
                this.an.add(new dm(bx, bbVar));
            }
        }
    }

    void ay(ik ikVar, boolean z) {
        this.an = new LinkedList();
        int au = ikVar.au(320589721);
        for (int i = 0; i < au; i++) {
            int bx = ikVar.bx(2008810392);
            bb bbVar = new bb(ikVar.al(889085150));
            byte b;
            if (ikVar.ao((byte) 0) == 1) {
                b = (byte) 1;
            } else {
                b = (byte) 0;
            }
            if (z || r0 == (byte) 0) {
                this.an.add(new dm(bx, bbVar));
            }
        }
    }

    static final void dj(boolean z, int i) {
        int i2 = 0;
        while (i2 < client.dj * 453104899) {
            try {
                cq cqVar = client.ca[client.dc[i2]];
                if (cqVar != null && cqVar.an(1394725383) && cqVar.af.ap == z && cqVar.af.aj((byte) 38)) {
                    int i3 = (cqVar.bg * 516759209) >> 7;
                    int i4 = (cqVar.bh * 2328865) >> 7;
                    if (i3 >= 0 && i3 < li.cu && i4 >= 0 && i4 < li.cu) {
                        if (1339921257 * cqVar.bv == 1 && 64 == ((516759209 * cqVar.bg) & 127) && 64 == ((2328865 * cqVar.bh) & 127)) {
                            if (client.gr[i3][i4] != -1793689995 * client.gx) {
                                client.gr[i3][i4] = -1793689995 * client.gx;
                            }
                        }
                        long ar = cg.ar(0, 0, 1, !cqVar.af.bv, client.dc[i2], 443362336);
                        cqVar.bp = client.ak * -1541697971;
                        gp.en.am(dq.hf * -1674539149, cqVar.bg * 516759209, cqVar.bh * 2328865, iz.de(((cqVar.bv * -144385472) - 64) + (cqVar.bg * 516759209), ((cqVar.bv * -144385472) - 64) + (cqVar.bh * 2328865), -1674539149 * dq.hf, 2079129790), ((cqVar.bv * -144385472) - 64) + 60, cqVar, cqVar.bf * -626668509, ar, cqVar.an);
                    }
                }
                i2++;
            } catch (Throwable e) {
                throw ba.ad(e, "dt.dj(" + ')');
            }
        }
    }
}
