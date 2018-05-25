package p000;

public class io implements hh {
    public float aa(float f) {
        return ((float) (Math.cos(3.141592653589793d * ((double) (1.0f + f))) / 2.0d)) + 0.5f;
    }

    public float ad(float f) {
        return ((float) (Math.cos(3.141592653589793d * ((double) (1.0f + f))) / 2.0d)) + 0.5f;
    }

    public float af(float f, int i) {
        try {
            return ((float) (Math.cos(3.141592653589793d * ((double) (1.0f + f))) / 2.0d)) + 0.5f;
        } catch (Throwable e) {
            throw ba.ad(e, "io.af(" + ')');
        }
    }

    public float an(float f) {
        return ((float) (Math.cos(3.141592653589793d * ((double) (1.0f + f))) / 2.0d)) + 0.5f;
    }

    public static double af(double d, double d2, double d3) {
        double d4 = (d - d2) / d3;
        try {
            return (Math.exp((d4 * (-d4)) / 2.0d) / Math.sqrt(6.283185307179586d)) / d3;
        } catch (Throwable e) {
            throw ba.ad(e, "io.af(" + ')');
        }
    }

    public static int af(int i, int i2) {
        try {
            ag agVar = (ag) ag.ad.af((long) i);
            if (agVar == null) {
                byte[] an = ag.af.an(14, i, -1520147322);
                agVar = new ag();
                if (an != null) {
                    agVar.ad(new ik(an), (byte) -121);
                }
                ag.ad.an(agVar, (long) i);
            }
            int i3 = -345339061 * agVar.an;
            int i4 = agVar.aa * -1983699515;
            return al.af[(agVar.ag * -2000072461) - i4] & (al.an[i3] >> i4);
        } catch (Throwable e) {
            throw ba.ad(e, "io.af(" + ')');
        }
    }

    static final void cc(gx gxVar, byte b) {
        Object obj = null;
        try {
            if (gxVar.dd * 1791262809 != 0) {
                int i;
                if (gxVar.ck * -609375913 != -1) {
                    gx gxVar2 = null;
                    if (gxVar.ck * -609375913 < 32768) {
                        gxVar2 = client.ca[gxVar.ck * -609375913];
                    } else if (gxVar.ck * -609375913 >= 32768) {
                        gxVar2 = client.hb[(gxVar.ck * -609375913) - 32768];
                    }
                    if (gxVar2 != null) {
                        i = (gxVar.bg * 516759209) - (516759209 * gxVar2.bg);
                        int i2 = (2328865 * gxVar.bh) - (gxVar2.bh * 2328865);
                        if (!(i == 0 && i2 == 0)) {
                            gxVar.dz = (((int) (Math.atan2((double) i, (double) i2) * 325.949d)) & 2047) * 1453001121;
                        }
                    } else if (gxVar.cl) {
                        gxVar.ck = -1968525927;
                        gxVar.cl = false;
                    }
                }
                if (-1 != gxVar.cs * 323118731 && (761444243 * gxVar.dl == 0 || gxVar.de * -1269933949 > 0)) {
                    gxVar.dz = 981885035 * gxVar.cs;
                    gxVar.cs = -464408867;
                }
                i = ((-1058596255 * gxVar.dz) - (gxVar.bf * -626668509)) & 2047;
                if (i == 0 && gxVar.cl) {
                    gxVar.ck = -1968525927;
                    gxVar.cl = false;
                }
                if (i != 0) {
                    gxVar.dv -= 1344348901;
                    if (i > 1024) {
                        gxVar.bf -= 1811938131 * gxVar.dd;
                        if (i < gxVar.dd * 1791262809 || i > 2048 - (gxVar.dd * 1791262809)) {
                            gxVar.bf = gxVar.dz * -376326741;
                        } else {
                            int i3 = 1;
                        }
                        if (gxVar.bx * -629432309 == gxVar.cd * 259701737 && (-1845676781 * gxVar.dv > 25 || r1 != null)) {
                            if (-1 != 986301107 * gxVar.bt) {
                                gxVar.cd = gxVar.bt * -703048645;
                            } else {
                                gxVar.cd = -230807123 * gxVar.be;
                            }
                        }
                    } else {
                        gxVar.bf += 1811938131 * gxVar.dd;
                        Object obj2 = 1;
                        if (i < gxVar.dd * 1791262809 || i > 2048 - (gxVar.dd * 1791262809)) {
                            gxVar.bf = gxVar.dz * -376326741;
                            obj2 = null;
                        }
                        if (gxVar.cd * 259701737 == -629432309 * gxVar.bx && (gxVar.dv * -1845676781 > 25 || r0 != null)) {
                            if (-1 != gxVar.bu * -863692521) {
                                gxVar.cd = gxVar.bu * 78449919;
                            } else {
                                gxVar.cd = -230807123 * gxVar.be;
                            }
                        }
                    }
                    gxVar.bf = ((-626668509 * gxVar.bf) & 2047) * 1955545995;
                    return;
                }
                gxVar.dv = 0;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "io.cc(" + ')');
        }
    }
}
