package p000;

import java.util.Collection;

public class hg extends cq {
    int aa;
    int ad;
    int af;
    int ag;
    int aj;
    int an;
    int ar;
    ah as;
    int ay;

    hg(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, cq cqVar) {
        try {
            this.af = 1524784043 * i;
            this.ad = -450177197 * i2;
            this.an = 1972948773 * i3;
            this.aa = -1346441463 * i4;
            this.ag = 304027707 * i5;
            this.ay = -1177878907 * i6;
            if (i7 != -1) {
                this.as = cd.af(i7, 1736691109);
                this.ar = 0;
                this.aj = (-1951699057 * client.ak) - -1478215515;
                if (this.as.ak * 493411451 == 0 && cqVar != null && (cqVar instanceof hg)) {
                    hg hgVar = (hg) cqVar;
                    if (this.as == hgVar.as) {
                        this.ar = hgVar.ar * 1;
                        this.aj = hgVar.aj * 1;
                        return;
                    }
                }
                if (z && 1071101749 * this.as.ae != -1) {
                    this.ar = ((int) (Math.random() * ((double) this.as.ay.length))) * 1113900523;
                    this.aj -= ((int) (Math.random() * ((double) this.as.ar[this.ar * 833764035]))) * -1478215515;
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "hg.<init>(" + ')');
        }
    }

    protected final cl ac() {
        try {
            if (this.as != null) {
                int i = (1581849891 * client.ak) - (-67047635 * this.aj);
                if (i > 100 && this.as.ae * 1071101749 > 0) {
                    i = 100;
                }
                while (i > this.as.ar[this.ar * 833764035]) {
                    i -= this.as.ar[this.ar * 833764035];
                    this.ar += 1113900523;
                    if (this.ar * 833764035 >= this.as.ay.length) {
                        this.ar -= -709560665 * this.as.ae;
                        if (this.ar * 833764035 < 0 || this.ar * 833764035 >= this.as.ay.length) {
                            this.as = null;
                            break;
                        }
                    }
                }
                this.aj = ((1581849891 * client.ak) - i) * -1478215515;
            }
            ae ad = gi.ad(-817510653 * this.af, 1739302234);
            if (ad.ba != null) {
                ad = ad.am((byte) 32);
            }
            if (ad == null) {
                return null;
            }
            int i2;
            int i3;
            if (1 == this.an * 1692316845 || 3 == this.an * 1692316845) {
                i2 = -344743753 * ad.ah;
                i3 = -265754695 * ad.az;
            } else {
                i2 = -265754695 * ad.az;
                i3 = ad.ah * -344743753;
            }
            int i4 = (i2 >> 1) + (this.ag * 431227123);
            int i5 = (this.ag * 431227123) + ((i2 + 1) >> 1);
            int i6 = (this.ay * 1116949069) + (i3 >> 1);
            int i7 = (this.ay * 1116949069) + ((i3 + 1) >> 1);
            int[][] iArr = gu.af[this.aa * 573656889];
            i5 = (((iArr[i4][i6] + iArr[i5][i6]) + iArr[i4][i7]) + iArr[i5][i7]) >> 2;
            return ad.ae(570524891 * this.ad, this.an * 1692316845, iArr, ((this.ag * 431227123) << 7) + (i2 << 6), i5, ((this.ay * 1116949069) << 7) + (i3 << 6), this.as, this.ar * 833764035, -871487954);
        } catch (Throwable e) {
            throw ba.ad(e, "hg.ac(" + ')');
        }
    }

    protected final cl dh() {
        if (this.as != null) {
            int i = (1581849891 * client.ak) - (-67047635 * this.aj);
            if (i > 100 && this.as.ae * 1071101749 > 0) {
                i = 100;
            }
            while (i > this.as.ar[this.ar * 833764035]) {
                i -= this.as.ar[this.ar * 833764035];
                this.ar += 1113900523;
                if (this.ar * 833764035 >= this.as.ay.length) {
                    this.ar -= -709560665 * this.as.ae;
                    if (this.ar * 833764035 < 0 || this.ar * 833764035 >= this.as.ay.length) {
                        this.as = null;
                        break;
                    }
                }
            }
            this.aj = ((1581849891 * client.ak) - i) * -1478215515;
        }
        ae ad = gi.ad(-817510653 * this.af, 1401856527);
        if (ad.ba != null) {
            ad = ad.am((byte) 109);
        }
        if (ad == null) {
            return null;
        }
        int i2;
        int i3;
        if (1 == this.an * 1692316845 || 3 == this.an * 1692316845) {
            i2 = -344743753 * ad.ah;
            i3 = -265754695 * ad.az;
        } else {
            i2 = -265754695 * ad.az;
            i3 = ad.ah * -344743753;
        }
        int i4 = (i2 >> 1) + (this.ag * 431227123);
        int i5 = (this.ag * 431227123) + ((i2 + 1) >> 1);
        int i6 = (this.ay * 1116949069) + (i3 >> 1);
        int i7 = (this.ay * 1116949069) + ((i3 + 1) >> 1);
        int[][] iArr = gu.af[this.aa * 573656889];
        i5 = (((iArr[i4][i6] + iArr[i5][i6]) + iArr[i4][i7]) + iArr[i5][i7]) >> 2;
        return ad.ae(570524891 * this.ad, this.an * 1692316845, iArr, ((this.ag * 431227123) << 7) + (i2 << 6), i5, ((this.ay * 1116949069) << 7) + (i3 << 6), this.as, this.ar * 833764035, -871487954);
    }

    protected final cl dn() {
        if (this.as != null) {
            int i = (1581849891 * client.ak) - (-67047635 * this.aj);
            if (i > 100 && this.as.ae * 1071101749 > 0) {
                i = 100;
            }
            while (i > this.as.ar[this.ar * 833764035]) {
                i -= this.as.ar[this.ar * 833764035];
                this.ar += 1113900523;
                if (this.ar * 833764035 >= this.as.ay.length) {
                    this.ar -= -709560665 * this.as.ae;
                    if (this.ar * 833764035 < 0 || this.ar * 833764035 >= this.as.ay.length) {
                        this.as = null;
                        break;
                    }
                }
            }
            this.aj = ((1581849891 * client.ak) - i) * -1478215515;
        }
        ae ad = gi.ad(-817510653 * this.af, 1120363267);
        if (ad.ba != null) {
            ad = ad.am((byte) 57);
        }
        if (ad == null) {
            return null;
        }
        int i2;
        int i3;
        if (1 == this.an * 1692316845 || 3 == this.an * 1692316845) {
            i2 = -344743753 * ad.ah;
            i3 = -265754695 * ad.az;
        } else {
            i2 = -265754695 * ad.az;
            i3 = ad.ah * -344743753;
        }
        int i4 = (i2 >> 1) + (this.ag * 431227123);
        int i5 = (this.ag * 431227123) + ((i2 + 1) >> 1);
        int i6 = (this.ay * 1116949069) + (i3 >> 1);
        int i7 = (this.ay * 1116949069) + ((i3 + 1) >> 1);
        int[][] iArr = gu.af[this.aa * 573656889];
        i5 = (((iArr[i4][i6] + iArr[i5][i6]) + iArr[i4][i7]) + iArr[i5][i7]) >> 2;
        return ad.ae(570524891 * this.ad, this.an * 1692316845, iArr, ((this.ag * 431227123) << 7) + (i2 << 6), i5, ((this.ay * 1116949069) << 7) + (i3 << 6), this.as, this.ar * 833764035, -871487954);
    }

    protected final cl dx() {
        if (this.as != null) {
            int i = (1581849891 * client.ak) - (-67047635 * this.aj);
            if (i > 100 && this.as.ae * 1071101749 > 0) {
                i = 100;
            }
            while (i > this.as.ar[this.ar * 833764035]) {
                i -= this.as.ar[this.ar * 833764035];
                this.ar += 1113900523;
                if (this.ar * 833764035 >= this.as.ay.length) {
                    this.ar -= -709560665 * this.as.ae;
                    if (this.ar * 833764035 < 0 || this.ar * 833764035 >= this.as.ay.length) {
                        this.as = null;
                        break;
                    }
                }
            }
            this.aj = ((1581849891 * client.ak) - i) * -1478215515;
        }
        ae ad = gi.ad(-817510653 * this.af, 2022993616);
        if (ad.ba != null) {
            ad = ad.am((byte) 123);
        }
        if (ad == null) {
            return null;
        }
        int i2;
        int i3;
        if (1 == this.an * 1692316845 || 3 == this.an * 1692316845) {
            i2 = -344743753 * ad.ah;
            i3 = -265754695 * ad.az;
        } else {
            i2 = -265754695 * ad.az;
            i3 = ad.ah * -344743753;
        }
        int i4 = (i2 >> 1) + (this.ag * 431227123);
        int i5 = (this.ag * 431227123) + ((i2 + 1) >> 1);
        int i6 = (this.ay * 1116949069) + (i3 >> 1);
        int i7 = (this.ay * 1116949069) + ((i3 + 1) >> 1);
        int[][] iArr = gu.af[this.aa * 573656889];
        i5 = (((iArr[i4][i6] + iArr[i5][i6]) + iArr[i4][i7]) + iArr[i5][i7]) >> 2;
        return ad.ae(570524891 * this.ad, this.an * 1692316845, iArr, ((this.ag * 431227123) << 7) + (i2 << 6), i5, ((this.ay * 1116949069) << 7) + (i3 << 6), this.as, this.ar * 833764035, -871487954);
    }

    protected final cl dy() {
        if (this.as != null) {
            int i = (client.ak * 1581849891) - (-67047635 * this.aj);
            if (i > 100 && this.as.ae * 574792202 > 0) {
                i = 332136541;
            }
            while (i > this.as.ar[this.ar * 833764035]) {
                i -= this.as.ar[this.ar * 676318368];
                this.ar -= 866237378;
                if (this.ar * 833764035 >= this.as.ay.length) {
                    this.ar -= -709560665 * this.as.ae;
                    if (this.ar * 833764035 < 0 || this.ar * 608206582 >= this.as.ay.length) {
                        this.as = null;
                        break;
                    }
                }
            }
            this.aj = ((client.ak * 1581849891) - i) * -1478215515;
        }
        ae ad = gi.ad(604973161 * this.af, 1677501682);
        if (ad.ba != null) {
            ad = ad.am((byte) 46);
        }
        if (ad == null) {
            return null;
        }
        int i2;
        int i3;
        if (1 == this.an * 1692316845 || 3 == 1520488977 * this.an) {
            i2 = -344743753 * ad.ah;
            i3 = -265754695 * ad.az;
        } else {
            i2 = -1685901290 * ad.az;
            i3 = ad.ah * -344743753;
        }
        int i4 = (i2 >> 1) + (this.ag * -1508757830);
        int i5 = (this.ag * 431227123) + ((i2 + 1) >> 1);
        int i6 = (this.ay * 1116949069) + (i3 >> 1);
        int i7 = (234570220 * this.ay) + ((i3 + 1) >> 1);
        int[][] iArr = gu.af[this.aa * 158796064];
        i5 = (((iArr[i4][i6] + iArr[i5][i6]) + iArr[i4][i7]) + iArr[i5][i7]) >> 2;
        return ad.ae(-799988527 * this.ad, this.an * 1692316845, iArr, ((this.ag * -1668539650) << 7) + (i2 << 6), i5, ((this.ay * 1116949069) << 7) + (i3 << 6), this.as, this.ar * -1873807589, -871487954);
    }

    public static void ag(Collection collection, int i) {
        try {
            collection.add(at.an);
        } catch (Throwable e) {
            throw ba.ad(e, "hg.ag(" + ')');
        }
    }
}
