package p000;

public class eh implements fq {
    static final int ae = 5;
    static final String ag = "random.dat";
    static final int ar = 256;
    static fa np;

    public fa ad() {
        return new fn();
    }

    public fa af(int i) {
        try {
            return new fn();
        } catch (Throwable e) {
            throw ba.ad(e, "eh.af(" + ')');
        }
    }

    public fa an() {
        return new fn();
    }

    static void ag(int i, int i2, int i3, boolean z, int i4, boolean z2, int i5) {
        if (i < i2) {
            try {
                int i6 = (i2 + i) / 2;
                hq hqVar = C0001do.ag[i6];
                C0001do.ag[i6] = C0001do.ag[i2];
                C0001do.ag[i2] = hqVar;
                int i7 = i;
                int i8 = i;
                while (i7 < i2) {
                    if (cw.ay(C0001do.ag[i7], hqVar, i3, z, i4, z2, 944441159) <= 0) {
                        hq hqVar2 = C0001do.ag[i7];
                        C0001do.ag[i7] = C0001do.ag[i8];
                        i6 = i8 + 1;
                        C0001do.ag[i8] = hqVar2;
                    } else {
                        i6 = i8;
                    }
                    i7++;
                    i8 = i6;
                }
                C0001do.ag[i2] = C0001do.ag[i8];
                C0001do.ag[i8] = hqVar;
                eh.ag(i, i8 - 1, i3, z, i4, z2, 1235124032);
                eh.ag(i8 + 1, i2, i3, z, i4, z2, 254359192);
            } catch (Throwable e) {
                throw ba.ad(e, "eh.ag(" + ')');
            }
        }
    }

    static int aa(int i, gk gkVar, boolean z, byte b) {
        boolean z2 = false;
        if (i >= 2000) {
            i -= 1000;
            try {
                int[] iArr = hr.as;
                int i2 = hr.ar - -1194553915;
                hr.ar = i2;
                i2 = iArr[i2 * 537618701];
                ac ad = hv.ad(i2, 725613859);
            } catch (Throwable e) {
                throw ba.ad(e, "eh.aa(" + ')');
            }
        }
        ad = z ? mn.ab : hr.at;
        i2 = -1;
        if (1000 == i) {
            hr.ar -= -483248364;
            ad.bw = -1299204119 * hr.as[hr.ar * 537618701];
            ad.bb = hr.as[(hr.ar * 537618701) + 1] * 922175265;
            ad.av = -1859331853 * hr.as[(hr.ar * 537618701) + 2];
            ad.ac = 1800206059 * hr.as[(hr.ar * 537618701) + 3];
            client.fk(ad, (byte) 34);
            client.ad.el(ad, (short) -15276);
            if (-1 == i2 || ad.ao * -128421835 != 0) {
                return 1;
            }
            af.et(en.ay[i2 >> 16], ad, false, (byte) -104);
            return 1;
        } else if (i == 1001) {
            hr.ar -= -483248364;
            ad.bc = 507881715 * hr.as[hr.ar * 537618701];
            ad.bz = -14232227 * hr.as[(hr.ar * 537618701) + 1];
            ad.al = hr.as[(hr.ar * 537618701) + 2] * -1778589005;
            ad.ap = hr.as[(hr.ar * 537618701) + 3] * -186773411;
            client.fk(ad, (byte) 58);
            client.ad.el(ad, (short) -22971);
            if (i2 == -1 || ad.ao * -128421835 != 0) {
                return 1;
            }
            af.et(en.ay[i2 >> 16], ad, false, (byte) -45);
            return 1;
        } else if (i == 1003) {
            r3 = hr.as;
            r4 = hr.ar - -1194553915;
            hr.ar = r4;
            if (r3[r4 * 537618701] == 1) {
                z2 = true;
            }
            if (ad.bu == z2) {
                return 1;
            }
            ad.bu = z2;
            client.fk(ad, (byte) 58);
            return 1;
        } else if (1005 == i) {
            r3 = hr.as;
            r4 = hr.ar - -1194553915;
            hr.ar = r4;
            if (r3[r4 * 537618701] == 1) {
                z2 = true;
            }
            ad.fx = z2;
            return 1;
        } else if (1006 != i) {
            return 2;
        } else {
            r3 = hr.as;
            r4 = hr.ar - -1194553915;
            hr.ar = r4;
            if (r3[r4 * 537618701] == 1) {
                z2 = true;
            }
            ad.ft = z2;
            return 1;
        }
    }
}
