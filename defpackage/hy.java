package p000;

import java.io.IOException;
import java.net.Socket;

public class hy extends kd {
    public static final int au = 24;
    static int cf;
    int ad;
    int af;
    boolean an;

    hy() {
        try {
            this.an = false;
        } catch (Throwable e) {
            throw ba.ad(e, "hy.<init>(" + ')');
        }
    }

    public static md bw(Socket socket, int i, int i2, byte b) throws IOException {
        try {
            return new my(socket, i, i2);
        } catch (Throwable e) {
            throw ba.ad(e, "hy.bw(" + ')');
        }
    }

    public static gd at(int i) {
        try {
            gd gdVar = new gd();
            for (int i2 = 0; i2 < le.ar.length; i2++) {
                if (le.ar[i2] != 0) {
                    int[] iArr = le.ar;
                    iArr[i2] = iArr[i2] | -16777216;
                }
            }
            gdVar.as = -102972929 * gl.ad;
            gdVar.ar = -820473409 * nu.an;
            gdVar.ag = dr.aa[0];
            gdVar.ay = gl.ag[0];
            gdVar.an = my.ay[0];
            gdVar.aa = it.as[0];
            gdVar.ad = le.ar;
            gdVar.af = gl.aj[0];
            gy.ak(805967750);
            return gdVar;
        } catch (Throwable e) {
            throw ba.ad(e, "hy.at(" + ')');
        }
    }

    static int aa(ia iaVar, int i) {
        try {
            int kf = iaVar.kf(2, (byte) -77);
            if (kf == 0) {
                return 0;
            }
            if (1 == kf) {
                return iaVar.kf(5, (byte) -70);
            }
            if (2 == kf) {
                return iaVar.kf(8, (byte) -74);
            }
            return iaVar.kf(11, Byte.MIN_VALUE);
        } catch (Throwable e) {
            throw ba.ad(e, "hy.aa(" + ')');
        }
    }

    static int at(int i, gk gkVar, boolean z, int i2) {
        boolean z2 = false;
        String[] strArr;
        int i3;
        if (i == 3100) {
            try {
                strArr = hr.aj;
                i3 = hr.ae - -1246602361;
                hr.ae = i3;
                ax.af(0, "", strArr[i3 * -1267697097], 1289127989);
                return 1;
            } catch (Throwable e) {
                throw ba.ad(e, "hy.at(" + ')');
            }
        } else if (3101 == i) {
            hr.ar -= 1905859466;
            hb.cn(gf.ho, hr.as[hr.ar * 537618701], hr.as[(hr.ar * 537618701) + 1], (byte) 7);
            return 1;
        } else if (3103 == i) {
            gw.fg(-1265034995);
            return 1;
        } else if (3104 == i) {
            r2 = hr.aj;
            r3 = hr.ae - -1246602361;
            hr.ae = r3;
            CharSequence charSequence = r2[r3 * -1267697097];
            if (ej.af(charSequence, 1034746886)) {
                r0 = ll.aa(charSequence, 10, true, (byte) 3);
            }
            r2 = ik.ad(nr.cz, client.dv.ag, (byte) -20);
            r2.an.ay(r0, (short) 128);
            client.dv.an(r2, (short) 255);
            return 1;
        } else if (i == 3105) {
            strArr = hr.aj;
            i3 = hr.ae - -1246602361;
            hr.ae = i3;
            r0 = strArr[i3 * -1267697097];
            r2 = ik.ad(nr.ck, client.dv.ag, (byte) 50);
            r2.an.an(r0.length() + 1, (byte) 31);
            r2.an.aq(r0, (byte) -30);
            client.dv.an(r2, (short) 255);
            return 1;
        } else if (3106 == i) {
            strArr = hr.aj;
            i3 = hr.ae - -1246602361;
            hr.ae = i3;
            r0 = strArr[i3 * -1267697097];
            r2 = ik.ad(nr.bc, client.dv.ag, (byte) -20);
            r2.an.an(r0.length() + 1, (byte) 31);
            r2.an.aq(r0, (byte) -95);
            client.dv.an(r2, (short) 255);
            return 1;
        } else if (3107 == i) {
            r0 = hr.as;
            i3 = hr.ar - -1194553915;
            hr.ar = i3;
            r0 = r0[i3 * 537618701];
            r2 = hr.aj;
            r3 = hr.ae - -1246602361;
            hr.ae = r3;
            nv.eu(r0, r2[r3 * -1267697097], (byte) 100);
            return 1;
        } else if (3108 == i) {
            hr.ar -= 711305551;
            ex.fd(hv.ad(hr.as[(hr.ar * 537618701) + 2], 1773719681), hr.as[hr.ar * 537618701], hr.as[(hr.ar * 537618701) + 1], -1966430811);
            return 1;
        } else if (i == 3109) {
            ac acVar;
            hr.ar -= 1905859466;
            i3 = hr.as[hr.ar * 537618701];
            r3 = hr.as[(hr.ar * 537618701) + 1];
            if (z) {
                acVar = mn.ab;
            } else {
                acVar = hr.at;
            }
            ex.fd(acVar, i3, r3, -1069985512);
            return 1;
        } else if (i == 3110) {
            r2 = hr.as;
            r3 = hr.ar - -1194553915;
            hr.ar = r3;
            if (r2[r3 * 537618701] == 1) {
                z2 = true;
            }
            ay.bu = z2;
            return 1;
        } else if (3111 == i) {
            r2 = hr.as;
            r3 = hr.ar - 1194553915;
            hr.ar = r3;
            r3 = (r3 * 537618701) - 1;
            if (cs.oj.an) {
                r0 = 1;
            }
            r2[r3] = r0;
            return 1;
        } else if (i == 3112) {
            gj gjVar = cs.oj;
            r3 = hr.as;
            r4 = hr.ar - -1194553915;
            hr.ar = r4;
            if (r3[r4 * 537618701] == 1) {
                z2 = true;
            }
            gjVar.an = z2;
            co.aa(-659164844);
            return 1;
        } else if (i == 3113) {
            r2 = hr.aj;
            r3 = hr.ae - -1246602361;
            hr.ae = r3;
            r2 = r2[r3 * -1267697097];
            r3 = hr.as;
            r4 = hr.ar - -1194553915;
            hr.ar = r4;
            if (r3[r4 * 537618701] == 1) {
                z2 = true;
            }
            js.ad(r2, z2, false, (byte) 14);
            return 1;
        } else if (3115 == i) {
            r0 = hr.as;
            i3 = hr.ar - -1194553915;
            hr.ar = i3;
            r0 = r0[i3 * 537618701];
            r2 = ik.ad(nr.ba, client.dv.ag, (byte) 33);
            r2.an.aa(r0, -1752508204);
            client.dv.an(r2, (short) 255);
            return 1;
        } else if (3116 == i) {
            r0 = hr.as;
            i3 = hr.ar - -1194553915;
            hr.ar = i3;
            r0 = r0[i3 * 537618701];
            hr.ae -= 1801762574;
            r2 = hr.aj[hr.ae * -1267697097];
            String str = hr.aj[(hr.ae * -1267697097) + 1];
            if (r2.length() > 500) {
                return 1;
            }
            if (str.length() > 500) {
                return 1;
            }
            no ad = ik.ad(nr.co, client.dv.ag, (byte) 61);
            ad.an.aa((hz.ae(r2, -812122429) + 1) + hz.ae(str, -212422388), -1752508204);
            ad.an.aq(str, (byte) 46);
            ad.an.an(r0, (byte) 31);
            ad.an.aq(r2, (byte) 38);
            client.dv.an(ad, (short) 255);
            return 1;
        } else if (i == 3117) {
            r2 = nq.ii;
            r3 = hr.as;
            r4 = hr.ar - -1194553915;
            hr.ar = r4;
            if (r3[r4 * 537618701] == 1) {
                z2 = true;
            }
            r2.cy(z2, 1910113390);
            return 1;
        } else if (3118 == i) {
            r2 = nq.ii;
            r3 = hr.as;
            r4 = hr.ar - -1194553915;
            hr.ar = r4;
            if (r3[r4 * 537618701] == 1) {
                z2 = true;
            }
            r2.co = z2;
            return 1;
        } else if (i == 3119) {
            r2 = hr.as;
            r3 = hr.ar - -1194553915;
            hr.ar = r3;
            if (r2[r3 * 537618701] == 1) {
                z2 = true;
            }
            client.hh = z2;
            return 1;
        } else if (i == 3120) {
            r0 = hr.as;
            i3 = hr.ar - -1194553915;
            hr.ar = i3;
            if (r0[i3 * 537618701] == 1) {
                client.ir = 213563641 * ((client.ir * 1424263497) | 1);
                return 1;
            }
            client.ir = 213563641 * ((1424263497 * client.ir) & -2);
            return 1;
        } else if (i == 3121) {
            r0 = hr.as;
            i3 = hr.ar - -1194553915;
            hr.ar = i3;
            if (r0[i3 * 537618701] == 1) {
                client.ir = 213563641 * ((client.ir * 1424263497) | 2);
                return 1;
            }
            client.ir = ((1424263497 * client.ir) & -3) * 213563641;
            return 1;
        } else if (i == 3122) {
            r0 = hr.as;
            i3 = hr.ar - -1194553915;
            hr.ar = i3;
            if (r0[i3 * 537618701] == 1) {
                client.ir = 213563641 * ((client.ir * 1424263497) | 4);
                return 1;
            }
            client.ir = ((client.ir * 1424263497) & -5) * 213563641;
            return 1;
        } else if (i == 3123) {
            r0 = hr.as;
            i3 = hr.ar - -1194553915;
            hr.ar = i3;
            if (r0[i3 * 537618701] == 1) {
                client.ir = 213563641 * ((1424263497 * client.ir) | 8);
                return 1;
            }
            client.ir = ((client.ir * 1424263497) & -9) * 213563641;
            return 1;
        } else if (3124 == i) {
            client.ir = 0;
            return 1;
        } else if (i == 3125) {
            r2 = hr.as;
            r3 = hr.ar - -1194553915;
            hr.ar = r3;
            if (r2[r3 * 537618701] == 1) {
                z2 = true;
            }
            client.hy = z2;
            return 1;
        } else if (3126 == i) {
            r2 = hr.as;
            r3 = hr.ar - -1194553915;
            hr.ar = r3;
            if (r2[r3 * 537618701] == 1) {
                z2 = true;
            }
            client.hp = z2;
            return 1;
        } else if (3127 == i) {
            r2 = nq.ii;
            r3 = hr.as;
            r4 = hr.ar - -1194553915;
            hr.ar = r4;
            if (r3[r4 * 537618701] == 1) {
                z2 = true;
            }
            r2.ck(z2, (byte) 6);
            return 1;
        } else if (3128 == i) {
            r2 = hr.as;
            r3 = hr.ar - 1194553915;
            hr.ar = r3;
            r3 = (r3 * 537618701) - 1;
            if (nq.ii.cl(1693428806)) {
                z2 = true;
            }
            r2[r3] = z2;
            return 1;
        } else if (3129 == i) {
            hr.ar -= 1905859466;
            client.gn = -704603963 * hr.as[hr.ar * 537618701];
            client.ge = hr.as[(hr.ar * 537618701) + 1] * -1890400699;
            return 1;
        } else if (3130 == i) {
            hr.ar -= 1905859466;
            i3 = hr.as[hr.ar * 537618701];
            if (1 == hr.as[(hr.ar * 537618701) + 1]) {
                z2 = true;
            }
            nq.ii.cs(i3, z2, 1829547545);
            return 1;
        } else if (i == 3131) {
            r2 = hr.as;
            r3 = hr.ar - -1194553915;
            hr.ar = r3;
            if (r2[r3 * 537618701] == 1) {
                z2 = true;
            }
            nq.ii.cd(z2, -107858092);
            return 1;
        } else if (3132 != i) {
            return 2;
        } else {
            r0 = hr.as;
            i3 = hr.ar - 1194553915;
            hr.ar = i3;
            r0[(i3 * 537618701) - 1] = ds.rg * -1946576867;
            r0 = hr.as;
            i3 = hr.ar - 1194553915;
            hr.ar = i3;
            r0[(i3 * 537618701) - 1] = af.ru * 1616559063;
            return 1;
        }
    }
}
