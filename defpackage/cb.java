package p000;

import java.util.Collection;

public class cb extends el {
    public static int ae;
    static int[] an;
    final boolean af;

    public cb(boolean z) {
        try {
            this.af = z;
        } catch (Throwable e) {
            throw ba.ad(e, "cb.<init>(" + ')');
        }
    }

    int ad(ez ezVar, ez ezVar2) {
        if (ezVar.ag * -1161455169 == 0 || ezVar2.ag * -1161455169 == 0) {
            return am(ezVar, ezVar2, 929285638);
        }
        return this.af ? ezVar.ar(2041862168).an(ezVar2.ar(2114260499), 2100379818) : ezVar2.ar(2132733526).an(ezVar.ar(1752841601), 1670797393);
    }

    int af(ez ezVar, ez ezVar2, short s) {
        try {
            if (ezVar.ag * -1161455169 == 0 || ezVar2.ag * -1161455169 == 0) {
                return am(ezVar, ezVar2, 849553953);
            }
            if (this.af) {
                return ezVar.ar(2039949714).an(ezVar2.ar(1975895015), 2084204588);
            }
            return ezVar2.ar(1939619169).an(ezVar.ar(2097774158), 1543369174);
        } catch (Throwable e) {
            throw ba.ad(e, "cb.af(" + ')');
        }
    }

    public int aa(Object obj, Object obj2) {
        return af((ez) obj, (ez) obj2, (short) 19198);
    }

    public int ag(Object obj, Object obj2) {
        return af((ez) obj, (ez) obj2, (short) 21277);
    }

    public int an(Object obj, Object obj2) {
        return af((ez) obj, (ez) obj2, (short) 20212);
    }

    public int compare(Object obj, Object obj2) {
        try {
            return af((ez) obj, (ez) obj2, (short) 8180);
        } catch (Throwable e) {
            throw ba.ad(e, "cb.compare(" + ')');
        }
    }

    public static fx an(kf kfVar, int i, int i2, byte b) {
        int i3 = 0;
        try {
            if (!jo.ai(kfVar, i, i2, 1101922623)) {
                return null;
            }
            fx fxVar = new fx();
            fxVar.ay = -102972929 * gl.ad;
            fxVar.as = nu.an * -820473409;
            fxVar.aa = dr.aa[0];
            fxVar.ag = gl.ag[0];
            fxVar.ad = my.ay[0];
            fxVar.an = it.as[0];
            int i4 = fxVar.an * fxVar.ad;
            byte[] bArr = gl.aj[0];
            for (int i5 = 0; i5 < le.ar.length; i5++) {
                if (le.ar[i5] != 0) {
                    int[] iArr = le.ar;
                    iArr[i5] = iArr[i5] | -16777216;
                }
            }
            fxVar.af = new int[i4];
            while (i3 < i4) {
                fxVar.af[i3] = le.ar[bArr[i3] & 255];
                i3++;
            }
            gy.ak(805967750);
            return fxVar;
        } catch (Throwable e) {
            throw ba.ad(e, "cb.an(" + ')');
        }
    }

    public static void ax(Collection collection, byte b) {
        try {
            collection.add(ax.am);
            collection.add(ax.at);
            collection.add(ax.ab);
        } catch (Throwable e) {
            throw ba.ad(e, "cb.ax(" + ')');
        }
    }

    static void bh(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        int i13 = 256 - i11;
        int i14 = -i7;
        int i15 = i4;
        int i16 = i2;
        while (i14 < 0) {
            int i17 = (i3 >> 16) * i10;
            int i18 = i16;
            i16 = i15;
            i15 = -i6;
            while (i15 < 0) {
                try {
                    int i19;
                    int i20 = iArr2[(i18 >> 16) + i17];
                    if (i20 != 0) {
                        int i21 = iArr[i16];
                        i19 = i16 + 1;
                        iArr[i16] = (((((i20 & 65280) * i11) + ((i21 & 65280) * i13)) & 16711680) + ((((16711935 & i20) * i11) + ((16711935 & i21) * i13)) & -16711936)) >> 8;
                    } else {
                        i19 = i16 + 1;
                    }
                    i15++;
                    i18 += i8;
                    i16 = i19;
                } catch (Throwable e) {
                    throw ba.ad(e, "cb.bh(" + ')');
                }
            }
            i3 += i9;
            i15 = i16 + i5;
            i14++;
            i16 = i2;
        }
    }

    static final void bl(String str, int i) {
        boolean z = true;
        try {
            boolean z2;
            if (str.equalsIgnoreCase("toggleroof")) {
                gj gjVar = cs.oj;
                if (cs.oj.an) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                gjVar.an = z2;
                co.aa(-1282338992);
                if (cs.oj.an) {
                    ax.af(99, "", "Roofs are now all hidden", 882727226);
                } else {
                    ax.af(99, "", "Roofs will only be removed selectively", 895752747);
                }
            }
            if (str.equalsIgnoreCase("displayfps")) {
                client.bb = !client.bb;
            }
            if (str.equalsIgnoreCase("suspend")) {
                ic.af((byte) -36).az(-534697703);
            }
            if (str.equalsIgnoreCase("models")) {
                if (cn.bv) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                cn.bv = z2;
            }
            if (str.equalsIgnoreCase("world")) {
                if (client.px) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                client.px = z2;
            }
            if (str.equalsIgnoreCase("ground")) {
                if (ch.an) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                ch.an = z2;
            }
            if (str.equalsIgnoreCase("minimap")) {
                if (client.pa) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                client.pa = z2;
            }
            if (str.equalsIgnoreCase("clickbox")) {
                if (cl.bs) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                cl.bs = z2;
                ax.af(99, "", "Clickbox Mode: " + (cl.bs ? "AABB" : "Legacy"), 1926239725);
            }
            if (str.equalsIgnoreCase("renderself")) {
                if (client.hh) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                client.hh = z2;
            }
            if (str.equalsIgnoreCase("mouseovertext")) {
                il ilVar = nq.ii;
                if (nq.ii.co) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                ilVar.co = z2;
            }
            if (client.jc * -2036797811 >= 2) {
                if (str.equalsIgnoreCase("showcoord")) {
                    oh ohVar = et.pz;
                    if (et.pz.co) {
                        z = false;
                    }
                    ohVar.co = z;
                }
                if (str.equalsIgnoreCase("fpson")) {
                    client.bb = true;
                }
                if (str.equalsIgnoreCase("fpsoff")) {
                    client.bb = false;
                }
                if (str.equalsIgnoreCase("gc")) {
                    System.gc();
                }
                if (str.equalsIgnoreCase("clientdrop")) {
                    nb.bg(794724824);
                }
            }
            no ad = ik.ad(nr.bl, client.dv.ag, (byte) -108);
            ad.an.an(str.length() + 1, (byte) 31);
            ad.an.aq(str, (byte) 73);
            client.dv.an(ad, (short) 255);
        } catch (Throwable e) {
            throw ba.ad(e, "cb.bl(" + ')');
        }
    }
}
