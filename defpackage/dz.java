package p000;

import java.util.LinkedList;

public abstract class dz {
    public static final int cq = 74;
    int aa;
    int ad;
    byte[][][] ae;
    int af;
    int ag;
    byte[][][] aj;
    int an;
    eu[][][][] aq;
    short[][][] ar;
    short[][][] as;
    int ay;

    dz() {
        try {
            LinkedList linkedList = new LinkedList();
        } catch (Throwable e) {
            throw ba.ad(e, "dz.<init>(" + ')');
        }
    }

    void af(int i, int i2, ik ikVar, int i3) {
        try {
            int ao = ikVar.ao((byte) 0);
            if (ao != 0) {
                if ((ao & 1) != 0) {
                    ad(i, i2, ikVar, ao, (byte) -36);
                } else {
                    an(i, i2, ikVar, ao, (byte) -4);
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "dz.af(" + ')');
        }
    }

    void ar(int i, int i2, ik ikVar) {
        int ao = ikVar.ao((byte) 0);
        if (ao != 0) {
            if ((ao & 1) != 0) {
                ad(i, i2, ikVar, ao, (byte) -17);
            } else {
                an(i, i2, ikVar, ao, (byte) -21);
            }
        }
    }

    void as(int i, int i2, ik ikVar) {
        int ao = ikVar.ao((byte) 0);
        if (ao != 0) {
            if ((ao & 1) != 0) {
                ad(i, i2, ikVar, ao, (byte) -108);
            } else {
                an(i, i2, ikVar, ao, (byte) -43);
            }
        }
    }

    void ad(int i, int i2, ik ikVar, int i3, byte b) {
        Object obj = null;
        if ((i3 & 2) != 0) {
            obj = 1;
        }
        if (obj != null) {
            try {
                this.ar[0][i][i2] = (short) ikVar.ao((byte) 0);
            } catch (Throwable e) {
                throw ba.ad(e, "dz.ad(" + ')');
            }
        }
        this.as[0][i][i2] = (short) ikVar.ao((byte) 0);
    }

    void ae(int i, int i2, ik ikVar, int i3) {
        byte b;
        if ((i3 & 2) != 0) {
            b = (byte) 1;
        } else {
            b = (byte) 0;
        }
        if (b != (byte) 0) {
            this.ar[0][i][i2] = (short) ikVar.ao((byte) 0);
        }
        this.as[0][i][i2] = (short) ikVar.ao((byte) 0);
    }

    void aj(int i, int i2, ik ikVar, int i3) {
        if (((i3 & 2) != 0 ? (byte) 1 : (byte) 0) != (byte) 0) {
            this.ar[0][i][i2] = (short) ikVar.ao((byte) 0);
        }
        this.as[0][i][i2] = (short) ikVar.ao((byte) 0);
    }

    void aq(int i, int i2, ik ikVar, int i3) {
        byte b;
        if ((i3 & 2) != 0) {
            b = (byte) 1;
        } else {
            b = (byte) 0;
        }
        if (b != (byte) 0) {
            this.ar[0][i][i2] = (short) ikVar.ao((byte) 0);
        }
        this.as[0][i][i2] = (short) ikVar.ao((byte) 0);
    }

    void ab(int i, int i2, ik ikVar, int i3) {
        byte b;
        int ao;
        int i4;
        byte b2 = (byte) 1;
        int i5 = ((i3 & 24) >> 3) + 1;
        if ((i3 & 2) != 0) {
            b = (byte) 1;
        } else {
            b = (byte) 0;
        }
        if ((i3 & 4) == 0) {
            b2 = (byte) 0;
        }
        this.as[0][i][i2] = (short) ikVar.ao((byte) 0);
        if (b != (byte) 0) {
            ao = ikVar.ao((byte) 0);
            for (i4 = 0; i4 < ao; i4++) {
                int ao2 = ikVar.ao((byte) 0);
                if (ao2 != 0) {
                    this.ar[i4][i][i2] = (short) ao2;
                    ao2 = ikVar.ao((byte) 0);
                    this.aj[i4][i][i2] = (byte) (ao2 >> 2);
                    this.ae[i4][i][i2] = (byte) (ao2 & 3);
                }
            }
        }
        if (b2 != (byte) 0) {
            for (i4 = 0; i4 < i5; i4++) {
                ao = ikVar.ao((byte) 0);
                if (ao != 0) {
                    eu[] euVarArr = new eu[ao];
                    this.aq[i4][i][i2] = euVarArr;
                    for (int i6 = 0; i6 < ao; i6++) {
                        int bx = ikVar.bx(1940953668);
                        int ao3 = ikVar.ao((byte) 0);
                        euVarArr[i6] = new eu(bx, ao3 >> 2, ao3 & 3);
                    }
                }
            }
        }
    }

    void am(int i, int i2, ik ikVar, int i3) {
        byte b;
        int ao;
        int i4;
        byte b2 = (byte) 1;
        int i5 = ((i3 & 24) >> 3) + 1;
        if ((i3 & 2) != 0) {
            b = (byte) 1;
        } else {
            b = (byte) 0;
        }
        if ((i3 & 4) == 0) {
            b2 = (byte) 0;
        }
        this.as[0][i][i2] = (short) ikVar.ao((byte) 0);
        if (b != (byte) 0) {
            ao = ikVar.ao((byte) 0);
            for (i4 = 0; i4 < ao; i4++) {
                int ao2 = ikVar.ao((byte) 0);
                if (ao2 != 0) {
                    this.ar[i4][i][i2] = (short) ao2;
                    ao2 = ikVar.ao((byte) 0);
                    this.aj[i4][i][i2] = (byte) (ao2 >> 2);
                    this.ae[i4][i][i2] = (byte) (ao2 & 3);
                }
            }
        }
        if (b2 != (byte) 0) {
            for (i4 = 0; i4 < i5; i4++) {
                ao = ikVar.ao((byte) 0);
                if (ao != 0) {
                    eu[] euVarArr = new eu[ao];
                    this.aq[i4][i][i2] = euVarArr;
                    for (int i6 = 0; i6 < ao; i6++) {
                        int bx = ikVar.bx(1663979630);
                        int ao3 = ikVar.ao((byte) 0);
                        euVarArr[i6] = new eu(bx, ao3 >> 2, ao3 & 3);
                    }
                }
            }
        }
    }

    void an(int i, int i2, ik ikVar, int i3, byte b) {
        Object obj;
        Object obj2 = 1;
        int i4 = ((i3 & 24) >> 3) + 1;
        if ((i3 & 2) != 0) {
            obj = 1;
        } else {
            obj = null;
        }
        if ((i3 & 4) == 0) {
            obj2 = null;
        }
        try {
            int ao;
            int i5;
            this.as[0][i][i2] = (short) ikVar.ao((byte) 0);
            if (obj != null) {
                ao = ikVar.ao((byte) 0);
                for (i5 = 0; i5 < ao; i5++) {
                    int ao2 = ikVar.ao((byte) 0);
                    if (ao2 != 0) {
                        this.ar[i5][i][i2] = (short) ao2;
                        ao2 = ikVar.ao((byte) 0);
                        this.aj[i5][i][i2] = (byte) (ao2 >> 2);
                        this.ae[i5][i][i2] = (byte) (ao2 & 3);
                    }
                }
            }
            if (obj2 != null) {
                for (i5 = 0; i5 < i4; i5++) {
                    ao = ikVar.ao((byte) 0);
                    if (ao != 0) {
                        eu[] euVarArr = new eu[ao];
                        this.aq[i5][i][i2] = euVarArr;
                        for (int i6 = 0; i6 < ao; i6++) {
                            int bx = ikVar.bx(1206096235);
                            int ao3 = ikVar.ao((byte) 0);
                            euVarArr[i6] = new eu(bx, ao3 >> 2, ao3 & 3);
                        }
                    }
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "dz.an(" + ')');
        }
    }

    void at(int i, int i2, ik ikVar, int i3) {
        byte b;
        int ao;
        int i4;
        byte b2 = (byte) 1;
        int i5 = ((i3 & 24) >> 3) + 1;
        if ((i3 & 2) != 0) {
            b = (byte) 1;
        } else {
            b = (byte) 0;
        }
        if ((i3 & 4) == 0) {
            b2 = (byte) 0;
        }
        this.as[0][i][i2] = (short) ikVar.ao((byte) 0);
        if (b != (byte) 0) {
            ao = ikVar.ao((byte) 0);
            for (i4 = 0; i4 < ao; i4++) {
                int ao2 = ikVar.ao((byte) 0);
                if (ao2 != 0) {
                    this.ar[i4][i][i2] = (short) ao2;
                    ao2 = ikVar.ao((byte) 0);
                    this.aj[i4][i][i2] = (byte) (ao2 >> 2);
                    this.ae[i4][i][i2] = (byte) (ao2 & 3);
                }
            }
        }
        if (b2 != (byte) 0) {
            for (int i6 = 0; i6 < i5; i6++) {
                ao = ikVar.ao((byte) 0);
                if (ao != 0) {
                    eu[] euVarArr = new eu[ao];
                    this.aq[i6][i][i2] = euVarArr;
                    for (i4 = 0; i4 < ao; i4++) {
                        int bx = ikVar.bx(2028196204);
                        int ao3 = ikVar.ao((byte) 0);
                        euVarArr[i4] = new eu(bx, ao3 >> 2, ao3 & 3);
                    }
                }
            }
        }
    }

    void aw(int i, int i2, ik ikVar, int i3) {
        byte b;
        int ao;
        int i4;
        byte b2 = (byte) 1;
        int i5 = ((i3 & 24) >> 3) + 1;
        if ((i3 & 2) != 0) {
            b = (byte) 1;
        } else {
            b = (byte) 0;
        }
        if ((i3 & 4) == 0) {
            b2 = (byte) 0;
        }
        this.as[0][i][i2] = (short) ikVar.ao((byte) 0);
        if (b != (byte) 0) {
            ao = ikVar.ao((byte) 0);
            for (i4 = 0; i4 < ao; i4++) {
                int ao2 = ikVar.ao((byte) 0);
                if (ao2 != 0) {
                    this.ar[i4][i][i2] = (short) ao2;
                    ao2 = ikVar.ao((byte) 0);
                    this.aj[i4][i][i2] = (byte) (ao2 >> 2);
                    this.ae[i4][i][i2] = (byte) (ao2 & 3);
                }
            }
        }
        if (b2 != (byte) 0) {
            for (i4 = 0; i4 < i5; i4++) {
                ao = ikVar.ao((byte) 0);
                if (ao != 0) {
                    eu[] euVarArr = new eu[ao];
                    this.aq[i4][i][i2] = euVarArr;
                    for (int i6 = 0; i6 < ao; i6++) {
                        int bx = ikVar.bx(1601016241);
                        int ao3 = ikVar.ao((byte) 0);
                        euVarArr[i6] = new eu(bx, ao3 >> 2, ao3 & 3);
                    }
                }
            }
        }
    }

    int aa(int i, int i2, short s) {
        if (i < 0 || i2 < 0 || i >= 64 || i2 >= 64) {
            return -1;
        }
        try {
            return this.as[0][i][i2] - 1;
        } catch (Throwable e) {
            throw ba.ad(e, "dz.aa(" + ')');
        }
    }

    int ai(int i, int i2) {
        if (i < 0 || i2 < 0 || i >= 64 || i2 >= 64) {
            return -1;
        }
        return this.as[0][i][i2] - 1;
    }

    int az(int i, int i2) {
        if (i < 0 || i2 < 0 || i >= 64 || i2 >= 64) {
            return -1;
        }
        return this.as[0][i][i2] - 1;
    }

    int ag(int i) {
        try {
            return -2112147609 * this.an;
        } catch (Throwable e) {
            throw ba.ad(e, "dz.ag(" + ')');
        }
    }

    int ah() {
        return -2112147609 * this.an;
    }

    int ak() {
        return -2112147609 * this.an;
    }

    int ao() {
        return -644057130 * this.aa;
    }

    int au() {
        return 631621543 * this.aa;
    }

    int ax() {
        return 631621543 * this.aa;
    }

    int ay(int i) {
        try {
            return 631621543 * this.aa;
        } catch (Throwable e) {
            throw ba.ad(e, "dz.ay(" + ')');
        }
    }

    static int ae(int i, gk gkVar, boolean z, int i2) {
        if (z) {
            try {
                ac acVar = mn.ab;
            } catch (Throwable e) {
                throw ba.ad(e, "dz.ae(" + ')');
            }
        }
        acVar = hr.at;
        int[] iArr;
        int i3;
        if (i == 1600) {
            iArr = hr.as;
            i3 = hr.ar - 1194553915;
            hr.ar = i3;
            iArr[(i3 * 537618701) - 1] = acVar.be * -2091547827;
            return 1;
        } else if (1601 == i) {
            iArr = hr.as;
            i3 = hr.ar - 1194553915;
            hr.ar = i3;
            iArr[(i3 * 537618701) - 1] = acVar.bk * 654937537;
            return 1;
        } else if (i == 1602) {
            String[] strArr = hr.aj;
            i3 = hr.ae - 1246602361;
            hr.ae = i3;
            strArr[(i3 * -1267697097) - 1] = acVar.dj;
            return 1;
        } else if (i == 1603) {
            iArr = hr.as;
            i3 = hr.ar - 1194553915;
            hr.ar = i3;
            iArr[(i3 * 537618701) - 1] = acVar.by * 1151268625;
            return 1;
        } else if (i == 1604) {
            iArr = hr.as;
            i3 = hr.ar - 1194553915;
            hr.ar = i3;
            iArr[(i3 * 537618701) - 1] = acVar.bn * -1243953689;
            return 1;
        } else if (1605 == i) {
            iArr = hr.as;
            i3 = hr.ar - 1194553915;
            hr.ar = i3;
            iArr[(i3 * 537618701) - 1] = acVar.cr * 2105704033;
            return 1;
        } else if (i == 1606) {
            iArr = hr.as;
            i3 = hr.ar - 1194553915;
            hr.ar = i3;
            iArr[(i3 * 537618701) - 1] = acVar.cb * -1375479599;
            return 1;
        } else if (i == 1607) {
            iArr = hr.as;
            i3 = hr.ar - 1194553915;
            hr.ar = i3;
            iArr[(i3 * 537618701) - 1] = acVar.cz * -1211464689;
            return 1;
        } else if (i == 1608) {
            iArr = hr.as;
            i3 = hr.ar - 1194553915;
            hr.ar = i3;
            iArr[(i3 * 537618701) - 1] = acVar.cf * -2032348791;
            return 1;
        } else if (i == 1609) {
            iArr = hr.as;
            i3 = hr.ar - 1194553915;
            hr.ar = i3;
            iArr[(i3 * 537618701) - 1] = acVar.bj * -479221341;
            return 1;
        } else if (1610 == i) {
            iArr = hr.as;
            i3 = hr.ar - 1194553915;
            hr.ar = i3;
            iArr[(i3 * 537618701) - 1] = acVar.bi * -1726277411;
            return 1;
        } else if (1611 == i) {
            iArr = hr.as;
            i3 = hr.ar - 1194553915;
            hr.ar = i3;
            iArr[(i3 * 537618701) - 1] = acVar.ba * 334261811;
            return 1;
        } else if (i == 1612) {
            iArr = hr.as;
            i3 = hr.ar - 1194553915;
            hr.ar = i3;
            iArr[(i3 * 537618701) - 1] = acVar.bl * 1703184995;
            return 1;
        } else if (i == 1613) {
            iArr = hr.as;
            i3 = hr.ar - 1194553915;
            hr.ar = i3;
            iArr[(i3 * 537618701) - 1] = acVar.br.af(1585942397);
            return 1;
        } else if (1614 != i) {
            return 2;
        } else {
            iArr = hr.as;
            i3 = hr.ar - 1194553915;
            hr.ar = i3;
            iArr[(i3 * 537618701) - 1] = acVar.cx ? 1 : 0;
            return 1;
        }
    }

    static void bt(ah ahVar, int i, int i2, int i3, byte b) {
        try {
            if (client.nd * 2118073853 < 50 && client.ns * 1137688059 != 0) {
                if (ahVar.aj == null) {
                    return;
                }
                if (i < ahVar.aj.length) {
                    int i4 = ahVar.aj[i];
                    if (i4 != 0) {
                        int i5 = i4 >> 8;
                        int i6 = (i4 >> 4) & 7;
                        i4 &= 15;
                        client.nv[client.nd * 2118073853] = i5;
                        client.na[client.nd * 2118073853] = i6;
                        client.nw[client.nd * 2118073853] = 0;
                        client.ny[client.nd * 2118073853] = null;
                        client.nn[client.nd * 2118073853] = i4 + ((((i2 - 64) / mn.an) << 16) + (((i3 - 64) / mn.an) << 8));
                        client.nd += 1636861781;
                    }
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "dz.bt(" + ')');
        }
    }
}
