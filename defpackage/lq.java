package p000;

public class lq {
    public static final lq aa = new lq("VERDANA11", "verdana_11pt_regular");
    public static final lq ad = new lq("PLAIN12", "p12_full");
    public static final lq af = new lq("PLAIN11", "p11_full");
    public static final lq ag = new lq("VERDANA13", "verdana_13pt_regular");
    static final int ai = 16;
    public static final lq an = new lq("BOLD12", "b12_full");
    static final int av = 200;
    public static final lq ay = new lq("VERDANA15", "verdana_15pt_regular");
    static final int bg = 4;
    static final int dd = 16777215;
    String ar;
    final String as;

    public static lq[] aa() {
        return new lq[]{ag, af, aa, ay, an, ad};
    }

    public static lq[] ad() {
        return new lq[]{ag, af, aa, ay, an, ad};
    }

    public static lq[] af(byte b) {
        try {
            return new lq[]{ag, af, aa, ay, an, ad};
        } catch (Throwable e) {
            throw ba.ad(e, "lq.af(" + ')');
        }
    }

    public static lq[] an() {
        return new lq[]{ag, af, aa, ay, an, ad};
    }

    lq(String str, String str2) {
        try {
            this.as = str;
            this.ar = str2;
        } catch (Throwable e) {
            throw ba.ad(e, "lq.<init>(" + ')');
        }
    }

    public static int an(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if ((i6 & 1) != 1) {
            int i8 = i5;
            i5 = i4;
            i4 = i8;
        }
        int i9 = i3 & 3;
        if (i9 == 0) {
            return i2;
        }
        if (i9 == 1) {
            return (7 - i) - (i5 - 1);
        }
        if (i9 == 2) {
            return (7 - i2) - (i4 - 1);
        }
        return i;
    }

    public static aa af(int i, byte b) {
        try {
            aa aaVar = (aa) aa.aa.af((long) i);
            if (aaVar == null) {
                byte[] an = aa.af.an(32, i, 373342904);
                aaVar = new aa();
                if (an != null) {
                    aaVar.ad(new ik(an), 1639800210);
                }
                aa.aa.an(aaVar, (long) i);
            }
            return aaVar;
        } catch (Throwable e) {
            throw ba.ad(e, "lq.af(" + ')');
        }
    }

    static final void bj(gx gxVar, int i, int i2) {
        try {
            if (gxVar.dj * 81181341 > client.ak * 1581849891) {
                av.bi(gxVar, -446476644);
            } else if (gxVar.dc * -216586625 >= client.ak * 1581849891) {
                if (client.ak * 1581849891 == gxVar.dc * -216586625 || -1 == gxVar.cq * 1462124603 || gxVar.ct * 1913892303 != 0 || (-829213351 * gxVar.cp) + 1 > cd.af(gxVar.cq * 1462124603, 785603082).ar[1816971127 * gxVar.cj]) {
                    int i3 = (gxVar.dc * -216586625) - (gxVar.dj * 81181341);
                    int i4 = (client.ak * 1581849891) - (gxVar.dj * 81181341);
                    int i5 = (gxVar.bv * -144385472) + (717643904 * gxVar.cu);
                    int i6 = (gxVar.bv * -144385472) + (gxVar.ca * 1759040896);
                    int i7 = ((gxVar.cw * 549017216) + (gxVar.bv * -144385472)) * (i3 - i4);
                    gxVar.bg = ((i7 + (((gxVar.bv * -144385472) + (-1680259200 * gxVar.cx)) * i4)) / i3) * 1506829721;
                    gxVar.bh = (((i4 * i6) + ((i3 - i4) * i5)) / i3) * -1638712607;
                }
                gxVar.de = 0;
                gxVar.dz = gxVar.dk * 1060454559;
                gxVar.bf = gxVar.dz * -376326741;
            } else {
                dy.bq(gxVar, 1037211688);
            }
            if (gxVar.bg * 516759209 < mn.an || gxVar.bh * 2328865 < mn.an || gxVar.bg * 516759209 >= 13184 || gxVar.bh * 2328865 >= 13184) {
                gxVar.cq = 2033542925;
                gxVar.cf = 2015474731;
                gxVar.dj = 0;
                gxVar.dc = 0;
                gxVar.bg = (gxVar.bv * 962703424) + (-399324032 * gxVar.di[0]);
                gxVar.bh = (gxVar.da[0] * 698183808) + (gxVar.bv * -1948888512);
                gxVar.br(-38898407);
            }
            if (gxVar == gf.ho && (gxVar.bg * 516759209 < eu.ar || gxVar.bh * 2328865 < eu.ar || gxVar.bg * 516759209 >= 11776 || gxVar.bh * 2328865 >= 11776)) {
                gxVar.cq = 2033542925;
                gxVar.cf = 2015474731;
                gxVar.dj = 0;
                gxVar.dc = 0;
                gxVar.bg = (gxVar.di[0] * -399324032) + (gxVar.bv * 962703424);
                gxVar.bh = (gxVar.bv * -1948888512) + (gxVar.da[0] * 698183808);
                gxVar.br(-38898407);
            }
            io.cc(gxVar, (byte) -109);
            dh.co(gxVar, (byte) -49);
        } catch (Throwable e) {
            throw ba.ad(e, "lq.bj(" + ')');
        }
    }

    static boolean dz(int i) {
        try {
            return ((client.ir * 1424263497) & 8) != 0;
        } catch (Throwable e) {
            throw ba.ad(e, "lq.dz(" + ')');
        }
    }
}
